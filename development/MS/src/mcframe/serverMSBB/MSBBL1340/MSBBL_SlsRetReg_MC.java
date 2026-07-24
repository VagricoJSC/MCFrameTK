package mcframe.serverMSBB.MSBBL1340;

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
import mcframe.serverMSBB.MSBBL1340.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBE.MSBEL5930.*;
import mcframe.serverMSBB.MSBBL6210.*;
import mcframe.serverMSBD.MSBDL5170.*;
import mcframe.serverMSBE.MSBEL5010.*;
import mcframe.serverMSBF.MSBFL5210.*;
import mcframe.serverMSUC.MSUCL0020.*;
import mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil;
import mcframe.serverMAUC.MAUCL1060.MAUCL_TrdUtil;
import static mcframe.serverMSBB.MSBBL1340.Query.*;
import static mcframe.commonCore.container.MCRow.*;
import mcframe.commonMAUA.MAUAC0010.MAUAC_List;
import mcframe.serverFXUC.FXUCL0030.FXUCL_Cache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0170.FXUCL_BeforeAfterValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverMABS.MABSL5010.SlsUpri_Sprt01_DtlR;
import mcframe.commonFXUC.FXUCC0030.FXUCC_Divide;
import mcframe.serverMSBE.MSBEL5550.*;
import java.util.HashSet;
import mcframe.serverMSUC.MSUCL0080.MSUCL_SlsUtil;
import mcframe.serverMAUC.MAUCL1110.MAUCL_DptUtil;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import static mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBBL_SlsRetReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBBL_SlsRetReg_MC extends MSBBL_SlsRetReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 売上返品予定ＮＯもしくは入荷実績ＮＯから売上返品予定情報を検索します。<br>
	 */
	public class Srch01 extends MSBBL_SlsRetReg_MC_A.Srch01 {
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

			// 明細検索
			int cnt2 = srchDtl();
			if (isSame(cnt2, 0)) {
				down0().clear();
				down1().clear();
				return;
			}

			// 詳細検索
			int cnt3 = srchIo();
			if (isSame(cnt3, 0)) {
				down0().clear();
				down1().clear();
				down2().clear();
			}

			setDown();
		}

		protected void editCnd() {
			up0().setDateNE("today", getToday());
		}

		protected int srchHdr() {
			if (MSC_SLS_SRCH_TGT_TYP.isARR_ACT_NO(up0().srch_tgt_typ())) {
				//検索条件：入荷実績ＮＯの場合、入荷実績ＮＯが紐づく売上返品予定ＮＯを取得する。
				// 以降は売上返品予定ＮＯ検索と同じ
				Srch01_CndR rsltR = up0().createInstance();
				int cnt = executeQuery(rsltR, MSBBL1340_ARR_ACT_S01(), up0());
				if (cnt <= 0) {
					return cnt;
				}
				up0().srch_tgt_no(rsltR.srch_tgt_no());
			}
			return executeQuery(down0(), MSBBL1340_SLS_RET_SCHD_S02(), up0());
		}

		protected int srchDtl() {

			return executeQuery(down1(), MSBBL1340_SLS_RET_SCHD_D_S02(), up0());

		}

		protected int srchIo() {

			MCList<Srch01_IoR> down2Rslt = down2().createInstance();

			// 入荷予定のみを検索
			MCList<Srch01_IoR> arrSchdL = down2().createInstance();

			executeQuery(arrSchdL, MSBBL1340_ARR_SCHD_S02(), up0());

			// 入荷予定に紐づく入荷実績を検索
			// (実績固有の情報のみ取得する。予定と共有情報はマージするので不要)
			MCList<Srch01_IoR> arrActL = down2().createInstance();
			MCRow bind = MCRow.create();
			String[] bindArrSchd = arrSchdL.groupBy(Srch01_IoR.$arr_schd_no)
					.getStringNE(Srch01_IoR.$arr_schd_no).toArray(new String[0]);
			bind.setStringNE(Srch01_IoR.$arr_schd_no,
					MCStringUtil.arrayValueJoin(bindArrSchd));
			executeQuery(arrActL, MSBBL1340_ARR_ACT_S02(), bind);

			// 入荷実績情報に入荷予定情報をコピー
			MCJoinKey<MCList<Srch01_IoR>> jk = arrActL.join(Srch01_IoR.$arr_schd_no,
					arrSchdL, Srch01_IoR.$arr_schd_no);
			join(arrActL, jk, createMap_Srch01_IoR_Srch01_IoR());

			MCIndexKey idxKeyArrSchd = arrSchdL.createIndex(Srch01_IoR.$arr_pr_no);
			MCIndexKey idxKeyArrAct = arrActL.createIndex(Srch01_IoR.$arr_schd_no);

			for (Srch01_DtlR parDtl : down1()) {

				// 売上返品予定明細に紐づく入荷予定を抽出
				MCList<Srch01_IoR> chdArrSchdL = arrSchdL.subList(idxKeyArrSchd,
						parDtl.toArray(Srch01_DtlR.$arr_pr_no));

				for (Srch01_IoR chdArrSchd : chdArrSchdL) {

					// 入荷予定に紐づく入荷実績を抽出
					MCList<Srch01_IoR> chdArrActL = arrActL.subList(idxKeyArrAct,
							chdArrSchd.toArray(Srch01_IoR.$arr_schd_no));

					// 1.入荷済未計上分の入荷実績
					for (Srch01_IoR chdArrAct : chdArrActL) {

						// 入荷済数量 - 売上返品済数量 > 0 の場合は対象とする
						MCNumber remainQty = chdArrAct.arr_qty().subtract(
								chdArrAct.sls_ret_qty());
						if (remainQty.isPositive()) {
							chdArrAct.base_unit_qty(remainQty);
							chdArrAct.schd_qty(remainQty);
							setBase2TrdUnitQty(chdArrAct);
							down2Rslt.add(chdArrAct);
						}
					}

					// 2.予定残の入荷予定
					if (chdArrSchd.schd_qty().isPositive()) {
						chdArrSchd.base_unit_qty(chdArrSchd.schd_qty());
						setBase2TrdUnitQty(chdArrSchd);
						down2Rslt.add(chdArrSchd);
					}
				}

				down2().setAll(down2Rslt);

				// 入荷予定明細の予定数、取引数量の計算
				parDtl.schd_qty(parDtl.base_unit_qty().subtract(parDtl.sls_ret_qty()));

				// 予定数量と同数を基準単位に上書き
				parDtl.base_unit_qty(parDtl.schd_qty());
				// 取引単位の設定 (基準単位から換算）
				setBase2TrdUnitQty(parDtl);
			}
			down2().sort(Srch01_IoR.$arr_schd_no);
			return down2().size();
		}

		@Override
		protected void doEditDown() {
			super.doEditDown();
			// 明細行IDの設定
			setDtlRowId();
			
			// 入荷実績ＮＯの設定
			setDtlArrActNo();
			
			// 金額計算
			calcAmt();
			
			setCurUpriAmt(down0(), down1());

			setCostAmt(down1());
			
			calcProfRate(down0(), down1());

		}

		protected void calcAmt() {
			
			// 共通ユーティリティを用いて予定金額をベースに算出
			MSUCL_ConvQtyAmtUtil.ConvQtyAmtUtil_Calc02 ope = MSUCL_ConvQtyAmtUtil.crtConvQtyAmtUtil_Calc02();

			int i = 0;
			setPegNo(down1());

			for (Srch01_DtlR dtl : down1()) {

				ConvQtyAmtUtil_Calc01_HdrR opeHdr = ope.up0().createRow();
				opeHdr.peg_no(i++);
				
				if (!dtl.inc_tax_flg() && !dtl.tax_fix_flg() && !isSame(dtl.tax_cd(), dtl.new_tax_cd())) {
					dtl.tax_cd(dtl.new_tax_cd());
					dtl.tax_nm(dtl.new_tax_nm());
					dtl.tax_rate(dtl.new_tax_rate());
					dtl.tax_typ(dtl.new_tax_typ());
					dtl.inc_tax_flg(dtl.new_inc_tax_flg());
				}
				
				copy(opeHdr, dtl, createMap_ConvQtyAmtUtil_Calc01_HdrR_Srch01_DtlR(down0()));
				
				ope.up0().add(opeHdr);
				MCList<Srch01_DtlR> l = down1().createInstance();
				l.add(dtl);
				addAll(ope.up1(), l, createMap_ConvQtyAmtUtil_Calc01_Dtl1R_Srch01_DtlR(opeHdr.peg_no()));
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

			}
		}

		/**
		 * 原価単価の取得
		 * @param dtlL
		 */
		protected void setCostAmt(MCList<Srch01_DtlR> dtlL) {

			for (Srch01_DtlR dtlR : dtlL) {
				// 原価金額は入荷数量と原価単価で求める。
				dtlR.cost_amt(MSUCL_SlsUtil.getCostAmt(dtlR.cost_upri(), dtlR.base_unit_qty(), getBaseCur().amt_dec_place())); //原価金額
			}

		}

		/**
		 * 	下り電文の編集
		 * 	<p>
		 * 	詳細の取引単位、取引数量の設定（基準単位数量から換算可能か判定する）<br>
		 * 	詳細の数量のサマリを明細の取引数量に設定する<br>
		 * 	明細の表示順を設定
		 * 	</p>
		 */
		protected void setDown() {

			int i = 1;
			for (Srch01_DtlR dtlR : down1()) {
				dtlR.disp_seq(i++);
			}

		}

		/**
		 * 	明細行IDの設定
		 * <p>
		 * 	明細と詳細の紐付けのキー情報は入荷進捗ＮＯNO<br>
		 * 	一応紐付けキー情報はクライアントへ送信しているが、今のところ不使用
		 * 	(以降はdtl_row_idで紐付ける)
		 * </p>
		 */
		protected void setDtlRowId() {

			MCIndexKey idxKey = down2().createIndex(Srch01_IoR.$arr_pr_no);
			int i = 1;
			for (Srch01_DtlR r : down1()) {
				r.dtl_row_id(i);
				MCList<Srch01_IoR> ioL = down2().subList(idxKey, r.arr_pr_no());
				ioL.setNumberNE(Srch01_IoR.$dtl_row_id, i);
				i++;
			}
		}
		
		/**
		 * 	入荷実績ＮＯの設定
		 * <p>
		 * 	明細に紐付く詳細が1行の場合は明細に入荷実績ＮＯを設定する。 　　
		 * </p>
		 */
		protected void setDtlArrActNo() {

			MCIndexKey idxKey = down2().createIndex(Srch01_IoR.$arr_pr_no);
			for (Srch01_DtlR r : down1()) {
				MCList<Srch01_IoR> ioL = down2().subList(idxKey, r.arr_pr_no());
				if (ioL.size() == 1) {
					r.arr_act_no(ioL.get(0).arr_act_no());
				}
			}
		}

		/**
		 * RowMapper<br>
		 * 	下り電文(Srch01_IoR) -> 下り電文(Srch01_IoR)
		 * @return
		 */
		protected Map_Srch01_IoR_Srch01_IoR<Srch01_IoR, Srch01_IoR> createMap_Srch01_IoR_Srch01_IoR() {
			return new Map_Srch01_IoR_Srch01_IoR<Srch01_IoR, Srch01_IoR>();
		}

		public class Map_Srch01_IoR_Srch01_IoR<D extends Srch01_IoR, S extends Srch01_IoR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch01_IoR.$base_unit_cd, Srch01_IoR.$base_unit_cd);
				addColumnPathMap(Srch01_IoR.$base_unit_nm, Srch01_IoR.$base_unit_nm);
				addColumnPathMap(Srch01_IoR.$base_unit_dec_place,
						Srch01_IoR.$base_unit_dec_place);
				addColumnPathMap(Srch01_IoR.$base_unit_rnd_typ,
						Srch01_IoR.$base_unit_rnd_typ);
				addColumnPathMap(Srch01_IoR.$lot_mng_typ, Srch01_IoR.$lot_mng_typ);
				addColumnPathMap(Srch01_IoR.$lot_no_typ, Srch01_IoR.$lot_no_typ);
				addColumnPathMap(Srch01_IoR.$sublot_mng_typ, Srch01_IoR.$sublot_mng_typ);
				addColumnPathMap(Srch01_IoR.$sublot_no_typ, Srch01_IoR.$sublot_no_typ);
				addColumnPathMap(Srch01_IoR.$sno1_mng_typ, Srch01_IoR.$sno1_mng_typ);
				addColumnPathMap(Srch01_IoR.$sno2_mng_typ, Srch01_IoR.$sno2_mng_typ);
				addColumnPathMap(Srch01_IoR.$sno3_mng_typ, Srch01_IoR.$sno3_mng_typ);
				addColumnPathMap(Srch01_IoR.$sno4_mng_typ, Srch01_IoR.$sno4_mng_typ);
				addColumnPathMap(Srch01_IoR.$itm_cd, Srch01_IoR.$itm_cd);
				addColumnPathMap(Srch01_IoR.$itm_sub1, Srch01_IoR.$itm_sub1);
				addColumnPathMap(Srch01_IoR.$itm_sub2, Srch01_IoR.$itm_sub2);
				addColumnPathMap(Srch01_IoR.$itm_sub3, Srch01_IoR.$itm_sub3);
				addColumnPathMap(Srch01_IoR.$stk_mng_typ, Srch01_IoR.$stk_mng_typ);
				addColumnPathMap(Srch01_IoR.$arr_pr_no, Srch01_IoR.$arr_pr_no);
				addColumnPathMap(Srch01_IoR.$arr_schd_no, Srch01_IoR.$arr_schd_no);
				addColumnPathMap(Srch01_IoR.$dtl_row_id, Srch01_IoR.$dtl_row_id);
				addColumnPathMap(Srch01_IoR.$arr_pr_upd_cntr, Srch01_IoR.$arr_pr_upd_cntr);
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
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_cd,
						Srch01_DtlR.$schd_trd_unit_cd);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_qty,
						Srch01_DtlR.$schd_trd_unit_qty);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_upri,
						Srch01_DtlR.$trd_cur_upri);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_dscnt_amt,
						Srch01_DtlR.$trd_cur_dscnt_amt);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_amt,
						Srch01_DtlR.$trd_cur_amt);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_tax_amt,
						Srch01_DtlR.$trd_cur_tax_amt);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_inc_tax_amt,
						Srch01_DtlR.$trd_cur_inc_tax_amt);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$base_unit_dec_place,
						Srch01_DtlR.$base_unit_dec_place);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$base_unit_rnd_typ,
						Srch01_DtlR.$base_unit_rnd_typ);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_conv_qty,
						Srch01_DtlR.$schd_trd_unit_conv_qty);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_conv_base_qty,
						Srch01_DtlR.$schd_trd_unit_conv_base_qty);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$tax_rate,
						Srch01_DtlR.$schd_tax_rate);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$inc_tax_flg,
						Srch01_DtlR.$schd_inc_tax_flg);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$act_tax_rate,
						Srch01_DtlR.$tax_rate);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$act_inc_tax_flg,
						Srch01_DtlR.$inc_tax_flg);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$schd_base_unit_qty,
						Srch01_DtlR.$init_schd_qty);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.trd_cur_inc_tax_amt(src.trd_cur_amt().add(src.trd_cur_tax_amt()));
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
				addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_qty, Srch01_DtlR.$trd_unit_qty);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_cd, Srch01_DtlR.$trd_unit_cd);
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
	}

	/**
	 * Srch02オペレーション.<p>
	 *
	 * 売上実績ＮＯから売上返品予定情報を検索します。<br>
	 */
	public class Srch02 extends MSBBL_SlsRetReg_MC_A.Srch02 {
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

			int cnt2 =srchDtl();
			if (isSame(cnt2, 0)) {
				down0().clear();
				down1().clear();
				return;
			}
			int cnt3 =srchIo();
			if (isSame(cnt3, 0)) {
				down0().clear();
				down1().clear();
				down2().clear();
			}
			setDown();
		}

		protected void editCnd() {
			up0().setDateNE("today", getToday());
		}

		protected int srchHdr() {
			return executeQuery(down0(), MSBBL1340_SLS_ACT_S01(), up0());
		}

		protected int srchDtl() {
			MCList<Srch01_DtlR> dtlL = MCList.create(Srch01_DtlR.class);
			executeQuery(dtlL, MSBBL1340_SLS_ACT_D_S01(), up0());
			down1().setAll(dtlL.subList(Srch01_DtlR.$sls_cststk_flg, false));
			return down1().size();
		}
		
		protected int srchIo() {
			return executeQuery(down2(), MSBBL1340_SLS_ACT_IO_S01(), up0());
		}

		@Override
		protected void doEditDown() {
			super.doEditDown();

			// 明細行IDの設定
			setDtlRowId(down1(), down2());
			
			setCurUpriAmt(down0(), down1());
			
			calcProfRate(down0(), down1());
			
			setPurcRetTgt(down0(), down1());

		}
		
		protected void setTrd() {
			
			String trdCd = execFuncString(createSqlId(LOGIC_ID, "MAPA_UTIL$F_GET_DEF_TRD_CD", "01"),
					MAPA_UTIL$F_GET_DEF_TRD_CD(value(MAC_TRD_PTN_TYP.SLS_RTN.value())));
			MAM_TRD_R db = MAM_TRD_R.create("T");
			dbSelectKey("MSBBL1340_MAM_TRD_S01", db, MCQueryApiBuilder.create(db), trdCd);
			
			down0().trd_cd(db.trd_cd());
			down0().trd_nm(db.trd_nm());
			down0().trd_ptn_typ(MAC_TRD_PTN_TYP.SLS_RTN.value());
		}

		/**
		 * 	下り電文の編集
		 * 	<p>
		 * 	詳細の取引単位、取引数量の設定（基準単位数量から換算可能か判定する）<br>
		 * 	詳細の数量のサマリを明細の取引数量に設定する<br>
		 * 	明細の表示順を設定
		 * 	</p>
		 */
		protected void setDown() {
			
			setTrd();

			// 表示順の再設定
			int i = 1;
			for (Srch01_DtlR dtlR : down1()) {
				dtlR.disp_seq(i++);
			}

		}

		/**
		 * 	明細行IDの設定
		 * <p>
		 * 	明細と詳細の紐付けのキー情報は　参照売上実績明細NO<br>
		 * 	一応紐付けキー情報はクライアントへ送信しているが、今のところ不使用
		 * 	(以降はdtl_row_idで紐付ける)
		 * </p>
		 */
		protected void setDtlRowId(MCList<Srch01_DtlR> dtl, MCList<Srch01_IoR> io) {

			MCIndexKey idxKey = io.createIndex(Srch01_IoR.$ref_sls_act_d_no);
			int i = 1;
			for (Srch01_DtlR r : dtl) {
				r.dtl_row_id(i);
				MCList<Srch01_IoR> ioL = io.subList(idxKey, r.ref_sls_act_d_no());
				ioL.setNumberNE(Srch01_IoR.$dtl_row_id, i);
				i++;
			}
		}
	}

	/**
	 * Srch03オペレーション.<p>
	 *
	 * 売上返品実績ＮＯから売上返品実績情報を検索します。<br>
	 */
	public class Srch03 extends MSBBL_SlsRetReg_MC_A.Srch03 {
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
			int cnt2 =srchDtl();
			if (isSame(cnt2, 0)) {
				down0().clear();
				down1().clear();
				return;
			}
			int cnt3 =srchIo();
			if (isSame(cnt3, 0)) {
				down0().clear();
				down1().clear();
				down2().clear();
			}
			
			setDown();
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

			up0().setDateNE("today", getToday());
		}

		protected int srchHdr() {
			return executeQuery(down0(), MSBBL1340_SLS_ACT_S02(), up0());
		}

		protected int srchDtl() {
			return executeQuery(down1(), MSBBL1340_SLS_ACT_D_S02(), down0());
		}
		
		protected int srchIo() {
			return executeQuery(down2(), MSBBL1340_SLS_ACT_IO_S02(), down0());
		}

		@Override
		protected void doEditDown() {
			super.doEditDown();

			// 明細行IDの設定
			setDtlRowId(down1(), down2());
			
			calcProfRate(down0(), down1());
			
			setPurcRetTgt(down0(), down1());
		}

		/**
		 * 	下り電文の編集
		 * 	<p>
		 * 	詳細の取引単位、取引数量の設定（基準単位数量から換算可能か判定する）<br>
		 * 	詳細の数量のサマリを明細の取引数量に設定する<br>
		 * 	明細の表示順を設定
		 * 	</p>
		 */
		protected void setDown() {

			int i = 1;
			for (Srch01_DtlR r : down1()) {
				// 入荷連絡備考の設定
				r.arr_act_no(getArrAct(up0().srch_tgt_no()));

				r.disp_seq(i++);
			}
			
			down0().latest_flg(getLatestFlg());
		}

		protected String getArrAct(String key) {
			MCList<MST_ARR_ACT_R> arr = MCList.create(MST_ARR_ACT_R.class);
			MST_ARR_ACT_R t = MST_ARR_ACT_R.create("T");
			MCQueryApiBuilder arr_bldr = MCQueryApiBuilder.create(t);
			MST_SLS_ACT_IO_R t1 = MST_SLS_ACT_IO_R.create("T1");
			MST_SLS_ACT_D_R t2 = MST_SLS_ACT_D_R.create("T2");
			arr_bldr.setSelect(t.arr_act_no);
			arr_bldr.addInnerJoin(t1, t.arr_act_no.eq(t1.arr_act_no));
			arr_bldr.addInnerJoin(t2, t1.sls_act_d_no.eq(t2.sls_act_d_no));
			arr_bldr.setWhere(t2.sls_act_no.eq(bind("1")), key);
			dbSelect("MSBBL1340_MST_ARR_ACT_S01", arr, arr_bldr);
			//入荷実績の検索結果が1件の場合のみ入荷実績ＮＯをセットする
			if (isSame(arr.size(), 1)) {
				return arr.get(0).arr_act_no();
			}
			return null;
		}

		/**
		 * 	明細行IDの設定
		 * <p>
		 * 	明細と詳細の紐付けのキー情報は　売上実績明細NO<br>
		 * 	一応紐付けキー情報はクライアントへ送信しているが、今のところ不使用
		 * 	(以降はdtl_row_idで紐付ける)
		 * </p>
		 */
		protected void setDtlRowId(MCList<Srch01_DtlR> dtl, MCList<Srch01_IoR> io) {

			MCIndexKey idxKey = io.createIndex(Srch01_IoR.$sls_act_d_no);
			int i = 1;
			for (Srch01_DtlR r : dtl) {
				r.dtl_row_id(i);
				MCList<Srch01_IoR> ioL = io.subList(idxKey, r.sls_act_d_no());
				ioL.setNumberNE(Srch01_IoR.$dtl_row_id, i);
				i++;
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
	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 売上返品予定情報を新規登録・訂正前チェックをします。<br>
	 */
	public class Chk01 extends MSBBL_SlsRetReg_MC_A.Chk01 {

		/** 売上実績*/
		MST_SLS_ACT_R _slsAct = MST_SLS_ACT_R.create("T");

		/** 売上実績明細 */
		MCList<MST_SLS_ACT_D_R> _slsActDL = MCList.create(MST_SLS_ACT_D_R.class);
		MST_SLS_ACT_D_R _slsActDL_t = MST_SLS_ACT_D_R.create("T");
		MCQueryApiBuilder _slsActDL_bldr = MCQueryApiBuilder.create(_slsActDL_t);

		/** 売上実績受払 */
		MCList<MST_SLS_ACT_IO_R> _slsActIoL = MCList.create(MST_SLS_ACT_IO_R.class);

		/** 売上返品予定 */
		MST_SLS_RET_SCHD_R _slsRetSchd = MST_SLS_RET_SCHD_R.create("T");

		/** 売上返品予定明細 */
		MCList<MST_SLS_RET_SCHD_D_R> _slsRetSchdDL = MCList.create(MST_SLS_RET_SCHD_D_R.class);

		/** 発注ヘッダ */
		MCList<MST_PO_R> _poL = MCList.create(MST_PO_R.class);

		/** 受注ヘッダ */
		MCList<MST_SLO_R> _sloL = MCList.create(MST_SLO_R.class);

		/** 受注明細 */
		MCList<MST_SLO_D_R> _sloDL = MCList.create(MST_SLO_D_R.class);

		/** 仕入実績明細 */
		MCList<MST_PURC_ACT_D_R> _purcActDL = MCList.create(MST_PURC_ACT_D_R.class);

		/** 仕入実績受払 */
		MCList<MST_PURC_ACT_IO_R> _purcActIoL = MCList.create(MST_PURC_ACT_IO_R.class);

		/** 仕入返品実績受払 */
		MCList<MST_PURC_RET_ACT_IO_R> _purcRetActIoL = MCList.create(MST_PURC_RET_ACT_IO_R.class);

		/** 仕入返品実績ヘッダ */
		MCList<MST_PURC_RET_ACT_R> _purcRetActL = MCList.create(MST_PURC_RET_ACT_R.class);

		/** 納品伝票明細 */
		MCList<MST_DLV_SLIP_D_R> _dlvSlipDL = MCList.create(MST_DLV_SLIP_D_R.class);

		/** 入荷実績 */
		MCList<MST_ARR_ACT_R> _arrActL = MCList.create(MST_ARR_ACT_R.class);

		/** 入荷進捗 */
		MCList<MST_ARR_PR_R> _arrPrL = MCList.create(MST_ARR_PR_R.class);

		/** 入荷予定 */
		MCList<MST_ARR_SCHD_R> _arrSchdL = MCList.create(MST_ARR_SCHD_R.class);

		/** 部門マスタ */
		MAM_DPT_R _dpt = MAM_DPT_R.create();

		/** 取引先マスタ */
		MAM_TTERM_R _tterm = MAM_TTERM_R.create();

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			initCache();
			editUp();
			super.doIt();
			setDown();
		}
		
		/**
		 * 各部門組織変更対応
		 */
		protected void editUp() {
			// 売上部門
			MAUCL_DptUtil.setDpt(up0(), Chk01_HdrR.$sls_dpt_cd, Chk01_HdrR.$ac_dt);
			
			// 債権部門
			MAUCL_DptUtil.setDpt(up0(), Chk01_HdrR.$ar_dpt_cd, Chk01_HdrR.$ac_dt);
			
			up1().addDateColumn(Chk01_HdrR.$ac_dt);
			up1().setDateNE(Chk01_HdrR.$ac_dt, up0().ac_dt());
			// 負担部門
			MAUCL_DptUtil.setDpt(up1(), Chk01_DtlR.$bd_dpt_cd, null, Chk01_HdrR.$ac_dt, true);
			if (up1().subList("err_flg", true).size() > 0) {
				MCAppException ex = new MCAppException(MCMessagePool.getMessageList().get(0));
				MCMessagePool.removeAll(MCMessagePool.getMessageList());
				throw ex;
			}
			
			// 債務部門
			MAUCL_DptUtil.setDpt(up1(), Chk01_DtlR.$ap_dpt_cd, null, Chk01_HdrR.$ac_dt, true);
			if (up1().subList("err_flg", true).size() > 0) {
				MCAppException ex = new MCAppException(MCMessagePool.getMessageList().get(0));
				MCMessagePool.removeAll(MCMessagePool.getMessageList());
				throw ex;
			}
		}

		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().addAll(up1());
			down2().addAll(up2());
		}

		@Override
		protected MCMessageList doServerCheckBase() {

			MCMessageList msgL = super.doServerCheckBase();

			// 更新カウンタチェック、排他ロック獲得
			msgL.addAll(lockAndCheckBase());

			if (!msgL.isEmpty()) {
				return msgL;
			}

			// 補完処理
			compHdrBase();
			compDtlBase();
			compIoBase();

			return msgL;
		}

		protected MCMessageList lockAndCheckBase() {
			MCMessageList msgL = new MCMessageList();

			// 売上実績
			msgL.addAll(lockAndCheckSlsAct());

			// 売上返品予定
			msgL.addAll(loclAndCheckSlsRetSchd());

			msgL.addAll(lockAndCheckArrPr());

			msgL.addAll(lockAndCheckArrAct());

			return msgL;
		}

		/**
		 * 	売上実績排他ロック・更新カウンタチェック
		 * @return
		 */
		protected MCMessageList lockAndCheckSlsAct() {
			MCMessageList msgL = new MCMessageList();

			if (!isNull(up0().sls_act_no())) {

				MCQueryApiBuilder slsAct_bldr = MCQueryApiBuilder.create(_slsAct);
				dbSelectKeyForUpdateNoWait("MSBBL1340_MST_SLS_ACT_S01", _slsAct, slsAct_bldr, up0());
				msgL.addAll(checkUpdCntrNE(up0(), Chk01_HdrR.$upd_cntr, _slsAct));
				dbTsUpdateKey("MSBBL1340_MST_SLS_ACT_U01", _slsAct, slsAct_bldr.getBaseDbc());
				if (hasErr()) {
					return msgL;
				}

				// 改訂番号を補完
				up0().sls_act_rev(_slsAct.sls_act_rev());

				dbSelectKey("MSBBL1340_MST_SLS_ACT_D_S01", _slsActDL, _slsActDL_bldr, up1());
				MCIndexKey idxkeyActD = _slsActDL.createIndex(_slsActDL_bldr.getBaseDbc().getKeyColumn());

				MCQueryApiBuilder slsActIoL_bldr = MCQueryApiBuilder.create(MST_SLS_ACT_IO_R.create("T"));
				dbSelectKey("MSBBL1340_MST_SLS_ACT_IO_S01", _slsActIoL, slsActIoL_bldr, up2());
				MCIndexKey idxkeyActIo = _slsActIoL.createIndex(slsActIoL_bldr.getBaseDbc().getKeyColumn());

				for (Chk01_DtlR parDtlR : up1()) {
					if (!isNull(parDtlR.sls_act_d_no())) {
						MST_SLS_ACT_D_R slsActD = _slsActDL.getFirst(idxkeyActD,
								parDtlR.toArray(_slsActDL_bldr.getBaseDbc().getKeyColumn()));
						if (isNull(slsActD)) {
							msgL.addAll(getRecordNotFoundMsg(getModuleID(),
									_slsActDL_bldr.getBaseDbc().tableName(), _slsActDL_bldr.getBaseDbc().getKeyColumn(),
									parDtlR.toArray(_slsActDL_bldr.getBaseDbc().getKeyColumn()), parDtlR));
						}
						else {
							// 念のためチェック
							if (!isSame(slsActD.sls_act_no(), up0().sls_act_no())) {
								msgL.addAll(getRecordInvalidMsg(Chk01_HdrR.$sls_act_no,
										slsActD.sls_act_no(), parDtlR));
							}
							else if (!isSame(slsActD.sls_act_seq(), up0().sls_act_seq())) {
								msgL.addAll(getRecordInvalidMsg(Chk01_HdrR.$sls_act_seq,
										slsActD.sls_act_seq(), parDtlR));
							}

						}

						for (Chk01_IoR chdIoR : getChildIoL(up2(), parDtlR)) {
							if (!isNull(chdIoR.sls_act_io_no())) {
								MST_SLS_ACT_IO_R slsActIo = _slsActIoL.getFirst(
										idxkeyActIo,
										chdIoR.toArray(slsActIoL_bldr.getBaseDbc().getKeyColumn()));
								if (isNull(slsActIo)) {
									msgL.addAll(getRecordNotFoundMsg(getModuleID(),
											slsActIoL_bldr.getBaseDbc().tableName(),
											slsActIoL_bldr.getBaseDbc().getKeyColumn(),
											chdIoR.toArray(_slsActDL_bldr.getBaseDbc().getKeyColumn()),
											chdIoR));
								}
								else {
									// 念のためチェック
									if (!isSame(slsActIo.sls_act_d_no(),
											parDtlR.sls_act_d_no())) {
										msgL.addAll(getRecordInvalidMsg(
												Chk01_DtlR.$sls_act_d_no,
												slsActIo.sls_act_d_no(), chdIoR));
									}
									else if (!isSame(slsActIo.sls_act_d_seq(),
											parDtlR.sls_act_d_seq())) {
										msgL.addAll(getRecordInvalidMsg(
												Chk01_DtlR.$sls_act_d_seq,
												slsActIo.sls_act_d_seq(), chdIoR));

									}
									else {
										// 売上実績受払から補完
										chdIoR.purc_act_io_no(slsActIo.purc_act_io_no());
										chdIoR.arr_act_no(slsActIo.arr_act_no());
										chdIoR.sls_ret_schd_d_no(parDtlR
												.sls_ret_schd_d_no());
									}
								}
							}
						}
					}
				}
			}

			return msgL;
		}

		protected MCMessageList loclAndCheckSlsRetSchd() {

			MCMessageList msgL = new MCMessageList();

			if (!isNull(up0().sls_ret_schd_no())) {
				MCQueryApiBuilder slsRetSchd_bldr = MCQueryApiBuilder.create(_slsRetSchd);
				dbSelectKeyForUpdate("MSBBL1340_MST_SLS_RET_SCHD_S01", _slsRetSchd, slsRetSchd_bldr, up0());
				msgL.addAll(checkUpdCntrNE(up0(), Chk01_HdrR.$upd_cntr_sls_ret_schd, _slsRetSchd));
				dbTsUpdateKey("MSBBL1340_MST_SLS_RET_SCHD_U01", _slsRetSchd, slsRetSchd_bldr.getBaseDbc());
				if (hasErr()) {
					return msgL;
				}

				MCQueryApiBuilder slsRetSchdDL_bldr = MCQueryApiBuilder.create(MST_SLS_RET_SCHD_D_R.create("T"));
				dbSelectKey("MSBBL1340_MST_SLS_RET_SCHD_D_S01", _slsRetSchdDL, slsRetSchdDL_bldr, up1());
				MCIndexKey idxkey = _slsRetSchdDL.createIndex(slsRetSchdDL_bldr.getBaseDbc().getKeyColumn());
				MCIndexKey idxKey2 = up2().createIndex(Chk01_IoR.$dtl_row_id);
				
				for (Chk01_DtlR parDtlR : up1()) {
					if (isNull(parDtlR.sls_ret_schd_d_no())) {
						continue;
					}
					
					MST_SLS_RET_SCHD_D_R slsRetSchdD = _slsRetSchdDL.getFirst(idxkey,
							parDtlR.toArray(slsRetSchdDL_bldr.getBaseDbc().getKeyColumn()));

					if (isNull(slsRetSchdD)) {
						msgL.addAll(getRecordNotFoundMsg(getModuleID(),
								slsRetSchdDL_bldr.getBaseDbc().tableName(), slsRetSchdDL_bldr.getBaseDbc().getKeyColumn(),
								parDtlR.toArray(_slsActDL_bldr.getBaseDbc().getKeyColumn()), parDtlR));
					}
					else {

						if (!isSame(slsRetSchdD.sls_ret_schd_no(), up0()
								.sls_ret_schd_no())) {
							msgL.addAll(getRecordInvalidMsg(Chk01_DtlR.$sls_ret_schd_no,
									parDtlR.sls_act_d_no(), parDtlR));
						}
						else {
							parDtlR.io_schd_pr_no(slsRetSchdD.io_schd_pr_no());
							
							// 売上返品予定から引き継いだ明細に対して、詳細に売上返品予定明細ＮＯを設定
							MCList<Chk01_IoR> ioL = up2().subList(idxKey2, parDtlR.dtl_row_id());
							ioL.setStringNE(Chk01_IoR.$sls_ret_schd_d_no, slsRetSchdD.sls_ret_schd_d_no());
						}
					}
				}

			}
			return msgL;
		}

		protected MCMessageList lockAndCheckArrPr() {

			MCList<Chk01_IoR> ioL = up2().subList(r -> !isNull(r.arr_pr_no()));

			MCList<MST_ARR_PR_R> arrPrL = MCList.create(MST_ARR_PR_R.class);
			MST_ARR_PR_R arrPrR = MST_ARR_PR_R.create("ARRPR");
			MCQueryApiBuilder arrPr_bldr = MCQueryApiBuilder.create(arrPrR);
			arrPr_bldr.setSelect(arrPrR.arr_pr_no, arrPrR.upd_cntr);
			arrPr_bldr.setOrderByAsc(arrPrR.arr_pr_no);
			dbSelectKeyForUpdateNoWait("MSBBL1340_MST_ARR_PR_S02", arrPrL, arrPr_bldr, ioL);
			MCIndexKey slsRetSchdIdx = ioL.createIndex(MST_SLS_RET_SCHD_D_R.$sls_ret_schd_d_no);
			MCIndexKey arrPridx = arrPrL.createIndex(MST_ARR_PR_R.$arr_pr_no);

			MCMessageList msgL = new MCMessageList();
			for(Chk01_DtlR parDtlR : up1()) {
				MCList<Chk01_IoR> ioLSub = ioL.subList(slsRetSchdIdx, parDtlR.sls_ret_schd_d_no());
				for(Chk01_IoR ioR : ioLSub) {
					MST_ARR_PR_R lockR = arrPrL.getFirst(arrPridx, ioR.arr_pr_no());
					if(isNull(lockR)) {
						continue;
					}
					MCMessageList msgSub = checkUpdCntrNE(
							ioR, Chk01_IoR.$arr_pr_upd_cntr, lockR);
					if(!msgSub.isEmpty()) {
						msgL.addAll(msgSub);
						break;
					}
				}
			}
			return msgL;
		}

		protected MCMessageList lockAndCheckArrAct() {

			MCList<Chk01_IoR> ioL = up2().subList(r -> !isNull(r.arr_act_no()));

			MCList<MST_ARR_ACT_R> arrActL = MCList.create(MST_ARR_ACT_R.class);
			MST_ARR_ACT_R arrActR = MST_ARR_ACT_R.create("ARRACT");
			MCQueryApiBuilder arrAct_bldr = MCQueryApiBuilder.create(arrActR);
			arrAct_bldr.setSelect(arrActR.arr_act_no, arrActR.upd_cntr);
			arrAct_bldr.setOrderByAsc(arrActR.arr_act_no);
			dbSelectKeyForUpdateNoWait("MSBBL1340_MST_ARR_ACT_S06", arrActL, arrAct_bldr, ioL);
			MCIndexKey idx = arrActL.createIndex(MST_ARR_ACT_R.$arr_act_no);

			MCMessageList msgL = new MCMessageList();
			for (Chk01_IoR ioR : ioL) {
				MST_ARR_ACT_R lockR = arrActL.getFirst(idx, ioR.arr_act_no());
				if(isNull(lockR)) {
					continue;
				}
				msgL.addAll(
					checkUpdCntrNE(
						ioR, Chk01_IoR.$arr_act_upd_cntr, lockR));
			}
			return msgL;

		}

		/**
		 * ヘッダ情報の補完（定型チェック実施前）
		 */
		protected void compHdrBase() {

			// 基準通貨
			up0().base_cur_cd(getCo().base_cur_cd());
			// 納税通貨
			up0().ptax_cur_cd(getCo().ptax_cur_cd());
			// 為替レートＣＤ
			up0().xrate_cd(getCo().sls_xrate_cd());
		}

		/**
		 * 明細情報の補完（定型チェック実施前）
		 */
		protected void compDtlBase() {
			// 何もしない
		}

		/**
		 * 	詳細情報の補完(定型チェック実施前)
		 */
		protected void compIoBase() {

			MCIndexKey idxKey = up2().createIndex(Chk01_IoR.$dtl_row_id);
			for (Chk01_DtlR r : up1()) {
				MCList<Chk01_IoR> ioL = up2().subList(idxKey, r.dtl_row_id());
				for (Chk01_IoR r2 : ioL) {
					r2.itm_cd(r.itm_cd());
					r2.itm_sub1(r.itm_sub1());
					r2.itm_sub2(r.itm_sub2());
					r2.itm_sub3(r.itm_sub3());
				}
			}
		}

		@Override
		protected MCMessageList doServerCheck() {
			MCMessageList msgL = new MCMessageList();
			if (hasErrFlgOn(up0(), up1(), up2())) {
				return msgL;
			}
			
			msgL.addAll(super.doServerCheck());
			
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

			// 補完処理
			compHdrSub();
			compDtlSub();
			compIoSub();

			// DAC更新権限チェック
			msgL.addAll(checkWritableDptCdDac(up0(), Chk01_HdrR.$sls_dpt_cd));

			// 訂正前の売上部門に対してDAC更新権限チェック
			if (!isNull(up0().sls_act_no()) && !isNull(_slsAct) && !isSame(up0().sls_dpt_cd(), _slsAct.sls_dpt_cd())) {
				msgL.addAll(checkWritableDptCdDac(_slsAct, MST_SLS_ACT_R.$sls_dpt_cd));
			}

			// 条件付き必須チェック
			msgL.addAll(checkReqSub());
			if (msgL.size() > 0) {
				return msgL;
			}

			// 条件付き存在チェック
			msgL.addAll(checkExistsSub());
			
			// 有効明細行数チェック
			msgL.addAll(checkAtLeastOneDtl(up0(), up1()));
			msgL.addAll(checkAtLeastOneIo(up1(), up2()));

			// 固有チェック
			msgL.addAll(checkOther());

			// 入荷実績チェックサービス呼出
			callArrActSvChk01();

			return msgL;
		}

		/**
		 * 	キャッシュの生成
		 */
		protected void initCache() {
			initBpCache();
			initPurcActCache(up1());
			initPurcActDCache(up1());
			initTaxCache();
			initCurCache();
		}

		/**
		 * 	条件付き必須チェック
		 * @return
		 */
		protected MCMessageList checkReqSub() {
			MCMessageList msgL = new MCMessageList();

			//登録

			// インボイスＮＯ,入金予定日
			// インボイス取引ＦＬＧがオンの場合は必須
			if (up0().cst_iv_flg()) {
				if (!up0().num_flg()) {
					msgL.addAll(check(up0(), Chk01_HdrR.$iv_no, new FXUCL_RequiredValidater()));
				}
				if (MAC_BILL_CL_TYP.isEACH_SLS(up0().bill_cl_typ())) {
					msgL.addAll(check(up0(), Chk01_HdrR.$rcv_schd_dt, new FXUCL_RequiredValidater()));
				}
			}
			
			if (!MAC_BILL_CL_TYP.isEACH_SLS(up0().bill_cl_typ())) {
				//請求起算日
				// 売上都度請求以外の場合は必須
				msgL.addAll(check(up0(), Chk01_HdrR.$bill_basis_dt, new FXUCL_RequiredValidater()));
			}

			for (Chk01_DtlR r : up1().subList(CREATE, MODIFY, NONE)) {

				// 品名
				// 諸口品ＦＬＧがオンの場合必須
				if (r.sundry_itm_flg()) {
					msgL.addAll(check(r, Chk01_DtlR.$itm_nm,
							new FXUCL_RequiredValidater()));
				}

				// インボイス表記品名
				// インボイス取引ＦＬＧがオンで諸口品ＦＬＧがオンの場合必須
				if (up0().cst_iv_flg() && r.sundry_itm_flg()) {
					msgL.addAll(check(r, Chk01_DtlR.$iv_itm_nm,
							new FXUCL_RequiredValidater()));
				}

				// 仕入返品理由、債務部門
				//仕入直送(仕入実績ＮＯあり)の場合は必須
				if (!isNull(r.purc_act_d_no())) {
					msgL.addAll(check(r, Chk01_DtlR.$purc_ret_rsn_cd,
							new FXUCL_RequiredValidater()));
					
					msgL.addAll(check(r, Chk01_DtlR.$ap_dpt_cd,
							new FXUCL_RequiredValidater()));
					
					MST_PURC_ACT_R purcActR = getPurcActCache(r.purc_act_no());
					if (purcActR.getBooleanNE(MAM_BP_R.$sppl_iv_flg) 
							&& purcActR.getBooleanNE(MAM_BP_R.$pay_spot_flg)) {
						msgL.addAll(check(r, Chk01_DtlR.$pay_schd_dt,
								new FXUCL_RequiredValidater()));
					}
				}

				// 値引理由
				// 値引額が指定時は必須
				if (!isNull(r.trd_cur_dscnt_amt())) {
					msgL.addAll(check(r, Chk01_DtlR.$dscnt_rsn_cd,
							new FXUCL_RequiredValidater()));
				}

				// 負担部門
				// 返品理由の販売他勘定ＦＬＧがオンの場合必須
				if (r.sls_acxfr_flg()) {
					msgL.addAll(check(r, Chk01_DtlR.$bd_dpt_cd,
							new FXUCL_RequiredValidater()));
				}
			}

			//詳細
			for (Chk01_IoR r : up2().subList(CREATE, MODIFY, NONE)) {

				//ロットＮＯ
				//品目がロット管理対象の場合。
				if (MAC_LOT_MNG_TYP.req_lot(r.lot_mng_typ())) {
					msgL.addAll(check(r, Chk01_IoR.$lot_no,
							new FXUCL_RequiredValidater()));
				}
				else {
					r.lot_no(MAC_STR.NULL_VAL.value());
				}

				//サブロットＮＯ
				//品目がサブロット管理対象の場合。
				if (MAC_SUBLOT_MNG_TYP.req_lot(r.sublot_mng_typ())) {
					msgL.addAll(check(r, Chk01_IoR.$sublot_no,
							new FXUCL_RequiredValidater()));
				}
				else {
					r.sublot_no(MAC_STR.NULL_VAL.value());
				}

				// 版ＮＯ
				// 品目が版管理対象の場合
				if (r.ver_flg() && isNull(r.ver_no())) {
					msgL.addAll(check(r, Chk01_IoR.$ver_no,
							new FXUCL_RequiredValidater()));
				}
				
				if (!isNull(r.stk_mng_typ()) && !MAC_STK_MNG_TYP.isNOT_MNG(r.stk_mng_typ())) {
					msgL.addAll(check(r, Chk01_IoR.$gd_cd,	new FXUCL_RequiredValidater()));
				}
			}

			return msgL;
		}

		@Override
		protected void putListLogicCheckBind() {
			super.putListLogicCheckBind();

			ListLogicBind dlvBind = getListLogicBind(up1(), Chk01_DtlR.$dlv_cd);
			dlvBind.putBind(MAUAC_List.BpCols.$i_dt, up0().sls_ret_dt());
			
			ListLogicBind bdDptBind = getListLogicBind(up1(), Chk01_DtlR.$bd_dpt_cd);
			bdDptBind.putBind(MAUAC_List.DptCols.$i_dt, up0().ac_dt());
			
			ListLogicBind apDptBind = getListLogicBind(up1(), Chk01_DtlR.$ap_dpt_cd);
			apDptBind.putBind(MAUAC_List.DptCols.$i_dt, up0().ac_dt());

		}

		@Override
		protected boolean isSetListLogicValue(MCNumber paramIndex, MCRow row, String column) {
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

			for (Chk01_DtlR parDtl : dtlL) {
				MCList<Chk01_IoR> chdIoL = getChildIoL(ioL, parDtl).subList(Chk01_IoR.CREATE, Chk01_IoR.MODIFY, Chk01_IoR.NONE);
				if (!parDtl.isStatusDelete() && chdIoL.isEmpty()) {
					msgL.add(new MCMessage(parDtl, null, MAUDL0012,
							toDispGUIIndex(parDtl)));
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
			MCList<Chk01_DtlR> chkDtlL = up1().subList(CREATE, MODIFY, NONE);
			MCList<Chk01_IoR> chkIoL = up2().subList(CREATE, MODIFY, NONE);
			MCList<MCRow> lotChkL = MCList.create(MCRow.class);
			MCList<MCRow> lotChkIoL = MCList.create(MCRow.class);
			MCList<MCRow> lotChkIoLNE = MCList.create(MCRow.class);

			for (Chk01_DtlR r : chkDtlL) {

				if (!isNull(r.purc_act_d_no())) {
					// 仕入実績明細
					MST_PURC_ACT_D_R purcActD = getPurcActDCache(r.purc_act_d_no());
					if (isNull(purcActD)) {
						msgL.addAll(getRecordNotFoundMsg(getModuleID(), "MST_PURC_ACT_D",
								new String[] {
									MST_PURC_ACT_D_R.$purc_act_d_no
								}, new String[] {
									r.purc_act_d_no()
								}, r));
					}
				}

				//各種ＮＯの存在チェック
				msgL.addAll(dtlDbCheck(r));

			}

			for (Chk01_IoR r : chkIoL) {
				//各種ＮＯの存在チェック
				msgL.addAll(ioDbCheck(r));

				// ロット・サブロットチェック
				if (!isNullAnd(r.lot_no(), r.sublot_no())) {
					lotChkIoL.add(r);
				}
			}

			MCIndexKey idxKey = lotChkIoL.createIndex(Chk01_DtlR.$dtl_row_id);
			for (Chk01_DtlR parDtlR : up1()) {
				if (!parDtlR.err_flg()) {
					lotChkIoLNE.addAll(lotChkIoL.subList(idxKey, parDtlR.dtl_row_id()));
				}
			}

			// ロット・サブロットチェックはサービス呼出にて行う
			callLotSvChk03(lotChkL, lotChkIoLNE);

			return msgL;
		}

		//明細のＮＯ系存在チェック
		protected MCMessageList dtlDbCheck(Chk01_DtlR r) {
			MCMessageList msgL = new MCMessageList();

			//仕入直送発注ＮＯ
			if (!isNull(r.purc_ddlv_po_no())) {
				MST_PO_R poL_t = MST_PO_R.create("T");
				MCQueryApiBuilder poL_bldr = MCQueryApiBuilder.create(poL_t);
				poL_bldr.setWhere(poL_t.po_no.eq(bind("1")), r.purc_ddlv_po_no());
				int cnt = dbSelect("MSBBL1340_MST_PO_S01", _poL, poL_bldr);
				if (cnt <= 0) {
					msgL.addAll(getRecordNotFoundMsg(getModuleID(), "MST_PO",
							poL_bldr.getBaseDbc().getKeyColumn(), new String[] {
								r.purc_ddlv_po_no()
							}, r));
				}
			}
			//参照売上実績明細ＮＯ
			if (!isNull(r.ref_sls_act_d_no())) {
				_slsActDL_bldr.setWhere(_slsActDL_t.sls_act_d_no.eq(bind("1")), r.ref_sls_act_d_no());
				int cnt = dbSelect("MSBBL1340_MST_SLS_ACT_D_S02", _slsActDL, _slsActDL_bldr);
				if (cnt <= 0) {
					msgL.addAll(getRecordNotFoundMsg(getModuleID(), "MST_SLS_ACT_D",
							_slsActDL_bldr.getBaseDbc().getKeyColumn(), new String[] {
								r.ref_sls_act_d_no()
							}, r));
				}
			}

			//受注ＮＯ
			if (!isNull(r.slo_no())) {
				MST_SLO_R sloL_t = MST_SLO_R.create("T");
				MCQueryApiBuilder sloL_bldr = MCQueryApiBuilder.create(sloL_t);
				sloL_bldr.setWhere(sloL_t.slo_no.eq(bind("1")), r.slo_no());
				int cnt = dbSelect("MSBBL1340_MST_SLO_S01", _sloL, sloL_bldr);
				if (cnt <= 0) {
					msgL.addAll(getRecordNotFoundMsg(getModuleID(), "MST_SLO",
							sloL_bldr.getBaseDbc().getKeyColumn(), new String[] {
								r.slo_no()
							}, r));
				}
			}
			//受注明細ＮＯ
			if (!isNull(r.slo_d_no())) {
				MST_SLO_D_R sloDL_t = MST_SLO_D_R.create("T");
				MCQueryApiBuilder sloDL_bldr = MCQueryApiBuilder.create(sloDL_t);
				sloDL_bldr.setWhere(sloDL_t.slo_d_no.eq(bind("1")), r.slo_d_no());
				int cnt = dbSelect("MSBBL1340_MST_SLO_D_S01", _sloDL, sloDL_bldr);
				if (cnt <= 0) {
					msgL.addAll(getRecordNotFoundMsg(getModuleID(), "MST_SLO_D",
							sloDL_bldr.getBaseDbc().getKeyColumn(), new String[] {
								r.slo_d_no()
							}, r));
				}
			}
			return msgL;
		}

		//詳細のＮＯ系存在チェック
		protected MCMessageList ioDbCheck(Chk01_IoR r) {
			MCMessageList msgL = new MCMessageList();

			//入荷実績ＮＯ
			if (!isNull(r.arr_act_no())) {
				MST_ARR_ACT_R arrActL_t = MST_ARR_ACT_R.create("T");
				MCQueryApiBuilder arrActL_bldr = MCQueryApiBuilder.create(arrActL_t);
				arrActL_bldr.setWhere(arrActL_t.arr_act_no.eq(bind("1")), r.arr_act_no());
				int cnt = dbSelect("MSBBL1340_MST_ARR_ACT_S02", _arrActL, arrActL_bldr);
				if (cnt <= 0) {
					msgL.addAll(getRecordNotFoundMsg(getModuleID(), "MST_ARR_ACT",
							arrActL_bldr.getBaseDbc().getKeyColumn(), new String[] {
								r.arr_act_no()
							}, r));
				}
				else {
					r.arr_schd_no(_arrActL.get(0).arr_schd_no());
				}
			}
			//仕入実績受払ＮＯ
			if (!isNull(r.purc_act_io_no())) {
				MST_PURC_ACT_IO_R purcActIoL_t = MST_PURC_ACT_IO_R.create("T");
				MCQueryApiBuilder purcActIoL_bldr = MCQueryApiBuilder.create(purcActIoL_t);
				purcActIoL_bldr.setWhere(purcActIoL_t.purc_act_io_no.eq(bind("1")), r.purc_act_io_no());
				int cnt = dbSelect("MSBBL1340_MST_PURC_ACT_IO_S01", _purcActIoL, purcActIoL_bldr);
				if (cnt <= 0) {
					msgL.addAll(getRecordNotFoundMsg(getModuleID(), "MST_PURC_ACT_IO",
							purcActIoL_bldr.getBaseDbc().getKeyColumn(), new String[] {
								r.purc_act_io_no()
							}, r));
				}
			}

			//仕入返品実績受払ＮＯ
			if (!isNull(r.purc_ret_act_io_no())) {
				MST_PURC_RET_ACT_IO_R purcRetActIoL_t = MST_PURC_RET_ACT_IO_R.create("T");
				MCQueryApiBuilder purcRetActIoL_bldr = MCQueryApiBuilder.create(purcRetActIoL_t);
				purcRetActIoL_bldr.setWhere(purcRetActIoL_t.purc_ret_act_io_no.eq(bind("1")), r.purc_ret_act_io_no());
				int cnt = dbSelect("MSBBL1340_MST_PURC_RET_ACT_IO_S01", _purcRetActIoL, purcRetActIoL_bldr);
				if (cnt <= 0) {
					msgL.addAll(getRecordNotFoundMsg(getModuleID(),
							"MST_PURC_RET_ACT_IO", purcRetActIoL_bldr.getBaseDbc().getKeyColumn(),
							new String[] {
								r.purc_ret_act_io_no()
							}, r));
				}
			}
			return msgL;
		}

		/**
		 * 固有チェック
		 * 	<p>
		 * 	補完処理後に実施される
		 * 	</p>
		 * @return
		 */
		protected MCMessageList checkOther() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_DtlR> dtlL = getChkList(up1(), CREATE, MODIFY, NONE);
			MCList<Chk01_IoR> ioL = getChkList(up2(), CREATE, MODIFY, NONE);

			// 計上日≦請求起算日チェック
			msgL.addAll(checkAcDtBillBasisDt());

			//行削除チェック
			//行削除対象に対し分割された実績が存在している状態、かつ、打切となっている実績を行削除しようとした場合
			msgL.addAll(checkAbortDel());

			// 物流Ｇ混在チェック
			// 明細・詳細で指定した場所の物流グループＣＤが異なるものが含まれている場合
			msgL.addAll(checkLgGrpMix(dtlL, ioL));

			//価格印字ＦＬＧ混在チェック
			//明細の同一納品先に対し、異なる価格印字ＦＬＧが設定されている場合
			msgL.addAll(checkMixPriPrntFlg());

			// 仕入直送売上返品の場合、明細毎に異なる返品先情報が含まれている場合
			msgL.addAll(checkMixRetInfo());
			
			MCMessageList tmpMsgL = new MCMessageList();
			for (Chk01_DtlR r : dtlL) {

				//売上返品理由・単価チェック
				if (r.sls_acxfr_flg()) {
					if (!r.trd_cur_upri().isZero() && !isNull(r.base_cur_dscnt_amt())) {
						//MSBBL0114:売上返品理由が他勘定のため、単価はゼロ、値引額は未指定にしてください。
						msgL.add(new MCMessage(r, Chk01_DtlR.$sls_acxfr_flg, MSBBL0114));
					}
				}

				MCList<Chk01_DtlR> parL = MCList.create(Chk01_DtlR.class);
				parL.add(r);
				// 明細に紐づく詳細のリストを取得
				MCList<Chk01_IoR> chdL = getChildIoL(ioL, parL);
				if (chdL.isEmpty()) {
					continue;
				}

				//打切チェック
				//	同一入荷予定の詳細のΣ予定数量　＜＝　明細の基準単位数量の状態で打切ろうとした場合（打切れる残数がない場合）
				msgL.addAll(checkAbort(r, chdL));

				// 以下、	明細・詳細相違チェック

				// 数量 	明細の数量と詳細の数量（合計）が異なる場合※基準単位換算
				if (!isSame(r.base_unit_qty(), chdL.sum(Chk01_DtlR.$base_unit_qty))) {
					msgL.add(new MCMessage(r, Chk01_DtlR.$trd_unit_qty, MSBBL0079));
				}

				// 手配ＮＯ１～４
				tmpMsgL.clear();
				tmpMsgL.addAll(checkSno(r, Chk01_DtlR.$sno1, Chk01_IoR.$sno1, chdL));
				if (tmpMsgL.size() > 0) {
					msgL.addAll(tmpMsgL);
				}
				if (tmpMsgL.size() == 0) {
					tmpMsgL.addAll(checkSno(r, Chk01_DtlR.$sno2, Chk01_IoR.$sno2, chdL));
					if (tmpMsgL.size() > 0) {
						msgL.addAll(tmpMsgL);
					}
				}
				if (tmpMsgL.size() == 0) {
					tmpMsgL.addAll(checkSno(r, Chk01_DtlR.$sno3, Chk01_IoR.$sno3, chdL));
					if (tmpMsgL.size() > 0) {
						msgL.addAll(tmpMsgL);
					}
				}
				if (tmpMsgL.size() == 0) {
					tmpMsgL.addAll(checkSno(r, Chk01_DtlR.$sno4, Chk01_IoR.$sno4, chdL));
					if (tmpMsgL.size() > 0) {
						msgL.addAll(tmpMsgL);
					}
				}

				// ロットＮＯ
				// 明細のロットが入力されている場合に、詳細のロットと異なる場合
				if (!isNullOrNullVal(r.lot_no())) {
					if (!isSameParChild(r, chdL, Chk01_DtlR.$lot_no)) {
						msgL.add(new MCMessage(r, Chk01_DtlR.$lot_no, MSBBL0081));
					}
				}

				// サブロットＮＯ
				// 明細のサブロットが入力されている場合に、詳細のサブロットと異なる場合
				if (!isNullOrNullVal(r.sublot_no())) {
					if (!isSameParChild(r, chdL, Chk01_DtlR.$sublot_no)) {
						msgL.add(new MCMessage(r, Chk01_DtlR.$sublot_no, MSBBL0082));
					}
				}

				// 版ＮＯ
				// 明細の版ＮＯが入力されている場合に、詳細の版ＮＯと異なる場合
				if (!isNull(r.ver_no())) {
					if (!isSameParChild(r, chdL, Chk01_DtlR.$ver_no)) {
						msgL.add(new MCMessage(r, Chk01_DtlR.$ver_no, MSBBL0270));
					}
				}

				// 場所ＣＤ
				// 明細の場所が入力されている場合に、詳細の場所と異なる場合
				if (!isNull(r.loc_cd())) {
					if (!isSameParChild(r, chdL, Chk01_DtlR.$loc_cd)) {
						msgL.add(new MCMessage(r, Chk01_DtlR.$loc_cd, MSBBL0083));
					}
				}

				// 棚・ライン
				if (!isNullOrNullVal(r.str_ln_cd())) {
					if (!isSameParChild(r, chdL, Chk01_DtlR.$str_ln_cd)) {
						msgL.add(new MCMessage(r, Chk01_DtlR.$str_ln_cd, MSBBL0084));
					}
				}

				// 格付
				// 詳細の格付と異なる場合
				if (!isNull(r.gd_cd())) {
					if (!MAC_STK_MNG_TYP.isNOT_MNG(chdL.get(0).stk_mng_typ()) && !isSameParChild(r, chdL, Chk01_DtlR.$gd_cd)) {
						msgL.add(new MCMessage(r, Chk01_DtlR.$gd_cd, MSBBL0085));
					}
				}

				// 案件ＮＯ
				// 明細に紐づく詳細の手配NO1に対応する案件が混在する場合
				if (!isSameParChild(r, ioL, Chk01_DtlR.$wrk_no)) {
					msgL.add(new MCMessage(r, Chk01_DtlR.$wrk_no, MSBBL0113));
				}
				
				// 支払予定日
				// 発注先インボイス取引かつ都度請求かつ計上日>支払予定日の場合
				msgL.addAll(checkAcDtPaySchdDt(r));
			}

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
		 * 計上日≦支払予定日チェック
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList checkAcDtPaySchdDt(Chk01_DtlR r) {
			
			MCMessageList msgL = new MCMessageList();
			
			// インボイス取引かつ売上都度請求の場合に、計上日≦支払予定日チェック
			MST_PURC_ACT_R purcActR = getPurcActCache(r.purc_act_no());
			if (!isNull(up0().ac_dt()) && !isNull(r.pay_schd_dt())
					&& purcActR.getBooleanNE(MAM_BP_R.$sppl_iv_flg) 
					&& purcActR.getBooleanNE(MAM_BP_R.$pay_spot_flg)
					&& up0().ac_dt().gt(r.pay_schd_dt())) {
				msgL.add(msgNotBefore(r, Chk01_DtlR.$pay_schd_dt, up0(), Chk01_HdrR.$ac_dt, r, Chk01_DtlR.$pay_schd_dt, true));
			}
			
			return msgL;
		}

		/**
		 * 手配ＮＯ１～４の値が明細(親)と詳細(子)で同一値か判定する
		 * @param r
		 * @param tgtSnoDtl
		 * @param tgtSnoIo
		 * @param chdL
		 * @return
		 */
		protected MCMessageList checkSno(Chk01_DtlR r, String tgtSnoDtl, String tgtSnoIo, MCList<Chk01_IoR> chdL) {
			MCMessageList msgL = new MCMessageList();
			String sno = r.getStringNE(tgtSnoDtl);
			if (!isNullOrNullVal(sno)) {
				for (Chk01_IoR chd : chdL) {
					if (!(isSame(sno, chd.getStringNE(tgtSnoIo)) || isNullOrNullVal(chd.getStringNE(tgtSnoIo)))) {
						msgL.add(new MCMessage(r, tgtSnoDtl, MSBBL0080));
						break;
					}
				}
			}
			return msgL;
		}

		/**
		 * 	指定カラムの値が明細(親)と詳細(子)で同一値か判定する
		 * <p>
		 * 	明細と詳細は1:Ｎの関係であるが、指定カラムの値が明細・詳細ともにすべて同一値の場合はtrue<br>
		 * 	上記以外の場合はfalseを返す
		 * </p>
		 * @param par
		 * @param chdL
		 * @param col
		 * @return
		 */
		protected boolean isSameParChild(Chk01_DtlR par, MCList<Chk01_IoR> chdL,
				String col) {

			if (!par.contains(col) || !chdL.get(0).contains(col)) {
				return false;
			}

			for (Chk01_IoR chd : chdL) {
				if (!isNull(chd.getValue(col)) && !isSame(par.getValue(col), chd.getValue(col))) {
					return false;
				}
			}

			return true;
		}

		/**
		 * ヘッダ情報補完（定型チェック実施後）
		 */
		protected void compHdrSub() {

			// 請求先
			MAM_BP_R acst = getBpCache(up0().acst_cd());
			up0().bcst_cd(acst.bcst_cd());
			// 与信管理先
			MAM_BP_R bcst = getBpCache(acst.bcst_cd());
			up0().cred_cd(bcst.ar_cred_cd());
		}

		/**
		 * 	明細情報補完（定型チェック実施後）
		 */
		protected void compDtlSub() {

			int i = 1;
			for (Chk01_DtlR r : up1().subList(CREATE, MODIFY, NONE)) {
				// 基準単位数量
				r.base_unit_qty(getBaseUnitQty(r));

				// 表示順
				r.disp_seq(i++);

				//入荷進捗ＮＯ
				r.arr_pr_no(getArrPrNo(r.sls_ret_schd_d_no()));

				//入荷予定ＮＯ
				r.arr_schd_no(getArrSchdNo(r.arr_pr_no()));

				//案件ＮＯ
				r.wrk_no(getWrkNo(r.sno1()));
				
				// null文字の補完
				if (!isNull(r.loc_cd()) && isNull(r.str_ln_cd())) {
					r.str_ln_cd(MAC_STR.NULL_VAL.value());
				}
				
				// 予定数
				MST_ARR_PR_R arrArR = _arrPrL.getFirst(MST_ARR_PR_R.$arr_pr_no, r.arr_pr_no());
				if (!isNull(arrArR)) {
					r.schd_qty(arrArR.base_unit_qty());
				}
				
				// 納品書明細ＮＯ
				MST_SLS_ACT_D_R slsActDR = _slsActDL.getFirst(MST_SLS_ACT_D_R.$sls_act_d_no, r.sls_act_d_no());
				if (!isNull(slsActDR)) {
					r.dlv_slip_d_no(slsActDR.dlv_slip_d_no());
				}

			}
			
			MCList<MAM_SUNDRY_ITM_R> sundryItmL = getSundryItm(up1());
			
			MCIndexKey idxkey = sundryItmL.createIndex(MAM_SUNDRY_ITM_R.$itm_cd,
					MAM_SUNDRY_ITM_R.$itm_sub1,
					MAM_SUNDRY_ITM_R.$itm_sub2,
					MAM_SUNDRY_ITM_R.$itm_sub3,
					MAM_SUNDRY_ITM_R.$sno1,
					MAM_SUNDRY_ITM_R.$sno2,
					MAM_SUNDRY_ITM_R.$sno3,
					MAM_SUNDRY_ITM_R.$sno4);
			
			MAM_SUNDRY_ITM_R sundryItmR = null;
			
			for (Chk01_DtlR r : up1()) {
				
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
				dbSelectKey("MSBBL1340_MAM_SUNDRY_ITM_S01", sundryItmL, sundryItmL_bldr, bindL);
			}
			
			return sundryItmL;
		}

		/**
		 * 	詳細情報補完（定型チェック実施後）
		 */
		protected void compIoSub() {

			MCList<Chk01_DtlR> dtlL = up1().subList(CREATE, MODIFY, NONE);
			MCList<Chk01_IoR> ioL = up2().subList(CREATE, MODIFY, NONE);

			for (Chk01_DtlR parDtlR : dtlL) {				
				
				for (Chk01_IoR chdIoR : getChildIoL(ioL, parDtlR)) {

					chdIoR.base_unit_cd(parDtlR.base_unit_cd());
					chdIoR.base_unit_dec_place(parDtlR.base_unit_dec_place());
					chdIoR.base_unit_rnd_typ(parDtlR.base_unit_rnd_typ());
					chdIoR.lot_mng_typ(parDtlR.lot_mng_typ());
					chdIoR.sublot_mng_typ(parDtlR.sublot_mng_typ());
					chdIoR.ver_flg(parDtlR.ver_flg());
					chdIoR.sno1_mng_typ(parDtlR.sno1_mng_typ());
					chdIoR.sno2_mng_typ(parDtlR.sno2_mng_typ());
					chdIoR.sno3_mng_typ(parDtlR.sno3_mng_typ());
					chdIoR.sno4_mng_typ(parDtlR.sno4_mng_typ());

					// 基準単位数量
					chdIoR.base_unit_qty(getBaseUnitQty(chdIoR));

					//荷姿単位ＣＤ
					if (chdIoR.pack_flg()) {
						chdIoR.pack_unit_cd(chdIoR.trd_unit_cd());
						chdIoR.pack_unit_qty(chdIoR.trd_unit_qty());
					}
					else {
						chdIoR.pack_unit_cd(chdIoR.base_unit_cd());
						chdIoR.pack_unit_qty(chdIoR.base_unit_qty());
					}

					//案件ＮＯ
					chdIoR.wrk_no(getWrkNo(chdIoR.sno1()));
					
					// null文字の補完
					if (!isNull(chdIoR.loc_cd()) && isNull(chdIoR.str_ln_cd())) {
						chdIoR.str_ln_cd(MAC_STR.NULL_VAL.value());
					}
					
					// 在庫管理区分
					chdIoR.stk_mng_typ(parDtlR.stk_mng_typ());
				}
			}
		}

		//入荷進捗ＮＯ取得
		protected String getArrPrNo(String key) {
			if (!isNull(key)) {
				MCList<MST_ARR_PR_R> arrPrL = MCList.create(MST_ARR_PR_R.class);
				MST_ARR_PR_R t = MST_ARR_PR_R.create("T");
				MCQueryApiBuilder arrPrL_bldr = MCQueryApiBuilder.create(t);
				arrPrL_bldr.setWhere(t.sls_ret_schd_d_no.eq(bind("1")), key);
				int cnt = dbSelect("MSBBL1340_MST_ARR_PR_S01", arrPrL, arrPrL_bldr);
				if (cnt > 0) {
					_arrPrL.addAll(arrPrL);
					return arrPrL.get(0).arr_pr_no();
				}
			}
			return null;
		}

		//入荷予定ＮＯ取得
		protected String getArrSchdNo(String key) {
			if (!isNull(key)) {
				MCList<MST_ARR_ACT_R> arrActL = MCList.create(MST_ARR_ACT_R.class);
				MST_ARR_ACT_R t = MST_ARR_ACT_R.create("T");
				MCQueryApiBuilder arrActL_bldr = MCQueryApiBuilder.create(t);
				arrActL_bldr.setWhere(t.arr_act_no.eq(bind("1")), key);
				int cnt = dbSelect("MSBBL1340_MST_ARR_ACT_S03", arrActL, arrActL_bldr);
				if (cnt > 0) {
					_arrActL.addAll(arrActL);
					return arrActL.get(0).arr_schd_no();
				}
			}
			return null;
		}

		//案件ＮＯ取得
		protected String getWrkNo(String key) {
			if (!isNull(key)) {
				MST_WRK_SNO_R sno = MST_WRK_SNO_R.create("T");
				MCQueryApiBuilder sno_bldr = MCQueryApiBuilder.create(sno);
				sno_bldr.setWhere(sno.sno1.eq(bind("1")), key);
				dbSelect("MSBBL1340_MST_WRK_SNO_S01", sno, sno_bldr);
				return sno.wrk_no();
			}
			return null;
		}

		/**
		 * 	ロット（サブロット）存在チェック
		 * <p>
		 * 	MSBFL_LotService.Lot_Chk03サービスを呼び出してチェックを行う
		 * </p>
		 * @param dtlL
		 */
		protected void callLotSvChk03(MCList<MCRow> chkL, MCList<MCRow> chkIoL) {
			MSBFL_LotService.Lot_Chk03 ope1 = MSBFL_LotService.crtLot_Chk03();
			addAll(ope1.up0(), chkL, createMap_Lot_Chk03_CndR_MCRow());
			ope1.exec();
			copyErrFlg(chkL, ope1.down0());
			
			if (!hasErrFlgOn(ope1.down0())) {
				MSBFL_LotService.Lot_Chk03 ope2 = MSBFL_LotService.crtLot_Chk03();
				addAll(ope2.up0(), chkIoL, createMap_Lot_Chk03_CndR_MCRow());
				ope2.exec();
				copyErrFlg(chkIoL, ope2.down0());
			}
		}

		protected Map_Lot_Chk03_CndR_MCRow<Lot_Chk03_CndR, MCRow> createMap_Lot_Chk03_CndR_MCRow() {
			return new Map_Lot_Chk03_CndR_MCRow<Lot_Chk03_CndR, MCRow>();
		}

		public class Map_Lot_Chk03_CndR_MCRow<D extends Lot_Chk03_CndR, S extends MCRow>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Lot_Chk03_CndR.$peg_no, Chk01_DtlR.$peg_no);
				addColumnPathMap(Lot_Chk03_CndR.$itm_cd, Chk01_DtlR.$itm_cd);
				addColumnPathMap(Lot_Chk03_CndR.$itm_sub1, Chk01_DtlR.$itm_sub1);
				addColumnPathMap(Lot_Chk03_CndR.$itm_sub2, Chk01_DtlR.$itm_sub2);
				addColumnPathMap(Lot_Chk03_CndR.$itm_sub3, Chk01_DtlR.$itm_sub3);
				addColumnPathMap(Lot_Chk03_CndR.$ver_no, Chk01_DtlR.$ver_no);
				addColumnPathMap(Lot_Chk03_CndR.$lot_no, Chk01_DtlR.$lot_no);
				addColumnPathMap(Lot_Chk03_CndR.$sublot_no, Chk01_DtlR.$sublot_no);
			}
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
		 * 	返品先情報混在チェック
		 * <p>
		 * 	[条件]<br>
		 * 	仕入直送売上返品の場合で明細毎に返品先情報が異なっている場合
		 * 	[返品先情報]<br>
		 * 	返品先名、返品先郵便番号、返品先住所１～４、返品先ＴＥＬ、返品先ＦＡＸ、返品先部署、返品先担当者、返品先担当者敬称
		 * </p>
		 * @return
		 */
		protected MCMessageList checkMixRetInfo() {
			MCMessageList msgL = new MCMessageList();
			
			if (!up0().purc_ret_tgt_flg()) {
				return msgL;
			}
			
			MCList<Chk01_DtlR> notErrDtlL = getChkList(up1(), CREATE, MODIFY, NONE);
			
			MCGroupByPolicy grpKey = new MCGroupByPolicy(
					Chk01_DtlR.$ret_nm,
					Chk01_DtlR.$ret_zip_cd, 
					Chk01_DtlR.$ret_addr1,
					Chk01_DtlR.$ret_addr2,
					Chk01_DtlR.$ret_addr3,
					Chk01_DtlR.$ret_addr4,
					Chk01_DtlR.$ret_tel,
					Chk01_DtlR.$ret_fax,
					Chk01_DtlR.$ret_cntct_dpt,
					Chk01_DtlR.$ret_cntct_psn,
					Chk01_DtlR.$ret_cntct_psn_title);
			
			for (MCList<Chk01_DtlR> grpErrDtlL : notErrDtlL.groupList(Chk01_DtlR.$purc_act_no)) {
				MCList<Chk01_DtlR> chkL = grpErrDtlL.groupBy(grpKey);
				if (chkL.size() > 1) {
					msgL.add(new MCMessage(MSBBL0294, grpErrDtlL.get(0).purc_act_no()));
				}
			}
			return msgL;
		}
		

		/**
		 * 打切チェック
		 * 同一入荷予定の詳細のΣ予定数量　≦　明細の基準単位数量の状態で打切ろうとした場合（打切れる残数がない場合）
		 */
		protected MCMessageList checkAbort(Chk01_DtlR r, MCList<Chk01_IoR> chdL) {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_IoR> abrtL = chdL.subList(Chk01_IoR.$abort_flg, true); 
			
			if (!abrtL.isEmpty()) {
				if (r.schd_qty().lte(r.base_unit_qty())) {
					msgL.add(new MCMessage(r, Chk01_IoR.$abort_flg, MSBBL0115,
							toDispGUIIndex(r)));
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

			MCList<Chk01_IoR> delL = getChkList(up2(), DELETE);

			for (Chk01_IoR r : delL) {
				if (r.abort_flg()) {
					// 分割された実績が存在するかチェック
					if (cntOthrSlsActD(r.ref_sls_act_d_no(), r.sls_act_d_seq()) > 0) {
						msgL.add(new MCMessage(r, Chk01_IoR.$abort_flg, MSBBL0097,
								toDispGUIIndex(r)));
					}
				}
			}
			return msgL;
		}

		/**
		 * 	分割された自身以外の売上実績明細の件数を取得
		 * 	<p>
		 * 	引数の売上実績と売上予定ＮＯが一致、売上実績明細ＮＯ、売上実績明細連番が不一致の売上実績明細の件数をカウントする
		 * 	</p>
		 * @param dtl
		 * @return
		 */
		protected int cntOthrSlsActD(String slsActDNo, MCNumber slsActDSeq) {
			MCList<MST_SLS_ACT_D_R> slsActDL = MCList.create(MST_SLS_ACT_D_R.class);
			MST_SLS_ACT_D_R t = MST_SLS_ACT_D_R.create("T");
			MCQueryApiBuilder slsActDL_bldr = MCQueryApiBuilder.create(t);
			MST_SLS_ACT_R t2 = MST_SLS_ACT_R.create("T2");
			slsActDL_bldr.setSelect(t.sls_act_d_no);
			slsActDL_bldr.addInnerJoin(t2, bracket( t.sls_act_no.eq(t2.sls_act_no)
											.and(t.sls_act_seq.eq(t2.sls_act_seq))));
			slsActDL_bldr.setWhere(t2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			slsActDL_bldr.addWhereWithAnd(t.sls_act_d_no.neq(bind("1")), slsActDNo);
			slsActDL_bldr.addWhereWithAnd(t.sls_act_d_seq.neq(bind("1")), slsActDSeq);
			return dbSelect("MSBBL1340_MST_SLS_ACT_D_S03", slsActDL, slsActDL_bldr);
		}

		/**
		 * 	取引先マスタキャッシュ
		 */
		FXUCL_MCDbcCache<MAM_BP_R> _cacheBp;

		/**
		 * 取引先マスタの取得
		 * @param cst_cd
		 * @return
		 */
		protected MAM_BP_R getBpCache(String bpCd) {
			return _cacheBp.get(bpCd);
		}

		protected void initBpCache() {
			_cacheBp = null;
			_cacheBp = new FXUCL_MCDbcCache<MAM_BP_R>(MCQueryApiBuilder.create(MAM_BP_R.create("T")));
		}

		/**
		 * 	物流グループＣＤ混在チェック
		 * <p>
		 * 	明細・詳細で指定した場所の物流グループＣＤがすべて同一かチェックする
		 * </p>
		 * @return
		 */
		protected MCMessageList checkLgGrpMix(MCList<Chk01_DtlR> dtlL,
				MCList<Chk01_IoR> ioL) {

			MCMessageList msgL = new MCMessageList();
			HashSet<String> lgGrpCdSet = new HashSet<String>();
			crtLocCache(dtlL);

			for (Chk01_DtlR r : dtlL.groupBy(Chk01_DtlR.$loc_cd)) {
				if (!isNull(r.loc_cd())) {
					MAM_LOC_R loc = getLocCache(r.loc_cd());
					lgGrpCdSet.add(loc.lg_grp_cd());
				}
			}

			for (Chk01_IoR r : ioL.groupBy(Chk01_IoR.$loc_cd)) {
				if (!isNull(r.loc_cd())) {
					MAM_LOC_R loc = getLocCache(r.loc_cd());
					lgGrpCdSet.add(loc.lg_grp_cd());
				}
			}

			if (lgGrpCdSet.size() > 1) {
				// MSBBL0078: 物流グループＣＤが異なる場所を混在させることはできません。\n同一の物流グループＣＤとなる場所を指定してください。
				msgL.add(new MCMessage(up0(), null, MSBBL0078));
			}

			return msgL;
		}

		/**
		 * 	場所マスタキャッシュ
		 */
		FXUCL_MCDbcCache<MAM_LOC_R> _cacheLoc;

		/**
		 *場所マスタの取得
		 * @param cst_cd
		 * @return
		 */
		protected MAM_LOC_R getLocCache(String loc_cd) {
			return _cacheLoc.get(loc_cd);
		}

		protected void crtLocCache(MCList<Chk01_DtlR> dtlL) {
			_cacheLoc = null;
			_cacheLoc = new FXUCL_MCDbcCache<MAM_LOC_R>(
					MCQueryApiBuilder.create(MAM_LOC_R.create("T")), dtlL,
					Chk01_DtlR.$loc_cd);
		}

		/**
		 * 	入荷実績サービス呼出<br>
		 * {@link MSBEL_ArrActService.ArrAct_Chk01}
		 */
		protected void callArrActSvChk01() {

			MCList<Chk01_IoR> upIoL = up2().subList(Chk01_IoR.$sync_flg, true);
			if (!upIoL.isEmpty()) {
				MSBEL_ArrActService.ArrAct_Chk01 ope = MSBEL_ArrActService
						.crtArrAct_Chk01();
				addAll(ope.up0(), upIoL, createMap_ArrAct_DtlR_Chk01_IoR(up0(), up1()));
				ope.exec();
			}
		}
	}

	// 売上返品サービスの下り電文保持
	MCList<SlsRet_Upd01_RsltR> _rsltHdrL = MCList.create(SlsRet_Upd01_RsltR.class);
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 売上返品情報を新規登録します。<br>
	 */
	public class Ins01 extends MSBBL_SlsRetReg_MC_A.Ins01 {
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

			// 入荷実績サービス実行(同時計上ＦＬＧオンの場合)
			callArrActSvUpd01(up0(), up1(), up2());

			// 売上返品サービスの実行
			callSlsRetSvUpd01(up0(), up1(), up2());

			// 仕入返品サービスの実行
			Chk01_HdrR up0R = up0().clone();
			for (SlsRet_Upd01_RsltR rsltHdrR : _rsltHdrL) {
				up0R.sls_act_no(rsltHdrR.sls_act_no());
				up0R.sls_act_seq(rsltHdrR.sls_act_seq());
				callPurcRetSvIns01(up0R, up1(), up2());
			}

			// 受払実績管理サービスの実行
			callIoActSrvUpd01();

			// 下り電文の設定
			setDown();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {

			//　紐付けＮＯの設定
			setPegNoSub(up0(), up1(), up2());
			up0().setStatus(Status.CREATE);
			copyGUIIndexDtlToIo(up1(),up2());
		}

		/**
		 * 	Chk01オペレーションの呼出
		 */
		protected void callThisChk01() {
			MSBBL_SlsRetReg.Chk01 ope = MSBBL_SlsRetReg.crtChk01();
			MCRow.copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			ope.up2().setAll(up2());
			ope.exec();

			MCRow.copyall(up0(), ope.down0());
			up1().setAll(ope.down1());
			up2().setAll(ope.down2());
		}

		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
		}

	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 売上返品情報を訂正します。<br>
	 */
	public class Upd01 extends MSBBL_SlsRetReg_MC_A.Upd01 {
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

			// 入荷実績サービス実行(同時計上ＦＬＧオンの場合)
			callArrActSvUpd01(up0(), up1(), up2());

			// 売上返品サービスの実行
			callSlsRetSvUpd01(up0(), up1(), up2());

			// 仕入返品サービスの実行
			Chk01_HdrR up0R = up0().clone();
			MCList<Chk01_DtlR> up1L = up1().clone();
			for (SlsRet_Upd01_RsltR rsltHdrR : _rsltHdrL) {
				if (!isNull(rsltHdrR.hdr_peg_no())) {
					callPurcRetSvUpd01(up0R, up1L, up2());
				}
				else {
					up0R.sls_act_no(rsltHdrR.sls_act_no());
					up0R.sls_act_seq(rsltHdrR.sls_act_seq());
					callPurcRetSvIns01(up0R, up1L, up2());
				}
			}

			// 受払実績管理サービスの実行
			callIoActSrvUpd01();

			// 下り電文の設定
			setDown();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {

			//　紐付けＮＯの設定
			setPegNoSub(up0(), up1(), up2());
			copyGUIIndexDtlToIo(up1(),up2());
		}

		/**
		 * 	Chk01オペレーションの呼出
		 */
		protected void callThisChk01() {
			MSBBL_SlsRetReg.Chk01 ope = MSBBL_SlsRetReg.crtChk01();
			MCRow.copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			ope.up2().setAll(up2());
			ope.exec();

			MCRow.copyall(up0(), ope.down0());
			up1().setAll(ope.down1());
			up2().setAll(ope.down2());
		}

		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
		}

	}
	
	/**
	 * 取引通貨金額、基準通貨金額、納税通貨金額を設定する。
	 * @param hdr 受注ヘッダ
	 * @param dtlL 受注明細
	 */
	protected void setCurUpriAmt(Srch01_HdrR hdr, MCList<Srch01_DtlR> dtlL) {
		
		for (Srch01_DtlR dtlR : dtlL) {
			// 基準通貨に換算
			dtlR.base_cur_upri(convToBaseCur(dtlR.trd_cur_upri(), hdr.xrate(),
					hdr.base_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
			dtlR.base_cur_amt(convToBaseCur(dtlR.trd_cur_amt(), hdr.xrate(),
					hdr.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			dtlR.base_cur_tax_amt(convToBaseCur(dtlR.trd_cur_tax_amt(), hdr.xrate(),
					hdr.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			dtlR.base_cur_inc_tax_amt(convToBaseCur(dtlR.trd_cur_inc_tax_amt(), hdr.xrate(),
					hdr.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			
			// 納税通貨に換算
			if (!isNull(hdr.ptax_cur_cd())) {
				dtlR.ptax_cur_upri(convCur(dtlR.trd_cur_upri(), hdr.ptax_xrate(),
						hdr.ptax_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
				dtlR.ptax_cur_amt(convCur(dtlR.trd_cur_amt(), hdr.ptax_xrate(),
						hdr.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
				dtlR.ptax_cur_tax_amt(convCur(dtlR.trd_cur_tax_amt(), hdr.ptax_xrate(),
						hdr.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
				dtlR.ptax_cur_inc_tax_amt(convCur(dtlR.trd_cur_inc_tax_amt(), hdr.ptax_xrate(),
						hdr.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			}
		}

		hdr.trd_cur_amt(dtlL.sum(Srch01_DtlR.$trd_cur_amt));
		hdr.trd_cur_inc_tax_amt(dtlL.sum(Srch01_DtlR.$trd_cur_inc_tax_amt));
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
	
	/**
	 * 仕入直送返品対象かどうかのFLG設定
	 * @param hdr
	 * @param dtlL
	 */
	protected void setPurcRetTgt(Srch01_HdrR hdr, MCList<Srch01_DtlR> dtlL) {
		hdr.purc_ret_tgt_flg(false);
		for (Srch01_DtlR dtlR : dtlL) {
			if (!isNull(dtlR.purc_act_d_no())) {
				hdr.purc_ret_tgt_flg(true);
				break;
			}
		}
	}
	
	/**
	 * 	取引単位数量の設定
	 * <p>
	 * 	引数のコンテナの基準単位数量を取引単位に換算可能であれば<br>
	 * 	換算した取引単位数量を設定する。<br>
	 * 	換算不可の場合は基準単位数量を設定する（取引単位にも基準単位を設定する)<br>
	 * 	引数のコンテナには以下の内容が正しく設定されている必要がある<br>
	 * 	<li>trd_unit_cd</li>
	 * 	<li>base_unit_cd</li>
	 * 	<li>base_unit_nm</li>
	 * 	<li>base_unit_qty</li>
	 * 	<li>trd_unit_conv_base_qty</li>
	 * 	<li>trd_unit_conv_qty</li>
	 * 	<li>trd_unit_rnd_typ</li>
	 * 	<li>trd_unit_dec_place</li>
	 * 	<li>base_unit_rnd_typ</li>
	 * 	<li>base_unit_dec_place</li>
	 * </p>
	 */
	protected void setBase2TrdUnitQty(Srch01_IoR r) {

		MCNumber qty = rvrsBaseUnitConv(r.base_unit_qty(), r.trd_unit_conv_base_qty(),
				r.trd_unit_conv_qty(), r.trd_unit_dec_place(), r.trd_unit_rnd_typ(), true);

		if (!isNull(qty)) {
			// 換算可能
			r.trd_unit_qty(qty);
		}
		else {
			// 換算不可
			r.trd_unit_qty(r.base_unit_qty());
			r.trd_unit_cd(r.base_unit_cd());
			r.trd_unit_nm(r.base_unit_nm());
			r.trd_unit_conv_base_qty(1);
			r.trd_unit_conv_qty(1);
			r.trd_unit_rnd_typ(r.base_unit_rnd_typ());
			r.trd_unit_dec_place(r.base_unit_dec_place());
		}
	}

	/**
	 * 取引単位数量の設定
	 * @param r
	 */
	protected void setBase2TrdUnitQty(Srch01_DtlR r) {

		MCNumber qty = rvrsBaseUnitConv(r.base_unit_qty(), r.trd_unit_conv_base_qty(),
				r.trd_unit_conv_qty(), r.trd_unit_dec_place(), r.trd_unit_rnd_typ(), true);

		if (!isNull(qty)) {
			// 換算可能
			r.trd_unit_qty(qty);
		}
		else {
			// 換算不可
			r.trd_unit_qty(r.base_unit_qty());
			r.trd_unit_cd(r.base_unit_cd());
			r.trd_unit_nm(r.base_unit_nm());
			r.trd_unit_conv_base_qty(1);
			r.trd_unit_conv_qty(1);
			r.trd_unit_rnd_typ(r.base_unit_rnd_typ());
			r.trd_unit_dec_place(r.base_unit_dec_place());
		}
	}

	protected MCNumber getBaseUnitQty(Chk01_DtlR r) {

		return convToBaseUnit(r.trd_unit_qty(), r.trd_unit_conv_base_qty(),
				r.trd_unit_conv_qty(), r.base_unit_dec_place(), r.base_unit_rnd_typ());
	}

	protected MCNumber getBaseUnitQty(Chk01_IoR r) {

		return convToBaseUnit(r.trd_unit_qty(), r.trd_unit_conv_base_qty(),
				r.trd_unit_conv_qty(), r.base_unit_dec_place(), r.base_unit_rnd_typ());
	}

	protected MCNumber calcAmt(Chk01_HdrR hdr, Chk01_DtlR dtl) {

		return MAUCL_AmtUtil.getAmt(dtl.trd_cur_upri(), dtl.trd_unit_qty(),
				hdr.trd_cur_amt_dec_place(), hdr.sls_amt_rnd_typ(),
				nvl(dtl.trd_cur_dscnt_amt(), MCNumber.ZERO));
	}

	protected MCNumber calcTaxAmt(Chk01_HdrR hdr, Chk01_DtlR dtl) {

		return MAUCL_AmtUtil.getTaxAmt(dtl.trd_cur_amt(), dtl.tax_rate(),
				hdr.trd_cur_upri_dec_place(), hdr.sls_amt_rnd_typ(),
				nvl(dtl.trd_cur_dscnt_amt(), MCNumber.ZERO));
	}

	/**
	 * 	明細リストが紐づく詳細リストを抽出する
	 * <p>
	 * 	srcDtlLのdtl_row_idの値が同じリストをsrcIoLから抽出します。<br>
	 * 	明細（親）と詳細（子）のリストには同一のdtl_row_id設定されている前提で動作します。
	 * <p>
	 * @param srcIolL
	 * @param srcDtlL
	 * @return
	 */
	protected MCList<Chk01_IoR> getChildIoL(MCList<Chk01_IoR> srcIoL,
			MCList<Chk01_DtlR> srcDtlL) {

		if (srcDtlL.isEmpty() || srcIoL.isEmpty()) {
			return MCList.create(Chk01_IoR.class);
		}

		MCIndexKey idxKey = srcIoL.createIndex(Chk01_DtlR.$dtl_row_id);
		MCNumber[] keyVals = srcDtlL.getNumberNE(Chk01_IoR.$dtl_row_id).toArray(
				new MCNumber[] {});
		return srcIoL.subList(idxKey, keyVals);
	}

	/**
	 * 引数の数量(金額・単価)を基準通貨へ換算する
	 * @param num
	 * @param hdr Srch01_HdrR
	 * @return
	 */
	protected MCNumber convBaseCurNum(MCNumber num, Srch01_HdrR hdr) {
		MCNumber xrate = hdr.xrate();
		MCNumber baseCurDecPlace = hdr.base_cur_upri_dec_place();
		String baseCurRndTyp = hdr.xrate_rnd_typ();
		return convToBaseCur(num, xrate, baseCurDecPlace, baseCurRndTyp);
	}

	/**
	 * 引数の数量(金額・単価)を納税通貨へ換算する
	 * @param num
	 * @param hdr Srch01_HdrR
	 * @return
	 */
	protected MCNumber convPtaxCurNum(MCNumber num, Srch01_HdrR hdr) {
		MCNumber xrate = hdr.ptax_xrate();
		MCNumber curDecPlace = hdr.ptax_cur_upri_dec_place();
		String curRndTyp = hdr.xrate_rnd_typ();
		return convCur(num, xrate, curDecPlace, curRndTyp);
	}
	

	/**
	 * 	紐付けＮＯの設定
	 */
	protected void setPegNoSub(Chk01_HdrR hdr, MCList<Chk01_DtlR> dtlL,
			MCList<Chk01_IoR> ioL) {
		int peg = 1;
		hdr.peg_no(peg);
		int i = 1;

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

		setPegNo(Chk01_IoR.$io_peg_no, ioL);
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
	 * 	入荷実績サービスの呼出 (Ins01,Upd01共通)<br>
	 * 	{@link MSBEL_ArrActService.ArrAct_Upd01}
	 */
	protected void callArrActSvUpd01(Chk01_HdrR hdr, MCList<Chk01_DtlR> dtlL,
			MCList<Chk01_IoR> ioL) {

		MCList<Chk01_IoR> upIoL = ioL.subList(Chk01_IoR.$sync_flg, true);
		if (!upIoL.isEmpty()) {
			MSBEL_ArrActService.ArrAct_Upd01 ope = MSBEL_ArrActService.crtArrAct_Upd01();
			addAll(ope.up1(), upIoL, createMap_ArrAct_DtlR_Chk01_IoR(hdr, dtlL));
			ope.exec();

			String[] copyCols = {
				Chk01_IoR.$arr_act_no
			};
			copyByPegNo(upIoL, ope.down0(), Chk01_IoR.$io_peg_no, copyCols,
					ArrAct_DtlR.$peg_no, copyCols);
		}
	}

	/** 部門マスタのキャッシュ */
	protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _dpt;

	/**
	 * 部門ＣＤと適用日に対応した部門マスタを取得する。<br>
	 * キャッシュに存在する場合、キャッシュから取得して返却する。
	 * 
	 * @param dptCd 部門ＣＤ
	 * @param stDt 適用開始日
	 * 
	 * @return 部門マスタ情報
	 */
	public static MAM_DPT_R getDpt(String dptCd, MCDate stDt) {
		return object(CLAZZ)._getDptCache().get(stDt, dptCd);
	}

	protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _getDptCache() {
		MCList<MCRow> bindL = MCList.create(MCRow.class);
		if (_dpt == null){
			_dpt = new FXUCL_MCDbcCacheStEnd<MAM_DPT_R>(
					MCQueryApiBuilder.create(MAM_DPT_R.create("T")), bindL,
					MAM_DPT_R.$dpt_cd);
		}
		return _dpt;
	}
	
	/**
	 * ワーキンググループＣＤ取得<br />
	 * 部門ＣＤと適用開始日をもとに部門マスタからワーキンググループＣＤを取得する
	 * 
	 * @param dptCd 部門ＣＤ
	 * @param dt 適用開始日
	 * 
	 * @return ワーキンググループＣＤ
	 */
	public static String getWgCd(String dptCd, MCDate dt) {
		return object(CLAZZ)._getWgCd(dptCd, dt);
	}

	protected String _getWgCd(String dptCd, MCDate dt) {
		return getDpt(dptCd, dt).wg_cd();
	}
	
	/**
	 * RowMapper<br>
	 * 	上り電文(Chk01_IoR) -> 入荷実績サービス.上り電文(ArrAct_DtlR)
	 * @param hdr
	 * @param dtlL
	 * @return
	 */
	protected Map_ArrAct_DtlR_Chk01_IoR<ArrAct_DtlR, Chk01_IoR> createMap_ArrAct_DtlR_Chk01_IoR(
			Chk01_HdrR hdr, MCList<Chk01_DtlR> dtlL) {
		return new Map_ArrAct_DtlR_Chk01_IoR<ArrAct_DtlR, Chk01_IoR>(hdr, dtlL);
	}

	public class Map_ArrAct_DtlR_Chk01_IoR<D extends ArrAct_DtlR, S extends Chk01_IoR>
			extends MCRowMapper<D, S> {

		Chk01_HdrR _hdr;

		MCList<Chk01_DtlR> _dtlL;

		MCIndexKey _idxKey;

		public Map_ArrAct_DtlR_Chk01_IoR(Chk01_HdrR hdr, MCList<Chk01_DtlR> dtlL) {
			_hdr = hdr;
			_dtlL = dtlL;
			_idxKey = _dtlL.createIndex(Chk01_DtlR.$dtl_row_id);
		}

		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ArrAct_DtlR.$peg_no, Chk01_IoR.$io_peg_no);
			addColumnPathMap(ArrAct_DtlR.$arr_act_no, Chk01_IoR.$arr_act_no);
			addColumnPathMap(ArrAct_DtlR.$trd_unit_qty, Chk01_IoR.$trd_unit_qty);
			addColumnPathMap(ArrAct_DtlR.$trd_unit_cd, Chk01_IoR.$trd_unit_cd);
			addColumnPathMap(ArrAct_DtlR.$base_unit_qty, Chk01_IoR.$base_unit_qty);
			addColumnPathMap(ArrAct_DtlR.$base_unit_cd, Chk01_IoR.$base_unit_cd);
			addColumnPathMap(ArrAct_DtlR.$gd_cd, Chk01_IoR.$gd_cd);
			addColumnPathMap(ArrAct_DtlR.$arr_loc_cd, Chk01_IoR.$loc_cd);
			addColumnPathMap(ArrAct_DtlR.$str_ln_cd, Chk01_IoR.$str_ln_cd);
			addColumnPathMap(ArrAct_DtlR.$sno1, Chk01_IoR.$sno1);
			addColumnPathMap(ArrAct_DtlR.$sno2, Chk01_IoR.$sno2);
			addColumnPathMap(ArrAct_DtlR.$sno3, Chk01_IoR.$sno3);
			addColumnPathMap(ArrAct_DtlR.$sno4, Chk01_IoR.$sno4);
			addColumnPathMap(ArrAct_DtlR.$lot_no, Chk01_IoR.$lot_no);
			addColumnPathMap(ArrAct_DtlR.$sublot_no, Chk01_IoR.$sublot_no);
			addColumnPathMap(ArrAct_DtlR.$abort_flg, Chk01_IoR.$abort_flg);
			addColumnPathMap(ArrAct_DtlR.$arr_schd_no, Chk01_IoR.$arr_schd_no);
			addColumnPathMap(ArrAct_DtlR.$arr_act_no, Chk01_IoR.$arr_act_no);
			addColumnPathMap(ArrAct_DtlR.$ret_gd_cd, Chk01_IoR.$gd_cd);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			Chk01_DtlR dtl = _dtlL.getFirst(_idxKey, src.dtl_row_id());

			dest.arr_act_no(src.arr_act_no());

			//登録情報からコピー
			dest.trd_cd(_hdr.trd_cd());
			dest.arr_dpt_cd(_hdr.sls_dpt_cd());
			dest.arr_usr_cd(_hdr.sls_usr_cd());
			dest.cst_cd(_hdr.cst_cd());
			dest.arr_tm(_hdr.sls_ret_dt());
			dest.ac_dt(_hdr.ac_dt());
			dest.can_ac_dt(_hdr.can_ac_dt());
			dest.intr_rmrks(_hdr.intr_rmrks());
			dest.trd_rmrks(_hdr.trd_rmrks());
			dest.sub_char1(_hdr.sub_char1());
			dest.sub_char2(_hdr.sub_char2());
			dest.sub_char3(_hdr.sub_char3());
			dest.iv_no(_hdr.iv_no());
			dest.rqst_dpt_cd(_hdr.sls_dpt_cd());
			dest.rqst_usr_cd(_hdr.sls_usr_cd());

			//明細情報からコピー
			dest.itm_cd(dtl.itm_cd());
			dest.itm_sub1(dtl.itm_sub1());
			dest.itm_sub2(dtl.itm_sub2());
			dest.itm_sub3(dtl.itm_sub3());
			dest.itm_nm(dtl.itm_nm());
			dest.rcpt_iv_itm_nm(dtl.iv_itm_nm());
			dest.sundry_itm_flg(dtl.sundry_itm_flg());
			dest.stk_mng_typ(dtl.stk_mng_typ());
			dest.stk_bp_cd(_hdr.cst_cd());
			dest.trd_d_rmrks(dtl.trd_d_rmrks());
			dest.io_schd_pr_no(dtl.io_schd_pr_no());
			dest.sno1_mng_typ(dtl.sno1_mng_typ());
			dest.sno2_mng_typ(dtl.sno2_mng_typ());
			dest.sno3_mng_typ(dtl.sno3_mng_typ());
			dest.sno4_mng_typ(dtl.sno4_mng_typ());
			dest.sret_fr_cd(dtl.dlv_cd());
			dest.purc_cont_qty(getPurcContQty(src));
			dest.rsn_cd(dtl.ret_rsn_cd());
			if (!isNull(dtl.bd_dpt_cd())) {
				dtl.addDateColumn(Chk01_HdrR.$ac_dt);
				dtl.setDateNE(Chk01_HdrR.$ac_dt, _hdr.ac_dt());
				// 負担部門
				MAUCL_DptUtil.setDpt(dtl, Chk01_DtlR.$bd_dpt_cd, Chk01_HdrR.$ac_dt);
				dest.bd_dpt_cd(dtl.bd_dpt_cd());
				// 負担ＷＧ
				dest.bd_wg_cd(getBdWgCd(dtl.bd_dpt_cd()));
			}

			//固定値・定数値
			dest.data_crud_typ(getDataCrudTyp(src).value());
			dest.trd_ptn_typ(MAC_TRD_PTN_TYP.SLS_RTN.value());
			dest.quality_typ(MAC_QUALITY_TYP.GOOD.value());
			dest.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
			dest.stk_id_typ(MSC_STK_ID_TYP.RTN_PRE_ACCPT.value());
			dest.arr_ptn_typ(MSC_ARR_PTN_TYP.NRML.value());
			dest.sync_flg(true);

		}
		
		/**
		 * 負担部門ＷＧ取得
		 * @param bd_dpt_cd
		 * @return
		 */
		protected String getBdWgCd(String bd_dpt_cd) {
			MAM_DPT_R dptR = MAM_DPT_R.create("T");
			MCQueryApiBuilder dptR_bldr = MCQueryApiBuilder.create(dptR);
			dptR_bldr.setSelect(dptR.wg_cd);
			dptR_bldr.setWhere(dptR.dpt_cd.eq(bind("1")), bd_dpt_cd);
			dptR_bldr.addWhereWithAnd(dptR.bd_dpt_flg.eq(value(true)));
			dptR_bldr.addWhereWithAnd(bind("1").between(dptR.st_dt, dptR.end_dt), getToday());
			dbSelect("MSBBL1340_MAM_DPT_S01", dptR, dptR_bldr);
			if (isNull(dptR)) {
				return null;
			}
			return dptR.wg_cd();
		}
		
		protected MCNumber getPurcContQty(Chk01_IoR ioR) {
			MST_ARR_ACT_R arrR = MST_ARR_ACT_R.create("T");
			MCQueryApiBuilder arrR_bldr = MCQueryApiBuilder.create(arrR);
			MST_SLS_ACT_IO_R slsio = MST_SLS_ACT_IO_R.create("SLSIO");
			arrR_bldr.setSelect(arrR.purc_cont_qty);
			if (!isNull(ioR.ref_sls_act_io_no())) {
				arrR_bldr.addLeftOuterJoin(slsio, bracket( arrR.arr_act_no.eq(slsio.arr_act_no)));
				arrR_bldr.setWhere(slsio.sls_act_io_no.eq(bind("1")), ioR.ref_sls_act_io_no());
				arrR_bldr.addWhereWithAnd(slsio.sls_act_io_seq.eq(bind("1")), ioR.ref_sls_act_io_seq());
			}
			else {
				arrR_bldr.setWhere(arrR.arr_act_no.eq(bind("1")), ioR.arr_act_no());
			}
			dbSelect("MSBBL1340_MST_ARR_ACT_S04", arrR, arrR_bldr);
			if (!isNull(arrR)) {
				return arrR.purc_cont_qty();
			}
			return null;
		}

		protected MAC_DATA_CRUD_TYP getDataCrudTyp(Chk01_IoR ioR) {
			if (ioR.isStatusDelete()) {
				return MAC_DATA_CRUD_TYP.DEL;
			}
			else if (isNull(ioR.sls_act_io_no())) {
				return MAC_DATA_CRUD_TYP.CRT;
			}
			return MAC_DATA_CRUD_TYP.UPD;
		}
	}

	/**
	 * 	売上返品サービスの呼出(Ins01,Upd01共通)<br>
	 * 	{@link MSBBL_SlsRetService.SlsRet_Upd01}
	 */
	protected void callSlsRetSvUpd01(Chk01_HdrR hdr, MCList<Chk01_DtlR> dtlL,
			MCList<Chk01_IoR> ioL) {

		MSBBL_SlsRetService.SlsRet_Upd01 ope = MSBBL_SlsRetService.crtSlsRet_Upd01();
		SlsRet_Upd01_HdrR opeUp0 = ope.up0().createRow();
		copy(opeUp0, hdr, createMap_SlsRet_Upd01_HdrR_Chk01_HdrR());
		ope.up0().add(opeUp0);
		addAll(ope.up1(), dtlL, createMap_SlsRet_Upd01_DtlR_Chk01_DtlR());
		addAll(ope.up2(), ioL, createMap_SlsRet_Upd01_IoR_Chk01_IoR());
		ope.exec();

		String[] copyCols = {
				SlsRet_Upd01_RsltR.$sls_act_no, SlsRet_Upd01_RsltR.$sls_act_rev, SlsRet_Upd01_RsltR.$sls_act_seq,
				SlsRet_Upd01_RsltR.$iv_no, SlsRet_Upd01_RsltR.$dlv_slip_no
		};

		MCList<Chk01_HdrR> l = MCList.create(Chk01_HdrR.class);
		l.add(hdr);
		copyByPegNo(l, ope.down0(), Chk01_HdrR.$peg_no, copyCols,
				SlsRet_Upd01_RsltR.$hdr_peg_no, copyCols);
		// 売上返品サービス処理結果の全ヘッダ情報を取得
		_rsltHdrL.addAll(ope.down0());
	}

	/**
	 * RowMapper<br>
	 * 上り電文(Chk01_HdrR) ->売上返品サービス.上り電文(SlsRet_Upd01_HdrR)
	 * @return
	 */
	protected Map_SlsRet_Upd01_HdrR_Chk01_HdrR<SlsRet_Upd01_HdrR, Chk01_HdrR> createMap_SlsRet_Upd01_HdrR_Chk01_HdrR() {
		return new Map_SlsRet_Upd01_HdrR_Chk01_HdrR<SlsRet_Upd01_HdrR, Chk01_HdrR>();
	}

	public class Map_SlsRet_Upd01_HdrR_Chk01_HdrR<D extends SlsRet_Upd01_HdrR, S extends Chk01_HdrR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(SlsRet_Upd01_HdrR.$hdr_peg_no, Chk01_HdrR.$peg_no);
			addColumnPathMap(SlsRet_Upd01_HdrR.$sls_ret_schd_no,
					Chk01_HdrR.$sls_ret_schd_no);
			addColumnPathMap(SlsRet_Upd01_HdrR.$sls_act_no, Chk01_HdrR.$sls_act_no);
			addColumnPathMap(SlsRet_Upd01_HdrR.$sls_act_seq, Chk01_HdrR.$sls_act_seq);
			addColumnPathMap(SlsRet_Upd01_HdrR.$sls_act_rev, Chk01_HdrR.$sls_act_rev);
			addColumnPathMap(SlsRet_Upd01_HdrR.$trd_cd, Chk01_HdrR.$trd_cd);
			addColumnPathMap(SlsRet_Upd01_HdrR.$dlv_slip_no, Chk01_HdrR.$dlv_slip_no);
			addColumnPathMap(SlsRet_Upd01_HdrR.$iv_no, Chk01_HdrR.$iv_no);
			addColumnPathMap(SlsRet_Upd01_HdrR.$ref_iv_no, Chk01_HdrR.$ref_iv_no);
			addColumnPathMap(SlsRet_Upd01_HdrR.$ac_dt, Chk01_HdrR.$ac_dt);
			addColumnPathMap(SlsRet_Upd01_HdrR.$can_ac_dt, Chk01_HdrR.$can_ac_dt);
			addColumnPathMap(SlsRet_Upd01_HdrR.$ret_dt, Chk01_HdrR.$sls_ret_dt);
			addColumnPathMap(SlsRet_Upd01_HdrR.$bill_basis_dt, Chk01_HdrR.$bill_basis_dt);
			addColumnPathMap(SlsRet_Upd01_HdrR.$rcv_schd_dt, Chk01_HdrR.$rcv_schd_dt);
			addColumnPathMap(SlsRet_Upd01_HdrR.$cst_cd, Chk01_HdrR.$cst_cd);
			addColumnPathMap(SlsRet_Upd01_HdrR.$sls_usr_cd, Chk01_HdrR.$sls_usr_cd);
			addColumnPathMap(SlsRet_Upd01_HdrR.$sls_dpt_cd, Chk01_HdrR.$sls_dpt_cd);
			addColumnPathMap(SlsRet_Upd01_HdrR.$wg_cd, Chk01_HdrR.$wg_cd);
			addColumnPathMap(SlsRet_Upd01_HdrR.$cst_po_no, Chk01_HdrR.$cst_po_no);
			addColumnPathMap(SlsRet_Upd01_HdrR.$bcst_cd, Chk01_HdrR.$bcst_cd);
			addColumnPathMap(SlsRet_Upd01_HdrR.$cred_cd, Chk01_HdrR.$cred_cd);
			addColumnPathMap(SlsRet_Upd01_HdrR.$acst_cd, Chk01_HdrR.$acst_cd);
			addColumnPathMap(SlsRet_Upd01_HdrR.$ar_dpt_cd, Chk01_HdrR.$ar_dpt_cd);
			addColumnPathMap(SlsRet_Upd01_HdrR.$trd_rmrks, Chk01_HdrR.$trd_rmrks);
			addColumnPathMap(SlsRet_Upd01_HdrR.$intr_rmrks, Chk01_HdrR.$intr_rmrks);
			addColumnPathMap(SlsRet_Upd01_HdrR.$tterm_cd1, Chk01_HdrR.$tterm_cd1);
			addColumnPathMap(SlsRet_Upd01_HdrR.$tterm_rmrks1, Chk01_HdrR.$tterm_rmrks1);
			addColumnPathMap(SlsRet_Upd01_HdrR.$tterm_cd2, Chk01_HdrR.$tterm_cd2);
			addColumnPathMap(SlsRet_Upd01_HdrR.$tterm_rmrks2, Chk01_HdrR.$tterm_rmrks2);
			addColumnPathMap(SlsRet_Upd01_HdrR.$tterm_cd3, Chk01_HdrR.$tterm_cd3);
			addColumnPathMap(SlsRet_Upd01_HdrR.$tterm_rmrks3, Chk01_HdrR.$tterm_rmrks3);
			addColumnPathMap(SlsRet_Upd01_HdrR.$sub_char1, Chk01_HdrR.$sub_char1);
			addColumnPathMap(SlsRet_Upd01_HdrR.$sub_char2, Chk01_HdrR.$sub_char2);
			addColumnPathMap(SlsRet_Upd01_HdrR.$sub_char3, Chk01_HdrR.$sub_char3);
			addColumnPathMap(SlsRet_Upd01_HdrR.$dlv_slip_prnt_flg,
					Chk01_HdrR.$dlv_slip_out_flg);
			addColumnPathMap(SlsRet_Upd01_HdrR.$trd_cur_cd, Chk01_HdrR.$trd_cur_cd);
			addColumnPathMap(SlsRet_Upd01_HdrR.$base_cur_cd, Chk01_HdrR.$base_cur_cd);
			addColumnPathMap(SlsRet_Upd01_HdrR.$xrate_inpt_flg,
					Chk01_HdrR.$xrate_inpt_flg);
			addColumnPathMap(SlsRet_Upd01_HdrR.$xrate_cd, Chk01_HdrR.$xrate_cd);
			addColumnPathMap(SlsRet_Upd01_HdrR.$xrate, Chk01_HdrR.$xrate);
			addColumnPathMap(SlsRet_Upd01_HdrR.$ptax_cur_cd, Chk01_HdrR.$ptax_cur_cd);
			addColumnPathMap(SlsRet_Upd01_HdrR.$ptax_xrate_inpt_flg,
					Chk01_HdrR.$ptax_xrate_inpt_flg);
			addColumnPathMap(SlsRet_Upd01_HdrR.$ptax_xrate, Chk01_HdrR.$ptax_xrate);
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
			dest.trd_ptn_typ(MAC_TRD_PTN_TYP.SLS_RTN.value());
			dest.indiv_prnt_flg(true);
			dest.amt_calc_flg(false);
		}
	}

	/**
	 * RowMapper<br>
	 *  上り電文(Chk01_DtlR) -> 売上返品サービス.上り電文(SlsRet_Upd01_DtlR)
	 * @return
	 */
	protected Map_SlsRet_Upd01_DtlR_Chk01_DtlR<SlsRet_Upd01_DtlR, Chk01_DtlR> createMap_SlsRet_Upd01_DtlR_Chk01_DtlR() {
		return new Map_SlsRet_Upd01_DtlR_Chk01_DtlR<SlsRet_Upd01_DtlR, Chk01_DtlR>();
	}

	public class Map_SlsRet_Upd01_DtlR_Chk01_DtlR<D extends SlsRet_Upd01_DtlR, S extends Chk01_DtlR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(SlsRet_Upd01_DtlR.$hdr_peg_no, Chk01_DtlR.$peg_no);
			addColumnPathMap(SlsRet_Upd01_DtlR.$dtl_peg_no, Chk01_DtlR.$dtl_peg_no);
			addColumnPathMap(SlsRet_Upd01_DtlR.$sls_act_d_no, Chk01_DtlR.$sls_act_d_no);
			addColumnPathMap(SlsRet_Upd01_DtlR.$sls_act_d_seq, Chk01_DtlR.$sls_act_d_seq);
			addColumnPathMap(SlsRet_Upd01_DtlR.$sls_ret_schd_d_no,
					Chk01_DtlR.$sls_ret_schd_d_no);
			addColumnPathMap(SlsRet_Upd01_DtlR.$disp_seq, Chk01_DtlR.$disp_seq);
			addColumnPathMap(SlsRet_Upd01_DtlR.$itm_cd, Chk01_DtlR.$itm_cd);
			addColumnPathMap(SlsRet_Upd01_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub1);
			addColumnPathMap(SlsRet_Upd01_DtlR.$itm_sub2, Chk01_DtlR.$itm_sub2);
			addColumnPathMap(SlsRet_Upd01_DtlR.$itm_sub3, Chk01_DtlR.$itm_sub3);
			addColumnPathMap(SlsRet_Upd01_DtlR.$itm_nm, Chk01_DtlR.$itm_nm);
			addColumnPathMap(SlsRet_Upd01_DtlR.$iv_itm_nm, Chk01_DtlR.$iv_itm_nm);
			addColumnPathMap(SlsRet_Upd01_DtlR.$stk_mng_typ, Chk01_DtlR.$stk_mng_typ);
			addColumnPathMap(SlsRet_Upd01_DtlR.$itm_jnl_cd, Chk01_DtlR.$itm_jnl_cd);
			addColumnPathMap(SlsRet_Upd01_DtlR.$sundry_itm_flg,
					Chk01_DtlR.$sundry_itm_flg);
			addColumnPathMap(SlsRet_Upd01_DtlR.$sno1_mng_typ, Chk01_DtlR.$sno1_mng_typ);
			addColumnPathMap(SlsRet_Upd01_DtlR.$sno2_mng_typ, Chk01_DtlR.$sno2_mng_typ);
			addColumnPathMap(SlsRet_Upd01_DtlR.$sno3_mng_typ, Chk01_DtlR.$sno3_mng_typ);
			addColumnPathMap(SlsRet_Upd01_DtlR.$sno4_mng_typ, Chk01_DtlR.$sno4_mng_typ);
			addColumnPathMap(SlsRet_Upd01_DtlR.$dlv_cd, Chk01_DtlR.$dlv_cd);
			addColumnPathMap(SlsRet_Upd01_DtlR.$dlv_sundry_flg,
					Chk01_DtlR.$dlv_sundry_flg);
			addColumnPathMap(SlsRet_Upd01_DtlR.$dlv_nm, Chk01_DtlR.$dlv_nm);
			addColumnPathMap(SlsRet_Upd01_DtlR.$dlv_cntct_dpt, Chk01_DtlR.$dlv_cntct_dpt);
			addColumnPathMap(SlsRet_Upd01_DtlR.$dlv_cntct_psn, Chk01_DtlR.$dlv_cntct_psn);
			addColumnPathMap(SlsRet_Upd01_DtlR.$dlv_zip_cd, Chk01_DtlR.$dlv_zip_cd);
			addColumnPathMap(SlsRet_Upd01_DtlR.$dlv_addr1, Chk01_DtlR.$dlv_addr1);
			addColumnPathMap(SlsRet_Upd01_DtlR.$dlv_addr2, Chk01_DtlR.$dlv_addr2);
			addColumnPathMap(SlsRet_Upd01_DtlR.$dlv_addr3, Chk01_DtlR.$dlv_addr3);
			addColumnPathMap(SlsRet_Upd01_DtlR.$dlv_addr4, Chk01_DtlR.$dlv_addr4);
			addColumnPathMap(SlsRet_Upd01_DtlR.$dlv_tel, Chk01_DtlR.$dlv_tel);
			addColumnPathMap(SlsRet_Upd01_DtlR.$dlv_fax, Chk01_DtlR.$dlv_fax);
			addColumnPathMap(SlsRet_Upd01_DtlR.$pri_prnt_flg, Chk01_DtlR.$pri_prnt_flg);
			addColumnPathMap(SlsRet_Upd01_DtlR.$dest_cd1, Chk01_DtlR.$dest_cd1);
			addColumnPathMap(SlsRet_Upd01_DtlR.$dest_cd2, Chk01_DtlR.$dest_cd2);
			addColumnPathMap(SlsRet_Upd01_DtlR.$dest_cd3, Chk01_DtlR.$dest_cd3);
			addColumnPathMap(SlsRet_Upd01_DtlR.$purc_act_no, Chk01_DtlR.$purc_act_no);
			addColumnPathMap(SlsRet_Upd01_DtlR.$purc_act_d_no, Chk01_DtlR.$purc_act_d_no);
			addColumnPathMap(SlsRet_Upd01_DtlR.$sppl_cd, Chk01_DtlR.$sppl_cd);
			addColumnPathMap(SlsRet_Upd01_DtlR.$cntry_org_cd, Chk01_DtlR.$cntry_org_cd);
			addColumnPathMap(SlsRet_Upd01_DtlR.$trd_unit_cd, Chk01_DtlR.$trd_unit_cd);
			addColumnPathMap(SlsRet_Upd01_DtlR.$trd_unit_qty, Chk01_DtlR.$trd_unit_qty);
			addColumnPathMap(SlsRet_Upd01_DtlR.$base_unit_cd, Chk01_DtlR.$base_unit_cd);
			addColumnPathMap(SlsRet_Upd01_DtlR.$base_unit_qty, Chk01_DtlR.$base_unit_qty);
			addColumnPathMap(SlsRet_Upd01_DtlR.$gd_cd, Chk01_DtlR.$gd_cd);
			addColumnPathMap(SlsRet_Upd01_DtlR.$sno1, Chk01_DtlR.$sno1);
			addColumnPathMap(SlsRet_Upd01_DtlR.$sno2, Chk01_DtlR.$sno2);
			addColumnPathMap(SlsRet_Upd01_DtlR.$sno3, Chk01_DtlR.$sno3);
			addColumnPathMap(SlsRet_Upd01_DtlR.$sno4, Chk01_DtlR.$sno4);
			addColumnPathMap(SlsRet_Upd01_DtlR.$wrk_no, Chk01_DtlR.$wrk_no);
			addColumnPathMap(SlsRet_Upd01_DtlR.$loc_cd, Chk01_DtlR.$loc_cd);
			addColumnPathMap(SlsRet_Upd01_DtlR.$str_ln_cd, Chk01_DtlR.$str_ln_cd);
			addColumnPathMap(SlsRet_Upd01_DtlR.$lot_no, Chk01_DtlR.$lot_no);
			addColumnPathMap(SlsRet_Upd01_DtlR.$sublot_no, Chk01_DtlR.$sublot_no);
			addColumnPathMap(SlsRet_Upd01_DtlR.$cst_po_d_no, Chk01_DtlR.$cst_po_d_no);
			addColumnPathMap(SlsRet_Upd01_DtlR.$cst_itm_cd, Chk01_DtlR.$cst_itm_cd);
			addColumnPathMap(SlsRet_Upd01_DtlR.$cst_itm_nm, Chk01_DtlR.$cst_itm_nm);
			addColumnPathMap(SlsRet_Upd01_DtlR.$ret_rsn_cd, Chk01_DtlR.$ret_rsn_cd);
			addColumnPathMap(SlsRet_Upd01_DtlR.$bd_dpt_cd, Chk01_DtlR.$bd_dpt_cd);
			addColumnPathMap(SlsRet_Upd01_DtlR.$trd_d_rmrks, Chk01_DtlR.$trd_d_rmrks);
			addColumnPathMap(SlsRet_Upd01_DtlR.$intr_rmrks, Chk01_DtlR.$intr_rmrks);
			addColumnPathMap(SlsRet_Upd01_DtlR.$sub_char1, Chk01_DtlR.$sub_char1);
			addColumnPathMap(SlsRet_Upd01_DtlR.$sub_char2, Chk01_DtlR.$sub_char2);
			addColumnPathMap(SlsRet_Upd01_DtlR.$sub_char3, Chk01_DtlR.$sub_char3);
			addColumnPathMap(SlsRet_Upd01_DtlR.$ref_sls_act_no,
					Chk01_DtlR.$ref_sls_act_no);
			addColumnPathMap(SlsRet_Upd01_DtlR.$ref_sls_act_seq,
					Chk01_DtlR.$ref_sls_act_seq);
			addColumnPathMap(SlsRet_Upd01_DtlR.$ref_sls_act_d_no,
					Chk01_DtlR.$ref_sls_act_d_no);
			addColumnPathMap(SlsRet_Upd01_DtlR.$ref_sls_act_d_seq,
					Chk01_DtlR.$ref_sls_act_d_seq);
			addColumnPathMap(SlsRet_Upd01_DtlR.$base_sls_ac_dt, Chk01_DtlR.$base_sls_ac_dt);
			addColumnPathMap(SlsRet_Upd01_DtlR.$slo_no, Chk01_DtlR.$slo_no);
			addColumnPathMap(SlsRet_Upd01_DtlR.$slo_d_no, Chk01_DtlR.$slo_d_no);
			addColumnPathMap(SlsRet_Upd01_DtlR.$abort_qty, Chk01_DtlR.$abort_qty);
			addColumnPathMap(SlsRet_Upd01_DtlR.$bill_crryovr_times,
					Chk01_DtlR.$bill_crryovr_times);
			addColumnPathMap(SlsRet_Upd01_DtlR.$dlv_slip_d_no, Chk01_DtlR.$dlv_slip_d_no);
			addColumnPathMap(SlsRet_Upd01_DtlR.$trd_cur_upri, Chk01_DtlR.$trd_cur_upri);
			addColumnPathMap(SlsRet_Upd01_DtlR.$trd_cur_amt, Chk01_DtlR.$trd_cur_amt);
			addColumnPathMap(SlsRet_Upd01_DtlR.$trd_cur_tax_amt, Chk01_DtlR.$trd_cur_tax_amt);
			addColumnPathMap(SlsRet_Upd01_DtlR.$base_cur_upri, Chk01_DtlR.$base_cur_upri);
			addColumnPathMap(SlsRet_Upd01_DtlR.$base_cur_amt, Chk01_DtlR.$base_cur_amt);
			addColumnPathMap(SlsRet_Upd01_DtlR.$base_cur_tax_amt, Chk01_DtlR.$base_cur_tax_amt);
			addColumnPathMap(SlsRet_Upd01_DtlR.$base_cur_dscnt_amt, Chk01_DtlR.$base_cur_dscnt_amt);
			addColumnPathMap(SlsRet_Upd01_DtlR.$ptax_cur_upri, Chk01_DtlR.$ptax_cur_upri);
			addColumnPathMap(SlsRet_Upd01_DtlR.$ptax_cur_amt, Chk01_DtlR.$ptax_cur_amt);
			addColumnPathMap(SlsRet_Upd01_DtlR.$ptax_cur_tax_amt, Chk01_DtlR.$ptax_cur_tax_amt);
			addColumnPathMap(SlsRet_Upd01_DtlR.$ptax_cur_dscnt_amt, Chk01_DtlR.$ptax_cur_dscnt_amt);
			addColumnPathMap(SlsRet_Upd01_DtlR.$upri_not_tgt_flg,
					Chk01_DtlR.$upri_not_tgt_flg);
			addColumnPathMap(SlsRet_Upd01_DtlR.$interim_flg, Chk01_DtlR.$interim_flg);
			addColumnPathMap(SlsRet_Upd01_DtlR.$trd_cur_dscnt_amt,
					Chk01_DtlR.$trd_cur_dscnt_amt);
			addColumnPathMap(SlsRet_Upd01_DtlR.$dscnt_rsn_cd, Chk01_DtlR.$dscnt_rsn_cd);
			addColumnPathMap(SlsRet_Upd01_DtlR.$cost_upri, Chk01_DtlR.$cost_upri);
			addColumnPathMap(SlsRet_Upd01_DtlR.$tax_fix_flg, Chk01_DtlR.$tax_fix_flg);
			addColumnPathMap(SlsRet_Upd01_DtlR.$tax_cd, Chk01_DtlR.$tax_cd);
			addColumnPathMap(SlsRet_Upd01_DtlR.$inc_tax_flg, Chk01_DtlR.$inc_tax_flg);
			addColumnPathMap(SlsRet_Upd01_DtlR.$tax_rate, Chk01_DtlR.$tax_rate);
			addColumnPathMap(SlsRet_Upd01_DtlR.$tax_typ, Chk01_DtlR.$tax_typ);
			addColumnPathMap(SlsRet_Upd01_DtlR.$wtax_rate, Chk01_DtlR.$wtax_rate);
			addColumnPathMap(SlsRet_Upd01_DtlR.$purc_ddlv_po_no, Chk01_DtlR.$purc_ddlv_po_no);
			addColumnPathMap(SlsRet_Upd01_DtlR.$scrn_trd_cur_amt, Chk01_DtlR.$trd_cur_amt);
			addColumnPathMap(SlsRet_Upd01_DtlR.$scrn_trd_cur_tax_amt, Chk01_DtlR.$trd_cur_tax_amt);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			if (isNull(src.abort_qty())) {
				dest.abort_qty(0);
			}

			if (src.isStatusDelete()) {
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
			else if (isNull(src.sls_act_d_no())) {
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			}
			else {
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			}
		}
	}

	/**
	 * RowMapper<br>
	 *  上り電文(Chk01_IoR) -> 売上返品サービス.上り電文(SlsRet_Upd01_IoR)
	 * @return
	 */
	protected Map_SlsRet_Upd01_IoR_Chk01_IoR<SlsRet_Upd01_IoR, Chk01_IoR> createMap_SlsRet_Upd01_IoR_Chk01_IoR() {
		return new Map_SlsRet_Upd01_IoR_Chk01_IoR<SlsRet_Upd01_IoR, Chk01_IoR>();
	}

	public class Map_SlsRet_Upd01_IoR_Chk01_IoR<D extends SlsRet_Upd01_IoR, S extends Chk01_IoR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(SlsRet_Upd01_IoR.$hdr_peg_no, Chk01_IoR.$peg_no);
			addColumnPathMap(SlsRet_Upd01_IoR.$dtl_peg_no, Chk01_IoR.$dtl_peg_no);
			addColumnPathMap(SlsRet_Upd01_IoR.$io_peg_no, Chk01_IoR.$io_peg_no);
			addColumnPathMap(SlsRet_Upd01_IoR.$sls_act_io_no, Chk01_IoR.$sls_act_io_no);
			addColumnPathMap(SlsRet_Upd01_IoR.$sls_act_io_seq, Chk01_IoR.$sls_act_io_seq);
			addColumnPathMap(SlsRet_Upd01_IoR.$sls_ret_schd_d_no,
					Chk01_IoR.$sls_ret_schd_d_no);
			addColumnPathMap(SlsRet_Upd01_IoR.$trd_unit_cd, Chk01_IoR.$trd_unit_cd);
			addColumnPathMap(SlsRet_Upd01_IoR.$trd_unit_qty, Chk01_IoR.$trd_unit_qty);
			addColumnPathMap(SlsRet_Upd01_IoR.$base_unit_cd, Chk01_IoR.$base_unit_cd);
			addColumnPathMap(SlsRet_Upd01_IoR.$base_unit_qty, Chk01_IoR.$base_unit_qty);
			addColumnPathMap(SlsRet_Upd01_IoR.$pack_unit_cd, Chk01_IoR.$pack_unit_cd);
			addColumnPathMap(SlsRet_Upd01_IoR.$pack_unit_qty, Chk01_IoR.$pack_unit_qty);
			addColumnPathMap(SlsRet_Upd01_IoR.$gd_cd, Chk01_IoR.$gd_cd);
			addColumnPathMap(SlsRet_Upd01_IoR.$loc_cd, Chk01_IoR.$loc_cd);
			addColumnPathMap(SlsRet_Upd01_IoR.$str_ln_cd, Chk01_IoR.$str_ln_cd);
			addColumnPathMap(SlsRet_Upd01_IoR.$lot_no, Chk01_IoR.$lot_no);
			addColumnPathMap(SlsRet_Upd01_IoR.$sublot_no, Chk01_IoR.$sublot_no);
			addColumnPathMap(SlsRet_Upd01_IoR.$sno1, Chk01_IoR.$sno1);
			addColumnPathMap(SlsRet_Upd01_IoR.$sno2, Chk01_IoR.$sno2);
			addColumnPathMap(SlsRet_Upd01_IoR.$sno3, Chk01_IoR.$sno3);
			addColumnPathMap(SlsRet_Upd01_IoR.$sno4, Chk01_IoR.$sno4);
			addColumnPathMap(SlsRet_Upd01_IoR.$arr_act_no, Chk01_IoR.$arr_act_no);
			addColumnPathMap(SlsRet_Upd01_IoR.$purc_act_io_no, Chk01_IoR.$purc_act_io_no);
			addColumnPathMap(SlsRet_Upd01_IoR.$sync_flg, Chk01_IoR.$sync_flg);
			addColumnPathMap(SlsRet_Upd01_IoR.$sls_ret_schd_abort_flg,
					Chk01_IoR.$abort_flg);
			addColumnPathMap(SlsRet_Upd01_IoR.$sub_char1, Chk01_IoR.$sub_char1);
			addColumnPathMap(SlsRet_Upd01_IoR.$sub_char2, Chk01_IoR.$sub_char2);
			addColumnPathMap(SlsRet_Upd01_IoR.$sub_char3, Chk01_IoR.$sub_char3);

		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			if (src.isStatusDelete()) {
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
			else if (isNull(src.sls_act_io_no())) {
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			}
			else {
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			}
		}
	}

	/**
	 * 	仕入返品サービスの呼出 (Upd01)<br>
	 * 	{@link MSBDL_PurcRetRegService.PurcRet_Upd01}
	 */
	protected void callPurcRetSvUpd01(Chk01_HdrR hdr, MCList<Chk01_DtlR> dtlL,
			MCList<Chk01_IoR> ioL) {
		
		if (!hdr.purc_ret_tgt_flg()) {
			return;
		}

		MCList<MST_SLS_ACT_D_R> slsActDL = MCList.create(MST_SLS_ACT_D_R.class);
		slsActDL.addNumberColumn("dec_place");
		slsActDL.addNumberColumn("purc_cont_qty");
		slsActDL.addStringColumn("purc_bd_dpt_cd");
		MST_SLS_ACT_D_R slsActDL_t = MST_SLS_ACT_D_R.create("T");
		MCQueryApiBuilder slsActDL_bldr = MCQueryApiBuilder.create(slsActDL_t);
		MAM_UNIT_R unit = MAM_UNIT_R.create("UNIT");
		MAM_ITM_R itm = MAM_ITM_R.create("ITM");
		MST_PURC_ACT_D_R t2 = MST_PURC_ACT_D_R.create("T2");
		MST_PURC_ACT_D_R S1W1 = MST_PURC_ACT_D_R.create("W1");
		MST_PURC_ACT_R S1W2 = MST_PURC_ACT_R.create("W2");
		slsActDL_bldr.addSelect(unit.dec_place);
		slsActDL_bldr.addSelect(itm.sno1_mng_typ);
		slsActDL_bldr.addSelect(itm.sno2_mng_typ);
		slsActDL_bldr.addSelect(itm.sno3_mng_typ);
		slsActDL_bldr.addSelect(itm.sno4_mng_typ);
		slsActDL_bldr.addSelect(t2.bd_dpt_cd.as("purc_bd_dpt_cd"));
		slsActDL_bldr.setWhere(slsActDL_t.sls_act_no.eq(bind("sls_act_no")));
		slsActDL_bldr.addWhereWithAnd(slsActDL_t.sls_act_seq.eq(bind("sls_act_seq")));
		slsActDL_bldr.addLeftOuterJoin(unit, bracket( slsActDL_t.trd_unit_cd.eq(unit.unit_cd)));
		slsActDL_bldr.addLeftOuterJoin(itm,
				bracket(slsActDL_t.itm_cd.eq(itm.itm_cd)
						.and(slsActDL_t.itm_sub1.eq(itm.itm_sub1))
						.and(slsActDL_t.itm_sub2.eq(itm.itm_sub2))
						.and(slsActDL_t.itm_sub3.eq(itm.itm_sub3))));
		slsActDL_bldr.addLeftOuterJoin(t2, bracket(slsActDL_t.purc_act_d_no.eq(t2.purc_act_d_no)
				.and(t2.purc_act_d_seq.eq(subQuery().select(max(S1W1.purc_act_d_seq))
						.from(S1W1.innerJoin(S1W2).on(S1W1.purc_act_no.eq(S1W2.purc_act_no)
										.and(S1W1.purc_act_seq.eq(S1W2.purc_act_seq))
										.and(S1W2.slip_sts_typ.neq(value(MAC_SLIP_STS_TYP.CAN.value())))))
						.where(S1W1.purc_act_d_no.eq(slsActDL_t.purc_act_d_no))))));
		dbSelect("MSBBL1340_MST_SLS_ACT_D_S04", slsActDL, slsActDL_bldr, hdr);
		
		for (Chk01_DtlR dtlR : dtlL) {
			if (dtlR.isStatusDelete()) {
				MST_SLS_ACT_D_R addDelR = MST_SLS_ACT_D_R.create();
				copy(addDelR, dtlR , createMap_MST_SLS_ACT_D_R_Chk01_DtlR());
				slsActDL.add(addDelR);
			}
		}
		MCIndexKey idxKey = slsActDL.createIndex(Chk01_DtlR.$sls_act_d_no);
		MCList<MST_SLS_ACT_D_R> tmpDelL = MCList.create(MST_SLS_ACT_D_R.class);
		for (Chk01_DtlR dtlR : dtlL) {
			if (!dtlR.isStatusDelete() && isNull(slsActDL.getFirst(idxKey, dtlR.sls_act_d_no()))) {
				MST_SLS_ACT_D_R addDelR = MST_SLS_ACT_D_R.create();
				dtlR.setStatus(DELETE);
				copy(addDelR, dtlR , createMap_MST_SLS_ACT_D_R_Chk01_DtlR());
				tmpDelL.add(addDelR);
			}
		}
		if (!isNull(tmpDelL) && tmpDelL.size() > 0) {
			slsActDL.addAll(tmpDelL);
		}
		
		MCList<MST_SLS_ACT_IO_R> slsActIoL = MCList.create(MST_SLS_ACT_IO_R.class);
		slsActIoL.addNumberColumn("dec_place");
		slsActIoL.addNumberColumn("purc_cont_qty");
		MST_SLS_ACT_IO_R slsActIoL_t = MST_SLS_ACT_IO_R.create("T");
		MCQueryApiBuilder slsActIoL_bldr = MCQueryApiBuilder.create(slsActIoL_t);
		MST_ARR_ACT_R arr = MST_ARR_ACT_R.create("ARR");
		slsActIoL_bldr.addSelect(unit.dec_place.as("dec_place"));
		slsActIoL_bldr.addSelect(arr.purc_cont_qty.as("purc_cont_qty"));
		slsActIoL_bldr.setWhere(slsActIoL_t.sls_act_d_no.eq(bind("sls_act_d_no")));
		slsActIoL_bldr.addWhereWithAnd(slsActIoL_t.sls_act_d_seq.eq(bind("sls_act_d_seq")));
		slsActIoL_bldr.addLeftOuterJoin(unit, bracket( slsActIoL_t.base_unit_cd.eq(unit.unit_cd)));
		slsActIoL_bldr.addLeftOuterJoin(arr, bracket( slsActIoL_t.arr_act_no.eq(arr.arr_act_no)));
		dbSelect("MSBBL1340_MST_SLS_ACT_IO_S02", slsActIoL, slsActIoL_bldr, slsActDL);
		for (Chk01_IoR IoR : ioL) {
			if (IoR.isStatusDelete()) {
				Chk01_DtlR tmpDtlR = dtlL.getFirst(Chk01_DtlR.$dtl_peg_no, IoR.dtl_peg_no());
				if (!tmpDtlR.isStatusDelete()) {
					MST_SLS_ACT_IO_R addDelR = MST_SLS_ACT_IO_R.create();
					copy(addDelR, IoR, createMap_MST_SLS_ACT_IO_R_Chk01_IoR());
					addDelR.sls_act_d_no(tmpDtlR.sls_act_d_no());
					slsActIoL.add(addDelR);
				}
			}
		}
		
		// チェック処理
		MSBDL_PurcRetRegService.PurcRet_Chk02 chkOpe = MSBDL_PurcRetRegService.crtPurcRet_Chk02();
		MCList<HdrR> chkUp0L = MCList.create(HdrR.class);
		MCList<Chk01_DtlR> tmpDtlL = dtlL.subList(CREATE, MODIFY, NONE, DELETE);
		tmpDtlL.sort(Chk01_DtlR.$purc_ret_act_no);

		String tmpPurcRetActNo = null;
		for (int i = 0; i < tmpDtlL.size(); i++) {
			Chk01_DtlR tmpDtlR = tmpDtlL.get(i);
			if (i != 0 && isSame(tmpPurcRetActNo, tmpDtlR.purc_ret_act_no())) {
				continue;
			}
			tmpPurcRetActNo = tmpDtlR.purc_ret_act_no();
			HdrR chkUp0 = chkOpe.up0().createRow();
			hdr.peg_no(i + 1);
			copy(chkUp0, hdr, createMap_HdrR_Chk01_HdrR(tmpDtlR, slsActDL.subList(MST_SLS_ACT_D_R.$sls_act_d_no, tmpDtlR.sls_act_d_no()).get(0)));
			// ヘッダ情報
			chkUp0L.add(chkUp0);
			
			// ヘッダ情報に紐付く明細情報
			MCList<Chk01_DtlR> subDtlL = tmpDtlL.subList(Chk01_DtlR.$purc_ret_act_no, hdr.getStringNE("purc_ret_act_no"));
			DtlL<DtlR> purcDtlL = chkOpe.up1().createInstance();
			for (Chk01_DtlR subDtlR : subDtlL) {
				MCList<MST_SLS_ACT_D_R> tmpSlsActDL = slsActDL.subList(MST_SLS_ACT_D_R.$sls_act_d_no, subDtlR.sls_act_d_no());
				addAll(purcDtlL, tmpSlsActDL, createMap_DtlR_MST_SLS_ACT_D_R(hdr, subDtlL));
			}
			setDispSeq(purcDtlL);
			chkOpe.up1().addAll(purcDtlL);
		}
		chkOpe.up0().addAll(chkUp0L);
		propPurcContQty(slsActDL, slsActIoL);
		// 詳細情報
		addAll(chkOpe.up2(), slsActIoL, createMap_IoR_MST_SLS_ACT_IO_R(dtlL, ioL));
		
		copyGUIIndex(chkOpe, dtlL, ioL);
		
		// 明細・詳細紐付けＮＯ設定
		int pegNo = 0;
		int ioPegNo = 0;
		for (MST_SLS_ACT_D_R slsActDR : slsActDL) {
			pegNo++;
			DtlL<DtlR> tmpDL = chkOpe.up1().subList(DtlR.$sls_act_d_no, slsActDR.sls_act_d_no());
			tmpDL.get(0).peg_no(pegNo);
			MCList<MST_SLS_ACT_IO_R> tmpSlsIoL = slsActIoL.subList(MST_SLS_ACT_IO_R.$sls_act_d_no, slsActDR.sls_act_d_no());
			for (MST_SLS_ACT_IO_R tmpSlsIoR : tmpSlsIoL) {
				IoL<IoR> tmpIoL = chkOpe.up2().subList(IoR.$sls_act_io_no, tmpSlsIoR.sls_act_io_no());
				tmpIoL.get(0).dtl_peg_no(pegNo);
				tmpIoL.get(0).peg_no(++ioPegNo);
			}
		}
		
		// 部門組織変更対応
		// 購買部門
		MAUCL_DptUtil.setDpt(chkOpe.up0(), HdrR.$purc_dpt_cd, null, HdrR.$ac_dt, true);
		if (chkOpe.up0().subList("err_flg", true).size() > 0) {
			throwDptErr();
		}
		// 購買ＷＧの取得
		for (HdrR hdrR : chkOpe.up0()) {
			hdrR.wg_cd(getWgCd(hdrR.purc_dpt_cd(), hdrR.ac_dt()));
		}
		
		chkOpe.up1().addDateColumn(HdrR.$ac_dt);
		chkOpe.up1().setDateNE(HdrR.$ac_dt, chkOpe.up0().get(0).ac_dt());
		// 債務部門
		MAUCL_DptUtil.setDpt(chkOpe.up1(), DtlR.$ap_dpt_cd, null, HdrR.$ac_dt, true);
		if (chkOpe.up1().subList("err_flg", true).size() > 0) {
			throwDptErr();
		}
		
		// 負担部門
		MAUCL_DptUtil.setDpt(chkOpe.up1(), DtlR.$bd_dpt_cd, null, HdrR.$ac_dt, true);
		if (chkOpe.up1().subList("err_flg", true).size() > 0) {
			throwDptErr();
		}
		
		chkOpe.exec();
		MSBDL_PurcRetRegService.PurcRet_Upd01 ope = MSBDL_PurcRetRegService.crtPurcRet_Upd01();
		
		HdrL<HdrR> up0 = ope.up0().createInstance();
		DtlL<DtlR> up1 = ope.up1().createInstance();
		IoL<IoR> up2 = ope.up2().createInstance();
		
		up0.addAll(chkOpe.up0());
		up1.addAll(chkOpe.up1());
		up2.addAll(chkOpe.up2());
		
		copyErrFlg(up0, chkOpe.down0());
		copyErrFlg(up1, chkOpe.down1());
		copyErrFlg(up2, chkOpe.down2());
		
		ope.up0().addAll(up0.subList(HdrR.$err_flg, false));
		ope.up0().forEach(r -> {
			r.indiv_prnt_flg(true);
			r.amt_calc_flg(true);
		});
		ope.up1().addAll(up1.subList(DtlR.$err_flg, false));
		ope.up2().addAll(up2.subList(IoR.$err_flg, false));
		
		// 登録処理
		if (ope.up0().size() != 0) {
			ope.exec();
		}
	}
	
	protected void copyGUIIndex(MSBDL_PurcRetRegService.PurcRet_Chk02 chkOpe, MCList<Chk01_DtlR> dtlL, MCList<Chk01_IoR> ioL) {
		MCIndexKey dtlkey = dtlL.createIndex(Chk01_DtlR.$purc_act_d_no);
		for (DtlR chkUp1R : chkOpe.up1()) {
			chkUp1R.setAttributes(dtlL.getFirst(dtlkey, chkUp1R.ref_purc_act_d_no()));
		}
		
		MCIndexKey iokey = ioL.createIndex(Chk01_IoR.$purc_act_io_no);
		for (IoR chkUp2R : chkOpe.up2()) {
			chkUp2R.setAttributes(ioL.getFirst(iokey, chkUp2R.ref_purc_act_io_no()));
		}
	}
	
	
	protected Map_MST_SLS_ACT_IO_R_Chk01_IoR<MST_SLS_ACT_IO_R,Chk01_IoR> createMap_MST_SLS_ACT_IO_R_Chk01_IoR() {
		return new Map_MST_SLS_ACT_IO_R_Chk01_IoR<MST_SLS_ACT_IO_R, Chk01_IoR>();
	}

	public class Map_MST_SLS_ACT_IO_R_Chk01_IoR<D extends MST_SLS_ACT_IO_R, S extends Chk01_IoR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_SLS_ACT_IO_R.$sls_act_io_no, Chk01_IoR.$sls_act_io_no);
			addColumnPathMap(MST_SLS_ACT_IO_R.$sls_act_io_seq, Chk01_IoR.$sls_act_io_seq);
			addColumnPathMap(MST_SLS_ACT_IO_R.$sls_act_d_seq, Chk01_IoR.$sls_act_d_seq);
			addColumnPathMap(MST_SLS_ACT_IO_R.$arr_act_no, Chk01_IoR.$arr_act_no);
			addColumnPathMap(MST_SLS_ACT_IO_R.$purc_act_io_no, Chk01_IoR.$purc_act_io_no);
			addColumnPathMap(MST_SLS_ACT_IO_R.$gd_cd, Chk01_IoR.$gd_cd);
			addColumnPathMap(MST_SLS_ACT_IO_R.$loc_cd, Chk01_IoR.$loc_cd);
			addColumnPathMap(MST_SLS_ACT_IO_R.$str_ln_cd, Chk01_IoR.$str_ln_cd);
			addColumnPathMap(MST_SLS_ACT_IO_R.$lot_no, Chk01_IoR.$lot_no);
			addColumnPathMap(MST_SLS_ACT_IO_R.$sublot_no, Chk01_IoR.$sublot_no);
			addColumnPathMap(MST_SLS_ACT_IO_R.$sno1, Chk01_IoR.$sno1);
			addColumnPathMap(MST_SLS_ACT_IO_R.$sno2, Chk01_IoR.$sno2);
			addColumnPathMap(MST_SLS_ACT_IO_R.$sno3, Chk01_IoR.$sno3);
			addColumnPathMap(MST_SLS_ACT_IO_R.$sno4, Chk01_IoR.$sno4);
			addColumnPathMap(MST_SLS_ACT_IO_R.$trd_unit_cd, Chk01_IoR.$trd_unit_cd);
			addColumnPathMap(MST_SLS_ACT_IO_R.$trd_unit_qty, Chk01_IoR.$trd_unit_qty);
			addColumnPathMap(MST_SLS_ACT_IO_R.$base_unit_cd, Chk01_IoR.$base_unit_cd);
			addColumnPathMap(MST_SLS_ACT_IO_R.$base_unit_qty, Chk01_IoR.$base_unit_qty);
			addColumnPathMap(MST_SLS_ACT_IO_R.$pack_unit_cd, Chk01_IoR.$pack_unit_cd);
			addColumnPathMap(MST_SLS_ACT_IO_R.$pack_unit_qty, Chk01_IoR.$pack_unit_qty);
			addColumnPathMap(MST_SLS_ACT_IO_R.$sync_flg, Chk01_IoR.$sync_flg);
			addColumnPathMap(MST_SLS_ACT_IO_R.$sub_char1, Chk01_IoR.$sub_char1);
			addColumnPathMap(MST_SLS_ACT_IO_R.$sub_char2, Chk01_IoR.$sub_char2);
			addColumnPathMap(MST_SLS_ACT_IO_R.$sub_char3, Chk01_IoR.$sub_char3);

		}
	}
	protected Map_MST_SLS_ACT_D_R_Chk01_DtlR<MST_SLS_ACT_D_R,Chk01_DtlR> createMap_MST_SLS_ACT_D_R_Chk01_DtlR() {
		return new Map_MST_SLS_ACT_D_R_Chk01_DtlR<MST_SLS_ACT_D_R, Chk01_DtlR>();
	}
	public class Map_MST_SLS_ACT_D_R_Chk01_DtlR<D extends MST_SLS_ACT_D_R, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_SLS_ACT_D_R.$sls_act_d_no, Chk01_DtlR.$sls_act_d_no);
			addColumnPathMap(MST_SLS_ACT_D_R.$sls_act_d_seq, Chk01_DtlR.$sls_act_d_seq);
			addColumnPathMap(MST_SLS_ACT_D_R.$disp_seq, Chk01_DtlR.$disp_seq);
			addColumnPathMap(MST_SLS_ACT_D_R.$dlv_cd, Chk01_DtlR.$dlv_cd);
			addColumnPathMap(MST_SLS_ACT_D_R.$dlv_sundry_flg, Chk01_DtlR.$dlv_sundry_flg);
			addColumnPathMap(MST_SLS_ACT_D_R.$dlv_nm, Chk01_DtlR.$dlv_nm);
			addColumnPathMap(MST_SLS_ACT_D_R.$dlv_zip_cd, Chk01_DtlR.$dlv_zip_cd);
			addColumnPathMap(MST_SLS_ACT_D_R.$dlv_addr1, Chk01_DtlR.$dlv_addr1);
			addColumnPathMap(MST_SLS_ACT_D_R.$dlv_addr2, Chk01_DtlR.$dlv_addr2);
			addColumnPathMap(MST_SLS_ACT_D_R.$dlv_addr3, Chk01_DtlR.$dlv_addr3);
			addColumnPathMap(MST_SLS_ACT_D_R.$dlv_addr4, Chk01_DtlR.$dlv_addr4);
			addColumnPathMap(MST_SLS_ACT_D_R.$dlv_cntct_dpt, Chk01_DtlR.$dlv_cntct_dpt);
			addColumnPathMap(MST_SLS_ACT_D_R.$dlv_cntct_psn, Chk01_DtlR.$dlv_cntct_psn);
			addColumnPathMap(MST_SLS_ACT_D_R.$dlv_tel, Chk01_DtlR.$dlv_tel);
			addColumnPathMap(MST_SLS_ACT_D_R.$dlv_fax, Chk01_DtlR.$dlv_fax);
			addColumnPathMap(MST_SLS_ACT_D_R.$pri_prnt_flg, Chk01_DtlR.$pri_prnt_flg);
			addColumnPathMap(MST_SLS_ACT_D_R.$dest_cd1, Chk01_DtlR.$dest_cd1);
			addColumnPathMap(MST_SLS_ACT_D_R.$dest_cd2, Chk01_DtlR.$dest_cd2);
			addColumnPathMap(MST_SLS_ACT_D_R.$dest_cd3, Chk01_DtlR.$dest_cd3);
			addColumnPathMap(MST_SLS_ACT_D_R.$itm_cd, Chk01_DtlR.$itm_cd);
			addColumnPathMap(MST_SLS_ACT_D_R.$itm_sub1, Chk01_DtlR.$itm_sub1);
			addColumnPathMap(MST_SLS_ACT_D_R.$itm_sub2, Chk01_DtlR.$itm_sub2);
			addColumnPathMap(MST_SLS_ACT_D_R.$itm_sub3, Chk01_DtlR.$itm_sub3);
			addColumnPathMap(MST_SLS_ACT_D_R.$sno1, Chk01_DtlR.$sno1);
			addColumnPathMap(MST_SLS_ACT_D_R.$sno2, Chk01_DtlR.$sno2);
			addColumnPathMap(MST_SLS_ACT_D_R.$sno3, Chk01_DtlR.$sno3);
			addColumnPathMap(MST_SLS_ACT_D_R.$sno4, Chk01_DtlR.$sno4);
			addColumnPathMap(MST_SLS_ACT_D_R.$itm_nm, Chk01_DtlR.$itm_nm);
			addColumnPathMap(MST_SLS_ACT_D_R.$iv_itm_nm, Chk01_DtlR.$iv_itm_nm);
			addColumnPathMap(MST_SLS_ACT_D_R.$cntry_org_cd, Chk01_DtlR.$cntry_org_cd);
			addColumnPathMap(MST_SLS_ACT_D_R.$wrk_no, Chk01_DtlR.$wrk_no);
			addColumnPathMap(MST_SLS_ACT_D_R.$loc_cd, Chk01_DtlR.$loc_cd);
			addColumnPathMap(MST_SLS_ACT_D_R.$str_ln_cd, Chk01_DtlR.$str_ln_cd);
			addColumnPathMap(MST_SLS_ACT_D_R.$lot_no, Chk01_DtlR.$lot_no);
			addColumnPathMap(MST_SLS_ACT_D_R.$sublot_no, Chk01_DtlR.$sublot_no);
			addColumnPathMap(MST_SLS_ACT_D_R.$gd_cd, Chk01_DtlR.$gd_cd);
			addColumnPathMap(MST_SLS_ACT_D_R.$trd_unit_cd, Chk01_DtlR.$trd_unit_cd);
			addColumnPathMap(MST_SLS_ACT_D_R.$trd_unit_qty, Chk01_DtlR.$trd_unit_qty);
			addColumnPathMap(MST_SLS_ACT_D_R.$base_unit_cd, Chk01_DtlR.$base_unit_cd);
			addColumnPathMap(MST_SLS_ACT_D_R.$base_unit_qty, Chk01_DtlR.$base_unit_qty);
			addColumnPathMap(MST_SLS_ACT_D_R.$trd_cur_upri, Chk01_DtlR.$trd_cur_upri);
			addColumnPathMap(MST_SLS_ACT_D_R.$trd_cur_amt, Chk01_DtlR.$trd_cur_amt);
			addColumnPathMap(MST_SLS_ACT_D_R.$upri_not_tgt_flg, Chk01_DtlR.$upri_not_tgt_flg);
			addColumnPathMap(MST_SLS_ACT_D_R.$interim_flg, Chk01_DtlR.$interim_flg);
			addColumnPathMap(MST_SLS_ACT_D_R.$tax_cd, Chk01_DtlR.$tax_cd);
			addColumnPathMap(MST_SLS_ACT_D_R.$trd_cur_tax_amt, Chk01_DtlR.$trd_cur_tax_amt);
			addColumnPathMap(MST_SLS_ACT_D_R.$base_cur_upri, Chk01_DtlR.$base_cur_upri);
			addColumnPathMap(MST_SLS_ACT_D_R.$base_cur_amt, Chk01_DtlR.$base_cur_amt);
			addColumnPathMap(MST_SLS_ACT_D_R.$base_cur_tax_amt, Chk01_DtlR.$base_cur_tax_amt);
			addColumnPathMap(MST_SLS_ACT_D_R.$ptax_cur_upri, Chk01_DtlR.$ptax_cur_upri);
			addColumnPathMap(MST_SLS_ACT_D_R.$ptax_cur_amt, Chk01_DtlR.$ptax_cur_amt);
			addColumnPathMap(MST_SLS_ACT_D_R.$ptax_cur_tax_amt, Chk01_DtlR.$ptax_cur_tax_amt);
			addColumnPathMap(MST_SLS_ACT_D_R.$cost_upri, Chk01_DtlR.$cost_upri);
			addColumnPathMap(MST_SLS_ACT_D_R.$trd_cur_dscnt_amt, Chk01_DtlR.$trd_cur_dscnt_amt);
			addColumnPathMap(MST_SLS_ACT_D_R.$base_cur_dscnt_amt, Chk01_DtlR.$base_cur_dscnt_amt);
			addColumnPathMap(MST_SLS_ACT_D_R.$ptax_cur_dscnt_amt, Chk01_DtlR.$ptax_cur_dscnt_amt);
			addColumnPathMap(MST_SLS_ACT_D_R.$dscnt_rsn_cd, Chk01_DtlR.$dscnt_rsn_cd);
			addColumnPathMap(MST_SLS_ACT_D_R.$bill_crryovr_times, Chk01_DtlR.$bill_crryovr_times);
			addColumnPathMap(MST_SLS_ACT_D_R.$stk_mng_typ, Chk01_DtlR.$stk_mng_typ);
			addColumnPathMap(MST_SLS_ACT_D_R.$sundry_itm_flg, Chk01_DtlR.$sundry_itm_flg);
			addColumnPathMap(MST_SLS_ACT_D_R.$sno1_mng_typ, Chk01_DtlR.$sno1_mng_typ);
			addColumnPathMap(MST_SLS_ACT_D_R.$sno2_mng_typ, Chk01_DtlR.$sno2_mng_typ);
			addColumnPathMap(MST_SLS_ACT_D_R.$sno3_mng_typ, Chk01_DtlR.$sno3_mng_typ);
			addColumnPathMap(MST_SLS_ACT_D_R.$sno4_mng_typ, Chk01_DtlR.$sno4_mng_typ);
			addColumnPathMap(MST_SLS_ACT_D_R.$cst_po_d_no, Chk01_DtlR.$cst_po_d_no);
			addColumnPathMap(MST_SLS_ACT_D_R.$cst_itm_cd, Chk01_DtlR.$cst_itm_cd);
			addColumnPathMap(MST_SLS_ACT_D_R.$cst_itm_nm, Chk01_DtlR.$cst_itm_nm);
			addColumnPathMap(MST_SLS_ACT_D_R.$trd_d_rmrks, Chk01_DtlR.$trd_d_rmrks);
			addColumnPathMap(MST_SLS_ACT_D_R.$intr_rmrks, Chk01_DtlR.$intr_rmrks);
			addColumnPathMap(MST_SLS_ACT_D_R.$bd_dpt_cd, Chk01_DtlR.$bd_dpt_cd);
			addColumnPathMap(MST_SLS_ACT_D_R.$wtax_rate, Chk01_DtlR.$wtax_rate);
			addColumnPathMap(MST_SLS_ACT_D_R.$wtax_amt, Chk01_DtlR.$wtax_amt);
			addColumnPathMap(MST_SLS_ACT_D_R.$slo_no, Chk01_DtlR.$slo_no);
			addColumnPathMap(MST_SLS_ACT_D_R.$slo_d_no, Chk01_DtlR.$slo_d_no);
			addColumnPathMap(MST_SLS_ACT_D_R.$sls_ret_schd_no, Chk01_DtlR.$sls_ret_schd_no);
			addColumnPathMap(MST_SLS_ACT_D_R.$sls_ret_schd_d_no, Chk01_DtlR.$sls_ret_schd_d_no);
			addColumnPathMap(MST_SLS_ACT_D_R.$purc_ddlv_po_no, Chk01_DtlR.$purc_ddlv_po_no);
			addColumnPathMap(MST_SLS_ACT_D_R.$purc_act_no, Chk01_DtlR.$purc_act_no);
			addColumnPathMap(MST_SLS_ACT_D_R.$purc_act_d_no, Chk01_DtlR.$purc_act_d_no);
			addColumnPathMap(MST_SLS_ACT_D_R.$sub_char1, Chk01_DtlR.$sub_char1);
			addColumnPathMap(MST_SLS_ACT_D_R.$sub_char2, Chk01_DtlR.$sub_char2);
			addColumnPathMap(MST_SLS_ACT_D_R.$sub_char3, Chk01_DtlR.$sub_char3);
			addColumnPathMap(MST_SLS_ACT_D_R.$ref_sls_act_no, Chk01_DtlR.$ref_sls_act_no);
			addColumnPathMap(MST_SLS_ACT_D_R.$ref_sls_act_seq, Chk01_DtlR.$ref_sls_act_seq);
			addColumnPathMap(MST_SLS_ACT_D_R.$ref_sls_act_d_no, Chk01_DtlR.$ref_sls_act_d_no);
			addColumnPathMap(MST_SLS_ACT_D_R.$ref_sls_act_d_seq, Chk01_DtlR.$ref_sls_act_d_seq);
			addColumnPathMap(MST_SLS_ACT_D_R.$dlv_slip_d_no, Chk01_DtlR.$dlv_slip_d_no);

		}
	}
	
	/**
	 * 	仕入返品サービスの呼出 (Ins01)<br>
	 * 	{@link MSBDL_PurcRetRegService.PurcRet_Ins01}
	 */
	protected void callPurcRetSvIns01(Chk01_HdrR hdr, MCList<Chk01_DtlR> dtlL,
			MCList<Chk01_IoR> ioL) {
		
		if (!hdr.purc_ret_tgt_flg()) {
			return;
		}
		
		MCList<MST_SLS_ACT_D_R> slsActDL = MCList.create(MST_SLS_ACT_D_R.class);
		slsActDL.addNumberColumn("dec_place");
		slsActDL.addNumberColumn("purc_cont_qty");
		slsActDL.addStringColumn("purc_bd_dpt_cd");
		MST_SLS_ACT_D_R slsActDL_t = MST_SLS_ACT_D_R.create("T");
		MCQueryApiBuilder slsActDL_bldr = MCQueryApiBuilder.create(slsActDL_t);
		MAM_UNIT_R unit = MAM_UNIT_R.create("UNIT");
		MAM_ITM_R itm = MAM_ITM_R.create("ITM");
		MST_PURC_ACT_D_R t2 = MST_PURC_ACT_D_R.create("T2");
		MST_PURC_ACT_D_R S1W1 = MST_PURC_ACT_D_R.create("W1");
		MST_PURC_ACT_R S1W2 = MST_PURC_ACT_R.create("W2");
		slsActDL_bldr.addSelect(unit.dec_place);
		slsActDL_bldr.addSelect(itm.sno1_mng_typ);
		slsActDL_bldr.addSelect(itm.sno2_mng_typ);
		slsActDL_bldr.addSelect(itm.sno3_mng_typ);
		slsActDL_bldr.addSelect(itm.sno4_mng_typ);
		slsActDL_bldr.addSelect(t2.bd_dpt_cd.as("purc_bd_dpt_cd"));
		slsActDL_bldr.setWhere(slsActDL_t.sls_act_no.eq(bind("sls_act_no")));
		slsActDL_bldr.addWhereWithAnd(slsActDL_t.sls_act_seq.eq(bind("sls_act_seq")));
		slsActDL_bldr.addLeftOuterJoin(unit, bracket( slsActDL_t.trd_unit_cd.eq(unit.unit_cd)));
		slsActDL_bldr.addLeftOuterJoin(itm,
				bracket(slsActDL_t.itm_cd.eq(itm.itm_cd)
						.and(slsActDL_t.itm_sub1.eq(itm.itm_sub1))
						.and(slsActDL_t.itm_sub2.eq(itm.itm_sub2))
						.and(slsActDL_t.itm_sub3.eq(itm.itm_sub3))));
		slsActDL_bldr.addLeftOuterJoin(t2, bracket(slsActDL_t.purc_act_d_no.eq(t2.purc_act_d_no)
				.and(t2.purc_act_d_seq.eq(subQuery().select(max(S1W1.purc_act_d_seq))
						.from(S1W1.innerJoin(S1W2).on(S1W1.purc_act_no.eq(S1W2.purc_act_no)
										.and(S1W1.purc_act_seq.eq(S1W2.purc_act_seq))
										.and(S1W2.slip_sts_typ.neq(value(MAC_SLIP_STS_TYP.CAN.value())))))
						.where(S1W1.purc_act_d_no.eq(slsActDL_t.purc_act_d_no))))));
		dbSelect("MSBBL1340_MST_SLS_ACT_D_S05", slsActDL, slsActDL_bldr, hdr);
		
		MCList<MST_SLS_ACT_IO_R> slsActIoL = MCList.create(MST_SLS_ACT_IO_R.class);
		slsActIoL.addNumberColumn("dec_place");
		slsActIoL.addNumberColumn("purc_cont_qty");
		MST_SLS_ACT_IO_R slsActIoL_t = MST_SLS_ACT_IO_R.create("T");
		MCQueryApiBuilder slsActIoL_bldr = MCQueryApiBuilder.create(slsActIoL_t);
		MST_ARR_ACT_R arr = MST_ARR_ACT_R.create("ARR");
		slsActIoL_bldr.addSelect(unit.dec_place.as("dec_place"));
		slsActIoL_bldr.addSelect(arr.purc_cont_qty.as("purc_cont_qty"));
		slsActIoL_bldr.setWhere(slsActIoL_t.sls_act_d_no.eq(bind("sls_act_d_no")));
		slsActIoL_bldr.addWhereWithAnd(slsActIoL_t.sls_act_d_seq.eq(bind("sls_act_d_seq")));
		slsActIoL_bldr.addLeftOuterJoin(unit, bracket( slsActIoL_t.base_unit_cd.eq(unit.unit_cd)));
		slsActIoL_bldr.addLeftOuterJoin(arr, bracket( slsActIoL_t.arr_act_no.eq(arr.arr_act_no)));
		dbSelect("MSBBL1340_MST_SLS_ACT_IO_S03", slsActIoL, slsActIoL_bldr, slsActDL);
		
		// チェック処理
		MSBDL_PurcRetRegService.PurcRet_Chk01 chkOpe = MSBDL_PurcRetRegService.crtPurcRet_Chk01();
		
		int hdrPegNo = 0;
		for (MCList<Chk01_DtlR> purcActGrpL : dtlL.groupList(Chk01_DtlR.$purc_act_no)) {
			HdrR chkUp0 = chkOpe.up0().createRow();
			Chk01_DtlR chkDtlR = purcActGrpL.subList(CREATE, MODIFY, NONE).get(0);
			MCList<MST_SLS_ACT_D_R> purcSlsActDL = slsActDL.subList(MST_SLS_ACT_D_R.$purc_act_no, chkDtlR.purc_act_no());
			MCIndexKey idxkey = purcSlsActDL.createIndex(MST_SLS_ACT_D_R.$sls_act_d_no, MST_SLS_ACT_D_R.$sls_act_d_seq);
			hdr.peg_no(hdrPegNo);
			copy(chkUp0, hdr, createMap_HdrR_Chk01_HdrR(chkDtlR, purcSlsActDL.get(0)));
			chkOpe.up0().add(chkUp0);
			
			MCList<MST_SLS_ACT_IO_R> purcSlsActIoL = slsActIoL.createInstance();
			for (MST_SLS_ACT_IO_R slsActIoR: slsActIoL) {
				if (purcSlsActDL.contains(idxkey, slsActIoR.sls_act_d_no(), slsActIoR.sls_act_d_seq())) {
					purcSlsActIoL.add(slsActIoR);
				}
			}
			
			MCList<Chk01_IoR> purcIoL = ioL.createInstance();
			MCIndexKey pegNoIdxkey = purcActGrpL.createIndex(Chk01_DtlR.$dtl_peg_no);
			for (Chk01_IoR ioR: ioL) {
				if (!purcActGrpL.subList(pegNoIdxkey, ioR.dtl_peg_no()).isEmpty()) {
					purcIoL.add(ioR);
				}
			}
			
			propPurcContQty(purcSlsActDL, purcSlsActIoL);
			
			DtlL<DtlR> purcDtlL = chkOpe.up1().createInstance();
			addAll(purcDtlL, purcSlsActDL, createMap_DtlR_MST_SLS_ACT_D_R(hdr, purcActGrpL));
			setDispSeq(purcDtlL);
			chkOpe.up1().addAll(purcDtlL);
			
			addAll(chkOpe.up2(), purcSlsActIoL, createMap_IoR_MST_SLS_ACT_IO_R(purcActGrpL, purcIoL));
			
			hdrPegNo++;
		}
		
		copyGUIIndex(chkOpe, dtlL, ioL);
		
		// 紐付けＮＯ設定
		int pegNo = 0;
		int ioPegNo = 0;
		for (MST_SLS_ACT_D_R slsActDR : slsActDL) {
			pegNo++;
			DtlL<DtlR> tmpDL = chkOpe.up1().subList(DtlR.$sls_act_d_no, slsActDR.sls_act_d_no());
			tmpDL.get(0).peg_no(pegNo);
			MCList<MST_SLS_ACT_IO_R> tmpSlsIoL = slsActIoL.subList(MST_SLS_ACT_IO_R.$sls_act_d_no, slsActDR.sls_act_d_no());
			for (MST_SLS_ACT_IO_R tmpSlsIoR : tmpSlsIoL) {
				IoL<IoR> tmpIoL = chkOpe.up2().subList(IoR.$sls_act_io_no, tmpSlsIoR.sls_act_io_no());
				tmpIoL.get(0).dtl_peg_no(pegNo);
				tmpIoL.get(0).peg_no(++ioPegNo);
			}
		}
		
		// 部門組織変更対応
		// 購買部門
		MAUCL_DptUtil.setDpt(chkOpe.up0(), HdrR.$purc_dpt_cd, null, HdrR.$ac_dt, true);
		if (chkOpe.up0().subList("err_flg", true).size() > 0) {
			throwDptErr();
		}
		// 購買ＷＧの取得
		for (HdrR hdrR : chkOpe.up0()) {
			hdrR.wg_cd(getWgCd(hdrR.purc_dpt_cd(), hdrR.ac_dt()));
		}
		
		chkOpe.up1().addDateColumn(HdrR.$ac_dt);
		chkOpe.up1().setDateNE(HdrR.$ac_dt, chkOpe.up0().get(0).ac_dt());
		// 債務部門
		MAUCL_DptUtil.setDpt(chkOpe.up1(), DtlR.$ap_dpt_cd, null, HdrR.$ac_dt, true);
		if (chkOpe.up1().subList("err_flg", true).size() > 0) {
			throwDptErr();
		}
		
		// 負担部門
		MAUCL_DptUtil.setDpt(chkOpe.up1(), DtlR.$bd_dpt_cd, null, HdrR.$ac_dt, true);
		if (chkOpe.up1().subList("err_flg", true).size() > 0) {
			throwDptErr();
		}
		
		chkOpe.exec();
		
		MSBDL_PurcRetRegService.PurcRet_Ins01 ope = MSBDL_PurcRetRegService.crtPurcRet_Ins01();
		
		HdrL<HdrR> up0 = ope.up0().createInstance();
		DtlL<DtlR> up1 = ope.up1().createInstance();
		IoL<IoR> up2 = ope.up2().createInstance();
		
		up0.addAll(chkOpe.up0());
		up1.addAll(chkOpe.up1());
		up2.addAll(chkOpe.up2());
		
		copyErrFlg(up0, chkOpe.down0());
		copyErrFlg(up1, chkOpe.down1());
		copyErrFlg(up2, chkOpe.down2());
		
		ope.up0().addAll(up0.subList(HdrR.$err_flg, false));
		ope.up0().forEach(r -> {
			r.indiv_prnt_flg(true);
			r.amt_calc_flg(true);
		});
		ope.up1().addAll(up1.subList(DtlR.$err_flg, false));
		ope.up2().addAll(up2.subList(IoR.$err_flg, false));
		
		// 登録処理
		if (ope.up0().size() != 0) {
			ope.exec();
		}
		else {
			throwUpdErr();
		}
	}
	
	protected void copyGUIIndex(MSBDL_PurcRetRegService.PurcRet_Chk01 chkOpe, MCList<Chk01_DtlR> dtlL, MCList<Chk01_IoR> ioL) {
		MCIndexKey dtlkey = dtlL.createIndex(Chk01_DtlR.$purc_act_d_no);
		for (DtlR ChkUp1R : chkOpe.up1()) {
			ChkUp1R.setAttributes(dtlL.getFirst(dtlkey, ChkUp1R.purc_act_d_no()));
		}
		
		MCIndexKey iokey = ioL.createIndex(Chk01_IoR.$purc_act_io_no );
		for (IoR ChkUp2R : chkOpe.up2()) {
			ChkUp2R.setAttributes(ioL.getFirst(iokey, ChkUp2R.ref_purc_act_io_no()));
		}
	}
	
	
	protected void throwDptErr() {
		MCAppException ex = new MCAppException(MCMessagePool.getMessageList().get(0));
		MCMessagePool.removeAll(MCMessagePool.getMessageList());
		throw ex;
	}
	
	/**
	 * 仕入有効成分を案分する
	 * @param slsActDL
	 * @param slsActIoL
	 */
	protected void propPurcContQty(MCList<MST_SLS_ACT_D_R> slsActDL, MCList<MST_SLS_ACT_IO_R> slsActIoL) {
		MCNumber tPurcContQty = getPurcContQty(slsActIoL);
		
		if (isNull(tPurcContQty)) {
			return;
		}
		FXUCC_Divide.prop(slsActDL, tPurcContQty,
				slsActDL.get(0).getNumberNE("dec_place").intValue(),
				MST_SLS_ACT_D_R.$trd_unit_qty, "purc_cont_qty");
		
		for(MST_SLS_ACT_D_R slsActDR : slsActDL) {
			MCList<MST_SLS_ACT_IO_R> tmpL = slsActIoL.subList(MST_SLS_ACT_IO_R.$sls_act_d_no, slsActDR.sls_act_d_no());

			FXUCC_Divide.prop(tmpL, slsActDR.getNumberNE("purc_cont_qty"),
					tmpL.get(0).getNumberNE("dec_place").intValue(),
					Chk01_DtlR.$base_unit_qty, "purc_cont_qty");			
		}
	}
	
	/**
	 * 入荷実績の仕入有効成分を取得
	 * @param slsActIoL
	 * @return
	 */
	protected MCNumber getPurcContQty(MCList<MST_SLS_ACT_IO_R> slsActIoL) {
		MCList<MST_ARR_ACT_R> arrActL = MCList.create(MST_ARR_ACT_R.class);
		MST_ARR_ACT_R t = MST_ARR_ACT_R.create("T");
		MCQueryApiBuilder arrActL_bldr = MCQueryApiBuilder.create(t);
		arrActL_bldr.setSelect(t.purc_cont_qty);
		arrActL_bldr.setWhere(t.arr_act_no.eq(bind("arr_act_no")));
		dbSelect("MSBBL1340_MST_ARR_ACT_S05", arrActL, arrActL_bldr, slsActIoL);
		
		return arrActL.sum(MST_ARR_ACT_R.$purc_cont_qty);
	}

	/**
	 * RowMapper<br>
	 *  上り電文(Chk01_HdrR) -> 仕入返品登録サービス.上り電文(HdrR)
	 * @param slsActD
	 * @return
	 */
	protected Map_HdrR_Chk01_HdrR<HdrR, Chk01_HdrR> createMap_HdrR_Chk01_HdrR(Chk01_DtlR dtl,
			MST_SLS_ACT_D_R slsActD) {
		return new Map_HdrR_Chk01_HdrR<HdrR, Chk01_HdrR>(dtl, slsActD);
	}

	public class Map_HdrR_Chk01_HdrR<D extends HdrR, S extends Chk01_HdrR> extends
			MCRowMapper<D, S> {

		MST_SLS_ACT_D_R _slsActD;
		Chk01_DtlR _dtl;

		public Map_HdrR_Chk01_HdrR(Chk01_DtlR dtl, MST_SLS_ACT_D_R slsActD) {
			_slsActD = slsActD;
			_dtl = dtl;
		}

		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(HdrR.$peg_no, Chk01_HdrR.$peg_no);
			addColumnPathMap(HdrR.$purc_ret_dt, Chk01_HdrR.$sls_ret_dt);
			addColumnPathMap(HdrR.$ac_dt, Chk01_HdrR.$ac_dt);
			addColumnPathMap(HdrR.$can_ac_dt, Chk01_HdrR.$can_ac_dt);
			addColumnPathMap(HdrR.$ptax_dt, Chk01_HdrR.$ac_dt);
			addColumnPathMap(HdrR.$trd_rmrks, Chk01_HdrR.$trd_rmrks);
			addColumnPathMap(HdrR.$tterm_cd1, Chk01_HdrR.$tterm_cd1);
			addColumnPathMap(HdrR.$tterm_rmrks1, Chk01_HdrR.$tterm_rmrks1);
			addColumnPathMap(HdrR.$tterm_cd2, Chk01_HdrR.$tterm_cd2);
			addColumnPathMap(HdrR.$tterm_rmrks2, Chk01_HdrR.$tterm_rmrks2);
			addColumnPathMap(HdrR.$tterm_cd3, Chk01_HdrR.$tterm_cd3);
			addColumnPathMap(HdrR.$tterm_rmrks3, Chk01_HdrR.$tterm_rmrks3);

		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			if (src.isStatusCreate()) {
				dest.trd_ptn_typ(MAC_TRD_PTN_TYP.PURC_RTN.value());
				dest.trd_cd(MAUCL_TrdUtil.getDefaultTrdCd(MAC_TRD_PTN_TYP.PURC_RTN.value()));
			}
			else {
				dest.trd_ptn_typ(MAC_TRD_PTN_TYP.PURC_RTN.value());
				dest.trd_cd(MAUCL_TrdUtil.getDefaultTrdCd(MAC_TRD_PTN_TYP.PURC_RTN.value()));
				dest.purc_ret_act_no(_dtl.purc_ret_act_no());
				dest.purc_ret_act_rev(_dtl.purc_ret_act_rev());
				src.addStringColumn("purc_ret_act_no", _dtl.purc_ret_act_no());
				src.addNumberColumn("purc_ret_act_rev", _dtl.purc_ret_act_rev());
			}

			//明細情報からコピー
			dest.sppl_cd(_dtl.sppl_cd());
			dest.ret_sppl_nm(_dtl.ret_nm());
			dest.ret_sppl_zip_cd(_dtl.ret_zip_cd());
			dest.ret_sppl_addr1(_dtl.ret_addr1());
			dest.ret_sppl_addr2(_dtl.ret_addr2());
			dest.ret_sppl_addr3(_dtl.ret_addr3());
			dest.ret_sppl_addr4(_dtl.ret_addr4());
			dest.ret_sppl_cntct_dpt(_dtl.ret_cntct_dpt());
			dest.ret_sppl_cntct_psn(_dtl.ret_cntct_psn());
			dest.ret_sppl_tel(_dtl.ret_tel());
			dest.ret_sppl_fax(_dtl.ret_fax());
			dest.ret_sppl_cntct_psn_title(_dtl.ret_cntct_psn_title());
			
			//他テーブル
			//仕入実績ヘッダ
			MST_PURC_ACT_R db = MST_PURC_ACT_R.create();
			if (src.isStatusCreate()) {
				db = getPurcActCache(_dtl.purc_act_no());
				dest.ref_rcpt_iv_no(db.rcpt_iv_no());
			}
			else {
				MST_PURC_ACT_D_R dbD = MST_PURC_ACT_D_R.create();
				dbD = getPurcActD(_dtl.sls_act_d_no());
				db = getPurcAct(dbD.purc_act_no(), dbD.purc_act_seq());
				MST_PURC_ACT_R refPurcActR = getPurcActCache(_dtl.purc_act_no());
				dest.ref_rcpt_iv_no(refPurcActR.rcpt_iv_no());
			}
			dest.trd_cur_cd(db.trd_cur_cd());
			dest.purc_dpt_cd(db.purc_dpt_cd());
			dest.purc_usr_cd(db.purc_usr_cd());
			dest.xrate(db.xrate());
			dest.ptax_xrate(db.ptax_xrate());
			dest.wg_cd(db.wg_cd());
			dest.asppl_cd(db.asppl_cd());
			dest.purc_act_no(db.purc_act_no());
			dest.purc_act_seq(db.purc_act_seq());
			
			MST_PURC_ACT_R purcActR = getPurcActCache(_dtl.purc_act_no());
			if (purcActR.getBooleanNE(MAM_BP_R.$sppl_iv_flg) 
					&& purcActR.getBooleanNE(MAM_BP_R.$pay_spot_flg)) {
				dest.pay_schd_dt(_dtl.pay_schd_dt());
			}
			else {
				dest.pay_basis_dt(src.ac_dt());
			}
		}
	}
	
	/**
	 * 売上実績明細に紐づく仕入返品実績明細の属する仕入返品実績ヘッダを取得する。
	 * @param slsActD
	 * @return
	 */
	protected MST_PURC_RET_ACT_R getPurcRetAct(MST_SLS_ACT_D_R slsActD) {
		MST_PURC_RET_ACT_R purcRetAct = MST_PURC_RET_ACT_R.create("T");
		MCQueryApiBuilder purcRetAct_bldr = MCQueryApiBuilder.create(purcRetAct);
		MST_PURC_RET_ACT_D_R t2 = MST_PURC_RET_ACT_D_R.create("T2");
		MST_SLS_ACT_D_R t3 = MST_SLS_ACT_D_R.create("T3");
		purcRetAct_bldr.setWhere(t3.sls_act_d_no.eq(bind("1")), slsActD.sls_act_d_no());
		purcRetAct_bldr.addWhereWithAnd(t3.sls_act_d_seq.eq(bind("1")), slsActD.sls_act_d_seq());
		purcRetAct_bldr.addWhereWithAnd(purcRetAct.can_flg.eq(value(false)));
		purcRetAct_bldr.setDistinct();
		purcRetAct_bldr.addInnerJoin(t2, bracket(purcRetAct.purc_ret_act_no.eq(t2.purc_ret_act_no)
											.and(t2.can_flg.eq(value(false)))));
		purcRetAct_bldr.addInnerJoin(t3, bracket( t2.sls_act_d_no.eq(t3.sls_act_d_no)));
		dbSelect("MSBBL1340_MST_PURC_RET_ACT_S01", purcRetAct, purcRetAct_bldr);
		
		return purcRetAct;
	}
	
	/**
	 * RowMapper<br>
	 *  売上実績明細(MST_SLS_ACT_D_R) -> 仕入返品登録サービス.上り電文(DtlR)
	 * @param dtl
	 * @return
	 */
	protected Map_DtlR_MST_SLS_ACT_D_R<DtlR,MST_SLS_ACT_D_R> createMap_DtlR_MST_SLS_ACT_D_R(Chk01_HdrR hdrR, MCList<Chk01_DtlR> dtlL) {
		return new Map_DtlR_MST_SLS_ACT_D_R<DtlR, MST_SLS_ACT_D_R>(hdrR, dtlL);
	}

	public class Map_DtlR_MST_SLS_ACT_D_R<D extends DtlR, S extends MST_SLS_ACT_D_R> extends MCRowMapper<D,S>{
		
		Chk01_HdrR _hdrR;
		MCList<Chk01_DtlR> _dtlL;
		MCIndexKey _updIdx;
		MCIndexKey _insIdx;

		public Map_DtlR_MST_SLS_ACT_D_R(Chk01_HdrR hdrR, MCList<Chk01_DtlR> dtlL) {
			_hdrR = hdrR;			
			_dtlL = dtlL;
			_updIdx = _dtlL.createIndex(Chk01_DtlR.$sls_act_d_no);
			_insIdx = _dtlL.createIndex(Chk01_DtlR.$ref_sls_act_d_no);
		}

		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(DtlR.$purc_ret_loc_cd, MST_SLS_ACT_D_R.$loc_cd);
			addColumnPathMap(DtlR.$str_ln_cd, MST_SLS_ACT_D_R.$str_ln_cd);
			addColumnPathMap(DtlR.$itm_cd, MST_SLS_ACT_D_R.$itm_cd);
			addColumnPathMap(DtlR.$itm_sub1, MST_SLS_ACT_D_R.$itm_sub1);
			addColumnPathMap(DtlR.$itm_sub2, MST_SLS_ACT_D_R.$itm_sub2);
			addColumnPathMap(DtlR.$itm_sub3, MST_SLS_ACT_D_R.$itm_sub3);
			addColumnPathMap(DtlR.$itm_nm, MST_SLS_ACT_D_R.$itm_nm);
			addColumnPathMap(DtlR.$iv_itm_nm, MST_SLS_ACT_D_R.$iv_itm_nm);
			addColumnPathMap(DtlR.$sundry_itm_flg, MST_SLS_ACT_D_R.$sundry_itm_flg);
			
			addColumnPathMap(DtlR.$lot_no, MST_SLS_ACT_D_R.$lot_no);
			addColumnPathMap(DtlR.$sublot_no, MST_SLS_ACT_D_R.$sublot_no);
			addColumnPathMap(DtlR.$sno1, MST_SLS_ACT_D_R.$sno1);
			addColumnPathMap(DtlR.$sno2, MST_SLS_ACT_D_R.$sno2);
			addColumnPathMap(DtlR.$sno3, MST_SLS_ACT_D_R.$sno3);
			addColumnPathMap(DtlR.$sno4, MST_SLS_ACT_D_R.$sno4);
			
			addColumnPathMap(DtlR.$trd_unit_cd, MST_SLS_ACT_D_R.$trd_unit_cd);
			addColumnPathMap(DtlR.$trd_unit_qty, MST_SLS_ACT_D_R.$trd_unit_qty);
			addColumnPathMap(DtlR.$base_unit_cd, MST_SLS_ACT_D_R.$base_unit_cd);
			addColumnPathMap(DtlR.$base_unit_qty, MST_SLS_ACT_D_R.$base_unit_qty);
			addColumnPathMap(DtlR.$gd_cd, MST_SLS_ACT_D_R.$gd_cd);

			addColumnPathMap(DtlR.$trd_d_rmrks, MST_SLS_ACT_D_R.$trd_d_rmrks);
			addColumnPathMap(DtlR.$intr_rmrks, MST_SLS_ACT_D_R.$intr_rmrks);
			addColumnPathMap(DtlR.$sub_char1, MST_SLS_ACT_D_R.$sub_char1);
			addColumnPathMap(DtlR.$sub_char2, MST_SLS_ACT_D_R.$sub_char2);
			addColumnPathMap(DtlR.$sub_char3, MST_SLS_ACT_D_R.$sub_char3);
			addColumnPathMap(DtlR.$po_no, MST_SLS_ACT_D_R.$purc_ddlv_po_no);
			addColumnPathMap(DtlR.$ref_purc_act_no, MST_SLS_ACT_D_R.$purc_act_no);
			addColumnPathMap(DtlR.$ref_purc_act_d_no, MST_SLS_ACT_D_R.$purc_act_d_no);
			addColumnPathMap(DtlR.$sls_act_d_no, MST_SLS_ACT_D_R.$sls_act_d_no);
			
			addColumnPathMap(DtlR.$stk_mng_typ, MST_SLS_ACT_D_R.$stk_mng_typ);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			Chk01_DtlR dtl = _dtlL.getFirst(_updIdx, src.sls_act_d_no());

			//固定値・定数
			dest.hdr_peg_no(_hdrR.peg_no());

			if (isNull(dtl)) {
				dtl = _dtlL.getFirst(_insIdx, src.ref_sls_act_d_no());
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			}
			else if (dtl.isStatusDelete()) {
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				dest.purc_ret_act_no(_hdrR.getStringNE("purc_ret_act_no"));
				dest.purc_ret_act_rev(_hdrR.getNumberNE("purc_ret_act_rev"));
				dest.purc_ret_act_d_no(dtl.purc_ret_act_d_no());
			}
			else {
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				dest.purc_ret_act_no(_hdrR.getStringNE("purc_ret_act_no"));
				dest.purc_ret_act_rev(_hdrR.getNumberNE("purc_ret_act_rev"));
				dest.purc_ret_act_d_no(dtl.purc_ret_act_d_no());
			}

			dest.purc_id_typ(MAC_PURC_ID_TYP.PURC.value());
			dest.ap_dpt_cd(dtl.ap_dpt_cd());
			dest.purc_cont_qty(src.getNumberNE("purc_cont_qty"));
			dest.ret_rsn_cd(dtl.purc_ret_rsn_cd());
			dest.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
			dest.bd_dpt_cd(src.getStringNE("purc_bd_dpt_cd"));
			dest.base_purc_ac_dt(dtl.getDateNE("base_purc_ac_dt"));

			//他テーブル
			//仕入実績明細(コピー項目が多いので電文項目にせず、キャッシュから取得）
			MST_PURC_ACT_D_R db = MST_PURC_ACT_D_R.create();
			MST_PURC_ACT_R purcActR = MST_PURC_ACT_R.create();
			
			if (MAC_DATA_CRUD_TYP.isCRT(dest.data_crud_typ())) {
				// 新規の場合、キャッシュから取得
				db = getPurcActDCache(src.purc_act_d_no());
				purcActR = getPurcActCache(src.purc_act_no());
				dest.ref_purc_act_seq(db.purc_act_seq());
				dest.ref_purc_act_d_seq(db.purc_act_d_seq());
			}
			else {
				// 売上実績明細ＮＯに紐づく仕入返品実績明細に紐づく仕入実績の情報を取得
				// 仕入実績明細の取得
				// 仕入実績ヘッダの取得
				db = getPurcActD(src.sls_act_d_no());
				purcActR = getPurcAct(db.purc_act_no(), db.purc_act_seq());
				MST_PURC_ACT_D_R refPurcActDR = getPurcActDCache(src.purc_act_d_no());
				dest.ref_purc_act_seq(refPurcActDR.purc_act_seq());
				dest.ref_purc_act_d_seq(refPurcActDR.purc_act_d_seq());
			}

			dest.ver_no(db.ver_no());
			dest.maker_cd(db.maker_cd());
			dest.sppl_itm_cd(db.sppl_itm_cd());
			dest.sppl_itm_nm(db.sppl_itm_nm());
			dest.interim_flg(db.interim_flg());
			dest.trd_cur_upri(db.trd_cur_upri());
			dest.trd_cur_amt(db.trd_cur_amt());
			dest.trd_cur_dscnt_amt(db.trd_cur_dscnt_amt());
			dest.trd_cur_tax_amt(db.trd_cur_tax_amt());
			dest.trd_cur_proc_upri(db.trd_cur_proc_upri());
			dest.trd_cur_onr_prov_upri(db.trd_cur_onr_prov_upri());
			dest.trd_cur_proc_amt(db.trd_cur_proc_amt());
			dest.trd_cur_onr_prov_amt(db.trd_cur_onr_prov_amt());
			dest.tax_cd(db.tax_cd());
			dest.base_cur_tax_amt(db.base_cur_tax_amt());
			dest.ptax_cur_tax_amt(db.ptax_cur_tax_amt());
			dest.wtax_rate(db.wtax_rate());
			dest.purc_typ(db.purc_typ());
			dest.mfg_inst_no(db.mfg_inst_no());
			dest.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
			dest.quality_typ(db.quality_typ());
			dest.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
			dest.stk_id_typ(db.stk_id_typ());
			dest.pay_crryovr_times(db.pay_crryovr_times());
			dest.bd_itm_cd(db.bd_itm_cd());
			dest.bd_itm_sub1(db.bd_itm_sub1());
			dest.bd_itm_sub2(db.bd_itm_sub1());
			dest.bd_itm_sub3(db.bd_itm_sub3());
			dest.bd_lot_no(db.bd_lot_no());
			dest.bd_sublot_no(db.bd_sublot_no());
			dest.bd_sno1(db.bd_sno1());
			dest.bd_sno2(db.bd_sno2());
			dest.bd_sno3(db.bd_sno3());
			dest.bd_sno4(db.bd_sno4());
			dest.bd_loc_cd(db.bd_loc_cd());
			dest.bd_str_ln_cd(db.str_ln_cd());
			dest.bd_ctg_cd(db.bd_ctg_cd());
			dest.bd_oper_cd(db.bd_oper_cd());
			dest.bd_iv_no(db.bd_iv_no());
			dest.bd_po_no(db.bd_po_no());
			dest.bd_slo_no(db.bd_slo_no());
			dest.bd_wg_cd(db.bd_wg_cd());
			dest.purc_ret_loc_cd(db.in_to_loc_cd());
			dest.purc_ret_loc_wg_cd(db.in_to_loc_wg_cd());
			dest.str_ln_cd(db.str_ln_cd());
			dest.purc_act_no(db.purc_act_no());
			dest.purc_act_seq(db.purc_act_seq());
			dest.purc_act_d_no(db.purc_act_d_no());
			dest.purc_act_d_seq(db.purc_act_d_seq());

			MCNumber trdDecPlace = getAmtDecPlace(purcActR.trd_cur_cd());
			String rndTyp = getRndTyp(purcActR.sppl_cd());
			String taxRndTyp = getTaxRndTyp(purcActR.sppl_cd());
			if (!isNull(db.trd_cur_dscnt_amt())) {
				MCNumber trdCurDscntAmt = db.trd_cur_dscnt_amt()
						.multiply(src.trd_unit_qty()).divide(db.trd_unit_qty(),
								trdDecPlace.intValue(), MAC_RND_TYP.toMC(rndTyp));
				dest.trd_cur_dscnt_amt(trdCurDscntAmt);
			}
			if (!isNull(db.ptax_cur_tax_amt())) {
				if (!isSame(db.base_unit_qty(), src.base_unit_qty())) {
					MAM_TAX_R taxR = getTaxCache(db.tax_cd());
					MAM_CUR_R curR = getCurCache(purcActR.trd_cur_cd());
					MAM_CUR_R pcurR = getCurCache(purcActR.ptax_cur_cd());
					MCRow rsltRow = getAmtAndTax(db.trd_cur_upri(), src.trd_unit_qty(), taxR.tax_rate(), taxR.inc_tax_flg(),
							curR.amt_dec_place(), rndTyp, taxRndTyp, dest.trd_cur_dscnt_amt());
					MCNumber ptaxCurTaxAmt = convToBaseCur(rsltRow.getNumberNE("tax_amt"), purcActR.ptax_xrate(),
							pcurR.amt_dec_place(), getCo().xrate_rnd_typ());
					dest.ptax_cur_tax_amt(ptaxCurTaxAmt);
				}
			}
			if (!isNull(db.wtax_amt())) {
				MCNumber wtaxAmt = db.wtax_amt().multiply(src.trd_unit_qty()).divide(
						db.trd_unit_qty(), trdDecPlace.intValue(),
						MAC_RND_TYP.toMC(getCo().wtax_rnd_typ()));
				dest.wtax_amt(wtaxAmt);
			}
			if (!isSame(db.base_unit_qty(), src.base_unit_qty())) {
				MAM_TAX_R taxR = getTaxCache(db.tax_cd());
				MAM_CUR_R curR = getCurCache(purcActR.trd_cur_cd());
				MCRow rsltRow = getAmtAndTax(db.trd_cur_upri(), src.trd_unit_qty(), taxR.tax_rate(), taxR.inc_tax_flg(),
						curR.amt_dec_place(), rndTyp, taxRndTyp, dest.trd_cur_dscnt_amt());
				dest.trd_cur_amt(rsltRow.getNumberNE("amt"));
				dest.trd_cur_tax_amt(rsltRow.getNumberNE("tax_amt"));
				MCNumber baseCurTaxAmt = convToBaseCur(rsltRow.getNumberNE("tax_amt"), purcActR.xrate(),
						getBaseCur().amt_dec_place(), getCo().xrate_rnd_typ());
				dest.base_cur_tax_amt(baseCurTaxAmt);
			}
		}
	}

	protected MST_PURC_ACT_D_R getPurcActD(String slsActDNo) {
		MST_PURC_ACT_D_R purcActDR = MST_PURC_ACT_D_R.create("T");
		MCQueryApiBuilder purcActDR_bldr = MCQueryApiBuilder.create(purcActDR);
		MST_PURC_RET_ACT_D_R t2 = MST_PURC_RET_ACT_D_R.create("T2");
		MST_PURC_RET_ACT_R t3 = MST_PURC_RET_ACT_R.create("T3");
		MST_PURC_RET_ACT_D_R S1W = MST_PURC_RET_ACT_D_R.create("W");
		MST_PURC_ACT_D_R S1W2 = MST_PURC_ACT_D_R.create("W2");
		purcActDR_bldr.addInnerJoin(t2, bracket(purcActDR.purc_ret_act_d_no.eq(t2.purc_ret_act_d_no)
											.and(t2.can_flg.eq(value(false)))));
		purcActDR_bldr.addInnerJoin(t3,
				bracket(t3.purc_ret_act_no.eq(t2.purc_ret_act_no)
						.and(t3.purc_ret_act_rev.eq(t2.purc_ret_act_rev))
						.and(t3.can_flg.eq(value(false)))));
		purcActDR_bldr.setWhere(t2.sls_act_d_no.eq(bind("1")), slsActDNo);
		purcActDR_bldr.addWhereWithAnd(
				t2.purc_ret_act_rev.eq(subQuery().select(max(S1W.purc_ret_act_rev)).from(S1W)
										.where(S1W.can_flg.eq(value(false))
										.and(S1W.sls_act_d_no.eq(bind("1"))))), slsActDNo);
		purcActDR_bldr.addWhereWithAnd(purcActDR.purc_act_seq.eq(subQuery()
																.select(max(S1W2.purc_act_seq)).from(S1W2)
																.where(S1W2.purc_act_d_no.eq(purcActDR.purc_act_d_no))));
		dbSelect("MSBBL1340_MST_PURC_ACT_D_S01", purcActDR, purcActDR_bldr);
		return purcActDR;
	}
	
	protected MST_PURC_ACT_R getPurcAct(String purcActNo, MCNumber purcActSeq) {
		MST_PURC_ACT_R purcActR = MST_PURC_ACT_R.create("T");
		MCQueryApiBuilder purcActR_bldr = MCQueryApiBuilder.create(purcActR);
		purcActR_bldr.setWhere(purcActR.purc_act_no.eq(bind("1"))
				.and(purcActR.purc_act_seq.eq(bind("2"))), purcActNo, purcActSeq);
		dbSelect("MSBBL1340_MST_PURC_ACT_S01", purcActR, purcActR_bldr);
		return purcActR;
	}
	
	/**
	 * 通貨に対応する通貨マスタ.金額小数部有効桁数を取得する
	 * @param trdCurCd 通貨CD
	 * @return　通貨マスタ.金額小数部有効桁数
	 */
	protected MCNumber getAmtDecPlace(String trdCurCd) {
		MAM_CUR_R curR = MAM_CUR_R.create("T");
		dbSelectKey("MSBBL1340_MAM_CUR_S01", curR, MCQueryApiBuilder.create(curR), trdCurCd);
		return curR.amt_dec_place();
	}

	/**
	 * 取引先CDに対応する取引先マスタ.仕入金額端数処理区分
	 * @param bpCd　取引先CD
	 * @return　取引先マスタ.仕入金額端数処理区分
	 */
	protected String getRndTyp(String bpCd) {
		MAM_BP_R bpR = MAM_BP_R.create("T");
		MCQueryApiBuilder bpR_bldr = MCQueryApiBuilder.create(bpR);
		bpR_bldr.setSelect(bpR.purc_amt_rnd_typ);
		dbSelectKey("MSBBL1340_MAM_BP_S01", bpR, bpR_bldr, bpCd);
		return bpR.purc_amt_rnd_typ();
	}

	/**
	 * 取引先CDに対応する取引先マスタ.仕入税端数処理区分
	 * @param bpCd　取引先CD
	 * @return　取引先マスタ.仕入税端数処理区分
	 */
	protected String getTaxRndTyp(String bpCd) {
		MAM_BP_R bpR = MAM_BP_R.create("T");
		MCQueryApiBuilder bpR_bldr = MCQueryApiBuilder.create(bpR);
		bpR_bldr.setSelect(bpR.purc_tax_rnd_typ);
		dbSelectKey("MSBBL1340_MAM_BP_S02", bpR, bpR_bldr, bpCd);
		return bpR.purc_tax_rnd_typ();
	}
	
	/**
	 * RowMapper<br>
	 *  売上実績受払(MST_SLS_ACT_IO_R) -> 仕入返品登録サービス.上り電文(IoR)
	 * @param dtl
	 * @return
	 */
	protected Map_IoR_MST_SLS_ACT_IO_R<IoR,MST_SLS_ACT_IO_R> createMap_IoR_MST_SLS_ACT_IO_R(MCList<Chk01_DtlR> dtlL, MCList<Chk01_IoR> ioL) {
		return new Map_IoR_MST_SLS_ACT_IO_R<IoR, MST_SLS_ACT_IO_R>(dtlL, ioL);
	}

	public class Map_IoR_MST_SLS_ACT_IO_R<D extends IoR, S extends MST_SLS_ACT_IO_R> extends MCRowMapper<D,S>{
		
		MCList<Chk01_DtlR> _dtlL;
		MCList<Chk01_IoR> _ioL;
		MCIndexKey _insIdx;
		MCIndexKey _updIdx;
		MCIndexKey _dtlIdx;

		public Map_IoR_MST_SLS_ACT_IO_R(MCList<Chk01_DtlR> dtlL, MCList<Chk01_IoR> ioL) {		
			_dtlL = dtlL;
			_ioL = ioL;
			_updIdx = _ioL.createIndex(Chk01_IoR.$sls_act_io_no);
			_insIdx = _ioL.createIndex(Chk01_IoR.$purc_act_io_no);
			_dtlIdx = _dtlL.createIndex(Chk01_DtlR.$dtl_peg_no);
		}
		
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(IoR.$trd_unit_cd, MST_SLS_ACT_IO_R.$trd_unit_cd);
			addColumnPathMap(IoR.$trd_unit_qty, MST_SLS_ACT_IO_R.$trd_unit_qty);
			addColumnPathMap(IoR.$base_unit_cd, MST_SLS_ACT_IO_R.$base_unit_cd);
			addColumnPathMap(IoR.$base_unit_qty, MST_SLS_ACT_IO_R.$base_unit_qty);
			addColumnPathMap(IoR.$pack_unit_cd, MST_SLS_ACT_IO_R.$pack_unit_cd);
			addColumnPathMap(IoR.$pack_unit_qty, MST_SLS_ACT_IO_R.$pack_unit_qty);
			addColumnPathMap(IoR.$ref_purc_act_io_no, MST_SLS_ACT_IO_R.$purc_act_io_no);
			addColumnPathMap(IoR.$gd_cd, MST_SLS_ACT_IO_R.$gd_cd);
			addColumnPathMap(IoR.$lot_no, MST_SLS_ACT_IO_R.$lot_no);
			addColumnPathMap(IoR.$sublot_no, MST_SLS_ACT_IO_R.$sublot_no);
			addColumnPathMap(IoR.$sls_act_io_no, MST_SLS_ACT_IO_R.$sls_act_io_no);

		}
		

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			Chk01_IoR io = _ioL.getFirst(_updIdx, src.sls_act_io_no());
			Chk01_DtlR dtl = Chk01_DtlR.create();
			
			if (!isNull(io)) {
				dtl = _dtlL.getFirst(_dtlIdx, io.dtl_peg_no());
				if (!isNull(dtl) && dtl.isStatusDelete()) {
					io.setStatus(DELETE);
				}
			}
			if (isNull(io)){
				io = _ioL.getFirst(_insIdx, src.purc_act_io_no());
				dtl = _dtlL.getFirst(_dtlIdx, io.dtl_peg_no());
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			}
			else if (io.isStatusDelete()) {
				dtl = _dtlL.getFirst(_dtlIdx, io.dtl_peg_no());
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				dest.purc_ret_act_d_no(dtl.purc_act_d_no());
				dest.purc_ret_act_io_no(io.purc_ret_act_io_no());
				dest.purc_act_io_no(io.purc_act_io_no());
				dest.purc_ret_act_rev(io.purc_ret_act_rev());
			}
			else {
				dtl = _dtlL.getFirst(_dtlIdx, io.dtl_peg_no());
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				dest.purc_ret_act_d_no(dtl.purc_ret_act_d_no());
				dest.purc_ret_act_io_no(io.purc_ret_act_io_no());
				dest.purc_ret_act_rev(io.purc_ret_act_rev());
				
				MST_PURC_ACT_IO_R tmpIoR = MST_PURC_ACT_IO_R.create("T");
				MCQueryApiBuilder tmpIoR_bldr = MCQueryApiBuilder.create(tmpIoR);
				MST_PURC_ACT_IO_R S1W = MST_PURC_ACT_IO_R.create("W");
				tmpIoR_bldr.setSelect(tmpIoR.purc_act_io_no, tmpIoR.purc_act_io_seq);
				tmpIoR_bldr.setWhere(tmpIoR.purc_ret_act_io_no.eq(bind("1")), io.purc_ret_act_io_no());
				tmpIoR_bldr.addWhereWithAnd(tmpIoR.purc_act_io_seq.eq(subQuery()
								.select(max(S1W.purc_act_io_seq)).from(S1W)
								.where(S1W.purc_act_io_no.eq(tmpIoR.purc_act_io_no))));
				dbSelect("MSBBL1340_MST_PURC_ACT_IO_S02", tmpIoR, tmpIoR_bldr);
				
				dest.purc_act_io_no(tmpIoR.purc_act_io_no());
				dest.purc_act_io_seq(tmpIoR.purc_act_io_seq());
			}

			dest.purc_cont_qty(src.getNumberNE("purc_cont_qty"));
			
			MST_PURC_ACT_IO_R db = MST_PURC_ACT_IO_R.create("T");
			MCQueryApiBuilder db_bldr = MCQueryApiBuilder.create(db);
			MST_PURC_ACT_IO_R S1W = MST_PURC_ACT_IO_R.create("W");
			db_bldr.setSelect(db.purc_act_io_seq, db.ver_no, db.in_to_loc_cd,
					db.in_to_loc_wg_cd, db.str_ln_cd, db.quality_typ, db.stk_id_typ);
			if (MAC_DATA_CRUD_TYP.isCRT(dest.data_crud_typ())) {
				db_bldr.setWhere(db.purc_act_io_no.eq(bind("1")), src.purc_act_io_no());
			}
			else {
				db_bldr.setWhere(db.purc_act_io_no.eq(bind("1")), dest.purc_act_io_no());
			}
			db_bldr.addWhereWithAnd(db.purc_act_io_seq.eq(subQuery().select(max(S1W.purc_act_io_seq))
							.from(S1W).where(S1W.purc_act_io_no.eq(db.purc_act_io_no))));
			dbSelect("MSBBL1340_MST_PURC_ACT_IO_S03", db, db_bldr);
			
			if (MAC_DATA_CRUD_TYP.isCRT(dest.data_crud_typ())) {
				dest.ref_purc_act_io_seq(db.purc_act_io_seq());
			}
			else {
				MST_PURC_ACT_IO_R refPurcActIoR = MST_PURC_ACT_IO_R.create("T");
				MCQueryApiBuilder refPurcActIoR_bldr = MCQueryApiBuilder.create(refPurcActIoR);
				refPurcActIoR_bldr.setSelect(refPurcActIoR.purc_act_io_seq);
				refPurcActIoR_bldr.setWhere(refPurcActIoR.purc_act_io_no.eq(bind("1")), src.purc_act_io_no());
				refPurcActIoR_bldr.addWhereWithAnd(refPurcActIoR.purc_act_io_seq.eq(subQuery()
								.select(max(S1W.purc_act_io_seq)).from(S1W)
								.where(S1W.purc_act_io_no.eq(refPurcActIoR.purc_act_io_no))));
				dbSelect("MSBBL1340_MST_PURC_ACT_IO_S04", refPurcActIoR, refPurcActIoR_bldr);
				
				dest.ref_purc_act_io_seq(refPurcActIoR.purc_act_io_seq());
			}
			dest.ver_no(db.ver_no());
			dest.purc_ret_loc_cd(db.in_to_loc_cd());
			dest.purc_ret_loc_wg_cd(db.in_to_loc_wg_cd());
			dest.str_ln_cd(db.str_ln_cd());
			dest.quality_typ(db.quality_typ());
			dest.stk_id_typ(db.stk_id_typ());
			dest.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
			dest.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
			dest.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
			if (MAC_LOT_MNG_TYP.isNOT_MNG(dtl.lot_mng_typ()) && isNull(dest.lot_no())) {
				dest.lot_no(MAC_STR.NULL_VAL.value());
			}
			if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(dtl.sublot_mng_typ()) && isNull(dest.sublot_no())) {
				dest.sublot_no(MAC_STR.NULL_VAL.value());
			}
		}
	}

	/**
	 * 	受払実績サービスの呼出 (Ins01,Upd01,Del01共通)<br>
	 * {@link MSBEL_IoActService.IoAct_Upd01}
	 */
	protected void callIoActSrvUpd01() {

		MSBEL_IoActService.IoAct_Upd01 ope = MSBEL_IoActService.crtIoAct_Upd01();
		ope.exec();
	}

	// Chk01およびIns01、Upd01オペレーションで共有するオブジェクトはキャッシュを使用
	protected static final Class<MSBBL_SlsRetReg> CLAZZ = MSBBL_SlsRetReg.class;

	protected FXUCL_Cache<MST_PURC_ACT_D_R> _purcActDCache;

	protected static void initPurcActDCache(MCList<Chk01_DtlR> dtlL) {
		object(CLAZZ)._initPurcActDCache(dtlL);
	}

	protected void _initPurcActDCache(MCList<Chk01_DtlR> dtlL) {

		MCList<Chk01_DtlR> bindL = dtlL.groupBy(Chk01_DtlR.$purc_act_d_no);
		
		MCList<MST_PURC_ACT_D_R> purcActDL = MCList.create(MST_PURC_ACT_D_R.class);
		MST_PURC_ACT_D_R t = MST_PURC_ACT_D_R.create("T");
		MCQueryApiBuilder purcActDL_bldr = MCQueryApiBuilder.create(t);
		MST_PURC_ACT_R t2 = MST_PURC_ACT_R.create("T2");
		purcActDL_bldr.addInnerJoin(t2, bracket( t.purc_act_no.eq(t2.purc_act_no)
											.and(t.purc_act_seq.eq(t2.purc_act_seq))));
		purcActDL_bldr.setWhere(t2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
		purcActDL_bldr.addWhereWithAnd(t.purc_act_d_no.eq(bind("purc_act_d_no")));
		dbSelect("MSBBL1340_MST_PURC_ACT_D_S02", purcActDL, purcActDL_bldr, bindL);
		
		_purcActDCache = new FXUCL_Cache<MST_PURC_ACT_D_R>();
		_purcActDCache.setMaxCacheSize(-1);
		for (MST_PURC_ACT_D_R purcActD : purcActDL) {
			// 最新リビジョンのみ取得するので、キャッシュのキーは仕入実績明細ＮＯのみを使用
			_purcActDCache.putCache(new String[] {
				purcActD.purc_act_d_no()
			}, purcActD);
		}
	}

	/**
	 * 	仕入実績明細ＮＯをキーに仕入実績明細情報を取得する
	 * @param purcActDNo
	 * @return
	 */
	protected static MST_PURC_ACT_D_R getPurcActDCache(String purcActDNo) {
		return object(CLAZZ)._getPurcActDCache(purcActDNo);
	}

	protected MST_PURC_ACT_D_R _getPurcActDCache(String purcActDNo) {
		return _purcActDCache.getCache(new String[] {
			purcActDNo
		});
	}

	protected FXUCL_Cache<MST_PURC_ACT_R> _purcActCache;

	protected static void initPurcActCache(MCList<Chk01_DtlR> dtlL) {
		object(CLAZZ)._initPurcActCache(dtlL);
	}

	protected void _initPurcActCache(MCList<Chk01_DtlR> dtlL) {

		MCList<Chk01_DtlR> bindL = dtlL.groupBy(Chk01_DtlR.$purc_act_no);

		MCList<MST_PURC_ACT_R> purcActL = MCList.create(MST_PURC_ACT_R.class);
		purcActL.addBooleanColumn(MAM_BP_R.$sppl_iv_flg);
		purcActL.addBooleanColumn(MAM_BP_R.$pay_spot_flg);
		
		MST_PURC_ACT_R t = MST_PURC_ACT_R.create("T");
		MAM_BP_R spplR = MAM_BP_R.create("SPPL");
		MAM_BP_R aspplR = MAM_BP_R.create("ASPPL");
		MAM_BP_R bspplR = MAM_BP_R.create("BSPPL");
		MCQueryApiBuilder purcActL_bldr = MCQueryApiBuilder.create(t);
		purcActL_bldr.addSelect(spplR.sppl_iv_flg);
		purcActL_bldr.addSelect(bspplR.pay_spot_flg);
		purcActL_bldr.addLeftOuterJoin(spplR, t.sppl_cd.eq(spplR.bp_cd));
		purcActL_bldr.addLeftOuterJoin(aspplR, spplR.asppl_cd.eq(aspplR.bp_cd));
		purcActL_bldr.addLeftOuterJoin(bspplR, aspplR.bsppl_cd.eq(bspplR.bp_cd));
		purcActL_bldr.setWhere(t.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
		purcActL_bldr.addWhereWithAnd(t.purc_act_no.eq(bind("purc_act_no")));
		dbSelect("MSBBL1340_MST_PURC_ACT_S02", purcActL, purcActL_bldr, bindL);
		
		_purcActCache = new FXUCL_Cache<>();
		_purcActCache.setMaxCacheSize(-1);
		for (MST_PURC_ACT_R purcAct : purcActL) {
			// 最新リビジョンのみ取得するので、キャッシュのキーは仕入実績ＮＯのみを使用
			_purcActCache.putCache(new String[] {
				purcAct.purc_act_no()
			}, purcAct);
		}
	}

	/**
	 * 	仕入実績ＮＯをキーに仕入実績情報を取得する
	 * @param purcActDNo
	 * @return
	 */
	protected static MST_PURC_ACT_R getPurcActCache(String purcActNo) {
		return object(CLAZZ)._getPurcActCache(purcActNo);
	}

	protected MST_PURC_ACT_R _getPurcActCache(String purcActNo) {
		return _purcActCache.getCache(new String[] {
			purcActNo
		});
	}

	protected FXUCL_MCDbcCache<MAM_TAX_R> _taxCache;

	protected static void initTaxCache() {
		object(CLAZZ)._initTaxCache();
	}

	protected void _initTaxCache() {
		_taxCache = null;
		_taxCache = new FXUCL_MCDbcCache<MAM_TAX_R>(MCQueryApiBuilder.create(MAM_TAX_R.create("T")));
	}

	/**
	 * 税ＣＤをキーに税マスタを取得する
	 * @param taxCd
	 * @return
	 */
	protected static MAM_TAX_R getTaxCache(String taxCd) {
		return object(CLAZZ)._getTaxCache(taxCd);
	}

	protected MAM_TAX_R _getTaxCache(String taxCd) {
		return _taxCache.get(taxCd);
	}

	protected FXUCL_MCDbcCache<MAM_CUR_R> _curCache;

	protected static void initCurCache() {
		object(CLAZZ)._initCurCache();
	}

	protected void _initCurCache() {
		_curCache = null;
		_curCache = new FXUCL_MCDbcCache<MAM_CUR_R>(MCQueryApiBuilder.create(MAM_CUR_R.create("T")));
	}

	/**
	 * 通貨ＣＤをキーに通貨マスタを取得する
	 * @param taxCd
	 * @return
	 */
	protected static MAM_CUR_R getCurCache(String curCd) {
		return object(CLAZZ)._getCurCache(curCd);
	}

	protected MAM_CUR_R _getCurCache(String curCd) {
		return _curCache.get(curCd);
	}
	
	protected void copyGUIIndexDtlToIo(MCList<Chk01_DtlR> DtlL, MCList<Chk01_IoR> IoL) {
		MCIndexKey ik = DtlL.createIndex(Chk01_DtlR.$dtl_peg_no);
		IoL.forEach(ir -> {
		Chk01_DtlR dr = DtlL.getFirst(ik, ir.dtl_peg_no());
			if(!isNull(dr)) {
				// メッセージ出力用に行番号のみを上段の行番号を設定する
				ir.setGUIIndex(dr.getGUIIndex());
			}
		});
	}

	/**
	 * Chk02オペレーション.<p>
	 *
	 * 売上返品予定情報を取消前チェックをします。<br>
	 */
	public class Chk02 extends MSBBL_SlsRetReg_MC_A.Chk02 {
		
		protected MCList<MST_SLS_ACT_D_R> _slsActDL;
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			setDown();
		}

		protected void setDown() {

			// 紐付けＮＯの設定
			MCIndexKey idxkey = up2().createIndex(Chk02_IoR.$sls_act_d_no);

			int i = 0;
			for (Chk02_DtlR parDtl : up1()) {
				parDtl.peg_no(up0().peg_no());
				parDtl.dtl_peg_no(i);
				MCList<Chk02_IoR> ioR = up2().subList(idxkey, new String[] {
					parDtl.sls_act_d_no()
				});
				ioR.setNumberNE(Chk02_IoR.$dtl_peg_no, i);
				i++;
			}

			// io_peg_noには明細毎の連番ではなくユニーク連番を付与する
			setPegNo(Chk02_IoR.$io_peg_no, up2());
			for (Chk02_IoR io : up2()) {
				io.peg_no(up0().peg_no());
			}

			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
			down2().setAll(up2());
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 更新カウンタチェック、排他ロック獲得
			msgL.addAll(lockAndCheckBase());


			return msgL;
		}

		@Override
		protected MCMessageList doServerCheck() {
			MCMessageList msgL = super.doServerCheck();
			
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

			msgL.addAll(checkExists());

			// 取消前の売上部門に対してDAC更新権限チェック
			msgL.addAll(checkWritableDptCdDac(up0(), MST_SLS_ACT_R.$sls_dpt_cd));

			// 打切チェック
			msgL.addAll(checkAbort(up2()));
			
			// 有効明細行数チェック
			msgL.addAll(checkAtLeastOneDtl(up0(), up1()));
			msgL.addAll(checkAtLeastOneIo(up1(), up2()));

			//入荷実績サービス(チェック)の呼出
			callArrActSvChk01();

			return msgL;
		}

		/**
		 * 	排他ロック獲得、更新カウンタチェック
		 * @return
		 */
		protected MCMessageList lockAndCheckBase() {

			MCMessageList msgL = new MCMessageList();

			MST_SLS_ACT_R slsAct = MST_SLS_ACT_R.create("T");
			MCQueryApiBuilder slsAct_bldr = MCQueryApiBuilder.create(slsAct);
			dbSelectKeyForUpdateNoWait("MSBBL1340_MST_SLS_ACT_S02", slsAct, slsAct_bldr, up0());
			msgL.addAll(checkUpdCntrNE(up0(), Chk01_HdrR.$upd_cntr, slsAct));

			if (hasErr()) {
				return msgL;
			}

			up0().sls_ret_schd_no(slsAct.sls_ret_schd_no());
			up0().sls_dpt_cd(slsAct.sls_dpt_cd());

			MCList<MST_SLS_ACT_D_R> slsActDL = MCList.create(MST_SLS_ACT_D_R.class);
			MST_SLS_ACT_D_R slsActDL_t = MST_SLS_ACT_D_R.create("T");
			MCQueryApiBuilder slsActDL_bldr = MCQueryApiBuilder.create(slsActDL_t);
			slsActDL_bldr.setWhere(slsActDL_t.sls_act_no.eq(bind("sls_act_no")));
			slsActDL_bldr.addWhereWithAnd(slsActDL_t.sls_act_seq.eq(bind("sls_act_seq")));
			slsActDL_bldr.setOrderByAsc(slsActDL_bldr.getBaseDbc().getKeyColumn$());
			dbSelectForUpdate("MSBBL1340_MST_SLS_ACT_D_S06", slsActDL, slsActDL_bldr, up0());
			
			copyGUIup1ToDtlL(slsActDL,up1());
			
			up1().clear();
			addAll(up1(), slsActDL, createMap_Chk02_DtlR_MST_SLS_ACT_D_R());
			
			MCList<MST_SLS_ACT_IO_R> slsActIoL = MCList.create(MST_SLS_ACT_IO_R.class);
			MST_SLS_ACT_IO_R slsActIoL_t = MST_SLS_ACT_IO_R.create("T");
			MCQueryApiBuilder slsActIoL_bldr = MCQueryApiBuilder.create(slsActIoL_t);
			MST_ARR_SCHD_R S1X = MST_ARR_SCHD_R.create("X");
			MST_SLS_ACT_D_R t2 = MST_SLS_ACT_D_R.create("T2");
			MST_ARR_ACT_R t3 = MST_ARR_ACT_R.create("T3");
			slsActIoL_bldr.setSelect(slsActIoL_t.sls_act_io_no);
			slsActIoL_bldr.addSelect(slsActIoL_t.sls_act_io_seq);
			slsActIoL_bldr.addSelect(slsActIoL_t.sls_act_d_no);
			slsActIoL_bldr.addSelect(slsActIoL_t.arr_act_no);
			slsActIoL_bldr.addSelect(slsActIoL_t.sync_flg);
			// 打切ＦＬＧの状態も取得（打切チェックで利用）
			slsActIoL.addBooleanColumn("abort_flg");
			slsActIoL_bldr.addSelect(cases()
							.when(exists(subQuery().select(value("X")).from(S1X)
									.where(S1X.arr_schd_no.eq(t3.arr_schd_no)
											.and(S1X.sls_ret_schd_abort_flg.eq(value(true))))))
							.then(value(true)).otherwise(value(false)).as("abort_flg"));
			slsActIoL_bldr.addInnerJoin(t2,
					bracket(slsActIoL_t.sls_act_d_no.eq(t2.sls_act_d_no)
							.and(slsActIoL_t.sls_act_d_seq.eq(t2.sls_act_d_seq))));
			slsActIoL_bldr.addLeftOuterJoin(t3, bracket( slsActIoL_t.arr_act_no.eq(t3.arr_act_no)));
			slsActIoL_bldr.setWhere(t2.sls_act_no.eq(bind("sls_act_no")));
			slsActIoL_bldr.addWhereWithAnd(t2.sls_act_seq.eq(bind("sls_act_seq")));
			slsActIoL_bldr.setLockTable(slsActIoL_t.sls_act_io_no);
			slsActIoL_bldr.setOrderByAsc(slsActIoL_bldr.getBaseDbc().getKeyColumn$());
			dbSelectForUpdate("MSBBL1340_MST_SLS_ACT_IO_S04", slsActIoL, slsActIoL_bldr, up0());
			
			for (MST_SLS_ACT_IO_R slsActIoR : slsActIoL) {
				for (Chk02_IoR ioR : up2()) {
					if (isSame(slsActIoR.sls_act_io_no(), ioR.sls_act_io_no()) && !isNull(ioR.purc_ret_act_no())) {
						slsActIoR.setStringNE("purc_ret_act_no", ioR.purc_ret_act_no());
						slsActIoR.setNumberNE("purc_ret_act_rev", ioR.purc_ret_act_rev());
					}
					if (isSame(slsActIoR.arr_act_no(), ioR.arr_act_no())) {
						slsActIoR.sync_flg(ioR.sync_flg());
						break;
					}
				}
			}
			
			copyGUIup2ToIoL(slsActIoL,up2());
			
			up2().clear();
			addAll(up2(), slsActIoL, createMap_Chk02_IoR_MST_SLS_ACT_IO_R());
			
			_slsActDL = MCList.create(MST_SLS_ACT_D_R.class);
			_slsActDL.setAll(slsActDL);
			
			return msgL;
		}
		
		protected void copyGUIup1ToDtlL(MCList<MST_SLS_ACT_D_R> slsActDL, MCList<Chk02_DtlR> dtlL) {
			MCIndexKey up1key = up1().createIndex(Chk02_DtlR.$sls_act_d_no);
			for(MST_SLS_ACT_D_R slsActDR :slsActDL) {
				slsActDR.setAttributes(up1().getFirst(up1key, slsActDR.sls_act_d_no()));
			}
		}
		
		protected void copyGUIup2ToIoL(MCList<MST_SLS_ACT_IO_R> slsActIoL, MCList<Chk02_IoR> IoL) {
			MCIndexKey up2key = up2().createIndex(Chk02_IoR.$sls_act_io_no);
			for(MST_SLS_ACT_IO_R slsActIoR :slsActIoL) {
				slsActIoR.setAttributes(up2().getFirst(up2key,slsActIoR.sls_act_io_no()));
			}
		}

		/**
		 * 	RowMapper<br>
		 *  売上実績明細(MST_SLS_ACT_D_R) -> 上り電文(Chk02_DtlR）
		 * @return
		 */
		protected Map_Chk02_DtlR_MST_SLS_ACT_D_R<Chk02_DtlR, MST_SLS_ACT_D_R> createMap_Chk02_DtlR_MST_SLS_ACT_D_R() {
			return new Map_Chk02_DtlR_MST_SLS_ACT_D_R<Chk02_DtlR, MST_SLS_ACT_D_R>();
		}

		public class Map_Chk02_DtlR_MST_SLS_ACT_D_R<D extends Chk02_DtlR, S extends MST_SLS_ACT_D_R>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk02_DtlR.$sls_act_d_no, MST_SLS_ACT_D_R.$sls_act_d_no);
				addColumnPathMap(Chk02_DtlR.$sls_act_d_seq,
						MST_SLS_ACT_D_R.$sls_act_d_seq);
				addColumnPathMap(Chk02_DtlR.$sls_ret_schd_d_no,
						MST_SLS_ACT_D_R.$sls_ret_schd_d_no);
			}
		}

		/**
		 * 	RowMapper<br>
		 *  売上実績受払(MST_SLS_ACT_IO_R) -> 上り電文(Chk02_IoR）
		 * @return
		 */
		protected Map_Chk02_IoR_MST_SLS_ACT_IO_R<Chk02_IoR, MST_SLS_ACT_IO_R> createMap_Chk02_IoR_MST_SLS_ACT_IO_R() {
			return new Map_Chk02_IoR_MST_SLS_ACT_IO_R<Chk02_IoR, MST_SLS_ACT_IO_R>();
		}

		public class Map_Chk02_IoR_MST_SLS_ACT_IO_R<D extends Chk02_IoR, S extends MST_SLS_ACT_IO_R>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk02_IoR.$sync_flg, MST_SLS_ACT_IO_R.$sync_flg);
				addColumnPathMap(Chk02_IoR.$sls_act_io_no,
						MST_SLS_ACT_IO_R.$sls_act_io_no);
				addColumnPathMap(Chk02_IoR.$sls_act_io_seq,
						MST_SLS_ACT_IO_R.$sls_act_io_seq);
				addColumnPathMap(Chk02_IoR.$sls_act_d_no, MST_SLS_ACT_IO_R.$sls_act_d_no);
				addColumnPathMap(Chk02_IoR.$arr_act_no, MST_SLS_ACT_IO_R.$arr_act_no);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.abort_flg(src.getBooleanNE("abort_flg"));
				dest.purc_ret_act_no(src.getStringNE("purc_ret_act_no"));
				dest.purc_ret_act_rev(src.getNumberNE("purc_ret_act_rev"));
			}

		}

		protected MCMessageList checkExists() {

			MCMessageList msgL = new MCMessageList();

			// 仕入返品対象の場合、仕入返品実績存在チェック
			if (up0().purc_ret_tgt_flg()) {
				MCList<MST_PURC_RET_ACT_D_R> purcRetActL = MCList.create(MST_PURC_RET_ACT_D_R.class);
				MST_PURC_RET_ACT_D_R t = MST_PURC_RET_ACT_D_R.create("T");
				MCQueryApiBuilder purcRetActL_bldr = MCQueryApiBuilder.create(t);
				purcRetActL_bldr.setSelect(t.purc_ret_act_no);
				purcRetActL_bldr.addSelect(t.purc_ret_act_rev);
				purcRetActL_bldr.setDistinct();
				purcRetActL_bldr.setWhere(t.sls_act_d_no.eq(bind("sls_act_d_no")));
				int cnt = dbSelect("MSBBL1340_MST_PURC_RET_ACT_D_S01", purcRetActL, purcRetActL_bldr, up1());
				
				if (cnt < 1) {
					// 仕入直送売上返品のどの実績明細からもユニークな仕入返品ヘッダが取得可能な前提として、任意の明細行の情報を返す
					msgL.addAll(getRecordNotFoundMsg(getModuleID(),
							purcRetActL.createRow().tableName(), new String[] {
								MST_PURC_RET_ACT_D_R.$sls_act_d_no
							}, up1().get(0).toArray(Chk02_DtlR.$sls_act_d_no), up0()));
				}
				if (cnt == 1) {
					MST_PURC_RET_ACT_D_R purcRetActD = purcRetActL.get(0);
					up0().purc_ret_act_no(purcRetActD.purc_ret_act_no());
					up0().purc_ret_act_rev(purcRetActD.purc_ret_act_rev());
				}
			}
			return msgL;
		}

		/**
		 * 詳細0件チェックのユーティリティメソッド
		 * <p>明細に紐づく詳細行が1件以上存在すること</p>
		 * @param dtlL
		 * @param ioL
		 * @return
		 */
		protected MCMessageList checkAtLeastOneIo(MCList<Chk02_DtlR> dtlL,
				MCList<Chk02_IoR> ioL) {
			MCMessageList msgL = new MCMessageList();

			MCIndexKey idxkey = ioL.createIndex(Chk02_IoR.$sls_act_d_no);

			for (Chk02_DtlR parDtl : dtlL) {
				MCList<Chk02_IoR> chdIoL = ioL.subList(idxkey,
						parDtl.toArray(Chk02_DtlR.$sls_act_d_no));
				if (chdIoL.isEmpty()) {
					msgL.add(new MCMessage(parDtl, null, MAUDL0012,
							toDispGUIIndex(parDtl)));
				}
			}
			return msgL;
		}

		/**
		 * 	打切チェック
		 * <p>打切となっている実績を取り消そうとした場合
		 * </p>
		 * @return
		 */
		protected MCMessageList checkAbort(MCList<Chk02_IoR> up2) {
			MCMessageList msgL = new MCMessageList();
			for (Chk02_IoR up2R :up2) {
				if (up2R.abort_flg()) {
					msgL.add(new MCMessage(up2R, null, MSBBL0108, toDispGUIIndex(up2R)));
				}
			}
			return msgL;
		}

		/**
		 * 入荷実績サービス呼出<br>
		 * {@link MSBEL_ArrActService.ArrAct_Chk01}
		 */
		protected void callArrActSvChk01() {
			MCList<Chk02_IoR> upIoL = getChkList(up2().subList(Chk02_IoR.$sync_flg, true));
			if (!upIoL.isEmpty()) {
				MSBEL_ArrActService.ArrAct_Chk01 ope = MSBEL_ArrActService.crtArrAct_Chk01();
				addAll(ope.up0(), upIoL, createMap_ArrAct_DtlR_Chk02_IoR(up0()));
				ope.exec();
			}
		}
	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 売上返品情報を取消します。<br>
	 */
	public class Del01 extends MSBBL_SlsRetReg_MC_A.Del01 {
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

			// 入荷実績サービス呼出
			callArrActSvUpd01();

			// 売上返品サービス呼出
			callSlsRetSvUpd01();
			
			// 仕入返品サービス呼出
			callPurcRetSvDel01();

			// 受払実績サービス呼出
			callIoActSrvUpd01();

		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {

			//　紐付けＮＯの設定
			setPegNo(up0());
			copyGUIIndexDtlToIo();
		}
		
		protected void copyGUIIndexDtlToIo() {
			MCIndexKey ik = up2().createIndex(Chk02_DtlR.$sls_act_d_no);
			up1().forEach(ir -> {
			Chk02_DtlR dr = up2().getFirst(ik, ir.sls_act_d_no());
				if(!isNull(dr)) {
					// メッセージ出力用に行番号のみを上段の行番号を設定する
					ir.setGUIIndex(dr.getGUIIndex());
				}
			});
		}

		/**
		 * 	Chk02オペレーションの呼出
		 */
		protected void callThisChk02() {
			MSBBL_SlsRetReg.Chk02 ope = MSBBL_SlsRetReg.crtChk02();
			MCRow.copyall(ope.up0(), up0());
			ope.up1().addAll(up2());
			ope.up2().addAll(up1());
			
			ope.exec();

			MCRow.copyall(up0(), ope.down0());
			Sret_Del01_Dtl().setAll(ope.down1());
			up2().setAll(ope.down1());
			up1().setAll(ope.down2());
			
		}

		/**
		 * 入荷実績サービスの呼出<br>
		 * {@link MSBEL_ArrActService.ArrAct_Upd01}
		 */
		protected void callArrActSvUpd01() {

			MCList<Chk02_IoR> upIoL = up1().subList(Chk02_IoR.$sync_flg, true);
			if (!upIoL.isEmpty()) {
				MSBEL_ArrActService.ArrAct_Upd01 ope = MSBEL_ArrActService.crtArrAct_Upd01();
				addAll(ope.up1(), upIoL, createMap_ArrAct_DtlR_Chk02_IoR(up0()));
				ope.exec();
			}
		}

		/**
		 * 	RowMapper 上り電文(Chk02_HdrR) -> 売上返品サービス.上り電文(SlsRet_Upd01_HdrR)
		 * @return
		 */
		protected Map_SlsRet_Upd01_HdrR_Chk02_HdrR<SlsRet_Upd01_HdrR, Chk02_HdrR> createMap_SlsRet_Upd01_HdrR_Chk02_HdrR() {
			return new Map_SlsRet_Upd01_HdrR_Chk02_HdrR<SlsRet_Upd01_HdrR, Chk02_HdrR>();
		}

		public class Map_SlsRet_Upd01_HdrR_Chk02_HdrR<D extends SlsRet_Upd01_HdrR, S extends Chk02_HdrR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsRet_Upd01_HdrR.$hdr_peg_no, Chk02_HdrR.$peg_no);
				addColumnPathMap(SlsRet_Upd01_HdrR.$sls_ret_schd_no,
						Chk02_HdrR.$sls_ret_schd_no);
				addColumnPathMap(SlsRet_Upd01_HdrR.$sls_act_no, Chk02_HdrR.$sls_act_no);
				addColumnPathMap(SlsRet_Upd01_HdrR.$sls_act_seq, Chk02_HdrR.$sls_act_seq);
				addColumnPathMap(SlsRet_Upd01_HdrR.$can_ac_dt, Chk02_HdrR.$can_ac_dt);
				addColumnPathMap(SlsRet_Upd01_HdrR.$dlv_slip_prnt_flg,
						Chk02_HdrR.$dlv_slip_out_flg);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				dest.trd_ptn_typ(MAC_TRD_PTN_TYP.SLS_RTN.value());
				dest.indiv_prnt_flg(true);
				dest.amt_calc_flg(false);
			}

		}

		/**
		 * 	RowMapper<br>
		 *  チェックOpe下り電文(Chk02_DtlR) -> 売上返品サービス.上り電文(SlsRet_Upd01_DtlR)
		 * @return
		 */
		protected Map_SlsRet_Upd01_DtlR_Chk02_DtlR<SlsRet_Upd01_DtlR, Chk02_DtlR> createMap_SlsRet_Upd01_DtlR_Chk02_DtlR() {
			return new Map_SlsRet_Upd01_DtlR_Chk02_DtlR<SlsRet_Upd01_DtlR, Chk02_DtlR>();
		}

		public class Map_SlsRet_Upd01_DtlR_Chk02_DtlR<D extends SlsRet_Upd01_DtlR, S extends Chk02_DtlR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsRet_Upd01_DtlR.$hdr_peg_no, Chk02_DtlR.$peg_no);
				addColumnPathMap(SlsRet_Upd01_DtlR.$dtl_peg_no, Chk02_DtlR.$dtl_peg_no);
				addColumnPathMap(SlsRet_Upd01_DtlR.$sls_act_d_no,
						Chk02_DtlR.$sls_act_d_no);
				addColumnPathMap(SlsRet_Upd01_DtlR.$sls_act_d_seq,
						Chk02_DtlR.$sls_act_d_seq);
				addColumnPathMap(SlsRet_Upd01_DtlR.$sls_ret_schd_d_no,
						Chk02_DtlR.$sls_ret_schd_d_no);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				dest.abort_qty(0);
			}

		}

		/**
		 * 	RowMapper<br>
		 *  チェックOpe下り電文(Chk02_IoR) -> 売上返品サービス.上り電文(SlsRet_Upd01_IoR)
		 * @return
		 */
		protected Map_SlsRet_Upd01_IoR_Chk02_IoR<SlsRet_Upd01_IoR, Chk02_IoR> createMap_SlsRet_Upd01_IoR_Chk02_IoR() {
			return new Map_SlsRet_Upd01_IoR_Chk02_IoR<SlsRet_Upd01_IoR, Chk02_IoR>();
		}

		public class Map_SlsRet_Upd01_IoR_Chk02_IoR<D extends SlsRet_Upd01_IoR, S extends Chk02_IoR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsRet_Upd01_IoR.$hdr_peg_no, Chk02_IoR.$peg_no);
				addColumnPathMap(SlsRet_Upd01_IoR.$dtl_peg_no, Chk02_IoR.$dtl_peg_no);
				addColumnPathMap(SlsRet_Upd01_IoR.$io_peg_no, Chk02_IoR.$io_peg_no);
				addColumnPathMap(SlsRet_Upd01_IoR.$sls_act_io_no,
						Chk02_IoR.$sls_act_io_no);
				addColumnPathMap(SlsRet_Upd01_IoR.$sls_act_io_seq,
						Chk02_IoR.$sls_act_io_seq);
				addColumnPathMap(SlsRet_Upd01_IoR.$arr_act_no,
						Chk02_IoR.$arr_act_no);
				addColumnPathMap(SlsRet_Upd01_IoR.$sync_flg, Chk02_IoR.$sync_flg);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
		}

		/**
		 * 売上返品サービス呼出<br>
		 * {@link MSBBL_SlsRetService.SlsRet_Upd01}
		 */
		protected void callSlsRetSvUpd01() {

			MSBBL_SlsRetService.SlsRet_Upd01 ope = MSBBL_SlsRetService.crtSlsRet_Upd01();
			SlsRet_Upd01_HdrR up0 = ope.up0().createRow();
			copy(up0, up0(), createMap_SlsRet_Upd01_HdrR_Chk02_HdrR());
			ope.up0().add(up0);
			addAll(ope.up1(), up2(), createMap_SlsRet_Upd01_DtlR_Chk02_DtlR());
			addAll(ope.up2(), up1(), createMap_SlsRet_Upd01_IoR_Chk02_IoR());

			ope.exec();
		}

		/**
		 * 仕入返品サービスの呼出 (Del01)<br>
		 * {@link MSBDL_PurcRetRegService.PurcRet_Del01}
		 */
		protected void callPurcRetSvDel01() {
			
			// 仕入直送返品対象の場合
			if (up0().purc_ret_tgt_flg()) {
				MSBDL_PurcRetRegService.PurcRet_Chk03 chkOpe = MSBDL_PurcRetRegService.crtPurcRet_Chk03();
				
				// 仕入返品実績ＮＯの件数分電文作成
				MCList<HdrR> chkUp0L = MCList.create(HdrR.class);
				MCList<Chk02_IoR> tmpUp1L = up1().groupBy(Chk02_IoR.$purc_ret_act_no, Chk02_IoR.$purc_ret_act_rev);
				for (int i = 0; i < tmpUp1L.size(); i++) {
					Chk02_IoR tmpUp1R = tmpUp1L.get(i);
					HdrR chkOpeUp0 = chkOpe.up0().createRow();
					chkOpeUp0.peg_no(i + 1);
					chkOpeUp0.can_ac_dt(up0().can_ac_dt());
					chkOpeUp0.trd_ptn_typ(MAC_TRD_PTN_TYP.PURC_RTN.value());
					chkOpeUp0.trd_cd(MAUCL_TrdUtil.getDefaultTrdCd(MAC_TRD_PTN_TYP.PURC_RTN.value()));
					chkOpeUp0.purc_ret_act_no(tmpUp1R.purc_ret_act_no());
					chkOpeUp0.purc_ret_act_rev(tmpUp1R.purc_ret_act_rev());
					chkUp0L.add(chkOpeUp0);
				}
				
				// チェック処理
				chkOpe.up0().addAll(chkUp0L);
				chkOpe.up1().addAll(chkOpe.getPurcRetActD(chkOpe.up0()));
				chkOpe.up2().addAll(chkOpe.getPurcRetActIo(chkOpe.up1()));
				chkOpe.exec();
				
				// 取消処理
				MSBDL_PurcRetRegService.PurcRet_Del01 ope = MSBDL_PurcRetRegService.crtPurcRet_Del01();
				HdrL<HdrR> up0 = ope.up0().createInstance();
				
				up0.addAll(chkOpe.up0());
				copyErrFlg(up0, chkOpe.down0());
				ope.up0().addAll(up0.subList(HdrR.$err_flg, false));
				ope.up0().forEach(r -> {
					r.indiv_prnt_flg(true);
					r.amt_calc_flg(true);
				});
				ope.up1().addAll(chkOpe.getPurcRetActD(ope.up0()));
				ope.up2().addAll(chkOpe.getPurcRetActIo(ope.up1()));
				
				if (ope.up0().size() != 0) {
					ope.exec();
				}
				else {
					throwDelErr();
				}
			}
		}
	}

	/**
	 * 	RowMapper<br>
	 * 	チェックOpe下り電文(Chk02_IoR) -> 入荷実績サービス.上り電文(ArrAct_DtlR)
	 * @param hdr
	 * @return
	 */
	protected Map_ArrAct_DtlR_Chk02_IoR<ArrAct_DtlR, Chk02_IoR> createMap_ArrAct_DtlR_Chk02_IoR(
			Chk02_HdrR hdr) {
		return new Map_ArrAct_DtlR_Chk02_IoR<ArrAct_DtlR, Chk02_IoR>(hdr);
	}

	public class Map_ArrAct_DtlR_Chk02_IoR<D extends ArrAct_DtlR, S extends Chk02_IoR>
			extends MCRowMapper<D, S> {

		Chk02_HdrR _hdr;

		public Map_ArrAct_DtlR_Chk02_IoR(Chk02_HdrR hdr) {
			_hdr = hdr;
		}

		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ArrAct_DtlR.$peg_no, Chk02_IoR.$peg_no);
			addColumnPathMap(ArrAct_DtlR.$arr_act_no, Chk02_IoR.$arr_act_no);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			dest.can_ac_dt(_hdr.can_ac_dt());
			dest.sync_flg(true);
		}

	}

	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 単価を再取得します。<br>
	 */
	public class Sprt01 extends MSBBL_SlsRetReg_MC_A.Sprt01 {
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
				Sret_Sprt01_DtlR.$sls_upri, Sret_Sprt01_DtlR.$interim_flg
			};
			String[] srcCols = new String[] {
				SlsUpri_Sprt01_DtlR.$sls_upri, SlsUpri_Sprt01_DtlR.$interim_flg
			};
			copyByPegNo(up0(), destCols, sprt01.down0(), srcCols);
		}

		@Override
		protected void up_CALL_OPE(MCList<SlsUpri_Sprt01_DtlR> dest0_0,
				MCList<Sret_Sprt01_DtlR> src_Sprt01_Dtl) {

			setPegNo(up0());
			super.up_CALL_OPE(dest0_0, src_Sprt01_Dtl);
			dest0_0.setBoolean(SlsUpri_Sprt01_DtlR.$sls_upri_flg, true);
		}

		protected void setDown() {
			down0().setAll(up0());
		}
	}

	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 納品書を発行します。<br>
	 */
	public class Prnt01 extends MSBBL_SlsRetReg_MC_A.Prnt01 {
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
			dbSelectKey("MSBBL1340_MST_SLS_ACT_S03", rsltR, bldr, up0());
			
			// 最新の改訂番号のときのみ、訂正に対する取消を出力する
			return isSame(rsltR.sls_act_rev(), rsltR.getNumberNE("max_rev"));
		}
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
		dbSelect("MSBBL1340_MAM_ITM_S01", mamItmL, mamItmL_bldr, bindL);
		
		return mamItmL;
	}

	//FMCB CUSTOM END
}