package mcframe.serverMABG.MABGL0300;

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
import mcframe.serverMABG.MABGL0300.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMAUC.MAUCL1100.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MABGL_AlcExpnsReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABGL_AlcExpnsReg_MC extends MABGL_AlcExpnsReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * AlcExpns_UpdChk01オペレーション.<p>
	 *
	 * 費目配賦マスタの登録前のチェックを行います。<br>
	 */
	public class AlcExpns_UpdChk01 extends MABGL_AlcExpnsReg_MC_A.AlcExpns_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub(MCList<? extends MCConstRow> up) {
			MCMessageList msgList = super.doServerCheckSub(up);
			for (MCConstRow row : up) {
				if (!(row instanceof AlcExpns_UpdChk01_DtlR)) {
					continue;
				}
				AlcExpns_UpdChk01_DtlR r = (AlcExpns_UpdChk01_DtlR) row;
				MCList<MAM_ALC_RULE_R> dbc = MCList.create(MAM_ALC_RULE_R.class);
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MAM_ALC_RULE_R.create("T"));
				
				if (dbSelectKey("MABGL0300_MAM_ALC_RULE_S01", dbc, dbc_bldr, r) > 0) {
					MAM_ALC_RULE_R alcRuleR = dbc.get(0);
					if (MAC_ALC_TGT_TYP.isSLS(alcRuleR.alc_tgt_typ()) && r.self_oper_flg()) {
						msgList.add(new MCMessage(alcRuleR, AlcExpns_UpdChk01_DtlR.$self_oper_flg, MABGL0027, toDispGUIIndex(r)));
					}
					else if (MAC_ALC_TGT_TYP.isSLS(alcRuleR.alc_tgt_typ()) && !isNull(r.inpt_itm_typ())) {
						msgList.add(new MCMessage(alcRuleR, AlcExpns_UpdChk01_DtlR.$inpt_itm_typ, MABGL0028, toDispGUIIndex(r)));
					}
					if (!MAC_INPT_ITM_TYP.isALL_ITM(r.inpt_itm_typ())
							&& (!isNull(r.ctg_cd()) || !isNull(r.itm_cd()))) {
						msgList.add(new MCMessage(alcRuleR, AlcExpns_UpdChk01_DtlR.$inpt_itm_typ, MABGL0029, toDispGUIIndex(r)));
					}
				}
			}
			return msgList;	
		}
		
	}
	/**
	 * AlcExpns_Upd01オペレーション.<p>
	 *
	 * 費目配賦マスタの登録を行います。<br>
	 */
	public class AlcExpns_Upd01 extends MABGL_AlcExpnsReg_MC_A.AlcExpns_Upd01 {
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
		protected void setUpdCheckUtil(IfMAUCL_CheckUtil_Check01 ope, MCList<AlcExpns_UpdChk01_DtlR> r){
			for(AlcExpns_UpdChk01_DtlR uDtl : r){
				Check01_DtlR oDtl = Check01_DtlR.create();
				oDtl.term(uDtl.term());
				oDtl.alc_ptn_cd(uDtl.alc_ptn_cd());
				oDtl.setAttributes(uDtl);
				
				ope.up0().add(oDtl);
			}
		}
	}
	/**
	 * AlcExpns_DelChk01オペレーション.<p>
	 *
	 * 費目配賦マスタの削除前のチェックを行います。<br>
	 */
	public class AlcExpns_DelChk01 extends MABGL_AlcExpnsReg_MC_A.AlcExpns_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AlcExpns_Del01オペレーション.<p>
	 *
	 * 費目配賦マスタの削除を行います。<br>
	 */
	public class AlcExpns_Del01 extends MABGL_AlcExpnsReg_MC_A.AlcExpns_Del01 {
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
		
		protected void setDelCheckUtil(IfMAUCL_CheckUtil_Check01 ope, MCList<AlcExpns_DelChk01_DtlR> r){
			for(AlcExpns_DelChk01_DtlR uDtl : r){
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
	 * 費目配賦マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABGL_AlcExpnsReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_ALC_EXPNS_R) {
				dbcCustomizeSub(builder);
			}
		}
		

		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {
			/*期の検索条件をwhere句に追加*/
			MAM_ALC_EXPNS_R t = MAM_ALC_EXPNS_R.create(builder.getBaseDbcAlias());
			builder.addWhereWithCutOffAnd(t.term.gte(bind(Srch01_CndR.$term_fr)));
			builder.addWhereWithCutOffAnd(t.term.lte(bind(Srch01_CndR.$term_to)));

			// 品目区分・品目区分詳細
			MAM_ITM__R itm1 = MAM_ITM__R.create(MAM_ALC_EXPNS_R.$ITM1);
			MAM_ITM_TYP_D_R itm_typ_d1 = MAM_ITM_TYP_D_R.create("ITM_TYP_D1");
			builder.addSelect(itm1.itm_typ);
			builder.addSelect(itm1.itm_typ_d_cd);
			builder.addSelect(itm_typ_d1.itm_typ_d_nm);
			builder.addLeftOuterJoin(itm_typ_d1, itm1.itm_typ.eq(itm_typ_d1.itm_typ)
					.and(itm1.itm_typ_d_cd.eq(itm_typ_d1.itm_typ_d_cd)));
			builder.addWhereWithCutOffAnd(itm1.itm_typ.like(bind(Srch01_CndR.$itm_typ)));
			builder.addWhereWithCutOffAnd(
					itm1.itm_typ_d_cd.like(bind(Srch01_CndR.$itm_typ_d_cd)));
			builder.addWhereWithCutOffAnd(
					itm_typ_d1.itm_typ_d_nm.like(bind(Srch01_CndR.$itm_typ_d_nm)));

			MAM_ALC_RULE_R ar = MAM_ALC_RULE_R.create("AR");
			builder.addLeftOuterJoin(ar,
					t.alc_ptn_cd.eq(ar.alc_ptn_cd)
					.and(t.term.eq(ar.term)));
			builder.addSelect(ar.alc_tgt_typ);
		}
		
		@Override
		protected void down_SELECT_c0_0(Srch01_Rslt1R r_dest, MAM_ALC_EXPNS_R r_src) {
			super.down_SELECT_c0_0(r_dest, r_src);
			
			r_dest.alc_tgt_typ(r_src.getStringNE("alc_tgt_typ"));
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 費目配賦マスタの登録を行います。<br>
	 */
	public class Upd01 extends MABGL_AlcExpnsReg_MC_A.Upd01 {
		@Override
		protected void call() {
			editUp();
			super.call();
		}
		
		protected void editUp() {
			for (AlcExpns_UpdChk01_DtlR r : up0()) {
				if (!MAC_ALC_TGT_TYP.isSLS(r.alc_tgt_typ()) && isNull(r.inpt_itm_typ())) {
					r.inpt_itm_typ(MAC_INPT_ITM_TYP.PURC.value());
				}
			}
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 費目配賦マスタの削除を行います。<br>
	 */
	public class Del01 extends MABGL_AlcExpnsReg_MC_A.Del01 {
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