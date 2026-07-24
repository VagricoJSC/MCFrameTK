package mcframe.clientMSBC.MSBCP1130;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import mcframe.clientCore.beans.action.*;
import mcframe.clientCore.beans.combobox.*;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.event.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.beans.tree.*;
import mcframe.clientCore.container.MCConstRow;

import mcframe.clientFXBA.FXBAP0130.*;
import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP0100.*;
import mcframe.clientMAUB.MAUBP0220.*;
import mcframe.clientMAUB.MAUBP0250.*;
import mcframe.clientMAUB.MAUBP0260.*;
import mcframe.clientMAUB.MAUBP0320.*;
import mcframe.clientMAUB.MAUBP0400.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5070.*;
import mcframe.clientMAUB.MAUBP5120.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5190.*;
import mcframe.clientMAUB.MAUBP5220.*;
import mcframe.clientMAUB.MAUBP5230.*;
import mcframe.clientMAUB.MAUBP5240.*;
import mcframe.clientMAUB.MAUBP5310.*;
import mcframe.clientMAUB.MAUBP5320.*;
import mcframe.clientMAUB.MAUBP5370.*;
import mcframe.clientMSUB.MSUBP0020.*;
import mcframe.clientMSUB.MSUBP5020.*;
import mcframe.clientMSUB.MSUBP5030.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
//import static mcframe.commonMBUA.MBUAC0010.MBUAC_List.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;
import static mcframe.commonMSUA.MSUAC0010.MSUAC_List.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.util.*;
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
import mcframe.clientFXUC.FXUCP0010.*;
import mcframe.clientMAUB.MAUBP0330.IfCanAcDtBase;
import mcframe.clientMAUD.MAUDP0110.MAUDP_RowListener;
import mcframe.clientCore.container.MCRowEvent;
import mcframe.clientCore.container.io.MCCsvBinaryReader;
import mcframe.clientCore.beans.list.*;
import static mcframe.clientMSUC.MSUCP0030.MSUCP_ProdUtil.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBCP_MfgActListReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBCP_MfgActListReg_MC extends MSBCP_MfgActListReg_MC_A implements IfListRegPanel, IfCanAcDtBase, MCResultViewerWithFile {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	// 一覧（出来高・副産品実績）キャッシュ
	protected Map<MCNumber, MCList<RsltYieldByProdR>> _yieldByProdMap = new HashMap<MCNumber, MCList<RsltYieldByProdR>>();
	
	// 同一製造指図ＮＯ、分割連番の上部一覧のキャッシュ
	protected Map<List<Comparable<?>>, MCList<RsltR>> _sameMfgActMap = new HashMap<List<Comparable<?>>, MCList<RsltR>>();
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBCP_MfgActListReg_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBCP_MfgActListReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBCL1130_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1130_Ins01Caller<P extends MSBCP_MfgActListReg, B extends MS_MSBCL1130_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBCL1130_Ins01Caller(P p, B b) {
			super(p, b);
		}
		
		protected MCList<RsltR> _RsltLForCall = MCList.create(RsltR.class);
		protected MCList<RsltYieldByProdR> _RsltYieldByprodLForCall = MCList.create(RsltYieldByProdR.class);
		protected Map<MCNumber, RsltR> _rsltMap = new HashMap<MCNumber, RsltR>();
		
		@Override
		protected void initCaller() {
			super.initCaller();
			
			_RsltLForCall = getRsltL().subList(RsltR.$check, true);
			_RsltYieldByprodLForCall = MCList.create(RsltYieldByProdR.class);
			
			for (RsltR r : _RsltLForCall) {
				MCList<RsltYieldByProdR> list = _yieldByProdMap.get(r.peg_no());
				if (!isNull(list)) {
					_RsltYieldByprodLForCall.addAll(list.subList(row -> !row.isStatusNone()));
				}
				_rsltMap.put(r.peg_no(), r);
			}
			
			if (getUnschdBulkSetR().act_immed_prnt_flg()) {
				setPrint(true);
			}
			if (getUnschdBulkSetR().async_flg()) {
				setAsync(true);
				setCsvOutForAsync(true);
				
				// 非同期実行用に、退避項目を初期化
				_yieldByProdMap.values().forEach(l -> {
					l.forEach(r -> {
						r.upd_tgt_flg(false);
						r.gui_index(r.getGUIIndex());
					});
				});

				// 非同期実行用に、対象有無を設定
				_RsltYieldByprodLForCall.setBooleanNE(RsltYieldByProdR.$upd_tgt_flg, true);
			}
		}
		
		@Override
		protected boolean csvOutForAsync() {
			super.csvOutForAsync();
			
			List<MCList<?>> containers = new ArrayList<MCList<?>>();

			// 検索条件
			MCList<CndR> cndL = MCList.create(CndR.class);
			cndL.add(getCndR());
			containers.add(cndL);

			// 一括設定
			MCList<UnschdBulkSetR> unschdBulkSetL = MCList.create(UnschdBulkSetR.class);
			unschdBulkSetL.add(getUnschdBulkSetR());
			containers.add(unschdBulkSetL);

			// ヘッダ
			containers.add(getRsltL());

			// 明細
			MCList<RsltYieldByProdR> yieldByProdL = MCList.create(RsltYieldByProdR.class);
			_yieldByProdMap.values().forEach(l -> yieldByProdL.addAll(l));
			containers.add(yieldByProdL);
			
			return csvOutFromContainer(containers);
		}

		@Override
		protected void setMode() {
			super.setMode();

			if (isAsyncRsltMode()) {
				setINSStatus();
				RsltTable.selectLeftmostColumn(0);
				Ctrl_ctrl_PPanel.expand(false);
			}
			else if (isAsync()) {
				setFIX_INSStatus();
			}
		}

		/***
		 * フィールド設定
		 * 
		 * @param rsltL ヘッダリスト
		 * @param rsltYieldByProdL 明細リスト
		 */
		public void setField(MCList<RsltR> hdrL,  MCList<RsltYieldByProdR> dtlL) {
			_RsltLForCall = hdrL;
			_RsltYieldByprodLForCall = dtlL;
			hdrL.forEach(r -> _rsltMap.put(r.peg_no(), r));
		}
		
		@Override
		protected void checkReq(MCMessageList msgList) {
			checkReqSub(msgList, getRsltL());
		}

		@Override
		protected void confirmForCallStack(MCMessageList msgList) {
			super.confirmForCallStack(msgList);
			chkYieldByProdQty(msgList);
			chkYield(msgList);
		}
		
		protected void chkYieldByProdQty(MCMessageList msgList) {
			// 予定無しの行、削除行は事前に除く
			MCList<RsltYieldByProdR> tgtL = _RsltYieldByprodLForCall
					.subList(r -> !r.isStatusDelete() && !isNull(r.yield_schd_no()));
			
			MCList<RsltYieldByProdR> chkL = MCList.create(RsltYieldByProdR.class);
			for (MCList<RsltYieldByProdR> gL : tgtL.groupList(RsltYieldByProdR.$yield_schd_no)) {
				RsltYieldByProdR gR = gL.get(0).clone();
				gR.base_unit_yield_act_qty(gL.sum(RsltYieldByProdR.$base_unit_yield_act_qty));
				gR.setAttributes(_rsltMap.get(gR.hdr_peg_no()));
				gR.relateContainer(gL.get(0));// メッセージをソートするために必要
				chkL.add(gR);
			}
			if (!chkL.isEmpty()) {
				msgList.addAll(doInptChk(MAC_FUNC_TYP.YIELD.value(),
						columnRsltYieldByProd_itm_cd, columnRsltYieldByProd_itm_sub1,
						columnRsltYieldByProd_itm_sub2, columnRsltYieldByProd_itm_sub3,
						columnRsltYieldByProd_base_unit_yield_act_qty,
						columnRsltYieldByProd_base_unit_yield_schd_qty, chkL,
						columnRsltYieldByProd_yield_schd_no));
			}
		}
		
		/**
		 * 品目実際収率、工程実際収率の大小チェック
		 * @param msgList
		 */
		protected void chkYield(MCMessageList msgList) {
			// 削除行は事前に除く
			MCList<RsltR> tgtL = _RsltLForCall.subList(r -> !r.isStatusDelete());

			for (RsltR r : tgtL) {
				if (isInsStatus()) {
					// ヘッダ単位の登録
					if (!isNullOr(r.itm_lower_yield(), r.itm_yield())) {
						if (r.itm_yield().lt((r.itm_lower_yield()))) {
							msgList.add(new MCMessage(r, RsltR.$itm_yield, MSBCP1016,
									r.itm_yield(), r.itm_lower_yield(),
									toDispGUIIndex(r)));
						}
					}
					if (!isNullOr(r.itm_upper_yield(), r.itm_yield())) {
						if (r.itm_yield().gt((r.itm_upper_yield()))) {
							msgList.add(new MCMessage(r, RsltR.$itm_yield, MSBCP1017,
									r.itm_yield(), r.itm_upper_yield(),
									toDispGUIIndex(r)));
						}
					}
				}
			}
		}
		
		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			
			bridge.up1().setAll(_RsltLForCall);
			bridge.up2().setAll(_RsltYieldByprodLForCall);
		}
		
		@Override
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = super.getUpBlocks();
			// 実装仕様書上では画面で表示されているリストにマッピングしているが、
			// 下部一覧の上り電文はインスタンス変数として保持しているyieldMapを元に作成している（_RsltYieldByprodLForCall）
			// 登録後の下り電文のマージのために、_RsltYieldByprodLForCallをup2に置き換える
			result.set(2, _RsltYieldByprodLForCall);
			return result;
		}

		@Override
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = super.getDownBlocks();
			// getUpBlocksと同様の理由で置き換える
			result.set(1, _RsltYieldByprodLForCall);
			return result;
		}
		@Override
		protected void show() {
			super.show();
			String[] downCols = {RsltR.$peg_no};
			String[] causeRowCols = {RsltYieldByProdR.$hdr_peg_no};
			Rslt_rtn_msg_p_PPanel.setMsgByKeyCols(_RsltLForCall, downCols, getParamMessage(), causeRowCols);
			
			setBtnMode();
			setBtnRsltUnschdMode();
			setBtnRsltYieldByProdUnschdMode();
		}
	}

	/**
	 * Panel[Btn]のボタン[unschd_ins]の押下時の処理
	 */
	@Override
	public void doBtn_unschd_ins(MCEventInfo info) {
		callMS_MSBCL1130_Ins01();
	}
	/**
	 * Panel[RsltBtn]のボタン[radd_unschd]の押下時の処理
	 */
	@Override
	public void doRsltBtn_radd_unschd(MCEventInfo info) {
		MCNumber newPegNo = createNewPegNo();
		RsltR r = insertRow(RsltTable);
		r.peg_no(newPegNo);
		
		setBtnRsltUnschdMode();
		setBtnRsltYieldByProdUnschdMode();
	}
	
	/**
	 * Panel[RsltBtn]のボタン[rdel_unschd]の押下時の処理
	 */
	@Override
	public void doRsltBtn_rdel_unschd(MCEventInfo info) {
		RsltR r = deleteRow(RsltTable);
		if (r == null) {
			return;
		}
		
		// 下部一覧のキャッシュの更新
		if (_yieldByProdMap.containsKey(r.peg_no())) {
			_yieldByProdMap.remove(r.peg_no());
			if (getRsltL().isEmpty()) {
				// 表示も消す
				getRsltYieldByProdL().clear();
			}
		}
		
		setBtnRsltUnschdMode();
		setBtnRsltYieldByProdUnschdMode();
	}
	/**
	 * Panel[RsltBtn]のボタン[rcopy_unschd]の押下時の処理
	 */
	@Override
	public void doRsltBtn_rcopy_unschd(MCEventInfo info) {
		MCNumber newPegNo = createNewPegNo();
		RsltR r = copyRow(RsltTable);
		if (r == null) {
			return;
		}
		
		r.mfg_act_no(null);
		if (MAC_LOT_NO_TYP.isAUTO(r.unschd_lot_no_typ())) {
			r.unschd_lot_no(null);
		}
		if (MAC_LOT_NO_TYP.isAUTO(r.unschd_sublot_no_typ())) {
			r.unschd_sublot_no(null);
		}
		
		r.copied_row_flg(true);
		
		// 下部一覧のキャッシュの更新
		MCNumber oldPegNo = r.peg_no();
		MCList<RsltYieldByProdR> newYL = _yieldByProdMap.get(oldPegNo);
		if (!isNull(newYL)) {
			newYL = newYL.clone();
			for (RsltYieldByProdR newYR : newYL) {
				newYR.yield_act_no(null);
				newYR.hdr_peg_no(newPegNo);
				
				r.mfg_act_no(null);
				if (MAC_LOT_NO_TYP.isAUTO(r.unschd_lot_no_typ())) {
					newYR.unschd_lot_no(null);
				}
				if (MAC_LOT_NO_TYP.isAUTO(r.unschd_sublot_no_typ())) {
					newYR.unschd_sublot_no(null);
				}
				
				newYR.setStatus(Status.CREATE);
			}
			_yieldByProdMap.put(newPegNo, newYL);
			getRsltYieldByProdL().setAll(newYL);
		}
		
		r.peg_no(newPegNo);
		
		setBtnMode();
		setBtnRsltUnschdMode();
		setBtnRsltYieldByProdUnschdMode();
	}
	
	/**
	 * 上表内で、存在しない紐づけNOの中で一番小さい値を返す
	 * 例:0,1,2,5,6　→　return 3
	 * 0,1,2,3 → return 4
	 * @return
	 */
	protected MCNumber createNewPegNo() {
		MCList<RsltR> rsltL = getRsltL().clone();
		int count = 0;
		rsltL.sort(RsltR.$peg_no);
		for(RsltR r : rsltL) {
			// カウンタと一致しない値（NULL）が穴空き番号
			if(isNull(r.peg_no()) || !r.peg_no().eq(count)) {
				break;
			}
			count++;
		}
		return new MCNumber(count);
	}
	
	/**
	 * Panel[RsltYieldByProdBtn]のボタン[radd_unschd]の押下時の処理
	 */
	@Override
	public void doRsltYieldByProdBtn_radd_unschd(MCEventInfo info) {
		RsltYieldByProdR yieldR = insertRow(RsltYieldByProdTable);
		if (yieldR == null) {
			return;
		}
		RsltR rsltR = RsltTable.getSelectedMCRow();
		
		yieldR.unschd_itm_cd(rsltR.unschd_itm_cd());
		yieldR.unschd_itm_sub1(rsltR.unschd_itm_sub1());
		yieldR.unschd_itm_sub2(rsltR.unschd_itm_sub2());
		yieldR.unschd_itm_sub3(rsltR.unschd_itm_sub3());
		yieldR.unschd_itm_nm(rsltR.unschd_itm_nm());
		yieldR.unschd_lot_mng_typ(rsltR.unschd_lot_mng_typ());
		yieldR.unschd_lot_no_typ(rsltR.unschd_lot_no_typ());
		yieldR.unschd_lot_no_ptn_cd(rsltR.unschd_lot_no_ptn_cd());
		yieldR.unschd_sublot_mng_typ(rsltR.unschd_sublot_mng_typ());
		yieldR.unschd_sublot_no_typ(rsltR.unschd_sublot_no_typ());
		yieldR.unschd_sublot_no_ptn_cd(rsltR.unschd_sublot_no_ptn_cd());
		yieldR.unschd_base_unit_cd(rsltR.unschd_base_unit_cd());
		yieldR.unschd_base_unit_nm(rsltR.unschd_base_unit_nm());
		yieldR.unschd_base_unit_dec_place(rsltR.unschd_base_unit_dec_place());
		yieldR.unschd_base_unit_conv_rnd_typ(rsltR.unschd_base_unit_conv_rnd_typ());
		yieldR.unschd_ac_dt(rsltR.end_ac_dt());
		yieldR.unschd_act_dt(rsltR.end_act_dt());
		yieldR.unschd_act_hm(rsltR.end_act_hm());
		yieldR.hdr_peg_no(rsltR.peg_no());
		yieldR.disp_seq(createNewDispSeq(rsltR.peg_no()));
		yieldR.setStatus(Status.CREATE);
		
		// Mapに追加
		_yieldByProdMap.put(rsltR.peg_no(), getRsltYieldByProdL().subList(RsltYieldByProdR.$hdr_peg_no, rsltR.peg_no()));
		
		setBtnRsltYieldByProdUnschdMode();
		
		rsltRInfoChange();
	}
	
	/**
	 * Panel[RsltYieldByProdBtn]のボタン[rdel_unschd]の押下時の処理
	 */
	@Override
	public void doRsltYieldByProdBtn_rdel_unschd(MCEventInfo info) {
		RsltYieldByProdR r = deleteRow(RsltYieldByProdTable);
		if (r == null) {
			return;
		}
		
		// 下部一覧のキャッシュの更新
		_yieldByProdMap.get(r.hdr_peg_no()).remove(r);
		
		setBtnRsltYieldByProdUnschdMode();
		
		if (!isYieldMultiRow(r.hdr_peg_no())) {
			// 下表が1行になった場合は、下表から上表に特定値設定
			RsltR rsltR = RsltTable.getSelectedMCRow();
			RsltYieldByProdR yR = RsltYieldByProdTable.getSelectedMCRow();
			rsltR.unschd_lot_no(yR.unschd_lot_no());
			rsltR.unschd_sublot_no(yR.unschd_sublot_no());
			
			// 単位項目に手動設定で必要な項目
			rsltR.unschd_trd_unit_cd(yR.unschd_trd_unit_cd());
			rsltR.unschd_trd_unit_nm(yR.unschd_trd_unit_nm());
			rsltR.unschd_trd_unit_dec_place(yR.unschd_trd_unit_dec_place());
			rsltR.unschd_trd_unit_rnd_typ(yR.unschd_trd_unit_conv_rnd_typ());
			rsltR.unschd_conv_base_qty(yR.unschd_conv_base_qty());
			rsltR.unschd_conv_qty(yR.unschd_conv_qty());
			
			rsltR.unschd_trd_unit_yield_act_qty(yR.unschd_trd_unit_yield_act_qty());
			rsltR.unschd_base_unit_yield_act_qty(yR.unschd_base_unit_yield_act_qty());
		}
		else {
			rsltRInfoChange();
		}
	}
	
	/**
	 * Panel[RsltYieldByProdBtn]のボタン[rcopy_unschd]の押下時の処理
	 */
	@Override
	public void doRsltYieldByProdBtn_rcopy_unschd(MCEventInfo info) {
		RsltYieldByProdR r = copyRow(RsltYieldByProdTable);
		if (r == null) {
			return;
		}
		
		r.yield_act_no(null);
		setOrgYieldUscnhdLotNo(r);
		r.copied_row_flg(true);
		r.disp_seq(createNewDispSeq(r.hdr_peg_no()));
		
		// 下部一覧のキャッシュの更新
		_yieldByProdMap.get(r.hdr_peg_no()).add(r);
		
		setBtnRsltYieldByProdUnschdMode();
		
		rsltRInfoChange();
	}
	
	/**
	 * 下表の表示順用のインデックスの最大値を返す
	 * 下表がNULLの場合は0
	 * @param pegNO
	 * @return
	 */
	protected MCNumber createNewDispSeq(MCNumber pegNO) {
		if (!isNull(getRsltYieldByProdL())) {
			MCNumber maxDispSeq = (MCNumber) getRsltYieldByProdL().max(RsltYieldByProdR.$disp_seq);
			if (!isNull(maxDispSeq)) {
				return maxDispSeq.add(1);
			}
		}
		return new MCNumber(0);
	}
	
	/**
	 * 下表の行数変更時、2行以上の際の上表の設定
	 */
	protected void rsltRInfoChange() {
		RsltR rsltR = RsltTable.getSelectedMCRow();
		if(isYieldMultiRow(rsltR.peg_no())) {
			setValueEx(columnRslt_unschd_trd_unit_cd, rsltR.getGUIIndex(), rsltR.unschd_base_unit_cd());
			setValueEx(columnRslt_unschd_trd_unit_yield_act_qty, rsltR.getGUIIndex(), _yieldByProdMap.get(rsltR.peg_no()).sum(RsltYieldByProdR.$unschd_base_unit_yield_act_qty));
			setValueEx(columnRslt_unschd_lot_no, rsltR.getGUIIndex(), null);
			setValueEx(columnRslt_unschd_sublot_no, rsltR.getGUIIndex(), null);
		}
	}
	
	protected void clearCache() {
		_sameMfgActMap.clear();
	}
	
	protected List<Comparable<?>> getMfgActMapKey(String mfgInstNo, MCNumber divSeq) {
		List<Comparable<?>> ret = new ArrayList<Comparable<?>>();
		ret.add(mfgInstNo);
		ret.add(divSeq);
		return ret;
	}
	
	/**
	 * Panel[RsltYieldByProdBtn]のボタン[sprt_lot_no]の押下時の処理
	 */
	@Override
	public void doRsltYieldByProdBtn_sprt_lot_no(MCEventInfo info) {
		if (Cnd_ope_INS.isSelected()) {
			callMS_MSBCL1130_Sprt02();
		}
		else {
			callMS_MSBCL1130_Sprt01();
		}
	}
	
	/**
	 * [MS_MSBCL1130_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1130_Sprt01Caller<P extends MSBCP_MfgActListReg, B extends MS_MSBCL1130_Sprt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBCL1130_Sprt01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected MCMessage msgExecConfirm() {
			return new MCMessage(MSBCP1008);
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			// 何もしない
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			if (!getRsltYieldByProdBtnR().lot_issue_flg() && !getRsltYieldByProdBtnR().sublot_issue_flg()) {
				msgList.add(new MCMessage(MSBCP1006));
			}
		}
		
		
		@Override
		protected MCList getCheckedRows(IfListRegPanel p) {
			MCList<RsltR> l = MCList.create(RsltR.class);
			l.add(RsltTable.getSelectedMCRow());
			return l;
		}
		
		protected MCList<RsltR> _RsltLForCall = MCList.create(RsltR.class);
		protected MCList<RsltYieldByProdR> _RsltLYieldByProdForCall = MCList.create(RsltYieldByProdR.class);
		
		@Override
		protected void initCaller() {
			super.initCaller();
			
			RsltR selR = RsltTable.getSelectedMCRow();
			_RsltLForCall = MCList.create(RsltR.class);
			_RsltLForCall.add(selR);
			
			_RsltLYieldByProdForCall = _yieldByProdMap.get(selR.peg_no());
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			if (!_RsltLForCall.isEmpty()) {
				RsltR r = _RsltLForCall.get(0);
				bridge.up0().mfg_inst_no(r.mfg_inst_no());
				bridge.up0().mfg_act_no(r.mfg_act_no());
				bridge.up0().itm_mfg_inst_no(r.mfg_inst_no());
			}
			bridge.up1().setAll(_RsltLForCall);
			bridge.up2().setAll(_RsltLYieldByProdForCall);
		}
	}

	/**
	 * [MS_MSBCL1130_Sprt02]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1130_Sprt02Caller<P extends MSBCP_MfgActListReg, B extends MS_MSBCL1130_Sprt02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBCL1130_Sprt02Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected MCMessage msgExecConfirm() {
			return new MCMessage(MSBCP1008);
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			// 何もしない
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			if (!getRsltYieldByProdBtnR().lot_issue_flg() && !getRsltYieldByProdBtnR().sublot_issue_flg()) {
				msgList.add(new MCMessage(MSBCP1006));
			}
		}
		
		@Override
		protected MCList getCheckedRows(IfListRegPanel p) {
			MCList<RsltR> l = MCList.create(RsltR.class);
			l.add(RsltTable.getSelectedMCRow());
			return l;
		}
		
		protected MCList<RsltR> _RsltLForCall = MCList.create(RsltR.class);
		protected MCList<RsltYieldByProdR> _RsltLYieldByProdForCall = MCList.create(RsltYieldByProdR.class);
		
		@Override
		protected void initCaller() {
			super.initCaller();
			
			RsltR selR = RsltTable.getSelectedMCRow();
			_RsltLForCall = MCList.create(RsltR.class);
			_RsltLForCall.add(selR);
			
			_RsltLYieldByProdForCall = _yieldByProdMap.get(selR.peg_no());
		}
		
		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			if (!_RsltLForCall.isEmpty()) {
				RsltR r = _RsltLForCall.get(0);
				bridge.up0().mfg_act_no(r.mfg_act_no());
			}
			bridge.up1().setAll(_RsltLForCall);
			bridge.up2().setAll(_RsltLYieldByProdForCall);
		}
		
		@Override
		protected void show() {
			super.show();
			RsltR rsltR = RsltTable.getSelectedMCRow();
			if(!isYieldMultiRow(rsltR.peg_no())) {
				RsltYieldByProdR yieldR = getRsltYieldByProdL().get(0);
				setValueEx(columnRslt_unschd_lot_no, rsltR.getGUIIndex(), yieldR.unschd_lot_no());
				setValueEx(columnRslt_unschd_sublot_no, rsltR.getGUIIndex(), yieldR.unschd_sublot_no());
			}
		}
	}

	@Override
	public String getResultViewParamID(MCResultInfo info) {
		return null;
	}
	
	@Override
	public boolean notificationSetResultViewParam(MCCallerPanelBridge bridge, MCBinary... files) {
		if (bridge instanceof MS_MSBCL1130_Upd01Bridge) {
			if (files != null && 4 <= files.length) {
				MS_MSBCL1130_Upd01Bridge upd01Bridge = (MS_MSBCL1130_Upd01Bridge) bridge;

				MCMessageList errMsgL = new MCMessageList();

				// 検索条件
				MCCsvBinaryReader<CndR> cndReader = 
						MCCsvBinaryReader.createCsvBinaryReader(MCList.create(CndR.class), files[0]);
				errMsgL.addAll(cndReader.read());

				// 一括設定
				MCCsvBinaryReader<ActBulkSetR> actBulkSetReader = 
						MCCsvBinaryReader.createCsvBinaryReader(MCList.create(ActBulkSetR.class), files[1]);
				errMsgL.addAll(actBulkSetReader.read());

				// ヘッダ
				MCCsvBinaryReader<RsltR> rsltReader = 
						MCCsvBinaryReader.createCsvBinaryReader(MCList.create(RsltR.class), files[2]);
				errMsgL.addAll(rsltReader.read());

				// 明細
				MCCsvBinaryReader<RsltYieldByProdR> rsltYieldByProdReader = 
						MCCsvBinaryReader.createCsvBinaryReader(MCList.create(RsltYieldByProdR.class), files[3]);
				errMsgL.addAll(rsltYieldByProdReader.read());

				// 読込正否判定
				if (errMsgL.isEmpty()) {
					openByAsyncRslt(upd01Bridge, 
									cndReader.getDestFirstRow(), 
									actBulkSetReader.getDestFirstRow(), 
									rsltReader.getDestList(), 
									rsltYieldByProdReader.getDestList());
				}
				else {
					message(errMsgL);
				}
			}
		}
		if (bridge instanceof MS_MSBCL1130_Imp01Bridge || bridge instanceof MS_MSBCL1130_Ins01Bridge) {
			if (files != null && 3 <= files.length) {
				MCMessageList errMsgL = new MCMessageList();

				// 検索条件
				MCCsvBinaryReader<CndR> cndReader = 
						MCCsvBinaryReader.createCsvBinaryReader(MCList.create(CndR.class), files[0]);
				errMsgL.addAll(cndReader.read());

				// 一括設定
				MCCsvBinaryReader<UnschdBulkSetR> unschdBulkSetReader = 
						MCCsvBinaryReader.createCsvBinaryReader(MCList.create(UnschdBulkSetR.class), files[1]);
				errMsgL.addAll(unschdBulkSetReader.read());

				// ヘッダ
				MCCsvBinaryReader<RsltR> rsltReader = 
						MCCsvBinaryReader.createCsvBinaryReader(MCList.create(RsltR.class), files[2]);
				errMsgL.addAll(rsltReader.read());

				// 明細
				MCCsvBinaryReader<RsltYieldByProdR> rsltYieldByProdReader = 
						MCCsvBinaryReader.createCsvBinaryReader(MCList.create(RsltYieldByProdR.class), files[3]);
				errMsgL.addAll(rsltYieldByProdReader.read());

				// 読込正否判定
				if (errMsgL.isEmpty()) {
					if (bridge instanceof MS_MSBCL1130_Imp01Bridge) {
						openByAsyncRslt((MS_MSBCL1130_Imp01Bridge) bridge,
										cndReader.getDestFirstRow(), 
										unschdBulkSetReader.getDestFirstRow(), 
										rsltReader.getDestList(), 
										rsltYieldByProdReader.getDestList());
					}
					else if (bridge instanceof MS_MSBCL1130_Ins01Bridge) {
						openByAsyncRslt((MS_MSBCL1130_Ins01Bridge) bridge,
										cndReader.getDestFirstRow(), 
										unschdBulkSetReader.getDestFirstRow(), 
										rsltReader.getDestList(), 
										rsltYieldByProdReader.getDestList());
					}
				}
				else {
					message(errMsgL);
				}
			}
		}
		return false;
	}

	protected void openByAsyncRslt(MS_MSBCL1130_Upd01Bridge bridge, CndR cndR, 
			ActBulkSetR actBulkSetR, MCList<RsltR> rsltFileL, MCList<RsltYieldByProdR> rsltYieldFileL) {
		openPanel(getModuleID(), getScreenID(), T1, null, bridge, cndR, actBulkSetR, rsltFileL, rsltYieldFileL);
	}

	/***
	 * 画面起動（ファイル入力オペレーション非同期実行用）
	 * 
	 * @param bridge ファイル入力オペレーションBridge
	 * @param cndR 検索枠コンテナ
	 * @param bulkSetR 一括設定枠コンテナ
	 * @param dtlFileL 一覧枠コンテナリスト
	 */
	protected void openByAsyncRslt(MS_MSBCL1130_Imp01Bridge bridge, CndR cndR, 
			UnschdBulkSetR unschdBulkSetR, MCList<RsltR> rsltFileL, MCList<RsltYieldByProdR> rsltYieldFileL) {
		openPanel(getModuleID(), getScreenID(), T2, null, bridge, cndR, unschdBulkSetR, rsltFileL, rsltYieldFileL);
	}

	/***
	 * 画面起動（登録オペレーション非同期実行用）
	 * 
	 * @param bridge ファイル入力オペレーションBridge
	 * @param cndR 検索枠コンテナ
	 * @param bulkSetR 一括設定枠コンテナ
	 * @param dtlFileL 一覧枠コンテナリスト
	 */
	protected void openByAsyncRslt(MS_MSBCL1130_Ins01Bridge bridge, CndR cndR, 
			UnschdBulkSetR unschdBulkSetR, MCList<RsltR> rsltFileL, MCList<RsltYieldByProdR> rsltYieldFileL) {
		openPanel(getModuleID(), getScreenID(), T3, null, bridge, cndR, unschdBulkSetR, rsltFileL, rsltYieldFileL);
	}

	/*** ステータスクリア処理をスキップするか */
	protected boolean _isSkipStatusClear = false;

	@Override
	protected void initByScreenParam(String openTyp, MCRow bind, Object... args) {
		super.initByScreenParam(openTyp, bind, args);

		if (T1 == openTyp) {
			screenClear();
			
			MS_MSBCL1130_Upd01Bridge b = (MS_MSBCL1130_Upd01Bridge) args[0];
			restoreContainerBfrUpd(b, args);

			if(getParamEx(b) == null) {
				MS_MSBCL1130_Upd01Caller<MSBCP_MfgActListReg, MS_MSBCL1130_Upd01Bridge> caller = createMS_MSBCL1130_Upd01();
				restoreCallerBfrUpd(caller, b);
				_isSkipStatusClear = true;
			}
			else {
				setStatusForAsyncEx();
			}
		}
		else if (T2 == openTyp) {
			screenClear();
			BulkSetTab.setSelectedComponent(UnschdBulkSetPanel);
			
			MS_MSBCL1130_Imp01Bridge b = (MS_MSBCL1130_Imp01Bridge) args[0];
			restoreContainerBfrImp(b, args);

			if(getParamEx(b) == null) {
				MS_MSBCL1130_Imp01Caller<MSBCP_MfgActListReg, MS_MSBCL1130_Imp01Bridge> caller = createMS_MSBCL1130_Imp01();
				restoreCallerBfrImp(caller, b);
				_isSkipStatusClear = true;
			}
			else {
				setStatusForAsyncEx();
			}
		}
		else if (T3 == openTyp) {
			screenClear();
			BulkSetTab.setSelectedComponent(UnschdBulkSetPanel);
			
			MS_MSBCL1130_Ins01Bridge b = (MS_MSBCL1130_Ins01Bridge) args[0];
			restoreContainerBfrIns(b, args);
			
			if(getParamEx(b) == null) {
				MS_MSBCL1130_Ins01Caller<MSBCP_MfgActListReg, MS_MSBCL1130_Ins01Bridge> caller = createMS_MSBCL1130_Ins01();
				restoreCallerBfrIns(caller, b);
				_isSkipStatusClear = true;
			}
			else {
				setStatusForAsyncEx();
			}
		}
		if (T2 == openTyp || T3 == openTyp) {
			Ctrl_ctrl_PPanel.setDISABLEStatus();
			Ctrl_ctrl_PPanel.expand(false);
			setTabComponentEnable(FoldTab);
			setTabComponentEnable(BulkSetTab, UnschdBulkSetPanel);
			RsltYieldByProdTable.setStatusColumnVisible(false);
			FoldTab.setEnabled(false);
		}
	}

	@Override
	protected void afterOpenByInitParam(String openTyp, MCRow bind, Object... args) {
		super.afterOpenByInitParam(openTyp, bind, args);

		if (T1 == openTyp) {
			MS_MSBCL1130_Upd01Bridge b = (MS_MSBCL1130_Upd01Bridge) args[0];
			MCException ex = getParamEx(b);

			if (ex != null) {
				dialog(ex);
			}
			else if (_asyncResultMsg != null) {
				dialog(_asyncResultMsg);
				_asyncResultMsg = null;
			}
		}
		else if (T2 == openTyp) {
			MS_MSBCL1130_Imp01Bridge b = (MS_MSBCL1130_Imp01Bridge) args[0];
			MCException ex = getParamEx(b);

			if (ex != null) {
				dialog(ex);
			}
			else if (_asyncResultMsg != null) {
				dialog(_asyncResultMsg);
				_asyncResultMsg = null;
			}
		}
		else if (T3 == openTyp) {
			MS_MSBCL1130_Ins01Bridge b = (MS_MSBCL1130_Ins01Bridge) args[0];
			MCException ex = getParamEx(b);

			if (ex != null) {
				dialog(ex);
			}
			else if (_asyncResultMsg != null) {
				dialog(_asyncResultMsg);
				_asyncResultMsg = null;
			}
		}
	}

	@Override
	public void statusClear() {
		// 非同期実行の結果確認時に下り電文から復元した行ステータスがクリアされないようにするために必要な処理。
		if (!_isSkipStatusClear) {
			super.statusClear();
		}

		// 実行後は、スキップ要否を元に戻しておく
		_isSkipStatusClear = false;
	}

	protected void restoreContainerBfrUpd(MS_MSBCL1130_Upd01Bridge b, Object... args) {
		// 検索条件
		CndR srcCndR = (CndR) args[1];
		CndR.copyvalue(getCndR(), srcCndR);

		// 一括設定
		ActBulkSetR srcActBulkSetR = (ActBulkSetR) args[2];
		ActBulkSetR.copyvalue(getActBulkSetR(), srcActBulkSetR);

		// ヘッダ
		MCList<RsltR> rsltL = (MCList<RsltR>) args[3];
		getRsltL().setAll(rsltL);
		MCList<RsltR> up0L = setRowIndexForUp0(rsltL, b.down0());
		createSameMfgActMap(rsltL);

		// 明細
		MCList<RsltYieldByProdR> rsltYieldFileL = (MCList<RsltYieldByProdR>) args[4];
		// GUIIndexを復元
		rsltYieldFileL.forEach(r -> {
			if (!isNull(r.gui_index())) {
				r.setGUIIndex(r.gui_index().intValue());
			}
		});
		setHiddenList(rsltL, rsltYieldFileL);
		setRowIndexForUp1(rsltYieldFileL, up0L, b.down1());
	}

	/***
	 * コンテナ値設定（ファイル入力オペレーション非同期実行用）
	 * 
	 * @param downL 下り電文リスト
	 * @param args 画面起動引数
	 */
	protected void restoreContainerBfrImp(MS_MSBCL1130_Imp01Bridge b, Object... args) {
		// 検索条件
		CndR srcCndR = (CndR) args[1];
		CndR.copyvalue(getCndR(), srcCndR);

		// 一括設定
		UnschdBulkSetR srcUnschdBulkSetR = (UnschdBulkSetR) args[2];
		UnschdBulkSetR.copyvalue(getUnschdBulkSetR(), srcUnschdBulkSetR);

		// ヘッダ
		MCList<RsltR> rsltL = (MCList<RsltR>) args[3];
		getRsltL().setAll(rsltL);
		MCList<RsltR> up0L = setRowIndexForImpIns(rsltL, 0);

		// 明細
		MCList<RsltYieldByProdR> rsltYieldFileL = (MCList<RsltYieldByProdR>) args[4];
		// GUIIndexを復元
		rsltYieldFileL.forEach(r -> {
			if (!isNull(r.gui_index())) {
				r.setGUIIndex(r.gui_index().intValue());
			}
		});
		setHiddenList(rsltL, rsltYieldFileL);
		setRowIndexForUp1(rsltYieldFileL, up0L, b.down1());
	}

	/***
	 * コンテナ値設定（登録オペレーション非同期実行用）
	 * 
	 * @param downL 下り電文リスト
	 * @param args 画面起動引数
	 */
	protected void restoreContainerBfrIns(MS_MSBCL1130_Ins01Bridge b, Object... args) {
		// 検索条件
		CndR srcCndR = (CndR) args[1];
		CndR.copyvalue(getCndR(), srcCndR);
		
		// 一括設定
		UnschdBulkSetR srcUnschdBulkSetR = (UnschdBulkSetR) args[2];
		UnschdBulkSetR.copyvalue(getUnschdBulkSetR(), srcUnschdBulkSetR);
		
		// ヘッダ
		MCList<RsltR> rsltL = (MCList<RsltR>) args[3];
		rsltL.forEach(r -> {
			if (isNull(r.rtn_sts_typ()) || MAC_RTN_STS_TYP.isERR(r.rtn_sts_typ())) {
				r.setStatus(Status.GUICREATE);
			}
		});
		getRsltL().setAll(rsltL);
		MCList<RsltR> up0L = setRowIndexForImpIns(rsltL, 1);
		
		// 明細
		MCList<RsltYieldByProdR> rsltYieldFileL = (MCList<RsltYieldByProdR>) args[4];
		// GUIIndexを復元
		rsltYieldFileL.forEach(r -> {
			if (!isNull(r.gui_index())) {
				r.setGUIIndex(r.gui_index().intValue());
			}
		});
		setHiddenList(rsltL, rsltYieldFileL);
		setRowIndexForUp1(rsltYieldFileL, up0L, b.down1());
	}

	/*** 非同期実行終了メッセージ */
	protected MCMessage _asyncResultMsg = null;

	protected void restoreCallerBfrUpd(
			MS_MSBCL1130_Upd01Caller<MSBCP_MfgActListReg, MS_MSBCL1130_Upd01Bridge> caller,
			MS_MSBCL1130_Upd01Bridge b) {
		List<MCContainer> downBlocks = new ArrayList<MCContainer>();
		downBlocks.add(b.down0());
		downBlocks.add(b.down1());
		
		MCList<RsltYieldByProdR> rsltYieldByProdL = MCList.create(RsltYieldByProdR.class);
		_yieldByProdMap.values().forEach(list -> rsltYieldByProdL.addAll(list));
		caller.setField(getRsltL(), rsltYieldByProdL);
		_asyncResultMsg = caller.dispAsyncRslt(downBlocks, b.getParamMessage());
	}

	protected void restoreCallerBfrImp(
			MS_MSBCL1130_Imp01Caller<MSBCP_MfgActListReg, MS_MSBCL1130_Imp01Bridge> caller,
			MS_MSBCL1130_Imp01Bridge b) {
		List<MCContainer> downBlocks = new ArrayList<MCContainer>();
		downBlocks.add(b.down0());
		downBlocks.add(b.down1());
		
		_asyncResultMsg = caller.dispAsyncRslt(downBlocks, b.getParamMessage());
	}

	protected void restoreCallerBfrIns(
			MS_MSBCL1130_Ins01Caller<MSBCP_MfgActListReg, MS_MSBCL1130_Ins01Bridge> caller,
			MS_MSBCL1130_Ins01Bridge b) {
		List<MCContainer> downBlocks = new ArrayList<MCContainer>();
		downBlocks.add(b.down0());
		downBlocks.add(b.down1());
		
		MCList<RsltYieldByProdR> rsltYieldByProdL = MCList.create(RsltYieldByProdR.class);
		_yieldByProdMap.values().forEach(list -> rsltYieldByProdL.addAll(list));
		caller.setField(getRsltL(), rsltYieldByProdL);
		_asyncResultMsg = caller.dispAsyncRslt(downBlocks, b.getParamMessage());
	}

	/***
	 * GUIIndex設定
	 * 
	 * @param targetL 設定対象リスト
	 */
	protected void setGuiIndex(MCList<?> targetL) {
		for (int i=0; i < targetL.size(); i++) {
			targetL.get(i).setGUIIndex(i);
		}
	}

	/***
	 * 上り電文0用INDEX設定
	 * 
	 * @param srcL CSVファイル取込データ
	 * @param down0L オペレーションからの下り電文
	 * @return 上り電文0リスト
	 */
	protected MCList<RsltR> setRowIndexForUp0(MCList<RsltR> srcL, MCList<RsltR> down0L) {
		MCList<RsltR> tgtL = srcL.subList(RsltR.$check, true);

		// paramIndexとparamRowIndexを設定
		tgtL.setParamIndex(1);
		for (int i = 0; i < tgtL.size(); i++) {
			RsltR r = tgtL.get(i);
			r.setParamIndex(1);
			r.setParamRowIndex(i);
		}

		return tgtL;
	}
	

	/**
	 * ファイル入力・計画外実績登録用INDEX設定（非同期）
	 * @param srcL
	 * @param paramIndex
	 * @return
	 */
	protected MCList<RsltR> setRowIndexForImpIns(MCList<RsltR> srcL, int paramIndex) {
		MCList<RsltR> tgtL = srcL.subList(RsltR.$check, true);

		// paramIndexとparamRowIndexを設定
		tgtL.setParamIndex(paramIndex);
		for (int i = 0; i < tgtL.size(); i++) {
			RsltR r = tgtL.get(i);
			r.setParamIndex(paramIndex);
			r.setParamRowIndex(i);
		}

		return tgtL;
	}

	/***
	 * 上り電文1用INDEX設定
	 * 
	 * @param srcL CSVファイル取込データ
	 * @param hdrL ヘッダリスト
	 * @param down1L オペレーションからの下り電文
	 * @return 上り電文1リスト
	 */
	protected MCList<RsltYieldByProdR> setRowIndexForUp1(MCList<RsltYieldByProdR> srcL, MCList<RsltR> hdrL,  MCList<RsltYieldByProdR> down1L) {
		MCList<RsltYieldByProdR> tgtL = MCList.create(RsltYieldByProdR.class);

		for (RsltR hdrR : hdrL) {
			MCList<RsltYieldByProdR> tmpL = _yieldByProdMap.get(hdrR.peg_no());
			if (!isNull(tmpL)) {
				tgtL.addAll(tmpL.subList(RsltYieldByProdR.$upd_tgt_flg, true));
			}
		}

		// paramIndexとparamRowIndexを設定
		tgtL.setParamIndex(2);
		for (int i = 0; i < tgtL.size(); i++) {
			RsltYieldByProdR r = tgtL.get(i);
			r.setParamIndex(2);
			r.setParamRowIndex(i);
		}

		return tgtL;
	}

	/***
	 * 同一製造指図ＮＯ、分割連番の上部一覧のキャッシュ生成
	 * 
	 * @param hdrL ヘッダリスト
	 */
	protected void createSameMfgActMap(MCList<RsltR> hdrL) {
		for (MCList<RsltR> gL : hdrL.groupList(RsltR.$mfg_inst_no, RsltR.$div_seq)) {
			RsltR gR = gL.get(0);
			List<Comparable<?>> key = getMfgActMapKey(gR.mfg_inst_no(), gR.div_seq());
			_sameMfgActMap.put(key, gL);
		}
	}

	/***
	 * Bridgeから例外取得
	 * 
	 * @param b Bridge
	 * @return 発生例外
	 */
	protected MCException getParamEx(MS_MSBCL1130_Upd01Bridge b) {
		MCException result = null;

		if (!b.param().getExceptionParam().isEmpty()) {
			result = b.param().getExceptionParam().getException();
	    }

	    return result;
	}

	/***
	 * Bridgeから例外取得
	 * 
	 * @param b Bridge
	 * @return 発生例外
	 */
	protected MCException getParamEx(MS_MSBCL1130_Imp01Bridge b) {
		MCException result = null;

		if (!b.param().getExceptionParam().isEmpty()) {
			result = b.param().getExceptionParam().getException();
	    }

	    return result;
	}

	/***
	 * Bridgeから例外取得
	 * 
	 * @param b Bridge
	 * @return 発生例外
	 */
	protected MCException getParamEx(MS_MSBCL1130_Ins01Bridge b) {
		MCException result = null;

		if (!b.param().getExceptionParam().isEmpty()) {
			result = b.param().getExceptionParam().getException();
		}

		return result;
	}

	/***
	 * Bridgeからメッセ―ジ取得
	 * 
	 * @param b Bridge
	 * @return メッセージリスト
	 */
	protected MCMessageList getParamMsg(MS_MSBCL1130_Upd01Bridge b) {
		MCMessageList result = null;

		if (!b.param().getMessageParam().isEmpty()) {
			result = b.param().getMessageParam().getMessage();
		}

		return result;
	}

	/***
	 * Bridgeからメッセ―ジ取得
	 * 
	 * @param b Bridge
	 * @return メッセージリスト
	 */
	protected MCMessageList getParamMsg(MS_MSBCL1130_Imp01Bridge b) {
		MCMessageList result = null;

		if (!b.param().getMessageParam().isEmpty()) {
			result = b.param().getMessageParam().getMessage();
		}

		return result;
	}

	/***
	 * Bridgeからメッセ―ジ取得
	 * 
	 * @param b Bridge
	 * @return メッセージリスト
	 */
	protected MCMessageList getParamMsg(MS_MSBCL1130_Ins01Bridge b) {
		MCMessageList result = null;

		if (!b.param().getMessageParam().isEmpty()) {
			result = b.param().getMessageParam().getMessage();
		}

		return result;
	}

	/***
	 * 非同期実行例外発生時のステータス設定
	 * 
	 */
	protected void setStatusForAsyncEx() {
		setFIXStatus();
		Ctrl_ctrl_PPanel.expand(false);
	}
	/**
	 * [MS_MSBCL1130_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1130_Upd01Caller<P extends MSBCP_MfgActListReg, B extends MS_MSBCL1130_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBCL1130_Upd01Caller(P p, B b) {
			super(p, b);
		}

		protected MCList<RsltR> _RsltLForCall = MCList.create(RsltR.class);
		protected MCList<RsltYieldByProdR> _RsltYieldByprodLForCall = MCList.create(RsltYieldByProdR.class);
		protected Map<MCNumber, RsltR> _rsltMap = new HashMap<MCNumber, RsltR>();
		
		@Override
		protected void initCaller() {
			super.initCaller();
			
			_RsltLForCall = getRsltL().subList(RsltR.$check, true);
			_RsltYieldByprodLForCall = MCList.create(RsltYieldByProdR.class);
			
			for (RsltR r : _RsltLForCall) {
				MCList<RsltYieldByProdR> list = _yieldByProdMap.get(r.peg_no());
				if (!isNull(list)) {
					_RsltYieldByprodLForCall.addAll(list.subList(row -> !row.isStatusNone()));
				}
				_rsltMap.put(r.peg_no(), r);
			}
			if (getActBulkSetR().act_immed_prnt_flg()) {
				setPrint(true);
			}
			if (getActBulkSetR().async_flg()) {
				setAsync(true);
				setCsvOutForAsync(true);

				// 非同期実行用に、退避項目を初期化
				_yieldByProdMap.values().forEach(l -> {
					l.forEach(r -> {
						r.upd_tgt_flg(false);
						r.gui_index(r.getGUIIndex());
					});
				});

				// 非同期実行用に、対象有無を設定
				_RsltYieldByprodLForCall.setBooleanNE(RsltYieldByProdR.$upd_tgt_flg, true);
			}
		}

		@Override
		protected boolean csvOutForAsync() {
			super.csvOutForAsync();
			
			List<MCList<?>> containers = new ArrayList<MCList<?>>();

			// 検索条件
			MCList<CndR> cndL = MCList.create(CndR.class);
			cndL.add(getCndR());
			containers.add(cndL);

			// 一括設定
			MCList<ActBulkSetR> actBulkSetL = MCList.create(ActBulkSetR.class);
			actBulkSetL.add(getActBulkSetR());
			containers.add(actBulkSetL);

			// ヘッダ
			containers.add(getRsltL());

			// 明細
			MCList<RsltYieldByProdR> yieldByProdL = MCList.create(RsltYieldByProdR.class);
			_yieldByProdMap.values().forEach(l -> yieldByProdL.addAll(l));
			containers.add(yieldByProdL);
			
			return csvOutFromContainer(containers);
		}

		@Override
		protected void setMode() {
			super.setMode();
			if (isAsyncRsltMode()) {
				setRefStatus();
			}
			else if (isAsync()) {
				setFIXStatus();
			}
			RsltBtn_rcopy.setMode(MCMode.DISABLE);
		}

		/***
		 * フィールド設定
		 * 
		 * @param rsltL ヘッダリスト
		 * @param rsltYieldByProdL 明細リスト
		 */
		public void setField(MCList<RsltR> hdrL,  MCList<RsltYieldByProdR> dtlL) {
			_RsltLForCall = hdrL;
			_RsltYieldByprodLForCall = dtlL;
			hdrL.forEach(r -> _rsltMap.put(r.peg_no(), r));
		}
		@Override
		protected void checkReq(MCMessageList msgList) {
			checkReqSub(msgList, getRsltL());
		}

		@Override
		protected void confirmForCallStack(MCMessageList msgList) {
			super.confirmForCallStack(msgList);
			chkYieldByProdQty(msgList);
			chkYield(msgList);
		}
		
		protected void chkYieldByProdQty(MCMessageList msgList) {
			MCList<RsltYieldByProdR> chkTargetL = makeInptChkTargetList();
			
			if (!chkTargetL.isEmpty()) {
				msgList.addAll(
					doInptChk(
						MAC_FUNC_TYP.YIELD.value(), columnRsltYieldByProd_itm_cd, columnRsltYieldByProd_itm_sub1, columnRsltYieldByProd_itm_sub2, columnRsltYieldByProd_itm_sub3,
						columnRsltYieldByProd_yield_act_no, columnRsltYieldByProd_base_unit_yield_act_qty_bef,
						columnRsltYieldByProd_base_unit_yield_act_qty, columnRsltYieldByProd_yield_act_qty,
						columnRsltYieldByProd_base_unit_yield_schd_qty, chkTargetL,
						columnRsltYieldByProd_trd_unit_yield_act_qty, columnRsltYieldByProd_yield_schd_no));
			}
		}
		
		protected String[] getGrpColums() {
			return new String[] {
					RsltYieldByProdR.$yield_schd_no
			};
		}
		
		protected MCList<RsltYieldByProdR> getTargetList() {
			MCList<RsltYieldByProdR> allRsltYieldByProdL = MCList.create(RsltYieldByProdR.class);
			
			MCList<RsltR> targetRsltL = getRsltL().subList(RsltR.$check, true);
			for (RsltR r : targetRsltL) {
				MCList<RsltYieldByProdR> list = _yieldByProdMap.get(r.peg_no());
				if (!isNull(list)) {
					allRsltYieldByProdL.addAll(list);
				}
			}
			
			return allRsltYieldByProdL.subList(r -> !r.isStatusDelete() && !isNull(r.yield_schd_no()));
		}
		
		protected MCList<RsltYieldByProdR> getAddList(MCList<RsltYieldByProdR> targetGroupL) {
			MCList<RsltYieldByProdR> addL = MCList.create(RsltYieldByProdR.class);
			
			MCNumber sumYieldActQty = MCNumber.ZERO;
			
			for (RsltYieldByProdR targetGroupR : targetGroupL) {
				if (targetGroupR.isStatusCreate()) {
					targetGroupR.base_unit_yield_act_qty_bef(MCNumber.ZERO);
					addL.add(targetGroupR);
				}
				else if (targetGroupR.isStatusModify()) {
					addL.add(targetGroupR);
				}
				
				sumYieldActQty = sumYieldActQty.add(targetGroupR.base_unit_yield_act_qty_bef());
			}
			
			targetGroupL.setNumber(RsltYieldByProdR.$yield_act_qty, sumYieldActQty);
			
			return addL;
		}
		
		protected MCList<RsltYieldByProdR> makeInptChkTargetList() {
			MCList<RsltYieldByProdR> chkTargetL = MCList.create(RsltYieldByProdR.class);
			
			MCList<RsltYieldByProdR> targetL = getTargetList();
			
			for (MCList<RsltYieldByProdR> targetGroupL : targetL.groupList(getGrpColums())) {
				chkTargetL.addAll(getAddList(targetGroupL));
			}
			
			return chkTargetL;
		}
		
		/**
		 * 品目実際収率、工程実際収率の大小チェック
		 * @param msgList
		 */
		protected void chkYield(MCMessageList msgList) {
			// 削除行は事前に除く
			MCList<RsltR> tgtL = _RsltLForCall.subList(r -> !r.isStatusDelete());

			for (RsltR r : tgtL) {
				if (isUpdActHdrStatus() || isUpdActOperStatus()) {
					// ヘッダ単位の登録
					if (!isNullOr(r.itm_lower_yield(), r.itm_yield())) {
						if (r.itm_yield().lt((r.itm_lower_yield()))) {
							msgList.add(new MCMessage(r, RsltR.$itm_yield, MSBCP1016,
									r.itm_yield(), r.itm_lower_yield(),
									toDispGUIIndex(r)));
						}
					}
					if (!isNullOr(r.itm_upper_yield(), r.itm_yield())) {
						if (r.itm_yield().gt((r.itm_upper_yield()))) {
							msgList.add(new MCMessage(r, RsltR.$itm_yield, MSBCP1017,
									r.itm_yield(), r.itm_upper_yield(),
									toDispGUIIndex(r)));
						}
					}
				}
				if (isUpdActOperStatus()) {
					// 工程単位の登録
					if (!isNullOr(r.oper_lower_yield(), r.oper_yield())) {
						if (r.oper_yield().lt(r.oper_lower_yield())) {
							msgList.add(new MCMessage(r, RsltR.$oper_yield, MSBCP1018,
									r.oper_yield(), r.oper_lower_yield(),
									toDispGUIIndex(r)));
						}
					}
					if (!isNullOr(r.oper_upper_yield(), r.oper_yield())) {
						if (r.oper_yield().gt(r.oper_upper_yield())) {
							msgList.add(new MCMessage(r, RsltR.$oper_yield, MSBCP1019,
									r.oper_yield(), r.oper_upper_yield(),
									toDispGUIIndex(r)));
						}
					}
				}
			}
		}
		
		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			
			if (Cnd_srch_mode_OPER.isSelected()) {
				bridge.up0().oper_unit_flg(true);
			}
			else {
				bridge.up0().oper_unit_flg(false);
			}
			bridge.up1().setAll(_RsltLForCall);
			bridge.up2().setAll(_RsltYieldByprodLForCall);
		}
		
		@Override
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = super.getUpBlocks();
			// 実装仕様書上では画面で表示されているリストにマッピングしているが、
			// 下部一覧の上り電文はインスタンス変数として保持しているyieldMapを元に作成している（_RsltYieldByprodLForCall）
			// 登録後の下り電文のマージのために、_RsltYieldByprodLForCallをup2に置き換える
			result.set(2, _RsltYieldByprodLForCall);
			return result;
		}

		@Override
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = super.getDownBlocks();
			// getUpBlocksと同様の理由で置き換える
			result.set(1, _RsltYieldByprodLForCall);
			return result;
		}
		@Override
		protected void show() {
			super.show();
			String[] downCols = {RsltR.$peg_no};
			String[] causeRowCols = {RsltYieldByProdR.$hdr_peg_no};
			Rslt_rtn_msg_p_PPanel.setMsgByKeyCols(_RsltLForCall, downCols, getParamMessage(), causeRowCols);
		}
	}
	
	@Override
	public void setFocus(MCMessage msg) {
		// 下部一覧でエラーが発生した場合は、上部一覧にフォーカスを飛ばす
		if (msg.getCauseRow() != null && msg.getCauseRow() instanceof RsltYieldByProdR) {
			for (RsltR r : getRsltL()) {
				if (isSame(((RsltYieldByProdR) msg.getCauseRow()).hdr_peg_no(), r.peg_no())) {
					RsltTable.selectLeftmostColumn(r.getGUIIndex());
					break;
				}
			}
		}
		super.setFocus(msg);
	}

	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBCL1130_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBCL1130_Del01();
	}
	
	/**
	 * [MS_MSBCL1130_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1130_Del01Caller<P extends MSBCP_MfgActListReg, B extends MS_MSBCL1130_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBCL1130_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Btn]のボタン[del_aprv]の押下時の処理
	 */
	@Override
	public void doBtn_del_aprv(MCEventInfo info) {
		callMS_MSBCL1130_Del02();
	}
	
	/**
	 * [MS_MSBCL1130_Del02]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1130_Del02Caller<P extends MSBCP_MfgActListReg, B extends MS_MSBCL1130_Del02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBCL1130_Del02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);

			checkReqSub(msgList);
		}

		/**
		 * 共通項目の必須チェックを行っています。
		 * @param msgList
		 */
		protected void checkReqSub(MCMessageList msgList) {
			msgList.addAll(panel.checkReq(getAprvBulkSetR()));
		}
	}

	/**
	 * Panel[Btn]のボタン[upd_aprv]の押下時の処理
	 */
	@Override
	public void doBtn_upd_aprv(MCEventInfo info) {
		callMS_MSBCL1130_Upd02();
	}

	/**
	 * Panel[Btn]のボタン[prnt_act]の押下時の処理
	 */
	@Override
	public void doBtn_prnt_act(MCEventInfo info) {
		callMS_MSBCL1130_Prnt01();
	}
	
	/**
	 * [MS_MSBCL1130_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1130_Prnt01Caller<P extends MSBCP_MfgActListReg, B extends MS_MSBCL1130_Prnt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBCL1130_Prnt01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void show() {
			super.show();
			
			setFIXStatus();
		}
	}
	
	/**
	 * [MS_MSBCL1130_Upd02]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1130_Upd02Caller<P extends MSBCP_MfgActListReg, B extends MS_MSBCL1130_Upd02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBCL1130_Upd02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void beforeCall() {
			super.beforeCall();
			for (RsltR r : bridge.up0()) {
				if (isSame(getSysParm("MFG_APRV_USR_FIX_FLG"), "1")) {
					r.aprv_dt(getAprvBulkSetR().aprv_dt());
					r.aprv_usr_cd(getAprvBulkSetR().aprv_usr_cd());
				}
			}
		}
	}

	/**
	 * [MS_MSBCL1130_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1130_Srch01Caller<P extends MSBCP_MfgActListReg, B extends MS_MSBCL1130_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBCL1130_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			setDLMode();
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		@Override
		protected void clear() {
			super.clear();
			clearHiddenList();
			clearCache();
		}

		@Override
		protected void setMode() {
			super.setMode();

			setRefStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();

			setSrchStatus();
		}

		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkAtLeastOne(StsPanel));
			msgList.addAll(checkAtLeastOne(ActPrntPanel));
			msgList.addAll(checkAtLeastOne(StkLstPrntPanel));
			msgList.addAll(checkAtLeastOne(MesPanel));
			msgList.addAll(checkAtLeastOne(UnschdPanel));
			msgList.addAll(checkBeforeAfter(Cnd_st_ac_dt_fr, Cnd_st_ac_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_end_ac_dt_fr, Cnd_end_ac_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_inst_dt_fr, Cnd_inst_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_aprv_dt_fr, Cnd_aprv_dt_to));
		}

		@Override
		protected void show() {
			super.show();
			
			for (RsltR r : bridge.down0()) {
				r.old_mfg_sts_typ(r.mfg_sts_typ());
				r.old_end_act_dt(r.end_act_dt());
				r.old_act_usr_cd(r.act_usr_cd());
				r.old_act_usr_dpt_cd(r.act_usr_dpt_cd());
			}

			for (RsltYieldByProdR yR : bridge.down1()) {
				if (!isNull(yR.yield_act_no())) {
					yR.can_ac_dt(yR.ac_dt());
				}
			}
			setHiddenList(bridge.down0(), bridge.down1());
			
			if (Cnd_ope_UPD.isSelected() && Cnd_srch_mode_OPER.isSelected()) {
				createSameMfgActMap(bridge.down0());
			}
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBCL1130_Srch01();
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBCL1130_Srch01().execDL();
	}
	/**
	 * Panel[RsltBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doRsltBtn_rcopy(MCEventInfo info) {
		RsltR r = copyRow(RsltTable);
		if (Cnd_srch_mode_HDR.isSelected()) {
			r.mfg_act_no(null);
			r.div_seq(null);
		}
		else {
			r.oper_act_no(null);
			r.mes_flg(false);
			r.ext_sys_cd(null);
			r.ext_sys_nm(null);
			r.ext_oper_act_no(null);
			r.if_auto_reg_flg(false);
		}
		r.copied_row_flg(true);
		
		// 上部一覧のキャッシュの更新
		if (Cnd_ope_UPD.isSelected() && Cnd_srch_mode_OPER.isSelected()) {
			MCList<RsltR> l = _sameMfgActMap.get(getMfgActMapKey(r.mfg_inst_no(), r.div_seq()));
			l.add(r);
		}
		
		// 下部一覧のキャッシュの更新
		MCNumber oldPegNo = r.peg_no();
		MCNumber newPegNo = ((MCNumber)getRsltL().max(RsltR.$peg_no)).add(1);
		MCList<RsltYieldByProdR> newYL = _yieldByProdMap.get(oldPegNo);
		if (!isNull(newYL)) {
			newYL = newYL.clone();
			for (RsltYieldByProdR newYR : newYL) {
				clearYieldCopyRow(newYR);
				newYR.oper_act_no(null);
				newYR.hdr_peg_no(newPegNo);
				newYR.setStatus(MCRow.Status.CREATE);
			}
			_yieldByProdMap.put(newPegNo, newYL);
			getRsltYieldByProdL().setAll(newYL);
		}
		
		r.peg_no(newPegNo);
		setValueEx(columnRslt_check, r.getGUIIndex(), true);
		
		setBtnRsltMode();
		setBtnRsltYieldByProdMode();
	}
	
	/**
	 * Panel[RsltBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doRsltBtn_rdel(MCEventInfo info) {
		RsltR r = deleteRow(RsltTable);
		if (r == null) {
			return;
		}
		
		// 上部一覧のキャッシュの更新
		if (Cnd_ope_UPD.isSelected() && Cnd_srch_mode_OPER.isSelected()) {
			_sameMfgActMap.get(getMfgActMapKey(r.mfg_inst_no(), r.div_seq())).remove(r);
		}
		
		// 下部一覧のキャッシュの更新
		if (_yieldByProdMap.containsKey(r.peg_no())) {
			_yieldByProdMap.remove(r.peg_no());
		}
	}
	
	@Override
	protected List<String> getNotInheritCols(String type, MCContainer cont) {
		List<String> list = super.getNotInheritCols(type, cont);
		if (cont == getRsltL()) {
			// 製造指図更新カウンタ
			if (list.contains(RsltR.$mfg_inst_upd_cntr)) {
				list.remove(RsltR.$mfg_inst_upd_cntr);
			}
			// 製造指図進捗更新カウンタ
			if (list.contains(RsltR.$mfg_inst_pr_upd_cntr)) {
				list.remove(RsltR.$mfg_inst_pr_upd_cntr);
			}
		}

		return list;
	}

	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		doSelectAll(RsltTable);
	}
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(RsltTable);
	}

	/**
	 * Panel[RsltYieldByProdBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doRsltYieldByProdBtn_rcopy(MCEventInfo info) {
		RsltYieldByProdR r = copyRow(RsltYieldByProdTable);
		if (r == null) {
			return;
		}
		clearYieldCopyRow(r);
		setOrgYieldLotNo(r);
		r.copied_row_flg(true);

		RsltR rsltR = RsltTable.getSelectedMCRow();
		if (!rsltR.check()) {
			setValueEx(columnRslt_check, rsltR.getGUIIndex(), true);
		}
		setOperUnitActQty(r);
		
		// 下部一覧のキャッシュの更新
		_yieldByProdMap.get(r.hdr_peg_no()).add(r);
		
		setBtnRsltYieldByProdMode();
	}
	
	protected void clearYieldCopyRow(RsltYieldByProdR r) {
		r.yield_act_no(null);
		r.can_ac_dt(null);
		r.can_ac_dt_for_input(null);
		r.ac_dt_after_srch(null);
		r.mes_flg(false);
		r.ext_sys_cd(null);
		r.ext_sys_nm(null);
		r.ext_yield_act_no(null);
		r.stk_lst_prnt_flg(false);
	}
	
	/**
	 * 出来高実績のコピー行に対してコピー元ロットＮＯを設定し、ロットＮＯをクリアする。
	 * 同一ロットのチェックをオンにすると、コピー元ロットＮＯからロットＮＯが設定される。
	 * @param r
	 */
	protected void setOrgYieldLotNo(RsltYieldByProdR r) {
		r.org_lot_no(r.lot_no());
		r.org_sublot_no(r.sublot_no());
		if (isEditable(columnRsltYieldByProd_same_lot_flg, r.getGUIIndex())) {
			if (!r.same_lot_flg() && !isNull(r.lot_no())) {
				r.same_lot_flg(true);
			}
		}
	}
	
	/**
	 * 出来高実績のコピー行に対してコピー元ロットＮＯを設定し、ロットＮＯをクリアする。
	 * 同一ロットのチェックをオンにすると、コピー元ロットＮＯからロットＮＯが設定される。
	 * @param r
	 */
	protected void setOrgYieldUscnhdLotNo(RsltYieldByProdR r) {
		r.org_lot_no(r.unschd_lot_no());
		r.org_sublot_no(r.unschd_sublot_no());
		if (isEditable(columnRsltYieldByProd_unschd_same_lot_flg, r.getGUIIndex())) {
			if (!r.unschd_same_lot_flg() && !isNull(r.unschd_lot_no())) {
				r.unschd_same_lot_flg(true);
			}
		}
	}
	
	/**
	 * Panel[RsltYieldByProdBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doRsltYieldByProdBtn_rdel(MCEventInfo info) {
		RsltYieldByProdR r = deleteRow(RsltYieldByProdTable);
		if (!isNull(r)) {
			RsltR rsltR = RsltTable.getSelectedMCRow();
			if (!rsltR.check()) {
				setValueEx(columnRslt_check, rsltR.getGUIIndex(), true);
			}
		}
		setOperUnitActQty(r);
		
		// 下部一覧のキャッシュの更新
		if (isNull(r.yield_act_no())) {
			_yieldByProdMap.get(r.hdr_peg_no()).remove(r);
		}
	}
	
	/**
	 * Panel[Btn]のボタン[open_MSBCP1010]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP1010(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MSBCP1010(r);
	}
	
	protected void doBtn_open_MSBCP1010(RsltR r){
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP1010");
		mcframe.clientMSBC.MSBCP1010.MSBCP_MfgInstReg msbcp1010 = 
				(mcframe.clientMSBC.MSBCP1010.MSBCP_MfgInstReg) aso.getPanel();
		mcframe.clientMSBC.MSBCP1010.CndR to = mcframe.clientMSBC.MSBCP1010.CndR.create();
		to.ope(msbcp1010.Cnd_ope_REF.getActionCommand());
		to.srch_tgt_no(r.mfg_inst_no());
		aso.putCnd(to);
		aso.putSearchAction();
		aso.show();
	}
	
	/**
	 * Panel[Btn]のボタン[open_MSBCP1100]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP1100(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MSBCP1100(r);
	}
	
	protected void doBtn_open_MSBCP1100(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP1100");
		mcframe.clientMSBC.MSBCP1100.MSBCP_MfgActReg msbcp1100 = 
				(mcframe.clientMSBC.MSBCP1100.MSBCP_MfgActReg) aso.getPanel();
		mcframe.clientMSBC.MSBCP1100.CndR to = mcframe.clientMSBC.MSBCP1100.CndR.create();

		boolean isRunValueInit = false;
		if (isNull(r.mfg_act_no())) {
			to.ope(msbcp1100.Cnd_ope_INS.getActionCommand());
			isRunValueInit = true;
		}
		else {
			if (Cnd_ope_UPD.isSelected()) {
				to.ope(msbcp1100.Cnd_ope_UPD.getActionCommand());
			}
			else if (Cnd_ope_INS.isSelected()) {
				to.ope(msbcp1100.Cnd_ope_REF.getActionCommand());
			}
			else if (Cnd_ope_DEL.isSelected() || Cnd_ope_APRV_DEL.isSelected()) {
				to.ope(msbcp1100.Cnd_ope_DEL.getActionCommand());
			}
			else if (Cnd_ope_APRV.isSelected()) {
				to.ope(msbcp1100.Cnd_ope_APRV.getActionCommand());
			}
			else {
				to.ope(msbcp1100.Cnd_ope_REF.getActionCommand());
			}
			if (Cnd_ope_INS.isSelected()) {
				to.srch_tgt_typ_nm(MSC_PROD_SRCH_TGT_TYP.MFG_ACT_NO.name());
			}
			else {
				to.div_seq(r.div_seq());
				to.srch_tgt_typ_nm(MSC_PROD_SRCH_TGT_TYP.MFG_INST_NO.name());
			}
		}
		if (isRunValueInit) {
			aso.runValueInit();
		}
		if (Cnd_ope_INS.isSelected()) {
			to.srch_tgt_no(r.mfg_act_no());
		}
		else {
			to.srch_tgt_no(r.mfg_inst_no());
		}
		aso.putCnd(to);
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MSBEP0110]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP0110(MCEventInfo info) {
		// 現品票発行画面への遷移
		MCList<RsltR> list = MCList.create(RsltR.class);
		for (RsltR r : getRsltL()) {
			if (r.check()) {
				list.add(r);
			}
		}
		if (list.isEmpty()) {
			dialog(msgNoSelectedRow());
			return;
		}
		openPanel("MS", "MSBEP0110", T4, list.get(0), list);
	}

	// -----------------------------------------------
	// init-parts

	@Override
	public MCTable getListRegTable() {
		return RsltTable;
	}

	@Override
	public MCBeans getAcDtBeans(MCRootPanel panel) {
		return columnRsltYieldByProd_ac_dt;
	}

	@Override
	public MCBeans getScreenOpeBeans(MCRootPanel panel) {
		return Cnd_ope_Group;
	}

	@Override
	public boolean isCanAcDtValueInitOpe(MCRootPanel panel) {
		if (Cnd_ope_UPD.isSelected()) {
			return true;
		}
		return false;
	}

	@Override
	public MCBeans getCheckBeans(MCRootPanel panel) {
		// 下部一覧には選択チェックがないため、nullを返す
		return null;
	}
	@Override
	protected void setupParts() {
		super.setupParts();
		
		ActBulkSet_act_usr_dpt_p_PPanel.setRelateBeans(ActBulkSet_st_act_dt);
		AprvBulkSet_aprv_usr_dpt_p_PPanel.setRelateBeans(AprvBulkSet_aprv_dt);
		AprvBulkSet_aprv_rsn_p_PPanel.setMetaLength(mcframe.commonMS.meta.MS_META.APRV_RSN);
		
		Rslt_st_ac_dt_p_PPanel.setRelateBeans(columnRslt_st_act_dt);
		Rslt_end_ac_dt_p_PPanel.setRelateBeans(columnRslt_end_act_dt);

		Rslt_oper_unit_act_qty_p_PPanel.setRelateBeans(columnRslt_oper_unit_cd,
				columnRslt_oper_unit_dec_place);
		Rslt_oper_unit_schd_qty_p_PPanel.setRelateBeans(columnRslt_oper_unit_cd,
				columnRslt_oper_unit_dec_place);
		Rslt_oper_unit_rem_qty_p_PPanel.setRelateBeans(columnRslt_oper_unit_cd,
				columnRslt_oper_unit_dec_place);

		Rslt_base_unit_st_act_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd,
				columnRslt_base_unit_dec_place);
		Rslt_base_unit_mfg_rem_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd,
				columnRslt_base_unit_dec_place);
		Rslt_base_unit_mfg_inst_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd,
				columnRslt_base_unit_dec_place);
		Rslt_base_unit_yield_schd_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd,
				columnRslt_base_unit_dec_place);
		Rslt_base_unit_yield_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd,
				columnRslt_base_unit_dec_place);
		Rslt_base_unit_dfct_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd,
				columnRslt_base_unit_dec_place);
		Rslt_base_unit_oper_schd_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd,
				columnRslt_base_unit_dec_place);
		
		Rslt_act_usr_dpt_p_PPanel.setRelateBeans(columnRslt_st_act_dt);
		Rslt_aprv_usr_dpt_p_PPanel.setRelateBeans(columnRslt_aprv_dt);
		Rslt_aprv_rsn_p_PPanel.setMetaLength(mcframe.commonMS.meta.MS_META.APRV_RSN);

		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
		Rslt_sppl_grp_p_PPanel.setRelateBeans(Cnd_sppl_grp_p_PPanel);
		
		RsltYieldByProd_trd_unit_yield_act_qty_p_PPanel.setRelateBeans(
				columnRsltYieldByProd_itm_cd,
				columnRsltYieldByProd_itm_sub1, columnRsltYieldByProd_itm_sub2,
				columnRsltYieldByProd_itm_sub3, columnRsltYieldByProd_trd_unit_cd,
				columnRsltYieldByProd_trd_unit_dec_place,
				columnRsltYieldByProd_trd_unit_conv_rnd_typ, columnRsltYieldByProd_conv_base_qty,
				columnRsltYieldByProd_conv_qty, columnRsltYieldByProd_base_unit_cd);
		RsltYieldByProd_base_unit_yield_act_qty_p_PPanel.setRelateBeans(
				columnRsltYieldByProd_base_unit_cd,
				columnRsltYieldByProd_base_unit_dec_place,
				columnRsltYieldByProd_base_unit_conv_rnd_typ, columnRsltYieldByProd_trd_unit_yield_act_qty,
				columnRsltYieldByProd_conv_base_qty, columnRsltYieldByProd_conv_qty);
		
		RsltYieldByProd_base_unit_yield_schd_qty_p_PPanel.setRelateBeans(
				columnRsltYieldByProd_base_unit_cd,
				columnRsltYieldByProd_base_unit_dec_place);
		RsltYieldByProd_base_unit_yield_rem_qty_p_PPanel.setRelateBeans(
				columnRsltYieldByProd_base_unit_cd,
				columnRsltYieldByProd_base_unit_dec_place);
		
		RsltYieldByProd_ac_dt_p_PPanel.setRelateBeans(columnRsltYieldByProd_act_dt);

		RsltYieldByProd_lot_no_p_PPanel.setRelateBeans(columnRsltYieldByProd_itm_cd, columnRsltYieldByProd_itm_sub1,
				columnRsltYieldByProd_itm_sub2, columnRsltYieldByProd_itm_sub3, columnRsltYieldByProd_lot_mng_typ,
				columnRsltYieldByProd_lot_no_typ, columnRsltYieldByProd_sublot_mng_typ,
				columnRsltYieldByProd_sublot_no_typ, false);
		
		RsltYieldByProd_sno_p_PPanel.setRelateBeans(columnRsltYieldByProd_itm_cd,
				columnRsltYieldByProd_itm_sub1, columnRsltYieldByProd_itm_sub2,
				columnRsltYieldByProd_itm_sub3, columnRsltYieldByProd_sno1_mng_typ,
				columnRsltYieldByProd_sno2_mng_typ, columnRsltYieldByProd_sno3_mng_typ,
				columnRsltYieldByProd_sno4_mng_typ);
		
		RsltYieldByProd_strg_str_ln_p_PPanel.setRelateBeans(columnRsltYieldByProd_strg_loc_cd, columnRsltYieldByProd_strg_str_ln_tgt_flg);
		
		UnschdBulkSet_act_usr_dpt_p_PPanel.setRelateBeans(UnschdBulkSet_st_act_dt);
		
		Rslt_unschd_trd_unit_yield_act_qty_p_PPanel.setRelateBeans(
				columnRslt_unschd_trd_unit_cd, columnRslt_unschd_trd_unit_dec_place);
		
		Rslt_unschd_base_unit_yield_act_qty_p_PPanel.setRelateBeans(
				columnRslt_unschd_base_unit_cd, columnRslt_unschd_base_unit_dec_place);
		
		Rslt_unschd_mfg_str_ln_p_PPanel.setRelateBeans(columnRslt_unschd_mfg_loc_cd,
				columnRslt_unschd_mfg_str_ln_tgt_flg);
		
		Rslt_unschd_strg_str_ln_p_PPanel.setRelateBeans(columnRslt_unschd_strg_loc_cd,
				columnRslt_unschd_strg_str_ln_tgt_flg);
		
		Rslt_unschd_base_unit_yield_act_qty_p_PPanel.setRelateBeans(
				columnRslt_unschd_base_unit_cd, columnRslt_unschd_base_unit_dec_place,
				columnRslt_unschd_trd_unit_rnd_typ,
				columnRslt_unschd_trd_unit_yield_act_qty,
				columnRslt_unschd_conv_base_qty,
				columnRslt_unschd_conv_qty);
		
		Rslt_unschd_lot_no_p_PPanel.setRelateBeans(columnRslt_unschd_itm_cd,
				columnRslt_unschd_itm_sub1, columnRslt_unschd_itm_sub2,
				columnRslt_unschd_itm_sub3, columnRslt_unschd_lot_mng_typ,
				columnRslt_unschd_lot_no_typ, columnRslt_unschd_sublot_mng_typ,
				columnRslt_unschd_sublot_no_typ, false);
		
		Rslt_unschd_sno_p_PPanel.setRelateBeans(columnRslt_unschd_itm_cd,
				columnRslt_unschd_itm_sub1, columnRslt_unschd_itm_sub2,
				columnRslt_unschd_itm_sub3, columnRslt_unschd_sno1_mng_typ,
				columnRslt_unschd_sno2_mng_typ, columnRslt_unschd_sno3_mng_typ,
				columnRslt_unschd_sno4_mng_typ);
		
		RsltYieldByProd_unschd_trd_unit_yield_act_qty_p_PPanel.setRelateBeans(
				columnRsltYieldByProd_unschd_itm_cd,
				columnRsltYieldByProd_unschd_itm_sub1,
				columnRsltYieldByProd_unschd_itm_sub2,
				columnRsltYieldByProd_unschd_itm_sub3,
				columnRsltYieldByProd_unschd_trd_unit_cd,
				columnRsltYieldByProd_unschd_trd_unit_dec_place,
				columnRsltYieldByProd_unschd_trd_unit_conv_rnd_typ,
				columnRsltYieldByProd_unschd_conv_base_qty,
				columnRsltYieldByProd_unschd_conv_qty,
				columnRsltYieldByProd_unschd_base_unit_cd);
		
		RsltYieldByProd_unschd_base_unit_yield_act_qty_p_PPanel.setRelateBeans(
				columnRsltYieldByProd_unschd_base_unit_cd,
				columnRsltYieldByProd_unschd_base_unit_dec_place,
				columnRsltYieldByProd_unschd_base_unit_conv_rnd_typ,
				columnRsltYieldByProd_unschd_trd_unit_yield_act_qty,
				columnRsltYieldByProd_unschd_conv_base_qty,
				columnRsltYieldByProd_unschd_conv_qty);
		
		RsltYieldByProd_unschd_lot_no_p_PPanel.setRelateBeans(
				columnRsltYieldByProd_unschd_itm_cd,
				columnRsltYieldByProd_unschd_itm_sub1,
				columnRsltYieldByProd_unschd_itm_sub2,
				columnRsltYieldByProd_unschd_itm_sub3,
				columnRsltYieldByProd_unschd_lot_mng_typ,
				columnRsltYieldByProd_unschd_lot_no_typ,
				columnRsltYieldByProd_unschd_sublot_mng_typ,
				columnRsltYieldByProd_unschd_sublot_no_typ, false);
		
		RsltYieldByProd_unschd_ac_dt_p_PPanel.setRelateBeans(columnRsltYieldByProd_unschd_act_dt);
		
		RsltYieldByProd_unschd_strg_str_ln_p_PPanel.setRelateBeans(
				columnRsltYieldByProd_unschd_strg_loc_cd,
				columnRsltYieldByProd_unschd_strg_str_ln_tgt_flg);
		
		Rslt_itm_p_PPanel.columnItm_itm_cd.setName("itm_p.itm_cd");
		Rslt_itm_p_PPanel.columnItm_itm_sub1.setName("itm_p.itm_sub1");
		Rslt_itm_p_PPanel.columnItm_itm_sub2.setName("itm_p.itm_sub2");
		Rslt_itm_p_PPanel.columnItm_itm_sub3.setName("itm_p.itm_sub3");
		Rslt_itm_p_PPanel.columnItm_itm_nm.setName("itm_p.itm_nm");
		Rslt_unschd_itm_p_PPanel.columnItm_itm_cd.setName("unschd_itm_p.itm_cd");
		Rslt_unschd_itm_p_PPanel.columnItm_itm_sub1.setName("unschd_itm_p.itm_sub1");
		Rslt_unschd_itm_p_PPanel.columnItm_itm_sub2.setName("unschd_itm_p.itm_sub2");
		Rslt_unschd_itm_p_PPanel.columnItm_itm_sub3.setName("unschd_itm_p.itm_sub3");
		Rslt_unschd_itm_p_PPanel.columnItm_itm_nm.setName("unschd_itm_p.itm_nm");
		Rslt_base_unit_st_act_qty_p_PPanel.columnQty_qty.setName("base_unit_st_act_qty_p.qty");
		Rslt_base_unit_mfg_rem_qty_p_PPanel.columnQty_qty.setName("base_unit_mfg_rem_qty_p.qty");
		Rslt_base_unit_mfg_inst_qty_p_PPanel.columnQty_qty.setName("base_unit_mfg_inst_qty_p.qty");
		Rslt_base_unit_yield_qty_p_PPanel.columnQty_qty.setName("base_unit_yield_qty_p.qty");
		Rslt_base_unit_dfct_qty_p_PPanel.columnQty_qty.setName("base_unit_dfct_qty_p.qty");
		Rslt_base_unit_oper_schd_qty_p_PPanel.columnQty_qty.setName("base_unit_oper_schd_qty_p.qty");
		Rslt_oper_unit_act_qty_p_PPanel.columnQty_qty.setName("oper_unit_act_qty_p.qty");
		Rslt_oper_unit_schd_qty_p_PPanel.columnQty_qty.setName("oper_unit_schd_qty_p.qty");
		Rslt_oper_unit_rem_qty_p_PPanel.columnQty_qty.setName("oper_unit_rem_qty_p.qty");
		Rslt_unschd_trd_unit_yield_act_qty_p_PPanel.columnQty_qty.setName("unschd_trd_unit_yield_act_qty_p.qty");
		Rslt_unschd_base_unit_yield_act_qty_p_PPanel.columnQty_qty.setName("unschd_base_unit_yield_act_qty_p.qty");
		Rslt_unschd_mfg_str_ln_p_PPanel.columnStrLn_str_ln_cd.setName("unschd_mfg_str_ln_p.str_ln_cd");
		Rslt_unschd_mfg_str_ln_p_PPanel.columnStrLn_str_ln_nm.setName("unschd_mfg_str_ln_p.str_ln_nm");
		Rslt_unschd_mfg_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg.setName("unschd_mfg_str_ln_p.str_ln_cd_none_flg");
		Rslt_unschd_strg_str_ln_p_PPanel.columnStrLn_str_ln_cd.setName("unschd_strg_str_ln_p.str_ln_cd");
		Rslt_unschd_strg_str_ln_p_PPanel.columnStrLn_str_ln_nm.setName("unschd_strg_str_ln_p.str_ln_nm");
		Rslt_unschd_strg_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg.setName("unschd_strg_str_ln_p.str_ln_cd_none_flg");
		Rslt_st_ac_dt_p_PPanel.columnAcDt_ac_dt.setName("st_ac_dt_p.ac_dt");
		Rslt_end_ac_dt_p_PPanel.columnAcDt_ac_dt.setName("end_ac_dt_p.ac_dt");
		Rslt_act_usr_dpt_p_PPanel.columnUsrDpt_usr_cd.setName("act_usr_dpt_p.usr_cd");
		Rslt_act_usr_dpt_p_PPanel.columnUsrDpt_usr_nm.setName("act_usr_dpt_p.usr_nm");
		Rslt_act_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setName("act_usr_dpt_p.dpt_cd");
		Rslt_act_usr_dpt_p_PPanel.columnUsrDpt_dpt_nm.setName("act_usr_dpt_p.dpt_nm");
		Rslt_aprv_usr_dpt_p_PPanel.columnUsrDpt_usr_cd.setName("aprv_usr_dpt_p.usr_cd");
		Rslt_aprv_usr_dpt_p_PPanel.columnUsrDpt_usr_nm.setName("aprv_usr_dpt_p.usr_nm");
		Rslt_aprv_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setName("aprv_usr_dpt_p.dpt_cd");
		Rslt_aprv_usr_dpt_p_PPanel.columnUsrDpt_dpt_nm.setName("aprv_usr_dpt_p.dpt_nm");
		Rslt_st_act_p_PPanel.columnYmdHm_ymd.setName("st_act_p.ymd");
		Rslt_st_act_p_PPanel.columnYmdHm_hm.setName("st_act_p.hm");
		Rslt_end_act_p_PPanel.columnYmdHm_ymd.setName("end_act_p.ymd");
		Rslt_end_act_p_PPanel.columnYmdHm_hm.setName("end_act_p.hm");
		Rslt_sno_p_PPanel.columnSnoWrkNo_sno1.setName("sno_p.sno1");
		Rslt_sno_p_PPanel.columnSnoWrkNo_sno2.setName("sno_p.sno2");
		Rslt_sno_p_PPanel.columnSnoWrkNo_sno3.setName("sno_p.sno3");
		Rslt_sno_p_PPanel.columnSnoWrkNo_sno4.setName("sno_p.sno4");
		Rslt_sno_p_PPanel.columnSnoWrkNo_wrk_no.setName("sno_p.wrk_no");
		Rslt_sno_p_PPanel.columnSnoWrkNo_wrk_nm.setName("sno_p.wrk_nm");
		Rslt_unschd_sno_p_PPanel.columnSnoWrkNo_sno1.setName("unschd_sno_p.sno1");
		Rslt_unschd_sno_p_PPanel.columnSnoWrkNo_sno2.setName("unschd_sno_p.sno2");
		Rslt_unschd_sno_p_PPanel.columnSnoWrkNo_sno3.setName("unschd_sno_p.sno3");
		Rslt_unschd_sno_p_PPanel.columnSnoWrkNo_sno4.setName("unschd_sno_p.sno4");
		Rslt_unschd_sno_p_PPanel.columnSnoWrkNo_wrk_no.setName("unschd_sno_p.wrk_no");
		Rslt_unschd_sno_p_PPanel.columnSnoWrkNo_wrk_nm.setName("unschd_sno_p.wrk_nm");
		
		RsltYieldByProd_itm_p_PPanel.columnItm_itm_cd.setName("itm_p.itm_cd");
		RsltYieldByProd_itm_p_PPanel.columnItm_itm_sub1.setName("itm_p.itm_sub1");
		RsltYieldByProd_itm_p_PPanel.columnItm_itm_sub2.setName("itm_p.itm_sub2");
		RsltYieldByProd_itm_p_PPanel.columnItm_itm_sub3.setName("itm_p.itm_sub3");
		RsltYieldByProd_itm_p_PPanel.columnItm_itm_nm.setName("itm_p.itm_nm");
		RsltYieldByProd_unschd_itm_p_PPanel.columnItm_itm_cd.setName("unschd_itm_p.itm_cd");
		RsltYieldByProd_unschd_itm_p_PPanel.columnItm_itm_sub1.setName("unschd_itm_p.itm_sub1");
		RsltYieldByProd_unschd_itm_p_PPanel.columnItm_itm_sub2.setName("unschd_itm_p.itm_sub2");
		RsltYieldByProd_unschd_itm_p_PPanel.columnItm_itm_sub3.setName("unschd_itm_p.itm_sub3");
		RsltYieldByProd_unschd_itm_p_PPanel.columnItm_itm_nm.setName("unschd_itm_p.itm_nm");
		RsltYieldByProd_trd_unit_yield_act_qty_p_PPanel.columnQty_qty.setName("trd_unit_yield_act_qty_p.qty");
		RsltYieldByProd_base_unit_yield_act_qty_p_PPanel.columnQty_qty.setName("base_unit_yield_act_qty_p.qty");
		RsltYieldByProd_base_unit_yield_schd_qty_p_PPanel.columnQty_qty.setName("base_unit_yield_schd_qty_p.qty");
		RsltYieldByProd_base_unit_yield_rem_qty_p_PPanel.columnQty_qty.setName("base_unit_yield_rem_qty_p.qty");
		RsltYieldByProd_unschd_trd_unit_yield_act_qty_p_PPanel.columnQty_qty.setName("unschd_trd_unit_yield_act_qty_p.qty");
		RsltYieldByProd_unschd_base_unit_yield_act_qty_p_PPanel.columnQty_qty.setName("unschd_base_unit_yield_act_qty_p.qty");
		RsltYieldByProd_strg_str_ln_p_PPanel.columnStrLn_str_ln_cd.setName("strg_str_ln_p.str_ln_cd");
		RsltYieldByProd_strg_str_ln_p_PPanel.columnStrLn_str_ln_nm.setName("strg_str_ln_p.str_ln_nm");
		RsltYieldByProd_strg_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg.setName("strg_str_ln_p.str_ln_cd_none_flg");
		RsltYieldByProd_unschd_strg_str_ln_p_PPanel.columnStrLn_str_ln_cd.setName("unschd_strg_str_ln_p.str_ln_cd");
		RsltYieldByProd_unschd_strg_str_ln_p_PPanel.columnStrLn_str_ln_nm.setName("unschd_strg_str_ln_p.str_ln_nm");
		RsltYieldByProd_unschd_strg_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg.setName("unschd_strg_str_ln_p.str_ln_cd_none_flg");
		RsltYieldByProd_ac_dt_p_PPanel.columnAcDt_ac_dt.setName("ac_dt_p.ac_dt");
		RsltYieldByProd_unschd_ac_dt_p_PPanel.columnAcDt_ac_dt.setName("unschd_ac_dt_p.ac_dt");
		RsltYieldByProd_act_dt_p_PPanel.columnYmdHm_ymd.setName("act_dt_p.ymd");
		RsltYieldByProd_act_dt_p_PPanel.columnYmdHm_hm.setName("act_dt_p.hm");
		RsltYieldByProd_unschd_act_dt_p_PPanel.columnYmdHm_ymd.setName("unschd_act_dt_p.ymd");
		RsltYieldByProd_unschd_act_dt_p_PPanel.columnYmdHm_hm.setName("unschd_act_dt_p.hm");
		RsltYieldByProd_lot_no_p_PPanel.columnLotNo_crt_lot_flg.setName("lot_no_p.crt_lot_flg");
		RsltYieldByProd_lot_no_p_PPanel.columnLotNo_lot_no.setName("lot_no_p.lot_no");
		RsltYieldByProd_lot_no_p_PPanel.columnLotNo_sublot_no.setName("lot_no_p.sublot_no");
		RsltYieldByProd_unschd_lot_no_p_PPanel.columnLotNo_crt_lot_flg.setName("unschd_lot_no_p.crt_lot_flg");
		RsltYieldByProd_unschd_lot_no_p_PPanel.columnLotNo_lot_no.setName("unschd_lot_no_p.lot_no");
		RsltYieldByProd_unschd_lot_no_p_PPanel.columnLotNo_sublot_no.setName("unschd_lot_no_p.sublot_no");
	}

	// -----------------------------------------------
	// init-screen
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		setValueEx(Cnd_ope_Group, Cnd_ope_UPD.getActionCommand());
		setValueEx(Cnd_srch_mode_Group, Cnd_srch_mode_HDR.getActionCommand());
		clearCndWhenOpeChg();
		clearCndWhenSrchModeChg();
		setMode();
	}

	@Override
	protected void setSortColumn() {
		super.setSortColumn();

		RsltYieldByProdTable.addSortColumn(columnRsltYieldByProd_yield_typ, SortType.ASC);
		RsltYieldByProdTable.addSortColumn(columnRsltYieldByProd_disp_seq, SortType.ASC);
		RsltYieldByProdTable.addSortColumn(columnRsltYieldByProd_ac_dt, SortType.ASC);
	}

	@Override
	public void screenClearBody() {
		super.screenClearBody();
		clearHiddenList();
		clearCache();
	}
	
	// -----------------------------------------------
	// status

	// 登録・訂正する(ヘッダ/検索前)
	@Override
	public void setSRCH_UPD_ACT_HDRStatus() {
		super.setSRCH_UPD_ACT_HDRStatus();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
		setBtnRsltMode();
		setBtnRsltYieldByProdMode();
		setActImmedPrntFlgMode();
	}

	// 登録・訂正する(工程/検索前)
	@Override
	public void setSRCH_UPD_ACT_OPERStatus() {
		super.setSRCH_UPD_ACT_OPERStatus();		
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
		setBtnRsltMode();
		setBtnRsltYieldByProdMode();
		setActImmedPrntFlgMode();
	}

	// 登録・訂正する(ヘッダ/検索後)
	@Override
	public void setUPD_ACT_HDRStatus() {
		super.setUPD_ACT_HDRStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
		setBtnRsltMode();
		setBtnRsltYieldByProdMode();
		setActImmedPrntFlgMode();
	}

	// 登録・訂正する(工程/検索後)
	@Override
	public void setUPD_ACT_OPERStatus() {
		super.setUPD_ACT_OPERStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
		setBtnRsltMode();
		setBtnRsltYieldByProdMode();
		setActImmedPrntFlgMode();
	}
	// 計画外実績を登録する
	@Override
	public void setINSStatus() {
		super.setINSStatus();
		setBtnMode();
		setBtnRsltUnschdMode();
		setBtnRsltYieldByProdUnschdMode();
		setActImmedPrntFlgMode();
	}
	
	// 計画外実績登録後
	@Override
	public void setFIX_INSStatus() {
		super.setFIX_INSStatus();
		RsltTable.selectLeftmostColumn(0);
	}

	// 実績を取り消す(ヘッダ/検索前)
	@Override
	public void setSRCH_DEL_ACTStatus() {
		super.setSRCH_DEL_ACTStatus();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
		setBtnRsltMode();
		setBtnRsltYieldByProdMode();
	}

	// 実績を取り消す(ヘッダ/検索後)
	@Override
	public void setDEL_ACTStatus() {
		super.setDEL_ACTStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
		setBtnRsltMode();
		setBtnRsltYieldByProdMode();
	}

	// 承認する(ヘッダ/検索前)
	@Override
	public void setSRCH_UPD_APRVStatus() {
		super.setSRCH_UPD_APRVStatus();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
		setBtnRsltMode();
		setBtnRsltYieldByProdMode();
		setMfgAprvStsTyp();
	}

	// 承認する(ヘッダ/検索後)
	@Override
	public void setUPD_ARPV_HDRStatus() {
		super.setUPD_ARPV_HDRStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
		setBtnRsltMode();
		setBtnRsltYieldByProdMode();
		setAprvDptUsrDftVal();
		setAprvDptUsrMode();
	}

	// 承認を取り消す(ヘッダ/検索前)
	@Override
	public void setSRCH_DEL_APRVStatus() {
		super.setSRCH_DEL_APRVStatus();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
		setBtnRsltMode();
		setBtnRsltYieldByProdMode();
		setMfgAprvStsTyp();
	}

	// 承認を取り消す(ヘッダ/検索後)
	@Override
	public void setDEL_APRVStatus() {
		super.setDEL_APRVStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
		setBtnRsltMode();
		setBtnRsltYieldByProdMode();
	}

	// 参照する(ヘッダ/検索前)
	@Override
	public void setSRCH_HDRStatus() {
		super.setSRCH_HDRStatus();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
		setBtnRsltMode();
		setBtnRsltYieldByProdMode();
	}

	// 参照する(工程/検索前)
	@Override
	public void setSRCH_OPERStatus() {
		super.setSRCH_OPERStatus();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
		setBtnRsltMode();
		setBtnRsltYieldByProdMode();
	}

	// 参照する(ヘッダ/検索後)
	@Override
	public void setREF_HDRStatus() {
		super.setREF_HDRStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
		setBtnRsltMode();
		setBtnRsltYieldByProdMode();
	}

	// 参照する(工程/検索後)
	@Override
	public void setREF_OPERStatus() {
		super.setREF_OPERStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
		setBtnRsltMode();
		setBtnRsltYieldByProdMode();
	}	

	// 記録書発行(ヘッダ/検索前)
	@Override
	public void setSRCH_PRNT_ACTStatus() {
		super.setSRCH_PRNT_ACTStatus();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
		setBtnRsltMode();
		setBtnRsltYieldByProdMode();
	}
	
	// 記録書発行(ヘッダ/検索後)
	@Override
	public void setPRNT_ACTStatus() {
		super.setPRNT_ACTStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
		setBtnRsltMode();
		setBtnRsltYieldByProdMode();
	}
	
	// 現品票発行(ヘッダ/検索前)
	@Override
	public void setSRCH_PRNT_STKLSTStatus() {
		super.setSRCH_PRNT_STKLSTStatus();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
		setBtnRsltMode();
		setBtnRsltYieldByProdMode();
	}
	
	// 現品票発行(ヘッダ/検索後)
	@Override
	public void setPRNT_STKLSTStatus() {
		super.setPRNT_STKLSTStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
		setBtnRsltMode();
		setBtnRsltYieldByProdMode();
	}

	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();

		// 画面遷移ボタン
		if (r == null) {
			Btn_open_MSBCP1010.setMode(MCMode.DISABLE);
			Btn_open_MSBCP1100.setMode(MCMode.DISABLE);
		}
		else {
			if (Cnd_ope_INS.isSelected()) {
				Btn_open_MSBCP1010.setMode(MCMode.DISABLE);
				if (!isNull(r.mfg_act_no())) {
					setDefaultMode(Btn_open_MSBCP1100);
				}
				else {
					Btn_open_MSBCP1100.setMode(MCMode.DISABLE);
				}
			}
			else {
				setDefaultMode(Btn_open_MSBCP1010);
				setDefaultMode(Btn_open_MSBCP1100);
			}
		}
	}

	protected void setBtnRsltYieldByProdMode() {
		RsltYieldByProdR yR = RsltYieldByProdTable.getSelectedMCRow();

		if (isUpdActOperStatus() || isUpdActHdrStatus()) {
			RsltR rsltR = RsltTable.getSelectedMCRow();
			
			// 行削除ボタン
			if (!canRsltYieldByProdRDel(yR)) {
				RsltYieldByProdBtn_rdel.setMode(MCMode.DISABLE);
			}
			else {
				if (!isNull(rsltR) && rsltR.arr_purc_auto_reg_flg()) {
					RsltYieldByProdBtn_rdel.setMode(MCMode.DISABLE);
				}
				else {
					setDefaultMode(RsltYieldByProdBtn_rdel);
				}
			}

			// 行コピーボタン
			if (yR == null) {
				RsltYieldByProdBtn_rcopy.setMode(MCMode.DISABLE);
			}
			else {
				if (!isNull(rsltR) && rsltR.arr_purc_auto_reg_flg()) {
					RsltYieldByProdBtn_rcopy.setMode(MCMode.DISABLE);
				}
				else {
					setDefaultMode(RsltYieldByProdBtn_rcopy);
				}
			}
			
			if (canLotIssue(rsltR)) {
				setDefaultMode(RsltYieldByProdBtn_sprt_lot_no);
				setDefaultMode(RsltYieldByProdBtn_lot_issue_flg);
				setDefaultMode(RsltYieldByProdBtn_sublot_issue_flg);
			}
			else {
				RsltYieldByProdBtn_sprt_lot_no.setMode(MCMode.DISABLE);
				RsltYieldByProdBtn_lot_issue_flg.setMode(MCMode.READ_ONLY);
				RsltYieldByProdBtn_sublot_issue_flg.setMode(MCMode.READ_ONLY);
			}
		}
	}

	protected void setBtnRsltYieldByProdUnschdMode() {
		RsltYieldByProdR yR = RsltYieldByProdTable.getSelectedMCRow();

		if (isInsStatus()) {
			RsltR rsltR = RsltTable.getSelectedMCRow();
			
			// 行削除ボタン
			if (rsltR == null || yR == null) {
				RsltYieldByProdBtn_rdel_unschd.setMode(MCMode.DISABLE);
			}
			else if(!isYieldMultiRow(rsltR.peg_no())) {
				RsltYieldByProdBtn_rdel_unschd.setMode(MCMode.DISABLE);
			}
			else {
				if (!isNull(rsltR.mfg_act_no())) {
					RsltYieldByProdBtn_rdel_unschd.setMode(MCMode.DISABLE);
				}
				else {
					setDefaultMode(RsltYieldByProdBtn_rdel_unschd);
				}
			}
			
			// 行コピーボタン
			if (rsltR == null || yR == null) {
				RsltYieldByProdBtn_rcopy_unschd.setMode(MCMode.DISABLE);
			}
			else {
				if (!isNull(rsltR.mfg_act_no())) {
					RsltYieldByProdBtn_rcopy_unschd.setMode(MCMode.DISABLE);
				}
				else {
					setDefaultMode(RsltYieldByProdBtn_rcopy_unschd);
				}
			}
			
			// 行追加ボタン
			if (rsltR == null) {
				RsltYieldByProdBtn_radd_unschd.setMode(MCMode.DISABLE);
			}
			else {
				if (!isNull(rsltR.mfg_act_no())) {
					RsltYieldByProdBtn_radd_unschd.setMode(MCMode.DISABLE);
				}
				else {
					setDefaultMode(RsltYieldByProdBtn_radd_unschd);
				}
			}
			
			if (canLotIssue(rsltR)) {
				setDefaultMode(RsltYieldByProdBtn_sprt_lot_no);
				setDefaultMode(RsltYieldByProdBtn_lot_issue_flg);
				setDefaultMode(RsltYieldByProdBtn_sublot_issue_flg);
			}
			else {
				RsltYieldByProdBtn_sprt_lot_no.setMode(MCMode.DISABLE);
				RsltYieldByProdBtn_lot_issue_flg.setMode(MCMode.READ_ONLY);
				RsltYieldByProdBtn_sublot_issue_flg.setMode(MCMode.READ_ONLY);
			}
		}
	}
	
	protected boolean canRsltYieldByProdRDel(RsltYieldByProdR yR) {
		if (yR == null) {
			return false;
		}
		if (yR.copied_row_flg()) {
			return true;
		}
		if (!isNull(yR.yield_act_no())) {
			return true;
		}
		return false;
	}
	
	protected boolean canLotIssue(RsltR rsltR) {
		if (getRsltYieldByProdL().isEmpty()) {
			return false;
		}
		if (isNull(rsltR)) {
			return false;
		}
		if (MSC_MFG_MTD_TYP.isEXTNL(rsltR.mfg_mtd_typ())) {
			return false;
		}
		if (isInsStatus() && (!isNull(rsltR.mfg_act_no()) || isNull(rsltR.unschd_itm_cd())
				|| isNull(rsltR.unschd_itm_sub1()) || isNull(rsltR.unschd_itm_sub2())
				|| isNull(rsltR.unschd_itm_sub3()))) {
			return false;
		}
		return true;
	}

	protected void setBtnRsltMode() {
		RsltR r = RsltTable.getSelectedMCRow();
		if (isUpdActOperStatus() || isUpdActHdrStatus()) {
			// 行削除ボタン
			if (!canRsltRDel(r)) {
				RsltBtn_rdel.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(RsltBtn_rdel);
			}
			
			// 行コピーボタン
			if (r == null || MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
				RsltBtn_rcopy.setMode(MCMode.DISABLE);
			}
			else {
				if (r.arr_purc_auto_reg_flg()) {
					RsltBtn_rcopy.setMode(MCMode.DISABLE);
				}
				else if (!MSC_MFG_STS_TYP.isORD(r.old_mfg_sts_typ()) && Cnd_srch_mode_HDR.isSelected()) {
					RsltBtn_rcopy.setMode(MCMode.DISABLE);
				}
				else if (MSC_MFG_MTD_TYP.isEXTNL(r.mfg_mtd_typ()) && Cnd_srch_mode_HDR.isSelected()) {
					RsltBtn_rcopy.setMode(MCMode.DISABLE);
				}
				else {
					setDefaultMode(RsltBtn_rcopy);
				}
			}
		}
	}

	protected void setBtnRsltUnschdMode() {
		RsltR r = RsltTable.getSelectedMCRow();
		if (isInsStatus()) {
			// 行削除ボタン
			if (r == null) {
				RsltBtn_rdel_unschd.setMode(MCMode.DISABLE);
			}
			else {
				if (!isNull(r.mfg_act_no())) {
					RsltBtn_rdel_unschd.setMode(MCMode.DISABLE);
				}
				else {
					setDefaultMode(RsltBtn_rdel_unschd);
				}
			}
			
			// 行コピーボタン
			if (r == null) {
				RsltBtn_rcopy_unschd.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(RsltBtn_rcopy_unschd);
			}
		}
	}
	
	protected boolean canRsltRDel(RsltR r) {
		if (r == null) {
			return false;
		}
		if (r.copied_row_flg()) {
			return true;
		}
		return false;
	}

	protected boolean isUpdActHdrStatus() {
		return isSame(getStatus(), UPD_ACT_HDR);
	}

	protected boolean isUpdActOperStatus() {
		return isSame(getStatus(), UPD_ACT_OPER);
	}

	protected boolean isUpdAprvHdrStatus() {
		return isSame(getStatus(), UPD_ARPV_HDR);
	}

	protected boolean isUpdStatus() {
		return isUpdActHdrStatus() || isUpdActOperStatus() || isUpdAprvHdrStatus();
	}

	protected boolean isInsStatus() {
		return isSame(getStatus(), INS);
	}

	protected boolean isDelActStatus() {
		return isSame(getStatus(), DEL_ACT);
	}

	protected boolean isDelAprvStatus() {
		return isSame(getStatus(), DEL_APRV);
	}

	protected boolean isDelStatus() {
		return isDelActStatus() || isDelAprvStatus();
	}

	protected boolean isRegStatus() {
		return isUpdStatus() || isDelStatus() || isInsStatus();
	}

	protected void setSrchStatus() {
		// 検索前ステータス
		// 登録・訂正する
		if (Cnd_ope_UPD.isSelected()) {
			if (Cnd_srch_mode_HDR.isSelected()) {
				setSRCH_UPD_ACT_HDRStatus();
			}
			else {
				setSRCH_UPD_ACT_OPERStatus();
			}
		}
		// 計画外実績を登録する
		else if (Cnd_ope_INS.isSelected()){
			setINSStatus();
		}
		// 実績を取り消す
		else if (Cnd_ope_DEL.isSelected()) {
			setSRCH_DEL_ACTStatus();
		}
		// 承認する
		else if (Cnd_ope_APRV.isSelected()) {
			setSRCH_UPD_APRVStatus();
		}
		// 承認を取り消す
		else if (Cnd_ope_APRV_DEL.isSelected()) {
			setSRCH_DEL_APRVStatus();
		}
		// 記録書発行
		else if (Cnd_ope_PRNT_ACT.isSelected()) {
			setSRCH_PRNT_ACTStatus();
		}
		// 現品票発行
		else if (Cnd_ope_PRNT_STKLST.isSelected()) {
			setSRCH_PRNT_STKLSTStatus();
		}
		// 参照する
		else if (Cnd_ope_REF.isSelected()) {
			if (Cnd_srch_mode_HDR.isSelected()) {
				setSRCH_HDRStatus();
			}
			else {
				setSRCH_OPERStatus();
			}
		}

		setMode();
	}

	protected void setMode() {
		if (Cnd_ope_INS.isSelected()) {
			Ctrl_ctrl_PPanel.setDISABLEStatus();
			Ctrl_ctrl_PPanel.expand(false);
			setTabComponentEnable(FoldTab);
			setTabComponentEnable(BulkSetTab, UnschdBulkSetPanel);
			clearHiddenList();
			makeRsltTable();
			BulkSetTab.focusActiveFirstComponent();
			FoldTab.setEnabled(false);
		}
		else {
			Ctrl_ctrl_PPanel.setENABLEStatus();
			Ctrl_ctrl_PPanel.expand(true);
			setTabComponentEnable(FoldTab, Tab1Panel, Tab2Panel, Tab3Panel);
			setTabComponentEnable(BulkSetTab, ActBulkSetPanel, AprvBulkSetPanel);
			makeRsltTable();
			FoldTab.setEnabled(true);
		}
	}
	
	protected void makeRsltTable() {
		RsltTable.setStatusColumnVisible(false);
		if (Cnd_ope_INS.isSelected()) {
			RsltTable.fillSpace();
			RsltYieldByProdTable.setStatusColumnVisible(false);
			MCList<RsltR> rsltL = getRsltL();
			for (int i = 0; i < rsltL.size(); i++) {
				RsltR r = rsltL.get(i);
				r.peg_no(i);
				r.setStatus(Status.GUICREATE);
			}
		}
	}
	
	protected void setRefStatus() {
		// 検索後ステータス
		// 登録・訂正する
		if (Cnd_ope_UPD.isSelected()) {
			if (Cnd_srch_mode_HDR.isSelected()) {
				setUPD_ACT_HDRStatus();
			}
			else {
				setUPD_ACT_OPERStatus();
			}
		}
		// 実績を取り消す
		else if (Cnd_ope_DEL.isSelected()) {
			setDEL_ACTStatus();
		}
		// 承認する
		else if (Cnd_ope_APRV.isSelected()) {
			setUPD_ARPV_HDRStatus();
		}
		// 承認を取り消す
		else if (Cnd_ope_APRV_DEL.isSelected()) {
			setDEL_APRVStatus();
		}
		// 記録書発行
		else if (Cnd_ope_PRNT_ACT.isSelected()) {
			setPRNT_ACTStatus();
		}
		// 現品票発行
		else if (Cnd_ope_PRNT_STKLST.isSelected()) {
			setPRNT_STKLSTStatus();
		}
		// 参照する
		else if (Cnd_ope_REF.isSelected()) {
			if (Cnd_srch_mode_HDR.isSelected()) {
				setREF_HDRStatus();
			}
			else {
				setREF_OPERStatus();
			}
		}
		Ctrl_ctrl_PPanel.expand(false);
	}	

	/**
	 * 一覧（出来高・副産品実績）の検索結果を設定する。
	 */
	protected void setHiddenList(MCList<RsltR> hdrL, MCList<RsltYieldByProdR> yieldL) {
		MCIndexKey idxKey = yieldL.createIndex(RsltYieldByProdR.$hdr_peg_no);
		for (RsltR r : hdrL) {
			MCList<RsltYieldByProdR> val = yieldL.subList(idxKey, r.peg_no());
			_yieldByProdMap.put(r.peg_no(), val);
		}
	}

	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		int idx = info.getEventIndex();
		if (idx >= 0) {
			RsltR row = getRsltL().get(idx);
			showYieldByProd(row);
		}
		RsltYieldByProdTable.sort();

		RsltYieldByProdTable.adjustWidth();

		setBtnMode();
		setBtnRsltMode();
		setBtnRsltUnschdMode();
		setBtnRsltYieldByProdMode();
		setBtnRsltYieldByProdUnschdMode();
	}

	@Override
	public void doRsltYieldByProd_NC(MCEventInfo info) {
		super.doRsltYieldByProd_NC(info);

		setBtnRsltYieldByProdMode();
		setBtnRsltYieldByProdUnschdMode();
	}

	/**
	 * 一覧（製造・工程実績）に対応する一覧（出来高・副産品実績）を表示する。
	 * @param row 対象の一覧（出来高・副産品実績行
	 */
	protected void showYieldByProd(RsltR row) {
		getRsltYieldByProdL().clear();
		if (!isNull(row)){
			if (!_yieldByProdMap.isEmpty()) {
				getRsltYieldByProdL().setAll(_yieldByProdMap.get(row.peg_no()));
			}
			showSub(RsltYieldByProdTable);
		}
	}

	protected void showSub(MCTable<?> tbl) {
		if (tbl.getList().size() > 0) {
			sort(tbl);
		}
	}
	
	protected void clearHiddenList() {
		_yieldByProdMap.clear();
	}
	
	@Override
	public void doRsltYieldByProd_same_lot_flg_NC(MCEventInfo info) {
		super.doRsltYieldByProd_same_lot_flg_NC(info);
		RsltYieldByProdR yR = getRsltYieldByProdL().get(info.getEventIndex());
		setYieldOrgLotNo(yR);
	}
	
	@Override
	public void doRsltYieldByProd_unschd_same_lot_flg_NC(MCEventInfo info) {
		super.doRsltYieldByProd_unschd_same_lot_flg_NC(info);
		RsltYieldByProdR yR = getRsltYieldByProdL().get(info.getEventIndex());
		setUnschdYieldOrgLotNo(yR);
	}

	/**
	 * コピー元ロットＮＯからロットＮＯを設定
	 * @param r
	 */
	protected void setYieldOrgLotNo(RsltYieldByProdR r) {
		// 同一ロットをオンにした場合、コピー元ロットＮＯを設定
		if (r.same_lot_flg()) {
			if (!isNull(r.org_lot_no())) {
				r.lot_no(r.org_lot_no());
			}
			if (!isNull(r.org_sublot_no())) {
				r.sublot_no(r.org_sublot_no());
			}
		}
		// コピー行に対して同一ロットをオフにした場合、ロットＮＯをクリア
		else {
			if (!isNull(r.org_lot_no())) {
				r.lot_no(null);
			}
			if (!isNull(r.org_sublot_no())) {
				r.sublot_no(null);
			}
		}
	}

	/**
	 * コピー元ロットＮＯからロットＮＯを設定（計画外）
	 * @param r
	 */
	protected void setUnschdYieldOrgLotNo(RsltYieldByProdR r) {
		// 同一ロットをオンにした場合、コピー元ロットＮＯを設定
		if (r.unschd_same_lot_flg()) {
			if (!isNull(r.org_lot_no())) {
				r.unschd_lot_no(r.org_lot_no());
			}
			if (!isNull(r.org_sublot_no())) {
				r.unschd_sublot_no(r.org_sublot_no());
			}
		}
		// コピー行に対して同一ロットをオフにした場合、ロットＮＯをクリア
		else {
			if (!isNull(r.org_lot_no())) {
				r.unschd_lot_no(null);
			}
			if (!isNull(r.org_sublot_no())) {
				r.unschd_sublot_no(null);
			}
		}
	}

	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (Cnd_ope_INS.isSelected()) {
			if (compo == RsltTable) {
				RsltR r = getRsltL().get(info.getEventIndex());
				if (!(r == null) && !isNull(r.mfg_act_no())) {
					doBtn_open_MSBCP1100(r);
				}
			}
		}
		else {
			if (compo == RsltTable) {
				RsltR r = getRsltL().get(info.getEventIndex());
				if (!(r == null)) {
					doBtn_open_MSBCP1100(r);
				}
			}
		}
	}
	
	// -----------------------------------------------
	// event/listener
	
	// 製造状況区分の絞込み
	@Override
	public MCList getActBulkSet_mfg_sts_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getDispMfgStsTyp());
		return super.getActBulkSet_mfg_sts_typ(row, info);
	}
	@Override
	public MCList getUnschdBulkSet_mfg_sts_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getDispMfgStsTyp());
		return super.getUnschdBulkSet_mfg_sts_typ(row, info);
	}
	@Override
	public MCList getRslt_mfg_sts_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getDispMfgStsTyp());
		return super.getRslt_mfg_sts_typ(row, info);
	}
	
	public MSC_MFG_STS_TYP[] getDispMfgStsTyp() {
		return new MSC_MFG_STS_TYP[] {
				MSC_MFG_STS_TYP.STT, MSC_MFG_STS_TYP.CMPL
		};
	}
	
	@Override
	public MCList getRsltYieldByProd_yield_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getDispYieldTyp());
		return super.getRsltYieldByProd_yield_typ(row, info);
	}
	
	@Override
	public MCList getRsltYieldByProd_unschd_yield_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getDispYieldTyp());
		return super.getRsltYieldByProd_unschd_yield_typ(row, info);
	}
	public MAC_YIELD_TYP[] getDispYieldTyp() {
		return new MAC_YIELD_TYP[] {
				MAC_YIELD_TYP.GOOD, MAC_YIELD_TYP.DFCT
		};
	}

	@Override
	public MCList getRsltYieldByProd_quality_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getDispQualityTyp());
		return super.getRsltYieldByProd_quality_typ(row, info);
	}
	
	public MAC_QUALITY_TYP[] getDispQualityTyp() {
		return new MAC_QUALITY_TYP[] {
				MAC_QUALITY_TYP.GOOD, MAC_QUALITY_TYP.DFCT_OPER
		};
	}
	
	// 検索枠の製造承認状況区分の絞込み
	@Override
	public MCList getCnd_mfg_aprv_sts_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getDispMfgAprvStsTyp());
		return super.getCnd_mfg_aprv_sts_typ(row, info);
	}
	
	public MSC_MFG_APRV_STS_TYP[] getDispMfgAprvStsTyp() {
		return new MSC_MFG_APRV_STS_TYP[] {MSC_MFG_APRV_STS_TYP.INST_ACPT, 
				MSC_MFG_APRV_STS_TYP.ACT_OPN, MSC_MFG_APRV_STS_TYP.ACT_ACPT
		};
	}
	
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		clearContainers(getRsltL(), getRsltYieldByProdL(), getActBulkSetR(), getAprvBulkSetR(), getUnschdBulkSetR());
		setSrchStatus();
		clearCndWhenOpeChg();
	}

	@Override
	public void doCnd_srch_mode_NC(MCEventInfo info) {
		super.doCnd_srch_mode_NC(info);
		clearContainers(getRsltL(), getRsltYieldByProdL());
		setSrchStatus();
		clearCndWhenSrchModeChg();
	}

	protected void clearCndWhenOpeChg() {
		if (Cnd_ope_UPD.isSelected()) {
			// 登録・訂正する
			setValueEx(Cnd_ord_flg, true);
			setValueEx(Cnd_stt_flg, true);
			setValueEx(Cnd_cmpl_flg, false);
			setValueEx(Cnd_mfg_aprv_sts_typ, null);
			setValueEx(Cnd_act_prnt_flg, true);
			setValueEx(Cnd_not_act_prnt_flg, true);
			setValueEx(Cnd_stk_lst_issue_flg, true);
			setValueEx(Cnd_not_stk_lst_issue_flg, true);
			setValueEx(ActBulkSet_mfg_sts_typ, MSC_MFG_STS_TYP.CMPL.value());
			setValueEx(Cnd_mes_tgt_flg, false);
			setValueEx(Cnd_not_mes_tgt_flg, true);
			setValueEx(Cnd_not_unschd_act_flg, true);
			setValueEx(Cnd_unschd_act_flg, true);
		}
		else if (Cnd_ope_INS.isSelected()){
			setValueEx(Cnd_srch_mode_Group, Cnd_srch_mode_HDR.getActionCommand());
			setValueEx(UnschdBulkSet_mfg_sts_typ, MSC_MFG_STS_TYP.CMPL.value());
		}
		else if (Cnd_ope_DEL.isSelected()) {
			// 実績を取り消す
			setValueEx(Cnd_srch_mode_Group, Cnd_srch_mode_HDR.getActionCommand());
			setValueEx(Cnd_ord_flg, false);
			setValueEx(Cnd_stt_flg, true);
			setValueEx(Cnd_cmpl_flg, true);
			setValueEx(Cnd_mfg_aprv_sts_typ, null);
			setValueEx(Cnd_act_prnt_flg, true);
			setValueEx(Cnd_not_act_prnt_flg, true);
			setValueEx(Cnd_stk_lst_issue_flg, true);
			setValueEx(Cnd_not_stk_lst_issue_flg, true);
			setValueEx(Cnd_mes_tgt_flg, false);
			setValueEx(Cnd_not_mes_tgt_flg, true);
			setValueEx(Cnd_not_unschd_act_flg, true);
			setValueEx(Cnd_unschd_act_flg, true);
		}
		else if (Cnd_ope_APRV.isSelected()) {
			// 承認する
			setValueEx(Cnd_srch_mode_Group, Cnd_srch_mode_HDR.getActionCommand());
			setValueEx(Cnd_ord_flg, false);
			setValueEx(Cnd_stt_flg, false);
			setValueEx(Cnd_cmpl_flg, true);
			setValueEx(Cnd_mfg_aprv_sts_typ, MSC_MFG_APRV_STS_TYP.ACT_OPN.value());
			setValueEx(Cnd_act_prnt_flg, true);
			setValueEx(Cnd_not_act_prnt_flg, true);
			setValueEx(Cnd_stk_lst_issue_flg, true);
			setValueEx(Cnd_not_stk_lst_issue_flg, true);
			setValueEx(Cnd_mes_tgt_flg, false);
			setValueEx(Cnd_not_mes_tgt_flg, true);
			setValueEx(Cnd_not_unschd_act_flg, true);
			setValueEx(Cnd_unschd_act_flg, true);
		}
		else if (Cnd_ope_APRV_DEL.isSelected()) {
			// 承認を取り消す
			setValueEx(Cnd_srch_mode_Group, Cnd_srch_mode_HDR.getActionCommand());
			setValueEx(Cnd_ord_flg, false);
			setValueEx(Cnd_stt_flg, false);
			setValueEx(Cnd_cmpl_flg, true);
			setValueEx(Cnd_mfg_aprv_sts_typ, MSC_MFG_APRV_STS_TYP.ACT_ACPT.value());
			setValueEx(Cnd_act_prnt_flg, true);
			setValueEx(Cnd_not_act_prnt_flg, true);
			setValueEx(Cnd_stk_lst_issue_flg, true);
			setValueEx(Cnd_not_stk_lst_issue_flg, true);
			setValueEx(Cnd_mes_tgt_flg, false);
			setValueEx(Cnd_not_mes_tgt_flg, true);
			setValueEx(Cnd_not_unschd_act_flg, true);
			setValueEx(Cnd_unschd_act_flg, true);
		}
		else if (Cnd_ope_PRNT_ACT.isSelected()) {
			// 記録書発行
			setValueEx(Cnd_srch_mode_Group, Cnd_srch_mode_HDR.getActionCommand());
			setValueEx(Cnd_ord_flg, false);
			setValueEx(Cnd_stt_flg, false);
			setValueEx(Cnd_cmpl_flg, true);
			setValueEx(Cnd_mfg_aprv_sts_typ, null);
			setValueEx(Cnd_act_prnt_flg, false);
			setValueEx(Cnd_not_act_prnt_flg, true);
			setValueEx(Cnd_stk_lst_issue_flg, true);
			setValueEx(Cnd_not_stk_lst_issue_flg, true);
			setValueEx(Cnd_mes_tgt_flg, true);
			setValueEx(Cnd_not_mes_tgt_flg, true);
			setValueEx(Cnd_not_unschd_act_flg, true);
			setValueEx(Cnd_unschd_act_flg, true);
		}
		else if (Cnd_ope_PRNT_STKLST.isSelected()) {
			// 現品票発行
			setValueEx(Cnd_srch_mode_Group, Cnd_srch_mode_HDR.getActionCommand());
			setValueEx(Cnd_ord_flg, false);
			setValueEx(Cnd_stt_flg, true);
			setValueEx(Cnd_cmpl_flg, true);
			setValueEx(Cnd_mfg_aprv_sts_typ, null);
			setValueEx(Cnd_act_prnt_flg, true);
			setValueEx(Cnd_not_act_prnt_flg, true);
			setValueEx(Cnd_stk_lst_issue_flg, false);
			setValueEx(Cnd_not_stk_lst_issue_flg, true);
			setValueEx(Cnd_mes_tgt_flg, true);
			setValueEx(Cnd_not_mes_tgt_flg, true);
			setValueEx(Cnd_not_unschd_act_flg, true);
			setValueEx(Cnd_unschd_act_flg, true);
		}
		else if (Cnd_ope_REF.isSelected()) {
			// 参照する
			setValueEx(Cnd_ord_flg, true);
			setValueEx(Cnd_stt_flg, true);
			setValueEx(Cnd_cmpl_flg, true);
			setValueEx(Cnd_mfg_aprv_sts_typ, null);
			setValueEx(Cnd_act_prnt_flg, true);
			setValueEx(Cnd_not_act_prnt_flg, true);
			setValueEx(Cnd_stk_lst_issue_flg, true);
			setValueEx(Cnd_not_stk_lst_issue_flg, true);
			setValueEx(Cnd_mes_tgt_flg, true);
			setValueEx(Cnd_not_mes_tgt_flg, true);
			setValueEx(Cnd_not_unschd_act_flg, true);
			setValueEx(Cnd_unschd_act_flg, true);
		}
	}

	protected void clearCndWhenSrchModeChg() {
		if (Cnd_srch_mode_HDR.isSelected()) {
			setValueEx(Cnd_oper_cd, null);
			setValueEx(Cnd_oper_nm, null);
			setValueEx(Cnd_oper_loc_cd, null);
			setValueEx(Cnd_oper_loc_nm, null);
			setValueEx(Cnd_oper_str_ln_cd, null);
			setValueEx(Cnd_oper_str_ln_nm, null);
			setValueEx(Cnd_oper_usr_cd, null);
			setValueEx(Cnd_oper_usr_nm, null);
			setValueEx(Cnd_oper_inst_no, null);
			setValueEx(Cnd_oper_act_no, null);
			setValueEx(Cnd_oper_inst_rpt_rmrks, null);
			setValueEx(Cnd_oper_act_intr_rmrks, null);
			setValueEx(Cnd_oper_act_rpt_rmrks, null);
			setValueEx(Cnd_oper_act_sub_char1, null);
			setValueEx(Cnd_oper_act_sub_char2, null);
			setValueEx(Cnd_oper_act_sub_char3, null);
			setValueEx(Cnd_ext_oper_act_no, null);
		}
	}
	
	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		else {
			// REF（検索モード）では、クリア確認出さない
			if (!isRegStatus() || isStatusNone(getRsltL())) {
				return true;
			}
			else {
				return confirmRegDataClear();
			}
		}
	}
	
	@Override
	protected void listenerInit() {
		super.listenerInit();
		
		AprvBulkSet_aprv_rsn.addLCListener(this);
		AprvBulkSet_aprv_usr_cd.addLCListener(this);
		AprvBulkSet_aprv_usr_dpt_cd.addLCListener(this);
		ActBulkSet_act_usr_cd.addLCListener(this);
		ActBulkSet_act_usr_dpt_cd.addLCListener(this);
		
		columnRslt_end_act_dt.addLCListener(this);
		columnRslt_end_act_hm.addLCListener(this);
		columnRslt_end_ac_dt.addLCListener(this);
		columnRslt_base_unit_st_act_qty.addLCListener(this);
		columnRslt_st_act_dt.addLCListener(this);
		columnRslt_oper_unit_act_qty.addLCListener(this);
		columnRsltYieldByProd_trd_unit_yield_act_qty.addLCListener(this);
		
		UnschdBulkSet_act_usr_cd.addLCListener(this);
		UnschdBulkSet_act_usr_dpt_cd.addLCListener(this);
		columnRslt_unschd_itm_cd.addLCListener(this);
		columnRslt_unschd_itm_sub1.addLCListener(this);
		columnRslt_unschd_itm_sub2.addLCListener(this);
		columnRslt_unschd_itm_sub3.addLCListener(this);
		columnRslt_unschd_itm_cd.addNCListener(this);
		columnRslt_unschd_itm_sub1.addNCListener(this);
		columnRslt_unschd_itm_sub2.addNCListener(this);
		columnRslt_unschd_itm_sub3.addNCListener(this);
		columnRslt_unschd_strg_str_ln_cd.addLCListener(this);
		columnRslt_unschd_strg_str_ln_cd_none_flg.addNCListener(this);
		columnRslt_unschd_lot_no.addLCListener(this);
		columnRslt_unschd_sublot_no.addLCListener(this);
		columnRslt_unschd_trd_unit_yield_act_qty.addLCListener(this);
		columnRsltYieldByProd_unschd_lot_no.addLCListener(this);
		columnRsltYieldByProd_unschd_sublot_no.addLCListener(this);
		columnRsltYieldByProd_unschd_trd_unit_yield_act_qty.addLCListener(this);
		columnRsltYieldByProd_unschd_yield_typ.addLCListener(this);
		
		// 工程別製造実績の値連動用イベントのリスナーを追加
		for (MCColumnConfig column : getMfgActColumn()) {
			if (isNotListBeans(column)) {
				column.addNCListener(this);
			}
			else {
				column.addLCListener(this);
			}
		}
		// Rowコンテナの値の変更を検知するためRowListnerをセットする
		setListListener(RsltYieldByProdTable, createRsltYieldByProdListListener());
	}
	protected MAUDP_RowListener createRsltYieldByProdListListener() {
		return new RsltYieldByProdListRowListener();
	}
	
	protected class RsltYieldByProdListRowListener extends MAUDP_RowListener {
		@Override
		public void valueChanged(MCRowEvent event) {
			super.valueChanged(event);
			MCConstRow r = event.getSourceRow();
			if (r != null) {
				RsltR rsltR = getRsltL().getFirst(RsltR.$peg_no, r.getValueNE(RsltYieldByProdR.$hdr_peg_no));
				if (!isNull(rsltR) && !MAC_RTN_STS_TYP.isOK(rsltR.rtn_sts_typ())
						&& !rsltR.check()
						&& isEditable(columnRslt_check, rsltR.getGUIIndex())
						&& RsltTable.getMCSelectedRow() >= 0) {
					setValueEx(columnRslt_check, RsltTable.getMCSelectedRow(), true);
				}
			}
		}
	}
	
	protected Set<MCColumnConfig> _mfgActColumn = null;
	
	protected Set<MCColumnConfig> getMfgActColumn() {
		if (_mfgActColumn == null) {
			Set<MCColumnConfig> ret = new HashSet<MCColumnConfig>();
			ret.add(columnRslt_base_unit_st_act_qty);
			ret.add(columnRslt_rem_abort_flg);
			ret.add(columnRslt_act_usr_dpt_cd);
			ret.add(columnRslt_act_usr_cd);
			ret.add(columnRslt_act_rpt_rmrks);
			ret.add(columnRslt_intr_rmrks);
			ret.add(columnRslt_mfg_act_sub_char1);
			ret.add(columnRslt_mfg_act_sub_char2);
			ret.add(columnRslt_mfg_act_sub_char3);
			ret.add(columnRslt_itm_yield);
			
			_mfgActColumn = ret;
		}
		return _mfgActColumn;
	}
	
	protected boolean isNotListBeans(MCColumnConfig column) {
		if (column.getDataType() == MCDataType.BOOLEAN) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == columnRslt_unschd_itm_cd) {
			doRslt_unschd_itm_cd_NC(info);
		}
		else if (nc == columnRslt_unschd_itm_sub1) {
			doRslt_unschd_itm_sub1_NC(info);
		}
		else if (nc == columnRslt_unschd_itm_sub2) {
			doRslt_unschd_itm_sub2_NC(info);
		}
		else if (nc == columnRslt_unschd_itm_sub3) {
			doRslt_unschd_itm_sub3_NC(info);
		}
		if (Cnd_ope_UPD.isSelected() && Cnd_srch_mode_OPER.isSelected()) {
			if (nc instanceof MCColumnConfig) {
				MCColumnConfig column = (MCColumnConfig)nc;
				if (isNotListBeans(column)) {
					if (isMfgActColumn(column)) {
						doLinkMfgActVal(column, info);
					}
				}
			}
		}
		if(nc == columnRslt_unschd_strg_str_ln_cd_none_flg) {
			doRslt_unschd_strg_str_ln_cd_none_flg_NC(info);
		}
	}
	
	protected boolean isMfgActColumn(MCColumnConfig column) {
		return getMfgActColumn().contains(column);
	}
	
	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == AprvBulkSet_aprv_dt) {
			doAprvBulkSet_aprv_dt_LC(info);
		}
		else if (lc == AprvBulkSet_aprv_usr_cd) {
			doAprvBulkSet_aprv_usr_cd_LC(info);
		}
		else if (lc == AprvBulkSet_aprv_usr_dpt_cd) {
			doAprvBulkSet_aprv_usr_dpt_cd_LC(info);
		}
		else if (lc == AprvBulkSet_aprv_rsn) {
			doAprvBulkSet_aprv_rsn_LC(info);
		}
		else if (lc == ActBulkSet_act_usr_cd) {
			doActBulkSet_act_usr_cd_LC(info);
		}
		else if (lc == ActBulkSet_act_usr_dpt_cd) {
			doActBulkSet_act_usr_dpt_cd_LC(info);
		}
		else if (lc == UnschdBulkSet_act_usr_cd) {
			doUnschdBulkSet_act_usr_cd_LC(info);
		}
		else if (lc == UnschdBulkSet_act_usr_dpt_cd) {
			doUnschdBulkSet_act_usr_dpt_cd_LC(info);
		}
		else if (lc == columnRslt_unschd_itm_cd) {
			doRslt_unschd_itm_cd_LC(info);
		}
		else if (lc == columnRslt_unschd_itm_sub1) {
			doRslt_unschd_itm_sub1_LC(info);
		}
		else if (lc == columnRslt_unschd_itm_sub2) {
			doRslt_unschd_itm_sub2_LC(info);
		}
		else if (lc == columnRslt_unschd_itm_sub3) {
			doRslt_unschd_itm_sub3_LC(info);
		}
		else if (lc == columnRslt_end_act_dt) {
			doRslt_end_act_dt_LC(info);
		}
		else if (lc == columnRslt_end_act_hm) {
			doRslt_end_act_hm_LC(info);
		}
		else if (lc == columnRslt_end_ac_dt) {
			doRslt_end_ac_dt_LC(info);
		}
		else if (lc == columnRslt_base_unit_st_act_qty) {
			doRslt_base_unit_st_act_qty_LC(info);
		}
		else if (lc == columnRslt_st_act_dt) {
			doRslt_st_act_dt_LC(info);
		}
		else if (lc == columnRslt_unschd_strg_str_ln_cd) {
			doRslt_unschd_strg_str_ln_cd_LC(info);
		}
		else if (lc == columnRslt_unschd_lot_no) {
			doRslt_unschd_lot_no_LC(info);
		}
		else if (lc == columnRslt_unschd_sublot_no) {
			doRslt_unschd_sublot_no_LC(info);
		}
		else if (lc == columnRslt_unschd_trd_unit_yield_act_qty) {
			doRslt_unschd_trd_unit_yield_act_qty_LC(info);
		}
		else if(lc == columnRsltYieldByProd_unschd_lot_no) {
			doRsltYieldByProd_unschd_lot_no_LC(info);
		}
		else if(lc == columnRsltYieldByProd_unschd_sublot_no) {
			doRsltYieldByProd_unschd_sublot_no_LC(info);
		}
		else if(lc == columnRsltYieldByProd_unschd_trd_unit_yield_act_qty) {
			dorsltYieldByProd_unschd_trd_unit_yield_act_qty(info);
		}
		else if (lc == columnRslt_oper_unit_act_qty) {
			doRslt_oper_unit_act_qty_LC(info);
		}
		else if (lc == columnRsltYieldByProd_trd_unit_yield_act_qty) {
			doRsltYieldByProd_trd_unit_yield_act_qty_LC(info);
		}
		if (Cnd_ope_UPD.isSelected() && Cnd_srch_mode_OPER.isSelected()) {
			if (lc instanceof MCColumnConfig) {
				MCColumnConfig column = (MCColumnConfig)lc;
				if (!isNotListBeans(column)) {
					if (isMfgActColumn(column)) {
						doLinkMfgActVal(column, info);
					}
				}
			}
		}
	}
	
	// 工程単位の場合に、同一ヘッダとなりうる行に対して値を連動する処理
	protected boolean _isDuringItmMfgActLinkEvent = false;
	
	protected void doLinkMfgActVal(MCColumnConfig column, MCEventInfo info) {
		if (_isDuringItmMfgActLinkEvent) {
			return;
		}
		try {
			_isDuringItmMfgActLinkEvent = true;
			// イベントが発生した行
			RsltR srcR = getRsltL().get(info.getEventIndex());
			
			// 同一製造実績に紐付くリストを取得
			MCList<RsltR> sameL = _sameMfgActMap.get(getMfgActMapKey(srcR.mfg_inst_no(), srcR.div_seq()));
			if (!sameL.isEmpty()) {
				for (RsltR sameR : sameL) {
					if (sameR == srcR) {
						continue;
					}
					// 他の行に値を連動する
					column.setValue(sameR.getGUIIndex(), info.getNewValue());
				}
			}
		}
		finally {
			_isDuringItmMfgActLinkEvent = false;
		}
	}
	
	@Override
	public void setDefaultValueWhenChecked(MCRow srcRow) {
		if (srcRow instanceof RsltR) {
			RsltR r = (RsltR)srcRow;

			if (isSame(r.mfg_sts_typ(), r.old_mfg_sts_typ())) {
				bulkSet(ActBulkSet_mfg_sts_typ, r);
			}
			if (isNull(r.st_act_dt())) {
				bulkSet(ActBulkSet_st_act_dt, r);
			}
			if (isNull(r.end_act_dt())) {
				bulkSet(ActBulkSet_end_act_dt, r);
			}
			if (isNull(r.act_usr_cd())) {
				bulkSet(ActBulkSet_act_usr_cd, r);
			}
			if (isNull(r.act_usr_dpt_cd())) {
				bulkSet(ActBulkSet_act_usr_dpt_cd, r);
			}
			
			if (isNull(r.aprv_dt())) {
				bulkSet(AprvBulkSet_aprv_dt, r);
			}
			if (isNull(r.aprv_rsn())) {
				bulkSet(AprvBulkSet_aprv_rsn, r);
			}
			if (isNull(r.aprv_usr_cd())) {
				bulkSet(AprvBulkSet_aprv_usr_cd, r);
			}
			if (isNull(r.aprv_usr_dpt_cd())) {
				bulkSet(AprvBulkSet_aprv_usr_dpt_cd, r);
			}
			if (Cnd_ope_INS.isSelected()) {
				if (isNull(r.mfg_sts_typ())) {
					bulkSet(UnschdBulkSet_mfg_sts_typ, r);
				}
				if (isNull(r.st_act_dt())) {
					bulkSet(UnschdBulkSet_st_act_dt, r);
				}
				if (isNull(r.end_act_dt())) {
					bulkSet(UnschdBulkSet_end_act_dt, r);
				}
				if (isNull(r.unschd_master_dt())) {
					bulkSet(UnschdBulkSet_master_dt, r);
				}
				if (isNull(r.act_usr_cd())) {
					bulkSet(UnschdBulkSet_act_usr_cd, r);
				}
				if (isNull(r.act_usr_dpt_cd())) {
					bulkSet(UnschdBulkSet_act_usr_dpt_cd, r);
				}
			}
		}
	}

	@Override
	public void doRslt_check_NC(MCEventInfo info) {
		super.doRslt_check_NC(info);
		RsltR r = getRsltL().get(info.getEventIndex());
		
		if (r.check()) {
			if (Cnd_ope_INS.isSelected()) {
				bulkSet(UnschdBulkSet_mfg_sts_typ, r);
				bulkSet(UnschdBulkSet_st_act_dt, r);
				bulkSet(UnschdBulkSet_end_act_dt, r);
				bulkSet(UnschdBulkSet_master_dt, r);
				bulkSet(UnschdBulkSet_act_usr_dpt_cd, r);
				bulkSet(UnschdBulkSet_act_usr_cd, r);
			}
			else {
				bulkSet(ActBulkSet_mfg_sts_typ, r);
				bulkSet(ActBulkSet_st_act_dt, r);
				bulkSet(ActBulkSet_end_act_dt, r);
				bulkSet(ActBulkSet_act_usr_dpt_cd, r);
				bulkSet(ActBulkSet_act_usr_cd, r);
				
				bulkSet(AprvBulkSet_aprv_dt, r);
				bulkSet(AprvBulkSet_aprv_rsn, r);
				bulkSet(AprvBulkSet_aprv_usr_cd, r);
				bulkSet(AprvBulkSet_aprv_usr_dpt_cd, r);
			
				MCList<RsltYieldByProdR> yL = _yieldByProdMap.get(r.peg_no());
				if (isNull(yL) || !Cnd_ope_UPD.isSelected()) {
					return;
				}
				for (RsltYieldByProdR yR : yL) {
					if (yR.isStatusDelete()) {
						continue;
					}
					// 非表示の行の場合があるため、setValueではなくコンテナに直接値を設定する
					if (isNull(yR.act_dt())) {
						yR.act_dt(getToday());
						yR.setStatus(MCRow.Status.MODIFY);
					}
					if (isNull(yR.ac_dt())) {
						yR.ac_dt(getToday());
						yR.setStatus(MCRow.Status.MODIFY);
					}
					// 出来高数量の入力がない場合は、基準単位出来高予定数量から単位変換した数量を設定する
					if (isNull(yR.trd_unit_yield_act_qty())) {
						yR.trd_unit_yield_act_qty(rvrsBaseUnitConv(yR.base_unit_yield_schd_qty(), yR.conv_base_qty(),
								yR.conv_qty(), yR.trd_unit_dec_place(), yR.trd_unit_conv_rnd_typ()));
						// 出来高数量の換算に失敗していないなら、基準単位出来高予定数量から設定する
						if (!isNull(yR.trd_unit_yield_act_qty())) {
							yR.base_unit_yield_act_qty(yR.base_unit_yield_schd_qty());
						}
						yR.setStatus(MCRow.Status.MODIFY);
					}
				}
			}
		}
	}
	
	@Override
	public void doActBulkSet_async_flg_NC(MCEventInfo info) {
		super.doActBulkSet_async_flg_NC(info);
		
		setActImmedPrntFlgMode();
	}
	
	@Override
	public void doUnschdBulkSet_async_flg_NC(MCEventInfo info) {
		super.doUnschdBulkSet_async_flg_NC(info);
		
		setActImmedPrntFlgMode();
	}
	
	
		protected void doRslt_unschd_itm_cd_NC(MCEventInfo info) {
			setUnschdItmCd(info);
		}
		
		protected void setUnschdItmCd(MCEventInfo info) {
			RsltR rsltR = getRsltL().get(info.getEventIndex());
			if (!isNull(info.getNewValue())) {
				rsltR.unschd_itm_p().itm_cd((String)info.getNewValue());
				setValueEx(columnRslt_unschd_itm_cd, info.getEventIndex(), (String)info.getNewValue());
			}
			else {
				rsltR.unschd_itm_p().itm_cd(null);
				setValueEx(columnRslt_unschd_itm_cd, info.getEventIndex(), null);
				// 品目CDがクリアされたとき、出来高数量もクリアする
				rsltR.unschd_trd_unit_yield_act_qty(null);
			}
			MCList<RsltYieldByProdR> yieldL = getRsltYieldByProdL();
			// 出来高行がなければ行追加
			if (yieldL.isEmpty()) {
				insertRowNoFocus(RsltYieldByProdTable);
			}
			// 実績行の情報を出来高行へコピー
			for (RsltYieldByProdR yieldR : yieldL){
				if (isNull(rsltR.unschd_itm_cd())) {
					rsltInfoCrearToYield(yieldR);
				}
				else {
					rsltInfoCopyToYield(rsltR, yieldR);
				}
			}
			
			// Mapに追加
			_yieldByProdMap.put(rsltR.peg_no(), yieldL.subList(RsltYieldByProdR.$hdr_peg_no, rsltR.peg_no()));
			
			setBtnRsltYieldByProdUnschdMode();
		}
		
		protected void doRslt_unschd_itm_sub1_NC(MCEventInfo info) {
			setUnschdItmSub1(info);
		}
		
		protected void setUnschdItmSub1(MCEventInfo info) {
			RsltR rsltR = getRsltL().get(info.getEventIndex());
			if (!isNull(info.getNewValue())) {
				rsltR.unschd_itm_p().itm_sub1((String)info.getNewValue());
				setValueEx(columnRslt_unschd_itm_sub1, info.getEventIndex(), (String)info.getNewValue());
			}
			else {
				rsltR.unschd_itm_p().itm_sub1(null);
				setValueEx(columnRslt_unschd_itm_sub1, info.getEventIndex(), null);
				// 品目枝番１がクリアされたとき、出来高数量もクリアする
				rsltR.unschd_trd_unit_yield_act_qty(null);
			}
			MCList<RsltYieldByProdR> yieldL = getRsltYieldByProdL();
			// 実績行の情報を出来高行へコピー
			for (RsltYieldByProdR yieldR : yieldL){
				if (isNull(rsltR.unschd_itm_sub1())) {
					rsltInfoCrearToYield(yieldR);
				}
				else {
					rsltInfoCopyToYield(rsltR, yieldR);
				}
			}
			
			// Mapに追加
			_yieldByProdMap.put(rsltR.peg_no(), yieldL.subList(RsltYieldByProdR.$hdr_peg_no, rsltR.peg_no()));
			
			setBtnRsltYieldByProdUnschdMode();
		}

		protected void doRslt_unschd_itm_sub2_NC(MCEventInfo info) {
			setUnschdItmSub2(info);
		}
		
		protected void setUnschdItmSub2(MCEventInfo info) {
			RsltR rsltR = getRsltL().get(info.getEventIndex());
			if (!isNull(info.getNewValue())) {
				rsltR.unschd_itm_p().itm_sub2((String)info.getNewValue());
				setValueEx(columnRslt_unschd_itm_sub2, info.getEventIndex(), (String)info.getNewValue());
			}
			else {
				rsltR.unschd_itm_p().itm_sub2(null);
				setValueEx(columnRslt_unschd_itm_sub2, info.getEventIndex(), null);
				// 品目枝番１がクリアされたとき、出来高数量もクリアする
				rsltR.unschd_trd_unit_yield_act_qty(null);
			}
			MCList<RsltYieldByProdR> yieldL = getRsltYieldByProdL();
			// 実績行の情報を出来高行へコピー
			for (RsltYieldByProdR yieldR : yieldL){
				if (isNull(rsltR.unschd_itm_sub2())) {
					rsltInfoCrearToYield(yieldR);
				}
				else {
					rsltInfoCopyToYield(rsltR, yieldR);
				}
			}
			
			// Mapに追加
			_yieldByProdMap.put(rsltR.peg_no(), yieldL.subList(RsltYieldByProdR.$hdr_peg_no, rsltR.peg_no()));
			
			setBtnRsltYieldByProdUnschdMode();
		}

		protected void doRslt_unschd_itm_sub3_NC(MCEventInfo info) {
			setUnschdItmSub3(info);
		}

		protected void setUnschdItmSub3(MCEventInfo info) {
			RsltR rsltR = getRsltL().get(info.getEventIndex());
			if (!isNull(info.getNewValue())) {
				rsltR.unschd_itm_p().itm_sub3((String)info.getNewValue());
				setValueEx(columnRslt_unschd_itm_sub3, info.getEventIndex(), (String)info.getNewValue());
			}
			else {
				rsltR.unschd_itm_p().itm_sub3(null);
				setValueEx(columnRslt_unschd_itm_sub3, info.getEventIndex(), null);
				// 品目枝番１がクリアされたとき、出来高数量もクリアする
				rsltR.unschd_trd_unit_yield_act_qty(null);
			}
			MCList<RsltYieldByProdR> yieldL = getRsltYieldByProdL();
			// 実績行の情報を出来高行へコピー
			for (RsltYieldByProdR yieldR : yieldL){
				if (isNull(rsltR.unschd_itm_sub3())) {
					rsltInfoCrearToYield(yieldR);
				}
				else {
					rsltInfoCopyToYield(rsltR, yieldR);
				}
			}
			
			// Mapに追加
			_yieldByProdMap.put(rsltR.peg_no(), yieldL.subList(RsltYieldByProdR.$hdr_peg_no, rsltR.peg_no()));
			
			setBtnRsltYieldByProdUnschdMode();
		}
	
	protected void setActImmedPrntFlgMode() {
		if (Cnd_ope_INS.isSelected()) {
			if (getUnschdBulkSetR().async_flg()) {
				setValueEx(UnschdBulkSet_act_immed_prnt_flg, false);
				UnschdBulkSet_act_immed_prnt_flg.setMode(MCMode.READ_ONLY);
			}
			else {
				setDefaultMode(UnschdBulkSet_act_immed_prnt_flg);
			}
		}
		else {
			if (getActBulkSetR().async_flg()) {
				setValueEx(ActBulkSet_act_immed_prnt_flg, false);
				ActBulkSet_act_immed_prnt_flg.setMode(MCMode.READ_ONLY);
			}
			else {
				setDefaultMode(ActBulkSet_act_immed_prnt_flg);
			}
		}
	}

	protected void bulkSet(MCBeans b) {
		for (RsltR r : RsltTable.getViewRows()) {
			if (r.check()) { 
				bulkSet(b, r);
			}
		}
	}

	protected void bulkSet(MCBeans b, RsltR r) {
		if (b == ActBulkSet_mfg_sts_typ
				&& isEditable(columnRslt_mfg_sts_typ, r.getGUIIndex())) {
			setValueEx(columnRslt_mfg_sts_typ, r.getGUIIndex(), getActBulkSetR().mfg_sts_typ());
		}
		if (b == ActBulkSet_st_act_dt
				&& isEditable(columnRslt_st_act_dt, r.getGUIIndex()) && isNull(r.st_act_dt())) {
			setValueEx(columnRslt_st_act_dt, r.getGUIIndex(), getActBulkSetR().st_act_dt());
		}
		if (b == ActBulkSet_end_act_dt
				&& isEditable(columnRslt_end_act_dt, r.getGUIIndex()) && isNull(r.end_act_dt())) {
			setValueEx(columnRslt_end_act_dt, r.getGUIIndex(), getActBulkSetR().end_act_dt());
		}
		
		if (b == ActBulkSet_act_usr_cd
				&& isEditable(columnRslt_act_usr_cd, r.getGUIIndex()) && isNull(r.old_act_usr_cd())) {
			r.act_usr_cd(getActBulkSetR().act_usr_cd());
			r.act_usr_nm(getActBulkSetR().act_usr_nm());
		}
		if (b == ActBulkSet_act_usr_dpt_cd
				&& isEditable(columnRslt_act_usr_dpt_cd, r.getGUIIndex()) && isNull(r.old_act_usr_dpt_cd())) {
			r.act_usr_dpt_cd(getActBulkSetR().act_usr_dpt_cd());
			r.act_usr_dpt_nm(getActBulkSetR().act_usr_dpt_nm());
		}
		
		if (Cnd_ope_INS.isSelected()) {
			if (b == UnschdBulkSet_mfg_sts_typ
					&& isEditable(columnRslt_mfg_sts_typ, r.getGUIIndex())) {
				setValueEx(columnRslt_mfg_sts_typ, r.getGUIIndex(), getUnschdBulkSetR().mfg_sts_typ());
			}
			if (b == UnschdBulkSet_st_act_dt
					&& isEditable(columnRslt_st_act_dt, r.getGUIIndex())
					&& isNull(r.mfg_act_no())) {
				setValueEx(columnRslt_st_act_dt, r.getGUIIndex(), getUnschdBulkSetR().st_act_dt());
			}
			if (b == UnschdBulkSet_end_act_dt
					&& isEditable(columnRslt_end_act_dt, r.getGUIIndex())) {
				setValueEx(columnRslt_end_act_dt, r.getGUIIndex(), getUnschdBulkSetR().end_act_dt());
			}
			if (b == UnschdBulkSet_master_dt
					&& isEditable(columnRslt_unschd_master_dt, r.getGUIIndex())) {
				setValueEx(columnRslt_unschd_master_dt, r.getGUIIndex(), getUnschdBulkSetR().master_dt());
			}
			if (b == UnschdBulkSet_act_usr_cd
					&& isEditable(columnRslt_act_usr_cd, r.getGUIIndex())) {
				r.act_usr_cd(getUnschdBulkSetR().act_usr_cd());
				r.act_usr_nm(getUnschdBulkSetR().act_usr_nm());
			}
			if (b == UnschdBulkSet_act_usr_dpt_cd
					&& isEditable(columnRslt_act_usr_dpt_cd, r.getGUIIndex())) {
				r.act_usr_dpt_cd(getUnschdBulkSetR().act_usr_dpt_cd());
				r.act_usr_dpt_nm(getUnschdBulkSetR().act_usr_dpt_nm());
			}
		}
		if (Cnd_ope_APRV.isSelected()) {
			if (b == AprvBulkSet_aprv_dt) {
				r.aprv_dt(getAprvBulkSetR().aprv_dt());
			}
			if (b == AprvBulkSet_aprv_usr_cd) {
				r.aprv_usr_cd(getAprvBulkSetR().aprv_usr_cd());
				r.aprv_usr_nm(getAprvBulkSetR().aprv_usr_nm());
			}
			if (b == AprvBulkSet_aprv_usr_dpt_cd) {
				r.aprv_usr_dpt_cd(getAprvBulkSetR().aprv_usr_dpt_cd());
				r.aprv_usr_dpt_nm(getAprvBulkSetR().aprv_usr_dpt_nm());
			}
			if (b == AprvBulkSet_aprv_rsn) {
				setValueEx(columnRslt_aprv_rsn, r.getGUIIndex(), getAprvBulkSetR().aprv_rsn());
			}
		}
		else if (Cnd_ope_APRV_DEL.isSelected()) {
			if (b == AprvBulkSet_aprv_rsn) {
				setValueEx(columnRslt_aprv_rsn, r.getGUIIndex(), getAprvBulkSetR().aprv_rsn());
			}
		}
	}
	
	@Override
	public void doActBulkSet_mfg_sts_typ_LC(MCEventInfo info) {
		super.doActBulkSet_mfg_sts_typ_LC(info);
		
		bulkSet(ActBulkSet_mfg_sts_typ);
		
		if (MSC_MFG_STS_TYP.isSTT(getActBulkSetR().mfg_sts_typ())) {
			if (isNull(getActBulkSetR().st_act_dt())) {
				setValueEx(ActBulkSet_st_act_dt, getToday());
			}
		}
		if (MSC_MFG_STS_TYP.isCMPL(getActBulkSetR().mfg_sts_typ())) {
			if (isNull(getActBulkSetR().st_act_dt())) {
				setValueEx(ActBulkSet_st_act_dt, getToday());
			}
			if (isNull(getActBulkSetR().end_act_dt())) {
				setValueEx(ActBulkSet_end_act_dt, getToday());
			}
			setValueEx(ActBulkSet_act_immed_prnt_flg, true);
		}
		
		if (!MSC_MFG_STS_TYP.isCMPL(getActBulkSetR().mfg_sts_typ())) {
			setValueEx(ActBulkSet_end_act_dt, null);
			setValueEx(ActBulkSet_act_immed_prnt_flg, false);
		}
	}
	@Override
	public void doUnschdBulkSet_mfg_sts_typ_LC(MCEventInfo info) {
		super.doUnschdBulkSet_mfg_sts_typ_LC(info);
		
		bulkSet(UnschdBulkSet_mfg_sts_typ);
		
		if (MSC_MFG_STS_TYP.isSTT(getUnschdBulkSetR().mfg_sts_typ())) {
			if (isNull(getUnschdBulkSetR().st_act_dt())) {
				setValueEx(UnschdBulkSet_st_act_dt, getToday());
				setValueEx(UnschdBulkSet_master_dt, getToday());
			}
		}
		if (MSC_MFG_STS_TYP.isCMPL(getUnschdBulkSetR().mfg_sts_typ())) {
			if (isNull(getUnschdBulkSetR().st_act_dt())) {
				setValueEx(UnschdBulkSet_st_act_dt, getToday());
				setValueEx(UnschdBulkSet_master_dt, getToday());
			}
			if (isNull(getUnschdBulkSetR().end_act_dt())) {
				setValueEx(UnschdBulkSet_end_act_dt, getToday());
			}
			setValueEx(UnschdBulkSet_act_immed_prnt_flg, true);
		}
		
		if (!MSC_MFG_STS_TYP.isCMPL(getUnschdBulkSetR().mfg_sts_typ())) {
			setValueEx(UnschdBulkSet_end_act_dt, null);
			setValueEx(UnschdBulkSet_act_immed_prnt_flg, false);
		}
	}
	
	@Override
	public void doUnschdBulkSet_st_act_dt_LC(MCEventInfo info) {
		super.doUnschdBulkSet_st_act_dt_LC(info);
		bulkSet(UnschdBulkSet_st_act_dt);
	}

	@Override
	public void doUnschdBulkSet_end_act_dt_LC(MCEventInfo info) {
		super.doUnschdBulkSet_end_act_dt_LC(info);
		bulkSet(UnschdBulkSet_end_act_dt);
	}
	
	@Override
	public void doUnschdBulkSet_master_dt_LC(MCEventInfo info) {
		super.doUnschdBulkSet_master_dt_LC(info);
		bulkSet(UnschdBulkSet_master_dt);
	}

	protected void doUnschdBulkSet_act_usr_cd_LC(MCEventInfo info) {
		bulkSet(UnschdBulkSet_act_usr_cd);
	}

	protected void doUnschdBulkSet_act_usr_dpt_cd_LC(MCEventInfo info) {
		bulkSet(UnschdBulkSet_act_usr_dpt_cd);
	}
	
	protected void doRslt_unschd_itm_cd_LC(MCEventInfo info) {
		setUnschdItmCd(info);
	}
	
	protected void doRslt_unschd_itm_sub1_LC(MCEventInfo info) {
		setUnschdItmSub1(info);
	}
	
	protected void doRslt_unschd_itm_sub2_LC(MCEventInfo info) {
		setUnschdItmSub2(info);
	}
	
	protected void doRslt_unschd_itm_sub3_LC(MCEventInfo info) {
		setUnschdItmSub3(info);
	}
	
	protected void rsltInfoCrearToYield(RsltYieldByProdR yieldR) {
		yieldR.unschd_itm_cd(null);
		yieldR.unschd_itm_sub1(null);
		yieldR.unschd_itm_sub2(null);
		yieldR.unschd_itm_sub3(null);
		yieldR.unschd_itm_nm(null);
		yieldR.unschd_lot_no(null);
		yieldR.unschd_sublot_no(null);
		yieldR.unschd_lot_mng_typ(null);
		yieldR.unschd_lot_no_typ(null);
		yieldR.unschd_lot_no_ptn_cd(null);
		yieldR.unschd_sublot_mng_typ(null);
		yieldR.unschd_sublot_no_typ(null);
		yieldR.unschd_sublot_no_ptn_cd(null);
		yieldR.unschd_same_lot_flg(false);
		yieldR.unschd_trd_unit_cd(null);
		yieldR.unschd_trd_unit_nm(null);
		yieldR.unschd_trd_unit_dec_place(null);
		yieldR.unschd_trd_unit_conv_rnd_typ(null);
		yieldR.unschd_conv_base_qty(null);
		yieldR.unschd_conv_qty(null);
		yieldR.unschd_trd_unit_yield_act_qty(null);
		yieldR.unschd_base_unit_cd(null);
		yieldR.unschd_base_unit_nm(null);
		yieldR.unschd_base_unit_yield_act_qty(null);
		yieldR.unschd_base_unit_dec_place(null);
		yieldR.unschd_base_unit_conv_rnd_typ(null);
		yieldR.unschd_strg_loc_cd(null);
		yieldR.unschd_strg_loc_nm(null);
		yieldR.unschd_strg_str_ln_tgt_flg(false);
		yieldR.unschd_strg_str_ln_cd(null);
		yieldR.unschd_strg_str_ln_nm(null);
		yieldR.unschd_strg_str_ln_cd_none_flg(false);
	}
	
	protected void rsltInfoCopyToYield(RsltR rsltR, RsltYieldByProdR yieldR) {
		MCList<RsltYieldByProdR> yL = _yieldByProdMap.get(rsltR.peg_no());
		
		// 実績：出来高が１：１の場合はmltYieldFlg=false
		boolean mltYieldFlg = false;
		if (!isNull(yL) && yL.size() > 1) {
			mltYieldFlg = true;
		}
		// 単位CDが変更された場合
		boolean chngUnitCdFlg = false;
		if (isNull(yieldR.unschd_yield_typ())) {
			yieldR.unschd_yield_typ(MAC_YIELD_TYP.GOOD.value());
			yieldR.unschd_yield_typ_nm(MAC_YIELD_TYP.GOOD.name());
		}
		yieldR.unschd_itm_cd(rsltR.unschd_itm_cd());
		yieldR.unschd_itm_sub1(rsltR.unschd_itm_sub1());
		yieldR.unschd_itm_sub2(rsltR.unschd_itm_sub2());
		yieldR.unschd_itm_sub3(rsltR.unschd_itm_sub3());
		yieldR.unschd_itm_nm(rsltR.unschd_itm_nm());
		if (isNullOrNullVal(yieldR.unschd_lot_no())) {
			yieldR.unschd_lot_no(rsltR.unschd_lot_no());
		}
		if (isNullOr(yieldR.unschd_sublot_no())) {
			yieldR.unschd_sublot_no(rsltR.unschd_sublot_no());
		}
		yieldR.unschd_lot_mng_typ(rsltR.unschd_lot_mng_typ());
		yieldR.unschd_lot_no_typ(rsltR.unschd_lot_no_typ());
		yieldR.unschd_lot_no_ptn_cd(rsltR.unschd_lot_no_ptn_cd());
		yieldR.unschd_sublot_mng_typ(rsltR.unschd_sublot_mng_typ());
		yieldR.unschd_sublot_no_typ(rsltR.unschd_sublot_no_typ());
		yieldR.unschd_sublot_no_ptn_cd(rsltR.unschd_sublot_no_ptn_cd());
		if (isNull(yieldR.unschd_trd_unit_cd())) {
			if (isNull(rsltR.unschd_trd_unit_cd())) {
				yieldR.unschd_trd_unit_cd(rsltR.unschd_base_unit_cd());
				yieldR.unschd_trd_unit_nm(rsltR.unschd_base_unit_nm());
				yieldR.unschd_trd_unit_dec_place(rsltR.unschd_base_unit_dec_place());
				yieldR.unschd_trd_unit_conv_rnd_typ(rsltR.unschd_base_unit_conv_rnd_typ());
				yieldR.unschd_conv_base_qty(rsltR.unschd_conv_base_qty());
				yieldR.unschd_conv_qty(rsltR.unschd_conv_qty());
			}
			else {
				yieldR.unschd_trd_unit_cd(rsltR.unschd_trd_unit_cd());
				yieldR.unschd_trd_unit_nm(rsltR.unschd_trd_unit_nm());
				yieldR.unschd_trd_unit_dec_place(rsltR.unschd_trd_unit_dec_place());
				yieldR.unschd_trd_unit_conv_rnd_typ(rsltR.unschd_trd_unit_rnd_typ());
				yieldR.unschd_conv_base_qty(rsltR.unschd_conv_base_qty());
				yieldR.unschd_conv_qty(rsltR.unschd_conv_qty());
			}
		}
		else if (!isSame(rsltR.unschd_base_unit_cd(), yieldR.unschd_base_unit_cd())) {
			// 基準単位が異なる場合
			yieldR.unschd_trd_unit_cd(rsltR.unschd_base_unit_cd());
			yieldR.unschd_trd_unit_nm(rsltR.unschd_base_unit_nm());
			yieldR.unschd_trd_unit_dec_place(rsltR.unschd_base_unit_dec_place());
			yieldR.unschd_trd_unit_conv_rnd_typ(rsltR.unschd_base_unit_conv_rnd_typ());
			yieldR.unschd_conv_base_qty(rsltR.unschd_conv_base_qty());
			yieldR.unschd_conv_qty(rsltR.unschd_conv_qty());

			// 基準単位が変更となる場合にflgをオンに設定する
			chngUnitCdFlg = true;
		}
		if (!mltYieldFlg) {
			yieldR.unschd_trd_unit_yield_act_qty(rsltR.unschd_trd_unit_yield_act_qty());
		}
		else {
			// 実績：出来高が１：nの場合、計画外製造実績明細の単位CDには基準単位を設定する
			rsltR.unschd_trd_unit_cd(rsltR.unschd_base_unit_cd());
			rsltR.unschd_trd_unit_nm(rsltR.unschd_base_unit_nm());
			if (chngUnitCdFlg) {
				rsltR.unschd_trd_unit_yield_act_qty(null);
			}
			else {
				rsltR.unschd_trd_unit_yield_act_qty(yL.sum(RsltYieldByProdR.$unschd_base_unit_yield_act_qty));
			}
		}

		if (chngUnitCdFlg) {
			// 単位CDが変更となる場合は出来高数量をクリアする
			yieldR.unschd_trd_unit_yield_act_qty(null);
			yieldR.unschd_base_unit_yield_act_qty(null);
		}
		yieldR.unschd_base_unit_cd(rsltR.unschd_base_unit_cd());
		yieldR.unschd_base_unit_nm(rsltR.unschd_base_unit_nm());
		yieldR.unschd_base_unit_dec_place(rsltR.unschd_base_unit_dec_place());
		yieldR.unschd_base_unit_conv_rnd_typ(rsltR.unschd_base_unit_conv_rnd_typ());
		if (isNull(yieldR.unschd_act_dt())) {
			yieldR.unschd_act_dt(rsltR.end_act_dt());
			yieldR.unschd_act_hm(rsltR.end_act_hm());
		}
		if (isNull(yieldR.unschd_ac_dt())) {
			yieldR.unschd_ac_dt(rsltR.end_ac_dt());
		}
		if (isNull(yieldR.unschd_gd_cd())) {
			yieldR.unschd_gd_cd(getDefaultFeedStkGd().gd_cd());
			yieldR.unschd_gd_nm(getDefaultFeedStkGd().gd_nm());
		}
		if (!mltYieldFlg && isNull(yieldR.unschd_strg_loc_cd())) {
			yieldR.unschd_strg_loc_cd(rsltR.unschd_strg_loc_cd());
			yieldR.unschd_strg_loc_nm(rsltR.unschd_strg_loc_nm());
			yieldR.unschd_strg_str_ln_tgt_flg(rsltR.unschd_strg_str_ln_tgt_flg());
			yieldR.unschd_strg_str_ln_cd(rsltR.unschd_strg_str_ln_cd());
			yieldR.unschd_strg_str_ln_nm(rsltR.unschd_strg_str_ln_nm());
			yieldR.unschd_strg_str_ln_cd_none_flg(rsltR.unschd_strg_str_ln_cd_none_flg());
		}
		yieldR.hdr_peg_no(rsltR.peg_no());
		yieldR.disp_seq(createNewDispSeq(rsltR.peg_no()));
	}

	@Override
	public void doActBulkSet_st_act_dt_LC(MCEventInfo info) {
		super.doActBulkSet_st_act_dt_LC(info);
		bulkSet(ActBulkSet_st_act_dt);
	}

	@Override
	public void doActBulkSet_end_act_dt_LC(MCEventInfo info) {
		super.doActBulkSet_end_act_dt_LC(info);
		bulkSet(ActBulkSet_end_act_dt);
	}

	protected void doActBulkSet_act_usr_cd_LC(MCEventInfo info) {
		bulkSet(ActBulkSet_act_usr_cd);
	}

	protected void doActBulkSet_act_usr_dpt_cd_LC(MCEventInfo info) {
		bulkSet(ActBulkSet_act_usr_dpt_cd);
	}
	
	@Override
	public void doAprvBulkSet_aprv_dt_LC(MCEventInfo info) {
		super.doAprvBulkSet_aprv_dt_LC(info);
		bulkSet(AprvBulkSet_aprv_dt);
	}

	protected void doAprvBulkSet_aprv_usr_cd_LC(MCEventInfo info) {
		bulkSet(AprvBulkSet_aprv_usr_cd);
	}

	protected void doAprvBulkSet_aprv_usr_dpt_cd_LC(MCEventInfo info) {
		bulkSet(AprvBulkSet_aprv_usr_dpt_cd);
	}
	
	protected void doAprvBulkSet_aprv_rsn_LC(MCEventInfo info) {
		bulkSet(AprvBulkSet_aprv_rsn);
	}
	
	@Override
	public void doRslt_mfg_sts_typ_LC(MCEventInfo info) {
		super.doRslt_mfg_sts_typ_LC(info);
		RsltR r = getRsltL().get(info.getEventIndex());
		if (!MSC_MFG_STS_TYP.isCMPL(r.mfg_sts_typ())) {
			setValueEx(columnRslt_end_act_dt, r.getGUIIndex(), null);
			setValueEx(columnRslt_end_ac_dt, r.getGUIIndex(), null);
		}
		else {
			if (Cnd_ope_INS.isSelected()) {
				setValueEx(columnRslt_end_act_dt, r.getGUIIndex(), getUnschdBulkSetR().end_act_dt());
			}
			else {
				setValueEx(columnRslt_end_act_dt, r.getGUIIndex(), getActBulkSetR().end_act_dt());
			}
		}
	}

	@Override
	public void doRsltYieldByProd_yield_typ_LC(MCEventInfo info) {
		super.doRsltYieldByProd_yield_typ_LC(info);
		RsltYieldByProdR yR = getRsltYieldByProdL().get(info.getEventIndex());
		if (MAC_YIELD_TYP.isGOOD(yR.yield_typ())) {
			setValueEx(columnRsltYieldByProd_quality_typ, yR.getGUIIndex(), MAC_QUALITY_TYP.GOOD.value());
		}
		else if (MAC_YIELD_TYP.isDFCT(yR.yield_typ())) {
			setValueEx(columnRsltYieldByProd_quality_typ, yR.getGUIIndex(), MAC_QUALITY_TYP.DFCT_OPER.value());
		}
		else {
			setValueEx(columnRsltYieldByProd_quality_typ, yR.getGUIIndex(), null);
		}
	}

	protected void doRslt_end_act_dt_LC(MCEventInfo info) {
		RsltR rsltR = getRsltL().get(info.getEventIndex());
		if (Cnd_srch_mode_OPER.isSelected()) {
			if (isNull(rsltR.end_act_dt())) {
				rsltR.not_cmpl_flg(false);
			}
			else {
				setRsltNotCmplFlg(rsltR);
			}
		}
		MCList<RsltYieldByProdR> yL = _yieldByProdMap.get(rsltR.peg_no());
		if (isNull(yL)) {
			return;
		}
		for (RsltYieldByProdR yR : yL) {
			// 画面上非表示の可能性がありsetValueできないためコンテナに直接値を設定している
			if (isNull(rsltR.end_act_dt())) {
				yR.act_dt(null);
				yR.unschd_act_dt(null);
				yR.act_hm(null);
				yR.unschd_act_hm(null);
			} else {
				if (isNull(rsltR.end_act_hm())) {
					yR.act_dt(rsltR.end_act_dt());
					yR.unschd_act_dt(rsltR.end_act_dt());
					yR.act_hm(null);
					yR.unschd_act_hm(null);
				} else {
					yR.act_dt(rsltR.end_act_dt().modTime(rsltR.end_act_hm()));
					yR.unschd_act_dt(rsltR.end_act_dt().modTime(rsltR.end_act_hm()));
					yR.act_hm(rsltR.end_act_hm());
					yR.unschd_act_hm(rsltR.end_act_hm());
				}
			}
			yR.setStatus(MCRow.Status.MODIFY);
		}
	}
	
	protected void doRslt_end_act_hm_LC(MCEventInfo info) {
		RsltR rsltR = getRsltL().get(info.getEventIndex());
		MCList<RsltYieldByProdR> yL = _yieldByProdMap.get(rsltR.peg_no());
		if (isNull(yL)) {
			return;
		}
		for (RsltYieldByProdR yR : yL) {
			// 画面上非表示の可能性がありsetValueできないためコンテナに直接値を設定している
			yR.act_hm(rsltR.end_act_hm());
			yR.unschd_act_hm(rsltR.end_act_hm());
			if (isNull(rsltR.end_act_dt())) {
				yR.act_dt(null);
				yR.unschd_act_dt(null);
			} else {
				if (isNull(rsltR.end_act_hm())) {
					yR.act_dt(rsltR.end_act_dt());
					yR.unschd_act_dt(rsltR.end_act_dt());
					yR.act_hm(null);
					yR.unschd_act_hm(null);
				} else {
					yR.act_dt(rsltR.end_act_dt().modTime(rsltR.end_act_hm()));
					yR.unschd_act_dt(rsltR.end_act_dt().modTime(rsltR.end_act_hm()));
					yR.act_hm(rsltR.end_act_hm());
					yR.unschd_act_hm(rsltR.end_act_hm());
				}
			}
			yR.setStatus(MCRow.Status.MODIFY);
		}
	}
	
	protected void doRslt_end_ac_dt_LC(MCEventInfo info) {
		RsltR rsltR = getRsltL().get(info.getEventIndex());
		MCList<RsltYieldByProdR> yL = _yieldByProdMap.get(rsltR.peg_no());
		if (isNull(yL)) {
			return;
		}
		for (RsltYieldByProdR yR : yL) {
			// 画面上非表示の可能性がありsetValueできないためコンテナに直接値を設定している
			yR.ac_dt(rsltR.end_ac_dt());
			yR.unschd_ac_dt(rsltR.end_ac_dt());
			if (isNull(rsltR.end_act_dt())) {
				yR.act_dt(null);
				yR.unschd_act_dt(null);
			} else {
				if (isNull(rsltR.end_act_hm())) {
					yR.act_dt(rsltR.end_act_dt());
					yR.unschd_act_dt(rsltR.end_act_dt());
					yR.act_hm(null);
					yR.unschd_act_hm(null);
				} else {
					yR.act_dt(rsltR.end_act_dt().modTime(rsltR.end_act_hm()));
					yR.unschd_act_dt(rsltR.end_act_dt().modTime(rsltR.end_act_hm()));
					yR.act_hm(rsltR.end_act_hm());
					yR.unschd_act_hm(rsltR.end_act_hm());
				}
			}
			yR.setStatus(MCRow.Status.MODIFY);
		}
	}
	
	protected void doRslt_base_unit_st_act_qty_LC(MCEventInfo info) {
		RsltR rsltR = getRsltL().get(info.getEventIndex());
		MCList<RsltYieldByProdR> yL = _yieldByProdMap.get(rsltR.peg_no());
		if (isNull(yL)) {
			return;
		}
		for (RsltYieldByProdR yR : yL) {
			if (!isNull(yR.trd_unit_yield_act_qty())) {
				yR.clear(RsltYieldByProdR.$trd_unit_yield_act_qty);
				yR.clear(RsltYieldByProdR.$base_unit_yield_act_qty);
				yR.setStatus(MCRow.Status.MODIFY);
			}
		}
	}

	protected void doRslt_st_act_dt_LC(MCEventInfo info) {
		if (Cnd_ope_INS.isSelected()) {
			RsltR rsltR = getRsltL().get(info.getEventIndex());
			if (isNull(rsltR.st_act_dt())) {
				setValueEx(columnRslt_unschd_mfg_loc_cd, rsltR.getGUIIndex(), null);
				setValueEx(columnRslt_unschd_strg_loc_cd, rsltR.getGUIIndex(), null);
			} else {
				if (isEditable(columnRslt_end_act_dt, rsltR.getGUIIndex()) && isNull(rsltR.end_act_dt())) {
					setValueEx(columnRslt_end_act_dt, rsltR.getGUIIndex(), rsltR.st_act_dt());
				}
				if (isNull(rsltR.unschd_master_dt())) {
					setValueEx(columnRslt_unschd_master_dt, rsltR.getGUIIndex(), rsltR.st_act_dt());
				}
			}
		}
	}
	
	@Override
	public void doRslt_unschd_master_dt_LC(MCEventInfo info) {
		if (Cnd_ope_INS.isSelected()) {
			RsltR rsltR = getRsltL().get(info.getEventIndex());
			if (isNull(rsltR.unschd_master_dt())) {
				setValueEx(columnRslt_unschd_oper_ptn, info.getEventIndex(), null);
			}
		}
		
	}
	
	@Override
	public void doRslt_unschd_mfg_loc_cd_LC(MCEventInfo info) {
		if (Cnd_ope_INS.isSelected()) {
			RsltR rsltR = getRsltL().get(info.getEventIndex());
			if (isNull(rsltR.unschd_mfg_loc_cd())) {
				setValueEx(columnRslt_unschd_bom_ptn, info.getEventIndex(), null);
				setValueEx(columnRslt_unschd_strg_loc_cd, info.getEventIndex(), null);
			}
		}
	}
	
	@Override
	public void doRslt_unschd_strg_loc_cd_LC(MCEventInfo info) {
		if (Cnd_ope_INS.isSelected()) {
			RsltR rsltR = getRsltL().get(info.getEventIndex());
			MCList<RsltYieldByProdR> yL = _yieldByProdMap.get(rsltR.peg_no());
			if (isNull(yL)) {
				return;
			}
			if (!isYieldMultiRow(rsltR.peg_no())) {
				// 出来高表と計画外表が1:1の場合設定
				setValueEx(columnRsltYieldByProd_unschd_strg_loc_cd, yL.get(0).getGUIIndex(), rsltR.unschd_strg_loc_cd());
			}
		}
	}
	
	protected void doRslt_unschd_strg_str_ln_cd_LC(MCEventInfo info) {
		if (Cnd_ope_INS.isSelected()) {
			RsltR rsltR = getRsltL().get(info.getEventIndex());
			MCList<RsltYieldByProdR> yL = _yieldByProdMap.get(rsltR.peg_no());
			if (isNull(yL)) {
				return;
			}
			for (RsltYieldByProdR yR : yL) {
				// 画面上非表示の可能性がありsetValueできないためコンテナに直接値を設定している
				yR.ac_dt(rsltR.end_ac_dt());
			}
			if (!isYieldMultiRow(rsltR.peg_no()) && isSame(rsltR.unschd_strg_loc_cd(), yL.get(0).unschd_strg_loc_cd())) {
				// 出来高表と計画外表が1:1の場合設定
				setValueEx(columnRsltYieldByProd_unschd_strg_str_ln_cd, yL.get(0).getGUIIndex(), rsltR.unschd_strg_str_ln_cd());
			}
		}
	}
	
	protected void doRslt_unschd_strg_str_ln_cd_none_flg_NC(MCEventInfo info) {
		if (Cnd_ope_INS.isSelected()) {
			RsltR rsltR = getRsltL().get(info.getEventIndex());
			MCList<RsltYieldByProdR> yL = _yieldByProdMap.get(rsltR.peg_no());
			if (isNull(yL)) {
				return;
			}
			if (!isYieldMultiRow(rsltR.peg_no())) {
				// 出来高表と計画外表が1:1の場合設定
				setValueEx(columnRsltYieldByProd_unschd_strg_str_ln_cd_none_flg, yL.get(0).getGUIIndex(), rsltR.unschd_strg_str_ln_cd_none_flg());
			}
		}
	}
	
	/**
	 * 実績：出来高が１：１の場合はfalse
	 * @param yL
	 * @return　複数行ある場合は、true
	 */
	protected boolean isYieldMultiRow(MCNumber peg_no) {
		MCList<RsltYieldByProdR> yL = _yieldByProdMap.get(peg_no);
		if (!isNull(yL) && yL.size() > 1) {
			return true;
		}
		return false;
	}
	
	protected void doRslt_unschd_lot_no_LC(MCEventInfo info) {
		if (Cnd_ope_INS.isSelected()) {
			RsltR rsltR = getRsltL().get(info.getEventIndex());
			MCList<RsltYieldByProdR> yL = _yieldByProdMap.get(rsltR.peg_no());
			if (isNull(yL)) {
				return;
			}
			if (!isYieldMultiRow(rsltR.peg_no())) {
				// 出来高表と計画外表が1:1の場合設定
				setValueEx(columnRsltYieldByProd_unschd_lot_no, yL.get(0).getGUIIndex(), rsltR.unschd_lot_no());
			}
		}
	}
	
	protected void doRslt_unschd_sublot_no_LC(MCEventInfo info) {
		if (Cnd_ope_INS.isSelected()) {
			RsltR rsltR = getRsltL().get(info.getEventIndex());
			MCList<RsltYieldByProdR> yL = _yieldByProdMap.get(rsltR.peg_no());
			if (isNull(yL)) {
				return;
			}
			if (!isYieldMultiRow(rsltR.peg_no())) {
				// 出来高表と計画外表が1:1の場合設定
				setValueEx(columnRsltYieldByProd_unschd_sublot_no, yL.get(0).getGUIIndex(), rsltR.unschd_sublot_no());
			}
		}
	}
	
	@Override
	public void doRslt_unschd_trd_unit_cd_LC(MCEventInfo info) {
		if (Cnd_ope_INS.isSelected()) {
			RsltR rsltR = getRsltL().get(info.getEventIndex());
			MCList<RsltYieldByProdR> yL = _yieldByProdMap.get(rsltR.peg_no());
			if (isNull(yL)) {
				return;
			}
			if (!isYieldMultiRow(rsltR.peg_no())) {
				RsltYieldByProdR yieldR = yL.get(0);
				if (isNull(yieldR.unschd_itm_cd()) || isNull(yieldR.unschd_itm_sub1())
						|| isNull(yieldR.unschd_itm_sub2()) || isNull(yieldR.unschd_itm_sub3())){
					return;
				}
				// 出来高表と計画外表が1:1の場合設定
				setValueEx(columnRsltYieldByProd_unschd_trd_unit_cd, yL.get(0).getGUIIndex(), rsltR.unschd_trd_unit_cd());
			}
		}
	}
	
	protected void doRslt_unschd_trd_unit_yield_act_qty_LC(MCEventInfo info) {
		if (Cnd_ope_INS.isSelected()) {
			RsltR rsltR = getRsltL().get(info.getEventIndex());
			MCList<RsltYieldByProdR> yL = _yieldByProdMap.get(rsltR.peg_no());
			if (isNull(yL)) {
				return;
			}
			if (!isYieldMultiRow(rsltR.peg_no())) {
				// 出来高表と計画外表が1:1の場合設定
				setValueEx(columnRsltYieldByProd_unschd_trd_unit_yield_act_qty, yL.get(0).getGUIIndex(), rsltR.unschd_trd_unit_yield_act_qty());
			}
		}
	}
	
	@Override
	public void doRsltYieldByProd_unschd_yield_typ_LC(MCEventInfo info) {
		if (Cnd_ope_INS.isSelected()) {
			RsltYieldByProdR yR = getRsltYieldByProdL().get(info.getEventIndex());
			setValueEx(columnRsltYieldByProd_unschd_yield_rsn_cd, yR.getGUIIndex(), null);
		}
	}
	
	protected void doRsltYieldByProd_unschd_lot_no_LC(MCEventInfo info) {
		if (Cnd_ope_INS.isSelected()) {
			RsltR rsltR = (RsltR) RsltTable.getSelectedMCRow();
			if (!isYieldMultiRow(rsltR.peg_no())) {
				RsltYieldByProdR yR = getRsltYieldByProdL().get(info.getEventIndex());
				setValueEx(columnRslt_unschd_lot_no, rsltR.getGUIIndex(), yR.unschd_lot_no());
			}
			else {
				setValueEx(columnRslt_unschd_lot_no, rsltR.getGUIIndex(), null);
			}
		}
	}
	
	protected void doRsltYieldByProd_unschd_sublot_no_LC(MCEventInfo info) {
		if (Cnd_ope_INS.isSelected()) {
			RsltR rsltR = (RsltR) RsltTable.getSelectedMCRow();
			if (!isYieldMultiRow(rsltR.peg_no())) {
				RsltYieldByProdR yR = getRsltYieldByProdL().get(info.getEventIndex());
				setValueEx(columnRslt_unschd_sublot_no, rsltR.getGUIIndex(), yR.unschd_sublot_no());
			}else {
				setValueEx(columnRslt_unschd_lot_no, rsltR.getGUIIndex(), null);
			}
		}
	}
	
	@Override
	public void doRsltYieldByProd_unschd_trd_unit_cd_LC(MCEventInfo info) {
		if (Cnd_ope_INS.isSelected()) {
			RsltR rsltR = (RsltR) RsltTable.getSelectedMCRow();
			RsltYieldByProdR yR = getRsltYieldByProdL().get(info.getEventIndex());
			if (!isNull(yR.unschd_itm_cd())) {
				if (!isYieldMultiRow(rsltR.peg_no())) {
					setValueEx(columnRslt_unschd_trd_unit_cd, rsltR.getGUIIndex(), yR.unschd_trd_unit_cd());
				}
				else {
					if(isNull(rsltR.unschd_trd_unit_cd()) || !rsltR.unschd_trd_unit_cd().equals(rsltR.unschd_base_unit_cd())) {
						setValueEx(columnRslt_unschd_trd_unit_cd, rsltR.getGUIIndex(), rsltR.unschd_base_unit_cd());
					}
				}
			}
		}
	}
	
	protected void dorsltYieldByProd_unschd_trd_unit_yield_act_qty(MCEventInfo info) {
		if (Cnd_ope_INS.isSelected()) {
			RsltR rsltR = (RsltR) RsltTable.getSelectedMCRow();
			RsltYieldByProdR yR = getRsltYieldByProdL().get(info.getEventIndex());
			if (!isYieldMultiRow(rsltR.peg_no())) {
				setValueEx(columnRslt_unschd_trd_unit_yield_act_qty, rsltR.getGUIIndex(), yR.unschd_trd_unit_yield_act_qty());
			}
			else {
				setValueEx(columnRslt_unschd_trd_unit_yield_act_qty, rsltR.getGUIIndex(), _yieldByProdMap.get(rsltR.peg_no()).sum(RsltYieldByProdR.$unschd_base_unit_yield_act_qty));
			}
		}
	}
	
	/**
	 * 工程単位実績数量のLCイベント処理
	 * @param info
	 */
	protected void doRslt_oper_unit_act_qty_LC(MCEventInfo info) {
		RsltR rsltR = getRsltL().get(info.getEventIndex());
		setRsltNotCmplFlg(rsltR);
	}
	
	/**
	 * 未完了フラグの設定処理
	 * @param rsltR
	 */
	protected void setRsltNotCmplFlg(RsltR rsltR) {
		if (!isNull(rsltR)) {
			if (Cnd_srch_mode_OPER.isSelected()) {
				if (isEditable(columnRslt_not_cmpl_flg, rsltR.getGUIIndex())) {
					if (rsltR.oper_unit_rem_qty().gt(rsltR.oper_unit_act_qty())) {
						// 工程単位実績数量 < 工程単位残数量
						rsltR.not_cmpl_flg(true);
					}
					else if (rsltR.oper_unit_act_qty().gte(rsltR.oper_unit_rem_qty())){
						// 工程単位実績数量 > 工程単位残数量
						rsltR.not_cmpl_flg(false);
					}
				}
			}
		}
	}
	
	/**
	 * 出来高実績数量のＬＣイベント処理
	 * @param info
	 */
	protected void doRsltYieldByProd_trd_unit_yield_act_qty_LC(MCEventInfo info) {
		RsltYieldByProdR yR = getRsltYieldByProdL().get(info.getEventIndex());
		setOperUnitActQty(yR);
	}
	
	/**
	 * 自動生成された工程の工程単位実績数量に出来高数量の換算値を設定する。
	 * @param yieldR
	 */
	protected void setOperUnitActQty(RsltYieldByProdR yR) {
		if (isNull(yR)) {
			return;
		}
		if (MAC_YIELD_TYP.isBYPROD(yR.yield_typ())) {
			return;
		}
		if (Cnd_ope_UPD.isSelected() && Cnd_srch_mode_OPER.isSelected()) {
			RsltR rsltR = RsltTable.getSelectedMCRow();
			if (isNull(rsltR)) {
				return;
			}
			if (rsltR.isStatusCreate() || rsltR.isStatusDelete()) {
				return;
			}
			if (!rsltR.if_auto_reg_flg()) {
				return;
			}
			MCNumber sumbaseQty = getRsltYieldByProdL().subList(r -> !r.isStatusDelete()  && !MAC_YIELD_TYP.isBYPROD(r.yield_typ()) && r.hdr_peg_no().eq(yR.hdr_peg_no())).sum(RsltYieldByProdR.$base_unit_yield_act_qty);
			if(isNull(sumbaseQty)) {
				sumbaseQty = new MCNumber(0);
			}
			setValueEx(columnRslt_oper_unit_act_qty, rsltR.getGUIIndex(),
					convQtyBaseToOper(sumbaseQty, rsltR.oper_conv_qty(), rsltR.oper_std_qty(), 
							rsltR.oper_unit_dec_place(), rsltR.oper_unit_conv_rnd_typ()));
		}
	}

	// CellConfig
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(crtRsltCellConfig());
		RsltYieldByProdTable.setCellConfig(crtRsltYieldByProdCellConfig());
	}

	protected RsltCellConfig crtRsltCellConfig() {
		return new RsltCellConfig();
	}

	protected class RsltCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			RsltR r = (RsltR) table.getBaseTable().getRow(index);
			
			if (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ()) || MAC_RTN_STS_TYP.isWRN(r.rtn_sts_typ())) {
				return MCMode.READ_ONLY;
			}
			if (r.arr_purc_auto_reg_flg()) {
				if (isArrPurcAutoRegROColumn(column)) {
					return MCMode.READ_ONLY;
				}
			}
			if (MSC_MFG_MTD_TYP.isEXTNL(r.mfg_mtd_typ())) {
				if (column == columnRslt_rem_abort_flg) {
					return MCMode.READ_ONLY;
				}
			}
			if (isUpdActHdrStatus() || isUpdActOperStatus() || isInsStatus()) {
				if (column == columnRslt_end_act_dt || column == columnRslt_end_act_hm
						|| column == columnRslt_end_ac_dt) {
					if (!MSC_MFG_STS_TYP.isCMPL(r.mfg_sts_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnRslt_base_unit_st_act_qty) {
					if (!isNull(r.mfg_act_no()) || MSC_MFG_MTD_TYP.isEXTNL(r.mfg_mtd_typ())) {
						return MCMode.READ_ONLY;
					}
				}
			}
			if (column == columnRslt_unschd_mfg_loc_cd) {
				if (isNull(r.st_act_dt()) 
						|| isNull(r.unschd_itm_cd()) || isNull(r.unschd_itm_sub1())
						 || isNull(r.unschd_itm_sub2()) || isNull(r.unschd_itm_sub3())) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnRslt_unschd_strg_loc_cd) {
				if (isNull(r.unschd_mfg_loc_cd()) || isNull(r.st_act_dt())) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnRslt_unschd_trd_unit_cd || column == columnRslt_unschd_trd_unit_yield_act_qty
					|| column == columnRslt_unschd_sno1 ||column == columnRslt_unschd_sno2
					|| column == columnRslt_unschd_sno3 || column == columnRslt_unschd_sno4) {
				if (isNull(r.unschd_itm_cd()) || isNull(r.unschd_itm_sub1())
						 || isNull(r.unschd_itm_sub2()) || isNull(r.unschd_itm_sub3())) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnRslt_unschd_bom_ptn) {
				if (isNull(r.unschd_mfg_loc_cd())) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnRslt_unschd_oper_ptn) {
				if (isNull(r.unschd_bom_ptn())) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnRslt_unschd_trd_unit_cd || column == columnRslt_unschd_trd_unit_yield_act_qty
					|| column == columnRslt_unschd_lot_no || column == columnRslt_unschd_sublot_no) {
				if (isYieldMultiRow(r.peg_no())) {
					return MCMode.READ_ONLY;
				}
			}
			if (isDelActStatus()) {
				if (!isNull(r.mfg_aprv_sts_typ()) && MSC_MFG_APRV_STS_TYP.isACT_ACPT(r.mfg_aprv_sts_typ())) {
					return MCMode.READ_ONLY;
				}
			}
			if (isUpdActOperStatus()) {
				if (column == columnRslt_not_cmpl_flg) {
					if (!isEditable(columnRslt_end_act_dt, index) || isNull(r.end_act_dt())) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
		
		protected boolean isArrPurcAutoRegROColumn(MCColumnConfig column) {
			if (column == columnRslt_mfg_sts_typ || column == columnRslt_st_act_dt
					|| column == columnRslt_st_act_hm || column == columnRslt_st_ac_dt
					|| column == columnRslt_end_act_dt || column == columnRslt_end_act_hm
					|| column == columnRslt_end_ac_dt
					|| column == columnRslt_oper_unit_act_qty
					|| column == columnRslt_wip_rate || column == columnRslt_oper_yield
					|| column == columnRslt_oper_act_intr_rmrks
					|| column == columnRslt_oper_act_rpt_rmrks
					|| column == columnRslt_oper_act_sub_char1
					|| column == columnRslt_oper_act_sub_char2
					|| column == columnRslt_oper_act_sub_char3) {
				return true;
			}
			if (Cnd_ope_DEL.isSelected()) {
				if (column == columnRslt_check) {
					return true;
				}
			}
			return false;
		}

	}
	
	protected RsltYieldByProdCellConfig crtRsltYieldByProdCellConfig() {
		return new RsltYieldByProdCellConfig();
	}

	protected class RsltYieldByProdCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if (isUpdActHdrStatus() || isUpdActOperStatus() || isInsStatus()) {
				RsltR rsltR = (RsltR) RsltTable.getSelectedMCRow();
				RsltYieldByProdR yR = (RsltYieldByProdR) table.getBaseTable().getRow(index);
				
				if (!isNull(rsltR)) {
					if (MAC_RTN_STS_TYP.isOK(rsltR.rtn_sts_typ())) {
						return MCMode.READ_ONLY;
					}
					if (isInsStatus() && !isNull(rsltR.mfg_act_no())) {
						return MCMode.READ_ONLY;
					}
					if (rsltR.arr_purc_auto_reg_flg()) {
						return MCMode.READ_ONLY;
					}
					if (MSC_MFG_MTD_TYP.isEXTNL(rsltR.mfg_mtd_typ())) {
						if (column == columnRsltYieldByProd_lot_no
								|| column == columnRsltYieldByProd_sublot_no
								|| column == columnRsltYieldByProd_same_lot_flg
								|| column == columnRsltYieldByProd_strg_loc_cd
								|| column == columnRsltYieldByProd_strg_str_ln_cd
								|| column == columnRsltYieldByProd_strg_str_ln_cd_none_flg
								|| column == columnRsltYieldByProd_yield_rate
								|| column == columnRsltYieldByProd_gd_cd
								) {
							return MCMode.READ_ONLY;
						}
					}
				}
				if (!MAC_YIELD_TYP.isBYPROD(yR.yield_typ())) {
					if (column == columnRsltYieldByProd_sno1
							|| column == columnRsltYieldByProd_sno2
							|| column == columnRsltYieldByProd_sno3
							|| column == columnRsltYieldByProd_sno4) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnRsltYieldByProd_yield_typ) {
					if (MAC_YIELD_TYP.isBYPROD(yR.yield_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnRsltYieldByProd_quality_typ) {
					if (!MAC_YIELD_TYP.isBYPROD(yR.yield_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnRsltYieldByProd_yield_rsn_cd) {
					if (MAC_YIELD_TYP.isDFCT(yR.yield_typ())) {
						return MCMode.REQUIRED;
					}
				}
				if (column == columnRsltYieldByProd_insp_cnt_rmrks) {
					if (MAC_YIELD_TYP.isBYPROD(yR.yield_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnRsltYieldByProd_yield_rate) {
					if (MAC_YIELD_TYP.isBYPROD(yR.yield_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnRsltYieldByProd_yield_act_rpt_rmrks) {
					if (MAC_YIELD_TYP.isBYPROD(yR.yield_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnRsltYieldByProd_unschd_yield_rsn_cd) {
					if (isNull(yR.unschd_yield_typ())) {
						return MCMode.READ_ONLY;
					}
					else if (MAC_YIELD_TYP.isDFCT(yR.unschd_yield_typ())) {
						return MCMode.REQUIRED;
					}
				}
				if (column == columnRsltYieldByProd_unschd_trd_unit_yield_act_qty) {
					if (isNull(yR.unschd_trd_unit_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnRsltYieldByProd_unschd_strg_loc_cd) {
					if (isNull(rsltR) || isNull(rsltR.unschd_strg_loc_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnRsltYieldByProd_unschd_trd_unit_cd) {
					if (isNull(yR.unschd_itm_cd()) || isNull(yR.unschd_itm_sub1())
							 || isNull(yR.unschd_itm_sub2()) || isNull(yR.unschd_itm_sub3())) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
		@Override
		public MCMode getPriorDeleteMode(int index, MCColumnConfig column, MCTable table) {
			RsltR rsltR = (RsltR) RsltTable.getSelectedMCRow();
			if (!isNull(rsltR)) {
				if (MAC_RTN_STS_TYP.isOK(rsltR.rtn_sts_typ())) {
					return MCMode.READ_ONLY;
				}
			}
			if (Cnd_ope_UPD.isSelected()) {
				if (column == columnRsltYieldByProd_can_ac_dt_for_input) {
					return MCMode.REQUIRED;
				}
			}
			return super.getPriorDeleteMode(index, column, table);
		}
	}

	protected boolean isUpdAprvStatus() {
		return isSame(getStatus(), UPD_ARPV_HDR);
	}
	
	protected void setAprvDptUsrDftVal() {
		AprvBulkSet_aprv_dt.setValue(getToday());
		if (isNull(getAprvBulkSetR().aprv_usr_cd())) {
			AprvBulkSet_aprv_usr_cd.setValue(mcframe.clientCore.sys.MCSys.user.ID());
		}
		AprvBulkSet_aprv_usr_dpt_p_PPanel.focusFirstComponent();
	}

	protected void setAprvDptUsrMode() {
		if (isSame(getSysParm("MFG_APRV_USR_FIX_FLG"), "1")) {
			AprvBulkSet_aprv_dt.setMode(MCMode.READ_ONLY);
			AprvBulkSet_aprv_usr_cd.setMode(MCMode.READ_ONLY);
		}
	}

	@Override
	protected void setInvisibleBySysParam() {
		super.setInvisibleBySysParam();

		if (isSame(getSysParm("MFG_APRV_ENABLE_FLG"), "0")) {
			setComponentInvisibleAllStatus(getInvisibleBeans());
		}
	}

	protected void setMfgAprvStsTyp() {
		if (Cnd_ope_APRV.isSelected()) {
			setValueEx(Cnd_mfg_aprv_sts_typ, MSC_MFG_APRV_STS_TYP.ACT_OPN.value());
		}
		else if (Cnd_ope_APRV_DEL.isSelected()) {
			setValueEx(Cnd_mfg_aprv_sts_typ, MSC_MFG_APRV_STS_TYP.ACT_ACPT.value());
		}
	}
	
	protected MCBeans[] getInvisibleBeans() {
		return mcframe.commonCore.util.MCCollectionUtil.concat(
				new MCBeans[] {Cnd_ope_APRV, Cnd_ope_APRV_DEL, AprvBulkSetPanel}
				, (MCBeans[]) MCBeansUtil.getAllComponents(MCBeans.class, AprvBulkSetPanel));
	}
	
	// 格納場所
	@Override
	public MCList getRsltYieldByProd_strg_loc_cd(MCRow row, MCEventInfo info) {
		int index = info.getEventIndex();
		setLocBind(row, index);
		return super.getRsltYieldByProd_strg_loc_cd(row, info);
	}
	
	protected void setLocBind(MCRow row, int eventIndex) {
		RsltYieldByProdR yieldR = getRsltYieldByProdL().get(eventIndex);
		MCIndexKey idx = getRsltL().createIndex(RsltR.$peg_no);
		RsltR rsltR = getRsltL().getFirst(idx, yieldR.hdr_peg_no());
		
		row.setStringNE(LocCols.$i_wg_cd , rsltR.wg_cd());
		row.setStringNE(LocCols.$i_loc_is_srch_typ, MAC_LOC_IS_SRCH_TYP.HOUSE_EQ_WG.value());
	}

	@Override
	public MCList getRsltYieldByProd_unschd_strg_loc_cd(MCRow row, MCEventInfo info) {
		int index = info.getEventIndex();
		setLocBindUnschd(row, index);
		return super.getRsltYieldByProd_unschd_strg_loc_cd(row, info);
	}
	
	protected void setLocBindUnschd(MCRow row, int eventIndex) {
		RsltYieldByProdR yieldR = getRsltYieldByProdL().get(eventIndex);
		MCIndexKey idx = getRsltL().createIndex(RsltR.$peg_no);
		RsltR rsltR = getRsltL().getFirst(idx, yieldR.hdr_peg_no());
		
		row.setStringNE(LocCols.$i_wg_cd , rsltR.unschd_mfg_loc_wg_cd());
	}
	
	@Override
	protected MCRow getBindRowForISCustom(MCRow bind, MCLinkBeans beans, int eventIndex) {
		MCRow row = super.getBindRowForISCustom(bind, beans, eventIndex);
		if (beans == columnRsltYieldByProd_strg_loc_cd) {
			setLocBind(row, eventIndex);
		}
		if (beans == columnRsltYieldByProd_unschd_strg_loc_cd) {
			setLocBindUnschd(row, eventIndex);
		}
		return row;
	}
	
	/**
	 * 行コピーの後処理
	 *
	 * @param table テーブル
	 * @param row 行コピーして新規に作成されたRow
	 */
	@Override
	public <E extends MCConstRow> E copyRowSub(MCTable<E> table, E row) {
		if (row != null && !row.isEmpty()) {
			clearNotInheritInfo(table, row);
			if (isListRegTable(table)) {
				clearRtnMsgInfo(table, row);
			}
		}
		return row;
	}
	
	// -----------------------------------------------
	// ファイル取り込み
	// -----------------------------------------------	
	@Override
	public boolean useFileIn(MCTable table) {
		if (table == RsltTable) {
			return Cnd_ope_INS.isSelected();
		}
		return super.useFileIn(table);
	}
	
	@Override
	protected void doFileInErrorAction(mcframe.clientCore.beans.table.MCTable<?> table,
			mcframe.commonCore.notice.MCMessageList msgList) {
		super.doFileInErrorAction(table, msgList);
		clearHiddenList();
		clearCache();
		getRsltYieldByProdL().clear();
		setINSStatus();
		setBtnRsltUnschdMode();
		setBtnRsltYieldByProdUnschdMode();
	}
	
	@Override
	protected void doFileInSuccessAction(MCTable<?> table) {
		super.doFileInSuccessAction(table);
		callMS_MSBCL1130_Imp01();
	}

	/**
	 * [MS_MSBCL1130_Imp01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1130_Imp01Caller<P extends MSBCP_MfgActListReg, B extends MS_MSBCL1130_Imp01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_FileImporter<P, B> {

		protected MS_MSBCL1130_Imp01Caller(P p, B b) {
			super(p, b);
			clear();
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			if (getUnschdBulkSetR().async_flg()) {
				setAsync(true);
				setCsvOutForAsync(true);
			}
		}
		
		@Override
		protected boolean csvOutForAsync() {
			super.csvOutForAsync();
			
			List<MCList<?>> containers = new ArrayList<MCList<?>>();

			// 検索条件
			MCList<CndR> cndL = MCList.create(CndR.class);
			cndL.add(getCndR());
			containers.add(cndL);

			// 一括設定
			MCList<UnschdBulkSetR> unschdBulkSetL = MCList.create(UnschdBulkSetR.class);
			unschdBulkSetL.add(getUnschdBulkSetR());
			containers.add(unschdBulkSetL);

			// ヘッダ
			containers.add(getRsltL());

			// 明細
			MCList<RsltYieldByProdR> yieldByProdL = MCList.create(RsltYieldByProdR.class);
			_yieldByProdMap.values().forEach(l -> yieldByProdL.addAll(l));
			containers.add(yieldByProdL);
			
			return csvOutFromContainer(containers);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			if (isAsync()) {
				setFIX_INSStatus();
			}
			else if (hasNg()) {
				setFIX_INSStatus();
			}
			else {
				setINSStatus();
			}
			Ctrl_ctrl_PPanel.expand(false);
			RsltTable.selectLeftmostColumn(0);
		}
		
		@Override
		protected void afterCall() {
			super.afterCall();
			for (RsltR r : bridge.down0()) {
				r.check(true);
			}
			for (RsltYieldByProdR r : bridge.down1()) {
				r.setStatus(Status.CREATE);
			}
		}
		
		// 取込結果のエラー有無確認
		protected boolean hasNg() {
			if (!isNull(bridge.down0().getFirst(RsltR.$rtn_sts_typ, MAC_RTN_STS_TYP.ERR.value()))) {
				return true;
			}
			return false;
		}
		
		@Override
		protected void show() {
			super.show();
			if (!hasNg()) {
				for (RsltR r : bridge.down0()) {
					_yieldByProdMap.put(r.peg_no(), bridge.down1().subList(RsltYieldByProdR.$hdr_peg_no, r.peg_no()));
				}
			}
			RsltTable.selectLeftmostColumn(0);
		}
		
		@Override
		protected void clear() {
			super.clear();
			clearHiddenList();
		}
		
		@Override
		protected void handleMCEx(MCException ex){
			super.handleMCEx(ex);
			setFIX_INSStatus();
		}
		
		@Override
		protected void setModeMCEx(MCException ex) {
			super.setModeMCEx(ex);
			setFIX_INSStatus();
		}
	}

}