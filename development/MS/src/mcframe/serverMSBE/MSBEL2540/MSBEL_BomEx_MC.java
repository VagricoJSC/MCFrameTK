package mcframe.serverMSBE.MSBEL2540;

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
import static mcframe.serverMSBE.MSBEL2540.Query.*;

import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_BomEx"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_BomEx_MC extends MSBEL_BomEx_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 構成展開を検索する<br>
	 */
	public class Srch01 extends MSBEL_BomEx_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void initSearch() {
			super.initSearch();
			editUp();
			String procId = "MAPA_BOM$P_INS_BOM_EX";
			execProc(createSqlId(LOGIC_ID, procId, "01"), procId, up0(), null, ":ITM_CD, :ITM_SUB1, :ITM_SUB2, :ITM_SUB3, "
					+ ":BOM_PTN, :WG_CD, :MASTER_DT, :PH_EX_FLG, :BOM_PTN_FLG");
		}
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			executeQuery(down0(), MSBEL2540_MAW_BOM_EX_S01(), up0());
		}
		@Override
		protected void doSearchSub() {
			super.doSearchSub();
			
			setExtno(down0());
		}

		protected void editUp() {
			up0().ph_ex_flg(true);
		}

		protected void setExtno(MCList<Srch01_RsltR> l) {
			Map<MCNumber, MCNumber> ext_map = new HashMap<MCNumber, MCNumber>();
			Map<MCNumber, MCNumber> qty_map = new HashMap<MCNumber, MCNumber>();
			MCNumber num = MCNumber.ONE;
			MCNumber curr_lvl = null;
			ext_map.put(MCNumber.ZERO, null);
			qty_map.put(MCNumber.ZERO, up0().base_qty());

			for (Srch01_RsltR r : l) {
				curr_lvl = r.bom_lvl();
				//ひとつ上のLEVELのext_noをpar_extnoに設定
				r.par_extno(ext_map.get(curr_lvl.subtract(1)));
				r.extno(num);
				ext_map.put(curr_lvl, num);
				num = num.add(1);
				
				MCNumber cQty = setExpQty(qty_map.get(curr_lvl.subtract(1)),r);
				qty_map.put(curr_lvl, cQty);
				r.base_unit_qty(cQty);
				setInptUnit(r);
				setStdContQty(r);
				
				// 項目型チェック（桁あふれの可能性がある）
				MCMessageList mp = r.validate(Srch01_RsltR.$trd_unit_qty, Srch01_RsltR.$base_unit_qty);
				for(MCMessage msg : mp){
					throw new MCAppException(msg);
				}
			}
		}
		
		/**
		 * 取引単位系項目を設定する
		 * @param r
		 */
		protected void setInptUnit(Srch01_RsltR r){
			r.trd_unit_cd(r.base_unit_cd());
			r.trd_unit_nm(r.base_unit_nm());
			r.trd_unit_qty(r.base_unit_qty());
			r.trd_unit_dec_place(r.base_unit_dec_place());
			r.trd_unit_conv_base_qty(MCNumber.ONE);
			r.trd_unit_conv_qty(MCNumber.ONE);
		}
		
		protected MCNumber setExpQty(MCNumber pQty, Srch01_RsltR r){
			// 所要量＝有効桁端数処理（親製造数＊子必要量/親必要量）＋子固定必要数
			// 　端数処理：切り上げ(固定)
			MCNumber num = numCal(pQty, r.base_unit_dec_place(), r.chd_rqmt_qty(),
					r.par_inst_qty()).add( r.fxd_chd_rqmt_qty());
			return num;
		}

		protected void setStdContQty(Srch01_RsltR r) {
			if (r.cont_fctr_flg()) {
				MCNumber qty = convToContFctrUnit(r.base_unit_qty(), r.std_cont_fctr(), 
						r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ());
				r.std_cont_fctr_qty(qty);
			}
		}
		
		/**
		 * 桁数計算関数
		 *
		 * @param qty_p 乗数
		 * @param scale 小数部有効桁数
		 * @param nmr 分子
		 * @param dnm 分母
		 */
		protected MCNumber numCal(MCNumber qty_p, MCNumber scale, MCNumber nmr, MCNumber dnm) {
			if(isNull(nmr) || !nmr.gt(0)){
				return MCNumber.ZERO;
			}
			if(isNull(dnm) || !dnm.gt(0)){
				return MCNumber.ZERO;
			}
			if(isNull(qty_p) || qty_p.isZero()){
				return MCNumber.ZERO;
			}
			
			RoundingMode rm = MAC_RND_TYP.RNDUP.toMC();
			if (!isNull(scale)) {
				return qty_p.multiply(nmr).divide(dnm,scale.intValue(),rm);
			}
			else {
				return qty_p.multiply(nmr).divide(dnm,0,rm);
			}
		}
	}

	//FMCB CUSTOM END
}