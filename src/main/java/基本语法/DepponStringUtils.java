package 基本语法;

import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @description:
 * @author: 范子祺
 **/
public class DepponStringUtils extends StringUtils {
    /**
     * <p>
     * TODO(方法详细描述说明、方法参数的具体涵义)
     * </p>
     *
     * @param str
     * @return
     * @author 252956
     * @date 2017年8月30日上午10:18:56
     */
    public static String firstToLowerCase(String str) {
        return str.replaceFirst(str.substring(0, 1), str.substring(0, 1)
                .toLowerCase());
    }

    /**
     * <p>
     * TODO(方法详细描述说明、方法参数的具体涵义)
     * </p>
     *
     * @param str
     * @return
     * @author 252956
     * @date 2017年8月30日上午10:18:51
     */
    public static String firstToUpperCase(String str) {
        return str.replaceFirst(str.substring(0, 1), str.substring(0, 1)
                .toUpperCase());
    }

    /**
     * <p>
     * TODO(方法详细描述说明、方法参数的具体涵义)
     * </p>
     *
     * @param propertyName
     * @return
     * @author 252956
     * @date 2017年8月30日上午10:18:49
     */
    public static boolean includeProperty(String propertyName) {
        if (isEmpty(propertyName)) {
            return false;
        }
        return propertyName.startsWith("${") && propertyName.endsWith("}");
    }

    /**
     * <p>
     * TODO(方法详细描述说明、方法参数的具体涵义)
     * </p>
     *
     * @param path
     * @return
     * @author 252956
     * @date 2017年8月30日上午10:18:46
     */
    public static String getFilename(String path) {
        if (path == null) {
            return null;
        }
        int separatorIndex = path.lastIndexOf(FOLDER_SEPARATOR);
        return (separatorIndex != -1 ? path.substring(separatorIndex + 1)
                : path);
    }

    /**
     * <p>
     * TODO(方法详细描述说明、方法参数的具体涵义)
     * </p>
     *
     * @param propertyName
     * @return
     * @author 252956
     * @date 2017年8月30日上午10:18:43
     */
    public static String propertyKey(String propertyName) {
        if (isEmpty(propertyName)) {
            return propertyName;
        }
        return propertyName.replace("${", "").replace("}", "");
    }

    /**
     * <p>
     * TODO(方法详细描述说明、方法参数的具体涵义)
     * </p>
     *
     * @param str
     * @return
     * @author 252956
     * @date 2017年8月30日上午10:18:40
     */
    public static boolean hasLength(CharSequence str) {
        return (str != null && str.length() > 0);
    }

    /**
     * <p>
     * TODO(方法详细描述说明、方法参数的具体涵义)
     * </p>
     *
     * @param str
     * @return
     * @author 252956
     * @date 2017年8月30日上午10:18:37
     */
    public static boolean hasLength(String str) {
        return hasLength((CharSequence) str);
    }

    /**
     * <p>
     * TODO(方法详细描述说明、方法参数的具体涵义)
     * </p>
     *
     * @param str
     * @param delimiters
     * @return
     * @author 252956
     * @date 2017年8月30日上午10:18:32
     */
    public static String[] tokenizeToStringArray(String str, String delimiters) {
        return tokenizeToStringArray(str, delimiters, true, true);
    }

    /**
     * <p>
     * TODO(方法详细描述说明、方法参数的具体涵义)
     * </p>
     *
     * @param str
     * @param delimiters
     * @param trimTokens
     * @param ignoreEmptyTokens
     * @return
     * @author 252956
     * @date 2017年8月30日上午10:18:29
     */
    public static String[] tokenizeToStringArray(String str, String delimiters,
                                                 boolean trimTokens, boolean ignoreEmptyTokens) {

        if (str == null) {
            return null;
        }
        StringTokenizer st = new StringTokenizer(str, delimiters);
        List<String> tokens = new ArrayList<String>();
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            if (trimTokens) {
                token = token.trim();
            }
            if (!ignoreEmptyTokens || token.length() > 0) {
                tokens.add(token);
            }
        }
        return toStringArray(tokens);
    }

    /**
     * <p>
     * TODO(方法详细描述说明、方法参数的具体涵义)
     * </p>
     *
     * @param collection
     * @return
     * @author 252956
     * @date 2017年8月30日上午10:18:25
     */
    public static String[] toStringArray(Collection<String> collection) {
        if (collection == null) {
            return null;
        }
        return collection.toArray(new String[collection.size()]);
    }

    /**
     * <p>
     * TODO(方法详细描述说明、方法参数的具体涵义)
     * </p>
     *
     * @param array
     * @return
     * @author 252956
     * @date 2017年8月30日上午10:18:22
     */
    public static boolean isEmpty(Object[] array) {
        return (array == null || array.length == 0);
    }

    /**
     * <p>
     * TODO(方法详细描述说明、方法参数的具体涵义)
     * </p>
     *
     * @param str
     * @return
     * @author 252956
     * @date 2017年8月30日上午10:18:19
     */
    public static boolean hasText(String str) {
        return hasText((CharSequence) str);
    }

    /**
     * <p>
     * TODO(方法详细描述说明、方法参数的具体涵义)
     * </p>
     *
     * @param str
     * @return
     * @author 252956
     * @date 2017年8月30日上午10:18:15
     */
    public static boolean hasText(CharSequence str) {
        if (!hasLength(str)) {
            return false;
        }
        int strLen = str.length();
        for (int i = 0; i < strLen; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    private static final String FOLDER_SEPARATOR = "/";

    /*
     * private static final String WINDOWS_FOLDER_SEPARATOR = "\\";
     *
     * private static final String TOP_PATH = "..";
     *
     * private static final String CURRENT_PATH = ".";
     */
    /*
     * public static String cleanPath(String path) { if (path == null) { return
     * null; } String pathToUse = replace(path, WINDOWS_FOLDER_SEPARATOR,
     * FOLDER_SEPARATOR);
     *
     * // Strip prefix from path to analyze, to not treat it as part of the //
     * first path element. This is necessary to correctly parse paths like //
     * "file:core/../core/io/Resource.class", where the ".." should just //
     * strip the first "core" directory while keeping the "file:" prefix. int
     * prefixIndex = pathToUse.indexOf(":"); String prefix = ""; if (prefixIndex
     * != -1) { prefix = pathToUse.substring(0, prefixIndex + 1); if
     * (prefix.contains("/")) { prefix = ""; } else { pathToUse =
     * pathToUse.substring(prefixIndex + 1); } } if
     * (pathToUse.startsWith(FOLDER_SEPARATOR)) { prefix = prefix +
     * FOLDER_SEPARATOR; pathToUse = pathToUse.substring(1); }
     *
     * String[] pathArray = delimitedListToStringArray(pathToUse,
     * FOLDER_SEPARATOR); List<String> pathElements = new LinkedList<String>();
     * int tops = 0;
     *
     * for (int i = pathArray.length - 1; i >= 0; i--) { String element =
     * pathArray[i]; if (CURRENT_PATH.equals(element)) { // Points to current
     * directory - drop it. } else if (TOP_PATH.equals(element)) { //
     * Registering top path found. tops++; } else { if (tops > 0) { // Merging
     * path element with element corresponding to top path. tops--; } else { //
     * Normal path element found. pathElements.add(0, element); } } }
     *
     * // Remaining top paths need to be retained. for (int i = 0; i < tops;
     * i++) { pathElements.add(0, TOP_PATH); }
     *
     * return prefix + collectionToDelimitedString(pathElements,
     * FOLDER_SEPARATOR); }
     */

    public static String[] delimitedListToStringArray(String str,
                                                      String delimiter) {
        return delimitedListToStringArray(str, delimiter, null);
    }

    /*
     * public static String collectionToDelimitedString(Collection<?> coll,
     * String delim) { return collectionToDelimitedString(coll, delim, "", "");
     * } public static String collectionToDelimitedString(Collection<?> coll,
     * String delim, String prefix, String suffix) { if
     * (CollectionUtils.isEmpty(coll)) { return ""; } StringBuilder sb = new
     * StringBuilder(); Iterator<?> it = coll.iterator(); while (it.hasNext()) {
     * sb.append(prefix).append(it.next()).append(suffix); if (it.hasNext()) {
     * sb.append(delim); } } return sb.toString(); }
     */

    /**
     * <p>
     * TODO(方法详细描述说明、方法参数的具体涵义)
     * </p>
     *
     * @param str
     * @param delimiter
     * @param charsToDelete
     * @return
     * @author 252956
     * @date 2017年8月30日上午10:18:10
     */
    public static String[] delimitedListToStringArray(String str,
                                                      String delimiter, String charsToDelete) {
        if (str == null) {
            return new String[0];
        }
        if (delimiter == null) {
            return new String[]{str};
        }
        List<String> result = new ArrayList<String>();
        if ("".equals(delimiter)) {
            for (int i = 0; i < str.length(); i++) {
                result.add(deleteAny(str.substring(i, i + 1), charsToDelete));
            }
        } else {
            int pos = 0;
            int delPos;
            while ((delPos = str.indexOf(delimiter, pos)) != -1) {
                result.add(deleteAny(str.substring(pos, delPos), charsToDelete));
                pos = delPos + delimiter.length();
            }
            if (str.length() > 0 && pos <= str.length()) {
                // Add rest of String, but not in case of empty input.
                result.add(deleteAny(str.substring(pos), charsToDelete));
            }
        }
        return toStringArray(result);
    }

    /**
     * <p>
     * TODO(方法详细描述说明、方法参数的具体涵义)
     * </p>
     *
     * @param inString
     * @param charsToDelete
     * @return
     * @author 252956
     * @date 2017年8月30日上午10:18:07
     */
    public static String deleteAny(String inString, String charsToDelete) {
        if (!hasLength(inString) || !hasLength(charsToDelete)) {
            return inString;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inString.length(); i++) {
            char c = inString.charAt(i);
            if (charsToDelete.indexOf(c) == -1) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /**
     * <p>
     * TODO(方法详细描述说明、方法参数的具体涵义)
     * </p>
     *
     * @param path
     * @param relativePath
     * @return
     * @author 252956
     * @date 2017年8月30日上午10:18:04
     */
    public static String applyRelativePath(String path, String relativePath) {
        int separatorIndex = path.lastIndexOf(FOLDER_SEPARATOR);
        if (separatorIndex != -1) {
            String newPath = path.substring(0, separatorIndex);
            if (!relativePath.startsWith(FOLDER_SEPARATOR)) {
                newPath += FOLDER_SEPARATOR;
            }
            return newPath + relativePath;
        } else {
            return relativePath;
        }
    }

    /**
     * 对html标签进行转换
     *
     * @param <T>
     * @param txt
     * @return
     */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static <T> void toTextForHtml(Collection<T> txt) {
        List list = new ArrayList();
        if (txt != null) {
            for (Iterator iterator = txt.iterator(); iterator.hasNext(); ) {
                Object object = (Object) iterator.next();
                toTextForHtml(object.toString());
                list.add(object);
            }
            txt = list;
        }
    }

    /**
     * 对html标签进行转换
     *
     * @param txt
     * @return
     */
    public static String toTextForHtml(String txt) {
        if (null == txt) {
            return "";
        }
        txt = txt.replaceAll("&", "&amp;");
        txt = txt.replaceAll("<", "&lt;");
        txt = txt.replaceAll(">", "&gt;");
        txt = txt.replaceAll("\"", "&quot;");
        txt = txt.replaceAll("'", "&#146;");
        return txt;
    }
}
