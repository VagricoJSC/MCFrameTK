package mcframe.serverMSBE.MSBEL5500;

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
import mcframe.serverMS.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBE.MSBEL5500.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.commonCore.meta.MCMeta;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheCW;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
import mcframe.serverMSBA.MSBAL5100.*;
import mcframe.serverMSBC.MSBCL5010.*;
import mcframe.serverMSBB.MSBBL6220.*;
import mcframe.serverMSBE.MSBEL5020.*;
import mcframe.serverMSBE.MSBEL5040.*;
import mcframe.serverMSBE.MSBEL5260.*;
import mcframe.serverMSBE.MSBEL5510.*;
import mcframe.serverMSBE.MSBEL5520.*;
import static mcframe.serverMSUC.MSUCL0070.MSUCL_StkUtil.*;
import mcframe.serverMSUC.MSUCL0080.*;
import mcframe.serverMAUC.MAUCL5020.*;

import java.util.Map;
import java.util.HashMap;
import java.util.function.BiFunction;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_ShipSchdService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_ShipSchdService_MC extends MSBEL_ShipSchdService_MC_A{
	//FMCB CUSTOM START

	/**
	 * 出荷進捗のデータベース更新を扱うベースクラス<br>
	 */
	public class UpdShipPr {
		/**
		 * 削除対象
		 */
		protected MCList<MST_SHIP_PR_R> _delL = null;
		protected MST_SHIP_PR_R _delL_t = MST_SHIP_PR_R.create("T");
		protected MCQueryApiBuilder _delL_bldr = MCQueryApiBuilder.create(_delL_t);
		/**
		 * 更新対象
		 */
		protected MCList<MST_SHIP_PR_R> _updL = null;
		protected MST_SHIP_PR_R _updL_t = MST_SHIP_PR_R.create("T");
		protected MCQueryApiBuilder _updL_bldr = MCQueryApiBuilder.create(_updL_t);
		/**
		 * 新規追加対象
		 */
		protected MCList<MST_SHIP_PR_R> _insL = null;
		protected MST_SHIP_PR_R _insL_t = MST_SHIP_PR_R.create("T");
		protected MCQueryApiBuilder _insL_bldr = MCQueryApiBuilder.create(_insL_t);

		/**
		 * コンストラクタ
		 */
		protected UpdShipPr() {
			_delL = MCList.create(MST_SHIP_PR_R.class);
			_updL = MCList.create(MST_SHIP_PR_R.class);
			_insL = MCList.create(MST_SHIP_PR_R.class);
		}

		/**
		 * 削除対象リストに追加する
		 */
		protected void addDelR(MST_SHIP_PR_R delR) {
			_delL.add(delR);
		}

		/**
		 * 更新対象リストに追加する
		 */
		protected void addUpdR(MST_SHIP_PR_R updR) {
			_updL.add(updR);
		}

		/**
		 * 新規追加対象リストに追加する
		 * @param insR
		 */
		protected void addInsR(MST_SHIP_PR_R insR) {
			_insL.add(insR);
		}

		/**
		 * データベースに対して登録・更新・削除を実行する
		 */
		protected void dbExec() {
			if (!_delL.isEmpty()) {
				dbDeleteKey("MSBEL5500_MST_SHIP_PR_D01", _delL, _delL_bldr);
			}
			if (!_insL.isEmpty()) {
				dbInsert("MSBEL5500_MST_SHIP_PR_I01", _insL, _insL_bldr);
			}
			if (!_updL.isEmpty()) {
				dbUpdateKey("MSBEL5500_MST_SHIP_PR_U01", _updL, _updL_bldr);
			}
		}

		/**
		 * KPI関連項目を更新する
		 */
		protected void updKPI() {
			MCList<MST_SHIP_PR_R> prL = MCList.create(MST_SHIP_PR_R.class);
			prL.addStringColumn("peg_no");
			prL.addAll(_updL);
			prL.addAll(_insL);
			setPegNo(prL);

			// 販売状況区分
			MSUCL_SlsUtil.SlsUtil_Srch01 o = MSUCL_SlsUtil.crtSlsUtil_Srch01();
			for (MST_SHIP_PR_R r : prL) {
				if (MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSHIP(r.trd_ptn_typ())) {
					copy(o.up0().add(), r, createMap_SlsUtil_Srch01_CndR_MST_SHIP_PR_R());
				}
			}

			if (!o.up0().isEmpty()) {
				o.exec();
				copyByPegNo(
					prL, new String[]{MST_SHIP_PR_R.$sls_sts_typ},
					o.down0(), new String[]{SlsUtil_Srch01_CndR.$sls_sts_typ}
				);

				// 回答納入日遅れ
				MSUCL_SlsUtil.setPrmsDlvDtDverdueFlg(prL);

				// 出荷進捗に反映
				MST_SHIP_PR_R dbc = MST_SHIP_PR_R.create("T");
				MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
				builder.setSet(dbc.sls_sts_typ);
				builder.addSet(dbc.prms_dlv_dt_overdue_flg);
				builder.addSetVL(dbc.dlv_rqst_dt_overdue_flg,
						cases().when(dbc.ship_cmpl_flg.eq(value(true))
								.and(dbc.sls_cmpl_flg.eq(value(true)))
								.and(dbc.dlv_tm.gt(dbc.dlv_rqst_tm)))
						.then(value(true))
						.otherwise(value(false)));
				dbUpdateKey("MSBEL5500_MST_SHIP_PR_U02", prL, builder);
			}
		}
		protected Map_SlsUtil_Srch01_CndR_MST_SHIP_PR_R<SlsUtil_Srch01_CndR,MST_SHIP_PR_R> createMap_SlsUtil_Srch01_CndR_MST_SHIP_PR_R() {
			return new Map_SlsUtil_Srch01_CndR_MST_SHIP_PR_R<SlsUtil_Srch01_CndR, MST_SHIP_PR_R>();
		}
		public class Map_SlsUtil_Srch01_CndR_MST_SHIP_PR_R<D extends SlsUtil_Srch01_CndR, S extends MST_SHIP_PR_R> extends MCRowMapper<D,S>{
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.peg_no(src.getNumber("peg_no"));
				dest.slo_d_no(src.slo_d_no());
			}
		}

	}


	/**
	 * 出荷進捗リスト（更新対象を格納）
	 */
	protected UpdShipPr _updShipPrL = null;

	/**
	 * 出荷予定のデータベース更新を扱うクラス<br>
	 */
	public class UpdShipSchd {
		/**
		 * 削除対象
		 */
		protected MCList<MST_SHIP_SCHD_R> _delL = null;
		protected MST_SHIP_SCHD_R _delL_t = MST_SHIP_SCHD_R.create("T");
		protected MCQueryApiBuilder _delL_bldr = MCQueryApiBuilder.create(_delL_t);
		/**
		 * 更新対象
		 */
		protected MCList<MST_SHIP_SCHD_R> _updL = null;
		protected MST_SHIP_SCHD_R _updL_t = MST_SHIP_SCHD_R.create("T");
		protected MCQueryApiBuilder _updL_bldr = MCQueryApiBuilder.create(_updL_t);
		/**
		 * 新規追加対象
		 */
		protected MCList<MST_SHIP_SCHD_R> _insL = null;
		protected MST_SHIP_SCHD_R _insL_t = MST_SHIP_SCHD_R.create("T");
		protected MCQueryApiBuilder _insL_bldr = MCQueryApiBuilder.create(_insL_t);

		/**
		 * 更新対象外、カットオフ、または値を補完するカラム
		 */
		protected String[] _rmCols = {
			// 更新対象外のカラム
			MST_SHIP_SCHD_R.$ship_schd_no,
			MST_SHIP_SCHD_R.$ship_pr_no,
			MST_SHIP_SCHD_R.$alloc_prio,
			// 値を補完するカラム
			MST_SHIP_SCHD_R.$stk_insp_typ,
			MST_SHIP_SCHD_R.$abort_qty,
			MST_SHIP_SCHD_R.$ship_inst_qty,
			MST_SHIP_SCHD_R.$ship_act_qty,
			MST_SHIP_SCHD_R.$iv_schd_qty,
			MST_SHIP_SCHD_R.$iv_act_qty,
			MST_SHIP_SCHD_R.$sls_qty,
			MST_SHIP_SCHD_R.$dlv_qty,
			MST_SHIP_SCHD_R.$ship_ret_qty
		};

		/**
		 * コンストラクタ
		 */
		protected UpdShipSchd() {
			_delL = MCList.create(MST_SHIP_SCHD_R.class);
			_updL = MCList.create(MST_SHIP_SCHD_R.class);
			_insL = MCList.create(MST_SHIP_SCHD_R.class);

			// 更新対象カラムの設定
			_updL_bldr.removeSet(_rmCols);
			_updL_bldr.addSetVL(_updL_t.stk_insp_typ,
					nvl(bindEx("stk_insp_typ"), value(MSC_STK_INSP_TYP.FIN.value())));
			_updL_bldr.addSetVL(_updL_t.abort_qty,
					nvl(bindEx("abort_qty"), _updL_t.abort_qty));
			_updL_bldr.addSetVL(_updL_t.ship_inst_qty,
					nvl(bindEx("ship_inst_qty"), _updL_t.ship_inst_qty));
			_updL_bldr.addSetVL(_updL_t.ship_act_qty,
					nvl(bindEx("ship_act_qty"), _updL_t.ship_act_qty));
			_updL_bldr.addSetVL(_updL_t.iv_schd_qty,
					nvl(bindEx("iv_schd_qty"), _updL_t.iv_schd_qty));
			_updL_bldr.addSetVL(_updL_t.iv_act_qty,
					nvl(bindEx("iv_act_qty"), _updL_t.iv_act_qty));
			_updL_bldr.addSetVL(_updL_t.sls_qty,
					nvl(bindEx("sls_qty"), _updL_t.sls_qty));
			_updL_bldr.addSetVL(_updL_t.dlv_qty,
					nvl(bindEx("dlv_qty"), _updL_t.dlv_qty));
			_updL_bldr.addSetVL(_updL_t.ship_ret_qty,
					nvl(bindEx("ship_ret_qty"), _updL_t.ship_ret_qty));
		}

		/**
		 * 削除対象リストに追加する
		 */
		protected void addDelR(MST_SHIP_SCHD_R delR) {
			_delL.add(delR);
		}
		protected void addDelL(MCList<MST_SHIP_SCHD_R> delL) {
			_delL.addAll(delL);
		}

		/**
		 * 更新対象リストに追加する
		 */
		protected void addUpdR(MST_SHIP_SCHD_R updR) {
			_updL.add(updR);
		}

		/**
		 * 新規追加対象リストに追加する
		 * @param insR
		 */
		protected void addInsR(MST_SHIP_SCHD_R insR) {
			_insL.add(insR);
		}

		/**
		 * 更新対象を全て取得する
		 */
		protected MCList<MST_SHIP_SCHD_R> getL() {
			MCList<MST_SHIP_SCHD_R> rL = MCList.create(MST_SHIP_SCHD_R.class);
			rL.addAll(_delL);
			rL.addAll(_updL);
			rL.addAll(_insL);
			return rL;
		}

		/**
		 * データベースに対して登録・更新・削除を実行する
		 */
		protected void dbExec() {
			if (!_delL.isEmpty()) {
				dbDeleteKey("MSBEL5500_MST_SHIP_SCHD_D01", _delL, _delL_bldr);
			}
			if (!_insL.isEmpty()) {
				dbInsert("MSBEL5500_MST_SHIP_SCHD_I01", _insL, _insL_bldr);
			}
			if (!_updL.isEmpty()) {
				dbUpdateKey("MSBEL5500_MST_SHIP_SCHD_U01", _updL, _updL_bldr);
			}
		}
	}

	/**
	 * 出荷予定リスト（更新対象を格納）
	 */
	protected UpdShipSchd _updShipSchdL = null;

	/**
	 * 出荷引当状況リスト（更新対象を格納）
	 */
	protected MCList<MST_SHIP_ALLOC_STS_R> _updAllocStsL = null;
	protected MST_SHIP_ALLOC_STS_R _updAllocStsL_t = MST_SHIP_ALLOC_STS_R.create("T");
	protected MCQueryApiBuilder _updAllocStsL_bldr = MCQueryApiBuilder.create(_updAllocStsL_t);
	/**
	 * 出荷引当状況リスト用インデックス（peg_no, peg_seq）
	 */
	protected MCIndexKey _updAllocStsLKey = null;

	/**
	 * 引当結果を格納
	 */
	protected MCList<Alloc_RsltR> _allocRsltL = null;

	/**
	 * Upd01, Upd02 の上り電文を一意に特定するキー
	 */
	protected String[] _$peg = {ShipPr_DtlR.$peg_no, ShipPr_DtlR.$peg_seq};
	
	/**
	 * 出荷引当状況ＮＯ 再利用不可リスト
	 * 出荷指図登録の訂正で行削除された出荷引当状況NOを格納
	 */
	protected MCList<ShipSchd_Upd02_RdelR> _notReuseL = null;

	/**
	 * ShipSchd_Upd01オペレーション.<p>
	 *
	 * 受注、移送、支給予定に対応する出荷進捗情報および出荷予定情報を作成する。<br>
	 */
	public class ShipSchd_Upd01 extends MSBEL_ShipSchdService_MC_A.ShipSchd_Upd01 {
		/**
		 * 出荷進捗、出荷予定リスト
		 */
		protected MCList<ShipPr_DtlR> _prL = null;

		protected MSBEL_AllocMngService.Alloc_Avl_Sprt01 _allocAvlSprt01 = null;
		protected MCIndexKey _allocAvlSprtKey = null;

		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			// 前処理
			preProc();
			editUp();
			doDataCache();

			// メイン処理
			doSeqForPrSchdL(_prL);
			makeAllocStsL(_prL, _allocAvlSprt01.down0(), _allocAvlSprtKey);
			makeShipSchdL(_prL, _allocAvlSprt01.down0(), _allocAvlSprtKey);
			makeShipPrL(_prL);
			setAllocDispSeq();
			updAllocSts();
			updShipSchd();
			updShipPr();
			callShipLotUpdSrv(_prL);
			callDelIoSchdSrv(_prL);
			callInsIoSchdSrv(_prL);
			callSlsSchdSrv(_prL);
			callProvSchdSrv(_prL);
			updShipPr2();
			callOrdRegSrv(_prL);
			callWgRqstSrvForShipRqst(_prL);
			callWgRqstSrv(_prL);
			setDown(_prL);
		}

		/**
		 * 前処理
		 */
		protected void preProc() {
			_prL = MCList.create(ShipPr_DtlR.class);
			_updShipPrL = new UpdShipPrUpd01();
			_updShipSchdL = new UpdShipSchd();
			_updAllocStsL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			_allocRsltL = MCList.create(Alloc_RsltR.class);
			_allocAvlSprt01 = MSBEL_AllocMngService.crtAlloc_Avl_Sprt01();

			// Chk01を利用してキャッシュを再構築する
			MSBEL_ShipSchdService.ShipSchd_Chk01
				chk01 = MSBEL_ShipSchdService.crtShipSchd_Chk01();
			chk01.up0().setAll(up0());
			chk01.preProc();			
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			for (ShipPr_DtlR r : up0()) {
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())
					|| MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())
						&& (isAbort(r) || isAbortRel(r))) {
					int i = 1;
					for (MST_SHIP_SCHD_R schdR : getShipSchdL(r.ship_pr_no())) {
						ShipPr_DtlR prR = r.clone();
						prR.setAttributes(r);
						prR.sp(getShipPrR(r.ship_pr_no()));
						prR.ss(schdR);
						prR.sp().abort_flg(r.abort_flg());
						prR.ss().abort_flg(r.abort_flg());
						prR.peg_seq(i++);
						if (isAbort(r)) {
							prR.sp().setStringNE("trd_rmrks", schdR.trd_rmrks());
							prR.sp().setStringNE("trd_d_rmrks", schdR.trd_d_rmrks());
						}
						else if (isAbortRel(r)) {
							prR.sp().setStringNE("trd_rmrks", r.trd_rmrks());
							prR.sp().setStringNE("trd_d_rmrks", schdR.trd_d_rmrks());
						}
						_prL.add(prR);
					}
					continue;
				}
				// 貸出の場合、取引を「出荷」に振り替える
				if (MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ()) && r.vmi_flg()) {
					MAM_TRD_R trdR = getShipTrdR();
					r.trd_cd(trdR.trd_cd());
					r.trd_ptn_typ(MAC_TRD_PTN_TYP.SHIP.value());
				}
				r.sno1(nvl(r.sno1(), MAC_STR.NULL_VAL.value()));
				r.sno2(nvl(r.sno2(), MAC_STR.NULL_VAL.value()));
				r.sno3(nvl(r.sno3(), MAC_STR.NULL_VAL.value()));
				r.sno4(nvl(r.sno4(), MAC_STR.NULL_VAL.value()));
				r.stk_arrv_bp_cd(nvl(r.stk_arrv_bp_cd(), MAC_STR.NULL_VAL.value()));
				r.stk_bp_cd(nvl(r.stk_bp_cd(), MAC_STR.NULL_VAL.value()));
				r.ship_inst_typ(nvl(r.ship_inst_typ(),
						nvl(getItmR(r).ship_inst_typ(), MAC_SHIP_INST_TYP.PICK.value())));
				r.ship_schd_split_typ(nvl(r.ship_schd_split_typ(),
						nvl(getCo().ship_schd_split_typ(), MAC_SHIP_SCHD_SPLIT_TYP.NON.value())));
				r.alloc_scope_typ(nvl(r.alloc_scope_typ(), MAC_ALLOC_SCOPE_TYP.LOC.value()));
				if (isNull(r.alloc_typ())) {
					MAM_ITM_R itmR = getItmR(r);
					if (MAC_STK_MNG_TYP.isMNG(itmR.stk_mng_typ())) {
						r.alloc_typ(MAC_ALLOC_TYP.IMMED.value());
					}
					else {
						r.alloc_typ(MAC_ALLOC_TYP.NON.value());
					}
				}
				r.ss().trd_unit_qty(r.trd_unit_qty());
				r.ss().trd_unit_cd(r.trd_unit_cd());
				r.ss().base_unit_qty(r.base_unit_qty());
				r.ss().base_unit_cd(r.base_unit_cd());
				r.ship_schd_split_flg(true);		// Upd01では分割区分は常に有効
				r.ss().ship_cnt_rmrks(r.sp().ship_cnt_rmrks());
				r.sp().setStringNE("trd_rmrks", r.trd_rmrks());
				r.sp().setStringNE("trd_d_rmrks", r.trd_d_rmrks());
				// 配送先経由する場合は納入希望日時をセットしない
				if (MAC_VIA_DLV_TYP.isVIA(r.via_dlv_typ())) {
					r.dlv_rqst_tm(null);
				}
				r.peg_seq(1);
				_prL.add(r);
			}

			setShipNotMngLotNo(_prL);
			_allocRsltL.addAll(up1());
			_allocRsltL.setNumber(Alloc_RsltR.$peg_seq, 1);
			// 上り電文の並び順を保持
			for (int i=0; i<up1().size(); i++) {
				up1().get(i).seq(i);
			}
		}

		/**
		 * データをキャッシュする
		 */
		protected void doDataCache() {
			doItmUnitCache(_prL);
			doXfrSchdCache(_prL);
			doIvCache(_prL);
			doAllocAvlSprt(_allocAvlSprt01, _prL);
			_allocAvlSprtKey = _allocAvlSprt01.down0().createIndex(Alloc_Avl_Sprt01_CndR.$peg_no);
		}

		/**
		 * 各サービス実行後に出荷進捗を更新する
		 */
		protected void updShipPr2() {
			_updShipPrL.updKPI();
		}

		/**
		 * 下り電文を設定する
		 */
		protected void setDown(MCList<ShipPr_DtlR> prL) {
			MCIndexKey idx = prL.createIndex(ShipPr_DtlR.$peg_no);
			for (ShipPr_DtlR r : up0()) {
				// 分割されている場合、ひとつのpeg_noに対して複数件下り電文が設定される
				for (ShipPr_DtlR prR : prL.subList(idx, r.peg_no())) {
					ShipPr_DtlR dR = down0().add();
					dR.peg_no(prR.peg_no());
					dR.ship_pr_no(prR.ship_pr_no());
					dR.ship_schd_no(prR.ship_schd_no());
					dR.ship_schd_tm(prR.ship_schd_tm());
					dR.dlv_schd_tm(prR.dlv_schd_tm());
				}
			}
		}

		/**
		 * 出荷進捗を更新するクラス<br>
		 */
		public class UpdShipPrUpd01 extends UpdShipPr {
			/**
			 * 更新対象外、カットオフ、または値を補完するカラム
			 */
			protected String[] _rmCols = {
				// 更新対象外
				MST_SHIP_PR_R.$ship_pr_no,
				MST_SHIP_PR_R.$ship_tm,
				MST_SHIP_PR_R.$dlv_tm,
				MST_SHIP_PR_R.$sls_dt,
				MST_SHIP_PR_R.$re_ship_schd_qty,
				MST_SHIP_PR_R.$ship_inst_qty,
				MST_SHIP_PR_R.$ship_act_qty,
				MST_SHIP_PR_R.$iv_schd_qty,
				MST_SHIP_PR_R.$iv_act_qty,
				MST_SHIP_PR_R.$sls_qty,
				MST_SHIP_PR_R.$dlv_qty,
				MST_SHIP_PR_R.$ship_ret_qty,
				MST_SHIP_PR_R.$act_dlv_lt,
				MST_SHIP_PR_R.$prms_dlv_dt_overdue_flg,
				MST_SHIP_PR_R.$dlv_rqst_dt_overdue_flg,
				MST_SHIP_PR_R.$dlv_cmpl_flg,
				// 値を補完するカラム
				MST_SHIP_PR_R.$ship_schd_split_typ,
				MST_SHIP_PR_R.$alloc_scope_typ,
				MST_SHIP_PR_R.$alloc_typ,
				MST_SHIP_PR_R.$prms_qty,
				MST_SHIP_PR_R.$dlv_inst_rcpt_qty,
				MST_SHIP_PR_R.$dlv_inst_prms_qty,
				MST_SHIP_PR_R.$ship_schd_abort_qty,
				MST_SHIP_PR_R.$ship_cmpl_flg,
				MST_SHIP_PR_R.$sls_schd_abort_qty,
				MST_SHIP_PR_R.$sls_cmpl_flg
			};

			/**
			 * コンストラクタ
			 */
			protected UpdShipPrUpd01() {
				super();
				// 更新対象カラムの設定
				_updL_bldr.removeSet(_rmCols);
				_updL_bldr.addSetVL(_updL_t.ship_schd_split_typ,
						nvl(bindEx("ship_schd_split_typ"), _updL_t.ship_schd_split_typ));
				_updL_bldr.addSetVL(_updL_t.alloc_scope_typ,
						nvl(bindEx("alloc_scope_typ"), _updL_t.alloc_scope_typ));
				_updL_bldr.addSetVL(_updL_t.alloc_typ,
						nvl(bindEx("alloc_typ"), _updL_t.alloc_typ));
				_updL_bldr.addSetVL(_updL_t.prms_qty,
						nvl(bindEx("prms_qty"), _updL_t.prms_qty));
				_updL_bldr.addSetVL(_updL_t.dlv_inst_rcpt_qty,
						nvl(bindEx("dlv_inst_rcpt_qty"), _updL_t.dlv_inst_rcpt_qty));
				_updL_bldr.addSetVL(_updL_t.dlv_inst_prms_qty,
						nvl(bindEx("dlv_inst_prms_qty"), _updL_t.dlv_inst_prms_qty));
				_updL_bldr.addSetVL(_updL_t.ship_schd_abort_qty,
						nvl(bindEx("ship_schd_abort_qty"), _updL_t.ship_schd_abort_qty));
				_updL_bldr.addSetVL(_updL_t.ship_cmpl_flg,
						nvl(bindEx("ship_cmpl_flg"), _updL_t.ship_cmpl_flg));
				_updL_bldr.addSetVL(_updL_t.sls_schd_abort_qty,
						nvl(bindEx("sls_schd_abort_qty"), _updL_t.sls_schd_abort_qty));
				_updL_bldr.addSetVL(_updL_t.sls_cmpl_flg,
						nvl(bindEx("sls_cmpl_flg"), _updL_t.sls_cmpl_flg));
			}
		}
	}

	/**
	 * ShipSchd_Upd02オペレーション.<p>
	 *
	 * 出荷進捗が存在する出荷に対して出荷予定の追加・更新・削除を行う。<br>
	 */
	public class ShipSchd_Upd02 extends MSBEL_ShipSchdService_MC_A.ShipSchd_Upd02 {
		/**
		 * 出荷進捗、出荷予定リスト（出荷判定を除く）
		 */
		protected MCList<ShipPr_DtlR> _prL = null;

		/**
		 * 出荷進捗、出荷予定リスト（出荷判定のみ）
		 */
		protected MCList<ShipPr_DtlR> _shipJudgeL = null;

		protected MSBEL_AllocMngService.Alloc_Avl_Sprt01 _allocAvlSprt01 = null;
		protected MCIndexKey _allocAvlSprtKey = null;
		
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			// 前処理
			preProc();
			editUp();
			doDataCache();
			
			// メイン処理
			doShipSchd();
			doShipJudge();
		}

		/**
		 * 出荷予定の更新を行う
		 */
		protected void doShipSchd() {
			if (isNull(_prL)) {
				return;
			}
			// メイン処理
			doSeqForPrSchdL(_prL);
			makeAllocStsL(_prL, _allocAvlSprt01.down0(), _allocAvlSprtKey);
			makeShipSchdL(_prL, _allocAvlSprt01.down0(), _allocAvlSprtKey);
			makeShipPrL(_prL);
			setAllocDispSeq();
			updAllocSts();
			updShipSchd();
			updShipPr();
			callShipLotUpdSrv(_prL);
			callDelIoSchdSrv(_prL);
			callInsIoSchdSrv(_prL);
			callSlsSchdSrv(_prL);
			callSlsSchdSrvForIv(_prL);
			callProvSchdSrv(_prL);
			updShipPr2();
			callOrdRegSrv(_prL);
			callWgRqstSrvForShipRqst(_prL);
			callWgRqstSrv(_prL);
			setDown(_prL);
		}
		/**
		 * 出荷判定を行う
		 */
		protected void doShipJudge() {
			if (isNull(_shipJudgeL)) {
				return;
			}

			// 出荷判定＆更新
			MCList<MST_SHIP_SCHD_R> ssL = MCList.create(MST_SHIP_SCHD_R.class);
			for (ShipPr_DtlR prR : _shipJudgeL) {
				prR.ss().ship_abl_flg(shipJudge(prR));
				prR.ss().ship_lot_chk_tar_flg(shipLotCheck(prR));
				ssL.add(prR.ss());
			}
			MST_SHIP_SCHD_R dbc1 = MST_SHIP_SCHD_R.create("T");
			execDbUpdateKey("MSBEL5500_MST_SHIP_SCHD_U02", dbc1, ssL, dbc1.ship_abl_flg, dbc1.ship_lot_chk_tar_flg);

			// 更新カウンタを進めるための空更新
			MST_SHIP_PR_R dbc2 = MST_SHIP_PR_R.create("T");
			execDbUpdateKey("MSBEL5500_MST_SHIP_PR_U03", dbc2, _shipJudgeL, dbc2.ship_pr_no);
		}

		/**
		 * 前処理
		 */
		protected void preProc() {
			_prL = MCList.create(ShipPr_DtlR.class);
			_shipJudgeL = MCList.create(ShipPr_DtlR.class);
			_updShipPrL = new UpdShipPrUpd02();
			_updShipSchdL = new UpdShipSchd();
			_updAllocStsL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			_allocRsltL = MCList.create(Alloc_RsltR.class);
			_allocAvlSprt01 = MSBEL_AllocMngService.crtAlloc_Avl_Sprt01();

			// Chk02を利用してキャッシュを再構築する
			MSBEL_ShipSchdService.ShipSchd_Chk02
				chk02 = MSBEL_ShipSchdService.crtShipSchd_Chk02();
			chk02.up0().setAll(up1());
			chk02.preProc();
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			Map_ShipPr_DtlR_ShipSchd_DtlR
				<ShipPr_DtlR, ShipSchd_DtlR> mpr = createMap_ShipPr_DtlR_ShipSchd_DtlR();
			for (ShipSchd_DtlR r : up1()) {
				if (r.ship_judge_flg()) {
					copy(_shipJudgeL.add(), r, mpr);
				}
				else {
					copy(_prL.add(), r, mpr);
				}
				r.setBooleanNE(ShipSchd_CtrlR.$lot_chk_flg, up0().lot_chk_flg());
			}
			setShipNotMngLotNo(_prL);
			_allocRsltL.addAll(up2());
			_allocRsltL.setNumber(Alloc_RsltR.$peg_seq, 1);
			// 上り電文の並び順を保持
			for (int i=0; i<up2().size(); i++) {
				up2().get(i).seq(i);
			}
			_notReuseL = up3();
		}

		/**
		 * データをキャッシュする
		 */
		protected void doDataCache() {
			MCList<ShipPr_DtlR> l = _prL.clone();
			l.addAll(_shipJudgeL);
			doItmUnitCache(l);
			doXfrSchdCache(l);
			doIvCache(l);
			doAllocAvlSprt(_allocAvlSprt01, l);
			doItmCache(l);
			_allocAvlSprtKey = _allocAvlSprt01.down0().createIndex(Alloc_Avl_Sprt01_CndR.$peg_no);
		}

		protected Map_ShipPr_DtlR_ShipSchd_DtlR
				<ShipPr_DtlR, ShipSchd_DtlR> createMap_ShipPr_DtlR_ShipSchd_DtlR() {
			return new Map_ShipPr_DtlR_ShipSchd_DtlR<ShipPr_DtlR, ShipSchd_DtlR>();
		}
		public class Map_ShipPr_DtlR_ShipSchd_DtlR
				<D extends ShipPr_DtlR, S extends ShipSchd_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.ss(src.ss());

				if (MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())) {
					MST_SHIP_SCHD_R schdR = getShipSchdR(src.ship_schd_no()); 
					dest.ss(schdR);
				}
				else {
					if (MAC_DATA_CRUD_TYP.isUPD(src.data_crud_typ())) {
						MST_SHIP_SCHD_R schdR = getShipSchdR(src.ship_schd_no()); 
						// 打切、打切解除、出荷判定の場合は出荷予定を補完
						if (src.abort_flg()
							|| !src.abort_flg() && schdR.abort_flg()
							|| src.ship_judge_flg()) {
							dest.ss(schdR);
	
							// 上り電文の値を再設定
							dest.ss().abort_flg(src.ss().abort_flg());
							dest.ship_judge_flg(src.ship_judge_flg());
							if (!isNull(src.ss().trd_unit_cd())) {
								dest.ss().trd_unit_cd(src.ss().trd_unit_cd());
								dest.ss().trd_unit_qty(src.ss().trd_unit_qty());
							}
							if (!isNull(src.ss().base_unit_cd())) {
								dest.ss().base_unit_cd(src.ss().base_unit_cd());
								dest.ss().base_unit_qty(src.ss().base_unit_qty());
							}
						}
						else {
							dest.ss(src.ss());
							if (!src.dlv_upd_flg()) {
								dest.ss().dlv_cd(schdR.dlv_cd());
								dest.ss().dlv_sundry_flg(schdR.dlv_sundry_flg());
								dest.ss().dlv_nm(schdR.dlv_nm());
								dest.ss().dlv_cntct_dpt(schdR.dlv_cntct_dpt());
								dest.ss().dlv_cntct_psn(schdR.dlv_cntct_psn());
								dest.ss().dlv_zip_cd(schdR.dlv_zip_cd());
								dest.ss().dlv_addr1(schdR.dlv_addr1());
								dest.ss().dlv_addr2(schdR.dlv_addr2());
								dest.ss().dlv_addr3(schdR.dlv_addr3());
								dest.ss().dlv_addr4(schdR.dlv_addr4());
								dest.ss().dlv_tel(schdR.dlv_tel());
								dest.ss().dlv_fax(schdR.dlv_fax());
								dest.ss().dlv_lg_grp_cd(schdR.dlv_lg_grp_cd());
								dest.ss().pri_prnt_flg(schdR.pri_prnt_flg());
								dest.ss().tdlv_cd(schdR.tdlv_cd());
								dest.ss().tdlv_sundry_flg(schdR.tdlv_sundry_flg());
								dest.ss().tdlv_nm(schdR.tdlv_nm());
								dest.ss().via_dlv_typ(schdR.via_dlv_typ());
								dest.ss().tdlv_cntct_dpt(schdR.tdlv_cntct_dpt());
								dest.ss().tdlv_cntct_psn(schdR.tdlv_cntct_psn());
								dest.ss().tdlv_zip_cd(schdR.tdlv_zip_cd());
								dest.ss().tdlv_addr1(schdR.tdlv_addr1());
								dest.ss().tdlv_addr2(schdR.tdlv_addr2());
								dest.ss().tdlv_addr3(schdR.tdlv_addr3());
								dest.ss().tdlv_addr4(schdR.tdlv_addr4());
								dest.ss().tdlv_tel(schdR.tdlv_tel());
								dest.ss().tdlv_fax(schdR.tdlv_fax());
								dest.ss().tdlv_lg_grp_cd(schdR.tdlv_lg_grp_cd());
								dest.ss().dlv_day_week_typ(schdR.dlv_day_week_typ());
							}
						}
					}
					dest.sno1(nvl(dest.sno1(), MAC_STR.NULL_VAL.value()));
					dest.sno2(nvl(dest.sno2(), MAC_STR.NULL_VAL.value()));
					dest.sno3(nvl(dest.sno3(), MAC_STR.NULL_VAL.value()));
					dest.sno4(nvl(dest.sno4(), MAC_STR.NULL_VAL.value()));
					dest.stk_arrv_bp_cd(nvl(dest.stk_arrv_bp_cd(), MAC_STR.NULL_VAL.value()));
					dest.stk_bp_cd(nvl(dest.stk_bp_cd(), MAC_STR.NULL_VAL.value()));
					dest.inst_qty(src.inst_qty());
					dest.inst_unit_cd(src.inst_unit_cd());
					dest.inst_ship_schd_tm(src.inst_ship_schd_tm());
					dest.inst_dlv_schd_tm(src.inst_dlv_schd_tm());
					dest.ship_schd_split_flg(src.ship_schd_split_flg());
					dest.wms_flg(src.wms_flg());
					dest.rem_abort_flg(src.rem_abort_flg());
					if (!dest.ss().dlv_sundry_flg()) {
						dest.ss().dlv_nm(null);
					}
					if (!dest.ss().tdlv_sundry_flg()) {
						dest.ss().tdlv_nm(null);
					}
				}

				dest.is_src_sls_dlv_dt_adjst_flg(src.is_src_sls_dlv_dt_adjst_flg());
				dest.is_src_ship_inst_flg(src.is_src_ship_inst_flg());
				dest.is_src_ship_schd_flg(src.is_src_ship_schd_flg());
				dest.sp(getShipPrR(src.ship_pr_no()));
				dest.data_crud_typ(src.data_crud_typ());
				dest.peg_no(src.peg_no());
				dest.peg_seq(1);
				dest.upd02_flg(true);
				dest.cred_no_up_flg(src.cred_no_up_flg());
				dest.iv_schd_qty_upd_flg(src.iv_schd_qty_upd_flg());
			}
		}

		/**
		 * 各サービス実行後に出荷進捗を更新する
		 */
		protected void updShipPr2() {
			// KPI関連項目を更新する前に、売上予定の内容を反映する必要があるため再度更新する
			_updShipPrL.dbExec();
			ShipSchd_Upd03.UpdShipPrUpd03 upd03 = MSBEL_ShipSchdService.crtShipSchd_Upd03().new UpdShipPrUpd03();
			ShipSchd_Upd05.UpdShipPrUpd05 upd05 = MSBEL_ShipSchdService.crtShipSchd_Upd05().new UpdShipPrUpd05();
			for (MCList<ShipPr_DtlR> grpL : _prL.groupList(ShipPr_DtlR.$ship_pr_no)) {
				ShipPr_DtlR upR = grpL.get(0);
				
				// Upd02では出荷実績数量、売上数量は更新されないので、DB更新前のキャッシュが持つ数量で判断しても問題ない
				// それぞれの実績数が0以外であり、かつ完了フラグがオフ⇒オンまたはオン⇒オフの場合に更新する
				MST_SHIP_PR_R
					prR = getShipPrR(upR.ship_pr_no()), r = upR.sp().clone();
				if (!isSame(prR.ship_act_qty(), 0) && (prR.ship_cmpl_flg() ^ r.ship_cmpl_flg())) {
					upd03.addUpdR(r);
				}
				if (!isSame(prR.sls_qty(), 0) && (prR.sls_cmpl_flg() ^ r.sls_cmpl_flg())) {
					upd05.addUpdR(r);
				}
			}
			if (!upd03._updL.isEmpty()) {
				upd03.dbExec();
			}
			if (!upd05._updL.isEmpty()) {
				upd05.dbExec();
			}
			_updShipPrL.updKPI();
		}

		/**
		 * 下り電文を設定する
		 */
		protected void setDown(MCList<ShipPr_DtlR> prL) {
			MCIndexKey idx = prL.createIndex(ShipPr_DtlR.$peg_no);
			for (ShipSchd_DtlR r : up1()) {
				// 分割されている場合、ひとつのpeg_noに対して複数件下り電文が設定される
				for (ShipPr_DtlR prR : prL.subList(idx, r.peg_no())) {
					ShipSchd_DtlR dR = down0().add();
					dR.peg_no(prR.peg_no());
					dR.ship_schd_no(prR.ship_schd_no());
					dR.ship_schd_tm(prR.ship_schd_tm());
					dR.dlv_schd_tm(prR.dlv_schd_tm());
				}
			}
		}

		/**
		 * 出荷進捗を更新するクラス<br>
		 */
		public class UpdShipPrUpd02 extends UpdShipPr {
			@Override
			protected void dbExec() {
				// 新規追加、更新（打切、打切解除）、削除はないはずなので無視
				if (isNull(_updL)) {
					return;
				}
				// 更新後の出荷予定を取得する

				MCList<MST_SHIP_SCHD_R> schdL = MCList.create(MST_SHIP_SCHD_R.class);
				MST_SHIP_SCHD_R t1 = MST_SHIP_SCHD_R.create("T");
				MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(t1);
				MST_SLS_SCHD_R S1W = MST_SLS_SCHD_R.create("W");
				schdL.addNumberColumn("re_ship_schd_qty");
				schdL.addNumberColumn("cnt");
				schdL.addNumberColumn("sls_abort_qty");
				schdL.addBooleanColumn("sls_cmpl_flg");

				schdL_bldr.setGroupBy(t1.ship_pr_no, t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3);
				schdL_bldr.setWhere(t1.ship_pr_no.eq(bind("ship_pr_no")));
				// 出荷予定
				schdL_bldr.addGroupFunc(max(t1.ship_schd_tm), "ship_schd_tm");
				schdL_bldr.addGroupFunc(max(t1.dlv_schd_tm), "dlv_schd_tm");
				schdL_bldr.addGroupFunc(sum(nvl(t1.trd_unit_qty, value(0))),
						"trd_unit_qty");
				schdL_bldr.addGroupFunc(sum(nvl(t1.base_unit_qty, value(0))),
						"base_unit_qty");
				schdL_bldr.addGroupFunc(sum(nvl(t1.ship_inst_qty, value(0))),
						"ship_inst_qty");
				schdL_bldr.addGroupFunc(sum(nvl(t1.abort_qty, value(0))), "abort_qty");
				schdL_bldr.addGroupFunc(sum(decode(t1.re_ship_schd_flg, value(true),
						t1.base_unit_qty, value(0))), "re_ship_schd_qty");
				schdL_bldr.addGroupFunc(count(t1.ship_schd_no), "cnt");
				schdL_bldr.addGroupFunc(min(t1.cmpl_flg), "cmpl_flg");
				schdL_bldr.addGroupFunc(max(t1.abort_flg), "abort_flg");
				// 売上予定
				schdL_bldr.addGroupFunc(sum(subQuery()
						.select(sum(S1W.base_unit_abort_qty))
						.from(S1W)
						.where(S1W.ship_schd_no.eq(t1.ship_schd_no))),
						"sls_abort_qty");
				schdL_bldr.addGroupFunc(min(subQuery()
						.select(min(S1W.cmpl_flg))
						.from(S1W)
						.where(S1W.ship_schd_no.eq(t1.ship_schd_no))),
						"sls_cmpl_flg");

				dbSelect("MSBEL5500_MST_SHIP_SCHD_S01", schdL, schdL_bldr, _updL);

				MCList<MST_SLS_SCHD_R> bindL = MCList.create(MST_SLS_SCHD_R.class);
				MST_SLS_SCHD_R bindR = null;
				
				for (MST_SHIP_PR_R r : _updL) {
					if (getBpR(r.cst_cd()).cst_iv_flg() && !r.purc_ddlv_flg()) {
						
						bindR = MST_SLS_SCHD_R.create();
						bindR.slo_d_no(r.slo_d_no());
						bindL.add(bindR);
					}
				}
				
				MCList<MST_SLS_SCHD_R> slsSchdL = MCList.create(MST_SLS_SCHD_R.class);
				
				if (!bindL.isEmpty()) {
					MST_SLS_SCHD_R t2 = MST_SLS_SCHD_R.create("T");
					MCQueryApiBuilder slsSchdL_bldr = MCQueryApiBuilder.create(t2);
					
					slsSchdL_bldr.setSelect(t2.slo_d_no);
					slsSchdL_bldr.setGroupBy(t2.slo_d_no);
					slsSchdL_bldr.setWhere(t2.slo_d_no.eq(bind("slo_d_no")));
					slsSchdL_bldr.addGroupFunc(sum(t2.base_unit_abort_qty), "base_unit_abort_qty");
					slsSchdL_bldr.addGroupFunc(min(t2.cmpl_flg), "cmpl_flg");
					
					dbSelect("MSBEL5500_MST_SLS_SCHD_S01", slsSchdL, slsSchdL_bldr, bindL);
				}
				
				MCIndexKey slsIdx = slsSchdL.createIndex(MST_SLS_SCHD_R.$slo_d_no);
	
				MCIndexKey idx = schdL.createIndex(MST_SHIP_SCHD_R.$ship_pr_no);
				MCList<MST_SHIP_PR_R> lst = getShipPrL(_updL);
				MCIndexKey idxPr = lst.createIndex(MST_SHIP_PR_R.$ship_pr_no);
				for (MST_SHIP_PR_R r : _updL) {
					MST_SHIP_SCHD_R schdR = schdL.getFirst(idx, r.ship_pr_no());

					if (isSame(r.trd_unit_cd(), r.base_unit_cd())) {
						r.trd_unit_qty(schdR.base_unit_qty());
					}
					else {
						ShipPr_DtlR itm = ShipPr_DtlR.create();
						itm.itm_cd(schdR.itm_cd());
						itm.itm_sub1(schdR.itm_sub1());
						itm.itm_sub2(schdR.itm_sub2());
						itm.itm_sub3(schdR.itm_sub3());
						MAVM_ITM_UNIT_R itmUnitR = getItmUnitR(itm, r.trd_unit_cd());
						MAM_ITM_R itmBaseUnitR = getItmR(itm);
						// 出荷進捗の取引単位に変換
						MCNumber un_inst_qty_t = rvrsBaseUnitConv(schdR.base_unit_qty(),
								itmUnitR.conv_base_qty(), itmUnitR.conv_qty(),
								itmUnitR.dec_place(), itmUnitR.rnd_typ());
						MCNumber re_un_inst_qty_b = convToBaseUnit(un_inst_qty_t,
								itmUnitR.conv_base_qty(), itmUnitR.conv_qty(),
								itmBaseUnitR.dec_place(), itmBaseUnitR.rnd_typ());
						if (isSame(re_un_inst_qty_b, schdR.base_unit_qty())) {
							r.trd_unit_cd(r.trd_unit_cd());
							r.trd_unit_qty(un_inst_qty_t);
						}
						else {
							r.trd_unit_cd(r.base_unit_cd());
							r.trd_unit_qty(schdR.base_unit_qty());
						}
					}
					r.ship_schd_tm(schdR.ship_schd_tm());
					r.dlv_schd_tm(schdR.dlv_schd_tm());
					r.base_unit_qty(schdR.base_unit_qty());
					r.ship_inst_qty(schdR.ship_inst_qty());
					r.ship_schd_abort_qty(schdR.abort_qty());
					r.re_ship_schd_qty(schdR.getNumber("re_ship_schd_qty"));
					r.ship_schd_split_flg(nvl(schdR.getNumber("cnt"), MCNumber.ZERO).intValue() > 1);
					r.ship_cmpl_flg(schdR.cmpl_flg());
					if(r.getBooleanNE("rem_abort_flg")) {
						r.abort_flg(schdR.abort_flg());
					}
					
					if (getBpR(r.cst_cd()).cst_iv_flg() && !r.purc_ddlv_flg() && !MAC_TRD_PTN_TYP.isSHIP(r.trd_ptn_typ())) {
						
						MST_SLS_SCHD_R slsSchdR = slsSchdL.getFirst(slsIdx, r.slo_d_no());
						r.sls_schd_abort_qty(nvl(slsSchdR.base_unit_abort_qty(), MCNumber.ZERO));
						r.sls_cmpl_flg(slsSchdR.cmpl_flg());
					}
					else {
						r.sls_schd_abort_qty(nvl(schdR.getNumber("sls_abort_qty"), MCNumber.ZERO));
						r.sls_cmpl_flg(schdR.getBoolean("sls_cmpl_flg"));
					}

					// 売上、出荷の場合、出荷＝納品とみなして設定する
					if (MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isSHIP(r.trd_ptn_typ())) {
						r.dlv_cmpl_flg(r.ship_cmpl_flg());
					}
					else if (MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())
							|| MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())
							|| MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())
							|| MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
						MCList<MST_SHIP_PR_R> l = lst.subList(idxPr, r.ship_pr_no());
						r.dlv_cmpl_flg(chkDlvCmpl(l));
					}
				}
				MST_SHIP_PR_R dbc = MST_SHIP_PR_R.create("T");
				MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
				builder.setSet(dbc.ship_schd_tm);
				builder.addSet(dbc.dlv_schd_tm);
				builder.addSet(dbc.trd_unit_qty);
				builder.addSet(dbc.trd_unit_cd);
				builder.addSet(dbc.base_unit_qty);
				builder.addSet(dbc.ship_inst_qty);
				builder.addSet(dbc.ship_schd_abort_qty);
				builder.addSet(dbc.re_ship_schd_qty);
				builder.addSet(dbc.ship_schd_split_flg);
				builder.addSet(dbc.ship_cmpl_flg);
				builder.addSet(dbc.sls_schd_abort_qty);
				builder.addSet(dbc.sls_cmpl_flg);
				builder.addSet(dbc.dlv_cmpl_flg);
				builder.addSet(dbc.abort_flg);
				dbUpdateKey("MSBEL5500_MST_SHIP_PR_U04", _updL, builder);
			}
		}
	}

	/**
	 * ShipSchd_Upd03オペレーション.<p>
	 *
	 * 出荷引当状況に対する出荷実績を更新する。<br>
	 */
	public class ShipSchd_Upd03 extends MSBEL_ShipSchdService_MC_A.ShipSchd_Upd03 {
		/**
		 * 更新対象リスト
		 */
		protected MCList<ShipPr_DtlR> _prL = null;

		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			// 前処理
			preProc();
			editUp();
			doDataCache();

			// メイン処理
			setOldAllocQty();
			makeAllocStsL();
			makeSchdL();
			makePrL();
			updAllocSts();
			callIoSchdDel01();
			callRevDataIns01ForUpd03();
			updShipSchd();
			updShipPr();
			callIoSchdIns01();
			callProvSchd();
			callOrdRegSrv(_prL);
			callWgRqstSrv(_prL);
		}

		/**
		 * 前処理
		 */
		protected void preProc() {
			_prL = MCList.create(ShipPr_DtlR.class);
			_updShipPrL = new UpdShipPrUpd03();
			_updShipSchdL = new UpdShipSchd();
			_updAllocStsL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			MCList<ShipSchd_Upd03_DtlR>
				schdL = MCList.create(ShipSchd_Upd03_DtlR.class),
				instL = MCList.create(ShipSchd_Upd03_DtlR.class);

			int i = 0;
			for (ShipSchd_Upd03_DtlR r : up0()) {
				r.setNumberNE(_$peg[0], i++);
				r.setNumberNE(_$peg[1], 1);
				if (!isNull(r.ship_inst_d_no())) {
					instL.add(r);
				}
				else {
					schdL.add(r);
				}
			}

			// 更新用リストの作成
			preMkAllocStsLForInst(instL);
			preMkAllocStsLForSchd(schdL);
			preMkSchdLForInst(instL);
			preMkSchdLForSchd(schdL);
			preMkPrL();
		}

		/**
		 * データキャッシュする
		 */
		protected void doDataCache() {
			// 本来であれば不要だが、後続で共通処理を呼び出す関係上トランのキャッシュが必要
			doTranDataCache(_prL);
			doItmCache(_prL);
			doItmUnitCache(_prL);
			doBpCache(_prL);
			doLocCache(_prL, null);
			doLgCtlCache(_prL);
			doLgGrpCache(_prL);
			doItmLgGrpCache(_prL);
			doXfrSchdCache(_prL);
			doIvCache(_prL);
			doShipActCache(_updAllocStsL, _updAllocStsL_bldr);
		}

		/**
		 * 出荷リストを作成する
		 */
		protected void makePrL() {
			for (ShipPr_DtlR r : _prL) {
				// 更新対象リストに追加
				_updShipPrL.addUpdR(r.sp());
			}
		}

		/**
		 * 出荷予定リストを作成する
		 */
		protected void makeSchdL() {
			MCIndexKey idx = _prL.createIndex(_$peg);
			for (ShipSchd_Upd03_DtlR upR : up0()) {
				ShipPr_DtlR prR = _prL.getFirst(idx, upR.toArray(idx.getKeys()));
				MCList<MST_SHIP_SCHD_R>
					schdL = _prL.subList(idx, upR.toArray(idx.getKeys())).innerRowList("ss", MST_SHIP_SCHD_R.class);
				// 出荷予定 or 出荷指図明細での実績数量
				MCNumber actQty =
					_updAllocStsL.subList(
						_updAllocStsLKey,
						upR.toArray(_updAllocStsLKey.getKeys())).sum("ship_act_qty");
				schdL.sort(MST_SHIP_SCHD_R.$ship_schd_no);
				for (MST_SHIP_SCHD_R schdR : schdL) {
					// 指図まとめ時に出荷指図数量＞基準単位数量になることがある
					MCNumber baseQty =
						!isNull(schdR.ship_inst_d_no()) ? schdR.ship_inst_qty() : schdR.base_unit_qty();

					if (baseQty.gte(actQty)) {
						schdR.ship_act_qty(actQty);
						actQty = MCNumber.ZERO;
					}
					else {
						if (schdR == schdL.get(schdL.size() - 1)) {
							// 最後の出荷予定は全残数を設定する
							schdR.ship_act_qty(actQty);
						}
						else {
							schdR.ship_act_qty(baseQty);
							actQty = actQty.subtract(baseQty); 
						}
					}
					if (upR.abort_flg()) {	// 打切
						schdR.abort_qty(
							baseQty.subtract(schdR.ship_act_qty()));
					}
					else {
						schdR.abort_qty(0);
					}
					schdR.abort_flg(upR.abort_flg());
					schdR.cmpl_flg(
						schdR.abort_flg() || schdR.ship_act_qty().gte(baseQty)
					);
					
					// 売上、出荷の場合、出荷＝納品とみなして設定する
					if (MAC_TRD_PTN_TYP.isSLS(prR.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isSHIP(prR.trd_ptn_typ())) {
						schdR.dlv_qty(schdR.ship_act_qty());
					}
					
					_updShipSchdL.addUpdR(schdR);
				}
			}
			setAllocWaitQty(_prL);
			setPrStsTyp(_prL);
		}

		/**
		 * 引当状況更新前に更新前の値を保持する
		 */
		protected void setOldAllocQty() {
			_updAllocStsL.addNumberColumn("old_ship_act_qty");
			_prL.addNumberColumn("old_ship_act_qty");

			for (MST_SHIP_ALLOC_STS_R r : _updAllocStsL) {
				r.setNumber("old_ship_act_qty", r.ship_act_qty());
			}
			for (ShipPr_DtlR prR : _prL) {
				prR.setNumber("old_ship_act_qty", prR.ss().ship_act_qty());
			}
		}

		/**
		 * 出荷予定リストを元に出荷進捗リストを作成する
		 */
		protected void preMkPrL() {
			MCList<MST_SHIP_PR_R> prL = MCList.create(MST_SHIP_PR_R.class);
			MCQueryApiBuilder prL_bldr = MCQueryApiBuilder.create(MST_SHIP_PR_R.create("T"));
			prL_bldr.setSelectAll();
			dbSelectKey("MSBEL5500_MST_SHIP_PR_S01", prL, prL_bldr, _prL.innerRowList("ss")); // 出荷予定のリストで検索する
			MCIndexKey idx = prL.createIndex(MST_SHIP_PR_R.$ship_pr_no);
			for (ShipPr_DtlR r : _prL) {
				MST_SHIP_PR_R prR = prL.getFirst(idx, r.ss().ship_pr_no());
				r.sp(prR);
				r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				r.upd02_flg(true); // 出荷予定 or 出荷指図明細単位に処理するのでUpd02と同等の扱いとする
			}
		}

		/**
		 * 出荷予定NOを元に出荷予定リストを作成する
		 */
		protected void preMkSchdLForSchd(MCList<ShipSchd_Upd03_DtlR> upSchdL) {
			if (upSchdL.isEmpty()) return;
			MCList<MST_SHIP_SCHD_R> schdL = MCList.create(MST_SHIP_SCHD_R.class);
			MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(MST_SHIP_SCHD_R.create("T"));
			schdL_bldr.setSelectAll();
			dbSelectKey("MSBEL5500_MST_SHIP_SCHD_S02", schdL, schdL_bldr, upSchdL);
			MCIndexKey idx = schdL.createIndex(MST_SHIP_SCHD_R.$ship_schd_no);
			for (ShipSchd_Upd03_DtlR r : upSchdL) {
				MST_SHIP_SCHD_R schdR = schdL.getFirst(idx, r.ship_schd_no());
				ShipPr_DtlR prR = _prL.add();
				prR.peg_no(r.getNumber(_$peg[0]));
				prR.peg_seq(r.getNumber(_$peg[1]));
				prR.ss(schdR);
				prR.setAttributes(r);
			}
		}

		/**
		 * 出荷指図明細NOを元に出荷予定リストを作成する
		 */
		protected void preMkSchdLForInst(MCList<ShipSchd_Upd03_DtlR> upInstL) {
			if (upInstL.isEmpty()) return;
			MCList<MST_SHIP_SCHD_R> schdL = MCList.create(MST_SHIP_SCHD_R.class);
			MST_SHIP_SCHD_R t = MST_SHIP_SCHD_R.create("T");
			MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(t);
			MST_SHIP_INST_D_R t1 = MST_SHIP_INST_D_R.create("T1");
			MST_SHIP_INST_R t2 = MST_SHIP_INST_R.create("T2");
			schdL.addDateColumn("inst_ship_schd_tm");
			schdL.addDateColumn("inst_dlv_schd_tm");
			schdL_bldr.setSelectAll();
			schdL_bldr.addSelect(t2.ship_schd_tm.as("inst_ship_schd_tm"),
					t2.dlv_schd_tm.as("inst_dlv_schd_tm"));
			schdL_bldr.addInnerJoin(t1,
					bracket(t1.ship_inst_d_no.eq(t.ship_inst_d_no)
							.and(t1.can_flg.eq(value(false)))));
			schdL_bldr.addInnerJoin(t2,
					bracket(t2.ship_inst_no.eq(t1.ship_inst_no)
							.and(t2.can_flg.eq(value(false)))));
			schdL_bldr.setWhere(t.ship_inst_d_no.eq(bind("ship_inst_d_no")));
			dbSelect("MSBEL5500_MST_SHIP_SCHD_S03", schdL, schdL_bldr, upInstL);
			MCIndexKey idx = schdL.createIndex(MST_SHIP_SCHD_R.$ship_inst_d_no);
			for (ShipSchd_Upd03_DtlR r : upInstL) {
				MCList<MST_SHIP_SCHD_R> lst = schdL.subList(idx, r.ship_inst_d_no());
				for (MST_SHIP_SCHD_R rr : lst) {
					ShipPr_DtlR prR = _prL.add();
					prR.peg_no(r.getNumber(_$peg[0]));
					prR.peg_seq(r.getNumber(_$peg[1]));
					prR.ss(rr);
					prR.inst_ship_schd_tm(rr.getDate("inst_ship_schd_tm"));
					prR.inst_dlv_schd_tm(rr.getDate("inst_dlv_schd_tm"));
					prR.setAttributes(rr);
				}
			}
		}
		
		/**
		 * 出荷予定NOを元に出荷引当状況リストを作成する
		 */
		protected void preMkAllocStsLForSchd(MCList<ShipSchd_Upd03_DtlR> upSchdL) {
			if (upSchdL.isEmpty()) return;
			MCList<MST_SHIP_ALLOC_STS_R> allocL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			MST_SHIP_ALLOC_STS_R t = MST_SHIP_ALLOC_STS_R.create("T");
			MCQueryApiBuilder allocL_bldr = MCQueryApiBuilder.create(t);
			MST_SHIP_SCHD_R t1 = MST_SHIP_SCHD_R.create("T1");
			allocL_bldr.setSelectAll();
			allocL_bldr.addSelect(t1.ship_fr_lg_grp_cd);
			allocL_bldr.addInnerJoin(t1, bracket(t1.ship_schd_no.eq(t.ship_schd_no)));
			allocL_bldr.setWhere(t.ship_schd_no.eq(bind("ship_schd_no")));
			dbSelect("MSBEL5500_MST_SHIP_ALLOC_STS_S01", allocL, allocL_bldr, upSchdL);
			MCIndexKey idx = allocL.createIndex(MST_SHIP_ALLOC_STS_R.$ship_schd_no);
			for (ShipSchd_Upd03_DtlR r : upSchdL) {
				MCList<MST_SHIP_ALLOC_STS_R> lst = allocL.subList(idx, r.ship_schd_no());
				lst.setNumberNE(_$peg[0], r.getNumber(_$peg[0]));
				lst.setNumberNE(_$peg[1], r.getNumber(_$peg[1]));
			}
			_updAllocStsL.addAll(allocL);
			_updAllocStsLKey = _updAllocStsL.createIndex(_$peg);
		}

		/**
		 * 出荷指図明細NOを元に出荷引当状況リストを作成する
		 */
		protected void preMkAllocStsLForInst(MCList<ShipSchd_Upd03_DtlR> upInstL) {
			if (upInstL.isEmpty()) return;
			MCList<MST_SHIP_ALLOC_STS_R> allocL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			MST_SHIP_ALLOC_STS_R t = MST_SHIP_ALLOC_STS_R.create("T");
			MCQueryApiBuilder allocL_bldr = MCQueryApiBuilder.create(t);
			MST_SHIP_INST_D_R t1 = MST_SHIP_INST_D_R.create("T1");
			allocL_bldr.setSelectAll();
			allocL_bldr.addSelect(t1.ship_lg_grp_cd.as("ship_fr_lg_grp_cd"));
			allocL_bldr.addInnerJoin(t1, bracket(t1.ship_inst_d_no.eq(t.ship_inst_d_no)));
			allocL_bldr.setWhere(t.ship_inst_d_no.eq(bind("ship_inst_d_no")));
			dbSelect("MSBEL5500_MST_SHIP_ALLOC_STS_S02", allocL, allocL_bldr, upInstL);
			MCIndexKey idx = allocL.createIndex(MST_SHIP_ALLOC_STS_R.$ship_inst_d_no);
			for (ShipSchd_Upd03_DtlR r : upInstL) {
				MCList<MST_SHIP_ALLOC_STS_R> lst = allocL.subList(idx,
						r.ship_inst_d_no());
				lst.setNumberNE(_$peg[0], r.getNumber(_$peg[0]));
				lst.setNumberNE(_$peg[1], r.getNumber(_$peg[1]));
			}
			_updAllocStsL.addAll(allocL);
			_updAllocStsLKey = _updAllocStsL.createIndex(_$peg);
		}

		/**
		 * 出荷引当状況リストを作成する
		 */
		protected void makeAllocStsL() { 

			for (ShipSchd_Upd03_DtlR upR : up0()) {
				MCList<MST_SHIP_ALLOC_STS_R> allocL = 
					_updAllocStsL.subList(_updAllocStsLKey, upR.toArray(_updAllocStsLKey.getKeys()));
				for (MST_SHIP_ALLOC_STS_R r : allocL) {
					// 出荷引当状況に対応する出荷実績数量を取得する
					MCList<MST_SHIP_ALLOC_STS_R>actL = getShipActL(r.ship_alloc_sts_no());
					MCNumber actQty = MCNumber.ZERO;
					for (MCList<MST_SHIP_ALLOC_STS_R>
							l : actL.groupList(
								MST_SHIP_ALLOC_STS_R.$ship_alloc_sts_no, "ship_act_d_no")) {
						actQty = sum(actQty, l.get(0).ship_act_qty());
					}
					r.ship_act_qty(actQty);
				}
			}
		}

		/**
		 * 受払予定を削除する
		 */
		protected void callIoSchdDel01() {
			MCList<MSW_IO_SCHD_DEL_R> cndL = MCList.create(MSW_IO_SCHD_DEL_R.class);

			// 出荷実績明細、および出荷引当状況に対応する受払予定を削除
			MCIndexKey idx = up1().createIndex(ShipSchd_Upd03_ActDtlR.$ship_alloc_sts_no);
			for (ShipPr_DtlR prR : _prL) {
				prR = prR.clone();
				prR.ss().iv_act_qty(0);	// 「輸出済」でない受払予定状況区分の設定に使用
				if (!MAC_STK_MNG_TYP.isMNG(getItmR(prR).stk_mng_typ())
					|| prR.purc_ddlv_flg()) {
					continue;
				}
				MCList<MST_SHIP_ALLOC_STS_R> allocL = 
					_updAllocStsL.subList(_updAllocStsLKey, prR.toArray(_updAllocStsLKey.getKeys()));

				for (MST_SHIP_ALLOC_STS_R r : allocL) {
					MCList<ShipSchd_Upd03_ActDtlR> l = up1().subList(idx, r.ship_alloc_sts_no());
					for (ShipSchd_Upd03_ActDtlR rr : l) {
						MST_SHIP_ALLOC_STS_R actR =
							getShipActL(r.ship_alloc_sts_no()).getFirst("ship_act_d_no", rr.ship_act_d_no());
						if (!isNull(actR) && actR.getNumber("iv_act_qty").isPositive()) {
							continue;
						}
						MSW_IO_SCHD_DEL_R cndR = cndL.add();
						cndR.io_schd_no(rr.ship_act_d_no());
						if (isNull(actR)) {
							cndR.io_schd_sts_typ(getDelIoSchdStsTyp(prR, r));
						}
						else {
							cndR.io_schd_sts_typ(getIoSchdStsTyp(prR, r));
						}
						cndR.io_schd_typ(getIoSchdTyp(prR));
					}

					MST_SHIP_ALLOC_STS_R wkR = r.clone();
					wkR.ship_act_qty(0);	// 「出荷済」以前の状態を削除
					MSW_IO_SCHD_DEL_R cndR = cndL.add();
					cndR.io_schd_no(wkR.ship_alloc_sts_no());
					cndR.io_schd_sts_typ(getIoSchdStsTyp(prR, wkR));
					cndR.io_schd_typ(
						getIoSchdTypForShip(
							prR.trd_ptn_typ(), prR.stk_id_typ(), false, isEx(prR)));
				}
			}

			if (!cndL.isEmpty()) {
				MSBEL_IoSchdService.IoSchd_Del01 o = MSBEL_IoSchdService.crtIoSchd_Del01();
				o.up0().setAll(
					cndL.groupBy(
						MSW_IO_SCHD_DEL_R.$io_schd_no,
						MSW_IO_SCHD_DEL_R.$io_schd_sts_typ,
						MSW_IO_SCHD_DEL_R.$io_schd_typ));
				o.exec();
			}
		}

		/**
		 * 受払予定を作成する
		 */
		protected void callIoSchdIns01() {

			MSBEL_IoSchdService.IoSchd_Ins01 o = MSBEL_IoSchdService.crtIoSchd_Ins01();
			Map_IoSchd_Ins01_DtlR_MST_SHIP_ALLOC_STS_R
				<IoSchd_Ins01_DtlR, MST_SHIP_ALLOC_STS_R, ShipPr_DtlR> mpr = createMap_IoSchd_Ins01_DtlR_MST_SHIP_ALLOC_STS_R(); 

			MCIndexKey idx = up1().createIndex(ShipSchd_Upd03_ActDtlR.$ship_act_d_no);
			for (MCList<ShipPr_DtlR> lst : _prL.groupList(_$peg)) {
				ShipPr_DtlR prR = lst.get(0).clone();
				prR.ss().iv_act_qty(0);	// 「輸出済」でない受払予定状況区分の設定に使用

				if (!MAC_STK_MNG_TYP.isMNG(getItmR(prR).stk_mng_typ())
					|| prR.purc_ddlv_flg()) {
					continue;
				}
				MCList<MST_SHIP_ALLOC_STS_R> allocL = 
					_updAllocStsL.subList(_updAllocStsLKey, prR.toArray(_updAllocStsLKey.getKeys()));

				for (MST_SHIP_ALLOC_STS_R allocR : allocL) {

					// 出荷引当状況に対して一部出荷の未出荷分の受払予定
					MCNumber qty = allocR.base_unit_qty().subtract(allocR.ship_act_qty());
					if (!isAbort(prR) && qty.isPositive()
							&& (!isIvShip(prR) || !prR.ss().cmpl_flg())) {

						MST_SHIP_ALLOC_STS_R yetR = allocR.clone();
						yetR.base_unit_qty(qty);
						yetR.ship_act_qty(0);	// 「出荷済」でない受払予定区分の設定に使用

						IoSchd_Ins01_DtlR ioSchdR = o.up0().add();
						ioSchdR.io_schd_sts_typ(getIoSchdStsTyp(prR, yetR));
						ioSchdR.io_schd_typ(
							getIoSchdTypForShip(
								prR.trd_ptn_typ(), prR.stk_id_typ(), false, isEx(prR)));
						copy(ioSchdR, yetR, prR, mpr);
					}
					if (!isEx(prR) || MAC_TRD_PTN_TYP.isSHIP(prR.trd_ptn_typ())) {
						// 輸出の出荷済のみ作成する（貸出の場合は作成しない）
						// 輸出以外の出荷済は売上予定SVで作成する
						continue;
					}
					// 出荷済＆輸出の場合のみ、出荷実績から作成
					MCList<MST_SHIP_ALLOC_STS_R> actL = getShipActL(allocR.ship_alloc_sts_no());
					for (MCList<MST_SHIP_ALLOC_STS_R> grpL : actL.groupList("ship_act_d_no")) {
						MST_SHIP_ALLOC_STS_R actR = grpL.get(0);

						// 上り電文にある実績のみ
						if (!isNull(actR.getString("ship_act_d_no"))
							&& actR.getNumber("iv_act_qty").isZero()
							&& !isNull(up1().getFirst(idx, actR.getString("ship_act_d_no")))) {
							actR.setNumberNE("sls_act_qty", nvl(grpL.sum("sls_io_act_qty"), MCNumber.ZERO));
	
							IoSchd_Ins01_DtlR ioSchdR = o.up0().add();
							ioSchdR.io_schd_sts_typ(getIoSchdStsTyp(prR, allocR));
							copy(ioSchdR, actR, prR, mpr);
						}
					}
				}
			}
			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}

		/**
		 * 支給予定サービスを実行する
		 */
		protected void callProvSchd() {
			// 輸出でインボイス登録済の場合は対象外（輸出分はUpd04で行う）
			MCList<ShipPr_DtlR> provL = _prL.subList(r -> !isEx(r) || r.ss().iv_schd_qty().isZero());
			if (provL.isEmpty())	return;

			// Upd01は事前にデータがキャッシュされている必要があるため、
			// チェック処理を呼び出す
			callProvSchdChk01(provL);
			callProvSchdSrv(provL);
		}

		/**
		 * 「改訂履歴データ更新リスト」テーブルにデータを登録するサービスを呼び出す
		 */
		protected void callRevDataIns01ForUpd03() {
			MCList<MST_SHIP_INST_R> bindL = createBindRevData(_updAllocStsL);
			MAUCL_RevDataService.RevData_Ins01 ope = MAUCL_RevDataService.crtRevData_Ins01();
			
			for (MST_SHIP_INST_R r : bindL) {
				RevData_Ins01_DtlR opeR = RevData_Ins01_DtlR.create();
				opeR.rev_data_src_no(r.ship_inst_no());
				opeR.rev_no(r.ship_inst_rev());
				opeR.rev_data_typ(MAC_REV_DATA_TYP.MST_SHIP_INST.value());
				ope.up0().add(opeR);
			}
			ope.exec();
		}
		
		protected MCList<MST_SHIP_INST_R> createBindRevData(MCList<MST_SHIP_ALLOC_STS_R> _updAllocStsL) {
			MCQueryApiBuilder allocWKBldr = MCQueryApiBuilder.create(MST_SHIP_ALLOC_STS_R.create("T"));
			dbWkDelete("MSBEL5500_MSW_SHIP_ALLOC_STS_D05", allocWKBldr.getBaseDbc());
			dbWkInsert("MSBEL5500_MSW_SHIP_ALLOC_STS_I04", _updAllocStsL.groupBy(MST_SHIP_ALLOC_STS_R.$ship_alloc_sts_no), allocWKBldr.getBaseDbc());

			MCList<MST_SHIP_INST_R> bindL = MCList.create(MST_SHIP_INST_R.class);
			MST_SHIP_INST_R inst = MST_SHIP_INST_R.create("INST");
			MST_SHIP_ALLOC_STS_R alloc = MST_SHIP_ALLOC_STS_R.create("ALLOC");
			MSW_SHIP_ALLOC_STS_KEY_R allocWK = MSW_SHIP_ALLOC_STS_KEY_R.create("ALLOCWK");
			MCQueryApiBuilder instBldr = MCQueryApiBuilder.create(inst);

			instBldr.setSelect(inst.ship_inst_no, inst.ship_inst_rev);
			instBldr.addInnerJoin(alloc, bracket(inst.ship_inst_no.eq(alloc.ship_inst_no)));
			instBldr.addInnerJoin(allocWK, bracket(alloc.ship_alloc_sts_no.eq(allocWK.ship_alloc_sts_no)));
			dbSelect("MSBEL5500_MST_SHIP_INST_S02", bindL, instBldr);
			
			dbWkDelete("MSBEL5500_MSW_SHIP_ALLOC_STS_D06", allocWKBldr.getBaseDbc());
			
			return bindL;
		}
		
		/**
		 * 出荷進捗を更新するクラス<br>
		 */
		public class UpdShipPrUpd03 extends UpdShipPr {
			@Override
			protected void dbExec() {
				// 新規追加、更新（打切、打切解除）、削除はないはずなので無視
				if (isNull(_updL)) {
					return;
				}
				// 更新後の出荷予定を取得する
				MCList<MST_SHIP_SCHD_R> schdL = MCList.create(MST_SHIP_SCHD_R.class);
				MST_SHIP_SCHD_R t = MST_SHIP_SCHD_R.create("T");
				MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(t);
				MST_SHIP_ALLOC_STS_R t1 = MST_SHIP_ALLOC_STS_R.create("T1");
				MST_SHIP_ACT_D_R t2 = MST_SHIP_ACT_D_R.create("T2");
				MST_SHIP_ACT_R t3 = MST_SHIP_ACT_R.create("T3");
				schdL_bldr.setSelect(
						t.ship_schd_no,
						t.ship_pr_no,
						t.ship_act_qty,
						t.abort_qty,
						t.cmpl_flg
				);
				schdL_bldr.addSelect(
						t3.ship_tm,
						t3.dlv_tm
				);
				schdL_bldr.addLeftOuterJoin(t1,
						bracket(t1.ship_schd_no.eq(t.ship_schd_no)
								.or(t1.ship_inst_d_no.eq(t.ship_inst_d_no))));
				schdL_bldr.addLeftOuterJoin(t2,
						bracket(t2.ship_alloc_sts_no.eq(t1.ship_alloc_sts_no)
								.and(t2.can_flg.eq(value(false)))));
				schdL_bldr.addLeftOuterJoin(t3,
						bracket(t3.ship_act_no.eq(t2.ship_act_no)));
				schdL_bldr.setWhere(t.ship_pr_no.eq(bind("ship_pr_no")));
				dbSelect("MSBEL5500_MST_SHIP_SCHD_S04", schdL, schdL_bldr, _updL);
	
				MCIndexKey idx = schdL.createIndex(MST_SHIP_SCHD_R.$ship_pr_no);
				MCList<MST_SHIP_PR_R> lst = getShipPrL(_updL);
				MCIndexKey idxPr = lst.createIndex(MST_SHIP_PR_R.$ship_pr_no);
				for (MST_SHIP_PR_R r : _updL) {
					MCList<MST_SHIP_SCHD_R> prL = schdL.subList(idx, r.ship_pr_no());
					if (prL.isEmpty()) {
						r.ship_act_qty(0);
						r.dlv_qty(0);
						r.ship_schd_abort_qty(0);
						r.ship_cmpl_flg(false);
						r.dlv_cmpl_flg(false);
						r.ship_tm(null);
						r.dlv_tm(null);
						continue;
					}
	
					// 出荷予定ごとの総計を取得
					r.ship_act_qty(0);
					r.ship_schd_abort_qty(0);
					for (MCList<MST_SHIP_SCHD_R>
							l : prL.groupList(MST_SHIP_SCHD_R.$ship_schd_no)) {
						MST_SHIP_SCHD_R schdR = l.get(0);
						r.ship_act_qty(sum(r.ship_act_qty(), schdR.ship_act_qty()));
						r.ship_schd_abort_qty(sum(r.ship_schd_abort_qty(), schdR.abort_qty()));
					}

					// 出荷進捗ごとの最小or最大を取得
					MCGroupByPolicy policy = new MCGroupByPolicy(MST_SHIP_SCHD_R.$ship_pr_no);
					policy.min("cmpl_flg");
					policy.max("ship_tm");
					policy.max("dlv_tm");
					MST_SHIP_SCHD_R prR = prL.groupBy(policy).get(0);

					r.ship_cmpl_flg(prR.cmpl_flg());
					if (r.ship_cmpl_flg()) {
						r.ship_tm(prR.getDate("ship_tm"));
						r.dlv_tm(prR.getDate("dlv_tm"));
					}
					else {
						r.ship_tm(null);
						r.dlv_tm(null);
					}

					// 売上、出荷の場合、出荷＝納品とみなして設定する
					if (MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isSHIP(r.trd_ptn_typ())) {
						r.dlv_qty(r.ship_act_qty());
						r.dlv_cmpl_flg(r.ship_cmpl_flg());
					}
					else if (MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())
							|| MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())
							|| MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())
							|| MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
						MCList<MST_SHIP_PR_R> l = lst.subList(idxPr, r.ship_pr_no());
						r.dlv_cmpl_flg(chkDlvCmpl(l));
					}
				}

				MST_SHIP_PR_R dbc = MST_SHIP_PR_R.create("T");
				MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
				builder.setSet(dbc.ship_act_qty);
				builder.addSet(dbc.dlv_qty);
				builder.addSet(dbc.ship_schd_abort_qty);
				builder.addSet(dbc.ship_cmpl_flg);
				builder.addSet(dbc.dlv_cmpl_flg);
				builder.addSet(dbc.ship_tm);
				builder.addSet(dbc.dlv_tm);
				dbUpdateKey("MSBEL5500_MST_SHIP_PR_U05", _updL, builder);
				// 販売状況区分の更新
				updKPI();
			}
		}
	}

	/**
	 * ShipSchd_Upd04オペレーション.<p>
	 *
	 * 出荷進捗、出荷予定のインボイス予定・実績数を更新する。<br>
	 */
	public class ShipSchd_Upd04 extends MSBEL_ShipSchdService_MC_A.ShipSchd_Upd04 {
		/**
		 * 更新対象リスト
		 */
		protected MCList<ShipPr_DtlR> _prL = MCList.create(ShipPr_DtlR.class);

		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			// 前処理
			preProc();
			editUp();
			doDataCache();

			// メイン処理
			callIoSchdDel01();
			setIvQty();
			updShipSchd();
			updShipPr();
			callIoSchdIns01();
			callProvSchd();
		}

		/**
		 * 前処理
		 */
		protected void preProc() {
			_prL = MCList.create(ShipPr_DtlR.class);
			_updShipPrL = new UpdShipPrUpd04();
			_updShipSchdL = new UpdShipSchd();
			_updAllocStsL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			int i = 0;
			for (ShipSchd_Upd04_DtlR r : up0()) {
				r.setNumberNE(_$peg[0], i++);
				r.setNumberNE(_$peg[1], 1);

				ShipPr_DtlR prR = _prL.add();
				prR.peg_no(r.getNumber(_$peg[0]));
				prR.peg_seq(r.getNumber(_$peg[1]));
				prR.sp().ship_pr_no(r.ship_pr_no());
				prR.ss().ship_pr_no(r.ship_pr_no());
				prR.ss().ship_schd_no(r.ship_schd_no());
				prR.setAttributes(r);
			}

			// 上り電文に対応する出荷進捗、出荷予定リストを作成
			doTranDataCache(_prL);
			for (ShipPr_DtlR r : _prL) {
				r.sp(getShipPrR(r.ship_pr_no()));
				r.ss(getShipSchdR(r.ship_schd_no()));
				r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				r.upd02_flg(true);	// 出荷予定 or 出荷指図明細単位に処理するのでUpd02と同等の扱いとする

				_updShipPrL.addUpdR(r.sp());
				_updShipSchdL.addUpdR(r.ss());
				MCList<MST_SHIP_ALLOC_STS_R> allocL = getAllocStsL(r.ship_schd_no());
				allocL.setNumberNE(_$peg[0], r.peg_no());
				allocL.setNumberNE(_$peg[1], r.peg_seq());
				_updAllocStsL.addAll(allocL);
			}
			_updAllocStsLKey = _updAllocStsL.createIndex(_$peg);
		}

		/**
		 * データをキャッシュする
		 */
		protected void doDataCache() {
			doItmCache(_prL);
			doItmUnitCache(_prL);
			doBpCache(_prL);
			doLocCache(_prL, null);
			doLgCtlCache(_prL);
			doLgGrpCache(_prL);
			doItmLgGrpCache(_prL);
			doXfrSchdCache(_prL);
			doIvCache(_prL);
			doIvActCache(_prL);
			doShipActCache(_updAllocStsL, _updAllocStsL_bldr);
		}

		/**
		 * インボイス出荷予定、実績数量を設定する
		 */
		protected void setIvQty() {
			for (ShipPr_DtlR r : _prL) {
				r.ss().iv_schd_qty(
					nvl(getIvL(r.ship_schd_no()).sum("base_unit_qty"), MCNumber.ZERO)
				);
				MCList<MST_SHIP_ALLOC_STS_R> ivActL = getIvActL(r.ship_schd_no());
				if (ivActL.isEmpty()) {
					r.ss().iv_act_qty(0);
				}
				else {
					MCNumber qty = MCNumber.ZERO;
					for (MCList<MST_SHIP_ALLOC_STS_R> lst : ivActL.groupList("iv_d_no", "ship_schd_no")) {
						qty = sum(qty, nvl(lst.get(0).getNumber("iv_qty"), MCNumber.ZERO));
					}
					r.ss().iv_act_qty(qty);
				}
			}
		}

		/**
		 * 受払予定を削除する
		 */
		protected void callIoSchdDel01() {
			if (up1().isEmpty()) {
				return;
			}

			MCList<MSW_IO_SCHD_DEL_R> cndL = MCList.create(MSW_IO_SCHD_DEL_R.class);

			MCList<MST_SHIP_ACT_D_R> actL = MCList.create(MST_SHIP_ACT_D_R.class);
			MST_SHIP_ACT_D_R t = MST_SHIP_ACT_D_R.create("T");
			MCQueryApiBuilder actL_bldr = MCQueryApiBuilder.create(t);
			actL_bldr.setSelect(
					t.ship_act_d_no,
					t.trd_ptn_typ,
					t.stk_id_typ
			);
			dbSelectKey("MSBEL5500_MST_SHIP_ACT_D_S01", actL, actL_bldr, up1());
			MCIndexKey idx = actL.createIndex(MST_SHIP_ACT_D_R.$ship_act_d_no);

			// 上り電文の出荷実績明細分、受払予定を削除する
			for (ShipSchd_Upd04_ActDtlR r : up1()) {
				MST_SHIP_ACT_D_R actR = actL.getFirst(idx, r.ship_act_d_no());

				MSW_IO_SCHD_DEL_R cndR = cndL.add();
				cndR.io_schd_no(r.ship_act_d_no());
				cndR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SHIP.value());
				cndR.io_schd_typ(
					getIoSchdTypForShip(actR.trd_ptn_typ(), actR.stk_id_typ(), true, false));

				cndR = cndL.add();
				cndR.io_schd_no(r.iv_ship_act_d_no());
				cndR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.EX.value());
				if (MAC_TRD_PTN_TYP.isSLS(actR.trd_ptn_typ())) {
					cndR.io_schd_typ(MSC_IO_SCHD_TYP.SLS.value());
				}
				else if (MAC_TRD_PTN_TYP.isPROV(actR.trd_ptn_typ())
							|| MAC_TRD_PTN_TYP.isPROV_RTN(actR.trd_ptn_typ())) {
					cndR.io_schd_typ(MSC_IO_SCHD_TYP.XFR_OUT_PROV.value());
				}
				else {
					cndR.io_schd_typ(MSC_IO_SCHD_TYP.XFR_OUT.value());
				}
			}
			if (!cndL.isEmpty()) {
				MSBEL_IoSchdService.IoSchd_Del01 o = MSBEL_IoSchdService.crtIoSchd_Del01();
				o.up0().setAll(cndL);
				o.exec();
			}
		}
		
		/**
		 * 受払予定を作成する
		 */
		protected void callIoSchdIns01() {
			if (up1().isEmpty()) {
				return;
			}
			
			// IV出荷実績取得
			MCList<MST_SHIP_ALLOC_STS_R> ivActL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			up0().forEach(r -> ivActL.addAll(getIvActL(r.ship_schd_no())));

			// 出荷実績取得
			MCList<MST_SHIP_ALLOC_STS_R> actL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			_updAllocStsL.forEach(r -> actL.addAll(getShipActL(r.ship_alloc_sts_no())));

			MCIndexKey
				ivIdx = up1().createIndex("iv_ship_act_d_no"),
				ivsaIdx = ivActL.createIndex("ship_act_d_no"),
				saIdx = actL.createIndex("ship_act_d_no"),
				ssIdx = _prL.createIndex("ship_schd_no");

			MSBEL_IoSchdService.IoSchd_Ins01 o = MSBEL_IoSchdService.crtIoSchd_Ins01();
			Map_IoSchd_Ins01_DtlR_MST_SHIP_ALLOC_STS_R
				<IoSchd_Ins01_DtlR, MST_SHIP_ALLOC_STS_R, ShipPr_DtlR> mpr = createMap_IoSchd_Ins01_DtlR_MST_SHIP_ALLOC_STS_R(); 

			// 上り電文の出荷実績明細分、受払予定を作成する
			// ※callInsIoSchdSrvでは出荷引当状況に対応する出荷実績明細すべて作成してしまう
			// ※Upd04では上り電文の出荷実績明細のみ作成するので、別途切り出す
			for (ShipSchd_Upd04_ActDtlR r : up1().groupBy(ShipSchd_Upd04_ActDtlR.$ship_act_d_no)) {
				MCList<MST_SHIP_ALLOC_STS_R> l = actL.subList(saIdx, r.ship_act_d_no());
				MST_SHIP_ALLOC_STS_R actR = l.get(0).clone();

				ShipPr_DtlR prR = _prL.getFirst(ssIdx, actR.ship_schd_no());
				if (!MAC_STK_MNG_TYP.isMNG(getItmR(prR).stk_mng_typ())
					|| prR.purc_ddlv_flg()) {
					continue;
				}
				// インボイス出荷実績明細分(上り電文で指定された分)、受払予定を作成する
				for (MST_SHIP_ALLOC_STS_R ivActR : ivActL.subList(ivsaIdx, r.ship_act_d_no())) {
					if (!isNull(up1().getFirst(ivIdx, ivActR.getString("iv_ship_act_d_no")))) {
						if (MAC_TRD_PTN_TYP.isSLS(prR.trd_ptn_typ())) {
							MST_SLO_D_R sodR = getSloDR(prR.slo_d_no());
							if (!sodR.sls_cststk_flg()) {
								// 預り売上の場合に作成しない
								// 「売上」「輸出済」を作成する
								IoSchd_Ins01_DtlR ioSchdR = o.up0().add();
								ioSchdR.io_schd_typ(MSC_IO_SCHD_TYP.SLS.value());
								ioSchdR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.EX.value());
								copy(ioSchdR, ivActR, prR, mpr);
							}
						}
						else {
							// 移送系(支給返品は輸出がない)の受払予定は入荷予定で「輸出済」を作成するので、ここでは作成しない
						}
					}
					// 残数算出
					actR.base_unit_qty(actR.base_unit_qty().subtract(ivActR.base_unit_qty()));
				}
				actR.setNumberNE("sls_act_qty", nvl(l.sum("sls_io_act_qty"), MCNumber.ZERO));

				// 残数あり(出荷返品数分を除く)の場合のみ、「出荷済」の受払予定を作成する
				IoSchd_Ins01_DtlR ioSchdR = IoSchd_Ins01_DtlR.create();
				ioSchdR.io_schd_typ(getIoSchdTyp(prR));
				ioSchdR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SHIP.value());
				copy(ioSchdR, actR, prR, mpr);
				if (ioSchdR.base_unit_qty().isPositive()) {
					o.up0().add(ioSchdR);
				}
			}
			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}

		/**
		 * 支給予定サービスを実行する
		 */
		protected void callProvSchd() {
			// Upd01は事前にデータがキャッシュされている必要があるため、
			// チェック処理を呼び出す
			callProvSchdChk01(_prL);
			callProvSchdSrv(_prL);
		}

		/**
		 * 出荷進捗を更新するクラス<br>
		 */
		public class UpdShipPrUpd04 extends UpdShipPr {
			@Override
			protected void dbExec() {
				// 新規追加、更新（打切、打切解除）、削除はないはずなので無視
				if (isNull(_updL)) {
					return;
				}
				// 更新後の出荷予定を取得する
				MCList<MST_SHIP_SCHD_R> schdL = MCList.create(MST_SHIP_SCHD_R.class);
				MST_SHIP_SCHD_R t = MST_SHIP_SCHD_R.create("T");
				MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(t);
				schdL.addBooleanColumn("sls_cmpl_flg");
				schdL_bldr.setGroupBy(t.ship_pr_no);
				schdL_bldr.setWhere(t.ship_pr_no.eq(bind("ship_pr_no")));
				schdL_bldr.addGroupFunc(sum(nvl(t.iv_schd_qty, value(0))), "iv_schd_qty");
				schdL_bldr.addGroupFunc(sum(nvl(t.iv_act_qty, value(0))), "iv_act_qty");
				dbSelect("MSBEL5500_MST_SHIP_SCHD_S05", schdL, schdL_bldr, _updL);

				MCIndexKey idx = schdL.createIndex(MST_SHIP_SCHD_R.$ship_pr_no);
				for (MST_SHIP_PR_R r : _updL) {
					MST_SHIP_SCHD_R  schdR = schdL.getFirst(idx, r.ship_pr_no());
					r.iv_schd_qty(schdR.iv_schd_qty());
					r.iv_act_qty(schdR.iv_act_qty());
				}
				MST_SHIP_PR_R dbc = MST_SHIP_PR_R.create("T");
				MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
				builder.setSet(dbc.iv_schd_qty);
				builder.addSet(dbc.iv_act_qty);
				dbUpdateKey("MSBEL5500_MST_SHIP_PR_U06", _updL, builder);

				// 販売状況区分の更新
				updKPI();
			}
		}
	}

	/**
	 * ShipSchd_Upd05オペレーション.<p>
	 *
	 * 出荷進捗、出荷予定の売上数、出荷返品数および納品数量を更新する。<br>
	 */
	public class ShipSchd_Upd05 extends MSBEL_ShipSchdService_MC_A.ShipSchd_Upd05 {
		/**
		 * 更新対象リスト
		 */
		protected MCList<ShipPr_DtlR> _prL = MCList.create(ShipPr_DtlR.class);

		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			// 前処理
			preProc();
			editUp();
			doDataCache();

			// メイン処理
			setQty();
			updShipSchd();
			updShipPr();
			callIoSchd();
			callOrdRegSrv(_prL);
			callWgRqstSrv(_prL);
		}

		/**
		 * 前処理
		 */
		protected void preProc() {
			_prL = MCList.create(ShipPr_DtlR.class);
			_updShipPrL = new UpdShipPrUpd05();
			_updShipSchdL = new UpdShipSchd();
			_updAllocStsL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			int i = 0;
			for (ShipSchd_Upd05_DtlR r : up0()) {
				r.setNumberNE(_$peg[0], i++);
				r.setNumberNE(_$peg[1], 1);

				ShipPr_DtlR prR = _prL.add();
				prR.peg_no(r.getNumber(_$peg[0]));
				prR.peg_seq(r.getNumber(_$peg[1]));
				prR.ship_schd_no(r.ship_schd_no());
				prR.setStringNE(ShipSchd_Upd05_DtlR.$dlv_slip_d_no, r.dlv_slip_d_no());
				prR.setBooleanNE(ShipSchd_Upd05_DtlR.$ship_ret_flg, r.ship_ret_flg());
				prR.setAttributes(r);
			}
			preProcShipSchd();
			preProcDlvSlip();

			// 上り電文に対応する出荷進捗、出荷予定リストを作成
			doTranDataCache(_prL);
			for (ShipPr_DtlR r : _prL) {
				r.sp(getShipPrR(r.ship_pr_no()));
				r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				r.upd02_flg(true);	// 出荷予定 or 出荷指図明細単位に処理するのでUpd02と同等の扱いとする

				if (isUpdArr(r)) {
					// 納品数量関連は insL を利用して更新する
					_updShipPrL.addInsR(r.sp());
				}
				else {
					// 売上、出荷返品関連は updL を利用して更新する
					_updShipPrL.addUpdR(r.sp());
				}
				_updShipSchdL.addUpdR(r.ss());

				// 受払予定の再作成、および実績更新に使用する（出荷引当状況は更新しない）
				MCList<MST_SHIP_ALLOC_STS_R> allocL = getAllocStsL(r.ship_schd_no());
				allocL.setNumberNE(_$peg[0], r.peg_no());
				allocL.setNumberNE(_$peg[1], r.peg_seq());
				_updAllocStsL.addAll(allocL);
			}
		}

		/**
		 * データをキャッシュする
		 */
		protected void doDataCache() {
			doItmCache(_prL);
			doItmUnitCache(_prL);
			doBpCache(_prL);
			doLocCache(_prL, null);
			doLgCtlCache(_prL);
			doLgGrpCache(_prL);
			doItmLgGrpCache(_prL);
			doXfrSchdCache(_prL);
			doIvCache(_prL);
			doShipActCache(_updAllocStsL, _updAllocStsL_bldr);
			doShipAct2Cache(_updAllocStsL, _updAllocStsL_bldr);	// 輸出
		}

		/**
		 * 更新対象が「入荷」か判定する
		 */
		protected boolean isUpdArr(ShipPr_DtlR prR) {
			return !isNull(prR.getString("dlv_slip_d_no")) && !prR.getBoolean("ship_ret_flg");
		}

		/**
		 * 更新対象が「出荷返品」か判定する
		 */
		protected boolean isUpdSRet(ShipPr_DtlR prR) {
			return !isNull(prR.getString("dlv_slip_d_no")) && prR.getBoolean("ship_ret_flg");
		}

		/**
		 * 上り電文から出荷予定を取得する
		 */
		protected void preProcShipSchd() {
			MCList<ShipSchd_Upd05_DtlR> tgtL = up0().subList(r -> !isNull(r.ship_schd_no()));
			if (tgtL.isEmpty()) {
				return;
			}
			MCList<MST_SHIP_SCHD_R> schdL = MCList.create(MST_SHIP_SCHD_R.class);
			MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(MST_SHIP_SCHD_R.create("T"));
			schdL_bldr.setSelectAll();
			dbSelectKey("MSBEL5500_MST_SHIP_SCHD_S06", schdL, schdL_bldr, tgtL);
			MCIndexKey idx = schdL.createIndex(MST_SHIP_SCHD_R.$ship_schd_no);
			for (ShipPr_DtlR r : _prL) {
				r.ss(schdL.getFirst(idx, r.ship_schd_no()));
				r.ship_pr_no(r.ss().ship_pr_no());
			}
		}

		/**
		 * 上り電文から出荷予定を取得する
		 */
		protected void preProcDlvSlip() {
			MCList<ShipSchd_Upd05_DtlR> tgtL = up0().subList(r -> !isNull(r.dlv_slip_d_no()));
			if (tgtL.isEmpty()) {
				return;
			}
			MCList<MST_SHIP_SCHD_R> schdL = MCList.create(MST_SHIP_SCHD_R.class);
			MST_SHIP_SCHD_R t = MST_SHIP_SCHD_R.create("T");
			MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(t);
			MST_SHIP_ALLOC_STS_R t1 = MST_SHIP_ALLOC_STS_R.create("T1");
			MST_SHIP_ACT_D_R t2 = MST_SHIP_ACT_D_R.create("T2");
			schdL.addStringColumn("dlv_slip_d_no");
			schdL_bldr.setSelectAll();
			schdL_bldr.addSelect(t2.dlv_slip_d_no);
			schdL_bldr.addInnerJoin(t1,
					bracket(t1.ship_schd_no.eq(t.ship_schd_no)
							.or(t1.ship_inst_d_no.eq(t.ship_inst_d_no))));
			schdL_bldr.addInnerJoin(t2,
					bracket(t2.ship_alloc_sts_no.eq(t1.ship_alloc_sts_no)
							.and(t2.can_flg.eq(value(false)))));
			schdL_bldr.setWhere(t2.dlv_slip_d_no.eq(bind("dlv_slip_d_no")));
			dbSelect("MSBEL5500_MST_SHIP_SCHD_S07", schdL, schdL_bldr, tgtL);
			
			MCIndexKey idx = _prL.createIndex(ShipSchd_Upd05_DtlR.$dlv_slip_d_no);
			MCList<ShipPr_DtlR> prL = _prL.createInstance();
			for (MCList<MST_SHIP_SCHD_R> l : schdL.groupList("dlv_slip_d_no")) {
				for (int i=0; i<l.size(); i++) {
					MST_SHIP_SCHD_R ssR = l.get(i);
					
					ShipPr_DtlR prR = _prL.getFirst(idx, ssR.getString("dlv_slip_d_no"));
					if (i > 0) {
						prR = prR.clone();
						prR.peg_seq(prR.getNumber(_$peg[1]).add(1));
					}
					prR.ss(ssR);
					prR.ship_pr_no(prR.ss().ship_pr_no());
					prL.add(prR);
				}
			}
			_prL.setAll(prL);
		}

		/**
		 * 出荷予定の売上数量、納品数量、出荷返品数量を設定する
		 */
		protected void setQty() {
			MCList<ShipPr_DtlR>
				shipL = _prL.subList(r -> !isEx(r)),
				ivShipL = _prL.subList(r -> isEx(r));

			// 輸出以外
			for (ShipPr_DtlR r : shipL) {
				MCNumber slsQty = MCNumber.ZERO, dlvQty = MCNumber.ZERO, retQty = MCNumber.ZERO;

				// 預りは売上予定の売上数量を使用する
				MST_SLO_D_R sodR = getSloDR(r.slo_d_no());
				if (sodR.sls_cststk_flg()) {
					MST_SHIP_SCHD_R ssR = getShipSchdR(r.ship_schd_no());
					slsQty = ssR.getNumber("sls_qty");
				}
				for (MST_SHIP_ALLOC_STS_R allocR : getAllocStsL(r.ship_schd_no())) {
					MCList<MST_SHIP_ALLOC_STS_R> actL = getShipActL(allocR.ship_alloc_sts_no());

					for (MCList<MST_SHIP_ALLOC_STS_R> l : actL.groupList("ship_act_d_no")) {
						MST_SHIP_ALLOC_STS_R actR = l.get(0);
						dlvQty = sum(dlvQty, nvl(actR.getNumber("dlv_qty"), MCNumber.ZERO));
						retQty = sum(retQty, nvl(actR.getNumber("ship_ret_qty"), MCNumber.ZERO));

						if (!sodR.sls_cststk_flg()) {	// 預り以外
							slsQty = sum(slsQty, nvl(l.sum("sls_io_act_qty"), MCNumber.ZERO));
						}
					}
				}
				r.ss().sls_qty(slsQty);
				r.ss().dlv_qty(dlvQty);
				r.ss().ship_ret_qty(retQty);
			}

			// 輸出
			for (ShipPr_DtlR r : ivShipL) {
				MCNumber slsQty = MCNumber.ZERO, dlvQty = MCNumber.ZERO, retQty = MCNumber.ZERO;

				// 預りは売上予定の売上数量を使用する
				MST_SLO_D_R sodR = getSloDR(r.slo_d_no());
				if (sodR.sls_cststk_flg()) {
					MST_SHIP_SCHD_R ssR = getShipSchdR(r.ship_schd_no());
					slsQty = ssR.getNumber("sls_qty");
				}
				for (MST_SHIP_ALLOC_STS_R allocR : getAllocStsL(r.ship_schd_no())) {
					MCList<MST_SHIP_ALLOC_STS_R> actL = getShipActL2(allocR.ship_alloc_sts_no());

					for (MCList<MST_SHIP_ALLOC_STS_R> l : actL.groupList("ship_act_d_no")) {
						MST_SHIP_ALLOC_STS_R actR = l.get(0);
						dlvQty = sum(dlvQty, nvl(actR.getNumber("dlv_qty"), MCNumber.ZERO));
						retQty = sum(retQty, nvl(actR.getNumber("ship_ret_qty"), MCNumber.ZERO));
						if (!sodR.sls_cststk_flg()) {	// 預り以外
							slsQty = sum(slsQty, nvl(l.sum("sls_io_act_qty"), MCNumber.ZERO));
						}
					}
				}
				r.ss().sls_qty(slsQty);
				r.ss().dlv_qty(dlvQty);
				r.ss().ship_ret_qty(retQty);
			}
		}

		/**
		 * 受払予定を再作成する
		 */
		protected void callIoSchd() {
			MCList<MSW_IO_SCHD_DEL_R> delL = MCList.create(MSW_IO_SCHD_DEL_R.class);
			MCList<IoSchd_Ins01_DtlR> insL = MCList.create(IoSchd_Ins01_DtlR.class);
			Map_IoSchd_Ins01_DtlR_MST_SHIP_ALLOC_STS_R
				<IoSchd_Ins01_DtlR, MST_SHIP_ALLOC_STS_R, ShipPr_DtlR> mpr = createMap_IoSchd_Ins01_DtlR_MST_SHIP_ALLOC_STS_R(); 

			// 引数の納品書明細NOの出荷実績明細に対応する受払予定を再作成
			MCIndexKey idx = up0().createIndex(ShipSchd_Upd05_DtlR.$dlv_slip_d_no);
			for (MCList<ShipPr_DtlR> gl : _prL.groupList(ShipPr_DtlR.$ship_schd_no)) {
				ShipPr_DtlR prR = gl.get(0);

				if (!MAC_STK_MNG_TYP.isMNG(getItmR(prR).stk_mng_typ())
					|| prR.purc_ddlv_flg()
					|| !isUpdSRet(prR)) {
					continue;
				}
				for (MST_SHIP_ALLOC_STS_R allocR : getAllocStsL(prR.ship_schd_no())) {
					MCList<MST_SHIP_ALLOC_STS_R> actL = getShipActL(allocR.ship_alloc_sts_no());

					for (MCList<MST_SHIP_ALLOC_STS_R> grpL : actL.groupList("ship_act_d_no")) {
						MST_SHIP_ALLOC_STS_R actR = grpL.get(0).clone();
						if (up0().getFirst(idx, actR.getString("dlv_slip_d_no")) != null) {

							// 削除
							MSW_IO_SCHD_DEL_R delR = delL.add();
							delR.io_schd_no(actR.getString("ship_act_d_no"));
							delR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SHIP.value());
							delR.io_schd_typ(MSC_IO_SCHD_TYP.SLS.value());

							// 新規
							// ここで作成する「出荷済」の受払予定は輸出、売上、返品を考慮する必要がある。
							// 売上数量、返品数量はマッパー内で処理するが、輸出分は考慮していないのでここで減算する
							if (isEx(prR)) {
								actR.base_unit_qty(actR.base_unit_qty().subtract(actR.getNumberNE("iv_act_qty")));
							}
							IoSchd_Ins01_DtlR insR = IoSchd_Ins01_DtlR.create();
							insR.io_schd_no(actR.getString("ship_act_d_no"));
							insR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SHIP.value());
							insR.io_schd_typ(MSC_IO_SCHD_TYP.SLS.value());
							copy(insR, actR, prR, mpr);
							if (insR.base_unit_qty().isPositive()) {
								insL.add(insR);
							}
						}
					}
				}
			}
			if (!delL.isEmpty()) {
				MSBEL_IoSchdService.IoSchd_Del01 o = MSBEL_IoSchdService.crtIoSchd_Del01();
				o.up0().setAll(delL);
				o.exec();
			}
			if (!insL.isEmpty()) {
				MSBEL_IoSchdService.IoSchd_Ins01 o = MSBEL_IoSchdService.crtIoSchd_Ins01();
				o.up0().setAll(insL);
				o.exec();
			}
		}

		/**
		 * 出荷進捗を更新するクラス<br>
		 */
		public class UpdShipPrUpd05 extends UpdShipPr {
			@Override
			protected void dbExec() {
				// 売上、出荷返品関連の更新（_updL を利用）
				updSlsAndSret(_updL, _updL_bldr);
				// 納品関連の更新（_insL を利用）
				updDlv(_insL);
				// 販売状況区分の更新
				updKPI();
			}
	
			/**
			 * 移送・支給の入荷による納品数量に関連する項目を更新する
			 */
			protected void updDlv(MCList<MST_SHIP_PR_R> updL) {
				if (isNull(updL)) {
					return;
				}
				MCList<MST_SHIP_PR_R> lst = getShipPrL(updL);
				MCIndexKey idxPr = lst.createIndex(MST_SHIP_PR_R.$ship_pr_no);
				
				MCList<MST_SHIP_PR_R>[] gArry = lst.groupList(MST_SHIP_PR_R.$ship_pr_no, "ship_schd_no");
				MCList<MST_SHIP_PR_R> glst = MCList.create(MST_SHIP_PR_R.class);
				for (MCList<MST_SHIP_PR_R> arry : gArry) {
					glst.add(arry.get(0));
				}
				MCIndexKey idxPrG = glst.createIndex(MST_SHIP_PR_R.$ship_pr_no);				
	
				for (MST_SHIP_PR_R r : updL) {
					MCList<MST_SHIP_PR_R> gl = glst.subList(idxPrG, r.ship_pr_no());
					r.dlv_qty(nvl(gl.sum("dlv_qty"), MCNumber.ZERO));
					
					MCList<MST_SHIP_PR_R> l = lst.subList(idxPr, r.ship_pr_no());
					r.dlv_cmpl_flg(chkDlvCmpl(l));
				}
				MST_SHIP_PR_R dbc = MST_SHIP_PR_R.create("T");
				MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
				builder.setSet(dbc.dlv_qty);
				builder.addSet(dbc.dlv_cmpl_flg);
				dbUpdateKey("MSBEL5500_MST_SHIP_PR_U07", updL, builder);
			}
	
	
			/**
			 * 売上、または出荷返品に関連する項目を更新する
			 */
			protected void updSlsAndSret(MCList<MST_SHIP_PR_R> updL, MCQueryApiBuilder updL_bldr) {
				if (isNull(updL)) {
					return;
				}
				dbWkDelete("MSBEL5500_MSW_SHIP_PR_D01", updL_bldr.getBaseDbc());
				dbWkInsert("MSBEL5500_MSW_SHIP_PR_I01", updL.groupBy(MST_SHIP_PR_R.$ship_pr_no), updL_bldr.getBaseDbc());

				// 更新後の出荷予定を取得する
				MCList<MST_SHIP_SCHD_R> schdL = MCList.create(MST_SHIP_SCHD_R.class);
				MST_SHIP_SCHD_R t = MST_SHIP_SCHD_R.create("T");
				MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(t);
				MSW_SHIP_PR_KEY_R w = MSW_SHIP_PR_KEY_R.create("W");
				MST_SHIP_PR_R t1 = MST_SHIP_PR_R.create("T1");
				MST_SLS_SCHD_R t2 = MST_SLS_SCHD_R.create("T2");
				MCTempView t3 = createTempView("T3");
				MSW_SHIP_PR_KEY_R S1W1 = MSW_SHIP_PR_KEY_R.create("W1");
				MST_SHIP_PR_R S1W2 = MST_SHIP_PR_R.create("W2");
				MST_SLS_SCHD_R S1W3 = MST_SLS_SCHD_R.create("W3");
				MST_SLS_ACT_D_R S1W4 = MST_SLS_ACT_D_R.create("W4");
				MST_SLS_ACT_R S1W5 = MST_SLS_ACT_R.create("W5");
				MST_SLO_D_R t4 = MST_SLO_D_R.create("T4");
				MST_SLO_R t5 = MST_SLO_R.create("T5");
				schdL.addDateColumn("sls_dt");
				schdL.addDateColumn("slo_dt");
				schdL_bldr.setSelect(
						t.ship_schd_no,
						t.ship_pr_no,
						t.sls_qty,
						t.ship_ret_qty
				);
				schdL_bldr.addSelect(
						t2.sls_schd_no,
						t2.base_unit_abort_qty.as("abort_qty"),
						t2.cmpl_flg,
						t3.pr(S1W5.sls_dt),
						t5.slo_dt
				);
				schdL_bldr.addInnerJoin(w, bracket(w.ship_pr_no.eq(t.ship_pr_no)));
				schdL_bldr.addInnerJoin(t1, bracket(t1.ship_pr_no.eq(t.ship_pr_no)));
				schdL_bldr.addLeftOuterJoin(t2, bracket(t2.slo_d_no.eq(t1.slo_d_no)));
				schdL_bldr.addLeftOuterJoin(subQuery()
						.select(S1W3.sls_schd_no, S1W5.sls_dt)
						.from(S1W1.innerJoin(S1W2)
								.on(bracket(S1W2.ship_pr_no.eq(S1W1.ship_pr_no)))
								.innerJoin(S1W3)
								.on(bracket(S1W3.slo_d_no.eq(S1W2.slo_d_no)))
								.innerJoin(S1W4)
								.on(bracket(S1W4.sls_schd_no.eq(S1W3.sls_schd_no)))
								.innerJoin(S1W5)
								.on(bracket(S1W5.sls_act_no.eq(S1W4.sls_act_no)
										.and(S1W5.sls_act_seq.eq(S1W4.sls_act_seq))
										.and(S1W5.slip_sts_typ.eq(
												value(MAC_SLIP_STS_TYP.CRT.value()))))))
						.view(t3), bracket(t3.pr(S1W3.sls_schd_no).eq(t2.sls_schd_no)));
				schdL_bldr.addLeftOuterJoin(t4, bracket(t4.slo_d_no.eq(t1.slo_d_no)));
				schdL_bldr.addLeftOuterJoin(t5, bracket(t5.slo_no.eq(t4.slo_no)));
				dbSelect("MSBEL5500_MST_SHIP_SCHD_S08", schdL, schdL_bldr);
				
				MCIndexKey idx = schdL.createIndex(MST_SHIP_SCHD_R.$ship_pr_no);
				
				// ＬＴ取得用ワークリスト
				MCList<MST_SHIP_PR_R> wkShipPrL = MCList.create(MST_SHIP_PR_R.class);
				String sloDt = "slo_dt";
				wkShipPrL.addDateColumn(sloDt);
				
				for (MST_SHIP_PR_R r : updL) {
					MCList<MST_SHIP_SCHD_R> prL = schdL.subList(idx, r.ship_pr_no());
					if (prL.isEmpty()) {
						r.sls_qty(0);
						r.ship_ret_qty(0);
						r.sls_schd_abort_qty(0);
						r.sls_cmpl_flg(false);
						r.sls_dt(null);
						r.act_dlv_lt(null);
						continue;
					}
	
					// 出荷予定ごとの総計を取得
					r.sls_qty(0);
					r.ship_ret_qty(0);
					r.sls_schd_abort_qty(0);
					for (MCList<MST_SHIP_SCHD_R>
							l : prL.groupList(MST_SHIP_SCHD_R.$ship_schd_no)) {
						MST_SHIP_SCHD_R schdR = l.get(0);
						r.sls_qty(sum(r.sls_qty(), schdR.sls_qty()));
						r.ship_ret_qty(sum(r.ship_ret_qty(), schdR.ship_ret_qty()));
					}

					// 売上予定ごとの総計を取得
					for (MCList<MST_SHIP_SCHD_R> l : prL.groupList("sls_schd_no")) {
						MST_SHIP_SCHD_R schdR = l.get(0);
						r.sls_schd_abort_qty(sum(r.sls_schd_abort_qty(), schdR.abort_qty()));
					}
	
					// 出荷進捗ごとの最小or最大を取得
					MCGroupByPolicy policy = new MCGroupByPolicy(MST_SHIP_SCHD_R.$ship_pr_no);
					policy.min("cmpl_flg");
					policy.max("sls_dt");
					policy.max("slo_dt");
					MST_SHIP_SCHD_R prR = prL.groupBy(policy).get(0);
	
					r.sls_cmpl_flg(prR.cmpl_flg());
					r.sls_dt(r.sls_cmpl_flg() ? prR.getDate("sls_dt") : null);
					
					// ＬＴ取得用ワークリストに追加
					if (r.ship_cmpl_flg() && r.sls_cmpl_flg()
							&& !isNull(prR.getDate("slo_dt"))) {
						MST_SHIP_PR_R wkShipPrR = MST_SHIP_PR_R.create();
						MCRow.copyall(wkShipPrR, r);
						wkShipPrR.setDateNE(sloDt, prR.getDate("slo_dt"));
						wkShipPrL.add(wkShipPrR);
					}
				}
				// カレンダＣＤ設定
				String stdCalCd = "std_cal_cd";
				wkShipPrL.addStringColumn(stdCalCd, getCo().std_cal_cd());
				// 納品ＬＴ取得
				execCalDaysBatch(MST_SHIP_PR_R.$act_dlv_lt, wkShipPrL, sloDt, MST_SHIP_PR_R.$dlv_tm, stdCalCd);
				MCIndexKey idxWkShipPrL = wkShipPrL.createIndex(MST_SHIP_PR_R.$ship_pr_no);
				// 納品ＬＴ設定
				for(MST_SHIP_PR_R r : updL){
					MCList<MST_SHIP_PR_R> subWkShiPrL = wkShipPrL.subList(idxWkShipPrL, r.ship_pr_no());
					if (!subWkShiPrL.isEmpty()) {
						MCNumber days = subWkShiPrL.get(0).act_dlv_lt();
						r.act_dlv_lt(
							days == null || isSame(days, MCNumber.ZERO) ? null : days.subtract(1)
						);
					}
					else {
						r.act_dlv_lt(null);
					}
				}
				MST_SHIP_PR_R dbc = MST_SHIP_PR_R.create("T");
				MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
				builder.setSet(dbc.sls_qty);
				builder.addSet(dbc.ship_ret_qty);
				builder.addSet(dbc.sls_schd_abort_qty);
				builder.addSet(dbc.sls_cmpl_flg);
				builder.addSet(dbc.sls_dt);
				builder.addSet(dbc.act_dlv_lt);
				dbUpdateKey("MSBEL5500_MST_SHIP_PR_U08", updL, builder);
			}
		}
	}

	protected MCList<MST_SHIP_PR_R> getShipPrL(MCList<MST_SHIP_PR_R> updL) {
		MCList<MST_SHIP_PR_R> lst = MCList.create(MST_SHIP_PR_R.class);
		MST_SHIP_PR_R t = MST_SHIP_PR_R.create("T");
		MCQueryApiBuilder lst_bldr = MCQueryApiBuilder.create(t);
		MST_SHIP_SCHD_R t1 = MST_SHIP_SCHD_R.create("T1");
		MST_SHIP_ALLOC_STS_R t2 = MST_SHIP_ALLOC_STS_R.create("T2");
		MST_SHIP_ACT_D_R t3 = MST_SHIP_ACT_D_R.create("T3");
		MST_ARR_PR_R t4 = MST_ARR_PR_R.create("T4");
		MSW_SHIP_PR_KEY_R w = MSW_SHIP_PR_KEY_R.create("W");
		dbWkDelete("MSBEL5500_MSW_SHIP_PR_KEY_D01", lst_bldr.getBaseDbc());
		dbWkInsert("MSBEL5500_MSW_SHIP_PR_KEY_I01", updL, lst_bldr.getBaseDbc());
		lst.addBooleanColumn("arr_cmpl_flg");
		lst.addBooleanColumn("ship_schd_abort_flg");
		lst_bldr.setSelect(t.ship_pr_no, t.ship_cmpl_flg);
		lst_bldr.addSelect(t1.ship_schd_no, t1.abort_flg.as("ship_schd_abort_flg"),
				t3.dlv_slip_d_no.as("ship_dlv_slip_d_no"),
				t4.dlv_slip_d_no.as("arr_dlv_slip_d_no"), t1.dlv_qty, t4.arr_cmpl_flg,
				t4.arr_pr_no);
		lst_bldr.addInnerJoin(t1,
				bracket(t1.ship_pr_no.eq(t.ship_pr_no)));
		lst_bldr.addInnerJoin(t2,
				bracket(t2.ship_schd_no.eq(t1.ship_schd_no)));
		lst_bldr.addLeftOuterJoin(t3,
				bracket(t3.ship_alloc_sts_no.eq(t2.ship_alloc_sts_no)
						.and(t3.can_flg.eq(value(false)))));
		lst_bldr.addLeftOuterJoin(t4,
				bracket(t4.dlv_slip_d_no.eq(t3.dlv_slip_d_no)));
		lst_bldr.addInnerJoin(w, w.ship_pr_no.eq(t.ship_pr_no));
		dbSelect("MSBEL5500_MST_SHIP_PR_S02", lst, lst_bldr);

		MCList<MST_SHIP_PR_R> tmpL = lst.shallowClone();
		tmpL.clear();

		lst_bldr = MCQueryApiBuilder.create(t);
		lst_bldr.setSelect(t.ship_pr_no, t.ship_cmpl_flg);
		lst_bldr.addSelect(t1.ship_schd_no, t1.abort_flg.as("ship_schd_abort_flg"),
				t3.dlv_slip_d_no.as("ship_dlv_slip_d_no"),
				t4.dlv_slip_d_no.as("arr_dlv_slip_d_no"), t1.dlv_qty, t4.arr_cmpl_flg,
				t4.arr_pr_no);
		lst_bldr.addInnerJoin(t1,
				bracket(t1.ship_pr_no.eq(t.ship_pr_no)));
		lst_bldr.addInnerJoin(t2,
				bracket(t2.ship_inst_d_no.eq(t1.ship_inst_d_no)));
		lst_bldr.addLeftOuterJoin(t3,
				bracket(t3.ship_alloc_sts_no.eq(t2.ship_alloc_sts_no)
						.and(t3.can_flg.eq(value(false)))));
		lst_bldr.addLeftOuterJoin(t4,
				bracket(t4.dlv_slip_d_no.eq(t3.dlv_slip_d_no)));
		lst_bldr.addInnerJoin(w, w.ship_pr_no.eq(t.ship_pr_no));
		dbSelect("MSBEL5500_MST_SHIP_PR_S04", tmpL, lst_bldr);
		lst.merge(tmpL, "ship_schd_no", "ship_dlv_slip_d_no", "arr_dlv_slip_d_no", "arr_pr_no");
		return lst;
	}
	
	/**
	 * 納品完了かチェックする
	 */
	protected boolean chkDlvCmpl(MCList<MST_SHIP_PR_R> arrL) {
		// 出荷完了済、かつすべての出荷に対する入荷が完了しているか
		for (MST_SHIP_PR_R r : arrL) {
			if (r.getBooleanNE("ship_schd_abort_flg")
					&& isNull(r.getString("ship_dlv_slip_d_no"))) {
				continue;
			}
			if (!r.ship_cmpl_flg()) {
				// 出荷完了していない→納品未完了とみなす
				return false;
			}
			// 出荷側と入荷側の納品書明細NOが一致していない
			// 入荷完了していない→納品未完了とみなす
			if (!isSame(r.getString("ship_dlv_slip_d_no"), r.getString("arr_dlv_slip_d_no"))
				|| !r.getBoolean("arr_cmpl_flg")) {
				return false;
			}
		}
		return true;
	}
	/**
	 * ShipSchd_Upd06オペレーション.<p>
	 *
	 * 出荷予定、または出荷引当状況ごとに引当解除を行う。<br>
	 */
	public class ShipSchd_Upd06 extends MSBEL_ShipSchdService_MC_A.ShipSchd_Upd06 {
		/**
		 * 更新対象リスト
		 */
		protected MCList<ShipPr_DtlR> _prL = MCList.create(ShipPr_DtlR.class);

		protected MSBEL_AllocMngService.Alloc_Avl_Sprt01 _allocAvlSprt01 = null;
		protected MCIndexKey _allocAvlSprtKey = null;
		
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			// 前処理
			preProc();
			editUp();
			doDataCache();

			// メイン処理
			relAllocQty();
			updAllocSts();
			updShipSchd();
			updShipPr();
			callShipLotUpdSrv(_prL);
			callDelIoSchdSrv(_prL);
			callInsIoSchdSrv(_prL);
		}

		/**
		 * 前処理
		 */
		protected void preProc() {
			_prL = MCList.create(ShipPr_DtlR.class);
			_updShipPrL = new UpdShipPrUpd06();
			_updShipSchdL = new UpdShipSchd();
			_updAllocStsL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			_allocAvlSprt01 = MSBEL_AllocMngService.crtAlloc_Avl_Sprt01();

			// Chk06を利用してキャッシュを再構築する
			MSBEL_ShipSchdService.ShipSchd_Chk06
				chk06 = MSBEL_ShipSchdService.crtShipSchd_Chk06();
			chk06.up0().setAll(up0());
			chk06.preProc();
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			for (ShipSchd_Upd06_DtlR r : up0()) {
				if (!isNull(r.ship_alloc_sts_no())) {
					MST_SHIP_ALLOC_STS_R allocR = getAllocStsR(r.ship_alloc_sts_no());
					r.ship_schd_no(allocR.ship_schd_no());
				}
			}
			// 出荷予定単位に引当解除対象を設定
			for (MCList<ShipSchd_Upd06_DtlR> lst : up0().groupList(ShipSchd_Upd06_DtlR.$ship_schd_no)) {
				ShipSchd_Upd06_DtlR r = lst.get(0);

				ShipPr_DtlR prR = _prL.add();
				prR.ss(getShipSchdR(r.ship_schd_no()));
				prR.sp(getShipPrR(prR.ss().ship_pr_no()));
				prR.peg_no(_prL.size() + 1);
				prR.peg_seq(1);
				prR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				prR.upd02_flg(true);	// 出荷予定単位に処理するのでUpd02と同等の扱いとする
				prR.setAttributes(r);

				_updShipPrL.addUpdR(prR.sp());
				_updShipSchdL.addUpdR(prR.ss());

				MCList<MST_SHIP_ALLOC_STS_R> allocL = getAllocStsL(r.ship_schd_no());
				allocL.setNumberNE(_$peg[0], prR.peg_no());
				allocL.setNumberNE(_$peg[1], prR.peg_seq());
				_updAllocStsL.addAll(allocL);

				lst.setNumberNE(_$peg[0], prR.peg_no());
				lst.setNumberNE(_$peg[1], prR.peg_seq());
			}
			_updAllocStsLKey = _updAllocStsL.createIndex(_$peg);
		}

		/**
		 * データをキャッシュする
		 */
		protected void doDataCache() {
			doItmCache(_prL);
			doItmUnitCache(_prL);
			doBpCache(_prL);
			doLocCache(_prL, null);
			doLgCtlCache(_prL);
			doLgGrpCache(_prL);
			doItmLgGrpCache(_prL);
			doXfrSchdCache(_prL);
			doIvCache(_prL);
			doAllocAvlSprt(_allocAvlSprt01, _prL);
			_allocAvlSprtKey = _allocAvlSprt01.down0().createIndex(Alloc_Avl_Sprt01_CndR.$peg_no);
		}

		/**
		 * 引当を解除する
		 */
		protected void relAllocQty() {
			MCList<ShipSchd_Upd06_DtlR>
				allocL = MCList.create(ShipSchd_Upd06_DtlR.class),
				schdL = MCList.create(ShipSchd_Upd06_DtlR.class);
			for (ShipSchd_Upd06_DtlR r : up0()) {
				if (!isNull(r.ship_alloc_sts_no())) {
					allocL.add(r);
				}
				else {
					schdL.add(r);
				}
			}
			relAllocQtyForAllocSts(allocL);
			relAllocQtyForShipSchd(schdL);
			groupByShipAllocSts(_prL);
			setAllocStsNo();
			setAllocWaitQty(_prL);	// 引当数量、保留数量
		}

		/**
		 * 出荷引当状況から引当を解除する
		 */
		protected void relAllocQtyForAllocSts(MCList<ShipSchd_Upd06_DtlR> upL) {
			MCIndexKey idx = _updAllocStsL.createIndex(MST_SHIP_ALLOC_STS_R.$ship_alloc_sts_no);
			MCIndexKey idxPr = _prL.createIndex(_$peg);
			MCList<MST_SHIP_ALLOC_STS_R> splitL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			for (ShipSchd_Upd06_DtlR r : upL) {
				ShipPr_DtlR prR = _prL.getFirst(idxPr, r.toArray(idxPr.getKeys()));
				MST_SHIP_ALLOC_STS_R
					allocR = _updAllocStsL.getFirst(idx, r.ship_alloc_sts_no()),
					relR = null;

				if (!allocR.alloc_flg()) {
					continue;	// 未引当は無視
				}
				MCNumber relQty = r.alloc_rel_qty();
				if (relQty.gte(allocR.pack_unit_qty())) {
					relR = allocR;
				}
				else {
					MAVM_ITM_UNIT_R unitR = getItmUnitR(prR, allocR.pack_unit_cd());
					MST_SHIP_ALLOC_STS_R splitR = allocR.clone();
					splitR.ship_alloc_sts_no(null);
					splitR.pack_unit_qty(relQty);
					splitR.base_unit_qty(
						convToBaseUnit(
							splitR.pack_unit_qty(), unitR.conv_base_qty(), unitR.conv_qty(),
							unitR.dec_place(), unitR.rnd_typ()));
					splitL.add(splitR);
					relR = splitR;

					// 残は引当済みのまま
					allocR.pack_unit_qty(allocR.pack_unit_qty().subtract(relQty));
					allocR.base_unit_qty(
						convToBaseUnit(
							allocR.pack_unit_qty(), unitR.conv_base_qty(), unitR.conv_qty(),
							unitR.dec_place(), unitR.rnd_typ()));
				}
				// 引当解除
				if (isNull(prR.loc_cd())) {
					relR.ship_loc_cd(null);
					relR.ship_str_ln_cd(null);
				}
				else {
					relR.ship_loc_cd(prR.sp().loc_cd());
					relR.ship_str_ln_cd(nvl(prR.sp().str_ln_cd(), MAC_STR.NULL_VAL.value()));
				}
				relR.alloc_flg(false);
				relR.alloc_wait_flg(isAllocWait(prR, null, _allocAvlSprt01.down0(), _allocAvlSprtKey));
				if (!relR.alloc_wait_flg()) {
					relR.alloc_scope_typ(null);
				}
				relR.lot_no(prR.lot_no());
				relR.sublot_no(prR.sublot_no());
				relR.sno1(prR.sno1());
				relR.sno2(prR.sno2());
				relR.sno3(prR.sno3());
				relR.sno4(prR.sno4());
				relR.ver_no(prR.ver_no());
			}
			if (!splitL.isEmpty()) {
				_updAllocStsL.addAll(splitL);
				_updAllocStsLKey = _updAllocStsL.createIndex(_$peg);
			}
		}

		/**
		 * 出荷予定を元に引当を解除する<br>
		 * 出荷予定を指定した場合は全数解除とする
		 */
		protected void relAllocQtyForShipSchd(MCList<ShipSchd_Upd06_DtlR> upL) {
			MCIndexKey idxPr = _prL.createIndex(_$peg);
			for (ShipSchd_Upd06_DtlR r : upL) {
				ShipPr_DtlR prR = _prL.getFirst(idxPr, r.toArray(idxPr.getKeys()));
				MCList<MST_SHIP_ALLOC_STS_R> allocL = 
					_updAllocStsL
						.subList(_updAllocStsLKey, r.toArray(_updAllocStsLKey.getKeys()))
						.subList(rr -> rr.alloc_flg());

				// 全数解除する
				// 単位の調整は後続のgroupByShipAllocStsで行う
				for (MST_SHIP_ALLOC_STS_R allocR : allocL) {
					if (isNull(prR.loc_cd())) {
						allocR.ship_loc_cd(null);
						allocR.ship_str_ln_cd(null);
					}
					else {
						allocR.ship_loc_cd(prR.sp().loc_cd());
						allocR.ship_str_ln_cd(nvl(prR.sp().str_ln_cd(), MAC_STR.NULL_VAL.value()));
					}
					allocR.alloc_flg(false);
					allocR.alloc_wait_flg(isAllocWait(prR, null, _allocAvlSprt01.down0(), _allocAvlSprtKey));
					allocR.lot_no(prR.lot_no());
					allocR.sublot_no(prR.sublot_no());
					allocR.sno1(prR.sno1());
					allocR.sno2(prR.sno2());
					allocR.sno3(prR.sno3());
					allocR.sno4(prR.sno4());
					allocR.ver_no(prR.ver_no());
				}
			}
		}

		/**
		 * 出荷引当状況NOを発番＆設定する<br>
		 * 出荷引当状況をまとめた後に実行する
		 */
		protected void setAllocStsNo() {
			MCList<MST_SHIP_ALLOC_STS_R>
				tgtL = _updAllocStsL.subList(r -> isNull(r.ship_alloc_sts_no()));
			if (!tgtL.isEmpty()) {
				doSeqCache(MSC_NUM_SYS_TYP.SHIPALOCS, tgtL.size());
				tgtL.forEach(r -> {
					r.ship_alloc_sts_no(getShipAllocStsNo());
				});
			}
		}

		/**
		 * 出荷進捗を更新するクラス<br>
		 */
		public class UpdShipPrUpd06 extends UpdShipPr {
			@Override
			protected void dbExec() {
				// 新規追加、更新（打切、打切解除）、削除はないはずなので無視
				if (isNull(_updL)) {
					return;
				}
				// 更新カウンタをアップ
				MST_SHIP_PR_R dbc = MST_SHIP_PR_R.create("T");
				MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
				builder.setSet(dbc.ship_pr_no);
				dbUpdateKey("MSBEL5500_MST_SHIP_PR_U09", _updL, builder);
			}
		}
	}

	/**
	 * ShipSchd_Upd07オペレーション.<p>
	 *
	 * 出荷引当状況の現品票発行済フラグをオン(発行済)に更新する。<br>
	 */
	public class ShipSchd_Upd07 extends MSBEL_ShipSchdService_MC_A.ShipSchd_Upd07 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			updAllocSts();
			callRevDataIns01ForUpd07(up0());
		}
		/**
		 * 出荷引当状況を更新する
		 */
		protected void updAllocSts() {
			MST_SHIP_ALLOC_STS_R dbc = MST_SHIP_ALLOC_STS_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
			builder.setSetVL(dbc.stk_lst_prnt_flg, value(true));
			dbUpdateKey("MSBEL5500_MST_SHIP_ALLOC_STS_U01", up0(), builder);
		}
		
		/**
		 * 「改訂履歴データ更新リスト」テーブルにデータを登録するサービスを呼び出す
		 * @param up0L
		 */
		protected void callRevDataIns01ForUpd07(MCList<ShipSchd_Upd07_DtlR> up0L) {
			MCList<MST_SHIP_INST_R> bindL = createBindRevData(up0L);
			MAUCL_RevDataService.RevData_Ins01 ope = MAUCL_RevDataService.crtRevData_Ins01();
			
			for (MST_SHIP_INST_R r : bindL) {
				RevData_Ins01_DtlR opeR = RevData_Ins01_DtlR.create();
				opeR.rev_data_src_no(r.ship_inst_no());
				opeR.rev_no(r.ship_inst_rev());
				opeR.rev_data_typ(MAC_REV_DATA_TYP.MST_SHIP_INST.value());
				ope.up0().add(opeR);
			}
			ope.exec();
		}
		
		protected MCList<MST_SHIP_INST_R> createBindRevData(MCList<ShipSchd_Upd07_DtlR> up0L) {
			MCQueryApiBuilder allocWKBldr = MCQueryApiBuilder.create(MST_SHIP_ALLOC_STS_R.create("T"));
			dbWkDelete("MSBEL5500_MSW_SHIP_ALLOC_STS_D03", allocWKBldr.getBaseDbc());
			dbWkInsert("MSBEL5500_MSW_SHIP_ALLOC_STS_I03", up0L.groupBy(ShipSchd_Upd07_DtlR.$ship_alloc_sts_no), allocWKBldr.getBaseDbc());

			MCList<MST_SHIP_INST_R> bindL = MCList.create(MST_SHIP_INST_R.class);
			MST_SHIP_INST_R inst = MST_SHIP_INST_R.create("INST");
			MST_SHIP_ALLOC_STS_R alloc = MST_SHIP_ALLOC_STS_R.create("ALLOC");
			MSW_SHIP_ALLOC_STS_KEY_R allocWK = MSW_SHIP_ALLOC_STS_KEY_R.create("ALLOCWK");
			MCQueryApiBuilder instBldr = MCQueryApiBuilder.create(inst);

			instBldr.setSelect(inst.ship_inst_no, inst.ship_inst_rev);
			instBldr.addInnerJoin(alloc, bracket(inst.ship_inst_no.eq(alloc.ship_inst_no)));
			instBldr.addInnerJoin(allocWK, bracket(alloc.ship_alloc_sts_no.eq(allocWK.ship_alloc_sts_no)));
			dbSelect("MSBEL5500_MST_SHIP_INST_S01", bindL, instBldr);
			
			dbWkDelete("MSBEL5500_MSW_SHIP_ALLOC_STS_D04", allocWKBldr.getBaseDbc());
			
			return bindL;
		}
	}

	/**
	 * ShipSchd_Chk01オペレーション.<p>
	 *
	 * 更新（出荷進捗・予定）を実行する前のチェック処理を行う。<br>
	 */
	public class ShipSchd_Chk01 extends MSBEL_ShipSchdService_MC_A.ShipSchd_Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			preProc();
			chkShipSchd();
			setDown();
		}

		/**
		 * 前処理
		 */
		protected void preProc() {
			for (ShipPr_DtlR r : up0()) {
				r.sno1(nvl(r.sno1(), MAC_STR.NULL_VAL.value()));
				r.sno2(nvl(r.sno2(), MAC_STR.NULL_VAL.value()));
				r.sno3(nvl(r.sno3(), MAC_STR.NULL_VAL.value()));
				r.sno4(nvl(r.sno4(), MAC_STR.NULL_VAL.value()));
				r.stk_arrv_bp_cd(nvl(r.stk_arrv_bp_cd(), MAC_STR.NULL_VAL.value()));
				r.stk_bp_cd(nvl(r.stk_bp_cd(), MAC_STR.NULL_VAL.value()));
			}
			doTranDataCache(up0());
			doItmCache(up0());
			doBpCache(up0());
			doLocCache(up0(), null);
			doLgCtlCache(up0());
			doLgGrpCache(up0());
			doItmLgGrpCache(up0());

			for (ShipPr_DtlR r : up0()) {
				r.ship_inst_typ(nvl(r.ship_inst_typ(),
						nvl(getItmR(r).ship_inst_typ(), MAC_SHIP_INST_TYP.PICK.value())));
			}
			setShipNotMngLotNo(up0());
		}

		/**
		 * 出荷予定に対するチェックを行う
		 */
		protected void chkShipSchd() {
			MCMessagePool.addAll(chkValidShipSchd());
			MCMessagePool.addAll(chkFixShipSchd());
		}

		/**
		 * 上り電文に対して妥当性チェックを行う
		 */
		protected MCMessageList chkValidShipSchd() {

			MCMessageList msgL = new MCMessageList();
			for (ShipPr_DtlR r : up0()) {
	
				// 取引パタンの妥当性チェック
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					if (!MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ())
						&& !MAC_TRD_PTN_TYP.isSHIP(r.trd_ptn_typ())
						&& !MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())
						&& !MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())
						&& !MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())
						&& !MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
						msgL.add(new MCMessage(r, null, MSBEL0051, r.trd_cd(), r.trd_ptn_typ()));
						r.err_flg(true);
					}
				}

				// 貸出の場合、取引パタンを「売上」から「出荷」に振り替えるので自動時採用フラグがオンの取引が存在するかチェックする
				if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					if (MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ()) && r.vmi_flg()) {
						MAM_TRD_R trdR = getShipTrdR();
						if (isNull(trdR)) {
							msgL.add(new MCMessage(
								r, null, MSBEL0252, MAC_TRD_PTN_TYP.SHIP.value(), toDispGUIIndex(r)));
							r.err_flg(true);
						}
					}
				}

				// データ更新区分「更新」または「削除」が対象
				if (!MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					MST_SHIP_PR_R prR = getShipPrR(r.ship_pr_no());
					if (prR.ship_act_qty().isPositive()) {
						// 出荷済みは変更不可
						msgL.add(new MCMessage(r, null, MSBEL0088, toDispGUIIndex(r)));
						r.err_flg(true);
					}
					else {
						if (prR.ship_inst_qty().isPositive()) {
							// 指図済みは変更不可
							msgL.add(new MCMessage(r, null, MSBEL0087, toDispGUIIndex(r)));
							r.err_flg(true);
						}
						if (prR.iv_schd_qty().isPositive()) {
							// インボイスまとめ済みは変更不可
							msgL.add(new MCMessage(r, null, MSBEL0089, toDispGUIIndex(r)));
							r.err_flg(true);
						}
						if (prR.ship_schd_abort_qty().isPositive() && !prR.abort_flg()) {
							// 出荷予定の打切済みは変更不可
							msgL.add(new MCMessage(r, null, MSBEL0339, toDispGUIIndex(r)));
							r.err_flg(true);
						}
						for (MST_SHIP_SCHD_R schdR : getShipSchdL(r.ship_pr_no())) {
							if (schdR.inst_bndl_flg()) {
								// 指図まとめは変更不可
								msgL.add(new MCMessage(r, null, MSBEL0091, toDispGUIIndex(r)));
								r.err_flg(true);
								break;
							}
						}
					}
					if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) && prR.abort_flg()) {
						// 打切済みは削除不可
						msgL.add(new MCMessage(r, null, MSBEL0090, toDispGUIIndex(r)));
						r.err_flg(true);
					}
					// エラー状況を特定するために指図登録済み(インボイス含む)、実績登録済みのフラグを立てる
					if (r.err_flg()) {
						r.ship_inst_flg(prR.ship_inst_qty().isPositive() || prR.iv_schd_qty().isPositive());
						r.ship_act_flg(prR.ship_act_qty().isPositive());
					}
				}
			}
			return msgL;
		}

		/**
		 * 確定した出荷予定に対するチェックを行う
		 */
		protected MCMessageList chkFixShipSchd() {
			MCMessageList msgL = new MCMessageList();
			for (ShipPr_DtlR r : up0()) {
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					continue;
				}
				MST_SHIP_PR_R spR = getShipPrR(r.ship_pr_no());
				if (r.abort_flg() || spR.abort_flg() && !r.abort_flg()) {
					// 打切、打切解除はチェック対象外
					continue;
				}
				// 確定済みの出荷予定を取得
				MCList<MST_SHIP_SCHD_R>
					schdL = getShipSchdL(r.ship_pr_no()).subList(rr -> rr.fix_flg());
				if (!schdL.isEmpty()) {
					if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
						// 確定済みがある場合は削除不可
						msgL.add(new MCMessage(r, null, MSBEL0095, toDispGUIIndex(r)));
						r.err_flg(true);
					}
					else  {
						if (!isChangedFixCols(r, schdL.get(0))) {
							// 確定済みの出荷予定から引当結果に影響のある項目の変更は不可
							msgL.add(new MCMessage(r, null, MSBEL0093, toDispGUIIndex(r)));
							r.err_flg(true);
						}
						if (r.base_unit_qty().lt(schdL.sum(MST_SHIP_SCHD_R.$base_unit_qty))) {
							// 確定した出荷予定を下回る変更は不可
							msgL.add(new MCMessage(r, null, MSBEL0094, toDispGUIIndex(r)));
							r.err_flg(true);
						}
					}
				}
			}
			return msgL;
		}

		/**
		 * 確定済みの出荷予定に対して変更できないカラムが同じ値か判定する
		 */
		protected boolean isChangedFixCols(ShipPr_DtlR updR, MST_SHIP_SCHD_R orgR) {
			return isSame(updR.itm_cd(), orgR.itm_cd())
					&& isSame(updR.itm_sub1(), orgR.itm_sub1())
					&& isSame(updR.itm_sub2(), orgR.itm_sub2())
					&& isSame(updR.itm_sub3(), orgR.itm_sub3())
					&& isSame(updR.itm_nm(), orgR.itm_nm())
					&& isSame(updR.iv_itm_nm(), orgR.iv_itm_nm())
					&& isSame(updR.sno1(), orgR.sno1())
					&& isSame(updR.sno1_null_flg(), orgR.sno1_null_flg())
					&& isSame(updR.sno2(), orgR.sno2())
					&& isSame(updR.sno2_null_flg(), orgR.sno2_null_flg())
					&& isSame(updR.sno3(), orgR.sno3())
					&& isSame(updR.sno3_null_flg(), orgR.sno3_null_flg())
					&& isSame(updR.sno4(), orgR.sno4())
					&& isSame(updR.sno4_null_flg(), orgR.sno4_null_flg())
					&& isSame(updR.lot_no(), orgR.lot_no())
					&& isSame(updR.sublot_no(), orgR.sublot_no())
					&& isSame(updR.ver_no(), orgR.ver_no())
					&& isSame(updR.stk_arrv_bp_cd(), orgR.stk_arrv_bp_cd())
					&& isSame(updR.gd_cd(), orgR.gd_cd())
					&& isSame(updR.quality_typ(), orgR.quality_typ())
					&& isSame(updR.stk_id_typ(), orgR.stk_id_typ())
					&& isSame(updR.stk_bp_cd(), orgR.stk_bp_cd())
					&& isSame(updR.trd_unit_cd(), orgR.trd_unit_cd())
					&& isSame(updR.base_unit_cd(), orgR.base_unit_cd());
		}

		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}

	/**
	 * ShipSchd_Chk02オペレーション.<p>
	 *
	 * 更新（出荷予定）を実行する前のチェック処理を行う。<br>
	 */
	public class ShipSchd_Chk02 extends MSBEL_ShipSchdService_MC_A.ShipSchd_Chk02 {
		/**
		 * 出荷進捗、出荷予定リスト
		 */
		protected MCList<ShipPr_DtlR> _prL = null;

		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			preProc();
			chkShipSchd();
			callProvSchdChk01(_prL);
			setDown();
		}

		/**
		 * 前処理を実行する
		 */
		protected void preProc() {
			MCList<ShipPr_DtlR> prL = MCList.create(ShipPr_DtlR.class);
			for (ShipSchd_DtlR r : up0()) {
				if (!MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					ShipPr_DtlR rr = prL.add();
					rr.sp().ship_pr_no(r.ship_pr_no());
					rr.ss().ship_schd_no(r.ship_schd_no());
					rr.ss().ship_pr_no(r.ship_pr_no());
				}
			}
			doTranDataCache(prL);

			_prL = MCList.create(ShipPr_DtlR.class);
			setAll(_prL, up0(), createMap_ShipPr_DtlR_ShipSchd_DtlR());
			doItmCache(_prL);
			doBpCache(_prL);
			doLocCache(_prL, null);
			doLgCtlCache(_prL);
			doLgGrpCache(_prL);
			doItmLgGrpCache(_prL);
			doXfrSchdCache(_prL);
			doIvCache(_prL);
		}
		protected Map_ShipPr_DtlR_ShipSchd_DtlR
				<ShipPr_DtlR, ShipSchd_DtlR> createMap_ShipPr_DtlR_ShipSchd_DtlR() {
			return new Map_ShipPr_DtlR_ShipSchd_DtlR<ShipPr_DtlR, ShipSchd_DtlR>();
		}
		public class Map_ShipPr_DtlR_ShipSchd_DtlR
				<D extends ShipPr_DtlR, S extends ShipSchd_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void valueCopy(D dest, S src) {
				dest.sp(getShipPrR(src.ss().ship_pr_no()));
				dest.ss(src.ss());
				dest.data_crud_typ(src.data_crud_typ());
				dest.peg_no(src.peg_no());
				dest.peg_seq(1);
				dest.abort_flg(src.abort_flg());
				dest.is_src_ship_inst_flg(src.is_src_ship_inst_flg());
				dest.is_src_ship_schd_flg(src.is_src_ship_schd_flg());
				dest.iv_chk_skip_flg(src.iv_chk_skip_flg());
				dest.inst_ship_schd_tm(src.inst_ship_schd_tm());
				dest.inst_dlv_schd_tm(src.inst_dlv_schd_tm());
				dest.upd02_flg(true);
				dest.is_src_sls_dlv_dt_adjst_flg(src.is_src_sls_dlv_dt_adjst_flg());
			}
		}

		/**
		 * 出荷予定に対するチェックを行う
		 */
		protected void chkShipSchd() {
			MCMessagePool.addAll(chkValidShipSchd());
		}

		/**
		 * 上り電文に対して妥当性チェックを行う
		 */
		protected MCMessageList chkValidShipSchd() {

			MCMessageList msgL = new MCMessageList();
			for (ShipPr_DtlR r : _prL) {

				// データ更新区分「更新」または「削除」が対象
				if (!MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					MST_SHIP_SCHD_R schdR = getShipSchdR(r.ship_schd_no());

					// 出荷予定変更、または出荷指図からの呼び出し
					if (r.is_src_ship_inst_flg() || r.is_src_ship_schd_flg()) {
						// 打切、打切解除以外の場合にチェック
						if ( !(r.abort_flg() || schdR.abort_flg()) ) {
							if (schdR.ship_act_qty().isPositive()) {
								// 出荷済みは変更不可
								msgL.add(new MCMessage(r, null, MSBEL0088, toDispGUIIndex(r)));
								r.err_flg(true);
							}
						}
						if (r.is_src_ship_schd_flg()) {
							// 受注打切済みチェック
							MST_SLO_D_R sodR = getSloDR(r.slo_d_no());
							if (!isSame(r.abort_flg(), schdR.abort_flg())) {
								if (sodR.abort_flg()) {
									msgL.add(new MCMessage(r, null, MSBEL1102, toDispGUIIndex(r)));
									r.err_flg(true);
								}
							}
						}
					}
					else {
						// 出荷指図サービス以外から実行
						if (!r.is_src_ship_inst_flg()) {
							if (schdR.ship_act_qty().isPositive()) {
								if (!schdR.ship_skip_flg() || r.is_src_sls_dlv_dt_adjst_flg()) {
									// 出荷済みは変更不可
									msgL.add(new MCMessage(r, null, MSBEL0088, toDispGUIIndex(r)));
									r.err_flg(true);
								}
							}
							else if (schdR.ship_inst_qty().isPositive()) {
								// 指図済みは変更不可
								msgL.add(new MCMessage(r, null, MSBEL0087, toDispGUIIndex(r)));
								r.err_flg(true);
							}
							if (schdR.inst_bndl_flg()) {
								// 指図まとめは変更不可
								msgL.add(new MCMessage(r, null, MSBEL0091, toDispGUIIndex(r)));
								r.err_flg(true);
							}
						}
						// 指図サービス以外、インボイスチェック不要以外の場合にチェック
						if ( !(r.is_src_ship_inst_flg() || r.iv_chk_skip_flg()) ) {
							if (schdR.iv_schd_qty().isPositive()) {
								// インボイスまとめ済みは変更不可
								msgL.add(new MCMessage(r, null, MSBEL0089, toDispGUIIndex(r)));
								r.err_flg(true);
							}
						}
					}
					if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) && schdR.abort_flg()) {
						// 打切済みは削除不可
						msgL.add(new MCMessage(r, null, MSBEL0090, toDispGUIIndex(r)));
						r.err_flg(true);
					}

					// エラー状況を特定するために指図登録済み(インボイス含む)、実績登録済みのフラグを立てる
					if (r.err_flg()) {
						r.ship_inst_flg(schdR.ship_inst_qty().isPositive() || schdR.iv_schd_qty().isPositive());
						r.ship_act_flg(schdR.ship_act_qty().isPositive());
					}
				}
			}
			return msgL;
		}

		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			copyByPegNo(
				up0(), new String[]{
					ShipSchd_DtlR.$err_flg,
					ShipSchd_DtlR.$ship_inst_flg,
					ShipSchd_DtlR.$ship_act_flg},
				_prL, new String[]{
					ShipPr_DtlR.$err_flg,
					ShipSchd_DtlR.$ship_inst_flg,
					ShipSchd_DtlR.$ship_act_flg});
			down0().setAll(up0());
		}
	}

	/**
	 * ShipSchd_Chk06オペレーション.<p>
	 *
	 * 更新（引当解除）を実行する前のチェック処理を行う。<br>
	 */
	public class ShipSchd_Chk06 extends MSBEL_ShipSchdService_MC_A.ShipSchd_Chk06 {
		/**
		 * 更新対象リスト
		 */
		protected MCList<ShipPr_DtlR> _prL = MCList.create(ShipPr_DtlR.class);

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			preProc();
			chkShipSchd();
			setDown();
		}

		/**
		 * 前処理
		 */
		protected void preProc() {
			_prL = MCList.create(ShipPr_DtlR.class);

			for (ShipSchd_Upd06_DtlR r : up0()) {
				ShipPr_DtlR prR = _prL.add();
				prR.peg_no(r.peg_no());
				prR.ship_schd_no(r.ship_schd_no());
			}
			preProcAllocSts();
			preProcShipSchd();

			doTranDataCache(_prL);
		}

		/**
		 * 上り電文の出荷引当状況から出荷予定を取得する
		 */
		protected void preProcAllocSts() {
			MCList<ShipSchd_Upd06_DtlR> tgtL = up0()
					.subList(r -> !isNull(r.ship_alloc_sts_no()));
			if (tgtL.isEmpty()) {
				return;
			}
			MCList<MST_SHIP_ALLOC_STS_R> allocL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			MST_SHIP_ALLOC_STS_R t = MST_SHIP_ALLOC_STS_R.create("T");
			MCQueryApiBuilder allocL_bldr = MCQueryApiBuilder.create(t);
			MST_SHIP_SCHD_R t1 = MST_SHIP_SCHD_R.create("T1");
			allocL_bldr.setSelect(t.ship_alloc_sts_no, t.ship_schd_no);
			allocL_bldr.addSelect(t1.ship_pr_no);
			allocL_bldr.addInnerJoin(t1, bracket(t1.ship_schd_no.eq(t.ship_schd_no)));
			dbSelectKey("MSBEL5500_MST_SHIP_ALLOC_STS_S03", allocL, allocL_bldr, tgtL);
			MCIndexKey idx = allocL.createIndex(MST_SHIP_ALLOC_STS_R.$ship_alloc_sts_no),
					idxPr = _prL.createIndex(_$peg[0]);
			for (ShipSchd_Upd06_DtlR r : tgtL) {
				ShipPr_DtlR prR = _prL.getFirst(idxPr, r.toArray(idxPr.getKeys()));
				MST_SHIP_ALLOC_STS_R allocR = allocL.getFirst(idx, r.ship_alloc_sts_no());
				prR.ship_schd_no(allocR.ship_schd_no());
				prR.ship_pr_no(allocR.getString("ship_pr_no"));
			}
		}

		/**
		 * 上り電文の出荷予定から出荷予定を取得する
		 */
		protected void preProcShipSchd() {
			MCList<ShipSchd_Upd06_DtlR> tgtL = up0()
					.subList(r -> !isNull(r.ship_schd_no()));
			if (tgtL.isEmpty()) {
				return;
			}
			MCList<MST_SHIP_SCHD_R> schdL = MCList.create(MST_SHIP_SCHD_R.class);
			MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(MST_SHIP_SCHD_R.create("T"));
			schdL_bldr.setSelectAll();
			dbSelectKey("MSBEL5500_MST_SHIP_SCHD_S09", schdL, schdL_bldr, tgtL);
			MCIndexKey idx = schdL.createIndex(MST_SHIP_SCHD_R.$ship_schd_no);
			for (ShipPr_DtlR r : _prL) {
				r.ss(schdL.getFirst(idx, r.ship_schd_no()));
				r.ship_pr_no(r.ss().ship_pr_no());
			}
		}

		/**
		 * 出荷予定に対するチェックを行う
		 */
		protected void chkShipSchd() {
			MCMessagePool.addAll(chkValidShipSchd());
		}

		/**
		 * 上り電文に対して妥当性チェックを行う
		 */
		protected MCMessageList chkValidShipSchd() {
			MCMessageList msgL = new MCMessageList();
			for (ShipPr_DtlR r : _prL) {
				MST_SHIP_SCHD_R schdR = getShipSchdR(r.ship_schd_no());
				if (schdR.ship_inst_qty().isPositive()) {
					// 指図済みは変更不可
					msgL.add(new MCMessage(r, null, MSBEL0087, toDispGUIIndex(r)));
					r.err_flg(true);
				}
				if (schdR.ship_act_qty().isPositive()) {
					// 出荷済みは変更不可
					msgL.add(new MCMessage(r, null, MSBEL0088, toDispGUIIndex(r)));
					r.err_flg(true);
				}
			}
			return msgL;
		}

		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			copyByPegNo(
				up0(), new String[]{ShipSchd_Upd06_DtlR.$err_flg},
				_prL, new String[]{ShipPr_DtlR.$err_flg});
			down0().setAll(up0());
		}
	}

	/**
	 * 受払予定を削除する
	 */
	protected void callDelIoSchdSrv(MCList<ShipPr_DtlR> prL) {
		MCList<MSW_IO_SCHD_DEL_R>
			cnd01L = MCList.create(MSW_IO_SCHD_DEL_R.class),	// 引当状況ごとに削除
			cnd02L = MCList.create(MSW_IO_SCHD_DEL_R.class);	// 出荷予定ごとに削除
		MCIndexKey idx = _updAllocStsL.createIndex(_$peg);
		Map<String, String> map = new HashMap<>();

		for (ShipPr_DtlR prR : prL) {
			if (!MAC_STK_MNG_TYP.isMNG(getItmR(prR).stk_mng_typ())
				|| prR.purc_ddlv_flg()) {
				continue;
			}
			if (!prR.upd02_flg()) {
				// Upd01から呼ばれた場合、出荷進捗に紐付く予定すべてを削除する
				if (!isNull(map.get(prR.ship_pr_no()))) {
					continue;
				}
				map.put(prR.ship_pr_no(), prR.ship_pr_no());
				getShipSchdL(prR.ship_pr_no()).forEach(r -> {
					MSW_IO_SCHD_DEL_R cndR = cnd02L.add();
					cndR.io_schd_sub_typ3(MSC_IO_SCHD_SUB_TYP.SHIP_SCHD_NO.value());
					cndR.io_schd_sub_no3(r.ship_schd_no());
				});
			}
			else {
				if (prR.ss().ship_act_qty().isPositive()) {
					// 一部出荷で打ち切りの場合、出荷数＞０の引当状況が含まれるが、ここでは未出荷分のみ削除する
					for (MST_SHIP_ALLOC_STS_R allocR : _updAllocStsL.subList(idx, prR.toArray(idx.getKeys()))) {
						if (allocR.base_unit_qty().subtract(allocR.ship_act_qty()).isPositive()) {
							ShipPr_DtlR yetR = prR.clone();
							yetR.sp().ship_act_qty(0);	// 未出荷分
							yetR.ss().ship_act_qty(0);	// 未出荷分
							yetR.ss().iv_act_qty(0);
						
							MSW_IO_SCHD_DEL_R cndR = cnd01L.add();
							cndR.io_schd_no(allocR.ship_alloc_sts_no());
							cndR.io_schd_typ(getIoSchdTyp(yetR));
							cndR.io_schd_sts_typ(getIoSchdStsTyp(yetR, allocR));
						}
					}
				}
				else {
					MSW_IO_SCHD_DEL_R cndR = cnd02L.add();
					cndR.io_schd_sub_typ3(MSC_IO_SCHD_SUB_TYP.SHIP_SCHD_NO.value());
					cndR.io_schd_sub_no3(prR.ship_schd_no());
				}
			}
		}
		if (!cnd01L.isEmpty()) {
			MSBEL_IoSchdService.IoSchd_Del01 o = MSBEL_IoSchdService.crtIoSchd_Del01();
			o.up0().setAll(cnd01L);
			o.exec();
		}
		if (!cnd02L.isEmpty()) {
			MSBEL_IoSchdService.IoSchd_Del02 o = MSBEL_IoSchdService.crtIoSchd_Del02();
			o.up0().setAll(cnd02L);
			o.exec();
		}
	}

	/**
	 * 変更前の出荷進捗、出荷予定を取得する
	 */
	protected ShipPr_DtlR getBfrShipPrR(ShipPr_DtlR prR) {
		ShipPr_DtlR bfrPrR = ShipPr_DtlR.create();
		bfrPrR.sp(getShipPrR(prR.ship_pr_no()));
		bfrPrR.ss(getShipSchdR(prR.ship_schd_no()));
		return bfrPrR;
	}

	/**
	 * 受払予定を作成する
	 */
	protected void callInsIoSchdSrv(MCList<ShipPr_DtlR> prL) {

		MSBEL_IoSchdService.IoSchd_Ins01 o = MSBEL_IoSchdService.crtIoSchd_Ins01();
		Map_IoSchd_Ins01_DtlR_MST_SHIP_ALLOC_STS_R
			<IoSchd_Ins01_DtlR, MST_SHIP_ALLOC_STS_R, ShipPr_DtlR> mpr = createMap_IoSchd_Ins01_DtlR_MST_SHIP_ALLOC_STS_R(); 

		MCIndexKey idx = _updAllocStsL.createIndex(_$peg);
		for (MCList<ShipPr_DtlR> prGrpL : prL.groupList(_$peg)) {
			ShipPr_DtlR prR = prGrpL.get(0);

			if (MAC_DATA_CRUD_TYP.isDEL(prR.data_crud_typ())
				|| !MAC_STK_MNG_TYP.isMNG(getItmR(prR).stk_mng_typ())
				|| prR.purc_ddlv_flg()
				|| isAbort(prR)) {
				continue;
			}
			for (MST_SHIP_ALLOC_STS_R allocR : _updAllocStsL.subList(idx, prR.toArray(idx.getKeys()))) {
				// 一部出荷で打ち切りの場合、出荷数＞０の引当状況が含まれるが、ここでは未出荷分のみ作成する
				if (allocR.base_unit_qty().subtract(allocR.ship_act_qty()).isPositive()) {
					ShipPr_DtlR yetR = prR.clone();
					yetR.sp().ship_act_qty(0);	// 未出荷分
					yetR.ss().ship_act_qty(0);	// 未出荷分
					yetR.ss().iv_act_qty(0);
					// 出荷実績数量をゼロで渡すので、未出荷分の数量をこのタイミングで設定する
					allocR = allocR.clone();
					allocR.base_unit_qty(allocR.base_unit_qty().subtract(allocR.ship_act_qty()));
					allocR.ship_act_qty(0);

					IoSchd_Ins01_DtlR ioSchdR = o.up0().add();
					ioSchdR.io_schd_typ(getIoSchdTyp(yetR));
					ioSchdR.io_schd_sts_typ(getIoSchdStsTyp(yetR, allocR));
					copy(ioSchdR, allocR, prR, mpr);
				}
			}
		}
		if (!o.up0().isEmpty()) {
			o.exec();
		}
	}

	/**
	 * 出荷引当状況から受払予定の引数を作成する
	 * @return
	 */
	protected Map_IoSchd_Ins01_DtlR_MST_SHIP_ALLOC_STS_R
			<IoSchd_Ins01_DtlR, MST_SHIP_ALLOC_STS_R, ShipPr_DtlR> createMap_IoSchd_Ins01_DtlR_MST_SHIP_ALLOC_STS_R() {
		return new Map_IoSchd_Ins01_DtlR_MST_SHIP_ALLOC_STS_R<IoSchd_Ins01_DtlR, MST_SHIP_ALLOC_STS_R, ShipPr_DtlR>();
	}
	public class Map_IoSchd_Ins01_DtlR_MST_SHIP_ALLOC_STS_R
			<D extends IoSchd_Ins01_DtlR, S extends MST_SHIP_ALLOC_STS_R, W extends ShipPr_DtlR> extends MAUCC_RowMapperWith<D,S,W>{
		protected ShipPr_DtlR _prR;
		@Override
		public void setWith(W prR) {
			_prR = prR;
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(IoSchd_Ins01_DtlR.$ver_no, MST_SHIP_ALLOC_STS_R.$ver_no);
			addColumnPathMap(IoSchd_Ins01_DtlR.$lot_no, MST_SHIP_ALLOC_STS_R.$lot_no);
			addColumnPathMap(IoSchd_Ins01_DtlR.$sublot_no, MST_SHIP_ALLOC_STS_R.$sublot_no);
			addColumnPathMap(IoSchd_Ins01_DtlR.$sno1, MST_SHIP_ALLOC_STS_R.$sno1);
			addColumnPathMap(IoSchd_Ins01_DtlR.$sno1_null_flg, MST_SHIP_ALLOC_STS_R.$sno1_null_flg);
			addColumnPathMap(IoSchd_Ins01_DtlR.$sno2, MST_SHIP_ALLOC_STS_R.$sno2);
			addColumnPathMap(IoSchd_Ins01_DtlR.$sno2_null_flg, MST_SHIP_ALLOC_STS_R.$sno2_null_flg);
			addColumnPathMap(IoSchd_Ins01_DtlR.$sno3, MST_SHIP_ALLOC_STS_R.$sno3);
			addColumnPathMap(IoSchd_Ins01_DtlR.$sno3_null_flg, MST_SHIP_ALLOC_STS_R.$sno3_null_flg);
			addColumnPathMap(IoSchd_Ins01_DtlR.$sno4, MST_SHIP_ALLOC_STS_R.$sno4);
			addColumnPathMap(IoSchd_Ins01_DtlR.$sno4_null_flg, MST_SHIP_ALLOC_STS_R.$sno4_null_flg);
			addColumnPathMap(IoSchd_Ins01_DtlR.$gd_cd, MST_SHIP_ALLOC_STS_R.$gd_cd);
			addColumnPathMap(IoSchd_Ins01_DtlR.$quality_typ, MST_SHIP_ALLOC_STS_R.$quality_typ);
			addColumnPathMap(IoSchd_Ins01_DtlR.$stk_insp_typ, MST_SHIP_ALLOC_STS_R.$stk_insp_typ);
			addColumnPathMap(IoSchd_Ins01_DtlR.$stk_id_typ, MST_SHIP_ALLOC_STS_R.$stk_id_typ);
			addColumnPathMap(IoSchd_Ins01_DtlR.$stk_bp_cd, MST_SHIP_ALLOC_STS_R.$stk_bp_cd);
			addColumnPathMap(IoSchd_Ins01_DtlR.$stk_arrv_bp_cd, MST_SHIP_ALLOC_STS_R.$stk_arrv_bp_cd);
			addColumnPathMap(IoSchd_Ins01_DtlR.$alloc_scope_typ, MST_SHIP_ALLOC_STS_R.$alloc_scope_typ);
			addColumnPathMap(IoSchd_Ins01_DtlR.$alloc_flg, MST_SHIP_ALLOC_STS_R.$alloc_flg);
			addColumnPathMap(IoSchd_Ins01_DtlR.$alloc_wait_flg, MST_SHIP_ALLOC_STS_R.$alloc_wait_flg);
			addColumnPathMap(IoSchd_Ins01_DtlR.$vld_dt_fr, MST_SHIP_ALLOC_STS_R.$vld_dt_fr);
			addColumnPathMap(IoSchd_Ins01_DtlR.$vld_dt_to, MST_SHIP_ALLOC_STS_R.$vld_dt_to);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.io_schd_no(src.ship_alloc_sts_no());
			dest.io_schd_seq(null);
			dest.io_schd_typ(nvl(dest.io_schd_typ(), getIoSchdTyp(_prR)));
			dest.trd_ptn_typ(_prR.trd_ptn_typ());
			dest.itm_cd(_prR.itm_cd());
			dest.itm_sub1(_prR.itm_sub1());
			dest.itm_sub2(_prR.itm_sub2());
			dest.itm_sub3(_prR.itm_sub3());
			// 受払予定状況区分は呼び出し元で設定するので不要
			//dest.io_schd_sts_typ(getIoSchdStsTyp(_prR));
			MCDate shipSchdDt = nvl(_prR.inst_ship_schd_tm(), _prR.ship_schd_tm());
			dest.schd_dt(shipSchdDt.trunc(MCDateFieldType.DAY));

			if (!isNull(src.ship_loc_cd())) {
				dest.loc_cd(src.ship_loc_cd());
			}
			else {
				dest.loc_cd(null);
				if (!isNull(_prR.def_loc_cd())) {
					MAM_LOC_R locR = getLocR(_prR.def_loc_cd());
					if (isSame(locR.lg_grp_cd(), _prR.ss().ship_fr_lg_grp_cd())) {
						dest.loc_cd(_prR.def_loc_cd());
					} 
				}
				if (isNull(dest.loc_cd())) {
					MAM_LG_GRP_R lgGrpR = getLgGrpR(_prR.ss().ship_fr_lg_grp_cd());
					MAM_ITM_LG_GRP_R itmLgGrpR = itmLgGrpCache().get(_prR.ss().itm_cd(), _prR.ss().itm_sub1(), _prR.ss().itm_sub2(), _prR.ss().itm_sub3(), _prR.ss().ship_fr_lg_grp_cd());
					if (!itmLgGrpR.isEmpty()) {
						lgGrpR = setLgGrpR(itmLgGrpR);
					}
					if (isNull(lgGrpR.getString("loc_cd"))) {
						if (MAC_ALLOC_SCOPE_TYP.isALLOC_GRP(src.alloc_scope_typ())) {
							MAM_LOC_R locNoDefR = getLocNoDefR(_prR.ss().ship_fr_lg_grp_cd(), _prR.alloc_grp_cd());
							if (locNoDefR.isEmpty()) {
								throw new MCAppException(MSBEL0261, _prR.ss().ship_fr_lg_grp_cd(), toDispGUIIndex(_prR));
							}
							else {
								dest.loc_cd(locNoDefR.loc_cd());
							}
						}
						else {
							throw new MCAppException(MSBEL0261, _prR.ss().ship_fr_lg_grp_cd(), toDispGUIIndex(_prR));
						}
					}
					else {
						if (MAC_ALLOC_SCOPE_TYP.isALLOC_GRP(src.alloc_scope_typ())) {
							if (isSame(lgGrpR.getString("alloc_grp_cd"), _prR.alloc_grp_cd())) {
								dest.loc_cd(lgGrpR.getString("loc_cd"));
							}
							else {
								MAM_LOC_R locNoDefR = getLocNoDefR(_prR.ss().ship_fr_lg_grp_cd(), _prR.alloc_grp_cd());
								if (locNoDefR.isEmpty()) {
									throw new MCAppException(MSBEL0261, _prR.ss().ship_fr_lg_grp_cd(), toDispGUIIndex(_prR));
								}
								else {
									dest.loc_cd(locNoDefR.loc_cd());
								}
							}
						}
						else {
							dest.loc_cd(lgGrpR.getString("loc_cd"));
						}
					}
				}
			}
			dest.str_ln_cd(nvl(src.ship_str_ln_cd(), MAC_STR.NULL_VAL.value()));

			// 基準単位数量（出荷引当状況.基準単位数量－出荷引当状況.出荷実績数量）
			// 売上は後続で再設定する
			dest.base_unit_qty(src.base_unit_qty().subtract(src.ship_act_qty()));
			dest.base_unit_cd(src.base_unit_cd());

			// 売上
			valueCopyForSls(dest, src);

			// 出荷
			valueCopyForShip(dest, src);

			// 移送、移送返品、支給、支給返品
			valueCopyForXfrProv(dest, src);

			// 取引単位数量には換算したい単位（入力単位）を渡す
			dest.trd_unit_cd(src.ent_unit_cd());

			dest.io_schd_sub_typ3(MSC_IO_SCHD_SUB_TYP.SHIP_SCHD_NO.value());
			dest.io_schd_sub_no3(_prR.ship_schd_no());
			dest.rsn_cd(_prR.rsn_cd());
			dest.io_schd_pr_no(_prR.sp().io_schd_pr_no());
		}

		/**
		 * 売上に関する設定
		 */
		protected void valueCopyForSls(D dest, S src) {
			// 売上
			if (!MAC_TRD_PTN_TYP.isSLS(_prR.trd_ptn_typ())) {
				return;
			}

			// 輸出済
			if (MSC_IO_SCHD_STS_TYP.isEX(dest.io_schd_sts_typ())) {
				dest.io_schd_no(src.getStringNE("iv_ship_act_d_no"));
				dest.stk_arrv_bp_cd(_prR.dlv_id_cd());
				dest.schd_dt(src.getDateNE("cmpl_dt"));						// 完了日
				dest.accpt_schd_dt(src.getDateNE("trd_schd_dt"));	// 取引予定日
				dest.base_unit_qty(src.base_unit_qty());
				dest.dlv_cd(_prR.dlv_id_cd());
			}
			// 出荷済
			else if (MSC_IO_SCHD_STS_TYP.isSHIP(dest.io_schd_sts_typ())) {
				dest.io_schd_no(src.getStringNE("ship_act_d_no"));

				MCDate shipDt = src.getDateNE("ship_tm").trunc(MCDateFieldType.DAY);
				MCDate dlvDt = src.getDateNE("dlv_tm").trunc(MCDateFieldType.DAY);
				dest.schd_dt(shipDt);
				dest.accpt_schd_dt(getSlsSchdDt(_prR, shipDt, dlvDt));
				dest.dlv_cd(_prR.dlv_id_cd());

				// 輸出
				if (isEx(_prR)) {
					dest.stk_arrv_bp_cd(_prR.ship_to_id_cd());
					// 基準単位数量－出荷返品数量
					dest.base_unit_qty(
						src.base_unit_qty().subtract(	src.getNumberNE("ship_ret_qty")));
				}
				else {
					dest.stk_arrv_bp_cd(_prR.dlv_id_cd());
					// 基準単位数量－(売上数量＋出荷返品数量)
					dest.base_unit_qty(
						src.base_unit_qty()
							.subtract(	sum(src.getNumberNE("sls_act_qty"), src.getNumberNE("ship_ret_qty"))));
				}
			}
			else {
				MCDate shipSchdDt = nvl(_prR.inst_ship_schd_tm(), _prR.ship_schd_tm());
				MCDate dlvSchdDt = nvl(_prR.inst_dlv_schd_tm(), _prR.dlv_schd_tm());

				dest.accpt_schd_dt(getSlsSchdDt(_prR, shipSchdDt, dlvSchdDt));
				if (!isNull(dest.accpt_schd_dt())) {
					dest.accpt_schd_dt(dest.accpt_schd_dt().trunc(MCDateFieldType.DAY));
				}
			}
			dest.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.SLO_NO.value());
			dest.io_schd_sub_no1(getSloDR(_prR.slo_d_no()).getStringNE("slo_no"));
			dest.io_schd_sub_typ2(MSC_IO_SCHD_SUB_TYP.SLO_D_NO.value());
			dest.io_schd_sub_no2(_prR.slo_d_no());
		}

		/**
		 * 出荷に関する設定
		 */
		protected void valueCopyForShip(D dest, S src) {
			// 出荷 
			if (!MAC_TRD_PTN_TYP.isSHIP(_prR.trd_ptn_typ())
				|| MSC_STK_ID_TYP.isCSTSTK(src.stk_id_typ())) {
				return;
			}
			// 貸出（預り以外＝貸出とみなす）
			if (!MSC_STK_ID_TYP.isCSTSTK(src.stk_id_typ())) {
				MCDate dlvSchdDt = nvl(_prR.inst_dlv_schd_tm(), _prR.dlv_schd_tm());
				dest.gr_schd_dt(dlvSchdDt.trunc(MCDateFieldType.DAY));
				dest.dlv_cd(_prR.dlv_id_cd());
			}
			dest.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.SLO_NO.value());
			dest.io_schd_sub_no1(getSloDR(_prR.slo_d_no()).getStringNE("slo_no"));
			dest.io_schd_sub_typ2(MSC_IO_SCHD_SUB_TYP.SLO_D_NO.value());
			dest.io_schd_sub_no2(_prR.slo_d_no());
		}

		/**
		 * 移送、移送返品、支給、支給返品に関する設定
		 */
		protected void valueCopyForXfrProv(D dest, S src) {
			// 移動・移送、移動・移送返品、支給、支給返品
			if (!MAC_TRD_PTN_TYP.isXFR(_prR.trd_ptn_typ())
				&& !MAC_TRD_PTN_TYP.isXFR_RTN(_prR.trd_ptn_typ())
				&& !MAC_TRD_PTN_TYP.isPROV(_prR.trd_ptn_typ())
				&& !MAC_TRD_PTN_TYP.isPROV_RTN(_prR.trd_ptn_typ())) {
				return;
			}

			MCDate dlvSchdDt = nvl(_prR.inst_dlv_schd_tm(), _prR.dlv_schd_tm());
			MCDate shipSchdDt = nvl(_prR.inst_ship_schd_tm(), _prR.ship_schd_tm());

			// 移動・移送予定から補完
			MST_XFR_SCHD_R xfrR = getXfrSchdR(_prR.xfr_schd_no());
			dest.gr_loc_cd(_prR.dlv_id_cd());
			dest.gr_str_ln_cd(_prR.dlv_str_ln_cd());
			dest.gr_schd_dt(dlvSchdDt.trunc(MCDateFieldType.DAY));
			dest.prov_typ(xfrR.prov_typ());
			dest.prov_basis_typ(xfrR.prov_basis_typ());

			dest.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.XFR_SCHD_NO.value());
			dest.io_schd_sub_no1(xfrR.xfr_schd_no());

			// 輸出
			if (isEx(_prR)) {
				// 入庫予定日付＝船卸予定日（なければ、納品予定日を設定する）
				MCList<MST_IV_R> ivL = getIvL(_prR.ship_schd_no());
				MST_IV_R ivR = isNull(ivL) ? null : ivL.get(0); 
				if (!isNull(ivR) && !isNull(ivR.eta_dt())) {
					MCDate dt;
					if (nvl(src.ship_act_qty(), MCNumber.ZERO).isPositive()) {
						dt = src.getDate("dlv_tm");
					}
					else {
						dt = dlvSchdDt;
					}
					if(ivR.eta_dt().ltDate(dt)) {
						dest.gr_schd_dt(dt);
					}
					else {
						dest.gr_schd_dt(ivR.eta_dt());
					}
				}
				else {
					MAM_LG_CTL_R lgCtlR = getLgCtlR(
							_prR.ship_fr_lg_grp_cd(), xfrR.gr_lg_grp_cd(), _prR.ss().ship_term_cd());
					if (!isNull(lgCtlR.xfr_lt())) {
						if (MSC_IO_SCHD_STS_TYP.isSHIP(dest.io_schd_sts_typ())) {
							MCDate dt = src.getDate("ship_tm").trunc(MCDateFieldType.DAY).addDay(lgCtlR.xfr_lt());
							if (dt.ltDate(src.getDate("dlv_tm"))) {
								dest.gr_schd_dt(src.getDate("dlv_tm"));
							}
							else {
								dest.gr_schd_dt(dt);
							}
						}
						else {
							MCDate dt = shipSchdDt.trunc(MCDateFieldType.DAY).addDay(lgCtlR.xfr_lt());
							if (dt.ltDate(dlvSchdDt)) {
								dest.gr_schd_dt(dlvSchdDt);
							}
							else {
								dest.gr_schd_dt(dt);
							}
						}
					}
				} 

				// 出荷済
				if (MSC_IO_SCHD_STS_TYP.isSHIP(dest.io_schd_sts_typ())) {
					dest.io_schd_no(src.getStringNE("ship_act_d_no"));
					dest.tdlv_cd(_prR.ship_to_id_cd());
					dest.schd_dt(src.getDateNE("ship_tm").trunc(MCDateFieldType.DAY));
					dest.ex_cmpl_schd_dt(src.getDate("dlv_tm"));
					dest.base_unit_qty(src.base_unit_qty());
					if (ivR != null) {
						dest.io_schd_sub_typ2(MSC_IO_SCHD_SUB_TYP.IV_NO.value());
						dest.io_schd_sub_no2(ivR.iv_no());
					}
				}
				// 予定 or 指図済
				else {
					// 配送先
					dest.tdlv_cd(_prR.ship_to_id_cd());
					dest.ex_cmpl_schd_dt(dlvSchdDt);
				}
			}
		}
	}

	/*
	 * 出荷予定日を計算する
	 */
	protected void callCalcSchdDtSrv(MCList<ShipPr_DtlR> prL) {
		MSBEL_ShipSchdDtCalcService.ShipSchdDt_Srch01 o = MSBEL_ShipSchdDtCalcService.crtShipSchdDt_Srch01();
		Map_MSW_SHIP_SCHD_DT_CALC_R_ShipPr_DtlR
			<MSW_SHIP_SCHD_DT_CALC_R, ShipPr_DtlR> mpr = createMap_MSW_SHIP_SCHD_DT_CALC_R_ShipPr_DtlR();

		Map<MCNumber, ShipPr_DtlR> map = new HashMap<>();
		MCNumber pegNo = MCNumber.ONE;
		for (ShipPr_DtlR r : prL) {
			if (!r.dt_recalc_flg()) {
				// 予定日再計算フラグは、上り電文の出荷元物流Ｇと引当結果の場所の物流Ｇが異なる場合にオンが設定される
				continue;
			}
			else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())
				|| r.not_dt_calc_flg()) {
				continue;
			}
			else if (MAC_SHIP_INST_TYP.isNO_PICK(r.ship_inst_typ())) {
				// ピッキングなしは出荷予定日なし
				r.ship_schd_tm(null);
				r.dlv_schd_tm(null);
				continue;
			}

			MSW_SHIP_SCHD_DT_CALC_R dtR = o.up0().add();
			dtR.peg_no(pegNo);
			map.put(pegNo, r);
			copy(dtR, r, mpr);

			pegNo = pegNo.add(1);
		}
		if (!o.up0().isEmpty()) {
			o.exec();
			for (MSW_SHIP_SCHD_DT_CALC_R r : o.down0()) {
				ShipPr_DtlR prR = map.get(r.peg_no());
				prR.ship_schd_tm(r.ship_schd_tm());
				prR.dlv_schd_tm(r.dlv_schd_tm());
				prR.ss().ship_wk_cd(r.ship_wk_cd());
			}
		}
	}
	protected Map_MSW_SHIP_SCHD_DT_CALC_R_ShipPr_DtlR<MSW_SHIP_SCHD_DT_CALC_R,ShipPr_DtlR> createMap_MSW_SHIP_SCHD_DT_CALC_R_ShipPr_DtlR() {
		return new Map_MSW_SHIP_SCHD_DT_CALC_R_ShipPr_DtlR<MSW_SHIP_SCHD_DT_CALC_R, ShipPr_DtlR>();
	}
	public class Map_MSW_SHIP_SCHD_DT_CALC_R_ShipPr_DtlR<D extends MSW_SHIP_SCHD_DT_CALC_R, S extends ShipPr_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$ship_to_id_typ, ShipPr_DtlR.$ship_to_id_typ);
			addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$ship_to_id_cd, ShipPr_DtlR.$ship_to_id_cd);
			addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$ship_to_lg_grp_cd, ShipPr_DtlR.$ship_to_lg_grp_cd);
			addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$ship_fr_lg_grp_cd, ShipPr_DtlR.$ship_fr_lg_grp_cd);
			addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$ship_term_cd, ShipPr_DtlR.$ship_term_cd);
			addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$dlv_rqst_tm, ShipPr_DtlR.$dlv_rqst_tm);
			addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$ship_rqst_tm, ShipPr_DtlR.$ship_rqst_tm);
			addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$ship_inst_typ, ShipPr_DtlR.$ship_inst_typ);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			MST_SLO_D_R sloDR = getSloDR(src.slo_d_no());
			if (!isNull(sloDR)) {
				dest.dlv_day_week_typ(sloDR.dlv_day_week_typ());
			}
			if (src.upd02_flg()) {
				dest.ship_rqst_tm(src.ship_rqst_tm());
				dest.dlv_rqst_tm(src.ss().pd_inst_dlv_tm());
			}
			dest.base_dt(getToday());
			dest.cl_time_chk_flg(true);
			dest.ship_dt_chk_flg(true);
			dest.ship_cal_cd_chk_flg(true);
			dest.early_ship_dt_add_days_chk_flg(true);
		}
	}

	/**
	 * 売上予定日を取得する
	 */
	protected MCDate getSlsSchdDt(ShipPr_DtlR prR) {
		return getSlsSchdDt(
			prR,
			prR.ship_schd_tm().trunc(MCDateFieldType.DAY),
			prR.dlv_schd_tm().trunc(MCDateFieldType.DAY));
	}
	protected MCDate getSlsSchdDt(ShipPr_DtlR prR, MCDate shipSchdDt, MCDate dlvSchdDt) {
		if (MAC_TRD_PTN_TYP.isSLS(prR.trd_ptn_typ())) {
			MST_SLO_D_R slodR = getSloDR(prR.slo_d_no());
			// 預り売上の場合は受注の売上予定日
			if (slodR.sls_cststk_flg()) {
				return slodR.sls_schd_dt();
			}
			// 受注の売上計上区分＝出荷基準
			if (MAC_SLS_BASIS_TYP.isSHIP_BASIS(slodR.getStringNE("sls_basis_typ"))) {
				return shipSchdDt;
			}
			else {
				// 受注の売上計上区分＝検収基準
				if (isNull(slodR.sls_schd_dt())) {
					return dlvSchdDt;
				}
				else {
					return slodR.sls_schd_dt();
				}
			}
		}
		return null;
	}

	/**
	 * 出荷ロットを更新する
	 */
	protected void callShipLotUpdSrv(MCList<ShipPr_DtlR> prL) {
		MSBEL_ShipLotChkService.ShipLotChk_Upd01
			o = MSBEL_ShipLotChkService.crtShipLotChk_Upd01();

		Map_ShipLot_DtlR_MST_SHIP_ALLOC_STS_R_forDel<ShipLot_DtlR,MST_SHIP_ALLOC_STS_R,ShipPr_DtlR>
			dMpr = createMap_ShipLot_DtlR_MST_SHIP_ALLOC_STS_R_forDel();
		Map_ShipLot_DtlR_MST_SHIP_ALLOC_STS_R<ShipLot_DtlR,MST_SHIP_ALLOC_STS_R,ShipPr_DtlR>
			iMpr = createMap_ShipLot_DtlR_MST_SHIP_ALLOC_STS_R();

		Map<MCNumber, ShipPr_DtlR> map = new HashMap<>();
		MCNumber pegNo = MCNumber.ONE;
		Map<String, String> prMap = new HashMap<>();
		for (ShipPr_DtlR r : prL) {

			MAM_ITM_R itmR = getItmR(r);
			if (!MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ())
				&& !MAC_TRD_PTN_TYP.isSHIP(r.trd_ptn_typ())
				|| !MAC_LOT_MNG_TYP.req_lot(itmR.lot_mng_typ())
				|| r.purc_ddlv_flg()) {
				continue;
			}
			// 削除対象を抽出
			if (!MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
				// 重複分を除外して削除対象に追加
				MCList<MST_SHIP_ALLOC_STS_R> lst = MCList.create(MST_SHIP_ALLOC_STS_R.class);
				if (r.upd02_flg()) {
					lst.addAll(getAllocStsL(r.ship_schd_no()));
				}
				else {
					if (isNull(prMap.get(r.ship_pr_no()))) {
						lst.addAll(getAllocStsLByPr(r.ship_pr_no()));
						prMap.put(r.ship_pr_no(), r.ship_pr_no());
					}
				}

				if (!lst.isEmpty()) {
					ShipPr_DtlR bfrPrR = getBfrShipPrR(r);
					if (!isNull(bfrPrR.ship_inst_d_no())) {
						lst.merge(getAllocStsLByInst(
							bfrPrR.ship_inst_d_no()), MST_SHIP_ALLOC_STS_R.$ship_alloc_sts_no);
					}
					addAll(o.up0(), lst, r, dMpr);
				}
			}
			// 登録対象を抽出
			if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
				MCList<MST_SHIP_ALLOC_STS_R>
					allocL = _updAllocStsL.subList(
						_updAllocStsLKey, r.toArray(_updAllocStsLKey.getKeys())).clone();
				for (MST_SHIP_ALLOC_STS_R allocR : allocL) {
					if (allocR.alloc_flg() && !isNullOrNullVal(allocR.lot_no())) {

						ShipLot_DtlR lotR = o.up0().add(); 
						lotR.peg_no(pegNo);
						map.put(pegNo, r);
						copy(lotR, allocR, r, iMpr);

						pegNo = pegNo.add(1);
					}
 				}
			}
		}
		if (!o.up0().isEmpty()) {
			o.exec();
			for (ShipLot_DtlR r : o.down0()) {
				ShipPr_DtlR prR = map.get(r.peg_no());
				if (!isNull(prR) && r.err_flg()) {
					prR.err_flg(r.err_flg());
				}
			}
		}
	}
	protected Map_ShipLot_DtlR_MST_SHIP_ALLOC_STS_R
			<ShipLot_DtlR, MST_SHIP_ALLOC_STS_R, ShipPr_DtlR> createMap_ShipLot_DtlR_MST_SHIP_ALLOC_STS_R() {
		return new Map_ShipLot_DtlR_MST_SHIP_ALLOC_STS_R<ShipLot_DtlR, MST_SHIP_ALLOC_STS_R, ShipPr_DtlR>();
	}
	protected Map_ShipLot_DtlR_MST_SHIP_ALLOC_STS_R_forDel
			<ShipLot_DtlR,MST_SHIP_ALLOC_STS_R,ShipPr_DtlR> createMap_ShipLot_DtlR_MST_SHIP_ALLOC_STS_R_forDel() {
		return new Map_ShipLot_DtlR_MST_SHIP_ALLOC_STS_R_forDel<ShipLot_DtlR, MST_SHIP_ALLOC_STS_R, ShipPr_DtlR>();
	}
	public class Map_ShipLot_DtlR_MST_SHIP_ALLOC_STS_R
		<D extends ShipLot_DtlR, S extends MST_SHIP_ALLOC_STS_R, W extends ShipPr_DtlR>
		 extends  MAUCC_RowMapperWith<D,S,W> {
		protected ShipPr_DtlR _prR = null;
		@Override
		public void setWith(W prR) {
			_prR = prR;
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipLot_DtlR.$lot_no, MST_SHIP_ALLOC_STS_R.$lot_no);
			addColumnPathMap(ShipLot_DtlR.$sublot_no, MST_SHIP_ALLOC_STS_R.$sublot_no);
			setupShipAllocStsNoPath();	// 出荷引当状況NOの設定
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.cst_cd(_prR.cst_cd());
			dest.dlv_cd(_prR.dlv_id_cd());
			dest.base_dt(nvl(_prR.inst_dlv_schd_tm(), _prR.dlv_schd_tm()).trunc(MCDateFieldType.DAY));
			dest.itm_cd(_prR.itm_cd());
			dest.itm_sub1(_prR.itm_sub1());
			dest.itm_sub2(_prR.itm_sub2());
			dest.itm_sub3(_prR.itm_sub3());
			dest.lock_flg(true);
		}
		protected void setupShipAllocStsNoPath() {
			// 出荷引当状況NO
			addColumnPathMap(ShipLot_DtlR.$ship_alloc_sts_no, MST_SHIP_ALLOC_STS_R.$ship_alloc_sts_no);
		}
	}
	public class Map_ShipLot_DtlR_MST_SHIP_ALLOC_STS_R_forDel
		<D extends ShipLot_DtlR, S extends MST_SHIP_ALLOC_STS_R, W extends ShipPr_DtlR>
		extends  Map_ShipLot_DtlR_MST_SHIP_ALLOC_STS_R<D,S,W> {
		@Override
		protected void setupShipAllocStsNoPath() {
			// 元出荷引当状況NO
			addColumnPathMap(ShipLot_DtlR.$org_ship_alloc_sts_no, MST_SHIP_ALLOC_STS_R.$ship_alloc_sts_no);
		}
	}

	/**
	 * 売上予定サービスを実行する
	 */
	protected void callSlsSchdSrv(MCList<ShipPr_DtlR> prL) {
		MSBBL_SlsSchdService.Sls_Schd_Upd01 o = MSBBL_SlsSchdService.crtSls_Schd_Upd01();
		Map_Sls_Schd_Upd01_DtlR_ShipPr_DtlR<Sls_Schd_Upd01_DtlR,ShipPr_DtlR> mpr = createMap_Sls_Schd_Upd01_DtlR_ShipPr_DtlR();
		Map_Sls_Schd_Upd01_DtlR_ShipPr_DtlR_forDel<Sls_Schd_Upd01_DtlR,MST_SHIP_SCHD_R,ShipPr_DtlR> dMpr = createMap_Sls_Schd_Upd01_DtlR_ShipPr_DtlR_forDel();

		MCList<ShipPr_DtlR>
			othrL = MCList.create(ShipPr_DtlR.class),
			insL = MCList.create(ShipPr_DtlR.class);

		for (ShipPr_DtlR r : prL) {
			// 「売上」以外、インボイス単位出荷、仕入直送、売上済の預り売上は対象外
			if (!MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ())
				|| getBpR(r.cst_cd()).cst_iv_flg()
				|| r.purc_ddlv_flg()
				|| (r.upd02_flg()		// Upd01から呼ばれた場合、売上済はありえない
						&& ((!MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())
								&& MSC_STK_ID_TYP.isCSTSTK(r.stk_id_typ())
								&& getShipSchdR(r.ship_schd_no()).sls_qty().isPositive())
							|| (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())
									&& !isNull(r.ss().sls_act_d_no()))))) {
				continue;
			}
			if (!r.upd02_flg()
				&& !isAbort(r)
				&& !isAbortRel(r)
				&& MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
				// Upd01、かつ更新の場合は、出荷進捗単位で出荷予定を作成しなおすため、売上予定も同様に作成しなおす
				ShipPr_DtlR rr = r.clone();
				rr.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				insL.add(rr);
			}
			else {
				// 上記以外はデータ更新区分に従う
				othrL.add(r);
			}
		}
		// Upd01からの更新は削除＆新規
		MCIndexKey idx = insL.createIndex(ShipPr_DtlR.$ship_pr_no);
		for (ShipPr_DtlR r : insL.groupBy(ShipPr_DtlR.$ship_pr_no)) {
			addAll(o.up0(), getShipSchdL(r.ship_pr_no()), r, dMpr);
			addAll(o.up0(), insL.subList(idx, r.ship_pr_no()), mpr);
		}

		for (ShipPr_DtlR r : othrL) {
			// 削除
			if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
				copy(o.up0().add(), r.ss(), r, dMpr);
			}
			// 新規 or 更新（打切解除も含む）or 打切
			else {
				copy(o.up0().add(), r, mpr);
			}
		}
		if (!o.up0().isEmpty()) {
			o.exec();
		}
	}
	
	/**
	 * 売上予定サービスを実行する。（インボイス取引専用）
	 * @param prL 出荷進捗リスト
	 */
	protected void callSlsSchdSrvForIv(MCList<ShipPr_DtlR> prL) {
		
		MSBBL_SlsSchdService.Sls_Schd_Upd05 ope = MSBBL_SlsSchdService.crtSls_Schd_Upd05();
		
		MCList<ShipPr_DtlR> shipPrL = MCList.create(ShipPr_DtlR.class);

		for (ShipPr_DtlR r : prL) {
			
			// 「売上」以外、インボイス単位出荷以外、仕入直送、売上済の預り売上は対象外
			if (!MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ())
				|| !getBpR(r.cst_cd()).cst_iv_flg()
				|| r.purc_ddlv_flg()
				|| (!MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())
					 && MSC_STK_ID_TYP.isCSTSTK(r.stk_id_typ())
					 && getShipSchdR(r.ship_schd_no()).sls_qty().isPositive())) {
				continue;
			}
			
			shipPrL.add(r);
		}
		
		Sls_Schd_Upd05_DtlR upR = null;
		
		for (ShipPr_DtlR r : shipPrL.groupBy(ShipPr_DtlR.$slo_d_no)) {
			
			upR = Sls_Schd_Upd05_DtlR.create();
			
			upR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			upR.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.SLO_D.value());
			upR.slo_d_no(r.slo_d_no());
			
			ope.up0().add(upR);
		}
		
		if (!ope.up0().isEmpty()) {
			ope.exec();
		}
	}
	
	/**
	 * 売上予定新規or更新用マッパー
	 */
	protected Map_Sls_Schd_Upd01_DtlR_ShipPr_DtlR
			<Sls_Schd_Upd01_DtlR, ShipPr_DtlR> createMap_Sls_Schd_Upd01_DtlR_ShipPr_DtlR() {
		return new Map_Sls_Schd_Upd01_DtlR_ShipPr_DtlR<Sls_Schd_Upd01_DtlR, ShipPr_DtlR>();
	}
	public class Map_Sls_Schd_Upd01_DtlR_ShipPr_DtlR
			<D extends Sls_Schd_Upd01_DtlR, S extends ShipPr_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Sls_Schd_Upd01_DtlR.$data_crud_typ, ShipPr_DtlR.$data_crud_typ);
			addColumnPathMap(Sls_Schd_Upd01_DtlR.$ship_schd_no, ShipPr_DtlR.$ship_schd_no);
			addColumnPathMap(Sls_Schd_Upd01_DtlR.$ship_inst_d_no, ShipPr_DtlR.$ship_inst_d_no);
			addColumnPathMap(Sls_Schd_Upd01_DtlR.$dlv_inst_rcpt_no, ShipPr_DtlR.$dlv_inst_rcpt_no);
			addColumnPathMap(Sls_Schd_Upd01_DtlR.$slo_d_no, ShipPr_DtlR.$slo_d_no);
			addColumnPathMap(Sls_Schd_Upd01_DtlR.$cred_no_up_flg, ShipPr_DtlR.$cred_no_up_flg);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.SHIP_SCHD.value());
			if (!MAC_SHIP_INST_TYP.isNO_PICK(src.ship_inst_typ())) {
				dest.ship_schd_dt(src.ship_schd_tm().trunc(MCDateFieldType.DAY));
				dest.dlv_schd_dt(src.dlv_schd_tm().trunc(MCDateFieldType.DAY));
			}
			else {
				MST_SLO_D_R sloDR = getSloDR(src.slo_d_no());
				dest.sls_schd_dt(sloDR.sls_schd_dt());
			}
			dest.trd_unit_cd(src.ss().trd_unit_cd());
			dest.trd_unit_qty(src.ss().trd_unit_qty());
			dest.base_unit_cd(src.ss().base_unit_cd());
			dest.base_unit_qty(src.ss().base_unit_qty());
			dest.abort_flg(src.ss().abort_flg());
		}
	}
	/**
	 * 売上予定削除用マッパー
	 */
	protected Map_Sls_Schd_Upd01_DtlR_ShipPr_DtlR_forDel
			<Sls_Schd_Upd01_DtlR, MST_SHIP_SCHD_R, ShipPr_DtlR> createMap_Sls_Schd_Upd01_DtlR_ShipPr_DtlR_forDel() {
		return new Map_Sls_Schd_Upd01_DtlR_ShipPr_DtlR_forDel<Sls_Schd_Upd01_DtlR, MST_SHIP_SCHD_R, ShipPr_DtlR>();
	}
	public class Map_Sls_Schd_Upd01_DtlR_ShipPr_DtlR_forDel
			<D extends Sls_Schd_Upd01_DtlR, S extends MST_SHIP_SCHD_R , W extends ShipPr_DtlR> extends MAUCC_RowMapperWith<D,S,W>{
		protected ShipPr_DtlR _prR;
		@Override
		public void setWith(W prR) {
			_prR = prR;
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.SHIP_SCHD.value());
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			dest.ship_schd_no(src.ship_schd_no());
			dest.cred_no_up_flg(_prR.cred_no_up_flg());
		}
	}
	
	/**
	 * 支給予定サービスの登録処理を実行する
	 */
	protected void callProvSchdSrv(MCList<ShipPr_DtlR> prL) {
		Map_ProvSchd_DtlR_ShipPr_DtlR
			<ProvSchd_DtlR, ShipPr_DtlR> mpr = createMap_ProvSchd_DtlR_ShipPr_DtlR();
		Map_ProvSchd_DtlR_MST_SHIP_SCHD_R_forDel
			<ProvSchd_DtlR,MST_SHIP_SCHD_R>  dMpr = createMap_ProvSchd_DtlR_MST_SHIP_SCHD_R_forDel();

		MCList<ShipPr_DtlR>
			othrL = MCList.create(ShipPr_DtlR.class),
			insL = MCList.create(ShipPr_DtlR.class),
			delL = MCList.create(ShipPr_DtlR.class),
			provL = MCList.create(ShipPr_DtlR.class);

		// 支給予定をキャッシュ
		doProvSchdCache(prL.subList(r -> !isNull(r.ship_schd_no())));

		for (ShipPr_DtlR prR : prL) {
			if (isNull(prR.xfr_schd_no())
				|| prR.purc_ddlv_flg()
				) {
				continue;
			}
			else if (MAC_DATA_CRUD_TYP.isDEL(prR.data_crud_typ())) {
				MCList<MST_PROV_SCHD_R> l = getProvSchdL(prR.ship_schd_no());
				if (!l.isEmpty()) {
					provL.add(prR);
				}
				continue;
			}

			ShipPr_DtlR r = prR.clone();	// マッパー内で上書きするのでリストにはcloneを設定する
			MST_XFR_SCHD_R xfrR = getXfrSchdR(r.xfr_schd_no());
			// 支給
			if (!isNull(xfrR.prov_typ())) {
				MAM_BP_R bpR = getBpR(xfrR.getString("gr_sppl_cd"));

				// 未出荷、または着荷登録要の支給が対象
				if (isNull(r.ss().ship_act_qty())
					|| r.ss().ship_act_qty().isZero()
					|| !MAC_PROV_RCV_TYP.isNOT_ARR(bpR.prov_rcv_typ())) {

					provL.add(r);
				}
			}
			// 支給返品
			if (!isNull(xfrR.ret_prov_typ())) {

				// 出荷済みは支給予定を作成しない
				if (isNull(r.ss().ship_act_qty())
					|| r.ss().ship_act_qty().isZero()) {
					if (MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())) {
						// 外注間直送
						ShipPr_DtlR retR = r.clone();
						retR.trd_cd(null);
						retR.trd_ptn_typ(MAC_TRD_PTN_TYP.PROV_RTN.value());
						provL.add(retR);
					}
					else {
						provL.add(r);
					}
				}
			}
		}
		if (provL.isEmpty())	return;

		for (ShipPr_DtlR r : provL) {
			if (!r.upd02_flg()) {
				// Upd01の場合は、出荷進捗単位で出荷予定を作成しなおすため、支給予定も同様に作成しなおす
				if (!MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					delL.add(r);
				}
				if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					ShipPr_DtlR prR = r.clone();
					prR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					insL.add(prR);
				}
			}
			else {
				othrL.add(r);
			}
		}

		// Upd01からの更新は削除＆新規
		MCList<ProvSchd_DtlR>
			dL = MCList.create(ProvSchd_DtlR.class),
			iL = MCList.create(ProvSchd_DtlR.class);
		for (MCList<ShipPr_DtlR> grpL : delL.groupList(ShipPr_DtlR.$ship_pr_no)) {
			ShipPr_DtlR grpR = grpL.get(0);

			MCList<MST_SHIP_SCHD_R> schdL = getShipSchdL(grpR.ship_pr_no());
			for (MST_SHIP_SCHD_R ssR : schdL) {
				// ある・なしに関わらず、まとめて削除する
				for (String typ : new String[]{
						MAC_TRD_PTN_TYP.PROV.value(), MAC_TRD_PTN_TYP.PROV_RTN.value()}) {
					ssR.setStringNE("trd_ptn_typ", typ);
					copy(dL.add(), ssR, dMpr);
				}
			}
		}
		if (!insL.isEmpty()) {
			addAll(iL, insL, mpr);
		}

		for (ShipPr_DtlR r : othrL) {
			if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
				MST_SHIP_SCHD_R ssR = r.ss().clone();
				ssR.setStringNE("trd_ptn_typ", r.trd_ptn_typ());
				copy(dL.add(), ssR, dMpr);
			}
			// 新規 or 更新
			else {
				copy(iL.add(), r, mpr);
			}
		}
		if (!dL.isEmpty()) {
			MSBEL_ProvSchdService.ProvSchd_Upd01 o = MSBEL_ProvSchdService.crtProvSchd_Upd01();
			setPegNo(dL);
			o.up0().setAll(dL);
			o.exec();
		}
		if (!iL.isEmpty()) {
			MSBEL_ProvSchdService.ProvSchd_Upd01 o = MSBEL_ProvSchdService.crtProvSchd_Upd01();
			setPegNo(iL);
			o.up0().setAll(iL);
			o.exec();
		}
	}
	/**
	 * 支給、支給返品の追加用のマッパー
	 * @return
	 */
	protected Map_ProvSchd_DtlR_ShipPr_DtlR
			<ProvSchd_DtlR, ShipPr_DtlR> createMap_ProvSchd_DtlR_ShipPr_DtlR() {
		return new Map_ProvSchd_DtlR_ShipPr_DtlR<ProvSchd_DtlR, ShipPr_DtlR>();
	}
	public class Map_ProvSchd_DtlR_ShipPr_DtlR
			<D extends ProvSchd_DtlR, S extends ShipPr_DtlR>
			extends MCRowMapper<D,S>{
		protected MST_XFR_SCHD_R _xfrR = null;
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			dest.peg_no(src.peg_no());
			dest.data_crud_typ(src.data_crud_typ());
			dest.prov_src_schd_typ(MSC_PROV_SRC_SCHD_TYP.SHIP.value());
			dest.prov_src_schd_no1(src.ship_schd_no());
			dest.prov_src_schd_no2(null);
			dest.trd_cd(src.trd_cd());
			dest.trd_ptn_typ(src.trd_ptn_typ());
			dest.itm_cd(src.itm_cd());
			dest.itm_sub1(src.itm_sub1());
			dest.itm_sub2(src.itm_sub2());
			dest.itm_sub3(src.itm_sub3());
			dest.xfr_rsn_cd(src.rsn_cd());
			dest.base_unit_cd(src.ss().base_unit_cd());

			MCNumber baseQty = src.ss().base_unit_qty().subtract(src.ss().abort_qty());
			
			MST_PROV_SCHD_R psR = getProvSchdR(src.ship_schd_no(), src.trd_ptn_typ());
			_xfrR = getXfrSchdR(src.xfr_schd_no());

			MCList<MST_IV_R> ivL = null;
			if (!isNull(_cacheIvL)) {
				ivL = getIvL(src.ship_schd_no());
			}
			MST_IV_R ivR = isNull(ivL) ? null : ivL.get(0);

			if (MAC_DATA_CRUD_TYP.isCRT(src.data_crud_typ()) || isNull(psR)) {
				dest.prov_schd_no(null);

				// 移動、移送予定から引き継ぐ
				if (MAC_TRD_PTN_TYP.isPROV_RTN(src.trd_ptn_typ())) {
					dest.wg_cd(_xfrR.getStringNE("gi_wg_cd"));
					dest.prsppl_cd(_xfrR.getStringNE("gi_sppl_cd"));
					dest.prov_typ(_xfrR.ret_prov_typ());
					dest.prov_basis_typ(_xfrR.ret_prov_basis_typ());
					if (!isNull(ivR) && ivR.iv_ship_flg()) {
						dest.xrate_inpt_flg(ivR.xrate_inpt_flg());
						dest.xrate(ivR.xrate());
						dest.ptax_xrate_inpt_flg(ivR.ptax_xrate_inpt_flg());
						dest.ptax_xrate(ivR.ptax_xrate());
					}
					else {
						dest.xrate_inpt_flg(_xfrR.ret_xrate_inpt_flg());
						dest.xrate(_xfrR.ret_xrate());
						dest.ptax_xrate_inpt_flg(_xfrR.ret_ptax_xrate_inpt_flg());
						dest.ptax_xrate(_xfrR.ret_ptax_xrate());
					}
					dest.trd_cur_cd(_xfrR.ret_trd_cur_cd());
					dest.tax_fix_flg(_xfrR.ret_tax_fix_flg());
					dest.tax_cd(_xfrR.ret_tax_cd());
					dest.trd_cur_upri(_xfrR.ret_trd_cur_upri());
					dest.wtax_rate(_xfrR.ret_wtax_rate());
				}
				else {
					dest.wg_cd(_xfrR.getStringNE("gr_wg_cd"));
					dest.prsppl_cd(_xfrR.getStringNE("gr_sppl_cd"));
					dest.prov_typ(_xfrR.prov_typ());
					dest.prov_basis_typ(_xfrR.prov_basis_typ());
					if (!isNull(ivR) && ivR.iv_ship_flg()) {
						dest.xrate_inpt_flg(ivR.xrate_inpt_flg());
						dest.xrate(ivR.xrate());
						dest.ptax_xrate_inpt_flg(ivR.ptax_xrate_inpt_flg());
						dest.ptax_xrate(ivR.ptax_xrate());
					}
					else {
						dest.xrate_inpt_flg(_xfrR.xrate_inpt_flg());
						dest.xrate(_xfrR.xrate());
						dest.ptax_xrate_inpt_flg(_xfrR.ptax_xrate_inpt_flg());
						dest.ptax_xrate(_xfrR.ptax_xrate());
					}
					dest.trd_cur_cd(_xfrR.trd_cur_cd());
					dest.tax_fix_flg(_xfrR.tax_fix_flg());
					dest.tax_cd(_xfrR.tax_cd());
					dest.trd_cur_upri(_xfrR.trd_cur_upri());
					dest.wtax_rate(_xfrR.wtax_rate());
				}
				dest.intr_rmrks(_xfrR.intr_rmrks());
			}
			else {
				// 支給予定から引き継ぐ
				dest.prov_schd_no(psR.prov_schd_no());
				dest.wg_cd(psR.wg_cd());
				dest.prsppl_cd(psR.prsppl_cd());
				dest.prov_typ(psR.prov_typ());
				dest.prov_basis_typ(psR.prov_basis_typ());
				if (!isNull(ivR) && ivR.iv_ship_flg()) {
					dest.xrate_inpt_flg(ivR.xrate_inpt_flg());
					dest.xrate(ivR.xrate());
					dest.ptax_xrate_inpt_flg(ivR.ptax_xrate_inpt_flg());
					dest.ptax_xrate(ivR.ptax_xrate());
				}
				else {
					dest.xrate_inpt_flg(psR.xrate_inpt_flg());
					dest.xrate(psR.xrate());
					dest.ptax_xrate_inpt_flg(psR.ptax_xrate_inpt_flg());
					dest.ptax_xrate(psR.ptax_xrate());
				}
				dest.trd_cur_cd(psR.trd_cur_cd());
				dest.tax_fix_flg(psR.tax_fix_flg());
				dest.tax_cd(psR.tax_cd());
				dest.trd_cur_upri(psR.trd_cur_upri());
				dest.wtax_rate(psR.wtax_rate());
				dest.intr_rmrks(psR.intr_rmrks());
				if (!dest.xrate_inpt_flg()) {
					dest.xrate(null);
				}
				if (!dest.ptax_xrate_inpt_flg()) {
					dest.ptax_xrate(null);
				}
				if (!dest.tax_fix_flg()) {
					dest.tax_cd(null);
				}
			}
			
			dest.stk_id_typ(_xfrR.stk_id_typ());
			dest.stk_arrv_bp_cd(_xfrR.gi_stk_arrv_bp_cd());
			MAM_BP_R bpR = getBpR(dest.prsppl_cd());
			// 着荷用の場合、インボイス出荷実績数量を加味する
			if (!isNull(_xfrR.prov_typ()) && !MAC_PROV_RCV_TYP.isNOT_ARR(bpR.prov_rcv_typ())) {
				if (nvl(src.ss().iv_act_qty(), MCNumber.ZERO).isPositive()) {
					dest.base_unit_qty(baseQty.subtract(src.ss().iv_act_qty()));
					if (!dest.base_unit_qty().isPositive()) {
						dest.base_unit_qty(0);
					}
				}
				else {
					dest.base_unit_qty(baseQty);
				}
			}
			else {
				if (nvl(src.ss().ship_inst_qty(), MCNumber.ZERO).isPositive()) {
					baseQty = src.ss().ship_inst_qty();
				}
				if (nvl(src.ss().ship_act_qty(), MCNumber.ZERO).isPositive()) {
					// 出荷実績数量≧出荷予定数量の場合は支給予定を削除せずにゼロで作成する
					// ※削除してしまうと、納品伝票作成で支給予定が特定できなくなってしまう
					dest.base_unit_qty(baseQty.subtract(src.ss().ship_act_qty()));
					if (!dest.base_unit_qty().isPositive()) {
						dest.base_unit_qty(0);
					}
				}
				else {
					dest.base_unit_qty(baseQty);
				}
			}

			if (MAC_TRD_PTN_TYP.isPROV_RTN(src.trd_ptn_typ())
				|| MAC_PROV_RCV_TYP.isNOT_ARR(bpR.prov_rcv_typ())) {
				dest.accpt_schd_dt(
					src.is_src_ship_inst_flg() ? 
					nvl(src.inst_ship_schd_tm(), src.ship_schd_tm()) : src.ship_schd_tm()
				);
			}
			else {
				MST_SHIP_SCHD_R schdR = getShipSchdR(src.ship_schd_no());
				if (isNull(schdR)) {
					schdR = MST_SHIP_SCHD_R.create();
				}
				MCDate dlvSchdDt = src.is_src_ship_inst_flg()
						? nvl(src.inst_dlv_schd_tm(), src.dlv_schd_tm())
						: nvl(schdR.getDateNE("inst_dlv_schd_tm"),
								src.dlv_schd_tm());

				if (!isNull(ivR) && !isNull(ivR.eta_dt())) {
					if(ivR.eta_dt().ltDate(dlvSchdDt)) {
						dest.accpt_schd_dt(dlvSchdDt);
					}
					else {
						dest.accpt_schd_dt(ivR.eta_dt());
					}
				}
				else {
					if (MAC_VIA_DLV_TYP.isVIA(src.via_dlv_typ())) {
						MAM_LG_CTL_R lgCtlR = getLgCtlR(
								src.ship_fr_lg_grp_cd(), _xfrR.gr_lg_grp_cd(), src.ship_term_cd());
						if (!isNull(lgCtlR.xfr_lt())) {
							MCDate dt = src.is_src_ship_inst_flg()
									? nvl(src.inst_ship_schd_tm(), src.ship_schd_tm())
									: nvl(schdR.getDateNE("inst_ship_schd_tm"),
											src.ship_schd_tm());
							dt = dt.trunc(MCDateFieldType.DAY).addDay(lgCtlR.xfr_lt());
							if (dt.ltDate(dlvSchdDt)) {
								dest.accpt_schd_dt(dlvSchdDt);
							}
							else {
								dest.accpt_schd_dt(dt);
							}
						}
					}
					else {
						dest.accpt_schd_dt(dlvSchdDt);
					}
				}
			}
			if (!isNull(dest.accpt_schd_dt())) {
				dest.accpt_schd_dt(dest.accpt_schd_dt().trunc(MCDateFieldType.DAY));
			}

			dest.sub_char1(null);
			dest.sub_char2(null);
			dest.sub_char3(null);
		}
	}
	/**
	 * 支給予定削除用のマッパー
	 */
	protected Map_ProvSchd_DtlR_MST_SHIP_SCHD_R_forDel
			<ProvSchd_DtlR, MST_SHIP_SCHD_R> createMap_ProvSchd_DtlR_MST_SHIP_SCHD_R_forDel() {
		return new Map_ProvSchd_DtlR_MST_SHIP_SCHD_R_forDel<ProvSchd_DtlR, MST_SHIP_SCHD_R>();
	}
	public class Map_ProvSchd_DtlR_MST_SHIP_SCHD_R_forDel
			<D extends ProvSchd_DtlR, S extends MST_SHIP_SCHD_R> extends MCRowMapper<D,S>{
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			dest.prov_src_schd_typ(MSC_PROV_SRC_SCHD_TYP.SHIP.value());
			dest.prov_src_schd_no1(src.ship_schd_no());
			dest.trd_ptn_typ(src.getString("trd_ptn_typ"));
		}
	}

	/**
	 * 支給予定サービスのチェック処理を実行する
	 * Chk01からは呼ばれないので、移動・移送予定が必ずある前提。
	 */
	protected void callProvSchdChk01(MCList<ShipPr_DtlR> prL) {
		MCList<ShipPr_DtlR> provL = MCList.create(ShipPr_DtlR.class);

		for (ShipPr_DtlR r : prL) {
			if (isNull(r.xfr_schd_no())) {
				continue;
			}
			MST_XFR_SCHD_R xfrR = getXfrSchdR(r.xfr_schd_no());
			// 支給
			if (!isNull(xfrR.prov_typ())) {
				MAM_BP_R bpR = getBpR(xfrR.getString("gr_sppl_cd"));

				// 未出荷、または着荷登録要の支給が対象
				if (isNull(r.ss().ship_act_qty())
					|| r.ss().ship_act_qty().isZero()
					|| !MAC_PROV_RCV_TYP.isNOT_ARR(bpR.prov_rcv_typ())) {

					provL.add(r);
				}
			}
			// 支給返品
			if (!isNull(xfrR.ret_prov_typ())) {
				if (MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())) {
					// 外注間直送
					ShipPr_DtlR retR = r.clone();
					retR.trd_cd(null);
					retR.trd_ptn_typ(MAC_TRD_PTN_TYP.PROV_RTN.value());
					provL.add(retR);
				}
				else {
					provL.add(r);
				}
			}
		}
		// 支給予定をキャッシュ
		doProvSchdCache(provL);

		if (!provL.isEmpty()) {
			MSBEL_ProvSchdService.ProvSchd_Chk01 o = MSBEL_ProvSchdService.crtProvSchd_Chk01();
			setAll(o.up0(), provL, createMap_ProvSchd_DtlR_ShipPr_DtlR());
			o.exec();
			copyErrFlg(provL, o.down0());
		}
	}

	/**
	 * オーダ登録サービスを実行する
	 */
	protected void callOrdRegSrv(MCList<ShipPr_DtlR> prL) {
		MSBCL_OrdRegService.Ord_Upd04 o = MSBCL_OrdRegService.crtOrd_Upd04();
		Map_Ord_Upd04_DtlR_MST_XFR_SCHD_R
			<Ord_Upd04_DtlR, MST_XFR_SCHD_R> mpr = createMap_Ord_Upd04_DtlR_MST_XFR_SCHD_R();
		for (ShipPr_DtlR r : prL) {
			MST_XFR_SCHD_R xfrR = getXfrSchdR(r.xfr_schd_no());
			if (isNull(xfrR)
				|| isNull(xfrR.itm_ord_no())) {
				continue;
			}
			copy(o.up0().add(), xfrR, mpr);
		}
		if (!o.up0().isEmpty()) {
			o.exec();
		}
	}
	/**
	 * オーダ登録サービス用のマッパー
	 */
	protected Map_Ord_Upd04_DtlR_MST_XFR_SCHD_R
			<Ord_Upd04_DtlR, MST_XFR_SCHD_R> createMap_Ord_Upd04_DtlR_MST_XFR_SCHD_R() {
		return new Map_Ord_Upd04_DtlR_MST_XFR_SCHD_R<Ord_Upd04_DtlR, MST_XFR_SCHD_R>();
	}
	
	public class Map_Ord_Upd04_DtlR_MST_XFR_SCHD_R
			<D extends Ord_Upd04_DtlR, S extends MST_XFR_SCHD_R> extends MCRowMapper<D,S>{
		@Override
		protected void valueCopy(D dest, S src) {
			dest.itm_ord_no(src.itm_ord_no());
			dest.itm_ord_typ(MSC_ITM_ORD_TYP.XFR.value());
		}
	}

	/**
	 * ＷＧ間依頼サービスを実行する（出荷依頼を更新をする）
	 */
	protected void callWgRqstSrvForShipRqst(MCList<ShipPr_DtlR> prL) {
		// 販売納期調整登録から実行された場合は、ＷＧ間依頼を取得
		MCList<MST_WG_RQST_R> wgRqstL = MCList.create(MST_WG_RQST_R.class);
		MST_WG_RQST_R t = MST_WG_RQST_R.create("T");
		MCQueryApiBuilder wgRqstL_bldr = MCQueryApiBuilder.create(t);
		wgRqstL.addBooleanColumn("noAutoPrmsFlg");
		wgRqstL_bldr.setSelect(t.slo_d_no);
		wgRqstL_bldr.addSelect(greatest(t.prms_uncn_flg, t.re_rqst_flg).as("noautoprmsflg"));
		wgRqstL_bldr.setWhere(t.slo_d_no.eq(bind("slo_d_no")));
		wgRqstL_bldr.addWhereWithAnd(t.wg_rqst_typ.eq(value(MAC_WG_RQST_TYP.SHIP.value())));
		wgRqstL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
		dbSelect("MSBEL5500_MST_WG_RQST_S01", wgRqstL, wgRqstL_bldr,
				prL.subList(ShipPr_DtlR.$is_src_sls_dlv_dt_adjst_flg, true));
		
		MCIndexKey wgRqstKey = wgRqstL.createIndex(MST_WG_RQST_R.$slo_d_no, "noAutoPrmsFlg");
		
		MSBAL_WgRqstService.WgRqst_Upd05 o = MSBAL_WgRqstService.crtWgRqst_Upd05();
		for (MCList<ShipPr_DtlR> l : prL.groupList(ShipPr_DtlR.$slo_d_no)) {
			ShipPr_DtlR r = l.get(0);
			if (r.ship_judge_flg()) {
				continue;
			}
			else if (!isNull(r.slo_d_no())) {
				WgRqst_Upd05_DtlR up = o.up0().createRow();
				up.slo_d_no(r.slo_d_no());
				// 出荷予定変更、出荷指図登録から実行した場合は、自動回答
				if (r.is_src_ship_inst_flg() || r.is_src_ship_schd_flg()) {
					up.auto_prms_flg(true);
				}
				else if (r.is_src_sls_dlv_dt_adjst_flg()) {
					// 回答確認済で再調整依頼となるＷＧ間依頼がない場合は合意したものとして、自動回答とする
					MST_WG_RQST_R wgRqstR = wgRqstL.getFirst(wgRqstKey, r.slo_d_no(), true);
					if (isNull(wgRqstR)) {
						up.auto_prms_flg(true);
					}
					else {
						up.auto_prms_flg(false);
					}
				}
				else {
					up.auto_prms_flg(false);
				}
				up.setAttributes(r);
				o.up0().add(up);
			}
		}
		if (!o.up0().isEmpty()) {
			o.exec();
		}
	}

	/**
	 * ＷＧ間依頼サービスを実行する（ステータス更新）
	 */
	protected void callWgRqstSrv(MCList<ShipPr_DtlR> prL) {
		
		// ＷＧ間依頼のステータス更新
		MSBAL_WgRqstService.WgRqst_Upd03 o = MSBAL_WgRqstService.crtWgRqst_Upd03();
		Map_WgRqst_Upd03_DtlR_ShipPr_DtlR
			<WgRqst_Upd03_DtlR, ShipPr_DtlR, MST_XFR_SCHD_R> mpr = createMap_WgRqst_Upd03_DtlR_ShipPr_DtlR();
		for (ShipPr_DtlR r : prL) {
			if (r.ship_judge_flg()) {
				continue;
			}
			else if (!isNull(r.slo_d_no())) {
				if (!r.purc_ddlv_flg() && !MAC_SHIP_INST_TYP.isNO_PICK(r.ship_inst_typ())) {
					copy(o.up0().add(), r, null, mpr);
				}
			}
			else if (!isNull(r.xfr_schd_no())) {
				MST_XFR_SCHD_R xfrR = getXfrSchdR(r.xfr_schd_no());
				if (MSC_XFR_SRC_TYP.isWG_RQST(xfrR.xfr_src_typ())) {
					copy(o.up0().add(), r, xfrR, mpr);
				}
			}
		}
		if (!o.up0().isEmpty()) {
			o.exec();
		}
	}

	/**
	 * ＷＧ間依頼サービス用のマッパー
	 */
	protected Map_WgRqst_Upd03_DtlR_ShipPr_DtlR
			<WgRqst_Upd03_DtlR, ShipPr_DtlR, MST_XFR_SCHD_R> createMap_WgRqst_Upd03_DtlR_ShipPr_DtlR() {
		return new Map_WgRqst_Upd03_DtlR_ShipPr_DtlR<WgRqst_Upd03_DtlR, ShipPr_DtlR, MST_XFR_SCHD_R>();
	}
	public class Map_WgRqst_Upd03_DtlR_ShipPr_DtlR
			<D extends WgRqst_Upd03_DtlR, S extends ShipPr_DtlR, W extends MST_XFR_SCHD_R> extends MAUCC_RowMapperWith<D,S,W>{
		protected MST_XFR_SCHD_R _xfrR;
		@Override
		public void setWith(W xfrR) {
			_xfrR = xfrR;
		}
		@Override
		protected void valueCopy(D dest, S src) {
			if (!isNull(src.slo_d_no())) {
				dest.slo_d_no(src.slo_d_no());
			}
			else {
				dest.wg_rqst_prms_no(_xfrR.xfr_src_no());
			}
		}
	}

	/**
	 * 出荷進捗リストを作成する
	 */
	protected void makeShipPrL(MCList<ShipPr_DtlR> prL) {
		for (MCList<ShipPr_DtlR> grpL : prL.groupList(ShipPr_DtlR.$ship_pr_no)) {
			ShipPr_DtlR prR = grpL.get(0);
			MST_SHIP_PR_R r = prR.sp();

			if (prR.upd02_flg()) {
				r.setBooleanNE("rem_abort_flg", prR.rem_abort_flg());
				// Upd02では無条件に更新のみ
				_updShipPrL.addUpdR(r);
			}
			else if (MAC_DATA_CRUD_TYP.isDEL(prR.data_crud_typ())) {
				_updShipPrL.addDelR(r);
			}
			else {
				if (MAC_DATA_CRUD_TYP.isCRT(prR.data_crud_typ())) {
					// Upd02の場合の「新規」は、出荷予定が新規の意味（出荷進捗NOが入っている）
					// ここではUpd01による「新規」のみを対象にする
					r.prms_qty(nvl(r.prms_qty(), MCNumber.ZERO));
					r.dlv_inst_rcpt_qty(nvl(r.dlv_inst_rcpt_qty(), MCNumber.ZERO));
					r.dlv_inst_prms_qty(nvl(r.dlv_inst_prms_qty(), MCNumber.ZERO));
					r.ship_inst_qty(0);
					r.ship_act_qty(0);
					r.iv_schd_qty(0);
					r.iv_act_qty(0);
					r.sls_qty(0);
					r.dlv_qty(0);
					r.ship_ret_qty(0);
					r.re_ship_schd_qty(0);
					r.ship_schd_abort_qty(0);
					r.sls_schd_abort_qty(0);

					_updShipPrL.addInsR(r);
				}
				else {
					_updShipPrL.addUpdR(r);
				}
				// 打切
				if (isAbort(prR)) {
					r.ship_schd_abort_qty(r.base_unit_qty().subtract(r.ship_act_qty()));
					r.ship_cmpl_flg(true);
					if (MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ())) {
						r.sls_schd_abort_qty(r.base_unit_qty().subtract(r.sls_qty()));
						r.prms_dlv_dt(null);
						r.prms_dt(null);
						r.prms_qty(0);
						r.sls_cmpl_flg(true);
					}
					else {
						r.sls_schd_abort_qty(0);
						r.sls_cmpl_flg(false);
					}
				}
				// 打切解除
				else if (isAbortRel(prR)) {
					r.ship_schd_abort_qty(0);
					r.sls_schd_abort_qty(0);
					r.ship_cmpl_flg(false);
					r.sls_cmpl_flg(false);
				}
			}
		}
	}

	/**
	 * 出荷元物流Ｇを設定する
	 */
	protected void setShipFrLgGrp(MCList<ShipPr_DtlR> prL) {

		for (ShipPr_DtlR prR : prL) {
			MCList<MST_SHIP_ALLOC_STS_R>
				allocL =_updAllocStsL
					.subList(_updAllocStsLKey, prR.toArray(_updAllocStsLKey.getKeys()));

			allocL.addStringColumn("ship_fr_lg_grp_cd");
			if (allocL.groupBy("ship_fr_lg_grp_cd").size() == 1) {
				// 下記条件を満たす場合は、引当状況の出荷元物流Ｇを出荷予定に設定する
				// ・引当状況すべてが同じ出荷元物流Ｇ
				// ・出荷予定と物流Ｇが異なる
				// ※総量引当の場合に出荷予定と引当状況とで物流Ｇが異なることがある
				MST_SHIP_ALLOC_STS_R r = allocL.get(0);
				if (!isNull(r.getString("ship_fr_lg_grp_cd"))
					&& !isSame(prR.ship_fr_lg_grp_cd(), r.getString("ship_fr_lg_grp_cd"))) {
					prR.ship_fr_lg_grp_cd(r.getString("ship_fr_lg_grp_cd"));
					prR.wg_cd(getLgGrpR(prR.ship_fr_lg_grp_cd()).wg_cd());
					prR.dt_recalc_flg(true);
				}
			}
		}
	}

	/**
	 * 出荷予定リストを作成する
	 */
	protected void makeShipSchdL(MCList<ShipPr_DtlR> prL, MCList<Alloc_Avl_Sprt01_CndR> allocAvlSprt01L, MCIndexKey allocAvlSprtKey) {

		// 出荷元物流Ｇ
		setShipFrLgGrp(prL);

		// 出荷予定分割
		splitShipSchd(prL, allocAvlSprt01L, allocAvlSprtKey);

		// 出荷予定日再計算
		callCalcSchdDtSrv(prL);

		// 出荷進捗ごとに出荷予定を処理する
		for (ShipPr_DtlR prR : prL) {
			MST_SHIP_SCHD_R r = prR.ss();

			// 削除
			if (MAC_DATA_CRUD_TYP.isDEL(prR.data_crud_typ())) {
				_updShipSchdL.addDelR(r);
			}
			// 新規 or 更新
			else {
				MST_SHIP_SCHD_R ssR = getShipSchdR(r.ship_schd_no());
				if (isNull(ssR)) {
					if (isNull(r.alloc_prio())) {
						r.alloc_prio(getAllocPrio(prR.ship_pr_no()));
					}
					r.alloc_qty(0);
					r.wait_qty(0);
					r.ship_inst_qty(0);
					r.ship_act_qty(0);
					if (!prR.iv_schd_qty_upd_flg()) {
						r.iv_schd_qty(0);
					}
					r.iv_act_qty(0);
					r.sls_qty(0);
					r.dlv_qty(0);
					r.ship_ret_qty(0);
					r.abort_qty(0);
					r.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());

					_updShipSchdL.addInsR(r);
				}
				else {
					r.ship_inst_qty(ssR.ship_inst_qty());
					r.ship_act_qty(ssR.ship_act_qty());
					if (!prR.iv_schd_qty_upd_flg()) {
						r.iv_schd_qty(ssR.iv_schd_qty());
					}
					r.iv_act_qty(ssR.iv_act_qty());
					r.sls_qty(ssR.sls_qty());
					r.dlv_qty(ssR.dlv_qty());
					r.ship_ret_qty(ssR.ship_ret_qty());
					r.abort_qty(ssR.abort_qty());
					r.stk_insp_typ(ssR.stk_insp_typ());

					_updShipSchdL.addUpdR(r);
				}
				// 打切
				if (isAbort(prR)) {
					r.abort_qty(r.base_unit_qty().subtract(r.ship_act_qty()));
					r.abort_flg(true);
					r.cmpl_flg(true);
					r.slo_prms_no(null);
				}
				// 打切解除
				if (isAbortRel(prR)) {
					r.abort_qty(0);
					r.abort_flg(false);
					r.cmpl_flg(false);
				}
				if (MSC_STK_ID_TYP.isCSTSTK(r.stk_id_typ()) && !isNull(prR.slo_d_no())) {
					// 出荷予定の在庫識別区分が預りの場合、
					// 既に売上済であって、なおかつ預りは一部売上できないので
					// あらかじめ基準単位数量と同数を設定しておく
					r.sls_qty(r.base_unit_qty());
				}
				if (!prR.upd02_flg()) {
					if (!r.fix_flg()) {
						r.ship_rqst_tm(prR.ship_rqst_tm());
						r.pd_inst_dlv_tm(prR.dlv_rqst_tm());
						r.ship_term_cd(prR.sp().ship_term_cd());
					}
					r.ship_cnt_rmrks(prR.ship_cnt_rmrks());
					r.trd_rmrks(prR.sp().getStringNE("trd_rmrks"));
					r.trd_d_rmrks(prR.sp().getStringNE("trd_d_rmrks"));
				}
				r.ship_abl_flg(shipJudge(prR));
				r.ship_lot_chk_tar_flg(shipLotCheck(prR));
				r.ship_skip_flg(prR.purc_ddlv_flg());
				setShipSchdNoForAllocStsL(prR);	// 出荷予定NO再設定
			}
		}

		// 出荷進捗ごとに不要になる出荷予定を削除する
		for (MCList<ShipPr_DtlR> grpL : prL.groupList(ShipPr_DtlR.$ship_pr_no)) {
			ShipPr_DtlR prR = grpL.get(0);
			if (!prR.upd02_flg()) {
				if (!isAbort(prR) && !isAbortRel(prR)) {
					getShipSchdL(prR.ship_pr_no()).forEach(rr -> {
						// 未確定の出荷予定を削除
						if (!rr.fix_flg()) {
							_updShipSchdL.addDelR(rr);
						}
					});
				}
				prR.sp().ship_schd_tm((MCDate)grpL.max(MST_SHIP_SCHD_R.$ship_schd_tm));
				prR.sp().dlv_schd_tm((MCDate)grpL.max(MST_SHIP_SCHD_R.$dlv_schd_tm));
				prR.sp().ship_schd_split_flg(grpL.size() > 1);
			}
		}
		setInstQty(prL);			// 出荷指図数量
		setAllocWaitQty(prL);	// 引当数量、保留数量
		setPrStsTyp(prL);			// 出荷進捗状況
		
		for (ShipPr_DtlR prR : prL) {
			MST_SHIP_SCHD_R r = prR.ss();

			// 確定済のレコードは既に出荷条件ＣＤ、出荷作業ＣＤが復元されているので対象外
			if (r.fix_flg()) {
				continue;
			}

			if (prR.ship_term_cd_restore_flg() || prR.ship_wk_cd_restore_flg()) {
				MCList<MST_SHIP_SCHD_R> oldShipSchdL = getShipSchdL(prR.ship_pr_no());
				MCIndexKey idx = oldShipSchdL.createIndex(MST_SHIP_SCHD_R.$fix_flg, MST_SHIP_SCHD_R.$ship_fr_lg_grp_cd, MST_SHIP_SCHD_R.$alloc_qty);

				// 出荷予定が分割される条件は以下の通り
				// 確定済の出荷予定が存在するとき
				// 出荷元物流Ｇが異なるとき
				// 出荷予定分割区分：分割する、かつ引当済と未引当が混在するとき
				MCList<MST_SHIP_SCHD_R> tgtL = MCList.create(MST_SHIP_SCHD_R.class);
				tgtL = oldShipSchdL.subList(idx, r.toArray(idx.getKeys()));

				if (tgtL.size() == 1) {
					if (prR.ship_term_cd_restore_flg()) {
						r.ship_term_cd(tgtL.get(0).ship_term_cd());
					}
					if (prR.ship_wk_cd_restore_flg() && !prR.dt_recalc_flg()) {
						r.ship_wk_cd(tgtL.get(0).ship_wk_cd());
					}
				}
			}
		}
	}

	/**
	 * 出荷引当状況の出荷予定NOを再設定する
	 */
	protected void setShipSchdNoForAllocStsL(ShipPr_DtlR prR) {
		// 出荷予定分割によって、出荷予定NOが変わる可能性があるため
		// 出荷予定リスト作成時に再設定する
		if (!prR.ss().inst_bndl_flg()) {
			MCList<MST_SHIP_ALLOC_STS_R>
				 sasL = _updAllocStsL.subList(_updAllocStsLKey, prR.toArray(_updAllocStsLKey.getKeys()));
			sasL.setString(MST_SHIP_ALLOC_STS_R.$ship_schd_no, prR.ss().ship_schd_no());
		}
	}

	/**
	 * 出荷進捗状況を設定する<br>
	 * 出荷実績数量、出荷指図数量を参照するので、事前に設定済みであること
	 */
	protected void setPrStsTyp(MCList<ShipPr_DtlR> prL) {
		for (ShipPr_DtlR r : prL) {
			if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
				continue;
			}
			MST_SHIP_SCHD_R schdR = r.ss();
			if (!isNull(schdR.ship_act_qty()) && schdR.ship_act_qty().isPositive()) {
				if (schdR.ship_act_qty().gte(schdR.base_unit_qty())) {
					// 出荷実績数量≧基準単位数量＝出荷済
					schdR.pr_sts_typ(MSC_PR_STS_TYP.SHIP.value());
				}
				else {
					// 出荷実績数量＜基準単位数量＝一部出荷済
					schdR.pr_sts_typ(MSC_PR_STS_TYP.PART_SHIP.value());
				}
			}
			else if (schdR.ship_inst_qty().isPositive()) {
				// 出荷指図数量＞０＝指図済
				schdR.pr_sts_typ(MSC_PR_STS_TYP.INST.value());
			}
			else if (MAC_SHIP_INST_TYP.isNON(r.ship_inst_typ())) {
				// 指図対象外＝未出荷
				schdR.pr_sts_typ(MSC_PR_STS_TYP.NOT_SHIP.value());
			}
			else {
				// 上記以外＝未指図
				schdR.pr_sts_typ(MSC_PR_STS_TYP.NOT_INST.value());
			}
		}
	}

	/**
	 * 引当数量、保留数量を設定する
	 */
	protected void setAllocWaitQty(MCList<ShipPr_DtlR> prL) {
		for (MCList<ShipPr_DtlR> grpL : prL.groupList(_$peg)) {
			ShipPr_DtlR prR = grpL.get(0);
			if (MAC_DATA_CRUD_TYP.isDEL(prR.data_crud_typ())) {
				continue;
			}
			if (MAC_STK_MNG_TYP.isNOT_MNG(getItmR(prR).stk_mng_typ())
				|| prR.purc_ddlv_flg()) {
				grpL.forEach(r -> {
					r.ss().alloc_qty(0);
					r.ss().wait_qty(0);
				});
			}
			else {
				// 引当数を取得
				MCList<MST_SHIP_ALLOC_STS_R>
					 sasL = _updAllocStsL
					 				.subList(_updAllocStsLKey, prR.toArray(_updAllocStsLKey.getKeys()))
					 				.subList(r -> r.alloc_flg());
				MCNumber allocQty = isNull(sasL) ? MCNumber.ZERO : sasL.sum(MST_SHIP_ALLOC_STS_R.$base_unit_qty);

				// 引当数を出荷予定ごとに割り当てる
				grpL.sort(ShipPr_DtlR.$ship_schd_no);
				for (MST_SHIP_SCHD_R r : grpL.innerRowList("ss", MST_SHIP_SCHD_R.class)) {
					MCNumber
						baseQty = isInst(prR) ? r.ship_inst_qty() : r.base_unit_qty(),
						actQty = nvl(r.ship_act_qty(), MCNumber.ZERO);
					
					r.alloc_qty(0);
					if (allocQty.gt(baseQty)) {
						r.alloc_qty(r.abort_flg() && actQty.lt(baseQty) ? actQty : baseQty);
						allocQty = allocQty.subtract(baseQty);
					}
					else if (allocQty.isPositive()) {
						r.alloc_qty(r.abort_flg() && actQty.lt(allocQty) ? actQty : allocQty);
						allocQty = MCNumber.ZERO;
					}

					if (r.abort_flg() || MAC_ALLOC_TYP.isNON(prR.alloc_typ())) {
						// 打切、引当なしは保留数を設定しない
						r.wait_qty(0);
					}
					else {
						r.wait_qty(baseQty.subtract(r.alloc_qty()));
					}
				}
			}
		}
	}

	/**
	 * 出荷指図数量を設定する
	 */
	protected void setInstQty(MCList<ShipPr_DtlR> prL) {
		for (MCList<ShipPr_DtlR> grpL : prL.groupList(_$peg)) {
			ShipPr_DtlR prR = grpL.get(grpL.size() - 1);
			if (MAC_DATA_CRUD_TYP.isDEL(prR.data_crud_typ())) {
				continue;
			}
			else if (!isInst(prR)) {
				grpL.innerRowList("ss").setNumber("ship_inst_qty", 0);
				continue;
			}

			// 呼出し元で出荷予定ごとに案分してくるので、そのまま設定する
			for (ShipPr_DtlR r : grpL) {
				r.ss().ship_inst_qty(r.inst_qty());
			}
		}
	}

	/**
	 * 出荷引当状況リストを作成する
	 */
	protected void makeAllocStsL(MCList<ShipPr_DtlR> prL, MCList<Alloc_Avl_Sprt01_CndR> allocAvlSprt01L, MCIndexKey allocAvlSprtKey) {

		MCIndexKey idx = _allocRsltL.createIndex(_$peg);
		doLocCache(prL, _allocRsltL);
		doShipInstDCache(prL);

		Map_MST_SHIP_ALLOC_STS_R_Alloc_RsltR
			<MST_SHIP_ALLOC_STS_R,Alloc_RsltR,ShipPr_DtlR> mpr= createMap_MST_SHIP_ALLOC_STS_R_Alloc_RsltR();
		Map_MST_SHIP_ALLOC_STS_R_ShipPr_DtlR
					<MST_SHIP_ALLOC_STS_R, ShipPr_DtlR> zMpr = createMap_MST_SHIP_ALLOC_STS_R_ShipPr_DtlR();
				
		mpr.setWith(allocAvlSprt01L);
		zMpr.setWith(allocAvlSprt01L);
		// 受払進捗管理ＮＯの発番
		MCList<ShipPr_DtlR> subCrtSeqL = prL.subList(spR -> isNull(spR.sp().io_schd_pr_no()));
		doSeqCache(MSC_NUM_SYS_TYP.IOSCHDPR, subCrtSeqL.size());
		// 指図から実行された場合、peg_noが重複することがある（指図まとめの場合、指図明細単位にpeg_noを設定する）
		// 出荷引当状況は出荷予定 or 指図明細の単位で作成する
		for (MCList<ShipPr_DtlR> grpL : prL.groupList(_$peg)) {
			ShipPr_DtlR prR = grpL.get(0);
			if (MAC_DATA_CRUD_TYP.isDEL(prR.data_crud_typ())) {
				// 出荷引当状況は作成しない
				continue;
			}

			MCList<MST_SHIP_ALLOC_STS_R> allocL = _updAllocStsL.createInstance();
 
			if (nvl(prR.ss().ship_act_qty(), MCNumber.ZERO).isPositive()) {
				// 引当状況から作成（一部出荷の打切））
				MCList<MST_SHIP_ALLOC_STS_R> sasL = 
					!isNull(prR.ss().ship_inst_d_no()) ?
						getAllocStsLByInst(prR.ss().ship_inst_d_no()) :
						getAllocStsL(prR.ship_schd_no());
				sasL.forEach(r -> {
					MST_SHIP_ALLOC_STS_R allocR = allocL.add();
					MCRow.copyall(allocR, r);
					allocR.setNumberNE(_$peg[0], prR.peg_no());
					allocR.setNumberNE(_$peg[1], prR.peg_seq());
				});
			}
			else {
				MCList<Alloc_RsltR> rsltL= _allocRsltL.subList(idx, prR.toArray(idx.getKeys()));
				if (!rsltL.isEmpty()) {
					// 引当結果から作成
					addAll(allocL, rsltL, prR, mpr);
				}
			}
			// 未引当残あり（引当結果なしも含む）
			// 指図済みの場合は指図数から残数を算出する
			MCNumber qty = isInst(prR) ? prR.inst_qty() :  prR.ss().base_unit_qty();
			qty = qty.subtract(nvl(allocL.sum(Srch_RsltR.$base_unit_qty), MCNumber.ZERO));
			if (qty.isPositive()) {
				// 出荷予定から残数分作成
				ShipPr_DtlR rr = prR.clone();
				rr.ss().base_unit_qty(qty);
				copy(allocL.add(), rr, zMpr);
			}

			// 打切、打切解除は引当をはがす(未出荷の打ち切りのみ)
			if (nvl(prR.ss().ship_act_qty(), MCNumber.ZERO).isZero()) {
				if (isAbort(prR) || isAbortRel(prR)) {
					for (MST_SHIP_ALLOC_STS_R allocR : allocL) {
						if (MSC_STK_ID_TYP.isCSTSTK(allocR.stk_id_typ()) && !isNull(prR.slo_d_no()) && isAbortRel(prR)) {
							// 預りの打切解除の時だけは引当済みに戻す
							allocR.alloc_flg(true);
							allocR.alloc_wait_flg(false);
							allocR.alloc_scope_typ(MAC_ALLOC_SCOPE_TYP.LOC.value());
						}
						else {
							// 打切、打切解除は引当をはがす
							allocR.alloc_flg(false);
							if (isAbort(prR)) {
								allocR.alloc_wait_flg(false);
							}
							else {
								allocR.alloc_wait_flg(isAllocWait(prR, null, allocAvlSprt01L, allocAvlSprtKey));
							}
							
							if (allocR.alloc_flg() || allocR.alloc_wait_flg()) { 
								allocR.alloc_scope_typ(prR.alloc_scope_typ());
							}
							else {
								allocR.alloc_scope_typ(null);
							}
						}
					}
				}
			}
			_updAllocStsL.addAll(allocL);
		}
		_updAllocStsLKey = _updAllocStsL.createIndex(_$peg);

		setShipAllocStsNo(prL);
		groupByShipAllocSts(prL);
	}
	/**
	 * 使用済みの出荷引当状況NOを管理
	 */
	protected java.util.Set<String> _usedAllocNo = new java.util.HashSet<>();
	/**
	 * 出荷引当状況NOを設定する
	 */
	protected void setShipAllocStsNo(MCList<ShipPr_DtlR> prL) {
		MCList<MST_SHIP_ALLOC_STS_R> stsL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
		for (MCList<ShipPr_DtlR> lst : prL.groupList(_$peg)) {
			ShipPr_DtlR prR = lst.get(0);
			if (prR.is_src_ship_inst_flg()) {
				stsL.addAll(_updAllocStsL.subList(_updAllocStsLKey, prR.toArray(_$peg)));
			}
		}
		if (!stsL.isEmpty()) {
			setShipAllocStsNo(MST_SHIP_ALLOC_STS_R.$ship_inst_d_no, stsL);
			setShipAllocStsNo(MST_SHIP_ALLOC_STS_R.$ship_schd_no, stsL);
		}

		// 設定できなかった分を発番する
		stsL = _updAllocStsL.subList(r -> isNull(r.ship_alloc_sts_no()));
		if (!stsL.isEmpty()) {
			doSeqCache(MSC_NUM_SYS_TYP.SHIPALOCS, stsL.size());
			stsL.forEach(r -> r.ship_alloc_sts_no(getShipAllocStsNo()));
		}
	}
	protected void setShipAllocStsNo(String key, MCList<MST_SHIP_ALLOC_STS_R> updAllocStsL) {

		if ( !(isSame(key, MST_SHIP_ALLOC_STS_R.$ship_inst_d_no)
				|| isSame(key, MST_SHIP_ALLOC_STS_R.$ship_schd_no)) ) {
			return;
		}
		// 出荷指図明細NO、もしくは出荷予定NO内でなるべく同じNOが設定されるように以下の順に並び替える
		MCSortPolicy sp = new MCSortPolicy();
		sp.add(SortType.ASC, MST_SHIP_ALLOC_STS_R.$ship_loc_cd);
		sp.add(SortType.ASC, MST_SHIP_ALLOC_STS_R.$ship_str_ln_cd);
		sp.add(SortType.ASC, MST_SHIP_ALLOC_STS_R.$lot_no);
		sp.add(SortType.ASC, MST_SHIP_ALLOC_STS_R.$sublot_no);
		sp.add(SortType.ASC, MST_SHIP_ALLOC_STS_R.$ver_no);
		sp.add(SortType.ASC, MST_SHIP_ALLOC_STS_R.$sno1);
		sp.add(SortType.ASC, MST_SHIP_ALLOC_STS_R.$sno2);
		sp.add(SortType.ASC, MST_SHIP_ALLOC_STS_R.$sno3);
		sp.add(SortType.ASC, MST_SHIP_ALLOC_STS_R.$sno4);
		sp.add(SortType.ASC, MST_SHIP_ALLOC_STS_R.$ent_unit_cd);
		sp.add(SortType.ASC, MST_SHIP_ALLOC_STS_R.$pack_unit_cd);
		sp.add(SortType.ASC, MST_SHIP_ALLOC_STS_R.$base_unit_qty);

		for (MCList<MST_SHIP_ALLOC_STS_R> stsL : updAllocStsL.groupList(key)) {
			String keyNo = stsL.get(0).getString(key);
			if (isNull(keyNo)) {
				continue;
			}

			MCList<MST_SHIP_ALLOC_STS_R> newStsL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			for (MST_SHIP_ALLOC_STS_R r : stsL) {
				String no = r.ship_alloc_sts_no();

				if (!isNull(no)) {
					if (!_usedAllocNo.contains(no)) {
						_usedAllocNo.add(no);
					}
				}
				else {
					newStsL.add(r);	// 採番対象
				}
			}
			if (newStsL.isEmpty())	continue;

			MCList<MST_SHIP_ALLOC_STS_R> oldStsL = null;
			if (isSame(key, MST_SHIP_ALLOC_STS_R.$ship_inst_d_no)) {
				oldStsL = getAllocStsLByInst(keyNo);
			}
			else {
				oldStsL = getAllocStsL(keyNo);
			}
			if (!isNull(_notReuseL)) {
				// 再利用可能な出荷引当状況NOのみ再取得
				//（_notReuseLにあるNOは画面で行削除された明細のため再利用不可）
				oldStsL.setAll(
					oldStsL.subList(r ->
						isNull(_notReuseL.getFirst(
							ShipSchd_Upd02_RdelR.$ship_alloc_sts_no, r.ship_alloc_sts_no())))
				);
			}
			newStsL.sort(sp);
			oldStsL.sort(sp);

			for (int i=0, j=0; i<oldStsL.size(); i++) {
				String no = oldStsL.get(i).ship_alloc_sts_no();
				if (_usedAllocNo.contains(no)) {
					continue;
				}
				if (j < newStsL.size()) {
					newStsL.get(j++).ship_alloc_sts_no(no);
					_usedAllocNo.add(no);

					if (j >= newStsL.size()) {
						break;
					}
				}
			}
		}
	}

	/**
	 * 未引当の出荷引当状況をまとめる
	 */
	protected void groupByShipAllocSts(ShipPr_DtlR prR) {
		MCList<ShipPr_DtlR> prL = MCList.create(ShipPr_DtlR.class);
		prL.add(prR);
		groupByShipAllocSts(prL);
	}
	protected void groupByShipAllocSts(MCList<ShipPr_DtlR> prL) {
		MCList<MST_SHIP_ALLOC_STS_R> rmL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
		
		// 引当状況をまとめる単位
		String[] grpKey = {
	 		//_$peg[0], _$peg[1],
			MST_SHIP_ALLOC_STS_R.$ship_schd_no,
			MST_SHIP_ALLOC_STS_R.$ship_inst_no,
			MST_SHIP_ALLOC_STS_R.$ship_inst_d_no,
			MST_SHIP_ALLOC_STS_R.$dlv_slip_no,
			MST_SHIP_ALLOC_STS_R.$dlv_slip_d_no,
			MST_SHIP_ALLOC_STS_R.$ship_loc_cd,
			MST_SHIP_ALLOC_STS_R.$ship_str_ln_cd,
			MST_SHIP_ALLOC_STS_R.$stk_arrv_bp_cd,
			MST_SHIP_ALLOC_STS_R.$lot_no,
			MST_SHIP_ALLOC_STS_R.$sublot_no,
			MST_SHIP_ALLOC_STS_R.$ver_no,
			MST_SHIP_ALLOC_STS_R.$sno1,
			MST_SHIP_ALLOC_STS_R.$sno2,
			MST_SHIP_ALLOC_STS_R.$sno3,
			MST_SHIP_ALLOC_STS_R.$sno4,
			MST_SHIP_ALLOC_STS_R.$gd_cd,
			MST_SHIP_ALLOC_STS_R.$quality_typ,
			MST_SHIP_ALLOC_STS_R.$stk_insp_typ,
			MST_SHIP_ALLOC_STS_R.$stk_id_typ,
			MST_SHIP_ALLOC_STS_R.$stk_bp_cd,
			MST_SHIP_ALLOC_STS_R.$pack_unit_cd,
			MST_SHIP_ALLOC_STS_R.$ent_unit_cd,
			MST_SHIP_ALLOC_STS_R.$alloc_scope_typ,
			MST_SHIP_ALLOC_STS_R.$alloc_flg,
			MST_SHIP_ALLOC_STS_R.$alloc_wait_flg,
			"ship_fr_lg_grp_cd"
		};

		for (ShipPr_DtlR prR : prL) {
			MCList<MST_SHIP_ALLOC_STS_R>
				allocL =_updAllocStsL
					.subList(_updAllocStsLKey, prR.toArray(_updAllocStsLKey.getKeys()))
					.subList(r -> nvl(r.ship_act_qty(), MCNumber.ZERO).isZero());	// 未出荷のみ抽出

			for (MCList<MST_SHIP_ALLOC_STS_R> grpL : allocL.groupList(grpKey)) { 
				// 同一の引当状況が複数件ある場合、出荷引当状況NOの古い引当状況にまとめる
				// 複数件でない場合でも出荷予定の単位に換算できる場合は換算する
				grpL.sort(MST_SHIP_ALLOC_STS_R.$ship_alloc_sts_no);
				MST_SHIP_ALLOC_STS_R grpR = null;
				for (MST_SHIP_ALLOC_STS_R r : grpL) {
					if (isNull(grpR)) {
						grpR = r;
					}
					else {
						grpR.pack_unit_qty(grpR.pack_unit_qty().add(r.pack_unit_qty()));
						grpR.base_unit_qty(grpR.base_unit_qty().add(r.base_unit_qty()));
						// 送信対象が含まれている場合は送信対象とする
						grpR.wms_flg(grpR.wms_flg() || r.wms_flg());
						rmL.add(r);
					}
				}
				// 取引単位
				if (!isSame(prR.sp().trd_unit_cd(), prR.ss().trd_unit_cd())) {
					grpR.trd_unit_qty(grpR.pack_unit_qty());
					grpR.trd_unit_cd(grpR.pack_unit_cd());
				}
				else {
					grpR.trd_unit_cd(prR.trd_unit_cd());
					grpR.trd_unit_qty(
						cnvBaseToTrdUnitQty(prR, grpR.base_unit_qty(), prR.trd_unit_cd()));
					if (isNull(grpR.trd_unit_qty())) {
						grpR.trd_unit_qty(grpR.pack_unit_qty());
						grpR.trd_unit_cd(grpR.pack_unit_cd());
					}
				}
				// 入力単位
				grpR.ent_unit_qty(
					cnvBaseToTrdUnitQty(prR, grpR.base_unit_qty(), grpR.ent_unit_cd()));
				if (isNull(grpR.ent_unit_qty())) {
					grpR.ent_unit_qty(grpR.pack_unit_qty());
					grpR.ent_unit_cd(grpR.pack_unit_cd());
				}
			}
		}
		if (!rmL.isEmpty()) {
			_updAllocStsL.removeAll(rmL);
			_updAllocStsLKey = _updAllocStsL.createIndex(_$peg);
		}
	}

	/**
	 * 引当結果から出荷引当状況リストを作成するマッパー<br>
	 * 引当結果がある場合に使用する
	 */
	protected Map_MST_SHIP_ALLOC_STS_R_Alloc_RsltR
			<MST_SHIP_ALLOC_STS_R,Alloc_RsltR,ShipPr_DtlR> createMap_MST_SHIP_ALLOC_STS_R_Alloc_RsltR() {
		return new Map_MST_SHIP_ALLOC_STS_R_Alloc_RsltR<MST_SHIP_ALLOC_STS_R, Alloc_RsltR, ShipPr_DtlR>();
	}
	public class Map_MST_SHIP_ALLOC_STS_R_Alloc_RsltR
			<D extends MST_SHIP_ALLOC_STS_R, S extends Alloc_RsltR, W extends ShipPr_DtlR> extends MAUCC_RowMapperWith<D,S,W>{
		protected ShipPr_DtlR _prR = null;
		protected MCList<Alloc_Avl_Sprt01_CndR> _allocAvlSprt01L = null;
		protected MCIndexKey _allocAvlSprtKey = null;
		@Override
		public void setWith(W prR) {
			_prR = prR;
		}
		public void setWith(MCList<Alloc_Avl_Sprt01_CndR> _allocAvlSprt01L) {
			this._allocAvlSprt01L = _allocAvlSprt01L;
			_allocAvlSprtKey = _allocAvlSprt01L.createIndex(Alloc_Avl_Sprt01_CndR.$peg_no);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			if (_prR.ss().inst_bndl_flg()) {
				dest.ship_schd_no(null);
			}
			else {
				dest.ship_schd_no(_prR.ship_schd_no());
			}
			dest.ship_inst_d_no(_prR.ship_inst_d_no());
			if (!isNull(_prR.ship_inst_d_no())) {
				MST_SHIP_INST_D_R instDR = getShipInstDR(_prR.ship_inst_d_no());
				if (!isNull(instDR)) {
					dest.ship_inst_no(instDR.ship_inst_no());
				}
			}
			dest.dlv_slip_no(null);
			dest.dlv_slip_d_no(null);
			if (!isNull(src.stk_loc_cd())) {
				dest.ship_loc_cd(src.stk_loc_cd());
				dest.ship_str_ln_cd(nvl(src.stk_str_ln_cd(), MAC_STR.NULL_VAL.value()));
			}
			else {
				dest.ship_loc_cd(null);
				dest.ship_str_ln_cd(null);
				if (MAC_SHIP_INST_TYP.isNO_PICK(_prR.ship_inst_typ())) {
					if (_prR.is_src_ship_inst_flg() && !isNull(_prR.ship_fr_lg_grp_cd())) {
						MAM_LG_GRP_R lgGrpR = getLgGrpR(_prR.ship_fr_lg_grp_cd());
						MAM_ITM_LG_GRP_R itmLgGrpR = itmLgGrpCache().get(_prR.itm_cd(), _prR.itm_sub1(), _prR.itm_sub2(), _prR.itm_sub3(), _prR.ship_fr_lg_grp_cd());
						if (!itmLgGrpR.isEmpty()) {
							lgGrpR = setLgGrpR(itmLgGrpR);
						}
						dest.ship_loc_cd(lgGrpR.getString("loc_cd"));
						dest.ship_str_ln_cd(isNull(dest.ship_loc_cd()) ? null : MAC_STR.NULL_VAL.value());
					}
				}
			}
			if (MAC_LOT_MNG_TYP.isNOT_MNG(getItmR(_prR).lot_mng_typ())) {
				dest.lot_no(MAC_STR.NULL_VAL.value());
			}
			else {
				dest.lot_no(src.lot_no());
			}
			if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(getItmR(_prR).sublot_mng_typ())) {
				dest.sublot_no(MAC_STR.NULL_VAL.value());
			}
			else {
				dest.sublot_no(src.sublot_no());
			}
			dest.ver_no(src.ver_no());
			dest.sno1(nvl(src.sno1(), MAC_STR.NULL_VAL.value()));
			dest.sno1_null_flg(_prR.sno1_null_flg());
			dest.sno2(nvl(src.sno2(), MAC_STR.NULL_VAL.value()));
			dest.sno2_null_flg(_prR.sno2_null_flg());
			dest.sno3(nvl(src.sno3(), MAC_STR.NULL_VAL.value()));
			dest.sno3_null_flg(_prR.sno3_null_flg());
			dest.sno4(nvl(src.sno4(), MAC_STR.NULL_VAL.value()));
			dest.sno4_null_flg(_prR.sno4_null_flg());
			dest.gd_cd(src.gd_cd());
			dest.quality_typ(src.quality_typ());
			dest.stk_insp_typ(src.stk_insp_typ());
			dest.stk_id_typ(src.stk_id_typ());
			dest.stk_arrv_bp_cd(nvl(src.stk_arrv_bp_cd(), MAC_STR.NULL_VAL.value()));
			dest.stk_bp_cd(nvl(src.stk_bp_cd(), MAC_STR.NULL_VAL.value()));

			// 取引単位、入力単位はgroupByShipAllocStsで設定する
			if (isNull(src.pack_unit_qty()) || isNull(src.pack_unit_cd())) {
				MAM_ITM_R itmR = getItmR(_prR);
				MAVM_ITM_UNIT_R unitR = getItmUnitR(_prR, _prR.ss().trd_unit_cd());
				MCNumber qty = cnvBaseToTrdUnitQty(_prR, src.base_unit_qty(), _prR.ss().trd_unit_cd());
				if (itmR.pack_alloc_flg() && unitR.pack_flg() && !isNull(qty)) {
					dest.pack_unit_qty(qty);
					dest.pack_unit_cd(_prR.ss().trd_unit_cd());
				}
				else {
					dest.pack_unit_qty(src.base_unit_qty());
					dest.pack_unit_cd(src.base_unit_cd());
				}
			}
			else {
				dest.pack_unit_qty(src.pack_unit_qty());
				dest.pack_unit_cd(src.pack_unit_cd());
			}
			dest.base_unit_qty(src.base_unit_qty());
			dest.base_unit_cd(src.base_unit_cd());
			dest.ent_unit_cd(nvl(src.ent_unit_cd(), _prR.ss().trd_unit_cd()));

			dest.ship_act_qty(0);
			dest.alloc_flg(src.alloc_flg());
			dest.alloc_wait_flg(isAllocWait(_prR, src, _allocAvlSprt01L, _allocAvlSprtKey));
			if (dest.alloc_flg() || dest.alloc_wait_flg()) {
				dest.alloc_scope_typ(nvl(src.alloc_scope_typ(), _prR.alloc_scope_typ()));
			}
			dest.not_lot_mix_flg(_prR.not_lot_mix_flg());
			dest.not_sublot_mix_flg(_prR.not_sublot_mix_flg());
			dest.vld_dt_fr(src.vld_dt_fr());
			dest.vld_dt_to(src.vld_dt_to());
			if (!isNull(_prR.sp().io_schd_pr_no())) {
				dest.io_schd_pr_no(_prR.sp().io_schd_pr_no());
			}
			else {
				dest.io_schd_pr_no(getIoSchdPrNo());
			}
			dest.sub_char1(null);
			dest.sub_char2(null);
			dest.sub_char3(null);
			dest.setNumberNE(_$peg[0], src.peg_no());
			dest.setNumberNE(_$peg[1], src.peg_seq());
			dest.setStringNE("ship_fr_lg_grp_cd",
				nvl(src.stk_lg_grp_cd(), getLocR(dest.ship_loc_cd()).lg_grp_cd()));
			dest.wms_flg(src.wms_flg());
			
			// 一時的に上り電文の順番を設定（後で再発番する）
			dest.disp_seq(src.seq());
		}
	}

	/**
	 * 上り電文から出荷引当状況リストを作成するマッパー<br>
	 * 引当結果がない場合に使用する
	 */
	protected Map_MST_SHIP_ALLOC_STS_R_ShipPr_DtlR
			<MST_SHIP_ALLOC_STS_R, ShipPr_DtlR> createMap_MST_SHIP_ALLOC_STS_R_ShipPr_DtlR() {
		return new Map_MST_SHIP_ALLOC_STS_R_ShipPr_DtlR<MST_SHIP_ALLOC_STS_R, ShipPr_DtlR>();
	}
	public class Map_MST_SHIP_ALLOC_STS_R_ShipPr_DtlR
			<D extends MST_SHIP_ALLOC_STS_R, S extends ShipPr_DtlR> extends MCRowMapper<D,S>{
				
		protected MCList<Alloc_Avl_Sprt01_CndR> _allocAvlSprt01L = null;
		protected MCIndexKey _allocAvlSprtKey = null;
		public void setWith(MCList<Alloc_Avl_Sprt01_CndR> _allocAvlSprt01L) {
			this._allocAvlSprt01L = _allocAvlSprt01L;
			_allocAvlSprtKey = _allocAvlSprt01L.createIndex(Alloc_Avl_Sprt01_CndR.$peg_no);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			
			if (src.purc_ddlv_flg() && MAC_DATA_CRUD_TYP.isUPD(src.data_crud_typ())) {
				String shipAllocStsNo = getPurcDdlvShipAllocStsNo(src.ship_schd_no());
				
				if (isNull(shipAllocStsNo)) {
					dest.ship_alloc_sts_no(getShipAllocStsNo());
				}
				else {
					dest.ship_alloc_sts_no(shipAllocStsNo);
				}
			}
			
			if (src.ss().inst_bndl_flg()) {
				dest.ship_schd_no(null);
			}
			else {
				dest.ship_schd_no(src.ship_schd_no());
			}
			dest.ship_inst_d_no(src.ship_inst_d_no());
			if (!isNull(src.ship_inst_d_no())) {
				MST_SHIP_INST_D_R instDR = getShipInstDR(src.ship_inst_d_no());
				if (!isNull(instDR)) {
					dest.ship_inst_no(instDR.ship_inst_no());
				}
			}
			dest.dlv_slip_no(null);
			dest.dlv_slip_d_no(null);
			if (MAC_SHIP_INST_TYP.isNO_PICK(src.ship_inst_typ()) || isNull(src.loc_cd())) {
				dest.ship_loc_cd(null);
				dest.ship_str_ln_cd(null);
			}
			else {
				dest.ship_loc_cd(src.sp().loc_cd());
				dest.ship_str_ln_cd(nvl(src.sp().str_ln_cd(), MAC_STR.NULL_VAL.value()));
			}
			dest.lot_no(src.lot_no());
			dest.sublot_no(src.sublot_no());
			dest.stk_arrv_bp_cd(nvl(src.stk_arrv_bp_cd(), MAC_STR.NULL_VAL.value()));
			dest.ver_no(src.ver_no());
			dest.sno1(nvl(src.sno1(), MAC_STR.NULL_VAL.value()));
			dest.sno1_null_flg(src.sno1_null_flg());
			dest.sno2(nvl(src.sno2(), MAC_STR.NULL_VAL.value()));
			dest.sno2_null_flg(src.sno2_null_flg());
			dest.sno3(nvl(src.sno3(), MAC_STR.NULL_VAL.value()));
			dest.sno3_null_flg(src.sno3_null_flg());
			dest.sno4(nvl(src.sno4(), MAC_STR.NULL_VAL.value()));
			dest.sno4_null_flg(src.sno4_null_flg());
			dest.gd_cd(src.gd_cd());
			dest.quality_typ(src.quality_typ());
			dest.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
			dest.stk_id_typ(src.stk_id_typ());
			dest.stk_bp_cd(nvl(src.stk_bp_cd(), MAC_STR.NULL_VAL.value()));

			// 取引単位、入力単位はgroupByShipAllocStsで設定する
			MAM_ITM_R itmR = getItmR(src);
			MAVM_ITM_UNIT_R unitR = getItmUnitR(src, src.ss().trd_unit_cd());
			MCNumber qty = cnvBaseToTrdUnitQty(src, src.ss().base_unit_qty(), src.ss().trd_unit_cd());
			if (itmR.pack_alloc_flg() && unitR.pack_flg() && !isNull(qty)) {
				dest.pack_unit_qty(qty);
				dest.pack_unit_cd(src.ss().trd_unit_cd());
			}
			else {
				dest.pack_unit_qty(src.ss().base_unit_qty());
				dest.pack_unit_cd(src.ss().base_unit_cd());
			}
			dest.base_unit_qty(src.ss().base_unit_qty());
			dest.base_unit_cd(src.ss().base_unit_cd());
			dest.ent_unit_cd(src.ss().trd_unit_cd());

			dest.ship_act_qty(0);
			dest.alloc_flg(false);
			// 引当実行する、しかし引当できなかったので「引当保留」とする
			dest.alloc_wait_flg(isAllocWait(src, null, _allocAvlSprt01L, _allocAvlSprtKey));
			if (dest.alloc_flg() || dest.alloc_wait_flg()) { 
				dest.alloc_scope_typ(src.alloc_scope_typ());
			}
			dest.not_lot_mix_flg(src.not_lot_mix_flg());
			dest.not_sublot_mix_flg(src.not_sublot_mix_flg());
			dest.vld_dt_fr(src.vld_dt_fr());
			dest.vld_dt_to(src.vld_dt_to());
			if (!isNull(src.sp().io_schd_pr_no())) {
				dest.io_schd_pr_no(src.sp().io_schd_pr_no());
			}
			else {
				dest.io_schd_pr_no(getIoSchdPrNo());
			}
			dest.sub_char1(null);
			dest.sub_char2(null);
			dest.sub_char3(null);
			dest.setNumberNE(_$peg[0], src.peg_no());
			dest.setNumberNE(_$peg[1], src.peg_seq());
			dest.setStringNE("ship_fr_lg_grp_cd", src.ship_fr_lg_grp_cd());
			dest.wms_flg(src.wms_flg());
		}
	}

	/**
	 * 引当保留とするか
	 */
	protected boolean isAllocWait(ShipPr_DtlR prR, Alloc_RsltR allocR,
			MCList<Alloc_Avl_Sprt01_CndR> allocAvlSprt01L, MCIndexKey allocAvlSprtKey) {
		// ピッキングなしは引当しないので保留にしない
		if (MAC_SHIP_INST_TYP.isNO_PICK(prR.ship_inst_typ())) {
			return false;
		}
		// 即引当または後引当、かつ未引当の場合は保留とする
		if ((MAC_ALLOC_TYP.isIMMED(prR.alloc_typ())
				|| MAC_ALLOC_TYP.isLATER(prR.alloc_typ())) 
			&& (isNull(allocR) || !allocR.alloc_flg())) {
			
			// 引当可能日数を超過している場合は保留にしない
			Alloc_Avl_Sprt01_CndR cndR = allocAvlSprt01L.getFirst(allocAvlSprtKey, prR.peg_no());
			if (!isNull(cndR) && cndR.exceed_alloc_days_flg()) {
				return false;
			}
			else {
				return true;
			}
		}
		else {
			return false;
		}
	}

	/**
	 * 出荷予定を分割する
	 */
	protected void splitShipSchd(MCList<ShipPr_DtlR> prL, MCList<Alloc_Avl_Sprt01_CndR> allocAvlSprt01L, MCIndexKey allocAvlSprtKey) {
		splitShipSchdByFix(prL);
		splitShipSchdByLgGrp(prL, allocAvlSprt01L, allocAvlSprtKey);
		splitShipSchdByAuto(prL);
	}

	/**
	 * 確定フラグによる分割対象か
	 */
	protected boolean isSplitByFix(ShipPr_DtlR prR) {
		if (MAC_DATA_CRUD_TYP.isUPD(prR.data_crud_typ())
			&& !prR.upd02_flg()) {	// Upd01から更新
			MCList<MST_SHIP_SCHD_R> schdL = getShipSchdL(prR.ship_pr_no());
			if (!isNull(schdL.getFirst(MST_SHIP_SCHD_R.$fix_flg, true))) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 確定フラグによる分割
	 */
	protected void splitShipSchdByFix(MCList<ShipPr_DtlR> prL) {
		MCList<ShipPr_DtlR> orgL = MCList.create(ShipPr_DtlR.class);
		orgL.setAll(prL);

		for (ShipPr_DtlR r : orgL) {
			if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())
				|| isAbort(r)
				|| isAbortRel(r)
				|| r.ship_judge_flg()
				|| r.is_src_ship_inst_flg()) {
				continue;
			}
			MCList<MST_SHIP_ALLOC_STS_R>
				sasL = _updAllocStsL.subList(_updAllocStsLKey, r.toArray(_updAllocStsLKey.getKeys())); 
			splitShipSchdByFix(r, sasL, prL);
		}
	}
	protected void splitShipSchdByFix(
		ShipPr_DtlR prR, MCList<MST_SHIP_ALLOC_STS_R> sasL, MCList<ShipPr_DtlR> prL) {

		if (!isSplitByFix(prR)) {
			return;
		}
		MCNumber seq = (MCNumber)prL.subList(_$peg[0], prR.peg_no()).max(_$peg[1]);
		int pegSeq = seq.intValue();

		MCList<MST_SHIP_SCHD_R> schdL = getShipSchdL(prR.ship_pr_no());

		// 確定済みの出荷予定から値を引き継ぐ
		java.util.function.BiConsumer<MST_SHIP_SCHD_R, MST_SHIP_SCHD_R> fixValCpy = (dest, src) -> {
			setFixValCpy(dest, src);
		};

		for (MST_SHIP_SCHD_R schdR : schdL) {
			if (!schdR.fix_flg()) {
				continue;
			}
			MCNumber qty = prR.ss().base_unit_qty().subtract(schdR.base_unit_qty());
			if (qty.isPositive()) {
				// 確定フラグによる出荷予定の分割（確定済みの出荷予定はNOを引き継ぐ）
				ShipPr_DtlR splitR = prR.clone();
				fixValCpy.accept(splitR.ss(), schdR);
				splitR.peg_seq(++pegSeq);
				prL.add(splitR);
				prR.ss().trd_unit_qty(prR.ss().trd_unit_qty().subtract(schdR.trd_unit_qty()));
				prR.ss().base_unit_qty(prR.ss().base_unit_qty().subtract(schdR.base_unit_qty()));

				// 出荷引当状況の分割
				splitShipSchdByFix(splitR, sasL);
			}
			else {
				fixValCpy.accept(prR.ss(), schdR);
			}
		}
	}

	/**
	 * 確定済みの出荷予定から引き継ぐ値を設定する
	 * @param dest コピー先
	 * @param src コピー元
	 */
	protected void setFixValCpy(MST_SHIP_SCHD_R dest, MST_SHIP_SCHD_R src) {
		dest.ship_schd_no(src.ship_schd_no());
		dest.dlv_inst_rcpt_no(src.dlv_inst_rcpt_no());
		dest.slo_prms_no(src.slo_prms_no());
		dest.sls_act_d_no(src.sls_act_d_no());
		dest.fix_flg(src.fix_flg());
		dest.trd_unit_qty(src.trd_unit_qty());
		dest.base_unit_qty(src.base_unit_qty());
		dest.dlv_cd(src.dlv_cd());
		dest.dlv_sundry_flg(src.dlv_sundry_flg());
		dest.dlv_nm(src.dlv_nm());
		dest.dlv_cntct_dpt(src.dlv_cntct_dpt());
		dest.dlv_cntct_psn(src.dlv_cntct_psn());
		dest.dlv_zip_cd(src.dlv_zip_cd());
		dest.dlv_addr1(src.dlv_addr1());
		dest.dlv_addr2(src.dlv_addr2());
		dest.dlv_addr3(src.dlv_addr3());
		dest.dlv_addr4(src.dlv_addr4());
		dest.dlv_tel(src.dlv_tel());
		dest.dlv_fax(src.dlv_fax());
		dest.dlv_lg_grp_cd(src.dlv_lg_grp_cd());
		dest.pri_prnt_flg(src.pri_prnt_flg());
		dest.tdlv_cd(src.tdlv_cd());
		dest.tdlv_sundry_flg(src.tdlv_sundry_flg());
		dest.tdlv_nm(src.tdlv_nm());
		dest.via_dlv_typ(src.via_dlv_typ());
		dest.tdlv_cntct_dpt(src.tdlv_cntct_dpt());
		dest.tdlv_cntct_psn(src.tdlv_cntct_psn());
		dest.tdlv_zip_cd(src.tdlv_zip_cd());
		dest.tdlv_addr1(src.tdlv_addr1());
		dest.tdlv_addr2(src.tdlv_addr2());
		dest.tdlv_addr3(src.tdlv_addr3());
		dest.tdlv_addr4(src.tdlv_addr4());
		dest.tdlv_tel(src.tdlv_tel());
		dest.tdlv_fax(src.tdlv_fax());
		dest.tdlv_lg_grp_cd(src.tdlv_lg_grp_cd());
		dest.dlv_day_week_typ(src.dlv_day_week_typ());
		dest.ship_fr_lg_grp_cd(src.ship_fr_lg_grp_cd());
		dest.pd_inst_dlv_tm(src.pd_inst_dlv_tm());
		dest.ship_rqst_tm(src.ship_rqst_tm());
		dest.not_dt_calc_flg(src.not_dt_calc_flg());
		dest.ship_block_flg(src.ship_block_flg());
		dest.not_lot_mix_flg(src.not_lot_mix_flg());
		dest.not_sublot_mix_flg(src.not_sublot_mix_flg());
		dest.vld_dt_fr(src.vld_dt_fr());
		dest.vld_dt_to(src.vld_dt_to());
		dest.ship_schd_tm(src.ship_schd_tm());
		dest.dlv_schd_tm(src.dlv_schd_tm());
		dest.ship_term_cd(src.ship_term_cd());
		dest.ship_wk_cd(src.ship_wk_cd());
	}

	/**
	 * 確定フラグによる分割（出荷引当状況を分割）
	 */
	protected void splitShipSchdByFix(
		ShipPr_DtlR prR, MCList<MST_SHIP_ALLOC_STS_R> sasL) {

		// 引当済から割り当てる
		sasL.sort(MCList.SortType.DESC, MST_SHIP_ALLOC_STS_R.$alloc_flg);

		// 確定分の数量
		MCNumber trdQty = prR.ss().trd_unit_qty(), baseQty = prR.ss().base_unit_qty();
		for (MST_SHIP_ALLOC_STS_R r : sasL) {
			if (r.getNumber(_$peg[1]).gt(1)) {
				// 確定済みの出荷予定に割当済みなので対象から外す
				continue;
			}
			if (r.trd_unit_qty().gt(trdQty)) {
				// 確定分を分割
				MST_SHIP_ALLOC_STS_R splitR = r.clone();
				splitR.ship_alloc_sts_no(getShipAllocStsNo());
				splitR.setNumberNE(_$peg[1], prR.peg_seq());
				splitR.trd_unit_qty(trdQty);
				splitR.base_unit_qty(baseQty);
				MAM_ITM_R itmR = getItmR(prR);
				MAVM_ITM_UNIT_R unitR = getItmUnitR(prR, prR.ss().trd_unit_cd());
				MCNumber qty = cnvBaseToTrdUnitQty(prR, baseQty, prR.ss().trd_unit_cd());
				if (itmR.pack_alloc_flg() && unitR.pack_flg() && !isNull(qty)) {
					splitR.pack_unit_qty(qty);
					splitR.pack_unit_cd(prR.ss().trd_unit_cd());
				}
				else {
					splitR.pack_unit_qty(baseQty);
					splitR.pack_unit_cd(prR.ss().base_unit_cd());
				}
				splitR.ent_unit_qty(
					cnvBaseToTrdUnitQty(prR, splitR.base_unit_qty(), splitR.ent_unit_cd()));
				if (isNull(splitR.ent_unit_qty())) {
					splitR.ent_unit_qty(splitR.pack_unit_qty());
					splitR.ent_unit_cd(splitR.pack_unit_cd());
				}
				for (int i=0; i<_updAllocStsL.size(); i++) {
					if (isSame(_updAllocStsL.get(i).ship_alloc_sts_no(), r.ship_alloc_sts_no())) {
						_updAllocStsL.add(i+1, splitR);	// 分割分を今の位置＋１に追加
						break;
					}
				}
				r.trd_unit_qty(r.trd_unit_qty().subtract(trdQty));
				r.base_unit_qty(r.base_unit_qty().subtract(baseQty));
				r.pack_unit_qty(r.pack_unit_qty().subtract(splitR.pack_unit_qty()));
				r.ent_unit_qty(r.ent_unit_qty().subtract(splitR.ent_unit_qty()));
				break;
			}
			else {
				// 予定分割後のpeg_seqを付与
				r.setNumberNE(_$peg[1], prR.peg_seq());
				// 確定分の数量の残を減算
				trdQty = trdQty.subtract(r.trd_unit_qty());
				baseQty = baseQty.subtract(r.base_unit_qty());
				if (!trdQty.isPositive()) {
					break;
				}
			}
		}
		// 分割によってpeg_seqが変わるのでインデックスを再作成する
		_updAllocStsLKey = _updAllocStsL.createIndex(_$peg);
	}

	/**
	 * 出荷予定分割区分による分割対象か
	 */
	protected boolean isSplitByAuto(ShipPr_DtlR prR, MCList<MST_SHIP_ALLOC_STS_R> sasL) {
		if (!prR.ss().fix_flg()
			&& nvl(prR.ss().iv_schd_qty(), MCNumber.ZERO).isZero()
			&& prR.ship_schd_split_flg()
			&& MAC_SHIP_SCHD_SPLIT_TYP.isAUTO_SPLIT(prR.ship_schd_split_typ())) {

			MCList<MST_SHIP_ALLOC_STS_R> unitL =  sasL.groupBy(MST_SHIP_ALLOC_STS_R.$trd_unit_cd);
			if (unitL.size() == 1 && isSame(unitL.get(0).trd_unit_cd(), prR.trd_unit_cd())) {
				// 「分割する」、取引単位が出荷予定と同じ、かつ「未引当」「引当済」が混在する場合は分割する
				return sasL.groupBy(MST_SHIP_ALLOC_STS_R.$alloc_flg).size() > 1;
			}
		}
		return false;
	}

	/**
	 * 出荷予定分割区分による分割
	 */
	protected void splitShipSchdByAuto(MCList<ShipPr_DtlR> prL) {
		MCList<ShipPr_DtlR> orgL = MCList.create(ShipPr_DtlR.class);
		orgL.setAll(prL);

		for (ShipPr_DtlR r : orgL) {
			if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())
				|| isAbort(r)
				|| isAbortRel(r)
				|| r.ship_judge_flg()
				|| r.is_src_ship_inst_flg()) {
				continue;
			}
			MCList<MST_SHIP_ALLOC_STS_R>
				sasL = _updAllocStsL.subList(_updAllocStsLKey, r.toArray(_updAllocStsLKey.getKeys())); 
			splitShipSchdByAuto(r, sasL, prL);
		}
	}
	protected void splitShipSchdByAuto(
		ShipPr_DtlR prR, MCList<MST_SHIP_ALLOC_STS_R> sasL, MCList<ShipPr_DtlR> prL) {

		if (!isSplitByAuto(prR, sasL)) {
			return;
		}
		MCNumber seq = (MCNumber)prL.subList(_$peg[0], prR.peg_no()).max(_$peg[1]);

		prR.ss().trd_unit_qty(0);
		prR.ss().base_unit_qty(0);
		ShipPr_DtlR allocR = prR, notAllocR = prR.clone();
		notAllocR.ship_schd_no(getShipSchdNo());
		notAllocR.peg_seq(seq.add(1));
		notAllocR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
		// 引当済 or 未引当で分割
		for (MST_SHIP_ALLOC_STS_R r : sasL) {
			if (r.alloc_flg()) {
				allocR.ss().trd_unit_qty(allocR.ss().trd_unit_qty().add(r.trd_unit_qty()));
				allocR.ss().base_unit_qty(allocR.ss().base_unit_qty().add(r.base_unit_qty()));
			}
			else {
				notAllocR.ss().trd_unit_qty(notAllocR.ss().trd_unit_qty().add(r.trd_unit_qty()));
				notAllocR.ss().base_unit_qty(notAllocR.ss().base_unit_qty().add(r.base_unit_qty()));
				r.setNumberNE(_$peg[1], notAllocR.peg_seq());
			}
		}
		prL.add(notAllocR);
		// 分割によってpeg_seqが変わるのでインデックスを再作成する
		_updAllocStsLKey = _updAllocStsL.createIndex(_$peg);
	}

	/**
	 * 出荷元の物流Ｇ違いによる分割対象か
	 * @param prR
	 * @return
	 */
	protected boolean isSplitByLgGrp(ShipPr_DtlR prR, MCList<MST_SHIP_ALLOC_STS_R> sasL) {
		MCList<MST_SHIP_ALLOC_STS_R> unitL =  sasL.groupBy(MST_SHIP_ALLOC_STS_R.$trd_unit_cd);
		if (unitL.size() == 1 && isSame(unitL.get(0).trd_unit_cd(), prR.trd_unit_cd())) {
			return
				!MAC_SHIP_INST_TYP.isNO_PICK(prR.ship_inst_typ())
				&& !isNull(prR.alloc_grp_cd())
				&& isNull(prR.ship_lg_grp_cd())
				&& isNull(prR.loc_cd())
				&& sasL.groupBy("ship_fr_lg_grp_cd").size() > 1;
		}
		return false;
	}

	/**
	 * 出荷元の物流Ｇ違いによる分割
	 */
	protected void splitShipSchdByLgGrp(MCList<ShipPr_DtlR> prL, MCList<Alloc_Avl_Sprt01_CndR> allocAvlSprt01L, MCIndexKey allocAvlSprtKey) {
		MCList<ShipPr_DtlR> orgL = MCList.create(ShipPr_DtlR.class);
		orgL.setAll(prL);

		for (ShipPr_DtlR r : orgL) {
			if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())
				|| isAbort(r)
				|| isAbortRel(r)
				|| r.ship_judge_flg()
				|| r.is_src_ship_inst_flg()) {
				continue;
			}
			MCList<MST_SHIP_ALLOC_STS_R>
				sasL = _updAllocStsL.subList(_updAllocStsLKey, r.toArray(_updAllocStsLKey.getKeys())); 
			splitShipSchdByLgGrp(r, sasL, prL, allocAvlSprt01L, allocAvlSprtKey);
		}
	}
	protected void splitShipSchdByLgGrp(ShipPr_DtlR prR, MCList<MST_SHIP_ALLOC_STS_R> sasL, MCList<ShipPr_DtlR> prL,
			MCList<Alloc_Avl_Sprt01_CndR> allocAvlSprt01L, MCIndexKey allocAvlSprtKey) {

		// リストに対して操作するので、リストに一時カラムを追加
		sasL.addStringColumn("ship_fr_lg_grp_cd");

		if (!isSplitByLgGrp(prR, sasL)) {
			return;
		}
		// 品揃えの指定あり
		MST_SLO_D_R sloDR = getSloDR(prR.slo_d_no());
		if (!isNull(sloDR)
			&& MSC_SHIP_ASSORT_TYP.isAST(sloDR.getStringNE("assort_typ"))
			|| !isNull(sloDR.getStringNE("set_itm_grp_no"))) {
			// 品揃えが指定されている場合は分割不可（出荷予定が持つ出荷物流Ｇにまとめる）
			MCMessagePool.add(new MCMessage(prR, null, MSBEL0092, toDispGUIIndex(prR)));

			// 出荷予定が持つ物流Ｇに対する引当結果は破棄する
			MCList<MST_SHIP_ALLOC_STS_R> rmL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			for (MCList<MST_SHIP_ALLOC_STS_R> grpL : sasL.groupList("ship_fr_lg_grp_cd")) {
				if (!isSame(grpL.get(0).getString("ship_fr_lg_grp_cd"), prR.ss().ship_fr_lg_grp_cd())) {
					rmL.addAll(grpL);
					continue;
				}
			}
			_updAllocStsL.removeAll(rmL);

			// 破棄した分を未引当で再作成
			ShipPr_DtlR r = prR.clone();
			r.ss().base_unit_qty(rmL.sum(MST_SHIP_ALLOC_STS_R.$base_unit_qty));
			Map_MST_SHIP_ALLOC_STS_R_ShipPr_DtlR
				<MST_SHIP_ALLOC_STS_R, ShipPr_DtlR> zMpr = createMap_MST_SHIP_ALLOC_STS_R_ShipPr_DtlR();
			zMpr.setWith(allocAvlSprt01L);
			copy(_updAllocStsL.add(), r, zMpr);

			// 未引当の出荷引当状況をまとめる
			_updAllocStsLKey = _updAllocStsL.createIndex(_$peg);
			MCList<ShipPr_DtlR> lst = MCList.create(ShipPr_DtlR.class);
			lst.add(prR);
			setShipAllocStsNo(lst);
			groupByShipAllocSts(prR);
		}
		// 品揃えの指定なし
		else {
			// 出荷物流Ｇで分割
			MCNumber seq = (MCNumber)prL.subList(_$peg[0], prR.peg_no()).max(_$peg[1]);
			int pegSeq = seq.intValue();

			// 引数の出荷予定を有効にするため、引当結果に物流Ｇが存在しない場合は上書きする
			MCIndexKey idx = sasL.createIndex("ship_fr_lg_grp_cd");
			if (isNull(sasL.getFirst(idx, prR.ss().ship_fr_lg_grp_cd()))) {
				prR.ss().ship_fr_lg_grp_cd(sasL.get(0).getString("ship_fr_lg_grp_cd"));
				prR.ss().wg_cd(getLgGrpR(sasL.get(0).getString("ship_fr_lg_grp_cd")).wg_cd());
				prR.dt_recalc_flg(true);
			}
			for (MST_SHIP_ALLOC_STS_R r : sasL) {
				if (isNull(r.getString("ship_fr_lg_grp_cd"))) {
					r.setString("ship_fr_lg_grp_cd", prR.ss().ship_fr_lg_grp_cd());
				}
			}

			for (MCList<MST_SHIP_ALLOC_STS_R> grpL : sasL.groupList("ship_fr_lg_grp_cd")) {
				MST_SHIP_ALLOC_STS_R grpR = grpL.get(0);
				if (isSame(grpR.getString("ship_fr_lg_grp_cd"), prR.ss().ship_fr_lg_grp_cd())) {
					continue;
				}
				// 出荷予定が持つ出荷元物流Ｇと異なる物流Ｇを分割する
				MCNumber
					trdQty = grpL.sum(MST_SHIP_ALLOC_STS_R.$trd_unit_qty),
					baseQty = grpL.sum(MST_SHIP_ALLOC_STS_R.$base_unit_qty);

				ShipPr_DtlR splitR = prR.clone();
				splitR.ss().ship_schd_no(getShipSchdNo());
				splitR.ss().trd_unit_qty(trdQty);
				splitR.ss().base_unit_qty(baseQty);
				splitR.ss().ship_fr_lg_grp_cd(grpR.getString("ship_fr_lg_grp_cd"));
				splitR.ss().wg_cd(getLgGrpR(grpR.getString("ship_fr_lg_grp_cd")).wg_cd());
				splitR.dt_recalc_flg(true);
				splitR.peg_seq(++pegSeq);
				splitR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				prL.add(splitR);

				grpL.setNumberNE(_$peg[1], splitR.peg_seq());

				prR.ss().trd_unit_qty(prR.ss().trd_unit_qty().subtract(trdQty));
				prR.ss().base_unit_qty(prR.ss().base_unit_qty().subtract(baseQty));
			}
			// 分割によってpeg_seqが変わるのでインデックスを再作成する
			_updAllocStsLKey = _updAllocStsL.createIndex(_$peg);
		}
	}

	/**
	 * 承認対象外 or 承認済みかを判定する
	 */
	protected boolean isAprv(ShipPr_DtlR prR) {

		if (!MSC_TRN_TYP.isSLS(prR.trd_ptn_typ())
			&& !MSC_TRN_TYP.isSHIP(prR.trd_ptn_typ())) {
			// 売上、出荷以外は常に出荷可能
			return true;
		}

		//	- 受注ヘッダ．承認対象FLG = '0' OR 受注ヘッダ．承認状況区分＝'最終承認済'
		MST_SLO_D_R sloDR = getSloDR(prR.slo_d_no());
		return
			!sloDR.getBooleanNE("aprv_flg")
			|| MAC_APRV_STS_TYP.isACPT(sloDR.getStringNE("aprv_sts_typ"));
	}

	/**
	 * 出荷可能かを判定する
	 */
	protected boolean isShipAble(ShipPr_DtlR prR) {

		if (!MSC_TRN_TYP.isSLS(prR.trd_ptn_typ())
			&& !MSC_TRN_TYP.isSHIP(prR.trd_ptn_typ())) {
			// 売上、出荷以外は常に出荷可能
			return true;
		}

		//	- 受注ヘッダ．受注区分＝'本受注'
		//	- 受注ヘッダ．前受金出荷制御区分＝'出荷可能'
		//		 OR 受注ヘッダ．前受金請求額  ≦ 受注ヘッダ．前受金入金額
		MST_SLO_D_R sloDR = getSloDR(prR.slo_d_no());
		return
			!isNull(sloDR) && MSC_SLO_TYP.isSLO(sloDR.getStringNE("slo_typ"))
			&& (MSC_ADV_SHIP_CTRL_TYP.isSHIP_ABL(sloDR.getStringNE("adv_ship_ctrl_typ"))
				|| sloDR.getNumberNE("adv_bill_amt").lte(sloDR.getNumberNE("adv_rcv_amt")));
	}

	/**
	 * 出荷判定を行う
	 */
	protected boolean shipJudge(ShipPr_DtlR prR) {
		// 以下の条件を満たす場合に出荷判定「OK」とみなす。
		//	- 受注ヘッダ．承認対象FLG = '0' OR 受注ヘッダ．承認状況区分＝'最終承認済'
		//	- 受注ヘッダ．受注区分＝'本受注'
		//	- 受注ヘッダ．前受金出荷制御区分＝'出荷可能'
		//		 OR 受注ヘッダ．前受金請求額  ≦ 受注ヘッダ．前受金入金額
		// - 出荷留めフラグ＝'オフ'
		// または、仕入直送
		return isAprv(prR) && isShipAble(prR) && !prR.ship_block_flg() || prR.purc_ddlv_flg();
	}

	/**
	 * 出荷ロットチェック対象か判定する
	 */
	protected boolean shipLotCheck(ShipPr_DtlR prR) {
		if (!MSC_TRN_TYP.isSLS(prR.trd_ptn_typ())
			&& !MSC_TRN_TYP.isSHIP(prR.trd_ptn_typ())) {
			// 売上、出荷以外は対象外
			return false;
		}
		return isShipAble(prR);
	}

	/**
	 * 打切かを判定する
	 */
	protected boolean isAbort(ShipPr_DtlR prR) {
		return prR.upd02_flg() ? prR.ss().abort_flg() : prR.sp().abort_flg();
	}

	/**
	 * 打切解除かを判定する
	 */
	protected boolean isAbortRel(ShipPr_DtlR prR) {
		if (prR.upd02_flg()) {
			MST_SHIP_SCHD_R r = getShipSchdR(prR.ship_schd_no());
			return !isNull(r) && r.abort_flg() && !prR.ss().abort_flg();
		}
		else {
			if (MAC_DATA_CRUD_TYP.isCRT(prR.data_crud_typ())) {
				return false;
			}
			MST_SHIP_PR_R r = getShipPrR(prR.ship_pr_no());
			return !isNull(r) && r.abort_flg() && !prR.sp().abort_flg();
		}
	}

	/**
	 * 指図済みの出荷予定か判定する
	 */
	protected boolean isInst(ShipPr_DtlR prR) {
		return !isNull(prR.ship_inst_d_no());
	}

	/**
	 * インボイス取引対象か判定する
	 */
	protected boolean isIvTrd(ShipPr_DtlR prR) {
		boolean iv_trd_flg = false;
		if (MAC_TRD_PTN_TYP.isSLS(prR.trd_ptn_typ())
			|| MAC_TRD_PTN_TYP.isSHIP(prR.trd_ptn_typ())) {
			iv_trd_flg = getBpR(prR.cst_cd()).cst_iv_flg();
		}
		else if (MAC_TRD_PTN_TYP.isPROV_RTN(prR.trd_ptn_typ())) {
			iv_trd_flg = false;
		}
		else {
			MAM_LG_CTL_R ctlR = getLgCtlR(
				prR.ship_fr_lg_grp_cd(), getLocR(prR.dlv_id_cd()).lg_grp_cd(), prR.ship_term_cd());
			if (!isNull(ctlR)) {
				iv_trd_flg = ctlR.iv_trd_flg();
			} 
		}

		return iv_trd_flg;
	}

	/**
	 * 輸出取引（輸出実績を登録するパタン）かを判定する
	 */
	protected boolean isEx(ShipPr_DtlR prR) {
		return isIvTrd(prR) && MAC_VIA_DLV_TYP.isVIA(nvl(prR.ss().via_dlv_typ(), prR.via_dlv_typ()));
	}

	/**
	 * インボイス単位出荷かを判定する
	 */
	protected boolean isIvShip(ShipPr_DtlR prR) {
		boolean iv_ship_flg = false;
		MCList<MST_IV_R> ivL = getIvL(prR.ship_schd_no());
		if (!isNull(ivL)) {
			iv_ship_flg = ivL.get(0).iv_ship_flg();
		}

		return iv_ship_flg;
	}

	/**
	 * 受払予定区分を取得する<br>
	 * 出荷進捗の出荷実績数量を参照するので、事前に更新済みであること
	 */
	protected String getIoSchdTyp(ShipPr_DtlR prR) {
		return getIoSchdTypForShip(
			prR.trd_ptn_typ(),
			prR.ss().stk_id_typ(),
			nvl(prR.sp().ship_act_qty(), MCNumber.ZERO).isPositive(),
			isEx(prR));
	}

	/**
	 * 受払予定状況区分を取得する<br>
	 * 出荷予定の出荷指図数量を参照するので、事前に更新済みであること
	 */
	protected String getIoSchdStsTyp(ShipPr_DtlR prR, MST_SHIP_ALLOC_STS_R allocR) {
		return getIoSchdStsTypForShip(
			prR.trd_ptn_typ(),
			prR.dlv_inst_rcpt_no(),
			prR.slo_prms_no(),
			prR.purc_ddlv_flg(),
			nvl(prR.ss().ship_inst_qty(), MCNumber.ZERO).isPositive(),
			nvl(prR.ss().ship_act_qty(), MCNumber.ZERO).isPositive()
					&& !isNull(allocR) && nvl(allocR.ship_act_qty(), MCNumber.ZERO).isPositive(),
			nvl(prR.ss().iv_act_qty(), MCNumber.ZERO).isPositive(), prR.ss().stk_id_typ());
	}

	/**
	 * 取り消し時の受払予定状況区分を取得する<br>
	 */
	protected String getDelIoSchdStsTyp(ShipPr_DtlR prR, MST_SHIP_ALLOC_STS_R allocR) {
		return getIoSchdStsTypForShip(prR.trd_ptn_typ(), prR.dlv_inst_rcpt_no(),
				prR.slo_prms_no(), prR.purc_ddlv_flg(),
				nvl(prR.ss().ship_inst_qty(), MCNumber.ZERO).isPositive(),
				nvl(prR.getNumber("old_ship_act_qty"), MCNumber.ZERO).isPositive()
						&& !isNull(allocR)
						&& nvl(allocR.getNumber("old_ship_act_qty"), MCNumber.ZERO)
								.isPositive(),
				nvl(prR.ss().iv_act_qty(), MCNumber.ZERO).isPositive(),
				prR.ss().stk_id_typ());
	}

	/**
	 * 基準単位数量から取引単位数量に換算する<br>
	 * 換算時に余りが出る場合はnullを返却する
	 */
	protected MCNumber cnvBaseToTrdUnitQty(ShipPr_DtlR prR, MCNumber baseUnitQty, String unitCd) {
		MAVM_ITM_UNIT_R unitR = getItmUnitR(prR, unitCd);
		MAM_ITM_R baseUnitR = getItmR(prR);
		MCNumber entQty = rvrsBaseUnitConv(
				baseUnitQty, unitR.conv_base_qty(), unitR.conv_qty(),
				unitR.dec_place(), unitR.rnd_typ());
		
		MCNumber reEntQty = convToBaseUnit(
				entQty, unitR.conv_base_qty(), unitR.conv_qty(),
				baseUnitR.dec_place(), baseUnitR.rnd_typ());
		
		if (!isSame(reEntQty, baseUnitQty)) {
			return null;
		}
		else {
			return entQty;
		}
	}

	/**
	 * 出荷進捗を更新する<br>
	 * 当メソッドの前に出荷予定が更新されてること
	 */
	protected void updShipPr() {
		if (_updShipPrL != null) {
			_updShipPrL.dbExec();
		}
	}

	/**
	 * 出荷予定を更新する<br>
	 */
	protected void updShipSchd() {
		if (_updShipSchdL != null) {
			_updShipSchdL.dbExec();
		}
	}

	/**
	 * 出荷引当状況を更新する
	 */
	protected void updAllocSts() {
		if (_updShipSchdL != null) {
			// 更新対象の出荷予定に紐付く出荷引当状況をまとめて削除
			MCList<MST_SHIP_SCHD_R>
				schdL = MCList.create(MST_SHIP_SCHD_R.class),
				instL = MCList.create(MST_SHIP_SCHD_R.class);
			for (MST_SHIP_SCHD_R r : _updShipSchdL.getL()) {
				if (isNull(r.ship_inst_d_no())) {
					schdL.add(r);
					MST_SHIP_SCHD_R bfrR = getShipSchdR(r.ship_schd_no());
					if (!isNull(bfrR) && !isNull(bfrR.ship_inst_d_no())) {
						// 指図取消された出荷予定分に紐付く出荷引当状況を削除する
						instL.add(bfrR);
					}
				}
				else {
					instL.add(r);
					schdL.add(r);
				}
			}
			MST_SHIP_ALLOC_STS_R dbc = MST_SHIP_ALLOC_STS_R.create("T");
			execDbDelete("MSBEL5500_MST_SHIP_ALLOC_STS_D01", dbc, dbc.ship_schd_no.eq(bind("ship_schd_no")), schdL);
			execDbDelete("MSBEL5500_MST_SHIP_ALLOC_STS_D02", dbc, dbc.ship_inst_d_no.eq(bind("ship_inst_d_no")), instL);
		}
		if (!isNull(_updAllocStsL)) {
			dbInsert("MSBEL5500_MST_SHIP_ALLOC_STS_I01", _updAllocStsL, _updAllocStsL_bldr);
		}
	}

	/**
	 * 出荷引当状況の表示順を設定する
	 */
	protected void setAllocDispSeq() {

		MCList<MST_SHIP_ALLOC_STS_R>
			allocL = MCList.create(MST_SHIP_ALLOC_STS_R.class),
			noSeqL = MCList.create(MST_SHIP_ALLOC_STS_R.class),
			rsltL = MCList.create(MST_SHIP_ALLOC_STS_R.class);

		_updAllocStsL.forEach(r -> {
			if (!isNull(r.ship_inst_d_no())) {
				allocL.add(r);
				if (isNull(r.disp_seq())) {
					noSeqL.add(r);
				}
			}
			else {
				r.disp_seq(null);
			}
		});
		if (allocL.isEmpty()) {
			return;
		}

		// 上り電文の順番に並び替える
		// 上り電文になくSV内で作成された分については、同一pegの一番後ろに並べる

		rsltL.setAll(allocL.subList(r -> !isNull(r.disp_seq())));
		rsltL.sort(SortType.ASC, MST_SHIP_ALLOC_STS_R.$disp_seq);
		setDispSeq(rsltL);

		if (!noSeqL.isEmpty()) {
			for (MST_SHIP_ALLOC_STS_R r : noSeqL) {
				for (int i = rsltL.size()-1; i>= 0; i--) {
					MST_SHIP_ALLOC_STS_R rr = rsltL.get(i);
					if (isSame(r.getNumber(_$peg[0]), rr.getNumber(_$peg[0]))
						&& isSame(r.getNumber(_$peg[1]), rr.getNumber(_$peg[1]))) {
						rsltL.add(i + 1, r);
						break;
					}
				}
			}
			setDispSeq(rsltL);
		}

		for (MCList<MST_SHIP_ALLOC_STS_R>
				l : rsltL.groupList(MST_SHIP_ALLOC_STS_R.$ship_inst_no)) {
			l.sort(SortType.ASC, MST_SHIP_ALLOC_STS_R.$disp_seq);
			setDispSeq(l);
		}
	}

	/**
	 * エラーフラグがオフのリストを取得する
	 */
	protected MCList<ShipPr_DtlR> getNoErrList(MCList<ShipPr_DtlR> prL) {
		return prL.subList(ShipPr_DtlR.$err_flg, false);
	}

	/**
	 * ロット・サブロット管理しない品目はＮＵＬＬ文字を設定する
	 */
	protected void setShipNotMngLotNo(MCList<ShipPr_DtlR> prL) {
		for (ShipPr_DtlR r : prL) {
			MAM_ITM_R itmR = getItmR(r);
			if (MAC_LOT_MNG_TYP.isNOT_MNG(itmR.lot_mng_typ())) {
				r.lot_no(MAC_STR.NULL_VAL.value());
			}
			if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(itmR.sublot_mng_typ())) {
				r.sublot_no(MAC_STR.NULL_VAL.value());
			}
		}
	}

///// 発番
	/**
	 * 出荷進捗、出荷予定NOを発番＆設定する
	 */
	protected void doSeqForPrSchdL(MCList<ShipPr_DtlR> prL) {
		MCList<ShipPr_DtlR>
			numPrL = MCList.create(ShipPr_DtlR.class),
			numSchdL = MCList.create(ShipPr_DtlR.class);

		// 発番する件数をカウント
		for (ShipPr_DtlR r : prL) {
			// 新規
			if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
				if (r.upd02_flg()) {
					numSchdL.add(r);
				}
				else {
					numPrL.add(r);
					numSchdL.add(r);
				}
			}
			// Upd01かつ更新（打切、打切解除を除く）
			else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())
				&& !r.upd02_flg()
				&& !isAbort(r)
				&& !isAbortRel(r)) {
				numSchdL.add(r);
			}
		}

		// 出荷進捗NO、出荷予定NOを発番
		doSeqCache(MSC_NUM_SYS_TYP.SHIPPR, numPrL.size());
		doSeqCache(MSC_NUM_SYS_TYP.ALLOC_PRIO, numPrL.size());
		doSeqCache(MSC_NUM_SYS_TYP.SHIPSCHD, numSchdL.size());
		numPrL.forEach(r -> {
			r.ship_pr_no(getShipPrNo());
			r.ss().ship_pr_no(r.ship_pr_no());
			r.ss().alloc_prio(getAllocPrio(r.ship_pr_no()));
		});
		numSchdL.forEach(r -> {
			r.ss().ship_pr_no(r.ship_pr_no());
			r.ship_schd_no(getShipSchdNo());
		});
	}

	/**
	 * シーケンスを発番しキャッシュする
	 */
	protected void doSeqCacheForAllocStsL(MCList<ShipPr_DtlR> prL, MCList<Alloc_RsltR> rsltL) {
		// 出荷引当状況ＮＯ：引当結果のない件数＋引当結果の件数分キャッシュ
		int i = prL.groupBy(_$peg).size() - rsltL.groupBy(_$peg).size() + rsltL.size();
		if (i > 0) {
			doSeqCache(MSC_NUM_SYS_TYP.SHIPALOCS, i);
		}
	}

	/**
	 * 出荷進捗ＮＯを発番する
	 */
	protected String getShipPrNo() {
		return getStrSeq(MSC_NUM_SYS_TYP.SHIPPR);
	}

	/**
	 * 出荷予定ＮＯを発番する
	 */
	protected String getShipSchdNo() {
		return getStrSeq(MSC_NUM_SYS_TYP.SHIPSCHD);
	}

	/**
	 * 出荷引当状況ＮＯを発番する
	 */
	protected String getShipAllocStsNo() {
		return getStrSeq(MSC_NUM_SYS_TYP.SHIPALOCS);
	}
	
	/**
	 * 仕入直送の出荷予定に紐付く出荷引当状況ＮＯを取得する。
	 * @param shipSchdNo　出荷予定ＮＯ
	 */
	protected String getPurcDdlvShipAllocStsNo(String shipSchdNo) {
		
		MCList<MST_SHIP_ALLOC_STS_R> allocL = getAllocStsL(shipSchdNo);
		
		if (allocL.isEmpty()) {
			return null;
		}
		return allocL.get(0).ship_alloc_sts_no();
	}

	/**
	 * 引当順ＮＯを発番する
	 */
	protected String getAllocPrio(String shipPrNo) {
		MCList<MST_SHIP_SCHD_R>
			schdL = getShipSchdL(shipPrNo), workL = schdL;
		if (!isNull(schdL)) {
			if (schdL.size() > 1) {
				workL = schdL.shallowClone();	// 元リストの並び順は変えない
				workL.sort(MST_SHIP_SCHD_R.$ship_schd_no);
			}
			return workL.get(0).alloc_prio();
		}
		return getStrSeq(MSC_NUM_SYS_TYP.ALLOC_PRIO);
	}

	/**
	 * 受払進捗管理ＮＯを発番する
	 */
	protected String getIoSchdPrNo() {
		return getStrSeq(MSC_NUM_SYS_TYP.IOSCHDPR);
	}


///// キャッシュ関連
	/**
	 * キャッシュを管理するリクエストオブジェクト
	 */
	protected static final Class<MSBEL_ShipSchdService> CLAZZ = MSBEL_ShipSchdService.class;

	/**
	 * 上り電文からトラン情報をキャッシュする<br>
	 * キャッシュにはリクエストオブジェクトを利用する
	 */
	protected void doTranDataCache(MCList<ShipPr_DtlR> prL) {
		doShipPrCache(prL);
		doShipSchdCache(prL);
		doAllocStsCache(prL);
		doSloDCache(prL);
	}

	/**
	 * 出荷進捗のキャッシュ<br>
	 * 更新後にリフレッシュしない。よって更新後は更新前の状態を保持することになる
	 */
	protected FXUCL_MCDbcCache<MST_SHIP_PR_R> _cacheShipPrL = null;
	protected void doShipPrCache(MCList<ShipPr_DtlR> prL) {
		MCList<MST_SHIP_PR_R> dbc = MCList.create(MST_SHIP_PR_R.class);
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MST_SHIP_PR_R.create("T"));
		dbc_bldr.setSelectAll();
		if (object(CLAZZ)._cacheShipPrL == null) {
			// ForUpdateしたいので、ここでは空リストでキャッシュのインスタンスを作成する
			object(CLAZZ)._cacheShipPrL
				= new FXUCL_MCDbcCache<MST_SHIP_PR_R>(
						dbc, dbc_bldr, -1, dbc, ShipPr_DtlR.$ship_pr_no);
		}

		MCList<ShipPr_DtlR> cndL = prL.createInstance();
		for (ShipPr_DtlR r : prL) {
			if (!isNull(r.ship_pr_no())) {
				// 同一リクエスト内でUpd01とUpd02が呼ばれることがあり、
				// 異なるOPでキャッシュを使いまわすと内容が追い付かない可能性があるので、
				// 出荷進捗は常に取り直すことにする
				cndL.add(r);
			}
		}
		if (!cndL.isEmpty()) {
			dbSelectKeyForUpdate("MSBEL5500_MST_SHIP_PR_S03", dbc, dbc_bldr, cndL);
			dbc.forEach(r -> {
				object(CLAZZ)._cacheShipPrL.putCache(
					r.toArray(	MST_SHIP_PR_R.$ship_pr_no), r);
			});
		}
	}
	protected MST_SHIP_PR_R getShipPrR(String shipPrNo) {
		return object(CLAZZ)._cacheShipPrL.get(shipPrNo);
	}

	/**
	 * 出荷予定をキャッシュするクラス
	 * 更新後にリフレッシュしない。よって更新後は更新前の状態を保持することになる
	 */
	public class ShipSchdCache {
		protected MCList<MST_SHIP_SCHD_R> _shipSchdL = null;
		protected MCIndexKey _schdIdx = null;
		protected MCIndexKey _prIdx = null;
		protected ShipSchdCache() {
			_shipSchdL = MCList.create(MST_SHIP_SCHD_R.class);
			crtIdx();
		}
		protected void doCache(MCList<ShipPr_DtlR> prL) {
			MCList<ShipPr_DtlR> cndL = prL.subList(r -> !isNull(r.ship_pr_no()));
			if (cndL.isEmpty())	return;
			
			insShipPrWk(cndL);
			
			MCList<MST_SHIP_SCHD_R> dbc = MCList.create(MST_SHIP_SCHD_R.class);
			MST_SHIP_SCHD_R t = MST_SHIP_SCHD_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			MST_SLS_SCHD_R S1W = MST_SLS_SCHD_R.create("W");
			MST_SHIP_INST_D_R t1 = MST_SHIP_INST_D_R.create("T1");
			MST_SHIP_INST_R t2 = MST_SHIP_INST_R.create("T2");
			MST_IV_MAP_R ivMap = MST_IV_MAP_R.create("IVMAP");
			MST_SLS_SCHD_R ivSlsSchd = MST_SLS_SCHD_R.create("IVSLSSCHD");
			MCTempView vIvSlsSchd = createTempView("VIVSLSSCHD");
			MSW_SHIP_PR_KEY_R shipPrKey = MSW_SHIP_PR_KEY_R.create("SHIPPRKEY");
			MST_SHIP_SCHD_R S2ShipSchd = MST_SHIP_SCHD_R.create("S2SHIPSCHD");
			dbc_bldr.setSelectAll();
			dbc_bldr.addSelect(
					t2.ship_schd_tm.as("inst_ship_schd_tm"),
					t2.dlv_schd_tm.as("inst_dlv_schd_tm"),
					nvl(
						nvl(subQuery()
							.select(sum(S1W.base_unit_sls_qty))
							.from(S1W)
							.where(S1W.ship_schd_no.eq(t.ship_schd_no)), vIvSlsSchd.pr("sls_qty")), value(0))
							.as("sls_qty"));
			dbc_bldr.addLeftOuterJoin(t1,
					bracket(t1.ship_inst_d_no.eq(t.ship_inst_d_no)
							.and(t1.can_flg.eq(value(false)))));
			dbc_bldr.addLeftOuterJoin(t2,
					bracket(t2.ship_inst_no.eq(t1.ship_inst_no)
							.and(t2.can_flg.eq(value(false)))));
			dbc_bldr.addLeftOuterJoin(subQuery()
					.select(
						sum(ivSlsSchd.base_unit_sls_qty).as("sls_qty"),
						ivMap.ship_schd_no)
					.from(ivMap
							.innerJoin(S2ShipSchd).on(ivMap.ship_schd_no.eq(S2ShipSchd.ship_schd_no))
							.innerJoin(shipPrKey).on(S2ShipSchd.ship_pr_no.eq(shipPrKey.ship_pr_no))
							.innerJoin(ivSlsSchd).on(ivMap.iv_d_no.eq(ivSlsSchd.iv_d_no)))
					.groupBy(ivMap.ship_schd_no)
					.view(vIvSlsSchd), vIvSlsSchd.pr("ship_schd_no").eq(t.ship_schd_no));
			dbc_bldr.addInnerJoin(shipPrKey, t.ship_pr_no.eq(shipPrKey.ship_pr_no));
			dbSelect("MSBEL5500_MST_SHIP_SCHD_S10", dbc, dbc_bldr);

			MCList<MST_SHIP_SCHD_R> rmL = MCList.create(MST_SHIP_SCHD_R.class);
			for (MCList<MST_SHIP_SCHD_R> lst : dbc.groupList(MST_SHIP_SCHD_R.$ship_pr_no)) {
				rmL.addAll(getByPr(lst.get(0).ship_pr_no()));
			}
			if (!rmL.isEmpty()) {
				_shipSchdL.removeAll(rmL);
			}
			_shipSchdL.addAll(dbc);
			crtIdx();
		}
		
		protected void insShipPrWk(MCList<ShipPr_DtlR> bindL) {
			
			MCList<MSW_SHIP_PR_KEY_R> wkL = MCList.create(MSW_SHIP_PR_KEY_R.class);
			
			for (ShipPr_DtlR r : bindL.groupBy(ShipPr_DtlR.$ship_pr_no)) {
				if (!isNull(r.ship_pr_no())) {
					wkL.add().ship_pr_no(r.ship_pr_no());
				}
			}
			
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_SHIP_PR_R.create("T"));
			
			dbWkDelete("MSBEL5500_MSW_SHIP_PR_D02", wkL_bldr.getBaseDbc());
			dbWkInsert("MSBEL5500_MSW_SHIP_PR_I02", wkL, wkL_bldr.getBaseDbc());
		}
		
		protected void crtIdx() {
			_schdIdx = _shipSchdL.createIndex(MST_SHIP_SCHD_R.$ship_schd_no);
			_prIdx = _shipSchdL.createIndex(MST_SHIP_SCHD_R.$ship_pr_no);
		}
		protected MST_SHIP_SCHD_R getBySchd(String shipSchdNo) {
			return _shipSchdL.getFirst(_schdIdx, shipSchdNo);
		}
		protected MCList<MST_SHIP_SCHD_R> getByPr(String shipPrNo) {
			return _shipSchdL.subList(_prIdx, shipPrNo);
		}
	}
	protected ShipSchdCache _cacheShipSchdL = null;
	protected void doShipSchdCache(MCList<ShipPr_DtlR> prL) {
		if (object(CLAZZ)._cacheShipSchdL == null) {
			object(CLAZZ)._cacheShipSchdL = new ShipSchdCache();
		}
		object(CLAZZ)._cacheShipSchdL.doCache(prL);
	}
	protected MST_SHIP_SCHD_R getShipSchdR(String shipSchdNo) {
		return object(CLAZZ)._cacheShipSchdL.getBySchd(shipSchdNo);
	}
	protected MCList<MST_SHIP_SCHD_R> getShipSchdL(String shipPrNo) {
		return object(CLAZZ)._cacheShipSchdL.getByPr(shipPrNo);
	}

	/**
	 * 出荷引当状況をキャッシュするクラス
	 * 更新後にリフレッシュしない。よって更新後は更新前の状態を保持することになる
	 */
	public class AllocStsCache {
		protected MCList<MST_SHIP_ALLOC_STS_R> _allocStsL = null;
		protected MCIndexKey _allocIdx = null;
		protected MCIndexKey _schdIdx = null;
		protected MCIndexKey _prIdx = null;
		protected MCIndexKey _instIdx = null;
		protected AllocStsCache() {
			_allocStsL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			crtIdx();
		}
		protected void doCache(MCList<ShipPr_DtlR> prL) {
			MCList<ShipPr_DtlR> cndL = prL.subList(r -> !isNull(r.ship_pr_no()));
			if (cndL.isEmpty()) return;

			MCList<MST_SHIP_ALLOC_STS_R> dbc = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			MST_SHIP_ALLOC_STS_R t = MST_SHIP_ALLOC_STS_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			MST_SHIP_SCHD_R t1 = MST_SHIP_SCHD_R.create("T1");
			MSW_SHIP_PR_KEY_R w = MSW_SHIP_PR_KEY_R.create("W");
			dbWkDelete("MSBEL5500_MSW_SHIP_PR_KEY_D02", MST_SHIP_PR_R.create());
			dbWkInsert("MSBEL5500_MSW_SHIP_PR_KEY_I02",
				cndL.groupBy(ShipPr_DtlR.$ship_pr_no), MST_SHIP_PR_R.create());
			dbc_bldr.setSelectAll();
			dbc_bldr.addSelect(t1.ship_pr_no, t1.ship_fr_lg_grp_cd);
			dbc_bldr.addInnerJoin(t1,
					bracket(t1.ship_schd_no.eq(t.ship_schd_no)));
			dbc_bldr.addInnerJoin(w, w.ship_pr_no.eq(t1.ship_pr_no));
			dbSelect("MSBEL5500_MST_SHIP_ALLOC_STS_S04", dbc, dbc_bldr);
			
			MCList<MST_SHIP_ALLOC_STS_R> tmpL = dbc.shallowClone();
			tmpL.clear();
			
			dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelectAll();
			dbc_bldr.addSelect(t1.ship_pr_no, t1.ship_fr_lg_grp_cd);
			dbc_bldr.addInnerJoin(t1,
					bracket(t1.ship_inst_d_no.eq(t.ship_inst_d_no)));
			dbc_bldr.addInnerJoin(w, w.ship_pr_no.eq(t1.ship_pr_no));
			dbSelect("MSBEL5500_MST_SHIP_ALLOC_STS_S07", tmpL, dbc_bldr);
			dbc.merge(tmpL, MST_SHIP_ALLOC_STS_R.$ship_alloc_sts_no);

			MCList<MST_SHIP_ALLOC_STS_R> rmL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			for (MCList<MST_SHIP_ALLOC_STS_R> lst : dbc.groupList("ship_pr_no")) {
				rmL.addAll(getByPr(lst.getString(0, "ship_pr_no")));
			}
			if (!rmL.isEmpty()) {
				_allocStsL.removeAll(rmL);
			}
			_allocStsL.addAll(dbc);
			crtIdx();
		}
		protected void crtIdx() {
			_schdIdx = _allocStsL.createIndex(MST_SHIP_ALLOC_STS_R.$ship_schd_no);
			_allocIdx = _allocStsL.createIndex(MST_SHIP_ALLOC_STS_R.$ship_alloc_sts_no);
			_prIdx = _allocStsL.createIndex("ship_pr_no");
			_instIdx = _allocStsL.createIndex(MST_SHIP_ALLOC_STS_R.$ship_inst_d_no);
		}
		protected MST_SHIP_ALLOC_STS_R getByAlloc(String allocStsNo) {
			return _allocStsL.getFirst(_allocIdx, allocStsNo);
		}
		protected MCList<MST_SHIP_ALLOC_STS_R> getBySchd(String shipSchdNo) {
			return _allocStsL.subList(_schdIdx, shipSchdNo);
		}
		protected MCList<MST_SHIP_ALLOC_STS_R> getByInst(String shipInstDNo) {
			// 指図まとめ時に同一の引当状況が重複して取得されることがあるので、重複を除外して取得する
			MCList<MST_SHIP_ALLOC_STS_R>
				l = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			for (MCList<MST_SHIP_ALLOC_STS_R> lst :
				_allocStsL.subList(_instIdx, shipInstDNo).groupList(MST_SHIP_ALLOC_STS_R.$ship_alloc_sts_no)) {
				MST_SHIP_ALLOC_STS_R r = lst.get(0);
				l.add(r);
			}
			return l;
		}
		protected MCList<MST_SHIP_ALLOC_STS_R> getByPr(String shipPrNo) {
			return _allocStsL.subList(_prIdx, shipPrNo);
		}
	}
	protected AllocStsCache _cacheAllocStsL = null;
	protected void doAllocStsCache(MCList<ShipPr_DtlR> prL) {
		if (object(CLAZZ)._cacheAllocStsL == null) {
			object(CLAZZ)._cacheAllocStsL = new AllocStsCache();
		}
		object(CLAZZ)._cacheAllocStsL.doCache(prL);
	}
	protected MST_SHIP_ALLOC_STS_R getAllocStsR(String allocStsNo) {
		return object(CLAZZ)._cacheAllocStsL.getByAlloc(allocStsNo);
	}
	protected MCList<MST_SHIP_ALLOC_STS_R> getAllocStsL(String shipSchdNo) {
		return object(CLAZZ)._cacheAllocStsL.getBySchd(shipSchdNo);
	}
	protected MCList<MST_SHIP_ALLOC_STS_R> getAllocStsLByInst(String shipInstDNo) {
		return object(CLAZZ)._cacheAllocStsL.getByInst(shipInstDNo);
	}
	protected MCList<MST_SHIP_ALLOC_STS_R> getAllocStsLByPr(String shipPrNo) {
		return object(CLAZZ)._cacheAllocStsL.getByPr(shipPrNo);
	}

	/**
	 * 出荷指図明細のキャッシュ
	 */
	protected FXUCL_MCDbcCache<MST_SHIP_INST_D_R> _cacheShipInstDL = null;
	protected void doShipInstDCache(MCList<ShipPr_DtlR> prL) {
		MST_SHIP_INST_D_R t = MST_SHIP_INST_D_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.ship_inst_no);
		MCList<ShipPr_DtlR>
			cndL = prL
				.groupBy(ShipPr_DtlR.$ship_inst_d_no)
				.subList(r -> !isNull(r.ship_inst_d_no()));

		_cacheShipInstDL
			= new FXUCL_MCDbcCache<MST_SHIP_INST_D_R>(
				dbc_bldr, -1, cndL, ShipPr_DtlR.$ship_inst_d_no);
	}
	protected MST_SHIP_INST_D_R getShipInstDR(String shipInstDNo) {
		if (_cacheShipInstDL == null) {
			doShipInstDCache(createShipPr_DtlL());
		}
		return _cacheShipInstDL.get(shipInstDNo);
	}

	/**
	 * 受注明細のキャッシュ
	 */
	protected FXUCL_MCDbcCache<MST_SLO_D_R> _cacheSloDL = null;
	protected void doSloDCache(MCList<ShipPr_DtlR> prL) {
		MCList<MST_SLO_D_R> dbc = MCList.create(MST_SLO_D_R.class);
		MST_SLO_D_R t = MST_SLO_D_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		MST_SLO_R t1 = MST_SLO_R.create("T1");
		dbc.addBooleanColumn("aprv_flg");
		dbc_bldr.setSelect(
				t.slo_d_no,
				t.slo_no,
				t.sls_schd_dt
		);
		dbc_bldr.addSelect(
				t1.slo_no,
				t1.slo_dt,
				t1.aprv_flg,
				t1.aprv_sts_typ,
				t1.slo_typ,
				t1.adv_ship_ctrl_typ,
				nvl(t1.adv_bill_amt, value(0)).as("adv_bill_amt"),
				nvl(t1.adv_rcv_amt, value(0)).as("adv_rcv_amt"),
				t1.assort_typ,
				t1.sls_basis_typ,
				t.dlv_day_week_typ,
				t.sls_cststk_flg,
				t.abort_flg
		);
		dbc_bldr.addLeftOuterJoin(t1, bracket(t1.slo_no.eq(t.slo_no)));

		if (object(CLAZZ)._cacheSloDL == null) {
			// 対象がなくてもキャッシュのインスタンスは作成するので、ひとまず空リストで作成する
			object(CLAZZ)._cacheSloDL
				= new FXUCL_MCDbcCache<MST_SLO_D_R>(dbc, dbc_bldr, -1, dbc, MST_SLO_D_R.$slo_d_no);
		}

		MCList<ShipPr_DtlR> cndL = prL.createInstance();
		for (ShipPr_DtlR r : prL) {
			if (!isNull(r.slo_d_no())) {
				// 同一リクエスト内でUpd01とUpd02が呼ばれることがあり、
				// 異なるOPでキャッシュを使いまわすと内容が追い付かない可能性があるので、
				// 受注明細は常に取り直すことにする
				cndL.add(r);
			}
			else if (!isNull(r.ship_pr_no())) {
				MST_SHIP_PR_R prR = getShipPrR(r.ship_pr_no());
				if(!isNull(prR.slo_d_no())) {
					r.slo_d_no(prR.slo_d_no());
					cndL.add(r);
				}
			}
		}
		if (!cndL.isEmpty()) {
			dbSelectKey("MSBEL5500_MST_SLO_D_S01", dbc, dbc_bldr, cndL);
			dbc.forEach(r -> {
				object(CLAZZ)._cacheSloDL.putCache(
					r.toArray(MST_SLO_D_R.$slo_d_no), r);
			});
		}
	}
	protected MST_SLO_D_R getSloDR(String sloDNo) {
		return object(CLAZZ)._cacheSloDL.get(sloDNo);
	}

	/**
	 * 移動・移送予定のキャッシュ
	 */
	protected FXUCL_MCDbcCache<MST_XFR_SCHD_R> _cacheXfrSchdL = null;

	protected void doXfrSchdCache(MCList<ShipPr_DtlR> prL) {
		MCList<MST_XFR_SCHD_R> dbc = MCList.create(MST_XFR_SCHD_R.class);
		MST_XFR_SCHD_R t = MST_XFR_SCHD_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		MAM_LOC_R m1 = MAM_LOC_R.create("M1");
		MAM_LOC_R m2 = MAM_LOC_R.create("M2");
		dbc_bldr.setSelectAll();
		dbc_bldr.addSelect(m1.sppl_cd.as("gi_sppl_cd"), m1.wg_cd.as("gi_wg_cd"),
				m2.sppl_cd.as("gr_sppl_cd"), m2.wg_cd.as("gr_wg_cd"));
		dbc_bldr.addLeftOuterJoin(m1, bracket(m1.loc_cd.eq(t.gi_loc_cd))); // 出庫場所
		dbc_bldr.addLeftOuterJoin(m2, bracket(m2.loc_cd.eq(t.gr_loc_cd))); // 入庫場所

		if (object(CLAZZ)._cacheXfrSchdL == null) {
			// 対象がなくてもキャッシュのインスタンスは作成するので、ひとまず空リストで作成する
			object(CLAZZ)._cacheXfrSchdL
				= new FXUCL_MCDbcCache<MST_XFR_SCHD_R>(dbc, dbc_bldr, -1, dbc, MST_XFR_SCHD_R.$xfr_schd_no);
		}

		MCList<ShipPr_DtlR> cndL = prL.createInstance();
		for (ShipPr_DtlR r : prL) {
			if (!isNull(r.xfr_schd_no())) {
				// 同一リクエスト内でUpd01とUpd02が呼ばれることがあり、
				// 異なるOPでキャッシュを使いまわすと内容が追い付かない可能性があるので、
				// 移動・移送予定は常に取り直すことにする
				cndL.add(r);
			}
		}
		if (!cndL.isEmpty()) {
			dbSelectKey("MSBEL5500_MST_XFR_SCHD_S01", dbc, dbc_bldr, cndL);
			dbc.forEach(r -> {
				object(CLAZZ)._cacheXfrSchdL
						.putCache(r.toArray(MST_XFR_SCHD_R.$xfr_schd_no), r);
			});
		}
	}
	protected MST_XFR_SCHD_R getXfrSchdR(String xfrSchdNo) {
		return object(CLAZZ)._cacheXfrSchdL.get(xfrSchdNo);
	}

	/**
	 * インボイスのキャッシュ<br>
	 * チェック処理では使用しないので、リクエストオブジェクトは利用しない<br>
	 * インボイスNO、船卸予定日の取得に使用
	 */
	protected MCList<MST_IV_R> _cacheIvL = null;
	protected MCIndexKey _cacheIvIdx = null;
	protected void doIvCache(MCList<ShipPr_DtlR> prL) {
		
		MCList<ShipPr_DtlR> l = MCList.create(ShipPr_DtlR.class);
		for (ShipPr_DtlR r : prL) {
			if (isIvTrd(r)) {
				l.add(r);
			}
		}
		_cacheIvL = MCList.create(MST_IV_R.class);
		MST_IV_R t = MST_IV_R.create("T");
		MCQueryApiBuilder cacheIvL_bldr = MCQueryApiBuilder.create(t);
		MST_IV_D_R t1 = MST_IV_D_R.create("T1");
		MST_IV_MAP_R t2 = MST_IV_MAP_R.create("T2");
		cacheIvL_bldr.setSelect(t.iv_ship_flg, t.iv_no, t.eta_dt, t2.iv_d_no,
				t2.ship_schd_no, t2.base_unit_qty, t.xrate_inpt_flg, t.xrate,
				t.ptax_xrate_inpt_flg, t.ptax_xrate);
		cacheIvL_bldr.addInnerJoin(t1, bracket(t1.iv_mng_no.eq(t.iv_mng_no)));
		cacheIvL_bldr.addInnerJoin(t2, bracket(t2.iv_d_no.eq(t1.iv_d_no)));
		cacheIvL_bldr.setWhere(t2.ship_schd_no.eq(bind("ship_schd_no")));
		cacheIvL_bldr.setOrderByAsc(t2.ship_schd_no);
		cacheIvL_bldr.addOrderByDesc(t.eta_dt);
		dbSelect("MSBEL5500_MST_IV_S01", _cacheIvL, cacheIvL_bldr,
				l.groupBy(ShipPr_DtlR.$ship_schd_no));
		_cacheIvIdx = _cacheIvL.createIndex("ship_schd_no");
	}
	protected MCList<MST_IV_R> getIvL(String shipSchdNo) {
		return _cacheIvL.subList(_cacheIvIdx, shipSchdNo);
	}

	/**
	 * 引当管理サービスの引当可能日数チェックを実行
	 */
	protected void doAllocAvlSprt(MSBEL_AllocMngService.Alloc_Avl_Sprt01 allocAvlSprt01, MCList<ShipPr_DtlR> prL) {
		for (ShipPr_DtlR r : prL) {
			if (MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSHIP(r.trd_ptn_typ())) {
				Alloc_Avl_Sprt01_CndR cndR = Alloc_Avl_Sprt01_CndR.create();
				copy(cndR, r, createMap_Alloc_Avl_Sprt01_CndR_ShipPr_DtlR());
				allocAvlSprt01.up0().add(cndR);
			}
		}
		if (!allocAvlSprt01.up0().isEmpty()) {
			allocAvlSprt01.exec();
		}
	}
	
	protected Map_Alloc_Avl_Sprt01_CndR_ShipPr_DtlR<Alloc_Avl_Sprt01_CndR,ShipPr_DtlR> createMap_Alloc_Avl_Sprt01_CndR_ShipPr_DtlR() {
		return new Map_Alloc_Avl_Sprt01_CndR_ShipPr_DtlR<Alloc_Avl_Sprt01_CndR, ShipPr_DtlR>();
	}

	public class Map_Alloc_Avl_Sprt01_CndR_ShipPr_DtlR<D extends Alloc_Avl_Sprt01_CndR, S extends ShipPr_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Alloc_Avl_Sprt01_CndR.$peg_no, ShipPr_DtlR.$peg_no);
			addColumnPathMap(Alloc_Avl_Sprt01_CndR.$ship_term_cd, ShipPr_DtlR.$ship_term_cd);
			addColumnPathMap(Alloc_Avl_Sprt01_CndR.$dlv_lg_grp_cd, ShipPr_DtlR.$ship_to_lg_grp_cd);
			addColumnPathMap(Alloc_Avl_Sprt01_CndR.$gi_lg_grp_cd, ShipPr_DtlR.$ship_fr_lg_grp_cd);
			addColumnPathMap(Alloc_Avl_Sprt01_CndR.$gi_schd_dt, ShipPr_DtlR.$ship_schd_tm);
		}
	}
	
	/**
	 * 支給予定のキャッシュ<br>
	 * チェック処理では使用しないので、リクエストオブジェクトは利用しない<br>
	 */
	protected MCList<MST_PROV_SCHD_R> _cacheProvSchdL = null;
	protected MCIndexKey _cacheProvSchdIdx = null, _cacheProvSchdIdx2 = null; 
	protected void doProvSchdCache(MCList<ShipPr_DtlR> prL) {
		
		MCList<ShipPr_DtlR> l = MCList.create(ShipPr_DtlR.class);
		for (ShipPr_DtlR r : prL) {
			if (MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
				l.add(r);
			}
		}
		_cacheProvSchdL = MCList.create(MST_PROV_SCHD_R.class);
		MST_PROV_SCHD_R t = MST_PROV_SCHD_R.create("T");
		MCQueryApiBuilder cacheProvSchdL_bldr = MCQueryApiBuilder.create(t);
		cacheProvSchdL_bldr.setSelectAll();
		cacheProvSchdL_bldr.setWhere(
				t.prov_src_schd_typ.eq(value(MSC_PROV_SRC_SCHD_TYP.SHIP.value())));
		cacheProvSchdL_bldr
				.addWhereWithAnd(t.prov_src_schd_no1.eq(bind("ship_schd_no")));
		cacheProvSchdL_bldr
				.addWhereWithAnd(t.prov_src_schd_no2.eq(value(MAC_STR.NULL_VAL.value())));
		dbSelect("MSBEL5500_MST_PROV_SCHD_S01", _cacheProvSchdL, cacheProvSchdL_bldr,
				l.groupBy(ShipPr_DtlR.$ship_schd_no));
		_cacheProvSchdIdx = _cacheProvSchdL.createIndex(
				MST_PROV_SCHD_R.$prov_src_schd_no1, MST_PROV_SCHD_R.$trd_ptn_typ);
		_cacheProvSchdIdx2 = _cacheProvSchdL.createIndex(MST_PROV_SCHD_R.$prov_src_schd_no1);
	}
	protected MST_PROV_SCHD_R getProvSchdR(String shipSchdNo, String trdPtnTyp) {
		return _cacheProvSchdL.getFirst(_cacheProvSchdIdx, shipSchdNo, trdPtnTyp);
	}
	protected MCList<MST_PROV_SCHD_R> getProvSchdL(String shipSchdNo) {
		return _cacheProvSchdL.subList(_cacheProvSchdIdx2, shipSchdNo);
	}

	/**
	 * 出荷実績明細のキャッシュ<br>
	 * 
	 * 受払予定の作成、または出荷予定の売上数量、納品数量、出荷返品数量の更新に使用する<br>
	 * 売上数量は、出荷実績明細に対応する売上実績数を売上実績受払から取得する<br>
	 */
	protected MCList<MST_SHIP_ALLOC_STS_R> _cacheShipActL = null;
	protected MCIndexKey _cacheShipActKey = null;
	protected void doShipActCache(MCList<MST_SHIP_ALLOC_STS_R> upL, MCQueryApiBuilder upL_bldr) {
		dbWkDelete("MSBEL5500_MSW_SHIP_ALLOC_STS_D01", upL_bldr.getBaseDbc());
		dbWkInsert("MSBEL5500_MSW_SHIP_ALLOC_STS_I01",
				upL.groupBy(MST_SHIP_ALLOC_STS_R.$ship_alloc_sts_no), upL_bldr.getBaseDbc());

		_cacheShipActL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
		MST_SHIP_ALLOC_STS_R t = MST_SHIP_ALLOC_STS_R.create("T");
		MCQueryApiBuilder cacheShipActL_bldr = MCQueryApiBuilder.create(t);
		MSW_SHIP_ALLOC_STS_KEY_R w = MSW_SHIP_ALLOC_STS_KEY_R.create("W");
		MST_SHIP_ACT_D_R t1 = MST_SHIP_ACT_D_R.create("T1");
		MST_SHIP_ACT_R t2 = MST_SHIP_ACT_R.create("T2");
		MCTempView t3 = createTempView("T3");
		MST_IV_SHIP_ACT_D_R S0W = MST_IV_SHIP_ACT_D_R.create("W");
		MSW_SHIP_ALLOC_STS_KEY_R S1W = MSW_SHIP_ALLOC_STS_KEY_R.create("S1W");
		MST_SHIP_ACT_D_R S1W1 = MST_SHIP_ACT_D_R.create("S1W1");
		MST_SLS_ACT_IO_R S1W2 = MST_SLS_ACT_IO_R.create("S1W2");
		MST_SLS_ACT_D_R S1W3 = MST_SLS_ACT_D_R.create("S1W3");
		MST_SLS_ACT_R S1W4 = MST_SLS_ACT_R.create("S1W4");
		cacheShipActL_bldr.setSelect(t1.ship_act_d_no, t.ship_alloc_sts_no,
				t.ship_schd_no, t.ent_unit_cd, t1.dlv_slip_d_no, t1.ship_loc_cd,
				t1.ship_str_ln_cd, t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3,
				t1.itm_nm, t1.stk_arrv_bp_cd, t1.lot_no, t1.sublot_no, t1.ver_no, t1.sno1,
				t.sno1_null_flg, t1.sno2, t.sno2_null_flg, t1.sno3, t.sno3_null_flg,
				t1.sno4, t.sno4_null_flg, t1.gd_cd, t1.quality_typ, t1.stk_insp_typ,
				t1.stk_id_typ, t1.stk_bp_cd, t1.trd_unit_qty, t1.trd_unit_cd,
				t1.base_unit_qty, t1.base_unit_qty.as("ship_act_qty"), t1.base_unit_cd,
				t1.dlv_qty, t1.ship_ret_qty, t2.ship_act_no, t2.ship_tm, t2.dlv_tm,
				t3.pr(S1W2.sls_act_io_no), t3.pr(S1W2.base_unit_qty).as("sls_io_act_qty"),
				t.io_schd_pr_no,
				nvl(bracket(subQuery()
						.select(sum(S0W.base_unit_qty))
						.from(S0W)
						.where(S0W.ship_act_d_no.eq(t1.ship_act_d_no))), value(0))
						.as("iv_act_qty")
				);
		cacheShipActL_bldr.addInnerJoin(w,
				bracket(w.ship_alloc_sts_no.eq(t.ship_alloc_sts_no)));
		cacheShipActL_bldr.addLeftOuterJoin(t1,
				bracket(t1.ship_alloc_sts_no.eq(t.ship_alloc_sts_no)
						.and(t1.can_flg.eq(value(false)))));
		cacheShipActL_bldr.addLeftOuterJoin(t2,
				bracket(t2.ship_act_no.eq(t1.ship_act_no)));
		cacheShipActL_bldr
				.addLeftOuterJoin(
						subQuery()
								.select(S1W1.ship_act_d_no,
										S1W2.sls_act_io_no,
										S1W2.base_unit_qty)
								.from(S1W.innerJoin(S1W1)
										.on(bracket(S1W1.ship_alloc_sts_no.eq(S1W.ship_alloc_sts_no)
												.and(S1W1.can_flg.eq(value(false)))))
										.innerJoin(S1W2)
										.on(bracket(S1W2.ship_act_d_no.eq(S1W1.ship_act_d_no)))
										.innerJoin(S1W3)
										.on(bracket(S1W3.sls_act_d_no.eq(S1W2.sls_act_d_no)
												.and(S1W3.sls_act_d_seq.eq(S1W2.sls_act_d_seq))))
										.innerJoin(S1W4)
										.on(bracket(S1W4.sls_act_no.eq(S1W3.sls_act_no)
												.and(S1W4.sls_act_seq.eq(S1W3.sls_act_seq))
												.and(S1W4.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))))))
								.view(t3),
						bracket(t3.pr(S1W1.ship_act_d_no).eq(t1.ship_act_d_no)));
		dbSelect("MSBEL5500_MST_SHIP_ALLOC_STS_S05", _cacheShipActL, cacheShipActL_bldr);
		_cacheShipActKey = _cacheShipActL.createIndex(MST_SHIP_ALLOC_STS_R.$ship_alloc_sts_no);
	}
	protected MCList<MST_SHIP_ALLOC_STS_R> getShipActL(String allocStsNo) {
		return _cacheShipActL.subList(_cacheShipActKey, allocStsNo);
	}

	/**
	 * 出荷実績明細（輸出）のキャッシュ<br>
	 * 
	 * 出荷予定の売上数量、納品数量、出荷返品数量の更新に使用する<br>
	 * 売上数量は、インボイス出荷実績明細に対応する売上実績数を売上実績受払から取得する<br>
	 */
	protected MCList<MST_SHIP_ALLOC_STS_R> _shipActL2 = null;
	protected MCIndexKey _shipActL2Key = null;
	protected void doShipAct2Cache(MCList<MST_SHIP_ALLOC_STS_R> upL, MCQueryApiBuilder upL_bldr) {
		dbWkDelete("MSBEL5500_MSW_SHIP_ALLOC_STS_D02", upL_bldr.getBaseDbc());
		dbWkInsert("MSBEL5500_MSW_SHIP_ALLOC_STS_I02",
				upL.groupBy(MST_SHIP_ALLOC_STS_R.$ship_alloc_sts_no), upL_bldr.getBaseDbc());

		_shipActL2 = MCList.create(MST_SHIP_ALLOC_STS_R.class);
		MST_SHIP_ALLOC_STS_R t = MST_SHIP_ALLOC_STS_R.create("T");
		MCQueryApiBuilder shipActL2_bldr = MCQueryApiBuilder.create(t);
		MSW_SHIP_ALLOC_STS_KEY_R w = MSW_SHIP_ALLOC_STS_KEY_R.create("W");
		MST_SHIP_ACT_D_R t1 = MST_SHIP_ACT_D_R.create("T1");
		MST_IV_SHIP_ACT_D_R t2 = MST_IV_SHIP_ACT_D_R.create("T2");
		MCTempView t3 = createTempView("T3");
		MSW_SHIP_ALLOC_STS_KEY_R S1W = MSW_SHIP_ALLOC_STS_KEY_R.create("S1W");
		MST_SHIP_ACT_D_R S1W0 = MST_SHIP_ACT_D_R.create("S1W0");
		MST_IV_SHIP_ACT_D_R S1W1 = MST_IV_SHIP_ACT_D_R.create("S1W1");
		MST_SLS_ACT_IO_R S1W2 = MST_SLS_ACT_IO_R.create("S1W2");
		MST_SLS_ACT_D_R S1W3 = MST_SLS_ACT_D_R.create("S1W3");
		MST_SLS_ACT_R S1W4 = MST_SLS_ACT_R.create("S1W4");
		shipActL2_bldr.setSelect(t1.ship_act_d_no, t.ship_alloc_sts_no, t1.dlv_qty,
				t1.ship_ret_qty, t2.iv_ship_act_d_no, t3.pr(S1W2.sls_act_io_no),
				t3.pr(S1W2.base_unit_qty).as("sls_io_act_qty"));
		shipActL2_bldr.addInnerJoin(w,
				bracket(w.ship_alloc_sts_no.eq(t.ship_alloc_sts_no)));
		shipActL2_bldr.addLeftOuterJoin(t1,
				bracket(t1.ship_alloc_sts_no.eq(t.ship_alloc_sts_no)
						.and(t1.can_flg.eq(value(false)))));
		shipActL2_bldr.addLeftOuterJoin(t2,
				bracket(t2.ship_act_d_no.eq(t1.ship_act_d_no)));
		shipActL2_bldr
				.addLeftOuterJoin(
						subQuery()
								.select(S1W1.iv_ship_act_d_no, 
										S1W2.sls_act_io_no,
										S1W2.base_unit_qty)
								.from(S1W.innerJoin(S1W0)
										.on(bracket(S1W0.ship_alloc_sts_no.eq(S1W.ship_alloc_sts_no)
												.and(S1W0.can_flg.eq(value(false)))))
										.innerJoin(S1W1)
										.on(bracket(S1W1.ship_act_d_no.eq(S1W0.ship_act_d_no)))
										.innerJoin(S1W2)
										.on(bracket(S1W2.iv_ship_act_d_no.eq(S1W1.iv_ship_act_d_no)))
										.innerJoin(S1W3)
										.on(bracket(S1W3.sls_act_d_no.eq(S1W2.sls_act_d_no)
												.and(S1W3.sls_act_d_seq.eq(S1W2.sls_act_d_seq))))
										.innerJoin(S1W4)
										.on(bracket(S1W4.sls_act_no.eq(S1W3.sls_act_no)
												.and(S1W4.sls_act_seq.eq(S1W3.sls_act_seq))
												.and(S1W4.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))))))
								.view(t3),
						bracket(t3.pr(S1W1.iv_ship_act_d_no).eq(t2.iv_ship_act_d_no)));
		dbSelect("MSBEL5500_MST_SHIP_ALLOC_STS_S06", _shipActL2, shipActL2_bldr);
		_shipActL2Key = _shipActL2.createIndex(MST_SHIP_ALLOC_STS_R.$ship_alloc_sts_no);
	}
	protected MCList<MST_SHIP_ALLOC_STS_R> getShipActL2(String allocStsNo) {
		return _shipActL2.subList(_shipActL2Key, allocStsNo);
	}

	/**
	 * インボイス出荷実績明細のキャッシュ<br>
	 * チェック処理では使用しないので、リクエストオブジェクトは利用しない<br>
	 * 受払予定作成時に利用する
	 */
	protected MCList<MST_IV_SHIP_ACT_D_R> _cacheIvActL = null;
	protected MCIndexKey _cacheIvActKey = null;
	protected void doIvActCache(MCList<ShipPr_DtlR> prL) {
		_cacheIvActL = MCList.create(MST_IV_SHIP_ACT_D_R.class);
		MST_IV_SHIP_ACT_D_R t = MST_IV_SHIP_ACT_D_R.create("T");
		MCQueryApiBuilder cacheIvActL_bldr = MCQueryApiBuilder.create(t);
		MST_IV_D_R t1 = MST_IV_D_R.create("T1");
		MST_IV_MAP_R t2 = MST_IV_MAP_R.create("T2");
		MST_IV_R t3 = MST_IV_R.create("T3");
		MST_SHIP_SCHD_R t4 = MST_SHIP_SCHD_R.create("T4");
		MSW_SHIP_SCHD_KEY_R w = MSW_SHIP_SCHD_KEY_R.create("W");
		MCList<MST_SHIP_SCHD_R> wkL = MCList.create(MST_SHIP_SCHD_R.class);
		for (ShipPr_DtlR prR : prL) {
			MST_SHIP_SCHD_R wkR = MST_SHIP_SCHD_R.create();
			if (isNull(prR.ship_schd_no())) {
				continue;
			}
			wkR.ship_schd_no(prR.ship_schd_no());
			wkL.add(wkR);
		}
		MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_SHIP_SCHD_R.create("T"));
		dbWkDelete("MSBEL5500_MSW_SHIP_SCHD_D01", wkL_bldr.getBaseDbc());
		dbWkInsert("MSBEL5500_MSW_SHIP_SCHD_I01", wkL, wkL_bldr.getBaseDbc());
		_cacheIvActL.addBooleanColumn("sno1_null_flg");
		_cacheIvActL.addBooleanColumn("sno2_null_flg");
		_cacheIvActL.addBooleanColumn("sno3_null_flg");
		_cacheIvActL.addBooleanColumn("sno4_null_flg");
		cacheIvActL_bldr.setSelectAll();
		cacheIvActL_bldr.addSelect(t3.iv_no, t1.iv_d_no, t4.ship_schd_no,
				t1.trd_unit_cd.as("ent_unit_cd"), t4.ver_no, t4.sno1_null_flg,
				t4.sno2_null_flg, t4.sno3_null_flg, t4.sno4_null_flg, t3.cmpl_schd_dt,
				t3.trd_schd_dt, t3.cmpl_dt, t2.base_unit_qty.as("iv_qty"));
		cacheIvActL_bldr.addInnerJoin(t1, bracket(t1.iv_d_no.eq(t.iv_d_no)));
		cacheIvActL_bldr.addInnerJoin(t2, bracket(t2.iv_d_no.eq(t1.iv_d_no)));
		cacheIvActL_bldr.addInnerJoin(w, bracket(w.ship_schd_no.eq(t2.ship_schd_no)));
		cacheIvActL_bldr.addInnerJoin(t3, bracket(t3.iv_mng_no.eq(t1.iv_mng_no)));
		cacheIvActL_bldr.addInnerJoin(t4, bracket(t4.ship_schd_no.eq(t2.ship_schd_no)));
		dbSelect("MSBEL5500_MST_IV_SHIP_ACT_D_S01", _cacheIvActL, cacheIvActL_bldr);
		_cacheIvActKey = _cacheIvActL.createIndex(MST_SHIP_ALLOC_STS_R.$ship_schd_no);
	}
	protected MCList<MST_SHIP_ALLOC_STS_R> getIvActL(String shipSchdNo) {
		MCList<MST_SHIP_ALLOC_STS_R> retL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
		setAll(retL, _cacheIvActL.subList(_cacheIvActKey, shipSchdNo), createMap_MST_SHIP_ALLOC_STS_R_MST_IV_SHIP_ACT_D_R());
		return retL;
	}
	protected Map_MST_SHIP_ALLOC_STS_R_MST_IV_SHIP_ACT_D_R<MST_SHIP_ALLOC_STS_R,MST_IV_SHIP_ACT_D_R> createMap_MST_SHIP_ALLOC_STS_R_MST_IV_SHIP_ACT_D_R() {
		return new Map_MST_SHIP_ALLOC_STS_R_MST_IV_SHIP_ACT_D_R<MST_SHIP_ALLOC_STS_R, MST_IV_SHIP_ACT_D_R>();
	}
	public class Map_MST_SHIP_ALLOC_STS_R_MST_IV_SHIP_ACT_D_R<D extends MST_SHIP_ALLOC_STS_R, S extends MST_IV_SHIP_ACT_D_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_SHIP_ALLOC_STS_R.$ship_loc_cd, MST_IV_SHIP_ACT_D_R.$ship_loc_cd);
			addColumnPathMap(MST_SHIP_ALLOC_STS_R.$ship_str_ln_cd, MST_IV_SHIP_ACT_D_R.$ship_str_ln_cd);
			addColumnPathMap(MST_SHIP_ALLOC_STS_R.$stk_arrv_bp_cd, MST_IV_SHIP_ACT_D_R.$stk_arrv_bp_cd);
			addColumnPathMap(MST_SHIP_ALLOC_STS_R.$lot_no, MST_IV_SHIP_ACT_D_R.$lot_no);
			addColumnPathMap(MST_SHIP_ALLOC_STS_R.$sublot_no, MST_IV_SHIP_ACT_D_R.$sublot_no);
			addColumnPathMap(MST_SHIP_ALLOC_STS_R.$sno1, MST_IV_SHIP_ACT_D_R.$sno1);
			addColumnPathMap(MST_SHIP_ALLOC_STS_R.$sno2, MST_IV_SHIP_ACT_D_R.$sno2);
			addColumnPathMap(MST_SHIP_ALLOC_STS_R.$sno3, MST_IV_SHIP_ACT_D_R.$sno3);
			addColumnPathMap(MST_SHIP_ALLOC_STS_R.$sno4, MST_IV_SHIP_ACT_D_R.$sno4);
			addColumnPathMap(MST_SHIP_ALLOC_STS_R.$gd_cd, MST_IV_SHIP_ACT_D_R.$gd_cd);
			addColumnPathMap(MST_SHIP_ALLOC_STS_R.$quality_typ, MST_IV_SHIP_ACT_D_R.$quality_typ);
			addColumnPathMap(MST_SHIP_ALLOC_STS_R.$stk_insp_typ, MST_IV_SHIP_ACT_D_R.$stk_insp_typ);
			addColumnPathMap(MST_SHIP_ALLOC_STS_R.$stk_id_typ, MST_IV_SHIP_ACT_D_R.$stk_id_typ);
			addColumnPathMap(MST_SHIP_ALLOC_STS_R.$stk_bp_cd, MST_IV_SHIP_ACT_D_R.$stk_bp_cd);
			addColumnPathMap(MST_SHIP_ALLOC_STS_R.$trd_unit_qty, MST_IV_SHIP_ACT_D_R.$trd_unit_qty);
			addColumnPathMap(MST_SHIP_ALLOC_STS_R.$trd_unit_cd, MST_IV_SHIP_ACT_D_R.$trd_unit_cd);
			addColumnPathMap(MST_SHIP_ALLOC_STS_R.$base_unit_qty, MST_IV_SHIP_ACT_D_R.$base_unit_qty);
			addColumnPathMap(MST_SHIP_ALLOC_STS_R.$base_unit_cd, MST_IV_SHIP_ACT_D_R.$base_unit_cd);
			addColumnPathMap(MST_SHIP_ALLOC_STS_R.$io_schd_pr_no, MST_IV_SHIP_ACT_D_R.$io_schd_pr_no);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.setStringNE("ship_schd_no", src.getString("ship_schd_no"));
			dest.setStringNE("ship_act_d_no", src.ship_act_d_no());
			dest.setStringNE("iv_ship_act_d_no", src.iv_ship_act_d_no());
			dest.setStringNE("iv_no", src.iv_no());
			dest.setStringNE("iv_d_no", src.iv_d_no());
			dest.setDateNE("cmpl_schd_dt", src.getDate("cmpl_schd_dt"));
			dest.setDateNE("trd_schd_dt", src.getDate("trd_schd_dt"));
			dest.setDateNE("ship_tm", src.getDate("trd_schd_dt"));
			dest.setDateNE("cmpl_dt", src.getDate("cmpl_dt"));
			dest.setStringNE("ver_no", src.getString("ver_no"));
			dest.setStringNE("ent_unit_cd", src.getString("ent_unit_cd"));
			dest.setBooleanNE("sno1_null_flg", src.getBoolean("sno1_null_flg"));
			dest.setBooleanNE("sno2_null_flg", src.getBoolean("sno2_null_flg"));
			dest.setBooleanNE("sno3_null_flg", src.getBoolean("sno3_null_flg"));
			dest.setBooleanNE("sno4_null_flg", src.getBoolean("sno4_null_flg"));
			dest.setNumberNE("iv_qty", src.getNumber("iv_qty"));
			dest.ship_act_qty(src.trd_unit_qty());
		}
	}

	/**
	 * 品目マスタのキャッシュ
	 */
	protected FXUCL_MCDbcCache<MAM_ITM_R> _cacheItmL = null;
	protected void doItmCache(MCList<ShipPr_DtlR> dtlL) {

		MCList<MAM_ITM_R> cndL = MCList.create(MAM_ITM_R.class);
		for (ShipPr_DtlR r : dtlL) {
			MAM_ITM_R cndR = cndL.add();
			cndR.itm_cd(r.itm_cd());
			cndR.itm_sub1(r.itm_sub1());
			cndR.itm_sub2(r.itm_sub2());
			cndR.itm_sub3(r.itm_sub3());
		}

		MCList<MAM_ITM_R> dbc = MCList.create(MAM_ITM_R.class);
		MAM_ITM_R t = MAM_ITM_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(
				t.itm_cd,
				t.itm_sub1,
				t.itm_sub2,
				t.itm_sub3,
				t.stk_mng_typ,
				t.lot_mng_typ,
				t.sublot_mng_typ,
				t.pack_alloc_flg,
				t.ship_term_cd,
				t.dec_place,
				t.rnd_typ,
				t.ship_inst_typ
		);

		if (object(CLAZZ)._cacheItmL == null) {
			object(CLAZZ)._cacheItmL
				= new FXUCL_MCDbcCache<MAM_ITM_R>(dbc, dbc_bldr, -1, cndL,
							MAM_ITM_R.$itm_cd, MAM_ITM_R.$itm_sub1,
							MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
		}
		else {
			cndL = cndL.subList(
				r -> isNull(object(CLAZZ)._cacheItmL.getCache(
						r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()))
			);
			if (!cndL.isEmpty()) {
				dbSelectKey("MSBEL5500_MAM_ITM_S01", dbc, dbc_bldr, cndL);
				dbc.forEach(r -> {
					object(CLAZZ)._cacheItmL.putCache(
						r.toArray(
							MAM_ITM_R.$itm_cd, MAM_ITM_R.$itm_sub1,
							MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3
						), r);
				});
			}
		}
	}
	protected MAM_ITM_R getItmR(ShipPr_DtlR r) {
		return object(CLAZZ)._cacheItmL.get(
			r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
	}

	/**
	 * 取引先マスタ（納品先識別、送付先識別、得意先）のキャッシュ
	 */
	protected FXUCL_MCDbcCache<MAM_BP_R> _cacheBpL = null;
	protected void doBpCache(MCList<ShipPr_DtlR> dtlL) {

		MCList<MAM_BP_R> cndL = MCList.create(MAM_BP_R.class);
		for (ShipPr_DtlR r : dtlL) {
			if (!isNull(r.cst_cd())) {
				cndL.add().bp_cd(r.cst_cd());
			}
			if (!MSC_SHIP_TO_ID_TYP.isLOC(r.ship_to_id_typ())) {
				cndL.add().bp_cd(r.ship_to_id_cd());
			}
			if (!MSC_DLV_ID_TYP.isLOC(r	.dlv_id_typ())) {
				cndL.add().bp_cd(r.dlv_id_cd());
			}
		}

		MCList<MAM_BP_R> dbc = MCList.create(MAM_BP_R.class);
		MAM_BP_R t = MAM_BP_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(
				t.bp_cd,
				t.cst_iv_flg,
				t.dlv_cal_cd,
				t.prov_rcv_typ,
				t.prov_basis_typ,
				t.lg_grp_cd
		);

		if (object(CLAZZ)._cacheBpL == null) {
			object(CLAZZ)._cacheBpL = new FXUCL_MCDbcCache<MAM_BP_R>(dbc, dbc_bldr, -1, cndL, MAM_BP_R.$bp_cd);
		}
		else {
			cndL = cndL.subList(
				r -> !isNullOrNullVal(r.bp_cd()) 
						&& isNull(object(CLAZZ)._cacheBpL.getCache(r.bp_cd()))
			);
			if (!cndL.isEmpty()) {
				dbSelectKey("MSBEL5500_MAM_BP_S01", dbc, dbc_bldr, cndL);
				dbc.forEach(r -> {
					object(CLAZZ)._cacheBpL.putCache(
						r.toArray(	MAM_BP_R.$bp_cd), r);
				});
			}
		}
	}
	protected MAM_BP_R getBpR(String bpCd) {
		return object(CLAZZ)._cacheBpL.get(bpCd);
	}

	/**
	 * 物流制御マスタのキャッシュ
	 */
	protected FXUCL_MCDbcCache<MAM_LG_CTL_R> _cacheLgCtlL = null;
	protected void doLgCtlCache(MCList<ShipPr_DtlR> dtlL) {

		MCList<MAM_LG_CTL_R> cndL = MCList.create(MAM_LG_CTL_R.class);
		for (ShipPr_DtlR r : dtlL) {
			MAM_LG_CTL_R cndR = cndL.add();
			cndR.fr_lg_grp_cd(r.ship_fr_lg_grp_cd());
			cndR.to_lg_grp_cd(r.ship_to_lg_grp_cd());
			cndR.ship_term_cd(
				nvl(nvl(r.ss().ship_term_cd(), r.sp().ship_term_cd()), MAC_STR.NULL_VAL.value()));
			if (!MAC_STR.isNULL_VAL(cndR.ship_term_cd())) {
				cndR = cndR.clone();
				cndR.ship_term_cd(MAC_STR.NULL_VAL.value());
				cndL.add(cndR);
			}

			cndR = cndL.add();
			cndR.fr_lg_grp_cd(r.ship_fr_lg_grp_cd());
			cndR.to_lg_grp_cd(MSC_DLV_ID_TYP.isLOC(r.dlv_id_typ()) ?
				getLocR(r.dlv_id_cd()).lg_grp_cd() : getBpR(r.dlv_id_cd()).lg_grp_cd());
			cndR.ship_term_cd(
				nvl(nvl(r.ss().ship_term_cd(), r.sp().ship_term_cd()), MAC_STR.NULL_VAL.value()));
			if (!MAC_STR.isNULL_VAL(cndR.ship_term_cd())) {
				cndR = cndR.clone();
				cndR.ship_term_cd(MAC_STR.NULL_VAL.value());
				cndL.add(cndR);
			}
		}

		MCList<MAM_LG_CTL_R> dbc = MCList.create(MAM_LG_CTL_R.class);
		MAM_LG_CTL_R t = MAM_LG_CTL_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(
				t.fr_lg_grp_cd,
				t.to_lg_grp_cd,
				t.ship_term_cd,
				t.iv_trd_flg,
				t.xfr_lt
		);

		if (object(CLAZZ)._cacheLgCtlL == null) {
			object(CLAZZ)._cacheLgCtlL
				= new FXUCL_MCDbcCache<MAM_LG_CTL_R>(dbc, dbc_bldr, -1, cndL, 
							MAM_LG_CTL_R.$fr_lg_grp_cd, MAM_LG_CTL_R.$to_lg_grp_cd,
							MAM_LG_CTL_R.$ship_term_cd);
		}
		else {
			cndL = cndL.subList(
				r -> isNull(object(CLAZZ)._cacheLgCtlL.getCache(
					r.fr_lg_grp_cd(), r.to_lg_grp_cd(), r.ship_term_cd()))
			);
			if (!cndL.isEmpty()) {
				dbSelectKey("MSBEL5500_MAM_LG_CTL_S01", dbc, dbc_bldr, cndL);
				dbc.forEach(r -> {
					object(CLAZZ)._cacheLgCtlL.putCache(
						r.toArray(
							MAM_LG_CTL_R.$fr_lg_grp_cd, MAM_LG_CTL_R.$to_lg_grp_cd,
							MAM_LG_CTL_R.$ship_term_cd
						), r);
				});
			}
		}
	}
	protected MAM_LG_CTL_R getLgCtlR(String frCd, String toCd, String termCd) {
		MAM_LG_CTL_R
			lgCtlR = object(CLAZZ)._cacheLgCtlL.get(frCd, toCd, termCd);
		if (isNull(lgCtlR) || lgCtlR.isEmpty()) {
			lgCtlR = object(CLAZZ)._cacheLgCtlL.get(
				frCd, toCd, MAC_STR.NULL_VAL.value());
		}
		return lgCtlR;
	}

	/**
	 * 品目単位マスタのキャッシュ
	 */
	protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _cacheItmUnitL = null;
	protected void doItmUnitCache(MCList<ShipPr_DtlR> dtlL) {

		MCList<MAVM_ITM_UNIT_R> cndL = MCList.create(MAVM_ITM_UNIT_R.class);
		for (ShipPr_DtlR r : dtlL) {
			MAVM_ITM_UNIT_R cndR = cndL.add();
			cndR.itm_cd(r.itm_cd());
			cndR.itm_sub1(r.itm_sub1());
			cndR.itm_sub2(r.itm_sub2());
			cndR.itm_sub3(r.itm_sub3());
			cndR.unit_cd(r.trd_unit_cd());
		}

		MCList<MAVM_ITM_UNIT_R> dbc = MCList.create(MAVM_ITM_UNIT_R.class);
		MAVM_ITM_UNIT_R t = MAVM_ITM_UNIT_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(
				t.itm_cd,
				t.itm_sub1,
				t.itm_sub2, t.itm_sub3,
				t.unit_cd,
				t.conv_base_qty,
				t.conv_qty,
				t.dec_place,
				t.rnd_typ,
				t.pack_flg
		);

		if (object(CLAZZ)._cacheItmUnitL == null) {
			object(CLAZZ)._cacheItmUnitL
				= new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(dbc, dbc_bldr, -1, cndL, 
							MAVM_ITM_UNIT_R.$itm_cd, MAVM_ITM_UNIT_R.$itm_sub1,
							MAVM_ITM_UNIT_R.$itm_sub2, MAVM_ITM_UNIT_R.$itm_sub3,
							MAVM_ITM_UNIT_R.$unit_cd);
		}
		else {
			cndL = cndL.subList(
				r -> isNull(object(CLAZZ)._cacheItmUnitL.getCache(
						r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.unit_cd()))
			);
			if (!cndL.isEmpty()) {
				dbSelectKey("MSBEL5500_MAVM_ITM_UNIT_S01", dbc, dbc_bldr, cndL);
				dbc.forEach(r -> {
					object(CLAZZ)._cacheItmUnitL.putCache(
						r.toArray(
							MAVM_ITM_UNIT_R.$itm_cd, MAVM_ITM_UNIT_R.$itm_sub1,
							MAVM_ITM_UNIT_R.$itm_sub2, MAVM_ITM_UNIT_R.$itm_sub3,
							MAVM_ITM_UNIT_R.$unit_cd
						), r);
				});
			}
		}
	}
	protected MAVM_ITM_UNIT_R getItmUnitR(ShipPr_DtlR r, String unitCd) {
		return object(CLAZZ)._cacheItmUnitL.get(
			r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), unitCd);
	}

	/**
	 * 場所マスタのキャッシュ
	 */
	protected FXUCL_MCDbcCache<MAM_LOC_R> _cacheLocL = null;
	protected void doLocCache(MCList<ShipPr_DtlR> dtlL, MCList<Alloc_RsltR> rsltL) {

		MCList<MAM_LOC_R> cndL = MCList.create(MAM_LOC_R.class);
		for (ShipPr_DtlR r : dtlL) {
			if (MSC_SHIP_TO_ID_TYP.isLOC(r.ship_to_id_typ())) {
				cndL.add().loc_cd(r.ship_to_id_cd());
			}
			if (MSC_DLV_ID_TYP.isLOC(r.dlv_id_typ())) {
				cndL.add().loc_cd(r.dlv_id_cd());
			}
			if (!isNull(r.def_loc_cd())) {
				cndL.add().loc_cd(r.def_loc_cd());
			}
			if (!isNull(r.loc_cd())) {
				cndL.add().loc_cd(r.loc_cd());
			}
		}
		if (!isNull(rsltL)) {
			for (Alloc_RsltR r : rsltL) {
				cndL.add().loc_cd(r.stk_loc_cd());
			}
		}

		MCList<MAM_LOC_R> dbc = MCList.create(MAM_LOC_R.class);
		MAM_LOC_R t = MAM_LOC_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(
				t.loc_cd,
				t.lg_grp_cd,
				t.cal_cd,
				t.sppl_cd,
				t.wg_cd
		);

		if (object(CLAZZ)._cacheLocL == null) {
			object(CLAZZ)._cacheLocL
				= new FXUCL_MCDbcCache<MAM_LOC_R>(dbc, dbc_bldr, -1, cndL, MAM_LOC_R.$loc_cd);
		}
		else {
			cndL = cndL.subList(
				r -> isNull(object(CLAZZ)._cacheLocL.getCache(r.loc_cd()))
			);
			if (!cndL.isEmpty()) {
				dbSelectKey("MSBEL5500_MAM_LOC_S01", dbc, dbc_bldr, cndL);
				dbc.forEach(r -> {
					object(CLAZZ)._cacheLocL.putCache(
						r.toArray(	MAM_LOC_R.$loc_cd), r);
				});
			}
		}
 	}
	protected MAM_LOC_R getLocR(String locCd) {
		return object(CLAZZ)._cacheLocL.get(locCd);
	}
	protected FXUCL_MCDbcCacheCW<MAM_LOC_R> _locL = null;
	protected MAM_LOC_R getLocNoDefR(String lgGrpCd, String allocGrpCd) {
		if (object(CLAZZ)._locL == null) {
			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.addMin(t.loc_cd, MAM_LOC_R.$loc_cd);
			dbc_bldr.addWhereWithAnd(t.lg_grp_cd.eq(bind("b1")));
			dbc_bldr.addWhereWithAnd(t.alloc_grp_cd.eq(bind("b2")));
			dbc_bldr.addWhereWithAnd(t.sppl_cd.isNull());
			object(CLAZZ)._locL = new FXUCL_MCDbcCacheCW<MAM_LOC_R>(dbc_bldr);
		}
		return object(CLAZZ)._locL.get(lgGrpCd, allocGrpCd);
	}

	/**
	 * 物流グループマスタのキャッシュ
	 */
	protected FXUCL_MCDbcCache<MAM_LG_GRP_R> _cacheLgGrpL = null;
	protected void doLgGrpCache(MCList<ShipPr_DtlR> dtlL) {

		MCList<MAM_LG_GRP_R> cndL = MCList.create(MAM_LG_GRP_R.class);
		for (ShipPr_DtlR r : dtlL) {
			cndL.add().lg_grp_cd(r.ship_fr_lg_grp_cd());
			cndL.add().lg_grp_cd(r.ship_to_lg_grp_cd());
		}

		MCList<MAM_LG_GRP_R> dbc = MCList.create(MAM_LG_GRP_R.class);
		MAM_LG_GRP_R t = MAM_LG_GRP_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		MAM_LOC_R t1 = MAM_LOC_R.create("T1");
		dbc.addStringColumn("loc_cd");
		dbc_bldr.setSelect(
				t.lg_grp_cd,
				t.wg_cd,
				t.cal_cd
		);
		dbc_bldr.addSelect(
				t1.loc_cd,
				t1.alloc_grp_cd
		);
		dbc_bldr.addLeftOuterJoin(t1,
				bracket(t1.lg_grp_cd.eq(t.lg_grp_cd)
						.and(t1.lg_def_flg.eq(value(true)))));

		if (object(CLAZZ)._cacheLgGrpL == null) {
			object(CLAZZ)._cacheLgGrpL
				= new FXUCL_MCDbcCache<MAM_LG_GRP_R>(dbc, dbc_bldr, -1, cndL, MAM_LG_GRP_R.$lg_grp_cd);
		}
		else {
			cndL = cndL.subList(
				r -> isNull(object(CLAZZ)._cacheLgGrpL.getCache(r.lg_grp_cd()))
			);
			if (!cndL.isEmpty()) {
				dbSelectKey("MSBEL5500_MAM_LG_GRP_S01", dbc, dbc_bldr, cndL);
				dbc.forEach(r -> {
					object(CLAZZ)._cacheLgGrpL.putCache(
						r.toArray(	MAM_LG_GRP_R.$lg_grp_cd), r);
				});
			}
		}
	}
	protected MAM_LG_GRP_R getLgGrpR(String lgGrpCd) {
		return object(CLAZZ)._cacheLgGrpL.get(lgGrpCd);
	}
	protected MAM_LG_GRP_R setLgGrpR(MAM_ITM_LG_GRP_R itmLgGrpR) {
		MAM_LG_GRP_R lgGrpR = MAM_LG_GRP_R.create();
		lgGrpR.addStringColumn("loc_cd");
		lgGrpR.addStringColumn("alloc_grp_cd");
		
		lgGrpR.lg_grp_cd(itmLgGrpR.getStringNE("lg_grp_cd"));
		lgGrpR.wg_cd(itmLgGrpR.getStringNE("wg_cd"));
		lgGrpR.cal_cd(itmLgGrpR.getStringNE("cal_cd"));
		lgGrpR.setStringNE("loc_cd", itmLgGrpR.lg_def_loc_cd());
		lgGrpR.setStringNE("alloc_grp_cd", itmLgGrpR.getStringNE("alloc_grp_cd"));
		
		return lgGrpR;
	}
	
	
	/**
	 * 品目マスタ（物流Ｇ）のキャッシュ
	 */
	protected FXUCL_MCDbcCache<MAM_ITM_LG_GRP_R> _itmLgGrpCache = null;
	protected static void doItmLgGrpCache(MCList<ShipPr_DtlR> dtlL) {
		object(CLAZZ)._doItmLgGrpCache(dtlL);
	}	
	protected void _doItmLgGrpCache(MCList<ShipPr_DtlR> dtlL) {

		MCList<MAM_ITM_LG_GRP_R> dbcL = MCList.create(MAM_ITM_LG_GRP_R.class);
		MAM_ITM_LG_GRP_R t = MAM_ITM_LG_GRP_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		MAM_LG_GRP_R m1 = MAM_LG_GRP_R.create("M1");
		MAM_LOC_R m2 = MAM_LOC_R.create("M2");
		dbcL.addStringColumn("wg_cd");
		dbcL.addStringColumn("cal_cd");
		dbcL.addStringColumn("alloc_grp_cd");

		dbcL_bldr.setSelect(t.lg_def_loc_cd);
		dbcL_bldr.addSelect(m1.lg_grp_cd);
		dbcL_bldr.addSelect(m1.wg_cd);
		dbcL_bldr.addSelect(m1.cal_cd);
		dbcL_bldr.addSelect(m2.alloc_grp_cd);

		dbcL_bldr.addLeftOuterJoin(m1, bracket(m1.lg_grp_cd.eq(t.lg_grp_cd)));
		dbcL_bldr.addLeftOuterJoin(m2, bracket(m2.loc_cd.eq(t.lg_def_loc_cd)));

		_itmLgGrpCache = new FXUCL_MCDbcCache<MAM_ITM_LG_GRP_R>(dbcL, dbcL_bldr, dtlL,
				ShipPr_DtlR.$itm_cd, ShipPr_DtlR.$itm_sub1, ShipPr_DtlR.$itm_sub2,
				ShipPr_DtlR.$itm_sub3, ShipPr_DtlR.$ship_fr_lg_grp_cd);
	}
	protected static FXUCL_MCDbcCache<MAM_ITM_LG_GRP_R> itmLgGrpCache() {
		return object(CLAZZ)._itmLgGrpCache;
	}

	/**
	 * 取引マスタ(出荷のみ)のキャッシュ
	 */
	protected MAM_TRD_R _shipTrdR = null;
	protected MAM_TRD_R getShipTrdR() {
		if (object(CLAZZ)._shipTrdR == null) {
			MCList<MAM_TRD_R> dbc = MCList.create(MAM_TRD_R.class);
			MAM_TRD_R t = MAM_TRD_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelectAll();
			dbc_bldr.setWhere(t.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value())));
			dbc_bldr.addWhereWithAnd(t.auto_adopt_flg.eq(value(true)));
			if (dbSelect("MSBEL5500_MAM_TRD_S01", dbc, dbc_bldr) > 0) {
				object(CLAZZ)._shipTrdR = dbc.get(0).clone();
			}
		}
		return object(CLAZZ)._shipTrdR;
	}
	/**
	 * ShipSchd_Upd08オペレーション.<p>
	 *
	 * 売上明細訂正画面で預り売上を訂正した場合、売上実績明細ＮＯを出荷予定に反映する。<br>
	 */
	public class ShipSchd_Upd08 extends MSBEL_ShipSchdService_MC_A.ShipSchd_Upd08 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			
			MST_SHIP_SCHD_R dbc = MST_SHIP_SCHD_R.create("T");
			execDbUpdateKey("MSBEL5500_MST_SHIP_SCHD_U03", dbc, up0().innerRowList("ss"), dbc.sls_act_d_no);
		}
	}

	//FMCB CUSTOM END
}