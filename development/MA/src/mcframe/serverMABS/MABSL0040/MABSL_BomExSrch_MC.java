package mcframe.serverMABS.MABSL0040;

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
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMABS.MABSL0010.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABS.MABSL0040.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABS.MABSL0090.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABS.MABSL0110.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABS.MABSL0150.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABS.MABSL0170.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABS.MABSL0190.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABS.MABSL0800.*;	// このimportはFrameManagerの自動生成で追加されました。
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.math.RoundingMode;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MABSL_BomExSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABSL_BomExSrch_MC extends MABSL_BomExSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * BOMに対する展開情報を検索します。<br>
	 */
	public class Srch01 extends MABSL_BomExSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			callProc();

			super.doIt();
		}

		protected void callProc() {
			// 正展開
			if (isSame(up0().ope(), "1")) {
				String procId = "MAPA_BOM$P_INS_BOM_EX";
				execProc(createSqlId(LOGIC_ID, procId, "01"), procId, up0(), null,
						":ITM_CD, :ITM_SUB1, :ITM_SUB2, :ITM_SUB3, "
								+ ":BOM_PTN, :WG_CD, :BASE_DT, :PH_EX_FLG, :BOM_PTN_FLG, :MAX_HRRCHY, "
								+ ":SNO1, :SNO2, :SNO3, :SNO4");
			}
			// 逆展開
			else {
				String procId = "MAPA_BOM$P_INS_BOM_EX_REV";
				execProc(createSqlId(LOGIC_ID, procId, "01"), procId, up0(), null,
						":ITM_CD, :ITM_SUB1, :ITM_SUB2, :ITM_SUB3, "
								+ ":BOM_PTN, :WG_CD, :BASE_DT, :PH_EX_FLG, :BOM_PTN_FLG, :MAX_HRRCHY, :VER_NO, "
								+ ":SNO1, :SNO2, :SNO3, :SNO4");
			}
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);

			dbcCustomizeSub(builder, rslt);
		}

		protected <R extends MCDBContainer> void dbcCustomizeSub(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			MAM_WG_R wg1 = MAM_WG_R.create("WG1");
			MAM_ITM_R itm1 = MAM_ITM_R.create("ITM1");
			MAM_ITM_TYP_D_R itm_typ_d1 = MAM_ITM_TYP_D_R.create("ITM_TYP_D1");
			MAM_ITM_R itm2 = MAM_ITM_R.create("ITM2");
			MAM_UNIT_R unit1 = MAM_UNIT_R.create("UNIT1");
			MAM_OPER_R oper1 = MAM_OPER_R.create("OPER1");
			MAM_ALT_GRP_R alt_grp1 = MAM_ALT_GRP_R.create("ALT_GRP1");
			MAW_BOM_EX_R t = MAW_BOM_EX_R.create(builder.getBaseDbcAlias());

			builder.addLeftOuterJoin(wg1, wg1.wg_cd.eq(t.wg_cd));
			builder.addLeftOuterJoin(itm1,
					itm1.itm_cd.eq(t.itm_cd)
					.and(itm1.itm_sub1.eq(t.itm_sub1))
					.and(itm1.itm_sub2.eq(t.itm_sub2))
					.and(itm1.itm_sub3.eq(t.itm_sub3)));
			builder.addLeftOuterJoin(itm_typ_d1, itm_typ_d1.itm_typ.eq(itm1.itm_typ)
					.and(itm_typ_d1.itm_typ_d_cd.eq(itm1.itm_typ_d_cd)));
			builder.addLeftOuterJoin(itm2,
					itm2.itm_cd.eq(t.par_itm_cd)
					.and(itm2.itm_sub1.eq(t.par_itm_sub1))
					.and(itm2.itm_sub2.eq(t.par_itm_sub2))
					.and(itm2.itm_sub3.eq(t.par_itm_sub3)));
			builder.addLeftOuterJoin(unit1, unit1.unit_cd.eq(itm1.unit_cd));
			builder.addLeftOuterJoin(oper1, oper1.oper_cd.eq(t.oper_cd));
			builder.addLeftOuterJoin(alt_grp1,
					alt_grp1.alt_grp_cd.eq(t.alt_grp_cd)
					.and(alt_grp1.wg_cd.eq(t.wg_cd)));

			builder.addSelect(wg1.wg_nm);
			builder.addSelect(itm1.itm_nm);
			builder.addSelect(itm1.itm_typ);
			builder.addSelect(itm1.itm_typ_d_cd);
			builder.addSelect(itm_typ_d1.itm_typ_d_nm);
			builder.addSelect(itm1.lot_mng_typ);
			builder.addSelect(itm1.sublot_mng_typ);
			builder.addSelect(itm1.sno1_mng_typ);
			builder.addSelect(itm1.sno2_mng_typ);
			builder.addSelect(itm1.sno3_mng_typ);
			builder.addSelect(itm1.sno4_mng_typ);
			builder.addSelect(itm1.cont_fctr_flg);
			builder.addSelect(itm1.stk_mng_typ);
			builder.addSelect(itm1.unit_cd.as("chd_unit_cd"));
			builder.addSelect(itm1.dec_place.as("chd_dec_place"));
			builder.addSelect(unit1.unit_nm.as("chd_unit_nm"));
			builder.addSelect(itm2.unit_cd);
			builder.addSelect(itm2.dec_place);
			builder.addSelect(oper1.oper_nm);
			builder.addSelect(alt_grp1.alt_grp_nm);

			builder.removeSelect(MAW_BOM_EX_R.$sort_no);
			builder.removeSelect(MAW_BOM_EX_R.$par_sort_no);

			builder.setWhere(value(0).eq(value(0)));

			builder.addOrderByAsc(t.sort_no);

			rslt.addBooleanColumn("cont_fctr_flg");
		}

		@Override
		protected void down() {
			super.down();

			setExtno(down0());
		}

		protected void setExtno(MCList<Srch01_Rslt0R> l) {
			Map<MCNumber, MCNumber> ext_map = new HashMap<MCNumber, MCNumber>();
			Map<MCNumber, MCNumber> rqmt_map = new HashMap<MCNumber, MCNumber>();
			Map<MCNumber, MCNumber> inpt_map = new HashMap<MCNumber, MCNumber>();
			MCNumber num = MCNumber.ONE;
			MCNumber curr_lvl ;
			ext_map.put(MCNumber.ZERO, null);
			rqmt_map.put(MCNumber.ZERO, up0().base_qty());
			inpt_map.put(MCNumber.ZERO, up0().base_qty());

			for (Srch01_Rslt0R r : l) {
				curr_lvl = r.bom_lvl();

				//ひとつ上のLEVELのext_noをpar_extnoに設定
				r.par_extno(ext_map.get(curr_lvl.subtract(1)));
				r.extno(num);
				ext_map.put(curr_lvl, num);
				num = num.add(1);

				// 換算必要数量、換算投入数量計算
				// 正展開
				if (isSame(up0().ope(), "1")) {
					if (!curr_lvl.isZero()) {
						MCNumber rqmtQty = convQty(rqmt_map.get(curr_lvl.subtract(1)), r.chd_rqmt_qty(), r, true);
						MCNumber inptQty = convQty(inpt_map.get(curr_lvl.subtract(1)), r.chd_inpt_qty(), r, false);
						rqmt_map.put(curr_lvl, rqmtQty);
						inpt_map.put(curr_lvl, inptQty);
						r.conv_rqmt_qty(rqmtQty);
						r.conv_inpt_qty(inptQty);
					}
				}
				// 逆展開
				else {
					if (!curr_lvl.isZero()) {
						MCNumber rqmtQty = convQtyR(rqmt_map.get(curr_lvl.subtract(1)), r.chd_rqmt_qty(), r, true);
						MCNumber inptQty = convQtyR(inpt_map.get(curr_lvl.subtract(1)), r.chd_inpt_qty(), r, false);
						rqmt_map.put(curr_lvl, rqmtQty);
						inpt_map.put(curr_lvl, inptQty);
						r.conv_rqmt_qty(rqmtQty);
						r.conv_inpt_qty(inptQty);
					}
				}
			}
		}

		/**
		 * 換算数量計算（正展開）<p>
		 * 
		 * 換算数量＝基準数量×（子数量×代替品目比率（※））÷親指図数量＋子固定必要数量（※）<br>
		 * 
		 * （※）子固定必要数量は必要数のみ加味する<br>
		 * 
		 * （※）代替品目ＦＬＧ＝オフの場合は代替品目比率＝１で計算する<br>
		 * 
		 * @param baseQty 基準数量
		 * @param chdQty 子数量
		 * @param r 対象レコード
		 * @param isRqmt 必要数かどうか
		 */
		protected MCNumber convQty(MCNumber baseQty, MCNumber chdQty, Srch01_Rslt0R r, boolean isRqmt) {
			if (isNullOr(baseQty, chdQty, r.par_inst_qty()) || r.par_inst_qty().isZero()) {
				return null;
			}
			if (r.alt_itm_flg() && isNull(r.alt_itm_ratio())) {
				return null;
			}
			int decPlace = nvl(r.chd_dec_place(), MCNumber.ZERO).intValue();
			RoundingMode rndMode = MAC_RND_TYP.RNDUP.toMC();
			MCNumber altItmRatio = r.alt_itm_flg() ? r.alt_itm_ratio() : MCNumber.ONE;
			MCNumber fxdChdRqmtQty = isRqmt ? nvl(r.fxd_chd_rqmt_qty(), MCNumber.ZERO) : MCNumber.ZERO;

			return baseQty.multiply(chdQty.multiply(altItmRatio)).divide(r.par_inst_qty(), decPlace, rndMode)
					.add(fxdChdRqmtQty);
		}
		/**
		 * 換算数量計算（逆展開）<p>
		 * 
		 * 換算数量＝（基準数量－子固定必要数量（※））×親指図数量÷子数量÷代替品目比率（※）<br>
		 * 
		 * （※）子固定必要数量は必要数のみ加味する<br>
		 * 
		 * （※）代替品目ＦＬＧ＝オフの場合は代替品目比率＝１で計算する<br>
		 * 
		 * @param baseQty 基準数量
		 * @param chdQty 子数量
		 * @param r 対象レコード
		 * @param isRqmt 必要数かどうか
		 */
		protected MCNumber convQtyR(MCNumber baseQty, MCNumber chdQty, Srch01_Rslt0R r, boolean isRqmt) {
			if (isNullOr(baseQty, chdQty, r.par_inst_qty())) {
				return null;
			}
			if (r.par_inst_qty().isZero() || chdQty.isZero()) {
				return MCNumber.ZERO;
			}
			if (r.alt_itm_flg() && isNull(r.alt_itm_ratio())) {
				return MCNumber.ZERO;
			}
			int decPlace = nvl(r.chd_dec_place(), MCNumber.ZERO).intValue();
			RoundingMode rndMode = MAC_RND_TYP.RNDUP.toMC();
			MCNumber altItmRatio = r.alt_itm_flg() ? r.alt_itm_ratio() : MCNumber.ONE;

			if (altItmRatio.isZero()) {
				return MCNumber.ZERO;
			}

			MCNumber fxdChdRqmtQty = isRqmt ? nvl(r.fxd_chd_rqmt_qty(), MCNumber.ZERO) : MCNumber.ZERO;
			MCNumber baseQtyFxd = baseQty.subtract(fxdChdRqmtQty) ;
			
			if (baseQtyFxd.isNegative()) {
				return MCNumber.ZERO;
			}
			
			return baseQtyFxd.multiply(r.par_inst_qty())
					.divide(chdQty, decPlace, rndMode).divide(altItmRatio, decPlace, rndMode);
		}
	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 選択された品目の詳細情報を検索します。<br>
	 */
	public class Srch02 extends MABSL_BomExSrch_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		public List<MCController> getSubOpes(String key) {
			// 詳細情報は「SELECT_SUB」で検索するので「SELECT」時は空のリストを返す
			if (isSame(key, SELECT)) {
				return new ArrayList<MCController>();
			}
			return super.getSubOpes(key);
		}
		@Override
		protected boolean checkDtlNoSelect() {
			return false;
		}
		@Override
		protected void downColumnsData() {
			// 何もしない
		}
	}

	//FMCB CUSTOM END
}