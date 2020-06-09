package jdk8新特性.冒号和尖头拉姆达表达式;

/**
 * @description:
 * @author: 范子祺
 **/
public class qqing {


//    public void validateBeforeDeleteClassHourCourse(Long groupSubOrderId, Collection<OrderCourse> deleteOrderCourseList) {
//        //海风课程确认
//        validatedDeleteSwitchConfirmingAndGetHfGroupOrderCourseSet(CollectionsUtil.getComposerIds(deleteOrderCourseList, OrderCourse::getGroupOrderCourseId));
//上面的可以获得public Set<Long> validatedDeleteSwitchConfirmingAndGetHfGroupOrderCourseSet(Collection<Long> groupOrderCourseIds) {


//    public Set<Long> getHfGroupOrderCourseSet(Collection<Long> groupOrderCourseIds) {
//        Map<Long, Map<GroupOrderCourseExtendType, GroupOrderCourseExtend>> groupCourseExtendMap = groupOrderCourseExtendService.findMapByGroupOrderCourseIdsAndRefTypeSet(groupOrderCourseIds, EnumSet.of(IS_HF_COURSE));
//        return groupCourseExtendMap.entrySet().stream()
//                .filter(entry -> GroupOrderCourseExtend.isHfCourse(entry.getValue()))
//                .map(Entry::getKey)
//                .collect(Collectors.toSet());
//    }


//    Collection<OrderCourse> deleteOrderCourseList
//    Set<Long> deleteOrderCourseIds = deleteOrderCourseList.stream().map(OrderCourse::getId).collect(Collectors.toSet());
//userCourseApplyList.forEach(apply -> {
//        UserCourseApplyStatus applyStatus = apply.getStatus();
//        if (deleteOrderCourseIds.contains(apply.getOrderCourseId()) && UserCourseApplyStatus.processed.equals(applyStatus)) {
//            // 校验被删课程是否已经删除成功过
//            throw new ErrorCodeException(ClassHourDeleteCourseErrorCode.some_course_had_process_apply,
//                    ClassHourDeleteCourseErrorCode.some_course_had_process_apply.getMsg() + "applyId:" + apply.getId());
//        } else if (!deleteOrderCourseIds.contains(apply.getOrderCourseId()) && UserCourseApplyStatus.succ.equals(applyStatus)) {
//            // 校验订单下其他课程是否有申请
//            throw new ErrorCodeException(ClassHourDeleteCourseErrorCode.some_course_had_deleted_or_cancel_apply,
//                    ClassHourDeleteCourseErrorCode.some_course_had_deleted_or_cancel_apply.getMsg() + "applyId:" + apply.getId());
//        }
//    });
}
