package mcframe.serverMSLC.MSLCL5070;

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
import mcframe.serverFXUC.FXUCL0170.*;
import mcframe.serverCore.resource.MCConst;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLCL_ArrPrSendIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLCL_ArrPrSendIfService_MC extends MSLCL_ArrPrSendIfService_MC_A{
	//FMCB CUSTOM START

	/**
	 * Upd01オペレーション.<p>
	 *
	 * ＩＦテーブルの登録処理を実行するオペレーションの基底クラスの実装<br>
	 */
	public class Upd01 extends MSLCL_ArrPrSendIfService_MC_A.Upd01 {
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
			if(!MAC_IF_PROC_TYP.isARR_PR_SEND(up0().if_proc_typ())) {
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
			super._upd02LogicId = "MSLCL5070";
			super._upd02OperationId = "Upd02";
		}
		
		@Override
		protected void writeStartLog() {
			MCMessagePool.add(MSLCL0105);
		}
		
		@Override
		protected void writeEndLog() {
			MCMessagePool.add(MSLCL0106);
		}
	}
	/**
	 * Upd02オペレーション.<p>
	 *
	 * ＩＦテーブルにレコードを登録する処理の流れを定義したオペレーションの基底クラスの実装<br>
	 */
	public class Upd02 extends MSLCL_ArrPrSendIfService_MC_A.Upd02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void writeStartLog() {
			// 開始ログを出力する
			writeLogForStartLog(MSLCL0101, getCo().co_cd(), up0().if_proc_typ());
		}
		
		@Override
		protected void setup() {
			// 1回のフェッチで何件のレコードを取得するか
			super._fetchSize = MCConst.app.getInteger("MS.MSLCL5070.fetch_size", 1000);
			// 1スレッド当たり何件のレコードを処理するか
			super._threadRecordCnt = MCConst.app.getInteger("MS.MSLCL5070.thread_record_cnt", 1000);
			
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
			
			MST_ARR_PR_IF_R arrPrIfR = MST_ARR_PR_IF_R.create("T1");
			
			// 最大・最小日付
			MCDateValue[] minMaxDate = getMinMaxDate(arrPrIfR);
			MCDateValue minDate = minMaxDate[0];
			MCDateValue maxDate = minMaxDate[1];
			
			// バインド値設定
			MCRow bind = MCRow.create();
			bind.setStringNE(Upd02_DtlR.$ext_sys_cd, up0().ext_sys_cd());
			bind.setDateNE(Upd02_DtlR.$dt_fr, up0().dt_fr());
			bind.setDateNE(Upd02_DtlR.$dt_to, up0().dt_to());
			bind.setBooleanNE(MST_ARR_PR_IF_R.$bi_not_send_flg, false);
			bind.setStringNE(err_sts, MAC_EXE_STS_TYP.ERR.value());
			bind.setStringNE(not_exe_sts, MAC_EXE_STS_TYP.NOT_EXE.value());
			super._updBiNotSendFlgBind = bind; 
			
			// QueryBuilder設定
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(arrPrIfR);
			builder.addWhereWithAnd(arrPrIfR.ext_sys_cd.eq(bind(Upd02_DtlR.$ext_sys_cd)));
			builder.addWhereWithAnd(
					minDate.between(bind(Upd02_DtlR.$dt_fr), bind(Upd02_DtlR.$dt_to))
					.or(maxDate.between(bind(Upd02_DtlR.$dt_fr), bind(Upd02_DtlR.$dt_to))));
			builder.addWhereWithAnd(arrPrIfR.bi_not_send_flg.eq(bind(MST_ARR_PR_IF_R.$bi_not_send_flg)));
			builder.addWhereWithAnd(arrPrIfR.exe_sts_typ.eq(bind(err_sts)).or(arrPrIfR.exe_sts_typ.eq(bind(not_exe_sts))));
			super._ifTblUpdBiNotSendFlgBuilder = builder;
			
			// SQLID設定
			super._sqlIdSelectBiNotSendFlg = "MSLCL5070_MST_ARR_PR_IF_S01";
			super._sqlIdUpdBiNotSendFlg = "MSLCL5070_MST_ARR_PR_IF_U01";
			
			// DBCクラスパス設定
			super._ifTblContainerClassPath = "mcframe.serverMS.dbc.MST_ARR_PR_IF_R";
		}
		
		/**
		 * IFテーブルにレコードを登録する処理に必要なデータをセット
		 */
		protected void setupIns() {
			
			MST_ARR_PR_R arrPrR = MST_ARR_PR_R.create("T1");
			MAM_DPT_R dptR = MAM_DPT_R.create("T2");
			MST_PO_D_R poDR = MST_PO_D_R.create("T3");
			MST_PO_R poR = MST_PO_R.create("T4");
			MAM_ITM_R itmR = MAM_ITM_R.create("T5");

			// 最大・最小日付
			MCDateValue[] minMaxDate = getMinMaxDate(arrPrR);
			MCDateValue minDate = minMaxDate[0];
			MCDateValue maxDate = minMaxDate[1];
			
			// バインド値設定
			MCRow bind = MCRow.create();
			bind.setDateNE(Upd02_DtlR.$dt_fr, up0().dt_fr());
			bind.setDateNE(Upd02_DtlR.$dt_to, up0().dt_to());
			bind.setStringNE(MAM_ITM_R.$stk_mng_typ, MAC_STK_MNG_TYP.MNG.value());
			super._trnTblExtractBind = bind;
			
			// QueryBuilder設定
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(arrPrR);
			builder.addSelect(dptR.st_dt.as("DPT_ST_DT"));
			builder.addSelect(poR.po_dt);
			builder.addSelect(poDR.itm_cd);
			builder.addSelect(poDR.itm_sub1);
			builder.addSelect(poDR.itm_sub2);
			builder.addSelect(poDR.itm_sub3);
			builder.addSelect(poR.trd_cur_cd);
			builder.addSelect(poDR.trd_cur_amt);
			// 部門マスタ適用開始日
			builder.addLeftOuterJoin(dptR, 
					bracket(
						arrPrR.rqst_dpt_cd.eq(dptR.dpt_cd)
						.and(trunc(coalesce(arrPrR.purc_dt, arrPrR.arr_tm, arrPrR.arr_schd_tm), MCDateFmt.DD).gte(dptR.st_dt))
						.and(trunc(coalesce(arrPrR.purc_dt, arrPrR.arr_tm, arrPrR.arr_schd_tm), MCDateFmt.DD).lte(dptR.end_dt))
					));
			builder.addInnerJoin(poDR, 
					arrPrR.po_d_no.eq(poDR.po_d_no));
			builder.addInnerJoin(poR, 
					poDR.po_no.eq(poR.po_no));
			builder.addLeftOuterJoin(itmR, 
					bracket(
						poDR.itm_cd.eq(itmR.itm_cd)
						.and(poDR.itm_sub1.eq(itmR.itm_sub1))
						.and(poDR.itm_sub2.eq(itmR.itm_sub2))
						.and(poDR.itm_sub3.eq(itmR.itm_sub3))
					));
			builder.addWhereWithAnd(
					minDate.between(bind(Upd02_DtlR.$dt_fr), bind(Upd02_DtlR.$dt_to))
					.or(maxDate.between(bind(Upd02_DtlR.$dt_fr), bind(Upd02_DtlR.$dt_to))));
			builder.addWhereWithAnd(itmR.stk_mng_typ.eq(bind(MAM_ITM_R.$stk_mng_typ)));
			builder.addWhereWithAnd(MAC_TRD_PTN_TYP$IS_BI_TGT(arrPrR.trd_ptn_typ).eq(value(true)));
			super._trnTblExtractBuilder = builder;
			
			// SQLID設定
			super._sqlIdSelectExtractTrn = "MSLCL5070_MST_ARR_PR_S01";
			super._sqlIdInsExtractTrn = "MSLCL5070_MST_ARR_PR_IF_I01";
			
			// クラスパス設定
			super._trnTblContainerClassPath = "mcframe.serverMS.dbc.MST_ARR_PR_R";
		}
		
		/**
		 * IFテーブルにレコードをinsertする処理(mcframe側で、削除されたレコード用)で使用する親クラスのフィールドをセット
		 */
		protected void setupInsForDlt() {
			String ok_sts = "ok_sts";
			
			MST_ARR_PR_IF_R arrPrIfR = MST_ARR_PR_IF_R.create("T1");
			MST_ARR_PR_R arrPrR = MST_ARR_PR_R.create("T2");

			// 最大・最小日付
			MCDateValue[] minMaxDate = getMinMaxDate(arrPrIfR);
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
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(arrPrIfR);
			builder.addWhereWithAnd(arrPrIfR.ext_sys_cd.eq(bind(Upd02_DtlR.$ext_sys_cd)));
			builder.addWhereWithAnd(notExists(
					subQuery().select(value("X")).from(arrPrR).
					where(arrPrIfR.arr_pr_no.eq(arrPrR.arr_pr_no)
							.and(coalesce(arrPrR.purc_dt, arrPrR.arr_tm, arrPrR.arr_schd_tm).isNotNull())
							.and(MAC_TRD_PTN_TYP$IS_BI_TGT(arrPrR.trd_ptn_typ).eq(value(true))))
					));
			builder.addWhereWithAnd(arrPrIfR.exe_sts_typ.eq(bind(ok_sts)));
			builder.addWhereWithAnd(
					minDate.between(bind(Upd02_DtlR.$dt_fr), bind(Upd02_DtlR.$dt_to))
					.or(maxDate.between(bind(Upd02_DtlR.$dt_fr), bind(Upd02_DtlR.$dt_to))));
			builder.addOrderByAsc(arrPrIfR.arr_pr_no);
			super._trnTblExtractDltBuilder = builder;
			
			// PKカラム設定
			_ifTblCmpKeys = new String[] {
					MST_ARR_PR_R.$arr_pr_no
				};
			
			super._sqlIdSelectExtractDltTrn = "MSLCL5070_MST_ARR_PR_IF_S02";
			super._sqlIdInsExtractDltTrn = "MSLCL5070_MST_ARR_PR_IF_I02";
			
		}
		
		// 最小・最大日付取得(IF)
		protected MCDateValue[] getMinMaxDate(MST_ARR_PR_IF_R arrPrIfR) {
			
			MCDatePermColumn purcDtCol = arrPrIfR.purc_dt;
			MCDatePermColumn arrTmCol = arrPrIfR.arr_tm;
			MCDatePermColumn arrSchdTmCol = arrPrIfR.arr_schd_tm;

			MCDateValue purcDt = trunc(coalesce(purcDtCol, arrTmCol, arrSchdTmCol), MCDateFmt.DD);
			MCDateValue arrTm = trunc(coalesce(arrTmCol, purcDtCol, arrSchdTmCol), MCDateFmt.DD);
			MCDateValue arrSchdTm = trunc(coalesce(arrSchdTmCol, purcDtCol, arrTmCol), MCDateFmt.DD);
			
			// 最小・最大日付
			MCDateValue minDate = least(purcDt, arrTm, arrSchdTm);
			MCDateValue maxDate = greatest(purcDt, arrTm, arrSchdTm);
			MCDateValue[] minMaxDate = {minDate, maxDate};
			
			return minMaxDate;
		}
		
		// 最小・最大日付取得(トラン)
		protected MCDateValue[] getMinMaxDate(MST_ARR_PR_R arrPrR) {
			
			MCDatePermColumn purcDtCol = arrPrR.purc_dt;
			MCDatePermColumn arrTmCol = arrPrR.arr_tm;
			MCDatePermColumn arrSchdTmCol = arrPrR.arr_schd_tm;
			
			MCDateValue purcDt = trunc(coalesce(purcDtCol, arrTmCol, arrSchdTmCol), MCDateFmt.DD);
			MCDateValue arrTm = trunc(coalesce(arrTmCol, purcDtCol, arrSchdTmCol), MCDateFmt.DD);
			MCDateValue arrSchdTm = trunc(coalesce(arrSchdTmCol, purcDtCol, arrTmCol), MCDateFmt.DD);
			
			// 最小・最大日付
			MCDateValue minDate = least(purcDt, arrTm, arrSchdTm);
			MCDateValue maxDate = greatest(purcDt, arrTm, arrSchdTm);
			MCDateValue[] minMaxDate = {minDate, maxDate};
			
			return minMaxDate;
		}
		
		@Override
		protected MCList<MCRow> srchPostForInsRecord(MCList<MCRow> srchTrnRsltL) {
			
			// IFテーブルから同一キーのレコードを抽出する
			MCList<? extends MCRow> srchIfRsltL = srchSameKeyIfRecord(srchTrnRsltL);
			
			// キーレコードが重複した場合は最新レコードのみを使用するため、最新レコードを抽出したMCListを作成する
			MCList<? extends MCRow>[] sameKeyGroupL = srchIfRsltL.groupList(MST_ARR_PR_R.$arr_pr_no);
			MCList<MCRow> latestIfL = MCList.create(MCRow.class);
			for (MCList<? extends MCRow> sameKeyL : sameKeyGroupL) {
				// 同一キー内で、最新レコードを取得する
				sameKeyL.sort(SortType.DESC, MST_ARR_PR_IF_R.$data_upd_ts, MST_ARR_PR_IF_R.$upd_ts);
				latestIfL.add(sameKeyL.get(0));
			}
			
			MCIndexKey latestIfLIdxKey = latestIfL.createIndex(MST_ARR_PR_R.$arr_pr_no);
			
			// IFテーブルにinsertするデータを作成する
			MCList<MCRow> insL = MCList.create(MCRow.class);
			for (MCRow trnR : srchTrnRsltL) {
				
				// IFテーブルに同一キーが存在するかをチェックする
				MCRow matchedIfR = latestIfL.getFirst(latestIfLIdxKey, trnR.getStringNE(MST_ARR_PR_R.$arr_pr_no));
				
				if (isNull(matchedIfR) 
						|| MAC_DATA_CRUD_TYP.isDEL(matchedIfR.getStringNE(MST_ARR_PR_IF_R.$data_crud_typ))) {
					// IFテーブルに同一キーのレコード無しの場合、
					// または最新の同一キーレコードのデータ更新区分が「削除」の場合は、新規レコードのみを登録する
					MCRow insR = MCRow.create();
					copy(insR, trnR, createMap_MST_ARR_PR_IF_R_MST_ARR_PR_R());
					insL.add(insR);
				}
				else {
					// IFテーブルに同一キーレコード有りの場合、トランの方が新しければ登録対象とする
					MCTimestamp trnTimestamp = trnR.getTimestampNE(MST_ARR_PR_R.$upd_ts);
					MCTimestamp ifTimestamp = matchedIfR.getTimestampNE(MST_ARR_PR_IF_R.$data_upd_ts);
					if (trnTimestamp.gt(ifTimestamp)) {					
						// IFテーブルから取得したデータは「データ更新区分：削除」として登録
						MCRow insDltR = MCRow.create();
						copy(insDltR, matchedIfR, createMap_MST_ARR_PR_IF_R_MST_ARR_PR_IF_R());
						insL.add(insDltR);
						
						// トランから取得したデータは「データ更新区分：新規」として登録
						MCRow insCrtR = MCRow.create();
						copy(insCrtR, trnR, createMap_MST_ARR_PR_IF_R_MST_ARR_PR_R());
						insL.add(insCrtR);
					}
				}
			}
			
			// データ行NOをセットする
			setDataLNo(MSC_NUM_SYS_TYP.ARRPRIF, insL);
						
			return insL;
		}
		
		/**
		 * 入荷進捗送信ＩＦテーブルにて、同一キーレコードを検索する
		 * @param srchTrnRsltL 検索対象のレコードのリスト
		 * @return 検索結果
		 */
		protected MCList<? extends MCRow> srchSameKeyIfRecord(MCList<MCRow> srchTrnRsltL) {
			
			MST_ARR_PR_IF_R arrPrIfR = MST_ARR_PR_IF_R.create();
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(arrPrIfR);

			builder.addWhereWithAnd(arrPrIfR.ext_sys_cd.eq(bind("1")), up0().ext_sys_cd());
			builder.addWhereWithAnd(arrPrIfR.exe_sts_typ.eq(bind("1")), MAC_EXE_STS_TYP.OK.value());
			builder.addWhereWithAnd(arrPrIfR.arr_pr_no.eq(bind(MST_ARR_PR_IF_R.$arr_pr_no)));
			
			MCList<MST_ARR_PR_IF_R> srchIfRslt = MCList.create(MST_ARR_PR_IF_R.class);
			dbSelect("MSLCL5070_MST_ARR_PR_IF_S03", srchIfRslt, builder, srchTrnRsltL);
			
			return srchIfRslt;
		}
		
		@Override
		protected boolean isExecInsCancelRecord() {
			return true;
		}
		
		@Override
		protected MCList<MCRow> srchPostForInsCancelRecord(MCList<MCRow> srchDelRsltL) {
			
			// 入荷進捗NOごとにグループを作成
			MCList<? extends MCRow>[] sameKeyGroupL = srchDelRsltL.groupList(MST_ARR_PR_IF_R.$arr_pr_no);
			MCList<MCRow> delL =  MCList.create(MCRow.class);
			
			for (MCList<? extends MCRow> sameKeyL : sameKeyGroupL) {
				// 同一キー内の最新レコードの更新区分より、削除対象であるか判定
				sameKeyL.sort(SortType.DESC, MST_ARR_PR_IF_R.$data_upd_ts, MST_ARR_PR_IF_R.$upd_ts);
				if(MAC_DATA_CRUD_TYP.isCRT(sameKeyL.get(0).getString(MST_ARR_PR_IF_R.$data_crud_typ))) {
					MCRow dltR = MCRow.create();
					copy(dltR, sameKeyL.get(0), createMap_MST_ARR_PR_IF_R_MST_ARR_PR_IF_R());
					delL.add(dltR);
				}
			}
			
			// データ行NOをセットする
			setDataLNo(MSC_NUM_SYS_TYP.ARRPRIF, delL);
						
			return delL;
		}
		
		@Override
		protected void writeEndLog() {
			if (super._rsltErrNum == 0 && !super._exceptionFlg) {
				if (_rsltTotalNum == 0) {
					writeLogForProcessLog(MAUDL0008);
				}
			}
			
			writeLogForEndLog(MSLCL0102, getCo().co_cd(), super._rsltTotalNum, super._rsltOkNum, super._rsltErrNum, super._rsltCancelNum);
		}
		
		protected Map_MST_ARR_PR_IF_R_MST_ARR_PR_R<MCRow, MCRow> createMap_MST_ARR_PR_IF_R_MST_ARR_PR_R() {
			return new Map_MST_ARR_PR_IF_R_MST_ARR_PR_R<MCRow, MCRow>();
		}
		
		public class Map_MST_ARR_PR_IF_R_MST_ARR_PR_R<D extends MCRow, S extends MCRow> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_ARR_PR_IF_R.$data_upd_ts, MST_ARR_PR_R.$upd_ts);
				
				addColumnPathMap(MST_ARR_PR_IF_R.$arr_pr_no, MST_ARR_PR_R.$arr_pr_no);
				addColumnPathMap(MST_ARR_PR_IF_R.$trd_cd, MST_ARR_PR_R.$trd_cd);
				addColumnPathMap(MST_ARR_PR_IF_R.$trd_ptn_typ, MST_ARR_PR_R.$trd_ptn_typ);
				addColumnPathMap(MST_ARR_PR_IF_R.$po_d_no, MST_ARR_PR_R.$po_d_no);
				addColumnPathMap(MST_ARR_PR_IF_R.$sls_ret_schd_d_no, MST_ARR_PR_R.$sls_ret_schd_d_no);
				addColumnPathMap(MST_ARR_PR_IF_R.$dlv_slip_d_no, MST_ARR_PR_R.$dlv_slip_d_no);
				addColumnPathMap(MST_ARR_PR_IF_R.$iv_d_no, MST_ARR_PR_R.$iv_d_no);
				addColumnPathMap(MST_ARR_PR_IF_R.$rqst_dpt_cd, MST_ARR_PR_R.$rqst_dpt_cd);
				addColumnPathMap(MST_ARR_PR_IF_R.$rqst_wg_cd, MST_ARR_PR_R.$rqst_wg_cd);
				addColumnPathMap(MST_ARR_PR_IF_R.$rqst_usr_cd, MST_ARR_PR_R.$rqst_usr_cd);
				addColumnPathMap(MST_ARR_PR_IF_R.$cst_cd, MST_ARR_PR_R.$cst_cd);
				addColumnPathMap(MST_ARR_PR_IF_R.$sret_fr_cd, MST_ARR_PR_R.$sret_fr_cd);
				addColumnPathMap(MST_ARR_PR_IF_R.$sppl_cd, MST_ARR_PR_R.$sppl_cd);
				addColumnPathMap(MST_ARR_PR_IF_R.$ret_dlv_slip_d_no, MST_ARR_PR_R.$ret_dlv_slip_d_no);
				addColumnPathMap(MST_ARR_PR_IF_R.$ret_stk_arrv_bp_cd, MST_ARR_PR_R.$ret_stk_arrv_bp_cd);
				addColumnPathMap(MST_ARR_PR_IF_R.$dlv_rqst_tm, MST_ARR_PR_R.$dlv_rqst_tm);
				addColumnPathMap(MST_ARR_PR_IF_R.$prms_rcpt_dt, MST_ARR_PR_R.$prms_rcpt_dt);
				addColumnPathMap(MST_ARR_PR_IF_R.$prms_dlv_dt, MST_ARR_PR_R.$prms_dlv_dt);
				addColumnPathMap(MST_ARR_PR_IF_R.$prms_refl_dt, MST_ARR_PR_R.$prms_refl_dt);
				addColumnPathMap(MST_ARR_PR_IF_R.$dlv_inst_dt, MST_ARR_PR_R.$dlv_inst_dt);
				addColumnPathMap(MST_ARR_PR_IF_R.$dlv_inst_prms_rcpt_dt, MST_ARR_PR_R.$dlv_inst_prms_rcpt_dt);
				addColumnPathMap(MST_ARR_PR_IF_R.$dlv_inst_prms_refl_dt, MST_ARR_PR_R.$dlv_inst_prms_refl_dt);
				addColumnPathMap(MST_ARR_PR_IF_R.$arr_schd_tm, MST_ARR_PR_R.$arr_schd_tm);
				addColumnPathMap(MST_ARR_PR_IF_R.$arr_tm, MST_ARR_PR_R.$arr_tm);
				addColumnPathMap(MST_ARR_PR_IF_R.$purc_dt, MST_ARR_PR_R.$purc_dt);
				addColumnPathMap(MST_ARR_PR_IF_R.$trd_unit_qty, MST_ARR_PR_R.$trd_unit_qty);
				addColumnPathMap(MST_ARR_PR_IF_R.$trd_unit_cd, MST_ARR_PR_R.$trd_unit_cd);
				addColumnPathMap(MST_ARR_PR_IF_R.$pack_unit_qty, MST_ARR_PR_R.$pack_unit_qty);
				addColumnPathMap(MST_ARR_PR_IF_R.$pack_unit_cd, MST_ARR_PR_R.$pack_unit_cd);
				addColumnPathMap(MST_ARR_PR_IF_R.$base_unit_qty, MST_ARR_PR_R.$base_unit_qty);
				addColumnPathMap(MST_ARR_PR_IF_R.$base_unit_cd, MST_ARR_PR_R.$base_unit_cd);
				addColumnPathMap(MST_ARR_PR_IF_R.$prms_rcpt_qty, MST_ARR_PR_R.$prms_rcpt_qty);
				addColumnPathMap(MST_ARR_PR_IF_R.$prms_refl_qty, MST_ARR_PR_R.$prms_refl_qty);
				addColumnPathMap(MST_ARR_PR_IF_R.$dlv_inst_qty, MST_ARR_PR_R.$dlv_inst_qty);
				addColumnPathMap(MST_ARR_PR_IF_R.$dlv_inst_prms_rcpt_qty, MST_ARR_PR_R.$dlv_inst_prms_rcpt_qty);
				addColumnPathMap(MST_ARR_PR_IF_R.$dlv_inst_prms_refl_qty, MST_ARR_PR_R.$dlv_inst_prms_refl_qty);
				addColumnPathMap(MST_ARR_PR_IF_R.$re_arr_schd_qty, MST_ARR_PR_R.$re_arr_schd_qty);
				addColumnPathMap(MST_ARR_PR_IF_R.$rcpt_iv_qty, MST_ARR_PR_R.$rcpt_iv_qty);
				addColumnPathMap(MST_ARR_PR_IF_R.$arr_qty, MST_ARR_PR_R.$arr_qty);
				addColumnPathMap(MST_ARR_PR_IF_R.$purc_qty, MST_ARR_PR_R.$purc_qty);
				addColumnPathMap(MST_ARR_PR_IF_R.$sls_ret_qty, MST_ARR_PR_R.$sls_ret_qty);
				addColumnPathMap(MST_ARR_PR_IF_R.$abort_flg, MST_ARR_PR_R.$abort_flg);
				addColumnPathMap(MST_ARR_PR_IF_R.$arr_schd_abort_qty, MST_ARR_PR_R.$arr_schd_abort_qty);
				addColumnPathMap(MST_ARR_PR_IF_R.$purc_schd_abort_qty, MST_ARR_PR_R.$purc_schd_abort_qty);
				addColumnPathMap(MST_ARR_PR_IF_R.$sls_ret_schd_abort_qty, MST_ARR_PR_R.$sls_ret_schd_abort_qty);
				addColumnPathMap(MST_ARR_PR_IF_R.$accpt_dfct_qty, MST_ARR_PR_R.$accpt_dfct_qty);
				addColumnPathMap(MST_ARR_PR_IF_R.$std_purc_lt, MST_ARR_PR_R.$std_purc_lt);
				addColumnPathMap(MST_ARR_PR_IF_R.$act_purc_lt, MST_ARR_PR_R.$act_purc_lt);
				addColumnPathMap(MST_ARR_PR_IF_R.$rsn_cd, MST_ARR_PR_R.$rsn_cd);
				addColumnPathMap(MST_ARR_PR_IF_R.$purc_sts_typ, MST_ARR_PR_R.$purc_sts_typ);
				addColumnPathMap(MST_ARR_PR_IF_R.$prms_dlv_dt_overdue_flg, MST_ARR_PR_R.$prms_dlv_dt_overdue_flg);
				addColumnPathMap(MST_ARR_PR_IF_R.$dlv_rqst_dt_overdue_flg, MST_ARR_PR_R.$dlv_rqst_dt_overdue_flg);
				addColumnPathMap(MST_ARR_PR_IF_R.$arr_cmpl_flg, MST_ARR_PR_R.$arr_cmpl_flg);
				addColumnPathMap(MST_ARR_PR_IF_R.$purc_cmpl_flg, MST_ARR_PR_R.$purc_cmpl_flg);
				addColumnPathMap(MST_ARR_PR_IF_R.$sls_ret_cmpl_flg, MST_ARR_PR_R.$sls_ret_cmpl_flg);
				addColumnPathMap(MST_ARR_PR_IF_R.$arr_cnt_rmrks, MST_ARR_PR_R.$arr_cnt_rmrks);
				
				addColumnPathMap(MST_ARR_PR_IF_R.$po_dt, MST_PO_R.$po_dt);
				addColumnPathMap(MST_ARR_PR_IF_R.$itm_cd, MST_PO_D_R.$itm_cd);
				addColumnPathMap(MST_ARR_PR_IF_R.$itm_sub1, MST_PO_D_R.$itm_sub1);
				addColumnPathMap(MST_ARR_PR_IF_R.$itm_sub2, MST_PO_D_R.$itm_sub2);
				addColumnPathMap(MST_ARR_PR_IF_R.$itm_sub3, MST_PO_D_R.$itm_sub3);
				addColumnPathMap(MST_ARR_PR_IF_R.$trd_cur_cd, MST_PO_R.$trd_cur_cd);
				addColumnPathMap(MST_ARR_PR_IF_R.$trd_cur_amt, MST_PO_D_R.$trd_cur_amt);
				
				addColumnPathMap(MST_ARR_PR_IF_R.$sub_char1, MST_ARR_PR_R.$sub_char1);
				addColumnPathMap(MST_ARR_PR_IF_R.$sub_char2, MST_ARR_PR_R.$sub_char2);
				addColumnPathMap(MST_ARR_PR_IF_R.$sub_char3, MST_ARR_PR_R.$sub_char3);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.setNumberNE(MST_ARR_PR_IF_R.$data_no, up0().data_no());
				dest.setStringNE(MST_ARR_PR_IF_R.$exe_sts_typ, MAC_EXE_STS_TYP.NOT_EXE.value());
				dest.setStringNE(MST_ARR_PR_IF_R.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
				dest.setStringNE(MST_ARR_PR_IF_R.$ext_sys_cd, up0().ext_sys_cd());
				dest.setDateNE(MST_ARR_PR_IF_R.$dpt_st_dt, src.getDateNE(MST_ARR_PR_IF_R.$dpt_st_dt));
				dest.setBooleanNE(MST_ARR_PR_IF_R.$bi_not_send_flg, false);
			}
		}
		
		protected Map_MST_ARR_PR_IF_R_MST_ARR_PR_IF_R<MCRow, MCRow> createMap_MST_ARR_PR_IF_R_MST_ARR_PR_IF_R() {
			return new Map_MST_ARR_PR_IF_R_MST_ARR_PR_IF_R<MCRow, MCRow>();
		}
		
		public class Map_MST_ARR_PR_IF_R_MST_ARR_PR_IF_R<D extends MCRow, S extends MCRow> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_ARR_PR_IF_R.$ext_sys_cd, MST_ARR_PR_IF_R.$ext_sys_cd);
				addColumnPathMap(MST_ARR_PR_IF_R.$dpt_st_dt, MST_ARR_PR_IF_R.$dpt_st_dt);
				addColumnPathMap(MST_ARR_PR_IF_R.$data_upd_ts, MST_ARR_PR_IF_R.$data_upd_ts);
				addColumnPathMap(MST_ARR_PR_IF_R.$bi_not_send_flg, MST_ARR_PR_IF_R.$bi_not_send_flg);
				addColumnPathMap(MST_ARR_PR_IF_R.$arr_pr_no, MST_ARR_PR_IF_R.$arr_pr_no);
				addColumnPathMap(MST_ARR_PR_IF_R.$trd_cd, MST_ARR_PR_IF_R.$trd_cd);
				addColumnPathMap(MST_ARR_PR_IF_R.$trd_ptn_typ, MST_ARR_PR_IF_R.$trd_ptn_typ);
				addColumnPathMap(MST_ARR_PR_IF_R.$po_d_no, MST_ARR_PR_IF_R.$po_d_no);
				addColumnPathMap(MST_ARR_PR_IF_R.$sls_ret_schd_d_no, MST_ARR_PR_IF_R.$sls_ret_schd_d_no);
				addColumnPathMap(MST_ARR_PR_IF_R.$dlv_slip_d_no, MST_ARR_PR_IF_R.$dlv_slip_d_no);
				addColumnPathMap(MST_ARR_PR_IF_R.$iv_d_no, MST_ARR_PR_IF_R.$iv_d_no);
				addColumnPathMap(MST_ARR_PR_IF_R.$rqst_dpt_cd, MST_ARR_PR_IF_R.$rqst_dpt_cd);
				addColumnPathMap(MST_ARR_PR_IF_R.$rqst_wg_cd, MST_ARR_PR_IF_R.$rqst_wg_cd);
				addColumnPathMap(MST_ARR_PR_IF_R.$rqst_usr_cd, MST_ARR_PR_IF_R.$rqst_usr_cd);
				addColumnPathMap(MST_ARR_PR_IF_R.$cst_cd, MST_ARR_PR_IF_R.$cst_cd);
				addColumnPathMap(MST_ARR_PR_IF_R.$sret_fr_cd, MST_ARR_PR_IF_R.$sret_fr_cd);
				addColumnPathMap(MST_ARR_PR_IF_R.$sppl_cd, MST_ARR_PR_IF_R.$sppl_cd);
				addColumnPathMap(MST_ARR_PR_IF_R.$ret_dlv_slip_d_no, MST_ARR_PR_IF_R.$ret_dlv_slip_d_no);
				addColumnPathMap(MST_ARR_PR_IF_R.$ret_stk_arrv_bp_cd, MST_ARR_PR_IF_R.$ret_stk_arrv_bp_cd);
				addColumnPathMap(MST_ARR_PR_IF_R.$dlv_rqst_tm, MST_ARR_PR_IF_R.$dlv_rqst_tm);
				addColumnPathMap(MST_ARR_PR_IF_R.$prms_rcpt_dt, MST_ARR_PR_IF_R.$prms_rcpt_dt);
				addColumnPathMap(MST_ARR_PR_IF_R.$prms_dlv_dt, MST_ARR_PR_IF_R.$prms_dlv_dt);
				addColumnPathMap(MST_ARR_PR_IF_R.$prms_refl_dt, MST_ARR_PR_IF_R.$prms_refl_dt);
				addColumnPathMap(MST_ARR_PR_IF_R.$dlv_inst_dt, MST_ARR_PR_IF_R.$dlv_inst_dt);
				addColumnPathMap(MST_ARR_PR_IF_R.$dlv_inst_prms_rcpt_dt, MST_ARR_PR_IF_R.$dlv_inst_prms_rcpt_dt);
				addColumnPathMap(MST_ARR_PR_IF_R.$dlv_inst_prms_refl_dt, MST_ARR_PR_IF_R.$dlv_inst_prms_refl_dt);
				addColumnPathMap(MST_ARR_PR_IF_R.$arr_schd_tm, MST_ARR_PR_IF_R.$arr_schd_tm);
				addColumnPathMap(MST_ARR_PR_IF_R.$arr_tm, MST_ARR_PR_IF_R.$arr_tm);
				addColumnPathMap(MST_ARR_PR_IF_R.$purc_dt, MST_ARR_PR_IF_R.$purc_dt);
				addColumnPathMap(MST_ARR_PR_IF_R.$trd_unit_qty, MST_ARR_PR_IF_R.$trd_unit_qty);
				addColumnPathMap(MST_ARR_PR_IF_R.$trd_unit_cd, MST_ARR_PR_IF_R.$trd_unit_cd);
				addColumnPathMap(MST_ARR_PR_IF_R.$pack_unit_qty, MST_ARR_PR_IF_R.$pack_unit_qty);
				addColumnPathMap(MST_ARR_PR_IF_R.$pack_unit_cd, MST_ARR_PR_IF_R.$pack_unit_cd);
				addColumnPathMap(MST_ARR_PR_IF_R.$base_unit_qty, MST_ARR_PR_IF_R.$base_unit_qty);
				addColumnPathMap(MST_ARR_PR_IF_R.$base_unit_cd, MST_ARR_PR_IF_R.$base_unit_cd);
				addColumnPathMap(MST_ARR_PR_IF_R.$prms_rcpt_qty, MST_ARR_PR_IF_R.$prms_rcpt_qty);
				addColumnPathMap(MST_ARR_PR_IF_R.$prms_refl_qty, MST_ARR_PR_IF_R.$prms_refl_qty);
				addColumnPathMap(MST_ARR_PR_IF_R.$dlv_inst_qty, MST_ARR_PR_IF_R.$dlv_inst_qty);
				addColumnPathMap(MST_ARR_PR_IF_R.$dlv_inst_prms_rcpt_qty, MST_ARR_PR_IF_R.$dlv_inst_prms_rcpt_qty);
				addColumnPathMap(MST_ARR_PR_IF_R.$dlv_inst_prms_refl_qty, MST_ARR_PR_IF_R.$dlv_inst_prms_refl_qty);
				addColumnPathMap(MST_ARR_PR_IF_R.$re_arr_schd_qty, MST_ARR_PR_IF_R.$re_arr_schd_qty);
				addColumnPathMap(MST_ARR_PR_IF_R.$rcpt_iv_qty, MST_ARR_PR_IF_R.$rcpt_iv_qty);
				addColumnPathMap(MST_ARR_PR_IF_R.$arr_qty, MST_ARR_PR_IF_R.$arr_qty);
				addColumnPathMap(MST_ARR_PR_IF_R.$purc_qty, MST_ARR_PR_IF_R.$purc_qty);
				addColumnPathMap(MST_ARR_PR_IF_R.$sls_ret_qty, MST_ARR_PR_IF_R.$sls_ret_qty);
				addColumnPathMap(MST_ARR_PR_IF_R.$abort_flg, MST_ARR_PR_IF_R.$abort_flg);
				addColumnPathMap(MST_ARR_PR_IF_R.$arr_schd_abort_qty, MST_ARR_PR_IF_R.$arr_schd_abort_qty);
				addColumnPathMap(MST_ARR_PR_IF_R.$purc_schd_abort_qty, MST_ARR_PR_IF_R.$purc_schd_abort_qty);
				addColumnPathMap(MST_ARR_PR_IF_R.$sls_ret_schd_abort_qty, MST_ARR_PR_IF_R.$sls_ret_schd_abort_qty);
				addColumnPathMap(MST_ARR_PR_IF_R.$accpt_dfct_qty, MST_ARR_PR_IF_R.$accpt_dfct_qty);
				addColumnPathMap(MST_ARR_PR_IF_R.$std_purc_lt, MST_ARR_PR_IF_R.$std_purc_lt);
				addColumnPathMap(MST_ARR_PR_IF_R.$act_purc_lt, MST_ARR_PR_IF_R.$act_purc_lt);
				addColumnPathMap(MST_ARR_PR_IF_R.$rsn_cd, MST_ARR_PR_IF_R.$rsn_cd);
				addColumnPathMap(MST_ARR_PR_IF_R.$purc_sts_typ, MST_ARR_PR_IF_R.$purc_sts_typ);
				addColumnPathMap(MST_ARR_PR_IF_R.$prms_dlv_dt_overdue_flg, MST_ARR_PR_IF_R.$prms_dlv_dt_overdue_flg);
				addColumnPathMap(MST_ARR_PR_IF_R.$dlv_rqst_dt_overdue_flg, MST_ARR_PR_IF_R.$dlv_rqst_dt_overdue_flg);
				addColumnPathMap(MST_ARR_PR_IF_R.$arr_cmpl_flg, MST_ARR_PR_IF_R.$arr_cmpl_flg);
				addColumnPathMap(MST_ARR_PR_IF_R.$purc_cmpl_flg, MST_ARR_PR_IF_R.$purc_cmpl_flg);
				addColumnPathMap(MST_ARR_PR_IF_R.$sls_ret_cmpl_flg, MST_ARR_PR_IF_R.$sls_ret_cmpl_flg);
				addColumnPathMap(MST_ARR_PR_IF_R.$arr_cnt_rmrks, MST_ARR_PR_IF_R.$arr_cnt_rmrks);
				addColumnPathMap(MST_ARR_PR_IF_R.$po_dt, MST_ARR_PR_IF_R.$po_dt);
				addColumnPathMap(MST_ARR_PR_IF_R.$itm_cd, MST_ARR_PR_IF_R.$itm_cd);
				addColumnPathMap(MST_ARR_PR_IF_R.$itm_sub1, MST_ARR_PR_IF_R.$itm_sub1);
				addColumnPathMap(MST_ARR_PR_IF_R.$itm_sub2, MST_ARR_PR_IF_R.$itm_sub2);
				addColumnPathMap(MST_ARR_PR_IF_R.$itm_sub3, MST_ARR_PR_IF_R.$itm_sub3);
				addColumnPathMap(MST_ARR_PR_IF_R.$trd_cur_cd, MST_ARR_PR_IF_R.$trd_cur_cd);
				addColumnPathMap(MST_ARR_PR_IF_R.$trd_cur_amt, MST_ARR_PR_IF_R.$trd_cur_amt);
				addColumnPathMap(MST_ARR_PR_IF_R.$sub_char1, MST_ARR_PR_IF_R.$sub_char1);
				addColumnPathMap(MST_ARR_PR_IF_R.$sub_char2, MST_ARR_PR_IF_R.$sub_char2);
				addColumnPathMap(MST_ARR_PR_IF_R.$sub_char3, MST_ARR_PR_IF_R.$sub_char3);
				addColumnPathMap(MST_ARR_PR_IF_R.$sub_char4, MST_ARR_PR_IF_R.$sub_char4);
				addColumnPathMap(MST_ARR_PR_IF_R.$sub_char5, MST_ARR_PR_IF_R.$sub_char5);
				addColumnPathMap(MST_ARR_PR_IF_R.$sub_char6, MST_ARR_PR_IF_R.$sub_char6);
				addColumnPathMap(MST_ARR_PR_IF_R.$sub_char7, MST_ARR_PR_IF_R.$sub_char7);
				addColumnPathMap(MST_ARR_PR_IF_R.$sub_char8, MST_ARR_PR_IF_R.$sub_char8);
				addColumnPathMap(MST_ARR_PR_IF_R.$sub_char9, MST_ARR_PR_IF_R.$sub_char9);
				addColumnPathMap(MST_ARR_PR_IF_R.$sub_char10, MST_ARR_PR_IF_R.$sub_char10);
				addColumnPathMap(MST_ARR_PR_IF_R.$sub_char11, MST_ARR_PR_IF_R.$sub_char11);
				addColumnPathMap(MST_ARR_PR_IF_R.$sub_char12, MST_ARR_PR_IF_R.$sub_char12);
				addColumnPathMap(MST_ARR_PR_IF_R.$sub_char13, MST_ARR_PR_IF_R.$sub_char13);
				addColumnPathMap(MST_ARR_PR_IF_R.$sub_char14, MST_ARR_PR_IF_R.$sub_char14);
				addColumnPathMap(MST_ARR_PR_IF_R.$sub_char15, MST_ARR_PR_IF_R.$sub_char15);
				addColumnPathMap(MST_ARR_PR_IF_R.$sub_char16, MST_ARR_PR_IF_R.$sub_char16);
				addColumnPathMap(MST_ARR_PR_IF_R.$sub_char17, MST_ARR_PR_IF_R.$sub_char17);
				addColumnPathMap(MST_ARR_PR_IF_R.$sub_char18, MST_ARR_PR_IF_R.$sub_char18);
				addColumnPathMap(MST_ARR_PR_IF_R.$sub_char19, MST_ARR_PR_IF_R.$sub_char19);
				addColumnPathMap(MST_ARR_PR_IF_R.$sub_char20, MST_ARR_PR_IF_R.$sub_char20);
				addColumnPathMap(MST_ARR_PR_IF_R.$sub_char21, MST_ARR_PR_IF_R.$sub_char21);
				addColumnPathMap(MST_ARR_PR_IF_R.$sub_char22, MST_ARR_PR_IF_R.$sub_char22);
				addColumnPathMap(MST_ARR_PR_IF_R.$sub_char23, MST_ARR_PR_IF_R.$sub_char23);
				addColumnPathMap(MST_ARR_PR_IF_R.$sub_char24, MST_ARR_PR_IF_R.$sub_char24);
				addColumnPathMap(MST_ARR_PR_IF_R.$sub_char25, MST_ARR_PR_IF_R.$sub_char25);
				addColumnPathMap(MST_ARR_PR_IF_R.$sub_char26, MST_ARR_PR_IF_R.$sub_char26);
				addColumnPathMap(MST_ARR_PR_IF_R.$sub_char27, MST_ARR_PR_IF_R.$sub_char27);
				addColumnPathMap(MST_ARR_PR_IF_R.$sub_char28, MST_ARR_PR_IF_R.$sub_char28);
				addColumnPathMap(MST_ARR_PR_IF_R.$sub_char29, MST_ARR_PR_IF_R.$sub_char29);
				addColumnPathMap(MST_ARR_PR_IF_R.$sub_char30, MST_ARR_PR_IF_R.$sub_char30);
				addColumnPathMap(MST_ARR_PR_IF_R.$sub_num1, MST_ARR_PR_IF_R.$sub_num1);
				addColumnPathMap(MST_ARR_PR_IF_R.$sub_num2, MST_ARR_PR_IF_R.$sub_num2);
				addColumnPathMap(MST_ARR_PR_IF_R.$sub_num3, MST_ARR_PR_IF_R.$sub_num3);
				addColumnPathMap(MST_ARR_PR_IF_R.$sub_num4, MST_ARR_PR_IF_R.$sub_num4);
				addColumnPathMap(MST_ARR_PR_IF_R.$sub_num5, MST_ARR_PR_IF_R.$sub_num5);
				addColumnPathMap(MST_ARR_PR_IF_R.$sub_dt1, MST_ARR_PR_IF_R.$sub_dt1);
				addColumnPathMap(MST_ARR_PR_IF_R.$sub_dt2, MST_ARR_PR_IF_R.$sub_dt2);
				addColumnPathMap(MST_ARR_PR_IF_R.$sub_dt3, MST_ARR_PR_IF_R.$sub_dt3);
				addColumnPathMap(MST_ARR_PR_IF_R.$sub_dt4, MST_ARR_PR_IF_R.$sub_dt4);
				addColumnPathMap(MST_ARR_PR_IF_R.$sub_dt5, MST_ARR_PR_IF_R.$sub_dt5);
				addColumnPathMap(MST_ARR_PR_IF_R.$batch_log_no, MST_ARR_PR_IF_R.$batch_log_no);
				addColumnPathMap(MST_ARR_PR_IF_R.$log_sub_key1, MST_ARR_PR_IF_R.$log_sub_key1);
				addColumnPathMap(MST_ARR_PR_IF_R.$log_sub_key2, MST_ARR_PR_IF_R.$log_sub_key2);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.setNumberNE(MST_ARR_PR_IF_R.$data_no, up0().data_no());
				dest.setStringNE(MST_ARR_PR_IF_R.$exe_sts_typ, MAC_EXE_STS_TYP.NOT_EXE.value());
				dest.setStringNE(MST_ARR_PR_IF_R.$data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value());				
			}
		}
	}

	//FMCB CUSTOM END
}