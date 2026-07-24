package mcframe.serverMABC.MABCL2060;

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
import mcframe.serverMABC.MABCL2060.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_AlcAcReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_AlcAcReg_MC extends MABCL_AlcAcReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * AlcAc_UpdChk01オペレーション.<p>
	 *
	 * 配賦科目マスタの登録前のチェックを行います。<br>
	 */
	public class AlcAc_UpdChk01 extends MABCL_AlcAcReg_MC_A.AlcAc_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(AlcAc_UpdChk01_DtlR r : up0()){
				if (isNotCd(r.alc_ac_cd())){
					msgList.add(new MCMessage(r, AlcAc_UpdChk01_DtlR.$alc_ac_cd, MABCL0306, 
									getLabel(r, AlcAc_UpdChk01_DtlR.$alc_ac_cd), r.alc_ac_cd(), toDispGUIIndex(r)));
					continue;
				}
				if (r.del_flg()) {
					continue ;
				}
				if (r.getBooleanNE("err_flg")) {
					continue;
				}
			}
			return msgList;
		}
	}
	/**
	 * AlcAc_Upd01オペレーション.<p>
	 *
	 * 配賦科目マスタの登録を行います。<br>
	 */
	public class AlcAc_Upd01 extends MABCL_AlcAcReg_MC_A.AlcAc_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AlcAcLcl_UpdChk01オペレーション.<p>
	 *
	 * 配賦科目名称マスタの登録前のチェックを行います。<br>
	 */
	public class AlcAcLcl_UpdChk01 extends MABCL_AlcAcReg_MC_A.AlcAcLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AlcAcLcl_Upd01オペレーション.<p>
	 *
	 * 配賦科目名称マスタの登録を行います。<br>
	 */
	public class AlcAcLcl_Upd01 extends MABCL_AlcAcReg_MC_A.AlcAcLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AlcAc_DelChk01オペレーション.<p>
	 *
	 * 配賦科目マスタ、配賦科目名称マスタの削除前のチェックを行います。<br>
	 */
	public class AlcAc_DelChk01 extends MABCL_AlcAcReg_MC_A.AlcAc_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AlcAc_Del01オペレーション.<p>
	 *
	 * 配賦科目マスタ、配賦科目名称マスタの削除を行います。<br>
	 */
	public class AlcAc_Del01 extends MABCL_AlcAcReg_MC_A.AlcAc_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 配賦科目マスタ、配賦科目名称マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_AlcAcReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder, MCList<R> rslt) {
				super.dbcCustomize(builder, rslt);
				if(builder.getBaseDbc() instanceof MAM_ALC_AC_R){
					dbcCustomizeSub(builder);
				}
		}
		
		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {
			
			MAM_ALC_AC_R t = MAM_ALC_AC_R.create(builder.getBaseDbcAlias());
			
			/*配賦科目グループ名１，２，３の取得*/
			MAM_ALC_AC_GRP_R aag1 = MAM_ALC_AC_GRP_R.create("AAG1");
			MAM_ALC_AC_GRP_R aag2 = MAM_ALC_AC_GRP_R.create("AAG2");
			MAM_ALC_AC_GRP_R aag3 = MAM_ALC_AC_GRP_R.create("AAG3");

			builder.addLeftOuterJoin(aag1, aag1.alc_ac_grp_cd.eq(t.alc_ac_grp_cd1)
					.and(aag1.alc_ac_grp_typ.eq(value(MAC_ALC_AC_GRP_TYP.GRP1.value()))));
			builder.addLeftOuterJoin(aag2, aag2.alc_ac_grp_cd.eq(t.alc_ac_grp_cd2)
					.and(aag2.alc_ac_grp_typ.eq(value(MAC_ALC_AC_GRP_TYP.GRP2.value()))));
			builder.addLeftOuterJoin(aag3, aag3.alc_ac_grp_cd.eq(t.alc_ac_grp_cd3)
					.and(aag3.alc_ac_grp_typ.eq(value(MAC_ALC_AC_GRP_TYP.GRP3.value()))));
			builder.addSelect(aag1.alc_ac_grp_nm.as("alc_ac_grp_nm1"));
			builder.addSelect(aag2.alc_ac_grp_nm.as("alc_ac_grp_nm2"));
			builder.addSelect(aag3.alc_ac_grp_nm.as("alc_ac_grp_nm3"));
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 配賦科目マスタ、配賦科目名称マスタの登録を行います。（マスタ画面用）<br>
	 */
	public class Upd01 extends MABCL_AlcAcReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 配賦科目マスタ、配賦科目名称マスタの削除を行います。<br>
	 */
	public class Del01 extends MABCL_AlcAcReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}