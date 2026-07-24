package mcframe.serverMAUC.MAUCL0080;

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
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
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

//FMCB CUSTOM_IMPORT END

/**
 * "MAUCL_StdUpriUtil"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MAUCL_StdUpriUtil_MC extends MAUCL_StdUpriUtil_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 品目、期、ＷＧ ＣＤに紐付く標準単価を取得します。<br>
	 */
	public class Srch01 extends MAUCL_StdUpriUtil_MC_A.Srch01 {
		@Override
		protected void call() {
			down0().std_upri(getStdCost(
				up0().itm_cd(),
				up0().itm_sub1(),
				up0().itm_sub2(),
				up0().itm_sub3(),
				up0().dt(),
				up0().wg_cd(),
				up0().std_upri_sel_typ()));
		}
	}

	/**
	 * 対象の品目、期、ＷＧ ＣＤに紐付く標準単価を取得します。
	 *
	 * @return 標準単価
	 */
	public static MCNumber getStdCost(
		String itm_cd,
		String itm_sub1,
		String itm_sub2,
		String itm_sub3,
		MCDate dt,
		String wg_cd,
		String std_upri_sel_typ) {

		MCRow r = MCRow.create();
		r.addNumberColumn("std_upri");
		r.setStringNE("itm_cd", itm_cd);
		r.setStringNE("itm_sub1", itm_sub1);
		r.setStringNE("itm_sub2", itm_sub2);
		r.setStringNE("itm_sub3", itm_sub3);
		r.setStringNE("wg_cd", wg_cd);
		r.setStringNE("std_upri_sel_typ", std_upri_sel_typ);

		sql(createSqlId(LOGIC_ID, "MAPA_STD_COST$F_GET_STD_UPRI", "getStdCost"))
				.mainQuery()
				.select(MAPA_STD_COST$F_GET_STD_UPRI(
						bind("itm_cd"),
						bind("itm_sub1"),
						bind("itm_sub2"),
						bind("itm_sub3"),
						value(dt),
						bind("wg_cd"),
						bind("std_upri_sel_typ")).as("std_upri"))
				.executeQuery(r, r);

		return r.getNumberNE("std_upri");
	}
	
	/**
	 * 対象の品目、棚卸基準日、ＷＧ ＣＤに紐付く標準単価を一括で設定します。
	 *
	 */
	public static void getStdCostL(String stdUpriCol ,MCList<? extends MCRow> tgtL, 
			String itmCdCol, String itmSub1Col, String itmSub2Col, String itmSub3Col, 
			String dtCol, String wgCdCol, String stdUpriSelTypCol) {

		execDbFuncBatch(
				createSqlId(LOGIC_ID, "MAPA_STD_COST$F_GET_STD_UPRI", "getStdCostL"),
				MABCFunction.getFunctionExecuter("MAPA_STD_COST$F_GET_STD_UPRI"), stdUpriCol,
				tgtL, itmCdCol, itmSub1Col, itmSub2Col, itmSub3Col, dtCol, wgCdCol, stdUpriSelTypCol);
	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 品目、日付、ＷＧ ＣＤに紐付く標準単価を一括で取得します。<br>
	 */
	public class Srch02 extends MAUCL_StdUpriUtil_MC_A.Srch02 {
		@Override
		protected void call() {
			getStdCostL(StdCostListR.$std_upri, up0(), StdCostListR.$itm_cd, StdCostListR.$itm_sub1,
					StdCostListR.$itm_sub2, StdCostListR.$itm_sub3, StdCostListR.$dt, StdCostListR.$wg_cd,
					StdCostListR.$std_upri_sel_typ);
			down0().setAll(up0());
		}
	}

	//FMCB CUSTOM END
}