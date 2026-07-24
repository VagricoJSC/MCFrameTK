package mcframe.serverMSBE.MSBEL6510;

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
import mcframe.serverMSBE.MSBEL6510.*; // このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBE.MSBEL6500.*;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.commonCore.container.MCRow.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import mcframe.serverFXUC.FXUCL0170.FXUCL_BeforeTodayValidater;
import java.util.Map;
import mcframe.commonMAUA.MAUAC0010.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_StkXfrActRcptIFService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_StkXfrActRcptIFService_MC extends MSBEL_StkXfrActRcptIFService_MC_A{
	//FMCB CUSTOM START

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 在庫振替実績オペレーション用のチェック処理です。<br>
	 */
	public class Chk01 extends MSBEL_StkXfrActRcptIFService_MC_A.Chk01 {
		protected MCIndexKey _hdrLIdx = null;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			
			// この時点でエラーがある場合は、以降の処理（チェック処理、および取込処理）を中断する
			if (!up0().err_flg()) {
				// 在庫振替実績SVチェック処理
				callStkXfrActChkSrv();
			}
			setDown();
		}
		
		@Override
		protected MCMessageList updCntChkReq() {
			MCMessageList msgL = super.updCntChkReq();
			MCList<StkXfrActIF_HdrR> notErrL = getChkList(
					up1().subList(MCRow.MODIFY, MCRow.DELETE));
			notErrL.forEach(r -> {
				msgL.addAll(check(r, StkXfrActIF_HdrR.$stk_xfr_act_no,
						new FXUCL_RequiredValidater()));
				if (up0().upd_cntr_chk_flg()) {
					msgL.addAll(check(r, StkXfrActIF_HdrR.$upd_cntr,
							new FXUCL_RequiredValidater()));
				}
			});
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			
			// ヘッダに対する更新カウンタチェックおよびデータ補完
			msgL.addAll(chkUpdCntrStkXfrAct());
			
			// 明細に対するデータ補完
			msgL.addAll(cmplStkXfrActD(up2()));
			msgL.addAll(cmplStkXfrActD(up3()));

			return msgL;
		}
		
		@Override
		protected void putListLogicCheckBind() {
			super.putListLogicCheckBind();
			
			_hdrLIdx = up1().createIndex(StkXfrActIF_HdrR.$hdr_dtl_peg_no);
			setListLogicLoc(up2());
			setListLogicLoc(up3());
			
			// 棚ライン
			ListLogicBind strLnBind1 = getListLogicBind(up2(),
					StkXfrActIF_DtlGiR.$str_ln_cd);
			strLnBind1.putBind(StrLnCols.$i_loc_cd, StkXfrActIF_DtlGiR.$loc_cd);
			strLnBind1.putBind(StrLnCols.$i_mode_nullval_flg, true);
			ListLogicBind strLnBind2 = getListLogicBind(up3(),
					StkXfrActIF_DtlGiR.$str_ln_cd);
			strLnBind2.putBind(StrLnCols.$i_loc_cd, StkXfrActIF_DtlGiR.$loc_cd);
			strLnBind2.putBind(StrLnCols.$i_mode_nullval_flg, true);
			
			//  在庫取引先
			ListLogicBind stkBpBind1 = getListLogicBind(up2(),
					StkXfrActIF_DtlGiR.$stk_bp_cd);
			stkBpBind1.putBind(BpCols.$i_mode_nullval_flg, true);
			ListLogicBind stkBpBind2 = getListLogicBind(up3(),
					StkXfrActIF_DtlGiR.$stk_bp_cd);
			stkBpBind2.putBind(BpCols.$i_mode_nullval_flg, true);
		}
		
		@Override
		protected void customListLogicCnd(String column, MCNumber paramIndex,
				MCConstRow data, Map<String, Comparable<?>> cnd) {
			super.customListLogicCnd(column, paramIndex, data, cnd);

			customListLogicCndSub(column, paramIndex, data, cnd);
		}
		
		/**
		 * リストロジック用の場所ＣＤを設定する。
		 */
		protected void setListLogicLoc(MCList<StkXfrActIF_DtlGiR> list){
			for(StkXfrActIF_DtlGiR r : list){
				StkXfrActIF_HdrR hdrR = up1().getFirst(_hdrLIdx, r.hdr_dtl_peg_no());
				r.loc_cd(hdrR.loc_cd());
			}
		}
		
		/**
		 * リストロジック用の検索区分・条件を設定する。
		 */
		protected void customListLogicCndSub(String column, MCNumber paramIndex,
				MCConstRow data, Map<String, Comparable<?>> cnd) {
			if (!isSame(paramIndex, MCNumber.ZERO)) {
				if (isSame(column, StkXfrActIF_DtlGiR.$stk_bp_cd)) {
					cnd.put(MAUAC_List.BpCols.$i_bp_is_srch_typ,
							getStkBpIsSrchTyp(data.getStringNE(StkXfrActIF_DtlGiR.$stk_id_typ)));
				}
				else if (isSame(column, StkXfrActIF_DtlGiR.$stk_arrv_bp_cd)) {
					StkXfrActIF_HdrR hdrR = up1().getFirst(_hdrLIdx, data.getNumberNE(StkXfrActIF_DtlGiR.$hdr_dtl_peg_no));
					cnd.put(MAUAC_List.BpCols.$i_bp_is_srch_typ,
							getStkArrvBpIsSrchTyp(hdrR.sppl_cd()));
				}
			}
		}
		
		/**
		 * 取引先入力補助検索区分を取得する。
		 * 
		 * @return 取引先入力補助検索区分
		 */
		protected  String getStkBpIsSrchTyp(String stkIdTyp) {
			if (stkIdTyp == null) {
				return null;
			}

			if (MSC_STK_ID_TYP.isRTN_PRE_ACCPT(stkIdTyp)
					|| MSC_STK_ID_TYP.isCSTSTK(stkIdTyp)) {
				return MAC_BP_IS_SRCH_TYP.CST.value();

			}
			else if (MSC_STK_ID_TYP.isRNT_RCV(stkIdTyp)
					|| MSC_STK_ID_TYP.isPURC_PRE_ACCPT(stkIdTyp)
					|| MSC_STK_ID_TYP.isACCPT_DFCT(stkIdTyp)
					|| MSC_STK_ID_TYP.isNCV_RCV(stkIdTyp)
					|| MSC_STK_ID_TYP.isONR_PROV(stkIdTyp)) {

				return MAC_BP_IS_SRCH_TYP.SPPL.value();

			}
			return MAC_BP_IS_SRCH_TYP.COMM.value();
		}

		/**
		 * 着荷先入力補助検索区分を取得する。
		 * 
		 * @return 取引先入力補助検索区分
		 */
		protected String getStkArrvBpIsSrchTyp( String spplCd) {
			
			// 自社場所
			if (isNull(spplCd)) {
				return MAC_BP_IS_SRCH_TYP.DLV.value();
			}
			// 外注場所
			else {
				return MAC_BP_IS_SRCH_TYP.SPPL.value();
			}
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			// ヘッダの条件付妥当性チェック
			msgL.addAll(chkValid());
			
			//ロット発番
			setLotNo(up3());
			cmplLotNo(up2());
			cmplLotNo(up3());
			
			// ヘッダ、明細の条件チェック、補完
			msgL.addAll(chkHdr(up1()));
			msgL.addAll(chkDtl(MSC_IO_TYP.GI, up2()));
			msgL.addAll(chkDtl(MSC_IO_TYP.GR, up3()));
			
			return msgL;
		}
		
		/**
		 * ロット、サブロットNOを発番する
		 */
		protected void setLotNo(MCList<StkXfrActIF_DtlGiR> up3) {
			MCIndexKey idx = up1().createIndex(StkXfrActIF_HdrR.$hdr_dtl_peg_no);

			for (StkXfrActIF_DtlGiR dtlGrR : up3) {
				StkXfrActIF_HdrR up1 = up1().getFirst(idx, dtlGrR.hdr_dtl_peg_no());
				// 品目振替 or ロット・手配ＮＯ振替
				if (MAC_TRD_PTN_TYP.isXFR_ITM(up1.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isXFR_LOT_SNO(up1.trd_ptn_typ())) {
					if (dtlGrR.crt_lot_flg()) {
						if (canGenerateLotNo(dtlGrR)) {
							dtlGrR.lot_no(getLotNo(up1, dtlGrR, MAC_NUM_BIZ_TYP.LOT));
						}
					}
					if (dtlGrR.crt_lot_flg() || MAC_SUBLOT_MNG_TYP.isSTK(dtlGrR.sublot_mng_typ())) {
						if (canGenerateSubLotNo(dtlGrR)) {
							dtlGrR.sublot_no(
									getLotNo(up1, dtlGrR, MAC_NUM_BIZ_TYP.SUBLOT));
						}
					}
				}
			}
		}

		protected boolean canGenerateLotNo(StkXfrActIF_DtlGiR dtlR) {
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

		protected boolean canGenerateSubLotNo(StkXfrActIF_DtlGiR dtlR) {
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

		protected String getLotNo(StkXfrActIF_HdrR hdrR, StkXfrActIF_DtlGiR dtlGrR,
				MAC_NUM_BIZ_TYP numBizTyp) {

			ElmArgsR lotArgs = ElmArgsR.create();
			if (MAC_NUM_BIZ_TYP.isLOT(numBizTyp)) {
				lotArgs.num_ptn_cd(dtlGrR.lot_no_ptn_cd());
			}
			else {
				lotArgs.num_ptn_cd(dtlGrR.sublot_no_ptn_cd());
			}
			lotArgs.itm_cd(dtlGrR.itm_cd());
			lotArgs.itm_sub1(dtlGrR.itm_sub1());
			lotArgs.itm_sub2(dtlGrR.itm_sub2());
			lotArgs.itm_sub3(dtlGrR.itm_sub3());
			lotArgs.loc_cd(hdrR.loc_cd());
			lotArgs.dpt_cd(hdrR.act_dpt_cd());
			lotArgs.co_cd(getCo().co_cd());
			lotArgs.bp_cd(null);
			lotArgs.wg_cd(hdrR.wg_cd());
			lotArgs.site_cd(null);
			lotArgs.trd_cd(hdrR.trd_cd());
			lotArgs.dt(hdrR.stk_xfr_act_tm());
			lotArgs.str(null);
			lotArgs.str2(null);
			lotArgs.str3(null);
			lotArgs.num(null);
			lotArgs.bp_lot_no(null);
			lotArgs.sno1(dtlGrR.sno1());
			lotArgs.sno2(dtlGrR.sno2());
			lotArgs.sno3(dtlGrR.sno3());
			lotArgs.sno4(dtlGrR.sno4());
			if (MAC_NUM_BIZ_TYP.isSUBLOT(numBizTyp)) {
				lotArgs.lot_no(dtlGrR.lot_no());
			}

			return getNum(numBizTyp, lotArgs);
		}

		/**
		 * ヘッダ情報に対して、条件に応じて固有チェックを実施する。<p>
		 * @param hdr　ヘッダ情報
		 * @return　メッセージリスト
		 */
		protected MCMessageList chkHdr(MCList<StkXfrActIF_HdrR> hdrL) {
			MCMessageList msgList = new MCMessageList();
			MCList<StkXfrActIF_HdrR> notErrL = getChkList(hdrL);
			notErrL.forEach(hdr -> {
				msgList.addAll(checkWritableLocCdDac(hdr, StkXfrActIF_HdrR.$loc_cd));

				// 条件付きチェック
				if (!MAC_DATA_CRUD_TYP.isCRT(hdr.data_crud_typ())) {
					// 【必須入力】在庫振替実績ＮＯ
					msgList.addAll(check(hdr, StkXfrActIF_HdrR.$stk_xfr_act_no,
							new FXUCL_RequiredValidater()));
					// 【必須入力】取消計上日
					msgList.addAll(
							check(hdr, StkXfrActIF_HdrR.$can_ac_dt, new FXUCL_RequiredValidater()));
					// 【必須入力】更新カウンタ
					msgList.addAll(
							check(hdr, StkXfrActIF_HdrR.$upd_cntr, new FXUCL_RequiredValidater()));

					// 【日付と運用日付の前後チェック】取消計上日
					msgList.addAll(
							check(hdr, StkXfrActIF_HdrR.$can_ac_dt, new FXUCL_BeforeTodayValidater()));
				}
			});

			return msgList;
		}
		
		/**
		 * 明細情報に対して、条件に応じて固有チェックを実施する。<p>
		 * @param io入出庫区分
		 * @param dtlL　明細情報
		 * @return　メッセージリスト
		 */
		protected MCMessageList chkDtl(MSC_IO_TYP io, MCList<StkXfrActIF_DtlGiR> dtlL){
			MCMessageList msgList = new MCMessageList();
			MCIndexKey idx = up1().createIndex(StkXfrActIF_HdrR.$hdr_dtl_peg_no);
			// 条件付き必須入力チェック
			for(StkXfrActIF_DtlGiR dtl : dtlL){
				if (!MAC_DATA_CRUD_TYP.isCRT(dtl.data_crud_typ())) {
					// 【必須入力】在庫振替実績ＮＯ
					msgList.addAll(check(dtl, StkXfrActIF_DtlGiR.$stk_xfr_act_no, new FXUCL_RequiredValidater()));
					// 【必須入力】在庫振替実績明細ＮＯ
					msgList.addAll(check(dtl, StkXfrActIF_DtlGiR.$stk_xfr_act_d_no, new FXUCL_RequiredValidater()));
				}
				
				StkXfrActIF_HdrR hdr = up1().getFirst(idx, dtl.hdr_dtl_peg_no());
				if(MSC_IO_TYP.isGR(io) && dtl.sundry_itm_flg()){
					// 【必須入力】品名
					msgList.addAll(check(dtl, StkXfrActIF_DtlGiR.$itm_nm, new FXUCL_RequiredValidater()));
				}
				if (!MAC_LOT_MNG_TYP.isNOT_MNG(dtl.lot_mng_typ())) {
					// 【必須入力】ロットNO
					msgList.addAll(
							check(dtl, StkXfrActIF_DtlGiR.$lot_no, new FXUCL_RequiredValidater()));
				}
				if (!MAC_SUBLOT_MNG_TYP.isNOT_MNG(dtl.sublot_mng_typ())) {
					// 【必須入力】サブロットNO
					msgList.addAll(check(dtl, StkXfrActIF_DtlGiR.$sublot_no,
							new FXUCL_RequiredValidater()));
				}
				if(hdr.str_ln_tgt_flg()){
					// 【存在チェック】棚ライン
					msgList.addAll(check(dtl, StkXfrActIF_DtlGiR.$str_ln_cd, new FXUCL_RequiredValidater()));
				}
				if(!MSC_FIX_NO_TYP.isNON(dtl.fix_no_typ())){
					// 【存在チェック】確定NO
					msgList.addAll(check(dtl, StkXfrActIF_DtlGiR.$fix_no, new FXUCL_RequiredValidater()));
				}
				if (!MAC_TRD_PTN_TYP.isXFR_ITM(hdr.trd_ptn_typ())) {
					// 【必須入力】在庫識別区分
					msgList.addAll(check(dtl, StkXfrActIF_DtlGiR.$stk_id_typ,
							new FXUCL_RequiredValidater()));
				}
				
				//　値の補完
				editDtl(hdr, dtl);
				
				// 小数部有効桁チェック
				msgList.addAll(checkDecPlace(dtlL, StkXfrActIF_DtlGiR.$trd_unit_dec_place,
						StkXfrActIF_DtlGiR.$trd_unit_qty));
			}
			return msgList;			
		}
		
		/**
		 * 明細の条件つき補完
		 */
		protected void editDtl(StkXfrActIF_HdrR hdr, StkXfrActIF_DtlGiR dtl) {
			// 基準単位数量の補完
			dtl.base_unit_qty(convToBaseUnit(dtl.trd_unit_qty(), dtl.trd_unit_conv_base_qty(), 
					dtl.trd_unit_conv_qty(), dtl.base_unit_dec_place(), dtl.base_unit_conv_rnd_typ()));
			// 棚・ライン
			if(!hdr.str_ln_tgt_flg()){
				dtl.str_ln_cd(MAC_STR.NULL_VAL.value());
			}
			// 在庫識別区分
			if (MAC_TRD_PTN_TYP.isXFR_ITM(hdr.trd_ptn_typ())) {
				dtl.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
			}
			// 在庫取引先CD
			if(MSC_STK_ID_TYP.isCOSTK(dtl.stk_id_typ())){
				dtl.stk_bp_cd(MAC_STR.NULL_VAL.value());
			}
			//手配ＮＯ１
			if(MAC_SNO_MNG_TYP.isMNG_NOT_STK(dtl.sno1_mng_typ()) || MAC_SNO_MNG_TYP.isNOT_MNG(dtl.sno1_mng_typ())){
				dtl.sno1(MAC_STR.NULL_VAL.value());
			}
			//手配ＮＯ２
			if(MAC_SNO_MNG_TYP.isMNG_NOT_STK(dtl.sno2_mng_typ()) || MAC_SNO_MNG_TYP.isNOT_MNG(dtl.sno2_mng_typ())){
				dtl.sno2(MAC_STR.NULL_VAL.value());
			}
			//手配ＮＯ３
			if(MAC_SNO_MNG_TYP.isMNG_NOT_STK(dtl.sno3_mng_typ()) || MAC_SNO_MNG_TYP.isNOT_MNG(dtl.sno3_mng_typ())){
				dtl.sno3(MAC_STR.NULL_VAL.value());
			}
			//手配ＮＯ４
			if(MAC_SNO_MNG_TYP.isMNG_NOT_STK(dtl.sno4_mng_typ()) || MAC_SNO_MNG_TYP.isNOT_MNG(dtl.sno4_mng_typ())){
				dtl.sno4(MAC_STR.NULL_VAL.value());
			}
			//ロットＮＯ
			if(MAC_LOT_MNG_TYP.isNOT_MNG(dtl.lot_mng_typ())){
				dtl.lot_no(MAC_STR.NULL_VAL.value());
			}
			//サブロットＮＯ
			if(MAC_SUBLOT_MNG_TYP.isNOT_MNG(dtl.sublot_mng_typ())){
				dtl.sublot_no(MAC_STR.NULL_VAL.value());
			}
			//確定ＮＯ
			if(MSC_FIX_NO_TYP.isNON(dtl.fix_no_typ())){
				dtl.fix_no(MAC_STR.NULL_VAL.value());
			}
		}
		
		/**
		 * ヘッダの条件付妥当性チェック
		 */
		protected MCMessageList chkValid() {
			MCMessageList msgL = new MCMessageList();
			MCList<StkXfrActIF_HdrR> notErrL = getChkList(up1());
			for (StkXfrActIF_HdrR r : notErrL) {
				// 後続の実績SVとチェック仕様が異なるのでここでチェックする
				if (isNull(r.stk_xfr_act_no())
					&& r.isStatusCreate()
					&& isNull(r.trd_cd())
					&& !isNull(r.trd_ptn_typ())) {
					if (isNull(getDefTrdR(r.trd_ptn_typ()))) {
						msgL.add(new MCMessage(r, null, MSBEL0252, r.trd_ptn_typ(), toDispGUIIndex(r)));
					}
				}
			}
			return msgL;
		}
		
		/**
		 * 在庫振替実績ヘッダに対する更新カウンタチェック、および補完処理
		 */
		protected MCMessageList chkUpdCntrStkXfrAct() {
			MCIndexKey idxkey;
			MCMessageList msgL = new MCMessageList();
			// 新規以外
			MCList<StkXfrActIF_HdrR> notErrL = getChkList(up1().subList(MCRow.MODIFY, MCRow.DELETE));
			if (notErrL.isEmpty()) {
				return msgL;
			}
			MCList<MST_STK_XFR_ACT_R> dbc = MCList.create(MST_STK_XFR_ACT_R.class);
			MST_STK_XFR_ACT_R t = MST_STK_XFR_ACT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(
				t.stk_xfr_act_no,
				t.trd_cd,
				t.trd_ptn_typ,
				t.loc_cd,
				t.wg_cd,
				t.act_dpt_cd,
				t.act_usr_cd,
				t.ac_dt,
				t.stk_xfr_act_tm,
				t.ac_dt,
				t.intr_rmrks,
				t.trd_rmrks,
				t.sub_char1,
				t.sub_char2,
				t.sub_char3,
				t.stk_xfr_rsn_cd,
				t.upd_cntr
			);
			
			// 更新カウンタチェック
			if (up0().upd_cntr_chk_flg()) {
				dbSelectKeyForUpdateNoWait("MSBEL6510_MST_STK_XFR_ACT_S01", dbc, dbc_bldr, notErrL);

				idxkey = dbc.createIndex(MST_STK_XFR_ACT_R.$stk_xfr_act_no);
				for (StkXfrActIF_HdrR r : notErrL) {
					MST_STK_XFR_ACT_R selectR = dbc.getFirst(idxkey, r.stk_xfr_act_no());
					msgL.addAll(checkUpdCntrNE(r, StkXfrActIF_HdrR.$upd_cntr, selectR));
				}
			}
			// 更新カウンタチェック不要
			else {
				dbSelectKeyForUpdate("MSBEL6510_MST_STK_XFR_ACT_S02", dbc, dbc_bldr, notErrL);
				idxkey = dbc.createIndex(MST_STK_XFR_ACT_R.$stk_xfr_act_no);
			}

			// 実績ヘッダに対してデータ補完を行う。
			notErrL.forEach(r -> {
				MST_STK_XFR_ACT_R actR = dbc.getFirst(idxkey, r.stk_xfr_act_no());
				// データ補完
				// 更新前の値をセットする。
				if(!isNull(actR)){
					// 取引CD、取引パタンは新規以外では変更不可のため、変更前の値で上書きする。
					r.trd_cd(actR.trd_cd());
					r.trd_ptn_typ(actR.trd_ptn_typ());
					
					r.act_dpt_cd(compVal(r.act_dpt_cd_upd_flg(), r.act_dpt_cd(), actR.act_dpt_cd(), null));
					r.act_usr_cd(compVal(r.act_usr_cd_upd_flg(), r.act_usr_cd(), actR.act_usr_cd(), null));
					r.intr_rmrks(compVal(r.intr_rmrks_upd_flg(), r.intr_rmrks(), actR.intr_rmrks(), null));
					r.sub_char1(compVal(r.sub_char1_upd_flg(), r.sub_char1(), actR.sub_char1(), null));
					r.sub_char2(compVal(r.sub_char2_upd_flg(), r.sub_char2(), actR.sub_char2(), null));
					r.sub_char3(compVal(r.sub_char3_upd_flg(), r.sub_char3(), actR.sub_char3(), null));
					
					r.ac_dt(nvl(r.ac_dt(), actR.ac_dt()));
					r.can_ac_dt(nvl(r.can_ac_dt(), actR.ac_dt()));
					r.stk_xfr_rsn_cd(nvl(r.stk_xfr_rsn_cd(), actR.stk_xfr_rsn_cd()));
					msgL.addAll(checkWritableLocCdDac(actR, MST_STK_XFR_ACT_R.$loc_cd));
				}
			});
			
			// NULLに対する補完
			for (StkXfrActIF_HdrR r : up1()) {
				if (isNull(r.stk_xfr_act_no())
					&& r.isStatusCreate()
					&& isNull(r.trd_cd())
					&& !isNull(r.trd_ptn_typ())) {
					MAM_TRD_R trdR = getDefTrdR(r.trd_ptn_typ());
					if (!isNull(trdR)) {
						r.trd_cd(trdR.trd_cd());
					}
				}
			}
			return msgL;
		}
		
		/**
		 * ロットNO、サブロットNOの補完処理
		 */
		protected void cmplLotNo(MCList<StkXfrActIF_DtlGiR> dtlL) {
			dtlL.forEach(r -> {
				r.lot_no(nvl(r.lot_no(), MAC_STR.NULL_VAL.value()));
				r.sublot_no(nvl(r.sublot_no(), MAC_STR.NULL_VAL.value()));
			});
		}
		
		/**
		 * 在庫振替実績明細に対するデータ補完を行う
		 */
		protected MCMessageList cmplStkXfrActD(MCList<StkXfrActIF_DtlGiR> dtlL) {
			MCMessageList msgL = new MCMessageList();

			// 更新のみ
			MCList<StkXfrActIF_DtlGiR> updL = dtlL.subList(MCRow.MODIFY);
			if (!updL.isEmpty()) {
				MCList<MST_STK_XFR_ACT_D_R> dbc = MCList.create(MST_STK_XFR_ACT_D_R.class);
				MST_STK_XFR_ACT_D_R t = MST_STK_XFR_ACT_D_R.create("T");
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
				dbc_bldr.setSelect(
					t.stk_xfr_act_d_no,
					t.intr_d_rmrks,
					t.trd_d_rmrks,
					t.sub_char1,
					t.sub_char1,
					t.sub_char2,
					t.sub_char3
				);
				dbSelectKey("MSBEL6510_MST_STK_XFR_ACT_D_S01", dbc, dbc_bldr, updL);
	
				// xxx更新フラグに対応する項目に対して、データ補完を行う
				MCIndexKey idx = dbc.createIndex(MST_STK_XFR_ACT_D_R.$stk_xfr_act_d_no);
				updL.forEach(r -> {
					MST_STK_XFR_ACT_D_R actDR = dbc.getFirst(idx, r.stk_xfr_act_d_no());
					// データ補完
					if(!isNull(actDR)){
						r.intr_d_rmrks(compVal(r.intr_d_rmrks_upd_flg(), r.intr_d_rmrks(), actDR.intr_d_rmrks(), null));
						r.trd_d_rmrks(compVal(r.trd_d_rmrks_upd_flg(), r.trd_d_rmrks(), actDR.trd_d_rmrks(), null));
						r.sub_char1(compVal(r.sub_char1_upd_flg(), r.sub_char1(), actDR.sub_char1(), null));
						r.sub_char2(compVal(r.sub_char2_upd_flg(), r.sub_char2(), actDR.sub_char2(), null));
						r.sub_char3(compVal(r.sub_char3_upd_flg(), r.sub_char3(), actDR.sub_char3(), null));
					}
				});
			}
			
			// NULLに対する補完
			for (StkXfrActIF_DtlGiR r : dtlL) {
				r.itm_sub1(nvl(r.itm_sub1(), MAC_STR.NULL_VAL.value()));
				r.itm_sub2(nvl(r.itm_sub2(), MAC_STR.NULL_VAL.value()));
				r.itm_sub3(nvl(r.itm_sub3(), MAC_STR.NULL_VAL.value()));
				
				r.str_ln_cd(nvl(r.str_ln_cd(), MAC_STR.NULL_VAL.value()));
				r.stk_arrv_bp_cd(nvl(r.stk_arrv_bp_cd(), MAC_STR.NULL_VAL.value()));
				r.sno1(nvl(r.sno1(), MAC_STR.NULL_VAL.value()));
				r.sno2(nvl(r.sno2(), MAC_STR.NULL_VAL.value()));
				r.sno3(nvl(r.sno3(), MAC_STR.NULL_VAL.value()));
				r.sno4(nvl(r.sno4(), MAC_STR.NULL_VAL.value()));
				r.gd_cd(nvl(r.gd_cd(), getDefaultFeedStkGd().gd_cd()));
				r.quality_typ(nvl(r.quality_typ(), MAC_QUALITY_TYP.GOOD.value()));
				r.stk_bp_cd(nvl(r.stk_bp_cd(), MAC_STR.NULL_VAL.value()));
				
				r.fix_no_typ(nvl(r.fix_no_typ(), MSC_FIX_NO_TYP.NON.value()));
			}
			return msgL;
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
		 * 在庫振替実績SV チェック処理を実行する
		 */
		protected void callStkXfrActChkSrv() {
			MCIndexKey
				giIdx = up2().createIndex(StkXfrActIF_DtlGiR.$hdr_dtl_peg_no),
				grIdx = up3().createIndex(StkXfrActIF_DtlGiR.$hdr_dtl_peg_no);
			
			callStkXfrActChk01Srv(giIdx, grIdx);
			callStkXfrActChk02Srv(giIdx, grIdx);
			callStkXfrActChk03Srv();
		}
	
		/**
		 * 在庫振替実績SV 登録前チェック処理を実行する
		 */
		protected void callStkXfrActChk01Srv(MCIndexKey giIdx, MCIndexKey grIdx) {
			MCList<StkXfrActIF_HdrR> notErrL = getChkList(up1().subList(MCRow.CREATE));
			if (notErrL.isEmpty()) {
				return;
			}

			MCList<StkXfrActIF_DtlGiR> giL = getDtl(notErrL, up2(), giIdx);
			MCList<StkXfrActIF_DtlGiR> grL = getDtl(notErrL, up3(), grIdx);
			
			MSBEL_StkXfrActRegService.StkXfrAct_Chk01 o = MSBEL_StkXfrActRegService.crtStkXfrAct_Chk01();
			setAll(o.up0(), notErrL, createMap_StkXfrAct_HdrR_StkXfrActIF_HdrR());
			setAll(o.up1(), giL, createMap_StkXfrAct_DtlGiR_StkXfrActIF_DtlGiR());
			setAll(o.up2(), grL, createMap_StkXfrAct_DtlGiR_StkXfrActIF_DtlGiR());
			o.exec();

			// 下り電文に置き換える
			String[] hDestCols = new String[] {
					StkXfrActIF_HdrR.$err_flg, StkXfrActIF_HdrR.$io_upd_flg
			};
			String[] hSrcCols = new String[] {
					StkXfrAct_Chk01_HdrR.$err_flg, StkXfrAct_Chk01_HdrR.$io_upd_flg
			};
			String[] dDestCols = new String[] {
					StkXfrActIF_DtlGiR.$err_flg, StkXfrActIF_DtlGiR.$io_upd_flg,
					StkXfrActIF_DtlGiR.$pack_unit_qty, StkXfrActIF_DtlGiR.$pack_unit_cd
			};
			String[] dSrcCols = new String[] {
					StkXfrAct_Chk01_DtlGiR.$err_flg, StkXfrAct_Chk01_DtlGiR.$io_upd_flg,
					StkXfrAct_Chk01_DtlGiR.$pack_unit_qty, StkXfrAct_Chk01_DtlGiR.$pack_unit_cd
			};
			
			copyByPegNo(notErrL, hDestCols, o.down0(), hSrcCols);
			copyByPegNo(giL, dDestCols, o.down1(), dSrcCols);
			copyByPegNo(grL, dDestCols, o.down2(), dSrcCols);
		}
		
		/**
		 * 在庫振替実績SV 更新前チェック処理を実行する
		 */
		protected void callStkXfrActChk02Srv(MCIndexKey giIdx, MCIndexKey grIdx) {
			MCList<StkXfrActIF_HdrR> notErrL = getChkList(up1().subList(MCRow.MODIFY));
			if (notErrL.isEmpty()) {
				return;
			}

			MCList<StkXfrActIF_DtlGiR> giL = getDtl(notErrL, up2(), giIdx);
			MCList<StkXfrActIF_DtlGiR> grL = getDtl(notErrL, up3(), grIdx);
			
			MSBEL_StkXfrActRegService.StkXfrAct_Chk02 o = MSBEL_StkXfrActRegService.crtStkXfrAct_Chk02();
			setAll(o.up0(), notErrL, createMap_StkXfrAct_HdrR_StkXfrActIF_HdrR());
			setAll(o.up1(), giL, createMap_StkXfrAct_DtlGiR_StkXfrActIF_DtlGiR());
			setAll(o.up2(), grL, createMap_StkXfrAct_DtlGiR_StkXfrActIF_DtlGiR());
			o.exec();

			// 下り電文に置き換える
			String[] hDestCols = new String[] {
					StkXfrActIF_HdrR.$err_flg, StkXfrActIF_HdrR.$io_upd_flg, StkXfrActIF_HdrR.$dlv_slip_no
			};
			String[] hSrcCols = new String[] {
					StkXfrAct_Chk01_HdrR.$err_flg, StkXfrAct_Chk01_HdrR.$io_upd_flg, StkXfrAct_Chk01_HdrR.$dlv_slip_no
			};
			String[] dDestCols = new String[] {
					StkXfrActIF_DtlGiR.$err_flg, StkXfrActIF_DtlGiR.$io_upd_flg, StkXfrActIF_DtlGiR.$dlv_slip_no,
					StkXfrActIF_DtlGiR.$pack_unit_qty, StkXfrActIF_DtlGiR.$pack_unit_cd
			};
			String[] dSrcCols = new String[] {
					StkXfrAct_Chk01_DtlGiR.$err_flg, StkXfrAct_Chk01_DtlGiR.$io_upd_flg, StkXfrAct_Chk01_DtlGiR.$dlv_slip_no,
					StkXfrAct_Chk01_DtlGiR.$pack_unit_qty, StkXfrAct_Chk01_DtlGiR.$pack_unit_cd
			};
			
			copyByPegNo(notErrL, hDestCols, o.down0(), hSrcCols);
			copyByPegNo(giL, dDestCols, o.down1(), dSrcCols);
			copyByPegNo(grL, dDestCols, o.down2(), dSrcCols);
		}

		/**
		 * 在庫振替実績SV 削除前チェック処理を実行する
		 */
		protected void callStkXfrActChk03Srv() {
			MCList<StkXfrActIF_HdrR> notErrL = getChkList(up1().subList(MCRow.DELETE));
			if (notErrL.isEmpty()) {
				return;
			}
			
			MSBEL_StkXfrActRegService.StkXfrAct_Chk03 o = MSBEL_StkXfrActRegService.crtStkXfrAct_Chk03();
			setAll(o.up0(), notErrL, createMap_StkXfrAct_HdrR_StkXfrActIF_HdrR());
			o.exec();

			// 下り電文に置き換える
			String[] hDestCols = new String[] {
					StkXfrActIF_HdrR.$err_flg, StkXfrActIF_HdrR.$io_upd_flg
			};
			String[] hSrcCols = new String[] {
					StkXfrAct_Chk01_HdrR.$err_flg, StkXfrAct_Chk01_HdrR.$io_upd_flg
			};
			
			copyByPegNo(notErrL, hDestCols, o.down0(), hSrcCols);
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().err_flg(up0().err_flg());
			down1().setAll(up1());
			down2().setAll(up2());
			down3().setAll(up3());
			MCIndexKey
				idx1 = down2().createIndex(StkXfrActIF_DtlGiR.$hdr_dtl_peg_no, StkXfrActIF_DtlGiR.$err_flg),
				idx2 = down3().createIndex(StkXfrActIF_DtlGiR.$hdr_dtl_peg_no, StkXfrActIF_DtlGiR.$err_flg);
			down1().forEach(r -> {
				if (!isNull(down2().getFirst(idx1, r.hdr_dtl_peg_no(), true))
						|| !isNull(down3().getFirst(idx2, r.hdr_dtl_peg_no(), true))) {
					// 明細にエラーがある場合、ヘッダのエラーフラグをセットする。
					r.err_flg(true);
					r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
				}
			});
		}
	}
	
	/**
	 * StkXfrActIF_Upd01オペレーション.<p>
	 *
	 * 外部システムから在庫振替実績の登録、更新、取消を行います。<br>
	 */
	public class StkXfrActIF_Upd01 extends MSBEL_StkXfrActRcptIFService_MC_A.StkXfrActIF_Upd01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess();
			}
			catch (Exception e) {
				handleEx(e);
			}
			finally {
				setDown();
			}
		}

		@Override
		protected void doIt() {
			// 上り電文編集
			editUp();
			
			// チェック処理
			callThisChk01();
			throwOpeErr();
			
			// メイン処理
			callStkXfrActSrv();
		}
		
		/**
		 * 上り電文の編集する。
		 */
		protected void editUp() {
			// hdr_dtl_peg_noは受け取る値のため、受信IFサービスではセットしない。
			setPegNo(up1(),up2(),up3());
			
			up1().forEach(r -> r.setStatus(getRowStatus(r.data_crud_typ())));
			up2().forEach(r -> r.setStatus(getRowStatus(r.data_crud_typ())));
			up3().forEach(r -> r.setStatus(getRowStatus(r.data_crud_typ())));
		};
		
		protected Status getRowStatus (String data_crud_typ){
			if (MAC_DATA_CRUD_TYP.isCRT(data_crud_typ)) {
				return MCRow.CREATE;
			}
			else if (MAC_DATA_CRUD_TYP.isUPD(data_crud_typ)) {
				return MCRow.MODIFY;
			}
			else if (MAC_DATA_CRUD_TYP.isDEL(data_crud_typ)) {
				return MCRow.DELETE;
			}
			else {
				return MCRow.NONE;
			}
		}
		
		/**
		 * 登録前チェック処理を実行する
		 */
		protected void callThisChk01() {
			
			MSBEL_StkXfrActRcptIFService.Chk01 o = MSBEL_StkXfrActRcptIFService.crtChk01();
			MCRow.copyall(o.up0(), up0());
			o.up1().setAll(up1());
			o.up2().setAll(up2());
			o.up3().setAll(up3());
			o.exec();
			
			up0().err_flg(o.down0().err_flg());
			up1().setAll(o.down1());
			up2().setAll(o.down2());
			up3().setAll(o.down3());
		}
		
		/**
		 * IF更新区分を考慮し、更新対象のヘッダを取得する
		 */
		protected MCList<StkXfrActIF_HdrR> getUpdTgtL() {
			MCList<StkXfrActIF_HdrR> tgtL = MCList.create(StkXfrActIF_HdrR.class);

			// 1：すべて登録しない
			// 2：エラーを無視して登録
			// 3：エラー行まで登録
			if (MAC_IF_UPD_TYP.isALL_ERROR(up0().if_upd_typ())
				&& !isNull(up1().getFirst(StkXfrActIF_HdrR.$err_flg, true))) {
				// エラーあり、かつ「1：すべて登録しない」の場合、空のリストを返す
				return tgtL;
			}
			//up1().sort(StkXfrActIF_HdrR.$hdr_dtl_peg_no);
			for (StkXfrActIF_HdrR r : up1()) {
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
		
		/**
		 * 在庫振替実績SVを呼び出す
		 */
		protected void callStkXfrActSrv() {
			MCList<StkXfrActIF_HdrR> tgtL = getUpdTgtL();
			MCIndexKey
				tarLIdx = tgtL.createIndex(StkXfrActIF_HdrR.$hdr_dtl_peg_no),
				giIdx = up2().createIndex(StkXfrActIF_DtlGiR.$hdr_dtl_peg_no),
				grIdx = up3().createIndex(StkXfrActIF_DtlGiR.$hdr_dtl_peg_no);
			
			// 更新対象外のデータに処理結果状況区分をセットする。
			for (StkXfrActIF_HdrR up1 : up1()){
				if (isNull(tgtL.getFirst(tarLIdx, up1.hdr_dtl_peg_no()))) {
					up1.rtn_sts_typ(
							up1.err_flg() ? MAC_RTN_STS_TYP.ERR.value() : MAC_RTN_STS_TYP.NOT_EXE.value());
				}
			}
			
			callStkXfrActIns01Srv(tgtL, giIdx, grIdx);
			callStkXfrActUpd01Srv(tgtL, giIdx, grIdx);
			callStkXfrActDel01Srv(tgtL);
			
			// 更新対象のデータに処理結果状況区分をセットする。
			for (StkXfrActIF_HdrR up1 : tgtL){
				up1.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
			}
		}
		
		/**
		 * 在庫振替実績SV 登録処理を実行する
		 */
		protected void callStkXfrActIns01Srv(MCList<StkXfrActIF_HdrR> tgtL, MCIndexKey giIdx, MCIndexKey grIdx) {
			MCList<StkXfrActIF_HdrR> hdrL = tgtL.subList(MCRow.CREATE);
			if (hdrL.isEmpty()) {
				return;
			}
			
			MCList<StkXfrActIF_DtlGiR> giL = getDtl(hdrL, up2(), giIdx);
			MCList<StkXfrActIF_DtlGiR> grL = getDtl(hdrL, up3(), grIdx);
			
			MSBEL_StkXfrActRegService.StkXfrAct_Ins01 o = MSBEL_StkXfrActRegService.crtStkXfrAct_Ins01();
			setAll(o.up0(), hdrL, createMap_StkXfrAct_HdrR_StkXfrActIF_HdrR());
			setAll(o.up1(), giL, createMap_StkXfrAct_DtlGiR_StkXfrActIF_DtlGiR());
			setAll(o.up2(), grL, createMap_StkXfrAct_DtlGiR_StkXfrActIF_DtlGiR());
			o.exec();
			
			// 新規の場合は実績ＮＯが発番されるため受け取る
			String[] destCols = new String[] {StkXfrActIF_HdrR.$stk_xfr_act_no};
			String[] srcCols = new String[] {StkXfrAct_Chk01_HdrR.$stk_xfr_act_no};
			copyByPegNo(hdrL, destCols, o.down0(), srcCols);
		}
		
		/**
		 * 在庫振替実績SV 更新処理を実行する
		 */
		protected void callStkXfrActUpd01Srv(MCList<StkXfrActIF_HdrR> tgtL, MCIndexKey giIdx, MCIndexKey grIdx) {
			MCList<StkXfrActIF_HdrR> hdrL = tgtL.subList(MCRow.MODIFY);
			if (hdrL.isEmpty()) {
				return;
			}
			
			MCList<StkXfrActIF_DtlGiR> giL = getDtl(hdrL, up2(), giIdx);
			MCList<StkXfrActIF_DtlGiR> grL = getDtl(hdrL, up3(), grIdx);
			
			MSBEL_StkXfrActRegService.StkXfrAct_Upd01 o = MSBEL_StkXfrActRegService.crtStkXfrAct_Upd01();
			setAll(o.up0(), hdrL, createMap_StkXfrAct_HdrR_StkXfrActIF_HdrR());
			setAll(o.up1(), giL, createMap_StkXfrAct_DtlGiR_StkXfrActIF_DtlGiR());
			setAll(o.up2(), grL, createMap_StkXfrAct_DtlGiR_StkXfrActIF_DtlGiR());
			o.exec();
		}
		
		/**
		 * 在庫振替実績SV 削除処理を実行する
		 */
		protected void callStkXfrActDel01Srv(MCList<StkXfrActIF_HdrR> tgtL) {
			MCList<StkXfrActIF_HdrR> hdrL = tgtL.subList(MCRow.DELETE);
			if (hdrL.isEmpty()) {
				return;
			}
			
			MSBEL_StkXfrActRegService.StkXfrAct_Del01 o = MSBEL_StkXfrActRegService.crtStkXfrAct_Del01();
			setAll(o.up0(), hdrL, createMap_StkXfrAct_HdrR_StkXfrActIF_HdrR());
			o.exec();
		}
		
		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			down0().setAll(up1());
		}

		protected void handleSuccess() {
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
			if (up0().err_flg()) {
				throwErr(msgOpeErr());
			}
		}
	}

	protected MCList<StkXfrActIF_DtlGiR> getDtl(MCList<StkXfrActIF_HdrR> tgtL, MCList<StkXfrActIF_DtlGiR> upDtlL, MCIndexKey dtlIdx) {
		MCList<StkXfrActIF_DtlGiR> dtlL = MCList.create(StkXfrActIF_DtlGiR.class);
		tgtL.forEach(r -> {
			dtlL.addAll(upDtlL.subList(dtlIdx, r.hdr_dtl_peg_no()));
		});
		return dtlL;
	}
	
	protected Map_StkXfrAct_HdrR_StkXfrActIF_HdrR<StkXfrAct_Chk01_HdrR,StkXfrActIF_HdrR> createMap_StkXfrAct_HdrR_StkXfrActIF_HdrR() {
		return new Map_StkXfrAct_HdrR_StkXfrActIF_HdrR<StkXfrAct_Chk01_HdrR, StkXfrActIF_HdrR>();
	}

	public class Map_StkXfrAct_HdrR_StkXfrActIF_HdrR<D extends StkXfrAct_Chk01_HdrR, S extends StkXfrActIF_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {			
			addColumnPathMap(StkXfrAct_Chk01_HdrR.$peg_no, StkXfrActIF_HdrR.$peg_no);
			addColumnPathMap(StkXfrAct_Chk01_HdrR.$hdr_dtl_peg_no, StkXfrActIF_HdrR.$hdr_dtl_peg_no);
			addColumnPathMap(StkXfrAct_Chk01_HdrR.$stk_xfr_act_no, StkXfrActIF_HdrR.$stk_xfr_act_no);
			addColumnPathMap(StkXfrAct_Chk01_HdrR.$trd_cd, StkXfrActIF_HdrR.$trd_cd);
			addColumnPathMap(StkXfrAct_Chk01_HdrR.$trd_ptn_typ, StkXfrActIF_HdrR.$trd_ptn_typ);
			addColumnPathMap(StkXfrAct_Chk01_HdrR.$loc_cd, StkXfrActIF_HdrR.$loc_cd);
			addColumnPathMap(StkXfrAct_Chk01_HdrR.$wg_cd, StkXfrActIF_HdrR.$wg_cd);
			addColumnPathMap(StkXfrAct_Chk01_HdrR.$act_dpt_cd, StkXfrActIF_HdrR.$act_dpt_cd);
			addColumnPathMap(StkXfrAct_Chk01_HdrR.$act_usr_cd, StkXfrActIF_HdrR.$act_usr_cd);
			addColumnPathMap(StkXfrAct_Chk01_HdrR.$stk_xfr_act_tm, StkXfrActIF_HdrR.$stk_xfr_act_tm);
			addColumnPathMap(StkXfrAct_Chk01_HdrR.$ac_dt, StkXfrActIF_HdrR.$ac_dt);
			addColumnPathMap(StkXfrAct_Chk01_HdrR.$intr_rmrks, StkXfrActIF_HdrR.$intr_rmrks);
			addColumnPathMap(StkXfrAct_Chk01_HdrR.$trd_rmrks, StkXfrActIF_HdrR.$trd_rmrks);
			addColumnPathMap(StkXfrAct_Chk01_HdrR.$sub_char1, StkXfrActIF_HdrR.$sub_char1);
			addColumnPathMap(StkXfrAct_Chk01_HdrR.$sub_char2, StkXfrActIF_HdrR.$sub_char2);
			addColumnPathMap(StkXfrAct_Chk01_HdrR.$sub_char3, StkXfrActIF_HdrR.$sub_char3);
			addColumnPathMap(StkXfrAct_Chk01_HdrR.$stk_xfr_rsn_cd, StkXfrActIF_HdrR.$stk_xfr_rsn_cd);
			addColumnPathMap(StkXfrAct_Chk01_HdrR.$upd_cntr, StkXfrActIF_HdrR.$upd_cntr);
			addColumnPathMap(StkXfrAct_Chk01_HdrR.$sppl_cd, StkXfrActIF_HdrR.$sppl_cd);
			addColumnPathMap(StkXfrAct_Chk01_HdrR.$can_ac_dt, StkXfrActIF_HdrR.$can_ac_dt);
			addColumnPathMap(StkXfrAct_Chk01_HdrR.$upd_cntr, StkXfrActIF_HdrR.$upd_cntr);
			addColumnPathMap(StkXfrAct_Chk01_HdrR.$prnt_flg, StkXfrActIF_HdrR.$prnt_flg);
			addColumnPathMap(StkXfrAct_Chk01_HdrR.$io_upd_flg, StkXfrActIF_HdrR.$io_upd_flg);
			addColumnPathMap(StkXfrAct_Chk01_HdrR.$err_flg, StkXfrActIF_HdrR.$err_flg);
			addColumnPathMap(StkXfrAct_Chk01_HdrR.$dlv_slip_no, StkXfrActIF_HdrR.$dlv_slip_no);
			addColumnPathMap(StkXfrAct_Chk01_HdrR.$data_crud_typ, StkXfrActIF_HdrR.$data_crud_typ);
		}
	}
	
	protected Map_StkXfrAct_DtlGiR_StkXfrActIF_DtlGiR<StkXfrAct_Chk01_DtlGiR,StkXfrActIF_DtlGiR> createMap_StkXfrAct_DtlGiR_StkXfrActIF_DtlGiR() {
		return new Map_StkXfrAct_DtlGiR_StkXfrActIF_DtlGiR<StkXfrAct_Chk01_DtlGiR, StkXfrActIF_DtlGiR>();
	}

	public class Map_StkXfrAct_DtlGiR_StkXfrActIF_DtlGiR<D extends StkXfrAct_Chk01_DtlGiR, S extends StkXfrActIF_DtlGiR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$peg_no, StkXfrActIF_DtlGiR.$peg_no);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$hdr_dtl_peg_no, StkXfrActIF_DtlGiR.$hdr_dtl_peg_no);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$stk_xfr_act_d_no, StkXfrActIF_DtlGiR.$stk_xfr_act_d_no);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$stk_xfr_act_no, StkXfrActIF_DtlGiR.$stk_xfr_act_no);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$io_typ, StkXfrActIF_DtlGiR.$io_typ);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$itm_cd, StkXfrActIF_DtlGiR.$itm_cd);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$itm_sub1, StkXfrActIF_DtlGiR.$itm_sub1);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$itm_sub2, StkXfrActIF_DtlGiR.$itm_sub2);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$itm_sub3, StkXfrActIF_DtlGiR.$itm_sub3);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$str_ln_cd, StkXfrActIF_DtlGiR.$str_ln_cd);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$stk_arrv_bp_cd, StkXfrActIF_DtlGiR.$stk_arrv_bp_cd);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$lot_no, StkXfrActIF_DtlGiR.$lot_no);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$sublot_no, StkXfrActIF_DtlGiR.$sublot_no);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$sno1, StkXfrActIF_DtlGiR.$sno1);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$sno2, StkXfrActIF_DtlGiR.$sno2);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$sno3, StkXfrActIF_DtlGiR.$sno3);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$sno4, StkXfrActIF_DtlGiR.$sno4);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$sno1_mng_typ, StkXfrActIF_DtlGiR.$sno1_mng_typ);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$sno2_mng_typ, StkXfrActIF_DtlGiR.$sno2_mng_typ);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$sno3_mng_typ, StkXfrActIF_DtlGiR.$sno3_mng_typ);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$sno4_mng_typ, StkXfrActIF_DtlGiR.$sno4_mng_typ);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$fix_no_typ, StkXfrActIF_DtlGiR.$fix_no_typ);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$fix_no, StkXfrActIF_DtlGiR.$fix_no);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$gd_cd, StkXfrActIF_DtlGiR.$gd_cd);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$in_xfr_typ, StkXfrActIF_DtlGiR.$in_xfr_typ);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$quality_typ, StkXfrActIF_DtlGiR.$quality_typ);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$stk_insp_typ, StkXfrActIF_DtlGiR.$stk_insp_typ);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$stk_id_typ, StkXfrActIF_DtlGiR.$stk_id_typ);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$stk_bp_cd, StkXfrActIF_DtlGiR.$stk_bp_cd);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$trd_unit_qty, StkXfrActIF_DtlGiR.$trd_unit_qty);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$trd_unit_cd, StkXfrActIF_DtlGiR.$trd_unit_cd);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$pack_unit_qty, StkXfrActIF_DtlGiR.$pack_unit_qty);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$pack_unit_cd, StkXfrActIF_DtlGiR.$pack_unit_cd);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$base_unit_qty, StkXfrActIF_DtlGiR.$base_unit_qty);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$base_unit_cd, StkXfrActIF_DtlGiR.$base_unit_cd);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$intr_d_rmrks, StkXfrActIF_DtlGiR.$intr_d_rmrks);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$trd_d_rmrks, StkXfrActIF_DtlGiR.$trd_d_rmrks);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$disp_seq, StkXfrActIF_DtlGiR.$disp_seq);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$sub_char1, StkXfrActIF_DtlGiR.$sub_char1);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$sub_char2, StkXfrActIF_DtlGiR.$sub_char2);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$sub_char3, StkXfrActIF_DtlGiR.$sub_char3);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$sundry_itm_flg, StkXfrActIF_DtlGiR.$sundry_itm_flg);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$itm_nm, StkXfrActIF_DtlGiR.$itm_nm);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$stk_mng_typ, StkXfrActIF_DtlGiR.$stk_mng_typ);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$pack_flg, StkXfrActIF_DtlGiR.$pack_flg);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$crt_lot_flg, StkXfrActIF_DtlGiR.$crt_lot_flg);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$io_upd_flg, StkXfrActIF_DtlGiR.$io_upd_flg);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$err_flg, StkXfrActIF_DtlGiR.$err_flg);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$dlv_slip_no, StkXfrActIF_DtlGiR.$dlv_slip_no);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$data_crud_typ, StkXfrActIF_DtlGiR.$data_crud_typ);
		}
	}
	
	/**
	 * デフォルト格付ＣＤキャッシュ
	 */
	protected String _defGdCd = null;

	protected String getDefGdCd() {
		MAM_STK_GD_R t = MAM_STK_GD_R.create("T");
		MAM_STK_GD_R S1W = MAM_STK_GD_R.create("W");

		if (isNull(_defGdCd)) {
			MAM_STK_GD_R dbc = MAM_STK_GD_R.create();
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.gd_cd);
			dbc_bldr.setWhere(t.sort_seq.eq(subQuery().select(min(S1W.sort_seq)).from(S1W)));
			dbSelect("MSBEL6510_MAM_STK_GD_S01", dbc, dbc_bldr);
			_defGdCd = dbc.gd_cd();
		}
		return _defGdCd;
	}

	/**
	 * デフォルト取引キャッシュ
	 */
	protected MCList<MAM_TRD_R> _trdL = null;

	protected MCIndexKey _trdLIdx = null;

	protected MAM_TRD_R getDefTrdR(String trdPtnTyp) {

		if (isNull(_trdL)) {
			_trdL = MCList.create(MAM_TRD_R.class);
			MAM_TRD_R t = MAM_TRD_R.create("T");
			MCQueryApiBuilder _trdL_bldr = MCQueryApiBuilder.create(t);
			_trdL_bldr.setSelect(t.trd_cd, t.trd_ptn_typ, t.auto_adopt_flg);
			_trdL_bldr.setWhere(t.trd_ptn_typ.in(value(MAC_TRD_PTN_TYP.XFR_ITM.value()),
					value(MAC_TRD_PTN_TYP.XFR_LOT_SNO.value()),
					value(MAC_TRD_PTN_TYP.XFR_GRD.value()),
					value(MAC_TRD_PTN_TYP.XFR_PACK.value())));
			dbSelect("MSBEL6510_MAM_TRD_S01", _trdL, _trdL_bldr);
			_trdLIdx = _trdL.createIndex(MAM_TRD_R.$trd_ptn_typ,
					MAM_TRD_R.$auto_adopt_flg);
		}
		MAM_TRD_R trdR = _trdL.getFirst(_trdLIdx, trdPtnTyp, true);
		if (isNull(trdR)) {
			trdR = _trdL.getFirst(_trdLIdx, trdPtnTyp, false);
		}
		return trdR;
	}

	//FMCB CUSTOM END
}