package mcframe.serverMAUC.MAUCL0010;

import mcframe.commonCore.lang.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.commonCore.notice.*;
import mcframe.serverCore.logic.*;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.serverMA.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.util.Locale;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.math.RoundingMode;

import mcframe.commonCore.resource.MCLocaleConst;
import mcframe.commonCore.sys.MCFactory;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonFX.constant.FX_Const;
import mcframe.commonMA.meta.MA_META;
import mcframe.serverCore.resource.MCConst;
import mcframe.serverCore.resource.MCConfig;
import mcframe.serverCore.sys.MCSys;
import static mcframe.serverCore.requester.MCRequestObject.object;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MAUCL_MCDataUtil"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MAUCL_MCDataUtil_MC extends MAUCL_MCDataUtil_MC_A{
	//FMCB CUSTOM START

	protected static final Class<MAUCL_MCDataUtil> CLAZZ = MAUCL_MCDataUtil.class;

	/**
	 * null代替文字（又は代替日付）をnullに変換します。
	 * @param row 変換対象のデータを保持しているrow
	 * @param cols 変換対象のカラム名
	 */
	public static void nullValToNull(MCRow row, String... cols) {
		if (cols == null || cols.length == 0)
			return;
		for (String col : cols) {
			MCMeta meta = row.getMeta(col);
			if (MCDataType.STRING == meta.type()) {
				if (isSame(MAC_STR.NULL_VAL.value(), row.getString(col))) {
					row.setString(col, null);
				}
			}
			else if (MCDataType.DATE == meta.type()) {
				if (isSame(MAC_Y4M.NULL_VAL.value(), row.getDate(col))) {
					row.setDate(col, null);
				}
			}
		}
	}

	/**
	 * null代替文字（又は代替日付）をnullに変換します。
	 */
	public static String nullValToNull(String val) {
		if (isSame(MAC_STR.NULL_VAL.value(), val)) {
			return null;
		}
		return val;
	}

	/**
	 * システムパラメータの設定値で項目を補完します。<br>
	 */
	/**
	 * @param container コンテナ
	 */
	public static void setSysVal(MCContainer container) {
		MCList<MCRow> l = containerToMCList(container);
		if (l == null) {
			return ;
		}
		Map<String, String> map = new HashMap<String, String>();
		Map<String, String> map1 = getExtMap(container, "REQUIRED"); // 必須チェック対象
		Map<String, String> map2 = getExtMap(container, "REQ_UPD_CNT_CHK"); // 更新カウンタチェック用必須チェック対象
		if (map1 != null) map.putAll(map1);
		if (map2 != null) map.putAll(map2);
		
		if (map.isEmpty()) {
			return;
		}
		
		String[] cols = container.getColumnPathArray();
		for (String col : cols) {
			if (map.containsKey(col)) {
				MCMeta m = container.getMeta(col);
				if (MA_META.ALLOC_GRP_CD.metaEquals(m)) {
					setValueBySysVal(col, "DEF_ALLOC_GRP_CD", l);
				}
				else if (MA_META.LG_GRP_CD.metaEquals(m)) {
					setValueBySysVal(col, "DEF_LG_GRP_CD", l);
				}
				else if (MA_META.LOC_GRP_CD.metaEquals(m)) {
					setValueBySysVal(col, "DEF_LOC_GRP_CD", l);
				}
				else if (MA_META.SITE_CD.metaEquals(m)) {
					setValueBySysVal(col, "DEF_SITE_CD", l);
				}
				else if (MA_META.STK_GD_CD.metaEquals(m)) {
					setValueBySysVal(col, "DEF_STK_GD_CD", l);
				}
				else if (MA_META.WG_CD.metaEquals(m)) {
					setValueBySysVal(col, "DEF_WG_CD", l);
				}
			}
		}
	}
	protected static void setValueBySysVal(String col, String systemParam, MCList<MCRow> l) {
		String df = getSysParmNE(systemParam);
		if (isNull(df)) {
			return;
		}
		for (MCRow r : l) {
			if (isNull(r.getValue(col))) {
				r.setValue(col, df);
			}
		}
	}

	/**
	 * コードの入力値チェックを行ないます。
	 *
	 * @param val チェック対象文字列
	 */
	public static boolean isNotCd(String val) {
		return MAC_NOT_CD_TYP.contains(val) ;
	}

	/**
	 * null代替文字（又は代替日付）をnullに変換します。
	 * @param list 変換対象のデータを保持しているrowを保持するlist
	 * @param cols 変換対象のカラム名
	 */
	public static void nullValToNull(MCList<? extends MCRow> list,
			String... cols) {
		if (cols == null || cols.length == 0)
			return;
		if (list == null || list.size() == 0)
			return;
		MCRow proto = list.get(0);
		for (String col : cols) {
			MCMeta meta = proto.getMeta(col);
			if (MCDataType.STRING == meta.type()) {
				for (MCRow row : list) {
					if (isSame(MAC_STR.NULL_VAL.value(), row.getString(col))) {
						row.setString(col, null);
					}
				}
			}
			else if (MCDataType.DATE == meta.type()) {
				for (MCRow row : list) {
					if (isSame(MAC_Y4M.NULL_VAL.value(), row.getString(col))) {
						row.setDate(col, null);
					}
				}
			}
		}
	}

	/**
	 * 引数の文字列がnullまたはnull代替文字のときtrueを返します。
	 *
	 * @param val チェック対象文字列
	 */
	public static boolean isNullOrNullVal(String val) {
		return isNull(val) || MAC_STR.isNULL_VAL(val);
	}

	/**
	 * trueの場合は"1"を、falseの場合はカットオフ用にnullを返します。
	 * @param boo 変換対象のboolean
	 * @return booがtrueのときは"1", falseのときはnull
	 */
	public static String toTrueStr(boolean boo) {
		return object(CLAZZ)._toTrueStr(boo);
	}

	/**
	 * trueの場合は"1"を、falseの場合はカットオフ用にnullを返します。
	 * @param boo 変換対象のboolean
	 * @return booがtrueのときは"1", falseのときはnull
	 */
	protected String _toTrueStr(boolean boo) {
		if (boo) {
			return MCBooleanUtil.booleanToDBString(true);
		}
		else {
			return null;
		}
	}

	/**
	 * falseの場合は"0"を、trueの場合はカットオフ用にnullを返します。
	 * @param boo 変換対象のboolean
	 * @return booがfalseのときは"0", trueのときはnull
	 */
	public static String toFalseStr(boolean boo) {
		return object(CLAZZ)._toFalseStr(boo);
	}

	/**
	 * falseの場合は"0"を、trueの場合はカットオフ用にnullを返します。
	 * @param boo 変換対象のboolean
	 * @return booがfalseのときは"0", trueのときはnull
	 */
	protected String _toFalseStr(boolean boo) {
		if (boo) {
			return null;
		}
		else {
			return MCBooleanUtil.booleanToDBString(false);
		}
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
		return object(CLAZZ)._rvrsBaseUnitConv(qty, toDmnQty, toConvQty, toDecPlace,
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
		return object(CLAZZ)._rvrsBaseUnitConv(qty, toDmnQty, toConvQty, toDecPlace,
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

		MCMessage msg = new MCMessage(MAUCL0017);
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
		return object(CLAZZ)._unitConv(num, frDmnQty, frConvQty, baseUnitDecPlace, baseUnitConvRndTyp,
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
		return object(CLAZZ)._unitConv(num, frDmnQty, frConvQty, baseUnitDecPlace, baseUnitConvRndTyp,
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
				return _rvrsBaseUnitConv(base, toDmnQty, toConvQty, toDecPlace, toUnitConvRndTyp, remFlg);
			}
		}

		MCMessage msg = new MCMessage(MAUCL0018);
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
		return object(CLAZZ)._convToBaseUnit(num, unitDmnQty, unitConvQty, baseUnitDecPlace,
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
		return object(CLAZZ)._convToBaseUnit(num, unitDmnQty, unitConvQty, baseUnitDecPlace,
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
					if (isSame(e.getID(), "FCBFC0006") || isSame(e.getID(), "FCBFC0005")) {
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

		MCMessage msg = new MCMessage(MAUCL0016);
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
		return object(CLAZZ)._convToContFctrUnit(qty, stdContFctr, convFctrDecPlace,
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

		MCMessage msg = new MCMessage(MAUCL0019);
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
		return object(CLAZZ)._convToBaseUnitFromContFctrUnit(contFctrQty, stdContFctr,
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

		MCMessage msg = new MCMessage(MAUCL0020);
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
		return object(CLAZZ)._calcContFctr(qty, contFctrQty, convFctrDecPlace);
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

		MCMessage msg = new MCMessage(MAUCL0021);
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
		return object(CLAZZ)._convCur(num, xrate, baseCurDecPlace, baseCurRndTyp);
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
			MCNumber curDecPlace, String curRndTyp) {
		return object(CLAZZ)._convCur(num, xrate, curDecPlace, curRndTyp);
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

		MCMessage msg = new MCMessage(MAUCL0111);
		msg.addBind(num, xrate);
		msg.addBind(curDecPlace != null ? curDecPlace.intValue()
				: null);
		msg.addBind(curRndTyp);
		MCLog.write(msg);

		return null;
	}

	/**
	 * 基準通貨以外の通貨から、税率、為替レートを掛け変換を行います。
	 *
	 * @param num 金額or単価
	 * @param taxRate 税率
	 * @param xrate 為替レート
	 * @param baseCurDecPlace 基準通貨の金額or単価小数部有効桁数
	 * @param baseCurRndTyp 基準通貨の為替端数処理区分
	 * @return 基準通貨金額or単価
	 */
	public static MCNumber convToBaseCur(MCNumber num, MCNumber taxRate, MCNumber xrate,
			MCNumber baseCurDecPlace, String baseCurRndTyp) {
		return object(CLAZZ)._convCur(num, taxRate, xrate, baseCurDecPlace, baseCurRndTyp);
	}

	/**
	 * 通貨金額に為替レートを掛け通貨変換を行います。
	 *
	 * @param num 金額or単価
	 * @param taxRate 税率
	 * @param xrate 為替レート
	 * @param curDecPlace 通貨の金額or単価小数部有効桁数
	 * @param curRndTyp 通貨の為替端数処理区分
	 * @return 通貨金額or単価
	 */
	public static MCNumber convCur(MCNumber num, MCNumber taxRate, MCNumber xrate,
			MCNumber curDecPlace, String curRndTyp) {
		return object(CLAZZ)._convCur(num, taxRate, xrate, curDecPlace, curRndTyp);
	}

	/**
	 * 通貨金額に税率、為替レートを掛け通貨変換を行います。
	 *
	 * @param num 金額or単価
	 * @param taxRate 税率
	 * @param xrate 為替レート
	 * @param curDecPlace 通貨の金額or単価小数部有効桁数
	 * @param curRndTyp 通貨の為替端数処理区分
	 * @return 通貨金額or単価
	 */
	protected MCNumber _convCur(MCNumber num, MCNumber taxRate, MCNumber xrate,
			MCNumber curDecPlace, String curRndTyp) {
		if (isNull(num)) {
			return null;
		}
		if (!isNull(xrate)) {
			if (num.isZero() || taxRate.isZero() || xrate.isZero()) {
				return MCNumber.ZERO;
			}
			if (!isNull(curDecPlace)
					&& MAC_RND_TYP.contains(curRndTyp)) {
				return num.multiply(taxRate.divide(100)).multiply(xrate,  curDecPlace.intValue(),
						MAC_RND_TYP.toMC(curRndTyp));
			}
		}

		MCMessage msg = new MCMessage(MAUCL0111);
		msg.addBind(num, xrate);
		msg.addBind(curDecPlace != null ? curDecPlace.intValue()
				: null);
		msg.addBind(curRndTyp);
		MCLog.write(msg);

		return null;
	}

	/**
	 * システムの精度で乗算します。</br>
	 * 数値1*数値2
	 *
	 * @param a 数値1
	 * @param b 数値2
	 * @return 計算結果
	 */
	protected MCNumber _multiply(MCNumber a, MCNumber b) {
		return a.multiply(b, MAC_SYS_CALC_TYP.MULTIPLY.dec_place().intValue(),
				MAC_RND_TYP.toMC(MAC_SYS_CALC_TYP.MULTIPLY.rnd_typ()));
	}

	/**
	 * システムの精度で商算します。</br>
	 * 数値1/数値2
	 *
	 * @param a 数値1
	 * @param b 数値2
	 * @return 計算結果
	 */
	protected MCNumber _divide(MCNumber a, MCNumber b) {
		return a.divide(b, MAC_SYS_CALC_TYP.DIVIDE.dec_place().intValue(),
				MAC_RND_TYP.toMC(MAC_SYS_CALC_TYP.DIVIDE.rnd_typ()));
	}

	/**
	 * システムの精度で乗算します。</br>
	 * 数値1*数値2
	 *
	 * @param a 数値1
	 * @param b 数値2
	 * @return 計算結果
	 */
	public static MCNumber multiply(MCNumber a, MCNumber b) {
		return object(CLAZZ)._multiply(a, b);
	}

	/**
	 * システムの精度で商算します。</br>
	 * 数値1/数値2
	 *
	 * @param a 数値1
	 * @param b 数値2
	 * @return 計算結果
	 */
	public static MCNumber divide(MCNumber a, MCNumber b) {
		return object(CLAZZ)._divide(a, b);
	}


	// ///////////////////////////////////////////////
	// 帳票ラベルユーティリティ（ここから）
	// ///////////////////////////////////////////////
	/**
	 * booleanColに指定されたカラムに格納されている値を元に、<br>
	 * 帳票上のbooleanの文字列表現を、strColで指定されたカラムに設定します。
	 * @param row 変換対象のrow
	 * @param strCol booleanの帳票上の文字列表現を格納するカラム名
	 * @param booleanCol 変換時に使用するbooleanを格納しているカラム名
	 */
	public static void putPrntChk(MCRow row, String strCol, String booleanCol) {
		object(CLAZZ)._putPrntChk(row, strCol, booleanCol);
	}
	/**
	 * booleanColに指定されたカラムに格納されている値を元に、<br>
	 * 帳票上のbooleanの文字列表現を、strColで指定されたカラムに設定します。
	 * @param row 変換対象のrow
	 * @param strCol booleanの帳票上の文字列表現を格納するカラム名
	 * @param booleanCol 変換時に使用するbooleanを格納しているカラム名
	 */
	protected void _putPrntChk(MCRow row, String strCol, String booleanCol) {
		if (row.getBoolean(booleanCol)) {
			row.setString(strCol, MAC_STR.PRNT_CHK_TRUE.name(getClientLocale()));
		}
		else {
			row.setString(strCol, MAC_STR.PRNT_CHK_FALSE.name(getClientLocale()));
		}
	}
	/**
	 * booleanColに指定されたカラムに格納されている値を元に、<br>
	 * 帳票上のbooleanの文字列表現を、strColで指定されたカラムに設定します。
	 * @param list 変換対象のlist
	 * @param strCol booleanの帳票上の文字列表現を格納するカラム名
	 * @param booleanCol 変換時に使用するbooleanを格納しているカラム名
	 */
	public static void putPrntChk(MCList<? extends MCRow> list, String strCol, String booleanCol) {
		object(CLAZZ)._putPrntChk(list, strCol, booleanCol);
	}
	/**
	 * booleanColに指定されたカラムに格納されている値を元に、<br>
	 * 帳票上のbooleanの文字列表現を、strColで指定されたカラムに設定します。
	 * @param list 変換対象のlist
	 * @param strCol booleanの帳票上の文字列表現を格納するカラム名
	 * @param booleanCol 変換時に使用するbooleanを格納しているカラム名
	 */
	protected void _putPrntChk(MCList<? extends MCRow> list, String strCol, String booleanCol) {
		for (MCRow row : list) {
			putPrntChk(row, strCol, booleanCol);
		}
	}

	/**
	 * システムパラメータITM_SUB_TYPが枝番１を表示する設定の場合、<br>
	 * dataColに格納されている値を、viewColで指定されたカラムに設定します。
	 * @param row 変換対象のrow
	 * @param viewCol 表示用カラム名
	 * @param dataCol データカラム名
	 */
	public static void putPrntItmSub1(MCRow row, String viewCol, String dataCol) {
		object(CLAZZ)._putPrntItmSub(row, viewCol, dataCol, 1);
	}
	protected void _putPrntItmSub(MCRow row, String viewCol, String dataCol, int no) {
		int itmSubtyp = getSysParmInt_ItmSubTyp();
		if (itmSubtyp > no - 1) {
			if (MAC_STR.isNULL_VAL(row.getString(dataCol))
					&& isSame(getSysParm("RPT_NULL_VAL_FLG"), "0")) {
				return;
			}
			row.setValue(viewCol, row.getValue(dataCol));
		}
	}
	/**
	 * システムパラメータITM_SUB_TYPが枝番１を表示する設定の場合、<br>
	 * dataColに格納されている値を、viewColで指定されたカラムに設定します。
	 * @param list 変換対象のlist
	 * @param viewCol 表示用カラム名
	 * @param dataCol データカラム名
	 */
	public static void putPrntItmSub1(MCList<? extends MCRow> list, String viewCol, String dataCol) {
		object(CLAZZ)._putPrntItmSub1(list, viewCol, dataCol);
	}
	protected void _putPrntItmSub1(MCList<? extends MCRow> list, String viewCol, String dataCol) {
		for (MCRow row : list) {
			putPrntItmSub1(row, viewCol, dataCol);
		}
	}

	/**
	 * システムパラメータITM_SUB_TYPが枝番２を表示する設定の場合、<br>
	 * dataColに格納されている値を、viewColで指定されたカラムに設定します。
	 * @param row 変換対象のrow
	 * @param viewCol 表示用カラム名
	 * @param dataCol データカラム名
	 */
	public static void putPrntItmSub2(MCRow row, String viewCol, String dataCol) {
		object(CLAZZ)._putPrntItmSub(row, viewCol, dataCol, 2);
	}
	/**
	 * システムパラメータITM_SUB_TYPが枝番２を表示する設定の場合、<br>
	 * dataColに格納されている値を、viewColで指定されたカラムに設定します。
	 * @param list 変換対象のlist
	 * @param viewCol 表示用カラム名
	 * @param dataCol データカラム名
	 */
	public static void putPrntItmSub2(MCList<? extends MCRow> list, String viewCol, String dataCol) {
		object(CLAZZ)._putPrntItmSub2(list, viewCol, dataCol);
	}
	protected void _putPrntItmSub2(MCList<? extends MCRow> list, String viewCol, String dataCol) {
		for (MCRow row : list) {
			putPrntItmSub2(row, viewCol, dataCol);
		}
	}

	/**
	 * システムパラメータITM_SUB_TYPが枝番３を表示する設定の場合、<br>
	 * dataColに格納されている値を、viewColで指定されたカラムに設定します。
	 * @param row 変換対象のrow
	 * @param viewCol 表示用カラム名
	 * @param dataCol データカラム名
	 */
	public static void putPrntItmSub3(MCRow row, String viewCol, String dataCol) {
		object(CLAZZ)._putPrntItmSub(row, viewCol, dataCol, 3);
	}
	/**
	 * システムパラメータITM_SUB_TYPが枝番３を表示する設定の場合、<br>
	 * dataColに格納されている値を、viewColで指定されたカラムに設定します。
	 * @param list 変換対象のlist
	 * @param viewCol 表示用カラム名
	 * @param dataCol データカラム名
	 */
	public static void putPrntItmSub3(MCList<? extends MCRow> list, String viewCol, String dataCol) {
		object(CLAZZ)._putPrntItmSub3(list, viewCol, dataCol);
	}
	protected void _putPrntItmSub3(MCList<? extends MCRow> list, String viewCol, String dataCol) {
		for (MCRow row : list) {
			putPrntItmSub3(row, viewCol, dataCol);
		}
	}

	/**
	 * システムパラメータSNO_TYPが手配ＮＯ１を表示する設定の場合、<br>
	 * dataColに格納されている値を、viewColで指定されたカラムに設定します。
	 * @param row 変換対象のrow
	 * @param viewCol 表示用カラム名
	 * @param dataCol データカラム名
	 */
	public static void putPrntSno1(MCRow row, String viewCol, String dataCol) {
		object(CLAZZ)._putPrntSno(row, viewCol, dataCol, 1);
	}
	protected void _putPrntSno(MCRow row, String viewCol, String dataCol, int no) {
		int snoTyp = getSysParmInt_SnoTyp();
		if (snoTyp > no - 1) {
			if (MAC_STR.isNULL_VAL(row.getString(dataCol))
					&& isSame(getSysParm("RPT_NULL_VAL_FLG"), "0")) {
				return;
			}
			row.setValue(viewCol, row.getValue(dataCol));
		}
	}
	/**
	 * システムパラメータSNO_TYPが手配ＮＯ１を表示する設定の場合、<br>
	 * dataColに格納されている値を、viewColで指定されたカラムに設定します。
	 * @param list 変換対象のlist
	 * @param viewCol 表示用カラム名
	 * @param dataCol データカラム名
	 */
	public static void putPrntSno1(MCList<? extends MCRow> list, String viewCol, String dataCol) {
		object(CLAZZ)._putPrntSno1(list, viewCol, dataCol);
	}
	protected void _putPrntSno1(MCList<? extends MCRow> list, String viewCol, String dataCol) {
		for (MCRow row : list) {
			putPrntSno1(row, viewCol, dataCol);
		}
	}

	/**
	 * システムパラメータSNO_TYPが手配ＮＯ２を表示する設定の場合、<br>
	 * dataColに格納されている値を、viewColで指定されたカラムに設定します。
	 * @param row 変換対象のrow
	 * @param viewCol 表示用カラム名
	 * @param dataCol データカラム名
	 */
	public static void putPrntSno2(MCRow row, String viewCol, String dataCol) {
		object(CLAZZ)._putPrntSno(row, viewCol, dataCol, 2);
	}
	/**
	 * システムパラメータSNO_TYPが手配ＮＯ２を表示する設定の場合、<br>
	 * dataColに格納されている値を、viewColで指定されたカラムに設定します。
	 * @param list 変換対象のlist
	 * @param viewCol 表示用カラム名
	 * @param dataCol データカラム名
	 */
	public static void putPrntSno2(MCList<? extends MCRow> list, String viewCol, String dataCol) {
		object(CLAZZ)._putPrntSno2(list, viewCol, dataCol);
	}
	protected void _putPrntSno2(MCList<? extends MCRow> list, String viewCol, String dataCol) {
		for (MCRow row : list) {
			putPrntSno2(row, viewCol, dataCol);
		}
	}

	/**
	 * システムパラメータSNO_TYPが手配ＮＯ３を表示する設定の場合、<br>
	 * dataColに格納されている値を、viewColで指定されたカラムに設定します。
	 * @param row 変換対象のrow
	 * @param viewCol 表示用カラム名
	 * @param dataCol データカラム名
	 */
	public static void putPrntSno3(MCRow row, String viewCol, String dataCol) {
		object(CLAZZ)._putPrntSno(row, viewCol, dataCol, 3);
	}
	/**
	 * システムパラメータSNO_TYPが手配ＮＯ３を表示する設定の場合、<br>
	 * dataColに格納されている値を、viewColで指定されたカラムに設定します。
	 * @param list 変換対象のlist
	 * @param viewCol 表示用カラム名
	 * @param dataCol データカラム名
	 */
	public static void putPrntSno3(MCList<? extends MCRow> list, String viewCol, String dataCol) {
		object(CLAZZ)._putPrntSno3(list, viewCol, dataCol);
	}
	protected void _putPrntSno3(MCList<? extends MCRow> list, String viewCol, String dataCol) {
		for (MCRow row : list) {
			putPrntSno3(row, viewCol, dataCol);
		}
	}

	/**
	 * システムパラメータSNO_TYPが手配ＮＯ４を表示する設定の場合、<br>
	 * dataColに格納されている値を、viewColで指定されたカラムに設定します。
	 * @param row 変換対象のrow
	 * @param viewCol 表示用カラム名
	 * @param dataCol データカラム名
	 */
	public static void putPrntSno4(MCRow row, String viewCol, String dataCol) {
		object(CLAZZ)._putPrntSno(row, viewCol, dataCol, 4);
	}
	/**
	 * システムパラメータSNO_TYPが手配ＮＯ４を表示する設定の場合、<br>
	 * dataColに格納されている値を、viewColで指定されたカラムに設定します。
	 * @param list 変換対象のlist
	 * @param viewCol 表示用カラム名
	 * @param dataCol データカラム名
	 */
	public static void putPrntSno4(MCList<? extends MCRow> list, String viewCol, String dataCol) {
		object(CLAZZ)._putPrntSno4(list, viewCol, dataCol);
	}
	protected void _putPrntSno4(MCList<? extends MCRow> list, String viewCol, String dataCol) {
		for (MCRow row : list) {
			putPrntSno4(row, viewCol, dataCol);
		}
	}

	/**
	 * システムパラメータSNO_TYPが手配ＮＯ１を表示する設定の場合、<br>
	 * labelColで指定されたカラムに手配ＮＯ１のラベル用文字列を設定します。
	 * @param row 変換対象のrow
	 * @param labelCol ラベルカラム名
	 */
	public static void putPrntSnoLabel1(MCRow row, String labelCol) {
		object(CLAZZ)._putPrntSnoLabel(row, labelCol, null, 1);
	}
	/**
	 * システムパラメータSNO_TYPが手配ＮＯ１を表示する設定の場合、<br>
	 * labelColで指定されたカラムに手配ＮＯ１のラベル用文字列を設定します。
	 * @param list 変換対象のlist
	 * @param labelCol ラベルカラム名
	 */
	public static void putPrntSnoLabel1(MCList<? extends MCRow> list, String labelCol) {
		object(CLAZZ)._putPrntSnoLabel1(list, labelCol, null);
	}

	/**
	 * システムパラメータSNO_TYPが手配ＮＯ２を表示する設定の場合、<br>
	 * labelColで指定されたカラムに手配ＮＯ２のラベル用文字列を設定します。
	 * @param row 変換対象のrow
	 * @param labelCol ラベルカラム名
	 */
	public static void putPrntSnoLabel2(MCRow row, String labelCol) {
		object(CLAZZ)._putPrntSnoLabel(row, labelCol, null, 2);
	}
	/**
	 * システムパラメータSNO_TYPが手配ＮＯ２を表示する設定の場合、<br>
	 * labelColで指定されたカラムに手配ＮＯ２のラベル用文字列を設定します。
	 * @param list 変換対象のlist
	 * @param labelCol ラベルカラム名
	 */
	public static void putPrntSnoLabel2(MCList<? extends MCRow> list, String labelCol) {
		object(CLAZZ)._putPrntSnoLabel2(list, labelCol, null);
	}

	/**
	 * システムパラメータSNO_TYPが手配ＮＯ３を表示する設定の場合、<br>
	 * labelColで指定されたカラムに手配ＮＯ３のラベル用文字列を設定します。
	 * @param row 変換対象のrow
	 * @param labelCol ラベルカラム名
	 */
	public static void putPrntSnoLabel3(MCRow row, String labelCol) {
		object(CLAZZ)._putPrntSnoLabel(row, labelCol, null, 3);
	}
	/**
	 * システムパラメータSNO_TYPが手配ＮＯ３を表示する設定の場合、<br>
	 * labelColで指定されたカラムに手配ＮＯ３のラベル用文字列を設定します。
	 * @param list 変換対象のlist
	 * @param labelCol ラベルカラム名
	 */
	public static void putPrntSnoLabel3(MCList<? extends MCRow> list, String labelCol) {
		object(CLAZZ)._putPrntSnoLabel3(list, labelCol, null);
	}

	/**
	 * システムパラメータSNO_TYPが手配ＮＯ４を表示する設定の場合、<br>
	 * labelColで指定されたカラムに手配ＮＯ４のラベル用文字列を設定します。
	 * @param row 変換対象のrow
	 * @param labelCol ラベルカラム名
	 */
	public static void putPrntSnoLabel4(MCRow row, String labelCol) {
		object(CLAZZ)._putPrntSnoLabel(row, labelCol, null, 4);
	}
	/**
	 * システムパラメータSNO_TYPが手配ＮＯ４を表示する設定の場合、<br>
	 * labelColで指定されたカラムに手配ＮＯ４のラベル用文字列を設定します。
	 * @param list 変換対象のlist
	 * @param labelCol ラベルカラム名
	 */
	public static void putPrntSnoLabel4(MCList<? extends MCRow> list, String labelCol) {
		object(CLAZZ)._putPrntSnoLabel4(list, labelCol, null);
	}

	/**
	 * システムパラメータSNO_TYPが手配ＮＯ１を表示する設定の場合、<br>
	 * labelColで指定されたカラムに手配ＮＯ１のラベル用文字列を設定します。
	 * @param row 変換対象のrow
	 * @param labelCol ラベルカラム名
	 * @param lcl ラベルのロケール
	 */
	public static void putPrntSnoLabel1(MCRow row, String labelCol, Locale lcl) {
		object(CLAZZ)._putPrntSnoLabel(row, labelCol, lcl, 1);
	}
	protected void _putPrntSnoLabel(MCRow row, String labelCol, Locale lcl, int no) {
		int snoTyp = getSysParmInt_SnoTyp();
		if (snoTyp > no - 1) {
			MAC_STR macStr = null;
			if (no == 1) {
				macStr = MAC_STR.PRNT_SNO1;
			}
			else if (no == 2) {
				macStr = MAC_STR.PRNT_SNO2;
			}
			else if (no == 3) {
				macStr = MAC_STR.PRNT_SNO3;
			}
			else if (no == 4) {
				macStr = MAC_STR.PRNT_SNO4;
			}
			row.setValue(labelCol, macStr.name(lcl == null ? getClientLocale() : lcl));
		}
	}
	/**
	 * システムパラメータSNO_TYPが手配ＮＯ１を表示する設定の場合、<br>
	 * labelColで指定されたカラムに手配ＮＯ１のラベル用文字列を設定します。
	 * @param list 変換対象のlist
	 * @param labelCol ラベルカラム名
	 * @param lcl ラベルのロケール
	 */
	public static void putPrntSnoLabel1(MCList<? extends MCRow> list, String labelCol, Locale lcl) {
		object(CLAZZ)._putPrntSnoLabel1(list, labelCol, lcl);
	}
	protected void _putPrntSnoLabel1(MCList<? extends MCRow> list, String labelCol, Locale lcl) {
		for (MCRow row : list) {
			putPrntSnoLabel1(row, labelCol, lcl);
		}
	}

	/**
	 * システムパラメータSNO_TYPが手配ＮＯ２を表示する設定の場合、<br>
	 * labelColで指定されたカラムに手配ＮＯ２のラベル用文字列を設定します。
	 * @param row 変換対象のrow
	 * @param labelCol ラベルカラム名
	 * @param lcl ラベルのロケール
	 */
	public static void putPrntSnoLabel2(MCRow row, String labelCol, Locale lcl) {
		object(CLAZZ)._putPrntSnoLabel(row, labelCol, lcl, 2);
	}
	/**
	 * システムパラメータSNO_TYPが手配ＮＯ２を表示する設定の場合、<br>
	 * labelColで指定されたカラムに手配ＮＯ２のラベル用文字列を設定します。
	 * @param list 変換対象のlist
	 * @param labelCol ラベルカラム名
	 * @param lcl ラベルのロケール
	 */
	public static void putPrntSnoLabel2(MCList<? extends MCRow> list, String labelCol, Locale lcl) {
		object(CLAZZ)._putPrntSnoLabel2(list, labelCol, lcl);
	}
	protected void _putPrntSnoLabel2(MCList<? extends MCRow> list, String labelCol, Locale lcl) {
		for (MCRow row : list) {
			putPrntSnoLabel2(row, labelCol, lcl);
		}
	}

	/**
	 * システムパラメータSNO_TYPが手配ＮＯ３を表示する設定の場合、<br>
	 * labelColで指定されたカラムに手配ＮＯ３のラベル用文字列を設定します。
	 * @param row 変換対象のrow
	 * @param labelCol ラベルカラム名
	 * @param lcl ラベルのロケール
	 */
	public static void putPrntSnoLabel3(MCRow row, String labelCol, Locale lcl) {
		object(CLAZZ)._putPrntSnoLabel(row, labelCol, lcl, 3);
	}
	/**
	 * システムパラメータSNO_TYPが手配ＮＯ３を表示する設定の場合、<br>
	 * labelColで指定されたカラムに手配ＮＯ３のラベル用文字列を設定します。
	 * @param list 変換対象のlist
	 * @param labelCol ラベルカラム名
	 * @param lcl ラベルのロケール
	 */
	public static void putPrntSnoLabel3(MCList<? extends MCRow> list, String labelCol, Locale lcl) {
		object(CLAZZ)._putPrntSnoLabel3(list, labelCol, lcl);
	}
	protected void _putPrntSnoLabel3(MCList<? extends MCRow> list, String labelCol, Locale lcl) {
		for (MCRow row : list) {
			putPrntSnoLabel3(row, labelCol, lcl);
		}
	}

	/**
	 * システムパラメータSNO_TYPが手配ＮＯ４を表示する設定の場合、<br>
	 * labelColで指定されたカラムに手配ＮＯ４のラベル用文字列を設定します。
	 * @param row 変換対象のrow
	 * @param labelCol ラベルカラム名
	 * @param lcl ラベルのロケール
	 */
	public static void putPrntSnoLabel4(MCRow row, String labelCol, Locale lcl) {
		object(CLAZZ)._putPrntSnoLabel(row, labelCol, lcl, 4);
	}
	/**
	 * システムパラメータSNO_TYPが手配ＮＯ４を表示する設定の場合、<br>
	 * labelColで指定されたカラムに手配ＮＯ４のラベル用文字列を設定します。
	 * @param list 変換対象のlist
	 * @param labelCol ラベルカラム名
	 * @param lcl ラベルのロケール
	 */
	public static void putPrntSnoLabel4(MCList<? extends MCRow> list, String labelCol, Locale lcl) {
		object(CLAZZ)._putPrntSnoLabel4(list, labelCol, lcl);
	}
	protected void _putPrntSnoLabel4(MCList<? extends MCRow> list, String labelCol, Locale lcl) {
		for (MCRow row : list) {
			putPrntSnoLabel4(row, labelCol, lcl);
		}
	}

	/**
	 * dataColに格納されている値を、viewColで指定されたカラムに設定します。
	 * @param row 変換対象のrow
	 * @param viewCol 表示用カラム名
	 * @param dataCol データカラム名
	 */
	public static void putPrntStr(MCRow row, String viewCol, String dataCol) {
		object(CLAZZ)._putPrntStr(row, viewCol, dataCol);
	}
	protected void _putPrntStr(MCRow row, String viewCol, String dataCol) {
		if (MAC_STR.isNULL_VAL(row.getString(dataCol))
				&& isSame(getSysParm("RPT_NULL_VAL_FLG"), "0")) {
			return;
		}
		row.setValue(viewCol, row.getValue(dataCol));
	}
	/**
	 * dataColに格納されている値を、viewColで指定されたカラムに設定します。
	 * @param list 変換対象のlist
	 * @param viewCol 表示用カラム名
	 * @param dataCol データカラム名
	 */
	public static void putPrntStr(MCList<? extends MCRow> list, String viewCol, String dataCol) {
		object(CLAZZ)._putPrntStr(list, viewCol, dataCol);
	}
	protected void _putPrntStr(MCList<? extends MCRow> list, String viewCol, String dataCol) {
		for (MCRow row : list) {
			putPrntStr(row, viewCol, dataCol);
		}
	}
	// ///////////////////////////////////////////////
	// 帳票ラベルユーティリティ（ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// 検索条件ユーティリティ（ここから）
	// ///////////////////////////////////////////////
	/**
	  * 検索条件の文字列を前方一致・部分一致・後方一致用に加工して返す。<br>
	  * 入力補助画面の検索条件（文字列型）に対して使用する。<br>
	  * 「match_typ」必須（0:前方一致、1:部分一致、2:後方一致、3:完全一致）<br>
	  * @param row クライアントから渡されるRowコンテナ
	  * @param nm 検索条件項目名
	  * @return 検索条件文字列
	  */
	public static String getEditString(MCRow row, String nm) {
		String str = row.getStringNE(nm);
		if (str == null) {
			return str;
		}

		String typ = row.getStringNE("match_typ");
		if (typ == null) {
			return str;
		}
		String[] strArr = MCStringUtil.arrayValueSplit(str);
		StringBuilder sb = new StringBuilder();

		for (String s : strArr) {
			if (s == null || s.equals("")) {
				continue;
			}

			if (typ.equals("0")) {// 前方一致
				sb.append(s).append("%");
			}
			else if (typ.equals("1")) {// 部分一致
				sb.append("%").append(s).append("%");
			}
			else if (typ.equals("2")) {// 後方一致
				sb.append("%").append(s);
			}
			else {// 完全一致
				sb.append(s);
			}
			sb.append(MCStringUtil.getArrayValueDelimiter());
		}
		if (sb.length() == 0) {
			return null;
		}
		sb.deleteCharAt(sb.length()-1);
		return sb.toString();
	}
	// ///////////////////////////////////////////////
	// 検索条件ユーティリティ（ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// 共通ユーティリティ（ここから）
	// ///////////////////////////////////////////////
	/**
	 * コンテナに定義されている項目属性情報を返します。<br>
	 * 取得できなければnullを返します。
	 *
	 * @param container MCRow または MCList
	 * @param group 項目属性グループ
	 * @return 項目属性情報（マップ）
	 */
	protected static Map<String, String> getExtMap(MCContainer container, String group) {
		MCConstRow proto = null;
		MCList<MCRow> l = null;
		if (container instanceof MCRow) {
			proto = (MCConstRow) container;
			l = MCList.create(MCRow.class);
			l.add((MCRow)container);
		}
		else if (container instanceof MCList) {
			l = (MCList) container;
			proto = (MCConstRow)l.createRow();
		}
		else {
			return null;
		}
		return proto.getExtMap(group);
	}

	protected static MCList<MCRow> containerToMCList(MCContainer container) {
		MCList<MCRow> l = null;
		if (container instanceof MCRow) {
			MCRow row = (MCRow)container;
			l = MCList.create(row);
			l.add(row);
		}
		else if (container instanceof MCList) {
			l = (MCList) container;
		}
		else {
			return null;
		}
		return l ;
	}

	protected static int getSysParmInt_ItmSubTyp() {
		int itmSubTyp = Integer.parseInt(getSysParm("ITM_SUB_TYP"));
		if (itmSubTyp < 0 || itmSubTyp > 3) {
			itmSubTyp = 0;
		}
		return itmSubTyp;
	}
	protected static int getSysParmInt_SnoTyp() {
		int snoTyp = Integer.parseInt(getSysParm("SNO_TYP"));
		if (snoTyp < 0 || snoTyp > 4) {
			snoTyp = 0;
		}
		return snoTyp;
	}
	// ///////////////////////////////////////////////
	// 共通ユーティリティ（ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// 定数名称設定関連（ここから）
	// ///////////////////////////////////////////////
	/** 定数名設定用項目属性ＩＤ */
	protected static final String SET_CONST_NM = "CONST";
	protected Map<String, String[]> _aliasMap = new HashMap<>();

	protected static String[] getAlias(MCRow o, String typ) {
		String key = o.getClass().getName() + "." + typ ;
		String[] als = object(CLAZZ)._aliasMap.get(key);
		if (als == null) {
			als = o.getAlias(typ);
			object(CLAZZ)._aliasMap.put(key, als);
		}
		return als;
	}

	/**
	 * 定数項目に対する名称を設定します。
	 */
	public static void setConstNm(MCContainer container) {

		Map<String, String> constMap = getExtMap(container, SET_CONST_NM);
		if (constMap == null) {
			return ;
		}
		MCList<MCRow> l = containerToMCList(container);
		if (l == null) {
			return ;
		}

		for (String typ : constMap.keySet()) {
			String typNm = getTypNm(l, typ);
			if (typNm == null) {
				continue;
			}
			String typeId = constMap.get(typ);
			String mdlId = typeId.substring(0, 2);

			Class cls = MCFactory.getClass(FX_Const.class, "mcframe.common" + mdlId + ".constant." + typeId);

			Class[] params   = new Class[]{ MCList.class, String.class, String.class };
			Object[] args   = new Object[]{ l, typ, typNm };

			MCFactory.invokeStatic(cls, "putNameNE", params, args);
		}
	}
	/**
	 * 区分項目名に対応する区分名項目名を返します。<br>
	 * 「???_typ」->「???_typ_nm」、「???_typ3」->「???_typ_nm3」
	 */
	protected static String getTypNm(MCList<MCRow> l, String typ) {
		// カラムパス
		String nm = cnvToTypNmCol(typ);
		if (nm != null) {
			String cp = cnvToColumnPath(l, nm);
			if (cp != null) {
				return cp;
			}
		}

		// エイリアス
		MCRow o = l.createRow();
		for (String a : getAlias(o, typ)) {
			nm = cnvToTypNmCol(a);
			if (nm != null) {
				String cp = cnvToColumnPath(l, nm);
				if (cp != null) {
					return cp;
				}
			}
		}

		nm = typ + "_nm";
		return cnvToColumnPath(l, nm);
	}

	/**
	 * 区分項目名を区分名項目名に変換します。
	 * 「???_typ」->「???_typ_nm」、「???_typ3」->「???_typ_nm3」
	 */
	protected static String cnvToTypNmCol(String typ) {
		int i = typ.indexOf("_typ");
		if (i >= 0 && typ.length() >= i+4) {
			return typ.substring(0,i+4) + "_nm" + typ.substring(i+4);
		}
		return null;
	}

	/**
	 * Listのカラム名をカラムパスに変換します。
	 * カラムパスが見つからなかった場合はnullを返します。
	 */
	protected static String cnvToColumnPath(MCList<MCRow> l, String col) {
		// カラムパス
		for (String c : l.getColumnPathArray()) {
			if (isSame(c, col)) {
				return c;
			}
		}

		// エイリアス
		MCRow o = l.createRow();
		for (String c : l.getColumnPathArray()) {
			for (String a : getAlias(o, c)) {
				if (isSame(a, col)) {
					return c;
				}
			}
		}

		return null;
	}

	// ///////////////////////////////////////////////
	// 定数名称設定関連（ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// 機能名称設定関連（ここから）
	// ///////////////////////////////////////////////
	/**登録機能ＩＤカラム名*/
	protected static final String $INS_FUNC_ID = "ins_func_id";
	/**登録機能名カラム名*/
	protected static final String $INS_FUNC_NM = "ins_func_nm";
	/**更新機能ＩＤカラム名*/
	protected static final String $UPD_FUNC_ID = "upd_func_id";
	/**更新機能名カラム名*/
	protected static final String $UPD_FUNC_NM = "upd_func_nm";
	/**ラベルのキー*/
	protected static final String KEY_LABEL = "label";


	/**
	 * 登録・更新機能ID項目に対する名称を設定します。
	 *
	 * @param container MCList or MCRow
	 */
	public static void setFuncNm(MCContainer container) {

		MCList<MCRow> l = containerToMCList(container);
		if (l == null) {
			return ;
		}

		for (MCRow r : l) {
			putFuncName(r, $INS_FUNC_ID, $INS_FUNC_NM);
			putFuncName(r, $UPD_FUNC_ID, $UPD_FUNC_NM);
		}
	}
	/**
	 * 機能ID項目に対する名称を設定します。
	 *
	 * @param r　MCRow
	 * @param idCol 機能ID項目名
	 * @param nmCol　機能名称項目名
	 */
	public static void putFuncName(MCRow r, String idCol, String nmCol) {
		if (!r.contains(idCol)) {
			return;
		}
		String id = r.getString(idCol);
		if (isNull(id)) {
			return;
		}
		// スラッシュあり（２パタン）
		//「画面ＩＤ/ロジックＩＤ」->「画面名/ロジック名」
		//「バッチＩＤ/ロジックＩＤ」->「バッチＩＤ/ロジック名」
		if (id.contains("/")) {
			String[] ids = id.split("/");
			String nm1 = MCLocaleConst.label(MCSys.user.locale()).getLabel(getLabelKey(ids[0]));
			if (isNull(nm1)) {
				nm1 = ids[0];
			}
			String nm2 = null;
			if (ids.length > 1) {
				nm2 = MCConst.lgclbl.getLabel(ids[1].substring(0,2), ids[1], null);
			}
			r.setString(nmCol, nm1+"/"+nm2);
		}
		// スラッシュなし
		//「画面ＩＤ」->「画面名」
		else {
			r.setString(nmCol, MCLocaleConst.label(MCSys.user.locale()).getLabel(getLabelKey(id)));
		}
	}
	/**
	 * 機能ラベルのリソースキーを返します。
	 *
	 * @param id　機能ID
	 * @return　機能ラベルのリソースキー
	 */
	protected static String getLabelKey(String id) {
		if (id == null || id.length() < 2) {
			return null;
		}
		return MCConst.createKey(id.substring(0,2), id, KEY_LABEL);
	}
	// ///////////////////////////////////////////////
	// 機能名称設定関連（ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// チェックロジックユーティリティ関連（ここから）
	// ///////////////////////////////////////////////

	/**
	 * 指定したコンテナに対して紐付けＮＯを設定します。
	 * 設定するカラム名はpeg_no固定です。
	 * 紐付けＮＯは0から始まる連番で、指定したコンテナ内ではユニークなＮＯになります。
	 * （1番目に指定したコンテナと2番目に指定されたコンテナに同じ番号が入ることはありません）
	 *
	 * @param peg_no_col 紐付けＮＯのカラム名
	 * @param conts 紐付けＮＯを設定するコンテナ
	 */
	public static void setPegNo(MCContainer... conts) {
		setPegNo("peg_no", conts);

	}

	/**
	 * 指定したコンテナに対して指定したカラム名に紐付けＮＯを設定します。
	 * 紐付けＮＯは0から始まる連番で、指定したコンテナ内ではユニークなＮＯになります。
	 * （1番目に指定したコンテナと2番目に指定されたコンテナに同じ番号が入ることはありません）
	 *
	 * @param peg_no_col 紐付けＮＯのカラム名
	 * @param conts 紐付けＮＯを設定するコンテナ
	 */
	public static void setPegNo(String peg_no_col, MCContainer... conts) {
		long i = 0;
		for (MCContainer cont :conts) {
			if (cont instanceof MCList) {
				MCList l = (MCList)cont;
				for (int j = 0; j < l.size(); j++) {
					MCRow r = l.get(j);
					r.setNumberNE(peg_no_col, i++);
				}
			}
			else {
				MCRow r = (MCRow)cont;
				r.setNumberNE(peg_no_col, i++);
			}
		}
	}

	/**
	 * 紐付けＮＯを元にdestに指定したListのエラーＦＬＧに、srcに指定したListの対応するRowのエラーＦＬＧをコピーします。
	 * 対応するRowが複数ある場合、1件でもエラーＦＬＧがtrueであれば、trueになります。
	 * 対応するRowは紐付けＮＯを元に抽出します。
	 * エラーＦＬＧのカラム名はerr_flg、紐付けＮＯのカラム名はpeg_no固定です。
	 *
	 *
	 * @param dest　コピー先のList
	 * @param src　コピー元のList
	 */
	public static void copyErrFlg(MCList dest, MCList src) {
		copyErrFlg(dest, src, "peg_no", "peg_no");
	}

	/**
	 * 紐付けＮＯを元にdestに指定したListのエラーＦＬＧに、srcに指定したListの対応するRowのエラーＦＬＧをコピーします。
	 * 対応するRowが複数ある場合、1件でもエラーＦＬＧがtrueであれば、trueになります。
	 * 対応するRowは紐付けＮＯを元に抽出します。
	 * エラーＦＬＧとのカラム名と紐付けＮＯのカラム名はそれぞれ指定したカラム名を使用します。
	 *
	 * @param dest　コピー先のList
	 * @param src　コピー元のList
	 * @param dest_peg_no_col コピー先の紐付けＮＯのカラム名
	 * @param src_peg_no_col コピー元の紐付けＮＯのカラム名
	 */
	public static void copyErrFlg(MCList dest, MCList src, String dest_peg_no_col, String src_peg_no_col) {
		// 本来はpeg_noは必ず持つようにしてもらう
		if (!dest.createRow().contains(dest_peg_no_col)) {
			return;
		}
		MCIndexKey k = dest.createIndex(dest_peg_no_col);
		for (int i = 0; i < src.size(); i++)  {
			MCRow srcRow = src.get(i);
			if (!srcRow.getBoolean("err_flg")) {
				continue;
			}
			MCList destSub = dest.subList(k, srcRow.getNumber(src_peg_no_col));
			for (int j = 0; j < destSub.size(); j++)  {
				MCRow destRow = destSub.get(j);
				copyErrFlg(destRow, srcRow);
			}
		}
	}

	/**
	 * destに指定したRowのエラーＦＬＧに、srcに指定したRowのエラーＦＬＧをコピーします。
	 * ただし、コピー先のRowのエラーＦＬＧがtrueの場合はコピーしません。
	 *
	 * @param dest　コピー先のRow
	 * @param src　コピー元のRow
	 */
	public static void copyErrFlg(MCRow dest, MCRow src) {
		if (dest.getBoolean("err_flg")) {
			return;
		}
		dest.setBoolean("err_flg", src.getBoolean("err_flg"));
	}

	/**
	 * 紐付けＮＯを元にdestに指定したListに、srcに指定したListの値をコピーします。
	 * 対応するRowが複数ある場合、srcのListにgetFirstで取得できたRowを採用します。
	 * 対応するRowは紐付けＮＯを元に抽出します。
	 * 紐付けＮＯのカラム名はpeg_no固定です。
	 *
	 *
	 * @param dest　コピー先のList
	 * @param destCols コピー先の項目
	 * @param src　コピー元のList
	 * @param srcCols コピー元の項目
	 */
	public static void copyByPegNo(MCList dest, String[] destCols,  MCList src, String[] srcCols) {
		copyByPegNo(dest, src, "peg_no", destCols, "peg_no", srcCols);
	}

	/**
	 * 紐付けＮＯを元にdestに指定したListに、srcに指定したListの値をコピーします。
	 * 対応するRowが複数ある場合、srcのListにgetFirstで取得できたRowを採用します。
	 * 対応するRowは紐付けＮＯを元に抽出します。
	 *
	 * @param dest　コピー先のList
	 * @param dest_peg_no_col コピー先の紐付けＮＯのカラム名
	 * @param destCols コピー先の項目
	 * @param src　コピー元のList
	 * @param src_peg_no_col コピー元の紐付けＮＯのカラム名
	 * @param srcCols コピー元の項目
	 */
	public static void copyByPegNo(MCList dest, MCList src, String dest_peg_no_col, String[] destCols, String src_peg_no_col, String[] srcCols) {
		MCIndexKey k = src.createIndex(src_peg_no_col);
		for (int i = 0; i < dest.size(); i++)  {
			MCRow destRow = dest.get(i);
			MCRow srcRow = src.getFirst(k, destRow.getNumberNE(dest_peg_no_col));
			if (srcRow == null) {
				continue;
			}
			for (int j = 0; j < destCols.length; j++)  {
				destRow.setValueNE(destCols[j], srcRow.getValueNE(srcCols[j]));
			}
		}
	}

	/**
	 * Rowを元に画面上の行番号を返します。
	 * もしRowに0未満の値が設定されている場合は、その値を返します。
	 *
	 * @param r
	 * @return 画面上の行番号
	 */
	public static MCNumber getClientRowNum(MCRow r) {
		int index = r.getGUIIndex();
		if (index < 0) {
			return new MCNumber(index);
		}
		else {
			return new MCNumber(index + 1);
		}

	}
	// ///////////////////////////////////////////////
	// チェックロジックユーティリティ関連（ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// 小数部有効桁チェックユーティリティ（ここから）
	// ///////////////////////////////////////////////
	/**
	 * 数値項目が指定された小数部有効桁数を超えていないかチェックします。
	 * @param list リスト
	 * @param decPlaceCol 小数部有効桁数項目名
	 * @param numCols 数値項目名
	 * @return メッセージリスト
	 */
	public static <R extends MCRow> MCMessageList checkDecPlace(MCList<R> list, String decPlaceCol, String... numCols) {
		return checkDecPlace(new MCMessageList(), list, decPlaceCol, numCols);
	}
	
	protected static <R extends MCRow> MCMessageList checkDecPlace(MCMessageList l, MCList<R> list, String decPlaceCol, String... numCols) {
		for (MCRow row : list) {
			checkDecPlace(l, row, decPlaceCol, numCols);
		}
		return l;
	}
	/**
	 * 数値項目が指定された小数部有効桁数を超えていないかチェックします。
	 * @param list リスト
	 * @param decPlace 小数部有効桁数
	 * @param numCols 数値項目名
	 * @return メッセージリスト
	 */
	public static <R extends MCRow> MCMessageList checkDecPlace(MCList<R> list, int decPlace, String... numCols) {
		MCMessageList l = new MCMessageList();
		for (MCRow row : list) {
			checkDecPlace(l, row, decPlace, numCols);
		}
		return l;
	}
	/**
	 * 数値項目が指定された小数部有効桁数を超えていないかチェックします。
	 * @param row ロウ
	 * @param decPlaceCol 小数部有効桁数項目名
	 * @param numCols 数値項目名
	 * @return メッセージリスト
	 */
	public static <R extends MCRow> MCMessageList checkDecPlace(R row, String decPlaceCol, String... numCols) {
		return checkDecPlace(new MCMessageList(), row, decPlaceCol, numCols);
	}
	protected static <R extends MCRow> MCMessageList checkDecPlace(MCMessageList l, R row, String decPlaceCol, String... numCols) {
		MCNumber n = row.getNumber(decPlaceCol);
		if (isNull(n)) {
			return l;
		}
		return checkDecPlace(l, row, n.intValue(), numCols);
	}
	/**
	 * 数値項目が指定された小数部有効桁数を超えていないかチェックします。
	 * @param row ロウ
	 * @param decPlace 小数部有効桁数
	 * @param numCols 数値項目名
	 * @return メッセージリスト
	 */
	public static <R extends MCRow> MCMessageList checkDecPlace(R row, int decPlace, String... numCols) {
		return checkDecPlace(new MCMessageList(), row, decPlace, numCols);
	}
	protected static <R extends MCRow> MCMessageList checkDecPlace(MCMessageList l, R row, int decPlace, String... numCols) {
		for (String numCol : numCols) {
			MCNumber n = row.getNumber(numCol);
			if (!isNull(n)) {
				MCNumber n2 = n.setScale(decPlace, RoundingMode.DOWN);
				if (!isSame(n,n2)) {
					l.add(new MCMessage(row, numCol, MAUCL0008,
							getLabel(row, numCol),
							n, decPlace, toDispGUIIndex(row)));
				}
			}
		}
		return l;
	}
	// ///////////////////////////////////////////////
	// 小数部有効桁チェックユーティリティ（ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// NULLチェックユーティリティ（ここから）
	// ///////////////////////////////////////////////
	/**
	 * チェック対象カラムがすべてNULLであるかチェックします。<br>
	 * @param msgId メッセージＩＤ
	 * @param row ロウ
	 * @param chkCols チェック対象カラム
	 * @return メッセージリスト
	 */
	public static MCMessageList checkNull(String msgId, MCRow row, String[] chkCols) {
		MCMessageList msgL = new MCMessageList();
		List<String> l = new ArrayList<String>();
		for (String col : chkCols) {
			if (!isNull(row.getValue(col))) {
				l.add(col);
			}
		}
		if (!l.isEmpty()) {
			msgL.add(new MCMessage(row, l.get(0), msgId, getLabel(row, l.toArray(new String[] {})),
					toDispGUIIndex(row)));
		}
		return msgL;
	}
	// ///////////////////////////////////////////////
	// NULLチェックユーティリティ（ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// NULL文字設定（ここから）
	// ///////////////////////////////////////////////
	/** NULL文字対応項目の項目属性ＩＤ */
	protected static final String NULL_VAL = "NULL_VAL";

	/**
	 * NULL文字項目がnullだった場合にNULL文字を設定する
	 */
	public static void setNullVal(MCContainer container) {

		Map<String, String> map = getExtMap(container, NULL_VAL);
		if (map == null) {
			return ;
		}

		MCList<MCRow> l = containerToMCList(container);
		if (l == null) {
			return ;
		}

		for (MCRow r : l) {
			for (String col : map.keySet()) {
				if (r.getValue(col) == null) {
					r.setValue(col, MAC_STR.NULL_VAL.value());
				}
			}
		}
	}

	// ///////////////////////////////////////////////
	// NULL文字設定（ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// 時刻補完ユーティリティ（ここから）
	// ///////////////////////////////////////////////
	/**
	 * 時刻補完ユーティリティ
	 * メタが#MA.HMかつ、項目名が「**_hm_to」の項目を補完します。<br>
	 * 【上り電文】<br>
	 * NULLの場合：日付項目の値に時分秒に23:59:59を設定した値を設定します。<br>
	 * NOT NULLの場合：秒に59を設定します。<br>
	 * 【下り電文】<br>
	 * 時分秒が00:00:00の場合：項目をnullにします。
	 *
	 * @param container　MCRow または MCList
	 * @param upFlg　上り電文の場合はtrueを指定します。
	 */
	public static void doCompTime(MCContainer container, boolean upFlg) {
		MCMeta[] metaArr = container.getMetaArray();

		MCList<MCRow> l = containerToMCList(container);
		if (l == null) {
			return ;
		}

		for(MCMeta m : metaArr) {
			if (isSame(m.ID(), MA_META.HM.ID())) {
				for (MCRow row : l) {
					// 上り電文
					if (upFlg) {
						MCDate hm = row.getDate(m.name());
						if (m.name().endsWith("hm_to")) {
							String prefix = m.name().substring(0, m.name().length()-5);
							MCDate dt = row.getDateNE(prefix + "dt_to");

							if (isNull(dt)) {
								hm = null;
							}
							else if (isNull(hm)) {
								// 対応する日付＋23:59:59 を設定
								hm = MCDate.valueOf(dt.getYear(), dt.getMonth(),
										dt.getDay(), 23, 59, 59);
							}
							else {
								// 対応する日付＋秒に59を設定
								hm = MCDate.valueOf(dt.getYear(), dt.getMonth(),
										dt.getDay(), hm.getHour(), hm.getMinute(), 59);
							}
						}
						else if (m.name().endsWith("hm_fr")) {
							String prefix = m.name().substring(0, m.name().length()-5);
							MCDate dt = row.getDateNE(prefix + "dt_fr");

							if (isNull(dt)) {
								hm = null;
							}
							else if (isNull(hm)) {
								hm = dt;
							}
							else {
								hm = MCDate.valueOf(dt.getYear(), dt.getMonth(),
										dt.getDay(), hm.getHour(), hm.getMinute(), hm.getSecond());
							}
						}
						row.setDate(m.name(), hm);
					}
					// 下り電文
					else {
						MCDate d = row.getDate(m.name());
						if (!isNull(d) && isSame(d.getHour(), 0)
								&& isSame(d.getMinute(), 0) && isSame(d.getSecond(), 0)) {
							row.setDate(m.name(), null);
						}
					}
				}
			}
		}
	}

	// ///////////////////////////////////////////////
	// 時刻補完ユーティリティ（ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// 棚・ライン無ＦＬＧ補完ユーティリティ（ここから）
	// ///////////////////////////////////////////////
	/**
	 * 棚・ライン無ＦＬＧ補完ユーティリティ
	 * メタが#MA.STR_LN_CDの棚・ラインＣＤに対する棚・ライン無ＦＬＧを補完します。<br>
	 * 棚・ラインＣＤがNULL文字の場合：棚・ライン無ＦＬＧにtrueを設定します。<br>
	 *
	 * @param container　MCRow または MCList
	 */
	public static void doCompStrLnNoneFlg(MCContainer container) {
		MCMeta[] metaArr = container.getMetaArray();

		MCList<MCRow> l = containerToMCList(container);
		if (l == null) {
			return ;
		}

		for(MCMeta m : metaArr) {
			if (isSame(m.ID(), MA_META.STR_LN_CD.ID())) {
				for (MCRow row : l) {
					if (MAC_STR.isNULL_VAL(row.getString(m.name()))) {
						String flgNm = m.name() + "_none_flg";
						row.setBooleanNE(flgNm, true);
					}
				}
			}
		}
	}

	// ///////////////////////////////////////////////
	// 棚・ライン無ＦＬＧ補完ユーティリティ（ここまで）
	// ///////////////////////////////////////////////

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
	 * @return 品目情報
	 */
	public static String toDispItm(String itm_cd, String itm_sub1, String itm_sub2, String itm_sub3) {
		StringBuilder sb = new StringBuilder();

		int itmSubTyp = getSysParmInt_ItmSubTyp();

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
	 * システムパラメータ「SNO_TYP」を参照して、有効な手配ＮＯのみを表示します。
	 * @param sno1 手配ＮＯ１
	 * @param sno2 手配ＮＯ２
	 * @param sno3 手配ＮＯ３
	 * @param sno4 手配ＮＯ４
	 * @return 手配ＮＯ情報
	 */
	public static String toDispSno(String sno1, String sno2, String sno3, String sno4) {
		StringBuilder sb = new StringBuilder();

		int snoTyp = getSysParmInt_SnoTyp();

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
		return new MCMessage(MAUDL0002, row.getGUIIndex() + 1).toString(MCLocaleConst
				.message(MCSys.user.locale()));
	}

	// ///////////////////////////////////////////////
	// メッセージバインド用のユーティリティ（ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// 日付丸めユーティリティ（ここから）
	// ///////////////////////////////////////////////
	/**
	 * 日付丸めユーティリティ<br>
	 * メタにしたがって日付項目を丸めます。<br>
	 * TMは分まで、DTは日付まで、YMは月まで。
	 *
	 * @param container　MCRow または MCList
	 */
	public static void doTruncDate(MCContainer container) {
		String[] cols = container.getColumnPathArray();

		MCList<MCRow> l = containerToMCList(container);
		if (l == null) {
			return ;
		}

		for(String col :cols) {
			MCMeta m = container.getMeta(col);
			if (isSame(m.ID(), MA_META.TM.ID())) {
				truncDate(l, col, MCDateFieldType.MINUTE);
			}
			else if (isSame(m.ID(), MA_META.DT.ID())) {
				truncDate(l, col, MCDateFieldType.DAY);
			}
			else if (isSame(m.ID(), MA_META.YM.ID())) {
				truncDate(l, col, MCDateFieldType.MONTH);
			}
		}
	}

	/**
	 * 日付丸めユーティリティ<br>
	 * 指定された日時フィールドで日付項目を丸めます。
	 *
	 * @param l　対象リスト
	 * @param dtColNm　日付項目名
	 * @param field　日時フィールド
	 */
	public static void truncDate(MCList<? extends MCRow> l, String dtColNm, MCDateFieldType field) {
		for (MCRow row : l) {
			MCDate dt = row.getDate(dtColNm);
			if (!isNull(dt)) {
				row.setDate(dtColNm, dt.trunc(field));
			}
		}
	}

	// ///////////////////////////////////////////////
	// 日付丸めユーティリティ（ここまで）
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
		return object(CLAZZ)._concatAddress(addr1, addr2, addr3, addr4);
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
	 * ロケールＣＤの存在チェックを行う場合は、Checkerを利用してください。<br>
	 * Checkerのinit()でdoChkLcl(true)を記述することで存在チェックを実行します。
	 */
	@Deprecated
	public static MCMessageList checkLocaleEntry(String lcl_cd) {
		MCMessageList msgL = new MCMessageList();
		return msgL;
	}
	/**
	 * ロケールＣＤの存在チェックを行う場合は、Checkerを利用してください。<br>
	 * Checkerのinit()でdoChkLcl(true)を記述することで存在チェックを実行します。
	 */
	@Deprecated
	public static MCMessageList checkLocaleEntry(MCRow r, String lclColNm) {
		MCMessageList msgL = new MCMessageList();
		String lcl_cd = r.getStringNE(lclColNm);
		if (!isNull(lcl_cd)) {
			if (getLclMap().containsKey(lcl_cd)) {
				return msgL;
			}
			msgL.add(new MCMessage(r, lclColNm, MAUCL0112, toDispGUIIndex(r)));
		}
		return msgL;
	}
	protected static Map<String, String> _lclMap;
	protected static Map<String, String> getLclMap() {
		if (_lclMap == null) {
			_lclMap = new HashMap<>();
			MCList<MCRow> lst = MCConfig.common.getEntryLocaleList(
					LocaleEntryCols.$o_lcl_cd, LocaleEntryCols.$o_lcl_nm);
			for (MCRow row : lst) {
				_lclMap.put(row.getStringNE(LocaleEntryCols.$o_lcl_cd),
						row.getStringNE(LocaleEntryCols.$o_lcl_nm));
			}
		}
		return _lclMap;
	}

	// ///////////////////////////////////////////////
	// メッセージプールのユーティリティ（ここから）
	// ///////////////////////////////////////////////
	
	protected MCMessageList _saveMessageList = null;
	/**
	 * メッセージプールの状態をセーブします。
	 * セーブした状態に戻すには、rollbackMessagePoolを実行します。<br>
	 */
	public static void saveMessagePool() {
		object(CLAZZ)._saveMessagePool();
	}

	protected void _saveMessagePool() {
		_saveMessageList = new MCMessageList();
		_saveMessageList.addAll(MCMessagePool.getMessageList());
	}
	/**
	 * メッセージプールの状態をセーブしたタイミングの状態に戻します。
	 * セーブしていない場合は何もしません。
	 * 実行すると、saveMessagePoolを実行していない状態にします。<br>
	 */
	public static void rollbackMessagePool() {
		object(CLAZZ)._rollbackMessagePool();
	}

	protected void _rollbackMessagePool() {
		if (_saveMessageList == null) {
			return;
		}
		MCMessagePool.clear();
		MCMessagePool.addAll(_saveMessageList);
		_saveMessageList = null;
	}
	// ///////////////////////////////////////////////
	// メッセージプールのユーティリティ（ここまで）
	// ///////////////////////////////////////////////
	//FMCB CUSTOM END
}