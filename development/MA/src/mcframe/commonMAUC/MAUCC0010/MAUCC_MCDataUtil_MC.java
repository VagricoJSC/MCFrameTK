package mcframe.commonMAUC.MAUCC0010;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.notice.MCAppException;
import mcframe.commonCore.notice.MCException;
import mcframe.commonCore.meta.MCMeta;
import static mcframe.commonMA.notice.MA_Msg.*;

public class MAUCC_MCDataUtil_MC<E> {
	/**
	 * @deprecated su() を使ってください
	 */
	private static StringUtilSub su = new StringUtilSub();

	/**
	 * @deprecated bu() を使ってください
	 */
	private static BoolUtilSub bu = new BoolUtilSub();

	/**
	 * @deprecated nu() を使ってください
	 */
	private static NumberUtilSub nu = new NumberUtilSub();

	/**
	 * @deprecated du() を使ってください
	 */
	private static DateUtilSub du = new DateUtilSub();

	/**
	 * @deprecated tu() を使ってください
	 */
	private static TimestampUtilSub tu = new TimestampUtilSub();

	/**
	 * @deprecated cu() を使ってください
	 */
	private static ComparableUtilSub cu = new ComparableUtilSub();

	/**
	 * @deprecated ru() を使ってください
	 */
	private static RowUtilSub ru = new RowUtilSub();

	/**
	 * @deprecated dataUtil() を使ってください
	 */
	private static MAUCC_MCDataUtil dataUtil = new MAUCC_MCDataUtil();

	protected StringUtilSub su() {
		return su;
	}

	protected BoolUtilSub bu() {
		return bu;
	}

	protected NumberUtilSub nu() {
		return nu;
	}

	protected DateUtilSub du() {
		return du;
	}

	protected TimestampUtilSub tu() {
		return tu;
	}

	protected ComparableUtilSub cu() {
		return cu;
	}

	protected RowUtilSub ru() {
		return ru;
	}

	protected MAUCC_MCDataUtil<E> dataUtil() {
		return dataUtil;
	}

	/**
	 * 値がnull状態であるかどうかを判定します。<br>
	 */
	public boolean isNull(E val) {
		return val == null;
	}

	/**
	 * 値がnull状態の場合はデフォルト値をかえし、
	 * それ以外の場合は 値をかえします。
	 * 
	 * @param val 値
	 * @param defVal デフォルト値
	 * @return
	 */
	public E nvl(E val, E defVal) {
		return isNull(val) ? defVal : val;
	}

	/**
	 * 値が同一かどうかを検査します
	 * 
	 * @param val1
	 * @param val2
	 * @return
	 */
	public boolean isSame(E val1, E val2) {
		if (isNull(val1)) {
			return isNull((E) val2);
		}
		return val1.equals(val2);
	}

	/**
	 * @deprecated mcframe.serverCU.CUL0010.CUL_MCDataUtilを使ってください
	 */
	public static class StringUtilSub extends MAUCC_MCDataUtil<String> {
		/**
		 * 値がNull状態か判定します。
		 * <P>
		 * 以下の場合はNull状態とみなしtrueを返します。
		 * <li>値がnullの場合</li>
		 * <li>値が空文字列の場合</li>
		 * </P>
		 * 
		 * @param String value 評価対象の値
		 * @return boolean Null状態の場合true それ以外は false
		 */
		@Override
		public boolean isNull(String value) {
			return (value == null || value.equals(""));
		}

		/**
		 * 評価対象の値がnullの場合は、デフォルト値を返します。それ以外は、評価対象の値を返します。
		 * 
		 * @param val 評価対象の値
		 * @param defVal nullの時に使用される値
		 * @return 評価対象の値がnullの場合は、デフォルト値を返します。それ以外は、評価対象の値を返します。
		 * @see mcframe.commonCU.CUC0010.MAUCC_MCDataUtil#nvl(java.lang.Object,
		 *      java.lang.Object)
		 */
		@Override
		public String nvl(String val, String defVal) {
			return super.nvl(val, defVal);
		}

		/**
		 * val1とval2が同値であるかどうかを判定します（Null状態を加味）。
		 * 
		 * @param val1 評価対象の値
		 * @param val2 評価対象の値
		 * @return val1とval2が両方がNull状態の場合、およびval1とval2が同値の場合 true。それ以外false。
		 * @see #isNull(String)
		 */
		@Override
		public boolean isSame(String val1, String val2) {
			return super.isSame(val1, val2);
		}

		// ////////////////////////////////
		// //// String オリジナル /////////
		// ////////////////////////////////
		// 業務系の文字列チェック（ここから）
		/**
		 * 評価対象の文字列が郵便番号として妥当かどうかを判定します。
		 * <p>
		 * デフォルト実装：
		 * <li>日本式の郵便番号の場合trueとする
		 * <ul>
		 * <li>使用文字: 算用数字と - のみ</li>
		 * <li>書式は「3桁-4桁」</li>
		 * </ul>
		 * </li>
		 * </p>
		 * <p>
		 * 上記以外の仕様（例：各国の郵便番号に対応させる）にする場合はカスタマイズが必要です。
		 * </p>
		 * 
		 * @param str 評価対象の文字列
		 * @return 評価対象の文字列が郵便番号として妥当な場合true それ以外 false
		 */
		public boolean isZipCdStr(String str) {
			if (str == null) return false;
			boolean ans = false;
			ans = str.matches("^\\d{3}-\\d{4}$"); // 日本式の郵便番号
			return ans;
		}

		/**
		 * 評価対象の文字列が電話番号として妥当かどうかを判定します。
		 * <p>
		 * デフォルト実装：
		 * <li>使用文字: 算用数字と - のみ</li>
		 * <li>先頭文字と最終文字は - ではない</li>
		 * </p>
		 * <p>
		 * 上記以外の仕様にする場合はカスタマイズが必要です。
		 * </p>
		 * 
		 * @param str 評価対象の文字列
		 * @return 評価対象の文字列が電話番号として妥当な場合true それ以外 false
		 */
		public boolean isTelStr(String str) {
			if (str == null) return false;
			String delimiter = "-";

			for (int i = 0; i < str.length(); i++) {
				String sC = str.substring(i, i + 1);
				if ((i == 0 && sC.equals(delimiter))
						|| ((i == str.length() - 1 && sC.equals(delimiter)))) {
					return false;
				}
				if (!(sC.equals(delimiter) || isDigitsStr(sC))) {
					return false;
				}
			}
			return true;
		}

		/**
		 * 評価対象の文字列がFAX番号として妥当かどうかを判定します。
		 * <p>
		 * デフォルト実装：
		 * <li>使用文字: 算用数字と - のみ</li>
		 * <li>先頭文字と最終文字は - ではない</li>
		 * </p>
		 * <p>
		 * 上記以外の仕様にする場合はカスタマイズが必要です。
		 * </p>
		 * 
		 * @param str 評価対象の文字列
		 * @return 評価対象の文字列がFAX番号として妥当な場合true それ以外 false
		 */
		public boolean isFaxStr(String str) {
			return isTelStr(str);
		}

		/**
		 * 評価対象の文字列がURLとして妥当な文字列かどうかを判定します。
		 * 
		 * @param str 評価対象の文字列
		 * @return URLとして妥当な文字列な場合true それ以外 false
		 */
		public boolean isUrlStr(String str) {
			if (str == null) return false;
			// http://www.microsoft.com/japan/msdn/enterprise/pag/securityguidance/paght000001.aspx
			return str
					.matches("^(ht|f)tp(s?)\\:\\/\\/[0-9a-zA-Z]([-.\\w]*[0-9a-zA-Z])*(:(0-9)*)*(\\/?)([a-zA-Z0-9\\-\\.\\?\\,\\'\\/\\\\\\+&amp;%\\$#_]*)?$");

		}

		/**
		 * 評価対象の文字列がE-mailとして妥当な文字列かどうかを判定します。
		 * 
		 * @param str 評価対象の文字列
		 * @return E-mailとして妥当な文字列な場合true それ以外 false
		 */
		public boolean isEmailStr(String str) {
			if (str == null) return false;
			// http://www.microsoft.com/japan/msdn/enterprise/pag/securityguidance/paght000001.aspx
			return str
					.matches("^([0-9a-zA-Z]([-.\\w]*[0-9a-zA-Z])*@([0-9a-zA-Z][-\\w]*[0-9a-zA-Z]\\.)+[a-zA-Z]{2,9})$");

		}

		// 業務系の文字列チェック（ここまで）

		protected String NOT_NUMBER_STR_EX = "WL000003";

		/**
		 * 評価対象の文字列が数値を表す文字列かを判定します。
		 * 
		 * @param str 評価対象の文字列
		 * @return 評価対象の文字列が数値を表す文字列の場合true それ以外 false
		 */
		public boolean isNumberStr(String str) {
			if (str == null) return false;
			boolean ans = true;
			try {
				MCNumber.valueOf(str);
			}
			catch (MCException ex) {
				// WL000003 数値文字列が解析できませんでした。
				if (ex.getID().equals(NOT_NUMBER_STR_EX)) {
					ans = false;
				}
				else {
					throw ex;
				}
			}
			return ans;
		}

		/**
		 * 評価対象の文字列が正の数値を表す文字列かを判定します。
		 * 
		 * @param str 評価対象の文字列
		 * @return 評価対象の文字列が正の数値を表す文字列の場合true それ以外 false
		 */
		public boolean isPositiveNumberStr(String str) {
			if (str == null) return false;
			boolean ans = true;
			try {
				MCNumber num = MCNumber.valueOf(str);
				ans = num.isPositive();
			}
			catch (MCException ex) {
				// WL000003 数値文字列が解析できませんでした。
				if (ex.getID().equals(NOT_NUMBER_STR_EX)) {
					ans = false;
				}
				else {
					throw ex;
				}
			}
			return ans;
		}

		/**
		 * 評価対象の文字列が負の数値を表す文字列かを判定します。
		 * 
		 * @param str 評価対象の文字列
		 * @return 評価対象の文字列が負の数値を表す文字列の場合true それ以外 false
		 */
		public boolean isNegativeNumberStr(String str) {
			if (str == null) return false;
			boolean ans = true;
			try {
				MCNumber num = MCNumber.valueOf(str);
				ans = num.isNegative();
			}
			catch (MCException ex) {
				// WL000003 数値文字列が解析できませんでした。
				if (ex.getID().equals(NOT_NUMBER_STR_EX)) {
					ans = false;
				}
				else {
					throw ex;
				}
			}
			return ans;
		}

		/**
		 * 評価対象の文字列が半角の英数字のみで構成されているかを判定します。
		 * 
		 * @param str 評価対象の文字列
		 * @return 評価対象の文字列が全て半角の英数字のみで構成されている場合true それ以外 false
		 */
		public boolean isDigitsAlphabetStr(String str) {
			if (str == null) return false;
			return str.matches("[0-9a-zA-Z]+");
		}

		/**
		 * 評価対象の文字列が半角の英字のみで構成されているかを判定します。
		 * 
		 * @param str 評価対象の文字列
		 * @return 評価対象の文字列が全て半角の英字のみで構成されている場合true それ以外 false
		 */
		public boolean isAlphabetStr(String str) {
			if (str == null) return false;
			return str.matches("[a-zA-Z]+");
		}

		/**
		 * 評価対象の文字列が半角の数字のみで構成されているかを判定します。
		 * 
		 * @param str 評価対象の文字列
		 * @return 評価対象の文字列が全て半角の数字のみで構成されている場合true それ以外 false
		 */
		public boolean isDigitsStr(String str) {
			if (str == null) return false;
			return str.matches("[0-9]+");
		}

		/**
		 * OracleのLPAD関数相当の処理を提供します。
		 * <p>
		 * LPADを行います。 文字列[num]の左に指定した文字列[addStr]を[len]に 満たすまで挿入します。<BR>
		 * 以下の場合は、戻り値がnullになります。
		 * <li>補充するまでの桁数[len]が０以下の場合</li>
		 * <li>挿入する文字列[addStrが]Null状態の場合</li>
		 * </P>
		 * 
		 * @param num 対象の数値
		 * @param len 補充するまでの桁数（LPADを行った後のサイズを指定します。）
		 * @param addStr 挿入する文字列
		 * @return 変換後の文字列。
		 */
		public String lpad(int num, int len, String addStr) {
			return lpad(String.valueOf(num), len, addStr);
		}

		/**
		 * OracleのLPAD関数相当の処理を提供します。
		 * <p>
		 * LPADを行います。 文字列[str]の左に指定した文字列[addStr]を[len]に 満たすまで挿入します。<BR>
		 * 以下の場合は、戻り値がnullになります。
		 * <li>補充するまでの桁数[len]が０以下の場合</li>
		 * <li>挿入する文字列[addStrが]Null状態の場合</li>
		 * </P>
		 * 
		 * @param str 対象文字列
		 * @param len 補充するまでの桁数（LPADを行った後のサイズを指定します。）
		 * @param addStr 挿入する文字列
		 * @return 変換後の文字列。
		 */
		public String lpad(String str, int len, String addStr) {
			return fillString(str, LR.L, len, addStr);
		}

		/**
		 * OracleのLPAD関数相当の処理を提供します。
		 * <P>
		 * LPADを行います。 数値[num]の左に指定した文字列[addStr]を[MEMeta]に 指定されている桁数を満たすまで挿入します。<BR>
		 * 以下の場合は、戻り値がnullになります。
		 * <li>補充するまでの桁数を持つMETA[meta]がnull又は、桁数無制限の場合</li>
		 * <li>挿入する文字列[addStrが]Null状態の場合</li>
		 * </P>
		 * 
		 * @param num 対象の数値
		 * @param meta 補充するまでの桁数を持つMETA
		 * @param addStr 挿入する文字列
		 * @return 変換後の文字列。
		 */
		public String lpad(int num, MCMeta meta, String addStr) {
			return lpad(String.valueOf(num), meta, addStr);
		}

		/**
		 * OracleのLPAD関数相当の処理を提供します。
		 * <P>
		 * LPADを行います。 文字列[str]の左に指定した文字列[addStr]を[MEMeta]に 指定されている桁数を満たすまで挿入します。<BR>
		 * 以下の場合は、戻り値がnullになります。
		 * <li>補充するまでの桁数を持つMETA[meta]がnull又は、桁数無制限の場合</li>
		 * <li>挿入する文字列[addStrが]Null状態の場合</li>
		 * </P>
		 * 
		 * @param str 対象文字列
		 * @param meta 補充するまでの桁数を持つMETA
		 * @param addStr 挿入する文字列
		 * @return 変換後の文字列。
		 */
		public String lpad(String str, MCMeta meta, String addStr) {
			if (meta == null) {
				return fillString(str, LR.R, -1, addStr);
			}
			return fillString(str, LR.L, meta.length(), addStr);
		}

		/**
		 * OracleのRPAD関数相当の処理を提供します。
		 * <P>
		 * RPADを行います。 数値[num]の右に指定した文字列[addStr]を[len]に 以下の場合は、戻り値がnullになります。
		 * <li>補充するまでの桁数[len]が０以下の場合</li>
		 * <li>挿入する文字列[addStrが]Null状態の場合</li>
		 * </P>
		 * 
		 * @param num 対象の数字
		 * @param len 補充するまでの桁数（RPADを行った後のサイズを指定します。）
		 * @param addStr 挿入する文字列
		 * @return 変換後の文字列。
		 */
		public String rpad(int num, int len, String addStr) {
			return rpad(String.valueOf(num), len, addStr);
		}

		/**
		 * OracleのRPAD関数相当の処理を提供します。
		 * <P>
		 * RPADを行います。 文字列[str]の右に指定した文字列[addStr]を[len]に 以下の場合は、戻り値がnullになります。
		 * <li>補充するまでの桁数[len]が０以下の場合</li>
		 * <li>挿入する文字列[addStrが]Null状態の場合</li>
		 * </P>
		 * 
		 * @param str 対象文字列
		 * @param len 補充するまでの桁数（RPADを行った後のサイズを指定します。）
		 * @param addStr 挿入する文字列
		 * @return 変換後の文字列。
		 */
		public String rpad(String str, int len, String addStr) {
			return fillString(str, LR.R, len, addStr);
		}

		/**
		 * OracleのRPAD関数相当の処理を提供します。
		 * <P>
		 * RPADを行います。 数値[num]の右に指定した文字列[addStr]を[MEMeta]に 指定されている桁数を満たすまで挿入します。<br>
		 * 満たすまで挿入します。<br>
		 * 以下の場合は、戻り値がnullになります。
		 * <li>補充するまでの桁数を持つMETA[meta]がnull又は、桁数無制限の場合</li>
		 * <li>挿入する文字列[addStrが]Null状態の場合</li>
		 * </P>
		 * 
		 * @param int 対象の数値
		 * @param meta 補充するまでの桁数を持つMETA
		 * @param addStr 挿入する文字列
		 * @return 変換後の文字列。
		 */
		public String rpad(int num, MCMeta meta, String addStr) {
			return rpad(num, meta.length(), addStr);
		}

		/**
		 * OracleのRPAD関数相当の処理を提供します。
		 * <P>
		 * RPADを行います。 文字列[str]の右に指定した文字列[addStr]を[MEMeta]に 指定されている桁数を満たすまで挿入します。<br>
		 * 満たすまで挿入します。<br>
		 * 以下の場合は、戻り値がnullになります。
		 * <li>補充するまでの桁数を持つMETA[meta]がnull又は、桁数無制限の場合</li>
		 * <li>挿入する文字列[addStrが]Null状態の場合</li>
		 * </P>
		 * 
		 * @param str 対象文字列
		 * @param meta 補充するまでの桁数を持つMETA
		 * @param addStr 挿入する文字列
		 * @return 変換後の文字列。
		 */
		public String rpad(String str, MCMeta meta, String addStr) {
			if (meta == null) {
				return fillString(str, LR.R, -1, addStr);
			}
			return fillString(str, LR.R, meta.length(), addStr);
		}

		/**
		 * 左右（L 左(Left) / R 右(Right)）
		 */
		protected enum LR {
			L, R
		};

		/**
		 * 文字列[str]に対して、補充する文字列[addStr]を [position]の位置に[len]に満たすまで挿入します。
		 * ※[str]がnullや空リテラルの場合でも[addStr]を [len]に満たすまで挿入した結果を返します。
		 * 
		 * @param str 対象文字列
		 * @param position 前に挿入 ⇒ L 後に挿入 ⇒ R
		 * @param len 補充するまでの桁数
		 * @param addStr 挿入する文字列
		 * @return 変換後の文字列。
		 */
		protected String fillString(String str, LR position, int len, String addStr) {
			if (isNull(addStr)) {
				return null;
			}
			if (!(len > 0)) {
				return null;
			}
			String padStr = addStr;

			StringBuilder buffer = new StringBuilder(nvl(str, ""));
			while (len > buffer.length()) {
				if (LR.L == position) {
					int sum = buffer.length() + padStr.length();
					if (sum > len) {
						padStr = padStr.substring(0, padStr.length() - (sum - len));
						buffer.insert(buffer.length() - str.length(), padStr);
					}
					else {
						buffer.insert(0, padStr);
					}
				}
				else if (LR.R == position) {
					buffer.append(padStr);
				}
			}
			if (buffer.length() == len) {
				return buffer.toString();
			}
			return buffer.toString().substring(0, len);
		}
	}

	/**
	 * @deprecated mcframe.serverCU.CUL0010.CUL_MCDataUtilを使ってください
	 */
	public static class NumberUtilSub extends MAUCC_MCDataUtil<MCNumber> {
		/**
		 * ComparableUtilSubのインスタンス
		 */
		protected final ComparableUtilSub cu = new ComparableUtilSub();

		/**
		 * 値がNull状態か判定します。
		 * <P>
		 * 以下の場合はNull状態とみなしtrueを返します。
		 * <li>値がnullの場合</li>
		 * </P>
		 * 
		 * @param MCNumber value 評価対象の値
		 * @return boolean Null状態の場合true それ以外は false
		 * @see mcframe.commonCU.CUC0010.MAUCC_MCDataUtil#isNull(java.lang.Object)
		 */
		@Override
		public boolean isNull(MCNumber val) {
			return super.isNull(val);
		}

		/**
		 * 評価対象の値がnullの場合は、デフォルト値を返します。それ以外は、評価対象の値を返します。
		 * 
		 * @param val 評価対象の値
		 * @param defVal nullの時に使用される値
		 * @return 評価対象の値がnullの場合は、デフォルト値を返します。それ以外は、評価対象の値を返します。
		 * @see mcframe.commonCU.CUC0010.MAUCC_MCDataUtil#nvl(java.lang.Object,
		 *      java.lang.Object)
		 */
		@Override
		public MCNumber nvl(MCNumber val, MCNumber defVal) {
			return super.nvl(val, defVal);
		}

		/**
		 * val1とval2が同値であるかどうかを判定します（Null状態を加味）。
		 * 
		 * @param val1 評価対象の値
		 * @param val2 評価対象の値
		 * @return val1とval2が両方がNull状態の場合、およびval1とval2が同値の場合 true。それ以外false。
		 */
		@Override
		public boolean isSame(MCNumber val1, MCNumber val2) {
			if (isNull(val1)) {
				return isNull(val2);
			}
			return val1.eq(val2);
		}

		// //// MCNumber オリジナル ////////
		/**
		 * 符号反転を行うメソッド。引数がnullの場合はnullを返します。 それ以外は、MCNumber#negate()の仕様に準じます。
		 * 
		 * @param num 符号反転を行う対象の値
		 * @return num の符号を反転した値。但し、num が null の場合は null
		 * @see mcframe.commonCore.lang.MCNumber#negate()
		 */
		public MCNumber negate(MCNumber n) {
			if (n == null) {
				return null;
			}
			return n.negate();
		}

		/**
		 * 引数の合計値を計算します。引数の要素がnull及び数値以外の場合は無視します。
		 * <p>
		 * 全ての要素が無視されるとnullを返します。<br>
		 * 
		 * @param args 数値の配列
		 * @return 引数の各要素の合計値。全ての引数要素がnull及び数値以外の場合はnull
		 */
		public MCNumber sum(Comparable<?>... args) {
			MCNumber ans = null;
			for (Comparable<?> c : args) {
				if (c != null && c instanceof Number) {
					MCNumber n = cu.toMCNumber(c);
					ans = nvl(n.add(ans), n);
				}
			}
			return ans;
		}
	}

	/**
	 * @deprecated mcframe.serverCU.CUL0010.CUL_MCDataUtilを使ってください
	 */
	public static class DateUtilSub extends MAUCC_MCDataUtil<MCDate> {

		/**
		 * 値がNull状態か判定します。
		 * <P>
		 * 以下の場合はNull状態とみなしtrueを返します。
		 * <li>値がnullの場合</li>
		 * </P>
		 * 
		 * @param MCDate value 評価対象の値
		 * @return boolean Null状態の場合true それ以外は false
		 * @see mcframe.commonCU.CUC0010.MAUCC_MCDataUtil#isNull(java.lang.Object)
		 */
		@Override
		public boolean isNull(MCDate val) {
			return super.isNull(val);
		}

		/**
		 * 評価対象の値がnullの場合は、デフォルト値を返します。それ以外は、評価対象の値を返します。
		 * 
		 * @param val 評価対象の値
		 * @param defVal nullの時に使用される値
		 * @return 評価対象の値がnullの場合は、デフォルト値を返します。それ以外は、評価対象の値を返します。
		 * @see mcframe.commonCU.CUC0010.MAUCC_MCDataUtil#nvl(java.lang.Object,
		 *      java.lang.Object)
		 */
		@Override
		public MCDate nvl(MCDate val, MCDate defVal) {
			return super.nvl(val, defVal);
		}

		/**
		 * val1とval2が同値であるかどうかを判定します（Null状態を加味）。
		 * 
		 * @param val1 評価対象の値
		 * @param val2 評価対象の値
		 * @return val1とval2が両方がNull状態の場合、およびval1とval2が同値の場合 true。それ以外false。
		 * @see mcframe.commonCU.CUC0010.MAUCC_MCDataUtil#isSame(java.lang.Object,
		 *      java.lang.Object)
		 */
		@Override
		public boolean isSame(MCDate val1, MCDate val2) {
			return super.isSame(val1, val2);
		}

		// DateUtilオリジナル
		/**
		 * 年月に変換します。
		 * 
		 * @param date 変換対象の年月日
		 * @return 年月を表す MCDate
		 */
		public static MCDate toYM(MCDate date) {
			return date.startOfMonth();
		}

	}

	/**
	 * @deprecated mcframe.serverCU.CUL0010.CUL_MCDataUtilを使ってください
	 */
	public static class TimestampUtilSub extends MAUCC_MCDataUtil<MCTimestamp> {

		/**
		 * 値がNull状態か判定します。
		 * <P>
		 * 以下の場合はNull状態とみなしtrueを返します。
		 * <li>値がnullの場合</li>
		 * </P>
		 * 
		 * @param MCDate value 評価対象の値
		 * @return boolean Null状態の場合true それ以外は false
		 * @see mcframe.commonCU.CUC0010.MAUCC_MCDataUtil#isNull(java.lang.Object)
		 */
		@Override
		public boolean isNull(MCTimestamp val) {
			return super.isNull(val);
		}

		/**
		 * 評価対象の値がnullの場合は、デフォルト値を返します。それ以外は、評価対象の値を返します。
		 * 
		 * @param val 評価対象の値
		 * @param defVal nullの時に使用される値
		 * @return 評価対象の値がnullの場合は、デフォルト値を返します。それ以外は、評価対象の値を返します。
		 * @see mcframe.commonCU.CUC0010.MAUCC_MCDataUtil#nvl(java.lang.Object,
		 *      java.lang.Object)
		 */
		@Override
		public MCTimestamp nvl(MCTimestamp val, MCTimestamp defVal) {
			return super.nvl(val, defVal);
		}

		/**
		 * val1とval2が同値であるかどうかを判定します（Null状態を加味）。
		 * 
		 * @param val1 評価対象の値
		 * @param val2 評価対象の値
		 * @return val1とval2が両方がNull状態の場合、およびval1とval2が同値の場合 true。それ以外false。
		 * @see mcframe.commonCU.CUC0010.MAUCC_MCDataUtil#isSame(java.lang.Object,
		 *      java.lang.Object)
		 */
		@Override
		public boolean isSame(MCTimestamp val1, MCTimestamp val2) {
			return super.isSame(val1, val2);
		}
	}

	/**
	 * @deprecated mcframe.serverCU.CUL0010.CUL_MCDataUtilを使ってください
	 */
	public static class BoolUtilSub extends MAUCC_MCDataUtil<Boolean> {

		/**
		 * 値がNull状態か判定します。
		 * <P>
		 * 以下の場合はNull状態とみなしtrueを返します。
		 * <li>値がnullの場合</li>
		 * </P>
		 * アプリでは基本的にBooleanを使用しないため、アプリから 直接呼び出すことはない。
		 * 
		 * @param MCNumber value 評価対象の値
		 * @return boolean Null状態の場合true それ以外は false
		 */
		@Override
		public boolean isNull(Boolean val) {
			// Comparableの場合にこのメソッドが必要になる
			return super.isNull(val);
		}

		/**
		 * 評価対象の値がnullの場合は、デフォルト値を返します。それ以外は、評価対象の値を返します。
		 * 
		 * @param val 評価対象の値
		 * @param defVal nullの時に使用される値
		 * @return 評価対象の値がnullの場合は、デフォルト値を返します。それ以外は、評価対象の値を返します。
		 * @see mcframe.commonCU.CUC0010.MAUCC_MCDataUtil#nvl(java.lang.Object,
		 *      java.lang.Object)
		 */
		@Override
		public Boolean nvl(Boolean val, Boolean defVal) {
			return super.nvl(val, defVal);
		}

		/**
		 * val1とval2が同値であるかどうかを判定します（Null状態を加味）。
		 * 
		 * @param val1 評価対象の値
		 * @param val2 評価対象の値
		 * @return val1とval2が両方がNull状態の場合、およびval1とval2が同値の場合 true。それ以外false。
		 * @see mcframe.commonCU.CUC0010.MAUCC_MCDataUtil#isSame(java.lang.Object,
		 *      java.lang.Object)
		 */
		@Override
		public boolean isSame(Boolean val1, Boolean val2) {
			return super.isSame(val1, val2);
		}
	}

	/**
	 * @deprecated mcframe.serverCU.CUL0010.CUL_MCDataUtilを使ってください
	 */
	public static class RowUtilSub extends MAUCC_MCDataUtil<MCRow> {

		/**
		 * 評価対象の値がnullの場合は、デフォルト値を返します。それ以外は、評価対象の値を返します。
		 * 
		 * @param val 評価対象の値
		 * @param defVal nullの時に使用される値
		 * @return 評価対象の値がnullの場合は、デフォルト値を返します。それ以外は、評価対象の値を返します。
		 * @see mcframe.commonCU.CUC0010.MAUCC_MCDataUtil#nvl(java.lang.Object,
		 *      java.lang.Object)
		 */
		@Override
		public MCRow nvl(MCRow val, MCRow defVal) {
			return super.nvl(val, defVal);
		}

		/**
		 * val1とval2が同値であるかどうかを判定します（Null状態を加味）。
		 * 
		 * @param val1 評価対象の値
		 * @param val2 評価対象の値
		 * @return val1とval2が両方がNull状態の場合、およびval1とval2が同値の場合 true。それ以外false。
		 * @see #isNull(MCRow)
		 */
		@Override
		public boolean isSame(MCRow val1, MCRow val2) {
			return super.isSame(val1, val2);
		}

		/**
		 * 値がNull状態か判定します。
		 * 
		 * @param Comparable value 評価対象の値
		 * @return boolean Null状態の場合true それ以外は false
		 */
		@Override
		public boolean isNull(MCRow val) {
			return super.isNull(val);
		}

		// RowUtilSubオリジナル

	}

	/**
	 * @deprecated mcframe.serverCU.CUL0010.CUL_MCDataUtilを使ってください
	 */
	public static class ComparableUtilSub extends MAUCC_MCDataUtil<Comparable> {
		// ComparableUtilSub オリジナル
		/**
		 * rowの指定された列が全て同値（Null状態を加味）かどうかを判断します。
		 * 
		 * @param row1 評価対象のrow1
		 * @param row2 評価対象のrow2
		 * @param cols 値を比較するカラム名又はカラムパス
		 * @return Null状態の場合true それ以外は false
		 */
		public static <E extends MCRow> boolean isColSame(E row1, E row2, String... cols) {
			return isColSame(row1, cols, row2, cols);
		}

		/**
		 * rowの指定された列が全て同値（Null状態を加味）かどうかを判断します。
		 * 
		 * @param row1 評価対象のrow1
		 * @param cols1 値を比較するrow1のカラム名又はカラムパス
		 * @param row2 評価対象のrow2
		 * @param cols2 値を比較するrow2のカラム名又はカラムパス
		 * @return 指定されたカラムが同値の場合true それ以外は false
		 */
		public static boolean isColSame(MCRow row1, String[] cols1, MCRow row2,
				String[] cols2) {
			if (row1 == null) {
				if (row2 == null) {
					return true;
				}
				else {
					return false;
				}
			}
			else if (row2 == null) {
				return false;
			}
			for (int i = 0; i < cols1.length; i++) {
				MCDataType t = row1.getMeta(cols1[i]).type();
				switch (t) {
					case BOOLEAN:
						if (row2.getMeta(cols2[i]).type() != t) {
							return false;
						}
						if (!bu.isSame(row1.getBoolean(cols1[i]), row2
								.getBoolean(cols2[i]))) {
							return false;
						}
						break;
					case DATE:
						if (row2.getMeta(cols2[i]).type() != t) {
							return false;
						}
						if (!du.isSame(row1.getDate(cols1[i]), row2.getDate(cols2[i]))) {
							return false;
						}
						break;
					case NUMBER:
						if (row2.getMeta(cols2[i]).type() != t) {
							return false;
						}
						if (!nu
								.isSame(row1.getNumber(cols1[i]), row2
										.getNumber(cols2[i]))) {
							return false;
						}
						break;
					case STRING:
						if (row2.getMeta(cols2[i]).type() != t) {
							return false;
						}
						if (!su
								.isSame(row1.getString(cols1[i]), row2
										.getString(cols2[i]))) {
							return false;
						}
						break;
					case ROW:
						if (row2.getMeta(cols2[i]).type() != t) {
							return false;
						}
						if (!ru.isSame(row1.getInnerRow(cols1[i]), row2
								.getInnerRow(cols2[i]))) {
							return false;
						}
						break;
					case TIMESTAMP:
						if (row2.getMeta(cols2[i]).type() != t) {
							return false;
						}
						if (!tu.isSame(row1.getTimestamp(cols1[i]), row2
								.getTimestamp(cols2[i]))) {
							return false;
						}
						break;
					default:
						// インフラが新しいデータ型を増やさない限りここにはこない
				}
			}
			return true;
		}

		/**
		 * リストがNull状態か判定します。
		 * <P>
		 * 以下の場合はNull状態とみなしtrueを返します。
		 * <li>リストがnullの場合</li>
		 * <li>リストが空（empty）の場合</li>
		 * </P>
		 */
		public static boolean isNull(MCList<?> list) {
			if (list == null) {
				return true;
			}
			return list.isEmpty();
		}

		/**
		 * valに対応したMCDataUtilを返す
		 * 
		 * @param val
		 * @return
		 */
		protected MAUCC_MCDataUtil getUtil(Comparable val) {
			MAUCC_MCDataUtil<?> ans;
			if (val instanceof String) {
				ans = su();
			}
			else if (val instanceof MCNumber) {
				ans = nu();
			}
			else if (val instanceof MCDate) {
				ans = du();
			}
			else if (val instanceof MCTimestamp) {
				ans = tu();
			}
			else if (val instanceof Boolean) {
				ans = bu();
			}
			else if (val instanceof MCRow) {
				ans = ru();
			}
			else if (val == null) {
				ans = dataUtil();
			}
			else {
				throw new MCAppException(MAUCC0001, val.getClass().getName());
			}
			return ans;
		}

		/**
		 * 値がNull状態か判定します。
		 * <P>
		 * 評価対象の値の型を判断し、適切な同名のメソッドを呼び出します。<br>
		 * Comparableにbooleanがセットされた場合は、ボクシング機能でBoolean にっているので、#isNull(java.lang.Boolean)
		 * が呼び出されることに 注意してください。
		 * </P>
		 * 
		 * @param Comparable value 評価対象の値
		 * @return boolean Null状態の場合true それ以外は false
		 * @see mcframe.commonCU.CUC0010.MAUCC_MCDataUtil.StringUtilSub#isNull(java.lang.Object)
		 * @see mcframe.commonCU.CUC0010.MAUCC_MCDataUtil.NumberUtilSub#isNull(java.lang.Object)
		 * @see mcframe.commonCU.CUC0010.MAUCC_MCDataUtil.DateUtilSub#isNull(java.lang.Object)
		 * @see mcframe.commonCU.CUC0010.MAUCC_MCDataUtil.BoolUtilSub#isNull(java.lang.Object)
		 * @see mcframe.commonCU.CUC0010.MAUCC_MCDataUtil#isNull(java.lang.Object)
		 */
		@Override
		public boolean isNull(Comparable val) {
			MAUCC_MCDataUtil u = getUtil(val);
			return u.isNull(val);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see mcframe.commonCU.CUC0010.MAUCC_MCDataUtil#nvl(java.lang.Object,
		 *      java.lang.Object)
		 */
		@Override
		public Comparable nvl(Comparable val, Comparable defVal) {
			return isNull(val) ? defVal : val;
		}

		/**
		 * val1とval2が同値であるかどうかを判定します（Null状態を加味）。
		 * 
		 * @param val1 評価対象の値
		 * @param val2 評価対象の値
		 * @return val1とval2が両方がNull状態の場合(但し、同じMCDataTypeであること)、およびval1とval2が同値の場合
		 *         true。それ以外false。
		 */
		@Override
		public boolean isSame(Comparable val1, Comparable val2) {
			if (val1 == null && val2 == null) {
				return true;
			}
			if (val1 == null && val2 != null) {
				return false;
			}
			if (val1 != null && val2 == null) {
				return false;
			}
			Comparable cVal1 = toMCComparable(val1);
			Comparable cVal2 = toMCComparable(val2);
			if (cVal1.getClass().equals(cVal2.getClass())) {
				MAUCC_MCDataUtil u = getUtil(cVal1);
				return u.isSame(cVal1, cVal2);
			}
			return false;
		}

		/**
		 * ComparableをMCDataTypeで使用されているクラスへ変換する
		 * 
		 * @param c
		 * @return
		 */
		protected Comparable toMCComparable(Comparable c) {
			Comparable<?> ans = c;
			if (c instanceof Number) {
				ans = toMCNumber(c);
			}
			return ans;
		}

		/**
		 * ComprableをMCNumberに変換する
		 * 
		 * @param c
		 * @return
		 */
		protected MCNumber toMCNumber(Comparable c) {
			MCNumber ans;
			if (c instanceof MCNumber) {
				ans = (MCNumber) c;
			}
			else if (c instanceof Double) {
				ans = MCNumber.valueOf((Double) c);
			}
			else if (c instanceof Float) {
				ans = MCNumber.valueOf((Float) c);
			}
			else if (c instanceof Integer) {
				ans = MCNumber.valueOf((Integer) c);
			}
			else if (c instanceof Long) {
				ans = MCNumber.valueOf((Long) c);
			}
			else {
				// 予期せぬ数値型がセットされた
				throw new MCAppException(MAUCC0001, c.getClass().getName());
			}
			return ans;
		}
	}

}

