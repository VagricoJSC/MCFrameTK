package mcframe.serverMSBD.MSBDL0090;

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
import mcframe.serverMS.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBD.MSBDL0090.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBD.MSBDL0090.Query.*;
import java.util.*;
import mcframe.serverMSBD.MSBDL5040.*;
import mcframe.serverMSBD.MSBDL5100.*;
import mcframe.serverMSBD.MSBDL5200.*;
import mcframe.serverMSUC.MSUCL0030.MSUCL_ProdUtil;
import mcframe.serverMSUC.MSUCL0110.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import mcframe.serverFXUC.FXUCL0170.FXUCL_PositiveValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_SmallLargeValidater;
import mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil;
import mcframe.commonCore.param.MCParam;
import static mcframe.serverMSBD.MSBDL5040.MSBDL_PurcUtil.*;
import mcframe.serverMAUC.MAUCL1110.MAUCL_DptUtil;
import mcframe.serverMSBF.MSBFL5210.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil;
import mcframe.serverMSLA.MSLAL5020.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBDL_PoListReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBDL_PoListReg_MC extends MSBDL_PoListReg_MC_A{
	//FMCB CUSTOM START
	/** 検索モード：ヘッダ */
	protected static final String DISP_UNIT_HDR = "1";
	/** 検索モード：明細 */
	protected static final String DISP_UNIT_DTL = "0";
	protected MCOperation _caller = null;
	/** 操作種別：承認後送信 */
	protected static final String OPE_SEND = "6";
	/** 操作種別：再送信する */
	protected static final String OPE_RE_SEND = "7";
	
	String _sysParm = getSysParm("MASTER_DT_BASE");
	//------------------------------
	// Cache
	//------------------------------
	/** 発注予定 */
	protected MCList<MST_PO_SCHD_R> _poSchdL = MCList.create(MST_PO_SCHD_R.class);
	//------------------------------
	// IndexKey
	//------------------------------
	/** 発注予定 */
	MCIndexKey _idxPoSchdL = null;
	//------------------------------
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 登録前チェック<br>
	 */
	public class Chk01 extends MSBDL_PoListReg_MC_A.Chk01 {
		//----------------------------------
		// Cache
		//----------------------------------
		/** 受注明細 */
		protected MCList<MST_SLO_D_R> _sloDL = MCList.create(MST_SLO_D_R.class);
		/** 品目禁止 */
		protected FXUCL_MCDbcCache<MAM_ITM_STOP_R> _itmStopL = null;
		/** 取引先禁止 */
		protected FXUCL_MCDbcCache<MAM_BP_STOP_R> _bpStopL = null;
		/** 案件手配紐付情報  */
		protected MCList<MST_WRK_SNO_R> _wrkSnoL = MCList.create(MST_WRK_SNO_R.class);
		/** 案件  */
		protected MCList<MST_WRK_R> _wrkL = MCList.create(MST_WRK_R.class);
		/** 発注先 */
		protected FXUCL_MCDbcCache<MAM_BP_R> _spplL = null;
		//----------------------------------
		// IndexKey
		//----------------------------------
		/** 受注明細 */
		protected MCIndexKey _idxSloDL = null;
		/** 案件手配紐付情報 */
		MCIndexKey _idxWrkSnoL = null;
		/** 案件*/
		MCIndexKey _idxWrkL = null;
		//----------------------------------
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			// 後続処理を呼び出さないようにするため、自分のチェックが終わった段階でヘッダ単位のエラーＦＬＧをセット（1回目）
			setHdrErr();
			// 後続ＳＶのチェック処理をコール
			callPoRegChk01();
			// 後続ＳＶのチェックで発生したエラーを参照してヘッダ単位のエラーＦＬＧをセット（2回目）
			setHdrErr();
			// 下り電文を設定
			setDown();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			// キャッシュ取得
			createCache();
			getDataForExistChk(up0());
			// 補完処理
			msgL.addAll(completion());
			return msgL;
		}

		@Override
		protected boolean isSetListLogicValue(MCNumber paramIndex, MCRow row, String column) {
			if (isSame(paramIndex, 0)) {
				// 諸口品の場合は品名補完しない
				if (isSame(column, Chk01_DtlR.$itm_nm)) {
					if (row.getBoolean(Chk01_DtlR.$sundry_itm_flg)) {
						return false;
					}
				}
			}
			return super.isSetListLogicValue(paramIndex, row, column);
		}

		@Override
		protected void putListLogicCheckBind() {
			super.putListLogicCheckBind();

			ListLogicBind trdBind = getListLogicBind(up0(), Chk01_DtlR.$trd_cd);
			trdBind.putBind(mcframe.commonMAUA.MAUAC0010.MAUAC_List.TrdCols.$i_func_id, (Comparable<?>)"MSBDP0090");
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			compl();
			msgL.addAll(checkExistItmDtl(getChkList(up0())));
			msgL.addAll(existBdCheck(up0()));
			msgL.addAll(checkSub(getChkList(up0())));
			msgL.addAll(chkDtlL());
			return msgL;
		}

		protected void compl() {
			for (Chk01_DtlR r : up0()) {
				// 手配ＮＯ１
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno1_mng_typ())) {
					r.sno1(MAC_STR.NULL_VAL.value());
				}
				else if (MAC_SNO_MNG_TYP.isMNG_REQ(r.sno1_mng_typ())) {
					r.sno1(nullValToNull(r.sno1()));
				}
				// 手配ＮＯ２
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno2_mng_typ())) {
					r.sno2(MAC_STR.NULL_VAL.value());
				}
				else if (MAC_SNO_MNG_TYP.isMNG_REQ(r.sno2_mng_typ())) {
					r.sno2(nullValToNull(r.sno2()));
				}
				// 手配ＮＯ３
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno3_mng_typ())) {
					r.sno3(MAC_STR.NULL_VAL.value());
				}
				else if (MAC_SNO_MNG_TYP.isMNG_REQ(r.sno3_mng_typ())) {
					r.sno3(nullValToNull(r.sno3()));
				}
				// 手配ＮＯ４
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno4_mng_typ())) {
					r.sno4(MAC_STR.NULL_VAL.value());
				}
				else if (MAC_SNO_MNG_TYP.isMNG_REQ(r.sno4_mng_typ())) {
					r.sno4(nullValToNull(r.sno4()));
				}

				if (!r.sppl_iv_flg()) {
					r.iv_itm_nm(null);
				}
				r.dlv_slip_invalid_flg(r.arr_skip_flg() && !r.purc_dlv_slip_flg());
			}
		}
		
		/**
		 * 発注ヘッダ単位でエラー制御を行う。ヘッダに含まれる明細にエラーがある場合はヘッダ単位でエラーとする。
		 * err_flgを参照するので、他のチェックでerr_flgがセットされた後で実行する必要がある。
		 * @param tmpL
		 */
		protected void setHdrErr() {

			MCList<Chk01_DtlR>[] upGroupList = up0().groupList("hdr_peg_no");
			for (MCList<Chk01_DtlR> tmpL : upGroupList) {
				MCList<Chk01_DtlR> errL = tmpL.subList(Chk01_DtlR.$err_flg, true);
				MCList<Chk01_DtlR> okL = tmpL.subList(Chk01_DtlR.$err_flg, false);
				if (!errL.isEmpty()) {
					for (Chk01_DtlR r : okL) {
						MCMessagePool.add(new MCMessage(r, null, MSBDL0134, toDispGUIIndex(r)));
						r.err_flg(true);
						r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
					}
				}
				errL.setStringNE(Chk01_DtlR.$rtn_sts_typ, MAC_RTN_STS_TYP.ERR.value());
			}
		}
		
		/**
		 * キャッシュを作成します
		 */
		protected void createCache() {
			// 発注予定
			createCachePoSchd(up0());
			// 受注明細
			createCacheSloD();
			// 品目禁止
			createCacheItmStop();
			// 取引先禁止
			createCacheBpStop();
			// 案件手配紐付情報
			createCacheWrkSno();
			// 案件
			createCacheWrk();
			// 発注先（取引先マスタ）
			createCacheSppl();
		}

		/**
		 * キャッシュ作成（受注明細）
		 * @param dtlL
		 * @return
		 */
		protected void createCacheSloD () {
			_sloDL = MCList.create(MST_SLO_D_R.class);
			MST_SLO_D_R t = MST_SLO_D_R.create("T");
			MCQueryApiBuilder sloDL_bldr = MCQueryApiBuilder.create(t);
			sloDL_bldr.setWhere(t.slo_d_no.eq(bind("slo_d_no")));
			dbSelect("MSBDL0090_MST_SLO_D_S01", _sloDL, sloDL_bldr, _poSchdL);
			_idxSloDL = _sloDL.createIndex(MST_SLO_D_R.$slo_d_no);
		}
		/**
		 * キャッシュ作成（品目禁止）
		 * @param dtlL
		 * @return
		 */
		protected void createCacheItmStop() {
			// 品目禁止マスタ取得
			_itmStopL = new FXUCL_MCDbcCache<MAM_ITM_STOP_R>(
					MCQueryApiBuilder.create(MAM_ITM_STOP_R.create("T")),
					up0().groupBy(Chk01_DtlR.$itm_cd,
					Chk01_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub2, Chk01_DtlR.$itm_sub3),
					Chk01_DtlR.$itm_cd, Chk01_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub2, Chk01_DtlR.$itm_sub3);
		}
		/**
		 * キャッシュ作成（取引先禁止マスタ）
		 */
		protected void createCacheBpStop() {
			// 取引先禁止マスタ取得
			_bpStopL = new FXUCL_MCDbcCache<MAM_BP_STOP_R>(
					MCQueryApiBuilder.create(MAM_BP_STOP_R.create("T")),
					up0().groupBy(Chk01_DtlR.$sppl_cd), Chk01_DtlR.$sppl_cd);
		}
		/**
		 * キャッシュ作成（案件手配紐付情報）
		 */
		protected void createCacheWrkSno () {
			_wrkSnoL = MCList.create(MST_WRK_SNO_R.class);
			MST_WRK_SNO_R t = MST_WRK_SNO_R.create("T");
			MCQueryApiBuilder wrkSnoL_bldr = MCQueryApiBuilder.create(t);
			wrkSnoL_bldr.setWhere(t.sno1.eq(bind("sno1")));
			dbSelect("MSBDL0090_MST_WRK_SNO_S01", _wrkSnoL, wrkSnoL_bldr, up0());
			_idxWrkSnoL = _wrkSnoL.createIndex(MST_WRK_SNO_R.$sno1);
		}
		/**
		 * キャッシュ作成（案件）
		 */
		protected void createCacheWrk () {
			_wrkL = MCList.create(MST_WRK_R.class);
			MST_WRK_R t = MST_WRK_R.create("T");
			MCQueryApiBuilder wrkL_bldr = MCQueryApiBuilder.create(t);
			wrkL_bldr.setWhere(t.wrk_no.eq(bind("wrk_no")));
			dbSelect("MSBDL0090_MST_WRK_S01", _wrkL, wrkL_bldr, _wrkSnoL);
			_idxWrkL = _wrkL.createIndex(MST_WRK_R.$wrk_no);
		}
		/**
		 * キャッシュ作成（取引先）
		 */
		protected void createCacheSppl() {
			_spplL = new FXUCL_MCDbcCache<MAM_BP_R>(
					MCQueryApiBuilder.create(MAM_BP_R.create("T")),
					up0().groupBy(Chk01_DtlR.$sppl_cd), Chk01_DtlR.$sppl_cd);
		}
		
		/**
		 * 補完処理
		 * @return
		 */
		protected MCMessageList completion() {
			MCMessageList msgL = new MCMessageList();
			// 発注予定
			msgL.addAll(completionPoSchd());
			// その他
			completionSub();
			// 発注登録サービスをコールするため単票形式に整える
			// ※editPegNoはヘッダ項目補完後に実行しないと、ヘッダの判定が正しく行われないので、ここで実行する
			editPegNo();
			return msgL;
		}
		
		/**
		 * 発注予定情報補完
		 */
		protected MCMessageList completionPoSchd () {
			MCMessageList msgL = new MCMessageList();
			for (Chk01_DtlR r : up0()) {
				if (isNull(r.po_schd_no())) {
					// 計画外の場合、依頼元納入希望日＝納入予定日
					r.rqst_dlv_rqst_tm(r.dlv_rqst_tm());
					continue;
				}
				MCMessageList tmpMsgL = new MCMessageList();
				MST_PO_SCHD_R poSchdR = _poSchdL.getFirst(_idxPoSchdL, r.po_schd_no());
				// 更新カウンタチェック
				tmpMsgL.addAll(checkUpdCntrNE(r, Chk01_DtlR.$po_schd_upd_cntr, poSchdR));
				
				if (tmpMsgL.size() == 0) {
					r.trd_cd(poSchdR.trd_cd());
					r.trd_ptn_typ(poSchdR.trd_ptn_typ());
					r.po_schd_src_typ(poSchdR.po_schd_src_typ());
					r.po_schd_src_no(poSchdR.po_schd_src_no());
					r.io_schd_pr_no(poSchdR.io_schd_pr_no());
					r.itm_cd(poSchdR.itm_cd());
					r.itm_sub1(poSchdR.itm_sub1());
					r.itm_sub2(poSchdR.itm_sub2());
					r.itm_sub3(poSchdR.itm_sub3());
					r.sundry_itm_flg(poSchdR.sundry_itm_flg());
					r.outsrc_flg(poSchdR.outsrc_flg());
					r.outsrc_itm_ord_no(poSchdR.outsrc_itm_ord_no());
					r.mfg_loc_cd(poSchdR.mfg_loc_cd());
					r.bom_ptn(poSchdR.bom_ptn());
					r.base_unit_cd(poSchdR.base_unit_cd());
					r.rqst_avl_rqst_dt(poSchdR.rqst_avl_rqst_dt());
					r.rqst_dlv_rqst_tm(poSchdR.rqst_dlv_rqst_tm());
					r.rqst_can_flg(poSchdR.rqst_can_flg());
					r.slo_no(poSchdR.slo_no());
					r.slo_d_no(poSchdR.slo_d_no());
					if (r.outsrc_flg()) {
						r.sppl_cd(poSchdR.sppl_cd());
						r.maker_cd(poSchdR.maker_cd());
					}
				}
				else {
					msgL.addAll(tmpMsgL);
				}
			}
			return msgL;
		}
		
		/**
		 * 補完処理
		 * @param dtlR
		 */
		protected void completionSub(){
			// 通貨補完
			up0().setStringNE(Chk01_DtlR.$base_cur_cd, getCo().base_cur_cd());
			up0().setStringNE(Chk01_DtlR.$ptax_cur_cd, getCo().ptax_cur_cd());
			// レート補完
			MCList<Chk01_DtlR>[] grpL = up0().groupList(Chk01_DtlR.$po_dt, Chk01_DtlR.$trd_cur_cd);
			for (MCList<Chk01_DtlR> tmpL : grpL) {
				if (isNull(tmpL.get(0).trd_cur_cd()) || isNull(tmpL.get(0).po_dt())) {
					continue;
				}
				Chk01_DtlR bindR =  Chk01_DtlR.create();
				bindR.po_dt(tmpL.get(0).po_dt());
				bindR.trd_cur_cd(tmpL.get(0).trd_cur_cd());
				bindR.ptax_cur_cd(getCo().ptax_cur_cd());
				bindR.xrate_cd(getCo().purc_xrate_cd());
				
				MCNumber xrate = null;
				MCNumber ptaxXrate = null;
				
				for (Chk01_DtlR r : tmpL) {
					if (!r.xrate_inpt_flg()) {
						if (isNull(xrate)) {
							xrate = execFuncNumber(createSqlId(LOGIC_ID, "MAPA_XCHNG$F_GET_PURC_XRATE", "01"),
									MAPA_XCHNG$F_GET_PURC_XRATE( bind("trd_cur_cd"), bind("po_dt")), bindR);
						}
						r.xrate_cd(getCo().purc_xrate_cd());
						r.xrate(xrate);
					}
					if (!isNull(bindR.ptax_cur_cd())) {
						if (!r.ptax_xrate_inpt_flg()) {
							if (isNull(ptaxXrate)) {
								ptaxXrate = execFuncNumber(createSqlId(LOGIC_ID, "MAPA_XCHNG$F_GET_XRATE", "01"),
										MAPA_XCHNG$F_GET_XRATE( bind("trd_cur_cd"), bind("ptax_cur_cd"),
												bind("xrate_cd"), bind("po_dt")), bindR);
							}
							r.ptax_xrate(ptaxXrate);
						}
					}
					else {
						r.ptax_xrate_inpt_flg(false);
						r.ptax_xrate(null);
					}
				}
			}
			
			for (Chk01_DtlR dtlR : up0()) {
				// 無償受給・ＶＭＩの場合単価無視
				if (isNonPurc(dtlR)) {
					dtlR.upri_not_tgt_flg(false);
					dtlR.trd_cur_upri(null);
					dtlR.trd_cur_proc_upri(null);
					dtlR.trd_cur_onr_prov_upri(null);
					dtlR.interim_flg(false);
					dtlR.trd_cur_dscnt_amt(null);
					dtlR.dscnt_rsn_cd(null);
					dtlR.bd_dpt_cd(null);
					dtlR.bd_dpt_nm(null);
					dtlR.bd_itm_cd(null);
					dtlR.bd_itm_sub1(null);
					dtlR.bd_itm_sub2(null);
					dtlR.bd_itm_sub3(null);
					dtlR.bd_itm_nm(null);
					dtlR.bd_lot_no(null);
					dtlR.bd_sublot_no(null);
					dtlR.bd_sno1(null);
					dtlR.bd_sno2(null);
					dtlR.bd_sno3(null);
					dtlR.bd_sno4(null);
					dtlR.bd_loc_cd(null);
					dtlR.bd_loc_nm(null);
					dtlR.bd_ctg_cd(null);
					dtlR.bd_ctg_nm(null);
					dtlR.bd_oper_cd(null);
					dtlR.bd_oper_nm(null);
					dtlR.bd_iv_no(null);
					dtlR.bd_slo_no(null);
					dtlR.bd_po_no(null);
					dtlR.tax_fix_flg(false);
					dtlR.tax_cd(null);
					dtlR.wtax_rate(null);
					dtlR.purc_upri_req_typ(null);
					dtlR.purc_schd_dt(null);
					dtlR.pay_crryovr_times(null);
				}
				if(isNull(dtlR.trd_cur_cd())){
					dtlR.xrate(null);
					dtlR.ptax_xrate(null);
				}

				if (dtlR.dscnt_itm_flg()) {
					dtlR.trd_unit_qty(MCNumber.ONE);
				}
				
				if (!isNull(dtlR.dlv_rqst_tm()) && !dtlR.dlv_rqst_tm().eqDate(dtlR.purc_schd_dt())) {
					dtlR.sync_flg(false);
				}
				if (!isSame(dtlR.trd_cur_cd(), getCo().base_cur_cd()) || 
						(!isSame(dtlR.trd_cur_cd(), getCo().ptax_cur_cd()) && !isNull(getCo().ptax_cur_cd()))) {
					dtlR.wtax_rate(null);
				}
				
				// 案件の補完
				MST_WRK_SNO_R wrkSnoR = _wrkSnoL.getFirst(_idxWrkSnoL, dtlR.sno1());
				if (!isNull(wrkSnoR)) {
					MST_WRK_R wrkR = _wrkL.getFirst(_idxWrkL, wrkSnoR.wrk_no());
					dtlR.wrk_no(wrkSnoR.wrk_no());
					if (!isNull(wrkR)) {
						dtlR.wrk_nm(wrkR.wrk_nm());
					}
				}
				if(!isNull(dtlR.bd_itm_cd())) {
					dtlR.bd_itm_sub1(nvl(dtlR.bd_itm_sub1(), MAC_STR.NULL_VAL.value()));
					dtlR.bd_itm_sub2(nvl(dtlR.bd_itm_sub2(), MAC_STR.NULL_VAL.value()));
					dtlR.bd_itm_sub3(nvl(dtlR.bd_itm_sub3(), MAC_STR.NULL_VAL.value()));
				}
				MAM_BP_R spplR = _spplL.get(dtlR.sppl_cd());
				dtlR.po_dlv_slip_flg(spplR.po_dlv_slip_flg());
			}
		}


		/**
		 * チェック処理
		 * @param hdrR
		 * @param dtlL
		 * @return
		 */
		protected MCMessageList checkSub(MCList<Chk01_DtlR> dtlL) {
			MCMessageList msgL = new MCMessageList();
			// 全般的なチェック
			msgL.addAll(checkDecPlace(dtlL, Chk01_DtlR.$trd_unit_dec_place, Chk01_DtlR.$trd_unit_qty));
			msgL.addAll(checkDecPlace(dtlL, Chk01_DtlR.$trd_cur_upri_dec_place, Chk01_DtlR.$trd_cur_upri));
			// 登録ＤＡＣチェック
			msgL.addAll(chkDac(dtlL));
			
			for (Chk01_DtlR dtlR : dtlL) {
				msgL.addAll(check(dtlR, Chk01_DtlR.$sno1, new FXUCL_RequiredValidater()));
				msgL.addAll(check(dtlR, Chk01_DtlR.$sno2, new FXUCL_RequiredValidater()));
				msgL.addAll(check(dtlR, Chk01_DtlR.$sno3, new FXUCL_RequiredValidater()));
				msgL.addAll(check(dtlR, Chk01_DtlR.$sno4, new FXUCL_RequiredValidater()));
				//----------------------------
				// チェック前処理
				//----------------------------
				// 直納区分
				setDrctDlvTyp(dtlR);
				// 外注の場合、単価を補完する
				if (dtlR.outsrc_flg() && up1().file_imp_flg()) {
					// 取引通貨単価
					if (isNull(dtlR.trd_cur_upri())) {
						if (!isNull(dtlR.trd_cur_proc_upri()) || !isNull(dtlR.trd_cur_onr_prov_upri())) {
							dtlR.trd_cur_upri(nvl(dtlR.trd_cur_proc_upri(), MCNumber.ZERO).add(nvl(dtlR.trd_cur_onr_prov_upri(), MCNumber.ZERO)));
						}
					}
					// 取引通貨加工単価
					if (isNull(dtlR.trd_cur_proc_upri()) && MAC_OUTSRC_UPRI_TYP.isPROC(dtlR.outsrc_upri_typ())) {
						dtlR.trd_cur_proc_upri(dtlR.trd_cur_upri());
					}
				}
				// 金額情報
				dtlR.setStringNE("xrate_rnd_typ", getCo().xrate_rnd_typ());
				dtlR.setStringNE("wtax_rnd_typ", getCo().wtax_rnd_typ());
				complProcUpriAmt(dtlR);
				MSBDL_PurcUtil.setAmtInfo(dtlR);
				// 外注かつ買戻し義務がオンの場合、加工金額を元に税額を再計算する
				if(dtlR.outsrc_flg() && dtlR.repurc_obli_flg() && MAC_OUTSRC_UPRI_TYP.isPROC_PROV(nvl(dtlR.outsrc_upri_typ(), getCo().outsrc_upri_typ()))) {
					if(dtlR.inc_tax_flg()) {
						// 内税の場合、有償支給単価を税額に含めないために、一旦加工単価×数量で導出し、後続処理で税額を差し引く
						MCNumber proc_inc_tax_amt = MAUCL_AmtUtil.getAmt(dtlR.trd_cur_proc_upri(),
								dtlR.trd_unit_qty(),
								dtlR.trd_cur_amt_dec_place(),
								dtlR.purc_amt_rnd_typ(),
								dtlR.trd_cur_dscnt_amt());
						dtlR.trd_cur_proc_amt(proc_inc_tax_amt);
						// 有償支給金額は金額-加工金額
						dtlR.trd_cur_onr_prov_amt(!isNull(dtlR.trd_cur_inc_tax_amt()) ? dtlR.trd_cur_inc_tax_amt().subtract(proc_inc_tax_amt) : null);
					}
					MCNumber trdCurTaxAmt = MAUCL_AmtUtil.getTaxAmt(
							dtlR.trd_cur_proc_amt(),
							dtlR.tax_rate(),
							dtlR.trd_cur_amt_dec_place(),
							dtlR.purc_tax_rnd_typ(),
							dtlR.inc_tax_flg()
							);
					dtlR.trd_cur_tax_amt(trdCurTaxAmt);
					if(dtlR.inc_tax_flg()) {
						MCNumber amt = (dtlR.trd_cur_inc_tax_amt() != null) ? dtlR.trd_cur_inc_tax_amt().subtract(trdCurTaxAmt) : null;
						MCNumber proc_amt = !isNull(dtlR.trd_cur_proc_amt()) ? dtlR.trd_cur_proc_amt().subtract(trdCurTaxAmt) : MCNumber.ZERO;
						dtlR.trd_cur_amt(amt);
						dtlR.trd_cur_proc_amt(proc_amt);
					}
					MCNumber inc_tax_amt = (!isNull(dtlR.trd_cur_amt())) ? dtlR.trd_cur_amt().add(trdCurTaxAmt) : null;
					dtlR.trd_cur_inc_tax_amt(inc_tax_amt);
				}
				
				// 値引品の場合
				if (dtlR.dscnt_itm_flg()) {
					// 数量は1固定
					dtlR.trd_unit_qty(MCNumber.ONE);
					dtlR.trd_unit_cd(dtlR.base_unit_cd());
					dtlR.trd_unit_nm(dtlR.base_unit_nm());
					dtlR.trd_unit_rnd_typ(dtlR.base_unit_rnd_typ());
					dtlR.trd_unit_dec_place(dtlR.base_unit_dec_place());
				}
				
				// 基準単位数量
				setBaseUnitInfo(dtlR);
				
				// 発注禁止でないか(取引先)
				MAM_BP_STOP_R bpStopR = _bpStopL.get(dtlR.sppl_cd());
				if (!isNull(bpStopR.po_stop_dt()) && bpStopR.po_stop_dt().lte(dtlR.po_dt())) {
					msgL.add(new MCMessage(dtlR, null , MSBDL0091, dtlR.sppl_cd(), toYMDString(dtlR.po_dt())));
				}
				// 発注禁止でないか(品目)
				MAM_ITM_STOP_R itmStopR =_itmStopL.get(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3());
				if (!isNull(itmStopR.po_stop_dt()) && itmStopR.po_stop_dt().lte(dtlR.po_dt())) {
					msgL.add(new MCMessage(dtlR, null , MSBDL0089, toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()), toYMDString(dtlR.po_dt()), toYMDString(itmStopR.po_stop_dt()), toDispGUIIndex(dtlR)));
				}
				//----------------------------
				// 条件付必須チェック
				//----------------------------
				if (dtlR.xrate_inpt_flg()) {
					// 為替レート指定の場合為替レート必須
					msgL.addAll(check(dtlR, Chk01_DtlR.$xrate, new FXUCL_RequiredValidater()));
				}
				if (dtlR.ptax_xrate_inpt_flg()) {
					// 納税為替レート指定の場合納税為替レート必須
					msgL.addAll(check(dtlR, Chk01_DtlR.$ptax_xrate, new FXUCL_RequiredValidater()));
				}
				if (dtlR.ver_flg()) {
					// 版管理対象の場合版が必須
					msgL.addAll(check(dtlR, Chk01_DtlR.$ver_no, new FXUCL_RequiredValidater()));
				}
				if (!isNonPurc(dtlR)) {
					// 無償受給・ＶＭＩ以外の場合
					msgL.addAll(check(dtlR, Chk01_DtlR.$purc_schd_dt, new FXUCL_RequiredValidater()));
					msgL.addAll(check(dtlR, Chk01_DtlR.$pay_crryovr_times, new FXUCL_RequiredValidater()));
					msgL.addAll(check(dtlR, Chk01_DtlR.$tax_cd, new FXUCL_RequiredValidater()));
				}
				
				//----------------------------
				// 外注関連チェック
				//----------------------------
				if (dtlR.outsrc_flg()) {
					msgL.addAll(check(dtlR, Chk01_DtlR.$trd_cur_proc_upri, new FXUCL_SmallLargeValidater(null, MCNumber.ZERO, null)));
					// 外注品のＶＭＩ・無償受給での発注はできない
					if (isNonPurc(dtlR)) {
						msgL.add(new MCMessage(dtlR, null , MSBDL0076, toDispGUIIndex(dtlR)));
					}
					// 外注品の経費購買はできない
					if (isXpnsPurc(dtlR)) {
						msgL.add(new MCMessage(dtlR, null , MSBDL0080, toDispGUIIndex(dtlR)));
					}
				}
				
				//----------------------------
				// 経費購買関連チェック
				//----------------------------
				boolean xpnsErrFlg = false;
				// 経費購買の場合、資産管理しない品目しか登録できない
				if (MAC_TRD_PTN_TYP.isPURC_XPNS(dtlR.trd_ptn_typ()) && MAC_ASSET_MNG_TYP.isMNG(dtlR.asset_mng_typ())) {
					msgL.add(new MCMessage(dtlR, null, MSBDL0149, toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()),
							toDispGUIIndex(dtlR)));
					xpnsErrFlg = true;
				}
				// 資産管理する品目に経費理由を設定できない
				if (MAC_ASSET_MNG_TYP.isMNG(dtlR.asset_mng_typ()) && dtlR.xpns_purc_flg()) {
					msgL.add(new MCMessage(dtlR, null, MSBDL0150, toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()),
							dtlR.purc_rsn_cd(), toDispGUIIndex(dtlR)));
					xpnsErrFlg = true;
				}
				// 資産管理しない品目には経費理由しか設定できない
				if (MAC_ASSET_MNG_TYP.isNOT_MNG(dtlR.asset_mng_typ()) && !dtlR.xpns_purc_flg()) {
					msgL.add(new MCMessage(dtlR, null, MSBDL0151, toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()),
							dtlR.purc_rsn_cd(), toDispGUIIndex(dtlR)));
					xpnsErrFlg = true;
				}
				if (!xpnsErrFlg && isXpnsPurc(dtlR) && !isNonPurc(dtlR)) {
					// 経費購買の場合負担部門は必須
					msgL.addAll(check(dtlR, Chk01_DtlR.$bd_dpt_cd, new FXUCL_RequiredValidater()));
		
				}
				//----------------------------
				// 金額関連チェック
				//----------------------------
				if (!isNull(dtlR.trd_cur_dscnt_amt()) && dtlR.trd_cur_dscnt_amt().gt(MCNumber.ZERO)) {
					// 値引理由の必須チェック
					msgL.addAll(check(dtlR, Chk01_DtlR.$dscnt_rsn_cd, new FXUCL_RequiredValidater()));
				}
				// 単価「0」指定で、値引額が入力されていないかチェック
				msgL.addAll(checkDscntAmt(dtlR, Chk01_DtlR.$trd_cur_upri, Chk01_DtlR.$trd_cur_dscnt_amt));
				
				// VMI・無償受給意外の場合
				if (!isNonPurc(dtlR)) {
					// 値引額が大きすぎて金額が負の値になってはいけない
					msgL.addAll(check(dtlR, Chk01_DtlR.$trd_cur_amt, new FXUCL_SmallLargeValidater(null, MCNumber.ZERO, null)));
					msgL.addAll(check(dtlR, Chk01_DtlR.$trd_cur_dscnt_amt, new FXUCL_PositiveValidater()));
					if (!up1().file_imp_flg()) {
						msgL.addAll(check(dtlR, Chk01_DtlR.$trd_cur_upri, new FXUCL_RequiredValidater()));
					}
				}
				
				//----------------------------
				// 依頼元に応じてチェック
				//----------------------------
				// ＷＧ間依頼または受注からの依頼の場合は、取引ＣＤに見合う仕入理由のみ選択可能
				if (MSC_PO_SCHD_SRC_TYP.isRQST(dtlR.po_schd_src_typ())
						||MSC_PO_SCHD_SRC_TYP.isSLO(dtlR.po_schd_src_typ())) {
					// 経費購買なのに仕入理由は不可
					if (isXpnsPurc(dtlR)) {
						if (!dtlR.xpns_purc_flg()) {
							msgL.add(new MCMessage(dtlR, null , MSBDL0079, toDispGUIIndex(dtlR)));
						}
					}
					// 取引が経費購買でないのに経費理由は不可
					else {
						if (dtlR.xpns_purc_flg()) {
							msgL.add(new MCMessage(dtlR, null , MSBDL0083, toDispGUIIndex(dtlR)));
						}
					}
				}
				
				//----------------------------
				// 納品先チェック（受注紐付の場合）
				//----------------------------
				if (!isNull(dtlR.slo_d_no()) && !dtlR.rqst_can_flg()) {
					MST_SLO_D_R sloDR = _sloDL.getFirst(_idxSloDL, dtlR.slo_d_no());
					if (!isNull(sloDR) && MAC_SLO_PROC_TYP.isPURC_DDLV(sloDR.proc_typ())) {
						if (diffSloDlvInfo(dtlR, sloDR)) {
							// 受注紐付の場合は、受注明細の納品先と同じでないといけない。
							msgL.add(new MCMessage(dtlR, null , MSBDL0088));
						}
						if (diffSloQtyInfo(dtlR, sloDR)) {
							// 受注紐付の場合は、受注明細の数量と同じでないといけない。
							msgL.add(new MCMessage(dtlR, Chk01_DtlR.$trd_unit_qty, MSBDL0161, sloDR.base_unit_qty(), dtlR.base_unit_qty(), toDispGUIIndex(dtlR)));
						}
						if (!MAC_PURC_ID_TYP.isPURC(dtlR.purc_id_typ())) {
							// 受注紐付の場合は、通常購買でないといけない。
							msgL.add(new MCMessage(dtlR, Chk01_DtlR.$purc_id_typ, MSBDL0155, dtlR.purc_id_typ(), toDispGUIIndex(dtlR)));
						}
						
					}
				}
				//----------------------------
				// その他チェック
				//----------------------------
				// 下請法対象取引先に対しては入荷同時検収でないといけない
				if (dtlR.subcon_flg() && !isNonPurc(dtlR)) {
					if (!dtlR.dlv_rqst_tm().eqDate(dtlR.purc_schd_dt())) {
						msgL.add(new MCMessage(dtlR, null , MSBDL0074, toDispGUIIndex(dtlR)));
					}
				}
				if (dtlR.dscnt_itm_flg() && !MAC_PURC_ID_TYP.isPURC(dtlR.purc_id_typ())) {
					msgL.add(new MCMessage(dtlR, null, MSBDL0190, toDispGUIIndex(dtlR)));
				}
				else if (!isNull(dtlR.outsrc_sppl_cd()) && MAC_PURC_ID_TYP.isVMI(dtlR.purc_id_typ())) {
					// ＶＭＩ品の支給直送は不可
					msgL.add(new MCMessage(dtlR, null, MSBDL0077, toDispGUIIndex(dtlR)));
				}
				else {

					// 資産管理しない品目のＶＭＩ発注は不可
					if (MAC_ASSET_MNG_TYP.isNOT_MNG(dtlR.asset_mng_typ()) && MAC_PURC_ID_TYP.isVMI(dtlR.purc_id_typ())) {
						msgL.add(new MCMessage(dtlR, null, MSBDL0148, toDispGUIIndex(dtlR)));
					}

					if (dtlR.arr_skip_flg() && MAC_PURC_ID_TYP.isFFR_RCV(dtlR.purc_id_typ())) {
						msgL.add(new MCMessage(dtlR, null, MSBDL0189, toDispGUIIndex(dtlR)));
					}
				}
			}
			
			return msgL;
		}
		
		protected void complProcUpriAmt(Chk01_DtlR dtlR) {
			if (dtlR.outsrc_flg()) {
				if (isNull(dtlR.trd_cur_proc_upri())) {
					dtlR.trd_cur_proc_upri(MCNumber.ZERO);
				}
			}
		}
		
		/**
		 * 品目詳細マスタの存在チェックを行います。
		 * @return
		 */
		protected MCMessageList checkExistItmDtl(MCList<Chk01_DtlR> dtlL) {
			MCList<MAM_ITM_DTL_R> itmDtlL = MCList.create(MAM_ITM_DTL_R.class);
			for (Chk01_DtlR r : dtlL) {
				// 品目詳細マスタの存在チェックを行う
				MAM_ITM_DTL_R itmDtlR = MAM_ITM_DTL_R.create();
				itmDtlR.setAttributes(r);
				itmDtlR.itm_cd(r.itm_cd());
				itmDtlR.itm_sub1(r.itm_sub1());
				itmDtlR.itm_sub2(r.itm_sub2());
				itmDtlR.itm_sub3(r.itm_sub3());
				itmDtlR.mfg_loc_cd(r.mfg_loc_cd());
				if(isNullOrNullVal(r.mfg_loc_cd())) {
					itmDtlR.sppl_cd(r.sppl_cd());
					itmDtlR.maker_cd(r.maker_cd());
				}
				else {
					itmDtlR.sppl_cd(MAC_STR.NULL_VAL.value());
					itmDtlR.maker_cd(MAC_STR.NULL_VAL.value());
				}
				itmDtlR.rqst_loc_cd(MAC_STR.NULL_VAL.value());
				itmDtlR.wg_cd(r.in_to_loc_wg_cd());
				itmDtlR.bom_ptn(r.bom_ptn());
				if (isSame(_sysParm,"1")) {
					itmDtlR.st_dt(r.rqst_avl_rqst_dt());
				}
				else {
					itmDtlR.st_dt(r.po_dt());
				}
				itmDtlL.add(itmDtlR);
			}
			return MSUCL_ProdUtil.chkItmDtlKey(itmDtlL);
		}
		
		/**
		 * 負担項目の各種ＮＯの存在チェックを行います。
		 * @param dtlL 明細上り電文リスト(新規、または更新)
		 * @return メッセージリスト
		 */
		protected MCMessageList existBdCheck(MCList<Chk01_DtlR> dtlL) {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_DtlR> bdLotChkTgtL = MCList.create(Chk01_DtlR.class);
					
			for (Chk01_DtlR dr : dtlL) {
				if (dr.getStatus() == MCRow.DELETE) {
					continue;
				}
				if (!isNull(dr.bd_po_no())) {
					if (!existsPoNo(dr.bd_po_no())) {
						msgL.add(new MCMessage(dr, Chk01_DtlR.$bd_po_no, MSBDL0175, dr.bd_po_no(), toDispGUIIndex(dr)));
					}
				}
				if (!isNull(dr.bd_slo_no())) {
					if (!existsSloNo(dr.bd_slo_no())) {
						msgL.add(new MCMessage(dr, Chk01_DtlR.$bd_slo_no, MSBDL0177, dr.bd_slo_no(), toDispGUIIndex(dr)));
					}
				}
				if (!isNull(dr.bd_lot_no()) && !isNull(dr.bd_itm_cd())) {
					bdLotChkTgtL.add(dr);
				}				
				if (!isNull(dr.bd_iv_no())) {
					if (!existsBdIvNo(dr.bd_iv_no())) {
						msgL.add(new MCMessage(dr, Chk01_DtlR.$bd_iv_no, MSBDL0179, dr.bd_iv_no(), toDispGUIIndex(dr)));
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
		protected void callLotServiceChkBdItm(MCList<Chk01_DtlR> dtlL) {
			if (dtlL.isEmpty()) {
				return;
			}		
			MSBFL_LotService.Lot_Chk03 ope = MSBFL_LotService.crtLot_Chk03();
			addAll(ope.up0(), dtlL, createMap_Lot_Chk03_CndR_Chk01_DtlR());
			ope.exec();		
			copyErrFlg(dtlL, ope.up0());
		}
		
		protected MCMessageList chkDtlL() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_DtlR>[] upGroupList = up0().groupList("hdr_peg_no");
			for (MCList<Chk01_DtlR> tmpL : upGroupList) {
				Chk01_DtlR hdrR = tmpL.get(0);
				MCList<Chk01_DtlR> interimL = tmpL.subList(Chk01_DtlR.$interim_flg, true);
				// 仮単価が含まれる場合、変更注文書発行予定日が必須
				if (hdrR.subcon_flg() && 0 < interimL.size()) {
					// upd_po_print_schd_dtはヘッダまとめ項目なので、interimLとtempLの明細は同じ。
					// tempLでメッセージをセットする処理は不要
					msgL.addAll(check(interimL, Chk01_DtlR.$upd_po_print_schd_dt, new FXUCL_RequiredValidater()));
				}
				// 値引品のみの登録は不可
				MCList<Chk01_DtlR> subL = tmpL.subList(Chk01_DtlR.$dscnt_itm_flg, true);
				if (isSame(tmpL.size(), subL.size())) {
					// ヘッダ単位のtempLに同じメッセージをセット
					for (Chk01_DtlR r : tmpL) {
						msgL.add(new MCMessage(r, null, MSBDL0092, toDispGUIIndex(r)));
					}
				}
			}
			return msgL;
		}
		
		/**
		 * 発注登録サービスのChk01を呼び出す。
		 */
		protected void callPoRegChk01(){
			MCList<Chk01_DtlR> dtlL = getChkList(up0());
			MSBDL_PoRegService.Po_Chk01 poChk01 = MSBDL_PoRegService.crtPo_Chk01();
			MCList<Chk01_DtlR>[] upGroupList = dtlL.groupList("hdr_peg_no");
			for (MCList<Chk01_DtlR> list : upGroupList) {
				// ヘッダ情報を作成
				Chk01_DtlR hdrR = list.get(0);
				Po_Ins01_HdrR ins01HdrR = Po_Ins01_HdrR.create();
				copy(ins01HdrR, hdrR, createMap_Po_Ins01_HdrR_Chk01_DtlR());
				poChk01.up0().add(ins01HdrR);

				int dtl2PegNo = 0;
				// 明細情報を作成
				for (Chk01_DtlR r : list) {
					Po_Ins01_DtlR ins01DtlR = Po_Ins01_DtlR.create();
					copy(ins01DtlR, r, createMap_Po_Ins01_DtlR_Chk01_DtlR());
					ins01DtlR.hdr_peg_no(hdrR.peg_no());
					poChk01.up1().add(ins01DtlR);
					
					Po_Ins01_Bndl_DtlR up2R = Po_Ins01_Bndl_DtlR.create();
					MST_PO_SCHD_R poSchdR = _poSchdL.getFirst(_idxPoSchdL, r.po_schd_no());
					String outsrcItmOrdNo = null;
					if (!isNull(poSchdR)) {
						up2R.po_schd_no(poSchdR.po_schd_no());
						if (!isNull(poSchdR.outsrc_itm_ord_no())) {
							outsrcItmOrdNo = poSchdR.outsrc_itm_ord_no();
						}
					}
					up2R.peg_no(dtl2PegNo++);
					up2R.dtl_peg_no(ins01DtlR.peg_no());
					up2R.outsrc_itm_ord_no(outsrcItmOrdNo);
					poChk01.up2().add(up2R);
				}
			}
			poChk01.exec();
			copyErrFlg(up0(), poChk01.down0());
			copyErrFlg(up0(), poChk01.down1().subList(Po_Ins01_DtlR.$err_flg, true));
		}
		/**
		 * 下り電文を設定します
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
		/**
		 * 対応する受注明細と納品先などを比較します。
		 * @param dtlR
		 * @param sloDR
		 * @return
		 */
		protected boolean diffSloDlvInfo(Chk01_DtlR dtlR, MST_SLO_D_R sloDR) {
			String dlvNm = null;
			if (dtlR.dlv_sundry_flg()) {
				dlvNm = dtlR.dlv_nm(); 
			}
			String tdlvNm = null;
			if (dtlR.tdlv_sundry_flg()) {
				tdlvNm = dtlR.tdlv_nm(); 
			}
			
			if (!isSame(dtlR.in_to_loc_cd(), nvl(sloDR.loc_cd(), sloDR.def_loc_cd()))
					|| !isSame(dtlR.str_ln_cd(), nvl(sloDR.str_ln_cd(), MAC_STR.NULL_VAL.value()))
					|| !isSame(dtlR.dlv_cd(), sloDR.dlv_cd())
					|| !isSame(dlvNm, sloDR.dlv_nm())
					|| !isSame(dtlR.dlv_sundry_flg(), sloDR.dlv_sundry_flg())
					|| !isSame(dtlR.dlv_zip_cd(), sloDR.dlv_zip_cd())
					|| !isSame(dtlR.dlv_addr1(), sloDR.dlv_addr1())
					|| !isSame(dtlR.dlv_addr2(), sloDR.dlv_addr2())
					|| !isSame(dtlR.dlv_addr3(), sloDR.dlv_addr3())
					|| !isSame(dtlR.dlv_addr4(), sloDR.dlv_addr4())
					|| !isSame(dtlR.dlv_tel(), sloDR.dlv_tel())
					|| !isSame(dtlR.dlv_fax(), sloDR.dlv_fax())
					|| !isSame(dtlR.tdlv_cd(), sloDR.tdlv_cd())
					|| !isSame(tdlvNm, sloDR.tdlv_nm())
					|| !isSame(dtlR.tdlv_sundry_flg(), sloDR.tdlv_sundry_flg())
					|| !isSame(dtlR.tdlv_zip_cd(), sloDR.tdlv_zip_cd())
					|| !isSame(dtlR.tdlv_addr1(), sloDR.tdlv_addr1())
					|| !isSame(dtlR.tdlv_addr2(), sloDR.tdlv_addr2())
					|| !isSame(dtlR.tdlv_addr3(), sloDR.tdlv_addr3())
					|| !isSame(dtlR.tdlv_addr4(), sloDR.tdlv_addr4())
					|| !isSame(dtlR.tdlv_cntct_dpt(), sloDR.tdlv_cntct_dpt())
					|| !isSame(dtlR.tdlv_cntct_psn(), sloDR.tdlv_cntct_psn())
					|| !isSame(dtlR.tdlv_tel(), sloDR.tdlv_tel())
					|| !isSame(dtlR.tdlv_fax(), sloDR.tdlv_fax())
			) {
				return true;
			}
			else {
				return false;
			}
		}
		/**
		 * 対応する受注明細と数量を比較します。
		 * @param dtlR
		 * @param sloDR
		 * @return true:差異あり/false：差異なし 
		 */
		protected boolean diffSloQtyInfo(Chk01_DtlR dtlR, MST_SLO_D_R sloDR) {
			if (!isSame(dtlR.base_unit_qty(), sloDR.base_unit_qty())
					|| !isSame(dtlR.base_unit_cd(), sloDR.base_unit_cd())) {
				// 仕入直送で受注数量と発注数量が異なっている
				return true;
			}
			else {
				// 仕入直送で受注数量と発注数量が同じである
				return false;
			}
		}
		/**
		 * 経費購買判定
		 * 取引パタンが経費購買であるか、資産管理しない品目を発注する場合は経費購買とする。
		 * @param poSchd
		 */
		protected boolean isXpnsPurc(Chk01_DtlR dtlR){
			if (MAC_TRD_PTN_TYP.isPURC_XPNS(dtlR.trd_ptn_typ()) || MAC_ASSET_MNG_TYP.isNOT_MNG(dtlR.asset_mng_typ())) {
				return true;
			} 
			else {
				return false;
			}
		}
		
		/**
		 * 発注登録サービスを実行する
		 */
		protected void editPegNo() {
			// ヘッダ単位の紐付ＮＯ
			up0().addNumberColumn("hdr_peg_no");			
			
			// １伝票単位のリスト
			MCList<Chk01_DtlR>[] upGroupList = makeGroupList(up0());
			for (MCList<Chk01_DtlR> list : upGroupList) {
				// ヘッダ単位の紐付けＮＯを発番
				list.setNumberNE("hdr_peg_no", list.get(0).peg_no());
			}
		}
	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 取り消し前チェック<br>
	 */
	public class Chk02 extends MSBDL_PoListReg_MC_A.Chk02 {
		//----------------------------------
		// Cache
		//----------------------------------
		/** 発注 */
		protected MCList<MST_PO_R> _poL = MCList.create(MST_PO_R.class);
		/** 発注明細 */
		protected MCList<MST_PO_D_R> _poDL = MCList.create(MST_PO_D_R.class);
		/** 入荷進捗 */
		protected MCList<MST_ARR_PR_R> _arrPrL = MCList.create(MST_ARR_PR_R.class);
		/** 承認ヘッダ */
		protected MCList<MBT_APRV_R> _aprvL = MCList.create(MBT_APRV_R.class);
		/** 発注先 */
		protected FXUCL_MCDbcCache<MAM_BP_R> _spplL = null;
		//----------------------------------
		// IndexKey
		//----------------------------------
		/** 発注 */
		protected MCIndexKey _idxPoL = null;
		/** 発注明細 */
		protected MCIndexKey _idxPoDL = null;
		/** 入荷進捗 */
		protected MCIndexKey _idxArrPrL = null;
		/** 承認ヘッダ */
		protected MCIndexKey _idxAprvL = null;
		//----------------------------------
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			super.doIt();
			editPegNo();
			callPoRegChk01();
			setHdrErr();
			setErrToRtnStsTyp();
			setDown();	
		}
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			// キャッシュ作成
			createCache();
			msgL = chkUpdCntr();
			if (!msgL.isEmpty()) {
				return msgL;
			}
			// 補完処理
			msgL.addAll(completion());
			return msgL;
		}
		

		protected MCMessageList chkUpdCntr() {
			MCMessageList msgL = new MCMessageList();
			for (Chk02_DtlR r : up0()) {
				// 排他チェック
				MST_PO_R poR = _poL.getFirst(_idxPoL, r.po_no());
				MCMessageList tmpMsgL = checkUpdCntrNE(r, Chk02_DtlR.$po_upd_cntr, poR);
				if (!tmpMsgL.isEmpty()) {
					msgL.addAll(tmpMsgL);
				}
			}
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			// 取消前チェック処理
			msgL.addAll(checkSubWhenDel());
			msgL.addAll(chkDac());
			return msgL;
		}
		protected MCMessageList chkDac() {
			up0().addStringColumn("bf_purc_dpt_cd");
			for (Chk02_DtlR r : up0()) {
				MST_PO_R poR = _poL.getFirst(_idxPoL, r.po_no());
				r.setString("bf_purc_dpt_cd", poR.purc_dpt_cd());
			}
			return checkWritableDptCdDac(up0(), "bf_purc_dpt_cd");
		}
		/**
		 * キャッシュを作成します
		 */
		protected void createCache() {
			// 発注予定
			createCachePoSchdForDel(up1());
			// 発注
			createCachePo();
			// 発注明細
			createCachePoD();
			// 入荷進捗
			createCacheArrPrInfo();
			// 承認ヘッダ
			createCacheAprvH();
			// 発注先（取引先マスタ）
			createCacheSppl();
		}
		
		/**
		 * 発注情報
		 */
		protected void createCachePo() {
			_poL = MCList.create(MST_PO_R.class);
			MST_PO_R t = MST_PO_R.create("T");
			MCQueryApiBuilder poL_bldr = MCQueryApiBuilder.create(t);
			MAM_BP_R bp = MAM_BP_R.create("BP");
			MCList<Chk02_DtlR> bindL = up0().groupBy(Chk02_DtlR.$po_no);
			poL_bldr.addSelect(bp.subcon_flg);
			poL_bldr.addLeftOuterJoin(bp, bracket( bp.bp_cd.eq(t.sppl_cd)));
			poL_bldr.setOrderByAsc(t.po_no);
			poL_bldr.setLockTable(t.po_no);
			dbSelectKeyForUpdateNoWait("MSBDL0090_MST_PO_S01", _poL, poL_bldr, bindL);
			_idxPoL = _poL.createIndex(MST_PO_R.$po_no);
		}
		/**
		 * 発注明細情報
		 */
		protected void createCachePoD () {
			_poDL = MCList.create(MST_PO_D_R.class);
			MST_PO_D_R t = MST_PO_D_R.create("T");
			MCQueryApiBuilder poDL_bldr = MCQueryApiBuilder.create(t);
			poDL_bldr.setWhere(t.po_no.eq(bind("po_no")));
			poDL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			dbSelect("MSBDL0090_MST_PO_D_S01", _poDL, poDL_bldr, up0().groupBy(Chk02_DtlR.$po_no));
			_idxPoDL = _poDL.createIndex(MST_PO_D_R.$po_no);
		}
		/**
		 * 入荷進捗情報
		 */
		protected void createCacheArrPrInfo () {
			_arrPrL = MCList.create(MST_ARR_PR_R.class);
			MST_ARR_PR_R t = MST_ARR_PR_R.create("T");
			MCQueryApiBuilder arrPrL_bldr = MCQueryApiBuilder.create(t);
			arrPrL_bldr.setOrderByAsc(t.po_d_no);
			arrPrL_bldr.setWhere(t.po_d_no.eq(bind("po_d_no")));
			dbSelectForUpdateNoWait("MSBDL0090_MST_ARR_PR_S01", _arrPrL, arrPrL_bldr, _poDL);
			_idxArrPrL = _arrPrL.createIndex(MST_ARR_PR_R.$po_d_no);
		}
		/**
		 * キャッシュ作成（承認）
		 * @param hdrR
		 * @return
		 */
		protected void createCacheAprvH() {
			_aprvL = MCList.create(MBT_APRV_R.class);
			MBT_APRV_R t = MBT_APRV_R.create("T");
			MCQueryApiBuilder aprvL_bldr = MCQueryApiBuilder.create(t);
			aprvL_bldr.setWhere(t.aprv_no.eq(bind("aprv_no")));
			aprvL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			dbSelect("MSBDL0090_MBT_APRV_S01", _aprvL, aprvL_bldr, _poL);
			_idxAprvL = _aprvL.createIndex(MBT_APRV_R.$aprv_no);
		}
		/**
		 * キャッシュ作成（取引先）
		 */
		protected void createCacheSppl() {
			_spplL = new FXUCL_MCDbcCache<MAM_BP_R>(
					MCQueryApiBuilder.create(MAM_BP_R.create("T")),
					up0().groupBy(Chk01_DtlR.$sppl_cd), Chk01_DtlR.$sppl_cd);
		}
		/**
		 * ロック及び補完処理
		 * @return
		 */
		protected MCMessageList completion() {
			MCMessageList msgL = new MCMessageList();
			// 発注
			msgL.addAll(completionPo(up0()));
			// 発注明細
			msgL.addAll(completionPoD(up0()));
			// 入荷進捗
			msgL.addAll(completionArrPrInfo(up0()));
			// 発注予定
			msgL.addAll(completionPoSchd(up0()));
			// その他
			completionSub(up0());
			return msgL;
		}
		/**
		 * 発注情報
		 */
		protected MCMessageList completionPo(MCList<Chk02_DtlR> up0L) {
			MCMessageList msgL = new MCMessageList();
			for (Chk02_DtlR r : up0L) {
				MST_PO_R poR = _poL.getFirst(_idxPoL, r.po_no());
				if (isNull(poR)) {
					continue;
				}
				r.po_no(poR.po_no());
				r.po_rev(poR.po_rev());
				r.trd_cd(poR.trd_cd());
				r.trd_ptn_typ(poR.trd_ptn_typ());
				r.purc_dpt_cd(poR.purc_dpt_cd());
				r.purc_dpt_wg_cd(poR.wg_cd());
				r.purc_usr_cd(poR.purc_usr_cd());
				r.sppl_cd(poR.sppl_cd());
				r.setBooleanNE("SUBCON_FLG", MCBooleanUtil.dbStringToBoolean(poR.getStringNE("SUBCON_FLG")));
				r.sppl_cntct_dpt(poR.sppl_cntct_dpt());
				r.sppl_cntct_psn(poR.sppl_cntct_psn());
				r.sppl_zip_cd(poR.sppl_zip_cd());
				r.sppl_addr1(poR.sppl_addr1());
				r.sppl_addr2(poR.sppl_addr2());
				r.sppl_addr3(poR.sppl_addr3());
				r.sppl_addr4(poR.sppl_addr4());
				r.sppl_tel(poR.sppl_tel());
				r.sppl_fax(poR.sppl_fax());
				r.po_dt(poR.po_dt());
				r.upd_po_print_schd_dt(poR.upd_po_print_schd_dt());
				r.po_print_flg(poR.po_print_flg());
				r.last_po_rev(poR.last_po_rev());
				r.trd_cur_cd(poR.trd_cur_cd());
				r.xrate(poR.xrate());
				r.xrate_inpt_flg(poR.xrate_inpt_flg());
				r.ptax_xrate(poR.ptax_xrate());
				r.ptax_xrate_inpt_flg(poR.ptax_xrate_inpt_flg());
				r.wrk_no(poR.wrk_no());
				r.tterm_cd1(poR.tterm_cd1());
				r.tterm_rmrks1(poR.tterm_rmrks1());
				r.tterm_cd2(poR.tterm_cd2());
				r.tterm_rmrks2(poR.tterm_rmrks2());
				r.tterm_cd3(poR.tterm_cd3());
				r.tterm_rmrks3(poR.tterm_rmrks3());
				r.aprv_flg(poR.aprv_flg());
				r.aprv_no(poR.aprv_no());
				r.aprv_sts_typ(poR.aprv_sts_typ());
				r.trd_rmrks(poR.trd_rmrks());
				r.intr_rmrks(poR.intr_rmrks());
				r.po_print_rmrks(poR.po_print_rmrks());
				r.dlv_slip_rmrks(poR.dlv_slip_rmrks());
				r.sub_char1(poR.sub_char1());
				r.sub_char2(poR.sub_char2());
				r.sub_char3(poR.sub_char3());
				r.edi_sub_char1(poR.edi_sub_char1());
				r.edi_sub_char2(poR.edi_sub_char2());
				r.edi_sub_char3(poR.edi_sub_char3());
				r.edi_sub_char4(poR.edi_sub_char4());
				r.edi_sub_char5(poR.edi_sub_char5());
				r.edi_sub_num1(poR.edi_sub_num1());
				r.edi_sub_dt1(poR.edi_sub_dt1());
			}
			return msgL;
		}
		
		/**
		 * 発注明細情報
		 */
		protected MCMessageList completionPoD (MCList<Chk02_DtlR> up0L) {
			MCMessageList msgL = new MCMessageList();
			// 伝票に含まれる全明細を取得
			MCList<Chk02_DtlR>[] groupL = up0L.groupList(Chk02_DtlR.$po_no);
			
			for (MCList<Chk02_DtlR> dtlL : groupL) {
				// 伝票に含まれる明細をすべて取得する。
				Chk02_DtlR hdrR = dtlL.get(0);
				MCList<MST_PO_D_R> subPoDL = _poDL.subList(_idxPoDL, hdrR.po_no());
				// ＤＢと上り電文の両方に含まれる明細にtrue、ＤＢにしか存在しない明細にfalseが設定される
				subPoDL.addBooleanColumn("find", false);
				MCIndexKey subIdxkey = subPoDL.createIndex(MST_PO_D_R.$po_d_no);
				
				if (hdrR.slip_del_flg()) {
					// ヘッダ取消の場合
					for (MST_PO_D_R poDR : subPoDL) {
						if (hdrR.pod().isEmpty()) {
							// １行目
							hdrR.pod(poDR);
						}
						else {
							// 明細がＮ件ある場合は補完する
							Chk02_DtlR r = hdrR.clone();
							r.hdr(hdrR.hdr());
							r.pod(poDR);
							// マスタから取得した値の移し替え
							r.subcon_flg(hdrR.getBooleanNE("SUBCON_FLG"));
							r.slip_del_flg(hdrR.slip_del_flg());
							r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
							up0().add(r);
						}
					}
				}
				else {
					for (Chk02_DtlR r: dtlL) {
						// 伝票取消で無い場合
						MST_PO_D_R poDR = subPoDL.getFirst(subIdxkey, r.po_d_no());
						r.pod(poDR);
						poDR.setBoolean("find", true);
					}
					// ＤＢにしか存在しない明細
					MCList<MST_PO_D_R> dbPoDL = subPoDL.subList("find", false);
					if (dbPoDL.size() > 0) {
						// 上ってこない明細も更新のみ行う
						for (MST_PO_D_R poDR : dbPoDL) {
							Chk02_DtlR r = Chk02_DtlR.create();
							r.hdr(hdrR.hdr());
							r.pod(poDR);
							// マスタから取得した値の移し替え
							r.subcon_flg(hdrR.getBooleanNE("SUBCON_FLG"));
							r.slip_del_flg(hdrR.slip_del_flg());
							r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
							r.only_upd_pod_flg(true);
							up0().add(r);
						}
					}
					else {
						// 全て画面から上ってきた明細の場合、ヘッダ削除にする
						dtlL.setBooleanNE("slip_del_flg", true);
					}
				}
			}
			
			// メイン処理で紐付けＮＯを発行すると、上らない明細に発番できないので、このタイミングで行う
			setPegNo(up0());
			return msgL;
		}
		/**
		 * 発注予定情報
		 */
		protected MCMessageList completionPoSchd (MCList<Chk02_DtlR> up0L) {
			MCMessageList msgL = new MCMessageList();
			MCIndexKey podIdx = up1().createIndex(Chk02_Dtl2R.$po_d_no);
			for (Chk02_DtlR dtlR : up0L) {
				MCList<Chk02_Dtl2R> subL = up1().subList(podIdx, dtlR.po_d_no());
				for (Chk02_Dtl2R r : subL) {
					MST_PO_SCHD_R poSchdR = _poSchdL.getFirst(_idxPoSchdL, r.po_schd_no());
					if (isNull(poSchdR)) {
						continue;
					}
					// 更新カウンタチェック
					MCMessageList tmpL = new MCMessageList();
					r.setAttributes(dtlR);
					tmpL.addAll(checkUpdCntrNE(r, Chk01_DtlR.$po_schd_upd_cntr, poSchdR));
					 
					if (tmpL.size() > 0) {
						msgL.addAll(tmpL);
						dtlR.err_flg(true);
					}
					else {
						r.base_unit_qty(poSchdR.base_unit_po_qty());
					}
				}
			}
			return msgL;
		}
		/**
		 * 入荷進捗情報
		 */
		protected MCMessageList completionArrPrInfo (MCList<Chk02_DtlR> up0L) {
			MCMessageList msgL = new MCMessageList();
			MCIndexKey podIdx = up1().createIndex(Chk02_Dtl2R.$po_d_no);
			for (Chk02_DtlR dtlR : up0L) {
				// 明細に対応する入荷進捗の排他チェックを行う
				Chk02_Dtl2R tmpDtl2R = up1().getFirst(podIdx, dtlR.po_d_no());
				MST_ARR_PR_R tmpArrPrR = _arrPrL.getFirst(_idxArrPrL, dtlR.po_d_no());
				
				MCMessageList tmpL = new MCMessageList();
				tmpL.addAll(checkUpdCntrNE(tmpDtl2R, Chk02_Dtl2R.$arr_pr_upd_cntr, tmpArrPrR));
				if (tmpL.size() > 0) {
					msgL.addAll(tmpL);
					dtlR.err_flg(true);
				}
				else {
					dtlR.abort_flg(tmpArrPrR.abort_flg());
					dtlR.arr_cnt_rmrks(tmpArrPrR.arr_cnt_rmrks());
				}
			}
			return msgL;
		}
		
		/**
		 * 補完処理
		 */
		protected void completionSub(MCList<Chk02_DtlR> up0L) {
			for (Chk02_DtlR dtlR : up0L) {
				MAM_BP_R spplR = _spplL.get(dtlR.sppl_cd());
				dtlR.po_dlv_slip_flg(spplR.po_dlv_slip_flg());
			}
		}
		
		/**
		 * 発注登録サービスのChk01を呼び出す。
		 */
		protected void callPoRegChk01(){
			MCList<Chk02_DtlR> dtlL = getNoErrList(up0());
			MSBDL_PoRegService.Po_Chk01 poChk01 = MSBDL_PoRegService.crtPo_Chk01();
			MCList<Chk02_DtlR>[] upGroupList = dtlL.groupList("hdr_peg_no");
			MCIndexKey schdKey = _poSchdL.createIndex(MST_PO_SCHD_R.$po_d_no);
			int dtl2PegNo = 0;
			for (MCList<Chk02_DtlR> list : upGroupList) {
				// ヘッダ情報を作成
				Chk02_DtlR hdrR = list.get(0);
				Po_Ins01_HdrR ins01HdrR = Po_Ins01_HdrR.create();
				copy(ins01HdrR, hdrR, createMap_Po_Ins01_HdrR_Chk02_DtlR());
				poChk01.up0().add(ins01HdrR);
				
				// 明細情報を作成
				for (Chk02_DtlR r : list) {
					Po_Ins01_DtlR ins01DtlR = Po_Ins01_DtlR.create();
					copy(ins01DtlR, r, createMap_Po_Ins01_DtlR_Chk02_DtlR());
					poChk01.up1().add(ins01DtlR);
					
					MCList<MST_PO_SCHD_R> bndlL = _poSchdL.subList(schdKey, r.po_d_no());
					for (MST_PO_SCHD_R bndlR : bndlL) {
						Po_Ins01_Bndl_DtlR up2R = Po_Ins01_Bndl_DtlR.create();
						up2R.peg_no(dtl2PegNo++);
						up2R.dtl_peg_no(r.peg_no());
						up2R.outsrc_itm_ord_no(r.pod().outsrc_itm_ord_no());
						up2R.po_d_no(r.pod().po_d_no());
						up2R.po_schd_no(bndlR.po_schd_no());
						up2R.setAttributes(r);
						poChk01.up2().add(up2R);
					}
					if(bndlL.isEmpty()){
						Po_Ins01_Bndl_DtlR up2R = Po_Ins01_Bndl_DtlR.create();
						up2R.peg_no(r.peg_no());
						up2R.dtl_peg_no(r.peg_no());
						up2R.outsrc_itm_ord_no(r.pod().outsrc_itm_ord_no());
						up2R.po_d_no(r.pod().po_d_no());
						poChk01.up2().add(up2R);
					}
				}
			}
			if (poChk01.up0().size() > 0) {
				poChk01.exec();
				copyErrFlg(dtlL, poChk01.down0());
				copyErrFlg(dtlL, poChk01.down1().subList(Po_Ins01_DtlR.$err_flg, true));
			}
		}
		/**
		 * 伝票取消時チェック
		 */
		protected MCMessageList checkSubWhenDel() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk02_DtlR>[] grpL = super.<Chk02_DtlR> getChkList(up0()).groupList(Chk02_DtlR.$po_no);
			
			for (MCList<Chk02_DtlR> tmpL : grpL) {
				Chk02_DtlR hdrR = tmpL.get(0);
				
				//--------------------------------------
				// ヘッダ単位のチェック
				//--------------------------------------
				boolean allErrFlg = false;
				for (Chk02_DtlR dtlR : tmpL) {
					// 承認中の場合は取消不可能
					MBT_APRV_R aprvR = _aprvL.getFirst(_idxAprvL, hdrR.aprv_no());
					if (!isNull(aprvR) 
							&& (MAC_APRV_STS_TYP.isFIX(aprvR.aprv_sts_typ()) 
									|| MAC_APRV_STS_TYP.isACPT(aprvR.aprv_sts_typ()))
							&& !aprvR.aprv_can_flg()) {
						allErrFlg = true;
						if (dtlR.up_flg()) {
							// メッセージは画面上に表示されている場合に設定する
							msgL.add(new MCMessage(hdrR, null , MSBDL0095));
						}
					}

					MST_ARR_PR_R prR = _arrPrL.getFirst(_idxArrPrL, dtlR.po_d_no());
					if (MSBDL_PurcUtil.chkPoNotUpd(prR, false)) {
						if (hdrR.slip_del_flg()) {
							// ヘッダモードの場合はヘッダ単位で取消可否を判定する為、上り電文に存在しない明細でも
							// 取消可能チェックを行う
							msgL.add(new MCMessage(hdrR, null, MSBDL0098, toDispGUIIndex(hdrR)));
							allErrFlg = true;
							break;
						}
						else {
							// 明細モードの場合は上り電文に存在する明細のみ取消可能チェックを行う
							if (dtlR.getBooleanNE("up_flg")) {
								msgL.add(new MCMessage(dtlR, null, MSBDL0098, toDispGUIIndex(dtlR)));
							}
						}

					}

				}
				
				if (allErrFlg) {
					tmpL.setBooleanNE(Chk02_DtlR.$err_flg, true);
				}
			}
			return msgL;			
		}
		
		/**
		 * 下り電文を設定します
		 */
		protected void setDown() {
			down0().setAll(up0());
			down1().setAll(up1());
		}
		/**
		 * 発注登録サービスを実行する
		 */
		protected void editPegNo() {
			// ヘッダ単位の紐付ＮＯ
			up0().addNumberColumn("hdr_peg_no");
			
			// １伝票単位のリスト
			MCList<Chk02_DtlR>[] upGroupList = up0().groupList(Chk02_DtlR.$po_no);
			for (MCList<Chk02_DtlR> list : upGroupList) {
				// ヘッダ単位の紐付けＮＯを発番
				list.setNumberNE("hdr_peg_no", list.get(0).peg_no());
			}
		}

		protected void setHdrErr() {
			// 伝票単位でチェック
			MCList<Chk02_DtlR>[] grpL = up0().groupList(Chk02_DtlR.$po_no);
			for (MCList<Chk02_DtlR> tmpL : grpL) {
				MCList<Chk02_DtlR> errL = tmpL.subList(Chk02_DtlR.$err_flg, true);
				MCList<Chk02_DtlR> okL = tmpL.subList(Chk02_DtlR.$err_flg, false);
				if (!errL.isEmpty()) {
					for (Chk02_DtlR r : okL) {
						if (r.up_flg()) {
							MCMessagePool.add(new MCMessage(r, null, MSBDL0134, toDispGUIIndex(r)));
						}
						r.err_flg(true);
						r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
					}
				}
			}
		}
	}
	/**
	 * 発注予定情報
	 */
	protected void createCachePoSchd (MCList<?> bindL) {
		MCList<MST_PO_SCHD_R> tmpBindL = MCList.create(MST_PO_SCHD_R.class);
		// 明細
		for (MCRow r : bindL) {
			String poSchdNo = r.getStringNE("po_schd_no");
			if (!isNull(poSchdNo)){
				MST_PO_SCHD_R poSchdR = MST_PO_SCHD_R.create();
				poSchdR.po_schd_no(poSchdNo);
				tmpBindL.add(poSchdR);
			}
		}
		_poSchdL = MCList.create(MST_PO_SCHD_R.class);
		if (!tmpBindL.isEmpty()) {
			MST_PO_SCHD_R t = MST_PO_SCHD_R.create("T");
			MCQueryApiBuilder poSchdL_bldr = MCQueryApiBuilder.create(t);
			poSchdL_bldr.setOrderByAsc(t.po_schd_no);
			dbSelectKeyForUpdateNoWait("MSBDL0090_MST_PO_SCHD_S01",
					_poSchdL, poSchdL_bldr, tmpBindL.groupBy(MST_PO_SCHD_R.$po_schd_no));
		}
		_idxPoSchdL = _poSchdL.createIndex(MST_PO_SCHD_R.$po_schd_no);
	}
	
	/**
	 * 発注予定情報
	 */
	protected void createCachePoSchdForDel (MCList<?> bindL) {
		_poSchdL = MCList.create(MST_PO_SCHD_R.class);
		MST_PO_SCHD_R t = MST_PO_SCHD_R.create("T");
		MCQueryApiBuilder poSchdL_bldr = MCQueryApiBuilder.create(t);
		poSchdL_bldr.setWhere(t.po_d_no.eq(bind("po_d_no")));
		dbSelectForUpdateNoWait("MSBDL0090_MST_PO_SCHD_S02",
				_poSchdL, poSchdL_bldr, bindL.groupBy("po_d_no"));
		_idxPoSchdL = _poSchdL.createIndex(MST_PO_SCHD_R.$po_schd_no);
	}
	
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 発注を検索する<br>
	 */
	public class Srch01 extends MSBDL_PoListReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doSearchMain() {
			setUpTmpCol(up0());
			editSrchCnd(up0(), this);
			up0().addStringColumn("base_cur_cd", getCo().base_cur_cd());
			up0().addStringColumn("ptax_cur_cd", getCo().ptax_cur_cd());
			up0().addDateColumn("today", getToday());
			MCQueryPlan sql;
			if (isSame(DISP_UNIT_HDR, up0().disp_unit())) {
				if(up0().inc_past_flg()) {
					sql = MSBDL0090_MST_PO_P_S02();
				}else {
					sql = MSBDL0090_MST_PO_S02();	
				}
				if (isSame(up0().screen_ope(), OPE_DEL)){
					sql.addDynamicSQLInfo(MSBDL0090_MST_PO_S02_WHERE01());
				}
				if(up0().inc_past_flg()) {
					sql.addDynamicSQLInfo(MSBDL0090_MST_PO_P_S02_ORDER_BY());
				}else {
					sql.addDynamicSQLInfo(MSBDL0090_MST_PO_S02_ORDER_BY());
				}
				searchForDL(sql, up0(), down0(), Srch01_RsltR.$po_no);
			}
			else {
				sql = MSBDL0090_MST_PO_S04();
				if (isSame(up0().screen_ope(), OPE_DEL)){
					sql.addDynamicSQLInfo(MSBDL0090_MST_PO_S03_WHERE01());
				}
				sql.addDynamicSQLInfo(MSBDL0090_MST_PO_S03_ORDER_BY());
				searchForDL(
						sql
						, up0()
						, down0()
						, Srch01_RsltR.$po_no);
			}
		}
		
		@Override
		protected void doSearchSub() {
			super.doSearchSub();

			//「取消する」種別のみ
			if (up0().upd_flg()) {
				// 排他のために、伝票単位で更新カウンタを取得しておく
				// 表示する伝票に含まれるすべての発注予定
				MCList<MST_PO_SCHD_R> poSchdL = MCList.create(MST_PO_SCHD_R.class);
				MST_PO_SCHD_R t = MST_PO_SCHD_R.create("T");
				MCQueryApiBuilder poSchdL_bldr = MCQueryApiBuilder.create(t);
				poSchdL_bldr.setWhere(t.po_no.eq(bind("po_no")));
				dbSelect("MSBDL0090_MST_PO_SCHD_S03", poSchdL, poSchdL_bldr, down0());

				MCIndexKey idx = poSchdL.createIndex(MST_PO_SCHD_R.$po_d_no);

				// 表示する伝票に含まれるすべての発注明細
				MCList<MST_PO_D_R> poDL = MCList.create(MST_PO_D_R.class);
				MST_PO_D_R t1 = MST_PO_D_R.create("T");
				MCQueryApiBuilder poDL_bldr = MCQueryApiBuilder.create(t1);
				poDL_bldr.setWhere(t1.po_no.eq(bind("po_no")));
				poDL_bldr.addWhereWithAnd(t1.can_flg.eq(value(false)));
				dbSelect("MSBDL0090_MST_PO_D_S02", poDL, poDL_bldr, down0());

				// 表示する伝票に含まれるすべての入荷進捗
				MCList<MST_ARR_PR_R> arrPRL = MCList.create(MST_ARR_PR_R.class);
				MST_ARR_PR_R t2 = MST_ARR_PR_R.create("T");
				MCQueryApiBuilder arrPRL_bldr = MCQueryApiBuilder.create(t2);
				arrPRL_bldr.setWhere(t2.po_d_no.eq(bind("po_d_no")));
				dbSelect("MSBDL0090_MST_ARR_PR_S02", arrPRL, arrPRL_bldr, poDL);
				MCIndexKey arrPrIdx = arrPRL.createIndex(MST_ARR_PR_R.$po_d_no);
				for (MST_PO_D_R poDR : poDL) {
					Srch01_Rslt2R rslt2R = Srch01_Rslt2R.create();
					rslt2R.po_no(poDR.po_no());
					rslt2R.po_d_no(poDR.po_d_no());
					// 更新カウンタ設定
					MST_ARR_PR_R arrPrR = arrPRL.getFirst(arrPrIdx, poDR.po_d_no());
					rslt2R.arr_pr_upd_cntr(arrPrR.upd_cntr());
					MCList<MST_PO_SCHD_R> subSchdL = poSchdL.subList(idx, poDR.po_d_no());
					if (isNull(subSchdL)) {
						down1().add(rslt2R);
					}
					else {
						for (MST_PO_SCHD_R poSchdR : subSchdL) {
							Srch01_Rslt2R tmpR = rslt2R.clone();
							tmpR.po_schd_no(poSchdR.po_schd_no());
							tmpR.po_schd_upd_cntr(poSchdR.upd_cntr());
							down1().add(tmpR);
						}
					}
				}
			}
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
			setDlvSlip();
			filterDlvSlip();
			setPoSendIf();
			filterPoSendIf();
			
			if (isSame(DISP_UNIT_HDR, up0().disp_unit())) {
				// 検索結果にKPI情報を付与する
				searchKPIInfo();
				return;
			}
			setValuesDbc(up0(), down0());
			createCache();
			down0().setStringNE(Srch01_RsltR.$xrate_cd, getCo().purc_xrate_cd());
			down0().setStringNE(Srch01_RsltR.$xrate_rnd_typ, getCo().xrate_rnd_typ());
			down0().setStringNE(Srch01_RsltR.$wtax_rnd_typ, getCo().wtax_rnd_typ());
						
			for (Srch01_RsltR r : down0()) {
				// 計画発注予定日
				MST_PO_D_R poDR = _cachePoD.get(r.po_d_no());
				r.pln_po_schd_dt(poDR.getDateNE("pln_po_schd_dt"));
				
				// 出来高予定数量
				if (isNull(r.yield_schd_qty())) {
					r.yield_schd_qty(MCNumber.ZERO);	
				}
				
				// ＩＶ表記品名
				MAM_ITM_LCL_R itmLclR = _cacheItmLcl.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.prnt_lcl_cd());
				if (r.sppl_iv_flg()) {
					if (r.sundry_itm_flg()) {
						r.iv_itm_nm(r.getStringNE("pod_iv_itm_nm"));
					}
					else {
						r.iv_itm_nm(itmLclR.itm_nm());
					}
				}
				else {
					r.iv_itm_nm(null);
				}
				
				// 納品先
				String poDDlvNm = r.getStringNE("pod_dlv_nm");
				if (!isNull(poDDlvNm)) {
					r.dlv_nm(poDDlvNm);
				}
				
				// 配送先
				String poDTdlvNm = r.getStringNE("pod_tdlv_nm");
				if (!isNull(poDTdlvNm)) {
					r.tdlv_nm(poDTdlvNm);
				}
				
				// ＥＤＩ
				MAM_EDI_IF_CTL_R ediIfCtlR = _cacheEdi.get(getToday(), r.sppl_cd(), MAC_IF_PROC_TYP.PO_SEND.value());
				if (MCBooleanUtil.dbStringToBoolean(up0().getStringNE("ref_flg"))) {
					r.edi_flg(false);
				}
				else {
					if (isNull(ediIfCtlR.if_proc_typ()) || ediIfCtlR.del_flg()) {
						r.edi_flg(false);
					}
					else {
						r.edi_flg(true);
					}
				}
				if (isNull(ediIfCtlR.if_proc_typ()) || ediIfCtlR.del_flg()) {
					r.edi_tgt_flg(false);
				}
				else {
					r.edi_tgt_flg(true);
				}
				// 基準通貨金額を設定する
				MSBDL_PurcUtil.setBaseCurInfo(r);
				
				// 納税通貨金額を設定する
				MSBDL_PurcUtil.setPtaxCurInfo(r);
				
				// 有効成分
				if (r.cont_fctr_flg()) {
					MCNumber contQty =  MAUCL_MCDataUtil.convToContFctrUnit(
							  r.base_unit_qty()
							, r.std_cont_fctr()
							, r.cont_fctr_dec_place()
							, r.cont_fctr_rnd_typ());
					r.cont_qty(contQty);
				}
				// 次処理済み
				if (r.arr_flg() || r.purc_flg() || r.rcpt_iv_flg()) {
					r.next_opr_flg(true);
				}
				// 依頼元担当者
				r.rqst_fr_usr_cd(poDR.getStringNE("rqst_fr_usr_cd"));
				r.rqst_fr_usr_nm(poDR.getStringNE("rqst_fr_usr_nm"));
				// 依頼元部門
				r.rqst_fr_dpt_cd(poDR.getStringNE("rqst_fr_dpt_cd"));
				r.rqst_fr_dpt_nm(poDR.getStringNE("rqst_fr_dpt_nm"));
				// 買戻義務を設定
				if(r.outsrc_flg()) {
					r.repurc_obli_flg(r.sppl_repurc_obli_flg());
				}
			}
			// 納入場所の住所
			setInToLocAddr();
			
			// 検索結果にKPI情報を付与する
			searchKPIInfo();
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
		 * 納品書関連を設定する
		 */
		protected void setDlvSlip() {
			delPoWk();
			insPoWk();
			MCList<Srch01_RsltR> bindL = down0().clone();
			bindL.addStringColumn("tmp_can_flg");
			bindL.forEach(r -> r.setStringNE("tmp_can_flg", toTrueStr(r.can_flg())));
			MCList<Srch01_RsltR> rsltL = MCList.create(Srch01_RsltR.class);
			executeQuery(rsltL, MSBDL0090_MST_PURC_DLV_SLIP_S01(), bindL);
			
			delPoWk();
			if (rsltL.isEmpty()) {
				return;
			}
			// 最新の分のみ抽出（SQLでは改訂番号ごとに取得される）
			rsltL = rsltL.distinctNE(Srch01_RsltR.$po_d_no);
			
			MCIndexKey poIdx = down0().createIndex(Srch01_RsltR.$po_no);
			MCIndexKey poDIdx = down0().createIndex(Srch01_RsltR.$po_d_no);
			
			MCGroupByPolicy gp = new MCGroupByPolicy(Srch01_RsltR.$po_no);
			gp.max(Srch01_RsltR.$dlv_slip_no);
			gp.max(Srch01_RsltR.$dlv_print_flg);
			gp.max(Srch01_RsltR.$purc_ddlv_dlv_print_flg);
			for (Srch01_RsltR gr : rsltL.groupBy(gp)) {
				down0().subList(poIdx, gr.po_no()).forEach(r -> {
					r.dlv_slip_no(gr.dlv_slip_no());
					r.dlv_print_flg(gr.dlv_print_flg());
					r.purc_ddlv_dlv_print_flg(gr.purc_ddlv_dlv_print_flg());
				});
			}
			
			if (isSame(DISP_UNIT_DTL, up0().disp_unit())) {
				for (Srch01_RsltR glR : rsltL) {
					Srch01_RsltR downR = down0().getFirst(poDIdx, glR.po_d_no());
					if (!isNull(downR)) {
						downR.dlv_slip_no(glR.dlv_slip_no());
						downR.dlv_slip_seq(glR.dlv_slip_seq());
						downR.dlv_slip_rev(glR.dlv_slip_rev());
						downR.purc_ddlv_dlv_slip_no(glR.purc_ddlv_dlv_slip_no());
						downR.purc_ddlv_dlv_slip_rev(glR.purc_ddlv_dlv_slip_rev());
						downR.purc_ddlv_dlv_print_flg(glR.purc_ddlv_dlv_print_flg());
					}
				}
			}
		}
		protected void insPoWk() {
			dbWkInsert(
				"MSBDL0090_MSW_PO_I01",
				down0().distinctNE(Srch01_RsltR.$po_no, Srch01_RsltR.$po_rev),
				MST_PO_P_R.create("T")
			);
		}
		protected void delPoWk() {
			dbWkDelete("MSBBL0090_MSW_PO_D01", MST_PO_P_R.create("T"));
		}
		
		/**
		 * 納品書および仕入直送納品書の発行状況で絞り込む
		 */
		protected void filterDlvSlip() {
			// 納品書の発行状況で絞り込み
			filterDlvSlip(
				Srch01_CndR.$dlv_prnt_flg,
				Srch01_CndR.$not_dlv_prnt_flg,
				Srch01_RsltR.$dlv_print_flg);
			// 仕入直送納品書の発行状況で絞り込み
			filterDlvSlip(
				Srch01_CndR.$purc_ddlv_dlv_prnt_flg,
				Srch01_CndR.$not_purc_ddlv_dlv_prnt_flg,
				Srch01_RsltR.$purc_ddlv_dlv_print_flg
			);
		}
		protected void filterDlvSlip(String cndPrntCol, String cndNotPrntCol, String rsltPrntCol) {
			if ( !(up0().getBoolean(cndPrntCol) ^ up0().getBoolean(cndNotPrntCol)) ) {
				// 両フラグともオン、もしくは両フラグともオフの場合は対象外
				return;
			}
			
			boolean cndVal = up0().getBoolean(cndPrntCol) ? true : false;
			
			MCList<Srch01_RsltR> downL = MCList.create(Srch01_RsltR.class);
			for (Srch01_RsltR r : down0()) {
				if (isSame(r.getBoolean(rsltPrntCol), cndVal)) {
					downL.add(r);
				}
			}
			down0().setAll(downL);
		}
		/**
		 * 発注送信ＩＦ関連を設定する
		 */
		protected void setPoSendIf() {
			if ( !(isSame(up0().screen_ope(), OPE_SEND)
				|| isSame(up0().screen_ope(), OPE_RE_SEND)) ) {
				return;
			}
			
			delPoWk();
			insPoWk();
			
			MCList<Srch01_RsltR> rsltL = MCList.create(Srch01_RsltR.class);
			executeQuery(rsltL, MSBDL0090_MST_PO_SEND_IF_S01(), up0());
			
			delPoWk();
			if (rsltL.isEmpty()) {
				down0().clear();
				return;
			}
			
			MCIndexKey dwn0Idx = down0().createIndex(Srch01_RsltR.$po_no);
			MCList<Srch01_RsltR> dwn0L = MCList.create(Srch01_RsltR.class);
			MCList<Srch01_Rslt2R> dwn1L = MCList.create(Srch01_Rslt2R.class);
			for (MCList<Srch01_RsltR> gl : rsltL.groupList(Srch01_RsltR.$po_no)) {
				Srch01_RsltR poR = gl.get(0);
				Srch01_RsltR dwn0R = down0().getFirst(dwn0Idx, poR.po_no());
				if (!isNull(dwn0R)) {
					dwn0R.data_no(poR.data_no());
					dwn0R.data_crud_typ(poR.data_crud_typ());
					dwn0R.exe_sts_typ(poR.exe_sts_typ());
					dwn0R.sdrv_sts_typ(poR.sdrv_sts_typ());
					dwn0L.add(dwn0R);
				}
				
				for (Srch01_RsltR poDR : gl) {
					Srch01_Rslt2R dwn1R = Srch01_Rslt2R.create();
					dwn1R.po_no(poR.po_no());
					dwn1R.po_d_no(poR.po_d_no());
					dwn1R.data_no(poDR.data_no());
					dwn1R.data_lno(poDR.data_lno());
					dwn1R.po_send_if_upd_cntr(poDR.po_send_if_upd_cntr());
					dwn1L.add(dwn1R);
				}
			}
			
			down0().setAll(dwn0L);
			down1().addAll(dwn1L);
		}
		
		/**
		 * 送信対象、再送信対象を絞り込む
		 */
		protected void filterPoSendIf() {
			filterSend();
			filterReSend();
		}
		protected void filterSend() {
			if (!isSame(up0().screen_ope(), OPE_SEND)) {
				return;
			}
			// 操作種別「承認後送信」での送信対象は以下のいずれか
			// ・最終承認済み（データ更新区分＝新規） かつ (*1)
			// ・承認対象かつ最終承認済み以外（データ更新区分＝削除） かつ (*1)
			// (*1)：送受信状況区分：「未処理」 かつ ＰＧ実行状況区分：「未処理」
			MCList<Srch01_RsltR> downL = MCList.create(Srch01_RsltR.class);
			for (Srch01_RsltR r : down0()) {
				if (isSend(r)) {
					downL.add(r);
				}
			}
			down0().setAll(downL);
		}
		protected boolean isSend(Srch01_RsltR r) {
			if (r.aprv_flg()
				&& MAC_EXE_STS_TYP.isNOT_EXE(r.exe_sts_typ())
				&& MAC_SDRV_STS_TYP.isNOTYET(r.sdrv_sts_typ())) {
				
				if (MAC_APRV_STS_TYP.isACPT(r.aprv_sts_typ())
					|| MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					return true;
				}
			}
			return false;
		}
		protected void filterReSend() {
			if (!isSame(up0().screen_ope(), OPE_RE_SEND)) {
				return;
			}
			// 操作種別「再送信する」での送信対象は以下のいずれか
			// ・送受信状況区分：「未処理」 かつ ＰＧ実行状況区分：「スキップ」
			// ・送受信状況区分：「送信変換エラー」
			// ・送受信状況区分：「送信エラー」
			MCList<Srch01_RsltR> downL = MCList.create(Srch01_RsltR.class);
			for (Srch01_RsltR r : down0()) {
				if (isReSend(r)) {
					downL.add(r);
				}
			}
			down0().setAll(downL);
		}
		protected boolean isReSend(Srch01_RsltR r) {
			if (!isSend(r)
				&& !MAC_SDRV_STS_TYP.isSEND_OK(r.sdrv_sts_typ())) {
				return true;
			}
			return false;
		}
		
		/**
		 * KPI検索条件に一致する結果のみに絞ります。
		 */
		protected void searchKPIInfo() {
			MCList<Srch01_RsltR> rslt = MCList.create(Srch01_RsltR.class);
			if (isSame(DISP_UNIT_HDR, up0().disp_unit())) {
				// ヘッダモードの場合はKPI情報は関係ない
				rslt.addAll(down0());
			}
			else {
				// KPI項目の設定
				setKPIInfo();
				
				for (Srch01_RsltR r : down0()) {
					// 入荷進捗率(以上)が指定されている場合
					if (!isNull(up0().pr_arr_fr()) && r.arr_prgrs().lt(up0().pr_arr_fr())) {
						continue;
					}
					// 入荷進捗率(以下)が指定されている場合
					if (!isNull(up0().pr_arr_to()) && r.arr_prgrs().gt(up0().pr_arr_to())) {
						continue;
					}
					// 仕入進捗率（以上）が指定されている場合
					if (!isNull(up0().pr_purc_fr()) && r.purc_prgrs().lt(up0().pr_purc_fr())) {
						continue;
					}
					// 仕入進捗率（以下）が指定されている場合
					if (!isNull(up0().pr_purc_to()) && r.purc_prgrs().gt(up0().pr_purc_to())) {
						continue;
					}
					// すべての条件に一致すれば検索結果として表示する。
					rslt.add(r.clone());
				}
			}
			for (MCRow r : rslt) {
				putFuncName(r, Srch01_RsltR.$dtl_ins_func_id, Srch01_RsltR.$dtl_ins_func_nm);
				putFuncName(r, Srch01_RsltR.$dtl_upd_func_id, Srch01_RsltR.$dtl_upd_func_nm);
			}
			down0().clear();
			down0().setAll(rslt);
			if(rslt.isEmpty()){
				down1().clear();
			}
		}
		/**
		 * KPI項目を設定します
		 * @param list
		 */
		protected void setKPIInfo () {
			MCList<MST_PO_D_R> poDL = MCList.create(MST_PO_D_R.class);
			for (Srch01_RsltR r : down0()) {
				if (r.can_flg()) {
					continue;
				}
				MST_PO_D_R wkR = MST_PO_D_R.create();
				wkR.po_d_no(r.po_d_no());
				poDL.add(wkR);
			}
			MCQueryApiBuilder poDL_bldr = MCQueryApiBuilder.create(MST_PO_D_R.create("T"));
			dbWkDelete("MSBDL0090_MSW_PO_D_D01", poDL_bldr.getBaseDbc());
			dbWkInsert("MSBDL0090_MSW_PO_D_I01", poDL, poDL_bldr.getBaseDbc());
			
			// 検索条件設定
			MCRow bindR = MCRow.create();
			bindR.setDateNE("today", getToday());
			// 遅れ見込み数取得
			MCList<Srch01_RsltR> DlyPrspctQtyL = setDlyPrspctQty(bindR);
			MCIndexKey DlyPrspctQtyIdx = DlyPrspctQtyL.createIndex(Srch01_RsltR.$po_d_no);
			// 検索結果に反映
			for (Srch01_RsltR r : down0()) {
				if (r.can_flg()) {
					r.dly_prspct_qty(MCNumber.ZERO);
					continue;
				}
				Srch01_RsltR DlyPrspctQtyR = DlyPrspctQtyL.getFirst(DlyPrspctQtyIdx, r.po_d_no());
				r.dly_prspct_qty(DlyPrspctQtyR.dly_prspct_qty());
			}
			dbWkDelete("MSBDL0090_MSW_PO_D_D02", poDL_bldr.getBaseDbc());
		}
		
		/**
		 * 遅れ見込み数を算出します
		 * @param poDR
		 * @return
		 */
		protected MCList<Srch01_RsltR> setDlyPrspctQty(MCRow bindR) {
			// 納入予定日より遅くに回答されている数量を抽出
			MCList<Srch01_RsltR> rsltL = MCList.create(Srch01_RsltR.class);
			executeQuery(rsltL, MSBDL0090_MST_PO_D_S03(), bindR);
			return rsltL;
		}
		protected void createCache() {
			MCList<MAM_EDI_IF_CTL_R> bindEdiL = MCList.create(MAM_EDI_IF_CTL_R.class);
			for (Srch01_RsltR r : down0()) {
				bindEdiL.add(makeBindListEdi(r));
			}
			createChacheEdi(bindEdiL);
		}
		
		protected void setInToLocAddr() {
			Map<String, String[]> map = new HashMap<>();
			map.put(Srch01_RsltR.$in_to_loc_zip_cd, new String[]{Srch01_RsltR.$loc_addr_typ_zip_cd, MAC_LOC_ADDR_TYP.ZIP_CD.value()});
			map.put(Srch01_RsltR.$in_to_loc_addr1, new String[]{Srch01_RsltR.$loc_addr_typ_addr1, MAC_LOC_ADDR_TYP.ADDR1.value()});
			map.put(Srch01_RsltR.$in_to_loc_addr2, new String[]{Srch01_RsltR.$loc_addr_typ_addr2, MAC_LOC_ADDR_TYP.ADDR2.value()});
			map.put(Srch01_RsltR.$in_to_loc_addr3, new String[]{Srch01_RsltR.$loc_addr_typ_addr3, MAC_LOC_ADDR_TYP.ADDR3.value()});
			map.put(Srch01_RsltR.$in_to_loc_addr4, new String[]{Srch01_RsltR.$loc_addr_typ_addr4, MAC_LOC_ADDR_TYP.ADDR4.value()});
			map.put(Srch01_RsltR.$in_to_loc_tel, new String[]{Srch01_RsltR.$loc_addr_typ_tel, MAC_LOC_ADDR_TYP.TEL.value()});
			map.put(Srch01_RsltR.$in_to_loc_fax, new String[]{Srch01_RsltR.$loc_addr_typ_fax, MAC_LOC_ADDR_TYP.FAX.value()});
			
			for (String key : map.keySet()) {
				String[] binds = map.get(key);
				down0().setValue(binds[0], binds[1]);
				execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_LOC$F_GET_LOC_ADDR", "01"),
						MABSFunction.getFunctionExecuter("MAPA_LOC$F_GET_LOC_ADDR")
						, key
						, down0()
						, Srch01_RsltR.$in_to_loc_cd
						, Srch01_RsltR.$po_dt
						, binds[0]
						, Srch01_RsltR.$lcl_cd);
			}
		}
	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 発注予定を検索する<br>
	 */
	public class Srch02 extends MSBDL_PoListReg_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doSearchMain() {
			setUpTmpCol(up0());

			editSrchCnd(up0(), this);
			up0().addStringColumn("base_cur_cd", getCo().base_cur_cd());
			up0().addStringColumn("ptax_cur_cd", getCo().ptax_cur_cd());
			up0().addDateColumn("today", getToday());
			MCQueryPlan sql = MSBDL0090_MST_PO_SCHD_S02();
			searchForDL(
					sql
					, up0()
					, down0());
		}
		@Override
		protected void doSearchSub() {
			super.doSearchSub();
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
			setValuesDbc(up0(), down0());
			createCache();
			// 固定値の設定
			down0().setStringNE(Srch02_RsltR.$xrate_cd, getCo().purc_xrate_cd());
			down0().setStringNE(Srch02_RsltR.$xrate_rnd_typ, getCo().xrate_rnd_typ());
			down0().setStringNE(Srch02_RsltR.$wtax_rnd_typ, getCo().wtax_rnd_typ());
			down0().setDateNE(Srch02_RsltR.$po_dt, getToday());
			
			// 税・源泉税率初期値を設定
			setDefault();
			
			for (Srch02_RsltR r : down0()) {

				// 発注予定の登録日
				MCDate regDt = r.getDateNE("reg_dt");
				
				// 発注先
				MAM_BP_R spplR = MAM_BP_R.create();
				MAM_BP_SUB_R spplSubR = MAM_BP_SUB_R.create();
				spplR = _cacheBp.get(r.sppl_cd());
				spplSubR = _cacheBpSub.get(getToday(), r.sppl_cd());
				setSpplAddr(r, spplR, spplSubR);
				
				// 債務部門
				MAM_BP_SUB_R aspplSubR  = _cacheBpSub.get(regDt, r.asppl_cd());
				if (isNull(aspplSubR.ap_dpt_cd())) {
					MAM_DPT_R dptR = _cacheDpt.get(regDt, _cacheBp.get(r.asppl_cd()).getStringNE("ap_dpt_cd"));
					r.ap_dpt_cd(dptR.dpt_cd());
					r.ap_dpt_nm(dptR.dpt_nm());
				}
				else {
					MAM_DPT_R dptR = _cacheDpt.get(regDt, aspplSubR.ap_dpt_cd());
					r.ap_dpt_cd(dptR.dpt_cd());
					r.ap_dpt_nm(dptR.dpt_nm());
				}
				r.mst_ap_dpt_cd(r.ap_dpt_cd());
				if (isNull(r.ap_dpt_cd()) && r.ap_dpt_flg()) {
					r.ap_dpt_cd(r.purc_dpt_cd());
					r.ap_dpt_nm(r.purc_dpt_nm());
				}
				
				// 納入場所住所
				MAM_LOC_R locR = _cacheLoc.get(r.in_to_loc_cd());
				MAM_BP_SUB_R bpSub = _cacheBpSub.get(regDt, r.outsrc_sppl_cd());
				setInToLocAddr(r, locR, bpSub);
				
				// 品目詳細
				String spplCd = "";
				String makerCd = "";
				String mfgLocCd = "";
				String bomPtn = "";
				if (r.outsrc_flg()) {
					spplCd = MAC_STR.NULL_VAL.value();
					makerCd = MAC_STR.NULL_VAL.value();
					mfgLocCd = r.mfg_loc_cd();
					bomPtn = r.bom_ptn();
				}
				else {
					spplCd = r.sppl_cd();
					makerCd = r.maker_cd();
					mfgLocCd = MAC_STR.NULL_VAL.value();
					bomPtn = MAC_STR.NULL_VAL.value();
				}
				if (!isNullOr(spplCd, makerCd, mfgLocCd, bomPtn)) {
					MAM_ITM_DTL_R itmDtlR = _cacheItmDtl.get(
							isSame(_sysParm, "1") ? r.rqst_dlv_rqst_dt() : r.po_dt()
							, r.itm_cd()
							, r.itm_sub1()
							, r.itm_sub2()
							, r.itm_sub3()
							, mfgLocCd
							, spplCd
							, makerCd
							, MAC_STR.NULL_VAL.value()
							, r.in_to_loc_wg_cd()
							, bomPtn
							);
					r.purc_id_typ(itmDtlR.purc_id_typ());
					
					// 仕入計上区分
					if (!isNull(itmDtlR.purc_basis_typ())) {
						r.purc_basis_typ(itmDtlR.purc_basis_typ());
					}
					else if (!isNull(spplR.purc_basis_typ())) {
						r.purc_basis_typ(spplR.purc_basis_typ());
					}
					else {
						r.purc_basis_typ(MAC_PURC_BASIS_TYP.ANY_BASIS.value());
					}
				}
				// 買戻義務を設定
				if(r.outsrc_flg()) {
					r.repurc_obli_flg(r.sppl_repurc_obli_flg());
					r.outsrc_upri_typ(r.sppl_outsrc_upri_typ());
				}
				
				// ＥＤＩ
				MAM_EDI_IF_CTL_R ediIfCtlR = _cacheEdi.get(getToday(), r.sppl_cd(), MAC_IF_PROC_TYP.PO_SEND.value());
				if (isNull(ediIfCtlR.if_proc_typ()) || ediIfCtlR.del_flg()) {
					r.edi_flg(false);
					r.edi_tgt_flg(false);
				}
				else {
					r.edi_flg(true);
					r.edi_tgt_flg(true);
				}
				
				// インボイス表記名
				if (r.sppl_iv_flg()) {
					// 発注予定から取得したインボイス表記品名
					String poSchdIvItmNm = r.getStringNE("po_schd_iv_itm_nm");
					// 品目ロケールマスタ
					MAM_ITM_LCL_R itmLclR = _cacheItmLcl.get(
							r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.prnt_lcl_cd());
					if (r.sundry_itm_flg()) {
						if (isNull(poSchdIvItmNm)) {
							// マスタから取得
							r.iv_itm_nm(itmLclR.itm_nm());
						} else {
							// 発注予定から取得
							r.iv_itm_nm(poSchdIvItmNm);
						}
					}
					else {
						// マスタから取得
						r.iv_itm_nm(itmLclR.itm_nm());
					}
				}
				else {
					// インボイス表記品名は設定しない
				}
				
				// 納品先
				String poSchdDlvNm = r.getStringNE("po_schd_dlv_nm");
				if (!isNull(poSchdDlvNm)) {
					r.dlv_nm(poSchdDlvNm);
				}
				
				// 配送先
				String poSchdTdlvNm = r.getStringNE("po_schd_tdlv_nm");
				if (!isNull(poSchdTdlvNm)) {
					r.tdlv_nm(poSchdTdlvNm);
				}
				// 購買識別区分
				if (!isNull(r.dlv_cd())) {
					// 仕入直送の場合、通常購買とする
					r.purc_id_typ(MAC_PURC_ID_TYP.PURC.value());
				}
				else if (MAC_STK_MNG_TYP.isNOT_MNG(r.stk_mng_typ())) {
					// 非在庫品の場合、通常購買とする
					r.purc_id_typ(MAC_PURC_ID_TYP.PURC.value());
				}
				
				// 仕入計上区分
				setDefaultPurcBasisTyp(r);
				
				// 同時計上フラグ
				if (MAC_PURC_BASIS_TYP.isARR_BASIS(r.purc_basis_typ())) {
					r.sync_flg(true);
					r.purc_schd_dt(r.dlv_rqst_dt().trunc(MCDateFieldType.DAY));
				}
				else if (MAC_PURC_BASIS_TYP.isIN_BASIS(r.purc_basis_typ())) {
					r.sync_flg(false);
				}
				
				if (MAC_PURC_ID_TYP.isVMI(r.purc_id_typ())
						|| MAC_PURC_ID_TYP.isFFR_RCV(r.purc_id_typ())) {
					clrValForVmiFfrRcv(r);
				}
				else {
					// 取引通貨金額を設定する
					MSBDL_PurcUtil.setTrdCurInfo(r);
					// 買戻し義務がオンの場合、加工金額を元に税額を再計算する
					if(r.repurc_obli_flg() && MAC_OUTSRC_UPRI_TYP.isPROC_PROV(nvl(r.outsrc_upri_typ(), getCo().outsrc_upri_typ()))) {
						if(r.inc_tax_flg()) {
							// 内税の場合、有償支給単価を税額に含めないために、一旦加工単価×数量で導出し、後続処理で税額を差し引く
							MCNumber proc_inc_tax_amt = MAUCL_AmtUtil.getAmt(r.trd_cur_proc_upri(),
									r.trd_unit_qty(),
									r.trd_cur_amt_dec_place(),
									r.purc_amt_rnd_typ(),
									r.trd_cur_dscnt_amt());
							r.trd_cur_proc_amt(proc_inc_tax_amt);
							// 有償支給金額は金額-加工金額
							r.trd_cur_onr_prov_amt(!isNull(r.trd_cur_inc_tax_amt()) ? r.trd_cur_inc_tax_amt().subtract(proc_inc_tax_amt) : null);
						}
						MCNumber trdCurTaxAmt = MAUCL_AmtUtil.getTaxAmt(
								r.trd_cur_proc_amt(),
								r.tax_rate(),
								r.trd_cur_amt_dec_place(),
								r.purc_tax_rnd_typ(),
								r.inc_tax_flg()
								);
						r.trd_cur_tax_amt(trdCurTaxAmt);
						if(r.inc_tax_flg()) {
							MCNumber amt = (r.trd_cur_inc_tax_amt() != null) ? r.trd_cur_inc_tax_amt().subtract(trdCurTaxAmt) : null;
							MCNumber proc_amt = !isNull(r.trd_cur_proc_amt()) ? r.trd_cur_proc_amt().subtract(trdCurTaxAmt) : MCNumber.ZERO;
							r.trd_cur_amt(amt);
							r.trd_cur_proc_amt(proc_amt);
						}
					}
					
					// 基準通貨金額を設定する
					MSBDL_PurcUtil.setBaseCurInfo(r);

					// 納税通貨金額を設定する
					MSBDL_PurcUtil.setPtaxCurInfo(r);

					// 源泉税額を設定する
					if (isSame(r.trd_cur_cd(), r.base_cur_cd())
							&& (isSame(r.trd_cur_cd(), r.ptax_cur_cd())|| isNull(r.ptax_cur_cd()))) {
						MSBDL_PurcUtil.setWtaxInfo(r);
					}
					else {
						r.wtax_rate(null);
					}
				}
				
				// 有効成分
				if (r.cont_fctr_flg()) {
					MCNumber contQty =  MAUCL_MCDataUtil.convToContFctrUnit(
							  r.base_unit_qty()
							, r.std_cont_fctr()
							, r.cont_fctr_dec_place()
							, r.cont_fctr_rnd_typ());
					r.cont_qty(contQty);
				}
				if (isNull(r.po_print_cd())) {
					r.po_print_cd(getCo().po_print_cd());
					r.po_print_nm(getCoPoPrintNm());
				}
				r.dlv_slip_invalid_flg(r.arr_skip_flg() && !r.purc_dlv_slip_flg());
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
		 * 仕入計上区分の初期値を設定します。
		 */
		protected void setDefaultPurcBasisTyp(Srch02_RsltR r) {
			if (!isNull(r.dlv_cd())) {
				r.purc_basis_typ(MAC_PURC_BASIS_TYP.ARR_BASIS.value());
			}
			else if (r.arr_skip_flg()) {
				r.purc_basis_typ(MAC_PURC_BASIS_TYP.IN_BASIS.value());
			}
			else if (MAC_PURC_ID_TYP.isVMI(r.purc_id_typ()) || MAC_PURC_ID_TYP.isFFR_RCV(r.purc_id_typ())) {
				r.purc_basis_typ(MAC_PURC_BASIS_TYP.IN_BASIS.value());
			}
			else if (r.subcon_flg()) {
				r.purc_basis_typ(MAC_PURC_BASIS_TYP.ARR_BASIS.value());
			}
		}
		
		/**
		 * 下り電文から金額項目等を除外します。
		 */
		protected void clrValForVmiFfrRcv(Srch02_RsltR row) {
			row.pay_crryovr_times(null);
			row.purc_schd_dt(null);
			row.upri_not_tgt_flg(false);
			row.purc_upri_req_typ(null);
			row.sync_flg(false);
			row.tax_cd(null);
			row.tax_nm(null);
			row.tax_rate(null);
			row.tax_typ(null);
			row.inc_tax_flg(false);
			row.wtax_rate(null);
			row.trd_cur_upri(null);
			row.interim_flg(false);
			row.trd_cur_amt(null);
			row.trd_cur_tax_amt(null);
			row.trd_cur_inc_tax_amt(null);
			row.bd_dpt_cd(null);
			row.bd_dpt_nm(null);
			row.bd_itm_cd(null);
			row.bd_itm_sub1(null);
			row.bd_itm_sub2(null);
			row.bd_itm_sub3(null);
			row.bd_itm_nm(null);
			row.bd_lot_no(null);
			row.bd_sublot_no(null);
			row.bd_sno1(null);
			row.bd_sno2(null);
			row.bd_sno3(null);
			row.bd_sno4(null);
			row.bd_loc_cd(null);
			row.bd_loc_nm(null);
			row.bd_ctg_cd(null);
			row.bd_ctg_nm(null);
			row.bd_oper_cd(null);
			row.bd_oper_nm(null);
			row.bd_iv_no(null);
			row.bd_slo_no(null);
			row.bd_po_no(null);
		}
		
		protected void createCache() {
			// キャッシュ取得時に利用する条件（固定値）を電文に追加
			down0().addStringColumn("tmp_str_null_val", MAC_STR.NULL_VAL.value());
			down0().addDateColumn("today", getToday());
						
			// バインドリストの作成
			// 取引先
			MCList<MAM_BP_R> bindBpL = MCList.create(MAM_BP_R.class);
			// ＥＤＩ
			MCList<MAM_EDI_IF_CTL_R> bindEdiL = MCList.create(MAM_EDI_IF_CTL_R.class);
			
			for (Srch02_RsltR r : down0().distinctNE(Srch02_RsltR.$sppl_cd)) {
				// 取引先
				bindBpL.addAll(makeBindListBp(r));
				// ＥＤＩ
				bindEdiL.add(makeBindListEdi(r));
			}
			for (Srch02_RsltR r : down0().distinctNE(Srch02_RsltR.$asppl_cd)) {
				bindBpL.addAll(makeBindListBp(r));
			}
			for (Srch02_RsltR r : down0().distinctNE(Srch02_RsltR.$outsrc_sppl_cd)) {
				bindBpL.addAll(makeBindListBp(r));
			}
			
			// キャッシュの作成
			// 取引先・部門
			createCacheBp(bindBpL);
			// ＥＤＩ
			createChacheEdi(bindEdiL);
			// 品目詳細
			createCacheItmDtl();
		}
		
		protected MCList<MAM_BP_R> makeBindListBp(Srch02_RsltR r) {
			MCList<MAM_BP_R> bindBpL = MCList.create(MAM_BP_R.class);
			// バインドリストを作成する
			if (!isNull(r.sppl_cd())) {
				// 発注先
				MAM_BP_R bpR = MAM_BP_R.create();
				bpR.bp_cd(r.sppl_cd());
				bindBpL.add(bpR);
			}
			if (!isNull(r.asppl_cd())) {
				//　買掛先(補助情報を取得したいため)
				MAM_BP_R bpR = MAM_BP_R.create();
				bpR.bp_cd(r.asppl_cd());
				bindBpL.add(bpR);
			}
			if (!isNull(r.outsrc_sppl_cd())) {
				// 外注先(補助情報を取得したいため)
				MAM_BP_R bpR = MAM_BP_R.create();
				bpR.bp_cd(r.outsrc_sppl_cd());
				bindBpL.add(bpR);
			}
			return bindBpL;
		}
		
		protected FXUCL_MCDbcCache<MAM_BP_R> _cacheBp;
		protected FXUCL_MCDbcCacheStEnd<MAM_BP_SUB_R> _cacheBpSub;
		protected void createCacheBp(MCList<MAM_BP_R> bindBpL) {
			// 発注先・買掛先・外注先
			MCList<MAM_BP_R> bpL = MCList.create(MAM_BP_R.class);
			MAM_BP_R t = MAM_BP_R.create("T");
			MCQueryApiBuilder bp_bldr = MCQueryApiBuilder.create(t);
			bp_bldr.addSelect(t.ap_dpt_cd);
			bp_bldr.addSelect(t.zip_cd);
			bp_bldr.addSelect(t.addr1);
			bp_bldr.addSelect(t.addr2);
			bp_bldr.addSelect(t.addr3);
			bp_bldr.addSelect(t.addr4);
			bp_bldr.addSelect(t.tel);
			bp_bldr.addSelect(t.fax);
			bp_bldr.addSelect(t.sppl_cntct_dpt);
			bp_bldr.addSelect(t.sppl_cntct_psn);
			_cacheBp = new FXUCL_MCDbcCache<MAM_BP_R>(bpL, bp_bldr, bindBpL, MAM_BP_R.$bp_cd);
			
			// 発注先・買掛先・外注先(補助)
			_cacheBpSub = new FXUCL_MCDbcCacheStEnd<MAM_BP_SUB_R>(
					MCQueryApiBuilder.create(MAM_BP_SUB_R.create("T")),
					bindBpL, MAM_BP_R.$bp_cd);
			
			// 部門マスタ取得用のバインドリストを作る
			MCList<MAM_DPT_R> bindDptL = MCList.create(MAM_DPT_R.class);
			MCIndexKey idxSubLBpL = bpL.createIndex(MAM_BP_R.$asppl_flg);
			for (MAM_BP_R bpR : bpL.subList(idxSubLBpL, true)) {
				// 買掛先に設定されている債務部門を取得する
				MAM_DPT_R bySpplR = MAM_DPT_R.create();
				bySpplR.dpt_cd(bpR.getStringNE("ap_dpt_cd"));
				bindDptL.add(bySpplR);
				// 買掛先（補助）に設定されている債務部門を取得する
				MAM_BP_SUB_R aspplSubR = _cacheBpSub.get(getToday(), bpR.asppl_cd());
				MAM_DPT_R byAspplR = MAM_DPT_R.create();
				byAspplR.dpt_cd(aspplSubR.ap_dpt_cd());
				bindDptL.add(byAspplR);	
			}
			
			// 部門
			getChacheDpt(bindDptL);
		}
		
		protected FXUCL_MCDbcCacheStEnd<MAM_ITM_DTL_R> _cacheItmDtl;
		protected void createCacheItmDtl () {
			// 品目詳細
			MAM_ITM_DTL_R t = MAM_ITM_DTL_R.create("T");
			MCQueryApiBuilder itmDtl_bldr = MCQueryApiBuilder.create(t);
			itmDtl_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
			itmDtl_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			itmDtl_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			itmDtl_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			itmDtl_bldr.addWhereWithAnd(t.sppl_cd.eq(cases() .when(bind("outsrc_flg").eq(value(false))) 
					.then(bind("sppl_cd")) .otherwise(value(MAC_STR.NULL_VAL.value()))));
			itmDtl_bldr.addWhereWithAnd(t.maker_cd.eq(cases() .when(bind("outsrc_flg").eq(value(false))) 
					.then(bind("maker_cd")) .otherwise(value(MAC_STR.NULL_VAL.value()))));
			itmDtl_bldr.addWhereWithAnd(t.mfg_loc_cd.eq(cases() .when(bind("outsrc_flg").eq(value(false))) 
					.then(value(MAC_STR.NULL_VAL.value())) .otherwise(bind("mfg_loc_cd"))));
			itmDtl_bldr.addWhereWithAnd(t.bom_ptn.eq(cases() .when(bind("outsrc_flg").eq(value(false))) 
					.then(value(MAC_STR.NULL_VAL.value())) .otherwise(bind("bom_ptn"))));
			itmDtl_bldr.addWhereWithAnd(t.wg_cd.eq(bind("in_to_loc_wg_cd")));
			itmDtl_bldr.addWhereWithAnd(t.rqst_loc_cd.eq(value(MAC_STR.NULL_VAL.value())));
			_cacheItmDtl = new FXUCL_MCDbcCacheStEnd<MAM_ITM_DTL_R>(
					itmDtl_bldr
					, down0()
					, Srch01_RsltR.$itm_cd
					, Srch01_RsltR.$itm_sub1
					, Srch01_RsltR.$itm_sub2
					, Srch01_RsltR.$itm_sub3
					, Srch01_RsltR.$mfg_loc_cd
					, Srch01_RsltR.$sppl_cd
					, Srch01_RsltR.$maker_cd
					, "tmp_str_null_val"
					, Srch01_RsltR.$in_to_loc_wg_cd
					, Srch01_RsltR.$bom_ptn
					);
		}
		
		protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _cacheDpt;
		protected void getChacheDpt(MCList<MAM_DPT_R> bindDptL) {
			// 部門
			_cacheDpt = new FXUCL_MCDbcCacheStEnd<MAM_DPT_R>(
					MCQueryApiBuilder.create(MAM_DPT_R.create("T")),
					bindDptL, MAM_DPT_R.$dpt_cd);
		}
		
		protected void setInToLocAddr(Srch02_RsltR r, MAM_LOC_R locR, MAM_BP_SUB_R outsrcSpplSubR) {
			String zipCd = null;
			String addr1 = null;
			String addr2 = null;
			String addr3 = null;
			String addr4 = null;
			String tel = null;
			String fax = null;
			
			// 場所マスタから住所を補完するか否か
			if (locR.addr_flg()) {
				// 場所マスタから住所を取得するようにマスタ設定されている場合、場所マスタから住所を補完する
				zipCd = locR.getStringNE("loc_zip_cd");
				addr1 = locR.getStringNE("loc_addr1");
				addr2 = locR.getStringNE("loc_addr2");
				addr3 = locR.getStringNE("loc_addr3");
				addr4 = locR.getStringNE("loc_addr4");
				tel = locR.getStringNE("loc_tel");			
				fax = locR.getStringNE("loc_fax");
			}
			else if (isNull(r.outsrc_sppl_cd())) {
				// 場所マスタから住所を取得するようにマスタ設定されていない場合で、外注場所でない場合は、工場・物流倉庫マスタから住所を補完する
				zipCd = locR.getStringNE("site_zip_cd");
				addr1 = locR.getStringNE("site_addr1");
				addr2 = locR.getStringNE("site_addr2");
				addr3 = locR.getStringNE("site_addr3");
				addr4 = locR.getStringNE("site_addr4");
				tel = locR.getStringNE("site_tel");
				fax = locR.getStringNE("site_fax");
			}
			else {
				if (isNull(outsrcSpplSubR.bp_cd())) {
					// 外注場所の場合で、取引先補助マスタが設定されていない場合
					zipCd = locR.getStringNE("outsrc_sppl_zip_cd");
					addr1 = locR.getStringNE("outsrc_sppl_addr1");
					addr2 = locR.getStringNE("outsrc_sppl_addr2");
					addr3 = locR.getStringNE("outsrc_sppl_addr3");
					addr4 = locR.getStringNE("outsrc_sppl_addr4");
					tel   = locR.getStringNE("outsrc_sppl_tel");
					fax = locR.getStringNE("outsrc_sppl_fax");
				}
				else {
					// 外注場所の場合で、取引先補助マスタが設定されている場合
					zipCd = outsrcSpplSubR.zip_cd();
					addr1 = outsrcSpplSubR.addr1();
					addr2 = outsrcSpplSubR.addr2();
					addr3 = outsrcSpplSubR.addr3();
					addr4 = outsrcSpplSubR.addr4();
					tel   = outsrcSpplSubR.tel();
					fax = outsrcSpplSubR.fax();
				}
			}
			r.in_to_loc_zip_cd(zipCd);
			r.in_to_loc_addr1(addr1);
			r.in_to_loc_addr2(addr2);
			r.in_to_loc_addr3(addr3);
			r.in_to_loc_addr4(addr4);
			r.in_to_loc_tel(tel);
			r.in_to_loc_fax(fax);
		}
		
		protected void setSpplAddr(Srch02_RsltR r, MAM_BP_R spplR, MAM_BP_SUB_R spplSubR) {
			if (spplSubR.isEmpty()) {
				r.sppl_zip_cd(spplR.getStringNE("zip_cd"));
				r.sppl_addr1(spplR.getStringNE("addr1"));
				r.sppl_addr2(spplR.getStringNE("addr2"));
				r.sppl_addr3(spplR.getStringNE("addr3"));
				r.sppl_addr4(spplR.getStringNE("addr4"));
				r.sppl_tel(spplR.getStringNE("tel"));
				r.sppl_fax(spplR.getStringNE("fax"));
				r.sppl_cntct_dpt(spplR.getStringNE("sppl_cntct_dpt"));
				r.sppl_cntct_psn(spplR.getStringNE("sppl_cntct_psn"));
			}
			else {
				r.sppl_zip_cd(spplSubR.zip_cd());
				r.sppl_addr1(spplSubR.addr1());
				r.sppl_addr2(spplSubR.addr2());
				r.sppl_addr3(spplSubR.addr3());
				r.sppl_addr4(spplSubR.addr4());
				r.sppl_tel(spplSubR.tel());
				r.sppl_fax(spplSubR.fax());
				r.sppl_cntct_dpt(spplSubR.sppl_cntct_dpt());
				r.sppl_cntct_psn(spplSubR.sppl_cntct_psn());
			}
		}
		/**
		 * デフォルト値を設定します。
		 */
		protected void setDefault() {
			// ワークリスト作成
			MCList<Srch02_RsltR> wkL = MCList.create(Srch02_RsltR.class);
			wkL.setAll(down0());
			
			// 購買単価取得区分に応じた処理基準日
			String baseDt = "purc_upri_req_base_dt";
			wkL.addDateColumn(baseDt);
						
			// 購買単価取得区分に適した日付により税取得基準日を設定
			for (Srch02_RsltR r : wkL) {
				if (MAC_PURC_UPRI_REQ_TYP.isPO_DT(r.purc_upri_req_typ())) {
					r.setDateNE(baseDt, r.po_dt());
				}
				else if (MAC_PURC_UPRI_REQ_TYP.isSCHD_DLV_DT(r.purc_upri_req_typ())) {
					r.setDateNE(baseDt, r.dlv_rqst_dt());
				}
				else if (MAC_PURC_UPRI_REQ_TYP.isSCHD_PURC_DT(r.purc_upri_req_typ())) {
					r.setDateNE(baseDt, r.purc_schd_dt());
				}
			}
			
			// 税情報初期値設定
			setDefaultTax(baseDt, wkL);
			// 源泉税率初期値設定
			setDefaultWtaxRate(baseDt, wkL);
		}
		
		/**
		 * 購買単価取得区分に応じて、税ＣＤの初期値を取得します
		 * @param baseDt
		 * @param wkL
		 */
		protected void setDefaultTax(String baseDt, MCList<Srch02_RsltR> wkL) {
			// 購買単価取得区分に適した日付により税ＣＤを取得
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_TAX$F_GET_PURC_TAX_CD", "01"),
					MABCFunction.getFunctionExecuter("MAPA_TAX$F_GET_PURC_TAX_CD")
					, Srch01_RsltR.$tax_cd
					, wkL
					, Srch01_RsltR.$itm_cd
					, Srch01_RsltR.$itm_sub1
					, Srch01_RsltR.$itm_sub2
					, Srch01_RsltR.$itm_sub3
					, Srch01_RsltR.$sppl_cd
					, baseDt);
			
			// 取得した税ＣＤに対応する税マスタをキャッシュ
			MAM_TAX_R t = MAM_TAX_R.create("T");
			MCQueryApiBuilder tax_bldr = MCQueryApiBuilder.create(t);
			tax_bldr.setWhere(t.tax_cd.eq(bind("tax_cd")));
			FXUCL_MCDbcCache<MAM_TAX_R> cacheTax = new FXUCL_MCDbcCache<MAM_TAX_R>(tax_bldr, wkL.groupBy(Srch01_RsltR.$tax_cd), MAM_TAX_R.$tax_cd);
			
			// 下り電文設定
			MCIndexKey idxWkL = wkL.createIndex(Srch01_RsltR.$po_schd_no);
			for (Srch02_RsltR r : down0()) {
				// 下り電文に税ＣＤを設定
				r.tax_cd(wkL.subList(idxWkL, r.po_schd_no()).get(0).tax_cd());
				// 下り電文の税ＣＤの属性値を補完
				MAM_TAX_R taxR = cacheTax.getCache(r.tax_cd());
				if (isNull(taxR)||taxR.isEmpty()) {
					continue;
				}
				r.tax_nm(taxR.tax_nm());
				r.tax_rate(taxR.tax_rate());
				r.tax_typ(taxR.tax_typ());
				r.inc_tax_flg(taxR.inc_tax_flg());
			}
		}
		/**
		 * 購買単価取得区分に応じて、源泉税率の初期値を取得します
		 * @param baseDt
		 * @param wkL
		 */
		protected void setDefaultWtaxRate(String baseDt, MCList<Srch02_RsltR> wkL) {
			// 購買単価取得区分に適した日付により税ＣＤを取得
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_TAX$F_GET_WTAX_RATE", "01"),
					MABCFunction.getFunctionExecuter("MAPA_TAX$F_GET_WTAX_RATE")
					, Srch01_RsltR.$wtax_rate
					, wkL
					, Srch01_RsltR.$itm_cd
					, Srch01_RsltR.$itm_sub1
					, Srch01_RsltR.$itm_sub2
					, Srch01_RsltR.$itm_sub3
					, baseDt);
			
			// 下り電文設定
			MCIndexKey idxWkL = wkL.createIndex(Srch01_RsltR.$po_schd_no);
			for (Srch02_RsltR r : down0()) {
				// 下り電文に源泉税率初期値を設定
				r.wtax_rate(wkL.subList(idxWkL, r.po_schd_no()).get(0).wtax_rate());
			}
		}
	}
	/**
	 * 検索条件を編集します
	 */
	protected void setUpTmpCol(Srch01_CndR cndR) {
		// 承認状況
		if (cndR.opn_flg()) {
			cndR.addStringColumn("opn_sts_str", MAC_APRV_STS_TYP.OPN.value());
		}
		if (cndR.fix_flg()) {
			cndR.addStringColumn("fix_sts_str", MAC_APRV_STS_TYP.FIX.value());
		}
		if (cndR.acpt_flg()) {
			cndR.addStringColumn("acpt_sts_str", MAC_APRV_STS_TYP.ACPT.value());
		}
		if (cndR.rjct_flg()) {
			cndR.addStringColumn("rjct_sts_str", MAC_APRV_STS_TYP.RJCT.value());
		}
		if (cndR.last_rjct_flg()) {
			cndR.addStringColumn("last_rjct_sts_str", MAC_APRV_STS_TYP.LAST_RJCT.value());
		}
		if (cndR.aprv_invalid_flg()) {
			cndR.addStringColumn("aprv_flg_str", MCBooleanUtil.booleanToDBString(cndR.aprv_invalid_flg()));
		}
		
		// ＥＤＩＦＬＧ
		if (!isSame(cndR.edi_flg(), cndR.not_edi_flg())) {
			cndR.addStringColumn("edi_flg_str", MCBooleanUtil.booleanToDBString(cndR.edi_flg()));
		}
		
		// 購買ＩＦＦＬＧ
		if (!isSame(cndR.purc_if_tgt_flg(), cndR.not_purc_if_tgt_flg())) {
			cndR.addStringColumn("purc_if_flg_str", MCBooleanUtil.booleanToDBString(cndR.purc_if_tgt_flg()));
		}
		
		// 注文書
		if (!isSame(cndR.po_prnt_flg(), cndR.not_po_prnt_flg())) {
			cndR.addStringColumn("po_prnt_flg_str", MCBooleanUtil.booleanToDBString(cndR.po_prnt_flg()));
		}
		// 諸口品ＦＬＧ
		if (!isSame(cndR.sundry_itm_flg(), cndR.not_sundry_itm_flg())) {
			cndR.addStringColumn("sundry_itm_flg_str", MCBooleanUtil.booleanToDBString(cndR.sundry_itm_flg()));
		}
		// 発注先インボイス取引ＦＬＧ
		if (!isSame(cndR.iv_trgt_flg(), cndR.iv_not_trgt_flg())) {
			cndR.addStringColumn("iv_trgt_flg_str", MCBooleanUtil.booleanToDBString(cndR.iv_trgt_flg()));
		}
		// 請書受領
		if (cndR.po_conf_rcpt_flg()) {
			cndR.addStringColumn("po_conf_rcpt_flg_str", MCBooleanUtil.booleanToDBString(cndR.po_conf_rcpt_flg()));
		}
		// 下請け対象ＦＬＧ
		if (cndR.subcon_flg()) {
			cndR.addStringColumn("subcon_flg_str", MCBooleanUtil.booleanToDBString(cndR.subcon_flg()));
		}
		// 納入希望日遅れＦＬＧ
		if (cndR.prms_dlv_dt_overdue_flg()) {
			cndR.addStringColumn("prms_dlv_dt_overdue_flg_str", MCBooleanUtil.booleanToDBString(cndR.prms_dlv_dt_overdue_flg()));
		}
		else {
			cndR.addStringColumn("prms_dlv_dt_overdue_flg_str", null);
		}
		// 回答納入日遅れＦＬＧ
		if (cndR.dlv_rqst_dt_overdue_flg()) {
			cndR.addStringColumn("dlv_rqst_dt_overdue_flg_str", MCBooleanUtil.booleanToDBString(cndR.dlv_rqst_dt_overdue_flg()));
		}
		else {
			cndR.addStringColumn("dlv_rqst_dt_overdue_flg_str", null);
		}
		if (isSame(cndR.screen_ope(), OPE_REF)) {
			cndR.addStringColumn("ref_flg", "1");
		}
		else {
			cndR.addStringColumn("ref_flg", "0");
		}
	}
	protected void editSrchCnd(Srch01_CndR cndR, MCOperation ope) {
		// 実行されるオペレーションを設定
		_caller = ope;
	}

	protected void setValuesDbc(MCRow upR, MCList<? extends MCConstRow> down) {
		initDbcCache(upR, down);
		
		for (MCRow r : down) {
			if ( !(r instanceof Srch01_RsltR) ) {
				continue;
			}
			Srch01_RsltR dtlR = (Srch01_RsltR) r;
			
			MST_PO_D_R poDR = _cachePoD.get(dtlR.po_d_no());
			
			dtlR.po_schd_no(poDR.po_schd_no());
			dtlR.po_schd_dt(poDR.getDateNE(MST_PO_SCHD_R.$po_schd_dt));
			dtlR.po_schd_src_typ(poDR.getStringNE(MST_PO_SCHD_R.$po_schd_src_typ));
			dtlR.po_schd_src_no(poDR.getStringNE(MST_PO_SCHD_R.$po_schd_src_no));
			dtlR.po_schd_sub_char1(poDR.sub_char1());
			dtlR.po_schd_sub_char2(poDR.sub_char2());
			dtlR.po_schd_sub_char3(poDR.sub_char3());
			dtlR.po_cnt_rmrks(poDR.getStringNE(MST_PO_SCHD_R.$po_cnt_rmrks));
			dtlR.yield_schd_qty(poDR.getNumberNE(MST_ITM_ORDER_R.$yield_schd_qty));
			dtlR.strg_schd_dt(poDR.getDateNE(MST_ITM_ORDER_R.$strg_schd_dt));
		}
	}

	protected void initDbcCache(MCRow upR, MCList<? extends MCConstRow> down) {

		initDbcCacheItmLcl(down);
		
		if (down.createRow() instanceof Srch01_RsltR) {
			initDbcCachePo(down);
		}
		else if (down.createRow() instanceof Srch02_RsltR) {
			initDbcCacheLoc(down);
		}
	}
	protected FXUCL_MCDbcCache<MST_PO_D_R> _cachePoD;
	protected void initDbcCachePo(MCList<? extends MCConstRow> down) {
		MST_PO_D_R t = MST_PO_D_R.create("T");
		MCQueryApiBuilder poD_bldr = MCQueryApiBuilder.create(t);
		
		MST_PO_R t1 = MST_PO_R.create("T1");
		MST_PO_SCHD_R t6 = MST_PO_SCHD_R.create("T6");
		MST_ITM_ORDER_R t7 = MST_ITM_ORDER_R.create("T7");
		MAM_USR_R m25 = MAM_USR_R.create("M25");
		MAM_DPT_R m26 = MAM_DPT_R.create("M26");

		poD_bldr.setSelect(t7.yield_schd_qty, t7.strg_schd_dt, t6.po_schd_no,
				t6.po_schd_dt, t6.po_schd_src_typ, t6.po_schd_src_no,
				t6.rqst_fr_usr_cd, m25.usr_nm.as("rqst_fr_usr_nm"),
				t6.rqst_fr_dpt_cd, m26.dpt_nm.as("rqst_fr_dpt_nm"),
				t6.sub_char1, t6.sub_char2, t6.sub_char3, t6.po_cnt_rmrks);
		if (_caller instanceof Srch01) {
			poD_bldr.addSelect(t7.po_schd_dt.as("pln_po_schd_dt"));
		}
		poD_bldr.addInnerJoin(t1, bracket(t.po_no.eq(t1.po_no)));
		poD_bldr.addLeftOuterJoin(t6, bracket(t1.po_no.eq(t6.po_no)
				.and(t.po_d_no.eq(t6.po_d_no))
				.and(t.bndl_flg.eq(value(false)))));
		poD_bldr.addLeftOuterJoin(t7,
				coalesce(t.outsrc_itm_ord_no, t6.outsrc_itm_ord_no, t6.pln_itm_ord_no)
						.eq(t7.itm_ord_no));
		poD_bldr.addLeftOuterJoin(m25, bracket(t6.rqst_fr_usr_cd.eq(m25.usr_cd)));
		poD_bldr.addLeftOuterJoin(m26, bracket(t6.rqst_fr_dpt_cd.eq(m26.dpt_cd)
				.and(t6.reg_dt.between(m26.st_dt, m26.end_dt))));
		
		_cachePoD = new FXUCL_MCDbcCache<MST_PO_D_R>(poD_bldr, down, Srch01_RsltR.$po_d_no);
	}
	protected FXUCL_MCDbcCache<MAM_ITM_LCL_R> _cacheItmLcl;
	protected void initDbcCacheItmLcl(MCList<? extends MCConstRow> down) {
		MAM_ITM_LCL_R t = MAM_ITM_LCL_R.create("T");
		MCQueryApiBuilder itmLcl_bldr = MCQueryApiBuilder.create(t);
		
		itmLcl_bldr.setSelect(t.itm_nm);
		
		_cacheItmLcl = new FXUCL_MCDbcCache<MAM_ITM_LCL_R>(itmLcl_bldr, down,
				"itm_cd", "itm_sub1", "itm_sub2", "itm_sub3", "prnt_lcl_cd");
	}
	protected FXUCL_MCDbcCache<MAM_LOC_R> _cacheLoc;
	protected void initDbcCacheLoc(MCList<? extends MCConstRow> down) {
		MAM_LOC_R t = MAM_LOC_R.create("T");
		MCQueryApiBuilder loc_bldr = MCQueryApiBuilder.create(t);
		MAM_BP_R mb6 = MAM_BP_R.create("MB6");
		MAM_SITE_R m19 = MAM_SITE_R.create("M19");
		
		// 場所マスタ
		loc_bldr.setSelect(t.addr_flg);
		loc_bldr.addSelect(t.zip_cd.as("loc_zip_cd"));
		loc_bldr.addSelect(t.addr1.as("loc_addr1"));
		loc_bldr.addSelect(t.addr2.as("loc_addr2"));
		loc_bldr.addSelect(t.addr3.as("loc_addr3"));
		loc_bldr.addSelect(t.addr4.as("loc_addr4"));
		loc_bldr.addSelect(t.tel.as("loc_tel"));
		loc_bldr.addSelect(t.fax.as("loc_fax"));
		// 工場・物流倉庫マスタ
		loc_bldr.addSelect(m19.zip_cd.as("site_zip_cd"));
		loc_bldr.addSelect(m19.addr1.as("site_addr1"));
		loc_bldr.addSelect(m19.addr2.as("site_addr2"));
		loc_bldr.addSelect(m19.addr3.as("site_addr3"));
		loc_bldr.addSelect(m19.addr4.as("site_addr4"));
		loc_bldr.addSelect(m19.tel.as("site_tel"));				
		loc_bldr.addSelect(m19.fax.as("site_fax"));
		// 取引先マスタ
		loc_bldr.addSelect(mb6.zip_cd.as("outsrc_sppl_zip_cd"));
		loc_bldr.addSelect(mb6.addr1.as("outsrc_sppl_addr1"));
		loc_bldr.addSelect(mb6.addr2.as("outsrc_sppl_addr2"));
		loc_bldr.addSelect(mb6.addr3.as("outsrc_sppl_addr3"));
		loc_bldr.addSelect(mb6.addr4.as("outsrc_sppl_addr4"));
		loc_bldr.addSelect(mb6.tel.as("outsrc_sppl_tel"));
		loc_bldr.addSelect(mb6.fax.as("outsrc_sppl_fax"));
		
		loc_bldr.addLeftOuterJoin(m19, bracket( t.site_cd.eq(m19.site_cd)));
		loc_bldr.addLeftOuterJoin(mb6, bracket( t.sppl_cd.eq(mb6.bp_cd)));
		
		_cacheLoc = new FXUCL_MCDbcCache<MAM_LOC_R>(loc_bldr, down, Srch02_RsltR.$in_to_loc_cd);
	}
	
	protected MAM_EDI_IF_CTL_R makeBindListEdi(MCRow r) {
		MAM_EDI_IF_CTL_R ediR = MAM_EDI_IF_CTL_R.create();
		ediR.bp_cd(r.getStringNE("sppl_cd"));
		ediR.if_proc_typ(MAC_IF_PROC_TYP.PO_SEND.value());
		return ediR;
	}
	
	protected FXUCL_MCDbcCacheStEnd<MAM_EDI_IF_CTL_R> _cacheEdi;
	protected void createChacheEdi(MCList<MAM_EDI_IF_CTL_R> bindEdiL) {
		_cacheEdi = new FXUCL_MCDbcCacheStEnd<MAM_EDI_IF_CTL_R>(
				MCQueryApiBuilder.create(MAM_EDI_IF_CTL_R.create("T")),
				bindEdiL, MAM_EDI_IF_CTL_R.$bp_cd, MAM_EDI_IF_CTL_R.$if_proc_typ);
	}
	/**
	 * Imp01オペレーション.<p>
	 *
	 * 発注情報をファイル入力する。<br>
	 */
	public class Imp01 extends MSBDL_PoListReg_MC_A.Imp01 {
		/** 場所マスタキャッシュ */
		protected FXUCL_MCDbcCache<MAM_LOC_R> _cacheLoc = null;
		/** 品目マスタキャッシュ */
		protected FXUCL_MCDbcCache<MAM_ITM_R> _cacheItm = null;
		/** 品目単位マスタキャッシュ */
		protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _cacheItmUnit = null;

		/** 部門マスタキャッシュ */
		protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _cacheDpt = null;

		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			setPegNo(up0());
			editUp();
			callThisSprt01();
			setDefaultApDpt();
			clearUpri();
			setSchdDt();
			setDefaultPurcBasisTyp();
			setSyncFlg();
			setPriPrntFlg();
			callThisChk01(up0(), true);
			setDown();
			editDown();
		}
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		

		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			setApCredCd(up0());
			List<MCList<Chk01_DtlR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk01_DtlR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk01_DtlR> up0L = ((MCList<Chk01_DtlR>)ope.up(0));
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}	

		protected List<MCList<Chk01_DtlR>> splitUp(MCList<Chk01_DtlR> list, int max) {
			List<MCList<Chk01_DtlR>> ret = new ArrayList<>();
			MCList<Chk01_DtlR>[] grpL = list.groupList(getSplitColumn());
			MCList<Chk01_DtlR> tmp = MCList.create(Chk01_DtlR.class);
			for (MCList<Chk01_DtlR> grp : grpL) {
				if (tmp.size() >= max) {
					ret.add(tmp);
					tmp = MCList.create(Chk01_DtlR.class);
				}
				tmp.addAll(grp);
			}
			if (!tmp.isEmpty()) {
				ret.add(tmp);
			}
			return ret;
		}
		
		protected void editUp() {
			
			clearTaxCd();
			
			setNullVal();
			
			setPoDt();
			
			createCache();
			
			complLoc();
			
			complItm();
			
			setDefStrLnCd();
			
			clearStrLnCdNoneFlg();
			
			setBaseUintQty();
			
			clearDscntRsnCd();
			
			clearBditm();
			
			clearXrateInptFlg();
			
			clearPoConfRcptDt();
		}
		
		protected void clearTaxCd() {
			
			for (Chk01_DtlR r : up0()) {
				if (!r.tax_fix_flg()) {
					r.tax_cd(null);
				}
			}
		}
		
		protected void clearUpri() {
			MCList<MAM_BP_R> bpL = MCList.create(MAM_BP_R.class);
			MAM_BP_R t = MAM_BP_R.create("T");
			MCQueryApiBuilder bpL_bldr = MCQueryApiBuilder.create(t);
			bpL_bldr.setWhere(t.bp_cd.eq(bind("sppl_cd")));
			dbSelect("MSBDL0090_MAM_BP_S03", bpL, bpL_bldr, up0());
			MCIndexKey idxkey = bpL.createIndex(MAM_BP_R.$bp_cd);
			for (Chk01_DtlR r : up0()) {
				MAM_BP_R bpR = bpL.getFirst(idxkey, r.sppl_cd());
				MAM_ITM_R itmR = getCacheItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				
				if (!isNull(bpR)) {
					if (!bpR.purc_upri_cng_flg() && !itmR.purc_upri_cng_flg()) {
						r.upri_not_tgt_flg(false);
					}
				}
				if (!r.upri_not_tgt_flg()) {
					
					r.clear(Chk01_DtlR.$trd_cur_upri, 
							Chk01_DtlR.$trd_cur_proc_upri, 
							Chk01_DtlR.$trd_cur_onr_prov_upri, 
							Chk01_DtlR.$interim_flg);
				}
				if (!r.outsrc_flg()) {
					r.clear(Chk01_DtlR.$trd_cur_proc_upri, 
							Chk01_DtlR.$trd_cur_onr_prov_upri);
				}
				if (!isNull(bpR)) {
					if (MAC_OUTSRC_UPRI_TYP.isPROC(nvl(bpR.outsrc_upri_typ(), getCo().outsrc_upri_typ()))) {
						r.clear(Chk01_DtlR.$trd_cur_onr_prov_upri);
					}
				}
			}
		}
		
		protected void setNullVal() {
			
			for (Chk01_DtlR r : up0()) {
				if (!isNull(r.itm_cd())) {
					r.itm_sub1(nvl(r.itm_sub1(), MAC_STR.NULL_VAL.value()));
					r.itm_sub2(nvl(r.itm_sub2(), MAC_STR.NULL_VAL.value()));
					r.itm_sub3(nvl(r.itm_sub3(), MAC_STR.NULL_VAL.value()));
				}
				else {
					r.itm_sub1(null);
					r.itm_sub2(null);
					r.itm_sub3(null);
				}
			}
		}
		
		protected void setPoDt() {
			
			for (Chk01_DtlR r : up0()) {
				
				r.po_dt((MCDate)complInputFileValue(Chk01_DtlR.$po_dt, r.po_dt(), getToday()));
			}
		}
		
		protected void createCache() {
			
			createLocCache();
			
			createItmCache();
			
			createItmUnitCache();

			createDptCache();
		}
		
		protected void complLoc() {
			
			for (Chk01_DtlR r : up0()) {
				
				MAM_LOC_R locR = getCacheLoc(r.in_to_loc_cd());
				
				if (!isNull(locR)) {
					r.in_to_loc_wg_cd(locR.wg_cd());
					r.lg_grp_cd(locR.lg_grp_cd());
					r.site_cd(locR.site_cd());
					r.in_to_loc_cal_cd(locR.cal_cd());
					r.str_ln_tgt_flg(locR.str_ln_tgt_flg());
				}
			}
		}
		
		protected void complItm() {
			
			for (Chk01_DtlR r : up0()) {
				
				MAM_ITM_R itmR = getCacheItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				
				if (!isNull(itmR)) {
					if (itmR.dscnt_itm_flg()) {
						r.trd_unit_qty(MCNumber.ONE);
						r.trd_unit_cd(itmR.unit_cd());
					}
					else {
						r.trd_unit_cd((String)complInputFileValue(
								Chk01_DtlR.$trd_unit_cd, r.trd_unit_cd(), nvl(itmR.purc_unit_cd(), itmR.unit_cd())));
					}
					
					if (!itmR.sundry_itm_flg()) {
						r.iv_itm_nm(null);
					}
					
					r.arr_skip_flg(itmR.arr_skip_flg());
					r.asset_mng_typ(itmR.asset_mng_typ());
				}
			}
		}
		
		protected void setDefStrLnCd() {
			MSUCL_StrLnUtil.StrLnUtil_Srch01 strLnUtilSrch01 = MSUCL_StrLnUtil.crtStrLnUtil_Srch01();
			MCList<Chk01_DtlR> tgtList = up0().subList(r -> !r.str_ln_cd_none_flg() && r.str_ln_tgt_flg());
			if (tgtList.isEmpty()) {
				return;
			}
			addAll(strLnUtilSrch01.up0(), tgtList, createMap_StrLnUtil_Srch01_CndR_Chk01_DtlR());
			strLnUtilSrch01.exec();

			MCIndexKey idxkey = strLnUtilSrch01.down0().createIndex(StrLnUtil_Srch01_CndR.$peg_no);
			for (Chk01_DtlR r : tgtList) {
				StrLnUtil_Srch01_CndR downR = strLnUtilSrch01.down0().getFirst(idxkey, r.peg_no());
				r.str_ln_cd((String) complInputFileValue(Chk01_DtlR.$str_ln_cd, r.str_ln_cd(), downR.str_ln_cd()));
			}
		}
		
		protected void clearStrLnCdNoneFlg() {
			for (Chk01_DtlR r : up0()) {
				if (!isNull(r.str_ln_cd())) {
					r.clear(Chk01_DtlR.$str_ln_cd_none_flg);
				}
			}
		}
		
		protected void setBaseUintQty() {
			
			for (Chk01_DtlR r : up0()) {
				
				MAVM_ITM_UNIT_R itmUnitR = getCacheItmUnit(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.trd_unit_cd());
				
				if (!isNull(itmUnitR)) {
					
					r.base_unit_qty(convToBaseUnit(r.trd_unit_qty(), itmUnitR.conv_base_qty(), itmUnitR.conv_qty(),
							itmUnitR.dec_place(), itmUnitR.rnd_typ()));
				}
			}
		}
		
		protected void clearDscntRsnCd() {
			for (Chk01_DtlR r : up0()) {
				if (isNull(r.trd_cur_dscnt_amt()) || r.trd_cur_dscnt_amt().isZero()) {
					r.clear(Chk01_DtlR.$dscnt_rsn_cd);
				}
			}
		}
		
		protected void clearBditm() {
			for (Chk01_DtlR r : up0()) {
				if (isNonPurc(r) || MAC_ASSET_MNG_TYP.isMNG(r.asset_mng_typ())) {
					r.clear(Chk01_DtlR.$bd_itm_cd,
							Chk01_DtlR.$bd_itm_sub1,
							Chk01_DtlR.$bd_itm_sub2,
							Chk01_DtlR.$bd_itm_sub3,
							Chk01_DtlR.$bd_sno1,
							Chk01_DtlR.$bd_sno2,
							Chk01_DtlR.$bd_sno3,
							Chk01_DtlR.$bd_sno4,
							Chk01_DtlR.$bd_loc_cd,
							Chk01_DtlR.$bd_lot_no,
							Chk01_DtlR.$bd_sublot_no,
							Chk01_DtlR.$bd_dpt_cd,
							Chk01_DtlR.$bd_ctg_cd,
							Chk01_DtlR.$bd_oper_cd,
							Chk01_DtlR.$bd_slo_no,
							Chk01_DtlR.$bd_iv_no,
							Chk01_DtlR.$bd_po_no);
					continue;
				}
				
				// 負担品目
				if (isNull(r.bd_itm_cd())) {
					r.clear(Chk01_DtlR.$bd_itm_sub1);
				}
				if (isNull(r.bd_itm_sub1())) {
					r.clear(Chk01_DtlR.$bd_itm_sub2);
				}
				if (isNull(r.bd_itm_sub2())) {
					r.clear(Chk01_DtlR.$bd_itm_sub3);
				}
				
				// 負担品群、負担工程
				if (!isNull(r.bd_itm_cd())) {
					r.clear(Chk01_DtlR.$bd_ctg_cd,
							Chk01_DtlR.$bd_oper_cd);
				}
				
				if(isNull(r.bd_itm_cd())) {
					continue;
				}
				MAM_ITM_R bdItmR = getCacheItm(r.bd_itm_cd(), nvl(r.bd_itm_sub1(), MAC_STR.NULL_VAL.value()),
						nvl(r.bd_itm_sub2(), MAC_STR.NULL_VAL.value()), nvl(r.bd_itm_sub3(), MAC_STR.NULL_VAL.value()));
				if (isNull(bdItmR)) {
					r.clear(Chk01_DtlR.$bd_lot_no,
							Chk01_DtlR.$bd_sublot_no,
							Chk01_DtlR.$bd_sno1,
							Chk01_DtlR.$bd_sno2,
							Chk01_DtlR.$bd_sno3,
							Chk01_DtlR.$bd_sno4);
					continue;
				}
				
				// 負担ロットＮＯ
				if (MAC_LOT_MNG_TYP.isNOT_MNG(bdItmR.lot_mng_typ())) {
					r.clear(Chk01_DtlR.$bd_lot_no);
				}
				
				// 負担サブロットＮＯ
				if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(bdItmR.sublot_mng_typ())) {
					r.clear(Chk01_DtlR.$bd_sublot_no);
				}
				
				// 手配ＮＯ
				if (MAC_SNO_MNG_TYP.isNOT_MNG(bdItmR.sno1_mng_typ())) {
					r.clear(Chk01_DtlR.$bd_sno1);
				}
				if (MAC_SNO_MNG_TYP.isNOT_MNG(bdItmR.sno2_mng_typ())) {
					r.clear(Chk01_DtlR.$bd_sno2);
				}
				if (MAC_SNO_MNG_TYP.isNOT_MNG(bdItmR.sno3_mng_typ())) {
					r.clear(Chk01_DtlR.$bd_sno3);
				}
				if (MAC_SNO_MNG_TYP.isNOT_MNG(bdItmR.sno4_mng_typ())) {
					r.clear(Chk01_DtlR.$bd_sno4);
				}
			}
		}
		
		protected void clearXrateInptFlg() {
			for (Chk01_DtlR r : up0()) {
				if (isSame(r.trd_cur_cd(), getCo().base_cur_cd()) || isNull(r.trd_cur_cd())) {
					r.clear(Chk01_DtlR.$xrate_inpt_flg);
				}
			}
		}
		
		protected void clearPoConfRcptDt() {
			for (Chk01_DtlR r : up0()) {
				if (!r.po_conf_rcpt_flg()) {
					r.clear(Chk01_DtlR.$po_conf_rcpt_dt);
				}
			}
		}
		
		protected void callThisSprt01() {
			
			MSBDL_PoListReg.Sprt01 sprt01 = MSBDL_PoListReg.crtSprt01();
			addAll(sprt01.up0(), up0(), createMap_Sprt01_DtlR_Chk01_DtlR());
			sprt01.exec();
			
			MCList<Sprt01_DtlR> downL = sprt01.down0();
			MCIndexKey sprtIdxkey = downL.createIndex(Sprt01_DtlR.$peg_no);
			
			Map<String, String> map = new HashMap<String, String>();
			
			map.put(Chk01_DtlR.$po_dt, Sprt01_DtlR.$po_dt);
			map.put(Chk01_DtlR.$sppl_cd, Sprt01_DtlR.$sppl_cd);
			map.put(Chk01_DtlR.$purc_upri_req_typ, Sprt01_DtlR.$purc_upri_req_typ);
			map.put(Chk01_DtlR.$ap_dpt_cd, Sprt01_DtlR.$ap_dpt_cd);
			map.put(Chk01_DtlR.$po_print_cd, Sprt01_DtlR.$po_print_cd);
			map.put(Chk01_DtlR.$mfg_loc_cd, Sprt01_DtlR.$mfg_loc_cd);
			map.put(Chk01_DtlR.$maker_cd, Sprt01_DtlR.$maker_cd);
			map.put(Chk01_DtlR.$bom_ptn, Sprt01_DtlR.$bom_ptn);
			map.put(Chk01_DtlR.$purc_id_typ, Sprt01_DtlR.$purc_id_typ);
			map.put(Chk01_DtlR.$ver_no, Sprt01_DtlR.$ver_no);
			map.put(Chk01_DtlR.$outsrc_flg, Sprt01_DtlR.$outsrc_flg);
			map.put(Chk01_DtlR.$trd_cur_cd, Sprt01_DtlR.$trd_cur_cd);
			map.put(Chk01_DtlR.$tax_cd, Sprt01_DtlR.$tax_cd);
			map.put(Chk01_DtlR.$bd_dpt_cd, Sprt01_DtlR.$bd_dpt_cd);
			map.put(Chk01_DtlR.$pay_crryovr_times, Sprt01_DtlR.$pay_crryovr_times);
			map.put(Chk01_DtlR.$iv_itm_nm, Sprt01_DtlR.$iv_itm_nm);
			map.put(Chk01_DtlR.$sppl_itm_cd, Sprt01_DtlR.$sppl_itm_cd);
			map.put(Chk01_DtlR.$sppl_itm_nm, Sprt01_DtlR.$sppl_itm_nm);
			map.put(Chk01_DtlR.$wtax_rate, Sprt01_DtlR.$wtax_rate);
			map.put(Chk01_DtlR.$purc_usr_cd, Sprt01_DtlR.$purc_usr_cd);
			map.put(Chk01_DtlR.$purc_dpt_cd, Sprt01_DtlR.$purc_dpt_cd);
			map.put(Chk01_DtlR.$sppl_ship_form_cd, Sprt01_DtlR.$sppl_ship_form_cd);
			map.put(Chk01_DtlR.$tterm_cd1, Sprt01_DtlR.$tterm_cd1);
			map.put(Chk01_DtlR.$tterm_cd2, Sprt01_DtlR.$tterm_cd2);
			map.put(Chk01_DtlR.$tterm_cd3, Sprt01_DtlR.$tterm_cd3);
			map.put(Chk01_DtlR.$purc_basis_typ, Sprt01_DtlR.$purc_basis_typ);
			map.put(Chk01_DtlR.$sppl_cal_cd, Sprt01_DtlR.$sppl_cal_cd);
			
			for (Chk01_DtlR r : up0()) {
				
				Sprt01_DtlR sprtR = downL.getFirst(sprtIdxkey, r.peg_no());
							
				for (String col : map.keySet()) {
					
					if (!isNull(sprtR.getValueNE(map.get(col)))) {
						r.setValueNE(col, complInputFileValue(col, r.getValueNE(col), sprtR.getValueNE(map.get(col))));
					}
				}
				r.subcon_flg(sprtR.subcon_flg());
			}
		}
		
		protected void setSchdDt() {
			
			MCList<Chk01_DtlR> tgtList = getTgtList();
			MSBDL_PurcUtil.PurcUtil_Srch01 purcUtilSrch01 = MSBDL_PurcUtil.crtPurcUtil_Srch01();
			addAll(purcUtilSrch01.up0(), tgtList, createMap_PurcUtil_Srch01_DtlR_Chk01_DtlR());
			purcUtilSrch01.exec();
			
			MCIndexKey idxkey = purcUtilSrch01.down0().createIndex(PurcUtil_Srch01_DtlR.$peg_no);
			
			for (Chk01_DtlR r : tgtList) {
				PurcUtil_Srch01_DtlR downR = purcUtilSrch01.down0().getFirst(idxkey, r.peg_no());
				
				if (!isNull(downR)) {
					r.dlv_rqst_tm((MCDate)complInputFileValue(Chk01_DtlR.$dlv_rqst_tm, r.dlv_rqst_tm(), downR.dlv_rqst_dt()));
					r.rqst_avl_rqst_dt((MCDate)complInputFileValue(Chk01_DtlR.$rqst_avl_rqst_dt, r.rqst_avl_rqst_dt(), downR.rqst_dlv_rqst_dt()));
					r.purc_schd_dt((MCDate)complInputFileValue(Chk01_DtlR.$purc_schd_dt, r.purc_schd_dt(), downR.purc_schd_dt()));
				}
			}
		}

		protected MCList<Chk01_DtlR> getTgtList() {
			MCList<Chk01_DtlR> tgtList = MCList.create(Chk01_DtlR.class);
			
			for (Chk01_DtlR r : up0()) {
				if (!isNull(r.purc_schd_dt()) && !isNull(r.rqst_avl_rqst_dt()) && !isNull(r.rqst_dlv_rqst_tm())) {
					continue;
				}
				tgtList.add(r);
			}
			
			return tgtList;
		}

		protected void setDefaultApDpt() {
			
			for(Chk01_DtlR r : up0()) {
				if(isNull(r.ap_dpt_cd()) && !isNull(r.purc_dpt_cd())){
					r.ap_dpt_cd(getCacheDptOnlyApDpt(r.po_dt(),r.purc_dpt_cd()).dpt_cd());
				}
			}
		}
		/**
		 * 仕入計上区分の初期値を設定します。
		 */
		protected void setDefaultPurcBasisTyp() {
			
			for (Chk01_DtlR r : up0()) {
				
				if (r.arr_skip_flg()) {
					r.purc_basis_typ(MAC_PURC_BASIS_TYP.IN_BASIS.value());
				}
				else if (MAC_PURC_ID_TYP.isVMI(r.purc_id_typ()) || MAC_PURC_ID_TYP.isFFR_RCV(r.purc_id_typ())) {
					r.purc_basis_typ(MAC_PURC_BASIS_TYP.IN_BASIS.value());
				}
				else if (r.subcon_flg()) {
					r.purc_basis_typ(MAC_PURC_BASIS_TYP.ARR_BASIS.value());
				}
			}
		}
		
		protected void setSyncFlg() {
			
			for (Chk01_DtlR r : up0()) {
				
				if (r.arr_skip_flg()) {
					r.sync_flg(false);
				}
				else if (MAC_PURC_BASIS_TYP.isARR_BASIS(r.purc_basis_typ())) {
					if (!isNull(r.dlv_rqst_tm()) && !r.dlv_rqst_tm().startTimeOfDay().eqDate(r.purc_schd_dt())) {
						r.purc_schd_dt(r.dlv_rqst_tm().trunc(MCDateFieldType.DAY));
					}
					r.sync_flg(true);
				}
				else if (MAC_PURC_BASIS_TYP.isIN_BASIS(r.purc_basis_typ())) {
					if (isNonPurc(r) && !isNull(r.purc_schd_dt())) {
						r.purc_schd_dt(null);
					}
					r.sync_flg(false);
				}
				else if (isNull(r.dlv_rqst_tm()) || isNull(r.purc_schd_dt())) {
					r.sync_flg(false);
				}
				else if(!r.dlv_rqst_tm().startTimeOfDay().eqDate(r.purc_schd_dt())){
					r.sync_flg(false);
				}
			}
		}
		
		protected void setPriPrntFlg() {
			
			for (Chk01_DtlR r : up0()) {
				
				if (isNull(r.sppl_ship_form_cd())) {
					r.pri_print_flg(false);
				}
			}
		}
		
		protected Map_PurcUtil_Srch01_DtlR_Chk01_DtlR<PurcUtil_Srch01_DtlR,Chk01_DtlR> createMap_PurcUtil_Srch01_DtlR_Chk01_DtlR() {
			return new Map_PurcUtil_Srch01_DtlR_Chk01_DtlR<PurcUtil_Srch01_DtlR, Chk01_DtlR>();
		}

		public class Map_PurcUtil_Srch01_DtlR_Chk01_DtlR<D extends PurcUtil_Srch01_DtlR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcUtil_Srch01_DtlR.$peg_no, Chk01_DtlR.$peg_no);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$po_schd_dt, Chk01_DtlR.$po_dt);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$sppl_cd, Chk01_DtlR.$sppl_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$itm_cd, Chk01_DtlR.$itm_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub1);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$itm_sub2, Chk01_DtlR.$itm_sub2);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$itm_sub3, Chk01_DtlR.$itm_sub3);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$mfg_loc_cd, Chk01_DtlR.$mfg_loc_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$maker_cd, Chk01_DtlR.$maker_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$bom_ptn, Chk01_DtlR.$bom_ptn);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$in_to_loc_cd, Chk01_DtlR.$in_to_loc_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$site_cd, Chk01_DtlR.$site_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$sppl_cal_cd, Chk01_DtlR.$sppl_cal_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$in_to_loc_cal_cd, Chk01_DtlR.$in_to_loc_cal_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$lg_grp_cd, Chk01_DtlR.$lg_grp_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$base_unit_qty, Chk01_DtlR.$base_unit_qty);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$wg_cd, Chk01_DtlR.$in_to_loc_wg_cd);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if (isSame(_sysParm, "1")) {
					dest.base_dt(src.rqst_avl_rqst_dt());
				}
			}
		}
		
		protected Map_StrLnUtil_Srch01_CndR_Chk01_DtlR<StrLnUtil_Srch01_CndR,Chk01_DtlR> createMap_StrLnUtil_Srch01_CndR_Chk01_DtlR() {
			return new Map_StrLnUtil_Srch01_CndR_Chk01_DtlR<StrLnUtil_Srch01_CndR, Chk01_DtlR>();
		}

		public class Map_StrLnUtil_Srch01_CndR_Chk01_DtlR<D extends StrLnUtil_Srch01_CndR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(StrLnUtil_Srch01_CndR.$peg_no, Chk01_DtlR.$peg_no);
				addColumnPathMap(StrLnUtil_Srch01_CndR.$itm_cd, Chk01_DtlR.$itm_cd);
				addColumnPathMap(StrLnUtil_Srch01_CndR.$itm_sub1, Chk01_DtlR.$itm_sub1);
				addColumnPathMap(StrLnUtil_Srch01_CndR.$itm_sub2, Chk01_DtlR.$itm_sub2);
				addColumnPathMap(StrLnUtil_Srch01_CndR.$itm_sub3, Chk01_DtlR.$itm_sub3);
				addColumnPathMap(StrLnUtil_Srch01_CndR.$loc_cd, Chk01_DtlR.$in_to_loc_cd);
			}
		}
		
		protected void createLocCache() {
			_cacheLoc = new FXUCL_MCDbcCache<MAM_LOC_R>(
					MCQueryApiBuilder.create(MAM_LOC_R.create("T")),
					up0(), Chk01_DtlR.$in_to_loc_cd);
		}
		
		protected MAM_LOC_R getCacheLoc(String locCd) {
			return _cacheLoc.get(locCd);
		}
		
		protected void createItmCache() {
			_cacheItm = new FXUCL_MCDbcCache<MAM_ITM_R>(
					MCQueryApiBuilder.create(MAM_ITM_R.create("T")),
					up0(), Chk01_DtlR.$itm_cd, Chk01_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub2, Chk01_DtlR.$itm_sub3);
		}
		
		protected MAM_ITM_R getCacheItm(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
			return _cacheItm.get(itmCd, itmSub1, itmSub2, itmSub3);
		}
		
		protected void createItmUnitCache() {
			_cacheItmUnit = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(
					MCQueryApiBuilder.create(MAVM_ITM_UNIT_R.create("T")),
					up0(), Chk01_DtlR.$itm_cd, Chk01_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub2,
					Chk01_DtlR.$itm_sub3, Chk01_DtlR.$trd_unit_cd);
		}
		
		protected MAVM_ITM_UNIT_R getCacheItmUnit(String itmCd, String itmSub1, String itmSub2, String itmSub3, String trdUnitCd) {
			return _cacheItmUnit.get(itmCd, itmSub1, itmSub2, itmSub3, trdUnitCd);
		}
		
		protected void createDptCache() {
			MAM_DPT_R t1 = MAM_DPT_R.create("T");
			MCQueryApiBuilder dpt_bldr = MCQueryApiBuilder.create(t1);
			MAM_WG_R t2 = MAM_WG_R.create("T2");
			dpt_bldr.addInnerJoin(t2, t1.wg_cd.eq(t2.wg_cd));
			dpt_bldr.addSelect(t2.wg_nm);
			_cacheDpt = new FXUCL_MCDbcCacheStEnd<MAM_DPT_R>(dpt_bldr, up0(), Sprt01_DtlR.$purc_dpt_cd);
		}
		/**
		 * キャッシュ取得（部門マスタ）<br>債務部門の部門のみ返します。
		 * @param masterDt 適用日
		 * @param dptCd 部門ＣＤ
		 * @return 部門マスタ
		 */
		protected MAM_DPT_R getCacheDptOnlyApDpt(MCDate masterDt, String dptCd) {
			MAM_DPT_R apDptR = _cacheDpt.get(masterDt, dptCd);
			if (apDptR.ap_dpt_flg()) {
				return apDptR;
			}
			else {
				return MAM_DPT_R.create();
			}
		}
		
		protected Map_Sprt01_DtlR_Chk01_DtlR<Sprt01_DtlR,Chk01_DtlR> createMap_Sprt01_DtlR_Chk01_DtlR() {
			return new Map_Sprt01_DtlR_Chk01_DtlR<Sprt01_DtlR, Chk01_DtlR>();
		}

		public class Map_Sprt01_DtlR_Chk01_DtlR<D extends Sprt01_DtlR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Sprt01_DtlR.$peg_no, Chk01_DtlR.$peg_no);
				addColumnPathMap(Sprt01_DtlR.$rqst_avl_rqst_dt, Chk01_DtlR.$rqst_avl_rqst_dt);
				addColumnPathMap(Sprt01_DtlR.$dlv_rqst_dt, Chk01_DtlR.$dlv_rqst_tm);
				addColumnPathMap(Sprt01_DtlR.$po_dt, Chk01_DtlR.$po_dt);
				addColumnPathMap(Sprt01_DtlR.$purc_schd_dt, Chk01_DtlR.$purc_schd_dt);
				addColumnPathMap(Sprt01_DtlR.$sppl_cd, Chk01_DtlR.$sppl_cd);
				addColumnPathMap(Sprt01_DtlR.$sppl_nm, Chk01_DtlR.$sppl_nm);
				addColumnPathMap(Sprt01_DtlR.$sppl_zip_cd, Chk01_DtlR.$sppl_zip_cd);
				addColumnPathMap(Sprt01_DtlR.$sppl_addr1, Chk01_DtlR.$sppl_addr1);
				addColumnPathMap(Sprt01_DtlR.$sppl_addr2, Chk01_DtlR.$sppl_addr2);
				addColumnPathMap(Sprt01_DtlR.$sppl_addr3, Chk01_DtlR.$sppl_addr3);
				addColumnPathMap(Sprt01_DtlR.$sppl_addr4, Chk01_DtlR.$sppl_addr4);
				addColumnPathMap(Sprt01_DtlR.$sppl_tel, Chk01_DtlR.$sppl_tel);
				addColumnPathMap(Sprt01_DtlR.$sppl_fax, Chk01_DtlR.$sppl_fax);
				addColumnPathMap(Sprt01_DtlR.$sppl_cntct_dpt, Chk01_DtlR.$sppl_cntct_dpt);
				addColumnPathMap(Sprt01_DtlR.$sppl_cntct_psn, Chk01_DtlR.$sppl_cntct_psn);
				addColumnPathMap(Sprt01_DtlR.$sppl_cntry_cd, Chk01_DtlR.$sppl_cntry_cd);
				addColumnPathMap(Sprt01_DtlR.$sppl_cntry_nm, Chk01_DtlR.$sppl_cntry_nm);
				addColumnPathMap(Sprt01_DtlR.$purc_amt_rnd_typ, Chk01_DtlR.$purc_amt_rnd_typ);
				addColumnPathMap(Sprt01_DtlR.$purc_tax_rnd_typ, Chk01_DtlR.$purc_tax_rnd_typ);
				addColumnPathMap(Sprt01_DtlR.$sppl_purc_upri_cng_flg, Chk01_DtlR.$sppl_purc_upri_cng_flg);
				addColumnPathMap(Sprt01_DtlR.$purc_upri_req_typ, Chk01_DtlR.$purc_upri_req_typ);
				addColumnPathMap(Sprt01_DtlR.$purc_upri_req_typ_nm, Chk01_DtlR.$purc_upri_req_typ_nm);
				addColumnPathMap(Sprt01_DtlR.$sppl_pay_crryovr_times, Chk01_DtlR.$sppl_pay_crryovr_times);
				addColumnPathMap(Sprt01_DtlR.$sppl_iv_flg, Chk01_DtlR.$sppl_iv_flg);
				addColumnPathMap(Sprt01_DtlR.$subcon_flg, Chk01_DtlR.$subcon_flg);
				addColumnPathMap(Sprt01_DtlR.$asppl_cd, Chk01_DtlR.$asppl_cd);
				addColumnPathMap(Sprt01_DtlR.$asppl_nm, Chk01_DtlR.$asppl_nm);
				addColumnPathMap(Sprt01_DtlR.$ap_dpt_cd, Chk01_DtlR.$ap_dpt_cd);
				addColumnPathMap(Sprt01_DtlR.$ap_dpt_nm, Chk01_DtlR.$ap_dpt_nm);
				addColumnPathMap(Sprt01_DtlR.$sppl_ship_form_cd, Chk01_DtlR.$sppl_ship_form_cd);
				addColumnPathMap(Sprt01_DtlR.$prnt_lcl_cd, Chk01_DtlR.$prnt_lcl_cd);
				addColumnPathMap(Sprt01_DtlR.$po_print_cd, Chk01_DtlR.$po_print_cd);
				addColumnPathMap(Sprt01_DtlR.$po_print_nm, Chk01_DtlR.$po_print_nm);
				addColumnPathMap(Sprt01_DtlR.$itm_cd, Chk01_DtlR.$itm_cd);
				addColumnPathMap(Sprt01_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub1);
				addColumnPathMap(Sprt01_DtlR.$itm_sub2, Chk01_DtlR.$itm_sub2);
				addColumnPathMap(Sprt01_DtlR.$itm_sub3, Chk01_DtlR.$itm_sub3);
				addColumnPathMap(Sprt01_DtlR.$mfg_loc_cd, Chk01_DtlR.$mfg_loc_cd);
				addColumnPathMap(Sprt01_DtlR.$maker_cd, Chk01_DtlR.$maker_cd);
				addColumnPathMap(Sprt01_DtlR.$maker_nm, Chk01_DtlR.$maker_nm);
				addColumnPathMap(Sprt01_DtlR.$in_to_loc_wg_cd, Chk01_DtlR.$in_to_loc_wg_cd);
				addColumnPathMap(Sprt01_DtlR.$bom_ptn, Chk01_DtlR.$bom_ptn);
				addColumnPathMap(Sprt01_DtlR.$dlv_cd, Chk01_DtlR.$dlv_cd);
				addColumnPathMap(Sprt01_DtlR.$tdlv_cd, Chk01_DtlR.$tdlv_cd);
				addColumnPathMap(Sprt01_DtlR.$in_to_loc_cd, Chk01_DtlR.$in_to_loc_cd);
				addColumnPathMap(Sprt01_DtlR.$site_cd, Chk01_DtlR.$site_cd);
				addColumnPathMap(Sprt01_DtlR.$outsrc_sppl_cd, Chk01_DtlR.$outsrc_sppl_cd);
				addColumnPathMap(Sprt01_DtlR.$sppl_cal_cd, Chk01_DtlR.$sppl_cal_cd);
				addColumnPathMap(Sprt01_DtlR.$in_to_loc_cal_cd, Chk01_DtlR.$in_to_loc_cal_cd);
				addColumnPathMap(Sprt01_DtlR.$dlv_cal_cd, Chk01_DtlR.$dlv_cal_cd);
				addColumnPathMap(Sprt01_DtlR.$lg_grp_cd, Chk01_DtlR.$lg_grp_cd);
				addColumnPathMap(Sprt01_DtlR.$base_unit_qty, Chk01_DtlR.$base_unit_qty);
				addColumnPathMap(Sprt01_DtlR.$purc_id_typ, Chk01_DtlR.$purc_id_typ);
				addColumnPathMap(Sprt01_DtlR.$purc_id_typ_nm, Chk01_DtlR.$purc_id_typ_nm);
				addColumnPathMap(Sprt01_DtlR.$ver_flg, Chk01_DtlR.$ver_flg);
				addColumnPathMap(Sprt01_DtlR.$ver_no, Chk01_DtlR.$ver_no);
				addColumnPathMap(Sprt01_DtlR.$outsrc_flg, Chk01_DtlR.$outsrc_flg);
				addColumnPathMap(Sprt01_DtlR.$trd_cur_cd, Chk01_DtlR.$trd_cur_cd);
				addColumnPathMap(Sprt01_DtlR.$trd_cur_nm, Chk01_DtlR.$trd_cur_nm);
				addColumnPathMap(Sprt01_DtlR.$trd_cur_amt_dec_place, Chk01_DtlR.$trd_cur_amt_dec_place);
				addColumnPathMap(Sprt01_DtlR.$trd_cur_upri_dec_place, Chk01_DtlR.$trd_cur_upri_dec_place);
				addColumnPathMap(Sprt01_DtlR.$tax_cd, Chk01_DtlR.$tax_cd);
				addColumnPathMap(Sprt01_DtlR.$tax_nm, Chk01_DtlR.$tax_nm);
				addColumnPathMap(Sprt01_DtlR.$tax_typ, Chk01_DtlR.$tax_typ);
				addColumnPathMap(Sprt01_DtlR.$inc_tax_flg, Chk01_DtlR.$inc_tax_flg);
				addColumnPathMap(Sprt01_DtlR.$tax_rate, Chk01_DtlR.$tax_rate);
				addColumnPathMap(Sprt01_DtlR.$bd_dpt_cd, Chk01_DtlR.$bd_dpt_cd);
				addColumnPathMap(Sprt01_DtlR.$bd_dpt_nm, Chk01_DtlR.$bd_dpt_nm);
				addColumnPathMap(Sprt01_DtlR.$pay_crryovr_times, Chk01_DtlR.$pay_crryovr_times);
				addColumnPathMap(Sprt01_DtlR.$iv_itm_nm, Chk01_DtlR.$iv_itm_nm);
				addColumnPathMap(Sprt01_DtlR.$sppl_itm_cd, Chk01_DtlR.$sppl_itm_cd);
				addColumnPathMap(Sprt01_DtlR.$sppl_itm_nm, Chk01_DtlR.$sppl_itm_nm);
				addColumnPathMap(Sprt01_DtlR.$wtax_rate, Chk01_DtlR.$wtax_rate);
				addColumnPathMap(Sprt01_DtlR.$purc_usr_cd, Chk01_DtlR.$purc_usr_cd);
				addColumnPathMap(Sprt01_DtlR.$purc_usr_nm, Chk01_DtlR.$purc_usr_nm);
				addColumnPathMap(Sprt01_DtlR.$purc_dpt_cd, Chk01_DtlR.$purc_dpt_cd);
				addColumnPathMap(Sprt01_DtlR.$purc_dpt_nm, Chk01_DtlR.$purc_dpt_nm);
				addColumnPathMap(Sprt01_DtlR.$purc_dpt_wg_cd, Chk01_DtlR.$purc_dpt_wg_cd);
				addColumnPathMap(Sprt01_DtlR.$purc_dpt_wg_nm, Chk01_DtlR.$purc_dpt_wg_nm);
				addColumnPathMap(Sprt01_DtlR.$xrate, Chk01_DtlR.$xrate);
				addColumnPathMap(Sprt01_DtlR.$ptax_xrate, Chk01_DtlR.$ptax_xrate);

			}
		}
		/**
		 * 下り電文を設定します
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
		/**
		 * 下り電文を編集します
		 */
		protected void editDown() {
			for (Chk01_DtlR r : down0()) {
				// 有効成分を設定する
				if (r.cont_fctr_flg()) {
					MCNumber contQty =  MAUCL_MCDataUtil.convToContFctrUnit(
							  r.base_unit_qty()
							, r.std_cont_fctr()
							, r.cont_fctr_dec_place()
							, r.cont_fctr_rnd_typ());
					
					r.cont_qty(contQty);
				}
				r.rqst_dlv_rqst_tm(r.dlv_rqst_tm());
				if (!isNullOrNullVal(r.mfg_loc_cd()) && !r.outsrc_flg()) {
					r.outsrc_flg(true);
				}
				if (!r.outsrc_flg()) {
					r.outsrc_upri_typ(null);
				}
				if (r.edi_tgt_flg()) {
					r.edi_flg((boolean)complInputFileValue(Chk01_DtlR.$edi_flg, r.edi_flg(), true));
				}
				else {
					r.edi_flg(false);
				}
			}
		}
	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 発注を登録する。<br>
	 */
	public class Ins01 extends MSBDL_PoListReg_MC_A.Ins01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up1());
			}
			catch (Exception e) {
				handleEx(e, up1());
			}
			finally {
				down0().setAll(up1());
			}
		}
		
		protected void handleSuccess(MCList<Chk01_DtlR> l) {
			dbTran().commit();
			for (Chk01_DtlR r : l) {
				if (!r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}
		
		protected void handleEx(Exception e, MCList<Chk01_DtlR> l) {
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
			for (Chk01_DtlR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}
		
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up1().size());
		}
		

		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			setApCredCd(up1());
			List<MCList<Chk01_DtlR>> list = splitUp(up1(), getSplitRowCount());
			for (MCList<Chk01_DtlR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk01_DtlR> up0L = ((MCList<Chk01_DtlR>)ope.up(1));
				Ins01_HdrR hdrR = (Ins01_HdrR)ope.up(0); 
				MCRow.copyall(hdrR, up0());
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}	

		protected List<MCList<Chk01_DtlR>> splitUp(MCList<Chk01_DtlR> list, int max) {
			List<MCList<Chk01_DtlR>> ret = new ArrayList<>();
			MCList<Chk01_DtlR>[] grpL = list.groupList(getSplitColumn());
			MCList<Chk01_DtlR> tmp = MCList.create(Chk01_DtlR.class);
			for (MCList<Chk01_DtlR> grp : grpL) {
				if (tmp.size() >= max) {
					ret.add(tmp);
					tmp = MCList.create(Chk01_DtlR.class);
				}
				tmp.addAll(grp);
			}
			if (!tmp.isEmpty()) {
				ret.add(tmp);
			}
			return ret;
		}
		
		@Override
		protected void doIt() {
			up1().setStringNE(Chk01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
			MCList<Chk01_DtlR> dtlL = up1();
			setPegNo(dtlL);
			setOutsrcFlg(dtlL);
			callThisChk01(up1(), false);
			MCList<Chk01_DtlR> list =getChkList(up1());
			callPoRegPoIns01(list);
			setDown();
		}
		protected void setOutsrcFlg(MCList<Chk01_DtlR> dtlL) {
			for (Chk01_DtlR dtlR : dtlL) {
				if (!isNullOrNullVal(dtlR.mfg_loc_cd()) && !dtlR.outsrc_flg()) {
					dtlR.outsrc_flg(true);
				}
			}
		}
		/**
		 * 発注登録サービスを実行する
		 */
		protected void callPoRegPoIns01(MCList<Chk01_DtlR> dtlL) {
			MSBDL_PoRegService.Po_Ins01 poIns01 = MSBDL_PoRegService.crtPo_Ins01();
			MCList<Chk01_DtlR>[] upGroupList = makeGroupList(dtlL);
			
			for (MCList<Chk01_DtlR> list : upGroupList) {
				// ヘッダ情報を作成
				Chk01_DtlR hdrR = Chk01_DtlR.create();
				hdrR = list.get(0);
				Po_Ins01_HdrR ins01HdrR = Po_Ins01_HdrR.create();
				copy(ins01HdrR, hdrR, createMap_Po_Ins01_HdrR_Chk01_DtlR());
				ins01HdrR.prnt_po_flg(up0().prnt_po_flg());
				ins01HdrR.prnt_dlv_flg(up0().prnt_dlv_flg() && hdrR.po_dlv_slip_flg());
				ins01HdrR.prnt_purc_ddlv_dlv_flg(up0().prnt_purc_ddlv_dlv_flg());
				ins01HdrR.indiv_prnt_flg(up0().indiv_prnt_flg());
				poIns01.up0().add(ins01HdrR);
				
				// 明細情報を作成
				setDispSeq(list);
				addAll(poIns01.up1(), list, createMap_Po_Ins01_DtlR_Chk01_DtlR());
				
				addAll(poIns01.up2(), list, createMap_Po_Ins01_Bndl_DtlR_Chk01_DtlR());
			}
			if (poIns01.up0().size() > 0) {
				poIns01.exec();
				
				// ヘッダ
				String[] destCols = {Chk01_DtlR.$po_no, Chk01_DtlR.$po_rev, Chk01_DtlR.$aprv_no, Chk01_DtlR.$aprv_sts_typ};
				String[] srcCols = {Po_Ins01_HdrR.$po_no, Po_Ins01_HdrR.$po_rev, Po_Ins01_HdrR.$aprv_no, Po_Ins01_HdrR.$aprv_sts_typ};
				copyByPegNo(up1(), poIns01.down0(), "hdr_peg_no", destCols, Po_Ins01_HdrR.$peg_no, srcCols);
				
				// 明細
				String[] dtlDestCols = {
						Chk01_DtlR.$po_d_no,
						Chk01_DtlR.$outsrc_itm_ord_no,
						Chk01_DtlR.$dlv_slip_no,
						Chk01_DtlR.$dlv_slip_seq,
						Chk01_DtlR.$dlv_slip_rev,
						Chk01_DtlR.$purc_ddlv_dlv_slip_no,
						Chk01_DtlR.$purc_ddlv_dlv_slip_rev
				};
				String[] dtlSrcCols = {
						Po_Ins01_DtlR.$po_d_no,
						Po_Ins01_DtlR.$outsrc_itm_ord_no,
						Po_Ins01_DtlR.$dlv_slip_no,
						Po_Ins01_DtlR.$dlv_slip_seq,
						Po_Ins01_DtlR.$dlv_slip_rev,
						Po_Ins01_DtlR.$purc_ddlv_dlv_slip_no,
						Po_Ins01_DtlR.$purc_ddlv_dlv_slip_rev};
				copyByPegNo(up1(), poIns01.down1(), "peg_no", dtlDestCols, Po_Ins01_DtlR.$peg_no, dtlSrcCols);
			}
		}
		/**
		 * 下り電文を設定します
		 * ※finallyで設定しているが、定数名補完のためにdoIt内で先にdownを設定しておく必要があります。
		 */
		protected void setDown() {
			down0().setAll(up1());
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 発注を取り消す。<br>
	 */
	public class Del01 extends MSBDL_PoListReg_MC_A.Del01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up1());
			}
			catch (Exception e) {
				handleEx(e, up1());
			}
			finally {
				down0().setAll(up1().subList(Chk02_DtlR.$up_flg, true));
			}
		}
		
		protected void handleSuccess(MCList<Chk02_DtlR> l) {
			dbTran().commit();
			for (Chk02_DtlR r : l) {
				if (!r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}
		
		protected void handleEx(Exception e, MCList<Chk02_DtlR> l) {
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
			for (Chk02_DtlR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}
		

		
		@Override
		protected void doIt() {
			editUp();
			callThisChk02();
			setPegNoByPo();
			callPoRegPoDel01();
		}
		
		protected void editUp(){
			up1().setStringNE(Chk02_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value());
			up1().setBooleanNE(Chk02_DtlR.$up_flg, true);
		}
		
		/**
		 * 紐付けＮＯを採番します
		 */
		protected void setPegNoByPo() {
			// ヘッダ-明細形式で紐付けＮＯを発番する
			up2().addNumberColumn("peg_no");
			setPegNo(up2());
			up2().addNumberColumn("dtl_peg_no");
			
			MCIndexKey idx = up2().createIndex(Chk02_Dtl2R.$po_d_no);
			for (Chk02_DtlR dtlR : up1()) {
				MCList<Chk02_Dtl2R> dtl2L = up2().subList(idx, dtlR.po_d_no());
				dtl2L.setNumberNE("dtl_peg_no", dtlR.peg_no());
			}
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk02() {
			MSBDL_PoListReg.Chk02 chk02 = MSBDL_PoListReg.crtChk02();
			chk02.up0().setAll(up1());
			chk02.up1().setAll(up2());
			chk02.exec();
			up1().setAll(chk02.down0());
			up2().setAll(chk02.down1());
		}
		/**
		 * 発注登録サービスを実行する
		 */
		protected void callPoRegPoDel01() {
			MCList<Chk02_DtlR> dtlL = getNoErrList(up1());
			// 全行取消の場合は伝票取消
			MSBDL_PoRegService.Po_Del01 poDel01 = MSBDL_PoRegService.crtPo_Del01();
			// 行削除の場合は更新処理とする
			MSBDL_PoRegService.Po_Upd01 poUpd01 = MSBDL_PoRegService.crtPo_Upd01();
			MCList<Chk02_DtlR>[] dtlLByPoNo = dtlL.groupList(Chk02_DtlR.$po_no);
			
			for (MCList<Chk02_DtlR> list : dtlLByPoNo) {
				MCList<Chk02_DtlR> updL = list.subList(Chk02_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.UPD.value());
				if (updL.size() == 0) {
					// ヘッダの設定
					Chk02_DtlR delHdrR = list.get(0);
					Po_Ins01_HdrR poUpd01Up0 = Po_Ins01_HdrR.create();
					copy(poUpd01Up0, delHdrR, createMap_Po_Ins01_HdrR_Chk02_DtlR());
					poUpd01Up0.prnt_po_flg(up0().prnt_po_flg());
					poUpd01Up0.prnt_dlv_flg(up0().prnt_dlv_flg() && delHdrR.po_dlv_slip_flg());
					poUpd01Up0.prnt_purc_ddlv_dlv_flg(up0().prnt_purc_ddlv_dlv_flg());
					poUpd01Up0.indiv_prnt_flg(up0().indiv_prnt_flg());
					poDel01.up0().add(poUpd01Up0);
					// 明細の設定
					addAll(poDel01.up1(), list, createMap_Po_Ins01_DtlR_Chk02_DtlR());
					
					// まとめ対象の設定
					MCList<Chk02_Dtl2R> subL = up2().subList(Chk02_Dtl2R.$po_no, delHdrR.po_no());
					addAll(poDel01.up2(), subL, createMap_Po_Ins01_Bndl_DtlR_Chk02_Dtl2R());
				}
				else {
					Chk02_DtlR updHdrR = list.get(0);
					// ヘッダの設定
					Po_Ins01_HdrR poUpd01Up0 = Po_Ins01_HdrR.create();
					copy(poUpd01Up0, updHdrR, createMap_Po_Ins01_HdrR_Chk02_DtlR());
					poUpd01Up0.prnt_po_flg(up0().prnt_po_flg());
					poUpd01Up0.prnt_dlv_flg(up0().prnt_dlv_flg());
					poUpd01Up0.prnt_purc_ddlv_dlv_flg(up0().prnt_purc_ddlv_dlv_flg());
					poUpd01Up0.indiv_prnt_flg(up0().indiv_prnt_flg());
					poUpd01.up0().add(poUpd01Up0);
					// 明細の設定
					addAll(poUpd01.up1(), list, createMap_Po_Ins01_DtlR_Chk02_DtlR());
					// まとめ対象の設定
					MCList<Chk02_Dtl2R> subL = up2().subList(Chk02_Dtl2R.$po_no, updHdrR.po_no());
					addAll(poUpd01.up2(), subL, createMap_Po_Ins01_Bndl_DtlR_Chk02_Dtl2R());
				}
			}
			if (poDel01.up0().size() > 0) {
				poDel01.exec();
			}
			if (poUpd01.up0().size() > 0) {
				poUpd01.exec();
			}
		}
	}
	
	/**
	 * ヘッダ項目が同一の明細は、同一伝票にまとめます
	 * @param dtlL
	 * @return
	 */
	protected MCList<Chk01_DtlR>[] makeGroupList(MCList<Chk01_DtlR> dtlL) {
		MCList<Chk01_DtlR>[] upGroupList 
			= dtlL.groupList(getHdrColumn());
		return upGroupList;
	}
	
	/**
	 * 基準単位数量を設定します
	 * @param dtlR
	 */
	protected void setBaseUnitInfo(Chk01_DtlR dtlR){		
		dtlR.base_unit_qty(convToBaseUnit(dtlR.trd_unit_qty(), dtlR.trd_unit_conv_base_qty(), dtlR.trd_unit_conv_qty(),
				dtlR.base_unit_dec_place(), dtlR.base_unit_rnd_typ()));
	}
	
	/**
	 * 直納区分を設定します
	 * @param dtlR
	 */
	protected void setDrctDlvTyp(Chk01_DtlR dtlR) {
		if (isNullAnd(dtlR.outsrc_sppl_cd(), dtlR.dlv_cd())) {
			dtlR.drct_dlv_typ(MSC_DRCT_DLV_TYP.VIA.value());
		}
		else {
			dtlR.drct_dlv_typ(MSC_DRCT_DLV_TYP.DDLV.value());
		}
	}
	
	/**
	 * チェック処理を実行する
	 */
	protected void callThisChk01(MCList<Chk01_DtlR> dtlL, boolean fileImpFlg) {
		MSBDL_PoListReg.Chk01 chk01 = MSBDL_PoListReg.crtChk01();
		chk01.up0().setAll(dtlL);
		chk01.up1().file_imp_flg(fileImpFlg);
		chk01.exec();
		dtlL.setAll(chk01.down0());
	}
	
	/**
	 * 処理対象のうち、伝票単位でエラーのない行のみ抽出したリストを返します。
	 * @param list
	 * @return
	 */
	protected MCList<Chk02_DtlR> getNoErrList(MCList<Chk02_DtlR> list) {
		MCList<Chk02_DtlR> noErrList = MCList.create(Chk02_DtlR.class);
		MCList<Chk02_DtlR>[] grpL = list.groupList(Chk02_DtlR.$po_no);
		for (MCList<Chk02_DtlR> tmpL : grpL) {
			// 伝票単位でエラーが無い場合に処理続行
			if (isSame(tmpL.size(), getChkList(tmpL).size())) {
				noErrList.addAll(tmpL);
			}
		}
		return noErrList;
	}
	protected Map_Po_Ins01_HdrR_Chk01_DtlR<Po_Ins01_HdrR,Chk01_DtlR> createMap_Po_Ins01_HdrR_Chk01_DtlR() {
		return new Map_Po_Ins01_HdrR_Chk01_DtlR<Po_Ins01_HdrR, Chk01_DtlR>();
	}

	public class Map_Po_Ins01_HdrR_Chk01_DtlR<D extends Po_Ins01_HdrR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Po_Ins01_HdrR.$data_crud_typ, Chk01_DtlR.$data_crud_typ);
			addColumnPathMap(Po_Ins01_HdrR.$peg_no, Chk01_DtlR.$peg_no);
			addColumnPathMap(Po_Ins01_HdrR.$po_no, Chk01_DtlR.$po_no);
			addColumnPathMap(Po_Ins01_HdrR.$po_rev, Chk01_DtlR.$po_rev);
			addColumnPathMap(Po_Ins01_HdrR.$trd_cd, Chk01_DtlR.$trd_cd);
			addColumnPathMap(Po_Ins01_HdrR.$trd_ptn_typ, Chk01_DtlR.$trd_ptn_typ);
			addColumnPathMap(Po_Ins01_HdrR.$purc_dpt_cd, Chk01_DtlR.$purc_dpt_cd);
			addColumnPathMap(Po_Ins01_HdrR.$wg_cd, Chk01_DtlR.$purc_dpt_wg_cd);
			addColumnPathMap(Po_Ins01_HdrR.$purc_usr_cd, Chk01_DtlR.$purc_usr_cd);
			addColumnPathMap(Po_Ins01_HdrR.$sppl_cd, Chk01_DtlR.$sppl_cd);
			addColumnPathMap(Po_Ins01_HdrR.$sppl_cntct_dpt, Chk01_DtlR.$sppl_cntct_dpt);
			addColumnPathMap(Po_Ins01_HdrR.$sppl_cntct_psn, Chk01_DtlR.$sppl_cntct_psn);
			addColumnPathMap(Po_Ins01_HdrR.$sppl_zip_cd, Chk01_DtlR.$sppl_zip_cd);
			addColumnPathMap(Po_Ins01_HdrR.$sppl_addr1, Chk01_DtlR.$sppl_addr1);
			addColumnPathMap(Po_Ins01_HdrR.$sppl_addr2, Chk01_DtlR.$sppl_addr2);
			addColumnPathMap(Po_Ins01_HdrR.$sppl_addr3, Chk01_DtlR.$sppl_addr3);
			addColumnPathMap(Po_Ins01_HdrR.$sppl_addr4, Chk01_DtlR.$sppl_addr4);
			addColumnPathMap(Po_Ins01_HdrR.$sppl_tel, Chk01_DtlR.$sppl_tel);
			addColumnPathMap(Po_Ins01_HdrR.$sppl_fax, Chk01_DtlR.$sppl_fax);
			addColumnPathMap(Po_Ins01_HdrR.$po_dt, Chk01_DtlR.$po_dt);
			addColumnPathMap(Po_Ins01_HdrR.$upd_po_print_schd_dt, Chk01_DtlR.$upd_po_print_schd_dt);
			addColumnPathMap(Po_Ins01_HdrR.$po_print_flg, Chk01_DtlR.$po_print_flg);
			addColumnPathMap(Po_Ins01_HdrR.$last_po_rev, Chk01_DtlR.$last_po_rev);
			addColumnPathMap(Po_Ins01_HdrR.$trd_cur_cd, Chk01_DtlR.$trd_cur_cd);
			addColumnPathMap(Po_Ins01_HdrR.$xrate, Chk01_DtlR.$xrate);
			addColumnPathMap(Po_Ins01_HdrR.$xrate_inpt_flg, Chk01_DtlR.$xrate_inpt_flg);
			addColumnPathMap(Po_Ins01_HdrR.$ptax_xrate, Chk01_DtlR.$ptax_xrate);
			addColumnPathMap(Po_Ins01_HdrR.$ptax_xrate_inpt_flg, Chk01_DtlR.$ptax_xrate_inpt_flg);
			addColumnPathMap(Po_Ins01_HdrR.$crct_rsn_cd, Chk01_DtlR.$crct_rsn_cd);
			addColumnPathMap(Po_Ins01_HdrR.$po_print_cd, Chk01_DtlR.$po_print_cd);
			addColumnPathMap(Po_Ins01_HdrR.$wrk_no, Chk01_DtlR.$wrk_no);
			addColumnPathMap(Po_Ins01_HdrR.$tterm_cd1, Chk01_DtlR.$tterm_cd1);
			addColumnPathMap(Po_Ins01_HdrR.$tterm_rmrks1, Chk01_DtlR.$tterm_rmrks1);
			addColumnPathMap(Po_Ins01_HdrR.$tterm_cd2, Chk01_DtlR.$tterm_cd2);
			addColumnPathMap(Po_Ins01_HdrR.$tterm_rmrks2, Chk01_DtlR.$tterm_rmrks2);
			addColumnPathMap(Po_Ins01_HdrR.$tterm_cd3, Chk01_DtlR.$tterm_cd3);
			addColumnPathMap(Po_Ins01_HdrR.$tterm_rmrks3, Chk01_DtlR.$tterm_rmrks3);
			addColumnPathMap(Po_Ins01_HdrR.$edi_flg, Chk01_DtlR.$edi_flg);
			addColumnPathMap(Po_Ins01_HdrR.$aprv_flg, Chk01_DtlR.$aprv_flg);
			addColumnPathMap(Po_Ins01_HdrR.$aprv_no, Chk01_DtlR.$aprv_no);
			addColumnPathMap(Po_Ins01_HdrR.$aprv_sts_typ, Chk01_DtlR.$aprv_sts_typ);
			addColumnPathMap(Po_Ins01_HdrR.$trd_rmrks, Chk01_DtlR.$trd_rmrks);
			addColumnPathMap(Po_Ins01_HdrR.$intr_rmrks, Chk01_DtlR.$intr_rmrks);
			addColumnPathMap(Po_Ins01_HdrR.$po_print_rmrks, Chk01_DtlR.$po_print_rmrks);
			addColumnPathMap(Po_Ins01_HdrR.$dlv_slip_rmrks, Chk01_DtlR.$dlv_slip_rmrks);
			addColumnPathMap(Po_Ins01_HdrR.$sub_char1, Chk01_DtlR.$sub_char1);
			addColumnPathMap(Po_Ins01_HdrR.$sub_char2, Chk01_DtlR.$sub_char2);
			addColumnPathMap(Po_Ins01_HdrR.$sub_char3, Chk01_DtlR.$sub_char3);
			addColumnPathMap(Po_Ins01_HdrR.$edi_sub_char1, Chk01_DtlR.$edi_sub_char1);
			addColumnPathMap(Po_Ins01_HdrR.$edi_sub_char2, Chk01_DtlR.$edi_sub_char2);
			addColumnPathMap(Po_Ins01_HdrR.$edi_sub_char3, Chk01_DtlR.$edi_sub_char3);
			addColumnPathMap(Po_Ins01_HdrR.$edi_sub_char4, Chk01_DtlR.$edi_sub_char4);
			addColumnPathMap(Po_Ins01_HdrR.$edi_sub_char5, Chk01_DtlR.$edi_sub_char5);
			addColumnPathMap(Po_Ins01_HdrR.$edi_sub_num1, Chk01_DtlR.$edi_sub_num1);
			addColumnPathMap(Po_Ins01_HdrR.$edi_sub_dt1, Chk01_DtlR.$edi_sub_dt1);
		}
	}
	
	protected Map_Po_Ins01_DtlR_Chk01_DtlR<Po_Ins01_DtlR,Chk01_DtlR> createMap_Po_Ins01_DtlR_Chk01_DtlR() {
		return new Map_Po_Ins01_DtlR_Chk01_DtlR<Po_Ins01_DtlR, Chk01_DtlR>();
	}

	public class Map_Po_Ins01_DtlR_Chk01_DtlR<D extends Po_Ins01_DtlR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Po_Ins01_DtlR.$data_crud_typ, Chk01_DtlR.$data_crud_typ);
			addColumnPathMap(Po_Ins01_DtlR.$peg_no, Chk01_DtlR.$peg_no);
			addColumnPathMap(Po_Ins01_DtlR.$po_d_no, Chk01_DtlR.$po_d_no);
			addColumnPathMap(Po_Ins01_DtlR.$po_no, Chk01_DtlR.$po_no);
			addColumnPathMap(Po_Ins01_DtlR.$po_rev, Chk01_DtlR.$po_rev);
			addColumnPathMap(Po_Ins01_DtlR.$po_schd_no, Chk01_DtlR.$po_schd_no);
			addColumnPathMap(Po_Ins01_DtlR.$disp_seq, Chk01_DtlR.$disp_seq);
			addColumnPathMap(Po_Ins01_DtlR.$itm_cd, Chk01_DtlR.$itm_cd);
			addColumnPathMap(Po_Ins01_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub1);
			addColumnPathMap(Po_Ins01_DtlR.$itm_sub2, Chk01_DtlR.$itm_sub2);
			addColumnPathMap(Po_Ins01_DtlR.$itm_sub3, Chk01_DtlR.$itm_sub3);
			addColumnPathMap(Po_Ins01_DtlR.$ver_no, Chk01_DtlR.$ver_no);
			addColumnPathMap(Po_Ins01_DtlR.$itm_nm, Chk01_DtlR.$itm_nm);
			addColumnPathMap(Po_Ins01_DtlR.$iv_itm_nm, Chk01_DtlR.$iv_itm_nm);
			addColumnPathMap(Po_Ins01_DtlR.$sno1, Chk01_DtlR.$sno1);
			addColumnPathMap(Po_Ins01_DtlR.$sno2, Chk01_DtlR.$sno2);
			addColumnPathMap(Po_Ins01_DtlR.$sno3, Chk01_DtlR.$sno3);
			addColumnPathMap(Po_Ins01_DtlR.$sno4, Chk01_DtlR.$sno4);
			addColumnPathMap(Po_Ins01_DtlR.$purc_rsn_cd, Chk01_DtlR.$purc_rsn_cd);
			addColumnPathMap(Po_Ins01_DtlR.$purc_id_typ, Chk01_DtlR.$purc_id_typ);
			addColumnPathMap(Po_Ins01_DtlR.$sundry_itm_flg, Chk01_DtlR.$sundry_itm_flg);
			addColumnPathMap(Po_Ins01_DtlR.$sppl_itm_cd, Chk01_DtlR.$sppl_itm_cd);
			addColumnPathMap(Po_Ins01_DtlR.$sppl_itm_nm, Chk01_DtlR.$sppl_itm_nm);
			addColumnPathMap(Po_Ins01_DtlR.$ap_dpt_cd, Chk01_DtlR.$ap_dpt_cd);
			addColumnPathMap(Po_Ins01_DtlR.$maker_cd, Chk01_DtlR.$maker_cd);
			addColumnPathMap(Po_Ins01_DtlR.$bp_lot_no, Chk01_DtlR.$bp_lot_no);
			addColumnPathMap(Po_Ins01_DtlR.$in_to_loc_cd, Chk01_DtlR.$in_to_loc_cd);
			addColumnPathMap(Po_Ins01_DtlR.$str_ln_cd, Chk01_DtlR.$str_ln_cd);
			addColumnPathMap(Po_Ins01_DtlR.$dlv_cd, Chk01_DtlR.$dlv_cd);
			addColumnPathMap(Po_Ins01_DtlR.$dlv_sundry_flg, Chk01_DtlR.$dlv_sundry_flg);
			addColumnPathMap(Po_Ins01_DtlR.$dlv_nm, Chk01_DtlR.$dlv_nm);
			addColumnPathMap(Po_Ins01_DtlR.$dlv_cntct_dpt, Chk01_DtlR.$dlv_cntct_dpt);
			addColumnPathMap(Po_Ins01_DtlR.$dlv_cntct_psn, Chk01_DtlR.$dlv_cntct_psn);
			addColumnPathMap(Po_Ins01_DtlR.$dlv_zip_cd, Chk01_DtlR.$dlv_zip_cd);
			addColumnPathMap(Po_Ins01_DtlR.$dlv_addr1, Chk01_DtlR.$dlv_addr1);
			addColumnPathMap(Po_Ins01_DtlR.$dlv_addr2, Chk01_DtlR.$dlv_addr2);
			addColumnPathMap(Po_Ins01_DtlR.$dlv_addr3, Chk01_DtlR.$dlv_addr3);
			addColumnPathMap(Po_Ins01_DtlR.$dlv_addr4, Chk01_DtlR.$dlv_addr4);
			addColumnPathMap(Po_Ins01_DtlR.$dlv_tel, Chk01_DtlR.$dlv_tel);
			addColumnPathMap(Po_Ins01_DtlR.$dlv_fax, Chk01_DtlR.$dlv_fax);
			addColumnPathMap(Po_Ins01_DtlR.$tdlv_cd, Chk01_DtlR.$tdlv_cd);
			addColumnPathMap(Po_Ins01_DtlR.$tdlv_sundry_flg, Chk01_DtlR.$tdlv_sundry_flg);
			addColumnPathMap(Po_Ins01_DtlR.$tdlv_nm, Chk01_DtlR.$tdlv_nm);
			addColumnPathMap(Po_Ins01_DtlR.$tdlv_cntct_dpt, Chk01_DtlR.$tdlv_cntct_dpt);
			addColumnPathMap(Po_Ins01_DtlR.$tdlv_cntct_psn, Chk01_DtlR.$tdlv_cntct_psn);
			addColumnPathMap(Po_Ins01_DtlR.$tdlv_zip_cd, Chk01_DtlR.$tdlv_zip_cd);
			addColumnPathMap(Po_Ins01_DtlR.$tdlv_addr1, Chk01_DtlR.$tdlv_addr1);
			addColumnPathMap(Po_Ins01_DtlR.$tdlv_addr2, Chk01_DtlR.$tdlv_addr2);
			addColumnPathMap(Po_Ins01_DtlR.$tdlv_addr3, Chk01_DtlR.$tdlv_addr3);
			addColumnPathMap(Po_Ins01_DtlR.$tdlv_addr4, Chk01_DtlR.$tdlv_addr4);
			addColumnPathMap(Po_Ins01_DtlR.$tdlv_tel, Chk01_DtlR.$tdlv_tel);
			addColumnPathMap(Po_Ins01_DtlR.$tdlv_fax, Chk01_DtlR.$tdlv_fax);
			addColumnPathMap(Po_Ins01_DtlR.$dlv_rqst_tm, Chk01_DtlR.$dlv_rqst_tm);
			addColumnPathMap(Po_Ins01_DtlR.$purc_lt, Chk01_DtlR.$purc_lt);
			addColumnPathMap(Po_Ins01_DtlR.$rqst_dlv_rqst_tm, Chk01_DtlR.$rqst_dlv_rqst_tm);
			addColumnPathMap(Po_Ins01_DtlR.$rqst_avl_rqst_dt, Chk01_DtlR.$rqst_avl_rqst_dt);
			addColumnPathMap(Po_Ins01_DtlR.$purc_schd_dt, Chk01_DtlR.$purc_schd_dt);
			addColumnPathMap(Po_Ins01_DtlR.$sync_flg, Chk01_DtlR.$sync_flg);
			addColumnPathMap(Po_Ins01_DtlR.$purc_basis_typ, Chk01_DtlR.$purc_basis_typ);
			addColumnPathMap(Po_Ins01_DtlR.$purc_upri_req_typ, Chk01_DtlR.$purc_upri_req_typ);
			addColumnPathMap(Po_Ins01_DtlR.$trd_unit_qty, Chk01_DtlR.$trd_unit_qty);
			addColumnPathMap(Po_Ins01_DtlR.$trd_unit_cd, Chk01_DtlR.$trd_unit_cd);
			addColumnPathMap(Po_Ins01_DtlR.$base_unit_qty, Chk01_DtlR.$base_unit_qty);
			addColumnPathMap(Po_Ins01_DtlR.$base_unit_cd, Chk01_DtlR.$base_unit_cd);
			addColumnPathMap(Po_Ins01_DtlR.$interim_flg, Chk01_DtlR.$interim_flg);
			addColumnPathMap(Po_Ins01_DtlR.$upri_not_tgt_flg, Chk01_DtlR.$upri_not_tgt_flg);
			addColumnPathMap(Po_Ins01_DtlR.$trd_cur_upri, Chk01_DtlR.$trd_cur_upri);
			addColumnPathMap(Po_Ins01_DtlR.$trd_cur_proc_upri, Chk01_DtlR.$trd_cur_proc_upri);
			addColumnPathMap(Po_Ins01_DtlR.$trd_cur_onr_prov_upri, Chk01_DtlR.$trd_cur_onr_prov_upri);
			addColumnPathMap(Po_Ins01_DtlR.$trd_cur_amt, Chk01_DtlR.$trd_cur_amt);
			addColumnPathMap(Po_Ins01_DtlR.$trd_cur_proc_amt, Chk01_DtlR.$trd_cur_proc_amt);
			addColumnPathMap(Po_Ins01_DtlR.$trd_cur_onr_prov_amt, Chk01_DtlR.$trd_cur_onr_prov_amt);
			addColumnPathMap(Po_Ins01_DtlR.$trd_cur_tax_amt, Chk01_DtlR.$trd_cur_tax_amt);
			addColumnPathMap(Po_Ins01_DtlR.$trd_cur_dscnt_amt, Chk01_DtlR.$trd_cur_dscnt_amt);
			addColumnPathMap(Po_Ins01_DtlR.$dscnt_rsn_cd, Chk01_DtlR.$dscnt_rsn_cd);
			addColumnPathMap(Po_Ins01_DtlR.$tax_fix_flg, Chk01_DtlR.$tax_fix_flg);
			addColumnPathMap(Po_Ins01_DtlR.$tax_cd, Chk01_DtlR.$tax_cd);
			addColumnPathMap(Po_Ins01_DtlR.$inc_tax_flg, Chk01_DtlR.$inc_tax_flg);
			addColumnPathMap(Po_Ins01_DtlR.$wtax_rate, Chk01_DtlR.$wtax_rate);
			addColumnPathMap(Po_Ins01_DtlR.$wtax_amt, Chk01_DtlR.$wtax_amt);
			addColumnPathMap(Po_Ins01_DtlR.$drct_dlv_typ, Chk01_DtlR.$drct_dlv_typ);
			addColumnPathMap(Po_Ins01_DtlR.$mfg_loc_cd, Chk01_DtlR.$mfg_loc_cd);
			addColumnPathMap(Po_Ins01_DtlR.$bom_ptn, Chk01_DtlR.$bom_ptn);
			addColumnPathMap(Po_Ins01_DtlR.$bndl_flg, Chk01_DtlR.$bndl_flg);
			addColumnPathMap(Po_Ins01_DtlR.$outsrc_itm_ord_no, Chk01_DtlR.$outsrc_itm_ord_no);
			addColumnPathMap(Po_Ins01_DtlR.$outsrc_flg, Chk01_DtlR.$outsrc_flg);
			addColumnPathMap(Po_Ins01_DtlR.$uplnd_flg, Chk01_DtlR.$uplnd_flg);
			addColumnPathMap(Po_Ins01_DtlR.$schd_chg_flg, Chk01_DtlR.$schd_chg_flg);
			addColumnPathMap(Po_Ins01_DtlR.$po_conf_rcpt_flg, Chk01_DtlR.$po_conf_rcpt_flg);
			addColumnPathMap(Po_Ins01_DtlR.$po_conf_rcpt_dt, Chk01_DtlR.$po_conf_rcpt_dt);
			addColumnPathMap(Po_Ins01_DtlR.$pri_print_flg, Chk01_DtlR.$pri_print_flg);
			addColumnPathMap(Po_Ins01_DtlR.$pay_crryovr_times, Chk01_DtlR.$pay_crryovr_times);
			addColumnPathMap(Po_Ins01_DtlR.$slo_no, Chk01_DtlR.$slo_no);
			addColumnPathMap(Po_Ins01_DtlR.$slo_d_no, Chk01_DtlR.$slo_d_no);
			addColumnPathMap(Po_Ins01_DtlR.$io_schd_pr_no, Chk01_DtlR.$io_schd_pr_no);
			addColumnPathMap(Po_Ins01_DtlR.$bd_itm_cd, Chk01_DtlR.$bd_itm_cd);
			addColumnPathMap(Po_Ins01_DtlR.$bd_itm_sub1, Chk01_DtlR.$bd_itm_sub1);
			addColumnPathMap(Po_Ins01_DtlR.$bd_itm_sub2, Chk01_DtlR.$bd_itm_sub2);
			addColumnPathMap(Po_Ins01_DtlR.$bd_itm_sub3, Chk01_DtlR.$bd_itm_sub3);
			addColumnPathMap(Po_Ins01_DtlR.$bd_sno1, Chk01_DtlR.$bd_sno1);
			addColumnPathMap(Po_Ins01_DtlR.$bd_sno2, Chk01_DtlR.$bd_sno2);
			addColumnPathMap(Po_Ins01_DtlR.$bd_sno3, Chk01_DtlR.$bd_sno3);
			addColumnPathMap(Po_Ins01_DtlR.$bd_sno4, Chk01_DtlR.$bd_sno4);
			addColumnPathMap(Po_Ins01_DtlR.$bd_loc_cd, Chk01_DtlR.$bd_loc_cd);
			addColumnPathMap(Po_Ins01_DtlR.$bd_lot_no, Chk01_DtlR.$bd_lot_no);
			addColumnPathMap(Po_Ins01_DtlR.$bd_sublot_no, Chk01_DtlR.$bd_sublot_no);
			addColumnPathMap(Po_Ins01_DtlR.$bd_dpt_cd, Chk01_DtlR.$bd_dpt_cd);
			addColumnPathMap(Po_Ins01_DtlR.$bd_ctg_cd, Chk01_DtlR.$bd_ctg_cd);
			addColumnPathMap(Po_Ins01_DtlR.$bd_oper_cd, Chk01_DtlR.$bd_oper_cd);
			addColumnPathMap(Po_Ins01_DtlR.$bd_slo_no, Chk01_DtlR.$bd_slo_no);
			addColumnPathMap(Po_Ins01_DtlR.$bd_iv_no, Chk01_DtlR.$bd_iv_no);
			addColumnPathMap(Po_Ins01_DtlR.$bd_po_no, Chk01_DtlR.$bd_po_no);
			addColumnPathMap(Po_Ins01_DtlR.$arr_cnt_rmrks, Chk01_DtlR.$arr_cnt_rmrks);
			addColumnPathMap(Po_Ins01_DtlR.$intr_rmrks, Chk01_DtlR.$dtl_intr_rmrks);
			addColumnPathMap(Po_Ins01_DtlR.$trd_d_rmrks, Chk01_DtlR.$dtl_trd_d_rmrks);
			addColumnPathMap(Po_Ins01_DtlR.$po_print_d_rmrks, Chk01_DtlR.$po_print_d_rmrks);
			addColumnPathMap(Po_Ins01_DtlR.$dlv_slip_d_rmrks, Chk01_DtlR.$dlv_slip_d_rmrks);
			addColumnPathMap(Po_Ins01_DtlR.$sub_char1, Chk01_DtlR.$dtl_sub_char1);
			addColumnPathMap(Po_Ins01_DtlR.$sub_char2, Chk01_DtlR.$dtl_sub_char2);
			addColumnPathMap(Po_Ins01_DtlR.$sub_char3, Chk01_DtlR.$dtl_sub_char3);
			addColumnPathMap(Po_Ins01_DtlR.$edi_sub_d_char1, Chk01_DtlR.$edi_sub_d_char1);
			addColumnPathMap(Po_Ins01_DtlR.$edi_sub_d_char2, Chk01_DtlR.$edi_sub_d_char2);
			addColumnPathMap(Po_Ins01_DtlR.$edi_sub_d_char3, Chk01_DtlR.$edi_sub_d_char3);
			addColumnPathMap(Po_Ins01_DtlR.$edi_sub_d_char4, Chk01_DtlR.$edi_sub_d_char4);
			addColumnPathMap(Po_Ins01_DtlR.$edi_sub_d_char5, Chk01_DtlR.$edi_sub_d_char5);
			addColumnPathMap(Po_Ins01_DtlR.$edi_sub_d_num1, Chk01_DtlR.$edi_sub_d_num1);
			addColumnPathMap(Po_Ins01_DtlR.$edi_sub_d_dt1, Chk01_DtlR.$edi_sub_d_dt1);
			addColumnPathMap(Po_Ins01_DtlR.$rqst_can_flg, Chk01_DtlR.$rqst_can_flg);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.hdr_peg_no(src.getNumberNE("hdr_peg_no"));
			dest.base_unit_qty(src.base_unit_qty());
			dest.drct_dlv_typ(src.drct_dlv_typ());
			if (!src.dlv_sundry_flg()) {
				dest.dlv_nm(null);
			}
			if (!src.tdlv_sundry_flg()) {
				dest.tdlv_nm(null);
			}
			if (src.outsrc_flg() && MAC_DATA_CRUD_TYP.isCRT(src.data_crud_typ()) && isNull(src.po_schd_no())) {
				dest.uplnd_flg(true);
				dest.schd_chg_flg(true);
			}
		}
	}
	protected Map_Po_Ins01_Bndl_DtlR_Chk01_DtlR<Po_Ins01_Bndl_DtlR,Chk01_DtlR> createMap_Po_Ins01_Bndl_DtlR_Chk01_DtlR() {
		return new Map_Po_Ins01_Bndl_DtlR_Chk01_DtlR<Po_Ins01_Bndl_DtlR, Chk01_DtlR>();
	}

	public class Map_Po_Ins01_Bndl_DtlR_Chk01_DtlR<D extends Po_Ins01_Bndl_DtlR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Po_Ins01_Bndl_DtlR.$peg_no, Chk01_DtlR.$peg_no);
			addColumnPathMap(Po_Ins01_Bndl_DtlR.$po_no, Chk01_DtlR.$po_no);
			addColumnPathMap(Po_Ins01_Bndl_DtlR.$po_d_no, Chk01_DtlR.$po_d_no);
			addColumnPathMap(Po_Ins01_Bndl_DtlR.$po_schd_no, Chk01_DtlR.$po_schd_no);
			addColumnPathMap(Po_Ins01_Bndl_DtlR.$base_unit_qty, Chk01_DtlR.$base_unit_qty);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.dtl_peg_no(src.peg_no());
		}
	}
	
	protected Map_Po_Ins01_HdrR_Chk02_DtlR<Po_Ins01_HdrR,Chk02_DtlR> createMap_Po_Ins01_HdrR_Chk02_DtlR() {
		return new Map_Po_Ins01_HdrR_Chk02_DtlR<Po_Ins01_HdrR, Chk02_DtlR>();
	}

	public class Map_Po_Ins01_HdrR_Chk02_DtlR<D extends Po_Ins01_HdrR, S extends Chk02_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Po_Ins01_HdrR.$err_flg, Chk02_DtlR.$err_flg);
			addColumnPathMap(Po_Ins01_HdrR.$po_no, Chk02_DtlR.$po_no);
			addColumnPathMap(Po_Ins01_HdrR.$po_rev, Chk02_DtlR.$po_rev);
			addColumnPathMap(Po_Ins01_HdrR.$trd_cd, Chk02_DtlR.$trd_cd);
			addColumnPathMap(Po_Ins01_HdrR.$trd_ptn_typ, Chk02_DtlR.$trd_ptn_typ);
			addColumnPathMap(Po_Ins01_HdrR.$purc_dpt_cd, Chk02_DtlR.$purc_dpt_cd);
			addColumnPathMap(Po_Ins01_HdrR.$wg_cd, Chk02_DtlR.$purc_dpt_wg_cd);
			addColumnPathMap(Po_Ins01_HdrR.$purc_usr_cd, Chk02_DtlR.$purc_usr_cd);
			addColumnPathMap(Po_Ins01_HdrR.$sppl_cd, Chk02_DtlR.$sppl_cd);
			addColumnPathMap(Po_Ins01_HdrR.$po_dt, Chk02_DtlR.$po_dt);
			addColumnPathMap(Po_Ins01_HdrR.$upd_po_print_schd_dt, Chk02_DtlR.$upd_po_print_schd_dt);
			addColumnPathMap(Po_Ins01_HdrR.$po_print_flg, Chk02_DtlR.$po_print_flg);
			addColumnPathMap(Po_Ins01_HdrR.$last_po_rev, Chk02_DtlR.$last_po_rev);
			addColumnPathMap(Po_Ins01_HdrR.$trd_cur_cd, Chk02_DtlR.$trd_cur_cd);
			addColumnPathMap(Po_Ins01_HdrR.$xrate, Chk02_DtlR.$xrate);
			addColumnPathMap(Po_Ins01_HdrR.$xrate_inpt_flg, Chk02_DtlR.$xrate_inpt_flg);
			addColumnPathMap(Po_Ins01_HdrR.$ptax_xrate, Chk02_DtlR.$ptax_xrate);
			addColumnPathMap(Po_Ins01_HdrR.$ptax_xrate_inpt_flg, Chk02_DtlR.$ptax_xrate_inpt_flg);
			addColumnPathMap(Po_Ins01_HdrR.$crct_rsn_cd, Chk02_DtlR.$crct_rsn_cd);
			addColumnPathMap(Po_Ins01_HdrR.$po_print_cd, Chk02_DtlR.$po_print_cd);
			addColumnPathMap(Po_Ins01_HdrR.$wrk_no, Chk02_DtlR.$wrk_no);
			addColumnPathMap(Po_Ins01_HdrR.$tterm_cd1, Chk02_DtlR.$tterm_cd1);
			addColumnPathMap(Po_Ins01_HdrR.$tterm_rmrks1, Chk02_DtlR.$tterm_rmrks1);
			addColumnPathMap(Po_Ins01_HdrR.$tterm_cd2, Chk02_DtlR.$tterm_cd2);
			addColumnPathMap(Po_Ins01_HdrR.$tterm_rmrks2, Chk02_DtlR.$tterm_rmrks2);
			addColumnPathMap(Po_Ins01_HdrR.$tterm_cd3, Chk02_DtlR.$tterm_cd3);
			addColumnPathMap(Po_Ins01_HdrR.$tterm_rmrks3, Chk02_DtlR.$tterm_rmrks3);
			addColumnPathMap(Po_Ins01_HdrR.$edi_flg, Chk02_DtlR.$edi_flg);
			addColumnPathMap(Po_Ins01_HdrR.$aprv_flg, Chk02_DtlR.$aprv_flg);
			addColumnPathMap(Po_Ins01_HdrR.$aprv_no, Chk02_DtlR.$aprv_no);
			addColumnPathMap(Po_Ins01_HdrR.$aprv_sts_typ, Chk02_DtlR.$aprv_sts_typ);
			addColumnPathMap(Po_Ins01_HdrR.$trd_rmrks, Chk02_DtlR.$trd_rmrks);
			addColumnPathMap(Po_Ins01_HdrR.$intr_rmrks, Chk02_DtlR.$intr_rmrks);
			addColumnPathMap(Po_Ins01_HdrR.$po_print_rmrks, Chk02_DtlR.$po_print_rmrks);
			addColumnPathMap(Po_Ins01_HdrR.$dlv_slip_rmrks, Chk02_DtlR.$dlv_slip_rmrks);
			addColumnPathMap(Po_Ins01_HdrR.$sub_char1, Chk02_DtlR.$sub_char1);
			addColumnPathMap(Po_Ins01_HdrR.$sub_char2, Chk02_DtlR.$sub_char2);
			addColumnPathMap(Po_Ins01_HdrR.$sub_char3, Chk02_DtlR.$sub_char3);
			addColumnPathMap(Po_Ins01_HdrR.$edi_sub_char1, Chk02_DtlR.$edi_sub_char1);
			addColumnPathMap(Po_Ins01_HdrR.$edi_sub_char2, Chk02_DtlR.$edi_sub_char2);
			addColumnPathMap(Po_Ins01_HdrR.$edi_sub_char3, Chk02_DtlR.$edi_sub_char3);
			addColumnPathMap(Po_Ins01_HdrR.$edi_sub_char4, Chk02_DtlR.$edi_sub_char4);
			addColumnPathMap(Po_Ins01_HdrR.$edi_sub_char5, Chk02_DtlR.$edi_sub_char5);
			addColumnPathMap(Po_Ins01_HdrR.$edi_sub_num1, Chk02_DtlR.$edi_sub_num1);
			addColumnPathMap(Po_Ins01_HdrR.$edi_sub_dt1, Chk02_DtlR.$edi_sub_dt1);
			
			addColumnPathMap(Po_Ins01_HdrR.$sppl_cntct_dpt, Chk02_DtlR.$sppl_cntct_dpt);
			addColumnPathMap(Po_Ins01_HdrR.$sppl_cntct_psn, Chk02_DtlR.$sppl_cntct_psn);
			addColumnPathMap(Po_Ins01_HdrR.$sppl_zip_cd, Chk02_DtlR.$sppl_zip_cd);
			addColumnPathMap(Po_Ins01_HdrR.$sppl_addr1, Chk02_DtlR.$sppl_addr1);
			addColumnPathMap(Po_Ins01_HdrR.$sppl_addr2, Chk02_DtlR.$sppl_addr2);
			addColumnPathMap(Po_Ins01_HdrR.$sppl_addr3, Chk02_DtlR.$sppl_addr3);
			addColumnPathMap(Po_Ins01_HdrR.$sppl_addr4, Chk02_DtlR.$sppl_addr4);
			addColumnPathMap(Po_Ins01_HdrR.$sppl_tel, Chk02_DtlR.$sppl_tel);
			addColumnPathMap(Po_Ins01_HdrR.$sppl_fax, Chk02_DtlR.$sppl_fax);
			addColumnPathMap(Po_Ins01_HdrR.$data_crud_typ, Chk02_DtlR.$data_crud_typ);
			addColumnPathMap(Po_Ins01_HdrR.$aprv_rvrs_flg, Chk02_DtlR.$aprv_rvrs_flg);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.peg_no(src.getNumberNE("hdr_peg_no"));
			dest.data_crud_typ(src.slip_del_flg() ? MAC_DATA_CRUD_TYP.DEL.value() : MAC_DATA_CRUD_TYP.UPD.value());
		}
	}
	
	protected Map_Po_Ins01_DtlR_Chk02_DtlR<Po_Ins01_DtlR,Chk02_DtlR> createMap_Po_Ins01_DtlR_Chk02_DtlR() {
		return new Map_Po_Ins01_DtlR_Chk02_DtlR<Po_Ins01_DtlR, Chk02_DtlR>();
	}

	public class Map_Po_Ins01_DtlR_Chk02_DtlR<D extends Po_Ins01_DtlR, S extends Chk02_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Po_Ins01_DtlR.$peg_no, Chk02_DtlR.$peg_no);
			addColumnPathMap(Po_Ins01_DtlR.$data_crud_typ, Chk02_DtlR.$data_crud_typ);
			addColumnPathMap(Po_Ins01_DtlR.$pod, Chk02_DtlR.$pod);
			addColumnPathMap(Po_Ins01_DtlR.$only_upd_pod_flg, Chk02_DtlR.$only_upd_pod_flg);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.hdr_peg_no(src.getNumberNE("hdr_peg_no"));
			dest.peg_no(src.peg_no());
			dest.abort_flg(src.abort_flg());
			dest.bef_abort_flg(src.abort_flg());
			dest.arr_cnt_rmrks(src.arr_cnt_rmrks());
		}
	}
		
	protected Map_Po_Ins01_Bndl_DtlR_Chk02_Dtl2R<Po_Ins01_Bndl_DtlR,Chk02_Dtl2R> createMap_Po_Ins01_Bndl_DtlR_Chk02_Dtl2R() {
		return new Map_Po_Ins01_Bndl_DtlR_Chk02_Dtl2R<Po_Ins01_Bndl_DtlR, Chk02_Dtl2R>();
	}

	public class Map_Po_Ins01_Bndl_DtlR_Chk02_Dtl2R<D extends Po_Ins01_Bndl_DtlR, S extends Chk02_Dtl2R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Po_Ins01_Bndl_DtlR.$po_no, Chk02_Dtl2R.$po_no);
			addColumnPathMap(Po_Ins01_Bndl_DtlR.$po_d_no, Chk02_Dtl2R.$po_d_no);
			addColumnPathMap(Po_Ins01_Bndl_DtlR.$po_schd_no, Chk02_Dtl2R.$po_schd_no);
			addColumnPathMap(Po_Ins01_Bndl_DtlR.$base_unit_qty, Chk02_Dtl2R.$base_unit_qty);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.peg_no(src.getNumber("peg_no"));
			dest.dtl_peg_no(src.getNumber("dtl_peg_no"));
		}
	}
	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 予定日・マスタ取得<br>
	 */
	public class Sprt01 extends MSBDL_PoListReg_MC_A.Sprt01 {
		static final String TMP_BASE_DT = "TMP_BASE_DT";
		static final String TMP_PTAX_CUR_CD = "TMP_PTAX_CUR_CD";
		static final String TMP_PURC_XRATE_CD = "TMP_PURC_XRATE_CD";
		
		//-------------------------------------
		// indexKey
		//-------------------------------------
		/** 品目詳細（品目CD・枝番・WGCD・製造場所・構成パタン） */
		MCIndexKey _idxItmDtlCache = null;
		/** 場所（場所CD） */
		MCIndexKey _idxLocCache = null;
		/**　版 */
		MCIndexKey _idxItmVerCache = null;
		/** 取引先（発注先） */
		MCIndexKey _idxCacheBp = null;
		/** 取引先（発注先 補助） */
		MCIndexKey _idxCacheBpSub = null;
		/** 品目詳細（品目CD・枝番・WGCD・発注先・メーカ・製造場所・構成パタン・基準日） */
		MCIndexKey _idxItmDtlCacheKey = null;
		protected static final String ERR_FLG = "err_flg";
		
		//-------------------------------------
		// cache
		//-------------------------------------
		/** 品目詳細マスタ */
		protected MCList<MAM_ITM_DTL_R> _cacheItmDtl = MCList.create(MAM_ITM_DTL_R.class);
		/** 場所マスタ */
		protected MCList<MAM_LOC_R> _cacheLoc = null;
		/** 取引先マスタ（発注先） */
		protected MCList<MAM_BP_R> _cacheBp = null;
		/**　版 */
		protected MCList<MAM_ITM_VER_R> _cacheItmVer = MCList.create(MAM_ITM_VER_R.class);
		/** 取引先マスタ（発注先 補助） */
		protected MCList<MAM_BP_R> _cacheBpSub = null;
		/** 品目マスタ */
		protected FXUCL_MCDbcCache<MAM_ITM_R> _cacheItm = null;
		/** 品目マスタ（ロケール） */
		protected FXUCL_MCDbcCache<MAM_ITM_LCL_R> _cacheItmLcl = null;
		/** 取引先品目マスタ */
		protected FXUCL_MCDbcCacheStEnd<MAM_BP_ITM_R> _cacheBpItm = null;
		/** 税マスタ */
		protected FXUCL_MCDbcCache<MAM_TAX_R> _cacheTax = null;
		/** 部門マスタ */
		protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _cacheDpt = null;
		/** 担当者権限マスタ */
		protected FXUCL_MCDbcCacheStEnd<MAM_USR_ACL_R> _cacheUsrAcl = null;
		//-------------------------------------
		// cache作成
		//-------------------------------------
		/**
		 * キャッシュ作成（品目詳細マスタ）
		 * @param list
		 */
		protected void createItmDtlCache() {
			
			_cacheItmDtl = MCList.create(MAM_ITM_DTL_R.class);
			
			_cacheItmDtl.addStringColumn("mfg_loc_sppl_cd");
			_cacheItmDtl.addStringColumn("mfg_loc_maker_cd");
			
			MAM_ITM_DTL_R t = MAM_ITM_DTL_R.create("T");
			MCQueryApiBuilder cacheItmDtl_bldr = MCQueryApiBuilder.create(t);
			MAM_LOC_R m1 = MAM_LOC_R.create("M1");

			cacheItmDtl_bldr.addSelect(m1.sppl_cd.as("mfg_loc_sppl_cd"));
			cacheItmDtl_bldr.addSelect(m1.maker_cd.as("mfg_loc_maker_cd"));
			cacheItmDtl_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
			cacheItmDtl_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			cacheItmDtl_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			cacheItmDtl_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			cacheItmDtl_bldr.addWhereWithAnd(t.wg_cd.eq(bind("in_to_loc_wg_cd")));
			cacheItmDtl_bldr.addWhereWithAnd(t.rqst_loc_cd.eq(value(MAC_STR.NULL_VAL.value())));
			if (isSame(_sysParm, "1")) {
				cacheItmDtl_bldr.addWhereWithAnd(bind("rqst_avl_rqst_dt").between(t.st_dt, t.end_dt));
			}
			else {
				cacheItmDtl_bldr.addWhereWithAnd(bind("po_dt").between(t.st_dt, t.end_dt));
			}
			cacheItmDtl_bldr.addLeftOuterJoin(m1, bracket( t.mfg_loc_cd.eq(m1.loc_cd)));
			dbSelect("MSBDL0090_MAM_ITM_DTL_S01", _cacheItmDtl, cacheItmDtl_bldr,
					up0().groupBy(Sprt01_DtlR.$itm_cd, Sprt01_DtlR.$itm_sub1,
							Sprt01_DtlR.$itm_sub2, Sprt01_DtlR.$itm_sub3,
							Sprt01_DtlR.$in_to_loc_wg_cd, isSame(_sysParm, "1") ? Sprt01_DtlR.$rqst_avl_rqst_dt : Sprt01_DtlR.$po_dt));
			_idxItmDtlCache = _cacheItmDtl.createIndex(MAM_ITM_DTL_R.$itm_cd, MAM_ITM_DTL_R.$itm_sub1,
					MAM_ITM_DTL_R.$itm_sub2, MAM_ITM_DTL_R.$itm_sub3, MAM_ITM_DTL_R.$wg_cd);
			_idxItmDtlCacheKey = _cacheItmDtl.createIndex(MAM_ITM_DTL_R.$itm_cd, MAM_ITM_DTL_R.$itm_sub1,
					MAM_ITM_DTL_R.$itm_sub2, MAM_ITM_DTL_R.$itm_sub3, MAM_ITM_DTL_R.$wg_cd, MAM_ITM_DTL_R.$sppl_cd,
					MAM_ITM_DTL_R.$maker_cd, MAM_ITM_DTL_R.$mfg_loc_cd, MAM_ITM_DTL_R.$bom_ptn);
		}
		/**
		 * キャッシュ作成（場所マスタ）
		 * 場所名を設定するために、場所マスタをキャッシュで保持する。
		 */
		protected void createLocCache() {
			MCList<MAM_LOC_R> bindL = MCList.create(MAM_LOC_R.class);
			
			for (MAM_ITM_DTL_R r : _cacheItmDtl.distinctNE(MAM_ITM_DTL_R.$mfg_loc_cd)) {
				// 品目詳細から
				if (!isNullOrNullVal(r.mfg_loc_cd())) {
					MAM_LOC_R locR = MAM_LOC_R.create();
					locR.loc_cd(r.mfg_loc_cd());
					bindL.add(locR);
				}
			}
			
			for (Sprt01_DtlR r : up0().distinctNE(Sprt01_DtlR.$mfg_loc_cd)) {
				// 上り電文から
				if (!isNullOrNullVal(r.mfg_loc_cd())) {
					MAM_LOC_R locR = MAM_LOC_R.create();
					locR.loc_cd(r.mfg_loc_cd());
					bindL.add(locR);
				}
			}
			_cacheLoc = MCList.create(MAM_LOC_R.class);
			dbSelectKey("MSBDL0090_MAM_LOC_S01", _cacheLoc,
					MCQueryApiBuilder.create(MAM_LOC_R.create("T")),
					bindL.distinctNE(MAM_LOC_R.$loc_cd));
			
			_idxLocCache = _cacheLoc.createIndex(MAM_LOC_R.$loc_cd);
		}
		/**
		 * キャッシュ作成（取引先マスタ（発注先））
		 * @param r
		 */
		protected void createBpCache() {
			MCList<MAM_BP_R> bindL = MCList.create(MAM_BP_R.class);
			for (MAM_ITM_DTL_R r : _cacheItmDtl.groupBy(MAM_ITM_DTL_R.$sppl_cd, MAM_ITM_DTL_R.$maker_cd, "mfg_loc_sppl_cd", "mfg_loc_maker_cd")) {
				// 購買品の場合は、品目詳細から、優先順の高い発注先に再設定するため、品目詳細の発注先でキャッシュをとっておく。
				if (!isNullOrNullVal(r.sppl_cd())) {
					MAM_BP_R spplR = MAM_BP_R.create();
					spplR.bp_cd(r.sppl_cd());
					bindL.add(spplR);	
				}
				
				if (!isNullOrNullVal(r.maker_cd())) {
					MAM_BP_R makerR = MAM_BP_R.create();
					makerR.bp_cd(r.maker_cd());
					bindL.add(makerR);
				}
				if (!isNullOrNullVal(r.getStringNE("mfg_loc_sppl_cd"))) {
					MAM_BP_R spplR = MAM_BP_R.create();
					spplR.bp_cd(r.getStringNE("mfg_loc_sppl_cd"));
					bindL.add(spplR);	
				}
				
				if (!isNullOrNullVal(r.getStringNE("mfg_loc_maker_cd"))) {
					MAM_BP_R spplR = MAM_BP_R.create();
					spplR.bp_cd(r.getStringNE("mfg_loc_maker_cd"));
					bindL.add(spplR);	
				}
			}
			MCList<Sprt01_DtlR> assetNotMngL = up0().subList(new MCRowMatcher<Sprt01_DtlR>(){
				@Override
				public boolean match(Sprt01_DtlR row) {
					MAM_ITM_R itmR = getCacheItm(row.itm_cd(), row.itm_sub1(), row.itm_sub2(), row.itm_sub3());
					if (MAC_ASSET_MNG_TYP.isNOT_MNG(itmR.asset_mng_typ())) {
						return true;
					}
					return false;
				}
			});
			
			for (Sprt01_DtlR r : assetNotMngL) {
				// 資産管理しない品目は品目詳細がないので、入力された発注先の属性値を取得する
				if (!isNullOrNullVal(r.sppl_cd())) {
					MAM_BP_R spplR = MAM_BP_R.create();
					spplR.bp_cd(r.sppl_cd());
					bindL.add(spplR);	
				}
				
				if (!isNullOrNullVal(r.maker_cd())) {
					MAM_BP_R makerR = MAM_BP_R.create();
					makerR.bp_cd(r.maker_cd());
					bindL.add(makerR);
				}
			}
			
			for (Sprt01_DtlR r : up0().subList(Sprt01_DtlR.$outsrc_flg, true).groupBy(Sprt01_DtlR.$sppl_cd, Sprt01_DtlR.$maker_cd)) {
				// 外注品の場合は、発注先の変更は不可であるため、上ってきた発注先のキャッシュをとっておく。
				MAM_BP_R spplR = MAM_BP_R.create();
				spplR.bp_cd(r.sppl_cd());
				bindL.add(spplR);
				
				if (!isNullOrNullVal(r.maker_cd())) {
					MAM_BP_R makerR = MAM_BP_R.create();
					makerR.bp_cd(r.maker_cd());
					bindL.add(makerR);
				}
			}
			_cacheBp = MCList.create(MAM_BP_R.class);
			_cacheBp.addNumberColumn("upri_dec_place");
			_cacheBp.addNumberColumn("amt_dec_place");
			
			MAM_BP_R t = MAM_BP_R.create("T");
			MCQueryApiBuilder cacheBp_bldr = MCQueryApiBuilder.create(t);
			MAM_CNTRY_R m1 = MAM_CNTRY_R.create("M1");
			MAM_PO_PRINT_R m2 = MAM_PO_PRINT_R.create("M2");
			MAM_BP_R m3 = MAM_BP_R.create("M3");
			MAM_CUR_R m4 = MAM_CUR_R.create("M4");
			MAM_TTERM_R m5 = MAM_TTERM_R.create("M5");
			MAM_TTERM_R m6 = MAM_TTERM_R.create("M6");
			MAM_TTERM_R m7 = MAM_TTERM_R.create("M7");

			cacheBp_bldr.addSelect(m1.cntry_nm);
			cacheBp_bldr.addSelect(m3.bp_nm.as("asppl_nm"));
			cacheBp_bldr.addSelect(m2.po_print_nm);
			cacheBp_bldr.addSelect(m4.cur_nm);
			cacheBp_bldr.addSelect(m4.upri_dec_place);
			cacheBp_bldr.addSelect(m4.amt_dec_place);
			cacheBp_bldr.addSelect(m5.tterm_nm.as("sppl_tterm_nm1"));
			cacheBp_bldr.addSelect(m6.tterm_nm.as("sppl_tterm_nm2"));
			cacheBp_bldr.addSelect(m7.tterm_nm.as("sppl_tterm_nm3"));
			cacheBp_bldr.addLeftOuterJoin(m1, bracket( t.cntry_cd.eq(m1.cntry_cd)));
			cacheBp_bldr.addLeftOuterJoin(m2, bracket( t.po_print_cd.eq(m2.po_print_cd)));
			cacheBp_bldr.addLeftOuterJoin(m3, bracket( m3.bp_cd.eq(t.asppl_cd)));
			cacheBp_bldr.addLeftOuterJoin(m4, bracket( m4.cur_cd.eq(t.cur_cd)));
			cacheBp_bldr.addLeftOuterJoin(m5, bracket( m5.tterm_cd.eq(t.sppl_tterm_cd1)));
			cacheBp_bldr.addLeftOuterJoin(m6, bracket( m6.tterm_cd.eq(t.sppl_tterm_cd2)));
			cacheBp_bldr.addLeftOuterJoin(m7, bracket( m7.tterm_cd.eq(t.sppl_tterm_cd3)));
			dbSelectKey("MSBDL0090_MAM_BP_S01", _cacheBp, cacheBp_bldr, bindL);
			
			_idxCacheBp = _cacheBp.createIndex(MAM_BP_R.$bp_cd);
		}
		/**
		 * キャッシュ作成（取引先マスタ（発注先 補助））
		 * @param r
		 */
		protected void createBpSubCache() {
			_cacheBpSub = MCList.create(MAM_BP_R.class);
			MCList<Sprt01_DtlR>[] bindG = up0().groupList(Sprt01_DtlR.$po_dt);
			for (MCList<Sprt01_DtlR> bindL : bindG) {
				_cacheBpSub.addAll(selectBpSub(bindL));
			}
			_idxCacheBpSub = _cacheBpSub.createIndex(MAM_BP_R.$bp_cd, "po_dt");
		}
		/**
		 * 取引先マスタ（発注先 補助））を発注日ごとに検索する
		 * @param bindL
		 */
		protected MCList<MAM_BP_R> selectBpSub(MCList<Sprt01_DtlR> bindL) {
			MCList<MAM_BP_R> bpSub = MCList.create(MAM_BP_R.class);
			MAM_BP_R t = MAM_BP_R.create("T");
			MCQueryApiBuilder bpSub_bldr = MCQueryApiBuilder.create(t);
			MAM_DPT_R m2 = MAM_DPT_R.create("M2");
			MAM_SPPL_USR_R m3 = MAM_SPPL_USR_R.create("M3");
			MAM_USR_R m4 = MAM_USR_R.create("M4");
			MAM_DPT_R m5 = MAM_DPT_R.create("M5");
			MAM_WG_R m6 = MAM_WG_R.create("M6");
			
			bpSub.addStringColumn("purc_usr_cd");
			bpSub.addStringColumn("purc_usr_nm");
			bpSub.addStringColumn("purc_dpt_cd");
			bpSub.addStringColumn("purc_dpt_nm");
			bpSub.addStringColumn("purc_dpt_wg_cd");
			bpSub.addStringColumn("purc_dpt_wg_nm");
			bpSub.addDateColumn("po_dt");
			
			bpSub_bldr.setSelect(t.bp_cd);
			bpSub_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, bind("po_dt"), value(MAC_BP_ADDR_TYP.ZIP_CD.value())).as("zip_cd"));
			bpSub_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, bind("po_dt"), value(MAC_BP_ADDR_TYP.ADDR1.value())).as("addr1"));
			bpSub_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, bind("po_dt"), value(MAC_BP_ADDR_TYP.ADDR2.value())).as("addr2"));
			bpSub_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, bind("po_dt"), value(MAC_BP_ADDR_TYP.ADDR3.value())).as("addr3"));
			bpSub_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, bind("po_dt"), value(MAC_BP_ADDR_TYP.ADDR4.value())).as("addr4"));
			bpSub_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, bind("po_dt"), value(MAC_BP_ADDR_TYP.TEL.value())).as("tel"));
			bpSub_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, bind("po_dt"), value(MAC_BP_ADDR_TYP.FAX.value())).as("fax"));
			bpSub_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, bind("po_dt"), value(MAC_BP_ADDR_TYP.SPPL_CNTCT_DPT.value())).as("sppl_cntct_dpt"));
			bpSub_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, bind("po_dt"), value(MAC_BP_ADDR_TYP.SPPL_CNTCT_PSN.value())).as("sppl_cntct_psn"));
			bpSub_bldr.addSelect(MAPA_BP$F_GET_AP_DPT_CD_NE2(t.bp_cd, t.asppl_cd, bind("po_dt"), value(false)).as("ap_dpt_cd"));
			bpSub_bldr.addSelect(m2.dpt_nm.as("ap_dpt_nm"));
			bpSub_bldr.addSelect(m3.purc_usr_cd);
			bpSub_bldr.addSelect(m4.usr_nm.as("purc_usr_nm"));
			bpSub_bldr.addSelect(m3.purc_dpt_cd);
			bpSub_bldr.addSelect(m5.dpt_nm.as("purc_dpt_nm"));
			bpSub_bldr.addSelect(m5.wg_cd.as("purc_dpt_wg_cd"));
			bpSub_bldr.addSelect(m6.wg_nm.as("purc_dpt_wg_nm"));
			bpSub_bldr.addSelect(bind("po_dt").as("po_dt"));

			bpSub_bldr.addLeftOuterJoin(m2, bracket(m2.dpt_cd.eq(MAPA_BP$F_GET_AP_DPT_CD_NE2(t.bp_cd, t.asppl_cd, bind("po_dt"), value(false)))
					.and(bind("po_dt").between(m2.st_dt, m2.end_dt))));
			bpSub_bldr.addLeftOuterJoin(m3, bracket(m3.sppl_cd.eq(t.bp_cd)
					.and(bind("po_dt").between(m3.st_dt, m3.end_dt))));
			bpSub_bldr.addLeftOuterJoin(m4, bracket(m4.usr_cd.eq(m3.purc_usr_cd)));
			bpSub_bldr.addLeftOuterJoin(m5, bracket(m5.dpt_cd.eq(m3.purc_dpt_cd)
					.and(bind("po_dt").between(m5.st_dt, m5.end_dt))));
			bpSub_bldr.addLeftOuterJoin(m6, bracket(m6.wg_cd.eq(m5.wg_cd)));
			bpSub_bldr.setWhere(t.bp_cd.eq(bind("sppl_cd")));
			dbSelect("MSBDL0090_MAM_BP_S02", bpSub, bpSub_bldr, bindL);
			
			return bpSub;
		}
		/**
		 * キャッシュ作成（版マスタ）
		 * @param list
		 */
		protected void createItmVerCache() {
			_cacheItmVer = MCList.create(MAM_ITM_VER_R.class);
			MAM_ITM_VER_R t = MAM_ITM_VER_R.create("T");
			MCQueryApiBuilder cacheItmVer_bldr = MCQueryApiBuilder.create(t);
			MCList<Sprt01_DtlR> bindL = up0().groupBy(Sprt01_DtlR.$itm_cd, Sprt01_DtlR.$itm_sub1, 
					Sprt01_DtlR.$itm_sub2, Sprt01_DtlR.$itm_sub3, Sprt01_DtlR.$site_cd);
			cacheItmVer_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
			cacheItmVer_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			cacheItmVer_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			cacheItmVer_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			cacheItmVer_bldr.addWhereWithAnd(t.site_cd.eq(bind("site_cd")));
			dbSelect("MSBDL0090_MAM_ITM_VER_S01", _cacheItmVer, cacheItmVer_bldr, bindL);
			_idxItmVerCache = _cacheItmVer.createIndex(MAM_ITM_VER_R.$itm_cd, MAM_ITM_VER_R.$itm_sub1,
					MAM_ITM_VER_R.$itm_sub2, MAM_ITM_VER_R.$itm_sub3, MAM_ITM_VER_R.$site_cd);
		}
		/**
		 * キャッシュ作成（品目マスタ）
		 * @param r
		 */
		protected void createItmCache() {
			_cacheItm = new FXUCL_MCDbcCache<MAM_ITM_R>(
					MCQueryApiBuilder.create(MAM_ITM_R.create("T")),
					up0(), Sprt01_DtlR.$itm_cd, Sprt01_DtlR.$itm_sub1, Sprt01_DtlR.$itm_sub2, Sprt01_DtlR.$itm_sub3);
		}
		/**
		 * キャッシュ作成（取引先品目マスタ）
		 */
		protected void createBpItmCache() {
			_cacheBpItm = new FXUCL_MCDbcCacheStEnd<MAM_BP_ITM_R>(
					MCQueryApiBuilder.create(MAM_BP_ITM_R.create("T")),
					up0(), Sprt01_DtlR.$sppl_cd, Sprt01_DtlR.$itm_cd, Sprt01_DtlR.$itm_sub1, Sprt01_DtlR.$itm_sub2, Sprt01_DtlR.$itm_sub3);
		}
		/**
		 * キャッシュ作成（品目ロケールマスタ）
		 */
		protected void createItmLclCache() {
			_cacheItmLcl = new FXUCL_MCDbcCache<MAM_ITM_LCL_R>(
					MCQueryApiBuilder.create(MAM_ITM_LCL_R.create("T")),
					up0(), Sprt01_DtlR.$itm_cd, Sprt01_DtlR.$itm_sub1,
					Sprt01_DtlR.$itm_sub2, Sprt01_DtlR.$itm_sub3, Sprt01_DtlR.$prnt_lcl_cd);
		}
		/**
		 * キャッシュ作成（税マスタ）
		 * @param r
		 */
		protected void createTaxCache() {
			_cacheTax = new FXUCL_MCDbcCache<MAM_TAX_R>(
					MCQueryApiBuilder.create(MAM_TAX_R.create("T")),
					up0(), Sprt01_DtlR.$tax_cd);
		}
		/**
		 * キャッシュ作成（部門マスタ）
		 */
		protected void createDptCache() {
			MAM_DPT_R t1 = MAM_DPT_R.create("T");
			MCQueryApiBuilder dpt_bldr = MCQueryApiBuilder.create(t1);
			MAM_WG_R t2 = MAM_WG_R.create("T2");
			dpt_bldr.addInnerJoin(t2, t1.wg_cd.eq(t2.wg_cd));
			dpt_bldr.addSelect(t2.wg_nm);
			_cacheDpt = new FXUCL_MCDbcCacheStEnd<MAM_DPT_R>(dpt_bldr, up0(), Sprt01_DtlR.$purc_dpt_cd);
		}
		/**
		 * キャッシュ作成（担当者権限マスタ）
		 */
		protected void createUsrAclCache() {
			_cacheUsrAcl = new FXUCL_MCDbcCacheStEnd<MAM_USR_ACL_R>(
					MCQueryApiBuilder.create(MAM_USR_ACL_R.create("T")),
					up0(), Sprt01_DtlR.$purc_usr_cd);
		}
		//-------------------------------------
		// cache取得
		//-------------------------------------
		/**
		 * キャッシュ取得（品目詳細マスタ）
		 * @param dtlR
		 * @return
		 */
		protected MCList<MAM_ITM_DTL_R> getCacheItmDtlL(Sprt01_DtlR dtlR){
			MCList<MAM_ITM_DTL_R> itmDtlL = _cacheItmDtl.subList(_idxItmDtlCache, 
					dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), dtlR.in_to_loc_wg_cd());
			
			if (!isNull(dtlR.mfg_loc_cd())) {
				MCIndexKey idxkey = itmDtlL.createIndex(MAM_ITM_DTL_R.$mfg_loc_cd);
				itmDtlL = itmDtlL.subList(idxkey, dtlR.mfg_loc_cd());
			}
			if (!isNull(dtlR.bom_ptn())) {
				MCIndexKey idxkey = itmDtlL.createIndex(MAM_ITM_DTL_R.$bom_ptn);
				itmDtlL = itmDtlL.subList(idxkey, dtlR.bom_ptn());
			}
			if (!isNull(dtlR.sppl_cd())) {
				itmDtlL = itmDtlL.subList(r -> (!isNullOrNullVal(dtlR.mfg_loc_cd()) && isSame(dtlR.sppl_cd(), r.getStringNE("mfg_loc_sppl_cd")))
						|| (isNullOrNullVal(dtlR.mfg_loc_cd()) && (isSame(dtlR.sppl_cd(), r.getStringNE("mfg_loc_sppl_cd")) || isSame(dtlR.sppl_cd(), r.sppl_cd()))));
			}
			if (!isNull(dtlR.maker_cd())) {
				itmDtlL = itmDtlL.subList(r -> (!isNullOrNullVal(dtlR.mfg_loc_cd()) && isSame(dtlR.maker_cd(), nvl(r.getStringNE("mfg_loc_maker_cd"), MAC_STR.NULL_VAL.value())))
						|| (isNullOrNullVal(dtlR.mfg_loc_cd()) && (isSame(dtlR.maker_cd(), r.getStringNE("mfg_loc_maker_cd")) || isSame(dtlR.maker_cd(), r.maker_cd()))));
			}
			MCList<MAM_ITM_DTL_R> rslt = MCList.create(MAM_ITM_DTL_R.class);
			for (MAM_ITM_DTL_R r : itmDtlL) {
				if (isSame(_sysParm, "1")) {
					if (dtlR.rqst_avl_rqst_dt().lte(r.end_dt())
							&& dtlR.rqst_avl_rqst_dt().gte(r.st_dt())) {
						rslt.add(r);
					}
				}
				else {
					if (dtlR.po_dt().lte(r.end_dt())
							&& dtlR.po_dt().gte(r.st_dt())) {
						rslt.add(r);
					}
				}
			}
			return rslt;
		}
		/**
		 * キャッシュ取得（場所マスタ）
		 * @param r
		 * @return
		 */
		protected MAM_LOC_R getCacheLoc(String locCd) {
			return _cacheLoc.getFirst(_idxLocCache, locCd);
		}
		/**
		 * キャッシュ取得（取引先マスタ）
		 * @param r
		 * @return
		 */
		protected MAM_BP_R getCacheBp(String bpCd) {
			return _cacheBp.getFirst(_idxCacheBp, bpCd);
		}
		/**
		 * キャッシュ取得（版マスタ）
		 * @param dtlR
		 * @return
		 */
		protected MCList<MAM_ITM_VER_R> getCacheItmVer(Sprt01_DtlR row){
			MCList<MAM_ITM_VER_R> itmVerL = _cacheItmVer.subList(_idxItmVerCache, row.itm_cd(), row.itm_sub1(), row.itm_sub2(), row.itm_sub3(), row.site_cd());
			return itmVerL;
		}
		/**
		 * キャッシュ取得（品目マスタ）
		 * @param r
		 * @return
		 */
		protected MAM_ITM_R getCacheItm(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
			return _cacheItm.get(itmCd, itmSub1, itmSub2, itmSub3);
		}
		/**
		 * キャッシュ取得（品目（ロケール）マスタ）
		 * @param r
		 * @return
		 */
		protected MAM_ITM_LCL_R getCacheItmLcl(String lclCd, String itmCd, String itmSub1, String itmSub2, String itmSub3) {
			return _cacheItmLcl.get(lclCd, itmCd, itmSub1, itmSub2, itmSub3);
		}
		/**
		 * キャッシュ取得（取引先品目マスタ）
		 * @param r
		 * @return
		 */
		protected MAM_BP_ITM_R getCacheBpItm(MCDate poDt, String bpCd, String itmCd, String itmSub1, String itmSub2, String itmSub3) {
			return _cacheBpItm.get(poDt, bpCd, itmCd, itmSub1, itmSub2, itmSub3);
		}
		/**
		 * キャッシュ取得（品目詳細マスタ）
		 * @param itmCd
		 * @param itmSub1
		 * @param itmSub2
		 * @param itmSub3
		 * @param wgCd
		 * @param spplCd
		 * @param makerCd
		 * @param mfgLocCd
		 * @param bomPtn
		 * @param baseDt
		 * @return
		 */
		protected MAM_ITM_DTL_R getCacheItmDtl(
				String itmCd, String itmSub1, String itmSub2, String itmSub3, String wgCd
				, String spplCd, String makerCd
				, String mfgLocCd, String bomPtn
				, MCDate baseDt){
			MCList<MAM_ITM_DTL_R> itmDtlL = _cacheItmDtl.subList(
										_idxItmDtlCacheKey
										, itmCd, itmSub1, itmSub2, itmSub3, wgCd
										, spplCd, makerCd
										, mfgLocCd, bomPtn);
			MAM_ITM_DTL_R itmDtlR = MAM_ITM_DTL_R.create();
			for (MAM_ITM_DTL_R r : itmDtlL) {
				if (baseDt.lte(r.end_dt())
						&& baseDt.gte(r.st_dt())) {
					itmDtlR = r;
					break;
				}
			}
			
			return itmDtlR;
		}
		/**
		 * キャッシュ取得（税マスタ）
		 * @param r
		 * @return
		 */
		protected MAM_TAX_R getCacheTax(String taxCd) {
			return _cacheTax.get(taxCd);
		}
		/**
		 * キャッシュ取得（担当者権限マスタ）
		 * @param masterDt 適用日
		 * @param usrCd 担当者
		 * @return 担当者権限マスタ
		 */
		protected MAM_USR_ACL_R getCacheUsrAcl(MCDate masterDt, String usrCd) {
			return _cacheUsrAcl.get(masterDt, usrCd);
		}
		/**
		 * キャッシュ取得（部門マスタ）<br>購買部門の部門のみ返します。
		 * @param masterDt 適用日
		 * @param dptCd 部門ＣＤ
		 * @return 部門マスタ
		 */
		protected MAM_DPT_R getCacheDptOnlyPurcDpt(MCDate masterDt, String dptCd) {
			MAM_DPT_R purcDptR = _cacheDpt.get(masterDt, dptCd);
			if (purcDptR.purc_dpt_flg()) {
				return purcDptR;
			}
			else {
				return MAM_DPT_R.create();
			}
		}
		
		@Override
		protected void call() {
			super.call();
		}
		
		
		@Override
		protected void doIt() {
			// 最新マスタのキャッシュ作成
			createMstr();
			// 最新マスタ値の反映
			setLatestMstr();
			// 予定日計算
			callPurcUtilSrch01();
			setDpt(up0());
			// 詳細情報の設定
			cmplBaseInfo();
			// 下り電文設定
			setDown();
		}
		
		protected void setDpt(MCList<Sprt01_DtlR> up0) {
	
			MAUCL_DptUtil.setDpt(up0, Sprt01_DtlR.$bd_dpt_cd, Sprt01_DtlR.$bd_dpt_nm, Sprt01_DtlR.$po_dt, true);
			for (Sprt01_DtlR r : up0) {
				if (r.getBooleanNE("err_flg")) {
					r.bd_dpt_cd(null);
					r.bd_dpt_nm(null);
				}
				r.setBooleanNE(ERR_FLG, false);
			}
		}
		
		/**
		 * マスタを再取得します
		 */
		protected void createMstr() {
			// 品目
			createItmCache();
			// 品目詳細
			createItmDtlCache();
			// 場所
			createLocCache();
			// 取引先
			createBpCache();
			// 版
			createItmVerCache();
		}
		
		/**
		 * マスタ最新値を設定します
		 */
		protected void setLatestMstr() {
			for (Sprt01_DtlR r : up0()) {
				// 発注先・メーカ
				setSpplMaker(r);
				// 場所名設定
				setLocNm(r);
				// 発注先情報
				setSpplMakerInfo(r);
				// 仕入計上区分設定
				setPurcBasisTyp(r);
			}
		}
		
		/**
		 * 発注先を設定します
		 * @param dtlR
		 */
		protected void setSpplMaker(Sprt01_DtlR dtlR) {
			MCList<MAM_ITM_DTL_R> itmDtlL = getCacheItmDtlL(dtlR);
			itmDtlL.sort(MAM_ITM_DTL_R.$prio, MAM_ITM_DTL_R.$st_dt);
			if (isNull(itmDtlL)) {
				return;
			}
			MAM_ITM_DTL_R itmDtlR = itmDtlL.get(0);
			dtlR.mfg_loc_cd(itmDtlR.mfg_loc_cd());
			dtlR.bom_ptn(itmDtlR.bom_ptn());
			if (!isNullOrNullVal(itmDtlR.mfg_loc_cd())) {
				// 外注
				dtlR.sppl_cd(itmDtlR.getStringNE("mfg_loc_sppl_cd"));
				dtlR.maker_cd(itmDtlR.getStringNE("mfg_loc_maker_cd"));
			}
			else {
				dtlR.sppl_cd(itmDtlR.sppl_cd());
				dtlR.maker_cd(itmDtlR.maker_cd());
			}
			if (!isNullOrNullStr(itmDtlR.mfg_loc_cd())) {
				dtlR.outsrc_flg(true);
			}
			else {
				dtlR.outsrc_flg(false);
			}
		}

		/**
		 * 製造場所名を設定します
		 * @param dtlR
		 */
		protected void setLocNm(Sprt01_DtlR dtlR) {
			if (isNullOrNullVal(dtlR.mfg_loc_cd())) {
				return;
			}
			MAM_LOC_R locR = getCacheLoc(dtlR.mfg_loc_cd());
			if (!isNull(locR)) {
				dtlR.mfg_loc_nm(locR.loc_nm());
			}
		}

		/**
		 * 発注先情報を設定します
		 * @param dtlR
		 */
		protected void setSpplMakerInfo(Sprt01_DtlR dtlR) {
			if (isNull(dtlR.sppl_cd())) {
				return;
			}
			MAM_BP_R spplR = getCacheBp(dtlR.sppl_cd());
			if (isNull(spplR)) {
				return;
			}
			dtlR.sppl_nm(spplR.bp_nm());
			dtlR.sppl_cal_cd(spplR.sppl_cal_cd());
			dtlR.sppl_cntry_cd(spplR.getStringNE("cntry_cd"));
			dtlR.sppl_cntry_nm(spplR.getStringNE("cntry_nm"));
			dtlR.purc_amt_rnd_typ(spplR.purc_amt_rnd_typ());
			dtlR.purc_tax_rnd_typ(spplR.purc_tax_rnd_typ());
			dtlR.sppl_purc_upri_cng_flg(spplR.purc_upri_cng_flg());
			dtlR.purc_upri_req_typ(nvl(spplR.purc_upri_req_typ(), getCo().purc_upri_req_typ()));
			dtlR.tterm_cd1(spplR.sppl_tterm_cd1());
			dtlR.tterm_nm1(spplR.getStringNE("sppl_tterm_nm1"));
			dtlR.tterm_cd2(spplR.sppl_tterm_cd2());
			dtlR.tterm_nm2(spplR.getStringNE("sppl_tterm_nm2"));
			dtlR.tterm_cd3(spplR.sppl_tterm_cd3());
			dtlR.tterm_nm3(spplR.getStringNE("sppl_tterm_nm3"));
			dtlR.sppl_pay_crryovr_times(spplR.pay_crryovr_times());
			dtlR.sppl_iv_flg(spplR.sppl_iv_flg());
			dtlR.subcon_flg(spplR.subcon_flg());
			dtlR.asppl_cd(spplR.getStringNE("asppl_cd"));
			dtlR.asppl_nm(spplR.getStringNE("asppl_nm"));
			dtlR.sppl_ship_form_cd(spplR.sppl_ship_form_cd());
			dtlR.prnt_lcl_cd(spplR.prnt_lcl_cd());
			dtlR.po_print_cd(spplR.getStringNE("po_print_cd"));
			dtlR.po_print_nm(spplR.getStringNE("po_print_nm"));
			dtlR.trd_cur_cd(spplR.cur_cd());
			dtlR.trd_cur_nm(spplR.getStringNE("cur_nm"));
			dtlR.trd_cur_upri_dec_place(spplR.getNumberNE("upri_dec_place"));
			dtlR.trd_cur_amt_dec_place(spplR.getNumberNE("amt_dec_place"));
			
			MAM_BP_R makerR = getCacheBp(dtlR.maker_cd());
			if (!isNull(makerR)) {
				dtlR.maker_nm(makerR.bp_nm());	
			}
			if (isNull(dtlR.po_print_cd())) {
				dtlR.po_print_cd(getCo().po_print_cd());
				dtlR.po_print_nm(getCoPoPrintNm());
			}
		}
		
		/**
		 * 仕入計上区分の設定
		 * @param dtlR
		 */
		protected void setPurcBasisTyp(Sprt01_DtlR dtlR) {
			MCList<MAM_ITM_DTL_R> itmDtlL = getCacheItmDtlL(dtlR);
			itmDtlL.sort(MAM_ITM_DTL_R.$prio, MAM_ITM_DTL_R.$st_dt);
			MAM_ITM_DTL_R itmDtlR = MAM_ITM_DTL_R.create();
			if (!isNull(itmDtlL)) {
				itmDtlR = itmDtlL.get(0);
			}

			MAM_BP_R spplR = getCacheBp(dtlR.sppl_cd());

			if (!isNull(itmDtlR.purc_basis_typ())) {
				dtlR.purc_basis_typ(itmDtlR.purc_basis_typ());
			}
			else if (!isNull(spplR) && !isNull(spplR.purc_basis_typ())) {
				dtlR.purc_basis_typ(spplR.purc_basis_typ());
			}
			else {
				dtlR.purc_basis_typ(MAC_PURC_BASIS_TYP.ANY_BASIS.value());
			}
		}
		
		/**
		 * 版ＮＯを設定します
		 * @param dtlR
		 */
		protected void setItmVerInfo(Sprt01_DtlR dtlR) {
			MCList<MAM_ITM_VER_R> itmVerL = getCacheItmVer(dtlR);
			if (isNull(itmVerL)) {
				return;
			}
			itmVerL.sort(mcframe.commonCore.container.MCList.SortType.DESC, MAM_ITM_VER_R.$purc_st_dt);
			for (MAM_ITM_VER_R itmVerR : itmVerL) {
				if (dtlR.rqst_avl_rqst_dt().gte(itmVerR.purc_st_dt())) {
					dtlR.ver_no(itmVerR.ver_no());
					return;
				}
			}
		}
		
		/**
		 * 購買ユーティリティをコールします。
		 */
		protected void callPurcUtilSrch01() {
			setPegNo(up0());
			MSBDL_PurcUtil.PurcUtil_Srch01 purcUtilSrch01 = MSBDL_PurcUtil.crtPurcUtil_Srch01();
			addAll(purcUtilSrch01.up0(), up0(), createMap_PurcUtil_Srch01_DtlR_Sprt01_DtlR());
			purcUtilSrch01.exec();
			MCIndexKey idxkey = purcUtilSrch01.down0().createIndex(PurcUtil_Srch01_DtlR.$peg_no);
			for(Sprt01_DtlR r: up0()) {
				PurcUtil_Srch01_DtlR downR = purcUtilSrch01.down0().getFirst(idxkey, r.peg_no());
				r.dlv_rqst_dt(downR.dlv_rqst_dt());
				r.purc_schd_dt(downR.purc_schd_dt());
				if(isNull(r.po_schd_no())) {
					r.rqst_avl_rqst_dt(downR.rqst_dlv_rqst_dt());
				}
			}
		}
		/**
		 * 基本情報の補完
		 */
		protected void cmplBaseInfo() {
			// 発注先に関連する情報を取得する
			createBpSubCache();
			// 発注先品目に関する情報を取得する
			createBpItmCache();
			// 品目（ロケール）情報を取得する
			createItmLclCache();
			// 担当者権限マスタを取得する
			createUsrAclCache();
			// 部門マスタを取得する
			createDptCache();
			
			// 税取得用基準日
			up0().addDateColumn(TMP_BASE_DT);
			
			// 補完
			for (Sprt01_DtlR r : up0()) {
				// 取引先補助マスタから住所などを取得し設定
				MAM_BP_R bpSubR = _cacheBpSub.getFirst(_idxCacheBpSub, r.sppl_cd(), r.po_dt());
				if (!isNull(bpSubR)) {
					r.sppl_zip_cd(bpSubR.getStringNE("zip_cd"));
					r.sppl_addr1(bpSubR.getStringNE("addr1"));
					r.sppl_addr2(bpSubR.getStringNE("addr2"));
					r.sppl_addr3(bpSubR.getStringNE("addr3"));
					r.sppl_addr4(bpSubR.getStringNE("addr4"));
					r.sppl_tel(bpSubR.getStringNE("tel"));
					r.sppl_fax(bpSubR.getStringNE("fax"));
					r.sppl_cntct_dpt(bpSubR.getStringNE("sppl_cntct_dpt"));
					r.sppl_cntct_psn(bpSubR.getStringNE("sppl_cntct_psn"));
					r.ap_dpt_cd(bpSubR.getStringNE("ap_dpt_cd"));
					r.ap_dpt_nm(bpSubR.getStringNE("ap_dpt_nm"));
					if (isNullAnd(r.purc_usr_cd(), r.purc_dpt_cd())) {
						r.purc_usr_cd(bpSubR.getStringNE("purc_usr_cd"));
						r.purc_usr_nm(bpSubR.getStringNE("purc_usr_nm"));
						r.purc_dpt_cd(bpSubR.getStringNE("purc_dpt_cd"));
						r.purc_dpt_nm(bpSubR.getStringNE("purc_dpt_nm"));
						r.purc_dpt_wg_cd(bpSubR.getStringNE("purc_dpt_wg_cd"));
						r.purc_dpt_wg_nm(bpSubR.getStringNE("purc_dpt_wg_nm"));
					}
					if (!isNull(r.purc_usr_cd()) && isNull(r.purc_dpt_cd())) {
						MAM_USR_ACL_R usrAclR = getCacheUsrAcl(r.po_dt(), r.purc_usr_cd());
						MAM_DPT_R purcDptR = getCacheDptOnlyPurcDpt(r.po_dt(), usrAclR.dpt_cd());
						r.purc_dpt_cd(purcDptR.dpt_cd());
						r.purc_dpt_nm(purcDptR.dpt_nm());
						r.purc_dpt_wg_cd(purcDptR.wg_cd());
						r.purc_dpt_wg_nm(purcDptR.getStringNE("wg_nm"));
					}
				}
				
				// 版ＮＯ
				if (r.ver_flg() && isNull(r.ver_no())) {
					setItmVerInfo(r);
				}
				
				// 支払繰越回数
				MAM_ITM_R itmR = getCacheItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				if (isNull(itmR.pay_crryovr_times())) {
					r.pay_crryovr_times(r.sppl_pay_crryovr_times());
				}
				else {
					r.pay_crryovr_times(itmR.pay_crryovr_times());
				}
				
				// 購買識別区分
				if (!r.outsrc_flg()) {
					if (MAC_ASSET_MNG_TYP.isNOT_MNG(itmR.asset_mng_typ())) {
						r.purc_id_typ(MAC_PURC_ID_TYP.PURC.value());
					}
					else {
						MAM_ITM_DTL_R itmDtlR = getCacheItmDtl(
								r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.in_to_loc_wg_cd()
								, r.sppl_cd(), r.maker_cd()
								, MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(), isSame(_sysParm, "1") ? r.rqst_avl_rqst_dt() : r.po_dt());
						r.purc_id_typ(itmDtlR.purc_id_typ());
					}
				}
				else {
					MAM_ITM_DTL_R itmDtlR = getCacheItmDtl(
							r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.in_to_loc_wg_cd()
							, MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value()
							, r.mfg_loc_cd(), r.bom_ptn(), isSame(_sysParm, "1") ? r.rqst_avl_rqst_dt() : r.po_dt());
					r.purc_id_typ(itmDtlR.purc_id_typ());
				}
				
				// IV表記品名
				if (r.sppl_iv_flg()) {
					MAM_ITM_LCL_R itmLclR = getCacheItmLcl(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(),r.prnt_lcl_cd());
					r.iv_itm_nm(itmLclR.itm_nm());
				}
				else {
					r.iv_itm_nm(null);
				}
				
				// 発注先品目・品名
				MAM_BP_ITM_R bpItmR = getCacheBpItm(r.po_dt(), r.sppl_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				r.sppl_itm_cd(bpItmR.bp_itm_cd());
				r.sppl_itm_nm(bpItmR.bp_itm_nm());
				
				// 税取得用基準日
				if (MAC_PURC_UPRI_REQ_TYP.isPO_DT(r.purc_upri_req_typ())) {
					r.setDateNE(TMP_BASE_DT, r.po_dt());
				}
				else if (MAC_PURC_UPRI_REQ_TYP.isSCHD_DLV_DT(r.purc_upri_req_typ())) {
					r.setDateNE(TMP_BASE_DT, r.dlv_rqst_dt());
				}
				else {
					r.setDateNE(TMP_BASE_DT, r.purc_schd_dt());
				}
				
				// 仕入計上区分の初期値を設定
				if (!isNull(r.dlv_cd())) {
					r.purc_basis_typ(MAC_PURC_BASIS_TYP.ARR_BASIS.value());
				}
				else if (itmR.arr_skip_flg()) {
					r.purc_basis_typ(MAC_PURC_BASIS_TYP.IN_BASIS.value());
				}
				else if (MAC_PURC_ID_TYP.isVMI(r.purc_id_typ()) || MAC_PURC_ID_TYP.isFFR_RCV(r.purc_id_typ())) {
					r.purc_basis_typ(MAC_PURC_BASIS_TYP.IN_BASIS.value());
				}
				else if (r.subcon_flg()) {
					r.purc_basis_typ(MAC_PURC_BASIS_TYP.ARR_BASIS.value());
				}
			}
			
			// 税情報を取得する
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_TAX$F_GET_PURC_TAX_CD", "02"),
					MABCFunction.getFunctionExecuter("MAPA_TAX$F_GET_PURC_TAX_CD"),
					Sprt01_DtlR.$tax_cd, up0(), Sprt01_DtlR.$itm_cd, Sprt01_DtlR.$itm_sub1,
					Sprt01_DtlR.$itm_sub2, Sprt01_DtlR.$itm_sub3, Sprt01_DtlR.$sppl_cd, TMP_BASE_DT);
			createTaxCache();
			for (Sprt01_DtlR r : up0()) {
				if (!isNull(r.tax_cd())) {
					MAM_TAX_R taxR = getCacheTax(r.tax_cd());
					r.tax_nm(taxR.tax_nm());
					r.tax_rate(taxR.tax_rate());
					r.tax_typ(taxR.tax_typ());
					r.inc_tax_flg(taxR.inc_tax_flg());
				}
			}
			
			// 為替レートを取得する
			setXrate();
			
			// 納税為替レートを算出する
			setPtaxXrate();
			
			// 源泉税率を取得する
			MCList<Sprt01_DtlR> tmpL = up0().subList(new MCRowMatcher<Sprt01_DtlR>(){
				final String baseCurCd = getCo().base_cur_cd();
				final String ptaxCurCd = getCo().ptax_cur_cd();
				public boolean match(Sprt01_DtlR row) {
					if (isSame(row.trd_cur_cd(), baseCurCd)
							&& (isSame(row.trd_cur_cd(), ptaxCurCd) || isNull(ptaxCurCd))) {
						return true;
					}
					return false;
				}
			});
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_TAX$F_GET_WTAX_RATE", "02"),
					MABCFunction.getFunctionExecuter("MAPA_TAX$F_GET_WTAX_RATE"),
					Sprt01_DtlR.$wtax_rate, tmpL, Sprt01_DtlR.$itm_cd, Sprt01_DtlR.$itm_sub1,
					Sprt01_DtlR.$itm_sub2, Sprt01_DtlR.$itm_sub3, TMP_BASE_DT);
			
			// EDI対象ＦＬＧを設定する
			MCList<MAM_EDI_IF_CTL_R> bindEdiL = MCList.create(MAM_EDI_IF_CTL_R.class);
			for (Sprt01_DtlR r : up0()) {
				bindEdiL.add(makeBindListEdi(r));
			}
			createChacheEdi(bindEdiL);
			for (Sprt01_DtlR r : up0()) {
				r.edi_tgt_flg(getEdiTgtFlg(r));
				r.edi_flg(r.edi_tgt_flg());
			}
		}
		/**
		 * 為替レートを設定します
		 */
		protected void setXrate() {
			// 為替レート
			MCList<Sprt01_DtlR> tmpXrateTgtL = MCList.create(Sprt01_DtlR.class);
			MCList<Sprt01_DtlR> tmpXrateNonTgtL = MCList.create(Sprt01_DtlR.class);
			for (Sprt01_DtlR r : up0()) {
				if (!isNull(r.trd_cur_cd())) {
					if (!isSame(r.trd_cur_cd(), getCo().base_cur_cd())) {
						tmpXrateTgtL.add(r);
					}
					else {
						tmpXrateNonTgtL.add(r);	
					}
				}
			}
			tmpXrateNonTgtL.setNumberNE(Sprt01_DtlR.$xrate, MCNumber.ONE);
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_XCHNG$F_GET_PURC_XRATE_NE", "01"),
					MABCFunction.getFunctionExecuter("MAPA_XCHNG$F_GET_PURC_XRATE_NE"),
					Sprt01_DtlR.$xrate, tmpXrateTgtL, Sprt01_DtlR.$trd_cur_cd, Sprt01_DtlR.$po_dt);
			String[] destCols = new String[]{Sprt01_DtlR.$xrate};
			String[] srcCols = new String[]{Sprt01_DtlR.$xrate};
			copyByPegNo(up0(), destCols, tmpXrateTgtL, srcCols);
			copyByPegNo(up0(), destCols, tmpXrateNonTgtL, srcCols);
		}
		/**
		 * 納税為替レートを設定します。
		 */
		protected void setPtaxXrate() {
			// 納税為替レート
			if (isNull(getCo().ptax_cur_cd())) {
				return;
			}
			// 納税為替レート
			MCList<Sprt01_DtlR> tmpPtaxXrateTgtL = MCList.create(Sprt01_DtlR.class);
			MCList<Sprt01_DtlR> tmpPtaxXrateNonTgtL = MCList.create(Sprt01_DtlR.class);
			for (Sprt01_DtlR r : up0()) {
				if (!isNull(r.trd_cur_cd())) {
					if (!isSame(r.trd_cur_cd(), getCo().ptax_cur_cd())) {
						tmpPtaxXrateTgtL.add(r);
					}
					else {
						tmpPtaxXrateNonTgtL.add(r);	
					}
				}
			}
			tmpPtaxXrateNonTgtL.setNumberNE(Sprt01_DtlR.$ptax_xrate, MCNumber.ONE);
			
			tmpPtaxXrateTgtL.addStringColumn(TMP_PTAX_CUR_CD, getCo().ptax_cur_cd());
			tmpPtaxXrateTgtL.addStringColumn(TMP_PURC_XRATE_CD, getCo().purc_xrate_cd());
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_XCHNG$F_GET_XRATE_NE", "01"),
					MABCFunction.getFunctionExecuter("MAPA_XCHNG$F_GET_XRATE_NE"), Sprt01_DtlR.$ptax_xrate,
					tmpPtaxXrateTgtL, Sprt01_DtlR.$trd_cur_cd, TMP_PTAX_CUR_CD, TMP_PURC_XRATE_CD, Sprt01_DtlR.$po_dt);
			String[] destCols = new String[]{Sprt01_DtlR.$ptax_xrate};
			String[] srcCols = new String[]{Sprt01_DtlR.$ptax_xrate};
			copyByPegNo(up0(), destCols, tmpPtaxXrateTgtL, srcCols);
			copyByPegNo(up0(), destCols, tmpPtaxXrateNonTgtL, srcCols);
		}
		
		/**
		 * 下り電文を設定します。
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
		
		protected Map_PurcUtil_Srch01_DtlR_Sprt01_DtlR<PurcUtil_Srch01_DtlR,Sprt01_DtlR> createMap_PurcUtil_Srch01_DtlR_Sprt01_DtlR() {
			return new Map_PurcUtil_Srch01_DtlR_Sprt01_DtlR<PurcUtil_Srch01_DtlR, Sprt01_DtlR>();
		}

		public class Map_PurcUtil_Srch01_DtlR_Sprt01_DtlR<D extends PurcUtil_Srch01_DtlR, S extends Sprt01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcUtil_Srch01_DtlR.$peg_no, Sprt01_DtlR.$peg_no);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$po_schd_dt, Sprt01_DtlR.$po_dt);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$sppl_cd, Sprt01_DtlR.$sppl_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$itm_cd, Sprt01_DtlR.$itm_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$itm_sub1, Sprt01_DtlR.$itm_sub1);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$itm_sub2, Sprt01_DtlR.$itm_sub2);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$itm_sub3, Sprt01_DtlR.$itm_sub3);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$mfg_loc_cd, Sprt01_DtlR.$mfg_loc_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$maker_cd, Sprt01_DtlR.$maker_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$bom_ptn, Sprt01_DtlR.$bom_ptn);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$dlv_cd, Sprt01_DtlR.$dlv_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$in_to_loc_cd, Sprt01_DtlR.$in_to_loc_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$site_cd, Sprt01_DtlR.$site_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$sppl_cal_cd, Sprt01_DtlR.$sppl_cal_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$in_to_loc_cal_cd, Sprt01_DtlR.$in_to_loc_cal_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$dlv_cal_cd, Sprt01_DtlR.$dlv_cal_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$lg_grp_cd, Sprt01_DtlR.$lg_grp_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$base_unit_qty, Sprt01_DtlR.$base_unit_qty);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$wg_cd, Sprt01_DtlR.$in_to_loc_wg_cd);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.prov_ddlv_flg(isNull(src.outsrc_sppl_cd()) ? false : true);
				if (!isNull(src.tdlv_cd())) {
					dest.lg_grp_cd(src.tdlv_lg_grp_cd());
				}
				else if (!isNull(src.dlv_cd())) {
					dest.lg_grp_cd(src.dlv_lg_grp_cd());
				}
				else {
					dest.lg_grp_cd(src.lg_grp_cd());
				}
				if (isSame(_sysParm, "1")) {
					dest.base_dt(src.rqst_avl_rqst_dt());
				}
			}
		}
		
		/**
		 * ＥＤＩ対象ＦＬＧを取得する
		 * @param up0
		 * @return ＥＤＩ対象ＦＬＧ
		 */
		protected boolean getEdiTgtFlg(Sprt01_DtlR up0) {
			boolean edi_tgt_flg = false;
			MAM_EDI_IF_CTL_R ediR = _cacheEdi.get(getToday(), up0.sppl_cd(), MAC_IF_PROC_TYP.PO_SEND.value());
			if (!isNull(ediR.if_proc_typ()) && !ediR.del_flg()) {
				edi_tgt_flg = true;
			}
			return edi_tgt_flg;
		}
	}
	/**
	 * Sprt02オペレーション.<p>
	 *
	 * 単価再取得<br>
	 */
	public class Sprt02 extends MSBDL_PoListReg_MC_A.Sprt02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			setUpriInfo();
		}
		
		/**
		 * 単価情報の取得および金額情報を算出します。
		 */
		protected void setUpriInfo() {
			MCList<Sprt02_DtlR>[] upGroupList = up0().groupList(getHdrColumn());
			setPegNo(up0());
			
			// サービスコール
			MSBDL_PurcUtil.PurcUtil_Srch02 purcUtilSrch02 = MSBDL_PurcUtil.crtPurcUtil_Srch02();
			Map_PurcUtil_Srch02_DtlR_Sprt02_DtlR<PurcUtil_Srch02_DtlR, Sprt02_DtlR> mpr = createMap_PurcUtil_Srch02_DtlR_Sprt02_DtlR();
			int grpNo = 1;
			for (MCList<Sprt02_DtlR> list : upGroupList) {
				MCList<PurcUtil_Srch02_DtlR> tmpL = MCList.create(PurcUtil_Srch02_DtlR.class);
				addAll(tmpL, list, mpr);
				tmpL.setStringNE(PurcUtil_Srch02_DtlR.$grp_no, String.valueOf(grpNo++));
				purcUtilSrch02.up0().addAll(tmpL);
			}
			
			purcUtilSrch02.exec();
			String[] destCols = {Sprt02_DtlR.$trd_cur_upri, Sprt02_DtlR.$trd_cur_proc_upri, Sprt02_DtlR.$trd_cur_onr_prov_upri, Sprt02_DtlR.$interim_flg};
			String[] srcCols = {PurcUtil_Srch02_DtlR.$trd_cur_upri, PurcUtil_Srch02_DtlR.$trd_cur_proc_upri, PurcUtil_Srch02_DtlR.$trd_cur_onr_prov_upri, PurcUtil_Srch02_DtlR.$interim_flg};
			copyByPegNo(up0(), destCols, purcUtilSrch02.down0(), srcCols);
			
			down0().setAll(up0());
		}
		
		protected String[] getHdrColumn(){
					return new String[]{ 
							Sprt02_DtlR.$trd_cd
							,Sprt02_DtlR.$purc_dpt_cd
							,Sprt02_DtlR.$purc_usr_cd
							,Sprt02_DtlR.$sppl_cd
							,Sprt02_DtlR.$po_dt
							,Sprt02_DtlR.$upd_po_print_schd_dt
							,Sprt02_DtlR.$trd_cur_cd
							,Sprt02_DtlR.$xrate
							,Sprt02_DtlR.$xrate_inpt_flg
							,Sprt02_DtlR.$ptax_xrate
							,Sprt02_DtlR.$ptax_xrate_inpt_flg
							,Sprt02_DtlR.$crct_rsn_cd
							,Sprt02_DtlR.$po_print_cd
							,Sprt02_DtlR.$wrk_no
							,Sprt02_DtlR.$tterm_cd1
							,Sprt02_DtlR.$tterm_cd2
							,Sprt02_DtlR.$tterm_cd3
							,Sprt02_DtlR.$tterm_rmrks1
							,Sprt02_DtlR.$tterm_rmrks2
							,Sprt02_DtlR.$tterm_rmrks3
							,Sprt02_DtlR.$edi_flg
							,Sprt02_DtlR.$trd_rmrks
							,Sprt02_DtlR.$intr_rmrks
							,Sprt02_DtlR.$po_print_rmrks
							,Sprt02_DtlR.$dlv_slip_rmrks
							,Sprt02_DtlR.$sub_char1
							,Sprt02_DtlR.$sub_char2
							,Sprt02_DtlR.$sub_char3
							,Sprt02_DtlR.$edi_sub_char1
							,Sprt02_DtlR.$edi_sub_char2
							,Sprt02_DtlR.$edi_sub_char3
							,Sprt02_DtlR.$edi_sub_char4
							,Sprt02_DtlR.$edi_sub_char5
							,Sprt02_DtlR.$edi_sub_num1
							,Sprt02_DtlR.$edi_sub_dt1};
		}
		
		protected Map_PurcUtil_Srch02_DtlR_Sprt02_DtlR<PurcUtil_Srch02_DtlR,Sprt02_DtlR> createMap_PurcUtil_Srch02_DtlR_Sprt02_DtlR() {
			return new Map_PurcUtil_Srch02_DtlR_Sprt02_DtlR<PurcUtil_Srch02_DtlR, Sprt02_DtlR>();
		}

		public class Map_PurcUtil_Srch02_DtlR_Sprt02_DtlR<D extends PurcUtil_Srch02_DtlR, S extends Sprt02_DtlR> extends MCRowMapper<D,S>{

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcUtil_Srch02_DtlR.$peg_no, Sprt02_DtlR.$peg_no);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$itm_cd, Sprt02_DtlR.$itm_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$itm_sub1, Sprt02_DtlR.$itm_sub1);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$itm_sub2, Sprt02_DtlR.$itm_sub2);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$itm_sub3, Sprt02_DtlR.$itm_sub3);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$sppl_cd, Sprt02_DtlR.$sppl_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$maker_cd, Sprt02_DtlR.$maker_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$trd_unit_cd, Sprt02_DtlR.$trd_unit_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$trd_unit_qty, Sprt02_DtlR.$trd_unit_qty);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$cur_cd, Sprt02_DtlR.$trd_cur_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$wg_cd, Sprt02_DtlR.$in_to_loc_wg_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$in_to_loc_cd, Sprt02_DtlR.$in_to_loc_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$dlv_cd, Sprt02_DtlR.$dlv_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$base_dt, Sprt02_DtlR.$base_dt);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$tax_cd, Sprt02_DtlR.$tax_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$mfg_loc_cd, Sprt02_DtlR.$mfg_loc_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$bom_ptn, Sprt02_DtlR.$bom_ptn);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$outsrc_itm_ord_no, Sprt02_DtlR.$outsrc_itm_ord_no);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$sno1, Sprt02_DtlR.$sno1);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$sno2, Sprt02_DtlR.$sno2);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$sno3, Sprt02_DtlR.$sno3);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$sno4, Sprt02_DtlR.$sno4);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$rqst_dlv_rqst_dt, Sprt02_DtlR.$dlv_rqst_tm);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$base_unit_qty, Sprt02_DtlR.$base_unit_qty);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if (isSame(_sysParm, "1")) {
					dest.itmdtl_base_dt(src.rqst_avl_rqst_dt());
				}
				else {
					dest.itmdtl_base_dt(src.po_dt());
				}
			}
		}
	}
	/**
	 * Sprt03オペレーション.<p>
	 *
	 * 納品先取得<br>
	 */
	public class Sprt03 extends MSBDL_PoListReg_MC_A.Sprt03 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			setPegNo(up0());
			setDlvInfo();
			setDown();
		}

		/**
		 * 納品先情報を設定します
		 */
		protected void setDlvInfo () {
			MSBDL_PurcUtil.PurcUtil_Srch03 purcUtilSrch03 = MSBDL_PurcUtil.crtPurcUtil_Srch03();
			addAll(purcUtilSrch03.up0(), up0(), createMap_PurcUtil_Srch03_DtlR_Sprt03_DtlR());
			purcUtilSrch03.exec();
			
			String[] destCols = makeDestCol();
			String[] srcCols = makeSrcCol();
			copyByPegNo(up0(), destCols, purcUtilSrch03.down0(), srcCols);
		}
		
		/**
		 * コピー先カラムを設定します。
		 * @return
		 */
		protected String[] makeDestCol() {
			String[] destCols = {Sprt03_DtlR.$in_to_loc_cd,
					Sprt03_DtlR.$in_to_loc_nm,
					Sprt03_DtlR.$outsrc_sppl_cd,
					Sprt03_DtlR.$pri_prnt_flg,
					Sprt03_DtlR.$str_ln_tgt_flg,
					Sprt03_DtlR.$loc_mng_typ,
					Sprt03_DtlR.$in_to_loc_cal_cd,
					Sprt03_DtlR.$site_cd,
					Sprt03_DtlR.$lg_grp_cd,
					Sprt03_DtlR.$str_ln_cd,
					Sprt03_DtlR.$str_ln_nm,
					Sprt03_DtlR.$str_ln_cd_none_flg,
					Sprt03_DtlR.$dlv_cd,
					Sprt03_DtlR.$dlv_sundry_flg,
					Sprt03_DtlR.$dlv_nm,
					Sprt03_DtlR.$dlv_cntct_dpt,
					Sprt03_DtlR.$dlv_cntct_psn,
					Sprt03_DtlR.$dlv_zip_cd,
					Sprt03_DtlR.$dlv_addr1,
					Sprt03_DtlR.$dlv_addr2,
					Sprt03_DtlR.$dlv_addr3,
					Sprt03_DtlR.$dlv_addr4,
					Sprt03_DtlR.$dlv_lg_grp_cd,
					Sprt03_DtlR.$dlv_tel,
					Sprt03_DtlR.$dlv_fax,
					Sprt03_DtlR.$dlv_cal_cd,
					Sprt03_DtlR.$tdlv_cd,
					Sprt03_DtlR.$tdlv_sundry_flg,
					Sprt03_DtlR.$tdlv_nm,
					Sprt03_DtlR.$tdlv_cntct_dpt,
					Sprt03_DtlR.$tdlv_cntct_psn,
					Sprt03_DtlR.$tdlv_zip_cd,
					Sprt03_DtlR.$tdlv_addr1,
					Sprt03_DtlR.$tdlv_addr2,
					Sprt03_DtlR.$tdlv_addr3,
					Sprt03_DtlR.$tdlv_addr4,
					Sprt03_DtlR.$tdlv_lg_grp_cd,
					Sprt03_DtlR.$tdlv_tel,
					Sprt03_DtlR.$tdlv_fax};
			return destCols;
		}
		
		/**
		 * コピー元カラムを設定します。
		 * @return
		 */
		protected String[] makeSrcCol() {
			String[] srcCols = {PurcUtil_Srch03_DtlR.$in_to_loc_cd,
					PurcUtil_Srch03_DtlR.$in_to_loc_nm,
					PurcUtil_Srch03_DtlR.$outsrc_sppl_cd,
					PurcUtil_Srch03_DtlR.$pri_prnt_flg,
					PurcUtil_Srch03_DtlR.$str_ln_tgt_flg,
					PurcUtil_Srch03_DtlR.$loc_mng_typ,
					PurcUtil_Srch03_DtlR.$in_to_loc_cal_cd,
					PurcUtil_Srch03_DtlR.$site_cd,
					PurcUtil_Srch03_DtlR.$lg_grp_cd,
					PurcUtil_Srch03_DtlR.$str_ln_cd,
					PurcUtil_Srch03_DtlR.$str_ln_nm,
					PurcUtil_Srch03_DtlR.$str_ln_cd_none_flg,
					PurcUtil_Srch03_DtlR.$dlv_cd,
					PurcUtil_Srch03_DtlR.$dlv_sundry_flg,
					PurcUtil_Srch03_DtlR.$dlv_nm,
					PurcUtil_Srch03_DtlR.$dlv_cntct_dpt,
					PurcUtil_Srch03_DtlR.$dlv_cntct_psn,
					PurcUtil_Srch03_DtlR.$dlv_zip_cd,
					PurcUtil_Srch03_DtlR.$dlv_addr1,
					PurcUtil_Srch03_DtlR.$dlv_addr2,
					PurcUtil_Srch03_DtlR.$dlv_addr3,
					PurcUtil_Srch03_DtlR.$dlv_addr4,
					PurcUtil_Srch03_DtlR.$dlv_lg_grp_cd,
					PurcUtil_Srch03_DtlR.$dlv_tel,
					PurcUtil_Srch03_DtlR.$dlv_fax,
					PurcUtil_Srch03_DtlR.$dlv_cal_cd,
					PurcUtil_Srch03_DtlR.$tdlv_cd,
					PurcUtil_Srch03_DtlR.$tdlv_sundry_flg,
					PurcUtil_Srch03_DtlR.$tdlv_nm,
					PurcUtil_Srch03_DtlR.$tdlv_cntct_dpt,
					PurcUtil_Srch03_DtlR.$tdlv_cntct_psn,
					PurcUtil_Srch03_DtlR.$tdlv_zip_cd,
					PurcUtil_Srch03_DtlR.$tdlv_addr1,
					PurcUtil_Srch03_DtlR.$tdlv_addr2,
					PurcUtil_Srch03_DtlR.$tdlv_addr3,
					PurcUtil_Srch03_DtlR.$tdlv_addr4,
					PurcUtil_Srch03_DtlR.$tdlv_lg_grp_cd,
					PurcUtil_Srch03_DtlR.$tdlv_tel,
					PurcUtil_Srch03_DtlR.$tdlv_fax};
			return srcCols;
		}
		
		/**
		 * 下り電文を設定します。
		 */
		protected void setDown() {
			down0().addAll(up0());
		}
		
		protected Map_PurcUtil_Srch03_DtlR_Sprt03_DtlR<PurcUtil_Srch03_DtlR,Sprt03_DtlR> createMap_PurcUtil_Srch03_DtlR_Sprt03_DtlR() {
			return new Map_PurcUtil_Srch03_DtlR_Sprt03_DtlR<PurcUtil_Srch03_DtlR, Sprt03_DtlR>();
		}

		public class Map_PurcUtil_Srch03_DtlR_Sprt03_DtlR<D extends PurcUtil_Srch03_DtlR, S extends Sprt03_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcUtil_Srch03_DtlR.$peg_no, Sprt03_DtlR.$peg_no);
				addColumnPathMap(PurcUtil_Srch03_DtlR.$slo_d_no, Sprt03_DtlR.$slo_d_no);
			}
		}
	}
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 注文書または納品書を発行します<br>
	 */
	public class Prnt01 extends MSBDL_PoListReg_MC_A.Prnt01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			MSBDL_PurcPrntService.PurcPrnt_Prnt01 ope = MSBDL_PurcPrntService.crtPurcPrnt_Prnt01();
			setPegNo(up1());
			
			// 最新改訂を取得
			MCList<MST_PO_R> poL = MCList.create(MST_PO_R.class);
			MST_PO_R t = MST_PO_R.create("T");
			MCQueryApiBuilder poL_bldr = MCQueryApiBuilder.create(t);
			poL_bldr.setWhere(t.po_no.eq(bind("po_no")));
			dbSelect("MSBDL0090_MST_PO_S02", poL, poL_bldr, up1());
			
			MCIndexKey idx = poL.createIndex(MST_PO_R.$po_no);
			MCList<MST_PO_R> bindPoL = poL.clone();
			bindPoL.addStringColumn("tmp_can_flg");
			bindPoL.forEach(r -> r.setStringNE("tmp_can_flg", toTrueStr(r.can_flg())));
			// 発注ＮＯ・改定番号に紐づく納品書ヘッダを取得
			MCList<MST_PURC_DLV_SLIP_R> purcDlvSlipL = MCList.create(MST_PURC_DLV_SLIP_R.class);
			MST_PURC_DLV_SLIP_R DLVSLIP = MST_PURC_DLV_SLIP_R.create("DLVSLIP");
			MCQueryApiBuilder purcDlvSlipL_bldr = MCQueryApiBuilder.create(DLVSLIP);
			purcDlvSlipL_bldr.setWhere(DLVSLIP.po_no.eq(bind("po_no")));
			purcDlvSlipL_bldr.addWhereWithAnd(bind("po_rev").between(DLVSLIP.po_rev, DLVSLIP.last_po_rev));
			purcDlvSlipL_bldr.addWhereWithAnd(DLVSLIP.purc_dlv_slip_src_typ.eq(value(MSC_PURC_DLV_SLIP_SRC_TYP.PO.value())));
			purcDlvSlipL_bldr.addWhereWithCutOffAnd(bind("tmp_can_flg").eq(value(true)).and(DLVSLIP.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CAN.value()))));
			purcDlvSlipL_bldr.setOrderBy(DLVSLIP.po_no.asc(), DLVSLIP.po_rev.desc(), DLVSLIP.last_po_rev.asc(), DLVSLIP.slip_sts_typ.asc());
			dbSelect("MSBDL0090_MST_PURC_DLV_SLIP_S02", purcDlvSlipL, purcDlvSlipL_bldr, bindPoL);
			MCIndexKey idxPurcDlvSlip = purcDlvSlipL.createIndex(MST_PURC_DLV_SLIP_R.$po_no);
			
			insWkPurcDlvSlip(purcDlvSlipL);
			MCList<MST_PURC_DLV_SLIP_D_R> purcDlvSlipDL = MCList.create(MST_PURC_DLV_SLIP_D_R.class);
			MST_PURC_DLV_SLIP_D_R DLVSLIPD = MST_PURC_DLV_SLIP_D_R.create("DLVSLIPD");
			MSW_PURC_DLV_SLIP_KEY_R purcDlvSlipKey = MSW_PURC_DLV_SLIP_KEY_R.create("PURCDLVSLIPKEY");
			MCQueryApiBuilder purcDlvSlipDL_bldr = MCQueryApiBuilder.create(DLVSLIPD);
			purcDlvSlipDL_bldr.addInnerJoin(purcDlvSlipKey,
					bracket(purcDlvSlipKey.dlv_slip_mng_no.eq(DLVSLIPD.dlv_slip_mng_no)
							.and(purcDlvSlipKey.dlv_slip_mng_seq.eq(DLVSLIPD.dlv_slip_mng_seq))));
			purcDlvSlipDL_bldr.addWhereWithAnd(DLVSLIPD.dlv_slip_invalid_flg.eq(value(false)));
			dbSelect("MSBDL0090_MST_PURC_DLV_SLIP_D_S01", purcDlvSlipDL, purcDlvSlipDL_bldr);
			MCIndexKey idxPurcDlvSlipD = purcDlvSlipDL.createIndex(MST_PURC_DLV_SLIP_D_R.$dlv_slip_mng_no, MST_PURC_DLV_SLIP_D_R.$dlv_slip_mng_seq);
			
			MCList<PurcPrnt_Prnt01_DlvSlipR> dlvSlipL = MCList.create(PurcPrnt_Prnt01_DlvSlipR.class);
			for (Prnt01_DtlR hdrR : up1()) {
				MST_PO_R poR = poL.getFirst(idx, hdrR.po_no());
				if (up0().prnt_po_flg()) {
					PurcPrnt_Prnt01_PoR poPrntR = PurcPrnt_Prnt01_PoR.create();
					copy(poPrntR, hdrR, createMap_PurcPrnt_Prnt01_PoR_Prnt01_DtlR());
					ope.up0().add(poPrntR);
				}
				if (up0().prnt_dlv_flg() || up0().prnt_purc_ddlv_dlv_flg()) {
					MCList<PurcPrnt_Prnt01_DlvSlipR> wkDlvSlipL = MCList.create(PurcPrnt_Prnt01_DlvSlipR.class);
					PurcPrnt_Prnt01_DlvSlipR baseDlvSlipR = PurcPrnt_Prnt01_DlvSlipR.create();
					copy(baseDlvSlipR, hdrR, createMap_PurcPrnt_Prnt01_DlvSlipR_Prnt01_DtlR());
					MCList<MST_PURC_DLV_SLIP_R> wkPurcDlvSlipL = purcDlvSlipL.subList(idxPurcDlvSlip, hdrR.po_no());
					MCList<MST_PURC_DLV_SLIP_R>[] gpL = wkPurcDlvSlipL.groupList(MST_PURC_DLV_SLIP_R.$dlv_slip_mng_no);
					for (MCList<MST_PURC_DLV_SLIP_R> wkL : gpL) {
						MST_PURC_DLV_SLIP_R wkR = wkL.get(0);
						PurcPrnt_Prnt01_DlvSlipR dlvSlipR = baseDlvSlipR.clone();
						
						dlvSlipR.dlv_slip_mng_no(wkR.dlv_slip_mng_no());
						dlvSlipR.dlv_slip_mng_seq(wkR.dlv_slip_mng_seq());
						dlvSlipR.setStringNE(MST_PO_R.$dlv_slip_form_cd, poR.dlv_slip_form_cd());
						wkDlvSlipL.add(dlvSlipR);
					}
					if (!isNull(wkDlvSlipL) && !wkDlvSlipL.isEmpty()) {
						dlvSlipL.addAll(wkDlvSlipL);
					}
				}
			}
			if (!isNull(dlvSlipL) && !dlvSlipL.isEmpty()) {
				dlvSlipL.setBooleanNE(PurcPrnt_Prnt01_DlvSlipR.$inc_can_flg, true);
				if (up0().prnt_dlv_flg()) {
					for (PurcPrnt_Prnt01_DlvSlipR dlvSlipR : dlvSlipL) {
						if (isNull(dlvSlipR.getStringNE(MST_PO_R.$dlv_slip_form_cd))) {
							continue;
						}
						MCList<MST_PURC_DLV_SLIP_D_R> dlvSlipDL = purcDlvSlipDL.subList(idxPurcDlvSlipD, dlvSlipR.dlv_slip_mng_no(), dlvSlipR.dlv_slip_mng_seq());
						boolean isPrnt = false;
						for (MST_PURC_DLV_SLIP_D_R dlvSlipDR : dlvSlipDL) {
							if (!dlvSlipDR.dlv_slip_invalid_flg()) {
								isPrnt = true;
								break;
							}
						}
						if (isPrnt) {
							dlvSlipR.bp_srch_flg(true);
							ope.up2().add(dlvSlipR);
						}
					}
				}
				if (up0().prnt_purc_ddlv_dlv_flg()) {
					ope.up4().addAll(dlvSlipL);
				}
			}
			ope.up3().indiv_prnt_flg(up0().indiv_prnt_flg());
			ope.exec();
		}
		
		protected void insWkPurcDlvSlip(MCList<MST_PURC_DLV_SLIP_R> purcDlvSlipL ) {
			MST_PURC_DLV_SLIP_R dbc_t = MST_PURC_DLV_SLIP_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(dbc_t);
			dbWkDelete("MSBDL5200_MSW_PURC_DLV_SLIP_D01", dbc_bldr.getBaseDbc());
			dbWkInsert("MSBDL5200_MSW_PURC_DLV_SLIP_I01", purcDlvSlipL, dbc_bldr.getBaseDbc());
		}
		
		protected Map_PurcPrnt_Prnt01_PoR_Prnt01_DtlR<PurcPrnt_Prnt01_PoR,Prnt01_DtlR> createMap_PurcPrnt_Prnt01_PoR_Prnt01_DtlR() {
			return new Map_PurcPrnt_Prnt01_PoR_Prnt01_DtlR<PurcPrnt_Prnt01_PoR, Prnt01_DtlR>();
		}

		public class Map_PurcPrnt_Prnt01_PoR_Prnt01_DtlR<D extends PurcPrnt_Prnt01_PoR, S extends Prnt01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcPrnt_Prnt01_PoR.$peg_no, Prnt01_DtlR.$peg_no);
				addColumnPathMap(PurcPrnt_Prnt01_PoR.$po_no, Prnt01_DtlR.$po_no);
				addColumnPathMap(PurcPrnt_Prnt01_PoR.$po_rev, Prnt01_DtlR.$po_rev);

			}
		}
		
		protected Map_PurcPrnt_Prnt01_DlvSlipR_Prnt01_DtlR<PurcPrnt_Prnt01_DlvSlipR,Prnt01_DtlR> createMap_PurcPrnt_Prnt01_DlvSlipR_Prnt01_DtlR() {
			return new Map_PurcPrnt_Prnt01_DlvSlipR_Prnt01_DtlR<PurcPrnt_Prnt01_DlvSlipR, Prnt01_DtlR>();
		}

		public class Map_PurcPrnt_Prnt01_DlvSlipR_Prnt01_DtlR<D extends PurcPrnt_Prnt01_DlvSlipR, S extends Prnt01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcPrnt_Prnt01_DlvSlipR.$peg_no, Prnt01_DtlR.$peg_no);
				addColumnPathMap(PurcPrnt_Prnt01_DlvSlipR.$po_no, Prnt01_DtlR.$po_no);
			}
		}

	}

	protected MCMessageList chkDac(MCList<Chk01_DtlR> hdrL) {
		// ＷＧ自体取得できない場合は、必須チェックで落とすためメッセージは出さない。
		MCList<Chk01_DtlR> subL = hdrL.subList(new MCRowMatcher<Chk01_DtlR>() {
			public boolean match (Chk01_DtlR m) {
				if (isNull(m.purc_dpt_wg_cd())) {
					return false;
				}
				else {
					return true;
				}
			}
		});
		return checkWritableDptCdDac(subL, Chk01_DtlR.$purc_dpt_cd);
	}

	protected String[] getHdrColumn(){
		return new String[]{ 
				Chk01_DtlR.$trd_cd
				,Chk01_DtlR.$purc_dpt_cd
				,Chk01_DtlR.$purc_usr_cd
				,Chk01_DtlR.$sppl_cd
				,Chk01_DtlR.$po_dt
				,Chk01_DtlR.$upd_po_print_schd_dt
				,Chk01_DtlR.$trd_cur_cd
				,Chk01_DtlR.$xrate
				,Chk01_DtlR.$xrate_inpt_flg
				,Chk01_DtlR.$ptax_xrate
				,Chk01_DtlR.$ptax_xrate_inpt_flg
				,Chk01_DtlR.$crct_rsn_cd
				,Chk01_DtlR.$po_print_cd
				,Chk01_DtlR.$wrk_no
				,Chk01_DtlR.$tterm_cd1
				,Chk01_DtlR.$tterm_cd2
				,Chk01_DtlR.$tterm_cd3
				,Chk01_DtlR.$tterm_rmrks1
				,Chk01_DtlR.$tterm_rmrks2
				,Chk01_DtlR.$tterm_rmrks3
				,Chk01_DtlR.$edi_flg
				,Chk01_DtlR.$trd_rmrks
				,Chk01_DtlR.$intr_rmrks
				,Chk01_DtlR.$po_print_rmrks
				,Chk01_DtlR.$dlv_slip_rmrks
				,Chk01_DtlR.$sub_char1
				,Chk01_DtlR.$sub_char2
				,Chk01_DtlR.$sub_char3
				,Chk01_DtlR.$edi_sub_char1
				,Chk01_DtlR.$edi_sub_char2
				,Chk01_DtlR.$edi_sub_char3
				,Chk01_DtlR.$edi_sub_char4
				,Chk01_DtlR.$edi_sub_char5
				,Chk01_DtlR.$edi_sub_num1
				,Chk01_DtlR.$edi_sub_dt1};
	}
	
	protected String[] getSplitColumn() {
		String[] ret = new String[getHdrColumn().length + 1];
		System.arraycopy(getHdrColumn(), 0, ret, 0, getHdrColumn().length);
		ret[ret.length - 1] = Chk01_DtlR.$ap_cred_cd;
		return ret;
	}
	
	protected void setApCredCd(MCList<Chk01_DtlR> list) {
		MCList<MAM_BP_R> bpL = MCList.create(MAM_BP_R.class);
		for(Chk01_DtlR r : list.groupBy(Chk01_DtlR.$sppl_cd)) {
			MAM_BP_R bpR = MAM_BP_R.create();
			bpR.bp_cd(r.sppl_cd());
			bpR.ap_cred_cd(execFuncString(createSqlId(LOGIC_ID, "MAPA_BP$F_GET_CRED_OF_SPPL", "01"),
					MAPA_BP$F_GET_CRED_OF_SPPL(value(r.sppl_cd()))));
			bpL.add(bpR);
		}
		MCIndexKey bpKey = bpL.createIndex(MAM_BP_R.$bp_cd);
		for(MCList<Chk01_DtlR> l : list.groupList(Chk01_DtlR.$sppl_cd)) {
			l.setValue(Chk01_DtlR.$ap_cred_cd, bpL.getFirst(bpKey, l.get(0).sppl_cd()).ap_cred_cd());
		}
	}

	protected boolean isNonPurc(Chk01_DtlR r) {
		return MAC_PURC_ID_TYP.isVMI(r.purc_id_typ()) || MAC_PURC_ID_TYP.isFFR_RCV(r.purc_id_typ());
	}
	protected Map_Lot_Chk03_CndR_Chk01_DtlR<Lot_Chk03_CndR,Chk01_DtlR> createMap_Lot_Chk03_CndR_Chk01_DtlR() {
		return new Map_Lot_Chk03_CndR_Chk01_DtlR<Lot_Chk03_CndR, Chk01_DtlR>();
	}

	public class Map_Lot_Chk03_CndR_Chk01_DtlR<D extends Lot_Chk03_CndR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Lot_Chk03_CndR.$peg_no, Chk01_DtlR.$peg_no);
			addColumnPathMap(Lot_Chk03_CndR.$itm_cd, Chk01_DtlR.$bd_itm_cd);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub1, Chk01_DtlR.$bd_itm_sub1);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub2, Chk01_DtlR.$bd_itm_sub2);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub3, Chk01_DtlR.$bd_itm_sub3);
			addColumnPathMap(Lot_Chk03_CndR.$lot_no, Chk01_DtlR.$bd_lot_no);
			addColumnPathMap(Lot_Chk03_CndR.$sublot_no, Chk01_DtlR.$bd_sublot_no);
			addColumnPathMap(Lot_Chk03_CndR.$err_flg, Chk01_DtlR.$err_flg);
		}
	}
	protected String _coPoPrintNm = null;
	protected String getCoPoPrintNm() {
		if (isNull(_coPoPrintNm) && !isNull(getCo().po_print_cd())) {
			MAM_PO_PRINT_R dbc = MAM_PO_PRINT_R.create();
			MAM_PO_PRINT_R t = MAM_PO_PRINT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.po_print_nm);
			dbSelectKey("MSBDL0090_MAM_PO_PRINT_S01", dbc, dbc_bldr, getCo().po_print_cd());
			_coPoPrintNm = dbc.po_print_nm();
		}
		return _coPoPrintNm;
	}
	/**
	 * Sprt04オペレーション.<p>
	 *
	 * 発注日を変更したときに必要な情報を取得する<br>
	 */
	public class Sprt04 extends MSBDL_PoListReg_MC_A.Sprt04 {
		
		//-------------------------------------
		// indexKey
		//-------------------------------------
		/** 品目詳細（購買用　品目・枝番・WG・発注先・メーカ） */
		MCIndexKey _idxItmDtlPurc = null;
		/** 品目詳細（外注用　品目・枝番・WG・製造場所・構成パタン・発注先） */
		MCIndexKey _idxItmDtlOutsrc = null;
		//-------------------------------------
		// cache
		//-------------------------------------
		/** 取引先品目マスタ */
		protected FXUCL_MCDbcCacheStEnd<MAM_BP_ITM_R> _cacheBpItm = null;
		/** 取引先マスタ */
		protected FXUCL_MCDbcCache<MAM_BP_R> _cacheBp;
		/** 取引先補助マスタ */
		protected FXUCL_MCDbcCacheStEnd<MAM_BP_SUB_R> _cacheBpSub;
		/** 品目詳細マスタ */
		protected MCList<MAM_ITM_DTL_R> _cacheItmDtl = MCList.create(MAM_ITM_DTL_R.class);

		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			MCList<Sprt04_DtlR> upriPoDtL =  up0().subList(r -> MAC_PURC_UPRI_REQ_TYP.isPO_DT(r.purc_upri_req_typ()));
			
			// 税情報を取得する
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_TAX$F_GET_PURC_TAX_CD", "03"),
					MABCFunction.getFunctionExecuter("MAPA_TAX$F_GET_PURC_TAX_CD"),
					Sprt04_DtlR.$tax_cd, upriPoDtL, Sprt04_DtlR.$itm_cd, Sprt04_DtlR.$itm_sub1,
					Sprt04_DtlR.$itm_sub2, Sprt04_DtlR.$itm_sub3, Sprt04_DtlR.$sppl_cd, Sprt04_DtlR.$po_dt);
			
			// 源泉税率を取得する
			MCList<Sprt04_DtlR> wtaxL = upriPoDtL.subList(new MCRowMatcher<Sprt04_DtlR>(){
				final String baseCurCd = getCo().base_cur_cd();
				final String ptaxCurCd = getCo().ptax_cur_cd();
				public boolean match(Sprt04_DtlR r) {
					if (isSame(r.trd_cur_cd(), baseCurCd)
							&& (isSame(r.trd_cur_cd(), ptaxCurCd) || isNull(ptaxCurCd))) {
						return true;
					}
					return false;
				}
			});
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_TAX$F_GET_WTAX_RATE", "03"),
					MABCFunction.getFunctionExecuter("MAPA_TAX$F_GET_WTAX_RATE"),
					Sprt04_DtlR.$wtax_rate, wtaxL, Sprt04_DtlR.$itm_cd, Sprt04_DtlR.$itm_sub1,
					Sprt04_DtlR.$itm_sub2, Sprt04_DtlR.$itm_sub3, Sprt04_DtlR.$po_dt);
			
			// 発注先品目に関する情報を取得する
			createBpItmCache();
			for (Sprt04_DtlR r : up0()) {
				// 発注先品目・発注先品名
				MAM_BP_ITM_R bpItmR = getCacheBpItm(r.po_dt(), r.sppl_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				r.sppl_itm_cd(bpItmR.bp_itm_cd());
				r.sppl_itm_nm(bpItmR.bp_itm_nm());
			}
			// 債務部門を設定する。
			MCList<MAM_BP_R> bindBpL = MCList.create(MAM_BP_R.class);
			for (Sprt04_DtlR r : up0()) {
				if (!isNull(r.asppl_cd())) {
					//　買掛先
					MAM_BP_R bpR = MAM_BP_R.create();
					bpR.bp_cd(r.asppl_cd());
					bindBpL.add(bpR);
				}
				if (!isNull(r.sppl_cd())) {
					//　発注先
					MAM_BP_R bpR = MAM_BP_R.create();
					bpR.bp_cd(r.sppl_cd());
					bindBpL.add(bpR);
				}
			}
			createCacheBp(bindBpL.groupBy(MAM_BP_R.$bp_cd));
			setApDpt(up0());
			
			// 品目詳細マスタの関連項目を設定する。
			createItmDtlCache();
			setItmDtl(up0());
			down0().setAll(up0());
		}
		
		/**
		 * キャッシュ作成（取引先品目マスタ）
		 */
		protected void createBpItmCache() {
			_cacheBpItm = new FXUCL_MCDbcCacheStEnd<MAM_BP_ITM_R>(
					MCQueryApiBuilder.create(MAM_BP_ITM_R.create("T")),
					up0(), Sprt01_DtlR.$sppl_cd, Sprt01_DtlR.$itm_cd, Sprt01_DtlR.$itm_sub1, Sprt01_DtlR.$itm_sub2, Sprt01_DtlR.$itm_sub3);
		}
		
		/**
		 * キャッシュ作成（取引先マスタ、取引先補助マスタ）
		 */
		protected void createCacheBp(MCList<MAM_BP_R> bindBpL) {
			// 発注先・買掛先・外注先
			MCList<MAM_BP_R> bpL = MCList.create(MAM_BP_R.class);
			MAM_BP_R t = MAM_BP_R.create("T");
			MCQueryApiBuilder bp_bldr = MCQueryApiBuilder.create(t);
			_cacheBp = new FXUCL_MCDbcCache<MAM_BP_R>(bpL, bp_bldr, bindBpL, MAM_BP_R.$bp_cd);
			
			// 発注先・買掛先・外注先(補助)
			_cacheBpSub = new FXUCL_MCDbcCacheStEnd<MAM_BP_SUB_R>(
					MCQueryApiBuilder.create(MAM_BP_SUB_R.create("T")),
					bindBpL, MAM_BP_R.$bp_cd);
		}
		
		/**
		 * キャッシュ作成（品目詳細マスタ）
		 * @param list
		 */
		protected void createItmDtlCache() {

			_cacheItmDtl = MCList.create(MAM_ITM_DTL_R.class);

			_cacheItmDtl.addStringColumn("mfg_loc_sppl_cd");

			MAM_ITM_DTL_R t = MAM_ITM_DTL_R.create("T");
			MCQueryApiBuilder cacheItmDtl_bldr = MCQueryApiBuilder.create(t);
			MAM_LOC_R m1 = MAM_LOC_R.create("M1");

			cacheItmDtl_bldr.addSelect(m1.sppl_cd.as("mfg_loc_sppl_cd"));
			cacheItmDtl_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
			cacheItmDtl_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			cacheItmDtl_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			cacheItmDtl_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			cacheItmDtl_bldr.addWhereWithAnd(t.wg_cd.eq(bind("in_to_loc_wg_cd")));
			cacheItmDtl_bldr.addWhereWithAnd(t.rqst_loc_cd.eq(value(MAC_STR.NULL_VAL.value())));
			cacheItmDtl_bldr.addLeftOuterJoin(m1, bracket( t.mfg_loc_cd.eq(m1.loc_cd)));
			dbSelect("MSBDL0090_MAM_ITM_DTL_S02", _cacheItmDtl, cacheItmDtl_bldr,
					up0().groupBy(Sprt04_DtlR.$itm_cd, Sprt04_DtlR.$itm_sub1,
							Sprt04_DtlR.$itm_sub2, Sprt04_DtlR.$itm_sub3,
							Sprt04_DtlR.$in_to_loc_wg_cd));
			_idxItmDtlPurc = _cacheItmDtl.createIndex(MAM_ITM_DTL_R.$itm_cd, MAM_ITM_DTL_R.$itm_sub1, MAM_ITM_DTL_R.$itm_sub2,
					MAM_ITM_DTL_R.$itm_sub3, MAM_ITM_DTL_R.$wg_cd, MAM_ITM_DTL_R.$sppl_cd, MAM_ITM_DTL_R.$maker_cd);
			_idxItmDtlOutsrc = _cacheItmDtl.createIndex(MAM_ITM_DTL_R.$itm_cd, MAM_ITM_DTL_R.$itm_sub1, MAM_ITM_DTL_R.$itm_sub2,
					MAM_ITM_DTL_R.$itm_sub3, MAM_ITM_DTL_R.$wg_cd, MAM_ITM_DTL_R.$mfg_loc_cd, MAM_ITM_DTL_R.$bom_ptn, "mfg_loc_sppl_cd");
		}
		
		/**
		 * キャッシュ取得（取引先品目マスタ）
		 * @param r
		 * @return
		 */
		protected MAM_BP_ITM_R getCacheBpItm(MCDate poDt, String bpCd, String itmCd, String itmSub1, String itmSub2, String itmSub3) {
			return _cacheBpItm.get(poDt, bpCd, itmCd, itmSub1, itmSub2, itmSub3);
		}
		
		/**
		 * キャッシュ取得（取引先マスタ）
		 * @param bp_cd
		 * @return
		 */
		protected MAM_BP_R getCacheBp(String bp_cd) {
			return _cacheBp.get(bp_cd);
		}
		
		/**
		 * キャッシュ取得（取引先補助マスタ）
		 * @param po_dt
		 * @param bp_cd
		 * @return
		 */
		protected MAM_BP_SUB_R getCacheBpSub(MCDate po_dt, String bp_cd) {
			return _cacheBpSub.get(po_dt, bp_cd);
		}
		
		/**
		 * キャッシュ取得（品目詳細マスタ）
		 * @param dtlR
		 * @return
		 */
		protected MCList<MAM_ITM_DTL_R> getCacheItmDtlL(Sprt04_DtlR dtlR){
			MCList<MAM_ITM_DTL_R> itmDtlL = MCList.create(MAM_ITM_DTL_R.class);
			if (isNull(dtlR.po_dt())) {	
				return itmDtlL;
			}	
			if (dtlR.outsrc_flg()) {
				itmDtlL = _cacheItmDtl.subList(_idxItmDtlOutsrc,
						dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), dtlR.in_to_loc_wg_cd(), dtlR.mfg_loc_cd(), dtlR.bom_ptn(), dtlR.sppl_cd());
			}
			else {
				itmDtlL = _cacheItmDtl.subList(_idxItmDtlPurc,
						dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), dtlR.in_to_loc_wg_cd(), dtlR.sppl_cd(), nvl(dtlR.maker_cd(), NULL_VAL));
			}
			itmDtlL = itmDtlL.subList(r -> dtlR.po_dt().lte(r.end_dt()) && dtlR.po_dt().gte(r.st_dt()));
			return itmDtlL;
		}
		
		/**
		 * 債務部門を設定する。
		 * @param up0
		 */
		protected void setApDpt(MCList<Sprt04_DtlR> up0) {
			for (Sprt04_DtlR r : up0()) {
				MAM_BP_R aspplR = getCacheBp(r.asppl_cd());
				MAM_BP_SUB_R aspplSubR  = getCacheBpSub(r.po_dt(), r.asppl_cd());
				r.ap_dpt_cd(nvl(aspplSubR.ap_dpt_cd(), aspplR.ap_dpt_cd()));
			}
		}
		
		/**
		 * ＥＤＩ対象ＦＬＧを取得する
		 * @param up0
		 * @return ＥＤＩ対象ＦＬＧ
		 */
		protected boolean getEdiTgtFlg(Sprt04_DtlR up0) {
			boolean edi_tgt_flg = false;
			MAM_EDI_IF_CTL_R ediR = _cacheEdi.get(up0.po_dt(), up0.sppl_cd(), MAC_IF_PROC_TYP.PO_SEND.value());
			if (!isNull(ediR.if_proc_typ()) && !ediR.del_flg()) {
				edi_tgt_flg = true;
			}
			return edi_tgt_flg;
		}
		
		/**
		 * 品目詳細マスタの関連項目を設定する。
		 * @param up0
		 */
		protected void setItmDtl(MCList<Sprt04_DtlR> up0) {
			for (Sprt04_DtlR r : up0) {
				if (!isNull(r.itm_cd())) {
					MCList<MAM_ITM_DTL_R> itmDtlL = getCacheItmDtlL(r);
					MAM_BP_R spplR = getCacheBp(r.sppl_cd());
					MAM_ITM_DTL_R itmDtlR = MAM_ITM_DTL_R.create("ITM_DTL");
					if (!isNull(itmDtlL) && itmDtlL.size() == 1) {
						itmDtlR = itmDtlL.get(0);
						r.purc_id_typ(itmDtlR.purc_id_typ());
					}
					r.purc_basis_typ(getPurcBasisTyp(itmDtlR, spplR));
				}
			}
		}
		
		/**
		 * 仕入計上区分の初期値は以下の優先順で設定されるが
		 * ①～④はクライアント側で制御している。<p>
		 * 
		 * ①仕入直送：「１：入荷基準」<br>
		 * ②入荷不要の品目：「２：検収基準」<br>
		 * ③購買識別区分が「無償受給」、「VMI」：「２：検収基準」<br>
		 * ④発注先が下請対象：「１：入荷基準」<br>
		 * ⑤品目詳細マスタの「仕入計上区分」<br>
		 * ⑥取引先マスタの「仕入計上区分」<br>
		 * ⑦①～⑥以外：「９：任意」<br>
		 */
		protected String getPurcBasisTyp(MAM_ITM_DTL_R itmDtlR, MAM_BP_R spplR) {
			if (!isNull(itmDtlR.purc_basis_typ())) {
				return itmDtlR.purc_basis_typ();
			}
			else if (!isNull(spplR.purc_basis_typ())) {
				return spplR.purc_basis_typ();
			}
			else {
				return MAC_PURC_BASIS_TYP.ANY_BASIS.value();
			}
		}
	}
	
	/**
	 * Chk03オペレーション.<p>
	 *
	 * 送信・再送信前チェック<br>
	 */
	public class Chk03 extends MSBDL_PoListReg_MC_A.Chk03 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			super.doIt();
			setErrToRtnStsTyp();
			setDown();	
		}
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			createCache();
			msgL.addAll(chkUpdCntr());
			return msgL;
		}
		
		/**
		 * 更新カウンタチェックを行う
		 */
		protected MCMessageList chkUpdCntr() {
			MCMessageList msgL = new MCMessageList();
			MCJoinKey<MCList<Chk03_Dtl2R>> jk = up0().join(Chk03_DtlR.$data_no, up1(), Chk03_Dtl2R.$data_no);
			for (Chk03_DtlR up0R : up0()) {
				// 発注ヘッダ
				MCMessageList tmpMsgL = chkUpdCntrPoSentIf(up0R);
				if (tmpMsgL.isEmpty()) {
					// 発注送信ＩＦ
					for (Chk03_Dtl2R up1R : up0R.getJoined(jk)) {
						tmpMsgL = chkUpdCntrPoSentIf(up1R, up0R);
						if (!tmpMsgL.isEmpty()) {
							// チェック結果は一覧の行に紐付けるので、紐付けるメッセージはひとつだけにする
							break;
						}
					}
				}
				msgL.addAll(tmpMsgL);
			}
			return msgL;
		}
		protected MCMessageList chkUpdCntrPoSentIf(Chk03_DtlR up0R) {
			MST_PO_R poR = _poCache.get(up0R.po_no());
			return checkUpdCntrNE(up0R, Chk03_DtlR.$po_upd_cntr, poR);
		}
		protected MCMessageList chkUpdCntrPoSentIf(Chk03_Dtl2R up1R, Chk03_DtlR up0R) {
			MST_PO_SEND_IF_R ifR = _poSendIfCache.get(up1R.data_lno());
			MCMessageList msgL = checkUpdCntrNE(up1R, Chk03_Dtl2R.$po_send_if_upd_cntr, ifR);
			for (MCMessage msg : msgL) {
				// メッセージは一覧の行に紐付ける
				msg.setCauseRow(up0R, msg.getCauseColumn());
			}
			return msgL;
		}
		
		/**
		 * 更新カウンタチェック対象のデータをキャッシュする
		 */
		protected void createCache() {
			createPoCache();
			createPoSendIfCache();
		}
		
		/**
		 * 発注ヘッダをキャッシュする
		 */
		protected FXUCL_MCDbcCache<MST_PO_R> _poCache;
		protected void createPoCache() {
			MST_PO_R t = MST_PO_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSelect(t.po_no, t.purc_dpt_cd, t.upd_cntr);
			
			MCList<MST_PO_R> rsltL = MCList.create(MST_PO_R.class);
			dbSelectKeyForUpdateNoWait("MSBDL0090_MST_PO_S05", rsltL, bldr, up0());
			
			_poCache = new FXUCL_MCDbcCache<>(bldr);
			rsltL.forEach(r ->  {
				_poCache.putCache(new String[]{r.po_no()}, r);
			});
		}
		
		/**
		 * 発注送信ＩＦをキャッシュする
		 */
		protected FXUCL_MCDbcCache<MST_PO_SEND_IF_R> _poSendIfCache;
		protected void createPoSendIfCache() {
			MST_PO_SEND_IF_R t = MST_PO_SEND_IF_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSelect(t.data_lno, t.upd_cntr);
			
			MCList<MST_PO_SEND_IF_R> rsltL = MCList.create(MST_PO_SEND_IF_R.class);
			dbSelectKeyForUpdateNoWait("MSBDL0090_MST_PO_SEND_IF_S02", rsltL, bldr, up1());
			
			_poSendIfCache = new FXUCL_MCDbcCache<>(bldr);
			rsltL.forEach(r ->  {
				_poSendIfCache.putCache(new MCNumber[]{r.data_lno()}, r);
			});
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			msgL.addAll(chkDac());
			return msgL;
		}
		protected MCMessageList chkDac() {
			up0().addStringColumn(MST_PO_R.$purc_dpt_cd);
			for (Chk03_DtlR r : up0()) {
				MST_PO_R poR = _poCache.get(r.po_no());
				r.setString(MST_PO_R.$purc_dpt_cd, poR.purc_dpt_cd());
			}
			return checkWritableDptCdDac(up0(), MST_PO_R.$purc_dpt_cd);
		}
		
		protected void setDown() {
			down0().setAll(up0());
			down1().setAll(up1());
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 発注送信ＩＦを、送信または再送信します<br>
	 */
	public class Upd01 extends MSBDL_PoListReg_MC_A.Upd01 {
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
		
		protected void handleSuccess(MCList<Chk03_DtlR> l) {
			dbTran().commit();
			for (Chk03_DtlR r : l) {
				if (!r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}
		
		protected void handleEx(Exception e, MCList<Chk03_DtlR> l) {
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
			for (Chk03_DtlR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}
		
		@Override
		protected void doIt() {
			setPegNoByPo();
			callThisChk03();
			callPoSendIf();
		}
		
		/**
		 * 紐付けＮＯを採番します
		 */
		protected void setPegNoByPo() {
			setPegNo(up0());
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk03() {
			MSBDL_PoListReg.Chk03 chk03 = MSBDL_PoListReg.crtChk03();
			chk03.up0().setAll(up0());
			chk03.up1().setAll(up1());
			chk03.exec();
			up0().setAll(chk03.down0());
			up1().setAll(chk03.down1());
		}
		
		/**
		 * 発注送信サービスを実行する
		 */
		protected void callPoSendIf() {
			MCList<Chk03_DtlR>  sendL = getChkList(up0());
			if (sendL.isEmpty()) {
				return;
			}
			MSLAL_PoSendIfService.PoSendIf_Upd02 upd02 = MSLAL_PoSendIfService.crtPoSendIf_Upd02();
			setAll(upd02.up0(), sendL, createMap_PoSendIf_Upd02_DtlR_Chk03_DtlR());
			upd02.exec();
			
			MCIndexKey idx = upd02.down0().createIndex(PoSendIf_Upd02_DtlR.$po_no);
			for (Chk03_DtlR sendR : sendL) {
				PoSendIf_Upd02_DtlR dwn0R = upd02.down0().getFirst(idx, sendR.po_no());
				if (!isNull(dwn0R)) {
					sendR.err_flg(dwn0R.err_flg());
					sendR.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
				}
			}
		}
		protected Map_PoSendIf_Upd02_DtlR_Chk03_DtlR<PoSendIf_Upd02_DtlR,Chk03_DtlR> createMap_PoSendIf_Upd02_DtlR_Chk03_DtlR() {
			return new Map_PoSendIf_Upd02_DtlR_Chk03_DtlR<PoSendIf_Upd02_DtlR, Chk03_DtlR>();
		}
		public class Map_PoSendIf_Upd02_DtlR_Chk03_DtlR<D extends PoSendIf_Upd02_DtlR, S extends Chk03_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PoSendIf_Upd02_DtlR.$po_no, Chk03_DtlR.$po_no);
				addColumnPathMap(PoSendIf_Upd02_DtlR.$data_no, Chk03_DtlR.$data_no);
			}
		}
	}

	//FMCB CUSTOM END
}