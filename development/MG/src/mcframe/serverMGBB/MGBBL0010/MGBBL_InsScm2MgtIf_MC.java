package mcframe.serverMGBB.MGBBL0010;

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
import mcframe.commonMB.constant.*;
import mcframe.serverMB.dbc.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import static mcframe.serverMGUC.MGUCL0020.MGUCL_AppSys.*;
import mcframe.commonMG.constant.*;
import mcframe.serverMG.dbc.*;
import static mcframe.commonMG.notice.MG_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMG.dbc.MGFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMGBB.MGBBL0010.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMGBB.MGBBL0010.Query.*;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
import static mcframe.commonCore.notice.Core_Msg.*;
import mcframe.serverMGBB.MGBBL5010.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBBL_InsScm2MgtIf"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBBL_InsScm2MgtIf_MC extends MGBBL_InsScm2MgtIf_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 原価ＩＦデータ取込状況を検索する。<br>
	 */
	public class Srch01 extends MGBBL_InsScm2MgtIf_MC_A.Srch01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			editUp();
			srch();
		}

		protected void editUp() {
			up0().addDateColumn("ym_st_dt", getYmStDt(up0().ym()));
			up0().addDateColumn("ym_end_dt", getYmEndDt(up0().ym()));
		}

		protected void srch() {
			for (Srch01_RsltR r : up1()) {
				if(r.is_enable()){
					if(MGC_CT_DATA_TYP.isIO(r.ct_data_typ())){
						srchScm(MGBBL0010_MGVT_MST_IO_ACT_S01(), up0(), r);
					}
					else if(MGC_CT_DATA_TYP.isWIP(r.ct_data_typ())){
						srchScm(MGBBL0010_MGVT_MST_MLY_WIP_S01(), up0(), r);
					}
					else if(MGC_CT_DATA_TYP.isWK(r.ct_data_typ())){
						srchScm(MGBBL0010_MGVT_MST_WK_ACT_S01(), up0(), r);
					}
					else if(MGC_CT_DATA_TYP.isSTK(r.ct_data_typ())){
						srchScm(MGBBL0010_MGVT_MST_MLY_STK_DTL_S01(), up0(), r);
					}
				}
				if(MGC_IF_DTL_TYP.isMFG(r.if_dtl_typ())){
					srchDtlMfg(up0(),r);
				}
				else if(MGC_IF_DTL_TYP.isPURC(r.if_dtl_typ())){
					srchDtlPurc(up0(),r);
				}
				else if(MGC_IF_DTL_TYP.isINPT(r.if_dtl_typ())){
					srchDtlInpt(up0(),r);
				}
				else if(MGC_IF_DTL_TYP.isIO(r.if_dtl_typ())){
					srchDtlIo(up0(),r);
				}
				else if(MGC_IF_DTL_TYP.isSLS(r.if_dtl_typ())){
					srchDtlSls(up0(),r);
				}
				else if(MGC_IF_DTL_TYP.isITM_MFG_INST(r.if_dtl_typ())){
					srchDtlItmMfgInst(up0(),r);
				}
				else if(MGC_IF_DTL_TYP.isINST_OPER(r.if_dtl_typ())){
					srchDtlInstOper(up0(),r);
				}
				else if(MGC_IF_DTL_TYP.isINST_WK(r.if_dtl_typ())){
					srchDtlInstWk(up0(),r);
				}
				else if(MGC_IF_DTL_TYP.isOTHER_WK(r.if_dtl_typ())){
					srchDtlOtherWk(up0(),r);
				}
				else if(MGC_IF_DTL_TYP.isINST_OPER2(r.if_dtl_typ())){
					srchDtlInstOper(up0(),r);
				}
				else if(MGC_IF_DTL_TYP.isWIP(r.if_dtl_typ())){
					srchDtlWip(up0(),r);
				}
				else if(MGC_IF_DTL_TYP.isITM_MFG_INST2(r.if_dtl_typ())){
					srchDtlItmMfgInst(up0(),r);
				}
				else if(MGC_IF_DTL_TYP.isSTK(r.if_dtl_typ())){
					srchDtlStk(up0(),r);
				}
			}
			down0().addAll(up1());
		}

		protected void srchScm(MCQueryPlan sql, Srch01_CndR bind, Srch01_RsltR row){
			MCRow rsltR = MCRow.create();

			try {
				executeQuery(rsltR, sql, bind);
			}
			catch (MCException e) {
				if (isNotExist(e)) {
					throw new MCAppException(MGBBL0004);
				}
				throw e;
			}

			row.last_upd_dt(rsltR.getTimestamp(Srch01_RsltR.$last_upd_dt));
			row.no_imp_cnt(rsltR.getNumber(Srch01_RsltR.$no_imp_cnt));
		}

		/**
		 * 「ORA-00942: 表またはビューが存在しません。」
		 * による例外かどうかを判別する<P>
		 * 
		 * @param ex 判断対象の例外
		 * @return boolean ORA-00942のエラーの場合は、true。
		 */
		protected boolean isNotExist(MCException ex) {
			if (ex == null) {
				return false;
			}
			return FCBCC0140.equals(ex.getID());
		}

		protected void srchDtlMfg(Srch01_CndR h, Srch01_RsltR r){
			srchIfLastUpdDt(MGT_ACT_MFG_IF_R.create("T"), h, r);
		}

		protected void srchDtlPurc(Srch01_CndR h, Srch01_RsltR r){
			srchIfLastUpdDt(MGT_ACT_PURC_IF_R.create("T"), h, r);
		}

		protected void srchDtlInpt(Srch01_CndR h, Srch01_RsltR r){
			srchIfLastUpdDt(MGT_ACT_INPT_IF_R.create("T"), h, r);
		}

		protected void srchDtlInstWk(Srch01_CndR h, Srch01_RsltR r){
			srchIfLastUpdDt(MGT_ACT_INST_WK_IF_R.create("T"), h, r);
		}

		protected void srchDtlOtherWk(Srch01_CndR h, Srch01_RsltR r){
			srchIfLastUpdDt(MGT_ACT_OTHER_WK_IF_R.create("T"), h, r);
		}

		protected void srchDtlWip(Srch01_CndR h, Srch01_RsltR r){
			srchIfLastUpdDt(MGT_ACT_INST_WIP_IF_R.create("T"), h, r);
		}

		protected void srchDtlItmMfgInst(Srch01_CndR h, Srch01_RsltR r){
			MGT_ITM_MFG_INST_R dbcIf = MGT_ITM_MFG_INST_R.create("T");
			MCQueryApiBuilder dbcIf_bldr = MCQueryApiBuilder.create(dbcIf);
			dbcIf_bldr.addMax(dbcIf.upd_ts, Srch01_RsltR.$if_last_upd_dt);
			dbcIf_bldr.addWhereWithAnd(dbcIf.calc_ctg_cd.eq(bind("1")), h.calc_ctg_cd());
			dbSelect("MGBBL0010_MGT_ITM_MFG_INST_S01", dbcIf, dbcIf_bldr, r);
			r.if_last_upd_dt(dbcIf.getTimestampNE(Srch01_RsltR.$if_last_upd_dt));
		}

		protected void srchDtlInstOper(Srch01_CndR h, Srch01_RsltR r){
			MGT_INST_OPER_R dbcIf = MGT_INST_OPER_R.create("T");
			MCQueryApiBuilder dbcIf_bldr = MCQueryApiBuilder.create(dbcIf);
			dbcIf_bldr.addMax(dbcIf.upd_ts, Srch01_RsltR.$if_last_upd_dt);
			dbcIf_bldr.addWhereWithAnd(dbcIf.calc_ctg_cd.eq(bind("1")), h.calc_ctg_cd());
			dbSelect("MGBBL0010_MGT_INST_OPER_S01", dbcIf, dbcIf_bldr, r);
			r.if_last_upd_dt(dbcIf.getTimestampNE(Srch01_RsltR.$if_last_upd_dt));
		}

		protected void srchDtlSls(Srch01_CndR h, Srch01_RsltR r){
			srchIfLastUpdDt(MGT_ACT_SLS_IF_R.create("T"), h, r);
		}

		protected void srchDtlStk(Srch01_CndR h, Srch01_RsltR r){
			srchIfLastUpdDt(MGT_ACT_STK_IF_R.create("T"), h, r);
		}

		protected void srchDtlIo(Srch01_CndR h, Srch01_RsltR r){
			srchIfLastUpdDt(MGT_ACT_IO_IF_R.create("T"), h, r);
		}

		protected void srchIfLastUpdDt(MCDBContainer d,Srch01_CndR h, Srch01_RsltR r ){
			
			MCQueryApiBuilder d_bldr = MCQueryApiBuilder.create(d);
			
			d_bldr.addMax(d.getColumn$("upd_ts"), Srch01_RsltR.$if_last_upd_dt);
			d_bldr.addWhereWithAnd(MCQueryApiBuilder.makeEq(d.getColumn$("ym"), value(h.ym())));
			d_bldr.addWhereWithAnd(MCQueryApiBuilder.makeEq(d.getColumn$("calc_ctg_cd"), value(h.calc_ctg_cd())));
			dbSelect(createSqlId(LOGIC_ID, d_bldr.getBaseDbc(), "S50"), d, d_bldr, r);
			r.if_last_upd_dt(d.getTimestampNE(Srch01_RsltR.$if_last_upd_dt));
		}

	}

	/**
	 * Srch02オペレーション.<p>
	 *
	 * 原価計算確定情報を検索する。<br>
	 */
	public class Srch02 extends MGBBL_InsScm2MgtIf_MC_A.Srch02 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			srch();
		}

		protected void srch() {
			executeQuery(down0(), MGBBL0010_MGT_CALC_FIX_S01(), null);
		}

	}

	/**
	 * Ins01オペレーション.<p>
	 *
	 * 原価ＩＦデータを取り込む。<br>
	 */
	public class Ins01 extends MGBBL_InsScm2MgtIf_MC_A.Ins01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			execMain();
			throwErr(msgOpeErr());
		}

		protected void execMain() {
			MGBBL_PcmIfService.PcmIf_Upd01 ope = MGBBL_PcmIfService.crtPcmIf_Upd01();
			setOpeUp(ope.up0());
			ope.exec();
		}

		protected void setOpeUp(PcmIf_Chk01_CndR r) {
			r.ym(up0().ym());
			r.calc_ctg_cd(up0().calc_ctg_cd());
			r.rerun_flg(up0().rerun());
			r.setAttributes(up0());

			for (MGC_CT_DATA_TYP typ : MGC_CT_DATA_TYP.array()){
				r.setBooleanNE(typ.key().toLowerCase() + "_flg", checkTyp(typ));
			}
			r.non_mov_flg(up0().non_mov());
		}

		protected boolean checkTyp(MGC_CT_DATA_TYP typ){
			return up1().getFirst(Srch01_RsltR.$ct_data_typ, typ.value()) != null;
		}

	}

	//FMCB CUSTOM END
}