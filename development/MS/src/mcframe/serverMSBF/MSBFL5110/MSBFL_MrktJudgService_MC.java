package mcframe.serverMSBF.MSBFL5110;

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
import mcframe.serverMSBF.MSBFL5110.*; // このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBF.MSBFL5210.*;
import mcframe.serverFXUC.FXUCL0030.*;
import mcframe.serverMSBF.MSBFL5010.*;
import mcframe.serverMAUC.MAUCL5010.*;
import java.util.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBFL_MrktJudgService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBFL_MrktJudgService_MC extends MSBFL_MrktJudgService_MC_A{
	//FMCB CUSTOM START

	/**
	 * MrktJudg_Chk01オペレーション.<p>
	 *
	 * 市場出荷判定情報を登録・訂正する前チェックを行う。<br>
	 */
	public class MrktJudg_Chk01 extends MSBFL_MrktJudgService_MC_A.MrktJudg_Chk01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			MCMessageList msgL = new MCMessageList();

			// チェック処理
			// 医薬・プロセスオプションがオフの場合は何もしない。
			if (isSame(getSysParm("MFG_APRV_ENABLE_FLG"), "1")) {
				msgL.addAll(
						chkNoDel(up0().subList(MrktJudg_Chk01_RsltR.$fromScrFlg, false)));
			}

			MCMessagePool.addAll(msgL);

			// 下り電文設定
			setDown();
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * 取消不可チェックを行う。
		 * 
		 * @param chkR チェックレコード
		 * @return メッセージリスト
		 */
		protected MCMessageList chkNoDel(MCList<MrktJudg_Chk01_RsltR> chkL) {
			MCMessageList msgL = new MCMessageList();
			MCList<MST_MRKT_JUDG_D_R> bindL = MCList.create(MST_MRKT_JUDG_D_R.class);
			for (MrktJudg_Chk01_RsltR chkR : chkL) {
				if (!isNull(chkR.mrkt_judg_src_no_del())) {
					MST_MRKT_JUDG_D_R bindR = MST_MRKT_JUDG_D_R.create();
					bindR.mrkt_judg_src_no(chkR.mrkt_judg_src_no_del());
					bindR.mrkt_judg_src_typ(chkR.mrkt_judg_src_typ());
					bindL.add(bindR);
				}
			}

			if (bindL.isEmpty()) {
				return msgL;
			}

			MCList<MST_MRKT_JUDG_D_R> judgDL = MCList.create(MST_MRKT_JUDG_D_R.class);
			MCQueryApiBuilder judgDL_bldr = MCQueryApiBuilder.create(MST_MRKT_JUDG_D_R.create("T"));
			dbSelectColumn("MSBFL5110_MST_MRKT_JUDG_D_S01", judgDL, judgDL_bldr, bindL,
					MST_MRKT_JUDG_D_R.$mrkt_judg_src_no, MST_MRKT_JUDG_D_R.$mrkt_judg_src_typ);

			MCIndexKey idxkey = judgDL.createIndex(MST_MRKT_JUDG_D_R.$mrkt_judg_src_no);
			for (MrktJudg_Chk01_RsltR chkR : chkL) {
				MST_MRKT_JUDG_D_R judgR = judgDL.getFirst(idxkey,
						chkR.mrkt_judg_src_no_del());
				if (!isNull(judgR)) {
					chkR.mrkt_judg_no(judgR.mrkt_judg_no());
				}
			}
			MCList<MST_MRKT_JUDG_R> dbL = MCList.create(MST_MRKT_JUDG_R.class);
			MCQueryApiBuilder dbL_bldr = MCQueryApiBuilder.create(MST_MRKT_JUDG_R.create("T"));
			dbSelectKey("MSBFL5110_MST_MRKT_JUDG_S01", dbL, dbL_bldr,
					judgDL.groupBy(MST_MRKT_JUDG_D_R.$mrkt_judg_no));

			Set<String> hasErrItm = new HashSet<String>();
			MCIndexKey chkIdxkey = chkL.createIndex(MST_MRKT_JUDG_R.$mrkt_judg_no);
			for (MST_MRKT_JUDG_R dbR : dbL) {
				if (dbR.no_del_flg()) {
					MrktJudg_Chk01_RsltR chkR = chkL.getFirst(chkIdxkey,
							dbR.mrkt_judg_no());
					if (isNull(chkR) || isChg(chkR, dbR)) {
						String hasKey = toDispItm(dbR.itm_cd(), dbR.itm_sub1(),
								dbR.itm_sub2(), dbR.itm_sub3()) + MAC_STR.BTN_GRP_NM_DLM
								+ dbR.lot_no();
						if (hasErrItm.contains(hasKey)) {
							chkR.err_flg(true);
							continue;
						}
						hasErrItm.add(hasKey);
						chkR.err_flg(true);
						msgL.add(new MCMessage(chkR, null, MSBFL0008,
								toDispItm(dbR.itm_cd(), dbR.itm_sub1(), dbR.itm_sub2(),
										dbR.itm_sub3()),
								dbR.lot_no(), toDispGUIIndex(chkR)));
					}
				}
			}

			return msgL;
		}

		protected boolean isChg(MrktJudg_Chk01_RsltR chkR, MST_MRKT_JUDG_R dbR) {
			if (!isSame(chkR.itm_cd(), dbR.itm_cd())
					|| !isSame(chkR.itm_sub1(), dbR.itm_sub1())
					|| !isSame(chkR.itm_sub2(), dbR.itm_sub2())
					|| !isSame(chkR.itm_sub3(), dbR.itm_sub3())
					|| !isSame(chkR.lot_no(), dbR.lot_no())
					|| !isSame(chkR.base_unit_qty(), dbR.base_unit_qty())
					|| !isSame(chkR.base_unit_cd(), dbR.base_unit_cd())) {
				return true;
			}
			else {
				return false;
			}
		}
	}

	/**
	 * MrktJudg_Chk02オペレーション.<p>
	 *
	 * 指定されたロットが出荷可能かチェックする。<br>
	 */
	public class MrktJudg_Chk02 extends MSBFL_MrktJudgService_MC_A.MrktJudg_Chk02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			// 医薬・プロセスオプションがオフの場合は何もしない。
			if (!isSame(getSysParm("MFG_APRV_ENABLE_FLG"), "1")) {
				return;
			}

			MCMessageList msgL = new MCMessageList();

			// チェック処理
			msgL.addAll(checkMain());

			MCMessagePool.addAll(msgL);

			// 下り電文設定
			setDown();
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * 出荷可能チェック
		 * 
		 * @param chkL チェック対象リスト
		 * @return メッセージリスト
		 */
		protected MCMessageList checkMain() {
			MCMessageList msgL = new MCMessageList();
			MCList<MST_LOT_R> dbL = MCList.create(MST_LOT_R.class);
			MST_LOT_R t = MST_LOT_R.create("T");
			MCQueryApiBuilder dbL_bldr = MCQueryApiBuilder.create(t);

			dbL_bldr.setSelect(t.mrkt_judg_sts_typ);
			dbL_bldr.addSelect(t.itm_cd);
			dbL_bldr.addSelect(t.itm_sub1);
			dbL_bldr.addSelect(t.itm_sub2);
			dbL_bldr.addSelect(t.itm_sub3);
			dbL_bldr.addSelect(t.lot_no);
			dbL_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
			dbL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			dbL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			dbL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			dbL_bldr.addWhereWithAnd(t.lot_no.eq(bind("lot_no")));
			dbL_bldr.addOrderByDesc(t.lot_seq);
			dbSelect("MSBFL5110_MST_LOT_S01", dbL, dbL_bldr, up0());
			MCIndexKey idx = dbL.createIndex(getItmLotCols());

			for (MrktJudg_Chk02_RsltR r : up0()) {
				MST_LOT_R lotR = dbL.getFirst(idx, new String[] {
						r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.lot_no()
				});

				if (!isNull(lotR) && !isNull(lotR.mrkt_judg_sts_typ())) {
					if (r.pre_inst_flg() && MSC_MRKT_JUDG_STS_TYP
							.isNOT_ACPT(lotR.mrkt_judg_sts_typ())) {
						msgL.add(new MCMessage(r, null, MSBFL0084,
								lotR.mrkt_judg_sts_typ(), toDispItm(r.itm_cd(),
										r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
								r.lot_no(), toDispGUIIndex(r)));
						r.err_flg(true);
					}
					else if (!r.pre_inst_flg()
							&& (MSC_MRKT_JUDG_STS_TYP.isOPN(lotR.mrkt_judg_sts_typ())
									|| MSC_MRKT_JUDG_STS_TYP
											.isNOT_ACPT(lotR.mrkt_judg_sts_typ()))) {
						msgL.add(new MCMessage(r, null, MSBFL0009,
								lotR.mrkt_judg_sts_typ(), toDispItm(r.itm_cd(),
										r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
								r.lot_no(), toDispGUIIndex(r)));
						r.err_flg(true);
					}
				}
			}

			return msgL;
		}
	}

	/**
	 * MrktJudg_Upd01オペレーション.<p>
	 *
	 * 市場出荷判定情報を作成、更新または削除する。<br>
	 */
	public class MrktJudg_Upd01 extends MSBFL_MrktJudgService_MC_A.MrktJudg_Upd01 {
		// 品目マスタコンテナキャッシュ
		protected FXUCL_MCDbcCache<MAM_ITM_R> _cacheItmL = null;

		// 場所マスタコンテナキャッシュ
		protected FXUCL_MCDbcCache<MAM_LOC_R> _cacheLocL = null;

		// ロット管理情報コンテナキャッシュ
		protected FXUCL_MCDbcCache<MST_LOT_R> _cacheLotL = null;

		// データベース更新用のリスト
		protected MCList<MST_MRKT_JUDG_R> _insHL = MCList.create(MST_MRKT_JUDG_R.class);
		protected MST_MRKT_JUDG_R _insHL_t = MST_MRKT_JUDG_R.create("T");
		protected MCQueryApiBuilder _insHL_bldr = MCQueryApiBuilder.create(_insHL_t);

		protected MCList<MST_MRKT_JUDG_R> _updHL = MCList.create(MST_MRKT_JUDG_R.class);
		protected MST_MRKT_JUDG_R _updHL_t = MST_MRKT_JUDG_R.create("T");
		protected MCQueryApiBuilder _updHL_bldr = MCQueryApiBuilder.create(_updHL_t);

		protected MCList<MST_MRKT_JUDG_R> _updHLFrScr = MCList.create(MST_MRKT_JUDG_R.class);
		protected MST_MRKT_JUDG_R _updHLFrScr_t = MST_MRKT_JUDG_R.create("T");
		protected MCQueryApiBuilder _updHLFrScr_bldr = MCQueryApiBuilder.create(_updHLFrScr_t);

		protected MCList<MST_MRKT_JUDG_R> _delHL = MCList.create(MST_MRKT_JUDG_R.class);
		protected MST_MRKT_JUDG_R _delHL_t = MST_MRKT_JUDG_R.create("T");
		protected MCQueryApiBuilder _delHL_bldr = MCQueryApiBuilder.create(_delHL_t);

		protected MCList<MST_MRKT_JUDG_D_R> _insDL = MCList.create(MST_MRKT_JUDG_D_R.class);
		protected MST_MRKT_JUDG_D_R _insDL_t = MST_MRKT_JUDG_D_R.create("T");
		protected MCQueryApiBuilder _insDL_bldr = MCQueryApiBuilder.create(_insDL_t);

		protected MCList<MST_MRKT_JUDG_D_R> _delDL = MCList.create(MST_MRKT_JUDG_D_R.class);
		protected MST_MRKT_JUDG_D_R _delDL_t = MST_MRKT_JUDG_D_R.create("T");
		protected MCQueryApiBuilder _delDL_bldr = MCQueryApiBuilder.create(_delDL_t);

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			// 前処理
			prepare();

			// データ補完
			compMrktJudgData();

			// 市場出荷判定情報の登録・更新・削除
			updMrktJudg();

			// ロット情報サービスの区分更新
			callLotUpd05();

			// プッシュ通知
			callPushNtc();

			// 下り電文設定
			setDown();
		}

		/**
		 * 前処理
		 */
		protected void prepare() {
			// データベース更新用のリストの初期化
			initDataInfo();
		}

		/**
		 * データベース更新用のリストを初期化
		 */
		protected void initDataInfo() {
			_insHL.clear();
			_updHL.clear();
			_updHLFrScr.clear();
			_delHL.clear();
			_insDL.clear();
			_delDL.clear();
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			// 定数名設定
			putNames();

			down0().setAll(up0());
		}

		/**
		 * 定数名を設定する。
		 */
		protected void putNames() {
			MSC_MRKT_JUDG_STS_TYP.putNameNE(up0(),
					MrktJudg_Chk01_RsltR.$mrkt_judg_sts_typ,
					MrktJudg_Chk01_RsltR.$mrkt_judg_sts_typ_nm, getUsrLocale());
		}

		/**
		 * 市場出荷判定情報を登録・更新・削除する。
		 */
		protected void updMrktJudg() {

			// 市場出荷判定画面からの市場出荷判定情報の作成
			crtMrktJudgSrc(up0().subList(MrktJudg_Chk01_RsltR.$fromScrFlg, true));

			// 医薬・プロセスオプションがオフの場合は何もしない。
			// 市場出荷判定画面以外からの市場出荷判定情報の作成
			if (isSame(getSysParm("MFG_APRV_ENABLE_FLG"), "1")) {
				crtMrktJudg(up0().subList(MrktJudg_Chk01_RsltR.$fromScrFlg, false));
			}

			// ＤＢ更新
			if (!_delHL.isEmpty()) {
				dbDeleteKey("MSBFL5110_MST_MRKT_JUDG_D01", _delHL, _delHL_bldr);
			}

			if (!_updHL.isEmpty()) {
				editMrktJudgLSetStmt(_updHL, _updHL_bldr, _updHL_t);
				dbUpdateKey("MSBFL5110_MST_MRKT_JUDG_U01", _updHL, _updHL_bldr);
			}

			if (!_updHLFrScr.isEmpty()) {
				editMrktJudgLSetStmtFrScr(_updHLFrScr, _updHLFrScr_bldr, _updHLFrScr_t);
				dbUpdateKey("MSBFL5110_MST_MRKT_JUDG_U02", _updHLFrScr, _updHLFrScr_bldr);
			}

			if (!_insHL.isEmpty()) {
				editMrktJudgLSetVal(_insHL);
				dbInsertEx("MSBFL5110_MST_MRKT_JUDG_I01", _insHL, _insHL_bldr);
			}

			if (!_delDL.isEmpty()) {
				dbDeleteKey("MSBFL5110_MST_MRKT_JUDG_D_D01", _delDL, _delDL_bldr);
			}

			if (!_insDL.isEmpty()) {
				dbInsertEx("MSBFL5110_MST_MRKT_JUDG_D_I01", _insDL, _insDL_bldr);
			}
		}

		/**
		 * ロット情報サービスの区分更新を行う。
		 */
		protected void callLotUpd05() {
			MSBFL_LotService.Lot_Upd05 o = MSBFL_LotService.crtLot_Upd05();

			for (MST_MRKT_JUDG_R r : _insHL) {
				Lot_Upd05_CndR oR = Lot_Upd05_CndR.create();

				oR.insp_no(null);
				oR.insp_typ(null);
				oR.lmt_up_flg(false);
				oR.itm_cd(r.itm_cd());
				oR.itm_sub1(r.itm_sub1());
				oR.itm_sub2(r.itm_sub2());
				oR.itm_sub3(r.itm_sub3());
				oR.lot_no(r.lot_no());
				oR.sublot_no(null);
				oR.quality_typ(null);
				oR.stk_insp_typ(null);
				oR.plnt_aprv_sts_typ(null);
				oR.insp_aprv_sts_typ(null);
				oR.mrkt_judg_sts_typ(r.mrkt_judg_sts_typ());
				oR.lot_insp_schd_flg(false);
				oR.insp_inst_flg(false);
				oR.insp_inst_aprv_flg(false);
				oR.insp_act_flg(false);
				oR.insp_judg_flg(false);
				oR.plnt_aprv_flg(false);
				oR.mrkt_judg_flg(true);
				oR.setAttributes(r);

				o.up0().add(oR);
			}

			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}

		/**
		 * プッシュ通知を実行する。
		 */
		protected void callPushNtc() {
			if (!_insHL.isEmpty()) {
				MCIndexKey idxkey = _insHL.createIndex(MST_MRKT_JUDG_R.$mrkt_judg_role_cd,
						MST_MRKT_JUDG_R.$upd_dt);
				for (MST_MRKT_JUDG_R mrktR : _insHL.groupBy(
						MST_MRKT_JUDG_R.$mrkt_judg_role_cd, MST_MRKT_JUDG_R.$upd_dt)) {
					int cnt = _insHL
							.subList(idxkey, mrktR.mrkt_judg_role_cd(), mrktR.upd_dt())
							.size();

					MAUCL_PushNtcMgr mgr = MAUCL_PushNtcMgr.create();
					MAUCL_PushNtcInfo info = mgr
							.createInfo(MAC_PUSH_NTC_TYP.MRKT_JUDG_RQST);
					info.setMsg(new MCMessage(MSBFL0097, cnt));
					info.addAprvRole(mrktR.mrkt_judg_role_cd(), mrktR.upd_dt());
					info.addScrBind(MSC_MRKT_JUDG_REG_OPE.OPE_UPD_JUDG.value());

					mgr.exec();
				}
			}
			if (!_delHL.isEmpty()) {
				MCIndexKey idxkey = _delHL.createIndex(MST_MRKT_JUDG_R.$mrkt_judg_role_cd,
						MST_MRKT_JUDG_R.$upd_dt);
				for (MST_MRKT_JUDG_R mrktR : _delHL.groupBy(
						MST_MRKT_JUDG_R.$mrkt_judg_role_cd, MST_MRKT_JUDG_R.$upd_dt)) {
					int cnt = _delHL
							.subList(idxkey, mrktR.mrkt_judg_role_cd(), mrktR.upd_dt())
							.size();

					MAUCL_PushNtcMgr mgr = MAUCL_PushNtcMgr.create();
					MAUCL_PushNtcInfo info = mgr
							.createInfo(MAC_PUSH_NTC_TYP.MRKT_JUDG_RQST);
					info.setMsg(new MCMessage(MSBFL0100, cnt));
					info.addAprvRole(mrktR.mrkt_judg_role_cd(), mrktR.upd_dt());

					mgr.exec();
				}
			}
		}

		/**
		 * 登録項目の値を設定する。
		 * 
		 * @param insL
		 */
		protected void editMrktJudgLSetVal(MCList<MST_MRKT_JUDG_R> insL) {
			for (MST_MRKT_JUDG_R insR : insL) {
				MAM_ITM_R itmR = getItmR(insR.itm_cd(), insR.itm_sub1(), insR.itm_sub2(),
						insR.itm_sub3());

				if (!isNull(itmR)) {
					// 更新役割ＣＤ
					insR.mrkt_judg_upd_role_cd(
							nvl(itmR.mrkt_judg_upd_role_cd(), itmR.mrkt_judg_role_cd()));
					// 承認役割ＣＤ
					insR.mrkt_judg_role_cd(itmR.mrkt_judg_role_cd());
				}
			}
		}

		/**
		 * 市場出荷判定ヘッダ更新用のdbContainerのset句を編集する。市場出荷判定登録画面以外用
		 * @param updL 更新用リスト
		 */
		protected void editMrktJudgLSetStmt(MCList<MST_MRKT_JUDG_R> updL,
				MCQueryApiBuilder updL_bldr, MST_MRKT_JUDG_R t) {
			updL_bldr.setSet(t.base_unit_qty);
			updL_bldr.addSet(t.vld_dt);
			updL_bldr.addSet(t.upd_dt);
		}

		/**
		 * 市場出荷判定ヘッダ更新用のdbContainerのset句を編集する。市場出荷判定登録画面用
		 * @param updL 更新用リスト
		 */
		protected void editMrktJudgLSetStmtFrScr(MCList<MST_MRKT_JUDG_R> updL,
				MCQueryApiBuilder updL_bldr, MST_MRKT_JUDG_R t) {
			updL_bldr.setSet(t.mfg_so_aprv_typ);
			updL_bldr.addSet(t.quality_mng_typ);
			updL_bldr.addSet(t.mfg_mng_typ);
			updL_bldr.addSet(t.deviant_typ);
			updL_bldr.addSet(t.deviant_msr_typ);
			updL_bldr.addSet(t.prod_itm_info_typ);
			updL_bldr.addSet(t.chd_itm_info_typ);
			updL_bldr.addSet(t.base_unit_qty);
			updL_bldr.addSet(t.vld_dt);
			updL_bldr.addSet(t.no_del_flg);
			updL_bldr.addSet(t.add_flg);
			updL_bldr.addSet(t.intr_rmrks);
			updL_bldr.addSet(t.sub_char1);
			updL_bldr.addSet(t.sub_char2);
			updL_bldr.addSet(t.sub_char3);
			updL_bldr.addSet(t.upd_dt);
			updL_bldr.addSet(t.upd_usr_cd);
			updL_bldr.addSet(t.upd_dpt_cd);
		}

		/**
		 * 市場出荷判定画面からの市場出荷判定情報を作成する。
		 * @param subL
		 */
		protected void crtMrktJudgSrc(MCList<MrktJudg_Chk01_RsltR> subL) {
			addAll(_updHLFrScr,
					subL.subList(MrktJudg_Chk01_RsltR.$data_crud_typ,
							MAC_DATA_CRUD_TYP.UPD.value()),
					createMap_MST_MRKT_JUDG_R_MrktJudg_Chk01_RsltR());
			addAll(_delHL,
					subL.subList(MrktJudg_Chk01_RsltR.$data_crud_typ,
							MAC_DATA_CRUD_TYP.DEL.value()),
					createMap_MST_MRKT_JUDG_R_MrktJudg_Chk01_RsltR());

			for (MrktJudg_Chk01_RsltR r : subL) {
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {

					r.mrkt_judg_no(getStrSeq(MSC_NUM_SYS_TYP.MRKTJUDG));
					r.mrkt_judg_sts_typ(MSC_MRKT_JUDG_STS_TYP.OPN.value());

					MST_MRKT_JUDG_R newR = MST_MRKT_JUDG_R.create();
					copy(newR, r, createMap_MST_MRKT_JUDG_R_MrktJudg_Chk01_RsltR());
					newR.seq(MCNumber.ONE);

					_insHL.add(newR);
				}
			}

			MCList<MST_MRKT_JUDG_D_R> bindL = MCList.create(MST_MRKT_JUDG_D_R.class);
			for (MST_MRKT_JUDG_R r : _delHL) {

				MST_MRKT_JUDG_D_R bindR = MST_MRKT_JUDG_D_R.create();
				bindR.mrkt_judg_no(r.mrkt_judg_no());
				bindL.add(bindR);
			}

			MCList<MST_MRKT_JUDG_D_R> dl = MCList.create(MST_MRKT_JUDG_D_R.class);
			MST_MRKT_JUDG_D_R t = MST_MRKT_JUDG_D_R.create("T");
			MCQueryApiBuilder dl_bldr = MCQueryApiBuilder.create(t);
			dl_bldr.setSelect(t.mrkt_judg_d_no);
			dbSelectColumn("MSBFL5110_MST_MRKT_JUDG_D_S02", dl, dl_bldr, bindL, MST_MRKT_JUDG_D_R.$mrkt_judg_no);

			_delDL.addAll(dl);
		}

		/**
		 * 市場出荷判定画面以外からの市場出荷判定情報を作成する。
		 * @param subL
		 */
		protected void crtMrktJudg(MCList<MrktJudg_Chk01_RsltR> subL) {
			MCList<MrktJudg_Chk01_RsltR> mrktJudgL = getMrktJudgL(subL);

			if (mrktJudgL.isEmpty()) {
				return;
			}

			// 市場出荷判定明細の新規登録用リスト、削除用リスト作成
			crtMrktJudgDL(mrktJudgL);

			// 市場出荷判定ヘッダの新規登録用リスト、更新用リスト、削除用リスト作成
			crtMrktJudgHL(mrktJudgL);
		}

		/**
		 * データ補完処理
		 */
		protected void compMrktJudgData() {

			// 工場・物流倉庫ＣＤ
			setSite();

			// 市場出荷判定状況区分
			setMrktJudgStsTyp();

			// 検査予定登録サービスの品管関連マスタ取得の検索条件設定
			MCList<InspSchd_Srch01_CndR> cndL = crtInspSchdSrch01Cnd();

			// 検査予定登録サービスの品管関連マスタ取得の呼び出し
			MCList<InspSchd_Srch01_CndR> mstRsltL = callInspSchdService(cndL);

			String sublotNo = null;

			MCIndexKey idxkey = mstRsltL.createIndex(InspSchd_Srch01_CndR.$peg_no);
			for (MrktJudg_Chk01_RsltR rsltR : up0()) {

				MAM_ITM_R itmR = getItmR(rsltR.itm_cd(), rsltR.itm_sub1(),
						rsltR.itm_sub2(), rsltR.itm_sub3());
				if (!isNull(itmR)) {
					rsltR.mrkt_judg_flg(itmR.mrkt_judg_flg());
					rsltR.base_unit_cd(itmR.unit_cd());
				}
				// 有効期限
				if (isNull(rsltR.vld_dt())) {
					if (isNull(itmR)
							|| MAC_SUBLOT_MNG_TYP.isNOT_MNG(itmR.sublot_mng_typ())
							|| MAC_SUBLOT_MNG_TYP.isSTK(itmR.sublot_mng_typ())) {
						sublotNo = MAC_STR.NULL_VAL.value();
					}
					else {
						sublotNo = nvl(rsltR.sublot_no(), MAC_STR.NULL_VAL.value());
					}

					MST_LOT_R lotR = getLotR(rsltR.itm_cd(), rsltR.itm_sub1(),
							rsltR.itm_sub2(), rsltR.itm_sub3(), rsltR.lot_no(), sublotNo);
					if (!isNull(lotR)) {
						rsltR.vld_dt(lotR.vld_dt());
					}
				}

				InspSchd_Srch01_CndR cndR = mstRsltL.getFirst(idxkey, rsltR.peg_no());
				if (!isNull(cndR)) {
					// 市場出荷判定対象外ＦＬＧ
					rsltR.no_mrkt_judg_flg(cndR.no_mrkt_judg_flg());
				}
			}
		}

		/**
		 * 工場・物流倉庫ＣＤをせっていする。
		 */
		protected void setSite() {
			for (MrktJudg_Chk01_RsltR upR : up0()) {
				if (isNull(upR.site_cd()) && !isNull(upR.loc_cd())) {
					MAM_LOC_R locR = getLocR(upR.loc_cd());
					upR.site_cd(locR.site_cd());
				}
			}
		}

		/**
		 * 更新対象の市場出荷判定状況区分を補完する。
		 */
		protected void setMrktJudgStsTyp() {
			MCList<MST_MRKT_JUDG_R> selectL = MCList.create(MST_MRKT_JUDG_R.class);
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MST_MRKT_JUDG_R.create("T"));
			dbSelectKey("MSBFL5110_MST_MRKT_JUDG_S02", selectL, selectL_bldr, up0());
			MCIndexKey idxkey = selectL.createIndex(MST_MRKT_JUDG_R.$mrkt_judg_no);
			for (MrktJudg_Chk01_RsltR upR : up0()) {
				if (MAC_DATA_CRUD_TYP.isUPD(upR.data_crud_typ())) {
					MST_MRKT_JUDG_R selectR = selectL.getFirst(idxkey,
							upR.mrkt_judg_no());
					upR.mrkt_judg_sts_typ(selectR.mrkt_judg_sts_typ());
				}
			}
		}

		/**
		 * 検査予定登録サービスの品管関連マスタ取得の検索条件を設定する。
		 * 
		 * @return 検索条件
		 */
		protected MCList<InspSchd_Srch01_CndR> crtInspSchdSrch01Cnd() {
			MCList<InspSchd_Srch01_CndR> cndL = MCList.create(InspSchd_Srch01_CndR.class);

			MCList<MST_PLNT_APRV_D_R> plntAprvDL = selPlntAprvDL(
					up0().subList(MrktJudg_Chk01_RsltR.$mrkt_judg_src_typ,
							MSC_MRKT_JUDG_SRC_TYP.PLNT_APRV.value()));

			for (MrktJudg_Chk01_RsltR upR : up0()) {
				InspSchd_Srch01_CndR cndR = InspSchd_Srch01_CndR.create();

				copy(cndR, upR, createMap_InspSchd_Srch01_CndR_MrktJudg_Chk01_RsltR());
				// 販売場所入荷 または 商品仕入直送の場合、受入検査とする
				if (MSC_MRKT_JUDG_SRC_TYP.isSLS_LOC_ARR(upR.mrkt_judg_src_typ())
						|| MSC_MRKT_JUDG_SRC_TYP.isDDLV(upR.mrkt_judg_src_typ())) {
					cndR.insp_typ(MSC_INSP_TYP.ACCPT.value());
					cndR.sppl_cd(upR.sppl_cd());
					cndR.maker_cd(upR.maker_cd());
				}
				// 工場出荷承認
				else if (MSC_MRKT_JUDG_SRC_TYP.isPLNT_APRV(upR.mrkt_judg_src_typ())) {
					MST_PLNT_APRV_D_R plntAprvDR = plntAprvDL.getFirst(
							MST_PLNT_APRV_D_R.$plnt_aprv_d_no,
							nvl(upR.mrkt_judg_src_no(), upR.mrkt_judg_src_no_del()));
					if (!isNull(plntAprvDR)) {
						cndR.insp_typ(plntAprvDR.insp_typ());
						cndR.mfg_loc_cd(plntAprvDR.getStringNE("MFG_LOC_CD"));
						cndR.sppl_cd(plntAprvDR.getStringNE("SPPL_CD"));
						cndR.maker_cd(plntAprvDR.getStringNE("MAKER_CD"));
						cndR.from_site_cd(plntAprvDR.getStringNE("FROM_SITE_CD"));
					}
				}
				cndL.add(cndR);
			}

			return cndL;
		}

		/**
		 * 上り電文の項目を補完する。
		 * 
		 * @param downL 検査予定登録サービスの品管関連マスタ取得の検索結果
		 */
		protected void editUpL(MCList<InspSchd_Srch01_CndR> mstRsltL) {
			MCIndexKey idxkey = mstRsltL.createIndex(InspSchd_Srch01_CndR.$peg_no);
			for (MrktJudg_Chk01_RsltR upR : up0()) {
				InspSchd_Srch01_CndR cndR = mstRsltL.getFirst(idxkey, upR.peg_no());
				if (isNull(cndR)) {
					continue;
				}
				// 市場出荷判定対象ＦＬＧ
				upR.mrkt_judg_flg(cndR.mrkt_judg_flg());
				// 市場出荷判定対象外ＦＬＧ
				upR.no_mrkt_judg_flg(cndR.no_mrkt_judg_flg());
			}
		}

		/**
		 * 市場出荷判定対象のリストを抽出する。
		 * 
		 * @return 市場出荷判定対象のリスト
		 */
		protected MCList<MrktJudg_Chk01_RsltR> getMrktJudgL(
				MCList<MrktJudg_Chk01_RsltR> subL) {
			MCList<MrktJudg_Chk01_RsltR> retL = MCList.create(MrktJudg_Chk01_RsltR.class);
			MCList<MrktJudg_Chk01_RsltR> upL = subL.clone();

			// 品目ＣＤでソートして、処理を行う。
			// 市場出荷判定明細は画面に表示しないデータのため、リスト内の順序を変更しても問題ない
			upL.sort(MrktJudg_Chk01_RsltR.$itm_cd, MrktJudg_Chk01_RsltR.$itm_sub1,
					MrktJudg_Chk01_RsltR.$itm_sub2, MrktJudg_Chk01_RsltR.$itm_sub3);

			for (MrktJudg_Chk01_RsltR upR : upL) {
				// 市場出荷判定作成元ＮＯ（削除用）が設定されており、かつ、品目がNULLの場合は処理対象に含める。
				if (!isNull(upR.mrkt_judg_src_no_del()) && isNull(upR.itm_cd())) {

					retL.add(upR);
				}

				// 承認対象品 かつ ロット管理対象品
				if (isAprvItm(upR) && isLotItm(upR)) {
					retL.add(upR);
				}
			}

			return retL;
		}

		/**
		 * 承認対象品目かを判定する。
		 * @param chkR チェックレコード
		 * @return true:承認対象品
		 *         false:承認対象品でない
		 */
		protected boolean isAprvItm(MrktJudg_Chk01_RsltR chkR) {
			if (chkR.mrkt_judg_flg() && !chkR.no_mrkt_judg_flg()) {
				if (MSC_MRKT_JUDG_SRC_TYP.isSLS_LOC_ARR(chkR.mrkt_judg_src_typ())) {
					if (isSlsLoc(chkR.loc_cd())) return true;
				}
				else {
					return true;
				}
			}

			return false;
		}

		/**
		 * ロット管理対象品かを判定する。
		 * 
		 * @param chkR チェックレコード
		 * @return true:ロット管理対象品
		 *         false:ロット管理対象品でない
		 */
		protected boolean isLotItm(MrktJudg_Chk01_RsltR chkR) {
			MAM_ITM_R itmR = getItmR(chkR.itm_cd(), chkR.itm_sub1(), chkR.itm_sub2(),
					chkR.itm_sub3());

			return (!isNull(itmR) && MAC_LOT_MNG_TYP.req_lot(itmR.lot_mng_typ()));
		}

		/**
		 * 販売場所であるかを返す
		 */
		protected boolean isSlsLoc(String locCd) {
			MAM_LOC_R locR = getLocR(locCd);
			return MAC_LOC_MNG_TYP.isSLS(locR.loc_mng_typ());
		}

		/**
		 * 市場出荷判定明細の新規登録用リスト、削除用リストを作成
		 * @param rsltL
		 */
		protected void crtMrktJudgDL(MCList<MrktJudg_Chk01_RsltR> rsltL) {
			MCList<MrktJudg_Chk01_RsltR> chkDL = MCList
					.create(MrktJudg_Chk01_RsltR.class);

			for (MrktJudg_Chk01_RsltR r : rsltL) {
				if (!isNull(r.mrkt_judg_src_no()) && isNull(r.mrkt_judg_src_no_del())) {
					_insDL.add(setMrktJudgDR(r));
				}
				else {
					chkDL.add(r);
				}
			}

			// 市場出荷判定明細削除用リスト作成
			chkDtl(chkDL);
		}

		/**
		 * 市場出荷判定明細を取得・ロック
		 */
		protected void chkDtl(MCList<MrktJudg_Chk01_RsltR> chkDL) {

			if (chkDL.isEmpty()) {
				return;
			}

			chkDL.sort(MrktJudg_Chk01_RsltR.$mrkt_judg_src_no_del);
			String delNo = null;

			for (MrktJudg_Chk01_RsltR chkDR : chkDL) {
				if (!isSame(delNo, chkDR.mrkt_judg_src_no_del())) {
					if (!isNull(chkDR.itm_cd())) {
						_insDL.add(setMrktJudgDR(chkDR));
					}

					//市場出荷判定明細では、市場出荷判定作成元区分、市場出荷判定作成元ＮＯを元にロックする。
					MCList<MST_MRKT_JUDG_D_R> dL = MCList.create(MST_MRKT_JUDG_D_R.class);
					MST_MRKT_JUDG_D_R t = MST_MRKT_JUDG_D_R.create("T");
					MCQueryApiBuilder dL_bldr = MCQueryApiBuilder.create(t);
					dL_bldr.setSelect(t.mrkt_judg_d_no);
					dL_bldr.addSelect(t.mrkt_judg_no);
					dL_bldr.addSelect(t.itm_cd);
					dL_bldr.addSelect(t.itm_sub1);
					dL_bldr.addSelect(t.itm_sub2);
					dL_bldr.addSelect(t.itm_sub3);
					dL_bldr.addSelect(t.lot_no);
					dL_bldr.addSelect(t.sublot_no);
					dL_bldr.setWhere(t.mrkt_judg_src_no.eq(bind("1")),
							chkDR.mrkt_judg_src_no_del());
					dL_bldr.addWhereWithAnd(t.mrkt_judg_src_typ.eq(bind("1")),
							chkDR.mrkt_judg_src_typ());
					dbSelectForUpdate("MSBFL5110_MST_MRKT_JUDG_D_S03", dL, dL_bldr);

					_delDL.addAll(dL);
				}

				delNo = chkDR.mrkt_judg_src_no_del();
			}
		}

		/**
		 * 市場出荷判定ヘッダの新規登録用リスト、更新用リスト、削除用リストを作成
		 */
		protected void crtMrktJudgHL(MCList<MrktJudg_Chk01_RsltR> upL) {

			MCList<MST_MRKT_JUDG_D_R> tmpL = MCList.create(MST_MRKT_JUDG_D_R.class);

			tmpL.setAll(_insDL);
			tmpL.addAll(_delDL);

			MCGroupByPolicy gp = new MCGroupByPolicy(getItmLotCols());
			MCList<MST_MRKT_JUDG_D_R> itmLotL = tmpL.groupBy(gp);

			// 既存の市場出荷判定明細の取得
			MCList<MST_MRKT_JUDG_D_R> mrktJudgDL = getMrktJudgDL(itmLotL);

			// 既存の市場出荷判定ヘッダの取得
			MCList<MST_MRKT_JUDG_R> mrktJudgHL = getMrktJudgHL(itmLotL);

			// 市場出荷判定明細の登録、削除リストを洗い出す
			editMrktJudgDL(mrktJudgDL);

			// 市場出荷判定ヘッダの登録、更新、削除リストを洗い出す
			editMrktJudgHL(mrktJudgHL, mrktJudgDL, itmLotL, upL);
		}

		protected String[] getItmLotVals(MST_MRKT_JUDG_R mrktJudgR) {
			String[] itmLotVals = new String[] {
					mrktJudgR.itm_cd(), mrktJudgR.itm_sub1(), mrktJudgR.itm_sub2(),
					mrktJudgR.itm_sub3(), mrktJudgR.lot_no()
			};

			return itmLotVals;
		}

		protected String[] getItmLotVals(MST_MRKT_JUDG_D_R mrktJudgDR) {
			String[] itmLotVals = new String[] {
					mrktJudgDR.itm_cd(), mrktJudgDR.itm_sub1(), mrktJudgDR.itm_sub2(),
					mrktJudgDR.itm_sub3(), mrktJudgDR.lot_no()
			};

			return itmLotVals;
		}

		/**
		 * 新規登録、削除を行う品目、枝番１～３、ロットＮＯを保持する市場出荷判定明細のリストを取得する
		 * @return 新規登録対象の品目、枝番１～３、ロットＮＯを保持する市場出荷判定明細の全リスト
		 */
		protected MCList<MST_MRKT_JUDG_D_R> getMrktJudgDL(
				MCList<MST_MRKT_JUDG_D_R> itmLotL) {
			MCList<MST_MRKT_JUDG_D_R> retL = MCList.create(MST_MRKT_JUDG_D_R.class);

			for (MST_MRKT_JUDG_D_R r : itmLotL) {
				MCList<MST_MRKT_JUDG_D_R> newDL = MCList.create(MST_MRKT_JUDG_D_R.class);
				MST_MRKT_JUDG_D_R t = MST_MRKT_JUDG_D_R.create("T");
				MCQueryApiBuilder newDL_bldr = MCQueryApiBuilder.create(t);
				newDL_bldr.setSelect(t.mrkt_judg_d_no);
				newDL_bldr.addSelect(t.itm_cd);
				newDL_bldr.addSelect(t.itm_sub1);
				newDL_bldr.addSelect(t.itm_sub2);
				newDL_bldr.addSelect(t.itm_sub3);
				newDL_bldr.addSelect(t.lot_no);
				newDL_bldr.addSelect(t.base_unit_qty);
				newDL_bldr.addSelect(t.vld_dt);
				newDL_bldr.addSelect(t.mrkt_judg_src_typ);
				newDL_bldr.addSelect(t.mrkt_judg_src_no);

				newDL_bldr.setWhere(t.itm_cd.eq(bind("1")), r.itm_cd());
				newDL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("1")), r.itm_sub1());
				newDL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("1")), r.itm_sub2());
				newDL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("1")), r.itm_sub3());
				newDL_bldr.addWhereWithAnd(t.lot_no.eq(bind("1")), r.lot_no());

				dbSelectForUpdate("MSBFL5110_MST_MRKT_JUDG_D_S04", newDL, newDL_bldr);
				if (!newDL.isEmpty()) {
					retL.addAll(newDL);
				}
			}

			return retL;
		}

		/**
		 * 新規登録を行う品目、枝番１～３、ロットＮＯを保持する市場出荷判定ヘッダのリストを取得する
		 * @return 新規登録対象の品目、枝番１～３、ロットＮＯを保持する市場出荷判定ヘッダの全リスト
		 */
		protected MCList<MST_MRKT_JUDG_R> getMrktJudgHL(
				MCList<MST_MRKT_JUDG_D_R> itmLotL) {
			MCList<MST_MRKT_JUDG_R> retL = MCList.create(MST_MRKT_JUDG_R.class);

			for (MST_MRKT_JUDG_D_R r : itmLotL) {

				MST_MRKT_JUDG_R newHR = MST_MRKT_JUDG_R.create();
				MST_MRKT_JUDG_R t = MST_MRKT_JUDG_R.create("T");
				MCQueryApiBuilder newHR_bldr = MCQueryApiBuilder.create(t);

				newHR_bldr.setWhere(t.itm_cd.eq(bind("1")), r.itm_cd());
				newHR_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("1")), r.itm_sub1());
				newHR_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("1")), r.itm_sub2());
				newHR_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("1")), r.itm_sub3());
				newHR_bldr.addWhereWithAnd(t.lot_no.eq(bind("1")), r.lot_no());

				dbSelectForUpdate("MSBFL5110_MST_MRKT_JUDG_S03", newHR, newHR_bldr);

				if (!newHR.isEmpty()) {
					retL.add(newHR);
				}
			}

			return retL;
		}

		/**
		 * 加工した市場出荷判定明細を元に、市場出荷判定ヘッダの新規登録用リスト、更新用リスト、削除用リストを作成する。<br>
		 * ・加工後の明細リストに存在し、かつ、市場出荷判定ヘッダのリストに存在しない品目、ロットＮＯの場合は、
		 * 新規登録用リストに格納する。<br>
		 * ・加工後の明細リストに存在し、かつ、市場出荷判定ヘッダのリストに存在する品目、ロットＮＯの場合は、
		 * 更新用リストに格納する。<br>
		 * ・加工後の明細リストに存在しない、かつ、市場出荷判定ヘッダのリストに存在しない品目、ロットＮＯの場合は、
		 * 削除用リストに格納する。<br>
		 * 
		 * @param mrktJudgHL 既存の市場出荷判定ヘッダ（ＤＢ）
		 * @param mrktJudgDL 既存の市場出荷判定明細（ＤＢ）
		 * @param itmLotL 上り電文
		 * 
		 */
		protected void editMrktJudgHL(MCList<MST_MRKT_JUDG_R> mrktJudgHL,
				MCList<MST_MRKT_JUDG_D_R> mrktJudgDL, MCList<MST_MRKT_JUDG_D_R> itmLotL,
				MCList<MrktJudg_Chk01_RsltR> upL) {

			MCIndexKey mrktJudgIdx = mrktJudgHL.createIndex(getItmLotCols());
			MCIndexKey mrktJudgDIdx = mrktJudgDL.createIndex(getItmLotCols());

			// 削除用のリストを作成する
			for (MST_MRKT_JUDG_R mrktJudgHR : mrktJudgHL) {
				String[] itmLotVals = getItmLotVals(mrktJudgHR);
				MST_MRKT_JUDG_D_R dR = mrktJudgDL.getFirst(mrktJudgDIdx, itmLotVals);

				if (isNull(dR)) {
					if (MSC_MRKT_JUDG_STS_TYP.isOPN(mrktJudgHR.mrkt_judg_sts_typ())) {
						_delHL.add(mrktJudgHR);
					}
				}
			}

			MCIndexKey delKey = _delHL.createIndex(MST_MRKT_JUDG_R.$mrkt_judg_no);
			MCIndexKey insKey = _insDL.createIndex(getItmLotCols());
			MCIndexKey upIdx = upL.createIndex(MrktJudg_Chk01_RsltR.$itm_cd,
					MrktJudg_Chk01_RsltR.$itm_sub1, MrktJudg_Chk01_RsltR.$itm_sub2,
					MrktJudg_Chk01_RsltR.$itm_sub3, MrktJudg_Chk01_RsltR.$lot_no);

			// 新規登録用、更新用のリストを作成する
			for (MST_MRKT_JUDG_D_R itmLotR : itmLotL) {
				String[] itmLotVals = getItmLotVals(itmLotR);
				MST_MRKT_JUDG_R hdrR = mrktJudgHL.getFirst(mrktJudgIdx, itmLotVals);
				MST_MRKT_JUDG_D_R insDR = _insDL.getFirst(insKey, itmLotVals);

				if (isNull(hdrR)) {
					MST_MRKT_JUDG_R addR = MST_MRKT_JUDG_R.create();
					addR.itm_cd(itmLotR.itm_cd());
					addR.itm_sub1(itmLotR.itm_sub1());
					addR.itm_sub2(itmLotR.itm_sub2());
					addR.itm_sub3(itmLotR.itm_sub3());
					addR.lot_no(itmLotR.lot_no());

					if (!isNull(insDR)) {
						addR.site_cd(insDR.getStringNE(MST_MRKT_JUDG_R.$site_cd));
					}
					if (isNull(addR.site_cd())) {
						addR.site_cd(MAC_STR.NULL_VAL.value());
					}

					MrktJudg_Chk01_RsltR upR = upL.getFirst(upIdx, addR.itm_cd(),
							addR.itm_sub1(), addR.itm_sub2(), addR.itm_sub3(),
							addR.lot_no());
					if (!isNull(upR)) {
						addR.upd_dt(upR.upd_dt());
					}

					_insHL.add(addR);
				}
				else {
					//削除対象のリストに含まれている場合は除外
					MST_MRKT_JUDG_R delR = _delHL.getFirst(delKey, hdrR.mrkt_judg_no());
					if (!isNull(delR)) {
						continue;
					}

					_updHL.add(hdrR);
				}
			}

			//データベース更新用のリストを編集する
			setInsHL(mrktJudgDL);
			setInsDL();
			setUpdHL(mrktJudgDL, upL, upIdx);
		}

		/**
		 * 市場出荷判定明細リストを、削除および新規登録した後の状態にする。
		 * 
		 * @param mrktJudgDL
		 */
		protected void editMrktJudgDL(MCList<MST_MRKT_JUDG_D_R> mrktJudgDL) {
			MCList<MST_MRKT_JUDG_D_R> tmpDL = MCList.create(MST_MRKT_JUDG_D_R.class);

			//市場出荷判定明細から削除するリストを除く
			MCIndexKey delDKey = _delDL.createIndex(MST_MRKT_JUDG_D_R.$mrkt_judg_d_no);
			for (MST_MRKT_JUDG_D_R r : mrktJudgDL) {
				MST_MRKT_JUDG_D_R delDR = _delDL.getFirst(delDKey, r.mrkt_judg_d_no());
				if (isNull(delDR)) {
					tmpDL.add(r);
				}
			}

			//市場出荷判定明細に新規登録するリストを追加
			tmpDL.addAll(_insDL);

			mrktJudgDL.setAll(tmpDL);
		}

		/**
		 * 市場出荷判定ヘッダの新規登録用リストを編集する
		 * 
		 * @param mrktJudgDL
		 */
		protected void setInsHL(MCList<MST_MRKT_JUDG_D_R> mrktJudgDL) {
			if (_insHL.isEmpty()) {
				return;
			}

			MCIndexKey relDecDIdx = mrktJudgDL.createIndex(getItmLotCols());
			for (MST_MRKT_JUDG_R insR : _insHL) {
				MCList<MST_MRKT_JUDG_D_R> insDSubL = mrktJudgDL.subList(relDecDIdx,
						getItmLotVals(insR));

				MCNumber unitQty = MCNumber.ZERO;
				MCDate vldDt = insDSubL.get(0).vld_dt();
				String maxMrktJudgSrcNo = null;

				//数量、使用期限を算出
				for (MST_MRKT_JUDG_D_R insDSubR : insDSubL) {

					if (isSame(getSysParm("PLNT_APRV_LATEST_QTY_FLG"), "1") && MSC_MRKT_JUDG_SRC_TYP.isPLNT_APRV(insDSubR.mrkt_judg_src_typ())) {
						if (isNull(maxMrktJudgSrcNo) || insDSubR.mrkt_judg_src_no().compareTo(maxMrktJudgSrcNo) > 0) {
							unitQty = insDSubR.base_unit_qty();
							maxMrktJudgSrcNo = insDSubR.mrkt_judg_src_no();
						}
					}
					else {
						unitQty = unitQty.add(insDSubR.base_unit_qty());
					}

					//使用期限が最小となる日付を取得
					if (!isNull(vldDt)) {
						if (vldDt.gt(insDSubR.vld_dt())) {
							vldDt = insDSubR.vld_dt();
						}
					}
				}

				insR.mrkt_judg_no(getStrSeq(MSC_NUM_SYS_TYP.MRKTJUDG));
				insR.mrkt_judg_sts_typ(MSC_MRKT_JUDG_STS_TYP.OPN.value());
				insR.base_unit_qty(unitQty);
				insR.base_unit_cd(insDSubL.get(0).base_unit_cd());
				insR.vld_dt(vldDt);
				insR.seq(MCNumber.ONE);
				insR.add_flg(false);
			}
		}

		/**
		 * 市場出荷判定ヘッダの更新用リストを編集する
		 * @param mrktJudgDL
		 */
		protected void setUpdHL(MCList<MST_MRKT_JUDG_D_R> mrktJudgDL,
				MCList<MrktJudg_Chk01_RsltR> upL, MCIndexKey upIdx) {
			if (_updHL.isEmpty()) {
				return;
			}

			MCList<MST_MRKT_JUDG_R> updL = MCList.create(MST_MRKT_JUDG_R.class);
			MCIndexKey relDecDIdx = mrktJudgDL.createIndex(getItmLotCols());

			for (MST_MRKT_JUDG_R updR : _updHL) {

				//市場出荷判定状況が出荷許可、出荷禁止の場合は更新対象から除外
				if (MSC_MRKT_JUDG_STS_TYP.isACPT(updR.mrkt_judg_sts_typ())
						|| MSC_MRKT_JUDG_STS_TYP.isNOT_ACPT(updR.mrkt_judg_sts_typ())) {
					continue;
				}

				MCList<MST_MRKT_JUDG_D_R> insDSubL = mrktJudgDL.subList(relDecDIdx,
						getItmLotVals(updR));

				MCNumber plntAprvQty = MCNumber.ZERO;
				MCNumber unitQty = MCNumber.ZERO;
				MCDate vldDt = updR.vld_dt();
				String maxMrktJudgSrcNo = null;

				//数量、使用期限を算出
				for (MST_MRKT_JUDG_D_R insDSubR : insDSubL) {

					if (MSC_MRKT_JUDG_SRC_TYP.isPLNT_APRV(insDSubR.mrkt_judg_src_typ())) {
						//作成元が工場出荷承認
						if (isSame(getSysParm("PLNT_APRV_LATEST_QTY_FLG"), "1")) {
							if (isNull(maxMrktJudgSrcNo) || insDSubR.mrkt_judg_src_no().compareTo(maxMrktJudgSrcNo) > 0) {
								plntAprvQty = insDSubR.base_unit_qty();
								maxMrktJudgSrcNo = insDSubR.mrkt_judg_src_no();
							}
						}
						else {
							plntAprvQty = plntAprvQty.add(insDSubR.base_unit_qty());
						}
					}
					else {
						unitQty = unitQty.add(insDSubR.base_unit_qty());
					}

					//使用期限が最小となる日付を取得
					if (!isNull(vldDt)) {
						if (vldDt.gt(insDSubR.vld_dt())) {
							vldDt = insDSubR.vld_dt();
						}
					}
				}

				if (plntAprvQty.gte(unitQty)) {
					updR.base_unit_qty(plntAprvQty);
				}
				else {
					updR.base_unit_qty(unitQty);
				}
				updR.vld_dt(vldDt);
				updR.add_flg(false);

				MrktJudg_Chk01_RsltR upR = upL.getFirst(upIdx, updR.itm_cd(),
						updR.itm_sub1(), updR.itm_sub2(), updR.itm_sub3(), updR.lot_no());
				if (!isNull(upR)) {
					updR.upd_dt(upR.upd_dt());
				}

				if (updR.mrkt_judg_prnt_flg()) {
					updR.seq(updR.seq().add(MCNumber.ONE));
				}
				updR.mrkt_judg_prnt_flg(false);
				updR.mrkt_judg_prnt_tm(null);

				updL.add(updR);
			}

			_updHL.setAll(updL);
			_updHL_bldr.setSet(_updHL_t.base_unit_qty);
			_updHL_bldr.addSet(_updHL_t.vld_dt);
			_updHL_bldr.addSet(_updHL_t.upd_dt);
			_updHL_bldr.addSet(_updHL_t.add_flg);
			_updHL_bldr.addSet(_updHL_t.mrkt_judg_prnt_flg);
			_updHL_bldr.addSet(_updHL_t.mrkt_judg_prnt_tm);
			_updHL_bldr.addSet(_updHL_t.seq);
		}

		/**
		 * 登録用市場出荷判定明細を設定する。
		 */
		protected void setInsDL() {
			if (_insDL.isEmpty()) {
				return;
			}

			// 市場出荷判定明細ＮＯを発番
			doSeqCache(MSC_NUM_SYS_TYP.MRKTJUDGD, _insDL.size());

			MCIndexKey insHKey = _insHL.createIndex(getItmLotCols());
			MCIndexKey updHKey = _updHL.createIndex(getItmLotCols());

			for (MST_MRKT_JUDG_D_R iR : _insDL) {
				String[] itmLotVals = getItmLotVals(iR);
				MST_MRKT_JUDG_R hdrR = _insHL.getFirst(insHKey, itmLotVals);

				if (isNull(hdrR)) {
					hdrR = _updHL.getFirst(updHKey, itmLotVals);
				}

				iR.mrkt_judg_d_no(getStrSeq(MSC_NUM_SYS_TYP.MRKTJUDGD));
				iR.mrkt_judg_no(hdrR.mrkt_judg_no());
			}
		}

		/**
		 * 市場出荷判定明細を作成する。
		 * @param rsltR 
		 * @return 市場出荷判定明細レコード
		 */
		protected MST_MRKT_JUDG_D_R setMrktJudgDR(MrktJudg_Chk01_RsltR rsltR) {
			MST_MRKT_JUDG_D_R retR = MST_MRKT_JUDG_D_R.create();

			retR.mrkt_judg_no(rsltR.mrkt_judg_no());
			retR.itm_cd(rsltR.itm_cd());
			retR.itm_sub1(rsltR.itm_sub1());
			retR.itm_sub2(rsltR.itm_sub2());
			retR.itm_sub3(rsltR.itm_sub3());
			retR.lot_no(nvl(rsltR.lot_no(), MAC_STR.NULL_VAL.value()));
			retR.sublot_no(nvl(rsltR.sublot_no(), MAC_STR.NULL_VAL.value()));
			retR.base_unit_qty(rsltR.base_unit_qty());
			retR.base_unit_cd(rsltR.base_unit_cd());
			retR.mrkt_judg_src_typ(rsltR.mrkt_judg_src_typ());
			retR.mrkt_judg_src_no(rsltR.mrkt_judg_src_no());
			retR.vld_dt(rsltR.vld_dt());
			retR.addStringColumn(MrktJudg_Chk01_RsltR.$site_cd, rsltR.site_cd());

			return retR;
		}

		/**
		 * 品目マスタコンテナを取得する。
		 * 
		 * @param itmCd 品目ＣＤ
		 * @param itmSub1 枝番１
		 * @param itmSub2 枝番２
		 * @param itmSub3 枝番３
		 * @return 品目マスタコンテナ
		 */
		protected MAM_ITM_R getItmR(String itmCd, String itmSub1, String itmSub2,
				String itmSub3) {
			return getItmCache().get(itmCd, itmSub1, itmSub2, itmSub3);
		}

		/**
		 * 品目マスタコンテナを取得する。
		 * 
		 * @return 品目マスタコンテナ
		 */
		protected FXUCL_MCDbcCache<MAM_ITM_R> getItmCache() {
			if (_cacheItmL == null) {
				MCList<MAM_ITM_R> bindL = MCList.create(MAM_ITM_R.class);
				for (MrktJudg_Chk01_RsltR upR : up0()) {
					MAM_ITM_R bindR = MAM_ITM_R.create();
					bindR.itm_cd(upR.itm_cd());
					bindR.itm_sub1(upR.itm_sub1());
					bindR.itm_sub2(upR.itm_sub2());
					bindR.itm_sub3(upR.itm_sub3());
					bindL.add(bindR);
				}
				createItmCache(bindL);
			}

			return _cacheItmL;
		}

		/**
		 * 品目マスタコンテナキャッシュを初期化する。
		 * 
		 * @param bindL キャッシュ条件
		 */
		protected void createItmCache(MCList<MAM_ITM_R> bindL) {
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.lot_mng_typ);
			dbc_bldr.addSelect(t.sublot_mng_typ);
			dbc_bldr.addSelect(t.unit_cd);
			dbc_bldr.addSelect(t.mrkt_judg_flg);
			dbc_bldr.addSelect(t.mrkt_judg_upd_role_cd);
			dbc_bldr.addSelect(t.mrkt_judg_role_cd);
			_cacheItmL = new FXUCL_MCDbcCache<MAM_ITM_R>(dbc_bldr, bindL, MAM_ITM_R.$itm_cd,
					MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
		}

		/**
		 * 品目マスタコンテナを取得する。
		 * 
		 * @param itmCd 品目ＣＤ
		 * @param itmSub1 枝番１
		 * @param itmSub2 枝番２
		 * @param itmSub3 枝番３
		 * @return 品目マスタコンテナ
		 */
		protected MAM_LOC_R getLocR(String locCd) {
			return getLocCache().get(locCd);
		}

		/**
		 * 品目マスタコンテナを取得する。
		 * 
		 * @return 品目マスタコンテナ
		 */
		protected FXUCL_MCDbcCache<MAM_LOC_R> getLocCache() {
			if (_cacheLocL == null) {
				MCList<MAM_LOC_R> bindL = MCList.create(MAM_LOC_R.class);
				for (MrktJudg_Chk01_RsltR upR : up0()) {
					MAM_LOC_R bindR = MAM_LOC_R.create();
					bindR.loc_cd(upR.loc_cd());
					bindL.add(bindR);
				}
				createLocCache(bindL);
			}

			return _cacheLocL;
		}

		/**
		 * 品目マスタコンテナキャッシュを初期化する。
		 * 
		 * @param bindL キャッシュ条件
		 */
		protected void createLocCache(MCList<MAM_LOC_R> bindL) {
			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.site_cd);
			dbc_bldr.addSelect(t.loc_mng_typ);
			_cacheLocL = new FXUCL_MCDbcCache<MAM_LOC_R>(dbc_bldr, bindL, MAM_LOC_R.$loc_cd);
		}

		/**
		 * ロット管理情報コンテナを取得する。
		 * 
		 * @param itmCd 品目ＣＤ
		 * @param itmSub1 枝番１
		 * @param itmSub2 枝番２
		 * @param itmSub3 枝番３
		 * @param lotNo ロットＮＯ
		 * @param sublotNo サブロットＮＯ
		 * @return ロット管理情報コンテナ
		 */
		protected MST_LOT_R getLotR(String itmCd, String itmSub1, String itmSub2,
				String itmSub3, String lotNo, String sublotNo) {
			if (_cacheLotL == null) {
				MCList<MST_LOT_R> bindL = MCList.create(MST_LOT_R.class);
				for (MrktJudg_Chk01_RsltR upR : up0()) {
					if (MAC_DATA_CRUD_TYP.isDEL(upR.data_crud_typ())
							|| !isNull(upR.mrkt_judg_src_no_del())) {
						continue;
					}
					MST_LOT_R bindR = MST_LOT_R.create();
					bindR.itm_cd(upR.itm_cd());
					bindR.itm_sub1(upR.itm_sub1());
					bindR.itm_sub2(upR.itm_sub2());
					bindR.itm_sub3(upR.itm_sub3());
					bindR.lot_no(upR.lot_no());
					bindR.sublot_no(upR.sublot_no());
					bindL.add(bindR);
				}
				createLotCache(bindL);
			}

			MST_LOT_R retR = _cacheLotL.get(itmCd, itmSub1, itmSub2, itmSub3, lotNo,
					sublotNo);
			if (retR == null) {
				retR = MST_LOT_R.create();
			}

			return retR;
		}

		/**
		 * ロット管理情報コンテナキャッシュを初期化する。
		 */
		protected void createLotCache(MCList<MST_LOT_R> bindL) {
			MST_LOT_R t = MST_LOT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.vld_dt);
			_cacheLotL = new FXUCL_MCDbcCache<MST_LOT_R>(dbc_bldr, bindL, MST_LOT_R.$itm_cd,
					MST_LOT_R.$itm_sub1, MST_LOT_R.$itm_sub2, MST_LOT_R.$itm_sub3,
					MST_LOT_R.$lot_no, MST_LOT_R.$sublot_no);
		}

		protected Map_InspSchd_Srch01_CndR_MrktJudg_Chk01_RsltR<InspSchd_Srch01_CndR, MrktJudg_Chk01_RsltR> createMap_InspSchd_Srch01_CndR_MrktJudg_Chk01_RsltR() {
			return new Map_InspSchd_Srch01_CndR_MrktJudg_Chk01_RsltR<InspSchd_Srch01_CndR, MrktJudg_Chk01_RsltR>();
		}

		public class Map_InspSchd_Srch01_CndR_MrktJudg_Chk01_RsltR<D extends InspSchd_Srch01_CndR, S extends MrktJudg_Chk01_RsltR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspSchd_Srch01_CndR.$peg_no,
						MrktJudg_Chk01_RsltR.$peg_no);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_cd,
						MrktJudg_Chk01_RsltR.$itm_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub1,
						MrktJudg_Chk01_RsltR.$itm_sub1);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub2,
						MrktJudg_Chk01_RsltR.$itm_sub2);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub3,
						MrktJudg_Chk01_RsltR.$itm_sub3);
				addColumnPathMap(InspSchd_Srch01_CndR.$no_mrkt_judg_flg,
						MrktJudg_Chk01_RsltR.$no_mrkt_judg_flg);
				addColumnPathMap(InspSchd_Srch01_CndR.$mrkt_judg_flg,
						MrktJudg_Chk01_RsltR.$mrkt_judg_flg);
				addColumnPathMap(InspSchd_Srch01_CndR.$to_site_cd,
						MrktJudg_Chk01_RsltR.$site_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$base_dt,
						MrktJudg_Chk01_RsltR.$upd_dt);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				dest.no_insp_srch_flg(true);
			}
		}
	}

	/**
	 * 検査予定登録サービスの品管関連マスタ取得を呼び出す。
	 * @param cndL 上り電文
	 * @return 品管関連マスタ情報
	 */
	protected MCList<InspSchd_Srch01_CndR> callInspSchdService(
			MCList<InspSchd_Srch01_CndR> cndL) {

		MSBFL_InspSchdService.InspSchd_Srch01 srch01 = MSBFL_InspSchdService
				.crtInspSchd_Srch01();
		srch01.up0().setAll(cndL);
		;
		srch01.exec();

		return srch01.down0();
	}

	/**
	 * 工場出荷承認明細から検査種別区分を取得する。
	 * @param subL
	 * @return
	 */
	protected MCList<MST_PLNT_APRV_D_R> selPlntAprvDL(MCList<MrktJudg_Chk01_RsltR> subL) {
		MCList<MST_PLNT_APRV_D_R> selectL = MCList.create(MST_PLNT_APRV_D_R.class);
		MCList<MST_PLNT_APRV_D_R> bindList = MCList.create(MST_PLNT_APRV_D_R.class);

		if (subL.isEmpty()) {
			return selectL;
		}

		for (MrktJudg_Chk01_RsltR r : subL) {
			MST_PLNT_APRV_D_R bindR = MST_PLNT_APRV_D_R.create();
			bindR.plnt_aprv_d_no(nvl(r.mrkt_judg_src_no(), r.mrkt_judg_src_no_del()));
			bindList.add(bindR);
		}

		MST_PLNT_APRV_D_R t1 = MST_PLNT_APRV_D_R.create("T1");
		MST_INSP_INST_R t2 = MST_INSP_INST_R.create("T2");
		MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t1);

		selectL_bldr.setDistinct();
		selectL_bldr.setSelect(t1.plnt_aprv_d_no);
		selectL_bldr.addSelect(t1.insp_typ);
		selectL_bldr.addSelect(t2.mfg_loc_cd);
		selectL_bldr.addSelect(t2.sppl_cd);
		selectL_bldr.addSelect(t2.maker_cd);
		selectL_bldr.addSelect(t2.from_site_cd);
		selectL_bldr.addLeftOuterJoin(t2, t1.insp_no.eq(t2.insp_no));
		dbSelectKey("MSBFL5110_MST_PLNT_APRV_D_S01", selectL, selectL_bldr, bindList);

		return selectL;
	}

	/**
	 * 市場出荷判定ヘッダ情報取得のキーを作成する。
	 * 
	 * @return
	 */
	protected String[] getItmLotCols() {
		String[] itmLotCols = new String[] {
				MST_MRKT_JUDG_D_R.$itm_cd, MST_MRKT_JUDG_D_R.$itm_sub1,
				MST_MRKT_JUDG_D_R.$itm_sub2, MST_MRKT_JUDG_D_R.$itm_sub3,
				MST_MRKT_JUDG_D_R.$lot_no
		};

		return itmLotCols;
	}

	// mapping
	protected Map_MST_MRKT_JUDG_R_MrktJudg_Chk02_RsltR<MST_MRKT_JUDG_R, MrktJudg_Chk02_RsltR> createMap_MST_MRKT_JUDG_R_MrktJudg_Chk02_RsltR() {
		return new Map_MST_MRKT_JUDG_R_MrktJudg_Chk02_RsltR<MST_MRKT_JUDG_R, MrktJudg_Chk02_RsltR>();
	}

	public class Map_MST_MRKT_JUDG_R_MrktJudg_Chk02_RsltR<D extends MST_MRKT_JUDG_R, S extends MrktJudg_Chk02_RsltR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_MRKT_JUDG_R.$itm_cd, MrktJudg_Chk02_RsltR.$itm_cd);
			addColumnPathMap(MST_MRKT_JUDG_R.$itm_sub1, MrktJudg_Chk02_RsltR.$itm_sub1);
			addColumnPathMap(MST_MRKT_JUDG_R.$itm_sub2, MrktJudg_Chk02_RsltR.$itm_sub2);
			addColumnPathMap(MST_MRKT_JUDG_R.$itm_sub3, MrktJudg_Chk02_RsltR.$itm_sub3);
			addColumnPathMap(MST_MRKT_JUDG_R.$lot_no, MrktJudg_Chk02_RsltR.$lot_no);

		}
	}

	protected Map_MST_MRKT_JUDG_R_MrktJudg_Chk01_RsltR<MST_MRKT_JUDG_R, MrktJudg_Chk01_RsltR> createMap_MST_MRKT_JUDG_R_MrktJudg_Chk01_RsltR() {
		return new Map_MST_MRKT_JUDG_R_MrktJudg_Chk01_RsltR<MST_MRKT_JUDG_R, MrktJudg_Chk01_RsltR>();
	}

	public class Map_MST_MRKT_JUDG_R_MrktJudg_Chk01_RsltR<D extends MST_MRKT_JUDG_R, S extends MrktJudg_Chk01_RsltR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_MRKT_JUDG_R.$mrkt_judg_no,
					MrktJudg_Chk01_RsltR.$mrkt_judg_no);
			addColumnPathMap(MST_MRKT_JUDG_R.$mrkt_judg_sts_typ,
					MrktJudg_Chk01_RsltR.$mrkt_judg_sts_typ);
			addColumnPathMap(MST_MRKT_JUDG_R.$mfg_so_aprv_typ,
					MrktJudg_Chk01_RsltR.$mfg_so_aprv_typ);
			addColumnPathMap(MST_MRKT_JUDG_R.$quality_mng_typ,
					MrktJudg_Chk01_RsltR.$quality_mng_typ);
			addColumnPathMap(MST_MRKT_JUDG_R.$mfg_mng_typ,
					MrktJudg_Chk01_RsltR.$mfg_mng_typ);
			addColumnPathMap(MST_MRKT_JUDG_R.$deviant_typ,
					MrktJudg_Chk01_RsltR.$deviant_typ);
			addColumnPathMap(MST_MRKT_JUDG_R.$deviant_msr_typ,
					MrktJudg_Chk01_RsltR.$deviant_msr_typ);
			addColumnPathMap(MST_MRKT_JUDG_R.$prod_itm_info_typ,
					MrktJudg_Chk01_RsltR.$prod_itm_info_typ);
			addColumnPathMap(MST_MRKT_JUDG_R.$chd_itm_info_typ,
					MrktJudg_Chk01_RsltR.$chd_itm_info_typ);
			addColumnPathMap(MST_MRKT_JUDG_R.$upd_dt, MrktJudg_Chk01_RsltR.$upd_dt);
			addColumnPathMap(MST_MRKT_JUDG_R.$upd_usr_cd,
					MrktJudg_Chk01_RsltR.$upd_usr_cd);
			addColumnPathMap(MST_MRKT_JUDG_R.$upd_dpt_cd,
					MrktJudg_Chk01_RsltR.$upd_dpt_cd);
			addColumnPathMap(MST_MRKT_JUDG_R.$itm_cd, MrktJudg_Chk01_RsltR.$itm_cd);
			addColumnPathMap(MST_MRKT_JUDG_R.$itm_sub1, MrktJudg_Chk01_RsltR.$itm_sub1);
			addColumnPathMap(MST_MRKT_JUDG_R.$itm_sub2, MrktJudg_Chk01_RsltR.$itm_sub2);
			addColumnPathMap(MST_MRKT_JUDG_R.$itm_sub3, MrktJudg_Chk01_RsltR.$itm_sub3);
			addColumnPathMap(MST_MRKT_JUDG_R.$lot_no, MrktJudg_Chk01_RsltR.$lot_no);
			addColumnPathMap(MST_MRKT_JUDG_R.$vld_dt, MrktJudg_Chk01_RsltR.$vld_dt);
			addColumnPathMap(MST_MRKT_JUDG_R.$site_cd, MrktJudg_Chk01_RsltR.$site_cd);
			addColumnPathMap(MST_MRKT_JUDG_R.$base_unit_qty,
					MrktJudg_Chk01_RsltR.$base_unit_qty);
			addColumnPathMap(MST_MRKT_JUDG_R.$base_unit_cd,
					MrktJudg_Chk01_RsltR.$base_unit_cd);
			addColumnPathMap(MST_MRKT_JUDG_R.$add_flg, MrktJudg_Chk01_RsltR.$add_flg);
			addColumnPathMap(MST_MRKT_JUDG_R.$no_del_flg,
					MrktJudg_Chk01_RsltR.$no_del_flg);
			addColumnPathMap(MST_MRKT_JUDG_R.$intr_rmrks,
					MrktJudg_Chk01_RsltR.$intr_rmrks);
			addColumnPathMap(MST_MRKT_JUDG_R.$sub_char1, MrktJudg_Chk01_RsltR.$sub_char1);
			addColumnPathMap(MST_MRKT_JUDG_R.$sub_char2, MrktJudg_Chk01_RsltR.$sub_char2);
			addColumnPathMap(MST_MRKT_JUDG_R.$sub_char3, MrktJudg_Chk01_RsltR.$sub_char3);
		}
	}

	/**
	 * MrktJudg_Chk03オペレーション.<p>
	 *
	 * 指定されたロットが仕入直送売上可能かチェックする。<br>
	 */
	public class MrktJudg_Chk03 extends MSBFL_MrktJudgService_MC_A.MrktJudg_Chk03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 医薬・プロセスオプションがオフの場合は何もしない。
			if (!isSame(getSysParm("MFG_APRV_ENABLE_FLG"), "1")) {
				return;
			}

			MCMessageList msgL = new MCMessageList();

			// データ補完
			compMrktJudgData();

			// チェック処理
			msgL.addAll(checkMain());

			MCMessagePool.addAll(msgL);

			// 下り電文設定
			setDown();
		}

		// 品目マスタコンテナキャッシュ
		protected FXUCL_MCDbcCache<MAM_ITM_R> _cacheItmL;

		/**
		 * 品目マスタコンテナを取得する。
		 * 
		 * @param itmCd 品目ＣＤ
		 * @param itmSub1 枝番１
		 * @param itmSub2 枝番２
		 * @param itmSub3 枝番３
		 * @return 品目マスタコンテナ
		 */
		protected MAM_ITM_R getItmR(String itmCd, String itmSub1, String itmSub2,
				String itmSub3) {
			return getItmCache().get(itmCd, itmSub1, itmSub2, itmSub3);
		}

		/**
		 * 品目マスタコンテナを取得する。
		 * 
		 * @return 品目マスタコンテナ
		 */
		protected FXUCL_MCDbcCache<MAM_ITM_R> getItmCache() {
			if (_cacheItmL == null) {
				MCList<MAM_ITM_R> bindL = MCList.create(MAM_ITM_R.class);
				for (MrktJudg_Chk03_RsltR upR : up0()) {
					MAM_ITM_R bindR = MAM_ITM_R.create();
					bindR.itm_cd(upR.itm_cd());
					bindR.itm_sub1(upR.itm_sub1());
					bindR.itm_sub2(upR.itm_sub2());
					bindR.itm_sub3(upR.itm_sub3());
					bindL.add(bindR);
				}
				createItmCache(bindL);
			}

			return _cacheItmL;
		}

		/**
		 * 品目マスタコンテナキャッシュを初期化する。
		 * 
		 * @param bindL キャッシュ条件
		 */
		protected void createItmCache(MCList<MAM_ITM_R> bindL) {
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.lot_mng_typ);
			dbc_bldr.addSelect(t.sublot_mng_typ);
			dbc_bldr.addSelect(t.unit_cd);
			dbc_bldr.addSelect(t.mrkt_judg_flg);
			dbc_bldr.addSelect(t.mrkt_judg_upd_role_cd);
			dbc_bldr.addSelect(t.mrkt_judg_role_cd);
			_cacheItmL = new FXUCL_MCDbcCache<MAM_ITM_R>(dbc_bldr, bindL, MAM_ITM_R.$itm_cd,
					MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * データ補完処理
		 */
		protected void compMrktJudgData() {

			MCList<InspSchd_Srch01_CndR> cndL = MCList.create(InspSchd_Srch01_CndR.class);
			addAll(cndL, up0(), createMap_InspSchd_Srch01_CndR_MrktJudg_Chk03_RsltR());
			MCList<InspSchd_Srch01_CndR> mstRsltL = callInspSchdService(cndL);

			editUpL(mstRsltL);
		}

		protected void editUpL(MCList<InspSchd_Srch01_CndR> mstRsltL) {
			MCIndexKey idx = mstRsltL.createIndex(InspSchd_Srch01_CndR.$peg_no);
			for (MrktJudg_Chk03_RsltR upR : up0()) {
				MAM_ITM_R itmR = getItmR(upR.itm_cd(), upR.itm_sub1(), upR.itm_sub2(),
						upR.itm_sub3());

				upR.mrkt_judg_flg(itmR.mrkt_judg_flg());
				if (!mstRsltL.isEmpty()) {
					InspSchd_Srch01_CndR cndR = mstRsltL.getFirst(idx, upR.peg_no());
					if (!isNull(cndR)) upR.no_mrkt_judg_flg(cndR.no_mrkt_judg_flg());
				}
			}
		}

		protected MCMessageList checkMain() {
			MCMessageList msgL = new MCMessageList();

			MCList<MrktJudg_Chk03_RsltR> chkL = up0().subList(r -> isAprvItm(r));
			if (chkL.isEmpty()) {
				return msgL;
			}

			MCList<MrktJudg_Chk03_RsltR> chkMainL = MCList
					.create(MrktJudg_Chk03_RsltR.class);
			for (MrktJudg_Chk03_RsltR r : chkL) {
				if (isNull(r.lot_no())) {
					msgL.add(
							new MCMessage(
									r, null, MSBFL0038, toDispItm(r.itm_cd(),
											r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
									toDispGUIIndex(r)));
					r.err_flg(true);
				}
				else {
					chkMainL.add(r);
				}
			}

			if (chkMainL.isEmpty()) {
				return msgL;
			}

			MCList<MST_LOT_R> dbL = MCList.create(MST_LOT_R.class);
			MST_LOT_R t = MST_LOT_R.create("T");
			MCQueryApiBuilder dbL_bldr = MCQueryApiBuilder.create(t);

			dbL_bldr.setSelect(t.mrkt_judg_sts_typ);
			dbL_bldr.addSelect(t.itm_cd);
			dbL_bldr.addSelect(t.itm_sub1);
			dbL_bldr.addSelect(t.itm_sub2);
			dbL_bldr.addSelect(t.itm_sub3);
			dbL_bldr.addSelect(t.lot_no);
			dbL_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
			dbL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			dbL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			dbL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			dbL_bldr.addWhereWithAnd(t.lot_no.eq(bind("lot_no")));
			dbL_bldr.addOrderByDesc(t.lot_seq);
			dbSelect("MSBFL5110_MST_LOT_S02", dbL, dbL_bldr, chkMainL);

			MCIndexKey idx = dbL.createIndex(getItmLotCols());

			for (MrktJudg_Chk03_RsltR r : chkMainL) {
				MST_LOT_R lotR = dbL.getFirst(idx, new String[] {
						r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.lot_no()
				});

				if (!isNull(lotR) && !isNull(lotR.mrkt_judg_sts_typ())) {
					if (MSC_MRKT_JUDG_STS_TYP.isOPN(lotR.mrkt_judg_sts_typ())
							|| MSC_MRKT_JUDG_STS_TYP
									.isNOT_ACPT(lotR.mrkt_judg_sts_typ())) {
						msgL.add(new MCMessage(r, null, MSBFL0009,
								lotR.mrkt_judg_sts_typ(), toDispItm(r.itm_cd(),
										r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
								r.lot_no(), toDispGUIIndex(r)));
						r.err_flg(true);
					}
				}
			}

			return msgL;
		}

		/**
		 * 承認対象品目かを判定する。
		 * @param chkR チェックレコード
		 * @return true:承認対象品
		 *         false:承認対象品でない
		 */
		protected boolean isAprvItm(MrktJudg_Chk03_RsltR chkR) {
			if (chkR.mrkt_judg_flg() && !chkR.no_mrkt_judg_flg()) {
				return true;
			}

			return false;
		}

		protected Map_InspSchd_Srch01_CndR_MrktJudg_Chk03_RsltR<InspSchd_Srch01_CndR, MrktJudg_Chk03_RsltR> createMap_InspSchd_Srch01_CndR_MrktJudg_Chk03_RsltR() {
			return new Map_InspSchd_Srch01_CndR_MrktJudg_Chk03_RsltR<InspSchd_Srch01_CndR, MrktJudg_Chk03_RsltR>();
		}

		public class Map_InspSchd_Srch01_CndR_MrktJudg_Chk03_RsltR<D extends InspSchd_Srch01_CndR, S extends MrktJudg_Chk03_RsltR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspSchd_Srch01_CndR.$peg_no,
						MrktJudg_Chk03_RsltR.$peg_no);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_cd,
						MrktJudg_Chk03_RsltR.$itm_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub1,
						MrktJudg_Chk03_RsltR.$itm_sub1);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub2,
						MrktJudg_Chk03_RsltR.$itm_sub2);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub3,
						MrktJudg_Chk03_RsltR.$itm_sub3);
				addColumnPathMap(InspSchd_Srch01_CndR.$base_dt,
						MrktJudg_Chk03_RsltR.$base_dt);
				addColumnPathMap(InspSchd_Srch01_CndR.$sppl_cd,
						MrktJudg_Chk03_RsltR.$sppl_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$maker_cd,
						MrktJudg_Chk03_RsltR.$maker_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$to_loc_cd,
						MrktJudg_Chk03_RsltR.$loc_cd);
			}
		}

		protected Map_MST_MRKT_JUDG_R_MrktJudg_Chk03_RsltR<MST_MRKT_JUDG_R, MrktJudg_Chk03_RsltR> createMap_MST_MRKT_JUDG_R_MrktJudg_Chk03_RsltR() {
			return new Map_MST_MRKT_JUDG_R_MrktJudg_Chk03_RsltR<MST_MRKT_JUDG_R, MrktJudg_Chk03_RsltR>();
		}

		public class Map_MST_MRKT_JUDG_R_MrktJudg_Chk03_RsltR<D extends MST_MRKT_JUDG_R, S extends MrktJudg_Chk03_RsltR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_MRKT_JUDG_R.$itm_cd, MrktJudg_Chk03_RsltR.$itm_cd);
				addColumnPathMap(MST_MRKT_JUDG_R.$itm_sub1,
						MrktJudg_Chk03_RsltR.$itm_sub1);
				addColumnPathMap(MST_MRKT_JUDG_R.$itm_sub2,
						MrktJudg_Chk03_RsltR.$itm_sub2);
				addColumnPathMap(MST_MRKT_JUDG_R.$itm_sub3,
						MrktJudg_Chk03_RsltR.$itm_sub3);
				addColumnPathMap(MST_MRKT_JUDG_R.$lot_no, MrktJudg_Chk03_RsltR.$lot_no);

			}
		}
	}

	//FMCB CUSTOM END
}