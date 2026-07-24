package mcframe.serverMABS.MABSL0020;

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
import mcframe.serverMABS.MABSL0030.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABSL_BomReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABSL_BomReg_MC extends MABSL_BomReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * ＢＯＭマスタの検索を行います。<br>
	 */
	public class Srch01 extends MABSL_BomReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * ＢＯＭマスタの登録を行います。<br>
	 */
	public class Upd01 extends MABSL_BomReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void beforeDefChk(MCMessageList msgList) {
			super.beforeDefChk(msgList);

			checkParentExists(msgList);
		}
		protected void checkParentExists(MCMessageList msgList) {
			if(up0().isEmpty()) {
				return ;
			}
			Bom_UpdChk01_DtlR r = up0().get(0);

			// 訂正モード時はチェックしない
			if (isSame(up1().ope(), "4")) {
				return ;
			}
			MAM_BOM_R t = MAM_BOM_R.create("T");

			int i = execDbCount("MABSL0020_MAM_BOM_S01", t, t.par_itm_cd.eq(bind("par_itm_cd"))
					.and(t.par_itm_sub1.eq(bind("par_itm_sub1")))
					.and(t.par_itm_sub2.eq(bind("par_itm_sub2")))
					.and(t.par_itm_sub3.eq(bind("par_itm_sub3")))
					.and(t.wg_cd.eq(nvl(bind("wg_cd"), value(MAC_STR.NULL_VAL.value()))))
					.and(t.bom_ptn.eq(bind("bom_ptn"))), r);
			if (i > 0) {
				msgList.add(new MCMessage(MABSL0138, 
						toDispItm(r.par_itm_cd(), r.par_itm_sub1(), r.par_itm_sub2(), r.par_itm_sub3()),
						nvl(r.wg_cd(), MAC_STR.NULL_VAL.value()),
						r.bom_ptn()
						));
			}
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * ＢＯＭマスタの削除を行います。<br>
	 */
	public class Del01 extends MABSL_BomReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}