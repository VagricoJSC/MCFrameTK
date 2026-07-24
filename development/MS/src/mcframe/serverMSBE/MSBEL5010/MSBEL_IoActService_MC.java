package mcframe.serverMSBE.MSBEL5010;

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
import mcframe.serverMS.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverFXUC.FXUCL0030.*;
import mcframe.serverMSBE.MSBEL5030.*;
import mcframe.serverMSBE.MSBEL5040.*;
import mcframe.serverMSBF.MSBFL5200.*;
import mcframe.serverMSBF.MSBFL5210.*;
import mcframe.serverMAUC.MAUCL1110.*;
import static mcframe.serverMSBE.MSBEL5010.Query.*;
import mcframe.serverMAUC.MAUCL1060.MAUCL_TrdUtil;
import java.util.ArrayList;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_IoActService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_IoActService_MC extends MSBEL_IoActService_MC_A{
	//FMCB CUSTOM START
	// デバッグ用のログを出力するかどうか（する:true）
	protected static boolean _debug_log = false;

	/**
	 * IoAct_Ins01オペレーション.<p>
	 *
	 * 受払実績ワークを作成する<br>
	 */
	public class IoAct_Ins01 extends MSBEL_IoActService_MC_A.IoAct_Ins01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

// 上り電文をログに書き出す（デバッグ用）
			writeUpLog(up0());

			doMasterCache(up0());

			MCList<MSW_IO_ACT_R> dbc = MCList.create(MSW_IO_ACT_R.class);
			insMSW_IO_ACT(dbc);

			MSBFL_LotService.Lot_Upd01 opLot = MSBFL_LotService.crtLot_Upd01();
			callLotSv(opLot, dbc);

		}

		protected void insMSW_IO_ACT(MCList<MSW_IO_ACT_R> dbc) {

			for (IoAct_Ins01_DtlR r: up0()) {
				addDbc(dbc, r);
			}

			dbInsertEx("MSBEL5010_MSW_IO_ACT_I01", dbc, MCQueryApiBuilder.create(MSW_IO_ACT_R.create("T")));
		}

		protected void callLotSv(MSBFL_LotService.Lot_Upd01 opLot, MCList<MSW_IO_ACT_R> dbc) {

			setLotSv(opLot, dbc);

			if (opLot.up0().size() > 0) {
				opLot.exec();
			}
		}

		protected void addDbc(MCList<MSW_IO_ACT_R> dbc, IoAct_Ins01_DtlR r) {

			MSW_IO_ACT_R parR = r.wia();

			if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
				// データ更新区分が削除の場合は、引数のまま追加
				dbc.add(parR);
			}
			else {
				// 受払区分の判定および子伝の追加
				setIoActTypAndChd(dbc, parR, r);
			}
		}

		protected void setIoActTypAndChd(MCList<MSW_IO_ACT_R> dbc, MSW_IO_ACT_R parR,
				IoAct_Ins01_DtlR r) {

			MSW_IO_ACT_R chdR = null;

			// 取引パタン区分:売上
			if (MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ())) {
				// トランザクション区分:売上
				if (MSC_TRN_TYP.isSLS(r.trn_typ())) {

					//販売他勘定の理由が設定されている場合
					if (!isNull(r.rsn_cd()) && getBizRsn(r.rsn_cd()).sls_acxfr_flg()) {
						//他勘定振替出庫
						parR.io_act_typ(MSC_IO_ACT_TYP.ACXFR_GI.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());
						clearAmtInfo(parR);

						//在庫着荷先が指定されていない場合は預り売上
						if (MAC_STR.isNULL_VAL(r.stk_arrv_bp_cd()) || isNull(r.stk_arrv_bp_cd())) {
							//子伝 預り入庫
							chdR = parR.clone();
							chdR.io_act_typ(MSC_IO_ACT_TYP.ARR_CSTSTK.value());
							chdR.stk_id_typ(MSC_STK_ID_TYP.CSTSTK.value());
							chdR.stk_bp_cd(r.cst_cd());
							copyFromGiToGr(chdR);
							clearGiInfo(chdR);
						}
					}
					else {
						//売上
						parR.io_act_typ(MSC_IO_ACT_TYP.SLS.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());

						//在庫着荷先が指定されていない場合は預り売上
						if (MAC_STR.isNULL_VAL(r.stk_arrv_bp_cd()) || isNull(r.stk_arrv_bp_cd())) {
							//子伝 預り入庫
							chdR = parR.clone();
							chdR.io_act_typ(MSC_IO_ACT_TYP.ARR_CSTSTK.value());
							chdR.stk_id_typ(MSC_STK_ID_TYP.CSTSTK.value());
							chdR.stk_bp_cd(r.cst_cd());
							copyFromGiToGr(chdR);
							clearGiInfo(chdR);
							clearAmtInfo(chdR);
						}
					}
				}
				// トランザクション区分:出荷、インボイス
				else if (MSC_TRN_TYP.isSHIP(r.trn_typ()) || MSC_TRN_TYP.isIV(r.trn_typ())) {
					//出荷
					parR.io_act_typ(MSC_IO_ACT_TYP.SHIP_OUT.value());
					parR.par_slip_io_act_typ(parR.io_act_typ());

					//子伝 在庫識別区分:預りでない場合
					if (!MSC_STK_ID_TYP.isCSTSTK(r.stk_id_typ()) 
							|| MAC_VIA_DLV_TYP.isVIA(r.via_dlv_typ())) {
						//子伝 着荷
						chdR = parR.clone();
						chdR.io_act_typ(MSC_IO_ACT_TYP.SHIP_IN.value());
						copyFromGiToGr(chdR);
						clearGiInfo(chdR);

						if (MAC_VIA_DLV_TYP.isNOT_VIA(r.via_dlv_typ())) {
							//経由しない場合 在庫着荷先:納品先
							chdR.stk_arrv_bp_cd(r.dlv_cd());
						}
						else {
							//経由する場合  在庫着荷先:配送先
							chdR.stk_arrv_bp_cd(r.tdlv_cd());
						}

						//親伝の確定ＮＯは子伝用のため設定なしにする
						if (MSC_TRN_TYP.isIV(r.trn_typ())) {
							// 親伝 確定ＮＯ区分：納品書ＮＯ
							parR.fix_no_typ(r.fix_no_typ());
							parR.fix_no(r.fix_no());
							parR.stk_arrv_bp_cd(r.dlv_cd());
							
							// 子伝 確定ＮＯ区分：インボイスＮＯ
							chdR.fix_no_typ(MSC_FIX_NO_TYP.IV_NO.value());
							chdR.fix_no(r.iv_no());
						}
						else {
							parR.fix_no_typ(MSC_FIX_NO_TYP.NON.value());
							parR.fix_no(MAC_STR.NULL_VAL.value());
						}
					}
				}
				// トランザクション区分:インボイス出荷
				else if (MSC_TRN_TYP.isIV_SHIP(r.trn_typ())) {
					//輸出出荷
					parR.io_act_typ(MSC_IO_ACT_TYP.EX_SHIP_OUT.value());
					parR.par_slip_io_act_typ(parR.io_act_typ());

					//子伝 在庫識別区分:預りでない場合
					if (!MSC_STK_ID_TYP.isCSTSTK(r.stk_id_typ())) {
						//子伝 輸出着荷
						chdR = parR.clone();
						chdR.io_act_typ(MSC_IO_ACT_TYP.EX_SHIP_IN.value());
						copyFromGiToGr(chdR);
						clearGiInfo(chdR);
	
						//在庫着荷先を納品先にする
						chdR.stk_arrv_bp_cd(r.dlv_cd());
					}

					//確定ＮＯは子伝用のため設定なしにする
					parR.fix_no_typ(MSC_FIX_NO_TYP.NON.value());
					parR.fix_no(MAC_STR.NULL_VAL.value());
				}
				// トランザクション区分:入金実績
				else if (MSC_TRN_TYP.isRCV_ACT(r.trn_typ())) {
					//売上
					parR.io_act_typ(MSC_IO_ACT_TYP.SLS.value());
					parR.par_slip_io_act_typ(parR.io_act_typ());
				}
			}
			// 取引パタン区分:貸出売上
			else if (MAC_TRD_PTN_TYP.isSLS_CNSGN(r.trd_ptn_typ())) {
				// トランザクション区分:売上
				if (MSC_TRN_TYP.isSLS(r.trn_typ())) {
					//販売他勘定の理由が設定されている場合
					if (!isNull(r.rsn_cd()) && getBizRsn(r.rsn_cd()).sls_acxfr_flg()) {
						//他勘定振替出庫
						parR.io_act_typ(MSC_IO_ACT_TYP.ACXFR_GI.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());
						clearAmtInfo(parR);
					}
					else {
						//売上
						parR.io_act_typ(MSC_IO_ACT_TYP.SLS.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());
					}
				}
				// トランザクション区分:入金実績
				else if (MSC_TRN_TYP.isRCV_ACT(r.trn_typ())) {
					//売上
					parR.io_act_typ(MSC_IO_ACT_TYP.SLS.value());
					parR.par_slip_io_act_typ(parR.io_act_typ());
				}
			}
			// 取引パタン区分:売上返品
			else if (MAC_TRD_PTN_TYP.isSLS_RTN(r.trd_ptn_typ())) {
				// トランザクション区分:売上
				if (MSC_TRN_TYP.isSLS(r.trn_typ())) {
					//売上返品出庫
					parR.io_act_typ(MSC_IO_ACT_TYP.SLS_RTN_GI.value());
					parR.par_slip_io_act_typ(parR.io_act_typ());

					//子伝 他勘定振替入庫 or 売上返品入庫
					chdR = parR.clone();

					//親伝の金額情報はクリア
					clearAmtInfo(parR);

					if (!isNull(r.rsn_cd()) && getBizRsn(r.rsn_cd()).sls_acxfr_flg()) {
						//他勘定振替入庫
						chdR.io_act_typ(MSC_IO_ACT_TYP.ACXFR_GR.value());
						clearAmtInfo(chdR);
					}
					else {
						//売上返品入庫
						chdR.io_act_typ(MSC_IO_ACT_TYP.SLS_RTN_GR.value());
					}

					chdR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
					chdR.stk_bp_cd(MAC_STR.NULL_VAL.value());
					copyFromGiToGr(chdR);
				}
				// トランザクション区分:入荷
				else if (MSC_TRN_TYP.isARR(r.trn_typ())) {
					//入荷
					parR.io_act_typ(MSC_IO_ACT_TYP.ARR.value());
					parR.par_slip_io_act_typ(parR.io_act_typ());
				}
				// トランザクション区分:入金実績
				else if (MSC_TRN_TYP.isRCV_ACT(r.trn_typ())) {
					//売上返品入庫
					parR.io_act_typ(MSC_IO_ACT_TYP.SLS_RTN_GR.value());
					parR.par_slip_io_act_typ(parR.io_act_typ());
				}
			}
			// 取引パタン区分:売上値引
			else if (MAC_TRD_PTN_TYP.isSLS_DSCNT(r.trd_ptn_typ())) {
				// トランザクション区分:売上 or 入金実績
				if (MSC_TRN_TYP.isSLS(r.trn_typ())||
						MSC_TRN_TYP.isRCV_ACT(r.trn_typ()))  {
					//売上値引
					parR.io_act_typ(MSC_IO_ACT_TYP.SLS_DSCNT.value());
					parR.par_slip_io_act_typ(parR.io_act_typ());
				}
			}
			// 取引パタン区分:売上値増
			else if (MAC_TRD_PTN_TYP.isSLS_XTRA(r.trd_ptn_typ())) {
				// トランザクション区分:売上 or 入金実績
				if (MSC_TRN_TYP.isSLS(r.trn_typ()) ||
						MSC_TRN_TYP.isRCV_ACT(r.trn_typ())) {
					//売上値増
					parR.io_act_typ(MSC_IO_ACT_TYP.SLS_XTRA.value());
					parR.par_slip_io_act_typ(parR.io_act_typ());
				}
			}
			// 取引パタン区分:製造
			else if (MAC_TRD_PTN_TYP.isMFG(r.trd_ptn_typ())) {
				// トランザクション区分:出来高
				if (MSC_TRN_TYP.isYIELD(r.trn_typ())) {
					if (MAC_YIELD_TYP.isBYPROD(r.yield_typ())) {
						//副産品製造
						parR.io_act_typ(MSC_IO_ACT_TYP.BYMFG.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());
					}
					else {
						//製造
						parR.io_act_typ(MSC_IO_ACT_TYP.MFG.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());
					}
				}
				// トランザクション区分:投入
				else if (MSC_TRN_TYP.isINPT(r.trn_typ())) {

					if (MSC_STK_ID_TYP.isSLF_SUPPRT(r.stk_id_typ())){
						//投入（自給）
						parR.io_act_typ(MSC_IO_ACT_TYP.INPT_SLF.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());
					}
					else {
						//投入
						parR.io_act_typ(MSC_IO_ACT_TYP.INPT.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());
					}
				}
				// トランザクション区分:ロス
				else if (MSC_TRN_TYP.isLOSS(r.trn_typ())) {

					if (MSC_STK_ID_TYP.isSLF_SUPPRT(r.stk_id_typ())) {
						//ロス（自給）
						parR.io_act_typ(MSC_IO_ACT_TYP.LOSS_SLF.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());
					}
					else {
						//ロス
						parR.io_act_typ(MSC_IO_ACT_TYP.LOSS.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());
					}
				}
			}
			// 取引パタン区分:仕入
			else if (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())) {
				// トランザクション区分:購買
				if (MSC_TRN_TYP.isPURC(r.trn_typ())) {

					// 暫定買掛ＦＬＧのクリア
					parR.addBooleanColumn("org_temp_ap_flg", parR.temp_ap_flg());
					parR.temp_ap_flg(false);

					if (r.accpt_dfct_flg()) {
						//検収不良出庫
						parR.io_act_typ(MSC_IO_ACT_TYP.ACCPT_DFCT_GI.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());

						//子伝 検収不良入庫
						chdR = parR.clone();
						chdR.io_act_typ(MSC_IO_ACT_TYP.ACCPT_DFCT_GR.value());
						chdR.stk_id_typ(MSC_STK_ID_TYP.ACCPT_DFCT.value());

						// 検査済の場合は確定ＮＯをクリアする
						if (MSC_STK_INSP_TYP.isFIN(r.stk_insp_typ())){
							chdR.fix_no_typ(MSC_FIX_NO_TYP.NON.value());
							chdR.fix_no(MAC_STR.NULL_VAL.value());
						}

						//親伝の場所等は入庫として渡されるため出庫にコピーし、入庫情報をクリアする
						copyFromGrToGi(parR);
						clearGrInfo(parR);
					}
					else if (!isNull(r.rsn_cd()) && getBizRsn(r.rsn_cd()).xpns_purc_flg()) {

						//未着の場合
						if (MSC_ARR_PTN_TYP.isN_YET_ARR(r.arr_ptn_typ())) {
							//経費購買入庫
							parR.io_act_typ(MSC_IO_ACT_TYP.XPNS_PURC_GR.value());
							parR.par_slip_io_act_typ(parR.io_act_typ());
						}
						else {
							//経費購買出庫
							parR.io_act_typ(MSC_IO_ACT_TYP.XPNS_PURC_GI.value());
							parR.par_slip_io_act_typ(parR.io_act_typ());

							//子伝 経費購買入庫
							chdR = parR.clone();
							chdR.io_act_typ(MSC_IO_ACT_TYP.XPNS_PURC_GR.value());

							chdR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
							chdR.stk_bp_cd(MAC_STR.NULL_VAL.value());
							chdR.temp_ap_flg(parR.getBoolean("org_temp_ap_flg"));

							// 検査済の場合は確定ＮＯをクリアする
							if (MSC_STK_INSP_TYP.isFIN(r.stk_insp_typ())){
								chdR.fix_no_typ(MSC_FIX_NO_TYP.NON.value());
								chdR.fix_no(MAC_STR.NULL_VAL.value());
							}

							//親伝の場所等は入庫として渡されるため出庫にコピーし、入庫情報をクリアする
							copyFromGrToGi(parR);
							clearGrInfo(parR);
							//親伝の金額情報をクリアする
							clearAmtInfo(parR);
						}
					}
					else if (MAC_PURC_ID_TYP.isONR_RCV(r.purc_id_typ())) {
						//未着の場合
						if (MSC_ARR_PTN_TYP.isN_YET_ARR(r.arr_ptn_typ())) {
							//有償受給入庫
							parR.io_act_typ(MSC_IO_ACT_TYP.ONR_RCV_GR.value());
							parR.par_slip_io_act_typ(parR.io_act_typ());
						}
						else {
							//有償受給出庫
							parR.io_act_typ(MSC_IO_ACT_TYP.ONR_RCV_GI.value());
							parR.par_slip_io_act_typ(parR.io_act_typ());

							//子伝 有償受給入庫
							chdR = parR.clone();
							chdR.io_act_typ(MSC_IO_ACT_TYP.ONR_RCV_GR.value());
							chdR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
							chdR.stk_bp_cd(MAC_STR.NULL_VAL.value());
							chdR.temp_ap_flg(parR.getBoolean("org_temp_ap_flg"));

							// 検査済の場合は確定ＮＯをクリアする
							if (MSC_STK_INSP_TYP.isFIN(r.stk_insp_typ())){
								chdR.fix_no_typ(MSC_FIX_NO_TYP.NON.value());
								chdR.fix_no(MAC_STR.NULL_VAL.value());
							}

							//親伝の場所等は入庫として渡されるため出庫にコピーし、入庫情報をクリアする
							copyFromGrToGi(parR);
							clearGrInfo(parR);
							//親伝の金額情報をクリアする
							clearAmtInfo(parR);
						}
					}
					else {
						//未着の場合
						if (MSC_ARR_PTN_TYP.isN_YET_ARR(r.arr_ptn_typ())) {
							//仕入入庫
							parR.io_act_typ(MSC_IO_ACT_TYP.PURC_GR.value());
							parR.par_slip_io_act_typ(parR.io_act_typ());
						}
						else {
							//仕入出庫
							parR.io_act_typ(MSC_IO_ACT_TYP.PURC_GI.value());
							parR.par_slip_io_act_typ(parR.io_act_typ());

							//子伝 仕入入庫
							chdR = parR.clone();
							chdR.io_act_typ(MSC_IO_ACT_TYP.PURC_GR.value());
							chdR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
							chdR.stk_bp_cd(MAC_STR.NULL_VAL.value());
							chdR.temp_ap_flg(parR.getBoolean("org_temp_ap_flg"));

							// 検査済の場合は確定ＮＯをクリアする
							if (MSC_STK_INSP_TYP.isFIN(r.stk_insp_typ())){
								chdR.fix_no_typ(MSC_FIX_NO_TYP.NON.value());
								chdR.fix_no(MAC_STR.NULL_VAL.value());
							}

							//親伝の場所等は入庫として渡されるため出庫にコピーし、入庫情報をクリアする
							copyFromGrToGi(parR);
							clearGrInfo(parR);
							//親伝の金額情報をクリアする
							clearAmtInfo(parR);
						}
					}
				}
				// トランザクション区分:入荷
				else if (MSC_TRN_TYP.isARR(r.trn_typ())) {
					//未着の場合
					if (MSC_ARR_PTN_TYP.isN_YET_ARR(r.arr_ptn_typ())) {
						//仕入転出
						parR.io_act_typ(MSC_IO_ACT_TYP.PURC_XFR_OUT.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());

						//子伝 入荷
						chdR = parR.clone();
						chdR.io_act_typ(MSC_IO_ACT_TYP.ARR.value());
						chdR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());

						// 検査済の場合は確定ＮＯをクリア、そうでない場合は確定ＮＯを入荷実績ＮＯにする
						if (MSC_STK_INSP_TYP.isFIN(r.stk_insp_typ())){
							chdR.fix_no_typ(MSC_FIX_NO_TYP.NON.value());
							chdR.fix_no(MAC_STR.NULL_VAL.value());
						}
						else {
							chdR.fix_no_typ(MSC_FIX_NO_TYP.ARR_ACT_NO.value());
							chdR.fix_no(r.act_no());
						}

						//親伝の場所等は入庫として渡されるため出庫にコピーし、入庫情報をクリアする
						copyFromGrToGi(parR);
						clearGrInfo(parR);
						//親伝の金額情報をクリアする
						clearAmtInfo(parR);
						//未着品の仕入時、ロットＮＯ、サブロットＮＯ、格付区分は未確定文字列になるため、
						//親伝（出庫）のそれらを「**」とする
						parR.lot_no(MSC_PURC_UNFIX_STR.UNFIXED.value());
						parR.sublot_no(MSC_PURC_UNFIX_STR.UNFIXED.value());
						parR.gi_gd_cd(MSC_PURC_UNFIX_STR.UNFIXED.value());
						//未着の仕入時、良品区分は「良品」となるため、
						//親伝（出庫）の良品区分は「良品」とする
						parR.quality_typ(MAC_QUALITY_TYP.GOOD.value());
						//未着の仕入時、積送中在庫は「検査済」となるため、
						//親伝（出庫）の在庫検査区分は「検査済」とする
						parR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
					}
					else {
						//入荷
						parR.io_act_typ(MSC_IO_ACT_TYP.ARR.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());
					}
				}
				// トランザクション区分:支払予定
				else if (MSC_TRN_TYP.isPAY_SCHD(r.trn_typ())) {
					if (!isNull(r.rsn_cd()) && getBizRsn(r.rsn_cd()).xpns_purc_flg()) {
						//経費購買入庫
						parR.io_act_typ(MSC_IO_ACT_TYP.XPNS_PURC_GR.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());
					}
					else if (MAC_PURC_ID_TYP.isONR_RCV(r.purc_id_typ())) {
						//有償受給入庫
						parR.io_act_typ(MSC_IO_ACT_TYP.ONR_RCV_GR.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());
					}
					else {
						//仕入入庫
						parR.io_act_typ(MSC_IO_ACT_TYP.PURC_GR.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());
					}
				}
			}
			// 取引パタン区分:VMI仕入
			else if (MAC_TRD_PTN_TYP.isPURC_VMI(r.trd_ptn_typ())) {
				// トランザクション区分:購買
				if (MSC_TRN_TYP.isPURC(r.trn_typ())) {
					//仕入出庫
					parR.io_act_typ(MSC_IO_ACT_TYP.PURC_GI.value());
					parR.par_slip_io_act_typ(parR.io_act_typ());

					//子伝 入荷
					chdR = parR.clone();
					chdR.io_act_typ(MSC_IO_ACT_TYP.PURC_GR.value());
					chdR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
					chdR.stk_bp_cd(MAC_STR.NULL_VAL.value());
					copyFromGiToGr(chdR);
					clearGiInfo(chdR);
				}
				// トランザクション区分:支払予定
				else if (MSC_TRN_TYP.isPAY_SCHD(r.trn_typ())) {
					//仕入入庫
					parR.io_act_typ(MSC_IO_ACT_TYP.PURC_GR.value());
					parR.par_slip_io_act_typ(parR.io_act_typ());
					parR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
					parR.stk_bp_cd(MAC_STR.NULL_VAL.value());
					copyFromGiToGr(parR);
					clearGiInfo(parR);
				}
			}
			// 取引パタン区分:経費購買
			else if (MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())) {
				// トランザクション区分:購買
				if (MSC_TRN_TYP.isPURC(r.trn_typ())) {

					if (r.accpt_dfct_flg()) {
						//検収不良出庫
						parR.io_act_typ(MSC_IO_ACT_TYP.ACCPT_DFCT_GI.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());

						//子伝 検収不良入庫
						chdR = parR.clone();
						chdR.io_act_typ(MSC_IO_ACT_TYP.ACCPT_DFCT_GR.value());
						chdR.stk_id_typ(MSC_STK_ID_TYP.ACCPT_DFCT.value());

						// 検査済の場合は確定ＮＯをクリアする
						if (MSC_STK_INSP_TYP.isFIN(r.stk_insp_typ())){
							chdR.fix_no_typ(MSC_FIX_NO_TYP.NON.value());
							chdR.fix_no(MAC_STR.NULL_VAL.value());
						}

						//親伝の場所等は入庫として渡されるため出庫にコピーし、入庫情報をクリアする
						copyFromGrToGi(parR);
						clearGrInfo(parR);
					}
					else {
						//未着の場合
						if (MSC_ARR_PTN_TYP.isN_YET_ARR(r.arr_ptn_typ())) {
							//経費購買入庫
							parR.io_act_typ(MSC_IO_ACT_TYP.XPNS_PURC_GR.value());
							parR.par_slip_io_act_typ(parR.io_act_typ());
						}
						else {
							//経費購買出庫
							parR.io_act_typ(MSC_IO_ACT_TYP.XPNS_PURC_GI.value());
							parR.par_slip_io_act_typ(parR.io_act_typ());

							//子伝 経費購買入庫
							chdR = parR.clone();
							chdR.io_act_typ(MSC_IO_ACT_TYP.XPNS_PURC_GR.value());
							chdR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
							chdR.stk_bp_cd(MAC_STR.NULL_VAL.value());

							// 検査済の場合は確定ＮＯをクリアする
							if (MSC_STK_INSP_TYP.isFIN(r.stk_insp_typ())){
								chdR.fix_no_typ(MSC_FIX_NO_TYP.NON.value());
								chdR.fix_no(MAC_STR.NULL_VAL.value());
							}

							//親伝の場所等は入庫として渡されるため出庫にコピーし、入庫情報をクリアする
							copyFromGrToGi(parR);
							clearGrInfo(parR);
							//親伝の金額情報をクリアする
							clearAmtInfo(parR);
						}
					}
				}
				// トランザクション区分:入荷
				else if (MSC_TRN_TYP.isARR(r.trn_typ())) {
					//未着の場合
					if (MSC_ARR_PTN_TYP.isN_YET_ARR(r.arr_ptn_typ())) {
						//仕入転出
						parR.io_act_typ(MSC_IO_ACT_TYP.PURC_XFR_OUT.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());

						//子伝 入荷
						chdR = parR.clone();
						chdR.io_act_typ(MSC_IO_ACT_TYP.ARR.value());
						chdR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());

						// 検査済の場合は確定ＮＯをクリア、そうでない場合は確定ＮＯを入荷実績ＮＯにする
						if (MSC_STK_INSP_TYP.isFIN(r.stk_insp_typ())){
							chdR.fix_no_typ(MSC_FIX_NO_TYP.NON.value());
							chdR.fix_no(MAC_STR.NULL_VAL.value());
						}
						else {
							chdR.fix_no_typ(MSC_FIX_NO_TYP.ARR_ACT_NO.value());
							chdR.fix_no(r.act_no());
						}

						//親伝の場所等は入庫として渡されるため出庫にコピーし、入庫情報をクリアする
						copyFromGrToGi(parR);
						clearGrInfo(parR);
						//親伝の金額情報をクリアする
						clearAmtInfo(parR);
						//未着品の仕入時、ロットＮＯ、サブロットＮＯ、格付区分は未確定文字列になるため、
						//親伝（出庫）のそれらを「**」とする
						parR.lot_no(MSC_PURC_UNFIX_STR.UNFIXED.value());
						parR.sublot_no(MSC_PURC_UNFIX_STR.UNFIXED.value());
						parR.gi_gd_cd(MSC_PURC_UNFIX_STR.UNFIXED.value());
						//未着の仕入時、良品区分は「良品」となるため、
						//親伝（出庫）の良品区分は「良品」とする
						parR.quality_typ(MAC_QUALITY_TYP.GOOD.value());
						//未着の仕入時、積送中在庫は「検査済」となるため、
						//親伝（出庫）の在庫検査区分は「検査済」とする
						parR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
					}
					else {
						//入荷
						parR.io_act_typ(MSC_IO_ACT_TYP.ARR.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());
					}
				}
				// トランザクション区分:支払予定
				else if (MSC_TRN_TYP.isPAY_SCHD(r.trn_typ())) {
					//経費購買入庫
					parR.io_act_typ(MSC_IO_ACT_TYP.XPNS_PURC_GR.value());
					parR.par_slip_io_act_typ(parR.io_act_typ());
				}
			}
			// 取引パタン区分:仕入返品
			else if (MAC_TRD_PTN_TYP.isPURC_RTN(r.trd_ptn_typ())) {
				// トランザクション区分:購買返品
				if (MSC_TRN_TYP.isPURC_RTN(r.trn_typ())) {

					//在庫識別区分:仕入検収前、無償受給、VMI、検収不良の場合
					if (MSC_STK_ID_TYP.isPURC_PRE_ACCPT(r.stk_id_typ())
							|| MSC_STK_ID_TYP.isNCV_RCV(r.stk_id_typ()) 
							|| MSC_STK_ID_TYP.isRNT_RCV(r.stk_id_typ())
							|| MSC_STK_ID_TYP.isACCPT_DFCT(r.stk_id_typ())) {
						//入荷返品
						parR.io_act_typ(MSC_IO_ACT_TYP.ARR_RTN.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());
					}
					else if (!isNull(r.rsn_cd()) && getBizRsn(r.rsn_cd()).xpns_purc_flg()) {

						//経費購買返品出庫
						parR.io_act_typ(MSC_IO_ACT_TYP.XPNS_PURC_RTN_GI.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());
					}
					else if (MAC_PURC_ID_TYP.isONR_RCV(r.purc_id_typ())) {

						//有償受給返品出庫
						parR.io_act_typ(MSC_IO_ACT_TYP.ONR_RCV_RET_GI.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());
					}
					else {
						//仕入返品出庫
						parR.io_act_typ(MSC_IO_ACT_TYP.PURC_RTN_GI.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());
					}
				}
				// トランザクション区分:支払予定
				else if (MSC_TRN_TYP.isPAY_SCHD(r.trn_typ())) {
					if (!isNull(r.rsn_cd()) && getBizRsn(r.rsn_cd()).xpns_purc_flg()) {
						//経費購買返品出庫
						parR.io_act_typ(MSC_IO_ACT_TYP.XPNS_PURC_RTN_GI.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());
					}
					else if (MAC_PURC_ID_TYP.isONR_RCV(r.purc_id_typ())) {
						//有償受給返品出庫
						parR.io_act_typ(MSC_IO_ACT_TYP.ONR_RCV_RET_GI.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());
					}
					else {
						//仕入返品出庫
						parR.io_act_typ(MSC_IO_ACT_TYP.PURC_RTN_GI.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());
					}
				}
			}
			// 取引パタン区分:経費購買返品
			else if (MAC_TRD_PTN_TYP.isPURC_RTN_XPNS(r.trd_ptn_typ())) {
				// トランザクション区分:購買返品
				if (MSC_TRN_TYP.isPURC_RTN(r.trn_typ())) {

					//在庫識別区分:仕入検収前、無償受給、VMI、検収不良の場合
					if (MSC_STK_ID_TYP.isPURC_PRE_ACCPT(r.stk_id_typ())
							|| MSC_STK_ID_TYP.isNCV_RCV(r.stk_id_typ()) 
							|| MSC_STK_ID_TYP.isRNT_RCV(r.stk_id_typ())
							|| MSC_STK_ID_TYP.isACCPT_DFCT(r.stk_id_typ())) {
						//入荷返品
						parR.io_act_typ(MSC_IO_ACT_TYP.ARR_RTN.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());
					}
					else {
						//経費購買返品出庫
						parR.io_act_typ(MSC_IO_ACT_TYP.XPNS_PURC_RTN_GI.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());
					}
				}
				// トランザクション区分:支払予定
				else if (MSC_TRN_TYP.isPAY_SCHD(r.trn_typ())) {
					//経費購買返品出庫
					parR.io_act_typ(MSC_IO_ACT_TYP.XPNS_PURC_RTN_GI.value());
					parR.par_slip_io_act_typ(parR.io_act_typ());
				}
			}
			// 取引パタン区分:仕入値引
			else if (MAC_TRD_PTN_TYP.isPURC_DSCNT(r.trd_ptn_typ())) {
				// トランザクション区分:購買 or 支払予定
				if (MSC_TRN_TYP.isPURC(r.trn_typ()) || MSC_TRN_TYP.isPAY_SCHD(r.trn_typ())) {
					if (MAC_ASSET_MNG_TYP.isMNG(getItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()).asset_mng_typ())) {
						//仕入値引
						parR.io_act_typ(MSC_IO_ACT_TYP.PURC_DSCNT.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());
					}
					else {
						//経費値引
						parR.io_act_typ(MSC_IO_ACT_TYP.XPNS_PURC_DSCNT.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());
					}
				}
			}
			// 取引パタン区分:経費値引
			else if (MAC_TRD_PTN_TYP.isPURC_DSCNT_XPNS(r.trd_ptn_typ())) {
				// トランザクション区分:購買 or 支払予定
				if (MSC_TRN_TYP.isPURC(r.trn_typ()) || MSC_TRN_TYP.isPAY_SCHD(r.trn_typ())) {
					//経費値引
					parR.io_act_typ(MSC_IO_ACT_TYP.XPNS_PURC_DSCNT.value());
					parR.par_slip_io_act_typ(parR.io_act_typ());
				}
			}
			// 取引パタン区分:仕入値増
			else if (MAC_TRD_PTN_TYP.isPURC_XTRA(r.trd_ptn_typ())) {
				// トランザクション区分:購買 or 支払予定
				if (MSC_TRN_TYP.isPURC(r.trn_typ()) || MSC_TRN_TYP.isPAY_SCHD(r.trn_typ())) {
					if (MAC_ASSET_MNG_TYP.isMNG(getItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()).asset_mng_typ())) {
						//仕入値増
						parR.io_act_typ(MSC_IO_ACT_TYP.PURC_XTRA.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());
					}
					else {
						//経費値増
						parR.io_act_typ(MSC_IO_ACT_TYP.XPNS_PURC_XTRA.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());
					}
				}
			}
			// 取引パタン区分:経費値増
			else if (MAC_TRD_PTN_TYP.isPURC_XTRA_XPNS(r.trd_ptn_typ())) {
				// トランザクション区分:購買 or 支払予定
				if (MSC_TRN_TYP.isPURC(r.trn_typ()) || MSC_TRN_TYP.isPAY_SCHD(r.trn_typ())) {
					//経費値増
					parR.io_act_typ(MSC_IO_ACT_TYP.XPNS_PURC_XTRA.value());
					parR.par_slip_io_act_typ(parR.io_act_typ());
				}
			}
			// 取引パタン区分:出荷
			else if (MAC_TRD_PTN_TYP.isSHIP(r.trd_ptn_typ())) {
				// トランザクション区分:出荷
				if (MSC_TRN_TYP.isSHIP(r.trn_typ())) {
					//出荷
					parR.io_act_typ(MSC_IO_ACT_TYP.SHIP_OUT.value());
					parR.par_slip_io_act_typ(parR.io_act_typ());

					//子伝 在庫識別区分:預りでない場合(貸出出荷)
					if (!MSC_STK_ID_TYP.isCSTSTK(r.stk_id_typ())) {
						//着荷
						chdR = parR.clone();
						chdR.io_act_typ(MSC_IO_ACT_TYP.SHIP_IN.value());

						//在庫着荷先は納品先
						chdR.stk_arrv_bp_cd(r.dlv_cd());
						copyFromGiToGr(chdR);
						clearGiInfo(chdR);
					}
				}
			}
			// 取引パタン区分:出荷返品
			else if (MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ())) {
				// トランザクション区分:入荷
				if (MSC_TRN_TYP.isARR(r.trn_typ())) {

					//出荷返品出庫
					parR.io_act_typ(MSC_IO_ACT_TYP.SHIP_RTN_GI.value());
					parR.par_slip_io_act_typ(parR.io_act_typ());

					//貸出返品でない場合は、出庫格付がNULLのため、入庫格付からコピーする
					if (isNull(r.gi_gd_cd())) {
						parR.gi_gd_cd(r.gr_gd_cd());
					}

					//子伝 出荷返品入庫
					chdR = parR.clone();
					chdR.io_act_typ(MSC_IO_ACT_TYP.SHIP_RTN_GR.value());
					//在庫着荷先をクリア
					chdR.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
					//確定ＮＯをクリア
					chdR.fix_no_typ(MSC_FIX_NO_TYP.NON.value());
					chdR.fix_no(MAC_STR.NULL_VAL.value());

					//親伝の入庫情報をクリアする
					clearGrInfo(parR);
				}
			}
			// 取引パタン区分:移動・移送
			else if (MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())) {
				// トランザクション区分:入荷
				if (MSC_TRN_TYP.isARR(r.trn_typ())) {
					//転出
					parR.io_act_typ(MSC_IO_ACT_TYP.XFR_OUT.value());
					parR.par_slip_io_act_typ(parR.io_act_typ());

					//子伝 移動・移送入庫
					chdR = parR.clone();
					chdR.io_act_typ(MSC_IO_ACT_TYP.XFR_GR.value());
					chdR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
				}
				// トランザクション区分:出荷
				else if (MSC_TRN_TYP.isSHIP(r.trn_typ())) {

					//配送先経由区分:経由する場合
					if (MAC_VIA_DLV_TYP.isVIA(r.via_dlv_typ())) {
						//出荷
						parR.io_act_typ(MSC_IO_ACT_TYP.SHIP_OUT.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());

						//子伝 着荷
						chdR = parR.clone();
						chdR.io_act_typ(MSC_IO_ACT_TYP.SHIP_IN.value());

						//在庫着荷先に配送先を設定
						chdR.stk_arrv_bp_cd(r.tdlv_cd());
						copyFromGiToGr(chdR);
						clearGiInfo(chdR);
					}
					else {
						//移動・移送出庫
						parR.io_act_typ(MSC_IO_ACT_TYP.XFR_GI.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());

						//子伝 転入
						chdR = parR.clone();
						chdR.io_act_typ(MSC_IO_ACT_TYP.XFR_IN.value());
						chdR.in_xfr_typ(MSC_IN_XFR_TYP.IN_XFR.value());
						//出庫格付ＣＤから入庫格付ＣＤへコピーする
						chdR.gr_gd_cd(r.gi_gd_cd());
						chdR.gi_gd_cd(null);
						}
				}
				// トランザクション区分:インボイス出荷
				else if (MSC_TRN_TYP.isIV_SHIP(r.trn_typ())) {
					//移動・移送出庫
					parR.io_act_typ(MSC_IO_ACT_TYP.XFR_GI.value());
					parR.par_slip_io_act_typ(parR.io_act_typ());

					//子伝 転入
					chdR = parR.clone();
					chdR.io_act_typ(MSC_IO_ACT_TYP.XFR_IN.value());
					chdR.in_xfr_typ(MSC_IN_XFR_TYP.IN_XFR.value());
					//出庫格付ＣＤから入庫格付ＣＤへコピーする
					chdR.gr_gd_cd(r.gi_gd_cd());
					chdR.gi_gd_cd(null);

					//在庫着荷先をNULL文字にする
					chdR.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
				}
				// トランザクション区分:移動
				else if (MSC_TRN_TYP.isXFR(r.trn_typ())) {
					//移動・移送出庫
					parR.io_act_typ(MSC_IO_ACT_TYP.XFR_GI.value());
					parR.par_slip_io_act_typ(parR.io_act_typ());

					//検査済でない場合はUpd01で在庫情報から確定ＮＯを特定する際、
					//子伝を作成するため、ここでは作成しない
					if (MSC_STK_INSP_TYP.isFIN(parR.stk_insp_typ()) && !MSC_STK_ID_TYP.isPURC_PRE_ACCPT(parR.stk_id_typ())) {

						//子伝 移動・移送入庫
						chdR = parR.clone();
						chdR.io_act_typ(MSC_IO_ACT_TYP.XFR_GR.value());
					}
				}
			}
			// 取引パタン区分:移動・移送返品
			else if (MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())) {
				// トランザクション区分:入荷
				if (MSC_TRN_TYP.isARR(r.trn_typ())) {
					//転出
					parR.io_act_typ(MSC_IO_ACT_TYP.XFR_OUT.value());
					parR.par_slip_io_act_typ(parR.io_act_typ());

					//子伝 移動・移送返品入庫
					chdR = parR.clone();
					chdR.io_act_typ(MSC_IO_ACT_TYP.XFR_RTN_GR.value());
					chdR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
				}
				// トランザクション区分:出荷
				else if (MSC_TRN_TYP.isSHIP(r.trn_typ())) {
					//配送先経由区分:経由する場合
					if (MAC_VIA_DLV_TYP.isVIA(r.via_dlv_typ())) {
						//出荷
						parR.io_act_typ(MSC_IO_ACT_TYP.SHIP_OUT.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());

						//子伝 着荷
						chdR = parR.clone();
						chdR.io_act_typ(MSC_IO_ACT_TYP.SHIP_IN.value());

						//在庫着荷先に配送先を設定
						chdR.stk_arrv_bp_cd(r.tdlv_cd());
						copyFromGiToGr(chdR);
						clearGiInfo(chdR);
					}
					else {
						//移動・移送返品出庫
						parR.io_act_typ(MSC_IO_ACT_TYP.XFR_RTN_GI.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());

						//子伝 転入
						chdR = parR.clone();
						chdR.io_act_typ(MSC_IO_ACT_TYP.XFR_IN.value());
						chdR.in_xfr_typ(MSC_IN_XFR_TYP.IN_XFR.value());
					}
				}
				// トランザクション区分:インボイス出荷
				else if (MSC_TRN_TYP.isIV_SHIP(r.trn_typ())) {
					//移動・移送返品出庫
					parR.io_act_typ(MSC_IO_ACT_TYP.XFR_RTN_GI.value());
					parR.par_slip_io_act_typ(parR.io_act_typ());

					//子伝 転入
					chdR = parR.clone();
					chdR.io_act_typ(MSC_IO_ACT_TYP.XFR_IN.value());
					chdR.in_xfr_typ(MSC_IN_XFR_TYP.IN_XFR.value());
					//出庫格付ＣＤから入庫格付ＣＤへコピーする
					chdR.gr_gd_cd(r.gi_gd_cd());
					chdR.gi_gd_cd(null);

					//在庫着荷先をNULL文字にする
					chdR.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
				}
				// トランザクション区分:移動
				else if (MSC_TRN_TYP.isXFR(r.trn_typ())) {
					//移動・移送返品出庫
					parR.io_act_typ(MSC_IO_ACT_TYP.XFR_RTN_GI.value());
					parR.par_slip_io_act_typ(parR.io_act_typ());

					//子伝  移動・移送返品入庫
					chdR = parR.clone();
					chdR.io_act_typ(MSC_IO_ACT_TYP.XFR_RTN_GR.value());
				}
			}
			// 取引パタン区分:支給
			else if (MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())) {
				// トランザクション区分:入荷
				if (MSC_TRN_TYP.isARR(r.trn_typ())) {
					//転出
					parR.io_act_typ(MSC_IO_ACT_TYP.XFR_OUT.value());
					parR.par_slip_io_act_typ(parR.io_act_typ());

					//子伝 移動・移送入庫
					chdR = parR.clone();
					chdR.io_act_typ(MSC_IO_ACT_TYP.XFR_GR.value());
					chdR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
				}
				// トランザクション区分:出荷
				else if (MSC_TRN_TYP.isSHIP(r.trn_typ())) {
					//配送先経由区分:経由する場合
					if (MAC_VIA_DLV_TYP.isVIA(r.via_dlv_typ())) {
						//出荷
						parR.io_act_typ(MSC_IO_ACT_TYP.SHIP_OUT.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());

						//子伝 着荷
						chdR = parR.clone();
						chdR.io_act_typ(MSC_IO_ACT_TYP.SHIP_IN.value());

						//在庫着荷先に配送先を設定
						chdR.stk_arrv_bp_cd(r.tdlv_cd());
						copyFromGiToGr(chdR);
						clearGiInfo(chdR);
					}
					else {
						//移動・移送出庫
						parR.io_act_typ(MSC_IO_ACT_TYP.XFR_GI.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());

						//子伝 転入
						chdR = parR.clone();
						chdR.io_act_typ(MSC_IO_ACT_TYP.XFR_IN.value());
						chdR.in_xfr_typ(MSC_IN_XFR_TYP.IN_XFR.value());
						//出庫格付ＣＤから入庫格付ＣＤへコピーする
						chdR.gr_gd_cd(r.gi_gd_cd());
						chdR.gi_gd_cd(null);
					}
				}
				// トランザクション区分:インボイス出荷
				else if (MSC_TRN_TYP.isIV_SHIP(r.trn_typ())) {
					//移動・移送出庫
					parR.io_act_typ(MSC_IO_ACT_TYP.XFR_GI.value());
					parR.par_slip_io_act_typ(parR.io_act_typ());

					//子伝 転入
					chdR = parR.clone();
					chdR.io_act_typ(MSC_IO_ACT_TYP.XFR_IN.value());
					chdR.in_xfr_typ(MSC_IN_XFR_TYP.IN_XFR.value());
					//出庫格付ＣＤから入庫格付ＣＤへコピーする
					chdR.gr_gd_cd(r.gi_gd_cd());
					chdR.gi_gd_cd(null);

					//在庫着荷先をNULL文字にする
					chdR.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
				}
				// トランザクション区分:移動
				else if (MSC_TRN_TYP.isXFR(r.trn_typ())) {
					//移動・移送出庫
					parR.io_act_typ(MSC_IO_ACT_TYP.XFR_GI.value());
					parR.par_slip_io_act_typ(parR.io_act_typ());

					//子伝 移動・移送入庫
					chdR = parR.clone();
					chdR.io_act_typ(MSC_IO_ACT_TYP.XFR_GR.value());
				}
				// トランザクション区分:支給
				else if (MSC_TRN_TYP.isPROV(r.trn_typ())) {
					//支給区分:有償支給の場合
					if (MAC_PROV_TYP.isONR_PROV(r.prov_typ())) {
						//有償支給出庫
						parR.io_act_typ(MSC_IO_ACT_TYP.ONR_PROV_GI.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());

						//子伝 有償支給入庫
						chdR = parR.clone();
						chdR.io_act_typ(MSC_IO_ACT_TYP.ONR_PROV_GR.value());
						//在庫着荷先、在庫取引先に発注先を設定
						chdR.stk_arrv_bp_cd(r.sppl_cd());
						chdR.stk_bp_cd(r.sppl_cd());
						chdR.stk_id_typ(MSC_STK_ID_TYP.ONR_PROV.value());
						copyFromGiToGr(chdR);
						clearGiInfo(chdR);

						//親伝の金額情報をクリア
						clearAmtInfo(parR);
					}
					else {
						//無償支給出庫
						parR.io_act_typ(MSC_IO_ACT_TYP.FFR_PROV_GI.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());

						//子伝 無償支給入庫
						chdR = parR.clone();
						chdR.io_act_typ(MSC_IO_ACT_TYP.FFR_PROV_GR.value());
						//在庫着荷先に発注先を設定
						chdR.stk_arrv_bp_cd(r.sppl_cd());
						copyFromGiToGr(chdR);
						clearGiInfo(chdR);
					}
				}
			}
			// 取引パタン区分:支給返品
			else if (MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
				// トランザクション区分:入荷
				if (MSC_TRN_TYP.isARR(r.trn_typ())) {
					//転出
					parR.io_act_typ(MSC_IO_ACT_TYP.XFR_OUT.value());
					parR.par_slip_io_act_typ(parR.io_act_typ());

					//子伝 移動・移送返品入庫
					chdR = parR.clone();
					chdR.io_act_typ(MSC_IO_ACT_TYP.XFR_RTN_GR.value());
					chdR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
				}
				// トランザクション区分:出荷
				else if (MSC_TRN_TYP.isSHIP(r.trn_typ())) {
					//移動・移送返品出庫
					parR.io_act_typ(MSC_IO_ACT_TYP.XFR_RTN_GI.value());
					parR.par_slip_io_act_typ(parR.io_act_typ());

					//子伝 転入
					chdR = parR.clone();
					chdR.io_act_typ(MSC_IO_ACT_TYP.XFR_IN.value());
					chdR.in_xfr_typ(MSC_IN_XFR_TYP.IN_XFR.value());
				}
				// トランザクション区分:移動
				else if (MSC_TRN_TYP.isXFR(r.trn_typ())) {
					//移動・移送返品出庫
					parR.io_act_typ(MSC_IO_ACT_TYP.XFR_RTN_GI.value());
					parR.par_slip_io_act_typ(parR.io_act_typ());

					//子伝  移動・移送返品入庫
					chdR = parR.clone();
					chdR.io_act_typ(MSC_IO_ACT_TYP.XFR_RTN_GR.value());
				}
				// トランザクション区分:支給
				else if (MSC_TRN_TYP.isPROV(r.trn_typ())) {
					//支給区分:有償支給の場合
					if (MAC_PROV_TYP.isONR_PROV(r.prov_typ())) {
						//有償支給返品出庫
						parR.io_act_typ(MSC_IO_ACT_TYP.ONR_PROV_RTN_GI.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());

						//子伝 有償支給返品入庫
						chdR = parR.clone();
						chdR.io_act_typ(MSC_IO_ACT_TYP.ONR_PROV_RTN_GR.value());
						//在庫着荷先、在庫取引先をクリア
						chdR.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
						chdR.stk_bp_cd(MAC_STR.NULL_VAL.value());
						chdR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
						copyFromGiToGr(chdR);
						clearGiInfo(chdR);
						//子伝の金額情報をクリア
						clearAmtInfo(chdR);
					}
					else {
						//無償支給返品出庫
						parR.io_act_typ(MSC_IO_ACT_TYP.FFR_PROV_RTN_GI.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());

						//子伝 無償支給返品入庫
						chdR = parR.clone();
						chdR.io_act_typ(MSC_IO_ACT_TYP.FFR_PROV_RTN_GR.value());
						//在庫着荷先をクリア
						chdR.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
						copyFromGiToGr(chdR);
						clearGiInfo(chdR);
					}
				}
			}
			// 取引パタン区分:入荷
			else if (MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ())) {
				// トランザクション区分:入荷
				if (MSC_TRN_TYP.isARR(r.trn_typ())) {
					parR.io_act_typ(MSC_IO_ACT_TYP.ARR.value());
					parR.par_slip_io_act_typ(parR.io_act_typ());
				}
			}
			// 取引パタン区分:他勘定入庫
			else if (MAC_TRD_PTN_TYP.isSTK_OTH_GR(r.trd_ptn_typ())) {
				// トランザクション区分:他勘定振替
				if (MSC_TRN_TYP.isACXFR(r.trn_typ())) {
					//他勘定振替入庫
					parR.io_act_typ(MSC_IO_ACT_TYP.ACXFR_GR.value());
					parR.par_slip_io_act_typ(parR.io_act_typ());
				}
			}
			// 取引パタン区分:他勘定出庫
			else if (MAC_TRD_PTN_TYP.isSTK_OTH_GI(r.trd_ptn_typ())) {
				// トランザクション区分:他勘定振替
				if (MSC_TRN_TYP.isACXFR(r.trn_typ())) {
					//他勘定振替出庫
					parR.io_act_typ(MSC_IO_ACT_TYP.ACXFR_GI.value());
					parR.par_slip_io_act_typ(parR.io_act_typ());
				}
			}
			// 取引パタン区分:廃棄
			else if (MAC_TRD_PTN_TYP.isSCRP(r.trd_ptn_typ())) {
				// トランザクション区分:他勘定振替
				if (MSC_TRN_TYP.isACXFR(r.trn_typ())) {
					//廃棄
					parR.io_act_typ(MSC_IO_ACT_TYP.SCRP.value());
					parR.par_slip_io_act_typ(parR.io_act_typ());
				}
			}
			// 取引パタン区分:品目振替
			else if (MAC_TRD_PTN_TYP.isXFR_ITM(r.trd_ptn_typ())) {
				// トランザクション区分:在庫振替
				if (MSC_TRN_TYP.isSTK_XFR(r.trn_typ())) {

					if (MSC_IO_TYP.isGI(r.io_typ())){
						//受払区分:品目振替出庫
						parR.io_act_typ(MSC_IO_ACT_TYP.XFR_ITM_GI.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());
					}
					else if (MSC_IO_TYP.isGR(r.io_typ())){
						//受払区分:品目振替入庫
						parR.io_act_typ(MSC_IO_ACT_TYP.XFR_ITM_GR.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());
					}
				}
			}
			// 取引パタン区分:ロット・手配ＮＯ振替
			else if (MAC_TRD_PTN_TYP.isXFR_LOT_SNO(r.trd_ptn_typ())) {
				// トランザクション区分:在庫振替
				if (MSC_TRN_TYP.isSTK_XFR(r.trn_typ())) {

					if (MSC_IO_TYP.isGI(r.io_typ())){
						//受払区分:ロット・手配ＮＯ振替出庫
						parR.io_act_typ(MSC_IO_ACT_TYP.XFR_LOT_SNO_GI.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());
					}
					else if (MSC_IO_TYP.isGR(r.io_typ())){
						//受払区分:格付・良品区分振替入庫
						parR.io_act_typ(MSC_IO_ACT_TYP.XFR_LOT_SNO_GR.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());
					}
				}
			}
			// 取引パタン区分:格付・良品区分振替
			else if (MAC_TRD_PTN_TYP.isXFR_GRD(r.trd_ptn_typ())) {
				// トランザクション区分:在庫振替
				if (MSC_TRN_TYP.isSTK_XFR(r.trn_typ())) {

					if (MSC_IO_TYP.isGI(r.io_typ())){
						//受払区分:格付・良品区分振替出庫
						parR.io_act_typ(MSC_IO_ACT_TYP.XFR_GRD_GI.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());
					}
					else if (MSC_IO_TYP.isGR(r.io_typ())){
						//受払区分:格付・良品区分振替入庫
						parR.io_act_typ(MSC_IO_ACT_TYP.XFR_GRD_GR.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());
					}
				}
			}
			// 取引パタン区分:荷姿振替
			else if (MAC_TRD_PTN_TYP.isXFR_PACK(r.trd_ptn_typ())) {
				// トランザクション区分:在庫振替
				if (MSC_TRN_TYP.isSTK_XFR(r.trn_typ())) {

					if (MSC_IO_TYP.isGI(r.io_typ())){
						//受払区分:荷姿振替出庫
						parR.io_act_typ(MSC_IO_ACT_TYP.XFR_PACK_GI.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());
					}
					else if (MSC_IO_TYP.isGR(r.io_typ())){
						//受払区分:荷姿振替入庫
						parR.io_act_typ(MSC_IO_ACT_TYP.XFR_PACK_GR.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());
					}
				}
			}
			// 取引パタン区分:棚卸
			else if (MAC_TRD_PTN_TYP.isSTK_ADJST(r.trd_ptn_typ())) {
				// トランザクション区分:棚卸
				if (MSC_TRN_TYP.isSTK_ADJST(r.trn_typ())) {

					if (MSC_IO_TYP.isGI(r.io_typ())){
						//受払区分:棚卸差異減耗
						parR.io_act_typ(MSC_IO_ACT_TYP.STK_ADJST_GI.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());
					}
					else if (MSC_IO_TYP.isGR(r.io_typ())){
						//受払区分:棚卸差異増耗
						parR.io_act_typ(MSC_IO_ACT_TYP.STK_ADJST_GR.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());
					}
				}
			}
			// 取引パタン区分:検査
			else if (MAC_TRD_PTN_TYP.isINSP(r.trd_ptn_typ())) {
				// トランザクション区分:検査着手
				if (MSC_TRN_TYP.isINSP_STT(r.trn_typ())) {

					if (MSC_IO_TYP.isGI(r.io_typ())){
						//受払区分:検査出庫
						parR.io_act_typ(MSC_IO_ACT_TYP.INSP_GI.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());
					}
					else if (MSC_IO_TYP.isGR(r.io_typ())){
						//受払区分:検査入庫
						parR.io_act_typ(MSC_IO_ACT_TYP.INSP_GR.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());
					}
				}
				// トランザクション区分:検査実績
				else if (MSC_TRN_TYP.isINSP_ACT(r.trn_typ())) {

					if (MSC_IO_TYP.isGI(r.io_typ())){
						//受払区分:検査完了出庫
						parR.io_act_typ(MSC_IO_ACT_TYP.INSP_CMPL_GI.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());
					}
					else if (MSC_IO_TYP.isGR(r.io_typ())){
						//受払区分:検査完了入庫
						parR.io_act_typ(MSC_IO_ACT_TYP.INSP_CMPL_GR.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());
					}
				}
				// トランザクション区分:検査判定
				else if (MSC_TRN_TYP.isINSP_JUDG(r.trn_typ())) {

					if (MSC_IO_TYP.isGI(r.io_typ())){
						//受払区分:検査判定出庫
						parR.io_act_typ(MSC_IO_ACT_TYP.INSP_JUDG_GI.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());
					}
					else if (MSC_IO_TYP.isGR(r.io_typ())){
						//受払区分:検査判定入庫
						parR.io_act_typ(MSC_IO_ACT_TYP.INSP_JUDG_GR.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());
					}
				}
			}
			// 取引パタン区分:再検査
			else if (MAC_TRD_PTN_TYP.isREINSP(r.trd_ptn_typ())) {
				// トランザクション区分:検査予定
				if (MSC_TRN_TYP.isINSP_SCHD(r.trn_typ())) {

					if (MSC_IO_TYP.isGI(r.io_typ())){
						//受払区分:再検査出庫
						parR.io_act_typ(MSC_IO_ACT_TYP.REINSP_GI.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());
					}
					else if (MSC_IO_TYP.isGR(r.io_typ())){
						//受払区分:再検査入庫
						parR.io_act_typ(MSC_IO_ACT_TYP.REINSP_GR.value());
						parR.par_slip_io_act_typ(parR.io_act_typ());
					}
				}
			}
			// 取引パタン区分:検査抜取
			else if (MAC_TRD_PTN_TYP.isINSP_SMPL(r.trd_ptn_typ())) {
				// トランザクション区分:検査抜取
				if (MSC_TRN_TYP.isINSP_SMPL(r.trn_typ())) {
					//受払区分:検査抜取
					parR.io_act_typ(MSC_IO_ACT_TYP.INSP_SMPL_GI.value());
					parR.par_slip_io_act_typ(parR.io_act_typ());
				}
			}

			if (isNull(parR.io_act_typ())) {
				throw new MCAppException(r, null, MSBEL0152, r.trd_ptn_typ(), r.trn_typ());
			}
			else {
				//親伝の追加
				dbc.add(parR);

				//子伝が存在すれば子伝の追加
				if (!isNull(chdR)) {
					dbc.add(chdR);
				}
			}
		}

		protected void copyFromGiToGr (MSW_IO_ACT_R insR) {
			insR.gr_wg_cd(insR.gi_wg_cd());
			insR.gr_loc_cd(insR.gi_loc_cd());
			insR.gr_str_ln_cd(insR.gi_str_ln_cd());
			insR.gr_gd_cd(insR.gi_gd_cd());
		}

		protected void copyFromGrToGi (MSW_IO_ACT_R insR) {
			insR.gi_wg_cd(insR.gr_wg_cd());
			insR.gi_loc_cd(insR.gr_loc_cd());
			insR.gi_str_ln_cd(insR.gr_str_ln_cd());
			insR.gi_gd_cd(insR.gr_gd_cd());
		}

		protected void clearGiInfo (MSW_IO_ACT_R insR) {
			insR.gi_wg_cd(null);
			insR.gi_loc_cd(null);
			insR.gi_str_ln_cd(null);
			insR.gi_gd_cd(null);
		}

		protected void clearGrInfo (MSW_IO_ACT_R insR) {
			insR.gr_wg_cd(null);
			insR.gr_loc_cd(null);
			insR.gr_str_ln_cd(null);
			insR.gr_gd_cd(null);
		}
		protected void clearAmtInfo (MSW_IO_ACT_R insR) {

			insR.trd_cur_cd(null);
			insR.trd_cur_upri(null);
			insR.trd_cur_amt(null);
			insR.trd_cur_proc_amt(null);
			insR.trd_cur_onr_prov_amt(null);
			insR.trd_cur_tax_amt(null);
			insR.base_cur_cd(null);
			insR.base_cur_upri(null);
			insR.base_cur_amt(null);
			insR.base_cur_proc_amt(null);
			insR.base_cur_onr_prov_amt(null);
			insR.base_cur_tax_amt(null);
			insR.ptax_cur_cd(null);
			insR.ptax_cur_upri(null);
			insR.ptax_cur_amt(null);
			insR.ptax_cur_proc_amt(null);
			insR.ptax_cur_onr_prov_amt(null);
			insR.ptax_cur_tax_amt(null);
			insR.tax_cd(null);
			insR.xrate_cd(null);
			insR.xrate(null);
			insR.ptax_xrate_cd(null);
			insR.ptax_xrate(null);
			insR.wtax_rate(null);
			insR.wtax_amt(null);
		}

		public void setLotSv(MSBFL_LotService.Lot_Upd01 opLot, MCList<MSW_IO_ACT_R> dbc) {

			for (MSW_IO_ACT_R r: dbc) {
				if (isUpdLot(r)) {
					Lot_Upd01_CndR up = Lot_Upd01_CndR.create();
					copy(up, r, createMap_Lot_Upd01_CndR_MSW_IO_ACT_R());
					up.schd_flg(false);
					opLot.up0().add(up);
				}
			}
		}

		protected boolean isUpdLot(MSW_IO_ACT_R r) {

			if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
				return false;
			}
			if (!MSC_IO_TYP.isGR(MSC_IO_ACT_TYP.io_typ(r.io_act_typ()))) {
				return false;
			}
			if (!MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())) {
				return false;
			}
			if (MSC_IO_ACT_TYP.isPURC_GR(r.io_act_typ()) 
					|| MSC_IO_ACT_TYP.isONR_RCV_GR(r.io_act_typ())
						|| MSC_IO_ACT_TYP.isXPNS_PURC_GR(r.io_act_typ())) {
				return false;
			}
			return true;
		}

		protected Map_Lot_Upd01_CndR_MSW_IO_ACT_R<Lot_Upd01_CndR,MSW_IO_ACT_R> createMap_Lot_Upd01_CndR_MSW_IO_ACT_R() {
			return new Map_Lot_Upd01_CndR_MSW_IO_ACT_R<Lot_Upd01_CndR, MSW_IO_ACT_R>();
		}

		public class Map_Lot_Upd01_CndR_MSW_IO_ACT_R<D extends Lot_Upd01_CndR, S extends MSW_IO_ACT_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Lot_Upd01_CndR.$itm_cd, MSW_IO_ACT_R.$itm_cd);
				addColumnPathMap(Lot_Upd01_CndR.$itm_sub1, MSW_IO_ACT_R.$itm_sub1);
				addColumnPathMap(Lot_Upd01_CndR.$itm_sub2, MSW_IO_ACT_R.$itm_sub2);
				addColumnPathMap(Lot_Upd01_CndR.$itm_sub3, MSW_IO_ACT_R.$itm_sub3);
				addColumnPathMap(Lot_Upd01_CndR.$lot_no, MSW_IO_ACT_R.$lot_no);
				addColumnPathMap(Lot_Upd01_CndR.$sublot_no, MSW_IO_ACT_R.$sublot_no);
				addColumnPathMap(Lot_Upd01_CndR.$loc_cd, MSW_IO_ACT_R.$strg_loc_cd);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				if (MSC_TRN_TYP.isYIELD(src.trn_typ())) {
					dest.mfg_loc_cd(src.gr_loc_cd());
				}
				else if (MSC_TRN_TYP.isARR(src.trn_typ())) {
					dest.arr_act_no(src.act_no());
				}
				if (!isNull(src.act_tm())) {
					dest.base_dt(src.act_tm().trunc(MCDateFieldType.DAY));
				}
			}
		}

		// デバッグ用ログ出力
		protected void writeUpLog(MCList<IoAct_Ins01_DtlR> up0) {
			if (!_debug_log) return;
			MCLog.developDebug("============MSBEL5010:IO_ACT up0 START============");
			MCLog.developDebug((String.join("	", up0.createRow().getColumnPathArray())).replaceAll("wia.", ""));
			MCLog.developDebug(up0.toString().replaceAll(",", "	"));
			MCLog.developDebug("============MSBEL5010:IO_ACT up0 END============");
		}
	}

	protected static final Class<MSBEL_IoActService> CLAZZ = MSBEL_IoActService.class;

	protected static void doMasterCache(MCList<IoAct_Ins01_DtlR> up0) {
		initBizRsnCache(up0);
		initItmCache(up0);
	}

	// 業務理由マスタ
	protected FXUCL_MCDbcCache<MAM_BIZ_RSN_R> _bizRsnCache = null;

	protected static void initBizRsnCache(MCList<IoAct_Ins01_DtlR> up0) {
		object(CLAZZ)._initBizRsnCache(up0);
	}

	protected void _initBizRsnCache(MCList<IoAct_Ins01_DtlR> up0) {
		
		MAM_BIZ_RSN_R t = MAM_BIZ_RSN_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.biz_rsn_cd, t.ac_rsn_cd, t.xpns_purc_flg, t.sls_acxfr_flg,
				t.acxfr_gi_flg, t.acxfr_gr_flg, t.loss_flg, t.not_lot_trace_flg,
				t.purc_dscnt_loc_mng_typ);

		_bizRsnCache = new FXUCL_MCDbcCache<MAM_BIZ_RSN_R>(dbc_bldr, up0,
				IoAct_Ins01_DtlR.$rsn_cd);
	}

	protected static FXUCL_MCDbcCache<MAM_BIZ_RSN_R> getbizRsnCache() {
		return object(CLAZZ)._bizRsnCache;
	}

	protected static MAM_BIZ_RSN_R getBizRsn(String bizRsnCd) {
		return object(CLAZZ)._getBizRsn(bizRsnCd);
	}
	protected MAM_BIZ_RSN_R _getBizRsn(String bizRsnCd) {
		return _bizRsnCache.get(bizRsnCd);
	}

	// 品目マスタ
	protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache = null;

	protected static void initItmCache(MCList<IoAct_Ins01_DtlR> up0) {
		object(CLAZZ)._initItmCache(up0);
	}

	protected void _initItmCache(MCList<IoAct_Ins01_DtlR> wkL) {
		//親品目
		MCList<IoAct_Ins01_DtlR> lst = wkL.groupBy(IoAct_Ins01_DtlR.$par_itm_cd,
				IoAct_Ins01_DtlR.$par_itm_sub1,IoAct_Ins01_DtlR.$par_itm_sub2,IoAct_Ins01_DtlR.$par_itm_sub3);

		for (IoAct_Ins01_DtlR r : lst) {
			r.itm_cd(r.par_itm_cd());
			r.itm_sub1(r.par_itm_sub1());
			r.itm_sub2(r.par_itm_sub2());
			r.itm_sub3(r.par_itm_sub3());
		}
		//子品目
		lst.addAll(wkL.groupBy(IoAct_Ins01_DtlR.$itm_cd,
				IoAct_Ins01_DtlR.$itm_sub1,IoAct_Ins01_DtlR.$itm_sub2,IoAct_Ins01_DtlR.$itm_sub3));

		MAM_ITM_R t = MAM_ITM_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.itm_nm, t.asset_mng_typ, t.stk_mng_typ, t.sundry_itm_flg,
				t.ac_itm_grp_cd, t.itm_jnl_cd, t.minus_stk_flg, t.gi_alloc_flg,
				t.dec_place, t.rnd_typ);
		_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(dbc_bldr, lst,
				IoAct_Ins01_DtlR.$itm_cd, IoAct_Ins01_DtlR.$itm_sub1,
				IoAct_Ins01_DtlR.$itm_sub2, IoAct_Ins01_DtlR.$itm_sub3);
	}

	protected static FXUCL_MCDbcCache<MAM_ITM_R> getItmCache() {
		return object(CLAZZ)._itmCache;
	}

	protected static MAM_ITM_R getItm(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
		return object(CLAZZ)._getItm(itmCd, itmSub1, itmSub2, itmSub3);
	}

	protected MAM_ITM_R _getItm(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
		return _itmCache.get(itmCd, itmSub1, itmSub2, itmSub3);
	}

	/**
	 * IoAct_Upd01オペレーション.<p>
	 *
	 * 受払実績を作成する<br>
	 */
	public class IoAct_Upd01 extends MSBEL_IoActService_MC_A.IoAct_Upd01 {

		protected FXUCL_MCDbcCache<MAM_SUNDRY_ITM_R> _sundryItmCache = null;
		protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _itmUnitCache = null;
		protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _itmUnitStkCache = null;

		protected FXUCL_MCDbcCache<MAM_LOC_R> _locCache = null;
		protected MCList<IoAct_Upd01_DtlR> _locDptCache = null;
		protected MCIndexKey _locDptIdx = null;
		protected FXUCL_MCDbcCache<MAM_BP_R> _bpCache = null;
		protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _bdDptCache = null;

		protected FXUCL_MCDbcCache<MSVT_OUTSRC_INFO_R> _outsrcInfoCache = null;
		protected MCList<IoAct_Upd01_DtlR> _locDptOutsrcCache = null;
		protected MCIndexKey _locDptOutsrcIdx = null;

		protected FXUCL_MCDbcCache<MST_MFG_INST_R> _outsrcInfoMfgInstNoCacheL = null;
		protected MCList<IoAct_Upd01_DtlR> _locDptOutsrcMfgInstNoCache = null;
		protected MCIndexKey _locDptOutsrcMfgInstNoIdx = null;

		// 元伝取得用リスト
		protected MCList<MST_IO_ACT_R> _cclIoActCacheL = MCList.create(MST_IO_ACT_R.class);
		protected MST_IO_ACT_R _cclIoActCacheL_t = MST_IO_ACT_R.create("T");
		protected MCQueryApiBuilder _cclIoActCacheL_bldr = MCQueryApiBuilder.create(_cclIoActCacheL_t);
		
		protected MCIndexKey _cclIoActNoIoTypIdx = null;
		protected MCIndexKey _cclIoActWithIoTypIdx = null;
		// ロット取消用リスト
		protected MCList<IoAct_Upd01_DtlR> _lotDelL = MCList.create(IoAct_Upd01_DtlR.class);
		// 荷姿振替用リスト
		protected MCList<IoAct_Upd01_DtlR> _packXfrL = MCList.create(IoAct_Upd01_DtlR.class);
		// 検査中（移動・棚卸）用リスト
		protected MCList<IoAct_Upd01_DtlR> _inspL = MCList.create(IoAct_Upd01_DtlR.class);
		// 在庫入出庫用リスト
		protected MCList<IoAct_Upd01_DtlR> _stkIoL = MCList.create(IoAct_Upd01_DtlR.class);
		// 入出庫加味在庫リスト
		protected MCList<MST_STK_R> _stkL = MCList.create(MST_STK_R.class);
		protected MST_STK_R _stkL_t = MST_STK_R.create("T");
		MCIndexKey _stkIdx2 = null;
		// 月次受払在庫チェック用のリスト
		protected MCList<MST_MLY_STK_DTL_R> _mlyStkL = MCList.create(MST_MLY_STK_DTL_R.class);
		MCIndexKey _mlyStkIdx = null;

		protected MCIndexKey _ioActIdx = null; //ヘッダ実績ＮＯ、明細実績ＮＯ、トランザクション区分
		protected MCIndexKey _ioActIdxUpdL = null; //ヘッダ実績ＮＯ、明細実績ＮＯ、トランザクション区分、受払区分、伝票状況区分
		MCMessageList _msgList;

		protected boolean _lot_chk_off_flg = false;
		public void setLotChkFlg(boolean lot_chk_off_flg) {
			this._lot_chk_off_flg = lot_chk_off_flg;
		}

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			_msgList = new MCMessageList();
			_cclIoActCacheL = null;

			// 受払実績ワークからデータを取得
			MCList<MSW_IO_ACT_R> selectL = MCList.create(MSW_IO_ACT_R.class);
			selectMSW_IO_ACT(selectL);

			MCList<IoAct_Upd01_DtlR> wkL = MCList.create(IoAct_Upd01_DtlR.class);
			copyL(selectL, wkL);
// ワークの値をログに出す（デバッグ用）
			writeWkLog(wkL);

			//データキャッシュ
			createDataCache(wkL);

			//受払時の補完
			MCList<IoAct_Upd01_DtlR> rowsList = MCList.create(IoAct_Upd01_DtlR.class);
			cmplL(wkL, rowsList);

			//更新用データを作成
			MCList<IoAct_Upd01_DtlR> updL = MCList.create(IoAct_Upd01_DtlR.class);
			createUpdList(rowsList, updL);

			//検査中在庫移動・棚卸
			setFixNoInsp(updL);

			//出庫時荷姿振替
			setGiPackXfr(updL);

			//伝票ＮＯの設定
			setSlipNo(updL);

// 更新リストの値をログに出す（デバッグ用）
			writeUpdLLog(updL);

			updMain(updL);
			// 受払実績ワークを削除する
			MSW_IO_ACT_R S0 = MSW_IO_ACT_R.create();
			execDbWkDelete("MSBEL5010_MSW_IO_ACT_D01", S0);
		}

		protected void setGiPackXfr(MCList<IoAct_Upd01_DtlR> updL) {
			//投入、ロス、移送移動出庫、他勘定出庫、出荷(移動・移送返品以外)で出庫場所が出庫時荷姿振替対象の場合
			//基準単位で在庫が存在するか確認する。基準単位で不足する場合は、荷姿単位の在庫を
			//振替することにより、基準単位数を満たせるか判定し、出庫可能となる場合は、荷姿振替を起こす。

			if (_packXfrL.isEmpty()){
				return;
			}
			editVmiOrOnrprov();

			makeStkListPackXfr();

			// 荷姿振替の情報を作成する
			for (IoAct_Upd01_DtlR row : _packXfrL) {

				if (setStkXfrQty(row)) {
					continue;
				}

				makeStkXfr(row, updL);
			}
			if (_msgList.size() > 0) {
				setError(_msgList);
			}
		}
		/**
		 * 使用基準の有償支給やVMI仕入を伴う場合は振替対象の在庫を編集する
		 */
		protected void editVmiOrOnrprov() {
			MCList<IoAct_Upd01_DtlR> provIoL = MCList.create(IoAct_Upd01_DtlR.class);
			MCList<IoAct_Upd01_DtlR> purcIoL = MCList.create(IoAct_Upd01_DtlR.class);
			MCList<MST_PROV_ACT_R> provL = MCList.create(MST_PROV_ACT_R.class);
			MCList<MST_PURC_ACT_D_R> purcL = MCList.create(MST_PURC_ACT_D_R.class);

			for (IoAct_Upd01_DtlR row : _packXfrL) {
				if (MSC_IO_ACT_TYP.isINPT(row.io_act_typ())
						|| MSC_IO_ACT_TYP.isLOSS(row.io_act_typ())) {
					// VMI在庫の投入
					if (isNull(getLoc(row.loc_cd()).sppl_cd())) {
						MST_PURC_ACT_D_R r = purcL.add();
						r.purc_src_typ(MSC_PURC_SRC_TYP.INPT.value());
						r.purc_src_no(row.act_d_no());

						row.addStringColumn(MST_PURC_ACT_D_R.$purc_src_typ, r.purc_src_typ());
						purcIoL.add(row);
					}
					// 使用基準の有償支給の投入
					else {
						MST_PROV_ACT_R r = provL.add();
						r.prov_src_act_typ(MSC_PROV_SRC_ACT_TYP.INPT.value());
						r.prov_src_act_no(row.act_d_no());
						provIoL.add(row);
					}
				}
				else if (MSC_IO_ACT_TYP.isXFR_GI(row.io_act_typ())) {
					// 製造場所と投入場所が異なる場合に発生する移動
					if (MSC_TRN_TYP.isINPT(row.trn_typ())) {
						MST_PURC_ACT_D_R r = purcL.add();
						r.purc_src_typ(MSC_PURC_SRC_TYP.INPT.value());
						r.purc_src_no(row.act_d_no());

						row.addStringColumn(MST_PURC_ACT_D_R.$purc_src_typ, r.purc_src_typ());
						purcIoL.add(row);
					}
					// VMI在庫の移動
					else if (MSC_TRN_TYP.isXFR(row.trn_typ())) {
						MST_PURC_ACT_D_R r = purcL.add();
						r.purc_src_typ(MSC_PURC_SRC_TYP.XFR.value());
						r.purc_src_no(row.act_d_no());

						row.addStringColumn(MST_PURC_ACT_D_R.$purc_src_typ, r.purc_src_typ());
						purcIoL.add(row);
					}
					// VMI在庫の移送
					else {
						MST_PURC_ACT_D_R r = purcL.add();
						r.purc_src_typ(MSC_PURC_SRC_TYP.SHIP.value());
						r.purc_src_no(row.act_d_no());

						row.addStringColumn(MST_PURC_ACT_D_R.$purc_src_typ, r.purc_src_typ());
						purcIoL.add(row);
					}
				}
				// VMI在庫の他勘定払出
				else if (MSC_IO_ACT_TYP.isACXFR_GI(row.io_act_typ())) {
					MST_PURC_ACT_D_R r = purcL.add();
					r.purc_src_typ(MSC_PURC_SRC_TYP.ACXFR.value());
					r.purc_src_no(row.act_d_no());

					row.addStringColumn(MST_PURC_ACT_D_R.$purc_src_typ, r.purc_src_typ());
					purcIoL.add(row);
				}
				// VMI在庫の出荷
				else if (MSC_IO_ACT_TYP.isSHIP_OUT(row.io_act_typ())) {
					MST_PURC_ACT_D_R r = purcL.add();
					r.purc_src_typ(MSC_PURC_SRC_TYP.SHIP.value());
					r.purc_src_no(row.act_d_no());

					row.addStringColumn(MST_PURC_ACT_D_R.$purc_src_typ, r.purc_src_typ());
					purcIoL.add(row);
				}
			}

			MCList<IoAct_Upd01_DtlR> delInptL = MCList.create(IoAct_Upd01_DtlR.class);
			MCList<IoAct_Upd01_DtlR> delL = MCList.create(IoAct_Upd01_DtlR.class);

			// 使用基準の有償支給の投入があった場合、支給前の状況に置き換える
			if (!provL.isEmpty()) {
				MST_PROV_ACT_R provL_t = MST_PROV_ACT_R.create("T");
				MCQueryApiBuilder provL_bldr = MCQueryApiBuilder.create(provL_t);
				provL_bldr.setWhere(provL_t.prov_src_act_typ.eq(bind("prov_src_act_typ")));
				provL_bldr.addWhereWithAnd(
						provL_t.prov_src_act_no.eq(bind("prov_src_act_no")));
				provL_bldr.addWhereWithAnd(
						provL_t.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
				dbSelect("MSBEL5010_MST_PROV_ACT_S01", provL, provL_bldr, 
						provL.groupBy(MST_PROV_ACT_R.$prov_src_act_typ, MST_PROV_ACT_R.$prov_src_act_no));

				MCIndexKey provIdx = provL.createIndex(MST_PROV_ACT_R.$prov_src_act_typ, MST_PROV_ACT_R.$prov_src_act_no);
				MCIndexKey stkIoDIdx = _stkIoL.createIndex(IoAct_Upd01_DtlR.$act_d_no, IoAct_Upd01_DtlR.$act_d_seq,
						IoAct_Upd01_DtlR.$trd_ptn_typ, IoAct_Upd01_DtlR.$trn_typ);
				MCIndexKey stkIoIdx = _stkIoL.createIndex(IoAct_Upd01_DtlR.$act_no, IoAct_Upd01_DtlR.$act_seq, IoAct_Upd01_DtlR.$act_rev_no,
						IoAct_Upd01_DtlR.$trd_ptn_typ, IoAct_Upd01_DtlR.$trn_typ);

				for (IoAct_Upd01_DtlR row : provIoL) {
					if (MSC_IO_ACT_TYP.isINPT(row.io_act_typ())
							|| MSC_IO_ACT_TYP.isLOSS(row.io_act_typ())) {
						IoAct_Upd01_DtlR r = _stkIoL
								.subList(stkIoDIdx, row.act_d_no(), row.act_d_seq(),
										MAC_TRD_PTN_TYP.MFG.value(),
										MSC_TRN_TYP.INPT.value())
								.getFirst(IoAct_Upd01_DtlR.$io_act_typ,
										MSC_IO_ACT_TYP.XFR_GR.value());
						// 移動を伴う投入は移動に基づいて振替するので投入で振替しない
						if (!isNull(r)) {
							delL.add(r);
							delInptL.add(row);
							continue;
						}
					}

					MST_PROV_ACT_R r = provL.getFirst(provIdx, MSC_PROV_SRC_ACT_TYP.INPT.value(), row.act_d_no());
					if (!isNull(r)) {
						MCList<IoAct_Upd01_DtlR> l = _stkIoL.subList(stkIoIdx, r.prov_act_no(), r.prov_act_seq(), r.prov_act_rev(),
								MAC_TRD_PTN_TYP.PROV.value(), MSC_TRN_TYP.PROV.value());
						delL.addAll(l);

						IoAct_Upd01_DtlR r2 = l.getFirst(IoAct_Upd01_DtlR.$io_typ, MSC_IO_TYP.GI.value());
						row.stk_arrv_bp_cd(r2.stk_arrv_bp_cd());
						row.asst_typ(r2.asst_typ());
						row.stk_id_typ(r2.stk_id_typ());
						row.stk_bp_cd(r2.stk_bp_cd());
					}
				}
			}

			// VMI在庫の投入、移動、他勘定払出、出荷があった場合、VMI仕入前の状況に置き換える
			if (!purcL.isEmpty()) {
				MST_PURC_ACT_D_R purcL_t = MST_PURC_ACT_D_R.create("T");
				MCQueryApiBuilder purcL_bldr = MCQueryApiBuilder.create(purcL_t);
				MST_PURC_ACT_R act = MST_PURC_ACT_R.create("ACT");
				
				purcL_bldr.setWhere(purcL_t.purc_src_typ.eq(bind("purc_src_typ")));
				purcL_bldr.addWhereWithAnd(purcL_t.purc_src_no.eq(bind("purc_src_no")));
				purcL_bldr.addInnerJoin(act, bracket(act.purc_act_no.eq(purcL_t.purc_act_no)
						.and(act.purc_act_seq.eq(purcL_t.purc_act_seq))
						.and(act.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))));
				dbSelect("MSBEL5010_MST_PURC_ACT_D_S01", purcL, purcL_bldr, purcL.groupBy(
						MST_PURC_ACT_D_R.$purc_src_typ, MST_PURC_ACT_D_R.$purc_src_no));

				MCIndexKey purcIdx = purcL.createIndex(MST_PURC_ACT_D_R.$purc_src_typ, MST_PURC_ACT_D_R.$purc_src_no);
				MCIndexKey stkIoDIdx = _stkIoL.createIndex(IoAct_Upd01_DtlR.$act_d_no, IoAct_Upd01_DtlR.$act_d_seq,
						IoAct_Upd01_DtlR.$trd_ptn_typ, IoAct_Upd01_DtlR.$trn_typ);

				for (IoAct_Upd01_DtlR row : purcIoL) {
					if (MSC_IO_ACT_TYP.isINPT(row.io_act_typ())
							|| MSC_IO_ACT_TYP.isLOSS(row.io_act_typ())) {
						IoAct_Upd01_DtlR r = _stkIoL
								.subList(stkIoDIdx, row.act_d_no(), row.act_d_seq(),
										MAC_TRD_PTN_TYP.MFG.value(),
										MSC_TRN_TYP.INPT.value())
								.getFirst(IoAct_Upd01_DtlR.$io_act_typ,
										MSC_IO_ACT_TYP.XFR_GR.value());
						// 移動を伴う投入は移動に基づいて振替するので投入で振替しない
						if (!isNull(r)) {
							delL.add(r);
							delInptL.add(row);
							continue;
						}
					}

					MST_PURC_ACT_D_R r = purcL.getFirst(purcIdx, row.getString(MST_PURC_ACT_D_R.$purc_src_typ), row.act_d_no());
					if (!isNull(r)) {
						MCList<IoAct_Upd01_DtlR> l = _stkIoL.subList(stkIoDIdx, r.purc_act_d_no(), r.purc_act_d_seq(),
								MAC_TRD_PTN_TYP.PURC_VMI.value(), MSC_TRN_TYP.PURC.value());
						delL.addAll(l);

						IoAct_Upd01_DtlR r2 = l.getFirst(IoAct_Upd01_DtlR.$io_typ, MSC_IO_TYP.GI.value());
						row.asst_typ(r2.asst_typ());
						row.stk_id_typ(r2.stk_id_typ());
						row.stk_bp_cd(r2.stk_bp_cd());
					}
				}
			}

			// 移動を伴う投入は削除する
			if (!delInptL.isEmpty()) {
				_packXfrL.removeAll(delInptL);
			}
			// 使用基準の有償支給やVMI仕入は削除する
			if (!delL.isEmpty()) {
				_stkIoL.removeAll(delL);
			}
		}

		/**
		 * 今回入出庫を加味した在庫リストを作成する（出庫時荷姿振替）
		 */
		protected void makeStkListPackXfr() {
			MCIndexKey _stkIdx = null;
			_stkL.clear();

			//今回入出庫の数量を在庫のキーでまとめる
			MCGroupByPolicy gp = getGroupPolicy();
			MCList<IoAct_Upd01_DtlR> stkIoL = _stkIoL.createInstance();
			for (IoAct_Upd01_DtlR r : _stkIoL) {
				if (MSC_IO_ACT_TYP.isPRDCT_WH_GI(r.io_act_typ()) 
					|| MSC_IO_ACT_TYP.isPRDCT_WH_GR(r.io_act_typ())) {
					if (MAC_SLIP_STS_TYP.isCRT(r.slip_sts_typ())) {
						//倉入入庫・出庫を対象にすると、補完元の出荷と合わせて振替数量が
						//倍になってしまうので振替の対象から除外する
						continue;
					}
				}
				stkIoL.add(r);
			}
			stkIoL = stkIoL.groupBy(gp);

			//現状在庫の数量を取得する
			_stkL = getStkPackXfr();
			_stkIdx = _stkL.createIndex(_stkL_t.getKeyColumn());

			for (IoAct_Upd01_DtlR row : _packXfrL.groupBy(gp)) {

				String[] keys_exP = getCols_exP();
				MCList<IoAct_Upd01_DtlR> p_stkIoL = stkIoL.subList(keys_exP, getVals(row, keys_exP));

				for (IoAct_Upd01_DtlR row2 : p_stkIoL) {
					MST_STK_R stkR = _stkL.getFirst(_stkIdx, getVals(row2, _stkL_t.getKeyColumn()));

					// 在庫がなければ追加
					if (isNull(stkR)) {
						stkR = MST_STK_R.create();
						copy(stkR, row2, createMap_MST_STK_R_IoAct_Upd01_DtlR());
						_stkL.add(stkR);
						_stkIdx = _stkL.createIndex(_stkL_t.getKeyColumn());
					}
					// 在庫があれば、入出庫を加味
					else {
						stkR.pack_unit_qty(stkR.pack_unit_qty().add(row2.pack_unit_qty()));
						stkR.base_unit_qty(stkR.base_unit_qty().add(row2.base_unit_qty()));

						// 数量が0となる場合は削除
						if (stkR.pack_unit_qty().isZero() && stkR.base_unit_qty().isZero()) {
							_stkL.remove(stkR);
							_stkIdx = _stkL.createIndex(_stkL_t.getKeyColumn());
						}
					}
				}
			}
			// 作成された在庫リストから品目単位マスタをキャッシュする
			selectItmUnitStkCache(_stkL);
		}

		/**
		 * 振替対象の数量を求める
		 * <p>
		 * @return 基準単位の在庫で足りる場合はtrue
		 * 足りない場合はfalse
		 */
		protected boolean setStkXfrQty(IoAct_Upd01_DtlR row) {

			// 基準単位の在庫を取得する
			MST_STK_R stkR = _stkL.getFirst(getCols_stk(), getVals(row, getCols_stk()));

			// 基準単位の在庫について処理する
			if (!isNull(stkR)) {
				if (row.base_unit_qty().gt(stkR.base_unit_qty())) {
					// 在庫数が少ない場合
					row.base_unit_qty(row.base_unit_qty().subtract(stkR.base_unit_qty()));
					_stkL.remove(stkR);
				}
				else {
					// 在庫数のほうが多い場合
					stkR.base_unit_qty(stkR.base_unit_qty().subtract(row.base_unit_qty()));
					stkR.pack_unit_qty(stkR.base_unit_qty());	//基準単位数と同じ
					return true;	//振替不要
				}
			}
			return false;
		}

		/**
		 * 振替情報を作成する
		 * <p>
		 */
		protected void makeStkXfr(IoAct_Upd01_DtlR row, MCList<IoAct_Upd01_DtlR> updL) {

			MAM_ITM_R itm = getItm(row.itm_cd(), row.itm_sub1(), row.itm_sub2(), row.itm_sub3());

			String[] keys_exP = getCols_exP();

			// 基準単位以外の在庫リストを取得する
			MCList<MST_STK_R> p_stkL = _stkL.subList(keys_exP, getVals(row, keys_exP));

			// 基準単位以外の在庫がないため、振替なし
			if (isNull(p_stkL)) {
				return;
			}
			// 全数荷姿振替しても基準単位の在庫が足りないため、振替なし
			if (row.base_unit_qty().gt(p_stkL.sum(MST_STK_R.$base_unit_qty))) {
				return;
			}

			// ここまでくれば振替確定

			//換算数の小さい順でソートする
			for (MST_STK_R p_stkR : p_stkL) {
				MAVM_ITM_UNIT_R itmUnit = getItmUnitStk(p_stkR);

				if (isNull(itmUnit.conv_base_qty())
						|| itmUnit.conv_base_qty().isZero()) {
					p_stkR.addNumberColumn("conv_sort", MCNumber.ONE);
				}
				else {
					p_stkR.addNumberColumn("conv_sort", itmUnit.conv_qty().divide(itmUnit.conv_base_qty(), itmUnit.dec_place().intValue(), MAC_RND_TYP.toMC(itmUnit.rnd_typ())));
				}
			}
			p_stkL.sort("conv_sort");

			MCList<MST_STK_R> removeStkL = MCList.create(MST_STK_R.class);
			for (MST_STK_R p_stkR : p_stkL) {
				MAVM_ITM_UNIT_R itmUnit = getItmUnitStk(p_stkR);
				
				if(isNull(itmUnit.conv_base_qty())) {
					MCMessage aMsg = new MCMessage(row, null, MSBEL0351,
							toDispItm(p_stkR.itm_cd(), p_stkR.itm_sub1(),
									p_stkR.itm_sub2(), p_stkR.itm_sub3()),
							p_stkR.pack_unit_cd());
					_msgList.add(aMsg);
					continue;
				}

				MCNumber base_qty, pack_qty;
				if (row.base_unit_qty().gte(p_stkR.base_unit_qty())) {
					// 在庫数が少ない場合、在庫数を振替候補とする
					base_qty = p_stkR.base_unit_qty();
					pack_qty = p_stkR.pack_unit_qty();
					removeStkL.add(p_stkR);
				}
				else {
					// 在庫のほうが多い場合、必要数を振替候補とする
					IoAct_Upd01_DtlR xfrPackQty = calcXfrPackQty(row, itm, itmUnit);
					pack_qty = xfrPackQty.pack_unit_qty();
					base_qty = xfrPackQty.base_unit_qty();
					// 荷姿数を計算した結果、在庫よりも多くなる場合は全数を振替する。
					if (base_qty.gte(p_stkR.base_unit_qty()) || pack_qty.gte(p_stkR.pack_unit_qty())) {
						base_qty = p_stkR.base_unit_qty();
						pack_qty = p_stkR.pack_unit_qty();
						removeStkL.add(p_stkR);
					}
					else {
						// 在庫数を減算しておく
						p_stkR.base_unit_qty(p_stkR.base_unit_qty().subtract(base_qty));
						p_stkR.pack_unit_qty(p_stkR.pack_unit_qty().subtract(pack_qty));
					}
				}

				//荷姿振替出庫
				IoAct_Upd01_DtlR addR1 = row.clone();
				addR1.slip_no(null);
				addR1.slip_seq_no(MCNumber.ONE);
				addR1.slip_rev_no(MCNumber.ONE);
				addR1.slip_sts_typ(MAC_SLIP_STS_TYP.CRT.value()); 
				addR1.io_act_typ(MSC_IO_ACT_TYP.XFR_PACK_GI.value());
				addR1.par_slip_io_act_typ(addR1.io_act_typ());
				addR1.ac_slip_typ(MSC_IO_ACT_TYP.ac_slip_typ(addR1.io_act_typ()));
				if (!isNull(addR1.ac_slip_typ())) {
					addR1.send_flg(true);
				}
				else {
					addR1.send_flg(false);
				}

				addR1.trd_unit_cd(p_stkR.pack_unit_cd());
				addR1.trd_unit_qty(pack_qty);
				addR1.pack_unit_cd(p_stkR.pack_unit_cd());
				addR1.pack_unit_qty(pack_qty);
				addR1.base_unit_qty(base_qty);

				addR1.slip_cmpl_flg(true);

				//荷姿振替入庫
				IoAct_Upd01_DtlR addR2 = addR1.clone();
				addR2.io_act_typ(MSC_IO_ACT_TYP.XFR_PACK_GR.value());
				addR2.io_typ(MSC_IO_TYP.GR.value());
				addR2.ac_slip_typ(MSC_IO_ACT_TYP.ac_slip_typ(addR2.io_act_typ()));
				if (!isNull(addR2.ac_slip_typ())) {
					addR2.send_flg(true);
				}
				else {
					addR2.send_flg(false);
				}
				addR2.gr_wg_cd(addR2.gi_wg_cd());
				addR2.gi_wg_cd(null);
				addR2.gr_loc_cd(addR2.gi_loc_cd());
				addR2.gr_str_ln_cd(addR2.gi_str_ln_cd());
				addR2.gi_loc_cd(null);
				addR2.gi_str_ln_cd(null);
				addR2.gr_gd_cd(addR2.gi_gd_cd());
				addR2.gi_gd_cd(null);

				//基準単位に換算した結果
				addR2.trd_unit_cd(addR2.base_unit_cd());
				addR2.trd_unit_qty(base_qty);
				addR2.pack_unit_cd(addR2.base_unit_cd());
				addR2.pack_unit_qty(base_qty);
				addR2.base_unit_qty(base_qty);

				//荷姿振替出庫 -> 荷姿振替入庫 を更新リストに追加
				updL.add(addR1);
				updL.add(addR2);

				// 必要数を減算しておく
				row.base_unit_qty(row.base_unit_qty().subtract(base_qty));
				 
				// 必要数が0以下なら終了
				if (!row.base_unit_qty().isPositive()){
					//振替後、出庫して余った基準単位の在庫を在庫リストに戻す
					if (row.base_unit_qty().isNegative()){
						MST_STK_R stkR = p_stkR.clone();
						stkR.base_unit_qty(row.base_unit_qty().negate());
						stkR.pack_unit_qty(stkR.base_unit_qty());	//基準単位数と同じ
						stkR.pack_unit_cd(row.base_unit_cd()); //基準単位ＣＤにする
						_stkL.add(stkR);
					}
					break;
				}
			}
			_stkL.removeAll(removeStkL);
		}

		protected IoAct_Upd01_DtlR calcXfrPackQty(IoAct_Upd01_DtlR row, MAM_ITM_R itm, MAVM_ITM_UNIT_R itmUnit) {
			IoAct_Upd01_DtlR xfrPackQty = IoAct_Upd01_DtlR.create();
			// 基準単位の端数処理区分と反対の端数処理区分にて、荷姿数量を計算する。
			String rndTyp = MAC_RND_TYP.RNDOFF.value();
			if (MAC_RND_TYP.isRNDUP(itm.rnd_typ())) {
				rndTyp = MAC_RND_TYP.CUTOFF.value();
			}
			else if (MAC_RND_TYP.isCUTOFF(itm.rnd_typ())) {
				rndTyp = MAC_RND_TYP.RNDUP.value();
			}
			xfrPackQty.pack_unit_qty(rvrsBaseUnitConv(row.base_unit_qty(), itmUnit.conv_base_qty(),
					itmUnit.conv_qty(), itmUnit.dec_place(), rndTyp));
			xfrPackQty.base_unit_qty(convToBaseUnit(xfrPackQty.pack_unit_qty(), itmUnit.conv_base_qty(),
					itmUnit.conv_qty(), itm.dec_place(), itm.rnd_typ()));
			// 切り捨てまたは四捨五入で計算した場合、出庫数を満たせていないときは切り上げにする。
			if (xfrPackQty.base_unit_qty().lt(row.base_unit_qty())) {
				xfrPackQty.pack_unit_qty(rvrsBaseUnitConv(row.base_unit_qty(), itmUnit.conv_base_qty(),
						itmUnit.conv_qty(), itmUnit.dec_place(), MAC_RND_TYP.RNDUP.value()));
				xfrPackQty.base_unit_qty(convToBaseUnit(xfrPackQty.pack_unit_qty(), itmUnit.conv_base_qty(),
						itmUnit.conv_qty(), itm.dec_place(), itm.rnd_typ()));
			}
			return xfrPackQty;
		}

		protected MCList<MST_STK_R> getStkPackXfr() {

			// 荷姿単位ＣＤ以外のキーで在庫を検索する
			MCList<IoAct_Upd01_DtlR> tempL = _packXfrL.groupBy(getCols_exP());
			MCList<MST_STK_R> bindL = MCList.create(MST_STK_R.class);

			for (IoAct_Upd01_DtlR r : tempL) {
				MST_STK_R stkR = MST_STK_R.create();
				stkR.itm_cd(r.itm_cd());
				stkR.itm_sub1(r.itm_sub1());
				stkR.itm_sub2(r.itm_sub2());
				stkR.itm_sub3(r.itm_sub3());
				stkR.loc_cd(r.loc_cd());
				stkR.str_ln_cd(r.str_ln_cd());
				stkR.lot_no(r.lot_no());
				stkR.sublot_no(r.sublot_no());
				stkR.sno1(r.sno1());
				stkR.sno2(r.sno2());
				stkR.sno3(r.sno3());
				stkR.sno4(r.sno4());
				stkR.stk_arrv_bp_cd(r.stk_arrv_bp_cd());
				stkR.lot_no(r.lot_no());
				stkR.sublot_no(r.sublot_no());
				stkR.sno1(r.sno1());
				stkR.sno2(r.sno2());
				stkR.sno3(r.sno3());
				stkR.sno4(r.sno4());
				stkR.fix_no_typ(r.fix_no_typ());
				stkR.fix_no(r.fix_no());
//				stkR.pack_unit_cd(r.pack_unit_cd());
				stkR.gd_cd(r.gd_cd());
				stkR.in_xfr_typ(r.in_xfr_typ());
				stkR.quality_typ(r.quality_typ());
				stkR.asst_typ(r.asst_typ());
				stkR.stk_insp_typ(r.stk_insp_typ());
				stkR.stk_id_typ(r.stk_id_typ());
				stkR.stk_bp_cd(r.stk_bp_cd());
				bindL.add(stkR);
			}

			MCList<MST_STK_R> stkL = MCList.create(MST_STK_R.class);

			insStkWk(bindL);
			executeQuery(stkL, MSBEL5010_MST_STK_S01());
			return stkL;
		}

		protected void setFixNoInsp(MCList<IoAct_Upd01_DtlR> updL) {

			if (_inspL.isEmpty()) {
				return;
			}

			makeStkListInsp();
			getMlyStkDtl();

			for (IoAct_Upd01_DtlR r : _inspL) {
				setFixNo(r, updL);
			}
		}

		protected void setFixNo(IoAct_Upd01_DtlR r, MCList<IoAct_Upd01_DtlR> updL) {

			MST_STK_R stkR = null;
			MST_MLY_STK_DTL_R mlyStkDtlR = null;

			if (MSC_IO_TYP.isGI(MSC_IO_ACT_TYP.io_typ(r.io_act_typ()))) {
				//確定ＮＯ区分、確定ＮＯ、資産区分を除いたキーで月末在庫を取得する
				MCList<MST_MLY_STK_DTL_R> mlyStkDtlL = _mlyStkL.subList(_mlyStkIdx, getVals(r, getCols_exFixNo()));
				mlyStkDtlL.sort(getSortPolicy());

				//月次受払在庫と紐づいている現状在庫を選択する
				for (MST_MLY_STK_DTL_R rr :mlyStkDtlL) {
					if (!rr.base_unit_qty().isZero()) {
						stkR = _stkL.getFirst(_stkIdx2, getVals(rr, getCols_stk()));
						if (!isNull(stkR)) {
							if (!stkR.base_unit_qty().isZero()) {
								mlyStkDtlR = rr;
								break;
							}
							else {
								stkR = null;
							}
						}
					}
				}
			}
			else {
				//確定ＮＯ区分、確定ＮＯ、資産区分を除いたキーで在庫を取得する
				stkR = _stkL.getFirst(getCols_exFixNo(), getVals(r, getCols_exFixNo()));
			}

			if (!isNull(stkR)) {
				if (MSC_IO_TYP.isGI(MSC_IO_ACT_TYP.io_typ(r.io_act_typ()))) { 
					if (r.pack_unit_qty().gt(stkR.pack_unit_qty())) {
						//在庫が少ない場合
						IoAct_Upd01_DtlR addR = r.clone();
						r.pack_unit_qty(r.pack_unit_qty().subtract(stkR.pack_unit_qty()));
						r.base_unit_qty(r.base_unit_qty().subtract(stkR.base_unit_qty()));
						//取引単位は荷姿単位と一致している
						r.trd_unit_qty(r.pack_unit_qty());

						//見つかった在庫の数量、確定ＮＯ区分、確定ＮＯを設定する
						addR.fix_no_typ(stkR.fix_no_typ());
						addR.fix_no(stkR.fix_no());
						addR.pack_unit_qty(stkR.pack_unit_qty());
						addR.base_unit_qty(stkR.base_unit_qty());
						//取引単位は荷姿単位と一致している
						addR.trd_unit_qty(addR.pack_unit_qty());

						//特定された在庫はリストから除く
						stkR.base_unit_qty(0);
						mlyStkDtlR.base_unit_qty(0);

						if (MAC_DATA_CRUD_TYP.isUPD(addR.data_crud_typ())) {
							//更新時、分割された場合は
							//伝票ＮＯをクリアし、伝票連番、伝票改訂番号を1する
							addR.slip_no(null);
							addR.slip_seq_no(MCNumber.ONE);
							addR.slip_rev_no(MCNumber.ONE);
						}

						//分割された行は更新リストに追加する
						updL.add(addR);

						if (MSC_IO_ACT_TYP.isXFR_GI(addR.io_act_typ())) {
							//移動・移送出庫の場合、子伝（移動・移送入庫）を追加する
							IoAct_Upd01_DtlR chdR = addR.clone();
							chdR.io_act_typ(MSC_IO_ACT_TYP.XFR_GR.value());
							chdR.io_typ(MSC_IO_TYP.GR.value());
							chdR.loc_cd(chdR.gr_loc_cd());
							chdR.str_ln_cd(chdR.gr_str_ln_cd());
							chdR.gr_wg_cd(getLoc(chdR.gr_loc_cd()).wg_cd());
							chdR.gr_dpt_cd(getLocDpt(chdR.gr_loc_cd(), chdR.ac_dt()));
							if (!MSC_STK_ID_TYP.isCOSTK(chdR.stk_id_typ())) {
								chdR.asst_typ(MAC_ASST_TYP.OTH.value());
							}
							else {
								if (MAC_LOC_MNG_TYP.isPRD(getLoc(chdR.gr_loc_cd()).loc_mng_typ())){
									chdR.asst_typ(MAC_ASST_TYP.CO_PROD.value());
								}
								else {
									chdR.asst_typ(MAC_ASST_TYP.CO_SLS.value());
								}
							}
							chdR.ac_slip_typ(null);
							chdR.send_flg(false);
							updL.add(chdR);
						}

						//足りない分、他の確定ＮＯを再帰的に探す
						setFixNo(r, updL);
					}
					else {
						//数量を満たす在庫が見つかった場合
						stkR.pack_unit_qty(stkR.pack_unit_qty().subtract(r.pack_unit_qty()));
						stkR.base_unit_qty(stkR.base_unit_qty().subtract(r.base_unit_qty()));
						r.fix_no_typ(stkR.fix_no_typ());
						r.fix_no(stkR.fix_no());
						updL.add(r);

						if (MSC_IO_ACT_TYP.isXFR_GI(r.io_act_typ())) {
							//移動・移送出庫の場合、子伝（移動・移送入庫）を追加する
							IoAct_Upd01_DtlR chdR = r.clone();
							chdR.io_act_typ(MSC_IO_ACT_TYP.XFR_GR.value());
							chdR.io_typ(MSC_IO_TYP.GR.value());
							chdR.loc_cd(chdR.gr_loc_cd());
							chdR.str_ln_cd(chdR.gr_str_ln_cd());
							chdR.gr_wg_cd(getLoc(chdR.gr_loc_cd()).wg_cd());
							chdR.gr_dpt_cd(getLocDpt(chdR.gr_loc_cd(), chdR.ac_dt()));
							if (!MSC_STK_ID_TYP.isCOSTK(chdR.stk_id_typ())) {
								chdR.asst_typ(MAC_ASST_TYP.OTH.value());
							}
							else {
								if (MAC_LOC_MNG_TYP.isPRD(getLoc(chdR.gr_loc_cd()).loc_mng_typ())){
									chdR.asst_typ(MAC_ASST_TYP.CO_PROD.value());
								}
								else {
									chdR.asst_typ(MAC_ASST_TYP.CO_SLS.value());
								}
							}
							if (MAC_DATA_CRUD_TYP.isUPD(chdR.data_crud_typ())) {
								//更新時、分割された場合は
								//伝票ＮＯをクリアし、伝票連番、伝票改訂番号を1する
								chdR.slip_no(null);
								chdR.slip_seq_no(MCNumber.ONE);
								chdR.slip_rev_no(MCNumber.ONE);
							}
							chdR.ac_slip_typ(null);
							chdR.send_flg(false);
							updL.add(chdR);
						}
					}
				}
				else {
					//入庫時（棚卸差異増耗）は見つかった在庫の確定ＮＯを使用する
					r.fix_no_typ(stkR.fix_no_typ());
					r.fix_no(stkR.fix_no());
					updL.add(r);
				}
			}
			else {
				if (MSC_IO_TYP.isGI(MSC_IO_ACT_TYP.io_typ(r.io_act_typ()))) { 
					throw new MCAppException(r, null, MSBEL0170,
							toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
							r.loc_cd(), r.str_ln_cd(),
							r.stk_arrv_bp_cd(), r.lot_no(), r.sublot_no(),
							toDispSno(r.sno1(), r.sno2(), r.sno3(), r.sno4()),
							r.pack_unit_cd(), r.gd_cd(),
							r.in_xfr_typ(), r.quality_typ(), r.stk_insp_typ(),
							r.stk_id_typ(), r.stk_bp_cd());
				}
				else {
					throw new MCAppException(r, null, MSBEL0171,
							toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
							r.loc_cd(), r.str_ln_cd(),
							r.stk_arrv_bp_cd(), r.lot_no(), r.sublot_no(),
							toDispSno(r.sno1(), r.sno2(), r.sno3(), r.sno4()),
							r.pack_unit_cd(), r.gd_cd(),
							r.in_xfr_typ(), r.quality_typ(), r.stk_insp_typ(),
							r.stk_id_typ(), r.stk_bp_cd());
				}
			}
		}

		/**
		 * 月次受払在庫(月末在庫)の取得
		 */
		protected void getMlyStkDtl() {
			MCList<MST_MLY_STK_DTL_R> bindL = MCList.create(MST_MLY_STK_DTL_R.class);
			MCQueryApiBuilder bindL_bldr = MCQueryApiBuilder.create(MST_MLY_STK_DTL_R.create("T"));
			addAll(bindL, _inspL, createMap_MST_MLY_STK_DTL_R_IoAct_Upd01_DtlR());
			dbWkDelete("MSBEL5010_MSW_MLY_STK_DTL_D01", bindL_bldr.getBaseDbc());
			dbWkInsert("MSBEL5010_MSW_MLY_STK_DTL_I01", bindL, bindL_bldr.getBaseDbc());

			// 月次受払在庫を確定ＮＯ区分、確定ＮＯ以外のキーで検索する
			executeQuery(_mlyStkL, MSBEL5010_MST_MLY_STK_DTL_S01());
			_mlyStkIdx = _mlyStkL.createIndex(getCols_exFixNo());
		}
		/**
		 * 月次受払在庫(月末在庫)の優先順を取得
		 */
		protected MCSortPolicy getSortPolicy() {
			MCSortPolicy p = new MCSortPolicy();
			p.add(SortType.ASC, MST_MLY_STK_DTL_R.$fix_no_typ);
			p.add(SortType.DESC, MST_MLY_STK_DTL_R.$fix_no);
			return p;
		}

		/**
		 * 今回入出庫を加味した在庫リストを作成する（検査中）
		 */
		protected void makeStkListInsp() {
			MCIndexKey _stkIdx = null;
			_stkL.clear();

			//今回入出庫の数量を在庫のキーでまとめる
			MCGroupByPolicy gp = getGroupPolicy();
			MCList<IoAct_Upd01_DtlR> stkIoL = _stkIoL.groupBy(gp);

			//現状在庫の数量を取得する
			_stkL = getStkInsp();
			_stkIdx = _stkL.createIndex(_stkL_t.getKeyColumn());

			for (IoAct_Upd01_DtlR row : _inspL.groupBy(gp)) {

				String[] keys_exFixNo = getCols_exFixNo();
				MCList<IoAct_Upd01_DtlR> insp_stkIoL = stkIoL.subList(keys_exFixNo, getVals(row, keys_exFixNo));

				for (IoAct_Upd01_DtlR row2 : insp_stkIoL) {
					MST_STK_R stkR = _stkL.getFirst(_stkIdx, getVals(row2, _stkL_t.getKeyColumn()));

					// 在庫がなければ追加
					if (isNull(stkR)) {
						stkR = MST_STK_R.create();
						copy(stkR, row2, createMap_MST_STK_R_IoAct_Upd01_DtlR());
						_stkL.add(stkR);
						_stkIdx = _stkL.createIndex(_stkL_t.getKeyColumn());
					}
					// 在庫があれば、入出庫を加味
					else {
						stkR.pack_unit_qty(stkR.pack_unit_qty().add(row2.pack_unit_qty()));
						stkR.base_unit_qty(stkR.base_unit_qty().add(row2.base_unit_qty()));

						// 数量が0となる場合は削除
						if (stkR.pack_unit_qty().isZero() && stkR.base_unit_qty().isZero()) {
							_stkL.remove(stkR);
							_stkIdx = _stkL.createIndex(_stkL_t.getKeyColumn());
						}
					}
				}
			}
			_stkIdx2 = _stkL.createIndex(getCols_stk());
		}

		protected MCList<MST_STK_R> getStkInsp() {

			// 確定ＮＯ区分、確定ＮＯ以外のキーで在庫を検索する
			MCList<MST_STK_R> bindL = MCList.create(MST_STK_R.class);

			for (IoAct_Upd01_DtlR r : _inspL) {
				MST_STK_R stkR = MST_STK_R.create();
				stkR.itm_cd(r.itm_cd());
				stkR.itm_sub1(r.itm_sub1());
				stkR.itm_sub2(r.itm_sub2());
				stkR.itm_sub3(r.itm_sub3());
				stkR.loc_cd(r.loc_cd());
				stkR.str_ln_cd(r.str_ln_cd());
				stkR.lot_no(r.lot_no());
				stkR.sublot_no(r.sublot_no());
				stkR.sno1(r.sno1());
				stkR.sno2(r.sno2());
				stkR.sno3(r.sno3());
				stkR.sno4(r.sno4());
				stkR.stk_arrv_bp_cd(r.stk_arrv_bp_cd());
				stkR.pack_unit_cd(r.pack_unit_cd());
				stkR.gd_cd(r.gd_cd());
				stkR.in_xfr_typ(r.in_xfr_typ());
				stkR.quality_typ(r.quality_typ());
				stkR.asst_typ(r.asst_typ());
				stkR.stk_insp_typ(r.stk_insp_typ());
				stkR.stk_id_typ(r.stk_id_typ());
				stkR.stk_bp_cd(r.stk_bp_cd());
				bindL.add(stkR);
			}

			bindL = bindL.groupBy(getCols_exFixNo()); 
			MCList<MST_STK_R> stkL = MCList.create(MST_STK_R.class);

			insStkWk(bindL);
			executeQuery(stkL, MSBEL5010_MST_STK_S02());
			return stkL;
		}

		/**
		 * 確定ＮＯ区分、確定ＮＯを除いた在庫のキーカラム
		 * <p>
		 */
		protected String[] getCols_exFixNo() {
			return new String[]{
					MST_STK_R.$itm_cd,
					MST_STK_R.$itm_sub1,
					MST_STK_R.$itm_sub2,
					MST_STK_R.$itm_sub3,
					MST_STK_R.$loc_cd,
					MST_STK_R.$str_ln_cd,
					MST_STK_R.$stk_arrv_bp_cd,
					MST_STK_R.$lot_no,
					MST_STK_R.$sublot_no,
					MST_STK_R.$sno1,
					MST_STK_R.$sno2,
					MST_STK_R.$sno3,
					MST_STK_R.$sno4,
//					MST_STK_R.$fix_no_typ,
//					MST_STK_R.$fix_no,
					MST_STK_R.$pack_unit_cd,
					MST_STK_R.$gd_cd,
					MST_STK_R.$in_xfr_typ,
					MST_STK_R.$quality_typ,
					MST_STK_R.$asst_typ,
					MST_STK_R.$stk_insp_typ,
					MST_STK_R.$stk_id_typ,
					MST_STK_R.$stk_bp_cd
			};
		}

		/**
		 * 在庫のキーカラム
		 * <p>
		 */
		protected String[] getCols_stk() {
			return new String[]{
					MST_STK_R.$itm_cd,
					MST_STK_R.$itm_sub1,
					MST_STK_R.$itm_sub2,
					MST_STK_R.$itm_sub3,
					MST_STK_R.$loc_cd,
					MST_STK_R.$str_ln_cd,
					MST_STK_R.$stk_arrv_bp_cd,
					MST_STK_R.$lot_no,
					MST_STK_R.$sublot_no,
					MST_STK_R.$sno1,
					MST_STK_R.$sno2,
					MST_STK_R.$sno3,
					MST_STK_R.$sno4,
					MST_STK_R.$fix_no_typ,
					MST_STK_R.$fix_no,
					MST_STK_R.$pack_unit_cd,
					MST_STK_R.$gd_cd,
					MST_STK_R.$in_xfr_typ,
					MST_STK_R.$quality_typ,
					MST_STK_R.$asst_typ,
					MST_STK_R.$stk_insp_typ,
					MST_STK_R.$stk_id_typ,
					MST_STK_R.$stk_bp_cd
			};
		}

		/**
		 * 荷姿単位ＣＤを除いた在庫のキーカラム
		 * <p>
		 */
		protected String[] getCols_exP() {
			return new String[]{
					MST_STK_R.$itm_cd,
					MST_STK_R.$itm_sub1,
					MST_STK_R.$itm_sub2,
					MST_STK_R.$itm_sub3,
					MST_STK_R.$loc_cd,
					MST_STK_R.$str_ln_cd,
					MST_STK_R.$stk_arrv_bp_cd,
					MST_STK_R.$lot_no,
					MST_STK_R.$sublot_no,
					MST_STK_R.$sno1,
					MST_STK_R.$sno2,
					MST_STK_R.$sno3,
					MST_STK_R.$sno4,
					MST_STK_R.$fix_no_typ,
					MST_STK_R.$fix_no,
//					MST_STK_R.$pack_unit_cd,
					MST_STK_R.$gd_cd,
					MST_STK_R.$in_xfr_typ,
					MST_STK_R.$quality_typ,
					MST_STK_R.$asst_typ,
					MST_STK_R.$stk_insp_typ,
					MST_STK_R.$stk_id_typ,
					MST_STK_R.$stk_bp_cd
			};
		}

		protected MCGroupByPolicy getGroupPolicy() {
			MCGroupByPolicy gp = new MCGroupByPolicy(
					IoAct_Upd01_DtlR.$itm_cd,
					IoAct_Upd01_DtlR.$itm_sub1,
					IoAct_Upd01_DtlR.$itm_sub2,
					IoAct_Upd01_DtlR.$itm_sub3,
					IoAct_Upd01_DtlR.$loc_cd,
					IoAct_Upd01_DtlR.$str_ln_cd,
					IoAct_Upd01_DtlR.$stk_arrv_bp_cd,
					IoAct_Upd01_DtlR.$lot_no,
					IoAct_Upd01_DtlR.$sublot_no,
					IoAct_Upd01_DtlR.$sno1,
					IoAct_Upd01_DtlR.$sno2,
					IoAct_Upd01_DtlR.$sno3,
					IoAct_Upd01_DtlR.$sno4,
					IoAct_Upd01_DtlR.$fix_no_typ,
					IoAct_Upd01_DtlR.$fix_no,
					IoAct_Upd01_DtlR.$pack_unit_cd,
					IoAct_Upd01_DtlR.$gd_cd,
					IoAct_Upd01_DtlR.$in_xfr_typ,
					IoAct_Upd01_DtlR.$quality_typ,
					IoAct_Upd01_DtlR.$asst_typ,
					IoAct_Upd01_DtlR.$stk_insp_typ,
					IoAct_Upd01_DtlR.$stk_id_typ,
					IoAct_Upd01_DtlR.$stk_bp_cd
			);
			gp.sum(IoAct_Upd01_DtlR.$pack_unit_qty, IoAct_Upd01_DtlR.$base_unit_qty);
			return gp;
		}


		/**
		 * 現状在庫ワークに処理対象を登録する
		 * @param bindL
		 */
		protected void insStkWk(MCList<MST_STK_R> bindL) {
			MCQueryApiBuilder bindL_bldr = MCQueryApiBuilder.create(MST_STK_R.create("T"));
			dbWkDelete("MSBEL5010_MSW_STK_D01", bindL_bldr.getBaseDbc());
			dbWkInsert("MSBEL5010_MSW_STK_I01", bindL, bindL_bldr.getBaseDbc());
		}

		protected void cmplL(MCList<IoAct_Upd01_DtlR> wkL, MCList<IoAct_Upd01_DtlR> rowsList) {

			for (IoAct_Upd01_DtlR wkR: wkL){

				if (MAC_DATA_CRUD_TYP.isDEL(wkR.data_crud_typ())) {
					//削除は補完対象なし
					rowsList.add(wkR);
				}
				else {
					// 製造、副産品製造
					if (MSC_IO_ACT_TYP.isMFG(wkR.io_act_typ())
						|| MSC_IO_ACT_TYP.isBYMFG(wkR.io_act_typ())) {

						cmplMfgR(wkR, rowsList);
					}
					//投入、ロス
					else if (MSC_IO_ACT_TYP.isINPT(wkR.io_act_typ())
								|| MSC_IO_ACT_TYP.isLOSS(wkR.io_act_typ())) {

						cmplInptR(wkR, rowsList);
					}
					//仕入出庫、有償受給出庫、経費購買出庫、検収不良出庫
					else if (MSC_IO_ACT_TYP.isPURC_GI(wkR.io_act_typ())
							|| MSC_IO_ACT_TYP.isONR_RCV_GI(wkR.io_act_typ())
								|| MSC_IO_ACT_TYP.isXPNS_PURC_GI(wkR.io_act_typ())
									|| MSC_IO_ACT_TYP.isACCPT_DFCT_GI(wkR.io_act_typ())) {

						cmplPurcGiR(wkR, rowsList);
					}
					//仕入入庫、有償受給入庫、経費購買入庫、検収不良入庫
					else if (MSC_IO_ACT_TYP.isPURC_GR(wkR.io_act_typ())
							|| MSC_IO_ACT_TYP.isONR_RCV_GR(wkR.io_act_typ())
								|| MSC_IO_ACT_TYP.isXPNS_PURC_GR(wkR.io_act_typ())
									|| MSC_IO_ACT_TYP.isACCPT_DFCT_GR(wkR.io_act_typ())) {

						cmplPurcGrR(wkR, rowsList);
					}
					//入荷
					else if (MSC_IO_ACT_TYP.isARR(wkR.io_act_typ())) {

						cmplArrR(wkR, rowsList);
					}
					//移動・移送入庫、移動・移送返品入庫
					else if (MSC_IO_ACT_TYP.isXFR_GR(wkR.io_act_typ())
							|| MSC_IO_ACT_TYP.isXFR_RTN_GR(wkR.io_act_typ())) {

						cmplXfrGrR(wkR, rowsList);
					}
					//検査完了出庫または検査抜取
					else if (MSC_IO_ACT_TYP.isINSP_CMPL_GI(wkR.io_act_typ())
							|| MSC_IO_ACT_TYP.isINSP_SMPL_GI(wkR.io_act_typ())) {

						cmplInspR(wkR, rowsList);
					}
					//出荷
					else if (MSC_IO_ACT_TYP.isSHIP_OUT(wkR.io_act_typ())) {

						cmplShipOutR(wkR, rowsList);
					}
					//輸出出荷
					else if (MSC_IO_ACT_TYP.isEX_SHIP_OUT(wkR.io_act_typ())) {

						cmplExShipOutR(wkR, rowsList);
					}
					//売上
					else if (MSC_IO_ACT_TYP.isSLS(wkR.io_act_typ()) 
							|| (MSC_TRN_TYP.isSLS(wkR.trn_typ()) 
									&& MSC_IO_ACT_TYP.isACXFR_GI(wkR.io_act_typ()))) {
						cmplSlsR(wkR, rowsList);
					}
					//売上返品
					else if (MSC_TRN_TYP.isSLS(wkR.trn_typ())
							&& (MSC_IO_ACT_TYP.isSLS_RTN_GR(wkR.io_act_typ())
									|| MSC_IO_ACT_TYP.isACXFR_GR(wkR.io_act_typ()))) {

						cmplSlsRtnGrR(wkR, rowsList);
					}
					//出荷返品入庫
					else if (MSC_IO_ACT_TYP.isSHIP_RTN_GR(wkR.io_act_typ())) {

						cmplShipRtnGrR(wkR, rowsList);
					}
					//仕入返品出庫、有償受給返品出庫
					else if (MSC_IO_ACT_TYP.isPURC_RTN_GI(wkR.io_act_typ())
							|| MSC_IO_ACT_TYP.isONR_RCV_RET_GI(wkR.io_act_typ())) {

						cmplPurcRtnGiR(wkR, rowsList);
					}
					//その他は補完なし
					else {
						rowsList.add(wkR);
					}
				}
			}
			_ioActIdx = rowsList.createIndex(IoAct_Upd01_DtlR.$act_no
											, IoAct_Upd01_DtlR.$act_d_no
											, IoAct_Upd01_DtlR.$act_io_no
											, IoAct_Upd01_DtlR.$trn_typ
											);
		}

		protected void setSpplCd(IoAct_Upd01_DtlR r) {
			MAM_LOC_R giLocR = getLoc(r.gi_loc_cd());
			MAM_LOC_R grLocR = getLoc(r.gr_loc_cd());
			
			// 取引パタン区分が支給であること
			// かつ、外注場所から外注場所への支給であること
			// かつ、発注先が同一であること
			// かつ、出庫場所と入庫場所の資産管理部門が異なる or ＷＧが異なること
			// かつ、受払区分が移動・移送出庫 or 移動・移送入庫であること
			// かつ、在庫着荷先がNULL文字ではない
			if (MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())
					&& (!isNull(giLocR.sppl_cd()) && !isNull(grLocR.sppl_cd()))
					&& isSame(giLocR.sppl_cd(), grLocR.sppl_cd())
					&& (!isSame(r.gi_dpt_cd(), r.gr_dpt_cd()) || !isSame(r.gi_wg_cd(), r.gr_wg_cd()))
					&& (MSC_IO_ACT_TYP.isXFR_GI(r.io_act_typ()) || MSC_IO_ACT_TYP.isXFR_GR(r.io_act_typ()))
					&& !MAC_STR.isNULL_VAL(r.stk_arrv_bp_cd())){
				r.sppl_cd(giLocR.sppl_cd());
			}
		}

		protected void cmplSlsR(IoAct_Upd01_DtlR wkR,
				MCList<IoAct_Upd01_DtlR> rowsList) {

			//出庫場所の管轄区分が生産の場合かつ在庫着荷先が指定されていない場合（預り入庫になる場合）
			//倉入出庫、倉入入庫を補完
			if (MAC_LOC_MNG_TYP.isPRD(getLoc(wkR.gi_loc_cd()).loc_mng_typ())
					&& (MAC_STR.isNULL_VAL(wkR.stk_arrv_bp_cd()) || isNull(wkR.stk_arrv_bp_cd()))) {
				cmplPrdctWhR(wkR, rowsList);
				return;
			}

			rowsList.add(wkR);
		}

		protected void cmplSlsRtnGrR(IoAct_Upd01_DtlR wkR,
				MCList<IoAct_Upd01_DtlR> rowsList) {

			rowsList.add(wkR);

			//入庫場所の管轄区分が生産の場合
			//戻入出庫、戻入入庫を補完
			if (MAC_LOC_MNG_TYP.isPRD(getLoc(wkR.gr_loc_cd()).loc_mng_typ())) {
				cmplPrdctWhRtnR(wkR, rowsList);
			}

			//入庫場所の管轄区分が生産でも戻入が発生するので資産区分は「自社（販売）」
			wkR.asst_typ(MAC_ASST_TYP.CO_SLS.value());

			//出庫情報をクリア
			wkR.gi_wg_cd(null);
			wkR.gi_loc_cd(null);
			wkR.gi_str_ln_cd(null);
			wkR.gi_gd_cd(null);
		}

		protected void cmplShipRtnGrR(IoAct_Upd01_DtlR wkR,
				MCList<IoAct_Upd01_DtlR> rowsList) {

			rowsList.add(wkR);

			//返品元場所の管轄区分が生産の場合かつ配送先ＣＤはNULL(納品先からの出荷返品)の場合
			//戻入出庫、戻入入庫を補完
			if (MAC_LOC_MNG_TYP.isPRD(getLoc(wkR.gi_loc_cd()).loc_mng_typ())
					&& isNull(wkR.tdlv_cd())) {
				cmplPrdctWhRtnR(wkR, rowsList);
			}
			//返品元場所と入庫場所が異なる場合
			//移出、移入を補完
			if (!isSame(wkR.gi_loc_cd(), wkR.gr_loc_cd()) || !isSame(wkR.gi_str_ln_cd(), wkR.gr_str_ln_cd())) {
				cmplXfrFromRetLocToArrLoc(wkR, rowsList);
			}

			//返品元場所の管轄区分が生産でも戻入が発生するので資産区分は「自社（販売）」
			if (MAC_LOC_MNG_TYP.isPRD(getLoc(wkR.gi_loc_cd()).loc_mng_typ())
					&& isNull(wkR.tdlv_cd())) {
				wkR.asst_typ(MAC_ASST_TYP.CO_SLS.value());
			}

			//出荷返品では場所は変わらない想定とする
			wkR.gr_wg_cd(wkR.gi_wg_cd());
			wkR.gr_loc_cd(wkR.gi_loc_cd());
			wkR.gr_str_ln_cd(wkR.gi_str_ln_cd());

			//出庫情報をクリア
			wkR.gi_wg_cd(null);
			wkR.gi_loc_cd(null);
			wkR.gi_str_ln_cd(null);
			wkR.gi_gd_cd(null);
		}

		protected void cmplPrdctWhRtnR(IoAct_Upd01_DtlR wkR,
				MCList<IoAct_Upd01_DtlR> rowsList) {

			IoAct_Upd01_DtlR addR1 = wkR.clone();
			//戻入出庫
			addR1.io_act_typ(MSC_IO_ACT_TYP.PRDCT_WH_RTN_GI.value());
			addR1.par_slip_io_act_typ(addR1.io_act_typ());
			addR1.asst_typ(MAC_ASST_TYP.CO_SLS.value());
			addR1.gr_wg_cd(null);
			addR1.gr_loc_cd(null);
			addR1.gr_str_ln_cd(null);
			addR1.gi_gd_cd(addR1.gr_gd_cd());
			addR1.gr_gd_cd(null);
			addR1.dlv_cd(null);
			addR1.tdlv_cd(null);
			addR1.cst_cd(null);

			addR1.slip_cmpl_flg(true);
			addR1.no_gi_alloc_flg(true);

			//戻入入庫
			IoAct_Upd01_DtlR addR2 = addR1.clone();
			addR2.io_act_typ(MSC_IO_ACT_TYP.PRDCT_WH_RTN_GR.value());
			addR2.asst_typ(MAC_ASST_TYP.CO_PROD.value());
			addR2.gr_wg_cd(addR2.gi_wg_cd());
			addR2.gi_wg_cd(null);
			addR2.gr_loc_cd(addR2.gi_loc_cd());
			addR2.gr_str_ln_cd(addR2.gi_str_ln_cd());
			addR2.gi_loc_cd(null);
			addR2.gi_str_ln_cd(null);
			addR2.gr_gd_cd(addR2.gi_gd_cd());
			addR2.gi_gd_cd(null);

			//（出荷返品入庫 -> ）戻入出庫 -> 戻入入庫 
			rowsList.add(addR1);
			rowsList.add(addR2);
		}

		protected void cmplXfrFromRetLocToArrLoc(IoAct_Upd01_DtlR wkR,
				MCList<IoAct_Upd01_DtlR> rowsList) {

			//移出
			IoAct_Upd01_DtlR addR1 = wkR.clone();
			addR1.io_act_typ(MSC_IO_ACT_TYP.XFR_GI.value());
			addR1.par_slip_io_act_typ(addR1.io_act_typ());
			addR1.gi_gd_cd(addR1.gr_gd_cd());
			addR1.dlv_cd(null);
			addR1.tdlv_cd(null);
			addR1.cst_cd(null);
			addR1.slip_cmpl_flg(true);
			addR1.no_gi_alloc_flg(true);

			//移入
			IoAct_Upd01_DtlR addR2 = addR1.clone();
			addR2.io_act_typ(MSC_IO_ACT_TYP.XFR_GR.value());
			addR2.gr_gd_cd(addR2.gi_gd_cd());

			//出荷返品入庫 （-> 戻入出庫 -> 戻入入庫） -> 移出 -> 移入
			rowsList.add(addR1);
			rowsList.add(addR2);
		}

		protected void cmplExShipOutR(IoAct_Upd01_DtlR wkR, MCList<IoAct_Upd01_DtlR> rowsList) {

			//出庫場所の管轄区分が生産の場合
			//倉入出庫・倉入入庫を補完

			if (MAC_LOC_MNG_TYP.isPRD(getLoc(wkR.gi_loc_cd()).loc_mng_typ()) 
					&& !MSC_STK_ID_TYP.isCSTSTK(wkR.stk_id_typ())) {
				cmplPrdctWhR(wkR, rowsList);
				return;
			}

			rowsList.add(wkR);
		}

		protected void cmplShipOutR(IoAct_Upd01_DtlR wkR, MCList<IoAct_Upd01_DtlR> rowsList) {

			//出庫場所の管轄区分が生産かつ配送先経由区分が「しない」かつ
			//在庫識別区分が自社在庫の場合、倉入出庫・倉入入庫を補完

			if (MAC_LOC_MNG_TYP.isPRD(getLoc(wkR.gi_loc_cd()).loc_mng_typ())
					&& MAC_VIA_DLV_TYP.isNOT_VIA(wkR.via_dlv_typ())
					&& MSC_STK_ID_TYP.isCOSTK(wkR.stk_id_typ())) {
				cmplPrdctWhR(wkR, rowsList);
				return;
			}

			rowsList.add(wkR);
		}

		protected void cmplPrdctWhR(IoAct_Upd01_DtlR wkR, MCList<IoAct_Upd01_DtlR> rowsList) {

			IoAct_Upd01_DtlR addR1 = wkR.clone();
			//倉入出庫
			addR1.io_act_typ(MSC_IO_ACT_TYP.PRDCT_WH_GI.value());
			addR1.par_slip_io_act_typ(addR1.io_act_typ());
			addR1.asst_typ(MAC_ASST_TYP.CO_PROD.value());
			addR1.slip_cmpl_flg(true);

			//倉入入庫
			IoAct_Upd01_DtlR addR2 = addR1.clone();
			addR2.io_act_typ(MSC_IO_ACT_TYP.PRDCT_WH_GR.value());
			addR2.asst_typ(MAC_ASST_TYP.CO_SLS.value());
			addR2.gr_wg_cd(addR2.gi_wg_cd());
			addR2.gi_wg_cd(null);
			addR2.gr_loc_cd(addR2.gi_loc_cd());
			addR2.gr_str_ln_cd(addR2.gi_str_ln_cd());
			addR2.gi_loc_cd(null);
			addR2.gi_str_ln_cd(null);
			addR2.gr_gd_cd(addR2.gi_gd_cd());
			addR2.gi_gd_cd(null);

			//倉入の発生元の資産区分は「自社（販売）」
			wkR.asst_typ(MAC_ASST_TYP.CO_SLS.value());

			//倉入出庫 -> 倉入入庫 -> 出荷または輸出出荷または売上（預り）
			if (!MSC_TRN_TYP.isIV(wkR.trn_typ())) {
				// トランザクション区分がインボイスの場合、補完不要
				rowsList.add(addR1);
				rowsList.add(addR2);
			}
			rowsList.add(wkR);

		}
		protected void cmplPrdctWhWithOutsrcR(IoAct_Upd01_DtlR wkR, MCList<IoAct_Upd01_DtlR> rowsList) {

			if (!isNull(wkR.mfg_inst_no())
					&& MAC_LOC_MNG_TYP.isSLS(getLoc(wkR.gr_loc_cd()).loc_mng_typ())
					&& !MSC_IO_ACT_TYP.isACCPT_DFCT_GR(wkR.io_act_typ())) {

				IoAct_Upd01_DtlR addR0 = wkR.clone();
				//倉入の発生元の資産区分は「自社（生産）」
				addR0.asst_typ(MAC_ASST_TYP.CO_PROD.value());

				IoAct_Upd01_DtlR addR1 = wkR.clone();
				//倉入出庫
				addR1.io_act_typ(MSC_IO_ACT_TYP.PRDCT_WH_GI.value());
				addR1.par_slip_io_act_typ(addR1.io_act_typ());
				addR1.asst_typ(MAC_ASST_TYP.CO_PROD.value());
				addR1.gi_wg_cd(addR1.gr_wg_cd());
				addR1.gr_wg_cd(null);
				addR1.gi_loc_cd(addR1.gr_loc_cd());
				addR1.gi_str_ln_cd(addR1.gr_str_ln_cd());
				addR1.gr_loc_cd(null);
				addR1.gr_str_ln_cd(null);
				addR1.gi_gd_cd(addR1.gr_gd_cd());
				addR1.gr_gd_cd(null);
				addR1.mfg_inst_no(null);
				addR1.strg_loc_cd(null);
				addR1.slip_cmpl_flg(true);
				addR1.no_gi_alloc_flg(true);
				clearAmtInfo(addR1);
				clearSpplInfo(addR1);

				//倉入入庫
				IoAct_Upd01_DtlR addR2 = wkR.clone();
				addR2.io_act_typ(MSC_IO_ACT_TYP.PRDCT_WH_GR.value());
				addR2.par_slip_io_act_typ(addR2.io_act_typ());
				addR2.asst_typ(MAC_ASST_TYP.CO_SLS.value());
				addR2.mfg_inst_no(null);
				addR2.strg_loc_cd(null);
				addR2.slip_cmpl_flg(true);
				clearAmtInfo(addR2);
				clearSpplInfo(addR2);

				//仕入 -> 倉入出庫 -> 倉入入庫
				rowsList.add(addR0);
				rowsList.add(addR1);
				rowsList.add(addR2);
			}
			else {
				rowsList.add(wkR);
			}
		}

		protected void cmplPrdctWhRtnWithOutsrcR(IoAct_Upd01_DtlR wkR, MCList<IoAct_Upd01_DtlR> rowsList) {

			if (!isNull(wkR.mfg_inst_no())
					&& MAC_LOC_MNG_TYP.isSLS(getLoc(wkR.gi_loc_cd()).loc_mng_typ())) {

				IoAct_Upd01_DtlR addR0 = wkR.clone();
				//返品出庫の発生元の資産区分は「自社（生産）」
				addR0.asst_typ(MAC_ASST_TYP.CO_PROD.value());
				addR0.no_gi_alloc_flg(true);

				IoAct_Upd01_DtlR addR1 = wkR.clone();
				//戻入出庫
				addR1.io_act_typ(MSC_IO_ACT_TYP.PRDCT_WH_RTN_GI.value());
				addR1.par_slip_io_act_typ(addR1.io_act_typ());
				addR1.asst_typ(MAC_ASST_TYP.CO_SLS.value());
				addR1.mfg_inst_no(null);
				addR1.strg_loc_cd(null);
				addR1.slip_cmpl_flg(true);
				clearAmtInfo(addR1);
				clearSpplInfo(addR1);

				//戻入入庫
				IoAct_Upd01_DtlR addR2 = wkR.clone();
				addR2.io_act_typ(MSC_IO_ACT_TYP.PRDCT_WH_RTN_GR.value());
				addR2.par_slip_io_act_typ(addR2.io_act_typ());
				addR2.asst_typ(MAC_ASST_TYP.CO_PROD.value());
				addR2.gr_wg_cd(addR2.gi_wg_cd());
				addR2.gi_wg_cd(null);
				addR2.gr_loc_cd(addR2.gi_loc_cd());
				addR2.gr_str_ln_cd(addR2.gi_str_ln_cd());
				addR2.gi_loc_cd(null);
				addR2.gi_str_ln_cd(null);
				addR2.gr_gd_cd(addR2.gi_gd_cd());
				addR2.gi_gd_cd(null);
				addR2.mfg_inst_no(null);
				addR2.strg_loc_cd(null);
				addR2.slip_cmpl_flg(true);
				clearAmtInfo(addR2);
				clearSpplInfo(addR2);

				//戻入出庫 -> 戻入入庫 -> 返品出庫
				rowsList.add(addR1);
				rowsList.add(addR2);
				rowsList.add(addR0);
			}
			else {
				rowsList.add(wkR);
			}
		}

		protected void cmplInspR(IoAct_Upd01_DtlR wkR, MCList<IoAct_Upd01_DtlR> rowsList) {

			//荷姿振替単位ＣＤ、荷姿振替数量が指定された場合
			//荷姿振替を起こす
			if (!isNull(wkR.pack_xfr_unit_cd()) && !isNull(wkR.pack_xfr_qty())) {
				cmplPackXfrR(wkR, rowsList);
				return;
			}
			//該当しない場合
			rowsList.add(wkR);
		}

		protected void cmplPackXfrR(IoAct_Upd01_DtlR wkR, MCList<IoAct_Upd01_DtlR> rowsList) {
			//荷姿振替単位ＣＤ、荷姿振替数量が指定された場合の荷姿振替

			MAM_ITM_R itm = getItm(wkR.itm_cd(), wkR.itm_sub1(), wkR.itm_sub2(), wkR.itm_sub3());
			MAVM_ITM_UNIT_R itmUnit = getItmUnit(wkR.itm_cd(), wkR.itm_sub1()
													, wkR.itm_sub2(), wkR.itm_sub3(), wkR.pack_xfr_unit_cd());

			//荷姿振替単位を基準単位に換算
			MCNumber qty = convToBaseUnit(
							wkR.pack_xfr_qty(), itmUnit.conv_base_qty(), itmUnit.conv_qty()
							, itm.dec_place(), itm.rnd_typ());

			IoAct_Upd01_DtlR addR1 = wkR.clone();
			//荷姿振替出庫
			addR1.io_act_typ(MSC_IO_ACT_TYP.XFR_PACK_GI.value());
			addR1.par_slip_io_act_typ(addR1.io_act_typ());

			addR1.trd_unit_cd(wkR.pack_xfr_unit_cd());
			addR1.trd_unit_qty(wkR.pack_xfr_qty());
			addR1.pack_unit_cd(wkR.pack_xfr_unit_cd());
			addR1.pack_unit_qty(wkR.pack_xfr_qty());
			addR1.base_unit_qty(qty);

			addR1.slip_cmpl_flg(true);

			//荷姿
			IoAct_Upd01_DtlR addR2 = addR1.clone();
			addR2.io_act_typ(MSC_IO_ACT_TYP.XFR_PACK_GR.value());
			addR2.gr_wg_cd(addR2.gi_wg_cd());
			addR2.gi_wg_cd(null);
			addR2.gr_loc_cd(addR2.gi_loc_cd());
			addR2.gr_str_ln_cd(addR2.gi_str_ln_cd());
			addR2.gi_loc_cd(null);
			addR2.gi_str_ln_cd(null);
			addR2.gr_gd_cd(addR2.gi_gd_cd());
			addR2.gi_gd_cd(null);

			//基準単位に換算した結果
			addR2.trd_unit_cd(wkR.base_unit_cd());
			addR2.trd_unit_qty(qty);
			addR2.pack_unit_cd(wkR.base_unit_cd());
			addR2.pack_unit_qty(qty);
			addR2.base_unit_qty(qty);

			if (!isNull(addR2.wia_io_typ())) {
				//検査の更新時に元伝を特定するために入出庫区分を使用するため、
				//補完された受払にも入出庫区分を設定しておく
				addR2.wia_io_typ(MSC_IO_TYP.GR.value());
			}

			//荷姿振替出庫 -> 荷姿振替入庫 -> 仕入系出庫または検査系出庫
			rowsList.add(addR1);
			rowsList.add(addR2);
			rowsList.add(wkR);
		}

		protected void cmplInspSmplGiR(IoAct_Upd01_DtlR wkR, MCList<IoAct_Upd01_DtlR> rowsList) {
			//仕入実績時の検査抜取

			IoAct_Upd01_DtlR addR1 = wkR.clone();
			//検査抜取
			addR1.io_act_typ(MSC_IO_ACT_TYP.INSP_SMPL_GI.value());
			addR1.par_slip_io_act_typ(addR1.io_act_typ());

			addR1.trd_unit_cd(wkR.base_unit_cd());
			addR1.trd_unit_qty(wkR.stktk_diff_qty());
			addR1.pack_unit_cd(wkR.base_unit_cd());
			addR1.pack_unit_qty(wkR.stktk_diff_qty());
			addR1.base_unit_qty(wkR.stktk_diff_qty());
			// 後続のcmplXfrFromGrToStrgで移動した場合は出庫場所を変更する
			if ((!isNull(wkR.strg_loc_cd()) && !isNull(wkR.strg_str_ln_cd()))
					&& ((!isSame(wkR.gr_loc_cd(), wkR.strg_loc_cd()) 
							|| !isSame(wkR.gr_str_ln_cd(), wkR.strg_str_ln_cd())))) {
				addR1.gi_wg_cd(getLoc(addR1.strg_loc_cd()).wg_cd());
				addR1.gi_loc_cd(addR1.strg_loc_cd());
				addR1.gi_str_ln_cd(addR1.strg_str_ln_cd());
			}
			else {
				addR1.gi_wg_cd(addR1.gr_wg_cd());
				addR1.gi_loc_cd(addR1.gr_loc_cd());
				addR1.gi_str_ln_cd(addR1.gr_str_ln_cd());
			}
			addR1.bd_dpt_cd(wkR.bd_dpt_cd());
			wkR.bd_dpt_cd(null);
			addR1.gi_gd_cd(addR1.gr_gd_cd());
			addR1.gr_wg_cd(null);
			addR1.gr_dpt_cd(null);
			addR1.gr_loc_cd(null);
			addR1.purc_usr_cd(null);
			addR1.psppl_cd(null);
			addR1.bsppl_cd(null);
			addR1.asppl_cd(null);
			addR1.sppl_cd(null);
			addR1.purc_typ(null);
			addR1.area_cd(null);
			addR1.cntry_cd(null);
			addR1.strg_loc_cd(null);
			addR1.strg_str_ln_cd(null);
			addR1.po_no(null);
			clearAmtInfo(addR1);

			addR1.slip_cmpl_flg(true);
			addR1.no_gi_alloc_flg(true);

			rowsList.add(addR1);
		}

		protected void cmplXfrGrR(IoAct_Upd01_DtlR wkR, MCList<IoAct_Upd01_DtlR> rowsList) {
			IoAct_Upd01_DtlR addR = wkR.clone();
			rowsList.add(addR);

			//格納場所と格納棚・ラインが指定されており、
			//入庫場所（積送中の場所）と格納場所（入荷の場所）が異なる場合、または、
			//入庫棚・ライン（積送中の棚・ライン）と格納棚・ライン（入荷の棚・ライン）が異なる場合
			//入庫場所から格納場所への移動・移送出庫／入庫を補完する
			if ((!isNull(wkR.strg_loc_cd()) && !isNull(wkR.strg_str_ln_cd()))
						&& ((!isSame(wkR.gr_loc_cd(), wkR.strg_loc_cd()) 
								|| !isSame(wkR.gr_str_ln_cd(), wkR.strg_str_ln_cd())))) {
				cmplXfrFromGrToStrg(wkR, rowsList);

				wkR.gr_wg_cd(getLoc(wkR.strg_loc_cd()).wg_cd());
				wkR.gr_loc_cd(wkR.strg_loc_cd());
				wkR.gr_str_ln_cd(wkR.strg_str_ln_cd());
			}

			//業務理由ＣＤが他勘定出庫である場合
			if (!isNull(wkR.rsn_cd()) && getBizRsn(wkR.rsn_cd()).acxfr_gi_flg() ) {

				IoAct_Upd01_DtlR addR1 = wkR.clone();
				//他勘定振替出庫
				addR1.io_act_typ(MSC_IO_ACT_TYP.ACXFR_GI.value());
				addR1.par_slip_io_act_typ(addR1.io_act_typ());
				addR1.gi_wg_cd(addR1.gr_wg_cd());
				addR1.gr_wg_cd(null);
				addR1.gi_loc_cd(addR1.gr_loc_cd());
				addR1.gi_str_ln_cd(addR1.gr_str_ln_cd());
				addR1.gr_loc_cd(null);
				addR1.gr_str_ln_cd(null);
				addR1.gi_gd_cd(addR1.gr_gd_cd());
				addR1.gr_gd_cd(null);

				addR1.slip_cmpl_flg(true);
				addR1.no_gi_alloc_flg(true);

				rowsList.add(addR1);
			}
		}

		protected void cmplArrR(IoAct_Upd01_DtlR wkR, MCList<IoAct_Upd01_DtlR> rowsList) {

			//入荷パタンが未着の場合
			if (MSC_ARR_PTN_TYP.isN_YET_ARR(wkR.arr_ptn_typ())) {

				//格納場所と格納棚・ラインが指定されており、
				//入庫場所（仕入の場所）と格納場所（入荷の場所）が異なる場合、または、
				//入庫棚・ライン（仕入の棚・ライン）と格納棚・ライン（入荷の棚・ライン）が異なる場合
				//入庫場所から格納場所への移動・移送出庫／入庫を補完する
				if ((!isNull(wkR.strg_loc_cd()) && !isNull(wkR.strg_str_ln_cd()))
							&& ((!isSame(wkR.gr_loc_cd(), wkR.strg_loc_cd()) 
									|| !isSame(wkR.gr_str_ln_cd(), wkR.strg_str_ln_cd())))) {

						cmplXfrFromGrToStrg(wkR, rowsList);
				}
				cmplPrdctWhWithOutsrcR(wkR, rowsList);
				return;
			}

			rowsList.add(wkR);
		}

		protected void cmplPurcGiR(IoAct_Upd01_DtlR wkR, MCList<IoAct_Upd01_DtlR> rowsList) {

			//荷姿振替単位ＣＤ、荷姿振替数量が指定された場合
			//荷姿振替を起こす
			if (!isNull(wkR.pack_xfr_unit_cd()) && !isNull(wkR.pack_xfr_qty())) {
				cmplPackXfrR(wkR, rowsList);
				return;
			}

			rowsList.add(wkR);
		}

		protected void cmplPurcGrR(IoAct_Upd01_DtlR wkR, MCList<IoAct_Upd01_DtlR> rowsList) {

			//入荷パタンが通常の場合
			if (MSC_ARR_PTN_TYP.isNRML(wkR.arr_ptn_typ())) {

				// 棚差数が指定された場合、検査抜取を起こす
				if (!isNull(wkR.stktk_diff_qty())) {
					cmplInspSmplGiR(wkR, rowsList);
				}

				//格納場所と格納棚・ラインが指定されており、
				//入庫場所（入荷の場所）と格納場所（仕入の場所）が異なる場合、または、
				//入庫棚・ライン（入荷の棚・ライン）と格納棚・ライン（仕入の棚・ライン）が異なる場合
				//入庫場所から格納場所への移動・移送出庫／入庫を補完する
				if ((!isNull(wkR.strg_loc_cd()) && !isNull(wkR.strg_str_ln_cd()))
						&& ((!isSame(wkR.gr_loc_cd(), wkR.strg_loc_cd()) 
								|| !isSame(wkR.gr_str_ln_cd(), wkR.strg_str_ln_cd())))) {

					cmplXfrFromGrToStrg(wkR, rowsList);
				}
				cmplPrdctWhWithOutsrcR(wkR, rowsList);
				return;
			}
			//入荷パタンが未着の場合
			else if (MSC_ARR_PTN_TYP.isN_YET_ARR(wkR.arr_ptn_typ())) {
				//入荷後に販売倉入を作るので生産資産とする
				if (!isNull(wkR.mfg_inst_no())
						&& MAC_LOC_MNG_TYP.isSLS(getLoc(wkR.gr_loc_cd()).loc_mng_typ())
						&& !MSC_IO_ACT_TYP.isACCPT_DFCT_GR(wkR.io_act_typ())) {
					wkR.asst_typ(MAC_ASST_TYP.CO_PROD.value());
				}

				//仕入入庫、有償受給入庫、経費購買入庫の場合
				if (MSC_IO_ACT_TYP.isPURC_GR(wkR.io_act_typ())
						|| MSC_IO_ACT_TYP.isONR_RCV_GR(wkR.io_act_typ())
							|| MSC_IO_ACT_TYP.isXPNS_PURC_GR(wkR.io_act_typ())) {

					cmplPurcXfrOut(wkR, rowsList);
					return;
				}
			}

			rowsList.add(wkR);
		}

		protected void cmplPurcRtnGiR(IoAct_Upd01_DtlR wkR, MCList<IoAct_Upd01_DtlR> rowsList) {
			cmplPrdctWhRtnWithOutsrcR(wkR, rowsList);
		}

		protected void cmplPurcXfrOut(IoAct_Upd01_DtlR wkR,
				MCList<IoAct_Upd01_DtlR> rowsList) {

			//仕入出庫、有償受給出庫または経費購買出庫
			IoAct_Upd01_DtlR addR1 = wkR.clone();

			if (MSC_IO_ACT_TYP.isPURC_GR(wkR.io_act_typ())) {
				addR1.io_act_typ(MSC_IO_ACT_TYP.PURC_GI.value());
			}
			else if (MSC_IO_ACT_TYP.isONR_RCV_GR(wkR.io_act_typ())) {
				addR1.io_act_typ(MSC_IO_ACT_TYP.ONR_RCV_GI.value());
			}
			else {
				addR1.io_act_typ(MSC_IO_ACT_TYP.XPNS_PURC_GI.value());
			}

			addR1.par_slip_io_act_typ(addR1.io_act_typ());
			addR1.gi_wg_cd(addR1.gr_wg_cd());
			addR1.gr_wg_cd(null);
			addR1.gi_loc_cd(addR1.gr_loc_cd());
			addR1.gi_str_ln_cd(addR1.gr_str_ln_cd());
			addR1.gr_loc_cd(null);
			addR1.gr_str_ln_cd(null);
			addR1.gi_gd_cd(addR1.gr_gd_cd());
			addR1.gr_gd_cd(null);

			addR1.rsn_cd(null);
			addR1.purc_dpt_cd(null);
			addR1.ap_dpt_cd(null);

			clearAmtInfo(addR1);

			addR1.slo_no(null);
			addR1.po_no(null);
			addR1.rcpt_iv_no(null);
			addR1.asppl_cd(null);
			addR1.sppl_cd(null);
			addR1.sppl_itm_cd(null);
			addR1.sppl_itm_nm(null);
			addR1.purc_typ(null);

			addR1.slip_cmpl_flg(true);

			//仕入転入
			IoAct_Upd01_DtlR addR2 = addR1.clone();
			addR2.io_act_typ(MSC_IO_ACT_TYP.PURC_XFR_IN.value());

			//積送中
			addR2.in_xfr_typ(MSC_IN_XFR_TYP.IN_XFR.value());

			addR2.gr_wg_cd(addR2.gi_wg_cd());
			addR2.gi_wg_cd(null);
			addR2.gr_loc_cd(addR2.gi_loc_cd());
			addR2.gr_str_ln_cd(addR2.gi_str_ln_cd());
			addR2.gi_loc_cd(null);
			addR2.gi_str_ln_cd(null);
			addR2.gr_gd_cd(addR2.gi_gd_cd());
			addR2.gi_gd_cd(null);

			rowsList.add(wkR);
			rowsList.add(addR1);
			rowsList.add(addR2);

		}

		protected void cmplXfrFromGrToStrg(IoAct_Upd01_DtlR wkR,
				MCList<IoAct_Upd01_DtlR> rowsList) {

			//移出
			IoAct_Upd01_DtlR addR1 = wkR.clone();
			addR1.io_act_typ(MSC_IO_ACT_TYP.XFR_GI.value());
			addR1.par_slip_io_act_typ(addR1.io_act_typ());

			addR1.gi_wg_cd(addR1.gr_wg_cd());
			addR1.gr_wg_cd(getLoc(addR1.strg_loc_cd()).wg_cd());
			addR1.gi_loc_cd(addR1.gr_loc_cd());
			addR1.gi_str_ln_cd(addR1.gr_str_ln_cd());
			addR1.gr_loc_cd(addR1.strg_loc_cd());
			addR1.gr_str_ln_cd(addR1.strg_str_ln_cd());
			addR1.gi_gd_cd(addR1.gr_gd_cd());

			if (MSC_IO_ACT_TYP.isMFG(wkR.io_act_typ())
					|| MSC_IO_ACT_TYP.isBYMFG(wkR.io_act_typ())) {

				addR1.act_usr_cd(addR1.mfg_usr_cd());
				addR1.mfg_usr_cd(null);
			}
			else if (MSC_IO_ACT_TYP.isPURC_GR(wkR.io_act_typ())
					|| MSC_IO_ACT_TYP.isONR_RCV_GR(wkR.io_act_typ())
					|| MSC_IO_ACT_TYP.isXPNS_PURC_GR(wkR.io_act_typ())
					|| MSC_IO_ACT_TYP.isACCPT_DFCT_GR(wkR.io_act_typ())) {

				addR1.act_usr_cd(addR1.purc_usr_cd());
				addR1.purc_usr_cd(null);
			}

			addR1.rsn_cd(null);
			addR1.purc_dpt_cd(null);
			addR1.ap_dpt_cd(null);

			clearAmtInfo(addR1);

			addR1.slo_no(null);
			addR1.po_no(null);
			addR1.rcpt_iv_no(null);
			addR1.asppl_cd(null);
			addR1.sppl_cd(null);
			addR1.sppl_itm_cd(null);
			addR1.sppl_itm_nm(null);
			addR1.purc_typ(null);

			addR1.itm_mfg_inst_no(null);
			addR1.itm_inst_qty(null);
			addR1.mfg_inst_no(null);
			addR1.mfg_act_no(null);
			addR1.mfg_st_qty(null);
			addR1.oper_act_no(null);
			addR1.yield_rate(null);
			addR1.disp_seq(null);

			addR1.strg_loc_cd(null);
			addR1.strg_str_ln_cd(null);

			addR1.par_lot_no(null);
			addR1.par_sublot_no(null);
			addR1.par_sno1(null);
			addR1.par_sno2(null);
			addR1.par_sno3(null);
			addR1.par_sno4(null);
			addR1.mfg_inst_unit_typ(null);

			addR1.slip_cmpl_flg(true);
			addR1.no_gi_alloc_flg(true);

			//移入
			IoAct_Upd01_DtlR addR2 = addR1.clone();
			addR2.io_act_typ(MSC_IO_ACT_TYP.XFR_GR.value());

			rowsList.add(addR1);
			rowsList.add(addR2);
		}

		protected void cmplInptR(IoAct_Upd01_DtlR wkR, MCList<IoAct_Upd01_DtlR> rowsList) {

			// 投入／ロスの出庫引当確認対象外フラグ
			// 出庫場所（製造場所）と投入場所が異なる場合にオンになる
			boolean wkNoGiAllocFlg = wkR.no_gi_alloc_flg();
			//投入時の移動
			//出庫場所（製造場所）と投入場所が異なる場合、または、
			//出庫棚・ライン（製造棚・ライン）と投入棚・ラインが異なる場合
			//投入場所から出庫場所（製造場所）への移動・移送出庫／入庫を補完する
			if (!isSame(wkR.gi_loc_cd(), wkR.inpt_loc_cd()) 
					|| !isSame(wkR.gi_str_ln_cd(), wkR.inpt_str_ln_cd()) ) {

				//移出
				IoAct_Upd01_DtlR addR1 = wkR.clone();
				addR1.io_act_typ(MSC_IO_ACT_TYP.XFR_GI.value());
				addR1.par_slip_io_act_typ(addR1.io_act_typ());
				addR1.rsn_cd(null);
				addR1.gi_wg_cd(getLoc(addR1.inpt_loc_cd()).wg_cd());
				addR1.gr_wg_cd(wkR.gi_wg_cd());
				addR1.bd_dpt_cd(null);
				addR1.act_usr_cd(addR1.mfg_usr_cd());
				addR1.mfg_usr_cd(null);
				addR1.gi_loc_cd(addR1.inpt_loc_cd());
				addR1.gi_str_ln_cd(addR1.inpt_str_ln_cd());
				addR1.gr_loc_cd(wkR.gi_loc_cd());
				addR1.gr_str_ln_cd(wkR.gi_str_ln_cd());
				addR1.gr_gd_cd(addR1.gi_gd_cd());

				//投入場所と製造場所の発注先が同じ場合は支給返品、支給が起きない
				if (!isSame(getLoc(addR1.gi_loc_cd()).sppl_cd(), getLoc(addR1.gr_loc_cd()).sppl_cd())) {
					//在庫着荷先はNULL文字（投入場所が外注であっても先に支給返品が起きている）
					addR1.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());

					//在庫識別区分は無償受給の場合は無償受給のまま、在庫取引先も引き継ぐ。
					//無償受給でない場合、自社在庫、在庫取引先 :NULL文字にする。
					if (!MSC_STK_ID_TYP.isNCV_RCV(wkR.stk_id_typ())) {
						addR1.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
						addR1.stk_bp_cd(MAC_STR.NULL_VAL.value());
					}
					addR1.sppl_cd(null);
				}

				clearAmtInfo(addR1);
				clearInptInfo(addR1);

				addR1.slip_cmpl_flg(true);

				//移入
				IoAct_Upd01_DtlR addR2 = addR1.clone();
				addR2.io_act_typ(MSC_IO_ACT_TYP.XFR_GR.value());

				rowsList.add(addR1);
				rowsList.add(addR2);
				wkNoGiAllocFlg = true;
			}

			//投入時棚差調整（投入場所で入出庫）
			//・受払区分が投入
			//・棚差数が指定されている
			//・負担部門が指定されている
			//・他勘定振替出庫または他勘定振替入庫の業務理由が指定されている
			if (MSC_IO_ACT_TYP.isINPT(wkR.io_act_typ())
					&& !isNull(wkR.stktk_diff_qty())
					&& !isNull(wkR.bd_dpt_cd())
					&& !isNull(wkR.rsn_cd())
					&& (getBizRsn(wkR.rsn_cd()).acxfr_gi_flg() 
							|| getBizRsn(wkR.rsn_cd()).acxfr_gr_flg())) {

				IoAct_Upd01_DtlR addR1 = wkR.clone();

				if (getBizRsn(wkR.rsn_cd()).acxfr_gi_flg()) {
					//他勘定振替出庫
					addR1.io_act_typ(MSC_IO_ACT_TYP.ACXFR_GI.value());
					addR1.par_slip_io_act_typ(addR1.io_act_typ());
					addR1.gi_wg_cd(getLoc(addR1.inpt_loc_cd()).wg_cd());
					addR1.gi_loc_cd(addR1.inpt_loc_cd());
					addR1.gi_str_ln_cd(addR1.inpt_str_ln_cd());
				}
				else {
					//他勘定振替入庫
					addR1.io_act_typ(MSC_IO_ACT_TYP.ACXFR_GR.value());
					addR1.par_slip_io_act_typ(addR1.io_act_typ());
					addR1.gr_wg_cd(getLoc(addR1.inpt_loc_cd()).wg_cd());
					addR1.gi_wg_cd(null);
					addR1.gr_loc_cd(addR1.inpt_loc_cd());
					addR1.gr_str_ln_cd(addR1.inpt_str_ln_cd());
					addR1.gi_loc_cd(null);
					addR1.gi_str_ln_cd(null);
					addR1.gr_gd_cd(addR1.gi_gd_cd());
					addR1.gi_gd_cd(null);
				}
				addR1.stk_id_typ(addR1.acxfr_stk_id_typ());
				addR1.stk_bp_cd(addR1.acxfr_stk_bp_cd());
				addR1.stk_arrv_bp_cd(addR1.acxfr_stk_arrv_bp_cd());
				if (MSC_STK_ID_TYP.isCOSTK(addR1.stk_id_typ())) {
					addR1.asst_typ(MAC_ASST_TYP.CO_PROD.value());
				}
				else {
					addR1.asst_typ(MAC_ASST_TYP.OTH.value());
				}
				//棚差は基準単位
				addR1.trd_unit_qty(addR1.stktk_diff_qty());
				addR1.pack_unit_qty(addR1.stktk_diff_qty());
				addR1.base_unit_qty(addR1.stktk_diff_qty());

				addR1.act_usr_cd(addR1.mfg_usr_cd());
				addR1.mfg_usr_cd(null);

				clearInptInfo(addR1);

				addR1.slip_cmpl_flg(true);

				rowsList.add(addR1);
				wkR.rsn_cd(null);
			}

			if (MSC_IO_ACT_TYP.isINPT(wkR.io_act_typ())) {
				wkR.rsn_cd(wkR.rsn_cd2());
			}
			wkR.no_gi_alloc_flg(wkNoGiAllocFlg);
			//投入、投入（自給）、ロス
			rowsList.add(wkR);

		}

		protected void cmplMfgR(IoAct_Upd01_DtlR wkR, MCList<IoAct_Upd01_DtlR> rowsList) {

			//製造時の移動
			//入庫場所（製造場所）と格納場所が異なる場合、または、
			//入庫棚・ライン（製造棚・ライン）と格納棚・ラインが異なる場合
			//入庫場所から格納場所への移動・移送出庫／入庫を補完する
			if (!isSame(wkR.gr_loc_cd(), wkR.strg_loc_cd()) 
					|| !isSame(wkR.gr_str_ln_cd(), wkR.strg_str_ln_cd()) ) {

				rowsList.add(wkR);
				cmplXfrFromGrToStrg(wkR, rowsList);
				return;
			}

			rowsList.add(wkR);
		}

		protected void clearAmtInfo(IoAct_Upd01_DtlR r) {
			r.trd_cur_cd(null);
			r.trd_cur_upri(null);
			r.trd_cur_amt(null);
			r.trd_cur_proc_amt(null);
			r.trd_cur_onr_prov_amt(null);
			r.trd_cur_tax_amt(null);
			r.base_cur_cd(null);
			r.base_cur_upri(null);
			r.base_cur_amt(null);
			r.base_cur_proc_amt(null);
			r.base_cur_onr_prov_amt(null);
			r.base_cur_tax_amt(null);
			r.ptax_cur_cd(null);
			r.ptax_cur_upri(null);
			r.ptax_cur_amt(null);
			r.ptax_cur_proc_amt(null);
			r.ptax_cur_onr_prov_amt(null);
			r.ptax_cur_tax_amt(null);
			r.tax_cd(null);
			r.xrate_cd(null);
			r.xrate(null);
			r.ptax_xrate_cd(null);
			r.ptax_xrate(null);
			r.wtax_rate(null);
			r.wtax_amt(null);
		}

		protected void clearInptInfo(IoAct_Upd01_DtlR r) {
			r.slo_no(null);
			r.po_no(null);
			r.rcpt_iv_no(null);

			r.itm_mfg_inst_no(null);
			r.itm_inst_qty(null);
			r.mfg_inst_no(null);
			r.mfg_act_no(null);
			r.mfg_st_qty(null);
			r.oper_act_no(null);
			r.yield_rate(null);
			r.disp_seq(null);
			r.oper_cd(null);
			r.inpt_loc_cd(null);
			r.inpt_str_ln_cd(null);

			r.par_itm_cd(null);
			r.par_itm_sub1(null);
			r.par_itm_sub2(null);
			r.par_itm_sub3(null);
			r.par_itm_nm(null);
			r.par_lot_no(null);
			r.par_sublot_no(null);
			r.par_sno1(null);
			r.par_sno2(null);
			r.par_sno3(null);
			r.par_sno4(null);
			r.mfg_inst_unit_typ(null);
		}

		protected void clearSpplInfo(IoAct_Upd01_DtlR r) {
			r.purc_dpt_cd(null);
			r.ap_dpt_cd(null);
			r.po_no(null);
			r.iv_no(null);
			r.rcpt_iv_no(null);
			r.psppl_cd(null);
			r.bsppl_cd(null);
			r.asppl_cd(null);
			r.sppl_cd(null);
			r.cred_cd(null);
			r.spot_flg(false);
			r.sppl_itm_cd(null);
			r.sppl_itm_nm(null);
			r.purc_typ(null);
			r.area_cd(null);
			r.cntry_cd(null);
		}
		protected void copyL(MCList<MSW_IO_ACT_R> selectL,
				MCList<IoAct_Upd01_DtlR> wkL) {

			Map_IoAct_Upd01_DtlR_MSW_IO_ACT_R<IoAct_Upd01_DtlR, MSW_IO_ACT_R> map = createMap_IoAct_Upd01_DtlR_MSW_IO_ACT_R();
			for (MSW_IO_ACT_R r : selectL) {

				IoAct_Upd01_DtlR updR = IoAct_Upd01_DtlR.create();
				copy(updR, r , map);

				setSno(updR);

				wkL.add(updR);
			}
		}

		protected void setSno(IoAct_Upd01_DtlR r) {

			if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.sno1_mng_typ())) {
				r.sno1(MAC_STR.NULL_VAL.value());
			}
			if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.sno2_mng_typ())) {
				r.sno2(MAC_STR.NULL_VAL.value());
			}
			if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.sno3_mng_typ())) {
				r.sno3(MAC_STR.NULL_VAL.value());
			}
			if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.sno4_mng_typ())) {
				r.sno4(MAC_STR.NULL_VAL.value());
			}
		}

		protected void updMain(MCList<IoAct_Upd01_DtlR> updL) {

			// 受払実績更新
			updIoAct();
			insIoAct(updL);

			// ロットトレース情報の作成
			callLotTraceSv(updL);

			// 現状在庫の更新
			updSTK(updL);

			// 引当可能数チェック
			chkAlloc(updL);
			if (_msgList.size() > 0) {
				setError(_msgList);
			}

			// ロット情報の削除
			delLOT();

		}

		protected static final String PEG_NO_COL = "__peg_no__";

		protected void chkAlloc(MCList<IoAct_Upd01_DtlR> updL) {

			MSBEL_AllocMngService.Alloc_Srch01 opeAlloc = MSBEL_AllocMngService.crtAlloc_Srch01();

			// updLには紐付けＮＯがないため、一時カラムを追加
			updL.addNumberColumn(PEG_NO_COL);
			setPegNo(PEG_NO_COL, updL);

			// 出庫引当確認対象となったupdLを格納
			MCList<IoAct_Upd01_DtlR> updTgtL = MCList.create(IoAct_Upd01_DtlR.class);
			selectLotL(updL);

			for (IoAct_Upd01_DtlR r : updL) {
				if (isChkAlloc(r)) {
					updTgtL.add(r);
					Srch_TgtR up1 = Srch_TgtR.create();
					copy(up1, r, createMap_Srch_TgtR_IoAct_Upd01_DtlR());
					if (!isNullOrNullVal(r.lot_no())) {
						MSVT_LOT_LIST_R lot = _lotListCache.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.lot_no(), r.sublot_no());
						up1.ver_no(lot.ver_no());
					}
					opeAlloc.up1().add(up1);
				}
			}
			if (!opeAlloc.up1().isEmpty()) {
				opeAlloc.up0().stk_flg(false);
				opeAlloc.up0().short_ope_typ(MSC_SHORT_OPE_TYP.PROCEED.value());
				opeAlloc.up0().lot_prop_typ(MSC_LOT_PROP_TYP.SRCH_LOC.value());
				opeAlloc.up0().except_alloc_wait_flg(false);
				opeAlloc.up0().nm_srch_flg(false);
				opeAlloc.up0().dtl_flg(true);
				opeAlloc.up0().gi_alloc_flg(true);
				opeAlloc.setLotChkFlg(_lot_chk_off_flg);

				opeAlloc.exec();

				// updLと未引当情報をマッチングし、未引当情報からロット・サブロットが一致するレコードまたはロット・サブロットが未設定のレコードを抽出
				MCList<IoAct_Upd01_DtlR> msgTgtL = getMsgTgtNotAllocL(updTgtL, opeAlloc.down2());

				//未引当情報が存在する場合はエラー
				if(!msgTgtL.isEmpty()) {
					MCList<IoAct_Upd01_DtlR> msgL = msgTgtL.groupBy(getKey(true, true, true, false));
					for (IoAct_Upd01_DtlR r : msgL) {
						MCMessage aMsg = new MCMessage(
								r,
								null,
								MSBEL0085,
								toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
								r.gi_loc_cd(), r.gi_str_ln_cd(),
								r.lot_no(), r.sublot_no(),
								toDispSno(r.sno1(), r.sno2(), r.sno3(), r.sno4()),
								r.pack_unit_cd(), r.gd_cd(),
								r.quality_typ(), r.stk_id_typ(), r.stk_bp_cd());
						_msgList.add(aMsg);
					}
				}
			}
		}

		protected MCList<Srch_TgtR> getNotAllocL(MCList<IoAct_Upd01_DtlR> updL,
				MCList<Srch_TgtR> downL) {
			MCList<Srch_TgtR> notAllocL = MCList.create(Srch_TgtR.class);

			// updLとdownLを紐付けＮＯでマッチングし、ロット・サブロットが一致するレコードまたはロット・サブロットが未設定のレコードを抽出する
			MCIndexKey lotSublotIdx = downL.createIndex(Srch_TgtR.$peg_no, Srch_TgtR.$lot_no, Srch_TgtR.$sublot_no);
			MCIndexKey lotIdx = downL.createIndex(Srch_TgtR.$peg_no, Srch_TgtR.$lot_no);
			for (IoAct_Upd01_DtlR updR : updL) {
				// ロット・サブロットが一致する
				notAllocL.addAll(downL.subList(lotSublotIdx, updR.getNumberNE(PEG_NO_COL), updR.lot_no(), updR.sublot_no()));
				// ロットがnull
				notAllocL.addAll(downL.subList(lotIdx, updR.getNumberNE(PEG_NO_COL), null));
			}

			return notAllocL;
		}

		protected MCList<IoAct_Upd01_DtlR> getMsgTgtNotAllocL(MCList<IoAct_Upd01_DtlR> updL,
				MCList<Srch_TgtR> downL) {

			MCList<Srch_TgtR> strLnLotFixList = downL.subList(r -> !MAC_STR.isNULL_VAL(r.gi_str_ln_cd()) && !r.not_lot_fix_flg());
			MCList<Srch_TgtR> strLnNotFixList = downL.subList(r -> !MAC_STR.isNULL_VAL(r.gi_str_ln_cd()) && r.not_lot_fix_flg());
			MCList<Srch_TgtR> lotFixList = downL.subList(r -> MAC_STR.isNULL_VAL(r.gi_str_ln_cd()) && !r.not_lot_fix_flg());
			MCList<Srch_TgtR> notLotFixList = downL.subList(r -> MAC_STR.isNULL_VAL(r.gi_str_ln_cd()) && r.not_lot_fix_flg());

			MCList<IoAct_Upd01_DtlR> msgTgtL = MCList.create(IoAct_Upd01_DtlR.class);

			getMsgTgtL(updL, msgTgtL, strLnLotFixList, true, true, true);
			getMsgTgtL(updL, msgTgtL, strLnNotFixList, true, false, true);
			getMsgTgtL(updL, msgTgtL, lotFixList, false, true, true);
			getMsgTgtL(updL, msgTgtL, notLotFixList, false, false, true);

			return msgTgtL;
		}

		protected void getMsgTgtL(MCList<IoAct_Upd01_DtlR> updL,
				MCList<IoAct_Upd01_DtlR> msgTgtL, MCList<Srch_TgtR> notAllocList,
				boolean isStrln, boolean isLot, boolean isMatch) {

			MCIndexKey updPackIdx = updL.createIndex(getKey(isStrln, isLot, true, isMatch));
			MCIndexKey updNotPackIdx = updL.createIndex(getKey(isStrln, isLot, false, isMatch));

			for (Srch_TgtR r : notAllocList) {
				IoAct_Upd01_DtlR matchR = IoAct_Upd01_DtlR.create();
				if (r.pack_alloc_flg()) {
					matchR = updL.getFirst(updPackIdx, r.toArray(getTgtKey(isStrln, isLot, true)));
				} 
				else {
					matchR = updL.getFirst(updNotPackIdx, r.toArray(getTgtKey(isStrln, isLot, false)));
				}

				msgTgtL.add(matchR);
			}
		}

		protected String[] getTgtKey(boolean isStrln, boolean isLot, boolean isPackAlloc) {

			ArrayList<String> l = new ArrayList<String>();

			l.add(Srch_TgtR.$itm_cd);
			l.add(Srch_TgtR.$itm_sub1);
			l.add(Srch_TgtR.$itm_sub2);
			l.add(Srch_TgtR.$itm_sub3);
			l.add(Srch_TgtR.$gi_loc_cd);
			if (isStrln) {
				l.add(Srch_TgtR.$gi_str_ln_cd);
			}
			l.add(Srch_TgtR.$gi_stk_arrv_bp_cd);
			l.add(Srch_TgtR.$quality_typ);
			l.add(Srch_TgtR.$stk_id_typ);
			l.add(Srch_TgtR.$stk_bp_cd);
			l.add(Srch_TgtR.$gd_cd);
			l.add(Srch_TgtR.$sno1);
			l.add(Srch_TgtR.$sno2);
			l.add(Srch_TgtR.$sno3);
			l.add(Srch_TgtR.$sno4);
			if (isPackAlloc) {
				l.add(Srch_TgtR.$pack_unit_cd);
			}
			l.add(Srch_TgtR.$base_unit_cd);
			if (isLot) {
				l.add(Srch_TgtR.$lot_no);
				l.add(Srch_TgtR.$sublot_no);
			}

			return l.toArray(new String[0]);
		}

		protected String[] getKey(boolean isStrln, boolean isLot, boolean isPackAlloc, boolean isMatch) {
			
			ArrayList<String> l = new ArrayList<String>();
			
			l.add(IoAct_Upd01_DtlR.$itm_cd);
			l.add(IoAct_Upd01_DtlR.$itm_sub1);
			l.add(IoAct_Upd01_DtlR.$itm_sub2);
			l.add(IoAct_Upd01_DtlR.$itm_sub3);
			if (isMatch) {
				l.add(IoAct_Upd01_DtlR.$loc_cd);
				if (isStrln) {
					l.add(IoAct_Upd01_DtlR.$str_ln_cd);
				}
				l.add(IoAct_Upd01_DtlR.$stk_arrv_bp_cd);
			}
			else {
				l.add(IoAct_Upd01_DtlR.$gi_loc_cd);
				l.add(IoAct_Upd01_DtlR.$gi_str_ln_cd);
			}
			l.add(IoAct_Upd01_DtlR.$quality_typ);
			l.add(IoAct_Upd01_DtlR.$stk_id_typ);
			l.add(IoAct_Upd01_DtlR.$stk_bp_cd);
			l.add(IoAct_Upd01_DtlR.$gd_cd);
			l.add(IoAct_Upd01_DtlR.$sno1);
			l.add(IoAct_Upd01_DtlR.$sno2);
			l.add(IoAct_Upd01_DtlR.$sno3);
			l.add(IoAct_Upd01_DtlR.$sno4);
			if (isPackAlloc) {
				l.add(IoAct_Upd01_DtlR.$pack_unit_cd);
			}
			l.add(IoAct_Upd01_DtlR.$base_unit_cd);
			if (isLot) {
				l.add(IoAct_Upd01_DtlR.$lot_no);
				l.add(IoAct_Upd01_DtlR.$sublot_no);
			}

			return l.toArray(new String[0]);

		}

		protected boolean isChkAlloc(IoAct_Upd01_DtlR r) {

			//引当チェックをしない場合にfalseを返す
			//受払実績ワークの出庫引当対象外フラグがオン
			if (r.no_gi_alloc_flg()) {
				return false;
			}
			//品目マスタの出庫引当確認フラグがオンでない
			if (!getItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()).gi_alloc_flg()){
				return false;
			}
			//赤伝である（伝票状況区分が新規でない）
			if (!MAC_SLIP_STS_TYP.isCRT(r.slip_sts_typ())){
				return false;
			}
			//入出庫区分が出庫の受払でない
			if (!MSC_IO_TYP.isGI(r.io_typ())){
				return false;
			}
			//確定ＮＯ区分がなしでない
			if (!MSC_FIX_NO_TYP.isNON(r.fix_no_typ())){
				return false;
			}
			//在庫検査区分が検査済でない
			if (!MSC_STK_INSP_TYP.isFIN(r.stk_insp_typ())){
				return false;
			}
			//積送品区分が通常でない
			if (!MSC_IN_XFR_TYP.isIN_LOC(r.in_xfr_typ())){
				return false;
			}
			//在庫識別区分が自社在庫、預り、検収不良、無償受給、有償支給でない
			if (!(MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ())
					|| MSC_STK_ID_TYP.isCSTSTK(r.stk_id_typ())
					|| MSC_STK_ID_TYP.isACCPT_DFCT(r.stk_id_typ())
					|| MSC_STK_ID_TYP.isNCV_RCV(r.stk_id_typ())
					|| MSC_STK_ID_TYP.isONR_PROV(r.stk_id_typ()))){
				return false;
			}
			// 投入実績時、受払実績の数量が0
			if(MSC_TRN_TYP.isINPT(r.trn_typ()) && r.tia().trd_unit_qty().isZero()) {
				return false;
			}
			return true;
		}

		protected void callLotTraceSv(MCList<IoAct_Upd01_DtlR> updL) {

			MSBFL_LotTraceService.LotTrace_Upd01 opeLotTrace = MSBFL_LotTraceService.crtLotTrace_Upd01();
			for (IoAct_Upd01_DtlR r : updL) {

				if (isUpdLotTrace(r)) {
					if (MSC_IO_TYP.isGR(r.io_typ())) {
						LotTrace_Upd01_DtlGrR up = LotTrace_Upd01_DtlGrR.create();
						copy(up, r, createMap_LotTrace_Upd01_DtlGrR_IoAct_Upd01_DtlR());

						//品目振替入庫またはロット・手配ＮＯ振替入庫の場合、
						//在庫振替実績ＮＯにヘッダ実績ＮＯを設定する
						if (MSC_IO_ACT_TYP.isXFR_ITM_GR(r.io_act_typ())
								|| MSC_IO_ACT_TYP.isXFR_LOT_SNO_GR(r.io_act_typ())) {
							up.stk_xfr_act_no(r.act_no());
						}

						if (MSC_IO_ACT_TYP.isMFG(r.io_act_typ())
								|| MSC_IO_ACT_TYP.isBYMFG(r.io_act_typ())) {
							up.mfg_loc_cd(r.gr_loc_cd());
							up.strg_loc_cd(r.strg_loc_cd());
						}
						else {
							up.mfg_loc_cd(null);
							up.strg_loc_cd(r.gr_loc_cd());
						}

						up.schd_act_typ(MSC_SCHD_ACT_TYP.ACT.value());

						opeLotTrace.up0().add(up);
					}
					else if (MSC_IO_TYP.isGI(r.io_typ())) {
						LotTrace_Upd01_DtlGiR up = LotTrace_Upd01_DtlGiR.create();
						copy(up, r, createMap_LotTrace_Upd01_DtlGiR_IoAct_Upd01_DtlR());

						//品目振替出庫またはロット・手配ＮＯ振替出庫の場合、
						//在庫振替実績ＮＯにヘッダ実績ＮＯを設定する
						if (MSC_IO_ACT_TYP.isXFR_ITM_GI(r.io_act_typ())
								|| MSC_IO_ACT_TYP.isXFR_LOT_SNO_GI(r.io_act_typ())) {
							up.stk_xfr_act_no(r.act_no());
						}

						up.schd_act_typ(MSC_SCHD_ACT_TYP.ACT.value());

						opeLotTrace.up1().add(up);
					}
				}
			}

			if (opeLotTrace.up0().size() > 0 || opeLotTrace.up1().size() > 0) {
				opeLotTrace.exec();
			}
		}

		protected boolean isUpdLotTrace(IoAct_Upd01_DtlR r) {

			//補完された受払は対象外
			if (r.slip_cmpl_flg()){
				return false;
			}
			//データ更新区分が更新の赤伝は対象外
			if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())
					&& MAC_SLIP_STS_TYP.isCAN(r.slip_sts_typ())){
				return false;
			}
			//受払区分でロットトレース対象でない場合は対象外
			if (!MSC_IO_ACT_TYP.is_upd_lot_trace(r.io_act_typ())){
				return false;
			}
			//物流G内の移動・移送出庫、移動・移送入庫は対象外
			if ((MSC_IO_ACT_TYP.isXFR_GI(r.io_act_typ())
					|| MSC_IO_ACT_TYP.isXFR_GR(r.io_act_typ())
					|| MSC_IO_ACT_TYP.isXFR_RTN_GI(r.io_act_typ())
					|| MSC_IO_ACT_TYP.isXFR_RTN_GR(r.io_act_typ()))
					&& MSC_TRN_TYP.isXFR(r.trn_typ())){
				return false;
			}
			//ロスの受払区分で、業務理由がロットトレース対象外である場合
			if (MSC_IO_ACT_TYP.isLOSS(r.io_act_typ())
					&& !isNull(r.rsn_cd())
					&& getBizRsn(r.rsn_cd()).not_lot_trace_flg()){
				return false;
			}
			return true;
		}

		protected void delLOT() {
			if (!_lotDelL.isEmpty()) {
				MSBFL_LotService.Lot_Del01 opeLotDel = MSBFL_LotService.crtLot_Del01();
				addAll(opeLotDel.up0(), _lotDelL, createMap_Lot_Del01_CndR_IoAct_Upd01_DtlR());
				opeLotDel.exec();
			}
		}

		protected void updIoAct() {
			if (!isNull(_cclIoActCacheL)) {
				_cclIoActCacheL_bldr.setSetVL(_cclIoActCacheL_t.slip_sts_typ, value(MAC_SLIP_STS_TYP.DIS.value()));
				dbUpdateKey("MSBEL5010_MST_IO_ACT_U01", _cclIoActCacheL, _cclIoActCacheL_bldr);
			}
		}

		protected void updSTK(MCList<IoAct_Upd01_DtlR> updL) {

			MSBEL_StkMngService.Stk_Upd01 opeStk = MSBEL_StkMngService.crtStk_Upd01();
			for (IoAct_Upd01_DtlR r : updL) {
				if (isUpdStk(r)) {
					Stk_Upd01_DtlR stkUpRow = Stk_Upd01_DtlR.create();
					copy(stkUpRow, r, createMap_Stk_Upd01_DtlR_IoAct_Upd01_DtlR());
					MAM_ITM_R itm = getItm(r.itm_cd()
											, r.itm_sub1()
											, r.itm_sub2()
											, r.itm_sub3());
					stkUpRow.minus_stk_flg(getMinusStk(itm, r));
					opeStk.up0().add(stkUpRow);
				}
			}
			if (opeStk.up0().size() > 0) {
				opeStk.exec();
			}
		}

		protected boolean isUpdStk(IoAct_Upd01_DtlR r) {
			if ((MSC_IO_TYP.isGI(r.io_typ())
					|| MSC_IO_TYP.isGR(r.io_typ()))
					&& MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())
					&& !MSC_TRN_TYP.isRCV_ACT(r.trn_typ())
					&& !MSC_TRN_TYP.isPAY_SCHD(r.trn_typ())
					&& !MSC_IO_ACT_TYP.isINPT_SLF(r.io_act_typ())
					&& !MSC_IO_ACT_TYP.isLOSS_SLF(r.io_act_typ())
					&& !r.base_unit_qty().isZero()) {
				return true;
			}
			return false;
		}
		protected boolean getMinusStk(MAM_ITM_R itm, IoAct_Upd01_DtlR r) {
			if (!itm.minus_stk_flg()) {
				return false;
			}
			// トランザクション区分：投入実績
			if (MSC_TRN_TYP.isINPT(r.trn_typ())) {
				return true;
			}
			// トランザクション区分：ロス実績
			if (MSC_TRN_TYP.isLOSS(r.trn_typ())) {
				return true;
			}
			// トランザクション区分：移動実績
			if (MSC_TRN_TYP.isXFR(r.trn_typ()) && isSame(getSysParm("MINUS_STK_XFR_FLG"), "1")) {
				return true;
			}
			// トランザクション区分：出荷実績
			if (MSC_TRN_TYP.isSHIP(r.trn_typ()) && isSame(getSysParm("MINUS_STK_SHIP_FLG"), "1")) {
				return true;
			}
			return false;
		}

		protected void insIoAct(MCList<IoAct_Upd01_DtlR> updL) {

			MCList<MST_IO_ACT_R> dbc = MCList.create(MST_IO_ACT_R.class);

			for (IoAct_Upd01_DtlR r : updL) {
				setInvTransFlg(r);
				dbc.add(r.tia()); 
			}
			dbInsert("MSBEL5010_MST_IO_ACT_I01", dbc, MCQueryApiBuilder.create(MST_IO_ACT_R.create("T")));
		}

		protected void setSlipNo(MCList<IoAct_Upd01_DtlR> updL) {

			initSeqCache(updL);
			crtIdxUpdL(updL);

			for (IoAct_Upd01_DtlR r: updL) {
				if (isNull(r.slip_no())){
					r.slip_no(getStrSeq(MSC_NUM_SYS_TYP.SLIP));
				}
			}

			for (IoAct_Upd01_DtlR r: updL) {
				//親伝票ＮＯの設定
				if (isNull(r.par_slip_no())){

					//親伝
					if (isSame(r.io_act_typ(), r.par_slip_io_act_typ())) {
						r.par_slip_no(r.slip_no());
						r.par_slip_seq_no(r.slip_seq_no());
					}
					//子伝
					else {
						//親伝票受払区分から親伝を特定する
						IoAct_Upd01_DtlR parR = updL.getFirst(_ioActIdxUpdL 
																	, r.act_no()
																	, r.act_d_no()
																	, r.act_io_no()
																	, r.trn_typ()
																	, r.par_slip_io_act_typ()
																	, r.slip_sts_typ()
																	);
						r.par_slip_no(parR.slip_no());
						r.par_slip_seq_no(parR.slip_seq_no());
					}
				}
			}
		}

		protected void crtIdxUpdL(MCList<IoAct_Upd01_DtlR> updL) {
			_ioActIdxUpdL = updL.createIndex(IoAct_Upd01_DtlR.$act_no
					, IoAct_Upd01_DtlR.$act_d_no
					, IoAct_Upd01_DtlR.$act_io_no
					, IoAct_Upd01_DtlR.$trn_typ
					, IoAct_Upd01_DtlR.$io_act_typ
					, IoAct_Upd01_DtlR.$slip_sts_typ
					);
		}

		protected void initSeqCache(MCList<IoAct_Upd01_DtlR> updL) {
			int i = 0;
			for (IoAct_Upd01_DtlR r : updL) {
				if (isNull(r.slip_no())) {
					i++;
				}
			}
			if (i > 0) {
				doSeqCache(MSC_NUM_SYS_TYP.SLIP, i);
			}
		}

		protected void createUpdList(MCList<IoAct_Upd01_DtlR> rowsList, MCList<IoAct_Upd01_DtlR> updL) {

			_lotDelL.clear();

			for (IoAct_Upd01_DtlR r : rowsList) {

				if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ()) || MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					makeIoAct_R(r, updL);
				}
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()) || MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					MCList<IoAct_Upd01_DtlR> list = rowsList.subList(_ioActIdx, r.act_no(), r.act_d_no()
																		, r.act_io_no(), r.trn_typ());
					makeIoAct_B(r, list, updL);
				}
				// 外注場所間の支給における、発注先の設定
				setSpplCd(r);
			}
			MAUCL_DptUtil.setCanDpt(updL, null);
		}

		protected void makeIoAct_R(IoAct_Upd01_DtlR r, MCList<IoAct_Upd01_DtlR> updL) {

			// ヘッダ実績ＮＯ、明細実績ＮＯ、トランザクション区分から元伝を取得する
			MCList<MST_IO_ACT_R> orgL = getOrgIoActL(r);

			for (MST_IO_ACT_R orgR : orgL) {

				IoAct_Upd01_DtlR tmprow = IoAct_Upd01_DtlR.create();
				tmprow.tia(orgR);
				tmprow.data_crud_typ(r.data_crud_typ());
				tmprow.slip_seq_no(tmprow.slip_seq_no().add(MCNumber.ONE));
				tmprow.par_slip_seq_no(tmprow.par_slip_seq_no().add(MCNumber.ONE));

				if (!isNull(tmprow.act_seq())) {
					tmprow.act_seq(tmprow.act_seq().add(MCNumber.ONE));
				}
				if (!isNull(tmprow.act_d_seq())) {
					tmprow.act_d_seq(tmprow.act_d_seq().add(MCNumber.ONE));
				}
				if (!isNull(tmprow.act_io_seq())) {
					tmprow.act_io_seq(tmprow.act_io_seq().add(MCNumber.ONE));
				}

				// 更新時は親伝のレコードから子伝や補完された受払に対する赤伝をまとめて更新リストへ入れる
				// 子伝や補完された受払は更新後の受払区分に変更がないかどうかだけチェックする
				// 受払区分に変更がない場合は、伝票ＮＯを引き継ぐ

				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())
						|| (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())
								&& !r.slip_cmpl_flg()
								&& isSame(r.io_act_typ(), r.par_slip_io_act_typ()))) {

					//ロット削除の変数設定
					if (MSC_IO_TYP.isGR(tmprow.io_typ())) {
						if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
							_lotDelL.add(tmprow);
						}
						else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
							if (islotKeyChg(r, tmprow)) {
								_lotDelL.add(tmprow);
							}
						}
					}

					//過月訂正対応
					//元の受払実績の計上日≠上り電文の取消計上日、かつ
					//上り電文の取消計上日＝上り電文の計上日の場合は、
					//赤伝の部門、ＷＧ、担当者を設定しなおす。

					if (!isSame(tmprow.ac_dt(), r.can_ac_dt())) {

						//外注製造場所部門
						if (MAC_TRD_PTN_TYP.isPURC(tmprow.trd_ptn_typ())
								&& (MSC_IO_ACT_TYP.isPURC_GR(tmprow.io_act_typ())
										|| MSC_IO_ACT_TYP.isONR_RCV_GR(tmprow.io_act_typ()))){
							if (!isNull(tmprow.mfg_inst_no())) {
								if(MAC_DATA_CRUD_TYP.isDEL(tmprow.data_crud_typ())) {
									MST_MFG_INST_R  outsrcInfo = getOutsrcInfoMfgInstNoDel(tmprow.mfg_inst_no());
									if (!isNull(outsrcInfo.itm_mfg_inst_no())) {
										tmprow.outsrc_mfg_loc_dpt_cd(getLocDptOutsrcMfgInstNoDel(tmprow.outsrc_mfg_loc_cd(), r.can_ac_dt()));
									}
								}
								else {
									MSVT_OUTSRC_INFO_R outsrcInfo =  getOutsrcInfo(tmprow.act_d_no(), tmprow.act_d_seq().add(1));
									if (!isNull(outsrcInfo.itm_mfg_inst_no())) {
										tmprow.outsrc_mfg_loc_dpt_cd(getLocDptOutsrc(tmprow.outsrc_mfg_loc_cd(), r.can_ac_dt()));
									}
								}
							}
						}

						//計上日
						tmprow.setDateNE("dis_ac_dt", tmprow.ac_dt());
						tmprow.setDateNE("can_ac_dt", r.can_ac_dt());
						tmprow.setDateNE(getCrtCol(MST_IO_ACT_R.$ac_dt), r.ac_dt());
						setBdDptInfo(r);

						//部門
						tmprow.setStringNE(getCrtCol(MST_IO_ACT_R.$act_dpt_cd), r.act_dpt_cd());
						tmprow.setStringNE(getCrtCol(MST_IO_ACT_R.$purc_dpt_cd), r.purc_dpt_cd());
						tmprow.setStringNE(getCrtCol(MST_IO_ACT_R.$ap_dpt_cd), r.ap_dpt_cd());
						tmprow.setStringNE(getCrtCol(MST_IO_ACT_R.$sls_dpt_cd), r.sls_dpt_cd());
						tmprow.setStringNE(getCrtCol(MST_IO_ACT_R.$ar_dpt_cd), r.ar_dpt_cd());
						tmprow.setStringNE(getCrtCol(MST_IO_ACT_R.$bd_dpt_cd), r.bd_dpt_cd());
						tmprow.setStringNE(getCrtCol(MST_IO_ACT_R.$gi_dpt_cd), getLocDpt(tmprow.gi_loc_cd(), r.can_ac_dt()));
						tmprow.setStringNE(getCrtCol(MST_IO_ACT_R.$gr_dpt_cd), getLocDpt(tmprow.gr_loc_cd(), r.can_ac_dt()));
						tmprow.setStringNE(getCrtCol(MST_IO_ACT_R.$sub_dpt_cd1), r.sub_dpt_cd1());
						tmprow.setStringNE(getCrtCol(MST_IO_ACT_R.$sub_dpt_cd2), r.sub_dpt_cd2());
						tmprow.setStringNE(getCrtCol(MST_IO_ACT_R.$sub_dpt_cd3), r.sub_dpt_cd3());
						tmprow.setStringNE(getCrtCol(MST_IO_ACT_R.$outsrc_mfg_loc_dpt_cd), r.outsrc_mfg_loc_dpt_cd());
						//担当者
						tmprow.setStringNE(getCrtCol(MST_IO_ACT_R.$sls_usr_cd), r.sls_usr_cd());
						tmprow.setStringNE(getCrtCol(MST_IO_ACT_R.$purc_usr_cd), r.purc_usr_cd());
						tmprow.act_usr_cd(r.act_usr_cd());
						tmprow.mfg_usr_cd(r.mfg_usr_cd());

						//ＷＧ
						tmprow.setStringNE(getCrtCol(MST_IO_ACT_R.$bd_wg_cd), r.bd_wg_cd());
						//値引、値増は部門から出庫ＷＧが設定されるため、赤伝の出庫ＷＧを設定しなおす。
						if (MSC_IO_ACT_TYP.isSLS_DSCNT(tmprow.io_act_typ())
								|| MSC_IO_ACT_TYP.isSLS_XTRA(tmprow.io_act_typ())
								|| MSC_IO_ACT_TYP.isPURC_DSCNT(tmprow.io_act_typ())
								|| MSC_IO_ACT_TYP.isXPNS_PURC_DSCNT(tmprow.io_act_typ())
								|| MSC_IO_ACT_TYP.isPURC_XTRA(tmprow.io_act_typ())
								|| MSC_IO_ACT_TYP.isXPNS_PURC_XTRA(tmprow.io_act_typ())){
							tmprow.gi_wg_cd(r.gi_wg_cd());
						}

					}

					// 計上日は取消計上日を用いる
					tmprow.ac_dt(r.can_ac_dt());
					tmprow.ac_ym(getAcYm(tmprow.ac_dt()));

					tmprow.slip_sts_typ(MAC_SLIP_STS_TYP.CAN.value());

					// 数量項目、金額項目の符号を反転する
					if (!isNull(tmprow.trd_unit_qty())) {
						tmprow.trd_unit_qty(tmprow.trd_unit_qty().negate());
					}
					if (!isNull(tmprow.pack_unit_qty())) {
						tmprow.pack_unit_qty(tmprow.pack_unit_qty().negate());
					}
					if (!isNull(tmprow.base_unit_qty())) {
						tmprow.base_unit_qty(tmprow.base_unit_qty().negate());
					}
					if (!isNull(tmprow.trd_cur_amt())) {
						tmprow.trd_cur_amt(tmprow.trd_cur_amt().negate());
					}
					if (!isNull(tmprow.trd_cur_proc_amt())) {
						tmprow.trd_cur_proc_amt(tmprow.trd_cur_proc_amt().negate());
					}
					if (!isNull(tmprow.trd_cur_onr_prov_amt())) {
						tmprow.trd_cur_onr_prov_amt(tmprow.trd_cur_onr_prov_amt().negate());
					}
					if (!isNull(tmprow.trd_cur_tax_amt())) {
						tmprow.trd_cur_tax_amt(tmprow.trd_cur_tax_amt().negate());
					}
					if (!isNull(tmprow.base_cur_amt())) {
						tmprow.base_cur_amt(tmprow.base_cur_amt().negate());
					}
					if (!isNull(tmprow.base_cur_proc_amt())) {
						tmprow.base_cur_proc_amt(tmprow.base_cur_proc_amt().negate());
					}
					if (!isNull(tmprow.base_cur_onr_prov_amt())) {
						tmprow.base_cur_onr_prov_amt(tmprow.base_cur_onr_prov_amt().negate());
					}
					if (!isNull(tmprow.base_cur_tax_amt())) {
						tmprow.base_cur_tax_amt(tmprow.base_cur_tax_amt().negate());
					}
					if (!isNull(tmprow.ptax_cur_amt())) {
						tmprow.ptax_cur_amt(tmprow.ptax_cur_amt().negate());
					}
					if (!isNull(tmprow.ptax_cur_proc_amt())) {
						tmprow.ptax_cur_proc_amt(tmprow.ptax_cur_proc_amt().negate());
					}
					if (!isNull(tmprow.ptax_cur_onr_prov_amt())) {
						tmprow.ptax_cur_onr_prov_amt(tmprow.ptax_cur_onr_prov_amt().negate());
					}
					if (!isNull(tmprow.ptax_cur_tax_amt())) {
						tmprow.ptax_cur_tax_amt(tmprow.ptax_cur_tax_amt().negate());
					}
					if (!isNull(tmprow.wtax_amt())) {
						tmprow.wtax_amt(tmprow.wtax_amt().negate());
					}

					// 棚卸の場合は棚卸基準日をセット
					if (MSC_IO_ACT_TYP.isSTK_ADJST_GI(r.io_act_typ())
							|| MSC_IO_ACT_TYP.isSTK_ADJST_GR(r.io_act_typ())) {
						tmprow.stktk_base_dt(null);
					}

					tmprow.c_imp_flg(false);
					tmprow.a_imp_flg(false);

					// 更新リストに追加
					updL.add(tmprow);

					//今回受払で在庫の入出庫が起きるリストを待避する
					setStkIoL(tmprow);
				}

				//更新時は受払区分が合致する場合のみ伝票ＮＯを引き継ぐ
				if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					if (isSame(r.act_no(), tmprow.act_no())
							&& isSame(r.act_d_no(), tmprow.act_d_no())
							&& isSame(r.act_io_no(), tmprow.act_io_no())
							&& isSame(r.trn_typ(), tmprow.trn_typ())
							&& isSame(r.io_act_typ(), tmprow.io_act_typ())){

						r.slip_no(tmprow.slip_no());
						r.slip_seq_no(tmprow.slip_seq_no());
						r.slip_rev_no(tmprow.slip_rev_no());
					}
				}
			}
		}

		protected String getCrtCol(String col) {
			return MAUCL_DptUtil.getCrtColumn(col);
		}

		protected boolean islotKeyChg(IoAct_Upd01_DtlR r, IoAct_Upd01_DtlR tmprow) {

				if (isSame(r.itm_cd(), tmprow.itm_cd())
						&& isSame(r.itm_sub1(), tmprow.itm_sub1())
						&& isSame(r.itm_sub2(), tmprow.itm_sub2())
						&& isSame(r.itm_sub3(), tmprow.itm_sub3())
						&& isSame(r.lot_no(), tmprow.lot_no())
						&& isSame(r.sublot_no(), tmprow.sublot_no())) {
					return false;
				}
				else {
					return true;
				}
		}

		protected void makeIoAct_B(IoAct_Upd01_DtlR r, MCList<IoAct_Upd01_DtlR> list, MCList<IoAct_Upd01_DtlR> updL) {

			r.ac_ym(getAcYm(r.ac_dt()));

			if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
				r.slip_seq_no(MCNumber.ONE);
				r.slip_rev_no(MCNumber.ONE);
			}
			else {
				//更新時、元伝の伝票ＮＯが指定されている場合は、
				//伝票連番、伝票改訂番号を+1する
				if (!isNull(r.slip_no())) {
					r.slip_seq_no(r.slip_seq_no().add(MCNumber.ONE));
					r.slip_rev_no(r.slip_rev_no().add(MCNumber.ONE));
				}
				else {
					r.slip_seq_no(MCNumber.ONE);
					r.slip_rev_no(MCNumber.ONE);
				}
			}

			r.slip_sts_typ(MAC_SLIP_STS_TYP.CRT.value()); 
			
			if (MSC_TRN_TYP.isRCV_ACT(r.trn_typ())) {
				String trdCd = MAUCL_TrdUtil.getDefaultTrdCd(MAC_TRD_PTN_TYP.TAX_DIFF_BILL_CL.value());
				MAM_TRD_R trdR = MAUCL_TrdUtil.getTrd(trdCd);
				
				if (!isNull(trdR.ac_rsn_cd())) {
					r.ac_rsn_cd(trdR.ac_rsn_cd());
					r.rsn_cd(null);
				}
			}
			if (MSC_TRN_TYP.isPAY_SCHD(r.trn_typ())) {
				String trdCd = MAUCL_TrdUtil.getDefaultTrdCd(MAC_TRD_PTN_TYP.TAX_DIFF_PAY_SCHD_CL.value());
				MAM_TRD_R trdR = MAUCL_TrdUtil.getTrd(trdCd);
							
				if (!isNull(trdR.ac_rsn_cd())) {
					r.ac_rsn_cd(trdR.ac_rsn_cd());
					r.rsn_cd(null);
				}
			}
			if(!isNull(r.rsn_cd())){
				r.ac_rsn_cd(getBizRsn(r.rsn_cd()).ac_rsn_cd());
			}

			//補完された移動・移送出庫、移動・移送入庫は積送とはならないため、
			//積送在庫の場所編集はしない
			if (!r.slip_cmpl_flg()
					&& !MSC_TRN_TYP.isXFR(r.trn_typ())
					&& (MSC_IO_ACT_TYP.isXFR_GI(r.io_act_typ()) 
							|| MSC_IO_ACT_TYP.isXFR_GR(r.io_act_typ())
							|| MSC_IO_ACT_TYP.isXFR_RTN_GI(r.io_act_typ())
							|| MSC_IO_ACT_TYP.isXFR_RTN_GR(r.io_act_typ())
							|| MSC_IO_ACT_TYP.isXFR_IN(r.io_act_typ())
							|| MSC_IO_ACT_TYP.isXFR_OUT(r.io_act_typ()))){

				setLocXfrStk(r);
			}

			setAcSlipTyp(r);

			if (!isNull(r.org_gi_loc_cd())) {
				r.gi_dpt_cd(getLocDpt(r.org_gi_loc_cd(), r.ac_dt()));
			}
			else if (!isNull(r.gi_loc_cd())) {
				r.gi_dpt_cd(getLocDpt(r.gi_loc_cd(), r.ac_dt()));
			}

			if (!isNull(r.org_gr_loc_cd())) {
				r.gr_dpt_cd(getLocDpt(r.org_gr_loc_cd(), r.ac_dt()));
			}
			else if (!isNull(r.gr_loc_cd())) {
				r.gr_dpt_cd(getLocDpt(r.gr_loc_cd(), r.ac_dt()));
			}

			setItmInfo(r);

			if (MSC_IO_TYP.isGI(MSC_IO_ACT_TYP.io_typ(r.io_act_typ()))) {
				r.io_typ(MSC_IO_TYP.GI.value());
				r.loc_cd(r.gi_loc_cd());
				r.str_ln_cd(r.gi_str_ln_cd());
				r.gd_cd(r.gi_gd_cd());
			}
			else if (MSC_IO_TYP.isGR(MSC_IO_ACT_TYP.io_typ(r.io_act_typ()))) {
				r.io_typ(MSC_IO_TYP.GR.value());
				r.loc_cd(r.gr_loc_cd());
				r.str_ln_cd(r.gr_str_ln_cd());
				r.gd_cd(r.gr_gd_cd());
			}
			else {
				r.io_typ(MSC_IO_TYP.NON.value());
				r.loc_cd(null);
				r.str_ln_cd(null);
				r.gd_cd(null);
			}

			setAsstTyp(r, list);

			setDefStkInfo(r);

			setBpInfo(r);

			setBdDptInfo(r);

			if (!isNull(r.mfg_inst_no()) && MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
					&& (MSC_IO_ACT_TYP.isPURC_GR(r.io_act_typ())
							|| MSC_IO_ACT_TYP.isONR_RCV_GR(r.io_act_typ()))){
				setOustsrcInfo(r);
			}

			if (!isNull(r.mfg_inst_no()) &&
					(MSC_IO_ACT_TYP.isPURC_DSCNT(r.io_act_typ())
							|| MSC_IO_ACT_TYP.isPURC_XTRA(r.io_act_typ())
							|| MSC_IO_ACT_TYP.isXPNS_PURC_DSCNT(r.io_act_typ())
							|| MSC_IO_ACT_TYP.isXPNS_PURC_XTRA(r.io_act_typ())
							|| MSC_IO_ACT_TYP.isPURC_RTN_GI(r.io_act_typ())
							|| MSC_IO_ACT_TYP.isXPNS_PURC_RTN_GI(r.io_act_typ())
							|| MSC_IO_ACT_TYP.isONR_RCV_RET_GI(r.io_act_typ())
							|| isArrInTransit(r))) {
				setOustsrcMfgInstNoInfo(r);
			}

			// 有償支給、外注仕入以外、もしくは仕入値引・経費値引・仕入値増・経費値増は買戻義務はなしにする
			if (isNull(r.outsrc_mfg_loc_cd())
					&& !MSC_IO_ACT_TYP.isONR_PROV_GR(r.io_act_typ())
					&& !MSC_IO_ACT_TYP.isONR_PROV_RTN_GI(r.io_act_typ())) {
				r.repurc_obli_flg(false);
			}
			else if(MSC_IO_ACT_TYP.isPURC_DSCNT(r.io_act_typ())
						|| MSC_IO_ACT_TYP.isXPNS_PURC_DSCNT(r.io_act_typ())
						|| MSC_IO_ACT_TYP.isPURC_XTRA(r.io_act_typ())
						|| MSC_IO_ACT_TYP.isXPNS_PURC_XTRA(r.io_act_typ())) {
				r.repurc_obli_flg(false);
			}

			if (MSC_IO_ACT_TYP.isSTK_ADJST_GI(r.io_act_typ())
					|| MSC_IO_ACT_TYP.isSTK_ADJST_GR(r.io_act_typ())) {
				r.stktk_base_dt(r.ac_dt());
			}

			setSendF(r);

			//検査中移動・棚卸は別で新規受払情報を作成する
			if (!((!MSC_STK_INSP_TYP.isFIN(r.stk_insp_typ()) || MSC_STK_ID_TYP.isPURC_PRE_ACCPT(r.stk_id_typ())) &&
							((MSC_IO_ACT_TYP.isXFR_GI(r.io_act_typ()) &&
									MSC_TRN_TYP.isXFR(r.trn_typ()))
									||
									MSC_IO_ACT_TYP.isSTK_ADJST_GI(r.io_act_typ())
									||
									MSC_IO_ACT_TYP.isSTK_ADJST_GR(r.io_act_typ())))) {

				updL.add(r);
			}

			//今回受払で在庫の入出庫が起きるリストを待避する 
			setStkIoL(r);
		}

		protected void setStkIoL(IoAct_Upd01_DtlR r) {

			//在庫作成対象でない場合は何もしない
			if (!isUpdStk(r)) {
				return;
			}

			IoAct_Upd01_DtlR row = r;

			if (MAC_SLIP_STS_TYP.isCRT(r.slip_sts_typ())) {
				//出庫時荷姿対象のリスト作成
				//・受払区分が投入、ロス、移動・移送出庫、他勘定振替出庫、出荷(移動・移送返品以外)のいずれか
				//・出庫場所が出庫時荷姿対象である
				//・基準単位での出庫である
				//・在庫検査区分が検査済である
				//・在庫識別区分が仕入検収前でない
				if ((MSC_IO_ACT_TYP.isINPT(row.io_act_typ())
						|| MSC_IO_ACT_TYP.isLOSS(row.io_act_typ())
						|| MSC_IO_ACT_TYP.isXFR_GI(row.io_act_typ())
						|| MSC_IO_ACT_TYP.isACXFR_GI(row.io_act_typ())
						|| MSC_IO_ACT_TYP.isSHIP_OUT(row.io_act_typ())
							&& !MAC_TRD_PTN_TYP.isXFR_RTN(row.trd_ptn_typ()))
							&& getLoc(row.gi_loc_cd()).gi_pack_xfer_flg()
								&& isSame(row.pack_unit_cd(), row.base_unit_cd())
									&& MSC_STK_INSP_TYP.isFIN(row.stk_insp_typ())
										&& !MSC_STK_ID_TYP.isPURC_PRE_ACCPT(r.stk_id_typ())) {

					row = r.createInstance();
					MCRow.copyvalue(row, r);
					if (MSC_IO_ACT_TYP.isSHIP_OUT(row.io_act_typ())) {
						//倉入出庫・入庫が発生している場合、資産区分が「自社(販売)」となり
						//本来の資産区分の在庫が取得できないので、資産区分を再設定する
						setAsstTypCmn(row);
					}

					_packXfrL.add(row);
					return;
				}

				//検査中移動・棚卸リスト作成
				if((!MSC_STK_INSP_TYP.isFIN(r.stk_insp_typ()) || MSC_STK_ID_TYP.isPURC_PRE_ACCPT(r.stk_id_typ())) &&
						((MSC_IO_ACT_TYP.isXFR_GI(r.io_act_typ()) &&
								MSC_TRN_TYP.isXFR(r.trn_typ()))
								||
								MSC_IO_ACT_TYP.isSTK_ADJST_GI(r.io_act_typ())
								||
								MSC_IO_ACT_TYP.isSTK_ADJST_GR(r.io_act_typ()))){
					row = r.createInstance();
					MCRow.copyvalue(row, r);
					_inspL.add(row);
					return;
				}
			}
			//出庫の場合は基準単位数量、荷姿単位数量の符号を反転させる
			if (MSC_IO_TYP.isGI(row.io_typ())) {
				row = r.createInstance();
				MCRow.copyvalue(row, r);
				row.pack_unit_qty(row.pack_unit_qty().negate());
				row.base_unit_qty(row.base_unit_qty().negate());
			}
			_stkIoL.add(row);
		}

		protected void setDefStkInfo(IoAct_Upd01_DtlR r) {
			//在庫に関する項目のデフォルト値を設定する
			if (isNull(r.stk_arrv_bp_cd())){
				r.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
			}
			if (isNull(r.lot_no())) {
				r.lot_no(MAC_STR.NULL_VAL.value());
			}
			if (isNull(r.sublot_no())) {
				r.sublot_no(MAC_STR.NULL_VAL.value());
			}
			if (isNull(r.sno1())) {
				r.sno1(MAC_STR.NULL_VAL.value());
			}
			if (isNull(r.sno2())) {
				r.sno2(MAC_STR.NULL_VAL.value());
			}
			if (isNull(r.sno3())) {
				r.sno3(MAC_STR.NULL_VAL.value());
			}
			if (isNull(r.sno4())) {
				r.sno4(MAC_STR.NULL_VAL.value());
			}
			if (isNull(r.fix_no_typ())){
				r.fix_no_typ(MSC_FIX_NO_TYP.NON.value());
			}
			if (isNull(r.fix_no())){
				r.fix_no(MAC_STR.NULL_VAL.value());
			}
			if (isNull(r.in_xfr_typ())) {
				r.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
			}
			if (isNull(r.quality_typ())) {
				r.quality_typ(MAC_QUALITY_TYP.GOOD.value());
			}
			if (isNull(r.asst_typ())) {
				r.asst_typ(MAC_ASST_TYP.CO_PROD.value());
			}
			if (isNull(r.stk_insp_typ())) {
				r.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
			}
			if (isNull(r.stk_id_typ())) {
				r.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
			}
			if (isNull(r.stk_bp_cd())){
				r.stk_bp_cd(MAC_STR.NULL_VAL.value());
			}
		}

		protected void setSendF(IoAct_Upd01_DtlR r) {

			if (MAC_AC_SLIP_TYP.isDPT_XFR_SO(r.ac_slip_typ())
					&& isSame(r.gi_dpt_cd(), r.gr_dpt_cd()) && isSame(r.gi_wg_cd(), r.gr_wg_cd())) {
				r.send_flg(false);
				return;
			}
			if (MSC_IO_ACT_TYP.isSHIP_OUT(r.io_act_typ())
					&& MAC_VIA_DLV_TYP.isVIA(r.via_dlv_typ())) {
				r.send_flg(false);
				return;
			}
			if (!MAC_ASSET_MNG_TYP.isMNG(r.asset_mng_typ())
					&& !MSC_IO_ACT_TYP.is_acif_asset_not_mng(r.io_act_typ())) {
				r.send_flg(false);
				return;
			}
			if (MSC_IO_ACT_TYP.isSHIP_RTN_GR(r.io_act_typ())
					&& !isNull(r.tdlv_cd())) {
				r.send_flg(false);
				return;
			}
			if (MSC_TRN_TYP.isIV(r.trn_typ())) {
				r.send_flg(false);
				return;
			}
		}

		protected void setLocXfrStk(IoAct_Upd01_DtlR r) {

			//元の値を保存しておく
			r.org_gi_loc_cd(r.gi_loc_cd());
			r.org_gr_loc_cd(r.gr_loc_cd());

			//入庫場所が社内の場合
			if (isNull(getLoc(r.gr_loc_cd()).sppl_cd())) {

				//会社マスタの積送在庫管轄先区分が出荷側（出庫場所で積送中）
				if (MAC_XFR_STK_MNG_TYP.isGI(getCo().xfr_stk_mng_typ())) {
					//移動・移送出庫、移動・移送返品出庫、転入の
					//入庫場所を出庫場所に置き換える
					if (MSC_IO_ACT_TYP.isXFR_GI(r.io_act_typ())
							|| MSC_IO_ACT_TYP.isXFR_RTN_GI(r.io_act_typ())
							|| MSC_IO_ACT_TYP.isXFR_IN(r.io_act_typ())){

						r.gr_loc_cd(r.gi_loc_cd());
						r.gr_str_ln_cd(r.gi_str_ln_cd());
					}
				}
				//それ以外（入庫場所で積送中）
				else {
					//移動・移送入庫、移動・移送返品入庫、転出の
					//出庫場所を入庫場所に置き換える
					if (MSC_IO_ACT_TYP.isXFR_GR(r.io_act_typ())
							|| MSC_IO_ACT_TYP.isXFR_RTN_GR(r.io_act_typ())
							|| MSC_IO_ACT_TYP.isXFR_OUT(r.io_act_typ())){

						r.gi_loc_cd(r.gr_loc_cd());
						r.gi_str_ln_cd(r.gr_str_ln_cd());
					}
				}

			}
			//入庫場所が支給先の場合
			else {
				//取引先マスタの支給積送管理区分が着荷登録必要（積送：出荷側）
				if (MAC_PROV_RCV_TYP.isARR_GI(
						getLoc(r.gr_loc_cd()).getStringNE(MAM_BP_R.$prov_rcv_typ))) {
					//それ以外は積送：出荷側
					//移動・移送出庫、移動・移送返品出庫、転入の
					//入庫場所を出庫場所に置き換える
					if (MSC_IO_ACT_TYP.isXFR_GI(r.io_act_typ())
							|| MSC_IO_ACT_TYP.isXFR_RTN_GI(r.io_act_typ())
							|| MSC_IO_ACT_TYP.isXFR_IN(r.io_act_typ())){

						r.gr_loc_cd(r.gi_loc_cd());
						r.gr_str_ln_cd(r.gi_str_ln_cd());
					}


				}
				//取引先マスタの支給積送管理区分が着荷登録必要（積送：入荷側）または積送管理しない
				else {
					//移動・移送入庫、移動・移送返品入庫、転出の
					//出庫場所を入庫場所に置き換える
					if (MSC_IO_ACT_TYP.isXFR_GR(r.io_act_typ())
							|| MSC_IO_ACT_TYP.isXFR_RTN_GR(r.io_act_typ())
							|| MSC_IO_ACT_TYP.isXFR_OUT(r.io_act_typ())){

						r.gi_loc_cd(r.gr_loc_cd());
						r.gi_str_ln_cd(r.gr_str_ln_cd());
					}
				}
			}
		}

		protected void setOustsrcInfo(IoAct_Upd01_DtlR r) {
						
			//仕入実績明細ＮＯ、仕入実績明細連番から外注仕入の製造情報を取得する
			MSVT_OUTSRC_INFO_R outsrcInfo = getOutsrcInfo(r.act_d_no(), r.act_d_seq());

			if (!isNull(outsrcInfo.itm_mfg_inst_no())) {
				r.itm_mfg_inst_no(outsrcInfo.itm_mfg_inst_no());
				r.itm_inst_qty(outsrcInfo.itm_inst_qty());
				r.mfg_inst_no(outsrcInfo.mfg_inst_no());
				r.mfg_act_no(outsrcInfo.mfg_act_no());
				r.mfg_st_qty(outsrcInfo.mfg_st_qty());
				r.outsrc_mfg_loc_cd(outsrcInfo.outsrc_mfg_loc_cd());
				r.outsrc_mfg_loc_dpt_cd(getLocDptOutsrc(r.outsrc_mfg_loc_cd(), r.ac_dt()));
				r.outsrc_mfg_loc_wg_cd(outsrcInfo.outsrc_mfg_loc_wg_cd());
				r.par_lot_no(outsrcInfo.par_lot_no());
				r.par_sublot_no(outsrcInfo.par_sublot_no());
				r.mfg_inst_unit_typ(MAC_MFG_INST_UNIT_TYP.ITM.value()); //品目単位固定
			}
		}

		protected void setOustsrcMfgInstNoInfo(IoAct_Upd01_DtlR r) {

			//製造指図ＮＯから外注製造情報を取得する
			MST_MFG_INST_R outsrcInfo = getOutsrcInfoMfgInstNo(r.mfg_inst_no());

			if (!isNull(outsrcInfo.itm_mfg_inst_no())) {
				r.itm_mfg_inst_no(outsrcInfo.itm_mfg_inst_no());
				r.itm_inst_qty(outsrcInfo.getNumber(MST_ITM_MFG_INST_R.$base_unit_inst_qty));
				r.mfg_act_no(outsrcInfo.getString(MST_MFG_ACT_R.$mfg_act_no));
				r.mfg_st_qty(outsrcInfo.getNumber(MST_MFG_ACT_REM_R.$base_unit_mfg_qty));
				r.outsrc_mfg_loc_cd(outsrcInfo.getString(MST_ITM_MFG_INST_R.$mfg_loc_cd));
				r.outsrc_mfg_loc_dpt_cd(getLocDptOutsrcMfgInstNo(r.outsrc_mfg_loc_cd(), r.ac_dt()));
				r.outsrc_mfg_loc_wg_cd(outsrcInfo.getString(MST_ITM_MFG_INST_R.$wg_cd));
				r.par_lot_no(outsrcInfo.getString(MST_ITM_MFG_INST_R.$lot_no));
				r.par_sublot_no(outsrcInfo.getString(MST_ITM_MFG_INST_R.$sublot_no));
				r.mfg_inst_unit_typ(MAC_MFG_INST_UNIT_TYP.ITM.value()); //品目単位固定
			}
		}

		protected void setBpInfo(IoAct_Upd01_DtlR r) {

			if (!isNull(r.cst_cd())){
				MAM_BP_R bp = getBp(r.cst_cd());
				r.area_cd(bp.area_cd());
				r.cntry_cd(bp.cntry_cd());
				r.foreign_flg(!isSame(bp.cntry_cd(), getCo().cntry_cd()));

				if (!isNull(r.acst_cd())){
					MAM_BP_R acst = getBp(r.acst_cd());
					r.bcst_cd(acst.bcst_cd());
					r.rcst_cd(acst.getStringNE("rcst_cd"));
					r.cred_cd(acst.getStringNE("ar_cred_cd"));
				}
			}
			else if (!isNullOrNullVal(r.sppl_cd())){
				MAM_BP_R bp = getBp(r.sppl_cd());
				r.area_cd(bp.area_cd());
				r.cntry_cd(bp.cntry_cd());
				r.foreign_flg(!isSame(bp.cntry_cd(), getCo().cntry_cd()));
				r.repurc_obli_flg(bp.repurc_obli_flg());
				if (!isNull(r.asppl_cd())){
					MAM_BP_R asppl = getBp(r.asppl_cd());
					r.bsppl_cd(asppl.bsppl_cd());
					r.psppl_cd(asppl.getStringNE("psppl_cd"));
					r.cred_cd(asppl.getStringNE("ap_cred_cd"));
				}
			}
			else {
				r.foreign_flg(false);
			}
		}

		protected void setBdDptInfo(IoAct_Upd01_DtlR r) {

			if (!isNull(r.bd_dpt_cd())) {
				r.bd_wg_cd(getDpt(r.ac_dt(), r.bd_dpt_cd()).wg_cd());
			}
		}

		protected void setAcSlipTyp(IoAct_Upd01_DtlR r) {

			//他社資産は有償支給と自給のみ
			if (MSC_STK_ID_TYP.isRTN_PRE_ACCPT(r.stk_id_typ())
					|| MSC_STK_ID_TYP.isCSTSTK(r.stk_id_typ())
					|| MSC_STK_ID_TYP.isRNT_RCV(r.stk_id_typ())
					|| MSC_STK_ID_TYP.isPURC_PRE_ACCPT(r.stk_id_typ())
					|| MSC_STK_ID_TYP.isACCPT_DFCT(r.stk_id_typ())
					|| MSC_STK_ID_TYP.isNCV_RCV(r.stk_id_typ())) {
				return;
			}

			if (MSC_IO_ACT_TYP.isINPT(r.io_act_typ())
					|| MSC_IO_ACT_TYP.isLOSS(r.io_act_typ())) {

				if (MSC_STK_ID_TYP.isONR_PROV(r.stk_id_typ())) {
					//在庫識別区分が有償支給の場合、投入（有償）にする
					r.ac_slip_typ(MAC_AC_SLIP_TYP.IN_ONR.value());
				}
				else {
					r.ac_slip_typ(MAC_AC_SLIP_TYP.INPUT.value());
				}
			}
			else if (isArrInTransit(r)) {
				r.ac_slip_typ(MAC_AC_SLIP_TYP.ARR_IN_TRANSIT.value());
			}
			else if (MSC_IO_ACT_TYP.isXFR_GI(r.io_act_typ())
					|| MSC_IO_ACT_TYP.isXFR_GR(r.io_act_typ())
					|| MSC_IO_ACT_TYP.isXFR_RTN_GI(r.io_act_typ())
					|| MSC_IO_ACT_TYP.isXFR_RTN_GR(r.io_act_typ())) {

				//出荷場所で積送中の場合は、移送・移動入庫または移動・移送返品入庫に
				//会計伝票区分を設定する。（出荷場所で積送中の時、移送・移動出庫または
				//移動・移送返品出庫の受払では出庫場所と入庫場所が等しい）
				//それ以外の場合は、移送・移動出庫または移動・移送返品出庫に
				//会計伝票区分を設定する。（入荷場所で積送中の時、移送・移動入庫または
				//移動・移送返品入庫の受払では出庫場所と入庫場所が等しい）

				//トランザクション区分が移動の場合は、移送・移動出庫または移動・移送返品出庫に
				//会計伝票区分を設定する。（移動の場合は、移送・移動出庫または移送・移動入庫
				//のいずれか一方、移送・移動返品出庫または移送・移動返品入庫のいずれか一方を
				//会計へ送れば良いため出庫側に設定する）

				if (!isSame(r.gi_loc_cd(), r.gr_loc_cd())){

					MAM_LOC_R gi_loc = getLoc(r.gi_loc_cd());
					MAM_LOC_R gr_loc = getLoc(r.gr_loc_cd());

					//出庫場所、入庫場所で、生販が同じ場合は部門間移動
					if (isSame(gi_loc.loc_mng_typ(), gr_loc.loc_mng_typ())) {
						r.ac_slip_typ(MAC_AC_SLIP_TYP.DPT_XFR_SO.value());
					}
					else {
						//生産->販売の場合は販売倉入
						if (MAC_LOC_MNG_TYP.isPRD(gi_loc.loc_mng_typ())) {
							r.ac_slip_typ(MAC_AC_SLIP_TYP.PROD_ITM_SO.value());
						}
						//販売->生産の場合は生産戻入
						else {
							r.ac_slip_typ(MAC_AC_SLIP_TYP.PROD_ITM_RET_SO.value());
						}
					}
					//トランザクション区分が移動の場合は入庫側をクリアする
					if ((MSC_TRN_TYP.isXFR(r.trn_typ()) || r.slip_cmpl_flg())
							&& (MSC_IO_ACT_TYP.isXFR_GR(r.io_act_typ())
									|| MSC_IO_ACT_TYP.isXFR_RTN_GR(r.io_act_typ()))
							) {
						r.ac_slip_typ(null);
					}
				}
			}
			else {
				r.ac_slip_typ(MSC_IO_ACT_TYP.ac_slip_typ(r.io_act_typ()));
			}

			//会計伝票区分が設定されたら、送信対象フラグをオンにしておく
			if (!isNull(r.ac_slip_typ())) {
				r.send_flg(true);
			}

		}

		protected void setAsstTyp(IoAct_Upd01_DtlR r, MCList<IoAct_Upd01_DtlR> list) {

			if (MSC_IO_ACT_TYP.isSLS(r.io_act_typ())
					|| MSC_IO_ACT_TYP.isSLS_RTN_GR(r.io_act_typ())
					|| MSC_IO_ACT_TYP.isSLS_DSCNT(r.io_act_typ())
					|| MSC_IO_ACT_TYP.isSLS_XTRA(r.io_act_typ())){
				r.asst_typ(MAC_ASST_TYP.CO_SLS.value());
				return;
			}
			if ((MSC_IO_ACT_TYP.isACXFR_GI(r.io_act_typ())
					|| MSC_IO_ACT_TYP.isACXFR_GR(r.io_act_typ()))
					&& MSC_TRN_TYP.isSLS(r.trn_typ())){
				r.asst_typ(MAC_ASST_TYP.CO_SLS.value());
				return;
			}
			if (MSC_IO_ACT_TYP.isXFR_PACK_GI(r.io_act_typ())) {
				if (!isNullOrNullVal(r.stk_arrv_bp_cd())
						&& !isSame(r.stk_arrv_bp_cd(), getLoc(r.gi_loc_cd()).sppl_cd())) {
					r.asst_typ(MAC_ASST_TYP.CO_SLS.value());
					return;
				}
			}
			if (MSC_IO_ACT_TYP.isXFR_PACK_GR(r.io_act_typ())) {
				if (!isNullOrNullVal(r.stk_arrv_bp_cd())
						&& !isSame(r.stk_arrv_bp_cd(), getLoc(r.gr_loc_cd()).sppl_cd())) {
					r.asst_typ(MAC_ASST_TYP.CO_SLS.value());
					return;
				}
			}
			if (MSC_IO_ACT_TYP.isSHIP_IN(r.io_act_typ())){
				if (setAsstTypShipOut(r, list)) {
					return;
				}
			}
			if (MSC_IO_ACT_TYP.isEX_SHIP_IN(r.io_act_typ())){
				if (setAsstTypExShipOut(r, list)) {
					return;
				}
			}
			if (MSC_IO_ACT_TYP.isSHIP_RTN_GI(r.io_act_typ())){
				if (setAsstTypShipRtnGi(r, list)) {
					return;
				}
			}
			//受払区分が倉入出庫、倉入入庫、戻入出庫、戻入入庫は補完時に設定済
			if (MSC_IO_ACT_TYP.isPRDCT_WH_GI(r.io_act_typ())
					|| MSC_IO_ACT_TYP.isPRDCT_WH_GR(r.io_act_typ())
					|| MSC_IO_ACT_TYP.isPRDCT_WH_RTN_GI(r.io_act_typ())
					|| MSC_IO_ACT_TYP.isPRDCT_WH_RTN_GR(r.io_act_typ())){

				return;
			}
			//受払区分が出荷、輸出出荷、出荷返品入庫で倉入、戻入が発生した場合、
			//事前に自社（販売）を設定済
			if ((MSC_IO_ACT_TYP.isSHIP_OUT(r.io_act_typ())
					|| MSC_IO_ACT_TYP.isEX_SHIP_OUT(r.io_act_typ())
					|| MSC_IO_ACT_TYP.isSHIP_RTN_GR(r.io_act_typ()))
						&& !isNull(r.asst_typ())){
				return;
			}

			//外注品を販売場所に仕入れるときは販売倉入を補完するので、事前に自社（生産）を設定済
			if (!isNull(r.mfg_inst_no())
					&& MAC_LOC_MNG_TYP.isSLS(getLoc(nvl(r.gr_loc_cd(), r.gi_loc_cd())).loc_mng_typ())
					&& !MSC_IO_ACT_TYP.isACCPT_DFCT_GR(r.io_act_typ())) {

				if (MSC_IO_ACT_TYP.isPURC_GR(r.io_act_typ())
						|| MSC_IO_ACT_TYP.isONR_RCV_GR(r.io_act_typ())
						|| MSC_IO_ACT_TYP.isXPNS_PURC_GR(r.io_act_typ())) {
					return;
				}
				if (MSC_ARR_PTN_TYP.isN_YET_ARR(r.arr_ptn_typ())) {
					if (MSC_IO_ACT_TYP.isPURC_GI(r.io_act_typ())
							|| MSC_IO_ACT_TYP.isONR_RCV_GI(r.io_act_typ())
							|| MSC_IO_ACT_TYP.isXPNS_PURC_GI(r.io_act_typ())
							|| MSC_IO_ACT_TYP.isPURC_XFR_IN(r.io_act_typ())
							|| MSC_IO_ACT_TYP.isPURC_XFR_OUT(r.io_act_typ())
							|| MSC_IO_ACT_TYP.isARR(r.io_act_typ())) {
						return;
					}
				}
			}

			//外注品を販売場所から返品するときは生産戻入を補完するので、事前に自社（生産）を設定済
			if (!isNull(r.mfg_inst_no())
					&& MAC_LOC_MNG_TYP.isSLS(getLoc(r.gi_loc_cd()).loc_mng_typ())){
				if (MSC_IO_ACT_TYP.isPURC_RTN_GI(r.io_act_typ())
						|| MSC_IO_ACT_TYP.isONR_RCV_RET_GI(r.io_act_typ())){
					return;
				}
			}

			if (MSC_IO_ACT_TYP.isACXFR_GI(r.io_act_typ())
					|| MSC_IO_ACT_TYP.isACXFR_GR(r.io_act_typ())
					|| MSC_IO_ACT_TYP.isSCRP(r.io_act_typ())) {
				if (!isNullOrNullVal(r.stk_arrv_bp_cd())&& !isSame(r.stk_arrv_bp_cd(), getLoc(r.loc_cd()).sppl_cd())) {
					r.asst_typ(MAC_ASST_TYP.CO_SLS.value());
					return;
				}
			}

			setAsstTypCmn(r);
		}
		protected void setAsstTypCmn(IoAct_Upd01_DtlR r) {

			if (MSC_IO_TYP.isGI(r.io_typ()) || MSC_IO_TYP.isGR(r.io_typ())){

				if (!MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ())) {
					String locCd = null;
					if (MSC_IO_TYP.isGI(r.io_typ())) {
						locCd = r.gi_loc_cd();
					}
					else {
						locCd = r.gr_loc_cd();
					}
					if (!isNull(locCd)) {
						MAM_LOC_R locR = getLoc(locCd);
						// 有償支給かつ買戻義務FLGがオンの場合
						if (!isNull(locR) && MSC_STK_ID_TYP.isONR_PROV(r.stk_id_typ())
								&& isSame(locR.getStringNE(MAM_BP_R.$repurc_obli_flg), "1")) {
							r.asst_typ(MAC_ASST_TYP.CO_PROD.value());
						}
						else {
							r.asst_typ(MAC_ASST_TYP.OTH.value());
						}
					}
					else {
						r.asst_typ(MAC_ASST_TYP.OTH.value());
					}
				}
				else {
					if (MSC_IO_TYP.isGI(r.io_typ())){
						 if (MAC_LOC_MNG_TYP.isPRD(getLoc(r.gi_loc_cd()).loc_mng_typ())){
							 r.asst_typ(MAC_ASST_TYP.CO_PROD.value());
						 }
						 else {
							 r.asst_typ(MAC_ASST_TYP.CO_SLS.value());
						 }
					}
					else {
						if (MAC_LOC_MNG_TYP.isPRD(getLoc(r.gr_loc_cd()).loc_mng_typ())){
							 r.asst_typ(MAC_ASST_TYP.CO_PROD.value());
						 }
						 else {
							 r.asst_typ(MAC_ASST_TYP.CO_SLS.value());
						 }
					}
				}
			}
			else {
				if (MAC_LOC_MNG_TYP.isPRD(getBizRsn(r.rsn_cd()).purc_dscnt_loc_mng_typ())) {
					r.asst_typ(MAC_ASST_TYP.CO_PROD.value());
				}
				else {
					r.asst_typ(MAC_ASST_TYP.CO_SLS.value());
				}
			}
		}

		protected boolean setAsstTypShipRtnGi(IoAct_Upd01_DtlR r,
				MCList<IoAct_Upd01_DtlR> list) {

			//子伝の出荷返品入庫で戻入が起きている場合は、資産区分を自社（販売）にする
			IoAct_Upd01_DtlR shipRtnGrR = list.getFirst(IoAct_Upd01_DtlR.$io_act_typ, 
													MSC_IO_ACT_TYP.SHIP_RTN_GR.value());
			if (!isNull(shipRtnGrR)
					&& MAC_LOC_MNG_TYP.isPRD(getLoc(shipRtnGrR.gr_loc_cd()).loc_mng_typ())
					&& isNull(shipRtnGrR.tdlv_cd())){

					r.asst_typ(MAC_ASST_TYP.CO_SLS.value());
					return true;
			}

			return false;
		}

		protected boolean setAsstTypShipOut(IoAct_Upd01_DtlR r,
				MCList<IoAct_Upd01_DtlR> list) {

			//親伝の出荷で倉入が起きている場合は、資産区分を自社（販売）にする
			IoAct_Upd01_DtlR shipOutR = list.getFirst(IoAct_Upd01_DtlR.$io_act_typ, 
													MSC_IO_ACT_TYP.SHIP_OUT.value());
			if (!isNull(shipOutR)
					&& MAC_LOC_MNG_TYP.isPRD(getLoc(shipOutR.gi_loc_cd()).loc_mng_typ())
					&& MAC_VIA_DLV_TYP.isNOT_VIA(shipOutR.via_dlv_typ())
					&& MSC_STK_ID_TYP.isCOSTK(shipOutR.stk_id_typ())){

					r.asst_typ(MAC_ASST_TYP.CO_SLS.value());
					return true;
			}

			return false;
		}

		protected boolean setAsstTypExShipOut(IoAct_Upd01_DtlR r,
				MCList<IoAct_Upd01_DtlR> list) {

			//親伝の輸出出荷で倉入が起きている場合は、資産区分を自社（販売）にする
			IoAct_Upd01_DtlR exShipOutR = list.getFirst(IoAct_Upd01_DtlR.$io_act_typ, 
													MSC_IO_ACT_TYP.EX_SHIP_OUT.value());
			if (!isNull(exShipOutR)
					&& MAC_LOC_MNG_TYP.isPRD(getLoc(exShipOutR.gi_loc_cd()).loc_mng_typ())){

					r.asst_typ(MAC_ASST_TYP.CO_SLS.value());
					return true;
			}

			return false;
		}

		protected void setItmInfo(IoAct_Upd01_DtlR r) {

			MAM_ITM_R itm = getItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());

			if (isNull(r.itm_nm())) {
				if (r.sundry_itm_flg()) {
					MAM_SUNDRY_ITM_R sundryItm = getSundryItm(r.itm_cd(), r.itm_sub1(),
							r.itm_sub2(), r.itm_sub3(), r.sno1(), r.sno2(), r.sno3(),
							r.sno4());
					r.itm_nm(nvl(sundryItm.itm_nm(), itm.itm_nm()));
				}
				else {
					r.itm_nm(itm.itm_nm());
				}
			}

			r.ac_itm_grp_cd(itm.ac_itm_grp_cd());
			if (MSC_TRN_TYP.isRCV_ACT(r.trn_typ())
				|| MSC_TRN_TYP.isPAY_SCHD(r.trn_typ())) {
				// トランザクション区分:入金実績、支払予定の場合、品目＝NULL文字の時がある
				r.itm_jnl_cd(nvl(itm.itm_jnl_cd(), MAC_STR.NULL_VAL.value()));
				r.asset_mng_typ(nvl(itm.asset_mng_typ(), MAC_STR.NULL_VAL.value()));
			}
			else {
				r.itm_jnl_cd(itm.itm_jnl_cd());
				r.asset_mng_typ(itm.asset_mng_typ());
			}

			if (!isNull(r.par_itm_cd())) {
				MAM_ITM_R parItm = getItm(r.par_itm_cd(), r.par_itm_sub1(), r.par_itm_sub2(), r.par_itm_sub3());
				
				if (isNull(r.par_itm_nm())) {
					if(parItm.sundry_itm_flg()){
						MAM_SUNDRY_ITM_R parSundryItm = getSundryItm(r.par_itm_cd(), r.par_itm_sub1(), r.par_itm_sub2(), r.par_itm_sub3()
								, r.par_sno1(), r.par_sno2(), r.par_sno3(), r.par_sno4());
						r.par_itm_nm(nvl(parSundryItm.itm_nm(), parItm.itm_nm()));
					}
					else {
						r.par_itm_nm(parItm.itm_nm());
					}
				}				

				r.par_ac_itm_grp_cd(parItm.ac_itm_grp_cd());
				r.par_itm_jnl_cd(parItm.itm_jnl_cd());
			}
		}

		protected void setInvTransFlg(IoAct_Upd01_DtlR r) {
			if (!MAC_SLIP_STS_TYP.isCRT(r.slip_sts_typ())
					|| !MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())
					|| isNull(r.base_unit_qty())) {
				return;
			}
			// 在庫発生基準
			setInvTransFlgAccrual(r.tia());
			// 資産発生基準
			setInvTransFlgAccpt(r.tia());
			// 使用可能日基準
			setInvTransFlgAvl(r.tia());
			// 出庫場所、入庫場所を元に戻す
			setLoc(r);
		}

		protected void setInvTransFlgAccrual(MST_IO_ACT_R r) {
			// 在庫発生基準
			if (MSC_IO_ACT_TYP.is_accrual(r.io_act_typ())
					// 他勘定扱いの売上返品は対象外とする（入荷を対象とする）
					&& !(MSC_IO_ACT_TYP.isACXFR_GR(r.io_act_typ()) && MAC_TRD_PTN_TYP.isSLS_RTN(r.trd_ptn_typ()))
					&& MSC_IN_XFR_TYP.isIN_LOC(r.in_xfr_typ())
					&& (MAC_STR.isNULL_VAL(r.stk_arrv_bp_cd()) || !isNull(getLoc(r.loc_cd()).sppl_cd()))) {
				r.accrual_flg(true);
			}
		}

		protected void setInvTransFlgAccpt(MST_IO_ACT_R r) {
			// 資産発生基準
			if (MSC_IO_ACT_TYP.is_accpt(r.io_act_typ())
					&& (MAC_ASST_TYP.isCO_SLS(r.asst_typ()) || MAC_ASST_TYP.isCO_PROD(r.asst_typ()))
					&& (isNull(r.gi_loc_cd()) || isNull(r.gr_loc_cd()) || !isSame(r.gi_loc_cd(), r.gr_loc_cd()))
					) {
				r.accpt_flg(true);
			}
		}

		protected void setInvTransFlgAvl(MST_IO_ACT_R r) {
			// 使用可能日基準
			if ((MSC_IO_ACT_TYP.is_avl(r.io_act_typ())
					// 通常管理の仕入
					|| (MSC_IO_ACT_TYP.isPURC_GR(r.io_act_typ())
							|| MSC_IO_ACT_TYP.isONR_RCV_GR(r.io_act_typ())
							|| MSC_IO_ACT_TYP.isXPNS_PURC_GR(r.io_act_typ())) && !isSame(r.slip_no(), r.par_slip_no())
						// ＶＭＩの仕入は対象外とする（入荷を対象とする）
						&& !MAC_TRD_PTN_TYP.isPURC_VMI(r.trd_ptn_typ())
					// 未着管理の入荷
					|| MSC_IO_ACT_TYP.isARR(r.io_act_typ()) && !MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ()) && !isSame(r.slip_no(), r.par_slip_no())
					// 発注有りのＶＭＩ、無償受給の入荷
					|| MSC_IO_ACT_TYP.isARR(r.io_act_typ()) && !MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ())
						&& (MSC_STK_ID_TYP.isRNT_RCV(r.stk_id_typ()) || MSC_STK_ID_TYP.isNCV_RCV(r.stk_id_typ()))
					// 計画外の入荷
					|| MSC_IO_ACT_TYP.isARR(r.io_act_typ()) && MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ()))
					&& MSC_IN_XFR_TYP.isIN_LOC(r.in_xfr_typ())
					&& MSC_STK_INSP_TYP.isFIN(r.stk_insp_typ())
					&& (MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ())
//							|| MSC_STK_ID_TYP.isRTN_PRE_ACCPT(r.stk_id_typ())
							|| MSC_STK_ID_TYP.isCSTSTK(r.stk_id_typ())
							|| MSC_STK_ID_TYP.isRNT_RCV(r.stk_id_typ())
//							|| MSC_STK_ID_TYP.isPURC_PRE_ACCPT(r.stk_id_typ())
//							|| MSC_STK_ID_TYP.isACCPT_DFCT(r.stk_id_typ())	在庫推移で表示したくないので対象外とする
							|| MSC_STK_ID_TYP.isNCV_RCV(r.stk_id_typ())
							|| MSC_STK_ID_TYP.isONR_PROV(r.stk_id_typ()))
					&& (MAC_STR.isNULL_VAL(r.stk_arrv_bp_cd()) || !isNull(getLoc(r.loc_cd()).sppl_cd()))) {
				r.avl_flg(true);
			}
		}

		protected void setLoc(IoAct_Upd01_DtlR r) {
			if (!isNullOr(r.org_gi_loc_cd(), r.org_gr_loc_cd())) {
				r.gi_loc_cd(r.org_gi_loc_cd());
				r.gr_loc_cd(r.org_gr_loc_cd());
			}
		}

		protected void selectMSW_IO_ACT(MCList<MSW_IO_ACT_R> selectL) {
			MSW_IO_ACT_R selectL_t = MSW_IO_ACT_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(selectL_t);
			selectL_bldr.setSelectAll();
			selectL_bldr.addSelect(MSC_IO_ACT_TYP$SLIP_SORT_SEQ(selectL_t.io_act_typ).as("slip_sort_seq"));
			selectL_bldr.setOrderByAsc(pr("slip_sort_seq"), pr("act_no"), pr("act_d_no"), pr("act_io_no"), pr("trn_typ"));
			dbSelect("MSBEL5010_MSW_IO_ACT_S01", selectL, selectL_bldr);
		}

		protected Map_IoAct_Upd01_DtlR_MSW_IO_ACT_R<IoAct_Upd01_DtlR,MSW_IO_ACT_R> createMap_IoAct_Upd01_DtlR_MSW_IO_ACT_R() {
			return new Map_IoAct_Upd01_DtlR_MSW_IO_ACT_R<IoAct_Upd01_DtlR, MSW_IO_ACT_R>();
		}

		public class Map_IoAct_Upd01_DtlR_MSW_IO_ACT_R<D extends IoAct_Upd01_DtlR, S extends MSW_IO_ACT_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(IoAct_Upd01_DtlR.$ac_dt, MSW_IO_ACT_R.$ac_dt);
				addColumnPathMap(IoAct_Upd01_DtlR.$act_tm, MSW_IO_ACT_R.$act_tm);
				addColumnPathMap(IoAct_Upd01_DtlR.$act_no, MSW_IO_ACT_R.$act_no);
				addColumnPathMap(IoAct_Upd01_DtlR.$act_seq, MSW_IO_ACT_R.$act_seq);
				addColumnPathMap(IoAct_Upd01_DtlR.$act_rev_no, MSW_IO_ACT_R.$act_rev_no);
				addColumnPathMap(IoAct_Upd01_DtlR.$act_d_no, MSW_IO_ACT_R.$act_d_no);
				addColumnPathMap(IoAct_Upd01_DtlR.$act_d_seq, MSW_IO_ACT_R.$act_d_seq);
				addColumnPathMap(IoAct_Upd01_DtlR.$act_io_no, MSW_IO_ACT_R.$act_io_no);
				addColumnPathMap(IoAct_Upd01_DtlR.$act_io_seq, MSW_IO_ACT_R.$act_io_seq);
				addColumnPathMap(IoAct_Upd01_DtlR.$un_fix_flg, MSW_IO_ACT_R.$un_fix_flg);
				addColumnPathMap(IoAct_Upd01_DtlR.$temp_ap_flg, MSW_IO_ACT_R.$temp_ap_flg);
				addColumnPathMap(IoAct_Upd01_DtlR.$trd_cd, MSW_IO_ACT_R.$trd_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$trd_ptn_typ, MSW_IO_ACT_R.$trd_ptn_typ);
				addColumnPathMap(IoAct_Upd01_DtlR.$trn_typ, MSW_IO_ACT_R.$trn_typ);
				addColumnPathMap(IoAct_Upd01_DtlR.$io_act_typ, MSW_IO_ACT_R.$io_act_typ);
				addColumnPathMap(IoAct_Upd01_DtlR.$rsn_cd, MSW_IO_ACT_R.$rsn_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$gi_wg_cd, MSW_IO_ACT_R.$gi_wg_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$gr_wg_cd, MSW_IO_ACT_R.$gr_wg_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$act_dpt_cd, MSW_IO_ACT_R.$act_dpt_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$purc_dpt_cd, MSW_IO_ACT_R.$purc_dpt_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$ap_dpt_cd, MSW_IO_ACT_R.$ap_dpt_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$sls_dpt_cd, MSW_IO_ACT_R.$sls_dpt_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$ar_dpt_cd, MSW_IO_ACT_R.$ar_dpt_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$bd_dpt_cd, MSW_IO_ACT_R.$bd_dpt_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$sub_dpt_cd1, MSW_IO_ACT_R.$sub_dpt_cd1);
				addColumnPathMap(IoAct_Upd01_DtlR.$sub_dpt_cd2, MSW_IO_ACT_R.$sub_dpt_cd2);
				addColumnPathMap(IoAct_Upd01_DtlR.$sub_dpt_cd3, MSW_IO_ACT_R.$sub_dpt_cd3);
				addColumnPathMap(IoAct_Upd01_DtlR.$act_usr_cd, MSW_IO_ACT_R.$act_usr_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$sls_usr_cd, MSW_IO_ACT_R.$sls_usr_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$mfg_usr_cd, MSW_IO_ACT_R.$mfg_usr_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$purc_usr_cd, MSW_IO_ACT_R.$purc_usr_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$itm_cd, MSW_IO_ACT_R.$itm_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$itm_sub1, MSW_IO_ACT_R.$itm_sub1);
				addColumnPathMap(IoAct_Upd01_DtlR.$itm_sub2, MSW_IO_ACT_R.$itm_sub2);
				addColumnPathMap(IoAct_Upd01_DtlR.$itm_sub3, MSW_IO_ACT_R.$itm_sub3);
				addColumnPathMap(IoAct_Upd01_DtlR.$itm_nm, MSW_IO_ACT_R.$itm_nm);
				addColumnPathMap(IoAct_Upd01_DtlR.$stk_mng_typ, MSW_IO_ACT_R.$stk_mng_typ);
				addColumnPathMap(IoAct_Upd01_DtlR.$sundry_itm_flg, MSW_IO_ACT_R.$sundry_itm_flg);
				addColumnPathMap(IoAct_Upd01_DtlR.$stk_arrv_bp_cd, MSW_IO_ACT_R.$stk_arrv_bp_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$lot_no, MSW_IO_ACT_R.$lot_no);
				addColumnPathMap(IoAct_Upd01_DtlR.$sublot_no, MSW_IO_ACT_R.$sublot_no);
				addColumnPathMap(IoAct_Upd01_DtlR.$sno1, MSW_IO_ACT_R.$sno1);
				addColumnPathMap(IoAct_Upd01_DtlR.$sno2, MSW_IO_ACT_R.$sno2);
				addColumnPathMap(IoAct_Upd01_DtlR.$sno3, MSW_IO_ACT_R.$sno3);
				addColumnPathMap(IoAct_Upd01_DtlR.$sno4, MSW_IO_ACT_R.$sno4);
				addColumnPathMap(IoAct_Upd01_DtlR.$sno1_mng_typ, MSW_IO_ACT_R.$sno1_mng_typ);
				addColumnPathMap(IoAct_Upd01_DtlR.$sno2_mng_typ, MSW_IO_ACT_R.$sno2_mng_typ);
				addColumnPathMap(IoAct_Upd01_DtlR.$sno3_mng_typ, MSW_IO_ACT_R.$sno3_mng_typ);
				addColumnPathMap(IoAct_Upd01_DtlR.$sno4_mng_typ, MSW_IO_ACT_R.$sno4_mng_typ);
				addColumnPathMap(IoAct_Upd01_DtlR.$fix_no_typ, MSW_IO_ACT_R.$fix_no_typ);
				addColumnPathMap(IoAct_Upd01_DtlR.$fix_no, MSW_IO_ACT_R.$fix_no);
				addColumnPathMap(IoAct_Upd01_DtlR.$in_xfr_typ, MSW_IO_ACT_R.$in_xfr_typ);
				addColumnPathMap(IoAct_Upd01_DtlR.$quality_typ, MSW_IO_ACT_R.$quality_typ);
				addColumnPathMap(IoAct_Upd01_DtlR.$stk_insp_typ, MSW_IO_ACT_R.$stk_insp_typ);
				addColumnPathMap(IoAct_Upd01_DtlR.$stk_id_typ, MSW_IO_ACT_R.$stk_id_typ);
				addColumnPathMap(IoAct_Upd01_DtlR.$stk_bp_cd, MSW_IO_ACT_R.$stk_bp_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$trd_unit_qty, MSW_IO_ACT_R.$trd_unit_qty);
				addColumnPathMap(IoAct_Upd01_DtlR.$trd_unit_cd, MSW_IO_ACT_R.$trd_unit_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$pack_unit_qty, MSW_IO_ACT_R.$pack_unit_qty);
				addColumnPathMap(IoAct_Upd01_DtlR.$pack_unit_cd, MSW_IO_ACT_R.$pack_unit_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$base_unit_qty, MSW_IO_ACT_R.$base_unit_qty);
				addColumnPathMap(IoAct_Upd01_DtlR.$base_unit_cd, MSW_IO_ACT_R.$base_unit_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$trd_cur_cd, MSW_IO_ACT_R.$trd_cur_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$trd_cur_upri, MSW_IO_ACT_R.$trd_cur_upri);
				addColumnPathMap(IoAct_Upd01_DtlR.$trd_cur_amt, MSW_IO_ACT_R.$trd_cur_amt);
				addColumnPathMap(IoAct_Upd01_DtlR.$trd_cur_proc_amt, MSW_IO_ACT_R.$trd_cur_proc_amt);
				addColumnPathMap(IoAct_Upd01_DtlR.$trd_cur_onr_prov_amt, MSW_IO_ACT_R.$trd_cur_onr_prov_amt);
				addColumnPathMap(IoAct_Upd01_DtlR.$trd_cur_tax_amt, MSW_IO_ACT_R.$trd_cur_tax_amt);
				addColumnPathMap(IoAct_Upd01_DtlR.$base_cur_cd, MSW_IO_ACT_R.$base_cur_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$base_cur_upri, MSW_IO_ACT_R.$base_cur_upri);
				addColumnPathMap(IoAct_Upd01_DtlR.$base_cur_amt, MSW_IO_ACT_R.$base_cur_amt);
				addColumnPathMap(IoAct_Upd01_DtlR.$base_cur_proc_amt, MSW_IO_ACT_R.$base_cur_proc_amt);
				addColumnPathMap(IoAct_Upd01_DtlR.$base_cur_onr_prov_amt, MSW_IO_ACT_R.$base_cur_onr_prov_amt);
				addColumnPathMap(IoAct_Upd01_DtlR.$base_cur_tax_amt, MSW_IO_ACT_R.$base_cur_tax_amt);
				addColumnPathMap(IoAct_Upd01_DtlR.$ptax_cur_cd, MSW_IO_ACT_R.$ptax_cur_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$ptax_cur_upri, MSW_IO_ACT_R.$ptax_cur_upri);
				addColumnPathMap(IoAct_Upd01_DtlR.$ptax_cur_amt, MSW_IO_ACT_R.$ptax_cur_amt);
				addColumnPathMap(IoAct_Upd01_DtlR.$ptax_cur_proc_amt, MSW_IO_ACT_R.$ptax_cur_proc_amt);
				addColumnPathMap(IoAct_Upd01_DtlR.$ptax_cur_onr_prov_amt, MSW_IO_ACT_R.$ptax_cur_onr_prov_amt);
				addColumnPathMap(IoAct_Upd01_DtlR.$ptax_cur_tax_amt, MSW_IO_ACT_R.$ptax_cur_tax_amt);
				addColumnPathMap(IoAct_Upd01_DtlR.$wtax_rate, MSW_IO_ACT_R.$wtax_rate);
				addColumnPathMap(IoAct_Upd01_DtlR.$wtax_amt, MSW_IO_ACT_R.$wtax_amt);
				addColumnPathMap(IoAct_Upd01_DtlR.$tax_cd, MSW_IO_ACT_R.$tax_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$xrate_cd, MSW_IO_ACT_R.$xrate_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$xrate, MSW_IO_ACT_R.$xrate);
				addColumnPathMap(IoAct_Upd01_DtlR.$ptax_xrate_cd, MSW_IO_ACT_R.$ptax_xrate_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$ptax_xrate, MSW_IO_ACT_R.$ptax_xrate);
				addColumnPathMap(IoAct_Upd01_DtlR.$slo_no, MSW_IO_ACT_R.$slo_no);
				addColumnPathMap(IoAct_Upd01_DtlR.$po_no, MSW_IO_ACT_R.$po_no);
				addColumnPathMap(IoAct_Upd01_DtlR.$iv_no, MSW_IO_ACT_R.$iv_no);
				addColumnPathMap(IoAct_Upd01_DtlR.$rcpt_iv_no, MSW_IO_ACT_R.$rcpt_iv_no);
				addColumnPathMap(IoAct_Upd01_DtlR.$bd_ctg_cd, MSW_IO_ACT_R.$bd_ctg_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$bd_bp_cd, MSW_IO_ACT_R.$bd_bp_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$bd_oper_cd, MSW_IO_ACT_R.$bd_oper_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$bd_loc_cd, MSW_IO_ACT_R.$bd_loc_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$bd_slo_no, MSW_IO_ACT_R.$bd_slo_no);
				addColumnPathMap(IoAct_Upd01_DtlR.$bd_po_no, MSW_IO_ACT_R.$bd_po_no);
				addColumnPathMap(IoAct_Upd01_DtlR.$bd_iv_no, MSW_IO_ACT_R.$bd_iv_no);
				addColumnPathMap(IoAct_Upd01_DtlR.$bd_wg_cd, MSW_IO_ACT_R.$bd_wg_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$dlv_cd, MSW_IO_ACT_R.$dlv_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$tdlv_cd, MSW_IO_ACT_R.$tdlv_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$acst_cd, MSW_IO_ACT_R.$acst_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$cst_cd, MSW_IO_ACT_R.$cst_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$dest_cd1, MSW_IO_ACT_R.$dest_cd1);
				addColumnPathMap(IoAct_Upd01_DtlR.$dest_cd2, MSW_IO_ACT_R.$dest_cd2);
				addColumnPathMap(IoAct_Upd01_DtlR.$dest_cd3, MSW_IO_ACT_R.$dest_cd3);
				addColumnPathMap(IoAct_Upd01_DtlR.$asppl_cd, MSW_IO_ACT_R.$asppl_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$sppl_cd, MSW_IO_ACT_R.$sppl_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$spot_flg, MSW_IO_ACT_R.$spot_flg);
				addColumnPathMap(IoAct_Upd01_DtlR.$sttl_schd_dt, MSW_IO_ACT_R.$sttl_schd_dt);
				addColumnPathMap(IoAct_Upd01_DtlR.$sttl_cd, MSW_IO_ACT_R.$sttl_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$cst_itm_cd, MSW_IO_ACT_R.$cst_itm_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$cst_itm_nm, MSW_IO_ACT_R.$cst_itm_nm);
				addColumnPathMap(IoAct_Upd01_DtlR.$sppl_itm_cd, MSW_IO_ACT_R.$sppl_itm_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$sppl_itm_nm, MSW_IO_ACT_R.$sppl_itm_nm);
				addColumnPathMap(IoAct_Upd01_DtlR.$purc_typ, MSW_IO_ACT_R.$purc_typ);
				addColumnPathMap(IoAct_Upd01_DtlR.$itm_mfg_inst_no, MSW_IO_ACT_R.$itm_mfg_inst_no);
				addColumnPathMap(IoAct_Upd01_DtlR.$itm_inst_qty, MSW_IO_ACT_R.$itm_inst_qty);
				addColumnPathMap(IoAct_Upd01_DtlR.$mfg_inst_no, MSW_IO_ACT_R.$mfg_inst_no);
				addColumnPathMap(IoAct_Upd01_DtlR.$mfg_act_no, MSW_IO_ACT_R.$mfg_act_no);
				addColumnPathMap(IoAct_Upd01_DtlR.$mfg_st_qty, MSW_IO_ACT_R.$mfg_st_qty);
				addColumnPathMap(IoAct_Upd01_DtlR.$oper_act_no, MSW_IO_ACT_R.$oper_act_no);
				addColumnPathMap(IoAct_Upd01_DtlR.$yield_rate, MSW_IO_ACT_R.$yield_rate);
				addColumnPathMap(IoAct_Upd01_DtlR.$disp_seq, MSW_IO_ACT_R.$disp_seq);
				addColumnPathMap(IoAct_Upd01_DtlR.$oper_cd, MSW_IO_ACT_R.$oper_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$inpt_loc_cd, MSW_IO_ACT_R.$inpt_loc_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$inpt_str_ln_cd, MSW_IO_ACT_R.$inpt_str_ln_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$strg_loc_cd, MSW_IO_ACT_R.$strg_loc_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$strg_str_ln_cd, MSW_IO_ACT_R.$strg_str_ln_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$mfg_inst_unit_typ, MSW_IO_ACT_R.$mfg_inst_unit_typ);
				addColumnPathMap(IoAct_Upd01_DtlR.$par_itm_cd, MSW_IO_ACT_R.$par_itm_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$par_itm_sub1, MSW_IO_ACT_R.$par_itm_sub1);
				addColumnPathMap(IoAct_Upd01_DtlR.$par_itm_sub2, MSW_IO_ACT_R.$par_itm_sub2);
				addColumnPathMap(IoAct_Upd01_DtlR.$par_itm_sub3, MSW_IO_ACT_R.$par_itm_sub3);
				addColumnPathMap(IoAct_Upd01_DtlR.$par_itm_nm, MSW_IO_ACT_R.$par_itm_nm);
				addColumnPathMap(IoAct_Upd01_DtlR.$par_lot_no, MSW_IO_ACT_R.$par_lot_no);
				addColumnPathMap(IoAct_Upd01_DtlR.$par_sublot_no, MSW_IO_ACT_R.$par_sublot_no);
				addColumnPathMap(IoAct_Upd01_DtlR.$par_sno1, MSW_IO_ACT_R.$par_sno1);
				addColumnPathMap(IoAct_Upd01_DtlR.$par_sno2, MSW_IO_ACT_R.$par_sno2);
				addColumnPathMap(IoAct_Upd01_DtlR.$par_sno3, MSW_IO_ACT_R.$par_sno3);
				addColumnPathMap(IoAct_Upd01_DtlR.$par_sno4, MSW_IO_ACT_R.$par_sno4);
				addColumnPathMap(IoAct_Upd01_DtlR.$trd_rmrks, MSW_IO_ACT_R.$trd_rmrks);
				addColumnPathMap(IoAct_Upd01_DtlR.$trd_d_rmrks, MSW_IO_ACT_R.$trd_d_rmrks);
				addColumnPathMap(IoAct_Upd01_DtlR.$sub_char1, MSW_IO_ACT_R.$sub_char1);
				addColumnPathMap(IoAct_Upd01_DtlR.$sub_char2, MSW_IO_ACT_R.$sub_char2);
				addColumnPathMap(IoAct_Upd01_DtlR.$sub_char3, MSW_IO_ACT_R.$sub_char3);
				addColumnPathMap(IoAct_Upd01_DtlR.$sub_char4, MSW_IO_ACT_R.$sub_char4);
				addColumnPathMap(IoAct_Upd01_DtlR.$sub_char5, MSW_IO_ACT_R.$sub_char5);
				addColumnPathMap(IoAct_Upd01_DtlR.$sub_char6, MSW_IO_ACT_R.$sub_char6);
				addColumnPathMap(IoAct_Upd01_DtlR.$sub_char7, MSW_IO_ACT_R.$sub_char7);
				addColumnPathMap(IoAct_Upd01_DtlR.$sub_char8, MSW_IO_ACT_R.$sub_char8);
				addColumnPathMap(IoAct_Upd01_DtlR.$sub_char9, MSW_IO_ACT_R.$sub_char9);
				addColumnPathMap(IoAct_Upd01_DtlR.$sub_char10, MSW_IO_ACT_R.$sub_char10);
				addColumnPathMap(IoAct_Upd01_DtlR.$sub_num1, MSW_IO_ACT_R.$sub_num1);
				addColumnPathMap(IoAct_Upd01_DtlR.$sub_num2, MSW_IO_ACT_R.$sub_num2);
				addColumnPathMap(IoAct_Upd01_DtlR.$sub_num3, MSW_IO_ACT_R.$sub_num3);
				addColumnPathMap(IoAct_Upd01_DtlR.$sub_dt1, MSW_IO_ACT_R.$sub_dt1);
				addColumnPathMap(IoAct_Upd01_DtlR.$sub_dt2, MSW_IO_ACT_R.$sub_dt2);
				addColumnPathMap(IoAct_Upd01_DtlR.$sub_dt3, MSW_IO_ACT_R.$sub_dt3);
				addColumnPathMap(IoAct_Upd01_DtlR.$data_crud_typ, MSW_IO_ACT_R.$data_crud_typ);
				addColumnPathMap(IoAct_Upd01_DtlR.$can_ac_dt, MSW_IO_ACT_R.$can_ac_dt);
				addColumnPathMap(IoAct_Upd01_DtlR.$gi_loc_cd, MSW_IO_ACT_R.$gi_loc_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$gi_str_ln_cd, MSW_IO_ACT_R.$gi_str_ln_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$gr_loc_cd, MSW_IO_ACT_R.$gr_loc_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$gr_str_ln_cd, MSW_IO_ACT_R.$gr_str_ln_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$gi_gd_cd, MSW_IO_ACT_R.$gi_gd_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$gr_gd_cd, MSW_IO_ACT_R.$gr_gd_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$stktk_diff_qty, MSW_IO_ACT_R.$stktk_diff_qty);
				addColumnPathMap(IoAct_Upd01_DtlR.$pack_xfr_unit_cd, MSW_IO_ACT_R.$pack_xfr_unit_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$pack_xfr_qty, MSW_IO_ACT_R.$pack_xfr_qty);
				addColumnPathMap(IoAct_Upd01_DtlR.$via_dlv_typ, MSW_IO_ACT_R.$via_dlv_typ);
				addColumnPathMap(IoAct_Upd01_DtlR.$arr_ptn_typ, MSW_IO_ACT_R.$arr_ptn_typ);
				addColumnPathMap(IoAct_Upd01_DtlR.$yield_typ, MSW_IO_ACT_R.$yield_typ);
				addColumnPathMap(IoAct_Upd01_DtlR.$prov_typ, MSW_IO_ACT_R.$prov_typ);
				addColumnPathMap(IoAct_Upd01_DtlR.$purc_id_typ, MSW_IO_ACT_R.$purc_id_typ);
				addColumnPathMap(IoAct_Upd01_DtlR.$wia_io_typ, MSW_IO_ACT_R.$io_typ);
				addColumnPathMap(IoAct_Upd01_DtlR.$accpt_dfct_flg, MSW_IO_ACT_R.$accpt_dfct_flg);
				addColumnPathMap(IoAct_Upd01_DtlR.$par_slip_io_act_typ, MSW_IO_ACT_R.$par_slip_io_act_typ);
				addColumnPathMap(IoAct_Upd01_DtlR.$no_gi_alloc_flg, MSW_IO_ACT_R.$no_gi_alloc_flg);
				addColumnPathMap(IoAct_Upd01_DtlR.$acxfr_stk_id_typ, MSW_IO_ACT_R.$acxfr_stk_id_typ);
				addColumnPathMap(IoAct_Upd01_DtlR.$acxfr_stk_bp_cd, MSW_IO_ACT_R.$acxfr_stk_bp_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$acxfr_stk_arrv_bp_cd, MSW_IO_ACT_R.$acxfr_stk_arrv_bp_cd);
				addColumnPathMap(IoAct_Upd01_DtlR.$rsn_cd2, MSW_IO_ACT_R.$rsn_cd2);
			}
		}

		protected Map_Stk_Upd01_DtlR_IoAct_Upd01_DtlR<Stk_Upd01_DtlR,IoAct_Upd01_DtlR> createMap_Stk_Upd01_DtlR_IoAct_Upd01_DtlR() {
			return new Map_Stk_Upd01_DtlR_IoAct_Upd01_DtlR<Stk_Upd01_DtlR, IoAct_Upd01_DtlR>();
		}

		public class Map_Stk_Upd01_DtlR_IoAct_Upd01_DtlR<D extends Stk_Upd01_DtlR, S extends IoAct_Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Stk_Upd01_DtlR.$ac_ym, IoAct_Upd01_DtlR.$ac_ym);
				addColumnPathMap(Stk_Upd01_DtlR.$io_act_typ, IoAct_Upd01_DtlR.$io_act_typ);
				addColumnPathMap(Stk_Upd01_DtlR.$itm_cd, IoAct_Upd01_DtlR.$itm_cd);
				addColumnPathMap(Stk_Upd01_DtlR.$itm_sub1, IoAct_Upd01_DtlR.$itm_sub1);
				addColumnPathMap(Stk_Upd01_DtlR.$itm_sub2, IoAct_Upd01_DtlR.$itm_sub2);
				addColumnPathMap(Stk_Upd01_DtlR.$itm_sub3, IoAct_Upd01_DtlR.$itm_sub3);
				addColumnPathMap(Stk_Upd01_DtlR.$loc_cd, IoAct_Upd01_DtlR.$loc_cd);
				addColumnPathMap(Stk_Upd01_DtlR.$str_ln_cd, IoAct_Upd01_DtlR.$str_ln_cd);
				addColumnPathMap(Stk_Upd01_DtlR.$stk_arrv_bp_cd, IoAct_Upd01_DtlR.$stk_arrv_bp_cd);
				addColumnPathMap(Stk_Upd01_DtlR.$lot_no, IoAct_Upd01_DtlR.$lot_no);
				addColumnPathMap(Stk_Upd01_DtlR.$sublot_no, IoAct_Upd01_DtlR.$sublot_no);
				addColumnPathMap(Stk_Upd01_DtlR.$sno1, IoAct_Upd01_DtlR.$sno1);
				addColumnPathMap(Stk_Upd01_DtlR.$sno2, IoAct_Upd01_DtlR.$sno2);
				addColumnPathMap(Stk_Upd01_DtlR.$sno3, IoAct_Upd01_DtlR.$sno3);
				addColumnPathMap(Stk_Upd01_DtlR.$sno4, IoAct_Upd01_DtlR.$sno4);
				addColumnPathMap(Stk_Upd01_DtlR.$fix_no_typ, IoAct_Upd01_DtlR.$fix_no_typ);
				addColumnPathMap(Stk_Upd01_DtlR.$fix_no, IoAct_Upd01_DtlR.$fix_no);
				addColumnPathMap(Stk_Upd01_DtlR.$pack_unit_cd, IoAct_Upd01_DtlR.$pack_unit_cd);
				addColumnPathMap(Stk_Upd01_DtlR.$gd_cd, IoAct_Upd01_DtlR.$gd_cd);
				addColumnPathMap(Stk_Upd01_DtlR.$in_xfr_typ, IoAct_Upd01_DtlR.$in_xfr_typ);
				addColumnPathMap(Stk_Upd01_DtlR.$quality_typ, IoAct_Upd01_DtlR.$quality_typ);
				addColumnPathMap(Stk_Upd01_DtlR.$asst_typ, IoAct_Upd01_DtlR.$asst_typ);
				addColumnPathMap(Stk_Upd01_DtlR.$stk_insp_typ, IoAct_Upd01_DtlR.$stk_insp_typ);
				addColumnPathMap(Stk_Upd01_DtlR.$stk_id_typ, IoAct_Upd01_DtlR.$stk_id_typ);
				addColumnPathMap(Stk_Upd01_DtlR.$stk_bp_cd, IoAct_Upd01_DtlR.$stk_bp_cd);
				addColumnPathMap(Stk_Upd01_DtlR.$pack_unit_qty, IoAct_Upd01_DtlR.$pack_unit_qty);
				addColumnPathMap(Stk_Upd01_DtlR.$base_unit_qty, IoAct_Upd01_DtlR.$base_unit_qty);
			}
		}

		protected Map_Lot_Del01_CndR_IoAct_Upd01_DtlR<Lot_Del01_CndR,IoAct_Upd01_DtlR> createMap_Lot_Del01_CndR_IoAct_Upd01_DtlR() {
			return new Map_Lot_Del01_CndR_IoAct_Upd01_DtlR<Lot_Del01_CndR, IoAct_Upd01_DtlR>();
		}

		public class Map_Lot_Del01_CndR_IoAct_Upd01_DtlR<D extends Lot_Del01_CndR, S extends IoAct_Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Lot_Del01_CndR.$itm_cd, IoAct_Upd01_DtlR.$itm_cd);
				addColumnPathMap(Lot_Del01_CndR.$itm_sub1, IoAct_Upd01_DtlR.$itm_sub1);
				addColumnPathMap(Lot_Del01_CndR.$itm_sub2, IoAct_Upd01_DtlR.$itm_sub2);
				addColumnPathMap(Lot_Del01_CndR.$itm_sub3, IoAct_Upd01_DtlR.$itm_sub3);
				addColumnPathMap(Lot_Del01_CndR.$lot_no, IoAct_Upd01_DtlR.$lot_no);
				addColumnPathMap(Lot_Del01_CndR.$sublot_no, IoAct_Upd01_DtlR.$sublot_no);
			}
		}

		protected Map_LotTrace_Upd01_DtlGrR_IoAct_Upd01_DtlR<LotTrace_Upd01_DtlGrR,IoAct_Upd01_DtlR> createMap_LotTrace_Upd01_DtlGrR_IoAct_Upd01_DtlR() {
			return new Map_LotTrace_Upd01_DtlGrR_IoAct_Upd01_DtlR<LotTrace_Upd01_DtlGrR, IoAct_Upd01_DtlR>();
		}

		public class Map_LotTrace_Upd01_DtlGrR_IoAct_Upd01_DtlR<D extends LotTrace_Upd01_DtlGrR, S extends IoAct_Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(LotTrace_Upd01_DtlGrR.$data_crud_typ, IoAct_Upd01_DtlR.$data_crud_typ);
				addColumnPathMap(LotTrace_Upd01_DtlGrR.$itm_cd, IoAct_Upd01_DtlR.$itm_cd);
				addColumnPathMap(LotTrace_Upd01_DtlGrR.$itm_sub1, IoAct_Upd01_DtlR.$itm_sub1);
				addColumnPathMap(LotTrace_Upd01_DtlGrR.$itm_sub2, IoAct_Upd01_DtlR.$itm_sub2);
				addColumnPathMap(LotTrace_Upd01_DtlGrR.$itm_sub3, IoAct_Upd01_DtlR.$itm_sub3);
				addColumnPathMap(LotTrace_Upd01_DtlGrR.$lot_no, IoAct_Upd01_DtlR.$lot_no);
				addColumnPathMap(LotTrace_Upd01_DtlGrR.$sublot_no, IoAct_Upd01_DtlR.$sublot_no);
				addColumnPathMap(LotTrace_Upd01_DtlGrR.$sno1, IoAct_Upd01_DtlR.$sno1);
				addColumnPathMap(LotTrace_Upd01_DtlGrR.$sno2, IoAct_Upd01_DtlR.$sno2);
				addColumnPathMap(LotTrace_Upd01_DtlGrR.$sno3, IoAct_Upd01_DtlR.$sno3);
				addColumnPathMap(LotTrace_Upd01_DtlGrR.$sno4, IoAct_Upd01_DtlR.$sno4);
				addColumnPathMap(LotTrace_Upd01_DtlGrR.$slip_no, IoAct_Upd01_DtlR.$slip_no);
				addColumnPathMap(LotTrace_Upd01_DtlGrR.$itm_mfg_inst_no, IoAct_Upd01_DtlR.$itm_mfg_inst_no);
				addColumnPathMap(LotTrace_Upd01_DtlGrR.$mfg_act_no, IoAct_Upd01_DtlR.$mfg_act_no);
				addColumnPathMap(LotTrace_Upd01_DtlGrR.$base_gr_qty, IoAct_Upd01_DtlR.$base_unit_qty);
				addColumnPathMap(LotTrace_Upd01_DtlGrR.$base_unit_cd, IoAct_Upd01_DtlR.$base_unit_cd);
				addColumnPathMap(LotTrace_Upd01_DtlGrR.$sppl_cd, IoAct_Upd01_DtlR.$sppl_cd);
				addColumnPathMap(LotTrace_Upd01_DtlGrR.$act_dt, IoAct_Upd01_DtlR.$act_tm );
				addColumnPathMap(LotTrace_Upd01_DtlGrR.$trd_ptn_typ, IoAct_Upd01_DtlR.$trd_ptn_typ);
				addColumnPathMap(LotTrace_Upd01_DtlGrR.$io_act_typ, IoAct_Upd01_DtlR.$io_act_typ);
				addColumnPathMap(LotTrace_Upd01_DtlGrR.$mfg_inst_unit_typ, IoAct_Upd01_DtlR.$mfg_inst_unit_typ);
				addColumnPathMap(LotTrace_Upd01_DtlGrR.$mfg_inst_no, IoAct_Upd01_DtlR.$mfg_inst_no);
			}
		}

		protected Map_LotTrace_Upd01_DtlGiR_IoAct_Upd01_DtlR<LotTrace_Upd01_DtlGiR,IoAct_Upd01_DtlR> createMap_LotTrace_Upd01_DtlGiR_IoAct_Upd01_DtlR() {
			return new Map_LotTrace_Upd01_DtlGiR_IoAct_Upd01_DtlR<LotTrace_Upd01_DtlGiR, IoAct_Upd01_DtlR>();
		}

		public class Map_LotTrace_Upd01_DtlGiR_IoAct_Upd01_DtlR<D extends LotTrace_Upd01_DtlGiR, S extends IoAct_Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(LotTrace_Upd01_DtlGiR.$data_crud_typ, IoAct_Upd01_DtlR.$data_crud_typ);
				addColumnPathMap(LotTrace_Upd01_DtlGiR.$itm_cd, IoAct_Upd01_DtlR.$itm_cd);
				addColumnPathMap(LotTrace_Upd01_DtlGiR.$itm_sub1, IoAct_Upd01_DtlR.$itm_sub1);
				addColumnPathMap(LotTrace_Upd01_DtlGiR.$itm_sub2, IoAct_Upd01_DtlR.$itm_sub2);
				addColumnPathMap(LotTrace_Upd01_DtlGiR.$itm_sub3, IoAct_Upd01_DtlR.$itm_sub3);
				addColumnPathMap(LotTrace_Upd01_DtlGiR.$lot_no, IoAct_Upd01_DtlR.$lot_no);
				addColumnPathMap(LotTrace_Upd01_DtlGiR.$sublot_no, IoAct_Upd01_DtlR.$sublot_no);
				addColumnPathMap(LotTrace_Upd01_DtlGiR.$sno1, IoAct_Upd01_DtlR.$sno1);
				addColumnPathMap(LotTrace_Upd01_DtlGiR.$sno2, IoAct_Upd01_DtlR.$sno2);
				addColumnPathMap(LotTrace_Upd01_DtlGiR.$sno3, IoAct_Upd01_DtlR.$sno3);
				addColumnPathMap(LotTrace_Upd01_DtlGiR.$sno4, IoAct_Upd01_DtlR.$sno4);
				addColumnPathMap(LotTrace_Upd01_DtlGiR.$slip_no, IoAct_Upd01_DtlR.$slip_no);
				addColumnPathMap(LotTrace_Upd01_DtlGiR.$itm_mfg_inst_no, IoAct_Upd01_DtlR.$itm_mfg_inst_no);
				addColumnPathMap(LotTrace_Upd01_DtlGiR.$mfg_act_no, IoAct_Upd01_DtlR.$mfg_act_no);
				addColumnPathMap(LotTrace_Upd01_DtlGiR.$base_gi_qty, IoAct_Upd01_DtlR.$base_unit_qty);
				addColumnPathMap(LotTrace_Upd01_DtlGiR.$base_unit_cd, IoAct_Upd01_DtlR.$base_unit_cd);
				addColumnPathMap(LotTrace_Upd01_DtlGiR.$dlv_cd, IoAct_Upd01_DtlR.$dlv_cd);
				addColumnPathMap(LotTrace_Upd01_DtlGiR.$tdlv_cd, IoAct_Upd01_DtlR.$tdlv_cd);
				addColumnPathMap(LotTrace_Upd01_DtlGiR.$loc_cd, IoAct_Upd01_DtlR.$loc_cd);
				addColumnPathMap(LotTrace_Upd01_DtlGiR.$act_dt, IoAct_Upd01_DtlR.$act_tm);
				addColumnPathMap(LotTrace_Upd01_DtlGiR.$trd_ptn_typ, IoAct_Upd01_DtlR.$trd_ptn_typ);
				addColumnPathMap(LotTrace_Upd01_DtlGiR.$io_act_typ, IoAct_Upd01_DtlR.$io_act_typ);
				addColumnPathMap(LotTrace_Upd01_DtlGiR.$mfg_inst_unit_typ, IoAct_Upd01_DtlR.$mfg_inst_unit_typ);

			}
		}

		protected Map_Srch_TgtR_IoAct_Upd01_DtlR<Srch_TgtR,IoAct_Upd01_DtlR> createMap_Srch_TgtR_IoAct_Upd01_DtlR() {
			return new Map_Srch_TgtR_IoAct_Upd01_DtlR<Srch_TgtR, IoAct_Upd01_DtlR>();
		}

		public class Map_Srch_TgtR_IoAct_Upd01_DtlR<D extends Srch_TgtR, S extends IoAct_Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch_TgtR.$itm_cd, IoAct_Upd01_DtlR.$itm_cd);
				addColumnPathMap(Srch_TgtR.$itm_sub1, IoAct_Upd01_DtlR.$itm_sub1);
				addColumnPathMap(Srch_TgtR.$itm_sub2, IoAct_Upd01_DtlR.$itm_sub2);
				addColumnPathMap(Srch_TgtR.$itm_sub3, IoAct_Upd01_DtlR.$itm_sub3);
				addColumnPathMap(Srch_TgtR.$gi_loc_cd, IoAct_Upd01_DtlR.$loc_cd);
				// 棚・ラインは設定しない
				addColumnPathMap(Srch_TgtR.$gi_stk_arrv_bp_cd, IoAct_Upd01_DtlR.$stk_arrv_bp_cd);
				addColumnPathMap(Srch_TgtR.$quality_typ, IoAct_Upd01_DtlR.$quality_typ);
				addColumnPathMap(Srch_TgtR.$stk_id_typ, IoAct_Upd01_DtlR.$stk_id_typ);
				addColumnPathMap(Srch_TgtR.$stk_bp_cd, IoAct_Upd01_DtlR.$stk_bp_cd);
				addColumnPathMap(Srch_TgtR.$gd_cd, IoAct_Upd01_DtlR.$gd_cd);
				// ロット・サブロットは設定しない（設定すると引当管理サービスの下り電文にロット未設定のレコードが含まれないため。下り電文取得後、当機能で絞込を行う）
				addColumnPathMap(Srch_TgtR.$sno1, IoAct_Upd01_DtlR.$sno1);
				addColumnPathMap(Srch_TgtR.$sno2, IoAct_Upd01_DtlR.$sno2);
				addColumnPathMap(Srch_TgtR.$sno3, IoAct_Upd01_DtlR.$sno3);
				addColumnPathMap(Srch_TgtR.$sno4, IoAct_Upd01_DtlR.$sno4);
				addColumnPathMap(Srch_TgtR.$pack_unit_cd, IoAct_Upd01_DtlR.$pack_unit_cd);
				addColumnPathMap(Srch_TgtR.$base_unit_cd, IoAct_Upd01_DtlR.$base_unit_cd);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.peg_no(src.getNumberNE(PEG_NO_COL));
				dest.not_lot_fix_flg(true);
			}
		}

		protected Map_MST_STK_R_IoAct_Upd01_DtlR<MST_STK_R,IoAct_Upd01_DtlR> createMap_MST_STK_R_IoAct_Upd01_DtlR() {
			return new Map_MST_STK_R_IoAct_Upd01_DtlR<MST_STK_R, IoAct_Upd01_DtlR>();
		}

		public class Map_MST_STK_R_IoAct_Upd01_DtlR<D extends MST_STK_R, S extends IoAct_Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_STK_R.$itm_cd, IoAct_Upd01_DtlR.$itm_cd);
				addColumnPathMap(MST_STK_R.$itm_sub1, IoAct_Upd01_DtlR.$itm_sub1);
				addColumnPathMap(MST_STK_R.$itm_sub2, IoAct_Upd01_DtlR.$itm_sub2);
				addColumnPathMap(MST_STK_R.$itm_sub3, IoAct_Upd01_DtlR.$itm_sub3);
				addColumnPathMap(MST_STK_R.$loc_cd, IoAct_Upd01_DtlR.$loc_cd);
				addColumnPathMap(MST_STK_R.$str_ln_cd, IoAct_Upd01_DtlR.$str_ln_cd);
				addColumnPathMap(MST_STK_R.$stk_arrv_bp_cd, IoAct_Upd01_DtlR.$stk_arrv_bp_cd);
				addColumnPathMap(MST_STK_R.$lot_no, IoAct_Upd01_DtlR.$lot_no);
				addColumnPathMap(MST_STK_R.$sublot_no, IoAct_Upd01_DtlR.$sublot_no);
				addColumnPathMap(MST_STK_R.$sno1, IoAct_Upd01_DtlR.$sno1);
				addColumnPathMap(MST_STK_R.$sno2, IoAct_Upd01_DtlR.$sno2);
				addColumnPathMap(MST_STK_R.$sno3, IoAct_Upd01_DtlR.$sno3);
				addColumnPathMap(MST_STK_R.$sno4, IoAct_Upd01_DtlR.$sno4);
				addColumnPathMap(MST_STK_R.$fix_no_typ, IoAct_Upd01_DtlR.$fix_no_typ);
				addColumnPathMap(MST_STK_R.$fix_no, IoAct_Upd01_DtlR.$fix_no);
				addColumnPathMap(MST_STK_R.$pack_unit_cd, IoAct_Upd01_DtlR.$pack_unit_cd);
				addColumnPathMap(MST_STK_R.$gd_cd, IoAct_Upd01_DtlR.$gd_cd);
				addColumnPathMap(MST_STK_R.$in_xfr_typ, IoAct_Upd01_DtlR.$in_xfr_typ);
				addColumnPathMap(MST_STK_R.$quality_typ, IoAct_Upd01_DtlR.$quality_typ);
				addColumnPathMap(MST_STK_R.$asst_typ, IoAct_Upd01_DtlR.$asst_typ);
				addColumnPathMap(MST_STK_R.$stk_insp_typ, IoAct_Upd01_DtlR.$stk_insp_typ);
				addColumnPathMap(MST_STK_R.$stk_id_typ, IoAct_Upd01_DtlR.$stk_id_typ);
				addColumnPathMap(MST_STK_R.$stk_bp_cd, IoAct_Upd01_DtlR.$stk_bp_cd);
				addColumnPathMap(MST_STK_R.$pack_unit_qty, IoAct_Upd01_DtlR.$pack_unit_qty);
				addColumnPathMap(MST_STK_R.$base_unit_qty, IoAct_Upd01_DtlR.$base_unit_qty);
			}
		}

		protected Map_MST_MLY_STK_DTL_R_IoAct_Upd01_DtlR<MST_MLY_STK_DTL_R,IoAct_Upd01_DtlR> createMap_MST_MLY_STK_DTL_R_IoAct_Upd01_DtlR() {
			return new Map_MST_MLY_STK_DTL_R_IoAct_Upd01_DtlR<MST_MLY_STK_DTL_R, IoAct_Upd01_DtlR>();
		}

		public class Map_MST_MLY_STK_DTL_R_IoAct_Upd01_DtlR<D extends MST_MLY_STK_DTL_R, S extends IoAct_Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_MLY_STK_DTL_R.$ac_ym, IoAct_Upd01_DtlR.$ac_ym);
				addColumnPathMap(MST_MLY_STK_DTL_R.$itm_cd, IoAct_Upd01_DtlR.$itm_cd);
				addColumnPathMap(MST_MLY_STK_DTL_R.$itm_sub1, IoAct_Upd01_DtlR.$itm_sub1);
				addColumnPathMap(MST_MLY_STK_DTL_R.$itm_sub2, IoAct_Upd01_DtlR.$itm_sub2);
				addColumnPathMap(MST_MLY_STK_DTL_R.$itm_sub3, IoAct_Upd01_DtlR.$itm_sub3);
				addColumnPathMap(MST_MLY_STK_DTL_R.$loc_cd, IoAct_Upd01_DtlR.$loc_cd);
				addColumnPathMap(MST_MLY_STK_DTL_R.$str_ln_cd, IoAct_Upd01_DtlR.$str_ln_cd);
				addColumnPathMap(MST_MLY_STK_DTL_R.$stk_arrv_bp_cd, IoAct_Upd01_DtlR.$stk_arrv_bp_cd);
				addColumnPathMap(MST_MLY_STK_DTL_R.$lot_no, IoAct_Upd01_DtlR.$lot_no);
				addColumnPathMap(MST_MLY_STK_DTL_R.$sublot_no, IoAct_Upd01_DtlR.$sublot_no);
				addColumnPathMap(MST_MLY_STK_DTL_R.$sno1, IoAct_Upd01_DtlR.$sno1);
				addColumnPathMap(MST_MLY_STK_DTL_R.$sno2, IoAct_Upd01_DtlR.$sno2);
				addColumnPathMap(MST_MLY_STK_DTL_R.$sno3, IoAct_Upd01_DtlR.$sno3);
				addColumnPathMap(MST_MLY_STK_DTL_R.$sno4, IoAct_Upd01_DtlR.$sno4);
				addColumnPathMap(MST_MLY_STK_DTL_R.$fix_no_typ, IoAct_Upd01_DtlR.$fix_no_typ);
				addColumnPathMap(MST_MLY_STK_DTL_R.$fix_no, IoAct_Upd01_DtlR.$fix_no);
				addColumnPathMap(MST_MLY_STK_DTL_R.$pack_unit_cd, IoAct_Upd01_DtlR.$pack_unit_cd);
				addColumnPathMap(MST_MLY_STK_DTL_R.$gd_cd, IoAct_Upd01_DtlR.$gd_cd);
				addColumnPathMap(MST_MLY_STK_DTL_R.$in_xfr_typ, IoAct_Upd01_DtlR.$in_xfr_typ);
				addColumnPathMap(MST_MLY_STK_DTL_R.$quality_typ, IoAct_Upd01_DtlR.$quality_typ);
				addColumnPathMap(MST_MLY_STK_DTL_R.$asst_typ, IoAct_Upd01_DtlR.$asst_typ);
				addColumnPathMap(MST_MLY_STK_DTL_R.$stk_insp_typ, IoAct_Upd01_DtlR.$stk_insp_typ);
				addColumnPathMap(MST_MLY_STK_DTL_R.$stk_id_typ, IoAct_Upd01_DtlR.$stk_id_typ);
				addColumnPathMap(MST_MLY_STK_DTL_R.$stk_bp_cd, IoAct_Upd01_DtlR.$stk_bp_cd);
				addColumnPathMap(MST_MLY_STK_DTL_R.$pack_unit_qty, IoAct_Upd01_DtlR.$pack_unit_qty);
				addColumnPathMap(MST_MLY_STK_DTL_R.$base_unit_qty, IoAct_Upd01_DtlR.$base_unit_qty);
			}
		}

		protected void selectCclIoActL(MCList<IoAct_Upd01_DtlR> wkL) {

			MCList<MST_IO_ACT_R> bindL = MCList.create(MST_IO_ACT_R.class);
			for (IoAct_Upd01_DtlR r: wkL) {
				if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					MST_IO_ACT_R bindR = MST_IO_ACT_R.create();
					bindR.act_no(r.act_no());
					bindR.act_d_no(r.act_d_no());
					bindR.act_io_no(r.act_io_no());
					bindR.trn_typ(r.trn_typ());
					bindL.add(bindR);
				}
			}

			if (isSame(bindL.size(), 0)) {
				return;
			}

			MCList<MST_IO_ACT_R> bL = bindL.groupBy(MST_IO_ACT_R.$act_no, MST_IO_ACT_R.$act_d_no, MST_IO_ACT_R.$act_io_no, MST_IO_ACT_R.$trn_typ);

			_cclIoActCacheL = MCList.create(MST_IO_ACT_R.class);
			_cclIoActCacheL_t = MST_IO_ACT_R.create("T");
			_cclIoActCacheL_bldr = MCQueryApiBuilder.create(_cclIoActCacheL_t);
			_cclIoActCacheL_bldr.setSelectAll();
			_cclIoActCacheL_bldr.setWhere(_cclIoActCacheL_t.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			_cclIoActCacheL_bldr.addWhereWithCutOffAnd(_cclIoActCacheL_t.act_no.eq(bind("act_no")));
			_cclIoActCacheL_bldr.addWhereWithCutOffAnd(_cclIoActCacheL_t.act_d_no.eq(bind("act_d_no")));
			_cclIoActCacheL_bldr.addWhereWithCutOffAnd(_cclIoActCacheL_t.act_io_no.eq(bind("act_io_no")));
			_cclIoActCacheL_bldr.addWhereWithAnd(_cclIoActCacheL_t.trn_typ.eq(bind("trn_typ")));
			
			_cclIoActCacheL_bldr.addConstWhereWithAnd(
					not(_cclIoActCacheL_t.slip_cmpl_flg.eq(value(true))
							.and(_cclIoActCacheL_t.io_act_typ.in(
									value(MSC_IO_ACT_TYP.XFR_PACK_GI.value()),
									value(MSC_IO_ACT_TYP.XFR_PACK_GR.value())))
							.and(_cclIoActCacheL_t.trd_ptn_typ.notIn(value(MAC_TRD_PTN_TYP.INSP.value()),
									value(MAC_TRD_PTN_TYP.REINSP.value()),
									value(MAC_TRD_PTN_TYP.INSP_SMPL.value()),
									value(MAC_TRD_PTN_TYP.PURC.value())))));
			dbSelect("MSBEL5010_MST_IO_ACT_S01", _cclIoActCacheL, _cclIoActCacheL_bldr, bL, null);

			_cclIoActNoIoTypIdx = _cclIoActCacheL.createIndex(
					MST_IO_ACT_R.$trn_typ, MST_IO_ACT_R.$act_no, MST_IO_ACT_R.$act_d_no, MST_IO_ACT_R.$act_io_no);
			_cclIoActWithIoTypIdx = _cclIoActCacheL.createIndex(
					MST_IO_ACT_R.$trn_typ, MST_IO_ACT_R.$act_no, MST_IO_ACT_R.$act_d_no, MST_IO_ACT_R.$act_io_no, MST_IO_ACT_R.$io_typ);
		}

		protected MCList<MST_IO_ACT_R> getOrgIoActL(IoAct_Upd01_DtlR r) {
			if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
				//移送に対して入荷するときに場所を変更すると、転出、移動・移送入庫、移動・移送出庫、移動・移送入庫の受払実績を作る。
				//移動・移送入庫が2つ作成され見分けがつかなくなるので、補完ＦＬＧで見分けることにする。
				if (MSC_IO_ACT_TYP.isXFR_GR(r.io_act_typ())) {
					return _cclIoActCacheL.subList(_cclIoActNoIoTypIdx, r.toArray(IoAct_Upd01_DtlR.$trn_typ,
								IoAct_Upd01_DtlR.$act_no, IoAct_Upd01_DtlR.$act_d_no, IoAct_Upd01_DtlR.$act_io_no))
							.subList(MST_IO_ACT_R.$slip_cmpl_flg, r.slip_cmpl_flg());
				}
				if (isNull(r.wia_io_typ())) {
					return _cclIoActCacheL.subList(_cclIoActNoIoTypIdx, r.toArray(IoAct_Upd01_DtlR.$trn_typ,
							IoAct_Upd01_DtlR.$act_no, IoAct_Upd01_DtlR.$act_d_no, IoAct_Upd01_DtlR.$act_io_no));
				}
				else {
					return _cclIoActCacheL.subList(_cclIoActWithIoTypIdx, r.toArray(IoAct_Upd01_DtlR.$trn_typ,
							IoAct_Upd01_DtlR.$act_no, IoAct_Upd01_DtlR.$act_d_no, IoAct_Upd01_DtlR.$act_io_no, IoAct_Upd01_DtlR.$wia_io_typ));
				}
			}
			else {
				return _cclIoActCacheL.subList(new cclIoActMatcher(r));
			}
		}

		/**
		 * 元伝取得ロウマッチャー
		 */
		public class cclIoActMatcher implements MCRowMatcher<MST_IO_ACT_R> {

			IoAct_Upd01_DtlR _updR;

			public cclIoActMatcher(IoAct_Upd01_DtlR updR) {
				_updR = updR;
			}

			@Override
			public boolean match(MST_IO_ACT_R r) {

				if (isNull(_updR.wia_io_typ())) {
					if (isNull(_updR.act_io_no())) {
						if (isNull(_updR.act_d_no())) {
							return isSame(r.act_no(), _updR.act_no())
									&& isSame(r.trn_typ(), _updR.trn_typ());
						}
						else if (isNull(_updR.act_no())) {
							return isSame(r.act_d_no(), _updR.act_d_no())
									&& isSame(r.trn_typ(), _updR.trn_typ());
						}
						else {
							return isSame(r.act_no(), _updR.act_no())
									&& isSame(r.act_d_no(), _updR.act_d_no())
										&& isSame(r.trn_typ(), _updR.trn_typ());
						}
					}
					else {
						//実績受払ＮＯは仕入、売上の実績受払ＮＯが連携されてくる想定
						if (isNull(_updR.act_d_no())) {
							return isSame(r.act_no(), _updR.act_no())
									&& isSame(r.act_io_no(), _updR.act_io_no())
										&& isSame(r.trn_typ(), _updR.trn_typ());
						}
						else if(isNull(_updR.act_no())) {
							return isSame(r.act_d_no(), _updR.act_d_no())
									&& isSame(r.act_io_no(), _updR.act_io_no())
										&& isSame(r.trn_typ(), _updR.trn_typ());
						}
						else {
							return isSame(r.act_no(), _updR.act_no())
									&& isSame(r.act_d_no(), _updR.act_d_no())
										&& isSame(r.act_io_no(), _updR.act_io_no())
											&& isSame(r.trn_typ(), _updR.trn_typ());
						}
					}
				}
				else {
					if (isNull(_updR.act_io_no())) {
						if (isNull(_updR.act_d_no())) {
							return isSame(r.act_no(), _updR.act_no())
									&& isSame(r.trn_typ(), _updR.trn_typ())
										&& isSame(r.io_typ(), _updR.wia_io_typ());
						}
						else if (isNull(_updR.act_no())) {
							return isSame(r.act_d_no(), _updR.act_d_no())
									&& isSame(r.trn_typ(), _updR.trn_typ())
										&& isSame(r.io_typ(), _updR.wia_io_typ());
						}
						else {
							return isSame(r.act_no(), _updR.act_no())
									&& isSame(r.act_d_no(), _updR.act_d_no())
										&& isSame(r.trn_typ(), _updR.trn_typ())
											&& isSame(r.io_typ(), _updR.wia_io_typ());
						}
					}
					else {
						//実績受払ＮＯが指定されるのは仕入、売上の場合を想定しており、
						//その場合は、入出庫区分は設定されないため、この分岐に来るパターンはない。
						if (isNull(_updR.act_d_no())) {
							return isSame(r.act_no(), _updR.act_no())
									&& isSame(r.act_io_no(), _updR.act_io_no())
										&& isSame(r.trn_typ(), _updR.trn_typ())
											&& isSame(r.io_typ(), _updR.wia_io_typ());
						}
						else if (isNull(_updR.act_no())) {
							return isSame(r.act_d_no(), _updR.act_d_no())
									&& isSame(r.act_io_no(), _updR.act_io_no())
										&& isSame(r.trn_typ(), _updR.trn_typ())
											&& isSame(r.io_typ(), _updR.wia_io_typ());
						}
						else {
							return isSame(r.act_no(), _updR.act_no())
									&& isSame(r.act_d_no(), _updR.act_d_no())
										&& isSame(r.act_io_no(), _updR.act_io_no())
											&& isSame(r.trn_typ(), _updR.trn_typ())
												&& isSame(r.io_typ(), _updR.wia_io_typ());
						}
					}
				}
			}
		}

		protected void selectSundryItmCache(MCList<IoAct_Upd01_DtlR> wkL) {
			//親品目
			MCList<IoAct_Upd01_DtlR> lst = wkL.groupBy(IoAct_Upd01_DtlR.$par_itm_cd,
					IoAct_Upd01_DtlR.$par_itm_sub1,IoAct_Upd01_DtlR.$par_itm_sub2,IoAct_Upd01_DtlR.$par_itm_sub3,
					IoAct_Upd01_DtlR.$par_sno1, IoAct_Upd01_DtlR.$par_sno2, 
					IoAct_Upd01_DtlR.$par_sno3, IoAct_Upd01_DtlR.$par_sno4);
			for (IoAct_Upd01_DtlR r : lst) {
				r.itm_cd(r.par_itm_cd());
				r.itm_sub1(r.par_itm_sub1());
				r.itm_sub2(r.par_itm_sub2());
				r.itm_sub3(r.par_itm_sub3());
				r.sno1(r.par_sno1());
				r.sno2(r.par_sno2());
				r.sno3(r.par_sno3());
				r.sno4(r.par_sno4());
			}
			//子品目
			lst.addAll(wkL.subList(r -> r.sundry_itm_flg()).groupBy(IoAct_Upd01_DtlR.$itm_cd,
					IoAct_Upd01_DtlR.$itm_sub1,IoAct_Upd01_DtlR.$itm_sub2,IoAct_Upd01_DtlR.$itm_sub3,
					IoAct_Upd01_DtlR.$sno1, IoAct_Upd01_DtlR.$sno2, 
					IoAct_Upd01_DtlR.$sno3, IoAct_Upd01_DtlR.$sno4));

			MAM_SUNDRY_ITM_R t = MAM_SUNDRY_ITM_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.itm_nm);
			_sundryItmCache = new FXUCL_MCDbcCache<MAM_SUNDRY_ITM_R>(dbc_bldr, lst
					, IoAct_Upd01_DtlR.$itm_cd
					, IoAct_Upd01_DtlR.$itm_sub1
					, IoAct_Upd01_DtlR.$itm_sub2
					, IoAct_Upd01_DtlR.$itm_sub3
					, IoAct_Upd01_DtlR.$sno1
					, IoAct_Upd01_DtlR.$sno2
					, IoAct_Upd01_DtlR.$sno3
					, IoAct_Upd01_DtlR.$sno4
					);
		}
		protected MAM_SUNDRY_ITM_R getSundryItm(String itmCd, String itmSub1, String itmSub2, String itmSub3
													, String sno1, String sno2, String sno3, String sno4) {
			return _sundryItmCache.get(itmCd, itmSub1, itmSub2, itmSub3
										, sno1, sno2, sno3, sno4);
		}

		protected void selectItmUnitCache(MCList<IoAct_Upd01_DtlR> wkL) {
			//荷姿振替単位ＣＤ
			MCList<IoAct_Upd01_DtlR> lst = wkL.groupBy(IoAct_Upd01_DtlR.$itm_cd,
					IoAct_Upd01_DtlR.$itm_sub1,IoAct_Upd01_DtlR.$itm_sub2,IoAct_Upd01_DtlR.$itm_sub3,
					IoAct_Upd01_DtlR.$pack_xfr_unit_cd);
			for (IoAct_Upd01_DtlR r : lst) {
				r.pack_unit_cd(r.pack_xfr_unit_cd());
			}
			//荷姿単位ＣＤ
			lst.addAll(wkL.groupBy(IoAct_Upd01_DtlR.$itm_cd,
					IoAct_Upd01_DtlR.$itm_sub1,IoAct_Upd01_DtlR.$itm_sub2,IoAct_Upd01_DtlR.$itm_sub3,
					IoAct_Upd01_DtlR.$pack_unit_cd));

			MAVM_ITM_UNIT_R t = MAVM_ITM_UNIT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.conv_base_qty, t.conv_qty, t.dec_place);
			_itmUnitCache = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(dbc_bldr, lst
					, IoAct_Upd01_DtlR.$itm_cd
					, IoAct_Upd01_DtlR.$itm_sub1
					, IoAct_Upd01_DtlR.$itm_sub2
					, IoAct_Upd01_DtlR.$itm_sub3
					, IoAct_Upd01_DtlR.$pack_unit_cd
					);
		}
		protected MAVM_ITM_UNIT_R getItmUnit(String itmCd, String itmSub1, String itmSub2, String itmSub3, String unit_cd) {
			return _itmUnitCache.get(itmCd, itmSub1, itmSub2, itmSub3, unit_cd);
		}

		protected void selectItmUnitStkCache(MCList<MST_STK_R> stkL) {
			MAVM_ITM_UNIT_R t = MAVM_ITM_UNIT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.conv_base_qty, t.conv_qty, t.rnd_typ, t.dec_place);
			_itmUnitStkCache = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(dbc_bldr, stkL
					, MST_STK_R.$itm_cd
					, MST_STK_R.$itm_sub1
					, MST_STK_R.$itm_sub2
					, MST_STK_R.$itm_sub3
					, MST_STK_R.$pack_unit_cd
					);
		}
		protected MAVM_ITM_UNIT_R getItmUnitStk(MST_STK_R stkR) {
			return _itmUnitStkCache.get(stkR.itm_cd(), stkR.itm_sub1(), stkR.itm_sub2(), stkR.itm_sub3(), stkR.pack_unit_cd());
		}

		protected void selectLocCache(MCList<IoAct_Upd01_DtlR> wkL) {
			//投入場所
			MCList<IoAct_Upd01_DtlR> lst = wkL.groupBy(IoAct_Upd01_DtlR.$inpt_loc_cd, IoAct_Upd01_DtlR.$ac_dt);
			lst.forEach(r -> r.gi_loc_cd(r.inpt_loc_cd()));
			//格納場所
			MCList<IoAct_Upd01_DtlR> lst2 = wkL.groupBy(IoAct_Upd01_DtlR.$strg_loc_cd, IoAct_Upd01_DtlR.$ac_dt);
			lst2.forEach(r -> r.gi_loc_cd(r.strg_loc_cd()));
			lst.addAll(lst2);
			//入庫場所
			MCList<IoAct_Upd01_DtlR> lst3 = wkL.groupBy(IoAct_Upd01_DtlR.$gr_loc_cd, IoAct_Upd01_DtlR.$ac_dt);
			lst3.forEach(r -> r.gi_loc_cd(r.gr_loc_cd()));
			lst.addAll(lst3);
			//出庫場所
			lst.addAll(wkL.groupBy(IoAct_Upd01_DtlR.$gi_loc_cd, IoAct_Upd01_DtlR.$ac_dt));

			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			MAM_BP_R m = MAM_BP_R.create("M");
			dbc_bldr.setSelect(t.wg_cd, t.loc_mng_typ, t.gi_pack_xfer_flg, t.sppl_cd);
			dbc_bldr.addSelect(m.prov_rcv_typ, m.repurc_obli_flg);
			dbc_bldr.addLeftOuterJoin(m, bracket( t.sppl_cd.eq(m.bp_cd)));

			_locCache = new FXUCL_MCDbcCache<MAM_LOC_R>(dbc_bldr, lst, IoAct_Upd01_DtlR.$gi_loc_cd);

			//場所の資産管理部門
			_locDptCache = lst.groupBy(IoAct_Upd01_DtlR.$gi_loc_cd, IoAct_Upd01_DtlR.$ac_dt);

			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_LOC$F_GET_ASST_DPT_CD", "01"),
					MABSFunction.getFunctionExecuter("MAPA_LOC$F_GET_ASST_DPT_CD"),
					IoAct_Upd01_DtlR.$gi_dpt_cd, _locDptCache,
					IoAct_Upd01_DtlR.$gi_loc_cd, IoAct_Upd01_DtlR.$ac_dt);

			_locDptIdx = _locDptCache.createIndex(IoAct_Upd01_DtlR.$gi_loc_cd, IoAct_Upd01_DtlR.$ac_dt);
		}
		protected MAM_LOC_R getLoc(String locCd) {
			return _locCache.get(locCd);
		}
		protected String getLocDpt(String locCd, MCDate acDt) {
			IoAct_Upd01_DtlR _tmplocDptRow = _locDptCache.getFirst(_locDptIdx, locCd, acDt);
			if(_tmplocDptRow == null) {
				return null;
			}
			return _tmplocDptRow.getString(IoAct_Upd01_DtlR.$gi_dpt_cd);
		}

		protected void selectBpCache(MCList<IoAct_Upd01_DtlR> wkL) {
			//得意先
			MCList<IoAct_Upd01_DtlR> lst = wkL.groupBy(IoAct_Upd01_DtlR.$cst_cd);
			lst.forEach(r -> r.sppl_cd(r.cst_cd()));
			//売掛先
			MCList<IoAct_Upd01_DtlR> lst2 = wkL.groupBy(IoAct_Upd01_DtlR.$acst_cd);
			lst2.forEach(r -> r.sppl_cd(r.acst_cd()));
			lst.addAll(lst2);
			//買掛先
			MCList<IoAct_Upd01_DtlR> lst3 = wkL.groupBy(IoAct_Upd01_DtlR.$asppl_cd);
			lst3.forEach(r -> r.sppl_cd(r.asppl_cd()));
			lst.addAll(lst3);
			//発注先
			lst.addAll(wkL.groupBy(IoAct_Upd01_DtlR.$sppl_cd));

			MAM_BP_R t = MAM_BP_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			MAM_BP_R bcst = MAM_BP_R.create("BCST");
			MAM_BP_R bsppl = MAM_BP_R.create("BSPPL");
			dbc_bldr.setSelect(t.area_cd, t.cntry_cd, t.bcst_cd, t.bsppl_cd, t.repurc_obli_flg);
			dbc_bldr.addSelect(bcst.rcst_cd); //請求先に対する入金先
			dbc_bldr.addSelect(bcst.ar_cred_cd); //請求先に対する債権与信管理先
			dbc_bldr.addSelect(bsppl.psppl_cd); //支払予定管理先に対する支払先
			dbc_bldr.addSelect(bsppl.ap_cred_cd); //支払予定管理先に対する債務与信管理先
			dbc_bldr.addLeftOuterJoin(bcst, bracket(bcst.bp_cd.eq(t.bcst_cd)
										.and(bcst.bcst_flg.eq(value(true))))); //売掛先に対する請求先
			dbc_bldr.addLeftOuterJoin(bsppl, bracket(bsppl.bp_cd.eq(t.bsppl_cd)
										.and(bsppl.bsppl_flg.eq(value(true))))); //買掛先に対する支払予定管理先

			_bpCache = new FXUCL_MCDbcCache<MAM_BP_R>(dbc_bldr, lst, IoAct_Upd01_DtlR.$sppl_cd);
		}
		protected MAM_BP_R getBp(String bpCd) {
			return _bpCache.get(bpCd);
		}

		protected void selectBdDptCache(MCList<IoAct_Upd01_DtlR> wkL) {
			MAM_DPT_R t = MAM_DPT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.wg_cd);
			_bdDptCache = new FXUCL_MCDbcCacheStEnd<MAM_DPT_R>(dbc_bldr, wkL,
					IoAct_Upd01_DtlR.$bd_dpt_cd);
		}
		protected MAM_DPT_R getDpt(MCDate dt, String dpt_cd) {
			return _bdDptCache.get(dt, dpt_cd);
		}

		protected void selectOutsrcInfoCache(MCList<IoAct_Upd01_DtlR> purcL) {
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MSVT_OUTSRC_INFO_R.create("T"));
			dbc_bldr.setSelectAll();
			_outsrcInfoCache = new FXUCL_MCDbcCache<MSVT_OUTSRC_INFO_R>(dbc_bldr, purcL,
					IoAct_Upd01_DtlR.$act_d_no, IoAct_Upd01_DtlR.$act_d_seq);
		}
		protected MSVT_OUTSRC_INFO_R getOutsrcInfo(String purcActDNo, MCNumber purcActDSeq) {
 			return _outsrcInfoCache.get(purcActDNo, purcActDSeq);
		}

		protected void selectLocDptOutsrcCache(MCList<IoAct_Upd01_DtlR> purcL) {

			MCList<IoAct_Upd01_DtlR> lst = MCList.create(IoAct_Upd01_DtlR.class);
			for (IoAct_Upd01_DtlR r: purcL) {
				String loc = getOutsrcInfo(r.act_d_no(), r.act_d_seq()).outsrc_mfg_loc_cd();
				if (!isNull(loc)) {
					IoAct_Upd01_DtlR bindR = IoAct_Upd01_DtlR.create();
					bindR.outsrc_mfg_loc_cd(loc);
					bindR.ac_dt(r.ac_dt());
					lst.add(bindR);
					if(!isSame(r.ac_dt(), r.can_ac_dt())) {
						IoAct_Upd01_DtlR canBindR = IoAct_Upd01_DtlR.create();
						canBindR.outsrc_mfg_loc_cd(loc);
						canBindR.ac_dt(r.can_ac_dt());
						lst.add(canBindR);
					}
				}
			}

			if (isSame(lst.size(), 0)) {
				return;
			}

			//外注製造場所の資産管理部門
			_locDptOutsrcCache = lst.groupBy(IoAct_Upd01_DtlR.$outsrc_mfg_loc_cd, IoAct_Upd01_DtlR.$ac_dt);

			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_LOC$F_GET_ASST_DPT_CD", "02"),
					MABSFunction.getFunctionExecuter("MAPA_LOC$F_GET_ASST_DPT_CD"),
					IoAct_Upd01_DtlR.$outsrc_mfg_loc_dpt_cd, _locDptOutsrcCache,
					IoAct_Upd01_DtlR.$outsrc_mfg_loc_cd, IoAct_Upd01_DtlR.$ac_dt);
			_locDptOutsrcIdx = _locDptOutsrcCache.createIndex(
										IoAct_Upd01_DtlR.$outsrc_mfg_loc_cd, IoAct_Upd01_DtlR.$ac_dt);
		}

		protected void addSelectLocDptOutsrcCache(IoAct_Upd01_DtlR bindR) {
			MCList<IoAct_Upd01_DtlR> locDptOutsrcCache = MCList.create(IoAct_Upd01_DtlR.class);
			locDptOutsrcCache.add(bindR);
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_LOC$F_GET_ASST_DPT_CD", "02"),
					MABSFunction.getFunctionExecuter("MAPA_LOC$F_GET_ASST_DPT_CD"),
					IoAct_Upd01_DtlR.$outsrc_mfg_loc_dpt_cd, locDptOutsrcCache,
					IoAct_Upd01_DtlR.$outsrc_mfg_loc_cd, IoAct_Upd01_DtlR.$ac_dt);
			if (isNull(_locDptOutsrcCache)) {
				_locDptOutsrcCache = MCList.create(IoAct_Upd01_DtlR.class);
			}
			_locDptOutsrcCache.addAll(locDptOutsrcCache);
			_locDptOutsrcIdx = _locDptOutsrcCache.createIndex(
					IoAct_Upd01_DtlR.$outsrc_mfg_loc_cd, IoAct_Upd01_DtlR.$ac_dt);
		}
		protected String getLocDptOutsrc(String locCd, MCDate acDt) {
			
			if (isNull(_locDptOutsrcCache) || isNull(_locDptOutsrcCache.getFirst(_locDptOutsrcIdx, locCd, acDt))) {
				IoAct_Upd01_DtlR bindR = IoAct_Upd01_DtlR.create();
				bindR.outsrc_mfg_loc_cd(locCd);
				bindR.ac_dt(acDt);
				addSelectLocDptOutsrcCache(bindR);
			}
			return _locDptOutsrcCache.getFirst(_locDptOutsrcIdx, locCd, acDt).getString(IoAct_Upd01_DtlR.$outsrc_mfg_loc_dpt_cd);
		}

		protected void selectOutsrcInfoMfgInstNoCache(MCList<IoAct_Upd01_DtlR> mfgInstNoL) {
			MST_MFG_INST_R t = MST_MFG_INST_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			MST_ITM_MFG_INST_R t2 = MST_ITM_MFG_INST_R.create("T2");
			MST_MFG_ACT_R t3 = MST_MFG_ACT_R.create("T3");
			MST_MFG_ACT_REM_R t4 = MST_MFG_ACT_REM_R.create("T4");
			dbc_bldr.setSelect(t.mfg_inst_no);
			dbc_bldr.addSelect(t2.itm_mfg_inst_no, t2.base_unit_inst_qty, t2.mfg_loc_cd,
					t2.wg_cd, t2.lot_no, t2.sublot_no);
			dbc_bldr.addSelect(t3.mfg_act_no);
			dbc_bldr.addSelect(t4.base_unit_mfg_qty);
			dbc_bldr.addInnerJoin(t2, bracket( t.itm_mfg_inst_no.eq(t2.itm_mfg_inst_no)));
			dbc_bldr.addLeftOuterJoin(t3, bracket( t.mfg_inst_no.eq(t3.mfg_inst_no)));
			dbc_bldr.addLeftOuterJoin(t4, bracket(t3.mfg_inst_no.eq(t4.mfg_inst_no)
										.and(t3.div_seq.eq(t4.div_seq))));
			_outsrcInfoMfgInstNoCacheL = new FXUCL_MCDbcCache<MST_MFG_INST_R>(dbc_bldr,
					mfgInstNoL, IoAct_Upd01_DtlR.$mfg_inst_no);
		}
		protected MST_MFG_INST_R getOutsrcInfoMfgInstNo(String mfgInstNo) {
			return _outsrcInfoMfgInstNoCacheL.get(mfgInstNo);
		}

		protected void selectLocDptOutsrcMfgInstNoCache(MCList<IoAct_Upd01_DtlR> mfgInstNoL) {

			MCList<IoAct_Upd01_DtlR> lst = MCList.create(IoAct_Upd01_DtlR.class);
			for (IoAct_Upd01_DtlR r: mfgInstNoL) {
				String loc = getOutsrcInfoMfgInstNo(r.mfg_inst_no()).getStringNE(MST_ITM_MFG_INST_R.$mfg_loc_cd);
				if (!isNull(loc)) {
					IoAct_Upd01_DtlR bindR = IoAct_Upd01_DtlR.create();
					bindR.outsrc_mfg_loc_cd(loc);
					bindR.ac_dt(r.ac_dt());
					lst.add(bindR);
				}
			}

			if (isSame(lst.size(), 0)) {
				return;
			}

			//外注製造場所の資産管理部門
			_locDptOutsrcMfgInstNoCache = lst.groupBy(IoAct_Upd01_DtlR.$outsrc_mfg_loc_cd, IoAct_Upd01_DtlR.$ac_dt);

			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_LOC$F_GET_ASST_DPT_CD", "03"),
					MABSFunction.getFunctionExecuter("MAPA_LOC$F_GET_ASST_DPT_CD"),
					IoAct_Upd01_DtlR.$outsrc_mfg_loc_dpt_cd, _locDptOutsrcMfgInstNoCache,
					IoAct_Upd01_DtlR.$outsrc_mfg_loc_cd, IoAct_Upd01_DtlR.$ac_dt);
			_locDptOutsrcMfgInstNoIdx = _locDptOutsrcMfgInstNoCache.createIndex(
										IoAct_Upd01_DtlR.$outsrc_mfg_loc_cd, IoAct_Upd01_DtlR.$ac_dt);
		}
		protected String getLocDptOutsrcMfgInstNo(String locCd, MCDate acDt) {
			return _locDptOutsrcMfgInstNoCache.getFirst(_locDptOutsrcMfgInstNoIdx, locCd, acDt).getString(IoAct_Upd01_DtlR.$outsrc_mfg_loc_dpt_cd);
		}

		protected MST_MFG_INST_R getOutsrcInfoMfgInstNoDel (String mfgInstNo) {
			// 削除時はキャッシュからデータ取得できないので、元電の製造指図NOから品目製造指図NOを取得する
			MST_MFG_INST_R mfgInstR = MST_MFG_INST_R.create();
			if(_outsrcInfoMfgInstNoCacheL == null) {
				_outsrcInfoMfgInstNoCacheL = new FXUCL_MCDbcCache<MST_MFG_INST_R>(MCQueryApiBuilder.create(MST_MFG_INST_R.create("T")));
			}
			else {
				mfgInstR = _outsrcInfoMfgInstNoCacheL.get(mfgInstNo);
			}
			if(isNull(mfgInstR.itm_mfg_inst_no())) {
				MST_MFG_INST_R t = MST_MFG_INST_R.create("T");
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
				MST_ITM_MFG_INST_R t2 = MST_ITM_MFG_INST_R.create("T2");
				MST_MFG_ACT_R t3 = MST_MFG_ACT_R.create("T3");
				MST_MFG_ACT_REM_R t4 = MST_MFG_ACT_REM_R.create("T4");
				dbc_bldr.setSelect(t.mfg_inst_no);
				dbc_bldr.addSelect(t2.itm_mfg_inst_no, t2.base_unit_inst_qty, t2.mfg_loc_cd,
						t2.wg_cd, t2.lot_no, t2.sublot_no);
				dbc_bldr.addSelect(t3.mfg_act_no);
				dbc_bldr.addSelect(t4.base_unit_mfg_qty);
				dbc_bldr.addInnerJoin(t2, bracket( t.itm_mfg_inst_no.eq(t2.itm_mfg_inst_no)));
				dbc_bldr.addLeftOuterJoin(t3, bracket( t.mfg_inst_no.eq(t3.mfg_inst_no)));
				dbc_bldr.addLeftOuterJoin(t4, bracket(t3.mfg_inst_no.eq(t4.mfg_inst_no)
											.and(t3.div_seq.eq(t4.div_seq))));
				dbc_bldr.addWhereWithAnd(t.mfg_inst_no.eq(value(mfgInstNo)));
				
				dbSelect("MSBEL5010_MST_MFG_INST_S01", mfgInstR, dbc_bldr);
				_outsrcInfoMfgInstNoCacheL.putCache(new String[] {mfgInstR.mfg_inst_no()}, mfgInstR);
			}

			return mfgInstR;
		}

		protected String getLocDptOutsrcMfgInstNoDel(String loc_cd, MCDate can_ac_dt) {
			IoAct_Upd01_DtlR locDptOutsrc = IoAct_Upd01_DtlR.create();
			if(_locDptOutsrcCache == null) {
				_locDptOutsrcCache = MCList.create(IoAct_Upd01_DtlR.class);
			}
			else {
				locDptOutsrc = _locDptOutsrcCache.getFirst(_locDptOutsrcIdx, loc_cd, can_ac_dt);
			}
			if(isNull(locDptOutsrc.outsrc_mfg_loc_dpt_cd())) {
				MCList<IoAct_Upd01_DtlR> resultL = MCList.create(IoAct_Upd01_DtlR.class);
				locDptOutsrc.outsrc_mfg_loc_cd(loc_cd);
				locDptOutsrc.ac_dt(can_ac_dt);
				resultL.add(locDptOutsrc);
				
				execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_LOC$F_GET_ASST_DPT_CD", "04"),
						MABSFunction.getFunctionExecuter("MAPA_LOC$F_GET_ASST_DPT_CD"),
						IoAct_Upd01_DtlR.$outsrc_mfg_loc_dpt_cd, resultL,
						IoAct_Upd01_DtlR.$outsrc_mfg_loc_cd, IoAct_Upd01_DtlR.$ac_dt);
				
				_locDptOutsrcCache.addAll(resultL);
				_locDptOutsrcIdx = _locDptOutsrcCache.createIndex(
						IoAct_Upd01_DtlR.$outsrc_mfg_loc_cd, IoAct_Upd01_DtlR.$ac_dt);
			}
			return locDptOutsrc.outsrc_mfg_loc_dpt_cd();
		}

		protected FXUCL_MCDbcCache<MSVT_LOT_LIST_R> _lotListCache = null;
		protected void selectLotL(MCList<IoAct_Upd01_DtlR> dtlL) {
			MSVT_LOT_LIST_R t = MSVT_LOT_LIST_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSelect(t.ver_no);
			_lotListCache = new FXUCL_MCDbcCache<MSVT_LOT_LIST_R>(dbcL_bldr, dtlL,
					IoAct_Upd01_DtlR.$itm_cd, IoAct_Upd01_DtlR.$itm_sub1, IoAct_Upd01_DtlR.$itm_sub2, IoAct_Upd01_DtlR.$itm_sub3,
					IoAct_Upd01_DtlR.$lot_no, IoAct_Upd01_DtlR.$sublot_no);
		}

		protected void createDataCache(MCList<IoAct_Upd01_DtlR> wkL) {
			selectItmUnitCache(wkL);
			selectSundryItmCache(wkL);
			selectLocCache(wkL);
			selectBpCache(wkL);
			selectBdDptCache(wkL);

			//外注仕入の製造情報を取得
			MCList<IoAct_Upd01_DtlR> purcL = MCList.create(IoAct_Upd01_DtlR.class);
			MCList<IoAct_Upd01_DtlR> mfgInstNoL = MCList.create(IoAct_Upd01_DtlR.class);
			for (IoAct_Upd01_DtlR r : wkL) {

				if (isNull(r.mfg_inst_no())) {
					continue;
				}
				
				if (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
						&& (MSC_IO_ACT_TYP.isPURC_GR(r.io_act_typ())
								|| MSC_IO_ACT_TYP.isONR_RCV_GR(r.io_act_typ()))){
					purcL.add(r);
				}
				else if (MSC_IO_ACT_TYP.isPURC_DSCNT(r.io_act_typ())
							|| MSC_IO_ACT_TYP.isPURC_XTRA(r.io_act_typ())
							|| MSC_IO_ACT_TYP.isXPNS_PURC_DSCNT(r.io_act_typ())
							|| MSC_IO_ACT_TYP.isXPNS_PURC_XTRA(r.io_act_typ())
							|| MSC_IO_ACT_TYP.isPURC_RTN_GI(r.io_act_typ())
							|| MSC_IO_ACT_TYP.isONR_RCV_RET_GI(r.io_act_typ())
							|| MSC_IO_ACT_TYP.isXPNS_PURC_RTN_GI(r.io_act_typ())) {
					mfgInstNoL.add(r);
				}
				//未着品入荷
				else if (isArrInTransit(r)) {
					mfgInstNoL.add(r);
				}
			}

			selectOutsrcInfoCache(purcL);
			selectLocDptOutsrcCache(purcL);

			if (mfgInstNoL.size() > 0) {
				selectOutsrcInfoMfgInstNoCache(mfgInstNoL);
				selectLocDptOutsrcMfgInstNoCache(mfgInstNoL);
			}

			//元伝のキャッシュ
			selectCclIoActL(wkL);
		}

		protected boolean isArrInTransit(IoAct_Upd01_DtlR r) {
			//未着の入荷は「未着品入荷」にする
			//ただし、経費理由が指定されている場合は対象としない
			if (MSC_IO_ACT_TYP.isARR(r.io_act_typ())) {
				if (MSC_ARR_PTN_TYP.isN_YET_ARR(r.arr_ptn_typ())) {
					if (!(!isNull(r.rsn_cd()) && getBizRsn(r.rsn_cd()).xpns_purc_flg())) {
						return true;
					}
				}
			}
			return false;
		}

		/**
		 * ロウの値を配列に変換する
		 * <p>
		 */
		@SuppressWarnings("unchecked")
		protected Comparable[] getVals(MCRow row, String[] keys) {
			Comparable[] vals = new Comparable[keys.length];
			int i = 0;
			for (String col : keys) {
				vals[i] = row.getValueNE(col);
				i++;
			}
			return vals;
		}

		protected void setError(MCMessageList msgList){
			int i = 0;
			MCAppException ex = new MCAppException(msgList.get(0));
			for (MCMessage aMsg : msgList) {
				if (i > 0) {
					ex.addCauseMessage(aMsg);
				}
				i++;
			}
			throw ex;
		}

		// デバッグ用ログ出力
		protected void writeWkLog(MCList<IoAct_Upd01_DtlR> wkL) {
			if (!_debug_log) return;
			MCLog.developDebug("============MSBEL5010:IO_ACT wkL START============");
			MCLog.developDebug((String.join("	", wkL.createRow().getColumnPathArray())).replaceAll("tia.", ""));
			MCLog.developDebug(wkL.toString().replaceAll(",", "	"));
			MCLog.developDebug("============MSBEL5010:IO_ACT wkL END============");
		}

		protected void writeUpdLLog(MCList<IoAct_Upd01_DtlR> updL) {
			if (!_debug_log) return;
			MCLog.developDebug("============MSBEL5010:IO_ACT updL START============");
			MCLog.developDebug((String.join("	", updL.createRow().getColumnPathArray())).replaceAll("tia.", ""));
			MCLog.developDebug(updL.toString().replaceAll(",", "	"));
			MCLog.developDebug("============MSBEL5010:IO_ACT updL END============");
		}
	}

	//FMCB CUSTOM END
}