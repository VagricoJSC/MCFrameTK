package mcframe.serverMSBB.MSBBL1240;

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
import mcframe.serverMB.dbc.*;
import mcframe.serverMS.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMS.dbc.MSFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMS.dbc.MSBAFunction.*;
import static mcframe.serverMS.dbc.MSBBFunction.*;
import static mcframe.serverMS.dbc.MSBCFunction.*;
import static mcframe.serverMS.dbc.MSBDFunction.*;
import static mcframe.serverMS.dbc.MSBEFunction.*;
import static mcframe.serverMS.dbc.MSBFFunction.*;
import static mcframe.serverMS.dbc.MSBGFunction.*;
import static mcframe.serverMS.dbc.MSBHFunction.*;
import static mcframe.serverMS.dbc.MSBIFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMSBB.MSBBL1240.*;	// このimportはFrameManagerの自動生成で追加されました。
import java.util.ArrayList;
import java.util.List;
import static mcframe.serverMSBB.MSBBL1240.Query.*;
import mcframe.serverMSBB.MSBBL6230.DlvInstRcv_Upd01_DtlR;
import mcframe.serverMSBB.MSBBL6230.MSBBL_DlvInstRcptService;
import mcframe.serverMSUC.MSUCL0080.MSUCL_SlsUtil;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBBL_DlvInstRcptReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBBL_DlvInstRcptReg_MC extends MSBBL_DlvInstRcptReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 受注ヘッダ、受注明細、出荷予定、納入指示受領を検索する<br>
	 */
	public class Srch01 extends MSBBL_DlvInstRcptReg_MC_A.Srch01 {
		protected static final String SRCH_OPE_REF = "1";
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			
			setUpTmpCol();
			
			getSlo();
			
			if (down0().size() > 0 ) {
				
				crtSloDWk();
				
				getShipSchd();
				
				getDlvInstRcpt();
			}
			if (isREF() && isEditDown()) {
				editDown();
			}
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
		
			MCIndexKey idxkey = down1().createIndex(Srch01_ShipSchdRsltR.$dlv_inst_rcpt_no);
			MCIndexKey sloIdxkey = down0().createIndex(Srch01_SloRsltR.$slo_d_no);
			for (Srch01_DlvInstRcptRsltR down2R : down2()) {
				Srch01_SloRsltR sloRsltR = down0().getFirst(sloIdxkey, down2R.slo_d_no());
				
				MCNumber afterExecQty = MCNumber.ZERO;
				for (Srch01_ShipSchdRsltR shipSchdRsltR : down1().subList(idxkey, down2R.dlv_inst_rcpt_no())) {
					afterExecQty = afterExecQty.add(sum(
							shipSchdRsltR.ship_inst_qty(),
							shipSchdRsltR.ship_act_qty(),
							sloRsltR.sls_cststk_flg() ? MCNumber.ZERO : shipSchdRsltR.sls_qty(),
							shipSchdRsltR.iv_schd_qty()));
				}
				
				if (afterExecQty.isPositive()) {
					down2R.after_exec_flg(true);
				}
			}
		}
		protected boolean isREF() {
			if (isSame(up0().ope(), SRCH_OPE_REF)) {
				return true;
			}
			return false;
		}
		
		protected boolean isEditDown() {
			if (up0().edi_flg() && up0().not_edi_flg()) {
				return false;
			}
			return true;
		}
		
		protected void editDown() {
			MCIndexKey down0IdxKey = down0().createIndex(Srch01_SloRsltR.$slo_d_no);
			MCIndexKey down1IdxKey = down1().createIndex(Srch01_ShipSchdRsltR.$slo_d_no);
			MCIndexKey down2IdxKey = down2().createIndex(Srch01_DlvInstRcptRsltR.$slo_d_no);
			
			for (Srch01_DlvInstRcptRsltR r : down2()) {
				if (r.edi_flg()) {
					Srch01_SloRsltR slodR = down0().getFirst(down0IdxKey, r.slo_d_no());
					slodR.addBooleanColumn("tgt_flg", true);
				}
			}
			
			// 下り電文の編集（down0）
			MCList<Srch01_SloRsltR> trueTgtL = MCList.create(Srch01_SloRsltR.class);
			MCList<Srch01_SloRsltR> falseTgtL = MCList.create(Srch01_SloRsltR.class);
			for (Srch01_SloRsltR tgtR :  down0()) {
				if (tgtR.getBooleanNE("tgt_flg")) {
					trueTgtL.add(tgtR);
				}
				else {
					falseTgtL.add(tgtR);
				}
			}
			down0().clear();
			if (up0().edi_flg()) {
				down0().addAll(trueTgtL);
			}
			else {
				down0().addAll(falseTgtL);
			}
			
			// 下り電文の編集（down1、down2）
			MCList<Srch01_ShipSchdRsltR> addDown1L = MCList.create(Srch01_ShipSchdRsltR.class);
			MCList<Srch01_DlvInstRcptRsltR> addDown2L = MCList.create(Srch01_DlvInstRcptRsltR.class);
			for (Srch01_SloRsltR sloDR :  down0()) {
				MCList<Srch01_ShipSchdRsltR> tmpDown1L = down1().subList(down1IdxKey, sloDR.slo_d_no());
				MCList<Srch01_DlvInstRcptRsltR> tmpDown2L = down2().subList(down2IdxKey, sloDR.slo_d_no());
				addDown1L.addAll(tmpDown1L);
				addDown2L.addAll(tmpDown2L);
			}
			down1().clear();
			down1().addAll(addDown1L);
			down2().clear();
			down2().addAll(addDown2L);
		}
		/**
		 * 検索条件に対する一時カラムを設定する。
		 */
		protected void setUpTmpCol() {

			List<String> slsStsL = new ArrayList<String>();
			
			if (up0().slo_flg()) {
				slsStsL.add(MSC_SLS_STS_TYP.SLO.value());
			}
			if (up0().prms_flg()) {
				slsStsL.add(MSC_SLS_STS_TYP.PRMS.value());
			}
			if (up0().dlv_inst_rcpt_flg()) {
				slsStsL.add(MSC_SLS_STS_TYP.DLV_INST_RCPT.value());
			}
			if (up0().dlv_inst_prms_flg()) {
				slsStsL.add(MSC_SLS_STS_TYP.DLV_INST_PRMS.value());
			}
			if (up0().sls_flg()) {
				slsStsL.add(MSC_SLS_STS_TYP.SLS.value());
			}
			if (up0().ship_flg()) {
				slsStsL.add(MSC_SLS_STS_TYP.SHIP.value());
			}
			if (up0().compl_flg()) {
				slsStsL.add(MSC_SLS_STS_TYP.COMPL.value());
			}
			
			up0().addStringColumn(MSC_SLS_STS_TYP.$VALUE, MCStringUtil.arrayValueJoin(slsStsL.toArray(new String[0])));
			
			if (!isREF()) {
				up0().addDateColumn("today", getToday());
				if (!isSame(up0().not_edi_flg(), up0().edi_flg())) {
					up0().addStringColumn("edi_flg_str", MCBooleanUtil.booleanToDBString(up0().edi_flg()));
				}
			}
		}
		
		/**
		 * 受注情報を取得する。
		 */
		protected void getSlo() {
			MCQueryPlan sql = MSBBL1240_MST_SLO_S01();
			executeQuery(down0(), sql, up0());
		}
		
		/**
		 * 受注明細の引当状況区分を設定する
		 */
		protected void setSloAllocStsTyp(Srch01_SloRsltR sloDR) {
			sloDR.alloc_sts_typ(MSUCL_SlsUtil.getAllocStsTyp( sloDR.alloc_typ(), sloDR.ship_pr_base_unit_qty(), 
					sloDR.alloc_qty(), sloDR.ship_schd_abort_qty(), false));
		}
		
		/**
		 * 受注明細のワークテーブルを作成する。
		 */
		protected void crtSloDWk() {
			
			MCList<MST_SLO_D_R> insL = MCList.create(MST_SLO_D_R.class);
			MST_SLO_D_R insR = null;
			
			for (Srch01_SloRsltR sloDR : down0().groupBy(Srch01_CndR.$slo_d_no)) {
				
				insR = MST_SLO_D_R.create();
				
				insR.slo_d_no(sloDR.slo_d_no());
				
				insL.add(insR);
			}

			MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(MST_SLO_D_R.create("T"));
			dbWkDelete("MSBBL1240_MSW_SLO_D_D01", insL_bldr.getBaseDbc());
			dbWkInsert("MSBBL1240_MSW_SLO_D_I01", insL, insL_bldr.getBaseDbc());
		}
		
		/**
		 * 出荷予定を取得する。
		 */
		protected void getShipSchd() {

			executeQuery(down1(), MSBBL1240_MST_SHIP_SCHD_S01());
			setShipSchdAllocStsTyp(down1());
			MCIndexKey idxDown1 = down1().createIndex(Srch01_ShipSchdRsltR.$slo_d_no);
			
			// 出荷予定の引当数と保留数をsumしてdown0()に設定する
			for (Srch01_SloRsltR r : down0()) {
				MCList<Srch01_ShipSchdRsltR> subL = down1().subList(idxDown1, r.slo_d_no());
				if (isNull(subL)) {
					r.alloc_qty(MCNumber.ZERO);
					r.wait_qty(MCNumber.ZERO);
				}
				else {
					r.alloc_qty(subL.sum(Srch01_ShipSchdRsltR.$alloc_qty));
					r.wait_qty(subL.sum(Srch01_ShipSchdRsltR.$wait_qty));	
				}
				setSloAllocStsTyp(r);
			}
		}
		
		/**
		 * 納入指示受領を取得する。
		 */
		protected void getDlvInstRcpt() {

			executeQuery(down2(), MSBBL1240_MST_DLV_INST_RCPT_S01());
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 納入指示受領情報を更新する<br>
	 */
	public class Upd01 extends MSBBL_DlvInstRcptReg_MC_A.Upd01 {
		
		/**
		 * 納入指示受領サービスの更新前チェックオペレーション
		 */
		protected MSBBL_DlvInstRcptService.DlvInstRcv_Chk01 chkOpe = null;
		
		/**
		 * 納入指示受領サービスの更新オペレーション
		 */
		protected MSBBL_DlvInstRcptService.DlvInstRcv_Upd01 updOpe = null;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			callDlvInstRcptChkSrv();
			
			throwUpdErr();
			
			callDlvInstRcptUpdSrv();
			
			setDown();
		}
		
		/**
		 * 納入指示受領サービスの更新前チェック処理を呼び出す。
		 */
		protected void callDlvInstRcptChkSrv() {

			chkOpe = MSBBL_DlvInstRcptService.crtDlvInstRcv_Chk01();
			
			addAll(chkOpe.up0(), up0(), createMap_DlvInstRcv_Upd01_DtlR_Upd01_DtlR());
			setPegNo(chkOpe.up0());
			
			chkOpe.exec();
		}
		
		/**
		 * 納入指示受領サービスの更新処理を呼び出す。
		 */
		protected void callDlvInstRcptUpdSrv() {
			
			updOpe = MSBBL_DlvInstRcptService.crtDlvInstRcv_Upd01();
			
			updOpe.up0().setAll(chkOpe.down0());

			updOpe.exec();
		}
		
		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			
			setDown0();
			
			setDown1();
		}
		
		/**
		 * 納入指示受領ＮＯ・改訂番号を下り電文に設定する。
		 */
		protected void setDown0() {
			
			if (!updOpe.down0().isEmpty()) {
				
				for (int i = 0; i < updOpe.down0().size(); i++) {
					
					up0().get(i).dlv_inst_rcpt_no(updOpe.down0().get(i).dlv_inst_rcpt_no());
					up0().get(i).dlv_inst_rcpt_rev(updOpe.down0().get(i).dlv_inst_rcpt_rev());	
				}
				
				down0().addAll(up0());
			}
		}
		
		/**
		 * 登録後に出荷予定の情報を再取得し、下り電文に設定する。
		 */
		protected void setDown1() {
			
			crtSloDWk();

			getShipSchd();
		}
		
		/**
		 * 受注明細のワークテーブルを作成する。
		 */
		protected void crtSloDWk() {
			
			MCList<MST_SLO_D_R> insL = MCList.create(MST_SLO_D_R.class);
			MST_SLO_D_R insR = null;
			
			for (Upd01_DtlR dtlR : up0().groupBy(Srch01_CndR.$slo_d_no)) {
				
				insR = MST_SLO_D_R.create();
				
				insR.slo_d_no(dtlR.slo_d_no());
				
				insL.add(insR);
			}

			MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(MST_SLO_D_R.create("T"));
			dbWkDelete("MSBBL1240_MSW_SLO_D_D02", insL_bldr.getBaseDbc());
			dbWkInsert("MSBBL1240_MSW_SLO_D_I02", insL, insL_bldr.getBaseDbc());
		}
		
		/**
		 * 出荷予定を取得する。
		 */
		protected void getShipSchd() {

			executeQuery(down1(), MSBBL1240_MST_SHIP_SCHD_S01());
			
			setFuncNm(down1());
			doCompTime(down1(), false);
			setShipSchdAllocStsTyp(down1());

		}
		
		protected Map_DlvInstRcv_Upd01_DtlR_Upd01_DtlR<DlvInstRcv_Upd01_DtlR,Upd01_DtlR> createMap_DlvInstRcv_Upd01_DtlR_Upd01_DtlR() {
			return new Map_DlvInstRcv_Upd01_DtlR_Upd01_DtlR<DlvInstRcv_Upd01_DtlR, Upd01_DtlR>();
		}

		public class Map_DlvInstRcv_Upd01_DtlR_Upd01_DtlR<D extends DlvInstRcv_Upd01_DtlR, S extends Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_inst_rcpt_no, Upd01_DtlR.$dlv_inst_rcpt_no);
				addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_inst_rcpt_rev, Upd01_DtlR.$dlv_inst_rcpt_rev);
				addColumnPathMap(DlvInstRcv_Upd01_DtlR.$slo_d_no, Upd01_DtlR.$slo_d_no);
				addColumnPathMap(DlvInstRcv_Upd01_DtlR.$trd_unit_qty, Upd01_DtlR.$trd_unit_qty);
				addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_rqst_tm, Upd01_DtlR.$dlv_rqst_tm);
				addColumnPathMap(DlvInstRcv_Upd01_DtlR.$cst_dlv_inst_no, Upd01_DtlR.$cst_dlv_inst_no);
				addColumnPathMap(DlvInstRcv_Upd01_DtlR.$cst_dlv_inst_rev, Upd01_DtlR.$cst_dlv_inst_rev);
				addColumnPathMap(DlvInstRcv_Upd01_DtlR.$cst_dlv_inst_d_no, Upd01_DtlR.$cst_dlv_inst_d_no);
				addColumnPathMap(DlvInstRcv_Upd01_DtlR.$cst_dlv_inst_rmrks, Upd01_DtlR.$cst_dlv_inst_rmrks);
				addColumnPathMap(DlvInstRcv_Upd01_DtlR.$cst_dlv_inst_d_rmrks, Upd01_DtlR.$cst_dlv_inst_d_rmrks);
				addColumnPathMap(DlvInstRcv_Upd01_DtlR.$intr_rmrks, Upd01_DtlR.$intr_rmrks);
				addColumnPathMap(DlvInstRcv_Upd01_DtlR.$edi_flg, Upd01_DtlR.$edi_flg);
				addColumnPathMap(DlvInstRcv_Upd01_DtlR.$sub_char1, Upd01_DtlR.$sub_char1);
				addColumnPathMap(DlvInstRcv_Upd01_DtlR.$sub_char2, Upd01_DtlR.$sub_char2);
				addColumnPathMap(DlvInstRcv_Upd01_DtlR.$sub_char3, Upd01_DtlR.$sub_char3);
				addColumnPathMap(DlvInstRcv_Upd01_DtlR.$ship_pr_upd_cntr, Upd01_DtlR.$ship_pr_upd_cntr);
				addColumnPathMap(DlvInstRcv_Upd01_DtlR.$slo_upd_cntr, Upd01_DtlR.$slo_upd_cntr);
				addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_cd, Upd01_DtlR.$dlv_cd);
				addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_nm, Upd01_DtlR.$dlv_nm);
				addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_cntct_dpt, Upd01_DtlR.$dlv_cntct_dpt);
				addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_cntct_psn, Upd01_DtlR.$dlv_cntct_psn);
				addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_zip_cd, Upd01_DtlR.$dlv_zip_cd);
				addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_addr1, Upd01_DtlR.$dlv_addr1);
				addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_addr2, Upd01_DtlR.$dlv_addr2);
				addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_addr3, Upd01_DtlR.$dlv_addr3);
				addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_addr4, Upd01_DtlR.$dlv_addr4);
				addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_tel, Upd01_DtlR.$dlv_tel);
				addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_fax, Upd01_DtlR.$dlv_fax);
				addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_lg_grp_cd, Upd01_DtlR.$dlv_lg_grp_cd);
				addColumnPathMap(DlvInstRcv_Upd01_DtlR.$pri_prnt_flg, Upd01_DtlR.$pri_prnt_flg);
				addColumnPathMap(DlvInstRcv_Upd01_DtlR.$tdlv_cd, Upd01_DtlR.$tdlv_cd);
				addColumnPathMap(DlvInstRcv_Upd01_DtlR.$tdlv_nm, Upd01_DtlR.$tdlv_nm);
				addColumnPathMap(DlvInstRcv_Upd01_DtlR.$via_dlv_typ, Upd01_DtlR.$via_dlv_typ);
				addColumnPathMap(DlvInstRcv_Upd01_DtlR.$tdlv_cntct_dpt, Upd01_DtlR.$tdlv_cntct_dpt);
				addColumnPathMap(DlvInstRcv_Upd01_DtlR.$tdlv_cntct_psn, Upd01_DtlR.$tdlv_cntct_psn);
				addColumnPathMap(DlvInstRcv_Upd01_DtlR.$tdlv_zip_cd, Upd01_DtlR.$tdlv_zip_cd);
				addColumnPathMap(DlvInstRcv_Upd01_DtlR.$tdlv_addr1, Upd01_DtlR.$tdlv_addr1);
				addColumnPathMap(DlvInstRcv_Upd01_DtlR.$tdlv_addr2, Upd01_DtlR.$tdlv_addr2);
				addColumnPathMap(DlvInstRcv_Upd01_DtlR.$tdlv_addr3, Upd01_DtlR.$tdlv_addr3);
				addColumnPathMap(DlvInstRcv_Upd01_DtlR.$tdlv_addr4, Upd01_DtlR.$tdlv_addr4);
				addColumnPathMap(DlvInstRcv_Upd01_DtlR.$tdlv_tel, Upd01_DtlR.$tdlv_tel);
				addColumnPathMap(DlvInstRcv_Upd01_DtlR.$tdlv_fax, Upd01_DtlR.$tdlv_fax);
				addColumnPathMap(DlvInstRcv_Upd01_DtlR.$tdlv_lg_grp_cd, Upd01_DtlR.$tdlv_lg_grp_cd);
				addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_day_week_typ, Upd01_DtlR.$dlv_day_week_typ);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				src.setAttributes(src);
				
				if (src.isStatusCreate()) {
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else if (src.isStatusDelete()) {
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				else if (src.isStatusModify()) {
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
			}
		}
	}
	
	/**
	 * 出荷予定の引当状況区分を設定する
	 *
	 * @param shipSchdL
	 */
	protected void setShipSchdAllocStsTyp(MCList<Srch01_ShipSchdRsltR> shipSchdL) {
		for (Srch01_ShipSchdRsltR shipSchdR : shipSchdL) {
			shipSchdR.alloc_sts_typ(MSUCL_SlsUtil.getAllocStsTyp( shipSchdR.alloc_typ(), 
					shipSchdR.base_unit_qty(), shipSchdR.alloc_qty(), null, false));

		}
	}

	//FMCB CUSTOM END
}