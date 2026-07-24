package mcframe.serverMSLC.MSLCL5040;

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
import mcframe.serverMAUD.MAUDL1030.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0170.*;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;

import mcframe.serverCore.resource.MCConst;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLCL_ItmOrderSendIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLCL_ItmOrderSendIfService_MC extends MSLCL_ItmOrderSendIfService_MC_A{
	//FMCB CUSTOM START

	/**
	 * Upd01オペレーション.<p>
	 *
	 * ＩＦテーブルの登録処理を実行するオペレーションの基底クラスの実装<br>
	 */
	public class Upd01 extends MSLCL_ItmOrderSendIfService_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void chkUpItemsIndividual() {			
			// 必須チェック
			MCMessageList msgL = new MCMessageList();
			String[] cols = new String[] {
					Upd01_DtlR.$dt_fr,
					Upd01_DtlR.$dt_to };
			
			for (String col : cols) {
				msgL.addAll(check(up0(), col, new FXUCL_RequiredValidater()));
			}
			
			// 日付前後チェック
			msgL.addAll(check(up0(), cols, new FXUCL_BeforeAfterValidater()));
			
			// IF処理区分指定値チェック
			if(!MAC_IF_PROC_TYP.isITM_ORDER_SEND(up0().if_proc_typ())) {
				msgL.add(new MCMessage(MSLCL0001, up0().if_proc_typ()));
			}
			
			// メッセージプールにメッセージ追加
			if(!msgL.isEmpty()) {
				MCMessagePool.addAll(msgL);
			}
		}
		
		@Override
		protected void setUpd02Operation() {			
			// オペレーション設定
			super._upd02ModuleId = "MS";
			super._upd02LogicId = "MSLCL5040";
			super._upd02OperationId = "Upd02";
		}
		
		@Override
		protected void writeStartLog() {
			MCMessagePool.add(MSLCL0021);
		}
		
		@Override
		protected void writeEndLog() {
			MCMessagePool.add(MSLCL0022);
		}
	}
	/**
	 * Upd02オペレーション.<p>
	 *
	 * ＩＦテーブルにレコードを登録する処理の流れを定義したオペレーションの基底クラスの実装<br>
	 */
	public class Upd02 extends MSLCL_ItmOrderSendIfService_MC_A.Upd02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void writeStartLog() {
			// 開始ログを出力する
			writeLogForStartLog(MSLCL0008, getCo().co_cd(), up0().if_proc_typ());
		}
		
		@Override
		protected void setup() {			
			// 1回のフェッチで何件のレコードを取得するか
			super._fetchSize = MCConst.app.getInteger("MS.MSLCL5040.fetch_size", 1000);
			// 1スレッド当たり何件のレコードを処理するか
			super._threadRecordCnt = MCConst.app.getInteger("MS.MSLCL5040.thread_record_cnt", 1000);
			
			// ＤＢＣと条件句の設定
			// ＩＦテーブルから未処理データを抽出するための「検索条件」を親クラスにセットする
			setupUpdBiNotSendFlg();
			// ＩＦテーブルに登録するトランザクションデータを抽出するための「検索条件」を親クラスにセットする
			setupIns();
			// ＩＦテーブルから、削除対象レコードを抽出するための「検索条件」を親クラスにセットする
			setupInsForDlt();
		}
		
		/**
		 * IFテーブルのＢＩ送信対象外ＦＬＧをupdateする処理に必要なデータをセット
		 */
		protected void setupUpdBiNotSendFlg() {		
			String err_sts = "err_sts";
			String not_exe_sts = "not_exe_sts";
			
			MST_ITM_ORDER_IF_R itmOrdrIfR = MST_ITM_ORDER_IF_R.create("T1");
			
			// 最大・最小日付
			MCDateValue[] minMaxDate = getMinMaxDate(itmOrdrIfR);
			MCDateValue minDate = minMaxDate[0];
			MCDateValue maxDate = minMaxDate[1];
			
			// バインド値設定
			MCRow bind = MCRow.create();
			bind.setStringNE(Upd02_DtlR.$ext_sys_cd, up0().ext_sys_cd());
			bind.setDateNE(Upd02_DtlR.$dt_fr, up0().dt_fr());
			bind.setDateNE(Upd02_DtlR.$dt_to, up0().dt_to());
			bind.setBooleanNE(MST_ITM_ORDER_IF_R.$bi_not_send_flg, false);
			bind.setStringNE(err_sts, MAC_EXE_STS_TYP.ERR.value());
			bind.setStringNE(not_exe_sts, MAC_EXE_STS_TYP.NOT_EXE.value());
			super._updBiNotSendFlgBind = bind; 
			
			// QueryBuilder設定
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(itmOrdrIfR);
			builder.addWhereWithAnd(itmOrdrIfR.ext_sys_cd.eq(bind(Upd02_DtlR.$ext_sys_cd)));
			builder.addWhereWithAnd(
					minDate.between(bind(Upd02_DtlR.$dt_fr), bind(Upd02_DtlR.$dt_to))
					.or(maxDate.between(bind(Upd02_DtlR.$dt_fr), bind(Upd02_DtlR.$dt_to))));
			builder.addWhereWithAnd(itmOrdrIfR.bi_not_send_flg.eq(bind(MST_ITM_ORDER_IF_R.$bi_not_send_flg)));
			builder.addWhereWithAnd(itmOrdrIfR.exe_sts_typ.eq(bind(err_sts)).or(itmOrdrIfR.exe_sts_typ.eq(bind(not_exe_sts))));
			super._ifTblUpdBiNotSendFlgBuilder = builder;
			
			// SQLID設定
			super._sqlIdSelectBiNotSendFlg = "MSLCL5040_MST_ITM_ORDER_IF_S01";
			super._sqlIdUpdBiNotSendFlg = "MSLCL5040_MST_ITM_ORDER_IF_U01";
			
			// DBCクラスパス設定
			super._ifTblContainerClassPath = "mcframe.serverMS.dbc.MST_ITM_ORDER_IF_R";
		}

		/**
		 * IFテーブルにレコードを登録する処理に必要なデータをセット
		 */
		protected void setupIns() {	
			
			MST_ITM_ORDER_R itmOrdrR = MST_ITM_ORDER_R.create("T1");
			MST_PO_SCHD_R poSchdR = MST_PO_SCHD_R.create("T2");
			MST_ARR_PR_R arrPrR = MST_ARR_PR_R.create("T3");
			MST_PO_D_R poDR = MST_PO_D_R.create("T4");
			MST_ITM_ORDER_R subItmOrdrR = MST_ITM_ORDER_R.create("ST1");
			
			// 最大・最小日付
			MCDateValue[] minMaxDate = getMinMaxDate(itmOrdrR);
			MCDateValue minDate = minMaxDate[0];
			MCDateValue maxDate = minMaxDate[1];
			
			// バインド値設定
			MCRow bind = MCRow.create();
			bind.setDateNE(Upd02_DtlR.$dt_fr, up0().dt_fr());
			bind.setDateNE(Upd02_DtlR.$dt_to, up0().dt_to());
			super._trnTblExtractBind = bind;
			
			// QueryBuilder設定
			// ※入荷日時の最大値(row_no = 1であるか)の判定は, 「srchPostForInsRecord()」の冒頭で行う
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(itmOrdrR);
			builder.addSelect(arrPrR.arr_pr_no);
			builder.addSelect(arrPrR.arr_tm);
			builder.addSelect(arrPrR.po_d_no);
			builder.addSelect(arrPrR.std_purc_lt);
			builder.addSelect(poDR.dlv_rqst_tm);
			builder.addSelect(poDR.rqst_dlv_rqst_tm);
			builder.addSelect(max(arrPrR.arr_tm).over().partitionBy(itmOrdrR.itm_ord_no).as("max_arr_tm"));
			builder.addSelect(rowNumber().over().partitionBy(itmOrdrR.itm_ord_no, arrPrR.arr_tm).orderBy(nullValue().asc()).as("row_no"));
			
			builder.addLeftOuterJoin(poSchdR, 
					bracket(itmOrdrR.io_schd_pr_no.eq(poSchdR.io_schd_pr_no)
							.and(poSchdR.po_schd_chg_typ.neq(value(MSC_PO_SCHD_CHG_TYP.DIV_DEL.value()))))
					);
			builder.addLeftOuterJoin(arrPrR, 
					poSchdR.po_d_no.eq(arrPrR.po_d_no)
					);
			builder.addLeftOuterJoin(poDR, 
					poSchdR.po_schd_no.eq(poDR.po_schd_no)
					);
			builder.addWhereWithAnd(
					minDate.between(bind(Upd02_DtlR.$dt_fr), bind(Upd02_DtlR.$dt_to))
					.or(maxDate.between(bind(Upd02_DtlR.$dt_fr), bind(Upd02_DtlR.$dt_to)))
					);
			// PostgreSQL環境で実行計画が安定するよう、EXISTSで絞り込む
			builder.addWhereWithAnd(exists(subQuery()
					.select(value("X"))
					.from(subItmOrdrR)
					.where(itmOrdrR.itm_ord_no.eq(subItmOrdrR.itm_ord_no)
							.and(MSC_ITM_ORD_TYP$IS_BI_TGT(subItmOrdrR.itm_ord_typ).eq(value(true)))
							.and(MSC_ITM_ORD_STS_TYP$IS_BI_TGT(subItmOrdrR.itm_ord_sts_typ).eq(value(true))))));
			
			super._trnTblExtractBuilder = builder;
			
			// SQLID設定
			super._sqlIdSelectExtractTrn = "MSLCL5040_MST_ITM_ORDER_S01";
			super._sqlIdInsExtractTrn = "MSLCL5040_MST_ITM_ORDER_IF_I01";
			
			// クラスパス設定
			super._trnTblContainerClassPath = "mcframe.serverMS.dbc.MST_ITM_ORDER_R";
		}
		
		/**
		 * IFテーブルにレコードをinsertする処理(mcframe側で、削除されたレコード用)で使用する親クラスのフィールドをセット
		 */
		protected void setupInsForDlt() {
			String ok_sts = "ok_sts";
			
			MST_ITM_ORDER_IF_R itmOrdrIfR = MST_ITM_ORDER_IF_R.create("T1");
			MST_ITM_ORDER_R itmOrdrR = MST_ITM_ORDER_R.create("T2");
			
			// 最大・最小日付
			MCDateValue[] minMaxDate = getMinMaxDate(itmOrdrIfR);
			MCDateValue minDate = minMaxDate[0];
			MCDateValue maxDate = minMaxDate[1];
			
			// バインド値設定
			MCRow bind = MCRow.create();
			bind.setStringNE(Upd02_DtlR.$ext_sys_cd, up0().ext_sys_cd());
			bind.setDateNE(Upd02_DtlR.$dt_fr, up0().dt_fr());
			bind.setDateNE(Upd02_DtlR.$dt_to, up0().dt_to());
			bind.setStringNE(ok_sts, MAC_EXE_STS_TYP.OK.value());
			super._trnTblExtractDltBind = bind; 
			
			// QueryBuilder設定
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(itmOrdrIfR);
			builder.addWhereWithAnd(notExists(
					subQuery().select(value("X")).from(itmOrdrR).
					where(itmOrdrIfR.itm_ord_no.eq(itmOrdrR.itm_ord_no)
							.and(coalesce(itmOrdrR.po_dt, itmOrdrR.mfg_st_act_dt, itmOrdrR.mfg_end_act_dt, itmOrdrR.insp_st_act_dt, itmOrdrR.insp_end_act_dt).isNotNull())
							.and(MSC_ITM_ORD_TYP$IS_BI_TGT(itmOrdrR.itm_ord_typ).eq(value(true)))
							.and(MSC_ITM_ORD_STS_TYP$IS_BI_TGT(itmOrdrR.itm_ord_sts_typ).eq(value(true))))
					));
			builder.addWhereWithAnd(itmOrdrIfR.exe_sts_typ.eq(bind(ok_sts)));
			builder.addWhereWithAnd(itmOrdrIfR.ext_sys_cd.eq(bind(Upd02_DtlR.$ext_sys_cd)));
			builder.addWhereWithAnd(
					minDate.between(bind(Upd02_DtlR.$dt_fr), bind(Upd02_DtlR.$dt_to))
					.or(maxDate.between(bind(Upd02_DtlR.$dt_fr), bind(Upd02_DtlR.$dt_to))));
			builder.addOrderByAsc(itmOrdrIfR.itm_ord_no);
			super._trnTblExtractDltBuilder = builder;
			
			// PKカラム設定
			_ifTblCmpKeys = new String[] {
					MST_ITM_ORDER_R.$itm_ord_no
				};
			
			super._sqlIdSelectExtractDltTrn = "MSLCL5040_MST_ITM_ORDER_IF_S02";
			super._sqlIdInsExtractDltTrn = "MSLCL5040_MST_ITM_ORDER_IF_I02";
			
		}
		
		// 最小・最大日付取得(IF)
		protected MCDateValue[] getMinMaxDate(MST_ITM_ORDER_IF_R itmOrdrIfR) {
			
			MCDatePermColumn mfgStDtCol = itmOrdrIfR.mfg_st_act_dt;
			MCDatePermColumn mfgEndDtCol = itmOrdrIfR.mfg_end_act_dt;
			MCDatePermColumn inspStDtCol = itmOrdrIfR.insp_st_act_dt;
			MCDatePermColumn inspEndDtCol = itmOrdrIfR.insp_end_act_dt;
			MCDatePermColumn poDtCol = itmOrdrIfR.po_dt;
			MCDatePermColumn arrActTmCol = itmOrdrIfR.arr_act_tm;

			MCDateValue mfgStDt = trunc(coalesce(mfgStDtCol, mfgEndDtCol, inspStDtCol, inspEndDtCol, poDtCol, arrActTmCol), MCDateFmt.DD);
			MCDateValue mfgEndDt = trunc(coalesce(mfgEndDtCol, mfgStDtCol, inspStDtCol, inspEndDtCol, poDtCol, arrActTmCol), MCDateFmt.DD);
			MCDateValue inspStDt = trunc(coalesce(inspStDtCol, mfgStDtCol, mfgEndDtCol, inspEndDtCol, poDtCol, arrActTmCol), MCDateFmt.DD);
			MCDateValue inspEndDt = trunc(coalesce(inspEndDtCol, mfgStDtCol, mfgEndDtCol, inspStDtCol, poDtCol, arrActTmCol), MCDateFmt.DD);
			MCDateValue poDt = trunc(coalesce(poDtCol, mfgStDtCol, mfgEndDtCol, inspStDtCol, inspEndDtCol, arrActTmCol), MCDateFmt.DD);
			MCDateValue arrActTm = trunc(coalesce(arrActTmCol, mfgStDtCol, mfgEndDtCol, inspStDtCol, inspEndDtCol, poDtCol), MCDateFmt.DD);			
			
			// 最小・最大日付
			MCDateValue minDate = least(mfgStDt,mfgEndDt, inspStDt, inspEndDt, poDt, arrActTm);
			MCDateValue maxDate = greatest(mfgStDt,mfgEndDt, inspStDt, inspEndDt, poDt, arrActTm);
			MCDateValue[] minMaxDate = {minDate, maxDate};
			
			return minMaxDate;
		}
		
		// 最小・最大日付取得(トラン)
		protected MCDateValue[] getMinMaxDate(MST_ITM_ORDER_R itmOrdrR) {
			
			MCDatePermColumn mfgStDtCol = itmOrdrR.mfg_st_act_dt;
			MCDatePermColumn mfgEndDtCol = itmOrdrR.mfg_end_act_dt;
			MCDatePermColumn inspStDtCol = itmOrdrR.insp_st_act_dt;
			MCDatePermColumn inspEndDtCol = itmOrdrR.insp_end_act_dt;
			MCDatePermColumn poDtCol = itmOrdrR.po_dt;
			
			MCDateValue mfgStDt = coalesce(mfgStDtCol, mfgEndDtCol, inspStDtCol, inspEndDtCol, poDtCol);
			MCDateValue mfgEndDt = coalesce(mfgEndDtCol, mfgStDtCol, inspStDtCol, inspEndDtCol, poDtCol);
			MCDateValue inspStDt = coalesce(inspStDtCol, mfgStDtCol, mfgEndDtCol, inspEndDtCol, poDtCol);
			MCDateValue inspEndDt = coalesce(inspEndDtCol, mfgStDtCol, mfgEndDtCol, inspStDtCol, poDtCol);
			MCDateValue poDt = coalesce(poDtCol, mfgStDtCol, mfgEndDtCol, inspStDtCol, inspEndDtCol);
			
			// 最小・最大日付
			MCDateValue minDate = least(mfgStDt,mfgEndDt, inspStDt, inspEndDt, poDt);
			MCDateValue maxDate = greatest(mfgStDt,mfgEndDt, inspStDt, inspEndDt, poDt);
			MCDateValue[] minMaxDate = {minDate, maxDate};
			
			return minMaxDate;
		}

		@Override
		protected MCList<MCRow> srchPostForInsRecord(MCList<MCRow> srchTrnRsltL) {			

			// トランの検索結果から、重複した品目オーダＮＯのうち入荷日時が最も大きいものを抽出する
			MCList<MCRow> tgtTrnL =  MCList.create(MCRow.class);
			for (MCRow srchTrnRsltR : srchTrnRsltL) {
				if (srchTrnRsltR.getNumber("row_no").eq(1) && isSame(srchTrnRsltR.getDate("arr_tm"), srchTrnRsltR.getDate("max_arr_tm"))) {
					tgtTrnL.add(srchTrnRsltR);
				}
			}
			
			// IFテーブルから同一キーのレコードを抽出する
			MCList<? extends MCRow> srchIfRsltL = srchSameKeyIfRecord(tgtTrnL);
			
			// キーレコードが重複した場合は最新レコードのみを使用するため、最新レコードを抽出したMCListを作成する
			MCList<? extends MCRow>[] sameKeyGroupL = srchIfRsltL.groupList(MST_ITM_ORDER_IF_R.$itm_ord_no);
			MCList<MCRow> latestIfL = MCList.create(MCRow.class);
			for (MCList<? extends MCRow> sameKeyL : sameKeyGroupL) {
				// 同一キー内で、最新レコードを取得する
				sameKeyL.sort(SortType.DESC, MST_ITM_ORDER_IF_R.$data_upd_ts, MST_ITM_ORDER_IF_R.$upd_ts);
				latestIfL.add(sameKeyL.get(0));
			}
			
			MCIndexKey latestIfLIdxKey = latestIfL.createIndex(MST_ITM_ORDER_IF_R.$itm_ord_no);
			
			// IFテーブルにinsertするデータを作成する
			MCList<MCRow> insL = MCList.create(MCRow.class);
			for (MCRow trnR : tgtTrnL) {
				
				// IFテーブルに同一キーが存在するかをチェックする
				MCRow matchedIfR = latestIfL.getFirst(latestIfLIdxKey, trnR.getStringNE(MST_ITM_ORDER_IF_R.$itm_ord_no));
				
				if (isNull(matchedIfR) 
						|| MAC_DATA_CRUD_TYP.isDEL(matchedIfR.getStringNE(MST_ITM_ORDER_IF_R.$data_crud_typ))) {
					// IFテーブルに同一キーのレコード無しの場合、
					// または最新の同一キーレコードのデータ更新区分が「削除」の場合は、新規レコードのみを登録する
					MCRow insR = MCRow.create();
					copy(insR, trnR, createMap_MST_ITM_ORDER_IF_R_MST_ITM_ORDER_R());
					insL.add(insR);
				}
				else {
					// IFテーブルに同一キーレコード有りの場合、トランの方が新しければ登録対象とする
					MCTimestamp trnTimestamp = trnR.getTimestampNE(MST_ITM_ORDER_R.$upd_ts);
					MCTimestamp ifTimestamp = matchedIfR.getTimestampNE(MST_ITM_ORDER_IF_R.$data_upd_ts);
					if (trnTimestamp.gt(ifTimestamp)) {
						// IFテーブルから取得したデータは「データ更新区分：削除」として登録
						MCRow insDltR = MCRow.create();
						copy(insDltR, matchedIfR, createMap_MST_ITM_ORDER_IF_R_MST_ITM_ORDER_IF_R());
						insL.add(insDltR);
						
						// トランから取得したデータは「データ更新区分：新規」として登録
						MCRow insCrtR = MCRow.create();
						copy(insCrtR, trnR, createMap_MST_ITM_ORDER_IF_R_MST_ITM_ORDER_R());
						insL.add(insCrtR);
					}
				}
			}
			
			// データ行NOをセットする
			setDataLNo(MSC_NUM_SYS_TYP.ITMORDERIF, insL);
						
			return insL;
		}
		
		/**
		 * 品目オーダ送信IFテーブルにて、同一キーレコードを検索する
		 * @param srchTrnRsltL 検索対象のレコードのリスト
		 * @return 検索結果
		 */
		protected MCList<? extends MCRow> srchSameKeyIfRecord(MCList<MCRow> srchTrnRsltL) {
			
			MST_ITM_ORDER_IF_R itmOrdrIfR = MST_ITM_ORDER_IF_R.create();
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(itmOrdrIfR);

			builder.addWhereWithAnd(itmOrdrIfR.ext_sys_cd.eq(value(up0().ext_sys_cd())));
			builder.addWhereWithAnd(itmOrdrIfR.exe_sts_typ.eq(value(MAC_EXE_STS_TYP.OK.value())));
			builder.addWhereWithAnd(itmOrdrIfR.itm_ord_no.eq(bind(MST_ITM_ORDER_IF_R.$itm_ord_no)));
			
			MCList<MST_ITM_ORDER_IF_R> srchIfRslt = MCList.create(MST_ITM_ORDER_IF_R.class);
			dbSelect("MSLCL5040_MST_ITM_ORDER_IF_S03", srchIfRslt, builder, srchTrnRsltL);
			
			return srchIfRslt;
		}
		
		@Override
		protected boolean isExecInsCancelRecord() {
			return true;
		}
		
		@Override
		protected MCList<MCRow> srchPostForInsCancelRecord(MCList<MCRow> srchDelRsltL) {
			
			// 品目オーダNOごとにグループを作成
			MCList<? extends MCRow>[] sameKeyGroupL = srchDelRsltL.groupList(MST_ITM_ORDER_IF_R.$itm_ord_no);
			MCList<MCRow> delL =  MCList.create(MCRow.class);
			
			for (MCList<? extends MCRow> sameKeyL : sameKeyGroupL) {
				// 同一キー内の最新レコードの更新区分より、削除対象であるか判定
				sameKeyL.sort(SortType.DESC, MST_ITM_ORDER_IF_R.$data_upd_ts, MST_ITM_ORDER_IF_R.$upd_ts);
				if(MAC_DATA_CRUD_TYP.isCRT(sameKeyL.get(0).getString(MST_ITM_ORDER_IF_R.$data_crud_typ))) {
					MCRow dltR = MCRow.create();
					copy(dltR, sameKeyL.get(0), createMap_MST_ITM_ORDER_IF_R_MST_ITM_ORDER_IF_R());
					delL.add(dltR);
				}
			}
			
			// データ行NOをセットする
			setDataLNo(MSC_NUM_SYS_TYP.ITMORDERIF, delL);			
			
			return delL;
		}

		@Override
		protected void writeEndLog() {
			if (super._rsltErrNum == 0 && !super._exceptionFlg) {
				if (_rsltTotalNum == 0) {
					writeLogForProcessLog(MAUDL0008);
				}
			}
			
			writeLogForEndLog(MSLCL0009, getCo().co_cd(), super._rsltTotalNum, super._rsltOkNum, super._rsltErrNum, super._rsltCancelNum);
		}

		// RowMapper
		protected Map_MST_ITM_ORDER_IF_R_MST_ITM_ORDER_R<MCRow, MCRow> createMap_MST_ITM_ORDER_IF_R_MST_ITM_ORDER_R() {
			return new Map_MST_ITM_ORDER_IF_R_MST_ITM_ORDER_R<MCRow, MCRow>();
		}

		public class Map_MST_ITM_ORDER_IF_R_MST_ITM_ORDER_R<D extends MCRow, S extends MCRow> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_ITM_ORDER_IF_R.$data_upd_ts, MST_ITM_ORDER_R.$upd_ts);
				
				addColumnPathMap(MST_ITM_ORDER_IF_R.$itm_ord_no, MST_ITM_ORDER_R.$itm_ord_no);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$itm_ord_typ, MST_ITM_ORDER_R.$itm_ord_typ);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$ord_gnrt_typ, MST_ITM_ORDER_R.$ord_gnrt_typ);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$itm_cd, MST_ITM_ORDER_R.$itm_cd);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$itm_sub1, MST_ITM_ORDER_R.$itm_sub1);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$itm_sub2, MST_ITM_ORDER_R.$itm_sub2);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$itm_sub3, MST_ITM_ORDER_R.$itm_sub3);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$strg_loc_cd, MST_ITM_ORDER_R.$strg_loc_cd);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$mfg_loc_cd, MST_ITM_ORDER_R.$mfg_loc_cd);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$mst_mfg_loc_cd, MST_ITM_ORDER_R.$mst_mfg_loc_cd);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sppl_cd, MST_ITM_ORDER_R.$sppl_cd);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$maker_cd, MST_ITM_ORDER_R.$maker_cd);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$rqst_loc_cd, MST_ITM_ORDER_R.$rqst_loc_cd);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$rqst_wg_cd, MST_ITM_ORDER_R.$rqst_wg_cd);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$bom_ptn, MST_ITM_ORDER_R.$bom_ptn);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$oper_ptn, MST_ITM_ORDER_R.$oper_ptn);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$inst_qty, MST_ITM_ORDER_R.$inst_qty);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$yield_schd_qty, MST_ITM_ORDER_R.$yield_schd_qty);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$not_inst_qty, MST_ITM_ORDER_R.$not_inst_qty);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$mfg_inst_unit_typ, MST_ITM_ORDER_R.$mfg_inst_unit_typ);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$inst_yield_schd_qty, MST_ITM_ORDER_R.$inst_yield_schd_qty);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$yield_act_qty, MST_ITM_ORDER_R.$yield_act_qty);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$purc_act_qty, MST_ITM_ORDER_R.$purc_act_qty);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$insp_act_qty, MST_ITM_ORDER_R.$insp_act_qty);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$nmr_qty, MST_ITM_ORDER_R.$nmr_qty);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$dnm_qty, MST_ITM_ORDER_R.$dnm_qty);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$fxd_yield_qty, MST_ITM_ORDER_R.$fxd_yield_qty);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$itm_ord_sts_typ, MST_ITM_ORDER_R.$itm_ord_sts_typ);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$fix_dt, MST_ITM_ORDER_R.$fix_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$blk_flg, MST_ITM_ORDER_R.$blk_flg);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$po_schd_dt, MST_ITM_ORDER_R.$po_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$mrp_po_schd_dt, MST_ITM_ORDER_R.$mrp_po_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$po_dt, MST_ITM_ORDER_R.$po_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$mrp_purc_lt, MST_ITM_ORDER_R.$mrp_purc_lt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$purc_lt, MST_ITM_ORDER_R.$purc_lt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$act_purc_lt, MST_ITM_ORDER_R.$act_purc_lt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$mfg_st_schd_dt, MST_ITM_ORDER_R.$mfg_st_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$mrp_mfg_st_schd_dt, MST_ITM_ORDER_R.$mrp_mfg_st_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$inst_mfg_st_schd_dt, MST_ITM_ORDER_R.$inst_mfg_st_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$mfg_st_act_dt, MST_ITM_ORDER_R.$mfg_st_act_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$mfg_end_schd_dt, MST_ITM_ORDER_R.$mfg_end_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$mrp_mfg_end_schd_dt, MST_ITM_ORDER_R.$mrp_mfg_end_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$inst_mfg_end_schd_dt, MST_ITM_ORDER_R.$inst_mfg_end_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$mfg_end_act_dt, MST_ITM_ORDER_R.$mfg_end_act_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$mrp_mfg_lt, MST_ITM_ORDER_R.$mrp_mfg_lt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$mfg_lt, MST_ITM_ORDER_R.$mfg_lt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$act_mfg_lt, MST_ITM_ORDER_R.$act_mfg_lt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$gi_schd_dt, MST_ITM_ORDER_R.$gi_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$mrp_gi_schd_dt, MST_ITM_ORDER_R.$mrp_gi_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$inst_gi_schd_dt, MST_ITM_ORDER_R.$inst_gi_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$gi_act_dt, MST_ITM_ORDER_R.$gi_act_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$strg_schd_dt, MST_ITM_ORDER_R.$strg_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$mrp_strg_schd_dt, MST_ITM_ORDER_R.$mrp_strg_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$inst_strg_schd_dt, MST_ITM_ORDER_R.$inst_strg_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$strg_act_dt, MST_ITM_ORDER_R.$strg_act_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$xfr_lt, MST_ITM_ORDER_R.$xfr_lt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$accpt_schd_dt, MST_ITM_ORDER_R.$accpt_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$mrp_accpt_schd_dt, MST_ITM_ORDER_R.$mrp_accpt_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$inst_accpt_schd_dt, MST_ITM_ORDER_R.$inst_accpt_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$accpt_act_dt, MST_ITM_ORDER_R.$accpt_act_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$accpt_insp_lt, MST_ITM_ORDER_R.$accpt_insp_lt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$insp_st_schd_dt, MST_ITM_ORDER_R.$insp_st_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$mrp_insp_st_schd_dt, MST_ITM_ORDER_R.$mrp_insp_st_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$inst_insp_st_schd_dt, MST_ITM_ORDER_R.$inst_insp_st_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$insp_st_act_dt, MST_ITM_ORDER_R.$insp_st_act_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$insp_end_schd_dt, MST_ITM_ORDER_R.$insp_end_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$mrp_insp_end_schd_dt, MST_ITM_ORDER_R.$mrp_insp_end_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$inst_insp_end_schd_dt, MST_ITM_ORDER_R.$inst_insp_end_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$insp_end_act_dt, MST_ITM_ORDER_R.$insp_end_act_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$insp_lt, MST_ITM_ORDER_R.$insp_lt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$insp_offst, MST_ITM_ORDER_R.$insp_offst);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$mrp_avl_schd_dt, MST_ITM_ORDER_R.$mrp_avl_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$avl_schd_dt, MST_ITM_ORDER_R.$avl_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$master_dt, MST_ITM_ORDER_R.$master_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sno1, MST_ITM_ORDER_R.$sno1);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sno2, MST_ITM_ORDER_R.$sno2);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sno3, MST_ITM_ORDER_R.$sno3);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sno4, MST_ITM_ORDER_R.$sno4);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$lmt_dt, MST_ITM_ORDER_R.$lmt_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$wg_cd, MST_ITM_ORDER_R.$wg_cd);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$rqmt_no, MST_ITM_ORDER_R.$rqmt_no);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$intr_rmrks, MST_ITM_ORDER_R.$intr_rmrks);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$inst_itm_ord_sts_typ, MST_ITM_ORDER_R.$inst_itm_ord_sts_typ);
				
				addColumnPathMap(MST_ITM_ORDER_IF_R.$arr_act_tm, MST_ARR_PR_R.$arr_tm);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$arr_pr_no, MST_ARR_PR_R.$arr_pr_no);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$po_d_no, MST_ARR_PR_R.$po_d_no);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$std_purc_lt, MST_ARR_PR_R.$std_purc_lt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$dlv_rqst_tm, MST_PO_D_R.$dlv_rqst_tm);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$rqst_dlv_rqst_tm, MST_PO_D_R.$rqst_dlv_rqst_tm);
				
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sub_char1, MST_ITM_ORDER_R.$sub_char1);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sub_char2, MST_ITM_ORDER_R.$sub_char2);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sub_char3, MST_ITM_ORDER_R.$sub_char3);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.setNumberNE(MST_ITM_ORDER_IF_R.$data_no, up0().data_no());
				dest.setStringNE(MST_ITM_ORDER_IF_R.$exe_sts_typ, MAC_EXE_STS_TYP.NOT_EXE.value());
				dest.setStringNE(MST_ITM_ORDER_IF_R.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
				dest.setStringNE(MST_ITM_ORDER_IF_R.$ext_sys_cd, up0().ext_sys_cd());
				dest.setBooleanNE(MST_ITM_ORDER_IF_R.$bi_not_send_flg, false);
			}
		}
		
		protected Map_MST_ITM_ORDER_IF_R_MST_ITM_ORDER_IF_R<MCRow, MCRow> createMap_MST_ITM_ORDER_IF_R_MST_ITM_ORDER_IF_R() {
			return new Map_MST_ITM_ORDER_IF_R_MST_ITM_ORDER_IF_R<MCRow, MCRow>();
		}

		public class Map_MST_ITM_ORDER_IF_R_MST_ITM_ORDER_IF_R<D extends MCRow, S extends MCRow> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_ITM_ORDER_IF_R.$ext_sys_cd, MST_ITM_ORDER_IF_R.$ext_sys_cd);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$dpt_st_dt, MST_ITM_ORDER_IF_R.$dpt_st_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$data_upd_ts, MST_ITM_ORDER_IF_R.$data_upd_ts);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$bi_not_send_flg, MST_ITM_ORDER_IF_R.$bi_not_send_flg);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$arr_act_tm, MST_ITM_ORDER_IF_R.$arr_act_tm);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$itm_ord_no, MST_ITM_ORDER_IF_R.$itm_ord_no);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$itm_ord_typ, MST_ITM_ORDER_IF_R.$itm_ord_typ);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$ord_gnrt_typ, MST_ITM_ORDER_IF_R.$ord_gnrt_typ);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$itm_cd, MST_ITM_ORDER_IF_R.$itm_cd);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$itm_sub1, MST_ITM_ORDER_IF_R.$itm_sub1);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$itm_sub2, MST_ITM_ORDER_IF_R.$itm_sub2);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$itm_sub3, MST_ITM_ORDER_IF_R.$itm_sub3);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$strg_loc_cd, MST_ITM_ORDER_IF_R.$strg_loc_cd);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$mfg_loc_cd, MST_ITM_ORDER_IF_R.$mfg_loc_cd);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$mst_mfg_loc_cd, MST_ITM_ORDER_IF_R.$mst_mfg_loc_cd);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sppl_cd, MST_ITM_ORDER_IF_R.$sppl_cd);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$maker_cd, MST_ITM_ORDER_IF_R.$maker_cd);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$rqst_loc_cd, MST_ITM_ORDER_IF_R.$rqst_loc_cd);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$rqst_wg_cd, MST_ITM_ORDER_IF_R.$rqst_wg_cd);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$bom_ptn, MST_ITM_ORDER_IF_R.$bom_ptn);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$oper_ptn, MST_ITM_ORDER_IF_R.$oper_ptn);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$inst_qty, MST_ITM_ORDER_IF_R.$inst_qty);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$yield_schd_qty, MST_ITM_ORDER_IF_R.$yield_schd_qty);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$not_inst_qty, MST_ITM_ORDER_IF_R.$not_inst_qty);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$mfg_inst_unit_typ, MST_ITM_ORDER_IF_R.$mfg_inst_unit_typ);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$inst_yield_schd_qty, MST_ITM_ORDER_IF_R.$inst_yield_schd_qty);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$yield_act_qty, MST_ITM_ORDER_IF_R.$yield_act_qty);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$purc_act_qty, MST_ITM_ORDER_IF_R.$purc_act_qty);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$insp_act_qty, MST_ITM_ORDER_IF_R.$insp_act_qty);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$nmr_qty, MST_ITM_ORDER_IF_R.$nmr_qty);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$dnm_qty, MST_ITM_ORDER_IF_R.$dnm_qty);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$fxd_yield_qty, MST_ITM_ORDER_IF_R.$fxd_yield_qty);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$itm_ord_sts_typ, MST_ITM_ORDER_IF_R.$itm_ord_sts_typ);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$fix_dt, MST_ITM_ORDER_IF_R.$fix_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$blk_flg, MST_ITM_ORDER_IF_R.$blk_flg);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$po_schd_dt, MST_ITM_ORDER_IF_R.$po_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$mrp_po_schd_dt, MST_ITM_ORDER_IF_R.$mrp_po_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$po_dt, MST_ITM_ORDER_IF_R.$po_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$mrp_purc_lt, MST_ITM_ORDER_IF_R.$mrp_purc_lt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$purc_lt, MST_ITM_ORDER_IF_R.$purc_lt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$act_purc_lt, MST_ITM_ORDER_IF_R.$act_purc_lt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$mfg_st_schd_dt, MST_ITM_ORDER_IF_R.$mfg_st_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$mrp_mfg_st_schd_dt, MST_ITM_ORDER_IF_R.$mrp_mfg_st_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$inst_mfg_st_schd_dt, MST_ITM_ORDER_IF_R.$inst_mfg_st_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$mfg_st_act_dt, MST_ITM_ORDER_IF_R.$mfg_st_act_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$mfg_end_schd_dt, MST_ITM_ORDER_IF_R.$mfg_end_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$mrp_mfg_end_schd_dt, MST_ITM_ORDER_IF_R.$mrp_mfg_end_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$inst_mfg_end_schd_dt, MST_ITM_ORDER_IF_R.$inst_mfg_end_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$mfg_end_act_dt, MST_ITM_ORDER_IF_R.$mfg_end_act_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$mrp_mfg_lt, MST_ITM_ORDER_IF_R.$mrp_mfg_lt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$mfg_lt, MST_ITM_ORDER_IF_R.$mfg_lt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$act_mfg_lt, MST_ITM_ORDER_IF_R.$act_mfg_lt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$gi_schd_dt, MST_ITM_ORDER_IF_R.$gi_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$mrp_gi_schd_dt, MST_ITM_ORDER_IF_R.$mrp_gi_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$inst_gi_schd_dt, MST_ITM_ORDER_IF_R.$inst_gi_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$gi_act_dt, MST_ITM_ORDER_IF_R.$gi_act_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$strg_schd_dt, MST_ITM_ORDER_IF_R.$strg_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$mrp_strg_schd_dt, MST_ITM_ORDER_IF_R.$mrp_strg_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$inst_strg_schd_dt, MST_ITM_ORDER_IF_R.$inst_strg_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$strg_act_dt, MST_ITM_ORDER_IF_R.$strg_act_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$xfr_lt, MST_ITM_ORDER_IF_R.$xfr_lt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$accpt_schd_dt, MST_ITM_ORDER_IF_R.$accpt_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$mrp_accpt_schd_dt, MST_ITM_ORDER_IF_R.$mrp_accpt_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$inst_accpt_schd_dt, MST_ITM_ORDER_IF_R.$inst_accpt_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$accpt_act_dt, MST_ITM_ORDER_IF_R.$accpt_act_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$accpt_insp_lt, MST_ITM_ORDER_IF_R.$accpt_insp_lt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$insp_st_schd_dt, MST_ITM_ORDER_IF_R.$insp_st_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$mrp_insp_st_schd_dt, MST_ITM_ORDER_IF_R.$mrp_insp_st_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$inst_insp_st_schd_dt, MST_ITM_ORDER_IF_R.$inst_insp_st_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$insp_st_act_dt, MST_ITM_ORDER_IF_R.$insp_st_act_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$insp_end_schd_dt, MST_ITM_ORDER_IF_R.$insp_end_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$mrp_insp_end_schd_dt, MST_ITM_ORDER_IF_R.$mrp_insp_end_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$inst_insp_end_schd_dt, MST_ITM_ORDER_IF_R.$inst_insp_end_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$insp_end_act_dt, MST_ITM_ORDER_IF_R.$insp_end_act_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$insp_lt, MST_ITM_ORDER_IF_R.$insp_lt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$insp_offst, MST_ITM_ORDER_IF_R.$insp_offst);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$mrp_avl_schd_dt, MST_ITM_ORDER_IF_R.$mrp_avl_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$avl_schd_dt, MST_ITM_ORDER_IF_R.$avl_schd_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$master_dt, MST_ITM_ORDER_IF_R.$master_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sno1, MST_ITM_ORDER_IF_R.$sno1);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sno2, MST_ITM_ORDER_IF_R.$sno2);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sno3, MST_ITM_ORDER_IF_R.$sno3);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sno4, MST_ITM_ORDER_IF_R.$sno4);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$lmt_dt, MST_ITM_ORDER_IF_R.$lmt_dt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$wg_cd, MST_ITM_ORDER_IF_R.$wg_cd);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$rqmt_no, MST_ITM_ORDER_IF_R.$rqmt_no);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$intr_rmrks, MST_ITM_ORDER_IF_R.$intr_rmrks);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$inst_itm_ord_sts_typ, MST_ITM_ORDER_IF_R.$inst_itm_ord_sts_typ);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$arr_pr_no, MST_ITM_ORDER_IF_R.$arr_pr_no);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$po_d_no, MST_ITM_ORDER_IF_R.$po_d_no);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$std_purc_lt, MST_ITM_ORDER_IF_R.$std_purc_lt);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$dlv_rqst_tm, MST_ITM_ORDER_IF_R.$dlv_rqst_tm);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$rqst_dlv_rqst_tm, MST_ITM_ORDER_IF_R.$rqst_dlv_rqst_tm);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sub_char1, MST_ITM_ORDER_IF_R.$sub_char1);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sub_char2, MST_ITM_ORDER_IF_R.$sub_char2);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sub_char3, MST_ITM_ORDER_IF_R.$sub_char3);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sub_char4, MST_ITM_ORDER_IF_R.$sub_char4);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sub_char5, MST_ITM_ORDER_IF_R.$sub_char5);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sub_char6, MST_ITM_ORDER_IF_R.$sub_char6);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sub_char7, MST_ITM_ORDER_IF_R.$sub_char7);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sub_char8, MST_ITM_ORDER_IF_R.$sub_char8);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sub_char9, MST_ITM_ORDER_IF_R.$sub_char9);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sub_char10, MST_ITM_ORDER_IF_R.$sub_char10);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sub_char11, MST_ITM_ORDER_IF_R.$sub_char11);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sub_char12, MST_ITM_ORDER_IF_R.$sub_char12);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sub_char13, MST_ITM_ORDER_IF_R.$sub_char13);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sub_char14, MST_ITM_ORDER_IF_R.$sub_char14);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sub_char15, MST_ITM_ORDER_IF_R.$sub_char15);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sub_char16, MST_ITM_ORDER_IF_R.$sub_char16);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sub_char17, MST_ITM_ORDER_IF_R.$sub_char17);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sub_char18, MST_ITM_ORDER_IF_R.$sub_char18);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sub_char19, MST_ITM_ORDER_IF_R.$sub_char19);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sub_char20, MST_ITM_ORDER_IF_R.$sub_char20);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sub_char21, MST_ITM_ORDER_IF_R.$sub_char21);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sub_char22, MST_ITM_ORDER_IF_R.$sub_char22);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sub_char23, MST_ITM_ORDER_IF_R.$sub_char23);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sub_char24, MST_ITM_ORDER_IF_R.$sub_char24);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sub_char25, MST_ITM_ORDER_IF_R.$sub_char25);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sub_char26, MST_ITM_ORDER_IF_R.$sub_char26);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sub_char27, MST_ITM_ORDER_IF_R.$sub_char27);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sub_char28, MST_ITM_ORDER_IF_R.$sub_char28);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sub_char29, MST_ITM_ORDER_IF_R.$sub_char29);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sub_char30, MST_ITM_ORDER_IF_R.$sub_char30);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sub_num1, MST_ITM_ORDER_IF_R.$sub_num1);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sub_num2, MST_ITM_ORDER_IF_R.$sub_num2);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sub_num3, MST_ITM_ORDER_IF_R.$sub_num3);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sub_num4, MST_ITM_ORDER_IF_R.$sub_num4);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sub_num5, MST_ITM_ORDER_IF_R.$sub_num5);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sub_dt1, MST_ITM_ORDER_IF_R.$sub_dt1);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sub_dt2, MST_ITM_ORDER_IF_R.$sub_dt2);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sub_dt3, MST_ITM_ORDER_IF_R.$sub_dt3);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sub_dt4, MST_ITM_ORDER_IF_R.$sub_dt4);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$sub_dt5, MST_ITM_ORDER_IF_R.$sub_dt5);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$batch_log_no, MST_ITM_ORDER_IF_R.$batch_log_no);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$log_sub_key1, MST_ITM_ORDER_IF_R.$log_sub_key1);
				addColumnPathMap(MST_ITM_ORDER_IF_R.$log_sub_key2, MST_ITM_ORDER_IF_R.$log_sub_key2);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.setNumberNE(MST_ITM_ORDER_IF_R.$data_no, up0().data_no());
				dest.setStringNE(MST_ITM_ORDER_IF_R.$exe_sts_typ, MAC_EXE_STS_TYP.NOT_EXE.value());
				dest.setStringNE(MST_ITM_ORDER_IF_R.$data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value());				
			}
		}
	}

	//FMCB CUSTOM END
}