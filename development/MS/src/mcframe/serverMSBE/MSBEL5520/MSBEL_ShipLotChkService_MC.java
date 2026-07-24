package mcframe.serverMSBE.MSBEL5520;

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
import mcframe.serverMS.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBE.MSBEL5520.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.commonCore.notice.Core_Msg.FCBCC0110;
import static mcframe.commonCore.notice.Core_Msg.FCBCC0136;
import mcframe.serverCore.mcjdbc.MCDBTransaction;
import mcframe.serverCore.mcjdbc.MCTransactionManager;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_Cache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.createDBTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_ShipLotChkService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_ShipLotChkService_MC extends MSBEL_ShipLotChkService_MC_A{
	//FMCB CUSTOM START

	/**
	 * ShipLotChk_Chk01オペレーション.<p>
	 *
	 * 出荷対象のロットがマスタで定義する有効期限日数を満たしているかチェックする。<br>
	 */
	public class ShipLotChk_Chk01 extends MSBEL_ShipLotChkService_MC_A.ShipLotChk_Chk01 {

		/**
		 * 有効期限チェック、およびロット逆転チェックのメッセージを格納
		 */
		protected MCMessageList _msgL = new MCMessageList();
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {

			// 初期処理
			doInit();

			// メイン処理
			chkValidDt();
			chkLotBackStop();
			setDown();
		}

		/**
		 * 初期処理を実行する
		 */
		protected void doInit() {
			doDataCache(up0());
			doLotCache(up0());
			doShipValidCtlCache(up0());
		}

		/**
		 * 下り電文に結果を設定する
		 */
		protected void setDown() {
			down0().setAll(up0());
			if (!_msgL.isEmpty()) {
				MCMessagePool.addAll(_msgL);
			}
		}

		/**
		 * 有効期限制御チェック
		 */
		protected void chkValidDt() {
			for (ShipLot_DtlR r : up0()){
				chkValidDt(r);
			}
		}

		/**
		 * 有効期限制御チェック
		 * 
		 * @param dtlR	出荷ロット情報
		 */
		protected void chkValidDt(ShipLot_DtlR r) {

			if (isNull(r.ship_valid_grp_cd())
				|| isNullOrNullVal(r.lot_no())) {
				return;
			}

			// ロット管理情報.有効期限
			MSVT_LOT_LIST_R lotR = getLotR(r);
			if (lotR.isEmpty()) {
				_msgL.add(new MCMessage(r, null, MSBEL0009, 
						toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
						r.lot_no(), r.sublot_no()));
				r.err_flg(true);
				return;
			}
			else if (isNull(lotR.vld_dt())) {
				_msgL.add(new MCMessage(r, null, MSBEL0010,
						toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
						r.lot_no(), r.sublot_no()));
				r.err_flg(true);
				return;
			}

			// 「出荷対象のロットの有効期限≧ 納品予定日（納品日）＋出荷保証期限制御マスタ.保証期限日数」を満たさない場合はエラー
			MCDate validDt = getShipValidDt(r);
			if (!isNull(validDt) && !lotR.vld_dt().gte(validDt)) {
				_msgL.add(new MCMessage(r, null, MSBEL0012,
						r.cst_cd(), r.dlv_cd(), r.ship_valid_grp_cd(), toYMDString(r.base_dt()),
						toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
						r.lot_no(), r.sublot_no(), toYMDString(lotR.vld_dt()), toYMDString(validDt)));
				r.err_flg(true);
				return;
			}
		}

		/**
		 * ロット逆転チェック
		 * 
		 * @param msgL
		 */
		protected void chkLotBackStop() {
			// 出荷ロットに対する有効期限下限、上限を取得
			setValidDtFrTo();

			// チェック対象を抽出
			MCList<ShipLot_DtlR> tgtL = MCList.create(ShipLot_DtlR.class);
			for (ShipLot_DtlR r : up0()) {
				if (r.err_flg()
					|| !isLotBackStop(r)
					|| isNullOrNullVal(r.lot_no())) {
					continue;
				}
				tgtL.add(r);

				MSVT_LOT_LIST_R lotR = getLotR(r);
				if (!isNull(lotR)) {
					r.valid_dt(lotR.vld_dt());
				}
			}
			for (MCList<ShipLot_DtlR> lst : tgtL.groupList(ShipLot_DtlR.$valid_dt_fr_grp)) {
				lst.sort(ShipLot_DtlR.$base_dt, ShipLot_DtlR.$valid_dt);

				ShipLot_DtlR bfrR = null;
				for (ShipLot_DtlR r : lst) {
					chkLotBackStop(r, bfrR);
					bfrR = r;
				}
			}
		}

		/**
		 * ロット逆転チェック
		 */
		protected void chkLotBackStop(ShipLot_DtlR r, ShipLot_DtlR bfrR) {

			if (r.err_flg()
				|| !isLotBackStop(r)
				|| isNullOrNullVal(r.lot_no())) {
				return;
			}

			MSVT_LOT_LIST_R lotR = getLotR(r);
			if (lotR.isEmpty()) {
				_msgL.add(new MCMessage(r, null, MSBEL0009, 
						toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
						r.lot_no(), r.sublot_no()));
				r.err_flg(true);
				return;
			}
			else if (isNull(lotR.vld_dt())) {
				_msgL.add(new MCMessage(r, null, MSBEL0011,
						toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
						r.lot_no(), r.sublot_no()));
				r.err_flg(true);
				return;
			}
			else if (lotR.vld_dt().lt(r.valid_dt_fr()) || lotR.vld_dt().gt(r.valid_dt_to())) {
				String msgId =
					(isNullOr(r.valid_dt_fr(), r.valid_dt_to()) || r.valid_dt_fr().lte(r.valid_dt_to())) ?
						MSBEL0013 : MSBEL0342;
				_msgL.add(new MCMessage(r, null, msgId,
						r.cst_cd(), r.getString("chk_dlv_cd"), toYMDString(r.base_dt()),
						toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
						r.lot_no(), r.sublot_no(), toYMDString(lotR.vld_dt()),
						toYMDString(r.valid_dt_fr()), toYMDString(r.valid_dt_to())));
				r.err_flg(true);
				return;
			}
			else if (!isNull(bfrR) && r.base_dt().gt(bfrR.base_dt())) {
				// チェック対象のリスト内で逆転していないかチェック
				MSVT_LOT_LIST_R bfrLotR = getLotR(bfrR);
				if (lotR.vld_dt().lt(bfrLotR.vld_dt())) {
					_msgL.add(new MCMessage(r, null, MSBEL0013,
							r.cst_cd(), r.getString("chk_dlv_cd"), toYMDString(r.base_dt()),
							toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
							r.lot_no(), r.sublot_no(), toYMDString(lotR.vld_dt()),
							toYMDString(bfrLotR.vld_dt()), null));
					r.err_flg(true);
				}
			}
		}

		/**
		 * 出荷ロットに対応する有効期限の下限、上限を取得する
		 */
		protected void setValidDtFrTo() {

			MSBEL_ShipLotChkService.ShipLotChk_Srch01 o = MSBEL_ShipLotChkService.crtShipLotChk_Srch01();
			o.up0().setAll(up0());
			o.up0().setBoolean(ShipLot_DtlR.$lock_flg, true);		// ロット逆転チェックをするので全件ロックする
			o.exec();

			MCIndexKey idx = o.down0().createIndex(ShipLot_DtlR.$peg_no);
			for (ShipLot_DtlR r : up0()) {
				ShipLot_DtlR dR = o.down0().getFirst(idx, r.peg_no());
				if (!isNull(dR)) {	// dRがnull→逆転禁止がオフ、または逆転可、ようはチェック対象外
					r.valid_dt_fr(dR.valid_dt_fr());
					r.valid_dt_to(dR.valid_dt_to());
					r.valid_dt_fr_grp(dR.valid_dt_fr_grp());
					r.err_flg(dR.err_flg());
					r.setStringNE("chk_dlv_cd", r.dlv_cd());	// 逆転区分が「得意先」の場合はNULL文字
				}
			}
		}
	}

	/**
	 * ShipLotChk_Srch01オペレーション.<p>
	 *
	 * 出荷済みのロットから最小・最大の有効期限を取得する。<br>
	 */
	public class ShipLotChk_Srch01 extends MSBEL_ShipLotChkService_MC_A.ShipLotChk_Srch01 {

		/**
		 * 有効期限取得時のグループキー
		 */
		protected final String[] _vldKey = {
			ShipLot_DtlR.$cst_cd, ShipLot_DtlR.$dlv_cd,
			ShipLot_DtlR.$itm_cd, ShipLot_DtlR.$itm_sub1, ShipLot_DtlR.$itm_sub2, ShipLot_DtlR.$itm_sub3
		};

		/**
		 * ロット逆転チェック対象のリスト
		 */
		protected MCList<ShipLot_DtlR> _dtlL = null;
		/**
		 * ロット逆転チェック対象のリストのインデックスキー
		 */
		protected MCIndexKey _dtlIdxKey = null;
		/**
		 * 除外対象の出荷引当状況リスト.
		 */
		protected MCList<MST_SHIP_ALLOC_STS_R> _exShipAllocStsL = null;
		/**
		 * 除外対象の出荷実績明細リスト.
		 */
		protected MCList<MST_SHIP_ACT_D_R> _exShipActDL = null;
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {

			// 初期処理
			doInit();
			
			// メイン処理
			setLotBackStopL();
			lock();
			setValidDtFr();
			setValidDtTo();
			setValidDtFrG();
			setDown();
		}

		/**
		 * 初期処理を実行する
		 */
		protected void doInit() {
			doDataCache(up0());
			doShipValidCtlCache(up0());
			initShipLotL(up0());
		}

		/**
		 * ロット逆転チェック対象のリストを設定する
		 */
		protected void setLotBackStopL() {
			_dtlL = getLotBackStopL(up0());
		}

		/**
		 * 出荷ロットに対する排他ロックを行う
		 */
		protected void lock() {
			lockShipLotEx(_dtlL);

			// 排他ロックエラーは対象外
			MCList<ShipLot_DtlR> errL = _dtlL.subList(ShipLot_DtlR.$err_flg, true);
			if (!errL.isEmpty()) {
				_dtlL.removeAll(errL);
			}
			_dtlIdxKey = _dtlL.createIndex(ShipLot_DtlR.$base_dt);
			crtShipAllocStsL();
			crtShipActDL();
		}

		/**
		 * 除外対象の出荷引当状況リストを作成
		 */
		protected void crtShipAllocStsL() {
			MCList<ShipLot_DtlR> exL = _dtlL.createInstance();
			for (ShipLot_DtlR r : _dtlL) {
				if (isNull(r.slo_d_no()) && isNull(r.ship_schd_no())
						&& isNull(r.dlv_inst_rcpt_no()) && isNull(r.ship_inst_d_no())) {
					continue;
				}
				exL.add(r);
			}

			MCList<MST_SHIP_ALLOC_STS_R> stsL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			MST_SHIP_ALLOC_STS_R t = MST_SHIP_ALLOC_STS_R.create("T");
			MST_SHIP_SCHD_R t1 = MST_SHIP_SCHD_R.create("T1");
			MST_SHIP_PR_R t2 = MST_SHIP_PR_R.create("T2");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			if (!exL.isEmpty()) {
				bldr.addLeftOuterJoin(t1, bracket(t.ship_schd_no.eq(t1.ship_schd_no)));
				bldr.addLeftOuterJoin(t2, bracket(t1.ship_pr_no.eq(t2.ship_pr_no)));
				bldr.addWhereWithCutOffAnd(t.ship_inst_d_no.eq(bind("ship_inst_d_no")));
				bldr.addWhereWithCutOffAnd(t.ship_schd_no.eq(bind("ship_schd_no")));
				bldr.addWhereWithCutOffAnd(t1.dlv_inst_rcpt_no.eq(bind("dlv_inst_rcpt_no")));
				bldr.addWhereWithCutOffAnd(t2.slo_d_no.eq(bind("slo_d_no")));
				dbSelect("MSBEL5520_MST_SHIP_ALLOC_STS_S01", stsL, bldr, exL);
			}
			_exShipAllocStsL = stsL;
			MCQueryApiBuilder bldr2 = MCQueryApiBuilder.create(MST_SHIP_ALLOC_STS_R.create("T"));
			dbWkInsert("MSBEL5520_MSW_SHIP_ALLOC_STS_I01", _exShipAllocStsL, bldr2.getBaseDbc());
		}

		/**
		 * 除外対象の出荷実績明細リストを作成
		 */
		protected void crtShipActDL() {
			_exShipActDL = MCList.create(MST_SHIP_ACT_D_R.class);
			for (ShipLot_DtlR r : _dtlL) {
				if (isNull(r.ship_act_d_no())) {
					continue;
				}
				MST_SHIP_ACT_D_R actDR = MST_SHIP_ACT_D_R.create();
				actDR.ship_act_d_no(r.ship_act_d_no());
				_exShipActDL.add(actDR);
			}
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(MST_SHIP_ACT_D_R.create("T"));
			dbWkInsert("MSBEL5520_MSW_SHIP_ACT_D_I01", _exShipActDL, bldr.getBaseDbc());
		}

		/**
		 * 下り電文に結果を設定する
		 */
		protected void setDown() {
			down0().setAll(up0());
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(MST_SHIP_ALLOC_STS_R.create("T"));
			dbWkDelete("MSBEL5520_MSW_SHIP_ALLOC_STS_D01", bldr.getBaseDbc());
			MCQueryApiBuilder bldr2 = MCQueryApiBuilder.create(MST_SHIP_ACT_D_R.create("T"));
			dbWkDelete("MSBEL5520_MSW_SHIP_ACT_D_D01", bldr2.getBaseDbc());
		}

		/**
		 * 出荷ロットに対応する有効期限の下限を取得する
		 */
		protected void setValidDtFr() {

			MCList<ShipLot_DtlR>[] grpLArray = up0().groupList(ShipLot_DtlR.$base_dt);
			for (MCList<ShipLot_DtlR> grpL : grpLArray) {
				ShipLot_DtlR grpR = grpL.get(0);
				MCList<ShipLot_DtlR> tgtL = _dtlL.subList(_dtlIdxKey, grpR.base_dt());
				MCList<MST_SHIP_LOT_R> lotL = MCList.create(MST_SHIP_LOT_R.class);
				MST_SHIP_LOT_R t = MST_SHIP_LOT_R.create("T");
				MCQueryApiBuilder lotL_bldr = MCQueryApiBuilder.create(t);
				lotL_bldr.setWhere(t.cst_cd.eq(bind("cst_cd")));
				lotL_bldr.addWhereWithAnd(t.dlv_cd.eq(bind("dlv_cd")));
				lotL_bldr.addWhereWithAnd(t.itm_cd.eq(bind("itm_cd")));
				lotL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
				lotL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
				lotL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
				lotL_bldr.addWhereWithAnd(t.base_dt.lt(bind("1")), grpR.base_dt());
				lotL_bldr.setGroupBy(t.cst_cd, t.dlv_cd, t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3);
				lotL_bldr.addGroupFunc(max(t.valid_dt), "valid_dt");
				if (!_exShipAllocStsL.isEmpty()) {
					MSW_SHIP_ALLOC_STS_KEY_R t1 = MSW_SHIP_ALLOC_STS_KEY_R.create("T1");
					lotL_bldr.addLeftOuterJoin(t1, t.ship_alloc_sts_no.eq(t1.ship_alloc_sts_no));
					lotL_bldr.addWhereWithAnd(t1.ship_alloc_sts_no.isNull());
				}
				if (!_exShipActDL.isEmpty()) {
					MSW_SHIP_ACT_D_KEY_R t2 = MSW_SHIP_ACT_D_KEY_R.create("T2");
					lotL_bldr.addLeftOuterJoin(t2, t.ship_act_d_no.eq(t2.ship_act_d_no));
					lotL_bldr.addWhereWithAnd(t2.ship_act_d_no.isNull());
				}
				dbSelect("MSBEL5520_MST_SHIP_LOT_S01", lotL, lotL_bldr, tgtL);
				MCIndexKey idx = lotL.createIndex(MST_SHIP_LOT_R.$cst_cd, MST_SHIP_LOT_R.$dlv_cd, MST_SHIP_LOT_R.$itm_cd, MST_SHIP_LOT_R.$itm_sub1, MST_SHIP_LOT_R.$itm_sub2, MST_SHIP_LOT_R.$itm_sub3);

				// 有効期限日数による有効期限は、ロット逆転対象外も対象とするので、up0()でループ
				for (ShipLot_DtlR r : grpL) {

					// 出荷有効期限制御マスタの有効期限日数を加味した有効期限
					ShipLot_DtlR wkR = r.clone();
					wkR.dlv_cd(r.getString("org_dlv_cd"));
					r.valid_dt_fr(getShipValidDt(wkR));

					// 有効期限日数を加味した有効期限と、出荷ロットのMAX(有効期限)の大きい方を採用する
					MST_SHIP_LOT_R lotR = lotL.getFirst(idx, r.toArray(idx.getKeys()));
					if (!isNull(lotR)
						&& (isNull(r.valid_dt_fr()) || lotR.valid_dt().gt(r.valid_dt_fr()))) {
						r.valid_dt_fr(lotR.valid_dt());
					}
				}
			}
		}

		/**
		 * 出荷ロットに対応する有効期限の上限を取得する
		 */
		protected void setValidDtTo() {

			MCList<ShipLot_DtlR>[] grpLArray = up0().groupList(ShipLot_DtlR.$base_dt);
			for (MCList<ShipLot_DtlR> grpL : grpLArray) {
				ShipLot_DtlR grpR = grpL.get(0);
				MCList<ShipLot_DtlR> tgtL = _dtlL.subList(_dtlIdxKey, grpR.base_dt());
				MCList<MST_SHIP_LOT_R> lotL = MCList.create(MST_SHIP_LOT_R.class);
				MST_SHIP_LOT_R t = MST_SHIP_LOT_R.create("T");
				MCQueryApiBuilder lotL_bldr = MCQueryApiBuilder.create(t);
				lotL_bldr.setWhere(t.cst_cd.eq(bind("cst_cd")));
				lotL_bldr.addWhereWithAnd(t.dlv_cd.eq(bind("dlv_cd")));
				lotL_bldr.addWhereWithAnd(t.itm_cd.eq(bind("itm_cd")));
				lotL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
				lotL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
				lotL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
				lotL_bldr.addWhereWithAnd(t.base_dt.gt(bind("1")), grpR.base_dt());
				lotL_bldr.setGroupBy(t.cst_cd, t.dlv_cd, t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3);
				lotL_bldr.addGroupFunc(min(t.base_dt), "base_dt");
				lotL_bldr.addGroupFunc(min(t.valid_dt), "valid_dt");
				if (!_exShipAllocStsL.isEmpty()) {
					MSW_SHIP_ALLOC_STS_KEY_R t1 = MSW_SHIP_ALLOC_STS_KEY_R.create("T1");
					lotL_bldr.addLeftOuterJoin(t1, t.ship_alloc_sts_no.eq(t1.ship_alloc_sts_no));
					lotL_bldr.addWhereWithAnd(t1.ship_alloc_sts_no.isNull());
				}
				if (!_exShipActDL.isEmpty()) {
					MSW_SHIP_ACT_D_KEY_R t2 = MSW_SHIP_ACT_D_KEY_R.create("T2");
					lotL_bldr.addLeftOuterJoin(t2, t.ship_act_d_no.eq(t2.ship_act_d_no));
					lotL_bldr.addWhereWithAnd(t2.ship_act_d_no.isNull());
				}
				dbSelect("MSBEL5520_MST_SHIP_LOT_S02", lotL, lotL_bldr, tgtL);
				MCIndexKey idx = lotL.createIndex(MST_SHIP_LOT_R.$cst_cd, MST_SHIP_LOT_R.$dlv_cd, MST_SHIP_LOT_R.$itm_cd, MST_SHIP_LOT_R.$itm_sub1, MST_SHIP_LOT_R.$itm_sub2, MST_SHIP_LOT_R.$itm_sub3);
	
				for (ShipLot_DtlR r : tgtL) {
					MCList<MST_SHIP_LOT_R> lotSubL = lotL.subList(idx, r.toArray(idx.getKeys()));
					MCDate tmpValidDtTo = (MCDate) lotSubL
							.subList(dbR -> !isNull(r.base_dt())
									&& dbR.base_dt().gt(r.base_dt()))
							.min(MST_SHIP_LOT_R.$valid_dt);
					if (!isNull(tmpValidDtTo)) {
						r.valid_dt_to(tmpValidDtTo);
					}
				}
			}
		}
		
		/**
		 * 有効期限(下限)継承Ｇを設定する
		 * 
		 * @param dtlL
		 */
		protected void setValidDtFrG() {
			int seq = 0;
			for (MCList<ShipLot_DtlR> lst : _dtlL.groupList(_vldKey)) {
				lst.setNumber(ShipLot_DtlR.$valid_dt_fr_grp, ++seq);
			}
		}
	}

	/**
	 * ShipLotChk_Upd01オペレーション.<p>
	 *
	 * 出荷ロットを登録・削除する。<br>
	 */
	public class ShipLotChk_Upd01 extends MSBEL_ShipLotChkService_MC_A.ShipLotChk_Upd01 {
		/**
		 * ロット逆転チェック対象のリスト
		 */
		protected MCList<ShipLot_DtlR> _dtlL = null;
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {

			// 初期処理
			doInit();

			// メイン処理
			setLotBackStopL();
			lock();
			delShipLot();
			insShipLot();
			setDown();
		}

		/**
		 * 初期処理を実行する
		 */
		protected void doInit() {
			doDataCache(up0());
			doLotCache(up0());
			initShipLotL(up0());
		}

		/**
		 * ロット逆転チェック対象のリストを設定する
		 */
		protected void setLotBackStopL() {
			_dtlL = getLotBackStopL(up0());
		}

		/**
		 * 出荷ロットに対する排他ロックを行う
		 */
		protected void lock() {
			lockShipLotEx(_dtlL);

			// 排他ロックエラーは対象外
			MCList<ShipLot_DtlR> errL = _dtlL.subList(ShipLot_DtlR.$err_flg, true);
			if (!errL.isEmpty()) {
				_dtlL.removeAll(errL);
			}
		}

		/**
		 * 下り電文に結果を設定する
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * 出荷ロットを削除する
		 */
		protected void delShipLot() {

			MCList<ShipLot_DtlR>
				delSchdL = MCList.create(ShipLot_DtlR.class),
				delActL = MCList.create(ShipLot_DtlR.class);

			for (ShipLot_DtlR r : _dtlL) {
				if (!isNull(r.org_ship_alloc_sts_no())) {
					delSchdL.add(r);
				}
				if (!isNull(r.org_ship_act_d_no())) {
					delActL.add(r);
				}
			}

			if (!delSchdL.isEmpty()) {
				MST_SHIP_LOT_R dbc1 = MST_SHIP_LOT_R.create("T1");
				execDbDelete("MSBEL5520_MST_SHIP_LOT_D01", dbc1, dbc1.ship_alloc_sts_no.eq(bind("org_ship_alloc_sts_no")), delSchdL);
			}
			if (!delActL.isEmpty()) {
				MST_SHIP_LOT_R dbc2 = MST_SHIP_LOT_R.create("T2");
				execDbDelete("MSBEL5520_MST_SHIP_LOT_D02", dbc2, dbc2.ship_act_d_no.eq(bind("org_ship_act_d_no")), delActL);
			}
		}

		/**
		 * 出荷ロットを登録する
		 */
		protected void insShipLot() {

			MCList<MST_SHIP_LOT_R>
				lotL = MCList.create(MST_SHIP_LOT_R.class);

			for (ShipLot_DtlR r : _dtlL) {
				if (isNullOrNullVal(r.lot_no())) {
					continue;
				}
				if (!isNull(r.ship_alloc_sts_no()) || !isNull(r.ship_act_d_no())) {
					MSVT_LOT_LIST_R lotR = getLotR(r);
					if (lotR.isEmpty()) {
						MCMessagePool.add(new MCMessage(r, null, MSBEL0009, 
								toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
								r.lot_no(), r.sublot_no()));
						r.err_flg(true);
						continue;
					}
					else if (isNull(lotR.vld_dt())) {
						// ロットの有効期限がクリアされた
						continue;
					}
					r.valid_dt(lotR.vld_dt());
					lotL.add(r.sl());
				}
			}
			dbInsert("MSBEL5520_MST_SHIP_LOT_I01", lotL, MCQueryApiBuilder.create(MST_SHIP_LOT_R.create("T")));
		}
	}

	/**
	 * 出荷ロットに対してチェック要否およびロット逆転区分の設定を反映する
	 * 
	 * @param dtlL
	 */
	protected void initShipLotL(MCList<ShipLot_DtlR> dtlL) {
		for (ShipLot_DtlR r : dtlL) { 
			MAM_BP_R bpR = getBpR(r);

			r.setStringNE("org_dlv_cd", r.dlv_cd());	// NULL文字加工前

			// 得意先に対してのみチェック
			if (MAC_LOT_BACK_STOP_TYP.isCST(bpR.lot_back_stop_typ())) {
				r.dlv_cd(MAC_STR.NULL_VAL.value());
			}
		}
	}

	/**
	 * ロット逆転禁止チェックの対象か
	 * 
	 * @param r
	 * @return
	 */
	protected boolean isLotBackStop(ShipLot_DtlR r) {
		// 逆転禁止がオン、かつ逆転禁止の場合がチェック対象
		return getItmR(r).ship_lot_back_stop_flg()
			&& (MAC_LOT_BACK_STOP_TYP.isCST(getBpR(r).lot_back_stop_typ())
				 || MAC_LOT_BACK_STOP_TYP.isDLV(getBpR(r).lot_back_stop_typ()));
	}

	/**
	 * ロット逆転チェック対象のリストを取得する
	 * 
	 * @param dtlL
	 * @return
	 */
	protected MCList<ShipLot_DtlR> getLotBackStopL(MCList<ShipLot_DtlR> dtlL) {
		MCList<ShipLot_DtlR> retL = dtlL.createInstance();
		for (ShipLot_DtlR r : dtlL) {
			if (isLotBackStop(r)) {
				retL.add(r);
			}
		}
		return retL;
	}


///// ロック関連

	/**
	 * ロック用のトランザクション
	 */
	protected MCDBTransaction _tran = null;

	/**
	 * ロックの単位
	 */
	protected final String[] _lockKey = {
			"cst_cd", "dlv_cd", "itm_cd", "itm_sub1", "itm_sub2", "itm_sub3"
	};

	/**
	 * 出荷ロット排他をロックする
	 * 
	 * @param dtlL	出荷ロット
	 */
	protected void lockShipLotEx(MCList<ShipLot_DtlR> dtlL) {

		// 排他対象のみ
		MCList<ShipLot_DtlR> lockL = dtlL.subList(ShipLot_DtlR.$lock_flg, true);

		try {
			lock(lockL);
		}
		finally {
			unlock();
		}
	}

	/**
	 * ロック用トランザクションを取得する
	 * 
	 * @return	ロック用トランザクション
	 */
	protected MCDBTransaction getLockTran() {
		if (_tran == null) {
			_tran = createDBTran(false);
		}
		return _tran;
	}

	/**
	 * ロック用トランザクションを使用してロック情報を作成する
	 * 
	 * @param dtlL	場所、棚・ライン
	 * @param downL	下り電文（ロックエラーのリストを設定）
	 */
	protected void lock(MCList<ShipLot_DtlR> lockL) {

		lockL.sort(_lockKey);

		boolean retryLock = false;
		MCList<ShipLot_DtlR> retryL = MCList.create(ShipLot_DtlR.class);

		MST_SHIP_LOT_EX_R exR = MST_SHIP_LOT_EX_R.create();
		for (MCList<ShipLot_DtlR> lst : lockL.groupList(_lockKey)) {
			ShipLot_DtlR r = lst.get(0);
			try {
				// ロックはカレントトランザクションを使用
				int cnt = dbSelectKeyForUpdate("MSBEL5520_MST_SHIP_LOT_EX_S01", exR, MCQueryApiBuilder.create(MST_SHIP_LOT_EX_R.create("T1")), r);
				if (cnt > 0) {
					continue;
				}
				try {
					// 登録は新規トランザクションを使用
					MST_SHIP_LOT_EX_R insR = MST_SHIP_LOT_EX_R.create();
					insR.setValuesByName(r, _lockKey);
					MCQueryApiBuilder.create(MST_SHIP_LOT_EX_R.create("T")).buildInsert("MSBEL5520_MST_SHIP_LOT_EX_I01").executeUpdate(getLockTran(), insR, null);
					retryLock = true;
					retryL.addAll(lst);
				}
				catch (MCException ex) {
					if (!isSame(ex.getID(), FCBCC0136)) {
						throw ex;
					}
					for (ShipLot_DtlR errR : lst) {
						MCMessagePool.add(
							new MCMessage(
								errR, null, MSBEL0014, errR.cst_cd(), errR.dlv_cd(),
								toDispItm(errR.itm_cd(), errR.itm_sub1(), errR.itm_sub2(), errR.itm_sub3())));
						errR.err_flg(true);
					}
				}
			}
			catch (MCException ex) {
				if (!isSame(ex.getID(), FCBCC0110)) {
					throw ex;
				}
				for (ShipLot_DtlR errR : lst) {
					MCMessagePool.add(
						new MCMessage(
							errR, null, MSBEL0015, errR.cst_cd(), errR.dlv_cd(),
							toDispItm(errR.itm_cd(), errR.itm_sub1(), errR.itm_sub2(), errR.itm_sub3())));
					errR.err_flg(true);
				}
			}
		}
		if (retryLock) {
			getLockTran().commit();
			lock(retryL);
		}
	}

	/**
	 * ロック用トランザクションを解放する
	 */
	protected void unlock() {
		if (_tran != null) {
			_tran.rollback();
			MCTransactionManager.releaseDBTran(_tran);
		}
	}


///// キャッシュ関連
	/**
	 * キャッシュを管理するリクエストオブジェクト
	 */
	protected static final Class<MSBEL_ShipLotChkService> CLAZZ = MSBEL_ShipLotChkService.class;

	/**
	 * 取引先マスタのキャッシュ
	 */
	protected FXUCL_MCDbcCache<MAM_BP_R> _bpCache = null;

	/**
	 * 品目マスタのキャッシュ
	 */
	protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache = null;

	/**
	 * ロット管理情報のキャッシュ
	 */
	protected FXUCL_MCDbcCache<MSVT_LOT_LIST_R> _lotCache = null;

	/**
	 * マスタおよびトランをキャッシュする
	 * 
	 * @param dtlL	出荷ロットリスト
	 */
	protected static void doDataCache(MCList<ShipLot_DtlR> dtlL) {
		object(CLAZZ)._doBpCache(dtlL);
		object(CLAZZ)._doItmCache(dtlL);
	}

	/**
	 * ロット管理情報をキャッシュする
	 * 
	 * @param dtlL	出荷ロットリスト
	 */
	protected static void doLotCache(MCList<ShipLot_DtlR> dtlL) {
		object(CLAZZ)._doLotCache(dtlL);
	}

	/**
	 * 取引先マスタ（得意先）をキャッシュに格納する
	 * 
	 * @param dtlL	出荷ロットリスト
	 */
	protected void _doBpCache(MCList<ShipLot_DtlR> dtlL) {
		MAM_BP_R t = MAM_BP_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.lot_back_stop_typ);
		_bpCache = new FXUCL_MCDbcCache<MAM_BP_R>(
			dbc_bldr, dtlL,
			ShipLot_DtlR.$cst_cd
		);
	}
	
	/**
	 * キャッシュから取引先マスタ（得意先）を取得する
	 * 
	 * @param r
	 * @return
	 */
	protected static MAM_BP_R getBpR(ShipLot_DtlR r) {
		return object(CLAZZ)._getBpR(r);
	}
	protected MAM_BP_R _getBpR(ShipLot_DtlR r) {
		return _bpCache.get(r.cst_cd());
	}

	/**
	 * 品目マスタをキャッシュに格納する
	 * 
	 * @param dtlL	出荷ロットリスト
	 */
	protected void _doItmCache(MCList<ShipLot_DtlR> dtlL) {
		MAM_ITM_R t = MAM_ITM_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.ship_lot_back_stop_flg, t.ship_valid_grp_cd);
		_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(
			dbc_bldr, dtlL,
			ShipLot_DtlR.$itm_cd,
			ShipLot_DtlR.$itm_sub1,
			ShipLot_DtlR.$itm_sub2,
			ShipLot_DtlR.$itm_sub3
		);
	}
	
	/**
	 * キャッシュから品目マスタを取得する
	 * 
	 * @param r
	 * @return
	 */
	protected static MAM_ITM_R getItmR(ShipLot_DtlR r) {
		return object(CLAZZ)._getItmR(r);
	}
	protected MAM_ITM_R _getItmR(ShipLot_DtlR r) {
		return _itmCache.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
	}

	/**
	 * ロット管理情報をキャッシュに格納する
	 * 
	 * @param dtlL	出荷ロットリスト
	 */
	protected void _doLotCache(MCList<ShipLot_DtlR> dtlL) {
		MSVT_LOT_LIST_R t = MSVT_LOT_LIST_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.vld_dt);
		_lotCache = new FXUCL_MCDbcCache<MSVT_LOT_LIST_R>(
			dbc_bldr, dtlL,
			ShipLot_DtlR.$itm_cd,
			ShipLot_DtlR.$itm_sub1,
			ShipLot_DtlR.$itm_sub2,
			ShipLot_DtlR.$itm_sub3,
			ShipLot_DtlR.$lot_no,
			ShipLot_DtlR.$sublot_no
		);
	}

	/**
	 * キャッシュからロット情報を取得する
	 * 
	 * @param dtlR
	 * @return
	 */
	protected static MSVT_LOT_LIST_R getLotR(ShipLot_DtlR r) {
		return object(CLAZZ)._getLotR(r);
	}
	protected MSVT_LOT_LIST_R _getLotR(ShipLot_DtlR r) {
		return _lotCache.get(
			r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(),
			r.lot_no(), r.sublot_no());
	}

	/**
	 * 出荷有効期限制御マスタのキャッシュ
	 */
	protected FXUCL_Cache<MCList<MAM_SHIP_VALID_CTL_R>> _vldCache = new FXUCL_Cache<MCList<MAM_SHIP_VALID_CTL_R>>();
	protected final String[] _vldCtrlKey = {"dlv_cd", "cst_cd", "ship_valid_grp_cd"};

	/**
	 * 出荷有効期限制御マスタをキャッシュに格納する<br>
	 * 
	 * @param dtlL	出荷ロットリスト
	 */
	protected static void doShipValidCtlCache(MCList<ShipLot_DtlR> dtlL) {
		object(CLAZZ)._doShipValidCtlCache(dtlL);
	}
	protected void _doShipValidCtlCache(MCList<ShipLot_DtlR> dtlL) {
		_vldCache.setMaxCacheSize(-1);

		for (ShipLot_DtlR r : dtlL) {
			r.ship_valid_grp_cd(getItmR(r).ship_valid_grp_cd());
		}
		MCList<ShipLot_DtlR> grpL = dtlL.groupBy(_vldCtrlKey);

		MCList<MAM_SHIP_VALID_CTL_R>
			vldAllL = MCList.create(MAM_SHIP_VALID_CTL_R.class);
			MAM_SHIP_VALID_CTL_R t = MAM_SHIP_VALID_CTL_R.create("T");
			MCQueryApiBuilder vldAllL_bldr = MCQueryApiBuilder.create(t);
		vldAllL_bldr.setSelectAll();
		vldAllL_bldr.setWhere(t.cst_cd.eq(bind("cst_cd")).or(t.cst_cd.eq(value(MAC_STR.NULL_VAL.value()))));
		vldAllL_bldr.addWhereWithAnd(t.dlv_cd.eq(bind("dlv_cd")).or(t.dlv_cd.eq(value(MAC_STR.NULL_VAL.value()))));
		vldAllL_bldr.addWhereWithAnd(t.ship_valid_grp_cd.eq(bind("ship_valid_grp_cd")));
		dbSelect("MSBEL5520_MAM_SHIP_VALID_CTL_S01", vldAllL, vldAllL_bldr, grpL);
		MCIndexKey idx = vldAllL.createIndex(_vldCtrlKey);

		for (ShipLot_DtlR grpR : grpL) {
			_vldCache.putCache(grpR.toArray(_vldCtrlKey), _getShipValidCtrl(grpR, vldAllL, idx));
		}
	}

	/**
	 * 出荷ロットに有効な出荷有効期限制御マスタを取得する
	 * 
	 * @param r	出荷ロット
	 * @return
	 */
	protected MCList<MAM_SHIP_VALID_CTL_R> _getShipValidCtrl(
		ShipLot_DtlR r, MCList<MAM_SHIP_VALID_CTL_R> vldAllL, MCIndexKey idx) {

		MCList<MAM_SHIP_VALID_CTL_R> vldL = MCList.create(MAM_SHIP_VALID_CTL_R.class);
		// ロットの有効期限で出荷の可否（在庫引当が可能かどうか）を制御するマスタ
		// 以下の優先度でマスタを取得する
		// １．納品先、得意先、出荷有効期限グループが一致するレコード
		// ２．納品先、出荷有効期限グループが一致するレコード（得意先がＮＵＬＬのレコード）
		// ３．得意先、出荷有効期限グループが一致するレコード（納品先がＮＵＬＬのレコード）
		// ４．出荷有効期限グループが一致するレコード（納品先、得意先がＮＵＬＬのレコード）
		for (int i=0; i<_vldCtrlKey.length+1; i++) {
			Comparable<?>[] vals = r.toArray(_vldCtrlKey);
			if (i > 2) {
				vals[0] = vals[1] = MAC_STR.NULL_VAL.value();
			}
			else if (i > 1) {
				vals[0] = MAC_STR.NULL_VAL.value();	// 得意先
			}
			else if (i > 0) {
				vals[1] = MAC_STR.NULL_VAL.value();	// 納品先
			}
			MAM_SHIP_VALID_CTL_R vldR = vldAllL.getFirst(idx, vals);
			if (!isNull(vldR)) {
				vldL.add(vldR);	// 優先度の高い順に格納
			}
		}
		return vldL;
	}

	/**
	 * 基準日（納品予定日or納品日）に、出荷有効期限制御マスタ.有効期限日数を加味した有効期限を取得する
	 * 
	 * @param r	出荷ロット
	 * @return
	 */
	protected static MCDate getShipValidDt(ShipLot_DtlR r) {
		return object(CLAZZ)._getShipValidDt(r);
	}
	protected MCDate _getShipValidDt(ShipLot_DtlR r) {
	
		MCList<MAM_SHIP_VALID_CTL_R> vldL = _vldCache.getCache(r.toArray(_vldCtrlKey));
		if (vldL == null) {	// マスタが存在しない、ではなくマスタを取得していない状態を判定したいのでisEmptyではダメ
			MCList<ShipLot_DtlR> lst = MCList.create(ShipLot_DtlR.class);
			lst.add(r);
			_doShipValidCtlCache(lst);
			vldL = _vldCache.getCache(r.toArray(_vldCtrlKey));
		}
		if (!vldL.isEmpty()) {
			MAM_SHIP_VALID_CTL_R vldR = vldL.get(0);	// 要素＝０が優先度高
			return r.base_dt().addDay(vldR.valid_days());
		}
		return null;	// 該当マスタなし
	}

	//FMCB CUSTOM END
}