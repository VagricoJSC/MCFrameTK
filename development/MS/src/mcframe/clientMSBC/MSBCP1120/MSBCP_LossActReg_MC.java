package mcframe.clientMSBC.MSBCP1120;

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

import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP0050.*;
import mcframe.clientMAUB.MAUBP0350.*;
import mcframe.clientMAUB.MAUBP0370.*;
import mcframe.clientMAUB.MAUBP0380.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5260.*;
import mcframe.clientMAUB.MAUBP5280.*;
import mcframe.clientMAUB.MAUBP5290.*;

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
import mcframe.clientMAUD.MAUDP0110.MAUDP_RowListener;
import mcframe.clientCore.container.MCRowEvent;
import mcframe.clientCore.container.MCRowStatusEvent;
import mcframe.clientMAUD.MAUDP0110.MAUDP_ListListener;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBCP_LossActReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBCP_LossActReg_MC extends MSBCP_LossActReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	mcframe.clientMSBC.MSBCP1100.MSBCP_MfgActReg _parScr;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBCP_LossActReg_MC() {
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
	public MSBCP_LossActReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Btn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBtn_rdel(MCEventInfo info) {
		deleteRow(LossAct_RsltTable);
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		MCMessageList msgL = checkReq(getLossAct_RsltL());
		for (LossAct_RsltR r : getLossAct_RsltL()) {
			if (isNull(r.loss_act_no()) && r.isStatusModify()) {
				msgL.addAll(checkPositive(r, columnLossAct_Rslt_loss_qty));
			}
		}
		if (!msgL.isEmpty()) {
			message(msgL);
			return ;
		}
		_parScr.refreshLossActRslt(getLossAct_HdrR(), getLossAct_RsltL());
		requestCloseWindow();
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();
		setListListener(LossAct_RsltTable, getSumQtyRowListener());
		columnLossAct_Rslt_loss_qty.addLCListener(this);
		columnLossAct_Rslt_cont_loss_qty.addLCListener(this);
	}
	
	protected SumQtyRowListener getSumQtyRowListener() {
		return new SumQtyRowListener();
	}
	
	protected class SumQtyRowListener extends MAUDP_RowListener {
		@Override
		public void valueChanged(MCRowEvent event) {
			String col = event.getColumn();
			if (isSame(col, LossAct_RsltR.$loss_qty) || isSame(col, LossAct_RsltR.$cont_loss_qty)) {
				setSumLossQty();
			}
		}

		@Override
		public void statusChanged(MCRowStatusEvent event) {
			super.statusChanged(event);
			setSumLossQty();
		}
	}
	
	protected void setSumLossQty() {
		MCNumber lossQty = MCNumber.ZERO;
		MCNumber fxdLossQty = MCNumber.ZERO;
		MCNumber contLossQty = MCNumber.ZERO;
		MCNumber contFxdLossQty = MCNumber.ZERO;

		for (LossAct_RsltR r : getLossAct_RsltL()) {
			if (r.isStatusDelete()) {
				continue;
			}
			if (isNull(r.loss_qty())) {
				continue;
			}
			if (r.fxd_loss_flg()) {
				fxdLossQty = fxdLossQty.add(r.loss_qty());
				if (r.cont_fctr_flg() && !isNull(r.cont_loss_qty())) {
					contFxdLossQty = contFxdLossQty.add(r.cont_loss_qty());
				}
			}
			else {
				lossQty = lossQty.add(r.loss_qty());
				if (r.cont_fctr_flg() && !isNull(r.cont_loss_qty())) {
					contLossQty = contLossQty.add(r.cont_loss_qty());
				}
			}
		}
		setValueEx(LossAct_Hdr_loss_qty, lossQty);
		setValueEx(LossAct_Hdr_fxd_loss_qty, fxdLossQty);
		if (getLossAct_HdrR().cont_fctr_flg()) {
			setValueEx(LossAct_Hdr_cont_loss_qty, contLossQty);
			setValueEx(LossAct_Hdr_cont_fxd_loss_qty, contFxdLossQty);
		}
	}
	
	@Override
	protected void setupParts() {
		super.setupParts();
		LossAct_Hdr_inpt_qty_p_PPanel.setRelateBeans(LossAct_Hdr_base_unit_cd, LossAct_Hdr_base_dec_place);
		LossAct_Hdr_loss_qty_p_PPanel.setRelateBeans(LossAct_Hdr_base_unit_cd, LossAct_Hdr_base_dec_place);
		LossAct_Hdr_fix_loss_qty_p_PPanel.setRelateBeans(LossAct_Hdr_base_unit_cd, LossAct_Hdr_base_dec_place);
		
		LossAct_Hdr_cont_inpt_qty_p_PPanel.setRelateBeans(LossAct_Hdr_cont_fctr_flg,
				LossAct_Hdr_inpt_qty, LossAct_Hdr_std_cont_fctr,
				LossAct_Hdr_act_cont_fctr, LossAct_Hdr_cont_fctr_dec_place,
				LossAct_Hdr_cont_fctr_rnd_typ);
		LossAct_Hdr_cont_loss_qty_p_PPanel.setRelateBeans(LossAct_Hdr_cont_fctr_flg,
				LossAct_Hdr_loss_qty, LossAct_Hdr_std_cont_fctr,
				LossAct_Hdr_act_cont_fctr, LossAct_Hdr_cont_fctr_dec_place,
				LossAct_Hdr_cont_fctr_rnd_typ);
		LossAct_Hdr_cont_fix_loss_qty_p_PPanel.setRelateBeans(LossAct_Hdr_cont_fctr_flg,
				LossAct_Hdr_fxd_loss_qty, LossAct_Hdr_std_cont_fctr,
				LossAct_Hdr_act_cont_fctr, LossAct_Hdr_cont_fctr_dec_place,
				LossAct_Hdr_cont_fctr_rnd_typ);

		LossAct_Rslt_loss_qty_p_PPanel.setRelateBeans(LossAct_Hdr_base_unit_cd, LossAct_Hdr_base_dec_place);
		LossAct_Rslt_cont_loss_qty_p_PPanel.setRelateBeans(
				columnLossAct_Rslt_cont_fctr_flg, columnLossAct_Rslt_loss_qty,
				columnLossAct_Rslt_std_cont_fctr, columnLossAct_Rslt_act_cont_fctr,
				columnLossAct_Rslt_cont_fctr_dec_place,
				columnLossAct_Rslt_cont_fctr_rnd_typ);
	}
	
	@Override
	protected void setSortColumn() {
		super.setSortColumn();
		LossAct_RsltTable.addSortColumn(columnLossAct_Rslt_loss_rsn_cd);
	}
	
	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setBtnMode();
	}

	@Override
	public void doLossAct_Rslt_NC(MCEventInfo info) {
		super.doLossAct_Rslt_NC(info);
		setBtnMode();
	}

	protected void setBtnMode() {
		LossAct_RsltR r = LossAct_RsltTable.getSelectedMCRow();
		if (!isNull(r) && isNull(r.loss_act_no())) {
			Btn_rdel.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_rdel);
		}
	}
	
	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		
		if (lc == columnLossAct_Rslt_loss_qty) {
			doLostAct_Rslt_loss_qty_LC(info);
		}
		else if (lc == columnLossAct_Rslt_cont_loss_qty) {
			doLostAct_Rslt_cont_loss_qty_LC(info);
		}
	}

	// 基準単位⇔有効成分関連
	// 基準単位数量と有効成分は相互にイベントが発動するため、イベントが無限ループになる可能性がある。当フラグで発動を制御する
	protected boolean _isDuringQtyChangeEvent = false;
	
	protected void doLostAct_Rslt_loss_qty_LC(MCEventInfo info) {
		int idx = info.getEventIndex();
		if (idx < 0) {
			return ;
		}

		LossAct_RsltR r = getLossAct_RsltL().get(idx);
		if (isNull(r.loss_qty())) {
			r.clear(LossAct_RsltR.$intr_rmrks, LossAct_RsltR.$trd_rmrks, 
					LossAct_RsltR.$sub_char1, LossAct_RsltR.$sub_char2, LossAct_RsltR.$sub_char3);
		}

		// 有効成分換算処理（有効成分側のイベントで当項目が変更されないように制御）
		if (!_isDuringQtyChangeEvent) {
			try {
				_isDuringQtyChangeEvent = true;
				setValueEx(columnLossAct_Rslt_cont_loss_qty, r.getGUIIndex(),
						convBaseToCont(r.loss_qty(), r));
			}
			finally {
				_isDuringQtyChangeEvent = false;
			}
		}
	}
	
	protected void doLostAct_Rslt_cont_loss_qty_LC(MCEventInfo info) {
		int idx = info.getEventIndex();
		if (idx < 0) {
			return ;
		}

		LossAct_RsltR r = getLossAct_RsltL().get(idx);

		// 基準単位換算処理（基準単位側のイベントで当項目が変更されないように制御）
		if (!_isDuringQtyChangeEvent) {
			try {
				_isDuringQtyChangeEvent = true;
				setValueEx(columnLossAct_Rslt_loss_qty, r.getGUIIndex(), convContToBase(r.cont_loss_qty(), r));
			}
			finally {
				_isDuringQtyChangeEvent = false;
			}
		}
	}

	protected MCNumber convBaseToCont(MCNumber baseQty, LossAct_RsltR r) {
		// 基準単位から有効成分への変換
		if (isNull(baseQty)) {
			return null;
		}
		return convToContFctrUnit(baseQty,
				nvl(r.act_cont_fctr(), r.std_cont_fctr()),
				r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ());
	}
	
	protected MCNumber convContToBase(MCNumber contQty, LossAct_RsltR r) {
		// 有効成分から基準単位への変換
		if (isNull(contQty)) {
			return null;
		}
		return convToBaseUnitFromContFctrUnit(contQty,
				nvl(r.act_cont_fctr(), r.std_cont_fctr()),
				getLossAct_HdrR().base_dec_place(), getLossAct_HdrR().base_unit_conv_rnd_typ());
	}
	
	/**
	 * 他画面から呼び出された場合の初期化を実装します。
	 * <P>
	 * <P>
	 * <li>起動タイプ：T1<br>
	 * <tr><th>カラム名</th><th>型</th><th>備考</th></tr>
	 * <tr><th>itm_cd</th><th>String</th><th>必須</th></tr>
	 * <tr><th>itm_sub1</th><th>String</th><th>必須</th></tr>
	 * <tr><th>itm_sub2</th><th>String</th><th>必須</th></tr>
	 * <tr><th>itm_sub3</th><th>String</th><th>必須</th></tr>
	 * <tr><th>base_unit_cd</th><th>String</th><th>必須</th></tr>
	 * <tr><th>base_unit_nm</th><th>String</th><th>必須</th></tr>
	 * <tr><th>base_dec_place</th><th>String</th><th>必須</th></tr>
	 * <tr><th>inpt_qty</th><th>String</th><th>必須</th></tr>
	 * </P>
	 * @param openTyp 起動タイプ
	 * @param bind バインド値 特に不要
	 * @param args 第１要素に製造実績登録画面の画面インスタンス、第２要素にロス実績明細のMCList、第３要素に参照モードで遷移するか否かのboolean値(trueの場合参照モード)を渡す
	 */
	@Override
	protected void initByScreenParam(String openTyp, MCRow bind, Object... args) {
		super.initByScreenParam(openTyp, bind, args);
		if (T1 == openTyp) {
			if (args[0] instanceof mcframe.clientMSBC.MSBCP1100.MSBCP_MfgActReg) {
				_parScr = (mcframe.clientMSBC.MSBCP1100.MSBCP_MfgActReg)args[0];
				boolean isRef = (boolean)args[2];
				if (isRef) {
					setREFStatus();
				}
				else {
					setUPDStatus();
				}
				
				setValueEx(LossAct_Hdr_itm_cd, bind.getString("itm_cd"));
				setValueEx(LossAct_Hdr_itm_sub1, bind.getString("itm_sub1"));
				setValueEx(LossAct_Hdr_itm_sub2, bind.getString("itm_sub2"));
				setValueEx(LossAct_Hdr_itm_sub3, bind.getString("itm_sub3"));
				// リストロジックによる通信を発生させると遷移時にエラーとなるためコンテナに直接値を設定する
				getLossAct_HdrR().base_unit_cd(bind.getString("base_unit_cd"));
				getLossAct_HdrR().base_unit_nm(bind.getString("base_unit_nm"));
				setValueEx(LossAct_Hdr_base_dec_place, bind.getNumber("base_dec_place"));
				setValueEx(LossAct_Hdr_base_unit_conv_rnd_typ, bind.getString("base_unit_conv_rnd_typ"));
				setValueEx(LossAct_Hdr_inpt_qty, bind.getNumber("inpt_qty"));

				setValueEx(LossAct_Hdr_cont_fctr_flg, bind.getBoolean("cont_fctr_flg"));
				
				if (getLossAct_HdrR().cont_fctr_flg()) {
					setValueEx(LossAct_Hdr_cont_fctr_rnd_typ, bind.getString("cont_fctr_rnd_typ"));
					setValueEx(LossAct_Hdr_cont_fctr_dec_place, bind.getNumber("cont_fctr_dec_place"));
					setValueEx(LossAct_Hdr_act_cont_fctr, bind.getNumber("act_cont_fctr"));
					setValueEx(LossAct_Hdr_std_cont_fctr, bind.getNumber("std_cont_fctr"));
					setValueEx(LossAct_Hdr_cont_inpt_qty, bind.getNumber("cont_inpt_qty"));
				}
				
				MCList<LossAct_RsltR> list = (MCList<LossAct_RsltR>)args[1];
				for (LossAct_RsltR r : list) {
					// ヘッダから有効成分関連の項目をコピー
					r.cont_fctr_flg(getLossAct_HdrR().cont_fctr_flg());
					if (r.cont_fctr_flg()) {
						r.cont_fctr_rnd_typ(getLossAct_HdrR().cont_fctr_rnd_typ());
						r.cont_fctr_dec_place(getLossAct_HdrR().cont_fctr_dec_place());
						r.act_cont_fctr(getLossAct_HdrR().act_cont_fctr());
						r.std_cont_fctr(getLossAct_HdrR().std_cont_fctr());
					}
				}
				getLossAct_RsltL().setAll(list);
				
				setSumLossQty();
				setBtnMode();
				LossAct_RsltTable.adjustWidth();
				LossAct_RsltTable.sort();
				
			}
		}
	}
	
	@Override
	protected void screenOpenStatusClear() {
		// 呼出元画面から行ステータスが渡されてくる場合があり、ステータスをクリアしたくないのでオーバライドする
	}

	@Override
	protected void setCellConfig() {
		super.setCellConfig();

		LossAct_RsltTable.setCellConfig(crtRsltCellConfig());
	}

	protected RsltCellConfig crtRsltCellConfig() {
		return new RsltCellConfig();
	}

	protected class RsltCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			LossAct_RsltR r = (LossAct_RsltR) table.getBaseTable().getRow(index);

			if (isRmrksColumns(column)) {
				if (isNull(r.loss_qty())) {
					return MCMode.READ_ONLY;
				}
			}
			
			if (isSame(UPD, getStatus())) {
				if (column == columnLossAct_Rslt_loss_qty) {
					if (!isNull(r.loss_act_no()) && isNull(r.loss_qty())) {
						return MCMode.REQUIRED;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
		
		/**
		 * 備考項目か判定する。
		 * @param column
		 * @return
		 */
		protected boolean isRmrksColumns(MCColumnConfig column) {
			if (column == columnLossAct_Rslt_intr_rmrks
					|| column == columnLossAct_Rslt_trd_rmrks
					|| column == columnLossAct_Rslt_sub_char1
					|| column == columnLossAct_Rslt_sub_char2
					|| column == columnLossAct_Rslt_sub_char3) {
				return true;
			}
			return false;
		}
	}

}