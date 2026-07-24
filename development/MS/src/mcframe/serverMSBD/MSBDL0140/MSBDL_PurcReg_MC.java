package mcframe.serverMSBD.MSBDL0140;

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
import mcframe.serverMSBD.MSBDL0140.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBD.MSBDL5180.*;
import mcframe.serverMSBD.MSBDL5040.*;
import mcframe.commonMAUA.MAUAC0010.MAUAC_List;
import static mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil.*;
import static mcframe.serverMAUC.MAUCL1110.MAUCL_DptUtil.*;
import static mcframe.serverMSBD.MSBDL0140.Query.*;
import static mcframe.commonCore.container.MCRow.Status.*;
import mcframe.serverMSUC.MSUCL0020.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0170.*;
import static mcframe.serverMSBD.MSBDL5040.MSBDL_PurcUtil.*;
import mcframe.serverMSBF.MSBFL5210.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBDL_PurcReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBDL_PurcReg_MC extends MSBDL_PurcReg_MC_A{
	//FMCB CUSTOM START
	
	public static final Class<MSBDL_PurcReg> CLAZZ = MSBDL_PurcReg.class;
	
	// ---- 発注ヘッダキャッシュ
	protected MST_PO_R _poCache = null;
	
	protected static void initPoCc(MCRow row) {
		object(CLAZZ)._initPoCc(row);
	}
	protected void _initPoCc(MCRow row) {
		_poCache = MST_PO_R.create("T");
		dbSelectKey("MSBDL0140_MST_PO_S01", _poCache, MCQueryApiBuilder.create(_poCache), row);
	}
	
	// ---- 発注明細キャッシュ
	protected FXUCL_MCDbcCache<MST_PO_D_R> _poDCache = null;
	protected static void initPoDCc(MCList<?> list) {
		object(CLAZZ)._initPoDCc(list);
	}
	protected void _initPoDCc(MCList<?> list) {
		_poDCache = new FXUCL_MCDbcCache<MST_PO_D_R>(MCQueryApiBuilder.create(MST_PO_D_R.create("T")), list, MST_PO_D_R.$po_d_no);
	}
	protected static FXUCL_MCDbcCache<MST_PO_D_R> getPoDCc() {
		return object(CLAZZ)._poDCache;
	}
	
	// ------ 格付マスタ　キャッシュ
	protected FXUCL_MCDbcCache<MAM_STK_GD_R> _stkGdCache = null;
	protected void initStkGdCache(MCList<MAM_STK_GD_R> list) {
		object(CLAZZ)._initStkGdCache(list);
	}
	protected void _initStkGdCache(MCList<MAM_STK_GD_R> list) {
		_stkGdCache = new FXUCL_MCDbcCache<MAM_STK_GD_R>(
				MCQueryApiBuilder.create(MAM_STK_GD_R.create("T")), list,
				MAM_STK_GD_R.$gd_cd);
	}
	protected static FXUCL_MCDbcCache<MAM_STK_GD_R> getStkGd() {
		return object(CLAZZ)._stkGdCache;
	}
	
	/**
	 * Chk01オペレーション.<p>
	 *
	 */
	public class Chk01 extends MSBDL_PurcReg_MC_A.Chk01 {
		protected FXUCL_MCDbcCache<MST_ARR_SCHD_R> _arrSchdCache = null;
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			
			if (!hasErr()) {
				editUp(up0(), up1(), up2());
				// 仕入実績サービスのチェック処理
				callPurcChk03();
			}
			
			// 下り電文セット
			setDown();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			// キャッシュ
			createCache();
			
			// 入荷進捗の行ロックと、更新カウンタチェック処理
			msgL.addAll(lockArrPrAndChkUpdCntr(up0(), up1()));
			
			if (!msgL.isEmpty()) {
				return msgL;
			}
			
			// トランザクションデータの補完
			cmplUpParamInTranData();
			
			// 各負担項目ＮＯの存在チェック用のトランザクションデータを取得する
			getDataForExistChk(up1());
			
			chkDpt(up0(), up1());
			
			return msgL;
			
		}

		
		
		protected void createCache() {
			// 格付ＣＤ
			MCList<MAM_STK_GD_R> list = MCList.create(MAM_STK_GD_R.class);
			up1().forEach(r -> {
				MAM_STK_GD_R row = MAM_STK_GD_R.create();
				row.gd_cd(r.gd_cd());
				list.add(row);
			});
			up2().forEach(r -> {
				MAM_STK_GD_R row = MAM_STK_GD_R.create();
				row.gd_cd(r.gd_cd());
				list.add(row);
			});
			initStkGdCache(list);
			createArrSchdCache();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			
			if (!msgL.isEmpty() || hasErrFlgOn(up0())) {
				return msgL;
			}
			
			// 更新データのDACチェック処理
			msgL.addAll(checkDAC());

			// 条件付チェック
			msgL.addAll(checkInCnd(up0(), up1(), up2()));
			
			// その他チェック処理 ----
			
			// 明細0件チェック
			msgL.addAll(checkAtLeastOneDtl(up0(), up1()));
			
			// 詳細0件チェック
			msgL.addAll(checkAtLeastOneIo(up1(), up2()));
			
			// 発注引継明細0件チェック
			msgL.addAll(checkAtLeastOneDtlInheritPoD(up0(), up1()));
			
			msgL.addAll(checkDtlSub(up0(), up1(), up2()));
			msgL.addAll(checkIoSub(up2()));
			
			msgL.addAll(existBdCheck(up1()));  
			
			// 表示順の補完
			setDispSeq(up1());
			
			// 在庫管理区分の補完
			setStkMngTyp();
			
			// 基準単位・荷姿単位の設定
			setBaseUnitQtyAndPackUnitQty(up1(), up2());
			
			complProcUpriAmt(up0(), up1());
			
			replaceParam();
			return msgL;
		}
		
		protected MCMessageList checkDAC() {
			return checkWritableDptCdDac(up0(), Chk01_HdrR.$purc_dpt_cd);
		}
		
		
		/**
		 * トランザクションデータで上り電文の値を補完する
		 */
		protected void cmplUpParamInTranData() {

			if (!isNull(up0().po_no())) {
				// 発注ヘッダで、ヘッダ上り電文の項目を上書する
				MST_PO_R dbcPo = MST_PO_R.create("T");
				dbSelectKey("MSBDL0140_MST_PO_S02", dbcPo, MCQueryApiBuilder.create(dbcPo), up0());
				
				up0().trd_cd(dbcPo.trd_cd());
				up0().trd_ptn_typ(dbcPo.trd_ptn_typ());
				up0().sppl_cd(dbcPo.sppl_cd());
				
				// 発注明細で、明細上り電文の項目を上書する
				MCList<MST_PO_D_R> poDL = MCList.create(MST_PO_D_R.class);
				MST_PO_D_R poDL_t = MST_PO_D_R.create("T");
				MCQueryApiBuilder poDL_bldr = MCQueryApiBuilder.create(poDL_t);
				MST_ARR_PR_R t2 = MST_ARR_PR_R.create("T2");
				MST_PURC_SCHD_R t3 = MST_PURC_SCHD_R.create("T3");
				poDL_bldr.addSelect(t3.purc_schd_no, t3.arr_schd_no);
				poDL_bldr.addInnerJoin(t2, bracket( poDL_t.po_d_no.eq(t2.po_d_no)));
				poDL_bldr.addInnerJoin(t3, bracket( t2.arr_pr_no.eq(t3.arr_pr_no)));
				poDL_bldr.addWhereWithAnd(t3.purc_schd_no.eq(bind("purc_schd_no")));
				dbSelect("MSBDL0140_MST_PO_D_S01", poDL, poDL_bldr, up1());
				
				MCIndexKey idxForPoD = poDL.createIndex("PURC_SCHD_NO");

				for (Chk01_DtlR row : up1()) {
					
					// 行追加された明細行は仕入予定NOがないので、補完はできない
					if (isNull(row.purc_schd_no())) {
						continue;
					}
					
					MST_PO_D_R selectR = poDL.getFirst(idxForPoD, row.purc_schd_no());
					row.purc_schd_no(selectR.getStringNE("PURC_SCHD_NO"));
					row.arr_schd_no(selectR.getStringNE("ARR_SCHD_NO"));

					row.mfg_loc_cd(selectR.mfg_loc_cd());
					row.bom_ptn(selectR.bom_ptn());
					row.rqst_avl_rqst_dt(selectR.rqst_avl_rqst_dt());
					
					row.itm_cd(selectR.itm_cd());
					row.itm_sub1(selectR.itm_sub1());
					row.itm_sub2(selectR.itm_sub2());
					row.itm_sub3(selectR.itm_sub3());
					row.maker_cd(selectR.maker_cd());
					row.sno1(selectR.sno1());
					row.sno2(selectR.sno2());
					row.sno3(selectR.sno3());
					row.sno4(selectR.sno4());
					row.ver_no(selectR.ver_no());
					row.drct_dlv_typ(selectR.drct_dlv_typ());
					row.scst_cd(selectR.dlv_cd());
					row.sundry_itm_flg(selectR.sundry_itm_flg());
					if (!selectR.sundry_itm_flg()) {
						row.itm_nm(null);
						row.iv_itm_nm(null);
					}
					else {
						row.itm_nm(selectR.itm_nm());
						row.iv_itm_nm(selectR.iv_itm_nm());
					}
					
					row.sppl_itm_cd(selectR.sppl_itm_cd());
					row.sppl_itm_nm(selectR.sppl_itm_nm());
					
					// 明細上り電文に紐付く、詳細上り電文の項目も上書きする
					MCList<Chk01_IoR> ioL = up2().subList(Chk01_IoR.$dtl_peg_no, row.peg_no());
					for (Chk01_IoR ioR : ioL) {
						ioR.itm_cd(selectR.itm_cd());
						ioR.itm_sub1(selectR.itm_sub1());
						ioR.itm_sub2(selectR.itm_sub2());
						ioR.itm_sub3(selectR.itm_sub3());
						ioR.ver_no(selectR.ver_no());

					}
					
				}
			}
			else {
				// 計画外仕入
				
				MCList<MAM_ITM_R> itmL = MCList.create(MAM_ITM_R.class);
				dbSelectKey("MSBDL0140_MAM_ITM_S01", itmL, MCQueryApiBuilder.create(MAM_ITM_R.create("T")), up1());
				MCIndexKey idx = itmL.createIndex(MAM_ITM_R.$itm_cd, 
						MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
				
				for (Chk01_DtlR dtlRow : up1()) {
					
					// 参照登録による計画外仕入の場合、参照元の入荷不要ＦＬＧが最新でない可能性があるため、
					// チェック処理で品目マスタを取り直し、最新の入荷不要ＦＬＧにより同時計上オン・オフを決定する。
					MAM_ITM_R itmR = itmL.getFirst(idx, dtlRow.itm_cd(), 
							dtlRow.itm_sub1(), dtlRow.itm_sub2(), dtlRow.itm_sub3());
					if (itmR.arr_skip_flg()) {
						dtlRow.sync_flg(false);
					}
					else {
						dtlRow.sync_flg(true);
					}
					
					if (isNull(dtlRow.sno1())) {
						dtlRow.sno1(MAC_STR.NULL_VAL.value());
					}
					if (isNull(dtlRow.sno2())) {
						dtlRow.sno2(MAC_STR.NULL_VAL.value());
					}
					if (isNull(dtlRow.sno3())) {
						dtlRow.sno3(MAC_STR.NULL_VAL.value());
					}
					if (isNull(dtlRow.sno4())) {
						dtlRow.sno4(MAC_STR.NULL_VAL.value());
					}
				}
			}
		}

		/**
		 * 在庫管理区分の設定 <p>
		 * 品目マスタの在庫管理区分・資産管理区分と、上り電文の経費購買FLGの組合せで、<br>
		 * 連携する在庫管理区分の値を決定する<br>
		 */
		protected void setStkMngTyp() {
			// 品目マスタリストロジックで補完された在庫管理区分・資産管理区分、経費購買FLGの組合せで、
			// 仕入実績サービスに連携する在庫管理区分の値を決定する。

			for (Chk01_DtlR r : up1()) {
				r.stk_mng_typ(getStkMngTypForTran(r.stk_mng_typ(), r.asset_mng_typ(), r.xpns_purc_flg()));
			}
			
		}
		
		@Override
		protected void putListLogicCheckBind() {
			super.putListLogicCheckBind();
			// 債務部門
			ListLogicBind apDptBind = getListLogicBind(up1(), Chk01_DtlR.$ap_dpt_cd);
			apDptBind.putBind(MAUAC_List.DptCols.$i_dt, up0(), Chk01_HdrR.$ac_dt);
			
			// 負担部門
			ListLogicBind bdDptBind = getListLogicBind(up1(), Chk01_DtlR.$bd_dpt_cd);
			bdDptBind.putBind(MAUAC_List.DptCols.$i_dt, up0(), Chk01_HdrR.$ac_dt);
			
		}

		/**
		 * 仕入実績登録サービスの更新前チェック（共通）を実行する
		 */
		protected void callPurcChk03() {
			
			// 自サービス上り電文のデータ更新区分を全てCRTに設定
			up0().data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			up1().setString(Chk01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
			up2().setString(Chk01_IoR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
			
			MSBDL_PurcActRegService.Purc_Chk03 ope = MSBDL_PurcActRegService.crtPurc_Chk03();
			setPurcChk03Up(ope, up0(), up1(), up2());
			
			ope.exec();
			setPurcChk03Down(ope, up0(), up1(), up2());
		}
		
		/**
		 * 下り電文セット
		 */
		protected void setDown() {
			// チェックで補完した結果を返す
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
			down2().setAll(up2());
		}
		protected void replaceParam() {
			MCIndexKey idxUp2 = up2().createIndex(Chk01_IoR.$dtl_peg_no, Chk01_IoR.$arr_act_no);
			for (Chk01_DtlR dtlR : up1()) {
				if (MAC_STK_MNG_TYP.isNOT_MNG(dtlR.stk_mng_typ())) { 
					MCList<Chk01_IoR> subL = up2().subList(idxUp2, dtlR.peg_no());
					// 非在庫品の場合は入荷予定の通りに仕入する
					for (Chk01_IoR ioR: subL) {
						if (!isNull(ioR.arr_act_no())) {
							if (isIvReg() && dtlR.temp_ap_flg()) {
								continue;
							}
							MST_ARR_SCHD_R arrSchdR = _arrSchdCache.get(dtlR.arr_schd_no());
							ioR.stk_id_typ(arrSchdR.stk_id_typ());
							ioR.stk_insp_typ(arrSchdR.stk_insp_typ());
							ioR.quality_typ(arrSchdR.quality_typ());
							ioR.gd_cd(arrSchdR.gd_cd());	
						}
					}
				}
			}
		}
		protected void createArrSchdCache() {
			_arrSchdCache = new FXUCL_MCDbcCache<MST_ARR_SCHD_R>(
					MCQueryApiBuilder.create(MST_ARR_SCHD_R.create("T")), up1(),
					MST_ARR_SCHD_R.$arr_schd_no);
		}
	}
	
	/**
	 * Chk02オペレーション.<p>
	 *
	 */
	public class Chk02 extends MSBDL_PurcReg_MC_A.Chk02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void init() {
			super.init();
			
			// キャッシュ取得
			initPoCc(up0());
			initPoDCc(up1());
			
		}

		@Override
		protected void doIt() {
			super.doIt();
			if (!hasErr()) {
				editUp(up0(), up1(), up2());
				callPurcChk03();
			}
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			
			MCMessageList msgL = super.doServerCheckBase();
			
			// キャッシュ作成
			createCache();
			
			// 補完用の実績トラン
			MST_PURC_ACT_R prcActH = MST_PURC_ACT_R.create();
			MCList<MST_PURC_ACT_D_R> prcActD = MCList.create(MST_PURC_ACT_D_R.class);
			MCList<MST_PURC_ACT_IO_R> prcActIo = MCList.create(MST_PURC_ACT_IO_R.class);
			
			// 更新カウンタチェック、行ロック処理
			// 入荷進捗の更新カウンタチェック、行ロック処理
			msgL.addAll(lockArrPrAndChkUpdCntr(up0(), up1()));
			
			if (msgL.size() > 0) {
				return msgL;
			}

			// 仕入実績の更新カウンタチェック、行ロック処理
			msgL.addAll(lockPurcActAndChkUpdCntr(prcActH, prcActD, prcActIo));
			
			if (msgL.size() > 0) {
				return msgL;
			}
			
			cmplUpParamInTranData(prcActH, prcActD, prcActIo);
			
			// 各負担項目ＮＯの存在チェック用のトランザクションデータを取得する
			getDataForExistChk(up1());

			chkDpt(up0(), up1());
			
			return msgL;
			
		}
		
		protected void createCache() {
			// 格付ＣＤ
			MCList<MAM_STK_GD_R> list = MCList.create(MAM_STK_GD_R.class);
			up1().forEach(r -> {
				MAM_STK_GD_R row = MAM_STK_GD_R.create();
				row.gd_cd(r.gd_cd());
				list.add(row);
			});
			up2().forEach(r -> {
				MAM_STK_GD_R row = MAM_STK_GD_R.create();
				row.gd_cd(r.gd_cd());
				list.add(row);
			});
			initStkGdCache(list);
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			
			if (!msgL.isEmpty() || hasErrFlgOn(up0())) {
				return msgL;
			}
			
			msgL.addAll(checkDAC());
			
			// 条件付チェック
			msgL.addAll(checkInCnd(up0(), up1(), up2()));
						
			// 明細0件チェック
			msgL.addAll(checkAtLeastOneDtl(up0(), up1()));
			
			// 詳細0件チェック
			msgL.addAll(checkAtLeastOneIo(up1(), up2()));

			// 発注引継明細0件チェック
			msgL.addAll(checkAtLeastOneDtlInheritPoD(up0(), up1()));
			
			msgL.addAll(checkDtlSub(up0(), up1(), up2()));
			msgL.addAll(checkIoSub(up2()));
			
			msgL.addAll(existBdCheck(up1()));
			
			// 表示順の補完
			setDispSeq(up1());

			// 基準単位・荷姿単位の設定
			setBaseUnitQtyAndPackUnitQty(up1(), up2());
			
			complProcUpriAmt(up0(), up1());
			
			return msgL;
		}

		protected MCMessageList checkDAC() {
			MCMessageList msgL = new MCMessageList();
			// 更新前DACチェック処理
			if (!isNull(up0().old_purc_dpt_cd()) && !isSame(up0().old_purc_dpt_cd(), up0().purc_dpt_cd())) {
				msgL.addAll(checkWritableDptCdDac(up0(), Chk01_HdrR.$old_purc_dpt_cd));
			}
			// 更新後DACチェック処理
			msgL.addAll(checkWritableDptCdDac(up0(), Chk01_HdrR.$purc_dpt_cd));
			return msgL;
		}
		
		@Override
		protected void putListLogicCheckBind() {
			super.putListLogicCheckBind();
			
			// 債務部門
			ListLogicBind apDptBind = getListLogicBind(up1(), Chk01_DtlR.$ap_dpt_cd);
			apDptBind.putBind(MAUAC_List.DptCols.$i_dt, up0(), Chk01_HdrR.$ac_dt);
			
			// 負担部門
			ListLogicBind bdDptBind = getListLogicBind(up1(), Chk01_DtlR.$bd_dpt_cd);
			bdDptBind.putBind(MAUAC_List.DptCols.$i_dt, up0(), Chk01_HdrR.$ac_dt);

		}

		/**
		 * 仕入実績に対して行ロック処理、更新カウンタチェックを行う<br>
		 * 更新カウンタチェックが正常に行えた場合は、連携されたDBコンテナに仕入実績ヘッダ、仕入実績明細、仕入実績受払を格納する<br>
		 * @param prcActH 仕入実績ヘッダ
		 * @param prcActD 仕入実績明細
		 * @param prcActIo 仕入実績受払
		 * @return メッセージリスト
		 */
		protected MCMessageList lockPurcActAndChkUpdCntr(MST_PURC_ACT_R prcActH,
				MCList<MST_PURC_ACT_D_R> prcActD, MCList<MST_PURC_ACT_IO_R> prcActIo) {
			
			MCMessageList msgL = new MCMessageList();

			// 行ロック
			dbSelectKeyForUpdateNoWait("MSBDL0140_MST_PURC_ACT_S02", prcActH,
					MCQueryApiBuilder.create(MST_PURC_ACT_R.create("T")), up0());

			// 更新カウンタチェック  発注ありの場合チェックしない
			if (isNull(prcActH.po_no())) {
				msgL.addAll(checkUpdCntrNE(up0(), Chk01_HdrR.$purc_act_upd_cntr, prcActH));
			}

			// 更新カウンタチェック正常時、仕入実績明細・受払を取得し、電文に補完する
			MST_PURC_ACT_D_R prcActD_t = MST_PURC_ACT_D_R.create("T");
			MCQueryApiBuilder prcActD_bldr = MCQueryApiBuilder.create(prcActD_t);
			MST_PURC_SCHD_R t2 = MST_PURC_SCHD_R.create("T2");
			MST_ARR_PR_R t3 = MST_ARR_PR_R.create("T3");
			MST_PO_D_R t4 = MST_PO_D_R.create("T4");
			prcActD_bldr.addSelect(t2.arr_schd_no, prcActD_t.purc_id_typ);
			prcActD_bldr.addLeftOuterJoin(t2, bracket( prcActD_t.purc_schd_no.eq(t2.purc_schd_no)));
			prcActD_bldr.addLeftOuterJoin(t3, bracket( t2.arr_pr_no.eq(t3.arr_pr_no)));
			prcActD_bldr.addLeftOuterJoin(t4, bracket( t3.po_d_no.eq(t4.po_d_no)));
			prcActD_bldr.addWhereWithAnd(prcActD_t.purc_act_no.eq(bind("purc_act_no"))
					.and(prcActD_t.purc_act_seq.eq(bind("purc_act_seq"))), prcActH);
			dbSelect("MSBDL0140_MST_PURC_ACT_D_S01", prcActD, prcActD_bldr);

			MST_PURC_ACT_IO_R prcActIo_t = MST_PURC_ACT_IO_R.create("T");
			MCQueryApiBuilder prcActIo_bldr = MCQueryApiBuilder.create(prcActIo_t);
			MST_PURC_ACT_D_R prcActIo_t2 = MST_PURC_ACT_D_R.create("T2");
			prcActIo_bldr.addInnerJoin(prcActIo_t2,
					bracket(prcActIo_t.purc_act_d_no.eq(prcActIo_t2.purc_act_d_no)
							.and(prcActIo_t.purc_act_d_seq.eq(prcActIo_t2.purc_act_d_seq))));
			prcActIo_bldr.addWhereWithAnd(prcActIo_t2.purc_act_no.eq(bind("purc_act_no"))
					.and(prcActIo_t2.purc_act_seq.eq(bind("purc_act_seq"))), prcActH);
			dbSelect("MSBDL0140_MST_PURC_ACT_IO_S01", prcActIo, prcActIo_bldr);
			
			return msgL;
			
		}
		
		/**
		 * トランザクションデータで上り電文の値を補完する
		 */
		protected void cmplUpParamInTranData(MST_PURC_ACT_R paH, MCList<MST_PURC_ACT_D_R> paD, MCList<MST_PURC_ACT_IO_R> paIo) {

			// ヘッダ行補完
			if (!isNull(up0().po_no())) {
				// 発注ヘッダで、ヘッダ上り電文の項目を上書する
				MST_PO_R poH = MST_PO_R.create("T");
				dbSelectKey("MSBDL0140_MST_PO_S03", poH, MCQueryApiBuilder.create(poH), up0());
				
				up0().trd_cd(poH.trd_cd());
				up0().trd_ptn_typ(poH.trd_ptn_typ());
				up0().sppl_cd(poH.sppl_cd());
				// 買掛先、支払先予定管理先、支払先、与信管理先は、仕入実績ヘッダから取得
				up0().asppl_cd(paH.asppl_cd());
				up0().bsppl_cd(paH.bsppl_cd());
				up0().psppl_cd(paH.psppl_cd());
				up0().cred_cd(paH.cred_cd());
				up0().old_purc_dpt_cd(paH.purc_dpt_cd());

			}
			else {
				// ヘッダ
				up0().trd_cd(paH.trd_cd());
				up0().trd_ptn_typ(paH.trd_ptn_typ());
				up0().old_purc_dpt_cd(paH.purc_dpt_cd());

			}

			// 明細の補完
			MCIndexKey idxPaD = paD.createIndex(MST_PURC_ACT_D_R.$purc_act_d_no, MST_PURC_ACT_D_R.$purc_act_d_seq);
			for (Chk01_DtlR dtlRow : up1()) {
				
				MST_PURC_ACT_D_R paDRow = paD.getFirst(idxPaD, dtlRow.purc_act_d_no(), dtlRow.purc_act_d_seq());
				
				if (isNull(dtlRow.po_d_no())) {
					// 発注情報なしの場合、仕入実績明細から購買識別区分を補完
					if (isSame(dtlRow.getStatus(), MODIFY) || isSame(dtlRow.getStatus(), NONE)) {
						dtlRow.purc_id_typ(paDRow.purc_id_typ());
					}
				}
				else {
					if (!isSame(dtlRow.getStatus(), DELETE)) {
						// 発注情報ありの場合、各種値を補完
						cmplDtlParamInPoD(dtlRow);
					}
				}
				
				// 明細行から詳細行に品目情報を補完
				MCList<Chk01_IoR> ioList = up2().subList(Chk01_IoR.$dtl_peg_no, dtlRow.peg_no());
				for (Chk01_IoR ioRow : ioList) {
					ioRow.itm_cd(dtlRow.itm_cd());
					ioRow.itm_sub1(dtlRow.itm_sub1());
					ioRow.itm_sub2(dtlRow.itm_sub2());
					ioRow.itm_sub3(dtlRow.itm_sub3());
				}
			}
		}

		/**
		 * 仕入実績登録サービスの更新前チェック（共通）を実行する
		 */
		protected void callPurcChk03() {
			
			MSBDL_PurcActRegService.Purc_Chk03 ope = MSBDL_PurcActRegService.crtPurc_Chk03();
			
			setPurcChk03Up(ope, up0(), up1(), up2());
			if (isSame(ope.up0().size(), 0)) {
				return;
			}

			ope.exec();
			
			// エラーFLGをコピー
			up0().err_flg(ope.down0().get(0).err_flg());
			copyErrFlg(up1(), down1());
			copyErrFlg(up2(), down2());
			setPurcChk03Down(ope, up0(), up1(), up2());
		}
		
		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
			down2().setAll(up2());
		}
		
	}
	
	
	protected MCMessageList checkAtLeastOneDtlInheritPoD(Chk01_HdrR hdrR, MCList<Chk01_DtlR> dtlL) {
		MCMessageList msgL = new MCMessageList();
		
		if (isNull(hdrR.po_no())) {
			return msgL;
		}
		
		boolean existRowInheritPoD = false;
		for (Chk01_DtlR dtlR : dtlL) {
			if (!isNull(dtlR.po_d_no())
					&& !MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
				existRowInheritPoD = true;
				break;
			}
		}
		
		if (!existRowInheritPoD) {
			msgL.add(new MCMessage(MSBDL0154));
		}
		
		return msgL;
	}
	
	protected MCMessageList checkDtlSub(Chk01_HdrR hdrR, MCList<Chk01_DtlR> dtlL, MCList<Chk01_IoR> ioL) {

		MCMessageList msgL = new MCMessageList();
		MCIndexKey idxIo = ioL.createIndex(Chk01_IoR.$dtl_peg_no);

		for (Chk01_DtlR dtlR : dtlL) {
			MCNumber ioSumContQty = MCNumber.ZERO;
			for (Chk01_IoR ioR : ioL.subList(idxIo, dtlR.peg_no())) {
				if (isNull(ioR.arr_act_no()) && !dtlR.sync_flg() && dtlR.accpt_dfct_flg()) {
					msgL.add(new MCMessage(dtlR, null, MSBDL0152, dtlR.po_d_no(), toDispGUIIndex(dtlR)));
					continue;
				}
				if (isNull(ioR.arr_act_no()) && !dtlR.sync_flg() && dtlR.accpt_dfct_flg()) {
					msgL.add(new MCMessage(ioR, null, MSBDL0152, dtlR.po_d_no(), toDispGUIIndex(ioR)));
				}
				if (dtlR.cont_fctr_flg() && !isNull(ioR.purc_cont_qty()) && !MAC_DATA_CRUD_TYP.isDEL(ioR.data_crud_typ())) {
					ioSumContQty = ioSumContQty.add(ioR.purc_cont_qty());
				}
			}
			if (!dtlR.temp_ap_flg() && dtlR.cont_fctr_flg() && !isSame(dtlR.purc_cont_qty(), ioSumContQty)) {
				msgL.add(new MCMessage(dtlR, Chk01_DtlR.$purc_cont_qty, MSBDL0160, 
						dtlR.purc_cont_qty(), ioSumContQty, toDispGUIIndex(dtlR)));
			}

			if (MAC_TRD_PTN_TYP.isPURC_XPNS(isIvReg() ? dtlR.trd_ptn_typ() : hdrR.trd_ptn_typ()) && MAC_ASSET_MNG_TYP.isMNG(dtlR.asset_mng_typ())) {
				msgL.add(new MCMessage(dtlR, null, MSBDL0149, toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()),
						toDispGUIIndex(dtlR)));
			}
			if (MAC_ASSET_MNG_TYP.isMNG(dtlR.asset_mng_typ()) && dtlR.xpns_purc_flg()) {
				msgL.add(new MCMessage(dtlR, null, MSBDL0150, toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()),
						dtlR.purc_rsn_cd(), toDispGUIIndex(dtlR)));
			}
			if (MAC_ASSET_MNG_TYP.isNOT_MNG(dtlR.asset_mng_typ()) && !dtlR.xpns_purc_flg()) {
				msgL.add(new MCMessage(dtlR, null, MSBDL0151, toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()),
						dtlR.purc_rsn_cd(), toDispGUIIndex(dtlR)));
			}
			// 格付ＣＤマスタ存在チェック
			if (!isNull(dtlR.gd_cd()) && !MSC_PURC_UNFIX_STR.isUNFIXED(dtlR.gd_cd())) {
				MAM_STK_GD_R stkGd = getStkGd().get(dtlR.gd_cd());
				if (isNull(stkGd)) {
					msgL.add(new MCMessage(MAUAL0045, toDispGUIIndex(dtlR)));
				}
			}
			if (dtlR.re_arr_flg() && hdrR.subcon_flg()
					&& !dtlR.re_arr_rqst_tm().eqDate(dtlR.re_arr_purc_schd_dt())) {
				msgL.add(new MCMessage(MSBDL0201, toDispGUIIndex(dtlR)));
			}
		}
		return msgL;
	}
	
	protected MCMessageList checkIoSub(MCList<Chk01_IoR> ioL) {
		MCMessageList msgL = new MCMessageList();
		
		for (Chk01_IoR ioRow : ioL) {
			// 格付ＣＤマスタ存在チェック
			if (!isNull(ioRow.gd_cd()) && !MSC_PURC_UNFIX_STR.isUNFIXED(ioRow.gd_cd())) {
				MAM_STK_GD_R stkGd = getStkGd().get(ioRow.gd_cd());
				if (isNull(stkGd)) {
					msgL.add(new MCMessage(MAUAL0045, toDispGUIIndex(ioRow)));
				}
			}
		}
		
		return null;
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
			if (dr.getStatus() == DELETE) {
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
	
	/**
	 * Chk03オペレーション.<p>
	 *
	 */
	public class Chk03 extends MSBDL_PurcReg_MC_A.Chk03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			if (!hasErr()) {
				// 仕入実績サービスのチェック処理
				callPurcChk03();
			}
			
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			
			// 入荷進捗を行ロック
			msgL.addAll(lockArrPrAndChkUpdCntr(up0(), up1()));
			
			if (msgL.size() > 0) {
				return msgL;
			}

			// 仕入実績ヘッダを行ロック
			MST_PURC_ACT_R lockedR = MST_PURC_ACT_R.create("T");
			msgL.addAll(lockPurcActAndChkUpdCntr(lockedR));
			
			if (msgL.size() > 0) {
				return msgL;
			}

			// 補完
			cmplUpParamInTranData();
			
			msgL.addAll(checkDAC());

			return msgL;
		}
		protected MCMessageList checkDAC() {
			// 更新前DACチェック
			return checkWritableDptCdDac(up0(), Chk01_HdrR.$purc_dpt_cd);
		}
		
		/**
		 * 仕入実績ヘッダのロックと、更新カウンタチェックを行います。
		 * @param lockedR 
		 * @return メッセージリスト
		 */
		protected MCMessageList lockPurcActAndChkUpdCntr(MST_PURC_ACT_R lockedR) {
			MCMessageList msgL = new MCMessageList();

			dbSelectKeyForUpdateNoWait("MSBDL0140_MST_PURC_ACT_S03", lockedR,
					MCQueryApiBuilder.create(lockedR), up0());

			if (isNull(lockedR.po_no())) {
				msgL.addAll(checkUpdCntrNE(up0(), Chk01_HdrR.$purc_act_upd_cntr, lockedR));
			}
			
			return msgL;
		}
		
		/**
		 * 仕入実績登録サービスの更新前チェック（共通）を実行する
		 */
		protected void callPurcChk03() {
			
			MSBDL_PurcActRegService.Purc_Chk03 ope = MSBDL_PurcActRegService.crtPurc_Chk03();
			
			setPurcChk03Up(ope, up0(), up1(), up2());
			if (isSame(ope.up0().size(), 0)) {
				return;
			}

			setDataCrudTyp(ope);
			ope.exec();
			
			up0().err_flg(ope.down0().get(0).err_flg());
			copyErrFlg(up1(), ope.down1());
			copyErrFlg(up2(), ope.down2());
			setPurcChk03Down(ope, up0(), up1(), up2());
			
		}
	
		
		protected void setDataCrudTyp(MSBDL_PurcActRegService.Purc_Chk03 ope) {
			ope.up0().setString(Purc_Ins01_HdrR.$data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value());
			ope.up1().setString(Purc_Ins01_HdrR.$data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value());
			ope.up2().setString(Purc_Ins01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value());
		}
		
		protected void cmplUpParamInTranData() {
			
			cmplUpInPurcAct();
			
			cmplUpInArrSchd();
		}
		
		/**
		 * 仕入実績ヘッダからヘッダ電文を補完する
		 */
		protected void cmplUpInPurcAct() {
			MST_PURC_ACT_R purcH = MST_PURC_ACT_R.create("T");
			MCQueryApiBuilder purcH_bldr = MCQueryApiBuilder.create(purcH);
			MCTempView S1V1 = createTempView("V1");
			MST_PURC_ACT_R S2 = MST_PURC_ACT_R.create("S2");

			purcH_bldr.addWhereWithAnd(
							exists(subQuery()
									.select(value(1)).from(subQuery()
													.select(S2.purc_act_no,
															max(S2.purc_act_seq).as("max_seq"))
													.from(S2)
													.where(S2.purc_act_no.eq(bind("purc_act_no")))
													.groupBy(S2.purc_act_no).view(S1V1))
									.where(purcH.purc_act_no.eq(S1V1.pr(S2.purc_act_no))
											.and(purcH.purc_act_seq.eq(S1V1.pr("max_seq"))))));
			dbSelect("MSBDL0140_MST_PURC_ACT_S04", purcH, purcH_bldr, up0());
			copy(up0(), purcH, createMap_Chk01_HdrR_MST_PURC_ACT_R());
		}
		
		/**
		 * 入荷予定から入荷パタン区分を補完する
		 */
		protected void cmplUpInArrSchd() {
			// 入荷予定から入荷パタン区分を補完
			MCList<MST_ARR_SCHD_R> arrSchdL = MCList.create(MST_ARR_SCHD_R.class);
			MST_ARR_SCHD_R arrSchdL_t = MST_ARR_SCHD_R.create("T");
			MCQueryApiBuilder arrSchdL_bldr = MCQueryApiBuilder.create(arrSchdL_t);
			arrSchdL_bldr.addWhereWithAnd(arrSchdL_t.arr_schd_no.eq(bind("arr_schd_no")));
			dbSelect("MSBDL0140_MST_ARR_SCHD_S01", arrSchdL, arrSchdL_bldr, up1());
			MCIndexKey arrSchdKey = arrSchdL.createIndex(MST_ARR_SCHD_R.$arr_schd_no);
			for (Chk01_DtlR up1Row : up1()) {
				MST_ARR_SCHD_R arrSchdRow = arrSchdL.getFirst(arrSchdKey, up1Row.arr_schd_no());
				if (!isNull(arrSchdRow)) {
					up1Row.arr_ptn_typ(arrSchdRow.arr_ptn_typ());
				}
			}
		}
		
		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
			down2().setAll(up2());			
		}
		
		/**
		 * RowMapper
		 * 仕入実績ヘッダ(MST_PURC_ACT_R) -> 上り電文(Chk01_HdrR)
		 */
		protected Map_Chk01_HdrR_MST_PURC_ACT_R<Chk01_HdrR,MST_PURC_ACT_R> createMap_Chk01_HdrR_MST_PURC_ACT_R() {
			return new Map_Chk01_HdrR_MST_PURC_ACT_R<Chk01_HdrR, MST_PURC_ACT_R>();
		}

		public class Map_Chk01_HdrR_MST_PURC_ACT_R<D extends Chk01_HdrR, S extends MST_PURC_ACT_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk01_HdrR.$po_no, MST_PURC_ACT_R.$po_no);
				addColumnPathMap(Chk01_HdrR.$trd_cd, MST_PURC_ACT_R.$trd_cd);
				addColumnPathMap(Chk01_HdrR.$trd_ptn_typ, MST_PURC_ACT_R.$trd_ptn_typ);
				addColumnPathMap(Chk01_HdrR.$ac_ym, MST_PURC_ACT_R.$ac_ym);
				addColumnPathMap(Chk01_HdrR.$purc_act_no, MST_PURC_ACT_R.$purc_act_no);
				addColumnPathMap(Chk01_HdrR.$purc_act_seq, MST_PURC_ACT_R.$purc_act_seq);
				addColumnPathMap(Chk01_HdrR.$purc_dt, MST_PURC_ACT_R.$purc_dt);
				addColumnPathMap(Chk01_HdrR.$ac_dt, MST_PURC_ACT_R.$ac_dt);
				addColumnPathMap(Chk01_HdrR.$pay_basis_dt, MST_PURC_ACT_R.$pay_basis_dt);
				addColumnPathMap(Chk01_HdrR.$sppl_cd, MST_PURC_ACT_R.$sppl_cd);
				addColumnPathMap(Chk01_HdrR.$purc_usr_cd, MST_PURC_ACT_R.$purc_usr_cd);
				addColumnPathMap(Chk01_HdrR.$purc_dpt_cd, MST_PURC_ACT_R.$purc_dpt_cd);
				addColumnPathMap(Chk01_HdrR.$wg_cd, MST_PURC_ACT_R.$wg_cd);
				addColumnPathMap(Chk01_HdrR.$trd_cur_cd, MST_PURC_ACT_R.$trd_cur_cd);
				addColumnPathMap(Chk01_HdrR.$xrate, MST_PURC_ACT_R.$xrate);
				addColumnPathMap(Chk01_HdrR.$base_cur_cd, MST_PURC_ACT_R.$base_cur_cd);
				addColumnPathMap(Chk01_HdrR.$ptax_cur_cd, MST_PURC_ACT_R.$ptax_cur_cd);
				addColumnPathMap(Chk01_HdrR.$ptax_dt, MST_PURC_ACT_R.$ptax_dt);
				addColumnPathMap(Chk01_HdrR.$ptax_xrate, MST_PURC_ACT_R.$ptax_xrate);
				addColumnPathMap(Chk01_HdrR.$asppl_cd, MST_PURC_ACT_R.$asppl_cd);
				addColumnPathMap(Chk01_HdrR.$bsppl_cd, MST_PURC_ACT_R.$bsppl_cd);
				addColumnPathMap(Chk01_HdrR.$psppl_cd, MST_PURC_ACT_R.$psppl_cd);
				addColumnPathMap(Chk01_HdrR.$cred_cd, MST_PURC_ACT_R.$cred_cd);
				addColumnPathMap(Chk01_HdrR.$trd_rmrks, MST_PURC_ACT_R.$trd_rmrks);
				addColumnPathMap(Chk01_HdrR.$intr_rmrks, MST_PURC_ACT_R.$intr_rmrks);
				addColumnPathMap(Chk01_HdrR.$sub_char1, MST_PURC_ACT_R.$sub_char1);
				addColumnPathMap(Chk01_HdrR.$sub_char2, MST_PURC_ACT_R.$sub_char2);
				addColumnPathMap(Chk01_HdrR.$sub_char3, MST_PURC_ACT_R.$sub_char3);
				addColumnPathMap(Chk01_HdrR.$tterm_cd1, MST_PURC_ACT_R.$tterm_cd1);
				addColumnPathMap(Chk01_HdrR.$tterm_rmrks1, MST_PURC_ACT_R.$tterm_rmrks1);
				addColumnPathMap(Chk01_HdrR.$tterm_cd2, MST_PURC_ACT_R.$tterm_cd2);
				addColumnPathMap(Chk01_HdrR.$tterm_rmrks2, MST_PURC_ACT_R.$tterm_rmrks2);
				addColumnPathMap(Chk01_HdrR.$tterm_cd3, MST_PURC_ACT_R.$tterm_cd3);
				addColumnPathMap(Chk01_HdrR.$tterm_rmrks3, MST_PURC_ACT_R.$tterm_rmrks3);
			}
		}
	}
	/**
	 * 上り電文を編集する
	 */
	protected void editUp(Chk01_HdrR up0, MCList<Chk01_DtlR> up1, MCList<Chk01_IoR> up2) {

		up1.forEach(dest -> {
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
	/**
	 * 上り電文(明細)を発注明細で補完します
	 */
	protected void cmplDtlParamInPoD(Chk01_DtlR dtlRow) {
		
		MST_PO_D_R poDCcRow = getPoDCc().get(dtlRow.po_d_no());
		
		dtlRow.mfg_loc_cd(poDCcRow.mfg_loc_cd());
		dtlRow.bom_ptn(poDCcRow.bom_ptn());
		dtlRow.rqst_avl_rqst_dt(poDCcRow.rqst_avl_rqst_dt());
		
		dtlRow.itm_cd(poDCcRow.itm_cd());
		dtlRow.itm_sub1(poDCcRow.itm_sub1());
		dtlRow.itm_sub2(poDCcRow.itm_sub2());
		dtlRow.itm_sub3(poDCcRow.itm_sub3());
		dtlRow.maker_cd(poDCcRow.maker_cd());
		dtlRow.sno1(poDCcRow.sno1());
		dtlRow.sno2(poDCcRow.sno2());
		dtlRow.sno3(poDCcRow.sno3());
		dtlRow.sno4(poDCcRow.sno4());
		dtlRow.drct_dlv_typ(poDCcRow.drct_dlv_typ());
		dtlRow.scst_cd(poDCcRow.dlv_cd());
		dtlRow.sundry_itm_flg(poDCcRow.sundry_itm_flg());
		if (!poDCcRow.sundry_itm_flg()) {
			dtlRow.itm_nm(null);
			dtlRow.iv_itm_nm(null);
		}
		dtlRow.sppl_itm_cd(poDCcRow.sppl_itm_cd());
		dtlRow.sppl_itm_nm(poDCcRow.sppl_itm_nm());
		dtlRow.purc_id_typ(poDCcRow.purc_id_typ());

	}
	
	/**
	 * 基準単位数量・荷姿単位数量の補完処理
	 */
	protected void setBaseUnitQtyAndPackUnitQty(MCList<Chk01_DtlR> dtlL, MCList<Chk01_IoR> ioL) {
		// 詳細行検索用のインデックスを作成
		MCIndexKey idxIo = ioL.createIndex(Chk01_IoR.$dtl_peg_no); 
		
		// 明細の補完
		for (Chk01_DtlR dtlRow : dtlL) {
			
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
			
			// 明細行に紐付く、詳細行の補完
			for (Chk01_IoR ioRow : ioL.subList(idxIo, dtlRow.peg_no())) {
				
				// 基準単位
				ioRow.base_unit_cd(dtlRow.base_unit_cd());
				
				// 基準単位数量
				MCNumber baseUnitQtyIo = convToBaseUnit(ioRow.trd_unit_qty(), ioRow.trd_unit_conv_base_qty(),	
						ioRow.trd_unit_conv_qty(), dtlRow.base_unit_dec_place(), dtlRow.base_unit_rnd_typ());
				ioRow.base_unit_qty(baseUnitQtyIo);
				
				// 荷姿単位・荷姿単位数量
				if (ioRow.pack_flg()) {
					ioRow.pack_unit_cd(ioRow.trd_unit_cd());
					ioRow.pack_unit_qty(ioRow.trd_unit_qty());
				}
				else {
					ioRow.pack_unit_cd(ioRow.base_unit_cd());
					ioRow.pack_unit_qty(ioRow.base_unit_qty());
				}
			}
			
		}
		
		
	}
	
	/**
	 * 条件付チェック
	 * @return メッセージリスト
	 */
	protected MCMessageList checkInCnd(Chk01_HdrR hdr, MCList<Chk01_DtlR> dtlL, MCList<Chk01_IoR> ioL) {
		
		MCMessageList msgL = new MCMessageList();
		
		MCIndexKey idxKey = ioL.createIndex(Chk01_IoR.$dtl_peg_no);
		
		boolean havPo = false;
		if(isNull(hdr.po_no())) {
			havPo = false;
		}
		else {
			havPo = true;
		}
		
		for (Chk01_DtlR dtlRow : dtlL) {
			
			// 「新規」と「更新」を対象に行う
			if (MAC_DATA_CRUD_TYP.isDEL(dtlRow.data_crud_typ())) {
				continue;
			}
			
			if (dtlRow.sundry_itm_flg()) {
				// 品名
				msgL.addAll(check(dtlRow, Chk01_DtlR.$itm_nm, new FXUCL_RequiredValidater()));
				if (hdr.sppl_iv_flg()) {
					// 輸入用品名
					msgL.addAll(check(dtlRow, Chk01_DtlR.$iv_itm_nm, new FXUCL_RequiredValidater()));
				}
			}
			if (MAC_ASSET_MNG_TYP.isNOT_MNG(dtlRow.asset_mng_typ())
					|| MAC_TRD_PTN_TYP.isPURC_XPNS(hdr.trd_ptn_typ()) 
					|| MAC_TRD_PTN_TYP.isPURC_DSCNT(hdr.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPURC_DSCNT_XPNS(hdr.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPURC_XTRA(hdr.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPURC_XTRA_XPNS(hdr.trd_ptn_typ())) {
				// 理由ＣＤ
				msgL.addAll(check(dtlRow, Chk01_DtlR.$purc_rsn_cd, new FXUCL_RequiredValidater()));
			}
			if (dtlRow.xpns_purc_flg() && !dtlRow.accpt_dfct_flg()) {
				// 負担部門ＣＤ
				msgL.addAll(check(dtlRow, Chk01_DtlR.$bd_dpt_cd, new FXUCL_RequiredValidater()));
			}
			
			if (!isNull(dtlRow.trd_cur_dscnt_amt())) {
				// 値引理由の必須チェック
				msgL.addAll(check(dtlRow, Chk01_DtlR.$dscnt_rsn_cd, new FXUCL_RequiredValidater()));
				// 単価「0」指定で、値引額が入力されていないかチェック
				msgL.addAll(checkDscntAmt(dtlRow, Chk01_DtlR.$trd_cur_upri, Chk01_DtlR.$trd_cur_dscnt_amt));
			}
			
			if (!dtlRow.accpt_dfct_flg() && !dtlRow.ncv_flg() && !isNull(dtlRow.trd_cur_upri()) && !dtlRow.trd_cur_upri().isZero()) {
				msgL.addAll(check(dtlRow, Chk01_DtlR.$pay_crryovr_times, new FXUCL_RequiredValidater()));
				msgL.addAll(check(dtlRow, Chk01_DtlR.$trd_cur_dscnt_amt, new FXUCL_PositiveValidater()));
			}
	
			
			MCList<Chk01_IoR> tgtIoL = ioL.subList(idxKey, dtlRow.peg_no());
			
			for (Chk01_IoR ioRow : tgtIoL) {
				
				// 「新規」と「更新」を対象にする
				if (MAC_DATA_CRUD_TYP.isDEL(ioRow.data_crud_typ())) {
					continue;
				}
				
				if (ioRow.cont_fctr_flg()) {
					msgL.addAll(check(ioRow, Chk01_IoR.$purc_cont_qty, new FXUCL_RequiredValidater()));
				}
				
				if (dtlRow.sync_flg()) {
					if (!havPo && dtlRow.bp_lot_flg() ) {
						// 業者ロット
						msgL.addAll(check(ioRow, Chk01_IoR.$bp_lot_no, new FXUCL_RequiredValidater()));
					}					
					if (!MAC_LOT_MNG_TYP.isNOT_MNG(dtlRow.lot_mng_typ()) && MAC_LOT_NO_TYP.isMANUAL(dtlRow.lot_no_typ())) {
						// ロットＮＯ
						msgL.addAll(check(ioRow, Chk01_IoR.$lot_no, new FXUCL_RequiredValidater()));
					}
					if (!MAC_LOT_MNG_TYP.isNOT_MNG(dtlRow.sublot_mng_typ()) && MAC_LOT_NO_TYP.isMANUAL(dtlRow.sublot_no_typ())) {
						// サブロットＮＯ
						msgL.addAll(check(ioRow, Chk01_IoR.$sublot_no, new FXUCL_RequiredValidater()));
					}
				}
				
			}

			
		}
		
		return msgL;
		
	}
	
	/**
	 * 指定されたRowに格納されている税込金額を取得する
	 * @param row
	 * @return 税込金額
	 */
	protected MCNumber getIncTaxAmt(MCRow row) {
		return row.getNumberNE("inc_tax_amt");
	}
	
	/**
	 * 入荷進捗に対して行ロック処理、更新カウンタチェックを行う
	 * @param chkH ヘッダチェック用上り電文
	 * @param chkDtl 明細行チェック用上り電文
	 * @return メッセージリスト
	 */
	protected MCMessageList lockArrPrAndChkUpdCntr(Chk01_HdrR chkH, MCList<Chk01_DtlR> chkDtl) {
		
		// 計画外の仕入実績の新規登録の場合は、更新カウンタチェック、行ロック処理は行わない
		if (isNull(chkH.po_no())) {
			return null;
		}
		MCMessageList msgL = new MCMessageList();
		
		MCList<MST_ARR_PR_R> dblArrPr = MCList.create(MST_ARR_PR_R.class);
		dbSelectKeyForUpdateNoWait("MSBDL0140_MST_ARR_PR_S01", dblArrPr,
				MCQueryApiBuilder.create(MST_ARR_PR_R.create("T")), chkDtl);
		MCIndexKey idxKey = dblArrPr.createIndex(MST_ARR_PR_R.$arr_pr_no);
		
		for (Chk01_DtlR chkR : chkDtl) {
			// 発注あり仕入の場合でも、行追加された明細は入荷進捗がないので、カウンタチェック対象外
			if (!isNull(chkR.arr_pr_no())) {
				MST_ARR_PR_R lockR = dblArrPr.getFirst(idxKey, chkR.arr_pr_no());
				msgL.addAll(checkUpdCntrNE(chkR, Chk01_DtlR.$arr_pr_upd_cntr, lockR));
				// 排他エラーが発生したら、原因行をヘッダに設定し、処理を抜ける
				if (msgL.size() > 0) {
					MCMessage msg = msgL.get(0);
					msg.setCauseRow(chkH, Chk01_HdrR.$purc_act_no);
					chkH.err_flg(true);
					break;
				}
			}
		}
		
		return msgL;
		
	}
	
	protected void complProcUpriAmt(Chk01_HdrR hdrR, MCList<Chk01_DtlR> dtlL) {
		for (Chk01_DtlR dtlR : dtlL) {
			if (dtlR.outsrc_flg()) {
				if (isNull(dtlR.trd_cur_proc_upri())) {
					dtlR.trd_cur_proc_upri(MCNumber.ZERO);
					dtlR.trd_cur_proc_amt(MCNumber.ZERO);
					dtlR.base_cur_proc_upri(MCNumber.ZERO);
					dtlR.base_cur_proc_amt(MCNumber.ZERO);
					if (!isNull(hdrR.ptax_xrate())) {
						dtlR.ptax_cur_proc_upri(MCNumber.ZERO);
						dtlR.ptax_cur_proc_amt(MCNumber.ZERO);
					}
				}
				if (isNull(dtlR.trd_cur_tax_amt())) {
					dtlR.trd_cur_tax_amt(MCNumber.ZERO);
					dtlR.base_cur_tax_amt(MCNumber.ZERO);
					if (!isNull(hdrR.ptax_xrate())) {
						dtlR.ptax_cur_tax_amt(MCNumber.ZERO);
					}
				}
			}
		}
	}
	
	/**
	 * Ins01オペレーション.<p>
	 *
	 */
	public class Ins01 extends MSBDL_PurcReg_MC_A.Ins01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			setRowStatus();
			
			setDataCrudTyp(up0(), up1(), up2());
			
			editUp(up1(), up2(), down2());
			replaceParam();			
			// チェック・補完処理
			callThisChk01();
			
			cmplGdLotForYetArr();
			// チェック・補完処理でエラーがあった場合は処理中断
			throwUpdErr();
			
			// 仕入実績登録SV呼出
			callPurcActRegSv();
			
			// 下り電文セット
			setDown();

		}

		protected void setRowStatus() {
			up0().setStatus(CREATE);
			up1().setStatus(CREATE);
			up2().setStatus(CREATE);
		}
		
		/**
		 * 画面オペレーションからのチェック
		 */
		protected void callThisChk01() {
			
			// チェック・補完処理を呼出し
			MSBDL_PurcReg.Chk01 chk01Ope = MSBDL_PurcReg.crtChk01();
			MCRow.copyall(chk01Ope.up0(), up0());
			chk01Ope.up1().setAll(up1());
			chk01Ope.up2().setAll(up2());
			chk01Ope.exec();
			
			// チェック結果を取得
			MCRow.copyall(up0(), chk01Ope.down0());
			up1().setAll(chk01Ope.down1());
			up2().setAll(chk01Ope.down2());
		
		}
		
		/**
		 * 仕入実績登録サービス呼出
		 */
		protected void callPurcActRegSv() {
			
			// 表示順の設定
			setDispSeq(up1());
			
			MSBDL_PurcActRegService.Purc_Ins01 ope = MSBDL_PurcActRegService.crtPurc_Ins01();

			setUpPurcActRegSv(ope, up0(), up1(), up2());
			ope.exec();
			
			setDownPurcActRegSv(ope);
		}
		/**
		 * 仕入実績登録サービス（登録）の上り電文を設定する
		 * @param ope
		 */
		protected void setUpPurcActRegSv(MSBDL_PurcActRegService.Purc_Ins01 ope, Chk01_HdrR up0, MCList<Chk01_DtlR>up1, MCList<Chk01_IoR>up2) {
			Purc_Ins01_HdrR hdrR = Purc_Ins01_HdrR.create();
			copy(hdrR, up0, createMap_Purc_Ins01_HdrR_Chk01_HdrR());
			
			ope.up0().io_make_flg(true);
			ope.up0().arr_act_flg(true);
			ope.up0().purc_form_flg(true);
			ope.up1().add(hdrR);
			Map_Purc_Ins01_DtlR_Chk01_DtlR<Purc_Ins01_DtlR,Chk01_DtlR> map = createMap_Purc_Ins01_DtlR_Chk01_DtlR();
			map.setWithHdrR(hdrR);
			addAll(ope.up2(), up1, map);
			addAll(ope.up3(), up2, createMap_Purc_Ins01_IoR_Chk01_IoR());
		}
		
		/**
		 * 仕入実績登録サービスの実行結果を反映する
		 * @param ope
		 */
		protected void setDownPurcActRegSv(MSBDL_PurcActRegService.Purc_Ins01 ope) {
			// 仕入実績NO, 明細NO, 実績受払NOを画面に戻す
			up0().purc_act_no(ope.down0().get(0).purc_act_no());
			up0().purc_act_seq(ope.down0().get(0).purc_act_seq());
			up0().purc_act_rev(ope.down0().get(0).purc_act_rev());
			
			String[] destColsD = new String[] {Chk01_DtlR.$purc_act_d_no};
			String[] srcColsD = new String[] {Purc_Ins01_DtlR.$purc_act_d_no};
			copyByPegNo(up1(), destColsD, ope.down1(), srcColsD);
			
			String[] destColsIo = new String[] {Chk01_IoR.$purc_act_io_no};
			String[] srcColsIo = new String[] {Purc_Ins01_IoR.$purc_act_io_no};
			copyByPegNo(up2(), destColsIo, ope.down2(), srcColsIo);
		}
		
		/**
		 * 下り電文セット
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
			// up2の属性を変更しているため、setAllで属性ごとRowを追加せず、copyByPegNoで下り電文に必要な情報を設定する
			String[] downCols = new String[] {Chk01_IoR.$purc_act_io_no, Chk01_IoR.$purc_act_io_seq};
			copyByPegNo(down2(), downCols, up2(), downCols);
		}
		
		/**
		 * 上り電文の差し替え
		 */
		protected void replaceParam() {
			MCIndexKey idxUp2 = up2().createIndex(Chk01_IoR.$dtl_peg_no);
			for (Chk01_DtlR r : up1()) {
				MCList<Chk01_IoR> subL = up2().subList(idxUp2, r.peg_no());
				
				if (isNull(subL)) {
					continue;
				}
				if (isYetArr(r)) {
					// 未着の仕入登録時は在庫情報を補完
					if (isNull(subL.get(0).arr_act_no())) {
						r.gd_cd(r.tmp_gd_cd());
						r.quality_typ(r.tmp_quality_typ());
						for (Chk01_IoR dtl2R : subL) {
							dtl2R.quality_typ(dtl2R.tmp_quality_typ());
							dtl2R.stk_insp_typ(dtl2R.tmp_stk_insp_typ());
							dtl2R.stk_id_typ(dtl2R.tmp_stk_id_typ());
							dtl2R.gd_cd(dtl2R.from_gd_cd());
						}
					}
				}
				else {
					if (isUnplanned(r)) {
						// 計画外の場合
						String qualityTyp = MAC_QUALITY_TYP.GOOD.value();
						r.quality_typ(qualityTyp);
						subL.setStringNE(Chk01_IoR.$quality_typ, r.quality_typ());
						subL.setStringNE(Chk01_IoR.$stk_insp_typ, MSC_STK_INSP_TYP.FIN.value());
						subL.setStringNE(Chk01_IoR.$stk_id_typ, MSC_STK_ID_TYP.COSTK.value());
					}
					if (!isNull(r.tmp_quality_typ())) {
						// 同時計上しない予定だったが、同時計上で仕入する場合
						r.quality_typ(r.tmp_quality_typ());
						for (Chk01_IoR ioR : subL) {
							ioR.quality_typ(ioR.tmp_quality_typ());
							ioR.stk_id_typ(ioR.tmp_stk_id_typ());
							ioR.stk_insp_typ(ioR.tmp_stk_insp_typ());
						}
					}
				}
			}
		}
		
		protected boolean isYetArr(Chk01_DtlR dtlR) {
			return !dtlR.sync_flg() && !isNull(dtlR.purc_schd_no()) && !isNull(dtlR.arr_schd_no());
		}
		
		protected boolean isUnplanned(Chk01_DtlR dtlR) {
			return isNull(dtlR.purc_schd_no()) || isNull(dtlR.arr_schd_no());
		}
		
		/**
		 * 未着管理の場合に、各明細の格付ＣＤ、ロットＮＯ、サブロットＮＯを仕入未確定文字列で補完します。
		 */
		protected void cmplGdLotForYetArr() {
			for (Chk01_DtlR r : up1()) {
				if(r.sync_flg()) {
					continue;
				}
				
				boolean existArrAct = false;
				MCList<Chk01_IoR> ioL = up2().subList(Chk01_IoR.$dtl_peg_no, r.peg_no());
				for (Chk01_IoR ioR : ioL) {
					if (!isNull(ioR.arr_act_no())) {
						existArrAct = true;
					}
				}
				
				if (!existArrAct) {
					r.gd_cd(MSC_PURC_UNFIX_STR.UNFIXED.value());
					if (MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())) {
						r.lot_no(MSC_PURC_UNFIX_STR.UNFIXED.value());
						r.sublot_no(MSC_PURC_UNFIX_STR.UNFIXED.value());
					}
				}
				
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 */
	public class Upd01 extends MSBDL_PurcReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			
			setRowStatus();
			
			setDataCrudTyp(up0(), up1(), up2());
			
			editUp(up1(), up2(), down2());
			replaceParam();
			// チェック
			callThisChk02();
			
			// チェック・補完処理でエラーがあった場合は処理中断
			throwUpdErr();
			
			// 仕入実績SV実行
			callPurcActRegSv();
			
			setDown();
		}
		
		/**
		 * 行ステータス設定
		 */
		protected void setRowStatus() {
			up0().setStatus(MODIFY);
			for (Chk01_DtlR dtlRow : up1()) {
				if (dtlRow.getStatus() == NONE) {
					dtlRow.setStatus(MODIFY);
				}
			}
			for (Chk01_IoR ioRow : up2()) {
				if (ioRow.getStatus() == NONE) {
					Chk01_DtlR dtlRow = up1().getFirst(Chk01_DtlR.$peg_no, ioRow.dtl_peg_no());
					ioRow.setStatus(dtlRow.getStatus());
				}
			}
		}
		

		
		/**
		 * 画面オペレーションからのチェック
		 */
		protected void callThisChk02() {
			// チェック・補完処理を呼出し
			MSBDL_PurcReg.Chk02 ope = MSBDL_PurcReg.crtChk02();
			MCRow.copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			ope.up2().setAll(up2());
			ope.exec();
			
			// チェック結果を取得
			MCRow.copyall(up0(), ope.down0());
			up1().setAll(ope.down1());
			up2().setAll(ope.down2());
			
		}
		
		/**
		 * 仕入実績登録サービス呼出
		 */
		protected void callPurcActRegSv() {
			
			// 表示順の設定
			setDispSeq(up1());
			
			MSBDL_PurcActRegService.Purc_Upd01 ope = MSBDL_PurcActRegService.crtPurc_Upd01();

			setUpPurcActRegSv(ope, up0(), up1(), up2());
			ope.exec();
			
			setDownPurcActRegSv(ope);
		}
		
		/**
		 * 仕入実績登録サービス（訂正）の上り電文を設定する
		 * @param ope
		 */
		protected void setUpPurcActRegSv(MSBDL_PurcActRegService.Purc_Upd01 ope, Chk01_HdrR up0, MCList<Chk01_DtlR>up1, MCList<Chk01_IoR>up2) {
			Purc_Ins01_HdrR hdrR = Purc_Ins01_HdrR.create();
			copy(hdrR, up0(), createMap_Purc_Ins01_HdrR_Chk01_HdrR());
			
			ope.up0().io_make_flg(true);
			ope.up0().arr_act_flg(true);
			ope.up0().purc_form_flg(true);
			ope.up1().add(hdrR);
			Map_Purc_Ins01_DtlR_Chk01_DtlR<Purc_Ins01_DtlR,Chk01_DtlR> map = createMap_Purc_Ins01_DtlR_Chk01_DtlR();
			map.setWithHdrR(hdrR);
			addAll(ope.up2(), up1(), map);
			addAll(ope.up3(), up2(), createMap_Purc_Ins01_IoR_Chk01_IoR());
		}
		protected void setDownPurcActRegSv(MSBDL_PurcActRegService.Purc_Upd01 ope) {
			// 仕入実績NO, 明細NO, 実績受払NOを画面に戻す
			up0().purc_act_no(ope.down0().get(0).purc_act_no());
			up0().purc_act_seq(ope.down0().get(0).purc_act_seq());
			up0().purc_act_rev(ope.down0().get(0).purc_act_rev());

			String[] destColsD = new String[] {Chk01_DtlR.$purc_act_d_no};
			String[] srcColsD = new String[] {Purc_Ins01_DtlR.$purc_act_d_no};
			copyByPegNo(up1(), destColsD, ope.down1(), srcColsD);
			
			String[] destColsIo = new String[] {Chk01_IoR.$purc_act_io_no};
			String[] srcColsIo = new String[] {Purc_Ins01_IoR.$purc_act_io_no};
			copyByPegNo(up2(), destColsIo, ope.down2(), srcColsIo);
		}

		/**
		 * 下り電文セット
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
			// up2の属性を変更しているため、setAllで属性ごとRowを追加せず、copyByPegNoで下り電文に必要な情報を設定する
			String[] downCols = new String[] {Chk01_IoR.$purc_act_io_no, Chk01_IoR.$purc_act_io_seq};
			copyByPegNo(down2(), downCols, up2(), downCols);
		}
		/**
		 * 上り電文の差し替え
		 */
		protected void replaceParam() {
			MCIndexKey idxUp2 = up2().createIndex(Chk01_IoR.$dtl_peg_no, Chk01_IoR.$purc_act_io_no);
			for (Chk01_DtlR r : up1()) {
				if (isNull(r.purc_schd_no()) && isNull(r.purc_act_d_no())) {
					// 計画外の場合
					String qualityTyp = MAC_QUALITY_TYP.GOOD.value();
					r.quality_typ(qualityTyp);
				}
				MCList<Chk01_IoR> subL = up2().subList(idxUp2, r.peg_no(), null);
				for (Chk01_IoR ioR : subL) {
					if (isNullAnd(ioR.quality_typ(), ioR.stk_insp_typ(), ioR.stk_id_typ())) {
						ioR.quality_typ(r.quality_typ());
						ioR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
						ioR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
					}
				}
			}
		}
	}
	
	/**
	 * Del01オペレーション.<p>
	 *
	 */
	public class Del01 extends MSBDL_PurcReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			
			setRowStatus();
			
			setDataCrudTyp(up0(), up1(), up2());
			
			editUp(up1(), up2());
			
			// チェック
			callThisChk03();
			
			// チェック・補完処理でエラーがあった場合は処理中断
			throwCanErr();
			
			// 仕入実績サービス(削除)実行
			callPurcActRegSv();
			
		}
		
		protected void setRowStatus() {
			up0().setStatus(DELETE);
			up1().setStatus(DELETE);
			up2().setStatus(DELETE);
		}
		
		/**
		 * 詳細の行番号を明細の行番号で置き換える
		 * @param up1L
		 * @param up2L
		 */
		protected void editUp(MCList<Chk01_DtlR> up1L, MCList<Chk01_IoR> up2L) {
			MCIndexKey up1Key = up1L.createIndex(Chk01_DtlR.$peg_no);
			for(Chk01_IoR up2R : up2L) {
				Chk01_DtlR up1R = up1L.getFirst(up1Key, up2R.dtl_peg_no());
				if(!isNull(up1R)) {
					up2R.setGUIIndex(up1R.getGUIIndex());
				}
			}
		}

		/**
		 * 削除前チェック呼出
		 */
		protected void callThisChk03() {
			
			// チェック・補完処理を呼出し
			MSBDL_PurcReg.Chk03 ope = MSBDL_PurcReg.crtChk03();
			MCRow.copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			ope.up2().setAll(up2());
			ope.exec();
			
			// チェック結果を取得
			MCRow.copyall(up0(), ope.down0());
			up1().setAll(ope.down1());
			up2().setAll(ope.down2());
			
		}
		/**
		 * 仕入実績登録サービス呼出
		 */
		protected void callPurcActRegSv() {
			
			// 表示順の設定
			setDispSeq(up1());
			
			MSBDL_PurcActRegService.Purc_Del01 ope = MSBDL_PurcActRegService.crtPurc_Del01();
			setUpPurcActRegSv(ope, up0(), up1(), up2());
			ope.exec();
			
		}
		/**
		 * 仕入実績登録サービス（登録）の上り電文を設定する
		 * @param ope
		 */
		protected void setUpPurcActRegSv(MSBDL_PurcActRegService.Purc_Del01 ope, Chk01_HdrR up0, MCList<Chk01_DtlR>up1, MCList<Chk01_IoR>up2) {
			Purc_Ins01_HdrR hdrR = Purc_Ins01_HdrR.create();
			copy(hdrR, up0(), createMap_Purc_Ins01_HdrR_Chk01_HdrR());
			
			ope.up0().io_make_flg(true);
			ope.up0().arr_act_flg(true);
			ope.up1().add(hdrR);			
			addAll(ope.up2(), up1(), createMap_Purc_Ins01_DtlR_Chk01_DtlR());
			addAll(ope.up3(), up2(), createMap_Purc_Ins01_IoR_Chk01_IoR());
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 * 新規登録用の検索を行う。<br>
	 */
	public class Srch01 extends MSBDL_PurcReg_MC_A.Srch01 {
		MCList<MST_ARR_ACT_R> dblArrAct = MCList.create(MST_ARR_ACT_R.class);
		MCList<MST_PURC_ACT_IO_R> dblPurcActIo = MCList.create(MST_PURC_ACT_IO_R.class);
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			Srch01_HdrR srchHdr = Srch01_HdrR.create();
			MCList<Srch01_DtlR> srchDtlL = MCList.create(Srch01_DtlR.class);
			MCList<Srch01_IoR> srchIoL = MCList.create(Srch01_IoR.class);
			
			// ヘッダを検索
			up0().setDateNE("base_dt", getToday());
			int cnt = srchHdr(srchHdr);
			if (isSame(cnt, 0)) {
				return;
			}

			// インボイス取引対象の場合は、メッセージを出力し処理を中断する
			if (!isIvReg() && srchHdr.sppl_iv_flg()) {
				throw new MCAppException(new MCMessage(MSBDL0129, srchHdr.sppl_cd()));
			}
			
			// 基準通貨・納税通貨情報をヘッダに設定
			setBaseAndPtaxCurInf(srchHdr);
			
			// 最新の為替レート、納税為替レートを設定
			setLstRate(srchHdr);
			
			setDefaultApDpt(srchHdr);

			// 明細を取得
			cnt = srchDtl(srchDtlL);
			if (isSame(cnt, 0)) {
				return;
			}
			
			// 詳細取得
			cnt = srchIo(srchIoL);
			if (isSame(cnt, 0)) {
				return;
			}
			
			// 数量計算
			calcQty(srchIoL);
			calcQtyAndSplitDtl(srchHdr, srchDtlL, srchIoL);
			
			// 有効成分計算
			setCont(srchDtlL, srchIoL);
			
			// 金額計算
			calcAmt(srchHdr, srchDtlL);
			
			// その他編集
			editDown(srchHdr, srchDtlL, srchIoL);
			
			// 明細行、詳細行のソート
			sortDown(srchDtlL, srchIoL);
			
			// 下り電文設定
			setDown(srchHdr, srchDtlL, srchIoL);
			
		}
		
		
		/**
		 * 基準通貨・納税通貨の情報をヘッダ情報にセットします
		 * @param srchHdr 検索したヘッダ情報
		 */
		protected void setBaseAndPtaxCurInf(Srch01_HdrR srchHdr) {
			srchHdr.base_cur_cd(getBaseCur().cur_cd());
			srchHdr.base_cur_nm(getBaseCur().cur_nm());
			srchHdr.base_cur_upri_dec_place(getBaseCur().upri_dec_place());
			srchHdr.base_cur_amt_dec_place(getBaseCur().amt_dec_place());
			
			if (!isNull(getPtaxCur())) {
				srchHdr.ptax_cur_cd(getPtaxCur().cur_cd());
				srchHdr.ptax_cur_nm(getPtaxCur().cur_nm());
				srchHdr.ptax_cur_upri_dec_place(getPtaxCur().upri_dec_place());
				srchHdr.ptax_cur_amt_dec_place(getPtaxCur().amt_dec_place());
			}
		}
		
		/**
		 * ヘッダ取得
		 */
		protected int srchHdr(Srch01_HdrR srchHdr) {
			int cnt = executeQuery(srchHdr, MSBDL0140_MST_PO_S01(), up0());
			return cnt;
		}
		
		/**
		 * 明細取得
		 */
		protected int srchDtl(MCList<Srch01_DtlR> srchDtlL) {
			MCQueryPlan sql = MSBDL0140_MST_PURC_SCHD_S01();
			sql.addDynamicSQLInfo(getDtlWhere());
			int cnt = executeQuery(srchDtlL, sql, up0());
			if (cnt > 0) {
				MCList<MAM_TAX_R> taxL = MCList.create(MAM_TAX_R.class);
				dbSelectKey("MSBDL0140_MAM_TAX_S01", taxL,
						MCQueryApiBuilder.create(MAM_TAX_R.create("T")),
						srchDtlL.groupBy(MAM_TAX_R.$tax_cd));
				MCIndexKey key = taxL.createIndex(MAM_TAX_R.$tax_cd);
				for (Srch01_DtlR r : srchDtlL) {
					if (r.tax_fix_flg() || r.non_purc_flg()) {
						// 税指定オンの場合、発注時の税を画面に表示する
						r.tax_cd(r.src_tax_cd());
						r.tax_nm(r.src_tax_nm());
						r.tax_rate(r.src_tax_rate());
						r.inc_tax_flg(r.src_inc_tax_flg());
						r.tax_typ(r.src_tax_typ());
					}
					else {
						// 税指定オフの場合、運用日で取得した税を画面に表示する
						MAM_TAX_R taxR = taxL.getFirst(key, r.tax_cd());
						r.tax_cd(taxR.tax_cd());
						r.tax_nm(taxR.tax_nm());
						r.tax_rate(taxR.tax_rate());
						r.inc_tax_flg(taxR.inc_tax_flg());
						r.tax_typ(taxR.tax_typ());
					}
				}
			}
			return cnt;
		}
		protected MCDynamicSQLInfo getDtlWhere() {
			return MSBDL0140_MST_PURC_SCHD_S01_WHERE01();
		}
		
		/**
		 * 詳細取得
		 */
		protected int srchIo(MCList<Srch01_IoR> srchIoL) {
			MCQueryPlan sql = MSBDL0140_MST_PURC_SCHD_S02();
			sql.addDynamicSQLInfo(getIoWhere1());
			executeQuery(srchIoL, sql, up0());
			MCList<Srch01_IoR> d = srchIoL.createInstance();
			
			sql = MSBDL0140_MST_PURC_SCHD_S03();
			sql.addDynamicSQLInfo(getIoWhere2());
			executeQuery(d, sql, up0());
			srchIoL.addAll(d);
			setPegNo(srchIoL);
			return srchIoL.size();
		}
		protected MCDynamicSQLInfo getIoWhere1() {
			return MSBDL0140_MST_PURC_SCHD_S02_WHERE01();
		}
		protected MCDynamicSQLInfo getIoWhere2() {
			return MSBDL0140_MST_PURC_SCHD_S03_WHERE01();
		}
		/**
		 * 詳細の数量計算を行う
		 */
		protected void calcQty(MCList<Srch01_IoR> rl) {
			rl.forEach(r -> {
								
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

			});
		}
		
		/**
		 * 詳細行の数量から、明細行に表示する数量を求める
		 * <br>仕入明細ロット分割などにより明細行が分かれる場合は、検索された明細行の分割も行う
		 */
		protected void calcQtyAndSplitDtl(Srch01_HdrR srchHdr, MCList<Srch01_DtlR> srchDtlL, MCList<Srch01_IoR> srchIoL) {
			
			// ヘッダ紐付NO
			int hdr_peg_no = 0;
			
			// ユーティリティ実行用の引数電文
			MCList<ConvQtyAmtUtil_Calc01_HdrR> hdrParmLst = MCList.create(ConvQtyAmtUtil_Calc01_HdrR.class);
			MCList<ConvQtyAmtUtil_Calc01_Dtl2R> dtl2ParmLst = MCList.create(ConvQtyAmtUtil_Calc01_Dtl2R.class);
			
			// 明細下り電文を発注明細NO単位にグルーピングして、ユーティティの引数(ヘッダ)にする
			MCGroupByPolicy grpByPoD = new MCGroupByPolicy(Srch01_DtlR.$po_d_no,
					Srch01_DtlR.$src_trd_unit_cd,
					Srch01_DtlR.$src_trd_unit_qty,
					Srch01_DtlR.$base_unit_dec_place,
					Srch01_DtlR.$base_unit_rnd_typ,
					Srch01_DtlR.$src_trd_unit_conv_qty,
					Srch01_DtlR.$src_trd_unit_conv_base_qty
					);
			MCList<Srch01_DtlR> grpListByPoD = srchDtlL.groupBy(grpByPoD);
			MCIndexKey ioKey = srchIoL.createIndex(Srch01_IoR.$po_d_no);
			
			for (Srch01_DtlR dr : grpListByPoD) {
				ConvQtyAmtUtil_Calc01_HdrR hdrParmRow = ConvQtyAmtUtil_Calc01_HdrR.create();
				hdrParmRow.peg_no(hdr_peg_no++);
				hdrParmRow.slip_each_lot_typ(srchHdr.purc_slip_each_lot_typ());
				hdrParmRow.trd_unit_cd(dr.src_trd_unit_cd());
				hdrParmRow.trd_unit_qty(dr.src_trd_unit_qty());
				hdrParmRow.base_unit_dec_place(dr.base_unit_dec_place());
				hdrParmRow.base_unit_rnd_typ(dr.base_unit_rnd_typ());
				hdrParmRow.trd_unit_conv_qty(dr.src_trd_unit_conv_qty());
				hdrParmRow.trd_unit_conv_base_qty(dr.src_trd_unit_conv_base_qty());
				hdrParmLst.add(hdrParmRow);
				
				// 同じ発注明細ＮＯを持つ詳細下り電文をユーティリティの引数(詳細)に設定する
				MCList<Srch01_IoR> ioL = srchIoL.subList(ioKey, dr.po_d_no());
				
				for (Srch01_IoR ioR : ioL) {
					ConvQtyAmtUtil_Calc01_Dtl2R dtl2ParmRow = ConvQtyAmtUtil_Calc01_Dtl2R.create();
					
					dtl2ParmRow.hdr_peg_no(hdrParmRow.peg_no());
					dtl2ParmRow.peg_no(ioR.peg_no());
					dtl2ParmRow.lot_no(ioR.lot_no());
					dtl2ParmRow.sublot_no(ioR.sublot_no());
					dtl2ParmRow.trd_unit_qty(ioR.trd_unit_qty());
					dtl2ParmRow.trd_unit_cd(ioR.trd_unit_cd());
					dtl2ParmRow.trd_unit_conv_qty(ioR.trd_unit_conv_qty());
					dtl2ParmRow.trd_unit_conv_base_qty(ioR.trd_unit_conv_base_qty());
					dtl2ParmRow.schd_trd_unit_cd(ioR.schd_trd_unit_cd());
					dtl2ParmRow.schd_trd_unit_conv_qty(ioR.schd_trd_unit_conv_qty());
					dtl2ParmRow.schd_trd_unit_conv_base_qty(ioR.schd_trd_unit_conv_base_qty());
					dtl2ParmRow.schd_trd_unit_dec_place(ioR.schd_trd_unit_dec_place());
					dtl2ParmRow.schd_trd_unit_rnd_typ(ioR.schd_trd_unit_rnd_typ());
					setDtl2RowCalcQtyAndSplitDtl(dtl2ParmRow, ioR);
					
					dtl2ParmLst.add(dtl2ParmRow);
				}
			}
			
			// 数量計算(下段から上段を求める)を実行
			MSUCL_ConvQtyAmtUtil.ConvQtyAmtUtil_Calc01 ope = MSUCL_ConvQtyAmtUtil.crtConvQtyAmtUtil_Calc01();
			ope.up0().addAll(hdrParmLst);
			ope.up1().addAll(dtl2ParmLst);
			
			ope.exec();
			
			// 明細紐付NOを、紐付NOをキーにコピー
			String[] copyCols = {ConvQtyAmtUtil_Calc01_Dtl2R.$dtl_peg_no};
			copyByPegNo(srchIoL, copyCols, ope.down1(), copyCols);
			
			// ユーティリティ結果(明細)毎に処理
			MCList<Srch01_DtlR> editedSrchDtlL = MCList.create(Srch01_DtlR.class);
			MCIndexKey idxUtilRet1 = ope.down1().createIndex(ConvQtyAmtUtil_Calc01_Dtl2R.$dtl_peg_no);
			MCIndexKey idxSrchDtlL = srchDtlL.createIndex(Srch01_DtlR.$purc_schd_no);
			for (ConvQtyAmtUtil_Calc01_Dtl1R row : ope.down0()) {
				// ユーティリティ結果(詳細)より、グループNO(仕入予定NO)を取得する
				String purcSchdNo = (ope.down1().getFirst(idxUtilRet1, row.peg_no())).grp_no();
				
				// 仕入予定NOをキーに、検索済みの仕入予定を取得し、コピーを作成
				Srch01_DtlR purcSchdR = srchDtlL.getFirst(idxSrchDtlL, purcSchdNo).clone();
				
				// コピーにユーティリティ結果を上書き
				purcSchdR.peg_no(row.peg_no());
				purcSchdR.lot_no(row.lot_no());
				purcSchdR.sublot_no(row.sublot_no());
				purcSchdR.trd_unit_qty(row.trd_unit_qty());
				purcSchdR.trd_unit_cd(row.trd_unit_cd());
				
				editedSrchDtlL.add(purcSchdR);
			}
			
			srchDtlL.clear();
			srchDtlL.addAll(editedSrchDtlL);
			
			MCGroupByPolicy grpTrdUnit = new MCGroupByPolicy(Srch01_DtlR.$itm_cd, 
					Srch01_DtlR.$itm_sub1,Srch01_DtlR.$itm_sub2,Srch01_DtlR.$itm_sub3, Srch01_DtlR.$trd_unit_cd);
			MCList<Srch01_DtlR> itmUnitCnd = srchDtlL.groupBy(grpTrdUnit);
			
			MCList<MAVM_ITM_UNIT_R> itmUnit = MCList.create(MAVM_ITM_UNIT_R.class);
			MAVM_ITM_UNIT_R itmUnit_t = MAVM_ITM_UNIT_R.create("T");
			MCQueryApiBuilder itmUnit_bldr = MCQueryApiBuilder.create(itmUnit_t);
			MAM_UNIT_R itmUnit_t2 = MAM_UNIT_R.create("T2");
			itmUnit_bldr.addSelect(itmUnit_t2.unit_nm);
			itmUnit_bldr.addInnerJoin(itmUnit_t2, bracket( itmUnit_t.unit_cd.eq(itmUnit_t2.unit_cd)));
			itmUnit_bldr.addWhereWithAnd(itmUnit_t.itm_cd.eq(bind("itm_cd"))
					.and(itmUnit_t.itm_sub1.eq(bind("itm_sub1")))
					.and(itmUnit_t.itm_sub2.eq(bind("itm_sub2")))
					.and(itmUnit_t.itm_sub3.eq(bind("itm_sub3")))
					.and(itmUnit_t.unit_cd.eq(bind("trd_unit_cd"))));
			dbSelect("MSBDL0140_MAVM_ITM_UNIT_S01", itmUnit, itmUnit_bldr, itmUnitCnd);
			
			MCIndexKey idxItmUnit = itmUnit.createIndex(MAVM_ITM_UNIT_R.$itm_cd, MAVM_ITM_UNIT_R.$itm_sub1, 
					MAVM_ITM_UNIT_R.$itm_sub2,MAVM_ITM_UNIT_R.$itm_sub3, MAVM_ITM_UNIT_R.$unit_cd);
			
			for (Srch01_DtlR row : srchDtlL) {
				// 取引単位の補完
				MAVM_ITM_UNIT_R selItmUnit = itmUnit.getFirst(idxItmUnit, row.itm_cd(),row.itm_sub1(),
						row.itm_sub2(),row.itm_sub3(), row.trd_unit_cd());
				row.trd_unit_conv_base_qty(selItmUnit.conv_base_qty());
				row.trd_unit_conv_qty(selItmUnit.conv_qty());
				row.trd_unit_dec_place(selItmUnit.dec_place());
				row.trd_unit_rnd_typ(selItmUnit.rnd_typ());
				row.trd_unit_nm(selItmUnit.getStringNE("UNIT_NM"));
				
				// 基準単位数量への換算
				MCNumber baseUnitQty = convToBaseUnit(row.trd_unit_qty(), row.trd_unit_conv_base_qty(), 
						row.trd_unit_conv_qty(), row.base_unit_dec_place(), row.base_unit_rnd_typ());
				
				row.base_unit_qty(baseUnitQty);
			}
		}
		protected void setDtl2RowCalcQtyAndSplitDtl(ConvQtyAmtUtil_Calc01_Dtl2R dtl2ParmRow, Srch01_IoR ioR) {
			// 明細は最大でも仕入予定NO単位の分割単位とする
			dtl2ParmRow.grp_no(ioR.purc_schd_no());
			ioR.grp_no2(isNull(ioR.arr_act_no()) ? "1" : "0");
			dtl2ParmRow.grp_no2(ioR.grp_no2());
		}
		
		/**
		 * 明細の金額計算を行う
		 */
		protected void calcAmt(Srch01_HdrR srchHdr, MCList<Srch01_DtlR> srchDtlL) {
			callConvQtyAmtUtil(srchHdr, srchDtlL);
		}
		
		protected void setLstRate(Srch01_HdrR hdr) {
			if (!hdr.xrate_inpt_flg()) {
				hdr.xrate(getDefXrateNE(hdr.trd_cur_cd(),hdr.base_cur_cd(),
					getCo().purc_xrate_cd(), getToday()));
			}
			if (!isNull(getCo().ptax_cur_cd())) {
				if (!hdr.ptax_xrate_inpt_flg()) {
					hdr.ptax_xrate(getDefXrateNE(hdr.trd_cur_cd(),hdr.ptax_cur_cd(),
						getCo().purc_xrate_cd(), getToday()));
				}
			}
		}
		/**
		 * 下り電文をソートします
		 */
		protected void sortDown(MCList<Srch01_DtlR> srchDtlL, MCList<Srch01_IoR> srchIoL) {
			srchDtlL.sort(Srch01_DtlR.$po_d_no, Srch01_DtlR.$purc_schd_no, 
					Srch01_DtlR.$lot_no, Srch01_DtlR.$sublot_no, Srch01_DtlR.$trd_unit_cd);
			srchIoL.sort(Srch01_IoR.$arr_act_no, Srch01_IoR.$gd_cd, 
					Srch01_IoR.$quality_typ, Srch01_IoR.$stk_insp_typ);
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown(Srch01_HdrR srchHdr, MCList<Srch01_DtlR> srchDtlL, MCList<Srch01_IoR> srchIoL) {
			MCRow.copyall(down0(), srchHdr);
			down1().setAll(srchDtlL);
			down2().setAll(srchIoL);
		}
		
	}
	/**
	 * Srch02オペレーション.<p>
	 * 仕入実績情報を検索する。
	 */
	public class Srch02 extends MSBDL_PurcReg_MC_A.Srch02 {
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			
			// ヘッダ取得
			int cnt = srchHdr();
			if (isSame(cnt, 0)) {
				return;
			}
			// 操作種別が「訂正」または「取消」、かつ、仕入実績が取り消されている場合は、
			// メッセージを表示し、検索処理を中断する。
			if ((isSame(up0().ope(), OPE_UPD) || isSame(up0().ope(),OPE_DEL))
					&& down0().can_flg()) { 
				throw new MCAppException(getDelErrMeg());
			}
			
			// インボイス取引対象の場合は、メッセージを出力し処理を中断する
			if (!isIvReg() && down0().sppl_iv_flg()) {
				String spplCd = down0().sppl_cd();
				down0().clear();
				throw new MCAppException(new MCMessage(MSBDL0129, spplCd));
			}

			setDefaultApDpt(down0());
			
			// 明細取得
			cnt = srchDtl();
			if (isSame(cnt, 0)) {
				down0().clear();
				return;
			}
			
			// 詳細取得
			cnt = srchIo();
			if (isSame(cnt, 0)) {
				down0().clear();
				down1().clear();
				return;
			}
			
			// 下り電文設定
			setDown();
			
		}
		protected MCMessage getDelErrMeg() {
			return new MCMessage(MSBDL0170, down0().purc_act_no());
		}
		
		/**
		 * 仕入実績ヘッダを取得する
		 * @return ヘッダ件数
		 */
		protected int srchHdr() {
			return executeQuery(down0(), MSBDL0140_MST_PURC_ACT_S01(), up0());
		}
		
		/**
		 * 明細取得
		 */
		protected int srchDtl() {
			return executeQuery(down1(), getDtlSrchSql(), down0());
		}
		
		protected MCQueryPlan getDtlSrchSql() {
			MCQueryPlan sql = MSBDL0140_MST_PURC_ACT_D_S01();
			sql.addDynamicSQLInfo(getDtlWhere());
			return sql;
		}
		
		protected MCDynamicSQLInfo getDtlWhere() {
			return MSBDL0140_MST_PURC_ACT_D_S01_WHERE01();
		}
		
		/**
		 * 詳細取得
		 */
		protected int srchIo() {
			return executeQuery(down2(), getIoSrchSql(), down0());
		}
		
		protected MCQueryPlan getIoSrchSql() {
			MCQueryPlan sql = MSBDL0140_MST_PURC_ACT_IO_S01();
			return sql;
		}
		
		protected void setDown() {
			
			// 詳細行検索用のインデックス
			MCIndexKey ioKey = down2().createIndex(getIoKeys());
			
			// 明細行、詳細行の紐付NOを下り電文にセットする
			int dtl_peg_no = 1;
			int io_peg_no = 1;
			
			for (Srch01_DtlR dtlR : down1()) {
				dtlR.peg_no(dtl_peg_no++);
				
				MCList<Srch01_IoR> ioL = down2().subList(ioKey, dtlR.toArray(ioKey.getKeys()));
				
				for (Srch01_IoR ioR : ioL) {
					ioR.dtl_peg_no(dtlR.peg_no());
					ioR.peg_no(io_peg_no++);
					editIo(ioR, dtlR);
				}
				// 直納区分の設定
				Srch01_IoR ior = !isNull(ioL) && !ioL.isEmpty() ? ioL.get(0) : Srch01_IoR.create();
				if (isNull(dtlR.drct_dlv_typ())) {
					if (isNullAnd(ior.dlv_loc_sppl_cd(), dtlR.scst_cd())) {
						dtlR.drct_dlv_typ(MSC_DRCT_DLV_TYP.VIA.value());
					}
					else {
						dtlR.drct_dlv_typ(MSC_DRCT_DLV_TYP.DDLV.value());
					}
				}
				// 出荷元期限の設定　紐付く詳細行が全て同じ期限日だったら明細にコピーする
				if (ioL.groupBy(Srch01_IoR.$ship_fr_valid_dt).size() == 1) {
					dtlR.ship_fr_valid_dt(ioL.get(0).ship_fr_valid_dt());
				}
				
				if(dtlR.outsrc_flg()) {
					dtlR.repurc_obli_flg(down0().repurc_obli_flg());
					dtlR.outsrc_upri_typ(down0().outsrc_upri_typ());
				}
				
				if(ioL.subList(r -> r.sls_sync_flg()).size() > 0) {
					dtlR.sls_sync_flg(true);
				}
			}
			setCont(down1(), down2());
			
		}
		
		/**
		 * 明細・詳細を紐づけるキーを設定する
		 * @return 明細・詳細を紐づけるキー
		 */
		protected String[] getIoKeys() {
			return new String[] {
				Srch01_DtlR.$purc_act_d_no
			};
		}
	}

	protected void setDefaultApDpt(Srch01_HdrR r) {
		if(isNull(r.ap_dpt_cd()) && r.ap_dpt_flg()) {
			r.ap_dpt_cd(r.purc_dpt_cd());
		}
	}
	
	/**
	 * 有効成分の設定をします。
	 */
	protected void setCont(MCList<Srch01_DtlR> srchDtlL, MCList<Srch01_IoR> srchIoL) {

		final MCIndexKey d2i = srchIoL.createIndex(Srch01_IoR.$dtl_peg_no);
		for(Srch01_DtlR dr : srchDtlL) {
			MCList<Srch01_IoR> iol = srchIoL.subList(d2i, dr.peg_no());
			iol.forEach(ior -> {
				MSBDL_PurcUtil.setCont(ior);
				MSBDL_PurcUtil.addCont(dr, ior);
			});
		}
	}
	
	protected void editDown(Srch01_HdrR srchHdr, MCList<Srch01_DtlR> srchDtlL, MCList<Srch01_IoR> srchIoL) {
		editHdr(srchHdr);
		editDtl(srchHdr, srchDtlL, srchIoL);
	}
	
	protected void editHdr(Srch01_HdrR hdr) {
	}
	
	protected void editDtl(Srch01_HdrR hdr, MCList<Srch01_DtlR> dtlL, MCList<Srch01_IoR> ioL) {
		
		MCIndexKey iok = ioL.createIndex(Srch01_IoR.$dtl_peg_no);
		
		dtlL.forEach(dr -> {
			if (hdr.subcon_flg()) {
				dr.sync_flg(true);
			}
			else {
				Srch01_IoR ior = 
						ioL.getFirst(iok, dr.peg_no());
				if (!isNull(ior.arr_act_no())) {
					dr.sync_flg(false);
				}
				else {
					if (dr.arr_act_flg()) {
						// 未入荷・未仕入で入荷予定に紐付く入荷実績が存在する場合（一部入荷済の残数分の仕入時）は常にtrue
						dr.sync_flg(true);
					}
				}
			}
			// 詳細行で項目が全て同じものは、明細行に同じ値をセット
			MCList<Srch01_IoR> tgtIoL = ioL.subList(iok, dr.peg_no());
			setSameValueToDtlFrIo(dr, tgtIoL);
			
			// 直納区分
			Srch01_IoR ior = tgtIoL.get(0);
			if (isNull(dr.drct_dlv_typ())) {
				if (isNullAnd(ior.dlv_loc_sppl_cd(), dr.scst_cd())) {
					dr.drct_dlv_typ(MSC_DRCT_DLV_TYP.VIA.value());
				}
				else {
					dr.drct_dlv_typ(MSC_DRCT_DLV_TYP.DDLV.value());
				}
			}

			// 仕入直送の場合、入荷同時計上をONで表示し、仕入直送でない場合で入荷不要の場合は、入荷同時計上をOFFで表示する。
			// そのほかは入荷予定の同時計上FLGの状態に従う。
			if (dr.purc_ddlv_flg()) {
				dr.schd_sync_flg(true);
				dr.sync_flg(true);
			}
			else if (dr.arr_skip_flg()) {
				dr.schd_sync_flg(false);
				dr.sync_flg(false);
			}				
			
			if(dr.outsrc_flg()) {
				dr.repurc_obli_flg(hdr.repurc_obli_flg());
				dr.outsrc_upri_typ(hdr.outsrc_upri_typ());
			}
			boolean isAcptDfctOn = true;
			
			if (isNull(ior.arr_act_no())) {
				isAcptDfctOn = false;
			}
			else {
				for (Srch01_IoR ioRow : tgtIoL) {
					if (MAC_QUALITY_TYP.isGOOD(ioRow.quality_typ())) {
						isAcptDfctOn = false;
					}
				}
			}
			setAccptDfct(hdr, dr, isAcptDfctOn);
		});
	}
	protected void setAccptDfct(Srch01_HdrR hdr, Srch01_DtlR dr, boolean isAcptDfctOn) {
		// 明細の良品区分が良品以外の場合、また、明細に紐づく詳細の良品区分が全て良品以外の場合、
		// 検収不良ＦＬＧ、再入荷ＦＬＧをオンで表示する。
		if (isAcptDfctOn) {
			if (hdr.sppl_iv_flg()) {
				dr.accpt_dfct_flg(false);
				dr.re_arr_flg(false);
				dr.trd_unit_re_arr_qty(null);
				dr.re_arr_loc_cd(null);
				dr.re_arr_loc_nm(null);
				dr.re_arr_loc_wg_cd(null);
				dr.re_arr_loc_wg_nm(null);
				dr.re_arr_str_ln_tgt_flg(false);
				dr.re_arr_str_ln_cd_none_flg(false);
				dr.re_arr_str_ln_cd(null);
				dr.re_arr_str_ln_nm(null);
			}
			else {
				dr.accpt_dfct_flg(true);
				dr.re_arr_flg(true);

				// 再入荷ＦＬＧをオンにした場合の設定
				dr.trd_unit_re_arr_qty(dr.trd_unit_qty());
				dr.re_arr_loc_cd(dr.dlv_loc_cd());
				dr.re_arr_loc_nm(dr.dlv_loc_nm());
				dr.re_arr_loc_wg_cd(dr.dlv_loc_wg_cd());
				dr.re_arr_loc_wg_nm(dr.dlv_loc_wg_nm());
				dr.re_arr_str_ln_tgt_flg(dr.str_ln_tgt_flg());

				if (dr.str_ln_tgt_flg() && !MAC_STR.isNULL_VAL(dr.str_ln_cd())) {
					dr.re_arr_str_ln_cd_none_flg(false);
					dr.re_arr_str_ln_cd(dr.str_ln_cd());
					dr.re_arr_str_ln_nm(dr.str_ln_nm());
				}
				else {
					dr.re_arr_str_ln_cd_none_flg(true);
				}
				
				// 金額項目をクリア
				dr.upri_not_tgt_flg(true);
				dr.trd_cur_upri(MCNumber.ZERO);
				dr.interim_flg(false);
				
				if(!isNull(dr.wtax_rate())) {
					dr.trd_cur_wtax_amt(MCNumber.ZERO);
				}

				dr.trd_cur_amt(MCNumber.ZERO);
				dr.trd_cur_tax_amt(MCNumber.ZERO);
				dr.trd_cur_inc_tax_amt(MCNumber.ZERO);
				dr.trd_cur_dscnt_amt(null);

				dr.base_cur_upri(MCNumber.ZERO);
				dr.base_cur_amt(MCNumber.ZERO);
				dr.base_cur_tax_amt(MCNumber.ZERO);
				dr.base_cur_inc_tax_amt(MCNumber.ZERO);
				dr.base_cur_dscnt_amt(null);
				
				if (!isNull(hdr.ptax_xrate())) {
					dr.ptax_cur_upri(MCNumber.ZERO);
					dr.ptax_cur_amt(MCNumber.ZERO);
					dr.ptax_cur_tax_amt(MCNumber.ZERO);
					dr.ptax_cur_inc_tax_amt(MCNumber.ZERO);
					dr.ptax_cur_dscnt_amt(null);
				}

				if (!isNull(dr.trd_cur_proc_upri())) {
					dr.trd_cur_proc_upri(MCNumber.ZERO);
					dr.trd_cur_proc_amt(MCNumber.ZERO);
					dr.base_cur_proc_upri(MCNumber.ZERO);
					dr.base_cur_proc_amt(MCNumber.ZERO);
					if(!isNull(hdr.ptax_xrate())) {
						dr.ptax_cur_proc_upri(MCNumber.ZERO);
						dr.ptax_cur_proc_amt(MCNumber.ZERO);
					}
				}

				if (!isNull(dr.trd_cur_onr_prov_upri())) {
					dr.trd_cur_onr_prov_upri(MCNumber.ZERO);
					dr.trd_cur_onr_prov_amt(MCNumber.ZERO);
					dr.base_cur_onr_prov_upri(MCNumber.ZERO);
					dr.base_cur_onr_prov_amt(MCNumber.ZERO);
					if(!isNull(hdr.ptax_xrate())) {
						dr.ptax_cur_onr_prov_upri(MCNumber.ZERO);
						dr.ptax_cur_onr_prov_amt(MCNumber.ZERO);
					}
				}

				dr.dscnt_rsn_cd(null);
				dr.dscnt_rsn_nm(null);

				// 債務部門をクリア
				dr.ap_dpt_cd(null);
				dr.ap_dpt_nm(null);

				// 支払繰越回数をクリア
				dr.pay_crryovr_times(null);

				// 負担項目をクリア
				dr.bd_dpt_cd(null);
				dr.bd_dpt_nm(null);
				dr.bd_itm_cd(null);
				dr.bd_itm_sub1(null);
				dr.bd_itm_sub2(null);
				dr.bd_itm_sub3(null);
				dr.bd_itm_nm(null);
				dr.bd_lot_no(null);
				dr.bd_sublot_no(null);
				dr.bd_sno1(null);
				dr.bd_sno2(null);
				dr.bd_sno3(null);
				dr.bd_sno4(null);
				dr.bd_bp_cd(null);
				dr.bd_bp_nm(null);
				dr.bd_loc_cd(null);
				dr.bd_loc_nm(null);
				dr.bd_ctg_cd(null);
				dr.bd_ctg_nm(null);
				dr.bd_oper_cd(null);
				dr.bd_oper_nm(null);
				dr.bd_iv_no(null);
				dr.bd_slo_no(null);
				dr.bd_po_no(null);
				dr.bd_lot_mng_typ(null);
				dr.bd_lot_no_typ(null);
				dr.bd_sublot_mng_typ(null);
				dr.bd_sublot_no_typ(null);
				dr.bd_sno1_mng_typ(null);
				dr.bd_sno2_mng_typ(null);
				dr.bd_sno3_mng_typ(null);
				dr.bd_sno4_mng_typ(null);
			}
		}
		else {
			dr.re_arr_loc_site_cd(null);
			dr.re_arr_loc_cal_cd(null);
			dr.re_arr_loc_sppl_cd(null);
			dr.re_arr_loc_sppl_cal_cd(null);
		}
	}

	/**
	 * 明細に対応する詳細行を比較し、値が同じカラムは明細行にも同じ値を設定します。<br>
	 * 値が異なる場合は、明細行の値をクリアします。
	 * @param dtlRow 明細行
	 * @param ioL 明細行に紐付く詳細行リスト
	 */
	protected void setSameValueToDtlFrIo(Srch01_DtlR dtlRow, MCList<Srch01_IoR> ioL) {

		boolean isSameLot = true;
		boolean isSameGdCd = true;
		boolean isSameQualityTyp = true;
		boolean isSameDlvLocCd = true;
		boolean isSameStrLnCd = true;
		boolean isSameBpLot = true;
		boolean isSameDlvSlipNo = true;
		boolean isSameDlvSlipDNo = true;
		boolean isSameFrValidDt = true;
		
		Srch01_IoR preIoRow = Srch01_IoR.create(); 
		for (Srch01_IoR ioRow : ioL) {
			 if (preIoRow.isEmpty()) {
				 preIoRow = ioRow;
			 }
			 else {
				 if (!isSame(preIoRow.lot_no(), ioRow.lot_no())) {
					 isSameLot = false;
				 }
				 if (!isSame(preIoRow.sublot_no(), ioRow.sublot_no())) {
					 isSameLot = false;
				 }
				 if (!isSame(preIoRow.ver_no(), ioRow.ver_no())) {
					 isSameLot = false;
				 }
				 if (!isSame(preIoRow.gd_cd(),ioRow.gd_cd())) {
					 isSameGdCd = false;
				 }
				 if (!isSame(preIoRow.quality_typ(),ioRow.quality_typ())) {
					 isSameQualityTyp = false;
				 }
				 if (!isSame(preIoRow.dlv_loc_cd(),ioRow.dlv_loc_cd())) {
					 isSameDlvLocCd = false;
				 }
				 if (!isSame(preIoRow.str_ln_cd(),ioRow.str_ln_cd())) {
					 isSameStrLnCd = false;
				 }
				 if (!isSame(preIoRow.bp_lot_no(),ioRow.bp_lot_no())) {
					 isSameBpLot = false;
				 }
				 if (!isSame(preIoRow.bp_dlv_slip_no(),ioRow.bp_dlv_slip_no())) {
					 isSameDlvSlipNo = false;
				 }
				 if (!isSame(preIoRow.bp_dlv_slip_d_no(),ioRow.bp_dlv_slip_d_no())) {
					 isSameDlvSlipDNo = false;
				 }
				 if (!isSame(preIoRow.ship_fr_valid_dt(), ioRow.ship_fr_valid_dt())) {
					 isSameFrValidDt = false;
				 }
			 }
		}
		if (isSameLot) {
			dtlRow.lot_no(ioL.get(0).lot_no());
			dtlRow.sublot_no(ioL.get(0).sublot_no());
			dtlRow.ver_no(ioL.get(0).ver_no());
		}
		else {
			dtlRow.lot_no(null);
			dtlRow.sublot_no(null);
			dtlRow.ver_no(null);
		}	
		if (isSameGdCd) {
			dtlRow.gd_cd(ioL.get(0).gd_cd());
			dtlRow.gd_nm(ioL.get(0).gd_nm());
		}
		else {
			dtlRow.gd_cd(null);
			dtlRow.gd_nm(null);
		}
		
		if (isSameQualityTyp) {
			dtlRow.quality_typ(ioL.get(0).quality_typ());
			dtlRow.quality_typ_nm(ioL.get(0).quality_typ_nm());
		}
		else {
			dtlRow.quality_typ(null);
			dtlRow.quality_typ_nm(null);
		}
		
		if (isSameDlvLocCd) {
			dtlRow.dlv_loc_cd(ioL.get(0).dlv_loc_cd());
			dtlRow.dlv_loc_nm(ioL.get(0).dlv_loc_nm());
		}
		else {
			dtlRow.dlv_loc_cd(null);
			dtlRow.dlv_loc_nm(null);
		}
		
		if (isSameStrLnCd) {
			dtlRow.str_ln_cd(ioL.get(0).str_ln_cd());
			dtlRow.str_ln_nm(ioL.get(0).str_ln_nm());
		}
		else {
			dtlRow.str_ln_cd(null);
			dtlRow.str_ln_nm(null);
		}
		
		if (isSameBpLot) {
			dtlRow.bp_lot_no(ioL.get(0).bp_lot_no());
		}
		else {
			dtlRow.bp_lot_no(null);
		}
		
		if (isSameDlvSlipNo) {
			dtlRow.bp_dlv_slip_no(ioL.get(0).bp_dlv_slip_no());
		}
		else {
			dtlRow.bp_dlv_slip_no(null);
		}
		
		if (isSameDlvSlipDNo) {
			dtlRow.bp_dlv_slip_d_no(ioL.get(0).bp_dlv_slip_d_no());
		}
		else {
			dtlRow.bp_dlv_slip_d_no(null);
		}
		
		if (isSameFrValidDt) {
			dtlRow.ship_fr_valid_dt(ioL.get(0).ship_fr_valid_dt());
		}
		else {
			dtlRow.ship_fr_valid_dt(null);
		}
	}
	/**
	 * インボイス取引対象を登録できるか
	 * 非カスタマイズ時はFALSE固定(ＩＶ登録不可）
	 */
	protected boolean isIvReg() {
		return false;
	}
	/**
	 * 金額計算ユーティリティを実行します
	 * @param srchHdr ヘッダ
	 * @param srchDtlL 明細
	 */
	protected void callConvQtyAmtUtil (Srch01_HdrR srchHdr, MCList<Srch01_DtlR> srchDtlL) {
		if (!(isSame(srchHdr.trd_cur_cd(), srchHdr.base_cur_cd())
				&& (isSame(srchHdr.trd_cur_cd(), srchHdr.ptax_cur_cd()) || isNull(srchHdr.ptax_cur_cd()))
				)) {
			srchDtlL.setNumberNE(Srch01_DtlR.$wtax_rate, null);
			srchDtlL.setNumberNE(Srch01_DtlR.$trd_cur_wtax_amt, null);
		}
		
		// ヘッダ紐付NO
		int hdr_peg_no = 0;
		
		// ユーティリティ実行用の引数電文
		MCList<ConvQtyAmtUtil_Calc01_HdrR> hdrParmLst = MCList.create(ConvQtyAmtUtil_Calc01_HdrR.class);
		MCList<ConvQtyAmtUtil_Calc01_Dtl1R> dtl1ParmLst = MCList.create(ConvQtyAmtUtil_Calc01_Dtl1R.class);
		
		// 明細下り電文を発注明細NO単位にグルーピングして、ユーティティの引数(ヘッダ)にする
		MCGroupByPolicy grpByPoD = new MCGroupByPolicy(Srch01_DtlR.$po_d_no,
				Srch01_DtlR.$src_trd_unit_cd,
				Srch01_DtlR.$src_trd_unit_qty,
				Srch01_DtlR.$src_trd_cur_upri,
				Srch01_DtlR.$src_trd_cur_dscnt_amt,
				Srch01_DtlR.$src_trd_cur_proc_upri,
				Srch01_DtlR.$src_trd_cur_onr_prov_upri,
				Srch01_DtlR.$src_trd_cur_amt,
				Srch01_DtlR.$src_trd_cur_proc_amt,
				Srch01_DtlR.$src_trd_cur_onr_prov_amt,
				Srch01_DtlR.$src_trd_cur_tax_amt,
				Srch01_DtlR.$src_base_unit_qty,
				Srch01_DtlR.$base_unit_dec_place,
				Srch01_DtlR.$base_unit_rnd_typ,
				Srch01_DtlR.$src_trd_unit_conv_qty,
				Srch01_DtlR.$src_trd_unit_conv_base_qty,
				Srch01_DtlR.$trd_unit_conv_qty,
				Srch01_DtlR.$trd_unit_conv_base_qty,
				Srch01_DtlR.$tax_rate,
				Srch01_DtlR.$wtax_rate,
				Srch01_DtlR.$inc_tax_flg,
				Srch01_DtlR.$src_tax_rate,
				Srch01_DtlR.$src_inc_tax_flg,
				Srch01_DtlR.$trd_cur_wtax_amt
				);
		MCList<Srch01_DtlR> grpListByPoD = srchDtlL.groupBy(grpByPoD);
		
		for (Srch01_DtlR row : grpListByPoD) {
			
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
			hdrParmRow.trd_cur_tax_amt(row.src_trd_cur_tax_amt());
			MCRow rslt = getAmtAndTax(row.src_trd_cur_upri(), row.src_trd_unit_qty(), row.tax_rate(), row.inc_tax_flg(), 
					srchHdr.trd_cur_amt_dec_place(), srchHdr.purc_amt_rnd_typ(), srchHdr.purc_tax_rnd_typ(), row.src_trd_cur_dscnt_amt());
			hdrParmRow.trd_cur_inc_tax_amt(getIncTaxAmt(rslt));
			hdrParmRow.base_unit_dec_place(row.base_unit_dec_place());
			hdrParmRow.base_unit_rnd_typ(row.base_unit_rnd_typ());
			hdrParmRow.trd_unit_conv_qty(row.src_trd_unit_conv_qty());
			hdrParmRow.trd_unit_conv_base_qty(row.src_trd_unit_conv_base_qty());
			hdrParmRow.trd_cur_cd(srchHdr.trd_cur_cd());
			hdrParmRow.amt_dec_place(srchHdr.trd_cur_amt_dec_place());
			hdrParmRow.upri_dec_place(srchHdr.trd_cur_upri_dec_place());
			hdrParmRow.amt_rnd_typ(srchHdr.purc_amt_rnd_typ());
			hdrParmRow.tax_rnd_typ(srchHdr.purc_tax_rnd_typ());
			hdrParmRow.tax_rate(row.src_tax_rate());
			hdrParmRow.inc_tax_flg(row.src_inc_tax_flg());
			hdrParmRow.wtax_rate(row.wtax_rate());
			hdrParmRow.wtax_amt(row.trd_cur_wtax_amt());
			hdrParmRow.act_tax_rate(row.tax_rate());
			hdrParmRow.act_inc_tax_flg(row.inc_tax_flg());
			hdrParmRow.schd_base_unit_qty(row.src_base_unit_qty());
			hdrParmLst.add(hdrParmRow);
			
			// 同じ発注明細ＮＯを持つ明細下り電文をユーティリティの引数(明細)に設定する
			MCList<Srch01_DtlR> dtlL = srchDtlL.subList(Srch01_DtlR.$po_d_no, row.po_d_no());
			
			for (Srch01_DtlR dtlR : dtlL) {
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
		String[] destCols = {Srch01_DtlR.$trd_cur_upri,
				Srch01_DtlR.$trd_cur_dscnt_amt,
				Srch01_DtlR.$trd_cur_amt,
				Srch01_DtlR.$trd_cur_tax_amt,
				Srch01_DtlR.$trd_cur_inc_tax_amt,
				Srch01_DtlR.$trd_unit_conv_qty,
				Srch01_DtlR.$trd_unit_conv_base_qty,
				Srch01_DtlR.$trd_cur_proc_upri,
				Srch01_DtlR.$trd_cur_onr_prov_upri,
				Srch01_DtlR.$trd_cur_proc_amt,
				Srch01_DtlR.$trd_cur_onr_prov_amt,
				Srch01_DtlR.$trd_cur_wtax_amt};
		
		String[] srcCols = {ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_upri,
				ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_dscnt_amt,
				ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_amt,
				ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_tax_amt,
				ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_inc_tax_amt,
				ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_conv_qty,
				ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_conv_base_qty,
				ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_proc_upri,
				ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_onr_prov_upri,
				ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_proc_amt,
				ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_onr_prov_amt,
				ConvQtyAmtUtil_Calc01_Dtl1R.$wtax_amt};
		copyByPegNo(srchDtlL, destCols, ope.down0(), srcCols);
		
		calcRepurcObliTax(srchHdr, srchDtlL);
		callConvQtyAmtUtilAftr(srchHdr, srchDtlL);
	}
	protected void callConvQtyAmtUtilAftr (Srch01_HdrR srchHdr, MCList<Srch01_DtlR> srchDtlL) {
	
		// 基準通貨・納税通貨に換算
		for (Srch01_DtlR dtlRow : srchDtlL) {
			// 単価・値引額・金額・税額・税込金額
			dtlRow.base_cur_upri(convToBaseCur(dtlRow.trd_cur_upri(), srchHdr.xrate(), srchHdr.base_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
			dtlRow.base_cur_dscnt_amt(convToBaseCur(dtlRow.trd_cur_dscnt_amt(), srchHdr.xrate(), srchHdr.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			dtlRow.base_cur_amt(convToBaseCur(dtlRow.trd_cur_amt(), srchHdr.xrate(), srchHdr.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			dtlRow.base_cur_tax_amt(convToBaseCur(dtlRow.trd_cur_tax_amt(), srchHdr.xrate(), srchHdr.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			dtlRow.base_cur_inc_tax_amt(convToBaseCur(dtlRow.trd_cur_inc_tax_amt(), srchHdr.xrate(), srchHdr.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			// 加工単価・金額
			dtlRow.base_cur_proc_upri(convToBaseCur(dtlRow.trd_cur_proc_upri(), srchHdr.xrate(), srchHdr.base_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
			dtlRow.base_cur_proc_amt(convToBaseCur(dtlRow.trd_cur_proc_amt(), srchHdr.xrate(), srchHdr.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			// 有償支給単価・金額
			dtlRow.base_cur_onr_prov_upri(convToBaseCur(dtlRow.trd_cur_onr_prov_upri(), srchHdr.xrate(), srchHdr.base_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
			dtlRow.base_cur_onr_prov_amt(convToBaseCur(dtlRow.trd_cur_onr_prov_amt(), srchHdr.xrate(), srchHdr.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			
			if (!isNull(srchHdr.ptax_cur_cd())) {
				dtlRow.ptax_cur_upri(convCur(dtlRow.trd_cur_upri(), srchHdr.ptax_xrate(), srchHdr.ptax_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
				dtlRow.ptax_cur_dscnt_amt(convCur(dtlRow.trd_cur_dscnt_amt(), srchHdr.ptax_xrate(), srchHdr.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
				dtlRow.ptax_cur_amt(convCur(dtlRow.trd_cur_amt(), srchHdr.ptax_xrate(), srchHdr.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
				dtlRow.ptax_cur_tax_amt(convCur(dtlRow.trd_cur_tax_amt(), srchHdr.ptax_xrate(), srchHdr.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));					
				dtlRow.ptax_cur_inc_tax_amt(convCur(dtlRow.trd_cur_inc_tax_amt(), srchHdr.ptax_xrate(), srchHdr.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
				// 加工単価・金額
				dtlRow.ptax_cur_proc_upri(convCur(dtlRow.trd_cur_proc_upri(), srchHdr.ptax_xrate(), srchHdr.ptax_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
				dtlRow.ptax_cur_proc_amt(convCur(dtlRow.trd_cur_proc_amt(), srchHdr.ptax_xrate(), srchHdr.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));

				// 有償支給単価・金額
				dtlRow.ptax_cur_onr_prov_upri(convCur(dtlRow.trd_cur_onr_prov_upri(), srchHdr.ptax_xrate(), srchHdr.ptax_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
				dtlRow.ptax_cur_onr_prov_amt(convCur(dtlRow.trd_cur_onr_prov_amt(), srchHdr.ptax_xrate(), srchHdr.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			}
		}
	}
	/**
	 * 買戻義務の場合の税額を計算します
	 * @param hdrR
	 * @param dtlL
	 */
	protected void calcRepurcObliTax(Srch01_HdrR hdrR, MCList<Srch01_DtlR> dtlL) {
		for(Srch01_DtlR dtlR : dtlL) {
			if(!dtlR.outsrc_flg()) {
				continue;
			}
			if(hdrR.repurc_obli_flg()) {
				MCNumber amt = dtlR.trd_cur_inc_tax_amt();
				if(dtlR.inc_tax_flg()) {
					// 内税の場合、有償支給単価を税額に含めないために、一旦加工単価×数量で導出し、後続処理で税額を差し引く
					MCNumber proc_inc_tax_amt = getAmt(dtlR.trd_cur_proc_upri(),
							dtlR.trd_unit_qty(),
							hdrR.trd_cur_amt_dec_place(),
							hdrR.purc_tax_rnd_typ(),
							dtlR.trd_cur_dscnt_amt());
					dtlR.trd_cur_proc_amt(proc_inc_tax_amt);
					// 有償支給金額は金額-加工金額
					dtlR.trd_cur_onr_prov_amt(!isNull(amt) ? amt.subtract(proc_inc_tax_amt) : null);
				}
				MCNumber trdCurTaxAmt = getTaxAmt(
						dtlR.trd_cur_proc_amt(),
						dtlR.tax_rate(),
						hdrR.trd_cur_amt_dec_place(),
						hdrR.purc_tax_rnd_typ(),
						dtlR.inc_tax_flg()
						);
				dtlR.trd_cur_tax_amt(trdCurTaxAmt);
				if(dtlR.inc_tax_flg()) {
					amt = (amt != null) ? amt.subtract(trdCurTaxAmt) : null;
					MCNumber proc_amt = !isNull(dtlR.trd_cur_proc_amt()) ? dtlR.trd_cur_proc_amt().subtract(trdCurTaxAmt) : MCNumber.ZERO;
					dtlR.trd_cur_amt(amt);
					dtlR.trd_cur_proc_amt(proc_amt);
				}
				dtlR.trd_cur_inc_tax_amt(dtlR.trd_cur_amt() != null ? dtlR.trd_cur_amt().add(trdCurTaxAmt) : null);
			}
		}
	}
	/**
	 * 詳細の行番号を明細の行番号で置き換える
	 * @param up1L
	 * @param up2L
	 * @param down2L
	 */
	protected void editUp(MCList<Chk01_DtlR> up1L, MCList<Chk01_IoR> up2L, MCList<Chk01_IoR> down2L) {
		// 上り電文の属性を変更する前に、下り電文にpeg_noと属性をコピーする
		copyPegNoAndAttr(down2L, up2L);

		MCIndexKey up1Key = up1L.createIndex(Chk01_DtlR.$peg_no);
		for(Chk01_IoR up2R : up2L) {
			Chk01_DtlR up1R = up1L.getFirst(up1Key, up2R.dtl_peg_no());
			if(!isNull(up1R)) {
				up2R.setGUIIndex(up1R.getGUIIndex());
			}
		}
	}
	
	protected void editIo(Srch01_IoR ioR, Srch01_DtlR dtlR) {
		
		// 品目で決まる項目を明細から受払に移す
		ioR.stk_mng_typ(dtlR.stk_mng_typ());
		ioR.lot_mng_typ(dtlR.lot_mng_typ());
		ioR.lot_no_typ(dtlR.lot_no_typ());
		ioR.sublot_mng_typ(dtlR.sublot_mng_typ());
		ioR.sublot_no_typ(dtlR.sublot_no_typ());
		ioR.ver_flg(dtlR.ver_flg());
	}
	
	/**
	 * データ更新区分設定
	 * @param up0Row ヘッダ上り電文Row
	 * @param up1L 明細上り電文List
	 * @param up2L 詳細上り電文List
	 */
	protected void setDataCrudTyp(Chk01_HdrR up0Row, MCList<Chk01_DtlR> up1L, MCList<Chk01_IoR> up2L) {
		
		if (up0Row.getStatus() == CREATE) {
			up0Row.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
		}
		else if (up0Row.getStatus() == MODIFY) {
			up0Row.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
		}
		else {
			up0Row.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
		}
		
		for (Chk01_DtlR up1Row : up1L) {
			if (up1Row.getStatus() == CREATE) {
				up1Row.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			}
			else if (up1Row.getStatus() == MODIFY) {
				up1Row.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			}
			else {
				up1Row.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
		}
		
		for (Chk01_IoR up2Row : up2L) {
			if (up2Row.getStatus() == CREATE) {
				up2Row.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			}
			else if (up2Row.getStatus() == MODIFY) {
				up2Row.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			}
			else {
				up2Row.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
		}
	}
	/**
	 * 仕入実績登録サービスのチェック処理を呼び出すための上り電文を設定する
	 * @param ope
	 * @param up0 
	 * @param up1
	 * @param up2
	 */
	protected void setPurcChk03Up(MSBDL_PurcActRegService.Purc_Chk03 ope, Chk01_HdrR up0, MCList<Chk01_DtlR>up1, MCList<Chk01_IoR>up2) {
		Purc_Chk03_HdrR hdrR = Purc_Chk03_HdrR.create();
		copy(hdrR, up0, createMap_Purc_Chk03_HdrR_Chk01_HdrR());
		ope.up0().add(hdrR);
		addAll(ope.up1(), up1, createMap_Purc_Chk03_DtlR_Chk01_DtlR());
		addAll(ope.up2(), up2, createMap_Purc_Chk03_IoR_Chk01_IoR());
		// 入荷実績作成FLGをオン
		ope.up3().arr_act_flg(true);
		// 受払実績作成FLGをオン
		ope.up3().io_make_flg(true);
	}
	protected void setPurcChk03Down(MSBDL_PurcActRegService.Purc_Chk03 ope, Chk01_HdrR hdrR,
	MCList<Chk01_DtlR> dtlL, MCList<Chk01_IoR> ioL) {
		
		MCIndexKey up1Key = dtlL.createIndex(Chk01_DtlR.$peg_no);
		for (Purc_Chk03_DtlR down1R : ope.down1()) {
			Chk01_DtlR up1R = dtlL.getFirst(up1Key, down1R.peg_no());
			up1R.purc_dtl_upd_flg(down1R.purc_dtl_upd_flg());
		}
		
		MCIndexKey up2Key = ioL.createIndex(Chk01_IoR.$peg_no);
		for (Purc_Chk03_IoR down2R : ope.down2()) {
			Chk01_IoR up2R = ioL.getFirst(up2Key, down2R.peg_no());
			if (!isNull(up2R)) {
				up2R.outsrc_act_flg(down2R.outsrc_act_flg());
			}
		}
	}
	
	// RowMapper --
	protected Map_Purc_Ins01_HdrR_Chk01_HdrR<Purc_Ins01_HdrR,Chk01_HdrR> createMap_Purc_Ins01_HdrR_Chk01_HdrR() {
		return new Map_Purc_Ins01_HdrR_Chk01_HdrR<Purc_Ins01_HdrR, Chk01_HdrR>();
	}

	public class Map_Purc_Ins01_HdrR_Chk01_HdrR<D extends Purc_Ins01_HdrR, S extends Chk01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Purc_Ins01_HdrR.$data_crud_typ, Chk01_HdrR.$data_crud_typ);
			addColumnPathMap(Purc_Ins01_HdrR.$purc_act_no, Chk01_HdrR.$purc_act_no);
			addColumnPathMap(Purc_Ins01_HdrR.$purc_act_seq, Chk01_HdrR.$purc_act_seq);
			addColumnPathMap(Purc_Ins01_HdrR.$trd_cd, Chk01_HdrR.$trd_cd);
			addColumnPathMap(Purc_Ins01_HdrR.$trd_ptn_typ, Chk01_HdrR.$trd_ptn_typ);
			addColumnPathMap(Purc_Ins01_HdrR.$po_no, Chk01_HdrR.$po_no);
			addColumnPathMap(Purc_Ins01_HdrR.$purc_dpt_cd, Chk01_HdrR.$purc_dpt_cd);
			addColumnPathMap(Purc_Ins01_HdrR.$wg_cd, Chk01_HdrR.$wg_cd);
			addColumnPathMap(Purc_Ins01_HdrR.$purc_usr_cd, Chk01_HdrR.$purc_usr_cd);
			addColumnPathMap(Purc_Ins01_HdrR.$sppl_cd, Chk01_HdrR.$sppl_cd);
			addColumnPathMap(Purc_Ins01_HdrR.$asppl_cd, Chk01_HdrR.$asppl_cd);
			addColumnPathMap(Purc_Ins01_HdrR.$bsppl_cd, Chk01_HdrR.$bsppl_cd);
			addColumnPathMap(Purc_Ins01_HdrR.$psppl_cd, Chk01_HdrR.$psppl_cd);
			addColumnPathMap(Purc_Ins01_HdrR.$cred_cd, Chk01_HdrR.$cred_cd);
			addColumnPathMap(Purc_Ins01_HdrR.$purc_amt_rnd_typ, Chk01_HdrR.$purc_amt_rnd_typ);
			addColumnPathMap(Purc_Ins01_HdrR.$purc_tax_rnd_typ, Chk01_HdrR.$purc_tax_rnd_typ);
			addColumnPathMap(Purc_Ins01_HdrR.$purc_tax_calc_typ, Chk01_HdrR.$purc_tax_calc_typ);
			addColumnPathMap(Purc_Ins01_HdrR.$trd_cur_cd, Chk01_HdrR.$trd_cur_cd);
			addColumnPathMap(Purc_Ins01_HdrR.$ptax_cur_cd, Chk01_HdrR.$ptax_cur_cd);
			addColumnPathMap(Purc_Ins01_HdrR.$base_cur_cd, Chk01_HdrR.$base_cur_cd);
			addColumnPathMap(Purc_Ins01_HdrR.$xrate, Chk01_HdrR.$xrate);
			addColumnPathMap(Purc_Ins01_HdrR.$ptax_xrate, Chk01_HdrR.$ptax_xrate);
			addColumnPathMap(Purc_Ins01_HdrR.$purc_dt, Chk01_HdrR.$purc_dt);
			addColumnPathMap(Purc_Ins01_HdrR.$ac_dt, Chk01_HdrR.$ac_dt);
			addColumnPathMap(Purc_Ins01_HdrR.$can_ac_dt, Chk01_HdrR.$can_ac_dt);
			addColumnPathMap(Purc_Ins01_HdrR.$pay_basis_dt, Chk01_HdrR.$pay_basis_dt);
			addColumnPathMap(Purc_Ins01_HdrR.$ptax_dt, Chk01_HdrR.$ptax_dt);
			addColumnPathMap(Purc_Ins01_HdrR.$tterm_cd1, Chk01_HdrR.$tterm_cd1);
			addColumnPathMap(Purc_Ins01_HdrR.$tterm_rmrks1, Chk01_HdrR.$tterm_rmrks1);
			addColumnPathMap(Purc_Ins01_HdrR.$tterm_cd2, Chk01_HdrR.$tterm_cd2);
			addColumnPathMap(Purc_Ins01_HdrR.$tterm_rmrks2, Chk01_HdrR.$tterm_rmrks2);
			addColumnPathMap(Purc_Ins01_HdrR.$tterm_cd3, Chk01_HdrR.$tterm_cd3);
			addColumnPathMap(Purc_Ins01_HdrR.$tterm_rmrks3, Chk01_HdrR.$tterm_rmrks3);
			addColumnPathMap(Purc_Ins01_HdrR.$trd_rmrks, Chk01_HdrR.$trd_rmrks);
			addColumnPathMap(Purc_Ins01_HdrR.$intr_rmrks, Chk01_HdrR.$intr_rmrks);
			addColumnPathMap(Purc_Ins01_HdrR.$sub_char1, Chk01_HdrR.$sub_char1);
			addColumnPathMap(Purc_Ins01_HdrR.$sub_char2, Chk01_HdrR.$sub_char2);
			addColumnPathMap(Purc_Ins01_HdrR.$sub_char3, Chk01_HdrR.$sub_char3);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.peg_no(1);
		}
	}

	/**
	 * RowMapper<br>
	 * 上り電文(Chk01_DtlR) -> 仕入実績サービス.上り電文(Purc_Ins01_DtlR)
	 */
	protected Map_Purc_Ins01_DtlR_Chk01_DtlR<Purc_Ins01_DtlR,Chk01_DtlR> createMap_Purc_Ins01_DtlR_Chk01_DtlR() {
		return new Map_Purc_Ins01_DtlR_Chk01_DtlR<Purc_Ins01_DtlR, Chk01_DtlR>();
	}

	public class Map_Purc_Ins01_DtlR_Chk01_DtlR<D extends Purc_Ins01_DtlR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
		
		protected Purc_Ins01_HdrR _hdrR;
		
		public void setWithHdrR(Purc_Ins01_HdrR _hdrR) {
		this._hdrR = _hdrR;
	}
		@Override
		protected void setupColumnPathMap() {
			
			// NO項目
			addColumnPathMap(Purc_Ins01_DtlR.$peg_no, Chk01_DtlR.$peg_no);
			addColumnPathMap(Purc_Ins01_DtlR.$po_d_no, Chk01_DtlR.$po_d_no);
			addColumnPathMap(Purc_Ins01_DtlR.$purc_act_d_no, Chk01_DtlR.$purc_act_d_no);
			addColumnPathMap(Purc_Ins01_DtlR.$purc_act_d_seq, Chk01_DtlR.$purc_act_d_seq);
			addColumnPathMap(Purc_Ins01_DtlR.$arr_schd_no, Chk01_DtlR.$arr_schd_no);
			addColumnPathMap(Purc_Ins01_DtlR.$purc_schd_no, Chk01_DtlR.$purc_schd_no);
			addColumnPathMap(Purc_Ins01_DtlR.$mfg_inst_no, Chk01_DtlR.$mfg_inst_no);
			
			// 品目
			addColumnPathMap(Purc_Ins01_DtlR.$itm_cd, Chk01_DtlR.$itm_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$itm_nm, Chk01_DtlR.$itm_nm);
			addColumnPathMap(Purc_Ins01_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub1);
			addColumnPathMap(Purc_Ins01_DtlR.$itm_sub2, Chk01_DtlR.$itm_sub2);
			addColumnPathMap(Purc_Ins01_DtlR.$itm_sub3, Chk01_DtlR.$itm_sub3);
			addColumnPathMap(Purc_Ins01_DtlR.$iv_itm_nm, Chk01_DtlR.$iv_itm_nm);
			addColumnPathMap(Purc_Ins01_DtlR.$asset_mng_typ, Chk01_DtlR.$asset_mng_typ);
			addColumnPathMap(Purc_Ins01_DtlR.$stk_mng_typ, Chk01_DtlR.$stk_mng_typ);
			addColumnPathMap(Purc_Ins01_DtlR.$sundry_itm_flg, Chk01_DtlR.$sundry_itm_flg);
			addColumnPathMap(Purc_Ins01_DtlR.$maker_cd, Chk01_DtlR.$maker_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$sppl_itm_cd, Chk01_DtlR.$sppl_itm_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$sppl_itm_nm, Chk01_DtlR.$sppl_itm_nm);
			addColumnPathMap(Purc_Ins01_DtlR.$ncv_flg, Chk01_DtlR.$ncv_flg);
			// 再入荷
			addColumnPathMap(Purc_Ins01_DtlR.$re_arr_flg, Chk01_DtlR.$re_arr_flg);
			addColumnPathMap(Purc_Ins01_DtlR.$re_arr_loc_cd, Chk01_DtlR.$re_arr_loc_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$re_arr_loc_wg_cd, Chk01_DtlR.$re_arr_loc_wg_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$re_arr_rqst_tm, Chk01_DtlR.$re_arr_rqst_tm);
			addColumnPathMap(Purc_Ins01_DtlR.$re_arr_purc_schd_dt, Chk01_DtlR.$re_arr_purc_schd_dt);
			addColumnPathMap(Purc_Ins01_DtlR.$re_arr_str_ln_cd, Chk01_DtlR.$re_arr_str_ln_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$re_arr_sync_flg, Chk01_DtlR.$re_arr_sync_flg);
			addColumnPathMap(Purc_Ins01_DtlR.$trd_unit_re_arr_qty, Chk01_DtlR.$trd_unit_re_arr_qty);
			addColumnPathMap(Purc_Ins01_DtlR.$base_unit_re_arr_qty, Chk01_DtlR.$base_unit_re_arr_qty);

			// 場所・在庫
			addColumnPathMap(Purc_Ins01_DtlR.$in_to_loc_cd, Chk01_DtlR.$dlv_loc_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$in_to_loc_wg_cd, Chk01_DtlR.$dlv_loc_wg_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$str_ln_cd, Chk01_DtlR.$str_ln_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$lot_no, Chk01_DtlR.$lot_no);			
			addColumnPathMap(Purc_Ins01_DtlR.$sublot_no, Chk01_DtlR.$sublot_no);
			addColumnPathMap(Purc_Ins01_DtlR.$sno1, Chk01_DtlR.$sno1);
			addColumnPathMap(Purc_Ins01_DtlR.$sno2, Chk01_DtlR.$sno2);
			addColumnPathMap(Purc_Ins01_DtlR.$sno3, Chk01_DtlR.$sno3);
			addColumnPathMap(Purc_Ins01_DtlR.$sno4, Chk01_DtlR.$sno4);
			addColumnPathMap(Purc_Ins01_DtlR.$gd_cd, Chk01_DtlR.$gd_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$quality_typ, Chk01_DtlR.$quality_typ);
			addColumnPathMap(Purc_Ins01_DtlR.$ver_no, Chk01_DtlR.$ver_no);
			// 単価・金額・税
			addColumnPathMap(Purc_Ins01_DtlR.$purc_dtl_upd_flg, Chk01_DtlR.$purc_dtl_upd_flg);
			addColumnPathMap(Purc_Ins01_DtlR.$upri_not_tgt_flg, Chk01_DtlR.$upri_not_tgt_flg);
			addColumnPathMap(Purc_Ins01_DtlR.$interim_flg, Chk01_DtlR.$interim_flg);
			addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_amt, Chk01_DtlR.$trd_cur_amt);
			addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_onr_prov_amt, Chk01_DtlR.$trd_cur_onr_prov_amt);
			addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_proc_amt, Chk01_DtlR.$trd_cur_proc_amt);
			addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_dscnt_amt, Chk01_DtlR.$trd_cur_dscnt_amt);
			addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_onr_prov_upri, Chk01_DtlR.$trd_cur_onr_prov_upri);
			addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_proc_upri, Chk01_DtlR.$trd_cur_proc_upri);
			addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_tax_amt, Chk01_DtlR.$trd_cur_tax_amt);
			addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_upri, Chk01_DtlR.$trd_cur_upri);
			addColumnPathMap(Purc_Ins01_DtlR.$base_cur_amt, Chk01_DtlR.$base_cur_amt);
			addColumnPathMap(Purc_Ins01_DtlR.$base_cur_onr_prov_amt, Chk01_DtlR.$base_cur_onr_prov_amt);
			addColumnPathMap(Purc_Ins01_DtlR.$base_cur_proc_amt, Chk01_DtlR.$base_cur_proc_amt);
			addColumnPathMap(Purc_Ins01_DtlR.$base_cur_dscnt_amt, Chk01_DtlR.$base_cur_dscnt_amt);
			addColumnPathMap(Purc_Ins01_DtlR.$base_cur_onr_prov_upri, Chk01_DtlR.$base_cur_onr_prov_upri);
			addColumnPathMap(Purc_Ins01_DtlR.$base_cur_proc_upri, Chk01_DtlR.$base_cur_proc_upri);
			addColumnPathMap(Purc_Ins01_DtlR.$base_cur_tax_amt, Chk01_DtlR.$base_cur_tax_amt);
			addColumnPathMap(Purc_Ins01_DtlR.$base_cur_upri, Chk01_DtlR.$base_cur_upri);
			addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_amt, Chk01_DtlR.$ptax_cur_amt);
			addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_onr_prov_amt, Chk01_DtlR.$ptax_cur_onr_prov_amt);
			addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_proc_amt, Chk01_DtlR.$ptax_cur_proc_amt);
			addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_dscnt_amt, Chk01_DtlR.$ptax_cur_dscnt_amt);
			addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_onr_prov_upri, Chk01_DtlR.$ptax_cur_onr_prov_upri);
			addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_proc_upri, Chk01_DtlR.$ptax_cur_proc_upri);
			addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_tax_amt, Chk01_DtlR.$ptax_cur_tax_amt);
			addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_upri, Chk01_DtlR.$ptax_cur_upri);
			addColumnPathMap(Purc_Ins01_DtlR.$inc_tax_flg, Chk01_DtlR.$inc_tax_flg);
			addColumnPathMap(Purc_Ins01_DtlR.$tax_cd, Chk01_DtlR.$tax_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$tax_rate, Chk01_DtlR.$tax_rate);
			addColumnPathMap(Purc_Ins01_DtlR.$wtax_rate, Chk01_DtlR.$wtax_rate);
			addColumnPathMap(Purc_Ins01_DtlR.$wtax_amt, Chk01_DtlR.$trd_cur_wtax_amt);
			// 単位・数量
			addColumnPathMap(Purc_Ins01_DtlR.$trd_unit_cd, Chk01_DtlR.$trd_unit_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$trd_unit_qty, Chk01_DtlR.$trd_unit_qty);
			addColumnPathMap(Purc_Ins01_DtlR.$base_unit_cd, Chk01_DtlR.$base_unit_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$base_unit_qty, Chk01_DtlR.$base_unit_qty);
			
			// 負担項目
			addColumnPathMap(Purc_Ins01_DtlR.$bd_bp_cd, Chk01_DtlR.$bd_bp_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_ctg_cd, Chk01_DtlR.$bd_ctg_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_dpt_cd, Chk01_DtlR.$bd_dpt_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_itm_cd, Chk01_DtlR.$bd_itm_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_itm_sub1, Chk01_DtlR.$bd_itm_sub1);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_itm_sub2, Chk01_DtlR.$bd_itm_sub2);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_itm_sub3, Chk01_DtlR.$bd_itm_sub3);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_iv_no, Chk01_DtlR.$bd_iv_no);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_loc_cd, Chk01_DtlR.$bd_loc_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_lot_no, Chk01_DtlR.$bd_lot_no);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_oper_cd, Chk01_DtlR.$bd_oper_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_po_no, Chk01_DtlR.$bd_po_no);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_slo_no, Chk01_DtlR.$bd_slo_no);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_sno1, Chk01_DtlR.$bd_sno1);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_sno2, Chk01_DtlR.$bd_sno2);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_sno3, Chk01_DtlR.$bd_sno3);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_sno4, Chk01_DtlR.$bd_sno4);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_sublot_no, Chk01_DtlR.$bd_sublot_no);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_wg_cd, Chk01_DtlR.$bd_wg_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$bp_dlv_slip_d_no, Chk01_DtlR.$bp_dlv_slip_d_no);
			addColumnPathMap(Purc_Ins01_DtlR.$bp_dlv_slip_no, Chk01_DtlR.$bp_dlv_slip_no);
			addColumnPathMap(Purc_Ins01_DtlR.$bp_lot_no, Chk01_DtlR.$bp_lot_no);
			// 理由
			addColumnPathMap(Purc_Ins01_DtlR.$rsn_cd, Chk01_DtlR.$purc_rsn_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$dscnt_rsn_cd, Chk01_DtlR.$dscnt_rsn_cd);
			// 経費購買ＦＬＧ
			addColumnPathMap(Purc_Ins01_DtlR.$xpns_po_flg, Chk01_DtlR.$xpns_purc_flg);
			// 備考・予備
			addColumnPathMap(Purc_Ins01_DtlR.$intr_rmrks, Chk01_DtlR.$intr_d_rmrks);
			addColumnPathMap(Purc_Ins01_DtlR.$trd_d_rmrks, Chk01_DtlR.$trd_d_rmrks);
			addColumnPathMap(Purc_Ins01_DtlR.$sub_char1, Chk01_DtlR.$sub_char1);
			addColumnPathMap(Purc_Ins01_DtlR.$sub_char2, Chk01_DtlR.$sub_char2);
			addColumnPathMap(Purc_Ins01_DtlR.$sub_char3, Chk01_DtlR.$sub_char3);
			// その他
			addColumnPathMap(Purc_Ins01_DtlR.$accpt_dfct_flg, Chk01_DtlR.$accpt_dfct_flg);
			addColumnPathMap(Purc_Ins01_DtlR.$pay_crryovr_times, Chk01_DtlR.$pay_crryovr_times);
			addColumnPathMap(Purc_Ins01_DtlR.$arr_ptn_typ, Chk01_DtlR.$arr_ptn_typ);
			addColumnPathMap(Purc_Ins01_DtlR.$purc_id_typ, Chk01_DtlR.$purc_id_typ);
			addColumnPathMap(Purc_Ins01_DtlR.$abort_flg, Chk01_DtlR.$abort_flg);
			addColumnPathMap(Purc_Ins01_DtlR.$ap_dpt_cd, Chk01_DtlR.$ap_dpt_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$sync_flg, Chk01_DtlR.$sync_flg);
			addColumnPathMap(Purc_Ins01_DtlR.$accpt_dfct_flg, Chk01_DtlR.$accpt_dfct_flg);
			addColumnPathMap(Purc_Ins01_DtlR.$data_crud_typ, Chk01_DtlR.$data_crud_typ);
			addColumnPathMap(Purc_Ins01_DtlR.$disp_seq, Chk01_DtlR.$disp_seq);
			
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			// 仕入実績登録SVの明細登録用上り電文のhdr_peg_noには固定で"1"をセット
			dest.hdr_peg_no(1);
			
			if (MAC_DATA_CRUD_TYP.isCRT(src.data_crud_typ())
					|| MAC_DATA_CRUD_TYP.isUPD(src.data_crud_typ())) {
				
				// 負担部門設定時、ヘッダの発注先を負担取引先にセットする
				if (!isNull(src.bd_dpt_cd())) {
					dest.bd_bp_cd(_hdrR.sppl_cd());
				}
			}
		}
	}
	
	protected Map_Purc_Ins01_IoR_Chk01_IoR<Purc_Ins01_IoR,Chk01_IoR> createMap_Purc_Ins01_IoR_Chk01_IoR() {
		return new Map_Purc_Ins01_IoR_Chk01_IoR<Purc_Ins01_IoR, Chk01_IoR>();
	}

	public class Map_Purc_Ins01_IoR_Chk01_IoR<D extends Purc_Ins01_IoR, S extends Chk01_IoR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Purc_Ins01_IoR.$data_crud_typ, Chk01_IoR.$data_crud_typ);
			addColumnPathMap(Purc_Ins01_IoR.$outsrc_act_flg, Chk01_IoR.$outsrc_act_flg);
			addColumnPathMap(Purc_Ins01_IoR.$peg_no, Chk01_IoR.$peg_no);
			addColumnPathMap(Purc_Ins01_IoR.$dtl_peg_no, Chk01_IoR.$dtl_peg_no);
			addColumnPathMap(Purc_Ins01_IoR.$purc_act_io_no, Chk01_IoR.$purc_act_io_no);
			addColumnPathMap(Purc_Ins01_IoR.$purc_act_io_seq, Chk01_IoR.$purc_act_io_seq);
			addColumnPathMap(Purc_Ins01_IoR.$arr_act_no, Chk01_IoR.$arr_act_no);
			addColumnPathMap(Purc_Ins01_IoR.$ver_no, Chk01_IoR.$ver_no);
			addColumnPathMap(Purc_Ins01_IoR.$crt_lot_flg, Chk01_IoR.$crt_lot_flg);
			addColumnPathMap(Purc_Ins01_IoR.$lot_no, Chk01_IoR.$lot_no);
			addColumnPathMap(Purc_Ins01_IoR.$sublot_no, Chk01_IoR.$sublot_no);
			addColumnPathMap(Purc_Ins01_IoR.$quality_typ, Chk01_IoR.$quality_typ);
			addColumnPathMap(Purc_Ins01_IoR.$stk_insp_typ, Chk01_IoR.$stk_insp_typ);
			addColumnPathMap(Purc_Ins01_IoR.$stk_id_typ, Chk01_IoR.$stk_id_typ);
			addColumnPathMap(Purc_Ins01_IoR.$bp_lot_no, Chk01_IoR.$bp_lot_no);
			addColumnPathMap(Purc_Ins01_IoR.$bp_dlv_slip_no, Chk01_IoR.$bp_dlv_slip_no);
			addColumnPathMap(Purc_Ins01_IoR.$bp_dlv_slip_d_no, Chk01_IoR.$bp_dlv_slip_d_no);
			addColumnPathMap(Purc_Ins01_IoR.$trd_unit_cd, Chk01_IoR.$trd_unit_cd);
			addColumnPathMap(Purc_Ins01_IoR.$trd_unit_qty, Chk01_IoR.$trd_unit_qty);
			addColumnPathMap(Purc_Ins01_IoR.$base_unit_cd, Chk01_IoR.$base_unit_cd);
			addColumnPathMap(Purc_Ins01_IoR.$base_unit_qty, Chk01_IoR.$base_unit_qty);
			addColumnPathMap(Purc_Ins01_IoR.$pack_unit_cd, Chk01_IoR.$pack_unit_cd);
			addColumnPathMap(Purc_Ins01_IoR.$pack_unit_qty, Chk01_IoR.$pack_unit_qty);
			addColumnPathMap(Purc_Ins01_IoR.$purc_cont_qty, Chk01_IoR.$purc_cont_qty);
			// 仕入後の場所・格付
			addColumnPathMap(Purc_Ins01_IoR.$in_to_loc_cd, Chk01_IoR.$dlv_loc_cd);
			addColumnPathMap(Purc_Ins01_IoR.$in_to_loc_wg_cd, Chk01_IoR.$dlv_loc_wg_cd);
			addColumnPathMap(Purc_Ins01_IoR.$str_ln_cd, Chk01_IoR.$str_ln_cd);
			addColumnPathMap(Purc_Ins01_IoR.$gd_cd, Chk01_IoR.$gd_cd);
			// 仕入検収前の場所・格付
			addColumnPathMap(Purc_Ins01_IoR.$gi_wg_cd, Chk01_IoR.$gi_wg_cd);
			addColumnPathMap(Purc_Ins01_IoR.$gi_loc_cd, Chk01_IoR.$gi_loc_cd);
			addColumnPathMap(Purc_Ins01_IoR.$gi_str_ln_cd, Chk01_IoR.$gi_str_ln_cd);
			addColumnPathMap(Purc_Ins01_IoR.$gi_unit_cd, Chk01_IoR.$gi_unit_cd);
			addColumnPathMap(Purc_Ins01_IoR.$from_gd_cd, Chk01_IoR.$from_gd_cd);
			
			addColumnPathMap(Purc_Ins01_IoR.$sub_char1, Chk01_IoR.$sub_char1);
			addColumnPathMap(Purc_Ins01_IoR.$sub_char2, Chk01_IoR.$sub_char2);
			addColumnPathMap(Purc_Ins01_IoR.$sub_char3, Chk01_IoR.$sub_char3);
			
			addColumnPathMap(Purc_Ins01_IoR.$ship_fr_valid_dt, Chk01_IoR.$ship_fr_valid_dt);
			
		}
	}
	
	/**
	 * マッピング定義（ ヘッダ電文から、仕入実績サービスのChk03のヘッダ電文へ）
	 * @return
	 */
	protected Map_Purc_Chk03_HdrR_Chk01_HdrR<Purc_Chk03_HdrR,Chk01_HdrR> createMap_Purc_Chk03_HdrR_Chk01_HdrR() {
		return new Map_Purc_Chk03_HdrR_Chk01_HdrR<Purc_Chk03_HdrR, Chk01_HdrR>();
	}

	public class Map_Purc_Chk03_HdrR_Chk01_HdrR<D extends Purc_Chk03_HdrR, S extends Chk01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Purc_Chk03_HdrR.$data_crud_typ, Chk01_HdrR.$data_crud_typ);
			addColumnPathMap(Purc_Chk03_HdrR.$err_flg, Chk01_HdrR.$err_flg);
			addColumnPathMap(Purc_Chk03_HdrR.$trd_cd, Chk01_HdrR.$trd_cd);
			addColumnPathMap(Purc_Chk03_HdrR.$trd_ptn_typ, Chk01_HdrR.$trd_ptn_typ);
			addColumnPathMap(Purc_Chk03_HdrR.$purc_act_no, Chk01_HdrR.$purc_act_no);
			addColumnPathMap(Purc_Chk03_HdrR.$purc_act_seq, Chk01_HdrR.$purc_act_seq);
			addColumnPathMap(Purc_Chk03_HdrR.$po_no, Chk01_HdrR.$po_no);
			addColumnPathMap(Purc_Chk03_HdrR.$purc_dpt_cd, Chk01_HdrR.$purc_dpt_cd);
			addColumnPathMap(Purc_Chk03_HdrR.$purc_usr_cd, Chk01_HdrR.$purc_usr_cd);
			addColumnPathMap(Purc_Chk03_HdrR.$wg_cd, Chk01_HdrR.$wg_cd);
			addColumnPathMap(Purc_Chk03_HdrR.$sppl_cd, Chk01_HdrR.$sppl_cd);
			addColumnPathMap(Purc_Chk03_HdrR.$subcon_flg, Chk01_HdrR.$subcon_flg);
			addColumnPathMap(Purc_Chk03_HdrR.$trd_cur_cd, Chk01_HdrR.$trd_cur_cd);
			addColumnPathMap(Purc_Chk03_HdrR.$trd_rmrks, Chk01_HdrR.$trd_rmrks);
			addColumnPathMap(Purc_Chk03_HdrR.$intr_rmrks, Chk01_HdrR.$intr_rmrks);
			addColumnPathMap(Purc_Chk03_HdrR.$tterm_cd1, Chk01_HdrR.$tterm_cd1);
			addColumnPathMap(Purc_Chk03_HdrR.$tterm_rmrks1, Chk01_HdrR.$tterm_rmrks1);
			addColumnPathMap(Purc_Chk03_HdrR.$tterm_cd2, Chk01_HdrR.$tterm_cd2);
			addColumnPathMap(Purc_Chk03_HdrR.$tterm_rmrks2, Chk01_HdrR.$tterm_rmrks2);
			addColumnPathMap(Purc_Chk03_HdrR.$tterm_cd3, Chk01_HdrR.$tterm_cd3);
			addColumnPathMap(Purc_Chk03_HdrR.$tterm_rmrks3, Chk01_HdrR.$tterm_rmrks3);
			addColumnPathMap(Purc_Chk03_HdrR.$sub_char1, Chk01_HdrR.$sub_char1);
			addColumnPathMap(Purc_Chk03_HdrR.$sub_char2, Chk01_HdrR.$sub_char2);
			addColumnPathMap(Purc_Chk03_HdrR.$sub_char3, Chk01_HdrR.$sub_char3);
			addColumnPathMap(Purc_Chk03_HdrR.$purc_dt, Chk01_HdrR.$purc_dt);
			addColumnPathMap(Purc_Chk03_HdrR.$ac_dt, Chk01_HdrR.$ac_dt);
			addColumnPathMap(Purc_Chk03_HdrR.$can_ac_dt, Chk01_HdrR.$can_ac_dt);
			addColumnPathMap(Purc_Chk03_HdrR.$pay_basis_dt, Chk01_HdrR.$pay_basis_dt);
			addColumnPathMap(Purc_Chk03_HdrR.$xrate, Chk01_HdrR.$xrate);
			addColumnPathMap(Purc_Chk03_HdrR.$ptax_dt, Chk01_HdrR.$ptax_dt);
			addColumnPathMap(Purc_Chk03_HdrR.$ptax_xrate, Chk01_HdrR.$ptax_xrate);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.io_make_flg(true);
			dest.peg_no(1);
		}
		
	}
	
	/**
	 * マッピング定義（ 明細電文から、仕入実績サービスのChk03の明細電文へ）
	 * @return
	 */
	protected Map_Purc_Chk03_DtlR_Chk01_DtlR<Purc_Chk03_DtlR,Chk01_DtlR> createMap_Purc_Chk03_DtlR_Chk01_DtlR() {
		return new Map_Purc_Chk03_DtlR_Chk01_DtlR<Purc_Chk03_DtlR, Chk01_DtlR>();
	}

	public class Map_Purc_Chk03_DtlR_Chk01_DtlR<D extends Purc_Chk03_DtlR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Purc_Chk03_DtlR.$data_crud_typ, Chk01_DtlR.$data_crud_typ);
			addColumnPathMap(Purc_Chk03_DtlR.$peg_no, Chk01_DtlR.$peg_no);
			addColumnPathMap(Purc_Chk03_DtlR.$err_flg, Chk01_DtlR.$err_flg);
			addColumnPathMap(Purc_Chk03_DtlR.$arr_ptn_typ, Chk01_DtlR.$arr_ptn_typ);
			addColumnPathMap(Purc_Chk03_DtlR.$sync_flg, Chk01_DtlR.$sync_flg);
			addColumnPathMap(Purc_Chk03_DtlR.$purc_act_d_no, Chk01_DtlR.$purc_act_d_no);
			addColumnPathMap(Purc_Chk03_DtlR.$purc_act_d_seq, Chk01_DtlR.$purc_act_d_seq);
			addColumnPathMap(Purc_Chk03_DtlR.$po_d_no, Chk01_DtlR.$po_d_no);
			addColumnPathMap(Purc_Chk03_DtlR.$purc_schd_no, Chk01_DtlR.$purc_schd_no);
			addColumnPathMap(Purc_Chk03_DtlR.$arr_schd_no, Chk01_DtlR.$arr_schd_no);
			addColumnPathMap(Purc_Chk03_DtlR.$mfg_inst_no, Chk01_DtlR.$mfg_inst_no);
			addColumnPathMap(Purc_Chk03_DtlR.$itm_cd, Chk01_DtlR.$itm_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub1);
			addColumnPathMap(Purc_Chk03_DtlR.$itm_sub2, Chk01_DtlR.$itm_sub2);
			addColumnPathMap(Purc_Chk03_DtlR.$itm_sub3, Chk01_DtlR.$itm_sub3);
			addColumnPathMap(Purc_Chk03_DtlR.$ver_no, Chk01_DtlR.$ver_no);
			addColumnPathMap(Purc_Chk03_DtlR.$itm_nm, Chk01_DtlR.$itm_nm);
			addColumnPathMap(Purc_Chk03_DtlR.$iv_itm_nm, Chk01_DtlR.$iv_itm_nm);
			addColumnPathMap(Purc_Chk03_DtlR.$sppl_itm_cd, Chk01_DtlR.$sppl_itm_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$sppl_itm_nm, Chk01_DtlR.$sppl_itm_nm);
			addColumnPathMap(Purc_Chk03_DtlR.$sundry_itm_flg, Chk01_DtlR.$sundry_itm_flg);
			addColumnPathMap(Purc_Chk03_DtlR.$trd_unit_cd, Chk01_DtlR.$trd_unit_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$trd_unit_qty, Chk01_DtlR.$trd_unit_qty);
			addColumnPathMap(Purc_Chk03_DtlR.$base_unit_cd, Chk01_DtlR.$base_unit_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$base_unit_qty, Chk01_DtlR.$base_unit_qty);
			addColumnPathMap(Purc_Chk03_DtlR.$upri_not_tgt_flg, Chk01_DtlR.$upri_not_tgt_flg);
			addColumnPathMap(Purc_Chk03_DtlR.$interim_flg, Chk01_DtlR.$interim_flg);
			addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_upri, Chk01_DtlR.$trd_cur_upri);
			addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_proc_upri, Chk01_DtlR.$trd_cur_proc_upri);
			addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_onr_prov_upri, Chk01_DtlR.$trd_cur_onr_prov_upri);
			addColumnPathMap(Purc_Chk03_DtlR.$rsn_cd, Chk01_DtlR.$purc_rsn_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$dscnt_rsn_cd, Chk01_DtlR.$dscnt_rsn_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_dscnt_amt, Chk01_DtlR.$trd_cur_dscnt_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_amt, Chk01_DtlR.$trd_cur_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_proc_amt, Chk01_DtlR.$trd_cur_proc_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_onr_prov_amt, Chk01_DtlR.$trd_cur_onr_prov_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_tax_amt, Chk01_DtlR.$trd_cur_tax_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$tax_cd, Chk01_DtlR.$tax_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$base_cur_upri, Chk01_DtlR.$base_cur_upri);
			addColumnPathMap(Purc_Chk03_DtlR.$base_cur_proc_upri, Chk01_DtlR.$base_cur_proc_upri);
			addColumnPathMap(Purc_Chk03_DtlR.$base_cur_onr_prov_upri, Chk01_DtlR.$base_cur_onr_prov_upri);
			addColumnPathMap(Purc_Chk03_DtlR.$base_cur_dscnt_amt, Chk01_DtlR.$base_cur_dscnt_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$base_cur_amt, Chk01_DtlR.$base_cur_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$base_cur_proc_amt, Chk01_DtlR.$base_cur_proc_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$base_cur_onr_prov_amt, Chk01_DtlR.$base_cur_onr_prov_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$base_cur_tax_amt, Chk01_DtlR.$base_cur_tax_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$ptax_cur_upri, Chk01_DtlR.$ptax_cur_upri);
			addColumnPathMap(Purc_Chk03_DtlR.$ptax_cur_proc_upri, Chk01_DtlR.$ptax_cur_proc_upri);
			addColumnPathMap(Purc_Chk03_DtlR.$ptax_cur_onr_prov_upri, Chk01_DtlR.$ptax_cur_onr_prov_upri);
			addColumnPathMap(Purc_Chk03_DtlR.$ptax_cur_dscnt_amt, Chk01_DtlR.$ptax_cur_dscnt_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$ptax_cur_amt, Chk01_DtlR.$ptax_cur_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$ptax_cur_proc_amt, Chk01_DtlR.$ptax_cur_proc_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$ptax_cur_onr_prov_amt, Chk01_DtlR.$ptax_cur_onr_prov_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$ptax_cur_tax_amt, Chk01_DtlR.$ptax_cur_tax_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$wtax_rate, Chk01_DtlR.$wtax_rate);
			addColumnPathMap(Purc_Chk03_DtlR.$wtax_amt, Chk01_DtlR.$trd_cur_wtax_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$abort_flg, Chk01_DtlR.$abort_flg);
			addColumnPathMap(Purc_Chk03_DtlR.$accpt_dfct_flg, Chk01_DtlR.$accpt_dfct_flg);
			addColumnPathMap(Purc_Chk03_DtlR.$re_arr_flg, Chk01_DtlR.$re_arr_flg);
			addColumnPathMap(Purc_Chk03_DtlR.$re_arr_loc_cd, Chk01_DtlR.$re_arr_loc_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$re_arr_loc_wg_cd, Chk01_DtlR.$re_arr_loc_wg_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$re_arr_str_ln_cd, Chk01_DtlR.$re_arr_str_ln_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$trd_unit_re_arr_qty, Chk01_DtlR.$trd_unit_re_arr_qty);
			addColumnPathMap(Purc_Chk03_DtlR.$base_unit_re_arr_qty, Chk01_DtlR.$base_unit_re_arr_qty);
			addColumnPathMap(Purc_Chk03_DtlR.$re_arr_rqst_tm, Chk01_DtlR.$re_arr_rqst_tm);
			addColumnPathMap(Purc_Chk03_DtlR.$re_arr_purc_schd_dt, Chk01_DtlR.$re_arr_purc_schd_dt);
			addColumnPathMap(Purc_Chk03_DtlR.$re_arr_sync_flg, Chk01_DtlR.$re_arr_sync_flg);
			addColumnPathMap(Purc_Chk03_DtlR.$ncv_flg, Chk01_DtlR.$ncv_flg);
			addColumnPathMap(Purc_Chk03_DtlR.$maker_cd, Chk01_DtlR.$maker_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$ap_dpt_cd, Chk01_DtlR.$ap_dpt_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$pay_crryovr_times, Chk01_DtlR.$pay_crryovr_times);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_itm_cd, Chk01_DtlR.$bd_itm_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_itm_sub1, Chk01_DtlR.$bd_itm_sub1);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_itm_sub2, Chk01_DtlR.$bd_itm_sub2);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_itm_sub3, Chk01_DtlR.$bd_itm_sub3);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_sno1, Chk01_DtlR.$bd_sno1);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_sno2, Chk01_DtlR.$bd_sno2);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_sno3, Chk01_DtlR.$bd_sno3);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_sno4, Chk01_DtlR.$bd_sno4);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_lot_no, Chk01_DtlR.$bd_lot_no);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_sublot_no, Chk01_DtlR.$bd_sublot_no);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_ctg_cd, Chk01_DtlR.$bd_ctg_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_oper_cd, Chk01_DtlR.$bd_oper_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_iv_no, Chk01_DtlR.$bd_iv_no);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_loc_cd, Chk01_DtlR.$bd_loc_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_po_no, Chk01_DtlR.$bd_po_no);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_slo_no, Chk01_DtlR.$bd_slo_no);
			addColumnPathMap(Purc_Chk03_DtlR.$stk_mng_typ, Chk01_DtlR.$stk_mng_typ);
			addColumnPathMap(Purc_Chk03_DtlR.$asset_mng_typ, Chk01_DtlR.$asset_mng_typ);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_dpt_cd, Chk01_DtlR.$bd_dpt_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$trd_d_rmrks, Chk01_DtlR.$trd_d_rmrks);
			addColumnPathMap(Purc_Chk03_DtlR.$sub_char1, Chk01_DtlR.$sub_char1);
			addColumnPathMap(Purc_Chk03_DtlR.$sub_char2, Chk01_DtlR.$sub_char2);
			addColumnPathMap(Purc_Chk03_DtlR.$sub_char3, Chk01_DtlR.$sub_char3);
			addColumnPathMap(Purc_Chk03_DtlR.$gd_cd, Chk01_DtlR.$gd_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$sno1, Chk01_DtlR.$sno1);
			addColumnPathMap(Purc_Chk03_DtlR.$sno2, Chk01_DtlR.$sno2);
			addColumnPathMap(Purc_Chk03_DtlR.$sno3, Chk01_DtlR.$sno3);
			addColumnPathMap(Purc_Chk03_DtlR.$sno4, Chk01_DtlR.$sno4);
			addColumnPathMap(Purc_Chk03_DtlR.$dlv_loc_cd, Chk01_DtlR.$dlv_loc_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$dlv_loc_wg_cd, Chk01_DtlR.$dlv_loc_wg_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$str_ln_cd, Chk01_DtlR.$str_ln_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$lot_no, Chk01_DtlR.$lot_no);
			addColumnPathMap(Purc_Chk03_DtlR.$sublot_no, Chk01_DtlR.$sublot_no);
			addColumnPathMap(Purc_Chk03_DtlR.$quality_typ, Chk01_DtlR.$quality_typ);
			addColumnPathMap(Purc_Chk03_DtlR.$purc_id_typ, Chk01_DtlR.$purc_id_typ);
			addColumnPathMap(Purc_Chk03_DtlR.$bp_lot_no, Chk01_DtlR.$bp_lot_no);
			addColumnPathMap(Purc_Chk03_DtlR.$bp_dlv_slip_no, Chk01_DtlR.$bp_dlv_slip_no);
			addColumnPathMap(Purc_Chk03_DtlR.$bp_dlv_slip_d_no, Chk01_DtlR.$bp_dlv_slip_d_no);
			addColumnPathMap(Purc_Chk03_DtlR.$ship_fr_valid_dt, Chk01_DtlR.$ship_fr_valid_dt);
			addColumnPathMap(Purc_Chk03_DtlR.$disp_seq, Chk01_DtlR.$disp_seq);

		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			// ヘッダの紐付NOは1固定 (単票画面の為)
			dest.hdr_peg_no(1);
			dest.pad().in_to_loc_cd(src.dlv_loc_cd());
			dest.pad().in_to_loc_wg_cd(src.dlv_loc_wg_cd());
			
		}
		
	}
	
	/**
	 * マッピング定義（詳細電文から、仕入実績サービスのChk03の詳細電文へ）
	 * @return
	 */
	protected Map_Purc_Chk03_IoR_Chk01_IoR<Purc_Chk03_IoR,Chk01_IoR> createMap_Purc_Chk03_IoR_Chk01_IoR() {
		return new Map_Purc_Chk03_IoR_Chk01_IoR<Purc_Chk03_IoR, Chk01_IoR>();
	}

	public class Map_Purc_Chk03_IoR_Chk01_IoR<D extends Purc_Chk03_IoR, S extends Chk01_IoR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Purc_Chk03_IoR.$data_crud_typ, Chk01_IoR.$data_crud_typ);
			addColumnPathMap(Purc_Chk03_IoR.$dtl_peg_no, Chk01_IoR.$dtl_peg_no);
			addColumnPathMap(Purc_Chk03_IoR.$peg_no, Chk01_IoR.$peg_no);
			addColumnPathMap(Purc_Chk03_IoR.$err_flg, Chk01_IoR.$err_flg);
			addColumnPathMap(Purc_Chk03_IoR.$purc_act_io_no, Chk01_IoR.$purc_act_io_no);
			addColumnPathMap(Purc_Chk03_IoR.$purc_act_io_seq, Chk01_IoR.$purc_act_io_seq);
			addColumnPathMap(Purc_Chk03_IoR.$arr_act_no, Chk01_IoR.$arr_act_no);
			addColumnPathMap(Purc_Chk03_IoR.$trd_unit_cd, Chk01_IoR.$trd_unit_cd);
			addColumnPathMap(Purc_Chk03_IoR.$trd_unit_qty, Chk01_IoR.$trd_unit_qty);
			addColumnPathMap(Purc_Chk03_IoR.$base_unit_cd, Chk01_IoR.$base_unit_cd);
			addColumnPathMap(Purc_Chk03_IoR.$base_unit_qty, Chk01_IoR.$base_unit_qty);
			addColumnPathMap(Purc_Chk03_IoR.$pack_unit_cd, Chk01_IoR.$pack_unit_cd);
			addColumnPathMap(Purc_Chk03_IoR.$pack_unit_qty, Chk01_IoR.$pack_unit_qty);
			addColumnPathMap(Purc_Chk03_IoR.$ver_no, Chk01_IoR.$ver_no);
			addColumnPathMap(Purc_Chk03_IoR.$gd_cd, Chk01_IoR.$gd_cd);
			addColumnPathMap(Purc_Chk03_IoR.$gi_wg_cd, Chk01_IoR.$gi_wg_cd);
			addColumnPathMap(Purc_Chk03_IoR.$gi_loc_cd, Chk01_IoR.$gi_loc_cd);
			addColumnPathMap(Purc_Chk03_IoR.$gi_str_ln_cd, Chk01_IoR.$gi_str_ln_cd);
			addColumnPathMap(Purc_Chk03_IoR.$gi_unit_cd, Chk01_IoR.$gi_unit_cd);
			addColumnPathMap(Purc_Chk03_IoR.$from_gd_cd, Chk01_IoR.$from_gd_cd);
			addColumnPathMap(Purc_Chk03_IoR.$dlv_loc_cd, Chk01_IoR.$dlv_loc_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$dlv_loc_wg_cd, Chk01_IoR.$dlv_loc_wg_cd);
			addColumnPathMap(Purc_Chk03_IoR.$str_ln_cd, Chk01_IoR.$str_ln_cd);
			addColumnPathMap(Purc_Chk03_IoR.$crt_lot_flg, Chk01_IoR.$crt_lot_flg);
			addColumnPathMap(Purc_Chk03_IoR.$lot_no, Chk01_IoR.$lot_no);
			addColumnPathMap(Purc_Chk03_IoR.$sublot_no, Chk01_IoR.$sublot_no);
			addColumnPathMap(Purc_Chk03_IoR.$quality_typ, Chk01_IoR.$quality_typ);
			addColumnPathMap(Purc_Chk03_IoR.$stk_insp_typ, Chk01_IoR.$stk_insp_typ);
			addColumnPathMap(Purc_Chk03_IoR.$stk_id_typ, Chk01_IoR.$stk_id_typ);
			addColumnPathMap(Purc_Chk03_IoR.$bp_lot_no, Chk01_IoR.$bp_lot_no);
			addColumnPathMap(Purc_Chk03_IoR.$bp_dlv_slip_no, Chk01_IoR.$bp_dlv_slip_no);
			addColumnPathMap(Purc_Chk03_IoR.$bp_dlv_slip_d_no, Chk01_IoR.$bp_dlv_slip_d_no);
			addColumnPathMap(Purc_Chk03_IoR.$ship_fr_valid_dt, Chk01_IoR.$ship_fr_valid_dt);
			addColumnPathMap(Purc_Chk03_IoR.$sub_char1, Chk01_IoR.$sub_char1);
			addColumnPathMap(Purc_Chk03_IoR.$sub_char2, Chk01_IoR.$sub_char2);
			addColumnPathMap(Purc_Chk03_IoR.$sub_char3, Chk01_IoR.$sub_char3);
			addColumnPathMap(Purc_Chk03_IoR.$purc_cont_qty, Chk01_IoR.$purc_cont_qty);

		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.pai().in_to_loc_cd(src.dlv_loc_cd());
			dest.pai().in_to_loc_wg_cd(src.dlv_loc_wg_cd());
		}
		
	}
	/**
	 * Sprt01オペレーション.<p>
	 *
	 */
	public class Sprt01 extends MSBDL_PurcReg_MC_A.Sprt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			setUpriInfo();
		}

		protected void editUp() {
			MCList<MST_PO_D_R> poDL = getPoD();
			MCIndexKey poDIdx = poDL.createIndex(MST_PO_D_R.$po_d_no);
			
			for (Chk01_DtlR up1R : up1()) {
				MST_PO_D_R poDR = poDL.getFirst(poDIdx, up1R.po_d_no());
				if (!isNull(poDR)) {
					up1R.po_no(poDR.po_no());
					up1R.addStringColumn("outsrc_itm_ord_no", poDR.outsrc_itm_ord_no());
					up1R.rqst_avl_rqst_dt(poDR.rqst_avl_rqst_dt());
					up1R.outsrc_flg(poDR.outsrc_flg());
				}
				up1R.addBooleanColumn("not_add_up_qty_flg", getNotAddUpQtyFlg(up1R));
			}
		}
		protected boolean getNotAddUpQtyFlg(Chk01_DtlR up1R) {
			if (!up1R.outsrc_flg()) {
				return false;
			}
			return true;
		}
		protected MCList<MST_PO_D_R> getPoD(){
			MCQueryApiBuilder poDWkBldr = MCQueryApiBuilder.create(MST_PO_D_R.create("POD_KEY"));
			dbWkDelete("MSBDL0140_MSW_PO_D_D01", poDWkBldr.getBaseDbc());
			dbWkInsert("MSBDL0140_MSW_PO_D_I01", up1().groupBy(Chk01_DtlR.$po_d_no), poDWkBldr.getBaseDbc());
			
			MCList<MST_PO_D_R> poDL = MCList.create(MST_PO_D_R.class);
			MST_PO_D_R poD = MST_PO_D_R.create("PO_D");
			MSW_PO_D_KEY_R poDKey = MSW_PO_D_KEY_R.create("PO_D_KEY");
			MCQueryApiBuilder poDL_bldr = MCQueryApiBuilder.create(poD);
			poDL_bldr.setSelect(poD.po_d_no);
			poDL_bldr.addSelect(poD.po_no);
			poDL_bldr.addSelect(poD.outsrc_itm_ord_no);
			poDL_bldr.addSelect(poD.rqst_avl_rqst_dt);
			poDL_bldr.addSelect(poD.outsrc_flg);
			poDL_bldr.addInnerJoin(poDKey, poD.po_d_no.eq(poDKey.po_d_no));
			dbSelect("MSBDL0140_MST_PO_D_S02", poDL, poDL_bldr);
			
			return poDL;
		}

		/**
		 * 単価情報の取得および金額情報を算出します。
		 */
		protected void setUpriInfo() {
			
			MCList<Chk01_DtlR> tmpL = MCList.create(Chk01_DtlR.class);
			if (isNullOr(up0().sppl_cd(), up0().trd_cur_cd(), up0().purc_dt())) {
				return;
			}
			
			for (Chk01_DtlR r : up1()) {
				if (!isNullOr(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(),
						r.trd_unit_cd(), r.trd_unit_qty(), r.dlv_loc_wg_cd())) {
					tmpL.add(r);
				}
			}
			
			// 単価取得対象が存在しない場合中断
			if (tmpL.size() == 0) {
				return;
			}

			editUpriGrpNo(tmpL);

			MSBDL_PurcUtil.PurcUtil_Srch02 purcUtilSrch02 = MSBDL_PurcUtil.crtPurcUtil_Srch02();
			Map_PurcUtil_Srch02_DtlR_Chk01_DtlR<PurcUtil_Srch02_DtlR, Chk01_DtlR> map = createMap_PurcUtil_Srch02_DtlR_Chk01_DtlR();
			map.setWith(up0());
			addAll(purcUtilSrch02.up0(), tmpL, map);
			
			purcUtilSrch02.exec();
			String[] destCols = {Chk01_DtlR.$trd_cur_upri, Chk01_DtlR.$trd_cur_proc_upri, Chk01_DtlR.$trd_cur_onr_prov_upri, Chk01_DtlR.$interim_flg};
			String[] srcCols = {PurcUtil_Srch02_DtlR.$trd_cur_upri, PurcUtil_Srch02_DtlR.$trd_cur_proc_upri, PurcUtil_Srch02_DtlR.$trd_cur_onr_prov_upri, PurcUtil_Srch02_DtlR.$interim_flg};
			copyByPegNo(tmpL, destCols, purcUtilSrch02.down0(), srcCols);
			
			down0().setAll(tmpL);

		}

		protected void editUpriGrpNo(MCList<Chk01_DtlR> upriL) {
			int grpNo = 1;
			for (MCList<Chk01_DtlR> poGrpL : upriL.groupList(Chk01_DtlR.$po_no)) {
				int poGrpNo = 0;
				for (Chk01_DtlR poGrpR : poGrpL) {
					if (isNull(poGrpR.po_d_no())) {
						poGrpR.addStringColumn("upri_grp_no", "0");
					}
					else {
						if (isSame(poGrpR.trd_unit_cd(), poGrpR.src_trd_unit_cd())) {
							poGrpR.addStringColumn("upri_grp_no", String.valueOf(grpNo++));
						}
						else {
							if (poGrpNo == 0) {
								poGrpNo = grpNo++;
							}
							poGrpR.addStringColumn("upri_grp_no", String.valueOf(poGrpNo));
						}
					}
				}
			}
		}
		
		/**
		 * RowMapper<br>
		 * 上り電文(Chk01_DtlR) -> 購買共通ユーティリティ・サービス(PurcUtil_Srch02_DtlR)<br>
		 */
		protected Map_PurcUtil_Srch02_DtlR_Chk01_DtlR<PurcUtil_Srch02_DtlR,Chk01_DtlR> createMap_PurcUtil_Srch02_DtlR_Chk01_DtlR() {
			return new Map_PurcUtil_Srch02_DtlR_Chk01_DtlR<PurcUtil_Srch02_DtlR, Chk01_DtlR>();
		}

		public class Map_PurcUtil_Srch02_DtlR_Chk01_DtlR<D extends PurcUtil_Srch02_DtlR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
			protected Chk01_HdrR _hdrR;
			
			public void setWith(Chk01_HdrR hdrR) {
				this._hdrR = hdrR;
			}			
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcUtil_Srch02_DtlR.$peg_no, Chk01_DtlR.$peg_no);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$itm_cd, Chk01_DtlR.$itm_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub1);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$itm_sub2, Chk01_DtlR.$itm_sub2);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$itm_sub3, Chk01_DtlR.$itm_sub3);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$maker_cd, Chk01_DtlR.$maker_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$trd_unit_cd, Chk01_DtlR.$trd_unit_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$trd_unit_qty, Chk01_DtlR.$trd_unit_qty);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$base_unit_qty, Chk01_DtlR.$base_unit_qty);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$wg_cd, Chk01_DtlR.$dlv_loc_wg_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$in_to_loc_cd, Chk01_DtlR.$dlv_loc_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$tax_cd, Chk01_DtlR.$tax_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$sno1, Chk01_DtlR.$sno1);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$sno2, Chk01_DtlR.$sno2);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$sno3, Chk01_DtlR.$sno3);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$sno4, Chk01_DtlR.$sno4);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$dlv_cd, Chk01_DtlR.$scst_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$mfg_loc_cd, Chk01_DtlR.$mfg_loc_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$bom_ptn, Chk01_DtlR.$bom_ptn);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$mfg_inst_no, Chk01_DtlR.$mfg_inst_no);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$rqst_dlv_rqst_dt, Chk01_DtlR.$rqst_avl_rqst_dt);
				
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.grp_no(src.getStringNE("upri_grp_no"));
				dest.base_dt(_hdrR.purc_dt());
				dest.sppl_cd(_hdrR.sppl_cd());
				dest.cur_cd(_hdrR.trd_cur_cd());
				dest.outsrc_itm_ord_no(src.getStringNE("outsrc_itm_ord_no"));
				dest.not_add_up_qty_flg(src.getBooleanNE("not_add_up_qty_flg"));
				
			}
			
		}

	}

	protected void chkDpt(Chk01_HdrR up0, MCList<Chk01_DtlR> up1) {
		setDpt(up0, Chk01_HdrR.$purc_dpt_cd, Chk01_HdrR.$ac_dt);
		up1.addDateColumn(Chk01_HdrR.$ac_dt, up0.ac_dt());
		setDpt(up1, Chk01_DtlR.$ap_dpt_cd, Chk01_HdrR.$ac_dt);
		setDpt(up1, Chk01_DtlR.$bd_dpt_cd, Chk01_HdrR.$ac_dt);
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

	//FMCB CUSTOM END
}