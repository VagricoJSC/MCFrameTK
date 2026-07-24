package mcframe.serverMSBE.MSBEL5270;

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
import mcframe.serverMSBE.MSBEL5270.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil;
import mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil;
import mcframe.serverMAUC.MAUCL1060.*;
import mcframe.serverMAUC.MAUCL1110.*;
import mcframe.serverMAUC.MAUCL5020.*;
import mcframe.serverFXUC.FXUCL0030.*;
import mcframe.serverMSBB.MSBBL6260.*;
import mcframe.serverMSBE.MSBEL5010.*;
import mcframe.serverMSBE.MSBEL5260.*;
import mcframe.serverMSBE.MSBEL5550.*;
import mcframe.serverMSBI.MSBIL5010.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;
import static mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil.*;
import static mcframe.commonFXUC.FXUCC0030.FXUCC_Divide.*;
import mcframe.commonFXUC.FXUCC0030.FXUCC_Divide;
import static mcframe.commonFX.notice.FX_Msg.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_ProvActService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_ProvActService_MC extends MSBEL_ProvActService_MC_A{
	//FMCB CUSTOM START

	/**
	 * ProvAct_Chk01オペレーション.<p>
	 *
	 * 支給予定のマスタ補完が可能かチェックする<br>
	 */
	public class ProvAct_Chk01 extends MSBEL_ProvActService_MC_A.ProvAct_Chk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			getCache();
			chkCommon();
			chkCl();
			chkApDpt();
			setDown();
		}

		protected void getCache() {
			// 支給実績をキャッシュ
			initProvActCache(up0());
		}

		// 支給予定サービスのチェック処理を使用してマスタから補完できるかチェックする
		protected void chkCommon() {
			if (up1().upd_flg()) {
				for (ProvActChk01_DtlR r :up0()) {
					MST_PROV_ACT_R paR = getProvActCache().get(r.prov_act_no(), r.prov_src_act_typ(), r.prov_src_act_no(), r.trd_ptn_typ());
					r.accpt_dt(paR.accpt_dt());
					r.prsppl_cd(paR.prsppl_cd());
					r.trd_cur_cd(paR.trd_cur_cd());
				}
			}
			else {
				// 支給予定をキャッシュ
				MCList<ProvActChk01_DtlR> up0 = up0().clone();
				up0.addAll(getProvActCache().getProvSchdNo());
				initProvSchdCache(up0);
			}

			MSBEL_ProvSchdService.ProvSchd_Chk01 op = MSBEL_ProvSchdService.crtProvSchd_Chk01();
			addAll(op.up0(), up0(), createMap_ProvSchd_DtlR_ProvActChk01_DtlR());
			op.exec();
			copyErrFlg(up0(), op.down0());
		}

		// 締日チェック
		protected void chkCl() {
			MSBIL_ClService.Cl_Chk03 op = MSBIL_ClService.crtCl_Chk03();

			for (ProvActChk01_DtlR r :up0()) {
				// 支給区分、支給計上区分を補完する
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					// 検収不良、無償受給の在庫は支給区分を無償支給とする
					if (MSC_STK_ID_TYP.isACCPT_DFCT(r.stk_id_typ()) || MSC_STK_ID_TYP.isNCV_RCV(r.stk_id_typ())
							// 支給返品で自社資産のときは無償支給にする
							// 使用基準の在庫である可能性もあるが、呼び出し元に判断してもらう想定とする
							|| MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ()) && MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ())) {
						r.prov_typ(MAC_PROV_TYP.FFR_PROV.value());
						r.prov_basis_typ(null);
					}
					// 有償支給の在庫は支給区分を有償支給とする
					else if (MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ()) && MSC_STK_ID_TYP.isONR_PROV(r.stk_id_typ())) {
						r.prov_typ(MAC_PROV_TYP.ONR_PROV.value());
						r.prov_basis_typ(MAC_PROV_BASIS_TYP.GI.value());
					}
					else {
						// 取引先マスタ
						MAM_BP_R bpCacheR = MSBEL_ProvSchdService.getBpCache().getEx(r.prsppl_cd());
						// 支給予定
						MST_PROV_SCHD_R psR = getProvSchdCache().get(r.prov_schd_no(), r.prov_src_schd_typ(), r.prov_src_schd_no1(),
								r.prov_src_schd_no2(), r.trd_ptn_typ());

						// 支給予定が無ければマスタから補完する
						if (isNull(psR) || psR.isEmpty()) {
							// 支給単価マスタ
							MAM_PROV_UPRI_R puR = MSBEL_ProvSchdService.getProvUpriCache().get(r.accpt_dt(),
									r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.prsppl_cd(), nvl(r.trd_cur_cd(), bpCacheR.cur_cd()), r.wg_cd());

							if (isNull(r.prov_typ())) {
								if (!isNull(puR) && MAC_PROV_TYP.isONR_PROV(puR.prov_typ())) {
									r.prov_typ(MAC_PROV_TYP.ONR_PROV.value());
								}
								else {
									r.prov_typ(MAC_PROV_TYP.FFR_PROV.value());
								}
							}
							else {
								if (!MAC_PROV_TYP.isONR_PROV(r.prov_typ())) {
									r.prov_typ(MAC_PROV_TYP.FFR_PROV.value());
								}
							}

							if (MAC_PROV_TYP.isONR_PROV(r.prov_typ())) {
								if (isNull(r.prov_basis_typ())) {
									r.prov_basis_typ(bpCacheR.prov_basis_typ());
								}
							}
							else {
								r.prov_basis_typ(null);
							}
						}
						// 支給予定があれば支給予定から補完する
						else {
							r.prov_typ(psR.prov_typ());
							r.prov_basis_typ(psR.prov_basis_typ());
						}
					}

					// 使用基準は投入のみ発生する
					if (isNotInpt(r.prov_typ(), r.prov_basis_typ(), r.prov_src_act_typ())) {
						continue;
					}
				}
				// 更新、削除では支給区分は変わらない前提とする
				else {
					// 支給実績
					MST_PROV_ACT_R paR = getProvActCache().get(r.prov_act_no(), r.prov_src_act_typ(), r.prov_src_act_no(), r.trd_ptn_typ());
					// 使用基準の場合は支給実績が存在しない
					if (isNull(paR) || paR.isEmpty()) {
						continue;
					}

					r.prov_typ(paR.prov_typ());
					r.prov_basis_typ(paR.prov_basis_typ());
				}

				// 有償支給の場合は仕入締チェックを行う
				if (MAC_PROV_TYP.isONR_PROV(r.prov_typ())) {
					Cl_Chk03_CndR opR = Cl_Chk03_CndR.create();
					copy(opR, r, createMap_Cl_Chk03_CndR_ProvActChk01_DtlR());
					op.up0().add(opR);
				}
			}
			op.exec();
			copyErrFlg(up0(), op.down0());
		}

		// 債務部門の必須チェック
		protected void chkApDpt() {
			MCList<ProvActChk01_DtlR> onrProvL = up0().subList(r -> MAC_PROV_TYP.isONR_PROV(r.prov_typ()) && !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));
			if (onrProvL.isEmpty()) {
				return;
			}

			initApDptCache(onrProvL, up1()); 
			for (ProvActChk01_DtlR r :onrProvL) {
				if (up1().upd_flg()) {
					if (isNull(r.ap_dpt_cd())) {
						MCMessagePool.add(new MCMessage(r, ProvActChk01_DtlR.$ap_dpt_cd, FXUCC0047, r.getGUIIndex(), r.ap_dpt_cd()));
						r.err_flg(true);
					}
					else {
						MAUCL_DptUtil.setDpt(r, ProvActChk01_DtlR.$ap_dpt_cd, null, ProvActChk01_DtlR.$ac_dt, true);
					}
				}
				else {
					ProvActChk01_DtlR cacheR = getApDptCache().getApDpt(r.prsppl_cd(), r.ac_dt());
					if (isNull(cacheR.ap_dpt_cd())) {
						MCMessagePool.add(new MCMessage(r, ProvActChk01_DtlR.$prsppl_cd, MSBEL0334,
								r.prsppl_cd(), cacheR.asppl_cd(), toYMDString(r.ac_dt()), toDispGUIIndex(r)));
						r.err_flg(true);
					}
					else {
						r.ap_dpt_cd(cacheR.ap_dpt_cd());
						MAUCL_DptUtil.setDpt(r, ProvActChk01_DtlR.$ap_dpt_cd, null, ProvActChk01_DtlR.$ac_dt, true);
					}
				}
			}
		}

		/**
		 * 下り電文の設定
		 */
		protected void setDown() {
			for (ProvActChk01_DtlR r :up0()) {
				setStkCol(r);
			}
			down0().addAll(up0());
		}

		protected void setStkCol(ProvActChk01_DtlR r) {
			// 支給
			if (MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())) {
				// 有償支給
				if (MAC_PROV_TYP.isONR_PROV(r.prov_typ())) {
					r.stk_id_typ(MSC_STK_ID_TYP.ONR_PROV.value());
				}
			}
			// 支給返品
			else {
				// 有償支給
				if (MAC_PROV_TYP.isONR_PROV(r.prov_typ())) {
					r.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
				}
			}
		}

		protected Map_ProvSchd_DtlR_ProvActChk01_DtlR<ProvSchd_DtlR,ProvActChk01_DtlR> createMap_ProvSchd_DtlR_ProvActChk01_DtlR() {
			return new Map_ProvSchd_DtlR_ProvActChk01_DtlR<ProvSchd_DtlR, ProvActChk01_DtlR>();
		}

		public class Map_ProvSchd_DtlR_ProvActChk01_DtlR<D extends ProvSchd_DtlR, S extends ProvActChk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ProvSchd_DtlR.$peg_no, ProvActChk01_DtlR.$peg_no);
				addColumnPathMap(ProvSchd_DtlR.$data_crud_typ, ProvActChk01_DtlR.$data_crud_typ);
				addColumnPathMap(ProvSchd_DtlR.$accpt_schd_dt, ProvActChk01_DtlR.$accpt_dt);
				addColumnPathMap(ProvSchd_DtlR.$wg_cd, ProvActChk01_DtlR.$wg_cd);
				addColumnPathMap(ProvSchd_DtlR.$prsppl_cd, ProvActChk01_DtlR.$prsppl_cd);
				addColumnPathMap(ProvSchd_DtlR.$prov_typ, ProvActChk01_DtlR.$prov_typ);
				addColumnPathMap(ProvSchd_DtlR.$prov_basis_typ, ProvActChk01_DtlR.$prov_basis_typ);
				addColumnPathMap(ProvSchd_DtlR.$xrate, ProvActChk01_DtlR.$xrate);
				addColumnPathMap(ProvSchd_DtlR.$ptax_xrate, ProvActChk01_DtlR.$ptax_xrate);
				addColumnPathMap(ProvSchd_DtlR.$trd_cur_cd, ProvActChk01_DtlR.$trd_cur_cd);
				addColumnPathMap(ProvSchd_DtlR.$tax_cd, ProvActChk01_DtlR.$tax_cd);
				addColumnPathMap(ProvSchd_DtlR.$itm_cd, ProvActChk01_DtlR.$itm_cd);
				addColumnPathMap(ProvSchd_DtlR.$itm_sub1, ProvActChk01_DtlR.$itm_sub1);
				addColumnPathMap(ProvSchd_DtlR.$itm_sub2, ProvActChk01_DtlR.$itm_sub2);
				addColumnPathMap(ProvSchd_DtlR.$itm_sub3, ProvActChk01_DtlR.$itm_sub3);
				addColumnPathMap(ProvSchd_DtlR.$trd_ptn_typ, ProvActChk01_DtlR.$trd_ptn_typ);
				addColumnPathMap(ProvSchd_DtlR.$trd_cur_upri, ProvActChk01_DtlR.$trd_cur_upri);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				if (MAC_DATA_CRUD_TYP.isCRT(src.data_crud_typ())) {
					// 支給予定
					MST_PROV_SCHD_R psR = getProvSchdCache().get(
						src.prov_schd_no(), src.prov_src_schd_typ(),
						src.prov_src_schd_no1(), src.prov_src_schd_no2(), src.trd_ptn_typ());
					if (!isNull(psR)) {
						if (isNull(src.xrate())) {
							dest.xrate(psR.xrate());
						}
						if (isNull(src.ptax_xrate())) {
							dest.ptax_xrate(psR.ptax_xrate());
						}
						if (isNull(src.trd_cur_cd())) {
							dest.trd_cur_cd(psR.trd_cur_cd());
						}
						if (isNull(src.tax_cd())) {
							dest.tax_cd(psR.tax_cd());
						}
						dest.trd_cur_upri(psR.trd_cur_upri());
					}
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(src.data_crud_typ())) {
					// 支給実績
					MST_PROV_ACT_R paR = getProvActCache().get(
						src.prov_act_no(), src.prov_src_act_typ(), src.prov_src_act_no(), src.trd_ptn_typ());
					if (!isNull(paR)) {
						dest.trd_cur_upri(paR.trd_cur_upri());
					}
				}

				if (MSC_PROV_SRC_ACT_TYP.isINPT(src.prov_src_act_typ())) {
					dest.inpt_flg(true);
				}
			}
		}

		protected Map_Cl_Chk03_CndR_ProvActChk01_DtlR<Cl_Chk03_CndR,ProvActChk01_DtlR> createMap_Cl_Chk03_CndR_ProvActChk01_DtlR() {
			return new Map_Cl_Chk03_CndR_ProvActChk01_DtlR<Cl_Chk03_CndR, ProvActChk01_DtlR>();
		}

		public class Map_Cl_Chk03_CndR_ProvActChk01_DtlR<D extends Cl_Chk03_CndR, S extends ProvActChk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Cl_Chk03_CndR.$peg_no, ProvActChk01_DtlR.$peg_no);
				addColumnPathMap(Cl_Chk03_CndR.$ac_dt, ProvActChk01_DtlR.$ac_dt);
				addColumnPathMap(Cl_Chk03_CndR.$can_ac_dt, ProvActChk01_DtlR.$can_ac_dt);
				addColumnPathMap(Cl_Chk03_CndR.$bp_cd, ProvActChk01_DtlR.$prsppl_cd);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.sls_cls_chk_flg(false);
				dest.rcv_cls_chk_flg(false);
				dest.purc_cls_chk_flg(true);
				dest.pay_cls_chk_flg(false);
				dest.stk_cls_chk_flg(false);
				dest.io_lmt_skip_flg(true);
				if (MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())) {
					dest.ac_dt(null);
				}
			}
		}
	}

	/**
	 * ProvAct_Upd01オペレーション.<p>
	 *
	 * 支給実績にデータを登録する。支給実績のデータを更新削除する。<br>
	 */
	public class ProvAct_Upd01 extends MSBEL_ProvActService_MC_A.ProvAct_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 伝票状況区分を無効に更新するリスト
			MCList<MST_PROV_ACT_R> disL = MCList.create(MST_PROV_ACT_R.class);
			// 伝票状況区分を取消として追加するリスト
			MCList<MST_PROV_ACT_R> canL = MCList.create(MST_PROV_ACT_R.class);
			// 伝票状況区分を新規として追加するリスト
			MCList<ProvActUpd01_DtlR> crtL = MCList.create(ProvActUpd01_DtlR.class);
			// 受払を作成するリスト
			MCList<ProvActUpd01_DtlR> ioActL = MCList.create(ProvActUpd01_DtlR.class);

			getCache();
			editUp(disL, canL, crtL, ioActL);
			getSlip(disL, canL, crtL, ioActL);
			adjustSlip(disL, crtL, ioActL);
			updProvAct(disL, canL, crtL);
			callShipRprtPrntSv(crtL);
			crtIoAct(ioActL);
			callGALink(canL, crtL);
			setDown(crtL);
		}

		protected void getCache() {
			selectItmL(up0());
			selectItmUnitL(up0());
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp(MCList<MST_PROV_ACT_R> disL, MCList<MST_PROV_ACT_R> canL, MCList<ProvActUpd01_DtlR> crtL, MCList<ProvActUpd01_DtlR> ioActL) {

			MCList<ElmArgsR> args = MCList.create(ElmArgsR.class);

			for (ProvActUpd01_DtlR r : up0()) {
				if (!isNull(r.accpt_dt())) r.accpt_dt(r.accpt_dt().trunc(MCDateFieldType.DAY));
				if (isNull(r.dlv_slip_no())) r.dlv_slip_no(MAC_STR.NULL_VAL.value());
				if (isNull(r.dlv_slip_d_no())) r.dlv_slip_d_no(MAC_STR.NULL_VAL.value());

				r.xrate_cd(getCo().prov_xrate_cd());
				r.base_cur_cd(getCo().base_cur_cd());
				r.ptax_cur_cd(getCo().ptax_cur_cd());

				MAM_BP_R bpCacheR = null;
				MAM_PROV_UPRI_R puR = null;
				MST_PROV_SCHD_R psR = null;
				MST_PROV_ACT_R befPaR= null;

				if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) && !up1().upd_flg()) {
					// 取引先マスタ
					bpCacheR = MSBEL_ProvSchdService.getBpCache().getEx(r.prsppl_cd());
					// 支給単価マスタ
					puR = MSBEL_ProvSchdService.getProvUpriCache().get(r.accpt_dt(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(),
							r.prsppl_cd(), nvl(r.trd_cur_cd(), bpCacheR.cur_cd()), r.wg_cd());
					// 支給予定
					psR = getProvSchdCache().get(r.prov_schd_no(), r.prov_src_schd_typ(), r.prov_src_schd_no1(),
							r.prov_src_schd_no2(), r.trd_ptn_typ());
					if (getCo().temp_ap_use_flg() && MSC_PROV_SRC_ACT_TYP.isDDLV(r.prov_src_act_typ())) {
						befPaR = getProvActCache().getBefAct(r.arr_act_no());
					}
				}

				// 項目の補完
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					// 検収不良、無償受給の在庫は支給区分を無償支給とする
					if (MSC_STK_ID_TYP.isACCPT_DFCT(r.stk_id_typ()) || MSC_STK_ID_TYP.isNCV_RCV(r.stk_id_typ())
							// 支給返品で自社資産のときは無償支給にする
							// 使用基準の在庫である可能性もあるが、呼び出し元に判断してもらう想定とする
							|| MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ()) && MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ())) {
						if (isNull(psR) || psR.isEmpty()) {
							r.prov_schd_no(MAC_STR.NULL_VAL.value());
						}
						else {
							r.prov_schd_no(psR.prov_schd_no());
						}
						r.prov_typ(MAC_PROV_TYP.FFR_PROV.value());
					}
					// 有償支給の在庫は支給区分を有償支給とする
					else if (MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ()) && MSC_STK_ID_TYP.isONR_PROV(r.stk_id_typ())) {
						r.prov_typ(MAC_PROV_TYP.ONR_PROV.value());
						if (!isNull(befPaR) && !befPaR.isEmpty()) {
							setByProvAct(r, befPaR, psR, bpCacheR, puR);
							r.upd_flg(true);
						}
						if (isNull(psR) || psR.isEmpty()) {
							r.prov_schd_no(MAC_STR.NULL_VAL.value());
							r.prov_basis_typ(MAC_PROV_BASIS_TYP.GI.value());
							setByMst(r, bpCacheR, puR);
						}
						else {
							r.prov_schd_no(psR.prov_schd_no());
							r.prov_basis_typ(psR.prov_basis_typ());
							setByProvSchd(r, psR);
						}
					}
					else {
						if (!isNull(befPaR) && !befPaR.isEmpty()) {
							setByProvAct(r, befPaR, psR, bpCacheR, puR);
						}
						// 支給予定が無ければマスタから補完する
						if (isNull(psR) || psR.isEmpty()) {
							r.prov_schd_no(MAC_STR.NULL_VAL.value());

							if (isNull(r.prov_typ())) {
								if (!isNull(puR) && MAC_PROV_TYP.isONR_PROV(puR.prov_typ())) {
									r.prov_typ(MAC_PROV_TYP.ONR_PROV.value());
								}
								else {
									r.prov_typ(MAC_PROV_TYP.FFR_PROV.value());
								}
							}
							else {
								if (!MAC_PROV_TYP.isONR_PROV(r.prov_typ())) {
									r.prov_typ(MAC_PROV_TYP.FFR_PROV.value());
								}
							}

							if (MAC_PROV_TYP.isONR_PROV(r.prov_typ())) {
								setByMst(r, bpCacheR, puR);
							}
						}
						// 支給予定があれば支給予定から補完する
						else {
							r.prov_schd_no(psR.prov_schd_no());
							r.prov_typ(psR.prov_typ());
							r.prov_basis_typ(psR.prov_basis_typ());
							if (MAC_PROV_TYP.isONR_PROV(r.prov_typ())) {
								setByProvSchd(r, psR);
							}
						}
					}

					// 使用基準は投入のみ発生する
					if (isNotInpt(r.prov_typ(), r.prov_basis_typ(), r.prov_src_act_typ())) {
						continue;
					}

					// 新規レコードの新規行の設定
//					r.prov_act_no();	支給実績ＮＯは後でまとめて発番する
					r.prov_act_seq(MCNumber.ONE);
					r.prov_act_rev(MCNumber.ONE);
					setTakeOverCol(false, r, null, false);
					if (up1().upd_flg() || (!isNull(befPaR) && befPaR.upd_flg())) {
						r.upd_flg(true);
					}
					else {
						r.upd_flg(false);
					}

					if (isNull(psR) || psR.isEmpty()) {
						if (isNull(r.trd_cd())) {
							r.trd_cd(MAUCL_TrdUtil.getDefaultTrdCd(r.trd_ptn_typ()));
						}
					}
					else {
						r.trd_cd(psR.trd_cd());
					}

					// 支給実績ＮＯ発番の元データ
					ElmArgsR elm = ElmArgsR.create();
					elm.loc_cd(r.loc_cd());
					elm.co_cd(getCo().co_cd());
					elm.bp_cd(r.prsppl_cd());
					elm.wg_cd(r.wg_cd());
					elm.trd_cd(r.trd_cd());
					elm.dt(r.accpt_dt());
					elm.peg_no(r.peg_no());
					args.add(elm);
				}
				else {
					// 支給実績
					MST_PROV_ACT_R paR = getProvActCache().get(r.prov_act_no(), r.prov_src_act_typ(), r.prov_src_act_no(), r.trd_ptn_typ());
					// 使用基準の場合は支給実績が存在しない
					if (isNull(paR) || paR.isEmpty()) {
						continue;
					}

					r.prov_schd_no(paR.prov_schd_no());
					r.trd_cd(paR.trd_cd());
					r.prov_typ(paR.prov_typ());
					r.prov_basis_typ(paR.prov_basis_typ());

					// 更新レコードを作成する
					MST_PROV_ACT_R canR = updCrt(paR, disL, canL);
					// MAUCL_DptUtil.setCanDpt用の設定
					// 計上日
					canR.setDateNE("dis_ac_dt", paR.ac_dt());
					canR.setDateNE("can_ac_dt", r.can_ac_dt());
					canR.ac_dt(r.can_ac_dt());
					canR.ac_ym(getAcYm(canR.ac_dt()));
					canR.setDateNE(getCrtCol(MST_PROV_ACT_R.$ac_dt), r.ac_dt());
					// 部門
					canR.setStringNE(getCrtCol(MST_PROV_ACT_R.$ap_dpt_cd), r.ap_dpt_cd());
					canL.add(canR);

					// 削除レコードは新規行は不要
					if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
						r.prov_act_no(paR.prov_act_no());
						r.prov_act_seq(paR.prov_act_seq());
						r.prov_act_rev(paR.prov_act_rev());
						ioActL.add(r);
						continue;
					}

					// 更新レコードの新規行の設定
					r.prov_act_no(canR.prov_act_no());
					r.prov_act_seq(canR.prov_act_seq().add(MCNumber.ONE));
					r.prov_act_rev(canR.prov_act_rev().add(MCNumber.ONE));
					r.prov_schd_no(canR.prov_schd_no());
					setTakeOverCol(up1().upd_flg(), r, paR, false);
					if (paR.upd_flg() || up1().upd_flg()) {
						r.upd_flg(true);
					}
					else {
						r.upd_flg(false);
					}
					if (MAC_PROV_TYP.isONR_PROV(r.prov_typ())) {
						setByProvAct(r, paR, psR, bpCacheR, puR);
					}
					r.dlv_slip_no(paR.dlv_slip_no());
					r.dlv_slip_d_no(paR.dlv_slip_d_no());
				}

				// 新規行の設定
				r.slip_sts_typ(MAC_SLIP_STS_TYP.CRT.value());
				r.ac_ym(getAcYm(r.ac_dt()));
				if (MAC_PROV_TYP.isONR_PROV(r.prov_typ())) {
					r.asppl_cd(MSBEL_ProvSchdService.getBpCache().getEx(r.prsppl_cd()).asppl_cd());
					if (!up1().upd_flg()) {
						r.ap_dpt_cd(getApDptCache().getApDpt(r.prsppl_cd(), r.ac_dt()).ap_dpt_cd());
						MAUCL_DptUtil.setDpt(r, ProvActChk01_DtlR.$ap_dpt_cd, null, ProvActChk01_DtlR.$ac_dt, true);
					}
				}
				
				MAM_TAX_R taxR = MSBEL_ProvSchdService.getTaxCache().get(r.tax_cd());
				r.tax_rate(taxR.tax_rate());

				// 金額の計算
				if (MAC_PROV_TYP.isONR_PROV(r.prov_typ())) {
					convByRate(r);
				}
				else {
					clearOnrProvCol(r);
				}
				crtL.add(r);
				ioActL.add(r);
			}
			adjustIvAmt();
			// 支給実績ＮＯの設定
			if (!args.isEmpty()) {
				setNum(MAC_NUM_BIZ_TYP.PROVACT, args);
				String[] srcCols = new String[]{ElmArgsR.$new_no};
				String[] destCols = new String[]{ProvActUpd01_DtlR.$prov_act_no};
				copyByPegNo(crtL, destCols, args, srcCols);
			}
		}
		protected void adjustIvAmt() {
			MCList<MST_ARR_ACT_R> rsltL = MCList.create(MST_ARR_ACT_R.class);
			MST_ARR_ACT_R t = MST_ARR_ACT_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			MST_ARR_SCHD_R t2 = MST_ARR_SCHD_R.create("T2");
			MST_ARR_PR_R t3 = MST_ARR_PR_R.create("T3");
			MST_IV_D_R t4 = MST_IV_D_R.create("T4");
			
			bldr.setSelect(t.arr_act_no, t3.iv_d_no, t4.trd_cur_tax_amt);
			bldr.addLeftOuterJoin(t2, t.arr_schd_no.eq(t2.arr_schd_no));
			bldr.addLeftOuterJoin(t3, t2.arr_pr_no.eq(t3.arr_pr_no));
			bldr.addLeftOuterJoin(t4, t3.iv_d_no.eq(t4.iv_d_no));
			bldr.addWhereWithAnd(t.arr_act_no.eq(bind("prov_src_act_no")));
			dbSelect("MSBEL5270_MST_ARR_ACT_S01", rsltL, bldr, up0());
			MCIndexKey arrKey = rsltL.createIndex(MST_ARR_ACT_R.$arr_act_no);
			MCIndexKey ivdKey = rsltL.createIndex(MST_IV_D_R.$iv_d_no);
			
			if (rsltL.isEmpty()) {
				return;
			}
			up0().addStringColumn("iv_d_no");
			for (ProvActUpd01_DtlR r : up0()) {
				MST_ARR_ACT_R tgtR = rsltL.getFirst(arrKey, r.prov_src_act_no());
				if (!isNull(tgtR)) {
					r.setStringNE("iv_d_no", tgtR.getStringNE("iv_d_no"));
				}
			}
			
			// 有償支給のインボイスの場合、インボイス登録時に税調整済みだが
			// インボイス明細と支給が1:Nのときにずれないように金額調整する
			for (MCList<ProvActUpd01_DtlR> tgtL : up0().groupList("iv_d_no")) {
				String ivDNo = tgtL.get(0).getStringNE("iv_d_no");
				if (isNull(ivDNo)) {
					continue;
				}
				MST_ARR_ACT_R ivR = rsltL.getFirst(ivdKey, ivDNo);
				if (isNull(ivR) || !MAC_PROV_TYP.isONR_PROV(tgtL.get(0).prov_typ()) || !MAC_DATA_CRUD_TYP.isCRT(tgtL.get(0).data_crud_typ())
						|| isSame(MCNumber.ZERO, tgtL.sum(ProvActUpd01_DtlR.$trd_cur_amt))) {
					continue;
				}
				MCNumber ttlTaxAmt = ivR.trd_cur_tax_amt();
				FXUCC_Divide.prop(tgtL, ttlTaxAmt, MSBEL_ProvSchdService.getCurCache().getEx(tgtL.get(0).trd_cur_cd()).amt_dec_place().intValue(), ProvActUpd01_DtlR.$trd_cur_amt, "tmp_cur_tax_amt");
				
				for (ProvActUpd01_DtlR r : tgtL) {
					if (MSBEL_ProvSchdService.getTaxCache().get(r.tax_cd()).inc_tax_flg()) {
						r.trd_cur_amt(r.trd_cur_amt().add(r.trd_cur_tax_amt())
								.subtract(r.getNumber("tmp_cur_tax_amt")));
					}
					r.trd_cur_tax_amt(r.getNumber("tmp_cur_tax_amt"));
				}
			}
			
			for (ProvActUpd01_DtlR r : up0()) {
				if (!MAC_PROV_TYP.isONR_PROV(r.prov_typ()) || !MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					continue;
				}
				String xrateRndTyp = getCo().xrate_rnd_typ();
				MAM_CUR_R baseCur = MSBEL_ProvSchdService.getCurCache().getEx(r.base_cur_cd());
				r.base_cur_amt(MAUCL_MCDataUtil.convToBaseCur(r.trd_cur_amt(), r.xrate(), baseCur.amt_dec_place(), xrateRndTyp));
				r.base_cur_tax_amt(MAUCL_MCDataUtil.convToBaseCur(r.trd_cur_tax_amt(), r.xrate(), baseCur.amt_dec_place(), xrateRndTyp));

				// 取引通貨から納税通貨へ換算
				if (!isNull(r.ptax_cur_cd())) {
					MAM_CUR_R ptaxCur = MSBEL_ProvSchdService.getCurCache().getEx(r.ptax_cur_cd());
					r.ptax_cur_amt(MAUCL_MCDataUtil.convCur(r.trd_cur_amt(), r.ptax_xrate(), ptaxCur.amt_dec_place(), xrateRndTyp));
					r.ptax_cur_tax_amt(MAUCL_MCDataUtil.convCur(r.trd_cur_tax_amt(), r.ptax_xrate(), ptaxCur.amt_dec_place(), xrateRndTyp));
				}
			}
		}
		protected void setTakeOverCol(boolean takeOverFlg, ProvActUpd01_DtlR r, MST_PROV_ACT_R paR, boolean addSlipFlg) {
			if (takeOverFlg) {
				r.stk_mng_typ(paR.stk_mng_typ());
				r.sno1_mng_typ(paR.sno1_mng_typ());
				r.sno2_mng_typ(paR.sno2_mng_typ());
				r.sno3_mng_typ(paR.sno3_mng_typ());
				r.sno4_mng_typ(paR.sno4_mng_typ());
			}
			else {
				MAM_ITM_R itm = _itmCache.getEx(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				r.stk_mng_typ(itm.stk_mng_typ());
				r.sno1_mng_typ(itm.sno1_mng_typ());
				r.sno2_mng_typ(itm.sno2_mng_typ());
				r.sno3_mng_typ(itm.sno3_mng_typ());
				r.sno4_mng_typ(itm.sno4_mng_typ());

				if (addSlipFlg) {
					r.pack_unit_cd(paR.pack_unit_cd());
					r.pack_unit_qty(paR.pack_unit_qty());
				}
				else {
					MAVM_ITM_UNIT_R itmUnit = _itmUnitCache.getEx(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.trd_unit_cd());
					if (itmUnit.pack_flg()) {
						r.pack_unit_cd(r.trd_unit_cd());
						r.pack_unit_qty(r.trd_unit_qty());
					}
					else {
						r.pack_unit_cd(r.base_unit_cd());
						r.pack_unit_qty(r.base_unit_qty());
					}
				}
			}
		}

		protected MST_PROV_ACT_R updCrt(MST_PROV_ACT_R paR, MCList<MST_PROV_ACT_R> disL, MCList<MST_PROV_ACT_R> canL) {
			MST_PROV_ACT_R canR = paR.clone();

			// 伝票状況区分を無効に更新する
			paR.slip_sts_typ(MAC_SLIP_STS_TYP.DIS.value());
			disL.add(paR);

			// 伝票状況区分が取り消しの追加行
			canR.prov_act_seq(canR.prov_act_seq().add(MCNumber.ONE));
			canR.slip_sts_typ(MAC_SLIP_STS_TYP.CAN.value());
			canR.trd_unit_qty(canR.trd_unit_qty().negate());
			canR.pack_unit_qty(canR.pack_unit_qty().negate());
			canR.base_unit_qty(canR.base_unit_qty().negate());
			if (!isNull(canR.trd_cur_amt())) canR.trd_cur_amt(canR.trd_cur_amt().negate());
			if (!isNull(canR.trd_cur_tax_amt())) canR.trd_cur_tax_amt(canR.trd_cur_tax_amt().negate());
			if (!isNull(canR.base_cur_amt())) canR.base_cur_amt(canR.base_cur_amt().negate());
			if (!isNull(canR.base_cur_tax_amt())) canR.base_cur_tax_amt(canR.base_cur_tax_amt().negate());
			if (!isNull(canR.ptax_cur_amt())) canR.ptax_cur_amt(canR.ptax_cur_amt().negate());
			if (!isNull(canR.ptax_cur_tax_amt())) canR.ptax_cur_tax_amt(canR.ptax_cur_tax_amt().negate());
			if (!isNull(canR.wtax_amt())) canR.wtax_amt(canR.wtax_amt().negate());

			return canR;
		}

		protected boolean isWtax(ProvActUpd01_DtlR r) {
			// 源泉税額は取引通貨、基準通貨、納税通貨が全て一致する場合のみ設定する
			// 納税通貨が取得できない場合は一致しているとみなす
			if (isSame(r.trd_cur_cd(), r.base_cur_cd()) && (isNull(r.ptax_cur_cd()) || isSame(r.trd_cur_cd(), r.ptax_cur_cd()))) {
				return true;
			}
			else {
				return false;
			}
		}

		protected void setByMst(ProvActUpd01_DtlR r, MAM_BP_R bpCacheR, MAM_PROV_UPRI_R puR) {
			if (isNull(r.prov_basis_typ())) {
				r.prov_basis_typ(bpCacheR.prov_basis_typ());
			}
			if (isNull(r.trd_cur_cd())) {
				r.trd_cur_cd(bpCacheR.cur_cd());
			}
			if (isNull(r.xrate())) {
				if (isSame(r.trd_cur_cd(), r.base_cur_cd())) {
					r.xrate(MCNumber.ONE);
				}
				else {
					r.xrate(MSBEL_ProvSchdService.getBaseRateCache().getEx(r.accpt_dt(), r.trd_cur_cd(), r.base_cur_cd(), r.xrate_cd()).xrate());
				}
			}
			if (isNull(r.ptax_xrate())) {
				if (isSame(r.trd_cur_cd(), r.ptax_cur_cd())) {
					r.ptax_xrate(MCNumber.ONE);
				}
				else {
					r.ptax_xrate(MSBEL_ProvSchdService.getPtaxRateCache().get(r.accpt_dt(), r.trd_cur_cd(), r.ptax_cur_cd(), r.xrate_cd()).xrate());
				}
			}
			if (isNull(r.tax_cd())) {
				r.tax_cd(MSBEL_ProvSchdService.getTaxCdCache().get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.prsppl_cd(), r.accpt_dt()).tax_cd());
			}
			if (isNull(r.trd_cur_upri())) {
				if (isNull(puR) || puR.isEmpty()) {
					r.trd_cur_upri(MCNumber.ZERO);
				}
				else {
					r.trd_cur_upri(puR.upri());
				}
			}
			if (isWtax(r)) {
				if (isNull(r.wtax_rate())) {
					r.wtax_rate(MSBEL_ProvSchdService.getWtaxCache().get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.accpt_dt()).wtax_rate());
				}
			}
			else {
				r.wtax_rate(null);
			}
		}

		protected void setByProvSchd(ProvActUpd01_DtlR r, MST_PROV_SCHD_R psR) {
			if (isNull(r.trd_cur_cd())) {
				r.trd_cur_cd(psR.trd_cur_cd());
			}
			if (isNull(r.xrate())) {
				if (psR.xrate_inpt_flg()) {
					r.xrate(psR.xrate());
				}
				else {
					if (isSame(r.trd_cur_cd(), r.base_cur_cd())) {
						r.xrate(MCNumber.ONE);
					}
					else {
						r.xrate(MSBEL_ProvSchdService.getBaseRateCache().getEx(r.accpt_dt(), r.trd_cur_cd(), r.base_cur_cd(), r.xrate_cd()).xrate());
					}
				}
			}
			if (isNull(r.ptax_xrate())) {
				if (psR.ptax_xrate_inpt_flg()) {
					r.ptax_xrate(psR.ptax_xrate());
				}
				else {
					if (isSame(r.trd_cur_cd(), r.ptax_cur_cd())) {
						r.ptax_xrate(MCNumber.ONE);
					}
					else {
						r.ptax_xrate(MSBEL_ProvSchdService.getPtaxRateCache().get(r.accpt_dt(), r.trd_cur_cd(), r.ptax_cur_cd(), r.xrate_cd()).xrate());
					}
				}
			}
			if (isNull(r.tax_cd())) {
				if(psR.tax_fix_flg()) {
					r.tax_cd(psR.tax_cd());
				}
				else {
					r.tax_cd(MSBEL_ProvSchdService.getTaxCdCache().get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.prsppl_cd(), r.accpt_dt()).tax_cd());
				}
			}
			if (isNull(r.trd_cur_upri())) {
				r.trd_cur_upri(psR.trd_cur_upri());
			}
			if (isWtax(r)) {
				if (isNull(r.wtax_rate())) {
					r.wtax_rate(psR.wtax_rate());
				}
			}
			else {
				r.wtax_rate(null);
			}
		}

		protected void setByProvAct(ProvActUpd01_DtlR r, MST_PROV_ACT_R paR, MST_PROV_SCHD_R psR, MAM_BP_R bpCacheR, MAM_PROV_UPRI_R puR) {
			if (paR.upd_flg()) {
				setByProdActSub(r, paR);
			}
			else {
				if (isNull(psR) || psR.isEmpty()) {
					if (isNull(puR) || puR.isEmpty()) {
						setByProdActSub(r, paR);
					}
					else {
						setByMst(r, bpCacheR, puR);
					}
				}
				else {
					setByProvSchd(r, psR);
				}
			}
		}

		protected void setByProdActSub(ProvActUpd01_DtlR r, MST_PROV_ACT_R paR) {
			if (isNull(r.trd_cur_cd())) {
				r.trd_cur_cd(paR.trd_cur_cd());
			}
			if (isNull(r.xrate())) {
				r.xrate(paR.xrate());
			}
			if (isNull(r.ptax_xrate())) {
				r.ptax_xrate(paR.ptax_xrate());
			}
			if (isNull(r.tax_cd())) {
				r.tax_cd(paR.tax_cd());
			}
			if (isNull(r.trd_cur_upri())) {
				r.trd_cur_upri(paR.trd_cur_upri());
			}
			if (isWtax(r)) {
				if (isNull(r.wtax_rate()) && !r.not_completion_flg()) {
					r.wtax_rate(paR.wtax_rate());
				}
			}
			else {
				r.wtax_rate(null);
			}
		}

		protected void convByRate(ProvActUpd01_DtlR r) {
			// 取引通貨金額、税額の算出
			MAM_TAX_R taxCacheR = MSBEL_ProvSchdService.getTaxCache().get(r.tax_cd());
			if (!up1().upd_flg()) {
				MCRow amtR = MAUCL_AmtUtil.getAmtAndTax(
						r.trd_cur_upri(),
						r.base_unit_qty(),
						taxCacheR.tax_rate(),
						taxCacheR.inc_tax_flg(),
						MSBEL_ProvSchdService.getCurCache().getEx(r.trd_cur_cd()).amt_dec_place(),
						MSBEL_ProvSchdService.getBpCache().getEx(r.prsppl_cd()).prov_amt_rnd_typ(),
						MSBEL_ProvSchdService.getBpCache().getEx(r.prsppl_cd()).prov_tax_rnd_typ());
				r.trd_cur_amt(amtR.getNumber("amt"));
				r.trd_cur_tax_amt(amtR.getNumber("tax_amt"));
			}

			String xrateRndTyp = getCo().xrate_rnd_typ();

			// 取引通貨から基準通貨へ換算
			MAM_CUR_R baseCur = MSBEL_ProvSchdService.getCurCache().getEx(r.base_cur_cd());
			r.base_cur_upri(MAUCL_MCDataUtil.convToBaseCur(r.trd_cur_upri(), r.xrate(), baseCur.upri_dec_place(), xrateRndTyp));
			r.base_cur_amt(MAUCL_MCDataUtil.convToBaseCur(r.trd_cur_amt(), r.xrate(), baseCur.amt_dec_place(), xrateRndTyp));
			r.base_cur_tax_amt(MAUCL_MCDataUtil.convToBaseCur(r.trd_cur_tax_amt(), r.xrate(), baseCur.amt_dec_place(), xrateRndTyp));

			// 取引通貨から納税通貨へ換算
			if (!isNull(r.ptax_cur_cd())) {
				MAM_CUR_R ptaxCur = MSBEL_ProvSchdService.getCurCache().getEx(r.ptax_cur_cd());
				r.ptax_cur_upri(MAUCL_MCDataUtil.convCur(r.trd_cur_upri(), r.ptax_xrate(), ptaxCur.upri_dec_place(), xrateRndTyp));
				r.ptax_cur_amt(MAUCL_MCDataUtil.convCur(r.trd_cur_amt(), r.ptax_xrate(), ptaxCur.amt_dec_place(), xrateRndTyp));
				r.ptax_cur_tax_amt(MAUCL_MCDataUtil.convCur(r.trd_cur_tax_amt(), r.ptax_xrate(), ptaxCur.amt_dec_place(), xrateRndTyp));
			}

			// 源泉税額
			if (isWtax(r) && !isNull(r.wtax_rate())) {
				r.wtax_amt(r.trd_cur_amt().multiply(r.wtax_rate()).divide(100, baseCur.amt_dec_place().intValue(), MAC_RND_TYP.toMC(getCo().wtax_rnd_typ())));
			}
			else {
				r.wtax_amt(null);
			}
		}

		protected void clearOnrProvCol(ProvActUpd01_DtlR r) {
			r.prov_basis_typ(null);
			r.xrate_cd(null);
			r.xrate(null);
			r.ptax_xrate(null);
			r.trd_cur_cd(null);
			r.base_cur_cd(null);
			r.ptax_cur_cd(null);
			r.tax_cd(null);
			r.trd_cur_upri(null);
			r.trd_cur_amt(null);
			r.trd_cur_tax_amt(null);
			r.base_cur_upri(null);
			r.base_cur_amt(null);
			r.base_cur_tax_amt(null);
			r.ptax_cur_upri(null);
			r.ptax_cur_amt(null);
			r.ptax_cur_tax_amt(null);
			r.wtax_rate(null);
			r.wtax_amt(null);
		}

		protected void getSlip(MCList<MST_PROV_ACT_R> disL, MCList<MST_PROV_ACT_R> canL, MCList<ProvActUpd01_DtlR> crtL, MCList<ProvActUpd01_DtlR> ioActL) {
			MCList<ProvActUpd01_DtlR> xfrL = MCList.create(ProvActUpd01_DtlR.class);
			MCList<ProvActUpd01_DtlR> arrL = MCList.create(ProvActUpd01_DtlR.class);
			MCList<ProvActUpd01_DtlR> shipL = MCList.create(ProvActUpd01_DtlR.class);
			MCList<ProvActUpd01_DtlR> provL = MCList.create(ProvActUpd01_DtlR.class);

			for (ProvActUpd01_DtlR r :crtL) {
				if (MSC_PROV_SRC_ACT_TYP.isXFR(r.prov_src_act_typ())) {
					xfrL.add(r);
				}
				else if (MSC_PROV_SRC_ACT_TYP.isSHIP(r.prov_src_act_typ())) {
					r.arr_act_no(r.prov_src_act_no());
					arrL.add(r);
				}
				else if (MSC_PROV_SRC_ACT_TYP.isRET_SHIP(r.prov_src_act_typ())) {
					shipL.add(r);
				}
				else if (!MAC_STR.isNULL_VAL(r.dlv_slip_no())) {
					provL.add(r);
				}
			}

			// 納品書ＮＯが同じ支給実績を取得して更新対象に追加する
			if (!xfrL.isEmpty()) addSlip(getXfr(xfrL), disL, canL, crtL, ioActL);
			if (!arrL.isEmpty()) addSlip(getArr(arrL), disL, canL, crtL, ioActL);
			if (!shipL.isEmpty()) addSlip(getShip(shipL), disL, canL, crtL, ioActL);
			if (!provL.isEmpty()) addSlip(getProv(provL), disL, canL, crtL, ioActL);
		}

		protected MCList<MST_PROV_ACT_R> getXfr(MCList<ProvActUpd01_DtlR> xfrL) {

			MCList<MST_XFR_ACT_D_R> dbcL = MCList.create(MST_XFR_ACT_D_R.class);
			for (ProvActUpd01_DtlR r : xfrL) {
				if (!isNull(r.getString(ProvActUpd01_DtlR.$prov_src_act_no))) {
					dbcL.add().setString(MST_XFR_ACT_D_R.$xfr_act_d_no, r.getString(ProvActUpd01_DtlR.$prov_src_act_no));
				}
			}
			dbcL = dbcL.groupBy(MST_XFR_ACT_D_R.$xfr_act_d_no);
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(MST_XFR_ACT_D_R.create("T"));
			dbWkDelete("MSBEL5270_MSW_XFR_ACT_D_D01", dbcL_bldr.getBaseDbc());
			dbWkInsert("MSBEL5270_MSW_XFR_ACT_D_I01", dbcL, dbcL_bldr.getBaseDbc());

			MST_XFR_ACT_D_R tt = MST_XFR_ACT_D_R.create("T2");
			MSW_XFR_ACT_D_KEY_R S1W1 = MSW_XFR_ACT_D_KEY_R.create("W1");
			MST_XFR_ACT_D_R S1T3 = MST_XFR_ACT_D_R.create("T3");

			MCList<MST_PROV_ACT_R> dbc = MCList.create(MST_PROV_ACT_R.class);
			MST_PROV_ACT_R t1 = MST_PROV_ACT_R.create("T");
			MCQueryApiBuilder dbcL_bldr1 = MCQueryApiBuilder.create(t1);
			dbcL_bldr1.addSelect(tt.dlv_slip_no,tt.dlv_slip_d_no);
			dbcL_bldr1.addInnerJoin(tt, bracket( t1.prov_src_act_no.eq(tt.xfr_act_d_no)));
			dbcL_bldr1.addWhereWithAnd(t1.prov_src_act_typ.eq(bind("prov_src_act_typ")));
			dbcL_bldr1.addWhereWithAnd(t1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			dbcL_bldr1.addWhereWithAnd(t1.trd_ptn_typ.eq(bind("trd_ptn_typ")));
			dbcL_bldr1.addWhereWithAnd(exists( subQuery() .select(value("X")) .from( S1W1 .innerJoin(S1T3).on( bracket( S1T3.xfr_act_d_no.eq(S1W1.xfr_act_d_no) ) ) ) .where( tt.dlv_slip_no.eq(S1T3.dlv_slip_no) )));
			dbSelect("MSBEL5270_MST_PROV_ACT_S01", dbc, dbcL_bldr1, xfrL.groupBy(ProvActUpd01_DtlR.$prov_src_act_typ, ProvActUpd01_DtlR.$trd_ptn_typ));

			setAcDt(dbc, xfrL);
			
			return dbc;
		}

		protected MCList<MST_PROV_ACT_R> getArr(MCList<ProvActUpd01_DtlR> arrL) {

			MCList<MST_ARR_ACT_R> dbcL = MCList.create(MST_ARR_ACT_R.class);
			for (ProvActUpd01_DtlR r : arrL) {
				if (!isNull(r.getString(ProvActUpd01_DtlR.$arr_act_no))) {
					dbcL.add().setString(MST_ARR_ACT_R.$arr_act_no, r.getString(ProvActUpd01_DtlR.$arr_act_no));
				}
			}
			dbcL = dbcL.groupBy(MST_ARR_ACT_R.$arr_act_no);
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(MST_ARR_ACT_R.create("T"));
			dbWkDelete("MSBEL5270_MSW_ARR_ACT_D01", dbcL_bldr.getBaseDbc());
			dbWkInsert("MSBEL5270_MSW_ARR_ACT_I01", dbcL, dbcL_bldr.getBaseDbc());

			MST_ARR_ACT_R t2 = MST_ARR_ACT_R.create("T2");
			MST_ARR_SCHD_R t5 = MST_ARR_SCHD_R.create("T5");
			MST_ARR_PR_R t6 = MST_ARR_PR_R.create("T6");
			MSW_ARR_ACT_KEY_R S1W1 = MSW_ARR_ACT_KEY_R.create("W1");
			MST_ARR_ACT_R S1T3 = MST_ARR_ACT_R.create("T3");
			MST_ARR_SCHD_R S1T4 = MST_ARR_SCHD_R.create("T4");

			MCList<MST_PROV_ACT_R> dbc = MCList.create(MST_PROV_ACT_R.class);
			MST_PROV_ACT_R t1 = MST_PROV_ACT_R.create("T");
			MCQueryApiBuilder dbcL_bldr1 = MCQueryApiBuilder.create(t1);
			dbcL_bldr1.addSelect(t5.dlv_slip_no,t6.dlv_slip_d_no);
			dbcL_bldr1.addInnerJoin(t2, bracket( t1.prov_src_act_no.eq(t2.arr_act_no)));
			dbcL_bldr1.addLeftOuterJoin(t5, bracket( t5.arr_schd_no.eq(t2.arr_schd_no)));
			dbcL_bldr1.addLeftOuterJoin(t6, bracket( t6.arr_pr_no.eq(t5.arr_pr_no)));
			dbcL_bldr1.addWhereWithAnd(t1.prov_src_act_typ.eq(bind("prov_src_act_typ")));
			dbcL_bldr1.addWhereWithAnd(t1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			dbcL_bldr1.addWhereWithAnd(t1.trd_ptn_typ.eq(bind("trd_ptn_typ")));
			dbcL_bldr1.addWhereWithAnd(exists( subQuery() .select(value("X")) .from( S1W1 .innerJoin(S1T3).on( bracket( S1T3.arr_act_no.eq(S1W1.arr_act_no) ) ) .innerJoin(S1T4).on( bracket( S1T4.arr_schd_no.eq(S1T3.arr_schd_no) ) ) ) .where( S1T4.dlv_slip_no.eq(t5.dlv_slip_no) )));
			dbSelect("MSBEL5270_MST_PROV_ACT_S02", dbc, dbcL_bldr1, arrL.groupBy(ProvActUpd01_DtlR.$prov_src_act_typ, ProvActUpd01_DtlR.$trd_ptn_typ));

			setAcDt(dbc, arrL);

			return dbc;
		}

		protected MCList<MST_PROV_ACT_R> getShip(MCList<ProvActUpd01_DtlR> shipL) {
			
			MCList<MST_SHIP_ACT_D_R> dbcL = MCList.create(MST_SHIP_ACT_D_R.class);
			for (ProvActUpd01_DtlR r : shipL) {
				if (!isNull(r.getString(ProvActUpd01_DtlR.$prov_src_act_no))) {
					dbcL.add().setString(MST_SHIP_ACT_D_R.$ship_act_d_no, r.getString(ProvActUpd01_DtlR.$prov_src_act_no));
				}
			}
			dbcL = dbcL.groupBy(MST_SHIP_ACT_D_R.$ship_act_d_no);
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(MST_SHIP_ACT_D_R.create("T"));
			dbWkDelete("MSBEL5270_MSW_SHIP_ACT_D_D01", dbcL_bldr.getBaseDbc());
			dbWkInsert("MSBEL5270_MSW_SHIP_ACT_D_I01", dbcL, dbcL_bldr.getBaseDbc());

			MST_SHIP_ACT_D_R t2 = MST_SHIP_ACT_D_R.create("T2");
			MSW_SHIP_ACT_D_KEY_R S1W1 = MSW_SHIP_ACT_D_KEY_R.create("W1");
			MST_SHIP_ACT_D_R S1T3 = MST_SHIP_ACT_D_R.create("T3");

			MCList<MST_PROV_ACT_R> dbc = MCList.create(MST_PROV_ACT_R.class);
			MST_PROV_ACT_R t1 = MST_PROV_ACT_R.create("T");
			MCQueryApiBuilder dbcL_bldr1 = MCQueryApiBuilder.create(t1);
			dbcL_bldr1.addSelect(t2.dlv_slip_no,t2.dlv_slip_d_no);
			dbcL_bldr1.addInnerJoin(t2, bracket( t1.prov_src_act_no.eq(t2.ship_act_d_no)));
			dbcL_bldr1.addWhereWithAnd(t1.prov_src_act_typ.eq(bind("prov_src_act_typ")));
			dbcL_bldr1.addWhereWithAnd(t1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			dbcL_bldr1.addWhereWithAnd(t1.trd_ptn_typ.eq(bind("trd_ptn_typ")));
			dbcL_bldr1.addWhereWithAnd(exists( subQuery() .select(value("X")) .from( S1W1 .innerJoin(S1T3).on( bracket( S1T3.ship_act_d_no.eq(S1W1.ship_act_d_no) ) ) ) .where( t2.dlv_slip_no.eq(S1T3.dlv_slip_no) )));
			dbSelect("MSBEL5270_MST_PROV_ACT_S03", dbc, dbcL_bldr1, shipL.groupBy(ProvActUpd01_DtlR.$prov_src_act_typ, ProvActUpd01_DtlR.$trd_ptn_typ));

			setAcDt(dbc, shipL);

			return dbc;
		}
		protected MCList<MST_PROV_ACT_R> getProv(MCList<ProvActUpd01_DtlR> provL) {
			
			MCList<MST_PROV_ACT_R> dbcL = MCList.create(MST_PROV_ACT_R.class);
			for (ProvActUpd01_DtlR r : provL) {
				if (!isNull(r.getString(ProvActUpd01_DtlR.$prov_act_no))) {
					dbcL.add().setString(MST_PROV_ACT_R.$prov_act_no, r.getString(ProvActUpd01_DtlR.$prov_act_no));
				}
			}
			dbcL = dbcL.groupBy(MST_PROV_ACT_R.$prov_act_no);
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(MST_PROV_ACT_R.create("T"));
			dbWkDelete("MSBEL5270_MSW_PROV_ACT_D01", dbcL_bldr.getBaseDbc());
			dbWkInsert("MSBEL5270_MSW_PROV_ACT_I01", dbcL, dbcL_bldr.getBaseDbc());

			MSW_PROV_ACT_KEY_R S1W1 = MSW_PROV_ACT_KEY_R.create("W1");
			MST_PROV_ACT_R S1T2 = MST_PROV_ACT_R.create("T2");

			MCList<MST_PROV_ACT_R> dbc = MCList.create(MST_PROV_ACT_R.class);
			MST_PROV_ACT_R t1 = MST_PROV_ACT_R.create("T");
			MCQueryApiBuilder dbcL_bldr1 = MCQueryApiBuilder.create(t1);
			dbcL_bldr1.addSelect(t1.dlv_slip_no,t1.dlv_slip_d_no);
			dbcL_bldr1.addWhereWithAnd(t1.prov_src_act_typ.eq(bind("prov_src_act_typ")));
			dbcL_bldr1.addWhereWithAnd(t1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			dbcL_bldr1.addWhereWithAnd(t1.trd_ptn_typ.eq(bind("trd_ptn_typ")));
			dbcL_bldr1.addWhereWithAnd(exists(subQuery().select(value("X")).from(S1W1
					.innerJoin(S1T2)
					.on(bracket(S1T2.prov_act_no.eq(S1W1.prov_act_no)
							.and(S1T2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))))))
					.where(t1.dlv_slip_no.eq(S1T2.dlv_slip_no))));
			dbSelect("MSBEL5270_MST_PROV_ACT_S04", dbc, dbcL_bldr1, provL.groupBy(ProvActUpd01_DtlR.$prov_src_act_typ, ProvActUpd01_DtlR.$trd_ptn_typ));

			setAcDt(dbc, provL);

			return dbc;
		}

		protected void addSlip(MCList<MST_PROV_ACT_R> dbc,
				MCList<MST_PROV_ACT_R> disL, MCList<MST_PROV_ACT_R> canL, MCList<ProvActUpd01_DtlR> crtL, MCList<ProvActUpd01_DtlR> ioActL) {

			disL.addNumberColumn("tax_rate");
			dbc.addNumberColumn("tax_rate");

			// 納品書ＮＯ、納品書明細ＮＯを補完する
			MCIndexKey idxKey = dbc.createIndex(MST_PROV_ACT_R.$prov_act_no);
			for (MST_PROV_ACT_R r : disL) {
				MST_PROV_ACT_R tmpR = dbc.getFirst(idxKey, r.prov_act_no());
				if (!isNull(tmpR)) {
					r.dlv_slip_no(tmpR.dlv_slip_no());
					r.dlv_slip_d_no(tmpR.dlv_slip_d_no());
				}
				MAM_TAX_R taxR = MSBEL_ProvSchdService.getTaxCache().get(r.tax_cd());
				r.addNumberColumn("tax_rate", taxR.tax_rate());
			}

			for (MST_PROV_ACT_R r : dbc) {
				MAM_TAX_R taxR = MSBEL_ProvSchdService.getTaxCache().get(r.tax_cd());
				r.addNumberColumn("tax_rate", taxR.tax_rate());
			}

			for (MST_PROV_ACT_R paR :extSlip(disL, dbc)) {
				// 新規行を作成する
				ProvActUpd01_DtlR crtR = ProvActUpd01_DtlR.create();
				MCRow.copyall(crtR.pa(), paR);

				// 日付の取得
				MCDate canAcDt = paR.getDate("src_can_ac_dt");
				MCDate acDt = paR.getDate("src_ac_dt");

				// 更新レコードを作成する
				MST_PROV_ACT_R canR = updCrt(paR, disL, canL);
				// MAUCL_DptUtil.setCanDpt用の設定
				// 計上日
				canR.setDateNE("dis_ac_dt", paR.ac_dt());
				canR.setDateNE("can_ac_dt", canAcDt);
				canR.ac_dt(canAcDt);
				canR.ac_ym(getAcYm(canR.ac_dt()));
				// 部門
				canR.setStringNE(getCrtCol(MST_PROV_ACT_R.$ap_dpt_cd), crtR.ap_dpt_cd());
				canL.add(canR);

				// 新規行の設定
				crtR.prov_act_no(canR.prov_act_no());
				crtR.prov_act_seq(canR.prov_act_seq().add(MCNumber.ONE));
				crtR.prov_act_rev(canR.prov_act_rev().add(MCNumber.ONE));
				setTakeOverCol(up1().upd_flg(), crtR, paR, true);
				crtR.slip_sts_typ(MAC_SLIP_STS_TYP.CRT.value());
				crtR.ac_dt(acDt);
				crtR.ac_ym(getAcYm(acDt));
				if (!isNull(canAcDt)) crtR.can_ac_dt(canAcDt);
				crtR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				if (MAC_PROV_TYP.isONR_PROV(crtR.prov_typ())) {
					crtR.asppl_cd(MSBEL_ProvSchdService.getBpCache().getEx(crtR.prsppl_cd()).asppl_cd());
				}

				crtL.add(crtR);
				ioActL.add(crtR);
			}

			setDlvSlipNo(crtL, dbc);
		}

		protected void setAcDt(MCList<MST_PROV_ACT_R> dbc, MCList<?> list) {
			if (!isNull(dbc)) {
				MCIndexKey dbcActIdx = dbc.createIndex(MST_PROV_ACT_R.$prov_act_no);
				MCIndexKey dbcSlipIdx = dbc.createIndex(MST_PROV_ACT_R.$dlv_slip_no);
				
				dbc.addDateColumn("src_ac_dt");
				dbc.addDateColumn("src_can_ac_dt");

				for (MCRow r : list) {
					MST_PROV_ACT_R dbR = dbc.getFirst(dbcActIdx, r.getString("prov_act_no"));
					if (!isNull(dbR)) {
						dbc.subList(dbcSlipIdx, dbR.dlv_slip_no()).setDate("src_ac_dt", r.getDate("ac_dt"));
						dbc.subList(dbcSlipIdx, dbR.dlv_slip_no()).setDate("src_can_ac_dt", r.getDate("can_ac_dt"));
					}
				}
			}
		}

		protected MCList<MST_PROV_ACT_R> extSlip(MCList<MST_PROV_ACT_R> disL, MCList<MST_PROV_ACT_R> dbc) {
			MCList<MST_PROV_ACT_R> dbcTmp = MCList.create(MST_PROV_ACT_R.class);
			MCIndexKey keyIdx = disL.createIndex(_getSlipKey());
			MCIndexKey noIdx = disL.createIndex(MST_PROV_ACT_R.$prov_act_no);
			for (MST_PROV_ACT_R r :dbc) {
				if (disL.contains(keyIdx, r.toArray(_getSlipKey()))) {
					if (!disL.contains(noIdx, r.prov_act_no())) {
						dbcTmp.add(r);
					}
				}
			}
			return dbcTmp;
		}

		protected void setDlvSlipNo(MCList<ProvActUpd01_DtlR> crtL, MCList<MST_PROV_ACT_R> dbc) {
			MCIndexKey idx = dbc.createIndex(MST_PROV_ACT_R.$prov_act_no);
			for (ProvActUpd01_DtlR r :crtL) {
				MST_PROV_ACT_R pa = dbc.getFirst(idx, r.prov_act_no());
				if (!isNull(pa)) {
					if (MAC_STR.isNULL_VAL(r.dlv_slip_no())) {
						r.dlv_slip_no(pa.dlv_slip_no());
					}
					if (MAC_STR.isNULL_VAL(r.dlv_slip_d_no())) {
						r.dlv_slip_d_no(pa.dlv_slip_d_no());
					}
				}
			}
		}

		/**
		 * 伝票単位での消費税計算
		 * 出荷帳票発行サービスのsplit()と関連して修正する必要あり
		 * @param disL
		 * @param crtL
		 * @param ioActL
		 */
		protected void adjustSlip(MCList<MST_PROV_ACT_R> disL,
				MCList<ProvActUpd01_DtlR> crtL, MCList<ProvActUpd01_DtlR> ioActL) {

			if (crtL.isEmpty()) return;

			// 調整対象のレコードを抽出する
			MCList<ProvActUpd01_DtlR> crtTmpL;
			crtTmpL = crtL.subList(r -> MAC_PROV_TYP.isONR_PROV(r.prov_typ())
					&& MAC_TAX_CALC_TYP.isSLIP(MSBEL_ProvSchdService.getBpCache().get(r.prsppl_cd()).prov_tax_calc_typ()));

			// 伝票帳票マスタを取得
			MCList<MAM_TRD_R> bindTrdL = MCList.create(MAM_TRD_R.class);
			for (ProvActUpd01_DtlR dtlR : crtTmpL.groupBy(ProvActUpd01_DtlR.$trd_cd)) {
				MAM_TRD_R trdR = MAM_TRD_R.create();
				trdR.trd_cd(dtlR.trd_cd());
				bindTrdL.add(trdR);
			}

			MCList<MAM_TRD_R> trdL = MCList.create(MAM_TRD_R.class);
			MAM_TRD_R t1 = MAM_TRD_R.create("T");
			MCQueryApiBuilder dbcL_bldr1 = MCQueryApiBuilder.create(t1);
			dbcL_bldr1.setSelect(t1.trd_cd, t1.slip_form_cd);
			dbSelectKey("MSBEL5270_MAM_TRD_S01", trdL, dbcL_bldr1, bindTrdL);
			MCIndexKey trdKey = trdL.createIndex(MAM_TRD_R.$trd_cd);

			MCList<MAM_SLIP_FORM_R> bindSlipFormL = MCList.create(MAM_SLIP_FORM_R.class);
			for (MAM_TRD_R trdR : trdL) {
				MAM_SLIP_FORM_R slipFormR = MAM_SLIP_FORM_R.create();
				slipFormR.slip_form_cd(trdR.slip_form_cd());
				bindSlipFormL.add(slipFormR);
			}

			MCList<MAM_SLIP_FORM_R> slipFormL = MCList.create(MAM_SLIP_FORM_R.class);
			MAM_SLIP_FORM_R t2 = MAM_SLIP_FORM_R.create("T");
			MCQueryApiBuilder dbcL_bldr2 = MCQueryApiBuilder.create(t2);
			dbcL_bldr2.setSelect(t2.slip_form_cd, t2.line_num);
			dbSelectKey("MSBEL5270_MAM_SLIP_FORM_S01", slipFormL, dbcL_bldr2, bindSlipFormL.groupBy(MAM_SLIP_FORM_R.$slip_form_cd));
			MCIndexKey slipFormKey = slipFormL.createIndex(MAM_SLIP_FORM_R.$slip_form_cd);

			MCList<ProvActUpd01_DtlR> calcTmpL = MCList.create(ProvActUpd01_DtlR.class);
			String[] grpKey = getSplitCnd();

			// ヘッダ単位でグループ化
			for (MCList<ProvActUpd01_DtlR> hdrGrpL : crtTmpL.groupList(getSlipKey())) {
				MAM_TRD_R trdR = trdL.getFirst(trdKey, hdrGrpL.get(0).trd_cd());
				MAM_SLIP_FORM_R slipFormR = slipFormL.getFirst(slipFormKey, trdR.slip_form_cd());
				int line = MCNumber.valueOf(Math.pow(10, MST_DLV_SLIP_R.slip_line_max_META.length()) - 1).intValue();
				if (!isNull(slipFormR) && !isNull(slipFormR.line_num())) {
					line = slipFormR.line_num().intValue();
				}

				for (MCList<ProvActUpd01_DtlR> curGrpL : hdrGrpL.groupList(ProvActUpd01_DtlR.$tax_rate)) {
					MCList<ProvActUpd01_DtlR>[] grpL = curGrpL.groupList(grpKey);

					// 上り電文の順番を優先に並び替える
					for (int i=0; i<grpL.length; i++) {
						grpL[i].sort(ProvActUpd01_DtlR.$peg_no);
					}
					Arrays.sort(grpL, new Comparator<MCList<ProvActUpd01_DtlR>>() {
						public int compare(MCList<ProvActUpd01_DtlR> o1, MCList<ProvActUpd01_DtlR> o2) {
							return nvl(o1.get(0).peg_no(), MCNumber.ZERO).compareTo(nvl(o2.get(0).peg_no(), MCNumber.ZERO));
						}
					});

					// 納品伝票明細の行数で伝票を分割
					for (int i=0, j=1; i<grpL.length; i++) {
						for (ProvActUpd01_DtlR dtlR : grpL[i]) {
							calcTmpL.add(dtlR);
						}
						if (j++ >= line) {
							j = 1;
							if (!isNull(calcTmpL)) {
								setAmt(calcTmpL);
							}
							calcTmpL.clear();
						}
					}
					if (!isNull(calcTmpL)) {
						setAmt(calcTmpL);
					}
					calcTmpL.clear();
				}
			}
		}

		/**
		 * 伝票を分割する条件を取得する
		 * 出荷帳票発行サービスと合わせる
		 */
		protected String[] getSplitCnd() {
			ArrayList<String> arr = new ArrayList<>();

			arr.add(ProvActUpd01_DtlR.$itm_cd);
			arr.add(ProvActUpd01_DtlR.$itm_sub1);
			arr.add(ProvActUpd01_DtlR.$itm_sub2);
			arr.add(ProvActUpd01_DtlR.$itm_sub3);
			arr.add(ProvActUpd01_DtlR.$sno1);
			arr.add(ProvActUpd01_DtlR.$sno2);
			arr.add(ProvActUpd01_DtlR.$sno3);
			arr.add(ProvActUpd01_DtlR.$sno4);
			arr.add(ProvActUpd01_DtlR.$lot_no);
			arr.add(ProvActUpd01_DtlR.$sublot_no);
			arr.add(ProvActUpd01_DtlR.$trd_unit_cd);
			arr.add(ProvActUpd01_DtlR.$prov_typ);
			arr.add(ProvActUpd01_DtlR.$prov_basis_typ);

			return arr.toArray(new String[arr.size()]);
		}

		/**
		 * 金額および税額を算出し設定する
		 * 出荷帳票発行サービスのsetAmt()と関連して修正する必要あり
		 * @param calcTmpL
		 */
		protected void setAmt(MCList<ProvActUpd01_DtlR> calcTmpL) {
			// 取引先、通貨マスタ、税マスタ
			MAM_BP_R bpR = MSBEL_ProvSchdService.getBpCache().getEx(calcTmpL.get(0).prsppl_cd());
			MAM_CUR_R curR = MSBEL_ProvSchdService.getCurCache().getEx(calcTmpL.get(0).trd_cur_cd());
			MAM_CUR_R ptaxCurR = MSBEL_ProvSchdService.getCurCache().get(calcTmpL.get(0).ptax_cur_cd());

			// 取引通貨金額(税抜)、取引通貨税額、納税通貨金額、納税通貨税額
			MCNumber tmpTrdCurAmt = MCNumber.ZERO;

			for (ProvActUpd01_DtlR dtlR : calcTmpL) {
				// 外税のみ
				tmpTrdCurAmt = tmpTrdCurAmt.add(dtlR.trd_cur_amt());
			}

			MCNumber tmpTrdCurTaxAmt = getTaxAmt(
					tmpTrdCurAmt,
					calcTmpL.get(0).tax_rate(),
					curR.amt_dec_place(),
					bpR.prov_tax_rnd_typ(),
					false);

			// 明細から積み上げた金額から求めた税額を明細に割り戻す
			try {
				prop(calcTmpL,
						tmpTrdCurTaxAmt,
						curR.amt_dec_place().intValue(),
						ProvActUpd01_DtlR.$trd_cur_amt,
						ProvActUpd01_DtlR.$trd_cur_tax_amt);
			}
			catch (MCAppException ex) {
				if (!isSame(ex.getID(), FXUCC0014)) {
					throw ex;
				}
				// 伝票の合計金額が0になる場合は明細の税金額も0とする
				calcTmpL.setValue(ProvActUpd01_DtlR.$trd_cur_tax_amt, MCNumber.ZERO);
			}

			for (ProvActUpd01_DtlR dtlR : calcTmpL) {
				// 基準通貨換算
				dtlR.base_cur_tax_amt(convToBaseCur(
					dtlR.trd_cur_tax_amt(),
					dtlR.xrate(),
					getBaseCur().amt_dec_place(),
					getCo().xrate_rnd_typ()));

				// 納税通貨税額
				if (!isNull(dtlR.ptax_xrate())) {
					dtlR.ptax_cur_tax_amt(convCur(dtlR.trd_cur_tax_amt(), dtlR.ptax_xrate(),
							ptaxCurR.amt_dec_place(), getCo().xrate_rnd_typ()));
				}
			}
		}

		/**
		 * 支給実績を更新する
		 */
		protected void updProvAct(MCList<MST_PROV_ACT_R> disL, MCList<MST_PROV_ACT_R> canL, MCList<ProvActUpd01_DtlR> crtL) {
			// 削除
			if (!disL.isEmpty()) {
				MST_PROV_ACT_R t1 = MST_PROV_ACT_R.create("T");
				MCQueryApiBuilder dbcL_bldr1 = MCQueryApiBuilder.create(t1);
				editUpdSetStmt(disL, dbcL_bldr1, t1);
				dbUpdateKey("MSBEL5270_MST_PROV_ACT_U01", disL, dbcL_bldr1);
			}
			// 更新
			if (!canL.isEmpty()) {
				String[] keys = new String[] {
						MST_PROV_ACT_R.$ap_dpt_cd};
				MAUCL_DptUtil.setCanDpt(canL, keys, null);
				MCQueryApiBuilder dbcL_bldr2 = MCQueryApiBuilder.create(MST_PROV_ACT_R.create("T"));
				dbInsertEx("MSBEL5270_MST_PROV_ACT_I01", canL, dbcL_bldr2);
			}
			// 新規
			if (!crtL.isEmpty()) {
				MCList<MST_PROV_ACT_R> insL = MCList.create(MST_PROV_ACT_R.class);

				for (ProvActUpd01_DtlR r : crtL) {
					insL.add(r.pa());
				}
				MCQueryApiBuilder dbcL_bldr3 = MCQueryApiBuilder.create(MST_PROV_ACT_R.create("T"));
				dbInsertEx("MSBEL5270_MST_PROV_ACT_I02", insL, dbcL_bldr3);
			}
		}

		protected String getCrtCol(String col) {
			return MAUCL_DptUtil.getCrtColumn(col);
		}

		/**
		 * 更新時のset句の編集
		 */
		protected void editUpdSetStmt( MCList<MST_PROV_ACT_R> disL, MCQueryApiBuilder dbcL_bldr, MST_PROV_ACT_R t) {
			dbcL_bldr.setSet(t.slip_sts_typ);
		}

		/**
		 * 出荷帳票発行サービスの実行
		 */
		protected void callShipRprtPrntSv(MCList<ProvActUpd01_DtlR> crtL) {
			if (!up1().upd_flg()) {
				return;
			}
			MSBEL_ShipRprtPrntService.ShipRprt_Upd01 o = MSBEL_ShipRprtPrntService.crtShipRprt_Upd01();
			callShipRprtPrntSvCrt(crtL.subList(r -> MAC_STR.isNULL_VAL(r.dlv_slip_no())), o);
			callShipRprtPrntSvUpd(crtL.subList(r -> !MAC_STR.isNULL_VAL(r.dlv_slip_no())), o);
			o.up2().bndl_prnt_flg(!up1().indiv_prnt_flg());
			o.exec();
			setDlvSlipNo(crtL, o);
		}

		/**
		 * 出荷帳票発行サービスの実行（新規）
		 */
		protected void callShipRprtPrntSvCrt(MCList<ProvActUpd01_DtlR> crtL, MSBEL_ShipRprtPrntService.ShipRprt_Upd01 o) {
			if (!up1().prnt_out_flg() || crtL.isEmpty()) {
				return;
			}

			MCList<ProvActUpd01_DtlR> prntNewL = crtL.subList(r -> isNotSlipTgt(r.prov_src_act_typ()));

			if (prntNewL.isEmpty()) {
				return;
			}

			_callShipRprtPrntSvCrtSub(prntNewL, o, up1().prnt_out_flg(), false);
		}

		/**
		 * 出荷帳票発行サービスの実行（更新）
		 */
		protected void callShipRprtPrntSvUpd(MCList<ProvActUpd01_DtlR> crtL, MSBEL_ShipRprtPrntService.ShipRprt_Upd01 o) {
			if (crtL.isEmpty()) {
				return;
			}

			MCList<ProvActUpd01_DtlR> dlvSlipNoL = crtL.groupBy(ProvActUpd01_DtlR.$dlv_slip_no);

			MCList<MST_DLV_SLIP_R> dbcH = MCList.create(MST_DLV_SLIP_R.class);
			MST_DLV_SLIP_R t0 = MST_DLV_SLIP_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t0);
			dbcL_bldr.setWhere(t0.dlv_slip_no.eq(bind("dlv_slip_no"))
					.and(t0.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))));
			dbSelect("MSBEL5270_MST_DLV_SLIP_S01", dbcH, dbcL_bldr, dlvSlipNoL);

			MST_DLV_SLIP_R t2 = MST_DLV_SLIP_R.create("T2");
			MCList<MST_DLV_SLIP_D_R> dbcD = MCList.create(MST_DLV_SLIP_D_R.class);
			MST_DLV_SLIP_D_R t1 = MST_DLV_SLIP_D_R.create("T");
			MCQueryApiBuilder dbcL_bldr1 = MCQueryApiBuilder.create(t1);
			dbcL_bldr1.addInnerJoin(t2, bracket(t1.dlv_slip_no.eq(t2.dlv_slip_no)
					.and(t1.dlv_slip_seq.eq(t2.dlv_slip_seq))
					.and(t2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))));
			dbcL_bldr1.setWhere(t1.dlv_slip_no.eq(bind("dlv_slip_no")));
			dbSelect("MSBEL5270_MST_DLV_SLIP_D_S01", dbcD, dbcL_bldr1, dlvSlipNoL);
			
			MCIndexKey idx = dbcD.createIndex(MST_DLV_SLIP_D_R.$dlv_slip_no);

			MCIndexKey idxH = crtL.createIndex(ProvActUpd01_DtlR.$dlv_slip_no);
			MCIndexKey idxD = crtL.createIndex(ProvActUpd01_DtlR.$dlv_slip_d_no);

			// callShipRprtPrntSvCrtを実行している場合はhdr_peg_noの初期値を取得する
			int i;
			if (o.up0().isEmpty()) {
				i = 0;
			}
			else {
				i = ((MCNumber) o.up0().max(ShipRprt_Upd01_HdrR.$hdr_peg_no)).intValue() + 1;
			}

			Map_ShipRprt_Upd01_HdrR_MST_DLV_SLIP_R<ShipRprt_Upd01_HdrR, MST_DLV_SLIP_R> map_h = createMap_ShipRprt_Upd01_HdrR_MST_DLV_SLIP_R();
			Map_ShipRprt_Upd01_DtlR_MST_DLV_SLIP_D_R<ShipRprt_Upd01_DtlR, MST_DLV_SLIP_D_R> map_d = createMap_ShipRprt_Upd01_DtlR_MST_DLV_SLIP_D_R();
			for (MST_DLV_SLIP_R rowH :dbcH) {
				ShipRprt_Upd01_HdrR up0R = o.up0().add();
				copy(up0R, rowH, map_h);
				up0R.hdr_peg_no(i);
				up0R.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				up0R.split_flg(true);
				up0R.dlv_slip_prnt_flg(up1().prnt_out_flg());

				ProvActUpd01_DtlR paH = crtL.getFirst(idxH, rowH.dlv_slip_no());
				up0R.can_ac_dt(paH.can_ac_dt());

				for (MST_DLV_SLIP_D_R rowD :dbcD.subList(idx, rowH.dlv_slip_no())) {
					ProvActUpd01_DtlR paD = crtL.getFirst(idxD, rowD.dlv_slip_d_no());
					if (isNull(paD) || paD.isEmpty()) {
						continue;
					}

					ShipRprt_Upd01_DtlR up1R = o.up1().add();
					copy(up1R, rowD, map_d);
					up1R.hdr_peg_no(i);
					up1R.dlv_slip_rev(rowH.dlv_slip_rev());

					up1R.dtl_uniq_no(paD.prov_act_no());
					up1R.trd_cur_upri(paD.trd_cur_upri());
					up1R.trd_cur_amt(paD.trd_cur_amt());
					up1R.base_cur_upri(paD.base_cur_upri());
					up1R.base_cur_amt(paD.base_cur_amt());
					up1R.base_cur_tax_amt(paD.base_cur_tax_amt());
					up1R.tax_cd(paD.tax_cd());
					up1R.trd_cur_tax_amt(paD.trd_cur_tax_amt());
					up1R.wtax_rate(paD.wtax_rate());
					up1R.wtax_amt(paD.wtax_amt());
					up1R.prov_typ(paD.prov_typ());
					up1R.prov_basis_typ(paD.prov_basis_typ());
					up1R.rsn_cd(paD.xfr_rsn_cd());
					up1R.base_ac_dt(paD.base_ac_dt());
					up1R.addBooleanColumn("iv_trd_flg", paD.getBooleanNE("iv_trd_flg"));
				}
				i++;
			}
		}

		protected void setDlvSlipNo(MCList<ProvActUpd01_DtlR> crtL, MSBEL_ShipRprtPrntService.ShipRprt_Upd01 o) {
			MCList<MST_PROV_ACT_R> updL = MCList.create(MST_PROV_ACT_R.class);

			MCIndexKey idx = o.down0().createIndex(ShipRprt_Upd01_DtlR.$dtl_uniq_no);
			for (ProvActUpd01_DtlR r :crtL) {
				ShipRprt_Upd01_DtlR downR = o.down0().getFirst(idx, r.prov_act_no());
				if (!isNull(downR)) {
					r.dlv_slip_no(downR.dlv_slip_no());
					r.dlv_slip_seq(downR.dlv_slip_seq());
					r.dlv_slip_d_no(downR.dlv_slip_d_no());

					if (isNotSlipTgt(r.prov_src_act_typ())) {
						MST_PROV_ACT_R updR = updL.add();
						updR.prov_act_no(r.prov_act_no());
						updR.prov_act_seq(r.prov_act_seq());
						updR.dlv_slip_no(downR.dlv_slip_no());
						updR.dlv_slip_d_no(downR.dlv_slip_d_no());
					}
				}
			}

			if (!updL.isEmpty()) {
				MST_PROV_ACT_R t = MST_PROV_ACT_R.create("T");
				MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
					dbcL_bldr.setSet(t.dlv_slip_no, t.dlv_slip_d_no);
					dbUpdateKey("MSBEL5270_MST_PROV_ACT_U02", updL, dbcL_bldr);
			}
			setDlvSlipNoSrcAct(crtL);
		}
		/**
		 * 支給元実績の納品書関連項目を更新する
		 * ※更新するのは支給元実績を登録・更新・削除するタイミングで支給実績が作成される分のみ
		 */
		protected void setDlvSlipNoSrcAct(MCList<ProvActUpd01_DtlR> crtL) {
			MCList<ProvActUpd01_DtlR> xfrL = MCList.create(ProvActUpd01_DtlR.class);
			MCList<ProvActUpd01_DtlR> arrL = MCList.create(ProvActUpd01_DtlR.class);
			MCList<ProvActUpd01_DtlR> shipL = MCList.create(ProvActUpd01_DtlR.class);
			
			crtL.forEach(r -> {
				if (MSC_PROV_SRC_ACT_TYP.isXFR(r.prov_src_act_typ())) {
					xfrL.add(r);
				}
				else if (MSC_PROV_SRC_ACT_TYP.isSHIP(r.prov_src_act_typ())) {
					arrL.add(r);
				}
				else if (MSC_PROV_SRC_ACT_TYP.isRET_SHIP(r.prov_src_act_typ())) {
					shipL.add(r);
				}
			});
			
			setDlvSlipNoXfr(xfrL);
			setDlvSlipNoArr(arrL);
			setDlvSlipNoShip(shipL);
		}
		
		/**
		 * 移動実績明細の納品書関連項目を更新する
		 */
		protected void setDlvSlipNoXfr(MCList<ProvActUpd01_DtlR> xfrL) {
			if (xfrL.isEmpty()) {
				return;
			}
			
			MCList<MST_XFR_ACT_D_R> updL = MCList.create(MST_XFR_ACT_D_R.class);
			xfrL.forEach(r -> {
				MST_XFR_ACT_D_R updR = updL.add();
				updR.xfr_act_d_no(r.prov_src_act_no());
				updR.dlv_slip_no(r.dlv_slip_no());
				updR.dlv_slip_seq(r.dlv_slip_seq());
				updR.dlv_slip_d_no(r.dlv_slip_d_no());
			});
			
			MST_XFR_ACT_D_R t = MST_XFR_ACT_D_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSet(t.dlv_slip_no, t.dlv_slip_seq, t.dlv_slip_d_no);
			dbUpdateKey("MSBEL5270_MST_XFR_ACT_D_U01", updL, bldr);
		}
		
		/**
		 * 入荷実績明細に対応する出荷実績明細の納品書関連項目を更新する
		 *	※更新するのは着荷不要分（納品伝票ヘッダの同時計上フラグがオン）のみ
		 */
		protected void setDlvSlipNoArr(MCList<ProvActUpd01_DtlR> arrL) {
			if (arrL.isEmpty()) {
				return;
			}
			
			// 入荷実績明細に対応する出荷実績明細を取得する
			// 取得するのは着荷不要分のみ
			MST_ARR_ACT_R t1 =MST_ARR_ACT_R.create("T1");
			MST_ARR_SCHD_R t2 =MST_ARR_SCHD_R.create("T2");
			MST_ARR_PR_R t3 =MST_ARR_PR_R.create("T3");
			MST_SHIP_ACT_D_R t4 =MST_SHIP_ACT_D_R.create("T4");
			MST_DLV_SLIP_R t5 = MST_DLV_SLIP_R.create("T5");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t1);
			bldr.setSelect(t1.arr_act_no, t4.ship_act_d_no);
			bldr.addInnerJoin(t2, t2.arr_schd_no.eq(t1.arr_schd_no));
			bldr.addInnerJoin(t3, t3.arr_pr_no.eq(t2.arr_pr_no));
			bldr.addInnerJoin(t4,
				t4.dlv_slip_no.eq(t2.dlv_slip_no)
				.and(t4.dlv_slip_d_no.eq(t3.dlv_slip_d_no))
				.and(t4.can_flg.eq(value(false)))
			);
			bldr.addInnerJoin(t5,
				t5.dlv_slip_no.eq(t4.dlv_slip_no)
				.and(t5.dlv_slip_seq.eq(t4.dlv_slip_seq))
				.and(t5.sync_flg.eq(value(true)))
			);
			bldr.setWhere(t1.arr_act_no.eq(bind("prov_src_act_no")));
						
			MCList<MST_ARR_ACT_R> rsltL = MCList.create(MST_ARR_ACT_R.class);
			dbSelectKey("MSBEL5270_MST_ARR_ACT_S02", rsltL, bldr, arrL);
			
			if (!rsltL.isEmpty()) {
				// 入荷実績に対応する、更新後の納品書関連項目を出荷実績明細に反映する
				MCIndexKey idx = arrL.createIndex(ProvActUpd01_DtlR.$prov_src_act_no);
				MCList<ProvActUpd01_DtlR> shipL = MCList.create(ProvActUpd01_DtlR.class);
				rsltL.forEach(r -> {
					ProvActUpd01_DtlR arrR = arrL.getFirst(idx, r.arr_act_no());
					if (!isNull(arrR)) {
						ProvActUpd01_DtlR shipR = shipL.add();
						shipR.prov_src_act_no(r.getStringNE("ship_act_d_no"));
						shipR.dlv_slip_no(arrR.dlv_slip_no());
						shipR.dlv_slip_seq(arrR.dlv_slip_seq());
						shipR.dlv_slip_d_no(arrR.dlv_slip_d_no());
					}
				});
				
				setDlvSlipNoShip(shipL);
			}
		}
		
		/**
		 * 出荷実績明細の納品書関連項目を更新する
		 */
		protected void setDlvSlipNoShip(MCList<ProvActUpd01_DtlR> shipL) {
			if (shipL.isEmpty()) {
				return;
			}
			
			MCList<MST_SHIP_ACT_D_R> updL = MCList.create(MST_SHIP_ACT_D_R.class);
			shipL.forEach(r -> {
				MST_SHIP_ACT_D_R updR = updL.add();
				updR.ship_act_d_no(r.prov_src_act_no());
				updR.dlv_slip_no(r.dlv_slip_no());
				updR.dlv_slip_seq(r.dlv_slip_seq());
				updR.dlv_slip_d_no(r.dlv_slip_d_no());
			});
			
			MST_SHIP_ACT_D_R t = MST_SHIP_ACT_D_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSet(t.dlv_slip_no, t.dlv_slip_seq, t.dlv_slip_d_no);
			dbUpdateKey("MSBEL5270_MST_SHIP_ACT_D_U01", updL, bldr);
			
			// 改訂履歴データを更新
			callRevDataIns01ShipAct(updL);
		}
		protected void callRevDataIns01ShipAct(MCList<MST_SHIP_ACT_D_R> updL) {
			MCList<MST_SHIP_ACT_R> bindL = createBindRevDataIns01(updL);
			MAUCL_RevDataService.RevData_Ins01 ope = MAUCL_RevDataService.crtRevData_Ins01();
			for (MST_SHIP_ACT_R bindR : bindL) {
				RevData_Ins01_DtlR opeR = RevData_Ins01_DtlR.create();
				opeR.rev_data_src_no(bindR.ship_act_no());
				opeR.rev_no(bindR.ship_act_rev());
				opeR.rev_data_typ(MAC_REV_DATA_TYP.MST_SHIP_ACT.value());
				ope.up0().add(opeR);
			}
			ope.exec();
		}
		protected MCList<MST_SHIP_ACT_R> createBindRevDataIns01(MCList<MST_SHIP_ACT_D_R> updL){
			MST_SHIP_ACT_D_R t1 = MST_SHIP_ACT_D_R.create("T1");
			MST_SHIP_ACT_R t2 = MST_SHIP_ACT_R.create("T2");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t1);
			bldr.setDistinct();
			bldr.setSelect(
					t2.ship_act_no,
					t2.ship_act_rev
			);
			bldr.addInnerJoin(t2, t2.ship_act_no.eq(t1.ship_act_no));
			bldr.setWhere(t1.ship_act_d_no.eq(bind("ship_act_d_no")));
			
			MCList<MST_SHIP_ACT_R> bindL = MCList.create(MST_SHIP_ACT_R.class);
			dbSelect("MSBEL5270_MST_SHIP_ACT_D_S01", bindL, bldr, updL);
			
			return bindL;
		}

		/**
		 * 受払実績の作成
		 */
		protected void crtIoAct(MCList<ProvActUpd01_DtlR> ioActL) {
			MSBEL_IoActService.IoAct_Ins01 o = MSBEL_IoActService.crtIoAct_Ins01();
			setAll(o.up0(), ioActL, createMap_IoAct_Ins01_DtlR_ProvActUpd01_DtlR());
			o.exec();
		}
		/**
		 * 取引マスタキャッシュ
		 */
		protected FXUCL_MCDbcCache<MAM_TRD_R> _trdCache;
		
		/**
		 * GALinkに送信する
		 */
		protected void callGALink(MCList<MST_PROV_ACT_R> canL, MCList<ProvActUpd01_DtlR> crtL) {
			if (!isCallGALink()) {
				return;
			}
			
			MCList<MST_PROV_ACT_R> tgtL = MCList.create(MST_PROV_ACT_R.class);
			tgtL.setAll(canL);
			tgtL.addAll(crtL.innerRowList(ProvActUpd01_DtlR.$pa, MST_PROV_ACT_R.class));
			
			if (_trdCache == null) {
				_trdCache = new FXUCL_MCDbcCache<MAM_TRD_R>(
					MCQueryApiBuilder.create(MAM_TRD_R.create("T")), tgtL, MST_PROV_ACT_R.$trd_cd
				);
			}
			MSBBL_SlsSlipSendIfService.SlsSlipSendIf_Upd01 o = MSBBL_SlsSlipSendIfService.crtSlsSlipSendIf_Upd01();
			for (MCList<MST_PROV_ACT_R> actL : tgtL.groupList(MST_PROV_ACT_R.$prov_act_no)) {
				actL.sort(SortType.DESC, MST_PROV_ACT_R.$prov_act_seq);
				MST_PROV_ACT_R actR = actL.get(0);
				
				MAM_TRD_R trdR = _trdCache.get(actR.trd_cd());
				if (MAC_PROV_TYP.isONR_PROV(actR.prov_typ()) && !trdR.not_sls_slip_snd_flg()) {
					SlsSlipSendIf_Upd01_DtlR r = o.up0().add();
					r.prov_act_no(actR.prov_act_no());
					r.prov_act_seq(actR.prov_act_seq());
					if (MAC_SLIP_STS_TYP.isCAN(actR.slip_sts_typ())) {
						r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					}
					else {
						r.data_crud_typ(
							actL.size() > 1 ?		// 新規、取消の順でリストに存在⇒更新
							MAC_DATA_CRUD_TYP.UPD.value() : MAC_DATA_CRUD_TYP.CRT.value()
						);
					}
					r.setAttributes(actR);
				}
			}
			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}
		protected boolean isCallGALink() {
			String parm = getSysParmNE("GA_SLS_SLIP_EXT_SYS_CD");
			if (!isNull(parm)) {
				MAM_EXT_SYS_R m1 = MAM_EXT_SYS_R.create("M1");
				MCQueryApiBuilder bldr = MCQueryApiBuilder.create(m1);
				bldr.setSelect(m1.ext_sys_cd);
				bldr.setWhere(m1.ext_sys_cd.eq(bind("1")), parm);
				bldr.addWhereWithAnd(m1.ext_sys_typ.eq(value(MAC_EXT_SYS_TYP.AC.value())));
				bldr.addWhereWithAnd(m1.web_api_flg.eq(value(true)));
				
				MCRow rslt = MCRow.create();
				dbSelect("MSBEL5270_MAM_EXT_SYS_S01", rslt, bldr);
				return !isNull(rslt.getStringNE(MAM_EXT_SYS_R.$ext_sys_cd));
			}
			return false;
		}

		/**
		 * 下り電文の設定
		 */
		protected void setDown(MCList<ProvActUpd01_DtlR> crtL) {
			for (ProvActUpd01_DtlR r :crtL) {
				setStkCol(r);
			}
			down0().addAll(crtL);
		}

		protected void setStkCol(ProvActUpd01_DtlR r) {
			// 支給
			if (MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())) {
				r.stk_arrv_bp_cd(r.prsppl_cd());

				// 有償支給
				if (MAC_PROV_TYP.isONR_PROV(r.prov_typ())) {
					r.stk_id_typ(MSC_STK_ID_TYP.ONR_PROV.value());
					r.stk_bp_cd(r.prsppl_cd());
				}
			}
			// 支給返品
			else {
				r.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());

				// 有償支給
				if (MAC_PROV_TYP.isONR_PROV(r.prov_typ())) {
					r.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
					r.stk_bp_cd(MAC_STR.NULL_VAL.value());
				}
			}
		}

		//- 品目単位マスタ検索 ---------------------------------------------
		protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _itmUnitCache = null;;
		protected void selectItmUnitL(MCList<ProvActUpd01_DtlR> up) {

			MAVM_ITM_UNIT_R t = MAVM_ITM_UNIT_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSelect(t.pack_flg);
			_itmUnitCache = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(dbcL_bldr, up,
					ProvActUpd01_DtlR.$itm_cd,
					ProvActUpd01_DtlR.$itm_sub1,
					ProvActUpd01_DtlR.$itm_sub2,
					ProvActUpd01_DtlR.$itm_sub3,
					ProvActUpd01_DtlR.$trd_unit_cd);
		}

		protected Map_ShipRprt_Upd01_HdrR_MST_DLV_SLIP_R<ShipRprt_Upd01_HdrR,MST_DLV_SLIP_R> createMap_ShipRprt_Upd01_HdrR_MST_DLV_SLIP_R() {
			return new Map_ShipRprt_Upd01_HdrR_MST_DLV_SLIP_R<ShipRprt_Upd01_HdrR, MST_DLV_SLIP_R>();
		}

		public class Map_ShipRprt_Upd01_HdrR_MST_DLV_SLIP_R<D extends ShipRprt_Upd01_HdrR, S extends MST_DLV_SLIP_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
//				addColumnPathMap(ShipRprt_Upd01_HdrR.$hdr_peg_no, );	⇒ 外で設定する
//				addColumnPathMap(ShipRprt_Upd01_HdrR.$hdr_peg_seq, );	⇒ 不要
//				addColumnPathMap(ShipRprt_Upd01_HdrR.$data_crud_typ, );	⇒ 外で設定する
//				addColumnPathMap(ShipRprt_Upd01_HdrR.$can_ac_dt, );		⇒ 外で設定する
//				addColumnPathMap(ShipRprt_Upd01_HdrR.$r_inst_no, );		⇒ 不要
//				addColumnPathMap(ShipRprt_Upd01_HdrR.$split_flg, );		⇒ 外で設定する
//				addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_slip_prnt_flg, );	⇒ 外で設定する
//				addColumnPathMap(ShipRprt_Upd01_HdrR.$ship_adv_prnt_flg, );	⇒ 不要
//				addColumnPathMap(ShipRprt_Upd01_HdrR.$slip_form_cd, );	⇒ 不要
				addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_slip_no, MST_DLV_SLIP_R.$dlv_slip_no);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$slo_no, MST_DLV_SLIP_R.$slo_no);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$trn_typ, MST_DLV_SLIP_R.$trn_typ);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_slip_inst_no, MST_DLV_SLIP_R.$dlv_slip_inst_no);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_slip_act_no, MST_DLV_SLIP_R.$dlv_slip_act_no);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$dpt_cd, MST_DLV_SLIP_R.$dpt_cd);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$usr_cd, MST_DLV_SLIP_R.$usr_cd);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$ship_tm, MST_DLV_SLIP_R.$ship_tm);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_tm, MST_DLV_SLIP_R.$dlv_tm);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$ac_dt, MST_DLV_SLIP_R.$ac_dt);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$trd_cd, MST_DLV_SLIP_R.$trd_cd);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$trd_ptn_typ, MST_DLV_SLIP_R.$trd_ptn_typ);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$cst_po_no, MST_DLV_SLIP_R.$cst_po_no);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$pri_prnt_flg, MST_DLV_SLIP_R.$pri_prnt_flg);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$trd_cur_cd, MST_DLV_SLIP_R.$trd_cur_cd);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$xrate, MST_DLV_SLIP_R.$xrate);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$ptax_xrate, MST_DLV_SLIP_R.$ptax_xrate);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$bp_cd, MST_DLV_SLIP_R.$bp_cd);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_id_typ, MST_DLV_SLIP_R.$dlv_id_typ);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_id_cd, MST_DLV_SLIP_R.$dlv_id_cd);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_id_nm, MST_DLV_SLIP_R.$dlv_id_nm);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_sundry_flg, MST_DLV_SLIP_R.$dlv_sundry_flg);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_zip_cd, MST_DLV_SLIP_R.$dlv_zip_cd);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_addr1, MST_DLV_SLIP_R.$dlv_addr1);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_addr2, MST_DLV_SLIP_R.$dlv_addr2);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_addr3, MST_DLV_SLIP_R.$dlv_addr3);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_addr4, MST_DLV_SLIP_R.$dlv_addr4);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_cntct_dpt, MST_DLV_SLIP_R.$dlv_cntct_dpt);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_cntct_psn, MST_DLV_SLIP_R.$dlv_cntct_psn);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_tel, MST_DLV_SLIP_R.$dlv_tel);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_fax, MST_DLV_SLIP_R.$dlv_fax);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$xfr_loc_cd, MST_DLV_SLIP_R.$xfr_loc_cd);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$ship_fr_lg_grp_cd, MST_DLV_SLIP_R.$ship_fr_lg_grp_cd);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$wg_cd, MST_DLV_SLIP_R.$wg_cd);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$trd_rmrks, MST_DLV_SLIP_R.$trd_rmrks);
//				addColumnPathMap(ShipRprt_Upd01_HdrR.$ship_adv_prnt_flg, MST_DLV_SLIP_R.$ship_adv_prnt_flg);	⇒ 不要
				addColumnPathMap(ShipRprt_Upd01_HdrR.$sync_flg, MST_DLV_SLIP_R.$sync_flg);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$adjst_slip_flg, MST_DLV_SLIP_R.$adjst_slip_flg);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$sub_char1, MST_DLV_SLIP_R.$sub_char1);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$sub_char2, MST_DLV_SLIP_R.$sub_char2);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$sub_char3, MST_DLV_SLIP_R.$sub_char3);
			}
		}

		protected Map_ShipRprt_Upd01_DtlR_MST_DLV_SLIP_D_R<ShipRprt_Upd01_DtlR,MST_DLV_SLIP_D_R> createMap_ShipRprt_Upd01_DtlR_MST_DLV_SLIP_D_R() {
			return new Map_ShipRprt_Upd01_DtlR_MST_DLV_SLIP_D_R<ShipRprt_Upd01_DtlR, MST_DLV_SLIP_D_R>();
		}

		public class Map_ShipRprt_Upd01_DtlR_MST_DLV_SLIP_D_R<D extends ShipRprt_Upd01_DtlR, S extends MST_DLV_SLIP_D_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
//				addColumnPathMap(ShipRprt_Upd01_DtlR.$hdr_peg_no, );	⇒ 外で設定する
//				addColumnPathMap(ShipRprt_Upd01_DtlR.$hdr_peg_seq, );	⇒ 不要
//				addColumnPathMap(ShipRprt_Upd01_DtlR.$dtl_uniq_no, );	⇒ 外で設定する
//				addColumnPathMap(ShipRprt_Upd01_DtlR.$dtl_uniq_seq, );	⇒ 不要
//				addColumnPathMap(ShipRprt_Upd01_DtlR.$dlv_inst_rcpt_no, );	⇒ 不要
//				addColumnPathMap(ShipRprt_Upd01_DtlR.$prov_src_schd_typ, );	⇒ 不要
//				addColumnPathMap(ShipRprt_Upd01_DtlR.$trn_typ, );		⇒ 不要
//				addColumnPathMap(ShipRprt_Upd01_DtlR.$bp_cd, );			⇒ 不要
//				addColumnPathMap(ShipRprt_Upd01_DtlR.$base_dt, );		⇒ 不要
//				addColumnPathMap(ShipRprt_Upd01_DtlR.$trd_ptn_typ, );	⇒ 不要
//				addColumnPathMap(ShipRprt_Upd01_DtlR.$trd_cur_cd, );	⇒ 不要
//				addColumnPathMap(ShipRprt_Upd01_DtlR.$wg_cd, );			⇒ 不要
				addColumnPathMap(ShipRprt_Upd01_DtlR.$dlv_slip_d_no, MST_DLV_SLIP_D_R.$dlv_slip_d_no);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$dlv_slip_d_seq, MST_DLV_SLIP_D_R.$dlv_slip_d_seq);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$dlv_slip_no, MST_DLV_SLIP_D_R.$dlv_slip_no);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$dlv_slip_seq, MST_DLV_SLIP_D_R.$dlv_slip_seq);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$itm_cd, MST_DLV_SLIP_D_R.$itm_cd);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$itm_sub1, MST_DLV_SLIP_D_R.$itm_sub1);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$itm_sub2, MST_DLV_SLIP_D_R.$itm_sub2);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$itm_sub3, MST_DLV_SLIP_D_R.$itm_sub3);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$itm_nm, MST_DLV_SLIP_D_R.$itm_nm);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$sundry_itm_flg, MST_DLV_SLIP_D_R.$sundry_itm_flg);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$sno1, MST_DLV_SLIP_D_R.$sno1);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$sno2, MST_DLV_SLIP_D_R.$sno2);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$sno3, MST_DLV_SLIP_D_R.$sno3);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$sno4, MST_DLV_SLIP_D_R.$sno4);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$lot_no, MST_DLV_SLIP_D_R.$lot_no);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$sublot_no, MST_DLV_SLIP_D_R.$sublot_no);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$str_ln_cd, MST_DLV_SLIP_D_R.$str_ln_cd);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$stk_arrv_bp_cd, MST_DLV_SLIP_D_R.$stk_arrv_bp_cd);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$gd_cd, MST_DLV_SLIP_D_R.$gd_cd);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$quality_typ, MST_DLV_SLIP_D_R.$quality_typ);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$stk_insp_typ, MST_DLV_SLIP_D_R.$stk_insp_typ);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$stk_id_typ, MST_DLV_SLIP_D_R.$stk_id_typ);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$stk_bp_cd, MST_DLV_SLIP_D_R.$stk_bp_cd);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$fix_no_typ, MST_DLV_SLIP_D_R.$fix_no_typ);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$fix_no, MST_DLV_SLIP_D_R.$fix_no);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$trd_unit_qty, MST_DLV_SLIP_D_R.$trd_unit_qty);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$trd_unit_cd, MST_DLV_SLIP_D_R.$trd_unit_cd);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$base_unit_qty, MST_DLV_SLIP_D_R.$base_unit_qty);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$base_unit_cd, MST_DLV_SLIP_D_R.$base_unit_cd);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$trd_cur_upri, MST_DLV_SLIP_D_R.$trd_cur_upri);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$trd_cur_amt, MST_DLV_SLIP_D_R.$trd_cur_amt);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$trd_cur_dscnt_amt, MST_DLV_SLIP_D_R.$trd_cur_dscnt_amt);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$base_cur_upri, MST_DLV_SLIP_D_R.$base_cur_upri);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$base_cur_amt, MST_DLV_SLIP_D_R.$base_cur_amt);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$base_cur_tax_amt, MST_DLV_SLIP_D_R.$base_cur_tax_amt);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$base_cur_dscnt_amt, MST_DLV_SLIP_D_R.$base_cur_dscnt_amt);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$tax_cd, MST_DLV_SLIP_D_R.$tax_cd);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$trd_cur_tax_amt, MST_DLV_SLIP_D_R.$trd_cur_tax_amt);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$wtax_rate, MST_DLV_SLIP_D_R.$wtax_rate);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$wtax_amt, MST_DLV_SLIP_D_R.$wtax_amt);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$prov_typ, MST_DLV_SLIP_D_R.$prov_typ);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$prov_basis_typ, MST_DLV_SLIP_D_R.$prov_basis_typ);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$rsn_cd, MST_DLV_SLIP_D_R.$rsn_cd);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$bd_dpt_cd, MST_DLV_SLIP_D_R.$bd_dpt_cd);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$cst_po_d_no, MST_DLV_SLIP_D_R.$cst_po_d_no);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$cst_itm_cd, MST_DLV_SLIP_D_R.$cst_itm_cd);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$cst_itm_nm, MST_DLV_SLIP_D_R.$cst_itm_nm);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$slo_d_no, MST_DLV_SLIP_D_R.$slo_d_no);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$trd_d_rmrks, MST_DLV_SLIP_D_R.$trd_d_rmrks);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$io_typ, MST_DLV_SLIP_D_R.$io_typ);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$sub_char1, MST_DLV_SLIP_D_R.$sub_char1);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$sub_char2, MST_DLV_SLIP_D_R.$sub_char2);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$sub_char3, MST_DLV_SLIP_D_R.$sub_char3);
//				addColumnPathMap(ShipRprt_Upd01_DtlR.$dlv_slip_rev, );	⇒ 外で設定する
			}
		}

		protected Map_IoAct_Ins01_DtlR_ProvActUpd01_DtlR<IoAct_Ins01_DtlR,ProvActUpd01_DtlR> createMap_IoAct_Ins01_DtlR_ProvActUpd01_DtlR() {
			return new Map_IoAct_Ins01_DtlR_ProvActUpd01_DtlR<IoAct_Ins01_DtlR, ProvActUpd01_DtlR>();
		}

		public class Map_IoAct_Ins01_DtlR_ProvActUpd01_DtlR<D extends IoAct_Ins01_DtlR, S extends ProvActUpd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(IoAct_Ins01_DtlR.$data_crud_typ, ProvActUpd01_DtlR.$data_crud_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$ac_dt, ProvActUpd01_DtlR.$ac_dt);
				addColumnPathMap(IoAct_Ins01_DtlR.$can_ac_dt, ProvActUpd01_DtlR.$can_ac_dt);
				addColumnPathMap(IoAct_Ins01_DtlR.$act_tm, ProvActUpd01_DtlR.$accpt_dt);
				addColumnPathMap(IoAct_Ins01_DtlR.$act_no, ProvActUpd01_DtlR.$prov_act_no);
				addColumnPathMap(IoAct_Ins01_DtlR.$act_seq, ProvActUpd01_DtlR.$prov_act_seq);
				addColumnPathMap(IoAct_Ins01_DtlR.$act_rev_no, ProvActUpd01_DtlR.$prov_act_rev);
				addColumnPathMap(IoAct_Ins01_DtlR.$trd_cd, ProvActUpd01_DtlR.$trd_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$trd_ptn_typ, ProvActUpd01_DtlR.$trd_ptn_typ);
//				addColumnPathMap(IoAct_Ins01_DtlR.$trn_typ, );			valueCopyで設定する
//				addColumnPathMap(IoAct_Ins01_DtlR.$io_act_typ, );		valueCopyで設定する
				addColumnPathMap(IoAct_Ins01_DtlR.$rsn_cd, ProvActUpd01_DtlR.$xfr_rsn_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$gi_wg_cd, ProvActUpd01_DtlR.$wg_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$ap_dpt_cd, ProvActUpd01_DtlR.$ap_dpt_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$itm_cd, ProvActUpd01_DtlR.$itm_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$itm_sub1, ProvActUpd01_DtlR.$itm_sub1);
				addColumnPathMap(IoAct_Ins01_DtlR.$itm_sub2, ProvActUpd01_DtlR.$itm_sub2);
				addColumnPathMap(IoAct_Ins01_DtlR.$itm_sub3, ProvActUpd01_DtlR.$itm_sub3);
//				addColumnPathMap(IoAct_Ins01_DtlR.$itm_nm, );
				addColumnPathMap(IoAct_Ins01_DtlR.$stk_mng_typ, ProvActUpd01_DtlR.$stk_mng_typ);
//				addColumnPathMap(IoAct_Ins01_DtlR.$sundry_itm_flg, );	valueCopyで設定する
				addColumnPathMap(IoAct_Ins01_DtlR.$gi_loc_cd, ProvActUpd01_DtlR.$loc_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$gi_str_ln_cd, ProvActUpd01_DtlR.$str_ln_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$stk_arrv_bp_cd, ProvActUpd01_DtlR.$stk_arrv_bp_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$lot_no, ProvActUpd01_DtlR.$lot_no);
				addColumnPathMap(IoAct_Ins01_DtlR.$sublot_no, ProvActUpd01_DtlR.$sublot_no);
				addColumnPathMap(IoAct_Ins01_DtlR.$sno1, ProvActUpd01_DtlR.$sno1);
				addColumnPathMap(IoAct_Ins01_DtlR.$sno2, ProvActUpd01_DtlR.$sno2);
				addColumnPathMap(IoAct_Ins01_DtlR.$sno3, ProvActUpd01_DtlR.$sno3);
				addColumnPathMap(IoAct_Ins01_DtlR.$sno4, ProvActUpd01_DtlR.$sno4);
				addColumnPathMap(IoAct_Ins01_DtlR.$sno1_mng_typ, ProvActUpd01_DtlR.$sno1_mng_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$sno2_mng_typ, ProvActUpd01_DtlR.$sno2_mng_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$sno3_mng_typ, ProvActUpd01_DtlR.$sno3_mng_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$sno4_mng_typ, ProvActUpd01_DtlR.$sno4_mng_typ);
//				addColumnPathMap(IoAct_Ins01_DtlR.$fix_no_typ, );		valueCopyで設定する
//				addColumnPathMap(IoAct_Ins01_DtlR.$fix_no, );			valueCopyで設定する
				addColumnPathMap(IoAct_Ins01_DtlR.$gi_gd_cd, ProvActUpd01_DtlR.$gd_cd);
//				addColumnPathMap(IoAct_Ins01_DtlR.$in_xfr_typ, );		valueCopyで設定する
				addColumnPathMap(IoAct_Ins01_DtlR.$quality_typ, ProvActUpd01_DtlR.$quality_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$stk_insp_typ, ProvActUpd01_DtlR.$stk_insp_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$stk_id_typ, ProvActUpd01_DtlR.$stk_id_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$stk_bp_cd, ProvActUpd01_DtlR.$stk_bp_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$trd_unit_qty, ProvActUpd01_DtlR.$trd_unit_qty);
				addColumnPathMap(IoAct_Ins01_DtlR.$trd_unit_cd, ProvActUpd01_DtlR.$trd_unit_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$pack_unit_qty, ProvActUpd01_DtlR.$pack_unit_qty);
				addColumnPathMap(IoAct_Ins01_DtlR.$pack_unit_cd, ProvActUpd01_DtlR.$pack_unit_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$base_unit_qty, ProvActUpd01_DtlR.$base_unit_qty);
				addColumnPathMap(IoAct_Ins01_DtlR.$base_unit_cd, ProvActUpd01_DtlR.$base_unit_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$trd_cur_cd, ProvActUpd01_DtlR.$trd_cur_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$trd_cur_upri, ProvActUpd01_DtlR.$trd_cur_upri);
				addColumnPathMap(IoAct_Ins01_DtlR.$trd_cur_amt, ProvActUpd01_DtlR.$trd_cur_amt);
				addColumnPathMap(IoAct_Ins01_DtlR.$trd_cur_tax_amt, ProvActUpd01_DtlR.$trd_cur_tax_amt);
				addColumnPathMap(IoAct_Ins01_DtlR.$base_cur_cd, ProvActUpd01_DtlR.$base_cur_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$base_cur_upri, ProvActUpd01_DtlR.$base_cur_upri);
				addColumnPathMap(IoAct_Ins01_DtlR.$base_cur_amt, ProvActUpd01_DtlR.$base_cur_amt);
				addColumnPathMap(IoAct_Ins01_DtlR.$base_cur_tax_amt, ProvActUpd01_DtlR.$base_cur_tax_amt);
				addColumnPathMap(IoAct_Ins01_DtlR.$ptax_cur_cd, ProvActUpd01_DtlR.$ptax_cur_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$ptax_cur_upri, ProvActUpd01_DtlR.$ptax_cur_upri);
				addColumnPathMap(IoAct_Ins01_DtlR.$ptax_cur_amt, ProvActUpd01_DtlR.$ptax_cur_amt);
				addColumnPathMap(IoAct_Ins01_DtlR.$ptax_cur_tax_amt, ProvActUpd01_DtlR.$ptax_cur_tax_amt);
				addColumnPathMap(IoAct_Ins01_DtlR.$wtax_rate, ProvActUpd01_DtlR.$wtax_rate);
				addColumnPathMap(IoAct_Ins01_DtlR.$wtax_amt, ProvActUpd01_DtlR.$wtax_amt);
				addColumnPathMap(IoAct_Ins01_DtlR.$tax_cd, ProvActUpd01_DtlR.$tax_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$xrate_cd, ProvActUpd01_DtlR.$xrate_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$xrate, ProvActUpd01_DtlR.$xrate);
				addColumnPathMap(IoAct_Ins01_DtlR.$ptax_xrate_cd, ProvActUpd01_DtlR.$xrate_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$ptax_xrate, ProvActUpd01_DtlR.$ptax_xrate);
				addColumnPathMap(IoAct_Ins01_DtlR.$asppl_cd, ProvActUpd01_DtlR.$asppl_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$sppl_cd, ProvActUpd01_DtlR.$prsppl_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$prov_typ, ProvActUpd01_DtlR.$prov_typ);
//				addColumnPathMap(IoAct_Ins01_DtlR.$no_gi_alloc_flg, );	valueCopyで設定する
				addColumnPathMap(IoAct_Ins01_DtlR.$trd_d_rmrks, ProvActUpd01_DtlR.$trd_d_rmrks);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				// 支給
				dest.trn_typ(MSC_TRN_TYP.PROV.value());

				if (MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())) {
					return;
				}

				// 有償支給
				if (MAC_PROV_TYP.isONR_PROV(src.prov_typ())) {
					if (MAC_TRD_PTN_TYP.isPROV(src.trd_ptn_typ())) {
						dest.io_act_typ(MSC_IO_ACT_TYP.ONR_PROV_GI.value());
					}
					// 支給返品
					else {
						dest.io_act_typ(MSC_IO_ACT_TYP.ONR_PROV_RTN_GI.value());
					}
				}
				// 無償支給
				else {
					// 支給
					if (MAC_TRD_PTN_TYP.isPROV(src.trd_ptn_typ())) {
						dest.io_act_typ(MSC_IO_ACT_TYP.FFR_PROV_GI.value());
					}
					// 支給返品
					else {
						dest.io_act_typ(MSC_IO_ACT_TYP.FFR_PROV_RTN_GI.value());
					}
				}

				MAM_ITM_R itm = _itmCache.getEx(src.itm_cd(), src.itm_sub1(), src.itm_sub2(), src.itm_sub3());
				dest.sundry_itm_flg(itm.sundry_itm_flg());

				if (MSC_PROV_SRC_ACT_TYP.isSHIP_ARR(src.prov_src_act_typ())) {
					dest.in_xfr_typ(MSC_IN_XFR_TYP.IN_XFR.value());
				}
				else {
					dest.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
				}
				
				// 検査中の場合は確定ＮＯを設定する
				if (!MSC_STK_INSP_TYP.isFIN(src.stk_insp_typ())) {
					dest.fix_no_typ(MSC_FIX_NO_TYP.ARR_ACT_NO.value());
					if (MSC_PROV_SRC_ACT_TYP.isDDLV(src.prov_src_act_typ())) {
						dest.fix_no(src.arr_act_no());
					}
					else {
						dest.fix_no(src.prov_src_act_no());
					}
				}

				boolean allocFlg = src.getBooleanNE("alloc_flg");
				
				if (up1().upd_flg()) {
					// 支給明細訂正登録画面から呼ばれた場合は出庫引当確認対象外ＦＬＧはオン
					dest.no_gi_alloc_flg(true);
				}
				else if (MAC_TRD_PTN_TYP.isPROV_RTN(src.trd_ptn_typ()) && !allocFlg) {
					// 支給返品 かつ 場所引当でない場合は出庫引当確認対象外ＦＬＧはオフ
					dest.no_gi_alloc_flg(false);
				}
				else if (MAC_PROV_TYP.isONR_PROV(src.prov_typ()) 
						&& MAC_PROV_BASIS_TYP.isINPT(src.prov_basis_typ()) 
						&& !allocFlg) {
					// 有償支給 かつ 使用基準 かつ 場所引当でない場合は出庫引当確認対象外ＦＬＧはオフ
					dest.no_gi_alloc_flg(false);
				}
				else {
					// それ以外の場合は出庫引当確認対象外ＦＬＧはオン
					dest.no_gi_alloc_flg(true);
				}
			}
		}
	}

	protected boolean isNotSlipTgt(String provSrcActTyp) {
		if (MSC_PROV_SRC_ACT_TYP.isDDLV(provSrcActTyp)
				|| MSC_PROV_SRC_ACT_TYP.isNON_ARR_DDLV(provSrcActTyp)
				|| MSC_PROV_SRC_ACT_TYP.isNCV_RCV_DDLV(provSrcActTyp)
				|| MSC_PROV_SRC_ACT_TYP.isRET_DDLV(provSrcActTyp)
				|| MSC_PROV_SRC_ACT_TYP.isINPT(provSrcActTyp)) {
			return true;
		}
		return false;
	}

	protected boolean isNotInpt(String provTyp, String provBasisTyp, String provSrcActTyp) {
		if (MAC_PROV_TYP.isONR_PROV(provTyp) && MAC_PROV_BASIS_TYP.isINPT(provBasisTyp) && !MSC_PROV_SRC_ACT_TYP.isINPT(provSrcActTyp)) {
			return true;
		}
		return false;
	}

	/**
	 * キャッシュを管理するリクエストオブジェクト
	 */
	protected static final Class<MSBEL_ProvActService> CLAZZ = MSBEL_ProvActService.class ;

	public static int callShipRprtPrntSvCrtSub(MCList<ProvActUpd01_DtlR> prntNewL,
			MSBEL_ShipRprtPrntService.ShipRprt_Upd01 o, boolean prntOutFlg, boolean srchFlg) {
		return object(CLAZZ)._callShipRprtPrntSvCrtSub(prntNewL, o, prntOutFlg, srchFlg);
	}

	protected int _callShipRprtPrntSvCrtSub(MCList<ProvActUpd01_DtlR> prntNewL,
			MSBEL_ShipRprtPrntService.ShipRprt_Upd01 o, boolean prntOutFlg, boolean srchFlg) {
		if (srchFlg) {
			selectItmL(prntNewL);
		}
		selectLocCache(prntNewL);

		// 納品伝票実績ＮＯとする値を取得して仮に納品書ＮＯに設定しておく
		MCList<MST_PURC_ACT_IO_R> puL = MCList.create(MST_PURC_ACT_IO_R.class);
		MCList<MST_ARR_ACT_R> arrL = MCList.create(MST_ARR_ACT_R.class);
		MCList<MST_PURC_RET_ACT_IO_R> prL = MCList.create(MST_PURC_RET_ACT_IO_R.class);
		MCList<MST_INPT_ACT_R> inptL = MCList.create(MST_INPT_ACT_R.class);
		for (ProvActUpd01_DtlR r :prntNewL) {
			if (MSC_PROV_SRC_ACT_TYP.isDDLV(r.prov_src_act_typ())) {
				MST_PURC_ACT_IO_R addR = puL.add();
				addR.purc_act_io_no(r.prov_src_act_no());
			}
			else if (MSC_PROV_SRC_ACT_TYP.isNON_ARR_DDLV(r.prov_src_act_typ())
					|| MSC_PROV_SRC_ACT_TYP.isNCV_RCV_DDLV(r.prov_src_act_typ())) {
				MST_ARR_ACT_R addR = arrL.add();
				addR.arr_act_no(r.prov_src_act_no());
			}
			else if (MSC_PROV_SRC_ACT_TYP.isRET_DDLV(r.prov_src_act_typ())) {
				MST_PURC_RET_ACT_IO_R addR = prL.add();
				addR.purc_ret_act_io_no(r.prov_src_act_no());
			}
			else if (MSC_PROV_SRC_ACT_TYP.isINPT(r.prov_src_act_typ())) {
				MST_INPT_ACT_R addR = inptL.add();
				addR.inpt_act_no(r.prov_src_act_no());
			}
		}

		MCList<MST_PURC_ACT_IO_R> puL2 = getPurc(puL);
		MCIndexKey puIdx = puL2.createIndex(MST_PURC_ACT_IO_R.$purc_act_io_no);
		MCList<MST_ARR_ACT_R> arrL2 = getArr(arrL);
		MCIndexKey arrIdx = arrL2.createIndex(MST_ARR_ACT_R.$arr_act_no);
		MCList<MST_PURC_RET_ACT_IO_R> prL2 = getRetPurc(prL);
		MCIndexKey prIdx = prL2.createIndex(MST_PURC_RET_ACT_IO_R.$purc_ret_act_io_no);
		MCList<MST_INPT_ACT_R> inptL2 = getInpt(inptL);
		MCIndexKey inptIdx = inptL2.createIndex(MST_INPT_ACT_R.$inpt_act_no);

		for (ProvActUpd01_DtlR r :prntNewL) {
			if (!MAC_STR.isNULL_VAL(r.dlv_slip_no())) {
				continue;
			}
			if (MSC_PROV_SRC_ACT_TYP.isDDLV(r.prov_src_act_typ())) {
				MST_PURC_ACT_IO_R puR = puL2.getFirst(puIdx, r.prov_src_act_no());
				if (!isNull(puR)) {
					r.addStringColumn("dlv_slip_act_no", nvl(puR.getString("po_no"), puR.getString("purc_act_no")));
				}
			}
			else if (MSC_PROV_SRC_ACT_TYP.isNON_ARR_DDLV(r.prov_src_act_typ())
					|| MSC_PROV_SRC_ACT_TYP.isNCV_RCV_DDLV(r.prov_src_act_typ())) {
				MST_ARR_ACT_R arrR = arrL2.getFirst(arrIdx, r.prov_src_act_no());
				if (!isNull(arrR)) {
					r.addStringColumn("dlv_slip_act_no", nvl(arrR.getString("po_no"), arrR.getString("purc_act_no")));
				}
			}
			else if (MSC_PROV_SRC_ACT_TYP.isRET_DDLV(r.prov_src_act_typ())) {
				MST_PURC_RET_ACT_IO_R prR = prL2.getFirst(prIdx, r.prov_src_act_no());
				if (!isNull(prR)) {
					r.addStringColumn("dlv_slip_act_no", prR.getString("purc_ret_act_no"));
				}
			}
			else if (MSC_PROV_SRC_ACT_TYP.isINPT(r.prov_src_act_typ())) {
				MST_INPT_ACT_R inptR = inptL2.getFirst(inptIdx, r.prov_src_act_no());
				if (!isNull(inptR)) {
					r.addStringColumn("dlv_slip_act_no", inptR.mfg_act_no());
				}
			}
		}

		// 出荷帳票発行サービスの上り電文を作成する
		int i = 0;
		Map_ShipRprt_Upd01_HdrR_ProvActUpd01_DtlR<ShipRprt_Upd01_HdrR, ProvActUpd01_DtlR> map_h = createMap_ShipRprt_Upd01_HdrR_ProvActUpd01_DtlR();
		Map_ShipRprt_Upd01_DtlR_ProvActUpd01_DtlR<ShipRprt_Upd01_DtlR, ProvActUpd01_DtlR> map_d = createMap_ShipRprt_Upd01_DtlR_ProvActUpd01_DtlR();
		doSpplUsrCache(prntNewL);
		for (MCList<ProvActUpd01_DtlR> list :prntNewL.groupList(getSlipKeyForCrt())) {
			// ヘッダ
			ShipRprt_Upd01_HdrR up0R = o.up0().add();
			ProvActUpd01_DtlR rowH = list.get(0);
			copy(up0R, rowH, map_h);
			up0R.hdr_peg_no(i);
			if (isNull(rowH.getStringNE("dlv_slip_act_no"))) {
				up0R.dlv_slip_act_no(MAC_STR.NULL_VAL.value());
			}
			else {
				up0R.dlv_slip_act_no(rowH.getStringNE("dlv_slip_act_no"));
			}

			if (MSC_PROV_SRC_ACT_TYP.isDDLV(rowH.prov_src_act_typ())) {
				MST_PURC_ACT_IO_R puR = puL2.getFirst(puIdx, rowH.prov_src_act_no());
				if (!isNull(puR)) {
					up0R.dpt_cd(puR.getString("purc_dpt_cd"));
					up0R.usr_cd(puR.getString("purc_usr_cd"));
				}
			}
			else if (MSC_PROV_SRC_ACT_TYP.isNON_ARR_DDLV(rowH.prov_src_act_typ())
					|| MSC_PROV_SRC_ACT_TYP.isNCV_RCV_DDLV(rowH.prov_src_act_typ())) {
				MST_ARR_ACT_R arrR = arrL2.getFirst(arrIdx, rowH.prov_src_act_no());
				if (!isNull(arrR)) {
					up0R.dpt_cd(arrR.rqst_dpt_cd());
					up0R.usr_cd(arrR.rqst_usr_cd());
				}
			}
			else if (MSC_PROV_SRC_ACT_TYP.isRET_DDLV(rowH.prov_src_act_typ())) {
				MST_PURC_RET_ACT_IO_R prR = prL2.getFirst(prIdx, rowH.prov_src_act_no());
				if (!isNull(prR)) {
					up0R.dpt_cd(prR.getString("purc_dpt_cd"));
					up0R.usr_cd(prR.getString("purc_usr_cd"));
				}
			}
			else if (MSC_PROV_SRC_ACT_TYP.isINPT(rowH.prov_src_act_typ())) {
				MAM_SPPL_USR_R usrR = getSpplUsrR(up0R);
				up0R.dpt_cd(usrR.outsrc_dpt_cd());
				up0R.usr_cd(usrR.outsrc_usr_cd());
			}
			up0R.dlv_slip_prnt_flg(prntOutFlg);
			// 明細
			for (ProvActUpd01_DtlR row :list) {
				ShipRprt_Upd01_DtlR up1R = o.up1().add();
				copy(up1R, row, map_d);
				up1R.hdr_peg_no(i);
				up1R.dlv_slip_no(up0R.dlv_slip_no());

				up1R.dtl_uniq_no(row.prov_act_no());
				up1R.trd_cur_upri(row.trd_cur_upri());
				up1R.trd_cur_amt(row.trd_cur_amt());
				up1R.base_cur_upri(row.base_cur_upri());
				up1R.base_cur_amt(row.base_cur_amt());
				up1R.base_cur_tax_amt(row.base_cur_tax_amt());
				up1R.tax_cd(row.tax_cd());
				up1R.trd_cur_tax_amt(row.trd_cur_tax_amt());
				up1R.wtax_rate(row.wtax_rate());
				up1R.wtax_amt(row.wtax_amt());
				up1R.prov_typ(row.prov_typ());
				up1R.prov_basis_typ(row.prov_basis_typ());
				up1R.rsn_cd(row.xfr_rsn_cd());
			}
			i++;

		}
		return i;
	}

	protected MCList<MST_PURC_ACT_IO_R> getPurc(MCList<MST_PURC_ACT_IO_R> puL) {
		puL = puL.groupBy(MST_PURC_ACT_IO_R.$purc_act_io_no);
		MST_PURC_ACT_IO_R t = MST_PURC_ACT_IO_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		dbWkDelete("MSBEL5270_MSW_PURC_ACT_IO_D01", dbcL_bldr.getBaseDbc());
		dbWkInsert("MSBEL5270_MSW_PURC_ACT_IO_I01", puL, dbcL_bldr.getBaseDbc());

		MCList<MST_PURC_ACT_IO_R> dbc = MCList.create(MST_PURC_ACT_IO_R.class);
		MST_PURC_ACT_D_R t2 = MST_PURC_ACT_D_R.create("T2");
		MST_PURC_ACT_R t3 = MST_PURC_ACT_R.create("T3");
		MSW_PURC_ACT_IO_KEY_R S1W = MSW_PURC_ACT_IO_KEY_R.create("W");

		dbcL_bldr.setSelect(t.purc_act_io_no,t3.purc_act_no,t3.po_no);
		dbcL_bldr.addSelect(t3.purc_dpt_cd,t3.purc_usr_cd);
		dbcL_bldr.addInnerJoin(t2, bracket(t2.purc_act_d_no.eq(t.purc_act_d_no)
				.and(t2.purc_act_d_seq.eq(t.purc_act_d_seq))));
		dbcL_bldr.addInnerJoin(t3,
				bracket(t3.purc_act_no.eq(t2.purc_act_no)
						.and(t3.purc_act_seq.eq(t2.purc_act_seq))
						.and(t3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))));
		dbcL_bldr.addWhereWithAnd(exists(subQuery().select(value("X")).from(S1W)
				.where(S1W.purc_act_io_no.eq(t.purc_act_io_no))));
		dbSelect("MSBEL5270_MST_PURC_ACT_IO_S01", dbc, dbcL_bldr);
		return dbc;
	}

	protected MCList<MST_ARR_ACT_R> getArr(MCList<MST_ARR_ACT_R> arrL) {

		arrL = arrL.groupBy(MST_ARR_ACT_R.$arr_act_no);
		MST_ARR_ACT_R t = MST_ARR_ACT_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		dbWkDelete("MSBEL5270_MSW_ARR_ACT_D02", dbcL_bldr.getBaseDbc());
		dbWkInsert("MSBEL5270_MSW_ARR_ACT_I02", arrL, dbcL_bldr.getBaseDbc());

		MST_ARR_SCHD_R t2 = MST_ARR_SCHD_R.create("T2");
		MST_ARR_PR_R t3 = MST_ARR_PR_R.create("T3");
		MST_PO_D_R t4 = MST_PO_D_R.create("T4");
		MST_PURC_ACT_IO_R t5 = MST_PURC_ACT_IO_R.create("T5");
		MST_PURC_ACT_D_R t6 = MST_PURC_ACT_D_R.create("T6");
		MST_PURC_ACT_R t7 = MST_PURC_ACT_R.create("T7");
		MSW_ARR_ACT_KEY_R S1W = MSW_ARR_ACT_KEY_R.create("W");

		MCList<MST_ARR_ACT_R> dbc = MCList.create(MST_ARR_ACT_R.class);

		dbcL_bldr.setSelect(t.arr_act_no,t4.po_no,t7.purc_act_no);
		dbcL_bldr.addSelect(t.rqst_dpt_cd,t.rqst_usr_cd);
		dbcL_bldr.addLeftOuterJoin(t2, bracket( t2.arr_schd_no.eq(t.arr_schd_no)));
		dbcL_bldr.addLeftOuterJoin(t3, bracket( t3.arr_pr_no.eq(t2.arr_pr_no)));
		dbcL_bldr.addLeftOuterJoin(t4, bracket( t4.po_d_no.eq(t3.po_d_no)));
		dbcL_bldr.addLeftOuterJoin(t5, bracket( t5.purc_act_io_no.eq(t.purc_act_io_no)));
		dbcL_bldr.addLeftOuterJoin(t6, bracket(t6.purc_act_d_no.eq(t5.purc_act_d_no)
				.and(t6.purc_act_d_seq.eq(t5.purc_act_d_seq))));
		dbcL_bldr.addLeftOuterJoin(t7,
				bracket(t7.purc_act_no.eq(t6.purc_act_no)
						.and(t7.purc_act_seq.eq(t6.purc_act_seq))
						.and(t7.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))));
		dbcL_bldr.addWhereWithAnd(exists(subQuery().select(value("X")).from(S1W)
				.where(S1W.arr_act_no.eq(t.arr_act_no))));
		dbSelect("MSBEL5270_MST_ARR_ACT_S01", dbc, dbcL_bldr);
		return dbc;
	}

	protected MCList<MST_PURC_RET_ACT_IO_R> getRetPurc(MCList<MST_PURC_RET_ACT_IO_R> prL) {
		prL = prL.groupBy(MST_PURC_RET_ACT_IO_R.$purc_ret_act_io_no);
		MST_PURC_RET_ACT_IO_R t = MST_PURC_RET_ACT_IO_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		dbWkDelete("MSBEL5270_MSW_PURC_RET_ACT_IO_D01", dbcL_bldr.getBaseDbc());
		dbWkInsert("MSBEL5270_MSW_PURC_RET_ACT_IO_I01", prL, dbcL_bldr.getBaseDbc());

		MST_PURC_RET_ACT_D_R t2 = MST_PURC_RET_ACT_D_R.create("T2");
		MST_PURC_RET_ACT_R t3 = MST_PURC_RET_ACT_R.create("T3");
		MSW_PURC_RET_ACT_IO_KEY_R S1W = MSW_PURC_RET_ACT_IO_KEY_R.create("W");

		MCList<MST_PURC_RET_ACT_IO_R> dbc = MCList.create(MST_PURC_RET_ACT_IO_R.class);
		dbcL_bldr.setSelect(t.purc_ret_act_io_no,t2.purc_ret_act_no);
		dbcL_bldr.addSelect(t3.purc_dpt_cd,t3.purc_usr_cd);
		dbcL_bldr.addInnerJoin(t2, bracket( t2.purc_ret_act_d_no.eq(t.purc_ret_act_d_no)));
		dbcL_bldr.addInnerJoin(t3, bracket( t3.purc_ret_act_no.eq(t2.purc_ret_act_no)));
		dbcL_bldr.addWhereWithAnd(exists( subQuery() .select(value("X")) .from(S1W) .where( S1W.purc_ret_act_io_no.eq(t.purc_ret_act_io_no) )));
		dbSelect("MSBEL5270_MST_PURC_RET_ACT_IO_S01", dbc, dbcL_bldr);
		return dbc;
	}

	protected MCList<MST_INPT_ACT_R> getInpt(MCList<MST_INPT_ACT_R> inptL) {
		MST_INPT_ACT_R t = MST_INPT_ACT_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		inptL = inptL.groupBy(MST_INPT_ACT_R.$inpt_act_no);
		dbWkDelete("MSBEL5270_MSW_INPT_ACT_D01", dbcL_bldr.getBaseDbc());
		dbWkInsert("MSBEL5270_MSW_INPT_ACT_I01", inptL, dbcL_bldr.getBaseDbc());

		MSW_INPT_ACT_KEY_R S1W = MSW_INPT_ACT_KEY_R.create("W");
		MCList<MST_INPT_ACT_R> dbc = MCList.create(MST_INPT_ACT_R.class);
		dbcL_bldr.setSelect(t.inpt_act_no,t.mfg_act_no);
		dbcL_bldr.addWhereWithAnd(exists( subQuery() .select(value("X")) .from(S1W) .where( S1W.inpt_act_no.eq(t.inpt_act_no) )));
		dbSelect("MSBEL5270_MST_INPT_ACT_S01", dbc, dbcL_bldr);
		return dbc;
	}

	/**
	 * 伝票の単位<br>
	 * 以下の項目が一致する場合に同一伝票とみなす<br>
	 * <br>
	 * 計上日<br>
	 * 支給元実績区分<br>
	 * 納品書ＮＯ<br>
	 * 取引パタン区分<br>
	 * 支給先ＣＤ<br>
	 * 支給区分<br>
	 * 支給計上区分<br>
	 * 税率<br>
	 * 為替レートＣＤ<br>
	 * 為替レート<br>
	 * 納税為替レート<br>
	 * 源泉税率<br>
	 * 取引通貨ＣＤ<br>
	 * 基準通貨ＣＤ<br>
	 * 納税通貨ＣＤ<br>
	 */
	public static String[] getSlipKey() {
		return object(CLAZZ)._getSlipKey();
	}
	protected String[] _slipKey = null;
	protected String[] _getSlipKey() {
		if (_slipKey == null) {
			_slipKey = new String[]{
					MST_PROV_ACT_R.$ac_dt, MST_PROV_ACT_R.$prov_src_act_typ, MST_PROV_ACT_R.$dlv_slip_no, MST_PROV_ACT_R.$trd_ptn_typ,
					MST_PROV_ACT_R.$prsppl_cd, MST_PROV_ACT_R.$prov_typ, MST_PROV_ACT_R.$prov_basis_typ,
					MAM_TAX_R.$tax_rate, MST_PROV_ACT_R.$xrate_cd, MST_PROV_ACT_R.$xrate, MST_PROV_ACT_R.$ptax_xrate, MST_PROV_ACT_R.$wtax_rate,
					MST_PROV_ACT_R.$trd_cur_cd, MST_PROV_ACT_R.$base_cur_cd, MST_PROV_ACT_R.$ptax_cur_cd};
		}
		return _slipKey;
	}

	/**
	 * 支給明細訂正から作成する納品伝票の単位
	 */
	protected String[] getSlipKeyForCrt() {
		// 支給明細訂正から作成する納品伝票はヘッダの分割キーに場所を追加
		int len = getSlipKey().length;
		String[] key = new String[len + 1];
		System.arraycopy(getSlipKey(), 0, key, 0, len);
		key[len] = MST_PROV_ACT_R.$loc_cd;
		return key;
	}

	//- 支給予定検索 ---------------------------------------------
	protected ProvSchdCache _provSchdCache = null;
	protected static void initProvSchdCache(MCList<ProvActChk01_DtlR> dtlL) {
		object(CLAZZ)._initProvSchdCache(dtlL);
	}
	protected void _initProvSchdCache(MCList<ProvActChk01_DtlR> dtlL) {
		if (_provSchdCache == null) {
			_provSchdCache = new ProvSchdCache(dtlL);
		}
		else {
			_provSchdCache.addCache(dtlL);
		}
	}

	protected static ProvSchdCache getProvSchdCache() {
		return object(CLAZZ)._provSchdCache;
	}

	public class ProvSchdCache {
		protected MCIndexKey _provSchdIdx1 = null;
		protected MCIndexKey _provSchdIdx2 = null;
		protected MCList<MST_PROV_SCHD_R> _provSchdCache = MCList.create(MST_PROV_SCHD_R.class);

		protected ProvSchdCache(MCList<ProvActChk01_DtlR> dtlL) {
			addCache(dtlL);
		}

		protected void addCache(MCList<ProvActChk01_DtlR> dtlL) {
			MCList<MST_PROV_SCHD_R> provSchdL1 = MCList.create(MST_PROV_SCHD_R.class);
			MST_PROV_SCHD_R t = MST_PROV_SCHD_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbSelectKey("MSBEL5270_MST_PROV_SCHD_S01", provSchdL1, dbcL_bldr, dtlL.groupBy(ProvActChk01_DtlR.$prov_schd_no));
			_provSchdCache.addAll(provSchdL1);
			
			MCList<MST_PROV_SCHD_R> provSchdL2 = MCList.create(MST_PROV_SCHD_R.class);
			dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.addWhereWithAnd(t.prov_src_schd_typ.eq(bind("prov_src_schd_typ")));
			dbcL_bldr.addWhereWithAnd(t.prov_src_schd_no1.eq(nvl( bind("prov_src_schd_no1"), value(MAC_STR.NULL_VAL.value()) )));
			dbcL_bldr.addWhereWithAnd(t.prov_src_schd_no2.eq(nvl( bind("prov_src_schd_no2"), value(MAC_STR.NULL_VAL.value()) )));
			dbSelect("MSBEL5270_MST_PROV_SCHD_S02", provSchdL2, dbcL_bldr, dtlL.groupBy(ProvActChk01_DtlR.$prov_src_schd_typ, ProvActChk01_DtlR.$prov_src_schd_no1, ProvActChk01_DtlR.$prov_src_schd_no2, ProvActChk01_DtlR.$trd_ptn_typ));
			_provSchdCache.addAll(provSchdL2);

			_provSchdIdx1 = _provSchdCache.createIndex(MST_PROV_SCHD_R.$prov_schd_no);
			_provSchdIdx2 = _provSchdCache.createIndex(MST_PROV_SCHD_R.$prov_src_schd_typ, MST_PROV_SCHD_R.$prov_src_schd_no1,
					ProvActChk01_DtlR.$prov_src_schd_no2, ProvActChk01_DtlR.$trd_ptn_typ);
		}

		protected MST_PROV_SCHD_R get(String prov_schd_no, String prov_src_schd_typ, String prov_src_schd_no1,
				String prov_src_schd_no2, String trd_ptn_typ) {
			if (isNull(prov_schd_no)) {
				return _provSchdCache.getFirst(_provSchdIdx2, prov_src_schd_typ, nvl(prov_src_schd_no1, MAC_STR.NULL_VAL.value()),
						nvl(prov_src_schd_no2, MAC_STR.NULL_VAL.value()), trd_ptn_typ);
			}
			else {
				return _provSchdCache.getFirst(_provSchdIdx1, prov_schd_no);
			}
		}
	}

	//- 支給実績検索 ---------------------------------------------
	protected ProvActCache _provActCache = null;
	public static void initProvActCache(MCList<ProvActChk01_DtlR> dtlL) {
		object(CLAZZ)._initProvActCache(dtlL);
	}
	protected void _initProvActCache(MCList<ProvActChk01_DtlR> dtlL) {
		if (_provActCache == null) {
			_provActCache = new ProvActCache(dtlL);
		}
		else {
			_provActCache.addCache(dtlL);
		}
	}

	public static ProvActCache getProvActCache() {
		return object(CLAZZ)._provActCache;
	}

	public class ProvActCache {
		protected MCIndexKey _provActIdx1 = null;
		protected MCIndexKey _provActIdx2 = null;
		protected MCIndexKey _provActIdx3 = null;
		protected MCList<MST_PROV_ACT_R> _provActCache = MCList.create(MST_PROV_ACT_R.class);

		protected ProvActCache(MCList<ProvActChk01_DtlR> dtlL) {
			addCache(dtlL);
		}

		protected void addCache(MCList<ProvActChk01_DtlR> dtlL) {
			_provActCache.addStringColumn("arr_act_no");

			MCList<MST_PROV_ACT_R> provActL1 = MCList.create(MST_PROV_ACT_R.class);
			provActL1.addStringColumn("arr_act_no");
			MST_PROV_ACT_R t1 = MST_PROV_ACT_R.create("T");
			MCQueryApiBuilder dbcL_bldr1 = MCQueryApiBuilder.create(t1);
			dbcL_bldr1.addWhereWithAnd(t1.prov_act_no.eq(bind("prov_act_no")));
			dbcL_bldr1.addWhereWithAnd(t1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			dbSelectForUpdate("MSBEL5270_MST_PROV_ACT_S05", provActL1, dbcL_bldr1, dtlL.groupBy(MST_PROV_ACT_R.$prov_act_no));
			_provActCache.addAll(provActL1);

			MCList<MST_PROV_ACT_R> provActL2 = MCList.create(MST_PROV_ACT_R.class);
			provActL2.addStringColumn("arr_act_no");
			MST_PROV_ACT_R t2 = MST_PROV_ACT_R.create("T");
			MCQueryApiBuilder dbcL_bldr2 = MCQueryApiBuilder.create(t2);
			dbcL_bldr2.addWhereWithAnd(t2.prov_src_act_typ.eq(bind("prov_src_act_typ")));
			dbcL_bldr2.addWhereWithAnd(t2.prov_src_act_no.eq(nvl( bind("prov_src_act_no"), value(MAC_STR.NULL_VAL.value()) )));
			dbcL_bldr2.addWhereWithAnd(t2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			dbSelectForUpdate("MSBEL5270_MST_PROV_ACT_S06", provActL2, dbcL_bldr2, dtlL.groupBy(MST_PROV_ACT_R.$prov_src_act_typ, MST_PROV_ACT_R.$prov_src_act_no, MST_PROV_ACT_R.$trd_ptn_typ));
			_provActCache.addAll(provActL2);
			
			// 直送支給の場合、暫定時に更新した支給実績明細を参照する
			MCList<MST_PROV_ACT_R> provActL3 = MCList.create(MST_PROV_ACT_R.class);
			provActL3.addStringColumn("arr_act_no");
			MST_PROV_ACT_R t3 = MST_PROV_ACT_R.create("T");
			MST_PURC_ACT_IO_R t4 = MST_PURC_ACT_IO_R.create("T4");
			MCQueryApiBuilder dbcL_bldr3 = MCQueryApiBuilder.create(t3);
			dbcL_bldr3.setDistinct();
			dbcL_bldr3.addSelect(t4.arr_act_no);
			dbcL_bldr3.addInnerJoin(t4, t4.purc_act_io_no.eq(t3.prov_src_act_no));
			dbcL_bldr3.addWhereWithAnd(t3.prov_src_act_typ.eq(value(MSC_PROV_SRC_ACT_TYP.DDLV.value())));
			dbcL_bldr3.addWhereWithAnd(t4.arr_act_no.eq(bind("arr_act_no")));
			dbcL_bldr3.addWhereWithAnd(t3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.DIS.value())));
			dbcL_bldr3.addWhereWithAnd(t3.upd_flg.eq(value(true)));
			dbSelect("MSBEL5270_MST_PROV_ACT_S06", provActL3, dbcL_bldr3, dtlL.groupBy("arr_act_no"));
			_provActCache.addAll(provActL3);

			_provActCache.sort(SortType.DESC, MST_PROV_ACT_R.$prov_act_no, MST_PROV_ACT_R.$prov_act_seq);
			_provActIdx1 = _provActCache.createIndex(MST_PROV_ACT_R.$prov_act_no);
			_provActIdx2 = _provActCache.createIndex(MST_PROV_ACT_R.$prov_src_act_typ, MST_PROV_ACT_R.$prov_src_act_no, MST_PROV_ACT_R.$trd_ptn_typ);
			_provActIdx3 = _provActCache.createIndex("arr_act_no", MST_PROV_ACT_R.$slip_sts_typ);
		}

		public MST_PROV_ACT_R get(String prov_act_no, String prov_src_act_typ, String prov_src_act_no, String trd_ptn_typ) {
			if (isNull(prov_act_no)) {
				return _provActCache.getFirst(_provActIdx2, prov_src_act_typ, nvl(prov_src_act_no, MAC_STR.NULL_VAL.value()), trd_ptn_typ);
			}
			else {
				return _provActCache.getFirst(_provActIdx1, prov_act_no);
			}
		}
		public MST_PROV_ACT_R getBefAct (String arrActNo) {
			return _provActCache.getFirst(_provActIdx3, arrActNo, MAC_SLIP_STS_TYP.DIS.value());
		}

		protected MCList<ProvActChk01_DtlR> getProvSchdNo() {
			MCList<ProvActChk01_DtlR> dtlL = MCList.create(ProvActChk01_DtlR.class);
			addAll(dtlL, _provActCache, createMap_ProvActChk01_DtlR_MST_PROV_ACT_R());

			return dtlL;
		}

		protected Map_ProvActChk01_DtlR_MST_PROV_ACT_R<ProvActChk01_DtlR,MST_PROV_ACT_R> createMap_ProvActChk01_DtlR_MST_PROV_ACT_R() {
			return new Map_ProvActChk01_DtlR_MST_PROV_ACT_R<ProvActChk01_DtlR, MST_PROV_ACT_R>();
		}

		public class Map_ProvActChk01_DtlR_MST_PROV_ACT_R<D extends ProvActChk01_DtlR, S extends MST_PROV_ACT_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ProvActChk01_DtlR.$prov_schd_no, MST_PROV_ACT_R.$prov_schd_no);
			}
		}
	}

	//- 品目マスタ検索 ---------------------------------------------
	protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache = null;
	protected void selectItmL(MCList<ProvActUpd01_DtlR> dtlL) {
		MAM_ITM_R t = MAM_ITM_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		dbcL_bldr.setSelect(t.stk_mng_typ, t.sundry_itm_flg, t.sno1_mng_typ, t.sno2_mng_typ, t.sno3_mng_typ, t.sno4_mng_typ);
		_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(dbcL_bldr, dtlL, ProvActChk01_DtlR.$itm_cd,
				ProvActChk01_DtlR.$itm_sub1, ProvActChk01_DtlR.$itm_sub2, ProvActChk01_DtlR.$itm_sub3);
	}

	//- 場所マスタ検索 ---------------------------------------------
	protected FXUCL_MCDbcCache<MAM_LOC_R> _locCache = null;
	protected void selectLocCache(MCList<ProvActUpd01_DtlR> dtlL) {
		MAM_LOC_R t = MAM_LOC_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		
		dbcL_bldr.setSelect(t.loc_nm, MAPA_LOC$F_GET_LOC_ADDR( t.loc_cd, bind("xfr_dt"), value(MAC_LOC_ADDR_TYP.ZIP_CD.value()), nullValue()).as("dlv_zip_cd"), MAPA_LOC$F_GET_LOC_ADDR( t.loc_cd, bind("xfr_dt"), value(MAC_LOC_ADDR_TYP.ADDR1.value()), nullValue()).as("dlv_addr1"), MAPA_LOC$F_GET_LOC_ADDR( t.loc_cd, bind("xfr_dt"), value(MAC_LOC_ADDR_TYP.ADDR2.value()), nullValue()).as("dlv_addr2"), MAPA_LOC$F_GET_LOC_ADDR( t.loc_cd, bind("xfr_dt"), value(MAC_LOC_ADDR_TYP.ADDR3.value()), nullValue()).as("dlv_addr3"), MAPA_LOC$F_GET_LOC_ADDR( t.loc_cd, bind("xfr_dt"), value(MAC_LOC_ADDR_TYP.ADDR4.value()), nullValue()).as("dlv_addr4"), MAPA_LOC$F_GET_LOC_ADDR( t.loc_cd, bind("xfr_dt"), value(MAC_LOC_ADDR_TYP.TEL.value()), nullValue()).as("dlv_tel"), MAPA_LOC$F_GET_LOC_ADDR( t.loc_cd, bind("xfr_dt"), value(MAC_LOC_ADDR_TYP.FAX.value()), nullValue()).as("dlv_fax"));
		_locCache = new FXUCL_MCDbcCache<MAM_LOC_R>(dbcL_bldr, dtlL, ProvActUpd01_DtlR.$loc_cd);
	}

	protected FXUCL_MCDbcCacheStEnd<MAM_SPPL_USR_R> _spplUsrCache;

	protected void doSpplUsrCache(MCList<ProvActUpd01_DtlR> provL) {
		MAM_SPPL_USR_R t = MAM_SPPL_USR_R.create("T");
		MCQueryApiBuilder dbcStkL_bldr = MCQueryApiBuilder.create(t);
		dbcStkL_bldr.setSelect(t.outsrc_usr_cd, t.outsrc_dpt_cd);
		_spplUsrCache = new FXUCL_MCDbcCacheStEnd<MAM_SPPL_USR_R>(dbcStkL_bldr, provL, ProvActUpd01_DtlR.$prsppl_cd);
	}

	protected MAM_SPPL_USR_R getSpplUsrR(ShipRprt_Upd01_HdrR hdrR) {
		MCDate dt = nvl(hdrR.ac_dt(), hdrR.ship_tm());
		if (!isNull(dt)) {
			dt = dt.trunc(MCDateFieldType.DAY);
		}
		MAM_SPPL_USR_R r = _spplUsrCache.get(dt, hdrR.bp_cd());
		if (!isNull(r.outsrc_usr_cd()) && isNull(r.outsrc_dpt_cd())) {
			MAM_USR_ACL_R aclR = getUsrAclR(r.outsrc_usr_cd(), dt);
			r.outsrc_dpt_cd(aclR.dpt_cd()); // 外注担当者の主部門
		}
		return r;
	}

	/**
	 * 担当者権限マスタのキャッシュ
	 */
	protected FXUCL_MCDbcCacheStEnd<MAM_USR_ACL_R> _usrAclCache;

	protected MAM_USR_ACL_R getUsrAclR(String usrCd, MCDate dt) {
		if (_usrAclCache == null) {
			MAM_USR_ACL_R t = MAM_USR_ACL_R.create("T");

			MCQueryApiBuilder dbcStkL_bldr = MCQueryApiBuilder.create(t);
			dbcStkL_bldr.setSelect(t.usr_cd, t.dpt_cd);

			_usrAclCache = new FXUCL_MCDbcCacheStEnd<MAM_USR_ACL_R>(dbcStkL_bldr);
		}
		return _usrAclCache.get(dt, usrCd);
	}

	/**
	 * 債務部門のキャッシュ
	 */ 
	protected ApDptCache _apDptCache = null;
	public static void initApDptCache(MCList<ProvActChk01_DtlR> up0, ProvActUpd01_CndR up1) {
		object(CLAZZ)._initApDptCache(up0, up1);
	}

	protected void _initApDptCache(MCList<ProvActChk01_DtlR> up0, ProvActUpd01_CndR up1) {
		if (_apDptCache == null) {
			_apDptCache = new ApDptCache(up0, up1);
		}
		else {
			_apDptCache.addCache(up0, up1);
		}
	}

	public static ApDptCache getApDptCache() {
		return object(CLAZZ)._apDptCache;
	}

	public class ApDptCache {
		protected MCIndexKey _apDptIdx = null;
		protected MCList<ProvActChk01_DtlR> _apDptCache = MCList.create(ProvActChk01_DtlR.class);
		protected MCIndexKey _chkDptIdx = null;
		protected MCList<ProvActChk01_DtlR> _chkDptCache = MCList.create(ProvActChk01_DtlR.class);

		protected ApDptCache(MCList<ProvActChk01_DtlR> up0, ProvActUpd01_CndR up1) {
			addCache(up0, up1);
		}

		protected void addCache(MCList<ProvActChk01_DtlR> up0, ProvActUpd01_CndR up1) {
			if (up1.upd_flg()) {
				_chkDptCache.addAll(up0.groupBy(ProvActChk01_DtlR.$ap_dpt_cd, ProvActChk01_DtlR.$ac_dt));
				execChkFunc(_chkDptCache);
				_chkDptIdx = _chkDptCache.createIndex(ProvActChk01_DtlR.$ap_dpt_cd, ProvActChk01_DtlR.$ac_dt);
			}
			else {
				if (_apDptCache.isEmpty()) {
					_apDptCache.addAll(up0.groupBy(ProvActChk01_DtlR.$prsppl_cd, ProvActChk01_DtlR.$ac_dt));
					execGetFunc(_apDptCache);
					_apDptIdx = _apDptCache.createIndex(ProvActChk01_DtlR.$prsppl_cd, ProvActChk01_DtlR.$ac_dt);

					_chkDptCache.addAll(_apDptCache.groupBy(ProvActChk01_DtlR.$ap_dpt_cd, ProvActChk01_DtlR.$ac_dt));
					execChkFunc(_chkDptCache);
					_chkDptIdx = _chkDptCache.createIndex(ProvActChk01_DtlR.$ap_dpt_cd, ProvActChk01_DtlR.$ac_dt);
				}
				else {
					MCList<ProvActChk01_DtlR> apDptCacheTmp = MCList.create(ProvActChk01_DtlR.class);
					for (ProvActChk01_DtlR r :up0.groupBy(ProvActChk01_DtlR.$prsppl_cd, ProvActChk01_DtlR.$ac_dt)) {
						if (isNull(this.getApDpt(r.prsppl_cd(), r.ac_dt()))) {
							apDptCacheTmp.add(r);
						}
					}
					if (!apDptCacheTmp.isEmpty()) {
						execGetFunc(apDptCacheTmp);
						_apDptCache.addAll(apDptCacheTmp);
						_apDptIdx = _apDptCache.createIndex(ProvActChk01_DtlR.$prsppl_cd, ProvActChk01_DtlR.$ac_dt);
	
						MCList<ProvActChk01_DtlR> chkDptCacheTmp = MCList.create(ProvActChk01_DtlR.class);
						for (ProvActChk01_DtlR r :apDptCacheTmp.groupBy(ProvActChk01_DtlR.$ap_dpt_cd, ProvActChk01_DtlR.$ac_dt)) {
							if (isNull(this.chkApDpt(r.ap_dpt_cd(), r.ac_dt()))) {
								chkDptCacheTmp.add(r);
							}
						}
						if (!chkDptCacheTmp.isEmpty()) {
							execChkFunc(chkDptCacheTmp);
							_chkDptCache.addAll(chkDptCacheTmp);
							_chkDptIdx = _chkDptCache.createIndex(ProvActChk01_DtlR.$ap_dpt_cd, ProvActChk01_DtlR.$ac_dt);
						}
					}
				}
			}
		}

		protected void execGetFunc(MCList<ProvActChk01_DtlR> list) {
			for (ProvActChk01_DtlR r :list) {
				r.asppl_cd(MSBEL_ProvSchdService.getBpCache().getEx(r.prsppl_cd()).asppl_cd());
			}
			list.addBooleanColumn("no_chk_flg", true);

			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_BP$F_GET_AP_DPT_CD_NE2", "01"), MABSFunction.getFunctionExecuter("MAPA_BP$F_GET_AP_DPT_CD_NE2"), ProvActChk01_DtlR.$ap_dpt_cd, list, ProvActChk01_DtlR.$prsppl_cd, ProvActChk01_DtlR.$asppl_cd, ProvActChk01_DtlR.$ac_dt, "no_chk_flg");
		}

		protected void execChkFunc(MCList<ProvActChk01_DtlR> list) {
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_DPT$F_CHECK_DPT_CD", "01"), MABCFunction.getFunctionExecuter("MAPA_DPT$F_CHECK_DPT_CD"), ProvActChk01_DtlR.$chk_ap_dpt_cd, list, ProvActChk01_DtlR.$ap_dpt_cd, ProvActChk01_DtlR.$ac_dt);		}

		public ProvActChk01_DtlR getApDpt(String prsppl_cd, MCDate ac_dt) {
			return _apDptCache.getFirst(_apDptIdx, prsppl_cd, ac_dt);
		}

		public ProvActChk01_DtlR chkApDpt(String ap_dpt_cd, MCDate ac_dt) {
			return _chkDptCache.getFirst(_chkDptIdx, ap_dpt_cd, ac_dt);
		}
	}

	protected Map_ShipRprt_Upd01_HdrR_ProvActUpd01_DtlR<ShipRprt_Upd01_HdrR,ProvActUpd01_DtlR> createMap_ShipRprt_Upd01_HdrR_ProvActUpd01_DtlR() {
		return new Map_ShipRprt_Upd01_HdrR_ProvActUpd01_DtlR<ShipRprt_Upd01_HdrR, ProvActUpd01_DtlR>();
	}

	public class Map_ShipRprt_Upd01_HdrR_ProvActUpd01_DtlR<D extends ShipRprt_Upd01_HdrR, S extends ProvActUpd01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
//			addColumnPathMap(ShipRprt_Upd01_HdrR.$hdr_peg_no, );		⇒ 外で設定する
//			addColumnPathMap(ShipRprt_Upd01_HdrR.$hdr_peg_seq, );		⇒ 不要
//			addColumnPathMap(ShipRprt_Upd01_HdrR.$data_crud_typ, ProvActUpd01_DtlR.$data_crud_typ);	⇒ valueCopyで設定する
			addColumnPathMap(ShipRprt_Upd01_HdrR.$can_ac_dt, ProvActUpd01_DtlR.$can_ac_dt);
//			addColumnPathMap(ShipRprt_Upd01_HdrR.$r_inst_no, );			⇒ 不要
//			addColumnPathMap(ShipRprt_Upd01_HdrR.$split_flg, );			⇒ valueCopyで設定する
//			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_slip_prnt_flg, );	⇒ 外で設定する
//			addColumnPathMap(ShipRprt_Upd01_HdrR.$ship_adv_prnt_flg, );	⇒ 不要
//			addColumnPathMap(ShipRprt_Upd01_HdrR.$slip_form_cd, );		⇒ 不要
//			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_slip_no, ProvActUpd01_DtlR.$dlv_slip_no);	⇒ 不要
//			addColumnPathMap(ShipRprt_Upd01_HdrR.$slo_no, );			⇒ 不要
//			addColumnPathMap(ShipRprt_Upd01_HdrR.$trn_typ, );			⇒ valueCopyで設定する
//			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_slip_inst_no, );	⇒ 不要
//			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_slip_act_no, );	⇒ 外で設定する
//			addColumnPathMap(ShipRprt_Upd01_HdrR.$dpt_cd, );			⇒ 不要
//			addColumnPathMap(ShipRprt_Upd01_HdrR.$usr_cd, );			⇒ 不要
			addColumnPathMap(ShipRprt_Upd01_HdrR.$ship_tm, ProvActUpd01_DtlR.$accpt_dt);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_tm, ProvActUpd01_DtlR.$accpt_dt);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$ac_dt, ProvActUpd01_DtlR.$ac_dt);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$trd_cd, ProvActUpd01_DtlR.$trd_cd);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$trd_ptn_typ, ProvActUpd01_DtlR.$trd_ptn_typ);
//			addColumnPathMap(ShipRprt_Upd01_HdrR.$cst_po_no, );			⇒ 不要
//			addColumnPathMap(ShipRprt_Upd01_HdrR.$pri_prnt_flg, );		⇒ valueCopyで設定する
			addColumnPathMap(ShipRprt_Upd01_HdrR.$trd_cur_cd, ProvActUpd01_DtlR.$trd_cur_cd);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$xrate, ProvActUpd01_DtlR.$xrate);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$ptax_xrate, ProvActUpd01_DtlR.$ptax_xrate);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$bp_cd, ProvActUpd01_DtlR.$prsppl_cd);
//			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_id_typ, );		⇒ valueCopyで設定する
			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_id_cd, ProvActUpd01_DtlR.$loc_cd);
//			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_id_nm, );			⇒ valueCopyで設定する
//			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_sundry_flg, );	⇒ valueCopyで設定する
//			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_zip_cd, );		⇒ valueCopyで設定する
//			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_addr1, );			⇒ valueCopyで設定する
//			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_addr2, );			⇒ valueCopyで設定する
//			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_addr3, );			⇒ valueCopyで設定する
//			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_addr4, );			⇒ valueCopyで設定する
//			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_cntct_dpt, );		⇒ valueCopyで設定する
//			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_cntct_psn, );		⇒ valueCopyで設定する
//			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_tel, );			⇒ valueCopyで設定する
//			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_fax, );			⇒ valueCopyで設定する
//			addColumnPathMap(ShipRprt_Upd01_HdrR.$xfr_loc_cd, );		⇒ valueCopyで設定する
//			addColumnPathMap(ShipRprt_Upd01_HdrR.$ship_fr_lg_grp_cd, );	⇒ 不要
			addColumnPathMap(ShipRprt_Upd01_HdrR.$wg_cd, ProvActUpd01_DtlR.$wg_cd);
//			addColumnPathMap(ShipRprt_Upd01_HdrR.$trd_rmrks, );			⇒ 不要
//			addColumnPathMap(ShipRprt_Upd01_HdrR.$non_prnt_flg, );		⇒ valueCopyで設定する
//			addColumnPathMap(ShipRprt_Upd01_HdrR.$adjst_slip_flg, );	⇒ valueCopyで設定する
//			addColumnPathMap(ShipRprt_Upd01_HdrR.$sub_char1, ProvActUpd01_DtlR.$sub_char1);	⇒ 不要
//			addColumnPathMap(ShipRprt_Upd01_HdrR.$sub_char2, ProvActUpd01_DtlR.$sub_char2);	⇒ 不要
//			addColumnPathMap(ShipRprt_Upd01_HdrR.$sub_char3, ProvActUpd01_DtlR.$sub_char3);	⇒ 不要
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			if (MAC_STR.isNULL_VAL(src.dlv_slip_d_no())) {
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			}
			else if (MAC_SLIP_STS_TYP.isCAN(src.slip_sts_typ())) {
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
			else {
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			}
			if (!MAC_STR.isNULL_VAL(src.dlv_slip_no())) {
				dest.dlv_slip_no(src.dlv_slip_no());
			}
			dest.split_flg(true);
			dest.trn_typ(MSC_TRN_TYP.PROV.value());
			dest.pri_prnt_flg(true);

			MAM_LOC_R grLoc = _locCache.getEx(src.loc_cd());
			dest.dlv_id_typ(MSC_DLV_ID_TYP.LOC.value());
			dest.dlv_id_nm(grLoc.loc_nm());
			dest.dlv_sundry_flg(false);
			dest.dlv_zip_cd(grLoc.getStringNE("dlv_zip_cd"));
			dest.dlv_addr1(grLoc.getStringNE("dlv_addr1"));
			dest.dlv_addr2(grLoc.getStringNE("dlv_addr2"));
			dest.dlv_addr3(grLoc.getStringNE("dlv_addr3"));
			dest.dlv_addr4(grLoc.getStringNE("dlv_addr4"));
			dest.dlv_tel(grLoc.getStringNE("dlv_tel"));
			dest.dlv_fax(grLoc.getStringNE("dlv_fax"));

			if (MAC_TRD_PTN_TYP.isPROV_RTN(dest.trd_ptn_typ())) {
				dest.xfr_loc_cd(src.loc_cd());
			}
			dest.adjst_slip_flg(false);
		}
	}

	protected Map_ShipRprt_Upd01_DtlR_ProvActUpd01_DtlR<ShipRprt_Upd01_DtlR,ProvActUpd01_DtlR> createMap_ShipRprt_Upd01_DtlR_ProvActUpd01_DtlR() {
		return new Map_ShipRprt_Upd01_DtlR_ProvActUpd01_DtlR<ShipRprt_Upd01_DtlR, ProvActUpd01_DtlR>();
	}

	public class Map_ShipRprt_Upd01_DtlR_ProvActUpd01_DtlR<D extends ShipRprt_Upd01_DtlR, S extends ProvActUpd01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
//			addColumnPathMap(ShipRprt_Upd01_DtlR.$hdr_peg_no, );	⇒ 外で設定する
//			addColumnPathMap(ShipRprt_Upd01_DtlR.$hdr_peg_seq, );	⇒ 不要
			addColumnPathMap(ShipRprt_Upd01_DtlR.$dtl_uniq_no, ProvActUpd01_DtlR.$prov_act_no);
//			addColumnPathMap(ShipRprt_Upd01_DtlR.$dtl_uniq_seq, );	⇒ 不要
//			addColumnPathMap(ShipRprt_Upd01_DtlR.$dlv_inst_rcpt_no, );	⇒ 不要
//			addColumnPathMap(ShipRprt_Upd01_DtlR.$prov_src_schd_typ, ProvActUpd01_DtlR.$prov_src_schd_typ);	⇒ 不要
//			addColumnPathMap(ShipRprt_Upd01_DtlR.$trn_typ, );		⇒ 不要
//			addColumnPathMap(ShipRprt_Upd01_DtlR.$bp_cd, );			⇒ 不要
//			addColumnPathMap(ShipRprt_Upd01_DtlR.$base_dt, );		⇒ 不要
//			addColumnPathMap(ShipRprt_Upd01_DtlR.$trd_ptn_typ, ProvActUpd01_DtlR.$trd_ptn_typ);	⇒ 不要
//			addColumnPathMap(ShipRprt_Upd01_DtlR.$trd_cur_cd, ProvActUpd01_DtlR.$trd_cur_cd);	⇒ 不要
//			addColumnPathMap(ShipRprt_Upd01_DtlR.$wg_cd, ProvActUpd01_DtlR.$wg_cd);				⇒ 不要
//			addColumnPathMap(ShipRprt_Upd01_DtlR.$dlv_slip_d_no, ProvActUpd01_DtlR.$dlv_slip_d_no);	⇒ 不要
//			addColumnPathMap(ShipRprt_Upd01_DtlR.$dlv_slip_d_seq, );	⇒ 不要
//			addColumnPathMap(ShipRprt_Upd01_DtlR.$dlv_slip_no, ProvActUpd01_DtlR.$dlv_slip_no);	⇒ 不要
//			addColumnPathMap(ShipRprt_Upd01_DtlR.$dlv_slip_seq, );	⇒ 不要
			addColumnPathMap(ShipRprt_Upd01_DtlR.$itm_cd, ProvActUpd01_DtlR.$itm_cd);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$itm_sub1, ProvActUpd01_DtlR.$itm_sub1);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$itm_sub2, ProvActUpd01_DtlR.$itm_sub2);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$itm_sub3, ProvActUpd01_DtlR.$itm_sub3);
//			addColumnPathMap(ShipRprt_Upd01_DtlR.$itm_nm, );		⇒ 不要
//			addColumnPathMap(ShipRprt_Upd01_DtlR.$sundry_itm_flg, );	⇒ valueCopyで設定する
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sno1, ProvActUpd01_DtlR.$sno1);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sno2, ProvActUpd01_DtlR.$sno2);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sno3, ProvActUpd01_DtlR.$sno3);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sno4, ProvActUpd01_DtlR.$sno4);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$lot_no, ProvActUpd01_DtlR.$lot_no);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sublot_no, ProvActUpd01_DtlR.$sublot_no);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$str_ln_cd, ProvActUpd01_DtlR.$str_ln_cd);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$stk_arrv_bp_cd, ProvActUpd01_DtlR.$stk_arrv_bp_cd);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$gd_cd, ProvActUpd01_DtlR.$gd_cd);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$quality_typ, ProvActUpd01_DtlR.$quality_typ);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$stk_insp_typ, ProvActUpd01_DtlR.$stk_insp_typ);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$stk_id_typ, ProvActUpd01_DtlR.$stk_id_typ);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$stk_bp_cd, ProvActUpd01_DtlR.$stk_bp_cd);
//			addColumnPathMap(ShipRprt_Upd01_DtlR.$fix_no_typ, );	⇒ valueCopyで設定する
//			addColumnPathMap(ShipRprt_Upd01_DtlR.$fix_no, );		⇒ valueCopyで設定する
			addColumnPathMap(ShipRprt_Upd01_DtlR.$trd_unit_qty, ProvActUpd01_DtlR.$trd_unit_qty);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$trd_unit_cd, ProvActUpd01_DtlR.$trd_unit_cd);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$base_unit_qty, ProvActUpd01_DtlR.$base_unit_qty);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$base_unit_cd, ProvActUpd01_DtlR.$base_unit_cd);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$trd_cur_upri, ProvActUpd01_DtlR.$trd_cur_upri);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$trd_cur_amt, ProvActUpd01_DtlR.$trd_cur_amt);
//			addColumnPathMap(ShipRprt_Upd01_DtlR.$trd_cur_dscnt_amt, );	⇒ 不要
			addColumnPathMap(ShipRprt_Upd01_DtlR.$base_cur_upri, ProvActUpd01_DtlR.$base_cur_upri);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$base_cur_amt, ProvActUpd01_DtlR.$base_cur_amt);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$base_cur_tax_amt, ProvActUpd01_DtlR.$base_cur_tax_amt);
//			addColumnPathMap(ShipRprt_Upd01_DtlR.$base_cur_dscnt_amt, );	⇒ 不要
			addColumnPathMap(ShipRprt_Upd01_DtlR.$tax_cd, ProvActUpd01_DtlR.$tax_cd);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$trd_cur_tax_amt, ProvActUpd01_DtlR.$trd_cur_tax_amt);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$wtax_rate, ProvActUpd01_DtlR.$wtax_rate);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$wtax_amt, ProvActUpd01_DtlR.$wtax_amt);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$prov_typ, ProvActUpd01_DtlR.$prov_typ);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$prov_basis_typ, ProvActUpd01_DtlR.$prov_basis_typ);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$rsn_cd, ProvActUpd01_DtlR.$xfr_rsn_cd);
//			addColumnPathMap(ShipRprt_Upd01_DtlR.$bd_dpt_cd, );		⇒ 不要
//			addColumnPathMap(ShipRprt_Upd01_DtlR.$cst_po_d_no, );	⇒ 不要
//			addColumnPathMap(ShipRprt_Upd01_DtlR.$cst_itm_cd, );	⇒ 不要
//			addColumnPathMap(ShipRprt_Upd01_DtlR.$cst_itm_nm, );	⇒ 不要
//			addColumnPathMap(ShipRprt_Upd01_DtlR.$slo_d_no, );		⇒ 不要
			addColumnPathMap(ShipRprt_Upd01_DtlR.$trd_d_rmrks, ProvActUpd01_DtlR.$trd_d_rmrks);
//			addColumnPathMap(ShipRprt_Upd01_DtlR.$io_typ, );		⇒ 不要
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sub_char1, ProvActUpd01_DtlR.$sub_char1);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sub_char2, ProvActUpd01_DtlR.$sub_char2);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sub_char3, ProvActUpd01_DtlR.$sub_char3);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$base_ac_dt, ProvActUpd01_DtlR.$base_ac_dt);
//			addColumnPathMap(ShipRprt_Upd01_DtlR.$dlv_slip_rev, );	⇒ 不要
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			if (!MAC_STR.isNULL_VAL(src.dlv_slip_d_no())) {
				dest.dlv_slip_d_no(src.dlv_slip_d_no());
			}

			dest.sundry_itm_flg(_itmCache.getEx(src.itm_cd(), src.itm_sub1(), src.itm_sub2(), src.itm_sub3()).sundry_itm_flg());

			// 検査中の場合は確定ＮＯを設定する
			if (!MSC_STK_INSP_TYP.isFIN(src.stk_insp_typ())) {
				dest.fix_no_typ(MSC_FIX_NO_TYP.ARR_ACT_NO.value());
				if (MSC_PROV_SRC_ACT_TYP.isDDLV(src.prov_src_act_typ())) {
					dest.fix_no(src.arr_act_no());
				}
				else {
					dest.fix_no(src.prov_src_act_no());
				}
			}
		}
	}

	//FMCB CUSTOM END
}