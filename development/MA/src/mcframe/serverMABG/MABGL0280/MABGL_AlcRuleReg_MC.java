package mcframe.serverMABG.MABGL0280;

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
import mcframe.serverMABG.MABGL0280.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0170.*;
import mcframe.serverMAUC.MAUCL1100.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MABGL_AlcRuleReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABGL_AlcRuleReg_MC extends MABGL_AlcRuleReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * AlcRule_UpdChk01オペレーション.<p>
	 *
	 * 配賦方法マスタの登録前のチェックを行います。<br>
	 */
	public class AlcRule_UpdChk01 extends MABGL_AlcRuleReg_MC_A.AlcRule_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected IfValidater getConstExistValidater(String col, MCAppConst[] constArr) {
			if (isSame(col, AlcRule_UpdChk01_DtlR.$asst_typ)) {
				return new FXUCL_ConstValidater(new MCAppConst[] {
						MAC_ASST_TYP.CO_SLS, MAC_ASST_TYP.CO_PROD
				});
			}
			return super.getConstExistValidater(col, constArr);
		}

		@Override
		protected MCMessageList doServerCheckSub(MCList<? extends MCConstRow> up) {
			MCMessageList msgList = super.doServerCheckSub(up);
			for (MCConstRow row : up) {
				if (!(row instanceof AlcRule_UpdChk01_DtlR)) {
					break;
				}
				AlcRule_UpdChk01_DtlR r = (AlcRule_UpdChk01_DtlR) row;

				if (r.del_flg()) {
					continue ;
				}

				if (MAC_ALC_TGT_TYP.isMFG(r.alc_tgt_typ()) && MAC_ALC_RULE_TYP.isPROFIT(r.alc_rule_typ())) {
					msgList.add(new MCMessage(r, AlcRule_UpdChk01_DtlR.$alc_rule_typ, MABGL0022, toDispGUIIndex(r)));
				}
				if (MAC_ALC_TGT_TYP.isPURC(r.alc_tgt_typ()) && (MAC_ALC_RULE_TYP.isWK(r.alc_rule_typ()) ||
						MAC_ALC_RULE_TYP.isPROFIT(r.alc_rule_typ()) || MAC_ALC_RULE_TYP.isINPT_QTY(r.alc_rule_typ()))) {
					msgList.add(new MCMessage(r, AlcRule_UpdChk01_DtlR.$alc_rule_typ, MABGL0023, toDispGUIIndex(r)));
				}
				if (MAC_ALC_TGT_TYP.isMFG_PURC(r.alc_tgt_typ()) && MAC_ALC_RULE_TYP.isPROFIT(r.alc_rule_typ())) {
					msgList.add(new MCMessage(r, AlcRule_UpdChk01_DtlR.$alc_rule_typ, MABGL0024, toDispGUIIndex(r)));
				}
				if (MAC_ALC_TGT_TYP.isSLS(r.alc_tgt_typ()) && (MAC_ALC_RULE_TYP.isWK(r.alc_rule_typ()) ||
						MAC_ALC_RULE_TYP.isINPT_QTY(r.alc_rule_typ()))) {
					msgList.add(new MCMessage(r, AlcRule_UpdChk01_DtlR.$alc_rule_typ, MABGL0025, toDispGUIIndex(r)));
				}
				if (MAC_ALC_TGT_TYP.isALC(r.alc_tgt_typ()) && (MAC_ALC_RULE_TYP.isWK(r.alc_rule_typ()) || 
						MAC_ALC_RULE_TYP.isEXPNS_COST(r.alc_rule_typ()) || MAC_ALC_RULE_TYP.isPROFIT(r.alc_rule_typ()) || 
						MAC_ALC_RULE_TYP.isINPT_QTY(r.alc_rule_typ()))) {
					msgList.add(new MCMessage(r, AlcRule_UpdChk01_DtlR.$alc_rule_typ, MABGL0026, toDispGUIIndex(r)));
				}

				if (!isNull(r.expns_cd())) {
					MAM_EXPNS_R dbc = MAM_EXPNS_R.create();
					MCQueryApiBuilder builder = MCQueryApiBuilder.create(MAM_EXPNS_R.create("T"));
					dbSelectKey("MABGL0280_MAM_EXPNS_S01", dbc, builder, r.expns_cd());
					
					if (!MAC_ALC_TGT_TYP.isSLS(r.alc_tgt_typ()) && !MAC_EXPNS_TYP.isPROD(dbc.expns_typ())) {
						msgList.add(new MCMessage(r, AlcRule_UpdChk01_DtlR.$expns_cd, MABGL0020, toDispGUIIndex(r)));
					}
					if (MAC_ALC_TGT_TYP.isSLS(r.alc_tgt_typ()) && !MAC_EXPNS_TYP.isSGA(dbc.expns_typ())) {
						msgList.add(new MCMessage(r, AlcRule_UpdChk01_DtlR.$expns_cd, MABGL0021, toDispGUIIndex(r)));
					}
				}
			}
			return msgList;
		}
		
	}
	/**
	 * AlcRule_Upd01オペレーション.<p>
	 *
	 * 配賦方法マスタの登録を行います。<br>
	 */
	public class AlcRule_Upd01 extends MABGL_AlcRuleReg_MC_A.AlcRule_Upd01 {
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
		protected void setUpdCheckUtil(IfMAUCL_CheckUtil_Check01 ope, MCList<AlcRule_UpdChk01_DtlR> r){
			for(AlcRule_UpdChk01_DtlR uDtl : r){
				Check01_DtlR oDtl = Check01_DtlR.create();
				oDtl.term(uDtl.term());
				oDtl.alc_ptn_cd(uDtl.alc_ptn_cd());
				oDtl.setAttributes(uDtl);
				
				ope.up0().add(oDtl);
			}
		}
	}
	/**
	 * AlcRule_DelChk01オペレーション.<p>
	 *
	 * 配賦方法マスタの削除前のチェックを行います。<br>
	 */
	public class AlcRule_DelChk01 extends MABGL_AlcRuleReg_MC_A.AlcRule_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AlcRule_Del01オペレーション.<p>
	 *
	 * 配賦方法マスタの削除を行います。<br>
	 */
	public class AlcRule_Del01 extends MABGL_AlcRuleReg_MC_A.AlcRule_Del01 {
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
		protected void setDelCheckUtil(IfMAUCL_CheckUtil_Check01 ope, MCList<AlcRule_DelChk01_DtlR> r){
			for(AlcRule_DelChk01_DtlR uDtl : r){
				Check01_DtlR oDtl = Check01_DtlR.create();
				oDtl.term(uDtl.term());
				oDtl.alc_ptn_cd(uDtl.alc_ptn_cd());
				oDtl.setAttributes(uDtl);
				
				ope.up0().add(oDtl);
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 配賦方法マスタの登録を行います。<br>
	 */
	public class Upd01 extends MABGL_AlcRuleReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 配賦方法マスタの削除を行います。<br>
	 */
	public class Del01 extends MABGL_AlcRuleReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 配賦方法マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABGL_AlcRuleReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_ALC_RULE_R) {
				dbcCustomizeSub(builder);
			}
		}
		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {
			/*期の検索条件をwhere句に追加*/
			MAM_ALC_RULE_R t = MAM_ALC_RULE_R.create(builder.getBaseDbcAlias());
			builder.addWhereWithCutOffAnd(t.term.gte(bind(Srch01_CndR.$term_fr)));
			builder.addWhereWithCutOffAnd(t.term.lte(bind(Srch01_CndR.$term_to)));
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