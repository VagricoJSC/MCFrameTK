package mcframe.serverMSBB.MSBBL6220;

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
import mcframe.serverMSBG.MSBGL5080.*;
import mcframe.serverMSBE.MSBEL5020.*;
import mcframe.serverMSBB.MSBBL6220.*; // このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBE.MSBEL5500.*;
import static mcframe.serverMSUC.MSUCL0070.MSUCL_StkUtil.*;
import mcframe.serverMSUC.MSUCL0080.MSUCL_SlsUtil;
import mcframe.serverFXUC.FXUCL0030.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverCore.sys.MCSys;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBBL_SlsSchdService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBBL_SlsSchdService_MC extends MSBBL_SlsSchdService_MC_A{
	//FMCB CUSTOM START

	//与信更新対象の行毎の与信額を保存する一時変数
	protected MCList<Cred_Upd01_CndR> _credAmtL;
	/** キャッシュ　取引先マスタ */
	protected FXUCL_MCDbcCache<MAM_BP_R> _cacheBp = null;
	/** キャッシュ　取引先マスタ */
	protected FXUCL_MCDbcCache<MAM_ITM_R> _cacheItm = null;
	/** キャッシュ　品目単位マスタ */
	protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _cacheItmUnitL = null;
	
	/**
	 * キャッシュを管理するリクエストオブジェクト
	 */
	protected static final Class<MSBBL_SlsSchdService> CLAZZ = MSBBL_SlsSchdService.class;

	/**
	 * Sls_Schd_Upd01オペレーション.<p>
	 *
	 */
	public class Sls_Schd_Upd01 extends MSBBL_SlsSchdService_MC_A.Sls_Schd_Upd01 {

		/**
		 * 計画外売上実績（インボイス取引対象）の売上予定リスト
		 */
		protected MCList<MST_SLS_SCHD_R> _uplndIvSlsSchdL = null;
		
		/**
		 *  計画外売上実績（インボイス取引対象）の売上予定リストのインデックス
		 */
		protected MCIndexKey _uplndIvSlsSchdIdx = null;
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			_credAmtL = MCList.create(Cred_Upd01_CndR.class);
			// 計画外出荷実績の訂正時に売上済数量の保持
			setShipActDelInsSlsQty();
			//売上予定更新
			updSlsSchd();
			//与信更新
			updCred();
		}
		
		/**
		 * 売上予定更新
		 */
		protected void updSlsSchd() {
			//上り電文取得
			MCList<Sls_Schd_Upd01_DtlR> upd01DtlList = up0();
			// キャッシュ取得
			MCList<MST_SLO_D_R> cacheSloDL = MCList.create(MST_SLO_D_R.class);
			MCList<MST_SLO_R> cacheSloL = MCList.create(MST_SLO_R.class);
			createCache(upd01DtlList, cacheSloDL, cacheSloL);
			MCIndexKey idxCacheSloDL = cacheSloDL.createIndex(MST_SLO_D_R.$slo_d_no);
			MCIndexKey idxCacheSloL = cacheSloL.createIndex(MST_SLO_R.$slo_no);
			
			doSeqCache(MSC_NUM_SYS_TYP.SLSSCHD, upd01DtlList.subList(Sls_Schd_Upd04_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value()).size());
			MCList<MST_SLS_SCHD_R> insSlsSchdL = MCList.create(MST_SLS_SCHD_R.class);
			//上り電文に対し、繰り返し処理
			for (Sls_Schd_Upd01_DtlR upd01DtlRow : upd01DtlList) {
				//受注明細データの変数
				MST_SLO_D_R mstSloDR = MST_SLO_D_R.create();
				if (!isNull(upd01DtlRow.slo_d_no())) {
					mstSloDR = cacheSloDL.getFirst(idxCacheSloDL, upd01DtlRow.slo_d_no());	
				}
				//受注ヘッダデータの変数
				MST_SLO_R mstSloR = MST_SLO_R.create();
				if (!isNull(mstSloDR.slo_no())) {
					mstSloR = cacheSloL.getFirst(idxCacheSloL, mstSloDR.slo_no());
				}

				if (!MSC_SLS_SCHD_SRC_TYP.isSHIP_ACT_D(upd01DtlRow.sls_schd_src_typ())) {
					//貸出FLG＝オンの場合、売上予定を削除して、次のレコードの処理にする
					if (mstSloDR.vmi_flg()) {
						if (MAC_DATA_CRUD_TYP.isUPD(upd01DtlRow.data_crud_typ())) {
							MST_SLS_SCHD_R t = MST_SLS_SCHD_R.create("T");
							execDbDelete("MSBBL6220_MST_SLS_SCHD_D01", t,
									t.slo_d_no.eq(bind("1")), upd01DtlRow.slo_d_no());
						}
						continue;
					}
				}

				//売上予定ロック時に取得したデータを一時変数（ロックした売上予定）に保存する。
				MST_SLS_SCHD_R lockedSlsSchdR = MST_SLS_SCHD_R.create("T");
				MCQueryApiBuilder lockedSlsSchdR_bldr = MCQueryApiBuilder.create(lockedSlsSchdR);
				
				if (MAC_DATA_CRUD_TYP.isUPD(upd01DtlRow.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isDEL(upd01DtlRow.data_crud_typ())) {
					//上り電文.売上予定作成元区分　＝　出荷予定の場合
					if (MSC_SLS_SCHD_SRC_TYP
							.isSHIP_SCHD(upd01DtlRow.sls_schd_src_typ())) {
						//データ更新区分が更新、削除の行に対して、上り電文.出荷予定NOで売上予定をロックする
						lockedSlsSchdR_bldr.setWhere(lockedSlsSchdR.ship_schd_no.eq(bind("1")),
								upd01DtlRow.ship_schd_no());
						lockedSlsSchdR_bldr.addWhereWithAnd(lockedSlsSchdR.dlv_slip_d_no.isNull());
						if (MAC_DATA_CRUD_TYP.isDEL(upd01DtlRow.data_crud_typ())) {
							lockedSlsSchdR_bldr.addWhereWithAnd(lockedSlsSchdR.wg_rqst_no.isNull()
									.and(lockedSlsSchdR.po_schd_no.isNull()));
						}
						dbSelect("MSBBL6220_MST_SLS_SCHD_S01", lockedSlsSchdR, lockedSlsSchdR_bldr);
					}
					//上り電文.売上予定作成元区分　＝　受注明細の場合
					if (MSC_SLS_SCHD_SRC_TYP.isSLO_D(upd01DtlRow.sls_schd_src_typ())) {
						//データ更新区分が更新、削除の行に対して、上り電文.受注明細NOで売上予定をロックする
						lockedSlsSchdR_bldr.setWhere(lockedSlsSchdR.slo_d_no.eq(bind("1")),
								upd01DtlRow.slo_d_no());
						lockedSlsSchdR_bldr.addWhereWithAnd(lockedSlsSchdR.ship_schd_no.isNull());
						dbSelectForUpdate("MSBBL6220_MST_SLS_SCHD_S02", lockedSlsSchdR, lockedSlsSchdR_bldr);
					}
					//上り電文.売上予定作成元区分　＝　出荷実績明細の場合	
					if (MSC_SLS_SCHD_SRC_TYP.isSHIP_ACT_D(upd01DtlRow.sls_schd_src_typ())) {
						//データ更新区分が更新、削除の行に対して、上り電文.納品伝票明細NOで売上予定をロックする
						lockedSlsSchdR_bldr.setWhere(lockedSlsSchdR.dlv_slip_d_no.eq(bind("1")),
								upd01DtlRow.dlv_slip_d_no());
						dbSelectForUpdate("MSBBL6220_MST_SLS_SCHD_S03", lockedSlsSchdR, lockedSlsSchdR_bldr);
					}
				}

				//納品伝票明細（MST_DLV_SLIP_D）データの変数
				MST_DLV_SLIP_D_R mstDlvSlipDR = MST_DLV_SLIP_D_R.create("T");
				
				//上り電文.売上予定作成元区分　＝　出荷実績明細の場合	
				if (MSC_SLS_SCHD_SRC_TYP.isSHIP_ACT_D(upd01DtlRow.sls_schd_src_typ())) {
					MCQueryApiBuilder mstDlvSlipDR_bldr = MCQueryApiBuilder.create(mstDlvSlipDR);
					
					//データ更新区分が新規、更新の行に対し、納品伝票明細NOで納品伝票明細・納品伝票ヘッダ、情報を取得する。
					if (MAC_DATA_CRUD_TYP.isDEL(upd01DtlRow.data_crud_typ())) {
						MCTempView t1 = createTempView("T1");
						MST_DLV_SLIP_R S1TA = MST_DLV_SLIP_R.create("TA");
						MST_DLV_SLIP_R t2 = MST_DLV_SLIP_R.create("T2");

						mstDlvSlipDR_bldr.addInnerJoin(
										subQuery().select(S1TA.dlv_slip_no, max(S1TA.dlv_slip_seq).as("dlv_slip_seq"))
												.from(S1TA)
												.where(S1TA.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CAN.value())))
												.groupBy(S1TA.dlv_slip_no).view(t1),
										bracket(mstDlvSlipDR.dlv_slip_no.eq(t1.pr(S1TA.dlv_slip_no))
												.and(mstDlvSlipDR.dlv_slip_seq.eq(t1.pr("dlv_slip_seq")))));
						mstDlvSlipDR_bldr.addInnerJoin(t2,
								bracket(t1.pr(S1TA.dlv_slip_no).eq(t2.dlv_slip_no)
										.and(t1.pr("dlv_slip_seq").eq(t2.dlv_slip_seq))));
						mstDlvSlipDR_bldr.setWhere(mstDlvSlipDR.dlv_slip_d_no.eq(bind("1")), upd01DtlRow.dlv_slip_d_no());
						mstDlvSlipDR_bldr.addSelect(t2.bp_cd);
						mstDlvSlipDR_bldr.addSelect(t2.trd_cur_cd);
						mstDlvSlipDR_bldr.addSelect(t2.trd_ptn_typ);
					}
					else {
						MST_DLV_SLIP_R t1 = MST_DLV_SLIP_R.create("T1");
						
						mstDlvSlipDR_bldr.addInnerJoin(t1,
								bracket(mstDlvSlipDR.dlv_slip_no.eq(t1.dlv_slip_no)
										.and(mstDlvSlipDR.dlv_slip_seq.eq(t1.dlv_slip_seq))));
						mstDlvSlipDR_bldr.setWhere(mstDlvSlipDR.dlv_slip_d_no.eq(bind("1")), upd01DtlRow.dlv_slip_d_no());
						mstDlvSlipDR_bldr.addWhereWithAnd(t1.slip_sts_typ.eq(bind("1")), MAC_SLIP_STS_TYP.CRT.value());
						mstDlvSlipDR_bldr.addSelect(t1.bp_cd);
						mstDlvSlipDR_bldr.addSelect(t1.trd_cur_cd);
						mstDlvSlipDR_bldr.addSelect(t1.trd_ptn_typ);
					}
					dbSelect("MSBBL6220_MST_DLV_SLIP_D_S01", mstDlvSlipDR, mstDlvSlipDR_bldr);
				}
				
				//与信額計算
				calcCredAmt(lockedSlsSchdR, upd01DtlRow, mstSloR, mstSloDR, mstDlvSlipDR);
				
				//新規の場合
				if (MAC_DATA_CRUD_TYP.isCRT(upd01DtlRow.data_crud_typ())) {
					//売上予定新規行
					MST_SLS_SCHD_R newSlsSchdR = MST_SLS_SCHD_R.create("T");
					
					//電文項目を編集
					copy(newSlsSchdR, upd01DtlRow, createMap_MST_SLS_SCHD_R_Sls_Schd_Upd01_DtlR());
					//売上予定日を再編集
					setSlsSchdDt(newSlsSchdR, upd01DtlRow, mstSloR, mstSloDR);
					//売上計上可能ＦＬＧ再編集
					if (!isNull(newSlsSchdR.slo_d_no())) {
						newSlsSchdR.sls_ac_abl_flg(canSlsAc(upd01DtlRow, mstSloR, mstSloDR));
					}
					else {
						newSlsSchdR.sls_ac_abl_flg(canSlsAc(upd01DtlRow, mstDlvSlipDR));
					}
					
					//更新の場合の項目編集,打切FLG=オンの場合
					if (upd01DtlRow.abort_flg()) {
						abortSlsSchd(newSlsSchdR);
					}
					
					if (MSC_SLS_SCHD_SRC_TYP.isSHIP_ACT_D(upd01DtlRow.sls_schd_src_typ())
							&& !isNull(upd01DtlRow.getNumberNE("sls_qty"))) {
						newSlsSchdR.base_unit_sls_qty(upd01DtlRow.getNumberNE("sls_qty"));
					}
					MST_SLS_SCHD_R uplndIvSlsSchdR = _uplndIvSlsSchdL.getFirst(_uplndIvSlsSchdIdx, upd01DtlRow.dlv_slip_d_no());
					if(MSC_SLS_SCHD_SRC_TYP.isSHIP_ACT_D(upd01DtlRow.sls_schd_src_typ())
							&& upd01DtlRow.getBooleanNE("uplnd_iv_flg")
							&& !isNull(uplndIvSlsSchdR)) {
						// 計画外売上実績（インボイス取引対象）の場合、訂正前の情報を保持する。
						newSlsSchdR.sls_schd_no(uplndIvSlsSchdR.sls_schd_no());
						newSlsSchdR.iv_no(uplndIvSlsSchdR.iv_no());
						newSlsSchdR.iv_d_no(uplndIvSlsSchdR.iv_d_no());
						newSlsSchdR.base_unit_sls_qty(uplndIvSlsSchdR.base_unit_sls_qty());
					}
					insSlsSchdL.add(newSlsSchdR);
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(upd01DtlRow.data_crud_typ())) {
					
					//打切FLG=オフの場合※打切取消の場合のテーブル更新も同様の編集方法で対応する。
					edidSlsSchdRow(lockedSlsSchdR, upd01DtlRow, mstSloR, mstSloDR);
					
					//更新の場合の項目編集,打切FLG=オンの場合
					if (upd01DtlRow.abort_flg()) {
						abortSlsSchd(lockedSlsSchdR);
					}
					
					//F．売上予定データ更新
					dbUpdateKey("MSBBL6220_MST_SLS_SCHD_U01", lockedSlsSchdR, lockedSlsSchdR_bldr);
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(upd01DtlRow.data_crud_typ())) {
					//G．売上予定データ削除
					dbDeleteKey("MSBBL6220_MST_SLS_SCHD_D02", lockedSlsSchdR, lockedSlsSchdR_bldr);
				}
			}
			
			if (!insSlsSchdL.isEmpty()) {
				//E．売上予定データ作成(DBにインサート)
				dbInsert("MSBBL6220_MST_SLS_SCHD_I01", insSlsSchdL, MCQueryApiBuilder.create(MST_SLS_SCHD_R.create("T")));
			}
		}
		/**
		 * 計画外出荷実績の訂正時に、売上済数量を保持するため、新規行の一時カラムに設定する。<br>
		 * （本処理が削除・新規で呼ばれるため、売上済数量が消えないように）
		 */
		protected void setShipActDelInsSlsQty() {
			
			up0().addNumberColumn("sls_qty");
			up0().addBooleanColumn("uplnd_iv_flg");
			_uplndIvSlsSchdL = MCList.create(MST_SLS_SCHD_R.class);
			
			// 売上予定作成元区分が出荷実績明細のレコードのみ抽出
			MCList<Sls_Schd_Upd01_DtlR> shipActUpL = up0().subList(r->MSC_SLS_SCHD_SRC_TYP.isSHIP_ACT_D(r.sls_schd_src_typ()));		
			if (!shipActUpL.isEmpty()) {
				
				MCList<MST_DLV_SLIP_D_R> wkL = MCList.create(MST_DLV_SLIP_D_R.class);
				for (Sls_Schd_Upd01_DtlR upR : shipActUpL.distinctNE(Sls_Schd_Upd01_DtlR.$dlv_slip_d_no)) {
					MST_DLV_SLIP_D_R wkR = MST_DLV_SLIP_D_R.create();
					wkR.dlv_slip_d_no(upR.dlv_slip_d_no());
					wkL.add(wkR);
				}
				MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_DLV_SLIP_D_R.create("T"));
				dbWkDelete("MSBBL6220_MSW_DLV_SLIP_D_D01", wkL_bldr.getBaseDbc());
				dbWkInsert("MSBBL6220_MSW_DLV_SLIP_D_I01", wkL, wkL_bldr.getBaseDbc());
				
				// 売上予定を取得
				MCList<MST_SLS_SCHD_R> slsSchdL = MCList.create(MST_SLS_SCHD_R.class);
				MST_SLS_SCHD_R slsSchdL_t = MST_SLS_SCHD_R.create("T");
				MCQueryApiBuilder slsSchdL_bldr = MCQueryApiBuilder.create(slsSchdL_t);
				MSW_DLV_SLIP_D_KEY_R w = MSW_DLV_SLIP_D_KEY_R.create("W");
				slsSchdL_bldr.setWhere(slsSchdL_t.slo_d_no.isNull());
				slsSchdL_bldr.addInnerJoin(w, bracket( slsSchdL_t.dlv_slip_d_no.eq(w.dlv_slip_d_no)));
				dbSelect("MSBBL6220_MST_SLS_SCHD_S04", slsSchdL, slsSchdL_bldr);
				
				dbWkDelete("MSBBL6220_MSW_DLV_SLIP_D_D02", wkL_bldr.getBaseDbc());
				
				MCIndexKey slsSchdIdxkey = slsSchdL.createIndex(MST_SLS_SCHD_R.$dlv_slip_d_no);
				MCIndexKey shipActIdxkey = shipActUpL.createIndex(Sls_Schd_Upd01_DtlR.$dlv_slip_d_no, Sls_Schd_Upd01_DtlR.$data_crud_typ);
				
				for (Sls_Schd_Upd01_DtlR upR : shipActUpL) {
					
					if (!MAC_DATA_CRUD_TYP.isCRT(upR.data_crud_typ())) {
						continue;
					}
					
					MCList<Sls_Schd_Upd01_DtlR> delUpL = shipActUpL.subList(shipActIdxkey, upR.dlv_slip_d_no(), MAC_DATA_CRUD_TYP.DEL.value());
					MST_SLS_SCHD_R slsSchdR = slsSchdL.getFirst(slsSchdIdxkey, upR.dlv_slip_d_no());
					
					if (delUpL.size() > 0 && !isNull(slsSchdR) && !slsSchdR.base_unit_sls_qty().isZero()) {
						if (isNull(slsSchdR.iv_d_no())) {
							// 同一納品書明細ＮＯで削除と新規が同時に存在するかつ売上済の場合に、売上済数量を保持
							upR.setNumberNE("sls_qty", slsSchdR.base_unit_sls_qty());
						}
						else {
							upR.setBooleanNE("uplnd_iv_flg", true);
							_uplndIvSlsSchdL.add(slsSchdR);
						}
					}
				}
			}
			_uplndIvSlsSchdIdx = _uplndIvSlsSchdL.createIndex(MST_SLS_SCHD_R.$dlv_slip_d_no);
		}
		
		/**
		 * キャッシュを作成します
		 * @param upd01DtlList 上り電文（バインド条件）
		 */
		protected void createCache(MCList<Sls_Schd_Upd01_DtlR> upd01DtlList,
				MCList<MST_SLO_D_R> cacheSloDL, MCList<MST_SLO_R> cacheSloL) {
			
			// 受注明細
			MCList<MST_SLO_D_R> sloDL = MCList.create(MST_SLO_D_R.class);
			dbSelectKey("MSBBL6220_MST_SLO_D_S01", sloDL,
					MCQueryApiBuilder.create(MST_SLO_D_R.create("T")), upd01DtlList);
			cacheSloDL.addAll(sloDL.subList(new MCRowMatcher<MST_SLO_D_R>(){
				@Override
				public boolean match(MST_SLO_D_R row) {
					if (isNull(row.slo_d_no())) {
						return false;
					}
					return true;
				}
			}));
			
			// 受注ヘッダ
			MCList<MST_SLO_R> sloL = MCList.create(MST_SLO_R.class);
			dbSelectKey("MSBBL6220_MST_SLO_S01", sloL,
					MCQueryApiBuilder.create(MST_SLO_R.create("T")), sloDL);
			cacheSloL.addAll(sloL);
			
			// マスタ取得用バインドリスト作成
			MCIndexKey idxCacheSloDL = cacheSloDL.createIndex(MST_SLO_D_R.$slo_d_no);
			MCIndexKey idxCacheSloL = cacheSloL.createIndex(MST_SLO_R.$slo_no);
			MCList<MST_SLO_R> bindLBp = MCList.create(MST_SLO_R.class);
			MCList<MST_SLO_D_R> bindLItm = MCList.create(MST_SLO_D_R.class);
			for (Sls_Schd_Upd01_DtlR r : upd01DtlList) {
				if (r.cred_no_up_flg()) {
					continue;
				}
				MST_SLO_D_R sloDR = cacheSloDL.getFirst(idxCacheSloDL, r.slo_d_no());
				
				if (isNull(sloDR)) {
					continue;
				}
				
				//　取引先マスタのキャッシュ取得用バインドリスト作成
				MST_SLO_R sloR = cacheSloL.getFirst(idxCacheSloL, sloDR.slo_no());
				bindLBp.add(sloR);
				
				// 品目マスタのキャッシュ取得用バインドリスト作成
				if (MSC_SLS_SCHD_SRC_TYP.isSHIP_SCHD(r.sls_schd_src_typ())
						|| MSC_SLS_SCHD_SRC_TYP.isSLO_D(r.sls_schd_src_typ())
						|| MSC_SLS_SCHD_SRC_TYP.isSHIP_ACT_D(r.sls_schd_src_typ())) {
					bindLItm.add(sloDR);
				}
			}
			
			// 取引マスタ
			MAM_BP_R bpL_t = MAM_BP_R.create("T");
			MCQueryApiBuilder bpL_bldr = MCQueryApiBuilder.create(bpL_t);
			bpL_bldr.setSelect(bpL_t.sls_amt_rnd_typ);
			bpL_bldr.addSelect(bpL_t.cst_iv_flg);
			_cacheBp = new FXUCL_MCDbcCache<MAM_BP_R>(bpL_bldr, bindLBp, MST_SLO_R.$cst_cd);
			
			// 品目マスタ
			MAM_ITM_R itmL_t = MAM_ITM_R.create("T");
			MCQueryApiBuilder itmL_bldr = MCQueryApiBuilder.create(itmL_t);
			itmL_bldr.setSelect(itmL_t.dscnt_itm_flg);
			_cacheItm = new FXUCL_MCDbcCache<MAM_ITM_R>(itmL_bldr, bindLItm,
					MST_SLO_D_R.$itm_cd, MST_SLO_D_R.$itm_sub1, MST_SLO_D_R.$itm_sub2,
					MST_SLO_D_R.$itm_sub3);
		}
		

		/**
		 * 与信額の計算,行毎に与信額を計算し、計算結果を一時変数に保存する。
		 * 与信額の計算対象：打切、打切取消による与信額の変更。	受注無しの出荷実績登録、更新、削除による与信額の変更。
		 * @param slsSchdR 売上予定レコード
		 * @param upd01DtlRow　上り電文のレコード
		 * @param mstSloR　受注ヘッダレコード
		 * @param mstSloDR　受注明細レコード
		 * @param mstDlvSlipR　納品伝票ヘッダレコード
		 * @param mstDlvSlipDR　納品伝票明細レコード
		 */
		protected void calcCredAmt(MST_SLS_SCHD_R slsSchdR,
				Sls_Schd_Upd01_DtlR upd01DtlRow, MST_SLO_R mstSloR, MST_SLO_D_R mstSloDR,
				MST_DLV_SLIP_D_R mstDlvSlipDR) {
			
			if (upd01DtlRow.cred_no_up_flg()) {
				return;
			}
			
			//一時変数の定義：与信更新対象データROW
			Cred_Upd01_CndR credR = Cred_Upd01_CndR.create();
			MCNumber credQty = MCNumber.ZERO;
			MCNumber credRAmt = MCNumber.ZERO;
			//※受注ヘッダ.取引通貨に対応する通貨マスタ.金額小数部有効桁数、受注ヘッダ.得意先CDに対応する取引先マスタ.売上金額端数処理区分により端数処理する。
			MCNumber decPlace = getAmtDecPlace(mstSloR.trd_cur_cd());
			String rndTyp = getRndTyp(mstSloR.cst_cd());

			//上り電文.売上予定作成元区分＝出荷予定、或は上り電文.売上予定作成元区分＝受注明細の場合
			if ((MSC_SLS_SCHD_SRC_TYP.isSHIP_SCHD(upd01DtlRow.sls_schd_src_typ()) && isNull(upd01DtlRow.ship_inst_d_no()))
					|| MSC_SLS_SCHD_SRC_TYP.isSLO_D(upd01DtlRow.sls_schd_src_typ())) {
				MAM_ITM_R itmR = MAM_ITM_R.create();
				if (!isNullOr(mstSloDR.itm_sub1(), mstSloDR.itm_sub2(), mstSloDR.itm_sub3())) {
					itmR = _cacheItm.get(mstSloDR.itm_cd(), mstSloDR.itm_sub1(), mstSloDR.itm_sub2(), mstSloDR.itm_sub3());
				}
				
				//①	打切対象の与信額の算出	
				//上り電文.データ更新区分＝更新、新規、且つ上り電文.打切ＦＬＧ＝オンのレコードに対し、下記の処理を行う。
				if ((MAC_DATA_CRUD_TYP.isUPD(upd01DtlRow.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isCRT(upd01DtlRow.data_crud_typ()))
						&& upd01DtlRow.abort_flg()) {
					//・受注ヘッダ.取引CD≠売上の場合、下記の処理を行わなく、次のレコードをループする。	
					if (MAC_TRD_PTN_TYP.isSLS(mstSloR.trd_ptn_typ())) {
						//・基準単位打切数量の算出：基準単位打切数量　=　ロックした売上予定.基準単位数　－　ロックした売上予定.基準単位売上数量		
						credQty = nvl(upd01DtlRow.base_unit_qty(), slsSchdR.base_unit_qty())
								.subtract(nvl(slsSchdR.base_unit_sls_qty(), MCNumber.ZERO));
						//	与信額＝(受注明細.取引通貨金額　＋　受注明細.取引通貨税額）　÷　受注明細.基準単位数量　× 基準単位打切数量　×　-1										
						credQty = credQty.multiply(-1);
						credRAmt = (mstSloDR.trd_cur_amt()
								.add(mstSloDR.trd_cur_tax_amt())).multiply(credQty)
										.divide(mstSloDR.base_unit_qty(),
												decPlace.intValue(),
												MAC_RND_TYP.toMC(rndTyp));
						if (itmR.dscnt_itm_flg()) {
							credRAmt = credRAmt.multiply(-1);
						}
						credR.cst_cd(mstSloR.cst_cd());//得意先CD
						credR.cur_cd(mstSloR.trd_cur_cd());//取引通貨ＣＤ.
						credR.trd_ptn_typ(mstSloR.trd_ptn_typ());//取引パタン区分.
						credR.amt(credRAmt);//与信額
						_credAmtL.add(credR);
					}
				}
				//②	打切取消対象の与信額の算出				
				//上り電文.データ更新区分＝更新、且つ上り電文.打切ＦＬＧ＝オフ、且つロックした売上予定.打切ＦＬＧ＝オンのレコードに対し、下記の処理を行う。	
				if (MAC_DATA_CRUD_TYP.isUPD(upd01DtlRow.data_crud_typ())
						&& !upd01DtlRow.abort_flg() && slsSchdR.abort_flg()) {
					//・受注ヘッダ.取引CD≠売上の場合、下記の処理を行わなく、次のレコードをループする。	
					if (MAC_TRD_PTN_TYP.isSLS(mstSloR.trd_ptn_typ())) {
						//上り電文.基準単位数 を打切取消数とする
						credQty = upd01DtlRow.base_unit_qty();
						//	与信額＝(受注明細.取引通貨金額　＋　受注明細.取引通貨税額）　÷　受注明細.基準単位数量　× 上り電文.基準単位数	
						credRAmt = (mstSloDR.trd_cur_amt()
								.add(mstSloDR.trd_cur_tax_amt())).multiply(credQty)
										.divide(mstSloDR.base_unit_qty(),
												decPlace.intValue(),
												MAC_RND_TYP.toMC(rndTyp));
						if (itmR.dscnt_itm_flg()) {
							credRAmt = credRAmt.multiply(-1);
						}
						credR.cst_cd(mstSloR.cst_cd());//得意先CD
						credR.cur_cd(mstSloR.trd_cur_cd());//取引通貨ＣＤ.
						credR.trd_ptn_typ(mstSloR.trd_ptn_typ());//取引パタン区分.
						credR.amt(credRAmt);//与信額
						_credAmtL.add(credR);
					}
				}
			}
			//上り電文.売上予定作成元区分　＝　出荷実績明細の場合
			if (MSC_SLS_SCHD_SRC_TYP.isSHIP_ACT_D(upd01DtlRow.sls_schd_src_typ())) {
				MAM_ITM_R itmR = _cacheItm.get(mstDlvSlipDR.itm_cd(), mstDlvSlipDR.itm_sub1(), mstDlvSlipDR.itm_sub2(), mstDlvSlipDR.itm_sub3());
				//納品伝票.取引CD≠売上の場合、下記の処理を行わなく、次のレコードをループする。
				if (MAC_TRD_PTN_TYP.isSLS(mstDlvSlipDR.getStringNE("trd_ptn_typ"))) {
					//・与信額＝（納品伝票明細.取引通貨金額　＋　納品伝票明細.取引通貨税額）

					if (isNull(mstDlvSlipDR.trd_cur_amt())) {
						mstDlvSlipDR.trd_cur_amt(0);
					}
					if (isNull(mstDlvSlipDR.trd_cur_tax_amt())) {
						mstDlvSlipDR.trd_cur_tax_amt(0);
					}
					credRAmt = mstDlvSlipDR.trd_cur_amt()
							.add(mstDlvSlipDR.trd_cur_tax_amt());
					if (itmR.dscnt_itm_flg()) {
						credRAmt = credRAmt.multiply(-1);
					}
					credR.cst_cd(mstDlvSlipDR.getStringNE("bp_cd"));//得意先CD
					credR.cur_cd(mstDlvSlipDR.getStringNE("trd_cur_cd"));//取引通貨ＣＤ.
					credR.trd_ptn_typ(mstDlvSlipDR.getStringNE("trd_ptn_typ"));//取引パタン区分.
					credR.amt(credRAmt);//与信額
					_credAmtL.add(credR);
				}
			}
		}

		/**
		 * 打切FLG=オンの場合、ロックした売上予定の項目を編集する。
		 * 
		 * @param lockedSlsSchdR　売上予定レコード
		 */
		protected void abortSlsSchd(MST_SLS_SCHD_R lockedSlsSchdR) {
			lockedSlsSchdR.cmpl_flg(true);//完了ＦＬＧ
			lockedSlsSchdR.abort_flg(true);//打切ＦＬＧ
			lockedSlsSchdR.sls_ac_abl_flg(false);//売上計上可能ＦＬＧ
			//基準単位打切数量：ロックした売上予定.基準単位数－ロックした売上予定.基準単位売上数量
			lockedSlsSchdR.base_unit_abort_qty(lockedSlsSchdR.base_unit_qty()
					.subtract(lockedSlsSchdR.base_unit_sls_qty()));
		}

		/**
		 * データ更新区分が更新、且つ打切FLG=オフの場合、ロックした売上予定レコードに対し項目を編集する。
		 * @param lockedSlsSchdR　売上予定レコード
		 * @param upd01DtlRow　上り電文レコード
		 * @param mstSloR　受注ヘッダレコード
		 * @param mstSloDR　受注明細レコード
		 * @return
		 */
		protected void edidSlsSchdRow(MST_SLS_SCHD_R lockedSlsSchdR,
				Sls_Schd_Upd01_DtlR upd01DtlRow, MST_SLO_R mstSloR,
				MST_SLO_D_R mstSloDR) {
			lockedSlsSchdR.slo_d_no(upd01DtlRow.slo_d_no());//受注明細ＮＯ
			lockedSlsSchdR.dlv_inst_rcpt_no(upd01DtlRow.dlv_inst_rcpt_no());//納入指示受領ＮＯ
			lockedSlsSchdR.ship_schd_no(upd01DtlRow.ship_schd_no());//出荷予定ＮＯ
			lockedSlsSchdR.ship_inst_d_no(upd01DtlRow.ship_inst_d_no());//出荷指図明細ＮＯ
			lockedSlsSchdR.dlv_slip_d_no(upd01DtlRow.dlv_slip_d_no());//納品書明細ＮＯ
			//売上予定日
			lockedSlsSchdR.sls_schd_dt(upd01DtlRow.sls_schd_dt());
			//売上予定日を再編集
			setSlsSchdDt(lockedSlsSchdR, upd01DtlRow, mstSloR, mstSloDR);
			lockedSlsSchdR.trd_unit_cd(upd01DtlRow.trd_unit_cd());//取引単位ＣＤ
			lockedSlsSchdR.trd_unit_qty(upd01DtlRow.trd_unit_qty());//取引単位数量
			lockedSlsSchdR.base_unit_cd(upd01DtlRow.base_unit_cd());//基準単位ＣＤ
			lockedSlsSchdR.base_unit_qty(upd01DtlRow.base_unit_qty());//基準単位数量
			if (!isNull(upd01DtlRow.ship_schd_no())) {
				MST_SHIP_SCHD_R shipSchdR = MST_SHIP_SCHD_R.create("T");
				dbSelectKey("MSBBL6220_MST_SHIP_SCHD_S01", shipSchdR,
						MCQueryApiBuilder.create(shipSchdR), upd01DtlRow.ship_schd_no());

				if (upd01DtlRow.abort_flg()) {
					lockedSlsSchdR.base_unit_qty(shipSchdR.abort_qty());
				}
				
				if (!upd01DtlRow.abort_flg() && lockedSlsSchdR.abort_flg()) {
					lockedSlsSchdR.base_unit_qty(shipSchdR.base_unit_qty().subtract(shipSchdR.ship_act_qty()));
				}
			}
			if (isSame(lockedSlsSchdR.trd_unit_cd(), lockedSlsSchdR.base_unit_cd())) {
				lockedSlsSchdR.trd_unit_qty(lockedSlsSchdR.base_unit_qty());
			}
			else {
				MCNumber trdUnitQty = cnvBaseToTrdUnitQty(
						mstSloDR.itm_cd(), mstSloDR.itm_sub1(), mstSloDR.itm_sub2(), mstSloDR.itm_sub3(),
						lockedSlsSchdR.base_unit_qty(), lockedSlsSchdR.trd_unit_cd());
				if (isNull(trdUnitQty)) {
					lockedSlsSchdR.trd_unit_cd(lockedSlsSchdR.base_unit_cd());
					lockedSlsSchdR.trd_unit_qty(lockedSlsSchdR.base_unit_qty());
				}
				else {
					lockedSlsSchdR.trd_unit_qty(trdUnitQty);
				}
			}
			//基準単位数≦基準単位売上数量の場合、オンで設定
			lockedSlsSchdR.cmpl_flg(lockedSlsSchdR.base_unit_qty()
					.lte(lockedSlsSchdR.base_unit_sls_qty()));//完了ＦＬＧ
			lockedSlsSchdR.abort_flg(upd01DtlRow.abort_flg());//打切ＦＬＧ
			lockedSlsSchdR.sls_ac_abl_flg(canSlsAc(upd01DtlRow, mstSloR, mstSloDR));//売上計上可能ＦＬＧ
			lockedSlsSchdR.base_unit_abort_qty(0);//基準単位打切数量
		}

		/**
		 * 売上予定日の編集
		 * @param lockedSlsSchdR　売上予定レコード
		 * @param upd01DtlRow　上り電文レコード
		 * @param mstSloR　受注ヘッダレコード
		 * @param mstSloDR　受注明細レコード
		 */
		protected void setSlsSchdDt(MST_SLS_SCHD_R lockedSlsSchdR,
				Sls_Schd_Upd01_DtlR upd01DtlRow, MST_SLO_R mstSloR,
				MST_SLO_D_R mstSloDR) {
			
			if (mstSloDR.sls_cststk_flg()) {
				// 預り売上の場合に、受注明細の売上予定日を設定する
				lockedSlsSchdR.sls_schd_dt(mstSloDR.sls_schd_dt());
			}
			//売上予定作成元区分<>出荷実績明細
			else if (!MSC_SLS_SCHD_SRC_TYP.isSHIP_ACT_D(upd01DtlRow.sls_schd_src_typ())) {
				//出荷指図対象の受注
				if (!MAC_SHIP_INST_TYP.isNO_PICK(mstSloDR.ship_inst_typ())) {
					//受注の売上計上区分＝出荷基準
					if (MAC_SLS_BASIS_TYP.isSHIP_BASIS(mstSloR.sls_basis_typ())) {
						lockedSlsSchdR.sls_schd_dt(upd01DtlRow.ship_schd_dt());
					}
					else {
						//受注の売上計上区分＝検収基準
						if (isNull(mstSloDR.sls_schd_dt())) {
							lockedSlsSchdR.sls_schd_dt(upd01DtlRow.dlv_schd_dt());
						}
						else {
							lockedSlsSchdR.sls_schd_dt(mstSloDR.sls_schd_dt());
						}
					}
				}
				else if (isNull(upd01DtlRow.sls_schd_dt())) {
					//受注の売上計上区分＝出荷基準
					if (MAC_SLS_BASIS_TYP.isSHIP_BASIS(mstSloR.sls_basis_typ())) {
						lockedSlsSchdR.sls_schd_dt(upd01DtlRow.ship_schd_dt());
					}
					else {
						//受注の売上計上区分＝検収基準
						if (isNull(mstSloDR.sls_schd_dt())) {
							lockedSlsSchdR.sls_schd_dt(upd01DtlRow.dlv_schd_dt());
						}
						else {
							lockedSlsSchdR.sls_schd_dt(mstSloDR.sls_schd_dt());
						}
					}
				}
			}
		}

		/**
		 * 売上計上可能かどうを判断する。可能な場合、trueを戻す、不可な場合、falseを戻す
		 * @param upd01DtlRow　上り電文レコード
		 * @param mstSloR　受注ヘッダレコード
		 * @param mstSloDR　受注明細レコード
		 * @return
		 */
		protected boolean canSlsAc(Sls_Schd_Upd01_DtlR upd01DtlRow, MST_SLO_R mstSloR,
				MST_SLO_D_R mstSloDR) {
			boolean ret = false;
			MAM_BP_R bpR = _cacheBp.get(mstSloR.cst_cd());
			//売上予定作成元区分≠出荷実績明細の場合
			if (!MSC_SLS_SCHD_SRC_TYP.isSHIP_ACT_D(upd01DtlRow.sls_schd_src_typ())) {
				//受注明細.預り売上FLG=オン
				if (mstSloDR.sls_cststk_flg()) {
					// インボイス取引の場合、売上計上可能FLGをオフにする。
					ret = bpR.cst_iv_flg() ? false : true;
				}
				else {
					//受注明細.預り売上FLG=オフ、インボイス取引対象＝オフ、売上計上区分＝出荷基準、出荷区分＝出荷指示対象外
					if (MAC_SHIP_INST_TYP.isNON(mstSloDR.ship_inst_typ())) {
						//受注の売上計上区分＝出荷基準
						if (MAC_SLS_BASIS_TYP.isSHIP_BASIS(mstSloR.sls_basis_typ())) {
							//インボイス取引対象＝オフ
							if (!bpR.cst_iv_flg()) {
								ret = true;
							}
						}
					}
				}
			}
			else {
				//売上予定作成元区分=出荷実績明細の場合
				ret = true;
			}
			return ret;
		}
		protected boolean canSlsAc(Sls_Schd_Upd01_DtlR upd01DtlRow, MST_DLV_SLIP_D_R mstDlvSlipDR) {
			if (MSC_SLS_SCHD_SRC_TYP.isSHIP_ACT_D(upd01DtlRow.sls_schd_src_typ())) {
				MAM_BP_R bpR = _cacheBp.get(mstDlvSlipDR.getStringNE("bp_cd"));
				return bpR.cst_iv_flg() ? false : true;
			}
			
			return false;
		}
	}

	/**
	 * Sls_Schd_Upd02オペレーション.<p>
	 *
	 */
	public class Sls_Schd_Upd02 extends MSBBL_SlsSchdService_MC_A.Sls_Schd_Upd02 {
		//一時変数：出荷予定NOを定義、空値を設定する。
		protected String _shipSchdNo = "";

		protected MCList<MST_DLV_SLIP_D_R> _dlvSlipDL = null;
		protected MCIndexKey _idxkeyDlvSlipD = null;
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			_credAmtL = MCList.create(Cred_Upd01_CndR.class);
			//売上予定更新
			updSlsSchd();
			//与信更新
			updCred();
			//受払予定の更新
			updIOSchd();
		}

		protected MST_SLS_SCHD_R getSlsSchdR(MCList<MST_SLS_SCHD_R> lockedSlsSchdList) {
			MST_SLS_SCHD_R lockedSlsSchdR = MST_SLS_SCHD_R.create();
			if (lockedSlsSchdList.isEmpty()) {
				return null;
			}
			else if (lockedSlsSchdList.size() == 1) {
				lockedSlsSchdR = lockedSlsSchdList.get(0);
			}
			else {
				for (MST_SLS_SCHD_R slsSchdR : lockedSlsSchdList) {
					if (isNull(slsSchdR.dlv_slip_d_no())) {
						lockedSlsSchdR = slsSchdR;
						break;
					}
				}
			}
			return lockedSlsSchdR;
		}

		protected boolean isNotChangedR(Sls_Schd_Upd02_DtlR upd02DtlRow,
				MCList<MST_SLS_SCHD_R> lockedSlsSchdList) {
			if (!MAC_DATA_CRUD_TYP.isUPD(upd02DtlRow.data_crud_typ())) {
				return false;
			}
			MST_SLS_SCHD_R lockedSlsSchdR = MST_SLS_SCHD_R.create();
			MST_SLS_SCHD_R lockedSlsSchdRTwo = MST_SLS_SCHD_R.create();
			if (lockedSlsSchdList.size() == 1) {
				lockedSlsSchdR = lockedSlsSchdList.get(0);
				if (isSame(lockedSlsSchdR.ship_schd_no(), upd02DtlRow.ship_schd_no())
						&& isSame(lockedSlsSchdR.dlv_slip_d_no(),
								upd02DtlRow.dlv_slip_d_no())
						&& isSame(lockedSlsSchdR.slo_d_no(), upd02DtlRow.slo_d_no())
						&& isSame(lockedSlsSchdR.sls_schd_dt(), upd02DtlRow.sls_schd_dt())
						&& isSame(lockedSlsSchdR.trd_unit_qty(),
								upd02DtlRow.trd_unit_qty())
						&& isSame(lockedSlsSchdR.trd_unit_cd(), upd02DtlRow.trd_unit_cd())
						&& isSame(lockedSlsSchdR.base_unit_qty(),
								upd02DtlRow.base_unit_qty())
						&& isSame(lockedSlsSchdR.base_unit_cd(),
								upd02DtlRow.base_unit_cd())
						&& isSame(lockedSlsSchdR.abort_flg(), upd02DtlRow.abort_flg())) {
					return true;
				}
			}
			else if (lockedSlsSchdList.size() == 2) {
				for (MST_SLS_SCHD_R slsSchdR : lockedSlsSchdList) {
					if (!isNull(slsSchdR.dlv_slip_d_no())) {
						lockedSlsSchdR = slsSchdR;
					}
					else {
						lockedSlsSchdRTwo = slsSchdR;
					}
				}

				if (isSame(lockedSlsSchdR.ship_schd_no(), upd02DtlRow.ship_schd_no())
						&& isSame(lockedSlsSchdR.dlv_slip_d_no(),
								upd02DtlRow.dlv_slip_d_no())
						&& isSame(lockedSlsSchdR.slo_d_no(), upd02DtlRow.slo_d_no())
						&& isSame(lockedSlsSchdR.sls_schd_dt(), upd02DtlRow.sls_schd_dt())
						&& isSame(lockedSlsSchdR.trd_unit_qty(),
								upd02DtlRow.trd_unit_qty())
						&& isSame(lockedSlsSchdR.trd_unit_cd(), upd02DtlRow.trd_unit_cd())
						&& isSame(lockedSlsSchdR.base_unit_qty(),
								upd02DtlRow.base_unit_qty())
						&& isSame(lockedSlsSchdR.base_unit_cd(),
								upd02DtlRow.base_unit_cd())
						&& isSame(lockedSlsSchdRTwo.abort_flg(),
								upd02DtlRow.abort_flg())) {
					return true;
				}
			}

			return false;
		}

		/**
		 * 売上予定更新
		 */
		protected void updSlsSchd() {
			//上り電文取得
			MCList<Sls_Schd_Upd02_DtlR> upd02DtlList = up0();
			upd02DtlList.sort(Sls_Schd_Upd02_DtlR.$ship_schd_no);
			// 出荷予定の検索
			MCList<MST_SHIP_SCHD_R> shipSchdL = getShipSchdL(upd02DtlList);
			MCIndexKey ikShipSchd = shipSchdL.createIndex(MST_SHIP_SCHD_R.$ship_schd_no);
			// キャッシュ作成
			MCList<MST_SLO_D_R> sloDL = MCList.create(MST_SLO_D_R.class);
			createCache(upd02DtlList, sloDL);
			// キャッシュ取得用インデックス
			MCIndexKey ikSloD = sloDL.createIndex(MST_SLO_D_R.$slo_d_no);
			
			//発番準備
			int seqCacheSize = 0;
			seqCacheSize = seqCacheSize + upd02DtlList.subList(Sls_Schd_Upd02_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value()).size();
			seqCacheSize = seqCacheSize + upd02DtlList.subList(Sls_Schd_Upd02_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.UPD.value()).size();
			doSeqCache(MSC_NUM_SYS_TYP.SLSSCHD, seqCacheSize);
			
			//上り電文に対し、繰り返し処理
			for (Sls_Schd_Upd02_DtlR upd02DtlRow : upd02DtlList) {
				//売上予定ロック時に取得したデータを一時変数（ロックした売上予定）に保存する。	
				MST_SLS_SCHD_R lockedSlsSchdR = MST_SLS_SCHD_R.create("T");
				
				//出荷予定データの変数
				MST_SHIP_SCHD_R shipSchdR = shipSchdL.getFirst(ikShipSchd, upd02DtlRow.ship_schd_no());
				//受注明細データの変数
				MST_SLO_D_R mstSloDR = sloDL.getFirst(ikSloD, upd02DtlRow.slo_d_no());
				
				//上り電文.納品書明細NOが設定された場合
				if (!isNullOrNullVal(upd02DtlRow.dlv_slip_d_no())) {
					MCList<MST_SLS_SCHD_R> lockedSlsSchdList = MCList.create(MST_SLS_SCHD_R.class);
					MST_SLS_SCHD_R lockedSlsSchdList_t = MST_SLS_SCHD_R.create("T");
					MCQueryApiBuilder lockedSlsSchdList_bldr = MCQueryApiBuilder.create(lockedSlsSchdList_t);
					
					//下記の削除条件で、売上予定から、データを検索、ロックする。		
					//	出荷予定ＮＯ　＝上り電文．出荷予定ＮＯ　AND　（納品書明細ＮＯ IS NULL OR 納品書明細ＮＯ＝上り電文．納品書明細ＮＯ）
					lockedSlsSchdList_bldr.setWhere(lockedSlsSchdList_t.ship_schd_no.eq(bind("1")), upd02DtlRow.ship_schd_no());
					lockedSlsSchdList_bldr.addWhereWithAnd(bracket(lockedSlsSchdList_t.dlv_slip_d_no.isNull()
											.or(lockedSlsSchdList_t.dlv_slip_d_no.eq(bind("1")))), upd02DtlRow.dlv_slip_d_no());
					dbSelectForUpdate("MSBBL6220_MST_SLS_SCHD_S05", lockedSlsSchdList, lockedSlsSchdList_bldr);
					//画面上は変更されていないレコードも一緒に渡されている。未変更のレコードは処理対象外とする。
					if (isNotChangedR(upd02DtlRow, lockedSlsSchdList)) {
						continue;
					}
					//ロック時に取得された売上予定データの1行を取得する。
					lockedSlsSchdR = getSlsSchdR(lockedSlsSchdList);
					//与信額計算
					calcCredAmt(lockedSlsSchdR, upd02DtlRow, mstSloDR, shipSchdR);
					//ロックしたレコードを削除する。
					dbDeleteKey("MSBBL6220_MST_SLS_SCHD_D03", lockedSlsSchdList, lockedSlsSchdList_bldr);
					
					//売上予定新規行
					MST_SLS_SCHD_R newSlsSchdR = MST_SLS_SCHD_R.create("T");
					MCQueryApiBuilder newSlsSchdR_bldr = MCQueryApiBuilder.create(newSlsSchdR);
					
					//B.　納品伝票明細に対する売上予定の作成
					//上り電文.データ更新区分が新規、更新、且つ、上り電文.取引単位数　＞　０　の場合はのみ作成対象。
					if (MAC_DATA_CRUD_TYP.isUPD(upd02DtlRow.data_crud_typ())
							|| MAC_DATA_CRUD_TYP.isCRT(upd02DtlRow.data_crud_typ())) {
						if (upd02DtlRow.trd_unit_qty().gt(0)) {
							//電文項目を編集
							copy(newSlsSchdR, upd02DtlRow,
									createMap_MST_SLS_SCHD_R_Sls_Schd_Upd02_DtlR());
							if ((MAC_SLS_BASIS_TYP.isIN_BASIS(mstSloDR.getString("sls_basis_typ")) 
									|| MAC_SLS_BASIS_TYP.isARRIVAL_BASIS(mstSloDR.getString("sls_basis_typ")))
									&& !isNull(mstSloDR.sls_schd_dt())) {
								//受注の売上計上区分＝検収基準かつ売上予定日が指定されている場合、受注明細の売上予定日を優先に使用する
								newSlsSchdR.sls_schd_dt(mstSloDR.sls_schd_dt());
							}
							newSlsSchdR.dlv_inst_rcpt_no(shipSchdR.dlv_inst_rcpt_no());//納入指示受領ＮＯ
							newSlsSchdR.ship_schd_no(shipSchdR.ship_schd_no());//出荷予定ＮＯ
							newSlsSchdR.ship_inst_d_no(shipSchdR.ship_inst_d_no());//出荷指図明細ＮＯ
							
							//取引単位CD、取引単位数量の換算。		
							trdQtyConv(newSlsSchdR, upd02DtlRow, shipSchdR, mstSloDR);
							//出荷基準の場合、変更前の売上数を設定：
							if (lockedSlsSchdList.isEmpty()){
								newSlsSchdR.base_unit_sls_qty(0);
							}
							else {
								newSlsSchdR.base_unit_sls_qty(lockedSlsSchdList.sum(MST_SLS_SCHD_R.$base_unit_sls_qty));
							}
							//・売上予定データ作成:編集後項目値を売上予定テーブルにレコードを登録する。
							dbInsert("MSBBL6220_MST_SLS_SCHD_I02", newSlsSchdR, newSlsSchdR_bldr);
						}
					}

					//C.　未出荷分の出荷予定に対する売上予定の作成
					//出荷予定.基準単位数量＞出荷予定.出荷実績数の場合、作成
					if (shipSchdR.base_unit_qty().gt(shipSchdR.ship_act_qty())) {
						newSlsSchdR.clearAll();
						//項目を編集
						copy(newSlsSchdR, shipSchdR,
								createMap_MST_SLS_SCHD_R_MST_SHIP_SCHD_R());
						//受注明細ＮＯ
						newSlsSchdR.slo_d_no(upd02DtlRow.slo_d_no());
						//売上予定日
						//出荷指図対象の受注
						if (!MAC_SHIP_INST_TYP.isNO_PICK(mstSloDR.ship_inst_typ())) {
							//受注の売上計上区分＝出荷基準
							if (MAC_SLS_BASIS_TYP
									.isSHIP_BASIS(mstSloDR.getString("sls_basis_typ"))) {
								newSlsSchdR.sls_schd_dt(isNull(shipSchdR.ship_schd_tm()) ? null : shipSchdR.ship_schd_tm().startTimeOfDay());
							}
							else {
								//受注の売上計上区分＝検収基準
								if (isNull(mstSloDR.sls_schd_dt())) {
									newSlsSchdR.sls_schd_dt(isNull(shipSchdR.dlv_schd_tm()) ? null : shipSchdR.dlv_schd_tm().startTimeOfDay());
								}
								else {
									newSlsSchdR.sls_schd_dt(mstSloDR.sls_schd_dt());
								}
							}
						}
						else {
							newSlsSchdR.sls_schd_dt(mstSloDR.sls_schd_dt());
						}
						//取引単位ＣＤ,取引単位数量
						trdQtyConvNoShip(newSlsSchdR, shipSchdR, mstSloDR);
						//完了ＦＬＧ
						newSlsSchdR.cmpl_flg(upd02DtlRow.abort_flg());
						//打切ＦＬＧ
						newSlsSchdR.abort_flg(upd02DtlRow.abort_flg());
						//売上計上可能ＦＬＧ
						boolean canAC = false;
						//受注明細.預り売上FLG=オン
						if (mstSloDR.sls_cststk_flg()) {
							canAC = true;
						}
						else {
							//受注明細.預り売上FLG=オフ、売上計上区分＝出荷基準、出荷区分＝出荷指示対象外							
							if (MAC_SHIP_INST_TYP.isNON(mstSloDR.ship_inst_typ())) {
								//受注の売上計上区分＝出荷基準
								if (MAC_SLS_BASIS_TYP.isSHIP_BASIS(
										mstSloDR.getString("sls_basis_typ"))) {
									canAC = true;
								}
							}
						}
						newSlsSchdR.sls_ac_abl_flg(canAC);
						//基準単位打切数量
						if (upd02DtlRow.abort_flg()) {
							newSlsSchdR.base_unit_abort_qty(shipSchdR.base_unit_qty()
									.subtract(shipSchdR.ship_act_qty()));
						}
						else {
							newSlsSchdR.base_unit_abort_qty(0);
						}
						//・売上予定データ作成:編集後項目値を売上予定テーブルにレコードを登録する。
						dbInsert("MSBBL6220_MST_SLS_SCHD_I03", newSlsSchdR, newSlsSchdR_bldr);
					}
				}
				//上り電文.インボイス明細NOが設定された場合
				if (!isNullOrNullVal(upd02DtlRow.iv_d_no())) {
					//D．売上予定を検索、ロック			
					//出荷予定ＮＯ　＝上り電文．出荷予定ＮＯの削除条件で、売上予定から、データを検索、ロックする。
					MCQueryApiBuilder lockedSlsSchdR_bldr = MCQueryApiBuilder.create(lockedSlsSchdR);
					lockedSlsSchdR_bldr.setWhere(lockedSlsSchdR.ship_schd_no.eq(bind("1")), upd02DtlRow.ship_schd_no());
					dbSelectForUpdate("MSBBL6220_MST_SLS_SCHD_S06", lockedSlsSchdR, lockedSlsSchdR_bldr);
					//与信額計算
					calcCredAmt(lockedSlsSchdR, upd02DtlRow, mstSloDR, shipSchdR);

					//インボイス明細（MST_IV_D）データの変数
					MST_IV_D_R ivdR = MST_IV_D_R.create("T");
					MCQueryApiBuilder ivdR_bldr = MCQueryApiBuilder.create(ivdR);
					MST_IV_R t1 = MST_IV_R.create("T1");
					ivdR_bldr.addInnerJoin(t1, bracket( ivdR.iv_mng_no.eq(t1.iv_mng_no)));
					ivdR_bldr.setSelect(t1.iv_no);
					dbSelectKey("MSBBL6220_MST_IV_D_S01", ivdR, ivdR_bldr, upd02DtlRow);
					
					//E.　インボイス明細に対する売上予定の更新
					if (MAC_DATA_CRUD_TYP.isDEL(upd02DtlRow.data_crud_typ())) {
						//上り電文.データ更新区分が削除の場合、ロックされた売上予定のレコードを削除する。
						dbDeleteKey("MSBBL6220_MST_SLS_SCHD_D04", lockedSlsSchdR, lockedSlsSchdR_bldr);
					}
					//上り電文.データ更新区分が新規、更新の場合、ロックされた売上予定に対し、上り電文の値により更新する。
					if (MAC_DATA_CRUD_TYP.isCRT(upd02DtlRow.data_crud_typ())
							|| MAC_DATA_CRUD_TYP.isUPD(upd02DtlRow.data_crud_typ())) {
						//上り電文.データ更新区分が打切取消の場合、ロックされた売上予定に対し、上り電文の値により更新する。
						if (lockedSlsSchdR.abort_flg() && !upd02DtlRow.abort_flg()) {
							//項目編集
							edidSlsSchdRowAbrCan(lockedSlsSchdR);
							dbUpdateKey("MSBBL6220_MST_SLS_SCHD_U02", lockedSlsSchdR, lockedSlsSchdR_bldr);
						}
						else {
							//項目編集
							edidSlsSchdRow(lockedSlsSchdR, upd02DtlRow, ivdR);
							dbUpdateKey("MSBBL6220_MST_SLS_SCHD_U03", lockedSlsSchdR, lockedSlsSchdR_bldr);
						}
					}
				}
			}
		}
		
		protected void createCache(MCList<Sls_Schd_Upd02_DtlR> upd02DtlList,
				MCList<MST_SLO_D_R> sloDL) {
			
			// 受注明細、受注ヘッダの検索
			MCList<MST_SLO_D_R> tmpSloDL = getSloDL(upd02DtlList);

			// 取引先マスタ
			MAM_BP_R bpL_t = MAM_BP_R.create("T");
			MCQueryApiBuilder bpL_bldr = MCQueryApiBuilder.create(bpL_t);
			bpL_bldr.setSelect(bpL_t.sls_amt_rnd_typ);
			_cacheBp = new FXUCL_MCDbcCache<MAM_BP_R>(bpL_bldr, tmpSloDL, "cst_cd");
			sloDL.setAll(tmpSloDL);
			
			// 品目マスタ
			MAM_ITM_R itmL_t = MAM_ITM_R.create("T");
			MCQueryApiBuilder itmL_bldr = MCQueryApiBuilder.create(itmL_t);
			itmL_bldr.setSelect(itmL_t.dscnt_itm_flg);
			_cacheItm = new FXUCL_MCDbcCache<MAM_ITM_R>(itmL_bldr, tmpSloDL,
					MST_SLO_D_R.$itm_cd, MST_SLO_D_R.$itm_sub1, MST_SLO_D_R.$itm_sub2,
					MST_SLO_D_R.$itm_sub3);
			// 受注明細に紐付く納品書伝票明細を取得する。
			_dlvSlipDL = MCList.create(MST_DLV_SLIP_D_R.class);
			MST_DLV_SLIP_D_R dlvSlipDL_t = MST_DLV_SLIP_D_R.create("T");
			MCQueryApiBuilder dlvSlipDL_bldr = MCQueryApiBuilder.create(dlvSlipDL_t);
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_SLO_D_R.create("T"));
			dbWkDelete("MSBBL6220_MSW_SLO_D_D02", wkL_bldr.getBaseDbc());
			dbWkInsert("MSBBL6220_MSW_SLO_D_I02", upd02DtlList, wkL_bldr.getBaseDbc());

			MSW_SLO_D_KEY_R w = MSW_SLO_D_KEY_R.create("W");
			MST_DLV_SLIP_R t1 = MST_DLV_SLIP_R.create("T1");
			MST_SHIP_ACT_D_R t2 = MST_SHIP_ACT_D_R.create("T2");
			MST_SHIP_ALLOC_STS_R t3 = MST_SHIP_ALLOC_STS_R.create("T3");
			dlvSlipDL_bldr.addSelect(t1.slip_sts_typ);
			dlvSlipDL_bldr.addSelect(t3.dlv_slip_no.as("ship_inst_dlv_slip_no"));
			dlvSlipDL_bldr.addSelect(t3.dlv_slip_seq.as("ship_inst_dlv_slip_seq"));
			dlvSlipDL_bldr.addSelect(t3.dlv_slip_d_no.as("ship_inst_dlv_slip_d_no"));
			dlvSlipDL_bldr.addInnerJoin(w,
					bracket(dlvSlipDL_t.slo_d_no.eq(w.slo_d_no)));
			dlvSlipDL_bldr.addInnerJoin(t1,
					bracket(dlvSlipDL_t.dlv_slip_no.eq(t1.dlv_slip_no)
							.and(dlvSlipDL_t.dlv_slip_seq.eq(t1.dlv_slip_seq))));
			dlvSlipDL_bldr.addLeftOuterJoin(t2,
					bracket(dlvSlipDL_t.dlv_slip_d_no.eq(t2.dlv_slip_d_no)));
			dlvSlipDL_bldr.addLeftOuterJoin(t3,
					bracket(t2.ship_alloc_sts_no.eq(t3.ship_alloc_sts_no)));
			dlvSlipDL_bldr.addConstWhereWithAnd(t1.trn_typ.eq(value(MSC_TRN_TYP.SHIP.value())));
			dbSelect("MSBBL6220_MST_DLV_SLIP_D_S02", _dlvSlipDL, dlvSlipDL_bldr);
			
			_idxkeyDlvSlipD = _dlvSlipDL.createIndex(MST_DLV_SLIP_D_R.$dlv_slip_d_no);
		}

		protected MCList<MST_DLV_SLIP_D_R> getDlvSlipDL(String dlvSlipDNo) {
			
			return _dlvSlipDL.subList(_idxkeyDlvSlipD, dlvSlipDNo);
		}
		protected MST_DLV_SLIP_D_R getDlvSlipDR4Can(String dlvSlipDNo) {
			MCList<MST_DLV_SLIP_D_R> dlvSlipDL = getDlvSlipDL(dlvSlipDNo);
			if (isNull(dlvSlipDL)) {
				return null;
			}
			
			dlvSlipDL.sort(SortType.DESC, MST_DLV_SLIP_D_R.$dlv_slip_d_seq);
			MST_DLV_SLIP_D_R dlvSlipDR = dlvSlipDL.get(0);
			MST_DLV_SLIP_D_R canR = null;
			
			if (MAC_SLIP_STS_TYP.isCRT(dlvSlipDR.getStringNE(MST_DLV_SLIP_R.$slip_sts_typ))
				&& !isSame(dlvSlipDR.upd_srv_req_no(), MCSys.request.serverRequestNo())) {
				// サーバリクエストＮＯが異なる ⇒ 
				// 更新の前後で納品伝票に差異がなかったため、納品伝票を作成しなかった場合とみなす
				// この場合の取消伝票は、最新の新規伝票の符号を反転したものを取消伝票として扱う
				canR = dlvSlipDR.clone();
				canR.trd_unit_qty(negate(canR.trd_unit_qty()));
				canR.base_unit_qty(negate(canR.base_unit_qty()));
				canR.slo_qty(negate(canR.slo_qty()));
				canR.dlv_inst_qty(negate(canR.dlv_inst_qty()));
				canR.trd_cur_amt(negate(canR.trd_cur_amt()));
				canR.trd_cur_tax_amt(negate(canR.trd_cur_tax_amt()));
				canR.trd_cur_dscnt_amt(negate(canR.trd_cur_dscnt_amt()));
				canR.base_cur_amt(negate(canR.base_cur_amt()));
				canR.base_cur_tax_amt(negate(canR.base_cur_tax_amt()));
				canR.base_cur_dscnt_amt(negate(canR.base_cur_dscnt_amt()));
				canR.wtax_amt(negate(canR.wtax_amt()));
			}
			else {
				for (MST_DLV_SLIP_D_R r : dlvSlipDL) {
					if (MAC_SLIP_STS_TYP.isCAN(r.getStringNE(MST_DLV_SLIP_R.$slip_sts_typ))) {
						canR = r;
						break;
					}
				}
			}
			
			return canR;
		}
		
		protected MCList<MST_DLV_SLIP_D_R> getDlvSlipDL4Inst(MST_DLV_SLIP_D_R dlvSlipDR) {
			return _dlvSlipDL
				.subList(_idxkeyDlvSlipD, dlvSlipDR.getStringNE("ship_inst_dlv_slip_d_no"))
				.subList(r ->
					 isSame(r.dlv_slip_no(), dlvSlipDR.getStringNE("ship_inst_dlv_slip_no"))
					 && isSame(r.dlv_slip_seq(), dlvSlipDR.getNumberNE("ship_inst_dlv_slip_seq"))
				);
		}
		/**
		 * 上り電文の出荷予定NOで出荷予定レコードを一括取得する。
		 * @param upd02DtlList　上り電文
		 * @return
		 */
		protected MCList<MST_SHIP_SCHD_R> getShipSchdL(
				MCList<Sls_Schd_Upd02_DtlR> upd02DtlList) {
			// 出荷予定の検索
			MCList<MST_SHIP_SCHD_R> shipSchdL = MCList.create(MST_SHIP_SCHD_R.class);
			dbSelectKey("MSBBL6220_MST_SHIP_SCHD_S02", shipSchdL,
					MCQueryApiBuilder.create(MST_SHIP_SCHD_R.create("T")), upd02DtlList);
			return shipSchdL;
		}

		/**
		 * 上り電文の受注明細NOで受注明細レコードを一括取得する。
		 * @param upd02DtlList　上り電文
		 * @return
		 */
		protected MCList<MST_SLO_D_R> getSloDL(
				MCList<Sls_Schd_Upd02_DtlR> upd02DtlList) {
			MCList<MST_SLO_D_R> sloDL = MCList.create(MST_SLO_D_R.class);
			MST_SLO_D_R t = MST_SLO_D_R.create("T");
			MCQueryApiBuilder sloDL_bldr = MCQueryApiBuilder.create(t);
			MST_SLO_R t1 = MST_SLO_R.create("T1");
			sloDL.addStringColumn("trd_cur_cd");
			sloDL.addStringColumn("cst_cd");
			sloDL.addStringColumn("trd_ptn_typ");
			sloDL.addStringColumn("sls_basis_typ");
			sloDL_bldr.addInnerJoin(t1, bracket( t.slo_no.eq(t1.slo_no)));
			sloDL_bldr.addSelect(t1.trd_cur_cd);
			sloDL_bldr.addSelect(t1.cst_cd);
			sloDL_bldr.addSelect(t1.trd_ptn_typ);
			sloDL_bldr.addSelect(t1.sls_basis_typ);
			dbSelectKey("MSBBL6220_MST_SLO_D_S02", sloDL, sloDL_bldr, upd02DtlList);
			return sloDL;
		}

		/**
		 * データ更新区分が新規、更新、上り電文.インボイス明細NOが設定された場合ロックした売上予定レコードに対し項目を編集する。
		 * @param lockedSlsSchdR 売上予定レコード
		 * @param upd02DtlRow　上り電文レコード
		 * @param ivdR　インボイス明細レコード
		 */
		protected void edidSlsSchdRow(MST_SLS_SCHD_R lockedSlsSchdR,
				Sls_Schd_Upd02_DtlR upd02DtlRow, MST_IV_D_R ivdR) {
			lockedSlsSchdR.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.SHIP_ACT.value());//売上予定作成元区分
			lockedSlsSchdR.iv_no(ivdR.getString("iv_no"));//インボイスＮＯ
			lockedSlsSchdR.iv_d_no(upd02DtlRow.iv_d_no());//インボイス明細ＮＯ
			lockedSlsSchdR.sls_schd_dt(upd02DtlRow.sls_schd_dt());//売上予定日
			lockedSlsSchdR.trd_unit_cd(upd02DtlRow.trd_unit_cd());//取引単位ＣＤ
			lockedSlsSchdR.trd_unit_qty(upd02DtlRow.trd_unit_qty());//取引単位数量
			lockedSlsSchdR.base_unit_cd(upd02DtlRow.base_unit_cd());//基準単位ＣＤ
			lockedSlsSchdR.base_unit_qty(upd02DtlRow.base_unit_qty());//基準単位数量

			lockedSlsSchdR.cmpl_flg(upd02DtlRow.abort_flg());//完了ＦＬＧ
			lockedSlsSchdR.abort_flg(upd02DtlRow.abort_flg());//打切ＦＬＧ
			lockedSlsSchdR.sls_ac_abl_flg(!upd02DtlRow.abort_flg());//売上計上可能ＦＬＧ
			if (upd02DtlRow.abort_flg()) {
				lockedSlsSchdR.base_unit_abort_qty(upd02DtlRow.base_unit_qty());//基準単位打切数量		
			}
			else {
				lockedSlsSchdR.base_unit_abort_qty(0);//基準単位打切数量
			}
		}

		/**
		 * データ更新区分が打切取消、上り電文.インボイス明細NOが設定された場合ロックした売上予定レコードに対し項目を編集する。
		 * @param lockedSlsSchdR 売上予定レコード
		 * @param upd02DtlRow　上り電文レコード
		 * @param ivdR　インボイス明細レコード
		 */
		protected void edidSlsSchdRowAbrCan(MST_SLS_SCHD_R lockedSlsSchdR) {
			lockedSlsSchdR.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.SHIP_ACT.value());//売上予定作成元区分	
			lockedSlsSchdR.cmpl_flg(false);//完了ＦＬＧ
			lockedSlsSchdR.abort_flg(false);//打切ＦＬＧ
			lockedSlsSchdR.sls_ac_abl_flg(false);//売上計上可能ＦＬＧ
			lockedSlsSchdR.base_unit_abort_qty(0);//基準単位打切数量
			lockedSlsSchdR.base_unit_sls_qty(0);//基基準単位売上数量
		}

		/**
		 * 取引単位数量換算処理(出荷実績分)
		 * @param newSlsSchdR 売上予定レコード
		 * @param upd02DtlRow　上り電文レコード
		 * @param shipSchdR　出荷予定レコード
		 * @param mstSloDR　受注明細レコード
		 */
		protected void trdQtyConv(MST_SLS_SCHD_R newSlsSchdR,
				Sls_Schd_Upd02_DtlR upd02DtlRow, MST_SHIP_SCHD_R shipSchdR,
				MST_SLO_D_R mstSloDR) {
			//上り電文.取引単位CDは出荷予定.取引単位CDと同じ場合
			if (isSame(upd02DtlRow.trd_unit_cd(), shipSchdR.trd_unit_cd())) {
				newSlsSchdR.trd_unit_cd(upd02DtlRow.trd_unit_cd());
				newSlsSchdR.trd_unit_qty(upd02DtlRow.trd_unit_qty());
			}
			else {
				//上り電文.取引単位CDは出荷予定.取引単位CDと異なる場合、取引単位CD、取引単位数量の換算が必要。		
				MCNumber trdUnitQty = cnvBaseToTrdUnitQty(mstSloDR.itm_cd(),
						mstSloDR.itm_sub1(), mstSloDR.itm_sub2(), mstSloDR.itm_sub3(),
						upd02DtlRow.base_unit_qty(), shipSchdR.trd_unit_cd());
				if (isNull(trdUnitQty)) {
					//換算不可の場合。売上予定.取引単位CDに上り電文.基準単位CDで設定し、売上予定.取引単位数に上り電文.基準単位数で設定する。	
					newSlsSchdR.trd_unit_cd(upd02DtlRow.base_unit_cd());
					newSlsSchdR.trd_unit_qty(upd02DtlRow.base_unit_qty());
				}
				else {
					//換算時に端数が発生しない場合、売上予定.取引単位CDに出荷予定.取引単位CDで設定し、売上予定.取引単位数に換算結果値で設定する。	
					newSlsSchdR.trd_unit_cd(shipSchdR.trd_unit_cd());
					newSlsSchdR.trd_unit_qty(trdUnitQty);
				}
			}
		}

		/**
		 * 取引単位数量換算処理(未出荷分)
		 * @param newSlsSchdR 売上予定レコード
		 * @param shipSchdR　出荷予定レコード
		 * @param mstSloDR　受注明細レコード
		 */
		protected void trdQtyConvNoShip(MST_SLS_SCHD_R newSlsSchdR,
				MST_SHIP_SCHD_R shipSchdR, MST_SLO_D_R mstSloDR) {
			//換算結果値　=　（出荷予定.基準単位数量－出荷予定.出荷実績数）　÷　出荷予定.取引単位CDに対応する品目単位マスタ.単位換算数
			MCNumber notShipAmt = shipSchdR.base_unit_qty()
					.subtract(shipSchdR.ship_act_qty());

			//上り電文.取引単位CDは出荷予定.取引単位CDと異なる場合、取引単位CD、取引単位数量の換算が必要。		
			MCNumber trdUnitQty = cnvBaseToTrdUnitQty(mstSloDR.itm_cd(),
					mstSloDR.itm_sub1(), mstSloDR.itm_sub2(), mstSloDR.itm_sub3(),
					notShipAmt, shipSchdR.trd_unit_cd());
			if (isNull(trdUnitQty)) {
				//売上予定.取引単位CDに出荷予定.基準単位CDで設定し、売上予定.取引単位数に出荷予定.基準単位数-出荷予定.出荷実績数で設定する。
				newSlsSchdR.trd_unit_cd(shipSchdR.base_unit_cd());
				newSlsSchdR.trd_unit_qty(notShipAmt);
			}
			else {
				//換算時に端数が発生しない場合、売上予定.取引単位CDに出荷予定.取引単位CDで設定し、売上予定.取引単位数に換算結果値で設定する。	
				newSlsSchdR.trd_unit_cd(shipSchdR.trd_unit_cd());
				newSlsSchdR.trd_unit_qty(trdUnitQty);
			}
		}

		/**
		 * 与信額の算出
		 * 与信額の計算対象：	打切、打切取消による与信額の変更。
		 * @param lockedSlsSchdR 売上予定レコード
		 * @param upd02DtlRow　上り電文レコード
		 * @param mstSloR　受注ヘッダレコード
		 * @param mstSloDR　受注明細レコード
		 * @param shipSchdR　出荷予定レコード
		 */
		protected void calcCredAmt(MST_SLS_SCHD_R lockedSlsSchdR,
				Sls_Schd_Upd02_DtlR upd02DtlRow, MST_SLO_D_R mstSloDR,
				MST_SHIP_SCHD_R shipSchdR) {
			if (upd02DtlRow.cred_no_up_flg()) {
				return;
			}
			if (isNull(lockedSlsSchdR)){
				return;
			}
			//一時変数の定義：与信更新対象データROW
			Cred_Upd01_CndR credR = Cred_Upd01_CndR.create();
			MCNumber credQty = MCNumber.ZERO;
			MCNumber credRAmt = MCNumber.ZERO;
			//※受注ヘッダ.取引通貨に対応する通貨マスタ.金額小数部有効桁数、受注ヘッダ.得意先CDに対応する取引先マスタ.売上金額端数処理区分により端数処理する。
			MCNumber decPlace = getAmtDecPlace(mstSloDR.getString("trd_cur_cd"));
			String rndTyp = getRndTyp(mstSloDR.getString("cst_cd"));

			//上り電文.出荷予定NO　≠　一時変数：出荷予定NOの場合処理を行う。
			if (isSame(upd02DtlRow.ship_schd_no(), _shipSchdNo)) {
				return;
			}

			MAM_ITM_R itmR = _cacheItm.get(mstSloDR.itm_cd(),mstSloDR.itm_sub1(),mstSloDR.itm_sub2(),mstSloDR.itm_sub3());

			//一時変数：出荷予定NO　に上り電文.出荷予定NOを設定する。
			_shipSchdNo = upd02DtlRow.ship_schd_no();
			//①	打切対象の与信額の算出						
			//上り電文.データ更新区分＝新規　OR　更新、且つ上り電文.打切ＦＬＧ＝オンのレコードに対し、下記の処理を行う。
			if ((MAC_DATA_CRUD_TYP.isUPD(upd02DtlRow.data_crud_typ())
					|| MAC_DATA_CRUD_TYP.isCRT(upd02DtlRow.data_crud_typ()))
					&& upd02DtlRow.abort_flg()) {
				//・受注ヘッダ.取引CD≠売上の場合、下記の処理を行わなく、次のレコードをループする。	
				if (MAC_TRD_PTN_TYP.isSLS(mstSloDR.getString("trd_ptn_typ"))) {
					//基準単位打切数量の算出：	
					if (!isNull(upd02DtlRow.dlv_slip_d_no())) {
						//上り電文.納品書明細NOが設定された場合,基準単位打切数量　=　出荷予定.基準単位数量－出荷予定.出荷実績数	
						credQty = shipSchdR.base_unit_qty()
								.subtract(shipSchdR.ship_act_qty());
					}
					else if (!isNull(upd02DtlRow.iv_d_no())) {
						//基準単位打切数量　=　出荷予定.基準単位数量 ※インボイス明細により出荷実績登録は一部出荷がないため、打切りは全数打切となる。
						credQty = shipSchdR.base_unit_qty();
					}
					//打切りFLGは変更されていない、数量のみ変更された場合、打切り数＝上記算出された数量－売上予定.打切り数
					if (lockedSlsSchdR.abort_flg()) {
						credQty = credQty.subtract(lockedSlsSchdR.base_unit_abort_qty());
					}
					//	与信額＝(受注明細.取引通貨金額　＋　受注明細.取引通貨税額）　÷　受注明細.基準単位数量　× 基準単位打切数量　×　-1					
					credQty = credQty.multiply(-1);
					makeCredAmt(mstSloDR, credR, itmR, credRAmt, credQty, decPlace, rndTyp);
				}
			}
			//②	打切取消対象の与信額の算出	
			//上り電文.データ更新区分＝打切取消のレコードに対し、下記の処理を行う。
			if ((MAC_DATA_CRUD_TYP.isUPD(upd02DtlRow.data_crud_typ())
					|| MAC_DATA_CRUD_TYP.isCRT(upd02DtlRow.data_crud_typ()))
					&& lockedSlsSchdR.abort_flg() && !upd02DtlRow.abort_flg()) {
				//・受注ヘッダ.取引CD≠売上の場合、下記の処理を行わなく、次のレコードをループする。	
				if (MAC_TRD_PTN_TYP.isSLS(mstSloDR.getString("trd_ptn_typ"))) {
					//基準単位打切数量の算出：						
					if (!isNull(upd02DtlRow.dlv_slip_d_no())) {
						//上り電文.納品書明細NOが設定された場合,基準単位打切数量　=　出荷予定.基準単位数量－出荷予定.出荷実績数	
						credQty = lockedSlsSchdR.base_unit_abort_qty();
					}
					else if (!isNull(upd02DtlRow.iv_d_no())) {
						//基準単位打切数量　=　出荷予定.基準単位数量 ※インボイス明細により出荷実績登録は一部出荷がないため、打切りは全数打切となる。
						credQty = shipSchdR.base_unit_qty();
					}
					// 出荷指図対象外の場合、予定超過分を加算
					if (MAC_SHIP_INST_TYP.isNON(mstSloDR.ship_inst_typ()) 
						&& upd02DtlRow.base_unit_qty().gt(shipSchdR.base_unit_qty())) {
						credQty = credQty.add(upd02DtlRow.base_unit_qty().subtract(shipSchdR.base_unit_qty()));
					}
					makeCredAmt(mstSloDR, credR, itmR, credRAmt, credQty, decPlace, rndTyp);
				}
			}
			if (!MAC_TRD_PTN_TYP.isSLS(mstSloDR.getString("trd_ptn_typ"))) {
				return;
			}
			
			// 出荷予定ＮＯ毎に与信額を計算する
			MCIndexKey idxkey = up0().createIndex(Sls_Schd_Upd02_DtlR.$ship_schd_no);
			MCList<Sls_Schd_Upd02_DtlR> subL = up0().subList(idxkey, shipSchdR.ship_schd_no());
			
			MCNumber canShipSchdQtySum = getCanShiSchdQty(subL, shipSchdR);
			
			MCNumber abortCredQty = credQty;
			if ((MAC_DATA_CRUD_TYP.isUPD(upd02DtlRow.data_crud_typ())
					|| MAC_DATA_CRUD_TYP.isCRT(upd02DtlRow.data_crud_typ()))
					&& isManualAbort(lockedSlsSchdR)) {
				// 販売納期調整登録画面でマニュアルで打切った場合に、売上予定の打切数量が出荷実績の打切数量ではないため、除外する。
				abortCredQty = abortCredQty.subtract(lockedSlsSchdR.base_unit_abort_qty());
			}
			
			MST_DLV_SLIP_D_R dlvSlipDR = null;
			MST_DLV_SLIP_D_R canDlvSlipDR = null;
			MST_DLV_SLIP_D_R shipInstDlvSlipDR = null;
			
			for (Sls_Schd_Upd02_DtlR dtlR : subL) {
				
				credQty = MCNumber.ZERO;
				credRAmt = MCNumber.ZERO;
				
				if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ()) 
						|| MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
					// 更新または削除の場合、赤伝票を取得し、出荷実績を登録時に、与信対象額に加算した金額を減算する
					canDlvSlipDR = getDlvSlipDR4Can(dtlR.dlv_slip_d_no());
					
					if (isNull(canDlvSlipDR)) {
						continue;
					}
					
					// 赤伝票の減算（金額と数量がマイナス）
					credQty = credQty.add(canDlvSlipDR.base_unit_qty());
					// 販売納期調整登録画面でマニュアルで打切った場合に、与信対象額は既に反映されているため、計算対象外とする。
					if (!isManualAbort(dtlR.dlv_slip_d_no())) {
						credRAmt = credRAmt.add(sum(canDlvSlipDR.trd_cur_amt(), canDlvSlipDR.trd_cur_tax_amt()));
					}
					
					// 出荷予定数量を算出し、出荷指図または受注時の金額を加算する
					MCNumber schdQty = MCNumber.ZERO;
					schdQty = MCNumber.min(canShipSchdQtySum, canDlvSlipDR.base_unit_qty().abs());
					
					canShipSchdQtySum = canShipSchdQtySum.subtract(schdQty);
					if (canShipSchdQtySum.isNegative()) {
						canShipSchdQtySum = MCNumber.ZERO;
					}
					
					if (schdQty.isPositive()) {
						
						credQty = credQty.add(schdQty);
						
						MCNumber incTaxAmt = MCNumber.ZERO;
						MCNumber baseQty = MCNumber.ZERO;
						if ((MAC_SHIP_INST_TYP.isPICK(mstSloDR.ship_inst_typ()) 
								|| MAC_SHIP_INST_TYP.isNO_PICK(mstSloDR.ship_inst_typ())) 
								&& getDlvSlipDL4Inst(canDlvSlipDR).size() > 0) {
							// 出荷指図ありの場合、出荷指図時点の納品書伝票明細を基づき、与信額を算出する。
							// 出荷指図時の納品書伝票明細が取得できない場合、受注明細で計算する。
							shipInstDlvSlipDR = getDlvSlipDL4Inst(canDlvSlipDR).get(0);
							incTaxAmt = shipInstDlvSlipDR.trd_cur_amt().add(shipInstDlvSlipDR.trd_cur_tax_amt());
							baseQty = shipInstDlvSlipDR.base_unit_qty();
						}
						else {
							incTaxAmt = mstSloDR.trd_cur_amt().add(mstSloDR.trd_cur_tax_amt());
							baseQty = mstSloDR.base_unit_qty();
						}
						
						if (!credQty.isPositive()) {
							// 全数出荷または過剰出荷の場合、予定数量の全数分の与信額を戻す。
							credRAmt = credRAmt.add(incTaxAmt.multiply(schdQty)
									.divide(baseQty, decPlace.intValue(), MAC_RND_TYP.toMC(rndTyp)));
						}
						else {
							// 一部出荷の場合、出荷の分のみ戻す。
							credRAmt = credRAmt.add(incTaxAmt.multiply(canDlvSlipDR.base_unit_qty().abs())
									.divide(baseQty, decPlace.intValue(), MAC_RND_TYP.toMC(rndTyp)));
						}
					}
				}
				
				if (!credRAmt.isZero()) {
					credR = Cred_Upd01_CndR.create();
					if (itmR.dscnt_itm_flg()) {
						credRAmt = credRAmt.multiply(-1);
					}
					credR.cst_cd(mstSloDR.getString("cst_cd"));
					credR.cur_cd(mstSloDR.getString("trd_cur_cd"));
					credR.trd_ptn_typ(mstSloDR.getString("trd_ptn_typ"));
					credR.amt(credRAmt);
					_credAmtL.add(credR);
				}
			}
			
			// 出荷実績数量の合計を計算する
			MCNumber shipActQtySum = MCNumber.ZERO;
			for (Sls_Schd_Upd02_DtlR dtlR : subL) {
				
				if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
					shipActQtySum = shipActQtySum.add(dtlR.base_unit_qty());
				}
			}
			
			// 出荷予定数量の合計を計算する（この時点は、既に出荷実績が出荷予定に反映されている）
			MCNumber shipSchdQtySum = MCNumber.max(shipSchdR.base_unit_qty(), shipSchdR.ship_inst_qty())
					.subtract(shipSchdR.abort_qty())
					.subtract(shipSchdR.ship_act_qty().subtract(shipActQtySum));
			if (shipSchdQtySum.isNegative()) {
				shipSchdQtySum = MCNumber.ZERO;
			}
			
			for (Sls_Schd_Upd02_DtlR dtlR : subL) {
				
				credQty = MCNumber.ZERO;
				credRAmt = MCNumber.ZERO;
					
				if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
					// 新規または更新の場合、納品書伝票明細を取得し、金額を加算する
					
					MCList<MST_DLV_SLIP_D_R> dlvSlipDL = getDlvSlipDL(dtlR.dlv_slip_d_no());
					dlvSlipDL.sort(SortType.DESC, MST_DLV_SLIP_D_R.$dlv_slip_d_seq);
					
					if (dlvSlipDL.isEmpty()) {
						continue;
					}
					
					dlvSlipDR = dlvSlipDL.get(0);
					
					credQty = credQty.add(dlvSlipDR.base_unit_qty());
					credRAmt = credRAmt.add(sum(dlvSlipDR.trd_cur_amt(), dlvSlipDR.trd_cur_tax_amt()));
					
					// 出荷予定数量を算出し、出荷指図または受注時の金額を加算する
					MCNumber schdQty = MCNumber.min(shipSchdQtySum, dlvSlipDR.base_unit_qty());
					
					shipSchdQtySum = shipSchdQtySum.subtract(schdQty);
					if (shipSchdQtySum.isNegative()) {
						shipSchdQtySum = MCNumber.ZERO;
					}
					
					MCNumber incTaxAmt = MCNumber.ZERO;
					MCNumber baseQty = MCNumber.ZERO;
					if ((MAC_SHIP_INST_TYP.isPICK(mstSloDR.ship_inst_typ()) 
							|| MAC_SHIP_INST_TYP.isNO_PICK(mstSloDR.ship_inst_typ()))
							&& getDlvSlipDL4Inst(dlvSlipDR).size() > 0) {
						// 出荷指図ありの場合、出荷指図時点の納品書伝票明細を基づき、与信額を算出する。
						shipInstDlvSlipDR = getDlvSlipDL4Inst(dlvSlipDR).get(0);
						incTaxAmt = shipInstDlvSlipDR.trd_cur_amt().add(shipInstDlvSlipDR.trd_cur_tax_amt());
						baseQty = shipInstDlvSlipDR.base_unit_qty();
					}
					else {
						incTaxAmt = mstSloDR.trd_cur_amt().add(mstSloDR.trd_cur_tax_amt());
						baseQty = mstSloDR.base_unit_qty();
					}
					
					if (schdQty.isPositive()) {
						
						credQty = credQty.subtract(schdQty);
						
						if (!credQty.isNegative()) {
							// 全数出荷または過剰出荷の場合、予定数量の全数分の与信額を戻す。
							credRAmt = credRAmt.subtract(incTaxAmt.multiply(schdQty)
									.divide(baseQty, decPlace.intValue(), MAC_RND_TYP.toMC(rndTyp)));
						}
						else {
							// 一部出荷の場合、出荷の分のみ戻す。
							credRAmt = credRAmt.subtract(incTaxAmt.multiply(dlvSlipDR.base_unit_qty())
									.divide(baseQty, decPlace.intValue(), MAC_RND_TYP.toMC(rndTyp)));
						}
					}
					if (!abortCredQty.isZero()) {
						
						credRAmt = credRAmt.add(incTaxAmt.multiply(abortCredQty)
								.divide(baseQty, decPlace.intValue(), MAC_RND_TYP.toMC(rndTyp)));
						
						abortCredQty = MCNumber.ZERO;
					}
					
					if (!credRAmt.isZero()) {
						credR = Cred_Upd01_CndR.create();
						if (itmR.dscnt_itm_flg()) {
							credRAmt = credRAmt.multiply(-1);
						}
						credR.cst_cd(mstSloDR.getString("cst_cd"));
						credR.cur_cd(mstSloDR.getString("trd_cur_cd"));
						credR.trd_ptn_typ(mstSloDR.getString("trd_ptn_typ"));
						credR.amt(credRAmt);
						
						_credAmtL.add(credR);
					}
				}
			}
		}

		/**
		 * 出荷指図対象外売上時の与信金額算出
		 * @param mstSloDR
		 * @param credR
		 * @param itmR
		 * @param credRAmt
		 * @param credQty
		 * @param decPlace
		 * @param rndTyp
		 */
		protected void makeCredAmt(MST_SLO_D_R mstSloDR, Cred_Upd01_CndR credR, MAM_ITM_R itmR,
				MCNumber credRAmt, MCNumber credQty, MCNumber decPlace, String rndTyp) {
			// 出荷指図対象外の場合（指図区分：対象外、売上計上区分：出荷基準）
			if (MAC_SHIP_INST_TYP.isNON(mstSloDR.ship_inst_typ())) {
				if (MAC_SLS_BASIS_TYP.isSHIP_BASIS(mstSloDR.getString("sls_basis_typ"))) {
					credRAmt = (mstSloDR.trd_cur_amt().add(mstSloDR.trd_cur_tax_amt()))
							.multiply(credQty).divide(mstSloDR.base_unit_qty(),
									decPlace.intValue(), MAC_RND_TYP.toMC(rndTyp));
					if (itmR.dscnt_itm_flg()) {
						credRAmt = credRAmt.multiply(-1);
					}
					credR.cst_cd(mstSloDR.getString("cst_cd"));
					credR.cur_cd(mstSloDR.getString("trd_cur_cd"));
					credR.trd_ptn_typ(mstSloDR.getString("trd_ptn_typ"));
					credR.amt(credRAmt);
					_credAmtL.add(credR);
				}
			}
		}

		/**
		 * 引数で指定された納品書明細ＮＯで売上予定を取得し、打切ＦＬＧがオンかどうかを判定する。<br>
		 * 販売納期調整登録画面で出荷済の売上予定をマニュアルで打切った場合に、納品書明細ＮＯありかつ打切りとなる。
		 * @param dlvSlipDNo 納品書明細ＮＯ
		 * @return 納品書明細ＮＯありかつ打切の場合はtrue
		 */
		protected boolean isManualAbort(String dlvSlipDNo) {
			
			MCList<MST_SLS_SCHD_R> slsSchdL = MCList.create(MST_SLS_SCHD_R.class);
			MST_SLS_SCHD_R t = MST_SLS_SCHD_R.create("T");
			MCQueryApiBuilder slsSchdL_bldr = MCQueryApiBuilder.create(t);
			slsSchdL_bldr.setWhere(t.dlv_slip_d_no.eq(bind("1")), dlvSlipDNo);
			slsSchdL_bldr.addWhereWithAnd(t.abort_flg.eq(value(true)));
			dbSelect("MSBBL6220_MST_SLS_SCHD_S07", slsSchdL, slsSchdL_bldr);
			
			return !slsSchdL.isEmpty();
		}
		
		/**
		 * 指定された売上予定がマニュアルで打切ったかどうか。
		 * @param slsSchdR 売上予定
		 * @return マニュアルで打切った場合はtrue
		 */
		protected boolean isManualAbort(MST_SLS_SCHD_R slsSchdR) {
			return !isNull(slsSchdR.dlv_slip_d_no()) && slsSchdR.abort_flg();
		}

		protected MCNumber getCanShiSchdQty(MCList<Sls_Schd_Upd02_DtlR> dtlL, MST_SHIP_SCHD_R shipSchdR) {
			
			MCList<MST_SLS_SCHD_R> slsSchdL = MCList.create(MST_SLS_SCHD_R.class);
			MST_SLS_SCHD_R t = MST_SLS_SCHD_R.create("T");
			MCQueryApiBuilder slsSchdL_bldr = MCQueryApiBuilder.create(t);
			slsSchdL_bldr.setWhere(t.ship_schd_no.eq(bind("1")), shipSchdR.ship_schd_no());
			dbSelect("MSBBL6220_MST_SLS_SCHD_S08", slsSchdL, slsSchdL_bldr);
			
			MCNumber canShipSchdQtySum = MCNumber.max(shipSchdR.base_unit_qty(), shipSchdR.ship_inst_qty());
			
			MCIndexKey dlvSlipDNoidxkey = dtlL.createIndex(Sls_Schd_Upd02_DtlR.$dlv_slip_d_no);
			for (MST_SLS_SCHD_R slsSchd : slsSchdL) {
				
				if (!dtlL.contains(dlvSlipDNoidxkey, slsSchd.dlv_slip_d_no())) {
					
					if (!isNull(slsSchd.dlv_slip_d_no()) || slsSchd.abort_flg()) {
						canShipSchdQtySum = canShipSchdQtySum.subtract(slsSchd.base_unit_qty());
					}
				}
			}
			if (canShipSchdQtySum.isNegative()) {
				canShipSchdQtySum = MCNumber.ZERO;
			}
			
			return canShipSchdQtySum;
		}
		/**
		 * 受払予定の更新
		 */
		protected void updIOSchd() {
			MSBEL_IoSchdService.IoSchd_Del01 opeDel = MSBEL_IoSchdService.crtIoSchd_Del01();
			MSBEL_IoSchdService.IoSchd_Ins01 opeIns = MSBEL_IoSchdService.crtIoSchd_Ins01();
			//上り電文取得
			MCList<Sls_Schd_Upd02_ShipActR> upd02ShipActList = up1();
			
			// 受注明細
			MCList<MST_SLO_D_R> sloDL = MCList.create(MST_SLO_D_R.class);
			MST_SLO_D_R t = MST_SLO_D_R.create("T");
			MCQueryApiBuilder sloDL_bldr = MCQueryApiBuilder.create(t);
			MST_SHIP_PR_R t1 = MST_SHIP_PR_R.create("T1");
			MST_SHIP_SCHD_R t2 = MST_SHIP_SCHD_R.create("T2");
			MST_SLO_R t3 = MST_SLO_R.create("T3");
			sloDL_bldr.addSelect(t3.sls_basis_typ);
			sloDL_bldr.addSelect(t2.ship_schd_no);
			sloDL_bldr.addInnerJoin(t1, bracket(t.slo_d_no.eq(t1.slo_d_no)));
			sloDL_bldr.addInnerJoin(t2, bracket(t1.ship_pr_no.eq(t2.ship_pr_no)));
			sloDL_bldr.addInnerJoin(t3, bracket(t.slo_no.eq(t3.slo_no)));
			sloDL_bldr.setWhere(t2.ship_schd_no.eq(bind("ship_schd_no")));
			dbSelect("MSBBL6220_MST_SLO_D_S03", sloDL, sloDL_bldr, upd02ShipActList);
			
			MCIndexKey idxSloDL = sloDL.createIndex(MST_SHIP_SCHD_R.$ship_schd_no);
			
			//上り電文に対し、繰り返し処理
			for (Sls_Schd_Upd02_ShipActR upd02ShipActR : upd02ShipActList) {
				MST_SHIP_ACT_D_R shipActDR = MST_SHIP_ACT_D_R.create("T");//出荷実績明細
				dbSelectKey("MSBBL6220_MST_SHIP_ACT_D_S01", shipActDR,
						MCQueryApiBuilder.create(shipActDR), upd02ShipActR);
				if (!MAC_STK_MNG_TYP.isMNG(shipActDR.stk_mng_typ())) {
					continue;
				}
				//上り電文.データ更新区分が削除の場合
				if (MAC_DATA_CRUD_TYP.isDEL(upd02ShipActR.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isUPD(upd02ShipActR.data_crud_typ())) {
					MSW_IO_SCHD_DEL_R cndR = MSW_IO_SCHD_DEL_R.create();
					//電文項目編集
					cndR.io_schd_typ(MSC_IO_SCHD_TYP.SLS.value());
					cndR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SHIP.value());
					cndR.io_schd_no(upd02ShipActR.ship_act_d_no());
					cndR.io_schd_seq(null);
					opeDel.up0().add(cndR);
				}
				//データ更新区分が新規、更新の上り電文
				if (MAC_DATA_CRUD_TYP.isCRT(upd02ShipActR.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isUPD(upd02ShipActR.data_crud_typ())) {
					//出荷実績明細NOをもとに、出荷実績ヘッダ、出荷実績明細を取得する。
					MST_SHIP_ACT_R shipActR = MST_SHIP_ACT_R.create("T");
					MCQueryApiBuilder shipActR_bldr = MCQueryApiBuilder.create(shipActR);//出荷実績ヘッダ

					shipActR_bldr.setSelect(shipActR.ship_tm);
					shipActR_bldr.addSelect(shipActR.dlv_tm);
					dbSelectKey("MSBBL6220_MST_SHIP_ACT_S01", shipActR, shipActR_bldr, shipActDR);
					//受払予定サービスの上り電文のROW
					IoSchd_Ins01_DtlR ioR = IoSchd_Ins01_DtlR.create();
					//電文項目編集
					copy(ioR, shipActDR, createMap_IoSchd_Ins01_DtlR_MST_SHIP_ACT_D_R());
					//受注明細データの変数
					MST_SLO_D_R mstSloDR = sloDL.getFirst(idxSloDL, upd02ShipActR.ship_schd_no());
					ioR.io_schd_sub_no1(mstSloDR.slo_no()); //受払予定予備ＮＯ１
					ioR.io_schd_sub_no2(mstSloDR.slo_d_no()); //受払予定予備ＮＯ２
					ioR.io_schd_sub_no3(upd02ShipActR.ship_schd_no()); //受払予定予備ＮＯ３
					ioR.alloc_scope_typ(mstSloDR.alloc_scope_typ()); //引当範囲区分
					ioR.rsn_cd(mstSloDR.sls_rsn_cd()); // 理由ＣＤ

					//予定日付, 検査終了予定日
					if (MAC_SLS_BASIS_TYP.isSHIP_BASIS(mstSloDR.getString("sls_basis_typ"))) {
						ioR.schd_dt(isNull(shipActR.ship_tm()) ? null : shipActR.ship_tm().startTimeOfDay());
						ioR.insp_cmpl_schd_dt(isNull(shipActR.ship_tm()) ? null : shipActR.ship_tm().startTimeOfDay());
					}
					else if (MAC_SLS_BASIS_TYP.isIN_BASIS(mstSloDR.getString("sls_basis_typ"))
							|| MAC_SLS_BASIS_TYP.isARRIVAL_BASIS(mstSloDR.getString("sls_basis_typ"))) {
						ioR.schd_dt(isNull(shipActR.dlv_tm()) ? null : shipActR.dlv_tm().startTimeOfDay());
						ioR.insp_cmpl_schd_dt(isNull(shipActR.dlv_tm()) ? null : shipActR.dlv_tm().startTimeOfDay());
						if (!isNull(mstSloDR.sls_schd_dt())) {
							ioR.accpt_schd_dt(mstSloDR.sls_schd_dt());
						}
					}
					opeIns.up0().add(ioR);
				}
			}
			//実行を行う
			if (opeDel.up0().size() > 0) {
				opeDel.exec();
			}
			if (opeIns.up0().size() > 0) {
				opeIns.exec();
			}
		}
	}

	/**
	 * Sls_Schd_Upd03オペレーション.<p>
	 *
	 */
	public class Sls_Schd_Upd03 extends MSBBL_SlsSchdService_MC_A.Sls_Schd_Upd03 {
		protected MSBEL_IoSchdService.IoSchd_Del01 opeDel = MSBEL_IoSchdService.crtIoSchd_Del01();
		protected MSBEL_IoSchdService.IoSchd_Ins01 opeIns = MSBEL_IoSchdService.crtIoSchd_Ins01();

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			_credAmtL = MCList.create(Cred_Upd01_CndR.class);
			//売上予定更新
			updSlsSchd();
			//受払予定の更新
			updIOSchd();
			//与信更新
			updCred();
		}

		/**
		 * 売上予定更新
		 */
		protected void updSlsSchd() {
			//上り電文取得
			MCList<Sls_Schd_Upd03_DtlR> upd03DtlList = getTar(up0());
			// キャッシュ取得
			MCList<MST_SLS_SCHD_R> slsSchdL = MCList.create(MST_SLS_SCHD_R.class);
			MCList<MST_SLO_D_R> sloDL = MCList.create(MST_SLO_D_R.class);
			createCache(upd03DtlList, slsSchdL, sloDL);
			// キャッシュ取得用インデックス
			MCIndexKey ikSlsSchd = slsSchdL.createIndex(MST_SLS_SCHD_R.$sls_schd_no);
			MCIndexKey ikSloD = sloDL.createIndex(MST_SLO_D_R.$slo_d_no);

			//上り電文に対し、繰り返し処理
			for (Sls_Schd_Upd03_DtlR upd03DtlRow : upd03DtlList) {
				if (isNull(upd03DtlRow.base_unit_sls_qty())) {
					// 打切取消の場合に数量がNULLになるので０を補完する。
					upd03DtlRow.base_unit_sls_qty(0);
				}
				//売上予定ロック時に取得したデータ	
				MST_SLS_SCHD_R lockedSlsSchdR = slsSchdL.getFirst(ikSlsSchd, upd03DtlRow.sls_schd_no());
				
				boolean isAbort = lockedSlsSchdR.abort_flg();
				MCNumber abortQtyOld = lockedSlsSchdR.base_unit_abort_qty();

				//受注明細データの変数
				MST_SLO_D_R mstSloDR = sloDL.getFirst(ikSloD, lockedSlsSchdR.slo_d_no());

				//打切FLG=オンの場合				
				if (upd03DtlRow.abort_flg()) {
					//打切りの場合
					//完了FLG＝オンに設定
					lockedSlsSchdR.cmpl_flg(true);
					//打切FLG=オンに設定
					lockedSlsSchdR.abort_flg(true);
					//基準単位売上数量
					lockedSlsSchdR.base_unit_sls_qty(lockedSlsSchdR.base_unit_sls_qty()
							.add(upd03DtlRow.base_unit_sls_qty()));
					//基準単位打切数量
					MCNumber baseUnitAbrQty = lockedSlsSchdR.base_unit_qty()
							.subtract(lockedSlsSchdR.base_unit_sls_qty());
					if (baseUnitAbrQty.isNegative()) {
						baseUnitAbrQty = MCNumber.ZERO;
					}
					lockedSlsSchdR.base_unit_abort_qty(baseUnitAbrQty);
				}
				else if (lockedSlsSchdR.abort_flg()) {
					//打切り取消の場合（上り電文.打切FLG=オフ,売上予定.打切FLG＝オン）の場合					
					lockedSlsSchdR.abort_flg(false);
					//基準単位売上数量
					lockedSlsSchdR.base_unit_sls_qty(lockedSlsSchdR.base_unit_sls_qty()
							.add(upd03DtlRow.base_unit_sls_qty()));
					//基準単位打切数量＝0					
					lockedSlsSchdR.base_unit_abort_qty(0);
					//完了FLG:基準単位数≦基準単位売上数量の場合、オンで設定					
					lockedSlsSchdR.cmpl_flg(lockedSlsSchdR.base_unit_qty()
							.lte(lockedSlsSchdR.base_unit_sls_qty()));
				}
				else {
					//打切FLG=オフに設定
					lockedSlsSchdR.abort_flg(false);
					//基準単位売上数量
					lockedSlsSchdR.base_unit_sls_qty(lockedSlsSchdR.base_unit_sls_qty()
							.add(upd03DtlRow.base_unit_sls_qty()));
					//基準単位打切数量＝0					
					lockedSlsSchdR.base_unit_abort_qty(0);
					//完了FLG:基準単位数≦基準単位売上数量の場合、オンで設定					
					lockedSlsSchdR.cmpl_flg(lockedSlsSchdR.base_unit_qty()
							.lte(lockedSlsSchdR.base_unit_sls_qty()));
				}
				if (upd03DtlRow.manual_upd_flg()) {
					lockedSlsSchdR.sls_schd_dt(upd03DtlRow.sls_schd_dt());
				}
				//打切対象の与信額の算出
				calcCredAmt(isAbort, abortQtyOld, lockedSlsSchdR, mstSloDR, upd03DtlRow);
				//受払予定を削除
				updIOSchd(lockedSlsSchdR, mstSloDR);
			}

			MST_SLS_SCHD_R t = MST_SLS_SCHD_R.create("T");
			MCQueryApiBuilder slsSchdL_bldr = MCQueryApiBuilder.create(t);
			slsSchdL_bldr.setSet(t.abort_flg);
			slsSchdL_bldr.addSet(t.base_unit_sls_qty);
			slsSchdL_bldr.addSet(t.base_unit_abort_qty);
			slsSchdL_bldr.addSet(t.cmpl_flg);
			// 販売納期調整登録画面で訂正する場合は、「マニュアル訂正」が混在しないため、１行目の値で判定する
			if (upd03DtlList.get(0).manual_upd_flg()) {
				slsSchdL_bldr.addSet(t.sls_schd_dt);
			}
			dbUpdateKey("MSBBL6220_MST_SLS_SCHD_U04", slsSchdL, slsSchdL_bldr);
		}
		
		/**
		 * 上り電文を基に登録対象を取得する
		 * 
		 * @param up
		 * @return
		 */
		protected MCList<Sls_Schd_Upd03_DtlR> getTar(MCList<Sls_Schd_Upd03_DtlR> up) {
			
			// 売上訂正時の伝票分割で、プラス・マイナスの２行で呼び出されることがあるため集計する
			MCGroupByPolicy gp = new MCGroupByPolicy();
			gp.addKey(Sls_Schd_Upd03_DtlR.$data_crud_typ, Sls_Schd_Upd03_DtlR.$sls_schd_no, Sls_Schd_Upd03_DtlR.$abort_flg);
			// 販売納期調整登録画面で訂正する場合は、「マニュアル訂正」が混在しないため、１行目の値で判定する
			if (up.get(0).manual_upd_flg()) {
				gp.addKey(Sls_Schd_Upd03_DtlR.$manual_upd_flg, Sls_Schd_Upd03_DtlR.$sls_schd_dt);
			}
			gp.sum(Sls_Schd_Upd03_DtlR.$base_unit_sls_qty);
			return up0().groupBy(gp);
		}
		
		/**
		 * 必要なトランザクション、マスタを一括で取得する
		 * 
		 * @param upd03DtlList
		 * @param slsSchdL
		 * @param sloDL
		 */
		protected void createCache(MCList<Sls_Schd_Upd03_DtlR> upd03DtlList, MCList<MST_SLS_SCHD_R> slsSchdL, MCList<MST_SLO_D_R> sloDL) {
			
			MCList<MST_SLS_SCHD_R> wkL = MCList.create(MST_SLS_SCHD_R.class);
			for (Sls_Schd_Upd03_DtlR upd03DtlRow : upd03DtlList) {
				MST_SLS_SCHD_R wkR = MST_SLS_SCHD_R.create();
				wkR.sls_schd_no(upd03DtlRow.sls_schd_no());
				wkL.add(wkR);
			}
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_SLS_SCHD_R.create("T"));
			dbWkDelete("MSBBL6220_MSW_SLS_SCHD_D01", wkL_bldr.getBaseDbc());
			dbWkInsert("MSBBL6220_MSW_SLS_SCHD_I01", wkL, wkL_bldr.getBaseDbc());
			
			// 売上予定
			MCList<MST_SLS_SCHD_R> tmpSlsSchdL = getSlsSchdL();
			slsSchdL.setAll(tmpSlsSchdL);
			
			// 受注明細、受注ヘッダ
			MCList<MST_SLO_D_R> tmpSloDL = getSloDL();
			sloDL.setAll(tmpSloDL);
			
			dbWkDelete("MSBBL6220_MSW_SLS_SCHD_D02", wkL_bldr.getBaseDbc());

			// 取引先マスタ
			MAM_BP_R bpL_t = MAM_BP_R.create("T");
			MCQueryApiBuilder bpL_bldr = MCQueryApiBuilder.create(bpL_t);
			bpL_bldr.setSelect(bpL_t.sls_amt_rnd_typ);
			_cacheBp = new FXUCL_MCDbcCache<MAM_BP_R>(bpL_bldr, tmpSloDL, "cst_cd");
		}
		
		/**
		 * 売上予定レコードを一括取得する。
		 * 
		 * @return
		 */
		protected MCList<MST_SLS_SCHD_R> getSlsSchdL() {
			MCList<MST_SLS_SCHD_R> slsSchdL = MCList.create(MST_SLS_SCHD_R.class);
			MST_SLS_SCHD_R t = MST_SLS_SCHD_R.create("T");
			MCQueryApiBuilder slsSchdL_bldr = MCQueryApiBuilder.create(t);
			MSW_SLS_SCHD_KEY_R w = MSW_SLS_SCHD_KEY_R.create("W");
			slsSchdL_bldr.addInnerJoin(w, bracket( t.sls_schd_no.eq(w.sls_schd_no)));
			slsSchdL_bldr.setOrderByAsc(slsSchdL_bldr.getBaseDbc().getKeyColumn$());
			slsSchdL_bldr.setLockTable(t.sls_schd_no);
			dbSelectForUpdate("MSBBL6220_MST_SLS_SCHD_S09", slsSchdL, slsSchdL_bldr);
			
			return slsSchdL;
		}

		/**
		 * 受注明細レコードを一括取得する。
		 * 
		 * @return
		 */
		protected MCList<MST_SLO_D_R> getSloDL() {
			MCList<MST_SLO_D_R> sloDL = MCList.create(MST_SLO_D_R.class);
			sloDL.addStringColumn("trd_cur_cd");
			sloDL.addStringColumn("cst_cd");
			sloDL.addStringColumn("trd_ptn_typ");
			MST_SLO_D_R t = MST_SLO_D_R.create("T");
			MCQueryApiBuilder sloDL_bldr = MCQueryApiBuilder.create(t);
			MST_SLO_R t1 = MST_SLO_R.create("T1");
			MST_SLS_SCHD_R t2 = MST_SLS_SCHD_R.create("T2");
			MSW_SLS_SCHD_KEY_R w = MSW_SLS_SCHD_KEY_R.create("W");
			sloDL_bldr.addInnerJoin(t1, bracket(t.slo_no.eq(t1.slo_no)));
			sloDL_bldr.addInnerJoin(t2, bracket(t.slo_d_no.eq(t2.slo_d_no)));
			sloDL_bldr.addInnerJoin(w, bracket(t2.sls_schd_no.eq(w.sls_schd_no)));
			sloDL_bldr.addSelect(t1.trd_cur_cd);
			sloDL_bldr.addSelect(t1.cst_cd);
			sloDL_bldr.addSelect(t1.trd_ptn_typ);
			dbSelect("MSBBL6220_MST_SLO_D_S04", sloDL, sloDL_bldr);
			return sloDL;
		}

		/**
		 * 受払予定サービスを実行する
		 */
		protected void updIOSchd() {
			//実行を行う
			if (opeDel.up0().size() > 0) {
				opeDel.exec();
			}
			if (opeIns.up0().size() > 0) {
				opeIns.exec();
			}
		}

		/**
		 * 受払予定の削除の上り電文を作成
		 * @param slsSchdR 売上予定レコード
		 * @param mstSloDR　受注明細レコード
		 */
		protected void updIOSchd(MST_SLS_SCHD_R slsSchdR, MST_SLO_D_R mstSloDR) {
			if (isNull(slsSchdR.slo_d_no()) && !isNull(slsSchdR.iv_d_no())) {
				// 受注なしのインボイスの場合は、対象外とする
				return;
			}
			//預り売上の場合、更新しない
			if (!isNull(mstSloDR) && mstSloDR.sls_cststk_flg()) {
				return;
			}
			//仕入直送の売上の場合、売上予定NOで受払予定を削除する。				
			if (!isNull(mstSloDR)
					&& MAC_SLO_PROC_TYP.isPURC_DDLV(mstSloDR.proc_typ())) {
				//電文項目編集
				MSW_IO_SCHD_DEL_R cndR = MSW_IO_SCHD_DEL_R.create();
				cndR.io_schd_typ(MSC_IO_SCHD_TYP.SLS.value());
				cndR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.DDLV_SLO.value());
				cndR.io_schd_no(slsSchdR.sls_schd_no());
				cndR.io_schd_seq(null);
				opeDel.up0().add(cndR);
			}						
			else if (!isNull(slsSchdR.dlv_slip_d_no())) {
				//売上予定を更新した結果、完了FLGがオンになった場合、対応する受払予定を削除する。	
				
				//売上予定.納品書明細NOが設定された場合、売上予定.納品書明細NOを元に、出荷実績明細NOを取得する。
				MCList<MST_SHIP_ACT_D_R> shipActDL = MCList.create(MST_SHIP_ACT_D_R.class);
				MST_SHIP_ACT_D_R shipActDL_t = MST_SHIP_ACT_D_R.create("T");
				MCQueryApiBuilder shipActDL_bldr = MCQueryApiBuilder.create(shipActDL_t);
				shipActDL_bldr.setSelect(shipActDL_t.ship_act_d_no);
				shipActDL_bldr.setWhere(shipActDL_t.dlv_slip_d_no.eq(bind("1")), slsSchdR.dlv_slip_d_no());
				shipActDL_bldr.addWhereWithAnd(shipActDL_t.can_flg.eq(value(false)));
				dbSelect("MSBBL6220_MST_SHIP_ACT_D_S02", shipActDL, shipActDL_bldr);
				for (MST_SHIP_ACT_D_R shipActDR : shipActDL) {
					//電文項目編集
					MSW_IO_SCHD_DEL_R cndR = MSW_IO_SCHD_DEL_R.create();
					cndR.io_schd_typ(MSC_IO_SCHD_TYP.SLS.value());
					cndR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SHIP.value());
					cndR.io_schd_no(shipActDR.ship_act_d_no());
					cndR.io_schd_seq(null);
					opeDel.up0().add(cndR);
				}
			}
			else if (!isNull(slsSchdR.iv_d_no())) {
				//売上予定.インボイス明細NOが設定された場合、売上予定.インボイス明細NOを元に、インボイス出荷実績明細NOを取得する。
				MCList<MST_IV_SHIP_ACT_D_R> ivShipActDL = MCList.create(MST_IV_SHIP_ACT_D_R.class);
				MST_IV_SHIP_ACT_D_R ivShipActDL_t = MST_IV_SHIP_ACT_D_R.create("T");
				MCQueryApiBuilder ivShipActDL_bldr = MCQueryApiBuilder.create(ivShipActDL_t);
				ivShipActDL_bldr.setSelect(ivShipActDL_t.iv_ship_act_d_no);
				ivShipActDL_bldr.setWhere(ivShipActDL_t.iv_d_no.eq(bind("1")), slsSchdR.iv_d_no());
				dbSelect("MSBBL6220_MST_IV_SHIP_ACT_D_S01", ivShipActDL, ivShipActDL_bldr);
				for (MST_IV_SHIP_ACT_D_R ivShipActDR : ivShipActDL) {
					//電文項目編集
					MSW_IO_SCHD_DEL_R cndR = MSW_IO_SCHD_DEL_R.create();
					cndR.io_schd_typ(MSC_IO_SCHD_TYP.SLS.value());
					cndR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.EX.value());
					cndR.io_schd_no(ivShipActDR.iv_ship_act_d_no());
					cndR.io_schd_seq(null);
					opeDel.up0().add(cndR);
				}
			}
			else {
				//受注NOを元に、出荷引当状況を取得する。
				MCList<MST_SHIP_ALLOC_STS_R> shipAllocStsR = MCList.create(MST_SHIP_ALLOC_STS_R.class);
				MST_SHIP_ALLOC_STS_R shipAllocStsR_t = MST_SHIP_ALLOC_STS_R.create("T");
				MCQueryApiBuilder shipAllocStsR_bldr = MCQueryApiBuilder.create(shipAllocStsR_t);
				MST_SHIP_SCHD_R t1 = MST_SHIP_SCHD_R.create("T1");
				MST_SHIP_PR_R t2 = MST_SHIP_PR_R.create("T2");
				MST_SLO_D_R t3 = MST_SLO_D_R.create("T3");
				shipAllocStsR_bldr.addLeftOuterJoin(t1, bracket(t1.ship_schd_no.eq(shipAllocStsR_t.ship_schd_no)));
				shipAllocStsR_bldr.addLeftOuterJoin(t2, bracket(t2.ship_pr_no.eq(t1.ship_pr_no)));
				shipAllocStsR_bldr.addLeftOuterJoin(t3, bracket(t3.slo_d_no.eq(t2.slo_d_no)));
				shipAllocStsR_bldr.addSelect(t1.dlv_inst_rcpt_no);
				shipAllocStsR_bldr.addSelect(t1.slo_prms_no);
				shipAllocStsR_bldr.addSelect(t1.ship_inst_d_no);
				if (isNull(slsSchdR.ship_schd_no())) {
					shipAllocStsR_bldr.setWhere(t3.slo_d_no.eq(bind("1")), slsSchdR.slo_d_no());
				}
				else {
					shipAllocStsR_bldr.setWhere(shipAllocStsR_t.ship_schd_no.eq(bind("1")),
							slsSchdR.ship_schd_no());
				}
				dbSelect("MSBBL6220_MST_SHIP_ALLOC_STS_S01", shipAllocStsR, shipAllocStsR_bldr);

				for (MST_SHIP_ALLOC_STS_R alcStsR : shipAllocStsR) {
					boolean isInst = !isNull(alcStsR.getStringNE("SHIP_INST_D_NO"));
					String ioSchdStsTyp = getIoSchdStsTypForShip(
							MAC_TRD_PTN_TYP.SLS.value(),
							alcStsR.getStringNE("DLV_INST_RCPT_NO"),
							alcStsR.getStringNE("SLO_PRMS_NO"), false, isInst, false,
							false);
					//電文項目編集
					MSW_IO_SCHD_DEL_R cndR = MSW_IO_SCHD_DEL_R.create();
					cndR.io_schd_typ(MSC_IO_SCHD_TYP.SLS.value());
					cndR.io_schd_sts_typ(ioSchdStsTyp);
					cndR.io_schd_no(alcStsR.ship_alloc_sts_no()); //出荷引当状況NO
					cndR.io_schd_seq(null);
					opeDel.up0().add(cndR);
				}
			}

			if (!slsSchdR.cmpl_flg()) {
				
				//仕入直送の売上の場合、売上予定NOで受払予定を削除する。				
				if (!isNull(mstSloDR)
						&& MAC_SLO_PROC_TYP.isPURC_DDLV(mstSloDR.proc_typ())) {
					//受払予定サービスの上り電文のROW
					IoSchd_Ins01_DtlR ioR = IoSchd_Ins01_DtlR.create();
					//電文項目編集
					copy(ioR, mstSloDR, createMap_IoSchd_Ins01_DtlR_MST_SLO_D_R());
					ioR.io_schd_no(slsSchdR.sls_schd_no()); //受払予定ＮＯ
					ioR.schd_dt(slsSchdR.sls_schd_dt()); //予定日付
					ioR.accpt_schd_dt(slsSchdR.sls_schd_dt()); //検収予定日
					ioR.lot_no(slsSchdR.lot_no()); //ロットＮＯ
					ioR.sublot_no(slsSchdR.sublot_no()); //サブロットＮＯ
					MCNumber notSlsQty = slsSchdR.base_unit_qty()
							.subtract(slsSchdR.base_unit_sls_qty());

					MCNumber trdUnitQty = cnvBaseToTrdUnitQty(mstSloDR.itm_cd(),
							mstSloDR.itm_sub1(), mstSloDR.itm_sub2(), mstSloDR.itm_sub3(),
							notSlsQty, slsSchdR.trd_unit_cd());
					if (isNull(trdUnitQty)) {
						ioR.trd_unit_cd(slsSchdR.base_unit_cd()); //取引単位ＣＤ
						ioR.trd_unit_qty(notSlsQty); //取引単位数量
					}
					else {
						ioR.trd_unit_cd(slsSchdR.trd_unit_cd()); //取引単位ＣＤ
						ioR.trd_unit_qty(trdUnitQty); //取引単位数量
					}
					ioR.base_unit_cd(slsSchdR.base_unit_cd()); //基準単位ＣＤ
					ioR.base_unit_qty(notSlsQty); //基準単位数量
					//場所CDの設定
					if (MAC_SLO_PROC_TYP.isPURC_DDLV(mstSloDR.proc_typ())) {
						MST_SLO_R sloR = MST_SLO_R.create("T");
						MCQueryApiBuilder sloR_bldr = MCQueryApiBuilder.create(sloR);
						sloR_bldr.setSelect(sloR.sls_dpt_cd);
						sloR_bldr.addSelect(sloR.slo_dt);
						dbSelectKey("MSBBL6220_MST_SLO_S02", sloR, sloR_bldr, mstSloDR);
						ioR.loc_cd(MSUCL_SlsUtil.getMidLocCd(sloR.sls_dpt_cd(), sloR.slo_dt()));
					}
					opeIns.up0().add(ioR);
				}
				else if (!isNull(slsSchdR.dlv_slip_d_no())) {
					//売上予定.納品書明細NOが設定された場合、売上予定.納品書明細NOを元に、出荷実績明細NOを取得する。
					MCList<MST_SHIP_ACT_D_R> shipActDL = MCList.create(MST_SHIP_ACT_D_R.class);
					MST_SHIP_ACT_D_R shipActDL_t = MST_SHIP_ACT_D_R.create("T");
					MCQueryApiBuilder shipActDL_bldr = MCQueryApiBuilder.create(shipActDL_t);
					shipActDL_bldr.setWhere(shipActDL_t.dlv_slip_d_no.eq(bind("1")), slsSchdR.dlv_slip_d_no());
					shipActDL_bldr.addWhereWithAnd(shipActDL_t.can_flg.eq(value(false)));
					dbSelect("MSBBL6220_MST_SHIP_ACT_D_S03", shipActDL, shipActDL_bldr);
					
					MCList<MST_SLS_ACT_IO_R> slsActIoL = MCList.create(MST_SLS_ACT_IO_R.class);
					MST_SLS_ACT_IO_R slsActIoL_t = MST_SLS_ACT_IO_R.create("T");
					MCQueryApiBuilder slsActIoL_bldr = MCQueryApiBuilder.create(slsActIoL_t);
					MST_SLS_ACT_D_R slsActIoL_t2 = MST_SLS_ACT_D_R.create("T2");
					MST_SLS_ACT_R slsActIoL_t3 = MST_SLS_ACT_R.create("T3");
					slsActIoL_bldr.addInnerJoin(slsActIoL_t2, bracket(
							slsActIoL_t.sls_act_d_no.eq(slsActIoL_t2.sls_act_d_no)
							.and(slsActIoL_t.sls_act_d_seq.eq(slsActIoL_t2.sls_act_d_seq))));
					slsActIoL_bldr.addInnerJoin(slsActIoL_t3,
							bracket(slsActIoL_t2.sls_act_no.eq(slsActIoL_t3.sls_act_no)
									.and(slsActIoL_t2.sls_act_seq.eq(slsActIoL_t3.sls_act_seq))));
					slsActIoL_bldr.addWhereWithAnd(slsActIoL_t3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
					slsActIoL_bldr.addWhereWithAnd(slsActIoL_t2.sls_schd_no.eq(bind("1")),
							slsSchdR.sls_schd_no());
					dbSelect("MSBBL6220_MST_SLS_ACT_IO_S01", slsActIoL, slsActIoL_bldr);
					
					MCIndexKey ikSlsActIo = slsActIoL.createIndex(MST_SLS_ACT_IO_R.$ship_act_d_no);
					
					for (MST_SHIP_ACT_D_R shipActDR : shipActDL) {
						
						MCNumber slsQty = MCNumber.ZERO;
						MCList<MST_SLS_ACT_IO_R> tarSlsActIoL = slsActIoL.subList(ikSlsActIo, shipActDR.ship_act_d_no());
						if (!tarSlsActIoL.isEmpty()) {
							slsQty = tarSlsActIoL.sum(MST_SLS_ACT_IO_R.$base_unit_qty);
						}
						MCNumber notSlsQty = shipActDR.base_unit_qty().subtract(shipActDR.ship_ret_qty()).subtract(slsQty);
						
						if (notSlsQty.gt(0)) {
							//電文項目編集										
							//受払予定サービスの上り電文のROW
							IoSchd_Ins01_DtlR ioR = IoSchd_Ins01_DtlR.create();
							//電文項目編集
							copy(ioR, shipActDR, createMap_IoSchd_Ins01_DtlR_MST_SHIP_ACT_D_R());
							if (!isNull(mstSloDR)) {
								ioR.io_schd_sub_no1(mstSloDR.slo_no()); //受払予定予備ＮＯ１
								ioR.io_schd_sub_no2(mstSloDR.slo_d_no()); //受払予定予備ＮＯ２
								ioR.io_schd_sub_no3(slsSchdR.ship_schd_no());  //受払予定予備ＮＯ３
								//引当範囲区分
								ioR.alloc_scope_typ(mstSloDR.alloc_scope_typ());
								ioR.rsn_cd(mstSloDR.sls_rsn_cd());
							}
							ioR.schd_dt(slsSchdR.sls_schd_dt()); //予定日付

							if (notSlsQty.lt(shipActDR.base_unit_qty())) {
								MCNumber trdUnitQty = cnvBaseToTrdUnitQty(
										shipActDR.itm_cd(), shipActDR.itm_sub1(),
										shipActDR.itm_sub2(), shipActDR.itm_sub3(),
										notSlsQty, shipActDR.trd_unit_cd());
								if (isNull(trdUnitQty)) {
									ioR.trd_unit_cd(slsSchdR.base_unit_cd()); //取引単位ＣＤ
									ioR.trd_unit_qty(notSlsQty); //取引単位数量
								}
								else {
									ioR.trd_unit_cd(shipActDR.trd_unit_cd()); //取引単位ＣＤ
									ioR.trd_unit_qty(trdUnitQty); //取引単位数量
								}
								ioR.base_unit_cd(slsSchdR.base_unit_cd()); //基準単位ＣＤ
								ioR.base_unit_qty(notSlsQty); //基準単位数量
							}
							opeIns.up0().add(ioR);
						}
					}
				}
				else if (!isNull(slsSchdR.iv_d_no())) {
					//売上予定.インボイス明細NOが設定された場合、売上予定.インボイス明細NOを元に、インボイス出荷実績明細NOを取得する。
					MCList<MST_IV_SHIP_ACT_D_R> ivShipActDL = MCList.create(MST_IV_SHIP_ACT_D_R.class);
					MST_IV_SHIP_ACT_D_R ivShipActDL_t = MST_IV_SHIP_ACT_D_R.create("T");
					MCQueryApiBuilder ivShipActDL_bldr = MCQueryApiBuilder.create(ivShipActDL_t);
					MST_IV_R ivShipActDL_t1 = MST_IV_R.create("T1");
					MST_SHIP_ACT_D_R ivShipActDL_t2 = MST_SHIP_ACT_D_R.create("T2");
					MST_SHIP_ALLOC_STS_R ivShipActDL_t3 = MST_SHIP_ALLOC_STS_R.create("T3");
					ivShipActDL_bldr.addLeftOuterJoin(ivShipActDL_t1,
							bracket(ivShipActDL_t.iv_no.eq(ivShipActDL_t1.iv_no)));
					ivShipActDL_bldr.addLeftOuterJoin(ivShipActDL_t2,
							bracket(ivShipActDL_t.ship_act_d_no.eq(ivShipActDL_t2.ship_act_d_no)
									.and(ivShipActDL_t2.can_flg.eq(value(false)))));
					ivShipActDL_bldr.addLeftOuterJoin(ivShipActDL_t3,
							bracket(ivShipActDL_t2.ship_alloc_sts_no.eq(ivShipActDL_t3.ship_alloc_sts_no)));
					ivShipActDL_bldr.addSelect(ivShipActDL_t1.cmpl_schd_dt);
					ivShipActDL_bldr.addSelect(ivShipActDL_t3.ship_schd_no);
					ivShipActDL_bldr.setWhere(ivShipActDL_t.iv_d_no.eq(bind("1")), slsSchdR.iv_d_no());
					dbSelect("MSBBL6220_MST_IV_SHIP_ACT_D_S02", ivShipActDL, ivShipActDL_bldr);
					MCNumber notSlsQty = slsSchdR.base_unit_qty().subtract(slsSchdR.base_unit_sls_qty());
					for (MST_IV_SHIP_ACT_D_R ivShipActDR : ivShipActDL) {
						if (notSlsQty.gt(0)) {
							//受払予定サービスの上り電文のROW
							IoSchd_Ins01_DtlR ioR = IoSchd_Ins01_DtlR.create();
							//電文項目編集
							copy(ioR, ivShipActDR, createMap_IoSchd_Ins01_DtlR_MST_IV_SHIP_ACT_D_R());
							if (!isNull(mstSloDR)) {
								ioR.io_schd_sub_no1(mstSloDR.slo_no()); //受払予定予備ＮＯ１
								ioR.io_schd_sub_no2(mstSloDR.slo_d_no()); //受払予定予備ＮＯ２
								ioR.io_schd_sub_no3(ivShipActDR.getStringNE("SHIP_SCHD_NO")); //受払予定予備ＮＯ３
								//引当範囲区分
								ioR.alloc_scope_typ(mstSloDR.alloc_scope_typ());
								ioR.rsn_cd(mstSloDR.sls_rsn_cd());
							}
							ioR.schd_dt(slsSchdR.sls_schd_dt());//予定日付
							ioR.accpt_schd_dt(ivShipActDR.getDateNE("CMPL_SCHD_DT")); //検収予定日
							//検査終了予定日
							ioR.insp_cmpl_schd_dt(ivShipActDR.getDateNE("CMPL_SCHD_DT"));
							if (notSlsQty.lt(ivShipActDR.base_unit_qty())) {
								MCNumber trdUnitQty = cnvBaseToTrdUnitQty(
										ivShipActDR.itm_cd(), ivShipActDR.itm_sub1(),
										ivShipActDR.itm_sub2(), ivShipActDR.itm_sub3(),
										notSlsQty, ivShipActDR.trd_unit_cd());
								if (isNull(trdUnitQty)) {
									ioR.trd_unit_cd(slsSchdR.base_unit_cd()); //取引単位ＣＤ
									ioR.trd_unit_qty(notSlsQty); //取引単位数量
								}
								else {
									ioR.trd_unit_cd(ivShipActDR.trd_unit_cd()); //取引単位ＣＤ
									ioR.trd_unit_qty(trdUnitQty); //取引単位数量
								}
								ioR.base_unit_cd(slsSchdR.base_unit_cd()); //基準単位ＣＤ
								ioR.base_unit_qty(notSlsQty); //基準単位数量
							}
							notSlsQty = notSlsQty.subtract(ioR.base_unit_qty());
							opeIns.up0().add(ioR);
						}
					}
				}
				else {
					//受注NOを元に、出荷引当状況を取得する。
					MCList<MST_SHIP_ALLOC_STS_R> shipAllocStsR = MCList.create(MST_SHIP_ALLOC_STS_R.class);
					MST_SHIP_ALLOC_STS_R shipAllocStsR_t = MST_SHIP_ALLOC_STS_R.create("T");
					MCQueryApiBuilder shipAllocStsR_bldr = MCQueryApiBuilder.create(shipAllocStsR_t);
					MST_SHIP_SCHD_R shipAllocStsR_t1 = MST_SHIP_SCHD_R.create("T1");
					MST_SHIP_PR_R shipAllocStsR_t2 = MST_SHIP_PR_R.create("T2");
					MST_SLO_D_R shipAllocStsR_t3 = MST_SLO_D_R.create("T3");
					shipAllocStsR_bldr.addLeftOuterJoin(shipAllocStsR_t1,
							bracket(shipAllocStsR_t1.ship_schd_no.eq(shipAllocStsR_t.ship_schd_no)));
					shipAllocStsR_bldr.addLeftOuterJoin(shipAllocStsR_t2, bracket(
							shipAllocStsR_t2.ship_pr_no.eq(shipAllocStsR_t1.ship_pr_no)));
					shipAllocStsR_bldr.addLeftOuterJoin(shipAllocStsR_t3, bracket(
							shipAllocStsR_t3.slo_d_no.eq(shipAllocStsR_t2.slo_d_no)));
					shipAllocStsR_bldr.addSelect(shipAllocStsR_t1.dlv_inst_rcpt_no);
					shipAllocStsR_bldr.addSelect(shipAllocStsR_t1.slo_prms_no);
					shipAllocStsR_bldr.addSelect(shipAllocStsR_t1.ship_inst_d_no);
					if (isNull(slsSchdR.ship_schd_no())) {
						shipAllocStsR_bldr.setWhere(shipAllocStsR_t3.slo_d_no.eq(bind("1")),slsSchdR.slo_d_no());
					}
					else {
						shipAllocStsR_bldr.setWhere(shipAllocStsR_t.ship_schd_no.eq(bind("1")),slsSchdR.ship_schd_no());
					}
					dbSelect("MSBBL6220_MST_SHIP_ALLOC_STS_S02", shipAllocStsR, shipAllocStsR_bldr);
					MCNumber notSlsQty = slsSchdR.base_unit_qty().subtract(slsSchdR.base_unit_sls_qty());

					for (MST_SHIP_ALLOC_STS_R alcStsR : shipAllocStsR) {
						if (notSlsQty.gte(0)) {
							boolean isInst = !isNull(alcStsR.getStringNE("SHIP_INST_D_NO"));
							String ioSchdStsTyp = getIoSchdStsTypForShip(
									MAC_TRD_PTN_TYP.SLS.value(),
									alcStsR.getStringNE("DLV_INST_RCPT_NO"),
									alcStsR.getStringNE("SLO_PRMS_NO"), false, isInst,
									false, false);
							//受払予定サービスの上り電文のROW
							IoSchd_Ins01_DtlR ioR = IoSchd_Ins01_DtlR.create();
							//電文項目編集
							copy(ioR, alcStsR, createMap_IoSchd_Ins01_DtlR_MST_SHIP_ALLOC_STS_R());
							ioR.io_schd_sts_typ(ioSchdStsTyp); //受払予定状況区分
							ioR.io_schd_no(alcStsR.ship_alloc_sts_no()); //受払予定ＮＯ
							ioR.schd_dt(slsSchdR.sls_schd_dt()); //予定日付
							ioR.accpt_schd_dt(mstSloDR.accpt_schd_dt()); //検収予定日
							ioR.io_schd_sub_no1(mstSloDR.slo_no()); //受払予定予備ＮＯ１
							ioR.io_schd_sub_no2(mstSloDR.slo_d_no()); //受払予定予備ＮＯ２
							ioR.io_schd_sub_typ3(
									MSC_IO_SCHD_SUB_TYP.SHIP_SCHD_NO.value());
							ioR.io_schd_sub_no3(alcStsR.ship_schd_no());
							ioR.io_schd_pr_no(null); //受払進捗管理ＮＯ
							ioR.itm_cd(mstSloDR.itm_cd()); //品目ＣＤ
							ioR.itm_sub1(mstSloDR.itm_sub1()); //枝番１
							ioR.itm_sub2(mstSloDR.itm_sub2()); //枝番２
							ioR.itm_sub3(mstSloDR.itm_sub3()); //枝番３

							MCNumber trdUnitQty = cnvBaseToTrdUnitQty(mstSloDR.itm_cd(),
									mstSloDR.itm_sub1(), mstSloDR.itm_sub2(),
									mstSloDR.itm_sub3(), notSlsQty,
									alcStsR.trd_unit_cd());
							if (isNull(trdUnitQty)) {
								ioR.trd_unit_cd(alcStsR.base_unit_cd()); //取引単位ＣＤ
								ioR.trd_unit_qty(notSlsQty); //取引単位数量
							}
							else {
								ioR.trd_unit_cd(alcStsR.trd_unit_cd()); //取引単位ＣＤ
								ioR.trd_unit_qty(trdUnitQty); //取引単位数量
							}
							ioR.base_unit_cd(alcStsR.base_unit_cd()); //基準単位ＣＤ
							ioR.base_unit_qty(notSlsQty); //基準単位数量
							opeIns.up0().add(ioR);
						}
					}
				}
			}
		}

		/**
		 * 与信額計算
		 * @param lockedSlsSchdR 売上予定レコード
		 * @param mstSloDR　受注ヘッダレコード
		 * @param upd03DtlRow　上り電文レコード
		 */
		protected void calcCredAmt(boolean isAbort, MCNumber abortQtyOld,
				MST_SLS_SCHD_R lockedSlsSchdR, MST_SLO_D_R mstSloDR,
				Sls_Schd_Upd03_DtlR upd03DtlRow) {
			//更新の場合与信を更新しない、打切り、打切取消の場合のみ与信を更新する
			if (!upd03DtlRow.abort_flg() && !isAbort) {
				return;
			}
			MCNumber credQty = MCNumber.ZERO;
			MCNumber credRAmt = MCNumber.ZERO;

			Cred_Upd01_CndR credR = Cred_Upd01_CndR.create();
			//打切FLG=オンの場合				
			if (upd03DtlRow.abort_flg()) {
				//基準単位打切数量＝売上予定.基準単位打切数量
				credQty = lockedSlsSchdR.base_unit_abort_qty();
				if (isAbort) {
					credQty = credQty.subtract(abortQtyOld);
				}
				credQty = credQty.multiply(-1);
			}
			//打切り取消の場合、変更前の打切り数で計算。
			else if (isAbort) {
				//基準単位打切数量＝売上予定.基準単位数量　－　基準単位売上数量
				credQty = abortQtyOld;
			}

			MAM_ITM_R itmR = MAM_ITM_R.create("T");
			MCQueryApiBuilder itmR_bldr = MCQueryApiBuilder.create(itmR);
			itmR_bldr.setSelect(itmR.dscnt_itm_flg);
			dbSelectKey("MSBBL6220_MAM_ITM_S01", itmR, itmR_bldr, mstSloDR);

			//売上予定.納品書明細NOが設定された場合、売上予定.納品書明細NOを元に、納品伝票明細からレコードを取得する。
			if (!isNull(lockedSlsSchdR.dlv_slip_d_no())) {
				MST_DLV_SLIP_D_R dlvSlipDR = MST_DLV_SLIP_D_R.create("T");
				MCQueryApiBuilder dlvSlipDR_bldr = MCQueryApiBuilder.create(dlvSlipDR);
				MST_DLV_SLIP_D_R w1 = MST_DLV_SLIP_D_R.create("W1");
				MST_SHIP_ACT_D_R w2 = MST_SHIP_ACT_D_R.create("W2");
				
				dlvSlipDR_bldr.setWhere(dlvSlipDR.dlv_slip_d_no.eq(bind("1")), lockedSlsSchdR.dlv_slip_d_no());
				dlvSlipDR_bldr.addWhereWithAnd(dlvSlipDR.dlv_slip_d_seq.eq(
					subQuery()
					.select(max(w1.dlv_slip_d_seq))
					.from(w1
						.innerJoin(w2).on(
							w2.dlv_slip_d_no.eq(w1.dlv_slip_d_no)
							.and(w2.dlv_slip_no.eq(w1.dlv_slip_no))
							.and(w2.dlv_slip_seq.eq(w1.dlv_slip_seq))
							.and(w2.can_flg.eq(value(false)))
						)
					)
					.where(
						w1.dlv_slip_d_no.eq(dlvSlipDR.dlv_slip_d_no)
					)
				));
				dbSelect("MSBBL6220_MST_DLV_SLIP_D_S03", dlvSlipDR, dlvSlipDR_bldr);
				
				MST_DLV_SLIP_R dlvSlipR = MST_DLV_SLIP_R.create("T");
				dbSelectKey("MSBBL6220_MST_DLV_SLIP_S01", dlvSlipR,
						MCQueryApiBuilder.create(dlvSlipR), dlvSlipDR);

				MCNumber decPlace = getAmtDecPlace(dlvSlipR.trd_cur_cd());
				String rndTyp = getRndTyp(dlvSlipR.bp_cd());

				//与信額＝(納品伝票明細.取引通貨金額　＋　納品伝票明細.取引通貨税額）　÷　納品伝票明細.基準単位数量　× 基準単位打切数量　×　-1
				credRAmt = (dlvSlipDR.trd_cur_amt().add(dlvSlipDR.trd_cur_tax_amt()))
						.multiply(credQty).divide(dlvSlipDR.base_unit_qty(),
								decPlace.intValue(), MAC_RND_TYP.toMC(rndTyp));
				if (itmR.dscnt_itm_flg()) {
					credRAmt = credRAmt.multiply(-1);
				}
				credR.cst_cd(dlvSlipR.bp_cd());//得意先CD
				credR.cur_cd(dlvSlipR.trd_cur_cd());//取引通貨ＣＤ.
				credR.trd_ptn_typ(dlvSlipR.trd_ptn_typ());//取引パタン区分.
				credR.amt(credRAmt);//与信額
				_credAmtL.add(credR);

			}
			else if (!isNull(lockedSlsSchdR.iv_d_no())) {
				//売上予定.インボイス明細NOが設定された場合、売上予定.インボイス明細NOを元に、インボイス明細からレコードを取得する。
				MST_IV_D_R ivDR = MST_IV_D_R.create("T");
				dbSelectKey("MSBBL6220_MST_IV_D_S02", ivDR, MCQueryApiBuilder.create(ivDR), lockedSlsSchdR);
				MST_IV_R ivR = MST_IV_R.create("T");
				dbSelectKey("MSBBL6220_MST_IV_S01", ivR, MCQueryApiBuilder.create(ivR), ivDR);
				
				MCNumber decPlace = getAmtDecPlace(ivR.trd_cur_cd());
				String rndTyp = getRndTyp(mstSloDR.getString("cst_cd"));
				//インボイス明細.基準単位数量の算出：				
				MAVM_ITM_UNIT_R itmUnitR = MAVM_ITM_UNIT_R.create("T");
				itmUnitR.itm_cd(ivDR.itm_cd());
				itmUnitR.itm_sub1(ivDR.itm_sub1());
				itmUnitR.itm_sub2(ivDR.itm_sub2());
				itmUnitR.itm_sub3(ivDR.itm_sub3());
				itmUnitR.unit_cd(ivDR.trd_unit_cd());
				dbSelectKey("MSBBL6220_MAVM_ITM_UNIT_S01", itmUnitR,
						MCQueryApiBuilder.create(itmUnitR), itmUnitR);//品目単位マスタの情報を取得する。
				MCNumber baseUnitQty = ivDR.trd_unit_qty().multiply(itmUnitR.conv_qty());
				//与信額＝(インボイス明細.取引通貨金額　＋　インボイス明細.取引通貨税額）　÷　インボイス明細.基準単位数量　× 基準単位打切数量　×　-1
				credRAmt = (ivDR.trd_cur_amt().add(ivDR.ptax_cur_amt())).multiply(credQty)
						.divide(baseUnitQty, decPlace.intValue(),MAC_RND_TYP.toMC(rndTyp));
				if (itmR.dscnt_itm_flg()) {
					credRAmt = credRAmt.multiply(-1);
				}
				credR.cst_cd(mstSloDR.getString("cst_cd"));//得意先CD
				credR.cur_cd(ivR.trd_cur_cd());//取引通貨ＣＤ.
				credR.trd_ptn_typ(ivR.trd_ptn_typ());//取引パタン区分.
				credR.amt(credRAmt);//与信額
				_credAmtL.add(credR);

			}
			else {
				//※受注ヘッダ.取引通貨に対応する通貨マスタ.金額小数部有効桁数、受注ヘッダ.得意先CDに対応する取引先マスタ.売上金額端数処理区分により端数処理する。
				MCNumber decPlace = getAmtDecPlace(mstSloDR.getString("trd_cur_cd"));
				String rndTyp = getRndTyp(mstSloDR.getString("cst_cd"));
				//上記両方設定されていない場合、
				//与信額＝(受注明細.取引通貨金額　＋　受注明細.取引通貨税額）　÷　受注明細.基準単位数量　× 基準単位打切数量　×　-1
				credRAmt = (mstSloDR.trd_cur_amt().add(mstSloDR.trd_cur_tax_amt()))
						.multiply(credQty).divide(mstSloDR.base_unit_qty(),
								decPlace.intValue(), MAC_RND_TYP.toMC(rndTyp));
				if (itmR.dscnt_itm_flg()) {
					credRAmt = credRAmt.multiply(-1);
				}
				credR.cst_cd(mstSloDR.getString("cst_cd"));//得意先CD
				credR.cur_cd(mstSloDR.getString("trd_cur_cd"));//取引通貨ＣＤ.
				credR.trd_ptn_typ(mstSloDR.getString("trd_ptn_typ"));//取引パタン区分.
				credR.amt(credRAmt);//与信額
				_credAmtL.add(credR);
			}
		}
	}

	/**
	 * Sls_Schd_Upd04オペレーション.<p>
	 *
	 */
	public class Sls_Schd_Upd04 extends MSBBL_SlsSchdService_MC_A.Sls_Schd_Upd04 {
		protected MSBEL_IoSchdService.IoSchd_Del01 opeDel = MSBEL_IoSchdService.crtIoSchd_Del01();

		protected MSBEL_IoSchdService.IoSchd_Ins01 opeIns = MSBEL_IoSchdService.crtIoSchd_Ins01();

		protected MCList<ShipSchd_DtlR> _shipSchdL = MCList.create(ShipSchd_DtlR.class);

		protected MCList<MST_SLS_SCHD_R> _slsSchdUpdL = MCList.create(MST_SLS_SCHD_R.class);
		protected MCList<MST_SLO_D_R> _sloDL = null;
		protected MCIndexKey _idxkeySloD = null;
		protected MCIndexKey _idxkeySloDPurcSchd = null;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			
			editUp();
			
			_credAmtL = MCList.create(Cred_Upd01_CndR.class);
			
			//上り電文取得
			MCList<Sls_Schd_Upd04_DtlR> upd04DtlList = MCList
					.create(Sls_Schd_Upd04_DtlR.class);
			MCList<Sls_Schd_Upd04_DtlR> upd04DtlListDel = MCList
					.create(Sls_Schd_Upd04_DtlR.class);
			for (Sls_Schd_Upd04_DtlR upd04R : up0()) {
				if (MSC_SLS_SCHD_SRC_TYP.isPURC_SCHD(upd04R.sls_schd_src_typ())
						|| MSC_SLS_SCHD_SRC_TYP.isPO_SCHD(upd04R.sls_schd_src_typ())
						|| MSC_SLS_SCHD_SRC_TYP.isPURC_ACT_D(upd04R.sls_schd_src_typ())) {
					if (MAC_DATA_CRUD_TYP.isDEL(upd04R.data_crud_typ())) {
						upd04DtlListDel.add(upd04R);
					}
					else {
						upd04DtlList.add(upd04R);
					}
				}
				else {
					upd04DtlList.add(upd04R);
				}
				// 上り電文.売上予定作成元区分 ＝受注明細の場合（受注登録から実行したケース）
				// 発注済の状態で受注を訂正したケース、出荷予定だけ更新してＷＧ間依頼・発注予定を更新しないケースは
				// 受注登録から売上予定サービスを実行して、出荷予定と売上予定の同期を取る
				if (MSC_SLS_SCHD_SRC_TYP.isSLO_D(upd04R.sls_schd_src_typ())) {
					if (MAC_DATA_CRUD_TYP.isUPD(upd04R.data_crud_typ())) {
						// 受注登録から実行した場合、売上予定の出荷予定NOをクリアする。
						MCList<MST_SLS_SCHD_R> slsSchdL = MCList.create(MST_SLS_SCHD_R.class);
						MST_SLS_SCHD_R t = MST_SLS_SCHD_R.create("T");
						MCQueryApiBuilder slsSchdL_bldr = MCQueryApiBuilder.create(t);
						slsSchdL_bldr.setWhere(t.slo_d_no.eq(bind("1")), upd04R.slo_d_no());
						dbSelectForUpdate("MSBBL6220_MST_SLS_SCHD_S10", slsSchdL, slsSchdL_bldr);
						
						slsSchdL_bldr.setSet(t.ship_schd_no);
						slsSchdL.setStringNE("ship_schd_no", null);
						dbUpdate("MSBBL6220_MST_SLS_SCHD_U05", slsSchdL, slsSchdL_bldr);
					}
				}
			}
			//1.一回目：削除のものを先に処理する。
			//売上予定更新
			updSlsSchd(upd04DtlListDel);
			//出荷予定の更新
			callShipSchdService();
			//受払予定の更新
			updIOSchd();
			//出荷予定の分割
			updAddShipSchd(upd04DtlListDel);
			//出荷予定の更新
			callShipSchdService();
			//２．ニ回目：削除以外のものを処理する
			_shipSchdL = MCList.create(ShipSchd_DtlR.class);
			_slsSchdUpdL = MCList.create(MST_SLS_SCHD_R.class);
			opeDel.up0().clear();
			opeIns.up0().clear();
			//売上予定更新
			updSlsSchd(upd04DtlList);
			//出荷予定の更新
			callShipSchdService();
			//受払予定の更新
			updIOSchd();
			opeDel.up0().clear();
			opeIns.up0().clear();
			//出荷予定の分割
			updAddShipSchd(upd04DtlList);
			//出荷予定の更新
			callShipSchdService();
			updIOSchd();
			//３．与信更新
			updCred();
		}
		
		/**
		 * 上り電文を編集する。
		 */
		protected void editUp() {

			editUpPurcSchd();
			
			editUpPurcAct();
			
			for (Sls_Schd_Upd04_DtlR upR : up0()) {
				
				if (MAC_DATA_CRUD_TYP.isDEL(upR.data_crud_typ()) 
						&& MSC_SLS_SCHD_SRC_TYP.isPURC_ACT_D(upR.sls_schd_src_typ())
						&& !isNull(upR.purc_act_d_no())) {
					// 仕入実績を削除する際に、仕入予定で出荷予定、売上予定を作成するため、仕入実績に紐付く出荷予定を削除する。
					upR.ship_schd_del_flg(true);
				}
			}
		}
		
		/**
		 * 仕入予定の上り電文を補完する。
		 */
		protected void editUpPurcSchd() {

			// 売上予定作成元区分が仕入予定の上り電文を抽出する。
			MCIndexKey purcActIdxkey = up0().createIndex(Sls_Schd_Upd04_DtlR.$sls_schd_src_typ);
			MCList<Sls_Schd_Upd04_DtlR> slsSchdDtlL = up0().subList(purcActIdxkey, MSC_SLS_SCHD_SRC_TYP.PURC_SCHD.value());
			
			if (isNull(slsSchdDtlL) || slsSchdDtlL.isEmpty()){
				return;
			}
			
			MCGroupByPolicy policy = new MCGroupByPolicy(Sls_Schd_Upd04_DtlR.$purc_schd_no);
			MCList<Sls_Schd_Upd04_DtlR> purcSchdGrpL = slsSchdDtlL.groupBy(policy);
			
			MCList<MST_PURC_SCHD_R> purcSchdL = getPurcSchdL(purcSchdGrpL);
			
			MCList<MST_SLS_SCHD_R> nonPurcActSlsSchdL = getNonPurcActSlsSchdL(purcSchdGrpL);
			
			// 仕入予定残数の売上予定削除用の上り電文を作成する
			crtPurcSchdBlSlsSchdDelR(slsSchdDtlL, purcSchdL, nonPurcActSlsSchdL);
		}
		
		/**
		 * 仕入実績の上り電文を補完する。
		 */
		protected void editUpPurcAct() {

			// 売上予定作成元区分が仕入実績明細の上り電文を抽出する。
			MCIndexKey purcActIdxkey = up0().createIndex(Sls_Schd_Upd04_DtlR.$sls_schd_src_typ);
			MCList<Sls_Schd_Upd04_DtlR> purcActL = up0().subList(purcActIdxkey, MSC_SLS_SCHD_SRC_TYP.PURC_ACT_D.value());
			
			if (isNull(purcActL) || purcActL.isEmpty()){
				return;
			}
			
			// 検収不良の仕入実績を打切りと扱う
			for (Sls_Schd_Upd04_DtlR purcR : purcActL) {
				if (purcR.accpt_dfct_flg()) {
					purcR.abort_flg(true);
				}
			}
			
			MCGroupByPolicy policy = new MCGroupByPolicy(Sls_Schd_Upd04_DtlR.$purc_schd_no);
			MCList<Sls_Schd_Upd04_DtlR> purcSchdGrpL = purcActL.groupBy(policy);
			
			MCList<MST_PURC_SCHD_R> purcSchdL = getPurcSchdL(purcSchdGrpL);
			
			MCList<MST_SLO_D_R> sloDL = getSloDL(purcActL.groupBy(Sls_Schd_Upd04_DtlR.$slo_d_no));
			
			MCList<MST_SLS_SCHD_R> abortSlsSchdL = getAbortSlsSchdL(purcSchdGrpL);
			
			MCList<MST_SLS_SCHD_R> nonPurcActSlsSchdL = getNonPurcActSlsSchdL(purcSchdGrpL);
			
			setSlsSchdDt(purcActL, purcSchdL);
			
			// 仕入予定残数の売上予定削除用の上り電文を作成する
			crtPurcSchdBlSlsSchdDelR(purcActL, purcSchdL, nonPurcActSlsSchdL);
			
			// 仕入予定残数の売上予定作成用の上り電文を作成する
			crtPurcSchdBlSlsSchdUpR(purcActL, purcSchdL, sloDL);
			
			// 仕入予定打切数の売上予定作成用の上り電文を作成する
			crtPurcSchdAbortSlsSchdUpR(purcActL, purcSchdL, sloDL, abortSlsSchdL);
		}
		
		/**
		 * 仕入予定を取得する。
		 * @param purcSchdGrpL 出荷予定ＮＯリスト
		 * @return 仕入予定
		 */
		protected MCList<MST_PURC_SCHD_R> getPurcSchdL(MCList<Sls_Schd_Upd04_DtlR> purcSchdGrpL) {
			
			MCList<MST_PURC_SCHD_R> purcSchdL = MCList.create(MST_PURC_SCHD_R.class);
			purcSchdL.addStringColumn(MST_ARR_SCHD_R.$lot_no);
			purcSchdL.addStringColumn(MST_ARR_SCHD_R.$sublot_no);
			MST_PURC_SCHD_R t = MST_PURC_SCHD_R.create("T");
			MST_ARR_SCHD_R arrSchd = MST_ARR_SCHD_R.create("ARRSCHD");
			MCQueryApiBuilder purcSchdL_bldr = MCQueryApiBuilder.create(t);
			
			purcSchdL_bldr.setSelect(t.purc_schd_no);
			purcSchdL_bldr.addSelect(t.purc_schd_dt);
			purcSchdL_bldr.addSelect(t.base_unit_schd_qty);
			purcSchdL_bldr.addSelect(t.base_unit_abort_qty);
			purcSchdL_bldr.addSelect(t.base_unit_purc_qty);
			purcSchdL_bldr.addSelect(t.base_unit_accpt_dfct_qty);
			purcSchdL_bldr.addSelect(t.base_unit_cd);
			purcSchdL_bldr.addSelect(t.trd_unit_cd);
			purcSchdL_bldr.addSelect(arrSchd.lot_no, arrSchd.sublot_no);
			purcSchdL_bldr.addLeftOuterJoin(arrSchd, t.arr_schd_no.eq(arrSchd.arr_schd_no));
			
			dbSelectKey("MSBBL6220_MST_PURC_SCHD_S01", purcSchdL, purcSchdL_bldr, purcSchdGrpL);
			
			return purcSchdL;
		}
		
		/**
		 * 打切りがオンの売上予定を取得する。
		 * @param purcSchdGrpL 出荷予定ＮＯリスト
		 * @return 売上予定
		 */
		protected MCList<MST_SLS_SCHD_R> getAbortSlsSchdL(MCList<Sls_Schd_Upd04_DtlR> purcSchdGrpL) {

			MCList<MST_SLS_SCHD_R> slsSchdL = MCList.create(MST_SLS_SCHD_R.class);
			MST_SLS_SCHD_R t = MST_SLS_SCHD_R.create("T");
			MCQueryApiBuilder slsSchdL_bldr = MCQueryApiBuilder.create(t);
			slsSchdL_bldr.addConstWhereWithAnd(t.abort_flg.eq(value(true)));
			slsSchdL_bldr.addConstWhereWithAnd(t.purc_act_d_no.isNull());
			dbSelectColumn("MSBBL6220_MST_SLS_SCHD_S11", slsSchdL, slsSchdL_bldr,
					MST_SLS_SCHD_R.$purc_schd_no, purcSchdGrpL, MST_SLS_SCHD_R.$purc_schd_no);

			return slsSchdL;
		}
		
		/**
		 *　未仕入の売上予定を取得する。
		 * @param purcSchdGrpL 出荷予定ＮＯリスト
		 * @return 売上予定
		 */
		protected MCList<MST_SLS_SCHD_R> getNonPurcActSlsSchdL(MCList<Sls_Schd_Upd04_DtlR> purcSchdGrpL) {

			MCList<MST_SLS_SCHD_R> slsSchdL = MCList.create(MST_SLS_SCHD_R.class);
			MST_SLS_SCHD_R t = MST_SLS_SCHD_R.create("T");
			MCQueryApiBuilder slsSchdL_bldr = MCQueryApiBuilder.create(t);
			slsSchdL_bldr.addConstWhereWithAnd(t.purc_act_d_no.isNull());
			dbSelectColumn("MSBBL6220_MST_SLS_SCHD_S12", slsSchdL, slsSchdL_bldr,
					MST_SLS_SCHD_R.$purc_schd_no, purcSchdGrpL, MST_SLS_SCHD_R.$purc_schd_no);
			
			return slsSchdL;
		}
		
		/**
		 * 売上予定日を設定する。
		 * @param purcActL 仕入実績の上り電文
		 * @param purcSchdL 仕入予定リスト
		 */
		protected void setSlsSchdDt(MCList<Sls_Schd_Upd04_DtlR> purcActL, MCList<MST_PURC_SCHD_R> purcSchdL) {

			MCIndexKey purcSchdIdxkey = purcActL.createIndex(Sls_Schd_Upd04_DtlR.$purc_schd_no);
			
			for (MST_PURC_SCHD_R purcSchdR : purcSchdL) {
					
				MCList<Sls_Schd_Upd04_DtlR> subPurcActL = purcActL.subList(purcSchdIdxkey, purcSchdR.purc_schd_no());
				
				if (!subPurcActL.isEmpty()) {
					subPurcActL.setValueNE(Sls_Schd_Upd04_DtlR.$sls_schd_dt, purcSchdR.purc_schd_dt());
				}
			}
		}
		
		/**
		 * 仕入予定残数の売上予定削除用の上り電文を作成する。
		 * @param dtlL 上り電文
		 * @param purcSchdL 仕入予定リスト
		 * @param sloDL 受注明細リスト
		 */
		protected void crtPurcSchdBlSlsSchdDelR(MCList<Sls_Schd_Upd04_DtlR> dtlL,
				MCList<MST_PURC_SCHD_R> purcSchdL,
				MCList<MST_SLS_SCHD_R> nonPurcActSlsSchdL) {
			
			MCIndexKey purcSchdIdxkey = dtlL.createIndex(Sls_Schd_Upd04_DtlR.$purc_schd_no, Sls_Schd_Upd04_DtlR.$data_crud_typ);
			
			MCIndexKey slsSchdIdxKey = nonPurcActSlsSchdL.createIndex(Sls_Schd_Upd04_DtlR.$purc_schd_no);
			
			MCNumber baseSchdQty = null;
			Sls_Schd_Upd04_DtlR addUpR = null;
			
			for (MST_PURC_SCHD_R purcSchdR : purcSchdL) {
				// 仕入残数　= 基準単位予定数量 - 基準単位打切数量 - 基準単位仕入数量 - 基準単位検収不良数量
				baseSchdQty = purcSchdR.base_unit_schd_qty().subtract(
						sum(purcSchdR.base_unit_abort_qty(), purcSchdR.base_unit_purc_qty(), purcSchdR.base_unit_accpt_dfct_qty()));
				
				if (baseSchdQty.isPositive()) {
					continue;
				}
				
				if (dtlL.contains(purcSchdIdxkey, purcSchdR.purc_schd_no(), MAC_DATA_CRUD_TYP.CRT.value())) {
					continue;
				}
				
				for (MST_SLS_SCHD_R subShcdR : nonPurcActSlsSchdL.subList(slsSchdIdxKey, purcSchdR.purc_schd_no())) {
					
					if (purcSchdR.base_unit_abort_qty().isPositive() || subShcdR.abort_flg()) {
						// 仕入予定に存在打切りが存在する場合、削除せず、打切りにして完了にする。
						continue;
					}
					addUpR = Sls_Schd_Upd04_DtlR.create();
					
					if (MSC_SLS_SCHD_SRC_TYP.isPURC_SCHD(dtlL.get(0).sls_schd_src_typ())) {
						crtPurcSchdSlsSchdUpDelR(addUpR, subShcdR);
					}
					else if (MSC_SLS_SCHD_SRC_TYP.isPURC_ACT_D(dtlL.get(0).sls_schd_src_typ())) {
						crtPurcActSlsSchdUpDelR(addUpR, subShcdR);
					}
					
					addUpR.ship_schd_del_flg(true);
					up0().add(addUpR);
				}
			}
		}
		
		/**
		 * 仕入予定残数の売上予定作成用の上り電文を作成する。
		 * @param purcActL 仕入実績の上り電文
		 * @param purcSchdL 仕入予定リスト
		 * @param sloDL 受注明細リスト
		 */
		protected void crtPurcSchdBlSlsSchdUpR(MCList<Sls_Schd_Upd04_DtlR> purcActL,
				MCList<MST_PURC_SCHD_R> purcSchdL, MCList<MST_SLO_D_R> sloDL) {
			
			MCIndexKey purcSchdIdxkey = purcActL.createIndex(Sls_Schd_Upd04_DtlR.$purc_schd_no);
			MCIndexKey sloDIdxkey = sloDL.createIndex(MST_SLO_D_R.$slo_d_no);
			
			MCNumber baseSchdQty = null;
			Sls_Schd_Upd04_DtlR addUpR = null;
			
			for (MST_PURC_SCHD_R purcSchdR : purcSchdL) {
				// 仕入残数　= 基準単位予定数量 - 基準単位打切数量 - 基準単位仕入数量 - 基準単位検収不良数量
				baseSchdQty = purcSchdR.base_unit_schd_qty().subtract(
						sum(purcSchdR.base_unit_abort_qty(), purcSchdR.base_unit_purc_qty(), purcSchdR.base_unit_accpt_dfct_qty()));
				
				if (!baseSchdQty.isPositive()) {
					continue;
				}
					
				Sls_Schd_Upd04_DtlR dtlR = purcActL.getFirst(purcSchdIdxkey, purcSchdR.purc_schd_no());

				if (isNull(dtlR) || dtlR.isEmpty()) {
					continue;
				}
				
				MST_SLO_D_R sloDR = sloDL.getFirst(sloDIdxkey, dtlR.slo_d_no());
				
				if (isNull(sloDR) || sloDR.isEmpty()) {
					continue;
				}
				
				addUpR = dtlR.clone();
				crtPurcActSlsSchdUpRCommon(addUpR, dtlR, purcSchdR, sloDR, baseSchdQty, false);
				addUpR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				addUpR.purc_act_d_no(null);
				addUpR.lot_no(purcSchdR.getStringNE(MST_ARR_SCHD_R.$lot_no));
				addUpR.sublot_no(purcSchdR.getStringNE(MST_ARR_SCHD_R.$sublot_no));
				
				up0().add(addUpR);
			}
		}
		
		/**
		 * 仕入予定打切数の売上予定作成用の上り電文を作成する
		 * @param purcActL 仕入実績の上り電文
		 * @param purcSchdL 仕入予定リスト
		 * @param sloDL 受注明細リスト
		 * @param slsSchdL　打切売上予定
		 */
		protected void crtPurcSchdAbortSlsSchdUpR(MCList<Sls_Schd_Upd04_DtlR> purcActL,
				MCList<MST_PURC_SCHD_R> purcSchdL, MCList<MST_SLO_D_R> sloDL,
				MCList<MST_SLS_SCHD_R> slsSchdL) {
			
			MCIndexKey slsSchdIdxKey = slsSchdL.createIndex(MST_SLS_SCHD_R.$purc_schd_no);
			MCIndexKey purcSchdIdxkey = purcActL.createIndex(Sls_Schd_Upd04_DtlR.$purc_schd_no);
			MCIndexKey sloDIdxkey = sloDL.createIndex(MST_SLO_D_R.$slo_d_no);
			
			Sls_Schd_Upd04_DtlR addUpR = null;
			
			for (MST_PURC_SCHD_R purcSchdR : purcSchdL) {
				
				MCList<MST_SLS_SCHD_R> subShcdL = slsSchdL.subList(slsSchdIdxKey, purcSchdR.purc_schd_no());
				
				if (!purcSchdR.base_unit_abort_qty().isPositive() && (isNull(subShcdL) || subShcdL.isEmpty())) {
					continue;
				}
				
				Sls_Schd_Upd04_DtlR dtlR = purcActL.getFirst(purcSchdIdxkey, purcSchdR.purc_schd_no());

				if (isNull(dtlR) || dtlR.isEmpty()) {
					continue;
				}
				
				MST_SLO_D_R sloDR = sloDL.getFirst(sloDIdxkey, dtlR.slo_d_no());
				
				if (isNull(sloDR) || sloDR.isEmpty()) {
					continue;
				}
				
				// 仕入予定に打切が存在する　かつ 売上予定に打切りが存在しない場合
				if (purcSchdR.base_unit_abort_qty().isPositive() && (isNull(subShcdL) || subShcdL.isEmpty())) {
					
					addUpR = dtlR.clone();
					crtPurcActSlsSchdUpRCommon(addUpR, dtlR, purcSchdR, sloDR, purcSchdR.base_unit_abort_qty(), true);
					addUpR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					addUpR.purc_act_d_no(null);
					up0().add(addUpR);
				}
				// 仕入予定に打切が存在する　かつ 売上予定に打切りが存在する場合
				else if (purcSchdR.base_unit_abort_qty().isPositive() && !(isNull(subShcdL) || subShcdL.isEmpty())) {
					
					for (int i = 0; i < subShcdL.size(); i++) {
						MST_SLS_SCHD_R subShcdR = subShcdL.get(i);
						
						if (i == 0) {
							addUpR = dtlR.clone();
							crtPurcActSlsSchdUpRCommon(addUpR, dtlR, purcSchdR, sloDR, purcSchdR.base_unit_abort_qty(), true);
							addUpR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
							addUpR.purc_act_d_no(null);
							addUpR.sls_schd_no(subShcdR.sls_schd_no());
							
							up0().add(addUpR);
						}
						else {
							addUpR = Sls_Schd_Upd04_DtlR.create();
							crtPurcActSlsSchdUpDelR(addUpR, subShcdR);
							up0().add(addUpR);
						}
					}
				}
				// 仕入予定に打切が存在しない　かつ 売上予定に打切りが存在する場合
				else if (!purcSchdR.base_unit_abort_qty().isPositive() && !(isNull(subShcdL) || subShcdL.isEmpty())) {
					
					for (MST_SLS_SCHD_R subShcdR : subShcdL) {
						addUpR = Sls_Schd_Upd04_DtlR.create();
						crtPurcActSlsSchdUpDelR(addUpR, subShcdR);
						addUpR.ship_schd_del_flg(true);
						up0().add(addUpR);
					}
				}
			}
		}
		
		/**
		 * 仕入実績の上り電文を作成する。
		 * @param addUpR　追加する上り電文
		 * @param dtlR 作成元上り電文
		 * @param purcSchdR 仕入予定
		 * @param sloDR 受注明細
		 * @param baseSchdQty 基準単位数量
		 * @param abortFlg 打切ＦＬＧ
		 */
		protected void crtPurcActSlsSchdUpRCommon(Sls_Schd_Upd04_DtlR addUpR, 
				Sls_Schd_Upd04_DtlR dtlR, MST_PURC_SCHD_R purcSchdR, MST_SLO_D_R sloDR, MCNumber baseSchdQty, boolean abortFlg) {
			
			MCNumber trdSchdQty = null;
			
			addUpR.sls_schd_dt(purcSchdR.purc_schd_dt());
			addUpR.lot_no(dtlR.lot_no());
			addUpR.sublot_no(dtlR.sublot_no());
			addUpR.abort_flg(abortFlg);
			addUpR.base_unit_cd(purcSchdR.base_unit_cd());
			addUpR.base_unit_qty(baseSchdQty);
			
			trdSchdQty = cnvBaseToTrdUnitQty2(sloDR.itm_cd(), sloDR.itm_sub1(),
					sloDR.itm_sub2(), sloDR.itm_sub3(), baseSchdQty, purcSchdR.trd_unit_cd());
			MCNumber baseUnitQty = cnvTrdToBaseUnitQty(sloDR.itm_cd(), sloDR.itm_sub1(),
					sloDR.itm_sub2(), sloDR.itm_sub3(), trdSchdQty, purcSchdR.trd_unit_cd());
			if (!isSame(baseSchdQty, baseUnitQty)) {
				addUpR.trd_unit_cd(purcSchdR.base_unit_cd());
				addUpR.trd_unit_qty(baseSchdQty);
			}
			else {
				addUpR.trd_unit_cd(purcSchdR.trd_unit_cd());
				addUpR.trd_unit_qty(trdSchdQty);
			}
		}
		
		/**
		 * 仕入実績の削除上り電文を作成する。
		 * @param addUpR 追加する上り電文
		 * @param slsSchdR 売上予定
		 */
		protected void crtPurcActSlsSchdUpDelR(Sls_Schd_Upd04_DtlR addUpR, MST_SLS_SCHD_R slsSchdR) {
			
			addUpR.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.PURC_ACT_D.value());
			crtSlsSchdUpDelR(addUpR, slsSchdR);
		}
		
		/**
		 * 仕入予定の削除上り電文を作成する。
		 * @param addUpR 追加する上り電文
		 * @param slsSchdR 売上予定
		 */
		protected void crtPurcSchdSlsSchdUpDelR(Sls_Schd_Upd04_DtlR addUpR, MST_SLS_SCHD_R slsSchdR) {
			
			addUpR.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.PURC_SCHD.value());
			crtSlsSchdUpDelR(addUpR, slsSchdR);
		}
		
		/**
		 * 売上予定の削除上り電文を作成する。
		 * @param addUpR 追加する上り電文
		 * @param slsSchdR 売上予定
		 */
		protected void crtSlsSchdUpDelR(Sls_Schd_Upd04_DtlR addUpR, MST_SLS_SCHD_R slsSchdR) {
			
			addUpR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			addUpR.slo_d_no(slsSchdR.slo_d_no());
			addUpR.purc_schd_no(slsSchdR.purc_schd_no());
			addUpR.sls_schd_no(slsSchdR.sls_schd_no());
			addUpR.po_schd_no(slsSchdR.po_schd_no());
		}

		/**
		 * 受注明細NOを元に、出荷予定NOを取得する。
		 * @param slo_d_no
		 * @return
		 */
		protected String getShipSchdNo(String slo_d_no) {
			MCList<MST_SHIP_SCHD_R> shipSchdL = MCList.create(MST_SHIP_SCHD_R.class);
			MST_SHIP_SCHD_R t = MST_SHIP_SCHD_R.create("T");
			MCQueryApiBuilder shipSchdL_bldr = MCQueryApiBuilder.create(t);
			MST_SHIP_PR_R t1 = MST_SHIP_PR_R.create("T1");
			shipSchdL_bldr.setSelect(t.ship_schd_no);
			shipSchdL_bldr.addInnerJoin(t1, bracket( t.ship_pr_no.eq(t1.ship_pr_no)));
			shipSchdL_bldr.setWhere(t1.slo_d_no.eq(bind("1")), slo_d_no);
			int iRows = 0;
			iRows = dbSelect("MSBBL6220_MST_SHIP_SCHD_S03", shipSchdL, shipSchdL_bldr);
			if (iRows > 1 || iRows == 0) {
				return null;
			}
			else {
				return shipSchdL.get(0).ship_schd_no();
			}

		}

		/**
		 * 売上予定更新
		 */
		protected void updSlsSchd(MCList<Sls_Schd_Upd04_DtlR> upd04DtlList) {
			//出荷予定ＮＯを補完する。
			for (Sls_Schd_Upd04_DtlR upd04DtlRow : upd04DtlList) {
				if (MSC_SLS_SCHD_SRC_TYP.isWG_RQST(upd04DtlRow.sls_schd_src_typ())) {
					//出荷予定ＮＯの取得：受注明細NOを元に出荷進捗と出荷予定を結合して、出荷予定の出荷予定NOを取得する。
					upd04DtlRow.ship_schd_no(getShipSchdNo(upd04DtlRow.slo_d_no()));
				}
				//上り電文.売上予定作成元区分　＝　発注予定の場合
				if (MSC_SLS_SCHD_SRC_TYP.isPO_SCHD(upd04DtlRow.sls_schd_src_typ())) {
					//上り電文.データ更新区分　＝　新規
					if (MAC_DATA_CRUD_TYP.isCRT(upd04DtlRow.data_crud_typ())) {
						//出荷予定ＮＯの取得：受注明細NOを元に出荷進捗と出荷予定を結合して、出荷予定の出荷予定NOを取得する。
						upd04DtlRow.ship_schd_no(getShipSchdNo(upd04DtlRow.slo_d_no()));
					}
				}
			}
			MCSortPolicy spcy = new MCSortPolicy();
			spcy.add(SortType.ASC, Sls_Schd_Upd04_DtlR.$sls_schd_src_typ);
			spcy.add(SortType.DESC, Sls_Schd_Upd04_DtlR.$data_crud_typ);
			spcy.add(SortType.ASC, Sls_Schd_Upd04_DtlR.$ship_schd_no);
			upd04DtlList.sort(spcy);

			String ShipSchdNo = "";
			// キャッシュ作成
			_sloDL = MCList.create(MST_SLO_D_R.class);
			createCache(upd04DtlList, _sloDL);
			_idxkeySloD = _sloDL.createIndex(MST_SLO_D_R.$slo_d_no);
			_idxkeySloDPurcSchd = _sloDL.createIndex(MST_SLO_D_R.$slo_d_no, "purc_schd_no");
			
			int iCnt = 0;
			
			doSeqCache(MSC_NUM_SYS_TYP.SLSSCHD, upd04DtlList.subList(Sls_Schd_Upd04_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value()).size());
			
			//上り電文に対し、繰り返し処理
			for (Sls_Schd_Upd04_DtlR upd04DtlRow : upd04DtlList) {
				if (MSC_SLS_SCHD_SRC_TYP.isSLO_D(upd04DtlRow.sls_schd_src_typ())) {
					continue;
				}
				iCnt++;
				//売上予定ロック時に取得したデータを一時変数（ロックした売上予定）に保存する。	
				MST_SLS_SCHD_R lockedSlsSchdR = MST_SLS_SCHD_R.create("T");
				MCQueryApiBuilder lockedSlsSchdR_bldr = MCQueryApiBuilder.create(lockedSlsSchdR);
				//受注明細データの変数
				MST_SLO_D_R mstSloDR = _sloDL.getFirst(_idxkeySloD, upd04DtlRow.slo_d_no(), null);
				upd04DtlRow.sls_schd_dt(getSlsSchdDt(upd04DtlRow.slo_d_no(), getPurcSchdNo(upd04DtlRow)));
				//品目データ
				MAM_ITM_R itmR = _cacheItm.get(mstSloDR.itm_cd(), mstSloDR.itm_sub1(), mstSloDR.itm_sub2(), mstSloDR.itm_sub3());

				//売上予定新規行
				MST_SLS_SCHD_R newSlsSchdR = MST_SLS_SCHD_R.create("T");
				MCQueryApiBuilder newSlsSchdR_bldr = MCQueryApiBuilder.create(newSlsSchdR);
				//与信更新のため、一時変数（与信更新対象基準単位数量）を定義する。
				MCNumber credQty = MCNumber.ZERO;

				//上り電文.売上予定作成元区分　＝　WG間依頼の場合
				if (MSC_SLS_SCHD_SRC_TYP.isWG_RQST(upd04DtlRow.sls_schd_src_typ())) {
					//上り電文.データ更新区分　＝　新規
					if (MAC_DATA_CRUD_TYP.isCRT(upd04DtlRow.data_crud_typ())) {
						//上り電文の情報を元に、売上予定の項目値を編集する。
						copy(newSlsSchdR, upd04DtlRow,
								createMap_MST_SLS_SCHD_R_Sls_Schd_Upd04_DtlR());
						dbInsert("MSBBL6220_MST_SLS_SCHD_I04", newSlsSchdR, newSlsSchdR_bldr);
						if (!isNull(newSlsSchdR.ship_schd_no())) {
							updShipSchd(newSlsSchdR, iCnt);
						}
						//受払予定の上り電文の作成
						if (MAC_STK_MNG_TYP.isMNG(itmR.stk_mng_typ())) {
							updIOSchd(newSlsSchdR, mstSloDR);
						}
					}
					//上り電文.データ更新区分　＝　更新
					if (MAC_DATA_CRUD_TYP.isUPD(upd04DtlRow.data_crud_typ())) {
						lockedSlsSchdR_bldr.setWhere(lockedSlsSchdR.wg_rqst_no.eq(bind("1")), upd04DtlRow.wg_rqst_no());
						dbSelectForUpdate("MSBBL6220_MST_SLS_SCHD_S13", lockedSlsSchdR, lockedSlsSchdR_bldr);
						//上り電文.データ更新区分＝更新、且つ上り電文.打切ＦＬＧ＝オンのレコードに対し、下記の処理を行う。	
						if (upd04DtlRow.abort_flg()) {
							//・一時変数（与信更新対象基準単位数量）　＝　一時変数（与信更新対象基準単位数量）　＋　基準単位打切数量　×　-1	
							credQty = credQty.add(mstSloDR.base_unit_qty().multiply(-1));
						}
						//ロックした売上予定の打切ＦＬＧ＝オン、且つ上り電文.打切ＦＬＧ＝オフのレコードに対し、下記の処理を行う。	
						if (lockedSlsSchdR.abort_flg() && !upd04DtlRow.abort_flg()) {
							//・一時変数（与信更新対象基準単位数量）　＝　一時変数（与信更新対象基準単位数量）　＋　基準単位打切取消数量	
							credQty = credQty.add(mstSloDR.base_unit_qty());
						}
						editSlsSchd(lockedSlsSchdR, upd04DtlRow);
						dbUpdateKey("MSBBL6220_MST_SLS_SCHD_U06", lockedSlsSchdR, lockedSlsSchdR_bldr);
						if (!isNull(lockedSlsSchdR.ship_schd_no())) {
							updShipSchd(lockedSlsSchdR, iCnt);
						}
						//受払予定の削除上り電文の作成
						if (hasIoSchd(lockedSlsSchdR)) {
							delIOSchd(lockedSlsSchdR);
						}
						//受払予定の新規上り電文の作成
						if (MAC_STK_MNG_TYP.isMNG(itmR.stk_mng_typ())) {
							updIOSchd(lockedSlsSchdR, mstSloDR);
						}
					}
					//上り電文.データ更新区分　＝　削除
					if (MAC_DATA_CRUD_TYP.isDEL(upd04DtlRow.data_crud_typ())) {
						lockedSlsSchdR_bldr.setWhere(lockedSlsSchdR.wg_rqst_no.eq(bind("1")), upd04DtlRow.wg_rqst_no());
						dbSelectForUpdate("MSBBL6220_MST_SLS_SCHD_S14", lockedSlsSchdR, lockedSlsSchdR_bldr);
						dbDeleteKey("MSBBL6220_MST_SLS_SCHD_D05", lockedSlsSchdR, lockedSlsSchdR_bldr);
						//受払予定の上り電文の作成
						if (MAC_STK_MNG_TYP.isMNG(itmR.stk_mng_typ())) {
							delIOSchd(lockedSlsSchdR);
						}
					}
				}
				//上り電文.売上予定作成元区分　＝　発注予定の場合
				if (MSC_SLS_SCHD_SRC_TYP.isPO_SCHD(upd04DtlRow.sls_schd_src_typ())) {
					//上り電文.データ更新区分　＝　新規
					if (MAC_DATA_CRUD_TYP.isCRT(upd04DtlRow.data_crud_typ())) {
						//	上り電文のWG間依頼ＮＯをもとに、下記の条件で売上予定データを検索、ロックする。	
						if (!isNull(upd04DtlRow.wg_rqst_no())) {
							//売上予定.WG間依頼ＮＯ　＝　上り電文.WG間依頼ＮＯ　AND　発注予定NO　IS　NULL	
							lockedSlsSchdR_bldr.setWhere(lockedSlsSchdR.wg_rqst_no.eq(bind("1")), upd04DtlRow.wg_rqst_no());
							lockedSlsSchdR_bldr.addWhereWithAnd(lockedSlsSchdR.po_schd_no.isNull());
							int iCont = dbSelectForUpdate("MSBBL6220_MST_SLS_SCHD_S15", lockedSlsSchdR, lockedSlsSchdR_bldr);
							//上記検索、ロックしたレコードがある場合、
							if (iCont > 0) {
								//上り電文.与信更新無ＦＬＧ　＝　オフであれば、与信の更新が必要。
								if (!upd04DtlRow.cred_no_up_flg()) {
									//一時変数（与信更新対象基準単位数量）　＝　一時変数（与信更新対象基準単位数量）　＋　ロックした売上予定.基準単位数量 ×　-1	
									credQty = credQty.add(
											lockedSlsSchdR.base_unit_qty().multiply(-1));
								}
								//ロックしたレコードをDELETEする。	
								dbDeleteKey("MSBBL6220_MST_SLS_SCHD_D06", lockedSlsSchdR, lockedSlsSchdR_bldr);
								//受払予定の上り電文の作成
								if (MAC_STK_MNG_TYP.isMNG(itmR.stk_mng_typ())) {
									delIOSchd(lockedSlsSchdR);
								}
							}
						}

						//上り電文の情報を元に、売上予定の項目値を編集する。
						copy(newSlsSchdR, upd04DtlRow,
								createMap_MST_SLS_SCHD_R_Sls_Schd_Upd04_DtlR());
						//売上予定作成元区分
						newSlsSchdR
								.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.PO_SCHD.value());
						if (!isSame(ShipSchdNo, upd04DtlRow.ship_schd_no())) {
							newSlsSchdR.ship_schd_no(upd04DtlRow.ship_schd_no());
						}
						else {
							newSlsSchdR.ship_schd_no(null);
						}
						//発注予定NO
						newSlsSchdR.po_schd_no(upd04DtlRow.po_schd_no());
						//編集後のレコードを売上予定に新規登録する。
						dbInsert("MSBBL6220_MST_SLS_SCHD_I05", newSlsSchdR, newSlsSchdR_bldr);
						if (!upd04DtlRow.cred_no_up_flg()) {
							//一時変数（与信更新対象基準単位数量）　＝　一時変数（与信更新対象基準単位数量）　＋　上り電文.基準単位数量
							credQty = credQty.add(upd04DtlRow.base_unit_qty());
						}
						//売上予定.出荷予定ＮＯに対応する出荷予定テーブルを更新する。
						if (!isNull(newSlsSchdR.ship_schd_no())) {
							updShipSchd(newSlsSchdR, iCnt);
						}
						//受払予定の上り電文の作成
						if (MAC_STK_MNG_TYP.isMNG(itmR.stk_mng_typ())) {
							updIOSchd(newSlsSchdR, mstSloDR);
						}
						ShipSchdNo = upd04DtlRow.ship_schd_no();
					}
					//上り電文.データ更新区分　＝　更新
					if (MAC_DATA_CRUD_TYP.isUPD(upd04DtlRow.data_crud_typ())) {
						//上り電文の発注予定ＮＯをもとに、売上予定データを検索、ロックする
						lockedSlsSchdR_bldr.setWhere(lockedSlsSchdR.po_schd_no.eq(bind("1")),
								upd04DtlRow.po_schd_no());
						dbSelectForUpdate("MSBBL6220_MST_SLS_SCHD_S16", lockedSlsSchdR, lockedSlsSchdR_bldr);
						//上り電文.データ更新区分＝更新、且つ上り電文.打切ＦＬＧ＝オンのレコードに対し、下記の処理を行う。
						if (upd04DtlRow.abort_flg()) {
							//一時変数（与信更新対象基準単位数量）　＝　一時変数（与信更新対象基準単位数量）　＋　基準単位打切数量　×　-1	
							credQty = credQty
									.add(upd04DtlRow.base_unit_qty().multiply(-1));
						}
						//ロックした売上予定の打切ＦＬＧ＝オン、且つ上り電文.打切ＦＬＧ＝オフのレコードに対し、下記の処理を行う。	
						else if (lockedSlsSchdR.abort_flg() && !upd04DtlRow.abort_flg()) {
							//一時変数（与信更新対象基準単位数量）　＝　一時変数（与信更新対象基準単位数量）　＋　基準単位打切取消数量	
							credQty = credQty.add(upd04DtlRow.base_unit_qty());
						}
						//上り電文.与信更新無ＦＬＧ　＝　オフであれば、打切、打切取消以外の場合も与信の更新が必要。
						else if (!upd04DtlRow.cred_no_up_flg()) {
							//・一時変数（与信更新対象基準単位数量）　＝　一時変数（与信更新対象基準単位数量）　＋　ロックした売上予定.基準単位数量 ×　-1
							credQty = credQty
									.add(lockedSlsSchdR.base_unit_qty().multiply(-1));
							//・一時変数（与信更新対象基準単位数量）　＝　一時変数（与信更新対象基準単位数量）　＋　上り電文.基準単位数量
							credQty = credQty.add(upd04DtlRow.base_unit_qty());
						}
						//上り電文の情報を元に、ロック時に取得された売上予定に対し、項目値を編集する。
						editSlsSchdByPoSchd(lockedSlsSchdR, upd04DtlRow);
						lockedSlsSchdR.ship_schd_no(null);
						//編集後のレコードを売上予定に更新する。
						lockedSlsSchdR_bldr.setSet(lockedSlsSchdR.sls_schd_src_typ);
						lockedSlsSchdR_bldr.addSet(lockedSlsSchdR.slo_d_no);
						lockedSlsSchdR_bldr.addSet(lockedSlsSchdR.wg_rqst_no);
						lockedSlsSchdR_bldr.addSet(lockedSlsSchdR.po_schd_no);
						lockedSlsSchdR_bldr.addSet(lockedSlsSchdR.ship_schd_no);
						lockedSlsSchdR_bldr.addSet(lockedSlsSchdR.sls_schd_dt);
						lockedSlsSchdR_bldr.addSet(lockedSlsSchdR.trd_unit_cd);
						lockedSlsSchdR_bldr.addSet(lockedSlsSchdR.trd_unit_qty);
						lockedSlsSchdR_bldr.addSet(lockedSlsSchdR.base_unit_cd);
						lockedSlsSchdR_bldr.addSet(lockedSlsSchdR.base_unit_qty);
						lockedSlsSchdR_bldr.addSet(lockedSlsSchdR.lot_no);
						lockedSlsSchdR_bldr.addSet(lockedSlsSchdR.sublot_no);
						lockedSlsSchdR_bldr.addSet(lockedSlsSchdR.cmpl_flg);
						lockedSlsSchdR_bldr.addSet(lockedSlsSchdR.abort_flg);
						lockedSlsSchdR_bldr.addSet(lockedSlsSchdR.sls_ac_abl_flg);
						lockedSlsSchdR_bldr.addSet(lockedSlsSchdR.base_unit_abort_qty);
						dbUpdateKey("MSBBL6220_MST_SLS_SCHD_U07", lockedSlsSchdR, lockedSlsSchdR_bldr);
						//売上予定.出荷予定ＮＯに対応する出荷予定テーブルを更新する。	
						//受払予定の上り電文の作成
						if (MAC_STK_MNG_TYP.isMNG(itmR.stk_mng_typ())) {
							//打切の場合は受払予定は削除、それ以外は削除、新規
							if (upd04DtlRow.abort_flg()) {
								delIOSchd(lockedSlsSchdR);
							}
							else {
								delIOSchd(lockedSlsSchdR);
								updIOSchd(lockedSlsSchdR, mstSloDR);
							}
						}
					}
					//上り電文.データ更新区分　＝　削除
					if (MAC_DATA_CRUD_TYP.isDEL(upd04DtlRow.data_crud_typ())) {
						//上り電文の発注予定ＮＯをもとに、売上予定データを検索、ロックする
						lockedSlsSchdR_bldr.setWhere(lockedSlsSchdR.po_schd_no.eq(bind("1")),
								upd04DtlRow.po_schd_no());
						dbSelectForUpdate("MSBBL6220_MST_SLS_SCHD_S17", lockedSlsSchdR, lockedSlsSchdR_bldr);
						//上り電文.与信更新無ＦＬＧ　＝　オフであれば与信の更新が必要。
						if (!upd04DtlRow.cred_no_up_flg()) {
							//一時変数（与信更新対象基準単位数量）　＝　一時変数（与信更新対象基準単位数量）　＋　ロックした売上予定.基準単位数量 ×　-1
							credQty = credQty
									.add(lockedSlsSchdR.base_unit_qty().multiply(-1));
						}
						//ロックしたレコードをDELETEする
						dbDeleteKey("MSBBL6220_MST_SLS_SCHD_D07", lockedSlsSchdR, lockedSlsSchdR_bldr);
						//受払予定の上り電文の作成
						if (MAC_STK_MNG_TYP.isMNG(itmR.stk_mng_typ())) {
							delIOSchd(lockedSlsSchdR);
						}
						//WG間依頼ＮＯに対応する、発注予定の売上予定がなくなったかを確認する。

						if (!isNull(lockedSlsSchdR.wg_rqst_no())) {
							MCList<MST_SLS_SCHD_R> sls_schdList = MCList.create(MST_SLS_SCHD_R.class);
							MST_SLS_SCHD_R sls_schdList_t = MST_SLS_SCHD_R.create("T");
							MCQueryApiBuilder sls_schdList_bldr = MCQueryApiBuilder.create(sls_schdList_t);
							//	検索条件：売上予定.WG間依頼NO　＝　上り電文.WG間依頼NO　AND 売上予定.発注予定NO　IS NOT NULL
							sls_schdList_bldr.setWhere(sls_schdList_t.wg_rqst_no.eq(bind("1"))
									.and(sls_schdList_t.po_schd_no.isNotNull()), lockedSlsSchdR.wg_rqst_no());
							int icnt = dbSelect("MSBBL6220_MST_SLS_SCHD_S18", sls_schdList, sls_schdList_bldr);
							//上記の検索条件で検索結果は0件の場合、WG間依頼ＮＯに対応する、発注予定の売上予定がなくなると見做す、
							if (icnt > 0) {
								//ロックした売上予定.出荷予定NOを削除のキーで出荷予定テーブルからレコードを削除する。
								delShipSchd(lockedSlsSchdR, iCnt);
							}
							else {
								MCList<MST_SHIP_SCHD_R> shipSchdL = MCList.create(MST_SHIP_SCHD_R.class);
								MST_SHIP_SCHD_R shipSchdL_t = MST_SHIP_SCHD_R.create("T");
								MCQueryApiBuilder shipSchdL_bldr = MCQueryApiBuilder.create(shipSchdL_t);
								MST_SHIP_PR_R shipSchdL_t1 = MST_SHIP_PR_R.create("T1");
								shipSchdL_bldr.addInnerJoin(shipSchdL_t1, bracket( shipSchdL_t.ship_pr_no.eq(shipSchdL_t1.ship_pr_no)));
								shipSchdL_bldr.setWhere(shipSchdL_t1.slo_d_no.eq(bind("1")), upd04DtlRow.slo_d_no());
								int iCntShcd = dbSelect("MSBBL6220_MST_SHIP_SCHD_S04", shipSchdL, shipSchdL_bldr);
								//受注登録にて受注明細削除の場合、出荷予定Tには0件、この場合、WG間依頼を元に再作成しない。
								if (iCntShcd > 0) {
									MST_WG_RQST_R wgRqstR = MST_WG_RQST_R.create("T");
									dbSelectKey("MSBBL6220_MST_WG_RQST_S01", wgRqstR,
											MCQueryApiBuilder.create(wgRqstR), lockedSlsSchdR.wg_rqst_no());
									MST_SLS_SCHD_R slsSchdR = crtSlsSchdByWgReqt(wgRqstR);
									
									//上り電文.与信更新無ＦＬＧ　＝　オフであれば与信の更新が必要。
									if (!upd04DtlRow.cred_no_up_flg()) {
										//・一時変数（与信更新対象基準単位数量）　＝　一時変数（与信更新対象基準単位数量）　＋　上記検索したＷＧ間依頼情報.基準単位数量 
										credQty = credQty.add(slsSchdR.base_unit_qty());
									}
									//売上予定.出荷予定ＮＯに対応する出荷予定テーブルを更新する。
									updShipSchd(slsSchdR, iCnt);
									//受払予定の上り電文の作成
									if (MAC_STK_MNG_TYP.isMNG(itmR.stk_mng_typ())) {
										updIOSchd(slsSchdR, mstSloDR, wgRqstR);
									}
								}
							}
						}
					}
				}
				//上り電文.売上予定作成元区分　＝　仕入予定の場合
				if (MSC_SLS_SCHD_SRC_TYP.isPURC_SCHD(upd04DtlRow.sls_schd_src_typ())) {
					//上り電文.データ更新区分　＝　新規
					if (MAC_DATA_CRUD_TYP.isCRT(upd04DtlRow.data_crud_typ())) {
						int icnt = 0;
						//上り電文の発注予定ＮＯが設定された場合、上り電文の発注予定ＮＯをもとに、下記の条件で売上予定データを検索、ロックする。		
						if (!isNull(upd04DtlRow.po_schd_no())) {
							//売上予定.発注予定ＮＯ　＝　上り電文.発注予定ＮＯ　AND　仕入予定NO　IS　NULL	
							lockedSlsSchdR_bldr.setWhere(lockedSlsSchdR.po_schd_no.eq(bind("1"))
											.and(lockedSlsSchdR.purc_schd_no.isNull()), upd04DtlRow.po_schd_no());
							icnt = dbSelectForUpdate("MSBBL6220_MST_SLS_SCHD_S19", lockedSlsSchdR, lockedSlsSchdR_bldr);
							//上記検索、ロックしたレコードがある場合、与信の更新が必要。	
							if (icnt > 0) {
								//	・一時変数（与信更新対象基準単位数量）　＝　一時変数（与信更新対象基準単位数量）　＋　ロックした売上予定.基準単位数量 ×　-1
								credQty = credQty.add(lockedSlsSchdR.base_unit_qty().multiply(-1));
								//ロックしたレコードをDELETEする。※ロック・削除対象がない場合はエラーとしない。
								dbDeleteKey("MSBBL6220_MST_SLS_SCHD_D08", lockedSlsSchdR, lockedSlsSchdR_bldr);
								//受払予定の上り電文の作成
								if (MAC_STK_MNG_TYP.isMNG(itmR.stk_mng_typ())) {
									delIOSchd(lockedSlsSchdR);
								}
							}
						}

						//上り電文の情報を元に、売上予定の項目値を編集する。
						copy(newSlsSchdR, upd04DtlRow,
								createMap_MST_SLS_SCHD_R_Sls_Schd_Upd04_DtlR());
						newSlsSchdR
								.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.PURC_SCHD.value()); //売上予定作成元区分			
						newSlsSchdR.ship_schd_no(lockedSlsSchdR.ship_schd_no());//出荷予定ＮＯ
						if (icnt > 0) {
							newSlsSchdR.ship_schd_no(lockedSlsSchdR.ship_schd_no());//出荷予定ＮＯ
							newSlsSchdR.wg_rqst_no(lockedSlsSchdR.wg_rqst_no());//WG間依頼ＮＯ	
						}
						else {
							newSlsSchdR.ship_schd_no(null);//出荷予定ＮＯ
							MST_WG_RQST_R rqstR = MST_WG_RQST_R.create("T");
							MCQueryApiBuilder rqstR_bldr = MCQueryApiBuilder.create(rqstR);
							rqstR_bldr.setSelect(rqstR.wg_rqst_no);
							rqstR_bldr.setWhere(rqstR.wg_rqst_typ.eq(bind("1")), MSC_WG_RQST_TYP.PURC.value());
							rqstR_bldr.addWhereWithAnd(rqstR.slo_d_no.eq(bind("1")), upd04DtlRow.slo_d_no());
							rqstR_bldr.addWhereWithAnd(rqstR.can_flg.eq(value(false)));
							dbSelect("MSBBL6220_MST_WG_RQST_S02", rqstR, rqstR_bldr);
							newSlsSchdR.wg_rqst_no(rqstR.wg_rqst_no());//WG間依頼ＮＯ	
						}
						newSlsSchdR.po_schd_no(upd04DtlRow.po_schd_no());//発注予定NO
						newSlsSchdR.purc_schd_no(upd04DtlRow.purc_schd_no()); //仕入予定ＮＯ
						newSlsSchdR.lot_no(upd04DtlRow.lot_no()); //ロットＮＯ
						newSlsSchdR.sublot_no(upd04DtlRow.sublot_no()); //サブロットＮＯ
						setSlsAcAblFlg(mstSloDR, newSlsSchdR);
						//編集後のレコードを売上予定に新規登録する。
						dbInsert("MSBBL6220_MST_SLS_SCHD_I06", newSlsSchdR, newSlsSchdR_bldr);
						//・一時変数（与信更新対象基準単位数量）　＝　一時変数（与信更新対象基準単位数量）　＋　上り電文.基準単位数量
						credQty = credQty.add(upd04DtlRow.base_unit_qty());
						//売上予定.出荷予定ＮＯに対応する出荷予定テーブルを更新する。
						if (!isNull(newSlsSchdR.ship_schd_no())) {
							updShipSchd(newSlsSchdR, iCnt);
							setDlvTDlv(upd04DtlRow, iCnt);
						}
						upd04DtlRow.sls_schd_no(newSlsSchdR.sls_schd_no());
						//受払予定の上り電文の作成
						if (MAC_STK_MNG_TYP.isMNG(itmR.stk_mng_typ())) {
							updIOSchd(newSlsSchdR, mstSloDR);
						}
					}
					//上り電文.データ更新区分　＝　更新
					if (MAC_DATA_CRUD_TYP.isUPD(upd04DtlRow.data_crud_typ())) {
						//上り電文の仕入定ＮＯをもとに、仕入予定テーブルからレコードを取得する。
						MST_PURC_SCHD_R purcSchdR = MST_PURC_SCHD_R.create("T");
						dbSelectKey("MSBBL6220_MST_PURC_SCHD_S02", purcSchdR,
								MCQueryApiBuilder.create(purcSchdR), upd04DtlRow);
						//上り電文の仕入定ＮＯをもとに、売上予定データを検索、ロックする、
						lockedSlsSchdR_bldr.setWhere(lockedSlsSchdR.purc_schd_no.eq(bind("1"))
								.and(lockedSlsSchdR.purc_act_d_no.isNull()), upd04DtlRow.purc_schd_no());
						dbSelectForUpdate("MSBBL6220_MST_SLS_SCHD_S20", lockedSlsSchdR, lockedSlsSchdR_bldr);
						
						if (isNull(lockedSlsSchdR) || lockedSlsSchdR.isEmpty()) {
							continue;
						}
						
						//インボイス登録後に仕入予定を変更・取消するような更新はエラーとする。
						//売上予定作成区分が仕入予定で、ロックした売上予定にインボイス明細ＮＯが
						//セットされていたらエラーとする。
						if (!isNull(lockedSlsSchdR.iv_d_no())) {
							MCMessage msg = new MCMessage(upd04DtlRow, null, MSBBL0182,
									upd04DtlRow.purc_schd_no(),
									toDispGUIIndex(upd04DtlRow));
							throw new MCAppException(msg);
						}

						//・一時変数（与信更新対象基準単位数量）　＝　一時変数（与信更新対象基準単位数量）　＋　ロックした売上予定.基準単位数量 ×　-1
						if (!lockedSlsSchdR.abort_flg()) {
							credQty = credQty.add(lockedSlsSchdR.base_unit_qty().multiply(-1));
						}
						//ロックした売上予定のレコードを一時変数に保存してから、レコードを削除する。
						dbDeleteKey("MSBBL6220_MST_SLS_SCHD_D09", lockedSlsSchdR, lockedSlsSchdR_bldr);
						//受払予定の上り電文の作成
						if (MAC_STK_MNG_TYP.isMNG(itmR.stk_mng_typ())) {
							delIOSchd(lockedSlsSchdR);
						}
						// 仕入予定の残数（仕入未計上分）を計算する
						// 仕入予定の残数 ＝(仕入予定.基準単位予定数量 － 仕入予定.基準単位仕入数量 － 仕入予定.基準単位検収不良数量－　仕入予定.基準単位打切数）
						MCNumber remQty = getNotSlsQty(purcSchdR);
						// 仕入予定の残数　>　0の場合、仕入予定の残数の売上予定を作成する。
						if (remQty.isPositive()) {
							editSlsSchdByPurcSchd(lockedSlsSchdR, upd04DtlRow, purcSchdR, mstSloDR);
							dbInsert("MSBBL6220_MST_SLS_SCHD_I07", lockedSlsSchdR, lockedSlsSchdR_bldr);
							// 一時変数（与信更新対象基準単位数量） ＝ 一時変数（与信更新対象基準単位数量） ＋ 仕入予定の残数
							credQty = credQty.add(remQty);
							//売上予定.出荷予定ＮＯに対応する出荷予定テーブルを更新する。
							updShipSchd(lockedSlsSchdR, iCnt);
							setDlvTDlv(upd04DtlRow, iCnt);
							//受払予定の上り電文の作成
							if (MAC_STK_MNG_TYP.isMNG(itmR.stk_mng_typ())) {
								updIOSchd(lockedSlsSchdR, mstSloDR);
							}
						}
						//仕入予定.基準単位打切数　>　0の場合、打切分の売上予定を作成する。
						if (purcSchdR.base_unit_abort_qty().gt(0)) {
							MST_SLS_SCHD_R abrSlsSchdR = lockedSlsSchdR.clone();
							
							//上り電文の情報を元に、ロック時に取得された売上予定に対し、項目値を編集する。
							crtAbrSlsSchdByPurcSchd(abrSlsSchdR, upd04DtlRow, purcSchdR);
							//編集後のレコードを売上予定に新規作成する。
							dbInsert("MSBBL6220_MST_SLS_SCHD_I08", abrSlsSchdR,
									MCQueryApiBuilder.create(MST_SLS_SCHD_R.create("T")));
							//全数打切の場合（仕入予定.基準単位予定数量 ＝　仕入予定.基準単位打切数）、売上予定.出荷予定ＮＯに対応する出荷予定テーブルを更新する。
							if (purcSchdR.base_unit_schd_qty().eq(purcSchdR.base_unit_abort_qty())) {
								updShipSchd(abrSlsSchdR, iCnt);
							}
						}
					}
					//上り電文.データ更新区分　＝　削除
					if (MAC_DATA_CRUD_TYP.isDEL(upd04DtlRow.data_crud_typ())) {
						//上り電文の仕入定ＮＯをもとに、売上予定データを検索、ロックする、
						lockedSlsSchdR_bldr.setWhere(lockedSlsSchdR.purc_schd_no.eq(bind("1"))
										.and(lockedSlsSchdR.purc_act_d_no.isNull()), upd04DtlRow.purc_schd_no());
						dbSelectForUpdate("MSBBL6220_MST_SLS_SCHD_S21", lockedSlsSchdR, lockedSlsSchdR_bldr);
						
						if (isNull(lockedSlsSchdR) || lockedSlsSchdR.isEmpty()) {
							continue;
						}
						//インボイス登録後に仕入予定を変更・取消するような更新はエラーとする。
						//売上予定作成区分が仕入予定で、ロックした売上予定にインボイス明細ＮＯが
						//セットされていたらエラーとする。
						if (!isNull(lockedSlsSchdR.iv_d_no())) {
							MCMessage msg = new MCMessage(upd04DtlRow, null, MSBBL0182,
									upd04DtlRow.purc_schd_no(),
									toDispGUIIndex(upd04DtlRow));
							throw new MCAppException(msg);
						}
						//・一時変数（与信更新対象基準単位数量）　＝　一時変数（与信更新対象基準単位数量）　＋　ロックした売上予定.基準単位数量 ×　-1
						credQty = credQty.add(lockedSlsSchdR.base_unit_qty().multiply(-1));
						//ロックしたレコードをDELETEする
						dbDeleteKey("MSBBL6220_MST_SLS_SCHD_D10", lockedSlsSchdR, lockedSlsSchdR_bldr);
						//受払予定の上り電文の作成
						if (MAC_STK_MNG_TYP.isMNG(itmR.stk_mng_typ())) {
							delIOSchd(lockedSlsSchdR);
						}
						//上り電文の発注予定ＮＯが設定された場合、発注予定ＮＯに対応する、仕入予定の売上予定がなくなったかを確認する。
						if (!isNull(upd04DtlRow.po_schd_no())) {
							//検索条件：売上予定.発注予定NO　＝　上り電文.発注予定NO　AND 売上予定.仕入予定NO　IS NOT NULL
							MCList<MST_SLS_SCHD_R> sls_schdList = MCList.create(MST_SLS_SCHD_R.class);
							MST_SLS_SCHD_R sls_schdList_t = MST_SLS_SCHD_R.create("T");
							MCQueryApiBuilder sls_schdList_bldr = MCQueryApiBuilder.create(sls_schdList_t);
							sls_schdList_bldr.setWhere(sls_schdList_t.po_schd_no.eq(bind("1"))
									.and(sls_schdList_t.purc_schd_no.isNotNull()), upd04DtlRow.po_schd_no());
							int icnt = dbSelect("MSBBL6220_MST_SLS_SCHD_S22", sls_schdList, sls_schdList_bldr);
							//上記の検索条件で検索結果は0件の場合、発注予定ＮＯに対応する、仕入予定の売上予定がなくなると見做す、
							if (icnt > 0 || upd04DtlRow.ship_schd_del_flg()) {
								//ロックした売上予定.出荷予定NOを削除のキーで出荷予定テーブルからレコードを削除する。
								delShipSchd(lockedSlsSchdR, iCnt);
							}
							else {
								//発注予定情報を元に、売上予定を新規作成。
								MST_SLS_SCHD_R slsSchdR = crtSlsSchdByPoSchd(upd04DtlRow);
								//・一時変数（与信更新対象基準単位数量）　＝　一時変数（与信更新対象基準単位数量）　＋　上記検索した発注予定.基準単位数量 
								credQty = credQty.add(slsSchdR.base_unit_qty());
								//売上予定.出荷予定ＮＯに対応する出荷予定テーブルを更新する。
								if (!isNull(slsSchdR.ship_schd_no())) {
									updShipSchd(slsSchdR, iCnt);
								}
								//受払予定の上り電文の作成
								if (MAC_STK_MNG_TYP.isMNG(itmR.stk_mng_typ())) {
									updIOSchd(slsSchdR, mstSloDR);
								}
							}
						}
					}
				}
				
				// 売上予定作成元区分が仕入実績の場合
				if (MSC_SLS_SCHD_SRC_TYP.isPURC_ACT_D(upd04DtlRow.sls_schd_src_typ())) {
					
					if (MAC_DATA_CRUD_TYP.isCRT(upd04DtlRow.data_crud_typ())) {
						lockedSlsSchdR_bldr.setWhere(
								bracket(lockedSlsSchdR.purc_schd_no.eq(bind("1"))
										.and(lockedSlsSchdR.purc_act_d_no.isNull())
										.and(lockedSlsSchdR.abort_flg.eq(value(false)))),
								upd04DtlRow.purc_schd_no());
					}
					else if (MAC_DATA_CRUD_TYP.isUPD(upd04DtlRow.data_crud_typ())
							|| MAC_DATA_CRUD_TYP.isDEL(upd04DtlRow.data_crud_typ())) {
						lockedSlsSchdR_bldr.setWhere(lockedSlsSchdR.purc_act_d_no.eq(bind("1")), upd04DtlRow.purc_act_d_no());
						lockedSlsSchdR_bldr.addWhereWithOr(bracket( lockedSlsSchdR.sls_schd_no.eq(bind("1"))), upd04DtlRow.sls_schd_no());
					}
					
					dbSelectForUpdate("MSBBL6220_MST_SLS_SCHD_S23", lockedSlsSchdR, lockedSlsSchdR_bldr);
						
					if (!isNull(lockedSlsSchdR) &&  !lockedSlsSchdR.isEmpty()) {
						
						if (lockedSlsSchdR.base_unit_sls_qty().isPositive()) {
							
							if (((MAC_DATA_CRUD_TYP.isCRT(upd04DtlRow.data_crud_typ()) 
										|| MAC_DATA_CRUD_TYP.isUPD(upd04DtlRow.data_crud_typ())) 
										&& isSlsSchdChange(lockedSlsSchdR, upd04DtlRow))
									|| MAC_DATA_CRUD_TYP.isDEL(upd04DtlRow.data_crud_typ())) {
								
								if (!upd04DtlRow.sls_purc_sync_flg()) {
									//　売上計上後に、売上仕入同時計上の場合のみ、数量変更可能とする。
									throw new MCAppException(MSBBL0255, upd04DtlRow.purc_act_d_no());
								}
							}
							else {
								continue;
							}
						}
						
						if (!isNull(lockedSlsSchdR.iv_d_no())) {
							
							if (((MAC_DATA_CRUD_TYP.isCRT(upd04DtlRow.data_crud_typ()) 
									|| MAC_DATA_CRUD_TYP.isUPD(upd04DtlRow.data_crud_typ())) 
									&& isSlsSchdChange(lockedSlsSchdR, upd04DtlRow))
								|| MAC_DATA_CRUD_TYP.isDEL(upd04DtlRow.data_crud_typ())) {
								
								if (!upd04DtlRow.sls_purc_sync_flg()) {
									if (!isRcptIv(lockedSlsSchdR)) {
										throw new MCAppException(MSBBL0256, upd04DtlRow.purc_act_d_no());
									}
								}
							}
							else {
								
								lockedSlsSchdR.sls_schd_src_typ(upd04DtlRow.sls_schd_src_typ());
								lockedSlsSchdR.purc_act_d_no(upd04DtlRow.purc_act_d_no());
								if (upd04DtlRow.abort_flg()) {
									
									lockedSlsSchdR.cmpl_flg(true);
									lockedSlsSchdR.abort_flg(true);
									lockedSlsSchdR.base_unit_abort_qty(upd04DtlRow.base_unit_qty());
									lockedSlsSchdR.base_unit_sls_qty(0);
								}
								else {
									lockedSlsSchdR.cmpl_flg(false);
									lockedSlsSchdR.abort_flg(false);
									lockedSlsSchdR.base_unit_abort_qty(0);
									lockedSlsSchdR.base_unit_sls_qty(0);
								}
								setSlsAcAblFlg(mstSloDR, lockedSlsSchdR);
								
								dbUpdateKey("MSBBL6220_MST_SLS_SCHD_U08", lockedSlsSchdR, lockedSlsSchdR_bldr);
								
								if (MAC_STK_MNG_TYP.isMNG(itmR.stk_mng_typ())) {
									delIOSchd(lockedSlsSchdR);
									if (!upd04DtlRow.abort_flg()) {
										updIOSchd(lockedSlsSchdR, mstSloDR);
									}
								}
								
								continue;
							}
						}
					}
					
					if (MAC_DATA_CRUD_TYP.isCRT(upd04DtlRow.data_crud_typ())) {
						
						copy(newSlsSchdR, upd04DtlRow, createMap_MST_SLS_SCHD_R_Sls_Schd_Upd04_DtlR());
						
						if (!isNull(lockedSlsSchdR) && !lockedSlsSchdR.isEmpty()) {
							newSlsSchdR.ship_schd_no(lockedSlsSchdR.ship_schd_no());
							newSlsSchdR.wg_rqst_no(lockedSlsSchdR.wg_rqst_no());
							newSlsSchdR.sls_schd_dt(lockedSlsSchdR.sls_schd_dt());
						}
						else {
							newSlsSchdR.ship_schd_no(null);
							MST_WG_RQST_R rqstR = MST_WG_RQST_R.create("T");
							MCQueryApiBuilder rqstR_bldr = MCQueryApiBuilder.create(rqstR);
							rqstR_bldr.setSelect(rqstR.wg_rqst_no);
							rqstR_bldr.setWhere(rqstR.wg_rqst_typ.eq(bind("1")), MSC_WG_RQST_TYP.PURC.value());
							rqstR_bldr.addWhereWithAnd(rqstR.slo_d_no.eq(bind("1")), upd04DtlRow.slo_d_no());
							rqstR_bldr.addWhereWithAnd(rqstR.can_flg.eq(value(false)));
							dbSelect("MSBBL6220_MST_WG_RQST_S03", rqstR, rqstR_bldr);
							newSlsSchdR.wg_rqst_no(rqstR.wg_rqst_no());
						}

						newSlsSchdR.sls_schd_src_typ(upd04DtlRow.sls_schd_src_typ());
						newSlsSchdR.po_schd_no(upd04DtlRow.po_schd_no());
						newSlsSchdR.purc_schd_no(upd04DtlRow.purc_schd_no());
						newSlsSchdR.lot_no(upd04DtlRow.lot_no());
						newSlsSchdR.sublot_no(upd04DtlRow.sublot_no());
						newSlsSchdR.purc_act_d_no(upd04DtlRow.purc_act_d_no());
						
						if (upd04DtlRow.abort_flg()) {
							
							newSlsSchdR.cmpl_flg(true);
							newSlsSchdR.abort_flg(true);
							newSlsSchdR.base_unit_abort_qty(upd04DtlRow.base_unit_qty());
							newSlsSchdR.base_unit_sls_qty(0);
						}
						if (isNull(newSlsSchdR.purc_act_d_no())) {
							// 仕入実績が未計上の場合、売上予定作成元区分を「８：仕入予定」に設定する
							// インボイス登録後の場合、売上予定作成元区分を「９：インボイス明細」に設定する
							if (isNull(lockedSlsSchdR.iv_d_no())) {
								newSlsSchdR.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.PURC_SCHD.value());
							}
							else {
								newSlsSchdR.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.IV_D.value());
								newSlsSchdR.iv_no(lockedSlsSchdR.iv_no());
								newSlsSchdR.iv_d_no(lockedSlsSchdR.iv_d_no());
							}
						}
						setSlsAcAblFlg(mstSloDR, newSlsSchdR);
						if (!isNull(lockedSlsSchdR) && !lockedSlsSchdR.isEmpty()) {
							
							credQty = credQty.add(lockedSlsSchdR.base_unit_qty().multiply(-1));
							
							if (MAC_STK_MNG_TYP.isMNG(itmR.stk_mng_typ())) {
								delIOSchd(lockedSlsSchdR);
							}
							
							newSlsSchdR.sls_schd_no(lockedSlsSchdR.sls_schd_no());
							newSlsSchdR.base_unit_sls_qty(lockedSlsSchdR.base_unit_sls_qty());
							dbUpdateKey("MSBBL6220_MST_SLS_SCHD_U09", newSlsSchdR, newSlsSchdR_bldr);
						}
						else {
							dbInsert("MSBBL6220_MST_SLS_SCHD_I09", newSlsSchdR, newSlsSchdR_bldr);
						}
						
						if (!upd04DtlRow.abort_flg()) {
							credQty = credQty.add(upd04DtlRow.base_unit_qty());
						}
						
						if (!isNull(newSlsSchdR.ship_schd_no())) {
							updShipSchd(newSlsSchdR, iCnt);
							setDlvTDlv(upd04DtlRow, iCnt);
						}
						upd04DtlRow.sls_schd_no(newSlsSchdR.sls_schd_no());
						
						if (!upd04DtlRow.abort_flg()) {
							if (MAC_STK_MNG_TYP.isMNG(itmR.stk_mng_typ())) {
								updIOSchd(newSlsSchdR, mstSloDR);
							}
						}
					}
					else if (MAC_DATA_CRUD_TYP.isUPD(upd04DtlRow.data_crud_typ())) {
						
						if (!lockedSlsSchdR.abort_flg()) {
							credQty = credQty.add(lockedSlsSchdR.base_unit_qty().multiply(-1));
						}
						
						if (MAC_STK_MNG_TYP.isMNG(itmR.stk_mng_typ())) {
							delIOSchd(lockedSlsSchdR);
						}
						
						MCNumber oldBaseUnitQty = lockedSlsSchdR.base_unit_qty();
						boolean oldAbortFlg = lockedSlsSchdR.abort_flg();
						
						lockedSlsSchdR.lot_no(upd04DtlRow.lot_no());
						lockedSlsSchdR.sublot_no(upd04DtlRow.sublot_no());
						lockedSlsSchdR.trd_unit_cd(upd04DtlRow.trd_unit_cd());
						lockedSlsSchdR.trd_unit_qty(upd04DtlRow.trd_unit_qty());
						lockedSlsSchdR.base_unit_cd(upd04DtlRow.base_unit_cd());
						lockedSlsSchdR.base_unit_qty(upd04DtlRow.base_unit_qty());
						lockedSlsSchdR.abort_flg(upd04DtlRow.abort_flg());
						
						if (upd04DtlRow.abort_flg()) {
							
							lockedSlsSchdR.cmpl_flg(true);
							lockedSlsSchdR.abort_flg(true);
							lockedSlsSchdR.base_unit_abort_qty(upd04DtlRow.base_unit_qty());
							lockedSlsSchdR.base_unit_sls_qty(0);
						}
						else {
							lockedSlsSchdR.cmpl_flg(false);
							lockedSlsSchdR.base_unit_abort_qty(0);
						}
						setSlsAcAblFlg(mstSloDR, lockedSlsSchdR);
						dbUpdateKey("MSBBL6220_MST_SLS_SCHD_U10", lockedSlsSchdR, lockedSlsSchdR_bldr);
						
						if (!upd04DtlRow.abort_flg()) {
							credQty = credQty.add(upd04DtlRow.base_unit_qty());
							if (upd04DtlRow.sls_purc_sync_flg() && oldAbortFlg) {
								credQty = credQty.subtract(oldBaseUnitQty);
							}
						}
						
						updShipSchd(lockedSlsSchdR, iCnt);
						setDlvTDlv(upd04DtlRow, iCnt);
						
						if (MAC_STK_MNG_TYP.isMNG(itmR.stk_mng_typ()) && !upd04DtlRow.abort_flg()) {
							updIOSchd(lockedSlsSchdR, mstSloDR);
						}
					}
					else if (MAC_DATA_CRUD_TYP.isDEL(upd04DtlRow.data_crud_typ())) {
						
						if (!lockedSlsSchdR.abort_flg()) {
							credQty = credQty.add(lockedSlsSchdR.base_unit_qty().multiply(-1));
						}
						
						if (!isNull(lockedSlsSchdR.purc_act_d_no())) {
							
							MCList<MST_SLS_SCHD_R> nonActSlsSchdL = MCList.create(MST_SLS_SCHD_R.class);
							MST_SLS_SCHD_R t = MST_SLS_SCHD_R.create("T");
							MCQueryApiBuilder nonActSlsSchdL_bldr = MCQueryApiBuilder.create(t);
							nonActSlsSchdL_bldr.setWhere(bracket(t.purc_schd_no.eq(bind("1"))), upd04DtlRow.purc_schd_no());
							nonActSlsSchdL_bldr.addWhereWithAnd(t.iv_d_no.isNull());
							nonActSlsSchdL_bldr.addWhereWithAnd(t.purc_act_d_no.isNull());
							nonActSlsSchdL_bldr.addWhereWithAnd(t.abort_flg.eq(value(false)));
							dbSelectForUpdate("MSBBL6220_MST_SLS_SCHD_S24", nonActSlsSchdL, nonActSlsSchdL_bldr);
							
							if (isNull(lockedSlsSchdR.iv_d_no()) && !nonActSlsSchdL.isEmpty()) {
								// 削除対象の売上予定のインボイスが未登録の場合のみ、出荷予定と売上予定を削除する
								
								dbDeleteKey("MSBBL6220_MST_SLS_SCHD_D11", lockedSlsSchdR, lockedSlsSchdR_bldr);
								
								if (upd04DtlRow.ship_schd_del_flg()) {
									delShipSchd(lockedSlsSchdR, iCnt);
								}
								
								if (MAC_STK_MNG_TYP.isMNG(itmR.stk_mng_typ())) {
									delIOSchd(lockedSlsSchdR);
								}
							}
							
							lockedSlsSchdR.purc_act_d_no(null);
							// 数量を設定しないと、与信使用額が正しく更新されない
							// 仕入予定の残数を設定する
							if (!isNull(nonActSlsSchdL) && !nonActSlsSchdL.isEmpty()
									&& isNull(nonActSlsSchdL.get(0).purc_act_d_no()) 
									&& !nonActSlsSchdL.get(0).abort_flg()) {
								lockedSlsSchdR.base_unit_qty(nonActSlsSchdL.get(0).base_unit_qty());
								lockedSlsSchdR.trd_unit_qty(nonActSlsSchdL.get(0).trd_unit_qty());
							}
							else {
								lockedSlsSchdR.base_unit_qty(0);
								lockedSlsSchdR.trd_unit_qty(0);
							}
							lockedSlsSchdR.abort_flg(false);
							lockedSlsSchdR.cmpl_flg(false);
							dbUpdateKey("MSBBL6220_MST_SLS_SCHD_U11", lockedSlsSchdR, lockedSlsSchdR_bldr);
							
							// この時点の売上予定は一時的なモノであり（数量が０の可能性もあり）、出荷予定に反映しないようにする
							// 「仕入実績の取消」に伴う「仕入予定の新規」も売上予定に反映したタイミングで出荷予定に反映する
						}
						else {
						
							dbDeleteKey("MSBBL6220_MST_SLS_SCHD_D12", lockedSlsSchdR, lockedSlsSchdR_bldr);
							
							if (!isNull(lockedSlsSchdR.ship_schd_no())) {
								
								// 売上予定が１件しかない際に、売上予定と出荷予定を消さない
								MCList<MST_SLS_SCHD_R> slsSchdL = MCList.create(MST_SLS_SCHD_R.class);
								MST_SLS_SCHD_R slsSchdL_t = MST_SLS_SCHD_R.create("T");
								MCQueryApiBuilder slsSchdL_bldr = MCQueryApiBuilder.create(slsSchdL_t);
								slsSchdL_bldr.setWhere(slsSchdL_t.slo_d_no.eq(bind("1")), lockedSlsSchdR.slo_d_no());
								int icnt = dbSelect("MSBBL6220_MST_SLS_SCHD_S25", slsSchdL, slsSchdL_bldr);
								
								if (icnt > 0 && upd04DtlRow.ship_schd_del_flg()) {
									delShipSchd(lockedSlsSchdR, iCnt);
								}
								else {
									updShipSchd(lockedSlsSchdR, iCnt);
								}
							}
							
							if (MAC_STK_MNG_TYP.isMNG(itmR.stk_mng_typ())) {
								delIOSchd(lockedSlsSchdR);
							}
						}
					}
				}

				//上り電文.売上予定作成元区分　＝　インボイス登録の場合
				if (MSC_SLS_SCHD_SRC_TYP.isIV_D(upd04DtlRow.sls_schd_src_typ())) {
					//上り電文.データ更新区分　＝　新規、更新
					if (MAC_DATA_CRUD_TYP.isCRT(upd04DtlRow.data_crud_typ())
							|| MAC_DATA_CRUD_TYP.isUPD(upd04DtlRow.data_crud_typ())) {

						//IV_NOの取得
						MCList<MST_IV_D_R> ivDL = MCList.create(MST_IV_D_R.class);
						MST_IV_D_R ivDL_t = MST_IV_D_R.create("T");
						MCQueryApiBuilder ivDL_bldr = MCQueryApiBuilder.create(ivDL_t);
						MST_IV_R ivDL_t1 = MST_IV_R.create("T1");
						MST_IV_MAP_R ivDL_t2 = MST_IV_MAP_R.create("T2");
						ivDL_bldr.addInnerJoin(ivDL_t1, bracket(ivDL_t.iv_mng_no.eq(ivDL_t1.iv_mng_no)));
						ivDL_bldr.addInnerJoin(ivDL_t2, bracket(ivDL_t.iv_d_no.eq(ivDL_t2.iv_d_no)));
						ivDL_bldr.addSelect(ivDL_t1.iv_no);
						ivDL_bldr.addSelect(ivDL_t2.ship_schd_no);
						dbSelectKey("MSBBL6220_MST_IV_D_S03", ivDL, ivDL_bldr, upd04DtlRow);
						
						for (MST_IV_D_R ivDR : ivDL) {
							
							//上り電文の仕入予定ＮＯで下記の条件で売上予定データを検索、ロックする。	
							lockedSlsSchdR_bldr.setWhere(lockedSlsSchdR.ship_schd_no.eq(bind("1")),
									ivDR.getStringNE("ship_schd_no"));
							int iCont = dbSelectForUpdate("MSBBL6220_MST_SLS_SCHD_S26", lockedSlsSchdR, lockedSlsSchdR_bldr);
							
							if (iCont > 0) {

								//更新項目の値を設定
								lockedSlsSchdR.iv_d_no(upd04DtlRow.iv_d_no());
								lockedSlsSchdR.iv_no(ivDR.getString("iv_no"));
								lockedSlsSchdR.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.IV_D.value());
								lockedSlsSchdR.sls_schd_dt(upd04DtlRow.sls_schd_dt());
								setSlsAcAblFlg(mstSloDR, lockedSlsSchdR);
								lockedSlsSchdR_bldr.setSet(lockedSlsSchdR.iv_d_no);
								lockedSlsSchdR_bldr.addSet(lockedSlsSchdR.iv_no);
								lockedSlsSchdR_bldr.addSet(lockedSlsSchdR.sls_schd_src_typ);
								lockedSlsSchdR_bldr.addSet(lockedSlsSchdR.sls_schd_dt);
								lockedSlsSchdR_bldr.addSet(lockedSlsSchdR.sls_ac_abl_flg);
								//編集後のレコードを売上予定に新規登録する。
								dbUpdateKey("MSBBL6220_MST_SLS_SCHD_U12", lockedSlsSchdR, lockedSlsSchdR_bldr);
								if (!isNull(lockedSlsSchdR.ship_schd_no())) {
									updShipSchd(lockedSlsSchdR, iCnt);
								}
								//受払予定の上り電文の作成
								if (MAC_STK_MNG_TYP.isMNG(itmR.stk_mng_typ())) {
									delIOSchd(lockedSlsSchdR);
									updIOSchd(lockedSlsSchdR, mstSloDR);
								}
							}
						}
					}

					//上り電文.データ更新区分　＝　削除
					if (MAC_DATA_CRUD_TYP.isDEL(upd04DtlRow.data_crud_typ())) {
						
						MCList<MST_SLS_SCHD_R> lockedSlsSchdL = MCList.create(MST_SLS_SCHD_R.class);
						MST_SLS_SCHD_R lockedSlsSchdL_t = MST_SLS_SCHD_R.create("T");
						MCQueryApiBuilder lockedSlsSchdL_bldr = MCQueryApiBuilder.create(lockedSlsSchdL_t);
						lockedSlsSchdL_bldr.setWhere(lockedSlsSchdL_t.iv_d_no.eq(bind("1")), upd04DtlRow.iv_d_no());
						dbSelectForUpdate("MSBBL6220_MST_SLS_SCHD_S27", lockedSlsSchdL, lockedSlsSchdL_bldr);
						
						for (MST_SLS_SCHD_R slsSchdR : lockedSlsSchdL) {
							
							lockedSlsSchdR = slsSchdR.clone();
							MST_SLS_SCHD_R lockedSlsSchdR_t2 = MST_SLS_SCHD_R.create("T");
							MCQueryApiBuilder lockedSlsSchdR2_bldr = MCQueryApiBuilder.create(lockedSlsSchdR_t2);
							//更新項目の値を設定
							lockedSlsSchdR.iv_d_no(null);
							lockedSlsSchdR.iv_no(null);
							if (!isNull(lockedSlsSchdR.purc_act_d_no())) {
								lockedSlsSchdR.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.PURC_ACT_D.value());
							}
							else {
								lockedSlsSchdR.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.PURC_SCHD.value());
							}
							setSlsAcAblFlg(mstSloDR, lockedSlsSchdR);
							lockedSlsSchdR.sls_schd_dt(getSlsSchdDt(lockedSlsSchdR.slo_d_no(), lockedSlsSchdR.purc_schd_no()));
							lockedSlsSchdR2_bldr.setSet(lockedSlsSchdR_t2.iv_d_no);
							lockedSlsSchdR2_bldr.addSet(lockedSlsSchdR_t2.iv_no);
							lockedSlsSchdR2_bldr.addSet(lockedSlsSchdR_t2.sls_schd_src_typ);
							lockedSlsSchdR2_bldr.addSet(lockedSlsSchdR_t2.sls_schd_dt);
							lockedSlsSchdR2_bldr.addSet(lockedSlsSchdR_t2.sls_ac_abl_flg);
							//編集後のレコードを売上予定に新規登録する。
							dbUpdateKey("MSBBL6220_MST_SLS_SCHD_U13", lockedSlsSchdR, lockedSlsSchdR2_bldr);
							if (!isNull(lockedSlsSchdR.ship_schd_no())) {
								updShipSchd(lockedSlsSchdR, iCnt);
							}
							//受払予定の上り電文の作成
							if (MAC_STK_MNG_TYP.isMNG(itmR.stk_mng_typ())) {
								delIOSchd(lockedSlsSchdR);
								updIOSchd(lockedSlsSchdR, mstSloDR);
							}
						}
					}
				}
				if (!MSC_SLS_SCHD_SRC_TYP.isIV_D(upd04DtlRow.sls_schd_src_typ())) {
					if (!upd04DtlRow.cred_no_up_flg()) {
						//※受注ヘッダ.取引通貨に対応する通貨マスタ.金額小数部有効桁数、受注ヘッダ.得意先CDに対応する取引先マスタ.売上金額端数処理区分により端数処理する。
						MCNumber decPlace = getAmtDecPlace(
								mstSloDR.getString("trd_cur_cd"));
						String rndTyp = getRndTyp(mstSloDR.getString("cst_cd"));
						//・与信更新対象基準単位数量に対応する与信額の算出：
						Cred_Upd01_CndR credR = Cred_Upd01_CndR.create();
						MCNumber credRAmt = (mstSloDR.trd_cur_amt()
								.add(mstSloDR.trd_cur_tax_amt())).multiply(credQty)
										.divide(mstSloDR.base_unit_qty(),
												decPlace.intValue(),
												MAC_RND_TYP.toMC(rndTyp));

						if (itmR.dscnt_itm_flg()) {
							credRAmt = credRAmt.multiply(-1);
						}
						credR.cst_cd(mstSloDR.getString("cst_cd"));//得意先CD
						credR.cur_cd(mstSloDR.getString("trd_cur_cd"));//取引通貨ＣＤ.
						credR.trd_ptn_typ(mstSloDR.getString("trd_ptn_typ"));//取引パタン区分.
						credR.amt(credRAmt);//与信額
						_credAmtL.add(credR);
					}
				}
			}
		}
		protected String getPurcSchdNo(Sls_Schd_Upd04_DtlR dtlR) {
			
			if (MSC_SLS_SCHD_SRC_TYP.isPURC_SCHD(dtlR.sls_schd_src_typ()) 
					&& MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
				return null;
			}
			
			return dtlR.purc_schd_no();
		}
		
		protected MCDate getSlsSchdDt(String sloDNo, String purcSchdNo) {
			
			MST_SLO_D_R sloDR = null;
			if (!isNull(purcSchdNo)) {
				sloDR = _sloDL.getFirst(_idxkeySloDPurcSchd, sloDNo, purcSchdNo);
			}
			else {
				sloDR = _sloDL.getFirst(_idxkeySloD, sloDNo);
			}
			
			MAM_BP_R bpR = _cacheBp.get(sloDR.getStringNE("cst_cd"));
			
			if (bpR.cst_iv_flg()) {
				return sloDR.getDateNE("tmp_iv_sls_schd_dt");
			}
			else {
				return sloDR.getDateNE("tmp_sls_schd_dt");
			}
		}
		
		protected MCDate getDlvSchdTm(String sloDNo, String purcSchdNo) {
			
			MST_SLO_D_R sloDR = null;
			if (!isNull(purcSchdNo)) {
				sloDR = _sloDL.getFirst(_idxkeySloDPurcSchd, sloDNo, purcSchdNo);
			}
			else {
				sloDR = _sloDL.getFirst(_idxkeySloD, sloDNo);
			}
			
			return sloDR.getDateNE("tmp_dlv_schd_tm");
		}
		/**
		 * 仕入予定の残数（仕入未計上分）を算出する。
		 * @param purcSchdR 仕入予定
		 * @return 仕入予定の残数
		 */
		protected MCNumber getNotSlsQty(MST_PURC_SCHD_R purcSchdR) {
			
			return purcSchdR.base_unit_schd_qty().subtract(purcSchdR.base_unit_purc_qty())
					.subtract(purcSchdR.base_unit_accpt_dfct_qty()).subtract(purcSchdR.base_unit_abort_qty());
		}

		/**
		 * 売上予定の売上計上可能を設定する。（売上予定作成元区分が仕入予定、仕入実績明細またはインボイス取引明細の場合のみ）
		 * @param sloDR 受注明細
		 * @param slsSchdR 売上予定
		 */
		protected void setSlsAcAblFlg(MST_SLO_D_R sloDR, MST_SLS_SCHD_R slsSchdR) {
			
			if (!MSC_SLS_SCHD_SRC_TYP.isPURC_SCHD(slsSchdR.sls_schd_src_typ()) 
					&& !MSC_SLS_SCHD_SRC_TYP.isPURC_ACT_D(slsSchdR.sls_schd_src_typ())
					&& !MSC_SLS_SCHD_SRC_TYP.isIV_D(slsSchdR.sls_schd_src_typ())) {
				return;
			}
			
			MAM_BP_R bpR = _cacheBp.get(sloDR.getStringNE("cst_cd"));
			if (slsSchdR.abort_flg() 
					|| (!isNull(bpR) && bpR.cst_iv_flg() && isNull(slsSchdR.iv_d_no()))) {
				// 仕入直送（受注がインボイス取引）の場合、インボイス登録後に売上計上可能になる
				slsSchdR.sls_ac_abl_flg(false);
			}
			else {
				slsSchdR.sls_ac_abl_flg(true);
			}
		}
		
		/**
		 * キャッシュを取得します
		 * @param upd04DtlList
		 * @param sloDL
		 * @param itmL
		 */
		protected void createCache(MCList<Sls_Schd_Upd04_DtlR> upd04DtlList
				,MCList<MST_SLO_D_R> cacheSloDL) {
			
			// 受注明細
			MCList<MST_SLO_D_R> tmpSloDL = getSloDL(upd04DtlList);
			
			// 取引先マスタ
			MAM_BP_R bpL_t = MAM_BP_R.create("T");
			MCQueryApiBuilder bpL_bldr = MCQueryApiBuilder.create(bpL_t);
			bpL_bldr.setSelect(bpL_t.sls_amt_rnd_typ);
			bpL_bldr.addSelect(bpL_t.cst_iv_flg);
			_cacheBp = new FXUCL_MCDbcCache<MAM_BP_R>(bpL_bldr, tmpSloDL, "cst_cd");
			
			// 品目マスタ
			MAM_ITM_R itmL_t = MAM_ITM_R.create("T");
			MCQueryApiBuilder itmL_bldr = MCQueryApiBuilder.create(itmL_t);
			itmL_bldr.setSelect(itmL_t.stk_mng_typ);
			_cacheItm = new FXUCL_MCDbcCache<MAM_ITM_R>(itmL_bldr, tmpSloDL,
					MST_SLO_D_R.$itm_cd, MST_SLO_D_R.$itm_sub1, MST_SLO_D_R.$itm_sub2,
					MST_SLO_D_R.$itm_sub3);

			cacheSloDL.setAll(tmpSloDL);
			
			// 品目単位マスタ
			MCList<MAVM_ITM_UNIT_R> itmUnitL = MCList.create(MAVM_ITM_UNIT_R.create());
			itmUnitL.addNumberColumn("base_unit_dec_place");
			itmUnitL.addStringColumn("base_unit_rnd_typ");
			_cacheItmUnitL = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(itmUnitL, getQApiBuilderItmUnit(), cacheSloDL, MST_SLO_D_R.$itm_cd, MST_SLO_D_R.$itm_sub1,
					MST_SLO_D_R.$itm_sub2, MST_SLO_D_R.$itm_sub3, MST_SLO_D_R.$trd_unit_cd);
		}
		
		/**
		 * 売上予定が変更されたかどうか。
		 * @param slsSchdR 売上予定
		 * @param purcActDtlR 仕入実績明細
		 * @return 変更された場合はtrue
		 */
		protected boolean isSlsSchdChange(MST_SLS_SCHD_R slsSchdR, Sls_Schd_Upd04_DtlR purcActDtlR) {

			return !isColSame(
					slsSchdR, 
					purcActDtlR, 
					new String[] {MST_SLS_SCHD_R.$base_unit_qty});
		}
		/**
		 * 受領ＩＶ対象かどうか。
		 * @param slsSchdR 売上予定
		 * @return 受領ＩＶ対象の場合はtrue
		 */
		protected boolean isRcptIv(MST_SLS_SCHD_R slsSchdR) {

			// 受領インボイス
			MCList<MST_RCPT_IV_R> rivL = MCList.create(MST_RCPT_IV_R.class);
			MST_RCPT_IV_R t = MST_RCPT_IV_R.create("T");
			MCQueryApiBuilder rivL_bldr = MCQueryApiBuilder.create(t);
			MST_IV_R t1 = MST_IV_R.create("T1");
			rivL_bldr.addInnerJoin(t1, bracket( t.rcpt_iv_mng_no.eq(t1.rcpt_iv_mng_no)));
			rivL_bldr.setWhere(t1.iv_no.eq(bind("1")), slsSchdR.iv_no());
			rivL_bldr.setSelect(t.rcpt_iv_mng_no);
			int i = dbSelect("MSBBL6220_MST_RCPT_IV_S01", rivL, rivL_bldr);
			if (i > 0) {
				return true;
			}
			else {
				return false;
			}
		}

		/**
		 * 上り電文の受注明細NOで受注明細レコードを一括取得する。
		 * @param upd04DtlList　上り電文レコード
		 * @return
		 */
		protected MCList<MST_SLO_D_R> getSloDL(MCList<Sls_Schd_Upd04_DtlR> upd04DtlList) {
			MCList<MST_SLO_D_R> sloDL = MCList.create(MST_SLO_D_R.class);
			sloDL.addStringColumn("trd_cur_cd");
			sloDL.addStringColumn("cst_cd");
			sloDL.addStringColumn("trd_ptn_typ");
			sloDL.addDateColumn("slo_dt");
			sloDL.addStringColumn("sls_dpt_cd");
			MST_SLO_D_R t = MST_SLO_D_R.create("T");
			MCQueryApiBuilder sloDL_bldr = MCQueryApiBuilder.create(t);
			MST_SLO_R t1 = MST_SLO_R.create("T1");
			MST_WG_RQST_R t2 = MST_WG_RQST_R.create("T2");
			MST_PO_SCHD_R t3 = MST_PO_SCHD_R.create("T3");
			MST_PO_D_R t4 = MST_PO_D_R.create("T4");
			MST_ARR_PR_R t5 = MST_ARR_PR_R.create("T5");
			MST_ARR_SCHD_R t6 = MST_ARR_SCHD_R.create("T6");
			MST_PURC_SCHD_R t7 = MST_PURC_SCHD_R.create("T7");
			MST_IV_D_R t8 = MST_IV_D_R.create("T8");
			MST_IV_R t9 = MST_IV_R.create("T9");

			sloDL_bldr.addInnerJoin(t1, bracket(t.slo_no.eq(t1.slo_no)));
			sloDL_bldr.addLeftOuterJoin(t2,bracket(t.slo_d_no.eq(t2.slo_d_no)
											.and(t2.can_flg.eq(value(false)))));
			sloDL_bldr.addLeftOuterJoin(t3,bracket(t.slo_d_no.eq(t3.slo_d_no)
											.and(t3.can_flg.eq(value(false)))));
			sloDL_bldr.addLeftOuterJoin(t4,bracket(t.slo_d_no.eq(t4.slo_d_no)
											.and(t4.can_flg.eq(value(false)))));
			sloDL_bldr.addLeftOuterJoin(t5, bracket(t4.po_d_no.eq(t5.po_d_no)));
			sloDL_bldr.addLeftOuterJoin(t6, bracket(t5.arr_pr_no.eq(t6.arr_pr_no)));
			sloDL_bldr.addLeftOuterJoin(t7, bracket(t6.arr_schd_no.eq(t7.arr_schd_no)));
			sloDL_bldr.addLeftOuterJoin(t8, bracket(t7.purc_schd_no.eq(t8.purc_schd_no)));
			sloDL_bldr.addLeftOuterJoin(t9, bracket(t8.iv_mng_no.eq(t9.iv_mng_no)));
			sloDL_bldr.addSelect(t7.purc_schd_no);
			sloDL_bldr.addSelect(trunc(nvl(
							nvl(nvl(nvl(nvl(t9.trd_schd_dt, t.sls_schd_dt),
									t6.arr_schd_tm), t3.dlv_rqst_tm), t2.gr_rqst_tm),
							t.dlv_rqst_tm), MCDateFmt.DD).as("tmp_iv_sls_schd_dt"));
			sloDL_bldr.addSelect(trunc(
					nvl(nvl(nvl(t6.arr_schd_tm, t3.dlv_rqst_tm), t2.gr_rqst_tm),
							t.dlv_rqst_tm), MCDateFmt.DD).as("tmp_sls_schd_dt"));
			sloDL_bldr.addSelect(
					nvl(nvl(nvl(nvl(t9.eta_dt, t6.arr_schd_tm), t3.dlv_rqst_tm),
							t2.gr_rqst_tm), t.dlv_rqst_tm).as("tmp_dlv_schd_tm"));
			sloDL_bldr.addSelect(t1.trd_cur_cd);
			sloDL_bldr.addSelect(t1.cst_cd);
			sloDL_bldr.addSelect(t1.trd_ptn_typ);
			sloDL_bldr.addSelect(t1.slo_dt);
			sloDL_bldr.addSelect(t1.sls_dpt_cd);
			dbSelectKey("MSBBL6220_MST_SLO_D_S05", sloDL, sloDL_bldr, upd04DtlList);
			return sloDL;
		}

		/**
		 * 受払予定サービスを実行する
		 */
		protected void updIOSchd() {
			//実行を行う
			if (opeDel.up0().size() > 0) {
				opeDel.exec();
			}
			if (opeIns.up0().size() > 0) {
				opeIns.exec();
			}
		}

		/**
		 * 出荷予定の更新、分割
		 */
		protected void updAddShipSchd(MCList<Sls_Schd_Upd04_DtlR> upd04DtlList) {
			_shipSchdL = MCList.create(ShipSchd_DtlR.class);
			//上り電文.受注明細NOでグループする。グループした結果を一時変数（受注明細NOリスト）に保存する。
			String[] gCols = new String[] {
					MST_SLO_D_R.$slo_d_no
			};
			MCGroupByPolicy gp = new MCGroupByPolicy(gCols);
			MCList<Sls_Schd_Upd04_DtlR> sloDL = upd04DtlList.groupBy(gp);

			//一時変数（受注明細NOリスト）に対しループする。
			int iCnt = 0;
			for (Sls_Schd_Upd04_DtlR sloRow : sloDL) {

				//受注明細ＮＯを元に、出荷予定から、売上予定と関連してないレコードを抽出する。
				MCList<MST_SHIP_SCHD_R> shipSchdL = MCList.create(MST_SHIP_SCHD_R.class);
				MST_SHIP_SCHD_R shipSchdL_t = MST_SHIP_SCHD_R.create("T");
				MCQueryApiBuilder shipSchdL_bldr = MCQueryApiBuilder.create(shipSchdL_t);//出荷予定データの変数
				MST_SHIP_PR_R t1 = MST_SHIP_PR_R.create("T1");
				MST_SLS_SCHD_R S1T2 = MST_SLS_SCHD_R.create("T2");
				shipSchdL_bldr.addInnerJoin(t1, bracket( shipSchdL_t.ship_pr_no.eq(t1.ship_pr_no)));
				shipSchdL_bldr.setWhere(
						notExists(subQuery().select(S1T2.ship_schd_no).from(S1T2)
								.where(shipSchdL_t.ship_schd_no.eq(S1T2.ship_schd_no))));
				shipSchdL_bldr.addWhereWithAnd(t1.slo_d_no.eq(bind("1")), sloRow.slo_d_no());
				shipSchdL_bldr.setOrderByAsc(shipSchdL_t.ship_schd_no);
				dbSelect("MSBBL6220_MST_SHIP_SCHD_S05", shipSchdL, shipSchdL_bldr);

				//検索条件：　T1.出荷予定ＮＯ IS NULL　AND T1.受注明細ＮＯ＝一時変数（受注明細NOリスト）.受注明細ＮＯ
				MCList<MST_SLS_SCHD_R> slsSchdList = MCList.create(MST_SLS_SCHD_R.class);
				MST_SLS_SCHD_R slsSchdList_t = MST_SLS_SCHD_R.create("T");
				MCQueryApiBuilder slsSchdList_bldr = MCQueryApiBuilder.create(slsSchdList_t);
				slsSchdList_bldr.setWhere(slsSchdList_t.slo_d_no.eq(bind("1")), sloRow.slo_d_no());
				slsSchdList_bldr.addWhereWithAnd(slsSchdList_t.ship_schd_no.isNull());
				slsSchdList_bldr.addWhereWithAnd(slsSchdList_t.sls_schd_src_typ.neq(bind("1")),
						MSC_SLS_SCHD_SRC_TYP.SLO_D.value());
				slsSchdList_bldr.setOrderByAsc(slsSchdList_t.sls_schd_no);

				//売上予定から、出荷予定ＮＯが未設定のレコードを抽出する。		
				dbSelect("MSBBL6220_MST_SLS_SCHD_S28", slsSchdList, slsSchdList_bldr);
				
				for (MST_SLS_SCHD_R slsSchdR : slsSchdList) {
					iCnt++;
					//上記の検索結果がある場合
					if (!shipSchdL.isEmpty()) {
						MST_SHIP_SCHD_R shipSchdR = shipSchdL.get(0);
						//①売上予定の出荷予定ＮＯを検索した出荷予定.出荷予定ＮＯで更新する。
						slsSchdR.ship_schd_no(shipSchdR.ship_schd_no());
						MCQueryApiBuilder slsSchdR_bldr = MCQueryApiBuilder.create(MST_SLS_SCHD_R.create("T"));
						slsSchdR_bldr.setSet(slsSchdR.ship_schd_no);
						dbUpdateKey("MSBBL6220_MST_SLS_SCHD_U14", slsSchdR, slsSchdR_bldr);
						//②売上予定.出荷予定ＮＯに対応する出荷予定テーブルを更新する。
						updShipSchd(slsSchdR, iCnt);
						shipSchdL.remove(0);
					}
					else {
						//受注明細ＮＯを元に、出荷予定から下記の条件で再検索するする。
						MCList<MST_SHIP_SCHD_R> shipSdL = MCList.create(MST_SHIP_SCHD_R.class);
						MST_SHIP_SCHD_R shipSdR = MST_SHIP_SCHD_R.create();
						MST_SHIP_SCHD_R shipSdL_t = MST_SHIP_SCHD_R.create("T");
						MCQueryApiBuilder shipSdL_bldr = MCQueryApiBuilder.create(shipSdL_t);
						MST_SHIP_PR_R shipSdL_t1 = MST_SHIP_PR_R.create("T1");
						shipSdL_bldr.addInnerJoin(shipSdL_t1, bracket( shipSdL_t.ship_pr_no.eq(shipSdL_t1.ship_pr_no)));
						shipSdL_bldr.setWhere(shipSdL_t1.slo_d_no.eq(bind("1")), sloRow.slo_d_no());
						dbSelect("MSBBL6220_MST_SHIP_SCHD_S06", shipSdL, shipSdL_bldr);
						if (!shipSdL.isEmpty()) {
							shipSdR = shipSdL.get(0);
						}

						//②売上予定.出荷予定ＮＯに対応する出荷予定テーブルを新規作成する。
						slsSchdR.setNumberNE("peg_no", iCnt);
						crtShipSchd(slsSchdR, shipSdR);
						Sls_Schd_Upd04_DtlR upd04DtlRow = upd04DtlList.getFirst(Sls_Schd_Upd04_DtlR.$sls_schd_no, slsSchdR.sls_schd_no());
						if (!isNull(upd04DtlRow)) {
							setDlvTDlv(upd04DtlRow, iCnt);
						}
						_slsSchdUpdL.add(slsSchdR);
						//売上予定の出荷予定ＮＯを発番された出荷予定ＮＯで更新する。
						//出荷予定サービス実行後、一括更新
					}
					
					MST_SLO_D_R mstSloDR = _sloDL.getFirst(_idxkeySloD, slsSchdR.slo_d_no(), null);
					MAM_ITM_R itmR = _cacheItm.get(mstSloDR.itm_cd(), mstSloDR.itm_sub1(), mstSloDR.itm_sub2(), mstSloDR.itm_sub3());

					if (hasIoSchd(slsSchdR)) {
						delIOSchd(slsSchdR);
					}

					if (MAC_STK_MNG_TYP.isMNG(itmR.stk_mng_typ()) && !slsSchdR.abort_flg()) {
						updIOSchd(slsSchdR, mstSloDR);
					}
				}
			}
		}

		/**
		 * 受払予定の削除の上り電文を作成
		 * @param slsSchdR 売上予定レコード
		 */
		protected void delIOSchd(MST_SLS_SCHD_R slsSchdR) {
			
			//電文項目編集(売上)
			MSW_IO_SCHD_DEL_R cndR = MSW_IO_SCHD_DEL_R.create();
			cndR.io_schd_typ(MSC_IO_SCHD_TYP.SLS.value());
			cndR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.DDLV_SLO.value());
			cndR.io_schd_no(slsSchdR.sls_schd_no());
			cndR.io_schd_seq(null);
			
			opeDel.up0().add(cndR);
			
			cndR = MSW_IO_SCHD_DEL_R.create();
			//電文項目編集（売上（他勘定））
			cndR.io_schd_typ(MSC_IO_SCHD_TYP.SLS_ACXFR.value());
			cndR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.DDLV_SLO.value());
			cndR.io_schd_no(slsSchdR.sls_schd_no());
			cndR.io_schd_seq(null);
			
			opeDel.up0().add(cndR);
		}

		protected boolean hasIoSchd(MST_SLS_SCHD_R slsSchdR) {
			MCList<MST_IO_SCHD_R> ioSchdL = MCList.create(MST_IO_SCHD_R.class);
			MST_IO_SCHD_R t = MST_IO_SCHD_R.create("T");
			MCQueryApiBuilder ioSchdL_bldr = MCQueryApiBuilder.create(t);
			ioSchdL_bldr.setSelect(t.slip_schd_no);
			
			ioSchdL_bldr.setWhere(t.io_schd_sts_typ.eq(bind("1")), MSC_IO_SCHD_STS_TYP.DDLV_SLO.value());
			ioSchdL_bldr.addWhereWithAnd(t.io_schd_no.eq(bind("1")), slsSchdR.sls_schd_no());
			int i = dbSelect("MSBBL6220_MST_IO_SCHD_S01", ioSchdL, ioSchdL_bldr);
			if (i > 0) {
				return true;
			}
			else {
				return false;
			}
		}

		/**
		 * 受払予定の更新の上り電文を作成 
		 * @param slsSchdR 売上予定レコード
		 * @param mstSloDR　受注明細レコード
		 */
		protected void updIOSchd(MST_SLS_SCHD_R slsSchdR, MST_SLO_D_R mstSloDR) {
			//受払予定サービスの上り電文のROW
			IoSchd_Ins01_DtlR ioR = IoSchd_Ins01_DtlR.create();
			//電文項目編集
			copy(ioR, mstSloDR, createMap_IoSchd_Ins01_DtlR_MST_SLO_D_R());
			ioR.io_schd_no(slsSchdR.sls_schd_no()); //受払予定ＮＯ
			ioR.schd_dt(slsSchdR.sls_schd_dt()); //予定日付
			ioR.accpt_schd_dt(slsSchdR.sls_schd_dt()); //検収予定日
			ioR.lot_no(slsSchdR.lot_no()); //ロットＮＯ
			ioR.sublot_no(slsSchdR.sublot_no()); //サブロットＮＯ
			ioR.trd_unit_cd(slsSchdR.trd_unit_cd()); //取引単位ＣＤ
			ioR.trd_unit_qty(slsSchdR.trd_unit_qty()); //取引単位数量
			ioR.base_unit_cd(slsSchdR.base_unit_cd()); //基準単位ＣＤ
			ioR.base_unit_qty(slsSchdR.base_unit_qty()); //基準単位数量
			//場所CDの設定
			if (MAC_SLO_PROC_TYP.isPURC_DDLV(mstSloDR.proc_typ())) {
				ioR.loc_cd(MSUCL_SlsUtil.getMidLocCd(mstSloDR.getStringNE("sls_dpt_cd"),
						mstSloDR.getDate("slo_dt")));
			}
			opeIns.up0().add(ioR);
		}
		
		/**
		 * 受払予定の更新の上り電文を作成 （ＷＧ間依頼の状態に戻す）
		 * 
		 * @param slsSchdR 売上予定レコード
		 * @param mstSloDR　受注明細レコード
		 * @param wgRqstR　ＷＧ間依頼レコード
		 */
		protected void updIOSchd(MST_SLS_SCHD_R slsSchdR, MST_SLO_D_R mstSloDR, MST_WG_RQST_R wgRqstR) {
			//受払予定サービスの上り電文のROW
			IoSchd_Ins01_DtlR ioR = IoSchd_Ins01_DtlR.create();
			//電文項目編集
			copy(ioR, mstSloDR, createMap_IoSchd_Ins01_DtlR_MST_SLO_D_R());
			// 発注予定を取消してＷＧ間依頼の状態に戻すため、
			// ＷＧ間依頼にある項目はＷＧ間依頼の値で上書きする
			copy(ioR, wgRqstR, createMap_IoSchd_Ins01_DtlR_MST_WG_RQST_R());
			
			ioR.io_schd_no(slsSchdR.sls_schd_no()); //受払予定ＮＯ
			ioR.schd_dt(slsSchdR.sls_schd_dt()); //予定日付
			ioR.accpt_schd_dt(slsSchdR.sls_schd_dt()); //検収予定日
			ioR.lot_no(slsSchdR.lot_no()); //ロットＮＯ
			ioR.sublot_no(slsSchdR.sublot_no()); //サブロットＮＯ
			ioR.trd_unit_cd(slsSchdR.trd_unit_cd()); //取引単位ＣＤ
			ioR.trd_unit_qty(slsSchdR.trd_unit_qty()); //取引単位数量
			ioR.base_unit_cd(slsSchdR.base_unit_cd()); //基準単位ＣＤ
			ioR.base_unit_qty(slsSchdR.base_unit_qty()); //基準単位数量
			//場所CDの設定
			if (MAC_SLO_PROC_TYP.isPURC_DDLV(mstSloDR.proc_typ())) {
				ioR.loc_cd(MSUCL_SlsUtil.getMidLocCd(mstSloDR.getStringNE("sls_dpt_cd"),
						mstSloDR.getDate("slo_dt")));
			}
			opeIns.up0().add(ioR);
		}

		/**
		 *上り電文.データ更新区分　＝　更新,上り電文.売上予定作成元区分　＝　仕入予定の場合
		 * 打切りの場合の売上予定の作成
		 * @param dest  売上予定レコード
		 * @param src　上り電文レコード
		 * @param purcSchdR　仕入予定レコード
		 */
		protected void crtAbrSlsSchdByPurcSchd(MST_SLS_SCHD_R dest,
				Sls_Schd_Upd04_DtlR src, MST_PURC_SCHD_R purcSchdR) {
			dest.sls_schd_no(getStrSeq(MSC_NUM_SYS_TYP.SLSSCHD)); //売上予定ＮＯ: 定数.発番システム区分.売上予定NOにより発番
			dest.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.PURC_SCHD.value());//売上予定作成元区分
			//一部打切の場合、出荷予定ＮＯ　＝NULL
			if (purcSchdR.base_unit_schd_qty().gt(purcSchdR.base_unit_abort_qty())) {
				dest.ship_schd_no(null); //出荷予定ＮＯ
			}
			dest.po_schd_no(src.po_schd_no()); //発注予定NO
			dest.purc_schd_no(src.purc_schd_no()); //仕入予定ＮＯ
			dest.sls_schd_dt(src.sls_schd_dt()); //売上予定日
			//基準単位数の算出
			MCNumber baseUnitQty = purcSchdR.base_unit_abort_qty();
			dest.base_unit_cd(purcSchdR.base_unit_cd()); //基準単位ＣＤ
			dest.base_unit_qty(baseUnitQty); //基準単位数

			//取引単位CD、取引単位数量の換算が必要。	
			MST_SLO_D_R sloDR = MST_SLO_D_R.create("T");
			dbSelectKey("MSBBL6220_MST_SLO_D_S06", sloDR, MCQueryApiBuilder.create(sloDR), src);
			//上り電文.取引単位CDは出荷予定.取引単位CDと異なる場合、取引単位CD、取引単位数量の換算が必要。
			MCNumber trdUnitQty = cnvBaseToTrdUnitQty2(sloDR.itm_cd(), sloDR.itm_sub1(),
					sloDR.itm_sub2(), sloDR.itm_sub3(), baseUnitQty, sloDR.trd_unit_cd());
			MCNumber toBaseUnitQty = cnvTrdToBaseUnitQty(sloDR.itm_cd(), sloDR.itm_sub1(),
					sloDR.itm_sub2(), sloDR.itm_sub3(), trdUnitQty, sloDR.trd_unit_cd());
			if (!isSame(baseUnitQty, toBaseUnitQty)) {
				//換算時に、端数が発生と見なす、換算不可になり。基準単位で設定
				dest.trd_unit_cd(dest.base_unit_cd());
				dest.trd_unit_qty(dest.base_unit_qty());
			}
			else {
				//換算時に端数が発生しない場合、売上予定.取引単位CDに出荷予定.取引単位CDで設定し、売上予定.取引単位数に換算結果値で設定する。	
				dest.trd_unit_cd(sloDR.trd_unit_cd());
				dest.trd_unit_qty(trdUnitQty);
			}

			dest.lot_no(src.lot_no()); //ロットＮＯ
			dest.sublot_no(src.sublot_no()); //サブロットＮＯ
			dest.cmpl_flg(true);//完了ＦＬＧ
			dest.abort_flg(true); //打切ＦＬＧ
			dest.sls_ac_abl_flg(false); //売上計上可能ＦＬＧ
			dest.base_unit_abort_qty(baseUnitQty);
			dest.base_unit_sls_qty(0); //基準単位売上数量	
		}

		/**
		 * 上り電文.データ更新区分　＝　更新,上り電文.売上予定作成元区分　＝　仕入予定の場合
		 * 上り電文の情報を元に、ロック時に取得された売上予定に対し、項目値を編集する。
		 * @param dest 売上予定レコード
		 * @param src　上り電文レコード
		 */
		protected void editSlsSchdByPurcSchd(MST_SLS_SCHD_R dest, Sls_Schd_Upd04_DtlR src,
					MST_PURC_SCHD_R purcSchdR, MST_SLO_D_R sloDR) {
			dest.sls_schd_no(getStrSeq(MSC_NUM_SYS_TYP.SLSSCHD)); //売上予定ＮＯ: 定数.発番システム区分.売上予定NOにより発番
			dest.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.PURC_SCHD.value());//売上予定作成元区分
			dest.po_schd_no(src.po_schd_no()); //発注予定NO
			dest.purc_schd_no(src.purc_schd_no()); //仕入予定ＮＯ
			dest.sls_schd_dt(src.sls_schd_dt()); //売上予定日
			//基準単位数の算出
			MCNumber baseUnitQty = getNotSlsQty(purcSchdR);
			dest.base_unit_cd(purcSchdR.base_unit_cd()); //基準単位ＣＤ
			dest.base_unit_qty(baseUnitQty); //基準単位数

			//取引単位CD、取引単位数量の換算が必要。	

			//上り電文.取引単位CDは出荷予定.取引単位CDと異なる場合、取引単位CD、取引単位数量の換算が必要。		
			MCNumber trdUnitQty = cnvBaseToTrdUnitQty2(sloDR.itm_cd(), sloDR.itm_sub1(),
					sloDR.itm_sub2(), sloDR.itm_sub3(), baseUnitQty, sloDR.trd_unit_cd());
			MCNumber toBaseUnitQty = cnvTrdToBaseUnitQty(sloDR.itm_cd(), sloDR.itm_sub1(),
					sloDR.itm_sub2(), sloDR.itm_sub3(), trdUnitQty, sloDR.trd_unit_cd());
			if (!isSame(baseUnitQty, toBaseUnitQty)) {
				//換算時に、端数が発生と見なす、換算不可になり。		
				dest.trd_unit_cd(dest.base_unit_cd());
				dest.trd_unit_qty(dest.base_unit_qty());
			}
			else {
				//換算時に端数が発生しない場合、売上予定.取引単位CDに出荷予定.取引単位CDで設定し、売上予定.取引単位数に換算結果値で設定する。	
				dest.trd_unit_cd(sloDR.trd_unit_cd());
				dest.trd_unit_qty(trdUnitQty);
			}

			dest.lot_no(src.lot_no()); //ロットＮＯ
			dest.sublot_no(src.sublot_no()); //サブロットＮＯ
			dest.cmpl_flg(false);//完了ＦＬＧ
			dest.abort_flg(false); //打切ＦＬＧ
			setSlsAcAblFlg(sloDR, dest);
			dest.base_unit_abort_qty(0);
			dest.base_unit_sls_qty(0); //基準単位売上数量	
		}

		/**
		 * 上り電文.データ更新区分　＝　更新,上り電文.売上予定作成元区分　＝　WG間依頼の場合
		 * 上り電文の情報を元に、ロック時に取得された売上予定に対し、項目値を編集する。
		 * @param dest 売上予定レコード
		 * @param src　上り電文レコード
		 */
		protected void editSlsSchd(MST_SLS_SCHD_R dest, Sls_Schd_Upd04_DtlR src) {
			dest.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.WG_RQST.value());//売上予定作成元区分
			dest.slo_d_no(src.slo_d_no()); //受注明細NO
			dest.ship_schd_no(src.ship_schd_no()); //出荷予定ＮＯ
			dest.wg_rqst_no(src.wg_rqst_no()); //WG間依頼ＮＯ
			dest.sls_schd_dt(src.sls_schd_dt()); //売上予定日
			dest.trd_unit_cd(src.trd_unit_cd()); //取引単位ＣＤ
			dest.trd_unit_qty(src.trd_unit_qty()); //取引単位数量
			dest.base_unit_cd(src.base_unit_cd()); //基準単位ＣＤ
			dest.base_unit_qty(src.base_unit_qty()); //基準単位数
			dest.lot_no(null); //ロットＮＯ
			dest.sublot_no(null); //サブロットＮＯ
			if (src.abort_flg()) {
				dest.cmpl_flg(true);//完了ＦＬＧ
			}
			else if (src.base_unit_qty().lte(dest.base_unit_sls_qty())) {
				dest.cmpl_flg(true);//完了ＦＬＧ
			}
			else {
				dest.cmpl_flg(false);//完了ＦＬＧ
			}
			dest.abort_flg(src.abort_flg()); //打切ＦＬＧ
			dest.sls_ac_abl_flg(false); //売上計上可能ＦＬＧ
			if (src.abort_flg()) {
				dest.base_unit_abort_qty(
						src.base_unit_qty().subtract(dest.base_unit_sls_qty())); //基準単位打切数量
			}
			else {
				dest.base_unit_abort_qty(0);
			}
		}

		/**
		 * 上り電文.データ更新区分　＝　更新,上り電文.売上予定作成元区分　＝　発注予定の場合
		 * 上り電文の情報を元に、ロック時に取得された売上予定に対し、項目値を編集する。
		 * @param dest 売上予定レコード
		 * @param src　上り電文レコード
		 */
		protected void editSlsSchdByPoSchd(MST_SLS_SCHD_R dest, Sls_Schd_Upd04_DtlR src) {
			dest.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.PO_SCHD.value());//売上予定作成元区分
			dest.slo_d_no(src.slo_d_no()); //受注明細NO
			dest.wg_rqst_no(src.wg_rqst_no()); //WG間依頼ＮＯ
			dest.po_schd_no(src.po_schd_no()); //発注予定NO
			dest.sls_schd_dt(src.sls_schd_dt()); //売上予定日
			dest.trd_unit_cd(src.trd_unit_cd()); //取引単位ＣＤ
			dest.trd_unit_qty(src.trd_unit_qty()); //取引単位数量
			dest.base_unit_cd(src.base_unit_cd()); //基準単位ＣＤ
			dest.base_unit_qty(src.base_unit_qty()); //基準単位数
			dest.lot_no(null); //ロットＮＯ
			dest.sublot_no(null); //サブロットＮＯ
			if (src.abort_flg()) {
				dest.cmpl_flg(true);//完了ＦＬＧ
			}
			else if (src.base_unit_qty().lte(dest.base_unit_sls_qty())) {
				dest.cmpl_flg(true);//完了ＦＬＧ
			}
			else {
				dest.cmpl_flg(false);//完了ＦＬＧ
			}
			dest.abort_flg(src.abort_flg()); //打切ＦＬＧ
			dest.sls_ac_abl_flg(false); //売上計上可能ＦＬＧ
			if (src.abort_flg()) {
				dest.base_unit_abort_qty(
						src.base_unit_qty().subtract(dest.base_unit_sls_qty())); //基準単位打切数量
			}
			else {
				dest.base_unit_abort_qty(0);
			}
		}

		/**
		 * 取得されたWG間依頼情報を元に、売上予定を新規作成。
		 * 
		 * @param wgRqstR　ＷＧ間依頼
		 * @return　売上予定レコード
		 */
		protected MST_SLS_SCHD_R crtSlsSchdByWgReqt(MST_WG_RQST_R wgRqstR) {
			
			//売上予定新規行
			MST_SLS_SCHD_R newSlsSchdR = MST_SLS_SCHD_R.create("T");
			//取得されたWG間依頼情報を元に、売上予定を新規作成。
			copy(newSlsSchdR, wgRqstR, createMap_MST_SLS_SCHD_R_MST_WG_RQST_R());
			//売上予定.出荷予定ＮＯの設定:受注明細NOを元に出荷予定.出荷予定NOを取得する。（この場合、受注明細に対応する出荷予定は１件のみ存在する）
			MST_SHIP_PR_R t1 = MST_SHIP_PR_R.create("T1");
			MST_SHIP_SCHD_R shipSchdR = MST_SHIP_SCHD_R.create("T");
			MCQueryApiBuilder shipSchdR_bldr = MCQueryApiBuilder.create(shipSchdR);
			shipSchdR_bldr.addInnerJoin(t1, bracket( shipSchdR.ship_pr_no.eq(t1.ship_pr_no)));
			shipSchdR_bldr.setWhere(t1.slo_d_no.eq(bind("1")), wgRqstR.slo_d_no());
			dbSelect("MSBBL6220_MST_SHIP_SCHD_S07", shipSchdR, shipSchdR_bldr);
			newSlsSchdR.ship_schd_no(shipSchdR.ship_schd_no()); //出荷予定ＮＯ
			newSlsSchdR.sls_schd_dt(getSlsSchdDt(newSlsSchdR.slo_d_no(), null));
			MCQueryApiBuilder newSlsSchdR_bldr = MCQueryApiBuilder.create(newSlsSchdR);
			dbInsert("MSBBL6220_MST_SLS_SCHD_I10", newSlsSchdR, newSlsSchdR_bldr);
			return newSlsSchdR;
		}

		/**
		 * 上り電文の発注予定ＮＯをもとに、発注予定情報を取得し、取得された発注予定情報を元に、売上予定を新規作成。
		 * @param upd04DtlRow　上り電文レコード
		 * @return　売上予定レコード
		 */
		protected MST_SLS_SCHD_R crtSlsSchdByPoSchd(Sls_Schd_Upd04_DtlR upd04DtlRow) {
			MST_PO_SCHD_R poSchdR = MST_PO_SCHD_R.create("T");
			MCQueryApiBuilder poSchdR_bldr = MCQueryApiBuilder.create(poSchdR);
			MST_WG_RQST_R t1 = MST_WG_RQST_R.create("T1");
			//上り電文の発注予定ＮＯをもとに、発注予定情報を取得
			poSchdR_bldr.addLeftOuterJoin(t1, bracket(poSchdR.slo_d_no.eq(t1.slo_d_no)
												.and(t1.can_flg.eq(value(false)))
												.and(t1.wg_rqst_typ.eq(value(MSC_WG_RQST_TYP.PURC.value())))));
			poSchdR_bldr.addSelect(t1.wg_rqst_no);
			dbSelectKey("MSBBL6220_MST_PO_SCHD_S01", poSchdR, poSchdR_bldr, upd04DtlRow);
			//売上予定新規行
			MST_SLS_SCHD_R newSlsSchdR = MST_SLS_SCHD_R.create("T");
			//取得されたWG間依頼情報を元に、売上予定を新規作成。
			copy(newSlsSchdR, poSchdR, createMap_MST_SLS_SCHD_R_MST_PO_SCHD_R());
			newSlsSchdR.sls_schd_dt(getSlsSchdDt(newSlsSchdR.slo_d_no(), null));
			dbInsert("MSBBL6220_MST_SLS_SCHD_I11", newSlsSchdR, MCQueryApiBuilder.create(newSlsSchdR));
			return newSlsSchdR;
		}

		/**
		 * 売上予定.出荷予定ＮＯに対応する出荷予定テーブルを更新する。
		 * @param slsSchdR 売上予定レコード
		 */
		protected void updShipSchd(MST_SLS_SCHD_R slsSchdR, int iCnt) {
			MST_SHIP_SCHD_R shipSchdR = MST_SHIP_SCHD_R.create("T");
			//売上予定.出荷予定ＮＯに対応する出荷予定のレコードを取得する
			dbSelectKey("MSBBL6220_MST_SHIP_SCHD_S08", shipSchdR, MCQueryApiBuilder.create(shipSchdR), slsSchdR);
			//更新項目の編集
			shipSchdR.ship_schd_tm(getDlvSchdTm(slsSchdR.slo_d_no(), slsSchdR.purc_schd_no()));
			shipSchdR.dlv_schd_tm(shipSchdR.ship_schd_tm());
			shipSchdR.trd_unit_qty(slsSchdR.trd_unit_qty());//取引単位数量=売上予定.取引単位数量
			shipSchdR.trd_unit_cd(slsSchdR.trd_unit_cd());//取引単位ＣＤ=売上予定.取引単位ＣＤ	
			shipSchdR.base_unit_qty(slsSchdR.base_unit_qty());//基準単位数量=売上予定.基準単位数量	
			shipSchdR.base_unit_cd(slsSchdR.base_unit_cd());//基準単位ＣＤ=売上予定.基準単位ＣＤ	
			shipSchdR.abort_qty(slsSchdR.base_unit_abort_qty());//打切数量=売上予定.打切数量	
			shipSchdR.abort_flg(slsSchdR.abort_flg());//打切ＦＬＧ=売上予定.打切ＦＬＧ
			shipSchdR.cmpl_flg(slsSchdR.cmpl_flg());//完了ＦＬＧ=売上予定.完了ＦＬＧ	
			shipSchdR.setNumberNE("peg_no", iCnt);
			ShipSchd_DtlR schdR = ShipSchd_DtlR.create();
			copy(schdR, shipSchdR, createMap_ShipSchd_DtlR_MST_SHIP_SCHD_R());
			if (!isNull(slsSchdR.iv_d_no())) {
				schdR.iv_chk_skip_flg(true);
			}
			_shipSchdL.add(schdR);
		}
		
		/**
		 * 出荷予定の納品先、配送先情報を設定する。
		 * @param upd04DtlRow 上り電文の売上予定
		 * @param iCnt 紐付けＮＯ
		 */
		protected void setDlvTDlv(Sls_Schd_Upd04_DtlR upd04DtlRow, int iCnt) {
			
			ShipSchd_DtlR schdR = _shipSchdL.getFirst("peg_no", MCNumber.valueOf(iCnt));
			if (!isNull(schdR)) {
				schdR.dlv_upd_flg(true);
				schdR.dlv_cd(upd04DtlRow.dlv_cd());
				schdR.dlv_sundry_flg(upd04DtlRow.dlv_sundry_flg());
				schdR.dlv_nm(upd04DtlRow.dlv_nm());
				schdR.dlv_cntct_dpt(upd04DtlRow.dlv_cntct_dpt());
				schdR.dlv_cntct_psn(upd04DtlRow.dlv_cntct_psn());
				schdR.dlv_zip_cd(upd04DtlRow.dlv_zip_cd());
				schdR.dlv_addr1(upd04DtlRow.dlv_addr1());
				schdR.dlv_addr2(upd04DtlRow.dlv_addr2());
				schdR.dlv_addr3(upd04DtlRow.dlv_addr3());
				schdR.dlv_addr4(upd04DtlRow.dlv_addr4());
				schdR.dlv_tel(upd04DtlRow.dlv_tel());
				schdR.dlv_fax(upd04DtlRow.dlv_fax());
				schdR.dlv_lg_grp_cd(upd04DtlRow.dlv_lg_grp_cd());
				schdR.pri_prnt_flg(upd04DtlRow.pri_prnt_flg());
				schdR.tdlv_cd(upd04DtlRow.tdlv_cd());
				schdR.tdlv_sundry_flg(upd04DtlRow.tdlv_sundry_flg());
				schdR.tdlv_nm(upd04DtlRow.tdlv_nm());
				schdR.tdlv_cntct_dpt(upd04DtlRow.tdlv_cntct_dpt());
				schdR.tdlv_cntct_psn(upd04DtlRow.tdlv_cntct_psn());
				schdR.tdlv_zip_cd(upd04DtlRow.tdlv_zip_cd());
				schdR.tdlv_addr1(upd04DtlRow.tdlv_addr1());
				schdR.tdlv_addr2(upd04DtlRow.tdlv_addr2());
				schdR.tdlv_addr3(upd04DtlRow.tdlv_addr3());
				schdR.tdlv_addr4(upd04DtlRow.tdlv_addr4());
				schdR.tdlv_tel(upd04DtlRow.tdlv_tel());
				schdR.tdlv_fax(upd04DtlRow.tdlv_fax());
				schdR.tdlv_lg_grp_cd(upd04DtlRow.tdlv_lg_grp_cd());
			}
		}
		
		protected void delShipSchd(MST_SLS_SCHD_R slsSchdR, int iCnt) {
			//ロックした売上予定.出荷予定NOを削除のキーで出荷予定テーブルからレコードを削除する。
			MST_SHIP_SCHD_R shipSchdR = MST_SHIP_SCHD_R.create("T");
			dbSelectKey("MSBBL6220_MST_SHIP_SCHD_S09", shipSchdR, MCQueryApiBuilder.create(shipSchdR), slsSchdR);
			ShipSchd_DtlR schdR = ShipSchd_DtlR.create();
			schdR.peg_no(iCnt);
			schdR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			schdR.ship_schd_no(shipSchdR.ship_schd_no());
			schdR.ship_pr_no(shipSchdR.ship_pr_no());
			_shipSchdL.add(schdR);
		}

		/**
		 * 売上予定.出荷予定ＮＯに対応する出荷予定レコードを新規作成する。
		 * @param slsSchdR 売上予定レコード
		 */
		protected void crtShipSchd(MST_SLS_SCHD_R slsSchdR, MST_SHIP_SCHD_R shipSchdR) {
			//更新項目の編集
			shipSchdR.ship_schd_tm(getDlvSchdTm(slsSchdR.slo_d_no(), slsSchdR.purc_schd_no()));
			shipSchdR.dlv_schd_tm(shipSchdR.ship_schd_tm());
			shipSchdR.trd_unit_qty(slsSchdR.trd_unit_qty());//取引単位数量=売上予定.取引単位数量
			shipSchdR.trd_unit_cd(slsSchdR.trd_unit_cd());//取引単位ＣＤ=売上予定.取引単位ＣＤ	
			shipSchdR.base_unit_qty(slsSchdR.base_unit_qty());//基準単位数量=売上予定.基準単位数量	
			shipSchdR.base_unit_cd(slsSchdR.base_unit_cd());//基準単位ＣＤ=売上予定.基準単位ＣＤ	
			shipSchdR.abort_qty(slsSchdR.base_unit_abort_qty());//打切数量=売上予定.打切数量	
			shipSchdR.abort_flg(slsSchdR.abort_flg());//打切ＦＬＧ=売上予定.打切ＦＬＧ
			shipSchdR.cmpl_flg(slsSchdR.cmpl_flg());//完了ＦＬＧ=売上予定.完了ＦＬＧ	
			shipSchdR.setNumberNE("peg_no", slsSchdR.getNumberNE("peg_no"));
			ShipSchd_DtlR schdR = ShipSchd_DtlR.create();
			shipSchdR.ship_schd_no(null); //出荷予定ＮＯ
			copy(schdR, shipSchdR, createMap_ShipSchd_DtlR_MST_SHIP_SCHD_R());
			schdR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value()); //データ更新区分:新規
			_shipSchdL.add(schdR);
		}

		/**
		 * 出荷予定サービスを呼び出す。（打切解除の場合のみ） <br>
		 * 出荷予定サービスは、打切と同時に出荷予定情報の変更を同時に行う対応してないため、先に打切解除を行う。
		 */
		protected void callShipSchdServiceForAbort() {
			
			if (isNull(_shipSchdL)) {
				return;
			}
			
			MCList<MST_SHIP_SCHD_R> oldShipSchdL = MCList.create(MST_SHIP_SCHD_R.class);
			MST_SHIP_SCHD_R t = MST_SHIP_SCHD_R.create("T");
			MCQueryApiBuilder oldShipSchdL_bldr = MCQueryApiBuilder.create(t);
			oldShipSchdL_bldr.setSelect(t.ship_schd_no, t.abort_flg);
			dbSelectKey("MSBBL6220_MST_SHIP_SCHD_S10", oldShipSchdL, oldShipSchdL_bldr, _shipSchdL);
			
			MCIndexKey idxkey = oldShipSchdL.createIndex(MST_SHIP_SCHD_R.$ship_schd_no);
			
			MSBEL_ShipSchdService.ShipSchd_Upd02 op = MSBEL_ShipSchdService.crtShipSchd_Upd02();
			MSBEL_ShipSchdService.ShipSchd_Chk02 opChk = MSBEL_ShipSchdService.crtShipSchd_Chk02();
			
			MCList<ShipSchd_DtlR> abortL = MCList.create(ShipSchd_DtlR.class);
			ShipSchd_DtlR abortR = null;
			
			for (ShipSchd_DtlR shipSchdR : _shipSchdL) {
				
				MST_SHIP_SCHD_R oldShipSchdR = oldShipSchdL.getFirst(idxkey, shipSchdR.ship_schd_no());
				
				if (!isNull(oldShipSchdR) && oldShipSchdR.abort_flg() && !shipSchdR.abort_flg() 
						&& (!isSame(shipSchdR.trd_unit_cd(), oldShipSchdR.trd_unit_cd())
								|| !isSame(shipSchdR.trd_unit_qty(), oldShipSchdR.trd_unit_qty())
								|| !isSame(shipSchdR.base_unit_qty(), oldShipSchdR.base_unit_qty())
								|| MAC_DATA_CRUD_TYP.isDEL(shipSchdR.data_crud_typ()))) {
					
					abortR = shipSchdR.clone();
					abortR.trd_unit_cd(oldShipSchdR.trd_unit_cd());
					abortR.trd_unit_qty(oldShipSchdR.trd_unit_qty());
					abortR.base_unit_cd(oldShipSchdR.base_unit_cd());
					abortR.base_unit_qty(oldShipSchdR.base_unit_qty());
					abortR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					
					shipSchdR.dlv_upd_flg(false);
					
					abortL.add(abortR);
				}
			}
			
			if (!abortL.isEmpty()) {
				opChk.up0().addAll(abortL);
				opChk.exec();
				
				op.up1().addAll(abortL);
				op.up0().lot_chk_flg(false);
				op.exec();
			}
		}
		/**
		 * 出荷予定サービスの呼び出し
		 */
		protected void callShipSchdService() {
			callShipSchdServiceForAbort();
			//出荷予定サービス.更新（出荷予定）（MSBEL5500.ShipSchd_Upd02）を実行する。
			MSBEL_ShipSchdService.ShipSchd_Upd02 op = MSBEL_ShipSchdService
					.crtShipSchd_Upd02();
			MSBEL_ShipSchdService.ShipSchd_Chk02 opChk = MSBEL_ShipSchdService
					.crtShipSchd_Chk02();
			if (!_shipSchdL.isEmpty()) {
				opChk.up0().addAll(_shipSchdL);
				opChk.exec();
				
				op.up1().addAll(_shipSchdL);
				op.up0().lot_chk_flg(false);
				op.exec();
				//対応する売上予定を更新する
				if (!_slsSchdUpdL.isEmpty()) {
					MST_SLS_SCHD_R t = MST_SLS_SCHD_R.create("T");
					MCQueryApiBuilder slsSchdR_bldr = MCQueryApiBuilder.create(t);
					for (MST_SLS_SCHD_R slsSchdR : _slsSchdUpdL) {
						String shipSchdNo = op.down0()
								.subList("peg_no", slsSchdR.getNumberNE("peg_no")).get(0)
								.ship_schd_no();
						slsSchdR.ship_schd_no(shipSchdNo);
						slsSchdR_bldr.setSet(t.ship_schd_no);
						dbUpdateKey("MSBBL6220_MST_SLS_SCHD_U15", slsSchdR, slsSchdR_bldr);
					}
				}
			}
		}
	}

	/**
	 * Sls_Schd_Upd05オペレーション.<p>
	 *
	 */
	public class Sls_Schd_Upd05 extends MSBBL_SlsSchdService_MC_A.Sls_Schd_Upd05 {
		/**
		 * インボイス出荷実績マップリスト
		 */
		protected MCList<MST_IV_SHIP_ACT_MAP_R> _ivShipActMapL = null;
		/**
		 * インボイス出荷実績マップリストのインデックス
		 */
		protected MCIndexKey _ivShipActMapIdxKey = null;
		
		/**
		 * インボイス明細リスト
		 */
		protected MCList<MST_IV_D_R> _ivDL = null;
		/**
		 * インボイス明細リストのインデックス
		 */
		protected MCIndexKey _ivDLIvNoIdxKey = null;
		/**
		 * インボイス明細リストのインデックス
		 */
		protected MCIndexKey _ivDLIvDNoIdxKey = null;
		
		/**
		 * 受注明細リスト
		 */
		MCList<MST_SLO_D_R> _sloDL = null;
		/**
		 * 受注明細リストのインデックス
		 */
		protected MCIndexKey _sloDIdxKey = null;
		
		/**
		 * 出荷実績明細リスト
		 */
		protected MCList<MST_SHIP_ACT_D_R> _shipActDL = null;
		/**
		 * 出荷実績明細リストのインデックス
		 */
		protected MCIndexKey _shipActDIdxKey = null;
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			_credAmtL = MCList.create(Cred_Upd01_CndR.class);
			//売上予定更新
			updSlsSchd();
			//与信更新
			updCred();
		}

		/**
		 * 売上予定更新
		 */
		protected void updSlsSchd() {
			//上り電文取得
			MCList<Sls_Schd_Upd05_DtlR> upd05DtlList = up0();
			
			// キャッシュ作成
			createCache(upd05DtlList);
			// 計画外出荷返品の対応
			doShipRetForUplnd();
			
			MCList<MST_SLS_SCHD_R> insSlsSchdL = MCList.create(MST_SLS_SCHD_R.class);
			MCList<MST_SLS_SCHD_R> updSlsSchdL = MCList.create(MST_SLS_SCHD_R.class);
			MST_SLS_SCHD_R updSlsSchdR = null;
			
			//上り電文に対し、繰り返し処理
			for (Sls_Schd_Upd05_DtlR upd05DtlRow : upd05DtlList) {
				if (MSC_SLS_SCHD_SRC_TYP.isSHIP_ACT_D(upd05DtlRow.sls_schd_src_typ()) && upd05DtlRow.sls_ret_flg()) {
					continue;
				}
				//売上予定ロック時に取得したデータを一時変数（ロックした売上予定）に保存する。
				MCList<MST_SLS_SCHD_R> lockedSlsSchdList = MCList.create(MST_SLS_SCHD_R.class);
				MST_SLS_SCHD_R lockedSlsSchdList_t = MST_SLS_SCHD_R.create("T");
				MCQueryApiBuilder lockedSlsSchdList_bldr = MCQueryApiBuilder.create(lockedSlsSchdList_t);

				//売上予定作成元区分＝インボイス登録
				if (MSC_SLS_SCHD_SRC_TYP.isIV_D(upd05DtlRow.sls_schd_src_typ())) {
					if (upd05DtlRow.ship_act_flg()) {
						boolean slsAcAblFlg = isIvShipCmpl(upd05DtlRow.iv_no());
						
						if (!isNull(upd05DtlRow.iv_no())){
							MCList<MST_SLS_SCHD_R> slsSchdL = MCList.create(MST_SLS_SCHD_R.class);
							MST_SLS_SCHD_R slsSchdL_t = MST_SLS_SCHD_R.create("T");
							MCQueryApiBuilder slsSchdL_bldr = MCQueryApiBuilder.create(slsSchdL_t);
							slsSchdL_bldr.setWhere(slsSchdL_t.iv_no.eq(bind("1")), upd05DtlRow.iv_no());
							slsSchdL_bldr.addWhereWithAnd(slsSchdL_t.abort_flg.eq(value(false)));
							dbSelectForUpdate("MSBBL6220_MST_SLS_SCHD_S29", slsSchdL, slsSchdL_bldr);
							slsSchdL.setValue(MST_SLS_SCHD_R.$sls_ac_abl_flg, slsAcAblFlg);
							slsSchdL_bldr.setSet(slsSchdL_t.sls_ac_abl_flg);
							dbUpdateKey("MSBBL6220_MST_SLS_SCHD_U16", slsSchdL, slsSchdL_bldr);
						}
					}
					else {
						//下記の削除条件で、売上予定から、データを検索、ロックする。	
						//受注明細ＮＯ　＝上り電文．受注明細ＮＯ　AND　（インボイス明細ＮＯ IS NULL OR インボイス明細ＮＯ　＝上り電文．インボイス明細ＮＯ）
						if (isNull(upd05DtlRow.slo_d_no())) {
							lockedSlsSchdList_bldr.setWhere(lockedSlsSchdList_t.iv_d_no.eq(bind("1")),
									upd05DtlRow.iv_d_no());
						}
						else {
							lockedSlsSchdList_bldr.setWhere(lockedSlsSchdList_t.slo_d_no.eq(bind("1")),
									upd05DtlRow.slo_d_no());
							lockedSlsSchdList_bldr.addWhereWithAnd(
											bracket(lockedSlsSchdList_t.iv_d_no.isNull()
													.or(lockedSlsSchdList_t.iv_d_no.eq(bind("1")))),
											upd05DtlRow.iv_d_no());
						}
						if (upd05DtlRow.uplnd_flg()) {
							lockedSlsSchdList_bldr.setWhere(lockedSlsSchdList_t.dlv_slip_d_no.eq(bind("1")).and(lockedSlsSchdList_t.abort_flg.eq(value(false))), upd05DtlRow.dlv_slip_d_no());
							if (MAC_DATA_CRUD_TYP.isCRT(upd05DtlRow.data_crud_typ())) {
								// 新規登録の場合、納品書明細NOで売上予定をロックする。
								lockedSlsSchdList_bldr.addWhereWithAnd(lockedSlsSchdList_t.iv_d_no.isNull());
							}
							else if (MAC_DATA_CRUD_TYP.isUPD(upd05DtlRow.data_crud_typ())
									|| MAC_DATA_CRUD_TYP.isDEL(upd05DtlRow.data_crud_typ())) {
								lockedSlsSchdList_bldr.addWhereWithAnd(bracket(lockedSlsSchdList_t.iv_d_no.isNull()
										.or(lockedSlsSchdList_t.iv_d_no.eq(bind("1")))), upd05DtlRow.iv_d_no());
							}
						}
						dbSelectForUpdate("MSBBL6220_MST_SLS_SCHD_S30", lockedSlsSchdList, lockedSlsSchdList_bldr);
						//ロックしたレコードを削除する。	
						dbDeleteKey("MSBBL6220_MST_SLS_SCHD_D13", lockedSlsSchdList, lockedSlsSchdList_bldr);

						//インボイス明細に対する売上予定の更新,上り電文.データ更新区分が新規、更新の場合はのみ作成対象。
						MST_IV_D_R ivDR = _ivDL.getFirst(_ivDLIvDNoIdxKey, upd05DtlRow.iv_d_no());
						//上り電文.データ更新区分＝新規、更新の場合、上り電文の情報を元に売上予定を新規作成する。
						if (MAC_DATA_CRUD_TYP.isCRT(upd05DtlRow.data_crud_typ())
								|| MAC_DATA_CRUD_TYP.isUPD(upd05DtlRow.data_crud_typ())) {
							MST_SLS_SCHD_R newSlsSchdR = MST_SLS_SCHD_R.create("T");
							//項目の編集を行う。
							copy(newSlsSchdR, upd05DtlRow, createMap_MST_SLS_SCHD_R_Sls_Schd_Upd05_DtlR());
							MST_SLS_SCHD_R srcSlsSchdR = null;
							if (upd05DtlRow.uplnd_flg()) {
								if (MAC_DATA_CRUD_TYP.isCRT(upd05DtlRow.data_crud_typ())) {
									srcSlsSchdR = lockedSlsSchdList.subList(r->isNull(r.iv_d_no())).get(0);
								}
								else {
									srcSlsSchdR = lockedSlsSchdList.subList(r->!isNull(r.iv_d_no())).get(0);
								}
							}
							else if (upd05DtlRow.manual_add_flg()  
									&& MAC_DATA_CRUD_TYP.isUPD(upd05DtlRow.data_crud_typ())
									&& MSC_IV_SRC_TYP.isSLS(ivDR.getStringNE(MST_IV_R.$iv_src_typ))) {
								srcSlsSchdR = lockedSlsSchdList.get(0);
							}
							if ((MAC_DATA_CRUD_TYP.isUPD(upd05DtlRow.data_crud_typ()) 
									&& (upd05DtlRow.uplnd_flg() || (upd05DtlRow.manual_add_flg() && MSC_IV_SRC_TYP.isSLS(ivDR.getStringNE(MST_IV_R.$iv_src_typ)))))
									|| (MAC_DATA_CRUD_TYP.isCRT(upd05DtlRow.data_crud_typ()) && upd05DtlRow.uplnd_flg() && newSlsSchdR.base_unit_qty().eq(srcSlsSchdR.base_unit_qty()))) {
									newSlsSchdR.sls_schd_no(srcSlsSchdR.sls_schd_no());
							}
							else {
								newSlsSchdR.sls_schd_no(getStrSeq(MSC_NUM_SYS_TYP.SLSSCHD));
							}
							if (MAC_DATA_CRUD_TYP.isUPD(upd05DtlRow.data_crud_typ())
									&& MSC_IV_SRC_TYP.isSLS(ivDR.getStringNE(MST_IV_R.$iv_src_typ))) {
								// 計画外売上の場合、売上数量を保持する。
								newSlsSchdR.base_unit_sls_qty(srcSlsSchdR.base_unit_sls_qty());
							}
							newSlsSchdR.sls_ac_abl_flg(isSlsAcAblFlg(upd05DtlRow, ivDR.getString("iv_no")));
							newSlsSchdR.iv_no(ivDR.getString("iv_no")); //インボイスＮＯ	
							if (!lockedSlsSchdList.isEmpty()) {
								newSlsSchdR.wg_rqst_no(lockedSlsSchdList.get(0).wg_rqst_no()); //WG間依頼ＮＯ
							}
							insSlsSchdL.add(newSlsSchdR);
							if (upd05DtlRow.uplnd_flg()) {
								MST_SLS_SCHD_R nonIvSlsSchdR = crtNonIvSlsSchdForUplnd(lockedSlsSchdList, newSlsSchdR, upd05DtlRow);
								if (!isNull(nonIvSlsSchdR)) {
									insSlsSchdL.add(nonIvSlsSchdR);
								}
							}
						}
						else if (MAC_DATA_CRUD_TYP.isDEL(upd05DtlRow.data_crud_typ()) && upd05DtlRow.uplnd_flg()) {
							// .データ更新区分が削除かつ計画外出荷の場合、売上予定を作成する。
							MST_SLS_SCHD_R nonIvSlsSchdR = crtNonIvSlsSchdForUplnd(lockedSlsSchdList, null, upd05DtlRow);
							if (!isNull(nonIvSlsSchdR)) {
								insSlsSchdL.add(nonIvSlsSchdR);
							}
						}
						if (!isNull(upd05DtlRow.slo_d_no())) {
							
							// C.　インボイス未計上分の受注明細に対する売上予定の作成
							crtNonIvSlsSchd(upd05DtlRow, 
									lockedSlsSchdList,
									MSC_SLS_SCHD_SRC_TYP.SLO_D.value(), 
									null);
						}
					}
				}
				//売上予定作成元区分＝輸出実績登録
				if (MSC_SLS_SCHD_SRC_TYP.isEX_ACT(upd05DtlRow.sls_schd_src_typ())) {
					updSlsSchdR = MST_SLS_SCHD_R.create();
					updSlsSchdR.iv_d_no(upd05DtlRow.iv_d_no());
					//項目編集
					if (MAC_DATA_CRUD_TYP.isDEL(upd05DtlRow.data_crud_typ())) {
						MST_IV_D_R ivDR = MST_IV_D_R.create("T");
						MCQueryApiBuilder ivDR_bldr = MCQueryApiBuilder.create(ivDR);
						MST_IV_R t1 = MST_IV_R.create("T1");
						ivDR_bldr.addInnerJoin(t1, bracket( ivDR.iv_mng_no.eq(t1.iv_mng_no)));
						ivDR_bldr.addSelect(t1.trd_schd_dt);
						dbSelectKey("MSBBL6220_MST_IV_D_S05", ivDR, ivDR_bldr, upd05DtlRow);
						updSlsSchdR.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.IV_D.value());//売上予定作成元区分
						updSlsSchdR.sls_schd_dt(ivDR.getDateNE("trd_schd_dt"));//売上予定日
						updSlsSchdR.sls_ac_abl_flg(false);
					}
					else {
						updSlsSchdR.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.EX_ACT.value());//売上予定作成元区分
						updSlsSchdR.sls_schd_dt(upd05DtlRow.sls_schd_dt());//売上予定日
						updSlsSchdR.sls_ac_abl_flg(true);
					}
					
					updSlsSchdL.add(updSlsSchdR);
				}
				//売上予定作成元区分＝出荷返品登録
				if (MSC_SLS_SCHD_SRC_TYP.isSLO_D(upd05DtlRow.sls_schd_src_typ())) {
					
					if (upd05DtlRow.sls_ret_flg()) {
						
						//受注明細データの変数
						MST_SLO_D_R mstSloDR = _sloDL.getFirst(_sloDIdxKey, upd05DtlRow.slo_d_no());
						if (MAC_DATA_CRUD_TYP.isCRT(upd05DtlRow.data_crud_typ())) {
							MST_SLS_SCHD_R slsSchdR = MST_SLS_SCHD_R.create("T");
							MCQueryApiBuilder slsSchdR_bldr = MCQueryApiBuilder.create(slsSchdR);
							//受注明細NOを元に売上予定情報を取得
							slsSchdR_bldr.setWhere(slsSchdR.slo_d_no.eq(bind("1")), upd05DtlRow.slo_d_no());
							// 一部数量でインボイス登録すると売上予定がインボイス未登録とインボイス登録済に分割されるため、インボイス未登録のレコードのみ取得する
							slsSchdR_bldr.addWhereWithAnd(slsSchdR.iv_d_no.isNull());
							dbSelectForUpdate("MSBBL6220_MST_SLS_SCHD_S31", slsSchdR, slsSchdR_bldr);
							//未返品数（基準単位）の算出
							MCNumber notRetBaseQty = mstSloDR.getNumberNE("ship_pr_base_unit_qty").subtract(
									sum(mstSloDR.getNumberNE(MST_SHIP_PR_R.$ship_schd_abort_qty), 
											mstSloDR.getNumberNE(MST_SHIP_PR_R.$iv_schd_qty), 
											upd05DtlRow.base_unit_qty()));
							//未返品数（基準単位）>0（一部返品された）場合
							if (notRetBaseQty.isPositive()){
								//未返品の数量分の売上予定を作成。
								crtNotRetSloSchdR(slsSchdR, upd05DtlRow, mstSloDR, notRetBaseQty);
							}
							//売上予定を打切る
							setUpdAbortSloShcdR(slsSchdR, slsSchdR_bldr, upd05DtlRow, mstSloDR);
							//与信額の計算:返品のため、与信を減額
							clacCred(mstSloDR, upd05DtlRow.base_unit_qty().multiply(-1));
						}
						if (MAC_DATA_CRUD_TYP.isUPD(upd05DtlRow.data_crud_typ())) {
							MST_SLS_SCHD_R slsSchdR = MST_SLS_SCHD_R.create("T");
							MCQueryApiBuilder slsSchdR_bldr = MCQueryApiBuilder.create(slsSchdR);
							//受注明細NOを元に売上予定情報を取得
							slsSchdR_bldr.setWhere(slsSchdR.slo_d_no.eq(bind("1")), upd05DtlRow.slo_d_no());
							slsSchdR_bldr.addWhereWithAnd(slsSchdR.abort_flg.eq(value(true)));
							slsSchdR_bldr.addWhereWithAnd(slsSchdR.iv_d_no.isNull());
							slsSchdR_bldr.addWhereWithAnd(slsSchdR.cmpl_flg.eq(value(true)));
							dbSelectForUpdate("MSBBL6220_MST_SLS_SCHD_S32", slsSchdR, slsSchdR_bldr);
							MST_SLS_SCHD_R notSlsSchdR = slsSchdR.clone();
							
							//打切った売上予定を更新する
							setUpdAbortSloShcdR(slsSchdR, slsSchdR_bldr, upd05DtlRow, mstSloDR);
							//未返品の数量分の売上予定を作成。
							//未返品数（基準単位）の算出
							MCNumber notRetBaseQty = mstSloDR.getNumberNE("ship_pr_base_unit_qty").subtract(
									sum(mstSloDR.getNumberNE(MST_SHIP_PR_R.$ship_schd_abort_qty),
											mstSloDR.getNumberNE(MST_SHIP_PR_R.$iv_schd_qty),
											upd05DtlRow.base_unit_qty()));
							//未返品数（基準単位）>0（一部返品された）場合
							if (notRetBaseQty.isPositive()){
								updNotRetSloSchdR(notSlsSchdR, upd05DtlRow, mstSloDR, notRetBaseQty);
							}
							//全数返品の場合、
							if (notRetBaseQty.isZero()){
								MST_SLS_SCHD_R notRetSlsSchdR = MST_SLS_SCHD_R.create("T");
								MCQueryApiBuilder notRetSlsSchdR_bldr = MCQueryApiBuilder.create(notRetSlsSchdR);
								//受注明細NOを元に売上予定情報を取得
								notRetSlsSchdR_bldr.setWhere(notRetSlsSchdR.slo_d_no.eq(bind("1")), upd05DtlRow.slo_d_no());
								notRetSlsSchdR_bldr.addWhereWithAnd(notRetSlsSchdR.iv_d_no.isNull());
								notRetSlsSchdR_bldr.addWhereWithAnd(notRetSlsSchdR.cmpl_flg.eq(value(false)));
								int iCnt = dbSelectForUpdate("MSBBL6220_MST_SLS_SCHD_S33", notRetSlsSchdR, notRetSlsSchdR_bldr);
								if (iCnt > 0) {
									dbDeleteKey("MSBBL6220_MST_SLS_SCHD_D14", notRetSlsSchdR, notRetSlsSchdR_bldr);
								}
							}
							// 与信対象数量を算出し、与信対象額を更新する((変更後の返品数量-変更前の返品数量(売上予定数量-出荷返品数量)) * -1)
							clacCred(mstSloDR, upd05DtlRow.base_unit_qty().subtract(
									mstSloDR.getNumberNE(MST_SHIP_PR_R.$sls_schd_abort_qty).subtract(
											mstSloDR.getNumberNE(MST_SHIP_PR_R.$ship_schd_abort_qty))).multiply(-1));
						}
						if (MAC_DATA_CRUD_TYP.isDEL(upd05DtlRow.data_crud_typ())) {
							//未返品の数量分の売上予定を作成。
							MST_SLS_SCHD_R notRetSlsSchdR = MST_SLS_SCHD_R.create("T");
							MCQueryApiBuilder notRetSlsSchdR_bldr = MCQueryApiBuilder.create(notRetSlsSchdR);
							//受注明細NOを元に売上予定情報を取得
							notRetSlsSchdR_bldr.setWhere(notRetSlsSchdR.slo_d_no.eq(bind("1")), upd05DtlRow.slo_d_no());
							notRetSlsSchdR_bldr.addWhereWithAnd(notRetSlsSchdR.cmpl_flg.eq(value(false)));
							notRetSlsSchdR_bldr.addWhereWithAnd(notRetSlsSchdR.iv_d_no.isNull());
							int i = dbSelectForUpdate("MSBBL6220_MST_SLS_SCHD_S34", notRetSlsSchdR, notRetSlsSchdR_bldr);
							
							MST_SLS_SCHD_R slsSchdR = MST_SLS_SCHD_R.create("T");
							MCQueryApiBuilder slsSchdR_bldr = MCQueryApiBuilder.create(slsSchdR);
							//受注明細NOを元に売上予定情報を取得
							slsSchdR_bldr.setWhere(slsSchdR.slo_d_no.eq(bind("1")), upd05DtlRow.slo_d_no());
							slsSchdR_bldr.addWhereWithAnd(slsSchdR.abort_flg.eq(value(true)));
							slsSchdR_bldr.addWhereWithAnd(slsSchdR.iv_d_no.isNull());
							slsSchdR_bldr.addWhereWithAnd(slsSchdR.cmpl_flg.eq(value(true)));
							dbSelectForUpdate("MSBBL6220_MST_SLS_SCHD_S35", slsSchdR, slsSchdR_bldr);
							//与信額の計算:返品取消のため、与信を増額
							//一部返品の削除の場合
							if (i > 0){
								dbDeleteKey("MSBBL6220_MST_SLS_SCHD_D15", slsSchdR, slsSchdR_bldr);
								notRetSlsSchdR_bldr.setSet(notRetSlsSchdR.base_unit_qty);
								notRetSlsSchdR_bldr.addSet(notRetSlsSchdR.trd_unit_qty);
								notRetSlsSchdR_bldr.addSet(notRetSlsSchdR.trd_unit_cd);
								notRetSlsSchdR.base_unit_qty(mstSloDR.getNumberNE("ship_pr_base_unit_qty").subtract(mstSloDR.getNumberNE(MST_SHIP_PR_R.$iv_schd_qty)));
								if (isSame(mstSloDR.trd_unit_cd(), mstSloDR.base_unit_cd())){
									notRetSlsSchdR.trd_unit_qty(notRetSlsSchdR.base_unit_qty());
									notRetSlsSchdR.trd_unit_cd(mstSloDR.trd_unit_cd());
								}
								else{
									MCNumber trdUnitQty = cnvBaseToTrdUnitQty2(mstSloDR.itm_cd(),
											mstSloDR.itm_sub1(), mstSloDR.itm_sub2(), mstSloDR.itm_sub3(),
											notRetSlsSchdR.base_unit_qty(), mstSloDR.trd_unit_cd());
									MCNumber toBaseUnitQty = cnvTrdToBaseUnitQty(mstSloDR.itm_cd(), mstSloDR.itm_sub1(),
											mstSloDR.itm_sub2(), mstSloDR.itm_sub3(), trdUnitQty, mstSloDR.trd_unit_cd());
									if (!isSame(notRetSlsSchdR.base_unit_qty(), toBaseUnitQty)) {
										notRetSlsSchdR.trd_unit_qty(notRetSlsSchdR.base_unit_qty());
										notRetSlsSchdR.trd_unit_cd(mstSloDR.base_unit_cd());
									}
									else {
										notRetSlsSchdR.trd_unit_qty(trdUnitQty);
										notRetSlsSchdR.trd_unit_cd(mstSloDR.trd_unit_cd());
									}
								}
								clacCred(mstSloDR, slsSchdR.base_unit_abort_qty());
								dbUpdateKey("MSBBL6220_MST_SLS_SCHD_U17", notRetSlsSchdR, notRetSlsSchdR_bldr);
							}
							else {
								slsSchdR_bldr.setSet(slsSchdR.abort_flg);
								slsSchdR_bldr.addSet(slsSchdR.cmpl_flg);
								slsSchdR_bldr.addSet(slsSchdR.base_unit_abort_qty);
								slsSchdR_bldr.addSet(slsSchdR.base_unit_qty);
								slsSchdR_bldr.addSet(slsSchdR.trd_unit_qty);
								slsSchdR_bldr.addSet(slsSchdR.trd_unit_cd);
								slsSchdR.cmpl_flg(false);//完了ＦＬＧ
								slsSchdR.abort_flg(false);//打切ＦＬＧ
								clacCred(mstSloDR, slsSchdR.base_unit_abort_qty().subtract(mstSloDR.getNumberNE(MST_SHIP_PR_R.$ship_schd_abort_qty)));
								slsSchdR.base_unit_abort_qty(mstSloDR.getNumberNE(MST_SHIP_PR_R.$ship_schd_abort_qty));
								slsSchdR.base_unit_qty(mstSloDR.getNumberNE("ship_pr_base_unit_qty").subtract(mstSloDR.getNumberNE(MST_SHIP_PR_R.$iv_schd_qty)));
								if (isSame(mstSloDR.trd_unit_cd(), mstSloDR.base_unit_cd())){
									slsSchdR.trd_unit_qty(slsSchdR.base_unit_qty());
									slsSchdR.trd_unit_cd(mstSloDR.trd_unit_cd());
								}
								else{
									MCNumber trdUnitQty = cnvBaseToTrdUnitQty2(mstSloDR.itm_cd(),
											mstSloDR.itm_sub1(), mstSloDR.itm_sub2(), mstSloDR.itm_sub3(),
											slsSchdR.base_unit_qty(), mstSloDR.trd_unit_cd());
									MCNumber toBaseUnitQty = cnvTrdToBaseUnitQty(mstSloDR.itm_cd(), mstSloDR.itm_sub1(),
											mstSloDR.itm_sub2(), mstSloDR.itm_sub3(), trdUnitQty, mstSloDR.trd_unit_cd());
									if (!isSame(slsSchdR.base_unit_qty(), toBaseUnitQty)) {
										slsSchdR.trd_unit_qty(slsSchdR.base_unit_qty());
										slsSchdR.trd_unit_cd(mstSloDR.base_unit_cd());
									}
									else {
										slsSchdR.trd_unit_qty(trdUnitQty);
										slsSchdR.trd_unit_cd(mstSloDR.trd_unit_cd());
									}
								}
								dbUpdateKey("MSBBL6220_MST_SLS_SCHD_U18", slsSchdR, slsSchdR_bldr);
							}
						}
					}
					else {
						
						//インボイス未計上分の売上予定をロックする。
						lockedSlsSchdList_bldr.setWhere(lockedSlsSchdList_t.slo_d_no.eq(bind("1")), upd05DtlRow.slo_d_no());
						lockedSlsSchdList_bldr.addWhereWithAnd(lockedSlsSchdList_t.iv_d_no.isNull());
						dbSelectForUpdate("MSBBL6220_MST_SLS_SCHD_S36", lockedSlsSchdList, lockedSlsSchdList_bldr);
						
						//ロックしたレコードを削除する。	
						dbDeleteKey("MSBBL6220_MST_SLS_SCHD_D16", lockedSlsSchdList, lockedSlsSchdList_bldr);
						
						MST_SLO_D_R mstSloDR = MST_SLO_D_R.create();
						
						MST_SLS_SCHD_R slsSchdR = crtNonIvSlsSchd(
								upd05DtlRow, 
								lockedSlsSchdList,
								MSC_SLS_SCHD_SRC_TYP.SLO_D.value(), 
								mstSloDR);
						
						if (!isNull(slsSchdR) && !slsSchdR.isEmpty()) {
							// 与信戻し数量算出
							MCNumber credQty = slsSchdR.base_unit_qty().subtract(sum(slsSchdR.base_unit_abort_qty(), slsSchdR.base_unit_sls_qty()));
							
							if (!lockedSlsSchdList.isEmpty()) {
								
								credQty = credQty.subtract(lockedSlsSchdList.sum(MST_SLS_SCHD_R.$base_unit_qty).subtract(
										sum(lockedSlsSchdList.sum(MST_SLS_SCHD_R.$base_unit_abort_qty), lockedSlsSchdList.sum(MST_SLS_SCHD_R.$base_unit_sls_qty))));
							}
							
							if (!credQty.isZero()) {
								clacCred(mstSloDR, credQty);
							}
						}
					}
				}
			}
			
			if (updSlsSchdL.size() > 0) {

				MST_SLS_SCHD_R updSlsSchdL_t = MST_SLS_SCHD_R.create("T");
				MCQueryApiBuilder updSlsSchdL_bldr = MCQueryApiBuilder.create(updSlsSchdL_t);
				updSlsSchdL_bldr.setSet(updSlsSchdL_t.sls_schd_src_typ);
				updSlsSchdL_bldr.addSet(updSlsSchdL_t.sls_schd_dt);
				updSlsSchdL_bldr.addSet(updSlsSchdL_t.sls_ac_abl_flg);
				
				updSlsSchdL_bldr.setWhere(updSlsSchdL_t.iv_d_no.eq(bindEx("iv_d_no")));
				dbUpdate("MSBBL6220_MST_SLS_SCHD_U19", updSlsSchdL, updSlsSchdL_bldr);
			}
			if (!insSlsSchdL.isEmpty()) {
				dbInsert("MSBBL6220_MST_SLS_SCHD_I12", insSlsSchdL, MCQueryApiBuilder.create(
						MST_SLS_SCHD_R.create("T")));
			}
		}
		protected MST_SLS_SCHD_R crtNonIvSlsSchdForUplnd(MCList<MST_SLS_SCHD_R> lockedSlsSchdList, MST_SLS_SCHD_R slsSchdR, Sls_Schd_Upd05_DtlR upd05DtlRow ) {
			
			MCNumber adjBaseUnitQty = MCNumber.ZERO;
			MCNumber adjTrdUnitQty = MCNumber.ZERO;
			
			MST_SLS_SCHD_R nonIvSlsSchdR = null;
			MCList<MST_SLS_SCHD_R> nonIvSlsSchdL = lockedSlsSchdList.subList(r->isNull(r.iv_d_no()));
			if (!nonIvSlsSchdL.isEmpty()) {
				nonIvSlsSchdR = nonIvSlsSchdL.get(0);
			}
			
			MST_SLS_SCHD_R srcIvSlsSchdR = null;
			MCList<MST_SLS_SCHD_R> srcSlsSchdL = lockedSlsSchdList.subList(r->!isNull(r.iv_d_no()));
			if (MAC_DATA_CRUD_TYP.isUPD(upd05DtlRow.data_crud_typ())
					|| MAC_DATA_CRUD_TYP.isDEL(upd05DtlRow.data_crud_typ())) {
				srcIvSlsSchdR = srcSlsSchdL.get(0);
			}
			
			if (MAC_DATA_CRUD_TYP.isCRT(upd05DtlRow.data_crud_typ())) {
				adjBaseUnitQty = slsSchdR.base_unit_qty().negate();
				adjTrdUnitQty = slsSchdR.trd_unit_qty().negate();
			}
			else if (MAC_DATA_CRUD_TYP.isUPD(upd05DtlRow.data_crud_typ())) {
				adjBaseUnitQty = srcIvSlsSchdR.base_unit_qty().subtract(slsSchdR.base_unit_qty());
				adjTrdUnitQty = srcIvSlsSchdR.trd_unit_qty().subtract(slsSchdR.trd_unit_qty());
			}
			else if (MAC_DATA_CRUD_TYP.isDEL(upd05DtlRow.data_crud_typ())) {
				adjBaseUnitQty = srcIvSlsSchdR.base_unit_qty();
				adjTrdUnitQty = srcIvSlsSchdR.trd_unit_qty();
			}
			
			if (!adjBaseUnitQty.isZero()) {
				
				if (isNull(nonIvSlsSchdR)) {
					nonIvSlsSchdR = MST_SLS_SCHD_R.create();
					nonIvSlsSchdR = MST_SLS_SCHD_R.create();
					nonIvSlsSchdR.sls_schd_no(getStrSeq(MSC_NUM_SYS_TYP.SLSSCHD));
					nonIvSlsSchdR.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.SHIP_ACT_D.value());
					nonIvSlsSchdR.dlv_slip_d_no(srcIvSlsSchdR.dlv_slip_d_no());
					nonIvSlsSchdR.sls_schd_dt(srcIvSlsSchdR.sls_schd_dt());
					nonIvSlsSchdR.base_unit_qty(0);
					nonIvSlsSchdR.base_unit_cd(srcIvSlsSchdR.base_unit_cd());
					nonIvSlsSchdR.trd_unit_qty(0);
					nonIvSlsSchdR.trd_unit_cd(srcIvSlsSchdR.trd_unit_cd());
					nonIvSlsSchdR.base_unit_abort_qty(0);
					nonIvSlsSchdR.base_unit_sls_qty(0);
				}
				
				nonIvSlsSchdR.base_unit_qty(nonIvSlsSchdR.base_unit_qty().add(adjBaseUnitQty));
				nonIvSlsSchdR.trd_unit_qty(nonIvSlsSchdR.trd_unit_qty().add(adjTrdUnitQty));
				
				if (nonIvSlsSchdR.base_unit_qty().isZero()) {
					nonIvSlsSchdR = null;
				}
			}
			
			return nonIvSlsSchdR;
		}
		
		protected void doShipRetForUplnd() {
			
			MCList<Sls_Schd_Upd05_DtlR> shipRetUplndL = up0().subList(r->MSC_SLS_SCHD_SRC_TYP.isSHIP_ACT_D(r.sls_schd_src_typ()) && r.sls_ret_flg());
			if (shipRetUplndL.isEmpty()) {
				return;
			}
			
			MCList<MST_SLS_SCHD_R> slsSchdL =MCList.create(MST_SLS_SCHD_R.class);
			
			MCList<MST_SLS_SCHD_R> orgSlsSchdL =getSlsSchdForShipRetUplnd(shipRetUplndL);
			MCIndexKey slsSchdIdxkey = orgSlsSchdL.createIndex(MST_SLS_SCHD_R.$dlv_slip_d_no, MST_SLS_SCHD_R.$abort_flg);
			
			for (Sls_Schd_Upd05_DtlR shipRetUplndR : shipRetUplndL) {
				
				MCList<MST_SHIP_ACT_D_R> shipActDL = _shipActDL.subList(_shipActDIdxKey, shipRetUplndR.dlv_slip_d_no());
				MST_SHIP_ACT_D_R shipActR = shipActDL.get(0);
				MST_SLS_SCHD_R orgRetSlsSchdR = orgSlsSchdL.getFirst(slsSchdIdxkey, shipRetUplndR.dlv_slip_d_no(), true);
				MST_SLS_SCHD_R orgSlsSchdR = orgSlsSchdL.getFirst(slsSchdIdxkey, shipRetUplndR.dlv_slip_d_no(), false);
				
				MCNumber befRetQty = MCNumber.ZERO;
				if (!isNull(orgRetSlsSchdR)) {
					befRetQty = orgRetSlsSchdR.base_unit_qty();
				}
				
				MCNumber aftRetQty = shipActDL.sum(MST_SHIP_ACT_D_R.$ship_ret_qty);
				
				MCNumber befNoRetQty = MCNumber.ZERO;
				if (!isNull(orgSlsSchdR)) {
					befNoRetQty = orgSlsSchdR.base_unit_qty();
				}
				
				if(aftRetQty.eq(befRetQty)) {
					continue;
				}
				
				MCNumber diffQty = aftRetQty.subtract(befRetQty);
				calcCredAmt(shipActR, shipActDL.sum(MST_SHIP_ACT_D_R.$base_unit_qty), diffQty.negate());

				if (aftRetQty.isZero() && befRetQty.isPositive()) {
					// 返品取消
					MST_SLS_SCHD_R slsSchdR = null;
					if (!isNull(orgSlsSchdR)) {
						// 更新前未返品あり
						slsSchdR = orgSlsSchdR;
					}
					else {
						// 更新前未返品なし
						slsSchdR = orgRetSlsSchdR;
					}
					slsSchdR.base_unit_abort_qty(MCNumber.ZERO);
					slsSchdR.abort_flg(false);
					slsSchdR.cmpl_flg(false);
					slsSchdR.base_unit_qty(sum(befRetQty, befNoRetQty));
					setTrdUnitQty(slsSchdR, shipActR);
					
					slsSchdL.add(slsSchdR);
				}
				else if (aftRetQty.eq(befRetQty.add(befNoRetQty))) {
					// 全数返品
					MST_SLS_SCHD_R slsSchdR = null;
					if (!isNull(orgRetSlsSchdR)) {
						// 更新前返品あり
						slsSchdR = orgRetSlsSchdR;
					}
					else {
						// 更新前返品なし
						slsSchdR = orgSlsSchdR;
					}
					slsSchdR.base_unit_abort_qty(aftRetQty);
					slsSchdR.abort_flg(true);
					slsSchdR.cmpl_flg(true);
					slsSchdR.base_unit_qty(aftRetQty);
					setTrdUnitQty(slsSchdR, shipActR);
					
					slsSchdL.add(slsSchdR);
				}
				else if (aftRetQty.lt(befRetQty.add(befNoRetQty))) {
					// 一部返品
					
					// 返品分の売上予定
					MST_SLS_SCHD_R slsSchdR = null;
					if (!isNull(orgRetSlsSchdR)) {
						// 更新前返品あり
						slsSchdR = orgRetSlsSchdR;
					}
					else {
						// 更新前返品なし
						slsSchdR = MST_SLS_SCHD_R.create();
						slsSchdR.sls_schd_no(getStrSeq(MSC_NUM_SYS_TYP.SLSSCHD));
						slsSchdR.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.SHIP_ACT_D.value());
						slsSchdR.dlv_slip_d_no(shipRetUplndR.dlv_slip_d_no());
						slsSchdR.sls_schd_dt(shipActR.getDateNE(MST_SHIP_ACT_R.$dlv_tm).trunc(MCDateFieldType.DAY));
						slsSchdR.base_unit_cd(shipActR.base_unit_cd());
						slsSchdR.trd_unit_cd(shipActR.trd_unit_cd());
						slsSchdR.base_unit_sls_qty(0);
					}
					slsSchdR.base_unit_abort_qty(aftRetQty);
					slsSchdR.abort_flg(true);
					slsSchdR.cmpl_flg(true);
					slsSchdR.base_unit_qty(aftRetQty);
					setTrdUnitQty(slsSchdR, shipActR);
					slsSchdL.add(slsSchdR);
					
					// 未返品分の売上予定
					MST_SLS_SCHD_R notRetSlsSchdR = null;
					if (!isNull(orgSlsSchdR)) {
						// 更新前未返品あり
						notRetSlsSchdR = orgSlsSchdR;
					}
					else {
						// 更新前未返品なし
						notRetSlsSchdR = MST_SLS_SCHD_R.create();
						notRetSlsSchdR.sls_schd_no(getStrSeq(MSC_NUM_SYS_TYP.SLSSCHD));
						notRetSlsSchdR.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.SHIP_ACT_D.value());
						notRetSlsSchdR.dlv_slip_d_no(shipRetUplndR.dlv_slip_d_no());
						notRetSlsSchdR.sls_schd_dt(shipActR.getDateNE(MST_SHIP_ACT_R.$dlv_tm).trunc(MCDateFieldType.DAY));
						notRetSlsSchdR.base_unit_cd(shipActR.base_unit_cd());
						notRetSlsSchdR.trd_unit_cd(shipActR.trd_unit_cd());
						notRetSlsSchdR.base_unit_qty(0);
						notRetSlsSchdR.base_unit_sls_qty(0);
						notRetSlsSchdR.base_unit_abort_qty(0);
					}
					notRetSlsSchdR.base_unit_qty(notRetSlsSchdR.base_unit_qty().subtract(diffQty));
					setTrdUnitQty(notRetSlsSchdR, shipActR);
					slsSchdL.add(notRetSlsSchdR);
				}
				
				MCQueryApiBuilder slsSchdList_bldr = MCQueryApiBuilder.create(MST_SLS_SCHD_R.create("SLSSCHD"));
				dbDeleteKey("MSBBL6220_MST_SLS_SCHD_D17", orgSlsSchdL, slsSchdList_bldr);
				dbInsert("MSBBL6220_MST_SLS_SCHD_I7", slsSchdL, slsSchdList_bldr);
			}
		}
		
		/**
		 * 取引単位数量に変換する。
		 * @param slsSchdR 売上予定
		 * @param shipActDR 出荷実績明細
		 */
		protected void setTrdUnitQty(MST_SLS_SCHD_R slsSchdR, MST_SHIP_ACT_D_R shipActDR) {
			if (isSame(shipActDR.trd_unit_cd(), shipActDR.base_unit_cd())) {
				slsSchdR.trd_unit_qty(slsSchdR.base_unit_qty());
			}
			else {
				slsSchdR.trd_unit_qty(rvrsBaseUnitConv(slsSchdR.base_unit_qty(), shipActDR.getNumberNE(MAVM_ITM_UNIT_R.$conv_base_qty), shipActDR.getNumberNE(MAVM_ITM_UNIT_R.$conv_qty),
						shipActDR.getNumberNE(MAVM_ITM_UNIT_R.$dec_place), shipActDR.getStringNE(MAVM_ITM_UNIT_R.$rnd_typ), false));
			}
		}
		
		protected MCList<MST_SLS_SCHD_R> getSlsSchdForShipRetUplnd(MCList<Sls_Schd_Upd05_DtlR> shipRetUplndL) {
			
			MCList<MST_SLS_SCHD_R> slsSchdL = MCList.create(MST_SLS_SCHD_R.class);
			MST_SLS_SCHD_R slsSchd = MST_SLS_SCHD_R.create("SLSSCHD");
			MCQueryApiBuilder slsSchdL_bldr = MCQueryApiBuilder.create(slsSchd);
			slsSchdL_bldr.setWhere(slsSchd.dlv_slip_d_no.eq(bind(Sls_Schd_Upd05_DtlR.$dlv_slip_d_no)));
			slsSchdL_bldr.addWhereWithAnd(slsSchd.iv_d_no.isNull());
			
			dbSelectForUpdate("MSBBL6220_MST_SLS_SCHD_S38", slsSchdL, slsSchdL_bldr, shipRetUplndL);
			
			return slsSchdL;
		}
		
		protected void calcCredAmt(MST_SHIP_ACT_D_R shipActDR, MCNumber shipActQty, MCNumber credQty) {
			
			MCNumber decPlace = getAmtDecPlace(shipActDR.getStringNE(MST_DLV_SLIP_R.$trd_cur_cd));
			String rndTyp = getRndTyp(shipActDR.getStringNE(MST_SHIP_ACT_R.$cst_cd));
			
			MCNumber credRAmt = (shipActDR.getNumberNE(MST_DLV_SLIP_D_R.$trd_cur_amt).add(shipActDR.getNumberNE(MST_DLV_SLIP_D_R.$trd_cur_tax_amt)))
					.multiply(credQty).divide(shipActQty, decPlace.intValue(), MAC_RND_TYP.toMC(rndTyp));
			
			Cred_Upd01_CndR credR = Cred_Upd01_CndR.create();
			credR.cst_cd(shipActDR.getStringNE(MST_SHIP_ACT_R.$cst_cd));
			credR.cur_cd(shipActDR.getStringNE(MST_DLV_SLIP_R.$trd_cur_cd));
			credR.trd_ptn_typ(shipActDR.trd_ptn_typ());
			credR.amt(credRAmt);
			_credAmtL.add(credR);
		}
		
		protected void createCache(MCList<Sls_Schd_Upd05_DtlR> upd05DtlList) {
			_sloDL = MCList.create(MST_SLO_D_R.class);
			// 受注明細
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MST_SLO_D_R.create("T"));
			dbWkDelete("MSBBL6220_MSW_SLO_D_D01", dbc_bldr.getBaseDbc());
			dbWkInsert("MSBBL6220_MSW_SLO_D_I01", upd05DtlList, dbc_bldr.getBaseDbc());
			
			MST_SLO_D_R cacheSloDL_t = MST_SLO_D_R.create("T");
			MCQueryApiBuilder cacheSloDL_bldr = MCQueryApiBuilder.create(cacheSloDL_t);
			MST_SHIP_PR_R t1 = MST_SHIP_PR_R.create("T1");
			MSW_SLO_D_KEY_R w = MSW_SLO_D_KEY_R.create("W");
			
			cacheSloDL_bldr.addSelect(t1.ship_schd_abort_qty);
			cacheSloDL_bldr.addSelect(t1.sls_schd_abort_qty);
			cacheSloDL_bldr.addSelect(t1.iv_schd_qty);
			cacheSloDL_bldr.addSelect(t1.base_unit_qty.as("ship_pr_base_unit_qty"));
			cacheSloDL_bldr.addInnerJoin(w, bracket(w.slo_d_no.eq(cacheSloDL_t.slo_d_no)));
			cacheSloDL_bldr.addInnerJoin(t1, t1.slo_d_no.eq(cacheSloDL_t.slo_d_no));
			dbSelect("MSBBL6220_MST_SLO_D_S07", _sloDL, cacheSloDL_bldr);
			_sloDIdxKey = _sloDL.createIndex(MST_SLO_D_R.$slo_d_no);
			
			// 受注ヘッダ
			MCList<MST_SLO_R> sloL = MCList.create(MST_SLO_R.class);
			dbSelectKey("MSBBL6220_MST_SLO_S03", sloL, MCQueryApiBuilder.create(MST_SLO_R.create("T")), _sloDL);
			
			// 取引先マスタ
			MAM_BP_R bpL_t = MAM_BP_R.create("T");
			MCQueryApiBuilder bpL_bldr = MCQueryApiBuilder.create(bpL_t);
			bpL_bldr.setSelect(bpL_t.sls_amt_rnd_typ);
			_cacheBp = new FXUCL_MCDbcCache<MAM_BP_R>(bpL_bldr, sloL, MST_SLO_R.$cst_cd);
			
			// 品目単位マスタ
			MCList<MAVM_ITM_UNIT_R> itmUnitL = MCList.create(MAVM_ITM_UNIT_R.create());
			itmUnitL.addNumberColumn("base_unit_dec_place");
			itmUnitL.addStringColumn("base_unit_rnd_typ");
			_cacheItmUnitL = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(itmUnitL, getQApiBuilderItmUnit(), _sloDL, MST_SLO_D_R.$itm_cd, MST_SLO_D_R.$itm_sub1,
					MST_SLO_D_R.$itm_sub2, MST_SLO_D_R.$itm_sub3, MST_SLO_D_R.$trd_unit_cd);
			createIvCache(upd05DtlList);
			createIvShipActMapCache();
			createShipActCache(upd05DtlList);
		}
		protected void createIvCache(MCList<Sls_Schd_Upd05_DtlR> upd05DtlL) {
			_ivDL = MCList.create(MST_IV_D_R.class);
			_ivDL.addStringColumn(MST_IV_R.$iv_no);
			_ivDL.addStringColumn(MST_IV_R.$via_dlv_typ);
			_ivDL.addStringColumn(MST_IV_R.$trd_cur_cd);
			_ivDL.addStringColumn(MST_IV_R.$trd_ptn_typ);
			_ivDL.addStringColumn(MST_IV_R.$ship_rqst_id_cd);
			_ivDL.addStringColumn(MST_IV_R.$iv_src_typ);
			_ivDL.addStringColumn(MST_SLO_D_R.$ship_inst_typ);
			_ivDL.addStringColumn(MST_SLO_D_R.$proc_typ);
			_ivDL.addBooleanColumn(MST_SLO_D_R.$sls_cststk_flg);
			_ivDL.addStringColumn(MST_SLO_R.$sls_basis_typ);
			
			MCList<Sls_Schd_Upd05_DtlR> bindL = upd05DtlL.subList(r->!isNull(r.iv_no()));
			
			if (!bindL.isEmpty()) {
				MST_IV_D_R ivD = MST_IV_D_R.create("IVD");
				MST_IV_R iv= MST_IV_R.create("IV");
				MST_SLO_D_R sloD = MST_SLO_D_R.create("SLOD");
				MST_SLO_R slo = MST_SLO_R.create("SLO");
				
				MCQueryApiBuilder ivDL_bldr = MCQueryApiBuilder.create(ivD);
				ivDL_bldr.addSelect(iv.iv_no, iv.via_dlv_typ, iv.trd_cur_cd, iv.trd_ptn_typ, iv.ship_rqst_id_cd, iv.iv_src_typ);
				ivDL_bldr.addSelect(sloD.ship_inst_typ, sloD.proc_typ, sloD.sls_cststk_flg);
				ivDL_bldr.addSelect(slo.sls_basis_typ);
				ivDL_bldr.setWhere(value(0).eq(value(0)));
				ivDL_bldr.addWhereWithAnd(iv.iv_no.eq(bind("iv_no")));
				ivDL_bldr.addInnerJoin(iv, ivD.iv_mng_no.eq(iv.iv_mng_no));
				ivDL_bldr.addLeftOuterJoin(sloD, ivD.slo_d_no.eq(sloD.slo_d_no));
				ivDL_bldr.addLeftOuterJoin(slo, sloD.slo_no.eq(slo.slo_no));
				dbSelect("MSBBL6220_MST_IV_D_S06", _ivDL, ivDL_bldr, bindL);
			}
			_ivDLIvNoIdxKey = _ivDL.createIndex(MST_IV_R.$iv_no);
			_ivDLIvDNoIdxKey = _ivDL.createIndex(MST_IV_D_R.$iv_d_no);
		}
		
		protected void  createIvShipActMapCache() {
			
			_ivShipActMapL = MCList.create(MST_IV_SHIP_ACT_MAP_R.class);
			if (!_ivDL.isEmpty()) {
				MST_IV_SHIP_ACT_MAP_R ivShipActMap = MST_IV_SHIP_ACT_MAP_R.create("IVSHIPACTMAP");
				MCQueryApiBuilder ivShipActMapL_bldr = MCQueryApiBuilder.create(ivShipActMap);
				ivShipActMapL_bldr.setWhere(ivShipActMap.iv_d_no.eq(bind("iv_d_no")));
				dbSelect("MSBBL6220_MST_IV_SHIP_ACT_MAP_S01", _ivShipActMapL, ivShipActMapL_bldr, _ivDL);
			}
			
			_ivShipActMapIdxKey = _ivShipActMapL.createIndex(MST_IV_SHIP_ACT_MAP_R.$iv_d_no);
		}
		
		protected void  createShipActCache(MCList<Sls_Schd_Upd05_DtlR> upd05DtlL) {
			
			_shipActDL = MCList.create(MST_SHIP_ACT_D_R.class);
			_shipActDL.addDateColumn(MST_SHIP_ACT_R.$dlv_tm);
			
			MCList<Sls_Schd_Upd05_DtlR> bindL = upd05DtlL.subList(r->!isNull(r.dlv_slip_d_no()));
			if (!bindL.isEmpty()) {
				MST_SHIP_ACT_D_R shipActD = MST_SHIP_ACT_D_R.create("SHIPACTD");
				MST_SHIP_ACT_R shipAct = MST_SHIP_ACT_R.create("SHIPACT");
				MST_DLV_SLIP_R dlvSlip = MST_DLV_SLIP_R.create("DLVSLIP");
				MST_DLV_SLIP_D_R dlvSlipD = MST_DLV_SLIP_D_R.create("DLVSLIPD");
				MAVM_ITM_UNIT_R itmUnit = MAVM_ITM_UNIT_R.create("ITMUNIT");
				MCQueryApiBuilder shipActDL_bldr = MCQueryApiBuilder.create(shipActD);
				shipActDL_bldr.setSelect(shipActD.trd_ptn_typ, shipActD.dlv_slip_d_no, shipActD.base_unit_qty, shipActD.ship_ret_qty, shipActD.base_unit_cd, shipActD.trd_unit_cd);
				shipActDL_bldr.addSelect(shipAct.cst_cd, shipAct.dlv_tm);
				shipActDL_bldr.addSelect(dlvSlip.trd_cur_cd);
				shipActDL_bldr.addSelect(dlvSlipD.trd_cur_amt, dlvSlipD.trd_cur_tax_amt);
				shipActDL_bldr.addSelect(itmUnit.conv_qty, itmUnit.conv_base_qty, itmUnit.dec_place, itmUnit.rnd_typ);
				shipActDL_bldr.addInnerJoin(shipAct, shipActD.ship_act_no.eq(shipAct.ship_act_no));
				shipActDL_bldr.addInnerJoin(dlvSlip, shipActD.dlv_slip_no.eq(dlvSlip.dlv_slip_no).and(shipActD.dlv_slip_seq.eq(dlvSlip.dlv_slip_seq)));
				shipActDL_bldr.addInnerJoin(dlvSlipD, dlvSlip.dlv_slip_no.eq(dlvSlipD.dlv_slip_no).and(dlvSlip.dlv_slip_seq.eq(dlvSlipD.dlv_slip_seq).and(shipActD.dlv_slip_d_no.eq(dlvSlipD.dlv_slip_d_no))));
				shipActDL_bldr.addLeftOuterJoin(itmUnit, bracket(shipActD.itm_cd.eq(itmUnit.itm_cd)
						.and(shipActD.itm_sub1.eq(itmUnit.itm_sub1))
						.and(shipActD.itm_sub2.eq(itmUnit.itm_sub2))
						.and(shipActD.itm_sub3.eq(itmUnit.itm_sub3))
						.and(shipActD.trd_unit_cd.eq(itmUnit.unit_cd))));
				shipActDL_bldr.setWhere(shipActD.dlv_slip_d_no.eq(bind("dlv_slip_d_no")));
				shipActDL_bldr.addWhereWithAnd(shipActD.can_flg.eq(value(false)));
				shipActDL_bldr.addWhereWithAnd(shipAct.can_flg.eq(value(false)));
				dbSelect("MSBBL6220_MST_SHIP_ACT_D_S04", _shipActDL, shipActDL_bldr, bindL);
			}
			
			_shipActDIdxKey = _shipActDL.createIndex(MST_SHIP_ACT_D_R.$dlv_slip_d_no);
		}
		
		/**
		 * インボイス未計上分の受注明細に対する売上予定を作成する。
		 * @param dtlR 上り電文明細
		 * @param lockedSlsSchdList ロットした売上予定明細リスト
		 * @param slsSchdSrcTyp 売上予定作成元区分
		 * @param mstSloDR 受注明細
		 * @return 売上予定明細
		 */
		protected MST_SLS_SCHD_R crtNonIvSlsSchd(Sls_Schd_Upd05_DtlR dtlR, MCList<MST_SLS_SCHD_R> lockedSlsSchdList, String slsSchdSrcTyp, MST_SLO_D_R mstSloDR) {
			
			if (isNull(mstSloDR)) {
				mstSloDR = MST_SLO_D_R.create();
			}
			boolean crtShipRetSlsSchd = false;
			
			mstSloDR.addNumberColumn("sls_shcd_base_unit_qty");
			mstSloDR.addNumberColumn("base_unit_abort_qty");
			
			MCMainQuery q = get_MST_SLO_D_S01_sql();
			int iCnt = q.executeQuery(dtlR, mstSloDR);

			MST_SLS_SCHD_R slsSchdR = MST_SLS_SCHD_R.create("T");
			
			if (iCnt > 0 && mstSloDR.getNumberNE("sls_shcd_base_unit_qty").isPositive()) {
				
				copy(slsSchdR, mstSloDR, createMap_MST_SLS_SCHD_R_MST_SLO_D_R());
				
				slsSchdR.base_unit_qty(mstSloDR.getNumberNE("sls_shcd_base_unit_qty"));
				slsSchdR.sls_schd_src_typ(slsSchdSrcTyp);
				if (!isNull(lockedSlsSchdList)) {
					slsSchdR.wg_rqst_no(lockedSlsSchdList.get(0).wg_rqst_no());
				}
				slsSchdR.base_unit_abort_qty(mstSloDR.getNumberNE("base_unit_abort_qty"));
				if (mstSloDR.getNumberNE("ship_ret_qty").isPositive()) {
					if (isSame(slsSchdR.base_unit_qty(), 
							sum(slsSchdR.base_unit_abort_qty(), mstSloDR.getNumberNE("ship_ret_qty"), slsSchdR.base_unit_sls_qty()))) {
						slsSchdR.base_unit_abort_qty(slsSchdR.base_unit_abort_qty().add(mstSloDR.getNumberNE("ship_ret_qty")));
						crtShipRetSlsSchd = false;
					}
					else {
						slsSchdR.base_unit_qty(slsSchdR.base_unit_qty().subtract(mstSloDR.getNumberNE("ship_ret_qty")));
						crtShipRetSlsSchd = true;
					}
				}
				slsSchdR.abort_flg(slsSchdR.base_unit_abort_qty().isPositive());
				slsSchdR.cmpl_flg(isSame(slsSchdR.base_unit_qty(), sum(slsSchdR.base_unit_abort_qty(), slsSchdR.base_unit_sls_qty())));
				
				MCNumber trdUnitQty = cnvBaseToTrdUnitQty2(mstSloDR.itm_cd(),
						mstSloDR.itm_sub1(), mstSloDR.itm_sub2(),
						mstSloDR.itm_sub3(), slsSchdR.base_unit_qty(),
						mstSloDR.trd_unit_cd());
				
				slsSchdR.trd_unit_qty(trdUnitQty);

				dbInsert("MSBBL6220_MST_SLS_SCHD_I13", slsSchdR, MCQueryApiBuilder.create(slsSchdR));
			}
			// 出荷返品の売上予定を作成する
			if (crtShipRetSlsSchd) {
				MCIndexKey idxkey = lockedSlsSchdList.createIndex(MST_SLS_SCHD_R.$cmpl_flg, MST_SLS_SCHD_R.$abort_flg);
				MST_SLS_SCHD_R shipRetSlsSchdR = lockedSlsSchdList.getFirst(idxkey, true, true);
				
				if (isNull(shipRetSlsSchdR)) {
					shipRetSlsSchdR = MST_SLS_SCHD_R.create();
					copy(shipRetSlsSchdR, mstSloDR, createMap_MST_SLS_SCHD_R_MST_SLO_D_R());
					shipRetSlsSchdR.sls_schd_src_typ(slsSchdSrcTyp);
					if (!isNull(lockedSlsSchdList)) {
						shipRetSlsSchdR.wg_rqst_no(lockedSlsSchdList.get(0).wg_rqst_no());
					}
					shipRetSlsSchdR.abort_flg(true);
					shipRetSlsSchdR.cmpl_flg(true);
				}
				
				shipRetSlsSchdR.base_unit_qty(mstSloDR.getNumberNE("ship_ret_qty"));
				shipRetSlsSchdR.base_unit_abort_qty(mstSloDR.getNumberNE("ship_ret_qty"));
				
				MCNumber trdUnitQty = cnvBaseToTrdUnitQty2(mstSloDR.itm_cd(),
						mstSloDR.itm_sub1(), mstSloDR.itm_sub2(),
						mstSloDR.itm_sub3(), shipRetSlsSchdR.base_unit_qty(),
						mstSloDR.trd_unit_cd());
				
				shipRetSlsSchdR.trd_unit_qty(trdUnitQty);

				dbInsert("MSBBL6220_MST_SLS_SCHD_I14", shipRetSlsSchdR,
						MCQueryApiBuilder.create(MST_SLS_SCHD_R.create("T")));
			}
			
			return slsSchdR;
		}
		
		protected void updNotRetSloSchdR(MST_SLS_SCHD_R notSlsSchdR,
				Sls_Schd_Upd05_DtlR upd05DtlRow, MST_SLO_D_R mstSloDR, MCNumber notRetBaseQty){
			//未返品の数量分の売上予定を作成。
			MST_SLS_SCHD_R notRetSlsSchdR = MST_SLS_SCHD_R.create("T");
			MCQueryApiBuilder notRetSlsSchdR_bldr = MCQueryApiBuilder.create(notRetSlsSchdR);
			//受注明細NOを元に売上予定情報を取得
			notRetSlsSchdR_bldr.setWhere(notRetSlsSchdR.slo_d_no.eq(bind("1")), upd05DtlRow.slo_d_no());
			notRetSlsSchdR_bldr.addWhereWithAnd(notRetSlsSchdR.iv_d_no.isNull());
			notRetSlsSchdR_bldr.addWhereWithAnd(notRetSlsSchdR.cmpl_flg.eq(value(false)));
			int i = dbSelectForUpdate("MSBBL6220_MST_SLS_SCHD_S37", notRetSlsSchdR, notRetSlsSchdR_bldr);
			if (i == 0){
				notRetSlsSchdR = notSlsSchdR;
				notRetSlsSchdR.cmpl_flg(false);//完了ＦＬＧ
				notRetSlsSchdR.abort_flg(false);//打切ＦＬＧ
				notRetSlsSchdR.base_unit_abort_qty(mstSloDR.getNumberNE(MST_SHIP_PR_R.$ship_schd_abort_qty));
			}			
			notRetSlsSchdR.sls_schd_src_typ(upd05DtlRow.sls_schd_src_typ());//売上予定作成元区分	
			notRetBaseQty = notRetBaseQty.add(mstSloDR.getNumberNE(MST_SHIP_PR_R.$ship_schd_abort_qty));
			notRetSlsSchdR.base_unit_qty(notRetBaseQty);//基準単位数量
			//取引単位が一致する場合の取引単位数の設定。
			if (isSame(mstSloDR.trd_unit_cd(), upd05DtlRow.trd_unit_cd())){
				notRetSlsSchdR.trd_unit_qty(mstSloDR.trd_unit_qty().subtract(upd05DtlRow.trd_unit_qty()));//取引単位数量
				notRetSlsSchdR.trd_unit_cd(mstSloDR.trd_unit_cd());
			}
			else{
				//未返品数（取引単位）の算出。
				MCNumber trdUnitQty = cnvBaseToTrdUnitQty2(mstSloDR.itm_cd(),
						mstSloDR.itm_sub1(), mstSloDR.itm_sub2(), mstSloDR.itm_sub3(),
						notRetBaseQty, mstSloDR.trd_unit_cd());
				MCNumber toBaseUnitQty = cnvTrdToBaseUnitQty(mstSloDR.itm_cd(), mstSloDR.itm_sub1(),
						mstSloDR.itm_sub2(), mstSloDR.itm_sub3(), trdUnitQty, mstSloDR.trd_unit_cd());
				if (!isSame(notRetBaseQty, toBaseUnitQty)) {
					notRetSlsSchdR.trd_unit_qty(notRetBaseQty);
					notRetSlsSchdR.trd_unit_cd(notRetSlsSchdR.base_unit_cd());
				}
				else {
					notRetSlsSchdR.trd_unit_qty(trdUnitQty);
					notRetSlsSchdR.trd_unit_cd(mstSloDR.trd_unit_cd());
				}
			}
			if (i == 0){
				notRetSlsSchdR.sls_schd_no(getStrSeq(MSC_NUM_SYS_TYP.SLSSCHD)); //売上予定ＮＯ: 定数.発番システム区分.売上予定NOにより発番
				dbInsert("MSBBL6220_MST_SLS_SCHD_I15", notRetSlsSchdR, notRetSlsSchdR_bldr);	
			}
			else{
				dbUpdateKey("MSBBL6220_MST_SLS_SCHD_U20", notRetSlsSchdR, notRetSlsSchdR_bldr);	
			}
		}
		
		
		protected void crtNotRetSloSchdR(MST_SLS_SCHD_R slsSchdR, Sls_Schd_Upd05_DtlR upd05DtlRow, 
				MST_SLO_D_R mstSloDR, MCNumber notRetBaseQty){
			MST_SLS_SCHD_R newSlsSchdR = slsSchdR.clone();
			newSlsSchdR.sls_schd_no(getStrSeq(MSC_NUM_SYS_TYP.SLSSCHD)); //売上予定ＮＯ: 定数.発番システム区分.売上予定NOにより発番
			newSlsSchdR.sls_schd_src_typ(upd05DtlRow.sls_schd_src_typ());//売上予定作成元区分	
			notRetBaseQty = notRetBaseQty.add(mstSloDR.getNumberNE(MST_SHIP_PR_R.$ship_schd_abort_qty));
			newSlsSchdR.base_unit_qty(notRetBaseQty);//基準単位数量
			//取引単位が一致する場合の取引単位数の設定。
			if (isSame(slsSchdR.trd_unit_cd(), upd05DtlRow.trd_unit_cd())){
				newSlsSchdR.trd_unit_qty(slsSchdR.trd_unit_qty().subtract(upd05DtlRow.trd_unit_qty()));//取引単位数量
			}
			else{
				//未返品数（取引単位）の算出。
				MCNumber trdUnitQty = cnvBaseToTrdUnitQty2(mstSloDR.itm_cd(),
						mstSloDR.itm_sub1(), mstSloDR.itm_sub2(), mstSloDR.itm_sub3(),
						notRetBaseQty, slsSchdR.trd_unit_cd());
				MCNumber toBaseUnitQty = cnvTrdToBaseUnitQty(mstSloDR.itm_cd(), mstSloDR.itm_sub1(),
						mstSloDR.itm_sub2(), mstSloDR.itm_sub3(), trdUnitQty, slsSchdR.trd_unit_cd());
				if (!isSame(notRetBaseQty, toBaseUnitQty)) {
					newSlsSchdR.trd_unit_qty(notRetBaseQty);
					newSlsSchdR.trd_unit_cd(newSlsSchdR.base_unit_cd());
				}
				else {
					newSlsSchdR.trd_unit_qty(trdUnitQty);
					newSlsSchdR.trd_unit_cd(slsSchdR.trd_unit_cd());
				}
			}
			dbInsert("MSBBL6220_MST_SLS_SCHD_I16", newSlsSchdR,
					MCQueryApiBuilder.create(MST_SLS_SCHD_R.create("T")));
		}
		
		protected void setUpdAbortSloShcdR(MST_SLS_SCHD_R slsSchdR, MCQueryApiBuilder slsSchdR_bldr, Sls_Schd_Upd05_DtlR upd05DtlRow, MST_SLO_D_R mstSloDR){
			slsSchdR_bldr.setSet(slsSchdR.abort_flg);
			slsSchdR_bldr.addSet(slsSchdR.cmpl_flg);
			slsSchdR_bldr.addSet(slsSchdR.base_unit_abort_qty);
			slsSchdR_bldr.addSet(slsSchdR.base_unit_qty);
			slsSchdR_bldr.addSet(slsSchdR.trd_unit_qty);
			slsSchdR_bldr.addSet(slsSchdR.trd_unit_cd);
			slsSchdR_bldr.addSet(slsSchdR.sls_schd_src_typ);
			slsSchdR.cmpl_flg(true);//完了ＦＬＧ
			slsSchdR.abort_flg(true);//打切ＦＬＧ
			slsSchdR.base_unit_qty(upd05DtlRow.base_unit_qty());//基準単位数量
			MCNumber notRetBaseQty = mstSloDR.getNumberNE("ship_pr_base_unit_qty").subtract(
					sum(mstSloDR.getNumberNE(MST_SHIP_PR_R.$ship_schd_abort_qty),
							mstSloDR.getNumberNE(MST_SHIP_PR_R.$iv_schd_qty), 
							upd05DtlRow.base_unit_qty()));
			if (notRetBaseQty.isZero() 
					&& mstSloDR.getNumberNE(MST_SHIP_PR_R.$ship_schd_abort_qty).isPositive()) {
				slsSchdR.base_unit_qty(slsSchdR.base_unit_qty().add(mstSloDR.getNumberNE(MST_SHIP_PR_R.$ship_schd_abort_qty)));
			}
			slsSchdR.sls_schd_src_typ(upd05DtlRow.sls_schd_src_typ());//売上予定作成元区分	
			//取引単位が一致する場合の取引単位数の設定。
			if (isSame(slsSchdR.trd_unit_cd(), upd05DtlRow.trd_unit_cd())){
				slsSchdR.trd_unit_qty(upd05DtlRow.trd_unit_qty());//取引単位数量
			}
			else{
				//未返品数（取引単位）の算出。
				MCNumber trdQty = cnvBaseToTrdUnitQty2(mstSloDR.itm_cd(),
						mstSloDR.itm_sub1(), mstSloDR.itm_sub2(), mstSloDR.itm_sub3(),
						slsSchdR.base_unit_qty(), slsSchdR.trd_unit_cd());
				MCNumber toBaseUnitQty = cnvTrdToBaseUnitQty(mstSloDR.itm_cd(), mstSloDR.itm_sub1(),
						mstSloDR.itm_sub2(), mstSloDR.itm_sub3(), trdQty, slsSchdR.trd_unit_cd());
				if (!isSame(slsSchdR.base_unit_qty(), toBaseUnitQty)) {
					slsSchdR.trd_unit_qty(slsSchdR.base_unit_qty());
					slsSchdR.trd_unit_cd(slsSchdR.base_unit_cd());
				}
				else {
					slsSchdR.trd_unit_qty(trdQty);
					slsSchdR.trd_unit_cd(slsSchdR.trd_unit_cd());
				}
			}
			//基準単位打切数量
			slsSchdR.base_unit_abort_qty(upd05DtlRow.base_unit_qty());
			if (notRetBaseQty.isZero() 
					&& mstSloDR.getNumberNE(MST_SHIP_PR_R.$ship_schd_abort_qty).isPositive()) {
				slsSchdR.base_unit_abort_qty(slsSchdR.base_unit_abort_qty().add(mstSloDR.getNumberNE(MST_SHIP_PR_R.$ship_schd_abort_qty)));
			}
			dbUpdateKey("MSBBL6220_MST_SLS_SCHD_U21", slsSchdR, slsSchdR_bldr);
		}
		
		/**
		 * 売上計上可能FLGの判断
		 * @param upd05DtlRow
		 * @return
		 */
		protected boolean isSlsAcAblFlg(Sls_Schd_Upd05_DtlR upd05DtlRow, String ivNo){
			if (isIvShipCmpl(ivNo)) {
				return true;
			}
			else {
				return false;
			}
		}
		
		/**
		 * インボイス単位で全数出荷済か判定する（配送先経由しない場合のみ）。
		 * @param  ivNo インボイスNO
		 * @return 配送先経由しないかつインボイス単位で全数出荷済の場合はtrue。
		 */
		protected boolean isIvShipCmpl(String ivNo) {
			
			boolean ivAllShip = true;
			
			MCList<MST_IV_D_R> lst = _ivDL.subList(_ivDLIvNoIdxKey, ivNo);
			if (lst.isEmpty()) {
				ivAllShip = false;
			}
			else {
				for (MST_IV_D_R ivDR : lst) {
					
					if (ivDR.manual_add_flg() 
							|| MAC_SLO_PROC_TYP.isPURC_DDLV(ivDR.getStringNE(MST_SLO_D_R.$proc_typ))
							|| ivDR.getBooleanNE(MST_SLO_D_R.$sls_cststk_flg)) {
						// マニュアル追加、仕入直送、預り売上の場合、出荷の判定を行わない。
						continue;
					}
					
					if(!MAC_VIA_DLV_TYP.isNOT_VIA(ivDR.getStringNE(MST_IV_R.$via_dlv_typ))) {
						ivAllShip = false;
						break;
					}
					
					if (isIvShipOrdSls(ivDR)) {
						// 出荷の判定を行わない。
						continue;
					}
					
					MCList<MST_IV_SHIP_ACT_MAP_R> ivShipActMapL = _ivShipActMapL.subList(_ivShipActMapIdxKey, ivDR.iv_d_no());
					
					MCNumber qtySum = MCNumber.ZERO;
					if (!ivShipActMapL.isEmpty()) {
						qtySum = ivShipActMapL.sum(MST_IV_SHIP_ACT_MAP_R.$base_unit_qty);
					}
					
					if(!qtySum.eq(ivDR.base_unit_qty())) {
						ivAllShip = false;
						break;
					}
				}
			}
			
			return ivAllShip;
		}
		
		/**
		 * 指定された明細が出荷指図対象外売上かどうかどうか。
		 * @param ivDR インボイス明細
		 * @return 出荷指図対象外売上の場合はtrue
		 */
		protected boolean isIvShipOrdSls(MST_IV_D_R ivDR) {
			
			if (MAC_SHIP_INST_TYP.isNON(ivDR.getStringNE(MST_SLO_D_R.$ship_inst_typ))
					&& MAC_SLS_BASIS_TYP.isSHIP_BASIS(ivDR.getStringNE(MST_SLO_R.$sls_basis_typ))
					&& !ivDR.getBooleanNE(MST_SLO_D_R.$sls_cststk_flg)
					&& !MAC_SLO_PROC_TYP.isPURC_DDLV(ivDR.getStringNE(MST_SLO_D_R.$proc_typ))) {
				return true;
			}
			
			return false;
		}
		
		protected void clacCred(MST_SLO_D_R mstSloDR, MCNumber qty){
			//一時変数の定義：与信更新対象データROW
			Cred_Upd01_CndR credR = Cred_Upd01_CndR.create();
			
			MCNumber credRAmt = MCNumber.ZERO;
			//受注ヘッダデータの変数
			MST_SLO_R mstSloR = MST_SLO_R.create();
			MCQueryApiBuilder mstSloR_bldr = MCQueryApiBuilder.create(MST_SLO_R.create("T"));
			dbSelectKey("MSBBL6220_MST_SLO_S04", mstSloR, mstSloR_bldr, mstSloDR);
			//※受注ヘッダ.取引通貨に対応する通貨マスタ.金額小数部有効桁数、受注ヘッダ.得意先CDに対応する取引先マスタ.売上金額端数処理区分により端数処理する。
			MCNumber decPlace = getAmtDecPlace(mstSloR.trd_cur_cd());
			String rndTyp = getRndTyp(mstSloR.cst_cd());
			credRAmt = (mstSloDR.trd_cur_amt()
					.add(mstSloDR.trd_cur_tax_amt())).multiply(qty)
							.divide(mstSloDR.base_unit_qty(), decPlace.intValue(), MAC_RND_TYP.toMC(rndTyp));
			credR.cst_cd(mstSloR.cst_cd());//得意先CD
			credR.cur_cd(mstSloR.trd_cur_cd());//取引通貨ＣＤ.
			credR.trd_ptn_typ(mstSloR.trd_ptn_typ());//取引パタン区分.
			credR.amt(credRAmt);//与信額
			_credAmtL.add(credR);
		}
		

		protected void clacCred(MST_IV_D_R ivDR, Sls_Schd_Upd05_DtlR upd05DtlRow) {
			MAM_ITM_R itmR = MAM_ITM_R.create("T");
			MCQueryApiBuilder itmR_bldr = MCQueryApiBuilder.create(itmR);
			itmR_bldr.setSelect(itmR.dscnt_itm_flg);
			dbSelectKey("MSBBL6220_MAM_ITM_S02", itmR, itmR_bldr, ivDR);
			//与信額の算出：
			Cred_Upd01_CndR credR = Cred_Upd01_CndR.create();
			MCNumber credRAmt = ivDR.trd_cur_amt().add(ivDR.trd_cur_tax_amt());
			if (itmR.dscnt_itm_flg()) {
				credRAmt = credRAmt.multiply(-1);
			}
			if (MAC_DATA_CRUD_TYP.isDEL(upd05DtlRow.data_crud_typ())) {
				credRAmt = credRAmt.multiply(-1);
			}
			credR.cst_cd(ivDR.getString("ship_rqst_id_cd"));//得意先CD
			credR.cur_cd(ivDR.getString("trd_cur_cd"));//取引通貨ＣＤ.
			credR.trd_ptn_typ(ivDR.getString("trd_ptn_typ"));//取引パタン区分.
			credR.amt(credRAmt);//与信額
			_credAmtL.add(credR);
		}
	}

	/**
	 * 与信更新
	 */
	protected void updCred() {
		MSBGL_CredService.Cred_Upd01 ope = MSBGL_CredService.crtCred_Upd01();
		String[] gCols = new String[] {
				Cred_Upd01_CndR.$cst_cd, Cred_Upd01_CndR.$cur_cd,
				Cred_Upd01_CndR.$trd_ptn_typ
		};
		String[] sumCols = new String[] {
				Cred_Upd01_CndR.$amt
		};
		MCGroupByPolicy gp = new MCGroupByPolicy(gCols);
		gp.sum(sumCols);
		MCList<Cred_Upd01_CndR> newSumL = _credAmtL.groupBy(gp);
		for (Cred_Upd01_CndR r : newSumL) {
			MCNumber amt = r.amt();
			if (!amt.isZero()) {
				Cred_Upd01_CndR cndR = r.clone();
				//与信更新区分
				if (amt.gt(0)) {
					cndR.cred_upd_typ(MSC_CRED_UPD_TYP.UPD_CHK.value());
				}
				else {
					cndR.cred_upd_typ(MSC_CRED_UPD_TYP.UPD.value());
				}
				ope.up0().add(cndR);
			}
		}
		if (!ope.up0().isEmpty()) {
			ope.exec();
			if (!ope.down1().isEmpty()) {
				MCMessage msg = new MCMessage(MSBBL0124, ope.down1().get(0).cred_cd(),
						ope.down1().get(0).cur_cd(), ope.down1().get(0).cred_amt(),
						ope.down1().get(0).cred_limit());
				throw new MCAppException(msg);
			}
		}
	}

	public MCMainQuery get_MST_SLO_D_S01_sql() {
		MST_SLO_D_R S0T1 = MST_SLO_D_R.create("T1");
		MST_SHIP_PR_R S0T2 = MST_SHIP_PR_R.create("T2");
		MST_SLO_R S0T3 = MST_SLO_R.create("T3");
		MCTempView S0T4 = createTempView("T4");
		MST_SHIP_SCHD_R S1ST1 = MST_SHIP_SCHD_R.create("S1ST1");
		MST_SHIP_PR_R S1ST2 = MST_SHIP_PR_R.create("S1ST2");

		MCMainQuery q = sql("MSBBL6220_MST_SLO_D_S09")
			.mainQuery()
			.select(
				S0T1.slo_d_no,
				S0T1.ship_inst_typ,
				S0T3.sls_basis_typ,
				S0T1.sls_schd_dt,
				S0T2.ship_schd_tm,
				S0T2.dlv_schd_tm,
				S0T1.base_unit_cd,
				S0T1.base_unit_qty.add(S0T2.re_ship_schd_qty).subtract(
						nvl(
							S0T4.pr("iv_schd_qty"),
							value(0)
						)
					).as("sls_shcd_base_unit_qty"),
				S0T2.ship_ret_qty,
				nvl(
					S0T4.pr("abort_qty"),
					value(0)
				).as("base_unit_abort_qty"),
				S0T1.base_unit_qty,
				S0T1.trd_unit_cd,
				S0T1.itm_cd,
				S0T1.itm_sub1,
				S0T1.itm_sub2,
				S0T1.itm_sub3,
				S0T1.trd_cur_amt,
				S0T1.trd_cur_tax_amt,
				S0T3.slo_no
			)
			.from(
				S0T1
				.innerJoin(S0T2).on(
					bracket(
						S0T1.slo_d_no.eq(S0T2.slo_d_no)
					)
				)
				.innerJoin(S0T3).on(
					bracket(
						S0T1.slo_no.eq(S0T3.slo_no)
					)
				)
				.leftOuterJoin(
					subQuery()
					.select(
						S1ST1.ship_pr_no,
						sum(S1ST1.iv_schd_qty).as("iv_schd_qty")
						,sum(S1ST1.abort_qty).as("abort_qty")
					)
					.from(
						S1ST1
						.innerJoin(S1ST2).on(
							bracket(
								S1ST1.ship_pr_no.eq(S1ST2.ship_pr_no)
								.and(S1ST2.slo_d_no.eq(bind("slo_d_no")))
							)
						)
					)
					.groupBy(S1ST1.ship_pr_no).view(S0T4)
				).on(
					bracket(
						S0T4.pr(S1ST1.ship_pr_no).eq(S0T2.ship_pr_no)
					)
				)
			)
			.where(
				value(0).eq(value(0))
				.and(S0T1.slo_d_no.eq(bind("slo_d_no")))
			);
		return q;
	}

	/**
	 * 取引通貨に対応する通貨マスタ.金額小数部有効桁数を取得する
	 * @param trdCurCd 通貨CD
	 * @return　通貨マスタ.金額小数部有効桁数
	 */
	protected MCNumber getAmtDecPlace(String trdCurCd) {
		MAM_CUR_R curR = getCur(trdCurCd);
		return curR.amt_dec_place();
	}

	/**
	 * 得意先CDに対応する取引先マスタ.売上金額端数処理区分
	 * @param cstCd　取引先CD
	 * @return　取引先マスタ.売上金額端数処理区分
	 */
	protected String getRndTyp(String cstCd) {
		if (isNull(cstCd)) {
			return null;
		}
		MAM_BP_R bpR = _cacheBp.get(cstCd);
		return bpR.sls_amt_rnd_typ();
	}

	/**
	 * 基準単位数から取引数量に換算
	 * @param itmCd
	 * @param itmSub1
	 * @param itmSub2
	 * @param itmSub3
	 * @param baseUnitQty
	 * @param unitCd
	 * @return
	 */
	protected MCNumber cnvBaseToTrdUnitQty(String itmCd, String itmSub1, String itmSub2,
			String itmSub3, MCNumber baseUnitQty, String unitCd) {
		MAVM_ITM_UNIT_R unitR = MAVM_ITM_UNIT_R.create();
		dbSelectKey("MSBBL6220_MAVM_ITM_UNIT_S02", unitR,
				MCQueryApiBuilder.create(MAVM_ITM_UNIT_R.create("T")), itmCd, itmSub1,
				itmSub2, itmSub3, unitCd);
		return rvrsBaseUnitConv(baseUnitQty, unitR.conv_base_qty(), unitR.conv_qty(),
				unitR.dec_place(), unitR.rnd_typ(), true);
	}
	
	/**
	 * 基準単位数から取引数量に換算
	 * @param itmCd
	 * @param itmSub1
	 * @param itmSub2
	 * @param itmSub3
	 * @param baseUnitQty
	 * @param unitCd
	 * @return
	 */
	protected MCNumber cnvBaseToTrdUnitQty2(String itmCd, String itmSub1, String itmSub2,
			String itmSub3, MCNumber baseUnitQty, String unitCd) {
		if (_cacheItmUnitL == null) {
			MCList<MAVM_ITM_UNIT_R> itmUnitL = MCList.create(MAVM_ITM_UNIT_R.create());
			itmUnitL.addNumberColumn("base_unit_dec_place");
			itmUnitL.addStringColumn("base_unit_rnd_typ");
			_cacheItmUnitL = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(itmUnitL, getQApiBuilderItmUnit(), MCList.create(MCRow.class));
		}

		MAVM_ITM_UNIT_R unitR = _cacheItmUnitL.get(itmCd, itmSub1, itmSub2, itmSub3, unitCd);
		return rvrsBaseUnitConv(baseUnitQty, unitR.conv_base_qty(), unitR.conv_qty(),
				unitR.dec_place(), unitR.rnd_typ());
	}

	/**
	 * 取引数量から基準単位数に換算
	 * @param itmCd
	 * @param itmSub1
	 * @param itmSub2
	 * @param itmSub3
	 * @param trdUnitQty
	 * @param unitCd
	 * @return
	 */
	protected MCNumber cnvTrdToBaseUnitQty(String itmCd, String itmSub1, String itmSub2,
			String itmSub3, MCNumber trdUnitQty, String unitCd) {
		if (_cacheItmUnitL == null) {
			MCList<MAVM_ITM_UNIT_R> itmUnitL = MCList.create(MAVM_ITM_UNIT_R.create());
			itmUnitL.addNumberColumn("base_unit_dec_place");
			itmUnitL.addStringColumn("base_unit_rnd_typ");
			_cacheItmUnitL = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(itmUnitL, getQApiBuilderItmUnit(), MCList.create(MCRow.class));
		}

		MAVM_ITM_UNIT_R unitR = _cacheItmUnitL.get(itmCd, itmSub1, itmSub2, itmSub3, unitCd);
		return convToBaseUnit(trdUnitQty, unitR.conv_base_qty(), unitR.conv_qty(),
				unitR.getNumberNE("base_unit_dec_place"), unitR.getStringNE("base_unit_rnd_typ"));
	}

	/**
	 * 品目単位マスタキャッシュ取得用MCQueryApiBuilder
	 * @return
	 */
	protected MCQueryApiBuilder getQApiBuilderItmUnit() {
		
		MAVM_ITM_UNIT_R t = MAVM_ITM_UNIT_R.create("T");
		MAM_ITM_CMN__R t2 = MAM_ITM_CMN__R.create("T2");
		
		MCQueryApiBuilder itmUnitL_bldr = MCQueryApiBuilder.create(t);
		
		itmUnitL_bldr.addInnerJoin(t2, bracket( t.itm_cd.eq(t2.itm_cd) .and(t.itm_sub1.eq(t2.itm_sub1)) .and(t.itm_sub2.eq(t2.itm_sub2)) .and(t.itm_sub3.eq(t2.itm_sub3))));
		itmUnitL_bldr.addSelect(t2.dec_place.as("base_unit_dec_place"));
		itmUnitL_bldr.addSelect(t2.rnd_typ.as("base_unit_rnd_typ"));
		
		return itmUnitL_bldr;
	}

	protected Map_ShipSchd_DtlR_MST_SHIP_SCHD_R<ShipSchd_DtlR, MST_SHIP_SCHD_R> createMap_ShipSchd_DtlR_MST_SHIP_SCHD_R() {
		return new Map_ShipSchd_DtlR_MST_SHIP_SCHD_R<ShipSchd_DtlR, MST_SHIP_SCHD_R>();
	}

	public class Map_ShipSchd_DtlR_MST_SHIP_SCHD_R<D extends ShipSchd_DtlR, S extends MST_SHIP_SCHD_R>
			extends MCRowMapper<D, S> {

		@Override
		public void valueCopy(D dest, S src) {
			dest.peg_no(src.getNumberNE("peg_no")); //データ紐付けＮＯ
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value()); //データ更新区分
			dest.ship_schd_no(src.ship_schd_no()); //出荷予定ＮＯ
			dest.ship_pr_no(src.ship_pr_no()); //出荷進捗ＮＯ
			dest.ship_inst_d_no(src.ship_inst_d_no()); //出荷指図明細ＮＯ
			dest.dlv_inst_rcpt_no(src.dlv_inst_rcpt_no()); //納入指示受領ＮＯ
			dest.slo_prms_no(src.slo_prms_no()); //受注納期回答ＮＯ
			dest.ship_fr_lg_grp_cd(src.ship_fr_lg_grp_cd()); //出荷元物流グループＣＤ
			dest.wg_cd(src.wg_cd()); //ワーキンググループＣＤ
			dest.pd_inst_dlv_tm(src.pd_inst_dlv_tm()); //納品依頼日時
			dest.ship_rqst_tm(src.ship_rqst_tm()); //出荷希望日時
			dest.ship_schd_tm(src.ship_schd_tm()); //出荷予定日時
			dest.dlv_schd_tm(src.dlv_schd_tm()); //納品予定日時
			dest.ship_term_cd(src.ship_term_cd()); //出荷条件ＣＤ
			dest.ship_wk_cd(src.ship_wk_cd()); //出荷作業ＣＤ
			dest.itm_cd(src.itm_cd()); //品目ＣＤ
			dest.itm_sub1(src.itm_sub1()); //枝番１
			dest.itm_sub2(src.itm_sub2()); //枝番２
			dest.itm_sub3(src.itm_sub3()); //枝番３
			dest.itm_nm(src.itm_nm()); //品名
			dest.iv_itm_nm(src.iv_itm_nm()); //インボイス表記用品名
			dest.sundry_itm_flg(src.sundry_itm_flg()); //諸口品ＦＬＧ
			dest.sno1(src.sno1()); //手配ＮＯ１
			dest.sno1_null_flg(src.sno1_null_flg()); //手配ＮＯ１無し可ＦＬＧ
			dest.sno2(src.sno2()); //手配ＮＯ２
			dest.sno2_null_flg(src.sno2_null_flg()); //手配ＮＯ２無し可ＦＬＧ
			dest.sno3(src.sno3()); //手配ＮＯ３
			dest.sno3_null_flg(src.sno3_null_flg()); //手配ＮＯ３無し可ＦＬＧ
			dest.sno4(src.sno4()); //手配ＮＯ４
			dest.sno4_null_flg(src.sno4_null_flg()); //手配ＮＯ４無し可ＦＬＧ
			dest.lot_no(src.lot_no()); //ロットＮＯ
			dest.sublot_no(src.sublot_no()); //サブロットＮＯ
			dest.ver_no(src.ver_no()); //版ＮＯ			
			dest.stk_arrv_bp_cd(src.stk_arrv_bp_cd()); //在庫着荷先ＣＤ
			dest.gd_cd(src.gd_cd()); //格付ＣＤ
			dest.quality_typ(src.quality_typ()); //良品区分			
			dest.stk_id_typ(src.stk_id_typ()); //在庫識別区分			
			dest.stk_bp_cd(src.stk_bp_cd()); //在庫取引先ＣＤ
			dest.trd_unit_qty(src.trd_unit_qty()); //取引単位数量
			dest.trd_unit_cd(src.trd_unit_cd()); //取引単位ＣＤ
			dest.base_unit_qty(src.base_unit_qty()); //基準単位数量
			dest.base_unit_cd(src.base_unit_cd()); //基準単位ＣＤ
			dest.abort_flg(src.abort_flg()); //打切ＦＬＧ
			dest.fix_flg(src.fix_flg()); //確定ＦＬＧ			
			dest.ship_block_flg(src.ship_block_flg());//出荷留めＦＬＧ
			dest.inst_bndl_flg(src.inst_bndl_flg()); //指図まとめＦＬＧ
			dest.not_lot_mix_flg(src.not_lot_mix_flg()); //ロット混在ＦＬＧ
			dest.not_sublot_mix_flg(src.not_sublot_mix_flg()); //サブロット混在ＦＬＧ
			dest.vld_dt_fr(src.vld_dt_fr()); //有効期限ＦＲＯＭ
			dest.vld_dt_to(src.vld_dt_to()); //有効期限ＴＯ
			dest.re_ship_schd_flg(src.re_ship_schd_flg()); //再出荷予定ＦＬＧ
			dest.intr_rmrks(src.intr_rmrks()); //内部備考
			dest.trd_rmrks(src.trd_rmrks()); //取引備考
			dest.trd_d_rmrks(src.trd_d_rmrks()); //取引明細備考
			dest.ship_cnt_rmrks(src.ship_cnt_rmrks()); //出荷連絡備考
			dest.sub_char1(src.sub_char1()); //予備１
			dest.sub_char2(src.sub_char2()); //予備２
			dest.sub_char3(src.sub_char3()); //予備３
			dest.inst_qty(null); //指図数量（基準単位）
			dest.inst_unit_cd(null); //指図単位ＣＤ
			dest.inst_ship_schd_tm(null); //指図出荷予定日時
			dest.inst_dlv_schd_tm(null); //指図納品予定日時			
			dest.ship_schd_split_flg(false); //出荷予定分割ＦＬＧ
		}
	}

	protected Map_MST_SLS_SCHD_R_Sls_Schd_Upd01_DtlR<MST_SLS_SCHD_R, Sls_Schd_Upd01_DtlR> createMap_MST_SLS_SCHD_R_Sls_Schd_Upd01_DtlR() {
		return new Map_MST_SLS_SCHD_R_Sls_Schd_Upd01_DtlR<MST_SLS_SCHD_R, Sls_Schd_Upd01_DtlR>();
	}

	public class Map_MST_SLS_SCHD_R_Sls_Schd_Upd01_DtlR<D extends MST_SLS_SCHD_R, S extends Sls_Schd_Upd01_DtlR>
			extends MCRowMapper<D, S> {
		@Override
		public void valueCopy(D dest, S src) {
			if (!src.getBooleanNE("uplnd_iv_flg")) {
				dest.sls_schd_no(getStrSeq(MSC_NUM_SYS_TYP.SLSSCHD)); //売上予定ＮＯ: 定数.発番システム区分.売上予定NOにより発番
			}
			dest.sls_schd_src_typ(src.sls_schd_src_typ());//売上予定作成元区分
			dest.slo_d_no(src.slo_d_no());//受注明細ＮＯ
			dest.dlv_inst_rcpt_no(src.dlv_inst_rcpt_no());//納入指示受領ＮＯ
			dest.ship_schd_no(src.ship_schd_no());//出荷予定ＮＯ
			dest.ship_inst_d_no(src.ship_inst_d_no());//出荷指図明細ＮＯ
			dest.dlv_slip_d_no(src.dlv_slip_d_no());//納品書明細ＮＯ
			dest.sls_schd_dt(src.sls_schd_dt());//売上予定日
			dest.trd_unit_cd(src.trd_unit_cd());//取引単位ＣＤ
			dest.trd_unit_qty(src.trd_unit_qty());//取引単位数量
			dest.base_unit_cd(src.base_unit_cd());//基準単位ＣＤ
			dest.base_unit_qty(src.base_unit_qty());//基準単位数量
			dest.cmpl_flg(false);//完了ＦＬＧ
			dest.not_auto_sls_flg(false);//バッチ処理対象外ＦＬＧ
			dest.abort_flg(false);//打切ＦＬＧ
			dest.sls_ac_abl_flg(false);//売上計上可能ＦＬＧ
			dest.base_unit_abort_qty(0);//基準単位打切数量
			dest.base_unit_sls_qty(0);//基準単位売上数量
			dest.sub_char1(null);//予備１
			dest.sub_char2(null);//予備２
			dest.sub_char3(null);//予備３
		}
	}

	protected Map_MST_SLS_SCHD_R_Sls_Schd_Upd02_DtlR<MST_SLS_SCHD_R, Sls_Schd_Upd02_DtlR> createMap_MST_SLS_SCHD_R_Sls_Schd_Upd02_DtlR() {
		return new Map_MST_SLS_SCHD_R_Sls_Schd_Upd02_DtlR<MST_SLS_SCHD_R, Sls_Schd_Upd02_DtlR>();
	}

	public class Map_MST_SLS_SCHD_R_Sls_Schd_Upd02_DtlR<D extends MST_SLS_SCHD_R, S extends Sls_Schd_Upd02_DtlR>
			extends MCRowMapper<D, S> {
		@Override
		public void valueCopy(D dest, S src) {
			dest.sls_schd_no(getStrSeq(MSC_NUM_SYS_TYP.SLSSCHD)); //売上予定ＮＯ: 定数.発番システム区分.売上予定NOにより発番
			dest.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.SHIP_ACT.value());//売上予定作成元区分
			dest.slo_d_no(src.slo_d_no());//受注明細ＮＯ
			dest.ship_schd_no(src.ship_schd_no());//出荷予定ＮＯ
			dest.dlv_slip_d_no(src.dlv_slip_d_no());//納品書明細ＮＯ
			dest.sls_schd_dt(src.sls_schd_dt());//売上予定日
			dest.base_unit_cd(src.base_unit_cd());//基準単位ＣＤ
			dest.base_unit_qty(src.base_unit_qty());//基準単位数量
			dest.cmpl_flg(false);//完了ＦＬＧ
			dest.not_auto_sls_flg(false);//バッチ処理対象外ＦＬＧ
			dest.abort_flg(false);//打切ＦＬＧ
			dest.base_unit_abort_qty(0);
			dest.sls_ac_abl_flg(true);//売上計上可能ＦＬＧ
			dest.sub_char1(null);//予備１
			dest.sub_char2(null);//予備２
			dest.sub_char3(null);//予備３
		}

	}

	protected Map_MST_SLS_SCHD_R_MST_SHIP_SCHD_R<MST_SLS_SCHD_R, MST_SHIP_SCHD_R> createMap_MST_SLS_SCHD_R_MST_SHIP_SCHD_R() {
		return new Map_MST_SLS_SCHD_R_MST_SHIP_SCHD_R<MST_SLS_SCHD_R, MST_SHIP_SCHD_R>();
	}

	public class Map_MST_SLS_SCHD_R_MST_SHIP_SCHD_R<D extends MST_SLS_SCHD_R, S extends MST_SHIP_SCHD_R>
			extends MCRowMapper<D, S> {
		@Override
		public void valueCopy(D dest, S src) {
			dest.sls_schd_no(getStrSeq(MSC_NUM_SYS_TYP.SLSSCHD)); //売上予定ＮＯ: 定数.発番システム区分.売上予定NOにより発番
			dest.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.SHIP_ACT.value());//売上予定作成元区分
			dest.dlv_inst_rcpt_no(src.dlv_inst_rcpt_no());//納入指示受領ＮＯ
			dest.ship_schd_no(src.ship_schd_no());//出荷予定ＮＯ
			dest.ship_inst_d_no(src.ship_inst_d_no());//出荷指図明細ＮＯ
			dest.base_unit_cd(src.base_unit_cd());//基準単位ＣＤ
			dest.base_unit_qty(src.base_unit_qty().subtract(src.ship_act_qty()));//基準単位数量:基準単位数量－出荷実績数
			dest.cmpl_flg(false);//完了ＦＬＧ
			dest.not_auto_sls_flg(false);//バッチ処理対象外ＦＬＧ
			dest.abort_flg(false);//打切ＦＬＧ
			dest.sls_ac_abl_flg(false);//売上計上可能ＦＬＧ
			dest.base_unit_abort_qty(0);//基準単位打切数量
			dest.base_unit_sls_qty(0);//基準単位売上数量
			dest.sub_char1(null);//予備１
			dest.sub_char2(null);//予備２
			dest.sub_char3(null);//予備３
		}
	}

	protected Map_IoSchd_Ins01_DtlR_MST_SHIP_ACT_D_R<IoSchd_Ins01_DtlR, MST_SHIP_ACT_D_R> createMap_IoSchd_Ins01_DtlR_MST_SHIP_ACT_D_R() {
		return new Map_IoSchd_Ins01_DtlR_MST_SHIP_ACT_D_R<IoSchd_Ins01_DtlR, MST_SHIP_ACT_D_R>();
	}

	public class Map_IoSchd_Ins01_DtlR_MST_SHIP_ACT_D_R<D extends IoSchd_Ins01_DtlR, S extends MST_SHIP_ACT_D_R>
			extends MCRowMapper<D, S> {
		@Override
		public void valueCopy(D dest, S src) {
			dest.io_schd_typ(MSC_IO_SCHD_TYP.SLS.value()); //受払予定区分
			dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SHIP.value()); //受払予定状況区分
			dest.io_schd_no(src.ship_act_d_no()); //受払予定ＮＯ
			dest.io_schd_seq(null); //受払予定連番
			dest.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.SLO_NO.value()); //受払予定予備区分１
			dest.io_schd_sub_typ2(MSC_IO_SCHD_SUB_TYP.SLO_D_NO.value()); //受払予定予備区分２
			dest.io_schd_sub_typ3(MSC_IO_SCHD_SUB_TYP.SHIP_SCHD_NO.value()); //受払予定予備区分３
			dest.io_schd_pr_no(src.io_schd_pr_no()); //受払進捗管理ＮＯ
			dest.itm_cd(src.itm_cd()); //品目ＣＤ
			dest.itm_sub1(src.itm_sub1()); //枝番１
			dest.itm_sub2(src.itm_sub2()); //枝番２
			dest.itm_sub3(src.itm_sub3()); //枝番３
			dest.ver_no(src.ver_no()); //版ＮＯ
			dest.loc_cd(src.ship_loc_cd()); //場所ＣＤ
			dest.str_ln_cd(src.ship_str_ln_cd()); //棚・ラインＣＤ
			dest.stk_arrv_bp_cd(src.dlv_id_cd()); //在庫着荷先ＣＤ
			dest.lot_no(src.lot_no()); //ロットＮＯ
			dest.sublot_no(src.sublot_no()); //サブロットＮＯ
			dest.sno1(src.sno1()); //手配ＮＯ１
			dest.sno2(src.sno2()); //手配ＮＯ２
			dest.sno3(src.sno3()); //手配ＮＯ３
			dest.sno4(src.sno4()); //手配ＮＯ４
			dest.trd_unit_cd(src.trd_unit_cd()); //取引単位ＣＤ
			dest.trd_unit_qty(src.trd_unit_qty()); //取引単位数量
			dest.base_unit_cd(src.base_unit_cd()); //基準単位ＣＤ
			dest.base_unit_qty(src.base_unit_qty()); //基準単位数量
			dest.gd_cd(src.gd_cd()); //格付ＣＤ
			dest.quality_typ(src.quality_typ()); //良品区分
			dest.stk_insp_typ(src.stk_insp_typ()); //在庫検査区分
			dest.stk_id_typ(src.stk_id_typ()); //在庫識別区分
			dest.stk_bp_cd(src.stk_bp_cd()); //在庫取引先ＣＤ
			dest.alloc_flg(true); //場所引当ＦＬＧ			
		}
	}

	protected Map_IoSchd_Ins01_DtlR_MST_IV_SHIP_ACT_D_R<IoSchd_Ins01_DtlR, MST_IV_SHIP_ACT_D_R> createMap_IoSchd_Ins01_DtlR_MST_IV_SHIP_ACT_D_R() {
		return new Map_IoSchd_Ins01_DtlR_MST_IV_SHIP_ACT_D_R<IoSchd_Ins01_DtlR, MST_IV_SHIP_ACT_D_R>();
	}

	public class Map_IoSchd_Ins01_DtlR_MST_IV_SHIP_ACT_D_R<D extends IoSchd_Ins01_DtlR, S extends MST_IV_SHIP_ACT_D_R>
			extends MCRowMapper<D, S> {
		@Override
		public void valueCopy(D dest, S src) {
			dest.io_schd_typ(MSC_IO_SCHD_TYP.SLS.value()); //受払予定区分
			dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.EX.value()); //受払予定状況区分
			dest.io_schd_no(src.iv_ship_act_d_no()); //受払予定ＮＯ
			dest.io_schd_seq(null); //受払予定連番
			// 各種ＮＯはmapperの外で設定する
			dest.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.SLO_NO.value()); //受払予定予備区分１
			dest.io_schd_sub_typ2(MSC_IO_SCHD_SUB_TYP.SLO_D_NO.value()); //受払予定予備区分２	
			dest.io_schd_sub_typ3(MSC_IO_SCHD_SUB_TYP.SHIP_SCHD_NO.value()); //受払予定予備区分３
			dest.io_schd_pr_no(src.io_schd_pr_no()); //受払進捗管理ＮＯ
			dest.itm_cd(src.itm_cd()); //品目ＣＤ
			dest.itm_sub1(src.itm_sub1()); //枝番１
			dest.itm_sub2(src.itm_sub2()); //枝番２
			dest.itm_sub3(src.itm_sub3()); //枝番３
			dest.ver_no(null); //版ＮＯ
			dest.loc_cd(src.ship_loc_cd()); //場所ＣＤ
			dest.str_ln_cd(src.ship_str_ln_cd()); //棚・ラインＣＤ
			dest.stk_arrv_bp_cd(src.stk_arrv_bp_cd()); //在庫着荷先ＣＤ
			dest.lot_no(src.lot_no()); //ロットＮＯ
			dest.sublot_no(src.sublot_no()); //サブロットＮＯ
			dest.sno1(src.sno1()); //手配ＮＯ１
			dest.sno2(src.sno2()); //手配ＮＯ２
			dest.sno3(src.sno3()); //手配ＮＯ３
			dest.sno4(src.sno4()); //手配ＮＯ４
			dest.trd_unit_cd(src.trd_unit_cd()); //取引単位ＣＤ
			dest.trd_unit_qty(src.trd_unit_qty()); //取引単位数量
			dest.base_unit_cd(src.base_unit_cd()); //基準単位ＣＤ
			dest.base_unit_qty(src.base_unit_qty()); //基準単位数量
			dest.gd_cd(src.gd_cd()); //格付ＣＤ			
			dest.quality_typ(src.quality_typ()); //良品区分
			dest.stk_insp_typ(src.stk_insp_typ()); //在庫検査区分
			dest.stk_id_typ(src.stk_id_typ()); //在庫識別区分
			dest.stk_bp_cd(src.stk_bp_cd()); //在庫取引先ＣＤ
			dest.alloc_flg(true); //場所引当ＦＬＧ
		}
	}

	protected Map_IoSchd_Ins01_DtlR_MST_SLO_D_R<IoSchd_Ins01_DtlR, MST_SLO_D_R> createMap_IoSchd_Ins01_DtlR_MST_SLO_D_R() {
		return new Map_IoSchd_Ins01_DtlR_MST_SLO_D_R<IoSchd_Ins01_DtlR, MST_SLO_D_R>();
	}

	public class Map_IoSchd_Ins01_DtlR_MST_SLO_D_R<D extends IoSchd_Ins01_DtlR, S extends MST_SLO_D_R>
			extends MCRowMapper<D, S> {
		@Override
		public void valueCopy(D dest, S src) {
			dest.io_schd_typ(MSC_IO_SCHD_TYP.SLS.value()); //受払予定区分
			dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.DDLV_SLO.value()); //受払予定状況区分
			dest.io_schd_seq(null); //受払予定連番
			//受払予定予備区分１に受注NO
			dest.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.SLO_NO.value()); //受払予定予備区分１
			//受払予定予備ＮＯ１に受注NOで設定する			
			dest.io_schd_sub_no1(src.slo_no()); //受払予定予備ＮＯ１
			dest.io_schd_sub_typ2(MSC_IO_SCHD_SUB_TYP.SLO_D_NO.value()); //受払予定予備区分２
			dest.io_schd_sub_no2(src.slo_d_no()); //受払予定予備ＮＯ２
			dest.io_schd_pr_no(null); //受払進捗管理ＮＯ
			dest.itm_cd(src.itm_cd()); //品目ＣＤ
			dest.itm_sub1(src.itm_sub1()); //枝番１
			dest.itm_sub2(src.itm_sub2()); //枝番２
			dest.itm_sub3(src.itm_sub3()); //枝番３
			dest.loc_cd(nvl(src.loc_cd(), src.def_loc_cd())); //場所ＣＤ
			dest.str_ln_cd(src.str_ln_cd()); //棚・ラインＣＤ
			dest.lot_no(src.lot_no()); //ロットＮＯ
			dest.sublot_no(src.sublot_no()); //サブロットＮＯ
			dest.sno1(src.sno1()); //手配ＮＯ１
			dest.sno1_null_flg(src.sno1_null_flg()); //手配ＮＯ１無し可ＦＬＧ
			dest.sno2(src.sno2()); //手配ＮＯ２
			dest.sno2_null_flg(src.sno2_null_flg()); //手配ＮＯ２無し可ＦＬＧ
			dest.sno3(src.sno3()); //手配ＮＯ３
			dest.sno3_null_flg(src.sno3_null_flg()); //手配ＮＯ３無し可ＦＬＧ
			dest.sno4(src.sno4()); //手配ＮＯ４
			dest.sno4_null_flg(src.sno4_null_flg()); //手配ＮＯ４無し可ＦＬＧ
			dest.gd_cd(src.gd_cd()); //格付ＣＤ			
			dest.quality_typ(MAC_QUALITY_TYP.GOOD.value()); //良品区分
			dest.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value()); //在庫検査区分
			dest.stk_id_typ(MSC_STK_ID_TYP.COSTK.value()); //在庫識別区分
			dest.stk_bp_cd(null); //在庫取引先ＣＤ
			dest.alloc_flg(false); //場所引当ＦＬＧ
			//引当範囲区分
			dest.alloc_scope_typ(src.alloc_scope_typ());
			dest.rsn_cd(src.sls_rsn_cd());
		}
	}
			
	protected Map_IoSchd_Ins01_DtlR_MST_WG_RQST_R<IoSchd_Ins01_DtlR, MST_WG_RQST_R> createMap_IoSchd_Ins01_DtlR_MST_WG_RQST_R() {
		return new Map_IoSchd_Ins01_DtlR_MST_WG_RQST_R<IoSchd_Ins01_DtlR, MST_WG_RQST_R>();
	}

	public class Map_IoSchd_Ins01_DtlR_MST_WG_RQST_R<D extends IoSchd_Ins01_DtlR, S extends MST_WG_RQST_R>
			extends MCRowMapper<D, S> {
		@Override
		public void valueCopy(D dest, S src) {
			dest.itm_cd(src.itm_cd()); //品目ＣＤ
			dest.itm_sub1(src.itm_sub1()); //枝番１
			dest.itm_sub2(src.itm_sub2()); //枝番２
			dest.itm_sub3(src.itm_sub3()); //枝番３
			dest.loc_cd(src.gr_loc_cd()); //場所ＣＤ
			dest.str_ln_cd(src.gr_str_ln_cd()); //棚・ラインＣＤ
			dest.lot_no(src.lot_no()); //ロットＮＯ
			dest.sublot_no(src.sublot_no()); //サブロットＮＯ
			dest.sno1(src.sno1()); //手配ＮＯ１
			dest.sno1_null_flg(src.sno1_null_flg()); //手配ＮＯ１無し可ＦＬＧ
			dest.sno2(src.sno2()); //手配ＮＯ２
			dest.sno2_null_flg(src.sno2_null_flg()); //手配ＮＯ２無し可ＦＬＧ
			dest.sno3(src.sno3()); //手配ＮＯ３
			dest.sno3_null_flg(src.sno3_null_flg()); //手配ＮＯ３無し可ＦＬＧ
			dest.sno4(src.sno4()); //手配ＮＯ４
			dest.sno4_null_flg(src.sno4_null_flg()); //手配ＮＯ４無し可ＦＬＧ
			dest.gd_cd(src.gd_cd()); //格付ＣＤ
		}
	}

	protected Map_IoSchd_Ins01_DtlR_MST_SHIP_ALLOC_STS_R<IoSchd_Ins01_DtlR, MST_SHIP_ALLOC_STS_R> createMap_IoSchd_Ins01_DtlR_MST_SHIP_ALLOC_STS_R() {
		return new Map_IoSchd_Ins01_DtlR_MST_SHIP_ALLOC_STS_R<IoSchd_Ins01_DtlR, MST_SHIP_ALLOC_STS_R>();
	}

	public class Map_IoSchd_Ins01_DtlR_MST_SHIP_ALLOC_STS_R<D extends IoSchd_Ins01_DtlR, S extends MST_SHIP_ALLOC_STS_R>
			extends MCRowMapper<D, S> {
		@Override
		public void valueCopy(D dest, S src) {
			dest.io_schd_typ(MSC_IO_SCHD_TYP.SLS.value()); //受払予定区分			
			dest.io_schd_seq(null); //受払予定連番
			//受払予定予備区分１に受注NO
			dest.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.SLO_NO.value()); //受払予定予備区分１
			//受払予定予備ＮＯ１に受注NOで設定する			
			dest.io_schd_sub_typ2(MSC_IO_SCHD_SUB_TYP.SLO_D_NO.value()); //受払予定予備区分２			
			dest.io_schd_sub_seq2(null); //受払予定予備連番２
			dest.io_schd_pr_no(null); //受払進捗管理ＮＯ			
			dest.loc_cd(src.ship_loc_cd()); //場所ＣＤ
			dest.str_ln_cd(src.ship_str_ln_cd()); //棚・ラインＣＤ
			dest.lot_no(src.lot_no()); //ロットＮＯ
			dest.sublot_no(src.sublot_no()); //サブロットＮＯ
			dest.sno1(src.sno1()); //手配ＮＯ１
			dest.sno1_null_flg(src.sno1_null_flg()); //手配ＮＯ１無し可ＦＬＧ
			dest.sno2(src.sno2()); //手配ＮＯ２
			dest.sno2_null_flg(src.sno2_null_flg()); //手配ＮＯ２無し可ＦＬＧ
			dest.sno3(src.sno3()); //手配ＮＯ３
			dest.sno3_null_flg(src.sno3_null_flg()); //手配ＮＯ３無し可ＦＬＧ
			dest.sno4(src.sno4()); //手配ＮＯ４
			dest.sno4_null_flg(src.sno4_null_flg()); //手配ＮＯ４無し可ＦＬＧ
			dest.gd_cd(src.gd_cd()); //格付ＣＤ		
			dest.vld_dt_fr(src.vld_dt_fr());
			dest.vld_dt_to(src.vld_dt_to());
			dest.quality_typ(MAC_QUALITY_TYP.GOOD.value()); //良品区分
			dest.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value()); //在庫検査区分
			dest.stk_id_typ(MSC_STK_ID_TYP.COSTK.value()); //在庫識別区分
			dest.stk_bp_cd(null); //在庫取引先ＣＤ
			dest.alloc_flg(true); //場所引当ＦＬＧ
			//引当範囲区分
			dest.alloc_scope_typ(src.alloc_scope_typ());
		}
	}

	protected Map_MST_SLS_SCHD_R_Sls_Schd_Upd04_DtlR<MST_SLS_SCHD_R, Sls_Schd_Upd04_DtlR> createMap_MST_SLS_SCHD_R_Sls_Schd_Upd04_DtlR() {
		return new Map_MST_SLS_SCHD_R_Sls_Schd_Upd04_DtlR<MST_SLS_SCHD_R, Sls_Schd_Upd04_DtlR>();
	}

	public class Map_MST_SLS_SCHD_R_Sls_Schd_Upd04_DtlR<D extends MST_SLS_SCHD_R, S extends Sls_Schd_Upd04_DtlR>
			extends MCRowMapper<D, S> {
		@Override
		public void valueCopy(D dest, S src) {
			dest.sls_schd_no(getStrSeq(MSC_NUM_SYS_TYP.SLSSCHD)); //売上予定ＮＯ: 定数.発番システム区分.売上予定NOにより発番
			dest.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.WG_RQST.value());//売上予定作成元区分
			dest.slo_d_no(src.slo_d_no()); //受注明細NO
			dest.dlv_inst_rcpt_no(null); //納入指示受領ＮＯ
			dest.ship_schd_no(src.ship_schd_no()); //出荷予定ＮＯ
			dest.wg_rqst_no(src.wg_rqst_no()); //WG間依頼ＮＯ
			dest.sls_schd_dt(src.sls_schd_dt()); //売上予定日
			dest.trd_unit_cd(src.trd_unit_cd()); //取引単位ＣＤ
			dest.trd_unit_qty(src.trd_unit_qty()); //取引単位数量
			dest.base_unit_cd(src.base_unit_cd()); //基準単位ＣＤ
			dest.base_unit_qty(src.base_unit_qty()); //基準単位数
			dest.cmpl_flg(false);//完了ＦＬＧ
			dest.not_auto_sls_flg(false);//バッチ処理対象外ＦＬＧ
			dest.abort_flg(false);//打切ＦＬＧ
			dest.sls_ac_abl_flg(false); //売上計上可能ＦＬＧ
			dest.base_unit_abort_qty(0); //基準単位打切数量
			dest.base_unit_sls_qty(0); //基準単位売上数量
		}
	}

	protected Map_MST_SLS_SCHD_R_Sls_Schd_Upd05_DtlR<MST_SLS_SCHD_R, Sls_Schd_Upd05_DtlR> createMap_MST_SLS_SCHD_R_Sls_Schd_Upd05_DtlR() {
		return new Map_MST_SLS_SCHD_R_Sls_Schd_Upd05_DtlR<MST_SLS_SCHD_R, Sls_Schd_Upd05_DtlR>();
	}

	public class Map_MST_SLS_SCHD_R_Sls_Schd_Upd05_DtlR<D extends MST_SLS_SCHD_R, S extends Sls_Schd_Upd05_DtlR>
			extends MCRowMapper<D, S> {
		@Override
		public void valueCopy(D dest, S src) {
			dest.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.IV_D.value());//売上予定作成元区分
			dest.slo_d_no(src.slo_d_no()); //受注明細NO
			dest.dlv_inst_rcpt_no(null); //納入指示受領ＮＯ
			dest.ship_schd_no(null); //出荷予定ＮＯ
			dest.ship_inst_d_no(null); //出荷指図明細ＮＯ
			if (src.uplnd_flg()) {
				dest.dlv_slip_d_no(src.dlv_slip_d_no()); //納品書明細ＮＯ
			}
			else {
				dest.dlv_slip_d_no(null); //納品書明細ＮＯ
			}
			dest.iv_d_no(src.iv_d_no()); //インボイス明細ＮＯ
			dest.po_schd_no(null); //発注予定NO
			dest.purc_schd_no(null); //仕入予定ＮＯ
			dest.sls_schd_dt(src.sls_schd_dt()); //売上予定日
			dest.trd_unit_cd(src.trd_unit_cd()); //取引単位ＣＤ
			dest.trd_unit_qty(src.trd_unit_qty()); //取引単位数量
			dest.base_unit_cd(src.base_unit_cd()); //基準単位ＣＤ
			dest.base_unit_qty(src.base_unit_qty()); //基準単位数
			dest.lot_no(null); //ロットＮＯ
			dest.sublot_no(null); //サブロットＮＯ
			dest.cmpl_flg(false);//完了ＦＬＧ
			dest.not_auto_sls_flg(false);//バッチ処理対象外ＦＬＧ
			dest.abort_flg(false);//打切ＦＬＧ
			dest.sls_ac_abl_flg(false); //売上計上可能ＦＬＧ
			dest.base_unit_abort_qty(0); //基準単位打切数量
			dest.base_unit_sls_qty(0); //基準単位売上数量
		}
	}

	protected Map_MST_SLS_SCHD_R_MST_SLO_D_R<MST_SLS_SCHD_R, MST_SLO_D_R> createMap_MST_SLS_SCHD_R_MST_SLO_D_R() {
		return new Map_MST_SLS_SCHD_R_MST_SLO_D_R<MST_SLS_SCHD_R, MST_SLO_D_R>();
	}

	public class Map_MST_SLS_SCHD_R_MST_SLO_D_R<D extends MST_SLS_SCHD_R, S extends MST_SLO_D_R>
			extends MCRowMapper<D, S> {
		@Override
		public void valueCopy(D dest, S src) {
			dest.sls_schd_no(getStrSeq(MSC_NUM_SYS_TYP.SLSSCHD)); //売上予定ＮＯ: 定数.発番システム区分.売上予定NOにより発番
			dest.slo_d_no(src.slo_d_no()); //受注明細NO
			dest.dlv_inst_rcpt_no(null); //納入指示受領ＮＯ
			dest.ship_schd_no(null); //出荷予定ＮＯ
			dest.ship_inst_d_no(null); //出荷指図明細ＮＯ
			dest.dlv_slip_d_no(null); //納品書明細ＮＯ
			dest.iv_no(null); //インボイスＮＯ
			dest.iv_d_no(null); //インボイス明細ＮＯ
			dest.po_schd_no(null); //発注予定NO
			dest.purc_schd_no(null); //仕入予定ＮＯ
			dest.sls_schd_dt(src.sls_schd_dt()); //売上予定日
			dest.trd_unit_cd(src.trd_unit_cd()); //取引単位ＣＤ
			dest.trd_unit_qty(src.trd_unit_qty()); //取引単位数量
			dest.base_unit_cd(src.base_unit_cd()); //基準単位ＣＤ
			dest.base_unit_qty(src.base_unit_qty()); //基準単位数
			dest.lot_no(null); //ロットＮＯ
			dest.sublot_no(null); //サブロットＮＯ
			dest.cmpl_flg(false);//完了ＦＬＧ
			dest.not_auto_sls_flg(false);//バッチ処理対象外ＦＬＧ
			dest.abort_flg(false);//打切ＦＬＧ
			dest.sls_ac_abl_flg(false); //売上計上可能ＦＬＧ
			dest.base_unit_abort_qty(0); //基準単位打切数量
			dest.base_unit_sls_qty(0); //基準単位売上数量
		}
	}

	protected Map_MST_SLS_SCHD_R_MST_WG_RQST_R<MST_SLS_SCHD_R, MST_WG_RQST_R> createMap_MST_SLS_SCHD_R_MST_WG_RQST_R() {
		return new Map_MST_SLS_SCHD_R_MST_WG_RQST_R<MST_SLS_SCHD_R, MST_WG_RQST_R>();
	}

	public class Map_MST_SLS_SCHD_R_MST_WG_RQST_R<D extends MST_SLS_SCHD_R, S extends MST_WG_RQST_R>
			extends MCRowMapper<D, S> {
		@Override
		public void valueCopy(D dest, S src) {
			dest.sls_schd_no(getStrSeq(MSC_NUM_SYS_TYP.SLSSCHD)); //売上予定ＮＯ: 定数.発番システム区分.売上予定NOにより発番
			dest.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.WG_RQST.value());//売上予定作成元区分
			dest.slo_d_no(src.slo_d_no()); //受注明細NO
			dest.dlv_inst_rcpt_no(null); //納入指示受領ＮＯ
			dest.wg_rqst_no(src.wg_rqst_no()); //WG間依頼ＮＯ
			dest.sls_schd_dt(isNull(src.gr_rqst_tm()) ? null : src.gr_rqst_tm().startTimeOfDay()); //売上予定日
			dest.trd_unit_cd(src.trd_unit_cd()); //取引単位ＣＤ
			dest.trd_unit_qty(src.trd_unit_qty()); //取引単位数量
			dest.base_unit_cd(src.base_unit_cd()); //基準単位ＣＤ
			dest.base_unit_qty(src.base_unit_qty()); //基準単位数
			dest.cmpl_flg(false);//完了ＦＬＧ
			dest.not_auto_sls_flg(false);//バッチ処理対象外ＦＬＧ
			dest.abort_flg(false);//打切ＦＬＧ
			dest.sls_ac_abl_flg(false); //売上計上可能ＦＬＧ
			dest.base_unit_abort_qty(0); //基準単位打切数量
			dest.base_unit_sls_qty(0); //基準単位売上数量
		}
	}

	protected Map_MST_SLS_SCHD_R_MST_PO_SCHD_R<MST_SLS_SCHD_R, MST_PO_SCHD_R> createMap_MST_SLS_SCHD_R_MST_PO_SCHD_R() {
		return new Map_MST_SLS_SCHD_R_MST_PO_SCHD_R<MST_SLS_SCHD_R, MST_PO_SCHD_R>();
	}

	public class Map_MST_SLS_SCHD_R_MST_PO_SCHD_R<D extends MST_SLS_SCHD_R, S extends MST_PO_SCHD_R>
			extends MCRowMapper<D, S> {
		@Override
		public void valueCopy(D dest, S src) {
			dest.sls_schd_no(getStrSeq(MSC_NUM_SYS_TYP.SLSSCHD)); //売上予定ＮＯ: 定数.発番システム区分.売上予定NOにより発番
			dest.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.PO_SCHD.value());//売上予定作成元区分
			dest.slo_d_no(src.slo_d_no()); //受注明細NO
			dest.dlv_inst_rcpt_no(null); //納入指示受領ＮＯ
			dest.wg_rqst_no(src.getStringNE("wg_rqst_no")); //WG間依頼ＮＯ
			dest.po_schd_no(src.po_schd_no()); //発注予定NO
			dest.sls_schd_dt(isNull(src.dlv_rqst_tm()) ? null : src.dlv_rqst_tm().startTimeOfDay()); //売上予定日
			dest.trd_unit_cd(src.trd_unit_cd()); //取引単位ＣＤ
			dest.trd_unit_qty(src.trd_unit_qty()); //取引単位数量
			dest.base_unit_cd(src.base_unit_cd()); //基準単位ＣＤ
			dest.base_unit_qty(src.base_unit_qty()); //基準単位数
			dest.cmpl_flg(false);//完了ＦＬＧ
			dest.not_auto_sls_flg(false);//バッチ処理対象外ＦＬＧ
			dest.abort_flg(false);//打切ＦＬＧ
			dest.sls_ac_abl_flg(false); //売上計上可能ＦＬＧ
			dest.base_unit_abort_qty(0); //基準単位打切数量
			dest.base_unit_sls_qty(0); //基準単位売上数量			
		}
	}
	
	protected FXUCL_MCDbcCache<MAM_CUR_R> _curR;
	
	/**
	 * 通貨マスタを取得する
	 * 
	 * @param curCd
	 * @return
	 */
	protected static MAM_CUR_R getCur(String curCd) {
		return object(CLAZZ)._getCur(curCd);
	}
	
	protected MAM_CUR_R _getCur(String curCd) {
		if (_curR == null) {
			_curR = new FXUCL_MCDbcCache<MAM_CUR_R>(MCQueryApiBuilder.create(MAM_CUR_R.create("T")));
		}
		return _curR.get(curCd);
	}

	//FMCB CUSTOM END
}