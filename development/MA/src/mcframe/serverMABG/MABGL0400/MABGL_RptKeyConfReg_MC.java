package mcframe.serverMABG.MABGL0400;

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
import mcframe.serverMABG.MABGL0400.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MABGL_RptKeyConfReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABGL_RptKeyConfReg_MC extends MABGL_RptKeyConfReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * RptKeyConf_UpdChk01オペレーション.<p>
	 *
	 * 原価レポートキー構成マスタの登録前のチェックを行います。<br>
	 */
	public class RptKeyConf_UpdChk01 extends MABGL_RptKeyConfReg_MC_A.RptKeyConf_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<RptKeyConf_UpdChk01_DtlR> notErrL = getChkList(up0());

			if (!isNull(up1().itm_grp_typ())) {
				for (RptKeyConf_UpdChk01_DtlR upR : notErrL){
					if (!isSame(up1().itm_grp_typ(), upR.itm_grp_typ())) {
						msgL.add(new MCMessage(upR, RptKeyConf_UpdChk01_DtlR.$itm_grp_cd, MABGL0121, upR.itm_grp_cd(), toDispGUIIndex(upR)));
					}
				}
			}
			return msgL;
		}
	}
	/**
	 * RptKeyConf_Upd01オペレーション.<p>
	 *
	 * 原価レポートキー構成マスタの登録を行います。<br>
	 */
	public class RptKeyConf_Upd01 extends MABGL_RptKeyConfReg_MC_A.RptKeyConf_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * RptKeyConf_DelChk01オペレーション.<p>
	 *
	 * 原価レポートキー構成マスタの削除前のチェックを行います。<br>
	 */
	public class RptKeyConf_DelChk01 extends MABGL_RptKeyConfReg_MC_A.RptKeyConf_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * RptKeyConf_Del01オペレーション.<p>
	 *
	 * 原価レポートキー構成マスタの削除を行います。<br>
	 */
	public class RptKeyConf_Del01 extends MABGL_RptKeyConfReg_MC_A.RptKeyConf_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 原価レポートキー構成マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABGL_RptKeyConfReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void condCustomize(MCRow cond) {
			super.condCustomize(cond);

			cond.addDateColumn(MAM_COST_DPT_R.$term, up0().this_term());
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(
				MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			
			if (builder.getBaseDbc() instanceof MAM_RPT_KEY_CONF_R){
				dbcCustomizeSub(builder);
			}
		}
		
		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {
			
			MAM_RPT_KEY_CONF_R t = MAM_RPT_KEY_CONF_R.create(builder.getBaseDbcAlias());
			MAM_COST_DPT_R dpt = MAM_COST_DPT_R.create("DPT");

			builder.addSelect(dpt.dpt_nm);
			builder.addLeftOuterJoin(dpt, bind("term").eq(dpt.term)
					.and(t.dpt_cd.eq(dpt.dpt_cd)));
			
		}

	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 原価レポートキー構成マスタの登録を行います。（マスタ画面用）<br>
	 */
	public class Upd01 extends MABGL_RptKeyConfReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 原価レポートキー構成マスタの削除を行います。<br>
	 */
	public class Del01 extends MABGL_RptKeyConfReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}