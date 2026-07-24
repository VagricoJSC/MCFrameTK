package mcframe.serverMABG.MABGL0340;

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
import mcframe.serverMABG.MABGL0340.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABGL_AlcPtnSelReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABGL_AlcPtnSelReg_MC extends MABGL_AlcPtnSelReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * AlcPtnSel_UpdChk01オペレーション.<p>
	 *
	 * 配賦パタン選択マスタの登録前のチェックを行います。<br>
	 */
	public class AlcPtnSel_UpdChk01 extends MABGL_AlcPtnSelReg_MC_A.AlcPtnSel_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgLst = super.doServerCheckBase();
			
			msgLst.addAll(checkWritableWgCdDac(up0(),AlcPtnSel_UpdChk01_DtlR.$wg_cd));
			return msgLst;
		}
	}
	/**
	 * AlcPtnSel_Upd01オペレーション.<p>
	 *
	 * 配賦パタン選択マスタの登録を行います。<br>
	 */
	public class AlcPtnSel_Upd01 extends MABGL_AlcPtnSelReg_MC_A.AlcPtnSel_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AlcPtnSel_DelChk01オペレーション.<p>
	 *
	 * 配賦パタン選択マスタの削除前のチェックを行います。<br>
	 */
	public class AlcPtnSel_DelChk01 extends MABGL_AlcPtnSelReg_MC_A.AlcPtnSel_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgLst = super.doServerCheckBase();
			
			msgLst.addAll(checkWritableWgCdDac(up0(),AlcPtnSel_DelChk01_DtlR.$wg_cd));
			return msgLst;
		}
	}
	/**
	 * AlcPtnSel_Del01オペレーション.<p>
	 *
	 * 配賦パタン選択マスタの削除を行います。<br>
	 */
	public class AlcPtnSel_Del01 extends MABGL_AlcPtnSelReg_MC_A.AlcPtnSel_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 配賦パタン選択マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABGL_AlcPtnSelReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(
				MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_ALC_PTN_SEL_R) {
				dbcCustomizeSub(builder);
			}
			
		}
		
		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {
			
			MAM_ALC_AC_R alc_ac1 = MAM_ALC_AC_R.create(MAM_ALC_PTN_SEL_R.$ALC_AC1);
			MAM_ALC_PTN_SEL_R t = MAM_ALC_PTN_SEL_R.create(builder.getBaseDbcAlias());
			MAVM_RD_WG_R S1WG2 = MAVM_RD_WG_R.create("WG2");
			builder.addWhereWithCutOffAnd(t.term.gte(bind(Srch01_CndR.$term_fr)));
			builder.addWhereWithCutOffAnd(t.term.lte(bind(Srch01_CndR.$term_to)));
			builder.addWhereWithCutOffAnd(alc_ac1.alc_ac_grp_cd1.like(bind(Srch01_CndR.$alc_ac_grp_cd1)));
			builder.addWhereWithCutOffAnd(alc_ac1.alc_ac_grp_cd2.like(bind(Srch01_CndR.$alc_ac_grp_cd2)));
			builder.addWhereWithCutOffAnd(alc_ac1.alc_ac_grp_cd3.like(bind(Srch01_CndR.$alc_ac_grp_cd3)));
			builder.addWhereWithAnd(exists(subQuery().select(S1WG2.prAll()) .from(S1WG2)
					.where( value(0).eq(value(0))
							.and(t.wg_cd.eq(S1WG2.wg_cd)) )));
		}
		
		@Override
		protected void up_SELECT_c0_0(MAM_ALC_PTN_SEL_R dest, Srch01_CndR src) {
			super.up_SELECT_c0_0(dest, src);
			
			dest.setStringNE(Srch01_CndR.$alc_ac_grp_cd1, src.alc_ac_grp_cd1());
			dest.setStringNE(Srch01_CndR.$alc_ac_grp_cd2, src.alc_ac_grp_cd2());
			dest.setStringNE(Srch01_CndR.$alc_ac_grp_cd3, src.alc_ac_grp_cd3());
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 配賦パタン選択マスタの登録を行います。<br>
	 */
	public class Upd01 extends MABGL_AlcPtnSelReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 配賦パタン選択マスタの削除を行います。<br>
	 */
	public class Del01 extends MABGL_AlcPtnSelReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}