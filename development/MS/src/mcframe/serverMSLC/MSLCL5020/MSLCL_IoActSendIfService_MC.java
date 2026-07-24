package mcframe.serverMSLC.MSLCL5020;

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
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0170.*;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;

import java.math.RoundingMode;
import mcframe.serverCore.resource.MCConst;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLCL_IoActSendIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLCL_IoActSendIfService_MC extends MSLCL_IoActSendIfService_MC_A{
	//FMCB CUSTOM START

	/**
	 * Upd01オペレーション.<p>
	 *
	 * ＩＦテーブルの登録処理を実行するオペレーションの基底クラスの実装<br>
	 */
	public class Upd01 extends MSLCL_IoActSendIfService_MC_A.Upd01 {
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
			if(!MAC_IF_PROC_TYP.isIO_ACT_SEND(up0().if_proc_typ())) {
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
			super._upd02LogicId = "MSLCL5020";
			super._upd02OperationId = "Upd02";
		}
		
		@Override
		protected void writeStartLog() {
			MCMessagePool.add(MSLCL0019);
		}
		
		@Override
		protected void writeEndLog() {
			MCMessagePool.add(MSLCL0020);
		}
	}
	/**
	 * Upd02オペレーション.<p>
	 *
	 * ＩＦテーブルにレコードを登録する処理の流れを定義したオペレーションの基底クラスの実装<br>
	 */
	public class Upd02 extends MSLCL_IoActSendIfService_MC_A.Upd02 {
				
		/** 
		 * 品目マスタのキャッシュ
		 */
		protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache = null;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void writeStartLog() {			
			// 開始ログを出力する
			writeLogForStartLog(MSLCL0006, getCo().co_cd(), up0().if_proc_typ());
		}
		
		@Override
		protected void setup() {			
			// 1回のフェッチで何件のレコードを取得するか
			super._fetchSize = MCConst.app.getInteger("MS.MSLCL5020.fetch_size", 1000);
			// 1スレッド当たり何件のレコードを処理するか
			super._threadRecordCnt = MCConst.app.getInteger("MS.MSLCL5020.thread_record_cnt", 1000);
			
			// ＤＢＣと条件句の設定
			// ＩＦテーブルから未処理データを抽出するための「検索条件」を親クラスにセットする
			setupUpdBiNotSendFlg();
			// ＩＦテーブルに登録するトランザクションデータを抽出するための「検索条件」を親クラスにセットする
			setupIns();
		}
		
		/**
		 * IFテーブルのＢＩ送信対象外ＦＬＧをupdateする処理に必要なデータをセット
		 */
		protected void setupUpdBiNotSendFlg() {		
			String err_sts = "err_sts";
			String not_exe_sts = "not_exe_sts";
			MST_IO_ACT_IF_R ioActIfR = MST_IO_ACT_IF_R.create("T1");
			
			// バインド値設定
			MCRow bind = MCRow.create();
			bind.setStringNE(MST_IO_ACT_IF_R.$ext_sys_cd, up0().ext_sys_cd());
			bind.setDateNE(Upd02_DtlR.$dt_fr, up0().dt_fr());
			bind.setDateNE(Upd02_DtlR.$dt_to, up0().dt_to());
			bind.setBooleanNE(MST_IO_ACT_IF_R.$bi_not_send_flg, false);
			bind.setStringNE(err_sts, MAC_EXE_STS_TYP.ERR.value());
			bind.setStringNE(not_exe_sts, MAC_EXE_STS_TYP.NOT_EXE.value());
			super._updBiNotSendFlgBind = bind; 
			
			// QueryBuilder設定
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(ioActIfR);
			builder.addWhereWithAnd(ioActIfR.ext_sys_cd.eq(bind(Upd02_DtlR.$ext_sys_cd)));
			builder.addWhereWithAnd(ioActIfR.ac_dt.gte(bind(Upd02_DtlR.$dt_fr)));
			builder.addWhereWithAnd(ioActIfR.ac_dt.lte(bind(Upd02_DtlR.$dt_to)));
			builder.addWhereWithAnd(ioActIfR.bi_not_send_flg.eq(bind(MST_IO_ACT_IF_R.$bi_not_send_flg)));
			builder.addWhereWithAnd(ioActIfR.exe_sts_typ.eq(bind(err_sts)).or(ioActIfR.exe_sts_typ.eq(bind(not_exe_sts))));
			super._ifTblUpdBiNotSendFlgBuilder = builder;
		
			// SQLID設定
			super._sqlIdSelectBiNotSendFlg = "MSLCL5020_MST_IO_ACT_IF_S01";
			super._sqlIdUpdBiNotSendFlg = "MSLCL5020_MST_IO_ACT_IF_U01";
			
			// DBCクラスパス設定
			super._ifTblContainerClassPath = "mcframe.serverMS.dbc.MST_IO_ACT_IF_R";
		}

		/**
		 * IFテーブルにレコードを登録する処理に必要なデータをセット
		 */
		protected void setupIns() {
			String purc_trn = "purc_trn";
			String sls_trn = "sls_trn";
			
			MST_IO_ACT_R ioActR = MST_IO_ACT_R.create("T1");
			MAM_STK_RPL_R stkRplR = MAM_STK_RPL_R.create("T2");
			MAM_LOC_R locR = MAM_LOC_R.create("T3");
			MAM_DPT_R dptR = MAM_DPT_R.create("T4");
			MAM_TERM_R termR = MAM_TERM_R.create("T5");
			MAM_STDCOST_R stdCostR = MAM_STDCOST_R.create("T6");
			MST_PURC_ACT_D_R purcActDR = MST_PURC_ACT_D_R.create("T7");
			MST_SLS_ACT_D_R slsActDR = MST_SLS_ACT_D_R.create("T8");
			MCTempView V = createTempView("V");
			
			// バインド値設定
			MCRow bind = MCRow.create();
			bind.setDateNE(Upd02_DtlR.$dt_fr, up0().dt_fr());
			bind.setDateNE(Upd02_DtlR.$dt_to, up0().dt_to());
			bind.setStringNE(purc_trn, MSC_TRN_TYP.PURC.value());
			bind.setStringNE(sls_trn, MSC_TRN_TYP.SLS.value());
			super._trnTblExtractBind = bind;
			
			// QueryBuilder設定
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(ioActR);
			
			// 部門マスタ適用開始日
			builder.addSelect(V.pr(dptR.st_dt).as("DPT_ST_DT"));
			// 標準単価金額を計算するための項目を追加（金額の計算はjava側で実施）
			builder.addSelect(stdCostR.std_upri);
			builder.addSelect(stdCostR.std_qty);
			// 在庫補充マスタから取得する項目
			builder.addSelect(stkRplR.st_dt);
			builder.addSelect(stkRplR.end_dt);
			builder.addSelect(stkRplR.buf_qty);
			builder.addSelect(stkRplR.rord_stk_qty);
			builder.addSelect(stkRplR.rord_rqst_qty);
			builder.addSelect(stkRplR.memo1);
			builder.addSelect(stkRplR.memo2);
			builder.addSelect(stkRplR.memo3);
			// 仕入実績明細から取得する項目
			builder.addSelect(purcActDR.po_d_no);
			// 売上実績明細から取得する項目
			builder.addSelect(slsActDR.slo_d_no);
			
			builder.addLeftOuterJoin(stkRplR, 
					bracket(
							ioActR.itm_cd.eq(stkRplR.itm_cd)
						.and(ioActR.itm_sub1.eq(stkRplR.itm_sub1))
						.and(ioActR.itm_sub2.eq(stkRplR.itm_sub2))
						.and(ioActR.itm_sub3.eq(stkRplR.itm_sub3))
						.and(ioActR.ac_dt.gte(stkRplR.st_dt))
						.and(ioActR.ac_dt.lte(stkRplR.end_dt))
						.and(ioActR.loc_cd.eq(stkRplR.loc_cd))
					));
				builder.addLeftOuterJoin(locR, 
					bracket(
							ioActR.loc_cd.eq(locR.loc_cd)
					));
				builder.addLeftOuterJoin(
						subQuery().select(dptR.st_dt, dptR.end_dt)
								.from(dptR)
								.groupBy(dptR.st_dt, dptR.end_dt)
								.view(V),
					bracket(
							ioActR.ac_dt.gte(V.pr(dptR.st_dt))
						.and(ioActR.ac_dt.lte(V.pr(dptR.end_dt)))
					));
				builder.addLeftOuterJoin(termR,
					bracket(
							ioActR.ac_ym.gte(termR.term)
						.and(ioActR.ac_ym.lt(termR.term_end_ym))
					));
				builder.addLeftOuterJoin(stdCostR,
					bracket(
							ioActR.itm_cd.eq(stdCostR.itm_cd)
						.and(ioActR.itm_sub1.eq(stdCostR.itm_sub1))
						.and(ioActR.itm_sub2.eq(stdCostR.itm_sub2))
						.and(ioActR.itm_sub3.eq(stdCostR.itm_sub3))
						.and(termR.term.eq(stdCostR.term))
						.and(locR.wg_cd.eq(stdCostR.wg_cd))
					));
				builder.addLeftOuterJoin(purcActDR,
						bracket(
								ioActR.trn_typ.eq(bind(purc_trn))
							.and(ioActR.act_no.eq(purcActDR.purc_act_no))
							.and(ioActR.act_seq.eq(purcActDR.purc_act_seq))
							.and(ioActR.act_d_no.eq(purcActDR.purc_act_d_no))
							.and(ioActR.act_d_seq.eq(purcActDR.purc_act_d_seq))
						));
				builder.addLeftOuterJoin(slsActDR,
						bracket(
								ioActR.trn_typ.eq(bind(sls_trn))
							.and(ioActR.act_no.eq(slsActDR.sls_act_no))
							.and(ioActR.act_seq.eq(slsActDR.sls_act_seq))
							.and(ioActR.act_d_no.eq(slsActDR.sls_act_d_no))
							.and(ioActR.act_d_seq.eq(slsActDR.sls_act_d_seq))
						));
			
			builder.addWhereWithAnd(ioActR.ac_dt.gte(bind(Upd02_DtlR.$dt_fr)));
			builder.addWhereWithAnd(ioActR.ac_dt.lte(bind(Upd02_DtlR.$dt_to)));
			builder.addWhereWithAnd(MSC_IO_ACT_TYP$IS_BI_TGT(ioActR.io_act_typ).eq(value(true)));
			
			super._trnTblExtractBuilder = builder;
			
			// SQLID設定
			super._sqlIdSelectExtractTrn = "MSLCL5020_MST_IO_ACT_S01";
			super._sqlIdInsExtractTrn = "MSLCL5020_MST_IO_ACT_IF_I01";
			
			// クラスパス設定
			super._trnTblContainerClassPath = "mcframe.serverMS.dbc.MST_IO_ACT_IF_R";
		}

		@Override
		protected MCList<MCRow> srchPostForInsRecord(MCList<MCRow> srchTrnRsltL) {	
			
			crtCache(srchTrnRsltL);
			
			// IFテーブルから同一キーのレコードを抽出する
			MCList<? extends MCRow> srchIfRsltL = srchSameKeyIfRecord(srchTrnRsltL);
			
			// キーレコードが重複した場合は最新レコードのみを使用するため、最新レコードを抽出したMCListを作成する
			MCList<? extends MCRow>[] sameKeyGroupL = srchIfRsltL.groupList(MST_IO_ACT_IF_R.$slip_no);
			MCList<MCRow> latestIfL = MCList.create(MCRow.class);
			for (MCList<? extends MCRow> rowL : sameKeyGroupL) {
				// 同一キー内で、最大の伝票連番のレコードを取得する
				rowL.sort(SortType.DESC, MST_IO_ACT_IF_R.$slip_seq_no);
				latestIfL.add(rowL.get(0));
			}
			
			MCIndexKey latestIfLIdxKey = latestIfL.createIndex(MST_IO_ACT_IF_R.$slip_no);
			
			// IFテーブルにinsertするデータを作成する
			MCList<MCRow> insL = MCList.create(MCRow.class);
			for (MCRow trnR : srchTrnRsltL) {	
				MCRow insR = MCRow.create();
				
				// IFテーブルに同一キーが存在するかをチェックする
				MCRow matchedIfR = latestIfL.getFirst(latestIfLIdxKey, trnR.getStringNE(MST_IO_ACT_IF_R.$slip_no));
				
				MCNumber trnSeq = trnR.getNumberNE(MST_IO_ACT_R.$slip_seq_no);
				MCNumber ifSeq = null;
				if (!isNull(matchedIfR)) {
					ifSeq = matchedIfR.getNumberNE(MST_IO_ACT_IF_R.$slip_seq_no);
				}
				
				// 以下の条件いずれかに当てはまる場合、登録対象とする
				// ・ IFテーブルに同一キーのレコードがない
				// ・ 伝票連番がトランの方が大きい
				if (isNull(matchedIfR) || (trnSeq.gt(ifSeq))) {
					copy(insR, trnR, createMap_MST_IO_ACT_IF_R_MST_IO_ACT_R());
					insL.add(insR);
				}
			}
			
			// データ行NOをセットする
			setDataLNo(MSC_NUM_SYS_TYP.IOACTIF, insL);
			
			return insL;
		}

		/**
		 * 補完処理で使用するキャッシュ情報を作成する。
		 */
		protected void crtCache(MCList<MCRow>srchTrnRsltL) {
			
				crtItmCache(srchTrnRsltL);
		}

		/**
		 * 品目マスタのキャッシュを作成する。
		 */
		protected void crtItmCache(MCList<MCRow>srchTrnRsltL) {
			
			MAM_ITM_R t = MAM_ITM_R.create("T");
				MCList<MAM_ITM_R> itmL = MCList.create(MAM_ITM_R.class);
				for (MCRow mcRow :srchTrnRsltL) {
					MAM_ITM_R itmR = MAM_ITM_R.create();
					itmR.itm_cd(mcRow.getStringNE("itm_cd"));
					itmR.itm_sub1(mcRow.getStringNE("itm_sub1"));
					itmR.itm_sub2(mcRow.getStringNE("itm_sub2"));
					itmR.itm_sub3(mcRow.getStringNE("itm_sub3"));
					
					itmL.add(itmR);
				}
				MCQueryApiBuilder itmL_bldr = MCQueryApiBuilder.create(t);
				
				itmL_bldr.setSelect(t.itm_cd);
				itmL_bldr.addSelect(t.dscnt_itm_flg);
				
				_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(
						itmL_bldr, 
						itmL, MAM_ITM_R.$itm_cd,
						MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2,
						MAM_ITM_R.$itm_sub3);
		}

		/**
		 * キャッシュから品目マスタを取得する。
		 * @return　品目マスタ
		 */
		protected MAM_ITM_R getItm(MCRow srchTrnRsltR) {
			
			return _itmCache.get(srchTrnRsltR.getStringNE("itm_cd"), srchTrnRsltR.getStringNE("itm_sub1"), srchTrnRsltR.getStringNE("itm_sub2"), srchTrnRsltR.getStringNE("itm_sub3"));
		}

		/**
		 * 受払実績送信ＩＦテーブルにて、同一キーレコードを検索する
		 * @param srchTrnRsltL 検索対象のレコードのリスト
		 * @return 検索結果
		 */
		protected MCList<? extends MCRow> srchSameKeyIfRecord(MCList<MCRow> srchTrnRsltL) {
			
			MST_IO_ACT_IF_R ioActIfR = MST_IO_ACT_IF_R.create();
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(ioActIfR);
			
			builder.addWhereWithAnd(ioActIfR.ext_sys_cd.eq(value(up0().ext_sys_cd())));
			builder.addWhereWithAnd(ioActIfR.exe_sts_typ.eq(value(MAC_EXE_STS_TYP.OK.value())));
			builder.addWhereWithAnd(ioActIfR.slip_no.eq(bind(MST_IO_ACT_IF_R.$slip_no)));
			
			MCList<MST_IO_ACT_IF_R> srchIfRslt = MCList.create(MST_IO_ACT_IF_R.class);
			dbSelect("MSLCL5020_MST_IO_ACT_IF_S02", srchIfRslt, builder, srchTrnRsltL);
			
			return srchIfRslt;
		}
		
		@Override
		protected void writeEndLog() {
			if (super._rsltErrNum == 0 && !super._exceptionFlg) {
				if (_rsltTotalNum == 0) {
					writeLogForProcessLog(MAUDL0008);
				}
			}
			
			writeLogForEndLog(MSLCL0007, getCo().co_cd(), super._rsltTotalNum, super._rsltOkNum, super._rsltErrNum);
		}

		// RowMapper
		protected Map_MST_IO_ACT_IF_R_MST_IO_ACT_R<MCRow, MCRow> createMap_MST_IO_ACT_IF_R_MST_IO_ACT_R() {
			return new Map_MST_IO_ACT_IF_R_MST_IO_ACT_R<MCRow, MCRow>();
		}

		public class Map_MST_IO_ACT_IF_R_MST_IO_ACT_R<D extends MCRow, S extends MCRow> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_IO_ACT_IF_R.$data_upd_ts, MST_IO_ACT_R.$upd_ts);
				
				addColumnPathMap(MST_IO_ACT_IF_R.$slip_no, MST_IO_ACT_R.$slip_no);
				addColumnPathMap(MST_IO_ACT_IF_R.$slip_seq_no, MST_IO_ACT_R.$slip_seq_no);
				addColumnPathMap(MST_IO_ACT_IF_R.$ac_ym, MST_IO_ACT_R.$ac_ym);
				addColumnPathMap(MST_IO_ACT_IF_R.$ac_dt, MST_IO_ACT_R.$ac_dt);
				addColumnPathMap(MST_IO_ACT_IF_R.$act_tm, MST_IO_ACT_R.$act_tm);
				addColumnPathMap(MST_IO_ACT_IF_R.$act_no, MST_IO_ACT_R.$act_no);
				addColumnPathMap(MST_IO_ACT_IF_R.$act_seq, MST_IO_ACT_R.$act_seq);
				addColumnPathMap(MST_IO_ACT_IF_R.$act_rev_no, MST_IO_ACT_R.$act_rev_no);
				addColumnPathMap(MST_IO_ACT_IF_R.$act_d_no, MST_IO_ACT_R.$act_d_no);
				addColumnPathMap(MST_IO_ACT_IF_R.$act_d_seq, MST_IO_ACT_R.$act_d_seq);
				addColumnPathMap(MST_IO_ACT_IF_R.$act_io_no, MST_IO_ACT_R.$act_io_no);
				addColumnPathMap(MST_IO_ACT_IF_R.$act_io_seq, MST_IO_ACT_R.$act_io_seq);
				addColumnPathMap(MST_IO_ACT_IF_R.$slip_sts_typ, MST_IO_ACT_R.$slip_sts_typ);
				addColumnPathMap(MST_IO_ACT_IF_R.$un_fix_flg, MST_IO_ACT_R.$un_fix_flg);
				addColumnPathMap(MST_IO_ACT_IF_R.$trd_cd, MST_IO_ACT_R.$trd_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$trd_ptn_typ, MST_IO_ACT_R.$trd_ptn_typ);
				addColumnPathMap(MST_IO_ACT_IF_R.$trn_typ, MST_IO_ACT_R.$trn_typ);
				addColumnPathMap(MST_IO_ACT_IF_R.$io_act_typ, MST_IO_ACT_R.$io_act_typ);
				addColumnPathMap(MST_IO_ACT_IF_R.$io_typ, MST_IO_ACT_R.$io_typ);
				addColumnPathMap(MST_IO_ACT_IF_R.$ac_slip_typ, MST_IO_ACT_R.$ac_slip_typ);
				addColumnPathMap(MST_IO_ACT_IF_R.$rsn_cd, MST_IO_ACT_R.$rsn_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$ac_rsn_cd, MST_IO_ACT_R.$ac_rsn_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$gi_wg_cd, MST_IO_ACT_R.$gi_wg_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$gr_wg_cd, MST_IO_ACT_R.$gr_wg_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$act_dpt_cd, MST_IO_ACT_R.$act_dpt_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$purc_dpt_cd, MST_IO_ACT_R.$purc_dpt_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$ap_dpt_cd, MST_IO_ACT_R.$ap_dpt_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$sls_dpt_cd, MST_IO_ACT_R.$sls_dpt_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$ar_dpt_cd, MST_IO_ACT_R.$ar_dpt_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$gi_dpt_cd, MST_IO_ACT_R.$gi_dpt_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$gr_dpt_cd, MST_IO_ACT_R.$gr_dpt_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$bd_dpt_cd, MST_IO_ACT_R.$bd_dpt_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$sub_dpt_cd1, MST_IO_ACT_R.$sub_dpt_cd1);
				addColumnPathMap(MST_IO_ACT_IF_R.$sub_dpt_cd2, MST_IO_ACT_R.$sub_dpt_cd2);
				addColumnPathMap(MST_IO_ACT_IF_R.$sub_dpt_cd3, MST_IO_ACT_R.$sub_dpt_cd3);
				addColumnPathMap(MST_IO_ACT_IF_R.$act_usr_cd, MST_IO_ACT_R.$act_usr_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$sls_usr_cd, MST_IO_ACT_R.$sls_usr_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$mfg_usr_cd, MST_IO_ACT_R.$mfg_usr_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$purc_usr_cd, MST_IO_ACT_R.$purc_usr_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$ac_itm_grp_cd, MST_IO_ACT_R.$ac_itm_grp_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$itm_jnl_cd, MST_IO_ACT_R.$itm_jnl_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$itm_cd, MST_IO_ACT_R.$itm_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$itm_sub1, MST_IO_ACT_R.$itm_sub1);
				addColumnPathMap(MST_IO_ACT_IF_R.$itm_sub2, MST_IO_ACT_R.$itm_sub2);
				addColumnPathMap(MST_IO_ACT_IF_R.$itm_sub3, MST_IO_ACT_R.$itm_sub3);
				addColumnPathMap(MST_IO_ACT_IF_R.$itm_nm, MST_IO_ACT_R.$itm_nm);
				addColumnPathMap(MST_IO_ACT_IF_R.$loc_cd, MST_IO_ACT_R.$loc_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$str_ln_cd, MST_IO_ACT_R.$str_ln_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$stk_arrv_bp_cd, MST_IO_ACT_R.$stk_arrv_bp_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$lot_no, MST_IO_ACT_R.$lot_no);
				addColumnPathMap(MST_IO_ACT_IF_R.$sublot_no, MST_IO_ACT_R.$sublot_no);
				addColumnPathMap(MST_IO_ACT_IF_R.$sno1, MST_IO_ACT_R.$sno1);
				addColumnPathMap(MST_IO_ACT_IF_R.$sno2, MST_IO_ACT_R.$sno2);
				addColumnPathMap(MST_IO_ACT_IF_R.$sno3, MST_IO_ACT_R.$sno3);
				addColumnPathMap(MST_IO_ACT_IF_R.$sno4, MST_IO_ACT_R.$sno4);
				addColumnPathMap(MST_IO_ACT_IF_R.$gd_cd, MST_IO_ACT_R.$gd_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$in_xfr_typ, MST_IO_ACT_R.$in_xfr_typ);
				addColumnPathMap(MST_IO_ACT_IF_R.$quality_typ, MST_IO_ACT_R.$quality_typ);
				addColumnPathMap(MST_IO_ACT_IF_R.$asst_typ, MST_IO_ACT_R.$asst_typ);
				addColumnPathMap(MST_IO_ACT_IF_R.$stk_insp_typ, MST_IO_ACT_R.$stk_insp_typ);
				addColumnPathMap(MST_IO_ACT_IF_R.$stk_id_typ, MST_IO_ACT_R.$stk_id_typ);
				addColumnPathMap(MST_IO_ACT_IF_R.$stk_bp_cd, MST_IO_ACT_R.$stk_bp_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$trd_unit_cd, MST_IO_ACT_R.$trd_unit_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$pack_unit_cd, MST_IO_ACT_R.$pack_unit_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$base_unit_cd, MST_IO_ACT_R.$base_unit_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$trd_cur_cd, MST_IO_ACT_R.$trd_cur_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$trd_cur_proc_amt, MST_IO_ACT_R.$trd_cur_proc_amt);
				addColumnPathMap(MST_IO_ACT_IF_R.$trd_cur_onr_prov_amt, MST_IO_ACT_R.$trd_cur_onr_prov_amt);
				addColumnPathMap(MST_IO_ACT_IF_R.$base_cur_cd, MST_IO_ACT_R.$base_cur_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$base_cur_proc_amt, MST_IO_ACT_R.$base_cur_proc_amt);
				addColumnPathMap(MST_IO_ACT_IF_R.$base_cur_onr_prov_amt, MST_IO_ACT_R.$base_cur_onr_prov_amt);
				addColumnPathMap(MST_IO_ACT_IF_R.$ptax_cur_cd, MST_IO_ACT_R.$ptax_cur_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$ptax_cur_proc_amt, MST_IO_ACT_R.$ptax_cur_proc_amt);
				addColumnPathMap(MST_IO_ACT_IF_R.$ptax_cur_onr_prov_amt, MST_IO_ACT_R.$ptax_cur_onr_prov_amt);
				addColumnPathMap(MST_IO_ACT_IF_R.$wtax_rate, MST_IO_ACT_R.$wtax_rate);
				addColumnPathMap(MST_IO_ACT_IF_R.$tax_cd, MST_IO_ACT_R.$tax_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$foreign_flg, MST_IO_ACT_R.$foreign_flg);
				addColumnPathMap(MST_IO_ACT_IF_R.$xrate_cd, MST_IO_ACT_R.$xrate_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$xrate, MST_IO_ACT_R.$xrate);
				addColumnPathMap(MST_IO_ACT_IF_R.$ptax_xrate_cd, MST_IO_ACT_R.$ptax_xrate_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$ptax_xrate, MST_IO_ACT_R.$ptax_xrate);
				addColumnPathMap(MST_IO_ACT_IF_R.$slo_no, MST_IO_ACT_R.$slo_no);
				addColumnPathMap(MST_IO_ACT_IF_R.$po_no, MST_IO_ACT_R.$po_no);
				addColumnPathMap(MST_IO_ACT_IF_R.$iv_no, MST_IO_ACT_R.$iv_no);
				addColumnPathMap(MST_IO_ACT_IF_R.$rcpt_iv_no, MST_IO_ACT_R.$rcpt_iv_no);
				addColumnPathMap(MST_IO_ACT_IF_R.$dlv_cd, MST_IO_ACT_R.$dlv_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$tdlv_cd, MST_IO_ACT_R.$tdlv_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$rcst_cd, MST_IO_ACT_R.$rcst_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$bcst_cd, MST_IO_ACT_R.$bcst_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$acst_cd, MST_IO_ACT_R.$acst_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$cst_cd, MST_IO_ACT_R.$cst_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$dest_cd1, MST_IO_ACT_R.$dest_cd1);
				addColumnPathMap(MST_IO_ACT_IF_R.$dest_cd2, MST_IO_ACT_R.$dest_cd2);
				addColumnPathMap(MST_IO_ACT_IF_R.$dest_cd3, MST_IO_ACT_R.$dest_cd3);
				addColumnPathMap(MST_IO_ACT_IF_R.$psppl_cd, MST_IO_ACT_R.$psppl_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$bsppl_cd, MST_IO_ACT_R.$bsppl_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$asppl_cd, MST_IO_ACT_R.$asppl_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$sppl_cd, MST_IO_ACT_R.$sppl_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$cred_cd, MST_IO_ACT_R.$cred_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$spot_flg, MST_IO_ACT_R.$spot_flg);
				addColumnPathMap(MST_IO_ACT_IF_R.$sttl_schd_dt, MST_IO_ACT_R.$sttl_schd_dt);
				addColumnPathMap(MST_IO_ACT_IF_R.$sttl_cd, MST_IO_ACT_R.$sttl_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$cst_itm_cd, MST_IO_ACT_R.$cst_itm_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$cst_itm_nm, MST_IO_ACT_R.$cst_itm_nm);
				addColumnPathMap(MST_IO_ACT_IF_R.$sppl_itm_cd, MST_IO_ACT_R.$sppl_itm_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$sppl_itm_nm, MST_IO_ACT_R.$sppl_itm_nm);
				addColumnPathMap(MST_IO_ACT_IF_R.$purc_typ, MST_IO_ACT_R.$purc_typ);
				addColumnPathMap(MST_IO_ACT_IF_R.$area_cd, MST_IO_ACT_R.$area_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$cntry_cd, MST_IO_ACT_R.$cntry_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$itm_mfg_inst_no, MST_IO_ACT_R.$itm_mfg_inst_no);
				addColumnPathMap(MST_IO_ACT_IF_R.$itm_inst_qty, MST_IO_ACT_R.$itm_inst_qty);
				addColumnPathMap(MST_IO_ACT_IF_R.$mfg_inst_no, MST_IO_ACT_R.$mfg_inst_no);
				addColumnPathMap(MST_IO_ACT_IF_R.$mfg_act_no, MST_IO_ACT_R.$mfg_act_no);
				addColumnPathMap(MST_IO_ACT_IF_R.$mfg_st_qty, MST_IO_ACT_R.$mfg_st_qty);
				addColumnPathMap(MST_IO_ACT_IF_R.$oper_act_no, MST_IO_ACT_R.$oper_act_no);
				addColumnPathMap(MST_IO_ACT_IF_R.$yield_rate, MST_IO_ACT_R.$yield_rate);
				addColumnPathMap(MST_IO_ACT_IF_R.$disp_seq, MST_IO_ACT_R.$disp_seq);
				addColumnPathMap(MST_IO_ACT_IF_R.$oper_cd, MST_IO_ACT_R.$oper_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$mfg_inst_unit_typ, MST_IO_ACT_R.$mfg_inst_unit_typ);
				addColumnPathMap(MST_IO_ACT_IF_R.$gi_loc_cd, MST_IO_ACT_R.$gi_loc_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$gr_loc_cd, MST_IO_ACT_R.$gr_loc_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$stktk_base_dt, MST_IO_ACT_R.$stktk_base_dt);
				addColumnPathMap(MST_IO_ACT_IF_R.$par_ac_itm_grp_cd, MST_IO_ACT_R.$par_ac_itm_grp_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$par_itm_jnl_cd, MST_IO_ACT_R.$par_itm_jnl_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$par_itm_cd, MST_IO_ACT_R.$par_itm_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$par_itm_sub1, MST_IO_ACT_R.$par_itm_sub1);
				addColumnPathMap(MST_IO_ACT_IF_R.$par_itm_sub2, MST_IO_ACT_R.$par_itm_sub2);
				addColumnPathMap(MST_IO_ACT_IF_R.$par_itm_sub3, MST_IO_ACT_R.$par_itm_sub3);
				addColumnPathMap(MST_IO_ACT_IF_R.$par_itm_nm, MST_IO_ACT_R.$par_itm_nm);
				addColumnPathMap(MST_IO_ACT_IF_R.$par_lot_no, MST_IO_ACT_R.$par_lot_no);
				addColumnPathMap(MST_IO_ACT_IF_R.$par_sublot_no, MST_IO_ACT_R.$par_sublot_no);
				addColumnPathMap(MST_IO_ACT_IF_R.$par_sno1, MST_IO_ACT_R.$par_sno1);
				addColumnPathMap(MST_IO_ACT_IF_R.$par_sno2, MST_IO_ACT_R.$par_sno2);
				addColumnPathMap(MST_IO_ACT_IF_R.$par_sno3, MST_IO_ACT_R.$par_sno3);
				addColumnPathMap(MST_IO_ACT_IF_R.$par_sno4, MST_IO_ACT_R.$par_sno4);
				addColumnPathMap(MST_IO_ACT_IF_R.$accrual_flg, MST_IO_ACT_R.$accrual_flg);
				addColumnPathMap(MST_IO_ACT_IF_R.$accpt_flg, MST_IO_ACT_R.$accpt_flg);
				addColumnPathMap(MST_IO_ACT_IF_R.$avl_flg, MST_IO_ACT_R.$avl_flg);
				addColumnPathMap(MST_IO_ACT_IF_R.$trd_rmrks, MST_IO_ACT_R.$trd_rmrks);
				addColumnPathMap(MST_IO_ACT_IF_R.$trd_d_rmrks, MST_IO_ACT_R.$trd_d_rmrks);
				addColumnPathMap(MST_IO_ACT_IF_R.$sub_char1, MST_IO_ACT_R.$sub_char1);
				addColumnPathMap(MST_IO_ACT_IF_R.$sub_char2, MST_IO_ACT_R.$sub_char2);
				addColumnPathMap(MST_IO_ACT_IF_R.$sub_char3, MST_IO_ACT_R.$sub_char3);
				addColumnPathMap(MST_IO_ACT_IF_R.$sub_char4, MST_IO_ACT_R.$sub_char4);
				addColumnPathMap(MST_IO_ACT_IF_R.$sub_char5, MST_IO_ACT_R.$sub_char5);
				addColumnPathMap(MST_IO_ACT_IF_R.$sub_char6, MST_IO_ACT_R.$sub_char6);
				addColumnPathMap(MST_IO_ACT_IF_R.$sub_char7, MST_IO_ACT_R.$sub_char7);
				addColumnPathMap(MST_IO_ACT_IF_R.$sub_char8, MST_IO_ACT_R.$sub_char8);
				addColumnPathMap(MST_IO_ACT_IF_R.$sub_char9, MST_IO_ACT_R.$sub_char9);
				addColumnPathMap(MST_IO_ACT_IF_R.$sub_char10, MST_IO_ACT_R.$sub_char10);
				addColumnPathMap(MST_IO_ACT_IF_R.$sub_num1, MST_IO_ACT_R.$sub_num1);
				addColumnPathMap(MST_IO_ACT_IF_R.$sub_num2, MST_IO_ACT_R.$sub_num2);
				addColumnPathMap(MST_IO_ACT_IF_R.$sub_num3, MST_IO_ACT_R.$sub_num3);
				addColumnPathMap(MST_IO_ACT_IF_R.$sub_dt1, MST_IO_ACT_R.$sub_dt1);
				addColumnPathMap(MST_IO_ACT_IF_R.$sub_dt2, MST_IO_ACT_R.$sub_dt2);
				addColumnPathMap(MST_IO_ACT_IF_R.$sub_dt3, MST_IO_ACT_R.$sub_dt3);
				addColumnPathMap(MST_IO_ACT_IF_R.$repurc_obli_flg, MST_IO_ACT_R.$repurc_obli_flg);
				addColumnPathMap(MST_IO_ACT_IF_R.$temp_ap_flg, MST_IO_ACT_R.$temp_ap_flg);
				
				addColumnPathMap(MST_IO_ACT_IF_R.$itm_cd, MAM_STK_RPL_R.$itm_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$itm_sub1, MAM_STK_RPL_R.$itm_sub1);
				addColumnPathMap(MST_IO_ACT_IF_R.$itm_sub2, MAM_STK_RPL_R.$itm_sub2);
				addColumnPathMap(MST_IO_ACT_IF_R.$itm_sub3, MAM_STK_RPL_R.$itm_sub3);
				addColumnPathMap(MST_IO_ACT_IF_R.$itm_nm, MAM_STK_RPL_R.$itm_nm);
				addColumnPathMap(MST_IO_ACT_IF_R.$loc_cd, MAM_STK_RPL_R.$loc_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$gi_loc_cd, MAM_STK_RPL_R.$gi_loc_cd);
				addColumnPathMap(MST_IO_ACT_IF_R.$st_dt, MAM_STK_RPL_R.$st_dt);
				addColumnPathMap(MST_IO_ACT_IF_R.$end_dt, MAM_STK_RPL_R.$end_dt);
				addColumnPathMap(MST_IO_ACT_IF_R.$buf_qty, MAM_STK_RPL_R.$buf_qty);
				addColumnPathMap(MST_IO_ACT_IF_R.$rord_stk_qty, MAM_STK_RPL_R.$rord_stk_qty);
				addColumnPathMap(MST_IO_ACT_IF_R.$rord_rqst_qty, MAM_STK_RPL_R.$rord_rqst_qty);
				addColumnPathMap(MST_IO_ACT_IF_R.$memo1, MAM_STK_RPL_R.$memo1);
				addColumnPathMap(MST_IO_ACT_IF_R.$memo2, MAM_STK_RPL_R.$memo2);
				addColumnPathMap(MST_IO_ACT_IF_R.$memo3, MAM_STK_RPL_R.$memo3);
				
				addColumnPathMap(MST_IO_ACT_IF_R.$po_d_no, MST_PURC_ACT_D_R.$po_d_no);
				addColumnPathMap(MST_IO_ACT_IF_R.$slo_d_no, MST_SLS_ACT_D_R.$slo_d_no);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.setNumberNE(MST_IO_ACT_IF_R.$data_no, up0().data_no());
				dest.setStringNE(MST_IO_ACT_IF_R.$exe_sts_typ, MAC_EXE_STS_TYP.NOT_EXE.value());
				dest.setStringNE(MST_IO_ACT_IF_R.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
				dest.setStringNE(MST_IO_ACT_IF_R.$ext_sys_cd, up0().ext_sys_cd());
				dest.setDateNE(MST_IO_ACT_IF_R.$dpt_st_dt, src.getDateNE(MST_IO_ACT_IF_R.$dpt_st_dt));
				dest.setBooleanNE(MST_IO_ACT_IF_R.$bi_not_send_flg, false);
				
				String acSlipTyp = src.getString(MST_IO_ACT_R.$ac_slip_typ);
				Boolean dscntItmFlg = getItm(src).dscnt_itm_flg();
				
				dest.setNumberNE(MST_IO_ACT_IF_R.$trd_unit_qty, adjustQty(src.getNumberNE(MST_IO_ACT_R.$trd_unit_qty), acSlipTyp, dscntItmFlg));
				dest.setNumberNE(MST_IO_ACT_IF_R.$pack_unit_qty, adjustQty(src.getNumberNE(MST_IO_ACT_R.$pack_unit_qty), acSlipTyp, dscntItmFlg));
				dest.setNumberNE(MST_IO_ACT_IF_R.$base_unit_qty, adjustQty(src.getNumberNE(MST_IO_ACT_R.$base_unit_qty), acSlipTyp, dscntItmFlg));
				
				dest.setNumberNE(MST_IO_ACT_IF_R.$trd_cur_upri, adjustSign(src.getNumberNE(MST_IO_ACT_R.$trd_cur_upri), acSlipTyp, dscntItmFlg));
				dest.setNumberNE(MST_IO_ACT_IF_R.$trd_cur_amt, adjustSign(src.getNumberNE(MST_IO_ACT_R.$trd_cur_amt), acSlipTyp, dscntItmFlg));
				dest.setNumberNE(MST_IO_ACT_IF_R.$trd_cur_tax_amt, adjustSign(src.getNumberNE(MST_IO_ACT_R.$trd_cur_tax_amt), acSlipTyp, dscntItmFlg));
				dest.setNumberNE(MST_IO_ACT_IF_R.$base_cur_upri, adjustSign(src.getNumberNE(MST_IO_ACT_R.$base_cur_upri), acSlipTyp, dscntItmFlg));
				dest.setNumberNE(MST_IO_ACT_IF_R.$base_cur_amt, adjustSign(src.getNumberNE(MST_IO_ACT_R.$base_cur_amt), acSlipTyp, dscntItmFlg));
				dest.setNumberNE(MST_IO_ACT_IF_R.$base_cur_tax_amt, adjustSign(src.getNumberNE(MST_IO_ACT_R.$base_cur_tax_amt), acSlipTyp, dscntItmFlg));
				dest.setNumberNE(MST_IO_ACT_IF_R.$ptax_cur_upri, adjustSign(src.getNumberNE(MST_IO_ACT_R.$ptax_cur_upri), acSlipTyp, dscntItmFlg));
				dest.setNumberNE(MST_IO_ACT_IF_R.$ptax_cur_amt, adjustSign(src.getNumberNE(MST_IO_ACT_R.$ptax_cur_amt), acSlipTyp, dscntItmFlg));
				dest.setNumberNE(MST_IO_ACT_IF_R.$ptax_cur_tax_amt, adjustSign(src.getNumberNE(MST_IO_ACT_R.$ptax_cur_tax_amt), acSlipTyp, dscntItmFlg));
				dest.setNumberNE(MST_IO_ACT_IF_R.$wtax_amt, adjustSign(src.getNumberNE(MST_IO_ACT_R.$wtax_amt), acSlipTyp, dscntItmFlg));
				
				dest.setNumberNE(MST_IO_ACT_IF_R.$std_cost_amt, calcStdCostAmt(src));
			}

			protected MCNumber adjustQty(MCNumber qty, String acSlipTyp, Boolean dscntItmFlg) {
				MCNumber adjustedQty = null;
				if (isDscnt(acSlipTyp)
						|| isXtra(acSlipTyp)
						|| (dscntItmFlg && isXpnsOrSls(acSlipTyp))) {
					adjustedQty = MCNumber.ZERO;
				}
				else {
					adjustedQty = qty;
				}
				return adjustedQty;
			}

			/**
			 * 会計伝票区分が値引関連か判定する
			 */
			protected boolean isDscnt(String acSlipTyp) {
					return MAC_AC_SLIP_TYP.isPURC_DSCNT(acSlipTyp)
							|| MAC_AC_SLIP_TYP.isPURC_DSCNT_XPNS(acSlipTyp)
							|| MAC_AC_SLIP_TYP.isSLS_DSCNT(acSlipTyp);
			}

			/**
			 * 会計伝票区分が値増関連か判定する
			 */
			protected boolean isXtra(String acSlipTyp) {
					return MAC_AC_SLIP_TYP.isPURC_XTRA(acSlipTyp)
							|| MAC_AC_SLIP_TYP.isPURC_XTRA_XPNS(acSlipTyp)
							|| MAC_AC_SLIP_TYP.isSLS_XTRA(acSlipTyp);
			}

			/**
			 * 会計伝票区分が「経費購買」「経費返品」「売上」「売上返品」か判定する
			 */
			protected boolean isXpnsOrSls(String acSlipTyp) {
					return MAC_AC_SLIP_TYP.isPURC_XPNS(acSlipTyp)
							|| MAC_AC_SLIP_TYP.isPURC_RET_XPNS(acSlipTyp)
							|| MAC_AC_SLIP_TYP.isSLS(acSlipTyp)
							|| MAC_AC_SLIP_TYP.isSLS_RET(acSlipTyp);
			}

			protected MCNumber adjustSign(MCNumber value, String acSlipTyp, Boolean dscntItmFlg) {
				MCNumber adjustedValue = null;
				if (!isNull(value)
						&&(isDscnt(acSlipTyp) || (isXpnsOrSls(acSlipTyp) && dscntItmFlg))) {
					adjustedValue = value.multiply(-1);
				}
				else {
					adjustedValue = value;
				}
				
				return adjustedValue;
			}
			
			// 標準単価金額計算
			protected MCNumber calcStdCostAmt(S src) {
				MCNumber stdUpri = src.getNumberNE(MAM_STDCOST_R.$std_upri);
				MCNumber stdQty = src.getNumberNE(MAM_STDCOST_R.$std_qty);
				MCNumber baseUnitQty = src.getNumberNE(MST_IO_ACT_R.$base_unit_qty); 
				MCNumber stdCostAmt =  null;
				
				if (!isNull(stdUpri) && !isNull(stdQty) && !isNull(baseUnitQty)) {
					MCNumber num = stdUpri.multiply(baseUnitQty);
					stdCostAmt = num.divide(stdQty, getCo().stk_amt_dec_place().intValue(), MAC_RND_TYP.toMC(getCo().stk_amt_rnd_typ()));
				}
				
				return stdCostAmt;
			}
		}
	}

	//FMCB CUSTOM END
}