package mcframe.clientMAUC.MAUCP0010;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import mcframe.clientCore.beans.action.*;
import mcframe.clientCore.beans.combobox.*;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.event.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.beans.tree.*;
import mcframe.clientCore.container.MCConstRow;


import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientCore.beans.text.MCCalendarFormat;
import mcframe.commonCore.meta.MCMeta;
import mcframe.clientCore.resource.MCConst;
import mcframe.clientCore.sys.MCSys;
import mcframe.clientMAUD.MAUDP0010.IfMAUDP_PanelBase;
import mcframe.commonCore.resource.MCLocaleConst;
import java.math.RoundingMode;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUCP_MCDataUtil"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUCP_MCDataUtil_MC extends MAUCP_MCDataUtil_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	/**
	 * static メソッドのアクセス用フィールド
	 */
	protected static MAUCP_MCDataUtil _util = new MAUCP_MCDataUtil();
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUCP_MCDataUtil_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START
	/**
	 * ＮＵＬＬ代替文字を null に変換します。<br>
	 * ＮＵＬＬ代替文字以外を指定した場合は、指定された文字列をそのまま返す。
	 * 
	 * @param 文字列
	 * @return 変換後の文字列
	 */
	public static String nullValToNull(String val) {
		return _util._nullValToNull(val);
	}

	/**
	 * ＮＵＬＬ代替文字を null に変換します。<br>
	 * ＮＵＬＬ代替文字以外を指定した場合は、指定された文字列をそのまま返す。
	 * 
	 * @param 文字列
	 * @return 変換後の文字列
	 */
	protected String _nullValToNull(String val) {
		return MAC_STR.isNULL_VAL(val) ? null : val;
	}

	/**
	 * ＮＵＬＬ代替文字またはＮＵＬＬ代替日付を null に変換します。
	 * 
	 * @param row 変換対象のデータを保持しているコンテナ
	 * @param cols 変換対象のカラム名
	 */
	public static void nullValToNull(MCRow row, String... cols) {
		_util._nullValToNull(row, cols);
	}

	/**
	 * ＮＵＬＬ代替文字またはＮＵＬＬ代替日付を null に変換します。
	 * 
	 * @param row 変換対象のデータを保持しているコンテナ
	 * @param cols 変換対象のカラム名
	 */
	protected void _nullValToNull(MCRow row, String... cols) {
		if (cols == null || cols.length == 0) {
			return;
		}
		for (String col : cols) {
			_nullValToNull(row, col);
		}
	}

	/**
	 * ＮＵＬＬ代替文字またはＮＵＬＬ代替日付を null に変換します。
	 * 
	 * @param row 変換対象のデータを保持しているコンテナ
	 * @param cols 変換対象のカラム名
	 */
	protected void _nullValToNull(MCRow row, String col) {
		if (row == null || isNull(col)) {
			return;
		}
		MCMeta meta = row.getMeta(col);
		if (meta != null) {
			MCDataType typ = meta.type();
			if (MCDataType.STRING == typ) {
				if (MAC_STR.isNULL_VAL(row.getString(col))) {
					row.setString(col, null);
				}
			}
			else if (MCDataType.DATE == typ) {
				if (MAC_Y4M.isNULL_VAL(row.getDate(col))) {
					row.setDate(col, null);
				}
			}
		}
	}

	/**
	 * ＮＵＬＬ代替文字またはＮＵＬＬ代替日付を null に変換します。
	 * 
	 * @param row 変換対象のデータを保持しているコンテナ
	 * @param cols 変換対象のカラム名
	 */
	public static void nullValToNull(MCList<? extends MCRow> list, String... cols) {
		_util._nullValToNull(list, cols);
	}

	/**
	 * ＮＵＬＬ代替文字またはＮＵＬＬ代替日付を null に変換します。
	 * 
	 * @param row 変換対象のデータを保持しているコンテナ
	 * @param cols 変換対象のカラム名
	 */
	protected void _nullValToNull(MCList<? extends MCRow> list, String... cols) {
		if (cols == null || cols.length == 0 || list == null
				|| list.size() == 0) {
			return;
		}
		for (String col : cols) {
			for (MCRow row : list) {
				_nullValToNull(row, col);
			}
		}
	}

	/**
	 * 引数の文字列がnullまたはＮＵＬＬ代替文字のときtrueを返します。
	 * 
	 * @param val チェック対象文字列
	 */
	public static boolean isNullOrNullVal(String val) {
		return _util._isNullOrNullVal(val);
	}
	protected boolean _isNullOrNullVal(String val) {
		return isNull(val) || MAC_STR.isNULL_VAL(val);
	}

	/**
	 * ASCII文字しか使用できない項目のチェックに使用するメソッド。
	 * <P>
	 * 具体的には、codePoint 32 から 126 まで（32 及び 126を含む）からなる
	 * 文字列（ASCII文字の一般的な定義では、 制御文字（codePoint 0 から 31 及び 127）
	 * もASCII文字だがここでは、項目の値をチェックするのが目的であるため、
	 * それの使用は認めない。
	 * </P>
	 * 
	 * @param str 文字列
	 * @return 引数が null 又は ASCII文字以外が含まれている場合false。それ以外true。
	 */
	public static boolean isASCII(String str) {
		return _util._isASCII(str);
	}

	/**
	 * ASCII文字しか使用できない項目のチェックに使用するメソッド。
	 * <P>
	 * 具体的には、codePoint 32 から 126 まで（32 及び 126を含む）からなる
	 * 文字列（ASCII文字の一般的な定義では、 制御文字（codePoint 0 から 31 及び 127）
	 * もASCII文字だがここでは、項目の値をチェックするのが目的であるため、
	 * それの使用は認めない。
	 * </P>
	 * 
	 * @param str 文字列
	 * @return 引数が null 又は ASCII文字以外が含まれている場合false。それ以外true。
	 */
	protected boolean _isASCII(String str) {
		if (str == null) {
			return false;
		}
		char[] a = str.toCharArray();
		for (int i = 0; i < a.length; i++) {
			int p = Character.codePointAt(a, i);
			if (p < 32 || 126 < p) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 基準単位から基準単位以外の単位へ単位変換します。
	 * 
	 * @param qty 基準単位数量
	 * @param toDmnQty 変換先単位の品目単位マスタの基準数
	 * @param toConvQty 変換先単位の品目単位マスタの単位換算数
	 * @param toDecPlace  変換先単位の品目単位マスタの小数部有効桁数
	 * @param toUnitConvRndTyp 変換先単位の品目単位マスタの単位換算端数処理区分
	 * @return 変換した数量
	 */
	public static MCNumber rvrsBaseUnitConv(MCNumber qty, MCNumber toDmnQty, MCNumber toConvQty,
			MCNumber toDecPlace, String toUnitConvRndTyp) {
		return _util._rvrsBaseUnitConv(qty, toDmnQty, toConvQty, toDecPlace,
				toUnitConvRndTyp, false);
	}
 
	/**
	 * 基準単位から基準単位以外の単位へ単位変換します。
	 * 
	 * @param qty 基準単位数量
	 * @param toDmnQty 変換先単位の品目単位マスタの基準数
	 * @param toConvQty 変換先単位の品目単位マスタの単位換算数
	 * @param toDecPlace  変換先単位の品目単位マスタの小数部有効桁数
	 * @param toUnitConvRndTyp 変換先単位の品目単位マスタの単位換算端数処理区分
	 * @param remFlg 基準単位以外の単位へ単位換算する際に、端数が生じたらnullを返すかのフラグ
	 * @return 変換した数量
	 */
	public static MCNumber rvrsBaseUnitConv(MCNumber qty, MCNumber toDmnQty, MCNumber toConvQty,
			MCNumber toDecPlace, String toUnitConvRndTyp, boolean remFlg) {
		return _util._rvrsBaseUnitConv(qty, toDmnQty, toConvQty, toDecPlace,
				toUnitConvRndTyp, remFlg);
	}
	
	/**
	 * 基準単位から基準単位以外の単位へ単位変換します。
	 * 
	 * @param qty 基準単位数量
	 * @param toDmnQty 変換先単位の品目単位マスタの基準数
	 * @param toConvQty 変換先単位の品目単位マスタの単位換算数
	 * @param toDecPlace  変換先単位の品目単位マスタの小数部有効桁数
	 * @param toUnitConvRndTyp 変換先単位の品目単位マスタの単位換算端数処理区分
	 * @param remFlg 基準単位以外の単位へ単位換算する際に、端数が生じたらnullを返すかのフラグ
	 * @return 変換した数量
	 */
	protected MCNumber _rvrsBaseUnitConv(MCNumber qty, MCNumber toDmnQty, MCNumber toConvQty,
			MCNumber toDecPlace, String toUnitConvRndTyp, boolean remFlg) {
		if (isNullOr(qty, toDmnQty)) {
			return null;
		}
		if (!isNull(toConvQty)) {
			if (qty.isZero() || toDmnQty.isZero() || toConvQty.isZero()) {
				return MCNumber.ZERO;
			}
			if (remFlg) {
				MCNumber ans = MCNumber.ZERO;
				//換算を行い端数が生じたらnullを返す（換算結果の少数点桁数と変換先単位の品目単位マスタの小数部有効桁数を比較する）
				try {
					ans = qty.multiply(toDmnQty).divide(toConvQty);
				}
				catch (MCException e) {
					if (isSame(e.getID(), "FCBFC0006") || isSame(e.getID(), "FCBFC0005")) {
						return null;
					}
					else {
						throw e;
					}
				}
				if (!isNull(toDecPlace) && ans.neq(ans.setScale(toDecPlace.intValue(), RoundingMode.DOWN))) {
					return null;
				}
			}
			if (!isNull(toDecPlace) && MAC_RND_TYP.contains(toUnitConvRndTyp)) {
				return qty.multiply(toDmnQty).divide(toConvQty, toDecPlace.intValue(), MAC_RND_TYP
						.toMC(toUnitConvRndTyp));
			}
		}

		MCMessage msg = new MCMessage(MAUCP0036);
		msg.addBind(qty, toConvQty);
		msg.addBind(toDecPlace != null ? toDecPlace.intValue() : null);
		msg.addBind(toUnitConvRndTyp);
		MCLog.write(msg);

		return null;
	}
	
	/**
	 * 基準単位以外の単位から、別の基準単位以外の単位へ変換します。
	 * 
	 * @param num 数量
	 * @param frDmnQty 変換元単位の品目単位マスタの基準数
	 * @param frConvQty 変換元単位の品目単位マスタの単位換算数
	 * @param baseUnitDecPlace  基準単位の小数部有効桁数
	 * @param baseUnitConvRndTyp 基準単位の単位換算端数処理区分
	 * @param toDmnQty 変換先単位の品目単位マスタの基準数
	 * @param toConvQty 変換先単位の品目単位マスタの単位換算数
	 * @param toDecPlace  変換先単位の品目単位マスタの小数部有効桁数
	 * @param toUnitConvRndTyp 変換先単位の品目単位マスタの単位換算端数処理区分
	 * @return 変換した数量
	 */
	public static MCNumber unitConv(MCNumber num,
			MCNumber frDmnQty, MCNumber frConvQty, MCNumber baseUnitDecPlace, String baseUnitConvRndTyp, 
			MCNumber toDmnQty, MCNumber toConvQty, MCNumber toDecPlace, String toUnitConvRndTyp) {
		return _util._unitConv(num, frDmnQty, frConvQty, baseUnitDecPlace, baseUnitConvRndTyp,
				toDmnQty, toConvQty, toDecPlace, toUnitConvRndTyp, false);
	}
	
	/**
	 * 基準単位以外の単位から、別の基準単位以外の単位へ変換します。
	 * 
	 * @param num 数量
	 * @param frDmnQty 変換元単位の品目単位マスタの基準数
	 * @param frConvQty 変換元単位の品目単位マスタの単位換算数
	 * @param baseUnitDecPlace  基準単位の小数部有効桁数
	 * @param baseUnitConvRndTyp 基準単位の単位換算端数処理区分
	 * @param toDmnQty 変換先単位の品目単位マスタの基準数
	 * @param toConvQty 変換先単位の品目単位マスタの単位換算数
	 * @param toDecPlace  変換先単位の品目単位マスタの小数部有効桁数
	 * @param toUnitConvRndTyp 変換先単位の品目単位マスタの単位換算端数処理区分
	 * @param remFlg 別の基準単位以外の単位へ単位換算する際に、端数が生じたらnullを返すかのフラグ
	 * @return 変換した数量
	 */
	public static MCNumber unitConv(MCNumber num,
			MCNumber frDmnQty, MCNumber frConvQty, MCNumber baseUnitDecPlace, String baseUnitConvRndTyp, 
			MCNumber toDmnQty, MCNumber toConvQty, MCNumber toDecPlace, String toUnitConvRndTyp, boolean remFlg) {
		return _util._unitConv(num, frDmnQty, frConvQty, baseUnitDecPlace, baseUnitConvRndTyp,
				toDmnQty, toConvQty, toDecPlace, toUnitConvRndTyp, remFlg);
	}

	/**
	 * 基準単位以外の単位から、別の基準単位以外の単位へ変換します。
	 * 
	 * @param num 数量
	 * @param frDmnQty 変換元単位の品目単位マスタの基準数
	 * @param frConvQty 変換元単位の品目単位マスタの単位換算数
	 * @param baseUnitDecPlace  基準単位の小数部有効桁数
	 * @param baseUnitConvRndTyp 基準単位の単位換算端数処理区分
	 * @param toDmnQty 変換先単位の品目単位マスタの基準数
	 * @param toConvQty 変換先単位の品目単位マスタの単位換算数
	 * @param toDecPlace  変換先単位の品目単位マスタの小数部有効桁数
	 * @param toUnitConvRndTyp 変換先単位の品目単位マスタの単位換算端数処理区分
	 * @param remFlg 別の基準単位以外の単位へ単位換算する際に、端数が生じたらnullを返すかのフラグ
	 * @return 変換した数量
	 */
	protected MCNumber _unitConv(MCNumber num,
			MCNumber frDmnQty, MCNumber frConvQty, MCNumber baseUnitDecPlace, String baseUnitConvRndTyp, 
			MCNumber toDmnQty, MCNumber toConvQty, MCNumber toDecPlace, String toUnitConvRndTyp, boolean remFlg) {

		if (isNullOr(num, frDmnQty, toDmnQty) || frDmnQty.isZero() || toDmnQty.isZero()) {
			return null;
		}

		if (!isNullOr(frConvQty, toConvQty)) {
			if (num.isZero() || frConvQty.isZero() || toConvQty.isZero()) {
				return MCNumber.ZERO;
			}
			if (!isNull(baseUnitDecPlace) && MAC_RND_TYP.contains(baseUnitConvRndTyp)
					&& !isNull(toDecPlace) && MAC_RND_TYP.contains(toUnitConvRndTyp)) {
				MCNumber base = _convToBaseUnit(num, frDmnQty, frConvQty, baseUnitDecPlace, baseUnitConvRndTyp, remFlg);
				return _rvrsBaseUnitConv(base, toDmnQty, toConvQty, toDecPlace, toUnitConvRndTyp,remFlg);
			}
		}

		MCMessage msg = new MCMessage(MAUCP0037);
		msg.addBind(num, frConvQty, toConvQty);
		msg.addBind(toDecPlace != null ? toDecPlace.intValue() : null);
		msg.addBind(toUnitConvRndTyp);
		MCLog.write(msg);

		return null;
	}

	/**
	 * 基準単位以外の単位から基準単位へ単位変換します。
	 * 
	 * @param num 数量
	 * @param unitDmnQty 変換元単位の基準数
	 * @param unitConvQty 変換元単位の単位換算数
	 * @param baseUnitDecPlace 基準単位の小数部有効桁数
	 * @param baseUnitConvRndTyp 基準単位の単位換算端数処理区分
	 * @return 基準単位数量
	 */
	public static MCNumber convToBaseUnit(MCNumber num, MCNumber unitDmnQty, MCNumber unitConvQty,
			MCNumber baseUnitDecPlace, String baseUnitConvRndTyp) {
		return _util._convToBaseUnit(num, unitDmnQty, unitConvQty, baseUnitDecPlace,
				baseUnitConvRndTyp, false);
	}
	
	/**
	 * 基準単位以外の単位から基準単位へ単位変換します。
	 * 
	 * @param num 数量
	 * @param unitDmnQty 変換元単位の基準数
	 * @param unitConvQty 変換元単位の単位換算数
	 * @param baseUnitDecPlace 基準単位の小数部有効桁数
	 * @param baseUnitConvRndTyp 基準単位の単位換算端数処理区分
	 * @param remFlg 基準単位の単位へ単位換算する際に、端数が生じたらnullを返すかのフラグ
	 * @return 基準単位数量
	 */
	public static MCNumber convToBaseUnit(MCNumber num, MCNumber unitDmnQty, MCNumber unitConvQty,
			MCNumber baseUnitDecPlace, String baseUnitConvRndTyp, boolean remFlg) {
		return _util._convToBaseUnit(num, unitDmnQty, unitConvQty, baseUnitDecPlace,
				baseUnitConvRndTyp, remFlg);
	}
	
	/**
	 * 基準単位以外の単位から基準単位へ単位変換します。
	 * 
	 * @param num 数量
	 * @param unitDmnQty 変換元単位の基準数
	 * @param unitConvQty 変換元単位の単位換算数
	 * @param baseUnitDecPlace 基準単位の小数部有効桁数
	 * @param baseUnitConvRndTyp 基準単位の単位換算端数処理区分
	 * @param remFlg 基準単位の単位へ単位換算する際に、端数が生じたらnullを返すかのフラグ
	 * @return 基準単位数量
	 */
	protected MCNumber _convToBaseUnit(MCNumber num, MCNumber unitDmnQty, MCNumber unitConvQty,
			MCNumber baseUnitDecPlace, String baseUnitConvRndTyp, boolean remFlg) {
		if (isNullOr(num, unitDmnQty) || unitDmnQty.isZero()) {
			return null;
		}
		if (!isNull(unitConvQty)) {
			if (num.isZero() || unitConvQty.isZero() || unitDmnQty.isZero()) {
				return MCNumber.ZERO;
			}
			if (remFlg){
				//換算を行い端数が生じたらnullを返す（換算結果の少数点桁数と基準単位の小数部有効桁数を比較する）
				MCNumber ans = MCNumber.ZERO;
				try {
					ans = num.multiply(unitConvQty).divide(unitDmnQty);
				}
				catch (MCException e) {
					if (isSame(e.getID(), "FCBFC0005")) {
						return null;
					}
					else {
						throw e;
					}
				}
				if (!isNull(baseUnitDecPlace) && ans.scale() > baseUnitDecPlace.intValue()){
					return null;
				}
			}
			if (!isNull(baseUnitDecPlace)
					&& MAC_RND_TYP.contains(baseUnitConvRndTyp)) {
				return num.multiply(unitConvQty).divide(unitDmnQty, baseUnitDecPlace.intValue(),
						MAC_RND_TYP.toMC(baseUnitConvRndTyp));
			}
		}

		MCMessage msg = new MCMessage(MAUCP0035);
		msg.addBind(num, unitConvQty);
		msg.addBind(baseUnitDecPlace != null ? baseUnitDecPlace.intValue()
				: null);
		msg.addBind(baseUnitConvRndTyp);
		MCLog.write(msg);

		return null;
	}

	/**
	 * 基準単位から有効成分単位へ単位変換します。
	 * 
	 * @param qty 基準単位数量
	 * @param stdContFctr 有効成分係数
	 * @param convFctrDecPlace 有効成分小数部有効桁数
	 * @param contFctrRndTyp 有効成分換算端数処理区分
	 * @return 有効成分
	 */
	public static MCNumber convToContFctrUnit(MCNumber qty,
			MCNumber stdContFctr, MCNumber convFctrDecPlace,
			String contFctrRndTyp) {
		return _util._convToContFctrUnit(qty, stdContFctr, convFctrDecPlace,
				contFctrRndTyp);
	}

	/**
	 * 基準単位から有効成分単位へ単位変換します。
	 * 
	 * @param qty 基準単位数量
	 * @param stdContFctr 有効成分係数
	 * @param convFctrDecPlace 有効成分小数部有効桁数
	 * @param contFctrRndTyp 有効成分換算端数処理区分
	 * @return 有効成分
	 */
	protected MCNumber _convToContFctrUnit(MCNumber qty, MCNumber stdContFctr,
			MCNumber convFctrDecPlace, String contFctrRndTyp) {
		if (isNull(qty)) {
			return null;
		}
		if (!isNull(stdContFctr)) {
			if (qty.isZero() || stdContFctr.isZero()) {
				return MCNumber.ZERO;
			}
			if (!isNull(convFctrDecPlace)
					&& MAC_RND_TYP.contains(contFctrRndTyp)) {
				return qty.multiply(stdContFctr, convFctrDecPlace.intValue(),
						MAC_RND_TYP.toMC(contFctrRndTyp));
			}
		}

		MCMessage msg = new MCMessage(MAUCP0038);
		msg.addBind(qty, stdContFctr);
		msg.addBind(convFctrDecPlace != null ? convFctrDecPlace.intValue()
				: null);
		msg.addBind(contFctrRndTyp);
		MCLog.write(msg);

		return null;
	}

	/**
	 * 有効成分単位から基準単位へ単位変換します。
	 * 
	 * @param contFctrQty 有効成分
	 * @param stdContFctr 有効成分係数
	 * @param baseUnitDecPlace 基準単位小数部有効桁数
	 * @param baseUnitConvRndTyp 基準単位換算端数処理区分
	 * @return 基準単位数量
	 */
	public static MCNumber convToBaseUnitFromContFctrUnit(MCNumber contFctrQty,
			MCNumber stdContFctr, MCNumber baseUnitDecPlace,
			String baseUnitConvRndTyp) {
		return _util._convToBaseUnitFromContFctrUnit(contFctrQty, stdContFctr,
				baseUnitDecPlace, baseUnitConvRndTyp);
	}

	/**
	 * 有効成分単位から基準単位へ単位変換します。
	 * 
	 * @param contFctrQty 有効成分
	 * @param stdContFctr 有効成分係数
	 * @param baseUnitDecPlace 基準単位小数部有効桁数
	 * @param baseUnitConvRndTyp 基準単位換算端数処理区分
	 * @return 基準単位数量
	 */
	protected MCNumber _convToBaseUnitFromContFctrUnit(MCNumber contFctrQty,
			MCNumber stdContFctr, MCNumber baseUnitDecPlace,
			String baseUnitConvRndTyp) {
		if (isNull(contFctrQty)) {
			return null;
		}
		if (!isNull(stdContFctr)) {
			if (contFctrQty.isZero() || stdContFctr.isZero()) {
				return MCNumber.ZERO;
			}
			if (!isNull(baseUnitDecPlace)
					&& MAC_RND_TYP.contains(baseUnitConvRndTyp)) {
				return contFctrQty.divide(stdContFctr, baseUnitDecPlace
						.intValue(), MAC_RND_TYP.toMC(baseUnitConvRndTyp));
			}
		}

		MCMessage msg = new MCMessage(MAUCP0039);
		msg.addBind(contFctrQty, stdContFctr);
		msg.addBind(baseUnitDecPlace != null ? baseUnitDecPlace.intValue()
				: null);
		msg.addBind(baseUnitConvRndTyp);
		MCLog.write(msg);

		return null;
	}

	/**
	 * 基準単位数量から有効成分係数を計算する。
	 * 
	 * @param qty 基準単位数量
	 * @param contFctrQty 有効成分
	 * @param convFctrDecPlace 有効成分小数部有効桁数
	 * @return 有効成分係数
	 */
	public static MCNumber calcContFctr(MCNumber qty, MCNumber contFctrQty,
			MCNumber convFctrDecPlace) {
		return _util._calcContFctr(qty, contFctrQty, convFctrDecPlace);
	}

	/**
	 * 基準単位数量から有効成分係数を計算する。
	 * 
	 * @param qty 基準単位数量
	 * @param contFctrQty 有効成分
	 * @param convFctrDecPlace 有効成分小数部有効桁数
	 * @return 有効成分係数
	 */
	protected MCNumber _calcContFctr(MCNumber qty, MCNumber contFctrQty,
			MCNumber convFctrDecPlace) {
		if (isNull(qty)) {
			return null;
		}
		if (!isNull(contFctrQty)) {
			if (qty.isZero() || contFctrQty.isZero()) {
				return MCNumber.ZERO;
			}
			if (!isNull(convFctrDecPlace)) {
				// 有効成分係数の端数処理区分はないため、四捨五入とする
				return contFctrQty.divide(qty, convFctrDecPlace.intValue(),
						MAC_RND_TYP.RNDOFF.toMC());
			}
		}

		MCMessage msg = new MCMessage(MAUCP0040);
		msg.addBind(qty, contFctrQty);
		msg.addBind(convFctrDecPlace != null ? convFctrDecPlace.intValue()
				: null);
		MCLog.write(msg);

		return null;
	}

	/**
	 * 基準通貨以外の通貨から基準通貨へ変換します。
	 * 
	 * @param num 金額or単価
	 * @param xrate 為替レート
	 * @param baseCurDecPlace 基準通貨の金額or単価小数部有効桁数
	 * @param baseCurRndTyp 基準通貨の為替端数処理区分
	 * @return 基準通貨金額or単価
	 */
	public static MCNumber convToBaseCur(MCNumber num, MCNumber xrate,
			MCNumber baseCurDecPlace, String baseCurRndTyp) {
		return _util._convCur(num, xrate, baseCurDecPlace,
				baseCurRndTyp);
	}

	/**
	 * 通貨金額に為替レートを掛け通貨変換を行います。
	 * 
	 * @param num 金額or単価
	 * @param xrate 為替レート
	 * @param curDecPlace 通貨の金額or単価小数部有効桁数
	 * @param curRndTyp 通貨の為替端数処理区分
	 * @return 通貨金額or単価
	 */
	public static MCNumber convCur(MCNumber num, MCNumber xrate,
			MCNumber curDecPlace, String baseCurRndTyp) {
		return _util._convCur(num, xrate, curDecPlace,
				baseCurRndTyp);
	}

	/**
	 * 通貨金額に為替レートを掛け通貨変換を行います。
	 * 
	 * @param num 金額or単価
	 * @param xrate 為替レート
	 * @param curDecPlace 通貨の金額or単価小数部有効桁数
	 * @param curRndTyp 通貨の為替端数処理区分
	 * @return 通貨金額or単価
	 */
	protected MCNumber _convCur(MCNumber num, MCNumber xrate,
			MCNumber curDecPlace, String curRndTyp) {
		if (isNull(num)) {
			return null;
		}
		if (!isNull(xrate)) {
			if (num.isZero() || xrate.isZero()) {
				return MCNumber.ZERO;
			}
			if (!isNull(curDecPlace)
					&& MAC_RND_TYP.contains(curRndTyp)) {
				return num.multiply(xrate, curDecPlace.intValue(),
						MAC_RND_TYP.toMC(curRndTyp));
			}
		}

		MCMessage msg = new MCMessage(MAUCP0041);
		msg.addBind(num, xrate);
		msg.addBind(curDecPlace != null ? curDecPlace.intValue()
				: null);
		msg.addBind(curRndTyp);
		MCLog.write(msg);

		return null;
	}

	// ///////////////////////////////////////////////
	// メッセージバインド用のユーティリティ（ここから）
	// ///////////////////////////////////////////////
	/**
	 * 品目ＣＤ、枝番１～３から表示用の品目情報を返します。<br>
	 * システムパラメータ「ITM_SUB_TYP」を参照して、有効な枝番のみを表示します。
	 * @param itm_cd 品目ＣＤ
	 * @param itm_sub1 枝番１
	 * @param itm_sub2 枝番２
	 * @param itm_sub3 枝番３
	 * @param panel 画面インターフェース
	 * @return 品目情報
	 */
	public static String toDispItm(String itm_cd, String itm_sub1, String itm_sub2, String itm_sub3, IfMAUDP_PanelBase panel) {
		
		int itmSubTyp = Integer.parseInt(panel.getSysParm("ITM_SUB_TYP"));
		return _util._toDispItm(itm_cd, itm_sub1, itm_sub2, itm_sub3, itmSubTyp);
	}
	
	 
	/**
	 * 品目ＣＤ、枝番１～３から表示用の品目情報を返します。<br>
	 * システムパラメータ「ITM_SUB_TYP」を参照して、有効な枝番のみを表示します。
	 * @param itm_cd 品目ＣＤ
	 * @param itm_sub1 枝番１
	 * @param itm_sub2 枝番２
	 * @param itm_sub3 枝番３
	 * @param itmSubTyp システムパラメータ「ITM_SUB_TYP」
	 * @return 品目情報
	 */
	protected String _toDispItm(String itm_cd, String itm_sub1, String itm_sub2, String itm_sub3, int itmSubTyp) {
		StringBuilder sb = new StringBuilder();
		
		if (itmSubTyp < 0 || itmSubTyp > 3) {
			itmSubTyp = 0;
		}
		
		sb.append(itm_cd);
		if (itmSubTyp > 0) {
			sb.append(MAC_STR.DISP_ITM_DLM1.value());
			sb.append(itm_sub1);
		}
		if (itmSubTyp > 1) {
			sb.append(MAC_STR.DISP_ITM_DLM2.value());
			sb.append(itm_sub2);
		}
		if (itmSubTyp > 2) {
			sb.append(MAC_STR.DISP_ITM_DLM3.value());
			sb.append(itm_sub3);
		}

		return sb.toString();
	}
		
	/**
	 * 手配ＮＯ１～４から表示用の手配ＮＯ情報を返します。<br>
	 * @param sno1 手配ＮＯ１
	 * @param sno2 手配ＮＯ２
	 * @param sno3 手配ＮＯ３
	 * @param sno4 手配ＮＯ４
	 * @param panel 画面インターフェース
	 * @return 手配ＮＯ情報
	 */
	public static String toDispSno(String sno1, String sno2, String sno3, String sno4, IfMAUDP_PanelBase panel) {
		int snoTyp = Integer.parseInt(panel.getSysParm("SNO_TYP"));
		return _util._toDispSno(sno1, sno2, sno3, sno4, snoTyp);
	}
	 
	/**
	 * 手配ＮＯ１～４から表示用の手配ＮＯ情報を返します。<br>
	 * システムパラメータ「SNO_TYP」を参照して、有効な手配ＮＯのみを表示します。
	 * @param sno1 手配ＮＯ１
	 * @param sno2 手配ＮＯ２
	 * @param sno3 手配ＮＯ３
	 * @param sno4 手配ＮＯ４
	 * @param snoTyp システムパラメータ「SNO_TYP」
	 * @return 手配ＮＯ情報
	 */
	protected String _toDispSno(String sno1, String sno2, String sno3, String sno4, int snoTyp) {
		StringBuilder sb = new StringBuilder();
		
		if (snoTyp < 0 || snoTyp > 4) {
			snoTyp = 0;
		}

		if (snoTyp > 0) {
			sb.append(sno1);
		}
		if (snoTyp > 1) {
			sb.append(MAC_STR.DISP_SNO_DLM1.value());
			sb.append(sno2);
		}
		if (snoTyp > 2) {
			sb.append(MAC_STR.DISP_SNO_DLM2.value());
			sb.append(sno3);
		}
		if (snoTyp > 3) {
			sb.append(MAC_STR.DISP_SNO_DLM3.value());
			sb.append(sno4);
		}

		return sb.toString();
	}
	// ///////////////////////////////////////////////
	// メッセージバインド用のユーティリティ（ここまで）
	// ///////////////////////////////////////////////
	
	
	// ///////////////////////////////////////////////
	// 住所連結用のユーティリティ（ここから）
	// ///////////////////////////////////////////////
	/**
	 * 住所１から住所４を半角スペース区切りで連結します。<br>
	 * @param addr1 住所１
	 * @param addr2 住所２
	 * @param addr3 住所３
	 * @param addr4 住所４
	 * @return 連結住所
	 */
	public static String concatAddress(String addr1, String addr2, String addr3, String addr4) {
		return _util._concatAddress(addr1, addr2, addr3, addr4);
	}
	
	protected String _concatAddress(String addr1, String addr2, String addr3, String addr4) {
		StringBuilder sb = new StringBuilder();

		if (!isNull(addr1)) {
			sb.append(addr1);
		}
		if (!isNull(addr2)) {
			sb.append(" ");
			sb.append(addr2);
		}
		if (!isNull(addr3)) {
			sb.append(" ");
			sb.append(addr3);
		}
		if (!isNull(addr4)) {
			sb.append(" ");
			sb.append(addr4);
		}
		return sb.toString();
	}
	// ///////////////////////////////////////////////
	// 住所連結用のユーティリティ（ここまで）
	// ///////////////////////////////////////////////
	
	/**
	 * 表示用の行番号文字列を返します。<br>
	 * getGUIIndexが0以上のとき「行番号：{1}」という文字列を返します。<br>
	 * getGUIIndexが0未満のとき空文字を返します。
	 * @param row
	 * @return 表示用の行番号文字列
	 */
	public static String toDispGUIIndex(MCRow row) {
		if (row.getGUIIndex() < 0) {
			return " ";
		}
		return new MCMessage(MAUDP0409, row.getGUIIndex() + 1).toString(MCLocaleConst
				.message(MCSys.user.locale()));
	}

	/**
	 * 品目単位マスタの情報を取得する。
	 * <p>
	 * 品目ＣＤ、枝番１、枝番２、枝番３、単位ＣＤのいずれかが null または空文字の場合は null を返す。
	 * 
	 * @param itm_cd 品目ＣＤ
	 * @param itm_sub1 枝番１
	 * @param itm_sub2 枝番２
	 * @param itm_sub3 枝番３
	 * @param unit_cd 単位ＣＤ
	 * @param panel 画面
	 * @return 品目単位マスタの情報、または null
	 */
	public static MCRow getItmUnit(String itm_cd, String itm_sub1, 
		String itm_sub2, String itm_sub3, String unit_cd, MCRootPanel panel) {
		return MAUCP_ItmUnitListLogic.getItmUnit(itm_cd, itm_sub1, itm_sub2, itm_sub3, unit_cd, panel);
	}

	/**
	 * 品目単位マスタの情報を取得する。
	 * <p>
	 * 品目ＣＤ、枝番１、枝番２、枝番３、単位ＣＤのいずれかが null または空文字の場合は null を返す。
	 * 
	 * @param itm_cd 品目ＣＤ
	 * @param itm_sub1 枝番１
	 * @param itm_sub2 枝番２
	 * @param itm_sub3 枝番３
	 * @param unit_cd 単位ＣＤ
	 * @param add_unit_cd 追加単位ＣＤ
	 * @param panel 画面
	 * @return 品目単位マスタの情報、または null
	 */
	public static MCRow getItmUnit(String itm_cd, String itm_sub1, 
		String itm_sub2, String itm_sub3, String unit_cd, String add_unit_cd, MCRootPanel panel) {
		return MAUCP_ItmUnitListLogic.getItmUnit(itm_cd, itm_sub1, itm_sub2, itm_sub3, unit_cd, add_unit_cd, panel);
	}

}