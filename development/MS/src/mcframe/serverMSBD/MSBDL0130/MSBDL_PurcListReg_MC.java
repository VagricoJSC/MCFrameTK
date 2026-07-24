package mcframe.serverMSBD.MSBDL0130;

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
import mcframe.serverMSBD.MSBDL0130.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBD.MSBDL0130.Query.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
import static mcframe.serverMAUC.MAUCL1110.MAUCL_DptUtil.*;
import mcframe.serverMSBD.MSBDL5040.MSBDL_PurcUtil;
import mcframe.serverMSBD.MSBDL5180.*;
import mcframe.serverMSUC.MSUCL0020.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import mcframe.serverFXUC.FXUCL0170.FXUCL_BeforeTodayValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_PositiveValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_TooManyInputsValidater;
import mcframe.commonCore.param.MCParam;
import java.util.*;
import static mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil.*;
import static mcframe.serverMSBD.MSBDL5040.MSBDL_PurcUtil.*;
import static mcframe.commonCore.container.MCRow.Status.*;
import mcframe.serverMSBF.MSBFL5210.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBDL_PurcListReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBDL_PurcListReg_MC extends MSBDL_PurcListReg_MC_A{
	//FMCB CUSTOM START
	protected static final String SRCH_MODE_DTL = "DTL";

	/**
	 * Chk01オペレーション.<p>
	 *
	 */
	public class Chk01 extends MSBDL_PurcListReg_MC_A.Chk01 {
		protected FXUCL_MCDbcCache<MST_ARR_SCHD_R> _arrSchdCache = null;
		
		protected MCOperation _caller = null;
		
		@Override
		protected void call() {
			super.call();
		}
		

		@Override
		protected boolean isSetListLogicValue(MCNumber paramIndex, MCRow row, String column) {
			if (isSame(paramIndex, 0)) {
				// 諸口品の場合は品名補完しない
				if (isSame(column, RsltR.$itm_nm)) {
					if (row.getBoolean(RsltR.$sundry_itm_flg)) {
						return false;
					}
				}
			}
			return super.isSetListLogicValue(paramIndex, row, column);
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			
			expandErrToHdr();

			editUp();
			
			callPurcChk();
			setErrToRtnStsTyp();
			expandErrToHdr();

			setDown();
		}
		
		protected void expandErrToHdr() {
			if (!hasErr()) {
				return;
			}
			//エラーをヘッダ単位に展開する			
			MCList<RsltR> up = up0().subList(r -> !isNull(r.rcpt_iv_mng_no()));
			expandErrToDtl(new String[]{
					MST_PURC_ACT_R.$rcpt_iv_mng_no
				}, up);
			
			MCList<RsltR> upx = up0().shallowClone();
			upx.removeAll(up);
			if (_caller instanceof MSBDL_PurcListReg.Ins01) {
				expandErrToDtl(getHdrGrpCols(), upx);
			}
			else  {
				expandErrToDtl(new String[]{
					MST_PURC_ACT_R.$purc_act_no
				}, upx);
			}
		}
		
		protected void chkDpt(MCList<RsltR> up0) {
			setDpt(up0, RsltR.$purc_dpt_cd, RsltR.$ac_dt);
			setDpt(up0, RsltR.$ap_dpt_cd, RsltR.$ac_dt);
			setDpt(up0, RsltR.$bd_dpt_cd, RsltR.$ac_dt);
		}
		
		/**
		 * 同一グループ内でエラーメッセージが設定されているRowがある場合に、<br>
		 * 他のRowでエラーメッセージが設定されていなくとも、<br>
		 * 同一ヘッダグループ内でエラーがあった旨のメッセージを設定します。
		 * @param grp グループキー
		 * @param l 電文リスト
		 */
		protected void expandErrToDtl(String[] grp, MCList<RsltR> l) {
			if (grp == null || grp.length <= 0 || l == null) {
				return;
			}
			MCList<RsltR>[] gls = l.groupList(grp);
			
			// メッセージプールに格納されているCauseRow(エラーとなっている行)を取得する
			MCMessageList errl = MCMessagePool.getMessageList();
			MCList<MCRow> el = MCList.create(MCRow.class);
			errl.forEach(m -> {
				el.add(m.getCauseRow());
			});
			
			// グループ別のリスト毎にループ
			for (MCList<RsltR> gl : gls) {
				boolean hasErr = false;
				gl.addBooleanColumn("have_msg_flg"); // trueの場合エラーメッセージがある行を表す 
				for(RsltR r : gl) {
					if (hasMessage(r, el)) {
						hasErr = true;
						r.setBooleanNE("have_msg_flg", true);
					}
					else {
						// メッセージプールにcauseRowが設定されていない上り電文
						r.setBooleanNE("have_msg_flg", false);
					}
				}
				// 同一グループ内のリストで1つでもエラーがあれば、err_flgがfalseの行に対してもエラーメッセージを設定する。
				if (hasErr) {
					gl.forEach(r -> {
						if (!r.getBooleanNE("have_msg_flg")) {
							MCMessagePool.add(new MCMessage(r, null, MSBDL0134, toDispGUIIndex(r)));
							r.setBooleanNE("err_flg", true);
							r.setStringNE("rtn_sts_typ", MAC_RTN_STS_TYP.ERR.value());
						}
					});
				}
			}
		}
		
		/**
		 * メッセージプールから取得したCauseRowと、上り電文の行インデックスを比較し、<br>
		 * 一致した場合、エラーメッセージが設定されたチェック上り電文とみなし、trueを返します。<br>
		 * @param mr チェック上り電文
		 * @param el CauseRowのリスト
		 * @return エラーメッセージが設定されているチェック上り電文ならtrue
		 */
		protected boolean hasMessage(MCRow mr, MCList<MCRow> el) {
			for(MCRow e : el) {
				if (mr.getParamRowIndex() == e.getParamRowIndex()) {
					return true;
				}				
			}
			return false;
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			setDataCrudTyp();
			// 入荷進捗の行ロックと、更新カウンタチェック処理
			msgL.addAll(lockArrPrAndChkUpdCntr());
			// 受領インボイスの行ロックと、更新カウンタチェック処理
			msgL.addAll(lockRcptIvAndChkUpdCntr());
			if (!(_caller instanceof MSBDL_PurcListReg.Ins01)) {
				// 実績ヘッダの行ロックと、更新カウンタチェック処理
				msgL.addAll(lockPrActAndChkUpdCntr());
			}
			
			if (!msgL.isEmpty()) {
				return msgL;
			}
			createCache();
			// トランザクションデータの補完
			cmplUpParamInTranData();

			// 各負担項目ＮＯの存在チェック用のトランザクションデータを取得する
			getDataForExistChk(up0());
			
			chkDpt(up0());
			
			return msgL;
			
		}

		protected void setDataCrudTyp(){
			boolean isIns = _caller instanceof MSBDL_PurcListReg.Ins01;
			boolean isUpd = _caller instanceof MSBDL_PurcListReg.Upd01;
			boolean isDel = _caller instanceof MSBDL_PurcListReg.Del01;
			
			MCList<RsltR> up0 = getChkList(up0());
			
			if (up0.size() == 0) {
				return ;
			}
			
			up0.forEach(r-> {
				if (isIns) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else if (isUpd) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
				else if (isDel) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				
			});
			
		}
		
		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {

			up0().forEach(dest -> {
				if (!dest.xpns_purc_flg()) {
					dest.bd_bp_cd(null);
					dest.bd_ctg_cd(null);
					dest.bd_dpt_cd(null);
					dest.bd_itm_cd(null);
					dest.bd_itm_sub1(null);
					dest.bd_itm_sub2(null);
					dest.bd_itm_sub3(null);
					dest.bd_iv_no(null);
					dest.bd_loc_cd(null);
					dest.bd_lot_no(null);
					dest.bd_oper_cd(null);
					dest.bd_po_no(null);
					dest.bd_slo_no(null);
					dest.bd_sno1(null);
					dest.bd_sno2(null);
					dest.bd_sno3(null);
					dest.bd_sno4(null);
					dest.bd_sublot_no(null);
					dest.bd_wg_cd(null);
				}
			});
		}
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			
			MCList<RsltR> up0 = getChkList(up0());
			
			// 更新データのDACチェック処理
			up0.forEach(r ->{
					if(!isNull(r.old_purc_dpt_cd()) && !isSame(r.old_purc_dpt_cd(), r.purc_dpt_cd())) {
						msgL.addAll(checkWritableDptCdDac(r, RsltR.$old_purc_dpt_cd));
					}
					msgL.addAll(checkWritableDptCdDac(r, RsltR.$purc_dpt_cd));
			});
			// 条件付チェック
			msgL.addAll(checkInCnd(up0));
			
			msgL.addAll(existBdCheck(up0));
			
			if (!(_caller instanceof MSBDL_PurcListReg.Del01)) {
				msgL.addAll(checkDtlSub(up0));
			}

			compSub(up0);
		
			return msgL;
		}

		protected MCMessageList checkDtlSub(MCList<RsltR> dtlL) {

			MCMessageList msgL = new MCMessageList();

			for (RsltR dtlR : dtlL) {
				if (isNull(dtlR.arr_act_no()) && !dtlR.sync_flg() && dtlR.accpt_dfct_flg()) {
					msgL.add(new MCMessage(dtlR, null, MSBDL0152, dtlR.po_d_no(), toDispGUIIndex(dtlR)));
				}
				// 経費購買の場合、資産管理しない品目しか登録できない
				if (MAC_TRD_PTN_TYP.isPURC_XPNS(dtlR.trd_ptn_typ()) && MAC_ASSET_MNG_TYP.isMNG(dtlR.asset_mng_typ())) {
					msgL.add(new MCMessage(dtlR, null, MSBDL0149, toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()),
							toDispGUIIndex(dtlR)));
				}
				// 資産管理する品目に経費理由を設定できない
				if (MAC_ASSET_MNG_TYP.isMNG(dtlR.asset_mng_typ()) && dtlR.xpns_purc_flg()) {
					msgL.add(new MCMessage(dtlR, null, MSBDL0150, toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()),
							dtlR.purc_rsn_cd(), toDispGUIIndex(dtlR)));
				}
				// 資産管理しない品目には経費理由しか設定できない
				if (MAC_ASSET_MNG_TYP.isNOT_MNG(dtlR.asset_mng_typ()) && !dtlR.xpns_purc_flg()) {
					msgL.add(new MCMessage(dtlR, null, MSBDL0151, toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()),
							dtlR.purc_rsn_cd(), toDispGUIIndex(dtlR)));
				}
				if (dtlR.re_arr_flg() && dtlR.subcon_flg()
						&& !dtlR.re_arr_rqst_tm().eqDate(dtlR.re_arr_purc_schd_dt())) {
					msgL.add(new MCMessage(MSBDL0201, toDispGUIIndex(dtlR)));
				}
			}

			msgL.addAll(check(dtlL, new String[]{RsltR.$accpt_dfct_flg, RsltR.$ncv_flg},
					new FXUCL_TooManyInputsValidater()));
			
			return msgL;
		}

		/**
		 * 負担項目の各種ＮＯの存在チェックを行います。
		 * @param dtlL 明細上り電文リスト(新規、または更新)
		 * @return メッセージリスト
		 */
		protected MCMessageList existBdCheck(MCList<RsltR> dtlL) {
			MCMessageList msgL = new MCMessageList();
			MCList<RsltR> bdLotChkTgtL = MCList.create(RsltR.class);
					
			for (RsltR dr : dtlL) {
				if (dr.getStatus() == DELETE) {
					continue;
				}
				if (!isNull(dr.bd_po_no())) {
					if (!existsPoNo(dr.bd_po_no())) {
						msgL.add(new MCMessage(dr, RsltR.$bd_po_no, MSBDL0175, dr.bd_po_no(), toDispGUIIndex(dr)));
					}
				}
				if (!isNull(dr.bd_slo_no())) {
					if (!existsSloNo(dr.bd_slo_no())) {
						msgL.add(new MCMessage(dr, RsltR.$bd_slo_no, MSBDL0177, dr.bd_slo_no(), toDispGUIIndex(dr)));
					}
				}
				if (!isNull(dr.bd_lot_no()) && !isNull(dr.bd_itm_cd())) {
					bdLotChkTgtL.add(dr);
				}
				if (!isNull(dr.bd_iv_no())) {
					if (!existsBdIvNo(dr.bd_iv_no())) {
						msgL.add(new MCMessage(dr, RsltR.$bd_iv_no, MSBDL0179, dr.bd_iv_no(), toDispGUIIndex(dr)));
					}
				}
				
			}		
			callLotServiceChkBdItm(bdLotChkTgtL);
			
			return msgL;
		}
		/**
		 * ロット存在チェックサービスを呼出し、負担ロットの存在チェックを行います。
		 * @param dtlL 明細上り電文リスト(新規、または更新)
		 */
		protected void callLotServiceChkBdItm(MCList<RsltR> dtlL) {
			if (dtlL.isEmpty()) {
				return;
			}		
			MSBFL_LotService.Lot_Chk03 ope = MSBFL_LotService.crtLot_Chk03();
			addAll(ope.up0(), dtlL, createMap_Lot_Chk03_CndR_RsltR());
			ope.exec();		
			copyErrFlg(dtlL, ope.up0());
		}
		protected void compSub(MCList<RsltR> up0 ) {

			setPegNo(up0);
			// 表示順
			setDispSeq(up0);

			// 在庫管理区分
			up0.forEach(r -> setStkMngTyp(r));
			
			// 基準単位・荷姿単位
			setBaseUnitQtyAndPackUnitQty(up0);
			
			complProcUpriAmt(up0);
			
			replaceParam();
		}
		
		/**
		 * トランザクションデータで上り電文の値を補完する
		 */
		protected void cmplUpParamInTranData() {
			MCList<MST_PO_R> po = MCList.create(MST_PO_R.class);
			MCList<MST_PO_D_R> pod = MCList.create(MST_PO_D_R.class);
			MCList<RsltR> up0 = up0();
			dbSelectKey("MSBDL0130_MST_PO_S01", po, MCQueryApiBuilder.create(MST_PO_R.create("T")), up0);
			MCJoinKey<MCList<MST_PO_R>> pk = up0.join(RsltR.$po_no, po, MST_PO_R.$po_no);

			MST_PO_D_R t1 = MST_PO_D_R.create("T1");
			MCQueryApiBuilder pod_bldr = MCQueryApiBuilder.create(t1);
			MST_ARR_PR_R t2 = MST_ARR_PR_R.create("T2");
			MST_PURC_SCHD_R t3 = MST_PURC_SCHD_R.create("T3");
			MST_ARR_SCHD_R t4 = MST_ARR_SCHD_R.create("T4");
			pod_bldr.addSelect(t3.purc_schd_no, t3.arr_schd_no);
			pod_bldr.addInnerJoin(t2, bracket( t1.po_d_no.eq(t2.po_d_no)));
			pod_bldr.addInnerJoin(t3, bracket( t2.arr_pr_no.eq(t3.arr_pr_no)));
			pod_bldr.addInnerJoin(t4, bracket( t3.arr_schd_no.eq(t4.arr_schd_no)));
			pod_bldr.addWhereWithAnd(t3.purc_schd_no.eq(bind("purc_schd_no")));
			dbSelect("MSBDL0130_MST_PO_D_S01", pod, pod_bldr, up0);
			MCJoinKey<MCList<MST_PO_D_R>> pdk = up0.join(RsltR.$purc_schd_no, pod, "purc_schd_no");
			
			
			up0.forEach(r-> {
				if(!isNull(r.purc_act_no())) {
					MST_PURC_ACT_R pa = getPurcActCache().get(r.purc_act_no(), r.purc_act_seq());
					r.old_purc_dpt_cd(pa.purc_dpt_cd());
				}
				if (!isNull(r.po_no())) {
					
					MST_PO_R dbcPo = r.getJoinedRow(pk);
					if (dbcPo != null) {
						r.trd_cd(dbcPo.trd_cd());
						r.trd_ptn_typ(dbcPo.trd_ptn_typ());
						r.sppl_cd(dbcPo.sppl_cd());
					}
					
					MST_PO_D_R selectR = r.getJoinedRow(pdk);
					if (selectR != null) {
						r.purc_schd_no(selectR.getStringNE("PURC_SCHD_NO"));
						r.arr_schd_no(selectR.getStringNE("ARR_SCHD_NO"));
						
						r.mfg_loc_cd(selectR.mfg_loc_cd());
						r.bom_ptn(selectR.bom_ptn());
						r.rqst_avl_rqst_dt(selectR.rqst_avl_rqst_dt());
						
						
						r.itm_cd(selectR.itm_cd());
						r.itm_sub1(selectR.itm_sub1());
						r.itm_sub2(selectR.itm_sub2());
						r.itm_sub3(selectR.itm_sub3());
						r.maker_cd(selectR.maker_cd());
						r.sno1(selectR.sno1());
						r.sno2(selectR.sno2());
						r.sno3(selectR.sno3());
						r.sno4(selectR.sno4());
						r.dlv_cd(selectR.dlv_cd());
						r.drct_dlv_typ(selectR.drct_dlv_typ());
						r.sundry_itm_flg(selectR.sundry_itm_flg());
						if (!selectR.sundry_itm_flg()) {
							r.itm_nm(null);
							r.iv_itm_nm(null);
						}
						else {
							r.itm_nm(selectR.itm_nm());
							r.iv_itm_nm(selectR.iv_itm_nm());
							
						}
						r.sppl_itm_cd(selectR.sppl_itm_cd());
						r.sppl_itm_nm(selectR.sppl_itm_nm());
						
					}
				
				}
				else {
					// 計画外仕入
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
				}
			});
			
		}

		
		/**
		 * 仕入実績登録サービスの更新前チェック（共通）を実行する
		 */
		protected void callPurcChk() {
			MCList<RsltR> up0 = getChkList(up0());
			
			if (up0.size() == 0) {
				return ;
			}

			
			MSBDL_PurcActRegService.Purc_Chk01 cope = MSBDL_PurcActRegService.crtPurc_Chk01();
			
			addAll(cope.up1(), up0, createMap_Purc_Chk01_DtlR_RsltR());
			
			cope.exec();
			
			copyErrFlg(up0, cope.down0());
		}
		protected Map_Purc_Chk01_DtlR_RsltR<Purc_Chk01_DtlR,RsltR> createMap_Purc_Chk01_DtlR_RsltR() {
			return new Map_Purc_Chk01_DtlR_RsltR<Purc_Chk01_DtlR, RsltR>();
		}

		public class Map_Purc_Chk01_DtlR_RsltR<D extends Purc_Chk01_DtlR, S extends RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				
				addColumnPathMap(Purc_Chk01_DtlR.$po_no, RsltR.$po_no);
				addColumnPathMap(Purc_Chk01_DtlR.$wg_cd, RsltR.$purc_dpt_wg_cd);
				addColumnPathMap(Purc_Chk01_DtlR.$purc_dpt_cd, RsltR.$purc_dpt_cd);
				addColumnPathMap(Purc_Chk01_DtlR.$purc_usr_cd, RsltR.$purc_usr_cd);
				addColumnPathMap(Purc_Chk01_DtlR.$po_d_no, RsltR.$po_d_no);
				addColumnPathMap(Purc_Chk01_DtlR.$rcpt_iv_d_no, RsltR.$rcpt_iv_d_no);
				addColumnPathMap(Purc_Chk01_DtlR.$peg_no,RsltR.$peg_no);
				addColumnPathMap(Purc_Chk01_DtlR.$data_crud_typ,RsltR.$data_crud_typ);
				addColumnPathMap(Purc_Chk01_DtlR.$arr_ptn_typ,RsltR.$arr_ptn_typ);
				addColumnPathMap(Purc_Chk01_DtlR.$purc_act_d_no,RsltR.$purc_act_d_no);
				addColumnPathMap(Purc_Chk01_DtlR.$purc_act_d_seq,RsltR.$purc_act_d_seq);
				addColumnPathMap(Purc_Chk01_DtlR.$purc_act_no,RsltR.$purc_act_no);
				addColumnPathMap(Purc_Chk01_DtlR.$purc_act_seq,RsltR.$purc_act_seq);
				addColumnPathMap(Purc_Chk01_DtlR.$ac_dt,RsltR.$ac_dt);
				addColumnPathMap(Purc_Chk01_DtlR.$xrate,RsltR.$xrate);
				addColumnPathMap(Purc_Chk01_DtlR.$ptax_dt,RsltR.$ptax_dt);
				addColumnPathMap(Purc_Chk01_DtlR.$ptax_xrate,RsltR.$ptax_xrate);
				addColumnPathMap(Purc_Chk01_DtlR.$pay_basis_dt,RsltR.$pay_basis_dt);
				addColumnPathMap(Purc_Chk01_DtlR.$pay_schd_dt,RsltR.$pay_schd_dt);
				addColumnPathMap(Purc_Chk01_DtlR.$purc_schd_no,RsltR.$purc_schd_no);
				addColumnPathMap(Purc_Chk01_DtlR.$purc_dt, RsltR.$purc_dt);
				addColumnPathMap(Purc_Chk01_DtlR.$arr_schd_no, RsltR.$arr_schd_no);
				addColumnPathMap(Purc_Chk01_DtlR.$rcpt_iv_no, RsltR.$rcpt_iv_no);
				addColumnPathMap(Purc_Chk01_DtlR.$rcpt_iv_mng_no, RsltR.$rcpt_iv_mng_no);
				addColumnPathMap(Purc_Chk01_DtlR.$sync_flg, RsltR.$sync_flg);
				addColumnPathMap(Purc_Chk01_DtlR.$arr_act_no, RsltR.$arr_act_no);
				addColumnPathMap(Purc_Chk01_DtlR.$gi_loc_cd, Purc_Chk01_DtlR.$gi_loc_cd);
				addColumnPathMap(Purc_Chk01_DtlR.$gi_wg_cd, Purc_Chk01_DtlR.$gi_wg_cd);
				addColumnPathMap(Purc_Chk01_DtlR.$gi_str_ln_cd, Purc_Chk01_DtlR.$gi_str_ln_cd);
				addColumnPathMap(Purc_Chk01_DtlR.$gi_unit_cd, Purc_Chk01_DtlR.$gi_unit_cd);
				addColumnPathMap(Purc_Chk01_DtlR.$from_gd_cd, Purc_Chk01_DtlR.$from_gd_cd);
				addColumnPathMap(Purc_Chk01_DtlR.$mfg_inst_no,RsltR.$mfg_inst_no);
				addColumnPathMap(Purc_Chk01_DtlR.$itm_cd,RsltR.$itm_cd);
				addColumnPathMap(Purc_Chk01_DtlR.$itm_sub1,RsltR.$itm_sub1);
				addColumnPathMap(Purc_Chk01_DtlR.$itm_sub2,RsltR.$itm_sub2);
				addColumnPathMap(Purc_Chk01_DtlR.$itm_sub3,RsltR.$itm_sub3);
				addColumnPathMap(Purc_Chk01_DtlR.$ver_no,RsltR.$ver_no);
				addColumnPathMap(Purc_Chk01_DtlR.$itm_nm,RsltR.$itm_nm);
				addColumnPathMap(Purc_Chk01_DtlR.$iv_itm_nm,RsltR.$iv_itm_nm);
				addColumnPathMap(Purc_Chk01_DtlR.$sppl_itm_cd,RsltR.$sppl_itm_cd);
				addColumnPathMap(Purc_Chk01_DtlR.$sppl_itm_nm,RsltR.$sppl_itm_nm);
				addColumnPathMap(Purc_Chk01_DtlR.$sundry_itm_flg,RsltR.$sundry_itm_flg);
				addColumnPathMap(Purc_Chk01_DtlR.$dscnt_rsn_cd,RsltR.$dscnt_rsn_cd);
				addColumnPathMap(Purc_Chk01_DtlR.$trd_unit_cd,RsltR.$trd_unit_cd);
				addColumnPathMap(Purc_Chk01_DtlR.$trd_unit_qty,RsltR.$trd_unit_qty);
				addColumnPathMap(Purc_Chk01_DtlR.$base_unit_cd,RsltR.$base_unit_cd);
				addColumnPathMap(Purc_Chk01_DtlR.$base_unit_qty,RsltR.$base_unit_qty);
				addColumnPathMap(Purc_Chk01_DtlR.$interim_flg,RsltR.$interim_flg);
				addColumnPathMap(Purc_Chk01_DtlR.$trd_cur_upri,RsltR.$trd_cur_upri);
				addColumnPathMap(Purc_Chk01_DtlR.$trd_cur_proc_upri,RsltR.$trd_cur_proc_upri);
				addColumnPathMap(Purc_Chk01_DtlR.$trd_cur_onr_prov_upri,RsltR.$trd_cur_onr_prov_upri);
				addColumnPathMap(Purc_Chk01_DtlR.$dscnt_rsn_cd,RsltR.$dscnt_rsn_cd);
				addColumnPathMap(Purc_Chk01_DtlR.$trd_cur_dscnt_amt,RsltR.$trd_cur_dscnt_amt);
				addColumnPathMap(Purc_Chk01_DtlR.$trd_cur_amt,RsltR.$trd_cur_amt);
				addColumnPathMap(Purc_Chk01_DtlR.$trd_cur_proc_amt,RsltR.$trd_cur_proc_amt);
				addColumnPathMap(Purc_Chk01_DtlR.$trd_cur_onr_prov_amt,RsltR.$trd_cur_onr_prov_amt);
				addColumnPathMap(Purc_Chk01_DtlR.$tax_cd,RsltR.$tax_cd);
				addColumnPathMap(Purc_Chk01_DtlR.$ptax_cur_upri,RsltR.$ptax_cur_upri);
				addColumnPathMap(Purc_Chk01_DtlR.$ptax_cur_amt,RsltR.$ptax_cur_amt);
				addColumnPathMap(Purc_Chk01_DtlR.$trd_cur_tax_amt,RsltR.$trd_cur_tax_amt);
				addColumnPathMap(Purc_Chk01_DtlR.$ptax_cur_tax_amt,RsltR.$ptax_cur_tax_amt);
				addColumnPathMap(Purc_Chk01_DtlR.$base_cur_tax_amt,RsltR.$base_cur_tax_amt);
				addColumnPathMap(Purc_Chk01_DtlR.$base_cur_upri,RsltR.$base_cur_upri);
				addColumnPathMap(Purc_Chk01_DtlR.$base_cur_proc_upri,RsltR.$base_cur_proc_upri);
				addColumnPathMap(Purc_Chk01_DtlR.$base_cur_onr_prov_upri,RsltR.$base_cur_onr_prov_upri);
				addColumnPathMap(Purc_Chk01_DtlR.$base_cur_dscnt_amt,RsltR.$base_cur_dscnt_amt);
				addColumnPathMap(Purc_Chk01_DtlR.$base_cur_amt,RsltR.$base_cur_amt);
				addColumnPathMap(Purc_Chk01_DtlR.$base_cur_proc_amt,RsltR.$base_cur_proc_amt);
				addColumnPathMap(Purc_Chk01_DtlR.$base_cur_onr_prov_amt,RsltR.$base_cur_onr_prov_amt);
				addColumnPathMap(Purc_Chk01_DtlR.$ptax_cur_proc_upri,RsltR.$ptax_cur_proc_upri);
				addColumnPathMap(Purc_Chk01_DtlR.$ptax_cur_onr_prov_upri,RsltR.$ptax_cur_onr_prov_upri);
				addColumnPathMap(Purc_Chk01_DtlR.$ptax_cur_dscnt_amt,RsltR.$ptax_cur_dscnt_amt);
				addColumnPathMap(Purc_Chk01_DtlR.$ptax_cur_proc_amt,RsltR.$ptax_cur_proc_amt);
				addColumnPathMap(Purc_Chk01_DtlR.$ptax_cur_onr_prov_amt,RsltR.$ptax_cur_onr_prov_amt);
				addColumnPathMap(Purc_Chk01_DtlR.$tax_rate,RsltR.$tax_rate);
				addColumnPathMap(Purc_Chk01_DtlR.$wtax_rate,RsltR.$wtax_rate);
				addColumnPathMap(Purc_Chk01_DtlR.$wtax_amt,RsltR.$wtax_amt);
				addColumnPathMap(Purc_Chk01_DtlR.$abort_flg,RsltR.$abort_flg);
				addColumnPathMap(Purc_Chk01_DtlR.$re_arr_flg,RsltR.$re_arr_flg);
				addColumnPathMap(Purc_Chk01_DtlR.$re_arr_sync_flg,RsltR.$re_arr_sync_flg);
				addColumnPathMap(Purc_Chk01_DtlR.$base_unit_re_arr_qty,RsltR.$base_unit_re_arr_qty);
				addColumnPathMap(Purc_Chk01_DtlR.$re_arr_purc_schd_dt,RsltR.$re_arr_purc_schd_dt);
				addColumnPathMap(Purc_Chk01_DtlR.$re_arr_rqst_tm,RsltR.$re_arr_rqst_tm);
				addColumnPathMap(Purc_Chk01_DtlR.$trd_unit_re_arr_qty,RsltR.$trd_unit_re_arr_qty);
				addColumnPathMap(Purc_Chk01_DtlR.$accpt_dfct_flg, RsltR.$accpt_dfct_flg);
				addColumnPathMap(Purc_Chk01_DtlR.$re_arr_loc_cd, RsltR.$re_arr_loc_cd);
				addColumnPathMap(Purc_Chk01_DtlR.$re_arr_loc_wg_cd, RsltR.$re_arr_loc_wg_cd);
				addColumnPathMap(Purc_Chk01_DtlR.$re_arr_str_ln_cd, RsltR.$re_arr_str_ln_cd);
				addColumnPathMap(Purc_Chk01_DtlR.$ncv_flg,RsltR.$ncv_flg);
				addColumnPathMap(Purc_Chk01_DtlR.$maker_cd,RsltR.$maker_cd);
				addColumnPathMap(Purc_Chk01_DtlR.$ap_dpt_cd,RsltR.$ap_dpt_cd);
				addColumnPathMap(Purc_Chk01_DtlR.$pay_crryovr_times,RsltR.$pay_crryovr_times);
				addColumnPathMap(Purc_Chk01_DtlR.$bd_itm_cd,RsltR.$bd_itm_cd);
				addColumnPathMap(Purc_Chk01_DtlR.$bd_itm_sub1,RsltR.$bd_itm_sub1);
				addColumnPathMap(Purc_Chk01_DtlR.$bd_itm_sub2,RsltR.$bd_itm_sub2);
				addColumnPathMap(Purc_Chk01_DtlR.$bd_itm_sub3,RsltR.$bd_itm_sub3);
				addColumnPathMap(Purc_Chk01_DtlR.$bd_sno1,RsltR.$bd_sno1);
				addColumnPathMap(Purc_Chk01_DtlR.$bd_sno2,RsltR.$bd_sno2);
				addColumnPathMap(Purc_Chk01_DtlR.$bd_sno3,RsltR.$bd_sno3);
				addColumnPathMap(Purc_Chk01_DtlR.$bd_sno4,RsltR.$bd_sno4);
				addColumnPathMap(Purc_Chk01_DtlR.$bd_lot_no,RsltR.$bd_lot_no);
				addColumnPathMap(Purc_Chk01_DtlR.$bd_sublot_no,RsltR.$bd_sublot_no);
				addColumnPathMap(Purc_Chk01_DtlR.$bd_ctg_cd,RsltR.$bd_ctg_cd);
				addColumnPathMap(Purc_Chk01_DtlR.$bd_oper_cd,RsltR.$bd_oper_cd);
				addColumnPathMap(Purc_Chk01_DtlR.$bd_iv_no,RsltR.$bd_iv_no);
				addColumnPathMap(Purc_Chk01_DtlR.$bd_loc_cd,RsltR.$bd_loc_cd);
				addColumnPathMap(Purc_Chk01_DtlR.$bd_po_no,RsltR.$bd_po_no);
				addColumnPathMap(Purc_Chk01_DtlR.$bd_slo_no,RsltR.$bd_slo_no);
				addColumnPathMap(Purc_Chk01_DtlR.$asset_mng_typ,RsltR.$asset_mng_typ);
				addColumnPathMap(Purc_Chk01_DtlR.$rsn_cd,RsltR.$purc_rsn_cd);
				addColumnPathMap(Purc_Chk01_DtlR.$xpns_po_flg,RsltR.$xpns_purc_flg);
				addColumnPathMap(Purc_Chk01_DtlR.$bd_dpt_cd,RsltR.$bd_dpt_cd);
				addColumnPathMap(Purc_Chk01_DtlR.$bd_wg_cd,RsltR.$bd_wg_cd);
				addColumnPathMap(Purc_Chk01_DtlR.$purc_cont_qty,RsltR.$purc_cont_qty);
				addColumnPathMap(Purc_Chk01_DtlR.$intr_rmrks,RsltR.$intr_rmrks);
				addColumnPathMap(Purc_Chk01_DtlR.$trd_rmrks,RsltR.$trd_rmrks);
				addColumnPathMap(Purc_Chk01_DtlR.$sub_char1,RsltR.$sub_char1);
				addColumnPathMap(Purc_Chk01_DtlR.$sub_char2,RsltR.$sub_char2);
				addColumnPathMap(Purc_Chk01_DtlR.$sub_char3,RsltR.$sub_char3);
				addColumnPathMap(Purc_Chk01_DtlR.$intr_d_rmrks,RsltR.$intr_d_rmrks);
				addColumnPathMap(Purc_Chk01_DtlR.$trd_d_rmrks,RsltR.$trd_d_rmrks);
				addColumnPathMap(Purc_Chk01_DtlR.$sub_d_char1,RsltR.$dtl_sub_char1);
				addColumnPathMap(Purc_Chk01_DtlR.$sub_d_char2,RsltR.$dtl_sub_char2);
				addColumnPathMap(Purc_Chk01_DtlR.$sub_d_char3,RsltR.$dtl_sub_char3);
				addColumnPathMap(Purc_Chk01_DtlR.$gd_cd,RsltR.$gd_cd);
				addColumnPathMap(Purc_Chk01_DtlR.$sno1,RsltR.$sno1);
				addColumnPathMap(Purc_Chk01_DtlR.$sno2,RsltR.$sno2);
				addColumnPathMap(Purc_Chk01_DtlR.$sno3,RsltR.$sno3);
				addColumnPathMap(Purc_Chk01_DtlR.$sno4,RsltR.$sno4);
				addColumnPathMap(Purc_Chk01_DtlR.$in_to_loc_cd,RsltR.$in_to_loc_cd);
				addColumnPathMap(Purc_Chk01_DtlR.$in_to_loc_wg_cd,RsltR.$in_to_loc_wg_cd);
				addColumnPathMap(Purc_Chk01_DtlR.$str_ln_cd,RsltR.$str_ln_cd);
				addColumnPathMap(Purc_Chk01_DtlR.$crt_lot_flg, RsltR.$crt_lot_flg);
				addColumnPathMap(Purc_Chk01_DtlR.$lot_no,RsltR.$lot_no);
				addColumnPathMap(Purc_Chk01_DtlR.$sublot_no,RsltR.$sublot_no);
				addColumnPathMap(Purc_Chk01_DtlR.$quality_typ,RsltR.$quality_typ);
				addColumnPathMap(Purc_Chk01_DtlR.$stk_insp_typ,RsltR.$stk_insp_typ);
				addColumnPathMap(Purc_Chk01_DtlR.$stk_id_typ,RsltR.$stk_id_typ);
				addColumnPathMap(Purc_Chk01_DtlR.$stk_mng_typ,RsltR.$stk_mng_typ);
				addColumnPathMap(Purc_Chk01_DtlR.$bp_lot_no,RsltR.$bp_lot_no);
				addColumnPathMap(Purc_Chk01_DtlR.$bp_dlv_slip_no,RsltR.$bp_dlv_slip_no);
				addColumnPathMap(Purc_Chk01_DtlR.$bp_dlv_slip_d_no,RsltR.$bp_dlv_slip_d_no);
				addColumnPathMap(Purc_Chk01_DtlR.$ship_fr_valid_dt,RsltR.$slip_fr_valid_dt);
				addColumnPathMap(Purc_Chk01_DtlR.$disp_seq, RsltR.$disp_seq);
				addColumnPathMap(Purc_Chk01_DtlR.$can_ac_dt, RsltR.$can_ac_dt);
				addColumnPathMap(Purc_Chk01_DtlR.$tterm_cd1, RsltR.$tterm_cd1);
				addColumnPathMap(Purc_Chk01_DtlR.$tterm_cd2, RsltR.$tterm_cd2);
				addColumnPathMap(Purc_Chk01_DtlR.$tterm_cd3, RsltR.$tterm_cd3);
				addColumnPathMap(Purc_Chk01_DtlR.$tterm_rmrks1, RsltR.$tterm_rmrks1);
				addColumnPathMap(Purc_Chk01_DtlR.$tterm_rmrks2, RsltR.$tterm_rmrks2);
				addColumnPathMap(Purc_Chk01_DtlR.$tterm_rmrks3, RsltR.$tterm_rmrks3);

			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
			}
		}
		/**
		 * 下り電文セット
		 */
		protected void setDown() {
			// チェックで補完した結果を返す
			down0().setAll(up0());
		}
		
		/**
		 * 仕入実績ヘッダの排他制御を行う。
		 */
		protected MCMessageList lockPrActAndChkUpdCntr() {
			MCMessageList msgL = new MCMessageList();
			
			//大量件数の可能性があるためロック時に行の取得はせず、キャッシュを使用してチェックする。
			dbSelectKeyForUpdateNoWaitNoFetch("MSBDL0130_MST_PURC_ACT_S01",
					MCQueryApiBuilder.create(MST_PURC_ACT_R.create("T")), up0());
			initPurcActCache(up0());
			
			up0().forEach(dr -> {
				if (!dr.err_flg() && !isNull(dr.purc_act_no())) {
					MST_PURC_ACT_R pa = getPurcActCache().get(dr.purc_act_no(), dr.purc_act_seq());
					msgL.addAll(checkUpdCntrNE(dr, RsltR.$purc_act_upd_cntr, pa));
				}
			});
			return msgL;
		}
		
		/**
		 * 入荷進捗に対して行ロック処理、更新カウンタチェックを行う
		 * @param chkH ヘッダチェック用上り電文
		 * @param chkDtl 明細行チェック用上り電文
		 * @return メッセージリスト
		 */
		protected MCMessageList lockArrPrAndChkUpdCntr() {

			MCMessageList msgL = new MCMessageList();

			MCList<RsltR> tgt =up0().subList(r -> !isNull(r.arr_pr_no()));
			
			// 入荷進捗を行ロック処理
			MCList<MST_ARR_PR_R> dblArrPr = MCList.create(MST_ARR_PR_R.class);
			dbSelectKeyForUpdateNoWait("MSBDL0130_MST_ARR_PR_S01", dblArrPr,
					MCQueryApiBuilder.create(MST_ARR_PR_R.create("T")), tgt);
			MCIndexKey idxKey = dblArrPr.createIndex(MST_ARR_PR_R.$arr_pr_no);
			
			tgt.forEach(dr -> {
				// 更新カウンタチェック
				MST_ARR_PR_R lockR = dblArrPr.getFirst(idxKey, dr.arr_pr_no());
				msgL.addAll(checkUpdCntrNE(dr, RsltR.$arr_pr_upd_cntr, lockR));
			});
			setErrFlg(msgL);

			return msgL;
			
		}
		
		/**
		 * 受領インボイスに対して行ロック処理、更新カウンタチェックを行う
		 */
		protected MCMessageList lockRcptIvAndChkUpdCntr() {

			MCMessageList msgL = new MCMessageList();
			
			MCList<RsltR> tgt = up0().subList(r -> !isNull(r.rcpt_iv_mng_no()) && !r.err_flg());
			tgt.sort(RsltR.$rcpt_iv_mng_no);
			
			// 受領インボイスを行ロック処理
			MCList<MST_RCPT_IV_R> dbc = MCList.create(MST_RCPT_IV_R.class);
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MST_RCPT_IV_R.create("T"));
			dbc_bldr.setOrderByAsc(dbc_bldr.getBaseDbc().getKeyColumn$());
			dbSelectKeyForUpdateNoWait("MSBDL0130_MST_RCPT_IV_S01", dbc, dbc_bldr, tgt);
			MCIndexKey idxKey = dbc.createIndex(MST_RCPT_IV_R.$rcpt_iv_mng_no);
			
			tgt.forEach(dr -> {
				// 更新カウンタチェック
				MST_RCPT_IV_R lockR = dbc.getFirst(idxKey, dr.rcpt_iv_mng_no());
				msgL.addAll(checkUpdCntrNE(dr, RsltR.$rcpt_iv_upd_cntr, lockR));
			});
			setErrFlg(msgL);
			
			return msgL;
			
		}
		
		/**
		 * 条件付チェック
		 * @return メッセージリスト
		 */
		protected MCMessageList checkInCnd(MCList<RsltR> dtlL) {
			
			MCMessageList msgL = new MCMessageList();
			FXUCL_RequiredValidater rv = new FXUCL_RequiredValidater();
			for (RsltR dtlRow : dtlL) {
				
				// 「新規」と「更新」を対象に行う
				if (MAC_DATA_CRUD_TYP.isDEL(dtlRow.data_crud_typ())) {
					msgL.addAll(check(dtlRow, RsltR.$can_ac_dt, new FXUCL_BeforeTodayValidater()));
					continue;
				}
				
				if (!isNull(dtlRow.rcpt_iv_mng_no())) {

					msgL.addAll(check(dtlRow, RsltR.$rcpt_iv_mng_no, rv));
					if (dtlRow.pay_spot_flg()) {
						msgL.addAll(check(dtlRow, RsltR.$pay_schd_dt, rv));
						dtlRow.pay_basis_dt(null);
					}
					else {
						msgL.addAll(check(dtlRow, RsltR.$pay_basis_dt, rv));
						dtlRow.pay_schd_dt(null);
					}
				}
				
				if (MAC_ASSET_MNG_TYP.isNOT_MNG(dtlRow.asset_mng_typ())
						|| MAC_TRD_PTN_TYP.isPURC_XPNS(dtlRow.trd_ptn_typ()) 
						|| MAC_TRD_PTN_TYP.isPURC_DSCNT(dtlRow.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isPURC_DSCNT_XPNS(dtlRow.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isPURC_XTRA(dtlRow.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isPURC_XTRA_XPNS(dtlRow.trd_ptn_typ())) {
					// 理由ＣＤ
					msgL.addAll(check(dtlRow, RsltR.$purc_rsn_cd, rv));
				}
				if (dtlRow.xpns_purc_flg() && !dtlRow.accpt_dfct_flg()) {
					// 負担部門ＣＤ
					msgL.addAll(check(dtlRow, RsltR.$bd_dpt_cd, rv));
				}
				
				if (!isNull(dtlRow.trd_cur_dscnt_amt())) {
					// 値引理由の必須チェック
					msgL.addAll(check(dtlRow, RsltR.$dscnt_rsn_cd, rv));
					// 単価「0」指定で、値引額が入力されていないかチェック
					msgL.addAll(checkDscntAmt(dtlRow, RsltR.$trd_cur_upri, RsltR.$trd_cur_dscnt_amt));
				}

				// 無償や検収不良でない場合
				if (!dtlRow.accpt_dfct_flg() && !dtlRow.ncv_flg()) {
					msgL.addAll(check(dtlRow, RsltR.$pay_crryovr_times, new FXUCL_RequiredValidater()));
					msgL.addAll(check(dtlRow, RsltR.$trd_cur_dscnt_amt, new FXUCL_PositiveValidater()));
				}
				
				if (dtlRow.sync_flg() && !dtlRow.multi_io_flg()) {
					if (dtlRow.bp_lot_flg() ) {
						// 業者ロット
						msgL.addAll(check(dtlRow, RsltR.$bp_lot_no, new FXUCL_RequiredValidater()));
					}
					if (!MAC_LOT_MNG_TYP.isNOT_MNG(dtlRow.lot_mng_typ()) && MAC_LOT_NO_TYP.isMANUAL(dtlRow.lot_no_typ())) {
						// ロットＮＯ
						msgL.addAll(check(dtlRow, RsltR.$lot_no, rv));
					}
					if (!MAC_LOT_MNG_TYP.isNOT_MNG(dtlRow.sublot_mng_typ()) && MAC_LOT_NO_TYP.isMANUAL(dtlRow.sublot_no_typ())) {
						// サブロットＮＯ
						msgL.addAll(check(dtlRow, RsltR.$sublot_no, rv));
					}
				}

			}
			
			return msgL;
			
		}
		
		/**
		 * 基準単位数量・荷姿単位数量の補完処理
		 */
		protected void setBaseUnitQtyAndPackUnitQty(MCList<RsltR> dtlL) {
			
			// 明細の補完
			for (RsltR dtlRow : dtlL) {
				
				// 基準単位数量
				MCNumber baseUnitQty = convToBaseUnit(dtlRow.trd_unit_qty(), dtlRow.trd_unit_conv_base_qty(),	
						dtlRow.trd_unit_conv_qty(), dtlRow.base_unit_dec_place(), dtlRow.base_unit_rnd_typ());
				dtlRow.base_unit_qty(baseUnitQty);
				
				// 基準単位再入荷数量
				if (dtlRow.re_arr_flg()) {
					MCNumber baseUnitReArrQty = convToBaseUnit(dtlRow.trd_unit_re_arr_qty(), dtlRow.trd_unit_conv_base_qty(),	
							dtlRow.trd_unit_conv_qty(), dtlRow.base_unit_dec_place(), dtlRow.base_unit_rnd_typ());
					dtlRow.base_unit_re_arr_qty(baseUnitReArrQty);
				}	
			}
			
			
		}
		protected void replaceParam() {
			if (!(_caller instanceof MSBDL_PurcListReg.Ins01)) {
				return;
			}
			// 非在庫品の場合は入荷予定の通りに仕入する
			for (RsltR r: up0()) {
				if (MAC_STK_MNG_TYP.isNOT_MNG(r.stk_mng_typ()) && !isNull(r.arr_act_no())) {
					MST_ARR_SCHD_R arrSchdR = _arrSchdCache.get(r.arr_schd_no());
					r.stk_id_typ(arrSchdR.stk_id_typ());
					r.stk_insp_typ(arrSchdR.stk_insp_typ());
					r.quality_typ(arrSchdR.quality_typ());
					r.gd_cd(arrSchdR.gd_cd());	
				}
			}
		}

		protected void createCache() {
			_arrSchdCache = new FXUCL_MCDbcCache<MST_ARR_SCHD_R>(
					MCQueryApiBuilder.create(MST_ARR_SCHD_R.create("T")), up0(),
					MST_ARR_SCHD_R.$arr_schd_no);
		}
		
		protected void complProcUpriAmt(MCList<RsltR> dtlL) {
			for (RsltR dtlR : dtlL) {
				if (dtlR.outsrc_flg()) {
					if (isNull(dtlR.trd_cur_proc_upri())) {
						dtlR.trd_cur_proc_upri(MCNumber.ZERO);
						dtlR.trd_cur_proc_amt(MCNumber.ZERO);
						dtlR.base_cur_proc_upri(MCNumber.ZERO);
						dtlR.base_cur_proc_amt(MCNumber.ZERO);
						if (!isNull(dtlR.ptax_xrate())) {
							dtlR.ptax_cur_proc_upri(MCNumber.ZERO);
							dtlR.ptax_cur_proc_amt(MCNumber.ZERO);
						}
					}
					if (isNull(dtlR.trd_cur_tax_amt())) {
						dtlR.trd_cur_tax_amt(MCNumber.ZERO);
						dtlR.base_cur_tax_amt(MCNumber.ZERO);
						if (!isNull(dtlR.ptax_xrate())) {
							dtlR.ptax_cur_tax_amt(MCNumber.ZERO);
						}
					}
				}
			}
		}
	}
	
	/**
	 * Ins01オペレーション.<p>
	 *
	 */
	public class Ins01 extends MSBDL_PurcListReg_MC_A.Ins01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				down0().setAll(up0());
			}
			
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<RsltR>> list = splitUpForIns(up0(), getSplitRowCount());
			for (MCList<RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<RsltR> up0L = ((MCList<RsltR>)ope.up(0));  
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}
		
		@Override
		protected void doIt() {
			MCList<RsltR> up = up0();
			replaceParam();
			callThisChk(up, this);
			MCList<RsltR> list =getChkList(up);
			callPurcRegOpe(list);
		}
		/**
		 * 上り電文の差し替え
		 */
		protected void replaceParam() {
			for (RsltR r : up0()) {
				if (!r.sync_flg()) {
					if (isNull(r.arr_act_no())) {
						// 未着の仕入を登録しようとしている場合
						r.gd_cd(r.tmp_gd_cd());
						r.quality_typ(r.tmp_quality_typ());
						r.stk_id_typ(r.tmp_stk_id_typ());
						r.stk_insp_typ(r.tmp_stk_insp_typ());
					}
				}
				else {
					if (!isNull(r.tmp_quality_typ())) {
						// 同時計上しない予定だったが、同時計上で仕入する場合
						r.quality_typ(r.tmp_quality_typ());
						r.stk_id_typ(r.tmp_stk_id_typ());
						r.stk_insp_typ(r.tmp_stk_insp_typ());
					}	
				}
			}
		}
	}
	/**
     * 同一処理単位で分割する（新規登録用）
     */
	protected List<MCList<RsltR>> splitUpForIns(MCList<RsltR> list, int max) {
        List<MCList<RsltR>> ret = new ArrayList<>();

        MCList<RsltR> apTgt = list.createInstance();
        MCList<RsltR> ivTgt = list.createInstance();
        MCList<RsltR> hdrTgt = list.createInstance();
		MCList<RsltR> otherTgt = list.createInstance();
		list.forEach(r -> {
			if (!getCo().ap_no_use_flg() && !isNull(r.ap_cred_cd())) {
				apTgt.add(r);
			}
			else if (!isNull(r.rcpt_iv_mng_no())) {
				ivTgt.add(r);
			}
			else if (!isNull(r.po_no())) {
				hdrTgt.add(r);
			}
			else {
				otherTgt.add(r);
			}
		});
		// 債務与信管理先単位
		MCList<RsltR>[] aps = apTgt.groupList(RsltR.$ap_cred_cd);
		addBatchUnit(ret, aps, max);

		//受領I/V単位
		MCList<RsltR>[] ivs = ivTgt.groupList(RsltR.$sppl_cd);
		addBatchUnit(ret, ivs, max);

		//ヘッダ単位
		MCList<RsltR>[] hdrs = hdrTgt.groupList(RsltR.$po_no);
		addBatchUnit(ret, hdrs, max);

		//その他
		addBatchUnit(ret, otherTgt, max);

		return ret;
	}
	

	/**
     * 同一処理単位で分割する(更新、削除用)
     */
	protected List<MCList<RsltR>> splitUpForElse(MCList<RsltR> list, int max) {
        List<MCList<RsltR>> ret = new ArrayList<>();

        MCList<RsltR> apTgt = list.createInstance();
        MCList<RsltR> ivTgt = list.createInstance();
        MCList<RsltR> hdrTgt = list.createInstance();
		MCList<RsltR> otherTgt = list.createInstance();
		list.forEach(r -> {
			if (!getCo().ap_no_use_flg() && !isNull(r.ap_cred_cd())) {
				apTgt.add(r);
			}
			else if (!isNull(r.rcpt_iv_mng_no())) {
				ivTgt.add(r);
			}
			else if (!isNull(r.purc_act_no())) {
				hdrTgt.add(r);
			}
			else {
				otherTgt.add(r);
			}
		});
		// 債務与信管理先単位
		MCList<RsltR>[] aps = apTgt.groupList(RsltR.$ap_cred_cd);
		addBatchUnit(ret, aps, max);
		
		//受領I/V単位
		MCList<RsltR>[] ivs = ivTgt.groupList(RsltR.$sppl_cd);
		addBatchUnit(ret, ivs, max);

		//ヘッダ単位
		MCList<RsltR>[] hdrs = hdrTgt.groupList(RsltR.$po_no);
		addBatchUnit(ret, hdrs, max);

		//その他
		addBatchUnit(ret, otherTgt, max);

		return ret;
	}

	private static final String[] _hdrGrpCols = new String[] { 
			RsltR.$trd_cd,
			RsltR.$trd_ptn_typ,
			RsltR.$po_no,
			RsltR.$purc_dpt_cd,
			RsltR.$purc_usr_cd,
			RsltR.$sppl_cd,
			RsltR.$asppl_cd,
			RsltR.$trd_cur_cd,
			RsltR.$base_cur_cd,
			RsltR.$ptax_cur_cd,
			RsltR.$rcpt_iv_no,
			RsltR.$rcpt_iv_mng_no,
			RsltR.$purc_dt,
			RsltR.$ac_dt,
			RsltR.$pay_basis_dt,
			RsltR.$pay_schd_dt,
			RsltR.$xrate,
			RsltR.$ptax_dt,
			RsltR.$ptax_xrate,
			RsltR.$tterm_cd1,
			RsltR.$tterm_rmrks1,
			RsltR.$tterm_cd2,
			RsltR.$tterm_rmrks2,
			RsltR.$tterm_cd3,
			RsltR.$tterm_rmrks3,
			RsltR.$trd_rmrks,
			RsltR.$intr_rmrks,
			RsltR.$sub_char1,
			RsltR.$sub_char2,
			RsltR.$sub_char3 };

	protected String[] getHdrGrpCols() {
		return _hdrGrpCols;
	}
	
	/**
	 * 実行単位のリストにグループ配列の要素を設定する。<p>
	 * 1つ前の要素が追加されたことにより実行単位が最大値を超えた場合、次の要素は別の実行単位となる。
	 * @param dest 実行単位のリスト
	 * @param src グループ配列
	 * @param max 最大値
	 */
	protected void addBatchUnit(List<MCList<RsltR>> dest, 
			MCList<RsltR>[] src, int max) {
		
		if (src == null || src.length == 0) {
			return ;
		}
		
		//retの最後のlistを取得
		MCList<RsltR> unit;
		if (dest.isEmpty()) {
			unit = createRsltL();
			dest.add(unit);
		}
		else {
			unit = dest.get(dest.size() - 1);
		}
		
		//追加
		for (MCList<RsltR> l : src) {
			if (unit.size() >= max) {
				unit = unit.createInstance();
				dest.add(unit);
			}
			unit.addAll(l);
		}
		
		//最後のlistが空の場合は削除
		if (unit.size() == 0) {
			dest.remove(unit);
		}
	}

	/**
	 * 実行単位のリストにリストの要素を設定する。<p>
	 * 1つ前の要素が追加されたことにより実行単位が最大値を超えた場合、次の要素は別の実行単位となる。
	 * @param dest 実行単位のリスト
	 * @param src グループ配列
	 * @param max 最大値
	 */
	protected void addBatchUnit(List<MCList<RsltR>> dest, 
			MCList<RsltR> src, int max) {

		//retの最後のlistを取得
		MCList<RsltR> unit;
		if (dest.isEmpty()) {
			unit = createRsltL();
			dest.add(unit);
		}
		else {
			unit = dest.get(dest.size() - 1);
		}
		
		for(RsltR r : src) {
			if (unit.size() >= max) {
				unit = unit.createInstance();
				dest.add(unit);
			}
			unit.add(r);
		}

		//最後のlistが空の場合は削除
		if (unit.size() == 0) {
			dest.remove(unit);
		}
	}
	
	/**
	 * Upd01オペレーション.<p>
	 *
	 */
	public class Upd01 extends MSBDL_PurcListReg_MC_A.Upd01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				down0().setAll(up0());
			}
			
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<RsltR>> list = splitUpForElse(up0(), getSplitRowCount());
			for (MCList<RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<RsltR> up0L = ((MCList<RsltR>)ope.up(0));  
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}
		
		@Override
		protected void doIt() {
			MCList<RsltR> up = up0();
			callThisChk(up, this);
			MCList<RsltR> list =getChkList(up);
			callPurcRegOpe(list);
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 */
	public class Del01 extends MSBDL_PurcListReg_MC_A.Del01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				down0().setAll(up0());
			}
			
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<RsltR>> list = splitUpForElse(up0(), getSplitRowCount());
			for (MCList<RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<RsltR> up0L = ((MCList<RsltR>)ope.up(0));  
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}
		
		@Override
		protected void doIt() {
			MCList<RsltR> up = up0();
			editUp(up);
			callThisChk(up, this);
			MCList<RsltR> list =getChkList(up);
			callPurcRegOpe(list);
		}
		
		protected void editUp(MCList<RsltR> up) {
			up.setStatus(MCRow.DELETE);
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 * 仕入予定検索
	 */
	public class Srch01 extends MSBDL_PurcListReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doSearchMain() {
			setUpTmpCol(up0());

			up0().addStringColumn("base_cur_cd", getCo().base_cur_cd());
			up0().addStringColumn("ptax_cur_cd", getCo().ptax_cur_cd());
			
			searchForDL(
				MSBDL0130_MST_PURC_SCHD_S01(),
				up0(), down0(), RsltR.$purc_schd_no);
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			filterPurcSchd();
			setValuesDbc(up0(), down0());
			// 固定値の設定
			down0().setStringNE(RsltR.$xrate_cd, getCo().purc_xrate_cd());
			down0().setStringNE(RsltR.$xrate_rnd_typ, getCo().xrate_rnd_typ());
			down0().setStringNE(RsltR.$wtax_rnd_typ, getCo().wtax_rnd_typ());
			editListMainForModeDtl();
		}
		
		protected void filterPurcSchd() {
			if (down0().isEmpty()) {
				return;
			}
			// 受領インボイス明細違いで仕入予定が重複することがあるので、重複分を除外する
			String key = RsltR.$purc_schd_no;
			
			MCIndexKey idx = down0().createIndex(key);
			MCList<RsltR> down0 = down0().distinctNE(key);
			for (RsltR r : down0) {
				MCList<RsltR> tmpL = down0().subList(idx, r.toArray(idx.getKeys()));
				if (tmpL.size() > 1) {
					r.rcpt_iv_no(null);
					r.rcpt_iv_mng_no(null);
					r.rcpt_iv_d_no(null);
				}
			}
			down0().setAll(down0);
		}
		
		protected void editListMainForModeDtl() {
			for (RsltR r : down0()) {
				setSundryCols(r);
				setContQty(r);
			}
		}
		
		protected void editListMainForModeHdr() {
			RsltR bef = null;
			MCList<RsltR> removeTgt = MCList.create(RsltR.class);
			for (RsltR r : down0()) {
				
				if (bef != null && 
						isSame(bef.purc_act_no(), r.purc_act_no())) {
					removeTgt.add(r);
				}
				else {
					
				}
				bef = r;
			}
			down0().removeAll(removeTgt);
		}
		
		@Override
		protected void editListSub() {
			super.editListSub();
		}
		
		@Override
		protected boolean isDelFlgCtl() {
			return super.isDelFlgCtl();
		}
		
		
	}
	/**
	 * Srch02オペレーション.<p>
	 * 仕入実績検索
	 */
	public class Srch02 extends MSBDL_PurcListReg_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doSearchMain() {
			setUpTmpCol(up0());
			
			// 検索モード「明細」
			if (isSame(up0().mode(), SRCH_MODE_DTL)) {
				searchForDL(
					MSBDL0130_MST_PURC_ACT_D_S01(),
					up0(), down0(), RsltR.$rcpt_iv_no, RsltR.$rcpt_iv_mng_no, RsltR.$purc_act_no, RsltR.$disp_seq);
			}
			// 検索モード「ヘッダ」
			else {
				searchForDL(
					MSBDL0130_MST_PURC_ACT_S01(),
					up0(), down0(), RsltR.$purc_act_no);
			}
			
		}
	
		@Override
		protected void editListMain() {
			super.editListMain();
			setValuesDbc(up0(), down0());
			// 固定値の設定
			down0().setStringNE(RsltR.$xrate_rnd_typ, getCo().xrate_rnd_typ());
			down0().setStringNE(RsltR.$wtax_rnd_typ, getCo().wtax_rnd_typ());
			if (isSame(up0().mode(), SRCH_MODE_DTL)) {
				editListMainForModeDtl();
			}
			// 検索モード「ヘッダ」
			else {
				editListMainForModeHdr();
			}
			
		}
		
		protected void editListMainForModeDtl() {
			
			RsltR bef = null;
			MCList<RsltR> removeTgt = MCList.create(RsltR.class);
			for (RsltR r : down0()) {
				r.ac_ym(getAcYm(r.ac_dt()));
				r.base_unit_qty_bef(r.base_unit_qty());
				setBefLoc(r);
				setSundryCols(r);
				
				if (bef != null && 
						isSame(bef.purc_act_no(), r.purc_act_no()) && 
						 isSame(bef.purc_act_d_no(), r.purc_act_d_no()) ) {
					//同一明細が複数件の場合
					bef.multi_io_flg(true);
					bef.slip_fr_valid_dt(null);
					bef.purc_cont_qty(null);
					bef.arr_act_no(null);
					
					removeTgt.add(r);
				}
				else {
					setContQty(r);
					//参照モードの場合は計画外も含まれる可能性があるので直納区分がnullの場合がある
					if (isNull(r.drct_dlv_typ())) {
						if (isNullAnd(r.outsrc_sppl_cd(), r.dlv_cd())) {
							r.drct_dlv_typ(MSC_DRCT_DLV_TYP.VIA.value());
						}
						else {
							r.drct_dlv_typ(MSC_DRCT_DLV_TYP.DDLV.value());
						}
					}
				}
				bef = r;
			}
			down0().removeAll(removeTgt);
		}
		
		protected void editListMainForModeHdr() {
			RsltR bef = null;
			MCList<RsltR> removeTgt = MCList.create(RsltR.class);
			for (RsltR r : down0()) {

				r.ac_ym(getAcYm(r.ac_dt()));
				if (bef != null && 
						isSame(bef.purc_act_no(), r.purc_act_no())) {
					removeTgt.add(r);
				}
				else {
					
				}
				bef = r;
			}
			down0().removeAll(removeTgt);
		}
		
		@Override
		protected void editListSub() {
			super.editListSub();
		}
		
		@Override
		protected boolean isDelFlgCtl() {
			return super.isDelFlgCtl();
		}
		
		
	
	}
	protected void setBefLoc(RsltR r) {
		r.from_gd_cd(r.gd_cd());
	}
	/**
	 * 検索条件を編集します
	 */
	protected void setUpTmpCol(CndR cndR) {
		
		if (cndR.expt_unplan_flg()) {
			cndR.addBooleanColumn("_expt_unplan_flg", cndR.expt_unplan_flg());
		}
		
		if (!isSame(cndR.arr_flg(), cndR.not_yet_arr_flg())) {
			String v;
			if (cndR.arr_flg()) {
				v = MSC_ARR_PTN_TYP.NRML.value();
			}
			else {
				v = MSC_ARR_PTN_TYP.N_YET_ARR.value();
			}
			cndR.addStringColumn("_arr_ptn_typ", v);
		}
		
		if (!isSame(cndR.arr_cmpl_flg(), cndR.arr_not_cmpl_flg())) {
			cndR.addBooleanColumn("_arr_cmpl_flg", cndR.arr_cmpl_flg());
		}
		
		if (!isSame(cndR.purc_cmpl_flg(), cndR.purc_not_cmpl_flg())) {
			cndR.addBooleanColumn("_purc_cmpl_flg", cndR.purc_cmpl_flg());
		}
		if (!cndR.cont_abort_flg()) {
			cndR.addBooleanColumn("_not_abort_flg", !cndR.cont_abort_flg());
		}
		
		if (!isSame(cndR.iv_flg(), cndR.not_iv_flg())) {
			cndR.addStringColumn("_iv_flg", MCBooleanUtil.booleanToDBString(cndR.iv_flg()));
		}
		else {
			// 空振りさせるため
			cndR.addStringColumn("_iv_flg");
		}

		if (!isSame(cndR.edi_flg(), cndR.not_edi_flg())) {
			cndR.addBooleanColumn("_edi_flg", cndR.edi_flg());
		}
		if (cndR.arr_done_not_insp_fin_flg()) {
			cndR.addBooleanColumn("_arr_done_not_insp_fin_flg", cndR.arr_done_not_insp_fin_flg());
		}
		if (cndR.dfct_insp_flg()) {
			cndR.addBooleanColumn("_dfct_insp_flg", cndR.dfct_insp_flg());
		}

		if (cndR.incl_temp_ap_flg()) {
			cndR.addBooleanColumn("_temp_ap_flg", cndR.incl_temp_ap_flg());
		}
		
	}
	/**
	 * Srch03オペレーション.<p>
	 * 入荷実績検索
	 */
	public class Srch03 extends MSBDL_PurcListReg_MC_A.Srch03 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doSearchMain() {
			setUpTmpCol(up0());

			up0().addStringColumn("base_cur_cd", getCo().base_cur_cd());
			up0().addDateColumn("mc_today", getToday());
			
			searchForDL(
				MSBDL0130_MST_PURC_SCHD_S04(),
				up0(), down0(), RsltR.$rcpt_iv_mng_no, RsltR.$tmp_po_no);

		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
			setValuesDbc(up0(), down0());
			
			initTaxCache(down0());
			for (RsltR r : down0()) {

				// 固定値の設定
				r.xrate_cd(getCo().purc_xrate_cd());
				r.xrate_rnd_typ(getCo().xrate_rnd_typ());
				r.wtax_rnd_typ(getCo().wtax_rnd_typ());
				
				// 発注時に税指定していない場合に、運用日付で最新の税情報を取得して結果に反映する
				if (r.tax_fix_flg()) {
					r.tax_cd(r.src_tax_cd());
					r.tax_nm(r.src_tax_nm());
					r.tax_rate(r.src_tax_rate());
					r.inc_tax_flg(r.src_inc_tax_flg());
					r.tax_typ(r.src_tax_typ());
				}
				else {
					MAM_TAX_R taxR = getTaxCache().get(r.tax_cd());
					r.tax_cd(taxR.tax_cd());
					r.tax_nm(taxR.tax_nm());
					r.tax_rate(taxR.tax_rate());
					r.inc_tax_flg(taxR.inc_tax_flg());
					r.tax_typ(taxR.tax_typ());
				}
				setWtaxInfo(r);
				calcQty(r);
				setPtaxCurInfo(r);
			}
			
			editListMainForModeDtl();
			
		}
		
		protected void editListMainForModeDtl() {
			MCDate tdy = getToday();
			// 仕入日・計上日の初期表示は運用日付とする
			down0().setDateNE(RsltR.$purc_dt, tdy);
			down0().setDateNE(RsltR.$ac_dt, tdy);
			
			for (RsltR r : down0()) {
				editXrateIfInptFlgOff(r, tdy);
			}
			calcAmt(down0());
			
			RsltR baseR = null;
			for (RsltR r : down0()) {
				setBefLoc(r);
				setSundryCols(r);
				r.schd_sync_flg(r.sync_flg());

				if (r.subcon_flg()) {
					r.sync_flg(true);
				}
				else {
					if (!isNull(r.arr_act_no())) {
						r.sync_flg(false);						
					}
				}
				if (r.purc_ddlv_flg()) {
					r.schd_sync_flg(true);
					r.sync_flg(true);
				}
				else if (r.arr_skip_flg()) {
					r.schd_sync_flg(false);
					r.sync_flg(false);
				}
				r.base_unit_qty_bef(r.base_unit_qty());
				
				if (!isNull(r.rcpt_iv_mng_no())) {
					if ((isNull(baseR) || !isSame(baseR.rcpt_iv_mng_no(), r.rcpt_iv_mng_no())) && !isNull(r.po_d_no())) {
						// 諸掛でない明細
						baseR = r;
					}
					// 仕入諸掛
					if (isNull(r.po_d_no())) {
						// 納入場所関連
						// 同じ受領インボイス内ので仕入諸掛でない明細の場所を設定する
						if (!isNull(baseR)) {
							r.site_cd(baseR.site_cd());
							r.site_nm(baseR.site_nm());
							r.in_to_loc_wg_cd(baseR.in_to_loc_wg_cd());
							r.in_to_loc_wg_nm(baseR.in_to_loc_wg_nm());
							r.in_to_loc_cd(baseR.in_to_loc_cd());
							r.in_to_loc_nm(baseR.in_to_loc_nm());
							r.outsrc_sppl_cd(baseR.outsrc_sppl_cd());
							r.str_ln_tgt_flg(baseR.str_ln_tgt_flg());
							r.str_ln_cd_none_flg(baseR.str_ln_cd_none_flg());
							r.str_ln_cd(baseR.str_ln_cd());
							r.str_ln_nm(baseR.str_ln_nm());
						}
						
						// 支払繰越回数
						r.pay_crryovr_times(
							nvl(r.itm_pay_crryovr_times(), _cacheBp.get(r.sppl_cd()).pay_crryovr_times()));
					}
				}
				
				setContQty(r);
				// 良品区分が良品以外の場合、検収不良ＦＬＧ、再入荷ＦＬＧをオンで表示する。
				if (!isNull(r.quality_typ()) && !MAC_QUALITY_TYP.isGOOD(r.quality_typ())) {
					r.accpt_dfct_flg(true);
					r.re_arr_flg(true);
					
					// 再入荷ＦＬＧをオンにした場合の設定
					r.trd_unit_re_arr_qty(r.trd_unit_qty());
					r.re_arr_loc_cd(r.in_to_loc_cd());
					r.re_arr_loc_nm(r.in_to_loc_nm());
					r.re_arr_loc_wg_cd(r.in_to_loc_wg_cd());
					r.re_arr_loc_wg_nm(r.in_to_loc_wg_nm());
					r.re_arr_str_ln_tgt_flg(r.str_ln_tgt_flg());
					
					if(r.str_ln_tgt_flg() && !MAC_STR.isNULL_VAL(r.str_ln_cd())) {
						r.re_arr_str_ln_cd_none_flg(false);
						r.re_arr_str_ln_cd(r.str_ln_cd());
						r.re_arr_str_ln_nm(r.str_ln_nm());
					}
					else {
						r.re_arr_str_ln_cd_none_flg(true);
					}

					MAM_LOC_R reLocR = _cacheLoc.get(r.re_arr_loc_cd());
					r.re_arr_loc_site_cd(reLocR.site_cd());
					r.re_arr_loc_cal_cd(reLocR.cal_cd());
					r.re_arr_loc_sppl_cd(reLocR.sppl_cd());
					r.re_arr_loc_sppl_cal_cd(reLocR.getStringNE("sppl_cal_cd"));
					
					//インボイス対象の仕入の場合は、再入荷ＦＬＧをオフとし、関連項目をクリアする。(検収不良フラグはそのまま)
					if (!isNull(r.rcpt_iv_mng_no())) {
						r.re_arr_flg(false);
						r.trd_unit_re_arr_qty(null);
						r.re_arr_loc_cd(null);
						r.re_arr_loc_nm(null);
						r.re_arr_loc_wg_cd(null);
						r.re_arr_loc_wg_nm(null);
						r.re_arr_str_ln_tgt_flg(false);
						r.re_arr_str_ln_cd_none_flg(false);
						r.re_arr_str_ln_cd(null);
						r.re_arr_str_ln_nm(null);
					}
					
					// 金額項目をクリア
					r.upri_not_tgt_flg(true);
					r.trd_cur_upri(MCNumber.ZERO);
					r.interim_flg(false);
					
					if(!isNull(r.wtax_rate())) {
						r.wtax_amt(MCNumber.ZERO);	
					}

					r.trd_cur_amt(MCNumber.ZERO);
					r.trd_cur_tax_amt(MCNumber.ZERO);
					r.trd_cur_inc_tax_amt(MCNumber.ZERO);
					r.trd_cur_dscnt_amt(null);

					r.base_cur_upri(MCNumber.ZERO);
					r.base_cur_amt(MCNumber.ZERO);
					r.base_cur_tax_amt(MCNumber.ZERO);
					r.base_cur_inc_tax_amt(MCNumber.ZERO);
					r.base_cur_dscnt_amt(null);

					if(!isNull(r.ptax_xrate())) {
						r.ptax_cur_upri(MCNumber.ZERO);
						r.ptax_cur_amt(MCNumber.ZERO);
						r.ptax_cur_tax_amt(MCNumber.ZERO);
						r.ptax_cur_inc_tax_amt(MCNumber.ZERO);
						r.ptax_cur_dscnt_amt(null);
					}
					if (!isNull(r.trd_cur_proc_upri())) {
						r.trd_cur_proc_upri(MCNumber.ZERO);
						r.trd_cur_proc_amt(MCNumber.ZERO);
						r.base_cur_proc_upri(MCNumber.ZERO);
						r.base_cur_proc_amt(MCNumber.ZERO);
						if (!isNull(r.ptax_xrate())) {
							r.ptax_cur_proc_upri(MCNumber.ZERO);
							r.ptax_cur_proc_amt(MCNumber.ZERO);
						}
					}

					if (!isNull(r.trd_cur_onr_prov_upri())) {
						r.trd_cur_onr_prov_upri(MCNumber.ZERO);
						r.trd_cur_onr_prov_amt(MCNumber.ZERO);
						r.base_cur_onr_prov_upri(MCNumber.ZERO);
						r.base_cur_onr_prov_amt(MCNumber.ZERO);
						if (!isNull(r.ptax_xrate())) {
							r.ptax_cur_onr_prov_upri(MCNumber.ZERO);
							r.ptax_cur_onr_prov_amt(MCNumber.ZERO);
						}
					}

					r.dscnt_rsn_cd(null);
					r.dscnt_rsn_nm(null);

					// 債務部門をクリア
					r.ap_dpt_cd(null);
					r.ap_dpt_nm(null);

					// 支払繰越回数をクリア
					r.pay_crryovr_times(null);

					// 負担項目をクリア
					r.bd_dpt_cd(null);
					r.bd_dpt_nm(null);
					r.bd_itm_cd(null);
					r.bd_itm_sub1(null);
					r.bd_itm_sub2(null);
					r.bd_itm_sub3(null);
					r.bd_itm_nm(null);
					r.bd_lot_no(null);
					r.bd_sublot_no(null);
					r.bd_sno1(null);
					r.bd_sno2(null);
					r.bd_sno3(null);
					r.bd_sno4(null);
					r.bd_bp_cd(null);
					r.bd_bp_nm(null);
					r.bd_loc_cd(null);
					r.bd_loc_nm(null);
					r.bd_ctg_cd(null);
					r.bd_ctg_nm(null);
					r.bd_oper_cd(null);
					r.bd_oper_nm(null);
					r.bd_iv_no(null);
					r.bd_slo_no(null);
					r.bd_po_no(null);
					r.bd_lot_mng_typ(null);
					r.bd_lot_no_typ(null);
					r.bd_sublot_mng_typ(null);
					r.bd_sublot_no_typ(null);
					r.bd_sno1_mng_typ(null);
					r.bd_sno2_mng_typ(null);
					r.bd_sno3_mng_typ(null);
					r.bd_sno4_mng_typ(null);
				}
				else {
					r.re_arr_loc_site_cd(null);
					r.re_arr_loc_cal_cd(null);
					r.re_arr_loc_sppl_cd(null);
					r.re_arr_loc_sppl_cal_cd(null);
				}
			}
		}
		
		/**
		 * 指定フラグがfalseのレートをマスタから取得します。
		 * @param r ヘッダ
		 */
		protected void editXrateIfInptFlgOff(RsltR r, MCDate tdy) {

			if (!r.xrate_inpt_flg()) {
				r.xrate(getDefXrateNE(r.trd_cur_cd(), r.base_cur_cd(), 
						getCo().purc_xrate_cd(), tdy));
			}
			
			if (!r.ptax_xrate_inpt_flg()) {
				r.ptax_xrate(getDefXrateNE(r.trd_cur_cd(), r.ptax_cur_cd(), 
					getCo().purc_xrate_cd(), tdy));
			}
		}
		@Override
		protected void editListSub() {
			super.editListSub();
		}
		
		@Override
		protected boolean isDelFlgCtl() {
			return super.isDelFlgCtl();
		}

		/**
		 * 源泉税額情報を設定します。
		 */
		protected void setWtaxInfo (RsltR m) {
			
			if (isSame(m.trd_cur_cd(), m.base_cur_cd())
					&& (isSame(m.trd_cur_cd(), m.ptax_cur_cd()) || isNull(m.ptax_cur_cd()))
					) {
				return ;
			}
			else {
				m.wtax_rate(null);
				m.wtax_amt(null);
			}
			
		}
	}
	
	/**
	 * 納税通貨の情報をマスタから取得し、下り電文に設定します。<br>
	 * 会社マスタの納税通貨が設定されていない場合は、何もしません。<br>
	 * @param r 下り電文
	 */
	protected void setPtaxCurInfo(RsltR r) {
		if (!isNull(getCo().ptax_cur_cd())) {
			r.ptax_cur_cd(getPtaxCur().cur_cd());
			r.ptax_cur_nm(getPtaxCur().cur_nm());
			r.ptax_cur_amt_dec_place(getPtaxCur().amt_dec_place());
			r.ptax_cur_upri_dec_place(getPtaxCur().upri_dec_place());
		}
	}

	/**
	 * 諸口項目の名称を設定します
	 */
	protected void setSundryCols(RsltR r) {
		if (!r.sundry_itm_flg()) {
			r.itm_nm(r.itm_nm_itm());
		}
		if (r.sppl_iv_flg()) {
			if (!r.sundry_itm_flg()) {
				r.iv_itm_nm(r.itm_nm_lcl());
			}
		}
		else {
			r.iv_itm_nm(null);
		}
		if (!r.dlv_sundry_flg()) {
			r.dlv_nm(r.dlv_nm_bp());
		}
		if (!r.tdlv_sundry_flg()) {
			r.tdlv_nm(r.tdlv_nm_bp());
		}
	}
	
	/**
	 * チェック処理を実行する
	 */
	protected void callThisChk(MCList<RsltR> dtlL, MCOperation ope) {
		MSBDL_PurcListReg.Chk01 chk01 = MSBDL_PurcListReg.crtChk01();
		chk01._caller = ope;
		chk01.up0().setAll(dtlL);
		chk01.exec();
	}
	/**
	 * 仕入実績登録サービスを実行する
	 */
	protected void callPurcRegOpe(MCList<RsltR> dtlL) {
		MSBDL_PurcActRegService.Purc_Upd02 ope = MSBDL_PurcActRegService.crtPurc_Upd02();
		ope.up0().purc_lst_flg(true);
		ope.up0().io_make_flg(true);
		ope.up0().amt_calc_flg(false);
		addAll(ope.up2(), dtlL, createMap_Purc_Ins01_DtlR_RsltR());
		ope.exec();

		copyByPegNo(
				dtlL, new String[]{RsltR.$purc_act_no, RsltR.$purc_act_seq, 
						RsltR.$purc_act_d_no, RsltR.$purc_act_d_seq}, 
				ope.down1(), new String[]{Purc_Ins01_DtlR.$purc_act_no, Purc_Ins01_DtlR.$purc_act_seq, 
						Purc_Ins01_DtlR.$purc_act_d_no, Purc_Ins01_DtlR.$purc_act_d_seq});
	}
	
	protected Map_Purc_Ins01_DtlR_RsltR<Purc_Ins01_DtlR,RsltR> createMap_Purc_Ins01_DtlR_RsltR() {
		return new Map_Purc_Ins01_DtlR_RsltR<Purc_Ins01_DtlR, RsltR>();
	}

	public class Map_Purc_Ins01_DtlR_RsltR<D extends Purc_Ins01_DtlR, S extends RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Purc_Ins01_DtlR.$peg_no, RsltR.$peg_no);
			
		}
	}
	protected void handleSuccess(MCList<RsltR> l) {
		dbTran().commit();
		for (RsltR r : l) {
			if (!r.err_flg()) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
			}
		}
	}
	
	protected void handleEx(Exception e, MCList<RsltR> l) {
		dbTran().rollback();
		MCException mcex;
		if (e instanceof MCException) {
			mcex = (MCException) e;
		}
		else {
			mcex = new MCException(e);
		}
		MCLog.write(mcex);
		MCMessage msg = mcex.getMCMessage();
		MCMessagePool.add(msg);
		MCMessagePool.addAll(mcex.getCauseMessageList());
		for (RsltR r : l) {
			r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
		}
	}

	protected MCMessageList checkXpnsPurc(MCList<RsltR> dtlL) {

		MCMessageList msgL = new MCMessageList();
		for (RsltR dtlR : dtlL) {
	
			// 経費購買の場合、資産管理しない品目しか登録できない
			if (MAC_TRD_PTN_TYP.isPURC_XPNS(dtlR.trd_ptn_typ()) && MAC_ASSET_MNG_TYP.isMNG(dtlR.asset_mng_typ())) {
				msgL.add(new MCMessage(dtlR, null, MSBDL0149, toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()),
						toDispGUIIndex(dtlR)));
			}
			// 資産管理する品目に経費理由を設定できない
			if (MAC_ASSET_MNG_TYP.isMNG(dtlR.asset_mng_typ()) && dtlR.xpns_purc_flg()) {
				msgL.add(new MCMessage(dtlR, null, MSBDL0150, toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()),
						dtlR.purc_rsn_cd(), toDispGUIIndex(dtlR)));
			}
			// 資産管理しない品目には経費理由しか設定できない
			if (MAC_ASSET_MNG_TYP.isNOT_MNG(dtlR.asset_mng_typ()) && !dtlR.xpns_purc_flg()) {
				msgL.add(new MCMessage(dtlR, null, MSBDL0151, toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()),
						dtlR.purc_rsn_cd(), toDispGUIIndex(dtlR)));
			}
		}
		return msgL;
	}
	/**
	 * 直納区分を取得します
	 */
	protected String getDrctDlvTyp(RsltR dtlR) {
		if (!isNull(dtlR.drct_dlv_typ())) {
			return dtlR.drct_dlv_typ();
		}
		if (isNullAnd(dtlR.outsrc_sppl_cd(), dtlR.dlv_cd())) {
			return MSC_DRCT_DLV_TYP.VIA.value();
		}
		else {
			return MSC_DRCT_DLV_TYP.DDLV.value();
		}
	}

	/**
	 * 経費購買判定
	 * 取引パタンが経費購買であるか、資産管理しない品目を発注する場合は経費購買とする。
	 * @param poSchd
	 */
	protected boolean isXpnsPurc(RsltR dtlR){
		if (MAC_TRD_PTN_TYP.isPURC_XPNS(dtlR.trd_ptn_typ()) || MAC_ASSET_MNG_TYP.isNOT_MNG(dtlR.asset_mng_typ())) {
			return true;
		} 
		else {
			return false;
		}
	}
	
	protected void setContQty(RsltR r) {
		MSBDL_PurcUtil.setCont(r);
	} 

	/**
	 * 在庫管理区分の設定 <p>
	 * 品目マスタの在庫管理区分・資産管理区分と、上り電文の経費購買FLGの組合せで、<br>
	 * 連携する在庫管理区分の値を決定し、入れ替える<br>
	 */
	protected void setStkMngTyp(RsltR r) {
		if (MSBDL_PurcUtil.isUpdStk(r.stk_mng_typ(), r.asset_mng_typ(), r.xpns_purc_flg())) {
			r.stk_mng_typ(MAC_STK_MNG_TYP.MNG.value());
		}
		
		else {
			r.stk_mng_typ(MAC_STK_MNG_TYP.NOT_MNG.value());
		}
		
	}
	/**
	 * 明細の数量計算を行う
	 */
	protected void calcQty(RsltR r) {
							
		r.trd_unit_qty(
				MSBDL_PurcUtil.cnvBaseToTrdUnitQty(
					r.base_unit_qty(), r, 
					r.trd_unit_conv_base_qty(), r.trd_unit_conv_qty(),
					r.trd_unit_dec_place(), r.trd_unit_rnd_typ()));
		//換算できなかったら基準単位で表示
		if (isNull(r.trd_unit_qty())) {
			r.trd_unit_qty(r.base_unit_qty());
			r.trd_unit_cd(r.base_unit_cd());
			r.trd_unit_nm(r.base_unit_nm());
			r.trd_unit_conv_qty(MCNumber.ONE);
			r.trd_unit_conv_base_qty(MCNumber.ONE);
		}
	}

	/**
	 * 発注時の情報を元に明細の金額計算を行う
	 */
	protected void calcAmt(MCList<RsltR> rl) {
		// 明細行ごとに一意の紐付ＮＯを設定
		setPegNo(rl);
		
		// ヘッダ紐付NO
		int hdr_peg_no = 0;
		
		// ユーティリティ実行用の引数電文
		MCList<ConvQtyAmtUtil_Calc01_HdrR> hdrParmLst = MCList.create(ConvQtyAmtUtil_Calc01_HdrR.class);
		MCList<ConvQtyAmtUtil_Calc01_Dtl1R> dtl1ParmLst = MCList.create(ConvQtyAmtUtil_Calc01_Dtl1R.class);
		
		// 明細下り電文を受領インボイス明細ＮＯ、発注明細NO単位にグルーピングして、ユーティティの引数(ヘッダ)にする
		String[] grpByPoD = {
				RsltR.$rcpt_iv_d_no,
				RsltR.$po_d_no,
				RsltR.$src_trd_unit_cd,
				RsltR.$src_trd_unit_qty,
				RsltR.$src_trd_cur_upri,
				RsltR.$src_trd_cur_dscnt_amt,
				RsltR.$src_trd_cur_proc_upri,
				RsltR.$src_trd_cur_onr_prov_upri,
				RsltR.$src_trd_cur_amt,
				RsltR.$src_trd_cur_proc_amt,
				RsltR.$src_trd_cur_onr_prov_amt,
				RsltR.$src_trd_cur_tax_amt,
				RsltR.$src_base_unit_qty,
				RsltR.$base_unit_dec_place,
				RsltR.$base_unit_rnd_typ,
				RsltR.$src_trd_unit_conv_qty,
				RsltR.$src_trd_unit_conv_base_qty,
				RsltR.$tax_rate,
				RsltR.$wtax_rate,
				RsltR.$wtax_amt
			};
		MCList<RsltR>[] grpListByPoD = rl.groupList(grpByPoD);
		
		for (MCList<RsltR> gl : grpListByPoD) {
			RsltR row = gl.get(0);
			
			ConvQtyAmtUtil_Calc01_HdrR hdrParmRow = ConvQtyAmtUtil_Calc01_HdrR.create();
			hdrParmRow.peg_no(hdr_peg_no++);
			hdrParmRow.trd_unit_cd(row.src_trd_unit_cd());
			hdrParmRow.trd_unit_qty(row.src_trd_unit_qty());
			hdrParmRow.trd_cur_upri(row.src_trd_cur_upri());
			hdrParmRow.trd_cur_dscnt_amt(row.src_trd_cur_dscnt_amt());
			hdrParmRow.trd_cur_proc_upri(row.src_trd_cur_proc_upri());
			hdrParmRow.trd_cur_onr_prov_upri(row.src_trd_cur_onr_prov_upri());
			hdrParmRow.trd_cur_amt(row.src_trd_cur_amt());
			hdrParmRow.trd_cur_proc_amt(row.src_trd_cur_proc_amt());
			hdrParmRow.trd_cur_onr_prov_amt(row.src_trd_cur_onr_prov_amt());
			hdrParmRow.tax_rate(row.src_tax_rate());
			hdrParmRow.inc_tax_flg(row.src_inc_tax_flg());
			hdrParmRow.act_tax_rate(row.tax_rate());
			hdrParmRow.act_inc_tax_flg(row.inc_tax_flg());
			hdrParmRow.trd_cur_tax_amt(row.src_trd_cur_tax_amt());
			MCRow rslt = getAmtAndTax(row.src_trd_cur_upri(), row.src_trd_unit_qty(), row.tax_rate(), row.inc_tax_flg(), 
					row.trd_cur_amt_dec_place(), row.purc_amt_rnd_typ(), row.purc_tax_rnd_typ(), row.src_trd_cur_dscnt_amt());
			hdrParmRow.trd_cur_inc_tax_amt(getIncTaxAmt(rslt));
			hdrParmRow.base_unit_dec_place(row.base_unit_dec_place());
			hdrParmRow.base_unit_rnd_typ(row.base_unit_rnd_typ());
			hdrParmRow.trd_unit_conv_qty(row.src_trd_unit_conv_qty());
			hdrParmRow.trd_unit_conv_base_qty(row.src_trd_unit_conv_base_qty());
			hdrParmRow.trd_cur_cd(row.trd_cur_cd());
			hdrParmRow.amt_dec_place(row.trd_cur_amt_dec_place());
			hdrParmRow.upri_dec_place(row.trd_cur_upri_dec_place());
			hdrParmRow.amt_rnd_typ(row.purc_amt_rnd_typ());
			hdrParmRow.tax_rnd_typ(row.purc_tax_rnd_typ());
			hdrParmRow.wtax_rate(row.wtax_rate());
			hdrParmRow.wtax_amt(row.wtax_amt());
			hdrParmRow.schd_base_unit_qty(row.src_base_unit_qty());
			hdrParmLst.add(hdrParmRow);
			
			for (RsltR dtlR : gl) {
				ConvQtyAmtUtil_Calc01_Dtl1R dtl1ParmRow = ConvQtyAmtUtil_Calc01_Dtl1R.create();
				dtl1ParmRow.hdr_peg_no(hdrParmRow.peg_no());
				dtl1ParmRow.peg_no(dtlR.peg_no());
				dtl1ParmRow.trd_unit_qty(dtlR.trd_unit_qty());
				dtl1ParmRow.trd_unit_cd(dtlR.trd_unit_cd());
				dtl1ParmRow.trd_unit_conv_base_qty(dtlR.trd_unit_conv_base_qty());
				dtl1ParmRow.trd_unit_conv_qty(dtlR.trd_unit_conv_qty());
				dtl1ParmLst.add(dtl1ParmRow);
			}
		}
		
		// 金額計算実行
		MSUCL_ConvQtyAmtUtil.ConvQtyAmtUtil_Calc02 ope = MSUCL_ConvQtyAmtUtil.crtConvQtyAmtUtil_Calc02();
		ope.up0().addAll(hdrParmLst);
		ope.up1().addAll(dtl1ParmLst);
		
		ope.exec();
		
		// 実行結果を明細行に反映する
		String[] copyCols = {RsltR.$trd_cur_upri,
				RsltR.$trd_cur_dscnt_amt,
				RsltR.$trd_cur_amt,
				RsltR.$trd_cur_tax_amt,
				RsltR.$trd_cur_inc_tax_amt,
				RsltR.$trd_unit_conv_qty,
				RsltR.$trd_unit_conv_base_qty,
				RsltR.$trd_cur_proc_upri,
				RsltR.$trd_cur_onr_prov_upri,
				RsltR.$trd_cur_proc_amt,
				RsltR.$trd_cur_onr_prov_amt,
				RsltR.$wtax_amt};

		copyByPegNo(rl, copyCols, ope.down0(), copyCols);
		
		calcRepurcObliTax(rl);
		// 基準通貨・納税通貨に換算
		
		for (RsltR rr : rl) {
			// 単価・値引額・金額・税額
			rr.base_cur_upri(convToBaseCur(rr.trd_cur_upri(), rr.xrate(), rr.base_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
			rr.base_cur_dscnt_amt(convToBaseCur(rr.trd_cur_dscnt_amt(), rr.xrate(), rr.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			rr.base_cur_amt(convToBaseCur(rr.trd_cur_amt(), rr.xrate(), rr.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			rr.base_cur_tax_amt(convToBaseCur(rr.trd_cur_tax_amt(), rr.xrate(), rr.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			if (!isNull(rr.xrate())) {
				rr.base_cur_inc_tax_amt(rr.base_cur_amt().add(rr.base_cur_tax_amt()));
			}

			// 加工単価・金額
			rr.base_cur_proc_upri(convToBaseCur(rr.trd_cur_proc_upri(), rr.xrate(), rr.base_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
			rr.base_cur_proc_amt(convToBaseCur(rr.trd_cur_proc_amt(), rr.xrate(), rr.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			// 有償支給単価・金額
			rr.base_cur_onr_prov_upri(convToBaseCur(rr.trd_cur_onr_prov_upri(), rr.xrate(), rr.base_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
			rr.base_cur_onr_prov_amt(convToBaseCur(rr.trd_cur_onr_prov_amt(), rr.xrate(), rr.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			
			if (!isNull(rr.ptax_cur_cd())) {
				rr.ptax_cur_upri(convCur(rr.trd_cur_upri(), rr.ptax_xrate(), rr.ptax_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
				rr.ptax_cur_dscnt_amt(convCur(rr.trd_cur_dscnt_amt(), rr.ptax_xrate(), rr.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
				rr.ptax_cur_amt(convCur(rr.trd_cur_amt(), rr.ptax_xrate(), rr.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
				rr.ptax_cur_tax_amt(convCur(rr.trd_cur_tax_amt(), rr.ptax_xrate(), rr.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));					
				if (!isNull(rr.ptax_xrate())) {
					rr.ptax_cur_inc_tax_amt(rr.ptax_cur_amt().add(rr.ptax_cur_tax_amt()));
				}
				
				// 加工単価・金額
				rr.ptax_cur_proc_upri(convCur(rr.trd_cur_proc_upri(), rr.ptax_xrate(), rr.ptax_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
				rr.ptax_cur_proc_amt(convCur(rr.trd_cur_proc_amt(), rr.ptax_xrate(), rr.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));

				// 有償支給単価・金額
				rr.ptax_cur_onr_prov_upri(convCur(rr.trd_cur_onr_prov_upri(), rr.ptax_xrate(), rr.ptax_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
				rr.ptax_cur_onr_prov_amt(convCur(rr.trd_cur_onr_prov_amt(), rr.ptax_xrate(), rr.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			}
		}

	}
	/**
	 * 買戻義務の場合の税額を計算します
	 * @param hdrR
	 * @param dtlL
	 */
	protected void calcRepurcObliTax( MCList<RsltR> rl) {
		for(RsltR rr : rl) {
			if(!rr.outsrc_flg()) {
				continue;
			}
			if(rr.repurc_obli_flg()) {
				MCNumber amt = rr.trd_cur_inc_tax_amt();
				if(rr.inc_tax_flg()) {
					// 内税の場合、有償支給単価を税額に含めないために、一旦加工単価×数量で導出し、後続処理で税額を差し引く
					MCNumber proc_inc_tax_amt = getAmt(rr.trd_cur_proc_upri(),
							rr.trd_unit_qty(),
							rr.trd_cur_amt_dec_place(),
							rr.purc_tax_rnd_typ(),
							rr.trd_cur_dscnt_amt());
					rr.trd_cur_proc_amt(proc_inc_tax_amt);
					// 有償支給金額は金額-加工金額
					rr.trd_cur_onr_prov_amt(!isNull(amt) ? amt.subtract(proc_inc_tax_amt) : null);
				}
				MCNumber trdCurTaxAmt = getTaxAmt(
						rr.trd_cur_proc_amt(),
						rr.tax_rate(),
						rr.trd_cur_amt_dec_place(),
						rr.purc_tax_rnd_typ(),
						rr.inc_tax_flg()
						);
				rr.trd_cur_tax_amt(trdCurTaxAmt);
				if(rr.inc_tax_flg()) {
					amt = (amt != null) ? amt.subtract(trdCurTaxAmt) : null;
					MCNumber proc_amt = !isNull(rr.trd_cur_proc_amt()) ? rr.trd_cur_proc_amt().subtract(trdCurTaxAmt) : MCNumber.ZERO;
					rr.trd_cur_amt(amt);
					rr.trd_cur_proc_amt(proc_amt);
				}
				rr.trd_cur_inc_tax_amt(rr.trd_cur_amt() != null ? rr.trd_cur_amt().add(trdCurTaxAmt) : null);
			}
		}
	}
	/**
	 * 指定されたRowに格納されている税込金額を取得する
	 * @param row
	 * @return 税込金額
	 */
	protected MCNumber getIncTaxAmt(MCRow row) {
		return row.getNumberNE("inc_tax_amt");
	}

	// 仕入実績(キャッシュ)
	protected static final Class<MSBDL_PurcListReg> CLAZZ = MSBDL_PurcListReg.class;
	protected FXUCL_MCDbcCache<MST_PURC_ACT_R> _purcActCache = null;
	protected static void initPurcActCache(MCList<RsltR> hdrL) {
		object(CLAZZ)._initPurcActCache(hdrL);
	}
	protected void _initPurcActCache(MCList<RsltR> hdrL) {
		_purcActCache = new FXUCL_MCDbcCache<MST_PURC_ACT_R>(MCQueryApiBuilder.create(MST_PURC_ACT_R.create("T")), hdrL,
				MST_PURC_ACT_R.$purc_act_no, MST_PURC_ACT_R.$purc_act_seq);
	}
	protected static FXUCL_MCDbcCache<MST_PURC_ACT_R> getPurcActCache() {
		return object(CLAZZ)._purcActCache;
	}
	
	protected FXUCL_MCDbcCache<MAM_TAX_R> _taxCache = null;
	/**
	 * 税のキャッシュを初期化します。複数回実行しても１度しか初期化しません。
	 * @param hdrL
	 */
	protected static void initTaxCache(MCList<RsltR> hdrL) {
		object(CLAZZ)._initTaxCache(hdrL);
	}
	protected void _initTaxCache(MCList<RsltR> hdrL) {
		if (_taxCache == null) {
			_taxCache = new FXUCL_MCDbcCache<MAM_TAX_R>(
					MCQueryApiBuilder.create(MAM_TAX_R.create("T")), hdrL,
					MAM_TAX_R.$tax_cd);
		}
	}
	protected static FXUCL_MCDbcCache<MAM_TAX_R> getTaxCache() {
		return object(CLAZZ)._taxCache;
	}
	protected Map_Lot_Chk03_CndR_RsltR<Lot_Chk03_CndR,RsltR> createMap_Lot_Chk03_CndR_RsltR() {
		return new Map_Lot_Chk03_CndR_RsltR<Lot_Chk03_CndR, RsltR>();
	}

	public class Map_Lot_Chk03_CndR_RsltR<D extends Lot_Chk03_CndR, S extends RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Lot_Chk03_CndR.$peg_no, RsltR.$peg_no);
			addColumnPathMap(Lot_Chk03_CndR.$itm_cd, RsltR.$bd_itm_cd);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub1, RsltR.$bd_itm_sub1);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub2, RsltR.$bd_itm_sub2);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub3, RsltR.$bd_itm_sub3);
			addColumnPathMap(Lot_Chk03_CndR.$lot_no, RsltR.$bd_lot_no);
			addColumnPathMap(Lot_Chk03_CndR.$sublot_no, RsltR.$bd_sublot_no);
			addColumnPathMap(Lot_Chk03_CndR.$err_flg, RsltR.$err_flg);
		}
	}

	protected void setValuesDbc(CndR upR, MCList<RsltR> down) {

		setValuesDbc(MSBDL0130_RsltR_J01(), upR, down);
		
		initDbcCache(upR, down);
		
		for (RsltR r : down) {
			MAM_LOC_R locR = _cacheLoc.get(r.re_arr_loc_cd());
			
			r.re_arr_loc_nm(locR.loc_nm());
			r.re_arr_str_ln_tgt_flg(locR.str_ln_tgt_flg());
			r.re_arr_loc_site_cd(locR.site_cd());
			r.re_arr_loc_cal_cd(locR.cal_cd());
			r.re_arr_loc_sppl_cd(locR.sppl_cd());
			r.re_arr_loc_sppl_cal_cd(locR.getStringNE("sppl_cal_cd"));
		}
	}
	protected void initDbcCache(CndR upR, MCList<RsltR> down) {
		initDbcCacheBp(down);
		initDbcCacheLoc(down);
	}
	
	protected FXUCL_MCDbcCache<MAM_BP_R> _cacheBp;
	protected void initDbcCacheBp(MCList<RsltR> down) {

		MAM_BP_R t = MAM_BP_R.create("T");
		MCQueryApiBuilder bp_bldr = MCQueryApiBuilder.create(t);
		bp_bldr.setSelect(t.pay_crryovr_times);

		_cacheBp = new FXUCL_MCDbcCache<MAM_BP_R>(bp_bldr, down, RsltR.$sppl_cd);
	}
	protected FXUCL_MCDbcCache<MAM_BP_R> _cacheBpBsppl;

	protected FXUCL_MCDbcCache<MAM_LOC_R> _cacheLoc;
	protected void initDbcCacheLoc(MCList<RsltR> down) {

		MAM_LOC_R t = MAM_LOC_R.create("T");
		MAM_BP_R m1 = MAM_BP_R.create("M1");
		MCQueryApiBuilder loc_bldr = MCQueryApiBuilder.create(t);
		
		loc_bldr.setSelect(t.loc_nm, t.str_ln_tgt_flg, t.site_cd, t.cal_cd, t.sppl_cd, m1.sppl_cal_cd);
		loc_bldr.addLeftOuterJoin(m1, m1.bp_cd.eq(t.sppl_cd));
		
		_cacheLoc = new FXUCL_MCDbcCache<MAM_LOC_R>(loc_bldr, down, RsltR.$re_arr_loc_cd);
	}

	//FMCB CUSTOM END
}