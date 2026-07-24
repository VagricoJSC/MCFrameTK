package mcframe.serverMABG.MABGL0310;

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
import mcframe.serverMABG.MABGL0310.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMAUC.MAUCL1100.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MABGL_AlcInptReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABGL_AlcInptReg_MC extends MABGL_AlcInptReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * AlcInpt_UpdChk01オペレーション.<p>
	 *
	 * 投入配賦マスタの登録前のチェックを行います。<br>
	 */
	public class AlcInpt_UpdChk01 extends MABGL_AlcInptReg_MC_A.AlcInpt_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AlcInpt_Upd01オペレーション.<p>
	 *
	 * 投入配賦マスタの登録を行います。<br>
	 */
	public class AlcInpt_Upd01 extends MABGL_AlcInptReg_MC_A.AlcInpt_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void afterDefChk(MCMessageList msgList) {
			super.afterDefChk(msgList);
			IfMAUCL_CheckUtil_Check01 o = checkStdAlcRateFix();
			setUpdCheckUtil(o,up0());
			o.exec();
			
			throwUpdErr();
		}
		
		protected void setUpdCheckUtil(IfMAUCL_CheckUtil_Check01 ope, MCList<AlcInpt_UpdChk01_DtlR> r){
			for(AlcInpt_UpdChk01_DtlR uDtl : r){
				Check01_DtlR oDtl = Check01_DtlR.create();
				oDtl.term(uDtl.term());
				oDtl.alc_ptn_cd(uDtl.alc_ptn_cd());
				oDtl.setAttributes(uDtl);
				
				ope.up0().add(oDtl);
			}
		}
	}
	/**
	 * AlcInpt_DelChk01オペレーション.<p>
	 *
	 * 投入配賦マスタの削除前のチェックを行います。<br>
	 */
	public class AlcInpt_DelChk01 extends MABGL_AlcInptReg_MC_A.AlcInpt_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AlcInpt_Del01オペレーション.<p>
	 *
	 * 投入配賦マスタの削除を行います。<br>
	 */
	public class AlcInpt_Del01 extends MABGL_AlcInptReg_MC_A.AlcInpt_Del01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void afterDefChk(MCMessageList msgList) {
			super.afterDefChk(msgList);
			IfMAUCL_CheckUtil_Check01 o = checkStdAlcRateFix();
			setDelCheckUtil(o,up0());
			o.exec();
			
			throwUpdErr();
		}
		protected void setDelCheckUtil(IfMAUCL_CheckUtil_Check01 ope, MCList<AlcInpt_DelChk01_DtlR> r){
			for(AlcInpt_DelChk01_DtlR uDtl : r){
				Check01_DtlR oDtl = Check01_DtlR.create();
				oDtl.term(uDtl.term());
				oDtl.alc_ptn_cd(uDtl.alc_ptn_cd());
				oDtl.setAttributes(uDtl);
				
				ope.up0().add(oDtl);
			}
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 投入配賦マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABGL_AlcInptReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(	
				MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			dbcCustomizeSub(builder);
		}

		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {
			/*期の検索条件をwhere句に追加*/
			MAM_ALC_INPT_R t = MAM_ALC_INPT_R.create(builder.getBaseDbcAlias());
			builder.addWhereWithCutOffAnd(t.term.gte(bind(Srch01_CndR.$term_fr)));
			builder.addWhereWithCutOffAnd(t.term.lte(bind(Srch01_CndR.$term_to)));
			
			// 品目区分・品目区分詳細
			MAM_ITM_TYP_D_R itm_typ_d1 = MAM_ITM_TYP_D_R.create("ITM_TYP_D1");
			MAM_ITM__R itm1 = MAM_ITM__R.create(MAM_ALC_INPT_R.$ITM1);
			builder.addSelect(itm1.itm_typ);
			builder.addSelect(itm1.itm_typ_d_cd);
			builder.addSelect(itm_typ_d1.itm_typ_d_nm);
			builder.addLeftOuterJoin(itm_typ_d1, itm1.itm_typ.eq(itm_typ_d1.itm_typ)
					.and(itm1.itm_typ_d_cd.eq(itm_typ_d1.itm_typ_d_cd)));
			builder.addWhereWithCutOffAnd(itm1.itm_typ.like(bind(Srch01_CndR.$itm_typ)));
			builder.addWhereWithCutOffAnd(itm1.itm_typ_d_cd.like(bind(Srch01_CndR.$itm_typ_d_cd)));
			builder.addWhereWithCutOffAnd(itm_typ_d1.itm_typ_d_nm.like(bind(Srch01_CndR.$itm_typ_d_nm)));
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 投入配賦マスタの登録を行います。<br>
	 */
	public class Upd01 extends MABGL_AlcInptReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 投入配賦マスタの削除を行います。<br>
	 */
	public class Del01 extends MABGL_AlcInptReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	
	protected IfMAUCL_CheckUtil_Check01 checkStdAlcRateFix(){
		String mId = "MG";
		String lId = "MGUCL0070";
		String oId = "Check01";

		return createOperationWD(mId, lId, oId, IfMAUCL_CheckUtil_Check01.class);
	}

	//FMCB CUSTOM END
}