package mcframe.serverMSBB.MSBBL9010;

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
import mcframe.serverMB.dbc.*;
import mcframe.serverMS.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMS.dbc.MSFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMS.dbc.MSBAFunction.*;
import static mcframe.serverMS.dbc.MSBBFunction.*;
import static mcframe.serverMS.dbc.MSBCFunction.*;
import static mcframe.serverMS.dbc.MSBDFunction.*;
import static mcframe.serverMS.dbc.MSBEFunction.*;
import static mcframe.serverMS.dbc.MSBFFunction.*;
import static mcframe.serverMS.dbc.MSBGFunction.*;
import static mcframe.serverMS.dbc.MSBHFunction.*;
import static mcframe.serverMS.dbc.MSBIFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBBL_QtnSlsBase"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBBL_QtnSlsBase_MC extends MSBBL_QtnSlsBase_MC_A{
	//FMCB CUSTOM START

	/**
	 * 手配NO１－４のいずれかに値が設定されているかどうかを判定する
	 * 
	 * @param r 判定対象の行
	 * @return 手配NO１－４のいずれかに値が設定されている場合にtrue
	 */
	protected boolean hasSno(MCRow r, String... columnNames) {

		String sno1 = "sno1";
		String sno2 = "sno2";
		String sno3 = "sno3";
		String sno4 = "sno4";

		if (columnNames != null && columnNames.length == 4) {
			sno1 = columnNames[0];
			sno2 = columnNames[1];
			sno3 = columnNames[2];
			sno4 = columnNames[3];
		}

		return !isSame(nvl(r.getString(sno1), MAC_STR.NULL_VAL.value()),
				MAC_STR.NULL_VAL.value())
				|| !isSame(nvl(r.getString(sno2), MAC_STR.NULL_VAL.value()),
						MAC_STR.NULL_VAL.value())
				|| !isSame(nvl(r.getString(sno3), MAC_STR.NULL_VAL.value()),
						MAC_STR.NULL_VAL.value())
				|| !isSame(nvl(r.getString(sno4), MAC_STR.NULL_VAL.value()),
						MAC_STR.NULL_VAL.value());
	}

	/**
	 * 案件・手配ＮＯ紐付け情報登録
	 * @param sno1
	 * @param wrk_no
	 * @param row 明細行（エラーが起きたときに行番号を表示する）
	 */
	protected void regWrkNoSno1(String sno1, String wrk_no, MCRow row) {
		//レコード存在チェック
		MST_WRK_SNO_R wrkR = MST_WRK_SNO_R.create("T");
		MCQueryApiBuilder wrkR_bldr = MCQueryApiBuilder.create(wrkR);
		int cnt = dbSelectKey("MSBBL9010_MST_WRK_SNO_S01", wrkR, wrkR_bldr, sno1);
		
		if (cnt == 0) {
			wrkR.sno1(sno1);
			wrkR.wrk_no(wrk_no);
			dbInsertEx("MSBBL9010_MST_WRK_SNO_I01", wrkR, wrkR_bldr);
		}
		else if (!isSame(wrkR.wrk_no(), wrk_no)) {
			throw new MCAppException(row, null, MSBBL0184, sno1, wrkR.wrk_no(), toDispGUIIndex(row));
		}
	}

	/**
	 * 原価金額取得<br>
	 * 原価単価と数量から原価金額を取得する
	 * 
	 * @param std_cost 原価単価
	 * @param inpt_unit_qty 入力単位数量
	 * @param inpt_unit_cd 入力単位コード
	 * @param itm_cd 品目コード
	 * @param stk_mng_typ 在庫管理区分
	 * @return 原価金額
	 */
	protected MCNumber getCostAmt(MCNumber std_cost, MCNumber trd_unit_qty,
			String trd_unit_cd, String itm_cd, String itm_sub1, String itm_sub2,
			String itm_sub3) {

		if (isNull(std_cost)) {
			return null;
		}
		MCNumber base_unit_qty = getBaseUnitQty(trd_unit_qty,trd_unit_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3);		
		return std_cost.multiply(base_unit_qty, getBaseCur().amt_dec_place().intValue(),
				MAC_RND_TYP.RNDOFF.toMC());
	}
	
	/**
	 * 原価金額取得<br>
	 * 原価単価と数量から原価金額を取得する
	 * 
	 * @param std_cost 原価単価
	 * @param inpt_unit_qty 入力単位数量
	 * @param inpt_unit_cd 入力単位コード
	 * @param itm_cd 品目コード
	 * @param stk_mng_typ 在庫管理区分
	 * @return 原価金額
	 */
	protected MCNumber getBaseUnitQty(MCNumber trd_unit_qty,
			String trd_unit_cd, String itm_cd, String itm_sub1, String itm_sub2,
			String itm_sub3) {
		MAVM_ITM_UNIT_R itmUnitR = MAVM_ITM_UNIT_R.create("T");
		itmUnitR.itm_cd(itm_cd);
		itmUnitR.itm_sub1(itm_sub1);
		itmUnitR.itm_sub2(itm_sub2);
		itmUnitR.itm_sub3(itm_sub3);
		itmUnitR.unit_cd(trd_unit_cd);
		dbSelectKey("MSBBL9010_MAVM_ITM_UNIT_S01", itmUnitR, MCQueryApiBuilder.create(itmUnitR), itmUnitR);
		
		//基準単位の小数部有効桁数、基準単位の単位換算端数処理区分の取得
		MAM_ITM_R t1 = MAM_ITM_R.create("T1");
		MAVM_ITM_UNIT_R itmBaseUnitR = MAVM_ITM_UNIT_R.create("T");
		MCQueryApiBuilder itmBaseUnitR_bldr = MCQueryApiBuilder.create(itmBaseUnitR);
		itmBaseUnitR_bldr.addInnerJoin(t1,
				bracket(itmBaseUnitR.itm_cd.eq(t1.itm_cd)
						.and(itmBaseUnitR.itm_sub1.eq(t1.itm_sub1))
						.and(itmBaseUnitR.itm_sub2.eq(t1.itm_sub2))
						.and(itmBaseUnitR.itm_sub3.eq(t1.itm_sub3))
						.and(itmBaseUnitR.unit_cd.eq(t1.unit_cd))));
		itmBaseUnitR_bldr.setWhere(t1.itm_cd.eq(bind("1")), itm_cd);
		itmBaseUnitR_bldr.addWhereWithAnd(t1.itm_sub1.eq(bind("1")), itm_sub1);
		itmBaseUnitR_bldr.addWhereWithAnd(t1.itm_sub2.eq(bind("1")), itm_sub2);
		itmBaseUnitR_bldr.addWhereWithAnd(t1.itm_sub3.eq(bind("1")), itm_sub3);
		dbSelect("MSBBL9010_MAVM_ITM_UNIT_S02", itmBaseUnitR, itmBaseUnitR_bldr);
		
		MCNumber base_unit_qty = convToBaseUnit(trd_unit_qty, itmUnitR.conv_base_qty(),
				itmUnitR.conv_qty(), itmBaseUnitR.dec_place(), itmBaseUnitR.rnd_typ());
		return base_unit_qty;
	}
	//FMCB CUSTOM END
}