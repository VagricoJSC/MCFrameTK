package mcframe.serverMSBC.MSBCL5050;

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
import mcframe.serverMSBC.MSBCL5050.*; // このimportはFrameManagerの自動生成で追加されました。
import mcframe.commonCore.sys.MCExec;
import mcframe.serverCore.mcjdbc.MCDBTransaction;
import mcframe.serverCore.mcjdbc.MCDatabaseManager;
import mcframe.serverCore.mcjdbc.MCTransactionManager;
import mcframe.serverCore.resource.MCConfig;
import mcframe.serverCore.resource.MCConst;
import static mcframe.commonCore.notice.Core_Msg.FCBCC0110;
import static mcframe.commonCore.notice.Core_Msg.FCBCC0136;

import static mcframe.serverMSBC.MSBCL5050.Query.*;
import mcframe.serverCore.requester.MCServerThreadManager;
import java.util.List;
import java.util.ArrayList;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBCL_MrpExecService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCL_MrpExecService_MC extends MSBCL_MrpExecService_MC_A{
	//FMCB CUSTOM START
	/** 出庫予定ＦＲＯＭ、独立所要ＦＲＯＭのデフォルト日付 */
	protected static final MCDate DEFAULT_DATE = MCDate.valueOf("19000101", "yyyyMMdd");
	/** ＭＲＰログ出力パラメータキー */
	protected static final String MRP_LMT_LOG_PARM_KEY = "MRP_LMT_LOG";

	/**
	 * MRP_Upd01オペレーション.<p>
	 *
	 */
	public class MRP_Upd01 extends MSBCL_MrpExecService_MC_A.MRP_Upd01 {
		/** ロック処理時の新規追加用 トランザクション */
		protected MCDBTransaction _lockTran;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			//MRP実行前処理（カウンタ情報作成処理、ロック取得処理）
			preMrp();

			//MRP実行処理
			mainMrp();

			//MRP実行後処理（下り電文設定、エラー処理）
			postMrp();

		}

		/** MRP実行前処理 */
		protected void preMrp() {
			up0().sort(Mrp_Upd01_DtlR.$sim_mrp_no);

			//カウンタ情報作成
			setMrpCntr();

			//納期回答用シミュＭＲＰの準備
			initSimPrms();

			//カウンタ追加後ロック取得前にいったんコミット
			dbTran().commit();

			//ロック取得
			lock();
		}

		/** MRP実行処理 */
		protected void mainMrp() {
			MCList<Mrp_Upd01_DtlR> notErrL = getChkList(up0());
			for (Mrp_Upd01_DtlR r : notErrL) {
				main(r);
			}
		}

		/** MRP実行後処理 */
		protected void postMrp() {
			//エラー処理
			checkErr();
			//下り電文設定
			down0().addAll(up0());
		}

		/** ＭＲＰ実行 */
		protected void main(Mrp_Upd01_DtlR r) {

			// スケジューラ実行ロックのチェック
			if (r.sch_flg() && !lockScheExec(r)) {
				return;
			}

			// ＭＲＰ計算ＮＯを発番
			setMrpCalcNo(r);

			// ＭＲＰ実行日設定（シミュレーション用）
			r.mrp_proc_dt(getToday());

			// 日付補完
			if (isNull(r.gi_schd_fr())) {
				r.gi_schd_fr(DEFAULT_DATE);
			}
			if (isNull(r.irqmt_fr())) {
				r.irqmt_fr(DEFAULT_DATE);
			}

			// ＭＲＰ実行
			execMrp(r);

			if(!r.err_flg()) {
				// 正常終了時後処理
				if (MSC_MRP_TYP.isPRCD(r.mrp_typ())) {
					afterExecPrcdMrp(r);
				}
				else if (MSC_MRP_TYP.isSIM(r.mrp_typ())) {
					afterExecSimMrp(r);
				}
				else {
					afterExecMrp(r);
				}
			}
		}

		/**
		 * MRPea.batを実行する
		 */
		protected void execMrp(Mrp_Upd01_DtlR r) {

			//ログ最大文字数の取得
			int limit = getLmtLogParm();

			//コマンド設定
			MCExec exe = new MCExec();
			//標準出力の文字セット指定
			String stdEncode = MCConst.app.getString("MS.mrpea.encode", "UTF-8");
			exe.setStdEncode(stdEncode);
			exe.setCommand(getMRPcommand(r));
			exe.setWait(true);
			exe.keepStderr(limit != 0);

			//MRPea.bat実行
			int ret = -1;
			try {
				ret = exe.execute();
			}
			catch (Exception e) {
				r.err_flg(true);
				MCMessagePool.add(new MCMessage(
					r, null, MSBCL0027, r.wg_cd(), e.getMessage()));
			}

			int len = isNull(exe.getStderr()) ? 0 : exe.getStderr().length();
			String msg = null;
			if (0 < limit && limit * 2 < len) {
				msg = exe.getStderr().substring(0, limit);
				msg = msg.concat(MCStringUtil.LF_CODE);
				msg = msg.concat(MCStringUtil.LF_CODE);
				msg = msg.concat(exe.getStderr().substring(len - limit));
			}
			else if (limit != 0) {
				msg = exe.getStderr();
			}

			if (ret != 0) {
				// MRPの処理に失敗した場合
				r.err_flg(true);
				MCMessagePool.add(new MCMessage(r, null, MSBCL0027, r.wg_cd(), msg));
			}
			else {
				MCMessagePool.add(new MCMessage(r, null, MSBCL0028, r.wg_cd(), msg));
			}
		}

		/** 通常ＭＲＰ後処理 */
		protected void afterExecMrp(Mrp_Upd01_DtlR r) {
			// N/A.
		}

		/** 先行手配ＭＲＰ後処理 */
		protected void afterExecPrcdMrp(Mrp_Upd01_DtlR r) {
			// N/A.
		}

		/** シミュＭＲＰ後処理 */
		protected void afterExecSimMrp(Mrp_Upd01_DtlR r) {
			//ＭＲＰ実行日設定
			updProcDt(r);
			if (MSC_SIM_MRP_TYP.isPRMS(r.sim_mrp_typ())) {
				//シグナル設定用
				callThisMrpUpd02(r);
			}
		}

		/** エラー終了したMRP実行があった場合に例外をスローする */
		protected void checkErr() {
			MCList<Mrp_Upd01_DtlR> errList = up0().subList(Mrp_Upd01_DtlR.$err_flg, true);
			if (!errList.isEmpty()) {
				String wgs = "";
				for (Mrp_Upd01_DtlR r : errList) {
					if(!isNull(wgs)) {
						wgs = wgs + ", ";
					}
					wgs = wgs + r.wg_cd();
				}
				MCAppException e = new MCAppException(MSBCL0024, wgs);
				e.addCauseMessageList(MCMessagePool.getMessageList());
				throw e;
			}
		}

		/** ＭＲＰカウンタの設定 */
		protected void setMrpCntr() {
			for (Mrp_Upd01_DtlR r : up0()) {
				// ＭＲＰカウンタの設定
				setMrpCntr(r);
			}
		}

		/**
		 * ＭＲＰカウンタを設定する
		 */
		protected void setMrpCntr(Mrp_Upd01_DtlR r) {
			MAM_WG_R wg = MAM_WG_R.create();
			MCQueryApiBuilder wg_bldr = MCQueryApiBuilder.create(MAM_WG_R.create("T"));
			dbSelectKey("MSBCL5050_MAM_WG_S01", wg, wg_bldr, r);
			if (isNull(wg.mrp_prefix())) {
				r.err_flg(true);
				MCMessagePool.add(new MCMessage(r, null, MSBCL0023, r.wg_cd()));
				return;
			}

			// 接頭語、ＷＧ、カウンタ区分でＭＲＰカウンタを取得
			MCList<MST_MRP_CNTR_R> cntrL = getMrpCntrSet(r.mrp_typ(), wg.wg_cd(), wg.mrp_prefix());
			MCQueryApiBuilder cntrL_bldr = MCQueryApiBuilder.create(MST_MRP_CNTR_R.create("T"));
			MCList<MST_MRP_CNTR_R> chkL = cntrL.createInstance();
			MST_MRP_CNTR_R t3 = MST_MRP_CNTR_R.create("T");
			MCQueryApiBuilder chkL_bldr = MCQueryApiBuilder.create(t3);
			chkL_bldr.addWhereWithAnd(t3.wg_cd.eq(bind("1")), wg.wg_cd());
			chkL_bldr.addWhereWithAnd(t3.mrp_cntr_typ.eq(bind("mrp_cntr_typ")));
			chkL_bldr.addWhereWithAnd(t3.prefix.eq(bind("prefix")));
			if (dbSelect("MSBCL5050_MST_MRP_CNTR_S01", chkL, chkL_bldr, cntrL) == cntrL.size()) {
				// 4件セレクトされたら正常
				return;
			}
			// 一旦同一ＷＧのカウンタを削除
			dbDeleteKey("MSBCL5050_MST_MRP_CNTR_D01", cntrL, cntrL_bldr);

			// すでに登録されたカウンタに同一のprefixが無いかどうかチェック
			chkL.init();
			chkL_bldr = MCQueryApiBuilder.create(t3);
			chkL_bldr.addWhereWithAnd(t3.mrp_cntr_typ.eq(bind("mrp_cntr_typ")));
			chkL_bldr.addWhereWithAnd(t3.prefix.eq(bind("prefix")));
			if (dbSelect("MSBCL5050_MST_MRP_CNTR_S02", chkL, chkL_bldr, cntrL) > 0) {
				r.err_flg(true);
				MCMessagePool.add(
					new MCMessage(r, null, MSBCL0025, r.wg_cd(), chkL.get(0).prefix()));
				return;
			}

			// 初期カウンタ追加
			int length = MST_MRP_CNTR_R.max_val_META.length() - cntrL.get(0).prefix().length();
			String max = lpad("", length, "9");
			cntrL.setNumber(MST_MRP_CNTR_R.$cntr, MCNumber.ZERO);
			cntrL.setNumber(MST_MRP_CNTR_R.$min_val, MCNumber.ZERO);
			cntrL.setNumber(MST_MRP_CNTR_R.$max_val, MCNumber.valueOf(max));
			dbInsertEx("MSBCL5050_MST_MRP_CNTR_I01", cntrL, cntrL_bldr);
		}

		/**
		 * ＭＲＰカウンタセットを取得する
		 */
		protected MCList<MST_MRP_CNTR_R> getMrpCntrSet(String mrpTyp, String wgCd, String wgPrefix) {
			MCList<MST_MRP_CNTR_R> cntrL = MCList.create(MST_MRP_CNTR_R.class);
			MST_MRP_CNTR_R insR;
			MST_MRP_CNTR_R proto = MST_MRP_CNTR_R.create();
			proto.wg_cd(wgCd);
			if (MSC_MRP_TYP.isPRCD(mrpTyp)) {
				// 先行手配
				proto.prefix(MSC_MRP_TYP.PRCD.prefix() + wgPrefix);

				insR = proto.clone();
				insR.mrp_cntr_typ(MSC_MRP_CNTR_TYP.PORD.value());
				cntrL.add(insR);

				insR = proto.clone();
				insR.mrp_cntr_typ(MSC_MRP_CNTR_TYP.PKORD.value());
				cntrL.add(insR);

				insR = proto.clone();
				insR.mrp_cntr_typ(MSC_MRP_CNTR_TYP.PRQMT.value());
				cntrL.add(insR);

				insR = proto.clone();
				insR.mrp_cntr_typ(MSC_MRP_CNTR_TYP.PSLIP.value());
				cntrL.add(insR);
			}
			else if (MSC_MRP_TYP.isSIM(mrpTyp)) {
				// シミュレーション
				proto.prefix(MSC_MRP_TYP.SIM.prefix() + wgPrefix);

				insR = proto.clone();
				insR.mrp_cntr_typ(MSC_MRP_CNTR_TYP.IORD.value());
				cntrL.add(insR);

				insR = proto.clone();
				insR.mrp_cntr_typ(MSC_MRP_CNTR_TYP.IKORD.value());
				cntrL.add(insR);

				insR = proto.clone();
				insR.mrp_cntr_typ(MSC_MRP_CNTR_TYP.IRQMT.value());
				cntrL.add(insR);

				insR = proto.clone();
				insR.mrp_cntr_typ(MSC_MRP_CNTR_TYP.ISLIP.value());
				cntrL.add(insR);
			}
			else {
				// 通常ＭＲＰ
				proto.prefix(MSC_MRP_TYP.MRP.prefix() + wgPrefix);

				insR = proto.clone();
				insR.mrp_cntr_typ(MSC_MRP_CNTR_TYP.ORD.value());
				cntrL.add(insR);

				insR = proto.clone();
				insR.mrp_cntr_typ(MSC_MRP_CNTR_TYP.KORD.value());
				cntrL.add(insR);

				insR = proto.clone();
				insR.mrp_cntr_typ(MSC_MRP_CNTR_TYP.RQMT.value());
				cntrL.add(insR);

				insR = proto.clone();
				insR.mrp_cntr_typ(MSC_MRP_CNTR_TYP.SLIP.value());
				cntrL.add(insR);
			}

			return cntrL;
		}

		/**
		 * ＭＲＰ計算ＮＯを発番する
		 */
		protected void setMrpCalcNo(Mrp_Upd01_DtlR row) {
			ElmArgsR elm = ElmArgsR.create();
			elm.co_cd(mcframe.serverCore.sys.MCSys.user.coCD());
			elm.wg_cd(row.wg_cd());
			elm.dt(getToday());
			row.mrp_calc_no(getNum(MAC_NUM_BIZ_TYP.MRPCLC, elm));
		}

		/**
		 * シミュレーション管理情報のＭＲＰ実行日を更新する
		 */
		protected void updProcDt(Mrp_Upd01_DtlR r) {
			MST_SIM_MRP_R updR = MST_SIM_MRP_R.create();
			MST_SIM_MRP_R t = MST_SIM_MRP_R.create("T");
			MCQueryApiBuilder updR_bldr = MCQueryApiBuilder.create(t);
			updR.mrp_proc_dt(r.mrp_proc_dt());
			updR.sim_mrp_no(r.sim_mrp_no());
			updR_bldr.setSet(t.mrp_proc_dt);
			dbUpdateKey("MSBCL5050_MST_SIM_MRP_U01", updR, updR_bldr);
		}

		/**
		 *  ＭＲＰ実行コマンドを作成する 
		 */
		protected String getMRPcommand(Mrp_Upd01_DtlR row) {

			StringBuilder buf = new StringBuilder();

			// MRP実行ファイル
			buf.append(MCConfig.server.getString("MS.mrpea.command"));
			// MRPホームディレクトリ
			buf.append(" ");
			buf.append(MCConfig.server.getString("MS.mrpea.home"));
			// ＭＲＰ実行区分
			buf.append(" ");
			buf.append(row.mrp_typ());
			// ＭＲＰ計算ＮＯ
			buf.append(" ");
			buf.append(row.mrp_calc_no());
			// ＷＧコード
			buf.append(" ");
			buf.append(row.wg_cd());
			// 会社コード
			buf.append(" ");
			buf.append(mcframe.serverCore.sys.MCSys.user.coCD());
			// ユーザコード
			buf.append(" ");
			buf.append(mcframe.serverCore.sys.MCSys.user.ID());
			// 画面ＩＤ
			buf.append(" ");
			buf.append(mcframe.serverCore.sys.MCSys.request.reqSrcId());
			// 更新リクエストＮＯ
			buf.append(" ");
			buf.append(mcframe.serverCore.sys.MCSys.request.serverRequestNo());
			// 言語設定
			buf.append(" ");
			buf.append(mcframe.serverCore.sys.MCSys.user.locale().toString());
			// 出庫予定ＦＲＯＭ
			buf.append(" ");
			buf.append(row.gi_schd_fr().toString("yyyyMMdd"));
			// 独立所要ＦＲＯＭ
			buf.append(" ");
			buf.append(row.irqmt_fr().toString("yyyyMMdd"));
			// シミュレーションＮＯ
			buf.append(" ");
			buf.append(row.sim_mrp_no());
			// シミュレーション区分
			buf.append(" ");
			buf.append(row.sim_mrp_typ());
			// バッチ処理グループコード
			buf.append(" ");
			buf.append(MCTransactionManager.getGpBatchGrpCd());
			// データベース接続ユーザ
			buf.append(" ");
			buf.append(MCConfig.server.getString("database.user"));
			// データベース接続パスワード
			buf.append(" ");
			buf.append(MCConfig.server.getString("database.password"));
			buf.append(" ");
			buf.append(MCConfig.server.getString("database.server"));
			buf.append(" ");
			buf.append(MCConfig.server.getString("database.port"));
			buf.append(" ");
			buf.append(MCConfig.server.getString("database.dbname"));
			buf.append(" ");
			buf.append(MCConfig.server.getString("database.schema"));
			buf.append(" ");
			buf.append(MCConfig.server.getString("database.sid"));
			buf.append(" ");
			buf.append(mcframe.serverCore.sys.MCSys.env.MCF_HOME());
			buf.append(" ");
			//「Oracle」と分類できる製品であるか否かを取得する。
			buf.append(MCDatabaseManager.isOracle());
			buf.append(" ");
			//「PostgreSQL」と分類できる製品であるか否かを取得する。
			buf.append(MCDatabaseManager.isPostgreSql());
			
			return buf.toString();
		}

		/**
		 * ログ表示用のパラメータを取得する
		 */
		protected int getLmtLogParm() {
			String parmVal = getSysParm(MRP_LMT_LOG_PARM_KEY);
			try {
				int limit = Integer.valueOf(parmVal);
				if (limit <= 0) {
					return 0;
				}
				return limit;
			}
			catch (Exception e) {
				return -1;
			}
		}

		/** MRP実行前のロック取得処理 */
		protected void lock() {
			MCList<Mrp_Upd01_DtlR> notErrL = getChkList(up0());
			try {
				for (Mrp_Upd01_DtlR r : notErrL) {	
					if (MSC_MRP_TYP.isSIM(r.mrp_typ())) {
						lockSimMrp(r);
					}
					else {
						lockMrpLock(r);
					}
				}
			}
			finally {
				unlock();
			}
		}

		/**
		 * 所要量計算ロックテーブルのロックを取得する 
		 */
		protected void lockMrpLock(Mrp_Upd01_DtlR r) {
			MST_MRP_LOCK_R lockR = MST_MRP_LOCK_R.create();
			MCQueryApiBuilder lockR_bldr = MCQueryApiBuilder.create(MST_MRP_LOCK_R.create("T"));
			try {
				// ロックはカレントトランザクションを使用
				dbSelectKeyForUpdateNoWait("MSBCL5050_MST_MRP_LOCK_S01", lockR, lockR_bldr, r);
			}
			catch (MCException ex) {
				if (!isSame(ex.getID(), FCBCC0110)) {
					throw ex;
				}
				//リソースビジー
				r.err_flg(true);
				MCMessagePool.add(new MCMessage(r, null, MSBCL0100, r.wg_cd()));
				return;
			}

			if (!isNull(lockR.wg_cd())) {
				// MRPea.sql（別セッション）で実行ユーザ名を取得できるように
				dbTsUpdateKey("MSBCL5050_MST_MRP_LOCK_U01", lockR, lockR_bldr.getBaseDbc());
				dbTran().commit();
				dbSelectKeyForUpdateNoWaitNoFetch("MSBCL5050_MST_MRP_LOCK_S02", lockR_bldr, r);
			}
			else {
				// ロック再実行
				insAndReTryLockMrpLock(r);	
			}
		}

		/**
		 * 所要量計算ロックテーブルを挿入してロック取得処理を再実行する
		 */
		protected void insAndReTryLockMrpLock(Mrp_Upd01_DtlR r) {
			// 新規トランザクションで登録
			MST_MRP_LOCK_R insR = MST_MRP_LOCK_R.create();
			MST_MRP_LOCK_R t = MST_MRP_LOCK_R.create("T");
			MCQueryApiBuilder insR_bldr = MCQueryApiBuilder.create(t);
			insR.wg_cd(r.wg_cd());
			insR.mrp_typ(r.mrp_typ());

			try {
				insR_bldr.buildInsert("MSBCL5050_MST_MRP_LOCK_I01").executeUpdate(getLockTran(), insR, null);
			}
			catch (MCException ex) {
				if (!isSame(ex.getID(), FCBCC0136)) {
					throw ex;
				}
				//一意制約違反
				r.err_flg(true);
				MCMessagePool.add(new MCMessage(r, null, MSBCL0101, r.wg_cd()));
				return;
			}

			// ロック再実行
			getLockTran().commit();			
			lockMrpLock(r);
		}

		/**
		 * シミュレーション管理情報テーブルのロックを取得する 
		 */
		protected void lockSimMrp(Mrp_Upd01_DtlR r) {
			MST_SIM_MRP_R lockR = MST_SIM_MRP_R.create();
			MST_SIM_MRP_R t = MST_SIM_MRP_R.create("T");
			MCQueryApiBuilder lockR_bldr = MCQueryApiBuilder.create(t);
			try {
				// ロックはカレントトランザクションを使用
				dbSelectKeyForUpdateNoWait("MSBCL5050_MST_SIM_MRP_S01", lockR, lockR_bldr, r);
			}
			catch (MCException ex) {
				if (!isSame(ex.getID(), FCBCC0110)) {
					throw ex;
				}
				//リソースビジー
				r.err_flg(true);
				MCMessagePool.add(new MCMessage(r, null, MSBCL0100, r.wg_cd()));
				return;
			}

			if (!isNull(lockR.sim_mrp_no())) {
				// MRPea.sql（別セッション）で実行ユーザ名を取得できるように
				dbTsUpdateKey("MSBCL5050_MST_SIM_MRP_U02", lockR, lockR_bldr.getBaseDbc());
				dbTran().commit();
				MCList<MST_SIM_MRP_R> lockL = MCList.create(MST_SIM_MRP_R.class);
				lockR_bldr.setWhere(t.wg_cd.eq(bind("wg_cd")));
				lockR_bldr.setOrderByAsc(t.sim_mrp_no);
				dbSelectForUpdateNoWait("MSBCL5050_MST_SIM_MRP_S02", lockL, lockR_bldr, r);
				//納期回答用シミュレーションＭＲＰの階層を取得
				r.tree_lvl(lockR.tree_lvl());
			}
			else {
				//シミュレーション管理情報テーブルが存在しない
				r.err_flg(true);
				MCMessagePool.add(new MCMessage(r, null, MSBCL0100, r.wg_cd()));
			}
		}

		/** 納期回答用シミュレーション結果初期化 */
		protected void initSimPrms() {
			MCList<Mrp_Upd01_DtlR> notErrL = getChkList(up0());
			for (Mrp_Upd01_DtlR r : notErrL) {
				//納期回答用シミュレーション結果を削除
				if (MSC_MRP_TYP.isSIM(r.mrp_typ())
						&& MSC_SIM_MRP_TYP.isPRMS(r.sim_mrp_typ())) {
					executeUpdate(MSBCL5050_MST_SIM_PRMS_RSLT_D01(), r);
				}
			}
		}

		/**
		 * 納期回答用シミュレーションＭＲＰの後処理
		 */
		protected void callThisMrpUpd02(Mrp_Upd01_DtlR r) {
			//サービスを呼び出す。
			MSBCL_MrpExecService.MRP_Upd02 prmsOpe = MSBCL_MrpExecService.crtMRP_Upd02();
			prmsOpe.up0().wg_cd(r.wg_cd());
			prmsOpe.up0().sim_mrp_no(r.sim_mrp_no());
			prmsOpe.up0().tree_lvl(r.tree_lvl());
			prmsOpe.exec();
		}

		/**
		 * ロック用トランザクションを取得する
		 */
		protected MCDBTransaction getLockTran() {
			if (_lockTran == null) {
				_lockTran = createDBTran(false);
			}
			return _lockTran;
		}

		/**
		 * ロック用トランザクションを解放する
		 */
		protected void unlock() {
			if (_lockTran != null) {
				_lockTran.rollback();
				MCTransactionManager.releaseDBTran(_lockTran);
			}
		}

		/**
		 * スケジューラ用排他をチェックする
		 */
		protected boolean lockScheExec(Mrp_Upd01_DtlR r) {
			MST_SCHE_EXEC_R fsR = MST_SCHE_EXEC_R.create();
			MCQueryApiBuilder fsR_bldr = MCQueryApiBuilder.create(MST_SCHE_EXEC_R.create("T"));
			dbSelectKeyForUpdate("MSBCL5050_MST_SCHE_EXEC_S01", fsR, fsR_bldr, r);
			if (fsR.exec_flg()) {
				// スケジューリング中のためＭＲＰ実行は行わない
				r.err_flg(true);
				MCMessagePool.add(new MCMessage(r, null, MSBCL0026, r.wg_cd()));
				return false;
			}
			return true;
		}
	}

	/**
	 * MRP_Upd02オペレーション.<p>
	 *
	 * 納期回答用シミュレーションＭＲＰ後処理です。<br>
	 */
	public class MRP_Upd02 extends MSBCL_MrpExecService_MC_A.MRP_Upd02 {

		protected MCList<Mrp_Upd03_DtlR> _inptDataL = MCList.create(Mrp_Upd03_DtlR.class);

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			callThisUpd03();
		}

		/**
		 * 納期回答用シミュレーション結果登録を呼ぶ
		 */
		protected void callThisUpd03() {

			//納期回答用ＭＲＰ入力データの取得
			getSimPrmsInptData();

			if (_inptDataL.size() == 0) {
				return;
			}

			//マルチスレッド対応
			List<MSBCL_MrpExecService.MRP_Upd03> opeL = new ArrayList<>();
			for (MCList<Mrp_Upd03_DtlR> upL : splitTgt(_inptDataL)) {
				MSBCL_MrpExecService.MRP_Upd03 ope = MSBCL_MrpExecService.crtMRP_Upd03();
				ope.up0().setAll(upL);
				opeL.add(ope);
			}
			if (MCServerThreadManager.getLimitThreadSize() == 1) {
				MCServerThreadManager.setUseMainDBTran(true);
			}
			MCServerThreadManager.invokeAndWait(opeL);
		}

		/**
		 * 納期回答用ＭＲＰ入力データの取得
		 */
		protected void getSimPrmsInptData() {
			// 出荷進捗より対象の受注明細ＮＯを取得
			MCList<MST_SHIP_PR_R> shipPrL = MCList.create(MST_SHIP_PR_R.class);
			MST_SHIP_PR_R t1 = MST_SHIP_PR_R.create("T");
			MCQueryApiBuilder shipPrL_bldr = MCQueryApiBuilder.create(t1);
			shipPrL_bldr.setSelect(t1.slo_d_no);
			shipPrL_bldr.setWhere(t1.slo_d_no.isNotNull());
			shipPrL_bldr.addWhereWithAnd(t1.sls_sts_typ.in( value(MSC_SLS_STS_TYP.SLO.value()), value(MSC_SLS_STS_TYP.PRMS.value()), value(MSC_SLS_STS_TYP.DLV_INST_RCPT.value()), value(MSC_SLS_STS_TYP.DLV_INST_PRMS.value())));
			dbSelect("MSBCL5050_MST_SHIP_PR_S01", shipPrL, shipPrL_bldr);
			
			if(!shipPrL.isEmpty()) {
				MCList<MST_SLO_D_R> sloDL = MCList.create(MST_SLO_D_R.class);
				MCQueryApiBuilder sloDL_bldr = MCQueryApiBuilder.create(MST_SLO_D_R.create("T"));
				dbWkDelete("MSBCL5050_MSW_SLO_D_D01", sloDL_bldr.getBaseDbc());
				
				for(MST_SHIP_PR_R shipPrR : shipPrL) {
					MST_SLO_D_R sloDR = MST_SLO_D_R.create();
					sloDR.slo_d_no(shipPrR.slo_d_no());
					sloDL.add(sloDR);
				}
				dbWkInsert("MSBCL5050_MSW_SLO_D_I01", sloDL, sloDL_bldr.getBaseDbc());
			}
			
			// ＷＧ間依頼よりＷＧ間依頼ＮＯを取得
			MCList<MST_WG_RQST_R> wgRqstL = MCList.create(MST_WG_RQST_R.class);
			MST_WG_RQST_R t3 = MST_WG_RQST_R.create("T");
			MCQueryApiBuilder wgRqstL_bldr = MCQueryApiBuilder.create(t3);
			MAM_LOC_R m1 = MAM_LOC_R.create("M1");
			MAM_LOC_R m2 = MAM_LOC_R.create("M2");
			dbWkDelete("MSBCL5050_MSW_WG_RQST_D01", wgRqstL_bldr.getBaseDbc());
			wgRqstL_bldr.setSelect(t3.wg_rqst_no);
			wgRqstL_bldr.addLeftOuterJoin(m1, bracket( m1.loc_cd.eq(t3.gr_loc_cd)));
			wgRqstL_bldr.addLeftOuterJoin(m2, bracket( m2.loc_cd.eq(t3.gi_loc_cd)));
			wgRqstL_bldr.setWhere(t3.wg_rqst_sts_typ.in( value(MSC_WG_RQST_STS_TYP.RQST.value()), value(MSC_WG_RQST_STS_TYP.PRMS.value()), value(MSC_WG_RQST_STS_TYP.PART_INST.value()), value(MSC_WG_RQST_STS_TYP.INST.value())));
			wgRqstL_bldr.addWhereWithAnd(bracket( m1.wg_cd.eq(bind("1")) .or(m2.wg_cd.eq(bind("2")))), up0().wg_cd(), up0().wg_cd());
			dbSelect("MSBCL5050_MST_WG_RQST_S01", wgRqstL, wgRqstL_bldr);
			dbWkInsert("MSBCL5050_MSW_WG_RQST_I01", wgRqstL, wgRqstL_bldr.getBaseDbc());
			
			executeQuery(_inptDataL, MSBCL5050_EXP_TGT_S01(), up0());
		}

		protected List<MCList<Mrp_Upd03_DtlR>> splitTgt(MCList<Mrp_Upd03_DtlR> list) {
			List<MCList<Mrp_Upd03_DtlR>> ret = new ArrayList<>();

			int max = getThreadBatchSize(_inptDataL.size());
			MCList<Mrp_Upd03_DtlR> tmp = MCList.create(Mrp_Upd03_DtlR.class);
			for (MCList<Mrp_Upd03_DtlR> grp
					: list.groupList(Mrp_Upd03_DtlR.$wg_rqst_no, Mrp_Upd03_DtlR.$slo_d_no)) {
				if (tmp.size() >= max) {
					ret.add(tmp);
					tmp = MCList.create(Mrp_Upd03_DtlR.class);
				}
				tmp.addAll(grp);
			}
			if (!tmp.isEmpty()) {
				ret.add(tmp);
			}

			return ret;
		}
	}

	/**
	 * MRP_Upd03オペレーション.<p>
	 *
	 * 納期回答用シミュレーション結果登録<br>
	 */
	public class MRP_Upd03 extends MSBCL_MrpExecService_MC_A.MRP_Upd03 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			main();
		}

		/** 上り電文より展開した結果から納期回答用シミュレーション結果を登録 */
		protected void main() {
			// 判定結果登録用コンテナ
			MCList<MST_SIM_PRMS_RSLT_R> simPrmsRsltDbc = MCList.create(MST_SIM_PRMS_RSLT_R.class);

			// 判定用基準日
			MCDate baseDt = getToday();

			for (Mrp_Upd03_DtlR r: up0()) {
				// 納期回答用ＭＲＰ展開結果取得
				MCList<Mrp_Upd03_RsltR> expL = srchSimRqmtExp(r);
				// シミュレーション引当予定区分判定
				String simAllocPlnTyp = getSimAllocPlnTyp(expL, baseDt, r);
				// 結果コンテナ作成
				simPrmsRsltDbc.add(setPrmsRslt(r, simAllocPlnTyp));
			}

			if (!simPrmsRsltDbc.isEmpty()) {
				//　同一受注明細ＮＯから複数依頼が有り得るため
				MCGroupByPolicy gp = new MCGroupByPolicy();
				gp.addKey(MST_SIM_PRMS_RSLT_R.$wg_cd, MST_SIM_PRMS_RSLT_R.$wg_rqst_no, MST_SIM_PRMS_RSLT_R.$slo_d_no);
				gp.max(MST_SIM_PRMS_RSLT_R.$sim_alloc_pln_typ);
				
				MCList<MST_SIM_PRMS_RSLT_R> simPrmsRsltDbc2 = simPrmsRsltDbc.groupBy(gp);
				MCQueryApiBuilder simPrmsRsltDbc2_bldr = MCQueryApiBuilder.create(MST_SIM_PRMS_RSLT_R.create("T"));
				dbInsertEx("MSBCL5050_MST_SIM_PRMS_RSLT_I01", simPrmsRsltDbc2, simPrmsRsltDbc2_bldr);
			}
		}

		/** 判定結果（シミュレーション引当予定区分）を取得する */
		protected String getSimAllocPlnTyp(MCList<Mrp_Upd03_RsltR> expL, MCDate baseDt, Mrp_Upd03_DtlR up0) {

			if(isNull(expL)){
				if(MSC_WG_RQST_TYP.isPURC(up0.wg_rqst_typ())) {
					return null;
				}
				return MSC_SIM_ALLOC_PLN_TYP.PST_ORD_ALLOC.value();
			}

			if (expL.subList(r -> isNull(r.lot_no())).size() == 0) {
				return MSC_SIM_ALLOC_PLN_TYP.STK_ALLOC.value();
			}

			for (Mrp_Upd03_RsltR r: expL) {
				if (checkOldAlloc(r, baseDt)) {
					return MSC_SIM_ALLOC_PLN_TYP.PST_ORD_ALLOC.value();
				}
			}
			return MSC_SIM_ALLOC_PLN_TYP.ORD_ALLOC.value();
		}

		/** 過去予定日オーダを引き当てているかチェックする */
		protected boolean checkOldAlloc(Mrp_Upd03_RsltR r, MCDate baseDt) {
			if(MSC_ITM_ORD_TYP.isMFG(r.itm_ord_typ())) {
				return r.mfg_st_schd_dt().lt(baseDt);
			}
			else if(MSC_ITM_ORD_TYP.isPURC(r.itm_ord_typ())) {
				return r.po_schd_dt().lt(baseDt);
			}
			else if(MSC_ITM_ORD_TYP.isOUTSRC(r.itm_ord_typ())) {
				return r.po_schd_dt().lt(baseDt);
			}
			else if(MSC_ITM_ORD_TYP.isXFR(r.itm_ord_typ())) {
				return r.gi_schd_dt().lt(baseDt);
			}
			else if(MSC_ITM_ORD_TYP.isWG_XFR(r.itm_ord_typ())) {
				return r.gi_schd_dt().lt(baseDt);
			}
			else {
				return false;
			}
		}

		/**
		 * オーダ展開処理結果を抽出する
		 * @param r
		 * @return
		 */
		protected MCList<Mrp_Upd03_RsltR> srchSimRqmtExp(Mrp_Upd03_DtlR r) {
			MCList<Mrp_Upd03_RsltR> ls = MCList.create(Mrp_Upd03_RsltR.class);
			execInsHrrchyProc(r);
			executeQuery(ls, MSBCL5050_MSW_ITM_ORD_F_HRRCHY_S01());
			return ls;
		}

		protected void execInsHrrchyProc(Mrp_Upd03_DtlR r) {
			String procId = "MSPA_INS_HRRCHY$P_INS_SIM_ORD_F_HRRCHY_P";
			execProc(createSqlId(LOGIC_ID, procId, "01"), procId, r, null, ":io_schd_no, :io_schd_typ, :io_schd_sts_typ, :sim_mrp_no, :tree_lvl");
		}

		/**
		 * 納期回答用シミュレーション結果の登録
		 * @param r
		 * @param simAllocPlnTyp
		 */
		protected MST_SIM_PRMS_RSLT_R setPrmsRslt(Mrp_Upd03_DtlR r, String simAllocPlnTyp) {
			MST_SIM_PRMS_RSLT_R dbcR = MST_SIM_PRMS_RSLT_R.create();
			dbcR.wg_cd(r.wg_cd());
			dbcR.slo_d_no(r.slo_d_no());
			dbcR.wg_rqst_no(r.wg_rqst_no());
			dbcR.sim_alloc_pln_typ(simAllocPlnTyp);

			return dbcR;
		}
	}

	//FMCB CUSTOM END
}