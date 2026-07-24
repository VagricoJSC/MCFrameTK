package mcframe.serverMSBB.MSBBL6210;

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
import mcframe.serverMSBB.MSBBL6010.*;
import mcframe.serverMSBB.MSBBL6080.*;
import mcframe.serverMSBB.MSBBL6220.*;
import static mcframe.serverMSBB.MSBBL6210.Query.*;
import mcframe.serverMSBE.MSBEL5020.*;
import mcframe.serverMSBE.MSBEL5900.*;
import mcframe.serverFXUC.FXUCL0030.*;
import static mcframe.serverCore.requester.MCRequestObject.*;

import mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R;
import mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR;
import mcframe.serverMSUC.MSUCL0020.MSUCL_ConvQtyAmtUtil;
import mcframe.serverMSUC.MSUCL0080.MSUCL_SlsUtil;
import mcframe.serverMAUC.MAUCL1110.MAUCL_DptUtil;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBBL_SlsRetService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBBL_SlsRetService_MC extends MSBBL_SlsRetService_MC_A{
	//FMCB CUSTOM START

	/**
	 * SlsRet_Chk01オペレーション.<p>
	 *
	 * 売上返品予定紐付きの場合に売上返品予定のロックを行う<br>
	 */
	public class SlsRet_Chk01 extends MSBBL_SlsRetService_MC_A.SlsRet_Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			// 処理対象となる売上返品予定をロック
			for (SlsRet_Chk01_HdrR hdrR : up0()) {
				if (!isNull(hdrR.sls_ret_schd_no())) {
					MST_SLS_RET_SCHD_R slsRetSchdR = MST_SLS_RET_SCHD_R.create();
					dbSelectKeyForUpdateNoWait("MSBBL6210_MST_SLS_RET_SCHD_S01", slsRetSchdR,
							MCQueryApiBuilder.create(MST_SLS_RET_SCHD_R.create("T")), hdrR);
				}
			}
		}
	}
	/**
	 * SlsRet_Upd01オペレーション.<p>
	 *
	 * 売上返品を登録する<br>
	 */
	public class SlsRet_Upd01 extends MSBBL_SlsRetService_MC_A.SlsRet_Upd01 {
		
		MCList<SlsRet_Upd01_HdrR> _hdrL = MCList.create(SlsRet_Upd01_HdrR.class);
		MCList<SlsRet_Upd01_DtlR> _dtlL = MCList.create(SlsRet_Upd01_DtlR.class);
		MCList<SlsRet_Upd01_IoR> _ioL = MCList.create(SlsRet_Upd01_IoR.class);
		MCList<SlsRet_Upd01_HdrR> _sepHdrL = MCList.create(SlsRet_Upd01_HdrR.class);
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			for (SlsRet_Upd01_HdrR hdrR : up0()) {
				// 売上返品は売上実績SVを呼び出す
				if (MAC_TRD_PTN_TYP.isSLS_RTN(hdrR.trd_ptn_typ())) {
					// 売上実績SV呼出
					callSlsActSv(hdrR);
				}
				
				// 売上返品予定紐づきの場合、売上返品予定を更新
				if (!isNull(hdrR.sls_ret_schd_no())) {
					
					// 売上返品は受払予定SV、入荷予定SVを呼び出す
					if (MAC_TRD_PTN_TYP.isSLS_RTN(hdrR.trd_ptn_typ())) {
						
						// インボイス取引対象用チェック
						chkIVAllRet(hdrR);
						
						// 入荷予定SV呼出
						callArrSchdSv(hdrR);
						
						// 売上返品予定の完了ＦＬＧを更新
						updSlsRetSchdCompFlg(hdrR);
					}
					// 出荷返品の場合
					else {
						
						// 売上返品予定の完了ＦＬＧを更新
						updSlsRetSchdCompFlg(hdrR);
						
						//売上予定SV呼出
						callSlsShcdSv(hdrR);
						
						// 受注状況更新SV呼出
						callSloStsSv(hdrR);
					}
				}
				
				setDown(hdrR);
			}
		}
		
		/**
		 * 売上返品予定引継でインボイス取引対象の場合
		 * 全明細・全数量が売上返品計上されようとしているかチェック
		 * 
		 * @param hdrR
		 */
		protected void chkIVAllRet(SlsRet_Upd01_HdrR hdrR) {
			if (MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
				return;
			}
			
			MAM_BP_R bpR = MAM_BP_R.create();
			MAM_BP_R bpR_t = MAM_BP_R.create("T");
			MCQueryApiBuilder bpR_bldr = MCQueryApiBuilder.create(bpR_t);
			bpR_bldr.setSelect(bpR_t.cst_iv_flg);
			dbSelectKey("MSBBL6210_MAM_BP_S01", bpR, bpR_bldr, hdrR.cst_cd());
			if (!bpR.cst_iv_flg()){
				return;
			}
			
			MCList<MST_SLS_RET_SCHD_D_R> schdL = MCList.create(MST_SLS_RET_SCHD_D_R.class);
			MST_SLS_RET_SCHD_D_R schdL_t = MST_SLS_RET_SCHD_D_R.create("T");
			MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(schdL_t);
			schdL_bldr.setSelect(
					schdL_t.sls_ret_schd_d_no,
					schdL_t.base_unit_qty
			);
			schdL_bldr.setWhere(schdL_t.sls_ret_schd_no.eq(bind("1")), hdrR.sls_ret_schd_no());
			schdL_bldr.addWhereWithAnd(schdL_t.abort_flg.eq(value(false)));
			dbSelect("MSBBL6210_MST_SLS_RET_SCHD_D_S01", schdL, schdL_bldr);
			MCList<SlsRet_Upd01_DtlR> tmpDtlL = up1().subList(SlsAct_Upd01_DtlR.$hdr_peg_no, hdrR.hdr_peg_no());
			
			if (!isSame(schdL.size(), tmpDtlL.groupBy(SlsRet_Upd01_DtlR.$sls_ret_schd_d_no).size())) {
				throw new MCAppException(MSBBL0269, hdrR.sls_ret_schd_no()); 
			}
			
			for (MST_SLS_RET_SCHD_D_R schdR : schdL) {
				MCList<SlsRet_Upd01_DtlR> tmpL = tmpDtlL.subList(SlsRet_Upd01_DtlR.$sls_ret_schd_d_no, schdR.sls_ret_schd_d_no());
				if (!isSame(schdR.base_unit_qty(), tmpL.sum(MST_SLS_RET_SCHD_D_R.$base_unit_qty))) {
					throw new MCAppException(MSBBL0269, hdrR.sls_ret_schd_no());
				}
			}
		}
		
		/**
		 * 下り電文作成
		 * 
		 */
		protected void setDown(SlsRet_Upd01_HdrR hdrR) {
			SlsRet_Upd01_RsltR rsltR = SlsRet_Upd01_RsltR.create();
			rsltR.hdr_peg_no(hdrR.hdr_peg_no());
			rsltR.sls_act_no(hdrR.sls_act_no());
			rsltR.sls_act_seq(hdrR.sls_act_seq());
			rsltR.sls_act_rev(hdrR.sls_act_rev());
			rsltR.dlv_slip_no(hdrR.dlv_slip_no());
			rsltR.iv_no(hdrR.iv_no());
			
			down0().add(rsltR);
			// 伝票分割されたヘッダ情報も下り電文に設定
			if (!isNull(_sepHdrL) && _sepHdrL.size() > 0) {
				for (SlsRet_Upd01_HdrR sepHdrR : _sepHdrL) {
					SlsRet_Upd01_RsltR sepRsltR = SlsRet_Upd01_RsltR.create();
					sepRsltR.hdr_peg_no(sepHdrR.hdr_peg_no());
					sepRsltR.sls_act_no(sepHdrR.sls_act_no());
					sepRsltR.sls_act_seq(sepHdrR.sls_act_seq());
					sepRsltR.sls_act_rev(sepHdrR.sls_act_rev());
					sepRsltR.dlv_slip_no(sepHdrR.dlv_slip_no());
					sepRsltR.iv_no(sepHdrR.iv_no());
					down0().add(sepRsltR);
				}
			}
		}
		
		/**
		 * 売上予定サービスを呼出す
		 * @param hdrR
		 */
		protected void callSlsShcdSv(SlsRet_Upd01_HdrR hdrR){
			//売上返品予定NOを元に、売上返品予定の情報を取得する
			MST_SLS_RET_SCHD_R slsRetSchdR = MST_SLS_RET_SCHD_R.create();
			MST_SLS_RET_SCHD_R slsRetSchdR_t = MST_SLS_RET_SCHD_R.create("T");
			MCQueryApiBuilder slsRetSchdR_bldr = MCQueryApiBuilder.create(slsRetSchdR_t);
			slsRetSchdR_bldr.setSelect(slsRetSchdR_t.cst_cd);
			dbSelectKey("MSBBL6210_MST_SLS_RET_SCHD_S02", slsRetSchdR, slsRetSchdR_bldr, hdrR);
			
			MCList<MST_SLS_RET_SCHD_D_R> schdL = MCList.create(MST_SLS_RET_SCHD_D_R.class);
			MST_SLS_RET_SCHD_D_R schdL_t = MST_SLS_RET_SCHD_D_R.create("SRSD");
			MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(schdL_t);
			schdL_bldr.setSelect(
					schdL_t.sls_ret_schd_d_no,
					schdL_t.slo_d_no,
					schdL_t.vmi_flg
			);
			dbSelectKey("MSBBL6210_MST_SLS_RET_SCHD_D_S02", schdL, schdL_bldr, up1());
			MCIndexKey schdDIdxkey = schdL.createIndex(MST_SLS_RET_SCHD_D_R.$slo_d_no);
			
			//出荷返品かつインボイス取引の得意先の場合に、売上予定サービスを呼ぶ。
			MAM_BP_R bpR = MAM_BP_R.create();
			MAM_BP_R bpR_t = MAM_BP_R.create("T");
			MCQueryApiBuilder bpR_bldr = MCQueryApiBuilder.create(bpR_t);
			bpR_bldr.setSelect(bpR_t.cst_iv_flg);
			dbSelectKey("MSBBL6210_MAM_BP_S02", bpR, bpR_bldr, slsRetSchdR.cst_cd());
			if (bpR.cst_iv_flg()){
				MSBBL_SlsSchdService.Sls_Schd_Upd05 op = MSBBL_SlsSchdService
						.crtSls_Schd_Upd05();
				// ヘッダ紐付けＮＯに紐付く明細情報を取得
				MCList<SlsRet_Upd01_DtlR> tmpDtlL = up1().subList(SlsAct_Upd01_DtlR.$hdr_peg_no, hdrR.hdr_peg_no());
				tmpDtlL.sort(SlsRet_Upd01_DtlR.$disp_seq);
				
				// 受注明細単位で集計して売上予定サービスを呼び出す
				MCList<SlsRet_Upd01_DtlR> bindL = tmpDtlL.subList(r -> !isNull(r.slo_d_no()));
				bindL.groupBy(SlsRet_Upd01_DtlR.$slo_d_no);
				
				MCIndexKey dtlIdxkey = tmpDtlL.createIndex(SlsRet_Upd01_DtlR.$slo_d_no);
				
				MCList<MST_SHIP_PR_R> shipPrL = MCList.create(MST_SHIP_PR_R.class);
				MST_SHIP_PR_R shipPrL_t = MST_SHIP_PR_R.create("T");
				MCQueryApiBuilder shipPrL_bldr = MCQueryApiBuilder.create(shipPrL_t);
				
				shipPrL_bldr.setSelect(
						shipPrL_t.slo_d_no,
						shipPrL_t.ship_ret_qty,
						shipPrL_t.base_unit_cd
				);
				shipPrL_bldr.addConstWhereWithAnd(shipPrL_t.ship_ret_qty.gt(value(0)));
				dbSelectColumn("MSBBL6210_MST_SHIP_PR_S01", shipPrL, shipPrL_bldr,
						MST_SHIP_PR_R.$slo_d_no, bindL, SlsRet_Upd01_DtlR.$slo_d_no);

				// 新規進捗に出荷返品数量>0のデータが存在する場合に、新規と更新電文を作成する
				for (MST_SHIP_PR_R shipPrR : shipPrL) {
					MST_SLS_RET_SCHD_D_R schdR = schdL.getFirst(schdDIdxkey, shipPrR.slo_d_no());
					if (!isNull(schdR) && schdR.vmi_flg()) {
						continue;
					}
					
					Sls_Schd_Upd05_DtlR slsSchdR = Sls_Schd_Upd05_DtlR.create();
					slsSchdR.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.SLO_D.value());
					slsSchdR.sls_ret_flg(true);
					
					slsSchdR.base_unit_qty(shipPrR.ship_ret_qty());
					slsSchdR.base_unit_cd(shipPrR.base_unit_cd());
					
					MCList<SlsRet_Upd01_DtlR> dtlL = tmpDtlL.subList(dtlIdxkey, shipPrR.slo_d_no());
					
					if (MAC_DATA_CRUD_TYP.isCRT(hdrR.data_crud_typ()) 
							&& isSame(shipPrR.ship_ret_qty(), dtlL.sum(SlsRet_Upd01_DtlR.$base_unit_qty))) {
						// ヘッダのデータ更新区分が新規かつ出荷進捗の出荷返品数量が上り電文の数量が一致する場合に、データ更新区分を新規に設定する
						slsSchdR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					}
					else {
						// 出荷進捗の出荷返品数量が上り電文の数量が一致しないかつ出荷返品が存在する場合に、データ更新区分を更新に設定する
						slsSchdR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					}
					slsSchdR.slo_d_no(shipPrR.slo_d_no());
					
					op.up0().add(slsSchdR);
				}
				
				// ヘッダのデータ更新区分削除かつ出荷進捗の出荷返品数量>0のデータが存在しない場合、削除の電文を削除する
				MCIndexKey shipPrIdxkey = shipPrL.createIndex(MST_SHIP_PR_R.$slo_d_no);
				for (SlsRet_Upd01_DtlR dtlR : tmpDtlL.groupBy(SlsRet_Upd01_DtlR.$slo_d_no)) {
					if (isNull(dtlR.slo_d_no())) {
						continue;
					}					
					if (!MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ()) 
							|| shipPrL.contains(shipPrIdxkey, dtlR.slo_d_no())) {
						continue;
					}
					MST_SLS_RET_SCHD_D_R schdR = schdL.getFirst(schdDIdxkey, dtlR.slo_d_no());
					if (!isNull(schdR) && schdR.vmi_flg()) {
						continue;
					}
					Sls_Schd_Upd05_DtlR slsSchdR = Sls_Schd_Upd05_DtlR.create();
					slsSchdR.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.SLO_D.value());
					slsSchdR.sls_ret_flg(true);
					
					slsSchdR.data_crud_typ(hdrR.data_crud_typ());
					slsSchdR.slo_d_no(dtlR.slo_d_no());
					op.up0().add(slsSchdR);
				}
				for (SlsRet_Upd01_DtlR dtlR : tmpDtlL.subList(r->isNull(r.slo_d_no())).distinctNE(SlsRet_Upd01_DtlR.$ref_dlv_slip_d_no)) {
					// インボイス取引対象計画外出荷の返品
					Sls_Schd_Upd05_DtlR slsSchdR = Sls_Schd_Upd05_DtlR.create();
					slsSchdR.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.SHIP_ACT_D.value());
					slsSchdR.sls_ret_flg(true);
					slsSchdR.dlv_slip_d_no(dtlR.ref_dlv_slip_d_no());
					op.up0().add(slsSchdR);
				}
				if (!op.up0().isEmpty()) {
					op.exec();
				}
			}
		}
		
		/**
		 * 受注状況更新SV呼出
		 * 
		 * @param hdrR
		 */
		protected void callSloStsSv(SlsRet_Upd01_HdrR hdrR) {
			// ヘッダ紐付けＮＯに紐付く明細情報を取得
			MCList<SlsRet_Upd01_DtlR> tmpDtlL = up1().subList(SlsAct_Upd01_DtlR.$hdr_peg_no, hdrR.hdr_peg_no());
			tmpDtlL.sort(SlsRet_Upd01_DtlR.$disp_seq);
			
			MSBBL_SloStsRegService.SloSts_Ins01 ope = MSBBL_SloStsRegService.crtSloSts_Ins01();
			
			for (SlsRet_Upd01_DtlR dtlR : tmpDtlL) {
				if (isNull(dtlR.slo_d_no())) {
					continue;
				}
				if (!MAC_DATA_CRUD_TYP.isCRT(hdrR.data_crud_typ())) {
					// 取消データ作成
					MST_SLO_STS_R tmpStsR = MST_SLO_STS_R.create();
					MST_SLO_STS_R tmpStsR_t = MST_SLO_STS_R.create("T");
					MCQueryApiBuilder tmpStsR_bldr = MCQueryApiBuilder.create(tmpStsR_t);
					MST_SLO_STS_R S1W = MST_SLO_STS_R.create("W");
					tmpStsR_bldr.setSelect(
							tmpStsR_t.qty,
							tmpStsR_t.ac_dt,
							tmpStsR_t.biz_tm,
							tmpStsR_t.arr_act_no,
							tmpStsR_t.unit_cd,
							tmpStsR_t.loc_cd
					);
					tmpStsR_bldr.setWhere(tmpStsR_t.slo_sts_no.eq(subQuery()
							.select(max(S1W.slo_sts_no))
							.from(S1W)
							.where(S1W.slo_d_no.eq(tmpStsR_t.slo_d_no)
									.and(S1W.dlv_slip_no.eq(tmpStsR_t.dlv_slip_no))
									.and(S1W.dlv_slip_d_no.eq(tmpStsR_t.dlv_slip_d_no))
									.and(S1W.arr_act_no.eq(tmpStsR_t.arr_act_no))
									.and(S1W.slo_sts_typ.eq(value(MSC_SLO_STS_TYP.SHIP_RET.value())))))
					);
					tmpStsR_bldr.addWhereWithAnd(tmpStsR_t.slo_d_no.eq(bind("1")),
							dtlR.slo_d_no());
					tmpStsR_bldr.addWhereWithAnd(tmpStsR_t.dlv_slip_no.eq(bind("1")),
							dtlR.ref_dlv_slip_no());
					tmpStsR_bldr.addWhereWithAnd(tmpStsR_t.dlv_slip_d_no.eq(bind("1")),
							dtlR.ref_dlv_slip_d_no());
					tmpStsR_bldr.addWhereWithAnd(tmpStsR_t.arr_act_no.eq(bind("1")),
							dtlR.arr_act_no());
					tmpStsR_bldr.addWhereWithAnd(tmpStsR_t.slo_sts_typ.eq(value(MSC_SLO_STS_TYP.SHIP_RET.value())));
					int cnt = dbSelect("MSBBL6210_MST_SLO_STS_S01", tmpStsR, tmpStsR_bldr);
					
					if (cnt > 0) {
						SloSts_DtlR sloStsR = SloSts_DtlR.create();
						sloStsR.slo_d_no(dtlR.slo_d_no());						// 受注明細ＮＯ
						sloStsR.slo_sts_typ(MSC_SLO_STS_TYP.SHIP_RET.value());	// 受注状況区分（出荷返品）
						sloStsR.unit_cd(tmpStsR.unit_cd());						// 単位ＣＤ
						sloStsR.qty(tmpStsR.qty().negate());					// 数量
						sloStsR.loc_cd(tmpStsR.loc_cd());						// 場所ＣＤ
						sloStsR.dlv_slip_no(dtlR.ref_dlv_slip_no());			// 納品書ＮＯ（出荷時の納品書ＮＯ）
						sloStsR.dlv_slip_d_no(dtlR.ref_dlv_slip_d_no());		// 納品書明細ＮＯ（出荷時の納品書明細ＮＯ）
						sloStsR.ac_dt(tmpStsR.ac_dt());							// 計上日（入荷日）
						sloStsR.biz_tm(tmpStsR.biz_tm());						// 業務実施日時（入荷日時）
						sloStsR.arr_act_no(dtlR.arr_act_no());					// 入荷実績ＮＯ
						ope.up0().add(sloStsR);
					}
				}
				if (!MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
					SloSts_DtlR sloStsR = SloSts_DtlR.create();
					sloStsR.slo_d_no(dtlR.slo_d_no());						// 受注明細ＮＯ
					sloStsR.slo_sts_typ(MSC_SLO_STS_TYP.SHIP_RET.value());	// 受注状況区分（出荷返品）
					sloStsR.dlv_slip_no(dtlR.ref_dlv_slip_no());			// 納品書ＮＯ（出荷時の納品書ＮＯ）
					sloStsR.dlv_slip_d_no(dtlR.ref_dlv_slip_d_no());		// 納品書明細ＮＯ（出荷時の納品書明細ＮＯ）
					sloStsR.arr_act_no(dtlR.arr_act_no());					// 入荷実績ＮＯ
					MST_ARR_ACT_R arrR = MST_ARR_ACT_R.create();
					MST_ARR_ACT_R arrR_t = MST_ARR_ACT_R.create("T");
					MCQueryApiBuilder arrR_bldr = MCQueryApiBuilder.create(arrR_t);
					arrR_bldr.setSelect(
							arrR_t.trd_unit_cd,
							arrR_t.trd_unit_qty,
							arrR_t.arr_loc_cd,
							arrR_t.ac_dt,
							arrR_t.arr_tm
					);
					arrR_bldr.setWhere(arrR_t.arr_act_no.eq(bind("1")),
							dtlR.arr_act_no());
					dbSelect("MSBBL6210_MST_ARR_ACT_S01", arrR, arrR_bldr);
					sloStsR.unit_cd(arrR.trd_unit_cd());					// 単位ＣＤ
					sloStsR.qty(arrR.trd_unit_qty());						// 数量
					sloStsR.loc_cd(arrR.arr_loc_cd());						// 場所ＣＤ
					sloStsR.ac_dt(arrR.ac_dt());							// 計上日（入荷日）
					sloStsR.biz_tm(arrR.arr_tm());							// 業務実施日時（入荷日時）
					ope.up0().add(sloStsR);
				}
			}
			if (!isNull(ope.up0())) {
				ope.exec();
			}
		}
		
		/**
		 * 入荷予定SV呼出
		 * 
		 * @param hdrR
		 */
		protected void callArrSchdSv(SlsRet_Upd01_HdrR hdrR) {
			
			// ヘッダ紐付けＮＯに紐付く明細情報を取得
			MCList<SlsRet_Upd01_DtlR> tmpDtlL = up1().subList(SlsAct_Upd01_DtlR.$hdr_peg_no, hdrR.hdr_peg_no());
			tmpDtlL.sort(SlsRet_Upd01_DtlR.$disp_seq);
			
			MSBEL_ArrSchdService.ArrSchd_Upd03 opeUpd03 = MSBEL_ArrSchdService.crtArrSchd_Upd03();
			MCList<ArrSchd_DtlR> opeUpd03DtlL = MCList.create(ArrSchd_DtlR.class);
			
			String[] ioKeys = new String[] {
					SlsRet_Upd01_IoR.$hdr_peg_no, SlsRet_Upd01_IoR.$dtl_peg_no
			};
			MCList<SlsRet_Upd01_IoR> ioTgtL = MCList.create(SlsRet_Upd01_IoR.class);
			
			for (SlsRet_Upd01_DtlR tmpDtlR : tmpDtlL) {
				// ヘッダ紐付きＮＯ、明細紐付きＮＯに紐づく詳細情報を取得
				Comparable<?>[] ioVals = new Comparable[] {
						tmpDtlR.hdr_peg_no(), tmpDtlR.dtl_peg_no()
				};
				ioTgtL.clear();
				ioTgtL.addAll(up2().subList(ioKeys, ioVals));
				
				for (SlsRet_Upd01_IoR ioR : ioTgtL) {
					ioR.addStringColumn("arr_schd_no");
					ioR.sls_ret_schd_d_no(tmpDtlR.sls_ret_schd_d_no());
					executeQuery(ioR, MSBBL6210_MST_ARR_PR_S1(), ioR);
				}
			}
			
			// 入荷予定SV呼出
			up2().addStringColumn("arr_schd_no");
			for (MCList<SlsRet_Upd01_IoR> lst : up2().groupList("arr_schd_no")) {
				SlsRet_Upd01_IoR ioR = lst.distinctNE(SlsRet_Upd01_IoR.$data_crud_typ).get(0);
				if (!isNull(ioR.getStringNE("arr_schd_no"))) {
					ArrSchd_DtlR opeUpd03DtlR = ArrSchd_DtlR.create();
					opeUpd03DtlR.arr_schd_no(ioR.getStringNE("arr_schd_no"));			// 入荷予定ＮＯ
					if (!MAC_DATA_CRUD_TYP.isDEL(ioR.data_crud_typ())) {
						opeUpd03DtlR.sls_ret_schd_abort_flg(ioR.sls_ret_schd_abort_flg());	// 売上返品予定打切ＦＬＧ
					}
					opeUpd03DtlL.add(opeUpd03DtlR);
				}
			}
			opeUpd03.up0().addAll(opeUpd03DtlL);
			opeUpd03.exec();
		}
		
		/**
		 * 売上実績SV呼出
		 * 
		 * @param hdrR
		 */
		protected void callSlsActSv(SlsRet_Upd01_HdrR hdrR) {
			MSBBL_SlsActService.SlsAct_Upd01 ope = MSBBL_SlsActService.crtSlsAct_Upd01();
			SlsAct_Upd01_HdrR up0 = SlsAct_Upd01_HdrR.create();
			MCList<SlsAct_Upd01_DtlR> up1 = MCList.create(SlsAct_Upd01_DtlR.class);
			MCList<SlsAct_Upd01_IoR> up2 = MCList.create(SlsAct_Upd01_IoR.class);
			
			// 売上実績SV呼出電文作成
			up0 = makeSlsActHdr(hdrR);
			up1 = makeSlsActDtl(hdrR);
			up2 = makeSlsActIo(hdrR);
			
			ope.up0().add(up0);
			ope.up1().addAll(up1);
			ope.up2().addAll(up2);
			ope.up3().indiv_prnt_flg(hdrR.indiv_prnt_flg());
			
			// 売上実績SV呼出
			ope.exec();
			
			hdrR.sls_act_no(ope.down0().get(0).sls_act_no());
			hdrR.sls_act_seq(ope.down0().get(0).sls_act_seq());
			hdrR.sls_act_rev(ope.down0().get(0).sls_act_rev());
			hdrR.dlv_slip_no(ope.down0().get(0).dlv_slip_no());
			hdrR.iv_no(ope.down0().get(0).iv_no());
			// 売上実績サービス処理結果の伝票分割されたヘッダ情報も取得
			_sepHdrL.clear();
			if (ope.down0().size() > 1) {
				for (int i = 1; i < ope.down0().size(); i++) {
					SlsAct_Upd01_RsltR downR = ope.down0().get(i);
					SlsRet_Upd01_HdrR sepHdrR = SlsRet_Upd01_HdrR.create();
					sepHdrR.sls_act_no(downR.sls_act_no());
					sepHdrR.sls_act_seq(downR.sls_act_seq());
					sepHdrR.sls_act_rev(downR.sls_act_rev());
					sepHdrR.dlv_slip_no(downR.dlv_slip_no());
					sepHdrR.iv_no(ope.down0().get(0).iv_no());
					_sepHdrL.add(sepHdrR);
				}
			}
		}
		
		/**
		 * 売上実績SV呼出用電文作成（受払）
		 * 
		 * @param hdrR
		 * @return
		 */
		protected MCList<SlsAct_Upd01_IoR> makeSlsActIo(SlsRet_Upd01_HdrR hdrR) {
			MCList<SlsAct_Upd01_IoR> up2 = MCList.create(SlsAct_Upd01_IoR.class);
			
			// ヘッダ紐付けＮＯに紐付く受払情報を取得
			MCList<SlsRet_Upd01_IoR> tmpIoL = up2().subList(SlsAct_Upd01_IoR.$hdr_peg_no, hdrR.hdr_peg_no());
			tmpIoL.sort(SlsRet_Upd01_IoR.$dtl_peg_no, SlsRet_Upd01_IoR.$io_peg_no);
			
			for (SlsRet_Upd01_IoR tmpIoR : tmpIoL) {
				SlsAct_Upd01_IoR slsActIR = SlsAct_Upd01_IoR.create();
				
				copy(slsActIR, tmpIoR, createMap_SlsAct_Upd01_IoR_SlsRet_Upd01_IoR());
				
				up2.add(slsActIR);
			}
			
			return up2;
		}
		
		/**
		 * 売上実績SV呼出用電文作成（明細）
		 * 
		 * @param hdrR
		 * @return
		 */
		protected MCList<SlsAct_Upd01_DtlR> makeSlsActDtl(SlsRet_Upd01_HdrR hdrR) {
			MCList<SlsAct_Upd01_DtlR> up1 = MCList.create(SlsAct_Upd01_DtlR.class);
			
			// ヘッダ紐付けＮＯに紐付く明細情報を取得
			MCList<SlsRet_Upd01_DtlR> tmpDtlL = up1().subList(SlsAct_Upd01_DtlR.$hdr_peg_no, hdrR.hdr_peg_no());
			tmpDtlL.sort(SlsRet_Upd01_DtlR.$disp_seq);
			
			for (SlsRet_Upd01_DtlR tmpDtlR : tmpDtlL) {
				SlsAct_Upd01_DtlR slsActDR = SlsAct_Upd01_DtlR.create();
				slsActDR.sls_ret_schd_no(hdrR.sls_ret_schd_no());
				
				copy(slsActDR, tmpDtlR, createMap_SlsAct_Upd01_DtlR_SlsRet_Upd01_DtlR());
				
				up1.add(slsActDR);
			}
			
			return up1;
		}
		
		/**
		 * 売上実績SV呼出用電文作成（ヘッダ）
		 * 
		 * @param hdrR
		 * @return
		 */
		protected SlsAct_Upd01_HdrR makeSlsActHdr(SlsRet_Upd01_HdrR hdrR) {
			SlsAct_Upd01_HdrR up0 = SlsAct_Upd01_HdrR.create();
			
			copy(up0, hdrR, createMap_SlsAct_Upd01_HdrR_SlsRet_Upd01_HdrR());
			
			return up0;
		}
		
		/**
		 * 入荷進捗の情報を基づき、売上返品予定の完了ＦＬＧを更新する。
		 * @param hdrR 売上返品ヘッダ
		 */
		protected void updSlsRetSchdCompFlg(SlsRet_Upd01_HdrR hdrR) {
			
			// ヘッダに紐づく明細を取得
			MCIndexKey idxKey = up1().createIndex(SlsRet_Upd01_DtlR.$hdr_peg_no);
			MCList<SlsRet_Upd01_DtlR> dtlL = up1().subList(idxKey, hdrR.hdr_peg_no());
			
			MCList<MST_SLS_RET_SCHD_D_R> slsRetSchdDL = MCList.create(MST_SLS_RET_SCHD_D_R.class);
			
			MCList<MST_ARR_PR_R> arrPrL = getArrPrL(dtlL);
			MCIndexKey idxkey = arrPrL.createIndex(MST_ARR_PR_R.$sls_ret_schd_d_no);
			
			MST_SLS_RET_SCHD_D_R updR = null;
			for (SlsRet_Upd01_DtlR dtlR : dtlL) {
				
				MST_ARR_PR_R arrPrR = arrPrL.getFirst(idxkey, dtlR.sls_ret_schd_d_no());
				
				if (isNull(arrPrR) || arrPrR.isEmpty()) {
					continue;
				}
				
				updR = MST_SLS_RET_SCHD_D_R.create();
				
				updR.sls_ret_schd_d_no(dtlR.sls_ret_schd_d_no());
				
				if (MAC_TRD_PTN_TYP.isSHIP_RTN(hdrR.trd_ptn_typ()) || dtlR.vmi_flg() ) {
					// 出荷返品または貸出の場合は、入荷が完了した場合に完了にする。
					
					if (arrPrR.arr_cmpl_flg()) {
						updR.cmpl_flg(true);
					}
					else {
						updR.cmpl_flg(false);
					}
				}
				else if (MAC_TRD_PTN_TYP.isSLS_RTN(hdrR.trd_ptn_typ())) {
					// 売上返品の場合は、入荷完了かつ売上返品完了した場合に完了にする。
					
					if (arrPrR.arr_cmpl_flg() && arrPrR.sls_ret_cmpl_flg()) {
						updR.cmpl_flg(true);
					}
					else {
						updR.cmpl_flg(false);
					}
				}
				
				dtlR.arr_qty(arrPrR.arr_qty());
				dtlR.aft_cmpl_flg(updR.cmpl_flg());
				
				slsRetSchdDL.add(updR);
			}
			MST_SLS_RET_SCHD_D_R t = MST_SLS_RET_SCHD_D_R.create("T");
			MCQueryApiBuilder slsRetSchdDL_bldr = MCQueryApiBuilder.create(t);
			
			slsRetSchdDL_bldr.setSet(t.cmpl_flg);
			
			dbUpdateKey("MSBBL6210_MST_SLS_RET_SCHD_D_U01", slsRetSchdDL, slsRetSchdDL_bldr);
		}
		
		/**
		 * 売上返品予定に紐付く入荷進捗を取得する。
		 * @param dtlL 売上返品明細リスト
		 * @return 出荷進捗
		 */
		protected MCList<MST_ARR_PR_R> getArrPrL(MCList<SlsRet_Upd01_DtlR> dtlL) {
			
			MCList<MST_ARR_PR_R> arrPrL = MCList.create(MST_ARR_PR_R.class);
			MST_ARR_PR_R t = MST_ARR_PR_R.create("T");
			MCQueryApiBuilder arrPrL_bldr = MCQueryApiBuilder.create(t);
			
			arrPrL_bldr.setSelect(
					t.sls_ret_schd_d_no,
					t.arr_qty,
					t.arr_cmpl_flg,
					t.sls_ret_cmpl_flg
			);
			
			dbSelectColumn("MSBBL6210_MST_ARR_PR_S01", arrPrL, arrPrL_bldr,
					MST_ARR_PR_R.$sls_ret_schd_d_no,
					dtlL.groupBy(SlsRet_Upd01_DtlR.$sls_ret_schd_d_no),
					SlsRet_Upd01_DtlR.$sls_ret_schd_d_no);
			
			return arrPrL;
		}
		
		// RowMapper
		protected Map_SlsAct_Upd01_IoR_SlsRet_Upd01_IoR<SlsAct_Upd01_IoR,SlsRet_Upd01_IoR> createMap_SlsAct_Upd01_IoR_SlsRet_Upd01_IoR() {
			return new Map_SlsAct_Upd01_IoR_SlsRet_Upd01_IoR<SlsAct_Upd01_IoR, SlsRet_Upd01_IoR>();
		}

		public class Map_SlsAct_Upd01_IoR_SlsRet_Upd01_IoR<D extends SlsAct_Upd01_IoR, S extends SlsRet_Upd01_IoR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsAct_Upd01_IoR.$hdr_peg_no, SlsRet_Upd01_IoR.$hdr_peg_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$dtl_peg_no, SlsRet_Upd01_IoR.$dtl_peg_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$io_peg_no, SlsRet_Upd01_IoR.$io_peg_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sls_act_io_no, SlsRet_Upd01_IoR.$sls_act_io_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sls_act_io_seq, SlsRet_Upd01_IoR.$sls_act_io_seq);
				addColumnPathMap(SlsAct_Upd01_IoR.$data_crud_typ, SlsRet_Upd01_IoR.$data_crud_typ);
				addColumnPathMap(SlsAct_Upd01_IoR.$arr_act_no, SlsRet_Upd01_IoR.$arr_act_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$purc_act_io_no, SlsRet_Upd01_IoR.$purc_act_io_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sno1, SlsRet_Upd01_IoR.$sno1);
				addColumnPathMap(SlsAct_Upd01_IoR.$sno2, SlsRet_Upd01_IoR.$sno2);
				addColumnPathMap(SlsAct_Upd01_IoR.$sno3, SlsRet_Upd01_IoR.$sno3);
				addColumnPathMap(SlsAct_Upd01_IoR.$sno4, SlsRet_Upd01_IoR.$sno4);
				addColumnPathMap(SlsAct_Upd01_IoR.$gd_cd, SlsRet_Upd01_IoR.$gd_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$loc_cd, SlsRet_Upd01_IoR.$loc_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$str_ln_cd, SlsRet_Upd01_IoR.$str_ln_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$lot_no, SlsRet_Upd01_IoR.$lot_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sublot_no, SlsRet_Upd01_IoR.$sublot_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$trd_unit_cd, SlsRet_Upd01_IoR.$trd_unit_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$trd_unit_qty, SlsRet_Upd01_IoR.$trd_unit_qty);
				addColumnPathMap(SlsAct_Upd01_IoR.$base_unit_cd, SlsRet_Upd01_IoR.$base_unit_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$base_unit_qty, SlsRet_Upd01_IoR.$base_unit_qty);
				addColumnPathMap(SlsAct_Upd01_IoR.$pack_unit_cd, SlsRet_Upd01_IoR.$pack_unit_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$pack_unit_qty, SlsRet_Upd01_IoR.$pack_unit_qty);
				addColumnPathMap(SlsAct_Upd01_IoR.$sync_flg, SlsRet_Upd01_IoR.$sync_flg);
				addColumnPathMap(SlsAct_Upd01_IoR.$sub_char1, SlsRet_Upd01_IoR.$sub_char1);
				addColumnPathMap(SlsAct_Upd01_IoR.$sub_char2, SlsRet_Upd01_IoR.$sub_char2);
				addColumnPathMap(SlsAct_Upd01_IoR.$sub_char3, SlsRet_Upd01_IoR.$sub_char3);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.sls_ret_schd_flg(src.sls_ret_schd_abort_flg());
			}
		}
		
		protected Map_SlsAct_Upd01_DtlR_SlsRet_Upd01_DtlR<SlsAct_Upd01_DtlR,SlsRet_Upd01_DtlR> createMap_SlsAct_Upd01_DtlR_SlsRet_Upd01_DtlR() {
			return new Map_SlsAct_Upd01_DtlR_SlsRet_Upd01_DtlR<SlsAct_Upd01_DtlR, SlsRet_Upd01_DtlR>();
		}
		
		public class Map_SlsAct_Upd01_DtlR_SlsRet_Upd01_DtlR<D extends SlsAct_Upd01_DtlR, S extends SlsRet_Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsAct_Upd01_DtlR.$hdr_peg_no, SlsRet_Upd01_DtlR.$hdr_peg_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dtl_peg_no, SlsRet_Upd01_DtlR.$dtl_peg_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$data_crud_typ, SlsRet_Upd01_DtlR.$data_crud_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_act_d_no, SlsRet_Upd01_DtlR.$sls_act_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_act_d_seq, SlsRet_Upd01_DtlR.$sls_act_d_seq);
				addColumnPathMap(SlsAct_Upd01_DtlR.$disp_seq, SlsRet_Upd01_DtlR.$disp_seq);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_cd, SlsRet_Upd01_DtlR.$dlv_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_sundry_flg, SlsRet_Upd01_DtlR.$dlv_sundry_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_zip_cd, SlsRet_Upd01_DtlR.$dlv_zip_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_addr1, SlsRet_Upd01_DtlR.$dlv_addr1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_addr2, SlsRet_Upd01_DtlR.$dlv_addr2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_addr3, SlsRet_Upd01_DtlR.$dlv_addr3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_addr4, SlsRet_Upd01_DtlR.$dlv_addr4);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_cntct_dpt, SlsRet_Upd01_DtlR.$dlv_cntct_dpt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_cntct_psn, SlsRet_Upd01_DtlR.$dlv_cntct_psn);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_tel, SlsRet_Upd01_DtlR.$dlv_tel);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_fax, SlsRet_Upd01_DtlR.$dlv_fax);
				addColumnPathMap(SlsAct_Upd01_DtlR.$pri_prnt_flg, SlsRet_Upd01_DtlR.$pri_prnt_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dest_cd1, SlsRet_Upd01_DtlR.$dest_cd1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dest_cd2, SlsRet_Upd01_DtlR.$dest_cd2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dest_cd3, SlsRet_Upd01_DtlR.$dest_cd3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_cd, SlsRet_Upd01_DtlR.$ret_bp_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_nm, SlsRet_Upd01_DtlR.$ret_bp_nm);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_zip_cd, SlsRet_Upd01_DtlR.$ret_bp_zip_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_addr1, SlsRet_Upd01_DtlR.$ret_bp_addr1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_addr2, SlsRet_Upd01_DtlR.$ret_bp_addr2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_addr3, SlsRet_Upd01_DtlR.$ret_bp_addr3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_addr4, SlsRet_Upd01_DtlR.$ret_bp_addr4);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_tel, SlsRet_Upd01_DtlR.$ret_bp_tel);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_fax, SlsRet_Upd01_DtlR.$ret_bp_fax);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_cntct_dpt, SlsRet_Upd01_DtlR.$ret_bp_cntct_dpt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_cntct_psn, SlsRet_Upd01_DtlR.$ret_bp_cntct_psn);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_cd, SlsRet_Upd01_DtlR.$itm_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_sub1, SlsRet_Upd01_DtlR.$itm_sub1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_sub2, SlsRet_Upd01_DtlR.$itm_sub2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_sub3, SlsRet_Upd01_DtlR.$itm_sub3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno1, SlsRet_Upd01_DtlR.$sno1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno2, SlsRet_Upd01_DtlR.$sno2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno3, SlsRet_Upd01_DtlR.$sno3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno4, SlsRet_Upd01_DtlR.$sno4);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno1_mng_typ, SlsRet_Upd01_DtlR.$sno1_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno2_mng_typ, SlsRet_Upd01_DtlR.$sno2_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno3_mng_typ, SlsRet_Upd01_DtlR.$sno3_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno4_mng_typ, SlsRet_Upd01_DtlR.$sno4_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cntry_org_cd, SlsRet_Upd01_DtlR.$cntry_org_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$loc_cd, SlsRet_Upd01_DtlR.$loc_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$str_ln_cd, SlsRet_Upd01_DtlR.$str_ln_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$lot_no, SlsRet_Upd01_DtlR.$lot_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sublot_no, SlsRet_Upd01_DtlR.$sublot_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$gd_cd, SlsRet_Upd01_DtlR.$gd_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_unit_cd, SlsRet_Upd01_DtlR.$trd_unit_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_unit_qty, SlsRet_Upd01_DtlR.$trd_unit_qty);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_unit_cd, SlsRet_Upd01_DtlR.$base_unit_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_unit_qty, SlsRet_Upd01_DtlR.$base_unit_qty);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_cur_upri, SlsRet_Upd01_DtlR.$trd_cur_upri);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_cur_amt, SlsRet_Upd01_DtlR.$trd_cur_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_cur_tax_amt, SlsRet_Upd01_DtlR.$trd_cur_tax_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_cur_upri, SlsRet_Upd01_DtlR.$base_cur_upri);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_cur_amt, SlsRet_Upd01_DtlR.$base_cur_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_cur_tax_amt, SlsRet_Upd01_DtlR.$base_cur_tax_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_cur_dscnt_amt, SlsRet_Upd01_DtlR.$base_cur_dscnt_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ptax_cur_upri, SlsRet_Upd01_DtlR.$ptax_cur_upri);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ptax_cur_amt, SlsRet_Upd01_DtlR.$ptax_cur_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ptax_cur_tax_amt, SlsRet_Upd01_DtlR.$ptax_cur_tax_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ptax_cur_dscnt_amt, SlsRet_Upd01_DtlR.$ptax_cur_dscnt_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$upri_not_tgt_flg, SlsRet_Upd01_DtlR.$upri_not_tgt_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$interim_flg, SlsRet_Upd01_DtlR.$interim_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tax_cd, SlsRet_Upd01_DtlR.$tax_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$inc_tax_flg, SlsRet_Upd01_DtlR.$inc_tax_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tax_rate, SlsRet_Upd01_DtlR.$tax_rate);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tax_typ, SlsRet_Upd01_DtlR.$tax_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_cur_dscnt_amt, SlsRet_Upd01_DtlR.$trd_cur_dscnt_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cost_upri, SlsRet_Upd01_DtlR.$cost_upri);
				addColumnPathMap(SlsAct_Upd01_DtlR.$bill_crryovr_times, SlsRet_Upd01_DtlR.$bill_crryovr_times);
				addColumnPathMap(SlsAct_Upd01_DtlR.$stk_mng_typ, SlsRet_Upd01_DtlR.$stk_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sundry_itm_flg, SlsRet_Upd01_DtlR.$sundry_itm_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_jnl_cd, SlsRet_Upd01_DtlR.$itm_jnl_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cst_po_d_no, SlsRet_Upd01_DtlR.$cst_po_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cst_itm_cd, SlsRet_Upd01_DtlR.$cst_itm_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cst_itm_nm, SlsRet_Upd01_DtlR.$cst_itm_nm);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_d_rmrks, SlsRet_Upd01_DtlR.$trd_d_rmrks);
				addColumnPathMap(SlsAct_Upd01_DtlR.$intr_rmrks, SlsRet_Upd01_DtlR.$intr_rmrks);
				addColumnPathMap(SlsAct_Upd01_DtlR.$rsn_cd, SlsRet_Upd01_DtlR.$ret_rsn_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$bd_dpt_cd, SlsRet_Upd01_DtlR.$bd_dpt_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$wtax_rate, SlsRet_Upd01_DtlR.$wtax_rate);
				addColumnPathMap(SlsAct_Upd01_DtlR.$slo_no, SlsRet_Upd01_DtlR.$slo_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$slo_d_no, SlsRet_Upd01_DtlR.$slo_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_ret_schd_d_no, SlsRet_Upd01_DtlR.$sls_ret_schd_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$purc_ddlv_po_no, SlsRet_Upd01_DtlR.$purc_ddlv_po_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$purc_ddlv_po_d_no, SlsRet_Upd01_DtlR.$purc_ddlv_po_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$purc_act_no, SlsRet_Upd01_DtlR.$purc_act_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$purc_act_d_no, SlsRet_Upd01_DtlR.$purc_act_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sub_char1, SlsRet_Upd01_DtlR.$sub_char1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sub_char2, SlsRet_Upd01_DtlR.$sub_char2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sub_char3, SlsRet_Upd01_DtlR.$sub_char3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dscnt_rsn_cd, SlsRet_Upd01_DtlR.$dscnt_rsn_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ref_sls_act_no, SlsRet_Upd01_DtlR.$ref_sls_act_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ref_sls_act_seq, SlsRet_Upd01_DtlR.$ref_sls_act_seq);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ref_sls_act_d_no, SlsRet_Upd01_DtlR.$ref_sls_act_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ref_sls_act_d_seq, SlsRet_Upd01_DtlR.$ref_sls_act_d_seq);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_sls_ac_dt, SlsRet_Upd01_DtlR.$base_sls_ac_dt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_slip_d_no, SlsRet_Upd01_DtlR.$dlv_slip_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sret_trd_cur_amt, SlsRet_Upd01_DtlR.$scrn_trd_cur_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sret_trd_cur_tax_amt, SlsRet_Upd01_DtlR.$scrn_trd_cur_tax_amt);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.tdlv_sundry_flg(true);
				dest.cost_amt(MSUCL_SlsUtil.getCostAmt(src.cost_upri(), src.base_unit_qty(), getBaseCur().amt_dec_place())); //原価金額
				if (src.dlv_sundry_flg()) {
					dest.dlv_nm(src.dlv_nm());
				}
				if (src.sundry_itm_flg()) {
					dest.itm_nm(src.itm_nm());
					dest.iv_itm_nm(src.iv_itm_nm());
				}
				
				if (src.abort_qty().gt(0)) {
					dest.sls_schd_abort_flg(true);
				}
				else {
					dest.sls_schd_abort_flg(false);
				}
			}
		}
		
		protected Map_SlsAct_Upd01_HdrR_SlsRet_Upd01_HdrR<SlsAct_Upd01_HdrR,SlsRet_Upd01_HdrR> createMap_SlsAct_Upd01_HdrR_SlsRet_Upd01_HdrR() {
			return new Map_SlsAct_Upd01_HdrR_SlsRet_Upd01_HdrR<SlsAct_Upd01_HdrR, SlsRet_Upd01_HdrR>();
		}
		
		public class Map_SlsAct_Upd01_HdrR_SlsRet_Upd01_HdrR<D extends SlsAct_Upd01_HdrR, S extends SlsRet_Upd01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsAct_Upd01_HdrR.$hdr_peg_no, SlsRet_Upd01_HdrR.$hdr_peg_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$data_crud_typ, SlsRet_Upd01_HdrR.$data_crud_typ);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_act_no, SlsRet_Upd01_HdrR.$sls_act_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_act_seq, SlsRet_Upd01_HdrR.$sls_act_seq);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_act_rev, SlsRet_Upd01_HdrR.$sls_act_rev);
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_cd, SlsRet_Upd01_HdrR.$trd_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_ptn_typ, SlsRet_Upd01_HdrR.$trd_ptn_typ);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ac_dt, SlsRet_Upd01_HdrR.$ac_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$can_ac_dt, SlsRet_Upd01_HdrR.$can_ac_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_usr_cd, SlsRet_Upd01_HdrR.$sls_usr_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_dpt_cd, SlsRet_Upd01_HdrR.$sls_dpt_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$wg_cd, SlsRet_Upd01_HdrR.$wg_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$cst_cd, SlsRet_Upd01_HdrR.$cst_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$iv_no, SlsRet_Upd01_HdrR.$iv_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ref_iv_no, SlsRet_Upd01_HdrR.$ref_iv_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_cd1, SlsRet_Upd01_HdrR.$tterm_cd1);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_rmrks1, SlsRet_Upd01_HdrR.$tterm_rmrks1);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_cd2, SlsRet_Upd01_HdrR.$tterm_cd2);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_rmrks2, SlsRet_Upd01_HdrR.$tterm_rmrks2);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_cd3, SlsRet_Upd01_HdrR.$tterm_cd3);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_rmrks3, SlsRet_Upd01_HdrR.$tterm_rmrks3);
				addColumnPathMap(SlsAct_Upd01_HdrR.$rcv_schd_dt, SlsRet_Upd01_HdrR.$rcv_schd_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$bill_basis_dt, SlsRet_Upd01_HdrR.$bill_basis_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$cred_cd, SlsRet_Upd01_HdrR.$cred_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$bcst_cd, SlsRet_Upd01_HdrR.$bcst_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$acst_cd, SlsRet_Upd01_HdrR.$acst_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ar_dpt_cd, SlsRet_Upd01_HdrR.$ar_dpt_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$cst_po_no, SlsRet_Upd01_HdrR.$cst_po_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_cur_cd, SlsRet_Upd01_HdrR.$trd_cur_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$base_cur_cd, SlsRet_Upd01_HdrR.$base_cur_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$xrate_cd, SlsRet_Upd01_HdrR.$xrate_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$xrate, SlsRet_Upd01_HdrR.$xrate);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ptax_cur_cd, SlsRet_Upd01_HdrR.$ptax_cur_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ptax_xrate, SlsRet_Upd01_HdrR.$ptax_xrate);
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_rmrks, SlsRet_Upd01_HdrR.$trd_rmrks);
				addColumnPathMap(SlsAct_Upd01_HdrR.$intr_rmrks, SlsRet_Upd01_HdrR.$intr_rmrks);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_ret_schd_no, SlsRet_Upd01_HdrR.$sls_ret_schd_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$dlv_slip_no, SlsRet_Upd01_HdrR.$dlv_slip_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sub_char1, SlsRet_Upd01_HdrR.$sub_char1);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sub_char2, SlsRet_Upd01_HdrR.$sub_char2);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sub_char3, SlsRet_Upd01_HdrR.$sub_char3);
				addColumnPathMap(SlsAct_Upd01_HdrR.$dlv_slip_prnt_flg, SlsRet_Upd01_HdrR.$dlv_slip_prnt_flg);
				addColumnPathMap(SlsAct_Upd01_HdrR.$amt_calc_flg, SlsRet_Upd01_HdrR.$amt_calc_flg);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.sls_dt(src.ret_dt());
				if (isNull(dest.sls_dt())) {
					dest.sls_dt(src.ac_dt());
				}
			}
		}
	}
	
	/** 部門マスタのキャッシュ */
	protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _dpt;
	protected static final Class<MSBBL_SlsRetService> CLAZZ = MSBBL_SlsRetService.class;
	
	/**
	 * 部門ＣＤと適用日に対応した部門マスタを取得する。<br>
	 * キャッシュに存在する場合、キャッシュから取得して返却する。
	 * 
	 * @param dptCd 部門ＣＤ
	 * @param stDt 適用開始日
	 * @return 部門マスタ情報
	 */
	public static MAM_DPT_R getDpt(String dptCd, MCDate stDt) {
		return object(CLAZZ)._getDptCache().get(stDt, dptCd);
	}
	
	protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _getDptCache() {
		MCList<MCRow> bindL = MCList.create(MCRow.class);
		if (_dpt == null){
			_dpt = new FXUCL_MCDbcCacheStEnd<MAM_DPT_R>(MCQueryApiBuilder.create(MAM_DPT_R.create("T")), bindL, MAM_DPT_R.$dpt_cd);
		}
		return _dpt;
	}
	/** 取引先マスタ取得 */
	protected FXUCL_MCDbcCache<MAM_BP_R> _bp;
	/**
	 * 取引先ＣＤから取引先マスタ情報を取得する。
	 * 
	 * @param bpCd
	 */
	public static MAM_BP_R getBp(String bpCd) {
		return object(CLAZZ)._getBp(bpCd);
	}
	
	protected MAM_BP_R _getBp(String bpCd) {
		if (_bp == null) {
			_bp = new FXUCL_MCDbcCache<MAM_BP_R>(MCQueryApiBuilder.create(MAM_BP_R.create("T")));
		}
		return _bp.get(bpCd);
	}
	

	/**
	 * SlsRet_Upd02オペレーション.<p>
	 *
	 * 売上返品を登録する（入荷実績サービスより呼び出す）<br>
	 */
	public class SlsRet_Upd02 extends MSBBL_SlsRetService_MC_A.SlsRet_Upd02 {
		
		MCList<SlsRet_Upd01_HdrR> _hdrL = MCList.create(SlsRet_Upd01_HdrR.class);
		MCList<SlsRet_Upd01_DtlR> _dtlL = MCList.create(SlsRet_Upd01_DtlR.class);
		MCList<SlsRet_Upd01_IoR> _ioL = MCList.create(SlsRet_Upd01_IoR.class);
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			// 売上返品SV（SlsRet_Upd01）呼出の電文作成処理
			MCList<SlsRet_Upd02_CndR> upTgtL = up0().groupBy(SlsRet_Upd02_CndR.$data_crud_typ);
			int hdrCnt = 0;
			for (SlsRet_Upd02_CndR upR : upTgtL) {
				makeSlsRetSvData(upR, hdrCnt++);
			}
			
			// 売上返品SV呼出
			callSlsRetSv();
		}
		
		/**
		 * 売上返品SV呼出
		 */
		protected void callSlsRetSv() {
			MSBBL_SlsRetService.SlsRet_Upd01 ope = MSBBL_SlsRetService.crtSlsRet_Upd01();
			ope.up0().addAll(_hdrL);
			ope.up0().setBoolean(SlsRet_Upd01_HdrR.$amt_calc_flg, true);
			ope.up1().addAll(_dtlL);
			ope.up2().addAll(_ioL);
			
			// 売上返品SV呼出
			ope.exec();
		}
		
		/**
		 * 売上返品SV呼出用電文作成処理
		 */
		protected void makeSlsRetSvData(SlsRet_Upd02_CndR upR, int hdrCnt) {
			// 新規の場合
			if (MAC_DATA_CRUD_TYP.isCRT(upR.data_crud_typ())) {
				MCList<SlsRet_Upd02_CndR> newCndL = MCList.create(SlsRet_Upd02_CndR.class);
				MCList<SlsRet_Upd02_CndR> upTgtL = up0().subList(SlsRet_Upd02_CndR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
				
				for (SlsRet_Upd02_CndR cndR : upTgtL) {
					// 上り電文より必要な情報を補完
					MCList<SlsRet_Upd02_CndR> tmpCndL = MCList.create(SlsRet_Upd02_CndR.class);
					executeQuery(tmpCndL, MSBBL6210_MST_ARR_ACT_S1(), cndR);
					for (SlsRet_Upd02_CndR tmpCndR : tmpCndL) {
						tmpCndR.data_crud_typ(cndR.data_crud_typ());
						tmpCndR.can_ac_dt(cndR.can_ac_dt());
					}
					newCndL.addAll(tmpCndL);
				}
				
				newCndL.sort(
						SlsRet_Upd02_CndR.$ac_dt,
						SlsRet_Upd02_CndR.$sls_ret_schd_no,
						SlsRet_Upd02_CndR.$sls_ret_schd_d_no
				);
				
				// 売上返品予定ＮＯ、入荷日時、計上日で集約
				MCList<SlsRet_Upd02_CndR> tgtHdrL = newCndL.groupBy(
						SlsRet_Upd02_CndR.$sls_ret_schd_no,
						SlsRet_Upd02_CndR.$arr_tm,
						SlsRet_Upd02_CndR.$ac_dt
				);
				tgtHdrL.sort(
						SlsRet_Upd02_CndR.$sls_ret_schd_no,
						SlsRet_Upd02_CndR.$arr_tm,
						SlsRet_Upd02_CndR.$ac_dt
				);
				
				// 売上返品SV用（SlsRet_Upd01）ヘッダ情報取得
				MCList<SlsRet_Upd01_HdrR> hdrL = MCList.create(SlsRet_Upd01_HdrR.class);
				hdrL.addNumberColumn(MAM_CUR_R.$amt_dec_place);
				
				int tmp_hdr_peg_no = hdrCnt;
				for (SlsRet_Upd02_CndR cndR : tgtHdrL) {
					SlsRet_Upd01_HdrR tmpHdrR = SlsRet_Upd01_HdrR.create();
					tmpHdrR.addNumberColumn(MAM_CUR_R.$amt_dec_place);
					executeQuery(tmpHdrR, MSBBL6210_MST_SLS_RET_SCHD_S1(), cndR);
					
					tmpHdrR.hdr_peg_no(++tmp_hdr_peg_no);					// ヘッダ紐付けＮＯ
					tmpHdrR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());	// データ更新区分（新規）
					tmpHdrR.base_cur_cd(getCo().base_cur_cd());				// 基準通貨ＣＤ
					tmpHdrR.xrate_cd(getCo().sls_xrate_cd());				// 為替レートＣＤ（売上為替レートＣＤ）
					tmpHdrR.ptax_cur_cd(getCo().ptax_cur_cd());				// 納税通貨ＣＤ
					tmpHdrR.ac_dt(cndR.ac_dt());							// 計上日
					tmpHdrR.ret_dt(cndR.arr_tm());							// 返品日（入荷実績.入荷日時）
					tmpHdrR.bill_basis_dt(cndR.ac_dt());					// 請求起算日（入荷実績.計上日）
					tmpHdrR.indiv_prnt_flg(cndR.indiv_prnt_flg());			// 個別発行フラグ
					// 組織変更対応
					// 売上部門
					MAUCL_DptUtil.setDpt(tmpHdrR, SlsRet_Upd01_HdrR.$sls_dpt_cd, SlsRet_Upd01_HdrR.$ac_dt);
					// 債権部門
					MAUCL_DptUtil.setDpt(tmpHdrR, SlsRet_Upd01_HdrR.$ar_dpt_cd, SlsRet_Upd01_HdrR.$ac_dt);
					// 債務部門
					MAUCL_DptUtil.setDpt(tmpHdrR, SlsRet_Upd01_HdrR.$ap_dpt_cd, SlsRet_Upd01_HdrR.$ac_dt);
					
					tmpHdrR.wg_cd(nvl(getDpt(tmpHdrR.sls_dpt_cd(), tmpHdrR.ac_dt()).wg_cd(), tmpHdrR.wg_cd()));	// ワーキンググループＣＤ
					
					hdrL.add(tmpHdrR);
				}
				
				// 売上返品予定ＮＯ、売上返品予定明細ＮＯ、入荷日、計上日で集約
				MCList<SlsRet_Upd02_CndR> tgtDtlL = newCndL.groupBy(
						SlsRet_Upd02_CndR.$sls_ret_schd_no,
						SlsRet_Upd02_CndR.$sls_ret_schd_d_no,
						SlsRet_Upd02_CndR.$arr_tm,
						SlsRet_Upd02_CndR.$ac_dt,
						SlsRet_Upd02_CndR.$arr_act_no
				);
				tgtDtlL.sort(
						SlsRet_Upd02_CndR.$sls_ret_schd_no,
						SlsRet_Upd02_CndR.$sls_ret_schd_d_no,
						SlsRet_Upd02_CndR.$arr_tm,
						SlsRet_Upd02_CndR.$ac_dt,
						SlsRet_Upd02_CndR.$arr_act_no
				);
				
				// 売上返品SV用（SlsRet_Upd01）明細情報取得
				MCList<SlsRet_Upd01_DtlR> dtlL = MCList.create(SlsRet_Upd01_DtlR.class);
				String[] hdrKeys = new String[] {
						SlsRet_Upd01_HdrR.$sls_ret_schd_no,
						SlsRet_Upd01_HdrR.$ret_dt,
						SlsRet_Upd01_HdrR.$ac_dt
				};
				int tmp_dtl_peg_no = 0;
				for (SlsRet_Upd02_CndR tgtDtlR : tgtDtlL) {
					MCList<SlsRet_Upd01_DtlR> tmpDtlL = MCList.create(SlsRet_Upd01_DtlR.class);
					tmpDtlL.addNumberColumn(MAVM_ITM_UNIT_R.$conv_base_qty);
					tmpDtlL.addNumberColumn(MAVM_ITM_UNIT_R.$conv_qty);
					tmpDtlL.addNumberColumn(MAM_ITM_R.$dec_place);
					tmpDtlL.addStringColumn(MAM_ITM_R.$rnd_typ);
					tmpDtlL.addStringColumn("new_tax_cd");
					tmpDtlL.addBooleanColumn("new_inc_tax_flg");
					tmpDtlL.addNumberColumn("new_tax_rate");
					tmpDtlL.addStringColumn("new_tax_typ");
					
					tgtDtlR.setDateNE("today", getToday());
					executeQuery(tmpDtlL, MSBBL6210_MST_SLS_RET_SCHD_D_S1(), tgtDtlR);
					
					// 売上返品予定ＮＯ、入荷日、計上日が同じヘッダリストのヘッダ紐付けＮＯを取得
					Comparable<?>[] dtlVals = new Comparable[] {
							tgtDtlR.sls_ret_schd_no(),
							tgtDtlR.arr_tm(),
							tgtDtlR.ac_dt()
					};
					MCList<SlsRet_Upd01_HdrR> tmpHdrL = hdrL.subList(hdrKeys, dtlVals);
					for (SlsRet_Upd01_DtlR tmpDtlR : tmpDtlL) {
						tmpDtlR.hdr_peg_no(tmpHdrL.get(0).hdr_peg_no());		// ヘッダ紐付けＮＯ
						tmpDtlR.dtl_peg_no(++tmp_dtl_peg_no);					// 明細紐付けＮＯ
						tmpDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());	// データ更新区分（新規）
						tmpDtlR.arr_act_no(tgtDtlR.arr_act_no());
						
						if (!tmpDtlR.inc_tax_flg() && !tmpDtlR.tax_fix_flg() && !isSame(tmpDtlR.tax_cd(), tmpDtlR.getStringNE("new_tax_cd"))) {
							// 最新の税情報設定
							tmpDtlR.tax_cd(tmpDtlR.getStringNE("new_tax_cd"));
							tmpDtlR.inc_tax_flg(tmpDtlR.getBooleanNE("new_inc_tax_flg"));
							tmpDtlR.tax_rate(tmpDtlR.getNumberNE("new_tax_rate"));
							tmpDtlR.tax_typ(tmpDtlR.getStringNE("new_tax_typ"));
						}
					}
					
					// 組織変更対応
					tmpDtlL.addDateColumn(SlsRet_Upd01_HdrR.$ac_dt);
					tmpDtlL.setDateNE(SlsRet_Upd01_HdrR.$ac_dt, tmpHdrL.get(0).ac_dt());
					// 負担部門
					MAUCL_DptUtil.setDpt(tmpDtlL, SlsRet_Upd01_DtlR.$bd_dpt_cd, SlsRet_Upd01_HdrR.$ac_dt);
					
					dtlL.addAll(tmpDtlL);
				}
				
				// 売上返品SV用（SlsRet_Upd01）詳細情報取得
				MCList<SlsRet_Upd01_IoR> ioL = MCList.create(SlsRet_Upd01_IoR.class);
				String[] dtlKeys = new String[] {
						SlsRet_Upd01_DtlR.$sls_ret_schd_d_no,
						SlsRet_Upd01_DtlR.$arr_act_no
				};
				
				int tmp_io_peg_no = hdrCnt;
				for (SlsRet_Upd02_CndR newCndR : newCndL) {
					
					MCList<SlsRet_Upd01_IoR> tmpIoL = MCList.create(SlsRet_Upd01_IoR.class);
					executeQuery(tmpIoL, MSBBL6210_MST_ARR_ACT_S2(), newCndR);
					
					// 売上返品予定明細ＮＯ、入荷実績ＮＯが同じ明細リストのヘッダ・明細紐付けＮＯを取得
					Comparable<?>[] ioVals = new Comparable[] {
							newCndR.sls_ret_schd_d_no(),
							newCndR.arr_act_no()
					};
					
					MCList<SlsRet_Upd01_DtlR> tmpDtlL = dtlL.subList(dtlKeys, ioVals);
					for (SlsRet_Upd01_IoR tmpIoR : tmpIoL) {
						tmpIoR.hdr_peg_no(tmpDtlL.get(0).hdr_peg_no());					// ヘッダ紐付けＮＯ
						tmpIoR.dtl_peg_no(tmpDtlL.get(0).dtl_peg_no());					// 明細紐付けＮＯ
						tmpIoR.io_peg_no(++tmp_io_peg_no);								// 受払紐付けＮＯ
						tmpIoR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());			// データ更新区分
						tmpIoR.sls_ret_schd_d_no(tmpDtlL.get(0).sls_ret_schd_d_no());	// 売上返品予定明細ＮＯ
						tmpIoR.sync_flg(true);											// 同時計上ＦＬＧ
					}
					ioL.addAll(tmpIoL);
				}
				
				MCIndexKey hdrIdxkey = hdrL.createIndex(SlsRet_Upd01_HdrR.$hdr_peg_no);
				// 明細情報を詳細情報等に応じて再編集
				for (SlsRet_Upd01_DtlR dtlR : dtlL) {
					setDtlInfo(dtlR, ioL, hdrL, false, hdrIdxkey);
				}
				
				// 電文用変数にセット
				_hdrL.addAll(hdrL);
				_dtlL.addAll(dtlL);
				_ioL.addAll(ioL);
				
			}
			// 更新の場合
			else if (MAC_DATA_CRUD_TYP.isUPD(upR.data_crud_typ())) {
				MCList<SlsRet_Upd02_CndR> newCndL = MCList.create(SlsRet_Upd02_CndR.class);
				MCList<SlsRet_Upd02_CndR> upTgtL = up0().subList(SlsRet_Upd02_CndR.$data_crud_typ, MAC_DATA_CRUD_TYP.UPD.value());
				for (SlsRet_Upd02_CndR cndR : upTgtL) {
					// 上り電文より必要な情報を補完
					MCList<SlsRet_Upd02_CndR> tmpCndL = MCList.create(SlsRet_Upd02_CndR.class);
					executeQuery(tmpCndL, MSBBL6210_MST_ARR_ACT_S3(), cndR);
					for (SlsRet_Upd02_CndR tmpCndR : tmpCndL) {
						tmpCndR.data_crud_typ(cndR.data_crud_typ());
						tmpCndR.can_ac_dt(cndR.can_ac_dt());
					}
					newCndL.addAll(tmpCndL);
				}
				
				newCndL.sort(
						SlsRet_Upd02_CndR.$sls_act_no,
						SlsRet_Upd02_CndR.$disp_seq,
						SlsRet_Upd02_CndR.$sls_act_io_no
				);
				
				// 上り電文で同一売上実績に対し、異なる入荷日、計上日を指定していないかチェック
				MCList<SlsRet_Upd02_CndR> cndGrpL = newCndL.groupBy(
						SlsRet_Upd02_CndR.$trd_ptn_typ,
						SlsRet_Upd02_CndR.$sls_act_no,
						SlsRet_Upd02_CndR.$arr_tm,
						SlsRet_Upd02_CndR.$ac_dt,
						SlsRet_Upd02_CndR.$can_ac_dt
						);
				for (SlsRet_Upd02_CndR cndR : cndGrpL) {
					// 売上返品の場合
					if (MAC_TRD_PTN_TYP.isSLS_RTN(cndR.trd_ptn_typ())) {
						if (cndGrpL.subList(SlsRet_Upd02_CndR.$sls_act_no, cndR.sls_act_no()).size() > 1) {
							throw new MCAppException(MSBBL0135, cndR.sls_act_no());
						}
					}
				}
				
				MCList<MST_SLS_ACT_R> slsActL = MCList.create(MST_SLS_ACT_R.class);
				MCList<MST_SLS_ACT_D_R> slsActDL = MCList.create(MST_SLS_ACT_D_R.class);
				MCList<MST_SLS_ACT_IO_R> slsActIoL = MCList.create(MST_SLS_ACT_IO_R.class);
				
				MCList<SlsRet_Upd02_CndR> slsActNoGrpL = newCndL.groupBy(SlsRet_Upd02_CndR.$sls_act_no,SlsRet_Upd02_CndR.$sls_act_seq,SlsRet_Upd02_CndR.$trd_ptn_typ);
				for (SlsRet_Upd02_CndR slsActNoGrpR : slsActNoGrpL) {
					// 売上返品の場合、対象となる売上実績情報すべてを取得
					if (MAC_TRD_PTN_TYP.isSLS_RTN(slsActNoGrpR.trd_ptn_typ())) {
						// 売上実績ヘッダ
						MST_SLS_ACT_R tmpSlsActR = MST_SLS_ACT_R.create();
						MST_SLS_ACT_R tmpSlsActR_t = MST_SLS_ACT_R.create("T");
						MCQueryApiBuilder tmpSlsActR_bldr = MCQueryApiBuilder.create(tmpSlsActR_t);
						MAM_CUR_R cur = MAM_CUR_R.create("CUR");
						tmpSlsActR.addNumberColumn(MAM_CUR_R.$amt_dec_place);
						tmpSlsActR_bldr.addSelect(cur.amt_dec_place);
						tmpSlsActR_bldr.addLeftOuterJoin(cur, bracket(tmpSlsActR_t.trd_cur_cd.eq(cur.cur_cd)));
						dbSelectKey("MSBBL6210_MST_SLS_ACT_S01", tmpSlsActR, tmpSlsActR_bldr, slsActNoGrpR);
						slsActL.add(tmpSlsActR);
						
						// 売上実績明細
						MCList<MST_SLS_ACT_D_R> tmpSlsActDL = MCList.create(MST_SLS_ACT_D_R.class);
						tmpSlsActDL.addStringColumn(MAM_ITM_R.$itm_jnl_cd);
						tmpSlsActDL.addBooleanColumn(MAM_TAX_R.$inc_tax_flg);
						tmpSlsActDL.addNumberColumn(MST_ARR_PR_R.$arr_schd_abort_qty);
						tmpSlsActDL.addNumberColumn(MAM_TAX_R.$tax_rate);
						tmpSlsActDL.addStringColumn(MAM_TAX_R.$tax_typ);
						tmpSlsActDL.addNumberColumn(MAVM_ITM_UNIT_R.$conv_base_qty);
						tmpSlsActDL.addNumberColumn(MAVM_ITM_UNIT_R.$conv_qty);
						tmpSlsActDL.addNumberColumn(MAM_ITM_R.$dec_place);
						tmpSlsActDL.addStringColumn(MAM_ITM_R.$rnd_typ);
						
						executeQuery(tmpSlsActDL, MSBBL6210_MST_SLS_ACT_D_S2(), slsActNoGrpR);
						slsActDL.addAll(tmpSlsActDL);
						
						// 売上実績明細に紐づく売上実績受払
						for (MST_SLS_ACT_D_R tmpSlsActDR : tmpSlsActDL) {
							MCList<MST_SLS_ACT_IO_R> tmpSlsActIoL = MCList.create(MST_SLS_ACT_IO_R.class);
							MST_SLS_ACT_IO_R tmpSlsActIoL_t = MST_SLS_ACT_IO_R.create("T");
							MCQueryApiBuilder tmpSlsActIoL_bldr = MCQueryApiBuilder.create(tmpSlsActIoL_t);
							MST_ARR_ACT_R t2 = MST_ARR_ACT_R.create("T2");
							MST_ARR_SCHD_R t3 = MST_ARR_SCHD_R.create("T3");
							tmpSlsActIoL.addBooleanColumn("sls_ret_schd_abort_flg");
							tmpSlsActIoL_bldr.setWhere(
									tmpSlsActIoL_t.sls_act_d_no.eq(bind("1")),
									tmpSlsActDR.sls_act_d_no());
							tmpSlsActIoL_bldr.addWhereWithAnd(
									tmpSlsActIoL_t.sls_act_d_seq.eq(bind("1")),
									tmpSlsActDR.sls_act_d_seq());
							tmpSlsActIoL_bldr.addInnerJoin(t2,
									bracket(tmpSlsActIoL_t.arr_act_no.eq(t2.arr_act_no)));
							tmpSlsActIoL_bldr.addLeftOuterJoin(t3,
									bracket(t2.arr_schd_no.eq(t3.arr_schd_no)));
							tmpSlsActIoL_bldr.addSelect(t2.arr_schd_no);
							tmpSlsActIoL_bldr.addSelect(t3.sls_ret_schd_abort_flg);
							dbSelect("MSBBL6210_MST_SLS_ACT_IO_S01", tmpSlsActIoL, tmpSlsActIoL_bldr);
							slsActIoL.addAll(tmpSlsActIoL);
						}
					}
				}
				
				// 取引パタン区分、売上実績ＮＯ、売上実績明細ＮＯ、入荷日、計上日で集約
				MCList<SlsRet_Upd02_CndR> tmpGrpL = newCndL.groupBy(
						SlsRet_Upd02_CndR.$trd_ptn_typ,
						SlsRet_Upd02_CndR.$sls_act_no,
						SlsRet_Upd02_CndR.$sls_act_d_no,
						SlsRet_Upd02_CndR.$arr_tm,
						SlsRet_Upd02_CndR.$ac_dt
						);
				
				for (SlsRet_Upd02_CndR tmpGrpR : tmpGrpL) {
					// 上り電文に含まれる同一明細の受払と売上実績受払から取得した行数を比較
					MCList<SlsRet_Upd02_CndR> upIoL = newCndL.subList(SlsRet_Upd02_CndR.$sls_act_d_no, tmpGrpR.sls_act_d_no());
					MCList<MST_SLS_ACT_IO_R> actIoL = slsActIoL.subList(MST_SLS_ACT_IO_R.$sls_act_d_no, tmpGrpR.sls_act_d_no());
					
					// 行数が異なる場合、日付の比較を行い、異なっている場合はエラー
					if (!actIoL.isEmpty() && upIoL.size() != actIoL.size()) {
						MCList<MST_SLS_ACT_R> actHdrL = slsActL.subList(MST_SLS_ACT_R.$sls_act_no, tmpGrpR.sls_act_no());
						if (!isSame(upIoL.get(0).arr_tm(), actHdrL.get(0).sls_dt()) || !isSame(upIoL.get(0).ac_dt(), actHdrL.get(0).ac_dt())) {
							throw new MCAppException(MSBBL0135, tmpGrpR.sls_act_no());
						}
					}
				}
				
				// 売上返品SV（SlsRet_Upd01）への電文作成
				MCList<SlsRet_Upd01_HdrR> hdrL = MCList.create(SlsRet_Upd01_HdrR.class);
				
				// 上り電文で訂正となる入荷実績は新しい情報で書き換える。上り電文にないレコードは訂正にするが内容はそのまま。
				// ヘッダ情報の作成（売上返品）
				int tmp_hdr_peg_no = hdrCnt;
				for (MST_SLS_ACT_R slsActR : slsActL) {
					SlsRet_Upd01_HdrR tmpHdrR = SlsRet_Upd01_HdrR.create();
					tmpHdrR.addNumberColumn(MAM_CUR_R.$amt_dec_place);
					SlsRet_Upd02_CndR upHdrR = newCndL.subList(SlsRet_Upd02_CndR.$sls_act_no, slsActR.sls_act_no()).get(0);
					
					tmpHdrR.hdr_peg_no(++tmp_hdr_peg_no);					// ヘッダ紐付けＮＯ
					
					copy(tmpHdrR, upHdrR, createMap_SlsRet_Upd01_HdrR_SlsRet_Upd02_CndR());
					copy(tmpHdrR, slsActR, createMap_SlsRet_Upd01_HdrR_MST_SLS_ACT_R());
					
					hdrL.add(tmpHdrR);
				}
				MCList<SlsRet_Upd01_DtlR> dtlL = MCList.create(SlsRet_Upd01_DtlR.class);
				MCList<SlsRet_Upd01_IoR> ioL = MCList.create(SlsRet_Upd01_IoR.class);
				for (SlsRet_Upd01_HdrR hdrR : hdrL) {
					MCList<MST_SLS_ACT_D_R> tmpSlsActDL = slsActDL.subList(MST_SLS_ACT_D_R.$sls_act_no, hdrR.sls_act_no());
					tmpSlsActDL.sort(MST_SLS_ACT_D_R.$disp_seq);
					
					int tmp_dtl_peg_no = 0;
					int tmp_io_peg_no = 0;
					// 取得した売上実績明細の内容をそのままセットし、詳細をセットした後に再取得する
					for (MST_SLS_ACT_D_R tmpSlsActDR : tmpSlsActDL) {
						SlsRet_Upd01_DtlR dtlR = SlsRet_Upd01_DtlR.create();
						dtlR.hdr_peg_no(hdrR.hdr_peg_no());
						dtlR.dtl_peg_no(++tmp_dtl_peg_no);
						dtlR.addNumberColumn(MAVM_ITM_UNIT_R.$conv_base_qty);
						dtlR.addNumberColumn(MAVM_ITM_UNIT_R.$conv_qty);
						dtlR.addNumberColumn(MAM_ITM_R.$dec_place);
						dtlR.addStringColumn(MAM_ITM_R.$rnd_typ);
						
						copy(dtlR, tmpSlsActDR, createMap_SlsRet_Upd01_DtlR_MST_SLS_ACT_D_R());
						
						dtlL.add(dtlR);
						
						MCList<MST_SLS_ACT_IO_R> tmpSlsActIoL = slsActIoL.subList(MST_SLS_ACT_IO_R.$sls_act_d_no, tmpSlsActDR.sls_act_d_no());
						tmpSlsActIoL.sort(MST_SLS_ACT_IO_R.$sls_act_io_no);
						
						// 詳細情報のセット
						for (MST_SLS_ACT_IO_R tmpSlsIoR : tmpSlsActIoL) {
							SlsRet_Upd01_IoR tmpIoR = SlsRet_Upd01_IoR.create();
							MCList<SlsRet_Upd02_CndR> tmpCndL = newCndL.subList(SlsRet_Upd02_CndR.$arr_act_no, tmpSlsIoR.arr_act_no());
							
							tmpIoR.hdr_peg_no(dtlR.hdr_peg_no());
							tmpIoR.dtl_peg_no(dtlR.dtl_peg_no());
							tmpIoR.io_peg_no(++tmp_io_peg_no);
							tmpIoR.sls_ret_schd_d_no(dtlR.sls_ret_schd_d_no());
							
							copy(tmpIoR, tmpSlsIoR, createMap_SlsRet_Upd01_IoR_MST_SLS_ACT_IO_R());
							
							// 上り電文の内容で更新
							if (!isNull(tmpCndL)) {
								copy(tmpIoR, tmpCndL.get(0), createMap_SlsRet_Upd01_IoR_SlsRet_Upd02_CndR());
								if (tmpCndL.get(0).abort_qty().isPositive()) {
									tmpIoR.sls_ret_schd_abort_flg(true);
								}
							}
							else {
								SlsRet_Upd02_CndR tmpCndR = newCndL.getFirst(SlsRet_Upd02_CndR.$arr_schd_no, tmpSlsIoR.getString(MST_ARR_ACT_R.$arr_schd_no));
								if (isNull(tmpCndR)) {
									tmpIoR.sls_ret_schd_abort_flg(tmpSlsIoR.getBooleanNE("sls_ret_schd_abort_flg"));
								}
								else if (tmpCndR.abort_qty().isPositive()) {
									tmpIoR.sls_ret_schd_abort_flg(true);
								}
							}
									
							ioL.add(tmpIoR);
						}
					}
					
				}
				MCIndexKey hdrIdxkey = hdrL.createIndex(SlsRet_Upd01_HdrR.$hdr_peg_no);
				// 明細情報を詳細情報等に応じて再編集
				for (SlsRet_Upd01_DtlR dtlR : dtlL) {
					setDtlInfo(dtlR, ioL, hdrL, false, hdrIdxkey);
				}
				
				if (!isNull(hdrL)) {
					_hdrL.addAll(hdrL);
					_dtlL.addAll(dtlL);
					_ioL.addAll(ioL);
				}
				
				// 出荷返品の情報
				MCList<SlsRet_Upd02_CndR> shipRtnGrpL = newCndL.groupBy(
						SlsRet_Upd02_CndR.$data_crud_typ,
						SlsRet_Upd02_CndR.$trd_cd,
						SlsRet_Upd02_CndR.$trd_ptn_typ,
						SlsRet_Upd02_CndR.$sls_ret_schd_no
						);
				for (SlsRet_Upd02_CndR shipRtnGrpR : shipRtnGrpL) {
					// 出荷返品の場合
					if (MAC_TRD_PTN_TYP.isSHIP_RTN(shipRtnGrpR.trd_ptn_typ())) {
						SlsRet_Upd01_HdrR tmpHdrR = SlsRet_Upd01_HdrR.create();
						tmpHdrR.hdr_peg_no(++tmp_hdr_peg_no);
						copy(tmpHdrR, shipRtnGrpR, createMap_SlsRet_Upd01_HdrR_SlsRet_Upd02_CndR_SHIP_RET());
						
						_hdrL.add(tmpHdrR);
						
						MCList<SlsRet_Upd02_CndR> tmpCndL = newCndL.subList(SlsRet_Upd02_CndR.$sls_ret_schd_no, shipRtnGrpR.sls_ret_schd_no());
						tmpCndL.sort(SlsRet_Upd02_CndR.$disp_seq);
						
						int tmp_dtl_peg_no = 0;
						for (SlsRet_Upd02_CndR tmpCndR : tmpCndL) {
							SlsRet_Upd01_DtlR tmpDtlR = SlsRet_Upd01_DtlR.create();
							tmpDtlR.hdr_peg_no(tmpHdrR.hdr_peg_no());
							tmpDtlR.dtl_peg_no(++tmp_dtl_peg_no);
							copy(tmpDtlR, tmpCndR, createMap_SlsRet_Upd01_DtlR_SlsRet_Upd02_CndR());
							
							_dtlL.add(tmpDtlR);
						}
					}
				}
			}
			// 取消の場合
			else {
				MCList<SlsRet_Upd02_CndR> newCndL = MCList.create(SlsRet_Upd02_CndR.class);
				for (SlsRet_Upd02_CndR cndR : up0()) {
					// 上り電文より必要な情報を補完
					MCList<SlsRet_Upd02_CndR> tmpCndL = MCList.create(SlsRet_Upd02_CndR.class);
					executeQuery(tmpCndL, MSBBL6210_MST_ARR_ACT_S3(), cndR);
					for (SlsRet_Upd02_CndR tmpCndR : tmpCndL) {
						tmpCndR.data_crud_typ(cndR.data_crud_typ());
						tmpCndR.can_ac_dt(cndR.can_ac_dt());
					}
					newCndL.addAll(tmpCndL);
				}
				
				newCndL.sort(
						SlsRet_Upd02_CndR.$sls_act_no,
						SlsRet_Upd02_CndR.$disp_seq,
						SlsRet_Upd02_CndR.$sls_act_io_no
				);
				
				// 上り電文で同一売上実績に対し、異なる取消計上日を指定していないかチェック
				MCList<SlsRet_Upd02_CndR> cndGrpL = newCndL.groupBy(
						SlsRet_Upd02_CndR.$trd_ptn_typ,
						SlsRet_Upd02_CndR.$sls_act_no,
						SlsRet_Upd02_CndR.$can_ac_dt
						);
				for (SlsRet_Upd02_CndR cndR : cndGrpL) {
					// 売上返品の場合
					if (MAC_TRD_PTN_TYP.isSLS_RTN(cndR.trd_ptn_typ())) {
						if (cndGrpL.subList(SlsRet_Upd02_CndR.$sls_act_no, cndR.sls_act_no()).size() > 1) {
							throw new MCAppException(MSBBL0136, cndR.sls_act_no());
						}
					}
				}
				
				// 売上実績情報を取得
				MCList<MST_SLS_ACT_R> slsActL = MCList.create(MST_SLS_ACT_R.class);
				MCList<MST_SLS_ACT_D_R> slsActDL = MCList.create(MST_SLS_ACT_D_R.class);
				MCList<MST_SLS_ACT_IO_R> slsActIoL = MCList.create(MST_SLS_ACT_IO_R.class);
				
				MCList<SlsRet_Upd02_CndR> slsActNoGrpL = newCndL.groupBy(SlsRet_Upd02_CndR.$sls_act_no,SlsRet_Upd02_CndR.$sls_act_seq,SlsRet_Upd02_CndR.$trd_ptn_typ);
				for (SlsRet_Upd02_CndR slsActNoGrpR : slsActNoGrpL) {
					// 売上返品の場合、対象となる売上実績情報すべてを取得
					if (MAC_TRD_PTN_TYP.isSLS_RTN(slsActNoGrpR.trd_ptn_typ())) {
						// 売上実績ヘッダ
						MST_SLS_ACT_R tmpSlsActR = srchSlsActByKey(slsActNoGrpR);
						slsActL.add(tmpSlsActR);
						
						// 売上実績明細
						MCList<MST_SLS_ACT_D_R> tmpSlsActDL = MCList.create(MST_SLS_ACT_D_R.class);
						tmpSlsActDL.addStringColumn(MAM_ITM_R.$itm_jnl_cd);
						tmpSlsActDL.addBooleanColumn(MAM_TAX_R.$inc_tax_flg);
						tmpSlsActDL.addNumberColumn(MST_ARR_PR_R.$arr_schd_abort_qty);
						tmpSlsActDL.addNumberColumn(MAM_TAX_R.$tax_rate);
						tmpSlsActDL.addStringColumn(MAM_TAX_R.$tax_typ);
						
						executeQuery(tmpSlsActDL, MSBBL6210_MST_SLS_ACT_D_S2(), slsActNoGrpR);
						slsActDL.addAll(tmpSlsActDL);
						
						// 売上実績明細に紐づく売上実績受払
						for (MST_SLS_ACT_D_R tmpSlsActDR : tmpSlsActDL) {
							MCList<MST_SLS_ACT_IO_R> tmpSlsActIoL = MCList.create(MST_SLS_ACT_IO_R.class);
							MST_SLS_ACT_IO_R tmpSlsActIoL_t = MST_SLS_ACT_IO_R.create("T");
							MCQueryApiBuilder tmpSlsActIoL_bldr = MCQueryApiBuilder.create(tmpSlsActIoL_t);
							tmpSlsActIoL_bldr.setWhere(
									tmpSlsActIoL_t.sls_act_d_no.eq(bind("1")),
									tmpSlsActDR.sls_act_d_no());
							tmpSlsActIoL_bldr.addWhereWithAnd(
									tmpSlsActIoL_t.sls_act_d_seq.eq(bind("1")),
									tmpSlsActDR.sls_act_d_seq());
							dbSelect("MSBBL6210_MST_SLS_ACT_IO_S02", tmpSlsActIoL, tmpSlsActIoL_bldr);
							slsActIoL.addAll(tmpSlsActIoL);
						}
					}
				}
				
				// 売上返品SV（SlsRet_Upd01）への電文設定
				// 全ての売上実績を訂正として電文を作成する
				
				MCList<SlsRet_Upd01_HdrR> hdrL = MCList.create(SlsRet_Upd01_HdrR.class);
				
				// 上り電文で訂正となる入荷実績は新しい情報で書き換える。上り電文にないレコードは訂正にするが内容はそのまま。
				// ヘッダ情報の作成（売上返品）
				int tmp_hdr_peg_no = 0;
				for (MST_SLS_ACT_R slsActR : slsActL) {
					SlsRet_Upd01_HdrR tmpHdrR = SlsRet_Upd01_HdrR.create();
					SlsRet_Upd02_CndR upHdrR = newCndL.subList(SlsRet_Upd02_CndR.$sls_act_no, slsActR.sls_act_no()).get(0);
					tmpHdrR.addNumberColumn(MAM_CUR_R.$amt_dec_place);
					
					tmpHdrR.hdr_peg_no(++tmp_hdr_peg_no);					// ヘッダ紐付けＮＯ
					copy(tmpHdrR, slsActR, createMap_SlsRet_Upd01_HdrR_MST_SLS_ACT_R_DEL());
					tmpHdrR.can_ac_dt(upHdrR.can_ac_dt());
					hdrL.add(tmpHdrR);
				}
				
				// 明細・詳細
				MCList<SlsRet_Upd01_DtlR> dtlL = MCList.create(SlsRet_Upd01_DtlR.class);
				MCList<SlsRet_Upd01_IoR> ioL = MCList.create(SlsRet_Upd01_IoR.class);
				for (SlsRet_Upd01_HdrR hdrR : hdrL) {
					MCList<MST_SLS_ACT_D_R> tmpSlsActDL = slsActDL.subList(MST_SLS_ACT_D_R.$sls_act_no, hdrR.sls_act_no());
					tmpSlsActDL.sort(MST_SLS_ACT_D_R.$disp_seq);
					
					int tmp_dtl_peg_no = 0;
					int tmp_io_peg_no = 0;
					// 取得した売上実績明細の内容をそのままセットし、詳細をセットした後に再取得する
					for (MST_SLS_ACT_D_R tmpSlsActDR : tmpSlsActDL) {
						SlsRet_Upd01_DtlR dtlR = SlsRet_Upd01_DtlR.create();
						dtlR.hdr_peg_no(hdrR.hdr_peg_no());
						dtlR.dtl_peg_no(++tmp_dtl_peg_no);
						copy(dtlR, tmpSlsActDR, createMap_SlsRet_Upd01_DtlR_MST_SLS_ACT_D_R());
						
						dtlL.add(dtlR);
						
						MCList<MST_SLS_ACT_IO_R> tmpSlsActIoL = slsActIoL.subList(MST_SLS_ACT_IO_R.$sls_act_d_no, tmpSlsActDR.sls_act_d_no());
						tmpSlsActIoL.sort(MST_SLS_ACT_IO_R.$sls_act_io_no);
						
						// 詳細情報のセット
						for (MST_SLS_ACT_IO_R tmpSlsIoR : tmpSlsActIoL) {
							SlsRet_Upd01_IoR tmpIoR = SlsRet_Upd01_IoR.create();
							
							tmpIoR.hdr_peg_no(dtlR.hdr_peg_no());
							tmpIoR.dtl_peg_no(dtlR.dtl_peg_no());
							tmpIoR.io_peg_no(++tmp_io_peg_no);
							tmpIoR.sls_ret_schd_d_no(dtlR.sls_ret_schd_d_no());
							
							copy(tmpIoR, tmpSlsIoR, createMap_SlsRet_Upd01_IoR_MST_SLS_ACT_IO_R());
							
							// 上り電文で削除対象となった詳細の場合、データ更新区分は削除
							for (SlsRet_Upd02_CndR newCndR : newCndL) {
								if (isSame(newCndR.sls_act_io_no(), tmpIoR.sls_act_io_no())) {
									tmpIoR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
									tmpIoR.setStatus(MCRow.DELETE);
									break;
								}
							}
							
							ioL.add(tmpIoR);
						}
					}
				}
				
				// 明細情報のデータ更新区分再設定
				// 明細に紐づく全詳細が削除になっている場合、明細のデータ更新区分も削除
				MCIndexKey idxDtl = ioL.createIndex(
						SlsRet_Upd01_IoR.$dtl_peg_no,
						SlsRet_Upd01_IoR.$data_crud_typ
						);
				for (SlsRet_Upd01_DtlR dtlR : dtlL) {
					Comparable<?>[] vals = { 
							dtlR.dtl_peg_no(),
							MAC_DATA_CRUD_TYP.UPD.value()
					};
					// 削除ではない詳細が存在しない場合は明細のデータ更新区分も削除
					MCList<SlsRet_Upd01_IoR> tmpIoL = ioL.subList(idxDtl, vals);
					if (isNull(tmpIoL)) {
						dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
						dtlR.setStatus(MCRow.DELETE);
					}
				}
				
				// ヘッダ情報のデータ更新区分再設定
				// 全明細が削除になっている場合、ヘッダのデータ更新区分も削除
				MCIndexKey idxHdr = dtlL.createIndex(
						SlsRet_Upd01_DtlR.$hdr_peg_no,
						SlsRet_Upd01_DtlR.$data_crud_typ
						);
				for (SlsRet_Upd01_HdrR hdrR : hdrL) {
					Comparable<?>[] vals = { 
							hdrR.hdr_peg_no(),
							MAC_DATA_CRUD_TYP.UPD.value()
					};
					// 削除ではない明細が存在しない場合はヘッダのデータ更新区分も削除
					MCList<SlsRet_Upd01_DtlR> tmpDtlL = dtlL.subList(idxHdr, vals);
					if (isNull(tmpDtlL)) {
						hdrR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					}
					else {
						hdrR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					}
				}
				
				MCIndexKey hdrIdxkey = hdrL.createIndex(SlsRet_Upd01_HdrR.$hdr_peg_no);
				// 明細情報を詳細情報等に応じて再編集
				boolean canFlg = false;
				for (SlsRet_Upd01_DtlR dtlR : dtlL) {
					if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
						canFlg = true;
					}
					setDtlInfo(dtlR, ioL, hdrL, canFlg, hdrIdxkey);
				}
				
				if (!isNull(hdrL)) {
					_hdrL.addAll(hdrL);
					_dtlL.addAll(dtlL);
					_ioL.addAll(ioL);
				}
				
				// 出荷返品の情報
				MCList<SlsRet_Upd02_CndR> shipRtnGrpL = newCndL.groupBy(
						SlsRet_Upd02_CndR.$data_crud_typ,
						SlsRet_Upd02_CndR.$trd_cd,
						SlsRet_Upd02_CndR.$trd_ptn_typ,
						SlsRet_Upd02_CndR.$sls_ret_schd_no
						);
				for (SlsRet_Upd02_CndR shipRtnGrpR : shipRtnGrpL) {
					// 出荷返品の場合
					if (MAC_TRD_PTN_TYP.isSHIP_RTN(shipRtnGrpR.trd_ptn_typ())) {
						SlsRet_Upd01_HdrR tmpHdrR = SlsRet_Upd01_HdrR.create();
						tmpHdrR.hdr_peg_no(++tmp_hdr_peg_no);
						copy(tmpHdrR, shipRtnGrpR, createMap_SlsRet_Upd01_HdrR_SlsRet_Upd02_CndR_SHIP_RET());
						_hdrL.add(tmpHdrR);
						
						MCList<SlsRet_Upd02_CndR> tmpCndL = newCndL.subList(SlsRet_Upd02_CndR.$sls_ret_schd_no, shipRtnGrpR.sls_ret_schd_no());
						tmpCndL.sort(SlsRet_Upd02_CndR.$disp_seq);
						
						int tmp_dtl_peg_no = 0;
						for (SlsRet_Upd02_CndR tmpCndR : tmpCndL) {
							SlsRet_Upd01_DtlR tmpDtlR = SlsRet_Upd01_DtlR.create();
							tmpDtlR.hdr_peg_no(tmpHdrR.hdr_peg_no());
							tmpDtlR.dtl_peg_no(++tmp_dtl_peg_no);
							copy(tmpDtlR, tmpCndR, createMap_SlsRet_Upd01_DtlR_SlsRet_Upd02_CndR());
							
							_dtlL.add(tmpDtlR);
						}
					}
				}
			}
		}
		
		protected MST_SLS_ACT_R srchSlsActByKey(SlsRet_Upd02_CndR bindR) {
			MST_SLS_ACT_R retSlsActR = MST_SLS_ACT_R.create();
			retSlsActR.addNumberColumn(MAM_CUR_R.$amt_dec_place);		
			
			MST_SLS_ACT_R slsAct = MST_SLS_ACT_R.create("SLSACT");																										
			MCQueryApiBuilder slsActBldr = MCQueryApiBuilder.create(slsAct);																										
			MAM_CUR_R cur = MAM_CUR_R.create("CUR");																																
			slsActBldr.addSelect(cur.amt_dec_place);																										
			slsActBldr.addLeftOuterJoin(cur, bracket(slsAct.trd_cur_cd.eq(cur.cur_cd)));																										
			dbSelectKey("MSBBL6210_MST_SLS_ACT_S02", retSlsActR, slsActBldr, bindR);
			
			return retSlsActR;
		}
		
		/**
		 * 明細情報を詳細情報に応じて再編集
		 * 
		 * @param dtlR
		 * @param ioL
		 * @param hdrL
		 */
		protected void setDtlInfo(SlsRet_Upd01_DtlR dtlR, MCList<SlsRet_Upd01_IoR> ioL, MCList<SlsRet_Upd01_HdrR> hdrL, boolean canFlg, MCIndexKey hdrIdxKey) {
			// 明細に紐づく詳細情報を取得
			String[] idxkeys = new String[] {
					SlsRet_Upd01_IoR.$hdr_peg_no,
					SlsRet_Upd01_IoR.$dtl_peg_no
			};
			Comparable<?>[] vals = new Comparable[] {
					dtlR.hdr_peg_no(),
					dtlR.dtl_peg_no()
			};
			String[] delIdxkeys = new String[] {
					SlsRet_Upd01_IoR.$hdr_peg_no,
					SlsRet_Upd01_IoR.$dtl_peg_no,
					SlsRet_Upd01_IoR.$data_crud_typ
			};
			Comparable<?>[] delVals = new Comparable[] {
					dtlR.hdr_peg_no(),
					dtlR.dtl_peg_no(),
					MAC_DATA_CRUD_TYP.DEL.value()
			};
			MCList<SlsRet_Upd01_IoR> tgtIoL = MCList.create(SlsRet_Upd01_IoR.class);
			if (!canFlg) {
				tgtIoL = ioL.subList(idxkeys, vals);
			}
			else {
				tgtIoL = ioL.subList(delIdxkeys, delVals);
				return;
			}
			
			//　変更前の基準単位数量を取得
			MCNumber bef_base_unit_qty = dtlR.base_unit_qty();
			
			// 表示順
			dtlR.disp_seq(dtlR.dtl_peg_no());
			
			MCNumber baseUnitQtySum = tgtIoL.subList(r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())).sum(SlsRet_Upd01_IoR.$base_unit_qty);
			
			calcTrdCurUpri(dtlR, baseUnitQtySum);
			
			// 基準単位数量
			dtlR.base_unit_qty(baseUnitQtySum);
			
			// 格付
			if (tgtIoL.groupBy(SlsRet_Upd01_IoR.$gd_cd).size() > 1) {
				dtlR.gd_cd(null);
			}
			else {
				dtlR.gd_cd(tgtIoL.get(0).gd_cd());
			}
			
			// 手配ＮＯ１
			if (tgtIoL.groupBy(SlsRet_Upd01_IoR.$sno1).size() > 1) {
				dtlR.sno1(null);
			}
			else {
				dtlR.sno1(tgtIoL.get(0).sno1());
				// 手配ＮＯ１がNULL文字ではない場合、手配ＮＯ１に紐付く案件ＮＯを取得
				if (!MAC_STR.isNULL_VAL(dtlR.sno1())) {
					MST_WRK_SNO_R wrkSnoR = MST_WRK_SNO_R.create();
					MST_WRK_SNO_R t = MST_WRK_SNO_R.create("T");
					MCQueryApiBuilder wrkSnoR_bldr = MCQueryApiBuilder.create(t);
					wrkSnoR_bldr.setSelect(t.wrk_no);
					dbSelectKey("MSBBL6210_MST_WRK_SNO_S01", wrkSnoR, wrkSnoR_bldr, dtlR);
					dtlR.wrk_no(wrkSnoR.wrk_no());
				}
			}
			
			// 手配ＮＯ２
			if (tgtIoL.groupBy(SlsRet_Upd01_IoR.$sno2).size() > 1) {
				dtlR.sno2(null);
			}
			else {
				dtlR.sno2(tgtIoL.get(0).sno2());
			}
			
			// 手配ＮＯ３
			if (tgtIoL.groupBy(SlsRet_Upd01_IoR.$sno3).size() > 1) {
				dtlR.sno3(null);
			}
			else {
				dtlR.sno3(tgtIoL.get(0).sno3());
			}
			
			// 手配ＮＯ４
			if (tgtIoL.groupBy(SlsRet_Upd01_IoR.$sno4).size() > 1) {
				dtlR.sno4(null);
			}
			else {
				dtlR.sno4(tgtIoL.get(0).sno4());
			}
			
			// 場所
			if (tgtIoL.groupBy(SlsRet_Upd01_IoR.$loc_cd).size() > 1) {
				dtlR.loc_cd(null);
			}
			else {
				dtlR.loc_cd(tgtIoL.get(0).loc_cd());
			}
			
			// 棚・ライン、ロットＮＯ、サブロットＮＯ
			if (isNull(dtlR.loc_cd())) {
				dtlR.str_ln_cd(null);
				dtlR.lot_no(null);
				dtlR.sublot_no(null);
			}
			else {
				// 棚・ライン
				if (tgtIoL.groupBy(SlsRet_Upd01_IoR.$str_ln_cd).size() > 1) {
					dtlR.str_ln_cd(null);
				}
				else {
					dtlR.str_ln_cd(tgtIoL.get(0).str_ln_cd());
				}
				
				// ロットＮＯ
				if (tgtIoL.groupBy(SlsRet_Upd01_IoR.$lot_no).size() > 1) {
					dtlR.lot_no(null);
				}
				else {
					dtlR.lot_no(tgtIoL.get(0).lot_no());
				}
				
				// サブロットＮＯ
				if (tgtIoL.groupBy(SlsRet_Upd01_IoR.$sublot_no).size() > 1) {
					dtlR.sublot_no(null);
				}
				else {
					dtlR.sublot_no(tgtIoL.get(0).sublot_no());
				}
			}
			
			// 値引額
			if (!isNull(dtlR.trd_cur_dscnt_amt())) {
				SlsRet_Upd01_HdrR tgtHdrR = hdrL.getFirst(hdrIdxKey, dtlR.hdr_peg_no());
				MCNumber trdCurDscntAmt = dtlR.trd_cur_dscnt_amt()
						.multiply(dtlR.base_unit_qty()).divide(bef_base_unit_qty,
								tgtHdrR.getNumberNE(MAM_CUR_R.$amt_dec_place).intValue(), MAC_RND_TYP.toMC(dtlR.getStringNE(MAM_ITM_R.$rnd_typ)));
				dtlR.trd_cur_dscnt_amt(trdCurDscntAmt);
			}
			if (!isSame(dtlR.base_unit_qty(), bef_base_unit_qty)) {
				// 異なる場合は後続の売上実績サービスで計算する
				dtlR.scrn_trd_cur_amt(null);
				dtlR.scrn_trd_cur_tax_amt(null);
			}
		}
		
		/**
		 * 取引通貨単価を算出する。
		 * @param dtlR 売上返品明細
		 * @param baseUnitQtySum 基準単位数量合計
		 */
		protected void calcTrdCurUpri(SlsRet_Upd01_DtlR dtlR, MCNumber baseUnitQtySum) {
					
			MSUCL_ConvQtyAmtUtil.ConvQtyAmtUtil_Calc02 ope = MSUCL_ConvQtyAmtUtil.crtConvQtyAmtUtil_Calc02();
			
			ConvQtyAmtUtil_Calc01_HdrR up0R = ConvQtyAmtUtil_Calc01_HdrR.create();
			
			up0R.addNumberColumn("trd_unit_dec_place");
			up0R.addStringColumn("trd_unit_rnd_typ");
			
			dtlR.setDateNE("today", getToday());
			executeQuery(up0R, MSBBL6210_MST_SLS_RET_SCHD_D_S03(), dtlR);

			MCNumber convQty = rvrsBaseUnitConv(baseUnitQtySum,
					up0R.trd_unit_conv_base_qty(), up0R.trd_unit_conv_qty(),
					up0R.getNumberNE("trd_unit_dec_place"), up0R.getStringNE("trd_unit_rnd_typ"), true);
			
			if (!isNull(convQty)) {
				
				dtlR.trd_unit_qty(convQty);
				dtlR.trd_cur_upri(up0R.trd_cur_upri());
			}
			else {
				
				dtlR.trd_unit_qty(baseUnitQtySum);
				dtlR.trd_unit_cd(dtlR.base_unit_cd());
				
				dtlR.setNumberNE(MAVM_ITM_UNIT_R.$conv_base_qty, 1);
				dtlR.setNumberNE(MAVM_ITM_UNIT_R.$conv_qty, 1);
				dtlR.setNumberNE(MAVM_ITM_UNIT_R.$dec_place, up0R.base_unit_dec_place());
				dtlR.setStringNE(MAVM_ITM_UNIT_R.$rnd_typ, up0R.base_unit_rnd_typ());
				
				ConvQtyAmtUtil_Calc01_Dtl1R up1R = ConvQtyAmtUtil_Calc01_Dtl1R.create();
				
				up1R.trd_unit_qty(dtlR.trd_unit_qty());
				up1R.trd_unit_cd(dtlR.trd_unit_cd());
				up1R.trd_unit_conv_base_qty(1);
				up1R.trd_unit_conv_qty(1);
				
				ope.up0().add(up0R);
				ope.up1().add(up1R);
			
				if (!ope.up0().isEmpty()) {
					
					setPegNo(ope.up0());
					
					setPegNo(ope.up1());
					setPegNo(ConvQtyAmtUtil_Calc01_Dtl1R.$hdr_peg_no, ope.up1());
					
					ope.exec();
					
					dtlR.trd_cur_upri(ope.down0().get(0).trd_cur_upri());
					dtlR.trd_cur_dscnt_amt(ope.down0().get(0).trd_cur_dscnt_amt());
				}
			}
		}
		
		// RowMapper
		protected Map_SlsRet_Upd01_HdrR_MST_SLS_ACT_R_DEL<SlsRet_Upd01_HdrR,MST_SLS_ACT_R> createMap_SlsRet_Upd01_HdrR_MST_SLS_ACT_R_DEL() {
			return new Map_SlsRet_Upd01_HdrR_MST_SLS_ACT_R_DEL<SlsRet_Upd01_HdrR, MST_SLS_ACT_R>();
		}
		
		public class Map_SlsRet_Upd01_HdrR_MST_SLS_ACT_R_DEL<D extends SlsRet_Upd01_HdrR, S extends MST_SLS_ACT_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsRet_Upd01_HdrR.$sls_ret_schd_no, MST_SLS_ACT_R.$sls_ret_schd_no);
				addColumnPathMap(SlsRet_Upd01_HdrR.$sls_act_no, MST_SLS_ACT_R.$sls_act_no);
				addColumnPathMap(SlsRet_Upd01_HdrR.$sls_act_seq, MST_SLS_ACT_R.$sls_act_seq);
				addColumnPathMap(SlsRet_Upd01_HdrR.$sls_act_rev, MST_SLS_ACT_R.$sls_act_rev);
				addColumnPathMap(SlsRet_Upd01_HdrR.$trd_cd, MST_SLS_ACT_R.$trd_cd);
				addColumnPathMap(SlsRet_Upd01_HdrR.$trd_ptn_typ, MST_SLS_ACT_R.$trd_ptn_typ);
				addColumnPathMap(SlsRet_Upd01_HdrR.$dlv_slip_no, MST_SLS_ACT_R.$dlv_slip_no);
				addColumnPathMap(SlsRet_Upd01_HdrR.$iv_no, MST_SLS_ACT_R.$iv_no);
				addColumnPathMap(SlsRet_Upd01_HdrR.$ref_iv_no, MST_SLS_ACT_R.$ref_iv_no);
				addColumnPathMap(SlsRet_Upd01_HdrR.$ac_dt, MST_SLS_ACT_R.$ac_dt);
				addColumnPathMap(SlsRet_Upd01_HdrR.$ret_dt, MST_SLS_ACT_R.$sls_dt);
				addColumnPathMap(SlsRet_Upd01_HdrR.$bill_basis_dt, MST_SLS_ACT_R.$bill_basis_dt);
				addColumnPathMap(SlsRet_Upd01_HdrR.$rcv_schd_dt, MST_SLS_ACT_R.$rcv_schd_dt);
				addColumnPathMap(SlsRet_Upd01_HdrR.$cst_cd, MST_SLS_ACT_R.$cst_cd);
				addColumnPathMap(SlsRet_Upd01_HdrR.$sls_usr_cd, MST_SLS_ACT_R.$sls_usr_cd);
				addColumnPathMap(SlsRet_Upd01_HdrR.$sls_dpt_cd, MST_SLS_ACT_R.$sls_dpt_cd);
				addColumnPathMap(SlsRet_Upd01_HdrR.$wg_cd, MST_SLS_ACT_R.$wg_cd);
				addColumnPathMap(SlsRet_Upd01_HdrR.$cst_po_no, MST_SLS_ACT_R.$cst_po_no);
				addColumnPathMap(SlsRet_Upd01_HdrR.$cred_cd, MST_SLS_ACT_R.$cred_cd);
				addColumnPathMap(SlsRet_Upd01_HdrR.$bcst_cd, MST_SLS_ACT_R.$bcst_cd);
				addColumnPathMap(SlsRet_Upd01_HdrR.$acst_cd, MST_SLS_ACT_R.$acst_cd);
				addColumnPathMap(SlsRet_Upd01_HdrR.$ar_dpt_cd, MST_SLS_ACT_R.$ar_dpt_cd);
				addColumnPathMap(SlsRet_Upd01_HdrR.$trd_rmrks, MST_SLS_ACT_R.$trd_rmrks);
				addColumnPathMap(SlsRet_Upd01_HdrR.$intr_rmrks, MST_SLS_ACT_R.$intr_rmrks);
				addColumnPathMap(SlsRet_Upd01_HdrR.$tterm_cd1, MST_SLS_ACT_R.$tterm_cd1);
				addColumnPathMap(SlsRet_Upd01_HdrR.$tterm_rmrks1, MST_SLS_ACT_R.$tterm_rmrks1);
				addColumnPathMap(SlsRet_Upd01_HdrR.$tterm_cd2, MST_SLS_ACT_R.$tterm_cd2);
				addColumnPathMap(SlsRet_Upd01_HdrR.$tterm_rmrks2, MST_SLS_ACT_R.$tterm_rmrks2);
				addColumnPathMap(SlsRet_Upd01_HdrR.$tterm_cd3, MST_SLS_ACT_R.$tterm_cd3);
				addColumnPathMap(SlsRet_Upd01_HdrR.$tterm_rmrks3, MST_SLS_ACT_R.$tterm_rmrks3);
				addColumnPathMap(SlsRet_Upd01_HdrR.$sub_char1, MST_SLS_ACT_R.$sub_char1);
				addColumnPathMap(SlsRet_Upd01_HdrR.$sub_char2, MST_SLS_ACT_R.$sub_char2);
				addColumnPathMap(SlsRet_Upd01_HdrR.$sub_char3, MST_SLS_ACT_R.$sub_char3);
				addColumnPathMap(SlsRet_Upd01_HdrR.$trd_cur_cd, MST_SLS_ACT_R.$trd_cur_cd);
				addColumnPathMap(SlsRet_Upd01_HdrR.$base_cur_cd, MST_SLS_ACT_R.$base_cur_cd);
				addColumnPathMap(SlsRet_Upd01_HdrR.$xrate_cd, MST_SLS_ACT_R.$xrate_cd);
				addColumnPathMap(SlsRet_Upd01_HdrR.$xrate, MST_SLS_ACT_R.$xrate);
				addColumnPathMap(SlsRet_Upd01_HdrR.$ptax_cur_cd, MST_SLS_ACT_R.$ptax_cur_cd);
				addColumnPathMap(SlsRet_Upd01_HdrR.$ptax_xrate, MST_SLS_ACT_R.$ptax_xrate);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.setNumberNE(MAM_CUR_R.$amt_dec_place, src.getNumberNE(MAM_CUR_R.$amt_dec_place));
			}
		}
		
		protected Map_SlsRet_Upd01_IoR_MST_SLS_ACT_IO_R_UPD<SlsRet_Upd01_IoR,MST_SLS_ACT_IO_R> createMap_SlsRet_Upd01_IoR_MST_SLS_ACT_IO_R_UPD() {
			return new Map_SlsRet_Upd01_IoR_MST_SLS_ACT_IO_R_UPD<SlsRet_Upd01_IoR, MST_SLS_ACT_IO_R>();
		}
		
		public class Map_SlsRet_Upd01_IoR_MST_SLS_ACT_IO_R_UPD<D extends SlsRet_Upd01_IoR, S extends MST_SLS_ACT_IO_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsRet_Upd01_IoR.$sls_act_io_no, MST_SLS_ACT_IO_R.$sls_act_io_no);
				addColumnPathMap(SlsRet_Upd01_IoR.$sls_act_io_seq, MST_SLS_ACT_IO_R.$sls_act_io_seq);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			}
			
		}
		
		protected Map_SlsRet_Upd01_DtlR_SlsRet_Upd02_CndR<SlsRet_Upd01_DtlR,SlsRet_Upd02_CndR> createMap_SlsRet_Upd01_DtlR_SlsRet_Upd02_CndR() {
			return new Map_SlsRet_Upd01_DtlR_SlsRet_Upd02_CndR<SlsRet_Upd01_DtlR, SlsRet_Upd02_CndR>();
		}
		
		public class Map_SlsRet_Upd01_DtlR_SlsRet_Upd02_CndR<D extends SlsRet_Upd01_DtlR, S extends SlsRet_Upd02_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsRet_Upd01_DtlR.$sls_ret_schd_d_no, SlsRet_Upd02_CndR.$sls_ret_schd_d_no);
				addColumnPathMap(SlsRet_Upd01_DtlR.$abort_qty, SlsRet_Upd02_CndR.$abort_qty);
				addColumnPathMap(SlsRet_Upd01_DtlR.$slo_d_no, SlsRet_Upd02_CndR.$slo_d_no);
				addColumnPathMap(SlsRet_Upd01_DtlR.$ref_dlv_slip_no, SlsRet_Upd02_CndR.$ref_dlv_slip_no);
				addColumnPathMap(SlsRet_Upd01_DtlR.$ref_dlv_slip_d_no, SlsRet_Upd02_CndR.$ref_dlv_slip_d_no);
				addColumnPathMap(SlsRet_Upd01_DtlR.$arr_act_no, SlsRet_Upd02_CndR.$arr_act_no);
			}
		}
		
		protected Map_SlsRet_Upd01_HdrR_SlsRet_Upd02_CndR_SHIP_RET<SlsRet_Upd01_HdrR,SlsRet_Upd02_CndR> createMap_SlsRet_Upd01_HdrR_SlsRet_Upd02_CndR_SHIP_RET() {
			return new Map_SlsRet_Upd01_HdrR_SlsRet_Upd02_CndR_SHIP_RET<SlsRet_Upd01_HdrR, SlsRet_Upd02_CndR>();
		}
		
		public class Map_SlsRet_Upd01_HdrR_SlsRet_Upd02_CndR_SHIP_RET<D extends SlsRet_Upd01_HdrR, S extends SlsRet_Upd02_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsRet_Upd01_HdrR.$data_crud_typ, SlsRet_Upd02_CndR.$data_crud_typ);
				addColumnPathMap(SlsRet_Upd01_HdrR.$sls_ret_schd_no, SlsRet_Upd02_CndR.$sls_ret_schd_no);
				addColumnPathMap(SlsRet_Upd01_HdrR.$trd_cd, SlsRet_Upd02_CndR.$trd_cd);
				addColumnPathMap(SlsRet_Upd01_HdrR.$trd_ptn_typ, SlsRet_Upd02_CndR.$trd_ptn_typ);
			}
		}
		
		protected Map_SlsRet_Upd01_HdrR_SlsRet_Upd02_CndR<SlsRet_Upd01_HdrR,SlsRet_Upd02_CndR> createMap_SlsRet_Upd01_HdrR_SlsRet_Upd02_CndR() {
			return new Map_SlsRet_Upd01_HdrR_SlsRet_Upd02_CndR<SlsRet_Upd01_HdrR, SlsRet_Upd02_CndR>();
		}
		
		public class Map_SlsRet_Upd01_HdrR_SlsRet_Upd02_CndR<D extends SlsRet_Upd01_HdrR, S extends SlsRet_Upd02_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsRet_Upd01_HdrR.$data_crud_typ, SlsRet_Upd02_CndR.$data_crud_typ);
				addColumnPathMap(SlsRet_Upd01_HdrR.$sls_ret_schd_no, SlsRet_Upd02_CndR.$sls_ret_schd_no);
				addColumnPathMap(SlsRet_Upd01_HdrR.$sls_act_no, SlsRet_Upd02_CndR.$sls_act_no);
				addColumnPathMap(SlsRet_Upd01_HdrR.$sls_act_seq, SlsRet_Upd02_CndR.$sls_act_seq);
				addColumnPathMap(SlsRet_Upd01_HdrR.$sls_act_rev, SlsRet_Upd02_CndR.$sls_act_rev);
				addColumnPathMap(SlsRet_Upd01_HdrR.$trd_cd, SlsRet_Upd02_CndR.$trd_cd);
				addColumnPathMap(SlsRet_Upd01_HdrR.$trd_ptn_typ, SlsRet_Upd02_CndR.$trd_ptn_typ);
				addColumnPathMap(SlsRet_Upd01_HdrR.$ac_dt, SlsRet_Upd02_CndR.$ac_dt);
				addColumnPathMap(SlsRet_Upd01_HdrR.$ret_dt, SlsRet_Upd02_CndR.$arr_tm);
				addColumnPathMap(SlsRet_Upd01_HdrR.$bill_basis_dt, SlsRet_Upd02_CndR.$ac_dt);
				addColumnPathMap(SlsRet_Upd01_HdrR.$can_ac_dt, SlsRet_Upd02_CndR.$can_ac_dt);
			}
		}
		
		protected Map_SlsRet_Upd01_IoR_MST_SLS_ACT_IO_R<SlsRet_Upd01_IoR,MST_SLS_ACT_IO_R> createMap_SlsRet_Upd01_IoR_MST_SLS_ACT_IO_R() {
			return new Map_SlsRet_Upd01_IoR_MST_SLS_ACT_IO_R<SlsRet_Upd01_IoR, MST_SLS_ACT_IO_R>();
		}
		
		public class Map_SlsRet_Upd01_IoR_MST_SLS_ACT_IO_R<D extends SlsRet_Upd01_IoR, S extends MST_SLS_ACT_IO_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsRet_Upd01_IoR.$sls_act_io_no, MST_SLS_ACT_IO_R.$sls_act_io_no);
				addColumnPathMap(SlsRet_Upd01_IoR.$sls_act_io_seq, MST_SLS_ACT_IO_R.$sls_act_io_seq);
				addColumnPathMap(SlsRet_Upd01_IoR.$trd_unit_cd, MST_SLS_ACT_IO_R.$trd_unit_cd);
				addColumnPathMap(SlsRet_Upd01_IoR.$trd_unit_qty, MST_SLS_ACT_IO_R.$trd_unit_qty);
				addColumnPathMap(SlsRet_Upd01_IoR.$base_unit_cd, MST_SLS_ACT_IO_R.$base_unit_cd);
				addColumnPathMap(SlsRet_Upd01_IoR.$base_unit_qty, MST_SLS_ACT_IO_R.$base_unit_qty);
				addColumnPathMap(SlsRet_Upd01_IoR.$pack_unit_cd, MST_SLS_ACT_IO_R.$pack_unit_cd);
				addColumnPathMap(SlsRet_Upd01_IoR.$pack_unit_qty, MST_SLS_ACT_IO_R.$pack_unit_qty);
				addColumnPathMap(SlsRet_Upd01_IoR.$gd_cd, MST_SLS_ACT_IO_R.$gd_cd);
				addColumnPathMap(SlsRet_Upd01_IoR.$loc_cd, MST_SLS_ACT_IO_R.$loc_cd);
				addColumnPathMap(SlsRet_Upd01_IoR.$str_ln_cd, MST_SLS_ACT_IO_R.$str_ln_cd);
				addColumnPathMap(SlsRet_Upd01_IoR.$lot_no, MST_SLS_ACT_IO_R.$lot_no);
				addColumnPathMap(SlsRet_Upd01_IoR.$sublot_no, MST_SLS_ACT_IO_R.$sublot_no);
				addColumnPathMap(SlsRet_Upd01_IoR.$sno1, MST_SLS_ACT_IO_R.$sno1);
				addColumnPathMap(SlsRet_Upd01_IoR.$sno2, MST_SLS_ACT_IO_R.$sno2);
				addColumnPathMap(SlsRet_Upd01_IoR.$sno3, MST_SLS_ACT_IO_R.$sno3);
				addColumnPathMap(SlsRet_Upd01_IoR.$sno4, MST_SLS_ACT_IO_R.$sno4);
				addColumnPathMap(SlsRet_Upd01_IoR.$arr_act_no, MST_SLS_ACT_IO_R.$arr_act_no);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.sync_flg(true);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			}
		}
		
		protected Map_SlsRet_Upd01_IoR_SlsRet_Upd02_CndR<SlsRet_Upd01_IoR,SlsRet_Upd02_CndR> createMap_SlsRet_Upd01_IoR_SlsRet_Upd02_CndR() {
			return new Map_SlsRet_Upd01_IoR_SlsRet_Upd02_CndR<SlsRet_Upd01_IoR, SlsRet_Upd02_CndR>();
		}
		
		public class Map_SlsRet_Upd01_IoR_SlsRet_Upd02_CndR<D extends SlsRet_Upd01_IoR, S extends SlsRet_Upd02_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsRet_Upd01_IoR.$trd_unit_cd, SlsRet_Upd02_CndR.$trd_unit_cd);
				addColumnPathMap(SlsRet_Upd01_IoR.$trd_unit_qty, SlsRet_Upd02_CndR.$trd_unit_qty);
				addColumnPathMap(SlsRet_Upd01_IoR.$base_unit_cd, SlsRet_Upd02_CndR.$base_unit_cd);
				addColumnPathMap(SlsRet_Upd01_IoR.$base_unit_qty, SlsRet_Upd02_CndR.$base_unit_qty);
				addColumnPathMap(SlsRet_Upd01_IoR.$pack_unit_cd, SlsRet_Upd02_CndR.$pack_unit_cd);
				addColumnPathMap(SlsRet_Upd01_IoR.$pack_unit_qty, SlsRet_Upd02_CndR.$pack_unit_qty);
				addColumnPathMap(SlsRet_Upd01_IoR.$gd_cd, SlsRet_Upd02_CndR.$gd_cd);
				addColumnPathMap(SlsRet_Upd01_IoR.$loc_cd, SlsRet_Upd02_CndR.$arr_loc_cd);
				addColumnPathMap(SlsRet_Upd01_IoR.$str_ln_cd, SlsRet_Upd02_CndR.$str_ln_cd);
				addColumnPathMap(SlsRet_Upd01_IoR.$lot_no, SlsRet_Upd02_CndR.$lot_no);
				addColumnPathMap(SlsRet_Upd01_IoR.$sublot_no, SlsRet_Upd02_CndR.$sublot_no);
				addColumnPathMap(SlsRet_Upd01_IoR.$sno1, SlsRet_Upd02_CndR.$sno1);
				addColumnPathMap(SlsRet_Upd01_IoR.$sno2, SlsRet_Upd02_CndR.$sno2);
				addColumnPathMap(SlsRet_Upd01_IoR.$sno3, SlsRet_Upd02_CndR.$sno3);
				addColumnPathMap(SlsRet_Upd01_IoR.$sno4, SlsRet_Upd02_CndR.$sno4);
				addColumnPathMap(SlsRet_Upd01_IoR.$arr_act_no, SlsRet_Upd02_CndR.$arr_act_no);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.sync_flg(true);
			}
		}
		
		protected Map_SlsRet_Upd01_DtlR_MST_SLS_ACT_D_R<SlsRet_Upd01_DtlR,MST_SLS_ACT_D_R> createMap_SlsRet_Upd01_DtlR_MST_SLS_ACT_D_R() {
			return new Map_SlsRet_Upd01_DtlR_MST_SLS_ACT_D_R<SlsRet_Upd01_DtlR, MST_SLS_ACT_D_R>();
		}
		
		public class Map_SlsRet_Upd01_DtlR_MST_SLS_ACT_D_R<D extends SlsRet_Upd01_DtlR, S extends MST_SLS_ACT_D_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsRet_Upd01_DtlR.$sls_act_d_no, MST_SLS_ACT_D_R.$sls_act_d_no);
				addColumnPathMap(SlsRet_Upd01_DtlR.$sls_act_d_seq, MST_SLS_ACT_D_R.$sls_act_d_seq);
				addColumnPathMap(SlsRet_Upd01_DtlR.$sls_ret_schd_d_no, MST_SLS_ACT_D_R.$sls_ret_schd_d_no);
				addColumnPathMap(SlsRet_Upd01_DtlR.$disp_seq, MST_SLS_ACT_D_R.$disp_seq);
				addColumnPathMap(SlsRet_Upd01_DtlR.$itm_cd, MST_SLS_ACT_D_R.$itm_cd);
				addColumnPathMap(SlsRet_Upd01_DtlR.$itm_sub1, MST_SLS_ACT_D_R.$itm_sub1);
				addColumnPathMap(SlsRet_Upd01_DtlR.$itm_sub2, MST_SLS_ACT_D_R.$itm_sub2);
				addColumnPathMap(SlsRet_Upd01_DtlR.$itm_sub3, MST_SLS_ACT_D_R.$itm_sub3);
				addColumnPathMap(SlsRet_Upd01_DtlR.$itm_nm, MST_SLS_ACT_D_R.$itm_nm);
				addColumnPathMap(SlsRet_Upd01_DtlR.$iv_itm_nm, MST_SLS_ACT_D_R.$iv_itm_nm);
				addColumnPathMap(SlsRet_Upd01_DtlR.$stk_mng_typ, MST_SLS_ACT_D_R.$stk_mng_typ);
				addColumnPathMap(SlsRet_Upd01_DtlR.$sundry_itm_flg, MST_SLS_ACT_D_R.$sundry_itm_flg);
				addColumnPathMap(SlsRet_Upd01_DtlR.$dlv_cd, MST_SLS_ACT_D_R.$dlv_cd);
				addColumnPathMap(SlsRet_Upd01_DtlR.$dlv_sundry_flg, MST_SLS_ACT_D_R.$dlv_sundry_flg);
				addColumnPathMap(SlsRet_Upd01_DtlR.$dlv_nm, MST_SLS_ACT_D_R.$dlv_nm);
				addColumnPathMap(SlsRet_Upd01_DtlR.$dlv_cntct_dpt, MST_SLS_ACT_D_R.$dlv_cntct_dpt);
				addColumnPathMap(SlsRet_Upd01_DtlR.$dlv_cntct_psn, MST_SLS_ACT_D_R.$dlv_cntct_psn);
				addColumnPathMap(SlsRet_Upd01_DtlR.$dlv_zip_cd, MST_SLS_ACT_D_R.$dlv_zip_cd);
				addColumnPathMap(SlsRet_Upd01_DtlR.$dlv_addr1, MST_SLS_ACT_D_R.$dlv_addr1);
				addColumnPathMap(SlsRet_Upd01_DtlR.$dlv_addr2, MST_SLS_ACT_D_R.$dlv_addr2);
				addColumnPathMap(SlsRet_Upd01_DtlR.$dlv_addr3, MST_SLS_ACT_D_R.$dlv_addr3);
				addColumnPathMap(SlsRet_Upd01_DtlR.$dlv_addr4, MST_SLS_ACT_D_R.$dlv_addr4);
				addColumnPathMap(SlsRet_Upd01_DtlR.$dlv_tel, MST_SLS_ACT_D_R.$dlv_tel);
				addColumnPathMap(SlsRet_Upd01_DtlR.$dlv_fax, MST_SLS_ACT_D_R.$dlv_fax);
				addColumnPathMap(SlsRet_Upd01_DtlR.$pri_prnt_flg, MST_SLS_ACT_D_R.$pri_prnt_flg);
				addColumnPathMap(SlsRet_Upd01_DtlR.$dest_cd1, MST_SLS_ACT_D_R.$dest_cd1);
				addColumnPathMap(SlsRet_Upd01_DtlR.$dest_cd2, MST_SLS_ACT_D_R.$dest_cd2);
				addColumnPathMap(SlsRet_Upd01_DtlR.$dest_cd3, MST_SLS_ACT_D_R.$dest_cd3);
				addColumnPathMap(SlsRet_Upd01_DtlR.$cntry_org_cd, MST_SLS_ACT_D_R.$cntry_org_cd);
				addColumnPathMap(SlsRet_Upd01_DtlR.$trd_unit_cd, MST_SLS_ACT_D_R.$trd_unit_cd);
				addColumnPathMap(SlsRet_Upd01_DtlR.$trd_unit_qty, MST_SLS_ACT_D_R.$trd_unit_qty);
				addColumnPathMap(SlsRet_Upd01_DtlR.$base_unit_cd, MST_SLS_ACT_D_R.$base_unit_cd);
				addColumnPathMap(SlsRet_Upd01_DtlR.$base_unit_qty, MST_SLS_ACT_D_R.$base_unit_qty);
				addColumnPathMap(SlsRet_Upd01_DtlR.$gd_cd, MST_SLS_ACT_D_R.$gd_cd);
				addColumnPathMap(SlsRet_Upd01_DtlR.$sno1, MST_SLS_ACT_D_R.$sno1);
				addColumnPathMap(SlsRet_Upd01_DtlR.$sno2, MST_SLS_ACT_D_R.$sno2);
				addColumnPathMap(SlsRet_Upd01_DtlR.$sno3, MST_SLS_ACT_D_R.$sno3);
				addColumnPathMap(SlsRet_Upd01_DtlR.$sno4, MST_SLS_ACT_D_R.$sno4);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno1_mng_typ, MST_SLS_ACT_D_R.$sno1_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno2_mng_typ, MST_SLS_ACT_D_R.$sno2_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno3_mng_typ, MST_SLS_ACT_D_R.$sno3_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno4_mng_typ, MST_SLS_ACT_D_R.$sno4_mng_typ);
				addColumnPathMap(SlsRet_Upd01_DtlR.$wrk_no, MST_SLS_ACT_D_R.$wrk_no);
				addColumnPathMap(SlsRet_Upd01_DtlR.$loc_cd, MST_SLS_ACT_D_R.$loc_cd);
				addColumnPathMap(SlsRet_Upd01_DtlR.$str_ln_cd, MST_SLS_ACT_D_R.$str_ln_cd);
				addColumnPathMap(SlsRet_Upd01_DtlR.$lot_no, MST_SLS_ACT_D_R.$lot_no);
				addColumnPathMap(SlsRet_Upd01_DtlR.$sublot_no, MST_SLS_ACT_D_R.$sublot_no);
				addColumnPathMap(SlsRet_Upd01_DtlR.$cst_po_d_no, MST_SLS_ACT_D_R.$cst_po_d_no);
				addColumnPathMap(SlsRet_Upd01_DtlR.$cst_itm_cd, MST_SLS_ACT_D_R.$cst_itm_cd);
				addColumnPathMap(SlsRet_Upd01_DtlR.$cst_itm_nm, MST_SLS_ACT_D_R.$cst_itm_nm);
				addColumnPathMap(SlsRet_Upd01_DtlR.$ret_rsn_cd, MST_SLS_ACT_D_R.$rsn_cd);
				addColumnPathMap(SlsRet_Upd01_DtlR.$bd_dpt_cd, MST_SLS_ACT_D_R.$bd_dpt_cd);
				addColumnPathMap(SlsRet_Upd01_DtlR.$trd_d_rmrks, MST_SLS_ACT_D_R.$trd_d_rmrks);
				addColumnPathMap(SlsRet_Upd01_DtlR.$ref_sls_act_no, MST_SLS_ACT_D_R.$ref_sls_act_no);
				addColumnPathMap(SlsRet_Upd01_DtlR.$ref_sls_act_seq, MST_SLS_ACT_D_R.$ref_sls_act_seq);
				addColumnPathMap(SlsRet_Upd01_DtlR.$ref_sls_act_d_no, MST_SLS_ACT_D_R.$ref_sls_act_d_no);
				addColumnPathMap(SlsRet_Upd01_DtlR.$ref_sls_act_d_seq, MST_SLS_ACT_D_R.$ref_sls_act_d_seq);
				addColumnPathMap(SlsRet_Upd01_DtlR.$slo_no, MST_SLS_ACT_D_R.$slo_no);
				addColumnPathMap(SlsRet_Upd01_DtlR.$slo_d_no, MST_SLS_ACT_D_R.$slo_d_no);
				addColumnPathMap(SlsRet_Upd01_DtlR.$bill_crryovr_times, MST_SLS_ACT_D_R.$bill_crryovr_times);
				addColumnPathMap(SlsRet_Upd01_DtlR.$dlv_slip_d_no, MST_SLS_ACT_D_R.$dlv_slip_d_no);
				addColumnPathMap(SlsRet_Upd01_DtlR.$trd_cur_upri, MST_SLS_ACT_D_R.$trd_cur_upri);
				addColumnPathMap(SlsRet_Upd01_DtlR.$upri_not_tgt_flg, MST_SLS_ACT_D_R.$upri_not_tgt_flg);
				addColumnPathMap(SlsRet_Upd01_DtlR.$interim_flg, MST_SLS_ACT_D_R.$interim_flg);
				addColumnPathMap(SlsRet_Upd01_DtlR.$trd_cur_dscnt_amt, MST_SLS_ACT_D_R.$trd_cur_dscnt_amt);
				addColumnPathMap(SlsRet_Upd01_DtlR.$dscnt_rsn_cd, MST_SLS_ACT_D_R.$dscnt_rsn_cd);
				addColumnPathMap(SlsRet_Upd01_DtlR.$cost_upri, MST_SLS_ACT_D_R.$cost_upri);
				addColumnPathMap(SlsRet_Upd01_DtlR.$tax_cd, MST_SLS_ACT_D_R.$tax_cd);
				addColumnPathMap(SlsRet_Upd01_DtlR.$wtax_rate, MST_SLS_ACT_D_R.$wtax_rate);
				addColumnPathMap(SlsRet_Upd01_DtlR.$base_sls_ac_dt, MST_SLS_ACT_D_R.$base_sls_ac_dt);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				dest.itm_jnl_cd(src.getStringNE(MAM_ITM_R.$itm_jnl_cd));
				dest.abort_qty(src.getNumberNE(MST_ARR_PR_R.$arr_schd_abort_qty));
				dest.inc_tax_flg(src.getBooleanNE(MAM_TAX_R.$inc_tax_flg));
				dest.tax_rate(src.getNumberNE(MAM_TAX_R.$tax_rate));
				dest.tax_typ(src.getStringNE(MAM_TAX_R.$tax_typ));
				dest.setNumberNE(MAVM_ITM_UNIT_R.$conv_base_qty, src.getNumberNE(MAVM_ITM_UNIT_R.$conv_base_qty));
				dest.setNumberNE(MAVM_ITM_UNIT_R.$conv_qty, src.getNumberNE(MAVM_ITM_UNIT_R.$conv_qty));
				dest.setNumberNE(MAM_ITM_R.$dec_place, src.getNumberNE(MAM_ITM_R.$dec_place));
				dest.setStringNE(MAM_ITM_R.$rnd_typ, src.getStringNE(MAM_ITM_R.$rnd_typ));
				dest.scrn_trd_cur_amt(src.getNumberNE("scrn_trd_cur_amt"));
				dest.scrn_trd_cur_tax_amt(src.getNumberNE("scrn_trd_cur_tax_amt"));
			}
		}
		
		protected Map_SlsRet_Upd01_HdrR_MST_SLS_ACT_R<SlsRet_Upd01_HdrR,MST_SLS_ACT_R> createMap_SlsRet_Upd01_HdrR_MST_SLS_ACT_R() {
			return new Map_SlsRet_Upd01_HdrR_MST_SLS_ACT_R<SlsRet_Upd01_HdrR, MST_SLS_ACT_R>();
		}
		
		public class Map_SlsRet_Upd01_HdrR_MST_SLS_ACT_R<D extends SlsRet_Upd01_HdrR, S extends MST_SLS_ACT_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsRet_Upd01_HdrR.$sls_ret_schd_no, MST_SLS_ACT_R.$sls_ret_schd_no);
				addColumnPathMap(SlsRet_Upd01_HdrR.$sls_act_no, MST_SLS_ACT_R.$sls_act_no);
				addColumnPathMap(SlsRet_Upd01_HdrR.$sls_act_seq, MST_SLS_ACT_R.$sls_act_seq);
				addColumnPathMap(SlsRet_Upd01_HdrR.$sls_act_rev, MST_SLS_ACT_R.$sls_act_rev);
				addColumnPathMap(SlsRet_Upd01_HdrR.$trd_cd, MST_SLS_ACT_R.$trd_cd);
				addColumnPathMap(SlsRet_Upd01_HdrR.$trd_ptn_typ, MST_SLS_ACT_R.$trd_ptn_typ);
				addColumnPathMap(SlsRet_Upd01_HdrR.$dlv_slip_no, MST_SLS_ACT_R.$dlv_slip_no);
				addColumnPathMap(SlsRet_Upd01_HdrR.$iv_no, MST_SLS_ACT_R.$iv_no);
				addColumnPathMap(SlsRet_Upd01_HdrR.$ref_iv_no, MST_SLS_ACT_R.$ref_iv_no);
				addColumnPathMap(SlsRet_Upd01_HdrR.$rcv_schd_dt, MST_SLS_ACT_R.$rcv_schd_dt);
				addColumnPathMap(SlsRet_Upd01_HdrR.$cst_cd, MST_SLS_ACT_R.$cst_cd);
				addColumnPathMap(SlsRet_Upd01_HdrR.$sls_usr_cd, MST_SLS_ACT_R.$sls_usr_cd);
				addColumnPathMap(SlsRet_Upd01_HdrR.$sls_dpt_cd, MST_SLS_ACT_R.$sls_dpt_cd);
				addColumnPathMap(SlsRet_Upd01_HdrR.$cst_po_no, MST_SLS_ACT_R.$cst_po_no);
				addColumnPathMap(SlsRet_Upd01_HdrR.$ar_dpt_cd, MST_SLS_ACT_R.$ar_dpt_cd);
				addColumnPathMap(SlsRet_Upd01_HdrR.$trd_rmrks, MST_SLS_ACT_R.$trd_rmrks);
				addColumnPathMap(SlsRet_Upd01_HdrR.$tterm_cd1, MST_SLS_ACT_R.$tterm_cd1);
				addColumnPathMap(SlsRet_Upd01_HdrR.$tterm_rmrks1, MST_SLS_ACT_R.$tterm_rmrks1);
				addColumnPathMap(SlsRet_Upd01_HdrR.$tterm_cd2, MST_SLS_ACT_R.$tterm_cd2);
				addColumnPathMap(SlsRet_Upd01_HdrR.$tterm_rmrks2, MST_SLS_ACT_R.$tterm_rmrks2);
				addColumnPathMap(SlsRet_Upd01_HdrR.$tterm_cd3, MST_SLS_ACT_R.$tterm_cd3);
				addColumnPathMap(SlsRet_Upd01_HdrR.$tterm_rmrks3, MST_SLS_ACT_R.$tterm_rmrks3);
				addColumnPathMap(SlsRet_Upd01_HdrR.$trd_cur_cd, MST_SLS_ACT_R.$trd_cur_cd);
				addColumnPathMap(SlsRet_Upd01_HdrR.$base_cur_cd, MST_SLS_ACT_R.$base_cur_cd);
				addColumnPathMap(SlsRet_Upd01_HdrR.$xrate_cd, MST_SLS_ACT_R.$xrate_cd);
				addColumnPathMap(SlsRet_Upd01_HdrR.$xrate, MST_SLS_ACT_R.$xrate);
				addColumnPathMap(SlsRet_Upd01_HdrR.$ptax_cur_cd, MST_SLS_ACT_R.$ptax_cur_cd);
				addColumnPathMap(SlsRet_Upd01_HdrR.$ptax_xrate, MST_SLS_ACT_R.$ptax_xrate);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());	// データ更新区分（更新）
				dest.acst_cd(getBp(dest.cst_cd()).acst_cd());		// 売掛先ＣＤ
				dest.bcst_cd(getBp(dest.acst_cd()).bcst_cd());		// 請求先ＣＤ
				dest.cred_cd(getBp(dest.bcst_cd()).ar_cred_cd());	// 与信管理先ＣＤ
				dest.wg_cd(getDpt(src.sls_dpt_cd(), dest.ac_dt()).wg_cd());	// ワーキンググループＣＤ
				dest.setNumberNE(MAM_CUR_R.$amt_dec_place, src.getNumberNE(MAM_CUR_R.$amt_dec_place));
			}
		}
	}

	//FMCB CUSTOM END
}