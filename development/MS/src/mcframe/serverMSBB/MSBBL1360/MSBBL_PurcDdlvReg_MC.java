package mcframe.serverMSBB.MSBBL1360;

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
import mcframe.serverMSBB.MSBBL1360.*; // このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSUC.MSUCL0020.*; // このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBB.MSBBL6010.*;
import mcframe.serverMSBD.MSBDL5040.MSBDL_PurcUtil;
import mcframe.serverMSBD.MSBDL5180.*;
import mcframe.serverMSBE.MSBEL5010.*;
import mcframe.serverMSBE.MSBEL5550.*;
import mcframe.serverMSBG.MSBGL5080.*;
import mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil;
import mcframe.serverMSUC.MSUCL0080.MSUCL_SlsUtil;
import static mcframe.serverMSBB.MSBBL1360.Query.*;
import static mcframe.commonCore.container.MCRow.Status.*;
import mcframe.commonMAUA.MAUAC0010.MAUAC_List;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0170.FXUCL_BeforeAfterValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil;
import mcframe.serverMAUC.MAUCL1110.MAUCL_DptUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mcframe.serverMAUC.MAUCL5020.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.createDBTran;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.setCurrentDBTran;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.returnedCurrentDBTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBBL_PurcDdlvReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBBL_PurcDdlvReg_MC extends MSBBL_PurcDdlvReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 未売上の仕入直送売上の売上予定情報を検索します。<br>
	 */
	public class Srch01 extends MSBBL_PurcDdlvReg_MC_A.Srch01 {

		Map<Comparable<?>, MCList<Srch01_IoR>> _ioLMap;

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

			srchDtl();
			if (chkRsltDtl()) {
				return;
			}

			srchIo();
			if (chkRsltIo()) {
				return;
			}

		}

		/**
		 * 検索条件の編集
		 */
		protected void editCnd() {
			up0().setDateNE("today", getToday());
		}

		/**
		 * 	ヘッダ検索
		 * @return　検索結果件数
		 */
		protected int srchHdr() {
			return executeQuery(down0(), MSBBL1360_SLO_S01(), up0());
		}

		/**
		 * 	ヘッダの検索結果をチェック
		 */
		protected boolean chkRsltHdr() {
			// MCF7では仕入直送は伝票単位ではなく明細単位になるため、ヘッダ情報では判別不能（明細まで見ないとわからない）
			return false;
		}

		/**
		 * 	明細一覧検索
		 */
		protected void srchDtl() {
			executeQuery(down1(), MSBBL1360_PURC_SCHD_S01(), up0());

			// 紐付けＮＯをセット（ユニークであれば順番は不問）
			setPegNo(Srch01_DtlR.$dtl_row_id, down1());
		}

		/**
		 * 	明細の検索結果をチェック
		 */
		protected boolean chkRsltDtl() {
			if (down1().isEmpty()) {
				// 仕入直送対象の明細が存在しない場合は、ヘッダ情報をクリアして終了
				down0().clear();
				return true;
			}
			return false;
		}

		/**
		 * 	詳細一覧検索
		 */
		protected void srchIo() {

			// 明細から入荷予定情報を元に詳細一覧の情報を作成 (明細と1:1の予定情報)
			MCList<Srch01_IoR> arrSchdL = down2().createInstance();
			addAll(arrSchdL, down1(), createMap_Srch01_IoR_Srch01_DtlR());
			Map<Comparable<?>, MCList<Srch01_IoR>> arrSchdLMap = convList2Map(arrSchdL,
					Srch01_IoR.$dtl_row_id);

			// 仕入実績を検索	
			List<String> purcActDNoL = down1().groupBy(Srch01_DtlR.$purc_act_d_no)
					.getStringNE(Srch01_DtlR.$purc_act_d_no);
			MCRow bind = MCRow.create();
			bind.setStringNE(Srch01_DtlR.$purc_act_d_no,
					MCStringUtil.arrayValueJoin(purcActDNoL.toArray(new String[] {})));
			MCList<Srch01_IoR> purcActIoL = down2().createInstance();
			executeQuery(purcActIoL, MSBBL1360_PURC_ACT_IO_S01(), bind);
			Map<Comparable<?>, MCList<Srch01_IoR>> purcActIoLMap = convList2Map(
					purcActIoL, Srch01_IoR.$purc_act_d_no);

			// 仕入実績受払情報に入荷予定情報をマージ (共通項目をコピー)
			MCJoinKey<MCList<Srch01_IoR>> jk = purcActIoL.join(Srch01_IoR.$purc_act_d_no,
					arrSchdL, Srch01_IoR.$purc_act_d_no);
			join(purcActIoL, jk, createMap_Srch01_IoR_Srch01_IoR());

			for (Srch01_DtlR parDtl : down1()) {

				MCList<Srch01_IoR> chdArrSchdL = arrSchdLMap.get(parDtl.dtl_row_id());

				if (!isNull(parDtl.purc_act_d_no())) {
					// 仕入実績済の場合は、仕入実績受払を格納
					MCList<Srch01_IoR> chdPurcActIoL = purcActIoLMap.get(parDtl.purc_act_d_no());
					chdPurcActIoL.setNumber(Srch01_IoR.$dtl_row_id, parDtl.dtl_row_id());
					down2().addAll(chdPurcActIoL);
				}
				else {
					// 仕入未計上の場合は、入荷予定を格納
					down2().addAll(chdArrSchdL);
				}
			}
			
			down2().sort(Srch01_IoR.$purc_act_io_no);
		}

		/**
		 * 	詳細の検索結果をチェック
		 */
		protected boolean chkRsltIo() {
			return false;
		}

		@Override
		protected void editListMain() {
			super.editListMain();

			// ランダムアクセス用のマップを生成
			crtIoLMap();

			// ロット情報の設定
			setLotInfo();
			
			// 数量計算
			calcQty();

			// 最新税設定
			setNewTax();
			
			// 金額計算
			calcAmt();

			// 仕入金額計算
			calcPurcAmt();
			
			// 詳細行の内容を元に明細行の設定
			setIoL2DtlL();

			// 有効成分計算
			setCont(down1(), down2());

			if (!down1().isEmpty()) {
				calcProfRate(down0(), down1());
			}

			if (!down0().isEmpty()) {
				// 為替レートＣＤを設定
				down0().xrate_cd(getCo().sls_xrate_cd());
				down0().purc_xrate_cd(getCo().purc_xrate_cd());
				// 与信枠残高の取得
				callCredSvSrch01(down0());

				// 表示順の再設定
				down1().sort(Srch01_DtlR.$disp_seq, Srch01_DtlR.$purc_act_d_no);
				for (int i = 0; i < down1().size(); i++) {
					((Srch01_DtlR) down1().get(i)).disp_seq(i + 1);	
				}
			}
		}

		/**
		 * 	詳細行のリストから明細行ＩＤをキーとしたハッシュマップを生成する
		 */
		protected void crtIoLMap() {
			_ioLMap = convList2Map(down2(), Srch01_IoR.$dtl_row_id);
		}

		/**
		 * 	数量計算
		 */
		protected void calcQty() {
			
			for (Srch01_IoR ioR : down2()) {
				
				MCNumber convQty = rvrsBaseUnitConv(ioR.base_unit_qty(),
						ioR.trd_unit_conv_base_qty(), ioR.trd_unit_conv_qty(),
						ioR.trd_unit_dec_place(), ioR.trd_unit_rnd_typ());
				MCNumber baseUnitQty = convToBaseUnit(convQty,
						ioR.trd_unit_conv_base_qty(), ioR.trd_unit_conv_qty(),
						ioR.base_unit_dec_place(), ioR.base_unit_rnd_typ());
				if(isSame(ioR.base_unit_qty(), baseUnitQty)) {
					ioR.trd_unit_qty(convQty);
				}
				else {
					ioR.trd_unit_qty(ioR.base_unit_qty());
					ioR.trd_unit_cd(ioR.base_unit_cd());
					ioR.trd_unit_nm(ioR.base_unit_nm());
					ioR.trd_unit_conv_base_qty(1);
					ioR.trd_unit_conv_qty(1);
					ioR.trd_unit_rnd_typ(ioR.base_unit_rnd_typ());
					ioR.trd_unit_dec_place(ioR.base_unit_dec_place());
				}
			}

			for (Srch01_DtlR dtlR : down1()) {

				// 基準単位数量には、売上予定の(基準単位数量 - 基準単位売上数量 - 基準単位打切数量)の結果が格納済である
				// また、取引単位ＣＤには発注明細の取引単位ＣＤが格納済である（単位換算情報も含む）
				// 算出した基準単位数量が取引単位ＣＤに換算可能であれば換算し、不可の場合は基準単位数量を設定する
				// 登録した取引単位に合わせて、換算単位情報も合わせ対応する
				MCNumber convQty = rvrsBaseUnitConv(dtlR.base_unit_qty(),
						dtlR.trd_unit_conv_base_qty(), dtlR.trd_unit_conv_qty(),
						dtlR.trd_unit_dec_place(), dtlR.trd_unit_rnd_typ());
				MCNumber baseUnitQty = convToBaseUnit(convQty,
						dtlR.trd_unit_conv_base_qty(), dtlR.trd_unit_conv_qty(),
						dtlR.base_unit_dec_place(), dtlR.base_unit_rnd_typ());
				if(isSame(dtlR.base_unit_qty(), baseUnitQty)) {
					// 換算可能(ユーティリティの結果がnull以外）
					dtlR.trd_unit_qty(convQty);
				}
				else {
					// 換算不可
					dtlR.trd_unit_qty(dtlR.base_unit_qty());
					dtlR.trd_unit_cd(dtlR.base_unit_cd());
					dtlR.trd_unit_nm(dtlR.base_unit_nm());
					dtlR.trd_unit_conv_base_qty(1);
					dtlR.trd_unit_conv_qty(1);
					dtlR.trd_unit_rnd_typ(dtlR.base_unit_rnd_typ());
					dtlR.trd_unit_dec_place(dtlR.base_unit_dec_place());
				}

				// 明細から複製して作成した行（予定行)のみの場合、詳細へ展開する
				MCList<Srch01_IoR> ioL = _ioLMap.get(dtlR.dtl_row_id());
				for (Srch01_IoR ioR : ioL) {
					if (isNull(ioR.purc_act_d_no()) && ioL.size() == 1) {
						ioR.trd_unit_qty(dtlR.trd_unit_qty());
						ioR.trd_unit_cd(dtlR.trd_unit_cd());
						ioR.trd_unit_nm(dtlR.trd_unit_nm());
						ioR.trd_unit_dec_place(dtlR.trd_unit_dec_place());
						ioR.trd_unit_rnd_typ(dtlR.trd_unit_rnd_typ());
						ioR.trd_unit_conv_base_qty(dtlR.trd_unit_conv_base_qty());
						ioR.trd_unit_conv_qty(dtlR.trd_unit_conv_qty());
					}
				}
			}
		}

		/**
		 * ロット情報の設定
		 */
		protected void setLotInfo() {
			
			for (Srch01_DtlR dtlR : down1()) {
				
				for (Srch01_IoR ioR : _ioLMap.get(dtlR.dtl_row_id())) {
					// ロット管理しない場合はロット作成ＦＬＧにfalseを設定
					if (MAC_LOT_MNG_TYP.isNOT_MNG(dtlR.lot_mng_typ())) {
						ioR.crt_lot_flg(false);
					}
					else {
						// ロット管理する、かつ、ロットＮＯが発番されていない場合、
						// ロット作成ＦＬＧにtrueを設定
						if (isNullOrNullVal(ioR.lot_no())) {
							ioR.crt_lot_flg(true);
						}
						// ロットＮＯが発番されている場合、
						// ロット作成ＦＬＧにfalseを設定
						else {
							ioR.crt_lot_flg(false);
						}
					}
				}
				dtlR.crt_lot_flg(_ioLMap.get(dtlR.dtl_row_id()).get(0).crt_lot_flg());
			}
		}
		
		/**
		 * 	仕入金額計算
		 */
		protected void calcPurcAmt() {

			MSUCL_ConvQtyAmtUtil.ConvQtyAmtUtil_Calc02 ope = MSUCL_ConvQtyAmtUtil.crtConvQtyAmtUtil_Calc02();

			ConvQtyAmtUtil_Calc01_HdrR up0R = null;
			ConvQtyAmtUtil_Calc01_Dtl1R up1R = null;
					
			for (Srch01_DtlR dtlR : down1()) {
				
				if (dtlR.sync_flg() && !dtlR.sppl_iv_flg() &&
						(!isSame(dtlR.trd_unit_qty(), dtlR.purc_trd_unit_qty()) 
						|| !isSame(dtlR.trd_unit_cd(), dtlR.purc_trd_unit_cd())
						|| !isSame(dtlR.purc_tax_cd(), dtlR.purc_schd_tax_cd()))) {
				
					up0R = ConvQtyAmtUtil_Calc01_HdrR.create();
					up0R.peg_no(dtlR.peg_no());
					
					up0R.trd_unit_cd(dtlR.purc_trd_unit_cd());
					up0R.trd_unit_qty(dtlR.purc_trd_unit_qty());
					up0R.trd_cur_upri(dtlR.purc_trd_cur_upri());
					up0R.trd_cur_dscnt_amt(dtlR.purc_trd_cur_dscnt_amt());
					up0R.trd_cur_amt(dtlR.purc_trd_cur_amt());
					up0R.trd_cur_tax_amt(dtlR.purc_trd_cur_tax_amt());
					up0R.trd_cur_inc_tax_amt(dtlR.purc_trd_cur_inc_tax_amt());
					up0R.base_unit_dec_place(dtlR.base_unit_dec_place());
					up0R.base_unit_rnd_typ(dtlR.base_unit_rnd_typ());
					up0R.trd_unit_conv_base_qty(dtlR.purc_s_trd_unit_conv_base_qty());
					up0R.trd_unit_conv_qty(dtlR.purc_s_trd_unit_conv_qty());
					up0R.trd_cur_cd(dtlR.purc_trd_cur_cd());
					up0R.tax_rate(dtlR.purc_schd_tax_rate());
					up0R.inc_tax_flg(dtlR.purc_schd_inc_tax_flg());
					up0R.act_tax_rate(dtlR.purc_tax_rate());
					up0R.act_inc_tax_flg(dtlR.purc_inc_tax_flg());
					up0R.amt_dec_place(dtlR.purc_trd_cur_amt_dec_place());
					up0R.upri_dec_place(dtlR.purc_trd_cur_upri_dec_place());
					up0R.amt_rnd_typ(dtlR.purc_amt_rnd_typ());
					up0R.tax_rnd_typ(dtlR.purc_tax_rnd_typ());
					up0R.schd_base_unit_qty(dtlR.purc_schd_init_qty());
					
					ope.up0().add(up0R);
					
					up1R = ConvQtyAmtUtil_Calc01_Dtl1R.create();
					
					up1R.peg_no(dtlR.peg_no());
					up1R.hdr_peg_no(dtlR.peg_no());
					up1R.trd_unit_qty(dtlR.trd_unit_qty());
					up1R.trd_unit_cd(dtlR.trd_unit_cd());
					up1R.trd_unit_conv_base_qty(dtlR.trd_unit_conv_base_qty());
					up1R.trd_unit_conv_qty(dtlR.trd_unit_conv_qty());
					
					ope.up1().add(up1R);
				}
			}
			
			if (!ope.up0().isEmpty()) {
			
				ope.exec();
				
				String[] destCols = new String[] {
						Srch01_DtlR.$purc_trd_cur_upri, 
						Srch01_DtlR.$purc_trd_cur_dscnt_amt,
						Srch01_DtlR.$purc_trd_cur_amt,
						Srch01_DtlR.$purc_trd_cur_tax_amt,
						Srch01_DtlR.$purc_trd_cur_inc_tax_amt
				};
				String[] srcCols = new String[] {
						ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_upri,
						ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_dscnt_amt,
						ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_amt,
						ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_tax_amt,
						ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_inc_tax_amt
				};
				
				copyByPegNo(down1(), destCols, ope.down0(), srcCols);
			}
		}

		/**
		 * 内税・税指定が共にオフの場合、最新の税情報を設定する
		 */
		protected void setNewTax() {
			for (Srch01_DtlR dtlR : down1()) {
				if (!dtlR.inc_tax_flg() && !dtlR.tax_fix_flg() && !isSame(dtlR.tax_cd(), dtlR.new_tax_cd())) {
					// 最新の税情報設定（売上）
					dtlR.tax_cd(dtlR.new_tax_cd());
					dtlR.tax_nm(dtlR.new_tax_nm());
					dtlR.tax_rate(dtlR.new_tax_rate());
					dtlR.tax_typ(dtlR.new_tax_typ());
					dtlR.inc_tax_flg(dtlR.new_inc_tax_flg());
				}
				// 仕入同時計上の場合
				if (dtlR.sync_flg()) {
					if (!dtlR.purc_inc_tax_flg() && !dtlR.purc_tax_fix_flg() && !isSame(dtlR.purc_tax_cd(), dtlR.new_purc_tax_cd())) {
						// 最新の税情報設定（仕入）
						dtlR.purc_tax_cd(dtlR.new_purc_tax_cd());
						dtlR.purc_tax_nm(dtlR.new_purc_tax_nm());
						dtlR.purc_tax_rate(dtlR.new_purc_tax_rate());
						dtlR.purc_tax_typ(dtlR.new_purc_tax_typ());
						dtlR.purc_inc_tax_flg(dtlR.new_purc_inc_tax_flg());
					}
				}
			}
		}
		
		/**
		 * 	金額計算
		 */
		protected void calcAmt() {

			// 共通ユーティリティを用いて予定金額をベースに算出
			MSUCL_ConvQtyAmtUtil.ConvQtyAmtUtil_Calc02 ope = MSUCL_ConvQtyAmtUtil.crtConvQtyAmtUtil_Calc02();

			int peg_no = 0;
			for (Srch01_DtlR sloD : down1()) {
				ConvQtyAmtUtil_Calc01_HdrR oUp0 = sloD.hdr();
				oUp0.trd_cur_cd(down0().trd_cur_cd());
				oUp0.amt_dec_place(down0().trd_cur_amt_dec_place());
				oUp0.upri_dec_place(down0().trd_cur_upri_dec_place());
				oUp0.amt_rnd_typ(down0().sls_amt_rnd_typ());
				oUp0.tax_rnd_typ(down0().sls_tax_rnd_typ());
				oUp0.act_tax_rate(sloD.tax_rate());
				oUp0.act_inc_tax_flg(sloD.inc_tax_flg());
				oUp0.peg_no(peg_no);
				oUp0.schd_base_unit_qty(sloD.init_schd_qty());
				ope.up0().add(oUp0);

				ConvQtyAmtUtil_Calc01_Dtl1R oUp1 = sloD.dtl1();
				oUp1.hdr_peg_no(peg_no);
				oUp1.peg_no(peg_no);
				ope.up1().add(oUp1);
				peg_no++;
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

				// 源泉税額
				if (!isNull(r.wtax_rate())) {
					r.wtax_amt(MAUCL_AmtUtil.getTaxAmt(r.trd_cur_amt(), r.wtax_rate(),
							down0().trd_cur_amt_dec_place(), down0().wtax_rnd_typ(),
							MCNumber.ZERO));
				}
				// 原価金額の算出
				r.cost_amt(MSUCL_SlsUtil.getCostAmt(r.cost_upri(), r.base_unit_qty(), getBaseCur().amt_dec_place()));
			}
		}

		/**
		 * 	詳細行の内容を元に明細行の値を設定
		 */
		protected void setIoL2DtlL() {

			for (Srch01_DtlR parDtl : down1()) {

				MCList<Srch01_IoR> chdIoL = _ioLMap.get(parDtl.dtl_row_id());

				// 出荷元期限:一意の場合、明細に登録
				MCList<Srch01_IoR> shipFrValidDtL = chdIoL.groupBy(Srch01_IoR.$ship_fr_valid_dt);
				if (shipFrValidDtL.size() == 1) {
					parDtl.ship_fr_valid_dt(shipFrValidDtL.get(0).ship_fr_valid_dt());
				}
			}
		}

		@Override
		protected void doEditDown(MCContainer container) {
			super.doEditDown(container);
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
				addColumnPathMap(Srch01_IoR.$crt_lot_flg, Srch01_DtlR.$crt_lot_flg);
				addColumnPathMap(Srch01_IoR.$lot_no, Srch01_DtlR.$lot_no);
				addColumnPathMap(Srch01_IoR.$sublot_no, Srch01_DtlR.$sublot_no);
				addColumnPathMap(Srch01_IoR.$bp_lot_no, Srch01_DtlR.$bp_lot_no);
				addColumnPathMap(Srch01_IoR.$ver_no, Srch01_DtlR.$ver_no);
				addColumnPathMap(Srch01_IoR.$cont_fctr_unit_cd,
						Srch01_DtlR.$cont_fctr_unit_cd);
				addColumnPathMap(Srch01_IoR.$cont_fctr_unit_nm,
						Srch01_DtlR.$cont_fctr_unit_nm);
				addColumnPathMap(Srch01_IoR.$std_cont_fctr, Srch01_DtlR.$std_cont_fctr);
				addColumnPathMap(Srch01_IoR.$sno1, Srch01_DtlR.$sno1);
				addColumnPathMap(Srch01_IoR.$sno2, Srch01_DtlR.$sno2);
				addColumnPathMap(Srch01_IoR.$sno3, Srch01_DtlR.$sno3);
				addColumnPathMap(Srch01_IoR.$sno4, Srch01_DtlR.$sno4);
				addColumnPathMap(Srch01_IoR.$trd_unit_dec_place,
						Srch01_DtlR.$trd_unit_dec_place);
				addColumnPathMap(Srch01_IoR.$trd_unit_conv_base_qty,
						Srch01_DtlR.$trd_unit_conv_base_qty);
				addColumnPathMap(Srch01_IoR.$trd_unit_conv_qty,
						Srch01_DtlR.$trd_unit_conv_qty);
				addColumnPathMap(Srch01_IoR.$trd_unit_rnd_typ,
						Srch01_DtlR.$trd_unit_rnd_typ);
				addColumnPathMap(Srch01_IoR.$itm_cd, Srch01_DtlR.$itm_cd);
				addColumnPathMap(Srch01_IoR.$itm_sub1, Srch01_DtlR.$itm_sub1);
				addColumnPathMap(Srch01_IoR.$itm_sub2, Srch01_DtlR.$itm_sub2);
				addColumnPathMap(Srch01_IoR.$itm_sub3, Srch01_DtlR.$itm_sub3);
				addColumnPathMap(Srch01_IoR.$lot_mng_typ, Srch01_DtlR.$lot_mng_typ);
				addColumnPathMap(Srch01_IoR.$sublot_mng_typ, Srch01_DtlR.$sublot_mng_typ);
				addColumnPathMap(Srch01_IoR.$lot_no_typ, Srch01_DtlR.$lot_no_typ);
				addColumnPathMap(Srch01_IoR.$sublot_no_typ, Srch01_DtlR.$sublot_no_typ);
				addColumnPathMap(Srch01_IoR.$sno1_mng_typ, Srch01_DtlR.$sno1_mng_typ);
				addColumnPathMap(Srch01_IoR.$sno2_mng_typ, Srch01_DtlR.$sno2_mng_typ);
				addColumnPathMap(Srch01_IoR.$sno3_mng_typ, Srch01_DtlR.$sno3_mng_typ);
				addColumnPathMap(Srch01_IoR.$sno4_mng_typ, Srch01_DtlR.$sno4_mng_typ);
				addColumnPathMap(Srch01_IoR.$stk_mng_typ, Srch01_DtlR.$stk_mng_typ);
				addColumnPathMap(Srch01_IoR.$base_unit_dec_place,
						Srch01_DtlR.$base_unit_dec_place);
				addColumnPathMap(Srch01_IoR.$base_unit_rnd_typ,
						Srch01_DtlR.$base_unit_rnd_typ);
				addColumnPathMap(Srch01_IoR.$cont_fctr_flg, Srch01_DtlR.$cont_fctr_flg);
				addColumnPathMap(Srch01_IoR.$cont_fctr_rnd_typ,
						Srch01_DtlR.$cont_fctr_rnd_typ);
				addColumnPathMap(Srch01_IoR.$cont_fctr_dec_place,
						Srch01_DtlR.$cont_fctr_dec_place);
				addColumnPathMap(Srch01_IoR.$ver_flg, Srch01_DtlR.$ver_flg);
				addColumnPathMap(Srch01_IoR.$dtl_row_id, Srch01_DtlR.$dtl_row_id);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.purc_qty(0);
				dest.sls_qty(0);
			}
		}

		/**
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
				addColumnPathMap(Srch01_IoR.$cont_fctr_unit_cd, Srch01_IoR.$cont_fctr_unit_cd);
				addColumnPathMap(Srch01_IoR.$cont_fctr_unit_nm, Srch01_IoR.$cont_fctr_unit_nm);
				addColumnPathMap(Srch01_IoR.$std_cont_fctr, Srch01_IoR.$std_cont_fctr);
				addColumnPathMap(Srch01_IoR.$trd_unit_dec_place, Srch01_IoR.$trd_unit_dec_place);
				addColumnPathMap(Srch01_IoR.$trd_unit_conv_base_qty, Srch01_IoR.$trd_unit_conv_base_qty);
				addColumnPathMap(Srch01_IoR.$trd_unit_conv_qty, Srch01_IoR.$trd_unit_conv_qty);
				addColumnPathMap(Srch01_IoR.$trd_unit_rnd_typ, Srch01_IoR.$trd_unit_rnd_typ);
				addColumnPathMap(Srch01_IoR.$itm_cd, Srch01_IoR.$itm_cd);
				addColumnPathMap(Srch01_IoR.$itm_sub1, Srch01_IoR.$itm_sub1);
				addColumnPathMap(Srch01_IoR.$itm_sub2, Srch01_IoR.$itm_sub2);
				addColumnPathMap(Srch01_IoR.$itm_sub3, Srch01_IoR.$itm_sub3);
				addColumnPathMap(Srch01_IoR.$lot_mng_typ, Srch01_IoR.$lot_mng_typ);
				addColumnPathMap(Srch01_IoR.$sublot_mng_typ, Srch01_IoR.$sublot_mng_typ);
				addColumnPathMap(Srch01_IoR.$sno1_mng_typ, Srch01_IoR.$sno1_mng_typ);
				addColumnPathMap(Srch01_IoR.$sno2_mng_typ, Srch01_IoR.$sno2_mng_typ);
				addColumnPathMap(Srch01_IoR.$sno3_mng_typ, Srch01_IoR.$sno3_mng_typ);
				addColumnPathMap(Srch01_IoR.$sno4_mng_typ, Srch01_IoR.$sno4_mng_typ);
				addColumnPathMap(Srch01_IoR.$stk_mng_typ, Srch01_IoR.$stk_mng_typ);
				addColumnPathMap(Srch01_IoR.$base_unit_dec_place, Srch01_IoR.$base_unit_dec_place);
				addColumnPathMap(Srch01_IoR.$base_unit_rnd_typ, Srch01_IoR.$base_unit_rnd_typ);
				addColumnPathMap(Srch01_IoR.$cont_fctr_flg, Srch01_IoR.$cont_fctr_flg);
				addColumnPathMap(Srch01_IoR.$cont_fctr_rnd_typ, Srch01_IoR.$cont_fctr_rnd_typ);
				addColumnPathMap(Srch01_IoR.$cont_fctr_dec_place, Srch01_IoR.$cont_fctr_dec_place);
				addColumnPathMap(Srch01_IoR.$ver_flg, Srch01_IoR.$ver_flg);
				addColumnPathMap(Srch01_IoR.$bp_dlv_slip_no, Srch01_IoR.$bp_dlv_slip_no);
				addColumnPathMap(Srch01_IoR.$bp_dlv_slip_d_no, Srch01_IoR.$bp_dlv_slip_d_no);
				addColumnPathMap(Srch01_IoR.$bp_lot_no, Srch01_IoR.$bp_lot_no);
				addColumnPathMap(Srch01_IoR.$dtl_row_id, Srch01_IoR.$dtl_row_id);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
			}
		}
	}

	/**
	 * Srch02オペレーション.<p>
	 *
	 * 仕入直送売上の売上実績情報を検索します。<br>
	 */
	public class Srch02 extends MSBBL_PurcDdlvReg_MC_A.Srch02 {
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

			srchDtl();
			if (chkRsltDtl()) {
				return;
			}

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
		 * 	ヘッダ検索
		 * @return 検索結果件数
		 */
		protected int srchHdr() {
			return executeQuery(down0(), MSBBL1360_SLS_ACT_S01(), up0());
		}

		protected boolean chkRsltHdr() {
			// MCF7では仕入直送は伝票単位ではなく明細単位になるため、ヘッダ情報では判別不能（明細まで見ないとわからない）
			return false;
		}

		/**
		 * 	明細検索
		 */
		protected void srchDtl() {
			executeQuery(down1(), MSBBL1360_SLS_ACT_D_S01(), down0());
		}

		protected boolean chkRsltDtl() {

			// 仕入直送対象の明細（仕入直送発注明細ＮＯで判定）が1件も存在しない場合は終了
			MCList<Srch01_DtlR> purcDdlvL = createSrch02_DtlL();
			for (Srch01_DtlR r : down1()) {
				if (!isNull(r.po_d_no())) {
					purcDdlvL.add(r);
				}
			}

			if (purcDdlvL.isEmpty()) {
				down0().clear();
				down1().clear();
				return true;
			}

			return false;
		}

		/**
		 * 	詳細検索
		 */
		protected void srchIo() {
			down2().addBooleanColumn("sync_flg");
			executeQuery(down2(), MSBBL1360_SLS_ACT_IO_S01(), down0());
		}

		protected boolean chkRsltIo() {
			return false;
		}

		@Override
		protected void editListMain() {
			super.editListMain();

			// 紐付けIDの設定
			setDtlRowId();

			// 詳細行の内容を元に明細行の設定
			setIoL2DtlL();

			setCont(down1(), down2());

			if (!down1().isEmpty()) {
				calcProfRate(down0(), down1());
			}

			if (!down0().isEmpty()) {
				// 為替レートＣＤを設定
				down0().xrate_cd(getCo().sls_xrate_cd());
				down0().purc_xrate_cd(getCo().purc_xrate_cd());
				// 与信枠残高の取得
				callCredSvSrch01(down0());
				// 最新ＦＬＧの設定
				down0().latest_flg(getLatestFlg());
			}
			
		}

		/**
		 * 改訂番号が最新の場合は最新フラグをtrueにする。
		 */
		protected boolean getLatestFlg() {
			if (MAC_SLIP_STS_TYP.isCRT(down0().slip_sts_typ())) {
				return true;
			}
			return false;
		}

		protected void setDtlRowId() {
			MCIndexKey idxKey = down2().createIndex(Srch01_IoR.$sls_act_d_no);
			int i = 0;
			for (Srch01_DtlR r : down1()) {
				MCList<Srch01_IoR> ioL = down2().subList(idxKey, r.sls_act_d_no());
				r.dtl_row_id(i++);
				ioL.setNumberNE(Srch01_IoR.$dtl_row_id, r.dtl_row_id());
			}
		}

		protected void setIoL2DtlL() {

			Map<Comparable<?>, MCList<Srch01_IoR>> ioLMap = convList2Map(down2(),
					Srch01_IoR.$dtl_row_id);
			for (Srch01_DtlR parDtl : down1()) {

				MCList<Srch01_IoR> chdIoL = ioLMap.get(parDtl.dtl_row_id());
				
				if (isNull(chdIoL)) {
					continue;
				}

				// 出荷元期限:		一意の場合、明細に登録
				MCList<Srch01_IoR> shipFrValidDtL = chdIoL
						.groupBy(Srch01_IoR.$ship_fr_valid_dt);
				if (shipFrValidDtL.size() == 1) {
					parDtl.ship_fr_valid_dt(shipFrValidDtL.get(0).ship_fr_valid_dt());
				}

				// 版ＮＯ:			一意の場合、明細に登録
				MCList<Srch01_IoR> verNoL = chdIoL.groupBy(Srch01_IoR.$ver_no);
				if (verNoL.size() == 1) {
					parDtl.ver_no(verNoL.get(0).ver_no());
				}
				
				// 仕入同時計上
				for (Srch01_IoR chdIoR : chdIoL) {
					if (chdIoR.getBooleanNE("sync_flg")) {
						parDtl.sync_flg(true);
						parDtl.org_sync_flg(true);
						break;
					}
				}
			}
		}
	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 売上実績情報を新規登録・訂正前チェックをします。<br>
	 */
	public class Chk01 extends MSBBL_PurcDdlvReg_MC_A.Chk01 {

		Map<Comparable<?>, MCList<Chk01_IoR>> _ioLMap;

		/** 受注 */
		MST_SLO_R _slo;

		MCList<MST_SLO_D_R> _sloDL;

		MCJoinKey<MCList<MST_SLO_D_R>> _sloDJk;

		/**	発注  */
		MCList<MST_PO_R> _poL;

		MCJoinKey<MCList<MST_PO_R>> _poJk;

		MCList<MST_PO_D_R> _poDL;

		MCJoinKey<MCList<MST_PO_D_R>> _poDJk;

		/** 仕入実績 */
		MCList<MST_PURC_ACT_R> _purcActL;

		MCJoinKey<MCList<MST_PURC_ACT_R>> _paJk;

		MCList<MST_PURC_ACT_D_R> _purcActDL;

		MCJoinKey<MCList<MST_PURC_ACT_D_R>> _paDJk;

		/** 入荷予定 */
		MCList<MST_ARR_SCHD_R> _arrSchdL;

		MCJoinKey<MCList<MST_ARR_SCHD_R>> _asJk;
		
		MCJoinKey<MCList<MST_SLS_SCHD_R>> _slsSchdJk;
		
		MCJoinKey<MCList<MST_SLS_ACT_D_R>> _slsActJk;
		MCList<MST_SLS_SCHD_R> _purcSchdGrpSlsSchdL = MCList.create(MST_SLS_SCHD_R.class);
		MCIndexKey _purcSchdGrpSlsIdxKey = null;
		
		MCList<MST_PURC_SCHD_R> _purcSchdL = MCList.create(MST_PURC_SCHD_R.class);
		MCIndexKey _purcSchdIdxKey = null;
		
		MCList<MST_SLS_SCHD_R> _purcActGrpSlsSchdL = MCList.create(MST_SLS_SCHD_R.class);
		MCIndexKey _purcActIdxKey = null;
		
		/**
		 * 更新カウンタチェックエラー
		 */
		protected boolean _updCntrErr = false;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			editUp();
			crtIoLMap();
			super.doIt();
			if (!hasErr()) {
				// 仕入実績サービスの呼び出し
				callPurcActRegSvChk03();
				
				// 与信更新金額の算出
				calcCredUpdAmt();
			}
			setDown();
		}
		
		/**
		 * 各部門組織変更対応
		 */
		protected void editUp() {
			// 売上部門
			MAUCL_DptUtil.setDpt(up0(), Chk01_HdrR.$sls_dpt_cd, null, Chk01_HdrR.$ac_dt, true);
			if (up0().getBooleanNE("err_flg")) {
				throwDptErr();
			}
			
			// 債権部門
			MAUCL_DptUtil.setDpt(up0(), Chk01_HdrR.$ar_dpt_cd, null, Chk01_HdrR.$ac_dt, true);
			if (up0().getBooleanNE("err_flg")) {
				throwDptErr();
			}
			
			up1().addDateColumn(Chk01_HdrR.$ac_dt);
			up1().setDateNE(Chk01_HdrR.$ac_dt, up0().ac_dt());
			// 負担部門（売上）
			MAUCL_DptUtil.setDpt(up1(), Chk01_DtlR.$bd_dpt_cd, null, Chk01_HdrR.$ac_dt, true);
			if (up1().subList("err_flg", true).size() > 0) {
				throwDptErr();
			}
			
			// 負担部門（仕入）
			MAUCL_DptUtil.setDpt(up1(), Chk01_DtlR.$purc_bd_dpt_cd, null, Chk01_HdrR.$ac_dt, true);
			if (up1().subList("err_flg", true).size() > 0) {
				throwDptErr();
			}
		}
		
		protected void throwDptErr() {
			MCAppException ex = new MCAppException(MCMessagePool.getMessageList().get(0));
			MCMessagePool.removeAll(MCMessagePool.getMessageList());
			throw ex;
		}

		/**
		 * 	明細行ＩＤをキーとして詳細リストをマップに変換してフィールドに格納
		 */
		protected void crtIoLMap() {
			_ioLMap = convList2Map(up2(), Chk01_IoR.$dtl_row_id);
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

			ListLogicBind purcBdDptBind = getListLogicBind(up1(), Chk01_DtlR.$purc_bd_dpt_cd);
			purcBdDptBind.putBind(MAUAC_List.DptCols.$i_dt, up0().ac_dt());

		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 更新カウンタチェック、排他ロック獲得
			msgL.addAll(lockAndCheckBase());

			if (hasErr() || _updCntrErr) {
				return msgL;
			}

			// 補完(定型チェック実施前)
			compHdrBase();
			compDtlBase();
			compIoBase();

			return msgL;

		}

		protected void compHdrBase() {

		}

		protected void compDtlBase() {

		}

		protected void compIoBase() {

			// 共通項目値を子の詳細へ展開する
			for (Chk01_DtlR parDtl : up1()) {
				for (Chk01_IoR chdIo : _ioLMap.get(parDtl.dtl_row_id())) {
					chdIo.itm_cd(parDtl.itm_cd());
					chdIo.itm_sub1(parDtl.itm_sub1());
					chdIo.itm_sub2(parDtl.itm_sub2());
					chdIo.itm_sub3(parDtl.itm_sub3());
					chdIo.stk_mng_typ(parDtl.stk_mng_typ());
					chdIo.lot_mng_typ(parDtl.lot_mng_typ());
					chdIo.lot_no_typ(parDtl.lot_no_typ());
					chdIo.lot_no_ptn_cd(parDtl.lot_no_typ());
					chdIo.sublot_mng_typ(parDtl.sublot_mng_typ());
					chdIo.sublot_no_typ(parDtl.sublot_no_typ());
					chdIo.sublot_no_ptn_cd(parDtl.sublot_no_ptn_cd());
					chdIo.cont_fctr_flg(parDtl.cont_fctr_flg());
				}
			}
		}

		/**
		 * 更新カウンタチェック、排他ロック獲得
		 * @return
		 */
		protected MCMessageList lockAndCheckBase() {

			MCMessageList msgL = new MCMessageList();

			// 売上実績
			msgL.addAll(lockAndCheckSlsAct());

			// 売上予定 ・ 仕入予定
			msgL.addAll(checkSlsPurcSchd());

			// 受注
			msgL.addAll(lockAndCheckSlo());

			// 入荷進捗
			msgL.addAll(lockAndCheckArrPr());

			// 出荷進捗
			msgL.addAll(lockAndCheckShipPr());

			// 入荷予定
			msgL.addAll(checkArrSchd());

			// 発注
			msgL.addAll(checkPo());

			// 仕入実績
			msgL.addAll(checkPurcAct());

			return msgL;
		}

		protected MCMessageList lockAndCheckSlsAct() {

			MCMessageList msgL = new MCMessageList();

			if (!isNull(up0().sls_act_no())) {
				MST_SLS_ACT_R slsAct = MST_SLS_ACT_R.create();
				dbSelectKeyForUpdateNoWait("MSBBL1360_MST_SLS_ACT_S01", slsAct,
						MCQueryApiBuilder.create(MST_SLS_ACT_R.create("T")), up0());
				// 更新カウンタチェック
				msgL.addAll(checkUpdCntrNE(up0(), Chk01_HdrR.$upd_cntr, slsAct));
				
				if (!msgL.isEmpty()) {
					
					_updCntrErr = true;
					return msgL;
				}
				
				if (!isSame(slsAct.sls_dpt_cd(), up0().sls_dpt_cd())) {
					// 更新前データDACチェック
					msgL.addAll(checkWritableDptCdDac(slsAct, MST_SLS_ACT_R.$sls_dpt_cd));
				}

				if (!msgL.isEmpty()) {
					
					return msgL;
				}
				MCList<MST_SLS_ACT_D_R> slsActDL = MCList.create(MST_SLS_ACT_D_R.class);
				MCQueryApiBuilder slsActDL_bldr = MCQueryApiBuilder.create(MST_SLS_ACT_D_R.create("T"));
				dbSelectKey("MSBBL1360_MST_SLS_ACT_D_S01", slsActDL, slsActDL_bldr, up1());
				_slsActJk = up1().join(Chk01_DtlR.$sls_act_d_no, slsActDL, MST_SLS_ACT_D_R.$sls_act_d_no);
				
				MCList<MST_SLS_ACT_IO_R> slsActIoL = MCList.create(MST_SLS_ACT_IO_R.class);
				MCQueryApiBuilder slsActIoL_bldr = MCQueryApiBuilder.create(MST_SLS_ACT_IO_R.create("T"));
				dbSelectKey("MSBBL1360_MST_SLS_ACT_IO_S01", slsActIoL, slsActIoL_bldr, up2());
				MCJoinKey<MCList<MST_SLS_ACT_IO_R>> ioJk = up2().join(
						Chk01_IoR.$sls_act_io_no, slsActIoL,
						MST_SLS_ACT_IO_R.$sls_act_io_no);

				for (Chk01_DtlR parDtl : up1()) {
					if (!isNull(parDtl.sls_act_d_no())) {
						MST_SLS_ACT_D_R slsActD = parDtl.getJoinedRow(_slsActJk);
						if (isNull(slsActD)) {
							msgL.addAll(getRecordNotFoundMsg(getModuleID(),
									slsActDL_bldr.getBaseDbc().tableName(), slsActDL_bldr.getBaseDbc().getKeyColumn(),
									parDtl.toArray(slsActDL_bldr.getBaseDbc().getKeyColumn()), parDtl));
							continue;
						}
						else {
							if (!isSame(up0().sls_act_no(), slsActD.sls_act_no())) {
								msgL.addAll(getRecordInvalidMsg(Chk01_HdrR.$sls_act_no,
										slsActD.sls_act_no(), parDtl));
								continue;
							}
							if (!isSame(parDtl.purc_act_d_no(),
									slsActD.purc_act_d_no())) {
								msgL.addAll(getRecordInvalidMsg(Chk01_DtlR.$purc_act_d_no,
										slsActD.purc_act_d_no(), parDtl));
								continue;
							}
						}

						for (Chk01_IoR chdIo : _ioLMap.get(parDtl.dtl_row_id())) {
							if (!isNull(chdIo.sls_act_io_no())) {
								MST_SLS_ACT_IO_R slsActIo = chdIo.getJoinedRow(ioJk);
								if (isNull(slsActIo)) {
									msgL.addAll(getRecordNotFoundMsg(getModuleID(),
											slsActIoL_bldr.getBaseDbc().tableName(),
											slsActIoL_bldr.getBaseDbc().getKeyColumn(),
											chdIo.toArray(slsActIoL_bldr.getBaseDbc().getKeyColumn()),
											chdIo));
								}
								else {
									if (!isSame(parDtl.sls_act_d_no(),
											slsActIo.sls_act_d_no())) {
										msgL.addAll(getRecordInvalidMsg(
												Chk01_DtlR.$sls_act_d_no,
												slsActIo.sls_act_d_no(), chdIo));
									}

									if (!isSame(slsActIo.purc_act_io_no(),
											chdIo.purc_act_io_no())) {
										msgL.addAll(getRecordInvalidMsg(
												Chk01_IoR.$purc_act_io_no,
												slsActIo.purc_act_io_no(), chdIo));
									}
									chdIo.ship_act_d_no(slsActIo.ship_act_d_no());
								}
							}
						}
					}
				}
			}

			return msgL;
		}

		protected MCMessageList lockAndCheckSlo() {
			
			if (_updCntrErr) {
				return null;
			}

			MCMessageList msgL = new MCMessageList();

			if (!isNull(up0().slo_no())) {
				MAM_BP_R m1 = MAM_BP_R.create("M1");
				MAM_CUR_R m2 = MAM_CUR_R.create("M2");

				_slo = MST_SLO_R.create();
				MST_SLO_R t1 = MST_SLO_R.create("T");
				MCQueryApiBuilder slo_bldr = MCQueryApiBuilder.create(t1);
				slo_bldr.setSelect(t1.slo_no);
				slo_bldr.addSelect(t1.aprv_flg);
				slo_bldr.addSelect(t1.aprv_no);
				slo_bldr.addSelect(t1.upd_cntr);
				slo_bldr.addSelect(t1.sls_basis_typ);
				slo_bldr.addSelect(m1.sls_amt_rnd_typ);
				slo_bldr.addSelect(m1.sls_tax_rnd_typ);
				slo_bldr.addSelect(m2.amt_dec_place);
				slo_bldr.addSelect(m2.upri_dec_place);
				slo_bldr.addLeftOuterJoin(m1, bracket(t1.cst_cd.eq(m1.bp_cd)));
				slo_bldr.addLeftOuterJoin(m2, bracket(t1.trd_cur_cd.eq(m2.cur_cd)));
				slo_bldr.setLockTable(t1.slo_no);
				dbSelectKeyForUpdate("MSBBL1360_MST_SLO_S01", _slo, slo_bldr, up0());

				// 更新カウンタチェック
				msgL.addAll(checkUpdCntrNE(up0(), Chk01_HdrR.$slo_upd_cntr, _slo));

				if (!msgL.isEmpty()) {
					
					_updCntrErr = true;
					return msgL;
				}

				up0().aprv_flg(_slo.aprv_flg());
				up0().aprv_no(_slo.aprv_no());
				up0().aprv_sts_typ(_slo.aprv_sts_typ());
				up0().qtn_no(_slo.qtn_no());
				up0().qtn_rev(_slo.qtn_rev());
				up0().sls_basis_typ(_slo.sls_basis_typ());

				//　受注明細のチェックと補完
				MAVM_ITM_UNIT_R m4 = MAVM_ITM_UNIT_R.create("M1");
				MAM_TAX_R m5 = MAM_TAX_R.create("M2");
				MAM_ITM_R m3 = MAM_ITM_R.create("M3");

				_sloDL = MCList.create(MST_SLO_D_R.class);
				MST_SLO_D_R t2 = MST_SLO_D_R.create("T");
				MCQueryApiBuilder sloDL_bldr = MCQueryApiBuilder.create(t2);
				sloDL_bldr.setSelect(t2.slo_d_no);
				sloDL_bldr.addSelect(t2.slo_no);
				sloDL_bldr.addSelect(t2.trd_unit_cd);
				sloDL_bldr.addSelect(t2.trd_unit_qty);
				sloDL_bldr.addSelect(t2.trd_cur_upri);
				sloDL_bldr.addSelect(t2.trd_cur_amt);
				sloDL_bldr.addSelect(t2.trd_cur_tax_amt);
				sloDL_bldr.addSelect(t2.trd_cur_dscnt_amt);
				sloDL_bldr.addSelect(t2.base_unit_qty);
				sloDL_bldr.addSelect(t2.qtn_d_no);
				sloDL_bldr.addSelect(m4.conv_qty);
				sloDL_bldr.addSelect(m4.conv_base_qty);
				sloDL_bldr.addSelect(m4.dec_place);
				sloDL_bldr.addSelect(m4.rnd_typ);
				sloDL_bldr.addSelect(m3.dec_place.as("base_unit_dec_place"));
				sloDL_bldr.addSelect(m3.rnd_typ.as("base_unit_rnd_typ"));
				sloDL_bldr.addSelect(m5.tax_rate);
				_sloDL.addBooleanColumn("inc_tax_flg");
				sloDL_bldr.addSelect(m5.inc_tax_flg);
				sloDL_bldr.addLeftOuterJoin(m4,
						bracket(t2.itm_cd.eq(m4.itm_cd)
								.and(t2.itm_sub1.eq(m4.itm_sub1))
								.and(t2.itm_sub2.eq(m4.itm_sub2))
								.and(t2.itm_sub3.eq(m4.itm_sub3))
								.and(t2.trd_unit_cd.eq(m4.unit_cd))));
				sloDL_bldr.addLeftOuterJoin(m5, bracket(t2.tax_cd.eq(m5.tax_cd)));
				sloDL_bldr.addLeftOuterJoin(m3,
						bracket(t2.itm_cd.eq(m3.itm_cd)
								.and(t2.itm_sub1.eq(m3.itm_sub1))
								.and(t2.itm_sub2.eq(m3.itm_sub2))
								.and(t2.itm_sub3.eq(m3.itm_sub3))));
				dbSelectKey("MSBBL1360_MST_SLO_D_S01", _sloDL, sloDL_bldr, up1());

				_sloDJk = up1().join(Chk01_DtlR.$slo_d_no, _sloDL, MST_SLO_D_R.$slo_d_no);

				for (Chk01_DtlR r : up1()) {
					if (isNull(r.slo_d_no())) {
						continue;
					}
					MST_SLO_D_R sloD = r.getJoinedRow(_sloDJk);
					if (isNull(sloD)) {
						msgL.addAll(getRecordNotFoundMsg(getModuleID(),
								sloDL_bldr.getBaseDbc().tableName(), sloDL_bldr.getBaseDbc().getKeyColumn(), new String[] {
									r.slo_d_no()
								}, r));
						continue;
					}

					if (!isSame(sloD.slo_no(), up0().slo_no())) {
						msgL.addAll(getRecordInvalidMsg(Chk01_HdrR.$slo_no, sloD, r));
						continue;
					}
					r.qtn_d_no(sloD.qtn_d_no());
				}
			}

			return msgL;
		}

		/**
		 * 	売上予定・仕入予定
		 * @return
		 */
		protected MCMessageList checkSlsPurcSchd() {
			
			if (_updCntrErr) {
				return null;
			}
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_DtlR> notErrL = getChkList(up1());

			MCList<MST_SLS_SCHD_R> sSchdL = MCList.create(MST_SLS_SCHD_R.class);
			MST_SLS_SCHD_R t1 = MST_SLS_SCHD_R.create("T");
			MCQueryApiBuilder sSchdL_bldr = MCQueryApiBuilder.create(t1);
			MST_PURC_SCHD_R t2 = MST_PURC_SCHD_R.create("T2");
			MST_ARR_SCHD_R t3 = MST_ARR_SCHD_R.create("T3");
			MST_PURC_DLV_SLIP_D_R t4 = MST_PURC_DLV_SLIP_D_R.create("T4");
			MST_SLS_SCHD_R slsschd = MST_SLS_SCHD_R.create("SLSSCHD");
			MCTempView slsschdsum = createTempView("SLSSCHDSUM");

			sSchdL.addNumberColumn("sum_base_unit_sls_qty");
			sSchdL.addNumberColumn("base_unit_schd_qty");
			sSchdL_bldr.addSelect(t2.arr_pr_no);
			sSchdL_bldr.addSelect(t2.arr_schd_no);
			sSchdL_bldr.addSelect(slsschdsum.pr("sum_base_unit_sls_qty"));
			sSchdL_bldr.addSelect(t2.base_unit_schd_qty);
			sSchdL_bldr.addSelect(t4.purc_ddlv_dlv_slip_no, t4.purc_ddlv_dlv_slip_d_no);
			sSchdL_bldr.addInnerJoin(t2, bracket(t1.purc_schd_no.eq(t2.purc_schd_no)));
			sSchdL_bldr.addInnerJoin(
					subQuery()
							.select(slsschd.purc_schd_no, sum(slsschd.base_unit_sls_qty).as("sum_base_unit_sls_qty"))
							.from(slsschd).groupBy(slsschd.purc_schd_no).view(slsschdsum),
					bracket(t1.purc_schd_no.eq(slsschdsum.pr(slsschd.purc_schd_no))));
			sSchdL_bldr.addInnerJoin(t3, bracket(t2.arr_schd_no.eq(t3.arr_schd_no)));
			sSchdL_bldr.addLeftOuterJoin(t4,
					t3.dlv_slip_mng_d_no.eq(t4.dlv_slip_mng_d_no)
					.and(t3.dlv_slip_mng_d_seq.eq(t4.dlv_slip_mng_d_seq))
			);

			dbSelectKey("MSBBL1360_MST_SLS_SCHD_S01", sSchdL, sSchdL_bldr, up1());
			String[] keyCols = sSchdL_bldr.getBaseDbc().getKeyColumn();
			_slsSchdJk = up1().join(keyCols, sSchdL, keyCols);

			for (Chk01_DtlR r : notErrL) {
				if (!isNull(r.sls_schd_no()) || !isNull(r.slo_d_no())) {

					MST_SLS_SCHD_R sSche = r.getJoinedRow(_slsSchdJk);
					if (isNull(sSche)) {
						// 何もしない
					}
					else {
						// 受注明細ＮＯ
						r.slo_d_no(sSche.slo_d_no());
						// 仕入予定ＮＯ
						r.purc_schd_no(sSche.purc_schd_no());
						// 出荷予定ＮＯ
						r.ship_schd_no(sSche.ship_schd_no());

						// 入荷進捗ＮＯ
						// 更新カウンタだけ上らせるのも不安なのでチェック用にＮＯも上らせている
						if (!isSame(r.arr_pr_no(), sSche.getStringNE("arr_pr_no"))) {
							msgL.addAll(getRecordInvalidMsg(Chk01_DtlR.$arr_pr_no,
									sSche.getStringNE("arr_pr_no"), r));
						}

						// 入荷予定ＮＯ
						r.arr_schd_no(sSche.getStringNE("arr_schd_no"));
						// 納品書ＮＯ（発注・納入指示・納期回答受領で作成された仕入直送の納品書）
						if (isNull(up0().sls_act_no())) {
							r.dlv_slip_no(sSche.getStringNE("purc_ddlv_dlv_slip_no"));
							r.dlv_slip_d_no(sSche.getStringNE("purc_ddlv_dlv_slip_d_no"));
						}

						if (r.isStatusDelete()) {
							// 削除行は念のため、打切ＦＬＧは上り電文の値は読み捨てて、補完する
							r.abort_flg(r.abort_flg());
						}
					}
				}
			}
			
			compSlsSchdNo(notErrL);
			
			return msgL;
		}
		/**
		 * 売上予定NOを補完する。<br>
		 * 売上予定を再取得する。
		 * @param dtlL 仕入売上明細の上り電文
		 */
		protected void compSlsSchdNo(MCList<Chk01_DtlR> dtlL) {
			
			MCList<MST_SLS_SCHD_R> slsSchdL = MCList.create(MST_SLS_SCHD_R.class);
			MST_SLS_SCHD_R slsSchd = MST_SLS_SCHD_R.create("SLSSCHD");
			MCQueryApiBuilder slsSchdL_bldr = MCQueryApiBuilder.create(slsSchd);
			slsSchdL_bldr.setWhere(slsSchd.purc_schd_no.eq(bind("purc_schd_no")));
			dbSelect("MSBBL1360_MST_SLS_SCHD_S03", slsSchdL, slsSchdL_bldr, dtlL);
			
			_purcSchdGrpSlsSchdL = MCList.create(MST_SLS_SCHD_R.class);
			MCGroupByPolicy purcSchdPolicy = new MCGroupByPolicy(MST_SLS_SCHD_R.$purc_schd_no);
			purcSchdPolicy.sum(MST_SLS_SCHD_R.$base_unit_qty, MST_SLS_SCHD_R.$base_unit_abort_qty, MST_SLS_SCHD_R.$base_unit_sls_qty);
			_purcSchdGrpSlsSchdL.setAll(slsSchdL.groupBy(purcSchdPolicy));
			_purcSchdGrpSlsIdxKey = _purcSchdGrpSlsSchdL.createIndex(MST_SLS_SCHD_R.$purc_schd_no);
			
			_purcSchdL = MCList.create(MST_PURC_SCHD_R.class);
			MST_PURC_SCHD_R purcSchd1 = MST_PURC_SCHD_R.create("PURCSCHD1");
			MCQueryApiBuilder purcSchdL_bldr1 = MCQueryApiBuilder.create(purcSchd1);
			dbSelectKey("MSBBL1360_MST_PURC_SCHD_S01", _purcSchdL, purcSchdL_bldr1, dtlL);
			_purcSchdIdxKey = _purcSchdL.createIndex(MST_PURC_SCHD_R.$purc_schd_no);
			
			_purcActGrpSlsSchdL = MCList.create(MST_SLS_SCHD_R.class);
			MCGroupByPolicy purcActPolicy = new MCGroupByPolicy(MST_SLS_SCHD_R.$purc_act_d_no);
			purcActPolicy.sum(MST_SLS_SCHD_R.$base_unit_qty, MST_SLS_SCHD_R.$base_unit_abort_qty, MST_SLS_SCHD_R.$base_unit_sls_qty);
			_purcActGrpSlsSchdL.setAll(slsSchdL.groupBy(purcActPolicy));
			_purcActIdxKey = _purcActGrpSlsSchdL.createIndex(MST_SLS_SCHD_R.$purc_act_d_no);
			
			MCList<MST_PURC_SCHD_R> purcSchdL = MCList.create(MST_PURC_SCHD_R.class);
			MST_PURC_SCHD_R purcSchd2 = MST_PURC_SCHD_R.create("PURCSCHD2");
			MCQueryApiBuilder purcSchdL_bldr2 = MCQueryApiBuilder.create(purcSchd2);
			purcSchdL_bldr2.setSelect(purcSchd2.purc_schd_no, purcSchd2.base_unit_schd_qty);
			dbSelectKey("MSBBL1360_MST_PURC_SCHD_S02", purcSchdL, purcSchdL_bldr2, dtlL);
			
			if (!isNull(up0().sls_act_no())) {
				MCList<Chk01_DtlR> tgtL = dtlL.subList(r->!isNull(r.purc_schd_no()) && r.isStatusCreate() && r.sync_flg());
				
				if (!tgtL.isEmpty()) {
					
					MCIndexKey idxkey = slsSchdL.createIndex(MST_SLS_SCHD_R.$purc_schd_no, MST_SLS_SCHD_R.$purc_act_d_no);
					
					for (Chk01_DtlR dtlR : tgtL) {
						MST_SLS_SCHD_R slsSchdR = slsSchdL.getFirst(idxkey, dtlR.purc_schd_no(), null);
						if (!isNull(slsSchdR)) {
							dtlR.sls_schd_no(slsSchdR.sls_schd_no());
						}
					}
					
					MCQueryApiBuilder slsSchd_bldr = MCQueryApiBuilder.create(MST_SLS_SCHD_R.create("T"));
					String[] keyCols = slsSchd_bldr.getBaseDbc().getKeyColumn();
					_slsSchdJk = up1().join(keyCols, slsSchdL, keyCols);
				}
			}
		}

		/**
		 * 	入荷進捗の排他ロックと更新カウンタチェック
		 * @return
		 */
		protected MCMessageList lockAndCheckArrPr() {
			
			if (_updCntrErr) {
				return null;
			}

			MCMessageList msgL = new MCMessageList();

			MCList<MST_ARR_PR_R> arrPrL = MCList.create(MST_ARR_PR_R.class);
			MCQueryApiBuilder arrPrL_bldr = MCQueryApiBuilder.create(MST_ARR_PR_R.create("T"));
			arrPrL_bldr.setOrderByAsc(arrPrL_bldr.getBaseDbc().getKeyColumn$());
			dbSelectKeyForUpdateNoWait("MSBBL1360_MST_ARR_PR_S01", arrPrL, arrPrL_bldr, up1());
			MCJoinKey<MCList<MST_ARR_PR_R>> jk = up1().join(Chk01_DtlR.$arr_pr_no, arrPrL,
					MST_ARR_PR_R.$arr_pr_no);

			for (Chk01_DtlR r : up1()) {
				if (isNull(r.arr_pr_no())) {
					continue;
				}
				MST_ARR_PR_R arrPr = r.getJoinedRow(jk);

				msgL.addAll(checkUpdCntrNE(r, Chk01_DtlR.$arr_pr_upd_cntr, arrPr));

				if (!isNull(arrPr)) {
					r.po_d_no(arrPr.po_d_no());
				}
			}
			
			if (!msgL.isEmpty()) {
				
				_updCntrErr = true;
			}

			return msgL;
		}

		/**
		 * 	出荷進捗の排他ロックと更新カウンタチェック
		 * @return
		 */
		protected MCMessageList lockAndCheckShipPr() {
			
			if (_updCntrErr) {
				return null;
			}

			MCMessageList msgL = new MCMessageList();

			MCList<MST_SHIP_PR_R> shipPrL = MCList.create(MST_SHIP_PR_R.class);
			MST_SHIP_PR_R t = MST_SHIP_PR_R.create("T");
			MCQueryApiBuilder shipPrL_bldr = MCQueryApiBuilder.create(t);
			shipPrL_bldr.setWhere(t.slo_d_no.eq(bind("slo_d_no")));
			dbSelectForUpdateNoWait("MSBBL1360_MST_SHIP_PR_S01", shipPrL, shipPrL_bldr, up1());
			shipPrL_bldr.setOrderByAsc(shipPrL_bldr.getBaseDbc().getKeyColumn$());
			MCJoinKey<MCList<MST_SHIP_PR_R>> jk = up1().join(
					Chk01_DtlR.$ship_pr_no, shipPrL, MST_SHIP_PR_R.$ship_pr_no);

			for (Chk01_DtlR r : up1()) {
				if (isNull(r.ship_pr_no())) {
					continue;
				}
				MST_SHIP_PR_R shipPr = r.getJoinedRow(jk);
				msgL.addAll(checkUpdCntrNE(r, Chk01_DtlR.$ship_pr_upd_cntr, shipPr));
			}
			
			if (!msgL.isEmpty()) {
				
				_updCntrErr = true;
			}
			
			return msgL;
		}

		/**
		 * 	発注情報の存在チェック
		 * @return
		 */
		protected MCMessageList checkPo() {
			
			if (_updCntrErr) {
				return null;
			}

			MCMessageList msgL = new MCMessageList();

			MAVM_ITM_UNIT_R m1 = MAVM_ITM_UNIT_R.create("M1");
			MAM_TAX_R tax = MAM_TAX_R.create("TAX");

			_poDL = MCList.create(MST_PO_D_R.class);
			MST_PO_D_R t1 = MST_PO_D_R.create("T");
			MCQueryApiBuilder poDL_bldr = MCQueryApiBuilder.create(t1);
			poDL_bldr.addSelect(m1.dec_place);
			poDL_bldr.addSelect(m1.rnd_typ);
			poDL_bldr.addSelect(m1.conv_base_qty);
			poDL_bldr.addSelect(m1.conv_qty);
			_poDL.addBooleanColumn("inc_tax_flg");
			poDL_bldr.addSelect(tax.tax_rate);
			poDL_bldr.addSelect(tax.inc_tax_flg);
			poDL_bldr.addLeftOuterJoin(m1, bracket(t1.itm_cd.eq(m1.itm_cd)
					.and(t1.itm_sub1.eq(m1.itm_sub1))
					.and(t1.itm_sub2.eq(m1.itm_sub2))
					.and(t1.itm_sub3.eq(m1.itm_sub3))
					.and(t1.trd_unit_cd.eq(m1.unit_cd))));
			poDL_bldr.addLeftOuterJoin(tax, bracket(t1.tax_cd.eq(tax.tax_cd)));
			dbSelectKey("MSBBL1360_MST_PO_D_S01", _poDL, poDL_bldr, up1());
			String[] poDKeyCols = poDL_bldr.getBaseDbc().getKeyColumn();
			_poDJk = up1().join(Chk01_DtlR.$po_d_no, _poDL, MST_PO_D_R.$po_d_no);

			// 仕入直送の場合、明細単位で発注ヘッダが作成される
			for (Chk01_DtlR r : up1()) {

				if (!isNull(r.po_d_no())) {
					MST_PO_D_R poD = r.getJoinedRow(_poDJk);
					if (isNull(poD)) {
						msgL.addAll(getRecordNotFoundMsg(getModuleID(),
								poDL_bldr.getBaseDbc().tableName(), poDKeyCols, r.toArray(poDKeyCols), r));
					}
					else {
						r.po_no(poD.po_no());
					}
				}
			}

			MAM_BP_R m5 = MAM_BP_R.create("M1");
			MAM_CUR_R m2 = MAM_CUR_R.create("M2");
			MAM_BP_R m3 = MAM_BP_R.create("M3");
			MAM_BP_R m4 = MAM_BP_R.create("M4");

			_poL = MCList.create(MST_PO_R.class);
			MST_PO_R t2 = MST_PO_R.create("T");
			MCQueryApiBuilder poL_bldr = MCQueryApiBuilder.create(t2);
			_poL.addBooleanColumn(MAM_BP_R.$subcon_flg);
			_poL.addBooleanColumn(MAM_BP_R.$sppl_iv_flg);
			_poL.addBooleanColumn(MAM_BP_R.$pay_spot_flg);
			poL_bldr.addSelect(m5.subcon_flg);
			poL_bldr.addSelect(m5.purc_amt_rnd_typ);
			poL_bldr.addSelect(m5.purc_tax_rnd_typ);
			poL_bldr.addSelect(m5.sppl_iv_flg);
			poL_bldr.addSelect(m4.pay_spot_flg);
			poL_bldr.addSelect(m2.amt_dec_place);
			poL_bldr.addSelect(m2.upri_dec_place);
			poL_bldr.addLeftOuterJoin(m5, bracket(t2.sppl_cd.eq(m5.bp_cd)));
			poL_bldr.addLeftOuterJoin(m2, bracket(t2.trd_cur_cd.eq(m2.cur_cd)));
			poL_bldr.addLeftOuterJoin(m3, bracket(m5.asppl_cd.eq(m3.bp_cd)));
			poL_bldr.addLeftOuterJoin(m4, bracket(m3.bsppl_cd.eq(m4.bp_cd)));
			dbSelectKey("MSBBL1360_MST_PO_S01", _poL, poL_bldr, up1());
			String[] poKeyCols = poL_bldr.getBaseDbc().getKeyColumn();
			_poJk = up1().join(Chk01_DtlR.$po_no, _poL, MST_PO_R.$po_no);

			for (Chk01_DtlR r : up1()) {

				if (!isNull(r.po_no())) {
					MST_PO_R po = r.getJoinedRow(_poJk);
					if (isNull(po)) {
						msgL.addAll(getRecordNotFoundMsg(getModuleID(), poL_bldr.getBaseDbc().tableName(),
								poKeyCols, r.toArray(poKeyCols), r));
					}
				}
			}

			return msgL;
		}

		/**
		 * 	仕入実績情報の存在チェック
		 * @return
		 */
		protected MCMessageList checkPurcAct() {

			if (_updCntrErr) {
				return null;
			}
			
			MCMessageList msgL = new MCMessageList();

			_purcActL = MCList.create(MST_PURC_ACT_R.class);
			MST_PURC_ACT_R t1 = MST_PURC_ACT_R.create("T");
			MCQueryApiBuilder purcActL_bldr = MCQueryApiBuilder.create(t1);
			purcActL_bldr
					.setWhere(t1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			purcActL_bldr.addWhereWithAnd(t1.purc_act_no.eq(bind("purc_act_no")));
			dbSelect("MSBBL1360_MST_PURC_ACT_S01", _purcActL, purcActL_bldr, up1().groupBy(Chk01_DtlR.$purc_act_no));
			// 最新の伝票のみを抽出するので以降は連番は意識しない（実績ＮＯのみでユニークになるはず）
			String[] paKeyCols = new String[] {
				MST_PURC_ACT_R.$purc_act_no
			};
			_paJk = up1().join(Chk01_DtlR.$purc_act_no, _purcActL,
					MST_PURC_ACT_R.$purc_act_no);

			_purcActDL = MCList.create(MST_PURC_ACT_D_R.class);
			MST_PURC_ACT_D_R t2 = MST_PURC_ACT_D_R.create("T");
			MCQueryApiBuilder purcActDL_bldr = MCQueryApiBuilder.create(t2);
			purcActDL_bldr.setWhere(t2.purc_act_no.eq(bind("purc_act_no")));
			purcActDL_bldr.addWhereWithAnd(t2.purc_act_seq.eq(bind("purc_act_seq")));
			dbSelect("MSBBL1360_MST_PURC_ACT_D_S01", _purcActDL, purcActDL_bldr, _purcActL);
			String[] paDKeyCols = new String[] {
				MST_PURC_ACT_D_R.$purc_act_d_no
			};
			_paDJk = up1().join(Chk01_DtlR.$purc_act_d_no, _purcActDL,
					MST_PURC_ACT_D_R.$purc_act_d_no);

			for (Chk01_DtlR r : up1()) {

				if (!isNull(r.purc_act_d_no())) {
					MST_PURC_ACT_R purcAct = r.getJoinedRow(_paJk);
					if (isNull(purcAct)) {
						msgL.addAll(getRecordNotFoundMsg(getModuleID(),
								purcActL_bldr.getBaseDbc().tableName(), paKeyCols, r.toArray(paKeyCols), r));
					}

					MST_PURC_ACT_D_R purcActD = r.getJoinedRow(_paDJk);
					if (isNull(purcActD)) {
						msgL.addAll(getRecordNotFoundMsg(getModuleID(),
								purcActDL_bldr.getBaseDbc().tableName(), paDKeyCols,
								r.toArray(paDKeyCols), r));
					}
					else {
						r.purc_act_seq(purcActD.purc_act_seq());
						r.purc_act_d_seq(purcActD.purc_act_d_seq());
					}
				}
			}

			return msgL;

		}

		/**
		 * 	入荷予定 存在チェック
		 * @return
		 */
protected MCMessageList checkArrSchd() {
			
			if (_updCntrErr) {
				return null;
			}

			MCMessageList msgL = new MCMessageList();

			_arrSchdL = MCList.create(MST_ARR_SCHD_R.class);
			MST_ARR_SCHD_R t = MST_ARR_SCHD_R.create("T");
			MCQueryApiBuilder arrSchdL_bldr = MCQueryApiBuilder.create(t);
			MST_RCPT_IV_R t1 = MST_RCPT_IV_R.create("T1");
			_arrSchdL.addDateColumn(MST_RCPT_IV_R.$pay_schd_dt);
			_arrSchdL.addDateColumn(MST_RCPT_IV_R.$pay_basis_dt);
			arrSchdL_bldr.addSelect(t1.pay_schd_dt);
			arrSchdL_bldr.addSelect(t1.pay_basis_dt);
			arrSchdL_bldr.addLeftOuterJoin(t1, bracket( t.rcpt_iv_mng_no.eq(t1.rcpt_iv_mng_no)));
			dbSelectKey("MSBBL1360_MST_ARR_SCHD_S01", _arrSchdL, arrSchdL_bldr, up1());
			String[] keyCols = arrSchdL_bldr.getBaseDbc().getKeyColumn();
			MCIndexKey idxkey = _arrSchdL.createIndex(arrSchdL_bldr.getBaseDbc().getKeyColumn());

			_asJk = up1().join(Chk01_DtlR.$arr_schd_no, _arrSchdL, idxkey);

			for (Chk01_DtlR r : up1()) {
				if (isNull(r.slo_d_no())) {
					continue;
				}
				MST_ARR_SCHD_R arrSchd = r.getJoinedRow(_asJk);
				if (isNull(arrSchd)) {
					msgL.addAll(getRecordNotFoundMsg(getModuleID(),
							arrSchdL_bldr.getBaseDbc().tableName(), keyCols, r.toArray(keyCols), r));
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
		protected MCMessageList checkAtLeastOneIo(MCList<Chk01_DtlR> dtlL,
				MCList<Chk01_IoR> ioL) {
			MCMessageList msgL = new MCMessageList();

			for (Chk01_DtlR parDtl : dtlL.subList(CREATE, MODIFY, NONE)) {
				MCList<Chk01_IoR> chdIoL = _ioLMap.get(parDtl.dtl_row_id()).subList(
						CREATE, MODIFY, NONE);
				if (chdIoL.isEmpty()) {
					msgL.add(new MCMessage(parDtl, null, MAUDL0012,
							toDispGUIIndex(parDtl)));
				}
			}
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheck() {
			
			if (_updCntrErr) {
				return null;
			}
			
			return super.doServerCheck();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			
			if (_updCntrErr) {
				return null;
			}

			MCMessageList msgL = super.doServerCheckSub();
			
			// DAC更新権限チェック
			msgL.addAll(checkWritableDptCdDac(up0(), Chk01_HdrR.$sls_dpt_cd));

			// 条件付き必須チェック
			msgL.addAll(checkReqSub());

			// 条件付き存在チェック
			msgL.addAll(checkExistsSub());

			// その他のチェック処理
			msgL.addAll(checkAtLeastOneDtl(up0(), up1()));
			msgL.addAll(checkAtLeastOneIo(up1(), up2()));

			// 補完補完(定型チェック実施後)
			compHdrSub();
			compDtlSub();
			compIoSub();

			// 固有チェック
			msgL.addAll(checkOther());

			// ロットＮＯ発番
			setLotNo();

			return msgL;
		}

		protected void compHdrSub() {

			// 計上年月
			up0().ac_ym(getAcYm(up0().ac_dt()));

			// 請求先・与信管理先ＣＤ
			MAM_BP_R acst = selectBp(up0().acst_cd());
			up0().bcst_cd(acst.bcst_cd());
			MAM_BP_R bcst = selectBp(up0().bcst_cd());
			up0().cred_cd(bcst.ar_cred_cd());

			// 基準通貨ＣＤ
			up0().base_cur_cd(getCo().base_cur_cd());

			// 為替レートＣＤ
			up0().xrate_cd(getCo().sls_xrate_cd());

			// 納税通貨ＣＤ
			up0().ptax_cur_cd(getCo().ptax_cur_cd());
		}

		protected MAM_BP_R selectBp(String bpCd) {
			MAM_BP_R bp = MAM_BP_R.create();
			dbSelectKey("MSBBL1360_MAM_BP_S01", bp,
					MCQueryApiBuilder.create(MAM_BP_R.create("T")), bpCd);
			return bp;
		}

		protected void compDtlSub() {

			MCList<Chk01_DtlR> notErrL = getChkList(up1(), CREATE, MODIFY, NONE);
			// 行追加された明細が先頭にある場合を考慮して、並び順で最初の納品書を退避
			String dlvSlipNo = null;
			for (Chk01_DtlR r : notErrL) {
				dlvSlipNo = r.dlv_slip_no();
				if (!isNull(dlvSlipNo)) {
					break;
				}
			}
			for (Chk01_DtlR r : notErrL) {
				// 基準単位数量
				MCNumber baseUnitQty = convToBaseUnit(r.trd_unit_qty(),
						r.trd_unit_conv_base_qty(), r.trd_unit_conv_qty(),
						r.base_unit_dec_place(), r.base_unit_rnd_typ());
				r.base_unit_qty(baseUnitQty);

				if (!r.sundry_itm_flg()) {
					r.itm_nm(null);
				}

				if (!r.dlv_sundry_flg()) {
					r.dlv_nm(null);
				}

				// 原価金額
				r.cost_amt(getCostAmt(r));
				
				// 納品書ＮＯはcheckSlsPurcSchdで補完済み
				// 補完されていないのは行追加された明細。これは画面の並び順でひとつまえの明細と同じ納品書に含める
				if (isNull(r.dlv_slip_no())) {
					r.dlv_slip_no(dlvSlipNo);
				}
				dlvSlipNo = r.dlv_slip_no();
			}

			// 表示順の設定
			setDispSeq(notErrL);

		}

		protected void compIoSub() {

			MCList<Chk01_DtlR> notErrL = getChkList(up1(), CREATE, MODIFY, NONE);
			for (Chk01_DtlR parDtl : notErrL) {

				MST_ARR_SCHD_R arrSchd = parDtl.getJoinedRow(_asJk);
				
				for (Chk01_IoR chdIo : _ioLMap.get(parDtl.dtl_row_id())) {

					// リストロジック定型処理により補完した明細の基準単位換算情報を子の詳細行へコピーする
					chdIo.base_unit_cd(parDtl.base_unit_cd());
					chdIo.base_unit_dec_place(parDtl.base_unit_dec_place());
					chdIo.base_unit_rnd_typ(parDtl.base_unit_rnd_typ());

					// 基準単位数量
					MCNumber baseQnitQty = convToBaseUnit(chdIo.trd_unit_qty(),
							chdIo.trd_unit_conv_base_qty(), chdIo.trd_unit_conv_qty(),
							chdIo.base_unit_dec_place(), chdIo.base_unit_rnd_typ());
					chdIo.base_unit_qty(baseQnitQty);
					
					if (!isNull(arrSchd)) {
						chdIo.loc_cd(arrSchd.arr_loc_cd());
						chdIo.str_ln_cd(arrSchd.str_ln_cd());
					}
				}
			}
		}

		protected MCMessageList checkReqSub() {
			MCMessageList msgL = new MCMessageList();

			return msgL;
		}

		protected MCMessageList checkExistsSub() {
			MCMessageList msgL = new MCMessageList();

			return msgL;
		}

		protected MCMessageList checkOther() {
			MCMessageList msgL = new MCMessageList();

			// 計上日≦請求起算日チェック
			msgL.addAll(checkAcDtBillBasisDt());

			// 承認チェック(受注)
			msgL.addAll(checkSloAprv());
			if (!msgL.isEmpty()) {
				return msgL;
			}

			// 数量チェック
			msgL.addAll(checkOverPurcQty());
			
			// 仕入実績受払売上可能数チェック
			msgL.addAll(checkPurcSlsAblQty());

			// データ状況チェック（打切）
			msgL.addAll(checkAbort());

			// 得意先禁止チェック
			msgL.addAll(checkStopCst());

			// 品目禁止チェック(受注）
			msgL.addAll(checkStopSloItm());

			// 品目禁止チェック(出荷・売上）
			msgL.addAll(checkStopSlsItm());

			// 引継明細存在チェック
			msgL.addAll(checkSloTrnstExists());

			// 市場出荷判定対象ロット発番済チェック
			msgL.addAll(checkMrktJudgLot());

			// 価格印字ＦＬＧ混在チェック
			msgL.addAll(checkMixPriPrntFlg());

			// 明細-詳細相違チェック(数量)
			msgL.addAll(checkMatchDtlIoQty());

			// 明細-詳細相違チェック(手配ＮＯ)
			msgL.addAll(checkMatchDtlIoSno());

			// 明細-詳細相違チェック(ロット作成)
			msgL.addAll(checkMatchDtlIoCrtLot());
			
			// 明細-複数業者ロットＮＯ指定チェック(ロット作成)
			msgL.addAll(checkBpLotNo());

			// 明細-詳細相違チェック(ロット・サブロット)
			msgL.addAll(checkMatchDtlIoLot());

			// 明細-詳細相違チェック(格付)
			msgL.addAll(checkMatchDtlIoGd());

			// 明細-詳細相違チェック(版ＮＯ)
			msgL.addAll(checkMatchDtlIoVerNo());

			// 明細-詳細相違チェック(出荷元期限)
			msgL.addAll(checkMatchDtlIoShipFrValidDt());
			
			// 明細-詳細相違チェック(有効成分)
			msgL.addAll(checkMatchDtlIoContQty());
			
			msgL.addAll(checkReqLotNo());
			
			return msgL;
		}

		/**
		 * 計上日≦請求起算日チェック
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList checkAcDtBillBasisDt() {
			
			MCMessageList msgL = new MCMessageList();
			
			MAM_BP_R bcstR = selectBp(up0().bcst_cd());
			
			// 売上都度請求以外、計上日≦請求起算日チェック
			if (!MAC_BILL_CL_TYP.isEACH_SLS(bcstR.bill_cl_typ())) {
				msgL.addAll(check(up0(), new String[] {Chk01_HdrR.$ac_dt, Chk01_HdrR.$bill_basis_dt}, new FXUCL_BeforeAfterValidater()));
			}
			
			return msgL;
		}

		/**
		 * 	承認チェック(受注)
		 * <p>受注承認チェック（受注ヘッダの承認対象FLG、承認状況区分をチェック）受注承認対象で最終承認済ではない場合</p>
		 * @return
		 */
		protected MCMessageList checkSloAprv() {
			MCMessageList msgL = new MCMessageList();
			if (up0().aprv_flg() && MAC_APRV_STS_TYP.isACPT(up0().aprv_sts_typ())) {
				msgL.add(new MCMessage(up0(), Chk01_HdrR.$slo_no, MSBBL0133, up0()
						.aprv_no(), up0().aprv_sts_typ()));
			}

			return msgL;
		}

		/**
		 * 	数量チェック<br>
		 * 	仕入後計上の場合に仕入数を超える数量だった場合
		 * @return
		 */
		protected MCMessageList checkOverPurcQty() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_DtlR> chkDtlL = getChkList(up1(), CREATE, MODIFY, NONE);
			for (Chk01_DtlR parDtl : chkDtlL) {
				
				// 同時計上の場合はチェックしない
				// 同時計上ＦＬＧはオンかオフのどちらかに統一されている前提である
				if (!parDtl.sync_flg() && !isNull(parDtl.slo_d_no())) {
					MST_PURC_ACT_D_R purcAct = parDtl.getJoinedRow(_paDJk);
					MCList<Chk01_DtlR> tgtDtlL = up1().subList(r->isSame(r.purc_act_d_no(), parDtl.purc_act_d_no()) && !r.sync_flg());
					MCNumber baseUnitQty = MCNumber.ZERO;
					for (Chk01_DtlR tgtDtlR : tgtDtlL) {
						baseUnitQty = baseUnitQty.add(tgtDtlR.isStatusDelete() ? MCNumber.ZERO : tgtDtlR.base_unit_qty());
					}
					if (baseUnitQty.gt(purcAct.base_unit_qty())) {
						msgL.add(new MCMessage(parDtl, Chk01_DtlR.$trd_unit_qty,
								MSBBL0132, toDispGUIIndex(parDtl)));
					}
				}
			}
			return msgL;

		}		

		/**
		 * 	データ状況チェック<br>
		 * 	打切
		 * 	<p>
		 * 	取消対象の売上実績に、打切ＦＬＧがオンの売上実績明細が含まれる場合
		 * 	</p>
		 * @return
		 */
		protected MCMessageList checkAbort() {

			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_DtlR> chkDtlL = getChkList(up1());
			
			for (Chk01_DtlR dtl : chkDtlL) {
				if (dtl.abort_flg()) {
					
					if (dtl.isStatusDelete()) {
						msgL.add(new MCMessage(dtl, Chk01_DtlR.$abort_flg, MSBBL0070,
								toDispGUIIndex(dtl)));
					}
					else if (!isNull(dtl.sls_schd_no()))  {
						
						MST_SLS_SCHD_R slsSchdR = dtl.getJoinedRow(_slsSchdJk);
						if (!isNull(slsSchdR)) {
							
							MCNumber befBaseUnitQty = MCNumber.ZERO;
							MCNumber baseUnitQty = MCNumber.ZERO;
							MCNumber baseUnitSchdQty = MCNumber.ZERO;
							MST_SLS_SCHD_R slsSchdGrpR = null;
							MCList<Chk01_DtlR> tgtDtlL = null;
							
							if (dtl.sync_flg()) {
								slsSchdGrpR = _purcSchdGrpSlsSchdL.getFirst(_purcSchdGrpSlsIdxKey, dtl.purc_schd_no());
								tgtDtlL = up1().subList(r->isSame(r.purc_schd_no(), dtl.purc_schd_no()) && r.sync_flg());
								
								MST_PURC_SCHD_R purcSchdR = _purcSchdL.getFirst(_purcSchdIdxKey, dtl.purc_schd_no());
								baseUnitSchdQty = purcSchdR.base_unit_schd_qty();
							}
							else {
								slsSchdGrpR = _purcActGrpSlsSchdL.getFirst(_purcActIdxKey, dtl.purc_act_d_no());
								tgtDtlL = up1().subList(r->isSame(r.purc_act_d_no(), dtl.purc_act_d_no()) && !r.sync_flg());
								baseUnitSchdQty = slsSchdGrpR.base_unit_qty();
							}
							
							for (Chk01_DtlR tgtDtlR : tgtDtlL) {
								
								baseUnitQty = baseUnitQty.add(tgtDtlR.isStatusDelete() ? MCNumber.ZERO : tgtDtlR.base_unit_qty());
								
								if (!isNull(tgtDtlR.sls_act_d_no())) {
									MST_SLS_ACT_D_R slsActD = tgtDtlR.getJoinedRow(_slsActJk);
									if (!isNull(slsActD)) {
										befBaseUnitQty = befBaseUnitQty.add(slsActD.base_unit_qty());
									}
								}
							}
							
							if ((!slsSchdR.abort_flg() || baseUnitQty.gt(befBaseUnitQty)) &&
									slsSchdGrpR.base_unit_sls_qty().subtract(befBaseUnitQty).add(baseUnitQty).gte(
											baseUnitSchdQty)) {
								msgL.add(new MCMessage(dtl, Chk01_DtlR.$abort_flg, MSBBL0115, toDispGUIIndex(dtl)));
							}
						}
					}

				}
			}
			
			return msgL;
		}

		/**
		 * 	引継チェック<br>
		 * 	受注引継の明細が一件もない場合（検索結果が全行行削除され、行追加で新規追加されている状態）
		 * @return
		 */
		protected MCMessageList checkSloTrnstExists() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_DtlR> chkL = getChkList(up1());

			for (Chk01_DtlR dtl : chkL.groupBy(Chk01_DtlR.$slo_d_no)) {
				if (!isNull(dtl.slo_d_no())) {
					return msgL;
				}
			}

			msgL.add(new MCMessage(up0(), Chk01_HdrR.$slo_no, MSBBL0127));
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
				msgL.add(new MCMessage(up0(), Chk01_HdrR.$cst_cd, MSBBL0089, up0()
						.cst_cd(), toYMDString(up0().sls_dt()), toDispGUIIndex(up0())));
			}

			return msgL;
		}

		/**
		 * 	品目禁止チェック(受注)
		 * <p>
		 * 	行追加行のみ（計画外）
		 * </p>
		 * @return
		 */
		protected MCMessageList checkStopSloItm() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_DtlR> chkDtlL = getChkList(up1(), CREATE, MODIFY, NONE);
			for (Chk01_DtlR unschdDtl : chkDtlL.subList(Chk01_DtlR.$slo_d_no, null)) {
				Chk01_DtlR bind = unschdDtl.clone();
				bind.setDateNE(Chk01_HdrR.$sls_dt, up0().sls_dt());
				boolean rslt = execFuncBoolean(createSqlId(LOGIC_ID, "MAPA_ITM$F_IS_SLO_STOP", "01"),
						MAPA_ITM$F_IS_SLO_STOP(bind("itm_cd"), bind("itm_sub1"),
								bind("itm_sub2"), bind("itm_sub3"), bind("sls_dt")),
						bind);
				if (rslt) {
					msgL.add(new MCMessage(unschdDtl, Chk01_DtlR.$itm_cd, MSBBL0128,
							toDispItm(bind.itm_cd(), bind.itm_sub1(), bind.itm_sub2(),
									bind.itm_sub3()), toYMDString(up0().sls_dt()),
							toDispGUIIndex(unschdDtl)));
				}
			}

			return msgL;

		}

		/**
		 * 	品目禁止チェック(売上・出荷)
		 * @return
		 */
		protected MCMessageList checkStopSlsItm() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_DtlR> chkDtlL = getChkList(up1(), CREATE, MODIFY, NONE);
			for (Chk01_DtlR dtl : chkDtlL) {
				Chk01_DtlR bind = dtl.clone();
				bind.setDateNE(Chk01_HdrR.$sls_dt, up0().sls_dt());
				boolean rslt = execFuncBoolean(createSqlId(LOGIC_ID, "MAPA_ITM$F_IS_SLS_STOP", "01"),
						MAPA_ITM$F_IS_SLS_STOP(bind("itm_cd"), bind("itm_sub1"),
								bind("itm_sub2"), bind("itm_sub3"), bind("sls_dt")),
						bind);
				if (rslt) {
					msgL.add(new MCMessage(dtl, Chk01_DtlR.$itm_cd, MSBBL0090, toDispItm(
							bind.itm_cd(), bind.itm_sub1(), bind.itm_sub2(),
							bind.itm_sub3()), toYMDString(up0().sls_dt()), toDispGUIIndex(dtl)));
				}
			}
			return msgL;
		}

		/**
		 * 市場出荷判定対象ロット発番済チェック
		 * @return
		 */
		protected MCMessageList checkMrktJudgLot() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_DtlR> chkDtlL = getChkList(up1(), CREATE, MODIFY, NONE);
			for (Chk01_DtlR r : chkDtlL) {
				if (isMrktJudgItm(r) && isNullOrNullVal(r.lot_no())) {
					msgL.add(new MCMessage(r, Chk01_DtlR.$lot_no, MSBBL0175,
							toDispGUIIndex(r)));
				}
			}

			return msgL;
		}

		/**
		 * 	価格印字ＦＬＧ混在チェック
		 * <p>明細の同一納品先に対し、異なる価格印字ＦＬＧが設定されている場合</p>
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
		 * <p>明細の数量と詳細の数量（合計）が異なる場合※基準単位換算</p>
		 * @return
		 */
		protected MCMessageList checkMatchDtlIoQty() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_DtlR> chkDtlL = getChkList(up1(), CREATE, MODIFY, NONE);
			for (Chk01_DtlR r : chkDtlL) {
				MCList<Chk01_IoR> chdL = _ioLMap.get(r.dtl_row_id()).subList(CREATE,
						MODIFY, NONE);
				if (!chdL.isEmpty()
						&& !isSame(r.base_unit_qty(), chdL.sum(Chk01_IoR.$base_unit_qty))) {
					msgL.add(new MCMessage(r, Chk01_DtlR.$trd_unit_qty, MSBBL0079));
				}
			}

			return msgL;
		}

		/**
		 * 	明細・詳細相違チェック(手配ＮＯ)
		 * <p>明細の手配ＮＯ１～４が入力されている場合に、詳細の手配ＮＯ１～４と異なる場合</p>
		 * @return
		 */
		protected MCMessageList checkMatchDtlIoSno() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_DtlR> chkDtlL = getChkList(up1(), CREATE, MODIFY, NONE);
			for (Chk01_DtlR r : chkDtlL) {

				if (!isNullOrNullVal(r.sno1()) || !isNullOrNullVal(r.sno2())
						|| !isNullOrNullVal(r.sno3()) || !isNullOrNullVal(r.sno4())) {

					for (Chk01_IoR chd : _ioLMap.get(r.dtl_row_id()).subList(CREATE,
							MODIFY, NONE)) {
						if (!isSame(r.sno1(), chd.sno1())
								|| !isSame(r.sno2(), chd.sno2())
								|| !isSame(r.sno3(), chd.sno3())
								|| !isSame(r.sno4(), chd.sno4())) {
							msgL.add(new MCMessage(r, Chk01_DtlR.$sno1, MSBBL0080));
						}
					}
				}
			}
			return msgL;
		}

		/**
		 * 	明細・詳細相違チェック(ロット作成)
		 * <p>明細のロット作成がオンの場合に、詳細のロット作成がオフのものが含まれている場合</p>
		 * @return
		 */
		protected MCMessageList checkMatchDtlIoCrtLot() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_DtlR> chkDtlL = getChkList(up1(), CREATE, MODIFY, NONE);
			MCIndexKey idxkey = null;
			for (Chk01_DtlR r : chkDtlL) {

				MCList<Chk01_IoR> chdL = _ioLMap.get(r.dtl_row_id()).subList(CREATE,
						MODIFY, NONE);

				idxkey = chdL.createIndex(Chk01_IoR.$crt_lot_flg);

				if (r.crt_lot_flg() && chdL.contains(idxkey, false)) {
					
					msgL.add(new MCMessage(r, Chk01_DtlR.$crt_lot_flg, MSBBL0129, toDispGUIIndex(r)));
					continue;
				}

			}
			return msgL;
		}
		
		/**
		 * 複数業者ロットＮＯ指定チェック<br>
		 * 明細単位発番 かつ 詳細に複数の業者ロットＮＯを指定した場合にエラーとする。
		 * @return エラーメッセージ
		 */
		protected MCMessageList checkBpLotNo() {
			
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_DtlR> chkDtlL = getChkList(up1(), CREATE, MODIFY, NONE);
			for (Chk01_DtlR r : chkDtlL) {

				MCList<Chk01_IoR> chdL = _ioLMap.get(r.dtl_row_id()).subList(CREATE, MODIFY, NONE);

				if (r.crt_lot_flg() && chdL.groupBy(Chk01_IoR.$bp_lot_no).size() > 1) {
					
					msgL.add(new MCMessage(r, Chk01_DtlR.$crt_lot_flg, MSBBL0257, toDispGUIIndex(r)));
					continue;
				}
			}
			return msgL;

		}

		/**
		 * 	明細・詳細相違チェック(ロットＮＯ・サブロットＮＯ)
		 * <p>
		 * 	明細のロットが入力されている場合に、詳細のロットと異なる場合<br>
		 * 	明細のサブロットが入力されている場合に、詳細のサブロットと異なる場合
		 * </p>
		 * @return
		 */
		protected MCMessageList checkMatchDtlIoLot() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_DtlR> chkDtlL = getChkList(up1(), CREATE, MODIFY, NONE);
			for (Chk01_DtlR r : chkDtlL) {

				if (!isNull(r.lot_no())) {
					MCList<Chk01_IoR> chdL = _ioLMap.get(r.dtl_row_id()).subList(CREATE,
							MODIFY, NONE);
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
		 * 	明細・詳細相違チェック(格付)
		 * <p>明細の格付が入力されている場合に、詳細の格付と異なる場合</p>
		 * @return
		 */
		protected MCMessageList checkMatchDtlIoGd() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_DtlR> chkDtlL = getChkList(up1(), CREATE, MODIFY, NONE);
			for (Chk01_DtlR r : chkDtlL) {

				if (isNullOrNullVal(r.gd_cd())) {
					continue;
				}

				MCList<Chk01_IoR> chdL = _ioLMap.get(r.dtl_row_id());
				for (Chk01_IoR chd : chdL) {
					if (!isSame(r.gd_cd(), chd.gd_cd())) {
						msgL.add(new MCMessage(r, Chk01_DtlR.$gd_cd, MSBBL0085));
					}
				}
			}
			return msgL;
		}

		/**
		 * 	明細・詳細相違チェック(版ＮＯ)
		 * <p>明細の版ＮＯが入力されている場合に、詳細の版ＮＯと異なる場合</p>
		 * @return
		 */
		protected MCMessageList checkMatchDtlIoVerNo() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_DtlR> chkDtlL = getChkList(up1(), CREATE, MODIFY, NONE);
			for (Chk01_DtlR r : chkDtlL) {

				if (isNullOrNullVal(r.ver_no())) {
					continue;
				}

				MCList<Chk01_IoR> chdL = _ioLMap.get(r.dtl_row_id()).subList(CREATE,
						MODIFY, NONE);
				for (Chk01_IoR chd : chdL) {
					if (!isSame(r.ver_no(), chd.ver_no())) {
						msgL.add(new MCMessage(r, Chk01_DtlR.$gd_cd, MSBBL0131,
								toDispGUIIndex(r)));
					}
				}
			}
			return msgL;
		}

		/**
		 * 	明細・詳細相違チェック(出荷元期限)
		 * <p>明細の出荷元期限が入力されている場合に、詳細の出荷元期限と異なる場合</p>
		 * @return
		 */
		protected MCMessageList checkMatchDtlIoShipFrValidDt() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_DtlR> chkDtlL = getChkList(up1(), CREATE, MODIFY, NONE);
			for (Chk01_DtlR r : chkDtlL) {

				if (isNull(r.ship_fr_valid_dt())) {
					continue;
				}

				MCList<Chk01_IoR> chdL = _ioLMap.get(r.dtl_row_id()).subList(CREATE,
						MODIFY, NONE);
				for (Chk01_IoR chd : chdL) {
					if (!isSame(r.ship_fr_valid_dt(), chd.ship_fr_valid_dt())) {
						msgL.add(new MCMessage(r, Chk01_DtlR.$ship_fr_valid_dt, MSBBL0130,
								toDispGUIIndex(r)));
					}
				}
			}
			return msgL;
		}
		
		
		/**
		 * 	明細・詳細相違チェック(有効成分)
		 * <p>明細の有効成分が入力されている場合に、詳細の有効成分と異なる場合</p>
		 * @return エラーメッセージ
		 */
		protected MCMessageList checkMatchDtlIoContQty() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_DtlR> chkDtlL = getChkList(up1(), CREATE, MODIFY, NONE);
			MCNumber ioSumContQty = null;
			
			for (Chk01_DtlR dtlR : chkDtlL) {

				if (!dtlR.cont_fctr_flg() || !dtlR.sync_flg()) {
					continue;
				}
				
				ioSumContQty = MCNumber.ZERO;

				MCList<Chk01_IoR> chdL = _ioLMap.get(dtlR.dtl_row_id()).subList(CREATE, MODIFY, NONE);
				for (Chk01_IoR chd : chdL) {
					if (!isNull(chd.purc_cont_qty())) {
						ioSumContQty = ioSumContQty.add(chd.purc_cont_qty());
					}
				}
				
				if (!isSame(dtlR.purc_cont_qty(), ioSumContQty)) {
					msgL.add(new MCMessage(dtlR, Chk01_DtlR.$purc_cont_qty, MSBBL0258, 
							dtlR.purc_cont_qty(), ioSumContQty, toDispGUIIndex(dtlR)));
				}
			}
			return msgL;
		}
		
		/**
		 * ロットＮＯ、サブロットＮＯの条件付必須チェック
		 * <p>詳細が複数行ある場合は、明細ごとに1回エラーを返す</p>
		 * @return エラーメッセージ
		 */
		protected MCMessageList checkReqLotNo() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_DtlR> chkDtlL = getChkList(up1(), CREATE, MODIFY, NONE);
			for (Chk01_DtlR r : chkDtlL) {

				MCList<Chk01_IoR> chdL = _ioLMap.get(r.dtl_row_id())
												.subList(CREATE, MODIFY, NONE)
												.subList(rr -> rr.crt_lot_flg());
				boolean lotErrFlg = false;
				boolean sublotErrFlg = false;
				for (Chk01_IoR chd : chdL) {
					if (!MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ()) && MAC_LOT_NO_TYP.isMANUAL(r.lot_no_typ())) {
						// ロットＮＯ
						if (!lotErrFlg && isNull(chd.lot_no())) {
							msgL.add(FXUCL_ValidaterUtil.msgNoDataAtReq(r, Chk01_DtlR.$lot_no));
							lotErrFlg = true;
						}
					}
					if (!MAC_SUBLOT_MNG_TYP.isNOT_MNG(chd.sublot_mng_typ()) && MAC_LOT_NO_TYP.isMANUAL(r.sublot_no_typ())) {
						// サブロットＮＯ
						if (!sublotErrFlg && isNull(chd.sublot_no())) {
							msgL.add(FXUCL_ValidaterUtil.msgNoDataAtReq(r, Chk01_DtlR.$sublot_no));
							sublotErrFlg = true;
						}
					}
				}
			}
			return msgL;
		}
		/**
		 * 仕入実績受払売上可能数チェック
		 * @return 仕入実績受払売上可能数を超えた場合はtrue
		 */
		protected MCMessageList checkPurcSlsAblQty() {
			
			MCMessageList msgL = new MCMessageList();
			
			if (!isNull(_purcActL) && !_purcActL.isEmpty()) {
				
				MST_SLS_ACT_D_R bindR = MST_SLS_ACT_D_R.create();
				bindR.purc_act_no(MCStringUtil.arrayValueJoin(_purcActL.getStringNE(MST_PURC_ACT_R.$purc_act_no).toArray(new String[0])));
				bindR.sls_act_no(up0().sls_act_no());
				
				MCList<MST_PURC_ACT_IO_R> purcActIoL = MCList.create(MST_PURC_ACT_IO_R.class);
				executeQuery(purcActIoL, MSBBL1360_MST_PURC_ACT_IO_S02(), bindR);
				
				MCList<Chk01_DtlR> chkDtlL = getChkList(up1(), CREATE, MODIFY, NONE);
				
				MCList<Chk01_IoR> chkIoL = MCList.create(Chk01_IoR.class);
				
				for (Chk01_DtlR dtlR : chkDtlL) {

					// 仕入同時計上の場合は、チェック対象外とする
					if (dtlR.sync_flg()) {
						continue;
					}

					chkIoL.addAll(_ioLMap.get(dtlR.dtl_row_id()).subList(CREATE, MODIFY, NONE));
				}
				
				MCGroupByPolicy policy = new MCGroupByPolicy(Chk01_IoR.$purc_act_io_no);
				policy.sum(Chk01_IoR.$base_unit_qty);
				
				MCList<Chk01_IoR> chkGropIoL = chkIoL.groupBy(policy);
				
				MCIndexKey idxkey = purcActIoL.createIndex(MST_PURC_ACT_IO_R.$purc_act_io_no);
				for (Chk01_IoR ioR : chkGropIoL) {
					
					MST_PURC_ACT_IO_R purcActIoR = purcActIoL.getFirst(idxkey, ioR.purc_act_io_no());
					
					if (!isNull(purcActIoR) && !purcActIoR.isEmpty()) {
					
						if (ioR.base_unit_qty().gt(purcActIoR.base_unit_qty())) {
							
							msgL.add(new MCMessage(MSBBL0260, ioR.base_unit_qty(), purcActIoR.base_unit_qty(), ioR.purc_act_io_no()));
						}
					}
				}
				
				for (Chk01_IoR ioR : chkIoL) {
					
					MST_PURC_ACT_IO_R purcActIoR = purcActIoL.getFirst(idxkey, ioR.purc_act_io_no());
					
					if (!isNull(purcActIoR) && !purcActIoR.isEmpty()) {
					
						ioR.arr_act_no(purcActIoR.arr_act_no());
					}
				}
			}
			
			return msgL;
		}

		/**
		 * 	ロットＮＯ発番処理
		 */
		protected void setLotNo() {

			MCList<Chk01_DtlR> notErrL = getChkList(up1(), CREATE, MODIFY);
			// 明細のロットＮＯ・サブロットＮＯの発番対象の抽出
			for (Chk01_DtlR parDtl : notErrL) {

				// 詳細行のロットＮＯが既に設定されていて、異なるロットＮＯが存在する場合はロットＮＯを発番しない
				MCList<Chk01_IoR> chdIoL = _ioLMap.get(parDtl.dtl_row_id());

				// 入荷予定にロットＮＯが設定されている場合、そのロットＮＯを採用するのでロットＮＯを発番しない
				MST_ARR_SCHD_R arrSchd = parDtl.getJoinedRow(_asJk);
				if (!isNull(arrSchd) && !isNull(arrSchd.lot_no())) {
					parDtl.lot_no(arrSchd.lot_no());
					parDtl.sublot_no(nvl(arrSchd.sublot_no(), MAC_STR.NULL_VAL.value()));
					for (Chk01_IoR chdR : chdIoL) {
						chdR.lot_no(arrSchd.lot_no());
						chdR.sublot_no(nvl(arrSchd.sublot_no(), MAC_STR.NULL_VAL.value()));
					}
					continue;
				}

				// 明細のロットＮＯ発番
				if (isCrtLotNo(parDtl) && chdIoL.size() == 1) {

					// ロット発番して明細、詳細に設定する
					ElmArgsR lotArgs = getLotElmArgs(parDtl, null, MAC_NUM_BIZ_TYP.LOT);
					String lotNo = getNum(MAC_NUM_BIZ_TYP.LOT, lotArgs);
					parDtl.lot_no(lotNo);
				}
				
				// 明細のサブロットＮＯ
				if (isCrtSubLotNo(parDtl) && chdIoL.size() == 1) {

					// サブロット発番して明細、詳細に設定する
					ElmArgsR subLotArgs = getSubLotElmArgs(parDtl, null, MAC_NUM_BIZ_TYP.SUBLOT);
					String subLotNo = getNum(MAC_NUM_BIZ_TYP.SUBLOT, subLotArgs);
					parDtl.sublot_no(nvl(subLotNo, MAC_STR.NULL_VAL.value()));
				}
				else if (!isNull(parDtl.lot_no()) && isNull(parDtl.sublot_no())) {
					if (chdIoL.groupByNE(Chk01_IoR.$sublot_no).count(Chk01_IoR.$sublot_no) == 1) {
						parDtl.sublot_no(MAC_STR.NULL_VAL.value());
					}
				}
				
				for (Chk01_IoR chdR : chdIoL) {
					
					// 受払のロットＮＯ発番
					if (isNull(parDtl.lot_no()) && isCrtLotNo(parDtl, chdR))  {
						
						ElmArgsR lotArgs = getLotElmArgs(parDtl, chdR, MAC_NUM_BIZ_TYP.LOT);
						chdR.lot_no(getNum(MAC_NUM_BIZ_TYP.LOT, lotArgs));	
					}
					else if (!isNull(parDtl.lot_no()) && isNull(chdR.lot_no())) {
						chdR.lot_no(parDtl.lot_no());
					}
					
					// 受払のサブロットＮＯ
					if (isNull(parDtl.lot_no()) && isCrtSubLotNo(parDtl, chdR))  {
						
						ElmArgsR subLotArgs = getSubLotElmArgs(parDtl, chdR, MAC_NUM_BIZ_TYP.SUBLOT);
						String subLotNo = getNum(MAC_NUM_BIZ_TYP.SUBLOT, subLotArgs);
						chdR.sublot_no(nvl(subLotNo, MAC_STR.NULL_VAL.value()));
					}
					else if (!isNull(parDtl.sublot_no()) && isNull(chdR.sublot_no())) {
						chdR.sublot_no(parDtl.sublot_no());
					}
					else if (!isNull(chdR.lot_no()) && isNull(chdR.sublot_no())) {
						chdR.sublot_no(MAC_STR.NULL_VAL.value());
					}
				}
			}
		}
		
		/**
		 * [ロット管理区分：ロット管理しない]以外の場合、かつ、<br>
		 * [ロットＮＯ発番区分：手動]以外の場合、かつ、<br>
		 * ロット作成ＦＬＧがTrueの場合、ロットＮＯの発番対象とする。
		 * @param dtlR 明細行
		 * @return 発番する場合はtrue
		 */
		protected boolean isCrtLotNo(Chk01_DtlR dtlR) {

			return !MAC_LOT_MNG_TYP.isNOT_MNG(dtlR.lot_mng_typ())
					&& !MAC_LOT_NO_TYP.isMANUAL(dtlR.lot_no_typ())
					&& dtlR.crt_lot_flg()
					&& isNull(dtlR.lot_no());
		}
		
		/**
		 * [サブロット管理区分：ロット管理しない]以外の場合、かつ、<br>
		 * [サブロットＮＯ発番区分：手動]以外の場合、かつ、<br>
		 * ロット作成ＦＬＧがTrueの場合、サブロットＮＯの発番対象とする。
		 * @param dtlR 明細行
		 * @return 発番する場合はtrue
		 */
		protected boolean isCrtSubLotNo(Chk01_DtlR dtlR) {

			return 	!MAC_SUBLOT_MNG_TYP.isNOT_MNG(dtlR.sublot_mng_typ())
					&& !MAC_LOT_NO_TYP.isMANUAL(dtlR.sublot_no_typ())
					&& dtlR.crt_lot_flg()
					&& isNull(dtlR.sublot_no());
		}
		
		/**
		 * [ロット管理区分：ロット管理しない]以外の場合、かつ、<br>
		 * [ロットＮＯ発番区分：手動]以外の場合、かつ、<br>
		 * ロット作成ＦＬＧがTrueの場合、ロットＮＯの発番対象とする。
		 * @param dtlR 明細行
		 * @param ioR 受払行
		 * @return 発番する場合はtrue
		 */
		protected boolean isCrtLotNo(Chk01_DtlR dtlR, Chk01_IoR ioR) {

			return !MAC_LOT_MNG_TYP.isNOT_MNG(dtlR.lot_mng_typ())
					&& !MAC_LOT_NO_TYP.isMANUAL(dtlR.lot_no_typ())
					&& ioR.crt_lot_flg()
					&& isNull(ioR.lot_no());
		}
		
		/**
		 * [サブロット管理区分：ロット管理しない]以外の場合、かつ、<br>
		 * [サブロットＮＯ発番区分：手動]以外の場合、かつ、<br>
		 * ロット作成ＦＬＧがTrue または  [サブロット管理区分：在庫のみサブロット管理する]の場合、サブロットＮＯの発番対象とする。
		 * @param dtlR 明細行
		 * @param ioR 受払行
		 * @return 発番する場合はtrue
		 */
		protected boolean isCrtSubLotNo(Chk01_DtlR dtlR, Chk01_IoR ioR) {

			return 	!MAC_SUBLOT_MNG_TYP.isNOT_MNG(dtlR.sublot_mng_typ())
					&& !MAC_LOT_NO_TYP.isMANUAL(dtlR.sublot_no_typ())
					&& (ioR.crt_lot_flg() || MAC_SUBLOT_MNG_TYP.isSTK(dtlR.sublot_mng_typ()))
					&& isNull(ioR.sublot_no());
		}

		/**
		 * ロットＮＯの発番要素を取得する
		 * 
		 * @param dtlR 売上明細
		 * @param ioR 売上明細受払
		 * @param numBizTyp 発番業務区分 
		 * @return 発番要素
		 */
		protected ElmArgsR getLotElmArgs(Chk01_DtlR dtlR, Chk01_IoR ioR, MAC_NUM_BIZ_TYP numBizTyp) {

			// 発注情報
			MST_PO_R poR = dtlR.getJoinedRow(_poJk);
			// 入荷予定情報
			MST_ARR_SCHD_R arrSchdR = dtlR.getJoinedRow(_asJk);
			
			// 発番要素の設定
			ElmArgsR arg = ElmArgsR.create();
			arg.co_cd(getCo().co_cd());
			arg.num_ptn_cd(dtlR.lot_no_ptn_cd());
			arg.bp_cd(poR.sppl_cd());
			arg.itm_cd(dtlR.itm_cd());
			arg.itm_sub1(dtlR.itm_sub1());
			arg.itm_sub2(dtlR.itm_sub2());
			arg.itm_sub3(dtlR.itm_sub3());
			arg.loc_cd(arrSchdR.arr_loc_cd());
			arg.wg_cd(getLocR(arrSchdR.arr_loc_cd()).wg_cd());
			arg.site_cd(getLocR(arrSchdR.arr_loc_cd()).site_cd());
			arg.dt(up0().sls_dt());
			arg.bp_lot_no(isNull(ioR) ? dtlR.bp_lot_no() : nvl(ioR.bp_lot_no(), dtlR.bp_lot_no()));
			arg.sno1(dtlR.sno1());
			arg.sno2(dtlR.sno2());
			arg.sno3(dtlR.sno3());
			arg.sno4(dtlR.sno4());

			return arg;
		}

		/**
		 * サブロットＮＯの発番要素を取得する
		 * 
		 * @param dtlR 売上明細
		 * @param ioR 売上明細受払
		 * @param numBizTyp 発番業務区分 
		 * @param lotNo ロットＮＯ
		 * @return 発番要素
		 */
		protected ElmArgsR getSubLotElmArgs(Chk01_DtlR dtlR, Chk01_IoR ioR, MAC_NUM_BIZ_TYP numBizTyp) {

			// 入荷予定情報
			MST_ARR_SCHD_R arrSchdR = dtlR.getJoinedRow(_asJk);
			
			// 発番要素の設定
			ElmArgsR arg = ElmArgsR.create();
			arg.co_cd(getCo().co_cd());
			arg.num_ptn_cd(dtlR.sublot_no_ptn_cd());
			arg.itm_cd(dtlR.itm_cd());
			arg.itm_sub1(dtlR.itm_sub1());
			arg.itm_sub2(dtlR.itm_sub2());
			arg.itm_sub3(dtlR.itm_sub3());
			arg.loc_cd(arrSchdR.arr_loc_cd());
			arg.wg_cd(getLocR(arrSchdR.arr_loc_cd()).wg_cd());
			arg.site_cd(getLocR(arrSchdR.arr_loc_cd()).site_cd());
			arg.dt(up0().sls_dt());
			arg.bp_lot_no(isNull(ioR) ? dtlR.bp_lot_no() : nvl(ioR.bp_lot_no(), dtlR.bp_lot_no()));
			arg.sno1(dtlR.sno1());
			arg.sno2(dtlR.sno2());
			arg.sno3(dtlR.sno3());
			arg.sno4(dtlR.sno4());
			arg.lot_no(isNull(ioR) ? dtlR.lot_no() : nvl(ioR.lot_no(), dtlR.lot_no()));

			return arg;
		}

		/**
		 * 	仕入実績登録チェックサービスの呼出
		 */
		protected void callPurcActRegSvChk03() {

			MSBDL_PurcActRegService.Purc_Chk03 ope = MSBDL_PurcActRegService
					.crtPurc_Chk03();

			Purc_Chk03_HdrR oUp0;
			Purc_Chk03_DtlR oUp1;

			// メモ：	 仕入実績登録サービスは本画面で売上と仕入を同時計上したレコードのみが呼出対象となる
			// 		すなわち、先に仕入実績登録された場合は呼び出さない。
			//		同時計上か否かは、売上実績明細の同時計上ＦＬＧで判定する
			//		売上実績明細の同時計上ＦＬＧは、オンもしくはオフでユニークの前提（オン・オフ混在は許可しない）
			//		仕入実績登録サービスは、明細単位のまとまりで呼び出す
			// 		つまり１明細に対して仕入実績登録サービスのヘッダ：１、明細：１、詳細：Ｎ　となる
			for (Chk01_DtlR parDtl : up1()) {

				MCList<Chk01_IoR> chdIoL = _ioLMap.get(parDtl.dtl_row_id());

				if (parDtl.sync_flg()) {

					oUp0 = ope.up0().createRow();
					oUp1 = ope.up1().createRow();
					MST_PO_R po = parDtl.getJoinedRow(_poJk);
					MST_PO_D_R poD = parDtl.getJoinedRow(_poDJk);
					MST_ARR_SCHD_R arrSchd = parDtl.getJoinedRow(_asJk);
					MST_PURC_ACT_R purcAct = parDtl.getJoinedRow(_paJk);
					MST_PURC_ACT_D_R purcActD = parDtl.getJoinedRow(_paDJk);

					copy(oUp0, up0(), createMap_Purc_Chk03_HdrR_Chk01_HdrR(po, purcAct, arrSchd));
					oUp0.xrate(parDtl.purc_xrate());
					oUp0.ptax_xrate(parDtl.purc_ptax_xrate());
					oUp0.ptax_dt(parDtl.ptax_dt());
					
					oUp0.peg_no(parDtl.peg_no());
					copy(oUp1, parDtl, createMap_Purc_Chk03_DtlR_Chk01_DtlR(poD, arrSchd, purcActD));
					oUp0.data_crud_typ(oUp1.data_crud_typ());
					ope.up0().add(oUp0);
					ope.up1().add(oUp1);
					addAll(ope.up2(), chdIoL, createMap_Purc_Chk03_IoR_Chk01_IoR(parDtl, arrSchd));
				}
			}

			if (!ope.up0().isEmpty()) {

				// 組織変更対応
				// 購買部門
				MAUCL_DptUtil.setDpt(ope.up0(), Purc_Chk03_HdrR.$purc_dpt_cd, null, Purc_Chk03_HdrR.$ac_dt, true);
				if (ope.up0().subList("err_flg", true).size() > 0) {
					throwDptErr();
				}
				
				ope.up1().addDateColumn(Chk01_HdrR.$ac_dt);
				ope.up1().setDateNE(Chk01_HdrR.$ac_dt, ope.up0().get(0).ac_dt());
				// 債務部門
				MAUCL_DptUtil.setDpt(ope.up1(), Purc_Chk03_DtlR.$ap_dpt_cd, null, Chk01_HdrR.$ac_dt, true);
				if (ope.up1().subList("err_flg", true).size() > 0) {
					throwDptErr();
				}
				
				// 負担部門
				MAUCL_DptUtil.setDpt(ope.up1(), Purc_Chk03_DtlR.$bd_dpt_cd, null, Chk01_HdrR.$ac_dt, true);
				if (ope.up1().subList("err_flg", true).size() > 0) {
					throwDptErr();
				}
				
				ope.up3().crt_param_cache_flg(true);
				ope.up3().purc_ddlv_reg_exec_flg(true);
				ope.exec();

				copyErrFlg(up0(), ope.down0().get(0));
				copyErrFlg(up1(), ope.down1());
				copyErrFlg(up2(), ope.down2());
			}
		}

		/**
		 * 	RowMapper<br>
		 * 	上り電文(Chk01_HdrR) -> 仕入実績サービス.上り電文(Purc_Chk03_HdrR)
		 * @return
		 */
		protected Map_Purc_Chk03_HdrR_Chk01_HdrR<Purc_Chk03_HdrR, Chk01_HdrR> createMap_Purc_Chk03_HdrR_Chk01_HdrR(
				MST_PO_R po, MST_PURC_ACT_R purcAct, MST_ARR_SCHD_R arrSchd) {
			return new Map_Purc_Chk03_HdrR_Chk01_HdrR<Purc_Chk03_HdrR, Chk01_HdrR>(po,
					purcAct, arrSchd);
		}

		public class Map_Purc_Chk03_HdrR_Chk01_HdrR<D extends Purc_Chk03_HdrR, S extends Chk01_HdrR>
				extends MCRowMapper<D, S> {

			MST_PO_R _po;

			MST_PURC_ACT_R _purcAct;

			MST_ARR_SCHD_R _arrSchd;

			public Map_Purc_Chk03_HdrR_Chk01_HdrR(MST_PO_R po, MST_PURC_ACT_R purcAct,
					MST_ARR_SCHD_R arrSchd) {
				_po = po;
				_purcAct = purcAct;
				_arrSchd = arrSchd;
			}

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Chk03_HdrR.$peg_no, Chk01_HdrR.$peg_no);
				addColumnPathMap(Purc_Chk03_HdrR.$purc_dt, Chk01_HdrR.$sls_dt);
				addColumnPathMap(Purc_Chk03_HdrR.$ac_dt, Chk01_HdrR.$ac_dt);
				addColumnPathMap(Purc_Chk03_HdrR.$can_ac_dt, Chk01_HdrR.$can_ac_dt);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				if (src.isStatusCreate()) {
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else {
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
				if (!isNull(_purcAct)) {
					dest.purc_act_no(_purcAct.purc_act_no());
					dest.purc_act_seq(_purcAct.purc_act_seq());
					dest.rcpt_iv_mng_no(_purcAct.rcpt_iv_mng_no());
					dest.rcpt_iv_no(_purcAct.rcpt_iv_no());
					dest.rcpt_iv_rev(_purcAct.rcpt_iv_rev());
				}

				dest.trd_cd(_po.trd_cd());
				dest.trd_ptn_typ(_po.trd_ptn_typ());
				dest.po_no(_po.po_no());
				dest.purc_dpt_cd(_po.purc_dpt_cd());
				dest.purc_usr_cd(_po.purc_usr_cd());
				dest.wg_cd(_po.wg_cd());
				dest.sppl_cd(_po.sppl_cd());
				dest.subcon_flg(_po.getBooleanNE(MAM_BP_R.$subcon_flg));
				dest.trd_cur_cd(_po.trd_cur_cd());
				dest.trd_rmrks(_po.trd_rmrks());
				dest.tterm_cd1(_po.tterm_cd1());
				dest.tterm_rmrks1(_po.tterm_rmrks1());
				dest.tterm_cd2(_po.tterm_cd2());
				dest.tterm_rmrks2(_po.tterm_rmrks2());
				dest.tterm_cd3(_po.tterm_cd3());
				dest.tterm_rmrks3(_po.tterm_rmrks3());
				if (_po.getBooleanNE(MAM_BP_R.$sppl_iv_flg)
						&& _po.getBooleanNE(MAM_BP_R.$pay_spot_flg)) {
					dest.pay_schd_dt(_arrSchd.getDateNE(MST_RCPT_IV_R.$pay_schd_dt));
				}
				else if (_po.getBooleanNE(MAM_BP_R.$sppl_iv_flg)) {
					dest.pay_basis_dt(_arrSchd.getDateNE(MST_RCPT_IV_R.$pay_basis_dt));
				}
				else {
					dest.pay_basis_dt(src.sls_dt());
				}

			}
		}

		/**
		 * 	RowMapper<br>
		 * 	上り電文(Chk01_DtlR) -> 仕入実績サービス.上り電文(Purc_Chk03_DtlR)
		 * @return
		 */
		protected Map_Purc_Chk03_DtlR_Chk01_DtlR<Purc_Chk03_DtlR, Chk01_DtlR> createMap_Purc_Chk03_DtlR_Chk01_DtlR(
				MST_PO_D_R poD, MST_ARR_SCHD_R arrSchd, MST_PURC_ACT_D_R purcActD) {
			return new Map_Purc_Chk03_DtlR_Chk01_DtlR<Purc_Chk03_DtlR, Chk01_DtlR>(poD,
					arrSchd, purcActD);
		}

		public class Map_Purc_Chk03_DtlR_Chk01_DtlR<D extends Purc_Chk03_DtlR, S extends Chk01_DtlR>
				extends MCRowMapper<D, S> {

			MST_ARR_SCHD_R _arrSchd;

			MST_PO_D_R _poD;
			MST_PURC_ACT_D_R _purcActD;

			public Map_Purc_Chk03_DtlR_Chk01_DtlR(MST_PO_D_R poD, MST_ARR_SCHD_R arrSchd, MST_PURC_ACT_D_R purcActD) {
				_arrSchd = arrSchd;
				_poD = poD;
				_purcActD = purcActD;
			}

			@Override
			protected void setupColumnPathMap() {

				addColumnPathMap(Purc_Chk03_DtlR.$hdr_peg_no, Chk01_DtlR.$peg_no);
				addColumnPathMap(Purc_Chk03_DtlR.$peg_no, Chk01_DtlR.$peg_no);
				addColumnPathMap(Purc_Chk03_DtlR.$purc_act_d_no, Chk01_DtlR.$purc_act_d_no);
				addColumnPathMap(Purc_Chk03_DtlR.$purc_act_d_seq, Chk01_DtlR.$purc_act_d_seq);
				addColumnPathMap(Purc_Chk03_DtlR.$purc_act_no, Chk01_DtlR.$purc_act_no);
				addColumnPathMap(Purc_Chk03_DtlR.$purc_act_seq, Chk01_DtlR.$purc_act_seq);
				addColumnPathMap(Purc_Chk03_DtlR.$po_d_no, Chk01_DtlR.$po_d_no);
				addColumnPathMap(Purc_Chk03_DtlR.$purc_schd_no, Chk01_DtlR.$purc_schd_no);
				addColumnPathMap(Purc_Chk03_DtlR.$arr_schd_no, Chk01_DtlR.$arr_schd_no);
				addColumnPathMap(Purc_Chk03_DtlR.$itm_cd, Chk01_DtlR.$itm_cd);
				addColumnPathMap(Purc_Chk03_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub1);
				addColumnPathMap(Purc_Chk03_DtlR.$itm_sub2, Chk01_DtlR.$itm_sub2);
				addColumnPathMap(Purc_Chk03_DtlR.$itm_sub3, Chk01_DtlR.$itm_sub3);
				addColumnPathMap(Purc_Chk03_DtlR.$ver_no, Chk01_DtlR.$ver_no);
				addColumnPathMap(Purc_Chk03_DtlR.$itm_nm, Chk01_DtlR.$itm_nm);
				addColumnPathMap(Purc_Chk03_DtlR.$trd_unit_cd, Chk01_DtlR.$trd_unit_cd);
				addColumnPathMap(Purc_Chk03_DtlR.$trd_unit_qty, Chk01_DtlR.$trd_unit_qty);
				addColumnPathMap(Purc_Chk03_DtlR.$base_unit_cd, Chk01_DtlR.$base_unit_cd);
				addColumnPathMap(Purc_Chk03_DtlR.$base_unit_qty, Chk01_DtlR.$base_unit_qty);
				addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_upri, Chk01_DtlR.$purc_trd_cur_upri);
				addColumnPathMap(Purc_Chk03_DtlR.$dscnt_rsn_cd, Chk01_DtlR.$purc_dscnt_rsn_cd);
				addColumnPathMap(Purc_Chk03_DtlR.$tax_cd, Chk01_DtlR.$purc_tax_cd);
				addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_dscnt_amt, Chk01_DtlR.$purc_trd_cur_dscnt_amt);
				addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_amt, Chk01_DtlR.$purc_trd_cur_amt);
				addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_tax_amt, Chk01_DtlR.$purc_trd_cur_tax_amt);
				addColumnPathMap(Purc_Chk03_DtlR.$upri_not_tgt_flg, Chk01_DtlR.$purc_upri_not_tgt_flg);
				addColumnPathMap(Purc_Chk03_DtlR.$interim_flg, Chk01_DtlR.$purc_interim_flg);
				addColumnPathMap(Purc_Chk03_DtlR.$base_cur_upri, Chk01_DtlR.$purc_base_cur_upri);
				addColumnPathMap(Purc_Chk03_DtlR.$base_cur_dscnt_amt, Chk01_DtlR.$purc_base_cur_dscnt_amt);
				addColumnPathMap(Purc_Chk03_DtlR.$base_cur_amt, Chk01_DtlR.$purc_base_cur_amt);
				addColumnPathMap(Purc_Chk03_DtlR.$ptax_cur_upri, Chk01_DtlR.$purc_ptax_cur_upri);
				addColumnPathMap(Purc_Chk03_DtlR.$ptax_cur_dscnt_amt, Chk01_DtlR.$purc_ptax_cur_dscnt_amt);
				addColumnPathMap(Purc_Chk03_DtlR.$ptax_cur_amt, Chk01_DtlR.$purc_ptax_cur_amt);
				addColumnPathMap(Purc_Chk03_DtlR.$wtax_rate, Chk01_DtlR.$purc_wtax_rate);
				addColumnPathMap(Purc_Chk03_DtlR.$wtax_amt, Chk01_DtlR.$purc_wtax_amt);
				addColumnPathMap(Purc_Chk03_DtlR.$abort_flg, Chk01_DtlR.$abort_flg);
				addColumnPathMap(Purc_Chk03_DtlR.$stk_mng_typ, Chk01_DtlR.$stk_mng_typ);
				addColumnPathMap(Purc_Chk03_DtlR.$asset_mng_typ, Chk01_DtlR.$asset_mng_typ);
				addColumnPathMap(Purc_Chk03_DtlR.$rsn_cd, Chk01_DtlR.$purc_rsn_cd);
				addColumnPathMap(Purc_Chk03_DtlR.$xpns_po_flg, Chk01_DtlR.$xpns_purc_flg);
				addColumnPathMap(Purc_Chk03_DtlR.$purc_cont_qty, Chk01_DtlR.$purc_cont_qty);
				addColumnPathMap(Purc_Chk03_DtlR.$gd_cd, Chk01_DtlR.$gd_cd);
				addColumnPathMap(Purc_Chk03_DtlR.$sno1, Chk01_DtlR.$sno1);
				addColumnPathMap(Purc_Chk03_DtlR.$sno2, Chk01_DtlR.$sno2);
				addColumnPathMap(Purc_Chk03_DtlR.$sno3, Chk01_DtlR.$sno3);
				addColumnPathMap(Purc_Chk03_DtlR.$sno4, Chk01_DtlR.$sno4);
				addColumnPathMap(Purc_Chk03_DtlR.$lot_no, Chk01_DtlR.$lot_no);
				addColumnPathMap(Purc_Chk03_DtlR.$sublot_no, Chk01_DtlR.$sublot_no);
				addColumnPathMap(Purc_Chk03_DtlR.$bp_lot_no, Chk01_DtlR.$bp_lot_no);
				addColumnPathMap(Purc_Chk03_DtlR.$bp_dlv_slip_no, Chk01_DtlR.$bp_dlv_slip_no);
				addColumnPathMap(Purc_Chk03_DtlR.$bp_dlv_slip_d_no, Chk01_DtlR.$bp_dlv_slip_d_no);
				addColumnPathMap(Purc_Chk03_DtlR.$disp_seq, Chk01_DtlR.$disp_seq);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				if (src.isStatusCreate()) {
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else if (src.isStatusDelete()) {
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				else {
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
				dest.sppl_itm_cd(_poD.sppl_itm_cd());
				dest.sppl_itm_nm(_poD.sppl_itm_nm());
				dest.sundry_itm_flg(_poD.sundry_itm_flg());
				dest.maker_cd(_poD.maker_cd());
				dest.ap_dpt_cd(_poD.ap_dpt_cd());
				dest.pay_crryovr_times(_poD.pay_crryovr_times());
				dest.bd_itm_cd(_poD.bd_itm_cd());
				dest.bd_itm_sub1(_poD.bd_itm_sub1());
				dest.bd_itm_sub2(_poD.bd_itm_sub2());
				dest.bd_itm_sub3(_poD.bd_itm_sub3());
				dest.bd_sno1(_poD.bd_sno1());
				dest.bd_sno2(_poD.bd_sno2());
				dest.bd_sno3(_poD.bd_sno3());
				dest.bd_sno4(_poD.bd_sno4());
				dest.bd_lot_no(_poD.bd_lot_no());
				dest.bd_sublot_no(_poD.bd_sublot_no());
				dest.bd_ctg_cd(_poD.bd_ctg_cd());
				dest.bd_oper_cd(_poD.bd_oper_cd());
				dest.bd_iv_no(_poD.bd_iv_no());
				dest.bd_loc_cd(_poD.bd_loc_cd());
				dest.bd_po_no(_poD.bd_po_no());
				dest.bd_slo_no(_poD.bd_slo_no());
				dest.bd_dpt_cd(_poD.bd_dpt_cd());
				dest.trd_d_rmrks(_poD.trd_d_rmrks());
				dest.trd_cur_proc_upri(
						isNull(_purcActD) ? _poD.trd_cur_proc_upri() : _purcActD.trd_cur_proc_upri());
				dest.trd_cur_onr_prov_upri(
						isNull(_purcActD) ? _poD.trd_cur_onr_prov_upri() : _purcActD.trd_cur_onr_prov_upri());
				dest.trd_cur_proc_amt(
						isNull(_purcActD) ? _poD.trd_cur_proc_amt() : _purcActD.trd_cur_proc_amt());
				dest.trd_cur_onr_prov_amt(
						isNull(_purcActD) ? _poD.trd_cur_onr_prov_amt() : _purcActD.trd_cur_onr_prov_amt());
				dest.base_cur_tax_amt(
						isNullOrNullVal(_poD.mfg_loc_cd()) ? src.purc_base_cur_tax_amt() : null);
				dest.ptax_cur_tax_amt(
						isNullOrNullVal(_poD.mfg_loc_cd()) ? src.purc_ptax_cur_tax_amt() : null);
				dest.mfg_inst_no(_arrSchd.mfg_inst_no());
				dest.dlv_loc_cd(_arrSchd.arr_loc_cd());
				dest.str_ln_cd(_arrSchd.str_ln_cd());
				dest.quality_typ(_arrSchd.quality_typ());
				dest.stk_insp_typ(_arrSchd.stk_insp_typ());
				dest.stk_id_typ(_arrSchd.stk_id_typ());
				dest.stk_bp_cd(_arrSchd.stk_bp_cd());
				if (!isNull(_purcActD) && !_purcActD.isEmpty()) {
					dest.rcpt_iv_d_no(_purcActD.rcpt_iv_d_no());
					dest.iv_itm_nm(_purcActD.iv_itm_nm());
				}
				dest.purc_id_typ(MAC_PURC_ID_TYP.PURC.value());
			}
		}

		/**
		 * 	RowMapper<br>
		 * 	上り電文(Chk01_IoR) -> 仕入実績サービス.上り電文(Purc_Chk03_IoR)
		 * @param parDtl
		 * @param arrSchd
		 * @return
		 */
		protected Map_Purc_Chk03_IoR_Chk01_IoR<Purc_Chk03_IoR, Chk01_IoR> createMap_Purc_Chk03_IoR_Chk01_IoR(
				Chk01_DtlR parDtl, MST_ARR_SCHD_R arrSchd) {
			return new Map_Purc_Chk03_IoR_Chk01_IoR<Purc_Chk03_IoR, Chk01_IoR>(parDtl,
					arrSchd);
		}

		public class Map_Purc_Chk03_IoR_Chk01_IoR<D extends Purc_Chk03_IoR, S extends Chk01_IoR>
				extends MCRowMapper<D, S> {

			MST_ARR_SCHD_R _arrSchd;

			Chk01_DtlR _parDtl;

			public Map_Purc_Chk03_IoR_Chk01_IoR(Chk01_DtlR parDtl, MST_ARR_SCHD_R arrSchd) {

				_parDtl = parDtl;
				_arrSchd = arrSchd;

			}

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Chk03_IoR.$dtl_peg_no, Chk01_IoR.$dtl_peg_no);
				addColumnPathMap(Purc_Chk03_IoR.$peg_no, Chk01_IoR.$peg_no);
				addColumnPathMap(Purc_Chk03_IoR.$err_flg, Chk01_IoR.$err_flg);
				addColumnPathMap(Purc_Chk03_IoR.$purc_act_io_no, Chk01_IoR.$purc_act_io_no);
				addColumnPathMap(Purc_Chk03_IoR.$purc_act_io_seq, Chk01_IoR.$purc_act_io_seq);
				addColumnPathMap(Purc_Chk03_IoR.$trd_unit_cd, Chk01_IoR.$trd_unit_cd);
				addColumnPathMap(Purc_Chk03_IoR.$trd_unit_qty, Chk01_IoR.$trd_unit_qty);
				addColumnPathMap(Purc_Chk03_IoR.$base_unit_cd, Chk01_IoR.$base_unit_cd);
				addColumnPathMap(Purc_Chk03_IoR.$base_unit_qty, Chk01_IoR.$base_unit_qty);
				addColumnPathMap(Purc_Chk03_IoR.$purc_cont_qty, Chk01_IoR.$purc_cont_qty);
				addColumnPathMap(Purc_Chk03_IoR.$ver_no, Chk01_IoR.$ver_no);
				addColumnPathMap(Purc_Chk03_IoR.$gd_cd, Chk01_IoR.$gd_cd);
				addColumnPathMap(Purc_Chk03_IoR.$crt_lot_flg, Chk01_IoR.$crt_lot_flg);
				addColumnPathMap(Purc_Chk03_IoR.$lot_no, Chk01_IoR.$lot_no);
				addColumnPathMap(Purc_Chk03_IoR.$sublot_no, Chk01_IoR.$sublot_no);
				addColumnPathMap(Purc_Chk03_IoR.$bp_dlv_slip_no, Chk01_IoR.$bp_dlv_slip_no);
				addColumnPathMap(Purc_Chk03_IoR.$bp_dlv_slip_d_no, Chk01_IoR.$bp_dlv_slip_d_no);
				addColumnPathMap(Purc_Chk03_IoR.$bp_lot_no, Chk01_IoR.$bp_lot_no);
				addColumnPathMap(Purc_Chk03_IoR.$ship_fr_valid_dt, Chk01_IoR.$ship_fr_valid_dt);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if (src.isStatusCreate()) {
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else if (src.isStatusModify() || src.isStatusNone()) {
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
				else {
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				dest.purc_act_d_no(_parDtl.purc_act_d_no());
				dest.purc_act_d_seq(_parDtl.purc_act_d_seq());
				dest.dlv_loc_cd(_arrSchd.arr_loc_cd());
				dest.str_ln_cd(_arrSchd.str_ln_cd());
				dest.quality_typ(_arrSchd.quality_typ());
				dest.stk_insp_typ(_arrSchd.stk_insp_typ());
				dest.stk_id_typ(_arrSchd.stk_id_typ());
				dest.stk_bp_cd(_arrSchd.stk_bp_cd());

				if (src.pack_flg()) {
					dest.pack_unit_cd(src.trd_unit_cd());
					dest.pack_unit_qty(src.trd_unit_qty());
				}
				else {
					dest.pack_unit_cd(src.base_unit_cd());
					dest.pack_unit_qty(src.base_unit_qty());
				}
				dest.gi_loc_cd(src.loc_cd());
				dest.gi_str_ln_cd(src.str_ln_cd());
				dest.gi_wg_cd(getLocR(src.loc_cd()).wg_cd());
				dest.gi_unit_cd(dest.pack_unit_cd());
				dest.from_gd_cd(src.gd_cd());
				dest.dlv_loc_wg_cd(getLocR(_arrSchd.arr_loc_cd()).wg_cd());
			}
		}

		/**
		 * 	与信更新金額の算出
		 */
		protected void calcCredUpdAmt() {

			// 共通ユーティリティを用いて受注金額をベースに与信更新額を算出
			MSUCL_ConvQtyAmtUtil.ConvQtyAmtUtil_Calc02 ope = MSUCL_ConvQtyAmtUtil
					.crtConvQtyAmtUtil_Calc02();

			MCList<Chk01_DtlR> syncDtlL = up1().subList(r->!isNull(r.slo_d_no()) && !isNull(r.purc_schd_no()) && r.sync_flg());
			if (!syncDtlL.isEmpty()) {
				for (MCList<Chk01_DtlR> lst : syncDtlL.groupList(Chk01_DtlR.$purc_schd_no)) {
					
					MST_SLS_SCHD_R slsSchdR = _purcSchdGrpSlsSchdL.getFirst(_purcSchdGrpSlsIdxKey, lst.get(0).purc_schd_no());
					
					MCNumber slsSchdQty = MCNumber.max(lst.sum(Chk01_DtlR.$base_unit_qty), slsSchdR.base_unit_qty());
					MCNumber cmplQty = slsSchdR.base_unit_sls_qty();
					MCNumber baseUnitQty = MCNumber.ZERO;
					MCNumber oldBaseUnitQty = MCNumber.ZERO;
					
					for (Chk01_DtlR r : lst) {
						baseUnitQty = baseUnitQty.add(r.isStatusDelete() ? MCNumber.ZERO : r.base_unit_qty());
						
						if (_slsActJk != null) {
							
							MST_SLS_ACT_D_R slsActDR = r.getJoinedRow(_slsActJk);
							if (!r.isStatusCreate() && isNull(slsActDR)){
								continue;
							}
							oldBaseUnitQty = oldBaseUnitQty.add(r.isStatusCreate() ? MCNumber.ZERO : slsActDR.base_unit_qty());
						}
					}
					
					MCNumber credQty = calcCredRetQty(slsSchdQty, cmplQty, baseUnitQty, oldBaseUnitQty, false);
					if (credQty.isZero()) {
						lst.setValueNE(Chk01_DtlR.$cred_upd_amt, MCNumber.ZERO);
						continue;
					}
					
					MST_SLO_D_R sloDR = lst.get(0).getJoinedRow(_sloDJk);
					ConvQtyAmtUtil_Calc01_HdrR opeUp0 = ope.up0().createRow();
					copy(opeUp0, lst.get(0), createMap_ConvQtyAmtUtil_Calc01_HdrR_Chk01_DtlR(up0(), _slo, sloDR));
					ope.up0().add(opeUp0);
					
					ConvQtyAmtUtil_Calc01_Dtl1R opeUp1 = ope.up1().createRow();
					
					copy(opeUp1, lst.get(0), createMap_ConvQtyAmtUtil_Calc01_Dtl1R_Chk01_DtlR());
					
					opeUp1.trd_unit_qty(credQty);
					
					ope.up1().add(opeUp1);
				}
			}
			
			MCList<Chk01_DtlR> purcActDtlL = up1().subList(r->!isNull(r.slo_d_no()) && !isNull(r.purc_act_d_no()) && !r.sync_flg());
			if (!purcActDtlL.isEmpty()) {
				for (MCList<Chk01_DtlR> lst : purcActDtlL.groupList(Chk01_DtlR.$purc_act_d_no)) {
					
					MST_SLS_SCHD_R slsSchdR = _purcActGrpSlsSchdL.getFirst(_purcActIdxKey, lst.get(0).purc_act_d_no());
					
					MCNumber slsSchdQty = slsSchdR.base_unit_qty();
					MCNumber cmplQty = sum(slsSchdR.base_unit_abort_qty(), slsSchdR.base_unit_sls_qty());
					MCNumber baseUnitQty = MCNumber.ZERO;
					MCNumber oldBaseUnitQty = MCNumber.ZERO;
					
					for (Chk01_DtlR r : lst) {
						baseUnitQty = baseUnitQty.add(r.isStatusDelete() ? MCNumber.ZERO : r.base_unit_qty());
						
						if (_slsActJk != null) {
							
							MST_SLS_ACT_D_R slsActDR = r.getJoinedRow(_slsActJk);
							if (!r.isStatusCreate() && isNull(slsActDR)){
								continue;
							}
							oldBaseUnitQty = oldBaseUnitQty.add(r.isStatusCreate() ? MCNumber.ZERO : slsActDR.base_unit_qty());
						}
					}
					
					boolean calcContFlg = false;
					// 仕入後計上で打切解除の場合
					if (slsSchdR.abort_flg() && !lst.get(0).abort_flg()) {
						calcContFlg = true;
					}
					else {
						// 打切のまま数量増加の場合
						if (baseUnitQty.gt(oldBaseUnitQty)) {
							calcContFlg = true;
						}
					}
					
					MCNumber credQty = calcCredRetQty(slsSchdQty, cmplQty, baseUnitQty, oldBaseUnitQty, calcContFlg);
					if (credQty.isZero()) {
						lst.setValueNE(Chk01_DtlR.$cred_upd_amt, MCNumber.ZERO);
						continue;
					}
					
					MST_SLO_D_R sloDR = lst.get(0).getJoinedRow(_sloDJk);
					ConvQtyAmtUtil_Calc01_HdrR opeUp0 = ope.up0().createRow();
					copy(opeUp0, lst.get(0), createMap_ConvQtyAmtUtil_Calc01_HdrR_Chk01_DtlR(up0(), _slo, sloDR));
					ope.up0().add(opeUp0);
					
					ConvQtyAmtUtil_Calc01_Dtl1R opeUp1 = ope.up1().createRow();
					
					copy(opeUp1, lst.get(0), createMap_ConvQtyAmtUtil_Calc01_Dtl1R_Chk01_DtlR());
					
					opeUp1.trd_unit_qty(credQty);
					
					ope.up1().add(opeUp1);
				}
			}
			
			if (!ope.up0().isEmpty()) {
				
				ope.exec();

				String[] destCols = new String[] {
					Chk01_DtlR.$cred_upd_amt
				};
				String[] srcCols = new String[] {
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_inc_tax_amt
				};

				copyByPegNo(up1(), destCols, ope.down0(), srcCols);
			}
		}

		/**
		 * 	RowMapper<br>
		 * 	上り電文(Chk01_DtlR) -> 単位・金額換算ユーティリティ.上り電文(ConvQtyAmtUtil_Calc01_HdrR)
		 * @param hdr
		 * @return
		 */
		protected Map_ConvQtyAmtUtil_Calc01_HdrR_Chk01_DtlR<ConvQtyAmtUtil_Calc01_HdrR, Chk01_DtlR> createMap_ConvQtyAmtUtil_Calc01_HdrR_Chk01_DtlR(
				Chk01_HdrR hdr, MST_SLO_R slo, MST_SLO_D_R sloD) {
			return new Map_ConvQtyAmtUtil_Calc01_HdrR_Chk01_DtlR<ConvQtyAmtUtil_Calc01_HdrR, Chk01_DtlR>(
					hdr, slo, sloD);
		}

		public class Map_ConvQtyAmtUtil_Calc01_HdrR_Chk01_DtlR<D extends ConvQtyAmtUtil_Calc01_HdrR, S extends Chk01_DtlR>
				extends MCRowMapper<D, S> {

			Chk01_HdrR _hdr;

			MST_SLO_R _slo;

			MST_SLO_D_R _sloD;

			public Map_ConvQtyAmtUtil_Calc01_HdrR_Chk01_DtlR(Chk01_HdrR hdr,
					MST_SLO_R slo, MST_SLO_D_R sloD) {
				_hdr = hdr;
				_slo = slo;
				_sloD = sloD;
			}

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$peg_no, Chk01_DtlR.$peg_no);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				dest.trd_unit_cd(_sloD.trd_unit_cd());
				dest.trd_unit_qty(_sloD.trd_unit_qty());
				dest.trd_cur_upri(_sloD.trd_cur_upri());
				dest.trd_cur_dscnt_amt(_sloD.trd_cur_dscnt_amt());
				dest.trd_cur_amt(_sloD.trd_cur_amt());
				dest.trd_cur_tax_amt(_sloD.trd_cur_tax_amt());
				dest.trd_cur_inc_tax_amt(_sloD.trd_cur_amt().add(_sloD.trd_cur_tax_amt()));
				dest.trd_unit_conv_qty(_sloD.getNumberNE("conv_qty"));
				dest.trd_unit_conv_base_qty(_sloD.getNumberNE("conv_base_qty"));
				dest.tax_rate(_sloD.getNumberNE("tax_rate"));
				dest.inc_tax_flg(_sloD.getBooleanNE("inc_tax_flg"));
				dest.trd_cur_cd(_slo.trd_cur_cd());
				dest.amt_dec_place(_slo.getNumberNE("amt_dec_place"));
				dest.upri_dec_place(_slo.getNumberNE("upri_dec_place"));
				dest.amt_rnd_typ(_slo.getStringNE("sls_amt_rnd_typ"));
				dest.tax_rnd_typ(_slo.getStringNE("sls_tax_rnd_typ"));
				dest.base_unit_dec_place(_sloD.getNumberNE("base_unit_dec_place"));
				dest.base_unit_rnd_typ(_sloD.getStringNE("base_unit_rnd_typ"));
				dest.schd_base_unit_qty(_sloD.getNumberNE("base_unit_qty"));
			}
		}

		protected Map_ConvQtyAmtUtil_Calc01_Dtl1R_Chk01_DtlR<ConvQtyAmtUtil_Calc01_Dtl1R, Chk01_DtlR> createMap_ConvQtyAmtUtil_Calc01_Dtl1R_Chk01_DtlR() {
			return new Map_ConvQtyAmtUtil_Calc01_Dtl1R_Chk01_DtlR<ConvQtyAmtUtil_Calc01_Dtl1R, Chk01_DtlR>();
		}

		/**
		 * 	RowMapper<br>
		 * 	上り電文(Chk01_DtlR) -> 単位・金額換算ユーティリティ.上り電文(ConvQtyAmtUtil_Calc01_Dtl1R)
		 * @param hdr
		 * @return
		 */
		public class Map_ConvQtyAmtUtil_Calc01_Dtl1R_Chk01_DtlR<D extends ConvQtyAmtUtil_Calc01_Dtl1R, S extends Chk01_DtlR> extends MCRowMapper<D, S> {

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$peg_no, Chk01_DtlR.$peg_no);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$hdr_peg_no, Chk01_DtlR.$peg_no);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
					
				dest.trd_unit_cd(src.base_unit_cd());
				dest.trd_unit_conv_base_qty(1);
				dest.trd_unit_conv_qty(1);
			}
		}

		/**
		 * 	市場出荷判定対象の品目か判定する
		 * @param r
		 * @return
		 */
		protected boolean isMrktJudgItm(Chk01_DtlR r) {
			
			return false;
		}

		/**
		 * 原価単価と基準単位数量から原価金額を取得する
		 * 
		 * @param dtlR
		 * @return
		 */
		protected MCNumber getCostAmt(Chk01_DtlR dtlR) {
			MCNumber costAmt = null;
			if (!isNullOr(dtlR.cost_upri(), dtlR.base_unit_qty())) {
				costAmt = MSUCL_SlsUtil.getCostAmt(dtlR.cost_upri(), dtlR.base_unit_qty(), getBaseCur().amt_dec_place());
			}
			return costAmt;
		}
	}

	/**
	 * Ins01オペレーション.<p>
	 *
	 * 売上実績情報を新規登録します。<br>
	 */
	public class Ins01 extends MSBBL_PurcDdlvReg_MC_A.Ins01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			editUp();

			// チェックOpeの呼出
			callThisChk01();
			throwUpdErr();

			// 与信サービスの呼出
			callCredSvUpd01();

			// 仕入実績サービスの呼出
			callPurcActSvUpd02();

			// 売上実績サービスの呼出
			callSlsActSvUpd01();

			// 受注情報更新
			updSlo(up0().slo_no());

			// 受払実績サービスの呼出
			callIoActSvUpd01();

			// 下り電文の設定
			setDown();

		}

		protected void editUp() {

			//　紐付けＮＯの設定
			setPegNoSub(up0(), up1(), up2());
			
			setSyncFlgForChk01(up1(), up2());
		}

		/**
		 * 	Chk01オペレーションの呼出
		 */
		protected void callThisChk01() {
			mapUpContainers(CALL_OPE);
			chk01.call();
			MCRow.copyall(up0(), chk01_down0);
			up1().setAll(chk01_down1);
			up2().setAll(chk01_down2);
		}

		/**
		 * 	与信サービス.与信更新処理の呼出
		 * 
		 */
		protected void callCredSvUpd01() {

			if (!isNull(up0().slo_no())) {

				MCNumber amt = up1().sum(Chk01_DtlR.$cred_upd_amt);
				MSBGL_CredService.Cred_Upd01 ope = MSBGL_CredService.crtCred_Upd01();
				Cred_Upd01_CndR opeUp = ope.up0().createRow();
				copy(opeUp, up0(), createMap_Cred_Upd01_CndR_Chk01_HdrR());
				opeUp.amt(amt);
				ope.up0().add(opeUp);
				ope.exec();
			}
		}

		/**
		 * 	仕入実績登録サービスの呼出
		 * 
		 */
		protected void callPurcActSvUpd02() {
			MSBDL_PurcActRegService.Purc_Upd02 ope = MSBDL_PurcActRegService
					.crtPurc_Upd02();

			Map<Comparable<?>, MCList<Chk01_IoR>> ioLMap = convList2Map(up2(),
					Chk01_IoR.$dtl_row_id);
			for (Chk01_DtlR parDtl : up1()) {
				MCList<Chk01_IoR> chdIoL = ioLMap.get(parDtl.dtl_row_id());
				if (parDtl.sync_flg()) {
					Purc_Ins01_HdrR opeHdr = ope.up1().createRow();
					opeHdr.peg_no(parDtl.peg_no());
					opeHdr.setAttributes(parDtl);
					ope.up1().add(opeHdr);

					Purc_Ins01_DtlR opeDtl = ope.up2().createRow();
					opeDtl.peg_no(parDtl.peg_no());
					opeDtl.setAttributes(parDtl);
					ope.up2().add(opeDtl);

					for (Chk01_IoR chdIo : chdIoL) {
						Purc_Ins01_IoR opeIo = ope.up3().createRow();
						opeIo.peg_no(chdIo.peg_no());
						opeIo.setAttributes(chdIo);
						ope.up3().add(opeIo);
					}
				}
			}
			
			if (!ope.up1().isEmpty()) {
				
				ope.up0().purc_ddlv_reg_exec_flg(true);
				ope.up0().amt_calc_flg(false);
				ope.exec();

				// 仕入実績サービスからの下り電文をコピーする
				String[] cols = new String[] {Chk01_DtlR.$purc_act_no, Chk01_DtlR.$purc_act_seq};
				copyByPegNo(up1(), cols, ope.down0(), cols);

				cols = new String[] {Chk01_DtlR.$purc_act_d_no, Chk01_DtlR.$purc_act_d_seq};
				copyByPegNo(up1(), cols, ope.down1(), cols);

				cols = new String[] {Chk01_IoR.$purc_act_io_no, Chk01_IoR.$purc_act_io_seq, Chk01_IoR.$arr_act_no};
				copyByPegNo(up2(), cols, ope.down2(), cols);
			}
		}

		/**
		 * 	売上実績サービスの呼出
		 */
		protected void callSlsActSvUpd01() {
			setSlsSchd(up1());

			MSBBL_SlsActService.SlsAct_Upd01 ope = MSBBL_SlsActService.crtSlsAct_Upd01();
			// 発注時に作成した納品書ＮＯごとに売上実績を作成する
			int pegNo = up0().peg_no().intValue();
			MCIndexKey idx = up2().createIndex(Chk01_IoR.$dtl_peg_no);
			for (MCList<Chk01_DtlR> gl : groupList(up1(), Chk01_DtlR.$dlv_slip_no)) {
				Chk01_DtlR gr = gl.get(0);
				
				// ヘッダ
				SlsAct_Upd01_HdrR up0 = ope.up0().createRow();
				copy(up0, up0(), createMap_SlsAct_Upd01_HdrR_Chk01_HdrR());
				up0.dlv_slip_no(gr.dlv_slip_no());
				up0.purc_ddlv_dlv_slip_no(gr.dlv_slip_no());
				
				// 明細
				MCList<SlsAct_Upd01_DtlR> up1 = MCList.create(SlsAct_Upd01_DtlR.class);
				addAll(up1, gl, createMap_SlsAct_Upd01_DtlR_Chk01_DtlR(up0()));
				
				// 詳細
				MCList<SlsAct_Upd01_IoR> up2 = MCList.create(SlsAct_Upd01_IoR.class);
				for (Chk01_DtlR dtlR : gl) {
					MCList<Chk01_IoR> ioL = up2().subList(idx, dtlR.peg_no());
					ioL.sort(Chk01_IoR.$peg_no);
					addAll(up2, ioL, createMap_SlsAct_Upd01_IoR_Chk01_IoR());
				}
				
				up0.hdr_peg_no(pegNo);
				up1.setNumberNE(SlsAct_Upd01_DtlR.$hdr_peg_no, pegNo);
				up2.setNumberNE(SlsAct_Upd01_IoR.$hdr_peg_no, pegNo);
				pegNo++;
				
				ope.up0().add(up0);
				ope.up1().addAll(up1);
				ope.up2().addAll(up2);
				ope.up3().indiv_prnt_flg(true);

			}
			ope.exec();

			// 売上実績登録サービスからの下り電文をコピーする
			SlsAct_Upd01_RsltR downRslt = ope.down0().get(0);
			up0().sls_act_no(downRslt.sls_act_no());
			up0().sls_act_rev(downRslt.sls_act_rev());
			up0().dlv_slip_no(downRslt.dlv_slip_no());

			String[] cols = new String[] {SlsAct_Upd01_DtlR.$sls_act_d_no, SlsAct_Upd01_DtlR.$sls_act_d_seq};
			copyByPegNo(up1(), ope.down1(), Chk01_DtlR.$peg_no, cols, SlsAct_Upd01_DtlR.$dtl_peg_no, cols);
			
			// 分割時のメッセージを追加
			addSplitMsg(ope.down0());
		}
		/**
		 * 上り電文の順番を意識したグループリストを取得する
		 */
		protected MCList<Chk01_DtlR>[] groupList(MCList<Chk01_DtlR> lst, String... key) {
			MCList<Chk01_DtlR>[] arr = lst.groupList(key);
			// 上り電文の順番を優先に並び替える
			for (int i=0; i<arr.length; i++) {
				arr[i].sort(Chk01_DtlR.$disp_seq);
			}
			java.util.Arrays.sort(arr, new java.util.Comparator<MCList<Chk01_DtlR>>() {
				public int compare(MCList<Chk01_DtlR> o1, MCList<Chk01_DtlR> o2) {
					return o1.get(0).disp_seq().compareTo(o2.get(0).disp_seq());
				}
			});
			return arr;
		}
		
		/**
		 * 分割時のメッセージを追加する
		 */
		protected void addSplitMsg(MCList<SlsAct_Upd01_RsltR> down0) {
			if (down0.size() <= 1) {
				return;
			}
			
			MCMessageList msgL = new MCMessageList();
			MCMessagePool.getMessageList().forEach(msg -> {
				if (isSame(msg.getID(), MSBBL0063) || isSame(msg.getID(), MSBBL0064)) {
					// 別途追加する
				}
				else {
					msgL.add(msg);
				}
			});
			msgL.add(new MCMessage(MSBBL0063));
			for (SlsAct_Upd01_RsltR downR : down0) {
				msgL.add(new MCMessage(downR, null, MSBBL0064, downR.sls_act_no()));
			}
			
			MCMessagePool.clear();
			MCMessagePool.addAll(msgL);
		}

		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
		}
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 売上実績情報を訂正します。<br>
	 */
	public class Upd01 extends MSBBL_PurcDdlvReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			editUp();

			// チェックOpeの呼出
			callThisChk01();
			throwUpdErr();

			// 与信サービスの呼出
			callCredSvUpd01();

			// 仕入実績サービスの呼出
			callPurcActSvUpd02();

			// 売上実績サービスの呼出
			callSlsActSvUpd01();
			
			// 仕入実績サービスの呼出(行削除)
			callPurcActSvUpd02ForDel();

			// 受注情報更新
			updSlo(up0().slo_no());

			// 受払実績サービスの呼出
			callIoActSvUpd01();

			// 下り電文の設定
			setDown();

		}

		protected void editUp() {

			//　紐付けＮＯの設定
			setPegNoSub(up0(), up1(), up2());
			
			setSyncFlgForChk01(up1(), up2());
		}

		/**
		 * 	Chk01オペレーションの呼出
		 */
		protected void callThisChk01() {
			mapUpContainers(CALL_OPE);
			chk01.call();
			MCRow.copyall(up0(), chk01_down0);
			up1().setAll(chk01_down1);
			up2().setAll(chk01_down2);
		}

		/**
		 * 	与信サービス.与信更新処理の呼出
		 * 
		 */
		protected void callCredSvUpd01() {

			if (!isNull(up0().slo_no())) {

				MCNumber amt = up1().sum(Chk01_DtlR.$cred_upd_amt);
				MSBGL_CredService.Cred_Upd01 ope = MSBGL_CredService.crtCred_Upd01();
				Cred_Upd01_CndR opeUp = ope.up0().createRow();
				copy(opeUp, up0(), createMap_Cred_Upd01_CndR_Chk01_HdrR());
				opeUp.amt(amt);
				ope.up0().add(opeUp);
				ope.exec();
			}
		}

		/**
		 * 	仕入実績登録サービスの呼出
		 * 
		 */
		protected void callPurcActSvUpd02() {
			MSBDL_PurcActRegService.Purc_Upd02 ope = MSBDL_PurcActRegService
					.crtPurc_Upd02();

			Map<Comparable<?>, MCList<Chk01_IoR>> ioLMap = convList2Map(up2(),
					Chk01_IoR.$dtl_row_id);
			for (Chk01_DtlR parDtl : up1()) {
				MCList<Chk01_IoR> chdIoL = ioLMap.get(parDtl.dtl_row_id());
				if (parDtl.sync_flg()) {
					if (parDtl.isStatusDelete()) {
						continue;
					}
					Purc_Ins01_HdrR opeHdr = ope.up1().createRow();
					opeHdr.peg_no(parDtl.peg_no());
					opeHdr.setAttributes(parDtl);
					ope.up1().add(opeHdr);

					Purc_Ins01_DtlR opeDtl = ope.up2().createRow();
					opeDtl.peg_no(parDtl.peg_no());
					opeDtl.setAttributes(parDtl);
					ope.up2().add(opeDtl);

					for (Chk01_IoR chdIo : chdIoL) {
						Purc_Ins01_IoR opeIo = ope.up3().createRow();
						opeIo.peg_no(chdIo.peg_no());
						opeIo.setAttributes(chdIo);
						ope.up3().add(opeIo);
					}
				}
			}
			
			if (!ope.up1().isEmpty()) {
				
				ope.up0().purc_ddlv_reg_exec_flg(true);
				ope.up0().amt_calc_flg(false);
				ope.exec();
				
				// 仕入実績サービスからの下り電文をコピーする
				String[] cols = new String[] {Chk01_DtlR.$purc_act_no, Chk01_DtlR.$purc_act_seq};
				copyByPegNo(up1(), cols, ope.down0(), cols);

				cols = new String[] {Chk01_DtlR.$purc_act_d_no, Chk01_DtlR.$purc_act_d_seq};
				copyByPegNo(up1(), cols, ope.down1(), cols);

				cols = new String[] {Chk01_IoR.$purc_act_io_no, Chk01_IoR.$purc_act_io_seq, Chk01_IoR.$arr_act_no};
				copyByPegNo(up2(), cols, ope.down2(), cols);
			}
		}

		/**
		 * 	売上実績サービスの呼出
		 */
		protected void callSlsActSvUpd01() {
			setSlsSchd(up1());

			MSBBL_SlsActService.SlsAct_Upd01 ope = MSBBL_SlsActService.crtSlsAct_Upd01();
			SlsAct_Upd01_HdrR up0 = ope.up0().createRow();
			copy(up0, up0(), createMap_SlsAct_Upd01_HdrR_Chk01_HdrR());
			ope.up0().add(up0);
			addAll(ope.up1(), up1(), createMap_SlsAct_Upd01_DtlR_Chk01_DtlR(up0()));
			addAll(ope.up2(), up2(), createMap_SlsAct_Upd01_IoR_Chk01_IoR());
			ope.up3().indiv_prnt_flg(true);
			ope.exec();

			SlsAct_Upd01_RsltR downRslt = ope.down0().get(0);

			// 売上実績登録サービスからの下り電文をコピーする
			up0().sls_act_no(downRslt.sls_act_no());
			up0().sls_act_rev(downRslt.sls_act_rev());
			up0().dlv_slip_no(downRslt.dlv_slip_no());

			String[] cols = new String[] {SlsAct_Upd01_DtlR.$sls_act_d_no, SlsAct_Upd01_DtlR.$sls_act_d_seq};
			copyByPegNo(up1(), ope.down1(), Chk01_DtlR.$peg_no, cols, SlsAct_Upd01_DtlR.$dtl_peg_no, cols);
		}
		/**
		 * 	仕入実績登録サービスの呼出(行削除)
		 * 
		 */
		protected void callPurcActSvUpd02ForDel() {
			
			MSBDL_PurcActRegService.Purc_Upd02 ope = MSBDL_PurcActRegService.crtPurc_Upd02();
			
			Map<Comparable<?>, MCList<Chk01_IoR>> ioLMap = convList2Map(up2(), Chk01_IoR.$dtl_row_id);
			
			for (Chk01_DtlR parDtl : up1()) {
				MCList<Chk01_IoR> chdIoL = ioLMap.get(parDtl.dtl_row_id());
				
				if (parDtl.sync_flg()) {
					
					if (!parDtl.isStatusDelete()) {
						continue;
					}
					
					Purc_Ins01_HdrR opeHdr = ope.up1().createRow();
					opeHdr.peg_no(parDtl.peg_no());
					opeHdr.setAttributes(parDtl);
					ope.up1().add(opeHdr);

					Purc_Ins01_DtlR opeDtl = ope.up2().createRow();
					opeDtl.peg_no(parDtl.peg_no());
					opeDtl.setAttributes(parDtl);
					ope.up2().add(opeDtl);

					for (Chk01_IoR chdIo : chdIoL) {
						Purc_Ins01_IoR opeIo = ope.up3().createRow();
						opeIo.peg_no(chdIo.peg_no());
						opeIo.setAttributes(chdIo);
						ope.up3().add(opeIo);
					}
				}
			}

			if (!ope.up1().isEmpty()) {
				
				ope.up0().purc_ddlv_reg_exec_flg(true);
				ope.exec();
			}
		}

		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
		}
	}

	/**
	 * Chk02オペレーション.<p>
	 *
	 * 売上実績情報を取消前チェックをします。<br>
	 */
	public class Chk02 extends MSBBL_PurcDdlvReg_MC_A.Chk02 {

		Chk02_HdrR _up0;

		MCList<Chk02_DtlR> _up1;

		MCList<Chk02_IoR> _up2;

		/** 更新カウンタチェックエラー  */
		protected boolean _updCntrErr = false;
		/** DACチェックエラー  */
		protected boolean _dacErr = false;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			super.doIt();
			setDown();
		}

		protected void editUp() {

			// 上り電文はup2()が存在しない
			// 統一性を持たせるため、以降は上り電文ではなく
			// 以下の変数に対して処理を行う
			_up0 = up0();
			_up1 = up1();
			_up2 = createChk02_IoL();
		}

		protected void setDown() {
			MCRow.copyall(down0(), _up0);
			down1().setAll(_up1);
			down2().setAll(_up2);
		}

		@Override
		protected MCMessageList doServerCheckBase() {

			MCMessageList msgL = super.doServerCheckBase();

			// 更新カウンタチェック、排他ロック獲得
			msgL.addAll(lockAndCheckBase());

			if (hasErr() || _updCntrErr || _dacErr) {
				return msgL;
			}

			// 補完(定型チェック実施前)
			compHdrBase();
			compDtlBase();
			compIoBase();

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			if (_updCntrErr || _dacErr) {
				return msgL;
			}

			// 打切チェック
			msgL.addAll(checkAbort());

			// 仕入実績サービスの呼出
			callPurcActRegSvChk03();

			//　与信更新金額計算
			calcCredUpdAmt();

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

			// 受注
			msgL.addAll(lockAndCheckSlo());

			// 売上予定・仕入予定
			msgL.addAll(checkSlsPurcSchd());

			// 入荷進捗
			msgL.addAll(lockAndCheckArrPr());

			// 仕入実績
			msgL.addAll(checkPurcAct());

			return msgL;
		}

		protected void compHdrBase() {
		}

		protected void compDtlBase() {

		}

		protected void compIoBase() {

		}

		/**
		 * 	売上実績
		 * <li>排他ロック獲得、更新カウンタチェック</li>
		 * @return
		 */
		protected MCMessageList lockAndCheckSlsAct() {

			MCMessageList msgL = new MCMessageList();

			MST_SLS_ACT_R slsAct = MST_SLS_ACT_R.create();
			dbSelectKeyForUpdateNoWait("MSBBL1360_MST_SLS_ACT_S02", slsAct,
					MCQueryApiBuilder.create(MST_SLS_ACT_R.create("T")), _up0);
			// 更新カウンタチェック
			msgL.addAll(checkUpdCntrNE(_up0, Chk01_HdrR.$upd_cntr, slsAct));

			if (!msgL.isEmpty()) {
				_updCntrErr = true;
				return msgL;
			}

			// 更新前データDACチェック
			msgL.addAll(checkWritableDptCdDac(slsAct, MST_SLS_ACT_R.$sls_dpt_cd));

			if (!msgL.isEmpty()) {
				_dacErr = true;
				return msgL;
			}
			// 補完
			_up0.cst_cd(slsAct.cst_cd());
			_up0.trd_cur_cd(slsAct.trd_cur_cd());
			_up0.trd_ptn_typ(slsAct.trd_ptn_typ());

			MST_SLS_ACT_D_R slsActDL_t = MST_SLS_ACT_D_R.create("T");
			MCQueryApiBuilder slsActDL_bldr = MCQueryApiBuilder.create(slsActDL_t);
			MAVM_ITM_UNIT_R m1 = MAVM_ITM_UNIT_R.create("M1");

			slsActDL_bldr.setSelect(slsActDL_bldr.getBaseDbc().getKeyColumn$());
			slsActDL_bldr.addSelect(slsActDL_t.slo_d_no);
			slsActDL_bldr.addSelect(slsActDL_t.slo_no);
			slsActDL_bldr.addSelect(slsActDL_t.trd_unit_cd);
			slsActDL_bldr.addSelect(slsActDL_t.trd_unit_qty);
			slsActDL_bldr.addSelect(slsActDL_t.sls_act_no);
			slsActDL_bldr.addSelect(slsActDL_t.purc_act_d_no);
			slsActDL_bldr.addSelect(slsActDL_t.sls_schd_no);
			slsActDL_bldr.addSelect(m1.conv_base_qty.as("trd_unit_conv_base_qty"));
			slsActDL_bldr.addSelect(m1.conv_qty.as("trd_unit_conv_qty"));
			slsActDL_bldr.addLeftOuterJoin(m1, bracket(slsActDL_t.itm_cd.eq(m1.itm_cd)
					.and(slsActDL_t.itm_sub1.eq(m1.itm_sub1))
					.and(slsActDL_t.itm_sub2.eq(m1.itm_sub2))
					.and(slsActDL_t.itm_sub3.eq(m1.itm_sub3))
					.and(slsActDL_t.trd_unit_cd.eq(m1.unit_cd))));

			MCList<MST_SLS_ACT_D_R> slsActDL = MCList.create(MST_SLS_ACT_D_R.class);
			dbSelectKey("MSBBL1360_MST_SLS_ACT_D_S02", slsActDL, slsActDL_bldr, _up1);
			MCJoinKey<MCList<MST_SLS_ACT_D_R>> jk = _up1.join(
					Chk02_DtlR.$sls_act_d_no, slsActDL, MST_SLS_ACT_D_R.$sls_act_d_no);

			for (Chk02_DtlR dtl : _up1) {
				MST_SLS_ACT_D_R slsActD = dtl.getJoinedRow(jk);
				if (isNull(slsActD)) {
					msgL.addAll(getRecordNotFoundMsg(getModuleID(), slsActDL_bldr.getBaseDbc().tableName(),
							slsActDL_bldr.getBaseDbc().getKeyColumn(),
							dtl.toArray(slsActDL_bldr.getBaseDbc().getKeyColumn()), dtl));
				}
				else {

					if (!isSame(_up0.sls_act_no(), slsActD.sls_act_no())) {
						msgL.addAll(getRecordInvalidMsg(Chk02_HdrR.$sls_act_no,
								slsActD.sls_act_no(), dtl));
					}

					if (!isSame(dtl.purc_act_d_no(), slsActD.purc_act_d_no())) {
						msgL.addAll(getRecordInvalidMsg(Chk02_DtlR.$purc_act_d_no,
								slsActD.purc_act_d_no(), dtl));
					}
					dtl.slo_d_no(slsActD.slo_d_no());
					dtl.sls_schd_no(slsActD.sls_schd_no());
					dtl.trd_unit_cd(slsActD.trd_unit_cd());
					dtl.trd_unit_qty(slsActD.trd_unit_qty());
					dtl.trd_unit_conv_base_qty(slsActD
							.getNumberNE("trd_unit_conv_base_qty"));
					dtl.trd_unit_conv_qty(slsActD.getNumberNE("trd_unit_conv_qty"));
				}
			}
			_up0.slo_no(slsActDL.get(0).slo_no());

			MST_SLS_ACT_IO_R S0T = MST_SLS_ACT_IO_R.create("T");
			MST_SLS_ACT_D_R S0T2 = MST_SLS_ACT_D_R.create("T2");
			MST_SLS_SCHD_R S0T3 = MST_SLS_SCHD_R.create("T3");

			MCMainQuery q = sql("MSBBL1360_MST_SLS_ACT_IO_S02")
				.mainQuery()
				.select(
					S0T.sls_act_io_no,
					S0T.sls_act_io_seq,
					S0T.purc_act_io_no,
					S0T.sls_act_d_no,
					S0T.ship_act_d_no,
					S0T.sync_flg
				)
				.from(
					S0T
					.innerJoin(S0T2).on(
						bracket(
							S0T2.sls_act_d_no.eq(S0T.sls_act_d_no)
							.and(S0T2.sls_act_d_seq.eq(S0T.sls_act_d_seq))
						)
					)
					.leftOuterJoin(S0T3).on(
						bracket(
							S0T2.sls_schd_no.eq(S0T3.sls_schd_no)
						)
					)
				)
				.where(
					value(0).eq(value(0))
					.and(S0T2.sls_act_no.eq(bind("sls_act_no")))
					.and(S0T2.sls_act_seq.eq(bind("sls_act_seq")))
				);
			
			q.executeQuery(_up0, _up2);

			// 紐付けＮＯを設定する
			setPegNo(_up1);
			setPegNo(_up2);
			Map<Comparable<?>, MCList<Chk02_IoR>> ioLMap = convList2Map(_up2,
					Chk02_IoR.$sls_act_d_no);
			for (Chk02_DtlR parDtl : _up1) {
				parDtl.hdr_peg_no(_up0.peg_no());
				MCList<Chk02_IoR> chdIoL = ioLMap.get(parDtl.sls_act_d_no());
				chdIoL.setNumber(Chk02_IoR.$hdr_peg_no, _up0.peg_no());
				chdIoL.setNumber(Chk02_IoR.$dtl_peg_no, parDtl.peg_no());
				for (Chk02_IoR chdIo : chdIoL) {
					Chk02_IoR up2R = _up2.getFirst(Chk02_IoR.$sls_act_io_no, chdIo.sls_act_io_no());
					chdIo.ship_act_d_no(up2R.ship_act_d_no());
				}
			}

			return msgL;
		}

		/**
		 * 	受注
		 * <p>排他ロック獲得、更新カウンタチェック</p>
		 * @return
		 */
		protected MCMessageList lockAndCheckSlo() {

			MCMessageList msgL = new MCMessageList();

			if (_updCntrErr || _dacErr) {
				return msgL;
			}

			if (!isNull(_up0.slo_no())) {
				
				MST_SLO_R slo = MST_SLO_R.create();
				dbSelectKeyForUpdateNoWait("MSBBL1360_MST_SLO_S02", slo,
						MCQueryApiBuilder.create(MST_SLO_R.create("T")), _up0);

				// 更新カウンタチェック
				msgL.addAll(checkUpdCntrNE(_up0, Chk01_HdrR.$slo_upd_cntr, slo));
			}

			if (!msgL.isEmpty()) {
				_updCntrErr = true;
				return msgL;
			}

			// 後続の与信額更新処理のため受注単価・金額情報を取得する
			MST_SLO_R t2 = MST_SLO_R.create("T2");
			MAM_BP_R m1 = MAM_BP_R.create("M1");
			MAM_CUR_R m2 = MAM_CUR_R.create("M2");
			MAVM_ITM_UNIT_R m3 = MAVM_ITM_UNIT_R.create("M3");
			MAM_TAX_R m4 = MAM_TAX_R.create("M4");

			MCList<MST_SLO_D_R> sloDL = MCList.create(MST_SLO_D_R.class);
			MST_SLO_D_R t = MST_SLO_D_R.create("T");
			MCQueryApiBuilder sloDL_bldr = MCQueryApiBuilder.create(t);
			sloDL_bldr.addSelect(t2.trd_cur_cd);
			sloDL_bldr.addSelect(m1.sls_amt_rnd_typ);
			sloDL_bldr.addSelect(m1.sls_tax_rnd_typ);
			sloDL_bldr.addSelect(m2.amt_dec_place);
			sloDL_bldr.addSelect(m2.upri_dec_place);
			sloDL_bldr.addSelect(m3.conv_qty);
			sloDL_bldr.addSelect(m3.conv_base_qty);
			sloDL_bldr.addSelect(m3.dec_place);
			sloDL_bldr.addSelect(m3.rnd_typ);
			sloDL_bldr.addSelect(m4.tax_rate);
			sloDL.addBooleanColumn("inc_tax_flg");
			sloDL_bldr.addSelect(m4.inc_tax_flg);
			sloDL_bldr.addInnerJoin(t2, bracket(t.slo_no.eq(t2.slo_no)));
			sloDL_bldr.addLeftOuterJoin(m1, bracket(t2.cst_cd.eq(m1.bp_cd)));
			sloDL_bldr.addLeftOuterJoin(m2, bracket(t2.trd_cur_cd.eq(m2.cur_cd)));
			sloDL_bldr.addLeftOuterJoin(m3, bracket(t.itm_cd.eq(m3.itm_cd)
					.and(t.itm_sub1.eq(m3.itm_sub1))
					.and(t.itm_sub2.eq(m3.itm_sub2))
					.and(t.itm_sub3.eq(m3.itm_sub3))
					.and(t.trd_unit_cd.eq(m3.unit_cd))));
			sloDL_bldr.addLeftOuterJoin(m4, bracket(t.tax_cd.eq(m4.tax_cd)));
			sloDL_bldr.setWhere(t.slo_no.eq(bind("slo_no")));
			dbSelect("MSBBL1360_MST_SLO_D_S02", sloDL, sloDL_bldr, _up0);

			MCJoinKey<MCList<MST_SLO_D_R>> jk = _up1.join(Chk02_DtlR.$slo_d_no,
					sloDL, MST_SLO_D_R.$slo_d_no);

			for (Chk02_DtlR dtl : _up1) {
				MST_SLO_D_R sloD = dtl.getJoinedRow(jk);
				if (!isNull(sloD)) {
					dtl.schd_cur_cd(sloD.getStringNE("trd_cur_cd"));
					dtl.schd_amt_rnd_typ(sloD.getStringNE("sls_amt_rnd_typ"));
					dtl.schd_tax_rnd_typ(sloD.getStringNE("sls_tax_rnd_typ"));
					dtl.schd_amt_dec_place(sloD.getNumberNE("amt_dec_place"));
					dtl.schd_upri_dec_place(sloD.getNumberNE("upri_dec_place"));
					dtl.schd_unit_cd(sloD.trd_unit_cd());
					dtl.schd_qty(sloD.trd_unit_qty());
					dtl.schd_upri(sloD.trd_cur_upri());
					dtl.schd_amt(sloD.trd_cur_amt());
					dtl.schd_tax_amt(sloD.trd_cur_tax_amt());
					dtl.schd_inc_tax_amt(sloD.trd_cur_amt().add(sloD.trd_cur_tax_amt()));
					dtl.schd_dscnt_amt(sloD.trd_cur_dscnt_amt());
					dtl.schd_conv_base_qty(sloD.getNumberNE("conv_base_qty"));
					dtl.schd_conv_qty(sloD.getNumberNE("conv_qty"));
					dtl.schd_dec_place(sloD.getNumberNE("dec_place"));
					dtl.schd_rnd_typ(sloD.getStringNE("rnd_typ"));
					dtl.schd_tax_rate(sloD.getNumberNE("tax_rate"));
					dtl.schd_inc_tax_flg(sloD.getBooleanNE("inc_tax_flg"));
				}
			}

			return msgL;
		}

		/**
		 * 	売上予定・入荷予定
		 * 	<li>存在チェック、補完</li>
		 * @return
		 */
		protected MCMessageList checkSlsPurcSchd() {

			MCMessageList msgL = new MCMessageList();

			if (_updCntrErr || _dacErr) {
				return msgL;
			}

			MCList<MST_SLS_SCHD_R> schdL = MCList.create(MST_SLS_SCHD_R.class);
			MST_SLS_SCHD_R t1 = MST_SLS_SCHD_R.create("T");
			MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(t1);
			MST_PURC_SCHD_R t2 = MST_PURC_SCHD_R.create("T2");
			schdL_bldr.setSelect(t1.sls_schd_no);
			schdL_bldr.addSelect(t1.ship_schd_no);
			schdL_bldr.addSelect(t2.purc_schd_no);
			schdL_bldr.addSelect(t2.arr_pr_no);
			schdL_bldr.addInnerJoin(t2, bracket( t1.purc_schd_no.eq(t2.purc_schd_no)));
			schdL_bldr.setWhere(t1.sls_schd_no.eq(bind("sls_schd_no")));
			dbSelect("MSBBL1360_MST_SLS_SCHD_S02", schdL, schdL_bldr, _up1);
			MCJoinKey<MCList<MST_SLS_SCHD_R>> jk = _up1.join(
					Chk01_DtlR.$sls_schd_no, schdL, MST_SLS_SCHD_R.$sls_schd_no);
			for (Chk02_DtlR dtl : _up1) {
				if (isNull(dtl.slo_d_no())) {
					continue;
				}
				MST_SLS_SCHD_R schd = dtl.getJoinedRow(jk);
				if (isNull(schd)) {
					msgL.addAll(getRecordNotFoundMsg(getModuleID(), schdL.createRow().tableName(),
							schdL_bldr.getBaseDbc().getKeyColumn(), dtl.toArray(schdL_bldr.getBaseDbc().getKeyColumn()), dtl));
				}

				if (!isSame(dtl.arr_pr_no(), schd.getStringNE("arr_pr_no"))) {
					msgL.addAll(getRecordInvalidMsg(Chk02_DtlR.$arr_pr_no,
							schd.getStringNE("arr_pr_no"), dtl));
				}
				dtl.sls_schd_no(schd.sls_schd_no());
				dtl.purc_schd_no(schd.getStringNE("purc_schd_no"));
				dtl.ship_schd_no(schd.ship_schd_no());
			}

			return msgL;
		}

		/**
		 * 	入荷進捗
		 * <li>排他ロック獲得、更新カウンタチェック</li>
		 * @return
		 */
		protected MCMessageList lockAndCheckArrPr() {

			MCMessageList msgL = new MCMessageList();

			if (_updCntrErr || _dacErr) {
				return msgL;
			}

			MCList<MST_ARR_PR_R> arrPrL = MCList.create(MST_ARR_PR_R.class);
			MCQueryApiBuilder arrPrL_bldr = MCQueryApiBuilder.create(MST_ARR_PR_R.create("T"));
			arrPrL_bldr.setOrderByAsc(arrPrL_bldr.getBaseDbc().getKeyColumn$());
			dbSelectKeyForUpdateNoWait("MSBBL1360_MST_ARR_PR_S02", arrPrL, arrPrL_bldr, _up1);
			MCJoinKey<MCList<MST_ARR_PR_R>> jk = _up1.join(Chk01_DtlR.$arr_pr_no,
					arrPrL, MST_ARR_PR_R.$arr_pr_no);

			for (Chk02_DtlR r : _up1) {
				if (isNull(r.slo_d_no())) {
					continue;
				}
				MST_ARR_PR_R arrPr = r.getJoinedRow(jk);

				msgL.addAll(checkUpdCntrNE(r, Chk01_DtlR.$arr_pr_upd_cntr, arrPr));
				
				if (!msgL.isEmpty()) {
					_updCntrErr = true;
					return msgL;
				}
			}

			return msgL;
		}

		/**
		 * 	仕入実績
		 * <p>存在チェック、補完</p>
		 * @return
		 */
		protected MCMessageList checkPurcAct() {
			MCMessageList msgL = new MCMessageList();

			if (_updCntrErr || _dacErr) {
				return msgL;
			}

			MCList<MST_PURC_ACT_D_R> purcActDL = MCList
					.create(MST_PURC_ACT_D_R.class);

			MST_PURC_ACT_D_R t1 = MST_PURC_ACT_D_R.create("T");
			MCQueryApiBuilder purcActDL_bldr = MCQueryApiBuilder.create(t1);
			MST_PURC_ACT_R t2 = MST_PURC_ACT_R.create("T2");
			MST_PURC_ACT_IO_R t3 = MST_PURC_ACT_IO_R.create("T3");

			purcActDL_bldr.setSelect(t1.purc_act_d_no);
			purcActDL_bldr.addSelect(t1.purc_act_d_seq);
			purcActDL_bldr.addSelect(t1.purc_act_seq);
			purcActDL_bldr.addSelect(t3.purc_act_io_no);
			purcActDL_bldr.addSelect(t3.purc_act_io_seq);
			purcActDL_bldr.addSelect(t2.trd_cd);
			purcActDL_bldr.addSelect(t2.trd_ptn_typ);
			purcActDL_bldr.addInnerJoin(t2, bracket(t1.purc_act_no.eq(t2.purc_act_no)
					.and(t1.purc_act_seq.eq(t2.purc_act_seq))));
			purcActDL_bldr.addInnerJoin(t3, bracket(t1.purc_act_d_no.eq(t3.purc_act_d_no)
					.and(t1.purc_act_d_seq.eq(t3.purc_act_d_seq))));
			purcActDL_bldr.setWhere(t1.purc_act_d_no.eq(bind("purc_act_d_no")));
			purcActDL_bldr.addWhereWithAnd(
					t2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			dbSelect("MSBBL1360_MST_PURC_ACT_D_S02", purcActDL, purcActDL_bldr, _up1);

			MCJoinKey<MCList<MST_PURC_ACT_D_R>> dtlJk = _up1.join(
					MST_PURC_ACT_D_R.$purc_act_d_no, purcActDL, MST_PURC_ACT_D_R.$purc_act_d_no);
			for (Chk02_DtlR dtl : _up1) {
				if (isNull(dtl.slo_d_no())) {
					continue;
				}
				// 受払まで結合しているので明細ＮＯに対してN件存在するが、最初の1件を取得する
				MST_PURC_ACT_D_R purcActD = dtl.getJoinedRow(dtlJk);
				if (isNull(purcActD)) {
					msgL.addAll(getRecordNotFoundMsg(getModuleID(),
							purcActDL_bldr.getBaseDbc().tableName(), new String[] {
								Chk02_DtlR.$purc_act_d_no
							}, dtl.toArray(Chk02_DtlR.$purc_act_d_no), dtl));
				}
				else {
					dtl.purc_act_d_seq(purcActD.purc_act_d_seq());
					dtl.purc_act_seq(purcActD.purc_act_seq());
					dtl.trd_cd(purcActD.getString("trd_cd"));
					dtl.trd_ptn_typ(purcActD.getString("trd_ptn_typ"));
				}
			}

			MCJoinKey<MCList<MST_PURC_ACT_D_R>> ioJk = _up2.join(new String[] {
					Chk02_IoR.$purc_act_io_no
			}, purcActDL, new String[] {
					MST_PURC_ACT_IO_R.$purc_act_io_no, MST_PURC_ACT_IO_R.$purc_act_io_seq
			});
			for (Chk02_IoR io : _up2) {
				if (isNull(io.purc_act_io_no())) {
					continue;
				}
				MST_PURC_ACT_D_R purcActD = io.getJoinedRow(ioJk);
				io.purc_act_io_seq(purcActD.getNumberNE("purc_act_io_seq"));
				io.purc_act_d_no(purcActD.purc_act_d_no());
				io.purc_act_d_seq(purcActD.purc_act_d_seq());
			}

			return msgL;
		}

		/**
		 * 	データ状況チェック<br>
		 * 	打切
		 * 	<p>
		 * 	取消対象の売上実績に、打切ＦＬＧがオンの売上実績明細が含まれる場合
		 * 	</p>
		 * @return
		 */
		protected MCMessageList checkAbort() {

			MCMessageList msgL = new MCMessageList();

			for (Chk02_DtlR dtl : _up1) {
				if (dtl.abort_flg()) {
					msgL.add(new MCMessage(dtl, null, MSBBL0070));
				}
			}

			return msgL;
		}

		/*
		 * 	与信更新金額の算出
		 */
		protected void calcCredUpdAmt() {

			// 共通ユーティリティを用いて見積金額をベースに算出
			MSUCL_ConvQtyAmtUtil.ConvQtyAmtUtil_Calc02 ope = MSUCL_ConvQtyAmtUtil
					.crtConvQtyAmtUtil_Calc02();

			for (Chk02_DtlR dtl : _up1) {
				if (!isNull(dtl.slo_d_no())) {
					ConvQtyAmtUtil_Calc01_HdrR opeHdr = dtl.hdr();
					opeHdr.schd_base_unit_qty(convToBaseUnit(
							opeHdr.trd_unit_qty(),
							opeHdr.trd_unit_conv_base_qty(),
							opeHdr.trd_unit_conv_qty(),
							opeHdr.base_unit_dec_place(),
							opeHdr.base_unit_rnd_typ()));
					opeHdr.peg_no(dtl.peg_no());
					ope.up0().add(opeHdr);

					ConvQtyAmtUtil_Calc01_Dtl1R opeDtl1 = dtl.dtl1();
					opeDtl1.peg_no(dtl.peg_no());
					opeDtl1.hdr_peg_no(dtl.peg_no());
					ope.up1().add(opeDtl1);
				}
			}

			ope.exec();

			String[] destCols = new String[] {
				Chk02_DtlR.$cred_upd_amt
			};
			String[] srcCols = new String[] {
				ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_inc_tax_amt
			};

			copyByPegNo(_up1, destCols, ope.down0(), srcCols);

		}

		/**
		 * 	仕入実績登録チェックサービスの呼出
		 */
		protected void callPurcActRegSvChk03() {

			MSBDL_PurcActRegService.Purc_Chk03 ope = MSBDL_PurcActRegService
					.crtPurc_Chk03();

			Map<Comparable<?>, MCList<Chk02_IoR>> ioLMap = convList2Map(_up2,
					Chk02_IoR.$sls_act_d_no);

			// メモ：	 仕入実績登録サービスは本画面で売上と仕入を同時計上したレコードのみが呼出対象となる
			// 		すなわち、先に仕入実績登録された場合は呼び出さない。
			//		同時計上か否かは、売上実績受払の同時計上ＦＬＧで判定する
			//		売上実績受払の同時計上ＦＬＧは、オンもしくはオフでユニークの前提（オン・オフ混在は許可しない）
			//		仕入実績登録サービスは、明細単位のまとまりで呼び出す
			// 		つまり１明細に対して仕入実績登録サービスのヘッダ：１、明細：１、詳細：Ｎ　となる
			for (Chk02_DtlR parDtl : _up1) {

				MCList<Chk02_IoR> chdIoL = ioLMap.get(parDtl.sls_act_d_no());

				if (!isNull(parDtl) && parDtl.sync_flg()) {
					Purc_Chk03_HdrR opeHdr = ope.up0().createRow();
					copy(opeHdr, parDtl, createMap_Purc_Chk03_HdrR_Chk02_DtlR());
					opeHdr.can_ac_dt(_up0.can_ac_dt());
					ope.up0().add(opeHdr);

					Purc_Chk03_DtlR dtlR = Purc_Chk03_DtlR.create();
					copy(dtlR, parDtl, createMap_Purc_Chk03_DtlR_Chk02_DtlR(opeHdr.peg_no()));
					ope.up1().add(dtlR);
					addAll(ope.up2(), chdIoL, createMap_Purc_Chk03_IoR_Chk02_IoR());
				}
			}

			if (!ope.up0().isEmpty()) {

				ope.up3().crt_param_cache_flg(true);
				ope.up3().purc_ddlv_reg_exec_flg(true);
				ope.exec();

				copyErrFlg(up0(), ope.down0().get(0));
				copyErrFlg(up1(), ope.down1());
				copyErrFlg(up2(), ope.down2());
			}
		}

		protected Map_Purc_Chk03_HdrR_Chk02_DtlR<Purc_Chk03_HdrR, Chk02_DtlR> createMap_Purc_Chk03_HdrR_Chk02_DtlR() {
			return new Map_Purc_Chk03_HdrR_Chk02_DtlR<Purc_Chk03_HdrR, Chk02_DtlR>();
		}

		public class Map_Purc_Chk03_HdrR_Chk02_DtlR<D extends Purc_Chk03_HdrR, S extends Chk02_DtlR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Chk03_HdrR.$peg_no, Chk02_DtlR.$peg_no);
				addColumnPathMap(Purc_Chk03_HdrR.$err_flg, Chk02_DtlR.$err_flg);
				addColumnPathMap(Purc_Chk03_HdrR.$purc_act_no, Chk02_DtlR.$purc_act_no);
				addColumnPathMap(Purc_Chk03_HdrR.$purc_act_seq, Chk02_DtlR.$purc_act_seq);
				addColumnPathMap(Purc_Chk03_HdrR.$trd_cd, Chk02_DtlR.$trd_cd);
				addColumnPathMap(Purc_Chk03_HdrR.$trd_ptn_typ, Chk02_DtlR.$trd_ptn_typ);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
		}

		protected Map_Purc_Chk03_DtlR_Chk02_DtlR<Purc_Chk03_DtlR, Chk02_DtlR> createMap_Purc_Chk03_DtlR_Chk02_DtlR(
				MCNumber hdrPegNo) {
			return new Map_Purc_Chk03_DtlR_Chk02_DtlR<Purc_Chk03_DtlR, Chk02_DtlR>(
					hdrPegNo);
		}

		public class Map_Purc_Chk03_DtlR_Chk02_DtlR<D extends Purc_Chk03_DtlR, S extends Chk02_DtlR>
				extends MCRowMapper<D, S> {

			MCNumber _hdrPegNo;

			public Map_Purc_Chk03_DtlR_Chk02_DtlR(MCNumber hdrPegNo) {
				_hdrPegNo = hdrPegNo;
			}

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Chk03_DtlR.$peg_no, Chk02_DtlR.$peg_no);
				addColumnPathMap(Purc_Chk03_DtlR.$purc_act_d_no,
						Chk02_DtlR.$purc_act_d_no);
				addColumnPathMap(Purc_Chk03_DtlR.$purc_act_d_seq,
						Chk02_DtlR.$purc_act_d_seq);
				addColumnPathMap(Purc_Chk03_DtlR.$purc_act_no, Chk02_DtlR.$purc_act_no);
				addColumnPathMap(Purc_Chk03_DtlR.$purc_act_seq, Chk02_DtlR.$purc_act_seq);
				addColumnPathMap(Purc_Chk03_DtlR.$purc_schd_no, Chk02_DtlR.$purc_schd_no);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.hdr_peg_no(_hdrPegNo);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}

		}

		protected Map_Purc_Chk03_IoR_Chk02_IoR<Purc_Chk03_IoR, Chk02_IoR> createMap_Purc_Chk03_IoR_Chk02_IoR() {
			return new Map_Purc_Chk03_IoR_Chk02_IoR<Purc_Chk03_IoR, Chk02_IoR>();
		}

		public class Map_Purc_Chk03_IoR_Chk02_IoR<D extends Purc_Chk03_IoR, S extends Chk02_IoR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Chk03_IoR.$dtl_peg_no, Chk02_IoR.$dtl_peg_no);
				addColumnPathMap(Purc_Chk03_IoR.$peg_no, Chk02_IoR.$peg_no);
				addColumnPathMap(Purc_Chk03_IoR.$purc_act_io_no,
						Chk02_IoR.$purc_act_io_no);
				addColumnPathMap(Purc_Chk03_IoR.$purc_act_io_seq,
						Chk02_IoR.$purc_act_io_seq);
				addColumnPathMap(Purc_Chk03_IoR.$purc_act_d_no, Chk02_IoR.$purc_act_d_no);
				addColumnPathMap(Purc_Chk03_IoR.$purc_act_d_seq,
						Chk02_IoR.$purc_act_io_seq);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
		}
	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 売上実績情報を取り消しします。<br>
	 */
	public class Del01 extends MSBBL_PurcDdlvReg_MC_A.Del01 {
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

			// 与信サービスの呼出
			callCredSvUpd01();

			// 売上実績サービスの呼出
			callSlsActSvUpd01();

			// 仕入実績サービスの呼出
			callPurcActSvUpd02();

			// 受注更新処理
			updSlo(up0().slo_no());

			// 受払実績サービスの呼出
			callIoActSvUpd01();

		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {

			//　紐付けＮＯの設定
			setPegNoSubForChk02(up0(), up1(), up2());
			
			setSyncFlgForChk02(up1(), up2());
		}

		/**
		 * 	Chk02オペレーションの呼出
		 */
		protected void callThisChk02() {
			mapUpContainers(CALL_OPE);
			chk02.call();
			MCRow.copyall(up0(), chk02.down0());
			Del01_Dtl().setAll(chk02.down1());
			Del01_Io().setAll(chk02.down2());
		}

		/**
		 * 	与信サービスの呼出
		 * @param hdr Srch01_HdrR
		 */
		protected void callCredSvUpd01() {

			if (!isNull(up0().slo_no())) {

				MCNumber amt = Del01_Dtl().sum(Chk02_DtlR.$cred_upd_amt);

				MSBGL_CredService.Cred_Upd01 ope = mcframe.serverMSBG.MSBGL5080.MSBGL_CredService
						.crtCred_Upd01();
				Cred_Upd01_CndR opeUp = ope.up0().createRow();
				copy(opeUp, up0(), createMap_Cred_Upd01_CndR_Chk02_HdrR());
				opeUp.amt(amt);
				ope.up0().add(opeUp);
				ope.exec();
			}
		}

		/**
		 * 	売上実績サービスの呼出
		 */
		protected void callSlsActSvUpd01() {

			MSBBL_SlsActService.SlsAct_Upd01 ope = MSBBL_SlsActService.crtSlsAct_Upd01();
			SlsAct_Upd01_HdrR opeUp = ope.up0().createRow();
			copy(opeUp, up0(), createMap_SlsAct_Upd01_HdrR_Chk02_HdrR());
			ope.up0().add(opeUp);
			addAll(ope.up1(), Del01_Dtl(), createMap_SlsAct_Upd01_DtlR_Chk02_DtlR());
			addAll(ope.up2(), Del01_Io(), createMap_SlsAct_Upd01_IoR_Chk02_IoR());
			ope.up3().indiv_prnt_flg(true);
			ope.exec();
		}

		/**
		 * 	仕入実績登録サービスの呼出
		 * 
		 */
		protected void callPurcActSvUpd02() {
			MSBDL_PurcActRegService.Purc_Upd02 ope = MSBDL_PurcActRegService
					.crtPurc_Upd02();
			
			Map<Comparable<?>, MCList<Chk02_IoR>> ioLMap = convList2Map(up2(),
					Chk02_IoR.$dtl_row_id);
			for (Chk02_DtlR parDtl : up1()) {
				MCList<Chk02_IoR> chdIoL = ioLMap.get(parDtl.dtl_row_id());
				
				if (parDtl.sync_flg()) {
					Purc_Ins01_HdrR opeHdr = ope.up1().createRow();
					opeHdr.peg_no(parDtl.peg_no());
					opeHdr.setAttributes(parDtl);
					ope.up1().add(opeHdr);

					Purc_Ins01_DtlR opeDtl = ope.up2().createRow();
					opeDtl.peg_no(parDtl.peg_no());
					opeDtl.setAttributes(parDtl);
					ope.up2().add(opeDtl);

					for (Chk02_IoR chdIo : chdIoL) {
						Purc_Ins01_IoR opeIo = ope.up3().createRow();
						opeIo.peg_no(chdIo.peg_no());
						opeIo.setAttributes(chdIo);
						ope.up3().add(opeIo);
					}
				}
			}

			if (!ope.up1().isEmpty()) {
				
				ope.up0().purc_ddlv_reg_exec_flg(true);
				ope.exec();
			}
		}

		/**
		 * 	上り電文(Chk02_HdrR) -> 与信サービス 上り電文(Cred_Upd01_CndR) 
		 * @return
		 */
		protected Map_Cred_Upd01_CndR_Chk02_HdrR<Cred_Upd01_CndR, Chk02_HdrR> createMap_Cred_Upd01_CndR_Chk02_HdrR() {
			return new Map_Cred_Upd01_CndR_Chk02_HdrR<Cred_Upd01_CndR, Chk02_HdrR>();
		}

		public class Map_Cred_Upd01_CndR_Chk02_HdrR<D extends Cred_Upd01_CndR, S extends Chk02_HdrR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Cred_Upd01_CndR.$cst_cd, Chk01_HdrR.$cst_cd);
				addColumnPathMap(Cred_Upd01_CndR.$cur_cd, Chk01_HdrR.$trd_cur_cd);
				addColumnPathMap(Cred_Upd01_CndR.$trd_ptn_typ, Chk01_HdrR.$trd_ptn_typ);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.cred_upd_typ(MSC_CRED_UPD_TYP.UPD.value());
			}
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
				addColumnPathMap(SlsAct_Upd01_HdrR.$dlv_slip_prnt_flg, Chk02_HdrR.$dlv_slip_out_flg);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				dest.ship_act_service_exec_flg(true);
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
				addColumnPathMap(SlsAct_Upd01_DtlR.$hdr_peg_no, Chk02_DtlR.$hdr_peg_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dtl_peg_no, Chk02_DtlR.$peg_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_act_d_no, Chk02_DtlR.$sls_act_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_act_d_seq, Chk02_DtlR.$sls_act_d_seq);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_schd_no, Chk02_DtlR.$sls_schd_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ship_schd_no, Chk02_DtlR.$ship_schd_no);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
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
				addColumnPathMap(SlsAct_Upd01_IoR.$hdr_peg_no, Chk02_IoR.$hdr_peg_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$dtl_peg_no, Chk02_IoR.$dtl_peg_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$io_peg_no, Chk02_IoR.$peg_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sls_act_io_no, Chk02_IoR.$sls_act_io_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sls_act_io_seq, Chk02_IoR.$sls_act_io_seq);
				addColumnPathMap(SlsAct_Upd01_IoR.$ship_act_d_no, Chk02_IoR.$ship_act_d_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sync_flg, Chk02_IoR.$sync_flg);
			}
		}

	}

	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 納品書を発行します。<br>
	 */
	public class Prnt01 extends MSBBL_PurcDdlvReg_MC_A.Prnt01 {
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
			dbSelectKey("MSBBL1360_MST_SLS_ACT_S03", rsltR, bldr, up0());
			
			// 最新の改訂番号のときのみ、訂正に対する取消を出力する
			return isSame(rsltR.sls_act_rev(), rsltR.getNumberNE("max_rev"));
		}
	}

	/**
	 * 	受注更新処理
	 * @param sloNo
	 */
	protected void updSlo(String sloNo) {

		// 受注情報を空更新
		MST_SLO_R slo = MST_SLO_R.create();
		MCQueryApiBuilder slo_bldr = MCQueryApiBuilder.create(MST_SLO_R.create("T"));
		slo.slo_no(sloNo);
		dbTsUpdateKey("MSBBL1360_MST_SLO_U01", slo, slo_bldr.getBaseDbc());
		// 受注改訂番号を取得
		dbSelectKey("MSBBL1360_MST_SLO_S03", slo, slo_bldr, sloNo);
		// 改訂履歴データ更新サービス呼出（受注改訂履歴テーブル更新）
		callRevDataServiceIns01(slo);
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
	 * 	受払実績サービスの呼出
	 */
	protected void callIoActSvUpd01() {
		MSBEL_IoActService.crtIoAct_Upd01().exec();
	}

	/**
	 * 	リストに対して任意のカラムをキーとしてグループ化したサブリストをマップに格納して返す。
	 * <p>
	 * 	
	 * </p>
	 * @param keyCols
	 * @param l
	 * @return
	 */
	protected <T extends MCRow> Map<Comparable<?>, MCList<T>> convList2Map(
			MCList<T> srcList, String keyCol) {

		Map<Comparable<?>, MCList<T>> retMap = new HashMap<Comparable<?>, MCList<T>>();

		if (!srcList.isEmpty() && srcList.get(0).contains(keyCol)) {

			for (MCList<T> grpList : srcList.groupList(keyCol)) {
				retMap.put(grpList.get(0).getValue(keyCol), grpList);
			}
		}

		return retMap;
	}

	/**
	 * 	紐付けＮＯの設定
	 */
	protected void setPegNoSub(Chk01_HdrR hdr, MCList<Chk01_DtlR> dtlL,
			MCList<Chk01_IoR> ioL) {

		setPegNo(hdr);
		setPegNo(dtlL);
		setPegNo(ioL);

		Map<Comparable<?>, MCList<Chk01_IoR>> ioLMap = convList2Map(ioL,
				Chk01_DtlR.$dtl_row_id);
		for (Chk01_DtlR parDtl : dtlL) {
			parDtl.hdr_peg_no(hdr.peg_no());
			for (Chk01_IoR chdIo : ioLMap.get(parDtl.dtl_row_id())) {
				chdIo.hdr_peg_no(hdr.peg_no());
				chdIo.dtl_peg_no(parDtl.peg_no());
			}
		}
	}

	/**
	 * 	紐付けＮＯの設定
	 */
	protected void setPegNoSubForChk02(Chk02_HdrR hdr, MCList<Chk02_DtlR> dtlL,
			MCList<Chk02_IoR> ioL) {

		setPegNo(hdr);
		setPegNo(dtlL);
		setPegNo(ioL);

		for (Chk02_DtlR parDtl : dtlL) {
			parDtl.hdr_peg_no(hdr.peg_no());
		}
	}
	
	/**
	 * 仕入同時計上の設定(明細⇒詳細)
	 * @param dtlL 売上実績明細
	 * @param ioL 売上実績受払
	 */
	protected void setSyncFlgForChk01(MCList<Chk01_DtlR> dtlL, MCList<Chk01_IoR> ioL) {

		Map<Comparable<?>, MCList<Chk01_IoR>> ioLMap = convList2Map(ioL, Chk01_DtlR.$dtl_row_id);
		
		for (Chk01_DtlR parDtl : dtlL) {
			
			if (parDtl.sync_flg()) {
				for (Chk01_IoR chdIo : ioLMap.get(parDtl.dtl_row_id())) {
					chdIo.sync_flg(true);
				}
			}
		}
	}
	
	/**
	 * 仕入同時計上の設定(明細⇒詳細)
	 * @param dtlL 売上実績明細
	 * @param ioL 売上実績受払
	 */
	protected void setSyncFlgForChk02(MCList<Chk02_DtlR> dtlL, MCList<Chk02_IoR> ioL) {

		Map<Comparable<?>, MCList<Chk02_IoR>> ioLMap = convList2Map(ioL, Chk02_DtlR.$dtl_row_id);
		
		for (Chk02_DtlR parDtl : dtlL) {
			
			if (parDtl.sync_flg()) {
				for (Chk02_IoR chdIo : ioLMap.get(parDtl.dtl_row_id())) {
					chdIo.sync_flg(true);
				}
			}
		}
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
			addColumnPathMap(SlsAct_Upd01_HdrR.$dlv_tm, Chk01_HdrR.$dlv_tm);
			addColumnPathMap(SlsAct_Upd01_HdrR.$cst_cd, Chk01_HdrR.$cst_cd);
			addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_cd1, Chk01_HdrR.$tterm_cd1);
			addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_rmrks1, Chk01_HdrR.$tterm_rmrks1);
			addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_cd2, Chk01_HdrR.$tterm_cd2);
			addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_rmrks2, Chk01_HdrR.$tterm_rmrks2);
			addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_cd3, Chk01_HdrR.$tterm_cd3);
			addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_rmrks3, Chk01_HdrR.$tterm_rmrks3);
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
			addColumnPathMap(SlsAct_Upd01_HdrR.$slo_no, Chk01_HdrR.$slo_no);
			addColumnPathMap(SlsAct_Upd01_HdrR.$qtn_no, Chk01_HdrR.$qtn_no);
			addColumnPathMap(SlsAct_Upd01_HdrR.$qtn_rev, Chk01_HdrR.$qtn_rev);
			addColumnPathMap(SlsAct_Upd01_HdrR.$sub_char1, Chk01_HdrR.$sub_char1);
			addColumnPathMap(SlsAct_Upd01_HdrR.$sub_char2, Chk01_HdrR.$sub_char2);
			addColumnPathMap(SlsAct_Upd01_HdrR.$sub_char3, Chk01_HdrR.$sub_char3);
			addColumnPathMap(SlsAct_Upd01_HdrR.$dlv_slip_prnt_flg,
					Chk01_HdrR.$dlv_slip_out_flg);
			addColumnPathMap(SlsAct_Upd01_HdrR.$sls_basis_typ, Chk01_HdrR.$sls_basis_typ);
			
			
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
			dest.ddlv_sls_flg(true);
			dest.iv_no(MAC_STR.NULL_VAL.value());
			dest.ship_act_service_exec_flg(true);
			dest.ship_tm(src.dlv_tm());
			dest.amt_calc_flg(false);
		}
	}

	/**
	 * 	上り電文(Chk01_DtlR) -> 売上実績サービス.上り電文(SlsAct_Upd01_DtlR) (新規・更新時共通)
	 * @return
	 */
	protected Map_SlsAct_Upd01_DtlR_Chk01_DtlR<SlsAct_Upd01_DtlR, Chk01_DtlR> createMap_SlsAct_Upd01_DtlR_Chk01_DtlR(
			Chk01_HdrR hdr) {
		return new Map_SlsAct_Upd01_DtlR_Chk01_DtlR<SlsAct_Upd01_DtlR, Chk01_DtlR>(hdr);
	}

	public class Map_SlsAct_Upd01_DtlR_Chk01_DtlR<D extends SlsAct_Upd01_DtlR, S extends Chk01_DtlR>
			extends MCRowMapper<D, S> {

		public Map_SlsAct_Upd01_DtlR_Chk01_DtlR(Chk01_HdrR hdr) {
			_hdr = hdr;
		}

		Chk01_HdrR _hdr;

		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(SlsAct_Upd01_DtlR.$hdr_peg_no, Chk01_DtlR.$hdr_peg_no);
			addColumnPathMap(SlsAct_Upd01_DtlR.$dtl_peg_no, Chk01_DtlR.$peg_no);
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
			addColumnPathMap(SlsAct_Upd01_DtlR.$pri_prnt_flg, Chk01_DtlR.$pri_prnt_flg);
			addColumnPathMap(SlsAct_Upd01_DtlR.$dest_cd1, Chk01_DtlR.$dest_cd1);
			addColumnPathMap(SlsAct_Upd01_DtlR.$dest_cd2, Chk01_DtlR.$dest_cd2);
			addColumnPathMap(SlsAct_Upd01_DtlR.$dest_cd3, Chk01_DtlR.$dest_cd3);
			addColumnPathMap(SlsAct_Upd01_DtlR.$itm_cd, Chk01_DtlR.$itm_cd);
			addColumnPathMap(SlsAct_Upd01_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub1);
			addColumnPathMap(SlsAct_Upd01_DtlR.$itm_sub2, Chk01_DtlR.$itm_sub2);
			addColumnPathMap(SlsAct_Upd01_DtlR.$itm_sub3, Chk01_DtlR.$itm_sub3);
			addColumnPathMap(SlsAct_Upd01_DtlR.$sno1, Chk01_DtlR.$sno1);
			addColumnPathMap(SlsAct_Upd01_DtlR.$sno2, Chk01_DtlR.$sno2);
			addColumnPathMap(SlsAct_Upd01_DtlR.$sno3, Chk01_DtlR.$sno3);
			addColumnPathMap(SlsAct_Upd01_DtlR.$sno4, Chk01_DtlR.$sno4);
			addColumnPathMap(SlsAct_Upd01_DtlR.$itm_nm, Chk01_DtlR.$itm_nm);
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
			addColumnPathMap(SlsAct_Upd01_DtlR.$slo_d_no, Chk01_DtlR.$slo_d_no);
			addColumnPathMap(SlsAct_Upd01_DtlR.$sls_schd_no, Chk01_DtlR.$sls_schd_no);
			addColumnPathMap(SlsAct_Upd01_DtlR.$qtn_d_no, Chk01_DtlR.$qtn_d_no);
			addColumnPathMap(SlsAct_Upd01_DtlR.$purc_ddlv_po_no, Chk01_DtlR.$po_no);
			addColumnPathMap(SlsAct_Upd01_DtlR.$purc_ddlv_po_d_no, Chk01_DtlR.$po_d_no);
			addColumnPathMap(SlsAct_Upd01_DtlR.$purc_act_no, Chk01_DtlR.$purc_act_no);
			addColumnPathMap(SlsAct_Upd01_DtlR.$purc_act_d_no, Chk01_DtlR.$purc_act_d_no);
			addColumnPathMap(SlsAct_Upd01_DtlR.$sub_char1, Chk01_DtlR.$sub_char1);
			addColumnPathMap(SlsAct_Upd01_DtlR.$sub_char2, Chk01_DtlR.$sub_char2);
			addColumnPathMap(SlsAct_Upd01_DtlR.$sub_char3, Chk01_DtlR.$sub_char3);
			addColumnPathMap(SlsAct_Upd01_DtlR.$dscnt_rsn_cd, Chk01_DtlR.$dscnt_rsn_cd);
			addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_slip_d_no, Chk01_DtlR.$dlv_slip_d_no);
			addColumnPathMap(SlsAct_Upd01_DtlR.$purc_ddlv_dlv_slip_d_no, Chk01_DtlR.$dlv_slip_d_no);
			addColumnPathMap(SlsAct_Upd01_DtlR.$sls_schd_abort_flg, Chk01_DtlR.$abort_flg);
			addColumnPathMap(SlsAct_Upd01_DtlR.$ship_schd_no, Chk01_DtlR.$ship_schd_no);
			addColumnPathMap(SlsAct_Upd01_DtlR.$cost_upri, Chk01_DtlR.$cost_upri);
			addColumnPathMap(SlsAct_Upd01_DtlR.$cost_amt, Chk01_DtlR.$cost_amt);
			addColumnPathMap(SlsAct_Upd01_DtlR.$ext_sys_cd, Chk01_DtlR.$ext_sys_cd);
			addColumnPathMap(SlsAct_Upd01_DtlR.$ext_purc_act_d_no, Chk01_DtlR.$ext_purc_act_d_no);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.data_crud_typ(getDataCrudTyp(src));
			dest.qtn_no(_hdr.qtn_no());
			dest.qtn_rev(_hdr.qtn_rev());
			dest.slo_no(_hdr.slo_no());
			if (isNull(src.slo_d_no())) {
				if (isNull(src.sno1())) {
					dest.sno1(MAC_STR.NULL_VAL.value());
				}
				if (isNull(src.sno2())) {
					dest.sno2(MAC_STR.NULL_VAL.value());
				}
				if (isNull(src.sno3())) {
					dest.sno3(MAC_STR.NULL_VAL.value());
				}
				if (isNull(src.sno4())) {
					dest.sno4(MAC_STR.NULL_VAL.value());
				}
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
			addColumnPathMap(SlsAct_Upd01_IoR.$hdr_peg_no, Chk01_IoR.$hdr_peg_no);
			addColumnPathMap(SlsAct_Upd01_IoR.$dtl_peg_no, Chk01_IoR.$dtl_peg_no);
			addColumnPathMap(SlsAct_Upd01_IoR.$io_peg_no, Chk01_IoR.$peg_no);
			addColumnPathMap(SlsAct_Upd01_IoR.$sls_act_io_no, Chk01_IoR.$sls_act_io_no);
			addColumnPathMap(SlsAct_Upd01_IoR.$sls_act_io_seq, Chk01_IoR.$sls_act_io_seq);
			addColumnPathMap(SlsAct_Upd01_IoR.$arr_act_no, Chk01_IoR.$arr_act_no);
			addColumnPathMap(SlsAct_Upd01_IoR.$ship_act_d_no, Chk01_IoR.$ship_act_d_no);
			addColumnPathMap(SlsAct_Upd01_IoR.$purc_act_io_no, Chk01_IoR.$purc_act_io_no);
			addColumnPathMap(SlsAct_Upd01_IoR.$sno1, Chk01_IoR.$sno1);
			addColumnPathMap(SlsAct_Upd01_IoR.$sno2, Chk01_IoR.$sno2);
			addColumnPathMap(SlsAct_Upd01_IoR.$sno3, Chk01_IoR.$sno3);
			addColumnPathMap(SlsAct_Upd01_IoR.$sno4, Chk01_IoR.$sno4);
			addColumnPathMap(SlsAct_Upd01_IoR.$gd_cd, Chk01_IoR.$gd_cd);
			addColumnPathMap(SlsAct_Upd01_IoR.$lot_no, Chk01_IoR.$lot_no);
			addColumnPathMap(SlsAct_Upd01_IoR.$sublot_no, Chk01_IoR.$sublot_no);
			addColumnPathMap(SlsAct_Upd01_IoR.$trd_unit_cd, Chk01_IoR.$trd_unit_cd);
			addColumnPathMap(SlsAct_Upd01_IoR.$trd_unit_qty, Chk01_IoR.$trd_unit_qty);
			addColumnPathMap(SlsAct_Upd01_IoR.$base_unit_cd, Chk01_IoR.$base_unit_cd);
			addColumnPathMap(SlsAct_Upd01_IoR.$base_unit_qty, Chk01_IoR.$base_unit_qty);
			addColumnPathMap(SlsAct_Upd01_IoR.$sub_char1, Chk01_IoR.$sub_char1);
			addColumnPathMap(SlsAct_Upd01_IoR.$sub_char2, Chk01_IoR.$sub_char2);
			addColumnPathMap(SlsAct_Upd01_IoR.$sub_char3, Chk01_IoR.$sub_char3);
			addColumnPathMap(SlsAct_Upd01_IoR.$loc_cd, Chk01_IoR.$loc_cd);
			addColumnPathMap(SlsAct_Upd01_IoR.$str_ln_cd, Chk01_IoR.$str_ln_cd);
			addColumnPathMap(SlsAct_Upd01_IoR.$sync_flg, Chk01_IoR.$sync_flg);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.data_crud_typ(getDataCrudTyp(src));
			dest.pack_unit_cd(src.pack_flg() ? src.trd_unit_cd() : src.base_unit_cd());
			dest.pack_unit_qty(src.pack_flg() ? src.trd_unit_qty() : src.base_unit_qty());
			if (isNull(src.sno1())) {
				dest.sno1(MAC_STR.NULL_VAL.value());
			}
			if (isNull(src.sno2())) {
				dest.sno2(MAC_STR.NULL_VAL.value());
			}
			if (isNull(src.sno3())) {
				dest.sno3(MAC_STR.NULL_VAL.value());
			}
			if (isNull(src.sno4())) {
				dest.sno4(MAC_STR.NULL_VAL.value());
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
	 * 	上り電文(Chk01_HdrR) -> 与信サービス 上り電文(Cred_Upd01_CndR) 	(新規・更新時共通)
	 * @return
	 */
	protected Map_Cred_Upd01_CndR_Chk01_HdrR<Cred_Upd01_CndR, Chk01_HdrR> createMap_Cred_Upd01_CndR_Chk01_HdrR() {
		return new Map_Cred_Upd01_CndR_Chk01_HdrR<Cred_Upd01_CndR, Chk01_HdrR>();
	}

	public class Map_Cred_Upd01_CndR_Chk01_HdrR<D extends Cred_Upd01_CndR, S extends Chk01_HdrR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Cred_Upd01_CndR.$cst_cd, Chk01_HdrR.$cst_cd);
			addColumnPathMap(Cred_Upd01_CndR.$cur_cd, Chk01_HdrR.$trd_cur_cd);
			addColumnPathMap(Cred_Upd01_CndR.$trd_ptn_typ, Chk01_HdrR.$trd_ptn_typ);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			if (isNull(src.sls_act_no())) {
				dest.cred_upd_typ(MSC_CRED_UPD_TYP.UPD.value());
			}
		}

	}
	
	/**
	 * 有効成分の設定をする。
	 * @param srchDtlL 明細リスト
	 * @param srchIoL 詳細リスト
	 */
	protected void setCont(MCList<Srch01_DtlR> srchDtlL, MCList<Srch01_IoR> srchIoL) {

		MCIndexKey d2i = srchIoL.createIndex(Srch01_IoR.$dtl_row_id);
		for(Srch01_DtlR dr : srchDtlL) {
			
			MCList<Srch01_IoR> iol = srchIoL.subList(d2i, dr.dtl_row_id());
			iol.forEach(ior -> {
				MSBDL_PurcUtil.setCont(ior);
				MSBDL_PurcUtil.addCont(dr, ior);
			});	
		}
	}

	/** 場所マスタのキャッシュ */
	protected FXUCL_MCDbcCache<MAM_LOC_R> _loc;
	
	protected MAM_LOC_R getLocR(String locCd) {
		if (_loc == null) {
			_loc = new FXUCL_MCDbcCache<MAM_LOC_R>(MCQueryApiBuilder.create(MAM_LOC_R.create("T")));
		}
		return _loc.get(locCd);
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
			
			if (isNull(dtlR.trd_cur_amt()) || !isNull(dtlR.bd_dpt_cd())) {
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
	 * 売上予定を設定する。<br>
	 * 仕入同時計上の場合、行コピーで仕入実績を登録すると、売上予定NO、出荷予定NOが変わるため、再設定する。
	 * @param dtlL 仕入売上明細の上り電文
	 */
	protected void setSlsSchd(MCList<Chk01_DtlR> dtlL) {
		
		MCList<Chk01_DtlR> tgtL = dtlL.subList(r->!isNull(r.purc_act_d_no()) && !r.isStatusDelete() && r.sync_flg());
		
		if (!tgtL.isEmpty()) {
			MCList<MST_SLS_SCHD_R> slsSchdL = MCList.create(MST_SLS_SCHD_R.class);
			MST_SLS_SCHD_R slsSchd = MST_SLS_SCHD_R.create("SLSSCHD");
			MCQueryApiBuilder slsSchdL_bldr = MCQueryApiBuilder.create(slsSchd);
			slsSchdL_bldr.setSelect(slsSchd.sls_schd_no, slsSchd.ship_schd_no, slsSchd.purc_act_d_no);
			slsSchdL_bldr.setWhere(slsSchd.purc_act_d_no.eq(bind("purc_act_d_no")));
			dbSelect("MSBBL1360_MST_SLS_SCHD_S04", slsSchdL, slsSchdL_bldr, tgtL);
			
			MCIndexKey idxkey = slsSchdL.createIndex(MST_SLS_SCHD_R.$purc_act_d_no);
			
			for (Chk01_DtlR dtlR : tgtL) {
				MST_SLS_SCHD_R slsSchdR = slsSchdL.getFirst(idxkey, dtlR.purc_act_d_no());
				if (!isNull(slsSchdR)) {
					dtlR.sls_schd_no(slsSchdR.sls_schd_no());
					dtlR.ship_schd_no(slsSchdR.ship_schd_no());
				}
			}
		}
	}

	/**
	 * 改訂履歴データ更新サービスの改訂履歴データ更新リスト登録処理を呼び出す。
	 * 受注改訂履歴テーブルを更新する。
	 * @param sloR 受注ヘッダ
	 */
	protected void callRevDataServiceIns01(MST_SLO_R sloR) {
		MAUCL_RevDataService.RevData_Ins01 ope = MAUCL_RevDataService.crtRevData_Ins01();
		RevData_Ins01_DtlR opeR = RevData_Ins01_DtlR.create();
		opeR.rev_data_src_no(sloR.slo_no());
		opeR.rev_no(sloR.slo_rev());
		opeR.rev_data_typ(MAC_REV_DATA_TYP.MST_SLO.value());
		ope.up0().add(opeR);
		ope.exec();
	}
	/**
	 * Srch03オペレーション.<p>
	 *
	 * 納品書ＮＯに対応した未売上の仕入直送売上の売上予定情報を検索する<br>
	 */
	public class Srch03 extends MSBBL_PurcDdlvReg_MC_A.Srch03 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			
			callSrch01();
			
		}
		
		protected void callSrch01() {
			MSBBL_PurcDdlvReg.Srch01 o = MSBBL_PurcDdlvReg.crtSrch01();
			o.up0().srch_tgt_no(getSloNo());
			o.up0().purc_schd_dt(up0().purc_schd_dt());
			o.up0().dlv_slip_no(up0().srch_tgt_no());
			o.exec();
			MCRow.copyall(down0(), o.down0());
			down1().setAll(o.down1());
			down2().setAll(o.down2());
		}
		
		protected String getSloNo() {
			MST_DLV_SLIP_R t = MST_DLV_SLIP_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSelect(t.slo_no);
			bldr.setWhere(t.dlv_slip_no.eq(bind("1")), up0().srch_tgt_no());
			bldr.addWhereWithAnd(t.trn_typ.eq(value(MSC_TRN_TYP.PURC.value())));
			bldr.setOrderByDesc(t.dlv_slip_seq);
			
			MCList<MST_DLV_SLIP_R> rsltL = MCList.create(MST_DLV_SLIP_R.class);
			dbSelect("MSBBL1360_MST_DLV_SLIP_S01", rsltL, bldr);
			
			if (!rsltL.isEmpty()) {
				return rsltL.get(0).slo_no();
			}
			return null;
		}
	}

	//FMCB CUSTOM END
}