package mcframe.clientMSBE.MSBEP2210;

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

import mcframe.clientFSUB.FSUBP0060.*;
import mcframe.clientMAUB.MAUBP0060.*;
import mcframe.clientMAUB.MAUBP0310.*;
import mcframe.clientMAUB.MAUBP0320.*;
import mcframe.clientMAUB.MAUBP0330.*;
import mcframe.clientMAUB.MAUBP0410.*;
import mcframe.clientMAUB.MAUBP0420.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5060.*;
import mcframe.clientMAUB.MAUBP5120.*;
import mcframe.clientMAUB.MAUBP5150.*;
import mcframe.clientMAUB.MAUBP5230.*;
import mcframe.clientMAUB.MAUBP5250.*;
import mcframe.clientMAUB.MAUBP5260.*;
import mcframe.clientMAUB.MAUBP5270.*;
import mcframe.clientMAUB.MAUBP5280.*;
import mcframe.clientMAUB.MAUBP5300.*;
import mcframe.clientMAUB.MAUBP5320.*;
import mcframe.clientMAUB.MAUBP5330.*;
import mcframe.clientMSUB.MSUBP5020.*;
import mcframe.clientMSUB.MSUBP5030.*;
import mcframe.clientMSUB.MSUBP5040.*;
import mcframe.clientMSUB.MSUBP5070.*;

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
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import mcframe.clientCore.beans.list.MCLinkBeans;
import mcframe.clientCore.container.MCRowListener;
import mcframe.clientCore.container.MCRowEvent; 
import mcframe.clientCore.container.MCRowStatusListener;
import mcframe.clientCore.container.MCRowStatusEvent;

import mcframe.clientMAUD.MAUDP0010.IfOpePanel;

import mcframe.clientMSUC.MSUCP0040.MSUCP_PurcUtil;
import mcframe.clientMAUC.MAUCP0100.MAUCP_AmtUtil;
import mcframe.clientMAUC.MAUCP0160.MAUCP_ItmUtil;
import mcframe.clientMSBE.MSBEP2200.*;
import static mcframe.commonMSUA.MSUAC0040.MSUAC_List.*;
import static mcframe.commonMSUA.MSUAC0060.MSUAC_List.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBEP_RcptIvReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBEP_RcptIvReg_MC extends MSBEP_RcptIvReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	/** MSBEP2200から遷移したことを示すFLG */
	protected boolean _booMSBEP2200 = false;
	protected MCRow _bindMSBEP2200 = MCRow.create();
	protected MCTable<mcframe.clientMSBE.MSBEP2200.RsltR> _msbep2200Rslt;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_RcptIvReg_MC() {
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
	public MSBEP_RcptIvReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBEL2210_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2210_Srch01Caller<P extends MSBEP_RcptIvReg, B extends MS_MSBEL2210_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {
		protected MS_MSBEL2210_Srch01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void setMode() {
			if (isSrcMsbep2240()) {
				// オードは今のまま切り替えない。確定・未確定の制御のみ行う
				setFixMode();
			}
			else {
				super.setMode();
				setINS_SCHDStatus();
				setHdrPanelMode();
				setHdrPanelInitValue();
				setSrchUpriBtnMode();
			}
		}
		@Override
		protected void afterCall() {
			if (isSrcMsbep2240()) {
				for (Object o : bridge.down1()) {
					Dtl1R r = (Dtl1R)o;
					r.peg_no(r.peg_no().add(_maxDtlPegNo));
				}
				for (Object o : bridge.down2()) {
					Dtl2R r = (Dtl2R)o;
					r.dtl_peg_no(r.dtl_peg_no().add(_maxDtlPegNo));
					r.peg_no(r.peg_no().add(_maxIoPegNo));
				}
			}
			super.afterCall();
			
			Hdr1R hr = bridge.down0();
			MCRow.copyvalue(hr, getHdr1R());
			MCList<Dtl1R> dL = bridge.down1();
			MCList<Dtl2R> ioL =  bridge.down2();
			
			// 計画外か、否かの判定に使用しているため設定する（distinctNEはnull以外を優先するため）
			hr.po_no(dL.isEmpty() ? null : dL.distinctNE(Dtl1R.$po_no).get(0).po_no());
			hr.inherited_src_no(hr.po_no());
			
			// 行ステータスを「新規」にセット
			dL.setStatus(Status.CREATE);
			ioL.setStatus(Status.CREATE);
			
			// 明細行・詳細行の紐付NOの最大値に1加算して格納する
			_maxDtlPegNo = getMaxValue(dL, Dtl1R.$peg_no) + 1;
			_maxIoPegNo = getMaxValue(ioL, Dtl2R.$peg_no) + 1;
			
			// 画面に表示する前に電文をhiddenListに格納してしまう
			setHiddenListAdd(dL, ioL);
			
			MCIndexKey idxDown1 = dL.createIndex(Dtl2R.$peg_no);
			MCIndexKey idxDown2 = ioL.createIndex(Dtl2R.$dtl_peg_no);
			// 検索直後の入荷同時計上ＦＬＧ,格付ＣＤ(入荷予定の格付),良品区分を退避する
			dL.forEach(r -> {
				MCList<Dtl2R> subL = ioL.subList(idxDown2, r.peg_no());
				if (subL.size() == 1 && isNull(subL.get(0).arr_act_no())) {
					if (!r.sync_flg()) {
						// 未入荷で同時計上予定でない場合は、格付の初期値はnullとする
						r.tmp_gd_cd(r.gd_cd());
						r.gd_cd(null);
						r.gd_nm(null);
					}
					// 未入荷の場合は在庫がまだないため、良品区分をnullで表示する
					r.tmp_quality_typ(r.quality_typ());
					r.quality_typ(null);
					r.quality_typ_nm(null);
				}
				r.old_sync_flg(r.sync_flg());
				r.old_gd_cd(r.gd_cd());
				r.old_quality_typ(r.quality_typ());
				r.bef_pay_crryovr_times(r.pay_crryovr_times());
			});			
			// 検索直後の格付ＣＤ,良品区分を退避
			ioL.forEach(r -> {
				if (isNull(r.arr_act_no())) {
					Dtl1R dtl1R = dL.getFirst(idxDown1, r.dtl_peg_no());
					if (!dtl1R.sync_flg()) {
						// 未入荷で同時計上予定でない場合は格付はnullとする
						r.gd_cd(null);
						r.gd_nm(null);
					}
					// 未入荷の場合は在庫がまだ無いため、在庫検査区分と在庫識別区分、良品区分をnullで表示する
					r.tmp_stk_insp_typ(r.stk_insp_typ());
					r.tmp_stk_id_typ(r.stk_id_typ());
					r.tmp_quality_typ(r.quality_typ());
					r.stk_insp_typ(null);
					r.stk_insp_typ_nm(null);
					r.stk_id_typ(null);
					r.stk_id_typ_nm(null);
					r.quality_typ(null);
					r.quality_typ_nm(null);
				}
				r.old_gd_cd(r.gd_cd());
				r.old_quality_typ(r.quality_typ());
				r.old_trd_unit_qty(r.trd_unit_qty());
			});
			setCrtLotFlgAdd(dL,ioL);
		}
		@Override
		protected void show() {
			if (isSrcMsbep2240()) {
				showMerge();
				setOrgAmt();
				setDispAmt();
			}
			else {
				super.show();
				setDtl1ToHdr();
				setHdrXrate();
				setOrgAmt();
				setDispAmt();
			}
		}
		@Override
		protected void setModeNoDown() {
			if (!isSrcMsbep2240()) {
				super.setModeNoDown();
				setINSStatus();
			}
			// 今のまま切り替えない
		}
		@Override
		protected void moveFocus() {
			if (isSrcMsbep2240()) {
				// フォーカスは変えない。詳細の絞込みのみ
				showIo(Dtl1Table.getSelectedMCRow());
			}
			else {
				super.moveFocus();
				Dtl1Table.selectLeftmostColumn(0);
			}
		}
		@Override
		protected void clear() {
			// valueInitSub で設定した情報を生かすため、クリアしない
			// Srch01 は受領インボイス登録選択から遷移したときのみ実行されるので、前の情報が残っていることはない
		}
		
		/**
		 * ヘッダの為替レート、納税為替レートを設定する
		 */
		protected void setHdrXrate() {
			// 為替レート
			if (!getHdr1R().xrate_inpt_flg()) {
					setValueEx(Hdr1_xrate, 
						MAUCP_AmtUtil.getDefXrateNE(
							getHdr1R().trd_cur_cd(),
							getCo().base_cur_cd(),
							getCo().purc_xrate_cd(),
							getHdr1R().xrate_base_dt(), panel));
			}
			// 納税為替レート
			if (!getHdr1R().ptax_xrate_inpt_flg()) {
					setValueEx(Hdr1_ptax_xrate, 
						MAUCP_AmtUtil.getDefXrateNE(
							getHdr1R().trd_cur_cd(),
							getCo().ptax_cur_cd(),
							getCo().purc_xrate_cd(),
							getHdr1R().xrate_base_dt(), panel));
			}
		}
		@Override
		protected boolean execConfirm() {
			if (isSrcMsbep2240()) {
				// 確認ダイアログは表示しない
				return true;
			}
			else {
				return super.execConfirm();
			}
		}
		@Override
		protected void showMerge() {
			if (isSrcMsbep2240()) {
				Map<Dtl1R, Dtl1R> bndlMap = new HashMap<>();
				if (MSC_RCPT_IV_SRC_TYP.isARR_SCHD(getHdr1R().rcpt_iv_src_typ())) {
					getDtl1L().addAll(bridge.down1());
				}
				else {
					for (Dtl1R d1R : (MCList<Dtl1R>)bridge.down1()) {
						MCList<Dtl2R> d2L = bridge.down2().subList(Dtl2R.$dtl_peg_no, d1R.peg_no());
						
						// 既存の明細にまとめる
						mergeDtl(d1R, d2L, bndlMap);
						
						if (!bndlMap.containsKey(d1R)) {
							getDtl1L().add(d1R);
						}
					}
				}
				
				// まとめ先に数量を加算
				bndlMap.entrySet().forEach(m -> {
					Dtl1R destR = m.getValue();
					Dtl1R srcR = m.getKey();
					setValueEx(
						columnDtl1_trd_unit_qty,
						destR.getGUIIndex(),
						destR.trd_unit_qty().add(srcR.trd_unit_qty())
					);
					
					// 詳細が一意でない項目はクリアする
					clearDtlCols(destR);
				});
				
				// 空行の補完
				Dtl1Table.getList().subList(r -> r.isEmpty()).forEach(r -> {
					Dtl1Table.truncateRowNoFocus(r.getGUIIndex());
				});
				Dtl1Table.fillSpace();
			}
			else {
				super.showMerge();
			}
		}
		
		/**
		 * 受領インボイス追加明細選択で選択された明細を、既存の明細にまとめる
		 */
		protected void mergeDtl(Dtl1R d1R, MCList<Dtl2R> d2L,Map<Dtl1R, Dtl1R> bndlMap) {
			// d2L にまとめ対象が混在することはないので、先頭の入荷実績でまとめ対象か判断する
			Cnd2R cnd2R = getCnd2L().getFirst(Dtl2R.$arr_act_no, d2L.get(0).arr_act_no());
			if (!isNull(cnd2R) && cnd2R.bndl_tgt_flg()) {
				// まとめ先を取得
				Dtl1R destR = (Dtl1R)exceptDeleteAndEmpty(getDtl1L()).getFirst(
					new String[]{Dtl1R.$purc_schd_no},
					new String[]{d1R.purc_schd_no()});
				if (!isNull(destR)) {
					// まとめ対象に追加
					bndlMap.put(d1R, destR);
					
					// まとめ先に付け替えたうえで、詳細枠に追加する
					d2L.forEach(r -> {
						r.dtl_peg_no(destR.peg_no());
					});
					
					// キャッシュリストも更新する
					_dtl2L.get(d1R.peg_no()).removeAll(d2L);
					_dtl2L.get(destR.peg_no()).addAll(d2L);
				}
			}
		}
		
		/*
		 * まとめた結果、詳細の値が一意でない項目に対応する明細項目をクリアする
		 */
		protected void clearDtlCols(Dtl1R destR) {
			for (MCColumnConfig[] cols : getClearDtlCols()) {
				if (isClearDtlCol(destR.peg_no(), cols[1])) {
					setValueEx(cols[0], destR.getGUIIndex(), null);
				}
			}
		}
		protected MCColumnConfig[][] _clearCols;
		protected MCColumnConfig[][] getClearDtlCols() {
			if (_clearCols == null) {
				_clearCols = new MCColumnConfig[][] {
					// {クリア対象の項目, クリア対象の項目に対して一意か判定する項目}
					{columnDtl1_dlv_loc_cd, columnDtl2_dlv_loc_cd},
					{columnDtl1_str_ln_cd, columnDtl2_str_ln_cd},
					{columnDtl1_lot_no, columnDtl2_lot_no},
					{columnDtl1_sublot_no, columnDtl2_sublot_no},
					{columnDtl1_ver_no, columnDtl2_ver_no},
					{columnDtl1_gd_cd, columnDtl2_gd_cd},
					{columnDtl1_quality_typ, columnDtl2_quality_typ},
					{columnDtl1_bp_lot_no, columnDtl2_bp_lot_no},
					{columnDtl1_bp_dlv_slip_no, columnDtl2_bp_dlv_slip_no},
					{columnDtl1_bp_dlv_slip_d_no, columnDtl2_bp_dlv_slip_d_no},
					{columnDtl1_ship_fr_valid_dt, columnDtl2_ship_fr_valid_dt}
				};
			}
			return _clearCols;
		}
		protected boolean isClearDtlCol(MCNumber pegNo, MCColumnConfig col) {
			if (_dtl2L.get(pegNo).distinctNE(col.getRowColumnName()).size() > 1) {
				// 詳細が一意でない項目はクリアする
				return true;
			}
			return false;
		}
		protected boolean isSrcMsbep2240() {
			return getCndR().getBooleanNE("is_src_msbep2240");
		}
	}
	
	/**
	 * [MS_MSBEL2210_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2210_Srch02Caller<P extends MSBEP_RcptIvReg, B extends MS_MSBEL2210_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {
		protected MS_MSBEL2210_Srch02Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void setMode() {
			super.setMode();
			setSrchUpriBtnMode();
		}
		
		@Override
		protected void clear() {
			super.clear();
			clearHiddenList();
			
			_booMSBEP2200 = false;
			_bindMSBEP2200 = MCRow.create();
			_msbep2200Rslt = null;
		}
		@Override
		protected void afterCall() {
			super.afterCall();
			
			Hdr1R hr = bridge.down0();
			MCList<Dtl1R> dL = bridge.down1();
			MCList<Dtl2R> ioL =  bridge.down2();
			
			// 計画外か、否かの判定に使用しているため設定する（distinctNEはnull以外を優先するため）
			hr.po_no(dL.isEmpty() ? null : dL.distinctNE(Dtl1R.$po_no).get(0).po_no());
			hr.inherited_src_no(hr.po_no());
			hr.src_xrate(hr.xrate());
			hr.src_ptax_xrate(hr.ptax_xrate());
			
			// 明細行・詳細行の紐付NOの最大値に1加算して格納する
			_maxDtlPegNo = getMaxValue(bridge.down1(), Dtl1R.$peg_no) + 1;
			_maxIoPegNo = getMaxValue(bridge.down2(), Dtl2R.$peg_no) + 1;
			
			// 画面に表示する前に電文をhiddenListに格納してしまう
			setHiddenListAdd(dL, ioL);
			
			// 検索直後の入荷同時計上ＦＬＧ,格付ＣＤ（入荷予定の格付ＣＤ）,良品区分を退避
			dL.forEach(r -> {
				r.old_sync_flg(r.sync_flg());
				r.old_gd_cd(r.gd_cd());
				r.old_quality_typ(r.quality_typ());
				r.bef_pay_crryovr_times(r.pay_crryovr_times());
			});
			// 検索直後の格付ＣＤ（入荷予定または現状在庫の格付ＣＤ）,良品区分を退避
			ioL.forEach(r -> {
				r.old_gd_cd(r.gd_cd());
				r.old_quality_typ(r.quality_typ());
				r.old_trd_unit_qty(r.trd_unit_qty());
			});
			if (hr.fix_flg()) {
				hr.can_ac_dt(hr.ac_dt());
			}
			hr.bef_fix_flg(hr.fix_flg());
			hr.purc_xrate_cd(getCo().purc_xrate_cd());
			
			Dtl1R dR = dL.getFirst(Dtl1R.$purc_basis_typ, MAC_PURC_BASIS_TYP.ARR_BASIS.value());
			if (!isNull(dR)) {
				hr.bef_purc_schd_dt(dR.purc_schd_dt());
			}
		}
		@Override
		protected void show() {
			super.show();
			copyAmtData();
			setOrgAmt();
			setDispAmt();
		}
	}
	
	@Override
	protected void setHdrPanelInitValue() {
		// 仕入日、計上日、支払起算日は設定しいない
		//super.setHdrPanelInitValue();
		
		// 納税通貨 
		if (isSame(getHdr1R().trd_cur_cd(), getHdr1R().ptax_cur_cd())) {
			// 取引通貨と納税通貨が同じ通貨CDの場合はレートは"1"に固定
			setValueEx(Hdr1_ptax_xrate, MCNumber.valueOf(1));
		}
	}
	
	protected void setHiddenListAdd(MCList<Dtl1R> dtl1L, MCList<Dtl2R> dtl2L) {
		MCIndexKey idxKey = dtl2L.createIndex(Dtl2R.$dtl_peg_no);
		for(Dtl1R r: dtl1L) {
			MCList<mcframe.clientMSBD.MSBDP0140.Dtl2R> val = MCList.create(mcframe.clientMSBD.MSBDP0140.Dtl2R.class);
			val.setAll(dtl2L.subList(idxKey, r.peg_no()));
			_dtl2L.put(r.peg_no(), val);
		}
	}
	
	protected void setCrtLotFlgAdd(MCList<Dtl1R> dtl1L, MCList<Dtl2R> dtl2L) {
		MCIndexKey key = dtl2L.createIndex(Dtl2R.$dtl_peg_no);
		for (Dtl1R dtl1R : dtl1L) {
			dtl1R.crt_lot_flg(getDefCrtLotFlg(dtl1R));
			MCList<Dtl2R> subDtl2L = dtl2L.subList(key, dtl1R.peg_no());
			for (Dtl2R dtl2R : subDtl2L) {
				dtl2R.crt_lot_flg(getDefCrtLotFlg(dtl1R, dtl2R));
			}
		}
	}

	/**
	 * [MS_MSBEL2210_Iv_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2210_Iv_Ins01Caller<P extends MSBEP_RcptIvReg, B extends MS_MSBEL2210_Iv_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {
		/**
		 * 単価再取得時のメッセージを保持するリスト
		 */
		MCMessageList _upriChngMsgList;
		/**
		 * 単価再取得対象のリスト
		 */
		MCList<mcframe.clientMSBD.MSBDP0140.Dtl1R> _tgtList;
		
		protected MS_MSBEL2210_Iv_Ins01Caller(P p, B b) {
			super(p, b);
		}
		/** 登録対象のリスト */
		protected MCList<mcframe.clientMSBD.MSBDP0140.Dtl1R> _dtl1LForCall = MCList.create(mcframe.clientMSBD.MSBDP0140.Dtl1R.class);
		protected MCList<mcframe.clientMSBD.MSBDP0140.Dtl2R> _dtl2LForCall = MCList.create(mcframe.clientMSBD.MSBDP0140.Dtl2R.class);

		@Override
		protected void initCaller() {
			super.initCaller();
			
			// 明細行・詳細行ともに空行以外は通信対象
			_dtl1LForCall = exceptEmpty(getDtl1L());

			for (mcframe.clientMSBD.MSBDP0140.Dtl1R dtl : _dtl1LForCall) {
				if (_dtl2L.containsKey(dtl.peg_no())) {
					_dtl2LForCall.addAll(exceptEmpty(_dtl2L.get(dtl.peg_no())));
				}
			}
			getDownBlocks();
			_upriChngMsgList = new MCMessageList();
			_tgtList = getSprtTgtDtl1L(true);
		}
		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			bridge.up1().setAll(_dtl1LForCall);
			bridge.up2().setAll(_dtl2LForCall);
		}
		@Override
		protected boolean confirmForCall() {
			if (!doSprt()) {
				//ダイアログは単価再取得処理で表示する
				return false;
			}
			boolean confirmRslt = super.confirmForCall();
			if (_upriChngMsgList.size() > 0 && !confirmRslt) {
				_tgtList.forEach(dr ->	restoreUpri(dr));
			}
			return confirmRslt;
		}
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}
		protected void checkForCallStackSub(MCMessageList msgList) {
			Hdr1R hr = getHdr1R();
			MCIndexKey idx = _dtl2LForCall.createIndex(Dtl2R.$dtl_peg_no);
			for (mcframe.clientMSBD.MSBDP0140.Dtl1R dr : _dtl1LForCall) {
				msgList.addAll(cmnChkDtl(hr, dr));
				
				MCList<mcframe.clientMSBD.MSBDP0140.Dtl2R> tgtIoL = _dtl2LForCall.subList(idx, dr.peg_no());
				msgList.addAll(cmmChkIo(dr, exceptDeleteAndEmpty(tgtIoL)));
			}
		}
		@Override
		protected void confirmForCallStack(MCMessageList msgList) {
			super.confirmForCallStack(msgList);
			if (getHdr1R().fix_flg()) {
				msgList.addAll(arrPtnChk());
				msgList.addAll(qualityTypChk());
				msgList.addAll(inptChk());
			}
			
			_tgtList.forEach(dr ->
				setDiffLatestUpriMsg(_upriChngMsgList, dr));
			msgList.addAll(_upriChngMsgList);
		}
		@Override
		protected void beforeCall() {
			super.beforeCall();
			
			// 入荷パタン
			for (Dtl1R upDtlRow : (MCList<Dtl1R>)bridge.up1()) {
				if (!isNull(upDtlRow.arr_schd_no())) {
					if (upDtlRow.arr_qty().isZero() && !upDtlRow.sync_flg()) {
						upDtlRow.arr_ptn_typ(MSC_ARR_PTN_TYP.N_YET_ARR.value());
					}
					else {
						upDtlRow.arr_ptn_typ(MSC_ARR_PTN_TYP.NRML.value());
					}
				}
			}
		}
		@Override
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> l = super.getDownBlocks();
				l.set(2, _dtl2LForCall);
				return l;
		}
		@Override
		protected void checkReq(MCMessageList msgList) {
			checkReqSub(msgList, getHdr1R());
			checkReqSub(msgList, getDtl1L());
		}
		@Override
		protected void resultSuccess() {
			super.resultSuccess();
			
			truncateMSBEP2200RsltTable();
		}
		/**
		 * 受領インボイス登録対象選択から削除する
		 */
		protected void truncateMSBEP2200RsltTable() {
			if (_msbep2200Rslt == null
				|| MSC_RCPT_IV_SRC_TYP.isPURC(getHdr1R().rcpt_iv_src_typ())) {
				return;
			}
			
			MCList<RsltR> truncateTgtL = _msbep2200Rslt.getList();
			String key =
				MSC_RCPT_IV_SRC_TYP.isARR_SCHD(getHdr1R().rcpt_iv_src_typ()) ?
					RsltR.$arr_schd_no :
					RsltR.$arr_act_no;
			List<String> tgtL =
				MSC_RCPT_IV_SRC_TYP.isARR_SCHD(getHdr1R().rcpt_iv_src_typ()) ?
					_dtl1LForCall.getString(Dtl1R.$arr_schd_no) :
					_dtl2LForCall.getString(Dtl2R.$arr_act_no);
			
			for (String tgtNo : tgtL) {
				RsltR tgtR = truncateTgtL.getFirst(key, tgtNo);
				if (!isNull(tgtR)) {
					_msbep2200Rslt.truncateRow(tgtR.getGUIIndex());
				}
			}
			
			if (_msbep2200Rslt.getList().size() > 0) {
				_msbep2200Rslt.getList().setBooleanNE(RsltR.$selectable_flg, true);
			}
		}
	}
	
	/**
	 * [MS_MSBEL2210_Iv_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2210_Iv_Upd01Caller<P extends MSBEP_RcptIvReg, B extends MS_MSBEL2210_Iv_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {
		/**
		 * 単価再取得時のメッセージを保持するリスト
		 */
		MCMessageList _upriChngMsgList;
		
		/**
		 * 単価再取得対象のリスト
		 */
		MCList<mcframe.clientMSBD.MSBDP0140.Dtl1R> _tgtList;

		protected MCList<mcframe.clientMSBD.MSBDP0140.Dtl1R> _dtl1LForCall = MCList.create(mcframe.clientMSBD.MSBDP0140.Dtl1R.class);
		protected MCList<mcframe.clientMSBD.MSBDP0140.Dtl2R> _dtl2LForCall = MCList.create(mcframe.clientMSBD.MSBDP0140.Dtl2R.class);
		
		protected MS_MSBEL2210_Iv_Upd01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void initCaller() {
			super.initCaller();
			
			// 明細行・詳細行ともに空行以外は通信対象
			_dtl1LForCall = exceptEmpty(getDtl1L());

			for (mcframe.clientMSBD.MSBDP0140.Dtl1R dtl : _dtl1LForCall) {
				if (_dtl2L.containsKey(dtl.peg_no())) {
					_dtl2LForCall.addAll(exceptEmpty(_dtl2L.get(dtl.peg_no())));
				}
			}
			
			_upriChngMsgList = new MCMessageList();
			_tgtList = getSprtTgtDtl1L(true);
		}
		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			bridge.up1().setAll(_dtl1LForCall);
			bridge.up2().setAll(_dtl2LForCall);
		}
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}
		protected void checkForCallStackSub(MCMessageList msgList) {
			Hdr1R hr = getHdr1R();
			MCIndexKey idx = _dtl2LForCall.createIndex(Dtl2R.$dtl_peg_no);
			for (mcframe.clientMSBD.MSBDP0140.Dtl1R dr : _dtl1LForCall) {
				msgList.addAll(cmnChkDtl(hr, dr));
				
				MCList<mcframe.clientMSBD.MSBDP0140.Dtl2R> tgtIoL = _dtl2LForCall.subList(idx, dr.peg_no());
				msgList.addAll(cmmChkIo(dr, exceptDeleteAndEmpty(tgtIoL)));
			}
		}
		@Override
		protected boolean confirmForCall() {
			if (!doSprt()) {
				//ダイアログは単価再取得処理で表示する
				return false;
			}
			boolean confirmRslt = super.confirmForCall();
			if (_upriChngMsgList.size() > 0 && !confirmRslt) {
				_tgtList.forEach(dr ->	restoreUpri(dr));
			}
			return confirmRslt;
		}
		@Override
		protected void confirmForCallStack(MCMessageList msgList) {
			super.confirmForCallStack(msgList);
			if (getHdr1R().fix_flg()) {
				msgList.addAll(qualityTypChk());
				msgList.addAll(inptChk());
			}
			
			_tgtList.forEach(dr ->
				setDiffLatestUpriMsg(_upriChngMsgList, dr));
			msgList.addAll(_upriChngMsgList);
		}
		@Override
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> l = super.getDownBlocks();
			l.set(2, _dtl2LForCall);
			return l;
		}
		@Override
		protected void beforeCall() {
			super.beforeCall();
			
			// 入荷パタン
			for (Dtl1R upDtlRow : (MCList<Dtl1R>)bridge.up1()) {
				// 仕入実績未登録か暫定仕入の場合
				if (!isNull(upDtlRow.arr_schd_no()) && (isNull(upDtlRow.purc_act_d_no()) || upDtlRow.temp_ap_flg())) {
					if (upDtlRow.arr_qty().isZero() && !upDtlRow.sync_flg()) {
						upDtlRow.arr_ptn_typ(MSC_ARR_PTN_TYP.N_YET_ARR.value());
					}
					else {
						upDtlRow.arr_ptn_typ(MSC_ARR_PTN_TYP.NRML.value());
					}
				}
			}
		}
		@Override
		protected void checkReq(MCMessageList msgList) {
//			super.checkReq(msgList);
			Hdr1R hR = getHdr1R();
			MCList<Dtl1R> dL = getDtl1L();
			if (!hR.fix_flg()) {
				dL.forEach(r -> {
					r.pay_crryovr_times(r.bef_pay_crryovr_times());
				});
			}
			checkReqSub(msgList, getHdr1R());
			checkReqSub(msgList, getDtl1L());
		}
	}

	/**
	 * [MS_MSBEL2210_Iv_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2210_Iv_Del01Caller<P extends MSBEP_RcptIvReg, B extends MS_MSBEL2210_Iv_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MCList<mcframe.clientMSBD.MSBDP0140.Dtl2R> _dtl2LForCall = MCList.create(mcframe.clientMSBD.MSBDP0140.Dtl2R.class);
		
		protected MS_MSBEL2210_Iv_Del01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void initCaller() {
			super.initCaller();
			MCList<mcframe.clientMSBD.MSBDP0140.Dtl1R> dtl1L = getDtl1L();

			for (mcframe.clientMSBD.MSBDP0140.Dtl1R dtl : dtl1L) {
				if (_dtl2L.containsKey(dtl.peg_no())) {
					_dtl2LForCall.addAll(exceptEmpty(_dtl2L.get(dtl.peg_no())));
				}
			}	
		}	
		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			bridge.up2().setAll(_dtl2LForCall);
			
		}
	}
	
	/**
	 * 単価取得用Callerクラス
	 */
	protected class MS_MSBEL2210_Sprt01Caller<P extends MSBEP_RcptIvReg, B extends MS_MSBDL0140_Sprt01Bridge> extends MS_MSBDL0140_Sprt01Caller<P, B> {
		protected MS_MSBEL2210_Sprt01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void initCaller() {
			super.initCaller();
			
			// 為替レート基準日（確定オフ：Ｉ／Ｖ日付、確定オン：仕入日）を連携する
			if (!getHdr1R().fix_flg()) {
				getHdr1R().xrate_base_dt(getHdr1R().iv_dt());
			}
		}
		@Override
		protected void checkReqDt(MCMessageList msgList) {
			if (!getHdr1R().fix_flg()) {
				msgList.addAll(panel.checkReq(Hdr1_iv_dt));
			}
			else {
				super.checkReqDt(msgList);
			}
		}
	}
	@Override
	@SuppressWarnings("rawtypes")
	protected MS_MSBEL2210_Sprt01Caller createMS_MSBDL0140_Sprt01() {
		MS_MSBEL2210_Sprt01Caller<MSBEP_RcptIvReg, MS_MSBDL0140_Sprt01Bridge>
		caller = new MS_MSBEL2210_Sprt01Caller<>((MSBEP_RcptIvReg)this, new MS_MSBDL0140_Sprt01Bridge());
		return caller;
	}
	
	/**
	 * 他画面から呼び出された場合の初期化を実装します。<br>
	 * <P>
	 * <li>起動タイプ：T1 （受領インボイス登録対象選択）<br>
	 * バインド値<br>
	 * 受領インボイス登録対象選択で選択された明細
	 * <br>
	 * <br>
	 * その他の引数：以下のリスト</li>
	 * <table border = 1>
	 * <tr>
	 * <th>カラム名</th>
	 * <th>型</th>
	 * <th>備考</th>
	 * </tr>
	 * <tr>
	 * <td>purc_schd_no</td>
	 * <td>String</td>
	 * <td>入荷予定をもとに受領インボイスを作成する場合は必須</td>
	 * </tr>
	 * <tr>
	 * <td>arr_schd_no</td>
	 * <td>String</td>
	 * <td>入荷予定をもとに受領インボイスを作成する場合は必須</td>
	 * </tr>
	 * <tr>
	 * <td>arr_act_no</td>
	 * <td>String</td>
	 * <td>入荷実績をもとに受領インボイスを作成する場合は必須</td>
	 * </tr>
	 * <tr>
	 * <td>bndl_tgt_flg</td>
	 * <td>boolean</td>
	 * <td>任意</td>
	 * </tr>
	 * <td>
	 * </table>
	 * </P>
	 * <P>
	 * <li>起動タイプ：T2 （受領インボイス一覧照会）<br>
	 * バインド値<br>
	 * <table border = 1>
	 * <tr>
	 * <th>カラム名</th>
	 * <th>型</th>
	 * <th>備考</th>
	 * </tr>
	 * <tr>
	 * <td>rcpt_iv_mng_no</td>
	 * <td>String</td>
	 * <td>必須</td>
	 * </tr>
	 * <td>
	 * </table>
	 * <br>
	 * その他の引数：なし</li>
	 * </P>
	 * <P>
	 * <li>起動タイプ：T3 （仕入明細訂正登録）<br>
	 * バインド値<br>
	 * <table border = 1>
	 * <tr>
	 * <th>カラム名</th>
	 * <th>型</th>
	 * <th>備考</th>
	 * </tr>
	 * <tr>
	 * <td>rcpt_iv_mng_no</td>
	 * <td>String</td>
	 * <td>必須</td>
	 * </tr>
	 * <td>
	 * </table>
	 * <br>
	 * その他の引数：なし</li>
	 * </P>
	 * @param openTyp 起動タイプ
	 * @param bind バインド値
	 * @param args その他の引数
	 */
	@SuppressWarnings("unchecked")
	@Override
	protected void initByScreenParam(String openTyp, MCRow bind, Object... args) {
		initTrace(this, "initByScreenParam");
		if (T1 == openTyp) {
			
			_booMSBEP2200 = true;
			setValueEx(Cnd_ope_Group, Cnd_ope_INS.getActionCommand());
			
			_bindMSBEP2200 = bind;
			
			// 検索条件の設定
			getCndR().rcpt_iv_src_typ(bind.getStringNE("rcpt_iv_src_typ"));
			getCnd2L().setAll((MCList<Cnd2R>) args[0]);
			_msbep2200Rslt = (MCTable<mcframe.clientMSBE.MSBEP2200.RsltR>) args[1];
			valueInitSub();
			setBindtoHdr();
			addDoBehind(Cnd_srch_po);
		}
		if (T2 == openTyp) {

			// 検索条件の設定
			setValueEx(Cnd_ope_Group, Cnd_ope_REF.getActionCommand());
			getCndR().rcpt_iv_no(bind.getStringNE("rcpt_iv_no"));
			getCndR().rcpt_iv_mng_no(bind.getStringNE("rcpt_iv_mng_no"));
			getCndR().purc_act_rev(bind.getNumberNE("rcpt_iv_rev"));
			getCndR().newest_flg(false);
			
			addDoBehind(Cnd_srch_purc);

		}
		if (T3 == openTyp) {

			// 検索条件の設定
			setValueEx(Cnd_ope_Group, Cnd_ope_UPD.getActionCommand());
			getCndR().rcpt_iv_no(bind.getStringNE("rcpt_iv_no"));
			getCndR().rcpt_iv_mng_no(bind.getStringNE("rcpt_iv_mng_no"));
			getCndR().newest_flg(true);
			
			addDoBehind(Cnd_srch_purc);

		}
	}
	
	/**
	 * 受領インボイス登録対象選択で選択した値をヘッダに設定する
	 */
	protected void setBindtoHdr() {
		
		// 発注先に関連する項目はリストロジック経由で設定する
		setValueEx(Hdr1_sppl_cd, _bindMSBEP2200.getStringNE("sppl_cd"));
		
		getHdr1R().rcpt_iv_no(_bindMSBEP2200.getStringNE("rcpt_iv_no"));
		getHdr1R().rcpt_iv_src_typ(_bindMSBEP2200.getStringNE("rcpt_iv_src_typ"));
		getHdr1R().rcpt_iv_src_typ_nm(_bindMSBEP2200.getStringNE("rcpt_iv_src_typ_nm"));
		getHdr1R().purc_schd_dt(_bindMSBEP2200.getDateNE("purc_schd_dt"));
		getHdr1R().bef_purc_schd_dt(_bindMSBEP2200.getDateNE("purc_schd_dt"));
		getHdr1R().in_to_id_typ(_bindMSBEP2200.getStringNE("in_to_id_typ"));
		getHdr1R().in_to_id_typ_nm(_bindMSBEP2200.getStringNE("in_to_id_typ_nm"));
		getHdr1R().in_to_id_cd(_bindMSBEP2200.getStringNE("in_to_id_cd"));
		getHdr1R().in_to_id_nm(_bindMSBEP2200.getStringNE("in_to_id_nm"));
		getHdr1R().sppl_cntct_dpt(_bindMSBEP2200.getStringNE("sppl_to_cntct_dpt"));
		getHdr1R().sppl_cntct_psn(_bindMSBEP2200.getStringNE("sppl_to_cntct_psn"));
		getHdr1R().sppl_zip_cd(_bindMSBEP2200.getStringNE("sppl_to_zip_cd"));
		getHdr1R().sppl_addr1(_bindMSBEP2200.getStringNE("sppl_to_addr1"));
		getHdr1R().sppl_addr2(_bindMSBEP2200.getStringNE("sppl_to_addr2"));
		getHdr1R().sppl_addr3(_bindMSBEP2200.getStringNE("sppl_to_addr3"));
		getHdr1R().sppl_addr4(_bindMSBEP2200.getStringNE("sppl_to_addr4"));
		getHdr1R().sppl_tel(_bindMSBEP2200.getStringNE("sppl_to_tel"));
		getHdr1R().sppl_fax(_bindMSBEP2200.getStringNE("sppl_to_fax"));
		getHdr1R().sppl_cntry_cd(_bindMSBEP2200.getStringNE("sppl_to_cntry_cd"));
		getHdr1R().sppl_cntry_nm(_bindMSBEP2200.getStringNE("sppl_to_cntry_nm"));
		getHdr1R().trd_cur_cd(_bindMSBEP2200.getStringNE("trd_cur_cd"));
		getHdr1R().trd_cur_nm(_bindMSBEP2200.getStringNE("trd_cur_nm"));
		getHdr1R().trd_cur_amt_dec_place(_bindMSBEP2200.getNumberNE("trd_cur_amt_dec_place"));
		getHdr1R().trd_cur_upri_dec_place(_bindMSBEP2200.getNumberNE("trd_cur_upri_dec_place"));
		getHdr1R().xrate_inpt_flg(_bindMSBEP2200.getBooleanNE("xrate_inpt_flg"));
		getHdr1R().xrate(_bindMSBEP2200.getNumberNE("xrate"));
		getHdr1R().src_xrate(_bindMSBEP2200.getNumberNE("xrate"));
		getHdr1R().ptax_cur_cd(_bindMSBEP2200.getStringNE("ptax_cur_cd"));
		getHdr1R().ptax_cur_nm(_bindMSBEP2200.getStringNE("ptax_cur_nm"));
		getHdr1R().ptax_cur_amt_dec_place(_bindMSBEP2200.getNumberNE("ptax_cur_amt_dec_place"));
		getHdr1R().ptax_cur_upri_dec_place(_bindMSBEP2200.getNumberNE("ptax_cur_upri_dec_place"));
		getHdr1R().ptax_xrate(_bindMSBEP2200.getNumberNE("ptax_xrate"));
		getHdr1R().src_ptax_xrate(_bindMSBEP2200.getNumberNE("ptax_xrate"));
		getHdr1R().ptax_xrate_inpt_flg(_bindMSBEP2200.getBooleanNE("ptax_xrate_inpt_flg"));
		getHdr1R().base_cur_cd(_bindMSBEP2200.getStringNE("base_cur_cd"));
		getHdr1R().base_cur_nm(_bindMSBEP2200.getStringNE("base_cur_nm"));
		getHdr1R().base_cur_amt_dec_place(_bindMSBEP2200.getNumberNE("base_cur_amt_dec_place"));
		getHdr1R().base_cur_upri_dec_place(_bindMSBEP2200.getNumberNE("base_cur_upri_dec_place"));
		getHdr1R().trnspt_cd(_bindMSBEP2200.getStringNE("trnspt_cd"));
		getHdr1R().trnspt_nm(_bindMSBEP2200.getStringNE("trnspt_nm"));
		getHdr1R().vssl_flght(_bindMSBEP2200.getStringNE("vssl_flght"));
		getHdr1R().load_port_cd(_bindMSBEP2200.getStringNE("load_port_cd"));
		getHdr1R().load_port_nm(_bindMSBEP2200.getStringNE("load_port_nm"));
		getHdr1R().etd_dt(_bindMSBEP2200.getDateNE("etd_dt"));
		getHdr1R().dschrg_port_cd(_bindMSBEP2200.getStringNE("dschrg_port_cd"));
		getHdr1R().dschrg_port_nm(_bindMSBEP2200.getStringNE("dschrg_port_nm"));
		getHdr1R().eta_dt(_bindMSBEP2200.getDateNE("eta_dt"));
		getHdr1R().via_port_cd(_bindMSBEP2200.getStringNE("via_port_cd"));
		getHdr1R().via_port_nm(_bindMSBEP2200.getStringNE("via_port_nm"));
		getHdr1R().via_schd_dt(_bindMSBEP2200.getDateNE("via_schd_dt"));
		getHdr1R().tterm_cd1(_bindMSBEP2200.getStringNE("tterm_cd1"));
		getHdr1R().tterm_nm1(_bindMSBEP2200.getStringNE("tterm_nm1"));
		getHdr1R().tterm_rmrks1(_bindMSBEP2200.getStringNE("tterm_rmrks1"));
		getHdr1R().tterm_cd2(_bindMSBEP2200.getStringNE("tterm_cd2"));
		getHdr1R().tterm_nm2(_bindMSBEP2200.getStringNE("tterm_nm2"));
		getHdr1R().tterm_rmrks2(_bindMSBEP2200.getStringNE("tterm_rmrks2"));
		getHdr1R().tterm_cd3(_bindMSBEP2200.getStringNE("tterm_cd3"));
		getHdr1R().tterm_nm3(_bindMSBEP2200.getStringNE("tterm_nm3"));
		getHdr1R().tterm_rmrks3(_bindMSBEP2200.getStringNE("tterm_rmrks3"));
		getHdr1R().trd_rmrks(_bindMSBEP2200.getStringNE("trd_rmrks"));
		getHdr1R().po_print_rmrks(_bindMSBEP2200.getStringNE("po_print_rmrks"));
		getHdr1R().cst_cd(_bindMSBEP2200.getStringNE("cst_cd"));
		getHdr1R().cst_nm(_bindMSBEP2200.getStringNE("cst_nm"));
		
		// 受注情報の設定
		getHdr1R().slo_trd_ptn_typ(_bindMSBEP2200.getStringNE("slo_trd_ptn_typ"));
		getHdr1R().slo_trd_ptn_typ_nm(_bindMSBEP2200.getStringNE("slo_trd_ptn_typ_nm"));
		getHdr1R().sls_basis_typ(_bindMSBEP2200.getStringNE("sls_basis_typ"));
		getHdr1R().sls_basis_typ_nm(_bindMSBEP2200.getStringNE("sls_basis_typ_nm"));
		getHdr1R().slo_cur_cd(_bindMSBEP2200.getStringNE("slo_cur_cd"));
		getHdr1R().slo_cur_nm(_bindMSBEP2200.getStringNE("slo_cur_nm"));
		getHdr1R().slo_xrate(_bindMSBEP2200.getNumberNE("slo_xrate"));
		getHdr1R().slo_ptax_xrate(_bindMSBEP2200.getNumberNE("slo_ptax_xrate"));
		getHdr1R().slo_tterm_cd1(_bindMSBEP2200.getStringNE("slo_tterm_cd1"));
		getHdr1R().slo_tterm_nm1(_bindMSBEP2200.getStringNE("slo_tterm_nm1"));
		getHdr1R().slo_tterm_rmrks1(_bindMSBEP2200.getStringNE("slo_tterm_rmrks1"));
		getHdr1R().slo_tterm_cd2(_bindMSBEP2200.getStringNE("slo_tterm_cd2"));
		getHdr1R().slo_tterm_nm2(_bindMSBEP2200.getStringNE("slo_tterm_nm2"));
		getHdr1R().slo_tterm_rmrks2(_bindMSBEP2200.getStringNE("slo_tterm_rmrks2"));
		getHdr1R().slo_tterm_cd3(_bindMSBEP2200.getStringNE("slo_tterm_cd3"));
		getHdr1R().slo_tterm_nm3(_bindMSBEP2200.getStringNE("slo_tterm_nm3"));
		getHdr1R().slo_tterm_rmrks3(_bindMSBEP2200.getStringNE("slo_tterm_rmrks3"));
	}
	
	protected void setDtl1ToHdr() {
		java.util.function.Function<String, Dtl1R> gl = col -> {
			MCList<Dtl1R> tmpL = getDtl1L().distinctNE(col);
			if (tmpL.size() == 1) {
				return tmpL.get(0);
			}
			return null;
		};
		Dtl1R trdR = gl.apply(Dtl1R.$trd_cd);
		if (!isNull(trdR)) {
			getHdr1R().trd_cd(trdR.trd_cd());
			getHdr1R().trd_nm(trdR.trd_nm());
			getHdr1R().trd_ptn_typ(trdR.trd_ptn_typ());
		}
		
		Dtl1R usrR = gl.apply(Dtl1R.$purc_usr_cd);
		if (!isNull(usrR)) {
			getHdr1R().purc_usr_cd(usrR.purc_usr_cd());
			getHdr1R().purc_usr_nm(usrR.purc_usr_nm());
		}
		else {
			getHdr1R().purc_usr_cd(null);
			getHdr1R().purc_usr_nm(null);
			getHdr1R().def_purc_dpt_cd(null);
		}
		
		Dtl1R dptR = gl.apply(Dtl1R.$purc_dpt_cd);
		if (!isNull(dptR)) {
			getHdr1R().purc_dpt_cd(dptR.purc_dpt_cd());
			getHdr1R().purc_dpt_nm(dptR.purc_dpt_nm());
			getHdr1R().purc_dpt_wg_cd(dptR.purc_dpt_wg_cd());
			getHdr1R().purc_dpt_wg_nm(dptR.purc_dpt_wg_nm());
			getHdr1R().ap_dpt_flg(dptR.ap_dpt_flg());
		}
		else {
			getHdr1R().purc_dpt_cd(null);
			getHdr1R().purc_dpt_nm(null);
			getHdr1R().purc_dpt_wg_cd(null);
			getHdr1R().purc_dpt_wg_nm(null);
			getHdr1R().ap_dpt_flg(false);
		}
	}
	@Override
	protected String getInvisibleKey() {
		return "PURC_ONLY_ITEM";
	}
	@Override
	protected void setInvisibleOther() {
		// 何もしない
	}
	
	@Override
	protected void setupParts() {
		super.setupParts();
		// 基準日の再設定
		Hdr1_purc_usr_dpt_p_PPanel.setRelateBeans(Hdr1_dpt_base_dt, Hdr1_inherited_src_no);
		Dtl1_usr_dpt_p_PPanel.setRelateBeans(Hdr1_dpt_base_dt, Hdr1_inherited_src_no);
		
		setupPartsFixMode();
	}
	
	protected void setupPartsFixMode() {
		
		Hdr1R hdr1R = getHdr1R();
		
		// 為替レート、納税為替レート
		// 確定オフのときは編集不可
		boolean schdXrateInptFlg = hdr1R.fix_flg() ? true : false;
		Hdr1_xrate_p_PPanel.setRelateBeans(
			Hdr1_trd_cur_cd, Hdr1_base_cur_cd, Hdr1_purc_xrate_cd,
			Hdr1_xrate_base_dt, true, Hdr1_xrate_inpt_flg, schdXrateInptFlg);
		Hdr1_ptax_xrate_p_PPanel.setRelateBeans(
			Hdr1_trd_cur_cd, Hdr1_ptax_cur_cd, Hdr1_purc_xrate_cd,
			Hdr1_xrate_base_dt, true, Hdr1_ptax_xrate_inpt_flg, schdXrateInptFlg);
			
		// 税指定、税ＣＤ
		// 確定オフのときは編集可
		boolean schd = isNull(hdr1R.po_no()) ? false : true;
		Dtl1_trd_cur_upri_p_PPanel.setSchd(schd);
	}
	
	@Override
	protected void linkBeansToISPanel() {
		super.linkBeansToISPanel();
		// 基準日の再設定
		getHdr1_sppl_cd_ListPutter().putBind(BpCols.$i_dt, Hdr1_dpt_base_dt);
		getHdr1_in_to_id_cd_ListPutter().putBind(InToIdCols.$i_base_dt, Hdr1_purc_dt);
		getHdr1_purc_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter().putBind(DptCols.$i_dt, Hdr1_dpt_base_dt);
		getDtl1_ap_dpt_cd_ListPutter().putBind(DptCols.$i_dt, Hdr1_dpt_base_dt);
		getDtl1_bd_p_PPanel_columnBdItem_bd_dpt_cd_ListPutter().putBind(DptCols.$i_dt, Hdr1_dpt_base_dt);
		getDtl1_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter().putBind(DptCols.$i_dt, Hdr1_dpt_base_dt);
	}
	
	@Override
	protected void valueInitSub() {
		super.valueInitSub();
		
		// メニューから起動
		if (Cnd_ope_INS.isSelected() && !_booMSBEP2200) {
			setValueEx(Hdr1_fix_flg, true);
			setValueEx(Hdr1_rcpt_iv_src_typ, MSC_RCPT_IV_SRC_TYP.PURC.value());
			setValueEx(Hdr1_in_to_id_typ, MSC_IN_TO_ID_TYP.LOC.value());
		}
		
		setValueEx(Hdr1_iv_dt, getToday());
		setValueEx(Hdr1_purc_xrate_cd, getCo().purc_xrate_cd());
		setValueEx(Hdr1_base_cur_cd, getBaseCur().cur_cd());
		setValueEx(Hdr1_base_cur_nm, getBaseCur().cur_nm());
		setValueEx(Hdr1_ptax_cur_cd, getPtaxCur().cur_cd());
		setValueEx(Hdr1_ptax_cur_nm, getPtaxCur().cur_nm());	
	}
	
	@Override
	public MCCheckBox getRegLatestFlg() {
		return Hdr1_latest_flg;
	}
	
	@Override
	protected void beforeDoOpeChngNC(MCEventInfo info, IfOpePanel p, String bfOpe, String afOpe, String bfSt, String afSt) {
		super.beforeDoOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);
		
		// 登録種別から別種別に変更時、受領インボイスNOをコピー
		if (isSame(bfOpe, Cnd_ope_INS.getActionCommand())) {
			getCndR().rcpt_iv_mng_no(getHdr1R().rcpt_iv_mng_no());
			getCndR().rcpt_iv_no(getHdr1R().rcpt_iv_no());
		}
	}
	
	@Override
	protected boolean doOpeChngVC(MCEventInfo info, IfOpePanel p, String bfOpe, String afOpe, String bfSt) {
		// 参照新規時
		if (isSame(afOpe, Cnd_ope_INS.getActionCommand())
				&& isSame(bfOpe, Cnd_ope_REF.getActionCommand()) && isREFStatus(bfSt)) {
			for (Dtl1R dtlR : (MCList<Dtl1R>)getDtl1L()) {
				if (dtlR.purc_ddlv_flg()) {
					dialog(MSBEP0106);
					return false;
				}
				else if (dtlR.non_purc_flg()) {
					dialog(MSBEP0107);
					return false;
				}
			}
		}
		return super.doOpeChngVC(info, p, bfOpe, afOpe, bfSt);
	}
	
	@Override
	protected void setRefToInsInit() {
		super.setRefToInsInit();
		
		_booMSBEP2200 = false;
		_bindMSBEP2200 = MCRow.create();
		_msbep2200Rslt = null;
		
		// ヘッダ
		getHdr1R().rcpt_iv_no(null);
		getHdr1R().rcpt_iv_mng_no(null);
		getHdr1R().rcpt_iv_rev(null);
		getHdr1R().purc_schd_dt(null);
		getHdr1R().purc_ac_schd_dt(null);
		
		// 明細
		for (Dtl1R dtlRow : (MCList<Dtl1R>)getDtl1L()) {
			if (dtlRow.isEmpty()) {
				continue;
			}
			dtlRow.temp_ap_flg(false);
			dtlRow.po_no(null);
			dtlRow.purc_act_no(null);
			dtlRow.purc_act_seq(null);
			dtlRow.purc_act_rev(null);
			dtlRow.rcpt_iv_d_no(null);
			dtlRow.manual_add_flg(false);
		}
	}
	
	@Override
	protected int getMaxValue(MCList<?> list, String colNm) {
		if (isNull(list)) {
			// 確定オフの取消済みを表示した場合に限り、listが0件になる
			return 0;
		}
		return super.getMaxValue(list, colNm);
	}

	@Override
	protected void opePanelFillSpace() {
		if (getHdr1R().iv_reg_flg()) {
			// 紐付NO初期化
			initMaxPegNo();
		}
		else {
			super.opePanelFillSpace();
		}
	}
	
	// -----------------------------------------------
	// Event
	@Override
	protected void listenerInit() {
		super.listenerInit();
		Hdr1_purc_usr_cd.addLCListener(this);
		Hdr1_purc_dpt_cd.addLCListener(this);
		columnDtl1_purc_dpt_cd.addLCListener(this);
		
		getHdr1R().addRowListener(createHdrRowListener());
	}
	
	
	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		
		if (lc == Hdr1_purc_usr_cd) {
			doHdr1_purc_usr_cd_LC(info);
		}
		else if (lc == Hdr1_purc_dpt_cd) {
			doHdr1_purc_dpt_cd_LC(info);
		}
		else if (lc == columnDtl1_purc_dpt_cd) {
			doDtl1_purc_dpt_cd_LC(info);
		}
	}
	
	@Override
	public void doCnd_srch_po(MCEventInfo info) {
		callMS_MSBEL2210_Srch01();
	}
	@Override
	public void doCnd_srch_purc(MCEventInfo info) {
		callMS_MSBEL2210_Srch02();
	}
	@Override
	public void doDtl1Btn_rdel(MCEventInfo info) {
		super.doDtl1Btn_rdel(info);
		setFixFlgMode();
		setHdrMode();
	}
	@Override
	public void doBtn_ins(MCEventInfo info) {
		callMS_MSBEL2210_Iv_Ins01();
	}
	@Override
	public void doBtn_ins_noschd(MCEventInfo info) {
		callMS_MSBEL2210_Iv_Ins01();
	}
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBEL2210_Iv_Upd01();
	}
	@Override
	public void doBtn_upd_noschd(MCEventInfo info) {
		callMS_MSBEL2210_Iv_Upd01();
	}
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBEL2210_Iv_Del01();
	}
	@Override
	public void doBtn_del_noschd(MCEventInfo info) {
		callMS_MSBEL2210_Iv_Del01();
	}
	
	protected MCRowListener createHdrRowListener() {
		return new Hdr1RowListener();
	}
	public class Hdr1RowListener implements MCRowListener{
		@Override
		public void valueChanged(MCRowEvent event) {
			Hdr1R hdr1R = getHdr1R();
			if (isSame(event.getColumn(), Hdr1R.$iv_dt) && !hdr1R.fix_flg()) {
				setValueEx(Hdr1_xrate_base_dt, event.getNewValue());
				setValueEx(Hdr1_dpt_base_dt, event.getNewValue());
			}
			else if (isSame(event.getColumn(), Hdr1R.$purc_dt) && hdr1R.fix_flg()) {
				setValueEx(Hdr1_xrate_base_dt, event.getNewValue());
			}
			else if (isSame(event.getColumn(), Hdr1R.$ac_dt) && hdr1R.fix_flg()) {
				setValueEx(Hdr1_dpt_base_dt, event.getNewValue());
			}
		}
	} 
	
	@Override
	protected MCRowStatusListener createDtlRowListener() {
		return new Dtl1RowListenerAdd();
	}
	public class Dtl1RowListenerAdd extends Dtl1RowListener {
		@Override
		public void statusChanged(MCRowStatusEvent event) {
			super.statusChanged(event);
			if (event.getNewStatus() == MCRow.CREATE) {
				Dtl1R r = (Dtl1R)event.getSourceRow();
				r.manual_add_flg(true);
			}
			if (getStatus() != REF
				&& isSame(event.getNewStatus(), Status.CREATE)
				&& isSame(event.getOldStatus(), Status.NONE)) {
				Dtl1R r = (Dtl1R) event.getSourceRow();
				copyHdrToDtl(r);
			}
		}
	} 
	
	@Override
	public void doDtl1Btn_open_MSBEP2240(MCEventInfo info) {
		MCRow bind = MCRow.create();
		Hdr1R hR = getHdr1R();

		// バインド値のセット
		// [バインド値１] MSBEP2240：検索項目
		// 発注情報
		bind.addStringColumn("in_to_id_typ", hR.in_to_id_typ());
		bind.addStringColumn("in_to_id_cd", hR.in_to_id_cd());
		bind.addStringColumn("in_to_id_nm", hR.in_to_id_nm());
		bind.addStringColumn("in_to_zip_cd", hR.sppl_zip_cd());
		bind.addStringColumn("in_to_addr1", hR.sppl_addr1());
		bind.addStringColumn("in_to_addr2", hR.sppl_addr2());
		bind.addStringColumn("in_to_addr3", hR.sppl_addr3());
		bind.addStringColumn("in_to_addr4", hR.sppl_addr4());
		bind.addStringColumn("in_to_tel", hR.sppl_tel());
		bind.addStringColumn("in_to_fax", hR.sppl_fax());
		bind.addStringColumn("in_to_cntct_dpt", hR.sppl_cntct_dpt());
		bind.addStringColumn("in_to_cntct_psn", hR.sppl_cntct_psn());
		bind.addStringColumn("in_to_cntry_cd", hR.sppl_cntry_cd());
		bind.addStringColumn("sppl_cd", hR.sppl_cd());
		bind.addStringColumn("trd_cur_cd", hR.trd_cur_cd());
		// 受注情報
		bind.addStringColumn("slo_cur_cd", hR.slo_cur_cd());
		bind.addStringColumn("cst_cd", hR.cst_cd());
		bind.addStringColumn("slo_trd_ptn_typ", hR.slo_trd_ptn_typ());
		bind.addStringColumn("sls_basis_typ", hR.sls_basis_typ());
		bind.addStringColumn("slo_tterm_cd1", hR.slo_tterm_cd1());
		bind.addStringColumn("slo_tterm_cd2", hR.slo_tterm_cd2());
		bind.addStringColumn("slo_tterm_cd3", hR.slo_tterm_cd3());
		
		// [バインド値２] MSBEP2240：明細比較項目
		bind.addStringColumn("purc_tterm_cd1", hR.tterm_cd1());
		bind.addStringColumn("purc_tterm_nm1", hR.tterm_nm1());
		bind.addStringColumn("purc_tterm_rmrks1", hR.tterm_rmrks1());
		bind.addStringColumn("purc_tterm_cd2", hR.tterm_cd2());
		bind.addStringColumn("purc_tterm_nm2", hR.tterm_nm2());
		bind.addStringColumn("purc_tterm_rmrks2", hR.tterm_rmrks2());
		bind.addStringColumn("purc_tterm_cd3", hR.tterm_cd3());
		bind.addStringColumn("purc_tterm_nm3", hR.tterm_nm3());
		bind.addStringColumn("purc_tterm_rmrks3", hR.tterm_rmrks3());
		bind.addBooleanColumn("xrate_inpt_flg", hR.xrate_inpt_flg());
		bind.addNumberColumn("xrate", hR.xrate());
		bind.addBooleanColumn("ptax_xrate_inpt_flg", hR.ptax_xrate_inpt_flg());
		bind.addNumberColumn("ptax_xrate", hR.ptax_xrate());
		bind.addStringColumn("trnspt_cd", hR.trnspt_cd());
		bind.addStringColumn("trnspt_nm", hR.trnspt_nm());
		bind.addStringColumn("vssl_flght", hR.vssl_flght());
		bind.addStringColumn("load_port_cd", hR.load_port_cd());
		bind.addStringColumn("load_port_nm", hR.load_port_nm());
		bind.addDateColumn("etd_dt", hR.etd_dt());
		bind.addStringColumn("dschrg_port_cd", hR.dschrg_port_cd());
		bind.addStringColumn("dschrg_port_nm", hR.dschrg_port_nm());
		bind.addDateColumn("eta_dt", hR.eta_dt());
		bind.addStringColumn("via_port_cd", hR.via_port_cd());
		bind.addStringColumn("via_port_nm", hR.via_port_nm());
		bind.addDateColumn("via_schd_dt", hR.via_schd_dt());
		bind.addStringColumn("slo_tterm_rmrks1", hR.slo_tterm_rmrks1());
		bind.addStringColumn("slo_tterm_rmrks2", hR.slo_tterm_rmrks2());
		bind.addStringColumn("slo_tterm_rmrks3", hR.slo_tterm_rmrks3());
		bind.addNumberColumn("slo_xrate", hR.slo_xrate());
		bind.addNumberColumn("slo_ptax_xrate", hR.slo_ptax_xrate());
	
		// 仕入予定日
		bind.addDateColumn("purc_schd_dt", hR.purc_schd_dt());
		
		bind.addBooleanColumn("has_arr_basis_flg", hasArrBasis());
		
		// 受領インボイス
		bind.addStringColumn("rcpt_iv_no", hR.rcpt_iv_no());
		bind.addStringColumn("rcpt_iv_src_typ", hR.rcpt_iv_src_typ());
		
		openPanel("MS", "MSBEP2240", T1, bind, this);
	}
	
	@Override
	public void doCnd_rcpt_iv_no_LC(MCEventInfo info) {
		super.doCnd_rcpt_iv_no_LC(info);
		CndR cR = getCndR();
		cR.rcpt_iv_mng_no(null);
	}
	
	@Override
	public boolean doHdr1_fix_flg_VC(MCEventInfo info) {
		Hdr1R hR = getHdr1R();
		// 確定オンで登録した受領インボイスに対し、確定オン→オフに変更した場合にメッセージで確認
		if (hR.fix_flg() && hR.bef_fix_flg()) {
			if (MCMessageBox.YES_OPTION != confirm(MSBEL1129)) {
				return false;
			}
		}
		return super.doHdr1_fix_flg_VC(info);
	}
	
	@Override
	public void doHdr1_fix_flg_NC(MCEventInfo info) {
		super.doHdr1_fix_flg_NC(info);
		
		Hdr1R hR = getHdr1R();
		if (hR.fix_flg()) {
			setValueEx(Hdr1_purc_dt, nvl(hR.purc_schd_dt(), getToday()));
			setValueEx(Hdr1_ac_dt, nvl(hR.purc_ac_schd_dt(), getToday()));
		}
		
		// フォーカス行退避
		int idx = Dtl1Table.getMCSelectedRow();
		
		MCList<Dtl1R> dL = getDtl1L();
		dL.forEach(r -> {
			r.pay_crryovr_times(r.bef_pay_crryovr_times());
			if (hR.fix_flg()) {
				
				// 詳細枠の表示を切り替えつつ設定する
				Dtl1Table.selectRowNoFocus(r.getGUIIndex());
				
				if (MAC_PURC_BASIS_TYP.isARR_BASIS(r.purc_basis_typ())) {
					setValueEx(columnDtl1_sync_flg, r.getGUIIndex(), true);
					setDefaultQualityTyp(r);
				}
				else if (!isSame(r.sync_flg(), r.old_sync_flg())) {
					setValueEx(columnDtl1_sync_flg, r.getGUIIndex(), r.old_sync_flg());
				}
			}
			else if ((boolean)info.getOldValue()) {
				// 確定オンの時の値を退避
				r.old_sync_flg(r.sync_flg());
			}
		});
		
		if (idx >= 0) {
			Dtl1Table.selectRowNoFocus(idx);
		}
		
		setupPartsFixMode();
		setFixMode();
		setBtnMode();
	}
	
	@Override
	public void doHdr1_sppl_cd_LC(mcframe.clientCore.event.MCEventInfo info) {
		super.doHdr1_sppl_cd_LC(info);
		
		// 国は納入先の値を連携する
		setValueEx(Hdr1_sppl_cntry_cd, null);
		setValueEx(Hdr1_sppl_cntry_nm, null);
		
		setHdrMode();
	}
	
	@Override
	public void doHdr1_trd_cd_LC(MCEventInfo info) {
		super.doHdr1_trd_cd_LC(info);
	
		copyHdrToDtl(info, columnDtl1_trd_cd);
	}
	
	public void doHdr1_purc_usr_cd_LC(MCEventInfo info) {
		copyHdrToDtl(info, columnDtl1_purc_usr_cd);
	}
	
	public void doHdr1_purc_dpt_cd_LC(MCEventInfo info) {
		copyHdrToDtl(info, columnDtl1_purc_dpt_cd);
	}
	
	@Override
	public void doHdr1_in_to_id_cd_LC(MCEventInfo info) {
		super.doHdr1_in_to_id_cd_LC(info);
			
		// 住所などを連携
		setValueEx(Hdr1_in_to_id_cd_dmy, info.getNewValue());
		
		// 計画外の場合のみ、明細に反映する（計画外の場合は「場所」固定）
		Hdr1R hdr1R = getHdr1R();
		if (isNull(hdr1R.po_no())) {
			
			// フォーカス行退避
			int idx = Dtl1Table.getMCSelectedRow();
			
			for (Dtl1R r : (MCList<Dtl1R>)getDtl1L()) {
				if (!r.isEmpty()) {
					// 詳細枠の表示を切り替えつつ初期化する
					Dtl1Table.selectRowNoFocus(r.getGUIIndex());
					
					setValueEx(columnDtl1_dlv_loc_cd, r.getGUIIndex(), info.getNewValue());
				}
			}
			if (idx >= 0) {
				Dtl1Table.selectRowNoFocus(idx);
			}
		}
	}
	
	protected void copyHdrToDtl(MCEventInfo fr, MCColumnConfig to) {
		for (Dtl1R r : (MCList<Dtl1R>)getDtl1L()) {
			if (!r.isEmpty()
				&& isEditable(to, r.getGUIIndex())
				&& to.checkValue( fr.getNewValue(), r.getGUIIndex())) {
				setValueEx(to, r.getGUIIndex(), fr.getNewValue());
			}
		}
	}
	protected void copyHdrToDtl(Dtl1R r) {
		Hdr1R hdr1R = getHdr1R();
		if (isNull(hdr1R.po_no())) {
			setValueEx(columnDtl1_dlv_loc_cd, r.getGUIIndex(), hdr1R.in_to_id_cd());
		}
		if (isEditable(columnDtl1_trd_cd, r.getGUIIndex()) && isNull(r.trd_cd())) {
			setValueEx(columnDtl1_trd_cd, r.getGUIIndex(), hdr1R.trd_cd());
		}
		if (isEditable(columnDtl1_purc_usr_cd, r.getGUIIndex()) && isNull(r.purc_usr_cd())) {
			setValueEx(columnDtl1_purc_usr_cd, r.getGUIIndex(), hdr1R.purc_usr_cd());
		}
		if (isEditable(columnDtl1_purc_dpt_cd, r.getGUIIndex()) && isNull(r.purc_dpt_cd())) {
			setValueEx(columnDtl1_purc_dpt_cd, r.getGUIIndex(), hdr1R.purc_dpt_cd());
		}
	}
	
	@Override
	public void doHdr1_purc_schd_dt_LC(MCEventInfo info) {
		super.doHdr1_purc_schd_dt_LC(info);
		
		if (!getHdr1R().fix_flg()) {
			setValueEx(Hdr1_purc_ac_schd_dt, getHdr1R().purc_schd_dt());
			setDefaultTaxCd(false);
		}
	}
	
	@Override
	@SuppressWarnings("unchecked")
	protected void doDtl1_itm_LC(MCEventInfo info) {
		// super.doDtl1_itm_LC で棚・ラインを設定しているため、先に補完する
		setDlvLocCd(info);
		
		super.doDtl1_itm_LC(info);
		MCList<Dtl1R> dtl1L = getDtl1L();
		Dtl1R r = dtl1L.get(info.getEventIndex());
		setFixFlgMode();
		setHdrMode();
		if (Dtl1_itm_p_PPanel.isItmFix(info.getEventIndex())) {
			setIvItmNm(r);
		}
		else {
			r.iv_itm_nm(null);
		}
		
		// 同時計上フラグを退避（確定オン⇔オフの切り替え時に復活させるため）
		r.old_sync_flg(r.sync_flg());
	}
	
	public void doDtl1_purc_dpt_cd_LC(MCEventInfo info) {
		MCList<Dtl1R> dtl1L = getDtl1L();
		Dtl1R r = dtl1L.get(info.getEventIndex());
		setDtlApDptCd(r);
	}
	
	/**
	 * 納入場所を補完する
	 */
	@SuppressWarnings("unchecked")
	protected void setDlvLocCd(MCEventInfo info) {
		MCList<Dtl1R> dtl1L = getDtl1L();
		Dtl1R r = dtl1L.get(info.getEventIndex());
		
		if (!getHdr1R().fix_flg()
			&& isNullAnd(r.purc_schd_no(), r.dlv_loc_cd())) {
			
			for (Dtl1R baseR : dtl1L) {
				if (!isNull(baseR.dlv_loc_cd())) {
					// 未確定かつ行追加後に場所が補完されていない明細に対してのみ、納入場所を補完する
					// 納入場所（納入場所ＷＧ）は単価取得に使用する
					setValueEx(columnDtl1_dlv_loc_cd, r.getGUIIndex(), baseR.dlv_loc_cd());
					break;
				}
			}
		}
	}
	
	@Override
	protected void setDefaultTaxCd(mcframe.clientMSBD.MSBDP0140.Dtl1R dtlR, boolean setTaxFixFlg) {
		if (dtlR.non_purc_flg()) {
			return;
		}
		String taxCd = MSUCP_PurcUtil.getPurcTaxCd(
				dtlR.itm_cd(), 
				dtlR.itm_sub1(), 
				dtlR.itm_sub2(), 
				dtlR.itm_sub3(), 
				Hdr1_sppl_cd.getValue(), 
				getHdr1R().fix_flg() ? getHdr1R().purc_dt() : nvl(getHdr1R().purc_schd_dt(), getHdr1R().iv_dt()),
				this);
		setValueEx(columnDtl1_tax_cd, dtlR.getGUIIndex(), taxCd);
		if (setTaxFixFlg) {
			dtlR.tax_fix_flg(false);
		}
	}
	
	protected void setDtlApDptCd(Dtl1R r) {
		if (isNull(getHdr1R().mst_ap_dpt_cd())) {
			if (isNull(r.purc_dpt_cd())) {
				setValueEx(columnDtl1_ap_dpt_cd, r.getGUIIndex(), null);
			}
			else {
				if (r.ap_dpt_flg()) {
					setValueEx(columnDtl1_ap_dpt_cd, r.getGUIIndex(), r.purc_dpt_cd());
				}
				else {
					setValueEx(columnDtl1_ap_dpt_cd, r.getGUIIndex(), null);
				}
			}
		}
	}

	@Override
	protected boolean hasCost(mcframe.clientMSBD.MSBDP0140.Dtl1R dtlR) {
		// 仕入対象外も金額設定不可
		return super.hasCost(dtlR) && !dtlR.non_purc_flg();
	}
	
	@Override
	protected MCMessageList checkSubCon() {
		MCMessageList msgL = new MCMessageList();
		if (!_booMSBEP2200 && isNull(getHdr1R().po_no()) && getHdr1R().subcon_flg()) {
			// 計画外で下請対象の発注先を選択した場合
			msgL.add(new MCMessage(MSBDP0030, getHdr1R().sppl_cd()));
		}
		return msgL;
	}
	@Override
	protected MCMessageList checkSpplIv() {
			MCMessageList msgL = new MCMessageList();
			Hdr1R hdr1R = getHdr1R();
			if (!isNull(hdr1R.sppl_cd()) && !hdr1R.sppl_iv_flg()) {
				// インボイス取引対象外の発注先を選択した場合
				msgL.add(new MCMessage(MSBEP0103, hdr1R.sppl_cd()));
			}
			return msgL;
	}
	
	@Override
	protected boolean isCopyTrdUnitCdFromDtl1ToDtl2(
			MCEventInfo info,
			mcframe.clientMSBD.MSBDP0140.Dtl2R tgtIoRow,
			mcframe.clientMSBD.MSBDP0140.Dtl1R dtlRow) {
		
		if (!super.isCopyTrdUnitCdFromDtl1ToDtl2(info, tgtIoRow, dtlRow)) {
			return false;
		}
		
		if (!getHdr1R().fix_flg()
			&& !isNull(tgtIoRow.arr_act_no())) {
			// 確定オフの場合、入荷がある場合はコピーしない
			return false;
		}
		
		return true;
	}
	@Override
	protected boolean isCopyTrdUnitQtyFromDtl1ToDtl2(
			MCEventInfo info,
			mcframe.clientMSBD.MSBDP0140.Dtl2R tgtIoRow,
			mcframe.clientMSBD.MSBDP0140.Dtl1R dtlRow) {
		
		if (!super.isCopyTrdUnitQtyFromDtl1ToDtl2(info, tgtIoRow, dtlRow)) {
			return false;
		}
		if (!getHdr1R().fix_flg()
			&& !isNull(tgtIoRow.arr_act_no())) {
			
			if (!isSame(tgtIoRow.trd_unit_cd(), dtlRow.trd_unit_cd())) {
				// 確定オフの場合、取引単位が異なる場合はコピーしない
				return false;
			}
			else if (((MCNumber)info.getNewValue()).gt(tgtIoRow.old_trd_unit_qty())) {
				// 確定オフの場合、入荷数を超える値はコピーしない
				return false;
			}
		}
		
		return true;
	}
	
	// -----------------------------------------------
	// status
	@Override
	public void setINSStatus() {
		// 確定フラグはイベントを起こさない
		// 仕入日や計上日のvalueChangedで確定フラグを参照しているので先に設定する
		getHdr1R().fix_flg(true);
		setupPartsFixMode();
		
		super.setINSStatus();
		
		setValueEx(Hdr1_iv_dt, getToday());
		setValueEx(Hdr1_rcpt_iv_src_typ, MSC_RCPT_IV_SRC_TYP.PURC.value());
		setValueEx(Hdr1_in_to_id_typ, MSC_IN_TO_ID_TYP.LOC.value());
		
		setHdrMode();
		setFixFlgMode();
		setAbortFlgMode();
		
		getHdr1R().setStatus(MCRow.NONE);
	}
	
	@Override
	public void setINS_SCHDStatus() {
		// 確定フラグはイベントを起こさない
		// 仕入日や計上日のvalueChangedで確定フラグを参照しているので先に設定する
		getHdr1R().fix_flg(false);
		setupPartsFixMode();
		
		super.setINS_SCHDStatus();
		
		setValueEx(Hdr1_iv_dt, getToday());
		setValueEx(Hdr1_purc_ac_schd_dt, Hdr1_purc_schd_dt.getValue());;
		
		// 継承元のsetINSStatusで設定されるのでクリアする
		setValueEx(Hdr1_purc_dt, null);
		setValueEx(Hdr1_ac_dt, null);
		
		setHdrMode();
		setFixMode();
		setAbortFlgMode();
		setBtnMode();
		setFixFlgMode();
	}
	
	@Override
	public void setFIX_IStatus() {
		super.setFIX_IStatus();
		setAbortFlgMode();
		Cnd_srch_po.setMode(MCMode.DISABLE);
	}
	
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		setAbortFlgMode();
	}
	
	@Override
	public void setSRCH_UPDStatus() {
		super.setSRCH_UPDStatus();
		setAbortFlgMode();
	}
	
	@Override
	public void setUPDStatus() {
		setupPartsFixMode();
		super.setUPDStatus();
		setHdrMode();
		setFixFlgMode();
		setAbortFlgMode();
	}
	
	@Override
	public void setUPD_SCHDStatus() {
		setupPartsFixMode();
		super.setUPD_SCHDStatus();
		setHdrMode();
		setBtnMode();
		setFixMode();
		setFixFlgMode();
		setAbortFlgMode();
	}
	
	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		setAbortFlgMode();
	}
	
	@Override
	public void setDELStatus() {
		super.setDELStatus();
		setAbortFlgMode();
	}
	
	@Override
	public void setDEL_SCHDStatus() {
		super.setDEL_SCHDStatus();
		setAbortFlgMode();
	}
	
	@Override
	public void setFIX_DStatus() {
		super.setFIX_DStatus();
		setAbortFlgMode();
	}
	
	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setAbortFlgMode();
	}
	
	@Override
	protected void setSrchTgtTyp() {
		// 何もしない（検索条件は受領Ｉ／ＶＮＯ固定）
	}
	
	/**
	 * ヘッダ枠の入力制御
	 */
	protected void setHdrMode() {
		if (isAllDtlNonPurc()) {
			// 確定フラグ
			setValueEx(Hdr1_fix_flg, false);
			Hdr1_fix_flg.setMode(MCMode.READ_ONLY);
			
			// 仕入予定日、仕入計上予定日、支払起算日、支払予定日
			Hdr1_purc_schd_dt.setMode(MCMode.READ_ONLY);
			Hdr1_purc_ac_schd_dt.setMode(MCMode.READ_ONLY);
			Hdr1_pay_schd_dt.setMode(MCMode.READ_ONLY);
			Hdr1_pay_basis_dt.setMode(MCMode.READ_ONLY);
			setValueEx(Hdr1_purc_schd_dt, null);
			setValueEx(Hdr1_purc_ac_schd_dt, null);
			setValueEx(Hdr1_pay_schd_dt, null);
			setValueEx(Hdr1_pay_basis_dt, null);
		}
		else {
			// 確定フラグ
			setDefaultMode(Hdr1_fix_flg);
			
			// 仕入予定日、仕入計上予定日、支払起算日、支払予定日
			if (getHdr1R().fix_flg()) {
				Hdr1_purc_schd_dt.setMode(MCMode.READ_ONLY);
				Hdr1_purc_ac_schd_dt.setMode(MCMode.READ_ONLY);
			}
			else {
				setDefaultMode(Hdr1_purc_schd_dt);
				setDefaultMode(Hdr1_purc_ac_schd_dt);
			}
			if (_bindMSBEP2200.getBooleanNE("pay_spot_flg")
				|| getHdr1R().pay_spot_flg()) {
				Hdr1_pay_basis_dt.setMode(MCMode.READ_ONLY);
				Hdr1_pay_schd_dt.setMode(MCMode.REQUIRED);
				setValueEx(Hdr1_pay_basis_dt, null);
			}
			else {
				Hdr1_pay_basis_dt.setMode(MCMode.REQUIRED);
				Hdr1_pay_schd_dt.setMode(MCMode.READ_ONLY);
				setValueEx(Hdr1_pay_schd_dt, null);
			}
		}
		
		// 三国間で販売側のインボイスが登録済みの場合、インボイス関連の項目は編集不可
		if (getHdr1R().iv_reg_flg()) {
			Hdr1_rcpt_iv_no.setMode(MCMode.READ_ONLY);
			Hdr1_purc_schd_dt.setMode(MCMode.READ_ONLY);
			Hdr1_trnspt_cd.setMode(MCMode.READ_ONLY);
			Hdr1_vssl_flght.setMode(MCMode.READ_ONLY);
			Hdr1_load_port_cd.setMode(MCMode.READ_ONLY);
			Hdr1_etd_dt.setMode(MCMode.READ_ONLY);
			Hdr1_dschrg_port_cd.setMode(MCMode.READ_ONLY);
			Hdr1_eta_dt.setMode(MCMode.READ_ONLY);
			Hdr1_via_port_cd.setMode(MCMode.READ_ONLY);
			Hdr1_via_schd_dt.setMode(MCMode.READ_ONLY);
		}
		
		if (hasArrBasis()) {
			Hdr1_purc_schd_dt.setMode(MCMode.READ_ONLY);
		}
	}
	/**
	 * ボタン制御
	 */
	@Override
	protected void setBtnMode() {
		super.setBtnMode();
		
		if (getDtl1L().size() == 0) {
			return;
		}
		
		// 仕入予定NOでの検索は画面遷移時のみ
		Cnd_srch_po.setVisible(false);
		Cnd_srch_purc.setVisible(true);
		
		Dtl1R dtl1R = (Dtl1R)Dtl1Table.getSelectedMCRow();
		if (!isNull(dtl1R) && !isNull(dtl1R.purc_schd_no())) {
			Dtl1Btn_rcopy.setMode(MCMode.DISABLE);
		}
		
		Hdr1R hdr1R = getHdr1R();
		if (!hdr1R.fix_flg()) {
			// 未確定の場合は押下不可
			Dtl1Btn_menu_move_p_PPanel.setDISABLEStatus();
		}
		else {
			Dtl1Btn_menu_move_p_PPanel.setStatus(Dtl1Btn_menu_move_p_PPanel.getStatus(getStatus()));
		}
		
		if (!hdr1R.fix_flg()) {
			if (MSC_RCPT_IV_SRC_TYP.isARR_SCHD(hdr1R.rcpt_iv_src_typ())) {
				// 入荷予定をもとに作成している場合はすべて押下不可
				Dtl2Btn_radd.setMode(MCMode.DISABLE);
				Dtl2Btn_rdel.setMode(MCMode.DISABLE);
				Dtl2Btn_rcopy.setMode(MCMode.DISABLE);
			}
			else {
				// 入荷実績をもとに作成している場合は行削除のみ可
				Dtl2Btn_radd.setMode(MCMode.DISABLE);
				setDefaultMode(Dtl2Btn_rdel);
				Dtl2Btn_rcopy.setMode(MCMode.DISABLE);
			}
		}
		else {
			setDefaultMode(Dtl2Btn_radd);
			setDefaultMode(Dtl2Btn_rdel);
			setDefaultMode(Dtl2Btn_rcopy);
		}
		
		// 三国間で販売側のインボイスが登録済みの場合、インボイス関連の項目は編集不可
		if (getHdr1R().iv_reg_flg()) {
			Dtl1Btn_open_MSBEP2240.setMode(MCMode.DISABLE);
			Dtl1Btn_radd.setMode(MCMode.DISABLE);
			Dtl1Btn_rdel.setMode(MCMode.DISABLE);
			Dtl1Btn_rcopy.setMode(MCMode.DISABLE);
			Dtl2Btn_radd.setMode(MCMode.DISABLE);
		}
	}
	
	@SuppressWarnings("unchecked")
	protected void setFixMode() {
		
		// コンテナのステータスを退避
		saveStatus();
		
		Hdr1R hR = getHdr1R();
		
		// ヘッダ、明細、詳細のモード設定
		java.util.function.Consumer<List<MCModeBeans>> mode = itms -> {
			for (MCModeBeans itm : itms) {
				if (itm == columnDtl1_abort_flg) {
					if (columnDtl1_abort_flg.getMode() == MCMode.INVISIBLE) {
						continue;
					}
				}
				
				if (hR.fix_flg()) {
					setDefaultMode(itm);
				}
				else {
					itm.setMode(MCMode.READ_ONLY);
				}
			}
		};
		mode.accept(getFixItmsHdr());
		mode.accept(getFixItmsDtl());
		mode.accept(getFixItmsIo());
		
		// 確定時は不可
		if (hR.fix_flg()) {
			Hdr1_purc_schd_dt.setMode(MCMode.READ_ONLY);
			Hdr1_purc_ac_schd_dt.setMode(MCMode.READ_ONLY);
			
			// 「登録する」の時のみクリアする
			// ※確定オンの場合は予定日更新対象外
			if (Cnd_ope_INS.isSelected()) {
				setValueEx(Hdr1_purc_schd_dt, null);
				setValueEx(Hdr1_purc_ac_schd_dt, null);
			}
		}
		else {
			if (!isAllDtlNonPurc()) {
				setDefaultMode(Hdr1_purc_schd_dt);
				setDefaultMode(Hdr1_purc_ac_schd_dt);
			}
			if (hasArrBasis()) {
				Hdr1_purc_schd_dt.setMode(MCMode.READ_ONLY);
				setValueEx(Hdr1_purc_schd_dt, hR.bef_purc_schd_dt());
			}
		}
		
		// 埋め込み画面の初期化、モード設定
		if (hR.fix_flg()) {
			Hdr1_ac_dt_p_PPanel.setStatus(Hdr1_ac_dt_p_PPanel.getStatus(getStatus()));
			Hdr1_can_ac_dt_p_PPanel.setStatus(Hdr1_can_ac_dt_p_PPanel.getStatus(getStatus()));
			Dtl1_str_ln_p_PPanel.setStatus(Dtl1_str_ln_p_PPanel.getStatus(getStatus()));
			Dtl1_ptax_cur_tax_amt_p_PPanel.setStatus(Dtl1_ptax_cur_tax_amt_p_PPanel.getStatus(getStatus()));
			Dtl1_lot_no_p_PPanel.setStatus(Dtl1_lot_no_p_PPanel.getStatus(getStatus()));
			Dtl2_str_ln_p_PPanel.setStatus(Dtl2_str_ln_p_PPanel.getStatus(getStatus()));
			Dtl2_lot_no_p_PPanel.setStatus(Dtl2_lot_no_p_PPanel.getStatus(getStatus()));
		}
		else {
			Hdr1_ac_dt_p_PPanel.setREAD_ONLYStatus();
			if (hR.bef_fix_flg()) {
				Hdr1_can_ac_dt_p_PPanel.setREQUIREDStatus();
			}
			else {
				Hdr1_can_ac_dt_p_PPanel.setREAD_ONLYStatus();
			}
			Dtl1_str_ln_p_PPanel.setREAD_ONLYStatus();
			Dtl1_ptax_cur_tax_amt_p_PPanel.setREAD_ONLYStatus();
			Dtl1_lot_no_p_PPanel.setREAD_ONLYStatus();
			Dtl2_str_ln_p_PPanel.setREAD_ONLYStatus();
			Dtl2_lot_no_p_PPanel.setREAD_ONLYStatus();
		}
		
		// 確定フラグによって部品の属性を切り替えるので、合わせてモードを再設定する
		Hdr1_xrate_p_PPanel.setStatus(Hdr1_xrate_p_PPanel.getStatus(getStatus()));
		Hdr1_ptax_xrate_p_PPanel.setStatus(Hdr1_ptax_xrate_p_PPanel.getStatus(getStatus()));
		Dtl1_trd_cur_upri_p_PPanel.setStatus(Dtl1_trd_cur_upri_p_PPanel.getStatus(getStatus()));
		
		if (!hR.fix_flg()) {
			
			// ヘッダ枠の項目を初期化
			for (MCModeBeans itm : getFixItmsHdr()) {
				setValueEx((MCField)itm, null);
			}
			setValueEx(Hdr1_ac_dt, null);
			if (!hR.bef_fix_flg()) {
				setValueEx(Hdr1_can_ac_dt, null);
				setValueEx(Hdr1_can_ac_dt_for_input, null);
			}
			
			// フォーカス行退避
			int idx = Dtl1Table.getMCSelectedRow();
			
			for (Dtl1R dtlR : exceptDeleteAndEmpty((MCList<Dtl1R>)getDtl1L())) {
				// 詳細枠の表示を切り替えつつ初期化する
				Dtl1Table.selectRowNoFocus(dtlR.getGUIIndex());
				
				// 明細枠の項目を初期化
				for (MCModeBeans itm : getFixItmsDtl()) {
					boolean isClear = true;
					for (MCModeBeans noClearItm : getNoClearItmDtl()) {
						if (itm == noClearItm) {
							isClear = false;
							break;
						}
					}
					if (isClear) {
						setValueEx((MCColumnConfig)itm, dtlR.getGUIIndex(), null);
					}
				}
				
				// 詳細枠の項目を初期化
				for (Dtl2R ioR : exceptDeleteAndEmpty((MCList<Dtl2R>)getDtl2L())) {
					for (MCModeBeans itm : getFixItmsIo()) {
						boolean isClear = true;
						for (MCModeBeans noClearItm : getNoClearItmIo()) {
							if (itm == noClearItm) {
								isClear = false;
								break;
							}
						}
						if (isClear) {
							setValueEx((MCColumnConfig)itm, ioR.getGUIIndex(), null);
						}
					}
				}
			}
			
			if (idx >= 0) {
				Dtl1Table.selectRowNoFocus(idx);
			}
		}
		
		if (!hR.fix_flg()
			&& MSC_RCPT_IV_SRC_TYP.isARR_SCHD(hR.rcpt_iv_src_typ())) {
			// 未確定、かつ入荷予定をもとに受領インボイスを作成している場合は編集不可
			columnDtl2_trd_unit_cd.setMode(MCMode.READ_ONLY);
			columnDtl2_trd_unit_qty.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(columnDtl2_trd_unit_cd);
			setDefaultMode(columnDtl2_trd_unit_qty);
		}
		
		// コンテナのステータスを戻す
		restoreStatus();
	}
	
	/**
	 * 確定モードのみで入力可能な項目を取得する
	 * @return
	 */
	protected List<MCModeBeans> _fixItmsHdr;
	protected List<MCModeBeans> getFixItmsHdr() {
		if (_fixItmsHdr == null) {
			_fixItmsHdr = Arrays.asList(
				new MCModeBeans[] {
					Hdr1_ac_ym,
					Hdr1_purc_dt,
					Hdr1_ptax_dt,
					Hdr1_intr_rmrks,
					Hdr1_sub_char1,
					Hdr1_sub_char2,
					Hdr1_sub_char3
				}
			);
		}
		return _fixItmsHdr;
	}
	protected List<MCModeBeans> _fixItmsDtl;
	protected List<MCModeBeans> getFixItmsDtl() {
		if (_fixItmsDtl == null) {
			_fixItmsDtl = Arrays.asList(
				new MCModeBeans[] {
					columnDtl1_sync_flg,
					columnDtl1_dlv_loc_cd,
					columnDtl1_quality_typ,
					columnDtl1_gd_cd,
					columnDtl1_abort_flg,
					columnDtl1_bp_lot_no,
					columnDtl1_bp_dlv_slip_no,
					columnDtl1_bp_dlv_slip_d_no,
					columnDtl1_ship_fr_valid_dt,
					columnDtl1_pay_crryovr_times,
					columnDtl1_lot_no,
					columnDtl1_ver_no,
					columnDtl1_ptax_cur_tax_amt,
					columnDtl1_intr_d_rmrks,
					columnDtl1_sub_char1,
					columnDtl1_sub_char2,
					columnDtl1_sub_char3
				}
			);
		}
		return _fixItmsDtl;
	}
	protected List<MCModeBeans> _noClearItmDtl;
	protected List<MCModeBeans> getNoClearItmDtl() {
		if (_noClearItmDtl == null) {
			_noClearItmDtl =  Arrays.asList(
				new MCModeBeans[] {
					columnDtl1_dlv_loc_cd,
					columnDtl1_quality_typ,
					columnDtl1_gd_cd,
					columnDtl1_abort_flg,
					columnDtl1_pay_crryovr_times,
					columnDtl1_lot_no,
					columnDtl1_bp_lot_no,
					columnDtl1_bp_dlv_slip_no,
					columnDtl1_bp_dlv_slip_d_no,
					columnDtl1_ship_fr_valid_dt,
					columnDtl1_ptax_cur_tax_amt
				}
			);
		}
		return _noClearItmDtl;
	}
	protected List<MCModeBeans> _fixItmsIo;
	protected List<MCModeBeans> getFixItmsIo() {
		if (_fixItmsIo == null) {
			_fixItmsIo = Arrays.asList(
				new MCModeBeans[] {
					columnDtl2_dlv_loc_cd,
					columnDtl2_quality_typ,
					columnDtl2_gd_cd,
					columnDtl2_lot_no,
					columnDtl2_bp_lot_no,
					columnDtl2_bp_dlv_slip_no,
					columnDtl2_bp_dlv_slip_d_no,
					columnDtl2_ship_fr_valid_dt,
					columnDtl2_trd_unit_cd,
					columnDtl2_ver_no,
					columnDtl2_sub_char1,
					columnDtl2_sub_char2,
					columnDtl2_sub_char3
				}
			);
		}
		return _fixItmsIo;
	}
	protected List<MCModeBeans> _noClearItmIo;
	protected List<MCModeBeans> getNoClearItmIo () {
		if (_noClearItmIo == null) {
			_noClearItmIo =  Arrays.asList(
				new MCModeBeans[] {
					columnDtl2_dlv_loc_cd,
					columnDtl2_quality_typ,
					columnDtl2_gd_cd,
					columnDtl2_lot_no,
					columnDtl2_bp_lot_no,
					columnDtl2_bp_dlv_slip_no,
					columnDtl2_bp_dlv_slip_d_no,
					columnDtl2_ship_fr_valid_dt,
					columnDtl2_trd_unit_cd,
					columnDtl2_ver_no
				}
			);
		}
		return _noClearItmIo;
	}
	
	protected Map<MCNumber, Status> _saveStatus;
	protected final String _ST_SEQ_COL_ = "__status_seq__";
	protected void saveStatus() {
		_saveStatus = new java.util.HashMap<>();
		int seq = 0;
		for (MCRow r : getStatusSaveL()) {
			r.setNumberNE(_ST_SEQ_COL_, ++seq);
			_saveStatus.put(MCNumber.valueOf(seq), r.getStatus());
		}
	}
	protected void restoreStatus() {
		getStatusSaveL().forEach(r -> {
			r.setStatus(_saveStatus.get(r.getNumberNE(_ST_SEQ_COL_)));
		});
	}
	protected MCList<MCRow> getStatusSaveL() {
		MCList<MCRow> lst = MCList.create(MCRow.class);
		lst.add(getHdr1R());
		lst.addAll(exceptDeleteAndEmpty(getDtl1L()));
		_dtl2L.entrySet().forEach(
			e -> lst.addAll(exceptDeleteAndEmpty(e.getValue()))
		);
		return lst;
	}
	
	/**
	 * 確定フラグの入力制御
	 */
	protected void setFixFlgMode() {
		if (isSetFixFlgRo()) {
			setValueEx(Hdr1_fix_flg, false);
			Hdr1_fix_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Hdr1_fix_flg);
		}
	}
	protected boolean isSetFixFlgRo() {
		if (isAllDtlNonPurc()) {
			// 全明細仕入対象外の場合、確定フラグは編集不可
			return true;
		}
		return false;
	}
	protected boolean isAllDtlNonPurc() {
		MCList<Dtl1R> list = exceptDeleteAndEmpty(getDtl1L());
		if (list.size() > 0 && list.subList(Dtl1R.$non_purc_flg, true).size() == list.size()) {
			return true;
		}
		return false;
	}
	
	protected void setAbortFlgMode() {
		if (MSC_RCPT_IV_SRC_TYP.isARR_SCHD(getHdr1R().rcpt_iv_src_typ())) {
			// 分割先の予定を打ち切る（全数打切）
			setDefaultMode(columnDtl1_schd_abort_flg);
			columnDtl1_abort_flg.setMode(MCMode.INVISIBLE);
		}
		else {
			// 予定を分割せずに打ち切る（残数打切）
			columnDtl1_schd_abort_flg.setMode(MCMode.INVISIBLE);
			setDefaultMode(columnDtl1_abort_flg);
		}
	}
	
	/**
	 * 明細に仕入計上区分「入荷基準」が存在するかどうか。
	 * @return 仕入計上区分「入荷基準」が存在する場合はtrue
	 */
	protected boolean hasArrBasis() {
		MCList<Dtl1R> list = exceptDeleteAndEmpty(getDtl1L());
		if (list.size() > 0 && !isNull(list.getFirst(Dtl1R.$purc_basis_typ, MAC_PURC_BASIS_TYP.ARR_BASIS.value()))) {
			return true;
		}
		return false;
	}
	
	// -----------------------------------------------
	// Listlogic / Input Support
	@Override
	public MCList getHdr1_in_to_id_cd(MCRow row, MCEventInfo info) {
		if (MSC_IN_TO_ID_TYP.isLOC(getHdr1R().in_to_id_typ())) {
			setBindRowForISCustom(row, info.getComponent(), info.getEventIndex());
			return super.getHdr1_in_to_id_cd(row, info);
		}
		
		// リストロジックを連携させない
		MCList<MCRow> retL = MCList.create(MCRow.class);
		MCRow addRow = retL.add();
		addRow.setStringNE(Hdr1R.$in_to_id_cd, getHdr1R().in_to_id_cd());
		addRow.setStringNE(Hdr1R.$in_to_id_nm, getHdr1R().in_to_id_nm());
		
		return retL;
	}
	
	@Override
	public MCList getDtl1_itm_p_PPanel_columnItm_itm_cd(MCRow row, MCEventInfo info) {
		setBindRowForISCustom(row, info.getComponent(), info.getEventIndex());
		return filterItmCd(super.getDtl1_itm_p_PPanel_columnItm_itm_cd(row, info));
	}
	@Override
	public MCList getDtl1_itm_p_PPanel_columnItm_itm_sub1(MCRow row, MCEventInfo info) {
		setBindRowForISCustom(row, info.getComponent(), info.getEventIndex());
		return filterItmCd(super.getDtl1_itm_p_PPanel_columnItm_itm_sub1(row, info));
	}
	@Override
	public MCList getDtl1_itm_p_PPanel_columnItm_itm_sub2(MCRow row, MCEventInfo info) {
		setBindRowForISCustom(row, info.getComponent(), info.getEventIndex());
		return filterItmCd(super.getDtl1_itm_p_PPanel_columnItm_itm_sub2(row, info));
	}
	@Override
	public MCList getDtl1_itm_p_PPanel_columnItm_itm_sub3(MCRow row, MCEventInfo info) {
		setBindRowForISCustom(row, info.getComponent(), info.getEventIndex());
		return filterItmCd(super.getDtl1_itm_p_PPanel_columnItm_itm_sub3(row, info));
	}
	@Override
	public MCList getDtl2_itm_p_PPanel_columnItm_itm_sub3(MCRow row, MCEventInfo info) {
		setBindRowForISCustom(row, info.getComponent(), info.getEventIndex());
		return filterItmCd(super.getDtl2_itm_p_PPanel_columnItm_itm_sub3(row, info));
	}
	protected MCList filterItmCd(MCList lst) {
		MCList<MCRow> retL = MCList.create(MCRow.class);
		if (getHdr1R().fix_flg()) {
			retL.setAll(lst);
		}
		else {
			for (MCRow r : (MCList<MCRow>)lst) {
				if (isSame(r.getStringNE(ItmDtlCols.$o_stk_mng_typ), MAC_STK_MNG_TYP.NOT_MNG.value())
					&& isSame(r.getStringNE(ItmDtlCols.$o_asset_mng_typ), MAC_ASSET_MNG_TYP.NOT_MNG.value())) {
					retL.add(r);
				}
			}
		}
		return retL;
	}
	
	@Override
	public MCList getDtl1_maker_cd(MCRow row, MCEventInfo info) {
		setBindRowForISCustom(row, info.getComponent(), info.getEventIndex());
		return super.getDtl1_maker_cd(row, info);
	}
	
	@Override
	public MCList getDtl1_dlv_loc_cd(MCRow row, MCEventInfo info) {
		setLocBind(row, info.getEventIndex(), Dtl1Table);
		return super.getDtl1_dlv_loc_cd(row, info);
	}

	@Override
	public MCList getDtl2_dlv_loc_cd(MCRow row, MCEventInfo info) {
		setLocBind(row, info.getEventIndex(), Dtl2Table);
		return super.getDtl2_dlv_loc_cd(row, info);
	}
	
	@Override
	public MCList getDtl1_ver_no_p_PPanel_columnVerNo_ver_no(MCRow row, MCEventInfo info) {
		return getDtl1VerNoList(row, info);
	}
	
	@Override
	public MCList getDtl2_ver_no_p_PPanel_columnVerNo_ver_no(MCRow row, MCEventInfo info) {
		return getDtl2VerNoList(row, info);
	}
	
	@Override
	public MCList getDtl1_purc_id_typ(MCRow row, MCEventInfo info) {
		return getDtl1PurcIdTypList(row, info);
	}
	
	@Override
	public MCList getDtl1_purc_rsn_cd(MCRow row, MCEventInfo info) {
		return getDtl1PurcRsnCdList(row, info);
	}
	@Override
	protected boolean isPurcXpns(
			mcframe.clientMSBD.MSBDP0140.Hdr1R hdrR, mcframe.clientMSBD.MSBDP0140.Dtl1R dtlR) {
		return MSUCP_PurcUtil.isPurcXpns(dtlR.trd_ptn_typ(), dtlR.asset_mng_typ());
	}
	
	@Override
	protected MCRow getBindRowForISCustom(MCRow bind, MCLinkBeans beans, int eventIndex) {
		setBindRowForISCustom(bind, beans, eventIndex);
		return super.getBindRowForISCustom(bind, beans, eventIndex);
	}
	protected void setBindRowForISCustom(MCRow bind, MCEventBeans beans, int eventIndex) {
		
		Hdr1R hdr1R = getHdr1R();
		MCDate baseDt = hdr1R.fix_flg() ? hdr1R.purc_dt() : nvl(hdr1R.purc_schd_dt(), hdr1R.iv_dt());
		
		if (beans == columnDtl1_itm_cd
			|| beans == columnDtl1_itm_sub1
			|| beans == columnDtl1_itm_sub2
			|| beans == columnDtl1_itm_sub3
			|| beans == columnDtl2_itm_cd
			|| beans == columnDtl2_itm_sub1
			|| beans == columnDtl2_itm_sub2
			|| beans == columnDtl2_itm_sub3) {
			if (!getHdr1R().fix_flg()) {
				bind.addStringColumn(ItmDtlCols.$i_stk_mng_typ, MAC_STK_MNG_TYP.NOT_MNG.value());
				bind.addStringColumn(ItmDtlCols.$i_asset_mng_typ, MAC_ASSET_MNG_TYP.NOT_MNG.value());
			}
			
			bind.addDateColumn(ItmDtlCols.$i_dt, baseDt);
			
			if (beans == columnDtl1_itm_cd
				|| beans == columnDtl1_itm_sub1
				|| beans == columnDtl1_itm_sub2
				|| beans == columnDtl1_itm_sub3) {
				Dtl1R dtl1R = ((MCList<Dtl1R>)getDtl1L()).get(eventIndex);
				bind.addStringColumn(
					ItmDtlCols.$i_wg_cd, nvl(dtl1R.dlv_loc_wg_cd(), hdr1R.dlv_loc_wg_cd()));
				
				if (MAC_TRD_PTN_TYP.isPURC_XPNS(dtl1R.trd_ptn_typ())) {
					if (!bind.contains(ItmDtlCols.$i_asset_mng_typ)) {
						bind.addStringColumn(ItmDtlCols.$i_asset_mng_typ, MAC_ASSET_MNG_TYP.NOT_MNG.value());
					}
				}
			}
		}
		else if (beans == columnDtl1_maker_cd) {
			bind.addDateColumn(ItmDtlMakerCols.$i_master_dt, baseDt);
		}
	}
	
	// -----------------------------------------------
	// CellConfig
	@Override
	protected Dtl1CellConfig crtDtl1CellConfig() {
		return new Dtl1CellConfigAdd();
	}
	protected class Dtl1CellConfigAdd extends Dtl1CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			Dtl1R dtlRow = (Dtl1R) getDtl1L().get(index);
			
			if (getFixItmsHdr().contains(column)
				|| getFixItmsDtl().contains(column)) {
				// 確定のみ入力可能項目は、未確定で入力不可
				if (!getHdr1R().fix_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnDtl1_sync_flg) {
				// 確定オフで既に入荷実績がある場合は変更不可
				if ((!getHdr1R().bef_fix_flg() || isNull(dtlRow.purc_act_d_no()))
						&& hasArrActNo(dtlRow)) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnDtl1_trd_unit_cd
				|| column == columnDtl1_trd_unit_qty
				|| column == columnDtl1_schd_abort_flg
				|| column == columnDtl1_abort_flg) {
				// 販売側のインボイスが登録済みの場合は入力不可
				if (!isNull(dtlRow.slo_d_no()) && getHdr1R().iv_reg_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnDtl1_schd_abort_flg
				|| column == columnDtl1_abort_flg) {
				if (isNull(dtlRow.po_d_no())) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnDtl1_dlv_loc_cd || column == columnDtl1_re_arr_loc_cd ) {
				if (isNull(getHdr1R().po_no())) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnDtl1_iv_itm_nm) {
				if (!dtlRow.sundry_itm_flg() || !isNull(dtlRow.po_no())) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnDtl1_trd_cd) {
				// 計画外以外は取引ＣＤの入力不可
				if (!isNull(dtlRow.po_no())) {
					return MCMode.READ_ONLY;
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}
	@Override
	protected Dtl2CellConfig crtDtl2CellConfig() {
		return new Dtl2CellConfigAdd();
	}
	protected class Dtl2CellConfigAdd extends Dtl2CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			Dtl2R ioRow = (Dtl2R) getDtl2L().get(index);
			Dtl1R dtlRow = (Dtl1R) getDtl1L().getFirst(Dtl1R.$peg_no, ioRow.dtl_peg_no());
			
			if (getFixItmsIo().contains(column)) {
				// 確定のみ入力可能項目は、未確定で入力不可
				if (!getHdr1R().fix_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnDtl2_trd_unit_cd
				|| column == columnDtl2_trd_unit_qty) {
				// 販売側のインボイスが登録済みの場合は取引単位数量の入力不可
				if (!isNull(dtlRow.slo_d_no()) && getHdr1R().iv_reg_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}
	@Override
	public List<MCButton> westHeaderBarItems() {
		List<MCButton> btnList = new ArrayList<MCButton>();;
		for (MCButton btn : super.westHeaderBarItems()) {
			if (!btn.getName().endsWith("MSBDP0140.open_01")) {
				btnList.add(btn);
			}
		}
		return btnList;
	}

}