package mcframe.serverMSBE.MSBEL1710;

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
import static mcframe.serverMSBE.MSBEL1710.Query.*;
import mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil;
import mcframe.serverMSUC.MSUCL0020.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import java.util.ArrayList;
import java.util.List;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_IvTrgtSel"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_IvTrgtSel_MC extends MSBEL_IvTrgtSel_MC_A{
	//FMCB CUSTOM START
		/**
		 * 検索モード：出荷予定
		 */
		protected static final String SRCH_MODE_SHIP_SCHD = "0";
		
		/**
		 * 検索モード：出荷指図
		 */
		protected static final String SRCH_MODE_SHIP_INST = "1";
		
		/**
		 * 検索モード：出荷実績
		 */
		protected static final String SRCH_MODE_SHIP_ACT = "2";
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検索モードに従い、インボイス登録対象の出荷予定、出荷指図、出荷実績を検索する<br>
	 */
	public class Srch01 extends MSBEL_IvTrgtSel_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			setUpTmpCol(up0());

			MCQueryPlan sql = null;
			if (isSame(up0().srch_mode(), SRCH_MODE_SHIP_SCHD)) {
				sql = MSBEL1710_MST_SHIP_SCHD_S01();
			}
			else if (isSame(up0().srch_mode(), SRCH_MODE_SHIP_INST)) {
				sql = MSBEL1710_MST_SHIP_INST_D_S01();
			}
			else if (isSame(up0().srch_mode(), SRCH_MODE_SHIP_ACT)) {
				sql = MSBEL1710_MST_SHIP_ACT_D_S01(up0());
			}
			executeQuery(down0(), sql, up0());
			
			convTrdUnitQty();
			setRsltAmt();
			setSimCndGrpNo();
		}
		
		/**
		 * 基準単位数量を画面表示項目のＩ／Ｖ対象数量（＝取引単位数量）に変換する
		 * 理由：Ｉ／Ｖ対象数量から取り除く出荷予定.出荷返品数量は基準単位なので、一旦基準単位数量として抽出したあとに取引単位に換算する。
		 */
		protected void convTrdUnitQty() {
			for(Srch01_RsltR dR : down0()) {
				if(isSame(dR.trd_unit_cd(), dR.base_unit_cd())) {
					dR.trd_unit_qty(dR.base_unit_qty());
				}
				else {
					MCNumber convQty = rvrsBaseUnitConv(dR.base_unit_qty(),
							dR.trd_unit_conv_base_qty(), dR.trd_unit_conv_qty(),
							dR.trd_unit_dec_place(), dR.trd_unit_rnd_typ());
					MCNumber reEntQty = convToBaseUnit(convQty,
							dR.trd_unit_conv_base_qty(), dR.trd_unit_conv_qty(),
							dR.base_unit_dec_place(), dR.base_unit_rnd_typ());
					if(isSame(reEntQty, dR.base_unit_qty())) {
						dR.trd_unit_qty(convQty);
					}
					else {
						dR.trd_unit_qty(dR.base_unit_qty());
						dR.trd_unit_cd(dR.base_unit_cd());
						dR.trd_unit_nm(dR.base_unit_nm());
						dR.trd_unit_dec_place(dR.base_unit_dec_place());
						dR.trd_unit_rnd_typ(dR.base_unit_rnd_typ());
						dR.trd_unit_conv_base_qty(1);
						dR.trd_unit_conv_qty(1);
					}
				}
			}
		}
		
		/**
		 * 明細の金額を計算する
		 */
		protected void setRsltAmt() {
			
			setPegNo(down0());

			MSUCL_ConvQtyAmtUtil.ConvQtyAmtUtil_Calc02 ope = MSUCL_ConvQtyAmtUtil.crtConvQtyAmtUtil_Calc02();

			for (Srch01_RsltR dR : down0()) {

				//取引パタン：移動・移送 or 移動・移送返品
				if(MAC_TRD_PTN_TYP.isXFR(dR.trd_ptn_typ()) 
					|| MAC_TRD_PTN_TYP.isXFR_RTN(dR.trd_ptn_typ())) { 
					setAmtXfr(dR);
					continue;
				}
				else if (MAC_TRD_PTN_TYP.isPROV(dR.trd_ptn_typ()) 
						&& (MAC_PROV_BASIS_TYP.isINPT(dR.prov_basis_typ()) || isNull(dR.prov_basis_typ()))) {
					setAmtXfr(dR);
					continue;
				}
				
				ConvQtyAmtUtil_Calc01_HdrR opeHdr = ope.up0().createRow();
				copy(opeHdr, dR, createMap_ConvQtyAmtUtil_Calc01_HdrR_Srch01_RsltR());
				ope.up0().add(opeHdr);
				
				ConvQtyAmtUtil_Calc01_Dtl1R opeDtl = ope.up1().createRow();
				copy(opeDtl, dR, createMap_ConvQtyAmtUtil_Calc01_Dtl1R_Srch01_RsltR());
				ope.up1().add(opeDtl);
			}
			ope.exec();

			String[] destCols = new String[] {
					Srch01_RsltR.$trd_cur_upri, Srch01_RsltR.$trd_cur_dscnt_amt,
					Srch01_RsltR.$trd_cur_amt, Srch01_RsltR.$trd_cur_tax_amt,
					Srch01_RsltR.$trd_cur_inc_tax_amt
			};
			String[] srcCols = new String[] {
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_upri,
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_dscnt_amt,
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_amt,
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_tax_amt,
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_inc_tax_amt
			};
			copyByPegNo(down0(), destCols, ope.down0(), srcCols);

			// インボイス表記金額
			MSUCL_ConvQtyAmtUtil.ConvQtyAmtUtil_Calc02 opeIv = MSUCL_ConvQtyAmtUtil.crtConvQtyAmtUtil_Calc02();

			for (Srch01_RsltR dR : down0()) {

				if(!isNull(dR.trd_cur_upri()) && !dR.trd_cur_upri().isZero()) {
					dR.iv_upri(dR.trd_cur_upri());
					dR.iv_amt(dR.trd_cur_amt());
					continue;
				}
				else if (isNull(dR.iv_upri())) {
					dR.iv_upri(0);
					dR.iv_amt(0);
					continue;
				}

				ConvQtyAmtUtil_Calc01_HdrR opeHdrIv = opeIv.up0().createRow();
				copy(opeHdrIv, dR, createMap_ConvQtyAmtUtil_Calc01_HdrR_Srch01_RsltR_Iv());
				opeIv.up0().add(opeHdrIv);
				
				ConvQtyAmtUtil_Calc01_Dtl1R opeDtlIv = opeIv.up1().createRow();
				copy(opeDtlIv, dR, createMap_ConvQtyAmtUtil_Calc01_Dtl1R_Srch01_RsltR());
				opeIv.up1().add(opeDtlIv);
			}
			opeIv.exec();

			String[] destIvCols = new String[] {
					Srch01_RsltR.$iv_upri, 
					Srch01_RsltR.$iv_amt
			};
			String[] srcIvCols = new String[] {
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_upri,
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_amt,
			};
			copyByPegNo(down0(), destIvCols, opeIv.down0(), srcIvCols);

		}
		
		/**
		 * 移送用の金額設定
		 * 
		 * @param dR
		 */
		protected void setAmtXfr(Srch01_RsltR dR) {
			dR.trd_cur_upri(0);
			dR.trd_cur_amt(0);
			dR.trd_cur_inc_tax_amt(0);
			dR.trd_cur_tax_amt(0);
		}
		
		/**
		 * 検索条件に対する一時カラムを設定する
		 * @param up
		 */
		protected void setUpTmpCol(Srch01_CndR up) {
			// 運用日付を追加
			up.addDateColumn("today", getToday());
			setUpTmpColPrSts(up);
		}
		
		/**
		 * 検索条件（進捗状況区分）に対する一時カラムを設定する。
		 * @param cndR 検索条件
		 */
		protected void setUpTmpColPrSts(Srch01_CndR cndR) {
			
			List<String> prStsL = new ArrayList<String>();
			
			if (cndR.not_inst_flg()) {
				prStsL.add(MSC_PR_STS_TYP.NOT_INST.value());
			}
			if (cndR.inst_flg()) {
				prStsL.add(MSC_PR_STS_TYP.INST.value());
			}
			if (cndR.not_ship_flg()) {
				prStsL.add(MSC_PR_STS_TYP.NOT_SHIP.value());
			}
			if (cndR.part_ship_flg()) {
				prStsL.add(MSC_PR_STS_TYP.PART_SHIP.value());
			}
			if (cndR.ship_flg()) {
				prStsL.add(MSC_PR_STS_TYP.SHIP.value());
			}
			cndR.addStringColumn(MSC_PR_STS_TYP.$VALUE, MCStringUtil.arrayValueJoin(prStsL.toArray(new String[0])));
		}
		
		/**
		 * 相似条件グループＮＯを設定する
		 * 
		 */
		protected void setSimCndGrpNo(){
			for (Srch01_RsltR r : down0()) {
				if (r.xrate_inpt_flg()) {
					r.sim_cnd_xrate(r.xrate());
				}
				if (r.ptax_xrate_inpt_flg()) {
					r.sim_cnd_ptax_xrate(r.ptax_xrate());
				}
			}
			MCList<Srch01_RsltR>[] simCndGrpL = down0().groupList(grpSimCndGrpCol());
			int simCndGrpNo  = 1;
			for(MCList<Srch01_RsltR> grpL: simCndGrpL){
				grpL.setNumber(Srch01_RsltR.$sim_cnd_grp_no,  simCndGrpNo);
				simCndGrpNo++;
			}
		}
		/**
		 * 相似条件グループとなるカラム名配列を返す。<p>
		 * @return　相似条件グループＮＯとなるカラム名配列
		 */
		protected String[] grpSimCndGrpCol(){
			Srch01_RsltR row = Srch01_RsltR.create();
			return row.getKeys(Srch01_RsltR.$$SIM_CND_GRP).toArray(new String[0]);
		}
		
		/**
		 * 下り電文(Srch01_RsltR) -> 単位・金額換算ユーティリティ.上り電文(ConvQtyAmtUtil_Calc01_HdrR)
		 * @return
		 */
		protected Map_ConvQtyAmtUtil_Calc01_HdrR_Srch01_RsltR<ConvQtyAmtUtil_Calc01_HdrR, Srch01_RsltR> createMap_ConvQtyAmtUtil_Calc01_HdrR_Srch01_RsltR() {
			return new Map_ConvQtyAmtUtil_Calc01_HdrR_Srch01_RsltR<ConvQtyAmtUtil_Calc01_HdrR, Srch01_RsltR>();
		}

		public class Map_ConvQtyAmtUtil_Calc01_HdrR_Srch01_RsltR<D extends ConvQtyAmtUtil_Calc01_HdrR, S extends Srch01_RsltR>
				extends MCRowMapper<D, S> {

			@Override
			protected void setupColumnPathMap() {
				
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$peg_no, Srch01_RsltR.$peg_no);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_cd, Srch01_RsltR.$trd_cur_cd);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$amt_dec_place, Srch01_RsltR.$amt_dec_place);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$upri_dec_place, Srch01_RsltR.$upri_dec_place);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$amt_rnd_typ, Srch01_RsltR.$amt_rnd_typ);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$tax_rnd_typ, Srch01_RsltR.$tax_rnd_typ);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_cd, Srch01_RsltR.$schd_trd_unit_cd);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_qty, Srch01_RsltR.$schd_trd_unit_qty);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$schd_base_unit_qty, Srch01_RsltR.$schd_base_unit_qty);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_upri, Srch01_RsltR.$schd_trd_cur_upri);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_dscnt_amt, Srch01_RsltR.$schd_trd_cur_dscnt_amt);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_amt, Srch01_RsltR.$schd_trd_cur_amt);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_tax_amt, Srch01_RsltR.$schd_trd_cur_tax_amt);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$base_unit_dec_place, Srch01_RsltR.$base_unit_dec_place);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$base_unit_rnd_typ, Srch01_RsltR.$base_unit_rnd_typ);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_conv_qty, Srch01_RsltR.$schd_trd_unit_conv_qty);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_conv_base_qty, Srch01_RsltR.$schd_trd_unit_conv_base_qty);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$tax_rate,  Srch01_RsltR.$tax_rate);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$inc_tax_flg, Srch01_RsltR.$inc_tax_flg);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				if (!isNullOr(src.schd_trd_cur_amt(), src.schd_trd_cur_tax_amt())) {
					dest.trd_cur_inc_tax_amt(src.schd_trd_cur_amt().add(src.schd_trd_cur_tax_amt()));
				}
				if (MAC_TRD_PTN_TYP.isPROV(src.trd_ptn_typ())) {
					dest.trd_unit_cd(src.base_unit_cd());
					dest.trd_unit_qty(src.schd_base_unit_qty());
					dest.trd_unit_conv_qty(1);
					dest.trd_unit_conv_base_qty(1);
				}
			}
		}
				
		/**
		 * 下り電文(Srch01_RsltR) -> 単位・金額換算ユーティリティ.上り電文(ConvQtyAmtUtil_Calc01_HdrR)
		 * @return
		 */
		protected Map_ConvQtyAmtUtil_Calc01_HdrR_Srch01_RsltR_Iv<ConvQtyAmtUtil_Calc01_HdrR, Srch01_RsltR> createMap_ConvQtyAmtUtil_Calc01_HdrR_Srch01_RsltR_Iv() {
			return new Map_ConvQtyAmtUtil_Calc01_HdrR_Srch01_RsltR_Iv<ConvQtyAmtUtil_Calc01_HdrR, Srch01_RsltR>();
		}
	
		public class Map_ConvQtyAmtUtil_Calc01_HdrR_Srch01_RsltR_Iv<D extends ConvQtyAmtUtil_Calc01_HdrR, S extends Srch01_RsltR>
				extends MCRowMapper<D, S> {
	
			@Override
			protected void setupColumnPathMap() {
				
				// 取引通貨単価とインボイス単価が異なるのは、取引通貨単価が0（無償）の場合であり、この場合は値引額の指定はない
				// インボイス金額は税抜金額なので、税に関する項目は設定しない。

				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$peg_no, Srch01_RsltR.$peg_no);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_cd, Srch01_RsltR.$trd_cur_cd);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$amt_dec_place, Srch01_RsltR.$amt_dec_place);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$upri_dec_place, Srch01_RsltR.$upri_dec_place);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$amt_rnd_typ, Srch01_RsltR.$amt_rnd_typ);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$tax_rnd_typ, Srch01_RsltR.$tax_rnd_typ);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_cd, Srch01_RsltR.$schd_trd_unit_cd);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_qty, Srch01_RsltR.$schd_trd_unit_qty);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_upri, Srch01_RsltR.$iv_upri);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_amt, Srch01_RsltR.$schd_iv_amt);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$base_unit_dec_place, Srch01_RsltR.$base_unit_dec_place);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$base_unit_rnd_typ, Srch01_RsltR.$base_unit_rnd_typ);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_conv_qty, Srch01_RsltR.$schd_trd_unit_conv_qty);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_conv_base_qty, Srch01_RsltR.$schd_trd_unit_conv_base_qty);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				if (MAC_TRD_PTN_TYP.isPROV(src.trd_ptn_typ())) {
					dest.trd_unit_cd(src.base_unit_cd());
					dest.trd_unit_qty(src.schd_base_unit_qty());
					dest.trd_unit_conv_qty(1);
					dest.trd_unit_conv_base_qty(1);
				}
			}
		}

		/**
		 * 下り電文(Srch01_RsltR) -> 単位・金額換算ユーティリティ.上り電文(ConvQtyAmtUtil_Calc01_Dtl1R)
		 * @return
		 */
		protected Map_ConvQtyAmtUtil_Calc01_Dtl1R_Srch01_RsltR<ConvQtyAmtUtil_Calc01_Dtl1R, Srch01_RsltR> createMap_ConvQtyAmtUtil_Calc01_Dtl1R_Srch01_RsltR() {
			return new Map_ConvQtyAmtUtil_Calc01_Dtl1R_Srch01_RsltR<ConvQtyAmtUtil_Calc01_Dtl1R, Srch01_RsltR>();
		}

		public class Map_ConvQtyAmtUtil_Calc01_Dtl1R_Srch01_RsltR<D extends ConvQtyAmtUtil_Calc01_Dtl1R, S extends Srch01_RsltR>
				extends MCRowMapper<D, S> {

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$hdr_peg_no, Srch01_RsltR.$peg_no);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$peg_no, Srch01_RsltR.$peg_no);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_qty, Srch01_RsltR.$trd_unit_qty);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_cd, Srch01_RsltR.$trd_unit_cd);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_conv_qty, Srch01_RsltR.$trd_unit_conv_qty);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_conv_base_qty, Srch01_RsltR.$trd_unit_conv_base_qty);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				if (MAC_TRD_PTN_TYP.isPROV(src.trd_ptn_typ())) {
					dest.trd_unit_qty(src.base_unit_qty());
					dest.trd_unit_cd(src.base_unit_cd());
					dest.trd_unit_conv_qty(1);
					dest.trd_unit_conv_base_qty(1);
				}
			}
		}
	}

	//FMCB CUSTOM END
}