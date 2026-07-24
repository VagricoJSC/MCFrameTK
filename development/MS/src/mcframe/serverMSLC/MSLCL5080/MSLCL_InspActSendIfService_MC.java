package mcframe.serverMSLC.MSLCL5080;

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
import mcframe.serverCore.resource.MCConst;

import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_BeforeAfterValidater;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLCL_InspActSendIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLCL_InspActSendIfService_MC extends MSLCL_InspActSendIfService_MC_A{
	//FMCB CUSTOM START

	/**
	 * Upd01オペレーション.<p>
	 *
	 * ＩＦテーブルの登録処理を実行するオペレーションの基底クラスの実装<br>
	 */
	public class Upd01 extends MSLCL_InspActSendIfService_MC_A.Upd01 {
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
			if (!MAC_IF_PROC_TYP.isINSP_ACT_SEND(up0().if_proc_typ())) {
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
			super._upd02LogicId = "MSLCL5080";
			super._upd02OperationId = "Upd02";
		}
		
		@Override
		protected void writeStartLog() {
			MCMessagePool.add(MSLCL0107);
		}
		
		@Override
		protected void writeEndLog() {
			MCMessagePool.add(MSLCL0108);
		}
	}
	/**
	 * Upd02オペレーション.<p>
	 *
	 * ＩＦテーブルにレコードを登録する処理の流れを定義したオペレーションの基底クラスの実装<br>
	 */
	public class Upd02 extends MSLCL_InspActSendIfService_MC_A.Upd02 {
		@Override
		protected void call() {
			super.call();
		}

		/**
		 * 開始ログを出力
		 */
		@Override
		protected void writeStartLog() {
			writeLogForStartLog(MSLCL0103, getUserCoCd(), up0().if_proc_typ());
		}

		/**
		 * 処理に必要な値をセット
		 */
		@Override
		protected void setup() {
			// 1回のフェッチで何件のレコードを取得するか
			super._fetchSize = MCConst.app.getInteger("MS.MSLCL5080.fetch_size", 1000);
			// 1スレッド当たり何件のレコードを処理するか
			super._threadRecordCnt = MCConst.app.getInteger("MS.MSLCL5080.thread_record_cnt", 1000);
			
			setupDBC();
			setupUpdBiNotSendFlg();
			setupIns();
			setupInsForDlt();
		}

		protected void setupDBC() {
			super._ifTblContainerClassPath = "mcframe.serverMS.dbc.MST_INSP_ACT_IF_R";
			super._trnTblContainerClassPath = "mcframe.serverMS.dbc.MST_INSP_ACT_D_R";
		}

		protected void setupUpdBiNotSendFlg() {
			
			MST_INSP_ACT_IF_R inspActIfR = MST_INSP_ACT_IF_R.create("T1");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(inspActIfR);
			builder.addWhereWithAnd(inspActIfR.ext_sys_cd.eq(bind(MST_INSP_ACT_IF_R.$ext_sys_cd)));
			builder.addWhereWithAnd(
					trunc(inspActIfR.st_act_tm, MCDateFmt.DD).between(bind(Upd02_DtlR.$dt_fr), bind(Upd02_DtlR.$dt_to))
					.or(trunc(inspActIfR.end_act_tm, MCDateFmt.DD).between(bind(Upd02_DtlR.$dt_fr), bind(Upd02_DtlR.$dt_to))));
			builder.addWhereWithAnd(inspActIfR.bi_not_send_flg.eq(bind(MST_INSP_ACT_IF_R.$bi_not_send_flg)));
			builder.addWhereWithAnd(inspActIfR.exe_sts_typ.eq(bind("exeStsTypeNotExe")).or(inspActIfR.exe_sts_typ.eq(bind("exeStsTypeNotErr"))));
			super._ifTblUpdBiNotSendFlgBuilder = builder;
			
			MCRow bind = MCRow.create();
			bind.setStringNE(MST_INSP_ACT_IF_R.$ext_sys_cd, up0().ext_sys_cd());
			bind.setDateNE(Upd02_DtlR.$dt_fr, up0().dt_fr());
			bind.setDateNE(Upd02_DtlR.$dt_to, up0().dt_to());
			bind.setBooleanNE(MST_INSP_ACT_IF_R.$bi_not_send_flg, false);
			bind.setStringNE("exeStsTypeNotExe", MAC_EXE_STS_TYP.NOT_EXE.value());
			bind.setStringNE("exeStsTypeNotErr", MAC_EXE_STS_TYP.ERR.value());
			super._updBiNotSendFlgBind = bind; 
			
			super._sqlIdSelectBiNotSendFlg = "MSLCL5080_MST_INSP_ACT_IF_S01";
			super._sqlIdUpdBiNotSendFlg = "MSLCL5080_MST_INSP_ACT_IF_U01";
		}

		protected void setupIns() {
			MST_INSP_ACT_D_R inspActDR = MST_INSP_ACT_D_R.create("T1");
			MST_INSP_ACT_R inspActR = MST_INSP_ACT_R.create("T2");
			MST_INSP_INST_R inspInstR = MST_INSP_INST_R.create("T3");
			MAM_DPT_R dptR = MAM_DPT_R.create("T4");
			
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(inspActDR);
			addSelectTrnColumn(builder, dptR, inspActR, inspInstR);
			
			builder.addLeftOuterJoin(inspActR, 
					bracket(
						inspActDR.insp_act_no.eq(inspActR.insp_act_no)
					));
			builder.addLeftOuterJoin(inspInstR, 
					bracket(
						inspActR.insp_no.eq(inspInstR.insp_no)
					));
			builder.addLeftOuterJoin(dptR,
					bracket(
						inspActR.act_dpt_cd.eq(dptR.dpt_cd)
						.and(inspActR.st_tm.gte(dptR.st_dt))
						.and(inspActR.st_tm.lte(dptR.end_dt))
					));
			
			builder.addWhereWithAnd(
					trunc(inspActR.st_tm, MCDateFmt.DD).between(bind(Upd02_DtlR.$dt_fr), bind(Upd02_DtlR.$dt_to))
					.or(trunc(inspActR.end_tm, MCDateFmt.DD).between(bind(Upd02_DtlR.$dt_fr), bind(Upd02_DtlR.$dt_to))));
			builder.addWhereWithAnd(MSC_INSP_TYP$IS_BI_TGT(inspActR.insp_typ).eq(bind("biTgt")));
			super._trnTblExtractBuilder = builder;
			
			MCRow bind = MCRow.create();
			bind.setDateNE(Upd02_DtlR.$dt_fr, up0().dt_fr());
			bind.setDateNE(Upd02_DtlR.$dt_to, up0().dt_to());
			bind.setBooleanNE("biTgt", true);
			super._trnTblExtractBind = bind; 
			
			super._sqlIdSelectExtractTrn = "MSLCL5080_MST_INSP_ACT_S01";
			super._sqlIdInsExtractTrn = "MSLCL5080_MST_INSP_ACT_IF_I01";
		}

		protected void addSelectTrnColumn(MCQueryApiBuilder builder, 
				MAM_DPT_R dptR, MST_INSP_ACT_R inspActR, MST_INSP_INST_R inspInstR) {
			
			// 部門マスタから取得する項目
			builder.addSelect(dptR.st_dt.as("DPT_ST_DT"));
			// 検査実績ヘッダから取得する項目
			builder.addSelect(inspActR.st_tm.as("ST_ACT_TM"));
			builder.addSelect(inspActR.end_tm.as("END_ACT_TM"));
			builder.addSelect(inspActR.act_usr_cd);
			builder.addSelect(inspActR.act_dpt_cd);
			builder.addSelect(inspActR.insp_no);
			builder.addSelect(inspActR.src_no1);
			builder.addSelect(inspActR.src_no2);
			builder.addSelect(inspActR.insp_typ);
			builder.addSelect(inspActR.insp_mtd_typ);
			builder.addSelect(inspActR.sppl_cd);
			builder.addSelect(inspActR.maker_cd);
			builder.addSelect(inspActR.mfg_loc_cd);
			builder.addSelect(inspActR.upd_ts.as("UPD_TS_H"));
			// 検査指図から取得する項目
			builder.addSelect(inspInstR.st_tm.as("ST_SCHD_TM"));
			builder.addSelect(inspInstR.end_tm.as("END_SCHD_TM"));
			builder.addSelect(inspInstR.insp_sts_typ);
		}

		protected void setupInsForDlt() {
			MST_INSP_ACT_IF_R inspActIfR = MST_INSP_ACT_IF_R.create("T1");
			MST_INSP_ACT_D_R inspActDR = MST_INSP_ACT_D_R.create("T2");
			MST_INSP_ACT_R inspActR = MST_INSP_ACT_R.create("T3");
			
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(inspActIfR);
			builder.addWhereWithAnd(notExists(subQuery().select(value("X"))
				.from(inspActDR.innerJoin(inspActR).on(inspActR.insp_act_no.eq(inspActDR.insp_act_no)))
				.where(inspActIfR.insp_act_d_no.eq(inspActDR.insp_act_d_no)
						.and(MSC_INSP_TYP$IS_BI_TGT(inspActR.insp_typ).eq(bind("biTgt"))))
				));
			builder.addWhereWithAnd(inspActIfR.ext_sys_cd.eq(bind(MST_INSP_ACT_IF_R.$ext_sys_cd)));
			builder.addWhereWithAnd(
					trunc(inspActIfR.st_act_tm, MCDateFmt.DD).between(bind(Upd02_DtlR.$dt_fr), bind(Upd02_DtlR.$dt_to))
					.or(trunc(inspActIfR.end_act_tm, MCDateFmt.DD).between(bind(Upd02_DtlR.$dt_fr), bind(Upd02_DtlR.$dt_to))));
			builder.addWhereWithAnd(inspActIfR.bi_not_send_flg.eq(bind(MST_INSP_ACT_IF_R.$bi_not_send_flg)));
			builder.addWhereWithAnd(inspActIfR.exe_sts_typ.eq(bind("exeStsTypeOk")));
			builder.addOrderByAsc(inspActIfR.insp_act_d_no);
			super._trnTblExtractDltBuilder = builder;
			
			MCRow bind = MCRow.create();
			bind.setStringNE(MST_INSP_ACT_IF_R.$ext_sys_cd, up0().ext_sys_cd());
			bind.setDateNE(Upd02_DtlR.$dt_fr, up0().dt_fr());
			bind.setDateNE(Upd02_DtlR.$dt_to, up0().dt_to());
			bind.setBooleanNE(MST_INSP_ACT_IF_R.$bi_not_send_flg, false);
			bind.setStringNE("exeStsTypeOk", MAC_EXE_STS_TYP.OK.value());
			bind.setBooleanNE("biTgt", true);
			super._trnTblExtractDltBind = bind;
			
			_ifTblCmpKeys = new String[] {
					MST_INSP_ACT_D_R.$insp_act_d_no
			};
			
			super._sqlIdSelectExtractDltTrn = "MSLCL5080_MST_INSP_ACT_IF_S02";
			super._sqlIdInsExtractDltTrn = "MSLCL5080_MST_INSP_ACT_IF_I02";
			
		}

		@Override
		protected MCList<MCRow> srchPostForInsRecord(MCList<MCRow> srchTrnRsltL) {
			// 検索後処理
			
			// IFテーブルから同一キーのレコードを抽出する
			MCList<? extends MCRow> srchIfRsltL = srchSameKeyIfRecord(srchTrnRsltL);
			
			// 同一キーレコードが複数ある場合は、最新レコードのみを使用するため、不要レコードを削除したMCListを作成する
			MCList<? extends MCRow>[] sameKeyGroupL = srchIfRsltL.groupList(MST_INSP_ACT_IF_R.$insp_act_d_no);
			MCList<MCRow> latestIfL = MCList.create(MCRow.class);
			for (MCList<? extends MCRow> rowL : sameKeyGroupL) {
				// 同一キー内で、最も新しいレコードを取得する(「送信元レコード更新日時」「更新日時」の降順でソートし、その1行目を取得)
				rowL.sort(SortType.DESC, MST_INSP_ACT_IF_R.$data_upd_ts, MST_INSP_ACT_IF_R.$upd_ts);
				latestIfL.add(rowL.get(0));
			}
			MCIndexKey latestIfLIdxKey = latestIfL.createIndex(MST_INSP_ACT_IF_R.$insp_act_d_no);
			
			// IFテーブルにinsertするデータを作成する
			MCList<MCRow> rsltL = MCList.create(MCRow.class);
			for (MCRow trnR : srchTrnRsltL) {
				// IFテーブルに同一キーが存在するかをチェックする
				MCRow matchedIfRow = latestIfL.getFirst(latestIfLIdxKey, trnR.getStringNE(MST_INSP_ACT_IF_R.$insp_act_d_no));
				
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
						MCTimestamp trnTimestamp = getUpdTs(trnR.getTimestampNE(MST_INSP_ACT_D_R.$upd_ts),trnR.getTimestampNE("UPD_TS_H"));
						MCTimestamp ifTimestamp = matchedIfRow.getTimestampNE(MST_INSP_ACT_IF_R.$data_upd_ts);
						if (isNewRecord(trnTimestamp, ifTimestamp)) {
							addLForUpdRecord(rsltL, trnR, matchedIfRow);
						}
					}
				}
			}
			
			// データ行NOをセットする
			setDataLNo(MSC_NUM_SYS_TYP.INSPACTIF, rsltL);
			
			return rsltL;
		}

		protected void addLForNewRecord(MCList<MCRow> rsltL, MCRow trnR)  {
			
			MCRow newIfR = MCRow.create();
			copy(newIfR, trnR, createMap_TrnTbl_InsRecord());
			rsltL.add(newIfR);
		}

		protected void addLForUpdRecord(MCList<MCRow> rsltL, MCRow trnR, MCRow matchedIfRow) {
			
			// 「データ更新区分」が「削除」のレコードは、IFテーブルに登録されているデータを元に作成する
			MCRow dltR = MCRow.create();
			copy(dltR, matchedIfRow, createMap_IfTbl_DltRecord());
			rsltL.add(dltR);
			
			// 「データ更新区分」が「新規」のレコードは、トランから取得したデータを元に作成する
			addLForNewRecord(rsltL, trnR);
		}
		
		protected boolean isNewRecord(MCTimestamp src, MCTimestamp dest) {
			
			if (src.compareTo(dest) <= 0) {
				return false;
			}
			return true;
		}
		
		protected MCTimestamp getUpdTs(MCTimestamp ts1, MCTimestamp ts2) {
			
			if (ts1.compareTo(ts2) >= 0) {
				return ts1;
			}
			return ts2;
		}

		protected MCList<? extends MCRow> srchSameKeyIfRecord(MCList<MCRow> srchTrnRsltL) {
			
			MST_INSP_ACT_IF_R inspActIfR = MST_INSP_ACT_IF_R.create();
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(inspActIfR);
			builder.addWhereWithAnd(inspActIfR.ext_sys_cd.eq(bind("1")), up0().ext_sys_cd());
			builder.addWhereWithAnd(inspActIfR.exe_sts_typ.eq(bind("1")), MAC_EXE_STS_TYP.OK.value());
			builder.addWhereWithAnd(inspActIfR.insp_act_d_no.eq(bind(MST_INSP_ACT_IF_R.$insp_act_d_no)));
			
			MCList<MST_INSP_ACT_IF_R> srchIfRslt = MCList.create(MST_INSP_ACT_IF_R.class);
			dbSelect("MSLCL5080_MST_INSP_ACT_IF_S03", srchIfRslt, builder, srchTrnRsltL);
			
			return srchIfRslt;
		}

		@Override
		protected MCList<MCRow> srchPostForInsCancelRecord(MCList<MCRow> srchIfRsltL) {
			
			// 同一キーのレコードをグループ化する
			MCList<? extends MCRow>[] sameKeyGroupL = srchIfRsltL.groupList(MST_INSP_ACT_IF_R.$insp_act_d_no);
			MCList<MCRow> latestIfL = MCList.create(MCRow.class);
			for (MCList<? extends MCRow> rowL : sameKeyGroupL) {
				// 同一キー内で、最も新しいレコードを取得する(「送信元レコード更新日時」「更新日時」の降順でソートし、その1行目を取得)
				rowL.sort(SortType.DESC, MST_INSP_ACT_IF_R.$data_upd_ts, MST_INSP_ACT_IF_R.$upd_ts);
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
			setDataLNo(MSC_NUM_SYS_TYP.INSPACTIF, rsltL);
			
			return rsltL;
		}

		@Override
		protected void writeEndLog() {
			if (super._rsltErrNum == 0 && !super._exceptionFlg) {
				if (_rsltTotalNum == 0) {
					writeLogForProcessLog(MAUDL0008);
				}
			}
			
			writeLogForEndLog(MSLCL0104, getUserCoCd(), super._rsltTotalNum, super._rsltOkNum, super._rsltErrNum, super._rsltCancelNum);
		}

		@Override
		protected boolean isExecInsCancelRecord() {
			return true;
		}

		protected Map_TrnTbl_InsRecord<MCRow, MCRow> createMap_TrnTbl_InsRecord() {
			return new Map_TrnTbl_InsRecord <MCRow, MCRow>();
		}

		protected Map_IfTbl_DltRecord<MCRow, MCRow> createMap_IfTbl_DltRecord() {
			return new Map_IfTbl_DltRecord <MCRow, MCRow>();
		}

		public class Map_TrnTbl_InsRecord<D extends MCRow, S extends MCRow> extends MCRowMapper<D,S> {
			
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_INSP_ACT_IF_R.$insp_act_d_no, MST_INSP_ACT_D_R.$insp_act_d_no);
				addColumnPathMap(MST_INSP_ACT_IF_R.$insp_act_no, MST_INSP_ACT_D_R.$insp_act_no);
				addColumnPathMap(MST_INSP_ACT_IF_R.$act_usr_cd, MST_INSP_ACT_R.$act_usr_cd);
				addColumnPathMap(MST_INSP_ACT_IF_R.$act_dpt_cd, MST_INSP_ACT_R.$act_dpt_cd);
				addColumnPathMap(MST_INSP_ACT_IF_R.$insp_no, MST_INSP_ACT_R.$insp_no);
				addColumnPathMap(MST_INSP_ACT_IF_R.$src_no1, MST_INSP_ACT_R.$src_no1);
				addColumnPathMap(MST_INSP_ACT_IF_R.$src_no2, MST_INSP_ACT_R.$src_no2);
				addColumnPathMap(MST_INSP_ACT_IF_R.$insp_typ, MST_INSP_ACT_R.$insp_typ);
				addColumnPathMap(MST_INSP_ACT_IF_R.$insp_mtd_typ, MST_INSP_ACT_R.$insp_mtd_typ);
				addColumnPathMap(MST_INSP_ACT_IF_R.$insp_sts_typ, MST_INSP_INST_R.$insp_sts_typ);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sppl_cd, MST_INSP_ACT_R.$sppl_cd);
				addColumnPathMap(MST_INSP_ACT_IF_R.$maker_cd, MST_INSP_ACT_R.$maker_cd);
				addColumnPathMap(MST_INSP_ACT_IF_R.$mfg_loc_cd, MST_INSP_ACT_R.$mfg_loc_cd);
				addColumnPathMap(MST_INSP_ACT_IF_R.$itm_cd, MST_INSP_ACT_D_R.$itm_cd);
				addColumnPathMap(MST_INSP_ACT_IF_R.$itm_sub1, MST_INSP_ACT_D_R.$itm_sub1);
				addColumnPathMap(MST_INSP_ACT_IF_R.$itm_sub2, MST_INSP_ACT_D_R.$itm_sub2);
				addColumnPathMap(MST_INSP_ACT_IF_R.$itm_sub3, MST_INSP_ACT_D_R.$itm_sub3);
				addColumnPathMap(MST_INSP_ACT_IF_R.$loc_cd, MST_INSP_ACT_D_R.$loc_cd);
				addColumnPathMap(MST_INSP_ACT_IF_R.$str_ln_cd, MST_INSP_ACT_D_R.$str_ln_cd);
				addColumnPathMap(MST_INSP_ACT_IF_R.$stk_arrv_bp_cd, MST_INSP_ACT_D_R.$stk_arrv_bp_cd);
				addColumnPathMap(MST_INSP_ACT_IF_R.$gd_cd, MST_INSP_ACT_D_R.$gd_cd);
				addColumnPathMap(MST_INSP_ACT_IF_R.$quality_typ, MST_INSP_ACT_D_R.$quality_typ);
				addColumnPathMap(MST_INSP_ACT_IF_R.$stk_insp_typ, MST_INSP_ACT_D_R.$stk_insp_typ);
				addColumnPathMap(MST_INSP_ACT_IF_R.$stk_id_typ, MST_INSP_ACT_D_R.$stk_id_typ);
				addColumnPathMap(MST_INSP_ACT_IF_R.$stk_bp_cd, MST_INSP_ACT_D_R.$stk_bp_cd);
				addColumnPathMap(MST_INSP_ACT_IF_R.$lot_no, MST_INSP_ACT_D_R.$lot_no);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sublot_no, MST_INSP_ACT_D_R.$sublot_no);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sno1, MST_INSP_ACT_D_R.$sno1);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sno2, MST_INSP_ACT_D_R.$sno2);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sno3, MST_INSP_ACT_D_R.$sno3);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sno4, MST_INSP_ACT_D_R.$sno4);
				addColumnPathMap(MST_INSP_ACT_IF_R.$fix_no_typ, MST_INSP_ACT_D_R.$fix_no_typ);
				addColumnPathMap(MST_INSP_ACT_IF_R.$fix_no, MST_INSP_ACT_D_R.$fix_no);
				addColumnPathMap(MST_INSP_ACT_IF_R.$pack_unit_qty, MST_INSP_ACT_D_R.$pack_unit_qty);
				addColumnPathMap(MST_INSP_ACT_IF_R.$pack_unit_cd, MST_INSP_ACT_D_R.$pack_unit_cd);
				addColumnPathMap(MST_INSP_ACT_IF_R.$base_unit_qty, MST_INSP_ACT_D_R.$base_unit_qty);
				addColumnPathMap(MST_INSP_ACT_IF_R.$base_unit_cd, MST_INSP_ACT_D_R.$base_unit_cd);
				addColumnPathMap(MST_INSP_ACT_IF_R.$dfct_rsn_cd, MST_INSP_ACT_D_R.$dfct_rsn_cd);
				addColumnPathMap(MST_INSP_ACT_IF_R.$ac_dt, MST_INSP_ACT_D_R.$ac_dt);
				addColumnPathMap(MST_INSP_ACT_IF_R.$intr_rmrks, MST_INSP_ACT_D_R.$intr_rmrks);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sub_char1, MST_INSP_ACT_D_R.$sub_char1);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sub_char2, MST_INSP_ACT_D_R.$sub_char2);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sub_char3, MST_INSP_ACT_D_R.$sub_char3);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.setNumberNE(MST_INSP_ACT_IF_R.$data_no, up0().data_no());
				dest.setStringNE(MST_INSP_ACT_IF_R.$exe_sts_typ, MAC_EXE_STS_TYP.NOT_EXE.value());
				dest.setStringNE(MST_INSP_ACT_IF_R.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
				dest.setStringNE(MST_INSP_ACT_IF_R.$ext_sys_cd, up0().ext_sys_cd());
				dest.setDateNE(MST_INSP_ACT_IF_R.$dpt_st_dt, src.getDateNE("DPT_ST_DT"));
				dest.setBooleanNE(MST_INSP_ACT_IF_R.$bi_not_send_flg, false);
				dest.setTimestampNE(MST_INSP_ACT_IF_R.$data_upd_ts, getUpdTs(src.getTimestampNE(MST_INSP_ACT_D_R.$upd_ts),src.getTimestampNE("UPD_TS_H")));
				dest.setDateNE(MST_INSP_ACT_IF_R.$st_act_tm, src.getDateNE("ST_ACT_TM"));
				dest.setDateNE(MST_INSP_ACT_IF_R.$end_act_tm, src.getDateNE("END_ACT_TM"));
				dest.setDateNE(MST_INSP_ACT_IF_R.$st_schd_tm, src.getDateNE("ST_SCHD_TM"));
				dest.setDateNE(MST_INSP_ACT_IF_R.$end_schd_tm, src.getDateNE("END_SCHD_TM"));
				
				
			}
		}

		public class Map_IfTbl_DltRecord<D extends MCRow, S extends MCRow> extends MCRowMapper<D,S> {
			
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_INSP_ACT_IF_R.$data_crud_typ, MST_INSP_ACT_IF_R.$data_crud_typ);
				addColumnPathMap(MST_INSP_ACT_IF_R.$ext_sys_cd, MST_INSP_ACT_IF_R.$ext_sys_cd);
				addColumnPathMap(MST_INSP_ACT_IF_R.$dpt_st_dt, MST_INSP_ACT_IF_R.$dpt_st_dt);
				addColumnPathMap(MST_INSP_ACT_IF_R.$data_upd_ts, MST_INSP_ACT_IF_R.$data_upd_ts);
				addColumnPathMap(MST_INSP_ACT_IF_R.$insp_act_d_no, MST_INSP_ACT_IF_R.$insp_act_d_no);
				addColumnPathMap(MST_INSP_ACT_IF_R.$insp_act_no, MST_INSP_ACT_IF_R.$insp_act_no);
				addColumnPathMap(MST_INSP_ACT_IF_R.$st_act_tm, MST_INSP_ACT_IF_R.$st_act_tm);
				addColumnPathMap(MST_INSP_ACT_IF_R.$end_act_tm, MST_INSP_ACT_IF_R.$end_act_tm);
				addColumnPathMap(MST_INSP_ACT_IF_R.$act_usr_cd, MST_INSP_ACT_IF_R.$act_usr_cd);
				addColumnPathMap(MST_INSP_ACT_IF_R.$act_dpt_cd, MST_INSP_ACT_IF_R.$act_dpt_cd);
				addColumnPathMap(MST_INSP_ACT_IF_R.$insp_no, MST_INSP_ACT_IF_R.$insp_no);
				addColumnPathMap(MST_INSP_ACT_IF_R.$src_no1, MST_INSP_ACT_IF_R.$src_no1);
				addColumnPathMap(MST_INSP_ACT_IF_R.$src_no2, MST_INSP_ACT_IF_R.$src_no2);
				addColumnPathMap(MST_INSP_ACT_IF_R.$insp_typ, MST_INSP_ACT_IF_R.$insp_typ);
				addColumnPathMap(MST_INSP_ACT_IF_R.$insp_mtd_typ, MST_INSP_ACT_IF_R.$insp_mtd_typ);
				addColumnPathMap(MST_INSP_ACT_IF_R.$insp_sts_typ, MST_INSP_ACT_IF_R.$insp_sts_typ);
				addColumnPathMap(MST_INSP_ACT_IF_R.$st_schd_tm, MST_INSP_ACT_IF_R.$st_schd_tm);
				addColumnPathMap(MST_INSP_ACT_IF_R.$end_schd_tm, MST_INSP_ACT_IF_R.$end_schd_tm);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sppl_cd, MST_INSP_ACT_IF_R.$sppl_cd);
				addColumnPathMap(MST_INSP_ACT_IF_R.$maker_cd, MST_INSP_ACT_IF_R.$maker_cd);
				addColumnPathMap(MST_INSP_ACT_IF_R.$mfg_loc_cd, MST_INSP_ACT_IF_R.$mfg_loc_cd);
				addColumnPathMap(MST_INSP_ACT_IF_R.$itm_cd, MST_INSP_ACT_IF_R.$itm_cd);
				addColumnPathMap(MST_INSP_ACT_IF_R.$itm_sub1, MST_INSP_ACT_IF_R.$itm_sub1);
				addColumnPathMap(MST_INSP_ACT_IF_R.$itm_sub2, MST_INSP_ACT_IF_R.$itm_sub2);
				addColumnPathMap(MST_INSP_ACT_IF_R.$itm_sub3, MST_INSP_ACT_IF_R.$itm_sub3);
				addColumnPathMap(MST_INSP_ACT_IF_R.$loc_cd, MST_INSP_ACT_IF_R.$loc_cd);
				addColumnPathMap(MST_INSP_ACT_IF_R.$str_ln_cd, MST_INSP_ACT_IF_R.$str_ln_cd);
				addColumnPathMap(MST_INSP_ACT_IF_R.$stk_arrv_bp_cd, MST_INSP_ACT_IF_R.$stk_arrv_bp_cd);
				addColumnPathMap(MST_INSP_ACT_IF_R.$gd_cd, MST_INSP_ACT_IF_R.$gd_cd);
				addColumnPathMap(MST_INSP_ACT_IF_R.$quality_typ, MST_INSP_ACT_IF_R.$quality_typ);
				addColumnPathMap(MST_INSP_ACT_IF_R.$stk_insp_typ, MST_INSP_ACT_IF_R.$stk_insp_typ);
				addColumnPathMap(MST_INSP_ACT_IF_R.$stk_id_typ, MST_INSP_ACT_IF_R.$stk_id_typ);
				addColumnPathMap(MST_INSP_ACT_IF_R.$stk_bp_cd, MST_INSP_ACT_IF_R.$stk_bp_cd);
				addColumnPathMap(MST_INSP_ACT_IF_R.$lot_no, MST_INSP_ACT_IF_R.$lot_no);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sublot_no, MST_INSP_ACT_IF_R.$sublot_no);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sno1, MST_INSP_ACT_IF_R.$sno1);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sno2, MST_INSP_ACT_IF_R.$sno2);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sno3, MST_INSP_ACT_IF_R.$sno3);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sno4, MST_INSP_ACT_IF_R.$sno4);
				addColumnPathMap(MST_INSP_ACT_IF_R.$fix_no_typ, MST_INSP_ACT_IF_R.$fix_no_typ);
				addColumnPathMap(MST_INSP_ACT_IF_R.$fix_no, MST_INSP_ACT_IF_R.$fix_no);
				addColumnPathMap(MST_INSP_ACT_IF_R.$pack_unit_qty, MST_INSP_ACT_IF_R.$pack_unit_qty);
				addColumnPathMap(MST_INSP_ACT_IF_R.$pack_unit_cd, MST_INSP_ACT_IF_R.$pack_unit_cd);
				addColumnPathMap(MST_INSP_ACT_IF_R.$base_unit_qty, MST_INSP_ACT_IF_R.$base_unit_qty);
				addColumnPathMap(MST_INSP_ACT_IF_R.$base_unit_cd, MST_INSP_ACT_IF_R.$base_unit_cd);
				addColumnPathMap(MST_INSP_ACT_IF_R.$dfct_rsn_cd, MST_INSP_ACT_IF_R.$dfct_rsn_cd);
				addColumnPathMap(MST_INSP_ACT_IF_R.$ac_dt, MST_INSP_ACT_IF_R.$ac_dt);
				addColumnPathMap(MST_INSP_ACT_IF_R.$intr_rmrks, MST_INSP_ACT_IF_R.$intr_rmrks);
				addColumnPathMap(MST_INSP_ACT_IF_R.$batch_log_no, MST_INSP_ACT_IF_R.$batch_log_no);
				addColumnPathMap(MST_INSP_ACT_IF_R.$log_sub_key1, MST_INSP_ACT_IF_R.$log_sub_key1);
				addColumnPathMap(MST_INSP_ACT_IF_R.$log_sub_key2, MST_INSP_ACT_IF_R.$log_sub_key2);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sub_char1, MST_INSP_ACT_IF_R.$sub_char1);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sub_char2, MST_INSP_ACT_IF_R.$sub_char2);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sub_char3, MST_INSP_ACT_IF_R.$sub_char3);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sub_char4, MST_INSP_ACT_IF_R.$sub_char4);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sub_char5, MST_INSP_ACT_IF_R.$sub_char5);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sub_char6, MST_INSP_ACT_IF_R.$sub_char6);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sub_char7, MST_INSP_ACT_IF_R.$sub_char7);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sub_char8, MST_INSP_ACT_IF_R.$sub_char8);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sub_char9, MST_INSP_ACT_IF_R.$sub_char9);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sub_char10, MST_INSP_ACT_IF_R.$sub_char10);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sub_char11, MST_INSP_ACT_IF_R.$sub_char11);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sub_char12, MST_INSP_ACT_IF_R.$sub_char12);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sub_char13, MST_INSP_ACT_IF_R.$sub_char13);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sub_char14, MST_INSP_ACT_IF_R.$sub_char14);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sub_char15, MST_INSP_ACT_IF_R.$sub_char15);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sub_char16, MST_INSP_ACT_IF_R.$sub_char16);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sub_char17, MST_INSP_ACT_IF_R.$sub_char17);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sub_char18, MST_INSP_ACT_IF_R.$sub_char18);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sub_char19, MST_INSP_ACT_IF_R.$sub_char19);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sub_char20, MST_INSP_ACT_IF_R.$sub_char20);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sub_char21, MST_INSP_ACT_IF_R.$sub_char21);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sub_char22, MST_INSP_ACT_IF_R.$sub_char22);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sub_char23, MST_INSP_ACT_IF_R.$sub_char23);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sub_char24, MST_INSP_ACT_IF_R.$sub_char24);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sub_char25, MST_INSP_ACT_IF_R.$sub_char25);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sub_char26, MST_INSP_ACT_IF_R.$sub_char26);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sub_char27, MST_INSP_ACT_IF_R.$sub_char27);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sub_char28, MST_INSP_ACT_IF_R.$sub_char28);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sub_char29, MST_INSP_ACT_IF_R.$sub_char29);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sub_char30, MST_INSP_ACT_IF_R.$sub_char30);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sub_num1, MST_INSP_ACT_IF_R.$sub_num1);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sub_num2, MST_INSP_ACT_IF_R.$sub_num2);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sub_num3, MST_INSP_ACT_IF_R.$sub_num3);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sub_num4, MST_INSP_ACT_IF_R.$sub_num4);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sub_num5, MST_INSP_ACT_IF_R.$sub_num5);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sub_dt1, MST_INSP_ACT_IF_R.$sub_dt1);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sub_dt2, MST_INSP_ACT_IF_R.$sub_dt2);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sub_dt3, MST_INSP_ACT_IF_R.$sub_dt3);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sub_dt4, MST_INSP_ACT_IF_R.$sub_dt4);
				addColumnPathMap(MST_INSP_ACT_IF_R.$sub_dt5, MST_INSP_ACT_IF_R.$sub_dt5);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.setNumberNE(MST_INSP_ACT_IF_R.$data_no, up0().data_no());
				dest.setStringNE(MST_INSP_ACT_IF_R.$exe_sts_typ, MAC_EXE_STS_TYP.NOT_EXE.value());
				dest.setBooleanNE(MST_INSP_ACT_IF_R.$bi_not_send_flg, false);
				dest.setStringNE(MST_INSP_ACT_IF_R.$data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value());
			}
		}

	}

	//FMCB CUSTOM END
}