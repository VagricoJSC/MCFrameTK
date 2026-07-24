package mcframe.serverMSBE.MSBEL6410;

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
import mcframe.serverMSBE.MSBEL6410.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBE.MSBEL6400.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.commonMAUA.MAUAC0010.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverFXUC.FXUCL0170.*;
import static mcframe.serverMAUC.MAUCL1110.MAUCL_DptUtil.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_AcXfrActRcptIFService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_AcXfrActRcptIFService_MC extends MSBEL_AcXfrActRcptIFService_MC_A{
	//FMCB CUSTOM START

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 他勘定振替実績オペレーション用のチェック処理です。<br>
	 */
	public class Chk01 extends MSBEL_AcXfrActRcptIFService_MC_A.Chk01 {

		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();

			// 他勘定振替実績SVチェック処理
			callChk01();
			callChk02();
			callChk03();
			
			setErrFlgDtl();

			setDown();	
		}
		
		@Override
		protected void putListLogicCheckBind() {
			// リストロジックが別のブロックの項目を引数にとる場合、ここに実装する
			super.putListLogicCheckBind();


			ListLogicBind bdDptBind = getListLogicBind(up2(), AcXfrAct_Chk01_DtlR.$bd_dpt_cd);
			bdDptBind.putBind(MAUAC_List.DptCols.$i_dt, AcXfrAct_Chk01_HdrR.$ac_dt);
			ListLogicBind grRsnBind = getListLogicBind(up2(), AcXfrActIF_DtlR.$rsn_cd);
			ListLogicBind giRsnBind = getListLogicBind(up2(), AcXfrActIF_DtlR.$rsn_cd);
			ListLogicBind dispRsnBind = getListLogicBind(up2(), AcXfrActIF_DtlR.$rsn_cd);

			grRsnBind.putBind(MAUAC_List.AcxfrGrAcxfrGiDispBizRsnCols.$i_acxfr_gr_flg, AcXfrActIF_DtlR.$acxfr_gr_flg);
			giRsnBind.putBind(MAUAC_List.AcxfrGrAcxfrGiDispBizRsnCols.$i_acxfr_gi_flg, AcXfrActIF_DtlR.$acxfr_gi_flg);
			dispRsnBind.putBind(MAUAC_List.AcxfrGrAcxfrGiDispBizRsnCols.$i_disp_flg, AcXfrActIF_DtlR.$disp_flg);

		}

		@Override
		protected MCMessageList doServerCheckBase() {	
			MCMessageList msgL = super.doServerCheckBase();
			
			// 更新カウンタのチェック
			msgL.addAll(chkUpdCntrAcxfrAct());
			msgL.addAll(chkUpdCntrAcxfrInst());
			msgL.addAll(chkUpdCntrAcxfrSchd());
			
			// データ補完
			msgL.addAll(compBase());
			
			return msgL;
		}

		/**
		 * 他勘定振替実績ヘッダ の更新カウンタチェック
		 */
		protected MCMessageList chkUpdCntrAcxfrAct() {
			MCMessageList msgL = new MCMessageList();
			// 更新データをチェック対象にする
			MCList<AcXfrActIF_HdrR> hdrL = getChkList(up1().subList(MCRow.MODIFY, MCRow.DELETE));
			if (hdrL.isEmpty()) {
				return msgL;
			}
			MST_ACXFR_ACT_R t = MST_ACXFR_ACT_R.create("T");
			MCList<MST_ACXFR_ACT_R> selectL = MCList.create(MST_ACXFR_ACT_R.class);
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setSelect(t.acxfr_act_no, t.upd_cntr);
			selectL_bldr.setOrderByAsc(t.acxfr_act_no);
			
			MCList<AcXfrActIF_HdrR> bindL = hdrL.groupBy(AcXfrActIF_HdrR.$acxfr_act_no);
			bindL.sort(AcXfrActIF_HdrR.$acxfr_act_no);

			if (up0().upd_cntr_chk_flg()) {
				dbSelectKeyForUpdateNoWait("MSBEL6410_MST_ACXFR_ACT_S01", selectL, selectL_bldr, bindL);

				MCIndexKey idxkey = selectL.createIndex(MST_ACXFR_ACT_R.$acxfr_act_no);
				for (AcXfrActIF_HdrR r : hdrL) {
					if (!isNull(r.acxfr_act_no())) {
						MST_ACXFR_ACT_R selectR = selectL.getFirst(idxkey, r.acxfr_act_no());
						msgL.addAll(checkUpdCntrNE(r, AcXfrActIF_HdrR.$acxfr_act_upd_cntr, selectR));
					}
				}
			}
			else {
				dbSelectKeyForUpdate("MSBEL6410_MST_ACXFR_ACT_S02", selectL, selectL_bldr, bindL);
			}
			return msgL;
		}
		
		/**
		 * 他勘定振替指図ヘッダの更新カウンタチェック
		 */ 
		protected MCMessageList chkUpdCntrAcxfrInst() {
			MCMessageList msgL = new MCMessageList();
			// 新規データをチェック対象にする
			MCList<AcXfrActIF_HdrR> hdrL = getChkList(up1().subList(MCRow.CREATE));
			if (hdrL.isEmpty()) {
				return msgL;
			}
			
			MCList<MST_ACXFR_INST_R> selectL = MCList.create(MST_ACXFR_INST_R.class);
			MST_ACXFR_INST_R t = MST_ACXFR_INST_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			
//			MCList<AcXfrActIF_HdrR> bindL = hdrL.groupBy(AcXfrActIF_HdrR.$acxfr_inst_no);
//			bindL.sort(AcXfrActIF_HdrR.$acxfr_inst_no);

			if (up0().upd_cntr_chk_flg()) {
				dbSelectKeyForUpdateNoWait("MSBEL6410_MST_ACXFR_INST_S01", selectL, selectL_bldr, hdrL);

				MCIndexKey idxkey = selectL.createIndex(MST_ACXFR_INST_R.$acxfr_inst_no);
				for (AcXfrActIF_HdrR r : hdrL) {
					if (!isNull(r.acxfr_inst_no())) {
						MST_ACXFR_INST_R selectR = selectL.getFirst(idxkey, r.acxfr_inst_no());
						msgL.addAll(checkUpdCntrNE(r, AcXfrActIF_HdrR.$acxfr_inst_upd_cntr, selectR));
					}
				}
			}
			else {
				dbSelectKeyForUpdate("MSBEL6410_MST_ACXFR_INST_S02", selectL, selectL_bldr, hdrL);
			}
			return msgL;
		}

		/**
		 * 他勘定振替予定の更新カウンタチェック
		 */
		protected MCMessageList chkUpdCntrAcxfrSchd() {
			MCMessageList msgL = new MCMessageList();
			// 新規データをチェック対象にする
			MCList<AcXfrActIF_HdrR> hdrL = getChkList(up1().subList(MCRow.CREATE));
			if (hdrL.isEmpty()) {
				return msgL;
			}
			
			// 新規データの明細を抽出
			MCList<AcXfrActIF_DtlR> dtlL = MCList.create(AcXfrActIF_DtlR.class);
			for (AcXfrActIF_HdrR r : hdrL) {
				MCList<AcXfrActIF_DtlR> tarDtlL = getChkList(up2().subList(AcXfrActIF_DtlR.$hdr_dtl_peg_no, r.hdr_dtl_peg_no()));
				dtlL.addAll(tarDtlL);
			}
			
			MCList<MST_ACXFR_SCHD_R> selectL = MCList.create(MST_ACXFR_SCHD_R.class);
			MCList<AcXfrActIF_DtlR> bindDL = getChkList(dtlL.subList(r -> !isNull(r.acxfr_schd_no())));

			MST_ACXFR_SCHD_R t = MST_ACXFR_SCHD_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setSelect(t.acxfr_schd_no, t.upd_cntr);
			bindDL.sort(MST_ACXFR_SCHD_R.$acxfr_schd_no);
			
			if (up0().upd_cntr_chk_flg()) {
				dbSelectKeyForUpdateNoWait("MSBEL6410_MST_ACXFR_SCHD_S01", selectL, selectL_bldr, bindDL);

				MCIndexKey idxkey = selectL.createIndex(MST_ACXFR_SCHD_R.$acxfr_schd_no);
				for (AcXfrActIF_DtlR r : dtlL) {
					if (!isNull(r.acxfr_schd_no())) {
						MST_ACXFR_SCHD_R selectR = selectL.getFirst(idxkey, r.acxfr_schd_no());
						msgL.addAll(checkUpdCntrNE(r, AcXfrActIF_DtlR.$acxfr_schd_upd_cntr, selectR));
					}
				}
			}
			else {
				dbSelectKeyForUpdate("MSBEL6410_MST_ACXFR_SCHD_S02", selectL, selectL_bldr, bindDL);
			}

			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(checkSub());

			// データ補完
			msgL.addAll(compSub());

			msgL.addAll(checkStkIdTyp());
			
			msgL.addAll(chkSno());
			//ロット発番
			setLotNo();

			return msgL;
		}
		
		protected MCMessageList checkSub() {
			MCMessageList msgL = new MCMessageList();
			MCList<AcXfrActIF_HdrR> notErrHdrL = getChkList(up1().subList(MCRow.CREATE, MCRow.MODIFY, MCRow.DELETE));
			MCList<AcXfrActIF_DtlR> notErrDtlL = getChkList(up2());

			if (!up0().is_src_batch_flg()) {
				// バッチから実行した場合に、ＤＡＣの更新権限チェックを行わない
				msgL.addAll(checkWritableLocCdDac(notErrHdrL, AcXfrActIF_HdrR.$loc_cd));
			}
			
			MCIndexKey index = notErrDtlL.createIndex(AcXfrActIF_DtlR.$hdr_dtl_peg_no);

			for (AcXfrActIF_DtlR dtlR : notErrDtlL) {
				MAVM_ITM_UNIT_R itmUnitR = getItmUnitR(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), dtlR.trd_unit_cd());
				dtlR.addNumberColumn(MAVM_ITM_UNIT_R.$dec_place, itmUnitR.dec_place());
			}
			msgL.addAll(checkDecPlace(notErrDtlL, MAVM_ITM_UNIT_R.$dec_place, AcXfrActIF_DtlR.$trd_unit_qty));
			
			for(AcXfrActIF_HdrR r : notErrHdrL) {
				MCList<AcXfrActIF_DtlR> tarDtlL = notErrDtlL.subList(index, r.hdr_dtl_peg_no());

				msgL.addAll(checkRsn(r, tarDtlL));
				if(!r.isStatusDelete()) {
					msgL.addAll(checkAtLeastOneDtl(r, tarDtlL));
				}
			}
			return msgL;
		}
		
		protected MCMessageList checkStkIdTyp() {
			MCMessageList msgL = new MCMessageList();
			MCList<AcXfrActIF_DtlR> dtlL = getChkList(up2());
			initLocCache(dtlL);

			for (AcXfrActIF_DtlR dtlR : dtlL) {
				if (MAC_TRD_PTN_TYP.isSTK_OTH_GR(dtlR.trd_ptn_typ())) {
					if (!MSC_STK_ID_TYP.is_act_gr(dtlR.stk_id_typ())) {
						msgL.add(new MCMessage(dtlR, AcXfrActIF_DtlR.$stk_id_typ, MSBEL0083, toDispGUIIndex(dtlR)));
					}
					MAM_LOC_R locR = getLocR(dtlR.loc_cd());
					if (MSC_STK_ID_TYP.isRTN_PRE_ACCPT(dtlR.stk_id_typ())
							|| MSC_STK_ID_TYP.isCSTSTK(dtlR.stk_id_typ())
							|| MSC_STK_ID_TYP.isRNT_RCV(dtlR.stk_id_typ())) {
						if (!isNull(locR.sppl_cd())) {
							msgL.add(new MCMessage(dtlR, AcXfrActIF_DtlR.$stk_id_typ, MSBEL1204, dtlR.loc_cd(), toDispGUIIndex(dtlR)));
						}
					}
					if (MSC_STK_ID_TYP.isONR_PROV(dtlR.stk_id_typ())) {
						if (isNull(locR.sppl_cd())) {
							msgL.add(new MCMessage(dtlR, AcXfrActIF_DtlR.$stk_id_typ, MSBEL1205, dtlR.loc_cd(), toDispGUIIndex(dtlR)));
						}
					}
				}

				else if (MAC_TRD_PTN_TYP.isSTK_OTH_GI(dtlR.trd_ptn_typ())) {
					if (!MSC_STK_ID_TYP.is_act_gi(dtlR.stk_id_typ())) {
						msgL.add(new MCMessage(dtlR, AcXfrActIF_DtlR.$stk_id_typ, MSBEL0082, toDispGUIIndex(dtlR)));
					}
				}

				else if (MAC_TRD_PTN_TYP.isSCRP(dtlR.trd_ptn_typ())) {
					if (!MSC_STK_ID_TYP.is_act_scrp(dtlR.stk_id_typ())) {
						msgL.add(new MCMessage(dtlR, AcXfrActIF_DtlR.$stk_id_typ, MSBEL0084, toDispGUIIndex(dtlR)));
					}
				}
			}
			
			return msgL;
		}

		protected MCMessageList checkRsn(AcXfrActIF_HdrR hdrR, MCList<AcXfrActIF_DtlR> dtlL) {
			MCMessageList msgL = new MCMessageList();

			if (MAC_TRD_PTN_TYP.isSTK_OTH_GR(hdrR.trd_ptn_typ())) {
				msgL.addAll(check(dtlL, AcXfrActIF_DtlR.$rsn_cd, new FXUCL_RequiredValidater()));
			}

			if (MAC_TRD_PTN_TYP.isSTK_OTH_GI(hdrR.trd_ptn_typ())) {
				msgL.addAll(check(dtlL, AcXfrActIF_DtlR.$rsn_cd, new FXUCL_RequiredValidater()));
			}

			if (MAC_TRD_PTN_TYP.isSCRP(hdrR.trd_ptn_typ())) {
				msgL.addAll(check(dtlL, AcXfrActIF_DtlR.$rsn_cd, new FXUCL_RequiredValidater()));
			}

			return msgL;
		}

		protected MCMessageList compBase() {
			MCMessageList msgL = new MCMessageList();
			MCList<MST_ACXFR_INST_R> acxfrInstL = MCList.create(MST_ACXFR_INST_R.class);
			MCList<MST_ACXFR_ACT_R> acxfractL = MCList.create(MST_ACXFR_ACT_R.class);

			// 登録、更新、削除データをチェック対象にする
			MCList<AcXfrActIF_HdrR> hdrL = getChkList(up1().subList(MCRow.CREATE, MCRow.MODIFY, MCRow.DELETE));
			if (hdrL.isEmpty()) {
				return msgL;
			}
			MCQueryApiBuilder acxfrInstL_bldr = MCQueryApiBuilder.create(MST_ACXFR_INST_R.create("T"));
			dbSelectKeyForUpdateNoWait("MSBEL6410_MST_ACXFR_INST_S03", acxfrInstL, acxfrInstL_bldr, hdrL);
			MCQueryApiBuilder acxfractL_bldr = MCQueryApiBuilder.create(MST_ACXFR_ACT_R.create("T"));
			dbSelectKeyForUpdateNoWait("MSBEL6410_MST_ACXFR_ACT_S03", acxfractL, acxfractL_bldr, hdrL);

			MCIndexKey
				idx = acxfrInstL.createIndex(MST_ACXFR_INST_R.$acxfr_inst_no),
				adx = acxfractL.createIndex(MST_ACXFR_ACT_R.$acxfr_act_no),
				didx = up2().createIndex(AcXfrActIF_DtlR.$hdr_dtl_peg_no);

			for(AcXfrActIF_HdrR r : hdrL) {
				MCList<AcXfrActIF_DtlR> tarDtlL = getChkList(up2().subList(didx, r.hdr_dtl_peg_no()));
				// ヘッダ情報から明細項目を補完
				tarDtlL.forEach(dtlR -> {
					dtlR.trd_ptn_typ(r.trd_ptn_typ());
					dtlR.loc_cd(r.loc_cd());
					dtlR.ac_dt(r.ac_dt());
					// 負担部門の組織変更対応
					setDpt(dtlR, AcXfrActIF_DtlR.$bd_dpt_cd, AcXfrActIF_DtlR.$ac_dt);
					dtlR.acxfr_act_no(r.acxfr_act_no());
					dtlR.acxfr_act_rev(r.acxfr_act_rev());
					if (MAC_TRD_PTN_TYP.isSTK_OTH_GR(r.trd_ptn_typ())) {
						dtlR.acxfr_gr_flg(true);
					}
					else if (MAC_TRD_PTN_TYP.isSTK_OTH_GI(r.trd_ptn_typ())) {
						dtlR.acxfr_gi_flg(true);
					}
					else if (MAC_TRD_PTN_TYP.isSCRP(r.trd_ptn_typ())) {
						dtlR.disp_flg(true);
					}
				});
				
				// トランザクションデータからの補完
				if (!isNull(r.acxfr_act_no())) {
					// 実績から補完
					MST_ACXFR_ACT_R actR = acxfractL.getFirst(adx, r.acxfr_act_no());
					r.trd_rmrks(compVal(r.trd_rmrks_upd_flg(), r.trd_rmrks(), actR.trd_rmrks(), null));
					r.sub_char1(compVal(r.sub_char1_upd_flg(), r.sub_char1(), actR.sub_char1(), null));
					r.sub_char2(compVal(r.sub_char2_upd_flg(), r.sub_char2(), actR.sub_char2(), null));
					r.sub_char3(compVal(r.sub_char3_upd_flg(), r.sub_char3(), actR.sub_char3(), null));

					
					MCList<MST_ACXFR_ACT_D_R> actDL = MCList.create(MST_ACXFR_ACT_D_R.class);
					MST_ACXFR_ACT_D_R t3 = MST_ACXFR_ACT_D_R.create("T3");
					MCQueryApiBuilder actDL_bldr = MCQueryApiBuilder.create(t3);
					dbSelect("MSBEL6410_MST_ACXFR_ACT_D_S01", actDL, actDL_bldr);
					dbSelectKeyForUpdateNoWait("MSBEL6410_MST_ACXFR_ACT_D_S02", actDL, actDL_bldr, tarDtlL);

					MCIndexKey idxkeyActD = actDL.createIndex(MST_ACXFR_ACT_D_R.$acxfr_act_d_no);
					for (AcXfrActIF_DtlR dtlR : tarDtlL) {
						MST_ACXFR_ACT_D_R actDR = actDL.getFirst(idxkeyActD, dtlR.acxfr_act_d_no());
						if (!isNull(actDR)) {
							// 実績明細から補完
							compFromActD(dtlR, actDR);
						}
					}
				}
				else if (!isNull(r.acxfr_inst_no())) {
					// 指図から補完
					MST_ACXFR_INST_R instR = acxfrInstL.getFirst(idx, r.acxfr_inst_no());
					r.trd_rmrks(compVal(r.trd_rmrks_upd_flg(), r.trd_rmrks(), instR.trd_rmrks(), null));
					r.sub_char1(compVal(r.sub_char1_upd_flg(), r.sub_char1(), instR.sub_char1(), null));
					r.sub_char2(compVal(r.sub_char2_upd_flg(), r.sub_char2(), instR.sub_char2(), null));
					r.sub_char3(compVal(r.sub_char3_upd_flg(), r.sub_char3(), instR.sub_char3(), null));
					
					MCList<MST_ACXFR_INST_D_R> instDL = MCList.create(MST_ACXFR_INST_D_R.class);
					MST_ACXFR_INST_D_R t4 = MST_ACXFR_INST_D_R.create("T4");
					MCQueryApiBuilder instDL_bldr = MCQueryApiBuilder.create(t4);
					instDL_bldr.setWhere(t4.acxfr_inst_no.eq(bind("acxfr_inst_no")), r);
					dbSelectForUpdate("MSBEL6410_MST_ACXFR_INST_D_S01", instDL, instDL_bldr);
					
					MCIndexKey idxkeyInstD = instDL.createIndex(MST_ACXFR_INST_D_R.$acxfr_inst_d_no);
					for (AcXfrActIF_DtlR dtlR : tarDtlL) {
						MST_ACXFR_INST_D_R instDR = instDL.getFirst(idxkeyInstD, dtlR.acxfr_inst_d_no());
						if (!isNull(instDR)) {
							// 指図明細から補完
							compFromInstD(dtlR, instDR);
						}
					}
				}
				else {
					for (AcXfrActIF_DtlR dtlR : tarDtlL) {
						if (!isNull(dtlR.acxfr_schd_no())) {
							MST_ACXFR_SCHD_R schdDR = MST_ACXFR_SCHD_R.create();
							MST_ACXFR_SCHD_R t5 = MST_ACXFR_SCHD_R.create("T5");
							MCQueryApiBuilder schdDR_bldr = MCQueryApiBuilder.create(t5);
							schdDR_bldr.setWhere(t5.acxfr_schd_no.eq(bind("acxfr_schd_no")), r);
							dbSelectForUpdate("MSBEL6410_MST_ACXFR_SCHD_S03", schdDR, schdDR_bldr);
							if(!isNull(schdDR)){
								// 予定から補完
								compFromSchd(dtlR, schdDR);
							}
						}
					}
				}

			}

			return msgL;
		}

		
		/**
		 * 他勘定予定から補完する
		 * @param dtlR
		 * @param schdDR
		 */
		protected void compFromSchd(AcXfrActIF_DtlR dtlR, MST_ACXFR_SCHD_R schdDR){
			dtlR.dspsl_no(schdDR.dspsl_no());
			dtlR.aprv_flg(schdDR.aprv_flg());
			dtlR.aprv_no(schdDR.aprv_no());
			dtlR.aprv_sts_typ(schdDR.aprv_sts_typ());
			dtlR.schd_base_unit_qty(schdDR.base_unit_qty());
			dtlR.io_schd_pr_no(schdDR.io_schd_pr_no());
			dtlR.trd_d_rmrks(compVal(dtlR.trd_d_rmrks_upd_flg(), dtlR.trd_d_rmrks(), schdDR.trd_d_rmrks(), null));
			dtlR.sub_char1(compVal(dtlR.sub_char1_upd_flg(), dtlR.sub_char1(), schdDR.sub_char1(), null));
			dtlR.sub_char2(compVal(dtlR.sub_char2_upd_flg(), dtlR.sub_char2(), schdDR.sub_char2(), null));
			dtlR.sub_char3(compVal(dtlR.sub_char3_upd_flg(), dtlR.sub_char3(), schdDR.sub_char3(), null));
		}

		/**
		 * 他勘定指図明細から補完する
		 * @param dtlR
		 * @param instDR
		 */
		protected void compFromInstD(AcXfrActIF_DtlR dtlR, MST_ACXFR_INST_D_R instDR){
			dtlR.dspsl_no(instDR.dspsl_no());
			dtlR.aprv_flg(instDR.aprv_flg());
			dtlR.aprv_no(instDR.aprv_no());
			dtlR.aprv_sts_typ(instDR.aprv_sts_typ());
			dtlR.inst_base_unit_qty(instDR.base_unit_qty());
			dtlR.io_schd_pr_no(instDR.io_schd_pr_no());
			dtlR.base_unit_cd(instDR.base_unit_cd());
			dtlR.trd_d_rmrks(compVal(dtlR.trd_d_rmrks_upd_flg(), dtlR.trd_d_rmrks(), instDR.trd_d_rmrks(), null));
			dtlR.sub_char1(compVal(dtlR.sub_char1_upd_flg(), dtlR.sub_char1(), instDR.sub_char1(), null));
			dtlR.sub_char2(compVal(dtlR.sub_char2_upd_flg(), dtlR.sub_char2(), instDR.sub_char2(), null));
			dtlR.sub_char3(compVal(dtlR.sub_char3_upd_flg(), dtlR.sub_char3(), instDR.sub_char3(), null));
		}

		/**
		 * 他勘定実績明細から補完する
		 * @param dtlR
		 * @param actDR
		 */
		protected void compFromActD(AcXfrActIF_DtlR dtlR, MST_ACXFR_ACT_D_R actDR){
			dtlR.dspsl_no(actDR.dspsl_no());
			dtlR.aprv_flg(actDR.aprv_flg());
			dtlR.aprv_no(actDR.aprv_no());
			dtlR.aprv_sts_typ(actDR.aprv_sts_typ());
			dtlR.io_schd_pr_no(actDR.io_schd_pr_no());
			dtlR.acxfr_act_rev(actDR.acxfr_act_rev());
			dtlR.trd_d_rmrks(compVal(dtlR.trd_d_rmrks_upd_flg(), dtlR.trd_d_rmrks(), actDR.trd_d_rmrks(), null));
			dtlR.sub_char1(compVal(dtlR.sub_char1_upd_flg(), dtlR.sub_char1(), actDR.sub_char1(), null));
			dtlR.sub_char2(compVal(dtlR.sub_char2_upd_flg(), dtlR.sub_char2(), actDR.sub_char2(), null));
			dtlR.sub_char3(compVal(dtlR.sub_char3_upd_flg(), dtlR.sub_char3(), actDR.sub_char3(), null));
		}

		protected MCMessageList compSub() {
			MCMessageList msgL = new MCMessageList();
				
			for (AcXfrActIF_DtlR dtlR : up2()) {
				
				// 在庫検査区分は「検査済」で固定、良品区分は指定がなければ「良品」を補完
				dtlR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
				dtlR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
				if (isNull(dtlR.quality_typ())) {
					dtlR.quality_typ(MAC_QUALITY_TYP.GOOD.value());
				}
				
				// 格付CDは指定がなければ昇順の内容を補完
				if (isNull(dtlR.gd_cd())) {
					dtlR.gd_cd(getDefGdCd());
				}

				if (isNull(dtlR.fix_no_typ())) {
					dtlR.fix_no_typ(MSC_FIX_NO_TYP.NON.value());
				}
				
				if (isNull(dtlR.str_ln_cd())) {
					dtlR.str_ln_cd(MAC_STR.NULL_VAL.value());
				}
				
				MAVM_ITM_UNIT_R itmUnitR = getItmUnitR(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), dtlR.trd_unit_cd());
				MAM_ITM_R baseItmUnitR = getItmR(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3());
				
				dtlR.lot_mng_typ(baseItmUnitR.lot_mng_typ());	
				dtlR.lot_no_typ(baseItmUnitR.lot_no_typ());	
				dtlR.lot_no_ptn_cd(baseItmUnitR.lot_no_ptn_cd());	
				dtlR.sublot_mng_typ(baseItmUnitR.sublot_mng_typ());	
				dtlR.sublot_no_typ(baseItmUnitR.sublot_no_typ());	
				dtlR.sublot_no_ptn_cd(baseItmUnitR.sublot_no_ptn_cd());	
				dtlR.base_unit_cd(baseItmUnitR.unit_cd());	
				dtlR.base_unit_qty(convToBaseUnit(dtlR.trd_unit_qty(), itmUnitR.conv_base_qty(), 
						itmUnitR.conv_qty(), baseItmUnitR.dec_place(), baseItmUnitR.rnd_typ()));
				dtlR.addNumberColumn(MAVM_ITM_UNIT_R.$dec_place, itmUnitR.dec_place());
				if (itmUnitR.pack_flg()) {
					dtlR.pack_unit_cd(dtlR.trd_unit_cd());
					dtlR.pack_unit_qty(dtlR.trd_unit_qty());
				}else {
					dtlR.pack_unit_cd(dtlR.base_unit_cd());
					dtlR.pack_unit_qty(dtlR.base_unit_qty());
				}
			}
			return msgL;
		}
		protected MCMessageList chkSno() {
			MCMessageList msgL = new MCMessageList();
			MCList<AcXfrActIF_DtlR> dtlL = getChkList(up2());

			for (AcXfrActIF_DtlR dtlR : dtlL) {
				// 手配ＮＯ１
				if (MAC_SNO_MNG_TYP.isNOT_MNG(dtlR.sno1_mng_typ())) {
					dtlR.sno1(MAC_STR.NULL_VAL.value());
				}
				else if (MAC_SNO_MNG_TYP.isMNG_REQ(dtlR.sno1_mng_typ())) {
					dtlR.sno1(nullValToNull(dtlR.sno1()));
					msgL.addAll(check(dtlR, AcXfrActIF_DtlR.$sno1, new FXUCL_RequiredValidater()));
				}
				
				// 手配ＮＯ２
				if (MAC_SNO_MNG_TYP.isNOT_MNG(dtlR.sno2_mng_typ())) {
					dtlR.sno2(MAC_STR.NULL_VAL.value());
				}
				else if (MAC_SNO_MNG_TYP.isMNG_REQ(dtlR.sno2_mng_typ())) {
					dtlR.sno2(nullValToNull(dtlR.sno2()));
					msgL.addAll(check(dtlR, AcXfrActIF_DtlR.$sno2, new FXUCL_RequiredValidater()));
				}
				
				// 手配ＮＯ３
				if (MAC_SNO_MNG_TYP.isNOT_MNG(dtlR.sno3_mng_typ())) {
					dtlR.sno3(MAC_STR.NULL_VAL.value());
				}
				else if (MAC_SNO_MNG_TYP.isMNG_REQ(dtlR.sno3_mng_typ())) {
					dtlR.sno3(nullValToNull(dtlR.sno3()));
					msgL.addAll(check(dtlR, AcXfrActIF_DtlR.$sno3, new FXUCL_RequiredValidater()));
				}
				
				// 手配ＮＯ４
				if (MAC_SNO_MNG_TYP.isNOT_MNG(dtlR.sno4_mng_typ())) {
					dtlR.sno4(MAC_STR.NULL_VAL.value());
				}
				else if (MAC_SNO_MNG_TYP.isMNG_REQ(dtlR.sno4_mng_typ())) {
					dtlR.sno4(nullValToNull(dtlR.sno4()));
					msgL.addAll(check(dtlR, AcXfrActIF_DtlR.$sno4, new FXUCL_RequiredValidater()));
				}
			}
			
			return msgL;
		}

		protected void setLotNo() {
			MCIndexKey idx = up2().createIndex(AcXfrActIF_DtlR.$hdr_dtl_peg_no);
			MCList<AcXfrActIF_HdrR> hdrL = getChkList(up1().subList(MCRow.CREATE, MCRow.MODIFY));		
			for(AcXfrActIF_HdrR r : hdrL) {
				MCList<AcXfrActIF_DtlR> tarDtlL = getChkList(up2().subList(idx, r.hdr_dtl_peg_no()));
				for (AcXfrActIF_DtlR dtlR : tarDtlL) {
					if (dtlR.crt_lot_flg()) {
						if (canGenerateLotNo(dtlR)) {
							dtlR.lot_no(getLotNo(r, dtlR, MAC_NUM_BIZ_TYP.LOT));
						}
					}
					if (dtlR.crt_lot_flg() || MAC_SUBLOT_MNG_TYP.isSTK(dtlR.sublot_mng_typ())) {
						if (canGenerateSubLotNo(dtlR)) {
							dtlR.sublot_no(getLotNo(r, dtlR, MAC_NUM_BIZ_TYP.SUBLOT));
						}
					}
					if (dtlR.lot_no() == null) {
						dtlR.lot_no(MAC_STR.NULL_VAL.value());
					}
					if (dtlR.sublot_no() == null) {
						dtlR.sublot_no(MAC_STR.NULL_VAL.value());
					}

				}
			}
		}
		
		protected boolean canGenerateLotNo(AcXfrActIF_DtlR dtlR) {
			if (isNull(dtlR)) {
				return false;
			}

			if (MAC_LOT_NO_TYP.isAUTO(dtlR.lot_no_typ())) {
				return true;
			}
			else if (MAC_LOT_NO_TYP.isAUTO_MANU(dtlR.lot_no_typ())) {
				return isNull(dtlR.lot_no());
			}

			return false;
		}
		

		protected boolean canGenerateSubLotNo(AcXfrActIF_DtlR dtlR) {
			if (isNull(dtlR)) {
				return false;
			}

			if (MAC_SUBLOT_MNG_TYP.isSTK(dtlR.sublot_mng_typ())) {
				if (!MAC_LOT_NO_TYP.isMANUAL(dtlR.sublot_no_typ())) {
					return isNull(dtlR.sublot_no());
				}
			}
			else {
				if (MAC_LOT_NO_TYP.isAUTO(dtlR.sublot_no_typ())) {
					return true;
				}
				else if (MAC_LOT_NO_TYP.isAUTO_MANU(dtlR.sublot_no_typ())) {
					return isNull(dtlR.sublot_no());
				}
			}

			return false;
		}

		protected String getLotNo(AcXfrActIF_HdrR up0, AcXfrActIF_DtlR dtlR,
				MAC_NUM_BIZ_TYP numBizTyp) {

			ElmArgsR lotArgs = ElmArgsR.create();
			if (MAC_NUM_BIZ_TYP.isLOT(numBizTyp)) {
				lotArgs.num_ptn_cd(dtlR.lot_no_ptn_cd());
			}
			else {
				lotArgs.num_ptn_cd(dtlR.sublot_no_ptn_cd());
			}
			lotArgs.itm_cd(dtlR.itm_cd());
			lotArgs.itm_sub1(dtlR.itm_sub1());
			lotArgs.itm_sub2(dtlR.itm_sub2());
			lotArgs.itm_sub3(dtlR.itm_sub3());
			lotArgs.loc_cd(up0.loc_cd());
			lotArgs.dpt_cd(up0.act_dpt_cd());
			lotArgs.co_cd(getCo().co_cd());
			lotArgs.bp_cd(null);
			lotArgs.wg_cd(up0.wg_cd());
			lotArgs.site_cd(null);
			lotArgs.trd_cd(up0.trd_cd());
			lotArgs.dt(up0.acxfr_act_tm());
			lotArgs.str(null);
			lotArgs.str2(null);
			lotArgs.str3(null);
			lotArgs.num(null);
			lotArgs.bp_lot_no(null);
			lotArgs.sno1(dtlR.sno1());
			lotArgs.sno2(dtlR.sno2());
			lotArgs.sno3(dtlR.sno3());
			lotArgs.sno4(dtlR.sno4());
			if (MAC_NUM_BIZ_TYP.isSUBLOT(numBizTyp)) {
				lotArgs.lot_no(dtlR.lot_no());
			}

			return getNum(numBizTyp, lotArgs);
		}
		
		
		protected boolean isPack(String itmCd, String itmSub1, String itmSub2,
				String itmSub3, String trdUnitCd) {
			MAVM_ITM_UNIT_R itmUnitR = MAVM_ITM_UNIT_R.create();
			
			itmUnitR.itm_cd(itmCd);
			itmUnitR.itm_sub1(itmSub1);
			itmUnitR.itm_sub2(itmSub2);
			itmUnitR.itm_sub3(itmSub3);
			itmUnitR.unit_cd(trdUnitCd);
			MCQueryApiBuilder itmUnitR_bldr = MCQueryApiBuilder.create(MAVM_ITM_UNIT_R.create("T"));
			dbSelectKey("MSBEL6410_MAVM_ITM_UNIT_S01", itmUnitR, itmUnitR_bldr, itmUnitR);
			return itmUnitR.pack_flg();
		}
		/**
		 * 更新ＦＬＧに従い、上り電文の値、または、更新前の値を更新結果に決めます。
		 */
		private String compVal(boolean updFlg, String upVal, String dbVal, String defVal) {
			if (updFlg){
				return nvl(upVal, defVal);
			}
			return dbVal;
		}
		
		/**
		 * 他勘定振替実績SVの登録前チェック処理を実行する
		 */
		protected void callChk01() {
			MCList<AcXfrActIF_HdrR> hdrL = getChkList(up1().subList(r -> MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())));
			if (hdrL.isEmpty()) {
				return;
			}
			
			Map_AcXfrAct_Chk01_HdrR_AcXfrActIF_HdrR<AcXfrAct_Chk01_HdrR,AcXfrActIF_HdrR>
				mprH = createMap_AcXfrAct_Chk01_HdrR_AcXfrActIF_HdrR();
				
			Map_AcXfrAct_Chk01_DtlR_AcXfrActIF_DtlR<AcXfrAct_Chk01_DtlR,AcXfrActIF_DtlR>
				mprD = createMap_AcXfrAct_Chk01_DtlR_AcXfrActIF_DtlR();

			MCIndexKey dtlIdx = up2().createIndex(AcXfrActIF_DtlR.$hdr_dtl_peg_no);

			MCList<AcXfrActIF_DtlR> dtlL = MCList.create(AcXfrActIF_DtlR.class);
			for(AcXfrActIF_HdrR r : hdrL) {
				dtlL.addAll(up2().subList(dtlIdx, r.hdr_dtl_peg_no()));
			}
			MSBEL_AcXfrActRegService.AcXfrAct_Chk01 o = MSBEL_AcXfrActRegService.crtAcXfrAct_Chk01();
			setAll(o.up0(), hdrL, mprH);
			setAll(o.up1(), dtlL, mprD);
			o.exec();

			String[] hDestCol = new String[]{AcXfrActIF_HdrR.$err_flg};
			String[] hSrcCol = new String[]{AcXfrAct_Chk01_HdrR.$err_flg};
			String[] dDestCol = new String[]{
					AcXfrActIF_DtlR.$err_flg, AcXfrActIF_DtlR.$vmi_interim_flg, AcXfrActIF_DtlR.$vmi_upri
			};
			String[] dSrcCol = new String[]{
					AcXfrAct_Chk01_DtlR.$err_flg, AcXfrAct_Chk01_DtlR.$vmi_interim_flg, AcXfrAct_Chk01_DtlR.$vmi_upri
			};
			
			copyByPegNo(hdrL, hDestCol, o.down0(), hSrcCol);
			copyByPegNo(dtlL, dDestCol, o.down1(), dSrcCol);
		}
		
		/**
		 * 他勘定振替実績SVの更新前チェック処理を実行する
		 */
		protected void callChk02() {
			MCList<AcXfrActIF_HdrR> hdrL = getChkList(up1().subList(r -> MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())));
			if (hdrL.isEmpty()) {
				return;
			}
			
			Map_AcXfrAct_Chk01_HdrR_AcXfrActIF_HdrR<AcXfrAct_Chk01_HdrR,AcXfrActIF_HdrR>
				mprH = createMap_AcXfrAct_Chk01_HdrR_AcXfrActIF_HdrR();
				
			Map_AcXfrAct_Chk01_DtlR_AcXfrActIF_DtlR<AcXfrAct_Chk01_DtlR,AcXfrActIF_DtlR>
				mprD = createMap_AcXfrAct_Chk01_DtlR_AcXfrActIF_DtlR();

			MCIndexKey dtlIdx = up2().createIndex(AcXfrActIF_DtlR.$hdr_dtl_peg_no);

			MCList<AcXfrActIF_DtlR> dtlL = MCList.create(AcXfrActIF_DtlR.class);
			for(AcXfrActIF_HdrR r : hdrL) {
				dtlL.addAll(up2().subList(dtlIdx, r.hdr_dtl_peg_no()));
			}
			MSBEL_AcXfrActRegService.AcXfrAct_Chk02 o = MSBEL_AcXfrActRegService.crtAcXfrAct_Chk02();
			setAll(o.up0(), hdrL, mprH);
			setAll(o.up1(), dtlL, mprD);
			o.exec();

			String[] hDestCol = new String[]{AcXfrActIF_HdrR.$err_flg};
			String[] hSrcCol = new String[]{AcXfrAct_Chk01_HdrR.$err_flg};
			String[] dDestCol = new String[]{
					AcXfrActIF_DtlR.$err_flg, AcXfrActIF_DtlR.$vmi_interim_flg, AcXfrActIF_DtlR.$vmi_upri
			};
			String[] dSrcCol = new String[]{
					AcXfrAct_Chk01_DtlR.$err_flg, AcXfrAct_Chk01_DtlR.$vmi_interim_flg, AcXfrAct_Chk01_DtlR.$vmi_upri
			};

			copyByPegNo(hdrL, hDestCol, o.down0(), hSrcCol);
			copyByPegNo(dtlL, dDestCol, o.down1(), dSrcCol);
		}
		
		/**
		 * 他勘定振替実績SVの削除前チェック処理を実行する
		 */
		protected void callChk03() {
			MCList<AcXfrActIF_HdrR> hdrL = getChkList(up1().subList(r -> MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())));
			if (hdrL.isEmpty()) {
				return;
			}
			
			Map_AcXfrAct_Chk03_HdrR_AcXfrActIF_HdrR<AcXfrAct_Chk03_HdrR,AcXfrActIF_HdrR>
				mprH = createMap_AcXfrAct_Chk03_HdrR_AcXfrActIF_HdrR();
				
			Map_AcXfrAct_Chk03_DtlR_AcXfrActIF_DtlR<AcXfrAct_Chk03_DtlR,AcXfrActIF_DtlR>
				mprD = createMap_AcXfrAct_Chk03_DtlR_AcXfrActIF_DtlR();

			MCIndexKey dtlIdx = up2().createIndex(AcXfrActIF_DtlR.$hdr_dtl_peg_no);

			MCList<AcXfrActIF_DtlR> dtlL = MCList.create(AcXfrActIF_DtlR.class);
			for(AcXfrActIF_HdrR r : hdrL) {
				dtlL.addAll(up2().subList(dtlIdx, r.hdr_dtl_peg_no()));
			}
			MSBEL_AcXfrActRegService.AcXfrAct_Chk03 o = MSBEL_AcXfrActRegService.crtAcXfrAct_Chk03();
			setAll(o.up0(), hdrL, mprH);
			setAll(o.up1(), dtlL, mprD);
			o.exec();

			String[] hDestCol = new String[]{AcXfrActIF_HdrR.$err_flg};
			String[] hSrcCol = new String[]{AcXfrAct_Chk01_HdrR.$err_flg};
			String[] dDestCol = new String[]{AcXfrActIF_DtlR.$err_flg};
			String[] dSrcCol = new String[]{AcXfrAct_Chk01_DtlR.$err_flg};
			
			copyByPegNo(hdrL, hDestCol, o.down0(), hSrcCol);
			copyByPegNo(dtlL, dDestCol, o.down1(), dSrcCol);

		}

		protected void setErrFlgDtl() {
			MCMessageList msgL = MCMessagePool.getMessageList();
			MCIndexKey hdrPegNoHdrIdx = up1().createIndex(AcXfrActIF_HdrR.$hdr_dtl_peg_no);
			MCIndexKey hdrPegNoDtlIdx = up2().createIndex(AcXfrActIF_DtlR.$hdr_dtl_peg_no);
			MCIndexKey extActNoIdx = up2().createIndex(AcXfrActIF_DtlR.$ext_sys_cd, AcXfrActIF_DtlR.$ext_acxfr_act_no);

			// エラーになった明細と紐づく明細が取れなくなるまでループする
			MCList<AcXfrActIF_DtlR> errL = up2().subList(r -> r.err_flg() && !isNull(r.ext_sys_cd()) && !isNull(r.ext_acxfr_act_no()));
			while (!errL.isEmpty()) {
				MCList<AcXfrActIF_DtlR> errOtherL = MCList.create(AcXfrActIF_DtlR.class);
				for(AcXfrActIF_DtlR errR : errL) {
					// 同じ外部他勘定振替実績ＮＯの全明細をエラーにする（更新データが削除と新規に分割されたときを想定）
					MCList<AcXfrActIF_DtlR> sameExtActNoL = up2().subList(extActNoIdx, errR.ext_sys_cd(), errR.ext_acxfr_act_no());
					errOtherL.addAll(sameExtActNoL.subList(AcXfrActIF_DtlR.$err_flg, false));
					errOtherL.setBoolean(AcXfrActIF_DtlR.$err_flg, true);

					// 同じヘッダ明細紐付けＮＯの全明細をエラーにする
					MCList<AcXfrActIF_DtlR> sameHdrPegNoL = up2().subList(hdrPegNoDtlIdx, errR.hdr_dtl_peg_no());
					for (AcXfrActIF_DtlR sameHdrPegNoR : sameHdrPegNoL.subList(AcXfrActIF_DtlR.$err_flg, false)) {
						AcXfrActIF_HdrR hdrR = up1().getFirst(hdrPegNoHdrIdx, errR.hdr_dtl_peg_no());
						msgL.add(new MCMessage(sameHdrPegNoR, null, MSBEL1073,
								sameHdrPegNoR.ext_acxfr_act_no(),
								hdrR.trd_cd(),
								hdrR.loc_cd(),
								toYMDHMString(hdrR.acxfr_act_tm()),
								hdrR.act_dpt_cd(),
								hdrR.act_usr_cd(),
								toDispGUIIndex(sameHdrPegNoR)));
						sameHdrPegNoR.err_flg(true);
						errOtherL.add(sameHdrPegNoR);
					}
				}
				errL.setAll(errOtherL);
			}
		}

		protected void setDown() {
			down0().err_flg(up0().err_flg());
			down1().setAll(up1());
			down2().setAll(up2());			
			MCIndexKey
			idx1 = down2().createIndex(AcXfrActIF_DtlR.$hdr_dtl_peg_no, AcXfrActIF_DtlR.$err_flg);
			down1().forEach(r -> {
				if (!isNull(down2().getFirst(idx1, r.hdr_dtl_peg_no(), true))) {
					// 明細にエラーがある場合、ヘッダのエラーフラグを立てる
					r.err_flg(true);
				}
			});
		}

	}	
	/**
	 * AcXfrActIF_Upd01オペレーション.<p>
	 *
	 * 外部システムから他勘定振替実績の登録、更新、取消を行います。<br>
	 */
	public class AcXfrActIF_Upd01 extends MSBEL_AcXfrActRcptIFService_MC_A.AcXfrActIF_Upd01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess();
			}
			catch (Exception e) {
				if (up0().is_src_batch_flg()) {
					// バッチ実行の場合は呼出元でハンドリングする
					throw e;
				}
				handleEx(e);
			}
			finally {
				setDown();
			}
		}

		@Override
		protected void doIt() {
			editUp();
			callChk01();
			if (up0().err_flg()) {
				throwOpeErr();
			}
			callAcXfrActSv();
		}
		
		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			for (AcXfrActIF_HdrR r : up1()) {
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					r.setStatus(MCRow.CREATE);
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					r.setStatus(MCRow.MODIFY);
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					r.setStatus(MCRow.DELETE);
				}
				else {
					r.setStatus(MCRow.NONE);
				}
			}
			for (AcXfrActIF_DtlR r : up2()) {
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					r.setStatus(MCRow.CREATE);
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					r.setStatus(MCRow.MODIFY);
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					r.setStatus(MCRow.DELETE);
				}
				else {
					r.setStatus(MCRow.NONE);
				}
			}
		};

		
		/**
		 * 他勘定振替実績受信IFSVのチェック処理を実行する
		 */
		protected void callChk01() {
			MSBEL_AcXfrActRcptIFService.Chk01 ope = MSBEL_AcXfrActRcptIFService.crtChk01();
			MCRow.copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			ope.up2().setAll(up2());
			ope.exec();
			
			up0().err_flg(ope.down0().err_flg());
			up1().setAll(ope.down1());
			up2().setAll(ope.down2());
		}
		
		/**
		 * 他勘定振替実績受信SVを実行する
		 */
		protected void callAcXfrActSv() {
			
			Map_AcXfrAct_Chk01_HdrR_AcXfrActIF_HdrR<AcXfrAct_Chk01_HdrR,AcXfrActIF_HdrR> 
			mapIFSVtoSVH1 = createMap_AcXfrAct_Chk01_HdrR_AcXfrActIF_HdrR();
			
			Map_AcXfrAct_Chk01_DtlR_AcXfrActIF_DtlR<AcXfrAct_Chk01_DtlR,AcXfrActIF_DtlR> 
			mapIFSVtoSVD1 = createMap_AcXfrAct_Chk01_DtlR_AcXfrActIF_DtlR();
			
			Map_AcXfrAct_Chk03_HdrR_AcXfrActIF_HdrR<AcXfrAct_Chk03_HdrR,AcXfrActIF_HdrR>
			mapIFSVtoSVH3 = createMap_AcXfrAct_Chk03_HdrR_AcXfrActIF_HdrR();
			
			Map_AcXfrAct_Chk03_DtlR_AcXfrActIF_DtlR<AcXfrAct_Chk03_DtlR,AcXfrActIF_DtlR>
			mapIFSVtoSVD3 = createMap_AcXfrAct_Chk03_DtlR_AcXfrActIF_DtlR();
			
			MCList<AcXfrActIF_HdrR> tgtL = getUpdTgtL();
			
			MCIndexKey
			actIdx = tgtL.createIndex(AcXfrActIF_HdrR.$hdr_dtl_peg_no),
			actDIdx = up2().createIndex(AcXfrActIF_DtlR.$hdr_dtl_peg_no);

			MSBEL_AcXfrActRegService.AcXfrAct_Ins01 insOpe = MSBEL_AcXfrActRegService.crtAcXfrAct_Ins01();
			MSBEL_AcXfrActRegService.AcXfrAct_Upd01 updOpe = MSBEL_AcXfrActRegService.crtAcXfrAct_Upd01();
			MSBEL_AcXfrActRegService.AcXfrAct_Del01 delOpe = MSBEL_AcXfrActRegService.crtAcXfrAct_Del01();


			for (AcXfrActIF_HdrR r : up1()) {
				if (isNull(tgtL.getFirst(actIdx, r.hdr_dtl_peg_no()))) {
					r.rtn_sts_typ(
						r.err_flg() ? MAC_RTN_STS_TYP.ERR.value() : MAC_RTN_STS_TYP.NOT_EXE.value());
					continue;
				}

				MCList<AcXfrActIF_DtlR> dtlL = getChkList(up2().subList(actDIdx, r.hdr_dtl_peg_no()));
				
				// 他勘定実績実績サービス実行
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					AcXfrAct_Chk01_HdrR hdrR = AcXfrAct_Chk01_HdrR.create();
					copy(hdrR, r, mapIFSVtoSVH1);
					insOpe.up0().add(hdrR);
					addAll(insOpe.up1(), dtlL, mapIFSVtoSVD1);
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					AcXfrAct_Chk01_HdrR hdrR = AcXfrAct_Chk01_HdrR.create();
					copy(hdrR, r, mapIFSVtoSVH1);
					updOpe.up0().add(hdrR);
					addAll(updOpe.up1(), dtlL, mapIFSVtoSVD1);
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					AcXfrAct_Chk03_HdrR hdrR = AcXfrAct_Chk03_HdrR.create();
					copy(hdrR, r, mapIFSVtoSVH3);
					delOpe.up0().add(hdrR);
					addAll(delOpe.up1(), dtlL, mapIFSVtoSVD3);
				}
			}
			
			insOpe.exec();
			updOpe.exec();
			delOpe.exec();
			for (AcXfrActIF_HdrR r : tgtL){
				r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
			}
		}

		/**
		 * IF更新区分を考慮し、更新対象のヘッダを振り分けする
		 */
		protected MCList<AcXfrActIF_HdrR> getUpdTgtL() {
			MCList<AcXfrActIF_HdrR> tgtL = MCList.create(AcXfrActIF_HdrR.class);

			// 1：すべて登録しない
			// 2：エラーを無視して登録
			// 3：エラー行まで登録
			if (MAC_IF_UPD_TYP.isALL_ERROR(up0().if_upd_typ())
				&& !isNull(up1().getFirst(AcXfrActIF_HdrR.$err_flg, true))) {
				// エラーあり、かつ「1：すべて登録しない」の場合、空のリストを返す
				return tgtL;
			}
			for (AcXfrActIF_HdrR r : up1()) {
				if (!r.err_flg()) {
					tgtL.add(r);
				}
				else 	if (MAC_IF_UPD_TYP.isSTOP_ERROR(up0().if_upd_typ())) {
					// 「3：エラー行まで登録」の場合、ここまでで蓄積したリストを更新対象とする
					break;
				}
			}
			return tgtL;
		}
		
		
		protected void handleSuccess() {
			if (up0().not_commit_flg()) {
				// コミットしない（バッチ実行）の場合は呼出元でトランを管理する
				return;
			}
			dbTran().commit();
		}
		
		protected void handleEx(Exception e) {
			dbTran().rollback();

			MCException mcex;
			if (e instanceof MCException) {
				mcex = (MCException)e;
			}
			else {
				mcex = new MCException(e);
			}
			MCLog.write(mcex);

			MCMessage msg = mcex.getMCMessage();
			MCMessagePool.add(msg);
			MCMessagePool.addAll(mcex.getCauseMessageList());
		}
		
		protected void throwOpeErr() {
			throwErr(msgOpeErr());
		}
		
		protected void setDown() {
			down0().setAll(up1());
			down1().setAll(up2());
		}
	}
	

	// mcframe.serverMSBE.MSBEL6400.AcXfrAct_Chk01_HdrR
	// mcframe.serverMSBE.MSBEL6410.AcXfrActIF_HdrR
	protected Map_AcXfrAct_Chk01_HdrR_AcXfrActIF_HdrR<AcXfrAct_Chk01_HdrR,AcXfrActIF_HdrR> createMap_AcXfrAct_Chk01_HdrR_AcXfrActIF_HdrR() {
		return new Map_AcXfrAct_Chk01_HdrR_AcXfrActIF_HdrR<AcXfrAct_Chk01_HdrR, AcXfrActIF_HdrR>();
	}

	public class Map_AcXfrAct_Chk01_HdrR_AcXfrActIF_HdrR<D extends AcXfrAct_Chk01_HdrR, S extends AcXfrActIF_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(AcXfrAct_Chk01_HdrR.$acxfr_act_no, AcXfrActIF_HdrR.$acxfr_act_no);
			addColumnPathMap(AcXfrAct_Chk01_HdrR.$acxfr_act_rev, AcXfrActIF_HdrR.$acxfr_act_rev);
			addColumnPathMap(AcXfrAct_Chk01_HdrR.$trd_cd, AcXfrActIF_HdrR.$trd_cd);
			addColumnPathMap(AcXfrAct_Chk01_HdrR.$trd_ptn_typ, AcXfrActIF_HdrR.$trd_ptn_typ);
			addColumnPathMap(AcXfrAct_Chk01_HdrR.$loc_cd, AcXfrActIF_HdrR.$loc_cd);
			addColumnPathMap(AcXfrAct_Chk01_HdrR.$wg_cd, AcXfrActIF_HdrR.$wg_cd);
			addColumnPathMap(AcXfrAct_Chk01_HdrR.$acxfr_inst_no, AcXfrActIF_HdrR.$acxfr_inst_no);
			addColumnPathMap(AcXfrAct_Chk01_HdrR.$acxfr_act_tm, AcXfrActIF_HdrR.$acxfr_act_tm);
			addColumnPathMap(AcXfrAct_Chk01_HdrR.$ac_dt, AcXfrActIF_HdrR.$ac_dt);
			addColumnPathMap(AcXfrAct_Chk01_HdrR.$can_ac_dt, AcXfrActIF_HdrR.$can_ac_dt);
			addColumnPathMap(AcXfrAct_Chk01_HdrR.$act_usr_cd, AcXfrActIF_HdrR.$act_usr_cd);
			addColumnPathMap(AcXfrAct_Chk01_HdrR.$act_dpt_cd, AcXfrActIF_HdrR.$act_dpt_cd);
			addColumnPathMap(AcXfrAct_Chk01_HdrR.$intr_rmrks, AcXfrActIF_HdrR.$intr_rmrks);
			addColumnPathMap(AcXfrAct_Chk01_HdrR.$trd_rmrks, AcXfrActIF_HdrR.$trd_rmrks);
			addColumnPathMap(AcXfrAct_Chk01_HdrR.$prnt_flg, AcXfrActIF_HdrR.$prnt_flg);
			addColumnPathMap(AcXfrAct_Chk01_HdrR.$sub_char1, AcXfrActIF_HdrR.$sub_char1);
			addColumnPathMap(AcXfrAct_Chk01_HdrR.$sub_char2, AcXfrActIF_HdrR.$sub_char2);
			addColumnPathMap(AcXfrAct_Chk01_HdrR.$sub_char3, AcXfrActIF_HdrR.$sub_char3);
			addColumnPathMap(AcXfrAct_Chk01_HdrR.$data_crud_typ, AcXfrActIF_HdrR.$data_crud_typ);
			addColumnPathMap(AcXfrAct_Chk01_HdrR.$err_flg, AcXfrActIF_HdrR.$err_flg);
			addColumnPathMap(AcXfrAct_Chk01_HdrR.$peg_no, AcXfrActIF_HdrR.$peg_no);
			addColumnPathMap(AcXfrAct_Chk01_HdrR.$hdr_dtl_peg, AcXfrActIF_HdrR.$hdr_dtl_peg_no);

		}
	}
	
	// mcframe.serverMSBE.MSBEL6400.AcXfrAct_Chk01_DtlR
	// mcframe.serverMSBE.MSBEL6410.AcXfrActIF_DtlR
	protected Map_AcXfrAct_Chk01_DtlR_AcXfrActIF_DtlR<AcXfrAct_Chk01_DtlR,AcXfrActIF_DtlR> createMap_AcXfrAct_Chk01_DtlR_AcXfrActIF_DtlR() {
		return new Map_AcXfrAct_Chk01_DtlR_AcXfrActIF_DtlR<AcXfrAct_Chk01_DtlR, AcXfrActIF_DtlR>();
	}

	public class Map_AcXfrAct_Chk01_DtlR_AcXfrActIF_DtlR<D extends AcXfrAct_Chk01_DtlR, S extends AcXfrActIF_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$abort_flg, AcXfrActIF_DtlR.$abort_flg);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$pr_sts_typ, AcXfrActIF_DtlR.$pr_sts_typ);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$itm_cd, AcXfrActIF_DtlR.$itm_cd);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$itm_sub1, AcXfrActIF_DtlR.$itm_sub1);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$itm_sub2, AcXfrActIF_DtlR.$itm_sub2);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$itm_sub3, AcXfrActIF_DtlR.$itm_sub3);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$itm_nm, AcXfrActIF_DtlR.$itm_nm);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$crt_lot_flg, AcXfrActIF_DtlR.$crt_lot_flg);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$lot_no, AcXfrActIF_DtlR.$lot_no);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$sublot_no, AcXfrActIF_DtlR.$sublot_no);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$ver_no, AcXfrActIF_DtlR.$ver_no);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$trd_unit_cd, AcXfrActIF_DtlR.$trd_unit_cd);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$trd_unit_qty, AcXfrActIF_DtlR.$trd_unit_qty);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$base_unit_cd, AcXfrActIF_DtlR.$base_unit_cd);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$base_unit_qty, AcXfrActIF_DtlR.$base_unit_qty);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$pack_unit_cd, AcXfrActIF_DtlR.$pack_unit_cd);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$pack_unit_qty, AcXfrActIF_DtlR.$pack_unit_qty);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$str_ln_cd, AcXfrActIF_DtlR.$str_ln_cd);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$bd_dpt_cd, AcXfrActIF_DtlR.$bd_dpt_cd);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$stk_arrv_bp_cd, AcXfrActIF_DtlR.$stk_arrv_bp_cd);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$quality_typ, AcXfrActIF_DtlR.$quality_typ);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$stk_insp_typ, AcXfrActIF_DtlR.$stk_insp_typ);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$stk_id_typ, AcXfrActIF_DtlR.$stk_id_typ);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$gd_cd, AcXfrActIF_DtlR.$gd_cd);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$stk_bp_cd, AcXfrActIF_DtlR.$stk_bp_cd);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$sno1, AcXfrActIF_DtlR.$sno1);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$sno2, AcXfrActIF_DtlR.$sno2);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$sno3, AcXfrActIF_DtlR.$sno3);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$sno4, AcXfrActIF_DtlR.$sno4);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$fix_no_typ, AcXfrActIF_DtlR.$fix_no_typ);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$fix_no, AcXfrActIF_DtlR.$fix_no);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$bd_loc_cd, AcXfrActIF_DtlR.$bd_loc_cd);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$bd_ctg_cd, AcXfrActIF_DtlR.$bd_ctg_cd);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$bd_oper_cd, AcXfrActIF_DtlR.$bd_oper_cd);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$bd_bp_cd, AcXfrActIF_DtlR.$bd_bp_cd);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$bd_itm_cd, AcXfrActIF_DtlR.$bd_itm_cd);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$bd_itm_sub1, AcXfrActIF_DtlR.$bd_itm_sub1);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$bd_itm_sub2, AcXfrActIF_DtlR.$bd_itm_sub2);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$bd_itm_sub3, AcXfrActIF_DtlR.$bd_itm_sub3);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$bd_lot_no, AcXfrActIF_DtlR.$bd_lot_no);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$bd_sublot_no, AcXfrActIF_DtlR.$bd_sublot_no);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$bd_sno1, AcXfrActIF_DtlR.$bd_sno1);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$bd_sno2, AcXfrActIF_DtlR.$bd_sno2);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$bd_sno3, AcXfrActIF_DtlR.$bd_sno3);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$bd_sno4, AcXfrActIF_DtlR.$bd_sno4);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$intr_d_rmrks, AcXfrActIF_DtlR.$intr_d_rmrks);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$trd_d_rmrks, AcXfrActIF_DtlR.$trd_d_rmrks);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$dspsl_no, AcXfrActIF_DtlR.$dspsl_no);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$acxfr_schd_no, AcXfrActIF_DtlR.$acxfr_schd_no);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$acxfr_inst_d_no, AcXfrActIF_DtlR.$acxfr_inst_d_no);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$acxfr_act_d_no, AcXfrActIF_DtlR.$acxfr_act_d_no);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$aprv_flg, AcXfrActIF_DtlR.$aprv_flg);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$aprv_no, AcXfrActIF_DtlR.$aprv_no);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$aprv_sts_typ, AcXfrActIF_DtlR.$aprv_sts_typ);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$disp_seq, AcXfrActIF_DtlR.$disp_seq);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$sub_char1, AcXfrActIF_DtlR.$sub_char1);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$sub_char2, AcXfrActIF_DtlR.$sub_char2);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$sub_char3, AcXfrActIF_DtlR.$sub_char3);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$acxfr_act_no, AcXfrActIF_DtlR.$acxfr_act_no);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$acxfr_act_rev, AcXfrActIF_DtlR.$acxfr_act_rev);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$loc_cd, AcXfrActIF_DtlR.$loc_cd);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$rsn_cd, AcXfrActIF_DtlR.$rsn_cd);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$stk_mng_typ, AcXfrActIF_DtlR.$stk_mng_typ);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$asset_mng_typ, AcXfrActIF_DtlR.$asset_mng_typ);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$in_xfr_typ, AcXfrActIF_DtlR.$in_xfr_typ);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$io_schd_pr_no, AcXfrActIF_DtlR.$io_schd_pr_no);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$ac_dt, AcXfrActIF_DtlR.$ac_dt);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$trd_ptn_typ, AcXfrActIF_DtlR.$trd_ptn_typ);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$sundry_itm_flg, AcXfrActIF_DtlR.$sundry_itm_flg);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$inst_base_unit_qty, AcXfrActIF_DtlR.$inst_base_unit_qty);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$schd_base_unit_qty, AcXfrActIF_DtlR.$schd_base_unit_qty);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$vmi_interim_flg, AcXfrActIF_DtlR.$vmi_interim_flg);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$vmi_upri, AcXfrActIF_DtlR.$vmi_upri);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$data_crud_typ, AcXfrActIF_DtlR.$data_crud_typ);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$err_flg, AcXfrActIF_DtlR.$err_flg);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$peg_no, AcXfrActIF_DtlR.$peg_no);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$wms_flg, AcXfrActIF_DtlR.$wms_flg);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$ext_acxfr_act_no, AcXfrActIF_DtlR.$ext_acxfr_act_no);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$ext_sys_cd, AcXfrActIF_DtlR.$ext_sys_cd);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$hdr_dtl_peg, AcXfrActIF_DtlR.$hdr_dtl_peg_no);

		}
	}
	
	// mcframe.serverMSBE.MSBEL6400.AcXfrAct_Chk03_HdrR
	// mcframe.serverMSBE.MSBEL6410.AcXfrActIF_HdrR
	protected Map_AcXfrAct_Chk03_HdrR_AcXfrActIF_HdrR<AcXfrAct_Chk03_HdrR,AcXfrActIF_HdrR> createMap_AcXfrAct_Chk03_HdrR_AcXfrActIF_HdrR() {
		return new Map_AcXfrAct_Chk03_HdrR_AcXfrActIF_HdrR<AcXfrAct_Chk03_HdrR, AcXfrActIF_HdrR>();
	}

	public class Map_AcXfrAct_Chk03_HdrR_AcXfrActIF_HdrR<D extends AcXfrAct_Chk03_HdrR, S extends AcXfrActIF_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(AcXfrAct_Chk03_HdrR.$acxfr_act_no, AcXfrActIF_HdrR.$acxfr_act_no);
			addColumnPathMap(AcXfrAct_Chk03_HdrR.$acxfr_act_rev, AcXfrActIF_HdrR.$acxfr_act_rev);
			addColumnPathMap(AcXfrAct_Chk03_HdrR.$trd_cd, AcXfrActIF_HdrR.$trd_cd);
			addColumnPathMap(AcXfrAct_Chk03_HdrR.$trd_ptn_typ, AcXfrActIF_HdrR.$trd_ptn_typ);
			addColumnPathMap(AcXfrAct_Chk03_HdrR.$loc_cd, AcXfrActIF_HdrR.$loc_cd);
			addColumnPathMap(AcXfrAct_Chk03_HdrR.$wg_cd, AcXfrActIF_HdrR.$wg_cd);
			addColumnPathMap(AcXfrAct_Chk03_HdrR.$acxfr_inst_no, AcXfrActIF_HdrR.$acxfr_inst_no);
			addColumnPathMap(AcXfrAct_Chk03_HdrR.$acxfr_act_tm, AcXfrActIF_HdrR.$acxfr_act_tm);
			addColumnPathMap(AcXfrAct_Chk03_HdrR.$ac_dt, AcXfrActIF_HdrR.$ac_dt);
			addColumnPathMap(AcXfrAct_Chk03_HdrR.$can_ac_dt, AcXfrActIF_HdrR.$can_ac_dt);
			addColumnPathMap(AcXfrAct_Chk03_HdrR.$act_usr_cd, AcXfrActIF_HdrR.$act_usr_cd);
			addColumnPathMap(AcXfrAct_Chk03_HdrR.$act_dpt_cd, AcXfrActIF_HdrR.$act_dpt_cd);
			addColumnPathMap(AcXfrAct_Chk03_HdrR.$intr_rmrks, AcXfrActIF_HdrR.$intr_rmrks);
			addColumnPathMap(AcXfrAct_Chk03_HdrR.$trd_rmrks, AcXfrActIF_HdrR.$trd_rmrks);
			addColumnPathMap(AcXfrAct_Chk03_HdrR.$prnt_flg, AcXfrActIF_HdrR.$prnt_flg);
			addColumnPathMap(AcXfrAct_Chk03_HdrR.$sub_char1, AcXfrActIF_HdrR.$sub_char1);
			addColumnPathMap(AcXfrAct_Chk03_HdrR.$sub_char2, AcXfrActIF_HdrR.$sub_char2);
			addColumnPathMap(AcXfrAct_Chk03_HdrR.$sub_char3, AcXfrActIF_HdrR.$sub_char3);
			addColumnPathMap(AcXfrAct_Chk03_HdrR.$data_crud_typ, AcXfrActIF_HdrR.$data_crud_typ);
			addColumnPathMap(AcXfrAct_Chk03_HdrR.$err_flg, AcXfrActIF_HdrR.$err_flg);
			addColumnPathMap(AcXfrAct_Chk03_HdrR.$peg_no, AcXfrActIF_HdrR.$peg_no);
			addColumnPathMap(AcXfrAct_Chk03_HdrR.$hdr_dtl_peg, AcXfrActIF_HdrR.$hdr_dtl_peg_no);

		}
	}

	// mcframe.serverMSBE.MSBEL6400.AcXfrAct_Chk03_DtlR
	// mcframe.serverMSBE.MSBEL6410.AcXfrActIF_DtlR
	protected Map_AcXfrAct_Chk03_DtlR_AcXfrActIF_DtlR<AcXfrAct_Chk03_DtlR,AcXfrActIF_DtlR> createMap_AcXfrAct_Chk03_DtlR_AcXfrActIF_DtlR() {
		return new Map_AcXfrAct_Chk03_DtlR_AcXfrActIF_DtlR<AcXfrAct_Chk03_DtlR, AcXfrActIF_DtlR>();
	}

	public class Map_AcXfrAct_Chk03_DtlR_AcXfrActIF_DtlR<D extends AcXfrAct_Chk03_DtlR, S extends AcXfrActIF_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$abort_flg, AcXfrActIF_DtlR.$abort_flg);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$pr_sts_typ, AcXfrActIF_DtlR.$pr_sts_typ);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$itm_cd, AcXfrActIF_DtlR.$itm_cd);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$itm_sub1, AcXfrActIF_DtlR.$itm_sub1);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$itm_sub2, AcXfrActIF_DtlR.$itm_sub2);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$itm_sub3, AcXfrActIF_DtlR.$itm_sub3);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$itm_nm, AcXfrActIF_DtlR.$itm_nm);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$crt_lot_flg, AcXfrActIF_DtlR.$crt_lot_flg);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$lot_no, AcXfrActIF_DtlR.$lot_no);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$sublot_no, AcXfrActIF_DtlR.$sublot_no);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$ver_no, AcXfrActIF_DtlR.$ver_no);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$trd_unit_cd, AcXfrActIF_DtlR.$trd_unit_cd);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$trd_unit_qty, AcXfrActIF_DtlR.$trd_unit_qty);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$base_unit_cd, AcXfrActIF_DtlR.$base_unit_cd);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$base_unit_qty, AcXfrActIF_DtlR.$base_unit_qty);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$pack_unit_cd, AcXfrActIF_DtlR.$pack_unit_cd);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$pack_unit_qty, AcXfrActIF_DtlR.$pack_unit_qty);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$str_ln_cd, AcXfrActIF_DtlR.$str_ln_cd);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$bd_dpt_cd, AcXfrActIF_DtlR.$bd_dpt_cd);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$stk_arrv_bp_cd, AcXfrActIF_DtlR.$stk_arrv_bp_cd);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$quality_typ, AcXfrActIF_DtlR.$quality_typ);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$stk_insp_typ, AcXfrActIF_DtlR.$stk_insp_typ);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$stk_id_typ, AcXfrActIF_DtlR.$stk_id_typ);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$gd_cd, AcXfrActIF_DtlR.$gd_cd);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$stk_bp_cd, AcXfrActIF_DtlR.$stk_bp_cd);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$sno1, AcXfrActIF_DtlR.$sno1);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$sno2, AcXfrActIF_DtlR.$sno2);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$sno3, AcXfrActIF_DtlR.$sno3);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$sno4, AcXfrActIF_DtlR.$sno4);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$fix_no_typ, AcXfrActIF_DtlR.$fix_no_typ);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$fix_no, AcXfrActIF_DtlR.$fix_no);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$bd_loc_cd, AcXfrActIF_DtlR.$bd_loc_cd);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$bd_ctg_cd, AcXfrActIF_DtlR.$bd_ctg_cd);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$bd_oper_cd, AcXfrActIF_DtlR.$bd_oper_cd);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$bd_bp_cd, AcXfrActIF_DtlR.$bd_bp_cd);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$bd_itm_cd, AcXfrActIF_DtlR.$bd_itm_cd);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$bd_itm_sub1, AcXfrActIF_DtlR.$bd_itm_sub1);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$bd_itm_sub2, AcXfrActIF_DtlR.$bd_itm_sub2);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$bd_itm_sub3, AcXfrActIF_DtlR.$bd_itm_sub3);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$bd_lot_no, AcXfrActIF_DtlR.$bd_lot_no);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$bd_sublot_no, AcXfrActIF_DtlR.$bd_sublot_no);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$bd_sno1, AcXfrActIF_DtlR.$bd_sno1);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$bd_sno2, AcXfrActIF_DtlR.$bd_sno2);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$bd_sno3, AcXfrActIF_DtlR.$bd_sno3);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$bd_sno4, AcXfrActIF_DtlR.$bd_sno4);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$intr_d_rmrks, AcXfrActIF_DtlR.$intr_d_rmrks);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$trd_d_rmrks, AcXfrActIF_DtlR.$trd_d_rmrks);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$dspsl_no, AcXfrActIF_DtlR.$dspsl_no);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$acxfr_schd_no, AcXfrActIF_DtlR.$acxfr_schd_no);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$acxfr_inst_d_no, AcXfrActIF_DtlR.$acxfr_inst_d_no);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$acxfr_act_d_no, AcXfrActIF_DtlR.$acxfr_act_d_no);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$aprv_flg, AcXfrActIF_DtlR.$aprv_flg);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$aprv_no, AcXfrActIF_DtlR.$aprv_no);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$aprv_sts_typ, AcXfrActIF_DtlR.$aprv_sts_typ);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$disp_seq, AcXfrActIF_DtlR.$disp_seq);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$sub_char1, AcXfrActIF_DtlR.$sub_char1);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$sub_char2, AcXfrActIF_DtlR.$sub_char2);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$sub_char3, AcXfrActIF_DtlR.$sub_char3);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$acxfr_act_no, AcXfrActIF_DtlR.$acxfr_act_no);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$acxfr_act_rev, AcXfrActIF_DtlR.$acxfr_act_rev);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$loc_cd, AcXfrActIF_DtlR.$loc_cd);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$rsn_cd, AcXfrActIF_DtlR.$rsn_cd);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$stk_mng_typ, AcXfrActIF_DtlR.$stk_mng_typ);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$asset_mng_typ, AcXfrActIF_DtlR.$asset_mng_typ);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$in_xfr_typ, AcXfrActIF_DtlR.$in_xfr_typ);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$io_schd_pr_no, AcXfrActIF_DtlR.$io_schd_pr_no);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$ac_dt, AcXfrActIF_DtlR.$ac_dt);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$trd_ptn_typ, AcXfrActIF_DtlR.$trd_ptn_typ);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$sundry_itm_flg, AcXfrActIF_DtlR.$sundry_itm_flg);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$inst_base_unit_qty, AcXfrActIF_DtlR.$inst_base_unit_qty);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$schd_base_unit_qty, AcXfrActIF_DtlR.$schd_base_unit_qty);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$data_crud_typ, AcXfrActIF_DtlR.$data_crud_typ);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$err_flg, AcXfrActIF_DtlR.$err_flg);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$peg_no, AcXfrActIF_DtlR.$peg_no);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$hdr_dtl_peg, AcXfrActIF_DtlR.$hdr_dtl_peg_no);

		}
	}
	


	// キャッシュ	
	protected static final Class<MSBEL_AcXfrActRcptIFService> CLAZZ = MSBEL_AcXfrActRcptIFService.class;
	protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _itmUnitCache = null;
	protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache = null;

	/**
	 * MAM_ITMキャッシュ
	 */
	protected static void initItmCache(MCList<AcXfrActIF_DtlR> dtlL) {
		object(CLAZZ)._initItmCache(dtlL);
	}
	protected void _initItmCache(MCList<?> dtlL) {
		MAM_ITM_R t = MAM_ITM_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(dbc_bldr, dtlL,
				MAM_ITM_R.$itm_cd,
				MAM_ITM_R.$itm_sub1,
				MAM_ITM_R.$itm_sub2,
				MAM_ITM_R.$itm_sub3);
	}
	protected static FXUCL_MCDbcCache<MAM_ITM_R> getItmCache() {
		if (object(CLAZZ)._itmCache == null) {
			object(CLAZZ)._initItmCache(MCList.create(MCRow.class));
		}
		return object(CLAZZ)._itmCache;
	}
	protected static MAM_ITM_R getItmR(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
		return getItmCache().get(itmCd, itmSub1, itmSub2, itmSub3);
	}
	
	/**
	 * MAVM_ITM_UNITキャッシュ
	 */
	protected void _initItmUnitCache() {
		MAVM_ITM_UNIT_R t = MAVM_ITM_UNIT_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3, t.unit_cd, t.pack_flg, t.conv_base_qty, t.conv_qty, t.dec_place, t.rnd_typ);
		_itmUnitCache = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(dbc_bldr);
	}
	protected static FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> getItmUnitCache() {
		if (object(CLAZZ)._itmUnitCache == null) {
			object(CLAZZ)._initItmUnitCache();
		}
		return object(CLAZZ)._itmUnitCache;
	}
	protected static MAVM_ITM_UNIT_R getItmUnitR(String itmCd, String itmSub1, String itmSub2, String itmSub3, String unitCd) {
		return getItmUnitCache().get(itmCd, itmSub1, itmSub2, itmSub3, unitCd);
	}
	
	protected String _defGdCd = null;
	protected String getDefGdCd() {
		if (isNull(_defGdCd)) {
			MAM_STK_GD_R t = MAM_STK_GD_R.create("T");
			MAM_STK_GD_R S1W = MAM_STK_GD_R.create("W");
			MAM_STK_GD_R dbc = MAM_STK_GD_R.create();
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.gd_cd);
			dbc_bldr.setWhere(t.sort_seq.eq(subQuery() .select(min(S1W.sort_seq)) .from(S1W)));
			dbSelect("MSBEL6410_MAM_STK_GD_S01", dbc, dbc_bldr);
			_defGdCd = dbc.gd_cd();
		}
		return _defGdCd;
	}

	protected FXUCL_MCDbcCache<MAM_LOC_R> _locCache = null;
	protected void initLocCache(MCList<AcXfrActIF_DtlR> dtlL) {
		MCList<MAM_LOC_R> dbc = MCList.create(MAM_LOC_R.class);
		MAM_LOC_R t = MAM_LOC_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.sppl_cd);
		_locCache = new FXUCL_MCDbcCache<MAM_LOC_R>(dbc, dbc_bldr, dtlL, AcXfrActIF_DtlR.$loc_cd);
	}
	protected MAM_LOC_R getLocR(String locCd) {
		return _locCache.get(locCd);
	}

	//FMCB CUSTOM END
}