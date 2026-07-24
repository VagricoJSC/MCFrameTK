package mcframe.serverMABG.MABGL0260;

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
import mcframe.serverMABG.MABGL0260.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABGL_CoefAutoReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABGL_CoefAutoReg_MC extends MABGL_CoefAutoReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * CoefAuto_UpdChk01オペレーション.<p>
	 *
	 * 配賦係数自動構成マスタの登録前のチェックを行います。<br>
	 */
	public class CoefAuto_UpdChk01 extends MABGL_CoefAutoReg_MC_A.CoefAuto_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();

			for (CoefAuto_UpdChk01_DtlR r :up0()) {
				String CoefConfTyp = r.coef_config_typ();
				String ItmGrpTyp = r.itm_grp_typ();
				
				if(!isNull(ItmGrpTyp) &&
						!((MAC_COEF_CONFIG_TYP.isITM_GRP1(CoefConfTyp) && MAC_ITM_GRP_TYP.isGRP1(ItmGrpTyp))
						||(MAC_COEF_CONFIG_TYP.isITM_GRP2(CoefConfTyp) && MAC_ITM_GRP_TYP.isGRP2(ItmGrpTyp))
						||(MAC_COEF_CONFIG_TYP.isITM_GRP3(CoefConfTyp) && MAC_ITM_GRP_TYP.isGRP3(ItmGrpTyp))
						||(MAC_COEF_CONFIG_TYP.isITM_GRP4(CoefConfTyp) && MAC_ITM_GRP_TYP.isGRP4(ItmGrpTyp))
						||(MAC_COEF_CONFIG_TYP.isITM_GRP5(CoefConfTyp) && MAC_ITM_GRP_TYP.isGRP5(ItmGrpTyp))
						||(MAC_COEF_CONFIG_TYP.isITM_GRP6(CoefConfTyp) && MAC_ITM_GRP_TYP.isGRP6(ItmGrpTyp))
						||(MAC_COEF_CONFIG_TYP.isITM_GRP7(CoefConfTyp) && MAC_ITM_GRP_TYP.isGRP7(ItmGrpTyp))
						||(MAC_COEF_CONFIG_TYP.isITM_GRP8(CoefConfTyp) && MAC_ITM_GRP_TYP.isGRP8(ItmGrpTyp))
						||(MAC_COEF_CONFIG_TYP.isITM_GRP9(CoefConfTyp) && MAC_ITM_GRP_TYP.isGRP9(ItmGrpTyp))
						||(MAC_COEF_CONFIG_TYP.isITM_GRP10(CoefConfTyp) && MAC_ITM_GRP_TYP.isGRP10(ItmGrpTyp)))){
					msgList.add(new MCMessage(r, CoefAuto_UpdChk01_DtlR.$coef_config_typ, MABGL0117, CoefConfTyp, ItmGrpTyp, toDispGUIIndex(r)));
				}
				if(!isNull(r.itm_jnl_cd()) && !MAC_COEF_CONFIG_TYP.isITM_JNL(CoefConfTyp)){
					msgList.add(new MCMessage(r, CoefAuto_UpdChk01_DtlR.$itm_jnl_cd, MABGL0118, toDispGUIIndex(r)));
				}
				if (!isNull(r.itm_grp_cd())
						&& !(MAC_COEF_CONFIG_TYP.isITM_GRP1(CoefConfTyp)
								|| MAC_COEF_CONFIG_TYP.isITM_GRP2(CoefConfTyp)
								|| MAC_COEF_CONFIG_TYP.isITM_GRP3(CoefConfTyp)
								|| MAC_COEF_CONFIG_TYP.isITM_GRP4(CoefConfTyp)
								|| MAC_COEF_CONFIG_TYP.isITM_GRP5(CoefConfTyp)
								|| MAC_COEF_CONFIG_TYP.isITM_GRP6(CoefConfTyp)
								|| MAC_COEF_CONFIG_TYP.isITM_GRP7(CoefConfTyp)
								|| MAC_COEF_CONFIG_TYP.isITM_GRP8(CoefConfTyp)
								|| MAC_COEF_CONFIG_TYP.isITM_GRP9(CoefConfTyp)
								|| MAC_COEF_CONFIG_TYP.isITM_GRP10(CoefConfTyp))) {
					msgList.add(new MCMessage(r, CoefAuto_UpdChk01_DtlR.$itm_grp_cd, MABGL0119, toDispGUIIndex(r)));
				}
				if(!isNull(r.unit_cd()) && isNull(r.qty_unit_typ())){
					msgList.add(new MCMessage(r, CoefAuto_UpdChk01_DtlR.$unit_cd, MABGL0120, toDispGUIIndex(r)));
				}
			}
			return msgList;
		}
	}
	/**
	 * CoefAuto_Upd01オペレーション.<p>
	 *
	 * 配賦係数自動構成マスタの登録を行います。<br>
	 */
	public class CoefAuto_Upd01 extends MABGL_CoefAutoReg_MC_A.CoefAuto_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CoefAuto_DelChk01オペレーション.<p>
	 *
	 * 配賦係数自動構成マスタの削除前のチェックを行います。<br>
	 */
	public class CoefAuto_DelChk01 extends MABGL_CoefAutoReg_MC_A.CoefAuto_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CoefAuto_Del01オペレーション.<p>
	 *
	 * 配賦係数自動構成マスタの削除を行います。<br>
	 */
	public class CoefAuto_Del01 extends MABGL_CoefAutoReg_MC_A.CoefAuto_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 配賦係数自動構成マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABGL_CoefAutoReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(
				MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if(builder.getBaseDbc() instanceof MAM_COEF_AUTO_R){
				dbcCustomizeSub(builder);
			}
		}

		protected void dbcCustomizeSub( MCQueryApiBuilder builder) {

			MAM_ALC_COEF_R alc_coef1 = MAM_ALC_COEF_R.create(MAM_COEF_AUTO_R.$ALC_COEF1);
			builder.addSelect((alc_coef1.coef_config_typ).as("coef_config_typ"));
			builder.addSelect((alc_coef1.qty_unit_typ).as("qty_unit_typ"));
			
			/*期の検索条件をwhere句に追加*/
			MAM_COEF_AUTO_R t = MAM_COEF_AUTO_R.create(builder.getBaseDbcAlias());
			builder.addWhereWithCutOffAnd(t.term.gte(bind(Srch01_CndR.$term_fr)));
			builder.addWhereWithCutOffAnd(t.term.lte(bind(Srch01_CndR.$term_to)));
			}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 配賦係数自動構成マスタの登録を行います。<br>
	 */
	public class Upd01 extends MABGL_CoefAutoReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 配賦係数自動構成マスタの削除を行います。<br>
	 */
	public class Del01 extends MABGL_CoefAutoReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}