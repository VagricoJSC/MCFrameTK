package mcframe.serverMSLC.MSLCL5010;

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

import java.math.RoundingMode;
import mcframe.serverCore.resource.MCConst;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLCL_MlyStkSendIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLCL_MlyStkSendIfService_MC extends MSLCL_MlyStkSendIfService_MC_A{
	//FMCB CUSTOM START

	/**
	 * Upd01オペレーション.<p>
	 *
	 * ＩＦテーブルの登録処理を実行するオペレーションの基底クラスの実装<br>
	 */
	public class Upd01 extends MSLCL_MlyStkSendIfService_MC_A.Upd01 {
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
			if(!MAC_IF_PROC_TYP.isMLY_STK_DTL_SEND(up0().if_proc_typ())) {
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
			super._upd02LogicId = "MSLCL5010";
			super._upd02OperationId = "Upd02";
		}
		
		@Override
		protected void writeStartLog() {
			MCMessagePool.add(MSLCL0017);
		}
		
		@Override
		protected void writeEndLog() {
			MCMessagePool.add(MSLCL0018);
		}
	}
	/**
	 * Upd02オペレーション.<p>
	 *
	 * ＩＦテーブルにレコードを登録する処理の流れを定義したオペレーションの基底クラスの実装<br>
	 */
	public class Upd02 extends MSLCL_MlyStkSendIfService_MC_A.Upd02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void writeStartLog() {
			// 開始ログを出力する
			writeLogForStartLog(MSLCL0004, getCo().co_cd(), up0().if_proc_typ());
		}
		
		@Override
		protected void setup() {			
			// 1回のフェッチで何件のレコードを取得するか
			super._fetchSize = MCConst.app.getInteger("MS.MSLCL5010.fetch_size", 1000);
			// 1スレッド当たり何件のレコードを処理するか
			super._threadRecordCnt = MCConst.app.getInteger("MS.MSLCL5010.thread_record_cnt", 1000);
			
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
			MST_MLY_STK_IF_R mlyStkIfR = MST_MLY_STK_IF_R.create("T1");
			
			// バインド値設定
			MCRow bind = MCRow.create();
			bind.setStringNE(MST_MLY_STK_IF_R.$ext_sys_cd, up0().ext_sys_cd());
			bind.setDateNE(Upd02_DtlR.$dt_fr, up0().dt_fr().startTimeOfMonth());
			bind.setDateNE(Upd02_DtlR.$dt_to, up0().dt_to().startTimeOfMonth());
			bind.setBooleanNE(MST_MLY_STK_IF_R.$bi_not_send_flg, false);
			bind.setStringNE(err_sts, MAC_EXE_STS_TYP.ERR.value());
			bind.setStringNE(not_exe_sts, MAC_EXE_STS_TYP.NOT_EXE.value());
			super._updBiNotSendFlgBind = bind; 
			
			// QueryBuilder設定
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(mlyStkIfR);
			builder.addWhereWithAnd(mlyStkIfR.ext_sys_cd.eq(bind(Upd02_DtlR.$ext_sys_cd)));
			builder.addWhereWithAnd(mlyStkIfR.ac_ym.gte(bind(Upd02_DtlR.$dt_fr)));
			builder.addWhereWithAnd(mlyStkIfR.ac_ym.lte(bind(Upd02_DtlR.$dt_to)));
			builder.addWhereWithAnd(mlyStkIfR.bi_not_send_flg.eq(bind(MST_MLY_STK_IF_R.$bi_not_send_flg)));
			builder.addWhereWithAnd(mlyStkIfR.exe_sts_typ.eq(bind(err_sts)).or(mlyStkIfR.exe_sts_typ.eq(bind(not_exe_sts))));
			super._ifTblUpdBiNotSendFlgBuilder = builder;

			// SQLID設定
			super._sqlIdSelectBiNotSendFlg = "MSLCL5010_MST_MLY_STK_IF_S01";
			super._sqlIdUpdBiNotSendFlg = "MSLCL5010_MST_MLY_STK_IF_U01";
			
			// DBCクラスパス設定
			super._ifTblContainerClassPath = "mcframe.serverMS.dbc.MST_MLY_STK_IF_R";
		}
		
		/**
		 * IFテーブルにレコードを登録する処理に必要なデータをセット
		 */
		protected void setupIns() {
			MST_MLY_STK_DTL_R mlyStkDtlR = MST_MLY_STK_DTL_R.create("T1");
			MAM_LOC_R locR = MAM_LOC_R.create("T2");
			MAM_DPT_R dptR = MAM_DPT_R.create("T3");
			MAM_TERM_R termR = MAM_TERM_R.create("T4");
			MAM_STDCOST_R stdCostR = MAM_STDCOST_R.create("T5");
			
			// バインド値設定
			MCRow bind = MCRow.create();
			bind.setDateNE(Upd02_DtlR.$dt_fr, up0().dt_fr().startTimeOfMonth());
			bind.setDateNE(Upd02_DtlR.$dt_to, up0().dt_to().startTimeOfMonth());
			bind.setStringNE(MST_MLY_STK_DTL_R.$io_act_typ, MSC_IO_ACT_TYP.END_STK.value());
			super._trnTblExtractBind = bind;
			
			// QueryBuilder設定
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(mlyStkDtlR);
			
			// 部門マスタ適用開始日
			builder.addSelect(dptR.st_dt.as("DPT_ST_DT"));
			// 部門ＣＤ
			builder.addSelect(locR.asst_dpt_cd.as("DPT_CD"));
			// 標準単価金額を計算するための項目を追加（金額の計算はjava側で実施）
			builder.addSelect(stdCostR.std_upri);
			builder.addSelect(stdCostR.std_qty);
			
			builder.addLeftOuterJoin(locR, 
					bracket(
							mlyStkDtlR.loc_cd.eq(locR.loc_cd)
					));
				builder.addLeftOuterJoin(dptR,
					bracket(
							locR.asst_dpt_cd.eq(dptR.dpt_cd)
						.and(mlyStkDtlR.ac_ym.gte(dptR.st_dt))
						.and(mlyStkDtlR.ac_ym.lte(dptR.end_dt))
					));
				builder.addLeftOuterJoin(termR,
					bracket(
							mlyStkDtlR.ac_ym.gte(termR.term)
						.and(mlyStkDtlR.ac_ym.lt(termR.term_end_ym))
					));
				builder.addLeftOuterJoin(stdCostR,
					bracket(
							mlyStkDtlR.itm_cd.eq(stdCostR.itm_cd)
						.and(mlyStkDtlR.itm_sub1.eq(stdCostR.itm_sub1))
						.and(mlyStkDtlR.itm_sub2.eq(stdCostR.itm_sub2))
						.and(mlyStkDtlR.itm_sub3.eq(stdCostR.itm_sub3))
						.and(termR.term.eq(stdCostR.term))
						.and(locR.wg_cd.eq(stdCostR.wg_cd))
					));
				
			builder.addWhereWithAnd(mlyStkDtlR.ac_ym.gte(bind(Upd02_DtlR.$dt_fr)));
			builder.addWhereWithAnd(mlyStkDtlR.ac_ym.lte(bind(Upd02_DtlR.$dt_to)));
			builder.addWhereWithAnd(mlyStkDtlR.io_act_typ.eq(bind(MST_MLY_STK_DTL_R.$io_act_typ)));
			builder.addWhereWithAnd(mlyStkDtlR.base_unit_qty.neq(value(0)));
			super._trnTblExtractBuilder = builder;
			
			// SQLID設定
			super._sqlIdSelectExtractTrn = "MSLCL5010_MST_MLY_STK_DTL_S01";
			super._sqlIdInsExtractTrn = "MSLCL5010_MST_MLY_STK_DTL_I01";
			
			// クラスパス設定
			super._trnTblContainerClassPath = "mcframe.serverMS.dbc.MST_MLY_STK_DTL_R";
		}
		
		@Override
		protected MCList<MCRow> srchPostForInsRecord(MCList<MCRow> srchTrnRsltL) {			
			// 送信IFテーブル作成
			MCList<MCRow> insL = MCList.create(MCRow.class);
			addAll(insL, srchTrnRsltL, createMap_MST_MLY_STK_IF_R_MST_MLY_STK_DTL_R());
			
			// データ行NOをセットする
			setDataLNo(MSC_NUM_SYS_TYP.MLYSTKIF, insL);
						
			return insL;
		}

		@Override
		protected void writeEndLog() {
			if (super._rsltErrNum == 0 && !super._exceptionFlg) {
				if (_rsltTotalNum == 0) {
					writeLogForProcessLog(MAUDL0008);
				}
			}
			
			writeLogForEndLog(MSLCL0005, getCo().co_cd(), super._rsltTotalNum, super._rsltOkNum, super._rsltErrNum);
		}

		// RowMapper
		protected Map_MST_MLY_STK_IF_R_MST_MLY_STK_DTL_R<MCRow, MCRow> createMap_MST_MLY_STK_IF_R_MST_MLY_STK_DTL_R() {
			return new Map_MST_MLY_STK_IF_R_MST_MLY_STK_DTL_R<MCRow, MCRow>();
		}

		public class Map_MST_MLY_STK_IF_R_MST_MLY_STK_DTL_R<D extends MCRow, S extends MCRow> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_MLY_STK_IF_R.$data_upd_ts, MST_MLY_STK_DTL_R.$upd_ts);
				
				addColumnPathMap(MST_MLY_STK_IF_R.$itm_cd, MST_MLY_STK_DTL_R.$itm_cd);
				addColumnPathMap(MST_MLY_STK_IF_R.$itm_sub1, MST_MLY_STK_DTL_R.$itm_sub1);
				addColumnPathMap(MST_MLY_STK_IF_R.$itm_sub2, MST_MLY_STK_DTL_R.$itm_sub2);
				addColumnPathMap(MST_MLY_STK_IF_R.$itm_sub3, MST_MLY_STK_DTL_R.$itm_sub3);
				addColumnPathMap(MST_MLY_STK_IF_R.$loc_cd, MST_MLY_STK_DTL_R.$loc_cd);
				addColumnPathMap(MST_MLY_STK_IF_R.$str_ln_cd, MST_MLY_STK_DTL_R.$str_ln_cd);
				addColumnPathMap(MST_MLY_STK_IF_R.$stk_arrv_bp_cd, MST_MLY_STK_DTL_R.$stk_arrv_bp_cd);
				addColumnPathMap(MST_MLY_STK_IF_R.$lot_no, MST_MLY_STK_DTL_R.$lot_no);
				addColumnPathMap(MST_MLY_STK_IF_R.$sublot_no, MST_MLY_STK_DTL_R.$sublot_no);
				addColumnPathMap(MST_MLY_STK_IF_R.$sno1, MST_MLY_STK_DTL_R.$sno1);
				addColumnPathMap(MST_MLY_STK_IF_R.$sno2, MST_MLY_STK_DTL_R.$sno2);
				addColumnPathMap(MST_MLY_STK_IF_R.$sno3, MST_MLY_STK_DTL_R.$sno3);
				addColumnPathMap(MST_MLY_STK_IF_R.$sno4, MST_MLY_STK_DTL_R.$sno4);
				addColumnPathMap(MST_MLY_STK_IF_R.$pack_unit_cd, MST_MLY_STK_DTL_R.$pack_unit_cd);
				addColumnPathMap(MST_MLY_STK_IF_R.$gd_cd, MST_MLY_STK_DTL_R.$gd_cd);
				addColumnPathMap(MST_MLY_STK_IF_R.$in_xfr_typ, MST_MLY_STK_DTL_R.$in_xfr_typ);
				addColumnPathMap(MST_MLY_STK_IF_R.$quality_typ, MST_MLY_STK_DTL_R.$quality_typ);
				addColumnPathMap(MST_MLY_STK_IF_R.$asst_typ, MST_MLY_STK_DTL_R.$asst_typ);
				addColumnPathMap(MST_MLY_STK_IF_R.$stk_insp_typ, MST_MLY_STK_DTL_R.$stk_insp_typ);
				addColumnPathMap(MST_MLY_STK_IF_R.$stk_id_typ, MST_MLY_STK_DTL_R.$stk_id_typ);
				addColumnPathMap(MST_MLY_STK_IF_R.$stk_bp_cd, MST_MLY_STK_DTL_R.$stk_bp_cd);
				addColumnPathMap(MST_MLY_STK_IF_R.$ac_ym, MST_MLY_STK_DTL_R.$ac_ym);
				addColumnPathMap(MST_MLY_STK_IF_R.$pack_unit_qty, MST_MLY_STK_DTL_R.$pack_unit_qty);
				addColumnPathMap(MST_MLY_STK_IF_R.$base_unit_qty, MST_MLY_STK_DTL_R.$base_unit_qty);
				addColumnPathMap(MST_MLY_STK_IF_R.$sub_char1, MST_MLY_STK_DTL_R.$sub_char1);
				addColumnPathMap(MST_MLY_STK_IF_R.$sub_char2, MST_MLY_STK_DTL_R.$sub_char2);
				addColumnPathMap(MST_MLY_STK_IF_R.$sub_char3, MST_MLY_STK_DTL_R.$sub_char3);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.setNumberNE(MST_MLY_STK_IF_R.$data_no, up0().data_no());
				dest.setStringNE(MST_MLY_STK_IF_R.$exe_sts_typ, MAC_EXE_STS_TYP.NOT_EXE.value());
				dest.setStringNE(MST_MLY_STK_IF_R.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
				dest.setStringNE(MST_MLY_STK_IF_R.$ext_sys_cd, up0().ext_sys_cd());
				dest.setDateNE(MST_MLY_STK_IF_R.$dpt_st_dt, src.getDateNE(MST_MLY_STK_IF_R.$dpt_st_dt));
				dest.setBooleanNE(MST_MLY_STK_IF_R.$bi_not_send_flg, false);
				dest.setStringNE(MST_MLY_STK_IF_R.$dpt_cd, src.getStringNE(MST_MLY_STK_IF_R.$dpt_cd));
				dest.setNumberNE(MST_MLY_STK_IF_R.$std_cost_amt, calcStdCostAmt(src));
			}
			
			// 標準単価金額計算
			protected MCNumber calcStdCostAmt(S src) {
				MCNumber stdUpri = src.getNumberNE(MAM_STDCOST_R.$std_upri);
				MCNumber stdQty = src.getNumberNE(MAM_STDCOST_R.$std_qty);
				MCNumber baseUnitQty = src.getNumberNE(MST_MLY_STK_DTL_R.$base_unit_qty); 
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