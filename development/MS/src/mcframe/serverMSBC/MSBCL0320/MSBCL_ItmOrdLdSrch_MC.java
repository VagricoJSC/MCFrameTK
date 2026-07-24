package mcframe.serverMSBC.MSBCL0320;

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
import mcframe.serverMSBC.MSBCL5040.*;
import static mcframe.serverMSBC.MSBCL0320.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBCL_ItmOrdLdSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCL_ItmOrdLdSrch_MC extends MSBCL_ItmOrdLdSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 */
	public class Srch01 extends MSBCL_ItmOrdLdSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			// 上り電文の編集
			editUp();
			
			// 負荷計算対象場所の取得
			MCList<ItmOrdLd_Srch01_LocCndR> locL = srchLocL();
			if (isNull(locL)) {
				return ;
			}
			
			// 負荷計算サービスの呼出
			MSBCL_LdCalcService.ItmOrdLd_Srch01 ope = callItmOrdLdSrv(locL);
			
			// 下り電文の設定
			setDown(ope);
		}
		
		protected void editUp() {
			// 画面のラジオボタンの値と合わせる必要がある
			if (isSame(up0().period_typ_view(), "1")) {
				up0().period_typ(MAC_PERIOD_TYP.DAILY.value());
			}
			else if (isSame(up0().period_typ_view(), "2")) {
				up0().period_typ(MAC_PERIOD_TYP.WEEKLY.value());
			}
			else if (isSame(up0().period_typ_view(), "3")) {
				up0().period_typ(MAC_PERIOD_TYP.TENDAYS.value());
			}
			else if (isSame(up0().period_typ_view(), "4")) {
				up0().period_typ(MAC_PERIOD_TYP.MONTHLY.value());
			}
			
			up0().ld_sub_calc_typ(MSC_LD_SUB_CALC_TYP.NO_DTL.value());
		}
		
		protected MCList<ItmOrdLd_Srch01_LocCndR> srchLocL() {
			MCList<ItmOrdLd_Srch01_LocCndR> locL = MCList.create(ItmOrdLd_Srch01_LocCndR.class);
			executeQuery(locL, MSBCL0320_MAM_RSRC_LOC_S01(), up0());
			return locL;
		}
		
		protected MSBCL_LdCalcService.ItmOrdLd_Srch01 callItmOrdLdSrv(MCList<ItmOrdLd_Srch01_LocCndR> locL) {
			MSBCL_LdCalcService.ItmOrdLd_Srch01 ope = MSBCL_LdCalcService.crtItmOrdLd_Srch01();
			copy(ope.up0() , up0() , createMap_ItmOrdLd_Srch01_CndR_Srch01_CndR());
			ope.up1().addAll(locL);
			ope.exec();
			return ope;
		}
		
		protected void setDown(MSBCL_LdCalcService.ItmOrdLd_Srch01 ope) {
			addAll(down0(), subList(ope.down0()), createMap_Srch01_RsltR_ItmOrdLd_Srch01_SumRsltR());
			
			MCIndexKey idxkey = ope.up1().createIndex(ItmOrdLd_Srch01_LocCndR.$mfg_loc_cd, "rsrc_cd");
			
			for (Srch01_RsltR r: down0()) {
				r.ld_rate(zeroToNull(r.ld_rate()));
				r.base_qty(zeroToNull(r.base_qty()));
				r.act_qty(zeroToNull(r.act_qty()));
				r.alert_qty(zeroToNull(r.alert_qty()));
				ItmOrdLd_Srch01_LocCndR locR = ope.up1().getFirst(idxkey, r.mfg_loc_cd(), r.rsrc_cd());
				if (locR == null) {
					locR = ope.up1().getFirst(idxkey,r.mfg_loc_cd()); 
					r.wg_cd(locR.getString("wg_cd"));
				}
				else {
					r.wg_cd(locR.getString("wg_cd"));
					r.disp_seq(locR.getNumberNE("disp_seq"));
				}
			}
		}
		
		protected MCList<ItmOrdLd_Srch01_SumRsltR> subList(MCList<ItmOrdLd_Srch01_SumRsltR> allL) {
			MCList<ItmOrdLd_Srch01_SumRsltR> l = MCList.create(ItmOrdLd_Srch01_SumRsltR.class);
			
			if (up0().base_qty_over_flg() || up0().alert_qty_over_flg()) {
				for (MCList<ItmOrdLd_Srch01_SumRsltR> grpL : allL.groupList(
						ItmOrdLd_Srch01_SumRsltR.$mfg_loc_cd,
						ItmOrdLd_Srch01_SumRsltR.$rsrc_cd)) {
					
					boolean isBaseQtyOverFlg = false;
					boolean isAlertQtyOverFlg = false;
					for (ItmOrdLd_Srch01_SumRsltR r : grpL) {
						if (up0().base_qty_over_flg() && !isBaseQtyOverFlg && isBaseQtyOver(r)) {
							isBaseQtyOverFlg = true;
						}
						if (up0().alert_qty_over_flg() && !isAlertQtyOverFlg && isAlertQtyOver(r)) {
							isAlertQtyOverFlg = true;
						}
					}
					if (up0().base_qty_over_flg() == isBaseQtyOverFlg
							&& up0().alert_qty_over_flg() == isAlertQtyOverFlg) {
						l.addAll(grpL);
					}
					
				}
			}
			else {
				l.addAll(allL);
			}
			
			return l;
		}
		
		protected boolean isBaseQtyOver(ItmOrdLd_Srch01_SumRsltR r) {
			return isQtyOver(r.act_qty(), r.base_qty());
		}
		
		protected boolean isAlertQtyOver(ItmOrdLd_Srch01_SumRsltR r) {
			return isQtyOver(r.act_qty(), r.alert_qty());
		}
		
		protected boolean isQtyOver(MCNumber actQty, MCNumber refQty) {
			if (isNullOr(actQty, refQty)) {
				return false;
			}
			if (actQty.lte(refQty)) {
				return false;
			}
			if (MCNumber.ZERO.eq(refQty)) {
				return false;
			}
			return true;
		}
		
		protected MCNumber zeroToNull(MCNumber num) {
			if (MCNumber.ZERO.eq(num)) {
				return null;
			}
			else {
				return num;
			}
		}
		
		
		protected Map_ItmOrdLd_Srch01_CndR_Srch01_CndR<ItmOrdLd_Srch01_CndR,Srch01_CndR> createMap_ItmOrdLd_Srch01_CndR_Srch01_CndR() {
			return new Map_ItmOrdLd_Srch01_CndR_Srch01_CndR<ItmOrdLd_Srch01_CndR, Srch01_CndR>();
		}
		public class Map_ItmOrdLd_Srch01_CndR_Srch01_CndR<D extends ItmOrdLd_Srch01_CndR, S extends Srch01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ItmOrdLd_Srch01_CndR.$opn_flg, Srch01_CndR.$opn_flg);
				addColumnPathMap(ItmOrdLd_Srch01_CndR.$sav_flg, Srch01_CndR.$sav_flg);
				addColumnPathMap(ItmOrdLd_Srch01_CndR.$fix_flg, Srch01_CndR.$fix_flg);
				addColumnPathMap(ItmOrdLd_Srch01_CndR.$inst_flg, Srch01_CndR.$inst_flg);
				addColumnPathMap(ItmOrdLd_Srch01_CndR.$cmpl_flg, Srch01_CndR.$cmpl_flg);
				addColumnPathMap(ItmOrdLd_Srch01_CndR.$prcd_flg, Srch01_CndR.$prcd_flg);
				addColumnPathMap(ItmOrdLd_Srch01_CndR.$sim_flg, Srch01_CndR.$sim_flg);
				addColumnPathMap(ItmOrdLd_Srch01_CndR.$sim_mrp_no, Srch01_CndR.$sim_mrp_no);
				addColumnPathMap(ItmOrdLd_Srch01_CndR.$dt_fr, Srch01_CndR.$dt_fr);
				addColumnPathMap(ItmOrdLd_Srch01_CndR.$dt_to, Srch01_CndR.$dt_to);
				addColumnPathMap(ItmOrdLd_Srch01_CndR.$period_typ, Srch01_CndR.$period_typ);
				addColumnPathMap(ItmOrdLd_Srch01_CndR.$ld_sub_calc_typ, Srch01_CndR.$ld_sub_calc_typ);
			}
		}
		
		protected Map_Srch01_RsltR_ItmOrdLd_Srch01_SumRsltR<Srch01_RsltR,ItmOrdLd_Srch01_SumRsltR> createMap_Srch01_RsltR_ItmOrdLd_Srch01_SumRsltR() {
			return new Map_Srch01_RsltR_ItmOrdLd_Srch01_SumRsltR<Srch01_RsltR, ItmOrdLd_Srch01_SumRsltR>();
		}
		public class Map_Srch01_RsltR_ItmOrdLd_Srch01_SumRsltR<D extends Srch01_RsltR, S extends ItmOrdLd_Srch01_SumRsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch01_RsltR.$mfg_loc_cd, ItmOrdLd_Srch01_SumRsltR.$mfg_loc_cd);
				addColumnPathMap(Srch01_RsltR.$mfg_loc_nm, ItmOrdLd_Srch01_SumRsltR.$mfg_loc_nm);
				addColumnPathMap(Srch01_RsltR.$rsrc_cd, ItmOrdLd_Srch01_SumRsltR.$rsrc_cd);
				addColumnPathMap(Srch01_RsltR.$rsrc_nm, ItmOrdLd_Srch01_SumRsltR.$rsrc_nm);
				addColumnPathMap(Srch01_RsltR.$rsrc_unit_nm, ItmOrdLd_Srch01_SumRsltR.$rsrc_unit_nm);
				addColumnPathMap(Srch01_RsltR.$rsrc_dec_place, ItmOrdLd_Srch01_SumRsltR.$rsrc_dec_place);
				addColumnPathMap(Srch01_RsltR.$dt_fr, ItmOrdLd_Srch01_SumRsltR.$dt_fr);
				addColumnPathMap(Srch01_RsltR.$dt_to, ItmOrdLd_Srch01_SumRsltR.$dt_to);
				addColumnPathMap(Srch01_RsltR.$on_num, ItmOrdLd_Srch01_SumRsltR.$on_num);
				addColumnPathMap(Srch01_RsltR.$act_qty, ItmOrdLd_Srch01_SumRsltR.$act_qty);
				addColumnPathMap(Srch01_RsltR.$base_qty, ItmOrdLd_Srch01_SumRsltR.$base_qty);
				addColumnPathMap(Srch01_RsltR.$alert_qty, ItmOrdLd_Srch01_SumRsltR.$alert_qty);
				addColumnPathMap(Srch01_RsltR.$ld_rate, ItmOrdLd_Srch01_SumRsltR.$ld_rate);
			}
		}
	}

	//FMCB CUSTOM END
}