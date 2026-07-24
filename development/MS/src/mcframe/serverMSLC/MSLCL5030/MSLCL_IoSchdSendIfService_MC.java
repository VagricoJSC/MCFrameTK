package mcframe.serverMSLC.MSLCL5030;

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

import mcframe.serverCore.resource.MCConst;

import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_BeforeAfterValidater;

import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLCL_IoSchdSendIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLCL_IoSchdSendIfService_MC extends MSLCL_IoSchdSendIfService_MC_A{
	//FMCB CUSTOM START

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 受払予定のデータをBILinkのDBに登録する処理を実行する。<br>
	 */
	public class Upd01 extends MSLCL_IoSchdSendIfService_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		
		/**
		 * 個別の入力チェック
		 */
		@Override
		protected void chkUpItemsIndividual() {
			
			// ＩＦ処理区分の値チェック
			if (!MAC_IF_PROC_TYP.isIO_SCHD_SEND(up0().if_proc_typ())) {
				MCMessagePool.add(new MCMessage(MSLCL0001, up0().if_proc_typ()));
			}
			
			// 抽出年月日ＦＲＯＭの必須チェック
			MCMessagePool.addAll(check(up0(), Upd01_DtlR.$dt_fr, new FXUCL_RequiredValidater()));
			// 抽出年月日ＴＯの必須チェック
			MCMessagePool.addAll(check(up0(), Upd01_DtlR.$dt_to, new FXUCL_RequiredValidater()));
			
			// 抽出年月日ＦＲＯＭ ＜＝抽出年月日ＴＯであることのチェック
			String[] cols = new String[] {
					Upd01_DtlR.$dt_fr, Upd01_DtlR.$dt_to
			};
			MCMessagePool.addAll(check(up0(), cols, new FXUCL_BeforeAfterValidater()));
		}
		
		/**
		 * Upd02のモジュールＩＤ、ロジックＩＤ、オペレーションＩＤをセット
		 */
		@Override
		protected void setUpd02Operation() {
			super._upd02ModuleId = "MS";
			super._upd02LogicId = "MSLCL5030";
			super._upd02OperationId = "Upd02";
		}
		
		@Override
		protected void writeStartLog() {
			MCMessagePool.add(MSLCL0015);
		}
		
		@Override
		protected void writeEndLog() {
			MCMessagePool.add(MSLCL0016);
		}
	}
	/**
	 * Upd02オペレーション.<p>
	 *
	 * 受払予定のデータをBILinkのDBに登録する。<br>
	 */
	public class Upd02 extends MSLCL_IoSchdSendIfService_MC_A.Upd02 {
		
		@Override
		protected void call() {
			super.call();
		}
		
		/**
		 * 開始ログを出力
		 */
		@Override
		protected void writeStartLog() {
			writeLogForStartLog(MSLCL0002, getUserCoCd(), up0().if_proc_typ());
		}
		
		/**
		 * 処理に必要な値をセット
		 */
		@Override
		protected void setup() {
			// 1回のフェッチで何件のレコードを取得するか
			super._fetchSize = MCConst.app.getInteger("MS.MSLCL5030.fetch_size", 1000);
			// 1スレッド当たり何件のレコードを処理するか
			super._threadRecordCnt = MCConst.app.getInteger("MS.MSLCL5030.thread_record_cnt", 1000);
			
			setupDBC();
			setupUpdBiNotSendFlg();
			setupIns();
			setupInsForDlt();
		}
		
		/**
		 * 使用するＤＢコンテナをセット
		 */
		protected void setupDBC() {
			super._ifTblContainerClassPath = "mcframe.serverMS.dbc.MST_IO_SCHD_IF_R";
			super._trnTblContainerClassPath = "mcframe.serverMS.dbc.MST_IO_SCHD_R";
		}
		
		/**
		 * ＢＩ送信対象外ＦＬＧをtrueにupdateする処理で使用する親クラスのフィールドをセット
		 */
		protected void setupUpdBiNotSendFlg() {
			MST_IO_SCHD_IF_R ioSchdIfR = MST_IO_SCHD_IF_R.create("T1");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(ioSchdIfR);
			builder.addWhereWithAnd(ioSchdIfR.ext_sys_cd.eq(bind(MST_IO_SCHD_IF_R.$ext_sys_cd)));
			builder.addWhereWithAnd(ioSchdIfR.schd_dt.gte(bind("dtFrom")));
			builder.addWhereWithAnd(ioSchdIfR.schd_dt.lte(bind("dtTo")));
			builder.addWhereWithAnd(ioSchdIfR.bi_not_send_flg.eq(bind(MST_IO_SCHD_IF_R.$bi_not_send_flg)));
			builder.addWhereWithAnd(ioSchdIfR.exe_sts_typ.eq(bind("exeStsTypeNotExe")).or(ioSchdIfR.exe_sts_typ.eq(bind("exeStsTypeNotErr"))));
			super._ifTblUpdBiNotSendFlgBuilder = builder;
			
			MCRow bind = MCRow.create();
			bind.setStringNE(MST_IO_SCHD_IF_R.$ext_sys_cd, up0().ext_sys_cd());
			bind.setDateNE("dtFrom", up0().dt_fr());
			bind.setDateNE("dtTo", up0().dt_to());
			bind.setBooleanNE(MST_IO_SCHD_IF_R.$bi_not_send_flg, false);
			bind.setStringNE("exeStsTypeNotExe", MAC_EXE_STS_TYP.NOT_EXE.value());
			bind.setStringNE("exeStsTypeNotErr", MAC_EXE_STS_TYP.ERR.value());
			super._updBiNotSendFlgBind = bind; 
			
			super._sqlIdSelectBiNotSendFlg = "MSLCL5030_MST_IO_SCHD_IF_S01";
			super._sqlIdUpdBiNotSendFlg = "MSLCL5030_MST_IO_SCHD_IF_U01";
		}
		
		/**
		 * IFテーブルにレコードをinsertする処理(mcframe側で、新規or訂正されたレコード用)で使用する親クラスのフィールドをセット
		 */
		protected void setupIns() {
			MST_IO_SCHD_R ioSchdR = MST_IO_SCHD_R.create("T1");
			MAM_STK_RPL_R stkRplR = MAM_STK_RPL_R.create("T2");
			MAM_LOC_R locR = MAM_LOC_R.create("T3");
			MAM_DPT_R dptR = MAM_DPT_R.create("T4");
			MAM_TERM_R termR = MAM_TERM_R.create("T5");
			MAM_STDCOST_R stdCostR = MAM_STDCOST_R.create("T6");
			
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(ioSchdR);
			addSelectTrnColumn(builder, stkRplR, locR, dptR, stdCostR);
			
			builder.addLeftOuterJoin(stkRplR, 
				bracket(
					ioSchdR.itm_cd.eq(stkRplR.itm_cd)
					.and(ioSchdR.itm_sub1.eq(stkRplR.itm_sub1))
					.and(ioSchdR.itm_sub2.eq(stkRplR.itm_sub2))
					.and(ioSchdR.itm_sub3.eq(stkRplR.itm_sub3))
					.and(ioSchdR.loc_cd.eq(stkRplR.loc_cd))
					.and(ioSchdR.schd_dt.gte(stkRplR.st_dt))
					.and(ioSchdR.schd_dt.lte(stkRplR.end_dt))
				));
			builder.addLeftOuterJoin(locR, 
				bracket(
					ioSchdR.loc_cd.eq(locR.loc_cd)
				));
			builder.addLeftOuterJoin(dptR,
				bracket(
					locR.asst_dpt_cd.eq(dptR.dpt_cd)
					.and(ioSchdR.schd_dt.gte(dptR.st_dt))
					.and(ioSchdR.schd_dt.lte(dptR.end_dt))
				));
			builder.addLeftOuterJoin(termR,
				bracket(
					termR.term.lte(MAPA_DT$F_GET_AC_YM1(ioSchdR.schd_dt))
					.and(MAPA_DT$F_GET_AC_YM1(ioSchdR.schd_dt).lt(termR.term_end_ym))
				));
			builder.addLeftOuterJoin(stdCostR,
				bracket(
					ioSchdR.itm_cd.eq(stdCostR.itm_cd)
					.and(ioSchdR.itm_sub1.eq(stdCostR.itm_sub1))
					.and(ioSchdR.itm_sub2.eq(stdCostR.itm_sub2))
					.and(ioSchdR.itm_sub3.eq(stdCostR.itm_sub3))
					.and(termR.term.eq(stdCostR.term))
					.and(ioSchdR.wg_cd.eq(stdCostR.wg_cd))
				));
			
			builder.addWhereWithAnd(ioSchdR.schd_dt.gte(bind("dtFrom")));
			builder.addWhereWithAnd(ioSchdR.schd_dt.lte(bind("dtTo")));
			builder.addWhereWithAnd(MSC_IO_SCHD_TYP$IS_BI_TGT(ioSchdR.io_schd_typ).eq(bind("biTgt")));
			super._trnTblExtractBuilder = builder;
			
			MCRow bind = MCRow.create();
			bind.setDateNE("dtFrom", up0().dt_fr());
			bind.setDateNE("dtTo", up0().dt_to());
			bind.setBooleanNE("biTgt", true);
			super._trnTblExtractBind = bind; 
			
			super._sqlIdSelectExtractTrn = "MSLCL5030_MST_IO_SCHD_S01";
			super._sqlIdInsExtractTrn = "MSLCL5030_MST_IO_SCHD_IF_I01";
		}
		
		/**
		 * selectするカラムを追加する.
		 * @param builder 処理に使用するMCQueryApiBuilder
		 * @param stkRplR 在庫補充マスタのDBコンテナ
		 * @param locR 場所マスタのDBコンテナ
		 * @param dptR 部門マスタのDBコンテナ
		 * @param stdCostR 標準単価マスタのDBコンテナ
		 */
		protected void addSelectTrnColumn(MCQueryApiBuilder builder, MAM_STK_RPL_R stkRplR, MAM_LOC_R locR, MAM_DPT_R dptR, MAM_STDCOST_R stdCostR) {
			
			// 部門マスタ適用開始日
			builder.addSelect(dptR.st_dt.as("DPT_ST_DT"));
			// 部門ＣＤ
			builder.addSelect(locR.asst_dpt_cd.as("DPT_CD"));
			
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
		}
		
		/**
		 * IFテーブルにレコードをinsertする処理(mcframe側で、削除されたレコード用)で使用する親クラスのフィールドをセット
		 */
		protected void setupInsForDlt() {
			MST_IO_SCHD_IF_R ioSchdIfR = MST_IO_SCHD_IF_R.create("T1");
			MST_IO_SCHD_R ioSchdR = MST_IO_SCHD_R.create("T2");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(ioSchdIfR);
			builder.addWhereWithAnd(notExists(
				subQuery().select(value("X")).from(ioSchdR).
				where(ioSchdIfR.slip_schd_no.eq(ioSchdR.slip_schd_no).and(MSC_IO_SCHD_TYP$IS_BI_TGT(ioSchdR.io_schd_typ).eq(bind("biTgt"))))
				));
			builder.addWhereWithAnd(ioSchdIfR.ext_sys_cd.eq(bind(MST_IO_SCHD_IF_R.$ext_sys_cd)));
			builder.addWhereWithAnd(ioSchdIfR.schd_dt.gte(bind("dtFrom")));
			builder.addWhereWithAnd(ioSchdIfR.schd_dt.lte(bind("dtTo")));
			builder.addWhereWithAnd(ioSchdIfR.bi_not_send_flg.eq(bind(MST_IO_SCHD_IF_R.$bi_not_send_flg)));
			builder.addWhereWithAnd(ioSchdIfR.exe_sts_typ.eq(bind("exeStsTypeOk")));
			builder.addOrderByAsc(ioSchdIfR.slip_schd_no);
			super._trnTblExtractDltBuilder = builder;
			
			MCRow bind = MCRow.create();
			bind.setStringNE(MST_IO_SCHD_IF_R.$ext_sys_cd, up0().ext_sys_cd());
			bind.setDateNE("dtFrom", up0().dt_fr());
			bind.setDateNE("dtTo", up0().dt_to());
			bind.setBooleanNE(MST_IO_SCHD_IF_R.$bi_not_send_flg, false);
			bind.setStringNE("exeStsTypeOk", MAC_EXE_STS_TYP.OK.value());
			bind.setBooleanNE("biTgt", true);
			super._trnTblExtractDltBind = bind;
			
			_ifTblCmpKeys = new String[] {
				"slip_schd_no"
			};
			
			super._sqlIdSelectExtractDltTrn = "MSLCL5030_MST_IO_SCHD_IF_S02";
			super._sqlIdInsExtractDltTrn = "MSLCL5030_MST_IO_SCHD_IF_I02";
			
		}
		
		/**
		 * IFテーブルに登録するレコードの抽出後の後処理
		 * @param srchRsltL 登録対象のデータ
		 * @return 必要なデータセットやレコードの追加を行った結果のリスト
		 */
		@Override
		protected MCList<MCRow> srchPostForInsRecord(MCList<MCRow> srchTrnRsltL) {
			// 検索後処理
			
			// IFテーブルから同一キーのレコードを抽出する
			MCList<? extends MCRow> srchIfRsltL = srchSameKeyIfRecord(srchTrnRsltL);
			
			// 同一キーレコードが複数ある場合は、最新レコードのみを使用するため、不要レコードを削除したMCListを作成する
			MCList<? extends MCRow>[] sameKeyGroupL = srchIfRsltL.groupList(MST_IO_SCHD_IF_R.$slip_schd_no);
			MCList<MCRow> latestIfL = MCList.create(MCRow.class);
			for (MCList<? extends MCRow> rowL : sameKeyGroupL) {
				// 同一キー内で、最も新しいレコードを取得する(「送信元レコード更新日時」「更新日時」の降順でソートし、その1行目を取得)
				rowL.sort(SortType.DESC, MST_IO_SCHD_IF_R.$data_upd_ts, MST_IO_SCHD_IF_R.$upd_ts);
				latestIfL.add(rowL.get(0));
			}
			MCIndexKey latestIfLIdxKey = latestIfL.createIndex(MST_IO_SCHD_IF_R.$slip_schd_no);
			
			// IFテーブルにinsertするデータを作成する
			MCList<MCRow> rsltL = MCList.create(MCRow.class);
			for (MCRow trnR : srchTrnRsltL) {
				// IFテーブルに同一キーが存在するかをチェックする
				MCRow matchedIfRow = latestIfL.getFirst(latestIfLIdxKey, trnR.getStringNE(MST_IO_SCHD_IF_R.$slip_schd_no));
				
				if (isNull(matchedIfRow)) {
					// IFテーブルに同一キーのレコード無しのため、登録対象とする
					addLForNewRecord(rsltL, trnR);
				}
				else {
					if (MAC_DATA_CRUD_TYP.DEL.value().equals(matchedIfRow.getStringNE("data_crud_typ")) ) {
						// 最新の同一キーレコードのデータ更新区分が「削除」の場合は、新規レコードのみを登録する
						addLForNewRecord(rsltL, trnR);
					}
					else {
						// トランの方が新しければ、削除レコードと新規レコードをセットで登録する
						MCTimestamp trnTimestamp = trnR.getTimestampNE(MST_IO_SCHD_R.$upd_ts);
						MCTimestamp ifTimestamp = matchedIfRow.getTimestampNE(MST_IO_SCHD_IF_R.$data_upd_ts);
						if (isNewRecord(trnTimestamp, ifTimestamp)) {
							addLForUpdRecord(rsltL, trnR, matchedIfRow);
						}
					}
				}
			}
			
			// データ行NOをセットする
			setDataLNo(MSC_NUM_SYS_TYP.IOSCHDIF, rsltL);
			
			return rsltL;
		}
		
		/**
		 * トランのデータから、IFテーブルにinsertする形にデータをマッピング(新規レコード)
		 * @param rsltL マッピング結果を追加するリスト
		 * @param trnR マッピングの元データ
		 */
		protected void addLForNewRecord(MCList<MCRow> rsltL, MCRow trnR)  {
			
			MCRow newIfR = MCRow.create();
			copy(newIfR, trnR, createMap_TrnTbl_InsRecord());
			rsltL.add(newIfR);
		}
		
		/**
		 * トランのデータから、IFテーブルにinsertする形にデータをマッピング(更新レコード)
		 * 更新の場合、以下の2レコードをIFテーブルに登録する
		 * ・現在のデータに対する削除レコード
		 * ・新たに登録する新規レコード
		 * @param rsltL マッピング結果を追加するリスト
		 * @param trnR マッピングの元データ
		 * @param matchedIfRow IFテーブルにてマッチした同一キーのレコード
		 */
		protected void addLForUpdRecord(MCList<MCRow> rsltL, MCRow trnR, MCRow matchedIfRow) {
			
			// 「データ更新区分」が「削除」のレコードは、IFテーブルに登録されているデータを元に作成する
			MCRow dltR = MCRow.create();
			copy(dltR, matchedIfRow, createMap_IfTbl_DltRecord());
			rsltL.add(dltR);
			
			// 「データ更新区分」が「新規」のレコードは、トランから取得したデータを元に作成する
			addLForNewRecord(rsltL, trnR);
		}
		
		/**
		 * タイムスタンプを比較する
		 * @param src 比較対象のタイムスタンプsrc
		 * @param dest 比較対象のタイムスタンプdest
		 * @return true  : srcのほうが新しい
		 *         false : srcはdest以下
		 */
		protected boolean isNewRecord(MCTimestamp src, MCTimestamp dest) {
			
			if (src.compareTo(dest) <= 0) {
				return false;
			}
			return true;
		}
		
		/**
		 * 受払予定送信ＩＦテーブルにて、同一キーレコードを検索する
		 * @param srchTrnRsltL 検索対象のレコードのリスト
		 * @return 検索結果
		 */
		protected MCList<? extends MCRow> srchSameKeyIfRecord(MCList<MCRow> srchTrnRsltL) {
			
			MST_IO_SCHD_IF_R ioSchdIfR = MST_IO_SCHD_IF_R.create();
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(ioSchdIfR);
			builder.addWhereWithAnd(ioSchdIfR.ext_sys_cd.eq(bind("1")), up0().ext_sys_cd());
			builder.addWhereWithAnd(ioSchdIfR.exe_sts_typ.eq(bind("1")), MAC_EXE_STS_TYP.OK.value());
			builder.addWhereWithAnd(ioSchdIfR.slip_schd_no.eq(bind(MST_IO_SCHD_IF_R.$slip_schd_no)));
			
			MCList<MST_IO_SCHD_IF_R> srchIfRslt = MCList.create(MST_IO_SCHD_IF_R.class);
			dbSelect("MSLCL5030_MST_IO_SCHD_IF_S03", srchIfRslt, builder, srchTrnRsltL);
			
			return srchIfRslt;
		}
		
		/**
		 * IFテーブルにのみ存在するレコードの抽出後の処理
		 * @param srchIfRsltL 抽出結果
		 * @return 必要なデータセットやレコードの追加を行った結果のリスト
		 */
		@Override
		protected MCList<MCRow> srchPostForInsCancelRecord(MCList<MCRow> srchIfRsltL) {
			
			// 同一キーのレコードをグループ化する
			MCList<? extends MCRow>[] sameKeyGroupL = srchIfRsltL.groupList(MST_IO_SCHD_IF_R.$slip_schd_no);
			MCList<MCRow> latestIfL = MCList.create(MCRow.class);
			for (MCList<? extends MCRow> rowL : sameKeyGroupL) {
				// 同一キー内で、最も新しいレコードを取得する(「送信元レコード更新日時」「更新日時」の降順でソートし、その1行目を取得)
				rowL.sort(SortType.DESC, MST_IO_SCHD_IF_R.$data_upd_ts, MST_IO_SCHD_IF_R.$upd_ts);
				latestIfL.add(rowL.get(0));
			}
			
			// 削除レコードを作成する
			MCList<MCRow> rsltL = MCList.create(MCRow.class);
			for (MCRow rowR : latestIfL) {
				// 最新レコードのデータ更新区分が「新規」の場合のみ、削除レコードを登録する
				if(MAC_DATA_CRUD_TYP.isCRT(rowR.getStringNE("data_crud_typ"))) {
					MCRow dltR = MCRow.create();
					copy(dltR, rowR, createMap_IfTbl_DltRecord());
					rsltL.add(dltR);
				}
			}
			
			// データ行NOをセットする
			setDataLNo(MSC_NUM_SYS_TYP.IOSCHDIF, rsltL);
			
			return rsltL;
		}
		
		/**
		 * 終了ログを出力
		 */
		@Override
		protected void writeEndLog() {
			if (super._rsltErrNum == 0 && !super._exceptionFlg) {
				if (_rsltTotalNum == 0) {
					writeLogForProcessLog(MAUDL0008);
				}
			}
			
			writeLogForEndLog(MSLCL0003, getUserCoCd(), super._rsltTotalNum, super._rsltOkNum, super._rsltErrNum, super._rsltCancelNum);
		}
		
		/**
		 * データ処理区分が「削除」のレコードを登録する処理を実行するため、オーバーライドしtrueを返すメソッド
		 */
		@Override
		protected boolean isExecInsCancelRecord() {
			return true;
		}
		
		/**
		 * トランテーブルから抽出したデータを、IFテーブルにinsertする形にデータをマッピングするRowMappernのインスタンスを作成
		 * @return RowMapper
		 */
		protected Map_TrnTbl_InsRecord<MCRow, MCRow> createMap_TrnTbl_InsRecord() {
			return new Map_TrnTbl_InsRecord <MCRow, MCRow>();
		}
		
		/**
		 * トランテーブルから抽出したデータを、IFテーブルにinsertする形にデータをマッピングするRowMapper(削除レコード用)のインスタンスを作成
		 * @return RowMapper
		 */
		protected Map_IfTbl_DltRecord<MCRow, MCRow> createMap_IfTbl_DltRecord() {
			return new Map_IfTbl_DltRecord <MCRow, MCRow>();
		}
		
		/**
		 * トランテーブルから抽出したデータを、IFテーブルにinsertする形にデータをマッピングするRowMappern
		 * @param <D> IFテーブルにinsertにデータ
		 * @param <S> トランテーブルから抽出したデータ
		 */
		public class Map_TrnTbl_InsRecord<D extends MCRow, S extends MCRow> extends MCRowMapper<D,S> {
			
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_IO_SCHD_IF_R.$data_upd_ts, MST_IO_SCHD_R.$upd_ts);
				
				addColumnPathMap(MST_IO_SCHD_IF_R.$slip_schd_no, MST_IO_SCHD_R.$slip_schd_no);
				addColumnPathMap(MST_IO_SCHD_IF_R.$io_schd_typ, MST_IO_SCHD_R.$io_schd_typ);
				addColumnPathMap(MST_IO_SCHD_IF_R.$io_typ, MST_IO_SCHD_R.$io_typ);
				addColumnPathMap(MST_IO_SCHD_IF_R.$io_schd_sts_typ, MST_IO_SCHD_R.$io_schd_sts_typ);
				addColumnPathMap(MST_IO_SCHD_IF_R.$io_schd_no, MST_IO_SCHD_R.$io_schd_no);
				addColumnPathMap(MST_IO_SCHD_IF_R.$io_schd_seq, MST_IO_SCHD_R.$io_schd_seq);
				addColumnPathMap(MST_IO_SCHD_IF_R.$io_schd_sub_typ1, MST_IO_SCHD_R.$io_schd_sub_typ1);
				addColumnPathMap(MST_IO_SCHD_IF_R.$io_schd_sub_no1, MST_IO_SCHD_R.$io_schd_sub_no1);
				addColumnPathMap(MST_IO_SCHD_IF_R.$io_schd_sub_seq1, MST_IO_SCHD_R.$io_schd_sub_seq1);
				addColumnPathMap(MST_IO_SCHD_IF_R.$io_schd_sub_typ2, MST_IO_SCHD_R.$io_schd_sub_typ2);
				addColumnPathMap(MST_IO_SCHD_IF_R.$io_schd_sub_no2, MST_IO_SCHD_R.$io_schd_sub_no2);
				addColumnPathMap(MST_IO_SCHD_IF_R.$io_schd_sub_seq2, MST_IO_SCHD_R.$io_schd_sub_seq2);
				addColumnPathMap(MST_IO_SCHD_IF_R.$io_schd_sub_typ3, MST_IO_SCHD_R.$io_schd_sub_typ3);
				addColumnPathMap(MST_IO_SCHD_IF_R.$io_schd_sub_no3, MST_IO_SCHD_R.$io_schd_sub_no3);
				addColumnPathMap(MST_IO_SCHD_IF_R.$io_schd_sub_seq3, MST_IO_SCHD_R.$io_schd_sub_seq3);
				addColumnPathMap(MST_IO_SCHD_IF_R.$io_schd_sub_typ4, MST_IO_SCHD_R.$io_schd_sub_typ4);
				addColumnPathMap(MST_IO_SCHD_IF_R.$io_schd_sub_no4, MST_IO_SCHD_R.$io_schd_sub_no4);
				addColumnPathMap(MST_IO_SCHD_IF_R.$io_schd_sub_seq4, MST_IO_SCHD_R.$io_schd_sub_seq4);
				addColumnPathMap(MST_IO_SCHD_IF_R.$io_schd_pr_no, MST_IO_SCHD_R.$io_schd_pr_no);
				addColumnPathMap(MST_IO_SCHD_IF_R.$schd_dt, MST_IO_SCHD_R.$schd_dt);
				addColumnPathMap(MST_IO_SCHD_IF_R.$accpt_schd_dt, MST_IO_SCHD_R.$accpt_schd_dt);
				addColumnPathMap(MST_IO_SCHD_IF_R.$avl_schd_dt, MST_IO_SCHD_R.$avl_schd_dt);
				addColumnPathMap(MST_IO_SCHD_IF_R.$itm_cd, MST_IO_SCHD_R.$itm_cd);
				addColumnPathMap(MST_IO_SCHD_IF_R.$itm_sub1, MST_IO_SCHD_R.$itm_sub1);
				addColumnPathMap(MST_IO_SCHD_IF_R.$itm_sub2, MST_IO_SCHD_R.$itm_sub2);
				addColumnPathMap(MST_IO_SCHD_IF_R.$itm_sub3, MST_IO_SCHD_R.$itm_sub3);
				addColumnPathMap(MST_IO_SCHD_IF_R.$loc_cd, MST_IO_SCHD_R.$loc_cd);
				addColumnPathMap(MST_IO_SCHD_IF_R.$str_ln_cd, MST_IO_SCHD_R.$str_ln_cd);
				addColumnPathMap(MST_IO_SCHD_IF_R.$stk_arrv_bp_cd, MST_IO_SCHD_R.$stk_arrv_bp_cd);
				addColumnPathMap(MST_IO_SCHD_IF_R.$lot_no, MST_IO_SCHD_R.$lot_no);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sublot_no, MST_IO_SCHD_R.$sublot_no);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sno1, MST_IO_SCHD_R.$sno1);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sno2, MST_IO_SCHD_R.$sno2);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sno3, MST_IO_SCHD_R.$sno3);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sno4, MST_IO_SCHD_R.$sno4);
				addColumnPathMap(MST_IO_SCHD_IF_R.$pack_unit_cd, MST_IO_SCHD_R.$pack_unit_cd);
				addColumnPathMap(MST_IO_SCHD_IF_R.$pack_unit_qty, MST_IO_SCHD_R.$pack_unit_qty);
				addColumnPathMap(MST_IO_SCHD_IF_R.$base_unit_cd, MST_IO_SCHD_R.$base_unit_cd);
				addColumnPathMap(MST_IO_SCHD_IF_R.$base_unit_qty, MST_IO_SCHD_R.$base_unit_qty);
				addColumnPathMap(MST_IO_SCHD_IF_R.$gd_cd, MST_IO_SCHD_R.$gd_cd);
				addColumnPathMap(MST_IO_SCHD_IF_R.$in_xfr_typ, MST_IO_SCHD_R.$in_xfr_typ);
				addColumnPathMap(MST_IO_SCHD_IF_R.$quality_typ, MST_IO_SCHD_R.$quality_typ);
				addColumnPathMap(MST_IO_SCHD_IF_R.$asst_typ, MST_IO_SCHD_R.$asst_typ);
				addColumnPathMap(MST_IO_SCHD_IF_R.$stk_insp_typ, MST_IO_SCHD_R.$stk_insp_typ);
				addColumnPathMap(MST_IO_SCHD_IF_R.$stk_id_typ, MST_IO_SCHD_R.$stk_id_typ);
				addColumnPathMap(MST_IO_SCHD_IF_R.$stk_bp_cd, MST_IO_SCHD_R.$stk_bp_cd);
				addColumnPathMap(MST_IO_SCHD_IF_R.$wg_cd, MST_IO_SCHD_R.$wg_cd);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sppl_cd, MST_IO_SCHD_R.$sppl_cd);
				addColumnPathMap(MST_IO_SCHD_IF_R.$gi_loc_cd, MST_IO_SCHD_R.$gi_loc_cd);
				addColumnPathMap(MST_IO_SCHD_IF_R.$gr_loc_cd, MST_IO_SCHD_R.$gr_loc_cd);
				addColumnPathMap(MST_IO_SCHD_IF_R.$accrual_flg, MST_IO_SCHD_R.$accrual_flg);
				addColumnPathMap(MST_IO_SCHD_IF_R.$accpt_flg, MST_IO_SCHD_R.$accpt_flg);
				addColumnPathMap(MST_IO_SCHD_IF_R.$avl_flg, MST_IO_SCHD_R.$avl_flg);
				
				addColumnPathMap(MST_IO_SCHD_IF_R.$st_dt, MAM_STK_RPL_R.$st_dt);
				addColumnPathMap(MST_IO_SCHD_IF_R.$end_dt, MAM_STK_RPL_R.$end_dt);
				addColumnPathMap(MST_IO_SCHD_IF_R.$buf_qty, MAM_STK_RPL_R.$buf_qty);
				addColumnPathMap(MST_IO_SCHD_IF_R.$rord_stk_qty, MAM_STK_RPL_R.$rord_stk_qty);
				addColumnPathMap(MST_IO_SCHD_IF_R.$rord_rqst_qty, MAM_STK_RPL_R.$rord_rqst_qty);
				addColumnPathMap(MST_IO_SCHD_IF_R.$memo1, MAM_STK_RPL_R.$memo1);
				addColumnPathMap(MST_IO_SCHD_IF_R.$memo2, MAM_STK_RPL_R.$memo2);
				addColumnPathMap(MST_IO_SCHD_IF_R.$memo3, MAM_STK_RPL_R.$memo3);
				
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_char1, MST_IO_SCHD_R.$sub_char1);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_char2, MST_IO_SCHD_R.$sub_char2);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_char3, MST_IO_SCHD_R.$sub_char3);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_char4, MST_IO_SCHD_R.$sub_char4);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_char5, MST_IO_SCHD_R.$sub_char5);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_num1, MST_IO_SCHD_R.$sub_num1);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_num2, MST_IO_SCHD_R.$sub_num2);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_num3, MST_IO_SCHD_R.$sub_num3);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_dt1, MST_IO_SCHD_R.$sub_dt1);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_dt2, MST_IO_SCHD_R.$sub_dt2);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_dt3, MST_IO_SCHD_R.$sub_dt3);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.setNumberNE(MST_IO_SCHD_IF_R.$data_no, up0().data_no());
				dest.setStringNE(MST_IO_SCHD_IF_R.$exe_sts_typ, MAC_EXE_STS_TYP.NOT_EXE.value());
				
				dest.setStringNE(MST_IO_SCHD_IF_R.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
				dest.setStringNE(MST_IO_SCHD_IF_R.$ext_sys_cd, up0().ext_sys_cd());
				
				dest.setDateNE(MST_IO_SCHD_IF_R.$dpt_st_dt, src.getDateNE("DPT_ST_DT"));
				dest.setBooleanNE(MST_IO_SCHD_IF_R.$bi_not_send_flg, false);
				
				dest.setStringNE(MST_IO_SCHD_IF_R.$dpt_cd, src.getStringNE("DPT_CD"));
				dest.setNumberNE(MST_IO_SCHD_IF_R.$std_cost_amt, calcStdCostAmt(src));
			}
			
			protected MCNumber calcStdCostAmt(S src) {
				// 標準単価金額を計算する
				MCNumber stdUpri = src.getNumberNE(MAM_STDCOST_R.$std_upri);
				MCNumber stdQty = src.getNumberNE(MAM_STDCOST_R.$std_qty);
				MCNumber baseUnitQty = src.getNumberNE(MST_IO_SCHD_R.$base_unit_qty); 
				MCNumber stdCostAmt =  null;
				
				if (!isNull(stdUpri) && !isNull(stdQty) && !isNull(baseUnitQty)) {
					MCNumber num = stdUpri.multiply(baseUnitQty);
					stdCostAmt = num.divide(stdQty, getCo().stk_amt_dec_place().intValue(), MAC_RND_TYP.toMC(getCo().stk_amt_rnd_typ()));
				}
				
				return stdCostAmt;
			}
		}
		
		/**
		 * トランテーブルから抽出したデータを、IFテーブルにinsertする形にデータをマッピングするRowMappern(削除レコード用)
		 * @param <D> IFテーブルにinsertにデータ
		 * @param <S> トランテーブルから抽出したデータ
		 */
		public class Map_IfTbl_DltRecord<D extends MCRow, S extends MCRow> extends MCRowMapper<D,S> {
			
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_IO_SCHD_IF_R.$data_crud_typ, MST_IO_SCHD_IF_R.$data_crud_typ);
				addColumnPathMap(MST_IO_SCHD_IF_R.$ext_sys_cd, MST_IO_SCHD_IF_R.$ext_sys_cd);
				addColumnPathMap(MST_IO_SCHD_IF_R.$dpt_st_dt, MST_IO_SCHD_IF_R.$dpt_st_dt);
				addColumnPathMap(MST_IO_SCHD_IF_R.$data_upd_ts, MST_IO_SCHD_IF_R.$data_upd_ts);
				addColumnPathMap(MST_IO_SCHD_IF_R.$dpt_cd, MST_IO_SCHD_IF_R.$dpt_cd);
				addColumnPathMap(MST_IO_SCHD_IF_R.$std_cost_amt, MST_IO_SCHD_IF_R.$std_cost_amt);
				addColumnPathMap(MST_IO_SCHD_IF_R.$slip_schd_no, MST_IO_SCHD_IF_R.$slip_schd_no);
				addColumnPathMap(MST_IO_SCHD_IF_R.$io_schd_typ, MST_IO_SCHD_IF_R.$io_schd_typ);
				addColumnPathMap(MST_IO_SCHD_IF_R.$io_typ, MST_IO_SCHD_IF_R.$io_typ);
				addColumnPathMap(MST_IO_SCHD_IF_R.$io_schd_sts_typ, MST_IO_SCHD_IF_R.$io_schd_sts_typ);
				addColumnPathMap(MST_IO_SCHD_IF_R.$io_schd_no, MST_IO_SCHD_IF_R.$io_schd_no);
				addColumnPathMap(MST_IO_SCHD_IF_R.$io_schd_seq, MST_IO_SCHD_IF_R.$io_schd_seq);
				addColumnPathMap(MST_IO_SCHD_IF_R.$io_schd_sub_typ1, MST_IO_SCHD_IF_R.$io_schd_sub_typ1);
				addColumnPathMap(MST_IO_SCHD_IF_R.$io_schd_sub_no1, MST_IO_SCHD_IF_R.$io_schd_sub_no1);
				addColumnPathMap(MST_IO_SCHD_IF_R.$io_schd_sub_seq1, MST_IO_SCHD_IF_R.$io_schd_sub_seq1);
				addColumnPathMap(MST_IO_SCHD_IF_R.$io_schd_sub_typ2, MST_IO_SCHD_IF_R.$io_schd_sub_typ2);
				addColumnPathMap(MST_IO_SCHD_IF_R.$io_schd_sub_no2, MST_IO_SCHD_IF_R.$io_schd_sub_no2);
				addColumnPathMap(MST_IO_SCHD_IF_R.$io_schd_sub_seq2, MST_IO_SCHD_IF_R.$io_schd_sub_seq2);
				addColumnPathMap(MST_IO_SCHD_IF_R.$io_schd_sub_typ3, MST_IO_SCHD_IF_R.$io_schd_sub_typ3);
				addColumnPathMap(MST_IO_SCHD_IF_R.$io_schd_sub_no3, MST_IO_SCHD_IF_R.$io_schd_sub_no3);
				addColumnPathMap(MST_IO_SCHD_IF_R.$io_schd_sub_seq3, MST_IO_SCHD_IF_R.$io_schd_sub_seq3);
				addColumnPathMap(MST_IO_SCHD_IF_R.$io_schd_sub_typ4, MST_IO_SCHD_IF_R.$io_schd_sub_typ4);
				addColumnPathMap(MST_IO_SCHD_IF_R.$io_schd_sub_no4, MST_IO_SCHD_IF_R.$io_schd_sub_no4);
				addColumnPathMap(MST_IO_SCHD_IF_R.$io_schd_sub_seq4, MST_IO_SCHD_IF_R.$io_schd_sub_seq4);
				addColumnPathMap(MST_IO_SCHD_IF_R.$io_schd_pr_no, MST_IO_SCHD_IF_R.$io_schd_pr_no);
				addColumnPathMap(MST_IO_SCHD_IF_R.$schd_dt, MST_IO_SCHD_IF_R.$schd_dt);
				addColumnPathMap(MST_IO_SCHD_IF_R.$accpt_schd_dt, MST_IO_SCHD_IF_R.$accpt_schd_dt);
				addColumnPathMap(MST_IO_SCHD_IF_R.$avl_schd_dt, MST_IO_SCHD_IF_R.$avl_schd_dt);
				addColumnPathMap(MST_IO_SCHD_IF_R.$itm_cd, MST_IO_SCHD_IF_R.$itm_cd);
				addColumnPathMap(MST_IO_SCHD_IF_R.$itm_sub1, MST_IO_SCHD_IF_R.$itm_sub1);
				addColumnPathMap(MST_IO_SCHD_IF_R.$itm_sub2, MST_IO_SCHD_IF_R.$itm_sub2);
				addColumnPathMap(MST_IO_SCHD_IF_R.$itm_sub3, MST_IO_SCHD_IF_R.$itm_sub3);
				addColumnPathMap(MST_IO_SCHD_IF_R.$loc_cd, MST_IO_SCHD_IF_R.$loc_cd);
				addColumnPathMap(MST_IO_SCHD_IF_R.$str_ln_cd, MST_IO_SCHD_IF_R.$str_ln_cd);
				addColumnPathMap(MST_IO_SCHD_IF_R.$stk_arrv_bp_cd, MST_IO_SCHD_IF_R.$stk_arrv_bp_cd);
				addColumnPathMap(MST_IO_SCHD_IF_R.$lot_no, MST_IO_SCHD_IF_R.$lot_no);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sublot_no, MST_IO_SCHD_IF_R.$sublot_no);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sno1, MST_IO_SCHD_IF_R.$sno1);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sno2, MST_IO_SCHD_IF_R.$sno2);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sno3, MST_IO_SCHD_IF_R.$sno3);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sno4, MST_IO_SCHD_IF_R.$sno4);
				addColumnPathMap(MST_IO_SCHD_IF_R.$pack_unit_cd, MST_IO_SCHD_IF_R.$pack_unit_cd);
				addColumnPathMap(MST_IO_SCHD_IF_R.$pack_unit_qty, MST_IO_SCHD_IF_R.$pack_unit_qty);
				addColumnPathMap(MST_IO_SCHD_IF_R.$base_unit_cd, MST_IO_SCHD_IF_R.$base_unit_cd);
				addColumnPathMap(MST_IO_SCHD_IF_R.$base_unit_qty, MST_IO_SCHD_IF_R.$base_unit_qty);
				addColumnPathMap(MST_IO_SCHD_IF_R.$gd_cd, MST_IO_SCHD_IF_R.$gd_cd);
				addColumnPathMap(MST_IO_SCHD_IF_R.$in_xfr_typ, MST_IO_SCHD_IF_R.$in_xfr_typ);
				addColumnPathMap(MST_IO_SCHD_IF_R.$quality_typ, MST_IO_SCHD_IF_R.$quality_typ);
				addColumnPathMap(MST_IO_SCHD_IF_R.$asst_typ, MST_IO_SCHD_IF_R.$asst_typ);
				addColumnPathMap(MST_IO_SCHD_IF_R.$stk_insp_typ, MST_IO_SCHD_IF_R.$stk_insp_typ);
				addColumnPathMap(MST_IO_SCHD_IF_R.$stk_id_typ, MST_IO_SCHD_IF_R.$stk_id_typ);
				addColumnPathMap(MST_IO_SCHD_IF_R.$stk_bp_cd, MST_IO_SCHD_IF_R.$stk_bp_cd);
				addColumnPathMap(MST_IO_SCHD_IF_R.$wg_cd, MST_IO_SCHD_IF_R.$wg_cd);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sppl_cd, MST_IO_SCHD_IF_R.$sppl_cd);
				addColumnPathMap(MST_IO_SCHD_IF_R.$gi_loc_cd, MST_IO_SCHD_IF_R.$gi_loc_cd);
				addColumnPathMap(MST_IO_SCHD_IF_R.$gr_loc_cd, MST_IO_SCHD_IF_R.$gr_loc_cd);
				addColumnPathMap(MST_IO_SCHD_IF_R.$accrual_flg, MST_IO_SCHD_IF_R.$accrual_flg);
				addColumnPathMap(MST_IO_SCHD_IF_R.$accpt_flg, MST_IO_SCHD_IF_R.$accpt_flg);
				addColumnPathMap(MST_IO_SCHD_IF_R.$avl_flg, MST_IO_SCHD_IF_R.$avl_flg);
				addColumnPathMap(MST_IO_SCHD_IF_R.$st_dt, MST_IO_SCHD_IF_R.$st_dt);
				addColumnPathMap(MST_IO_SCHD_IF_R.$end_dt, MST_IO_SCHD_IF_R.$end_dt);
				addColumnPathMap(MST_IO_SCHD_IF_R.$buf_qty, MST_IO_SCHD_IF_R.$buf_qty);
				addColumnPathMap(MST_IO_SCHD_IF_R.$rord_stk_qty, MST_IO_SCHD_IF_R.$rord_stk_qty);
				addColumnPathMap(MST_IO_SCHD_IF_R.$rord_rqst_qty, MST_IO_SCHD_IF_R.$rord_rqst_qty);
				addColumnPathMap(MST_IO_SCHD_IF_R.$memo1, MST_IO_SCHD_IF_R.$memo1);
				addColumnPathMap(MST_IO_SCHD_IF_R.$memo2, MST_IO_SCHD_IF_R.$memo2);
				addColumnPathMap(MST_IO_SCHD_IF_R.$memo3, MST_IO_SCHD_IF_R.$memo3);
				addColumnPathMap(MST_IO_SCHD_IF_R.$batch_log_no, MST_IO_SCHD_IF_R.$batch_log_no);
				addColumnPathMap(MST_IO_SCHD_IF_R.$log_sub_key1, MST_IO_SCHD_IF_R.$log_sub_key1);
				addColumnPathMap(MST_IO_SCHD_IF_R.$log_sub_key2, MST_IO_SCHD_IF_R.$log_sub_key2);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_char1, MST_IO_SCHD_IF_R.$sub_char1);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_char2, MST_IO_SCHD_IF_R.$sub_char2);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_char3, MST_IO_SCHD_IF_R.$sub_char3);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_char4, MST_IO_SCHD_IF_R.$sub_char4);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_char5, MST_IO_SCHD_IF_R.$sub_char5);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_char6, MST_IO_SCHD_IF_R.$sub_char6);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_char7, MST_IO_SCHD_IF_R.$sub_char7);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_char8, MST_IO_SCHD_IF_R.$sub_char8);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_char9, MST_IO_SCHD_IF_R.$sub_char9);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_char10, MST_IO_SCHD_IF_R.$sub_char10);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_char11, MST_IO_SCHD_IF_R.$sub_char11);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_char12, MST_IO_SCHD_IF_R.$sub_char12);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_char13, MST_IO_SCHD_IF_R.$sub_char13);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_char14, MST_IO_SCHD_IF_R.$sub_char14);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_char15, MST_IO_SCHD_IF_R.$sub_char15);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_char16, MST_IO_SCHD_IF_R.$sub_char16);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_char17, MST_IO_SCHD_IF_R.$sub_char17);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_char18, MST_IO_SCHD_IF_R.$sub_char18);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_char19, MST_IO_SCHD_IF_R.$sub_char19);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_char20, MST_IO_SCHD_IF_R.$sub_char20);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_char21, MST_IO_SCHD_IF_R.$sub_char21);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_char22, MST_IO_SCHD_IF_R.$sub_char22);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_char23, MST_IO_SCHD_IF_R.$sub_char23);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_char24, MST_IO_SCHD_IF_R.$sub_char24);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_char25, MST_IO_SCHD_IF_R.$sub_char25);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_char26, MST_IO_SCHD_IF_R.$sub_char26);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_char27, MST_IO_SCHD_IF_R.$sub_char27);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_char28, MST_IO_SCHD_IF_R.$sub_char28);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_char29, MST_IO_SCHD_IF_R.$sub_char29);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_char30, MST_IO_SCHD_IF_R.$sub_char30);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_num1, MST_IO_SCHD_IF_R.$sub_num1);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_num2, MST_IO_SCHD_IF_R.$sub_num2);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_num3, MST_IO_SCHD_IF_R.$sub_num3);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_num4, MST_IO_SCHD_IF_R.$sub_num4);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_num5, MST_IO_SCHD_IF_R.$sub_num5);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_dt1, MST_IO_SCHD_IF_R.$sub_dt1);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_dt2, MST_IO_SCHD_IF_R.$sub_dt2);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_dt3, MST_IO_SCHD_IF_R.$sub_dt3);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_dt4, MST_IO_SCHD_IF_R.$sub_dt4);
				addColumnPathMap(MST_IO_SCHD_IF_R.$sub_dt5, MST_IO_SCHD_IF_R.$sub_dt5);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.setNumberNE(MST_IO_SCHD_IF_R.$data_no, up0().data_no());
				dest.setStringNE(MST_IO_SCHD_IF_R.$exe_sts_typ, MAC_EXE_STS_TYP.NOT_EXE.value());
				dest.setBooleanNE(MST_IO_SCHD_IF_R.$bi_not_send_flg, false);
				
				dest.setStringNE(MST_IO_SCHD_IF_R.$data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value());
			}
		}
	}

	//FMCB CUSTOM END
}