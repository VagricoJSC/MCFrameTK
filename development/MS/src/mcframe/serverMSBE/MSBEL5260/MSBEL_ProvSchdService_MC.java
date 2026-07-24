package mcframe.serverMSBE.MSBEL5260;

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
import mcframe.serverMSBE.MSBEL5260.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import static mcframe.serverCore.requester.MCRequestObject.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_ProvSchdService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_ProvSchdService_MC extends MSBEL_ProvSchdService_MC_A{
	//FMCB CUSTOM START

	/**
	 * ProvSchd_Chk01オペレーション.<p>
	 *
	 * 支給予定のマスタ補完が可能かチェックする<br>
	 */
	public class ProvSchd_Chk01 extends MSBEL_ProvSchdService_MC_A.ProvSchd_Chk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			MCList<ProvSchd_DtlR> notDelL = up0()
					.subList(r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));

			initCacheAndCompl(notDelL);
			doCheck(notDelL.subList(r -> isUpdateR(r)));
			setDown();
		}

		protected void initCacheAndCompl(MCList<ProvSchd_DtlR> notDelL) {
			initBpCache(notDelL);
			// 取引先(支給先)の存在チェック
			notDelL.setAll(chkBpCache(notDelL));
			notDelL.forEach(r -> setTrdCurCd(r));

			initBaseRateCache(notDelL);
			initPtaxRateCache(notDelL);

			initTaxCdCache(notDelL);
			initTaxCache(notDelL);
			initCurCache(notDelL);
			initWtaxCache(notDelL);
			initTrdCdCache(notDelL);

			initProvUpriCache(notDelL);
			notDelL.forEach(r -> setProvTypProvBasisTyp(r));
		}

		protected void doCheck(MCList<ProvSchd_DtlR> chkL) {
			MCMessagePool.addAll(chkSubcon(chkL));
			MCMessagePool.addAll(chkProvUpri(chkL));
			MCMessagePool.addAll(chkTax(chkL));
			MCMessagePool.addAll(chkXrate(chkL));
			MCMessagePool.addAll(chkTrdCd(chkL));
		}

		protected void setDown() {
			down0().setAll(up0());
		}

		protected MCMessageList chkSubcon(MCList<ProvSchd_DtlR> upL) {
			MCMessageList msgL = new MCMessageList();
			for(ProvSchd_DtlR upR : upL) {
				// 下請への有償支給の場合、出荷基準は不可
				if (MAC_PROV_TYP.isONR_PROV(upR.prov_typ())
						&& MAC_TRD_PTN_TYP.isPROV(upR.trd_ptn_typ())
						&& MAC_PROV_BASIS_TYP.isGI(upR.prov_basis_typ())
						&& getBpCache().getEx(upR.prsppl_cd()).subcon_flg()) {
					// 投入と同時に支給実績が発生する場合は可とする（使用基準の在庫を投入する場合や投入場所が社内の場合）
					if (!upR.inpt_flg()) {
						msgL.add(new MCMessage(upR, ProvSchd_DtlR.$prov_basis_typ, MSBEL0253, upR.prsppl_cd(), toDispGUIIndex(upR)));
						upR.err_flg(true);
					}
				}
			}
			return msgL;
		}

		protected MCMessageList chkProvUpri(MCList<ProvSchd_DtlR> upL) {
			MCMessageList msgL = new MCMessageList();
			for(ProvSchd_DtlR upR : upL) {
				if(MAC_PROV_TYP.isONR_PROV(upR.prov_typ()) && !provUpriExists(upR)) {
					msgL.add(new MCMessage(upR, ProvSchd_DtlR.$trd_cur_upri, MSBEL0209,
							upR.itm_cd(),
							upR.prsppl_cd(),
							upR.trd_cur_cd(),
							upR.wg_cd(),
							toYMDString(upR.accpt_schd_dt()),
							toDispGUIIndex(upR)));
					upR.err_flg(true);
				}
			}
			return msgL;
		}

		protected MCMessageList chkTax(MCList<ProvSchd_DtlR> upL) {
			MCMessageList msgL = new MCMessageList();
			for(ProvSchd_DtlR upR : upL) {
				if (MAC_PROV_TYP.isONR_PROV(upR.prov_typ())) {
					if(isNull(upR.tax_cd()) && !provTaxCdExists(upR)) {
						msgL.add(new MCMessage(upR, ProvSchd_DtlR.$tax_cd, MSBEL0210,
								upR.itm_cd(),
								upR.prsppl_cd(),
								toYMDString(upR.accpt_schd_dt()),
								toDispGUIIndex(upR)));						
						upR.err_flg(true);
					}
				}
			}
			return msgL;
		}

		protected MCMessageList chkXrate(MCList<ProvSchd_DtlR> upL) {
			MCMessageList msgL = new MCMessageList();
			for(ProvSchd_DtlR upR : upL) {
				if (MAC_PROV_TYP.isONR_PROV(upR.prov_typ())) {
					if(isNull(upR.xrate())
							&& !isSame(upR.trd_cur_cd(), getCo().base_cur_cd())
							&& isNull(getBaseRateCache().get(upR.accpt_schd_dt(), upR.trd_cur_cd(), getCo().base_cur_cd(), getCo().prov_xrate_cd()).xrate())) {
						msgL.add(new MCMessage(upR, ProvSchd_DtlR.$xrate, MSBEL0078,
								upR.trd_cur_cd(),
								getCo().base_cur_cd(),
								toYMDString(upR.accpt_schd_dt()),
								toDispGUIIndex(upR)));
						upR.err_flg(true);
					}
					if(isNull(upR.ptax_xrate())
							&& !isNull(getCo().ptax_cur_cd())
							&& !isSame(upR.trd_cur_cd(), getCo().ptax_cur_cd())
							&& isNull(getPtaxRateCache().get(upR.accpt_schd_dt(), upR.trd_cur_cd(), getCo().ptax_cur_cd(), getCo().prov_xrate_cd()).xrate())) {
						msgL.add(new MCMessage(upR, ProvSchd_DtlR.$ptax_xrate, MSBEL0166,
								upR.trd_cur_cd(),
								getCo().ptax_cur_cd(),
								toYMDString(upR.accpt_schd_dt()),
								toDispGUIIndex(upR)));
						upR.err_flg(true);
					}
				}
			}
			return msgL;
		}

		protected MCMessageList chkTrdCd(MCList<ProvSchd_DtlR> upL) {
			MCMessageList msgL = new MCMessageList();
			for(ProvSchd_DtlR upR : upL) {
				if(isNull(upR.trd_cd()) && !isNull(upR.trd_ptn_typ())) {
					if (!trdCdExists(upR)) {
						msgL.add(new MCMessage(upR, ProvSchd_DtlR.$trd_cd, MSBEL0252,
								upR.trd_ptn_typ(),
								toDispGUIIndex(upR)));
						upR.err_flg(true);
					}
				}
			}
			return msgL;
		}

		/**
		 * 有償支給単価が存在するか
		 */
		protected boolean provUpriExists(ProvSchd_DtlR upR) {
			if(!isNull(upR.trd_cur_upri())) {
				return true;
			}
			if(!isNull(getProvUpriCache().get(
					upR.accpt_schd_dt(),
					upR.itm_cd(),
					upR.itm_sub1(),
					upR.itm_sub2(),
					upR.itm_sub3(),
					upR.prsppl_cd(),
					upR.trd_cur_cd(),
					upR.wg_cd()).upri())) {
				return true;
			}
			return false;
		}

		/**
		 * 支給税ＣＤが存在するか
		 */
		protected boolean provTaxCdExists(ProvSchd_DtlR upR) {
			return !isNull(getTaxCdCache().get(
					upR.itm_cd(),
					upR.itm_sub1(),
					upR.itm_sub2(),
					upR.itm_sub3(),
					upR.prsppl_cd(),
					upR.accpt_schd_dt()).tax_cd());
		}
		/**
		 * 取引マスタの自動時採用フラグがオンの取引ＣＤが存在するか
		 */
		protected boolean trdCdExists(ProvSchd_DtlR upR) {
			return !isNull(getTrdCdCache().getFirst(upR.trd_ptn_typ()));
		}
		
		/**
		 * 取引先(支給先)のキャッシュが存在するか
		 * @param chkTgtL チェック対象リスト
		 * @return chkOkList 取引先(支給先)がキャッシュに存在しているもののリスト
		 */
		protected MCList<ProvSchd_DtlR> chkBpCache(MCList<ProvSchd_DtlR> chkTgtL) {
			MCList<ProvSchd_DtlR> chkOkList = MCList.create(ProvSchd_DtlR.class);
			for (ProvSchd_DtlR chkTgtR : chkTgtL) {
				if (getBpCache().get(chkTgtR.prsppl_cd()).isEmpty()) {
					MCMessagePool.add(new MCMessage(chkTgtR, ProvSchd_DtlR.$prsppl_cd, MSBEL0281, toDispGUIIndex(chkTgtR)));
					chkTgtR.err_flg(true);
				}
				else {
					chkOkList.add(chkTgtR);
				}
			}
			return chkOkList;
		}
	}

	/**
	 * ProvSchd_Upd01オペレーション.<p>
	 *
	 * 支給予定にデータを登録する。支給予定のデータを更新削除する。<br>
	 */
	public class ProvSchd_Upd01 extends MSBEL_ProvSchdService_MC_A.ProvSchd_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			initCache();
			complUpdAndDel(up0());
			callThisSprt01(up0().subList(r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())));
			editDataCrudTyp(up0().subList(ProvSchd_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.UPD.value()));
			setProvSchdNumber(up0().subList(ProvSchd_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value()));
			provSchdUpd(up0().subList(r -> isUpdateR(r)));
			setDown();
		}

		/**
		 * 上り電文を編集する。
		 */
		protected void editUp() {
			setProvSrcSchdNumber();
			truncAccptSchdDt(up0());
		}

		/**
		 * 支給元区分ＮＯを補完する
		 */
		protected void setProvSrcSchdNumber() {
			for(ProvSchd_DtlR upR : up0().subList(ProvSchd_DtlR.$prov_schd_no, null)) {
				if(isNull(upR.prov_src_schd_no1())) {
					upR.prov_src_schd_no1(MAC_STR.NULL_VAL.value());
				}
				if(isNull(upR.prov_src_schd_no2())) {
					upR.prov_src_schd_no2(MAC_STR.NULL_VAL.value());
				}
			}
		}

		/**
		 * 更新処理固有のキャッシュを初期化する。
		 */
		protected void initCache() {
			initTrdCdCache(up0());
			initProvSchdCache(up0());
		}

		/**
		 * 更新、削除の場合対象のデータを支給予定のキャッシュから補完する
		 * ただし更新で支給予定のキャッシュに元データがないときはなにもしない。
		 * @param upL
		 */
		protected void complUpdAndDel(MCList<ProvSchd_DtlR> upL) {
			for(ProvSchd_DtlR r :upL) {
				if(MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					MST_PROV_SCHD_R provR = _provSchdCache.getFirst(r);
					if(!isNull(provR)) {
						copy(provR, r, createMap_MST_PROV_SCHD_R_ProvSchd_DtlR());
						r.ps(provR);
					}
				}
				else if(MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					r.ps(_provSchdCache.getFirst(r));
				}
			}
		}

		/**
		 * 更新行のデータ更新区分を変更する。
		 * @param updateL
		 */
		private void editDataCrudTyp(MCList<ProvSchd_DtlR> updateL) {
			for(ProvSchd_DtlR r : updateL) {
				if(isNull(r.prov_schd_no())) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				if(MAC_PROV_BASIS_TYP.isINPT(r.prov_basis_typ())) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
			}
		}

		/**
		 * 新規追加行に支給予定ＮＯを発番して設定する。
		 * @param crtL
		 */
		private void setProvSchdNumber(MCList<ProvSchd_DtlR> crtL) {
			doSeqCache(MSC_NUM_SYS_TYP.PROVSCHD, crtL.size());
			for(ProvSchd_DtlR r : crtL) {
				r.prov_schd_no(getStrSeq(MSC_NUM_SYS_TYP.PROVSCHD));
				if(isNull(r.trd_cd())) {
					r.trd_cd(getTrdCdCache().getFirst(r.trd_ptn_typ()).trd_cd());
				}
			}
		}

		protected void callThisSprt01(MCList<ProvSchd_DtlR> upL) {
			MSBEL_ProvSchdService.ProvSchd_Sprt01 op = MSBEL_ProvSchdService.crtProvSchd_Sprt01();
			op.up0().setAll(upL);
			op.exec();
			String [] cols = down0().getColumnPathArray();
			copyByPegNo(upL, cols, op.down0(), cols);
		}

		protected void provSchdUpd(MCList<ProvSchd_DtlR> upL) {
			MCList<MST_PROV_SCHD_R> dbcInsert = MCList.create(MST_PROV_SCHD_R.class);
			MCList<MST_PROV_SCHD_R> dbcUpdate = MCList.create(MST_PROV_SCHD_R.class);
			MCList<MST_PROV_SCHD_R> dbcDelete = MCList.create(MST_PROV_SCHD_R.class);
			
			for(ProvSchd_DtlR up : upL) {
				if (isSame(up.data_crud_typ(),MAC_DATA_CRUD_TYP.CRT.value())) {
					dbcInsert.add(up.ps());
				} else if (isSame(up.data_crud_typ(),MAC_DATA_CRUD_TYP.UPD.value())) {
					dbcUpdate.add(up.ps());
				} else if (isSame(up.data_crud_typ(),MAC_DATA_CRUD_TYP.DEL.value())) {
					dbcDelete.add(up.ps());
				}
			}

			MCQueryApiBuilder builder = MCQueryApiBuilder.create(MST_PROV_SCHD_R.create("T"));
			dbDeleteKey("MSBEL5260_MST_PROV_SCHD_D01", dbcDelete, builder);
			dbInsert("MSBEL5260_MST_PROV_SCHD_I01", dbcInsert, builder);
			dbUpdateKey("MSBEL5260_MST_PROV_SCHD_U01", dbcUpdate, builder);
		}

		protected void setDown() {
			down0().setAll(up0());
		}

		// 更新処理固有のキャッシュ
		protected ProvSchdCache _provSchdCache;

		// 支給予定トランのキャッシュ
		protected void initProvSchdCache(MCList<ProvSchd_DtlR> bindL) {
			_provSchdCache = new ProvSchdCache(bindL);
		}

		public class ProvSchdCache {
			MCList<MST_PROV_SCHD_R> _provSchdL = MCList.create(MST_PROV_SCHD_R.class);
			MST_PROV_SCHD_R t = MST_PROV_SCHD_R.create("T");
			MCQueryApiBuilder _provSchdL_bldr = MCQueryApiBuilder.create(t);
			MCIndexKey _provSchdIdx;
			MCIndexKey _provSrcIdx;
			protected ProvSchdCache(MCList<ProvSchd_DtlR> bindL) {
				_provSchdL_bldr.setSelectAll();
				_provSchdL_bldr.addWhereWithCutOffAnd(t.prov_schd_no.eq(bind("prov_schd_no")));
				_provSchdL_bldr.addWhereWithCutOffAnd(t.prov_src_schd_typ.eq(bind("prov_src_schd_typ")));
				_provSchdL_bldr.addWhereWithCutOffAnd(t.prov_src_schd_no1.eq(bind("prov_src_schd_no1")));
				_provSchdL_bldr.addWhereWithCutOffAnd(t.prov_src_schd_no2.eq(bind("prov_src_schd_no2")));
				_provSchdL_bldr.addWhereWithCutOffAnd(t.trd_ptn_typ.eq(bind("trd_ptn_typ")));
				dbSelect("MSBEL5260_MST_PROV_SCHD_S01", _provSchdL, _provSchdL_bldr, bindL.groupBy( ProvSchd_DtlR.$prov_schd_no, ProvSchd_DtlR.$prov_src_schd_typ, ProvSchd_DtlR.$prov_src_schd_no1, ProvSchd_DtlR.$prov_src_schd_no2, ProvSchd_DtlR.$trd_ptn_typ));

				_provSchdIdx = _provSchdL.createIndex(MST_PROV_SCHD_R.$prov_schd_no);
				_provSrcIdx = _provSchdL.createIndex(MST_PROV_SCHD_R.$prov_src_schd_typ, MST_PROV_SCHD_R.$prov_src_schd_no1, MST_PROV_SCHD_R.$prov_src_schd_no2, MST_PROV_SCHD_R.$trd_ptn_typ);
			}

			MST_PROV_SCHD_R getFirst(String prov_schd_no) {
				return _provSchdL.getFirst(_provSchdIdx, prov_schd_no);
			}
			MST_PROV_SCHD_R getFirst(String prov_src_schd_typ, String prov_src_schd_no1, String prov_src_schd_no2, String trd_ptn_typ) {
				return _provSchdL.getFirst(_provSrcIdx, prov_src_schd_typ, prov_src_schd_no1, prov_src_schd_no2, trd_ptn_typ);
			}

			MST_PROV_SCHD_R getFirst(ProvSchd_DtlR bindR) {
				if(isNull(bindR.prov_schd_no())) {
					return getFirst(bindR.prov_src_schd_typ(), bindR.prov_src_schd_no1(), bindR.prov_src_schd_no2(), bindR.trd_ptn_typ());
				}
				else {
					return getFirst(bindR.prov_schd_no());
				}
			}
		}

		protected Map_MST_PROV_SCHD_R_ProvSchd_DtlR<MST_PROV_SCHD_R,ProvSchd_DtlR> createMap_MST_PROV_SCHD_R_ProvSchd_DtlR() {
			return new Map_MST_PROV_SCHD_R_ProvSchd_DtlR<MST_PROV_SCHD_R, ProvSchd_DtlR>();
		}

		public class Map_MST_PROV_SCHD_R_ProvSchd_DtlR<D extends MST_PROV_SCHD_R, S extends ProvSchd_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				// 電文で上ってきたら更新する項目
				if(!isNull(src.base_unit_qty())) {
					dest.base_unit_qty(src.base_unit_qty());
				}
				if(!isNull(src.accpt_schd_dt())) {
					dest.accpt_schd_dt(src.accpt_schd_dt());
				}
				if(!isNull(src.prsppl_cd())) {
					dest.prsppl_cd(src.prsppl_cd());
				}
			}

			@Override
			protected void setupColumnPathMap() {
				// 常に電文の値で更新する項目
				addColumnPathMap(MST_PROV_SCHD_R.$xfr_rsn_cd, ProvSchd_DtlR.$xfr_rsn_cd);
				addColumnPathMap(MST_PROV_SCHD_R.$prov_typ, ProvSchd_DtlR.$prov_typ);
				addColumnPathMap(MST_PROV_SCHD_R.$prov_basis_typ, ProvSchd_DtlR.$prov_basis_typ);
				addColumnPathMap(MST_PROV_SCHD_R.$xrate_inpt_flg, ProvSchd_DtlR.$xrate_inpt_flg);
				addColumnPathMap(MST_PROV_SCHD_R.$xrate, ProvSchd_DtlR.$xrate);
				addColumnPathMap(MST_PROV_SCHD_R.$ptax_xrate_inpt_flg, ProvSchd_DtlR.$ptax_xrate_inpt_flg);
				addColumnPathMap(MST_PROV_SCHD_R.$ptax_xrate, ProvSchd_DtlR.$ptax_xrate);
				addColumnPathMap(MST_PROV_SCHD_R.$trd_cur_cd, ProvSchd_DtlR.$trd_cur_cd);
				addColumnPathMap(MST_PROV_SCHD_R.$tax_fix_flg, ProvSchd_DtlR.$tax_fix_flg);
				addColumnPathMap(MST_PROV_SCHD_R.$tax_cd, ProvSchd_DtlR.$tax_cd);
				addColumnPathMap(MST_PROV_SCHD_R.$trd_cur_upri, ProvSchd_DtlR.$trd_cur_upri);
				addColumnPathMap(MST_PROV_SCHD_R.$wtax_rate, ProvSchd_DtlR.$wtax_rate);
				addColumnPathMap(MST_PROV_SCHD_R.$intr_rmrks, ProvSchd_DtlR.$intr_rmrks);
				addColumnPathMap(MST_PROV_SCHD_R.$sub_char1, ProvSchd_DtlR.$sub_char1);
				addColumnPathMap(MST_PROV_SCHD_R.$sub_char2, ProvSchd_DtlR.$sub_char2);
				addColumnPathMap(MST_PROV_SCHD_R.$sub_char3, ProvSchd_DtlR.$sub_char3);
			}
		}
	}

	/**
	 * ProvSchd_Sprt01オペレーション.<p>
	 *
	 * マスタ値や金額を補完します。<br>
	 */
	public class ProvSchd_Sprt01 extends MSBEL_ProvSchdService_MC_A.ProvSchd_Sprt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			completion(up0());
			setDown();
		}

		protected void setDown() {
			down0().setAll(up0());
		}

		protected void completion(MCList<ProvSchd_DtlR> upL) {
			for(ProvSchd_DtlR r : upL) {
				setTrdCurCd(r);
				setProvTypProvBasisTyp(r);

				if(!isUpdateR(r)) {
					clearAmt(r);
					continue;
				}

				if(MAC_PROV_TYP.isFFR_PROV(r.prov_typ())) {
					r.prov_basis_typ(null);
					clearAmt(r);
				}
				else {
					setAmt(r);						
				}
			}
		}

		protected void clearAmt(ProvSchd_DtlR r) {
			r.xrate_inpt_flg(false);
			r.xrate(null);
			r.ptax_xrate_inpt_flg(false);
			r.ptax_xrate(null);
			r.trd_cur_cd(null);
			r.tax_fix_flg(false);
			r.tax_cd(null);
			r.trd_cur_upri(null);
			r.trd_cur_amt(null);
			r.trd_cur_tax_amt(null);
			r.wtax_rate(null);
			r.wtax_amt(null);
		}

		protected void setAmt(ProvSchd_DtlR r) {
			if (!r.xrate_inpt_flg() && isNull(r.xrate())) {
				if (isSame(r.trd_cur_cd(), getCo().base_cur_cd())) {
					r.xrate(MCNumber.ONE);
				}
				else {
					r.xrate(getBaseRateCache()
							.getEx(r.accpt_schd_dt(), r.trd_cur_cd(),
									getCo().base_cur_cd(), getCo().prov_xrate_cd()).xrate());
				}
			}

			if (!r.ptax_xrate_inpt_flg() && isNull(r.ptax_xrate())) {
				if (isNull(getCo().ptax_cur_cd())) {
					r.ptax_xrate(null);
				}
				else if (isSame(r.trd_cur_cd(), getCo().ptax_cur_cd())) {
					r.ptax_xrate(MCNumber.ONE);
				}
				else {
					r.ptax_xrate(getPtaxRateCache()
							.getEx(r.accpt_schd_dt(), r.trd_cur_cd(),
									getCo().ptax_cur_cd(), getCo().prov_xrate_cd())
							.xrate());
				}
			}

			if (!r.tax_fix_flg() && isNull(r.tax_cd())) {
				r.tax_cd(getTaxCdCache().get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(),
						r.itm_sub3(), r.prsppl_cd(), r.accpt_schd_dt()).tax_cd());
			}

			if (isNull(r.trd_cur_upri())) {
				r.trd_cur_upri(getProvUpriCache().getEx(
						r.accpt_schd_dt(),
						r.itm_cd(),
						r.itm_sub1(),
						r.itm_sub2(),
						r.itm_sub3(),
						r.prsppl_cd(),
						r.trd_cur_cd(),
						r.wg_cd()
						).upri());
			}

			MAM_TAX_R taxCacheR = getTaxCache().get(r.tax_cd());
			MAM_BP_R bpCacheR = getBpCache().get(r.prsppl_cd());
			MCRow amtR = MAUCL_AmtUtil.getAmtAndTax(r.trd_cur_upri(), r.base_unit_qty(),
					taxCacheR.tax_rate(), taxCacheR.inc_tax_flg(),
					getCurCache().getEx(r.trd_cur_cd()).amt_dec_place(),
					bpCacheR.prov_amt_rnd_typ(), bpCacheR.prov_tax_rnd_typ());
			r.trd_cur_amt(amtR.getNumber("amt"));
			r.trd_cur_tax_amt(amtR.getNumber("tax_amt"));

			if (isWtax(r)) {
				if (isNull(r.wtax_rate()) && !r.not_completion_flg()) {
					r.wtax_rate(getWtaxCache().get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(),
							r.itm_sub3(), r.accpt_schd_dt()).wtax_rate());
				}
				if (!isNull(r.wtax_rate())) {
					r.wtax_amt(r.trd_cur_amt().multiply(r.wtax_rate()).divide(100,
							getCurCache().getEx(r.trd_cur_cd()).amt_dec_place()
									.intValue(),
							MAC_RND_TYP.toMC(getCo().wtax_rnd_typ())));
				}
				else {
					r.wtax_amt(null);
				}
			}
			else {
				r.wtax_rate(null);
				r.wtax_amt(null);
			}
		}

		protected boolean isWtax(ProvSchd_DtlR r) {
			// 源泉税額は取引通貨、基準通貨、納税通貨が全て一致する場合のみ設定する
			// 納税通貨が取得できない場合は一致しているとみなす
			if (isSame(r.trd_cur_cd(), getCo().base_cur_cd())
					&& (isNull(getCo().ptax_cur_cd()) || isSame(r.trd_cur_cd(), getCo().ptax_cur_cd()))) {
				return true;
			}
			else {
				return false;
			}
		}
	}

	/**
	 * 更新対象かどうか
	 * MCRowに以下が設定されていることが必須。
	 * prov_typ 支給区分
	 * prov_basis_typ 支給計上区分
	 * inpt_flg 投入フラグ 
	 * @param r
	 * @return
	 */
	protected boolean isUpdateR(ProvSchd_DtlR r) {
		if(MAC_PROV_TYP.isONR_PROV(r.prov_typ())
				&& MAC_PROV_BASIS_TYP.isINPT(r.prov_basis_typ())
				&& r.inpt_flg() == false
				&& !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
			return false;
		}
		return true;
	}

	/**
	 * 支給区分と支給計上を設定する。
	 * MCRowに以下が設定されていることが必須。
	 * trd_ptn_typ 取引パタン区分
	 * stk_id_typ 在庫識別区分
	 * stk_arrv_bp_cd 在庫着荷先ＣＤ
	 * itm_cd 品目ＣＤ
	 * itm_sub1 枝番１
	 * itm_sub2　枝番２
	 * itm_sub3 枝番３
	 * prsppl_cd 支給先
	 * wg_cd　ワーキンググループＣＤ
	 * cur_cd 通貨ＣＤ
	 * accpt_schd_dt 検収予定日
	 * @param r
	 */
	protected void setProvTypProvBasisTyp(ProvSchd_DtlR r) {
		// 支給
		if(MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())) {
			if(MSC_STK_ID_TYP.isNCV_RCV(r.stk_id_typ())) {
				r.prov_typ(MAC_PROV_TYP.FFR_PROV.value());
				r.prov_basis_typ(null);
			}
			else {
				r.prov_typ(getProvTyp(r));
				r.prov_basis_typ(getProvBasisTyp(r));				
			}
		}
		// 支給返品
		else if (MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
			if (MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ())) {
				if(isNullOrNullVal(r.stk_arrv_bp_cd())) {
					r.prov_typ(MAC_PROV_TYP.ONR_PROV.value());
					r.prov_basis_typ(MAC_PROV_BASIS_TYP.INPT.value());
				}
				else {
					r.prov_typ(MAC_PROV_TYP.FFR_PROV.value());
					r.prov_basis_typ(null);
				}
			}
			else if(MSC_STK_ID_TYP.isONR_PROV(r.stk_id_typ())) {
				r.prov_typ(MAC_PROV_TYP.ONR_PROV.value());
				r.prov_basis_typ(MAC_PROV_BASIS_TYP.GI.value());
			}					
			else {
				r.prov_typ(MAC_PROV_TYP.FFR_PROV.value());
				r.prov_basis_typ(null);
			}					
		}
	}

	protected String getProvTyp(ProvSchd_DtlR r) {
		if(isNull(r.prov_typ())) {
			MAM_PROV_UPRI_R provUpriR = getProvUpriCache().get(
					r.accpt_schd_dt(),
					r.itm_cd(),
					r.itm_sub1(),
					r.itm_sub2(),
					r.itm_sub3(),
					r.prsppl_cd(),
					r.trd_cur_cd(),
					r.wg_cd());
			if(MAC_PROV_TYP.isONR_PROV(provUpriR.prov_typ())) {
				return MAC_PROV_TYP.ONR_PROV.value();
			}
			else {
				return MAC_PROV_TYP.FFR_PROV.value();
			}
		}
		else {
			return r.prov_typ();
		}
	}

	protected String getProvBasisTyp(ProvSchd_DtlR r) {
		if(isNull(r.prov_basis_typ())) {
			return getBpCache().get(r.prsppl_cd()).prov_basis_typ();
		}
		else {
			return r.prov_basis_typ();
		}
	}

	protected void setTrdCurCd(ProvSchd_DtlR r) {
		r.trd_cur_cd(getTrdCurCd(r));
	}

	protected String getTrdCurCd(ProvSchd_DtlR r) {
		if(isNull(r.trd_cur_cd())) {
			return getBpCache().getEx(r.prsppl_cd()).cur_cd();
		}
		return r.trd_cur_cd();
	}

	protected void truncAccptSchdDt(MCList<ProvSchd_DtlR> upL) {
		upL.forEach(r -> {
			if(!isNull(r.accpt_schd_dt())) {
				r.accpt_schd_dt(r.accpt_schd_dt().trunc(MCDateFieldType.DAY));
			}
		});
	}

	// キャッシュ関連
	protected static final Class<MSBEL_ProvSchdService> CLAZZ = MSBEL_ProvSchdService.class;
	protected FXUCL_MCDbcCache<MAM_BP_R> _bpCache = null;
	protected FXUCL_MCDbcCacheStEnd<MAM_CUR_XRATE_R> _baseRateCache = null;
	protected FXUCL_MCDbcCacheStEnd<MAM_CUR_XRATE_R> _ptaxRateCache = null;
	protected FXUCL_MCDbcCache<MAM_CUR_R> _curCache = null;
	protected FXUCL_MCDbcCache<MAM_TAX_R> _taxCache = null;
	protected FXUCL_MCDbcCacheStEnd<MAM_PROV_UPRI_R> _provUpriCache = null;
	protected TaxCdCache _taxCdCache = null;
	protected WtaxCache _wtaxCache = null;
	protected TrdCdCache _trdCdCache;

	// 取引先(支給先) 「支給先ＣＤ」
	public static void initBpCache(MCList<ProvSchd_DtlR> bindL) {
		object(CLAZZ)._initBpCache(bindL);
	}

	protected void _initBpCache(MCList<ProvSchd_DtlR> bindL) {
		MAM_BP_R t = MAM_BP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		builder.setSelect(t.cur_cd, t.prov_basis_typ, t.prov_amt_rnd_typ, t.prov_tax_rnd_typ, t.asppl_cd, t.onr_prsppl_flg, t.prov_tax_calc_typ, t.subcon_flg);
		_bpCache = new FXUCL_MCDbcCache<MAM_BP_R>(builder, bindL, ProvSchd_DtlR.$prsppl_cd);
	}

	public static FXUCL_MCDbcCache<MAM_BP_R> getBpCache() {
		return object(CLAZZ)._bpCache;
	}

	// 為替レート(基準通貨) 「取引通貨ＣＤ」「基準通貨ＣＤ」「検収予定日」
	public static void initBaseRateCache(MCList<ProvSchd_DtlR> bindL) {
		object(CLAZZ)._initBaseRateCache(bindL);
	}

	protected void _initBaseRateCache(MCList<ProvSchd_DtlR> bindL) {
		bindL.addStringColumn("base_cur_cd", getCo().base_cur_cd());
		bindL.addStringColumn("prov_xrate_cd", getCo().prov_xrate_cd());
		MAM_CUR_XRATE_R t = MAM_CUR_XRATE_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		dbcL_bldr.setSelect(t.xrate);
		_baseRateCache = new FXUCL_MCDbcCacheStEnd<MAM_CUR_XRATE_R>(dbcL_bldr, bindL,
				ProvSchd_DtlR.$trd_cur_cd, "base_cur_cd", "prov_xrate_cd");
	}

	public static FXUCL_MCDbcCacheStEnd<MAM_CUR_XRATE_R> getBaseRateCache() {
		return object(CLAZZ)._baseRateCache;
	}

	// 為替レート(納税通貨) 「取引通貨ＣＤ」「納税通貨ＣＤ」「検収予定日」
	public static void initPtaxRateCache(MCList<ProvSchd_DtlR> bindL) {
		object(CLAZZ)._initPtaxRateCache(bindL);
	}

	protected void _initPtaxRateCache(MCList<ProvSchd_DtlR> bindL) {
		bindL.addStringColumn("ptax_cur_cd", nvl(getCo().ptax_cur_cd(), getCo().base_cur_cd()));
		bindL.addStringColumn("prov_xrate_cd", getCo().prov_xrate_cd());
		MAM_CUR_XRATE_R t = MAM_CUR_XRATE_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		dbcL_bldr.setSelect(t.xrate);
		_ptaxRateCache = new FXUCL_MCDbcCacheStEnd<MAM_CUR_XRATE_R>(dbcL_bldr,	bindL, ProvSchd_DtlR.$trd_cur_cd, "ptax_cur_cd", "prov_xrate_cd");
	}

	public static FXUCL_MCDbcCacheStEnd<MAM_CUR_XRATE_R> getPtaxRateCache() {
		return object(CLAZZ)._ptaxRateCache;
	}
	
	// 税マスタ 「税ＣＤ」
	public static void initTaxCache(MCList<ProvSchd_DtlR> bindL) {
		object(CLAZZ)._initTaxCache(bindL);
	}

	protected void _initTaxCache(MCList<ProvSchd_DtlR> bindL) {
		MAM_TAX_R t = MAM_TAX_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.tax_cd, t.tax_typ, t.inc_tax_flg, t.tax_rate);
		_taxCache = new FXUCL_MCDbcCache<MAM_TAX_R>(dbc_bldr, bindL, ProvSchd_DtlR.$tax_cd);
	}
	
	public static FXUCL_MCDbcCache<MAM_TAX_R> getTaxCache() {
		return object(CLAZZ)._taxCache;
	}
	
	// 通貨マスタ 「取引通貨ＣＤ」
	public static void initCurCache(MCList<ProvSchd_DtlR> mcL) {
		object(CLAZZ)._initCurCache(mcL);
	}
	
	protected void _initCurCache(MCList<ProvSchd_DtlR> mcL) {

		MAM_CUR_R t = MAM_CUR_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		MCList<ProvSchd_DtlR> bindL = mcL.clone();

		// 電文(取引通貨)以外に基準通貨と納税通貨もキャッシュする
		ProvSchd_DtlR baseR = ProvSchd_DtlR.create();
		baseR.trd_cur_cd(getCo().base_cur_cd());
		bindL.add(baseR);

		if(!isNull(getCo().ptax_cur_cd())) {
			ProvSchd_DtlR ptaxR = ProvSchd_DtlR.create();
			ptaxR.trd_cur_cd(getCo().ptax_cur_cd());
			bindL.add(ptaxR);
		}

		dbc_bldr.setSelect(t.cur_cd, t.amt_dec_place, t.upri_dec_place);
		_curCache = new FXUCL_MCDbcCache<MAM_CUR_R>(dbc_bldr, bindL, ProvSchd_DtlR.$trd_cur_cd);
	}

	public static FXUCL_MCDbcCache<MAM_CUR_R> getCurCache() {
		return object(CLAZZ)._curCache;
	}

	// 支給単価マスタ 「品目ＣＤ」「枝番１」「枝番２」「枝番３」「支給先ＣＤ」「取引通貨ＣＤ」「ワーキンググループＣＤ」
	public static void initProvUpriCache(MCList<ProvSchd_DtlR> mcL) {
		object(CLAZZ)._initProvUpriCache(mcL);
	}

	protected void _initProvUpriCache(MCList<ProvSchd_DtlR> mcL) {
		MAM_PROV_UPRI_R t = MAM_PROV_UPRI_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		dbcL_bldr.setSelect(t.prov_typ, t.upri);
		_provUpriCache = new FXUCL_MCDbcCacheStEnd<MAM_PROV_UPRI_R>(
				dbcL_bldr,
				mcL,
				ProvSchd_DtlR.$itm_cd,
				ProvSchd_DtlR.$itm_sub1,
				ProvSchd_DtlR.$itm_sub2,
				ProvSchd_DtlR.$itm_sub3,
				ProvSchd_DtlR.$prsppl_cd,
				ProvSchd_DtlR.$trd_cur_cd,
				ProvSchd_DtlR.$wg_cd);
	}

	public static FXUCL_MCDbcCacheStEnd<MAM_PROV_UPRI_R> getProvUpriCache() {
		return object(CLAZZ)._provUpriCache;
	}

	// 税ＣＤ 「品目ＣＤ」「枝番１」「枝番２」「枝番３」「支給先ＣＤ」「検収予定日」
	public static void initTaxCdCache(MCList<ProvSchd_DtlR> mcL) {
		object(CLAZZ)._initTaxCdCache(mcL);
	}

	protected void _initTaxCdCache(MCList<ProvSchd_DtlR> mcL) {
		if(getTaxCdCache() == null) {
			_taxCdCache = new TaxCdCache(mcL);			
		}
		else {
			_taxCdCache.addCache(mcL);
		}
	}

	public static TaxCdCache getTaxCdCache() {
		return object(CLAZZ)._taxCdCache;
	}

	public class TaxCdCache {
		protected MCIndexKey _taxCdIdx = null;
		protected MCList<ProvSchd_DtlR> _taxCdCache = MCList.create(ProvSchd_DtlR.class);
		protected String[] _key = new String[]{
				ProvSchd_DtlR.$itm_cd,
				ProvSchd_DtlR.$itm_sub1,
				ProvSchd_DtlR.$itm_sub2,
				ProvSchd_DtlR.$itm_sub3,
				ProvSchd_DtlR.$prsppl_cd,
				ProvSchd_DtlR.$accpt_schd_dt};

		protected TaxCdCache(MCList<ProvSchd_DtlR> bindL) {
			addCache(bindL);
		}

		protected void addCache(MCList<ProvSchd_DtlR> bindL) {
			truncAccptSchdDt(bindL);
			_taxCdCache.addAll(bindL.groupBy(_key));
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_TAX$F_GET_PROV_TAX_CD", "01"), MABCFunction.getFunctionExecuter("MAPA_TAX$F_GET_PROV_TAX_CD"), ProvSchd_DtlR.$tax_cd, _taxCdCache, ProvSchd_DtlR.$itm_cd, ProvSchd_DtlR.$itm_sub1, ProvSchd_DtlR.$itm_sub2, ProvSchd_DtlR.$itm_sub3, ProvSchd_DtlR.$prsppl_cd, ProvSchd_DtlR.$accpt_schd_dt);
			_taxCdIdx = _taxCdCache.createIndex(_key);
		}

		public ProvSchd_DtlR get(String itm_cd, String itm_sub1, String itm_sub2, String itm_sub3, String prsppl_cd, MCDate accpt_schd_dt) {
			return _taxCdCache.getFirst(_taxCdIdx, itm_cd, itm_sub1, itm_sub2, itm_sub3, prsppl_cd, accpt_schd_dt.trunc(MCDateFieldType.DAY));
		}
	}

	// 品目マスタ 「品目ＣＤ」「枝番１」「枝番２」「枝番３」
	// チェック対象ではないが、支給実績でキャッシュを利用するためリクエストオブジェクトに保持させる
	public static void initWtaxCache(MCList<ProvSchd_DtlR> mcL) {
		object(CLAZZ)._initWtaxCache(mcL);
	}

	protected void _initWtaxCache(MCList<ProvSchd_DtlR> mcL) {
		if(getWtaxCache() == null) {
			_wtaxCache = new WtaxCache(mcL);
		}
		else {
			_wtaxCache.addCache(mcL);
		}
	}

	public static WtaxCache getWtaxCache() {
		return object(CLAZZ)._wtaxCache;
	}

	public class WtaxCache {
		protected MCIndexKey _wtaxIdx = null;
		protected MCList<ProvSchd_DtlR> _wtaxCacheL = MCList.create(ProvSchd_DtlR.class);
		protected String[] _key = new String[]{
				ProvSchd_DtlR.$itm_cd,
				ProvSchd_DtlR.$itm_sub1,
				ProvSchd_DtlR.$itm_sub2,
				ProvSchd_DtlR.$itm_sub3,
				ProvSchd_DtlR.$accpt_schd_dt};

		protected WtaxCache(MCList<ProvSchd_DtlR> bindL) {
			addCache(bindL);
		}

		protected void addCache(MCList<ProvSchd_DtlR> bindL) {
			truncAccptSchdDt(bindL);
			_wtaxCacheL.addAll(bindL.subList(ProvSchd_DtlR.$wtax_rate, null));
			_wtaxCacheL.groupBy(_key);
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_TAX$F_GET_WTAX_RATE", "01"), MABCFunction.getFunctionExecuter("MAPA_TAX$F_GET_WTAX_RATE"), ProvSchd_DtlR.$wtax_rate, _wtaxCacheL, ProvSchd_DtlR.$itm_cd, ProvSchd_DtlR.$itm_sub1, ProvSchd_DtlR.$itm_sub2, ProvSchd_DtlR.$itm_sub3, ProvSchd_DtlR.$accpt_schd_dt);
			_wtaxIdx = _wtaxCacheL.createIndex(_key);
		}

		public ProvSchd_DtlR get(String itm_cd, String itm_sub1, String itm_sub2, String itm_sub3, MCDate accpt_schd_dt) {
			return _wtaxCacheL.getFirst(_wtaxIdx, itm_cd, itm_sub1, itm_sub2, itm_sub3, accpt_schd_dt.trunc(MCDateFieldType.DAY));
		}
	}
	
	// 取引マスタ (取引ＣＤの取得) 「取引パタン区分」「自動時採用フラグ=1」
	public static void initTrdCdCache(MCList<ProvSchd_DtlR> bindL) {
		object(CLAZZ)._initTrdCdCache(bindL);
	}
	protected void _initTrdCdCache(MCList<ProvSchd_DtlR> bindL) {
		_trdCdCache = new TrdCdCache(bindL.subList(ProvSchd_DtlR.$trd_cd, null));
	}
	public static TrdCdCache getTrdCdCache() {
		return object(CLAZZ)._trdCdCache;
	}
	public class TrdCdCache {
		protected MCIndexKey _trdCdCacheIdx;
		protected MCList<MAM_TRD_R> _trdCdCacheL;
		protected TrdCdCache(MCList<ProvSchd_DtlR> bindL) {
			MCList<MAM_TRD_R> dbcL = MCList.create(MAM_TRD_R.class);
			MAM_TRD_R t = MAM_TRD_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
			builder.setSelect(t.trd_ptn_typ, t.trd_cd);
			builder.addWhereWithAnd(t.auto_adopt_flg.eq(value(true)));
			builder.addWhereWithAnd(t.trd_ptn_typ.eq(bind("trd_ptn_typ")));
			dbSelect("MSBEL5260_MAM_TRD_S01", dbcL, builder, bindL.groupBy(ProvSchd_DtlR.$trd_ptn_typ));
			_trdCdCacheL = dbcL;
			_trdCdCacheIdx = dbcL.createIndex(MAM_TRD_R.$trd_ptn_typ);
		}

		public MAM_TRD_R getFirst(String trd_ptn_typ) {
			return _trdCdCacheL.getFirst(_trdCdCacheIdx, trd_ptn_typ);
		}
	}

	//FMCB CUSTOM END
}