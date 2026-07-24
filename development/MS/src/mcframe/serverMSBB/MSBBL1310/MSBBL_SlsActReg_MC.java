package mcframe.serverMSBB.MSBBL1310;

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
import mcframe.serverMSBB.MSBBL1310.*; // このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMBBA.MBBAL5010.*;
import mcframe.serverMSBB.MSBBL6010.*;
import mcframe.serverMSBB.MSBBL6220.*;
import mcframe.serverMSBE.MSBEL5010.*;
import mcframe.serverMSBE.MSBEL5550.*;
import mcframe.serverMSBE.MSBEL5710.*;
import mcframe.serverMSBE.MSBEL5720.*;
import mcframe.serverMSBG.MSBGL5080.*;
import mcframe.serverMSUC.MSUCL0020.*;
import mcframe.serverMABS.MABSL5010.*;
import mcframe.serverMSUC.MSUCL0080.MSUCL_SlsUtil;
import static mcframe.serverMSBB.MSBBL1310.Query.*;
import static mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil.*;
import static mcframe.commonCore.container.MCRow.*;
import static mcframe.serverMSUC.MSUCL0080.MSUCL_SlsUtil.*;
import static mcframe.serverMSUC.MSUCL0070.MSUCL_StkUtil.*;
import mcframe.serverFXUC.FXUCL0030.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0170.FXUCL_BeforeAfterValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_SmallLargeValidater;
import mcframe.commonMAUA.MAUAC0010.MAUAC_List;
import mcframe.serverMAUC.MAUCL1110.MAUCL_DptUtil;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBBL_SlsActReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBBL_SlsActReg_MC extends MSBBL_SlsActReg_MC_A{
	//FMCB CUSTOM START

	/** 
	 * 取引先マスタ・キャッシュ
	 */
	protected FXUCL_MCDbcCache<MAM_BP_R> _cacheBp;
	/** 
	 * 部門マスタ・キャッシュ
	 */
	protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _cacheMamDpt;
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 売上実績情報を検索します。<br>
	 */
	public class Srch01 extends MSBBL_SlsActReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			editCnd();

			int cnt = srchHdr();
			if (isSame(cnt, 0)) {
				return;
			}

			chkRsltHdr();

			cnt = srchDtl();
			if (isSame(cnt, 0)) {
				down0().clear();
				return;
			}
			chkRsltDtl();

			srchIo();
			chkRsltIo();
		}

		/**
		 * 検索条件の編集
		 */
		protected void editCnd() {

			// 最新ＦＬＧがオンの場合は、一時カラムに検索条件制御用のカラムを追加
			// 念のため、改訂番号をクリアする
			if (up0().latest_flg()) {
				up0().setStringNE("latest_flg_str", toTrueStr(up0().latest_flg()));
				up0().srch_tgt_rev(null);
			}
			else if (isNull(up0().srch_tgt_rev())) {
				// 画面で制御しているが、仮に最新ＦＬＧがオフ、改訂番号がnullの場合、
				// サーバエラー(検索結果が１件と想定される箇所で、複数件のデータが検索されました。)が発生するので
				// 検索結果が0件になるように加工する
				up0().setStringNE("latest_flg_str", toFalseStr(up0().latest_flg()));
			}
		}

		/**
		 * 	売上実績ヘッダ検索
		 * @return　検索結果件数
		 */
		protected int srchHdr() {
			int cnt = 0;
			cnt =  executeQuery(down0(), MSBBL1310_SLS_ACT_S01(), up0());
			
			if (down0().cst_iv_flg()) {
				// 参照モードにかぎりインボイス対象であっても売上実績ＮＯ検索可能
				if (up0().ref_flg()) {
					MCQueryPlan sql = MSBBL1310_SLS_ACT_S02();
					sql.addDynamicSQLInfo(MSBBL1310_SLS_ACT_S02_WHERE01());
					cnt = executeQuery(down0(), sql, up0());
				}
				else {
					throw new MCAppException(MSBBL0637);
				}
			}
			return cnt;
		}

		/**
		 * 	ヘッダの検索結果をチェック
		 */
		protected void chkRsltHdr() {
		}

		/**
		 * 	売上実績明細検索
		 */
		protected int srchDtl() {
			
			if (!down0().cst_iv_flg()) {
				return executeQuery(down1(), MSBBL1310_SLS_ACT_D_S01(), down0());
			}
			else {
				return executeQuery(down1(), MSBBL1310_SLS_ACT_D_S02(), down0());
			}
		}

		/**
		 * 	明細の検索結果をチェック
		 */
		protected void chkRsltDtl() {

			// 売上実績明細の仕入直送発注ＮＯや仕入実績ＮＯがセットされている場合は仕入直送売上とみなしエラーとする。
			for (Srch01_DtlR r : down1()) {
				if (!isNull(r.getStringNE(MST_SLS_ACT_D_R.$purc_ddlv_po_no))
						|| !isNull(r.getStringNE(MST_SLS_ACT_D_R.$purc_act_no))) {
					throw new MCAppException(MSBBL0088);
				}
			}
		}

		/**
		 * 	売上実績受払検索
		 */
		protected void srchIo() {
			if (!down0().cst_iv_flg()) {
				executeQuery(down2(), MSBBL1310_SLS_ACT_IO_S01(), down0());
			}
			else {
				executeQuery(down2(), MSBBL1310_SLS_ACT_IO_S02(), down0());
			}
		}

		/**
		 * 	詳細の検索結果をチェック
		 */
		protected void chkRsltIo() {

		}

		@Override
		protected void editListMain() {
			super.editListMain();

			if (!down1().isEmpty()) {
				calcProfRate(down0(), down1());
			}

			if (!down0().isEmpty()) {
				// 与信枠残高の取得
				callCredSvSrch01(down0());
				// 紐付けIDの設定
				setDtlRowId();
				down0().latest_flg(getLatestFlg());
			}

// 1.5次対応のためコメントアウト
//			setAccptStsTyp(down1());
//			setAccptAmt(down0(), down1());
		}

		/**
		 * 改訂番号が最新の場合は最新フラグをtrueにする。
		 */
		protected boolean getLatestFlg() {
			if (up0().latest_flg() || MAC_SLIP_STS_TYP.isCRT(down0().slip_sts_typ())) {
					return true;
			}
			return false;
		}

		/**
		 * 	明細と詳細の紐付けＮＯ(dtl_row_id)を設定する
		 */
		protected void setDtlRowId() {
			MCIndexKey idxKey = down2().createIndex(Srch01_IoR.$sls_act_d_no);
			int i = 0;
			for (Srch01_DtlR r : down1()) {
				MCList<Srch01_IoR> ioL = down2().subList(idxKey, r.sls_act_d_no());
				r.dtl_row_id(i++);
				ioL.setNumberNE(Srch01_IoR.$dtl_row_id, r.dtl_row_id());
			}
		}
	}

	/**
	 * Srch02オペレーション.<p>
	 *
	 * 売上の見積情報を検索します。<br>
	 */
	public class Srch02 extends MSBBL_SlsActReg_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			editCnd();

			int cnt = srchHdr();
			if (isSame(cnt, 0)) {
				return;
			}
			chkRsltHdr();

			cnt = srchDtl();
			if (isSame(cnt, 0)) {
				down0().clear();
				return;
			}
			chkRsltDtl();

			crtIo();

		}

		/**
		 * 検索条件の編集
		 */
		protected void editCnd() {
			up0().setDateNE("today", getToday());
		}

		/**
		 * 	見積ヘッダ検索
		 * @return 検索結果件数
		 */
		protected int srchHdr() {
			return executeQuery(down0(), MSBBL1310_QTN_S01(), up0());
		}

		/**
		 * 	ヘッダの検索結果をチェック
		 */
		protected void chkRsltHdr() {

		}

		/**
		 * 	見積明細検索
		 */
		protected int srchDtl() {
			down0().setDateNE("today", getToday());
			return executeQuery(down1(), MSBBL1310_QTN_D_S01(), down0());
		}

		/**
		 * 	明細の検索結果をチェック
		 */
		protected void chkRsltDtl() {

			MCList<Srch01_DtlR> retL = down1().createInstance();
			MCMessageList msgL = new MCMessageList();
			int i = 0;
			for (Srch01_DtlR r : down1()) {

				// 引継可能か判定
				if (!canTranser(r, msgL)) {
					continue;
				}

				// 明細行IDの設定
				r.dtl_row_id(i++);

				retL.add(r);
			}

			// 最終的に引継可能な明細が残っていなければエラーとする。(⇒1行でも残っていたら上記のチェックエラーMsgは表示しない)
			if (retL.isEmpty()) {
				MCAppException ex = new MCAppException(MSBBL0091);
				ex.setCauseMessageList(msgL);
				throw ex;
			}

			down1().setAll(retL);
		}

		/**
		 * 	詳細リスト作成
		 * <p>
		 * 	明細取得結果を元に詳細リストを作成する(明細に対して1:1)
		 * <p>
		 */
		protected void crtIo() {
			addAll(down2(), down1(), createMap_Srch01_IoR_Srch01_DtlR());
		}

		@Override
		protected void editListMain() {
			super.editListMain();

			// 税情報設定
			setNewTax();

			calcAmt();

			if (!down1().isEmpty()) {
				calcProfRate(down0(), down1());
			}

			if (!down0().isEmpty()) {
				// 与信枠残高の取得
				callCredSvSrch01(down0());
			}
		}
		
		/**
		 * 内税・税指定が共にオフの場合、最新の税情報を設定する
		 */
		protected void setNewTax() {
			for (Srch01_DtlR dtlR : down1()) {
				if (!dtlR.inc_tax_flg() && !dtlR.tax_fix_flg() && !isSame(dtlR.tax_cd(), dtlR.new_tax_cd())) {
					// 最新税情報の設定
					dtlR.tax_cd(dtlR.new_tax_cd());
					dtlR.tax_nm(dtlR.new_tax_nm());
					dtlR.inc_tax_flg(dtlR.new_inc_tax_flg());
					dtlR.tax_typ(dtlR.new_tax_typ());
					dtlR.tax_rate(dtlR.new_tax_rate());
				}
			}
		}

		protected void calcAmt() {

			// 共通ユーティリティを用いて見積金額をベースに算出
			MSUCL_ConvQtyAmtUtil.ConvQtyAmtUtil_Calc02 ope = MSUCL_ConvQtyAmtUtil.crtConvQtyAmtUtil_Calc02();

			int i = 0;
			setPegNo(down1());
			for (Srch01_DtlR dtlR : down1()) {

				ConvQtyAmtUtil_Calc01_HdrR opHdr = ope.up0().createRow();
				ConvQtyAmtUtil_Calc01_Dtl1R opDtl = ope.up1().createRow();

				opHdr.peg_no(i++);
				copy(opHdr, dtlR,
						createMap_ConvQtyAmtUtil_Calc01_HdrR_Srch01_DtlR(down0()));
				ope.up0().add(opHdr);

				copy(opDtl, dtlR,
						createMap_ConvQtyAmtUtil_Calc01_Dtl1R_Srch01_DtlR(opHdr.peg_no()));
				ope.up1().add(opDtl);
			}

			ope.exec();

			String[] destCols = new String[] {
					Srch01_DtlR.$trd_cur_upri, Srch01_DtlR.$trd_cur_dscnt_amt,
					Srch01_DtlR.$trd_cur_amt, Srch01_DtlR.$trd_cur_tax_amt,
					Srch01_DtlR.$trd_cur_inc_tax_amt
					,Srch01_DtlR.$wtax_amt
			};
			String[] srcCols = new String[] {
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_upri,
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_dscnt_amt,
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_amt,
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_tax_amt,
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_inc_tax_amt
					,ConvQtyAmtUtil_Calc01_Dtl1R.$wtax_amt
			};

			copyByPegNo(down1(), destCols, ope.down0(), srcCols);

			for (Srch01_DtlR r : down1()) {
				// 基準単位数量の算出
				r.base_unit_qty(getBaseUnitQty(r));

				// 基準通貨、納税通貨金額の算出
				MCNumber xrate = down0().xrate();
				MCNumber baseCurUpriDecPlace = down0().base_cur_upri_dec_place();
				MCNumber baseCurAmtDecPlace = down0().base_cur_amt_dec_place();
				String xateRndTyp = down0().xrate_rnd_typ();

				r.base_cur_upri(convToBaseCur(r.trd_cur_upri(), xrate,
						baseCurUpriDecPlace, xateRndTyp));
				r.base_cur_amt(convToBaseCur(r.trd_cur_amt(), xrate, baseCurAmtDecPlace,
						xateRndTyp));
				r.base_cur_inc_tax_amt(convToBaseCur(r.trd_cur_inc_tax_amt(), xrate,
						baseCurAmtDecPlace, xateRndTyp));
				r.base_cur_tax_amt(convToBaseCur(r.trd_cur_tax_amt(), xrate,
						baseCurAmtDecPlace, xateRndTyp));
				r.base_cur_dscnt_amt(convToBaseCur(r.trd_cur_dscnt_amt(), xrate,
						baseCurAmtDecPlace, xateRndTyp));

				MCNumber ptaxXrate = down0().ptax_xrate();
				MCNumber ptaxCurUpriDecPlace = down0().ptax_cur_upri_dec_place();
				MCNumber ptaxCurAmtDecPlace = down0().ptax_cur_amt_dec_place();

				r.ptax_cur_upri(convCur(r.trd_cur_upri(), ptaxXrate, ptaxCurUpriDecPlace,
						xateRndTyp));
				r.ptax_cur_amt(convCur(r.trd_cur_amt(), ptaxXrate, ptaxCurAmtDecPlace,
						xateRndTyp));
				r.ptax_cur_inc_tax_amt(convCur(r.trd_cur_inc_tax_amt(), ptaxXrate,
						ptaxCurAmtDecPlace, xateRndTyp));
				r.ptax_cur_tax_amt(convCur(r.trd_cur_tax_amt(), ptaxXrate,
						ptaxCurAmtDecPlace, xateRndTyp));
				r.ptax_cur_dscnt_amt(convCur(r.trd_cur_dscnt_amt(), ptaxXrate,
						ptaxCurAmtDecPlace, xateRndTyp));

				if (isSame(down0().trd_cur_cd(), down0().base_cur_cd()) 
						&& (isSame(down0().trd_cur_cd(), down0().ptax_cur_cd()) || isNull(down0().ptax_cur_cd()))) {
					// 取引通貨＝基準通貨＝納税通貨」、もしくは「取引通貨＝基準通貨かつ納税通貨IS NULL
					
					r.wtax_amt(getTaxAmt(r.ptax_cur_amt(), r.wtax_rate(), down0().ptax_cur_amt_dec_place(), down0().wtax_rnd_typ()));
				}
				else {
					r.wtax_rate(null);
				}

				// 原価金額の算出
				r.cost_amt(MSUCL_SlsUtil.getCostAmt(r.cost_upri(), r.base_unit_qty(), getBaseCur().amt_dec_place()));
			}
		}

		/**
		 * 	対象の明細が引き継ぎ可能か判定する
		 */
		protected boolean canTranser(Srch01_DtlR r, MCMessageList msgL) {

			if (!r.trd_unit_qty().isPositive()) {
				// 対象となる見積情報が存在しても受注・実績未引継の明細が存在しなかった場合はエラーとする。
				msgL.add(new MCMessage(MSBBL0092));
				return false;
			}
			else if (MAC_COMP_SPEC_TYP.isCOMP_SPEC(r.comp_spec_typ())) {
				// 構成管理品の明細が存在する場合はエラーとし、引継ぎ可能明細に追加しない。（構成管理品は受注経由で引き継がせる）
				msgL.add(new MCMessage(MSBBL0093, toDispGUIIndex(r)));
				return false;
			}

			return true;
		}

		/**
		 * 	下り電文(Srch01_DtlR) -> 下り電文(Srch01_IoR)
		 * @return
		 */
		protected Map_Srch01_IoR_Srch01_DtlR<Srch01_IoR, Srch01_DtlR> createMap_Srch01_IoR_Srch01_DtlR() {
			return new Map_Srch01_IoR_Srch01_DtlR<Srch01_IoR, Srch01_DtlR>();
		}

		public class Map_Srch01_IoR_Srch01_DtlR<D extends Srch01_IoR, S extends Srch01_DtlR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch01_IoR.$trd_unit_cd, Srch01_DtlR.$trd_unit_cd);
				addColumnPathMap(Srch01_IoR.$trd_unit_nm, Srch01_DtlR.$trd_unit_nm);
				addColumnPathMap(Srch01_IoR.$trd_unit_qty, Srch01_DtlR.$trd_unit_qty);
				addColumnPathMap(Srch01_IoR.$base_unit_cd, Srch01_DtlR.$base_unit_cd);
				addColumnPathMap(Srch01_IoR.$base_unit_nm, Srch01_DtlR.$base_unit_nm);
				addColumnPathMap(Srch01_IoR.$base_unit_qty, Srch01_DtlR.$base_unit_qty);
				addColumnPathMap(Srch01_IoR.$gd_cd, Srch01_DtlR.$gd_cd);
				addColumnPathMap(Srch01_IoR.$gd_nm, Srch01_DtlR.$gd_nm);
				addColumnPathMap(Srch01_IoR.$sno1, Srch01_DtlR.$sno1);
				addColumnPathMap(Srch01_IoR.$sno2, Srch01_DtlR.$sno2);
				addColumnPathMap(Srch01_IoR.$sno3, Srch01_DtlR.$sno3);
				addColumnPathMap(Srch01_IoR.$sno4, Srch01_DtlR.$sno4);
				addColumnPathMap(Srch01_IoR.$trd_unit_dec_place, Srch01_DtlR.$trd_unit_dec_place);
				addColumnPathMap(Srch01_IoR.$trd_unit_conv_base_qty, Srch01_DtlR.$trd_unit_conv_base_qty);
				addColumnPathMap(Srch01_IoR.$trd_unit_conv_qty, Srch01_DtlR.$trd_unit_conv_qty);
				addColumnPathMap(Srch01_IoR.$trd_unit_rnd_typ, Srch01_DtlR.$trd_unit_rnd_typ);
				addColumnPathMap(Srch01_IoR.$base_unit_dec_place, Srch01_DtlR.$base_unit_dec_place);
				addColumnPathMap(Srch01_IoR.$base_unit_rnd_typ, Srch01_DtlR.$base_unit_rnd_typ);
				addColumnPathMap(Srch01_IoR.$lot_mng_typ, Srch01_DtlR.$lot_mng_typ);
				addColumnPathMap(Srch01_IoR.$sublot_mng_typ, Srch01_DtlR.$sublot_mng_typ);
				addColumnPathMap(Srch01_IoR.$ver_flg, Srch01_DtlR.$ver_flg);
				addColumnPathMap(Srch01_IoR.$sno1_mng_typ, Srch01_DtlR.$sno1_mng_typ);
				addColumnPathMap(Srch01_IoR.$sno2_mng_typ, Srch01_DtlR.$sno2_mng_typ);
				addColumnPathMap(Srch01_IoR.$sno3_mng_typ, Srch01_DtlR.$sno3_mng_typ);
				addColumnPathMap(Srch01_IoR.$sno4_mng_typ, Srch01_DtlR.$sno4_mng_typ);
				addColumnPathMap(Srch01_IoR.$stk_mng_typ, Srch01_DtlR.$stk_mng_typ);
				addColumnPathMap(Srch01_IoR.$itm_cd, Srch01_DtlR.$itm_cd);
				addColumnPathMap(Srch01_IoR.$itm_sub1, Srch01_DtlR.$itm_sub1);
				addColumnPathMap(Srch01_IoR.$itm_sub2, Srch01_DtlR.$itm_sub2);
				addColumnPathMap(Srch01_IoR.$itm_sub3, Srch01_DtlR.$itm_sub3);
				addColumnPathMap(Srch01_IoR.$dtl_row_id, Srch01_DtlR.$dtl_row_id);
			}
		}
	}

	/**
	 * Srch03オペレーション.<p>
	 *
	 * 売上の受注情報を検索します。<br>
	 */
	public class Srch03 extends MSBBL_SlsActReg_MC_A.Srch03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			editCnd();

			int cnt = srchHdr();
			if (isSame(cnt, 0)) {
				return;
			}
			chkRsltHdr();

			cnt = srchDtl();
			if (isSame(cnt, 0)) {
				down0().clear();
				return;
			}
			chkRsltDtl();

			srchIo();
			chkRsltIo();

		}

		/**
		 * 検索条件の編集
		 */
		protected void editCnd() {
			up0().setDateNE("today", getToday());
		}

		/**
		 * 	受注ヘッダ検索
		 * @return 検索結果件数
		 */
		protected int srchHdr() {
			return executeQuery(down0(), MSBBL1310_SLO_S01(), up0());
		}

		/**
		 * 	ヘッダの検索結果をチェック
		 */
		protected void chkRsltHdr() {

		}

		/**
		 * 	受注明細検索
		 */
		protected int srchDtl() {
			down0().setDateNE("today", getToday());
			int cnt = executeQuery(down1(), MSBBL1310_SLO_D_S01(), down0());
			int i = 1;
			for (Srch01_DtlR r : down1()) {
				r.dtl_row_id(i);
				i++;
			}
			return cnt;
		}

		/**
		 * 	明細の検索結果をチェック
		 */
		protected void chkRsltDtl() {

			MCMessageList msgL = new MCMessageList();

			if (down1().size() > 1) {
				// 預り売上ＦＬＧがオフで出荷指図対象外の受注明細
				MCList<Srch01_DtlR> subL1 = down1().subList(
						Srch01_DtlR.$sls_cststk_flg, false).subList(
								Srch01_DtlR.$ship_inst_typ, MAC_SHIP_INST_TYP.NON.value());
				// 預り売上ＦＬＧがオンの受注明細
				MCList<Srch01_DtlR> subL2 =
						down1().subList(Srch01_DtlR.$sls_cststk_flg, true);
				// 預り売上の明細と出荷指図対象外の明細が混在する場合エラーとする
				if (subL1.size() > 0 && subL2.size() > 0) {
					MCAppException ex = new MCAppException(MSBBL0076);
					ex.setCauseMessageList(msgL);
					throw ex;
				}
				
				// 表示順を再設定
				for (int i = 0; i < down1().size(); i++) {
					Srch01_DtlR tmpDown1R = down1().get(i);
					tmpDown1R.disp_seq(i + 1);
				}
			}

			// 引継可能な明細が残っていなければエラーとする
			if (down1().isEmpty()) {
				MCAppException ex = new MCAppException(MSBBL0091);
				ex.setCauseMessageList(msgL);
				throw ex;
			}
		}

		/**
		 * 	出荷引当状況検索
		 */
		protected void srchIo() {
			down2().addBooleanColumn("ship_loc_prio_flg");
			down2().addBooleanColumn("def_str_ln_tgt_flg");
			executeQuery(down2(), MSBBL1310_SHIP_ALLOC_STS_S01(), down0());
		}

		/**
		 * 	詳細の検索結果をチェック
		 */
		protected void chkRsltIo() {
			MCList<Srch01_IoR> tmpDown2L = MCList.create(Srch01_IoR.class);
			for (Srch01_IoR ioR : down2()){
				for (Srch01_DtlR r : down1()){
					if (isSame(ioR.getStringNE("ship_schd_no"), r.getStringNE("ship_schd_no"))){
						ioR.dtl_row_id(r.dtl_row_id());
						tmpDown2L.add(ioR);
						break;
					}
				}
			}
			down2().clear();
			down2().addAll(tmpDown2L);
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			// 通常出荷場所の設定
			setDefLoc();

			// 税情報設定
			setNewTax();

			// 数量計算
			calcQty();

			// 明細各種金額の算出
			calcAmt();

			// 納品予定日時の設定
			setDlvSchdTm();

			// 粗利関連情報の設定
			if (!down1().isEmpty()) {
				calcProfRate(down0(), down1());
			}

			if (!down0().isEmpty()) {
				// 与信枠残高の取得
				callCredSvSrch01(down0());

			}
		}
		/**
		 * 通常出荷場所優先かつ総量引当の場合、通常出荷場所を設定する
		 */
		protected void setDefLoc() {
			MCIndexKey idx = down1().createIndex(Srch01_DtlR.$dtl_row_id);
			for (Srch01_IoR ioR : down2()) {
				Srch01_DtlR dtlR = down1().getFirst(idx, ioR.dtl_row_id());

				if (MAC_SHIP_INST_TYP.isNON(dtlR.ship_inst_typ())
						&& ioR.getBoolean("ship_loc_prio_flg")
						&& MAC_ALLOC_SCOPE_TYP.isALLOC_GRP(ioR.getString("alloc_scope_typ"))) {
					ioR.loc_cd(ioR.getString("def_loc_cd"));
					ioR.loc_nm(ioR.getString("def_loc_nm"));
					ioR.str_ln_tgt_flg(ioR.getBoolean("def_str_ln_tgt_flg"));
					ioR.str_ln_cd(null);
					ioR.str_ln_nm(null);
				}
			}
		}
		
		/**
		 * 内税・税指定が共にオフの場合、最新の税情報を設定する
		 */
		protected void setNewTax() {
			for (Srch01_DtlR dtlR : down1()) {
				if (!dtlR.inc_tax_flg() && !dtlR.tax_fix_flg() && !isSame(dtlR.tax_cd(), dtlR.new_tax_cd())) {
					// 最新税情報の設定
					dtlR.tax_cd(dtlR.new_tax_cd());
					dtlR.tax_nm(dtlR.new_tax_nm());
					dtlR.inc_tax_flg(dtlR.new_inc_tax_flg());
					dtlR.tax_typ(dtlR.new_tax_typ());
					dtlR.tax_rate(dtlR.new_tax_rate());
				}
			}
		}

		/**
		 * 	明細と詳細の紐付けＮＯ(dtl_row_id)を設定する
		 */
		protected void setDtlRowId() {
			MCIndexKey idxKey = down2().createIndex(Srch01_DtlR.$slo_d_no);
			int i = 0;
			for (Srch01_DtlR r : down1()) {
				MCList<Srch01_IoR> ioL = down2().subList(idxKey, r.slo_d_no());
				r.dtl_row_id(i++);
				ioL.setNumberNE(Srch01_IoR.$dtl_row_id, r.dtl_row_id());
			}
		}

		/**
		 * 	明細取引単位数量、取引通貨単価、取引通貨値引額、取引通貨税額の算出
		 */
		protected void calcQty() {

			/*
			 * 基準単位数量は、「売上予定.基準単位数量 - 売上予定.基準単位売上数量」の結果で取得
			 * 基準単位数量を取引単位ＣＤで換算可能であれば換算結果し、換算不可であれば基準単位数量、単位ＣＤを設定する
			 * 上記で算出した取引数量を元に取引金額を算出する
			 */
			for (Srch01_DtlR dtlR : down1()) {

				MCNumber convQty = rvrsBaseUnitConv(dtlR.base_unit_qty(),
						dtlR.trd_unit_conv_base_qty(), dtlR.trd_unit_conv_qty(),
						dtlR.trd_unit_dec_place(), dtlR.trd_unit_rnd_typ(), true);
				if (!isNull(convQty)) {
					dtlR.trd_unit_qty(convQty);
				}
				else {
					dtlR.trd_unit_qty(dtlR.base_unit_qty());
					dtlR.trd_unit_cd(dtlR.base_unit_cd());
					dtlR.trd_unit_nm(dtlR.base_unit_nm());
					dtlR.trd_unit_dec_place(dtlR.base_unit_dec_place());
					dtlR.trd_unit_rnd_typ(dtlR.base_unit_rnd_typ());
					dtlR.trd_unit_conv_base_qty(1);
					dtlR.trd_unit_conv_qty(1);
				}
			}

			for (Srch01_IoR ioR : down2()) {

				MCNumber convQty = rvrsBaseUnitConv(ioR.base_unit_qty(),
						ioR.trd_unit_conv_base_qty(), ioR.trd_unit_conv_qty(),
						ioR.trd_unit_dec_place(), ioR.trd_unit_rnd_typ(), true);
				if (!isNull(convQty)) {
					ioR.trd_unit_qty(convQty);
				}
				else {
					ioR.trd_unit_qty(ioR.base_unit_qty());
					ioR.trd_unit_cd(ioR.base_unit_cd());
					ioR.trd_unit_nm(ioR.base_unit_nm());
					ioR.trd_unit_dec_place(ioR.base_unit_dec_place());
					ioR.trd_unit_rnd_typ(ioR.base_unit_rnd_typ());
					ioR.trd_unit_conv_base_qty(1);
					ioR.trd_unit_conv_qty(1);
				}
			}
		}

		/**
		 * 	金額計算
		 */
		protected void calcAmt() {

			// 共通ユーティリティを用いて受注金額をベースに算出
			MSUCL_ConvQtyAmtUtil.ConvQtyAmtUtil_Calc02 ope = MSUCL_ConvQtyAmtUtil.crtConvQtyAmtUtil_Calc02();

			int i = 0;
			MCIndexKey idxkey = down1().createIndex(Srch01_DtlR.$slo_d_no);
			setPegNo(down1());
			for (MCList<Srch01_DtlR> sloDGL : down1().groupList(Srch01_DtlR.$slo_d_no)) {

				MCList<Srch01_DtlR> sloDL = down1().subList(idxkey, new String[] {
					sloDGL.get(0).slo_d_no()
				});

				ConvQtyAmtUtil_Calc01_HdrR hdr = ope.up0().createRow();
				hdr.peg_no(i++);
				copy(hdr, sloDL.get(0),
						createMap_ConvQtyAmtUtil_Calc01_HdrR_Srch01_DtlR(down0()));
				ope.up0().add(hdr);
				addAll(ope.up1(), sloDL,
						createMap_ConvQtyAmtUtil_Calc01_Dtl1R_Srch01_DtlR(hdr.peg_no()));
			}

			ope.exec();

			String[] destCols = new String[] {
					Srch01_DtlR.$trd_cur_upri, Srch01_DtlR.$trd_cur_dscnt_amt,
					Srch01_DtlR.$trd_cur_amt, Srch01_DtlR.$trd_cur_tax_amt,
					Srch01_DtlR.$trd_cur_inc_tax_amt
					,Srch01_DtlR.$wtax_amt
			};
			String[] srcCols = new String[] {
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_upri,
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_dscnt_amt,
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_amt,
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_tax_amt,
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_inc_tax_amt
					,ConvQtyAmtUtil_Calc01_Dtl1R.$wtax_amt
			};

			copyByPegNo(down1(), destCols, ope.down0(), srcCols);

			for (Srch01_DtlR r : down1()) {

				// 基準通貨、納税通貨金額の算出
				MCNumber xrate = down0().xrate();
				MCNumber baseCurUpriDecPlace = down0().base_cur_upri_dec_place();
				MCNumber baseCurAmtDecPlace = down0().base_cur_amt_dec_place();
				String xateRndTyp = down0().xrate_rnd_typ();

				r.base_cur_upri(convToBaseCur(r.trd_cur_upri(), xrate,
						baseCurUpriDecPlace, xateRndTyp));
				r.base_cur_amt(convToBaseCur(r.trd_cur_amt(), xrate, baseCurAmtDecPlace,
						xateRndTyp));
				r.base_cur_inc_tax_amt(convToBaseCur(r.trd_cur_inc_tax_amt(), xrate,
						baseCurAmtDecPlace, xateRndTyp));
				r.base_cur_tax_amt(convToBaseCur(r.trd_cur_tax_amt(), xrate,
						baseCurAmtDecPlace, xateRndTyp));
				r.base_cur_dscnt_amt(convToBaseCur(r.trd_cur_dscnt_amt(), xrate,
						baseCurAmtDecPlace, xateRndTyp));

				MCNumber ptaxXrate = down0().ptax_xrate();
				MCNumber ptaxCurUpriDecPlace = down0().ptax_cur_upri_dec_place();
				MCNumber ptaxCurAmtDecPlace = down0().ptax_cur_amt_dec_place();

				r.ptax_cur_upri(convCur(r.trd_cur_upri(), ptaxXrate, ptaxCurUpriDecPlace,
						xateRndTyp));
				r.ptax_cur_amt(convCur(r.trd_cur_amt(), ptaxXrate, ptaxCurAmtDecPlace,
						xateRndTyp));
				r.ptax_cur_inc_tax_amt(convCur(r.trd_cur_inc_tax_amt(), ptaxXrate,
						ptaxCurAmtDecPlace, xateRndTyp));
				r.ptax_cur_tax_amt(convCur(r.trd_cur_tax_amt(), ptaxXrate,
						ptaxCurAmtDecPlace, xateRndTyp));
				r.ptax_cur_dscnt_amt(convCur(r.trd_cur_dscnt_amt(), ptaxXrate,
						ptaxCurAmtDecPlace, xateRndTyp));

				// 原価金額の算出
				r.cost_amt(MSUCL_SlsUtil.getCostAmt(
						r.cost_upri(), r.base_unit_qty(), getBaseCur().amt_dec_place()));
			}
		}

		/**
		 * 納品予定日時を設定する
		 */
		protected void setDlvSchdTm() {
			MCList<Srch01_DtlR> groupL = down1().groupBy(Srch01_DtlR.$dlv_schd_tm);
			if (isSame(groupL.size(), 1)) {
				down0().dlv_dt(groupL.get(0).dlv_schd_tm());
				down0().dlv_hm(groupL.get(0).dlv_schd_tm());
			}
		}
	}

	/**
	 * Srch04オペレーション.<p>
	 *
	 * 納品伝票情報を検索します。<br>
	 */
	public class Srch04 extends MSBBL_SlsActReg_MC_A.Srch04 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			editCnd();

			int cnt = srchHdr();
			if (isSame(cnt, 0)) {
				return;
			}
			chkRsltHdr();

			cnt = srchDtl();
			if (isSame(cnt, 0)) {
				down0().clear();
				return;
			}
			chkRsltDtl();

			srchIo();
			chkRsltIo();
			//明細数量の設定
			setDown();
		}

		/**
		 * 検索条件の編集
		 */
		protected void editCnd() {
			up0().setDateNE("today", getToday());
		}

		/**
		 * 	納品伝票ヘッダ検索
		 * @return 検索結果件数
		 */
		protected int srchHdr() {
			return executeQuery(down0(), MSBBL1310_DLV_SLIP_S01(), up0());
		}

		/**
		 * 	ヘッダの検索結果をチェック
		 */
		protected void chkRsltHdr() {
			// 処理なし
		}

		/**
		 * 	納品伝票明細検索
		 */
		protected int srchDtl() {
			down0().addDateColumn("today", getToday());
			return executeQuery(down1(), MSBBL1310_DLV_SLIP_D_S01(), down0());
		}

		/**
		 * 	明細の検索結果をチェック
		 */
		protected void chkRsltDtl() {

			// 最終的に引継可能な明細が残っていなければエラーとする。(⇒1行でも残っていたら上記のチェックエラーMsgは表示しない)
			if (down1().isEmpty()) {
				MCAppException ex = new MCAppException(MSBBL0091);
				throw ex;
			}

		}

		/**
		 * 	出荷実績明細検索
		 */
		protected void srchIo() {
			
			MCList<Srch01_IoR> tmpL = down2().createInstance();
			executeQuery(tmpL, MSBBL1310_SHIP_ACT_D_S01(), down0());
			
			MST_SLS_ACT_D_R t2 = MST_SLS_ACT_D_R.create("T2");
			MST_SLS_ACT_R t3 = MST_SLS_ACT_R.create("T3");

			MCList<MST_SLS_ACT_IO_R> slsActIoL = MCList.create(MST_SLS_ACT_IO_R.class);
			MST_SLS_ACT_IO_R t = MST_SLS_ACT_IO_R.create("T");
			MCQueryApiBuilder slsActIoL_bldr = MCQueryApiBuilder.create(t);
			slsActIoL_bldr.addInnerJoin(t2, bracket(t.sls_act_d_no.eq(t2.sls_act_d_no)
					.and(t.sls_act_d_seq.eq(t2.sls_act_d_seq))));
			slsActIoL_bldr.addInnerJoin(t3, bracket(t2.sls_act_no.eq(t3.sls_act_no)
					.and(t2.sls_act_seq.eq(t3.sls_act_seq))));
			slsActIoL_bldr.addWhereWithAnd(
					t3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			slsActIoL_bldr.addWhereWithAnd(t2.sls_schd_no.eq(bind("sls_schd_no")));
			dbSelect("MSBBL1310_MST_SLS_ACT_IO_S01", slsActIoL, slsActIoL_bldr, down1());
			
			MCIndexKey ikSlsActIo = slsActIoL.createIndex(MST_SLS_ACT_IO_R.$ship_act_d_no);
			
			for (Srch01_IoR tmpR : tmpL) {
				
				MCNumber slsQty = MCNumber.ZERO;
				MCList<MST_SLS_ACT_IO_R> tarSlsActIoL = slsActIoL.subList(ikSlsActIo, tmpR.ship_act_d_no());
				if (!tarSlsActIoL.isEmpty()) {
					slsQty = tarSlsActIoL.sum(MST_SLS_ACT_IO_R.$base_unit_qty);
				}
				MCNumber notSlsQty = tmpR.base_unit_qty().subtract(slsQty);
				
				if (notSlsQty.isPositive()) {
					tmpR.base_unit_qty(notSlsQty);
					down2().add(tmpR);
				}
			}
		}

		/**
		 * 	詳細の検索結果をチェック
		 */
		protected void chkRsltIo() {
			MCList<Srch01_IoR> retL = down2().createInstance();
			// chkRsltDtlにて除外された明細に紐づく子のリストを除外する
			MCIndexKey idxKey = down2().createIndex(Srch01_DtlR.$ship_dlv_slip_d_no);
			for (Srch01_DtlR r : down1()) {
				MCList<Srch01_IoR> chdL = down2().subList(idxKey, new String[] {
					r.ship_dlv_slip_d_no()
				});
				if (chdL.isEmpty()) {
					continue;
				}
				retL.addAll(chdL);
			}

			down2().setAll(retL);
		}
		protected void setDown() {
			
			// 明細の数量、単位の設定
			MCList<Srch01_DtlR> retDtlL = down1().createInstance();
			MCIndexKey idxKey = down2().createIndex(Srch01_DtlR.$ship_dlv_slip_d_no);
			for (Srch01_DtlR dtlR : down1()) {

				MCList<Srch01_IoR> chdL = down2().subList(idxKey, 
						dtlR.ship_dlv_slip_d_no());

				// 詳細のリストは基準単位数が0の行は取得対象外としている
				//　また、詳細が存在しない明細行も対象外とする
				if (!isNull(chdL) && !chdL.isEmpty()) {

					retDtlL.add(dtlR);

					// 詳細の基準単位数の合計を取得
					MCNumber sum_base_unit_qty = chdL.sum(Srch01_IoR.$base_unit_qty);

					dtlR.base_unit_qty(sum_base_unit_qty);
				}
			}
			
			down1().setAll(retDtlL);
			
			chkRsltDtl();
		}

		@Override
		protected void editListMain() {

			super.editListMain();

			calcQty();

			calcAmt();

			// 明細紐付けＮＯの設定
			setDtlRowId();

			setIo2DtlL();

			// 粗利関連情報の設定
			if (!down1().isEmpty()) {
				calcProfRate(down0(), down1());
			}

			if (!down0().isEmpty()) {
				// 与信枠残高の取得
				callCredSvSrch01(down0());
			}
		}

		/**
		 * 数量計算
		 */
		protected void calcQty() {

			/*
			 *	基準単位数量を取引単位に換算可能であれば、取引単位で数量指定
			 *	換算不可であれば基準単位で指定する 
			 */
			for (Srch01_DtlR dtlR : down1()) {

				MCNumber convQty = rvrsBaseUnitConv(dtlR.base_unit_qty(),
						dtlR.trd_unit_conv_base_qty(), dtlR.trd_unit_conv_qty(),
						dtlR.trd_unit_dec_place(), dtlR.trd_unit_rnd_typ(), true);
				if (!isNull(convQty)) {
					dtlR.trd_unit_qty(convQty);
				}
				else {
					dtlR.trd_unit_qty(dtlR.base_unit_qty());
					dtlR.trd_unit_cd(dtlR.base_unit_cd());
					dtlR.trd_unit_nm(dtlR.base_unit_nm());
					dtlR.trd_unit_dec_place(dtlR.base_unit_dec_place());
					dtlR.trd_unit_rnd_typ(dtlR.base_unit_rnd_typ());
					dtlR.trd_unit_conv_base_qty(1);
					dtlR.trd_unit_conv_qty(1);
				}
			}

			for (Srch01_IoR ioR : down2()) {

				MCNumber convQty = rvrsBaseUnitConv(ioR.base_unit_qty(),
						ioR.trd_unit_conv_base_qty(), ioR.trd_unit_conv_qty(),
						ioR.trd_unit_dec_place(), ioR.trd_unit_rnd_typ(), true);
				if (!isNull(convQty)) {
					ioR.trd_unit_qty(convQty);
				}
				else {
					ioR.trd_unit_qty(ioR.base_unit_qty());
					ioR.trd_unit_cd(ioR.base_unit_cd());
					ioR.trd_unit_nm(ioR.base_unit_nm());
					ioR.trd_unit_dec_place(ioR.base_unit_dec_place());
					ioR.trd_unit_rnd_typ(ioR.base_unit_rnd_typ());
					ioR.trd_unit_conv_base_qty(1);
					ioR.trd_unit_conv_qty(1);
				}
			}

		}

		protected void calcAmt() {

			// 共通ユーティリティを用いて受注金額をベースに算出
			MSUCL_ConvQtyAmtUtil.ConvQtyAmtUtil_Calc02 ope = MSUCL_ConvQtyAmtUtil.crtConvQtyAmtUtil_Calc02();

			int i = 0;
			MCIndexKey idxkey = down1().createIndex(Srch01_DtlR.$ship_dlv_slip_d_no);
			setPegNo(down1());

			for (MCList<Srch01_DtlR> sloDGL : down1().groupList(Srch01_DtlR.$ship_dlv_slip_d_no)) {

				MCList<Srch01_DtlR> sloDL = down1().subList(idxkey, new String[] {
					sloDGL.get(0).ship_dlv_slip_d_no()
				});

				ConvQtyAmtUtil_Calc01_HdrR hdr = ope.up0().createRow();
				hdr.peg_no(i++);
				copy(hdr, sloDL.get(0),
						createMap_ConvQtyAmtUtil_Calc01_HdrR_Srch01_DtlR(down0()));
				ope.up0().add(hdr);
				addAll(ope.up1(), sloDL,
						createMap_ConvQtyAmtUtil_Calc01_Dtl1R_Srch01_DtlR(hdr.peg_no()));
			}

			ope.exec();

			String[] destCols = new String[] {
					Srch01_DtlR.$trd_cur_upri, Srch01_DtlR.$trd_cur_dscnt_amt,
					Srch01_DtlR.$trd_cur_amt, Srch01_DtlR.$trd_cur_tax_amt,
					Srch01_DtlR.$trd_cur_inc_tax_amt
					,Srch01_DtlR.$wtax_amt
			};
			String[] srcCols = new String[] {
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_upri,
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_dscnt_amt,
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_amt,
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_tax_amt,
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_inc_tax_amt
					,ConvQtyAmtUtil_Calc01_Dtl1R.$wtax_amt
			};

			copyByPegNo(down1(), destCols, ope.down0(), srcCols);

			for (Srch01_DtlR r : down1()) {

				// 基準通貨、納税通貨金額の算出
				MCNumber xrate = down0().xrate();
				MCNumber baseCurUpriDecPlace = down0().base_cur_upri_dec_place();
				MCNumber baseCurAmtDecPlace = down0().base_cur_amt_dec_place();
				String xateRndTyp = down0().xrate_rnd_typ();

				r.base_cur_upri(convToBaseCur(r.trd_cur_upri(), xrate,
						baseCurUpriDecPlace, xateRndTyp));
				r.base_cur_amt(convToBaseCur(r.trd_cur_amt(), xrate, baseCurAmtDecPlace,
						xateRndTyp));
				r.base_cur_inc_tax_amt(convToBaseCur(r.trd_cur_inc_tax_amt(), xrate,
						baseCurAmtDecPlace, xateRndTyp));
				r.base_cur_tax_amt(convToBaseCur(r.trd_cur_tax_amt(), xrate,
						baseCurAmtDecPlace, xateRndTyp));
				r.base_cur_dscnt_amt(convToBaseCur(r.trd_cur_dscnt_amt(), xrate,
						baseCurAmtDecPlace, xateRndTyp));

				MCNumber ptaxXrate = down0().ptax_xrate();
				MCNumber ptaxCurUpriDecPlace = down0().ptax_cur_upri_dec_place();
				MCNumber ptaxCurAmtDecPlace = down0().ptax_cur_amt_dec_place();

				r.ptax_cur_upri(convCur(r.trd_cur_upri(), ptaxXrate, ptaxCurUpriDecPlace,
						xateRndTyp));
				r.ptax_cur_amt(convCur(r.trd_cur_amt(), ptaxXrate, ptaxCurAmtDecPlace,
						xateRndTyp));
				r.ptax_cur_inc_tax_amt(convCur(r.trd_cur_inc_tax_amt(), ptaxXrate,
						ptaxCurAmtDecPlace, xateRndTyp));
				r.ptax_cur_tax_amt(convCur(r.trd_cur_tax_amt(), ptaxXrate,
						ptaxCurAmtDecPlace, xateRndTyp));
				r.ptax_cur_dscnt_amt(convCur(r.trd_cur_dscnt_amt(), ptaxXrate,
						ptaxCurAmtDecPlace, xateRndTyp));

				// 原価金額の算出
				r.cost_amt(MSUCL_SlsUtil.getCostAmt(r.cost_upri(), r.base_unit_qty(), getBaseCur().amt_dec_place()));	
			}
		}

		/**
		 * 紐づく詳細行の項目値がユニークの場合、値を明細にセットする<br>
		 * 対象項目は格付、場所、棚・ライン
		 */
		protected void setIo2DtlL() {

			MCIndexKey idxkey = down2().createIndex(Srch01_IoR.$dtl_row_id);
			for (Srch01_DtlR dtlR : down1()) {

				MCList<Srch01_IoR> ioL = down2().subList(idxkey,
						dtlR.dtl_row_id());

				if (ioL.isEmpty()) {
					continue;
				}
				
				Srch01_IoR ioR = ioL.get(0);

				if (ioL.groupList(Srch01_IoR.$gd_cd).length == 1) {
					dtlR.gd_cd(ioR.gd_cd());
					dtlR.gd_nm(ioR.gd_nm());
				}

				if (ioL.groupList(Srch01_IoR.$loc_cd).length == 1) {
					dtlR.loc_cd(ioR.loc_cd());
					dtlR.loc_nm(ioR.loc_nm());
				}

				if (ioL.groupList(Srch01_IoR.$str_ln_cd).length == 1) {
					dtlR.str_ln_cd(ioR.str_ln_cd());
					dtlR.str_ln_nm(ioR.str_ln_nm());
					dtlR.str_ln_tgt_flg(ioR.str_ln_tgt_flg());
				}
			}

		}

		/**
		 * 	明細と詳細の紐付けＮＯ(dtl_row_id)を設定する
		 */
		protected void setDtlRowId() {
			MCIndexKey idxKey = down2().createIndex(Srch01_IoR.$ship_dlv_slip_d_no);
			int i = 0;
			for (Srch01_DtlR r : down1()) {
				MCList<Srch01_IoR> ioL = down2().subList(idxKey, r.ship_dlv_slip_d_no());
				r.dtl_row_id(i++);
				ioL.setNumberNE(Srch01_IoR.$dtl_row_id, r.dtl_row_id());
			}
		}
	}
	/**
	 * Srch05オペレーション.<p>
	 *
	 * インボイス情報（売上実績）を検索する<br>
	 */
	public class Srch05 extends MSBBL_SlsActReg_MC_A.Srch05 {
		MCList<Srch01_HdrR> _rsltL = MCList.create(Srch01_HdrR.class);
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			int cnt = srchHdr();
			if (isSame(cnt, 0)) {
				return;
			}

			chkRsltHdr();

			cnt = srchDtl();
			if (isSame(cnt, 0)) {
				down0().clear();
				return;
			}
			chkRsltDtl();

			srchIo();
		}

		/**
		 * 	売上実績ヘッダ検索
		 * @return　検索結果件数
		 */
		protected int srchHdr() {
			
			MCQueryPlan sql = MSBBL1310_SLS_ACT_S02();
			sql.addDynamicSQLInfo(MSBBL1310_SLS_ACT_S02_WHERE02());
			int cnt = executeQuery(_rsltL, sql, up0());
			
			if (cnt == 1) {
				down0().setValuesByName(_rsltL.get(0));
			}
			else if (cnt >= 2){
				// ヘッダの検索結果が2行以上の場合は1行にまとめる
				down0().setValuesByName(_rsltL.get(0));
				down0().sls_act_no(null);
				down0().sls_act_rev(null);
				down0().sls_act_seq(null);
				
				// 売上実績がNの場合、明細に保持しておいた更新カウンタを更新時に補完するのでヘッダの更新カウンタはクリア
				down0().upd_cntr(null);
				down0().dlv_slip_no(null);
				down0().trd_cur_amt(null);
				
				if (_rsltL.groupBy(Srch01_HdrR.$sls_dpt_cd).size() != 1) {
					down0().sls_dpt_cd(null);
					down0().sls_dpt_nm(null);
				}
				if (_rsltL.groupBy(Srch01_HdrR.$ar_dpt_cd).size() != 1) {
					down0().ar_dpt_cd(null);
					down0().ar_dpt_nm(null);
				}
				if (_rsltL.groupBy(Srch01_HdrR.$trd_cd).size() != 1) {
					down0().trd_cd(null);
					down0().trd_nm(null);
					down0().trd_ptn_typ(null);
				}
				if (_rsltL.groupBy(Srch01_HdrR.$sls_usr_cd).size() != 1) {
					down0().sls_usr_cd(null);
					down0().sls_usr_nm(null);
				}
				if (_rsltL.groupBy(Srch01_HdrR.$cst_usr_cd).size() != 1) {
					down0().cst_usr_cd(null);
				}
				if (_rsltL.groupBy(Srch01_HdrR.$cst_dpt_cd).size() != 1) {
					down0().cst_dpt_cd(null);
				}
				if (_rsltL.groupBy(Srch01_HdrR.$ship_act_no).size() != 1) {
					down0().ship_act_no(null);
				}
				if (_rsltL.groupBy(Srch01_HdrR.$slo_no).size() != 1) {
					down0().slo_no(null);
					down0().slo_upd_cntr(null);
				}
				if (_rsltL.groupBy(Srch01_HdrR.$qtn_no).size() != 1) {
					down0().qtn_no(null);
					down0().qtn_rev(null);
					down0().qtn_upd_cntr(null);
				}
				if (_rsltL.groupBy(Srch01_HdrR.$cst_po_no).size() != 1) {
					down0().cst_po_no(null);
				}
				if (_rsltL.groupBy(Srch01_HdrR.$ship_dlv_slip_no).size() != 1) {
					down0().ship_dlv_slip_no(null);
				}
			}
			return cnt;
		}

		/**
		 * 	ヘッダの検索結果をチェック
		 */
		protected void chkRsltHdr() {
			// 処理なし
		}

		/**
		 * 	売上実績明細検索
		 */
		protected int srchDtl() {
			int cnt = 0;
			cnt = executeQuery(down1(), MSBBL1310_SLS_ACT_D_S02(), _rsltL);
			
			if(down1().isEmpty()) {
				return cnt;
			}
			
			down0().prnt_lcl_cd(down1().get(0).prnt_lcl_cd());
			// DACチェック
			boolean dacOK = true;
			for(Srch01_DtlR r : down1()){
				if(!readableWgCdDac(r.wg_cd())){
					dacOK = false;
					break;
				}
			}
			
			// DAC条件を満たさない明細が1つでもあれば検索結果なしとする
			if(dacOK) {
				return cnt;
			}
			else {
				down1().clear();
				return 0;
			}
		}

		/**
		 * 	明細の検索結果をチェック
		 */
		protected void chkRsltDtl() {
			// 売上実績明細の仕入直送発注ＮＯや仕入実績ＮＯがセットされている場合は仕入直送売上とみなしエラーとする。
			for (Srch01_DtlR r : down1()) {
				if (!isNull(r.getStringNE(MST_SLS_ACT_D_R.$purc_ddlv_po_no))
						|| !isNull(r.getStringNE(MST_SLS_ACT_D_R.$purc_act_no))) {
					throw new MCAppException(MSBBL0636);
				}
			}
		}

		/**
		 * 	売上実績受払検索
		 */
		protected void srchIo() {
			executeQuery(down2(), MSBBL1310_SLS_ACT_IO_S02(), _rsltL);
		}

		@Override
		protected void editListMain() {
			super.editListMain();

			if (!down1().isEmpty()) {
				calcProfRate(down0(), down1());
			}

			if (!down0().isEmpty()) {
				// 与信枠残高の取得
				callCredSvSrch01(down0());
				// 紐付けIDの設定
				setDtlRowId();
				down0().latest_flg(getLatestFlg());
				if (!isNull(down0().rcv_schd_dt())) {
					down0().bill_basis_dt(null);
				}
			}
		}

		/**
		 * 改訂番号が最新の場合は最新フラグをtrueにする。
		 */
		protected boolean getLatestFlg() {
			if (up0().latest_flg() || MAC_SLIP_STS_TYP.isCRT(down0().slip_sts_typ())) {
					return true;
			}
			return false;
		}

		/**
		 * 	明細と詳細の紐付けＮＯ(dtl_row_id)を設定する
		 */
		protected void setDtlRowId() {
			MCIndexKey idxKey = down2().createIndex(Srch01_IoR.$sls_act_d_no);
			int i = 0;
			for (Srch01_DtlR r : down1()) {
				MCList<Srch01_IoR> ioL = down2().subList(idxKey, r.sls_act_d_no());
				r.dtl_row_id(i++);
				ioL.setNumberNE(Srch01_IoR.$dtl_row_id, r.dtl_row_id());
			}
		}
	}
	
	/**
	 * Srch06オペレーション.<p>
	 *
	 * インボイス情報（売上予定）を検索する<br>
	 */
	public class Srch06 extends MSBBL_SlsActReg_MC_A.Srch06 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			
			editCnd();
			
			int cnt = srchHdr();
			if (isSame(cnt, 0)) {
				return;
			}
			chkRsltHdr();
			
			cnt = srchDtl();
			if (isSame(cnt, 0)) {
				down0().clear();
				return;
			}
			chkRsltDtl();

			srchIo();
			chkRsltIo();

		}
		
		/**
		 * 検索条件の編集
		 */
		protected void editCnd() {
			up0().setDateNE("today", getToday());
		}
		
		/**
		 * 	インボイスヘッダ検索
		 * @return 検索結果件数
		 */
		protected int srchHdr() {
			MCList<Srch01_HdrR> rsltL = MCList.create(Srch01_HdrR.class);
			
			int cnt = executeQuery(rsltL, MSBBL1310_IV_S01(), up0());
			
			initDbcCacheDpt(rsltL);
			
			if (cnt == 1) {
				down0().setValuesByName(rsltL.get(0));
				
				MAM_DPT_R dptR = _cacheMamDpt.get(getToday(), down0().sls_dpt_cd());
				if (!isNull(dptR)) {
					down0().wg_cd(dptR.wg_cd());
					down0().wg_nm(dptR.getStringNE("wg_nm"));
				}
			}
			else if (cnt >= 2){
				// ヘッダの検索結果が2行以上の場合は1行にまとめる
				down0().setValuesByName(rsltL.get(0));
				
				if (rsltL.groupBy(Srch01_HdrR.$sls_dpt_cd).size() != 1) {
					down0().sls_dpt_cd(null);
					down0().sls_dpt_nm(null);
				}
				else {
					MAM_DPT_R dptR = _cacheMamDpt.get(getToday(), down0().sls_dpt_cd());
					if (!isNull(dptR)) {
						down0().wg_cd(dptR.wg_cd());
						down0().wg_nm(dptR.getStringNE("wg_nm"));
					}
				}
				
				if (rsltL.groupBy(Srch01_HdrR.$ar_dpt_cd).size() != 1) {
					down0().ar_dpt_cd(null);
					down0().ar_dpt_nm(null);
				}
				if (rsltL.groupBy(Srch01_HdrR.$trd_cd).size() != 1) {
					down0().trd_cd(null);
					down0().trd_nm(null);
					down0().trd_ptn_typ(null);
				}
				if (rsltL.groupBy(Srch01_HdrR.$sls_usr_cd).size() != 1) {
					down0().sls_usr_cd(null);
					down0().sls_usr_nm(null);
				}
				if (rsltL.groupBy(Srch01_HdrR.$cst_usr_cd).size() != 1) {
					down0().cst_usr_cd(null);
				}
				if (rsltL.groupBy(Srch01_HdrR.$cst_dpt_cd).size() != 1) {
					down0().cst_dpt_cd(null);
				}
				if (rsltL.groupBy(Srch01_HdrR.$ship_act_no).size() != 1) {
					down0().ship_act_no(null);
				}
				if (rsltL.groupBy(Srch01_HdrR.$slo_no).size() != 1) {
					down0().slo_no(null);
					down0().slo_upd_cntr(null);
				}
				if (rsltL.groupBy(Srch01_HdrR.$qtn_no).size() != 1) {
					down0().qtn_no(null);
					down0().qtn_rev(null);
					down0().qtn_upd_cntr(null);
				}
				if (rsltL.groupBy(Srch01_HdrR.$cst_po_no).size() != 1) {
					down0().cst_po_no(null);
				}
				if (rsltL.groupBy(Srch01_HdrR.$ship_dlv_slip_no).size() != 1) {
					down0().ship_dlv_slip_no(null);
				}
				if (rsltL.groupBy(Srch01_HdrR.$trd_rmrks).size() != 1) {
					down0().trd_rmrks(null);
				}
			}
			return cnt;
		}

		/**
		 * 	ヘッダの検索結果をチェック
		 */
		protected void chkRsltHdr() {
			// 処理なし
		}
		
		/**
		 * 	インボイス明細検索
		 */
		protected int srchDtl() {
			down0().addDateColumn("today", getToday());
			int cnt = executeQuery(down1(), MSBBL1310_IV_D_S01(), down0());
			
			if(down1().isEmpty()) {
				return cnt;
			}
			// 検索結果の補完
			for (Srch01_DtlR r : down1()) {
				MAM_DPT_R dptR = _cacheMamDpt.get(getToday(), r.sls_dpt_cd());
				if (!isNull(dptR)) {
					r.wg_cd(dptR.wg_cd());
					r.wg_nm(dptR.getStringNE("wg_nm"));
				}
				r.ac_dt(down0().getDate("today"));
				
				if (r.dlv_slip_d_cnt().gt(1)) {
					r.ship_dlv_slip_d_no(null);
				}
			}
			int i = 1;
			for (Srch01_DtlR r : down1()) {
				r.dtl_row_id(i);
				i++;
			}
			
			// DACチェック
			boolean dacOK = true;
			for(Srch01_DtlR r : down1()){
				if(!readableWgCdDac(r.wg_cd())){
					dacOK = false;
					break;
				}
			}
			// DAC条件を満たさない明細が1つでもあれば検索結果なしとする
			if(dacOK) {
				return cnt;
			}
			else {
				down1().clear();
				return 0;
			}
		}
		
		/**
		 * 	明細の検索結果をチェック
		 */
		protected void chkRsltDtl() {
			/* 預りの場合はインボイス対象外の受注NO検索に合わせ、売上計上区分を出荷基準とする
			 * 預りは預り以外と混ぜて1つのインボイスにできないが、
			 * インボイス登録時に非在庫品が追加されている可能性もあるため、
			 * 1明細でも預りがあれば預り取引」と判定する
			 */
			for (Srch01_DtlR r : down1()) {
				if (r.sls_cststk_flg()) {
					down0().sls_basis_typ(MAC_SLS_BASIS_TYP.SHIP_BASIS.value());
					break;
				}
			}
			
			// 最終的に引継可能な明細が残っていなければエラーとする。
			if (down1().isEmpty()) {
				MCAppException ex = new MCAppException(MSBBL0091);
				throw ex;
			}
		}
		
		/**
		 * 	詳細検索
		 */
		protected void srchIo() {
			for (Srch01_DtlR r : down1()) {
				if (r.sls_cststk_flg() || (MAC_SLS_BASIS_TYP.isSHIP_BASIS(down0().sls_basis_typ()) && isNull(down0().ship_act_no()))) {
					executeQuery(down2(), MSBBL1310_SHIP_ALLOC_STS_S02(), down0());
					return;
				}
			}
			
			if (MAC_VIA_DLV_TYP.isVIA(getViaDlvTyp(down0().iv_no()))) {
				executeQuery(down2(), MSBBL1310_IV_SHIP_ACT_D_S01(), down0());
			}
			else {
				executeQuery(down2(), MSBBL1310_SHIP_ACT_D_S02(), down0());
			}
		}
		
		/**
		 * 	詳細の検索結果をチェック
		 */
		protected void chkRsltIo() {
			// 処理なし
		}
		
		/**
		 * 	明細と詳細の紐付けＮＯ(dtl_row_id)を設定する
		 */
		protected void setDtlRowId() {
			MCIndexKey idxKey = down2().createIndex(Srch01_IoR.$iv_d_no);
			int i = 0;
			for (Srch01_DtlR r : down1()) {
				MCList<Srch01_IoR> ioL = down2().subList(idxKey, r.iv_d_no());
				r.dtl_row_id(i++);
				ioL.setNumberNE(Srch01_IoR.$dtl_row_id, r.dtl_row_id());
			}
		}
		
		@Override
		protected void editListMain() {

			super.editListMain();
			calcQty();
			calcAmt();
			// 明細紐付けＮＯの設定
			setDtlRowId();

			setIo2DtlL();

			// 粗利関連情報の設定
			if (!down1().isEmpty()) {
				calcProfRate(down0(), down1());
			}

			if (!down0().isEmpty()) {
				// 与信枠残高の取得
				callCredSvSrch01(down0());
			}
		}
		
		/**
		 * 数量計算
		 */
		protected void calcQty() {
			/*
			 *	基準単位数量を取引単位に換算可能であれば、取引単位で数量指定
			 *	換算不可であれば基準単位で指定する 
			 */
			for (Srch01_DtlR dtlR : down1()) {

				MCNumber convQty = rvrsBaseUnitConv(dtlR.base_unit_qty(),
						dtlR.trd_unit_conv_base_qty(), dtlR.trd_unit_conv_qty(),
						dtlR.trd_unit_dec_place(), dtlR.trd_unit_rnd_typ(), true);
				if (!isNull(convQty)) {
					dtlR.trd_unit_qty(convQty);
				}
				else {
					dtlR.trd_unit_qty(dtlR.base_unit_qty());
					dtlR.trd_unit_cd(dtlR.base_unit_cd());
					dtlR.trd_unit_nm(dtlR.base_unit_nm());
					dtlR.trd_unit_dec_place(dtlR.base_unit_dec_place());
					dtlR.trd_unit_rnd_typ(dtlR.base_unit_rnd_typ());
					dtlR.trd_unit_conv_base_qty(1);
					dtlR.trd_unit_conv_qty(1);
				}
			}

			for (Srch01_IoR ioR : down2()) {

				MCNumber convQty = rvrsBaseUnitConv(ioR.base_unit_qty(),
						ioR.trd_unit_conv_base_qty(), ioR.trd_unit_conv_qty(),
						ioR.trd_unit_dec_place(), ioR.trd_unit_rnd_typ(), true);
				if (!isNull(convQty)) {
					ioR.trd_unit_qty(convQty);
				}
				else {
					ioR.trd_unit_qty(ioR.base_unit_qty());
					ioR.trd_unit_cd(ioR.base_unit_cd());
					ioR.trd_unit_nm(ioR.base_unit_nm());
					ioR.trd_unit_dec_place(ioR.base_unit_dec_place());
					ioR.trd_unit_rnd_typ(ioR.base_unit_rnd_typ());
					ioR.trd_unit_conv_base_qty(1);
					ioR.trd_unit_conv_qty(1);
				}
			}
		}
		
		protected void calcAmt() {
			
			for (Srch01_DtlR r : down1()) {
				// 基準通貨、納税通貨金額の算出
				MCNumber xrate = down0().xrate();
				MCNumber baseCurUpriDecPlace = down0().base_cur_upri_dec_place();
				MCNumber baseCurAmtDecPlace = down0().base_cur_amt_dec_place();
				String xateRndTyp = down0().xrate_rnd_typ();

				r.base_cur_upri(convToBaseCur(r.trd_cur_upri(), xrate,
						baseCurUpriDecPlace, xateRndTyp));
				r.base_cur_amt(convToBaseCur(r.trd_cur_amt(), xrate, baseCurAmtDecPlace,
						xateRndTyp));
				r.base_cur_inc_tax_amt(convToBaseCur(r.trd_cur_inc_tax_amt(), xrate,
						baseCurAmtDecPlace, xateRndTyp));
				r.base_cur_tax_amt(convToBaseCur(r.trd_cur_tax_amt(), xrate,
						baseCurAmtDecPlace, xateRndTyp));
				r.base_cur_dscnt_amt(convToBaseCur(r.trd_cur_dscnt_amt(), xrate,
						baseCurAmtDecPlace, xateRndTyp));

				MCNumber ptaxXrate = down0().ptax_xrate();
				MCNumber ptaxCurUpriDecPlace = down0().ptax_cur_upri_dec_place();
				MCNumber ptaxCurAmtDecPlace = down0().ptax_cur_amt_dec_place();

				r.ptax_cur_upri(convCur(r.trd_cur_upri(), ptaxXrate, ptaxCurUpriDecPlace,
						xateRndTyp));
				r.ptax_cur_amt(convCur(r.trd_cur_amt(), ptaxXrate, ptaxCurAmtDecPlace,
						xateRndTyp));
				r.ptax_cur_inc_tax_amt(convCur(r.trd_cur_inc_tax_amt(), ptaxXrate,
						ptaxCurAmtDecPlace, xateRndTyp));
				r.ptax_cur_tax_amt(convCur(r.trd_cur_tax_amt(), ptaxXrate,
						ptaxCurAmtDecPlace, xateRndTyp));
				r.ptax_cur_dscnt_amt(convCur(r.trd_cur_dscnt_amt(), ptaxXrate,
						ptaxCurAmtDecPlace, xateRndTyp));

				// 原価金額の算出
				r.cost_amt(MSUCL_SlsUtil.getCostAmt(r.cost_upri(), r.base_unit_qty(), getBaseCur().amt_dec_place()));	
			}
		}
		
		/**
		 * 紐づく詳細行の項目値がユニークの場合、値を明細にセットする<br>
		 * 対象項目は格付、場所、棚・ライン、ロット、サブロット
		 */
		protected void setIo2DtlL() {

			MCIndexKey idxkey = down2().createIndex(Srch01_IoR.$dtl_row_id);
			for (Srch01_DtlR dtlR : down1()) {

				MCList<Srch01_IoR> ioL = down2().subList(idxkey,
						dtlR.dtl_row_id());

				if (ioL.isEmpty()) {
					continue;
				}
				
				Srch01_IoR ioR = ioL.get(0);

				if (ioL.groupList(Srch01_IoR.$gd_cd).length == 1) {
					dtlR.gd_cd(ioR.gd_cd());
					dtlR.gd_nm(ioR.gd_nm());
				}

				if (ioL.groupList(Srch01_IoR.$loc_cd).length == 1) {
					dtlR.loc_cd(ioR.loc_cd());
					dtlR.loc_nm(ioR.loc_nm());
				}

				if (ioL.groupList(Srch01_IoR.$str_ln_cd).length == 1) {
					dtlR.str_ln_cd(ioR.str_ln_cd());
					dtlR.str_ln_nm(ioR.str_ln_nm());
					dtlR.str_ln_tgt_flg(ioR.str_ln_tgt_flg());
				}
				
				/*	明細はインボイス明細トランをSELECTしているが
				 *	分納に対応するため納品明細トランとJOINしていない
				 *	そのため明細のロットが空になるので、詳細のロットが一意なら明細に反映する
				 */
				if (ioL.groupList(Srch01_IoR.$lot_no).length == 1) {
					dtlR.lot_no(ioR.lot_no());
				}
				
				if (ioL.groupList(Srch01_IoR.$sublot_no).length == 1) {
					dtlR.sublot_no(ioR.sublot_no());
				}
			}
		}
	}
	
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 売上実績情報を新規登録・訂正前チェックをします。
	 */
	public class Chk01 extends MSBBL_SlsActReg_MC_A.Chk01 {

		protected MST_SLS_ACT_R _slsAct;

		protected MCList<MST_SLS_ACT_D_R> _slsActDL;

		protected MCList<MST_SLS_ACT_IO_R> _slsActIoL;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			super.doIt();
			
			if (isNull(up0().sls_act_no())) {
				callAprvSrv();
			}
			
			setDown();
		}
		
		protected void editUp() {
			// 売上部門
			MAUCL_DptUtil.setDpt(up0(), Chk01_HdrR.$sls_dpt_cd, Chk01_HdrR.$ac_dt);
			
			// 債権部門
			MAUCL_DptUtil.setDpt(up0(), Chk01_HdrR.$ar_dpt_cd, Chk01_HdrR.$ac_dt);
			
			// 負担部門
			up1().addDateColumn(Chk01_HdrR.$ac_dt);
			up1().setDateNE(Chk01_HdrR.$ac_dt, up0().ac_dt());
			MAUCL_DptUtil.setDpt(up1(), Chk01_DtlR.$bd_dpt_cd, Chk01_HdrR.$ac_dt);
		}

		protected void callAprvSrv() {
			MBBAL_AprvService.Aprv_Chk02 aprvChk02 = MBBAL_AprvService.crtAprv_Chk02();
			MBBAL_AprvService.Aprv_Chk03 aprvChk03 = MBBAL_AprvService.crtAprv_Chk03();
			Aprv_Chk02_Rslt1R chk02Up = aprvChk02.up0().createRow();
			Aprv_Chk02_Rslt1R chk03Up = aprvChk03.up0().createRow();
			
			if (!isNull(up0().slo_aprv_no())) {
				chk02Up.aprv_no(up0().slo_aprv_no());
				chk03Up.aprv_no(up0().slo_aprv_no());
				aprvChk02.up0().add(chk02Up);
				aprvChk03.up0().add(chk03Up);
			}
			else if (!isNull(up0().qtn_aprv_no())) {
				chk02Up.aprv_no(up0().qtn_aprv_no());
				chk03Up.aprv_no(up0().qtn_aprv_no());
				aprvChk02.up0().add(chk02Up);
				aprvChk03.up0().add(chk03Up);
			}
			
			if (!aprvChk02.up0().isEmpty()) {
				aprvChk02.exec();
				copyErrFlg(up0(), aprvChk02.down0().get(0));
			}
			
			if (!up0().err_flg() && !aprvChk03.up0().isEmpty()) {
				aprvChk03.exec();
				copyErrFlg(up0(), aprvChk03.down0().get(0));
			}
		}

		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().addAll(up1());
			down2().addAll(up2());
		}

		@Override
		protected void putListLogicCheckBind() {
			super.putListLogicCheckBind();

			// 明細の負担部門の適用日にヘッダの計上日を設定
			ListLogicBind bdDptBind = getListLogicBind(up1(), Chk01_DtlR.$bd_dpt_cd);
			bdDptBind.putBind(MAUAC_List.DptCols.$i_dt, up0().ac_dt());

			// 明細の納品先の適用日にヘッダの計上日を設定
			ListLogicBind bdDlvBind = getListLogicBind(up1(), Chk01_DtlR.$dlv_cd);
			bdDlvBind.putBind(MAUAC_List.DptCols.$i_dt, up0().sls_dt());
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 更新カウンタチェック、排他ロック獲得
			msgL.addAll(lockAndCheckBase());

			// 有効明細行数チェック
			msgL.addAll(checkAtLeastOneDtl(up0(), up1()));
			msgL.addAll(checkAtLeastOneIo(up1(), up2()));

			// 補完(定型チェック実施前)
			compHdrBase();
			compDtlBase();
			compIoBase();

			return msgL;

		}

		/**
		 * 更新カウンタチェック、排他ロック獲得
		 * @return
		 */
		protected MCMessageList lockAndCheckBase() {

			MCMessageList msgL = new MCMessageList();

			// 売上実績
			msgL.addAll(lockAndCheckSlsAct());

			// 見積
			if (msgL.isEmpty()) {
				msgL.addAll(lockAndCheckQtn());
			}
			// 受注
			if (msgL.isEmpty()) {
				msgL.addAll(lockAndCheckSlo());
			}
			// インボイス
			if (msgL.isEmpty()) {
				msgL.addAll(lockAndCheckIv());
			}
			// 出荷進捗
			if (msgL.isEmpty()) {
				msgL.addAll(lockAndCheckShipPr());
			}
			// 売上予定
			if (msgL.isEmpty()) {
				msgL.addAll(lockAndCheckSlsSchd());
			}
			return msgL;
		}

		/**
		 * 	売上実績情報の更新カウンタチェック、排他ロック獲得、補完
		 * 	<p>
		 * 	[補完項目]<br>
		 * 	売上実績改訂番号、売上予定ＮＯ、基準単位数量(更新前)
		 * 	</p><br>
		 * @return
		 */
		protected MCMessageList lockAndCheckSlsAct() {

			MCMessageList msgL = new MCMessageList();

			if (!isNull(up0().sls_act_no())) {

				_slsAct = MST_SLS_ACT_R.create();
				_slsActDL = MCList.create(MST_SLS_ACT_D_R.class);
				_slsActIoL = MCList.create(MST_SLS_ACT_IO_R.class);

				// 1.売上実績 (排他ロック獲得/更新カウンタチェック)
				dbSelectKeyForUpdateNoWait("MSBBL1310_MST_SLS_ACT_S01", _slsAct,
						MCQueryApiBuilder.create(MST_SLS_ACT_R.create("T")), up0());
				msgL.addAll(checkUpdCntrNE(up0(), Chk01_HdrR.$upd_cntr, _slsAct));

				// 改訂番号を補完
				up0().sls_act_rev(_slsAct.sls_act_rev());
				// 売上計上区分
				up0().sls_basis_typ(_slsAct.sls_basis_typ());

				// 2.売上実績明細
				MAVM_ITM_UNIT_R v1 = MAVM_ITM_UNIT_R.create("V1");
				MST_SLS_ACT_D_R slsActDL_t = MST_SLS_ACT_D_R.create("T");
				MCQueryApiBuilder slsActDL_bldr = MCQueryApiBuilder.create(slsActDL_t);
				slsActDL_bldr.addSelect(v1.conv_qty);
				slsActDL_bldr.addSelect(v1.conv_base_qty);
				slsActDL_bldr.addSelect(v1.dec_place);
				slsActDL_bldr.addSelect(v1.rnd_typ);
				slsActDL_bldr.addLeftOuterJoin(v1, bracket(slsActDL_t.itm_cd.eq(v1.itm_cd)
						.and(slsActDL_t.itm_sub1.eq(v1.itm_sub1))
						.and(slsActDL_t.itm_sub2.eq(v1.itm_sub2))
						.and(slsActDL_t.itm_sub3.eq(v1.itm_sub3))
						.and(slsActDL_t.trd_unit_cd.eq(v1.unit_cd))));
				slsActDL_bldr.setWhere(slsActDL_t.sls_act_no.eq(bind("sls_act_no"))
						.and(slsActDL_t.sls_act_seq.eq(bind("sls_act_seq"))), up0());
				slsActDL_bldr.setOrderByAsc(slsActDL_bldr.getBaseDbc().getKeyColumn$());
				slsActDL_bldr.setLockTable(slsActDL_t.sls_act_d_no);
				dbSelectForUpdate("MSBBL1310_MST_SLS_ACT_D_S01", _slsActDL, slsActDL_bldr);

				MCIndexKey idxDtlKey = _slsActDL.createIndex(slsActDL_t.getKeyColumn());

				for (Chk01_DtlR r : up1()) {

					if (!isNull(r.sls_act_d_no())) {
						MST_SLS_ACT_D_R slsActD = _slsActDL.getFirst(idxDtlKey,
								r.toArray(slsActDL_t.getKeyColumn()));
						if (isNull(slsActD)) {
							// 基本的にはありえないはず(ヘッダの更新カウンタチェックでエラーになるため到達しない)
							msgL.addAll(getRecordNotFoundMsg(getModuleID(),
									slsActDL_t.tableName(), slsActDL_t.getKeyColumn(),
									r.toArray(slsActDL_t.getKeyColumn()), r));
						}
						else {
							// 売上予定ＮＯを補完
							r.sls_schd_no(slsActD.sls_schd_no());
							// 基準単位数量を補完（引継数量超過チェックで使用）
							r.old_base_unit_qty(slsActD.base_unit_qty());
							r.trd_unit_conv_qty();
							// 見積更新に必要な情報を補完
							if (r.isStatusDelete()) {
								r.trd_unit_conv_base_qty(slsActD.getNumberNE("conv_qty"));
								r.trd_unit_conv_qty(slsActD.getNumberNE("conv_base_qty"));
								r.trd_unit_dec_place(slsActD.getNumberNE("dec_place"));
								r.trd_unit_rnd_typ(slsActD.getStringNE("rnd_typ"));
							}
						}
					}
				}

				// 3.売上実績受払
				MST_SLS_ACT_D_R t2 = MST_SLS_ACT_D_R.create("T2");
				MST_SLS_ACT_IO_R slsActIoL_t = MST_SLS_ACT_IO_R.create("T");
				MCQueryApiBuilder slsActIoL_bldr = MCQueryApiBuilder.create(slsActIoL_t);
				slsActIoL_bldr.addInnerJoin(t2, bracket(slsActIoL_t.sls_act_d_no.eq(t2.sls_act_d_no)
						.and(slsActIoL_t.sls_act_d_seq.eq(t2.sls_act_d_seq))));
				slsActIoL_bldr.setWhere(t2.sls_act_no.eq(bind("sls_act_no"))
						.and(t2.sls_act_seq.eq(bind("sls_act_seq"))), up0());
				slsActIoL_bldr
						.setOrderByAsc(slsActIoL_bldr.getBaseDbc().getKeyColumn$());
				dbSelectForUpdate("MSBBL1310_MST_SLS_ACT_IO_S02", _slsActIoL, slsActIoL_bldr);
				slsActDL_bldr.setLockTable(slsActIoL_t.sls_act_io_no);

				MCIndexKey idxIoKey = _slsActIoL.createIndex(slsActIoL_t.getKeyColumn());

				for (Chk01_IoR r : up2()) {

					if (!isNull(r.sls_act_io_no())) {
						MST_SLS_ACT_IO_R slsActIo = _slsActIoL.getFirst(idxIoKey,
								r.toArray(slsActIoL_t.getKeyColumn()));
						if (isNull(slsActIo)) {
							msgL.addAll(getRecordNotFoundMsg(getModuleID(),
									slsActIoL_t.tableName(), slsActIoL_t.getKeyColumn(),
									r.toArray(slsActIoL_t.getKeyColumn()), r));
						}
						else {
							// 今のところ補完なし
						}
					}
				}
			}
			return msgL;
		}

		/**
		 * 	受注情報の更新カウンタチェック、排他ロック獲得、補完処理
		 * <p>
		 * 	[補完項目]<br>
		 * 	承認対象ＦＬＧ、承認ＮＯ、受注単価（基準単位換算）、受注明細基準単位数量、受注ＮＯ、出荷進捗ＮＯ
		 * </p></br>
		 * @return
		 */
		protected MCMessageList lockAndCheckSlo() {

			MCMessageList msgL = new MCMessageList();

			if (!isNull(up0().slo_no())) {
				MST_SLO_R t = MST_SLO_R.create("T");
				MAM_BP_R t2 = MAM_BP_R.create("T2");

				MST_SLO_R slo = MST_SLO_R.create();
				MCQueryApiBuilder slo_bldr = MCQueryApiBuilder.create(t);
				slo_bldr.setSelect(t.slo_no);
				slo_bldr.addSelect(t.aprv_flg);
				slo_bldr.addSelect(t.aprv_no);
				slo_bldr.addSelect(t.upd_cntr);
				slo_bldr.addSelect(t.sls_basis_typ);
				slo_bldr.addSelect(t2.sls_upri_rnd_typ);
				slo_bldr.addLeftOuterJoin(t2, bracket(t.cst_cd.eq(t2.bp_cd)));
				slo_bldr.setLockTable(t.slo_no);
				dbSelectKeyForUpdate("MSBBL1310_MST_SLO_S01", slo, slo_bldr, up0());
				msgL.addAll(checkUpdCntrNE(up0(), Chk01_HdrR.$slo_upd_cntr, slo));

				if (!msgL.isEmpty()) {
					return msgL;
				}

				up0().slo_aprv_flg(slo.aprv_flg());
				up0().slo_aprv_no(slo.aprv_no());
				if (isNull(up0().sls_basis_typ())) {
					up0().sls_basis_typ(slo.sls_basis_typ());
				}

				// 受注明細のチェックと補完
				MST_SLO_D_R t1 = MST_SLO_D_R.create("T1");
				MAVM_ITM_UNIT_R v1 = MAVM_ITM_UNIT_R.create("V1");
				MAVM_ITM_UNIT_R v2 = MAVM_ITM_UNIT_R.create("V2");
				MAM_TAX_R m1 = MAM_TAX_R.create("M1");
				MAM_ITM_R m2 = MAM_ITM_R.create("M2");

				MCList<MST_SLO_D_R> sloDL = MCList.create(MST_SLO_D_R.class);
				MCQueryApiBuilder sloDL_bldr = MCQueryApiBuilder.create(t1);
				sloDL.addBooleanColumn("inc_tax_flg");
				sloDL.addBooleanColumn("dscnt_itm_flg");
				sloDL_bldr.setSelect(t1.slo_d_no);
				sloDL_bldr.addSelect(t1.slo_no);
				sloDL_bldr.addSelect(t1.trd_unit_cd);
				sloDL_bldr.addSelect(t1.trd_unit_qty);
				sloDL_bldr.addSelect(t1.trd_cur_upri);
				sloDL_bldr.addSelect(t1.trd_cur_amt);
				sloDL_bldr.addSelect(t1.trd_cur_tax_amt);
				sloDL_bldr.addSelect(t1.trd_cur_dscnt_amt);
				sloDL_bldr.addSelect(t1.base_unit_cd);
				sloDL_bldr.addSelect(t1.base_unit_qty);
				sloDL_bldr.addSelect(t1.sno1_null_flg);
				sloDL_bldr.addSelect(t1.sno2_null_flg);
				sloDL_bldr.addSelect(t1.sno3_null_flg);
				sloDL_bldr.addSelect(t1.sno4_null_flg);
				sloDL_bldr.addSelect(v1.conv_qty);
				sloDL_bldr.addSelect(v1.conv_base_qty);
				sloDL_bldr.addSelect(v1.dec_place);
				sloDL_bldr.addSelect(v1.rnd_typ);
				sloDL_bldr.addSelect(v2.conv_qty.as("base_unit_conv_qty"));
				sloDL_bldr.addSelect(v2.conv_base_qty.as("base_unit_conv_base_qty"));
				sloDL_bldr.addSelect(v2.dec_place.as("base_unit_dec_place"));
				sloDL_bldr.addSelect(v2.rnd_typ.as("base_unit_rnd_typ"));
				sloDL_bldr.addSelect(m1.tax_rate);
				sloDL_bldr.addSelect(m1.inc_tax_flg);
				sloDL_bldr.addSelect(m2.dscnt_itm_flg);
				sloDL_bldr.addLeftOuterJoin(v1, bracket(t1.itm_cd.eq(v1.itm_cd)
						.and(t1.itm_sub1.eq(v1.itm_sub1))
						.and(t1.itm_sub2.eq(v1.itm_sub2))
						.and(t1.itm_sub3.eq(v1.itm_sub3))
						.and(t1.trd_unit_cd.eq(v1.unit_cd))));
				sloDL_bldr.addLeftOuterJoin(v2, bracket(t1.itm_cd.eq(v2.itm_cd)
						.and(t1.itm_sub1.eq(v2.itm_sub1))
						.and(t1.itm_sub2.eq(v2.itm_sub2))
						.and(t1.itm_sub3.eq(v2.itm_sub3))
						.and(t1.base_unit_cd.eq(v2.unit_cd))));
				sloDL_bldr.addLeftOuterJoin(m1, bracket(t1.tax_cd.eq(m1.tax_cd)));
				sloDL_bldr.addLeftOuterJoin(m2, bracket(t1.itm_cd.eq(m2.itm_cd)
						.and(t1.itm_sub1.eq(m2.itm_sub1))
						.and(t1.itm_sub2.eq(m2.itm_sub2))
						.and(t1.itm_sub3.eq(m2.itm_sub3))));
				dbSelectKey("MSBBL1310_MST_SLO_D_S01", sloDL, sloDL_bldr, up1());
				MCIndexKey idxKey = sloDL.createIndex(sloDL.createRow().getKeyColumn());
				for (Chk01_DtlR r : up1()) {
					// 受注引継だが、登録時に明細行を追加した場合を考慮して、
					// 受注明細ＮＯがＮＵＬＬの場合、処理をスキップする
					if (isNull(r.slo_d_no())) {
						continue;
					}
					MST_SLO_D_R sloD = sloDL.getFirst(idxKey,
							r.toArray(sloDL.createRow().getKeyColumn()));
					if (isNull(sloD)) {
						msgL.addAll(getRecordNotFoundMsg(getModuleID(), sloDL.createRow().tableName(),
								sloDL.createRow().getKeyColumn(), new String[] {
									r.slo_d_no()
								}, r));
						continue;
					}

					if (!isSame(sloD.slo_no(), up0().slo_no())) {
						msgL.addAll(getRecordInvalidMsg(Chk01_HdrR.$slo_no, sloD, r));
						continue;
					}

					r.slo_no(sloD.slo_no());
					r.src_trd_unit_cd(sloD.trd_unit_cd());
					r.src_trd_unit_qty(sloD.trd_unit_qty());
					r.src_trd_cur_upri(sloD.trd_cur_upri());
					r.src_trd_cur_amt(sloD.trd_cur_amt());
					r.src_trd_cur_tax_amt(sloD.trd_cur_tax_amt());
					r.src_trd_cur_inc_tax_amt(sloD.trd_cur_amt().add(sloD.trd_cur_tax_amt()));
					r.src_trd_cur_dscnt_amt(nvl(sloD.trd_cur_dscnt_amt(), MCNumber.ZERO));
					r.src_trd_unit_conv_qty(sloD.getNumberNE("conv_qty"));
					r.src_trd_unit_conv_base_qty(sloD.getNumberNE("conv_base_qty"));
					r.src_trd_unit_dec_place(sloD.getNumberNE("dec_place"));
					r.src_trd_unit_rnd_typ(sloD.getStringNE("rnd_typ"));
					r.slo_tax_rate(sloD.getNumberNE("tax_rate"));
					r.slo_inc_tax_flg(sloD.getBooleanNE("inc_tax_flg"));
					r.slo_base_unit_conv_qty(sloD.getNumberNE("base_unit_conv_qty"));
					r.slo_base_unit_conv_base_qty(sloD.getNumberNE("base_unit_conv_base_qty"));
					r.slo_base_unit_dec_place(sloD.getNumberNE("base_unit_dec_place"));
					r.slo_base_unit_rnd_typ(sloD.getStringNE("base_unit_rnd_typ"));
					r.slo_base_unit_cd(sloD.base_unit_cd());
					r.dscnt_itm_flg(sloD.getBooleanNE("dscnt_itm_flg"));
					if (r.isStatusDelete()) {
						r.trd_unit_conv_qty();
					}
					r.sno1_null_flg(sloD.sno1_null_flg());
					r.sno2_null_flg(sloD.sno2_null_flg());
					r.sno3_null_flg(sloD.sno3_null_flg());
					r.sno4_null_flg(sloD.sno4_null_flg());
				}
			}
			return msgL;
		}

		/**
		 * 	売上予定の排他ロック獲得、補完
		 * <p>
		 * 	[補完項目]<br>
		 * 	打切ＦＬＧ、出荷予定ＮＯ、基準単位打切数量、基準単位売上数量、基準単位数量
		 * </p></br>
		 * @return
		 */
		protected MCMessageList lockAndCheckSlsSchd() {

			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_DtlR> notErrL = getChkList(up1());
			notErrL.addNumberColumn("sum_base_unit_sls_qty");
			notErrL.addNumberColumn("sum_base_unit_abort_qty");
			notErrL.addNumberColumn("sum_base_unit_qty");
			for (Chk01_DtlR r : notErrL) {
				if (!isNull(r.sls_schd_no()) || !isNull(r.slo_d_no())) {

					MST_SLS_SCHD_R sSche = MST_SLS_SCHD_R.create();
					MST_SLS_SCHD_R sScheSum = MST_SLS_SCHD_R.create();
					MST_SLS_SCHD_R t = MST_SLS_SCHD_R.create("T");
					MCQueryApiBuilder sSche_bldr = MCQueryApiBuilder.create(t);
					if (!isNull(r.sls_schd_no())) {
						// 売上予定ＮＯが売上実績明細から補完済の場合
						dbSelectKeyForUpdate("MSBBL1310_MST_SLS_SCHD_S01", sSche, sSche_bldr, r);
						// インボイス対象の預り、または出荷指図対象外の場合は出荷予定NOを補完
						if (!isNull(r.iv_d_no()) &&
								(r.sls_cststk_flg() || (MAC_SLS_BASIS_TYP.isSHIP_BASIS(up0().sls_basis_typ()) && !MSC_IV_SRC_TYP.isSLS(up0().iv_src_typ())))) {
							MST_IV_MAP_R t1 = MST_IV_MAP_R.create("T1");
							MST_SLS_SCHD_R t2 = MST_SLS_SCHD_R.create("T2");
							
							MCList<MST_IV_MAP_R> rslt = MCList.create(MST_IV_MAP_R.class);
							MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t1);
							bldr.setSelect(t1.ship_schd_no);
							bldr.addLeftOuterJoin(t2, bracket(t1.iv_d_no.eq(t2.iv_d_no)));
							bldr.setWhere(t2.sls_schd_no.eq(bind("sls_schd_no")));
							dbSelect("MSBBL1310_MST_SLS_SCHD_S06", rslt, bldr, r);
							sSche.ship_schd_no(rslt.get(0).ship_schd_no());
						}
					}
					else {
						// 売上実績登録前は受注明細ＮＯで検索
						sSche_bldr.setWhere(t.slo_d_no.eq(bind("slo_d_no")));
						if (!isNull(r.dlv_slip_d_no())) {
							sSche_bldr.addWhereWithAnd(t.dlv_slip_d_no.eq(bind("dlv_slip_d_no")));
						} 
						else {
							sSche_bldr.addWhereWithAnd(t.dlv_slip_d_no.isNull());
						}
						dbSelectForUpdate("MSBBL1310_MST_SLS_SCHD_S02", sSche, sSche_bldr, r);
					}
					if (sSche.isEmpty()) {
						msgL.addAll(getRecordNotFoundMsg(getModuleID(),
								sSche.tableName(), new String[] {
									MST_SLS_SCHD_R.$slo_d_no
								}, new String[] {
									r.slo_d_no()
								}, r));
					}
					else {
						r.sls_schd_no(sSche.sls_schd_no());
						r.old_abort_flg(sSche.abort_flg());
						r.ship_schd_no(sSche.ship_schd_no());
						r.base_unit_abort_qty(sSche.base_unit_abort_qty());
						r.base_unit_sls_qty(sSche.base_unit_sls_qty());
						r.sls_schd_base_unit_qty(sSche.base_unit_qty());
						if (!isNull(r.slo_d_no())) {
							MST_SLS_SCHD_R t1 = MST_SLS_SCHD_R.create("T");
							MCQueryApiBuilder sScheSum_bldr = MCQueryApiBuilder.create(t1);
							sScheSum_bldr.setSelect(nvl(sum(t1.base_unit_abort_qty), value(0)).as("sum_base_unit_abort_qty"));	// 打切数量
							sScheSum_bldr.addSelect(nvl(sum(t1.base_unit_sls_qty), value(0)).as("sum_base_unit_sls_qty"));		// 売上済数量
							sScheSum_bldr.addSelect(nvl(sum(t1.base_unit_qty), value(0)).as("sum_base_unit_qty"));				// 売上予定数量
							sScheSum_bldr.setWhere(t1.slo_d_no.eq(bind("slo_d_no")));
							dbSelect("MSBBL1310_MST_SLS_SCHD_S03", sScheSum, sScheSum_bldr, r);
							r.setNumberNE("sum_base_unit_sls_qty", sScheSum.getNumberNE("sum_base_unit_sls_qty"));
							r.setNumberNE("sum_base_unit_abort_qty", sScheSum.getNumberNE("sum_base_unit_abort_qty"));
							r.setNumberNE("sum_base_unit_qty", sScheSum.getNumberNE("sum_base_unit_qty"));
						}
						else {
							r.setNumberNE("sum_base_unit_sls_qty", sSche.base_unit_sls_qty());
							r.setNumberNE("sum_base_unit_abort_qty", sSche.base_unit_abort_qty());
							r.setNumberNE("sum_base_unit_qty", sSche.base_unit_qty());
						}
					}
				}
			}
			return msgL;
		}

		/**
		 * 	出荷進捗の更新カウンタチェック、排他ロック獲得
		 * @return
		 */
		protected MCMessageList lockAndCheckShipPr() {

			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_DtlR> notErrL = getChkList(up1());
			for (Chk01_DtlR r : notErrL) {
				if (!isNull(r.slo_d_no())) {

					MST_SHIP_PR_R shipPr = MST_SHIP_PR_R.create();
					MST_SHIP_PR_R t = MST_SHIP_PR_R.create("T");
					MCQueryApiBuilder shipPr_bldr = MCQueryApiBuilder.create(t);
					shipPr_bldr.setWhere(t.slo_d_no.eq(bind("slo_d_no")));
					dbSelectForUpdate("MSBBL1310_MST_SHIP_PR_S01", shipPr, shipPr_bldr, r);
					
					msgL.addAll(checkUpdCntrNE(r, Chk01_DtlR.$ship_pr_upd_cntr, shipPr));

					if (!shipPr.isEmpty()) {
						r.ship_pr_no(shipPr.ship_pr_no());
						r.setNumberNE("pr_base_unit_qty", shipPr.base_unit_qty());
					}
				}
			}

			return msgL;
		}

		/**
		 * 	見積情報の更新カウンタチェック、排他ロック獲得
		 * @return
		 */
		protected MCMessageList lockAndCheckQtn() {

			MCMessageList msgL = new MCMessageList();
			if (!isNull(up0().qtn_no()) && isNull(up0().slo_no())) {
				MST_QTN_R qtn = MST_QTN_R.create();
				dbSelectKeyForUpdate("MSBBL1310_MST_QTN_S01", qtn,
						MCQueryApiBuilder.create(MST_QTN_R.create("T")), up0());
				msgL.addAll(checkUpdCntrNE(up0(), Chk01_HdrR.$qtn_upd_cntr, qtn));

				if (!qtn.isEmpty()) {
					up0().qtn_aprv_flg(qtn.aprv_flg());
					up0().qtn_aprv_no(qtn.aprv_no());
				} 

			}
			return msgL;
		}
		/**
		 * 	インボイス情報の更新カウンタチェック、排他ロック獲得
		 * @return
		 */
		protected MCMessageList lockAndCheckIv() {
			MCMessageList msgL = new MCMessageList();
			if (!isNull(up0().iv_no())) {
				MST_IV_R iv = MST_IV_R.create();
				dbSelectKeyForUpdate("MSBBL1310_MST_IV_S01", iv,
						MCQueryApiBuilder.create(MST_IV_R.create("T")), up0());
				msgL.addAll(checkUpdCntrNE(up0(), Chk01_HdrR.$iv_upd_cntr, iv));
			}
			return msgL;
		}
		/**
		 * 	ヘッダ情報の補完処理(定型チェック実施前)
		 */
		protected void compHdrBase() {
		}

		/**
		 * 	明細情報の補完処理(定型チェック実施前)
		 */
		protected void compDtlBase() {
		}

		/**
		 * 	詳細情報の補完処理(定型チェック実施前)
		 */
		protected void compIoBase() {

			// LIST_LOGIC定型処理で品目単位マスタのチェック前に明細から品目情報をコピーする
			MCIndexKey idxKey = up2().createIndex(Chk01_IoR.$dtl_row_id);
			for (Chk01_DtlR r : up1()) {
				MCList<Chk01_IoR> ioL = up2().subList(idxKey, r.dtl_row_id());
				for (Chk01_IoR r2 : ioL) {
					r2.itm_cd(r.itm_cd());
					r2.itm_sub1(r.itm_sub1());
					r2.itm_sub2(r.itm_sub2());
					r2.itm_sub3(r.itm_sub3());
					r2.lot_mng_typ(r.lot_mng_typ());
					r2.sublot_mng_typ(r.sublot_mng_typ());
					r2.stk_mng_typ(r.stk_mng_typ());
					r2.ver_flg(r.ver_flg());
				}
			}
		}

		/**
		 * 詳細0件チェックのユーティリティメソッド
		 * <p>明細に紐づく詳細行が1件以上存在すること</p>
		 * @param dtlL
		 * @param ioL
		 * @return
		 */
		protected MCMessageList checkAtLeastOneIo(MCList<Chk01_DtlR> dtlL,
				MCList<Chk01_IoR> ioL) {
			MCMessageList msgL = new MCMessageList();

			for (Chk01_DtlR parDtl : dtlL.subList(CREATE,MODIFY, NONE)) {
				MCList<Chk01_IoR> chdIoL = getChildIoL(ioL, parDtl).subList(CREATE,
						MODIFY, NONE);
				if (chdIoL.isEmpty()) {
					msgL.add(new mcframe.commonCore.notice.MCMessage(parDtl, null,
							MAUDL0012, toDispGUIIndex(parDtl)));
				}
			}
			return msgL;
		}

		@Override
		protected MCMessageList doServerCheck() {
			MCMessageList msgL = super.doServerCheck();
			
			if (hasErrFlgOn(up0(), up1(), up2())) {
				return msgL;
			}
			
			// 品目マスタ存在チェック
			msgL.addAll(checkMamItm());
			
			return msgL;
		}
		
		/**
		 * 品目マスタ存在チェック
		 * <p>新規については既存処理でチェック。訂正と、訂正の行削除についてのみチェックを行う。</p>
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList checkMamItm() {
			
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_DtlR> chkTgtL= up1().subList(MODIFY, DELETE);
			
			if (!isNull(chkTgtL)) {
				MCList<MAM_ITM_R> mamItmL = searchMamItm(_slsActDL);
				
				MCIndexKey mamItmIdx = mamItmL.createIndex(MAM_ITM_R.create().getKeyColumn());
				MCIndexKey slsActDIdx = _slsActDL.createIndex(MST_SLS_ACT_D_R.$sls_act_d_no);
				
				for (Chk01_DtlR chkTgtR : chkTgtL) {
					MST_SLS_ACT_D_R slsActDR = MST_SLS_ACT_D_R.create();
					slsActDR = _slsActDL.getFirst(slsActDIdx, chkTgtR.sls_act_d_no());
					
					if (chkTgtR.isStatusDelete()
							|| !(isSame(chkTgtR.itm_cd(), slsActDR.itm_cd())
							&& isSame(chkTgtR.itm_sub1(), slsActDR.itm_sub1())
							&& isSame(chkTgtR.itm_sub2(), slsActDR.itm_sub2())
							&& isSame(chkTgtR.itm_sub3(), slsActDR.itm_sub3()))){
						if (isNull(mamItmL.getFirst(mamItmIdx, slsActDR.itm_cd(), slsActDR.itm_sub1(), slsActDR.itm_sub2(), slsActDR.itm_sub3()))) {
							String itmInfo = toDispItm(slsActDR.itm_cd(), slsActDR.itm_sub1(), slsActDR.itm_sub2(), slsActDR.itm_sub3());
							msgL.add(new MCMessage(chkTgtR, null, MAUAL0189, itmInfo, toDispGUIIndex(chkTgtR)));
						}
					}
				}
			}
			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			
			if (hasErrFlgOn(up0(), up1(), up2())) {
				return msgL;
			}

			// 補完補完(定型チェック実施後)
			compHdrSub();
			compDtlSub();
			compIoSub();

			// DAC更新権限チェック
			if (!up0().cst_iv_flg()) {
				msgL.addAll(checkWritableDptCdDac(up0(), Chk01_HdrR.$sls_dpt_cd));
			}
			else {
				for (Chk01_DtlR r : up1()) {
					msgL.addAll(checkWritableWgCdDac(r, Chk01_DtlR.$wg_cd));
				}
			}
			// 訂正前の売上部門に対してDAC更新権限チェック
			if (!isNull(up0().sls_act_no()) && !isNull(_slsAct)) {
				if (!up0().cst_iv_flg()) {
					msgL.addAll(checkWritableDptCdDac(_slsAct, MST_SLS_ACT_R.$sls_dpt_cd));
				}
				else {
					msgL.addAll(checkWritableWgCdDac(_slsAct, MST_SLS_ACT_R.$wg_cd));
				}
			}

			// 条件付き必須チェック
			msgL.addAll(checkReqSub());

			// 条件付き存在チェック
			msgL.addAll(checkExistsSub());	
			
			// 固有チェック
			msgL.addAll(checkOther());

			// インボイス更新前チェック呼出
			callExActSvChk02();

			// その他のチェック処理
			msgL.addAll(checkAtLeastOneDtl(up0(), up1()));

			return msgL;
		}

		/**
		 * 	条件付き必須チェック
		 * @return
		 */
		protected MCMessageList checkReqSub() {
			MCMessageList msgL = new MCMessageList();
			
			if (!MAC_BILL_CL_TYP.isEACH_SLS(up0().bill_cl_typ())) {
				// 請求締区分が売上都度請求以外の場合は必須とする
				msgL.addAll(check(up0(), Chk01_HdrR.$bill_basis_dt, new FXUCL_RequiredValidater()));
			}
			MCList<Chk01_DtlR> notErrDtlL = getChkList(up1(), CREATE, MODIFY, NONE);
			
			// インボイス対象のときは明細の部門が表示されて必須となるのでヘッダの部門は任意
			if (up0().cst_iv_flg()) {
				if (MAC_BILL_CL_TYP.isEACH_SLS(up0().bill_cl_typ())) {
					msgL.addAll(check(up0(), Chk01_HdrR.$rcv_schd_dt, new FXUCL_RequiredValidater()));
				}
				for (Chk01_DtlR r : notErrDtlL) {
					msgL.addAll(check(r, Chk01_DtlR.$sls_dpt_cd, new FXUCL_RequiredValidater()));
					msgL.addAll(check(r, Chk01_DtlR.$ar_dpt_cd, new FXUCL_RequiredValidater()));
				}
			}
			else {
				msgL.addAll(check(up0(), Chk01_HdrR.$sls_dpt_cd, new FXUCL_RequiredValidater()));
				msgL.addAll(check(up0(), Chk01_HdrR.$ar_dpt_cd, new FXUCL_RequiredValidater()));
			}
			
			for (Chk01_DtlR r : notErrDtlL) {
				if (r.trd_cur_upri().isZero() && isNull(r.sls_rsn_cd())) {
					msgL.add(new MCMessage(r, Chk01_DtlR.$sls_rsn_cd, MSBBL0293, toDispGUIIndex(r)));
				}
			}
			
			MCList<Chk01_IoR> notErrIoL = getChkList(up2(), CREATE, MODIFY, NONE);

			// 詳細
			for (Chk01_IoR r : notErrIoL) {

				// ロットＮＯ
				// 品目がロット管理対象の場合
				if (MAC_LOT_MNG_TYP.req_lot(r.lot_mng_typ())) {
					msgL.addAll(check(r, Chk01_IoR.$lot_no, new FXUCL_RequiredValidater()));
				}
				// 品目がロット管理対象外の場合
				else {
					r.lot_no(MAC_STR.NULL_VAL.value());
				}

				// サブロットＮＯ
				// 品目がサブロット管理対象の場合
				if (MAC_SUBLOT_MNG_TYP.req_lot(r.sublot_mng_typ())) {
					msgL.addAll(check(r, Chk01_IoR.$sublot_no, new FXUCL_RequiredValidater()));
				}
				// 品目がサブロット管理対象外の場合
				else {
					r.sublot_no(MAC_STR.NULL_VAL.value());
				}

				// 版ＮＯ
				// 品目が版管理対象の場合
				if (r.ver_flg() && isNull(r.ver_no())) {
					msgL.addAll(check(r, Chk01_IoR.$ver_no, new FXUCL_RequiredValidater()));
				}

				// 格付ＣＤ
				if (!isNull(r.stk_mng_typ()) && MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())) {
					msgL.addAll(check(r, Chk01_IoR.$gd_cd,	new FXUCL_RequiredValidater()));
				}
				// 場所ＣＤ
				if (!(isNull(up1().getFirst(Chk01_DtlR.$dtl_peg_no, r.dtl_peg_no()).slo_d_no())) && !isNull(up0().iv_no())) {
					// インボイス登録でマニュアルで追加した明細はチェックしない
					msgL.addAll(check(r, Chk01_IoR.$loc_cd, new FXUCL_RequiredValidater()));
				}
			}

			return msgL;
		}

		/**
		 * 	条件付き存在チェック
		 * @return
		 */
		protected MCMessageList checkExistsSub() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_DtlR> notErrDtlL = getChkList(up1(), CREATE, MODIFY, NONE);
			for (Chk01_DtlR r : notErrDtlL) {

				// 見積明細の存在チェック＋補完
				msgL.addAll(checkPlusQtnDExists(up0(), r));

				// 納品伝票明細の存在チェック＋補完
				msgL.addAll(checkPlusDlvSlipDExists(up0(), r));

			}
			
			MCList<Chk01_IoR> notErrIoL = getChkList(up2(), CREATE, MODIFY, NONE);
			for (Chk01_IoR r : notErrIoL) {
				// ロット情報存在チェック
				msgL.addAll(lotInf(r));
			}

			return msgL;
		}
		
		/**
		 * 版管理対象の場合、ロット管理情報に登録された組み合わせかチェック
		 * @param r
		 * @return
		 */
		protected MCMessageList lotInf(Chk01_IoR r) {
			MCMessageList msgL = new MCMessageList();
			
			// 出荷基準で版管理対象の場合
			if (MAC_SLS_BASIS_TYP.isSHIP_BASIS(up0().sls_basis_typ()) && r.ver_flg()) {
				MCList<MST_LOT_R> lotL = MCList.create(MST_LOT_R.class);
				MST_LOT_R t = MST_LOT_R.create("T");
				MCQueryApiBuilder lotL_bldr = MCQueryApiBuilder.create(t);
				lotL_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
				lotL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
				lotL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
				lotL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
				lotL_bldr.addWhereWithAnd(t.lot_no.eq(bind("lot_no")));
				lotL_bldr.addWhereWithAnd(t.sublot_no.eq(bind("sublot_no")));
				lotL_bldr.addWhereWithAnd(t.ver_no.eq(bind("ver_no")));
				dbSelect("MSBBL1310_MST_LOT_S01", lotL, lotL_bldr, r);
				if (isNull(lotL) || lotL.size() == 0) {
					msgL.add(new MCMessage(r, Chk01_IoR.$ver_no, MSBBL0271,
							toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
							r.lot_no(),
							r.sublot_no(),
							r.ver_no()));
				}
			}
			
			return msgL;
		}

		/**
		 * 固有チェック
		 * @return
		 */
		protected MCMessageList checkOther() {
			MCMessageList msgL = new MCMessageList();
			
			// 計上日≦請求起算日チェック
			msgL.addAll(checkAcDtBillBasisDt());

			// 出荷実績同時計上チェック
			msgL.addAll(checkShipActSync());

			// 得意先禁止チェック
			msgL.addAll(checkStopCst());

			msgL.addAll(chkShipAcDtAcDt());

			// 品目禁止チェック
			msgL.addAll(checkStopItm());

			// 金額マイナスチェック
			msgL.addAll(chechAmtMinus());
			
			// 	引継明細存在チェック(受注ＮＯ、見積ＮＯ、納品書ＮＯ)
			msgL.addAll(checkTrnstDtlExists());

			// ロット禁止チェック
			msgL.addAll(checkStopLot());

			// 行削除チェック
			msgL.addAll(checkAbortDel());

			// 打切チェック
			msgL.addAll(checkAbortIns());

			// 物流Ｇ混在チェック
			msgL.addAll(checkMixLgGrp());

			// 価格印字ＦＬＧ混在チェック
			msgL.addAll(checkMixPriPrntFlg());

			// 明細-詳細相違チェック(数量)
			msgL.addAll(checkMatchDtlIoQty());

			// 明細-詳細相違チェック(手配ＮＯ)
			msgL.addAll(checkMatchDtlIoSno());

			// 明細-詳細相違チェック(ロット・サブロット)
			msgL.addAll(checkMatchDtlIoLot());

			// 明細-詳細相違チェック(版ＮＯ)
			msgL.addAll(checkMatchDtlIoVer());

			// 明細-詳細相違チェック(場所・棚ライン)
			msgL.addAll(checkMatchDtlIoLoc());

			// 明細-詳細相違チェック(格付)
			msgL.addAll(checkMatchDtlIoGd());

			// 見積引継可能数チェック
			msgL.addAll(checkQtyOverQtnTrnst());

			// 数量超過チェック(売上予定)
			msgL.addAll(checkQtyOverSlsSchd());

			// 得意先チェック
			msgL.addAll(chkCst());
			
			// 納品先チェック
			msgL.addAll(chkDlv());
			
			// インボイスチェック
			msgL.addAll(chkIv());
			
			// 明細にも保持しているヘッダ項目の整合性チェック
			msgL.addAll(chkHdrAndDtlCol());
			
			// 明細単位で詳細のロットが1種類であることのチェック
			msgL.addAll(chkNotLotMix());
			
			return msgL;
		}
		
		/**
		 * 計上日≦請求起算日チェック
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList checkAcDtBillBasisDt() {
			
			MCMessageList msgL = new MCMessageList();
			
			// 売上都度請求以外、計上日≦請求起算日チェック
			if (!MAC_BILL_CL_TYP.isEACH_SLS(up0().bill_cl_typ())) {
				msgL.addAll(check(up0(), new String[] {Chk01_HdrR.$ac_dt, Chk01_HdrR.$bill_basis_dt}, new FXUCL_BeforeAfterValidater()));
			}
			
			return msgL;
		}
		
		/**
		 * 出荷実績同時計上チェック
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList checkShipActSync() {
			
			MCMessageList msgL = new MCMessageList();
			
			if (!isNull(_slsAct) && !_slsAct.isEmpty() && _slsAct.ship_act_sync_flg()) {
				
				msgL.add(new MCMessage(MSBBL0261, _slsAct.sls_act_no(), " "));
			}
			
			return msgL;
		}

		/**
		 * 	取引禁止チェック(得意先)
		 * @return
		 */
		protected MCMessageList checkStopCst() {
			MCMessageList msgL = new MCMessageList();

			// 取引禁止チェック(得意先)
			boolean rslt = execFuncBoolean(createSqlId(LOGIC_ID, "MAPA_BP$F_IS_SLS_STOP", "01"),
					MAPA_BP$F_IS_SLS_STOP(bind("cst_cd"), bind("sls_dt")), up0());
			if (rslt) {
				msgL.add(new MCMessage(up0(), Chk01_HdrR.$cst_cd, MSBBL0089, up0() .cst_cd(), toYMDString(up0().sls_dt()), toDispGUIIndex(up0())));
			}

			return msgL;
		}

		protected MCMessageList chkShipAcDtAcDt() {
			MCMessageList msgL = new MCMessageList();

			if (MAC_SLS_BASIS_TYP.isIN_BASIS(up0().sls_basis_typ()) || MAC_SLS_BASIS_TYP.isARRIVAL_BASIS(up0().sls_basis_typ())) {

				MST_DLV_SLIP_R dlvSlipR = getShipAcDt();

				if (!isNull(dlvSlipR) && up0().ac_dt().lt(dlvSlipR.ac_dt())) {
					msgL.add(new MCMessage(up0(), Chk01_HdrR.$ac_dt, MSBEL1067,
							toYMDString(dlvSlipR.ac_dt()), toYMDString(up0().ac_dt()),
							toDispGUIIndex(up0())));
				}
			}

			return msgL;
		}

		protected MST_DLV_SLIP_R getShipAcDt() {
			MST_DLV_SLIP_R dlvSlipR = MST_DLV_SLIP_R.create("SLIP");
			MST_DLV_SLIP_R w1 = MST_DLV_SLIP_R.create("SLIP_W1");
			MCQueryApiBuilder dlvSlipBldr = MCQueryApiBuilder.create(dlvSlipR);
			dlvSlipBldr.setSelect(dlvSlipR.ac_dt);
			dlvSlipBldr.setWhere(dlvSlipR.dlv_slip_no.eq(bind("ship_dlv_slip_no")));
			dlvSlipBldr.addWhereWithAnd(dlvSlipR.dlv_slip_seq.eq(
				subQuery()
				.select(max(w1.dlv_slip_seq))
				.from(w1)
				.where(
					w1.dlv_slip_no.eq(dlvSlipR.dlv_slip_no)
					.and(w1.trn_typ.eq(value(MSC_TRN_TYP.SHIP.value())))
					.and(w1.slip_sts_typ.neq(value(MAC_SLIP_STS_TYP.CAN.value())))
				)
			));
			dbSelect("MSBBL1310_MST_DLV_SLIP_S01", dlvSlipR, dlvSlipBldr, up0());

			return dlvSlipR;
		}

		/**
		 * 	品目禁止チェック(売上・出荷)
		 * @return
		 */
		protected MCMessageList checkStopItm() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_DtlR> notErrDtlL = getChkList(up1(), CREATE, MODIFY, NONE);
			for (MCList<Chk01_DtlR> itmL : notErrDtlL.groupList(Chk01_DtlR.$itm_cd)) {
				// 重複を排除してチェックする。エラーメッセージは代表の１行のみ表示する(件数少ないので全件でもたいして変わらないが)
				Chk01_DtlR bind = itmL.get(0).clone();
				bind.setDateNE(Chk01_HdrR.$sls_dt, up0().sls_dt());
				boolean rslt = execFuncBoolean(createSqlId(LOGIC_ID, "MAPA_ITM$F_IS_SLS_STOP", "02"),
						MAPA_ITM$F_IS_SLS_STOP(bind("itm_cd"), bind("itm_sub1"), bind("itm_sub2"), bind("itm_sub3"), bind("sls_dt")), bind);
				if (rslt) {
					msgL.add(new MCMessage(itmL.get(0), Chk01_DtlR.$itm_cd, MSBBL0090, toDispItm(bind.itm_cd(), bind.itm_sub1(), bind.itm_sub2(), bind.itm_sub3()), toYMDString(up0().sls_dt()), toDispGUIIndex(itmL .get(0))));
				}
			}
			return msgL;
		}

		/**
		 * 	ロット禁止チェック
		 * <p>
		 * 	[条件]<br>
		 * 	ロットNO、サブロットNOが引当禁止か。出荷基準の売上の場合にチェックする。<br>
		 * 	ただし「ロットチェック無視」がオンの場合はチェックしない。受注紐付で場所在庫引当済みの場合もチェックしない。
		 * </p>
		 * @return
		 */
		protected MCMessageList checkStopLot() {
			MCMessageList msgL = new MCMessageList();

			// 出荷基準かつロットチェック無視ＦＬＧがオフの場合
			if (MAC_SLS_BASIS_TYP.isSHIP_BASIS(up0().sls_basis_typ())
					&& !up0().lot_chk_off_flg()) {

				MCList<Chk01_DtlR> notErrDtlL = getChkList(up1(), CREATE, MODIFY, NONE);
				for (Chk01_DtlR r : notErrDtlL) {

					if (!isNull(r.slo_d_no()) && !isNull(r.sls_schd_no())) {

						// 受注紐付の場合、出荷引当状況をチェック
						MCList<MST_SHIP_ALLOC_STS_R> shipAllocStsL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
						MST_SHIP_ALLOC_STS_R t = MST_SHIP_ALLOC_STS_R.create("T");
						MCQueryApiBuilder shipAllocStsL_bldr = MCQueryApiBuilder.create(t);
						MST_SLS_SCHD_R t2 = MST_SLS_SCHD_R.create("T2");

						shipAllocStsL_bldr.setSelect(t.ship_alloc_sts_no);
						shipAllocStsL_bldr.addInnerJoin(t2, bracket(t.ship_schd_no.eq(t2.ship_schd_no)));
						shipAllocStsL_bldr.setWhere(t2.sls_schd_no.eq(bind("sls_schd_no")), r);
						shipAllocStsL_bldr.addWhereWithAnd(t.alloc_flg.eq(value(true)));
						int cnt = dbSelect("MSBBL1310_MST_SHIP_ALLOC_STS_S01", shipAllocStsL, shipAllocStsL_bldr);
						if (cnt > 0) {
							// 場所在庫引当済の場合はスキップ
							continue;
						}

						// 明細に紐づく詳細のロットに対してチェック
						MCList<Chk01_IoR> notErrIoL = getChkList(up2(), CREATE, MODIFY, NONE);
						MCList<Chk01_IoR> chdL = getChildIoL(notErrIoL, r);
						for (Chk01_IoR chdR : chdL) {
							// 引当禁止ロット情報を取得
							MST_ALLOC_STOP_LOT_R allocStopLot = MST_ALLOC_STOP_LOT_R.create();
							cnt = dbSelectKey("MSBBL1310_MST_ALLOC_STOP_LOT_S01", allocStopLot,
									MCQueryApiBuilder.create(MST_ALLOC_STOP_LOT_R.create("T")), chdR);
							if (cnt > 0) {
								// 引当禁止日≦対象日付(売上日)＜解除日 の場合エラーとする
								if (up0().sls_dt().gte(allocStopLot.stop_dt())) {
									if (isNull(allocStopLot.rel_dt())
											|| up0().sls_dt().lt(allocStopLot.rel_dt())) {
										msgL.add(new MCMessage(chdR, Chk01_IoR.$lot_no,
												MSBEL0019,
												toDispItm(r.itm_cd(),r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
												chdR.lot_no(), chdR.sublot_no(), toDispGUIIndex(chdR)));
									}
								}
							}
						}
					}
				}
			}

			return msgL;
		}

		/**
		 * 取引通貨金額マイナスチェック
		 * 
		 * @return
		 */
		protected MCMessageList chechAmtMinus() {
			MCMessageList msgL = new MCMessageList();
			
			MCList<Chk01_DtlR> notErrDtlL = getChkList(up1(), CREATE, MODIFY, NONE);
			
			for (Chk01_DtlR dtlR : notErrDtlL) {
				// 値引額を加味した結果マイナスになっていないかチェック
				msgL.addAll(check(dtlR, Chk01_DtlR.$trd_cur_amt, new FXUCL_SmallLargeValidater(null, MCNumber.ZERO, null)));
			}
			
			return msgL;
		}
		
		/**
		 * 	引継明細存在チェック(受注引継、見積引継、納品書引継)
		 * <p>
		 * [条件]
		 * <li>受注引継だが引き継がれた受注明細が一件もない場合</li>
		 * <li>見積引継だが引き継がれた見積明細が一件もない場合</li>
		 * <li>納品書引継だが引き継がれた納品伝票明細が1件もない</li>
		 * </p>
		 * @return
		 */
		protected MCMessageList checkTrnstDtlExists() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_DtlR> notErrDtlL = getChkList(up1(), CREATE, MODIFY, NONE);

			// 受注ＮＯ
			if (!isNull(up0().slo_no())) {
				MCList<Chk01_DtlR> sloL = notErrDtlL.subList(Chk01_DtlR.$slo_no, up0()
						.slo_no());
				if (sloL.isEmpty()) {
					msgL.add(new MCMessage(up0(), Chk01_HdrR.$slo_no, MSBBL0094));
				}
			}

			// 見積ＮＯ
			if (!isNull(up0().qtn_no())) {
				MCList<Chk01_DtlR> qtnL = notErrDtlL.subList(Chk01_DtlR.$qtn_no, up0()
						.qtn_no());
				if (qtnL.isEmpty()) {
					msgL.add(new MCMessage(up0(), Chk01_HdrR.$qtn_no, MSBBL0095));
				}
			}

			// 納品書ＮＯ
			if (!isNull(up0().dlv_slip_no())) {
				MCList<Chk01_DtlR> dlvSlipL = notErrDtlL.subList(Chk01_DtlR.$dlv_slip_no,
						up0().dlv_slip_no());
				if (dlvSlipL.isEmpty()) {
					msgL.add(new MCMessage(up0(), Chk01_HdrR.$dlv_slip_no, MSBBL0096));
				}
			}
			return msgL;
		}

		/**
		 * 	行削除チェック
		 * <p>
		 * 	[条件]<br>
		 * 	行削除対象に対し分割された実績が存在している状態<br>
		 * 	かつ打切となっている実績を行削除しようとした場合
		 * </p>
		 * @return
		 */
		protected MCMessageList checkAbortDel() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_DtlR> delL = getChkList(up1(), DELETE);

			for (Chk01_DtlR r : delL) {
				if (r.abort_flg()) {
					// 分割された実績が存在するかチェック
					if (cntOthrSlsActD(r.sls_act_d_no(), r.sls_act_d_seq()) > 0) {
						msgL.add(new MCMessage(r, Chk01_DtlR.$abort_flg, MSBBL0097,
								toDispGUIIndex(r)));
					}
				}
			}

			return msgL;
		}

		/**
		 * 	新規行打切チェック
		 * <p>
		 * 	[条件]<br>
		 * 	分割計上された売上実績が存在する場合に数量ゼロの新規登録を行おうとした
		 * </p>
		 * @return
		 */
		protected MCMessageList checkAbortIns() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_DtlR> notErrDtlL = getChkList(up1(), CREATE);

			for (Chk01_DtlR r : notErrDtlL) {

				if (r.abort_flg() && r.trd_unit_qty().isZero()) {
					// 分割された実績が存在するかチェック
					if (cntOthrSlsActD(r.sls_act_d_no(), r.sls_act_d_seq()) > 0) {
						msgL.add(new MCMessage(r, Chk01_DtlR.$trd_unit_qty, MSBBL0098,
								toDispGUIIndex(r)));
					}
				}
			}

			return msgL;
		}

		/**
		 * 	場所の物流Ｇ混在チェック
		 * <p>
		 * 	[条件]<br>
		 * 	物流グループの異なる場所を混在させることはできません。<br>
		 * 	※計画外の場合のみ
		 * </p>
		 * @return
		 */
		protected MCMessageList checkMixLgGrp() {
			MCMessageList msgL = new MCMessageList();

			if (MAC_SLS_BASIS_TYP.isSHIP_BASIS(up0().sls_basis_typ())
					&& isNullAnd(up0().qtn_no(), up0().dlv_slip_no())) {

				// 明細と詳細で場所ＣＤが異なることはない（チェック済）ので明細の場所のみをチェックする
				MCList<Chk01_IoR> ioL = up2().subList(CREATE, MODIFY, NONE);
				MCList<Chk01_IoR> grpLocL = ioL.groupBy(Chk01_IoR.$loc_cd);

				MAM_LOC_R t = MAM_LOC_R.create("T");
				MCList<MAM_LOC_R> locL = MCList.create(MAM_LOC_R.class);
				MCQueryApiBuilder locL_bldr = MCQueryApiBuilder.create(t);
				locL_bldr.setSelect(t.lg_grp_cd);
				locL_bldr.setDistinct();
				int cnt = dbSelectKey("MSBBL1310_MAM_LOC_S01", locL, locL_bldr, grpLocL);
				if (cnt > 1) {
					msgL.add(new MCMessage(MSBBL0078));
				}
			}
			return msgL;
		}

		/**
		 * 	価格印字ＦＬＧ混在チェック
		 * <p>
		 * 	[条件]<br>
		 * 	明細の同一納品先に対し、異なる価格印字ＦＬＧが設定されている場合
		 * </p>
		 * @return
		 */
		protected MCMessageList checkMixPriPrntFlg() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_DtlR> notErrDtlL = getChkList(up1(), CREATE, MODIFY, NONE);
			// 納品先でグループ化
			for (MCList<Chk01_DtlR> grpDlvL : notErrDtlL.groupList(Chk01_DtlR.$dlv_cd)) {
				// 価格印字ＦＬＧでグループ化
				MCList<Chk01_DtlR> chkL = grpDlvL.groupBy(Chk01_DtlR.$pri_prnt_flg);
				if (chkL.size() > 1) {
					msgL.add(new MCMessage(MSBBL0101));
				}
			}
			return msgL;
		}

		/**
		 * 	明細・詳細相違チェック(数量)
		 * <p>
		 * 	[条件]<br>
		 * 	明細の数量と詳細の数量（合計）が異なる場合※基準単位換算
		 * </p>
		 * @return
		 */
		protected MCMessageList checkMatchDtlIoQty() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_DtlR> notErrDtlL = getChkList(up1(), CREATE, MODIFY, NONE);
			MCList<Chk01_IoR> notErrIoL = getChkList(up2(), CREATE, MODIFY, NONE);
			for (Chk01_DtlR r : notErrDtlL) {
				MCList<Chk01_IoR> chdL = getChildIoL(notErrIoL, r);
				if (!chdL.isEmpty()
						&& !isSame(r.base_unit_qty(), chdL.sum(Chk01_IoR.$base_unit_qty))) {
					msgL.add(new MCMessage(r, Chk01_DtlR.$trd_unit_qty, MSBBL0079));
				}
			}

			return msgL;
		}

		/**
		 * 	明細・詳細相違チェック(手配ＮＯ)
		 * <p>
		 * 	[条件]<br>
		 * 	明細の手配ＮＯ１～４が入力されている場合に、詳細の手配ＮＯ１～４と異なる場合
		 * </p>
		 * @return
		 */
		protected MCMessageList checkMatchDtlIoSno() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_DtlR> notErrDtlL = getChkList(up1(), CREATE, MODIFY, NONE);
			MCMessageList tmpMsgL = new MCMessageList();
			for (Chk01_DtlR r : notErrDtlL) {

				tmpMsgL.addAll(checkSno(r, Chk01_DtlR.$sno1, Chk01_IoR.$sno1, Chk01_DtlR.$sno1_null_flg, Chk01_DtlR.$sno1_mng_typ));
				if (tmpMsgL.size() > 0) {
					msgL.addAll(tmpMsgL);
					tmpMsgL.clear();
					continue;
				}
				tmpMsgL.addAll(checkSno(r, Chk01_DtlR.$sno2, Chk01_IoR.$sno2, Chk01_DtlR.$sno2_null_flg, Chk01_DtlR.$sno2_mng_typ));
				if (tmpMsgL.size() > 0) {
					msgL.addAll(tmpMsgL);
					tmpMsgL.clear();
					continue;
				}
				tmpMsgL.addAll(checkSno(r, Chk01_DtlR.$sno3, Chk01_IoR.$sno3, Chk01_DtlR.$sno3_null_flg, Chk01_DtlR.$sno3_mng_typ));
				if (tmpMsgL.size() > 0) {
					msgL.addAll(tmpMsgL);
					tmpMsgL.clear();
					continue;
				}
				tmpMsgL.addAll(checkSno(r, Chk01_DtlR.$sno4, Chk01_IoR.$sno4, Chk01_DtlR.$sno4_null_flg, Chk01_DtlR.$sno4_mng_typ));
				if (tmpMsgL.size() > 0) {
					msgL.addAll(tmpMsgL);
					tmpMsgL.clear();
					continue;
				}
			}
			return msgL;
		}
		
		/**
		 * 手配ＮＯ１～４のチェック
		 * @param r
		 * @param tgtSnoDtl
		 * @param tgtSnoIo
		 * @param flgNm
		 * @param mngTypNm
		 * @return
		 */
		protected MCMessageList checkSno(Chk01_DtlR r, String tgtSnoDtl, String tgtSnoIo, String flgNm, String mngTypNm) {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_IoR> notErrIoL = getChkList(up2(), CREATE, MODIFY, NONE);
			String sno = r.getStringNE(tgtSnoDtl);
			boolean sno_null_flg = r.getBooleanNE(flgNm);
			if (sno_null_flg || MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.getStringNE(mngTypNm))) {
				if (!isNull(sno)) {
					for (Chk01_IoR chd : getChildIoL(notErrIoL, r)) {
						if (!(isSame(sno, chd.getStringNE(tgtSnoIo)) || isNullOrNullVal(chd.getStringNE(tgtSnoIo)))) {
							msgL.add(new MCMessage(r, tgtSnoDtl, MSBBL0080));
							break;
						}
					}
				}
			}
			else {
				if (!isNullOrNullVal(sno)) {
					for (Chk01_IoR chd : getChildIoL(notErrIoL, r)) {
						if (!(isSame(sno,  chd.getStringNE(tgtSnoIo)))) {
							msgL.add(new MCMessage(r, tgtSnoDtl, MSBBL0080));
							break;
						}
					}
				}
			}
			return msgL;
		}

		/**
		 * 	明細・詳細相違チェック(ロットＮＯ・サブロットＮＯ)
		 * <p>
		 * 	[条件]<br>
		 * 	明細のロットが入力されている場合に、詳細のロットと異なる場合<br>
		 * 	明細のサブロットが入力されている場合に、詳細のサブロットと異なる場合
		 * </p>
		 * @return
		 */
		protected MCMessageList checkMatchDtlIoLot() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_DtlR> notErrDtlL = getChkList(up1(), CREATE, MODIFY, NONE);
			MCList<Chk01_IoR> notErrIoL = getChkList(up2(), CREATE, MODIFY, NONE);
			for (Chk01_DtlR r : notErrDtlL) {

				if (!isNull(r.lot_no())) {
					MCList<Chk01_IoR> chdL = getChildIoL(notErrIoL, r);
					for (Chk01_IoR chd : chdL) {
						if (!isSame(r.lot_no(), chd.lot_no())) {
							msgL.add(new MCMessage(r, Chk01_DtlR.$lot_no, MSBBL0081));
							continue;
						}

						if (!isNullOrNullVal(r.sublot_no())
								&& !isSame(r.sublot_no(), chd.sublot_no())) {
							msgL.add(new MCMessage(r, Chk01_DtlR.$sublot_no, MSBBL0082));
						}
					}
				}
			}
			return msgL;
		}

		/**
		 * 	明細・詳細相違チェック(版ＮＯ)
		 * <p>
		 * 	[条件]<br>
		 * 	明細の版ＮＯが入力されている場合に、詳細の版ＮＯと異なる場合
		 * </p>
		 * @return
		 */
		protected MCMessageList checkMatchDtlIoVer() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_DtlR> notErrDtlL = getChkList(up1(), CREATE, MODIFY, NONE);
			MCList<Chk01_IoR> notErrIoL = getChkList(up2(), CREATE, MODIFY, NONE);
			for (Chk01_DtlR r : notErrDtlL) {
				if (!isNull(r.ver_no())) {
					MCList<Chk01_IoR> chdL = getChildIoL(notErrIoL, r);
					for (Chk01_IoR chd : chdL) {
						if (!isSame(r.ver_no(), chd.ver_no())) {
							msgL.add(new MCMessage(r, Chk01_DtlR.$ver_no, MSBBL0270));
						}
					}
				}
			}
			return msgL;
		}

		/**
		 * 	明細・詳細相違チェック(場所・棚ライン)
		 * <p>
		 * 	[条件]<br>
		 * 	明細の場所が入力されている場合に、詳細の場所と異なる場合<br>
		 * 	明細の棚・ラインＣＤが入力されている場合に、詳細の棚・ラインＣＤと異なる場合
		 * </p>
		 * @return
		 */
		protected MCMessageList checkMatchDtlIoLoc() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_DtlR> notErrDtlL = getChkList(up1(), CREATE, MODIFY, NONE);
			MCList<Chk01_IoR> notErrIoL = getChkList(up2(), CREATE, MODIFY, NONE);
			for (Chk01_DtlR r : notErrDtlL) {

				if (!isNullOrNullVal(r.loc_cd())) {
					MCList<Chk01_IoR> chdL = getChildIoL(notErrIoL, r);
					for (Chk01_IoR chd : chdL) {
						if (!isSame(r.loc_cd(), chd.loc_cd())) {
							msgL.add(new MCMessage(r, Chk01_DtlR.$loc_cd, MSBBL0083));
							continue;
						}

						if (!isNullOrNullVal(r.str_ln_cd())
								&& !isSame(r.str_ln_cd(), chd.str_ln_cd())) {
							msgL.add(new MCMessage(r, Chk01_DtlR.$str_ln_cd, MSBBL0084));
						}
					}
				}
			}
			return msgL;
		}

		/**
		 * 	明細・詳細相違チェック(格付)
		 * <p>
		 * 	[条件]<br>
		 * 	明細の格付が入力されている場合に、詳細の格付と異なる場合
		 * </p>
		 * @return
		 */
		protected MCMessageList checkMatchDtlIoGd() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_DtlR> notErrDtlL = getChkList(up1(), CREATE, MODIFY, NONE);
			MCList<Chk01_IoR> notErrIoL = getChkList(up2(), CREATE, MODIFY, NONE);
			for (Chk01_DtlR r : notErrDtlL) {

				if (!isNullOrNullVal(r.gd_cd())) {
					MCList<Chk01_IoR> chdL = getChildIoL(notErrIoL, r);
					for (Chk01_IoR chd : chdL) {
						if (!isSame(r.gd_cd(), chd.gd_cd())) {
							msgL.add(new MCMessage(r, Chk01_DtlR.$gd_cd, MSBBL0085));
						}
					}
				}
			}
			return msgL;
		}

		/**
		 * ヘッダ情報の補完処理(定型チェック実施後)
		 */
		protected void compHdrSub() {
			if (!isNull(up0().iv_no())) {
				if (!MSC_IV_SRC_TYP.isSLS(up0().iv_src_typ())) {
					/* 預りの場合はインボイス対象外の仕様に合わせ、売上計上区分を出荷基準とする
					 * 預りは預り以外と混ぜて1つのインボイスにできないが、
					 * インボイス登録時に非在庫品が追加されている可能性もあるため、
					 * 「1明細でも預りがあれば預り取引」と判定する
					 */
					boolean isCststk = false;
					for (Chk01_DtlR r : up1()) {
						if (r.sls_cststk_flg()) {
							isCststk = true;
							up0().sls_basis_typ(MAC_SLS_BASIS_TYP.SHIP_BASIS.value());
							break;
						}
					}
					if (!isCststk) {
						MST_IV_R t = MST_IV_R.create("T");
						MST_IV_R ivR = MST_IV_R.create();
						MCQueryApiBuilder ivL_bldr = MCQueryApiBuilder.create(t);
						
						ivL_bldr.setSelect(t.sls_basis_typ);
						ivL_bldr.setWhere(t.iv_no.eq(bind("iv_no")), up0());
						dbSelect("MSBBL1310_MST_IV_S02", ivR, ivL_bldr);
						
						up0().sls_basis_typ(ivR.sls_basis_typ());
					}
				}
				else {
					if (MAC_TRD_PTN_TYP.isSLS_CNSGN(up0().trd_ptn_typ())) {
						up0().sls_basis_typ(null);
					}
					else {
						// 貸出ではない計画外インボイスの場合は出荷基準
						up0().sls_basis_typ(MAC_SLS_BASIS_TYP.SHIP_BASIS.value());
					}
				}
			}
			// 売上実績、受注から売上計上区分を補完できなかった場合、ここで売上計上区分を補完する
			// ただし、貸出売上の場合は売上計上区分を設定しないよう制御する
			if (isNull(up0().sls_basis_typ()) && !MAC_TRD_PTN_TYP.isSLS_CNSGN(up0().trd_ptn_typ())) {

				// 以下の条件に該当する場合、「売上計上区分：出荷基準」を設定する
				// 見積ＮＯがＮＵＬＬ以外の場合（見積引継の場合）
				// 納品書ＮＯがＮＵＬＬの場合（見積引継、受注引継、納品書引継以外の場合）
				if (!isNull(up0().qtn_no()) || isNull(up0().dlv_slip_no())) {
					up0().sls_basis_typ(MAC_SLS_BASIS_TYP.SHIP_BASIS.value());
				}
				else {
					// 取引マスタ、または会社マスタから補完する
					MAM_BP_R bpR = getBpCache(up0().cst_cd());

					if (!isNull(bpR.sls_basis_typ())) {
						up0().sls_basis_typ(bpR.sls_basis_typ());
					}
					else {
						up0().sls_basis_typ(getCo().sls_basis_typ());
					}
				}
			}

			// 計上年月
			up0().ac_ym(getAcYm(up0().ac_dt()));

			// 請求先・与信管理先ＣＤ
			MAM_BP_R acst = getBpCache(up0().acst_cd());
			up0().bcst_cd(acst.bcst_cd());
			MAM_BP_R bcst = getBpCache(up0().bcst_cd());
			up0().cred_cd(bcst.ar_cred_cd());

			// 基準通貨ＣＤ
			up0().base_cur_cd(getCo().base_cur_cd());

			// 為替レートＣＤ
			up0().xrate_cd(getCo().sls_xrate_cd());

			// 為替レート
			// 未指定時は為替レートマスタより取得
			if (isNull(up0().xrate())) {
				up0().xrate(execFuncNumber(createSqlId(LOGIC_ID, "MAPA_XCHNG$F_GET_SLS_XRATE", "01"),
						MAPA_XCHNG$F_GET_SLS_XRATE(bind("trd_cur_cd"), bind("sls_dt")), up0()));
			}

			// 納税通貨ＣＤ
			up0().ptax_cur_cd(getCo().ptax_cur_cd());

			// 納税為替レート
			// 未指定時は為替レートマスタより取得
			if (isNull(up0().ptax_xrate()) && !isNull(up0().ptax_cur_cd())) {
				up0().ptax_xrate(execFuncNumber(createSqlId(LOGIC_ID, "MAPA_XCHNG$F_GET_XRATE", "01"),
						MAPA_XCHNG$F_GET_XRATE(bind("trd_cur_cd"), bind("ptax_cur_cd"), bind("xrate_cd"), bind("sls_dt")), up0()));
			}

		}

		/**
		 * 	明細情報補完処理(定型チェック実施後)
		 */
		protected void compDtlSub() {

			MCList<Chk01_DtlR> notErrL = getChkList(up1(), CREATE, MODIFY, NONE);
			for (Chk01_DtlR r : notErrL) {
				// 基準単位数量
				r.base_unit_qty(getBaseUnitQty(r));

				if (!r.sundry_itm_flg()) {
					r.itm_nm(null);
				}

				if (!r.dlv_sundry_flg()) {
					r.dlv_nm(null);
				}
				// 原価金額
				r.cost_amt(getCostAmt(r));
			}
			
			MCList<MAM_SUNDRY_ITM_R> sundryItmL = getSundryItm(notErrL);
			
			MCIndexKey idxkey = sundryItmL.createIndex(MAM_SUNDRY_ITM_R.$itm_cd,
					MAM_SUNDRY_ITM_R.$itm_sub1,
					MAM_SUNDRY_ITM_R.$itm_sub2,
					MAM_SUNDRY_ITM_R.$itm_sub3,
					MAM_SUNDRY_ITM_R.$sno1,
					MAM_SUNDRY_ITM_R.$sno2,
					MAM_SUNDRY_ITM_R.$sno3,
					MAM_SUNDRY_ITM_R.$sno4);
			
			MAM_SUNDRY_ITM_R sundryItmR = null;
			
			for (Chk01_DtlR r : notErrL) {
				
				if (r.sundry_itm_flg() && MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())) {
						
					sundryItmR = sundryItmL.getFirst(idxkey, 
							r.itm_cd(), 
							r.itm_sub1(), 
							r.itm_sub2(), 
							r.itm_sub3(), 
							r.sno1(),
							r.sno2(), 
							r.sno3(), 
							r.sno4());
					
					if (!isNull(sundryItmR) && !sundryItmR.isEmpty()) {
						r.itm_nm(sundryItmR.itm_nm());
					}
					else {
						throw new MCAppException(
								MSBBL0251, 
								toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()), 
								toDispSno(r.sno1(), r.sno2(), r.sno3(), r.sno4()), 
								toDispGUIIndex(r));
					}
				}
			}
			
			// 表示順の設定
			setDispSeq(notErrL);
		}
		
		/**
		 * 諸口品マスタを取得する。
		 * @param dtlL 売上値引明細
		 * @return 諸口品マスタ
		 */
		protected MCList<MAM_SUNDRY_ITM_R> getSundryItm(MCList<Chk01_DtlR> dtlL) {
			
			MCList<MAM_SUNDRY_ITM_R> bindL = MCList.create(MAM_SUNDRY_ITM_R.class);
			
			MCIndexKey idxkey = dtlL.createIndex(Chk01_DtlR.$sundry_itm_flg, Chk01_DtlR.$stk_mng_typ);
			
			setAll(bindL, dtlL.subList(idxkey, true, MAC_STK_MNG_TYP.MNG.value()), createMap_MAM_SUNDRY_ITM_R_Chk01_DtlR());
			
			MCList<MAM_SUNDRY_ITM_R> sundryItmL = MCList.create(MAM_SUNDRY_ITM_R.class);
			
			if (!bindL.isEmpty()) {
				MCQueryApiBuilder sundryItmL_bldr = MCQueryApiBuilder.create(MAM_SUNDRY_ITM_R.create("T"));
				
				sundryItmL_bldr.setSelectAll();
				
				dbSelectKey("MSBBL1310_MAM_SUNDRY_ITM_S01", sundryItmL, sundryItmL_bldr, bindL);
			}
			
			return sundryItmL;
		}

		/**
		 * 	詳細情報の補完処理(定型チェック実施後)
		 */
		protected void compIoSub() {

			MCList<Chk01_DtlR> notErrDtlL = getChkList(up1(), CREATE, MODIFY, NONE);
			MCList<Chk01_IoR> notErrIoL = getChkList(up2(), CREATE, MODIFY, NONE);

			for (Chk01_DtlR parDtlR : notErrDtlL) {

				for (Chk01_IoR chdIoR : getChildIoL(notErrIoL, parDtlR)) {

					// リストロジック定型処理により補完した明細の基準単位換算情報を子の詳細行へコピーする
					chdIoR.base_unit_cd(parDtlR.base_unit_cd());
					chdIoR.base_unit_dec_place(parDtlR.base_unit_dec_place());
					chdIoR.base_unit_rnd_typ(parDtlR.base_unit_rnd_typ());

					chdIoR.lot_mng_typ(parDtlR.lot_mng_typ());
					chdIoR.sublot_mng_typ(parDtlR.sublot_mng_typ());
					chdIoR.ver_flg(parDtlR.ver_flg());
					chdIoR.stk_mng_typ(parDtlR.stk_mng_typ());
					
					// 基準単位数量
					chdIoR.base_unit_qty(getBaseUnitQty(chdIoR));
					
				}
			}
			MCList<Chk01_IoR> delIoL = getChkList(up2(), DELETE);
			for (Chk01_IoR r : delIoL) {
				r.trd_unit_qty(null);
			}
		}

		/**
		 * 	見積明細情報存在チェック+補完
		 * @param hdr
		 * @param dtl
		 * @return
		 */
		protected MCMessageList checkPlusQtnDExists(Chk01_HdrR hdr, Chk01_DtlR dtl) {
			MCMessageList msgL = new MCMessageList();

			if (!isNull(dtl.qtn_d_no())) {

				MST_QTN_D_R t = MST_QTN_D_R.create("T");
				MAVM_ITM_UNIT_R m1 = MAVM_ITM_UNIT_R.create("M1");
				MAM_ITM_R m2 = MAM_ITM_R.create("M2");

				MCList<MST_QTN_D_R> qtnDL = MCList.create(MST_QTN_D_R.class);
				MCQueryApiBuilder qtnDL_bldr = MCQueryApiBuilder.create(t);
				qtnDL_bldr.setSelect(t.qtn_d_no);
				qtnDL_bldr.addSelect(t.qtn_no);
				qtnDL_bldr.addSelect(t.qtn_rev);
				qtnDL_bldr.addSelect(t.base_unit_qty);
				qtnDL_bldr.addSelect(m1.conv_base_qty);
				qtnDL_bldr.addSelect(m1.conv_qty);
				qtnDL_bldr.addSelect(m2.dec_place);
				qtnDL_bldr.addSelect(m2.rnd_typ);
				qtnDL_bldr.addLeftOuterJoin(m1,
						bracket(t.itm_cd.eq(m1.itm_cd)
								.and(t.itm_sub1.eq(m1.itm_sub1))
								.and(t.itm_sub2.eq(m1.itm_sub2))
								.and(t.itm_sub3.eq(m1.itm_sub3))
								.and(t.trd_unit_cd.eq(m1.unit_cd))));
				qtnDL_bldr.addLeftOuterJoin(m2,
						bracket(t.itm_cd.eq(m2.itm_cd)
								.and(t.itm_sub1.eq(m2.itm_sub1))
								.and(t.itm_sub2.eq(m2.itm_sub2))
								.and(t.itm_sub3.eq(m2.itm_sub3))));

				msgL.addAll(check(dtl, qtnDL.createRow().getKeyColumn(), getDbExistValidater(qtnDL_bldr)));

				dbSelectKey("MSBBL1310_MST_QTN_D_S01", qtnDL, qtnDL_bldr, dtl);
				
				if (!qtnDL.isEmpty()) {
					MST_QTN_D_R qtnD = qtnDL.get(0);
					if (!isSame(qtnD.qtn_no(), hdr.qtn_no())
							|| !isSame(qtnD.qtn_rev(), hdr.qtn_rev())) {
						// 基本的にありえないはずだが一応チェック
						msgL.addAll(getRecordInvalidMsg(Chk01_HdrR.$qtn_no, hdr.qtn_no(),
								hdr));
					}
					else {
						dtl.qtn_no(qtnD.qtn_no());
						dtl.qtn_rev(qtnD.qtn_rev());

						// 以下は後続処理の見積引継数超過チェック用に補完
						dtl.qtn_base_unit_qty(qtnD.base_unit_qty());
						// 受注引継数量、売上実績引継数量は基準単位に換算して補完
						MCNumber base_unit_slo_trnst_qty = convToBaseUnit(
								qtnD.slo_trnst_qty(), qtnD.getNumberNE("conv_base_qty"),
								qtnD.getNumberNE("conv_qty"),
								qtnD.getNumberNE("dec_place"),
								qtnD.getStringNE("rnd_typ"));
						dtl.base_unit_slo_trnst_qty(nvl(base_unit_slo_trnst_qty, MCNumber.ZERO));
						MCNumber base_unit_sls_trnst_qty = convToBaseUnit(
								qtnD.slo_trnst_qty(), qtnD.getNumberNE("conv_base_qty"),
								qtnD.getNumberNE("conv_qty"),
								qtnD.getNumberNE("dec_place"),
								qtnD.getStringNE("rnd_typ"));
						dtl.base_unit_sls_trnst_qty(nvl(base_unit_sls_trnst_qty, MCNumber.ZERO));
					}
				}
			}

			return msgL;
		}

		/**
		 * 	納品伝票明細の存在チェック+補完
		 * @param hdr
		 * @param dtl
		 * @return
		 */
		protected MCMessageList checkPlusDlvSlipDExists(Chk01_HdrR hdr, Chk01_DtlR dtl) {
			MCMessageList msgL = new MCMessageList();

			if (!isNull(hdr.dlv_slip_no()) && !isNull(dtl.dlv_slip_d_no())) {

				MST_DLV_SLIP_D_R dlvSlipDR = MST_DLV_SLIP_D_R.create();
				dbSelectKey("MSBBL1310_MST_DLV_SLIP_D_S01", dlvSlipDR,
						MCQueryApiBuilder.create(MST_DLV_SLIP_D_R.create("T")), dtl);

				if (dlvSlipDR.isEmpty()) {
					msgL.addAll(
							getRecordNotFoundMsg(
									getModuleID(),
									dlvSlipDR.tableName(),
									dlvSlipDR.getKeyColumn(),
									new Comparable[] {dtl.dlv_slip_d_no(), dtl.dlv_slip_d_seq()},
									dtl
									)
							);
				}
				else {
					if (!isSame(dlvSlipDR.dlv_slip_no(), hdr.dlv_slip_no())) {
						// 基本的にありえないはずだが一応チェック
						msgL.addAll(getRecordInvalidMsg(Chk01_HdrR.$dlv_slip_no,
								hdr.dlv_slip_no(), hdr));
					}
					else {
						dtl.dlv_slip_no(dlvSlipDR.dlv_slip_no());
					}
				}
			}

			return msgL;
		}

		/**
		 * 	見積引継可能数チェック
		 * <p>
		 * [条件]<br>
		 * 	見積引継の明細で、数量が見積引継可能数を超える場合<br>
		 * [前提]<br>
		 * 	同一売上実績単位で引継対象行の重複はないものとする（見積明細ＮＯで最大1件のみ)
		 * </p>			
		 * @return
		 */
		protected MCMessageList checkQtyOverQtnTrnst() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_DtlR> notErrDtlL = getChkList(up1(), CREATE, MODIFY, NONE);
			for (Chk01_DtlR r : notErrDtlL) {
				if (!isNull(r.qtn_d_no())) {
					// 引継可能数量 = 見積明細.基準単位数量 - 見積明細.受注引継数量(基準単位換算) - 見積明細.売上実績引継数量(基準単位換算) + (更新前)基準単位数量
					MCNumber trnstablQty = r.qtn_base_unit_qty()
							.subtract(r.base_unit_slo_trnst_qty())
							.subtract(r.base_unit_sls_trnst_qty())
							.add(nvl(r.old_base_unit_qty(), MCNumber.ZERO));
					// 上り電文.基準単位数量 > 引継可能数量の場合超過エラー
					if (r.base_unit_qty().gt(trnstablQty)) {
						msgL.add(new MCMessage(r, Chk01_DtlR.$trd_unit_qty, MSBBL0099, r
								.qtn_d_no(), trnstablQty, toDispGUIIndex(r)));
					}
				}
			}

			return msgL;
		}

		/**
		 * 	数量超過チェック(売上予定数)
		 * <p>
		 * [条件]<br>
		 * 	打切ＦＬＧがオンかつ売上予定に紐づく明細で、数量が売上予定数を超える場合<br>
		 * [前提]<br>
		 * 	同一売上実績単位で引継対象行の重複はないものとする（売上予定ＮＯで最大1件のみ)
		 * </p>			
		 * @return
		 */
		protected MCMessageList checkQtyOverSlsSchd() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_DtlR> notErrDtlL = getChkList(up1(), CREATE, MODIFY, NONE);
			for (Chk01_DtlR r : notErrDtlL) {
				if (!isNull(r.sls_schd_no()) && r.abort_flg()) {
					MCNumber schdQty = MCNumber.ZERO;
					MCNumber slsQty = MCNumber.ZERO;
					
					// 検収基準売上：売上予定の基準単位数量を打切の閾値に設定
					if (MAC_SLS_BASIS_TYP.isIN_BASIS(up0().sls_basis_typ()) || MAC_SLS_BASIS_TYP.isARRIVAL_BASIS(up0().sls_basis_typ())) {
						schdQty = r.getNumberNE("sls_schd_base_unit_qty");
						slsQty = r.getNumberNE("base_unit_sls_qty");
					}
					// 出荷指図対象外売上：出荷進捗の基準単位数量を打切の閾値に設定
					else {
						schdQty = r.getNumberNE("pr_base_unit_qty");
						slsQty = r.getNumberNE("sum_base_unit_sls_qty");
					}
					if ((!r.old_abort_flg() || r.base_unit_qty().gt(nvl(r.old_base_unit_qty(), MCNumber.ZERO))) && 
							slsQty
							.subtract(nvl(r.old_base_unit_qty(), MCNumber.ZERO))
							.add(r.base_unit_qty())
							.gte(schdQty)) {
						msgL.add(new MCMessage(r, Chk01_DtlR.$abort_flg, MSBBL0115, toDispGUIIndex(r)));
					}
				}
			}
			return msgL;
		}
		/**
		 * 得意先チェック
		 * 
		 * @return
		 */
		protected MCMessageList chkCst() {
			MCMessageList msgL = new MCMessageList();
			
			if (!MSC_IV_SRC_TYP.isSLS(up0().iv_src_typ())) {
				return msgL;
			}
			// 更新対象の売上実績の取得
			MST_SLS_ACT_R t = MST_SLS_ACT_R.create("T");
			MST_SLS_ACT_R slsActR = MST_SLS_ACT_R.create();
			MCQueryApiBuilder slsActL_bldr = MCQueryApiBuilder.create(t);
			
			slsActL_bldr.setDistinct();
			slsActL_bldr.setSelect(t.cst_cd);
			slsActL_bldr.setWhere(t.iv_no.eq(bind("1")), up0().iv_no());
			slsActL_bldr.addWhereWithAnd(t.sls_act_seq.eq(bind("1")), up0().sls_act_seq());
			slsActL_bldr.addWhereWithAnd(t.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			dbSelect("MSBBL1310_MST_SLS_ACT_S06", slsActR, slsActL_bldr);
			
			// 訂正前の得意先がインボイス対象外で訂正後がインボイス対象の場合はエラー
			if (!isNull(slsActR.cst_cd()) && !getBpCache(slsActR.cst_cd()).cst_iv_flg() && getBpCache(up0().cst_cd()).cst_iv_flg()) {
				msgL.add(new MCMessage(MSBBL0634));
			}
			return msgL;
		}
		
		/**
		 * 納品先チェック
		 * 
		 * @return
		 */
		protected MCMessageList chkDlv() {
			MCMessageList msgL = new MCMessageList();
			
			// 計画外売上のインボイスの場合のみチェックする
			if (up0().err_flg() || !MSC_IV_SRC_TYP.isSLS(up0().iv_src_typ())) {
				return msgL;
			}
			
			MCList<Chk01_DtlR> notErrDtlL = getChkList(up1());
			// 明細が納品先違いだと売上ヘッダが割れ、インボイスヘッダも割らなければならないため許容しない
			if (notErrDtlL.groupBy(Chk01_DtlR.$dlv_cd).size() != 1) {
				msgL.add(new MCMessage(MSBBL0604));
			}
			return msgL;
		}
		
		/**
		 * インボイスチェック
		 * 
		 * @return
		 */
		protected MCMessageList chkIv() {
			MCMessageList msgL = new MCMessageList();
			
			// インボイス引継ぎの場合のみチェックする
			if (up0().err_flg() || MSC_IV_SRC_TYP.isSLS(up0().iv_src_typ()) || !up0().cst_iv_flg()) {
				return msgL;
			}
			
			// チェック対象のインボイスＮＯ
			if (isNullOrNullVal(up0().iv_no())) {
				msgL.add(new MCMessage(up0(), Chk01_HdrR.$iv_no, MSBBL0254, toDispGUIIndex(up0())));
				return msgL;
			}
			
			// インボイス明細トランに存在する対象インボイスＮＯを持つ件数を取得
			MST_IV_D_R ivd = MST_IV_D_R.create("IVD");
			MST_SLS_SCHD_R slss = MST_SLS_SCHD_R.create("SLSS");
			MCList<MST_IV_R> ivTblL = MCList.create(MST_IV_R.class);
			MST_IV_R t = MST_IV_R.create("T");
			MCQueryApiBuilder ivTblL_bldr = MCQueryApiBuilder.create(t);
			ivTblL_bldr.addSelect(ivd.iv_d_no);
			ivTblL_bldr.addLeftOuterJoin(ivd, bracket( t.iv_mng_no.eq(ivd.iv_mng_no)));
			ivTblL_bldr.addLeftOuterJoin(slss, bracket( ivd.iv_d_no.eq(slss.iv_d_no)));
			ivTblL.addStringColumn(MST_IV_D_R.$iv_d_no);
			ivTblL_bldr.setWhere(t.iv_no.eq(bind("1")), up0().iv_no());
			dbSelect("MSBBL1310_MST_IV_S03", ivTblL, ivTblL_bldr);
			
			if (ivTblL.isEmpty()) {
				msgL.add(new MCMessage(up0(), Chk01_HdrR.$iv_no, MSBBL0254, toDispGUIIndex(up0())));
			}
			setErrFlg(msgL);
			
			return msgL;
		}
		
		/**
		 * 明細にも保持しているヘッダ項目の整合性チェック
		 * 
		 * @return
		 */
		protected MCMessageList chkHdrAndDtlCol() {
			MCMessageList msgL = new MCMessageList();
			
			// インボイス対象の場合のみチェックする
			if (up0().err_flg() || !up0().cst_iv_flg()) {
				return msgL;
			}
			
			// 新規ではチェックせず、訂正のときのみエラーとなるようにする
			for (MCList<Chk01_DtlR> groupL : up1().groupList(Chk01_DtlR.$sls_act_no)) {
				if (groupL.groupBy(Chk01_DtlR.$sls_usr_cd, Chk01_DtlR.$sls_dpt_cd, Chk01_DtlR.$ar_dpt_cd).size() != 1) {
					msgL.add(new MCMessage(MSBBL0638));
				}
			}
			return msgL;
		}
		
		/**
		 * ロット・サブロット混在不可チェック
		 * <p>
		 * 	[条件]<br>
		 * 	ロット混在不可がオンの場合、明細単位で詳細のロットが異なる場合<br>
		 * 	サブロット混在不可がオンの場合、明細単位で詳細のロットが異なる場合
		 * </p>
		 * @return
		 */
		protected MCMessageList chkNotLotMix() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_DtlR> notErrDtlL = getChkList(up1(), CREATE, MODIFY, NONE);
			MCList<Chk01_IoR> notErrIoL = getChkList(up2(), CREATE, MODIFY, NONE);
			
			// 同一受注明細、出荷予定の同一品目でロット・サブロットの混在をチェックするためのグループ
			String[] lotMixGrpCols =new String[]{
					Chk01_DtlR.$slo_d_no,
					Chk01_DtlR.$ship_schd_no,
					Chk01_DtlR.$itm_cd,
					Chk01_DtlR.$itm_sub1,
					Chk01_DtlR.$itm_sub2,
					Chk01_DtlR.$itm_sub3
					};
			
			for (MCList<Chk01_DtlR> dtlL : notErrDtlL.groupList(lotMixGrpCols)) {
				
				for (Chk01_DtlR dtlR : dtlL) {
					String dispItm = toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3());
					String dispGUIIndex = toDispGUIIndex(dtlR);
					
					MCList<Chk01_IoR> chdL = getChildIoL(notErrIoL, dtlR);
					
					// ロット、サブロット混在（同一受注明細ＮＯ、出荷予定ＮＯ単位の同一品目）
					if (!MAC_LOT_MNG_TYP.isNOT_MNG(dtlR.lot_mng_typ())) {
						if (dtlR.not_lot_mix_flg()) {
							if (chdL.groupList(Chk01_IoR.$lot_no).length > 1) {
								msgL.add(new MCMessage(dtlR, null, MSBBL0701, dispItm, dispGUIIndex));
							}
						}
						if (!MAC_SUBLOT_MNG_TYP.isNOT_MNG(dtlR.sublot_mng_typ()) && dtlR.not_sublot_mix_flg()) {
							if (chdL.groupList(Chk01_IoR.$lot_no,Chk01_IoR.$sublot_no).length > 1) {
								msgL.add(new MCMessage(dtlR, null, MSBBL0702, dispItm, dispGUIIndex));
							}
						}
					}
				}
			}
			return msgL;
		}
		
		/**
		 * 輸出実績サービス：インボイス更新前チェック呼出
		 * 
		 * @param ope
		 */
		protected void callExActSvChk02() {
			if (up0().err_flg() || MSC_IV_SRC_TYP.isSLS(up0().iv_src_typ())) {
				return;
			}
			
			// 預りは預り以外と混ぜて1つのインボイスにできないが、
			// インボイス登録時に非在庫品が追加されている可能性もあるため、
			// 「1明細でも預りがあれば預り取引」と判定する
			for (Chk01_DtlR r : up1()) {
				if (r.sls_cststk_flg()) {
					return;
				}
			}
			
			MSBEL_ExActService.ExAct_Chk02 ope = MSBEL_ExActService.crtExAct_Chk02();
			ExAct_Upd02_DtlR oUp0;
			if (up0().cst_iv_flg()
					&& !isNullOrNullVal(up0().iv_no())
					&& !MAC_VIA_DLV_TYP.isVIA(getViaDlvTyp(up0().iv_no()))) {
				oUp0 = ExAct_Upd02_DtlR.create();
				oUp0.peg_no(up0().peg_no());
				oUp0.iv_no(up0().iv_no());
				oUp0.cmpl_flg(true);
				ope.up0().add(oUp0);
			}
		
			if (!ope.up0().isEmpty()) {
				ope.exec();
				up0().err_flg(ope.down0().get(0).err_flg());
			}
		}
		@Override
		protected boolean isSetListLogicValue(MCNumber paramIndex, MCRow row,
				String column) {
			if (isSame(paramIndex, 1)) {
				if (isDlvCols(column)) {
					if (row.getBoolean(Chk01_DtlR.$dlv_sundry_flg)) {
						return false;
					}
				}
			}
			return super.isSetListLogicValue(paramIndex, row, column);
		}
		
		protected boolean isDlvCols(String column) {
			return isSame(column, Chk01_DtlR.$dlv_zip_cd)
				|| isSame(column, Chk01_DtlR.$dlv_addr1)
				|| isSame(column, Chk01_DtlR.$dlv_addr2)
				|| isSame(column, Chk01_DtlR.$dlv_addr3)
				|| isSame(column, Chk01_DtlR.$dlv_addr4)
				|| isSame(column, Chk01_DtlR.$dlv_tel)
				|| isSame(column, Chk01_DtlR.$dlv_fax)
				|| isSame(column, Chk01_DtlR.$dlv_cntct_dpt)
				|| isSame(column, Chk01_DtlR.$dlv_cntct_psn);
		}
	}

	/**
	 * Ins01オペレーション.<p>
	 *
	 * 売上実績情報を新規登録します。<br>
	 */
	public class Ins01 extends MSBBL_SlsActReg_MC_A.Ins01 {
		MCList<Chk01_HdrR> _up0L  = MCList.create(Chk01_HdrR.class);
		MCList<Chk01_HdrR> _down0L  = MCList.create(Chk01_HdrR.class);
				
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			// 上り電文の編集
			editUp();

			// チェックOpeの呼出
			callThisChk01();
			throwUpdErr();

			// 与信サービスの呼出(受注紐付時)
			callCredSvUpd01();

			// 輸出実績サービスの呼出
			callExActSvUpd02();

			// 売上実績サービスの呼出
			callSlsActSvUpd01();

			// 承認提供サービスの呼出(受注紐付かつ承認対象時)
			callAprvSvUpd02();

			// 見積情報更新処理(見積紐付時)
			updQtn();

			// 受払実績サービスの呼出
			callIoActSvUpd01();

			// 下り電文の設定
			setDown();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {

			//　納品書ＮＯの設定
			setDlvSlipNo();
			//　紐付けＮＯの設定
			setPegNoSub(up0(), up1(), up2());
			
			splitUp();
		}
		/**
		 * 上り電文の分割
		 */
		protected void splitUp() {
			if (!up0().cst_iv_flg()) {
				_up0L.add(up0());
				return;
			}
			
			// 分割の有無に応じてヘッダ紐付けＮＯを設定する
			// 同一取引、売上担当者、売上部門、債権部門、見積ＮＯ、受注ＮＯ、納品書ＮＯ
			// この場合、ヘッダ紐付けＮＯを同じにする（1ヘッダ、複数明細の形式）
			int hdrPegNo = 0;
			for (MCList<Chk01_DtlR> dtlL : up1().groupList(getSlsGrpCols())) {
				Chk01_HdrR row = up0().clone();
				Chk01_DtlR tgtR = dtlL.get(0);
				
				// 計画外売上のインボイスの場合はヘッダにしか取引ＣＤと得意先注文ＮＯがないので明細の値で上書きしない
				if (!MSC_IV_SRC_TYP.isSLS(up0().iv_src_typ())) {
					row.trd_cd(tgtR.trd_cd());
				}
				row.sls_usr_cd(tgtR.sls_usr_cd());
				row.sls_dpt_cd(tgtR.sls_dpt_cd());
				row.wg_cd(tgtR.wg_cd());
				row.ar_dpt_cd(tgtR.ar_dpt_cd());
				row.qtn_no(tgtR.qtn_no());
				row.qtn_rev(tgtR.qtn_rev());
				row.slo_no(tgtR.slo_no());
				row.dlv_slip_no(tgtR.dlv_slip_no());
				row.peg_no(hdrPegNo);
				_up0L.add(row);
				
				for (Chk01_DtlR dtlR : dtlL) {
					dtlR.peg_no(hdrPegNo);
					
					MCList<Chk01_IoR> IoL = up2().subList(Chk01_DtlR.$dtl_peg_no, dtlR.dtl_peg_no());
					for (Chk01_IoR IoR : IoL) {
						IoR.peg_no(hdrPegNo);
					}
				}
				hdrPegNo++;
			}
		}
		
		protected String[] getSlsGrpCols() {
			return new String[]{
					Chk01_DtlR.$trd_cd, Chk01_DtlR.$sls_usr_cd, Chk01_DtlR.$sls_dpt_cd,
					Chk01_DtlR.$ar_dpt_cd, Chk01_DtlR.$qtn_no, Chk01_DtlR.$slo_no, Chk01_DtlR.$dlv_slip_no
					};
		}
		/**
		 * 	Chk01オペレーションの呼出
		 */
		protected void callThisChk01() {
			for (Chk01_HdrR upR : _up0L) {
				copyall(chk01.up0(), upR);
				chk01.up1().setAll(up1().subList(Chk01_DtlR.$peg_no, upR.peg_no()));
				chk01.up2().setAll(up2().subList(Chk01_IoR.$peg_no, upR.peg_no()));
				chk01.call();
				
				upR.setValuesByName(chk01_down0);
				down0().setValuesByName(chk01_down0);
				_down0L.add(down0().clone());
			}
			down1().setAll(chk01.down1());
			down2().setAll(chk01.down2());
		}

		protected void setDown() {
		}

		protected void setDlvSlipNo() {
			up0().dlv_slip_no(up0().ship_dlv_slip_no());
			
			for (Chk01_DtlR dtlR : up1()) {
				dtlR.dlv_slip_d_no(dtlR.ship_dlv_slip_d_no());
			}
		}

		/**
		 * 	与信サービス.与信更新処理の呼出
		 * 
		 */
		protected void callCredSvUpd01() {
			
			MSBGL_CredService.Cred_Upd01 ope = MSBGL_CredService.crtCred_Upd01();
			
			Cred_Upd01_CndR up0R = Cred_Upd01_CndR.create();
			MCNumber credAmtSum = MCNumber.ZERO;;
			MCNumber credAmt = null;
			
			up0R.cst_cd(down0().cst_cd());
			up0R.cur_cd(down0().trd_cur_cd());
			up0R.trd_ptn_typ(down0().trd_ptn_typ());
			up0R.cred_upd_typ(MSC_CRED_UPD_TYP.UPD.value());
			
			for (Chk01_DtlR dtlR : down1()) {
				
				if (MSC_IV_SRC_TYP.isSLS(down0().iv_src_typ())) {
					break;
				}
				
				if (!isNull(dtlR.sls_schd_no())) {
					credAmt = calcCredAmt(dtlR.sls_schd_no(), dtlR.base_unit_qty(), MCNumber.ZERO,
							null, null, false, false, false);
					
					credAmtSum = credAmtSum.add(dtlR.dscnt_itm_flg() ? credAmt.negate() : credAmt);
				}
			}
			
			up0R.amt(credAmtSum);
			
			ope.up0().add(up0R);
			
			if (!ope.up0().isEmpty()) {
				ope.exec();
			}
		}
		/**
		 * 輸出実績サービス（インボイス更新）の呼出
		 * 
		 */
		protected void callExActSvUpd02() {
			
			if (MSC_IV_SRC_TYP.isSLS(up0().iv_src_typ())) {
				return;
			}
			// 預りは預り以外と混ぜて1つのインボイスにできないが、
			// インボイス登録時に非在庫品が追加されている可能性もあるため、
			// 「1明細でも預りがあれば預り取引」と判定する
			for (Chk01_DtlR r : up1()) {
				if (r.sls_cststk_flg()) {
					return;
				}
			}
			
			MSBEL_ExActService.ExAct_Upd02 ope = MSBEL_ExActService.crtExAct_Upd02();
			ExAct_Upd02_DtlR oUp0;
			
			if (up0().cst_iv_flg()
					&& !isNullOrNullVal(up0().iv_no())
					&& !MAC_VIA_DLV_TYP.isVIA(getViaDlvTyp(up0().iv_no()))) {
				oUp0 = ExAct_Upd02_DtlR.create();
				oUp0.peg_no(up0().peg_no());
				oUp0.iv_no(up0().iv_no());
				oUp0.cmpl_flg(true);
				ope.up0().add(oUp0);
			}
			if (!ope.up0().isEmpty()) {
				ope.exec();
			}
		}
		/**
		 * 	売上実績サービスの呼出
		 */
		protected void callSlsActSvUpd01() {
			for (Chk01_HdrR downR : _down0L) {
				editChk01HdrR(downR, down1());
			}
			
			MSBBL_SlsActService.SlsAct_Upd01 ope = MSBBL_SlsActService.crtSlsAct_Upd01();
			
			addAll(ope.up0(), _down0L, createMap_SlsAct_Upd01_HdrR_Chk01_HdrR());
			addAll(ope.up1(), down1(), createMap_SlsAct_Upd01_DtlR_Chk01_DtlR());
			addAll(ope.up2(), down2(), createMap_SlsAct_Upd01_IoR_Chk01_IoR());
			
			ope.up3().indiv_prnt_flg(true);
			ope.exec();

			SlsAct_Upd01_RsltR downRslt = ope.down0().get(0);
			// 伝票が分割される場合もありえる。
			// その場合は下り電文の最初の要素の売上実績ＮＯを返却する
			down0().sls_act_no(downRslt.sls_act_no());
			down0().sls_act_rev(downRslt.sls_act_rev());
			down0().dlv_slip_no(downRslt.dlv_slip_no());
			down0().iv_no(downRslt.iv_no());
			down0().iv_rev(downRslt.iv_rev());
			
			String[] dtlDestCols = new String[]{Chk01_DtlR.$sls_act_d_no, Chk01_DtlR.$dlv_slip_d_no, Chk01_DtlR.$iv_d_no};
			String[] dtlSrcCols = new String[]{SlsAct_Upd01_Rslt_DtlR.$sls_act_d_no, SlsAct_Upd01_Rslt_DtlR.$dlv_slip_d_no, SlsAct_Upd01_Rslt_DtlR.$iv_d_no};
			
			copyByPegNo(down1(), ope.down1(), Chk01_DtlR.$dtl_peg_no, dtlDestCols, SlsAct_Upd01_Rslt_DtlR.$dtl_peg_no, dtlSrcCols);
		}

		/**
		 * 	承認提供サービスの呼出
		 */
		protected void callAprvSvUpd02() {

			if (up0().err_flg()) {
				return;
			}
			// 	出荷指示対象外売上で、対象受注が承認対象だった場合、承認提供サービスを実行し、承認次処理済ＦＬＧを更新する。
			if ((!isNull(up0().slo_no()) && up0().slo_aprv_flg())
					|| (!isNull(up0().qtn_aprv_no()) && up0().qtn_aprv_flg())) {
				MBBAL_AprvService.Aprv_Upd02 ope = MBBAL_AprvService.crtAprv_Upd02();
				Aprv_Chk02_Rslt1R up = ope.up0().createRow();
				if (!isNull(down0().slo_aprv_no())) {
					up.aprv_no(down0().slo_aprv_no());
				}
				else {
					up.aprv_no(down0().qtn_aprv_no());
				}
				up.setAttributes(down0());
				ope.up0().add(up);
				ope.exec();
			}
		}

		/**
		 * 	見積情報更新処理
		 */
		protected void updQtn() {

			if (!isNull(down0().qtn_no()) && isNull(down0().slo_no())) {

				// 見積ヘッダは空更新
				MST_QTN_R qtn = MST_QTN_R.create();
				qtn.qtn_no(down0().qtn_no());
				qtn.qtn_rev(down0().qtn_rev());
				dbTsUpdateKey("MSBBL1310_MST_QTN_U01", qtn,
						MCQueryApiBuilder.create(MST_QTN_R.create("T")).getBaseDbc());

				// 見積明細を更新
				MST_QTN_D_R t = MST_QTN_D_R.create("T2");
				MCQueryApiBuilder qtn_bldr = MCQueryApiBuilder.create(t);
				qtn_bldr.setWhere(t.qtn_d_no.eq(bindEx("qtn_d_no")));
				qtn_bldr.setSetVL(t.sls_trnst_qty, t.sls_trnst_qty.add(bindEx("trd_unit_qty")));
				dbUpdate("MSBBL1310_MST_QTN_D_U01", down1(), qtn_bldr);
			}
		}

		/**
		 * 	受払実績サービスの呼出
		 */
		protected void callIoActSvUpd01() {

			// 上り電文は不要（ワークに格納されたデータを登録するだけなので）
			MSBEL_IoActService.IoAct_Upd01 o = MSBEL_IoActService.crtIoAct_Upd01();
			o.setLotChkFlg(up0().lot_chk_off_flg());
			o.exec();
			
		}

	}

	/**
	 * Chk02オペレーション.<p>
	 *
	 * 売上実績情報を取消前チェックをします。<br>
	 */
	public class Chk02 extends MSBBL_SlsActReg_MC_A.Chk02 {

		protected MST_SLS_ACT_R _slsAct;

		protected MCList<MST_SLS_ACT_D_R> _slsActDL;

		protected MCList<MST_SLS_ACT_IO_R> _slsActIoL;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			
			callAprvSrv();
			
			setDown();
		}

		protected void callAprvSrv() {
			MBBAL_AprvService.Aprv_Chk03 aprvChk03 = MBBAL_AprvService.crtAprv_Chk03();
			Aprv_Chk02_Rslt1R chk03Up = aprvChk03.up0().createRow();
			
			if (!isNull(up0().slo_aprv_no())) {
				chk03Up.aprv_no(up0().slo_aprv_no());
				aprvChk03.up0().add(chk03Up);
			}
			else if (!isNull(up0().qtn_aprv_no())) {
				chk03Up.aprv_no(up0().qtn_aprv_no());
				aprvChk03.up0().add(chk03Up);
			}
			
			if (!up0().err_flg() && !aprvChk03.up0().isEmpty()) {
				aprvChk03.exec();
				copyErrFlg(up0(), aprvChk03.down0().get(0));
			}
		}

		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().addAll(up1());
		}

		@Override
		protected MCMessageList doServerCheckBase() {

			MCMessageList msgL = super.doServerCheckBase();

			// 更新カウンタチェック、排他ロック獲得
			msgL.addAll(lockAndCheckBase());

			// 有効明細行数チェック
			if (!up0().getBooleanNE("del_all_sls_d_flg")) {
				msgL.addAll(checkAtLeastOneDtl(up0(), up1()));	
			}

			// 補完(定型チェック実施前)
			compHdrBase();
			compDtlBase();
			compIoBase();

			return msgL;
		}

		/**
		 * 更新カウンタチェック、排他ロック獲得
		 * @return
		 */
		protected MCMessageList lockAndCheckBase() {

			MCMessageList msgL = new MCMessageList();

			// 売上実績
			msgL.addAll(lockAndCheckSlsAct());

			// 見積
			if (msgL.isEmpty()) {
				msgL.addAll(lockAndCheckQtn());
			}
			// 受注
			if (msgL.isEmpty()) {
				msgL.addAll(lockAndCheckSlo());
			}
			// インボイス
			if (msgL.isEmpty()) {
				msgL.addAll(lockAndCheckIv());
			}
			// 売上予定
			if (msgL.isEmpty()) {
				msgL.addAll(lockAndCheckSlsSchd());
			}
			return msgL;
		}

		/**
		 * 	売上実績情報の更新カウンタチェック、排他ロック獲得、補完
		 * 
		 * @return
		 */
		protected MCMessageList lockAndCheckSlsAct() {

			MCMessageList msgL = new MCMessageList();

			if (!isNull(up0().sls_act_no())) {

				_slsAct = MST_SLS_ACT_R.create();
				_slsActDL = MCList.create(MST_SLS_ACT_D_R.class);
				_slsActIoL = MCList.create(MST_SLS_ACT_IO_R.class);

				// 1.売上実績 (排他ロック獲得/更新カウンタチェック)
				dbSelectKeyForUpdateNoWait("MSBBL1310_MST_SLS_ACT_S02", _slsAct,
						MCQueryApiBuilder.create(MST_SLS_ACT_R.create("T")), up0());
				msgL.addAll(checkUpdCntrNE(up0(), Chk02_HdrR.$upd_cntr, _slsAct));

				up0().slo_no(_slsAct.slo_no());
				up0().qtn_no(_slsAct.qtn_no());
				up0().qtn_rev(_slsAct.qtn_rev());

				// 2.売上実績明細
				MAM_TAX_R m1 = MAM_TAX_R.create("M1");
				MST_SLS_ACT_D_R slsActDL_t = MST_SLS_ACT_D_R.create("T");
				MCQueryApiBuilder slsActDL_bldr = MCQueryApiBuilder.create(slsActDL_t);
				_slsActDL.addBooleanColumn("inc_tax_flg");
				slsActDL_bldr.addSelect(m1.inc_tax_flg);
				slsActDL_bldr.setWhere(slsActDL_t.sls_act_no.eq(bind("sls_act_no"))
						.and(slsActDL_t.sls_act_seq.eq(bind("sls_act_seq"))), up0());
				slsActDL_bldr.addLeftOuterJoin(m1, bracket(slsActDL_t.tax_cd.eq(m1.tax_cd)));
				slsActDL_bldr.setOrderByAsc(slsActDL_bldr.getBaseDbc().getKeyColumn$());
				slsActDL_bldr.setLockTable(slsActDL_t.sls_act_d_no);
				dbSelectForUpdate("MSBBL1310_MST_SLS_ACT_D_S02", _slsActDL, slsActDL_bldr);

				MCIndexKey idxDtlKey = _slsActDL.createIndex(slsActDL_t.getKeyColumn());

				// 削除時は基本的には明細は上らせる必要はないのだが、売上予定の更新カウンタチェックにおいて、売上予定は明細単位のため
				// 明細に売上予定の更新カウンタを保持しておいて、渋々明細も上らせている。
				// それに伴い、上り電文の明細と売上実績明細を突合せチェックを行う
				for (Chk02_DtlR r : up1()) {

					MST_SLS_ACT_D_R slsActD = _slsActDL.getFirst(idxDtlKey,
							r.toArray(slsActDL_t.getKeyColumn()));
					if (isNull(slsActD)) {
						// 基本的にはありえないはず(ヘッダの更新カウンタチェックでエラーになるため到達しない)
						msgL.addAll(getRecordNotFoundMsg(getModuleID(),
								slsActDL_t.tableName(), slsActDL_t.getKeyColumn(),
								r.toArray(slsActDL_t.getKeyColumn()), r));
					}
					else {
						// 項目を補完  (せっかく突合せしたのでcompDtlBaseではなくここで行う)
						r.sls_act_no(slsActD.sls_act_no());
						r.sls_act_seq(slsActD.sls_act_seq());
						r.trd_unit_cd(slsActD.trd_unit_cd());
						r.trd_unit_qty(slsActD.trd_unit_qty());
						r.base_unit_cd(slsActD.base_unit_cd());
						r.base_unit_qty(slsActD.base_unit_qty());
						r.trd_cur_upri(slsActD.trd_cur_upri());
						r.sls_schd_no(slsActD.sls_schd_no());
						r.ship_schd_no(slsActD.ship_schd_no());
						r.slo_d_no(slsActD.slo_d_no());
						r.qtn_d_no(slsActD.qtn_d_no());//見積NO
						r.tax_cd(slsActD.tax_cd());
						r.inc_tax_flg(slsActD.getBooleanNE("inc_tax_flg"));
						r.trd_cur_dscnt_amt(slsActD.trd_cur_dscnt_amt());
					}
				}

				// 3.売上実績受払
				MST_SLS_ACT_D_R t2 = MST_SLS_ACT_D_R.create("T2");
				MST_SLS_ACT_IO_R slsActIoL_t = MST_SLS_ACT_IO_R.create("T");
				MCQueryApiBuilder slsActIoL_bldr = MCQueryApiBuilder.create(slsActIoL_t);
				slsActIoL_bldr.addInnerJoin(t2, bracket(slsActIoL_t.sls_act_d_no.eq(t2.sls_act_d_no)
						.and(slsActIoL_t.sls_act_d_seq.eq(t2.sls_act_d_seq))));
				slsActIoL_bldr.setWhere(t2.sls_act_no.eq(bind("sls_act_no"))
						.and(t2.sls_act_seq.eq(bind("sls_act_seq"))), up0());
				slsActIoL_bldr.setOrderByAsc(slsActIoL_bldr.getBaseDbc().getKeyColumn$());
				slsActDL_bldr.setLockTable(slsActIoL_t.sls_act_io_no);
				dbSelectForUpdate("MSBBL1310_MST_SLS_ACT_IO_S03", _slsActIoL, slsActIoL_bldr);

			}
			return msgL;
		}

		/**
		 * 	見積情報の更新カウンタチェック、排他ロック獲得
		 * @return
		 */
		protected MCMessageList lockAndCheckQtn() {

			MCMessageList msgL = new MCMessageList();
			if (!isNull(up0().qtn_no()) && isNull(up0().slo_no())) {
				MST_QTN_R qtn = MST_QTN_R.create();
				dbSelectKeyForUpdate("MSBBL1310_MST_QTN_S02", qtn,
						MCQueryApiBuilder.create(MST_QTN_R.create("T")), up0());
				msgL.addAll(checkUpdCntrNE(up0(), Chk02_HdrR.$qtn_upd_cntr, qtn));

				if (!qtn.isEmpty()) {
					up0().qtn_aprv_flg(qtn.aprv_flg());
					up0().qtn_aprv_no(qtn.aprv_no());
				}
			}
			return msgL;
		}

		/**
		 * 	受注情報の更新カウンタチェック、排他ロック獲得、補完
		 * <p>
		 * 	補完項目
		 * 	<li>承認対象ＦＬＧ</li>
		 * 	<li>承認ＮＯ</li>
		 * </p></br>
		 * @return
		 */
		protected MCMessageList lockAndCheckSlo() {

			MCMessageList msgL = new MCMessageList();

			if (!isNull(up0().slo_no())) {
				MST_SLO_R slo = MST_SLO_R.create();
				dbSelectKeyForUpdate("MSBBL1310_MST_SLO_S02", slo,
						MCQueryApiBuilder.create(MST_SLO_R.create("T")), up0());
				msgL.addAll(checkUpdCntrNE(up0(), Chk02_HdrR.$slo_upd_cntr, slo));
				if (!slo.isEmpty()) {
					up0().slo_aprv_flg(slo.aprv_flg());
					up0().slo_aprv_no(slo.aprv_no());
				}

				// 受注明細のチェックと補完
				MST_SLO_D_R t3 = MST_SLO_D_R.create("T3");
				MAVM_ITM_UNIT_R t2 = MAVM_ITM_UNIT_R.create("T2");
				MAM_ITM_R m1 = MAM_ITM_R.create("M1");

				MCList<MST_SLO_D_R> sloDL = MCList.create(MST_SLO_D_R.class);
				MCQueryApiBuilder sloDL_bldr = MCQueryApiBuilder.create(t3);
				sloDL.addBooleanColumn("dscnt_itm_flg");
				sloDL_bldr.setSelect(t3.slo_d_no);
				sloDL_bldr.addSelect(t3.slo_no);
				sloDL_bldr.addSelect(t3.trd_unit_cd);
				sloDL_bldr.addSelect(t3.trd_unit_qty);
				sloDL_bldr.addSelect(t3.trd_cur_upri);
				sloDL_bldr.addSelect(t3.trd_cur_amt);
				sloDL_bldr.addSelect(t3.trd_cur_tax_amt);
				sloDL_bldr.addSelect(t3.trd_cur_dscnt_amt);
				sloDL_bldr.addSelect(t3.base_unit_qty);
				sloDL_bldr.addSelect(t3.sls_cststk_flg);
				sloDL_bldr.addSelect(t2.conv_qty);
				sloDL_bldr.addSelect(t2.conv_base_qty);
				sloDL_bldr.addSelect(t2.dec_place);
				sloDL_bldr.addSelect(t2.rnd_typ);
				sloDL_bldr.addSelect(m1.dscnt_itm_flg);
				sloDL_bldr.addLeftOuterJoin(t2, bracket(t3.itm_cd.eq(t2.itm_cd)
						.and(t3.itm_sub1.eq(t2.itm_sub1))
						.and(t3.itm_sub2.eq(t2.itm_sub2))
						.and(t3.itm_sub3.eq(t2.itm_sub3))
						.and(t3.trd_unit_cd.eq(t2.unit_cd))));
				sloDL_bldr.addLeftOuterJoin(m1, bracket(t3.itm_cd.eq(m1.itm_cd)
						.and(t3.itm_sub1.eq(m1.itm_sub1))
						.and(t3.itm_sub2.eq(m1.itm_sub2))
						.and(t3.itm_sub3.eq(m1.itm_sub3))));
				dbSelectKey("MSBBL1310_MST_SLO_D_S02", sloDL, sloDL_bldr, up1());
				MCIndexKey idxKey = sloDL.createIndex(sloDL.createRow().getKeyColumn());
				for (Chk02_DtlR r : up1()) {

					// 受注引継だが、登録時に明細行を追加した場合を考慮して、
					// 受注明細ＮＯがＮＵＬＬの場合、処理をスキップする
					if (isNull(r.slo_d_no())) {
						continue;
					}

					MST_SLO_D_R sloD = sloDL.getFirst(idxKey,
							r.toArray(sloDL.createRow().getKeyColumn()));
					if (isNull(sloD)) {
						msgL.addAll(getRecordNotFoundMsg(getModuleID(), sloDL.createRow().tableName(),
								sloDL.createRow().getKeyColumn(), new String[] {
									r.slo_d_no()
								}, r));
						continue;
					}

					if (!isSame(sloD.slo_no(), up0().slo_no())) {
						msgL.addAll(getRecordInvalidMsg(Chk01_HdrR.$slo_no, sloD, r));
						continue;
					}

					r.src_trd_unit_cd(sloD.trd_unit_cd());
					r.src_trd_unit_qty(sloD.trd_unit_qty());
					r.src_trd_cur_upri(sloD.trd_cur_upri());
					r.src_trd_cur_amt(sloD.trd_cur_amt());
					r.src_trd_cur_tax_amt(sloD.trd_cur_tax_amt());
					r.src_trd_cur_dscnt_amt(sloD.trd_cur_dscnt_amt());
					r.src_trd_cur_inc_tax_amt(sloD.trd_cur_amt().add(sloD.trd_cur_tax_amt()));
					r.src_trd_unit_conv_qty(sloD.getNumberNE("conv_qty"));
					r.src_trd_unit_conv_base_qty(sloD.getNumberNE("conv_base_qty"));
					r.src_trd_unit_dec_place(sloD.getNumberNE("dec_place"));
					r.src_trd_unit_rnd_typ(sloD.getStringNE("rnd_typ"));
					r.sls_cststk_flg(sloD.sls_cststk_flg());
					r.dscnt_itm_flg(sloD.getBooleanNE("dscnt_itm_flg"));
				}
			}
			return msgL;
		}
		/**
		 * 	インボイス情報の更新カウンタチェック、排他ロック獲得
		 * @return
		 */
		protected MCMessageList lockAndCheckIv() {
			MCMessageList msgL = new MCMessageList();
			if (!isNull(up0().iv_no())) {
				MST_IV_R iv = MST_IV_R.create();
				dbSelectKeyForUpdate("MSBBL1310_MST_IV_S04", iv,
						MCQueryApiBuilder.create(MST_IV_R.create("T")), up0());
				msgL.addAll(checkUpdCntrNE(up0(), Chk01_HdrR.$iv_upd_cntr, iv));
			}
			return msgL;
		}
		/**
		 * 	売上予定の更新カウンタチェック、排他ロック獲得
		 * 
		 * @return
		 */
		protected MCMessageList lockAndCheckSlsSchd() {

			MCMessageList msgL = new MCMessageList();

			MCList<Chk02_DtlR> notErrL = getChkList(up1());
			for (Chk02_DtlR r : notErrL) {
				if (!isNull(r.sls_schd_no())) {
					MST_SLS_SCHD_R sSche = MST_SLS_SCHD_R.create();
					dbSelectKeyForUpdate("MSBBL1310_MST_SLS_SCHD_S04", sSche,
							MCQueryApiBuilder.create(MST_SLS_SCHD_R.create("T")), r);
					msgL.addAll(checkUpdCntrNE(r, Chk01_DtlR.$sls_schd_upd_cntr, sSche));
					if (!sSche.isEmpty()) {
						r.abort_flg(sSche.abort_flg());
					}
				}
			}
			return msgL;
		}

		/**
		 * 	ヘッダ情報の補完処理(定型チェック実施前)
		 */
		protected void compHdrBase() {

			// 排他ロックで取得した売上実績より補完
			up0().trd_cd(_slsAct.trd_cd());
			up0().trd_ptn_typ(_slsAct.trd_ptn_typ());
			up0().sls_act_rev(_slsAct.sls_act_rev());
			up0().sls_basis_typ(_slsAct.sls_basis_typ());
			up0().qtn_no(_slsAct.qtn_no());
			up0().qtn_rev(_slsAct.qtn_rev());
			up0().slo_no(_slsAct.slo_no());
			up0().trd_cur_cd(_slsAct.trd_cur_cd());
			up0().cst_cd(_slsAct.cst_cd());
		}

		/**
		 * 	明細情報の補完処理(定型チェック実施前)
		 */
		protected void compDtlBase() {

			// 明細単位で突合せして実施するため、補完処理は各更新カウンタチェック内で実施

		}

		/**
		 * 	詳細情報の補完処理(定型チェック実施前)
		 */
		protected void compIoBase() {

			// 排他ロックで獲得した売上実績受払より補完
			addAll(down2(), _slsActIoL, createMap_Chk02_IoR_MST_SLS_ACT_IO_R());
			// 各peg_noの設定
			down2().setNumber(Chk02_IoR.$peg_no, up0().peg_no());
			MCIndexKey idxKey = down2().createIndex(Chk02_IoR.$sls_act_d_no);
			for (Chk02_DtlR r : up1()) {
				MCList<Chk02_IoR> chdIoL = down2().subList(idxKey, r.sls_act_d_no());
				chdIoL.setNumber(Chk02_IoR.$dtl_peg_no, r.dtl_peg_no());
			}

			setPegNo(Chk02_IoR.$io_peg_no, down2());
		}

		@Override
		protected MCMessageList doServerCheck() {
			MCMessageList msgL = super.doServerCheck();
			
			if (hasErrFlgOn(up0(), up1())) {
				return msgL;
			}
			
			// 品目マスタ存在チェック
			msgL.addAll(checkMamItm());
			
			return msgL;
		}
		
		/**
		 * 品目マスタ存在チェック
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList checkMamItm() {
			MCMessageList msgL = new MCMessageList();
			
			MCList<MAM_ITM_R> mamItmL = searchMamItm(_slsActDL);
			
			MCIndexKey mamItmIdx = mamItmL.createIndex(MAM_ITM_R.create().getKeyColumn());
			MCIndexKey slsActDIdx = _slsActDL.createIndex(MST_SLS_ACT_D_R.$sls_act_d_no);
			
			for (Chk02_DtlR up1R : up1()) {
				MST_SLS_ACT_D_R slsActDR = MST_SLS_ACT_D_R.create();
				slsActDR = _slsActDL.getFirst(slsActDIdx, up1R.sls_act_d_no());
				
				if (isNull(mamItmL.getFirst(mamItmIdx, slsActDR.itm_cd(), slsActDR.itm_sub1(), slsActDR.itm_sub2(), slsActDR.itm_sub3()))) {
					String itmInfo = toDispItm(slsActDR.itm_cd(), slsActDR.itm_sub1(), slsActDR.itm_sub2(), slsActDR.itm_sub3());
					msgL.add(new MCMessage(up1R, null, MAUAL0189, itmInfo, toDispGUIIndex(up1R)));
				}
			}
			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			// 取消前の売上部門に対してDAC更新権限チェック
			if (!up0().cst_iv_flg()) {
				msgL.addAll(checkWritableDptCdDac(_slsAct, MST_SLS_ACT_R.$sls_dpt_cd));
			}
			else {
				msgL.addAll(checkWritableWgCdDac(_slsAct, MST_SLS_ACT_R.$wg_cd));
			}
			
			// 出荷実績同時計上チェック
			msgL.addAll(checkShipActSync());
			
			// 打切チェック
			msgL.addAll(checkAbort());
			
			// インボイス更新前チェック呼出
			callExActSvChk02();
			
			return msgL;
		}
		
		/**
		 * 出荷実績同時計上チェック
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList checkShipActSync() {
			
			MCMessageList msgL = new MCMessageList();
			
			if (!isNull(_slsAct) && !_slsAct.isEmpty() && _slsAct.ship_act_sync_flg()) {
				
				msgL.add(new MCMessage(MSBBL0262, _slsAct.sls_act_no(), " "));
			}
			
			return msgL;
		}

		/**
		 * 	打切チェック
		 * <p>
		 * [条件]<br>
		 * 	打切になっている実績を取り消そうとした場合
		 * </p>
		 * @return
		 */
		protected MCMessageList checkAbort() {
			MCMessageList msgL = super.doServerCheckSub();

			MCList<Chk02_DtlR> notErrDtlL = getChkList(up1());
			for (Chk02_DtlR r : notErrDtlL) {
				if (r.abort_flg()) {
					msgL.add(new MCMessage(r, Chk02_DtlR.$abort_flg, MSBBL0108,
							toDispGUIIndex(r)));
				}
			}
			return msgL;
		}
		/**
		 * 輸出実績サービス：インボイス更新前チェック呼出
		 * 
		 * @param ope
		 */
		protected void callExActSvChk02() {
			if (up0().err_flg() || MSC_IV_SRC_TYP.isSLS(up0().iv_src_typ())) {
				return;
			}
			
			// 預りは預り以外と混ぜて1つのインボイスにできないが、
			// インボイス登録時に非在庫品が追加されている可能性もあるため、
			// 「1明細でも預りがあれば預り取引」と判定する
			for (Chk02_DtlR r : up1()) {
				if (r.sls_cststk_flg()) {
					return;
				}
			}
			
			MSBEL_ExActService.ExAct_Chk02 ope = MSBEL_ExActService.crtExAct_Chk02();
			ExAct_Upd02_DtlR oUp0;
			
			if (up0().cst_iv_flg()
					&& !isNullOrNullVal(up0().iv_no())
					&& !MAC_VIA_DLV_TYP.isVIA(getViaDlvTyp(up0().iv_no()))) {
				oUp0 = ExAct_Upd02_DtlR.create();
				oUp0.peg_no(up0().peg_no());
				oUp0.iv_no(up0().iv_no());
				oUp0.cmpl_flg(false);
				ope.up0().add(oUp0);
			}
		
			if (!ope.up0().isEmpty()) {
				ope.exec();
				up0().err_flg(ope.down0().get(0).err_flg());
			}
		}
		/**
		 * 	売上実績受払(MST_SLS_ACT_IO_R) -> 下り電文(Chk02_IoR)
		 * @return
		 */
		protected Map_Chk02_IoR_MST_SLS_ACT_IO_R<Chk02_IoR, MST_SLS_ACT_IO_R> createMap_Chk02_IoR_MST_SLS_ACT_IO_R() {
			return new Map_Chk02_IoR_MST_SLS_ACT_IO_R<Chk02_IoR, MST_SLS_ACT_IO_R>();
		}

		public class Map_Chk02_IoR_MST_SLS_ACT_IO_R<D extends Chk02_IoR, S extends MST_SLS_ACT_IO_R>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk02_IoR.$sls_act_d_no, MST_SLS_ACT_IO_R.$sls_act_d_no);
				addColumnPathMap(Chk02_IoR.$sls_act_io_no,
						MST_SLS_ACT_IO_R.$sls_act_io_no);
				addColumnPathMap(Chk02_IoR.$sls_act_io_seq,
						MST_SLS_ACT_IO_R.$sls_act_io_seq);
			}
		}
	}

	protected MCList<MST_SLO_D_R> _sloDL = MCList.create(MST_SLO_D_R.class);
	protected MCList<MST_SLS_SCHD_R> _schdQtyL = MCList.create(MST_SLS_SCHD_R.class);
	protected MCIndexKey _idxSloD = null;
	protected MCIndexKey _idxSlsSchd = null;

	protected void getSloDQty(MCList<Chk01_DtlR> dtlL) {
		MST_SLO_D_R t = MST_SLO_D_R.create("T");
		MST_SHIP_PR_R t2 = MST_SHIP_PR_R.create("T2");

		MCList<Chk01_DtlR> bindL = dtlL.groupBy(Chk01_DtlR.$slo_d_no);
		MCList<MST_SLO_D_R> sloDL = MCList.create(MST_SLO_D_R.class);
		MCQueryApiBuilder sloDL_bldr = MCQueryApiBuilder.create(t);
		sloDL_bldr.setSelect(t.slo_d_no);
		sloDL_bldr.addSelect(t.base_unit_qty.add(t2.re_ship_schd_qty).as("base_unit_qty"));
		sloDL_bldr.addInnerJoin(t2, bracket(t.slo_d_no.eq(t2.slo_d_no)));
		sloDL_bldr.setWhere(t.slo_d_no.eq(bind("slo_d_no")));
		sloDL_bldr.addConstWhereWithAnd(
				bracket(t.ship_inst_typ.eq(value(MAC_SHIP_INST_TYP.NON.value()))
						.and(t.sls_cststk_flg.eq(value(false)))));
		dbSelect("MSBBL1310_MST_SLO_D_S03", sloDL, sloDL_bldr, bindL, null);

		if (!isNull(sloDL)) {
			_sloDL.setAll(sloDL);
			_idxSloD = _sloDL.createIndex(MST_SLO_D_R.$slo_d_no);
		}
	}

	protected void getSlsSchdQty(MCList<Chk01_DtlR> dtlL) {
		MST_SLS_SCHD_R t = MST_SLS_SCHD_R.create("T");

		MCList<Chk01_DtlR> bindL = dtlL.groupBy(Chk01_DtlR.$slo_d_no);
		MCList<MST_SLS_SCHD_R> slsSchdL = MCList.create(MST_SLS_SCHD_R.class);
		MCQueryApiBuilder slsSchdL_bldr = MCQueryApiBuilder.create(t);
		slsSchdL_bldr.setSelect(t.base_unit_sls_qty, t.base_unit_abort_qty);
		slsSchdL_bldr.setWhere(t.slo_d_no.eq(bind("slo_d_no")));
		slsSchdL_bldr.setGroupBy(t.slo_d_no);
		slsSchdL_bldr.addGroupFunc(sum(t.base_unit_sls_qty), "BASE_UNIT_SLS_QTY");
		slsSchdL_bldr.addGroupFunc(sum(t.base_unit_abort_qty), "BASE_UNIT_ABORT_QTY");
		dbSelect("MSBBL1310_MST_SLS_SCHD_S05", slsSchdL, slsSchdL_bldr, bindL);

		if (!isNull(slsSchdL)) {
			_schdQtyL.setAll(slsSchdL);
			_idxSlsSchd = _schdQtyL.createIndex(MST_SLS_SCHD_R.$slo_d_no);
		}
	}

	protected void getSloAndSlsSchd(MCList<Chk01_DtlR> dtlL) {
		getSloDQty(dtlL);
		getSlsSchdQty(dtlL);
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 売上実績情報を訂正します。<br>
	 */
	public class Upd01 extends MSBBL_SlsActReg_MC_A.Upd01 {
		MCList<Chk01_HdrR> _upL  = MCList.create(Chk01_HdrR.class);
		MCList<Chk01_HdrR> _downL  = MCList.create(Chk01_HdrR.class);
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			// 上り電文の編集
			editUp();
			
			callThisDel01();
			// チェックOpeの呼出
			callThisChk01();
			
			throwUpdErr();
			
			// 与信サービスの呼出(受注紐付時)
			callCredSvUpd01();
			
			// 輸出実績サービスの呼出
			callExActSvUpd02();
			
			// 売上実績サービスの呼出
			callSlsActSvUpd01();
			
			// 見積情報更新処理(見積紐付時)
			updQtn();
			
			// 売上予定サービスの呼出
			callSlsSchdSvUpd03();
			
			// 受払実績サービスの呼出
			callIoActSvUpd01();
			
			// 下り電文の設定
			setDown();
		}

		/**
		 * 	上り電文の編集
		 */
		protected void editUp() {

			// 紐付けＮＯの設定
			setPegNoSub(up0(), up1(), up2());
			
			// 上り電文の分割
			splitUp();
		}
		/**
		 * 	上り電文の分割
		 */
		protected void splitUp() {
			/** インボイス対象で売上伝票分割が発生する場合はインボイスと売上実績が1:N
			 * 訂正時はインボイスNO単位で検索して訂正するので売上実績がNの場合は売上実績サービスに渡すup0を分割 **/
			
			if (!up0().cst_iv_flg()) {
				_upL.add(up0());
				return;
			}
			
			// 対象となる売上実績の取得
			MST_SLS_ACT_R t = MST_SLS_ACT_R.create("T");
			MCList<MST_SLS_ACT_R> slsActL = MCList.create(MST_SLS_ACT_R.class);
			MCQueryApiBuilder slsActL_bldr = MCQueryApiBuilder.create(t);
			
			slsActL_bldr.setSelect(t.sls_act_no);
			slsActL_bldr.setWhere(t.iv_no.eq(bind("1")), up0().iv_no());
			slsActL_bldr.addWhereWithAnd(t.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			int cnt = dbSelect("MSBBL1310_MST_SLS_ACT_S04", slsActL, slsActL_bldr);
			
			MCIndexKey idxKey = up1().createIndex(Chk01_HdrR.$sls_act_no);
			for (int i = 0; i < cnt; i++) {
				Chk01_HdrR row = up0().clone();
				row.sls_act_no(slsActL.get(i).sls_act_no());
				
				Chk01_DtlR tgtR = up1().getFirst(idxKey, row.sls_act_no());
				// 計画外売上のインボイスの場合はヘッダにしか取引ＣＤと得意先注文ＮＯがないので明細の値で上書きしない
				if (!MSC_IV_SRC_TYP.isSLS(up0().iv_src_typ())) {
					row.trd_cd(tgtR.trd_cd());
				}
				row.sls_act_rev(tgtR.sls_act_rev());
				row.ship_act_no(tgtR.ship_act_no());
				row.sls_act_seq(tgtR.sls_act_seq());
				row.sls_usr_cd(tgtR.sls_usr_cd());
				row.sls_dpt_cd(tgtR.sls_dpt_cd());
				row.wg_cd(tgtR.wg_cd());
				row.ar_dpt_cd(tgtR.ar_dpt_cd());
				row.qtn_no(tgtR.qtn_no());
				row.qtn_rev(tgtR.qtn_rev());
				row.slo_no(tgtR.slo_no());
				row.dlv_slip_no(tgtR.dlv_slip_no());
				row.upd_cntr(tgtR.upd_cntr());
				row.qtn_upd_cntr(tgtR.qtn_upd_cntr());
				row.slo_upd_cntr(tgtR.slo_upd_cntr());
				row.peg_no(i);
				_upL.add(row);
			}
			
			// ヘッダで分割発生した場合のpeg_no振り直し（明細）
			MCIndexKey idxKey1 = _upL.createIndex(Chk01_HdrR.$sls_act_no);
			MCIndexKey idxKey2 = _upL.createIndex(Chk01_HdrR.$sls_usr_cd,Chk01_HdrR.$sls_dpt_cd, Chk01_HdrR.$ar_dpt_cd);
			for (Chk01_DtlR r : up1()) {
				if (!isNull(r.sls_act_no())) {
					r.peg_no(_upL.getFirst(idxKey1, r.sls_act_no()).peg_no());
				}
				else {
					// 行追加の場合、売上担当者・売上部門・債権部門が同一の明細と同じヘッダに紐づける
					// 紐づけられない場合はエラー（インボイス対象で明細を行追加する際の制約）
					Chk01_HdrR tgtR = _upL.getFirst(idxKey2, r.sls_usr_cd(), r.sls_dpt_cd(), r.ar_dpt_cd());
					if (!isNull(tgtR)) {
						r.peg_no(tgtR.peg_no());
					}
					else {
						throw new MCAppException(MSBBL0639, toDispGUIIndex(r));
					}
				}
			}
			// ヘッダで分割発生した場合のpeg_no振り直し（詳細）
			for (Chk01_IoR r : up2()) {
				r.peg_no(up1().getFirst(Chk01_DtlR.$dtl_peg_no, r.dtl_peg_no()).peg_no());
			}
		}
		/**
		 * 	下り電文の設定
		 */
		protected void setDown() {
		}
		/**
		 * Del01オペレーションの呼出
		 */
		protected void callThisDel01() {
			/* インボイスNO検索して訂正する際、ある売上実績ヘッダに紐づく明細がすべてなくなってしまうような明細行削除を行うと
			 * 売上実績ヘッダごと取消モードで削除するのと実質同じことなので、削除オペレーションを呼び出す
			 */
			
			/* 分割発生時は訂正前検索で売上実績NOの表示をNULLとしているため
			 * 分割の有無は売上実績NOで判断
			 * 売上実績登録画面で登録したインボイスでない場合はそもそも行削除できないので対象外
			 */
			if (!MSC_IV_SRC_TYP.isSLS(up0().iv_src_typ()) || !isNull(up0().sls_act_no())) {
				return;
			}
			
			for (MCList<Chk01_DtlR> downList : up1().groupList(Chk01_DtlR.$sls_act_no)) {
				// ヘッダに紐づく全明細が削除対象の場合
				if (isSame(downList.size(), downList.subList(r -> r.isStatusDelete()).size())) {
					MSBBL_SlsActReg.Del01 ope = MSBBL_SlsActReg.crtDel01();
					MCList<Chk02_DtlR> l = MCList.create(Chk02_DtlR.class);
					
					ope.up0().iv_mng_no(up0().iv_mng_no());
					ope.up0().iv_no(up0().iv_no());
					ope.up0().iv_dt(up0().iv_dt());
					ope.up0().iv_upd_cntr(up0().iv_upd_cntr());
					ope.up0().sls_act_no(downList.get(0).sls_act_no());
					ope.up0().sls_act_seq(downList.get(0).sls_act_seq());
					ope.up0().upd_cntr(_upL.getFirst(Chk01_HdrR.$sls_act_no, downList.get(0).sls_act_no()).upd_cntr());
					ope.up0().cst_iv_flg(true);
					ope.up0().can_ac_dt(up0().ac_dt());
					ope.up0().addBooleanColumn("del_all_sls_d_flg");
					ope.up0().setBoolean("del_all_sls_d_flg", true);
					ope.up0().iv_src_typ(MSC_IV_SRC_TYP.SLS.value());
					for (Chk01_DtlR r : downList) {
						Chk02_DtlR row = Chk02_DtlR.create();
						row.sls_act_no(r.sls_act_no());
						row.sls_act_d_no(r.sls_act_d_no());
						row.sls_act_d_seq(r.sls_act_d_seq());
						row.sls_schd_no(r.sls_schd_no());
						row.iv_d_no(r.iv_d_no());
						row.setStringNE("dlv_cd", r.dlv_cd());
						row.setStringNE("dlv_cntry_cd", r.dlv_cntry_cd());
						row.setStatus(DELETE);
						l.add(row);
					}
					ope.up1().setAll(l);
					ope.exec();
					
					// 削除済みのものはUpd01の電文からは除外する
					_upL.setAll(_upL.subList(r -> !isSame(r.sls_act_no(), downList.get(0).sls_act_no())));
					up1().setAll(up1().subList(r -> !isSame(r.sls_act_no(), downList.get(0).sls_act_no())));
					
					MCIndexKey idxKey2 = up1().createIndex(Chk01_DtlR.$dtl_peg_no);
					MCList<Chk01_IoR> list = MCList.create(Chk01_IoR.class);
					for (Chk01_IoR r : up2()) {
						if (isNull(up1().getFirst(idxKey2, r.dtl_peg_no()))) {
							list.addAll(up2().subList(r2 -> !isSame(r2.dtl_peg_no(), r.dtl_peg_no())));
						}
					}
					up2().setAll(list);
				}
			}
		}
		/**
		 * 	Chk01オペレーションの呼出
		 */
		protected void callThisChk01() {
			for (Chk01_HdrR upR : _upL) {
				copyall(chk01.up0(), upR);
				chk01.up1().setAll(up1().subList(Chk01_DtlR.$peg_no, upR.peg_no()));
				chk01.up2().setAll(up2().subList(Chk01_IoR.$peg_no, upR.peg_no()));
				chk01.call();
				
				upR.setValuesByName(chk01_down0);
				down0().setValuesByName(chk01_down0);
				_downL.add(down0().clone());
			}
			down1().setAll(chk01.down1());
			down2().setAll(chk01.down2());
		}
		/**
		 * 	与信サービス.与信更新処理の呼出
		 * 
		 */
		protected void callCredSvUpd01() {
			
			MSBGL_CredService.Cred_Upd01 ope = MSBGL_CredService.crtCred_Upd01();
			
			Cred_Upd01_CndR up0R = Cred_Upd01_CndR.create();
			MCNumber credAmtSum = MCNumber.ZERO;
			MCNumber credAmt = null;
			
			up0R.cst_cd(down0().cst_cd());
			up0R.cur_cd(down0().trd_cur_cd());
			up0R.trd_ptn_typ(down0().trd_ptn_typ());
			up0R.cred_upd_typ(MSC_CRED_UPD_TYP.UPD.value());
				
			getSloAndSlsSchd(up1());
			for (Chk01_DtlR dtlR : down1()) {
				if (MSC_IV_SRC_TYP.isSLS(down0().iv_src_typ())) {
					break;
				}
				if (!isNull(dtlR.sls_schd_no())) {
					
					if (dtlR.isStatusDelete() && isNull(dtlR.base_unit_qty())) {
						dtlR.base_unit_qty(MCNumber.ZERO);
					}
					credAmt = calcCredAmt(dtlR.sls_schd_no(), dtlR.base_unit_qty(), dtlR.old_base_unit_qty(),
							dtlR.slo_d_no(), up0().sls_basis_typ(), false, false, dtlR.abort_flg());
					
					credAmtSum = credAmtSum.add(dtlR.dscnt_itm_flg() ? credAmt.negate() : credAmt);
				}
			}
			
			up0R.amt(credAmtSum);
			
			ope.up0().add(up0R);
			
			if (!ope.up0().isEmpty()) {
				ope.exec();
			}
		}
		/**
		 * 輸出実績サービス（インボイス更新）の呼出
		 * 
		 */
		protected void callExActSvUpd02() {
			
			if (MSC_IV_SRC_TYP.isSLS(up0().iv_src_typ())) {
				return;
			}
			// 預りは預り以外と混ぜて1つのインボイスにできないが、
			// インボイス登録時に非在庫品が追加されている可能性もあるため、
			// 「1明細でも預りがあれば預り取引」と判定する
			for (Chk01_DtlR r : up1()) {
				if (r.sls_cststk_flg()) {
					return;
				}
			}
			
			MSBEL_ExActService.ExAct_Upd02 ope = MSBEL_ExActService.crtExAct_Upd02();
			ExAct_Upd02_DtlR oUp0;
			
			if (up0().cst_iv_flg()
					&& !isNullOrNullVal(up0().iv_no())
					&& !MAC_VIA_DLV_TYP.isVIA(getViaDlvTyp(up0().iv_no()))) {
				oUp0 = ExAct_Upd02_DtlR.create();
				oUp0.peg_no(up0().peg_no());
				oUp0.iv_no(up0().iv_no());
				oUp0.cmpl_flg(true);
				ope.up0().add(oUp0);
			}
			if (!ope.up0().isEmpty()) {
				ope.exec();
			}
		}
		/**
		 * 	売上実績サービスの呼出
		 */
		protected void callSlsActSvUpd01() {
			for (Chk01_HdrR downR : _downL) {
				editChk01HdrR(downR, down1());
			}

			MSBBL_SlsActService.SlsAct_Upd01 ope = MSBBL_SlsActService.crtSlsAct_Upd01();
			addAll(ope.up0(), _downL, createMap_SlsAct_Upd01_HdrR_Chk01_HdrR());
			addAll(ope.up1(), down1(), createMap_SlsAct_Upd01_DtlR_Chk01_DtlR());
			addAll(ope.up2(), down2(), createMap_SlsAct_Upd01_IoR_Chk01_IoR());
			
			ope.up3().indiv_prnt_flg(true);
			ope.exec();

			SlsAct_Upd01_RsltR downRslt = ope.down0().get(0);
			// 伝票が分割される場合もありえる。
			// その場合は下り電文の最初の要素の売上実績ＮＯを返却する
			down0().sls_act_no(downRslt.sls_act_no());
			down0().sls_act_rev(downRslt.sls_act_rev());
			down0().dlv_slip_no(downRslt.dlv_slip_no());
			down0().iv_rev(downRslt.iv_rev());
			String[] dtlDestCols = new String[]{Chk01_DtlR.$sls_act_d_no, Chk01_DtlR.$dlv_slip_d_no};
			String[] dtlSrcCols = new String[]{SlsAct_Upd01_Rslt_DtlR.$sls_act_d_no, SlsAct_Upd01_Rslt_DtlR.$dlv_slip_d_no};
			copyByPegNo(down1(), ope.down1(), Chk01_DtlR.$dtl_peg_no, dtlDestCols, SlsAct_Upd01_Rslt_DtlR.$dtl_peg_no, dtlSrcCols);
		}

		/**
		 * 	見積情報更新処理
		 */
		protected void updQtn() {

			if (!isNull(down0().qtn_no()) && isNull(down0().slo_no())) {

				// 見積ヘッダは空更新
				MST_QTN_R qtn = MST_QTN_R.create();
				qtn.qtn_no(down0().qtn_no());
				qtn.qtn_rev(down0().qtn_rev());
				dbTsUpdateKey("MSBBL1310_MST_QTN_U02", qtn,
						MCQueryApiBuilder.create(MST_QTN_R.create("T")).getBaseDbc());

				// 見積明細を更新
				for (Chk01_DtlR r : down1()) {
					MCNumber updSlsTrnstQty;
					// 見積時から明細単位の変更はない前提（画面制御でロック）
					if (r.isStatusCreate()) {
						updSlsTrnstQty = r.trd_unit_qty();
					}
					else {
						MCNumber befSlsTrnstQty = rvrsBaseUnitConv(r.old_base_unit_qty(),
								r.trd_unit_conv_base_qty(), r.trd_unit_conv_qty(),
								r.trd_unit_dec_place(), r.trd_unit_rnd_typ());

						updSlsTrnstQty = (r.isStatusDelete() ? MCNumber.ZERO : r
								.trd_unit_qty()).subtract(nvl(befSlsTrnstQty,
								MCNumber.ZERO));

					}

					r.setNumberNE(MST_QTN_D_R.$sls_trnst_qty, updSlsTrnstQty);
				}

				MST_QTN_D_R t = MST_QTN_D_R.create("T2");
				MCQueryApiBuilder qtn_bldr = MCQueryApiBuilder.create(t);
				qtn_bldr.setWhere(t.qtn_d_no.eq(bindEx("qtn_d_no")));
				qtn_bldr.setSetVL(t.sls_trnst_qty, t.sls_trnst_qty.add(bindEx("sls_trnst_qty")));
				dbUpdate("MSBBL1310_MST_QTN_D_U02", down1(), qtn_bldr);
			}
		}

		/**
		 * 	売上予定サービスの呼出
		 */
		protected void callSlsSchdSvUpd03() {

			// 打切ＦＬＧが解除されたリストを抽出
			MCList<Chk01_DtlR> callL = down1().createInstance();
			for (Chk01_DtlR r : down1()) {
				if (!isNull(r.sls_schd_no()) && r.old_abort_flg() && !r.abort_flg()) {
					callL.add(r);
				}
			}

			if (!callL.isEmpty()) {
				MSBBL_SlsSchdService.Sls_Schd_Upd03 ope = MSBBL_SlsSchdService
						.crtSls_Schd_Upd03();
				ope.up0();
			}
		}

		/**
		 * 	受払実績サービスの呼出
		 */
		protected void callIoActSvUpd01() {

			// 上り電文は不要（ワークに格納されたデータを登録するだけなので）
			MSBEL_IoActService.IoAct_Upd01 o = MSBEL_IoActService.crtIoAct_Upd01();	
			o.setLotChkFlg(up0().lot_chk_off_flg());	
			o.exec();
			
		}

		/**
		 * 	上り電文(Chk01_DtlR) -> 売上予定サービス.上り電文(Sls_Schd_Upd03_DtlR)
		 * @return
		 */
		protected Map_Sls_Schd_Upd03_DtlR_Chk01_DtlR<Sls_Schd_Upd03_DtlR, Chk01_DtlR> createMap_Sls_Schd_Upd03_DtlR_Chk01_DtlR() {
			return new Map_Sls_Schd_Upd03_DtlR_Chk01_DtlR<Sls_Schd_Upd03_DtlR, Chk01_DtlR>();
		}

		public class Map_Sls_Schd_Upd03_DtlR_Chk01_DtlR<D extends Sls_Schd_Upd03_DtlR, S extends Chk01_DtlR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Sls_Schd_Upd03_DtlR.$sls_schd_no,
						Chk01_DtlR.$sls_schd_no);
				addColumnPathMap(Sls_Schd_Upd03_DtlR.$abort_flg, Chk01_DtlR.$abort_flg);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				dest.base_unit_sls_qty(MCNumber.ZERO);
			}
		}
	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 売上実績情報を取り消しします。<br>
	 */
	public class Del01 extends MSBBL_SlsActReg_MC_A.Del01 {
		
		MCList<Chk02_HdrR> _upL  = MCList.create(Chk02_HdrR.class);
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			// 上り電文編集
			editUp();

			// チェックOpeの呼出
			callThisChk02();
			throwCanErr();

			// 与信サービスの呼出(受注紐付時)
			callCredSvUpd01();

			// 輸出実績サービスの呼出
			callExActSvUpd02();

			// 見積情報更新処理(見積紐付時)
			updQtn();

			// 売上実績サービスの呼出
			callSlsActSvUpd01();

			// 承認提供サービスの呼出(
			callAprvSvUpd03();

			// 受払実績サービスの呼出
			callIoActSvUpd01();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {

			//　紐付けＮＯの設定
			setPegNo(up0());
			for (Chk02_DtlR r :  up1()) {
				r.peg_no(up0().peg_no());
			}
			setPegNo(Chk02_DtlR.$dtl_peg_no, up1());

			// 上り電文の分割
			splitUp();
		}
		/**
		 * 	上り電文の分割
		 */
		protected void splitUp() {
			/** インボイス対象の売上計上時に売上伝票分割が発生した場合は
				インボイスと売上実績が1:Nになる。取消時はインボイスNO単位で検索して取消するので
				売上実績がNの場合は売上実績サービスに渡すup0を分割する **/
			
			/** 分割発生時は取消前検索で売上実績NOの表示をNULLとしているため
				分割の有無は売上実績NOで判断できる **/
			if (isNull(up0().iv_no()) || !isNull(up0().sls_act_no())) {
				_upL.add(up0());
				return;
			}
			
			// 対象となる売上実績の取得
			MST_SLS_ACT_R t = MST_SLS_ACT_R.create("T");
			MCList<MST_SLS_ACT_R> slsActL = MCList.create(MST_SLS_ACT_R.class);
			MCQueryApiBuilder slsActL_bldr = MCQueryApiBuilder.create(t);
			
			slsActL_bldr.setSelect(t.sls_act_no);
			slsActL_bldr.addSelect(t.sls_act_rev, t.sls_act_seq);
			slsActL_bldr.setWhere(t.iv_no.eq(bind("1")), up0().iv_no());
			slsActL_bldr.addWhereWithAnd(t.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			int cnt = dbSelect("MSBBL1310_MST_SLS_ACT_S05", slsActL, slsActL_bldr);
			
			for (int i = 0; i < cnt; i++) {
				Chk02_HdrR row = up0().clone();
				row.sls_act_no(slsActL.get(i).sls_act_no());
				row.sls_act_rev(slsActL.get(i).sls_act_rev());
				row.sls_act_seq(slsActL.get(i).sls_act_seq());
				row.peg_no(i);
				_upL.add(row);
			}
			
			// 検索時に明細に保持しておいた更新カウンタを分割後のヘッダにセットする
			MCIndexKey idxKey = up1().createIndex(Chk02_HdrR.$sls_act_no);
			for (Chk02_HdrR r : _upL) {
				Chk02_DtlR dtlR = up1().getFirst(idxKey, r.sls_act_no());
				if (!isNull(dtlR)) {
					r.upd_cntr(dtlR.upd_cntr());
					r.qtn_upd_cntr(dtlR.qtn_upd_cntr());
					r.slo_upd_cntr(dtlR.slo_upd_cntr());
				}
			}
			
			// ヘッダで分割発生した場合の明細peg_no振り直し
			for (Chk02_DtlR r : up1()) {
				r.peg_no(_upL.getFirst(Chk02_HdrR.$sls_act_no, r.sls_act_no()).peg_no());
			}
		}
		/**
		 * 	Chk02オペレーションの呼出
		 */
		protected void callThisChk02() {
			for (Chk02_HdrR upR : _upL) {
				copyall(chk02.up0(), upR);
				chk02.up1().setAll(up1().subList(Chk01_DtlR.$peg_no, upR.peg_no()));
				chk02.call();
				
				upR.setValuesByName(chk02_down0);
			}
			up1().setAll(chk02.down1());
		}

		protected void setDown() {

		}

		/**
		 * 	与信サービス.与信更新処理の呼出
		 */
		protected void callCredSvUpd01() {
		
			MSBGL_CredService.Cred_Upd01 ope = MSBGL_CredService.crtCred_Upd01();
			
			Cred_Upd01_CndR up0R = Cred_Upd01_CndR.create();;
			MCNumber credAmtSum = MCNumber.ZERO;
			MCNumber credAmt = null;
			
			up0R.cst_cd(_upL.get(0).cst_cd());
			up0R.cur_cd(_upL.get(0).trd_cur_cd());
			up0R.trd_ptn_typ(_upL.get(0).trd_ptn_typ());
			up0R.cred_upd_typ(MSC_CRED_UPD_TYP.UPD.value());
			
			MCList<Chk01_DtlR> chk01L = MCList.create(Chk01_DtlR.class);
			for (Chk02_DtlR upR : up1()) {
				Chk01_DtlR chk01R = Chk01_DtlR.create();
				chk01R.slo_d_no(upR.slo_d_no());
				chk01L.add(chk01R);
			}
			getSloAndSlsSchd(chk01L);
			
			String befSloDNo = null;
			boolean ajstFlg = false;
			for (Chk02_DtlR dtlR : up1()) {
				if (MSC_IV_SRC_TYP.isSLS(up0().iv_src_typ())) {
					break;
				}
				if (!isNull(dtlR.sls_schd_no())) {
					
					if (isNull(befSloDNo)) {
						befSloDNo = dtlR.slo_d_no();
						ajstFlg = true;
					}
					else {
						if (isSame(befSloDNo, dtlR.slo_d_no())) {
							ajstFlg = false;
						}
						else {
							befSloDNo = dtlR.slo_d_no();
							ajstFlg = true;
						}
					}
					credAmt = calcCredAmt(dtlR.sls_schd_no(), MCNumber.ZERO, dtlR.base_unit_qty(),
							dtlR.slo_d_no(), _upL.get(0).sls_basis_typ(), true, ajstFlg, false);
					
					credAmtSum = credAmtSum.add(dtlR.dscnt_itm_flg() ? credAmt.negate() : credAmt);
					
				}
			}
			
			up0R.amt(credAmtSum);
			
			ope.up0().add(up0R);
			
			if (!ope.up0().isEmpty()) {
				ope.exec();
			}
		}
		/**
		 * 輸出実績サービス（インボイス更新）の呼出
		 * 
		 */
		protected void callExActSvUpd02() {

			if (MSC_IV_SRC_TYP.isSLS(up0().iv_src_typ())) {
				return;
			}
			// 預りは預り以外と混ぜて1つのインボイスにできないが、
			// インボイス登録時に非在庫品が追加されている可能性もあるため、
			// 「1明細でも預りがあれば預り取引」と判定する
			for (Chk02_DtlR r : up1()) {
				if (r.sls_cststk_flg()) {
					return;
				}
			}
			
			MSBEL_ExActService.ExAct_Upd02 ope = MSBEL_ExActService.crtExAct_Upd02();
			ExAct_Upd02_DtlR oUp0;
			
			if (up0().cst_iv_flg()
					&& !isNullOrNullVal(up0().iv_no())
					&& !MAC_VIA_DLV_TYP.isVIA(getViaDlvTyp(up0().iv_no()))) {
				oUp0 = ExAct_Upd02_DtlR.create();
				oUp0.peg_no(up0().peg_no());
				oUp0.iv_no(up0().iv_no());
				oUp0.cmpl_flg(false);
				ope.up0().add(oUp0);
			}
			if (!ope.up0().isEmpty()) {
				ope.exec();
			}
		}
		/**
		 * 	見積情報更新処理
		 */
		protected void updQtn() {

			if (!isNull(up0().qtn_no()) && isNull(up0().slo_no())) {

				// 受注ヘッダは空更新
				MST_QTN_R qtn = MST_QTN_R.create();
				qtn.qtn_no(up0().qtn_no());
				qtn.qtn_rev(up0().qtn_rev());
				dbTsUpdateKey("MSBBL1310_MST_QTN_U03", qtn,
						MCQueryApiBuilder.create(MST_QTN_R.create("T")).getBaseDbc());

				// 受注明細を更新
				MST_QTN_D_R t = MST_QTN_D_R.create("T2");
				MCQueryApiBuilder qtn_bldr = MCQueryApiBuilder.create(t);
				qtn_bldr.setWhere(t.qtn_d_no.eq(bindEx("qtn_d_no")));
				qtn_bldr.setSetVL(t.sls_trnst_qty, t.sls_trnst_qty.subtract(bindEx("trd_unit_qty")));
				dbUpdate("MSBBL1310_MST_QTN_D_U03", up1(), qtn_bldr);
			}
		}

		/**
		 * 	売上実績サービスの呼出
		 */
		protected void callSlsActSvUpd01() {
			for (Chk02_HdrR upR : _upL) {
				editChk02HdrR(upR, up1());
			}
			MSBBL_SlsActService.SlsAct_Upd01 ope = MSBBL_SlsActService.crtSlsAct_Upd01();
			addAll(ope.up0(), _upL, createMap_SlsAct_Upd01_HdrR_Chk02_HdrR());
			addAll(ope.up1(), up1(), createMap_SlsAct_Upd01_DtlR_Chk02_DtlR());
			addAll(ope.up2(), chk02_down2, createMap_SlsAct_Upd01_IoR_Chk02_IoR());
			ope.up3().indiv_prnt_flg(true);
			if (up0().getBooleanNE("del_all_sls_d_flg")) {
				ope.up2().setStatus(DELETE);
			}
			ope.exec();
		}

		/**
		 * 	承認提供サービスの呼出
		 * <p>
		 * 	受注・見積紐付、承認対象で出荷基準の売上または預り売上、かつ、全明細に対し全数未売上・打切なしとなる場合<br>
		 * 	承認提供サービスを実行し、承認情報の承認次処理済ＦＬＧを更新する。
		 * </p>
		 */
		protected void callAprvSvUpd03() {

			if (up0().err_flg()) {
				return;
			}
			
			// 見積→売上の場合
			if (!isNull(up0().qtn_no()) && isNull(up0().slo_no()) && up0().qtn_aprv_flg()) {
				if (!isQtnNextOper(up0().qtn_no(), up0().qtn_rev())) {
					MBBAL_AprvService.Aprv_Upd03 ope = MBBAL_AprvService.crtAprv_Upd03();
					Aprv_Chk02_Rslt1R up = ope.up0().createRow();
					up.aprv_no(up0().qtn_aprv_no());
					up.setAttributes(up0());
					ope.up0().add(up);
					ope.exec();
				}
			}
			// (見積)→受注→売上の場合
			// 受注→出荷→売上は含まないため、売上計上区分が出荷基準の場合のみ処理する
			else if (!isNull(up0().slo_no())
					&& (MAC_SLS_BASIS_TYP.isSHIP_BASIS(up0().sls_basis_typ()) || !isNull(up1().getFirst(Chk02_DtlR.$sls_cststk_flg, true)))
					&& up0().slo_aprv_flg()) {
				if (!isSloNextOper(up0().slo_no())) {
					MBBAL_AprvService.Aprv_Upd03 ope = MBBAL_AprvService.crtAprv_Upd03();
					Aprv_Chk02_Rslt1R up = ope.up0().createRow();
					up.aprv_no(up0().slo_aprv_no());
					up.setAttributes(up0());
					ope.up0().add(up);
					ope.exec();
				}
			}
		}

		/**
		 * 	受払実績サービスの呼出
		 */
		protected void callIoActSvUpd01() {

			// 上り電文は不要（ワークに格納されたデータを登録するだけなので）
			MSBEL_IoActService.crtIoAct_Upd01().exec();
		}

		/**
		 * 上り電文(Chk02_HdrR) -> 売上実績サービス 上り電文(SlsAct_Upd01_HdrR) 
		 * @return
		 */
		protected Map_SlsAct_Upd01_HdrR_Chk02_HdrR<SlsAct_Upd01_HdrR, Chk02_HdrR> createMap_SlsAct_Upd01_HdrR_Chk02_HdrR() {
			return new Map_SlsAct_Upd01_HdrR_Chk02_HdrR<SlsAct_Upd01_HdrR, Chk02_HdrR>();
		}

		public class Map_SlsAct_Upd01_HdrR_Chk02_HdrR<D extends SlsAct_Upd01_HdrR, S extends Chk02_HdrR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsAct_Upd01_HdrR.$hdr_peg_no, Chk02_HdrR.$peg_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_act_no, Chk02_HdrR.$sls_act_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_act_seq, Chk02_HdrR.$sls_act_seq);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_act_rev, Chk02_HdrR.$sls_act_rev);
				addColumnPathMap(SlsAct_Upd01_HdrR.$can_ac_dt, Chk02_HdrR.$can_ac_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_ptn_typ, Chk02_HdrR.$trd_ptn_typ);
				addColumnPathMap(SlsAct_Upd01_HdrR.$cst_iv_flg, Chk02_HdrR.$cst_iv_flg);
				addColumnPathMap(SlsAct_Upd01_HdrR.$iv_src_typ, Chk02_HdrR.$iv_src_typ);
				addColumnPathMap(SlsAct_Upd01_HdrR.$iv_mng_no, Chk02_HdrR.$iv_mng_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$iv_no, Chk02_HdrR.$iv_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$iv_dt, Chk02_HdrR.$iv_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$iv_upd_cntr, Chk02_HdrR.$iv_upd_cntr);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				dest.ship_act_service_exec_flg(src.getBoolean("ship_act_service_exec_flg"));
				dest.del_all_sls_d_flg(src.getBooleanNE("del_all_sls_d_flg"));
				if (MSC_IV_SRC_TYP.isSLS(dest.iv_src_typ())) {
					dest.iv_service_exec_flg(true);
				}
				if (dest.cst_iv_flg()) {
					dest.dlv_slip_prnt_flg(false);
				}
				else {
					dest.dlv_slip_prnt_flg(src.dlv_slip_out_flg());
				}
				dest.amt_calc_flg(false);
			}
		}

		/**
		 * Chk02サービス下り電文(Chk02_DtlR) -> 売上実績サービス 上り電文(SlsAct_Upd01_DtlR) 
		 * @return
		 */
		protected Map_SlsAct_Upd01_DtlR_Chk02_DtlR<SlsAct_Upd01_DtlR, Chk02_DtlR> createMap_SlsAct_Upd01_DtlR_Chk02_DtlR() {
			return new Map_SlsAct_Upd01_DtlR_Chk02_DtlR<SlsAct_Upd01_DtlR, Chk02_DtlR>();
		}

		public class Map_SlsAct_Upd01_DtlR_Chk02_DtlR<D extends SlsAct_Upd01_DtlR, S extends Chk02_DtlR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsAct_Upd01_DtlR.$hdr_peg_no, Chk02_DtlR.$peg_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dtl_peg_no, Chk02_DtlR.$dtl_peg_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_act_d_no,
						Chk02_DtlR.$sls_act_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_act_d_seq,
						Chk02_DtlR.$sls_act_d_seq);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_schd_no, Chk02_DtlR.$sls_schd_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ship_schd_no, Chk02_DtlR.$ship_schd_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$iv_d_no, Chk02_DtlR.$iv_d_no);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				dest.dlv_cd(src.getStringNE("dlv_cd"));
				dest.dlv_cntry_cd(src.getStringNE("dlv_cntry_cd"));
			}
		}

		/**
		 * Chk02サービス下り電文(Chk02_IoR) -> 売上実績サービス 上り電文(SlsAct_Upd01_IoR) 
		 * @return
		 */
		protected Map_SlsAct_Upd01_IoR_Chk02_IoR<SlsAct_Upd01_IoR, Chk02_IoR> createMap_SlsAct_Upd01_IoR_Chk02_IoR() {
			return new Map_SlsAct_Upd01_IoR_Chk02_IoR<SlsAct_Upd01_IoR, Chk02_IoR>();
		}

		public class Map_SlsAct_Upd01_IoR_Chk02_IoR<D extends SlsAct_Upd01_IoR, S extends Chk02_IoR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsAct_Upd01_IoR.$hdr_peg_no, Chk02_IoR.$peg_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$dtl_peg_no, Chk02_IoR.$dtl_peg_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$io_peg_no, Chk02_IoR.$io_peg_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sls_act_io_no,
						Chk02_IoR.$sls_act_io_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sls_act_io_seq,
						Chk02_IoR.$sls_act_io_seq);
			}
		}
	}

	/**
	 * 	与信サービスの呼出
	 * <p>
	 * 	与信サービス.与信枠残高取得(MSBGL5080.Cred_Srch01)にて与信枠残高を取得し<br>
	 * 	取得結果を引数のコンテナに格納する
	 * </p>
	 * @param hdr Srch01_HdrR
	 */
	protected void callCredSvSrch01(Srch01_HdrR hdr) {

		MSBGL_CredService.Cred_Srch01 ope = MSBGL_CredService.crtCred_Srch01();
		ope.up0().cst_cd(hdr.cst_cd());
		ope.up0().cur_cd(hdr.trd_cur_cd());
		ope.up0().setAttributes(hdr);
		ope.exec();
		hdr.cred_bal(ope.down0().cred_bal());
	}

	/**
	 * 	取引単位数を基準単位数に換算する
	 * @param r	Srch01_DtlR
	 * @return
	 */
	protected MCNumber getBaseUnitQty(Srch01_DtlR r) {

		return convToBaseUnit(r.trd_unit_qty(), r.trd_unit_conv_base_qty(),
				r.trd_unit_conv_qty(), r.base_unit_dec_place(), r.base_unit_rnd_typ());
	}

	/**
	 * 	取引単位数を基準単位数に換算する
	 * @param r	Chk01_DtlR
	 * @return
	 */
	protected MCNumber getBaseUnitQty(Chk01_DtlR r) {

		return convToBaseUnit(r.trd_unit_qty(), r.trd_unit_conv_base_qty(),
				r.trd_unit_conv_qty(), r.base_unit_dec_place(), r.base_unit_rnd_typ());
	}

	/**
	 * 	取引単位数を基準単位数に換算する
	 * @param r	Chk01_IoR
	 * @return
	 */
	protected MCNumber getBaseUnitQty(Chk01_IoR r) {

		return convToBaseUnit(r.trd_unit_qty(), r.trd_unit_conv_base_qty(),
				r.trd_unit_conv_qty(), r.base_unit_dec_place(), r.base_unit_rnd_typ());
	}

	protected MCNumber calcAmt(Chk01_HdrR hdr, Chk01_DtlR dtl) {

		return getAmt(dtl.trd_cur_upri(), dtl.trd_unit_qty(),
				hdr.trd_cur_amt_dec_place(), hdr.sls_amt_rnd_typ(),
				nvl(dtl.trd_cur_dscnt_amt(), MCNumber.ZERO));
	}

	protected MCNumber calcTaxAmt(Chk01_HdrR hdr, Chk01_DtlR dtl) {

		return getTaxAmt(dtl.trd_cur_amt(), dtl.tax_rate(), hdr.trd_cur_amt_dec_place(),
				hdr.sls_amt_rnd_typ(), nvl(dtl.trd_cur_dscnt_amt(), MCNumber.ZERO));
	}

	protected MCNumber getCostAmt(Chk01_DtlR dtlR) {
		MCNumber costAmt = null;
		if (!isNullOr(dtlR.cost_upri(), dtlR.base_unit_qty())) {
			costAmt = MSUCL_SlsUtil.getCostAmt(dtlR.cost_upri(), dtlR.base_unit_qty(), getBaseCur().amt_dec_place());
		}
		return costAmt;
	}

// 1.5次対応のためコメントアウト
//	/**
//	 * 	取引通貨検収金額、基準通貨検収金額、納税通貨検収金額の設定 (Srch01、Srch04 共通)
//	 * @param r
//	 */
//	protected void setAccptAmt(Srch01_HdrR hdr, MCList<Srch01_DtlR> dtlL) {
//
//		for (Srch01_DtlR r : dtlL) {
//			// 検収単位数量から取引単位数量へ換算
//			MCNumber trd_unit_accpt_qty = unitConv(r.accpt_unit_qty(),
//					r.accpt_unit_conv_base_qty(), r.accpt_unit_conv_qty(),
//					r.base_unit_dec_place(), r.base_unit_rnd_typ(),
//					r.trd_unit_conv_base_qty(), r.trd_unit_conv_qty(),
//					r.trd_unit_dec_place(), r.trd_unit_rnd_typ());
//
//			MCNumber trdCurAccptAmt = getAmt(r.trd_cur_upri(), trd_unit_accpt_qty,
//					hdr.trd_cur_amt_dec_place(), hdr.sls_amt_rnd_typ());
//
//			r.trd_cur_accpt_amt(trdCurAccptAmt);
//
//			// 取引通貨金額から基準通貨金額へ換算
//			r.base_cur_accpt_amt(convToBaseCur(trdCurAccptAmt, hdr.xrate(),
//					hdr.base_cur_amt_dec_place(), hdr.xrate_rnd_typ()));
//			// 基準通貨金額から納税通貨金額へ換算
//			r.ptax_cur_accpt_amt(convCur(trdCurAccptAmt, hdr.ptax_xrate(),
//					hdr.ptax_cur_amt_dec_place(), hdr.xrate_rnd_typ()));
//		}
//	}

// 1.5次対応のためコメントアウト
//	/**
//	 * 検収状況区分の設定(Srch01、Srch04 共通)
//	 * <p>
//	 * 	SQL取得時に受信対象の得意先でない場合は、「対象外」。受信対象の場合はnullで取得している。<br>
//	 * 	受信対象の場合、売上実績の取引数量と検収IFの数量を比較してステータスが決定するが<br>
//	 * 	取引単位が異なるため、基準単位に換算した上で比較したいが、取引単位を基準単位に換算するユーティリティがPL/SQLにないので<br>
//	 * 	Javaにて換算した上、ステータスを設定する
//	 * </p>
//	 * @param r
//	 */
//	protected void setAccptStsTyp(MCList<Srch01_DtlR> dtlL) {
//
//		for (Srch01_DtlR r : dtlL) {
//			if (!MSC_ACCPT_STS_TYP.isOTR(r.accpt_sts_typ())) {
//				if (isNull(r.accpt_unit_qty()) || r.accpt_unit_qty().isZero()) {
//					r.accpt_sts_typ(MSC_ACCPT_STS_TYP.OTR.value());
//					return;
//				}
//
//				// 検収数量を基準単位数量に換算して比較
//				MCNumber accpt_base_unit_qty = convToBaseUnit(r.accpt_unit_qty(),
//						r.accpt_unit_conv_base_qty(), r.accpt_unit_conv_qty(),
//						r.accpt_unit_dec_place(), r.accpt_unit_rnd_typ());
//				if (isSame(r.base_unit_qty(), accpt_base_unit_qty)) {
//
//					r.accpt_sts_typ(MSC_ACCPT_STS_TYP.ACCPT.value());
//				}
//				else {
//					r.accpt_sts_typ(MSC_ACCPT_STS_TYP.NOT_MTCH.value());
//				}
//			}
//		}
//	}

	/**
	 * 	分割された自身以外の売上実績明細の件数を取得
	 * 	<p>
	 * 	引数の売上実績と売上予定ＮＯが一致、売上実績明細ＮＯ、売上実績明細連番が不一致の売上実績明細の件数をカウントする
	 * 	</p>
	 * @param dtl
	 * @return
	 */
	protected int cntOthrSlsActD(String slsActDNo, MCNumber slsActDSeq) {

		MST_SLS_ACT_D_R t = MST_SLS_ACT_D_R.create("T");
		MST_SLS_ACT_R t2 = MST_SLS_ACT_R.create("T2");

		MCList<MST_SLS_ACT_D_R> slsActDL = MCList.create(MST_SLS_ACT_D_R.class);
		MCQueryApiBuilder slsActDL_bldr = MCQueryApiBuilder.create(t);
		slsActDL_bldr.setSelect(t.sls_act_d_no);
		slsActDL_bldr.addInnerJoin(t2, bracket(t.sls_act_no.eq(t2.sls_act_no)
				.and(t.sls_act_seq.eq(t2.sls_act_seq))));
		slsActDL_bldr.setWhere(t2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
		slsActDL_bldr.addWhereWithAnd(t.sls_act_d_no.neq(bind("1")), slsActDNo);
		slsActDL_bldr.addWhereWithAnd(t.sls_act_d_seq.neq(bind("1")), slsActDSeq);
		return dbSelect("MSBBL1310_MST_SLS_ACT_D_S03", slsActDL, slsActDL_bldr);
	}

	/**
	 * 	紐付けＮＯの設定
	 */
	protected void setPegNoSub(Chk01_HdrR hdr, MCList<Chk01_DtlR> dtlL,
			MCList<Chk01_IoR> ioL) {
		setPegNo(hdr);
		int i = 0;

		MCIndexKey idxKey = ioL.createIndex(Chk01_IoR.$dtl_row_id);
		for (Chk01_DtlR r : dtlL) {
			r.peg_no(hdr.peg_no());
			r.dtl_peg_no(i++);
			MCList<Chk01_IoR> chdIoL = ioL.subList(idxKey, new Comparable[] {
				r.dtl_row_id()
			});
			for (Chk01_IoR r2 : chdIoL) {
				r2.peg_no(hdr.peg_no());
				r2.dtl_peg_no(r.dtl_peg_no());
			}
		}

		// 受払紐付けＮＯも通番とする
		setPegNo(Chk01_IoR.$io_peg_no, ioL);
	}
	
	/**
	 * 与信戻し金額を計算する。
	 * @param slsSchdNo 売上予定ＮＯ
	 * @param baseUnitQty 基準単位数量
	 * @param oldBaseUnitQty 基準単位数量（変更前）
	 * @param slo_d_no 受注明細ＮＯ
	 * @param sls_basis_typ 売上計上区分
	 * @param delFlg 取消からの呼出の場合true
	 * @param ajstFlg 取消時に処理対象の受注明細ＮＯが変わっていた場合true
	 * @param newAbortFlg 更新時に画面で指定された打切フラグ。新規・取消時は常にfalse
	 * @return 与信戻し金額
	 */
	protected MCNumber calcCredAmt(String slsSchdNo, MCNumber baseUnitQty, MCNumber oldBaseUnitQty,
			String slo_d_no, String sls_basis_typ, boolean delFlg, boolean ajstFlg, boolean newAbortFlg) {

		MCNumber credAmt = MCNumber.ZERO;
				
		MSUCL_ConvQtyAmtUtil.ConvQtyAmtUtil_Calc02 ope = MSUCL_ConvQtyAmtUtil.crtConvQtyAmtUtil_Calc02();
		
		ConvQtyAmtUtil_Calc01_HdrR up0R = ConvQtyAmtUtil_Calc01_HdrR.create();
		
		getCredSrcBySlsSchd(up0R, slsSchdNo);
		
		boolean calcContFlg = false;
		// 打切オフの場合
		if (!newAbortFlg) {
			if (!isNull(_schdQtyL)) {
				MST_SLS_SCHD_R befSlsSchdR = _schdQtyL.getFirst(_idxSlsSchd, slo_d_no);
				// 更新前に打切数量がある場合は打切解除の動作
				if (!isNull(befSlsSchdR) && befSlsSchdR.base_unit_abort_qty().gt(0)) {
					calcContFlg = true;
				}
			}
		}
		else {
			// 打切のまま数量増加の場合
			if (baseUnitQty.gt(oldBaseUnitQty)) {
				calcContFlg = true;
			}
		}
		MCNumber credRetQty = calcCredRetQty(up0R.getNumber("sls_schd_qty"), up0R.getNumber("base_unit_cmpl_qty"), baseUnitQty, oldBaseUnitQty, calcContFlg);
		
		if ((MAC_SLS_BASIS_TYP.isSHIP_BASIS(sls_basis_typ) || isNull(sls_basis_typ)) 
				&& !isNull(slo_d_no) && !isNull(_sloDL) && !isNull(_schdQtyL)) {
			MST_SLO_D_R sloDR = _sloDL.getFirst(_idxSloD, slo_d_no);
			if (!isNull(sloDR)) {
				MST_SLS_SCHD_R slsSchdR = _schdQtyL.getFirst(_idxSlsSchd, slo_d_no);
				MCNumber sloRemQty = sloDR.base_unit_qty().subtract(slsSchdR.base_unit_abort_qty()); // 受注数量（打切除く）
				MCNumber slsAllQty = slsSchdR.base_unit_sls_qty(); // 総売上数量
				
				if (!delFlg) {
					if (!isSame(oldBaseUnitQty, baseUnitQty)) {
						if (slsAllQty.gte(sloRemQty)) {
							if (!isSame(slsAllQty, sloRemQty)) {
								if (slsAllQty.subtract(oldBaseUnitQty).add(baseUnitQty).lt(sloRemQty)) {
									credRetQty = credRetQty.subtract(slsAllQty.subtract(sloRemQty));
								}
								else {
									credRetQty = MCNumber.ZERO;
								}
							}
						}
						else {
							if (slsAllQty.subtract(oldBaseUnitQty).add(baseUnitQty).gte(sloRemQty)) {
								credRetQty = credRetQty.subtract((sloRemQty.subtract(slsAllQty)));
							}
							else if (slsAllQty.lt(sloRemQty) && oldBaseUnitQty.lt(sloRemQty) && baseUnitQty.lt(sloRemQty)) {
								if (oldBaseUnitQty.lt(baseUnitQty)) {
									credRetQty = credRetQty.add((oldBaseUnitQty.subtract(baseUnitQty)));
								}
							}
						}
					}
				}
				else {
					if (ajstFlg && slsAllQty.gt(sloRemQty)) {
						credRetQty = credRetQty.subtract(slsAllQty.subtract(sloRemQty));
					}
				}
			}
		}
		if (!credRetQty.isZero()) {
				
			setPegNo(up0R);
			
			ConvQtyAmtUtil_Calc01_Dtl1R up1R = ConvQtyAmtUtil_Calc01_Dtl1R.create();
			
			up1R.hdr_peg_no(up0R.peg_no());
			setPegNo(up1R);
			
			up1R.trd_unit_qty(credRetQty);
			up1R.trd_unit_cd(up0R.getString("base_unit_cd"));
			up1R.trd_unit_conv_base_qty(1);
			up1R.trd_unit_conv_qty(1);
			
			ope.up0().add(up0R);
			ope.up1().add(up1R);
			
			ope.exec();
			
			if (!ope.down0().isEmpty()) {
				credAmt = ope.down0().get(0).trd_cur_inc_tax_amt();
			}
		}
		
		return credAmt;
	}
	
	/**
	 * 与信金額戻し数量を算出する。
	 * @param slsSchdQty 売上予定数量（基準単位）
	 * @param cmplQty 完了数量（基準単位売上数量＋基準単位打切数量）
	 * @param baseUnitQty 基準単位数量
	 * @param oldBaseUnitQty 基準単位数量（変更前）
	 * @param calcContFlg 算出制御用フラグ（打切考慮）
	 * @return 与信金額戻し数量
	 */
	protected MCNumber calcCredRetQty(MCNumber slsSchdQty, MCNumber cmplQty, MCNumber baseUnitQty, MCNumber oldBaseUnitQty, boolean calcContFlg) {
		
		MCNumber oldSlsRemQty = slsSchdQty.subtract(cmplQty);
		oldSlsRemQty = oldSlsRemQty.isNegative() ? MCNumber.ZERO : oldSlsRemQty;
		
		MCNumber slsRemQty = slsSchdQty.subtract(cmplQty.add(baseUnitQty.subtract(oldBaseUnitQty)));
		if (!calcContFlg) {
			slsRemQty = slsRemQty.isNegative() ? MCNumber.ZERO : slsRemQty;
		}
		
		return slsRemQty.subtract(oldSlsRemQty);
	}

	/**
	 * 売上予定ＮＯで売上予定の元情報(インボイス明細⇒納品書明細⇒受注明細の優先順)を取得する。
	 * 
	 * @param calc01HdrR 単位・金額の計算ヘッダ（売上予定元情報を格納）
	 * @param slsSchdNo 売上予定ＮＯ
	 * @param trdUnitCd 取引単位ＣＤ
	 */
	protected void getCredSrcBySlsSchd(ConvQtyAmtUtil_Calc01_HdrR calc01HdrR, String slsSchdNo) {

		MST_SLS_SCHD_R bindR = MST_SLS_SCHD_R.create();
		bindR.sls_schd_no(slsSchdNo);
		
		calc01HdrR.addNumberColumn("sls_schd_qty");
		calc01HdrR.addNumberColumn("base_unit_cmpl_qty");
		calc01HdrR.addStringColumn("base_unit_cd");
		
		executeQuery(calc01HdrR, MSBBL1310_MST_SLS_SCHD_S01(), bindR);
		calc01HdrR.trd_cur_inc_tax_amt(sum(calc01HdrR.trd_cur_amt(), calc01HdrR.trd_cur_tax_amt()));
		calc01HdrR.schd_base_unit_qty(convToBaseUnit(
				calc01HdrR.trd_unit_qty(),
				calc01HdrR.trd_unit_conv_base_qty(),
				calc01HdrR.trd_unit_conv_qty(),
				calc01HdrR.base_unit_dec_place(),
				calc01HdrR.base_unit_rnd_typ()));
	}
	/**
	 * 対象インボイスの配送先経由区分取得
	 * 
	 * @param ivNo
	 * @return
	 */
	protected String getViaDlvTyp(String ivNo) {
		MST_IV_R ivR = MST_IV_R.create();
		MST_IV_R t = MST_IV_R.create("T");
		MCQueryApiBuilder ivR_bldr = MCQueryApiBuilder.create(t);
		ivR_bldr.setSelect(t.via_dlv_typ);
		ivR_bldr.setWhere(t.iv_no.eq(bind("1")), ivNo);
		dbSelect("MSBBL1310_MST_IV_S02", ivR, ivR_bldr);
		return ivR.via_dlv_typ();
	}
	/**
	 * 	上り電文(Chk01_HdrR) -> 売上実績サービス.上り電文(SlsAct_Upd01_HdrR) (新規・更新時共通)
	 * @return
	 */
	protected Map_SlsAct_Upd01_HdrR_Chk01_HdrR<SlsAct_Upd01_HdrR, Chk01_HdrR> createMap_SlsAct_Upd01_HdrR_Chk01_HdrR() {
		return new Map_SlsAct_Upd01_HdrR_Chk01_HdrR<SlsAct_Upd01_HdrR, Chk01_HdrR>();
	}

	public class Map_SlsAct_Upd01_HdrR_Chk01_HdrR<D extends SlsAct_Upd01_HdrR, S extends Chk01_HdrR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(SlsAct_Upd01_HdrR.$hdr_peg_no, Chk01_HdrR.$peg_no);
			addColumnPathMap(SlsAct_Upd01_HdrR.$sls_act_no, Chk01_HdrR.$sls_act_no);
			addColumnPathMap(SlsAct_Upd01_HdrR.$sls_act_seq, Chk01_HdrR.$sls_act_seq);
			addColumnPathMap(SlsAct_Upd01_HdrR.$sls_act_rev, Chk01_HdrR.$sls_act_rev);
			addColumnPathMap(SlsAct_Upd01_HdrR.$trd_cd, Chk01_HdrR.$trd_cd);
			addColumnPathMap(SlsAct_Upd01_HdrR.$trd_ptn_typ, Chk01_HdrR.$trd_ptn_typ);
			addColumnPathMap(SlsAct_Upd01_HdrR.$ac_dt, Chk01_HdrR.$ac_dt);
			addColumnPathMap(SlsAct_Upd01_HdrR.$can_ac_dt, Chk01_HdrR.$can_ac_dt);
			addColumnPathMap(SlsAct_Upd01_HdrR.$sls_usr_cd, Chk01_HdrR.$sls_usr_cd);
			addColumnPathMap(SlsAct_Upd01_HdrR.$sls_dpt_cd, Chk01_HdrR.$sls_dpt_cd);
			addColumnPathMap(SlsAct_Upd01_HdrR.$wg_cd, Chk01_HdrR.$wg_cd);
			addColumnPathMap(SlsAct_Upd01_HdrR.$sls_dt, Chk01_HdrR.$sls_dt);
			addColumnPathMap(SlsAct_Upd01_HdrR.$ship_tm, Chk01_HdrR.$ship_tm);
			addColumnPathMap(SlsAct_Upd01_HdrR.$dlv_tm, Chk01_HdrR.$dlv_tm);
			addColumnPathMap(SlsAct_Upd01_HdrR.$trnspt_cd, Chk01_HdrR.$trnspt_cd);
			addColumnPathMap(SlsAct_Upd01_HdrR.$vssl_flght, Chk01_HdrR.$vssl_flght);
			addColumnPathMap(SlsAct_Upd01_HdrR.$load_port_cd, Chk01_HdrR.$load_port_cd);
			addColumnPathMap(SlsAct_Upd01_HdrR.$etd_dt, Chk01_HdrR.$etd_dt);
			addColumnPathMap(SlsAct_Upd01_HdrR.$dschrg_port_cd, Chk01_HdrR.$dschrg_port_cd);
			addColumnPathMap(SlsAct_Upd01_HdrR.$eta_dt, Chk01_HdrR.$eta_dt);
			addColumnPathMap(SlsAct_Upd01_HdrR.$via_port_cd, Chk01_HdrR.$via_port_cd);
			addColumnPathMap(SlsAct_Upd01_HdrR.$via_schd_dt, Chk01_HdrR.$via_schd_dt);
			addColumnPathMap(SlsAct_Upd01_HdrR.$iv_tterm_cd1, Chk01_HdrR.$iv_tterm_cd1);
			addColumnPathMap(SlsAct_Upd01_HdrR.$iv_tterm_rmrks1, Chk01_HdrR.$iv_tterm_rmrks1);
			addColumnPathMap(SlsAct_Upd01_HdrR.$iv_tterm_cd2, Chk01_HdrR.$iv_tterm_cd2);
			addColumnPathMap(SlsAct_Upd01_HdrR.$iv_tterm_rmrks2, Chk01_HdrR.$iv_tterm_rmrks2);
			addColumnPathMap(SlsAct_Upd01_HdrR.$iv_tterm_cd3, Chk01_HdrR.$iv_tterm_cd3);
			addColumnPathMap(SlsAct_Upd01_HdrR.$iv_tterm_rmrks3, Chk01_HdrR.$iv_tterm_rmrks3);
			addColumnPathMap(SlsAct_Upd01_HdrR.$cst_cd, Chk01_HdrR.$cst_cd);
			addColumnPathMap(SlsAct_Upd01_HdrR.$cst_iv_flg, Chk01_HdrR.$cst_iv_flg);
			addColumnPathMap(SlsAct_Upd01_HdrR.$iv_src_typ, Chk01_HdrR.$iv_src_typ);
			addColumnPathMap(SlsAct_Upd01_HdrR.$iv_mng_no, Chk01_HdrR.$iv_mng_no);
			addColumnPathMap(SlsAct_Upd01_HdrR.$iv_no, Chk01_HdrR.$iv_no);
			addColumnPathMap(SlsAct_Upd01_HdrR.$iv_dt, Chk01_HdrR.$iv_dt);
			addColumnPathMap(SlsAct_Upd01_HdrR.$num_flg, Chk01_HdrR.$num_flg);
			addColumnPathMap(SlsAct_Upd01_HdrR.$iv_immed_prnt_flg, Chk01_HdrR.$iv_immed_prnt_flg);
			addColumnPathMap(SlsAct_Upd01_HdrR.$pl_skip_flg, Chk01_HdrR.$pl_skip_flg);
			addColumnPathMap(SlsAct_Upd01_HdrR.$iv_rmrks, Chk01_HdrR.$iv_rmrks);
			addColumnPathMap(SlsAct_Upd01_HdrR.$case_mrk1, Chk01_HdrR.$case_mrk1);
			addColumnPathMap(SlsAct_Upd01_HdrR.$case_mrk2, Chk01_HdrR.$case_mrk2);
			addColumnPathMap(SlsAct_Upd01_HdrR.$case_mrk3, Chk01_HdrR.$case_mrk3);
			addColumnPathMap(SlsAct_Upd01_HdrR.$case_mrk4, Chk01_HdrR.$case_mrk4);
			addColumnPathMap(SlsAct_Upd01_HdrR.$case_mrk5, Chk01_HdrR.$case_mrk5);
			addColumnPathMap(SlsAct_Upd01_HdrR.$case_mrk6, Chk01_HdrR.$case_mrk6);
			addColumnPathMap(SlsAct_Upd01_HdrR.$iv_intr_rmrks, Chk01_HdrR.$iv_intr_rmrks);
			addColumnPathMap(SlsAct_Upd01_HdrR.$iv_sub_char1, Chk01_HdrR.$iv_sub_char1);
			addColumnPathMap(SlsAct_Upd01_HdrR.$iv_sub_char2, Chk01_HdrR.$iv_sub_char2);
			addColumnPathMap(SlsAct_Upd01_HdrR.$iv_sub_char3, Chk01_HdrR.$iv_sub_char3);
			addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_cd1, Chk01_HdrR.$tterm_cd1);
			addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_rmrks1, Chk01_HdrR.$tterm_rmrks1);
			addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_cd2, Chk01_HdrR.$tterm_cd2);
			addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_rmrks2, Chk01_HdrR.$tterm_rmrks2);
			addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_cd3, Chk01_HdrR.$tterm_cd3);
			addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_rmrks3, Chk01_HdrR.$tterm_rmrks3);
			addColumnPathMap(SlsAct_Upd01_HdrR.$lc_no, Chk01_HdrR.$lc_no);
			addColumnPathMap(SlsAct_Upd01_HdrR.$lc_dt, Chk01_HdrR.$lc_dt);
			addColumnPathMap(SlsAct_Upd01_HdrR.$lc_rmrks, Chk01_HdrR.$lc_rmrks);
			addColumnPathMap(SlsAct_Upd01_HdrR.$bl_no, Chk01_HdrR.$bl_no);
			addColumnPathMap(SlsAct_Upd01_HdrR.$bl_dt, Chk01_HdrR.$bl_dt);
			addColumnPathMap(SlsAct_Upd01_HdrR.$bl_rmrks, Chk01_HdrR.$bl_rmrks);
			addColumnPathMap(SlsAct_Upd01_HdrR.$rcv_schd_dt, Chk01_HdrR.$rcv_schd_dt);
			addColumnPathMap(SlsAct_Upd01_HdrR.$trd_cur_amt_dec_place, Chk01_HdrR.$trd_cur_amt_dec_place);
			addColumnPathMap(SlsAct_Upd01_HdrR.$amt_rnd_typ, Chk01_HdrR.$sls_amt_rnd_typ);
			addColumnPathMap(SlsAct_Upd01_HdrR.$tax_rnd_typ, Chk01_HdrR.$sls_tax_rnd_typ);
			addColumnPathMap(SlsAct_Upd01_HdrR.$iv_upd_cntr, Chk01_HdrR.$iv_upd_cntr);
			addColumnPathMap(SlsAct_Upd01_HdrR.$bill_basis_dt, Chk01_HdrR.$bill_basis_dt);
			addColumnPathMap(SlsAct_Upd01_HdrR.$cred_cd, Chk01_HdrR.$cred_cd);
			addColumnPathMap(SlsAct_Upd01_HdrR.$bcst_cd, Chk01_HdrR.$bcst_cd);
			addColumnPathMap(SlsAct_Upd01_HdrR.$acst_cd, Chk01_HdrR.$acst_cd);
			addColumnPathMap(SlsAct_Upd01_HdrR.$ar_dpt_cd, Chk01_HdrR.$ar_dpt_cd);
			addColumnPathMap(SlsAct_Upd01_HdrR.$cst_po_no, Chk01_HdrR.$cst_po_no);
			addColumnPathMap(SlsAct_Upd01_HdrR.$trd_cur_cd, Chk01_HdrR.$trd_cur_cd);
			addColumnPathMap(SlsAct_Upd01_HdrR.$base_cur_cd, Chk01_HdrR.$base_cur_cd);
			addColumnPathMap(SlsAct_Upd01_HdrR.$xrate_cd, Chk01_HdrR.$xrate_cd);
			addColumnPathMap(SlsAct_Upd01_HdrR.$xrate, Chk01_HdrR.$xrate);
			addColumnPathMap(SlsAct_Upd01_HdrR.$ptax_cur_cd, Chk01_HdrR.$ptax_cur_cd);
			addColumnPathMap(SlsAct_Upd01_HdrR.$ptax_xrate, Chk01_HdrR.$ptax_xrate);
			addColumnPathMap(SlsAct_Upd01_HdrR.$trd_rmrks, Chk01_HdrR.$trd_rmrks);
			addColumnPathMap(SlsAct_Upd01_HdrR.$intr_rmrks, Chk01_HdrR.$intr_rmrks);
			addColumnPathMap(SlsAct_Upd01_HdrR.$dlv_slip_no, Chk01_HdrR.$dlv_slip_no);
			addColumnPathMap(SlsAct_Upd01_HdrR.$ship_act_no, Chk01_HdrR.$ship_act_no);
			addColumnPathMap(SlsAct_Upd01_HdrR.$slo_no, Chk01_HdrR.$slo_no);
			addColumnPathMap(SlsAct_Upd01_HdrR.$qtn_no, Chk01_HdrR.$qtn_no);
			addColumnPathMap(SlsAct_Upd01_HdrR.$qtn_rev, Chk01_HdrR.$qtn_rev);
			addColumnPathMap(SlsAct_Upd01_HdrR.$sls_basis_typ, Chk01_HdrR.$sls_basis_typ);
			addColumnPathMap(SlsAct_Upd01_HdrR.$sub_char1, Chk01_HdrR.$sub_char1);
			addColumnPathMap(SlsAct_Upd01_HdrR.$sub_char2, Chk01_HdrR.$sub_char2);
			addColumnPathMap(SlsAct_Upd01_HdrR.$sub_char3, Chk01_HdrR.$sub_char3);
			addColumnPathMap(SlsAct_Upd01_HdrR.$lot_chk_off_flg,
					Chk01_HdrR.$lot_chk_off_flg);
			addColumnPathMap(SlsAct_Upd01_HdrR.$ship_dlv_slip_no, Chk01_HdrR.$ship_dlv_slip_no);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			if (isNull(src.sls_act_no())) {
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			}
			else {
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			}
			if (dest.cst_iv_flg()) {
				dest.dlv_slip_prnt_flg(false);
			}
			else {
				dest.dlv_slip_prnt_flg(src.dlv_slip_out_flg());
			}
			if (MSC_IV_SRC_TYP.isSLS(dest.iv_src_typ())) {
				dest.iv_service_exec_flg(true);
			}
			if (!dest.cst_iv_flg()) {
				dest.iv_no(MAC_STR.NULL_VAL.value());
			}
			// 預り売上、貸出売上時は売上計上区分はnullの前提
			dest.ship_act_service_exec_flg(src.getBoolean("ship_act_service_exec_flg"));
			dest.amt_calc_flg(false);
		}
	}

	/**
	 * 	上り電文(Chk01_DtlR) -> 売上実績サービス.上り電文(SlsAct_Upd01_DtlR) (新規・更新時共通)
	 * @return
	 */
	protected Map_SlsAct_Upd01_DtlR_Chk01_DtlR<SlsAct_Upd01_DtlR, Chk01_DtlR> createMap_SlsAct_Upd01_DtlR_Chk01_DtlR() {
		return new Map_SlsAct_Upd01_DtlR_Chk01_DtlR<SlsAct_Upd01_DtlR, Chk01_DtlR>();
	}

	public class Map_SlsAct_Upd01_DtlR_Chk01_DtlR<D extends SlsAct_Upd01_DtlR, S extends Chk01_DtlR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(SlsAct_Upd01_DtlR.$hdr_peg_no, Chk01_DtlR.$peg_no);
			addColumnPathMap(SlsAct_Upd01_DtlR.$dtl_peg_no, Chk01_DtlR.$dtl_peg_no);
			addColumnPathMap(SlsAct_Upd01_DtlR.$sls_act_d_no, Chk01_DtlR.$sls_act_d_no);
			addColumnPathMap(SlsAct_Upd01_DtlR.$sls_act_d_seq, Chk01_DtlR.$sls_act_d_seq);
			addColumnPathMap(SlsAct_Upd01_DtlR.$disp_seq, Chk01_DtlR.$disp_seq);
			addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_cd, Chk01_DtlR.$dlv_cd);
			addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_sundry_flg,
					Chk01_DtlR.$dlv_sundry_flg);
			addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_nm, Chk01_DtlR.$dlv_nm);
			addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_zip_cd, Chk01_DtlR.$dlv_zip_cd);
			addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_addr1, Chk01_DtlR.$dlv_addr1);
			addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_addr2, Chk01_DtlR.$dlv_addr2);
			addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_addr3, Chk01_DtlR.$dlv_addr3);
			addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_addr4, Chk01_DtlR.$dlv_addr4);
			addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_cntct_dpt, Chk01_DtlR.$dlv_cntct_dpt);
			addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_cntct_psn, Chk01_DtlR.$dlv_cntct_psn);
			addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_tel, Chk01_DtlR.$dlv_tel);
			addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_fax, Chk01_DtlR.$dlv_fax);
			addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_cntry_cd, Chk01_DtlR.$dlv_cntry_cd);
			addColumnPathMap(SlsAct_Upd01_DtlR.$pri_prnt_flg, Chk01_DtlR.$pri_prnt_flg);
			addColumnPathMap(SlsAct_Upd01_DtlR.$dest_cd1, Chk01_DtlR.$dest_cd1);
			addColumnPathMap(SlsAct_Upd01_DtlR.$dest_cd2, Chk01_DtlR.$dest_cd2);
			addColumnPathMap(SlsAct_Upd01_DtlR.$dest_cd3, Chk01_DtlR.$dest_cd3);
			addColumnPathMap(SlsAct_Upd01_DtlR.$sls_usr_cd, Chk01_DtlR.$sls_usr_cd);
			addColumnPathMap(SlsAct_Upd01_DtlR.$sls_dpt_cd, Chk01_DtlR.$sls_dpt_cd);
			addColumnPathMap(SlsAct_Upd01_DtlR.$ar_dpt_cd, Chk01_DtlR.$ar_dpt_cd);
			addColumnPathMap(SlsAct_Upd01_DtlR.$itm_cd, Chk01_DtlR.$itm_cd);
			addColumnPathMap(SlsAct_Upd01_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub1);
			addColumnPathMap(SlsAct_Upd01_DtlR.$itm_sub2, Chk01_DtlR.$itm_sub2);
			addColumnPathMap(SlsAct_Upd01_DtlR.$itm_sub3, Chk01_DtlR.$itm_sub3);
			addColumnPathMap(SlsAct_Upd01_DtlR.$sno1, Chk01_DtlR.$sno1);
			addColumnPathMap(SlsAct_Upd01_DtlR.$sno2, Chk01_DtlR.$sno2);
			addColumnPathMap(SlsAct_Upd01_DtlR.$sno3, Chk01_DtlR.$sno3);
			addColumnPathMap(SlsAct_Upd01_DtlR.$sno4, Chk01_DtlR.$sno4);
			addColumnPathMap(SlsAct_Upd01_DtlR.$itm_nm, Chk01_DtlR.$itm_nm);
			addColumnPathMap(SlsAct_Upd01_DtlR.$iv_itm_nm, Chk01_DtlR.$iv_itm_nm);
			addColumnPathMap(SlsAct_Upd01_DtlR.$cntry_org_cd, Chk01_DtlR.$cntry_org_cd);
			addColumnPathMap(SlsAct_Upd01_DtlR.$loc_cd, Chk01_DtlR.$loc_cd);
			addColumnPathMap(SlsAct_Upd01_DtlR.$str_ln_cd, Chk01_DtlR.$str_ln_cd);
			addColumnPathMap(SlsAct_Upd01_DtlR.$lot_no, Chk01_DtlR.$lot_no);
			addColumnPathMap(SlsAct_Upd01_DtlR.$sublot_no, Chk01_DtlR.$sublot_no);
			addColumnPathMap(SlsAct_Upd01_DtlR.$gd_cd, Chk01_DtlR.$gd_cd);
			addColumnPathMap(SlsAct_Upd01_DtlR.$trd_unit_cd, Chk01_DtlR.$trd_unit_cd);
			addColumnPathMap(SlsAct_Upd01_DtlR.$trd_unit_qty, Chk01_DtlR.$trd_unit_qty);
			addColumnPathMap(SlsAct_Upd01_DtlR.$base_unit_cd, Chk01_DtlR.$base_unit_cd);
			addColumnPathMap(SlsAct_Upd01_DtlR.$base_unit_qty, Chk01_DtlR.$base_unit_qty);
			addColumnPathMap(SlsAct_Upd01_DtlR.$trd_cur_upri, Chk01_DtlR.$trd_cur_upri);
			addColumnPathMap(SlsAct_Upd01_DtlR.$trd_cur_amt, Chk01_DtlR.$trd_cur_amt);
			addColumnPathMap(SlsAct_Upd01_DtlR.$trd_cur_tax_amt, Chk01_DtlR.$trd_cur_tax_amt);
			addColumnPathMap(SlsAct_Upd01_DtlR.$base_cur_upri, Chk01_DtlR.$base_cur_upri);
			addColumnPathMap(SlsAct_Upd01_DtlR.$base_cur_amt, Chk01_DtlR.$base_cur_amt);
			addColumnPathMap(SlsAct_Upd01_DtlR.$base_cur_tax_amt, Chk01_DtlR.$base_cur_tax_amt);
			addColumnPathMap(SlsAct_Upd01_DtlR.$base_cur_dscnt_amt, Chk01_DtlR.$base_cur_dscnt_amt);
			addColumnPathMap(SlsAct_Upd01_DtlR.$ptax_cur_upri, Chk01_DtlR.$ptax_cur_upri);
			addColumnPathMap(SlsAct_Upd01_DtlR.$ptax_cur_amt, Chk01_DtlR.$ptax_cur_amt);
			addColumnPathMap(SlsAct_Upd01_DtlR.$ptax_cur_tax_amt, Chk01_DtlR.$ptax_cur_tax_amt);
			addColumnPathMap(SlsAct_Upd01_DtlR.$ptax_cur_dscnt_amt, Chk01_DtlR.$ptax_cur_dscnt_amt);
			addColumnPathMap(SlsAct_Upd01_DtlR.$upri_not_tgt_flg,
					Chk01_DtlR.$upri_not_tgt_flg);
			addColumnPathMap(SlsAct_Upd01_DtlR.$interim_flg, Chk01_DtlR.$interim_flg);
			addColumnPathMap(SlsAct_Upd01_DtlR.$tax_cd, Chk01_DtlR.$tax_cd);
			addColumnPathMap(SlsAct_Upd01_DtlR.$inc_tax_flg, Chk01_DtlR.$inc_tax_flg);
			addColumnPathMap(SlsAct_Upd01_DtlR.$tax_rate, Chk01_DtlR.$tax_rate);
			addColumnPathMap(SlsAct_Upd01_DtlR.$tax_typ, Chk01_DtlR.$tax_typ);
			addColumnPathMap(SlsAct_Upd01_DtlR.$trd_cur_dscnt_amt,
					Chk01_DtlR.$trd_cur_dscnt_amt);
			addColumnPathMap(SlsAct_Upd01_DtlR.$bill_crryovr_times,
					Chk01_DtlR.$bill_crryovr_times);
			addColumnPathMap(SlsAct_Upd01_DtlR.$stk_mng_typ, Chk01_DtlR.$stk_mng_typ);
			addColumnPathMap(SlsAct_Upd01_DtlR.$sundry_itm_flg,
					Chk01_DtlR.$sundry_itm_flg);
			addColumnPathMap(SlsAct_Upd01_DtlR.$sno1_mng_typ, Chk01_DtlR.$sno1_mng_typ);
			addColumnPathMap(SlsAct_Upd01_DtlR.$sno2_mng_typ, Chk01_DtlR.$sno2_mng_typ);
			addColumnPathMap(SlsAct_Upd01_DtlR.$sno3_mng_typ, Chk01_DtlR.$sno3_mng_typ);
			addColumnPathMap(SlsAct_Upd01_DtlR.$sno4_mng_typ, Chk01_DtlR.$sno4_mng_typ);
			addColumnPathMap(SlsAct_Upd01_DtlR.$itm_jnl_cd, Chk01_DtlR.$itm_jnl_cd);
			addColumnPathMap(SlsAct_Upd01_DtlR.$cst_po_d_no, Chk01_DtlR.$cst_po_d_no);
			addColumnPathMap(SlsAct_Upd01_DtlR.$cst_itm_cd, Chk01_DtlR.$cst_itm_cd);
			addColumnPathMap(SlsAct_Upd01_DtlR.$cst_itm_nm, Chk01_DtlR.$cst_itm_nm);
			addColumnPathMap(SlsAct_Upd01_DtlR.$trd_d_rmrks, Chk01_DtlR.$trd_d_rmrks);
			addColumnPathMap(SlsAct_Upd01_DtlR.$intr_rmrks, Chk01_DtlR.$intr_rmrks);
			addColumnPathMap(SlsAct_Upd01_DtlR.$rsn_cd, Chk01_DtlR.$sls_rsn_cd);
			addColumnPathMap(SlsAct_Upd01_DtlR.$bd_dpt_cd, Chk01_DtlR.$bd_dpt_cd);
			addColumnPathMap(SlsAct_Upd01_DtlR.$wtax_rate, Chk01_DtlR.$wtax_rate);
			addColumnPathMap(SlsAct_Upd01_DtlR.$wtax_amt, Chk01_DtlR.$wtax_amt);
			addColumnPathMap(SlsAct_Upd01_DtlR.$slo_no, Chk01_DtlR.$slo_no);
			addColumnPathMap(SlsAct_Upd01_DtlR.$slo_d_no, Chk01_DtlR.$slo_d_no);
			addColumnPathMap(SlsAct_Upd01_DtlR.$ship_schd_no, Chk01_DtlR.$ship_schd_no);
			addColumnPathMap(SlsAct_Upd01_DtlR.$sls_schd_no, Chk01_DtlR.$sls_schd_no);
			addColumnPathMap(SlsAct_Upd01_DtlR.$qtn_no, Chk01_DtlR.$qtn_no);
			addColumnPathMap(SlsAct_Upd01_DtlR.$qtn_rev, Chk01_DtlR.$qtn_rev);
			addColumnPathMap(SlsAct_Upd01_DtlR.$qtn_d_no, Chk01_DtlR.$qtn_d_no);
			addColumnPathMap(SlsAct_Upd01_DtlR.$sub_char1, Chk01_DtlR.$sub_char1);
			addColumnPathMap(SlsAct_Upd01_DtlR.$sub_char2, Chk01_DtlR.$sub_char2);
			addColumnPathMap(SlsAct_Upd01_DtlR.$sub_char3, Chk01_DtlR.$sub_char3);
			addColumnPathMap(SlsAct_Upd01_DtlR.$dscnt_rsn_cd, Chk01_DtlR.$dscnt_rsn_cd);
			addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_slip_d_no, Chk01_DtlR.$dlv_slip_d_no);
			addColumnPathMap(SlsAct_Upd01_DtlR.$sls_schd_abort_flg, Chk01_DtlR.$abort_flg);
			addColumnPathMap(SlsAct_Upd01_DtlR.$iv_upri, Chk01_DtlR.$iv_upri);
			addColumnPathMap(SlsAct_Upd01_DtlR.$iv_amt, Chk01_DtlR.$iv_amt);
			addColumnPathMap(SlsAct_Upd01_DtlR.$iv_d_rmrks, Chk01_DtlR.$iv_d_rmrks);
			addColumnPathMap(SlsAct_Upd01_DtlR.$iv_trd_rmrks, Chk01_DtlR.$iv_trd_rmrks);
			addColumnPathMap(SlsAct_Upd01_DtlR.$iv_trd_d_rmrks, Chk01_DtlR.$iv_trd_d_rmrks);
			addColumnPathMap(SlsAct_Upd01_DtlR.$iv_intr_d_rmrks, Chk01_DtlR.$iv_intr_d_rmrks);
			addColumnPathMap(SlsAct_Upd01_DtlR.$iv_sub_char1, Chk01_DtlR.$iv_sub_char1);
			addColumnPathMap(SlsAct_Upd01_DtlR.$iv_sub_char2, Chk01_DtlR.$iv_sub_char2);
			addColumnPathMap(SlsAct_Upd01_DtlR.$iv_sub_char3, Chk01_DtlR.$iv_sub_char3);
			addColumnPathMap(SlsAct_Upd01_DtlR.$cost_upri, Chk01_DtlR.$cost_upri);
			addColumnPathMap(SlsAct_Upd01_DtlR.$cost_amt, Chk01_DtlR.$cost_amt);
			addColumnPathMap(SlsAct_Upd01_DtlR.$ship_dlv_slip_d_no, Chk01_DtlR.$ship_dlv_slip_d_no);
			addColumnPathMap(SlsAct_Upd01_DtlR.$iv_d_no, Chk01_DtlR.$iv_d_no);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.data_crud_typ(getDataCrudTyp(src));
			if (!isNull(src.loc_cd()) && isNull(src.str_ln_cd())) {
				dest.str_ln_cd(MAC_STR.NULL_VAL.value());
			}
		}

		protected String getDataCrudTyp(S src) {
			if (isNull(src.sls_act_d_no())) {
				return MAC_DATA_CRUD_TYP.CRT.value();
			}
			else if (src.isStatusDelete()) {
				return MAC_DATA_CRUD_TYP.DEL.value();
			}
			return MAC_DATA_CRUD_TYP.UPD.value();
		}
	}

	/**
	 * 	上り電文(Chk01_IoR) -> 売上実績サービス.上り電文(SlsAct_Upd01_IoR) (新規・更新時共通)
	 * @return
	 */
	protected Map_SlsAct_Upd01_IoR_Chk01_IoR<SlsAct_Upd01_IoR, Chk01_IoR> createMap_SlsAct_Upd01_IoR_Chk01_IoR() {
		return new Map_SlsAct_Upd01_IoR_Chk01_IoR<SlsAct_Upd01_IoR, Chk01_IoR>();
	}

	public class Map_SlsAct_Upd01_IoR_Chk01_IoR<D extends SlsAct_Upd01_IoR, S extends Chk01_IoR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(SlsAct_Upd01_IoR.$hdr_peg_no, Chk01_IoR.$peg_no);
			addColumnPathMap(SlsAct_Upd01_IoR.$dtl_peg_no, Chk01_IoR.$dtl_peg_no);
			addColumnPathMap(SlsAct_Upd01_IoR.$io_peg_no, Chk01_IoR.$io_peg_no);
			addColumnPathMap(SlsAct_Upd01_IoR.$sls_act_io_no, Chk01_IoR.$sls_act_io_no);
			addColumnPathMap(SlsAct_Upd01_IoR.$sls_act_io_seq, Chk01_IoR.$sls_act_io_seq);
			addColumnPathMap(SlsAct_Upd01_IoR.$ship_act_d_no, Chk01_IoR.$ship_act_d_no);
			addColumnPathMap(SlsAct_Upd01_IoR.$sno1, Chk01_IoR.$sno1);
			addColumnPathMap(SlsAct_Upd01_IoR.$sno2, Chk01_IoR.$sno2);
			addColumnPathMap(SlsAct_Upd01_IoR.$sno3, Chk01_IoR.$sno3);
			addColumnPathMap(SlsAct_Upd01_IoR.$sno4, Chk01_IoR.$sno4);
			addColumnPathMap(SlsAct_Upd01_IoR.$gd_cd, Chk01_IoR.$gd_cd);
			addColumnPathMap(SlsAct_Upd01_IoR.$loc_cd, Chk01_IoR.$loc_cd);
			addColumnPathMap(SlsAct_Upd01_IoR.$str_ln_cd, Chk01_IoR.$str_ln_cd);
			addColumnPathMap(SlsAct_Upd01_IoR.$lot_no, Chk01_IoR.$lot_no);
			addColumnPathMap(SlsAct_Upd01_IoR.$sublot_no, Chk01_IoR.$sublot_no);
			addColumnPathMap(SlsAct_Upd01_IoR.$trd_unit_cd, Chk01_IoR.$trd_unit_cd);
			addColumnPathMap(SlsAct_Upd01_IoR.$trd_unit_qty, Chk01_IoR.$trd_unit_qty);
			addColumnPathMap(SlsAct_Upd01_IoR.$base_unit_cd, Chk01_IoR.$base_unit_cd);
			addColumnPathMap(SlsAct_Upd01_IoR.$base_unit_qty, Chk01_IoR.$base_unit_qty);
			addColumnPathMap(SlsAct_Upd01_IoR.$sub_char1, Chk01_IoR.$sub_char1);
			addColumnPathMap(SlsAct_Upd01_IoR.$sub_char2, Chk01_IoR.$sub_char2);
			addColumnPathMap(SlsAct_Upd01_IoR.$sub_char3, Chk01_IoR.$sub_char3);
			addColumnPathMap(SlsAct_Upd01_IoR.$ship_alloc_sts_no, Chk01_IoR.$ship_alloc_sts_no);
			addColumnPathMap(SlsAct_Upd01_IoR.$iv_d_no, Chk01_IoR.$iv_d_no);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.data_crud_typ(getDataCrudTyp(src));
			dest.pack_unit_cd(src.pack_flg() ? src.trd_unit_cd() : src.base_unit_cd());
			dest.pack_unit_qty(src.pack_flg() ? src.trd_unit_qty() : src.base_unit_qty());
			if (!isNull(src.loc_cd()) && isNull(src.str_ln_cd())) {
				dest.str_ln_cd(MAC_STR.NULL_VAL.value());
			}
		}

		protected String getDataCrudTyp(S src) {
			if (isNull(src.sls_act_io_no())) {
				return MAC_DATA_CRUD_TYP.CRT.value();
			}
			else if (src.isStatusDelete()) {
				return MAC_DATA_CRUD_TYP.DEL.value();
			}
			return MAC_DATA_CRUD_TYP.UPD.value();
		}
	}

	/**
	 * 	上り電文(Chk01_DtlR) -> 上り電文(Chk01_IoR) (新規・更新時共通)
	 * @return
	 */
	protected Map_Chk01_IoR_Chk01_DtlR<Chk01_IoR, Chk01_DtlR> createMap_Chk01_IoR_Chk01_DtlR() {
		return new Map_Chk01_IoR_Chk01_DtlR<Chk01_IoR, Chk01_DtlR>();
	}

	public class Map_Chk01_IoR_Chk01_DtlR<D extends Chk01_IoR, S extends Chk01_DtlR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Chk01_IoR.$trd_unit_cd, Chk01_DtlR.$trd_unit_cd);
			addColumnPathMap(Chk01_IoR.$trd_unit_qty, Chk01_DtlR.$trd_unit_qty);
			addColumnPathMap(Chk01_IoR.$gd_cd, Chk01_DtlR.$gd_cd);
			addColumnPathMap(Chk01_IoR.$loc_cd, Chk01_DtlR.$loc_cd);
			addColumnPathMap(Chk01_IoR.$str_ln_cd, Chk01_DtlR.$str_ln_cd);
			addColumnPathMap(Chk01_IoR.$str_ln_cd_none_flg,
					Chk01_DtlR.$str_ln_cd_none_flg);
			addColumnPathMap(Chk01_IoR.$lot_no, Chk01_DtlR.$lot_no);
			addColumnPathMap(Chk01_IoR.$sublot_no, Chk01_DtlR.$sublot_no);
			addColumnPathMap(Chk01_IoR.$sno1, Chk01_DtlR.$sno1);
			addColumnPathMap(Chk01_IoR.$sno2, Chk01_DtlR.$sno2);
			addColumnPathMap(Chk01_IoR.$sno3, Chk01_DtlR.$sno3);
			addColumnPathMap(Chk01_IoR.$sno4, Chk01_DtlR.$sno4);
			addColumnPathMap(Chk01_IoR.$sub_char1, Chk01_DtlR.$sub_char1);
			addColumnPathMap(Chk01_IoR.$sub_char2, Chk01_DtlR.$sub_char2);
			addColumnPathMap(Chk01_IoR.$sub_char3, Chk01_DtlR.$sub_char3);
			addColumnPathMap(Chk01_IoR.$sls_act_no, Chk01_DtlR.$sls_act_no);
			addColumnPathMap(Chk01_IoR.$sls_act_seq, Chk01_DtlR.$sls_act_seq);
			addColumnPathMap(Chk01_IoR.$sls_act_d_seq, Chk01_DtlR.$sls_act_d_seq);
			addColumnPathMap(Chk01_IoR.$sls_act_d_no, Chk01_DtlR.$sls_act_d_no);
			addColumnPathMap(Chk01_IoR.$dtl_row_id, Chk01_DtlR.$dtl_row_id);
		}
	}

	/**
	 * 下り電文(Srch01_DtlR) -> 単位・金額換算ユーティリティ.上り電文(ConvQtyAmtUtil_Calc01_HdrR)
	 * @param hdr_peg_no
	 * @return
	 */
	protected Map_ConvQtyAmtUtil_Calc01_HdrR_Srch01_DtlR<ConvQtyAmtUtil_Calc01_HdrR, Srch01_DtlR> createMap_ConvQtyAmtUtil_Calc01_HdrR_Srch01_DtlR(
			Srch01_HdrR hdr) {
		return new Map_ConvQtyAmtUtil_Calc01_HdrR_Srch01_DtlR<ConvQtyAmtUtil_Calc01_HdrR, Srch01_DtlR>(
				hdr);
	}

	public class Map_ConvQtyAmtUtil_Calc01_HdrR_Srch01_DtlR<D extends ConvQtyAmtUtil_Calc01_HdrR, S extends Srch01_DtlR>
			extends MCRowMapper<D, S> {

		Srch01_HdrR _hdr;

		public Map_ConvQtyAmtUtil_Calc01_HdrR_Srch01_DtlR(Srch01_HdrR hdr) {
			_hdr = hdr;
		}

		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_cd, Srch01_DtlR.$src_trd_unit_cd);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_qty, Srch01_DtlR.$src_trd_unit_qty);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_upri, Srch01_DtlR.$src_trd_cur_upri);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_dscnt_amt, Srch01_DtlR.$src_trd_cur_dscnt_amt);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_amt, Srch01_DtlR.$src_trd_cur_amt);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_tax_amt, Srch01_DtlR.$src_trd_cur_tax_amt);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_inc_tax_amt, Srch01_DtlR.$src_trd_cur_inc_tax_amt);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$base_unit_dec_place, Srch01_DtlR.$base_unit_dec_place);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$base_unit_rnd_typ, Srch01_DtlR.$base_unit_rnd_typ);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_conv_qty, Srch01_DtlR.$src_trd_unit_conv_qty);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_conv_base_qty, Srch01_DtlR.$src_trd_unit_conv_base_qty);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$tax_rate, Srch01_DtlR.$schd_tax_rate);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$inc_tax_flg, Srch01_DtlR.$schd_inc_tax_flg);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$act_tax_rate, Srch01_DtlR.$tax_rate);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$act_inc_tax_flg, Srch01_DtlR.$inc_tax_flg);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$schd_base_unit_qty, Srch01_DtlR.$init_schd_qty);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.trd_cur_cd(_hdr.trd_cur_cd());
			dest.amt_dec_place(_hdr.trd_cur_amt_dec_place());
			dest.upri_dec_place(_hdr.trd_cur_upri_dec_place());
			dest.amt_rnd_typ(_hdr.sls_amt_rnd_typ());
			dest.tax_rnd_typ(_hdr.sls_tax_rnd_typ());
		}
	}

	/**
	 * 下り電文(Srch01_DtlR) -> 単位・金額換算ユーティリティ.上り電文(ConvQtyAmtUtil_Calc01_Dtl1R)
	 * @param hdr_peg_no
	 * @return
	 */
	protected Map_ConvQtyAmtUtil_Calc01_Dtl1R_Srch01_DtlR<ConvQtyAmtUtil_Calc01_Dtl1R, Srch01_DtlR> createMap_ConvQtyAmtUtil_Calc01_Dtl1R_Srch01_DtlR(
			MCNumber hdr_peg_no) {
		return new Map_ConvQtyAmtUtil_Calc01_Dtl1R_Srch01_DtlR<ConvQtyAmtUtil_Calc01_Dtl1R, Srch01_DtlR>(
				hdr_peg_no);
	}

	public class Map_ConvQtyAmtUtil_Calc01_Dtl1R_Srch01_DtlR<D extends ConvQtyAmtUtil_Calc01_Dtl1R, S extends Srch01_DtlR>
			extends MCRowMapper<D, S> {

		MCNumber _hdr_peg_no;

		public Map_ConvQtyAmtUtil_Calc01_Dtl1R_Srch01_DtlR(MCNumber hdr_peg_no) {
			_hdr_peg_no = hdr_peg_no;
		}

		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$peg_no, Srch01_DtlR.$peg_no);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_qty,
					Srch01_DtlR.$trd_unit_qty);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_cd,
					Srch01_DtlR.$trd_unit_cd);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_conv_qty, Srch01_DtlR.$trd_unit_conv_qty);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_conv_base_qty, Srch01_DtlR.$trd_unit_conv_base_qty);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$wtax_rate, Srch01_DtlR.$wtax_rate);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.hdr_peg_no(_hdr_peg_no);
		}
	}

	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 納品書を発行します。<br>
	 */
	public class Prnt01 extends MSBBL_SlsActReg_MC_A.Prnt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			// 出荷帳票管理サービス呼出
			callShipSlipSvPrnt02();
		}

		protected void callShipSlipSvPrnt02() {

			MSBEL_ShipRprtPrntService.ShipRprt_Prnt01 ope = MSBEL_ShipRprtPrntService.crtShipRprt_Prnt01();

			ShipRprt_Prnt01_HdrR upR = ShipRprt_Prnt01_HdrR.create();
			upR.dlv_slip_no(up0().dlv_slip_no());
			upR.dlv_slip_seq(up0().dlv_slip_seq());
			upR.sls_prnt_flg(true);
			upR.inc_can_flg(getIncCanFlg());
			ope.up0().add(upR);
			ope.exec();
		}
		protected boolean getIncCanFlg() {
			MST_SLS_ACT_R t = MST_SLS_ACT_R.create("T");
			MST_SLS_ACT_R w = MST_SLS_ACT_R.create("W");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSelect(t.sls_act_no, t.sls_act_rev);
			bldr.addSelect(subQuery()
				.select(max(w.sls_act_rev))
				.from(w)
				.where(w.sls_act_no.eq(t.sls_act_no))
				.as("max_rev")
			);
			
			MST_SLS_ACT_R rsltR = MST_SLS_ACT_R.create();
			dbSelectKey("MSBBL1310_MST_SLS_ACT_S03", rsltR, bldr, up0());
			
			// 最新の改訂番号のときのみ、訂正に対する取消を出力する
			return isSame(rsltR.sls_act_rev(), rsltR.getNumberNE("max_rev"));
		}

	}

	/**
	 * 	親の明細行に対する子の詳細リストを取得する
	 * <p>
	 * 	parDtlのdtl_row_idの値が同じリストをsrcIoLから抽出します。<br>
	 * 	明細（親）と詳細（子）のリストには同一のdtl_row_id設定されている前提で動作します。
	 * <p>
	 * @param srcIolL
	 * @param srcDtlL
	 * @return
	 */
	protected MCList<Chk01_IoR> getChildIoL(MCList<Chk01_IoR> srcIoL, Chk01_DtlR parDtl) {

		if (isNull(parDtl) || srcIoL.isEmpty()) {
			return MCList.create(Chk01_IoR.class);
		}

		MCIndexKey idxKey = srcIoL.createIndex(Chk01_DtlR.$dtl_row_id);
		return srcIoL.subList(idxKey, parDtl.dtl_row_id());
	}

	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 単価を再取得します。<br>
	 */
	public class Sprt01 extends MSBBL_SlsActReg_MC_A.Sprt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			callSlsUpriSvSprt01();
			setDown();
		}

		/**
		 * 	単価再取得サービスの呼出
		 */
		protected void callSlsUpriSvSprt01() {

			mapUpContainers(CALL_OPE);

			sprt01.exec();

			// mapDownContaiersを呼ぶと属性(呼出元のGUIIndex)が上書きされるため呼ばない
			String[] destCols = new String[] {
				Sprt01_DtlR.$sls_upri, Sprt01_DtlR.$interim_flg
			};
			String[] srcCols = new String[] {
				SlsUpri_Sprt01_DtlR.$sls_upri, SlsUpri_Sprt01_DtlR.$interim_flg
			};
			copyByPegNo(up0(), destCols, sprt01_down0, srcCols);
		}

		@Override
		protected void up_CALL_OPE(MCList<SlsUpri_Sprt01_DtlR> dest0_0,
				MCList<Sprt01_DtlR> src_Sprt01_Dtl) {

			setPegNo(up0());
			super.up_CALL_OPE(dest0_0, src_Sprt01_Dtl);
			dest0_0.setBoolean(SlsUpri_Sprt01_DtlR.$sls_upri_flg, true);
		}

		protected void setDown() {
			down0().setAll(up0());
		}

	}

	/**
	 * Chk01_HdrRに出荷実績ＳＶ呼出ＦＬＧを設定する
	 * <p>
	 * 明細情報に預り売上ＦＬＧがオンの行が存在する場合、出荷実績ＳＶ呼出ＦＬＧにfalseを設定<br>
	 * 上記以外は、売上計上区分が出荷基準：true、出荷基準以外：falseを設定
	 * </p>
	 * 
	 * @param hdrR ヘッダ情報
	 * @param dtlL 明細情報
	 */
	protected void editChk01HdrR(Chk01_HdrR hdrR, MCList<Chk01_DtlR> dtlL) {
		if (dtlL.subList(Chk01_DtlR.$sls_cststk_flg, true).size() > 0) {
			hdrR.addBooleanColumn("ship_act_service_exec_flg", false);
		}
		else {
			hdrR.addBooleanColumn("ship_act_service_exec_flg",
					MAC_SLS_BASIS_TYP.isSHIP_BASIS(hdrR.sls_basis_typ()));
		}
	}

	/**
	 * Chk02_HdrRに出荷実績ＳＶ呼出ＦＬＧを設定する
	 * <p>
	 * 明細情報に預り売上ＦＬＧがオンの行が存在する場合、出荷実績ＳＶ呼出ＦＬＧにfalseを設定<br>
	 * 上記以外は、売上計上区分が出荷基準：true、出荷基準以外：falseを設定
	 * </p>
	 * 
	 * @param hdrR ヘッダ情報
	 * @param dtlL 明細情報
	 */
	protected void editChk02HdrR(Chk02_HdrR hdrR, MCList<Chk02_DtlR> dtlL) {
		if (dtlL.subList(Chk02_DtlR.$sls_cststk_flg, true).size() > 0) {
			hdrR.addBooleanColumn("ship_act_service_exec_flg", false);
		}
		else {
			hdrR.addBooleanColumn("ship_act_service_exec_flg",
					MAC_SLS_BASIS_TYP.isSHIP_BASIS(hdrR.sls_basis_typ()));
		}
	}

	/**
	 * 取引先マスタの取得
	 * @param bp_cd
	 * @return
	 */
	protected MAM_BP_R getBpCache(String bp_cd) {
		if (_cacheBp == null) {
			_cacheBp = new FXUCL_MCDbcCache<MAM_BP_R>(MCQueryApiBuilder.create(MAM_BP_R.create("T")));
		}
		return _cacheBp.get(bp_cd);
	}

	/**
	 * 粗利率に関連する項目を設定する。
	 * @param hdr 受注ヘッダ
	 * @param dtlL 受注明細
	 */
	protected void calcProfRate(Srch01_HdrR hdr, MCList<Srch01_DtlR> dtlL) {
		
		MCNumber trdCurAmt = null;
		MCNumber ttlAmt = null;
		MCNumber ttlAmtNoCost = null;
		MCNumber baseCurTtlAmt = null;
		MCNumber costAmt = null;
		MCNumber trdCurIncTaxAmt = null;
		
		for (Srch01_DtlR dtlR : dtlL) {
			
			if (isNull(dtlR.trd_cur_amt())) {
				continue;
			}
			
			if (dtlR.dscnt_itm_flg()) {
				
				trdCurAmt = nvl(trdCurAmt, MCNumber.ZERO).subtract(dtlR.trd_cur_amt());
				trdCurIncTaxAmt = nvl(trdCurIncTaxAmt, MCNumber.ZERO).subtract(dtlR.trd_cur_inc_tax_amt());
			}
			else {
				
				trdCurAmt = nvl(trdCurAmt, MCNumber.ZERO).add(dtlR.trd_cur_amt());
				trdCurIncTaxAmt = nvl(trdCurIncTaxAmt, MCNumber.ZERO).add(dtlR.trd_cur_inc_tax_amt());
				if (!isNull(dtlR.cost_upri())) {
					
					ttlAmt = nvl(ttlAmt, MCNumber.ZERO).add(dtlR.trd_cur_amt());
					baseCurTtlAmt = nvl(baseCurTtlAmt, MCNumber.ZERO).add(dtlR.base_cur_amt());
					costAmt = nvl(costAmt, MCNumber.ZERO).add(dtlR.cost_amt());
				}
			}
			
			dtlR.prof_rate(MSUCL_SlsUtil.getProfRate(dtlR.base_cur_amt(), dtlR.cost_amt()));
		}
		
		if (!isNull(trdCurAmt)) {
			ttlAmtNoCost = trdCurAmt.subtract(nvl(ttlAmt, MCNumber.ZERO));
		}
		
		hdr.trd_cur_amt(trdCurAmt);
		hdr.trd_cur_inc_tax_amt(trdCurIncTaxAmt);
		hdr.ttl_amt(ttlAmt);
		hdr.ttl_amt_no_cost(ttlAmtNoCost);
		hdr.prof_rate(MSUCL_SlsUtil.getProfRate(baseCurTtlAmt, costAmt));
	}
	
	protected Map_MAM_SUNDRY_ITM_R_Chk01_DtlR<MAM_SUNDRY_ITM_R,Chk01_DtlR> createMap_MAM_SUNDRY_ITM_R_Chk01_DtlR() {
		return new Map_MAM_SUNDRY_ITM_R_Chk01_DtlR<MAM_SUNDRY_ITM_R, Chk01_DtlR>();
	}

	public class Map_MAM_SUNDRY_ITM_R_Chk01_DtlR<D extends MAM_SUNDRY_ITM_R, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MAM_SUNDRY_ITM_R.$itm_cd, Chk01_DtlR.$itm_cd);
			addColumnPathMap(MAM_SUNDRY_ITM_R.$itm_sub1, Chk01_DtlR.$itm_sub1);
			addColumnPathMap(MAM_SUNDRY_ITM_R.$itm_sub2, Chk01_DtlR.$itm_sub2);
			addColumnPathMap(MAM_SUNDRY_ITM_R.$itm_sub3, Chk01_DtlR.$itm_sub3);
			addColumnPathMap(MAM_SUNDRY_ITM_R.$sno1, Chk01_DtlR.$sno1);
			addColumnPathMap(MAM_SUNDRY_ITM_R.$sno2, Chk01_DtlR.$sno2);
			addColumnPathMap(MAM_SUNDRY_ITM_R.$sno3, Chk01_DtlR.$sno3);
			addColumnPathMap(MAM_SUNDRY_ITM_R.$sno4, Chk01_DtlR.$sno4);
		}
	}

	/**
	 * 品目マスタ取得
	 * @param bindL 取得対象の品目情報を持ったリスト
	 * @return mamItmL 品目マスタの取得結果リスト
	 */
	protected MCList<MAM_ITM_R> searchMamItm(MCList<MST_SLS_ACT_D_R> bindL) {
		MAM_ITM_R mamItmL_t = MAM_ITM_R.create("T");
		MCQueryApiBuilder mamItmL_bldr = MCQueryApiBuilder.create(mamItmL_t);
		MCList<MAM_ITM_R> mamItmL = MCList.create(MAM_ITM_R.class);
		
		mamItmL_bldr.setSelect(mamItmL_bldr.getBaseDbc().getKeyColumn$());
		mamItmL_bldr.setWhere(mamItmL_t.itm_cd.eq(bind("itm_cd")));
		mamItmL_bldr.addWhereWithAnd(mamItmL_t.itm_sub1.eq(bind("itm_sub1")));
		mamItmL_bldr.addWhereWithAnd(mamItmL_t.itm_sub2.eq(bind("itm_sub2")));
		mamItmL_bldr.addWhereWithAnd(mamItmL_t.itm_sub3.eq(bind("itm_sub3")));
		dbSelect("MSBBL1310_MAM_ITM_S01", mamItmL, mamItmL_bldr, bindL);
		return mamItmL;
	}
	protected void initDbcCacheDpt(MCList<Srch01_HdrR> down) {
		MAM_WG_R mamWgR = MAM_WG_R.create("M1");
		MAM_DPT_R mamDptR = MAM_DPT_R.create("T");
		MCQueryApiBuilder mamDpt_bldr = MCQueryApiBuilder.create(mamDptR);
		mamDpt_bldr.setSelect(mamDptR.wg_cd);
		mamDpt_bldr.addSelect(mamWgR.wg_nm);
		mamDpt_bldr.addLeftOuterJoin(mamWgR, mamWgR.wg_cd.eq(mamDptR.wg_cd));
		_cacheMamDpt = new FXUCL_MCDbcCacheStEnd<MAM_DPT_R>(mamDpt_bldr, down, Srch01_HdrR.$sls_dpt_cd);
	}
	
	/**
	 * Prnt02オペレーション.<p>
	 *
	 * インボイスを発行する<br>
	 */
	public class Prnt02 extends MSBBL_SlsActReg_MC_A.Prnt02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			MSBEL_ExRptService.ExRpt_Prnt03  prnt03 = MSBEL_ExRptService.crtExRpt_Prnt03();
			prnt03.up0().iv_no(up0().iv_no());
			prnt03.up0().iv_mng_no(up0().iv_mng_no());
			prnt03.up0().iv_rev(up0().iv_rev());
			prnt03.exec();
		}
	}

	//FMCB CUSTOM END
}