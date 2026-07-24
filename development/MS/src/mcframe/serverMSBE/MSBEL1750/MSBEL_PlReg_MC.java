package mcframe.serverMSBE.MSBEL1750;

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
import java.util.List;

import mcframe.serverMSBE.MSBEL1750.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBE.MSBEL5720.*;
import static mcframe.serverMSBE.MSBEL1750.Query.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.commonMSBE.MSBER0210.*;
import mcframe.serverCore.report.MCServerReportManager;
import mcframe.commonCore.report.container.MCReportInfoR;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.serverMAUC.MAUCL5020.*;

import java.util.Locale;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_PlReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_PlReg_MC extends MSBEL_PlReg_MC_A{
	//FMCB CUSTOM START
	/**
	 * Srch01オペレーション.<p>
	 *
	 * パッキングリスト登録対象のインボイス情報を検索する<br>
	 */
	public class Srch01 extends MSBEL_PlReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			
			doSearchIvHdr(up0(), down0());	// インボイスヘッダの検索
			if (down0().isEmpty()) {
				return;
			}
			checkIvHdr();					// インボイスの状態チェック
			doSearchIvDtl(up0(), down1());	// インボイス明細の検索

		}
		
		@Override
		protected void editListMain() {
			super.editListMain();

			// 純重量、容積の端数処理
			editWtDim(down1());

			// 各総量情報計算
			sumWtDim(down0(), down1());

			//相似条件グループNOを採番
			setGrpData(down1());
		}
		
		/**
		 * インボイスの状態チェック
		 */
		protected void checkIvHdr() {
			
			if (down0().pl_skip_flg()) {
				throw new MCAppException(MSBEL0315);
			}
			else if (down0().pl_reg_flg()) {
				throw new MCAppException(MSBEL0316);
			}
		}
	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * パッキングリスト情報を検索する<br>
	 */
	public class Srch02 extends MSBEL_PlReg_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			
			doSearchIvHdr(up0(), down0());	// インボイスヘッダの検索
			if (down0().isEmpty()) {
				return;
			}
			checkIvHdr();					// インボイスの状態チェック
			doSearchPlDtl(up0(), down1());	// パッキング明細の検索
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
			// 各総量情報計算
			sumWtDim(down0(), down1());
			
			//相似条件グループNOを採番
			setGrpData(down1());
		}
		
		/**
		 * インボイスの状態チェック
		 */
		protected void checkIvHdr() {
			
			if (down0().pl_skip_flg()) {
				throw new MCAppException(MSBEL0315);
			}
			else if (!down0().pl_reg_flg()) {
				throw new MCAppException(MSBEL0317);
			}
		}
	}
	/**
	 * Srch03オペレーション.<p>
	 *
	 * 純重量・容積を検索する<br>
	 */
	public class Srch03 extends MSBEL_PlReg_MC_A.Srch03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			// キャッシュの初期化
			initItmCache(up0());

			// 品目単位情報の取得
			doSearchItmUnit(up0(), down0());
		}
	}

	// ------------ 検索処理共通 : START------------
	/**
	 * インボイスヘッダの情報を検索する。
	 * @param cnd　検索条件
	 * @param rslt　検索結果
	 */
	protected void doSearchIvHdr(Srch01_CndR cnd, Srch01_HdrR rslt){
		executeQuery(rslt, MSBEL1750_MST_IV_S01(), cnd);
	}

	/**
	 * インボイス明細の情報を検索する。
	 * @param cnd　検索条件
	 * @param rslt　検索結果
	 */
	protected void doSearchIvDtl(Srch01_CndR cnd, MCList<Srch01_DtlR> rslt){
		executeQuery(rslt, MSBEL1750_MST_IV_D_S01(), cnd);
	}
	
	/**
	 * パッキング明細の情報を検索する。
	 * @param cnd　検索条件
	 * @param rslt　検索結果
	 */
	protected void doSearchPlDtl(Srch01_CndR cnd, MCList<Srch01_DtlR> rslt){
		executeQuery(rslt, MSBEL1750_MST_PL_D_S01(), cnd);
	}

	/**
	 * 品目単位情報を取得する。
	 * @param cndL 取得対象リスト
	 * @param rslt 取得結果リスト
	 */
	protected void doSearchItmUnit( MCList<Srch01_DtlR> cndL, MCList<Srch01_DtlR> rslt) {
		for(Srch01_DtlR r: cndL){
			if(chkReqForSrch03(r)){
				MAVM_ITM_UNIT_R itmUnit = getItmUnitCache(r);

				// 純重量
				if (!isNull(itmUnit.unit_wt())) {
					MCNumber net_wt= r.trd_unit_qty().multiply(itmUnit.unit_wt(), Srch01_DtlR.net_wt_META.scale(), MAC_RND_TYP.CUTOFF.toMC());
					r.net_wt(net_wt);
				}

				// 容積
				if (!isNull(itmUnit.unit_dim())) {
					MCNumber dim= r.trd_unit_qty().multiply(itmUnit.unit_dim(), Srch01_DtlR.dim_META.scale(), MAC_RND_TYP.CUTOFF.toMC());
					r.dim(dim);
				}
			}
			rslt.add(r);
		}
	}
	/**
	 * 必須チェックを実施
	 * @param r
	 * @return
	 */
	protected boolean chkReqForSrch03(Srch01_DtlR r) {
		if(isNull(r.itm_cd()) || isNull(r.itm_sub1()) || isNull(r.itm_sub2()) || isNull(r.itm_sub3())
				|| isNull(r.trd_unit_cd()) || isNull(r.trd_unit_qty()) ){
			return false;
		}
		return true;
	}

	
	/**
	 * 品目単位マスタのキャッシュの初期化を行う。
	 * @param dtlL バインド値のリスト
	 */
	protected void initItmCache(MCList<Srch01_DtlR> dtlL) {	
		_initItmUnitCache(dtlL);
	}

	//品目単位マスタのキャッシュ	
	protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _itmUnitCache = null;
	protected void _initItmUnitCache(MCList<Srch01_DtlR> dtlL) {
		_itmUnitCache = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(
				MCQueryApiBuilder.create(MAVM_ITM_UNIT_R.create("T")), dtlL,
				Srch01_DtlR.$itm_cd, Srch01_DtlR.$itm_sub1, Srch01_DtlR.$itm_sub2, Srch01_DtlR.$itm_sub3, Srch01_DtlR.$trd_unit_cd);
	}
	protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> getItmUnitCache() {
		return _itmUnitCache;
	}
	protected MAVM_ITM_UNIT_R getItmUnitCache(Srch01_DtlR cnd) {
		Comparable<?>[]  in = new Comparable[]{cnd. itm_cd(), cnd.itm_sub1(), cnd.itm_sub2(), cnd.itm_sub3(), cnd.trd_unit_cd()};
		return _itmUnitCache.get(in);
	}

	/**
	 * 純重量、容積の端数処理<br>
	 * @param DtlL 明細情報
	 */
	protected void editWtDim(MCList<Srch01_DtlR> DtlL) {
		for (Srch01_DtlR dtlR : DtlL) {
			// 純重量
			if (!isNull(dtlR.net_wt())) {
				dtlR.net_wt(dtlR.net_wt().setScale(Srch01_DtlR.net_wt_META.scale(), MCNumber.MODE_DOWN));
			}
			// 容積
			if (!isNull(dtlR.dim())) {
				dtlR.dim(dtlR.dim().setScale(Srch01_DtlR.dim_META.scale(), MCNumber.MODE_DOWN));
			}
		}
	}

	/**
	 * 各総量情報を合算する
	 * @param hdrR 設定先のヘッダ情報
	 * @param DtlL 合算元の明細情報
	 */
	protected void sumWtDim(Srch01_HdrR hdrR, MCList<Srch01_DtlR> DtlL) {
		hdrR.ttl_net_wt(DtlL.sum(Srch01_DtlR.$net_wt));
		hdrR.ttl_grss_wt(DtlL.sum(Srch01_DtlR.$grss_wt));
		hdrR.ttl_dim(DtlL.sum(Srch01_DtlR.$dim));
	}
	
	/**
	 * 相似条件グループ単位での値の設定をする。<p>
	 * @param dtlL 採番対象のリスト
	 */
	@SuppressWarnings("unchecked")
	protected void setGrpData(MCList<Srch01_DtlR> d1){
		MCList<Srch01_DtlR> dtlL = d1.clone();
		MCList<Srch01_DtlR>[] tmpSimCndGrpL = dtlL.groupList(grpSimCndGrpCol());
		MCList<Srch01_DtlR>[] simCndGrpL = new MCList[tmpSimCndGrpL.length];

		MCList<Srch01_DtlR> dispSeqL = MCList.create(Srch01_DtlR.class);
		for(int i = 0; i < tmpSimCndGrpL.length; i ++) {
			MCList<Srch01_DtlR> tmpL = tmpSimCndGrpL[i];
			tmpL.sort(Srch01_DtlR.$disp_seq);
			dispSeqL.add(tmpL.get(0));
		}
		dispSeqL.sort(Srch01_DtlR.$disp_seq);

		int cnt = 0;
		for(Srch01_DtlR r : dispSeqL) {
			for(int i = 0; i < tmpSimCndGrpL.length; i ++) {
				if(isSame(r.disp_seq(), tmpSimCndGrpL[i].get(0).disp_seq())) {
					simCndGrpL[cnt] = tmpSimCndGrpL[i];
					cnt ++;

					break;
				}
			}
		}
	
		int simCndGrpNo = 1;
		d1.clear();
		for(MCList<Srch01_DtlR> grpL : simCndGrpL){
			// 相似条件グループＮＯの設定
			grpL.setNumber(Srch01_DtlR.$sim_cnd_grp_no,  simCndGrpNo);
			simCndGrpNo++;
			
			// 相似条件グループＮＯ単位での合計数量を設定
			grpL.setNumber(Srch01_DtlR.$sum_qty,  grpL.sum(Srch01_DtlR.$trd_unit_qty));
			
			d1.addAll(grpL);
		}
	}
	/**
	 * 相似条件グループとなるカラム名配列を返す。<p>
	 * @return　相似条件グループＮＯとなるカラム名配列
	 */
	protected String[] grpSimCndGrpCol(){
		return new String[]{Srch01_DtlR.$itm_cd, Srch01_DtlR.$itm_sub1, Srch01_DtlR.$itm_sub2, Srch01_DtlR.$itm_sub3 
										, Srch01_DtlR.$itm_nm, Srch01_DtlR.$sno1, Srch01_DtlR.$sno2, Srch01_DtlR.$sno3, Srch01_DtlR.$sno4
										, Srch01_DtlR.$iv_itm_nm, Srch01_DtlR.$trd_unit_cd, Srch01_DtlR.$cst_po_no, Srch01_DtlR.$cst_po_d_no
										, Srch01_DtlR.$cst_itm_cd, Srch01_DtlR.$cst_itm_nm, Srch01_DtlR.$cntry_org_cd};
	}
// ------------ 検索処理共通 : END------------

	/**
	 * Chk01オペレーション.<p>
	 *
	 * パッキングリスト情報の更新前チェックをする<br>
	 */
	public class Chk01 extends MSBEL_PlReg_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			if (hasErr()) {
				return;
			}

			setDown();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			// インボイスヘッダに対するチェック
			msgL.addAll(chkIvHrd(up0()));
			
			// インボイス明細に対するチェック
			msgL.addAll(chkIvDtl(up0(), up1().subList(MCRow.Status.MODIFY, MCRow.Status.CREATE, MCRow.Status.NONE)));
			
			//エラーFLG設定
			if(!msgL.isEmpty()){
				up0().err_flg(true);
			}

			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			 MCMessageList msgL =  super.doServerCheckSub();
			// 小数部有効桁チェック 
			msgL.addAll(checkDecPlace(up1(), Chk01_DtlR.$trd_unit_dec_place, Chk01_DtlR.$trd_unit_qty));
			
			return msgL;
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
		}
	}

	// ------------ チェック処理共通 : START------------
	/**
	 * インボイスヘッダに対するチェックをする。
	 * @param hdrR 上り電文．ヘッダ情報
	 * @return　メッセージリスト
	 */
	protected MCMessageList chkIvHrd(Chk01_HdrR hdrR){
		MCMessageList msgL = new MCMessageList();

		MST_IV_R ivHdr = MST_IV_R.create();
		MST_IV_R t = MST_IV_R.create("T");
		MCQueryApiBuilder ivHdr_bldr = MCQueryApiBuilder.create(t);
		ivHdr_bldr.setWhere(t.iv_no.eq(bind("iv_no")), hdrR);
		int cnt = dbSelectForUpdateNoWait("MSBEL1750_MST_IV_S01", ivHdr, ivHdr_bldr, hdrR);
		
		if(cnt == 0){
			msgL.add(new MCMessage(MSBEL0134, hdrR.iv_no()));
			return msgL;
		}
		
		// 更新カウンタチェックはインボイスヘッダ単位で実施
		msgL.addAll(checkUpdCntrNE(hdrR, Chk01_HdrR.$upd_cntr, ivHdr));

		if(ivHdr.cmpl_flg() && !MSC_IV_SRC_TYP.isSLS(ivHdr.iv_src_typ())){
			msgL.add(new MCMessage(MSBEL0135, hdrR.iv_no()));
		}
		
		if(ivHdr.pl_skip_flg()){
			msgL.add(new MCMessage(MSBEL0136, hdrR.iv_no()));
		}
		
		// インボイス管理NOを補完
		hdrR.iv_mng_no(ivHdr.iv_mng_no());
		hdrR.iv_rev(ivHdr.iv_rev());

		return msgL;
	}

	/**
	 * インボイス明細に対するチェックをする。<p>
	 *  【前提条件】
	 *  	インボイス管理NOが補完されている事。
	 * @param hdrR 上り電文．ヘッダ情報
	 * @param DtlL 上り電文．明細情報
	 * @return　メッセージリスト
	 */
	protected MCMessageList chkIvDtl(Chk01_HdrR hdrR, MCList<Chk01_DtlR> DtlL){
		MCMessageList msgL = new MCMessageList();

		if(isNull(DtlL) || DtlL.isEmpty()){
			return msgL;
		}
		
		// インボイス管理NOをキーにインボイス明細情報を取得
		MCList<MST_IV_D_R> ivD = getIvD(hdrR.iv_mng_no());
		
		for(Chk01_DtlR sumR : sumDtl(DtlL)){
			// パッキング数量の合計数量とインボイス明細の合計数量が一致するかチェック
			msgL.add(chkSumQty(ivD, sumR));
		}
		
		return msgL;
	}
	/**
	 * パッキングの数量を合算する。<p>
	 * @param plL　パッキング情報（上り電文．明細情報）
	 * @return　合算結果のリスト
	 */
	protected MCList<Chk01_DtlR> sumDtl(MCList<Chk01_DtlR> plL){
		MCGroupByPolicy policy = new MCGroupByPolicy();
		policy.sum(Chk01_DtlR.$trd_unit_qty);
		policy.addKey(getSumDtlKeys());
		return plL.groupBy(policy);
	}
	
	/**
	 * パッキングリストの合算キー配列を返す。<p>
	 *  注意）getSumIvDKeysの仕様と同期を取る必要あり。
	 * @return　パッキングリストの合算キー配列
	 */
	protected String[] getSumDtlKeys(){
		return  new String[]{
				Chk01_DtlR.$itm_cd
				,Chk01_DtlR.$itm_nm
				,Chk01_DtlR.$itm_sub1
				,Chk01_DtlR.$itm_sub2
				,Chk01_DtlR.$itm_sub3
				,Chk01_DtlR.$sno1	
				,Chk01_DtlR.$sno2
				,Chk01_DtlR.$sno3
				,Chk01_DtlR.$sno4
				,Chk01_DtlR.$cntry_org_cd
				,Chk01_DtlR.$trd_unit_cd
				,Chk01_DtlR.$cst_po_no
				,Chk01_DtlR.$cst_po_d_no
				,Chk01_DtlR.$cst_itm_cd
				,Chk01_DtlR.$cst_itm_nm
				};
	}


	/**
	 * インボイス管理NOをキーに、インボイス明細を一括検索する。<p>
	 * @param ivMngNo インボイス明細NO
	 * @return インボイス明細情報
	 */
	protected MCList<MST_IV_D_R> getIvD(String ivMngNo){
		MCList<MST_IV_D_R> dbc = MCList.create(MST_IV_D_R.class);
		MST_IV_D_R t = MST_IV_D_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.trd_unit_qty);
		for (String s : getSumIvDKeys()) {
			dbc_bldr.addSelect(t.getColumn$(s));
		}
		
		dbc_bldr.setWhere(t.iv_mng_no.eq(bind("1")), ivMngNo);
		dbSelect("MSBEL1750_MST_IV_D_S01", dbc, dbc_bldr);
		
		return dbc;
	}
	
	/**
	 * パッキングの合計数量とインボイス明細の合計数量が一致するかチェックする。
	 * @param ivDL インボイス明細
	 * @param pl 数量合算済みのパッキング情報
	 * @return
	 */
	protected MCMessage chkSumQty(MCList<MST_IV_D_R> ivDL, Chk01_DtlR pl){
		if(!isSame(pl.trd_unit_qty(), sumQty(ivDL, pl))){
			return new MCMessage(MSBEL0137, toDispItm(pl.itm_cd(), pl.itm_sub1(), pl.itm_sub2(), pl.itm_sub3()), pl.itm_nm()
					,toDispSno(pl.sno1(), pl.sno2(), pl.sno3(), pl.sno4()),pl.cntry_org_cd(), pl.trd_unit_cd(), pl.cst_po_no()
					,pl.cst_po_d_no(), pl.cst_itm_cd(), pl.cst_itm_nm());
		}
		
		return null;
	}
	
	/**
	 * パッキング情報に対応したインボイス明細の数量を合算する。
	 * @param dtlL　インボイス明細
	 * @param packSumR　パッキング情報
	 * @return　合算数量
	 */
	protected MCNumber sumQty(MCList<MST_IV_D_R> dtlL, Chk01_DtlR packSumR){
		return dtlL.subList(getSumIvDKeys(), packSumR).sum(MST_IV_D_R.$trd_unit_qty);
	}

	/**
	 * インボイス明細の合算キー配列を返す。<p>
	 *  注意）getSumDtlKeysの仕様と同期を取る必要あり。
	 * @return　インボイス明細の合算キー配列
	 */
	protected String[] getSumIvDKeys(){
		return  new String[]{
				MST_IV_D_R.$itm_cd
				,MST_IV_D_R.$itm_sub1
				,MST_IV_D_R.$itm_sub2
				,MST_IV_D_R.$itm_sub3
				,MST_IV_D_R.$sno1
				,MST_IV_D_R.$sno2
				,MST_IV_D_R.$sno3
				,MST_IV_D_R.$sno4
				,MST_IV_D_R.$cntry_org_cd
				,MST_IV_D_R.$trd_unit_cd
				,MST_IV_D_R.$cst_po_no
				,MST_IV_D_R.$cst_po_d_no
				,MST_IV_D_R.$cst_itm_cd
				,MST_IV_D_R.$cst_itm_nm
				};
	}

	// ------------ チェック処理共通 : END------------			

	/**
	 * Upd01オペレーション.<p>
	 *
	 * パッキングリスト情報を登録・訂正する<br>
	 */
	public class Upd01 extends MSBEL_PlReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			// 前処理
			preProc();

			// 更新前チェック
			callThisChk01();
			throwUpdErr();

			// 更新処理
			prcCM(up0(), up1());
			
			// パッキングリスト帳票発行
			callPrnt01();
		}
		/**
		 * 前処理
		 */
		protected void preProc() {
			// 各総量情報を合算
			sumWtDim(up0(), up1().subList(MCRow.Status.MODIFY, MCRow.Status.CREATE, MCRow.Status.NONE));

			// パッキングリスト登録済みとする
			up0().pl_reg_flg(true);
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			up_CALL_OPE01_chk01_0(chk01_up0, up0());
			chk01_up1.setAll(up1());
			chk01.call();
			up0().iv_mng_no(chk01_down0.iv_mng_no());
			up0().iv_rev(chk01_down0.iv_rev());
			copyErrFlg(up0(), chk01_down0);
		}
		/**
		 * 印刷処理を実行する
		 */
		protected void callPrnt01() {
			if(up0().pl_immed_prnt_flg()){
				MSBEL_ExRptService.ExRpt_Prnt04  prnt = MSBEL_ExRptService.crtExRpt_Prnt04();
				copy(prnt.up0(), up0(), createMap_ExRpt_Prnt02_CndR_Chk01_HdrR());
				prnt.exec();
				copyErrFlg(up0(), prnt.down0());
			}
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * パッキングリスト情報を取り消す。<br>
	 */
	public class Del01 extends MSBEL_PlReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			// 前処理
			preProc();

			// 更新前チェック
			callThisChk01();
			throwCanErr();

			// 更新処理
			prcD(up0());
		}
		/**
		 * 前処理
		 */
		protected void preProc() {
			// パッキングリストを未登録とする
			up0().pl_reg_flg(false);
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			mapUpContainers(CALL_OPE01);
			chk01.call();
			up0().iv_mng_no(chk01_down0.iv_mng_no());
			up0().iv_rev(chk01_down0.iv_rev());
			copyErrFlg(up0(), chk01_down0);
		}
	}
	// ------------ 更新処理共通 : START------------
	
	/**
	 * 登録・訂正処理を実施する。
	 */
	protected void prcCM(Chk01_HdrR hdrR, MCList<Chk01_DtlR> DtlL){
		// パッキングリスト明細の削除
		delPlD(hdrR);
		
		// パッキングリスト明細の登録
		insPlD(hdrR, DtlL);
		
		// インボイスヘッダを更新
		updIv(hdrR);
	}
	
	/**
	 * 取消処理を実施する。
	 */
	protected void prcD(Chk01_HdrR hdrR){
		// パッキングリスト明細の削除
		delPlD(hdrR);

		// インボイスヘッダを更新
		updIv(hdrR);
	}
	/**
	 * パッキング明細を削除する。
	 * @param hdrR ヘッダ情報
	 */
	protected void delPlD(Chk01_HdrR hdrR){
		// インボイスNOをキーにパッキング明細を物理削除
		MST_PL_D_R t = MST_PL_D_R.create("T");

		execDbDelete("MSBEL1750_MST_PL_D_D01", t, t.iv_no.eq(bind("1")), hdrR.iv_no());
	}
	/**
	 * パッキング明細を登録する。
	 * @param hdrR ヘッダ情報
	 */
	protected void insPlD(Chk01_HdrR hdrR, MCList<Chk01_DtlR> DtlL){
		MCList<MST_PL_D_R> insDbc = MCList.create(MST_PL_D_R.class);
		
		// 発番システム区分のNOを発番する場合は、事前にキャッシュ（doSeqCache）を実行してから
		// getStrSeqでＮＯを取得する（通信回数削減のため）
		doSeqCache(MSC_NUM_SYS_TYP.PLD, DtlL.size());

		int dispSeq = 1;
		for(Chk01_DtlR dtlR : DtlL.subList(MCRow.Status.MODIFY, MCRow.Status.CREATE, MCRow.Status.NONE)){
			if (!dtlR.PL_d().sundry_itm_flg()) {
				dtlR.itm_nm(null);
				dtlR.iv_itm_nm(null);
			}
			dtlR.PL_d().iv_no(hdrR.iv_no());
			//パッキングリスト明細NOの発番
			setPlDNo(dtlR);
			dtlR.disp_seq(dispSeq);
			dispSeq++;
			
			insDbc.add(dtlR.PL_d());
		}
		dbInsertEx("MSBEL1750_MST_PL_D_I01", insDbc,
				MCQueryApiBuilder.create(MST_PL_D_R.create("T")));
	}
	protected void setPlDNo(Chk01_DtlR dtlR) {
		dtlR.pl_d_no(getStrSeq(MSC_NUM_SYS_TYP.PLD));
	}
	
	/**
	 * インボイスヘッダ情報を更新する。
	 * @param hdrR 更新元のヘッダ情報
	 */
	protected void updIv(Chk01_HdrR hdrR) {
		MST_IV_R iv = MST_IV_R.create();
		MST_IV_R t = MST_IV_R.create("T");
		MCQueryApiBuilder iv_bldr = MCQueryApiBuilder.create(t);
		iv_bldr.setSet(getIvUpdCols());
		iv.pl_prnt_flg(false);
		iv_bldr.setWhere(t.iv_no.eq(bind("1")), hdrR.iv_no());
		copy(iv, hdrR, createMap_MST_IV_R_Chk01_HdrR());
		dbUpdate("MSBEL1750_MST_IV_U01", iv, iv_bldr);
		
		iv.iv_mng_no(hdrR.iv_mng_no());
		iv.iv_rev(hdrR.iv_rev());
		callRevDataIns01(iv);
	}
	
	/**
	 * インボイスヘッダの更新対象カラム名配列を返す。
	 * @return インボイスヘッダの更新対象カラム名配列　
	 */
	protected MCPermColumn[] getIvUpdCols() {
		MST_IV_R t = MST_IV_R.create();
		return new MCPermColumn[]{
				t.pl_rmrks
				,t.sub_char1
				,t.sub_char2
				,t.sub_char3
				,t.ttl_net_wt
				,t.ttl_grss_wt
				,t.ttl_dim
				,t.pl_reg_flg
				,t.pl_prnt_flg
		};
	}
	
	/**
	 * 「改訂履歴データ更新リスト」テーブルにデータを登録サービス呼び出し
	 */
	protected void callRevDataIns01(MST_IV_R ivR) {
		
		MAUCL_RevDataService.RevData_Ins01 ope = MAUCL_RevDataService.crtRevData_Ins01();
		RevData_Ins01_DtlR opeR = RevData_Ins01_DtlR.create();
		opeR.rev_data_src_no(ivR.iv_mng_no());
		opeR.rev_no(ivR.iv_rev());
		opeR.rev_data_typ(MAC_REV_DATA_TYP.MST_IV.value());
		ope.up0().add(opeR);
		
		ope.exec();
	}
	
	/**
	 * 各総量情報を合算する
	 * @param hdrR 設定先のヘッダ情報
	 * @param DtlL 合算元の明細情報
	 */
	protected void sumWtDim(Chk01_HdrR hdrR, MCList<Chk01_DtlR> DtlL) {
		hdrR.ttl_net_wt(DtlL.sum(Chk01_DtlR.$net_wt));
		hdrR.ttl_grss_wt(DtlL.sum(Chk01_DtlR.$grss_wt));
		hdrR.ttl_dim(DtlL.sum(Chk01_DtlR.$dim));
	}
	// ------------ 更新処理共通 : END------------

	
	


// Mapper
	protected Map_MST_IV_R_Chk01_HdrR<MST_IV_R,Chk01_HdrR> createMap_MST_IV_R_Chk01_HdrR() {
		return new Map_MST_IV_R_Chk01_HdrR<MST_IV_R, Chk01_HdrR>();
	}
	public class Map_MST_IV_R_Chk01_HdrR<D extends MST_IV_R, S extends Chk01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_IV_R.$iv_no, Chk01_HdrR.$iv_no);
			addColumnPathMap(MST_IV_R.$ttl_net_wt, Chk01_HdrR.$ttl_net_wt);
			addColumnPathMap(MST_IV_R.$ttl_grss_wt, Chk01_HdrR.$ttl_grss_wt);
			addColumnPathMap(MST_IV_R.$ttl_dim, Chk01_HdrR.$ttl_dim);
			addColumnPathMap(MST_IV_R.$pl_rmrks, Chk01_HdrR.$pl_rmrks);
			addColumnPathMap(MST_IV_R.$pl_reg_flg, Chk01_HdrR.$pl_reg_flg);
			addColumnPathMap(MST_IV_R.$sub_char1, Chk01_HdrR.$sub_char1);
			addColumnPathMap(MST_IV_R.$sub_char2, Chk01_HdrR.$sub_char2);
			addColumnPathMap(MST_IV_R.$sub_char3, Chk01_HdrR.$sub_char3);
		}
	}

	protected Map_ExRpt_Prnt02_CndR_Chk01_HdrR<ExRpt_Prnt02_CndR,Chk01_HdrR> createMap_ExRpt_Prnt02_CndR_Chk01_HdrR() {
		return new Map_ExRpt_Prnt02_CndR_Chk01_HdrR<ExRpt_Prnt02_CndR, Chk01_HdrR>();
	}
	public class Map_ExRpt_Prnt02_CndR_Chk01_HdrR<D extends ExRpt_Prnt02_CndR, S extends Chk01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Prnt01_CndR.$iv_no, Chk01_HdrR.$iv_no);

		}
	}
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * パッキングリストを発行する<br>
	 */
	public class Prnt01 extends MSBEL_PlReg_MC_A.Prnt01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			//パッキングリスト印刷処理
			MSBEL_ExRptService.ExRpt_Prnt04 prnt04 = MSBEL_ExRptService.crtExRpt_Prnt04();
			prnt04.up0().iv_no(up0().iv_no());
			prnt04.exec();
		}
	}

	//FMCB CUSTOM END
}