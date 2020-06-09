//package 基本语法;
//
//import org.apache.commons.lang3.StringUtils;
//import org.springframework.util.StringUtils;
//
//import java.io.Serializable;
//import java.lang.reflect.Field;
//import java.lang.reflect.Method;
//import java.lang.reflect.ParameterizedType;
//import java.lang.reflect.Type;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @description:
// * @author: 范子祺
// **/
//public class BeanUtil implements Serializable {
//    /**
//     *
//     */
//    private static final long serialVersionUID = -7296292510912148429L;
//
//    /**
//     * 基本类型、包装类型、String类型、date
//     */
//    private static final String[] TYPES = {"java.lang.Integer",
//            "java.lang.Double", "java.lang.Float", "java.lang.Long",
//            "java.lang.Short", "java.lang.Byte", "java.lang.Boolean",
//            "java.lang.Character", "java.lang.String", "java.math.BigDecimal",
//            "java.util.Date", "int", "double", "long", "short", "byte",
//            "boolean", "char", "float"};
//
//    /**
//     * <p>
//     * TODO(方法详细描述说明、方法参数的具体涵义)isNull
//     * </p>
//     *
//     * @param object
//     * @return
//     * @author 252956
//     * @date 2017年8月30日上午10:13:48
//     */
//    public static boolean isNull(Object object) {
//        return object == null ? true : false;
//    }
//
//    /**
//     * <p>
//     * TODO(方法详细描述说明、方法参数的具体涵义)isEmpty
//     * </p>
//     *
//     * @param list
//     * @return
//     * @author 252956
//     * @date 2017年8月30日上午10:13:50
//     */
//    public static boolean isEmpty(List<?> list) {
//        return isNull(list) || list.isEmpty();
//    }
//
//    /**
//     * <p>
//     * TODO(方法详细描述说明、方法参数的具体涵义)isEmpty
//     * </p>
//     *
//     * @param list
//     * @return
//     * @author 252956
//     * @date 2017年8月30日上午10:13:50
//     */
//    public static boolean isEmpty(Object[] array) {
//        if (isNull(array) || array.length < 1)
//            return true;
//
//        return false;
//    }
//
//    /**
//     * <p>
//     * TODO将sourc对象属性转换为target【属性字段支持普通java类型字段、 实体对象 、list集合】
//     * </p>
//     *
//     * @param source
//     * @param target
//     */
//    @SuppressWarnings({"rawtypes", "unchecked"})
//    public static void copyObject(Object source, Object target) {
//        if (source == null || target == null) {
//            return;
//        }
//        Class<?> targetClass = target.getClass();
//        Class<?> sourceClass = source.getClass();
//        for (Field field : targetClass.getDeclaredFields()) {
//            String name = field.getName().substring(0, 1).toUpperCase()
//                    + field.getName().substring(1);
//            String getMethodName = "get" + name;
//            String setMethodName = "set" + name;
//            try {
//                Method getMethod = sourceClass.getMethod(getMethodName,
//                        new Class[]{});
//                Method setMethod = targetClass.getMethod(setMethodName,
//                        new Class[]{field.getType()});
//                Object value = getMethod.invoke(source, new Object[]{});
//                // 判断是否是能转换的数据类型【常用数据类型】
//                if (commonDataTypes(field.getType())) {
//                    setMethod.invoke(target, new Object[]{value});
//                    // list 类型
//                } else if (List.class.isAssignableFrom(field.getType())) {
//                    List list = new ArrayList();
//                    for (Object valueOfLst : (ArrayList) value) {
//                        Type type = field.getGenericType();
//                        if (!(type instanceof ParameterizedType)) {
//                            continue;
//                        }
//                        Class tmpClass = (Class) ((ParameterizedType) type)
//                                .getActualTypeArguments()[0];
//                        Object tmp = tmpClass.newInstance();
//                        copyObject(valueOfLst, tmp);
//                        list.add(tmp);
//                    }
//                    setMethod.invoke(target, new Object[]{list});
//                } else {
//                    Object tmp = field.getType().newInstance();
//                    copyObject(value, tmp);
//                    setMethod.invoke(target, new Object[]{tmp});
//                }
//            } catch (Exception e) {
//                continue;
//            }
//        }
//    }
//
//    /**
//     * <p>
//     * TODO(方法详细描述说明、方法参数的具体涵义)commonDataTypes
//     * </p>
//     *
//     * @param fieldType
//     * @return
//     * @author 252956
//     * @date 2017年8月30日上午10:14:04
//     */
//    private static boolean commonDataTypes(Class<?> fieldType) {
//        for (int i = 0; i < TYPES.length; i++) {
////			if (TYPES[i].equals(fieldType.getName())) {
//            String type = fieldType.getName();
//            String typessub = TYPES[i];
//            if (type.equals(typessub)) {
//                return true;
//            }
//        }
//        return false;
//
//    }
//
//    /**
//     * <p>
//     * TODO将fromObject对象属性值copy到targetClazz对象属性值【不支持对象里面存在集合、实例对象copy；只支持单个属性字段，
//     * 字段名一致，字段类型可以不一致】
//     * </p>
//     */
//    public static <T> T copyAttributes(Class<T> targetClazz, Object fromObject) {
//        T object = null;
//        if (fromObject == null) {
//            return object;
//        }
//
//        try {
//            object = targetClazz.newInstance();
//            Class<?> fromType = fromObject.getClass();
//            for (Field field : getFields(targetClazz)) {
//                String name = field.getName().substring(0, 1).toUpperCase() + field.getName().substring(1);
//                String getMethodName = "get" + name;
//                String setMethodName = "set" + name;
//                try {
//                    Method getMethod = fromType.getMethod(getMethodName, new Class[]{});
//                    Method setMethod = targetClazz.getMethod(setMethodName, new Class[]{field.getType()});
//                    Object value = getMethod.invoke(fromObject, new Object[]{});
//                    if (value != null)
//                        setMethod.invoke(object, new Object[]{value});
//                } catch (Exception e) {
//                    continue;
//                }
//            }
//        } catch (Exception e) {
//            return object;
//        }
//        return object;
//    }
//
//    /**
//     * <p>
//     * TODO(方法详细描述说明、方法参数的具体涵义)getFields
//     * </p>
//     *
//     * @param targetClazz
//     * @return
//     * @author 252956
//     * @date 2017年8月30日上午10:14:12
//     */
//    private static <T> List<Field> getFields(Class<T> targetClazz) {
//        List<Field> list = new ArrayList<>();
//        for (Field field : targetClazz.getDeclaredFields()) {
//            list.add(field);
//        }
//        getSuperFields(list, targetClazz.getSuperclass());
//        return list;
//    }
//
//    /**
//     * <p>
//     * TODO(方法详细描述说明、方法参数的具体涵义)getSuperFields
//     * </p>
//     *
//     * @param list
//     * @param targetClazz
//     * @author 252956
//     * @date 2017年8月30日上午10:14:18
//     */
//    @SuppressWarnings("rawtypes")
//    private static void getSuperFields(List<Field> list, Class targetClazz) {
//        for (Field field : targetClazz.getDeclaredFields()) {
//            list.add(field);
//        }
//        if (targetClazz.getSuperclass() != null) {
//            String objs = "java.lang.Object";
//            String targetName = targetClazz.getSuperclass().getName();
//            if (!objs.equals(targetName)) {
//                getSuperFields(list, targetClazz.getSuperclass());
//            }
//        }
//    }
//
//    /**
//     * <p>
//     * TODO(方法详细描述说明、方法参数的具体涵义)copyListEntAttributes
//     * </p>
//     *
//     * @param targetClazz
//     * @param fromList
//     * @return
//     * @author 252956
//     * @date 2017年8月30日上午10:14:24
//     */
//    public static <T> List<T> copyListEntAttributes(Class<T> targetClazz, List<?> fromList) {
//        List<T> list = new ArrayList<T>();
//        if (isEmpty(fromList)) {
//            return list;
//        }
//        for (Object fromObject : fromList) {
//            T object = copyAttributes(targetClazz, fromObject);
//            list.add(object);
//        }
//        return list;
//    }
//
//    /**
//     * 相同list合并
//     *
//     * @param list1
//     * @param list2
//     * @param lists
//     * @return
//     */
//    @SuppressWarnings({"rawtypes", "unchecked"})
//    public static List addList(List<?> list, List<?>... lists) {
//        List listAll = new ArrayList();
//        if (!isEmpty(list))
//            listAll.addAll(list);
//        if (lists == null || lists.length == 0) {
//            return listAll;
//        }
//        for (List list_ : lists) {
//            if (!isEmpty(list_)) {
//                listAll.addAll(list_);
//            }
//        }
//        return listAll;
//    }
//
//    /**
//     * <p>
//     * TODO将source对象属性值copy到target对象属性值【不支持对象里面存在集合、实例对象copy；只支持单个属性字段，字段名、
//     * 字段类型要一致】
//     * </p>
//     */
//    public static void copyProperties(Object source, Object target, boolean nullValueCopy) {
//        Method[] methods = source.getClass().getMethods();
//        for (Method method : methods) {
//            if (!method.getName().startsWith("get"))
//                continue;
//            try {
//                Object value = method.invoke(source, new Object[0]);
//                if ((value == null) && (!nullValueCopy)) {
//                    continue;
//                }
//                String setMethodName = method.getName().replaceFirst("get", "set");
//                Method setMethod = target.getClass().getMethod(setMethodName, new Class[]{method.getReturnType()});
//                setMethod.invoke(target, new Object[]{value});
//            } catch (Exception e) {
//                continue;
//            }
//        }
//    }
//
//    /**
//     * <p>
//     * TODO将source对象属性值copy到target对象属性值【不支持对象里面存在集合、实例对象copy；只支持单个属性字段，字段名、
//     * 字段类型要一致】
//     * </p>
//     */
//    public static void copyProperties(Object source, Object target) {
//        copyProperties(source, target, true);
//    }
//
//    /**
//     * <p>
//     * TODO(方法详细描述说明、方法参数的具体涵义)getPropertyValue
//     * </p>
//     *
//     * @param beanObj
//     * @param property
//     * @return
//     * @author 252956
//     * @date 2017年8月30日上午10:14:33
//     * @author 姚亚楠  - sonar修改阻断
//     * @date 2018年4月5日上午9:53:51
//     */
//    public static Object getPropertyValue(Object beanObj, String property) {
//        try {
//            if (beanObj != null && !beanObj.equals("") && property != null && !property.equals("")) {
//                int index = property.indexOf('.');
//                if (index > -1) {
//                    Object subObj = getPropertyValue(beanObj, property.substring(0, index));
//                    if (subObj != null && !subObj.equals(""))
//                        return getPropertyValue(subObj, property.substring(index + 1));
//                }
//                String methodName = "get" + Character.toUpperCase(property.charAt(0)) + property.substring(1);
//                Method method = beanObj.getClass().getMethod(methodName, new Class[0]);
//                Object value = method.invoke(beanObj, new Object[0]);
//                return value;
//            }
//        } catch (Exception e) {
//            LoggerUtil.debug(e.getMessage());
//        }
//        return null;
//    }
//
//    /**
//     * <p>
//     * TODO(方法详细描述说明、方法参数的具体涵义)setPropertyValue
//     * </p>
//     *
//     * @param beanObj
//     * @param property
//     * @param value
//     * @author 252956
//     * @date 2017年8月30日上午10:14:39
//     */
//    public static void setPropertyValue(Object beanObj, String property, Object value) {
//        try {
//            if (beanObj != null && !beanObj.equals("") && property != null && !property.equals("")
//                    && value != null && !value.equals("")) {
//                int index = property.lastIndexOf('.');
//                if (index > -1) {
//                    beanObj = getPropertyValue(beanObj, property.substring(0, index));
//                    property = property.substring(index + 1);
//                }
//                String methodName = "set" + Character.toUpperCase(property.charAt(0)) + property.substring(1);
//                Method setMethod = null;
//                if (beanObj != null && !beanObj.equals("")) {
//                    Method[] methods = beanObj.getClass().getMethods();
//                    for (Method method : methods) {
//                        if (method.getName().equals(methodName)) {
//                            setMethod = method;
//                            break;
//                        }
//                    }
//                }
//                if (setMethod != null) {
//                    setMethod.invoke(beanObj, new Object[]{value});
//                }
//            }
//        } catch (Exception e) {
//            LoggerUtil.debug(e.getMessage());
//        }
//    }
//
//    // public static void main(String[] args) {
//    // User user = new User();
//    // user.setId(132);
//    // Company company = new Company();
//    // company.setName("334343");
//    // user.setCompany(company);
//    // user.setEmail("12345");
//    // List<Role> roles = new ArrayList<Role>();
//    // user.setRoles(roles);
//    //
//    // CProcessDefinitionEntity user2 = (CProcessDefinitionEntity)
//    // copyAttributes(CProcessDefinitionEntity.class, user);
//    // // System.out.println(user2.getId());
//    // // System.out.println(user2.getCompany().getName());
//    // // System.out.println(user2.getEmail());
//    // // System.out.println(user2.getRoles());
//    // }
//
//    /**
//     * 判断对象中属性值是否全为空
//     *
//     * @param object
//     * @return
//     */
//    public static boolean checkObjAllFieldsIsNull(Object object) {
//        if (null == object) {
//            return true;
//        }
//        try {
//            for (Field f : object.getClass().getDeclaredFields()) {
//                f.setAccessible(true);
//                if (f.get(object) != null && StringUtils.isNotBlank(f.get(object).toString())) {
//                    return false;
//                }
//
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return true;
//    }
//
//    /**
//     * 判断对象中属性值是否全不为空
//     *
//     * @param object
//     * @return
//     */
//    public static boolean checkObjAllFieldsIsNotNull(Object object) {
//        if (null == object) {
//            return false;
//        }
//        try {
//            for (Field f : object.getClass().getDeclaredFields()) {
//                f.setAccessible(true);
//                if (f.get(object) == null || StringUtils.isBlank(f.get(object).toString())) {
//                    return false;
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            return false;
//        }
//
//        return true;
//    }
//}
