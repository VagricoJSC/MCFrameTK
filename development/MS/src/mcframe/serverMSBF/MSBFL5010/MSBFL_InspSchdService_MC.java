package mcframe.serverMSBF.MSBFL5010;

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
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;

import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
import static mcframe.serverMAUC.MAUCL1060.MAUCL_TrdUtil.*;
import mcframe.serverMSBE.MSBEL5010.*;
import mcframe.serverMSBE.MSBEL5020.*;
import mcframe.serverMSBF.MSBFL5020.*;
import mcframe.serverMSBF.MSBFL5050.*;
import mcframe.serverMSBF.MSBFL5100.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import static mcframe.serverMSUC.MSUCL0050.MSUCL_ClUtil.*;
import java.util.*;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
import mcframe.serverMSUC.MSUCL0090.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBFL_InspSchdService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBFL_InspSchdService_MC extends MSBFL_InspSchdService_MC_A{
	//FMCB CUSTOM START
	/** 【検査着手予定日・検査完了予定日算出用一時カラム】リードタイム */
	protected final String TMP_INSP_LT = "tmp_insp_lt";
	/** 【検査着手予定日・検査完了予定日算出用一時カラム】基準日が休日のときは直後の稼働日とするか */
	protected final String TMP_FWD_FLG = "tmp_fwd_flg";
	/** 【検査着手予定日・検査完了予定日算出用一時カラム】カレンダCD */
	protected final String TMP_CAL_CD = "tmp_cal_cd";
	/** 【検査着手予定日・検査完了予定日算出用一時カラム】休日をリードタイムに含めないか */
	protected final String TMP_XFR_FLG = "tmp_xfr_flg";
	/** 【検査着手予定日・検査完了予定日算出用一時カラム】検査オフセット */
	protected final String TMP_INSP_OFFST = "tmp_insp_offst";
	
	/**
	 * InspSchd_Chk01オペレーション.<p>
	 *
	 * 検査関連データの追加・更新・削除前にチェックを行う。<br>
	 */
	public class InspSchd_Chk01 extends MSBFL_InspSchdService_MC_A.InspSchd_Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(chk());
			MCMessagePool.addAll(msgL);
			
			callPlntAprvChk01(up0());
			
			// 下り電文設定
			setDown();
		}
		
		protected void setDown() {
			down0().setAll(up0());
		}
		
		protected MCMessageList chk() {
			getInspSchd();
			createItmCache();
			createLocCache();
			getItmInsp();
			
			MCMessageList msgL = chkMain();
			
			return msgL;
		}
		
		MCList<MST_INSP_SCHD_R> _schdList = MCList.create(MST_INSP_SCHD_R.class);
		MCIndexKey _schdKey;
		MCList<MST_INSP_SCHD_R> _actList = MCList.create(MST_INSP_SCHD_R.class);
		MCIndexKey _actKey;
		
		protected void getInspSchd() {
			
			MCList<MST_INSP_SCHD_R> schdL = MCList.create(MST_INSP_SCHD_R.class);
			MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(t);
			schdL_bldr.setWhere(t.insp_typ.eq(bind("insp_typ")));
			schdL_bldr.addWhereWithAnd(t.src_no3.eq(bind("src_no3")));
			schdL_bldr.addWhereWithAnd(t.src_no4.isNull());
			schdL_bldr.addWhereWithAnd(t.latest_flg.eq(value(true)));
			
			MCList<MST_INSP_SCHD_R> actL = MCList.create(MST_INSP_SCHD_R.class);
			MST_INSP_SCHD_R t1 = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder actL_bldr = MCQueryApiBuilder.create(t1);
			actL_bldr.setWhere(t1.insp_typ.eq(bind("insp_typ")));
			actL_bldr.addWhereWithAnd(t1.src_no4.eq(bind("src_no4")));
			actL_bldr.addWhereWithAnd(t1.latest_flg.eq(value(true)));
			
			for (InspSchd_Chk01_CndR r : up0()) {
				MST_INSP_SCHD_R schdR = MST_INSP_SCHD_R.create();
				schdR.insp_typ(r.insp_typ());
				schdR.src_no3(r.src_no3());
				schdL.add(schdR);
				if (!isNull(r.src_no4())) {
					MST_INSP_SCHD_R actR = MST_INSP_SCHD_R.create();
					actR.insp_typ(r.insp_typ());
					actR.src_no4(r.src_no4());
					actL.add(actR);
				}
			}
			if (!schdL.isEmpty()) {
				schdL_bldr.setOrderByAsc(schdL_bldr.getBaseDbc().getKeyColumn$());
				dbSelect("MSBFL5010_MST_INSP_SCHD_S01", schdL, schdL_bldr, schdL);
			}
			if (!actL.isEmpty()) {
				actL_bldr.setOrderByAsc(actL_bldr.getBaseDbc().getKeyColumn$());
				dbSelect("MSBFL5010_MST_INSP_SCHD_S02", actL, actL_bldr, actL);
			}
			_schdList.setAll(schdL);
			_schdKey = _schdList.createIndex(MST_INSP_SCHD_R.$src_no3, MST_INSP_SCHD_R.$insp_typ);
			_actList.setAll(actL);
			_actKey = _actList.createIndex(MST_INSP_SCHD_R.$src_no4, MST_INSP_SCHD_R.$insp_typ);
		}
		
		protected MST_INSP_SCHD_R getInspSchdR(InspSchd_Chk01_CndR r) {
			if (!isNull(r.src_no4())) {
				MST_INSP_SCHD_R ret = _actList.getFirst(_actKey, r.src_no4(), r.insp_typ());
				if (!isNull(ret) && !isNull(ret.insp_schd_no())) {
					return ret;
				}
			}
			return _schdList.getFirst(_schdKey, r.src_no3(), r.insp_typ());
		}
		
		protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache;
		protected FXUCL_MCDbcCache<MAM_LOC_R> _locCache;
		protected MCList<InspSchd_Srch01_CndR> _itmInspCache = MCList.create(InspSchd_Srch01_CndR.class);
		
		protected void createItmCache() {
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.dec_place);
			dbc_bldr.addSelect(t.rnd_typ);
			dbc_bldr.addSelect(t.sublot_mng_typ);
			_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(dbc_bldr, up0(), MST_LOT_R.$itm_cd,
					MST_LOT_R.$itm_sub1, MST_LOT_R.$itm_sub2, MST_LOT_R.$itm_sub3);
		}
		
		protected void createLocCache() {
			MCList<InspSchd_Chk01_CndR> bindL = MCList.create(InspSchd_Chk01_CndR.class);
			for (InspSchd_Chk01_CndR up0R : up0()) {
				if (!MAC_DATA_CRUD_TYP.isDEL(up0R.data_crud_typ())
						&& MSC_INSP_TYP.isPRDCT(up0R.insp_typ())) {
					bindL.add(up0R);
				}
			}

			if (!bindL.isEmpty()) {
				MAM_LOC_R t = MAM_LOC_R.create("T");
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
				dbc_bldr.setSelect(t.loc_mng_typ);
				_locCache = new FXUCL_MCDbcCache<MAM_LOC_R>(dbc_bldr, up0(),
						InspSchd_Upd01_CndR.$loc_cd);
			}
		}
		
		protected void getItmInsp() {
			MSBFL_InspSchdService.InspSchd_Srch01 o = MSBFL_InspSchdService.crtInspSchd_Srch01();
			
			for (InspSchd_Chk01_CndR up0R : up0()) {
				if (MAC_DATA_CRUD_TYP.isDEL(up0R.data_crud_typ())
						|| !MSC_INSP_TYP.isPRDCT(up0R.insp_typ())) {
					continue;
				}
				
				InspSchd_Srch01_CndR oR = InspSchd_Srch01_CndR.create();
				
				oR.peg_no(up0R.peg_no());
				oR.itm_cd(up0R.itm_cd());
				oR.itm_sub1(up0R.itm_sub1());
				oR.itm_sub2(up0R.itm_sub2());
				oR.itm_sub3(up0R.itm_sub3());
				oR.mfg_loc_cd(up0R.mfg_loc_cd());
				oR.sppl_cd(null);
				oR.maker_cd(null);
				oR.from_site_cd(null);
				oR.to_site_cd(null);
				oR.to_loc_cd(up0R.loc_cd());
				oR.insp_typ(up0R.insp_typ());
				oR.base_dt(up0R.gr_tm().trunc(MCDateFieldType.DAY));
				oR.insp_ptn_cd(null);
				oR.no_insp_srch_flg(false);
				
				o.up0().add(oR);
			}
			
			if (!o.up0().isEmpty()) {
				o.exec();
			}
			
			if (!o.down0().isEmpty()) {
				_itmInspCache = o.down0();
			}
		}
		
		protected InspSchd_Srch01_CndR getItmInspR(MCNumber pegNo) {
			if (isNull(_itmInspCache)) {
				return null;
			}
			else {
				return _itmInspCache.getFirst(InspSchd_Srch01_CndR.$peg_no, pegNo);
			}
		}
		
		protected MCMessageList chkMain() {
			MCMessageList msgL = new MCMessageList();
			MCList<InspSchd_Chk01_CndR> prdctUpL = up0().subList(r -> MSC_INSP_TYP.isPRDCT(r.insp_typ()));
			if (!prdctUpL.isEmpty()) {
				MCIndexKey upIdx = prdctUpL.createIndex(InspSchd_Chk01_CndR.$src_no3);
				
				MCList<MST_INSP_SCHD_R> subSchdL = _schdList.subList(r -> isNull(r.src_no4()));
				for (MCList<MST_INSP_SCHD_R> tmpL :subSchdL.groupList(MST_INSP_SCHD_R.$src_no3)) {
					for (MST_INSP_SCHD_R schdR : tmpL) {
						MAM_ITM_R itmR = _itmCache.get(schdR.itm_cd(), schdR.itm_sub1(), schdR.itm_sub2(), schdR.itm_sub3());
						MCList<InspSchd_Chk01_CndR> subUpL = prdctUpL.subList(upIdx, schdR.src_no3());
						boolean hasSameSchdInfoFlg = false;
						for (InspSchd_Chk01_CndR cndR : subUpL) {
							if (isColSame(cndR, schdR, getLotCols(MAC_SUBLOT_MNG_TYP.isSTK(itmR.sublot_mng_typ())))) {
								hasSameSchdInfoFlg = true;
								break;
							}
						}
						if (hasSameSchdInfoFlg) {
							subUpL.setBooleanNE("has_same_schd_info_flg", true);
						}
					}
				}
			}
			
			for (InspSchd_Chk01_CndR r : up0()) {
				chkSlsLoc(r, msgL);
				
				MST_INSP_SCHD_R schdR = getInspSchdR(r);
				
				// 検査予定が存在する、かつ、 （指図済みである、または、再検査である）の場合にチェックを行う
				if (!isNull(schdR) && (!isNull(schdR.insp_no())
						|| !isNull(schdR.own_insp_schd_no()))) {

					MCList<MST_INSP_SCHD_R> schdL = MCList.create(MST_INSP_SCHD_R.class);
					schdL.add(schdR);

					chkInsp(r, schdL, msgL);
					chkSoAprv(r, msgL);
				}
			}
			
			return msgL;
		}
		
		protected String[] getLotCols(boolean isDelSublotFlg) {
			if (isDelSublotFlg) {
				return new String[]{
						MST_INSP_SCHD_R.$itm_cd,
						MST_INSP_SCHD_R.$itm_sub1,
						MST_INSP_SCHD_R.$itm_sub2,
						MST_INSP_SCHD_R.$itm_sub3,
						MST_INSP_SCHD_R.$lot_no
				};
			}

			return new String[]{
					MST_INSP_SCHD_R.$itm_cd,
					MST_INSP_SCHD_R.$itm_sub1,
					MST_INSP_SCHD_R.$itm_sub2,
					MST_INSP_SCHD_R.$itm_sub3,
					MST_INSP_SCHD_R.$lot_no,
					MST_INSP_SCHD_R.$sublot_no
			};
		}
		/**
		 * 製造検査で工場出荷承認対象の場合に出来高場所に販売場所を指定していないかどうかのチェック処理
		 * @param r
		 * @param msgL
		 */
		protected void chkSlsLoc(InspSchd_Chk01_CndR r, MCMessageList msgL) {
			if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())
					&& MSC_INSP_TYP.isPRDCT(r.insp_typ())) {
				MAM_LOC_R locR = _locCache.get(r.loc_cd());
				InspSchd_Srch01_CndR itmInspR = getItmInspR(r.peg_no());
				
				if (MAC_LOC_MNG_TYP.isSLS(locR.loc_mng_typ()) && !isNull(itmInspR) && itmInspR.plnt_aprv_flg()) {
					msgL.add(new MCMessage(r, null, MSBFL0085, toDispGUIIndex(r)));
					r.err_flg(true);
				}
			}
		}
		
		/**
		 * 検査関連のチェック処理
		 * @param r
		 */
		protected void chkInsp(InspSchd_Chk01_CndR r, MCList<MST_INSP_SCHD_R> schdL, MCMessageList msgL) {
			//製造、受入共通
			if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
				//製造の場合
				if (MSC_INSP_TYP.isPRDCT(r.insp_typ())) {
					msgL.add(new MCMessage(r, null, MSBFL0040, r.src_no3(), r.src_no4(), toDispGUIIndex(r)));
					r.err_flg(true);
					return;
				}
				//受入の場合
				else if (MSC_INSP_TYP.isACCPT(r.insp_typ())) {
					msgL.add(new MCMessage(r, null, MSBFL0120, r.src_no4(), toDispGUIIndex(r)));
					r.err_flg(true);
					return;
				}
			}
			
			//製造の場合
			if (MSC_INSP_TYP.isPRDCT(r.insp_typ())) {
				MST_INSP_SCHD_R schdR = schdL.get(0);
				
				//全数検査の場合、荷姿・数量の変更はできない。
				//※抜取と異なり、全数の場合は検査対象の数量は重要なので。
				//（荷姿を変えても基準単位数量が変わらなければ、
				//チェックをしないようにすべきかもしれないが、
				//現状は、検査指図後の荷姿変更に対応していないので、
				//荷姿を変更したい場合は、検査実績時に行ってもらう想定。）
				//※受入・製造検査の検査予定には、必ず検査方法区分が設定されており
				//かつ、受入・製造検査指図時には全数⇔抜取の変更ができない前提。
				if (MAC_INSP_MTD_TYP.isTTL(schdR.insp_mtd_typ())) {
					if (!isSame(schdR.pack_unit_cd(), r.pack_unit_cd())
							|| !isSame(schdR.base_unit_qty(), r.base_unit_qty())) {
						msgL.add(new MCMessage(r, null, MSBFL0041,
								r.src_no1(), r.src_no2(), r.src_no3(), r.src_no4(), toDispGUIIndex(r)));
						r.err_flg(true);
					}
				}
				
				//良品以外の変更は許さない。
				MAM_ITM_R itmR = _itmCache.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				if (isColSame(r, schdR,
						getLotCols(MAC_SUBLOT_MNG_TYP.isSTK(itmR.sublot_mng_typ())))
						&& !MAC_QUALITY_TYP.isGOOD(r.quality_typ()) && chkQualityType(r)) {
					msgL.add(new MCMessage(r, null, MSBFL0042,
							r.src_no1(), r.src_no2(), r.src_no3(), r.src_no4(), toDispGUIIndex(r)));
					r.err_flg(true);
				}
				
				
				//指図済の場合、ロットのキーを変更することはできない。
				//※ロットのキーの変更に対応していないので。
				//なお、ロットのキーは品管上重要な項目でサブロットのキーが変更された場合、
				//検査指図をしなおすべきなので、対応の必要もない。
				if (MAC_SUBLOT_MNG_TYP.isSTK(itmR.sublot_mng_typ())) {
					if (!r.getBooleanNE("has_same_schd_info_flg")
							&& isLotKeyExceptSublotChanged(r, schdR)) {
						msgL.add(new MCMessage(r, null, MSBFL0044,
								r.src_no1(), r.src_no2(), r.src_no3(), r.src_no4(), toDispGUIIndex(r)));
						r.err_flg(true);
					}
				}
				else {
					if (!r.getBooleanNE("has_same_schd_info_flg")
							&& isLotKeyChanged(r, schdR)) {
						msgL.add(new MCMessage(r, null, MSBFL0043,
								r.src_no1(), r.src_no2(), r.src_no3(), r.src_no4(), toDispGUIIndex(r)));
						r.err_flg(true);
					}
				}
				
				MST_INSP_ACT_R orgActR = getOrgInspActR(schdR.org_insp_schd_no());
				
				//検査実績登録済みの場合、格付を変更することはできない。
				//※格付の変更に対応していないので。
				//なお、判定が行われている場合は、検査の判定で入力した格付を優先すべきなので、
				//対応の必要もない。
				if (!isNull(orgActR.insp_act_no())) {
					if (isColSame(r, schdR,
							getLotCols(MAC_SUBLOT_MNG_TYP.isSTK(itmR.sublot_mng_typ())))
							&& !isSame(orgActR.getStringNE("org_schd_gd_cd"),
									r.gd_cd())) {
						msgL.add(new MCMessage(r, null, MSBFL0045,
								r.src_no1(), r.src_no2(), r.src_no3(), r.src_no4(), toDispGUIIndex(r)));
						r.err_flg(true);
					}
				}
				
				//検査実績登録済みの場合、荷姿を変更することはできない。
				if (!isSame(schdR.pack_unit_cd(), r.pack_unit_cd())) {
					if (!isNull(orgActR.insp_act_no())) {
						msgL.add(new MCMessage(r, null, MSBFL0046,
								r.src_no1(), r.src_no2(), r.src_no3(), r.src_no4(), toDispGUIIndex(r)));
						r.err_flg(true);
					}
				}
				
				MST_INSP_ACT_R actR = getInspActR(schdR.insp_no());
				if (!r.err_flg() && !isNull(actR.insp_act_no())) {
					r.call_insp_act_chk01_flg(true);
					
					if (isInspFin(actR)) {
						r.call_plnt_aprv_chk01_flg(true);
						r.insp_no(actR.insp_no());
					}
				}
			}
			//受入の場合
			else if (MSC_INSP_TYP.isACCPT(r.insp_typ())) {
				//受入の場合、製造ほど柔軟な実績変更
				//（場所、数量といった在庫の情報が変更された場合、
				//検査の受払いも作成しなおす仕様）
				//に対応していないので、検査指図済みの場合は、変更を許さない。
				msgL.add(new MCMessage(r, null, MSBFL0047, r.src_no4(), toDispGUIIndex(r)));
				r.err_flg(true);
			}
		}
		
		protected boolean chkQualityType(InspSchd_Chk01_CndR chkR) {
			// 自レコード以外の良品区分をチェックする。
			// このメソッドに入る時点で自レコードは良品ではない。
			// 自レコード以外もすべて良品でなければ、trueを返す。
			MCList<InspSchd_Chk01_CndR> chkList = up0().subList(new String[] {
					InspSchd_Chk01_CndR.$itm_cd, InspSchd_Chk01_CndR.$itm_sub1,
					InspSchd_Chk01_CndR.$itm_sub2, InspSchd_Chk01_CndR.$itm_sub3,
					InspSchd_Chk01_CndR.$src_no1, InspSchd_Chk01_CndR.$src_no2, InspSchd_Chk01_CndR.$src_no3,
					InspSchd_Chk01_CndR.$lot_no, InspSchd_Chk01_CndR.$sublot_no
			}, new String[] {
					chkR.itm_cd(), chkR.itm_sub1(), chkR.itm_sub2(), chkR.itm_sub3(),
					chkR.src_no1(), chkR.src_no2(), chkR.src_no3(),
					chkR.lot_no(), chkR.sublot_no()
			}).subList(r -> !r.peg_no().eq(chkR.peg_no()));

			if (isNull(chkList.subList(r -> MAC_QUALITY_TYP.isGOOD(r.quality_typ())))) {
				return true;
			}
			return false;
		}

		protected boolean isInspFin(MST_INSP_ACT_R actR) {
			if (MSC_INSP_STS_TYP.isJDG(actR.getStringNE("INSP_STS_TYP"))) {
				if (!isSame(actR.getStringNE("PLNT_APRV_FLG"), "1")) {
					return false;
				}
				
				if (!isNull(actR.getStringNE("INSP_APRV_STS_TYP")) &&
						(!MSC_INSP_APRV_STS_TYP.isJUDG_ACPT(actR.getStringNE("INSP_APRV_STS_TYP")) 
								|| !MSC_INSP_JUDG_RSLT_TYP.is_stk_good(actR.insp_judg_rslt_typ()))) {
					return false;
				}
				
				return true;
			}
			return false;
		}
		
		protected boolean isLotKeyChanged(InspSchd_Chk01_CndR r, MST_INSP_SCHD_R schdR) {
			if (!isSame(schdR.itm_cd(), r.itm_cd())) return true;
			if (!isSame(schdR.itm_sub1(), r.itm_sub1())) return true;
			if (!isSame(schdR.itm_sub2(), r.itm_sub2())) return true;
			if (!isSame(schdR.itm_sub3(), r.itm_sub3())) return true;
			if (!isSame(schdR.lot_no(), r.lot_no())) return true;
			if (!isSame(schdR.sublot_no(), r.sublot_no())) return true;
			return false;
		}
		
		protected boolean isLotKeyExceptSublotChanged(InspSchd_Chk01_CndR r, MST_INSP_SCHD_R schdR) {
			if (!isSame(schdR.itm_cd(), r.itm_cd())) return true;
			if (!isSame(schdR.itm_sub1(), r.itm_sub1())) return true;
			if (!isSame(schdR.itm_sub2(), r.itm_sub2())) return true;
			if (!isSame(schdR.itm_sub3(), r.itm_sub3())) return true;
			if (!isSame(schdR.lot_no(), r.lot_no())) return true;
			return false;
		}
		
		/**
		 * 指定された初回検査予定ＮＯを持つ検査実績を取得する。
		 */
		

		protected MST_INSP_ACT_R getOrgInspActR(String orgInspSchdNo) {
			MST_INSP_ACT_R actR = MST_INSP_ACT_R.create();
			MST_INSP_ACT_R t = MST_INSP_ACT_R.create("T");
			MCQueryApiBuilder actR_bldr = MCQueryApiBuilder.create(t);
			MST_INSP_SCHD_R t2 = MST_INSP_SCHD_R.create("T2");

			actR_bldr.addSelect(t2.gd_cd.as("org_schd_gd_cd"));
			actR_bldr.addLeftOuterJoin(t2, t.insp_no.eq(t2.insp_no));
			actR_bldr.setWhere(t2.insp_schd_no.eq(bind("1")), orgInspSchdNo);
			dbSelect("MSBFL5010_MST_INSP_ACT_S01", actR, actR_bldr);
			return actR;
		}
		
		/**
		 * 検査実績を取得する。
		 */
		protected MST_INSP_ACT_R getInspActR(String inspNo) {
			MST_INSP_ACT_R actR = MST_INSP_ACT_R.create();
			MST_INSP_ACT_R t = MST_INSP_ACT_R.create("T");
			MCQueryApiBuilder actR_bldr = MCQueryApiBuilder.create(t);
			MST_INSP_INST_R t2 = MST_INSP_INST_R.create("T2");
			
			actR_bldr.addSelect(t2.plnt_aprv_flg);
			actR_bldr.addSelect(t2.insp_sts_typ);
			actR_bldr.addSelect(t2.insp_aprv_sts_typ);
			actR_bldr.addLeftOuterJoin(t2, t.insp_no.eq(t2.insp_no));
			actR_bldr.setWhere(t.insp_no.eq(bind("1")), inspNo);
			dbSelect("MSBFL5010_MST_INSP_ACT_S02", actR, actR_bldr);
			return actR;
		}

		/**
		 * 工場出荷承認関連のチェック処理
		 * @param r
		 */
		protected void chkSoAprv(InspSchd_Chk01_CndR r, MCMessageList msgL) {
			if (!r.skip_chk_plnt_aprv_flg()) {
				//工場出荷承認or却下済みの場合、製造の検査実績のように柔軟な実績変更に
				//対応していないので、変更を許さない。
				//また、工場出荷承認は、製造完了していないとできない仕様なので、
				//完了の取消を防ぐため、変更を許さない。
				if (isPlntAprved(r)) {
					msgL.add(new MCMessage(r, null, MSBFL0048, toDispGUIIndex(r)));
					r.err_flg(true);
				}
			}
		}
		
		/**
		 * 工場出荷承認、却下が行われたかどうかを返す。
		 * @param r
		 * @return
		 */
		protected boolean isPlntAprved(InspSchd_Chk01_CndR r) {
			MST_PLNT_APRV_D_R aprvDR = MST_PLNT_APRV_D_R.create();
			MST_PLNT_APRV_D_R t = MST_PLNT_APRV_D_R.create("T");
			MCQueryApiBuilder aprvDR_bldr = MCQueryApiBuilder.create(t);
			MST_PLNT_APRV_R t2 = MST_PLNT_APRV_R.create("T2");
			aprvDR.addNumberColumn("cnt");
			aprvDR_bldr.setSelect(nvl( count(value("X")), value(0)).as("cnt"));
			aprvDR_bldr.addInnerJoin(t2, bracket(t.plnt_aprv_no.eq(t2.plnt_aprv_no)));
			aprvDR_bldr.setWhere(t.insp_typ.eq(bind("1")), r.insp_typ());
			aprvDR_bldr.addWhereWithAnd(t.src_no4.eq(bind("1")), r.src_no4());
			aprvDR_bldr.addWhereWithAnd(t2.plnt_aprv_sts_typ.in( bind("1"), bind("2")),
					MSC_PLNT_APRV_STS_TYP.ACPT.value(), MSC_PLNT_APRV_STS_TYP.RJCT.value());

			dbSelect("MSBFL5010_MST_PLNT_APRV_D_S01", aprvDR, aprvDR_bldr, r);
			
			return !aprvDR.getNumberNE("cnt").isZero();
		}
		
		protected void callPlntAprvChk01(MCList<InspSchd_Chk01_CndR> up0L) {
			MSBFL_PlntAprvService.PlntAprv_Chk01 o = MSBFL_PlntAprvService.crtPlntAprv_Chk01();
			
			for (InspSchd_Chk01_CndR r : up0L) {
				if (!r.call_plnt_aprv_chk01_flg()) {
					continue;
				}
				PlntAprv_Chk01_RsltR oInsR = PlntAprv_Chk01_RsltR.create();
				
				oInsR.peg_no(r.peg_no());
				oInsR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				oInsR.insp_typ(r.insp_typ());
				oInsR.insp_no(r.insp_no());
				oInsR.src_no1(r.src_no1());
				oInsR.src_no2(r.src_no2());
				oInsR.src_no3(r.src_no3());
				oInsR.src_no4(r.src_no4());
				oInsR.itm_cd(r.itm_cd());
				oInsR.itm_sub1(r.itm_sub1());
				oInsR.itm_sub2(r.itm_sub2());
				oInsR.itm_sub3(r.itm_sub3());
				oInsR.lot_no(r.lot_no());
				oInsR.sublot_no(r.sublot_no());
				oInsR.loc_cd(r.loc_cd());
				oInsR.setAttributes(r);
				
				MCList<MST_PLNT_APRV_D_R> delL = MCList.create(MST_PLNT_APRV_D_R.class);
				MST_PLNT_APRV_D_R t = MST_PLNT_APRV_D_R.create("T");
				MCQueryApiBuilder delL_bldr = MCQueryApiBuilder.create(t);
				delL_bldr.setSelect(t.plnt_aprv_d_no);
				delL_bldr.addSelect(t.plnt_aprv_no);
				delL_bldr.setWhere(t.insp_no.eq(bind("1")), r.insp_no());
				dbSelect("MSBFL5010_MST_PLNT_APRV_D_S02", delL, delL_bldr, r);
				
				for (MST_PLNT_APRV_D_R delR : delL) {
					PlntAprv_Chk01_RsltR oDelR = PlntAprv_Chk01_RsltR.create();
					
					oDelR.peg_no(r.peg_no());
					oDelR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					oDelR.plnt_aprv_no(delR.plnt_aprv_no());
					oDelR.plnt_aprv_d_no(delR.plnt_aprv_d_no());
					oDelR.loc_cd(r.loc_cd());
					oDelR.setAttributes(r);
					
					o.up0().add(oDelR);
				}
				
				o.up0().add(oInsR);
			}
			
			if (!o.up0().isEmpty()) {
				o.exec();
				copyErrFlg(up0L, o.down0());
			}
		}
	}
	
	/**
	 * InspSchd_Chk02オペレーション.<p>
	 *
	 * 製造承認関連処理前に検査関連データのチェックを行う。<br>
	 */
	public class InspSchd_Chk02 extends MSBFL_InspSchdService_MC_A.InspSchd_Chk02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(checkMain());
			MCMessagePool.addAll(msgL);

			// 下り電文設定
			setDown();
		}
		
		protected void setDown() {
			down0().setAll(up0());
		}
		
		protected MCMessageList checkMain() {
			MCMessageList msgL = new MCMessageList();
			
			MCList<MST_INSP_SCHD_R> schdL = getInspSchd(up0());
			MCIndexKey idx = schdL.createIndex(MST_INSP_SCHD_R.$src_no1);
			
			for (InspSchd_Chk02_CndR up0R : up0()) {
				MCList<MST_INSP_SCHD_R> subSchdL = schdL.subList(idx, up0R.mfg_inst_no());
				
				if (subSchdL.isEmpty()) {
					continue;
				}
				
				// 製造指図承認された場合の処理
				if (MSC_MFG_APRV_STS_TYP.isINST_ACPT(up0R.mfg_aprv_sts_typ())) {
					// 品管関連マスタが存在するかチェックする。
					chkMamInsp(up0R, subSchdL, msgL);
				}
				// 製造指図承認取消された場合の処理
				else if (MSC_MFG_APRV_STS_TYP.isINST_OPN(up0R.mfg_aprv_sts_typ())) {
					// 検査指図されているかどうかをチェックする。
					chkInspSchdSts(up0R, subSchdL, msgL);
				}
				// 製造記録承認取消された場合の処理
				else if (MSC_MFG_APRV_STS_TYP.isACT_OPN(up0R.mfg_aprv_sts_typ())) {
					// 工場出荷承認済でないかをチェックする。
					chkPlntAprv(up0R, msgL);
				}
			}
			
			return msgL;
		}
		
		protected void chkMamInsp(InspSchd_Chk02_CndR up0R, MCList<MST_INSP_SCHD_R> schdL,
				MCMessageList msgL) {

			mcframe.serverMSBF.MSBFL5010.MSBFL_InspSchdService.InspSchd_Srch01 o = mcframe.serverMSBF.MSBFL5010.MSBFL_InspSchdService
					.crtInspSchd_Srch01();

			InspSchd_Srch01_CndR oR = InspSchd_Srch01_CndR.create();
			MST_INSP_SCHD_R schdR = schdL.get(0);

			oR.peg_no(up0R.peg_no());
			oR.itm_cd(schdR.itm_cd());
			oR.itm_sub1(schdR.itm_sub1());
			oR.itm_sub2(schdR.itm_sub2());
			oR.itm_sub3(schdR.itm_sub3());
			oR.mfg_loc_cd(schdR.mfg_loc_cd());
			oR.sppl_cd(schdR.sppl_cd());
			oR.maker_cd(schdR.maker_cd());
			oR.from_site_cd(null);
			oR.to_loc_cd(schdR.loc_cd());
			oR.insp_typ(schdR.insp_typ());
			oR.base_dt(schdR.master_dt());
			oR.insp_ptn_cd(null);
			oR.no_insp_srch_flg(false);
			o.up0().add(oR);

			o.exec();

			if (o.down0().isEmpty()) {
				msgL.add(new MCMessage(up0R, null, MSBFL0140, up0R.mfg_inst_no(),
						toDispGUIIndex(up0R)));
				up0R.err_flg(true);
			}
		}
		
		/**
		 * 製造指図ＮＯに紐づく検査予定を取得
		 */
		protected MCList<MST_INSP_SCHD_R> getInspSchd(MCList<InspSchd_Chk02_CndR> up0L) {
			MCList<MST_INSP_SCHD_R> ret = MCList.create(MST_INSP_SCHD_R.class);
			MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder ret_bldr = MCQueryApiBuilder.create(t);
			ret_bldr.setWhere(t.insp_typ.eq(bind("1")), MSC_INSP_TYP.PRDCT.value());
			ret_bldr.addWhereWithAnd(t.insp_freq.eq(value(1)));
			ret_bldr.addWhereWithAnd(t.src_no1.eq(bind("mfg_inst_no")));
			ret_bldr.setOrderByAsc(t.insp_schd_no);
			dbSelect("MSBFL5010_MST_INSP_SCHD_S03", ret, ret_bldr, up0L);
			return ret;
		}
		
		/**
		 * 検査指図チェック
		 */
		protected void chkInspSchdSts(InspSchd_Chk02_CndR up0R, MCList<MST_INSP_SCHD_R> schdL, MCMessageList msgL) {
			for (MST_INSP_SCHD_R schdR : schdL) {
				// 指図済みの検査予定が存在したら指図承認取消不可
				if (MSC_INSP_STS_TYP.isORD(schdR.insp_schd_sts_typ())) {
					msgL.add(new MCMessage(up0R, null, MSBFL0049, up0R.mfg_inst_no(), toDispGUIIndex(up0R)));
					up0R.err_flg(true);
					return;
				}
			}
		}
		
		/**
		 * 工場出荷承認チェック
		 */

		protected void chkPlntAprv(InspSchd_Chk02_CndR up0R, MCMessageList msgL) {
			MCList<MST_PLNT_APRV_R> aprvL = MCList.create(MST_PLNT_APRV_R.class);
			MST_PLNT_APRV_R t = MST_PLNT_APRV_R.create("T");
			MCQueryApiBuilder aprvL_bldr = MCQueryApiBuilder.create(t);
			MST_PLNT_APRV_D_R w1 = MST_PLNT_APRV_D_R.create("W1");
			aprvL_bldr.setSelect(t.plnt_aprv_sts_typ);
			aprvL_bldr.addInnerJoin(w1, t.plnt_aprv_no.eq(w1.plnt_aprv_no));
			aprvL_bldr.setWhere(w1.insp_typ.eq(bind("1")), MSC_INSP_TYP.PRDCT.value());
			aprvL_bldr.addWhereWithAnd(w1.src_no1.eq(bind("1")), up0R.mfg_inst_no());
			aprvL_bldr.setOrderByAsc(t.plnt_aprv_no);
			dbSelect("MSBFL5010_MST_PLNT_APRV_S01", aprvL, aprvL_bldr);

			for (MST_PLNT_APRV_R aprvR : aprvL) {
				// 承認、却下の工場出荷承認ヘッダが存在したら記録承認取消不可
				if (MSC_PLNT_APRV_STS_TYP.isACPT(aprvR.plnt_aprv_sts_typ())
						|| MSC_PLNT_APRV_STS_TYP.isRJCT(aprvR.plnt_aprv_sts_typ())) {
					msgL.add(new MCMessage(up0R, null, MSBFL0050, up0R.mfg_inst_no(),
							toDispGUIIndex(up0R)));
					up0R.err_flg(true);
					return;
				}
			}
		}
	}
	/**
	 * InspSchd_Srch01オペレーション.<p>
	 *
	 *　品管に関連するマスタ値（品目品管マスタ、品目検査パタンマスタ、品目マスタ（工場・物流倉庫））を取得する。<br>
	 */
	public class InspSchd_Srch01 extends MSBFL_InspSchdService_MC_A.InspSchd_Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			getItmInsp();
			setDown();
		}
		
		protected void setDown() {
			for (InspSchd_Srch01_CndR up0R : up0()) {
				if (MSC_INSP_TYP.isACCPT(up0R.insp_typ())) {
					setDownAccpt(up0R);
				}
				else if (MSC_INSP_TYP.isPRDCT(up0R.insp_typ())) {
					setDownPrdct(up0R);
				}
				else if (MSC_INSP_TYP.isPRCD(up0R.insp_typ())) {
					setDownPrcd(up0R);
				}
				else {
					setDownLot(up0R);
				}
				
				// 全数検査の場合は下り電文の検査中ロット使用許可フラグにオフを設定する
				if (MAC_INSP_MTD_TYP.isTTL(up0R.insp_mtd_typ())) {
					up0R.in_prmt_insp_flg(false);
				}
				if (up0R.exists_mstr_flg()) {
					down0().add(up0R);
				}
			}
		}
		
		protected void setDownAccpt(InspSchd_Srch01_CndR r) {
			MCList<MAM_ITM_INSP_R> itmInspL = MCList.create(MAM_ITM_INSP_R.class);
			if (!isNull(r.base_dt())) {
				itmInspL = getItmInspSubL(r);
			}
			else {
				itmInspL = getItmInspSubL2(r);
			}
			MCIndexKey idx = itmInspL.createIndex(MAM_ITM_INSP_R.$mfg_loc_cd,
					MAM_ITM_INSP_R.$sppl_cd, MAM_ITM_INSP_R.$maker_cd,
					MAM_ITM_INSP_R.$from_site_cd, MAM_ITM_INSP_R.$to_site_cd);

			MAM_ITM_INSP_R itmInspR = null;
			MAM_ITM_INSP_PTN_R itmInspPtnR = null;
			
			// 品目品管マスタから発注先ＣＤとメーカＣＤが一致するレコードを取得する
			itmInspR = itmInspL.getFirst(idx, MAC_STR.NULL_VAL.value(), r.sppl_cd(),
					r.maker_cd(), MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value());
			if (!isNull(itmInspR)) {
				itmInspPtnR = getItmInspPtn(r, itmInspR);
				setDownR(r, itmInspR, itmInspPtnR);
				return;
			}
			
			// 品目品管マスタから発注先が一致するレコードを取得する
			itmInspR = itmInspL.getFirst(idx, MAC_STR.NULL_VAL.value(), r.sppl_cd(),
					MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value());
			
			if (!isNull(itmInspR)) {
				itmInspPtnR = getItmInspPtn(r, itmInspR);
				setDownR(r, itmInspR, itmInspPtnR);
				return;
			}
			
			// 品目品管マスタから工場・物流倉庫が一致するレコードを取得する
			itmInspR = itmInspL.getFirst(idx, MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(),
					MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(), r.to_site_cd());
			
			if (!isNull(itmInspR)) {
				itmInspPtnR = getItmInspPtn(r, itmInspR);
				setDownR(r, itmInspR, itmInspPtnR);
				return;
			}
			
			// 品目品管マスタから主キーがＮＵＬＬ文字のレコードを取得する
			itmInspR = itmInspL.getFirst(idx, MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(),
					MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value());
			
			if (!isNull(itmInspR)) {
				itmInspPtnR = getItmInspPtn(r, itmInspR);
				setDownR(r, itmInspR, itmInspPtnR);
				return;
			}
		}
		
		protected void setDownPrdct(InspSchd_Srch01_CndR r) {
			MCList<MAM_ITM_INSP_R> itmInspL = MCList.create(MAM_ITM_INSP_R.class);
			if (!isNull(r.base_dt())) {
				itmInspL = getItmInspSubL(r);
			}
			else {
				itmInspL = getItmInspSubL2(r);
			}
			MCIndexKey idx = itmInspL.createIndex(MAM_ITM_INSP_R.$mfg_loc_cd,
					MAM_ITM_INSP_R.$sppl_cd, MAM_ITM_INSP_R.$maker_cd,
					MAM_ITM_INSP_R.$from_site_cd, MAM_ITM_INSP_R.$to_site_cd);
			
			MAM_ITM_INSP_R itmInspR = null;
			MAM_ITM_INSP_PTN_R itmInspPtnR = null;
			
			// 品目品管マスタから製造場所が一致するレコードを取得する
			itmInspR = itmInspL.getFirst(idx, r.mfg_loc_cd(), MAC_STR.NULL_VAL.value(),
					MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value());
			if (!isNull(itmInspR)) {
				itmInspPtnR = getItmInspPtn(r, itmInspR);
				setDownR(r, itmInspR, itmInspPtnR);
				return;
			}
			
			// 品目品管マスタから工場・物流倉庫が一致するレコードを取得する
			itmInspR = itmInspL.getFirst(idx, MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(),
					MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(), r.to_site_cd());
			
			if (!isNull(itmInspR)) {
				itmInspPtnR = getItmInspPtn(r, itmInspR);
				setDownR(r, itmInspR, itmInspPtnR);
				return;
			}
			
			// 品目品管マスタから主キーがＮＵＬＬ文字のレコードを取得する
			itmInspR = itmInspL.getFirst(idx, MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(),
					MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value());
			
			if (!isNull(itmInspR)) {
				itmInspPtnR = getItmInspPtn(r, itmInspR);
				setDownR(r, itmInspR, itmInspPtnR);
				return;
			}
		}
		
		protected void setDownPrcd(InspSchd_Srch01_CndR r) {
			// 先行検査の場合、品目品管マスタの取得ロジックは受入検査と同じである。
			setDownAccpt(r);
		}
		
		protected void setDownLot(InspSchd_Srch01_CndR r) {
			MCList<MAM_ITM_INSP_R> itmInspL = MCList.create(MAM_ITM_INSP_R.class);
			if (!isNull(r.base_dt())) {
				itmInspL = getItmInspSubL(r);
			}
			else {
				itmInspL = getItmInspSubL2(r);
			}
			MCIndexKey idx = itmInspL.createIndex(MAM_ITM_INSP_R.$mfg_loc_cd,
					MAM_ITM_INSP_R.$sppl_cd, MAM_ITM_INSP_R.$maker_cd,
					MAM_ITM_INSP_R.$from_site_cd, MAM_ITM_INSP_R.$to_site_cd);
			
			MAM_ITM_INSP_R itmInspR = null;
			MAM_ITM_INSP_PTN_R itmInspPtnR = null;
			
			// 品目品管マスタから工場・物流倉庫が一致するレコードを取得する
			itmInspR = itmInspL.getFirst(idx, MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(),
					MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(), r.to_site_cd());
			
			if (!isNull(itmInspR)) {
				itmInspPtnR = getItmInspPtn(r, itmInspR);
				setDownR(r, itmInspR, itmInspPtnR);
				return;
			}

			// 品目品管マスタから主キーがＮＵＬＬ文字のレコードを取得する
			itmInspR = itmInspL.getFirst(idx, MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(),
					MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value());
			
			if (!isNull(itmInspR)) {
				itmInspPtnR = getItmInspPtn(r, itmInspR);
				setDownR(r, itmInspR, itmInspPtnR);
				return;
			}
		}
		
		protected MAM_ITM_INSP_PTN_R getItmInspPtn(InspSchd_Srch01_CndR r, MAM_ITM_INSP_R itmInspR) {
		// 上り電文の検査パタンＣＤがNULLでなかったら品目検査パタンマスタから取得する
			if (!isNull(r.insp_ptn_cd())) {
				return _itmInspPtnL.get(nvl(r.base_dt(), itmInspR.getDateNE("strg_schd_dt")), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.insp_ptn_cd());
			}
			return null;
		}

		
		protected void setDownR(InspSchd_Srch01_CndR r, MAM_ITM_INSP_R iiR, MAM_ITM_INSP_PTN_R iipR) {
			// 検査対象外を取得しない場合はreturn
			if (!up0().get(0).no_insp_srch_flg()) {
				if (iiR.no_insp_flg()) {
					return;
				}
			}
			if (!isNull(r.insp_ptn_cd())) {
				if (isNull(iipR)) {
					return;
				}
				r.insp_mtd_typ(iipR.insp_mtd_typ());
				r.insp_lt(iipR.insp_lt());
				r.insp_std_no(iipR.insp_std_no());
				r.spl_qty(iipR.spl_qty());
				r.std_req_flg(iipR.std_req_flg());
				r.std_cnf_req_flg(iipR.std_cnf_req_flg());
			}
			else {
				r.insp_ptn_cd(iiR.insp_ptn_cd());
				r.insp_mtd_typ(iiR.getStringNE("INSP_MTD_TYP"));
				r.insp_lt(iiR.getNumberNE("INSP_LT"));
				r.insp_std_no(iiR.getStringNE("INSP_STD_NO"));
				r.spl_qty(iiR.getNumberNE("SPL_QTY"));
				r.std_req_flg(isSame(iiR.getStringNE("STD_REQ_FLG"), "1"));
				r.std_cnf_req_flg(isSame(iiR.getStringNE("STD_CNF_REQ_FLG"), "1"));
			}
			r.no_mrkt_judg_flg(iiR.no_mrkt_judg_flg());
			r.lmt_dt_frm_typ(iiR.lmt_dt_frm_typ());
			r.vld_pd(iiR.vld_pd());
			r.lmt_pd(iiR.lmt_pd());
			r.lot_insp_vld_pd(iiR.lot_insp_vld_pd());
			r.calc_pd_typ(iiR.calc_pd_typ());
			r.lot_insp_lmt_dt_frm_typ(iiR.lot_insp_lmt_dt_frm_typ());
			r.insp_inst_issue_typ(iiR.insp_inst_issue_typ());
			r.insp_offst(iiR.insp_offst());
			r.inst_rslt_issue_flg(iiR.inst_rslt_issue_flg());
			r.pre_insp_valid_flg(iiR.pre_insp_valid_flg());
			r.no_insp_flg(iiR.no_insp_flg());
			if (iiR.no_plnt_aprv_flg()) {
				r.plnt_aprv_flg(false);
				r.plnt_aprv_role_cd(null);
			}
			else {
				r.plnt_aprv_flg(isSame(iiR.getStringNE("PLNT_APRV_FLG"), "1"));
				r.plnt_aprv_role_cd(iiR.getStringNE("PLNT_APRV_ROLE_CD"));
			}
			if (iiR.no_insp_aprv_flg()) {
				r.insp_aprv_flg(false);
				r.insp_aprv_role_cd(null);
			}
			else {
				r.insp_aprv_flg(isSame(iiR.getStringNE("INSP_APRV_FLG"), "1"));
				r.insp_aprv_role_cd(iiR.getStringNE("INSP_APRV_ROLE_CD"));
			}
			r.so_prmt_insp_flg(isSame(iiR.getStringNE("SO_PRMT_INSP_FLG"), "1"));
			r.in_prmt_insp_flg(isSame(iiR.getStringNE("IN_PRMT_INSP_FLG"), "1"));
			r.insp_bind_typ(iiR.getStringNE("INSP_BIND_TYP"));
			r.skip_chk_ship_flg(isSame(iiR.getStringNE("SKIP_CHK_SHIP_FLG"), "1"));
			r.mrkt_judg_flg(isSame(iiR.getStringNE("MRKT_JUDG_FLG"), "1"));
			r.mrkt_judg_role_cd(iiR.getStringNE("MRKT_JUDG_ROLE_CD"));
			r.lmt_ctl_flg(isSame(iiR.getBooleanNE("LMT_CTL_FLG"), true));
			r.lmt_ctl_categ(iiR.getStringNE("LMT_CTL_CATEG"));
			r.exists_mstr_flg(true);
			r.strg_schd_dt(nvl(iiR.getDateNE("strg_schd_dt"), r.base_dt()));
		}
		
		MCList<MAM_ITM_INSP_R> _itmInspL = MCList.create(MAM_ITM_INSP_R.class);
		
		MCIndexKey _idx;
		
		protected FXUCL_MCDbcCacheStEnd<MAM_ITM_INSP_PTN_R> _itmInspPtnL;
		protected void getItmInsp() {
			setSite();
			insItmInspKey();
			doMasterCache();
			MCList<MAM_ITM_INSP_R> itmInspL = MCList.create(MAM_ITM_INSP_R.class);
			MAM_ITM_INSP_R t = MAM_ITM_INSP_R.create("T");
			MCQueryApiBuilder itmInspL_bldr = MCQueryApiBuilder.create(t);
			if (!isNull(up0()) && isNull(up0().get(0).base_dt())) {
				getSql2(t, itmInspL_bldr);
			}
			else {
				getSql(t, itmInspL_bldr);
			}
			dbSelect("MSBFL5010_MAM_ITM_INSP_S01", itmInspL, itmInspL_bldr);
			
			_itmInspL.setAll(itmInspL);
			_idx = _itmInspL.createIndex(MAM_ITM_INSP_R.$itm_cd, MAM_ITM_INSP_R.$itm_sub1,
					MAM_ITM_INSP_R.$itm_sub2, MAM_ITM_INSP_R.$itm_sub3, "ITM_SITE_SITE_CD");
		}

		
		protected void setSite() {
			MCList<MAM_LOC_R> locL = MCList.create(MAM_LOC_R.class);
			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder locL_bldr = MCQueryApiBuilder.create(t);

			locL_bldr.setSelect(t.loc_cd);
			locL_bldr.addSelect(t.site_cd);
			locL_bldr.setWhere(t.loc_cd.eq(bind("to_loc_cd")));

			dbSelect("MSBFL5010_MAM_LOC_S01", locL, locL_bldr, up0());

			MCIndexKey idx = locL.createIndex(MAM_LOC_R.$loc_cd);
			for (InspSchd_Srch01_CndR up0R : up0()) {
				MAM_LOC_R locR = locL.getFirst(idx, up0R.to_loc_cd());
				if (isNull(locR)) {
					continue;
				}
				if (isNull(up0R.to_site_cd()) && !isNull(locR)) {
					up0R.to_site_cd(locR.site_cd());
				}
			}
		}
		
		

		protected void getSql(MAM_ITM_INSP_R t, MCQueryApiBuilder itmInspL_bldr) {
			MAM_ITM_R m3 = MAM_ITM_R.create("M3");
			MAW_ITM_INSP_KEY_R w1 = MAW_ITM_INSP_KEY_R.create("W1");
			MAM_ITM_INSP_PTN_R m2 = MAM_ITM_INSP_PTN_R.create("M2");
			MAM_ITM_SITE_R m9 = MAM_ITM_SITE_R.create("M9");

			itmInspL_bldr.addSelect(nvl(m9.site_cd, w1.to_site_cd).as("itm_site_site_cd"));
			itmInspL_bldr.addSelect(m9.plnt_aprv_flg);
			itmInspL_bldr.addSelect(m9.plnt_aprv_role_cd);
			itmInspL_bldr.addSelect(m9.insp_aprv_flg);
			itmInspL_bldr.addSelect(m9.insp_aprv_role_cd);
			itmInspL_bldr.addSelect(m9.so_prmt_insp_flg);
			itmInspL_bldr.addSelect(m9.in_prmt_insp_flg);
			itmInspL_bldr.addSelect(m3.insp_bind_typ);
			itmInspL_bldr.addSelect(m3.skip_chk_ship_flg);
			itmInspL_bldr.addSelect(m3.mrkt_judg_flg);
			itmInspL_bldr.addSelect(m3.mrkt_judg_role_cd);
			itmInspL_bldr.addSelect(m3.lmt_ctl_flg);
			itmInspL_bldr.addSelect(m3.lmt_ctl_categ);
			itmInspL_bldr.addSelect(m2.st_dt.as("insp_ptn_st_dt"));
			itmInspL_bldr.addSelect(m2.end_dt.as("insp_ptn_end_dt"));
			itmInspL_bldr.addSelect(m2.insp_mtd_typ);
			itmInspL_bldr.addSelect(m2.insp_lt);
			itmInspL_bldr.addSelect(m2.insp_std_no);
			itmInspL_bldr.addSelect(m2.spl_qty);
			itmInspL_bldr.addSelect(m2.std_req_flg);
			itmInspL_bldr.addSelect(m2.std_cnf_req_flg);

			itmInspL_bldr.addLeftOuterJoin(m3,bracket(t.itm_cd.eq(m3.itm_cd)
					.and(t.itm_sub1.eq(m3.itm_sub1))
					.and(t.itm_sub2.eq(m3.itm_sub2))
					.and(t.itm_sub3.eq(m3.itm_sub3))));
			itmInspL_bldr.addInnerJoin(w1, bracket(t.itm_cd.eq(w1.itm_cd)
					.and(t.itm_sub1.eq(w1.itm_sub1))
					.and(t.itm_sub2.eq(w1.itm_sub2))
					.and(t.itm_sub3.eq(w1.itm_sub3))
					.and(t.mfg_loc_cd.eq(w1.mfg_loc_cd)
							.or(t.mfg_loc_cd.eq(value(MAC_STR.NULL_VAL.value()))))
					.and(t.sppl_cd.eq(w1.sppl_cd)
							.or(t.sppl_cd.eq(value(MAC_STR.NULL_VAL.value()))))
					.and(t.maker_cd.eq(w1.maker_cd)
							.or(t.maker_cd.eq(value(MAC_STR.NULL_VAL.value()))))
					.and(t.from_site_cd.eq(w1.from_site_cd)
							.or(t.from_site_cd.eq(value(MAC_STR.NULL_VAL.value()))))
					.and(t.to_site_cd.eq(w1.to_site_cd)
							.or(t.to_site_cd.eq(value(MAC_STR.NULL_VAL.value()))))
					.and(w1.st_dt.between(t.st_dt, t.end_dt))));
			itmInspL_bldr.addLeftOuterJoin(m2, bracket(t.itm_cd.eq(m2.itm_cd)
					.and(t.itm_sub1.eq(m2.itm_sub1))
					.and(t.itm_sub2.eq(m2.itm_sub2))
					.and(t.itm_sub3.eq(m2.itm_sub3))
					.and(t.insp_ptn_cd.eq(m2.insp_ptn_cd))
					.and(w1.st_dt.between(m2.st_dt, m2.end_dt))));
			itmInspL_bldr.addLeftOuterJoin(m9, bracket(w1.itm_cd.eq(m9.itm_cd)
					.and(w1.itm_sub1.eq(m9.itm_sub1))
					.and(w1.itm_sub2.eq(m9.itm_sub2))
					.and(w1.itm_sub3.eq(m9.itm_sub3))
					.and(w1.to_site_cd.eq(m9.site_cd))));
			itmInspL_bldr.setWhere(t.no_insp_flg.eq(value(true))
					.or(t.no_insp_flg.eq(value(false))
							.and(m2.insp_ptn_cd.isNotNull())));
			itmInspL_bldr.addWhereWithAnd(t.del_flg.eq(value(false)));

		}

		protected void getSql2(MAM_ITM_INSP_R t, MCQueryApiBuilder itmInspL_bldr) {
			MAM_ITM_R m3 = MAM_ITM_R.create("M3");
			MAW_ITM_INSP_KEY_R w1 = MAW_ITM_INSP_KEY_R.create("W1");
			MAM_ITM_INSP_PTN_R m2 = MAM_ITM_INSP_PTN_R.create("M2");
			MAM_ITM_SITE_R m9 = MAM_ITM_SITE_R.create("M9");

			itmInspL_bldr.addSelect(nvl(m9.site_cd, w1.to_site_cd).as("itm_site_site_cd"));
			itmInspL_bldr.addSelect(m9.plnt_aprv_flg);
			itmInspL_bldr.addSelect(m9.plnt_aprv_role_cd);
			itmInspL_bldr.addSelect(m9.insp_aprv_flg);
			itmInspL_bldr.addSelect(m9.insp_aprv_role_cd);
			itmInspL_bldr.addSelect(m9.so_prmt_insp_flg);
			itmInspL_bldr.addSelect(m9.in_prmt_insp_flg);
			itmInspL_bldr.addSelect(m3.insp_bind_typ);
			itmInspL_bldr.addSelect(m3.skip_chk_ship_flg);
			itmInspL_bldr.addSelect(m3.mrkt_judg_flg);
			itmInspL_bldr.addSelect(m3.mrkt_judg_role_cd);
			itmInspL_bldr.addSelect(m3.lmt_ctl_flg);
			itmInspL_bldr.addSelect(m3.lmt_ctl_categ);
			itmInspL_bldr.addSelect(m2.st_dt.as("insp_ptn_st_dt"));
			itmInspL_bldr.addSelect(m2.end_dt.as("insp_ptn_end_dt"));
			itmInspL_bldr.addSelect(m2.insp_mtd_typ);
			itmInspL_bldr.addSelect(m2.insp_lt);
			itmInspL_bldr.addSelect(m2.insp_std_no);
			itmInspL_bldr.addSelect(m2.spl_qty);
			itmInspL_bldr.addSelect(m2.std_req_flg);
			itmInspL_bldr.addSelect(m2.std_cnf_req_flg);

			itmInspL_bldr.addLeftOuterJoin(m3,bracket(t.itm_cd.eq(m3.itm_cd)
					.and(t.itm_sub1.eq(m3.itm_sub1))
					.and(t.itm_sub2.eq(m3.itm_sub2))
					.and(t.itm_sub3.eq(m3.itm_sub3))));
			itmInspL_bldr.addInnerJoin(w1, bracket(t.itm_cd.eq(w1.itm_cd)
					.and(t.itm_sub1.eq(w1.itm_sub1))
					.and(t.itm_sub2.eq(w1.itm_sub2))
					.and(t.itm_sub3.eq(w1.itm_sub3))
					.and(t.mfg_loc_cd.eq(w1.mfg_loc_cd)
							.or(t.mfg_loc_cd.eq(value(MAC_STR.NULL_VAL.value()))))
					.and(t.sppl_cd.eq(w1.sppl_cd)
							.or(t.sppl_cd.eq(value(MAC_STR.NULL_VAL.value()))))
					.and(t.maker_cd.eq(w1.maker_cd)
							.or(t.maker_cd.eq(value(MAC_STR.NULL_VAL.value()))))
					.and(t.from_site_cd.eq(w1.from_site_cd)
							.or(t.from_site_cd.eq(value(MAC_STR.NULL_VAL.value()))))
					.and(t.to_site_cd.eq(w1.to_site_cd)
							.or(t.to_site_cd.eq(value(MAC_STR.NULL_VAL.value()))))));
			itmInspL_bldr.addLeftOuterJoin(m2,bracket(t.itm_cd.eq(m2.itm_cd)
					.and(t.itm_sub1.eq(m2.itm_sub1))
					.and(t.itm_sub2.eq(m2.itm_sub2))
					.and(t.itm_sub3.eq(m2.itm_sub3))
					.and(t.insp_ptn_cd.eq(m2.insp_ptn_cd))));
			itmInspL_bldr.addLeftOuterJoin(m9, bracket(w1.itm_cd.eq(m9.itm_cd)
					.and(w1.itm_sub1.eq(m9.itm_sub1))
					.and(w1.itm_sub2.eq(m9.itm_sub2))
					.and(w1.itm_sub3.eq(m9.itm_sub3))
					.and(w1.to_site_cd.eq(m9.site_cd))));
			itmInspL_bldr.setWhere(t.no_insp_flg.eq(value(true))
					.or(t.no_insp_flg.eq(value(false))
							.and(m2.insp_ptn_cd.isNotNull())));
			itmInspL_bldr.addWhereWithAnd(t.del_flg.eq(value(false)));
			itmInspL_bldr.setOrderByDesc(t.st_dt, t.end_dt, pr("insp_ptn_st_dt"),
					pr("insp_ptn_end_dt"));

		}

		protected void insItmInspKey() {
			MCList<MAM_ITM_INSP_R> itmInspL = MCList.create(MAM_ITM_INSP_R.class);

			for (InspSchd_Srch01_CndR r : up0()) {
				MAM_ITM_INSP_R itmInspR = MAM_ITM_INSP_R.create();
				itmInspR.itm_cd(r.itm_cd());
				itmInspR.itm_sub1(r.itm_sub1());
				itmInspR.itm_sub2(r.itm_sub2());
				itmInspR.itm_sub3(r.itm_sub3());
				itmInspR.mfg_loc_cd(r.mfg_loc_cd());
				itmInspR.sppl_cd(r.sppl_cd());
				itmInspR.maker_cd(r.maker_cd());
				itmInspR.from_site_cd(r.from_site_cd());
				itmInspR.to_site_cd(r.to_site_cd());
				itmInspR.st_dt(r.base_dt());
				itmInspL.add(itmInspR);
			}

			MCQueryApiBuilder itmInspL_bldr = MCQueryApiBuilder.create(MAM_ITM_INSP_R.create("T"));
			dbWkDelete("MSBFL5010_MAW_ITM_INSP_D01", itmInspL_bldr.getBaseDbc());
			dbWkInsert("MSBFL5010_MAW_ITM_INSP_I01", itmInspL, itmInspL_bldr.getBaseDbc());
		}
		
		
		protected void doMasterCache() {
			MAM_ITM_INSP_PTN_R t = MAM_ITM_INSP_PTN_R.create("T");
			MCQueryApiBuilder itmInspPtnL_bldr = MCQueryApiBuilder.create(t);
			itmInspPtnL_bldr.setSelect(t.insp_mtd_typ, t.insp_lt, t.insp_std_no,
					t.spl_qty, t.std_req_flg, t.std_cnf_req_flg);
			
			MCList<InspSchd_Srch01_CndR> bindInspPtnL = MCList.create(InspSchd_Srch01_CndR.class);
			for (InspSchd_Srch01_CndR r : up0()) {
				if (!isNull(r.insp_ptn_cd())) {
					bindInspPtnL.add(r);
				}
			}
			
			_itmInspPtnL = new FXUCL_MCDbcCacheStEnd<MAM_ITM_INSP_PTN_R>(itmInspPtnL_bldr, -1, bindInspPtnL,
					InspSchd_Srch01_CndR.$itm_cd, InspSchd_Srch01_CndR.$itm_sub1,
					InspSchd_Srch01_CndR.$itm_sub2, InspSchd_Srch01_CndR.$itm_sub3,
					InspSchd_Srch01_CndR.$insp_ptn_cd);
		}
		
		protected MCList<MAM_ITM_INSP_R> getItmInspSubL(InspSchd_Srch01_CndR r) {
			MCList<MAM_ITM_INSP_R> subL = _itmInspL.subList(_idx, r.itm_cd(),
					r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.to_site_cd());
			
			MCList<MAM_ITM_INSP_R> retL = MCList.create(MAM_ITM_INSP_R.class);
			for (MAM_ITM_INSP_R subR : subL) {
				if (subR.st_dt().lte(r.base_dt()) && subR.end_dt().gte(r.base_dt())) {
					if (isNull(subR.getDateNE("INSP_PTN_ST_DT"))) {
						// 検査対象外の場合は、品目検査パタンマスタが存在しないことがある。
						// この場合は、戻り値として返す必要があるためretLにaddする
						retL.add(subR);
					}
					else {
						if (subR.getDateNE("INSP_PTN_ST_DT").lte(r.base_dt()) 
								&& subR.getDateNE("INSP_PTN_END_DT").gte(r.base_dt())) {
							retL.add(subR);
						}
					}					
				}
			}
			return retL;
		}

		protected MCList<MAM_ITM_INSP_R> getItmInspSubL2(InspSchd_Srch01_CndR r) {
			MCList<MAM_ITM_INSP_R> subL = _itmInspL.subList(_idx, r.itm_cd(),
					r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.to_site_cd());
			
			MCList<MAM_ITM_INSP_R> retL = MCList.create(MAM_ITM_INSP_R.class);
			for (MAM_ITM_INSP_R subR : subL) {
				MCDate judgeDt = null;
				MCNumber judgeInspLT = nvl(subR.getNumberNE("insp_lt"), MCNumber.ZERO);
				MCNumber judgeInspOffst = nvl(subR.insp_offst(), MCNumber.ZERO);
				//製造検査でない場合、検査オフセットが正の値にはなりえないので、検査オフセット変更する
				if (!MSC_INSP_TYP.isPRDCT(r.insp_typ()) && judgeInspOffst.isPositive()) {
					judgeInspOffst = MCNumber.ZERO;
				}
				//検収予定日が入っていたら、検収予定日から格納完了予定日を求める。
				if (!isNull(r.accpt_schd_dt())) {
					judgeDt = getCalDateLoc(r.accpt_schd_dt(), r.accpt_insp_lt().negate(), false, r.to_loc_cd() ,false);
				}
				//検査着手予定日が入っていたら、検査着手予定日から格納完了予定日を求める。
				else if (!isNull(r.insp_st_schd_dt())) {
					judgeDt = getCalDateLoc(r.insp_st_schd_dt(), judgeInspOffst, false, r.to_loc_cd() ,false);
				}
				//検査終了予定日が入っていたら、検査終了予定日から格納完了予定日を求める。
				else if (!isNull(r.insp_end_schd_dt())) {
					MCDate tmp_insp_st_schd_dt = getCalDateLoc(r.insp_end_schd_dt(), judgeInspLT.negate(), false, r.to_loc_cd() ,false);
					judgeDt = getCalDateLoc(tmp_insp_st_schd_dt, judgeInspOffst, false, r.to_loc_cd() ,false);
				}
				//使用可能予定日が入っていたら、使用可能予定日から格納完了予定日を求める。
				else if (!isNull(r.avl_schd_dt())) {
					//検査中ロット使用許可フラグがオンの場合、検査LTと検査オフセットはゼロとみなす
					if (isSame(subR.getStringNE("IN_PRMT_INSP_FLG"), "1")) {
						judgeInspOffst = MCNumber.ZERO;
						judgeInspLT = MCNumber.ZERO;
					}
					MCDate tmp_insp_st_dt = null;
					if (!isNull(r.accpt_insp_lt()) && r.accpt_insp_lt().gte(judgeInspLT.subtract(judgeInspOffst))) {
						judgeDt = getCalDateLoc(r.avl_schd_dt(), r.accpt_insp_lt().negate(), false, r.to_loc_cd(), false);
					}
					else {
						if ( MCNumber.ZERO.lt(judgeInspLT.subtract(judgeInspOffst))) {
							tmp_insp_st_dt = getCalDateLoc(r.avl_schd_dt(), judgeInspLT.negate(), false, r.to_loc_cd(), false);
							judgeDt = getCalDateLoc(tmp_insp_st_dt, judgeInspOffst, false, r.to_loc_cd() ,false);
						}else {
							judgeDt = r.avl_schd_dt();
						}
					}
				}
				
				if (subR.st_dt().lte(judgeDt) && subR.end_dt().gte(judgeDt)) {
					if (isNull(subR.getDateNE("INSP_PTN_ST_DT"))) {
						// 検査対象外の場合は、品目検査パタンマスタが存在しないことがある。
						// この場合は、戻り値として返す必要があるためretLにaddする
						subR.setDateNE("strg_schd_dt", judgeDt);
						retL.add(subR);
					}
					else {
						if (subR.getDateNE("INSP_PTN_ST_DT").lte(judgeDt) 
								&& subR.getDateNE("INSP_PTN_END_DT").gte(judgeDt)) {
							subR.setDateNE("strg_schd_dt", judgeDt);
							retL.add(subR);
						}
					}					
				}
			}
			return retL;
		}
	}
	/**
	 * InspSchd_Srch02オペレーション.<p>
	 *
	 * 入庫実績用に、在庫検査区分を取得する。<br>
	 */
	public class InspSchd_Srch02 extends MSBFL_InspSchdService_MC_A.InspSchd_Srch02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			createLocCache();
			createPoCache();
			createItmInspCache();
			createInspSchdCache();
			createBpCache();
			createProvUpriCache();

			for (InspSchd_Srch02_CndR up0R : up0()) {
				InspSchd_Srch02_CndR down0R = InspSchd_Srch02_CndR.create();
				MCList<MST_INSP_SCHD_R> schdL = 
						getAllInspSchdL(up0R.insp_typ(), up0R.src_no3(), up0R.src_no4());
				
				if (isGetStkInspTyp(up0R, schdL)) {
					down0R.stk_insp_typ(getStkInspTyp(up0R, schdL));
				}
				else {
					down0R.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
				}
				down0R.peg_no(up0R.peg_no());
				down0().add(down0R);
			}
		}
		
		protected FXUCL_MCDbcCache<MAM_LOC_R> _locCache;
		
		protected void createLocCache() {
			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.sppl_cd);
			dbc_bldr.addSelect(t.ddlv_prov_insp_flg);
			dbc_bldr.addSelect(t.wg_cd);
			_locCache = new FXUCL_MCDbcCache<MAM_LOC_R>(dbc_bldr, up0(), InspSchd_Srch02_CndR.$loc_cd);
		}
		
		protected FXUCL_MCDbcCache<MST_PO_D_R> _poCache;
		
		protected void createPoCache() {
			MST_PO_D_R t = MST_PO_D_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.dlv_cd, t.purc_id_typ);
			_poCache = new FXUCL_MCDbcCache<MST_PO_D_R>(dbc_bldr, up0(), InspSchd_Srch02_CndR.$src_no1);
		}
		
		protected boolean isGetStkInspTyp(InspSchd_Srch02_CndR up0R, MCList<MST_INSP_SCHD_R> schdL) {
			if (!MSC_INSP_TYP.isPRDCT(up0R.insp_typ())) {
				return true;
			}
			
			if (isNull(up0R.base_unit_qty()) || up0R.base_unit_qty().isZero()) {
				if (!schdL.isEmpty() && isInspInstructed(schdL)) {
					// 検査指図済みの場合は、0実績であっても検査予定をDELETEしないためtrueを返す。
					return true;
				}
				return false;
			}
			return true;
		}
		
		protected MCList<InspSchd_Srch01_CndR> _itmInspCache;
		protected void createItmInspCache() {
			mcframe.serverMSBF.MSBFL5010.MSBFL_InspSchdService.InspSchd_Srch01 o =
					mcframe.serverMSBF.MSBFL5010.MSBFL_InspSchdService.crtInspSchd_Srch01();
			for (InspSchd_Srch02_CndR up0R : up0()) {
				InspSchd_Srch01_CndR oR = InspSchd_Srch01_CndR.create();
				
				oR.peg_no(up0R.peg_no());
				oR.itm_cd(up0R.itm_cd());
				oR.itm_sub1(up0R.itm_sub1());
				oR.itm_sub2(up0R.itm_sub2());
				oR.itm_sub3(up0R.itm_sub3());
				oR.mfg_loc_cd(up0R.mfg_loc_cd());
				oR.sppl_cd(up0R.sppl_cd());
				oR.maker_cd(up0R.maker_cd());
				oR.to_loc_cd(up0R.loc_cd());
				oR.insp_typ(up0R.insp_typ());
				oR.base_dt(up0R.gr_dt());
				oR.insp_ptn_cd(null);
				oR.no_insp_srch_flg(false);
				
				o.up0().add(oR);
			}
			
			if (!o.up0().isEmpty()) {
				o.exec();
				_itmInspCache = o.down0();
			}
		}

		protected MCList<MST_INSP_SCHD_R> _inspSchdL = null;
		protected MCIndexKey _idxkeySrcNo3 = null;
		protected MCIndexKey _idxkeySrcNo4 = null;
		
		protected void createInspSchdCache() {
			_inspSchdL = MCList.create(MST_INSP_SCHD_R.class);
			MCList<MST_INSP_SCHD_R> tmpInspSchdL = MCList.create(MST_INSP_SCHD_R.class);
			MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder tmpInspSchdL_bldr = MCQueryApiBuilder.create(t);
			tmpInspSchdL_bldr.setWhere(t.insp_typ.eq(bind("insp_typ")));
			tmpInspSchdL_bldr.addWhereWithAnd(t.src_no3.eq(bind("src_no3"))
					.and(t.src_no4.isNull()));
			dbSelect("MSBFL5010_MST_INSP_SCHD_S04", tmpInspSchdL, tmpInspSchdL_bldr, up0());
			_inspSchdL.addAll(tmpInspSchdL);

			tmpInspSchdL = MCList.create(MST_INSP_SCHD_R.class);
			tmpInspSchdL_bldr.setWhere(t.insp_typ.eq(bind("insp_typ")));
			tmpInspSchdL_bldr.addWhereWithAnd(t.src_no4.eq(bind("src_no4")));
			dbSelect("MSBFL5010_MST_INSP_SCHD_S05", tmpInspSchdL, tmpInspSchdL_bldr, up0());
			_inspSchdL.addAll(tmpInspSchdL);

			_idxkeySrcNo3 = _inspSchdL.createIndex(MST_INSP_SCHD_R.$insp_typ,
					MST_INSP_SCHD_R.$src_no3);
			_idxkeySrcNo4 = _inspSchdL.createIndex(MST_INSP_SCHD_R.$insp_typ,
					MST_INSP_SCHD_R.$src_no4);
		}
		
		protected FXUCL_MCDbcCache<MAM_BP_R> _bpCache;
		protected void createBpCache() {
			MCList<MAM_BP_R> bindL = MCList.create(MAM_BP_R.class);
			for (InspSchd_Srch02_CndR r : up0()) {
				MAM_LOC_R locR = _locCache.get(r.loc_cd());
				if (locR.ddlv_prov_insp_flg()) {
					MAM_BP_R bindR = MAM_BP_R.create();
					bindR.bp_cd(locR.sppl_cd());
					bindL.add(bindR);
				}
			}
			MAM_BP_R t = MAM_BP_R.create("T");
			MCQueryApiBuilder bpL_bldr = MCQueryApiBuilder.create(t);
			bpL_bldr.setSelect(t.cur_cd);
			bpL_bldr.addSelect(t.prov_basis_typ);
			_bpCache = new FXUCL_MCDbcCache<MAM_BP_R>(bpL_bldr, bindL, MAM_BP_R.$bp_cd);
		}
		
		protected FXUCL_MCDbcCacheStEnd<MAM_PROV_UPRI_R> _provUpriCache;
		protected void createProvUpriCache() {
			MCList<MAM_PROV_UPRI_R> bindL = MCList.create(MAM_PROV_UPRI_R.class);
			for (InspSchd_Srch02_CndR r : up0()) {
				MAM_LOC_R locR = _locCache.get(r.loc_cd());
				if (locR.ddlv_prov_insp_flg()) {
					MAM_BP_R bpR = _bpCache.get(locR.sppl_cd());
					MAM_PROV_UPRI_R bindR = MAM_PROV_UPRI_R.create();
					bindR.itm_cd(r.itm_cd());
					bindR.itm_sub1(r.itm_sub1());
					bindR.itm_sub2(r.itm_sub2());
					bindR.itm_sub3(r.itm_sub3());
					bindR.prsppl_cd(locR.sppl_cd());
					bindR.cur_cd(bpR.cur_cd());
					bindR.wg_cd(locR.wg_cd());
					bindL.add(bindR);
				}
			}
			MAM_PROV_UPRI_R t = MAM_PROV_UPRI_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.prov_typ);
			_provUpriCache = new FXUCL_MCDbcCacheStEnd<MAM_PROV_UPRI_R>(dbc_bldr, bindL,
					MAM_PROV_UPRI_R.$itm_cd, MAM_PROV_UPRI_R.$itm_sub1,
					MAM_PROV_UPRI_R.$itm_sub2, MAM_PROV_UPRI_R.$itm_sub3,
					MAM_PROV_UPRI_R.$prsppl_cd, MAM_PROV_UPRI_R.$cur_cd,
					MAM_PROV_UPRI_R.$wg_cd);
		}

		protected MCList<MST_INSP_SCHD_R> getAllInspSchdL(
				String inspTyp,String srcNo3, String srcNo4) {
			MCList<MST_INSP_SCHD_R> schdL = null;

			if (!isNull(srcNo4)) {
				schdL = _inspSchdL.subList(_idxkeySrcNo4, inspTyp, srcNo4);
				if (!schdL.isEmpty()) {
					return schdL;
				}
			}
			
			schdL = _inspSchdL.subList(_idxkeySrcNo3, inspTyp, srcNo3);
			return schdL;
		}
		
		protected boolean isInspInstructed(MCList<MST_INSP_SCHD_R> schdL) {
			MST_INSP_SCHD_R tmpR = schdL.getFirst(MST_INSP_SCHD_R.$insp_schd_sts_typ, MSC_INSP_STS_TYP.ORD.value());
			
			return !isNull(tmpR);
		}
		
		protected String getStkInspTyp(InspSchd_Srch02_CndR up0R, MCList<MST_INSP_SCHD_R> schdL) {
			if (up0R.not_stk_flg()) {
				return noInspValue();
			}
			
			if (isOutLoc(up0R.loc_cd())) {
				if (!MSC_INSP_TYP.isACCPT(up0R.insp_typ())) {
					return noInspValue();
				}
				MST_PO_D_R poR = _poCache.get(up0R.src_no1());
				// 社外場所に直送する場合、直送支給検査場所への無償支給でなければ検査対象外。
				// なお、無償受給品の無償支給は他者資産となるため検査対象外とする。
				if (!isDdlvProvInspLoc(up0R.loc_cd())
						|| (!isFfrProv(up0R.src_no3(), up0R.src_no4()) && !isOnrProvInpt(up0R))
						|| (!isNull(poR) && MAC_PURC_ID_TYP.isFFR_RCV(poR.purc_id_typ()))) {
					return noInspValue();
				}
			}

			if (MSC_INSP_TYP.isPRDCT(up0R.insp_typ())) {
				//良品以外の出来高の場合
				if (!isNull(up0R.quality_typ())
						&& !MAC_QUALITY_TYP.isGOOD(up0R.quality_typ())) {
					return noInspValue();
				}
			}
			
			if (MSC_INSP_TYP.isACCPT(up0R.insp_typ())) {
				MST_PO_D_R poR = _poCache.get(up0R.src_no1());
				if (!isNull(poR) && !isNull(poR.dlv_cd())) {
					// 受入検査の場合、作成元ＮＯ１で発注明細を検索。納品先ＣＤが設定されている場合は商品の仕入直送のため、検査対象外。
					return noInspValue();
				}
			}
			
			InspSchd_Srch01_CndR itmInspR = getItmInsp(up0R);
			
			boolean isInspInstructedFlg = isInspInstructed(schdL);
//			if (!isInspInstructed(schdL)) {
			if (!isInspInstructedFlg) {
				if (isNull(itmInspR)) {
					return noInspValue();
				}
			}
			
			return inspValue(up0R, itmInspR, isInspInstructedFlg, schdL);
		}
		
		/**
		 * 検査対象外の場合の下り電文設定
		 */
		protected String noInspValue() {
			return MSC_STK_INSP_TYP.FIN.value();
		}
		
		/**
		 * 検査対象の場合の下り電文設定
		 * @param up0R
		 * @param itmInspR
		 * @param isInspInstructed
		 * @param schdL
		 */
		protected String inspValue(InspSchd_Srch02_CndR up0R, InspSchd_Srch01_CndR itmInspR, boolean isInspInstructed, MCList<MST_INSP_SCHD_R> schdL) {
			if (isInspInstructed) {
				MST_INSP_SCHD_R schdR = schdL.getFirst(MST_INSP_SCHD_R.$src_no4, up0R.src_no4());
				if (MSC_STK_INSP_TYP.isFIN(schdL.get(0).stk_insp_typ())
						|| (!isNull(up0R.src_no4()) && isNull(schdR) && isNull(itmInspR))) {
					// 検査中ロット使用許可品目の場合、
					// もしくは製造検査において、一部出来高数量で検査指図後、検査対象外に変更され、残りの出来高実績が登録された場合、
					// 在庫検査区分は検査済を返す。
					return MSC_STK_INSP_TYP.FIN.value();
				}
				else {
					return MSC_STK_INSP_TYP.YET.value();
				}
			}
			else {
				if (itmInspR.in_prmt_insp_flg()) {
					return MSC_STK_INSP_TYP.FIN.value();
				}
				else {
					return MSC_STK_INSP_TYP.YET.value();
				}
			}
		}
		
		/*
		 * 社外場所であるかを返す
		 */
		protected boolean isOutLoc(String locCd) {
			MAM_LOC_R locR = _locCache.get(locCd);
			return !isNull(locR.sppl_cd());
		}
		
		/*
		 * 直送支給検査対象場所であるかを返す
		 */
		protected boolean isDdlvProvInspLoc(String locCd) {
			MAM_LOC_R locR = _locCache.get(locCd);
			return locR.ddlv_prov_insp_flg();
		}
		
		
		protected boolean isFfrProv(String arrSchdNo, String arrActNo) {
			String provTyp = null;

			MCList<MST_PROV_ACT_R> paL = MCList.create(MST_PROV_ACT_R.class);
			MST_PROV_ACT_R t = MST_PROV_ACT_R.create("T");
			MCQueryApiBuilder paL_bldr = MCQueryApiBuilder.create(t);
			paL_bldr.setSelect(t.prov_typ);
			paL_bldr.setWhere(t.prov_src_act_typ.eq(bind("1")),
					MSC_PROV_SRC_ACT_TYP.DDLV.value());
			paL_bldr.addWhereWithAnd(t.prov_src_act_no.eq(bind("1")), arrActNo);
			paL_bldr.addWhereWithAnd(t.slip_sts_typ.eq(bind("1")),
					MAC_SLIP_STS_TYP.CRT.value());
			dbSelect("MSBFL5010_MST_PROV_ACT_S01", paL, paL_bldr);
			
			if (!paL.isEmpty()) provTyp = paL.get(0).prov_typ();
			
			if (isNull(provTyp)) {
				// 入荷時に同時計上していないと、支給実績が作成されていない場合があるので支給予定で評価する。
				MST_PROV_SCHD_R psR = MST_PROV_SCHD_R.create();
				MST_PROV_SCHD_R t1 = MST_PROV_SCHD_R.create("T");
				MCQueryApiBuilder psR_bldr = MCQueryApiBuilder.create(t1);
				psR_bldr.setSelect(t1.prov_typ);
				psR_bldr.setWhere(t1.prov_src_schd_typ.eq(bind("1")),
						MSC_PROV_SRC_SCHD_TYP.DDLV.value());
				psR_bldr.addWhereWithAnd(t1.prov_src_schd_no2.eq(bind("1")), arrSchdNo);
				dbSelect("MSBFL5010_MST_PROV_SCHD_S01", psR, psR_bldr);
				
				provTyp = psR.prov_typ();
			}
			
			return MAC_PROV_TYP.isFFR_PROV(provTyp);
		}
		
		protected InspSchd_Srch01_CndR getItmInsp(InspSchd_Srch02_CndR up0R) {
			if (_itmInspCache != null) {
				return _itmInspCache.getFirst(InspSchd_Srch01_CndR.$peg_no, up0R.peg_no());
			}
			
			return null;
		}
		
		protected boolean isOnrProvInpt(InspSchd_Srch02_CndR up0R) {
			MAM_LOC_R locR = _locCache.get(up0R.loc_cd());
			MAM_BP_R bpR = _bpCache.get(locR.sppl_cd());
			MAM_PROV_UPRI_R upriR = _provUpriCache.get(up0R.gr_dt(),
					up0R.itm_cd(), up0R.itm_sub1(), up0R.itm_sub2(), up0R.itm_sub3(),
					locR.sppl_cd(), bpR.cur_cd(), locR.wg_cd());
			if(!isNull(upriR) && MAC_PROV_TYP.isONR_PROV(upriR.prov_typ()) && MAC_PROV_BASIS_TYP.isINPT(bpR.prov_basis_typ())) {
				return true;
			}
			return false;
		}
	}
	/**
	 * InspSchd_Srch03オペレーション.<p>
	 *
	 * 検査着手・終了予定日を取得する。<br>
	 */
	public class InspSchd_Srch03 extends MSBFL_InspSchdService_MC_A.InspSchd_Srch03 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			createLocCache();
			createBpCache();
			createProvUpriCache();
			callInspSchdSrch01();
			getStEndSchdDt();
		}
		
		protected MCList<InspSchd_Srch01_CndR> _itmInspCache;
		protected FXUCL_MCDbcCache<MAM_LOC_R> _locCache;
		protected FXUCL_MCDbcCache<MAM_BP_R> _bpCache;
		protected FXUCL_MCDbcCacheStEnd<MAM_PROV_UPRI_R> _provUpriCache;
		
		protected void createLocCache() {
			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.cal_cd);
			dbc_bldr.addSelect(t.wg_cd);
			dbc_bldr.addSelect(t.sppl_cd);
			dbc_bldr.addSelect(t.ddlv_prov_insp_flg);
			
			_locCache = new FXUCL_MCDbcCache<MAM_LOC_R>(dbc_bldr, up0(), InspSchd_Srch03_CndR.$to_loc_cd);
		}
		
		protected void createBpCache() {
			MCList<MAM_BP_R> bindL = MCList.create(MAM_BP_R.class);
			for (InspSchd_Srch03_CndR r : up0()) {
				MAM_LOC_R locR = _locCache.get(r.to_loc_cd());
				if (locR.ddlv_prov_insp_flg()) {
					MAM_BP_R bindR = MAM_BP_R.create();
					bindR.bp_cd(locR.sppl_cd());
					bindL.add(bindR);
				}
			}
			MAM_BP_R t = MAM_BP_R.create("T");
			MCQueryApiBuilder bpL_bldr = MCQueryApiBuilder.create(t);
			bpL_bldr.setSelect(t.cur_cd);
			bpL_bldr.addSelect(t.prov_basis_typ);
			_bpCache = new FXUCL_MCDbcCache<MAM_BP_R>(bpL_bldr, bindL, MAM_BP_R.$bp_cd);
		}
		
		protected void createProvUpriCache() {
			MCList<MAM_PROV_UPRI_R> bindL = MCList.create(MAM_PROV_UPRI_R.class);
			for (InspSchd_Srch03_CndR r : up0()) {
				MAM_LOC_R locR = _locCache.get(r.to_loc_cd());
				if (locR.ddlv_prov_insp_flg()) {
					MAM_BP_R bpR = _bpCache.get(locR.sppl_cd());
					MAM_PROV_UPRI_R bindR = MAM_PROV_UPRI_R.create();
					bindR.itm_cd(r.itm_cd());
					bindR.itm_sub1(r.itm_sub1());
					bindR.itm_sub2(r.itm_sub2());
					bindR.itm_sub3(r.itm_sub3());
					bindR.prsppl_cd(locR.sppl_cd());
					bindR.cur_cd(bpR.cur_cd());
					bindR.wg_cd(locR.wg_cd());
					bindL.add(bindR);
				}
			}
			MAM_PROV_UPRI_R t = MAM_PROV_UPRI_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.prov_typ);
			_provUpriCache = new FXUCL_MCDbcCacheStEnd<MAM_PROV_UPRI_R>(dbc_bldr, bindL,
					MAM_PROV_UPRI_R.$itm_cd, MAM_PROV_UPRI_R.$itm_sub1,
					MAM_PROV_UPRI_R.$itm_sub2, MAM_PROV_UPRI_R.$itm_sub3,
					MAM_PROV_UPRI_R.$prsppl_cd, MAM_PROV_UPRI_R.$cur_cd,
					MAM_PROV_UPRI_R.$wg_cd);
		}
		
		protected void callInspSchdSrch01() {
			mcframe.serverMSBF.MSBFL5010.MSBFL_InspSchdService.InspSchd_Srch01 o =
					mcframe.serverMSBF.MSBFL5010.MSBFL_InspSchdService.crtInspSchd_Srch01();
			
			for (InspSchd_Srch03_CndR up0R : up0()) {
				InspSchd_Srch01_CndR oR = InspSchd_Srch01_CndR.create();
				
				oR.peg_no(up0R.peg_no());
				oR.itm_cd(up0R.itm_cd());
				oR.itm_sub1(up0R.itm_sub1());
				oR.itm_sub2(up0R.itm_sub2());
				oR.itm_sub3(up0R.itm_sub3());
				oR.mfg_loc_cd(up0R.mfg_loc_cd());
				oR.sppl_cd(up0R.sppl_cd());
				oR.maker_cd(up0R.maker_cd());
				oR.from_site_cd(null);
				oR.to_loc_cd(up0R.to_loc_cd());
				oR.insp_typ(up0R.insp_typ());
				oR.base_dt(up0R.schd_gr_dt());
				oR.insp_ptn_cd(null);
				oR.no_insp_srch_flg(false);
				
				o.up0().add(oR);
			}
			
			o.exec();
			_itmInspCache = MCList.create(InspSchd_Srch01_CndR.class);
			_itmInspCache.setAll(o.down0());
		}
		
		protected InspSchd_Srch01_CndR getItmInspR(MCNumber pegNo) {
			return _itmInspCache.getFirst(InspSchd_Srch01_CndR.$peg_no, pegNo);
		}
		
		protected void getStEndSchdDt() {
			MCList<InspSchd_Srch03_CndR> tmpCalDateL = MCList.create(InspSchd_Srch03_CndR.class); 
			for (InspSchd_Srch03_CndR up0R : up0()) {
				InspSchd_Srch01_CndR itmInspR = getItmInspR(up0R.peg_no());

				// リードタイム計算対象かどうかを判断する
				if (notCalcLt(itmInspR, up0R)) {
					// 在庫の使用可能日は在庫発生予定日と同値になるため、リードタイム計算は行わない。
					up0R.st_dt(up0R.schd_gr_dt());
					up0R.end_dt(up0R.schd_gr_dt());
				}
				else {
					MCNumber inspOffst = nvl(itmInspR.insp_offst(), MCNumber.ZERO);
					if (!MSC_INSP_TYP.isPRDCT(up0R.insp_typ()) && inspOffst.isPositive()) {
						inspOffst = MCNumber.ZERO;
					}
					
					
					InspSchd_Srch03_CndR tmpR = InspSchd_Srch03_CndR.create();
					MCRow.copyall(tmpR, up0R);
					
					MAM_LOC_R locR = _locCache.get(up0R.to_loc_cd());
					if(!isNull(locR.cal_cd())) {
						tmpR.addStringColumn(TMP_CAL_CD, locR.cal_cd());
					}
					else {
						MAM_CO_R mcoR = getCo();
						tmpR.addStringColumn(TMP_CAL_CD, mcoR.std_cal_cd());
					}
					tmpR.addNumberColumn(TMP_INSP_LT, itmInspR.insp_lt());
					tmpR.addNumberColumn(TMP_INSP_OFFST, inspOffst.negate());
					tmpR.addBooleanColumn(TMP_FWD_FLG, true);
					tmpR.addBooleanColumn(TMP_XFR_FLG, false);
					tmpCalDateL.add(tmpR);
				}
				
				down0().add(up0R);
			}
			// リードタイム計算を行い、検査着手予定日・検査完了予定日を算出する
			execCalDateBatch(InspSchd_Srch03_CndR.$st_dt, tmpCalDateL,
					InspSchd_Srch03_CndR.$schd_gr_dt, TMP_INSP_OFFST, TMP_FWD_FLG, TMP_CAL_CD,
					TMP_XFR_FLG);
			String[] offstDestCols = new String[]{InspSchd_Srch03_CndR.$st_dt};
			String[] offstSrcCols = new String[]{InspSchd_Srch03_CndR.$st_dt};
			copyByPegNo(down0(), offstDestCols, tmpCalDateL, offstSrcCols);
			execCalDateBatch(InspSchd_Srch03_CndR.$end_dt, tmpCalDateL, InspSchd_Srch03_CndR.$st_dt, TMP_INSP_LT, TMP_FWD_FLG, TMP_CAL_CD, TMP_XFR_FLG);
			String[] destCols = new String[]{InspSchd_Srch03_CndR.$end_dt};
			String[] srcCols = new String[]{InspSchd_Srch03_CndR.$end_dt};
			copyByPegNo(down0(), destCols, tmpCalDateL, srcCols);
		}
		
		/**
		 * 検査リードタイム計算が不要かどうかを返す
		 * @param itmInspR
		 * @param up0R
		 */
		protected boolean notCalcLt(InspSchd_Srch01_CndR itmInspR,
				InspSchd_Srch03_CndR up0R) {
			
			// 品目品管マスタが取得できない場合は対象外
			if (isNull(itmInspR)) {
				return true;
			}
			
			// 呼出元が検査予定サービス以外かつ検査中ロット使用許可品の場合は対象外
			if (!up0R.insp_flg() && itmInspR.in_prmt_insp_flg()) {
				return true;
			}

			// 受入検査で納品先ＣＤ（発注予定の納品先ＣＤ）が設定されている場合は、商品の仕入直送のため対象外
			if (MSC_INSP_TYP.isACCPT(up0R.insp_typ()) && !isNull(up0R.dlv_cd())) {
				return true;
			}

			MAM_LOC_R locR = _locCache.get(up0R.to_loc_cd());
			if (locR.ddlv_prov_insp_flg()) {
				// 直送支給検査の場合、有償支給は対象外
				MAM_BP_R bpR = _bpCache.get(locR.sppl_cd());
				MAM_PROV_UPRI_R upriR = _provUpriCache.get(up0R.schd_gr_dt(),
						up0R.itm_cd(), up0R.itm_sub1(), up0R.itm_sub2(), up0R.itm_sub3(),
						locR.sppl_cd(), bpR.cur_cd(), locR.wg_cd());
				if (!isNull(upriR) && MAC_PROV_TYP.isONR_PROV(upriR.prov_typ())) {
					if(!MAC_PROV_BASIS_TYP.isINPT(bpR.prov_basis_typ())) {
						return true;
					}
				}
			}
			else {
				// 社外場所かつ直送支給検査でない場合は対象外
				if (!isNull(locR.sppl_cd())) {
					return true;
				}
			}
			return false;
		}

	}
	/**
	 * InspSchd_Upd02オペレーション.<p>
	 *
	 * 製造承認関連処理に伴い、チェック処理や検査予定状況の更新を行う。<br>
	 */
	public class InspSchd_Upd02 extends MSBFL_InspSchdService_MC_A.InspSchd_Upd02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			MCList<MST_INSP_SCHD_R> updL = MCList.create(MST_INSP_SCHD_R.class);
			MCList<MST_INSP_SCHD_R> schdL = getInspSchd(up0());
			MCIndexKey idx = schdL.createIndex(MST_INSP_SCHD_R.$src_no1);
			
			callInspSchdSrch01(up0(), schdL, idx);
			
			for (InspSchd_Upd02_CndR up0R : up0()) {
				MCList<MST_INSP_SCHD_R> subSchdL = schdL.subList(idx, up0R.mfg_inst_no());
				
				if (subSchdL.isEmpty()) {
					continue;
				}
				
				// 製造指図承認された場合の処理
				if (MSC_MFG_APRV_STS_TYP.isINST_ACPT(up0R.mfg_aprv_sts_typ())) {
					// 検査指図可能な場合は、未指図に更新する。
					String instIssueTyp =
							_itmInspCache.getFirst(InspSchd_Srch01_CndR.$peg_no, up0R.peg_no()).insp_inst_issue_typ();
					for (MST_INSP_SCHD_R schdR : subSchdL) {
						if (isStsYetCmn(schdR, instIssueTyp)) {
							schdR.insp_schd_sts_typ(MSC_INSP_STS_TYP.YET.value());
							updL.add(schdR);
						}
					}
				}
				// 製造指図承認取消された場合の処理
				else if (MSC_MFG_APRV_STS_TYP.isINST_OPN(up0R.mfg_aprv_sts_typ())) {
					// 検査指図されているかどうかのチェックはChk02で行う。
					
					// 未指図の検査予定が存在すれば、検査予定の状態に戻す
					for (MST_INSP_SCHD_R schdR : schdL) {
						if (MSC_INSP_STS_TYP.isYET(schdR.insp_schd_sts_typ())) {
							schdR.insp_schd_sts_typ(MSC_INSP_STS_TYP.SCHD.value());
							updL.add(schdR);
						}
					}
				}
				// 製造記録承認取消された場合の工場出荷承認済みチェックはChk02で行う。
			}
			
			if (!updL.isEmpty()) {
				updSchdSts(updL);
			}
		}
		
		/**
		 * 製造指図ＮＯに紐づく検査予定を取得
		 */
		protected MCList<MST_INSP_SCHD_R> getInspSchd(MCList<InspSchd_Upd02_CndR> up0L) {
			MCList<MST_INSP_SCHD_R> ret = MCList.create(MST_INSP_SCHD_R.class);
			MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder ret_bldr = MCQueryApiBuilder.create(t);
			ret_bldr.setWhere(t.insp_typ.eq(bind("1")), MSC_INSP_TYP.PRDCT.value());
			ret_bldr.addWhereWithAnd(t.insp_freq.eq(value(1)));
			ret_bldr.addWhereWithAnd(t.src_no1.eq(bind("mfg_inst_no")));
			ret_bldr.setOrderByAsc(t.insp_schd_no);
			dbSelect("MSBFL5010_MST_INSP_SCHD_S06", ret, ret_bldr, up0L);
			return ret;
		}
		
		protected MCList<InspSchd_Srch01_CndR> _itmInspCache = MCList.create(InspSchd_Srch01_CndR.class);
		
		protected void callInspSchdSrch01(MCList<InspSchd_Upd02_CndR> up0L,
				MCList<MST_INSP_SCHD_R> schdL, MCIndexKey idx) {
			if (schdL.isEmpty()) {
				return;
			}
			
			mcframe.serverMSBF.MSBFL5010.MSBFL_InspSchdService.InspSchd_Srch01 o =
					mcframe.serverMSBF.MSBFL5010.MSBFL_InspSchdService.crtInspSchd_Srch01();
			
			setPegNo(up0L);
			for (InspSchd_Upd02_CndR up0R : up0L) {
				InspSchd_Srch01_CndR oR = InspSchd_Srch01_CndR.create();
				MCList<MST_INSP_SCHD_R> subSchdL = schdL.subList(idx, up0R.mfg_inst_no());
				if (subSchdL.isEmpty()) {
					continue;
				}
				MST_INSP_SCHD_R schdR = subSchdL.get(0);
				
				oR.peg_no(up0R.peg_no());
				oR.itm_cd(schdR.itm_cd());
				oR.itm_sub1(schdR.itm_sub1());
				oR.itm_sub2(schdR.itm_sub2());
				oR.itm_sub3(schdR.itm_sub3());
				oR.mfg_loc_cd(schdR.mfg_loc_cd());
				oR.sppl_cd(schdR.sppl_cd());
				oR.maker_cd(schdR.maker_cd());
				oR.from_site_cd(null);
				oR.to_loc_cd(schdR.loc_cd());
				oR.insp_typ(schdR.insp_typ());
				oR.base_dt(schdR.master_dt());
				oR.insp_ptn_cd(null);
				oR.no_insp_srch_flg(false);
				
				o.up0().add(oR);
			}
			
			o.exec();
			
			_itmInspCache.setAll(o.down0());
		}
		
		protected boolean isStsYetCmn(MST_INSP_SCHD_R r, String instIssueTyp) {
			//仮保存
			if (isNull(r.src_no1())) {
				return false;
			}
			if (MAC_INSP_MTD_TYP.isTTL(r.insp_mtd_typ())) {
				return !isNull(r.src_no4());
			}
			if (MAC_INSP_INST_ISSUE_TYP.isON_CMPL(instIssueTyp)) {
				return !isNull(r.src_no4());
			}
			return !(isNullOr(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(),
					r.lot_no(), r.sublot_no()));
		}
		
		/**
		 * 検査予定の状況を更新する
		 * @param updL
		 */
		protected void updSchdSts(MCList<MST_INSP_SCHD_R> updL) {
			MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);
			updL_bldr.setSet(t.insp_schd_sts_typ);
			dbUpdateKey("MSBFL5010_MST_INSP_SCHD_U01", updL, updL_bldr);
		}
	}
	/**
	 * InspSchd_Upd04オペレーション.<p>
	 *
	 * 在庫検査区分に関連する受払予定を追加・更新・削除する。<br>
	 */
	public class InspSchd_Upd04 extends MSBFL_InspSchdService_MC_A.InspSchd_Upd04 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			getInspAndcheck();
			delInspIoSchd();
			insInspIoSchd();
		}
		
		/**
		 * 検査予定を取得する。また、検査が完了しているにも関わらず、
		 * 検査中・検査待・判定待在庫が発生した場合のチェックを行う。
		 */
		protected void getInspAndcheck() {
			MCList<MST_INSP_SCHD_R> arrOrYieldSchdL = MCList.create(MST_INSP_SCHD_R.class);
			MCList<InspSchd_Upd04_CndR> arrOrYieldUp0L = MCList.create(InspSchd_Upd04_CndR.class);
			
			MCList<MST_INSP_SCHD_R> lotSchdL = MCList.create(MST_INSP_SCHD_R.class);
			MCList<InspSchd_Upd04_CndR> lotUp0L = MCList.create(InspSchd_Upd04_CndR.class);
			
			for (InspSchd_Upd04_CndR up0R : up0()) {
				if (MSC_STK_INSP_TYP.isFIN(up0R.stk_insp_typ())) {
					continue;
				}
				if (MSC_FIX_NO_TYP.isARR_ACT_NO(up0R.fix_no_typ())) {
					up0R.insp_typ(MSC_INSP_TYP.ACCPT.value());
					arrOrYieldUp0L.add(up0R);
				}
				else if (MSC_FIX_NO_TYP.isYIELD_ACT_NO(up0R.fix_no_typ())) {
					up0R.insp_typ(MSC_INSP_TYP.PRDCT.value());
					arrOrYieldUp0L.add(up0R);
				}
				else if (MSC_FIX_NO_TYP.isINSP_SCHD_NO(up0R.fix_no_typ())) {
					up0R.insp_typ(MSC_INSP_TYP.LOT.value());
					lotUp0L.add(up0R);
				}
			}
			
			MST_INSP_INST_R t2 = MST_INSP_INST_R.create("T2");
			MST_INSP_ACT_R t3 = MST_INSP_ACT_R.create("T3");

			if (!arrOrYieldUp0L.isEmpty()) {
				MST_INSP_SCHD_R t0 = MST_INSP_SCHD_R.create("T");
				MCQueryApiBuilder arrOrYieldSchdL_bldr = MCQueryApiBuilder.create(t0);
				arrOrYieldSchdL_bldr.setSelect(t0.insp_schd_no);
				arrOrYieldSchdL_bldr.addSelect(t0.insp_typ);
				arrOrYieldSchdL_bldr.addSelect(t0.src_no2);
				arrOrYieldSchdL_bldr.addSelect(t0.src_no3);
				arrOrYieldSchdL_bldr.addSelect(t0.src_no4);
				arrOrYieldSchdL_bldr.addSelect(t0.insp_no);
				arrOrYieldSchdL_bldr.addSelect(t0.master_dt);
				arrOrYieldSchdL_bldr.addSelect(t0.base_unit_cd);
				arrOrYieldSchdL_bldr.addSelect(t2.insp_sts_typ);
				arrOrYieldSchdL_bldr.addSelect(t2.insp_aprv_sts_typ);
				arrOrYieldSchdL_bldr.addSelect(nvl(t2.end_tm, t0.end_tm).as("end_schd_tm"));
				arrOrYieldSchdL_bldr.addSelect(t3.insp_judg_rslt_typ);
				arrOrYieldSchdL_bldr.addLeftOuterJoin(t2, t0.insp_no.eq(t2.insp_no));
				arrOrYieldSchdL_bldr.addLeftOuterJoin(t3, t0.insp_no.eq(t3.insp_no));
				arrOrYieldSchdL_bldr.setWhere(t0.insp_typ.eq(bind("insp_typ")));
				arrOrYieldSchdL_bldr.addWhereWithAnd(t0.src_no4.eq(bind("fix_no")));
				arrOrYieldSchdL_bldr.addWhereWithAnd(t0.latest_flg.eq(value(true)));

				dbSelect("MSBFL5010_MST_INSP_SCHD_S07",
						arrOrYieldSchdL, arrOrYieldSchdL_bldr, arrOrYieldUp0L);
			}
			
			if (!lotUp0L.isEmpty()) {
				MST_INSP_SCHD_R t1 = MST_INSP_SCHD_R.create("T");
				MCQueryApiBuilder lotSchdL_bldr = MCQueryApiBuilder.create(t1);
				lotSchdL_bldr.setSelect(t1.insp_schd_no);
				lotSchdL_bldr.addSelect(t1.insp_typ);
				lotSchdL_bldr.addSelect(t1.insp_no);
				lotSchdL_bldr.addSelect(t1.base_unit_cd);
				lotSchdL_bldr.addSelect(t2.insp_sts_typ);
				lotSchdL_bldr.addSelect(t2.insp_aprv_sts_typ);
				lotSchdL_bldr.addSelect(nvl(t2.end_tm, t1.end_tm).as("end_schd_tm"));
				lotSchdL_bldr.addSelect(t3.insp_judg_rslt_typ);
				lotSchdL_bldr.addLeftOuterJoin(t2, t1.insp_no.eq(t2.insp_no));
				lotSchdL_bldr.addLeftOuterJoin(t3, t1.insp_no.eq(t3.insp_no));
				lotSchdL_bldr.setWhere(t1.insp_schd_no.eq(bind("fix_no")));

				dbSelect("MSBFL5010_MST_INSP_SCHD_S08", lotSchdL, lotSchdL_bldr, lotUp0L);
			}
			
			if (!arrOrYieldSchdL.isEmpty()) {
				MCIndexKey idx = arrOrYieldSchdL.createIndex(MST_INSP_SCHD_R.$src_no4);
				
				for (InspSchd_Upd04_CndR r : arrOrYieldUp0L) {
					MST_INSP_SCHD_R schdR = arrOrYieldSchdL.getFirst(idx, r.fix_no());
					
					if (isNull(schdR)) continue;
					
					chkNoStkDuringInsp(r, schdR);
					
					r.insp_schd_no(schdR.insp_schd_no());
					r.insp_typ(schdR.insp_typ());
					r.src_no2(schdR.src_no2());
					r.src_no3(schdR.src_no3());
					r.insp_no(schdR.insp_no());
					// 製造検査または受入検査の場合、マスタ適用日にそれぞれの実績日を設定する。
					// このため、受払予定の予定日付にマスタ適用日を設定している。
					r.schd_dt(schdR.master_dt());
					r.end_tm(schdR.getDateNE("END_SCHD_TM"));
					r.base_unit_cd(schdR.base_unit_cd());
				}
			}
			if (!lotSchdL.isEmpty()) {
				MCIndexKey idx = lotSchdL.createIndex(MST_INSP_SCHD_R.$insp_schd_no);
				
				for (InspSchd_Upd04_CndR r : lotUp0L) {
					MST_INSP_SCHD_R schdR = lotSchdL.getFirst(idx, r.fix_no());
					
					if (isNull(schdR)) continue;
					
					chkNoStkDuringInsp(r, schdR);
					
					r.insp_schd_no(schdR.insp_schd_no());
					r.insp_typ(schdR.insp_typ());
					r.insp_no(schdR.insp_no());
					r.schd_dt(schdR.getDateNE("END_SCHD_TM"));
					r.end_tm(schdR.getDateNE("END_SCHD_TM"));
					r.base_unit_cd(schdR.base_unit_cd());
				}
			}
		}
		
		protected void chkNoStkDuringInsp(InspSchd_Upd04_CndR r, MST_INSP_SCHD_R schdR) {
			// 検査が完了している際に在庫が発生した場合のチェック処理
			if (r.base_unit_qty().isPositive() && MSC_INSP_STS_TYP.isJDG(schdR.getStringNE("insp_sts_typ"))) {
				// 判定前の場合には 検査待・検査中在庫の発生を認めない。
				if (MSC_INSP_APRV_STS_TYP.isJUDG_OPN(schdR.getStringNE("insp_aprv_sts_typ"))
						&& (MSC_STK_INSP_TYP.isYET(r.stk_insp_typ()) || MSC_STK_INSP_TYP.isING(r.stk_insp_typ()))) {
					throw new MCAppException(new MCMessage(r, null, MSBFL0037, toDispGUIIndex(r)));
				}
				// 判定済（再検査）の場合には検査中・判定前在庫の発生を認めない。
				else if (MSC_INSP_APRV_STS_TYP.isJUDG_ACPT(schdR.getStringNE("insp_aprv_sts_typ"))
						&& MSC_INSP_JUDG_RSLT_TYP.isRE(schdR.getStringNE("insp_judg_rslt_typ"))
						&& (MSC_STK_INSP_TYP.isING(r.stk_insp_typ()) || MSC_STK_INSP_TYP.isWAIT_JUDG(r.stk_insp_typ()))) {
					throw new MCAppException(new MCMessage(r, null, MSBFL0037, toDispGUIIndex(r)));
				}
				// 判定済（再検査以外）、承認対象外の場合には検査待・検査中・判定前在庫の発生を認めない。
				else if (!MSC_INSP_APRV_STS_TYP.isJUDG_OPN(schdR.getStringNE("insp_aprv_sts_typ"))
						&& !MSC_INSP_JUDG_RSLT_TYP.isRE(schdR.getStringNE("insp_judg_rslt_typ"))
						&& (MSC_STK_INSP_TYP.isYET(r.stk_insp_typ()) || MSC_STK_INSP_TYP.isING(r.stk_insp_typ())
								|| MSC_STK_INSP_TYP.isWAIT_JUDG(r.stk_insp_typ()))) {
					throw new MCAppException(new MCMessage(r, null, MSBFL0037, toDispGUIIndex(r)));
				}
			}
		}
		
		protected void delInspIoSchd() {
			MSBEL_IoSchdService.IoSchd_Del01 o1 = MSBEL_IoSchdService.crtIoSchd_Del01();
			MSBEL_IoSchdService.IoSchd_Del02 o2 = MSBEL_IoSchdService.crtIoSchd_Del02();
			
			
			for (InspSchd_Upd04_CndR up0R : up0()) {
				if (!MSC_STK_INSP_TYP.isFIN(up0R.stk_insp_typ())) {
					if (isNull(up0R.insp_schd_no())) {
						if (MSC_FIX_NO_TYP.isINSP_SCHD_NO(up0R.fix_no_typ())) {
							o1.up0().addAll(getIoSchdDel01(up0R));
						}
						else {
							// 出来高・入荷の削除と同時に検査予定が削除される場合に この分岐に入ることを想定している。
							// （入荷予定が既に削除されているため、入荷予定ＮＯが取得できない。）
							o2.up0().add(getIoSchdDel02(up0R));
						}
					}
					else {
						o1.up0().addAll(getIoSchdDel01(up0R));
					}
				}
			}
			
			if (!o1.up0().isEmpty()) {
				o1.exec();
			}
			if (!o2.up0().isEmpty()) {
				o2.exec();
			}
		}
		
		protected MCList<MSW_IO_SCHD_DEL_R> getIoSchdDel01(InspSchd_Upd04_CndR r) {
			MCList<MSW_IO_SCHD_DEL_R> retL = MCList.create(MSW_IO_SCHD_DEL_R.class);
			
			MSW_IO_SCHD_DEL_R giR = MSW_IO_SCHD_DEL_R.create();
			MSW_IO_SCHD_DEL_R grR = MSW_IO_SCHD_DEL_R.create();
			
			giR.io_schd_typ(MSC_IO_SCHD_TYP.INSP_CMPL_GI.value());
			grR.io_schd_typ(MSC_IO_SCHD_TYP.INSP_CMPL_GR.value());
			
			if (MSC_STK_INSP_TYP.isYET(r.stk_insp_typ())) {
				giR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.YET.value());
				grR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.YET.value());
			}
			else if (MSC_STK_INSP_TYP.isING(r.stk_insp_typ())) {
				giR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.ING.value());
				grR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.ING.value());
			}
			else if (MSC_STK_INSP_TYP.isWAIT_JUDG(r.stk_insp_typ())) {
				giR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.WAIT_JUDG.value());
				grR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.WAIT_JUDG.value());
			}
			
			if (MSC_FIX_NO_TYP.isINSP_SCHD_NO(r.fix_no_typ())) {
				// ロット検査の取消処理では本処理に来る前に検査予定は削除されているので、
				// 上り電文の確定ＮＯ（＝検査予定ＮＯ）を設定する。
				giR.io_schd_no(r.fix_no());
				grR.io_schd_no(r.fix_no());
			}
			else {
				giR.io_schd_no(r.insp_schd_no());
				grR.io_schd_no(r.insp_schd_no());
			}
			
			giR.setAttributes(r);
			grR.setAttributes(r);
			
			retL.add(giR);
			retL.add(grR);
			
			return retL;
		}
		
		protected MSW_IO_SCHD_DEL_R getIoSchdDel02(InspSchd_Upd04_CndR r) {
			MSW_IO_SCHD_DEL_R retR = MSW_IO_SCHD_DEL_R.create();
			
			if (MSC_FIX_NO_TYP.isYIELD_ACT_NO(r.fix_no_typ())) {
				retR.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.YIELD_ACT_NO.value());
				retR.io_schd_sub_no1(r.fix_no());
			}
			else if (MSC_FIX_NO_TYP.isARR_ACT_NO(r.fix_no_typ())) {
				retR.io_schd_sub_typ2(MSC_IO_SCHD_SUB_TYP.ARR_ACT_NO.value());
				retR.io_schd_sub_no2(r.fix_no());
			}
			
			retR.setAttributes(r);
			
			return retR;
		}
		
		protected void insInspIoSchd() {
			MCList<InspSchd_Upd04_CndR> insL = MCList.create(InspSchd_Upd04_CndR.class);
			for (InspSchd_Upd04_CndR up0R : up0()) {
				if (!MSC_STK_INSP_TYP.isFIN(up0R.stk_insp_typ())
						&& !MSC_STK_ID_TYP.isPURC_PRE_ACCPT(up0R.stk_id_typ())
						&& up0R.base_unit_qty().isPositive()) {
					insL.add(up0R);
				}
			}
			
			if (insL.isEmpty()) {
				return;
			}
			
			setSublotMngTyp(insL);
			setVerNo(insL);
			setIoSchdPrNo(insL);
			
			callIoSchdIns01(insL);
		}
		
		protected void setSublotMngTyp(MCList<InspSchd_Upd04_CndR> insL) {
			MCList<InspSchd_Upd04_CndR> gbL = insL.groupBy(InspSchd_Upd04_CndR.$itm_cd,
					InspSchd_Upd04_CndR.$itm_sub1, InspSchd_Upd04_CndR.$itm_sub2, InspSchd_Upd04_CndR.$itm_sub3);
			
			MCList<MAM_ITM_R> itmL = MCList.create(MAM_ITM_R.class);
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder itmL_bldr = MCQueryApiBuilder.create(t);
			itmL_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
			itmL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			itmL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			itmL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			dbSelect("MSBFL5010_MAM_ITM_S01", itmL, itmL_bldr, gbL);
			
			MCIndexKey idxKey = itmL.createIndex(t.getKeyColumn());
			for (InspSchd_Upd04_CndR insR : insL) {
				MAM_ITM_R itmR = itmL.getFirst(idxKey, insR.itm_cd(), insR.itm_sub1(), insR.itm_sub2(), insR.itm_sub3());
				if (!isNull(itmR)) {
					insR.sublot_mng_typ(itmR.sublot_mng_typ());
				}
			}
		}
	
		protected MCList<MST_LOT_R> getLot(MCList<InspSchd_Upd04_CndR> insL) {
			MCList<MST_LOT_R> bindL = MCList.create(MST_LOT_R.class);
			for (InspSchd_Upd04_CndR r : insL) {
				MST_LOT_R bindR = MST_LOT_R.create();
				bindR.itm_cd(r.itm_cd());
				bindR.itm_sub1(r.itm_sub1());
				bindR.itm_sub2(r.itm_sub2());
				bindR.itm_sub3(r.itm_sub3());
				bindR.lot_no(r.lot_no());
				if (MAC_SUBLOT_MNG_TYP.isSTK(r.sublot_mng_typ())) {
					bindR.sublot_no(MAC_STR.NULL_VAL.value());
				}
				else {
					bindR.sublot_no(r.sublot_no());
				}
				bindL.add(bindR);
			}
			MCList<MST_LOT_R> lotL = MCList.create(MST_LOT_R.class);

			if (!bindL.isEmpty()) {
				MCQueryApiBuilder lotL_bldr = MCQueryApiBuilder.create(MST_LOT_R.create("T"));
				dbSelectColumn("MSBFL5010_MST_LOT_S01",
						lotL, lotL_bldr, bindL,
						MST_LOT_R.$itm_cd, MST_LOT_R.$itm_sub1, MST_LOT_R.$itm_sub2,
						MST_LOT_R.$itm_sub3, MST_LOT_R.$lot_no, MST_LOT_R.$sublot_no);
			}

			return lotL;
		}
		
		protected void setVerNo(MCList<InspSchd_Upd04_CndR> insL) {
			MST_LOT_R t = MST_LOT_R.create("T");
			MCList<MST_LOT_R> lotL = getLot(insL);
			MCIndexKey idxKey = lotL.createIndex(t.getKeyColumn());
			
			for (InspSchd_Upd04_CndR insR : insL) {
				MST_LOT_R insLotR = MST_LOT_R.create();
				insLotR.itm_cd(insR.itm_cd());
				insLotR.itm_sub1(insR.itm_sub1());
				insLotR.itm_sub2(insR.itm_sub2());
				insLotR.itm_sub3(insR.itm_sub3());
				insLotR.lot_no(insR.lot_no());
				if (MAC_SUBLOT_MNG_TYP.isSTK(insR.sublot_mng_typ())) {
					insLotR.sublot_no(MAC_STR.NULL_VAL.value());
				}
				else {
					insLotR.sublot_no(insR.sublot_no());
				}
				
				MST_LOT_R lotR = lotL.getFirst(idxKey, insLotR.itm_cd(),
						insLotR.itm_sub1(), insLotR.itm_sub2(), insLotR.itm_sub3(),
						insLotR.lot_no(), insLotR.sublot_no());
				
				if (!isNull(lotR)) {
					insR.ver_no(lotR.ver_no());
				}
			}
		}
		
		protected void setIoSchdPrNo(MCList<InspSchd_Upd04_CndR> insL) {
			MCList<InspSchd_Upd04_CndR> prdctInsL = MCList.create(InspSchd_Upd04_CndR.class);
			MCList<InspSchd_Upd04_CndR> accptInsL = MCList.create(InspSchd_Upd04_CndR.class);
			MCList<InspSchd_Upd04_CndR> lotInsL = MCList.create(InspSchd_Upd04_CndR.class);
			
			for (InspSchd_Upd04_CndR insR : insL) {
				if (MSC_INSP_TYP.isPRDCT(insR.insp_typ())) {
					prdctInsL.add(insR);
				}
				else if (MSC_INSP_TYP.isACCPT(insR.insp_typ())) {
					accptInsL.add(insR);
				}
				else if (MSC_INSP_TYP.isLOT(insR.insp_typ())) {
					lotInsL.add(insR);
				}
			}
			
			setPrdctIoSchdPrNo(prdctInsL);
			setAccptIoSchdPrNo(accptInsL);
			setLotIoSchdPrNo(lotInsL);
		}
		
		protected void setAccptIoSchdPrNo(MCList<InspSchd_Upd04_CndR> insL) {
			if (insL.isEmpty()) {
				return;
			}
			
			MCList<MST_ARR_SCHD_R> asL = MCList.create(MST_ARR_SCHD_R.class);
			MST_ARR_SCHD_R t = MST_ARR_SCHD_R.create("T");
			MCQueryApiBuilder asL_bldr = MCQueryApiBuilder.create(t);
			asL_bldr.setWhere(t.arr_schd_no.eq(bind("src_no3")));
			dbSelect("MSBFL5010_MST_ARR_SCHD_S01", asL, asL_bldr, insL);
			
			for (InspSchd_Upd04_CndR insR : insL) {
				MST_ARR_SCHD_R asR = asL.getFirst(MST_ARR_SCHD_R.$arr_schd_no, insR.src_no3());
				
				if (!isNull(asR)) {
					insR.io_schd_pr_no(asR.io_schd_pr_no());
				}
			}
		}
		
		protected void setPrdctIoSchdPrNo(MCList<InspSchd_Upd04_CndR> insL) {
			if (insL.isEmpty()) {
				return;
			}
			
			MCList<MST_ITM_MFG_INST_R> imiL = MCList.create(MST_ITM_MFG_INST_R.class);
			MST_ITM_MFG_INST_R t = MST_ITM_MFG_INST_R.create("T");
			MCQueryApiBuilder imiL_bldr = MCQueryApiBuilder.create(t);
			imiL_bldr.setWhere(t.itm_mfg_inst_no.eq(bind("src_no2")));
			dbSelect("MSBFL5010_MST_ITM_MFG_INST_S01", imiL, imiL_bldr, insL);
			
			for (InspSchd_Upd04_CndR insR : insL) {
				MST_ITM_MFG_INST_R imiR = imiL.getFirst(MST_ITM_MFG_INST_R.$itm_mfg_inst_no, insR.src_no2());
				
				if (!isNull(imiR)) {
					insR.io_schd_pr_no(imiR.io_schd_pr_no());
				}
			}
		}
		
		protected void setLotIoSchdPrNo(MCList<InspSchd_Upd04_CndR> insL) {
			for (InspSchd_Upd04_CndR insR : insL) {
				insR.io_schd_pr_no(getStrSeq(MSC_NUM_SYS_TYP.IOSCHDPR));
			}
		}
		
		protected void callIoSchdIns01(MCList<InspSchd_Upd04_CndR> insL) {
			MSBEL_IoSchdService.IoSchd_Ins01 o = MSBEL_IoSchdService.crtIoSchd_Ins01();
			
			for (InspSchd_Upd04_CndR insR : insL) {
				IoSchd_Ins01_DtlR oR = IoSchd_Ins01_DtlR.create();
				
				oR.io_schd_typ(MSC_IO_SCHD_TYP.INSP_CMPL_GI.value());
				oR.io_schd_no(insR.insp_schd_no());
				oR.io_schd_seq(null);
				oR.io_schd_sub_typ1(null);
				oR.io_schd_sub_no1(null);
				oR.io_schd_sub_typ2(null);
				oR.io_schd_sub_no2(null);
				oR.io_schd_sub_typ3(null);
				oR.io_schd_sub_no3(null);
				oR.io_schd_sub_typ4(null);
				oR.io_schd_sub_no4(null);
				oR.io_schd_pr_no(insR.io_schd_pr_no());
				oR.schd_dt(insR.schd_dt());
				oR.accpt_schd_dt(null);
				oR.insp_cmpl_schd_dt(insR.end_tm());
				oR.itm_cd(insR.itm_cd());
				oR.itm_sub1(insR.itm_sub1());
				oR.itm_sub2(insR.itm_sub2());
				oR.itm_sub3(insR.itm_sub3());
				oR.ver_no(insR.ver_no());
				oR.alt_grp_cd(null);
				oR.alt_grp_seq(null);
				oR.oper_inst_no(null);
				oR.oper_ord_no(null);
				oR.alt_qty(null);
				oR.alt_itm_typ(null);
				oR.alt_itm_ratio(null);
				oR.alt_alloc_prio(null);
				oR.loc_cd(insR.loc_cd());
				oR.str_ln_cd(insR.str_ln_cd());
				oR.stk_arrv_bp_cd(insR.stk_arrv_bp_cd());
				oR.lot_no(insR.lot_no());
				oR.sublot_no(insR.sublot_no());
				oR.sno1(insR.sno1());
				oR.sno1_null_flg(false);
				oR.sno2(insR.sno2());
				oR.sno2_null_flg(false);
				oR.sno3(insR.sno3());
				oR.sno3_null_flg(false);
				oR.sno4(insR.sno4());
				oR.sno4_null_flg(false);
				oR.trd_unit_cd(insR.pack_unit_cd());
				oR.trd_unit_qty(insR.pack_unit_qty());
				oR.base_unit_cd(insR.base_unit_cd());
				oR.base_unit_qty(insR.base_unit_qty());
				oR.gd_cd(insR.gd_cd());
				oR.quality_typ(insR.quality_typ());
				oR.stk_insp_typ(insR.stk_insp_typ());
				oR.stk_id_typ(insR.stk_id_typ());
				oR.stk_bp_cd(insR.stk_bp_cd());
				oR.alloc_flg(false);
				oR.vld_dt_fr(null);
				oR.vld_dt_to(null);
				oR.inpt_ctl_typ(null);
				
				if (MSC_STK_INSP_TYP.isYET(insR.stk_insp_typ())) {
					oR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.YET.value());
					if (MSC_FIX_NO_TYP.isYIELD_ACT_NO(insR.fix_no_typ())) {
						oR.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.YIELD_ACT_NO.value());
						oR.io_schd_sub_no1(insR.fix_no());
					}
					else if (MSC_FIX_NO_TYP.isARR_ACT_NO(insR.fix_no_typ())) {
						oR.io_schd_sub_typ2(MSC_IO_SCHD_SUB_TYP.ARR_ACT_NO.value());
						oR.io_schd_sub_no2(insR.fix_no());
					}
				}
				else if (MSC_STK_INSP_TYP.isING(insR.stk_insp_typ())) {
					oR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.ING.value());
					oR.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.INSP_NO.value());
					oR.io_schd_sub_no1(insR.insp_no());
				}
				else if (MSC_STK_INSP_TYP.isWAIT_JUDG(insR.stk_insp_typ())) {
					oR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.WAIT_JUDG.value());
					oR.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.INSP_NO.value());
					oR.io_schd_sub_no1(insR.insp_no());
				}
				
				oR.setAttributes(insR);
				o.up0().add(oR);
			}
			
			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}
	}
	/**
	 * InspSchd_Upd01オペレーション.<p>
	 *
	 * 検査関連データの追加・更新・削除をする。<br>
	 */
	public class InspSchd_Upd01 extends MSBFL_InspSchdService_MC_A.InspSchd_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			doMasterCache();
			
			MCList<InspSchd_Upd01_CndR> insUpdL = MCList.create(InspSchd_Upd01_CndR.class);
			MCList<InspSchd_Upd01_CndR> delL = MCList.create(InspSchd_Upd01_CndR.class);
			
			for (InspSchd_Upd01_CndR up0R : up0()) {
				if (isCrtOrUpd(up0R)) {
					insUpdL.add(up0R);
				}
				else if (isDel(up0R)) {
					delL.add(up0R);
				}
			}
			
			if (!insUpdL.isEmpty()) {
				preInsUpd(insUpdL);
			}
			if (!delL.isEmpty()) {
				delMain(delL);
			}
		}
		
		protected void doMasterCache() {
			createLocCache();
			createItmCache();
			createItmUnitCache();
			createBpCache();
			createProvUpriCache();
		}
		
		protected FXUCL_MCDbcCache<MAM_LOC_R> _locCache;
		protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache;
		protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _itmUnitCache;
		protected FXUCL_MCDbcCache<MAM_BP_R> _bpCache;
		protected FXUCL_MCDbcCacheStEnd<MAM_PROV_UPRI_R> _provUpriCache;
		protected boolean _execInspActUpd04CalledFlg;
		
		protected void createLocCache() {
			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.sppl_cd);
			dbc_bldr.addSelect(t.ddlv_prov_insp_flg);
			dbc_bldr.addSelect(t.wg_cd);
			dbc_bldr.addSelect(t.site_cd);
			_locCache = new FXUCL_MCDbcCache<MAM_LOC_R>(dbc_bldr, up0(), InspSchd_Upd01_CndR.$loc_cd);
		}
		
		protected void createItmCache() {
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.dec_place);
			dbc_bldr.addSelect(t.rnd_typ);
			dbc_bldr.addSelect(t.sublot_mng_typ);
			dbc_bldr.addSelect(t.stk_mng_typ);
			dbc_bldr.addSelect(t.sundry_itm_flg);
			_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(dbc_bldr, up0(), InspSchd_Upd01_CndR.$itm_cd,
					InspSchd_Upd01_CndR.$itm_sub1, InspSchd_Upd01_CndR.$itm_sub2, InspSchd_Upd01_CndR.$itm_sub3);
		}
		
		protected void createItmUnitCache() {
			_itmUnitCache = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(
					MCQueryApiBuilder.create(MAVM_ITM_UNIT_R.create("T")), up0(),
					InspSchd_Upd01_CndR.$itm_cd, InspSchd_Upd01_CndR.$itm_sub1, InspSchd_Upd01_CndR.$itm_sub2,
					InspSchd_Upd01_CndR.$itm_sub3, InspSchd_Upd01_CndR.$pack_unit_cd);
		}
		
		protected void createBpCache() {
			MCList<MAM_BP_R> bindL = MCList.create(MAM_BP_R.class);
			for (InspSchd_Upd01_CndR r : up0()) {
				MAM_LOC_R locR = _locCache.get(r.loc_cd());
				if (locR.ddlv_prov_insp_flg()) {
					MAM_BP_R bindR = MAM_BP_R.create();
					bindR.bp_cd(locR.sppl_cd());
					bindL.add(bindR);
				}
			}
			MAM_BP_R t = MAM_BP_R.create("T");
			MCQueryApiBuilder bpL_bldr = MCQueryApiBuilder.create(t);
			bpL_bldr.setSelect(t.cur_cd);
			bpL_bldr.addSelect(t.prov_basis_typ);
			_bpCache = new FXUCL_MCDbcCache<MAM_BP_R>(bpL_bldr, bindL, MAM_BP_R.$bp_cd);
		}
		
		protected void createProvUpriCache() {
			MCList<MAM_PROV_UPRI_R> bindL = MCList.create(MAM_PROV_UPRI_R.class);
			for (InspSchd_Upd01_CndR r : up0()) {
				MAM_LOC_R locR = _locCache.get(r.loc_cd());
				if (locR.ddlv_prov_insp_flg()) {
					MAM_BP_R bpR = _bpCache.get(locR.sppl_cd());
					MAM_PROV_UPRI_R bindR = MAM_PROV_UPRI_R.create();
					bindR.itm_cd(r.itm_cd());
					bindR.itm_sub1(r.itm_sub1());
					bindR.itm_sub2(r.itm_sub2());
					bindR.itm_sub3(r.itm_sub3());
					bindR.prsppl_cd(locR.sppl_cd());
					bindR.cur_cd(bpR.cur_cd());
					bindR.wg_cd(locR.wg_cd());
					bindL.add(bindR);
				}
			}
			MAM_PROV_UPRI_R t = MAM_PROV_UPRI_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.prov_typ);
			_provUpriCache = new FXUCL_MCDbcCacheStEnd<MAM_PROV_UPRI_R>(dbc_bldr, bindL,
					MAM_PROV_UPRI_R.$itm_cd, MAM_PROV_UPRI_R.$itm_sub1,
					MAM_PROV_UPRI_R.$itm_sub2, MAM_PROV_UPRI_R.$itm_sub3,
					MAM_PROV_UPRI_R.$prsppl_cd, MAM_PROV_UPRI_R.$cur_cd,
					MAM_PROV_UPRI_R.$wg_cd);
		}
		
		protected void preInsUpd(MCList<InspSchd_Upd01_CndR> insUpdL) {
			MCList<InspSchd_Upd01_CndR> inspL = MCList.create(InspSchd_Upd01_CndR.class);
			MCList<InspSchd_Upd01_CndR> noInspL = MCList.create(InspSchd_Upd01_CndR.class);
			
			for (InspSchd_Upd01_CndR r : insUpdL) {
				if (isInsp(r)) {
					inspL.add(r);
				}
				else {
					noInspL.add(r);
				}
			}
			
			if (!inspL.isEmpty()) {
				insUpdMain(inspL);
			}
			if (!noInspL.isEmpty()) {
				delMain(noInspL);
			}
		}
		
		protected boolean isInsp(InspSchd_Upd01_CndR r) {
			if (r.not_stk_flg()) {
				return false;
			}
			
			if (isOutLoc(r.loc_cd())) {
				if (!MSC_INSP_TYP.isACCPT(r.insp_typ())) {
					return false;
				}
				// 社外場所に直送する場合、直送支給検査場所への無償支給でなければ検査対象外。
				// ただし、無償受給品の無償支給は他者資産となるため検査対象外とする。
				if (!isDdlvProvInspLoc(r.loc_cd())
						|| (!isFfrProv(r.src_no3(), r.src_no4(), r.act_flg()) && !isOnrProvInpt(r))
						|| MSC_STK_ID_TYP.isNCV_RCV(r.stk_id_typ())) {
					return false;
				}
			}

			if (!isNull(r.dlv_cd())) {
				// 上り電文に納品先ＣＤが設定されている場合は商品の仕入直送のため、検査対象外。
				return false;
			}
			
			// 以下、実績の場合のみチェックを行う
			if (isSame(r.base_unit_qty(), MCNumber.ZERO)) {
				MCList<MST_INSP_SCHD_R> schdL = getAllInspSchdL(r.insp_typ(), r.src_no3(), r.src_no4());
				if (!schdL.isEmpty() && isInspInstructed(schdL) && MAC_QUALITY_TYP.isGOOD(r.quality_typ())) {
					// 抜取検査指図済みの場合は、0実績であっても検査予定を
					// DELETEしないためtrueを返す。
					// ※全数検査の場合は、指図後に出来高数を変更できないので、
					// 本分岐に入ることはない。
					return true;
				}
				return false;
			}
			
			if (MSC_INSP_TYP.isPRDCT(r.insp_typ())) {
				if (isNull(r.quality_typ()) || MAC_QUALITY_TYP.isGOOD(r.quality_typ())) {
					return true;
				}
				// 出来高不良の場合は、検査対象外とする
				return false;
			}
			return true;
		}

		/**
		 * 検査対象とすべきかどうかを返す。
		 * @return
		 */
		protected boolean isInspTgt(InspSchd_Upd01_CndR r) {
			if (!r.exists_itm_insp_flg()) {
				//品目品管マスタが存在しない場合はfalse
				return false;
			}
			return true;
		}

		/**
		 * 社外場所であるかを返す
		 */
		protected boolean isOutLoc(String locCd) {
			MAM_LOC_R locR = _locCache.get(locCd);
			return !isNull(locR.sppl_cd());
		}
		
		/**
		 * 直送支給検査対象場所であるかを返す
		 * @param locCd
		 * @return
		 */
		protected boolean isDdlvProvInspLoc(String locCd) {
			MAM_LOC_R locR = _locCache.get(locCd);
			return locR.ddlv_prov_insp_flg();
		}
		
		/**
		 * 無償支給であるかどうかを返す
		 * @param arrSchdNo
		 * @param arrActNo
		 * @param act_flg
		 * @return
		 */
		protected boolean isFfrProv(String arrSchdNo, String arrActNo, boolean act_flg) {
			String provTyp = null;
			if (act_flg) {
				MCList<MST_PROV_ACT_R> paL = MCList.create(MST_PROV_ACT_R.class);
				MST_PROV_ACT_R t = MST_PROV_ACT_R.create("T");
				MCQueryApiBuilder paL_bldr = MCQueryApiBuilder.create(t);
				paL_bldr.setSelect(t.prov_typ);
				paL_bldr.setWhere(t.prov_src_act_typ.eq(bind("1")), MSC_PROV_SRC_ACT_TYP.DDLV.value());
				paL_bldr.addWhereWithAnd(t.prov_src_act_no.eq(bind("1")), arrActNo);
				paL_bldr.addWhereWithAnd(t.slip_sts_typ.eq(bind("1")), MAC_SLIP_STS_TYP.CRT.value());
				dbSelect("MSBFL5010_MST_PROV_ACT_S02", paL, paL_bldr);
				
				if (!paL.isEmpty()) provTyp = paL.get(0).prov_typ();
				
				if (isNull(provTyp)) {
					// 入荷時に同時計上していないと、支給実績が作成されていない場合があるので支給予定で評価する。
					MST_PROV_SCHD_R psR = MST_PROV_SCHD_R.create();
					MST_PROV_SCHD_R t1 = MST_PROV_SCHD_R.create("T");
					MCQueryApiBuilder psR_bldr = MCQueryApiBuilder.create(t1);
					psR_bldr.setSelect(t1.prov_typ);
					psR_bldr.setWhere(t1.prov_src_schd_typ.eq(bind("1")), MSC_PROV_SRC_SCHD_TYP.DDLV.value());
					psR_bldr.addWhereWithAnd(t1.prov_src_schd_no2.eq(bind("1")), arrSchdNo);
					dbSelect("MSBFL5010_MST_PROV_SCHD_S02", psR, psR_bldr);
					
					provTyp = psR.prov_typ();
				}
			}
			else {
				MST_PROV_SCHD_R psR = MST_PROV_SCHD_R.create();
				MST_PROV_SCHD_R t = MST_PROV_SCHD_R.create("T");
				MCQueryApiBuilder psR_bldr = MCQueryApiBuilder.create(t);
				psR_bldr.setSelect(t.prov_typ);
				psR_bldr.setWhere(t.prov_src_schd_typ.eq(bind("1")), MSC_PROV_SRC_SCHD_TYP.DDLV.value());
				psR_bldr.addWhereWithAnd(t.prov_src_schd_no2.eq(bind("1")), arrSchdNo);
				dbSelect("MSBFL5010_MST_PROV_SCHD_S03", psR, psR_bldr);

				provTyp = psR.prov_typ();
			}
			
			return MAC_PROV_TYP.isFFR_PROV(provTyp);
		}
		
		protected MCList<MST_INSP_SCHD_R> getAllInspSchdL(String inspTyp, String srcNo3, String srcNo4) {
			MCList<MST_INSP_SCHD_R> schdL = MCList.create(MST_INSP_SCHD_R.class);
			MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(t);

			if (!isNull(srcNo4)) {
				schdL_bldr.setWhere(t.insp_typ.eq(bind("1")), inspTyp);
				schdL_bldr.addWhereWithAnd(t.src_no4.eq(bind("1")), srcNo4);
				int cnt = dbSelect("MSBFL5010_MST_INSP_SCHD_S09", schdL, schdL_bldr);
				if (cnt > 0) {
					return schdL;
				}
			}
			
			schdL_bldr.setWhere(t.insp_typ.eq(bind("1")), inspTyp);
			schdL_bldr.addWhereWithAnd(t.src_no3.eq(bind("1")), srcNo3);
			schdL_bldr.addWhereWithAnd(t.src_no4.isNull());
			dbSelect("MSBFL5010_MST_INSP_SCHD_S10", schdL, schdL_bldr);
			return schdL;
		}
		
		protected boolean isInspInstructed(MCList<MST_INSP_SCHD_R> schdL) {
			MCList<MST_INSP_SCHD_R> tmpL = schdL.subList(
					MST_INSP_SCHD_R.$insp_schd_sts_typ, MSC_INSP_STS_TYP.ORD.value());

			return !tmpL.isEmpty();
		}
		
		protected void delMain(MCList<InspSchd_Upd01_CndR> delL) {
			MCList<MST_INSP_SCHD_R> schdDelL = MCList.create(MST_INSP_SCHD_R.class);
			
			for (InspSchd_Upd01_CndR r : delL) {
				MST_INSP_SCHD_R delR = MST_INSP_SCHD_R.create();
				delR.insp_typ(r.insp_typ());
				delR.src_no3(r.src_no3());
				delR.src_no4(r.src_no4());
				
				schdDelL.add(delR);
			}
			
			delInspSchd(schdDelL);
		}
		
		protected void delInspSchd(MCList<MST_INSP_SCHD_R> schdL) {
			MCList<MST_INSP_SCHD_R> schdDelL = MCList.create(MST_INSP_SCHD_R.class);
			
			schdDelL.setAll(getLatestInspSchdBySrcNo4(schdL));
			schdDelL.addAll(getLatestInspSchdBySrcNo3(schdL));
			
			if (!schdDelL.isEmpty()) {
				MCQueryApiBuilder schdDelL_bldr = MCQueryApiBuilder.create(MST_INSP_SCHD_R.create("T"));
				dbDeleteKey("MSBFL5010_MST_INSP_SCHD_D01", schdDelL, schdDelL_bldr);
			}
		}
		
		protected MCList<MST_INSP_SCHD_R> getLatestInspSchdBySrcNo4(MCList<MST_INSP_SCHD_R> bindL) {
			MCList<MST_INSP_SCHD_R> schdL = MCList.create(MST_INSP_SCHD_R.class);
			MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder schdR_bldr = MCQueryApiBuilder.create(t);

			schdR_bldr.setWhere(t.insp_typ.eq(bind("insp_typ")));
			schdR_bldr.addWhereWithAnd(t.src_no4.eq(bind("src_no4")));
			schdR_bldr.addConstWhereWithAnd(t.latest_flg.eq(value(true)));
			dbSelect("MSBFL5010_MST_INSP_SCHD_S11", schdL, schdR_bldr,
					bindL.subList(r->!isNull(r.src_no4())).groupBy(MST_INSP_SCHD_R.$insp_typ, MST_INSP_SCHD_R.$src_no4));

			return schdL;
		}
		
		protected MCList<MST_INSP_SCHD_R> getLatestInspSchdBySrcNo3(MCList<MST_INSP_SCHD_R> bindL) {
			MCList<MST_INSP_SCHD_R> schdL = MCList.create(MST_INSP_SCHD_R.class);
			MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder schdR_bldr = MCQueryApiBuilder.create(t);

			schdR_bldr.setWhere(t.insp_typ.eq(bind("insp_typ")));
			schdR_bldr.addWhereWithAnd(t.src_no3.eq(bind("src_no3")));
			schdR_bldr.addConstWhereWithAnd(t.src_no4.isNull());
			schdR_bldr.addConstWhereWithAnd(t.latest_flg.eq(value(true)));
			dbSelect("MSBFL5010_MST_INSP_SCHD_S12", schdL, schdR_bldr,
					bindL.groupBy(MST_INSP_SCHD_R.$insp_typ, MST_INSP_SCHD_R.$src_no3));

			return schdL;
		}
		
		protected boolean isCrtOrUpd(InspSchd_Upd01_CndR r) {
			return (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()))
					|| (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ()));
		}
		
		protected boolean isCrt(InspSchd_Upd01_CndR r) {
			return (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()));
		}
		
		protected boolean isDel(InspSchd_Upd01_CndR r) {
			return (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));
		}
		
		protected void insUpdMain(MCList<InspSchd_Upd01_CndR> insUpdL) {
			//検査実績の登録・更新用のリスト
			MCList<InspSchd_Upd01_CndR> tgtL = MCList.create(InspSchd_Upd01_CndR.class);
			//抜取検査実績更新用のリスト
			MCList<InspSchd_Upd01_CndR> InspActL = MCList.create(InspSchd_Upd01_CndR.class);
			
			setPegNo(insUpdL);
			
			createItmInspCache(insUpdL);
			setItmInspData(insUpdL);
			
			insOrUpdInspSchd(insUpdL);
			
			//更新対象のリストを選択
			setProcTgtL(insUpdL, tgtL);
			
			//出来高の登録と同時に、ロット・サブロット単位の検査予定が新規に登録された場合、
			//まとめ可能な検査指図が存在すれば、その検査指図に紐づく検査実績を登録する。
			callInspActUpd04(tgtL);
			
			MCList<MST_INSP_SCHD_R> schdL = MCList.create(MST_INSP_SCHD_R.class);
			MCList<MST_INSP_SCHD_R> actL = MCList.create(MST_INSP_SCHD_R.class);
			
			// insOrUpdInspSchdで更新した内容を再取得
			setInspSchdL(tgtL, schdL, actL);
			
			MCIndexKey schdKey = schdL.createIndex(
					MST_INSP_SCHD_R.$src_no3, MST_INSP_SCHD_R.$insp_typ, MST_INSP_SCHD_R.$latest_flg);
			MCIndexKey actKey = actL.createIndex(
					MST_INSP_SCHD_R.$src_no4, MST_INSP_SCHD_R.$insp_typ, MST_INSP_SCHD_R.$latest_flg);
			
			for (InspSchd_Upd01_CndR r : tgtL) {
				//検査予定作成元に対する最新の検査回数の検査予定を取得
				MST_INSP_SCHD_R schdR = getLatestInspSchdRIdx(schdL, actL, schdKey, actKey,
						r.insp_typ(), r.src_no3(), r.src_no4());
				
				//最新の検査回数の検査予定ＮＯ、参照検査ＮＯを保持
				r.latest_insp_schd_no(schdR.insp_schd_no());
				r.latest_own_insp_schd_no(schdR.own_insp_schd_no());
				
				if (r.act_flg() && MSC_INSP_TYP.isPRDCT(r.insp_typ())) {
					InspActL.add(r);
				}
			}
			
			if (!InspActL.isEmpty()) {
				MCList<MST_INSP_SCHD_R> schdAllL = MCList.create(MST_INSP_SCHD_R.class);
				schdAllL.addAll(schdL);
				schdAllL.addAll(actL);
				schdAllL.sort(MST_INSP_SCHD_R.$insp_freq, MST_INSP_SCHD_R.$insp_no);
				updInspActMain(InspActL, schdAllL);
			}
		}

		protected void updInspActMain(MCList<InspSchd_Upd01_CndR> inspActL, MCList<MST_INSP_SCHD_R> schdL) {
			//工場出荷承認の削除用のリスト
			MCList<InspSchd_Upd01_CndR> plntAprvDelList = MCList.create(InspSchd_Upd01_CndR.class);
			//工場出荷承認の追加用のリスト
			MCList<InspSchd_Upd01_CndR> plntAprvInsList = MCList.create(InspSchd_Upd01_CndR.class);
			
			MCList<InspSchd_Upd01_CndR> innerInspActL = MCList.create(InspSchd_Upd01_CndR.class);
			MCIndexKey schdIdx = schdL.createIndex(MST_INSP_SCHD_R.$src_no1, MST_INSP_SCHD_R.$src_no2, MST_INSP_SCHD_R.$src_no3, MST_INSP_SCHD_R.$src_no4);
			for (InspSchd_Upd01_CndR r : inspActL) {
				// 新規追加の出来高実績に対する検査実績情報がない場合、各検査実績明細は登録しない。
				MST_INSP_SCHD_R schdR = schdL.getFirst(schdIdx, r.src_no1(), r.src_no2(), r.src_no3(), r.src_no4());
				if (isNull(schdR) || isNull(schdR.insp_no())) {
					continue;
				}
				MAM_ITM_R itmR = _itmCache.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				MAVM_ITM_UNIT_R itmUnitR = _itmUnitCache.get(
						r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.pack_unit_cd());
				if (!isNull(itmUnitR)) {
					r.pack_unit_dmn_qty(itmUnitR.conv_base_qty());
					r.pack_unit_conv_qty(itmUnitR.conv_qty());
					r.base_unit_dec_place(itmR.dec_place());
					r.base_unit_rnd_typ(itmR.rnd_typ());
				}
				innerInspActL.add(r);
			}

			// 検査各実績明細の登録
			for (MCList<MST_INSP_SCHD_R> schdGL : schdL.groupList(MST_INSP_SCHD_R.$insp_no)) {
				MST_INSP_SCHD_R schdR = schdGL.get(0);
				if (isNull(schdR.insp_no())) {
					continue;
				}
				MST_INSP_ACT_R actR = getInspActR(schdR.insp_no());
				
				MCList<InspSchd_Upd01_CndR> subInspActL = MCList.create(InspSchd_Upd01_CndR.class);
				// 検査実施単位区分がロット・サブロット単位の場合、schdGLが複数件になる
				for (MST_INSP_SCHD_R r : schdGL) {
					InspSchd_Upd01_CndR subInspActR = innerInspActL.getFirst(InspSchd_Upd01_CndR.$src_no4, r.src_no4());
					if (!isNull(subInspActR)) {
						subInspActL.add(subInspActR);
					}
				}
				callInspActUpd03(subInspActL, actR);
				updGoodAndDfctQty(actR);
			}

			for (InspSchd_Upd01_CndR r : inspActL) {
				// 最新FLGのレコードを取得しているので、actLは0件または1件の想定
				MCList<MST_INSP_ACT_R> actL = getInspActL(r.insp_typ(), r.src_no3(), r.src_no4(), true);
				
				if (actL.isEmpty()) {
					continue;
				}
				MST_INSP_ACT_R actR = actL.get(0);
				r.latest_insp_no(actR.insp_no());
				
				//工場出荷承認トランは、再検査の場合は更新しない。
				if (isInspFin(actR)) {
					//工場出荷承認トランは削除→追加で更新する仕様。
					plntAprvDelList.add(r);
					if (!isNull(actR.getStringNE("INSP_APRV_STS_TYP"))) {
						plntAprvInsList.add(r);
					}
					else if (MAC_QUALITY_TYP.isGOOD(actR.quality_typ())) {
						plntAprvInsList.add(r);
					}
				}
			}
			
			//工場出荷承認トラン削除
			if (!plntAprvDelList.isEmpty()) {
				execPlntAprvServiceDel(plntAprvDelList);
			}
			//工場出荷承認トラン追加
			if (!plntAprvInsList.isEmpty()) {
				execPlntAprvService(plntAprvInsList);
			}
		}

		protected void updGoodAndDfctQty(MST_INSP_ACT_R upActR) {
			// 検査実績明細を更新した後に基準単位数量、良品数量と不良品数量を算出する。
			MCList<MST_INSP_ACT_D_R> actdL = MCList.create(MST_INSP_ACT_D_R.class);
			MST_INSP_ACT_D_R t = MST_INSP_ACT_D_R.create("T");
			MCQueryApiBuilder actdL_bldr = MCQueryApiBuilder.create(t);
			actdL_bldr.setWhere(t.insp_act_no.eq(bind("1")), upActR.insp_act_no());
			dbSelect("MSBFL5010_MST_INSP_ACT_D_S01", actdL, actdL_bldr);

			MCIndexKey idx = actdL.createIndex(MST_INSP_ACT_D_R.$quality_typ);
			MST_INSP_ACT_R actR = MST_INSP_ACT_R.create();
			MCList<MST_INSP_ACT_D_R> goodActdL = actdL.subList(idx, MAC_QUALITY_TYP.GOOD.value());
			MCList<MST_INSP_ACT_D_R> dfctActdL = actdL.subList(idx, MAC_QUALITY_TYP.DFCT_INSP.value());
			
			actR.insp_act_no(upActR.insp_act_no());
			actR.good_qty(getSumOfBaseUnitQty(goodActdL));
			actR.dfct_qty(getSumOfBaseUnitQty(dfctActdL));
			actR.base_unit_qty(actR.good_qty().add(actR.dfct_qty()));
			
			MST_INSP_ACT_R t1 = MST_INSP_ACT_R.create("T");
			MCQueryApiBuilder actR_bldr = MCQueryApiBuilder.create(t1);
			actR_bldr.setSet(t1.base_unit_qty);
			actR_bldr.addSet(t1.good_qty);
			actR_bldr.addSet(t1.dfct_qty);
			dbUpdateKey("MSBFL5010_MST_INSP_ACT_U01", actR, actR_bldr);
		}
		protected MCNumber getSumOfBaseUnitQty(MCList<MST_INSP_ACT_D_R> actdL) {
			if (actdL.isEmpty()) {
				return MCNumber.ZERO;
			}
			else {
				return actdL.sum(MST_INSP_ACT_D_R.$base_unit_qty);
			}
		}
		protected MCList<MST_STK_R> getStkL(MCList<InspSchd_Upd01_CndR> inspActL) {
			MCList<MST_STK_R> stkL = MCList.create(MST_STK_R.class);
			MST_STK_R t = MST_STK_R.create("T");
			MCQueryApiBuilder stkL_bldr = MCQueryApiBuilder.create(t);
			MSVT_WRK_SNO_R t2 = MSVT_WRK_SNO_R.create("T2");
			MAM_LOC_R m1 = MAM_LOC_R.create("M1");
			MAM_STR_LN_R m2 = MAM_STR_LN_R.create("M2");
			MAM_BP_R m3 = MAM_BP_R.create("M3");
			MAM_STK_GD_R m4 = MAM_STK_GD_R.create("M4");
			MAM_BP_R m5 = MAM_BP_R.create("M5");
			MAM_UNIT_R m6 = MAM_UNIT_R.create("M6");
			MAVM_ITM_UNIT_R m7 = MAVM_ITM_UNIT_R.create("M7");
			stkL_bldr.addSelect(m1.loc_nm);
			stkL_bldr.addSelect(m1.str_ln_tgt_flg);
			stkL_bldr.addSelect(m2.str_ln_nm);
			stkL_bldr.addSelect(m3.bp_nm.as("stk_arrv_bp_nm"));
			stkL_bldr.addSelect(m4.gd_nm);
			stkL_bldr.addSelect(m5.bp_nm.as("stk_bp_nm"));
			stkL_bldr.addSelect(t2.wrk_no);
			stkL_bldr.addSelect(m6.unit_nm.as("stk_pack_unit_nm"));
			stkL_bldr.addSelect(m6.dec_place.as("stk_pack_unit_dec_place"));
			stkL_bldr.addSelect(m7.conv_base_qty.as("stk_pack_unit_dmn_qty"));
			stkL_bldr.addSelect(m7.conv_qty.as("stk_pack_unit_conv_qty"));
			stkL_bldr.addSelect(m6.rnd_typ.as("stk_pack_unit_rnd_typ"));
			stkL_bldr.addLeftOuterJoin(t2, bracket( t.sno1.eq(t2.sno1)));
			stkL_bldr.addLeftOuterJoin(m1, bracket( t.loc_cd.eq(m1.loc_cd)));
			stkL_bldr.addLeftOuterJoin(m2, bracket( t.loc_cd.eq(m2.loc_cd)
					.and(t.str_ln_cd.eq(m2.str_ln_cd))));
			stkL_bldr.addLeftOuterJoin(m3, bracket( t.stk_arrv_bp_cd.eq(m3.bp_cd)));
			stkL_bldr.addLeftOuterJoin(m4, bracket( t.gd_cd.eq(m4.gd_cd)));
			stkL_bldr.addLeftOuterJoin(m5, bracket( t.stk_bp_cd.eq(m5.bp_cd)));
			stkL_bldr.addLeftOuterJoin(m6, bracket( t.pack_unit_cd.eq(m6.unit_cd)));
			stkL_bldr.addLeftOuterJoin(m7, bracket( t.itm_cd.eq(m7.itm_cd)
					.and(t.itm_sub1.eq(m7.itm_sub1))
					.and(t.itm_sub2.eq(m7.itm_sub2))
					.and(t.itm_sub3.eq(m7.itm_sub3))
					.and(t.pack_unit_cd.eq(m7.unit_cd))));
			stkL_bldr.setWhere(t.fix_no_typ.eq(value(MSC_FIX_NO_TYP.YIELD_ACT_NO.value())));
			stkL_bldr.addWhereWithAnd(t.fix_no.eq(bind("src_no4")));

			dbSelect("MSBFL5010_MST_STK_S01", stkL, stkL_bldr, inspActL);
			
			return stkL;
		}

		protected void execPlntAprvServiceDel(MCList<InspSchd_Upd01_CndR> list) {
			MSBFL_PlntAprvService.PlntAprv_Upd01 o = MSBFL_PlntAprvService.crtPlntAprv_Upd01();
			
			for (InspSchd_Upd01_CndR r : list) {
				MCList<MST_PLNT_APRV_D_R> delL = MCList.create(MST_PLNT_APRV_D_R.class);
				MST_PLNT_APRV_D_R t = MST_PLNT_APRV_D_R.create("T");
				MCQueryApiBuilder delL_bldr = MCQueryApiBuilder.create(t);
				delL_bldr.setSelect(t.plnt_aprv_d_no);
				delL_bldr.addSelect(t.plnt_aprv_no);
				delL_bldr.setWhere(t.insp_no.eq(bind("1")), r.latest_insp_no());
				delL_bldr.addWhereWithAnd(t.src_no3.eq(bind("1")), r.src_no3());
				delL_bldr.addWhereWithAnd(bracket( t.src_no4.eq(bind("1"))
						.or(t.src_no4.isNull())), r.src_no4());
				dbSelect("MSBFL5010_MST_PLNT_APRV_D_S03", delL, delL_bldr);
				
				for (MST_PLNT_APRV_D_R delR : delL) {
					PlntAprv_Chk01_RsltR oUpR = PlntAprv_Chk01_RsltR.create();
					oUpR.setAttributes(r);
					
					oUpR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					oUpR.plnt_aprv_no(delR.plnt_aprv_no());
					oUpR.plnt_aprv_d_no(delR.plnt_aprv_d_no());
					// 工場出荷承認サービスではリクエストオブジェクトで場所マスタをキャッシュしている。
					// 本処理からはDEL⇒ADDで呼び出すが、最初のDELの呼出時にキャッシュするように
					// 場所ＣＤを設定している。（ADD呼出時には再キャッシュされないため。）
					oUpR.loc_cd(r.loc_cd());
					oUpR.setAttributes(r);
					
					o.up0().add(oUpR);
				}
			}
			
			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}
		
		protected void execPlntAprvService(MCList<InspSchd_Upd01_CndR> list) {
			MSBFL_PlntAprvService.PlntAprv_Upd01 o = MSBFL_PlntAprvService.crtPlntAprv_Upd01();
			for (InspSchd_Upd01_CndR r : list) {
				PlntAprv_Chk01_RsltR oUpR = PlntAprv_Chk01_RsltR.create();
				oUpR.setAttributes(r);
				
				oUpR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				oUpR.plnt_aprv_no(null);
				oUpR.plnt_aprv_d_no(null);
				oUpR.insp_typ(r.insp_typ());
				oUpR.insp_no(r.latest_insp_no());
				oUpR.src_no1(r.src_no1());
				oUpR.src_no2(r.src_no2());
				oUpR.src_no3(r.src_no3());
				oUpR.src_no4(r.src_no4());
				oUpR.itm_cd(r.itm_cd());
				oUpR.itm_sub1(r.itm_sub1());
				oUpR.itm_sub2(r.itm_sub2());
				oUpR.itm_sub3(r.itm_sub3());
				oUpR.lot_no(r.lot_no());
				oUpR.sublot_no(r.sublot_no());
				oUpR.loc_cd(r.loc_cd());
				oUpR.setAttributes(r);
				
				o.up0().add(oUpR);
			}
			
			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}
		
		protected boolean isInspFin(MST_INSP_ACT_R actR) {
			if (MSC_INSP_STS_TYP.isJDG(actR.getStringNE("INSP_STS_TYP"))) {
				if (!isSame(actR.getStringNE("PLNT_APRV_FLG"), "1")) {
					return false;
				}
				
				if (!isNull(actR.getStringNE("INSP_APRV_STS_TYP")) &&
						(!MSC_INSP_APRV_STS_TYP.isJUDG_ACPT(actR.getStringNE("INSP_APRV_STS_TYP")) 
								|| !MSC_INSP_JUDG_RSLT_TYP.is_stk_good(actR.insp_judg_rslt_typ()))) {
					return false;
				}
				return true;
			}
			return false;
		}
		protected void callInspActUpd03(MCList<InspSchd_Upd01_CndR> inspActL, MST_INSP_ACT_R actR) {
			
			if (isNull(actR.insp_act_no()) || inspActL.isEmpty()) {
				return ;
			}

			MSBFL_InspActService.InspAct_Upd03 o = MSBFL_InspActService.crtInspAct_Upd03();
			// ヘッダ
			InspAct_Upd03_HdrR oR = InspAct_Upd03_HdrR.create();
			oR.insp_act_no(actR.insp_act_no());
			oR.insp_no(actR.insp_no());
			oR.arr_act_no(null);
			oR.insp_smpl_act_upd_flg(true);
			oR.setAttributes(inspActL.get(0));

			o.up0().add(oR);
			MCList<MST_INSP_SCHD_R> schdL = MCList.create(MST_INSP_SCHD_R.class);
			MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(t);
			schdL_bldr.setSelect(t.insp_schd_no, t.src_no4);
			schdL_bldr.setWhere(t.src_no4.eq(bind("src_no4")));
			schdL_bldr.addWhereWithAnd(t.insp_typ.eq(bind("insp_typ")));
			dbSelect("MSBFL5010_MST_INSP_SCHD_S13", schdL, schdL_bldr, inspActL);
			
			MCIndexKey idxkey = inspActL.createIndex(InspSchd_Upd01_CndR.$src_no4);
			for (MST_INSP_SCHD_R schdR : schdL) {
				InspSchd_Upd01_CndR cndR = inspActL.getFirst(idxkey, schdR.src_no4());
				InspAct_Upd03_Yield_DtlR dtlR = InspAct_Upd03_Yield_DtlR.create();
				dtlR.insp_schd_no(schdR.insp_schd_no());
				dtlR.yield_act_no(schdR.src_no4());
				dtlR.ac_dt(cndR.ac_dt());
				dtlR.can_ac_dt(cndR.can_ac_dt());
				dtlR.setAttributes(cndR);
				o.up4().add(dtlR);
			}
			//  検査中ロット使用許可品の場合、検査着手明細は登録しない。
			if (isInPrmtInspSchd(inspActL.get(0))) {
				if (!_execInspActUpd04CalledFlg) {
					o.exec();
				}
				return;
			}
			if (MSC_INSP_STS_TYP.isSTR(actR.getStringNE("INSP_STS_TYP"))) {
				o.up1().addAll(getSttD(inspActL, actR));
			}
			else if (MSC_INSP_STS_TYP.isJDG(actR.getStringNE("INSP_STS_TYP"))
					&& (isNull(actR.getStringNE("INSP_APRV_STS_TYP")) ||
							MSC_INSP_APRV_STS_TYP.isJUDG_OPN(actR.getStringNE("INSP_APRV_STS_TYP")))) {
				o.up1().addAll(getSttD(inspActL, actR));
				if (MAC_INSP_MTD_TYP.isTTL(actR.insp_mtd_typ())) {
					o.up2().addAll(getActDWithTtl(inspActL, actR));
				}
				else {
					o.up2().addAll(getActD(inspActL, actR, oR));
				}
			}
			else if (MSC_INSP_STS_TYP.isJDG(actR.getStringNE("INSP_STS_TYP"))
					&& MSC_INSP_APRV_STS_TYP.isJUDG_ACPT(actR.getStringNE("INSP_APRV_STS_TYP"))) {
				o.up1().addAll(getSttD(inspActL, actR));
				if (MAC_INSP_MTD_TYP.isTTL(actR.insp_mtd_typ())) {
					o.up2().addAll(getActDWithTtl(inspActL, actR));
					o.up3().addAll(getJudgDWithTtl(inspActL, actR));
				}
				else {
					o.up2().addAll(getActD(inspActL, actR, oR));
					o.up3().addAll(getJudgD(inspActL, actR));
				}
			}
			if (!o.up0().isEmpty() && (!o.up1().isEmpty() || !o.up2().isEmpty() || !o.up3().isEmpty())) {
				o.exec();
			}
		}

		protected MCDate getCanAcDt(MCDate oldAcDt, MCDate yieldCanAcDt) {
			if (oldAcDt.lt(yieldCanAcDt) && getStkClYm().gte(getAcYm(oldAcDt))) {
				return yieldCanAcDt;
			}
			return oldAcDt;
		}
		protected MCList<InspAct_Upd03_Stt_DtlR> getSttD(MCList<InspSchd_Upd01_CndR> L, MST_INSP_ACT_R actR) {
			MCList<InspAct_Upd03_Stt_DtlR> retL = MCList.create(InspAct_Upd03_Stt_DtlR.class);
			for (InspSchd_Upd01_CndR r : L) {
				InspAct_Upd03_Stt_DtlR retR = InspAct_Upd03_Stt_DtlR.create();
				MST_INSP_STT_D_R sttdR = getInspSttDL(r, actR.insp_act_no());
				
				// 手配ＮＯ1～4をリストsnoLの0～3で管理する
				List<String> snoL = new ArrayList<String>();
				setSno(r, snoL);
				
				retR.data_crud_typ(r.data_crud_typ());
				// 更新（data_crud_typ=2)かつ検査着手明細ＮＯがNULLの場合、データ更新区分を「新規」にする
				//  ※以下のケースで発生する。
				//    出来高実績登録(数量>0)→検査指図→出来高実績訂正(数量=0)→検査実績→
				//    出来高実績訂正(数量>0)の順に処理した場合
				if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ()) && isNull(sttdR.insp_stt_d_no())) {
					retR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				if (isSkipInspActUpd03(sttdR.insp_stt_d_no(), r)) {
					continue;
				}
				
				if (isNull(sttdR.insp_stt_d_no())) {
					retR.insp_stt_d_no(null);
				}
				else {
					retR.insp_stt_d_no(sttdR.insp_stt_d_no());
				}
				retR.insp_act_no(actR.insp_act_no());
				retR.itm_cd(r.itm_cd());
				retR.itm_sub1(r.itm_sub1());
				retR.itm_sub2(r.itm_sub2());
				retR.itm_sub3(r.itm_sub3());
				retR.loc_cd(r.loc_cd());
				retR.str_ln_cd(r.str_ln_cd());
				retR.stk_arrv_bp_cd(r.stk_arrv_bp_cd());
				retR.gd_cd(r.gd_cd());
				retR.quality_typ(r.quality_typ());
				retR.stk_insp_typ(MSC_STK_INSP_TYP.ING.value());
				retR.stk_id_typ(r.stk_id_typ());
				retR.stk_bp_cd(r.bp_cd());
				retR.lot_no(r.lot_no());
				retR.sublot_no(r.sublot_no());
				retR.sno1(snoL.get(0));
				retR.sno1_mng_typ(r.sno1_mng_typ());
				retR.sno2(snoL.get(1));
				retR.sno2_mng_typ(r.sno2_mng_typ());
				retR.sno3(snoL.get(2));
				retR.sno3_mng_typ(r.sno3_mng_typ());
				retR.sno4(snoL.get(3));
				retR.sno4_mng_typ(r.sno4_mng_typ());
				if (MSC_INSP_TYP.isPRDCT(r.insp_typ())) {
					retR.fix_no_typ(MSC_FIX_NO_TYP.YIELD_ACT_NO.value());
					retR.fix_no(r.src_no4());
				}
				else if (MSC_INSP_TYP.isACCPT(MSC_FIX_NO_TYP.ARR_ACT_NO.value())) {
					retR.fix_no_typ(MSC_FIX_NO_TYP.ARR_ACT_NO.value());
					retR.fix_no(r.src_no4());
				}
				
				if (isNull(sttdR.insp_stt_d_no())) {
					retR.pack_unit_qty(r.diff_pack_unit_qty());
					retR.pack_unit_cd(r.pack_unit_cd());
					retR.base_unit_qty(
							convToBaseUnit(r.diff_pack_unit_qty(), r.pack_unit_dmn_qty(),
									r.pack_unit_conv_qty(), r.base_unit_dec_place(), r.base_unit_rnd_typ()));
					retR.base_unit_cd(r.base_unit_cd());
				}
				else {
					retR.pack_unit_qty(sttdR.pack_unit_qty().add(r.diff_pack_unit_qty()));
					retR.pack_unit_cd(r.pack_unit_cd());
					retR.base_unit_qty(sttdR.base_unit_qty().add(
							convToBaseUnit(r.diff_pack_unit_qty(), r.pack_unit_dmn_qty(),
									r.pack_unit_conv_qty(), r.base_unit_dec_place(), r.base_unit_rnd_typ())));
					retR.base_unit_cd(r.base_unit_cd());
				}
				// 着手明細が新規作成、更新の場合、計上日を設定する
				if (isNull(sttdR.insp_stt_d_no()) || sttdR.ac_dt().lt(r.ac_dt())) {
					retR.ac_dt(r.ac_dt());
				}
				else {
					retR.ac_dt(sttdR.ac_dt());
				}
				// 着手明細が新規作成でない場合、取消計上日を設定する
				if (!isNull(sttdR.insp_stt_d_no())) {
					retR.can_ac_dt(getCanAcDt(sttdR.ac_dt(), r.can_ac_dt()));
				}
				retR.sub_char1();
				retR.sub_char2();
				retR.sub_char3();
				
				retR.setAttributes(r);
				
				retL.add(retR);
			}
			
			return retL;
		}
		
		protected MCList<InspAct_Upd03_Act_DtlR> getActD(MCList<InspSchd_Upd01_CndR> L, MST_INSP_ACT_R actR, InspAct_Upd03_HdrR oR) {
			MCList<InspAct_Upd03_Act_DtlR> retL = MCList.create(InspAct_Upd03_Act_DtlR.class);
			
			// 抜取情報を取得する。
			MCList<MST_INSP_SMPL_ACT_R> smplL = MCList.create(MST_INSP_SMPL_ACT_R.class);
			MST_INSP_SMPL_ACT_R t = MST_INSP_SMPL_ACT_R.create("T");
			MCQueryApiBuilder smplL_bldr = MCQueryApiBuilder.create(t);
			smplL_bldr.setWhere(t.insp_act_no.eq(bind("1")), actR.insp_act_no());
			dbSelect("MSBFL5010_MST_INSP_SMPL_ACT_S01", smplL, smplL_bldr);

			MCList<MST_INSP_SCHD_R> schdL = MCList.create(MST_INSP_SCHD_R.class);
			MST_INSP_SCHD_R t1 = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(t1);
			schdL_bldr.setWhere(t1.insp_no.eq(bind("1")), actR.insp_no());
			dbSelect("MSBFL5010_MST_INSP_SCHD_S14", schdL, schdL_bldr);
			
			MCIndexKey idx = L.createIndex(InspSchd_Upd01_CndR.$src_no4, InspSchd_Upd01_CndR.$pack_unit_cd);
			for (MST_INSP_SMPL_ACT_R smplR : smplL) {
				MST_INSP_ACT_D_R actdR = getInspActDLBySmpl(smplR);
				if (isNull(actdR.insp_act_d_no()) && !isNull(smplR) && !isNull(smplR.smpl_qty())) {
					// 引落数量により、検査実績明細の数量を再計算する。
					MCNumber soQty = smplR.so_qty();
					MCNumber smplPackXfrQty = smplR.pack_xfr_pack_unit_qty();
					if (soQty != null && !MCNumber.ZERO.eq(soQty)) {
						MST_INSP_SCHD_R schdR = schdL.getFirst(MST_INSP_SCHD_R.$insp_schd_no, smplR.insp_schd_no());
						InspSchd_Upd01_CndR baseSubR = L.getFirst(idx, schdR.src_no4(), smplR.base_unit_cd());
						if (smplPackXfrQty != null && smplPackXfrQty.gt(MCNumber.ZERO)) {
							InspSchd_Upd01_CndR packSubR = L.getFirst(idx, schdR.src_no4(), smplR.pack_xfr_pack_unit_cd());
							
							packSubR.pack_unit_qty(packSubR.pack_unit_qty().subtract(smplPackXfrQty));
							packSubR.base_unit_qty(convToBaseUnit(packSubR.pack_unit_qty(), packSubR.pack_unit_dmn_qty(),
									packSubR.pack_unit_conv_qty(), packSubR.base_unit_dec_place(), packSubR.base_unit_rnd_typ()));
							packSubR.diff_pack_unit_qty(packSubR.pack_unit_qty());
							MCNumber baseUnitQty = convToBaseUnit(smplPackXfrQty, packSubR.pack_unit_dmn_qty(),
									packSubR.pack_unit_conv_qty(), packSubR.base_unit_dec_place(), packSubR.base_unit_rnd_typ());
							if (!isNull(baseSubR)) {
								baseSubR.base_unit_qty(baseSubR.base_unit_qty().add(baseUnitQty.subtract(soQty)));
								baseSubR.pack_unit_qty(baseSubR.base_unit_qty());
								baseSubR.pack_unit_cd(baseSubR.base_unit_cd());
							}
							else {
								baseSubR = packSubR.clone();
								baseSubR.base_unit_qty(baseUnitQty.subtract(soQty));
								baseSubR.pack_unit_qty(baseSubR.base_unit_qty());
								baseSubR.pack_unit_cd(baseSubR.base_unit_cd());
								baseSubR.diff_pack_unit_qty(baseSubR.pack_unit_qty());
								baseSubR.pack_unit_dmn_qty(MCNumber.ONE);
								baseSubR.pack_unit_conv_qty(MCNumber.ONE);
								L.add(baseSubR);
							}
						}
						else {
							if (!isNull(baseSubR)) {
								baseSubR.pack_unit_qty(baseSubR.pack_unit_qty().subtract(soQty));
								baseSubR.base_unit_qty(baseSubR.base_unit_qty().subtract(soQty));
								baseSubR.diff_pack_unit_qty(baseSubR.pack_unit_qty());
							}
						}
					}
				}
			}
			
			for (InspSchd_Upd01_CndR r : L) {
				InspAct_Upd03_Act_DtlR retR = InspAct_Upd03_Act_DtlR.create();
				MST_INSP_ACT_D_R actdR = getInspActDL(r, actR.insp_act_no());

				// 手配ＮＯ1～4をリストsnoLの0～3で管理する
				List<String> snoL = new ArrayList<String>();
				setSno(r, snoL);

				retR.data_crud_typ(r.data_crud_typ());
				// 更新（data_crud_typ=2)かつ検査実績明細ＮＯがNULLの場合、データ更新区分を「新規」にする
				//  ※以下のケースで発生する。
				//    出来高実績登録(数量>0)→検査指図→出来高実績訂正(数量=0)→検査実績→
				//    出来高実績訂正(数量>0)の順に処理した場合
				if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ()) && isNull(actdR.insp_act_d_no())) {
					retR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				
				if (isSkipInspActUpd03(actdR.insp_act_d_no(), r)) {
					continue;
				}
				if (isNull(actdR.insp_act_d_no())) {
					retR.insp_act_d_no(null);
				}
				else {
					retR.insp_act_d_no(actdR.insp_act_d_no());
				}
				retR.insp_act_no(actR.insp_act_no());
				retR.itm_cd(r.itm_cd());
				retR.itm_sub1(r.itm_sub1());
				retR.itm_sub2(r.itm_sub2());
				retR.itm_sub3(r.itm_sub3());
				retR.loc_cd(r.loc_cd());
				retR.str_ln_cd(r.str_ln_cd());
				retR.stk_arrv_bp_cd(r.stk_arrv_bp_cd());
				retR.gd_cd(actR.gd_cd());
				retR.quality_typ(actR.quality_typ());
				if (MSC_INSP_APRV_STS_TYP.isJUDG_ACPT(actR.getStringNE("INSP_APRV_STS_TYP"))
						|| MSC_INSP_APRV_STS_TYP.isJUDG_OPN(actR.getStringNE("INSP_APRV_STS_TYP"))) {
					retR.stk_insp_typ(MSC_STK_INSP_TYP.WAIT_JUDG.value());
				}
				else {
					retR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
				}
				retR.stk_id_typ(r.stk_id_typ());
				retR.stk_bp_cd(r.bp_cd());
				retR.lot_no(r.lot_no());
				retR.sublot_no(r.sublot_no());
				retR.sno1(snoL.get(0));
				retR.sno1_mng_typ(r.sno1_mng_typ());
				retR.sno2(snoL.get(1));
				retR.sno2_mng_typ(r.sno2_mng_typ());
				retR.sno3(snoL.get(2));
				retR.sno3_mng_typ(r.sno3_mng_typ());
				retR.sno4(snoL.get(3));
				retR.sno4_mng_typ(r.sno4_mng_typ());
				if (MSC_INSP_TYP.isPRDCT(r.insp_typ())) {
					retR.fix_no_typ(MSC_FIX_NO_TYP.YIELD_ACT_NO.value());
					retR.fix_no(r.src_no4());
				}
				else if (MSC_INSP_TYP.isACCPT(MSC_FIX_NO_TYP.ARR_ACT_NO.value())) {
					retR.fix_no_typ(MSC_FIX_NO_TYP.ARR_ACT_NO.value());
					retR.fix_no(r.src_no4());
				}
				
				if (isNull(actdR.insp_act_d_no())) {
					retR.pack_unit_qty(r.pack_unit_qty());
					retR.pack_unit_cd(r.pack_unit_cd());
					retR.base_unit_qty(
							convToBaseUnit(r.pack_unit_qty(), r.pack_unit_dmn_qty(),
									r.pack_unit_conv_qty(), r.base_unit_dec_place(), r.base_unit_rnd_typ()));
					retR.base_unit_cd(r.base_unit_cd());
				}
				else {
					retR.pack_unit_qty(actdR.pack_unit_qty().add(r.diff_pack_unit_qty()));
					retR.pack_unit_cd(r.pack_unit_cd());
					retR.base_unit_qty(actdR.base_unit_qty().add(
							convToBaseUnit(r.diff_pack_unit_qty(), r.pack_unit_dmn_qty(),
									r.pack_unit_conv_qty(), r.base_unit_dec_place(), r.base_unit_rnd_typ())));
					retR.base_unit_cd(r.base_unit_cd());
				}
				retR.pack_xfr_pack_unit_qty(null);
				retR.pack_xfr_pack_unit_cd(r.pack_unit_cd());
				retR.pack_xfr_base_unit_qty(null);
				retR.pack_xfr_base_unit_cd(r.base_unit_cd());
				// 実積明細が新規作成、更新の場合、計上日を設定する
				if (isNull(actdR.insp_act_d_no()) || actdR.ac_dt().lt(r.ac_dt())) {
					retR.ac_dt(r.ac_dt());
				}
				else {
					retR.ac_dt(actdR.ac_dt());
				}
				// 実積明細が新規作成でない場合、取消計上日を設定する
				if (!isNull(actdR.insp_act_d_no())) {
					retR.can_ac_dt(getCanAcDt(actdR.ac_dt(), r.can_ac_dt()));
				}
				retR.sub_char1();
				retR.sub_char2();
				retR.sub_char3();
				
				retR.setAttributes(r);
				retL.add(retR);
			}
			
			return retL;
		}
		protected MCList<InspAct_Upd03_Act_DtlR> getActDWithTtl(MCList<InspSchd_Upd01_CndR> L, MST_INSP_ACT_R actR) {
			MCList<InspAct_Upd03_Act_DtlR> retL = MCList.create(InspAct_Upd03_Act_DtlR.class);
			MCList<MST_INSP_ACT_D_R> actdL = MCList.create(MST_INSP_ACT_D_R.class);
			MST_INSP_ACT_D_R t = MST_INSP_ACT_D_R.create("T");
			MCQueryApiBuilder actdL_bldr = MCQueryApiBuilder.create(t);
			actdL_bldr.setWhere(t.insp_act_no.eq(bind("1")), actR.insp_act_no());
			dbSelect("MSBFL5010_MST_INSP_ACT_D_S02", actdL, actdL_bldr);
			MCIndexKey idxkey = actdL.createIndex(
					MST_INSP_ACT_D_R.$loc_cd,
					MST_INSP_ACT_D_R.$str_ln_cd,
					MST_INSP_ACT_D_R.$fix_no_typ,
					MST_INSP_ACT_D_R.$fix_no);
			for (InspSchd_Upd01_CndR r : L) {
				for (MST_INSP_ACT_D_R actDR :  actdL.subList(idxkey, r.pre_loc_cd(),
						r.pre_str_ln_cd(), MSC_FIX_NO_TYP.YIELD_ACT_NO.value(), r.src_no4())) {
					InspAct_Upd03_Act_DtlR retR = InspAct_Upd03_Act_DtlR.create();
					
					retR.data_crud_typ(r.data_crud_typ());
					retR.insp_act_d_no(actDR.insp_act_d_no());
					retR.insp_act_no(actDR.insp_act_no());
					retR.itm_cd(actDR.itm_cd());
					retR.itm_sub1(actDR.itm_sub1());
					retR.itm_sub2(actDR.itm_sub2());
					retR.itm_sub3(actDR.itm_sub3());
					retR.loc_cd(r.loc_cd());
					retR.str_ln_cd(r.str_ln_cd());
					retR.stk_arrv_bp_cd(actDR.stk_arrv_bp_cd());
					retR.gd_cd(actDR.gd_cd());
					retR.quality_typ(actDR.quality_typ());
					retR.stk_insp_typ(actDR.stk_insp_typ());
					retR.stk_id_typ(actDR.stk_id_typ());
					retR.stk_bp_cd(actDR.stk_bp_cd());
					retR.lot_no(actDR.lot_no());
					retR.sublot_no(actDR.sublot_no());
					retR.sno1(actDR.sno1());
					retR.sno1_mng_typ(actDR.sno1_mng_typ());
					retR.sno2(actDR.sno2());
					retR.sno2_mng_typ(actDR.sno2_mng_typ());
					retR.sno3(actDR.sno3());
					retR.sno3_mng_typ(actDR.sno3_mng_typ());
					retR.sno4(actDR.sno4());
					retR.sno4_mng_typ(actDR.sno4_mng_typ());
					retR.fix_no_typ(actDR.fix_no_typ());
					retR.fix_no(actDR.fix_no());
					retR.pack_unit_qty(actDR.pack_unit_qty());
					retR.pack_unit_cd(actDR.pack_unit_cd());
					retR.base_unit_qty(actDR.base_unit_qty());
					retR.base_unit_cd(actDR.base_unit_cd());
					retR.pack_xfr_pack_unit_qty(actDR.pack_xfr_pack_unit_qty());
					retR.pack_xfr_pack_unit_cd(actDR.pack_xfr_pack_unit_cd());
					retR.pack_xfr_base_unit_qty(actDR.pack_xfr_base_unit_qty());
					retR.pack_xfr_base_unit_cd(actDR.pack_xfr_base_unit_cd());
					retR.dfct_rsn_cd(actDR.dfct_rsn_cd());
					if (actDR.ac_dt().lt(r.ac_dt())) {
						retR.ac_dt(r.ac_dt());
					}
					else {
						retR.ac_dt(actDR.ac_dt());
					}
					retR.can_ac_dt(getCanAcDt(actDR.ac_dt(), r.can_ac_dt()));
					retR.intr_rmrks(actDR.intr_rmrks());
					retR.sub_char1(actDR.sub_char1());
					retR.sub_char2(actDR.sub_char2());
					retR.sub_char3(actDR.sub_char3());

					retL.add(retR);
				}
			}
			return retL;
		}
		protected MCList<InspAct_Upd03_Judg_DtlR> getJudgDWithTtl(MCList<InspSchd_Upd01_CndR> L, MST_INSP_ACT_R actR) {
			MCList<InspAct_Upd03_Judg_DtlR> retL = MCList.create(InspAct_Upd03_Judg_DtlR.class);
			MCList<MST_INSP_JUDG_D_R> judgdL = MCList.create(MST_INSP_JUDG_D_R.class);
			MST_INSP_JUDG_D_R t = MST_INSP_JUDG_D_R.create("T");
			MCQueryApiBuilder judgdL_bldr = MCQueryApiBuilder.create(t);
			judgdL_bldr.setWhere(t.insp_act_no.eq(bind("1")), actR.insp_act_no());
			dbSelect("MSBFL5010_MST_INSP_JUDG_D_S01", judgdL, judgdL_bldr);
			MCIndexKey idxkey = judgdL.createIndex(
					MST_INSP_JUDG_D_R.$loc_cd,
					MST_INSP_JUDG_D_R.$str_ln_cd,
					MST_INSP_JUDG_D_R.$fix_no_typ,
					MST_INSP_JUDG_D_R.$fix_no);
			for (InspSchd_Upd01_CndR r : L) {
				for (MST_INSP_JUDG_D_R judgDR :  judgdL.subList(idxkey, r.pre_loc_cd(),
						r.pre_str_ln_cd(), MSC_FIX_NO_TYP.YIELD_ACT_NO.value(), r.src_no4())) {
					InspAct_Upd03_Judg_DtlR retR = InspAct_Upd03_Judg_DtlR.create();
					
					retR.data_crud_typ(r.data_crud_typ());
					retR.insp_judg_d_no(judgDR.insp_judg_d_no());
					retR.insp_act_no(judgDR.insp_act_no());
					retR.itm_cd(judgDR.itm_cd());
					retR.itm_sub1(judgDR.itm_sub1());
					retR.itm_sub2(judgDR.itm_sub2());
					retR.itm_sub3(judgDR.itm_sub3());
					retR.loc_cd(r.loc_cd());
					retR.str_ln_cd(r.str_ln_cd());
					retR.stk_arrv_bp_cd(judgDR.stk_arrv_bp_cd());
					retR.gd_cd(judgDR.gd_cd());
					retR.quality_typ(judgDR.quality_typ());
					retR.stk_insp_typ(judgDR.stk_insp_typ());
					retR.stk_id_typ(judgDR.stk_id_typ());
					retR.stk_bp_cd(judgDR.stk_bp_cd());
					retR.lot_no(judgDR.lot_no());
					retR.sublot_no(judgDR.sublot_no());
					retR.sno1(judgDR.sno1());
					retR.sno1_mng_typ(judgDR.sno1_mng_typ());
					retR.sno2(judgDR.sno2());
					retR.sno2_mng_typ(judgDR.sno2_mng_typ());
					retR.sno3(judgDR.sno3());
					retR.sno3_mng_typ(judgDR.sno3_mng_typ());
					retR.sno4(judgDR.sno4());
					retR.sno4_mng_typ(judgDR.sno4_mng_typ());
					retR.fix_no_typ(judgDR.fix_no_typ());
					retR.fix_no(judgDR.fix_no());
					retR.pack_unit_qty(judgDR.pack_unit_qty());
					retR.pack_unit_cd(judgDR.pack_unit_cd());
					retR.base_unit_qty(judgDR.base_unit_qty());
					retR.base_unit_cd(judgDR.base_unit_cd());
					if (judgDR.ac_dt().lt(r.ac_dt())) {
						retR.ac_dt(r.ac_dt());
					}
					else {
						retR.ac_dt(judgDR.ac_dt());
					}
					retR.can_ac_dt(getCanAcDt(judgDR.ac_dt(), r.can_ac_dt()));
					retR.sub_char1(judgDR.sub_char1());
					retR.sub_char2(judgDR.sub_char2());
					retR.sub_char3(judgDR.sub_char3());

					retL.add(retR);
				}
			}
			return retL;
		}
		protected MCList<InspAct_Upd03_Judg_DtlR> getJudgD(MCList<InspSchd_Upd01_CndR> L, MST_INSP_ACT_R actR) {
			MCList<InspAct_Upd03_Judg_DtlR> retL = MCList.create(InspAct_Upd03_Judg_DtlR.class);
			
			for (InspSchd_Upd01_CndR r : L) {
				InspAct_Upd03_Judg_DtlR retR = InspAct_Upd03_Judg_DtlR.create();
				MST_INSP_JUDG_D_R judgdR = getInspJudgDL(r, actR.insp_act_no());

				// 手配ＮＯ1～4をリストsnoLの0～3で管理する
				List<String> snoL = new ArrayList<String>();
				setSno(r, snoL);

				retR.data_crud_typ(r.data_crud_typ());
				// 更新（data_crud_typ=2)かつ検査判定明細ＮＯがNULLの場合、データ更新区分を「新規」にする
				//  ※以下のケースで発生する。
				//    出来高実績登録(数量>0)→検査指図→出来高実績訂正(数量=0)→検査実績→
				//    出来高実績訂正(数量>0)の順に処理した場合
				if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ()) && isNull(judgdR.insp_judg_d_no())) {
					retR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				if (isSkipInspActUpd03(judgdR.insp_judg_d_no(), r)) {
					continue;
				}

				if (isNull(judgdR.insp_judg_d_no())) {
					retR.insp_judg_d_no(null);
				}
				else {
					retR.insp_judg_d_no(judgdR.insp_judg_d_no());
				}
				retR.insp_act_no(actR.insp_act_no());
				retR.itm_cd(r.itm_cd());
				retR.itm_sub1(r.itm_sub1());
				retR.itm_sub2(r.itm_sub2());
				retR.itm_sub3(r.itm_sub3());
				retR.loc_cd(r.loc_cd());
				retR.str_ln_cd(r.str_ln_cd());
				retR.stk_arrv_bp_cd(r.stk_arrv_bp_cd());
				retR.gd_cd(actR.gd_cd());
				retR.quality_typ(actR.quality_typ());
				if (MSC_INSP_JUDG_RSLT_TYP.isRE(actR.insp_judg_rslt_typ())) {
					retR.stk_insp_typ(MSC_STK_INSP_TYP.YET.value());
				}
				else {
					retR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
				}
				retR.stk_id_typ(r.stk_id_typ());
				retR.stk_bp_cd(r.bp_cd());
				retR.lot_no(r.lot_no());
				retR.sublot_no(r.sublot_no());
				retR.sno1(snoL.get(0));
				retR.sno1_mng_typ(r.sno1_mng_typ());
				retR.sno2(snoL.get(1));
				retR.sno2_mng_typ(r.sno2_mng_typ());
				retR.sno3(snoL.get(2));
				retR.sno3_mng_typ(r.sno3_mng_typ());
				retR.sno4(snoL.get(3));
				retR.sno4_mng_typ(r.sno4_mng_typ());
				if (MSC_INSP_TYP.isPRDCT(r.insp_typ())) {
					retR.fix_no_typ(MSC_FIX_NO_TYP.YIELD_ACT_NO.value());
					retR.fix_no(r.src_no4());
				}
				else if (MSC_INSP_TYP.isACCPT(MSC_FIX_NO_TYP.ARR_ACT_NO.value())) {
					retR.fix_no_typ(MSC_FIX_NO_TYP.ARR_ACT_NO.value());
					retR.fix_no(r.src_no4());
				}
				if (isNull(judgdR.insp_judg_d_no())) {
					retR.pack_unit_qty(r.pack_unit_qty());
					retR.pack_unit_cd(r.pack_unit_cd());
					retR.base_unit_qty(
							convToBaseUnit(r.pack_unit_qty(), r.pack_unit_dmn_qty(),
									r.pack_unit_conv_qty(), r.base_unit_dec_place(), r.base_unit_rnd_typ()));
					retR.base_unit_cd(r.base_unit_cd());
				}
				else {
					retR.pack_unit_qty(judgdR.pack_unit_qty().add(r.diff_pack_unit_qty()));
					retR.pack_unit_cd(r.pack_unit_cd());
					retR.base_unit_qty(judgdR.base_unit_qty().add(
							convToBaseUnit(r.diff_pack_unit_qty(), r.pack_unit_dmn_qty(),
									r.pack_unit_conv_qty(), r.base_unit_dec_place(), r.base_unit_rnd_typ())));
					retR.base_unit_cd(r.base_unit_cd());
				}
				// 判定明細が新規作成、更新の場合、計上日を設定する
				if (isNull(judgdR.insp_judg_d_no()) || judgdR.ac_dt().lt(r.ac_dt())) {
					retR.ac_dt(r.ac_dt());
				}
				else {
					retR.ac_dt(judgdR.ac_dt());
				}
				// 判定明細が新規作成でない場合、取消計上日を設定する
				if (!isNull(judgdR.insp_judg_d_no())) {
					retR.can_ac_dt(getCanAcDt(judgdR.ac_dt(), r.can_ac_dt()));
				}
				retR.sub_char1();
				retR.sub_char2();
				retR.sub_char3();
				
				retR.setAttributes(r);
				
				retL.add(retR);
			}
			
			return retL;
		}
		
		/**
		 * InspAct_Upd03の呼び出しをスキップするかどうか
		 * 
		 * @param strNo
		 * @param r
		 * @return
		 */
		protected boolean isSkipInspActUpd03(String strNo, InspSchd_Upd01_CndR r) {
			// １．新規かつ出来高予定を元に出来高実績を登録した場合は、InspAct_Upd03を呼び出すためにfalseを返す
			//   ※strNoがNULLだが、diff_pack_unit_qtyがnot zero
			// ２．新規かつ既存の出来高実績を行コピーして出来高実績を登録した場合は、
			//   （InspAct_Upd04を呼び出しているため）InspAct_Upd03を呼び出さないのでtrueを返す
			//    ※strNoがNULLかつ、diff_pack_unit_qtyがzero
			// ３．更新の場合は、InspAct_Upd03を呼び出すためにfalseを返す
			//   ※strNoがNOT NULL
			// ４．削除の場合は、本処理は通らない
			if (isNull(strNo) && r.diff_pack_unit_qty().isZero()) {
				return true;
			}
			return false;
		}
		protected MST_INSP_STT_D_R getInspSttDL(InspSchd_Upd01_CndR r, String inspActNo) {
			MCList<MST_INSP_STT_D_R> sttdL = MCList.create(MST_INSP_STT_D_R.class);
			MST_INSP_STT_D_R t = MST_INSP_STT_D_R.create("T");
			MCQueryApiBuilder sttdL_bldr = MCQueryApiBuilder.create(t);
			MST_INSP_STT_D_R sttdR = MST_INSP_STT_D_R.create();
			
			sttdL_bldr.setWhere(t.insp_act_no.eq(bind("1")), inspActNo);
			dbSelect("MSBFL5010_MST_INSP_STT_D_S01", sttdL, sttdL_bldr);
			
			if (!sttdL.isEmpty()) {
				// 現状在庫キー（格付、良品区分、在庫検査区分を除く）でインデックスを取得
				MCIndexKey idx = sttdL.createIndex(MST_INSP_STT_D_R.$itm_cd,
						MST_INSP_STT_D_R.$itm_sub1, MST_INSP_STT_D_R.$itm_sub2, MST_INSP_STT_D_R.$itm_sub3,
						MST_INSP_STT_D_R.$loc_cd, MST_INSP_STT_D_R.$str_ln_cd, MST_INSP_STT_D_R.$stk_arrv_bp_cd,
						MST_INSP_STT_D_R.$stk_id_typ, MST_INSP_STT_D_R.$stk_bp_cd, MST_INSP_STT_D_R.$lot_no,
						MST_INSP_STT_D_R.$sublot_no, MST_INSP_STT_D_R.$sno1, MST_INSP_STT_D_R.$sno2,
						MST_INSP_STT_D_R.$sno3, MST_INSP_STT_D_R.$sno4, MST_INSP_STT_D_R.$pack_unit_cd,
						MST_INSP_STT_D_R.$fix_no_typ, MST_INSP_STT_D_R.$fix_no);
				
				// 手配ＮＯ1～4をリストsnoLの0～3で管理する
				List<String> snoL = new ArrayList<String>();
				setSno(r, snoL);
				
				sttdR = sttdL.getFirst(idx, r.itm_cd(),
						r.itm_sub1(), r.itm_sub2(), r.itm_sub3(),
						r.pre_loc_cd(), r.pre_str_ln_cd(), r.stk_arrv_bp_cd(),
						r.stk_id_typ(), r.bp_cd(), r.lot_no(), r.sublot_no(),
						snoL.get(0), snoL.get(1), snoL.get(2), snoL.get(3),
						r.pack_unit_cd(), MSC_FIX_NO_TYP.YIELD_ACT_NO.value(), r.src_no4());
				if (isNull(sttdR)) {
					sttdR = MST_INSP_STT_D_R.create();
				}
			}
			
			return sttdR;
		}
		
		protected MST_INSP_ACT_D_R getInspActDL(InspSchd_Upd01_CndR r, String inspActNo) {
			MCList<MST_INSP_ACT_D_R> actdL = MCList.create(MST_INSP_ACT_D_R.class);
			MST_INSP_ACT_D_R t = MST_INSP_ACT_D_R.create("T");
			MCQueryApiBuilder actdL_bldr = MCQueryApiBuilder.create(t);
			MST_INSP_ACT_D_R actdR = MST_INSP_ACT_D_R.create();
			
			actdL_bldr.setWhere(t.insp_act_no.eq(bind("1")), inspActNo);
			dbSelect("MSBFL5010_MST_INSP_ACT_D_S03", actdL, actdL_bldr);
			
			if (!actdL.isEmpty()) {
				// 現状在庫キー（格付、良品区分、在庫検査区分を除く）でインデックスを取得
				MCIndexKey idx = actdL.createIndex(MST_INSP_ACT_D_R.$itm_cd,
						MST_INSP_ACT_D_R.$itm_sub1, MST_INSP_ACT_D_R.$itm_sub2, MST_INSP_ACT_D_R.$itm_sub3,
						MST_INSP_ACT_D_R.$loc_cd, MST_INSP_ACT_D_R.$str_ln_cd, MST_INSP_ACT_D_R.$stk_arrv_bp_cd,
						MST_INSP_ACT_D_R.$stk_id_typ, MST_INSP_ACT_D_R.$stk_bp_cd, MST_INSP_ACT_D_R.$lot_no,
						MST_INSP_ACT_D_R.$sublot_no, MST_INSP_ACT_D_R.$sno1, MST_INSP_ACT_D_R.$sno2,
						MST_INSP_ACT_D_R.$sno3, MST_INSP_ACT_D_R.$sno4, MST_INSP_ACT_D_R.$pack_unit_cd,
						MST_INSP_ACT_D_R.$fix_no_typ, MST_INSP_ACT_D_R.$fix_no);
				
				// 手配ＮＯ1～4をリストsnoLの0～3で管理する
				List<String> snoL = new ArrayList<String>();
				setSno(r, snoL);
				
				actdR = actdL.getFirst(idx, r.itm_cd(),
						r.itm_sub1(), r.itm_sub2(), r.itm_sub3(),
						r.pre_loc_cd(), r.pre_str_ln_cd(), r.stk_arrv_bp_cd(),
						r.stk_id_typ(), r.bp_cd(), r.lot_no(), r.sublot_no(),
						snoL.get(0), snoL.get(1), snoL.get(2), snoL.get(3),
						r.pack_unit_cd(), MSC_FIX_NO_TYP.YIELD_ACT_NO.value(), r.src_no4());
				if (isNull(actdR)) {
					actdR = MST_INSP_ACT_D_R.create(); 
				}
			}
			
			return actdR;
		}
		protected MST_INSP_ACT_D_R getInspActDLBySmpl(MST_INSP_SMPL_ACT_R r) {
			MCList<MST_INSP_ACT_D_R> actdL = MCList.create(MST_INSP_ACT_D_R.class);
			MST_INSP_ACT_D_R t = MST_INSP_ACT_D_R.create("T");
			MCQueryApiBuilder actdL_bldr = MCQueryApiBuilder.create(t);
			MST_INSP_ACT_D_R actdR = MST_INSP_ACT_D_R.create();
			
			actdL_bldr.setWhere(t.insp_act_no.eq(bind("1")), r.insp_act_no());
			dbSelect("MSBFL5010_MST_INSP_ACT_D_S04", actdL, actdL_bldr);
			
			if (!actdL.isEmpty()) {
				// 現状在庫キー（格付、良品区分、在庫検査区分、荷姿単位（引落で荷姿振替した場合を考慮）を除く）でインデックスを取得
				MCIndexKey idx = actdL.createIndex(MST_INSP_ACT_D_R.$itm_cd,
						MST_INSP_ACT_D_R.$itm_sub1, MST_INSP_ACT_D_R.$itm_sub2, MST_INSP_ACT_D_R.$itm_sub3,
						MST_INSP_ACT_D_R.$loc_cd, MST_INSP_ACT_D_R.$str_ln_cd, MST_INSP_ACT_D_R.$stk_arrv_bp_cd,
						MST_INSP_ACT_D_R.$stk_id_typ, MST_INSP_ACT_D_R.$stk_bp_cd, MST_INSP_ACT_D_R.$lot_no,
						MST_INSP_ACT_D_R.$sublot_no, MST_INSP_ACT_D_R.$sno1, MST_INSP_ACT_D_R.$sno2,
						MST_INSP_ACT_D_R.$sno3, MST_INSP_ACT_D_R.$sno4,
						MST_INSP_ACT_D_R.$fix_no_typ, MST_INSP_ACT_D_R.$fix_no);
				
				// 手配ＮＯ1～4をリストsnoLの0～3で管理する
				List<String> snoL = new ArrayList<String>();
				setSno(r, snoL);
				
				actdR = actdL.getFirst(idx, r.itm_cd(),
						r.itm_sub1(), r.itm_sub2(), r.itm_sub3(),
						r.loc_cd(), r.str_ln_cd(), r.stk_arrv_bp_cd(),
						r.stk_id_typ(), r.stk_bp_cd(), r.lot_no(), r.sublot_no(),
						snoL.get(0), snoL.get(1), snoL.get(2), snoL.get(3),
						r.fix_no_typ(), r.fix_no());
				if (isNull(actdR)) {
					actdR = MST_INSP_ACT_D_R.create();
				}
			}
			
			return actdR;
		}
		
		protected MST_INSP_JUDG_D_R getInspJudgDL(InspSchd_Upd01_CndR r, String inspActNo) {
			MCList<MST_INSP_JUDG_D_R> judgdL = MCList.create(MST_INSP_JUDG_D_R.class);
			MST_INSP_JUDG_D_R t = MST_INSP_JUDG_D_R.create("T");
			MCQueryApiBuilder judgdL_bldr = MCQueryApiBuilder.create(t);
			MST_INSP_JUDG_D_R judgdR = MST_INSP_JUDG_D_R.create();
			
			judgdL_bldr.setWhere(t.insp_act_no.eq(bind("1")), inspActNo);
			dbSelect("MSBFL5010_MST_INSP_JUDG_D_S02", judgdL, judgdL_bldr);
			
			if (!judgdL.isEmpty()) {
				// 現状在庫キー（格付、良品区分、在庫検査区分、荷姿単位（引落で荷姿振替した場合を考慮）を除く）でインデックスを取得
				MCIndexKey idx = judgdL.createIndex(MST_INSP_JUDG_D_R.$itm_cd,
						MST_INSP_JUDG_D_R.$itm_sub1, MST_INSP_JUDG_D_R.$itm_sub2, MST_INSP_JUDG_D_R.$itm_sub3,
						MST_INSP_JUDG_D_R.$loc_cd, MST_INSP_JUDG_D_R.$str_ln_cd, MST_INSP_JUDG_D_R.$stk_arrv_bp_cd,
						MST_INSP_JUDG_D_R.$stk_id_typ, MST_INSP_JUDG_D_R.$stk_bp_cd, MST_INSP_JUDG_D_R.$lot_no,
						MST_INSP_JUDG_D_R.$sublot_no, MST_INSP_JUDG_D_R.$sno1, MST_INSP_JUDG_D_R.$sno2,
						MST_INSP_JUDG_D_R.$sno3, MST_INSP_JUDG_D_R.$sno4,
						MST_INSP_JUDG_D_R.$fix_no_typ, MST_INSP_JUDG_D_R.$fix_no, MST_INSP_JUDG_D_R.$pack_unit_cd);
				
				// 手配ＮＯ1～4をリストsnoLの0～3で管理する
				List<String> snoL = new ArrayList<String>();
				setSno(r, snoL);
				
				judgdR = judgdL.getFirst(idx, r.itm_cd(),
						r.itm_sub1(), r.itm_sub2(), r.itm_sub3(),
						r.pre_loc_cd(), r.pre_str_ln_cd(), r.stk_arrv_bp_cd(),
						r.stk_id_typ(), r.bp_cd(), r.lot_no(), r.sublot_no(),
						snoL.get(0), snoL.get(1), snoL.get(2), snoL.get(3),
						MSC_FIX_NO_TYP.YIELD_ACT_NO.value(), r.src_no4(), r.pack_unit_cd());
				if (isNull(judgdR)) {
					judgdR = MST_INSP_JUDG_D_R.create();
				}
			}
			
			return judgdR;
		}

		/**
		 * 手配ＮＯ管理区分に応じて手配ＮＯを設定する
		 * 手配ＮＯ管理区分が「管理する（任意：在庫対象外）」の場合、手配ＮＯをnull文字にする
		 * 
		 * @param r
		 * @param snoL
		 * @return
		 */
		protected void setSno(MCRow r, List<String> snoL) {
			if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.getStringNE("sno1_mng_typ"))) {
				snoL.add(MAC_STR.NULL_VAL.value());
			}
			else {
				snoL.add(r.getStringNE("sno1"));
			}
			if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.getStringNE("sno2_mng_typ"))) {
				snoL.add(MAC_STR.NULL_VAL.value());
			}
			else {
				snoL.add(r.getStringNE("sno2"));
			}
			if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.getStringNE("sno3_mng_typ"))) {
				snoL.add(MAC_STR.NULL_VAL.value());
			}
			else {
				snoL.add(r.getStringNE("sno3"));
			}
			if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.getStringNE("sno4_mng_typ"))) {
				snoL.add(MAC_STR.NULL_VAL.value());
			}
			else {
				snoL.add(r.getStringNE("sno4"));
			}
		}

		protected boolean isNotDel(InspSchd_Upd01_CndR r) {
			if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
				return false;
			}
			return true;
		}


		protected MST_INSP_ACT_R getInspActR(String inspNo) {
			MST_INSP_ACT_R selectR = MST_INSP_ACT_R.create();
			MST_INSP_ACT_R t = MST_INSP_ACT_R.create("T");
			MCQueryApiBuilder selectR_bldr = MCQueryApiBuilder.create(t);
			MST_INSP_INST_R t2 = MST_INSP_INST_R.create("T2");
			MAM_ITM_R m1 = MAM_ITM_R.create("M1");
			MST_LOT_R t4 = MST_LOT_R.create("T4");
			selectR_bldr.addSelect(t2.insp_sts_typ);
			selectR_bldr.addSelect(t2.insp_aprv_sts_typ);
			selectR_bldr.addSelect(t4.lot_rmrks);
			selectR_bldr.addInnerJoin(t2, t.insp_no.eq(t2.insp_no));
			selectR_bldr.addInnerJoin(m1, bracket( t.itm_cd.eq(m1.itm_cd)
					.and(t.itm_sub1.eq(m1.itm_sub1))
					.and(t.itm_sub2.eq(m1.itm_sub2))
					.and(t.itm_sub3.eq(m1.itm_sub3))));
			selectR_bldr.addLeftOuterJoin(t4, bracket( t.itm_cd.eq(t4.itm_cd)
					.and(t.itm_sub1.eq(t4.itm_sub1))
					.and(t.itm_sub2.eq(t4.itm_sub2))
					.and(t.itm_sub3.eq(t4.itm_sub3))
					.and(t.lot_no.eq(t4.lot_no))
					.and( t4.sublot_no.eq(cases()
							.when(m1.sublot_mng_typ.eq(value(MAC_SUBLOT_MNG_TYP.STK.value())))
							.then(value(MAC_STR.NULL_VAL.value()))
							.otherwise(t.sublot_no) ) )));
			selectR_bldr.setWhere(t.insp_no.eq(bind("1")), inspNo);

			dbSelect("MSBFL5010_MST_INSP_ACT_S03", selectR, selectR_bldr);

			return selectR;
		}

		protected MCList<MST_INSP_ACT_R> getInspActL(String inspTyp,
				String srcNo3, String srcNo4, boolean latestFlg) {
			MCList<MST_INSP_ACT_R> actL = MCList.create(MST_INSP_ACT_R.class);
			MST_INSP_ACT_R t = MST_INSP_ACT_R.create("T");
			MCQueryApiBuilder actL_bldr = MCQueryApiBuilder.create(t);
			MST_INSP_INST_R t2 = MST_INSP_INST_R.create("T2");
			MST_INSP_SCHD_R t3 = MST_INSP_SCHD_R.create("T3");
			MAM_ITM_R m1 = MAM_ITM_R.create("M1");
			MST_LOT_R t4 = MST_LOT_R.create("T4");
			
			actL_bldr.addSelect(t2.plnt_aprv_flg);
			actL_bldr.addSelect(t2.insp_sts_typ);
			actL_bldr.addSelect(t2.insp_aprv_sts_typ);
			actL_bldr.addSelect(t4.lot_rmrks);
			actL_bldr.addInnerJoin(t2, t.insp_no.eq(t2.insp_no));
			actL_bldr.addInnerJoin(t3, t2.insp_no.eq(t3.insp_no));
			actL_bldr.addInnerJoin(m1, bracket( t.itm_cd.eq(m1.itm_cd)
					.and(t.itm_sub1.eq(m1.itm_sub1))
					.and(t.itm_sub2.eq(m1.itm_sub2))
					.and(t.itm_sub3.eq(m1.itm_sub3))));
			actL_bldr.addLeftOuterJoin(t4, bracket( t.itm_cd.eq(t4.itm_cd)
					.and(t.itm_sub1.eq(t4.itm_sub1))
					.and(t.itm_sub2.eq(t4.itm_sub2))
					.and(t.itm_sub3.eq(t4.itm_sub3))
					.and(t.lot_no.eq(t4.lot_no))
					.and( t4.sublot_no.eq(cases()
							.when(m1.sublot_mng_typ.eq(value(MAC_SUBLOT_MNG_TYP.STK.value())))
							.then(value(MAC_STR.NULL_VAL.value()))
							.otherwise(t.sublot_no) ) )));
			
			if (!isNull(srcNo4)) {
				actL_bldr.setWhere(t.insp_typ.eq(bind("1")), inspTyp);
				actL_bldr.addWhereWithAnd(t3.src_no4.eq(bind("1")), srcNo4);
				if (latestFlg) {
					actL_bldr.addWhereWithAnd(t3.latest_flg.eq(value(true)));
				}
				int cnt = dbSelect("MSBFL5010_MST_INSP_ACT_S04", actL, actL_bldr);
				if (cnt > 0) {
					return actL;
				}
			}
			actL_bldr.setWhere(t.insp_typ.eq(bind("1")), inspTyp);
			actL_bldr.addWhereWithAnd(t3.src_no3.eq(bind("1")), srcNo3);
			actL_bldr.addWhereWithAnd(t3.src_no4.isNull());
			if (latestFlg) {
				actL_bldr.addWhereWithAnd(t3.latest_flg.eq(value(true)));
			}
			dbSelect("MSBFL5010_MST_INSP_ACT_S05", actL, actL_bldr);
			
			return actL;
		}
		
		protected void callInspActUpd04(MCList<InspSchd_Upd01_CndR> tgtList) {
			MCList<InspAct_Upd04_HdrR> oUpL = MCList.create(InspAct_Upd04_HdrR.class);
			for (InspSchd_Upd01_CndR r : tgtList) {
				if (isCallInspActUpd04(r)) {
					InspAct_Upd04_HdrR oUpR = InspAct_Upd04_HdrR.create();
					copy(oUpR, r, createMap_InspAct_Upd04_HdrR_InspSchd_Upd01_CndR());
					oUpL.add(oUpR);
				}
			}
			execInspActUpd04(oUpL, 1);
		}
		
		protected boolean isCallInspActUpd04(InspSchd_Upd01_CndR r) {
			if (r.ins_insp_schd_flg()) {
				return true;
			}
			else {
				return false;
			}
		}
		
		protected void execInspActUpd04(MCList<InspAct_Upd04_HdrR> oUpL, int cnt) {
			if (!oUpL.isEmpty()) {
				if (cnt > 100) {
					// 再検査が100回行なわれることは現実的ではないため、実行回数が100を超えた場合は、メソッドを終了する。
					return;
				}
				MSBFL_InspActService.InspAct_Upd04 o = MSBFL_InspActService.crtInspAct_Upd04();
				o.up0().addAll(oUpL);
				o.exec();
				
				// 再検査の検査予定の下り電文が設定されている場合は、下り電文を元に再度実行する。
				if (!o.down0().isEmpty()) {
					execInspActUpd04(o.down0(), cnt+1);
				}
				_execInspActUpd04CalledFlg = true;
			}
		}
		
		protected Map_InspAct_Upd04_HdrR_InspSchd_Upd01_CndR<InspAct_Upd04_HdrR,InspSchd_Upd01_CndR> createMap_InspAct_Upd04_HdrR_InspSchd_Upd01_CndR() {
			return new Map_InspAct_Upd04_HdrR_InspSchd_Upd01_CndR<InspAct_Upd04_HdrR, InspSchd_Upd01_CndR>();
		}

		public class Map_InspAct_Upd04_HdrR_InspSchd_Upd01_CndR<D extends InspAct_Upd04_HdrR, S extends InspSchd_Upd01_CndR> extends MCRowMapper<D,S>{
			@Override
			public void valueCopy(D dest, S src){
				dest.insp_schd_no(src.insp_schd_no());
				dest.insp_freq(MCNumber.ONE);
				dest.src_no1(src.src_no1());
				dest.src_no2(src.src_no2());
				dest.src_no3(src.src_no3());
				dest.src_no4(src.src_no4());
				dest.insp_typ(src.insp_typ());
				dest.insp_mtd_typ(src.insp_mtd_typ());
				dest.insp_sts_typ(src.insp_schd_sts_typ());
				dest.insp_bind_typ(src.insp_bind_typ());
				dest.itm_cd(src.itm_cd());
				dest.itm_sub1(src.itm_sub1());
				dest.itm_sub2(src.itm_sub2());
				dest.itm_sub3(src.itm_sub3());
				dest.lot_no(src.lot_no());
				dest.sublot_no(src.sublot_no());
				dest.sno1(src.sno1());
				dest.sno1_mng_typ(src.sno1_mng_typ());
				dest.sno2(src.sno2());
				dest.sno2_mng_typ(src.sno2_mng_typ());
				dest.sno3(src.sno3());
				dest.sno3_mng_typ(src.sno3_mng_typ());
				dest.sno4(src.sno4());
				dest.sno4_mng_typ(src.sno4_mng_typ());
				dest.mfg_loc_cd(src.mfg_loc_cd());
				dest.sppl_cd(src.sppl_cd());
				dest.maker_cd(src.maker_cd());
				dest.to_site_cd(src.to_site_cd());
				dest.ac_dt(src.ac_dt());
			}
		}
		
		/**
		 * 検査実績の登録が必要なrowを選択する。
		 */
		protected MCList<InspSchd_Upd01_CndR> setProcTgtL(
				MCList<InspSchd_Upd01_CndR> insUpdL, MCList<InspSchd_Upd01_CndR> tgtList) {
			
			for (InspSchd_Upd01_CndR r : insUpdL) {
				if (isProcTgtRow(r)) {
					setToSite(r);
					tgtList.add(r);
				}
			}
			return tgtList;
		}
		
		protected boolean isProcTgtRow(InspSchd_Upd01_CndR r) {
			if (r.ins_insp_schd_flg() || r.upd_insp_schd_flg()) {
				return true;
			}
			return false;
		}
		
		protected void setToSite(InspSchd_Upd01_CndR r) {
			MAM_LOC_R locR = _locCache.get(r.loc_cd());
			
			if (!isNull(locR)) {
				r.to_site_cd(locR.site_cd());
			}
		}
		
		protected MST_INSP_SCHD_R getLatestInspSchdRIdx(
				MCList<MST_INSP_SCHD_R> schdL, MCList<MST_INSP_SCHD_R> actL,
				MCIndexKey schdKey, MCIndexKey actKey, String inspTyp, String srcNo3, String srcNo4) {
			
			if (!isNull(srcNo4)) {
				MST_INSP_SCHD_R ret = actL.getFirst(actKey, srcNo4, inspTyp, true);
				if (!isNull(ret)) {
					return ret;
				}
			}
			MST_INSP_SCHD_R ret = schdL.getFirst(schdKey, srcNo3, inspTyp, true);
			if (!isNull(ret)) {
				return ret;
			}
			return MST_INSP_SCHD_R.create();
		}
		
		protected MCList<InspSchd_Srch01_CndR> _itmInspCache;
		
		protected void createItmInspCache(MCList<InspSchd_Upd01_CndR> insUpdL) {
			MSBFL_InspSchdService.InspSchd_Srch01 o = MSBFL_InspSchdService.crtInspSchd_Srch01();
			
			for (InspSchd_Upd01_CndR r : insUpdL) {
				InspSchd_Srch01_CndR oR = InspSchd_Srch01_CndR.create();
				
				oR.peg_no(r.peg_no());
				oR.itm_cd(r.itm_cd());
				oR.itm_sub1(r.itm_sub1());
				oR.itm_sub2(r.itm_sub2());
				oR.itm_sub3(r.itm_sub3());
				oR.mfg_loc_cd(r.mfg_loc_cd());
				oR.sppl_cd(r.sppl_cd());
				oR.maker_cd(r.maker_cd());
				oR.to_loc_cd(r.loc_cd());
				oR.insp_typ(r.insp_typ());
				oR.base_dt(r.gr_tm().trunc(MCDateFieldType.DAY));
				oR.insp_ptn_cd(null);
				oR.no_insp_srch_flg(false);
				
				o.up0().add(oR);
			}
			
			o.exec();
			_itmInspCache = MCList.create(InspSchd_Srch01_CndR.class);
			_itmInspCache.setAll(o.down0());
		}
		
		protected InspSchd_Srch01_CndR getItmInspR(MCNumber pegNo) {
			return _itmInspCache.getFirst(InspSchd_Srch01_CndR.$peg_no, pegNo);
		}
		
		protected void setItmInspData(MCList<InspSchd_Upd01_CndR> insUpdL) {
			for (InspSchd_Upd01_CndR r : insUpdL) {
				InspSchd_Srch01_CndR itmInspR = getItmInspR(r.peg_no());
				if (!isNull(itmInspR)) {
					r.exists_itm_insp_flg(true);
					r.insp_mtd_typ(itmInspR.insp_mtd_typ());
					r.insp_inst_issue_typ(itmInspR.insp_inst_issue_typ());
					r.insp_ptn_cd(itmInspR.insp_ptn_cd());
					r.plnt_aprv_flg(itmInspR.plnt_aprv_flg());
					r.insp_bind_typ(itmInspR.insp_bind_typ());
					r.spl_qty(itmInspR.spl_qty());
					r.insp_bind_typ(itmInspR.insp_bind_typ());
					r.insp_lt(itmInspR.insp_lt());
					r.insp_offst(itmInspR.insp_offst());
				}
			}
		}
		
		protected void insOrUpdInspSchd(MCList<InspSchd_Upd01_CndR> insUpdL) {
			MCList<InspSchd_Upd01_CndR> insList = MCList.create(InspSchd_Upd01_CndR.class);
			MCList<MST_INSP_SCHD_R> updList = MCList.create(MST_INSP_SCHD_R.class);
			MCList<MST_INSP_SCHD_R> delList = MCList.create(MST_INSP_SCHD_R.class);
			
			//出来高or入荷実績時に、出来高or入荷予定行を行コピーして
			//登録した場合に同一の検査区分、作成元ＮＯ３を持つデータが同時に上ってくる。
			//その際に、作成元ＮＯ３に対応する検査予定が既に存在する場合、
			//１件は検査予定をUPDATE、それ以外は検査予定をINSERTしなければならない。
			//よってループ開始前に、insp_typ,src_no3,src_no4でソートし、
			//insp_typ,src_no3が前の行と同じであれば、検査予定をINSERTするようにしている。
			//
			//補足：
			//■作成元の実績が初回の場合は、上記考慮をしている。
			//■作成元の実績が更新の場合は、上記考慮をしてはいけない。
			//■行毎にUpdate文を発行すれば、このような複雑な処理に
			//する必要はないが、パフォーマンスを考慮しDBContainerのListで
			//dbUpdateKeyを実行したいのでこのような実装としている。
			
			insUpdL.sort(InspSchd_Upd01_CndR.$insp_typ, InspSchd_Upd01_CndR.$src_no3, InspSchd_Upd01_CndR.$src_no4);
			
			HashSet<String> updSchdSet = new HashSet<String>();
			MCList<MST_INSP_SCHD_R> schdL = MCList.create(MST_INSP_SCHD_R.class);
			MCList<MST_INSP_SCHD_R> actL = MCList.create(MST_INSP_SCHD_R.class);
			setInspSchdL(insUpdL, schdL, actL);
			
			MCIndexKey schdKey = schdL.createIndex(MST_INSP_SCHD_R.$src_no3, MST_INSP_SCHD_R.$insp_typ);
			MCIndexKey actKey = actL.createIndex(MST_INSP_SCHD_R.$src_no4, MST_INSP_SCHD_R.$insp_typ);
			
			setInspSchdDt(insUpdL);
			setStkInspTypForSchd(insUpdL);
			
			for (InspSchd_Upd01_CndR r : insUpdL) {
				MCList<MST_INSP_SCHD_R> subSchdL = subListSchdL(
						schdL, actL, schdKey, actKey, r.insp_typ(), r.src_no3(), r.src_no4());
				
				r.exists_insp_inst_flg(isInspInstructed(subSchdL));
				
				if (isInspSchdIns(r, updSchdSet, subSchdL)) {
					insList.add(r);
				}
				else {
					if (isInspTgt(r)) {
						updList.addAll(getInspSchdForUpd(r, subSchdL));
					}
					else {
						if (!subSchdL.isEmpty()) {
							// 今回検査対象外だが、検査予定が存在する場合
							if (!r.exists_insp_inst_flg()) {
								// 検査が指図されていなければ検査予定を取り消す。
								MST_INSP_SCHD_R delR = MST_INSP_SCHD_R.create();
								delR.insp_typ(r.insp_typ());
								delR.src_no3(r.src_no3());
								delR.src_no4(r.src_no4());
								delList.add(delR);
							}
							else {
								// マスタ変更を考慮し、検査が指図されている場合には、
								// そのまま検査対象と見なして更新を行う。
								updList.addAll(getInspSchdForUpd(r, subSchdL));
							}
						}
					}
				}
				
			}
			
			if (!insList.isEmpty()) {
				insInspSchd(insList);
			}
			
			if (!updList.isEmpty()) {
				updInspSchd(updList);
			}
			
			if (!delList.isEmpty()) {
				delInspSchd(delList);
			}
		}
		
		protected void insInspSchd(MCList<InspSchd_Upd01_CndR> insL) {
			doSeqCache(MSC_NUM_SYS_TYP.INSPS, insL.size());
			MCList<MST_INSP_SCHD_R> list = MCList.create(MST_INSP_SCHD_R.class);
			for (InspSchd_Upd01_CndR r : insL) {
				r.diff_pack_unit_qty(MCNumber.ZERO);
				r.ins_insp_schd_flg(true);
				r.insp_schd_no(getStrSeq(MSC_NUM_SYS_TYP.INSPS));
				list.add(createInspSchdRForIns(r));
			}
			MCQueryApiBuilder list_bldr = MCQueryApiBuilder.create(MST_INSP_SCHD_R.create("T"));
			dbInsert("MSBFL5010_MST_INSP_SCHD_I01", list, list_bldr);
		}
		
		protected void updInspSchd(MCList<MST_INSP_SCHD_R> schdL) {
			MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(t);
			editInspschdLSetStmt(t, schdL_bldr);
			dbUpdateKey("MSBFL5010_MST_INSP_SCHD_U02", schdL, schdL_bldr);
		}
		
		protected MST_INSP_SCHD_R createInspSchdRForIns(InspSchd_Upd01_CndR r) {
			MST_INSP_SCHD_R insSchdR = MST_INSP_SCHD_R.create();
			
			insSchdR.insp_schd_no(r.insp_schd_no());
			insSchdR.org_insp_schd_no(insSchdR.insp_schd_no());
			insSchdR.src_no1(r.src_no1());
			insSchdR.src_no2(r.src_no2());
			insSchdR.src_no3(r.src_no3());
			insSchdR.src_no4(r.src_no4());
			insSchdR.insp_typ(r.insp_typ());
			insSchdR.insp_mtd_typ(r.insp_mtd_typ());
			insSchdR.itm_cd(r.itm_cd());
			insSchdR.itm_sub1(r.itm_sub1());
			insSchdR.itm_sub2(r.itm_sub2());
			insSchdR.itm_sub3(r.itm_sub3());
			insSchdR.loc_cd(r.loc_cd());
			insSchdR.str_ln_cd(r.str_ln_cd());
			insSchdR.stk_arrv_bp_cd(r.stk_arrv_bp_cd());
			insSchdR.quality_typ(r.quality_typ());
			insSchdR.stk_insp_typ(r.stk_insp_typ());
			insSchdR.stk_id_typ(r.stk_id_typ());
			insSchdR.stk_bp_cd(r.bp_cd());
			insSchdR.gd_cd(r.gd_cd());
			insSchdR.lot_no(r.lot_no());
			insSchdR.sublot_no(r.sublot_no());
			insSchdR.sno1(r.sno1());
			insSchdR.sno1_mng_typ(r.sno1_mng_typ());
			insSchdR.sno2(r.sno2());
			insSchdR.sno2_mng_typ(r.sno2_mng_typ());
			insSchdR.sno3(r.sno3());
			insSchdR.sno3_mng_typ(r.sno3_mng_typ());
			insSchdR.sno4(r.sno4());
			insSchdR.sno4_mng_typ(r.sno4_mng_typ());
			insSchdR.sppl_cd(r.sppl_cd());
			insSchdR.maker_cd(r.maker_cd());
			insSchdR.mfg_loc_cd(r.mfg_loc_cd());
			insSchdR.from_site_cd(MAC_STR.NULL_VAL.value());
			insSchdR.bp_lot_no(r.bp_lot_no());
			insSchdR.master_dt(r.gr_tm().trunc(MCDateFieldType.DAY));
			insSchdR.st_tm(r.st_schd_tm());
			insSchdR.end_tm(r.end_schd_tm());
			insSchdR.pack_unit_qty(r.pack_unit_qty());
			insSchdR.pack_unit_cd(r.pack_unit_cd());
			insSchdR.base_unit_qty(r.base_unit_qty());
			insSchdR.base_unit_cd(r.base_unit_cd());
			insSchdR.smpl_schd_qty(r.spl_qty());
			insSchdR.latest_flg(true);
			insSchdR.insp_freq(MCNumber.ONE);
			insSchdR.insp_lt(r.insp_lt());
			insSchdR.insp_offst(r.insp_offst());
			if (isStsYet(r)) {
				r.insp_schd_sts_typ(MSC_INSP_STS_TYP.YET.value());
				insSchdR.insp_schd_sts_typ(r.insp_schd_sts_typ());
			}
			else {
				r.insp_schd_sts_typ(MSC_INSP_STS_TYP.SCHD.value());
				insSchdR.insp_schd_sts_typ(r.insp_schd_sts_typ());
			}
			insSchdR.itm_ord_no(r.itm_ord_no());
			insSchdR.in_prmt_insp_flg(isInPrmtInspSchd(r));
			insSchdR.insp_cnt_rmrks(r.insp_cnt_rmrks());
			insSchdR.trd_cd(getDefaultTrdCd(MAC_TRD_PTN_TYP.INSP.value()));
			insSchdR.insp_bind_typ(r.insp_bind_typ());
			
			return insSchdR;
		}
		
		protected void editInspschdLSetStmt(MST_INSP_SCHD_R t, MCQueryApiBuilder schdL_bldr) {
			schdL_bldr.setSet(t.src_no1);
			schdL_bldr.addSet(t.src_no4);
			schdL_bldr.addSet(t.loc_cd);
			schdL_bldr.addSet(t.str_ln_cd);
			schdL_bldr.addSet(t.stk_arrv_bp_cd);
			schdL_bldr.addSet(t.quality_typ);
			schdL_bldr.addSet(t.stk_insp_typ);
			schdL_bldr.addSet(t.stk_id_typ);
			schdL_bldr.addSet(t.stk_bp_cd);
			schdL_bldr.addSet(t.gd_cd);
			schdL_bldr.addSet(t.pack_unit_qty);
			schdL_bldr.addSet(t.pack_unit_cd);
			schdL_bldr.addSet(t.base_unit_qty);
			schdL_bldr.addSet(t.base_unit_cd);
			schdL_bldr.addSet(t.itm_ord_no);
			schdL_bldr.addSet(t.in_prmt_insp_flg);
			schdL_bldr.addSet(t.itm_cd);
			schdL_bldr.addSet(t.itm_sub1);
			schdL_bldr.addSet(t.itm_sub2);
			schdL_bldr.addSet(t.itm_sub3);
			schdL_bldr.addSet(t.lot_no);
			schdL_bldr.addSet(t.sublot_no);
			schdL_bldr.addSet(t.sno1);
			schdL_bldr.addSet(t.sno1_mng_typ);
			schdL_bldr.addSet(t.sno2);
			schdL_bldr.addSet(t.sno2_mng_typ);
			schdL_bldr.addSet(t.sno3);
			schdL_bldr.addSet(t.sno3_mng_typ);
			schdL_bldr.addSet(t.sno4);
			schdL_bldr.addSet(t.sno4_mng_typ);
			schdL_bldr.addSet(t.master_dt);
			schdL_bldr.addSet(t.st_tm);
			schdL_bldr.addSet(t.end_tm);
			schdL_bldr.addSet(t.smpl_schd_qty);
			schdL_bldr.addSet(t.sppl_cd);
			schdL_bldr.addSet(t.maker_cd);
			schdL_bldr.addSet(t.mfg_loc_cd);
			schdL_bldr.addSet(t.from_site_cd);
			schdL_bldr.addSet(t.bp_lot_no);
			schdL_bldr.addSet(t.insp_schd_sts_typ);
			schdL_bldr.addSet(t.insp_mtd_typ);
			schdL_bldr.addSet(t.insp_lt);
			schdL_bldr.addSet(t.insp_bind_typ);
			schdL_bldr.addSet(t.insp_offst);
			schdL_bldr.addSet(t.insp_cnt_rmrks);
		}
		
		protected void setInspSchdL(MCList<InspSchd_Upd01_CndR> upL,
				MCList<MST_INSP_SCHD_R> schdL,
				MCList<MST_INSP_SCHD_R> actL) {
			MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(t);
			MST_INSP_SCHD_R t1 = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder actL_bldr = MCQueryApiBuilder.create(t1);
			
			schdL_bldr.setWhere(t.insp_typ.eq(bind("insp_typ")));
			schdL_bldr.addWhereWithAnd(t.src_no3.eq(bind("src_no3")));
			schdL_bldr.addWhereWithAnd(t.src_no4.isNull());
			
			actL_bldr.setWhere(t1.insp_typ.eq(bind("insp_typ")));
			actL_bldr.addWhereWithAnd(t1.src_no4.eq(bind("src_no4")));
			
			for (InspSchd_Upd01_CndR r : upL) {
				MST_INSP_SCHD_R schdR = MST_INSP_SCHD_R.create();
				schdR.insp_typ(r.insp_typ());
				schdR.src_no3(r.src_no3());
				schdL.add(schdR);
				if (!isNull(r.src_no4())) {
					MST_INSP_SCHD_R actR = MST_INSP_SCHD_R.create();
					actR.insp_typ(r.insp_typ());
					actR.src_no4(r.src_no4());
					actL.add(actR);
				}
			}
			if (!schdL.isEmpty()) {
				dbSelect("MSBFL5010_MST_INSP_SCHD_S15", schdL, schdL_bldr, schdL);
			}
			if (!actL.isEmpty()) {
				dbSelect("MSBFL5010_MST_INSP_SCHD_S16", actL, actL_bldr, actL);
			}
		}
		
		protected void setInspSchdDt(MCList<InspSchd_Upd01_CndR> insUpdL) {
			MSBFL_InspSchdService.InspSchd_Srch03 o = MSBFL_InspSchdService.crtInspSchd_Srch03();
			
			for (InspSchd_Upd01_CndR r : insUpdL) {
				if (isInspTgt(r)) {
					InspSchd_Srch03_CndR oR = InspSchd_Srch03_CndR.create();
					
					oR.peg_no(r.peg_no());
					oR.insp_typ(r.insp_typ());
					oR.itm_cd(r.itm_cd());
					oR.itm_sub1(r.itm_sub1());
					oR.itm_sub2(r.itm_sub2());
					oR.itm_sub3(r.itm_sub3());
					oR.mfg_loc_cd(r.mfg_loc_cd());
					oR.sppl_cd(r.sppl_cd());
					oR.maker_cd(r.maker_cd());
					oR.schd_gr_dt(r.gr_tm());
					oR.insp_ptn_cd(null);
					oR.to_loc_cd(r.loc_cd());
					oR.insp_flg(true);
					
					o.up0().add(oR);
				}
			}
			
			if (!o.up0().isEmpty()) {
				o.exec();
				
				String[] hdrDestCols = new String[] {InspSchd_Upd01_CndR.$st_schd_tm, InspSchd_Upd01_CndR.$end_schd_tm};
				String[] hdrSrcCols = new String[] {InspSchd_Srch03_CndR.$st_dt, InspSchd_Srch03_CndR.$end_dt};
				copyByPegNo(insUpdL, hdrDestCols, o.down0(), hdrSrcCols);
			}
		}
		
		protected void setStkInspTypForSchd(MCList<InspSchd_Upd01_CndR> insUpdL) {
			MSBFL_InspSchdService.InspSchd_Srch02 o = MSBFL_InspSchdService.crtInspSchd_Srch02();
			
			for (InspSchd_Upd01_CndR r : insUpdL) {
				if (isInspTgt(r) && !r.act_flg()) {
					InspSchd_Srch02_CndR oR = InspSchd_Srch02_CndR.create();
					
					oR.peg_no(r.peg_no());
					oR.insp_typ(r.insp_typ());
					oR.src_no1(r.src_no1());
					oR.src_no2(r.src_no2());
					oR.src_no3(r.src_no3());
					oR.src_no4(r.src_no4());
					oR.itm_cd(r.itm_cd());
					oR.itm_sub1(r.itm_sub1());
					oR.itm_sub2(r.itm_sub2());
					oR.itm_sub3(r.itm_sub3());
					oR.quality_typ(r.quality_typ());
					oR.gr_dt(r.gr_tm());
					oR.base_unit_qty(r.base_unit_qty());
					oR.mfg_loc_cd(r.mfg_loc_cd());
					oR.sppl_cd(r.sppl_cd());
					oR.maker_cd(r.maker_cd());
					oR.loc_cd(r.loc_cd());
					
					o.up0().add(oR);
				}
			}
			
			if (!o.up0().isEmpty()) {
				o.exec();
				
				String[] hdrDestCols = new String[] {InspSchd_Upd01_CndR.$stk_insp_typ};
				String[] hdrSrcCols = new String[] {InspSchd_Srch02_CndR.$stk_insp_typ};
				copyByPegNo(insUpdL, hdrDestCols, o.down0(), hdrSrcCols);
			}
		}
		
		protected MCList<MST_INSP_SCHD_R> subListSchdL(
				MCList<MST_INSP_SCHD_R> schdL, MCList<MST_INSP_SCHD_R> actL,
				MCIndexKey schdKey, MCIndexKey actKey, String inspTyp, String srcNo3, String srcNo4) {
			
			if (!isNull(srcNo4)) {
				MCList<MST_INSP_SCHD_R> ret = actL.subList(actKey, srcNo4, inspTyp);
				if (!ret.isEmpty()) {
					// 値を設定する箇所があるので、cloneする
					return ret.clone();
				}
			}
			return schdL.subList(schdKey, srcNo3, inspTyp).clone();
		}
		
		protected boolean isInspSchdIns(InspSchd_Upd01_CndR r, HashSet<String> updSchdSet,
				MCList<MST_INSP_SCHD_R> schdL) {
			if (isInspTgt(r)) {
				//検査対象の場合
				if (schdL.isEmpty()) {
					//検査予定が存在しない場合はInsertする
					return true;
				}
				else {
					if (isFirstAct(schdL)) {
						//依頼元の実績に対応する検査予定がまだ存在しない場合は
						//同じ作成元の予定行があるかどうかで判断。
						// 検査指図が作成しない場合
						if (schdL.subList(srchR -> !isNull(srchR.insp_no())).isEmpty()) {
							if (updSchdSet.contains(r.src_no3())) {
								return true;
							}
							else {
								updSchdSet.add(r.src_no3());
								return false;
							}
						}
						else {
							if (hasSameSchdInfo(r, schdL)) {
								if (updSchdSet.contains(r.src_no3())) {
									return true;
								}
								else {
									updSchdSet.add(r.src_no3());
									return false;
								}
							}
							else {
								return true;
							}
						}
					}
					else {
						//作成元の実績に対応する検査予定が存在する場合は
						//Insertしない(Updateになる)。
						return false;
					}
				}
			}
			else {
				//検査対象外の場合はInsertしない。
				return false;
			}
		}
		
		/**
		 * 作成元の実績に対応する検査予定が存在しないかどうか
		 * @return
		 */
		protected boolean isFirstAct(MCList<MST_INSP_SCHD_R> schdL) {
			return schdL.subList(MST_INSP_SCHD_R.$src_no4, null).size() > 0;
		}
		
		protected boolean isSameSchdData(InspSchd_Upd01_CndR r, InspSchd_Upd01_CndR prevR) {
			return isSame(r.insp_typ(), prevR.insp_typ())
					&& isSame(r.src_no3(), prevR.src_no3());
		}
		protected boolean hasSameSchdInfo(InspSchd_Upd01_CndR r, MCList<MST_INSP_SCHD_R> schdL) {
			MAM_ITM_R itmR = _itmCache.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
			return isColSame(r, schdL.get(0), getLotCols(MAC_SUBLOT_MNG_TYP.isSTK(itmR.sublot_mng_typ())));
		}
		protected String[] getLotCols(boolean isDelSublotFlg) {
			if (isDelSublotFlg) {
				return new String[]{
						MST_INSP_SCHD_R.$itm_cd,
						MST_INSP_SCHD_R.$itm_sub1,
						MST_INSP_SCHD_R.$itm_sub2,
						MST_INSP_SCHD_R.$itm_sub3,
						MST_INSP_SCHD_R.$lot_no
				};
			}

			return new String[]{
					MST_INSP_SCHD_R.$itm_cd,
					MST_INSP_SCHD_R.$itm_sub1,
					MST_INSP_SCHD_R.$itm_sub2,
					MST_INSP_SCHD_R.$itm_sub3,
					MST_INSP_SCHD_R.$lot_no,
					MST_INSP_SCHD_R.$sublot_no
			};
		}
		
		protected MCList<MST_INSP_SCHD_R> getInspSchdForUpd(
				InspSchd_Upd01_CndR r, MCList<MST_INSP_SCHD_R> schdL) {
			
			r.upd_insp_schd_flg(true);
			r.pre_loc_cd(schdL.get(0).loc_cd());
			r.pre_str_ln_cd(schdL.get(0).str_ln_cd());
			
			return createInspSchdLForUpd(r, schdL);
		}
		
		protected MCList<MST_INSP_SCHD_R> createInspSchdLForUpd(
				InspSchd_Upd01_CndR r, MCList<MST_INSP_SCHD_R> schdL) {
			
			for (MST_INSP_SCHD_R schdR : schdL) {
				if (isNull(schdR.src_no4()) && !isNull(r.src_no4())) {
					r.diff_pack_unit_qty(r.pack_unit_qty());
				}
				else {
					r.diff_pack_unit_qty(r.pack_unit_qty().subtract(schdR.pack_unit_qty()));
				}
				
				schdR.sno1_mng_typ(r.sno1_mng_typ());
				schdR.sno2_mng_typ(r.sno2_mng_typ());
				schdR.sno3_mng_typ(r.sno3_mng_typ());
				schdR.sno4_mng_typ(r.sno4_mng_typ());
				schdR.src_no1(r.src_no1());
				schdR.src_no4(r.src_no4());
				schdR.loc_cd(r.loc_cd());
				schdR.str_ln_cd(r.str_ln_cd());
				schdR.stk_arrv_bp_cd(r.stk_arrv_bp_cd());
				schdR.stk_insp_typ(r.stk_insp_typ());
				schdR.stk_id_typ(r.stk_id_typ());
				schdR.stk_bp_cd(r.bp_cd());
				if (schdR.insp_freq().eq(MCNumber.ONE)) {
					schdR.quality_typ(r.quality_typ());
					schdR.gd_cd(r.gd_cd());
				}
				else {
					schdR.quality_typ(schdR.quality_typ());
					schdR.gd_cd(schdR.gd_cd());
				}
				schdR.pack_unit_qty(r.pack_unit_qty());
				schdR.pack_unit_cd(r.pack_unit_cd());
				schdR.base_unit_qty(r.base_unit_qty());
				schdR.itm_ord_no(r.itm_ord_no());
				schdR.in_prmt_insp_flg(isInPrmtInspSchd(r));
				schdR.insp_lt(r.insp_lt());
				schdR.insp_bind_typ(r.insp_bind_typ());
				schdR.insp_offst(r.insp_offst());
				schdR.insp_cnt_rmrks(r.insp_cnt_rmrks());
				if (!MSC_INSP_STS_TYP.isORD(schdR.insp_schd_sts_typ())) {
					//指図済みの場合は更新しない項目。
					schdR.itm_cd(r.itm_cd());
					schdR.itm_sub1(r.itm_sub1());
					schdR.itm_sub2(r.itm_sub2());
					schdR.itm_sub3(r.itm_sub3());
					schdR.lot_no(r.lot_no());
					schdR.sublot_no(r.sublot_no());
					schdR.sno1(r.sno1());
					schdR.sno2(r.sno2());
					schdR.sno3(r.sno3());
					schdR.sno4(r.sno4());
					schdR.master_dt(r.gr_tm().trunc(MCDateFieldType.DAY));
					schdR.st_tm(r.st_schd_tm());
					schdR.end_tm(r.end_schd_tm());
					schdR.smpl_schd_qty(r.spl_qty());
					schdR.sppl_cd(r.sppl_cd());
					schdR.maker_cd(r.maker_cd());
					schdR.mfg_loc_cd(r.mfg_loc_cd());
					schdR.bp_lot_no(r.bp_lot_no());
					if (isStsYet(r)) {
						r.insp_schd_sts_typ(MSC_INSP_STS_TYP.YET.value());
						schdR.insp_schd_sts_typ(r.insp_schd_sts_typ());
					}
					else {
						r.insp_schd_sts_typ(MSC_INSP_STS_TYP.SCHD.value());
						schdR.insp_schd_sts_typ(r.insp_schd_sts_typ());
					}
					
					schdR.insp_mtd_typ(r.insp_mtd_typ());
				}
				else {
					r.insp_schd_sts_typ(MSC_INSP_STS_TYP.ORD.value());
					
					MAM_ITM_R itmR = _itmCache.get(schdR.itm_cd(), schdR.itm_sub1(), schdR.itm_sub2(), schdR.itm_sub3());
					
					if (MSC_INSP_TYP.isPRDCT(r.insp_typ())
							&& MAC_SUBLOT_MNG_TYP.isSTK(itmR.sublot_mng_typ())) {
						schdR.sublot_no(r.sublot_no());
					}
				}
			}

			return schdL;
		}
		
		protected boolean isInPrmtInspSchd(InspSchd_Upd01_CndR r) {
			//検査予定を作成するにも関わらず、在庫検査区分が検査済の場合は、
			//検査中使用許可であるということ。
			//※全数検査の場合は、検査済であることはない。
			return MSC_STK_INSP_TYP.isFIN(r.stk_insp_typ());
		}
		
		protected boolean isStsYet(InspSchd_Upd01_CndR r) {
			if (MSC_INSP_TYP.isPRDCT(r.insp_typ())) {
				//指図保存 又は承認対象
				if (r.sts_schd_flg()){
					return false;
				}
				MST_INSP_SCHD_R tmp = MST_INSP_SCHD_R.create();
				tmp.src_no1(r.src_no1());
				tmp.insp_mtd_typ(r.insp_mtd_typ());
				tmp.src_no4(r.src_no4());
				tmp.itm_cd(r.itm_cd());
				tmp.itm_sub1(r.itm_sub1());
				tmp.itm_sub2(r.itm_sub2());
				tmp.itm_sub3(r.itm_sub3());
				tmp.lot_no(r.lot_no());
				tmp.sublot_no(r.sublot_no());
				tmp.sno1(r.sno1());
				tmp.sno2(r.sno2());
				tmp.sno3(r.sno3());
				tmp.sno4(r.sno4());
				
				return isStsYetCmn(tmp, r.insp_inst_issue_typ());
			}
			else {
				return !isNull(r.src_no4());
			}
		}
		
		protected boolean isStsYetCmn(MST_INSP_SCHD_R r, String instIssueTyp) {
			//仮保存
			if (isNull(r.src_no1())) {
				return false;
			}
			if (MAC_INSP_MTD_TYP.isTTL(r.insp_mtd_typ())) {
				return !isNull(r.src_no4());
			}
			if (MAC_INSP_INST_ISSUE_TYP.isON_CMPL(instIssueTyp)) {
				return !isNull(r.src_no4());
			}
			return !(isNullOr(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(),
					r.lot_no(), r.sublot_no()));
		}
		
		protected boolean isOnrProvInpt(InspSchd_Upd01_CndR up0R) {
			MAM_LOC_R locR = _locCache.get(up0R.loc_cd());
			MAM_BP_R bpR = _bpCache.get(locR.sppl_cd());
			MAM_PROV_UPRI_R upriR = _provUpriCache.get(up0R.gr_tm(),
					up0R.itm_cd(), up0R.itm_sub1(), up0R.itm_sub2(), up0R.itm_sub3(),
					locR.sppl_cd(), bpR.cur_cd(), locR.wg_cd());
			if(!isNull(upriR) && MAC_PROV_TYP.isONR_PROV(upriR.prov_typ()) && MAC_PROV_BASIS_TYP.isINPT(bpR.prov_basis_typ())) {
				return true;
			}
			return false;
		}
	}
	/**
	 * InspSchd_Upd03オペレーション.<p>
	 *
	 * 検査指図・規格検査指図・規格検査実績を登録する。<br>
	 */
	public class InspSchd_Upd03 extends MSBFL_InspSchdService_MC_A.InspSchd_Upd03 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			setPegNo(up0());
			getInspSchd();
			getItmInsp();
			getItmInspForPreInsp();
			
			for (InspSchd_Upd03_CndR up0R : up0()) {
				if (isSkip(up0R)) {
					continue;
				}
				
				createInspInst(up0R);
				// 先行検査指図承認情報を引き継ぐ
				updInstInstAprv(up0R);
				createInspStd(up0R);
			}
		}
		
		protected MCList<InspSchd_Srch01_CndR> _itmInspCache = MCList.create(InspSchd_Srch01_CndR.class);
		protected MCList<InspSchd_Srch01_CndR> _itmInspCacheForPreInsp = MCList.create(InspSchd_Srch01_CndR.class);
		
		protected void getItmInsp() {
			if (_schdL.isEmpty()) {
				return;
			}
			
			MSBFL_InspSchdService.InspSchd_Srch01 o = MSBFL_InspSchdService.crtInspSchd_Srch01();
			
			for (InspSchd_Upd03_CndR up0R : up0()) {
				InspSchd_Srch01_CndR oR = InspSchd_Srch01_CndR.create();
				MST_INSP_SCHD_R schdR = _schdL.getFirst(_schdKey, up0R.src_no4(), up0R.insp_typ());
				
				if (isNull(schdR)) {
					continue;
				}
				
				oR.peg_no(up0R.peg_no());
				oR.itm_cd(schdR.itm_cd());
				oR.itm_sub1(schdR.itm_sub1());
				oR.itm_sub2(schdR.itm_sub2());
				oR.itm_sub3(schdR.itm_sub3());
				oR.mfg_loc_cd(schdR.mfg_loc_cd());
				oR.sppl_cd(schdR.sppl_cd());
				oR.maker_cd(schdR.maker_cd());
				oR.from_site_cd(schdR.from_site_cd());
				oR.to_loc_cd(schdR.loc_cd());
				oR.insp_typ(schdR.insp_typ());
				oR.base_dt(schdR.master_dt());
				oR.insp_ptn_cd(null);
				oR.no_insp_srch_flg(false);
				
				o.up0().add(oR);
			}
			
			if (!o.up0().isEmpty()) {
				o.exec();
				
				if (!o.down0().isEmpty()) {
					_itmInspCache.setAll(o.down0());
				}
			}
		}
		
		protected InspSchd_Srch01_CndR getItmInspR(MCNumber pegNo) {
			return _itmInspCache.getFirst(InspSchd_Srch01_CndR.$peg_no, pegNo);
		}

		protected void getItmInspForPreInsp() {
			if (_schdL.isEmpty()) {
				return;
			}
			
			MSBFL_InspSchdService.InspSchd_Srch01 o = MSBFL_InspSchdService.crtInspSchd_Srch01();
			
			for (InspSchd_Upd03_CndR up0R : up0()) {
				MST_INSP_SCHD_R schdR = _schdL.getFirst(_schdKey, up0R.src_no4(), up0R.insp_typ());
				if (isNull(schdR)) {
					continue;
				}
				
				InspSchd_Srch01_CndR oR = InspSchd_Srch01_CndR.create();
				oR.peg_no(up0R.peg_no());
				oR.itm_cd(schdR.itm_cd());
				oR.itm_sub1(schdR.itm_sub1());
				oR.itm_sub2(schdR.itm_sub2());
				oR.itm_sub3(schdR.itm_sub3());
				oR.mfg_loc_cd(schdR.mfg_loc_cd());
				oR.sppl_cd(schdR.sppl_cd());
				oR.maker_cd(schdR.maker_cd());
				oR.from_site_cd(null);
				oR.to_loc_cd(schdR.loc_cd());
				oR.insp_typ(schdR.insp_typ());
				oR.base_dt(schdR.master_dt());
				oR.insp_ptn_cd(null);
				oR.no_insp_srch_flg(false);
				
				o.up0().add(oR);
			}
			
			if (!o.up0().isEmpty()) {
				o.exec();
				
				if (!o.down0().isEmpty()) {
					_itmInspCacheForPreInsp.setAll(o.down0());
				}
			}
		}

		/**
		 * 前処理を行います。このままロジックを続行可能の場合は、trueを返す。
		 * 中断する場合は、falseを返す。
		 * @return ロジックを続行する場合はtrue
		 */
		protected boolean isSkip(InspSchd_Upd03_CndR up0R) {
			MST_INSP_SCHD_R schdR = _schdL.getFirst(_schdKey, up0R.src_no4(), up0R.insp_typ());
			
			if (isNull(schdR)) {
				return true;
			}
			
			up0R.insp_schd(schdR);
			
			if (!MAC_INSP_MTD_TYP.isSPEC(up0R.insp_schd().insp_mtd_typ())) {
				return true;
			}
			
			//検査指図済の場合はfalse
			if (!isNull(up0R.insp_schd().insp_no())) {
				return true;
			}
			
			//再検査が行われている場合はfalse
			if (!isNull(up0R.insp_schd().own_insp_schd_no())) {
				return true;
			}
			
			if (!MSC_INSP_TYP.isACCPT(up0R.insp_schd().insp_typ())) {
				return true;
			}
			
			if (!isPreInspValid(up0R)) {
				return true;
			}
			boolean isInstSelected = setPreInspInst(up0R);
			if (!isInstSelected) {
				return true;
			}
			if (!checkPreInspInst(up0R)) {
				return true;
			}
			return false;
		}
		
		MCList<MST_INSP_SCHD_R> _schdL = MCList.create(MST_INSP_SCHD_R.class);
		MCIndexKey _schdKey;
		
		protected void getInspSchd() {
			MCList<MST_INSP_SCHD_R> schdL = MCList.create(MST_INSP_SCHD_R.class);
			MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(t);
			schdL_bldr.setWhere(t.insp_typ.eq(bind("insp_typ")));
			schdL_bldr.addWhereWithAnd(t.src_no4.eq(bind("src_no4")));
			schdL_bldr.addWhereWithAnd(t.latest_flg.eq(value(true)));
			dbSelect("MSBFL5010_MST_INSP_SCHD_S17", schdL, schdL_bldr, up0());
			
			_schdL.setAll(schdL);
			_schdKey = _schdL.createIndex(MST_INSP_SCHD_R.$src_no4, MST_INSP_SCHD_R.$insp_typ);
		}
		
		/**
		 * 先行検査適用対象か
		 * @return
		 */
		protected boolean isPreInspValid(InspSchd_Upd03_CndR up0R) {
			InspSchd_Srch01_CndR itmInspR = _itmInspCacheForPreInsp.getFirst(InspSchd_Srch01_CndR.$peg_no, up0R.peg_no());
			
			if (isNull(itmInspR)) {
				return false;
			}
			if (!itmInspR.pre_insp_valid_flg()) {
				return false;
			}
			return true;
		}
		
		/**
		 * 先行検査の指図情報を取得する。
		 * 
		 * @param row
		 * @return 値をセットした場合 true
		 */
		protected boolean setPreInspInst(InspSchd_Upd03_CndR up0R) {
			MCList<MST_INSP_INST_R> preInspL = MCList.create(MST_INSP_INST_R.class);
			MST_INSP_INST_R t = MST_INSP_INST_R.create("T");
			MCQueryApiBuilder preInspL_bldr = MCQueryApiBuilder.create(t);
			MST_INSP_ACT_R t2 = MST_INSP_ACT_R.create("T2");
			
			preInspL_bldr.addSelect(t2.quality_typ);
			preInspL_bldr.addSelect(t2.insp_judg_rslt_typ);
			preInspL_bldr.setWhere(t.itm_cd.eq(bind("1")), up0R.insp_schd().itm_cd());
			preInspL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("1")), up0R.insp_schd().itm_sub1());
			preInspL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("1")), up0R.insp_schd().itm_sub2());
			preInspL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("1")), up0R.insp_schd().itm_sub3());
			preInspL_bldr.addWhereWithAnd(t.insp_typ.eq(bind("1")), MSC_INSP_TYP.PRCD.value());
			preInspL_bldr.addWhereWithAnd(t.sppl_cd.eq(bind("1")), up0R.insp_schd().sppl_cd());
			preInspL_bldr.addWhereWithAnd(t.bp_lot_no.eq(bind("1")), up0R.insp_schd().bp_lot_no());
			preInspL_bldr.addWhereWithAnd(t.insp_mtd_typ.eq(bind("1")), MAC_INSP_MTD_TYP.SPEC.value());
			preInspL_bldr.addLeftOuterJoin(t2, bracket( t.insp_no.eq(t2.insp_no)));
			preInspL_bldr.addOrderByDesc(t.insp_no);
			int cnt = dbSelect("MSBFL5010_MST_INSP_INST_S01", preInspL, preInspL_bldr);
			if (cnt > 0) {
				up0R.pre_insp_inst(preInspL.get(0));
				up0R.quality_typ(preInspL.get(0).getStringNE("QUALITY_TYP"));
				up0R.insp_judg_rslt_typ(preInspL.get(0).getStringNE("INSP_JUDG_RSLT_TYP"));
				return true;
			}
			return false;
		}

		/**
		 * 先行検査引継を行える状態かどうかを判断する。
		 * @return 先行検査引継ができる場合はtrue
		 */
		protected boolean checkPreInspInst(InspSchd_Upd03_CndR up0R) {
			
			if (up0R.pre_insp_inst().insp_aprv_flg()) {
				MSC_INSP_JUDG_RSLT_TYP rslt;
				rslt = MSC_INSP_JUDG_RSLT_TYP.getNE(up0R.insp_judg_rslt_typ());
				if (rslt == null) {
					return false;
				}
				else if (MSC_INSP_JUDG_RSLT_TYP.is_stk_good(rslt.value())) {
					return true;
				}
				return false;
			}
			else {
				if (MAC_QUALITY_TYP.isGOOD(up0R.quality_typ())) {
					return true;
				}
				else {
					return false;
				}
			}
		}

		// 前処理（ここまで）
		// 検査指図作成（ここから）
		protected void createInspInst(InspSchd_Upd03_CndR up0R) {
			// 規格検査のデータはここでは作成しない。
			MSBFL_InspInstService.InspInst_Ins01 o = MSBFL_InspInstService.crtInspInst_Ins01();
			InspInst_Ins01_RsltR hdrR = InspInst_Ins01_RsltR.create();
			MCList<InspInst_Ins01_RsltSchdR> schdL = MCList.create(InspInst_Ins01_RsltSchdR.class);
			
			setupInstHdr(hdrR, up0R);
			setupInstSchd(schdL, up0R);
			
			o.up0().add(hdrR);
			o.up2().setAll(schdL);
			
			o.exec();
			
			up0R.insp_schd().insp_no(o.down0().get(0).insp_no());
		}
		
		/**
		 * 検査指図ロジックのヘッダ情報をセット
		 */
		protected void setupInstHdr(InspInst_Ins01_RsltR dest, InspSchd_Upd03_CndR src) {
			copy(dest, src, createMap_InspInst_Ins01_RsltR_InspSchd_Upd03_CndR());
		}

		/**
		 * 検査指図ロジック呼び出し用（ヘッダ）
		 */
		protected Map_InspInst_Ins01_RsltR_InspSchd_Upd03_CndR<InspInst_Ins01_RsltR, InspSchd_Upd03_CndR> createMap_InspInst_Ins01_RsltR_InspSchd_Upd03_CndR() {
			return new Map_InspInst_Ins01_RsltR_InspSchd_Upd03_CndR<InspInst_Ins01_RsltR, InspSchd_Upd03_CndR>();
		}

		/**
		 * 検査指図ロジック呼び出し用（ヘッダ）
		 */
		public class Map_InspInst_Ins01_RsltR_InspSchd_Upd03_CndR<D extends InspInst_Ins01_RsltR, S extends InspSchd_Upd03_CndR> extends MCRowMapper<D, S> {
			@Override
			public void valueCopy(D dest, S src) {
				InspSchd_Srch01_CndR itmInspR = getItmInspR(src.peg_no());
				
				dest.peg_no(0);
				dest.insp_schd_no(src.insp_schd().insp_schd_no());
				dest.inst_dpt_cd(src.pre_insp_inst().inst_dpt_cd());
				dest.inst_usr_cd(src.pre_insp_inst().inst_usr_cd());
				dest.inst_dt(src.pre_insp_inst().inst_dt());
				dest.insp_mtd_typ(src.insp_schd().insp_mtd_typ());
				dest.master_dt(src.pre_insp_inst().master_dt());
				dest.st_tm(src.insp_schd().st_tm());
				dest.end_tm(src.insp_schd().end_tm());
				dest.insp_ptn_cd(src.pre_insp_inst().insp_ptn_cd());
				dest.insp_std_no(src.pre_insp_inst().insp_std_no());
				dest.plnt_aprv_flg(itmInspR.plnt_aprv_flg());
				dest.lims_flg(itmInspR.insp_aprv_flg() ? false : isLims(src));
				dest.intr_rmrks(src.pre_insp_inst().intr_rmrks());
				dest.sub_char1(src.pre_insp_inst().sub_char1());
				dest.sub_char2(src.pre_insp_inst().sub_char2());
				dest.sub_char3(src.pre_insp_inst().sub_char3());
			}
		}

		/**
		 * 検査指図ロジックの検査予定情報のセット
		 */
		protected void setupInstSchd(MCList<InspInst_Ins01_RsltSchdR> dest, InspSchd_Upd03_CndR src) {
			InspInst_Ins01_RsltSchdR up = InspInst_Ins01_RsltSchdR.create();
			up.insp_schd_no(src.insp_schd().insp_schd_no());
			up.smpl_inst_qty(MCNumber.ZERO);
			up.setAttributes(src);
			dest.add(up);
		}
		
		protected boolean isLims(InspSchd_Upd03_CndR upR) {
			MSUCL_SCMLinkUtil.SCMLinkUtil_Srch03 ope = MSUCL_SCMLinkUtil.crtSCMLinkUtil_Srch03();
			
			prepareScmLinkUtilSrch03Up(ope, upR);
			
			ope.exec();
			
			if (ope.down0().isEmpty()) {
				return false;
			}
			
			return ope.down0().get(0).lims_flg();
		}
		
		protected void prepareScmLinkUtilSrch03Up(MSUCL_SCMLinkUtil.SCMLinkUtil_Srch03 ope, InspSchd_Upd03_CndR upR) {
			SCMLinkUtil_Srch03_CndR r = ope.up0().add();
			r.peg_no(0);
			r.loc_cd(upR.insp_schd().loc_cd());
			r.itm_cd(upR.insp_schd().itm_cd());
			r.itm_sub1(upR.insp_schd().itm_sub1());
			r.itm_sub2(upR.insp_schd().itm_sub2());
			r.itm_sub3(upR.insp_schd().itm_sub3());
			r.master_dt(getToday());
		}
		
		/**
		 * 検査指図承認情報を更新する
		 * @param up0R
		 */
		protected void updInstInstAprv(InspSchd_Upd03_CndR up0R) {
			InspSchd_Srch01_CndR itmInspR = getItmInspR(up0R.peg_no());

			if (up0R.pre_insp_inst().insp_aprv_flg()
					&& itmInspR.insp_aprv_flg()) {
				MSBFL_InspInstService.InspInst_Upd02 o = MSBFL_InspInstService.crtInspInst_Upd02();
				InspInst_Upd02_RsltR upR = InspInst_Upd02_RsltR.create();

				upR.insp_no(up0R.insp_schd().insp_no());
				upR.insp_aprv_sts_typ(MSC_INSP_APRV_STS_TYP.INST_ACPT.value());
				upR.aprv_dt(up0R.pre_insp_inst().aprv_dt());
				upR.aprv_dpt_cd(up0R.pre_insp_inst().aprv_dpt_cd());
				upR.aprv_usr_cd(up0R.pre_insp_inst().aprv_usr_cd());
				upR.aprv_tm(up0R.pre_insp_inst().aprv_tm());
				upR.aprv_rsn(up0R.pre_insp_inst().aprv_rsn());
				o.up0().add(upR);

				o.exec();
			}
		}
		// 検査指図作成（ここまで）

		// 規格検査指図・実績（ここから）
		/**
		 * 規格検査実績の作成
		 */
		protected void createInspStd(InspSchd_Upd03_CndR up0R) {

			MCList<MST_STD_INSP_INST_R> std = MCList.create(MST_STD_INSP_INST_R.class);
			MST_STD_INSP_INST_R t = MST_STD_INSP_INST_R.create("T");
			MCQueryApiBuilder std_bldr = MCQueryApiBuilder.create(t);
			MST_STD_INSP_ACT_R t2 = MST_STD_INSP_ACT_R.create("T2");
			MAM_INSP_SPEC_R m1 = MAM_INSP_SPEC_R.create("M1");
			std_bldr.addSelect(t2.qn_insp_val);
			std_bldr.addSelect(t2.ql_insp_val);
			std_bldr.addSelect(t2.st_tm);
			std_bldr.addSelect(t2.end_tm);
			std_bldr.addSelect(t2.dpt_cd);
			std_bldr.addSelect(t2.usr_cd);
			std_bldr.addSelect(t2.std_insp_rslt_typ);
			std_bldr.addSelect(t2.cnf_flg);
			std_bldr.addSelect(t2.cnf_dt);
			std_bldr.addSelect(t2.cnf_dpt_cd);
			std_bldr.addSelect(t2.cnf_usr_cd);
			std_bldr.addSelect(t2.act_intr_rmrks);
			std_bldr.addSelect(t2.cnf_intr_rmrks);
			std_bldr.addSelect(t2.sub_char1);
			std_bldr.addSelect(t2.sub_char2);
			std_bldr.addSelect(t2.sub_char3);
			std_bldr.addSelect(m1.pre_insp_inf_typ);
			std_bldr.addLeftOuterJoin(t2,
					bracket(t.std_insp_inst_no.eq(t2.std_insp_inst_no)));
			std_bldr.addLeftOuterJoin(m1, bracket(t.insp_seq.eq(m1.insp_seq)));
			std_bldr.setWhere(t.insp_no.eq(bind("1")), up0R.pre_insp_inst().insp_no());
			std_bldr.addWhereWithAnd(
					m1.itm_cd.eq(bind("1"))
					.and(m1.itm_sub1.eq(bind("2")))
					.and(m1.itm_sub2.eq(bind("3")))
					.and(m1.itm_sub3.eq(bind("4")))
					.and(m1.insp_ptn_cd.eq(bind("5")))
					.and(bind("6")
							.between(m1.st_dt, m1.end_dt)),
					up0R.pre_insp_inst().itm_cd(), up0R.pre_insp_inst().itm_sub1(),
					up0R.pre_insp_inst().itm_sub2(), up0R.pre_insp_inst().itm_sub3(),
					up0R.pre_insp_inst().insp_ptn_cd(), up0R.insp_schd().master_dt());
			dbSelect("MSBFL5010_MST_STD_INSP_INST_S01", std, std_bldr);
			
			//insp_std_inst_no,insp_std_act_no,insp_no,insp_typ,insp_freqを置き換える。
			for (MST_STD_INSP_INST_R r : std) {
				r.std_insp_inst_no(getInspStdInstNo());
				r.addStringColumn(MST_STD_INSP_ACT_R.$std_insp_act_no, getInspStdActNo());
				r.insp_no(up0R.insp_schd().insp_no());
				r.insp_typ(up0R.insp_schd().insp_typ());
				r.insp_freq(up0R.insp_schd().insp_freq());
			}
			
			MCList<MST_STD_INSP_INST_R> instL = MCList.create(MST_STD_INSP_INST_R.class);
			MCQueryApiBuilder instL_bldr = MCQueryApiBuilder.create(MST_STD_INSP_INST_R.create("T"));
			setAll(instL, std, createMap_MST_STD_INSP_INST_R_MST_STD_INSP_INST_R());
			dbInsert("MSBFL5010_MST_STD_INSP_INST_I01", instL, instL_bldr);
			
			MCList<MST_STD_INSP_INST_R> stdAct = MCList.create(MST_STD_INSP_INST_R.class);
			for (MST_STD_INSP_INST_R r : std) {
				if (!isNull(r.getStringNE("PRE_INSP_INF_TYP"))) {
					stdAct.add(r);
				}
			}
			
			if (!stdAct.isEmpty()) {
				for (MST_STD_INSP_INST_R r : stdAct) {
					if (MAC_PRE_INSP_INF_TYP.isABBR(r.getStringNE(MAM_INSP_SPEC_R.$pre_insp_inf_typ))) {
						r.setStringNE("STD_INSP_RSLT_TYP", MSC_STD_INSP_RSLT_TYP.AB.value());
					}
				}
				
				MCList<MST_STD_INSP_ACT_R> actL = MCList.create(MST_STD_INSP_ACT_R.class);
				MCQueryApiBuilder actL_bldr = MCQueryApiBuilder.create(MST_STD_INSP_ACT_R.create("T"));
				setAll(actL, stdAct, createMap_MST_STD_INSP_ACT_R_MST_STD_INSP_INST_R());
				dbInsert("MSBFL5010_MST_STD_INSP_ACT_I01", actL, actL_bldr);
			}
		}
		
		protected Map_MST_STD_INSP_INST_R_MST_STD_INSP_INST_R<MST_STD_INSP_INST_R,MST_STD_INSP_INST_R> createMap_MST_STD_INSP_INST_R_MST_STD_INSP_INST_R() {
			return new Map_MST_STD_INSP_INST_R_MST_STD_INSP_INST_R<MST_STD_INSP_INST_R, MST_STD_INSP_INST_R>();
		}

		public class Map_MST_STD_INSP_INST_R_MST_STD_INSP_INST_R<D extends MST_STD_INSP_INST_R, S extends MST_STD_INSP_INST_R> extends MCRowMapper<D,S>{
			@Override
			public void valueCopy(D dest, S src){
				dest.std_insp_inst_no(src.std_insp_inst_no());
				dest.insp_typ(src.insp_typ());
				dest.insp_no(src.insp_no());
				dest.insp_freq(src.insp_freq());
				dest.insp_seq(src.insp_seq());
				dest.insp_point_cd(src.insp_point_cd());
				dest.insp_qlqn_typ(src.insp_qlqn_typ());
				dest.qn_out_min(src.qn_out_min());
				dest.qn_out_max(src.qn_out_max());
				dest.sign_out_min_typ(src.sign_out_min_typ());
				dest.sign_out_max_typ(src.sign_out_max_typ());
				dest.qn_in_min(src.qn_in_min());
				dest.qn_in_max(src.qn_in_max());
				dest.sign_in_min_typ(src.sign_in_min_typ());
				dest.sign_in_max_typ(src.sign_in_max_typ());
				dest.trd_unit_cd(src.trd_unit_cd());
				dest.qn_int_digit(src.qn_int_digit());
				dest.qn_int_frac(src.qn_int_frac());
				dest.ql_std_val(src.ql_std_val());
				dest.add_point_flg(src.add_point_flg());
				dest.intr_rmrks(src.intr_rmrks());
				dest.sub_char1(src.sub_char1());
				dest.sub_char2(src.sub_char2());
				dest.sub_char3(src.sub_char3());
			}
		}
		
		protected Map_MST_STD_INSP_ACT_R_MST_STD_INSP_INST_R<MST_STD_INSP_ACT_R,MST_STD_INSP_INST_R> createMap_MST_STD_INSP_ACT_R_MST_STD_INSP_INST_R() {
			return new Map_MST_STD_INSP_ACT_R_MST_STD_INSP_INST_R<MST_STD_INSP_ACT_R, MST_STD_INSP_INST_R>();
		}

		public class Map_MST_STD_INSP_ACT_R_MST_STD_INSP_INST_R<D extends MST_STD_INSP_ACT_R, S extends MST_STD_INSP_INST_R> extends MCRowMapper<D,S>{
			@Override
			public void valueCopy(D dest, S src){
				dest.std_insp_act_no(src.getStringNE(MST_STD_INSP_ACT_R.$std_insp_act_no));
				dest.std_insp_inst_no(src.std_insp_inst_no());
				dest.insp_no(src.insp_no());
				dest.qn_insp_val(src.getNumberNE(MST_STD_INSP_ACT_R.$qn_insp_val));
				dest.ql_insp_val(src.getStringNE(MST_STD_INSP_ACT_R.$ql_insp_val));
				dest.st_tm(src.getDateNE(MST_STD_INSP_ACT_R.$st_tm));
				dest.end_tm(src.getDateNE(MST_STD_INSP_ACT_R.$end_tm));
				dest.dpt_cd(src.getStringNE(MST_STD_INSP_ACT_R.$dpt_cd));
				dest.usr_cd(src.getStringNE(MST_STD_INSP_ACT_R.$usr_cd));
				dest.std_insp_rslt_typ(src.getString(MST_STD_INSP_ACT_R.$std_insp_rslt_typ));
				dest.std_insp_rslt_typ(src.getString(MST_STD_INSP_ACT_R.$std_insp_rslt_typ));
				dest.cnf_flg(isSame(src.getStringNE(MST_STD_INSP_ACT_R.$cnf_flg), "1"));
				dest.cnf_dt(src.getDateNE(MST_STD_INSP_ACT_R.$cnf_dt));
				dest.cnf_dpt_cd(src.getStringNE(MST_STD_INSP_ACT_R.$cnf_dpt_cd));
				dest.cnf_usr_cd(src.getStringNE(MST_STD_INSP_ACT_R.$cnf_usr_cd));
				dest.act_intr_rmrks(src.getStringNE(MST_STD_INSP_ACT_R.$act_intr_rmrks));
				dest.cnf_intr_rmrks(src.getStringNE(MST_STD_INSP_ACT_R.$cnf_intr_rmrks));
				dest.sub_char1(src.getStringNE(MST_STD_INSP_ACT_R.$sub_char1));
				dest.sub_char2(src.getStringNE(MST_STD_INSP_ACT_R.$sub_char2));
				dest.sub_char3(src.getStringNE(MST_STD_INSP_ACT_R.$sub_char3));
			}
		}
		
		/**
		 * 検査規格指図ＮＯ発番
		 */
		protected String getInspStdInstNo() {
			return getStrSeq(MSC_NUM_SYS_TYP.INSPSI);
		}
		/**
		 * 検査規格実績ＮＯ発番
		 */
		protected String getInspStdActNo() {
			return getStrSeq(MSC_NUM_SYS_TYP.INSPSA);
		}
		
		// 規格検査指図・実績（ここまで）
	}

	//FMCB CUSTOM END
}