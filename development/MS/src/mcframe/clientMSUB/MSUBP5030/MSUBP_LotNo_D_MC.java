package mcframe.clientMSUB.MSUBP5030;

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
import mcframe.clientCore.beans.list.MCListType;
import static mcframe.clientMAUC.MAUCP1050.MAUCP_BeansUtil.*;
import static mcframe.commonMSUA.MSUAC0070.MSUAC_List.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSUBP_LotNo_D"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSUBP_LotNo_D_MC extends MSUBP_LotNo_D_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected static final int LOT_NO_FREE = 0; // 入力制御なし
	protected static final int LOT_NO_CRT_SLCT = 1; // ロットＮＯ発行または選択仕様
	protected static final int LOT_NO_CRT = 2; // ロットＮＯ発行仕様
	protected static final int LOT_NO_SLCT = 3; // ロットＮＯ選択仕様
	protected int _lot_no_mode = LOT_NO_FREE;
	protected MCBeans _itm_cd = null;
	protected MCBeans _itm_sub1 = null;
	protected MCBeans _itm_sub2 = null;
	protected MCBeans _itm_sub3 = null;
	protected MCBeans _lot_mng_typ = null;
	protected MCBeans _lot_no_typ = null;
	protected MCBeans _sublot_mng_typ = null;
	protected MCBeans _sublot_no_typ = null;

	protected MCBeans _asset_mng_typ = null;
	protected MCBeans _xpns_purc_flg = null;
	
	protected MCBeans _not_new_lot_flg = null;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSUBP_LotNo_D_MC() {
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
	public MSUBP_LotNo_D_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * ロットＮＯを発番、または既存ロットを選択するモードで部品を設定する。<br>
	 * 入力制御しない場合はこのメソッドは呼び出しません。
	 * 
	 * @param itm_cd 品目
	 * @param itm_sub1 枝番１
	 * @param itm_sub2 枝番２
	 * @param itm_sub3 枝番３
	 * @param lot_mng_typ ロット管理区分
	 * @param lot_no_typ ロットＮＯ区分
	 * @param sublot_mng_typ サブロット管理区分
	 * @param sublot_no_typ サブロットＮＯ区分
	 * @param use_crt_lot_flg ロット作成ＦＬＧを使用するかどうか
	 */
	public void setRelateBeans(MCBeans itm_cd, MCBeans itm_sub1, MCBeans itm_sub2, MCBeans itm_sub3, MCBeans lot_mng_typ, MCBeans lot_no_typ, MCBeans sublot_mng_typ, MCBeans sublot_no_typ, boolean use_crt_lot_flg) {
		_itm_cd = itm_cd;
		_itm_sub1 = itm_sub1;
		_itm_sub2 = itm_sub2;
		_itm_sub3 = itm_sub3;
		_lot_mng_typ = lot_mng_typ;
		_lot_no_typ = lot_no_typ;
		_sublot_mng_typ = sublot_mng_typ;
		_sublot_no_typ = sublot_no_typ;
		if (use_crt_lot_flg) {
			_lot_no_mode = LOT_NO_CRT_SLCT;
		}
		else {
			_lot_no_mode = LOT_NO_CRT;
			
		}
		
		// プログラムからロットを自動で設定する場合もあるので、初期設定でFREEにする
		columnLotNo_lot_no.setListType(MCListType.FREE);
		columnLotNo_sublot_no.setListType(MCListType.FREE);
	}

	/**
	 * ロットＮＯを発番、または既存ロットを選択するモードで部品を設定する。<br>
	 * 入力制御しない場合はこのメソッドは呼び出しません。
	 * 
	 * @param itm_cd 品目
	 * @param itm_sub1 枝番１
	 * @param itm_sub2 枝番２
	 * @param itm_sub3 枝番３
	 * @param lot_mng_typ ロット管理区分
	 * @param lot_no_typ ロットＮＯ区分
	 * @param sublot_mng_typ サブロット管理区分
	 * @param sublot_no_typ サブロットＮＯ区分
	 * @param use_crt_lot_flg ロット作成ＦＬＧを使用するかどうか
	 * @param asset_mng_typ 資産管理区分
	 * @param xpns_purc_flg 経費購買ＦＬＧ
	 */
	public void setRelateBeans(MCBeans itm_cd, MCBeans itm_sub1, MCBeans itm_sub2, MCBeans itm_sub3,
		MCBeans lot_mng_typ, MCBeans lot_no_typ, MCBeans sublot_mng_typ, MCBeans sublot_no_typ, boolean use_crt_lot_flg,
		MCBeans asset_mng_typ, MCBeans xpns_purc_flg) {
		setRelateBeans(itm_cd, itm_sub1, itm_sub2, itm_sub3, lot_mng_typ, lot_no_typ, sublot_mng_typ, sublot_no_typ, use_crt_lot_flg);
		_asset_mng_typ = asset_mng_typ;
		_xpns_purc_flg = xpns_purc_flg;
	}

	/**
	 * ロットＮＯを発番、または既存ロットを選択するモードで部品を設定する。<br>
	 * 新規ロット入力不可ＦＬＧで入力制御する場合にこのメソッドで初期化します。
	 * 入力制御しない場合はこのメソッドは呼び出しません。
	 * 
	 * @param itm_cd 品目
	 * @param itm_sub1 枝番１
	 * @param itm_sub2 枝番２
	 * @param itm_sub3 枝番３
	 * @param lot_mng_typ ロット管理区分
	 * @param lot_no_typ ロットＮＯ区分
	 * @param sublot_mng_typ サブロット管理区分
	 * @param sublot_no_typ サブロットＮＯ区分
	 * @param use_crt_lot_flg ロット作成ＦＬＧを使用するかどうか
	 * @param asset_mng_typ 資産管理区分
	 * @param xpns_purc_flg 経費購買ＦＬＧ
	 * @param not_new_lot_flg 新規ロット入力不可ＦＬＧ
	 */
	public void setRelateBeans(MCBeans itm_cd, MCBeans itm_sub1, MCBeans itm_sub2, MCBeans itm_sub3,
		MCBeans lot_mng_typ, MCBeans lot_no_typ, MCBeans sublot_mng_typ, MCBeans sublot_no_typ, boolean use_crt_lot_flg,
		MCBeans asset_mng_typ, MCBeans xpns_purc_flg, MCBeans not_new_lot_flg) {
		setRelateBeans(itm_cd, itm_sub1, itm_sub2, itm_sub3, lot_mng_typ, lot_no_typ, sublot_mng_typ, sublot_no_typ, use_crt_lot_flg, asset_mng_typ, xpns_purc_flg);
		_not_new_lot_flg = not_new_lot_flg;
	}

	/**
	 * ロットＮＯを発番、または既存ロットを選択するモードで部品を設定する。<br>
	 * 新規ロット入力不可ＦＬＧで入力制御する場合にこのメソッドで初期化します。
	 * 入力制御しない場合はこのメソッドは呼び出しません。
	 * 
	 * @param itm_cd 品目
	 * @param itm_sub1 枝番１
	 * @param itm_sub2 枝番２
	 * @param itm_sub3 枝番３
	 * @param lot_mng_typ ロット管理区分
	 * @param lot_no_typ ロットＮＯ区分
	 * @param sublot_mng_typ サブロット管理区分
	 * @param sublot_no_typ サブロットＮＯ区分
	 * @param use_crt_lot_flg ロット作成ＦＬＧを使用するかどうか
	 * @param not_new_lot_flg 新規ロット入力不可ＦＬＧ
	 */
	public void setRelateBeans(MCBeans itm_cd, MCBeans itm_sub1, MCBeans itm_sub2, MCBeans itm_sub3, MCBeans lot_mng_typ, MCBeans lot_no_typ, MCBeans sublot_mng_typ, MCBeans sublot_no_typ, boolean use_crt_lot_flg, MCBeans not_new_lot_flg) {
		setRelateBeans(itm_cd, itm_sub1, itm_sub2, itm_sub3, lot_mng_typ, lot_no_typ, sublot_mng_typ, sublot_no_typ, use_crt_lot_flg);
		_not_new_lot_flg = not_new_lot_flg;
	}

	/**
	 * ロットＮＯを選択するモードで部品を設定する。<br>
	 * 入力制御しない場合はこのメソッドは呼び出しません。
	 * 
	 * @param itm_cd 品目
	 * @param itm_sub1 枝番１
	 * @param itm_sub2 枝番２
	 * @param itm_sub3 枝番３
	 * @param lot_mng_typ ロット管理区分
	 * @param sublot_mng_typ サブロット管理区分
	 */
	public void setRelateBeans(MCBeans itm_cd, MCBeans itm_sub1, MCBeans itm_sub2, MCBeans itm_sub3, MCBeans lot_mng_typ, MCBeans sublot_mng_typ) {
		_lot_no_mode = LOT_NO_SLCT;
		_itm_cd = itm_cd;
		_itm_sub1 = itm_sub1;
		_itm_sub2 = itm_sub2;
		_itm_sub3 = itm_sub3;
		_lot_mng_typ = lot_mng_typ;
		_sublot_mng_typ = sublot_mng_typ;
	}
	
	@Override
	protected void linkBeansToISPanel() {
		super.linkBeansToISPanel();
		getLotNo_lot_no_ListPutter().putBind(LotNoCols.$i_itm_cd, _itm_cd);
		getLotNo_lot_no_ListPutter().putBind(LotNoCols.$i_itm_sub1, _itm_sub1);
		getLotNo_lot_no_ListPutter().putBind(LotNoCols.$i_itm_sub2, _itm_sub2);
		getLotNo_lot_no_ListPutter().putBind(LotNoCols.$i_itm_sub3, _itm_sub3);
		getLotNo_lot_no_ListPutter().putBind(LotNoCols.$i_itm_ro_flg, true);
		
		// setRelateBeans実行後になるようにlistInitでなくlinkBeansToISPanelに実装する
		getLotNo_sublot_no_ListPutter().putBind(SublotNoCols.$i_itm_cd, _itm_cd);
		getLotNo_sublot_no_ListPutter().putBind(SublotNoCols.$i_itm_sub1, _itm_sub1);
		getLotNo_sublot_no_ListPutter().putBind(SublotNoCols.$i_itm_sub2, _itm_sub2);
		getLotNo_sublot_no_ListPutter().putBind(SublotNoCols.$i_itm_sub3, _itm_sub3);
		getLotNo_sublot_no_ListPutter().putBind(SublotNoCols.$i_lot_no, columnLotNo_lot_no);
	}

	
	// イベント処理

	@Override
	protected void listenerInit() {
		super.listenerInit();

		if (_itm_cd != null) {
			((MCLCBeans)_itm_cd).addLCListener(this);
		}
		if (_itm_sub1 != null) {
			((MCLCBeans)_itm_sub1).addLCListener(this);
		}
		if (_itm_sub2 != null) {
			((MCLCBeans)_itm_sub2).addLCListener(this);
		}
		if (_itm_sub3 != null) {
			((MCLCBeans)_itm_sub3).addLCListener(this);
		}
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (lc == _itm_cd || lc == _itm_sub1 || lc == _itm_sub2 || lc == _itm_sub3) {
			doBeans_itm_LC(info);
		}
	}
	
	@Override
	public void doLotNo_lot_no_LC(MCEventInfo info) {
		super.doLotNo_lot_no_LC(info);
		// 新規サブロットを指定するケースで、サブロットが入力不可になるケースでは、サブロットを自動発番するために、ロット入力時にはクリアしておく
		if (_lot_no_mode == LOT_NO_CRT_SLCT) {
			if (MAC_LOT_MNG_TYP.isNOT_MNG((String)getValueOf(_lot_mng_typ, info.getEventIndex()))
					&& MAC_SUBLOT_MNG_TYP.isSTK((String)getValueOf(_sublot_mng_typ, info.getEventIndex()))) {
				if (MAC_LOT_NO_TYP.isAUTO((String)getValueOf(_sublot_no_typ, info.getEventIndex()))) {
					setValueEx(columnLotNo_sublot_no, info.getEventIndex(), null);
				}
			}
			else {
				if ((Boolean)getValueOf(columnLotNo_crt_lot_flg, info.getEventIndex())) {
					if (MAC_LOT_NO_TYP.isAUTO((String)getValueOf(_sublot_no_typ, info.getEventIndex()))) {
						setValueEx(columnLotNo_sublot_no, info.getEventIndex(), null);
					}
				}
			}
		}
		else if (_lot_no_mode == LOT_NO_CRT) {
			if (MAC_LOT_NO_TYP.isAUTO((String)getValueOf(_sublot_no_typ, info.getEventIndex()))) {
				setValueEx(columnLotNo_sublot_no, info.getEventIndex(), null);
			}
		}
	}
	
	@Override
	public void doLotNo_sublot_no_LC(MCEventInfo info) {
		// ロットＮＯ管理区分がロット管理しない、かつサブロットＮＯ管理区分が在庫のみサブロット管理する場合は、ロットＮＯにＮＵＬＬ文字を指定する
		// ロットＮＯが入力不可になり、ＮＵＬＬ文字が入っていないとサブロットＮＯのリストロジックや在庫選択などの機能に悪影響があるため
		if (MAC_LOT_MNG_TYP.isNOT_MNG((String)getValueOf(_lot_mng_typ)) && MAC_SUBLOT_MNG_TYP.isSTK((String)getValueOf(_sublot_mng_typ))) {
			LotNoR r = getLotNoL().get(info.getEventIndex());
			if (isNull(r.sublot_no())) {
				setValueEx(columnLotNo_lot_no, info.getEventIndex(), null);
			}
			else {
				r.lot_no(MAC_STR.NULL_VAL.value());
			}
		}
	}
	
	protected void doBeans_itm_LC(MCEventInfo info) {
		clearCrtLotFlg(info.getEventIndex());
		clearLotNo(info.getEventIndex());
	}
	
	@Override
	public void doLotNo_crt_lot_flg_NC(MCEventInfo info) {
		super.doLotNo_crt_lot_flg_NC(info);
		if (_lot_no_mode == LOT_NO_CRT_SLCT) {
			if (!getLotNoL().get(info.getEventIndex()).crt_lot_flg()) {
				clearLotNo(info.getEventIndex());
			}
		}
	}

	protected void clearCrtLotFlg(int i) {
		if (i < 0) {
			for (LotNoR r : exceptBaseEmpty(LotNoTable)) {
				if (_lot_no_mode == LOT_NO_CRT_SLCT) {
					setValueEx(columnLotNo_crt_lot_flg, r.getGUIIndex(), false);
				}
			}
		}
		else {
			if (_lot_no_mode == LOT_NO_CRT_SLCT) {
				setValueEx(columnLotNo_crt_lot_flg, i, false);
			}
		}
	}

	protected void clearLotNo(int i) {
		if (i < 0) {
			for (LotNoR r : exceptBaseEmpty(LotNoTable)) {
				setValueEx(columnLotNo_lot_no, r.getGUIIndex(), null);
				if (!MAC_SUBLOT_MNG_TYP.isSTK((String)getValueOf(_sublot_mng_typ, i))) {
					setValueEx(columnLotNo_sublot_no, r.getGUIIndex(), null);
				}
			}
		}
		else {
			setValueEx(columnLotNo_lot_no, i, null);
			if (!MAC_SUBLOT_MNG_TYP.isSTK((String)getValueOf(_sublot_mng_typ, i))) {
				setValueEx(columnLotNo_sublot_no, i, null);
			}
		}
	}

	/**
	 * 指定された GUI 部品のモードを取得する。<br>
	 * ■ロットＮＯ<br>
	 * 品目変更時に値をクリアする<br>
	 * ロット作成ＦＬＧをオンからオフに変更時にクリアする（オフからオンの場合、値は不正にならないのでクリアしない）<br>
	 * 品目が確定しない場合は入力不可<br>
	 * ロット管理区分が「ロット管理しない」の場合は入力不可<br>
	 * <br>
	 * ロット作成ＦＬＧで入力制御する場合は以下の仕様となる<br>
	 * ・ロット作成ＦＬＧがオン、かつロットＮＯ区分が「手動」：必須かつ入力モードはFREE<br>
	 * ・ロット作成ＦＬＧがオン、かつロットＮＯ区分が「自動」：入力不可<br>
	 * ・ロット作成ＦＬＧがオン、かつロットＮＯ区分が「手動_未指定:自動」：入力可かつ入力モードはFREE<br>
	 * ・ロット作成ＦＬＧがオフ：入力可かつ入力モードはSTRICT<br>
	 * 常にロット作成する場合は以下の仕様となる<br>
	 * ・ロットＮＯ区分が「手動」：必須かつ入力モードはFREE<br>
	 * ・ロットＮＯ区分が「自動」：入力不可<br>
	 * ・ロットＮＯ区分が「手動_未指定:自動」：入力可かつ入力モードはFREE<br>
	 * ロット作成しない場合は以下の仕様となる<br>
	 * ・入力可かつ入力モードはSTRICT<br>
	 * <br>
	 * ■サブロットＮＯ<br>
	 * 品目変更時に値をクリアする<br>
	 * ロット作成ＦＬＧをオンからオフに変更時にクリアする（オフからオンの場合、値は不正にならないのでクリアしない）<br>
	 * 品目が確定しない場合は入力不可<br>
	 * サブロット管理区分が「サブロット管理しない」の場合は入力不可<br>
	 * ロット作成ＦＬＧで入力制御する場合は以下の仕様となる<br>
	 * ・サブロット管理区分が「在庫のみサブロット管理する」の場合<br>
	 *  ・ロットＮＯ区分が「手動」：必須かつ入力モードはFREE<br>
	 *  ・ロット作成ＦＬＧがオン、かつロットＮＯ区分が「自動」：入力不可<br>
	 *  ・ロット作成ＦＬＧがオフ、かつロットＮＯ区分が「自動」：入力可かつ入力モードはFREE<br>
	 *  ・ロットＮＯ区分が「手動_未指定:自動」：入力可かつ入力モードはFREE<br>
	 * ・サブロット管理区分が「ロット管理しない」、「在庫のみサブロット管理する」以外の場合<br>
	 *  ・ロット作成ＦＬＧがオン、かつロットＮＯ区分が「手動」：必須かつ入力モードはFREE<br>
	 *  ・ロット作成ＦＬＧがオン、かつロットＮＯ区分が「自動」：入力不可<br>
	 *  ・ロット作成ＦＬＧがオン、かつロットＮＯ区分が「手動_未指定:自動」：入力可かつ入力モードはFREE<br>
	 *  ・ロット作成ＦＬＧがオフ：入力可かつ入力モードはSTRICT<br>
	 * 常にロット作成する場合は以下の仕様となる<br>
	 * ・ロットＮＯ区分が「手動」：必須かつ入力モードはFREE<br>
	 * ・ロットＮＯ区分が「自動」：入力不可<br>
	 * ・ロットＮＯ区分が「手動_未指定:自動」：入力可かつ入力モードはFREE<br>
	 * ロット作成しない場合は以下の仕様となる<br>
	 * ・入力可かつ入力モードはSTRICT<br>
	 * <br>
	 * <br>
	 * ■ロット作成ＦＬＧ<br>
	 * ロット作成するかどうかロット作成ＦＬＧで入力制御する場合は以下の仕様となる。<br>
	 * ・品目が確定しない場合は入力不可。<br>
	 * ・ロット管理区分が「ロット管理しない」の場合は入力不可。<br>
     * ・資産管理品、ロット管理対象、且つ、経費購買がオンの場合、入力不可。<br>
	 * 
	 * @param compo GUI 部品
	 * @return モードまたは null
	 */
	@Override
	protected MCMode getCellMode(int index, MCColumnConfig column) {
		if (column == columnLotNo_lot_no && isDefaultModeEditable(column)) {
			// 品目が確定するまでは入力不可
			if (isNull(getValueOf(_itm_sub3, index))) {
				return MCMode.READ_ONLY;
			}
			// 品目確定後は属性とロット作成ＦＬＧに応じて入力制御
			else if (MAC_LOT_MNG_TYP.isNOT_MNG((String)getValueOf(_lot_mng_typ, index))) {
				return MCMode.READ_ONLY;
			}
			else {
				if (_lot_no_mode == LOT_NO_CRT_SLCT) {
					if ((Boolean)getValueOf(columnLotNo_crt_lot_flg, index)) {
						if (MAC_LOT_NO_TYP.isAUTO((String)getValueOf(_lot_no_typ, index))) {
							return MCMode.READ_ONLY;
						}
						else if (isExecClrAndSetModeRO(index)) {
							return MCMode.READ_ONLY;
						}
						else if (MAC_LOT_NO_TYP.isAUTO_MANU((String)getValueOf(_lot_no_typ, index))) {
							return MCMode.ENABLE;
						}
						else {
							return getDefaultMode(column);
						}
					}
					else {
						if (isExecClrAndSetModeRO(index)) {
							return MCMode.READ_ONLY;
						}
						return getDefaultMode(column);
					}
				} else if (_lot_no_mode == LOT_NO_CRT) {
					if (MAC_LOT_NO_TYP.isAUTO((String)getValueOf(_lot_no_typ, index))) {
						return MCMode.READ_ONLY;
					}
					else if (MAC_LOT_NO_TYP.isAUTO_MANU((String)getValueOf(_lot_no_typ, index))) {
						return MCMode.ENABLE;
					}
					else {
						return getDefaultMode(column);
					}
				}
				else if (_lot_no_mode == LOT_NO_SLCT) {
					return getDefaultMode(column);
				}
				else {
					return getDefaultMode(column);
				}
			}
		}
		else if (column == columnLotNo_sublot_no && isDefaultModeEditable(column)) {
			// 品目が確定するまでは入力不可
			if (isNull(getValueOf(_itm_sub3, index))) {
				return MCMode.READ_ONLY;
			}
			// 品目確定後は属性とロット作成ＦＬＧに応じて入力制御
			else if (MAC_SUBLOT_MNG_TYP.isNOT_MNG((String)getValueOf(_sublot_mng_typ, index))) {
				return MCMode.READ_ONLY;
			}
			else {
				if (_lot_no_mode == LOT_NO_CRT_SLCT) {
					// 「在庫のみサブロット管理する」場合、基本的にはロット作成ＦＬＧによらず、発番区分に応じて入力制御する
					if (MAC_SUBLOT_MNG_TYP.isSTK((String)getValueOf(_sublot_mng_typ, index))) {
						if (MAC_LOT_NO_TYP.isAUTO((String)getValueOf(_sublot_no_typ, index))) {
							if ((Boolean)getValueOf(columnLotNo_crt_lot_flg, index)) {
								return MCMode.READ_ONLY;
							}
							// ロット作成ＦＬＧがオフの場合、新規サブロットの場合と既存サブロットの場合を考慮する
							else {
								return MCMode.ENABLE;
							}
						}
						else if (isExecClrAndSetModeRO(index)) {
							return MCMode.READ_ONLY;
						}
						else if (MAC_LOT_NO_TYP.isAUTO_MANU((String)getValueOf(_sublot_no_typ, index))) {
							return MCMode.ENABLE;
						}
						else {
							return getDefaultMode(column);
						}
					}
					// 「在庫のみサブロット管理する」以外の場合、ロット作成ＦＬＧ＋発番区分に応じて入力制御する
					else {
						if ((Boolean)getValueOf(columnLotNo_crt_lot_flg, index)) {
							if (MAC_LOT_NO_TYP.isAUTO((String)getValueOf(_sublot_no_typ, index))) {
								return MCMode.READ_ONLY;
							}
							else if (isExecClrAndSetModeRO(index)) {
								return MCMode.READ_ONLY;
							}
							else if (MAC_LOT_NO_TYP.isAUTO_MANU((String)getValueOf(_sublot_no_typ, index))) {
								return MCMode.ENABLE;
							}
							else {
								return getDefaultMode(column);
							}
						}
						else {
							if (isExecClrAndSetModeRO(index)) {
								return MCMode.READ_ONLY;
							}
							return getDefaultMode(column);
						}
					}
				} else if (_lot_no_mode == LOT_NO_CRT) {
					if (MAC_LOT_NO_TYP.isAUTO((String)getValueOf(_sublot_no_typ, index))) {
						return MCMode.READ_ONLY;
					}
					else if (MAC_LOT_NO_TYP.isAUTO_MANU((String)getValueOf(_sublot_no_typ, index))) {
						return MCMode.ENABLE;
					}
					else {
						return getDefaultMode(column);
					}
				}
				else if (_lot_no_mode == LOT_NO_SLCT) {
					return getDefaultMode(column);
				}
				else {
					return getDefaultMode(column);
				}
			}
		}
		else if (column == columnLotNo_crt_lot_flg && isDefaultModeEditable(column)) {
			if (_lot_no_mode == LOT_NO_CRT_SLCT) {
				// 品目が確定するまでは入力不可
				if (isNull(getValueOf(_itm_sub3, index))) {
					return MCMode.READ_ONLY;
				}
				// 品目確定後は属性とロット作成ＦＬＧに応じて入力制御
				else if (MAC_LOT_MNG_TYP.isNOT_MNG((String)getValueOf(_lot_mng_typ, index))) {
					return MCMode.READ_ONLY;
				}
				// 新規ロット入力不可ＦＬＧがオンの場合入力不可
				else if (_not_new_lot_flg != null && (Boolean)getValueOf(_not_new_lot_flg, index)) {
					return MCMode.READ_ONLY;
				}
				else {
					if (isExecClrAndSetModeRO(index)) {
						clearCrtLotFlg(index);
						clearLotNo(index);
						return MCMode.READ_ONLY;
					}
					return getDefaultMode(column);
				}
			}
			else {
				return MCMode.INVISIBLE;
			}
		}
		return super.getCellMode(index, column);
	}

	boolean isExecClrAndSetModeRO(int index) {
		if (MAC_ASSET_MNG_TYP.isMNG((String)getValueOf(_asset_mng_typ, index))) {
			if ((boolean)getValueOf(_xpns_purc_flg, index)) {
				return true;
			}
		}

		return false;
	}

	@Override
	public void doLotNo_lot_no_NE(MCEventInfo info) {
		super.doLotNo_lot_no_NE(info);

		int index = info.getEventIndex();


		// リストタイプの制御
		if (_lot_no_mode == LOT_NO_CRT_SLCT) {
			if ((Boolean)getValueOf(columnLotNo_crt_lot_flg, index)) {
				columnLotNo_lot_no.setListType(MCListType.FREE);
			}
			else {
				columnLotNo_lot_no.setListType(MCListType.STRICT);
			}
		}
		else if (_lot_no_mode == LOT_NO_CRT) {
			columnLotNo_lot_no.setListType(MCListType.FREE);
		}
		else if (_lot_no_mode == LOT_NO_SLCT) {
			columnLotNo_lot_no.setListType(MCListType.STRICT);
		}
	}

	@Override
	public boolean doLotNo_lot_no_VC(MCEventInfo info) {
//		ロット作成時、ロットＮＯにNULL_VALが設定された場合はfalseを返して入力不可とする。
		if (!super.doLotNo_lot_no_VC(info)) {
			return false;
		}
		
		if ((Boolean)getValueOf(columnLotNo_crt_lot_flg, info.getEventIndex())) {
			if (isSame(info.getNewValue(), MAC_STR.NULL_VAL.value())) {
				return false;
			}
		}
		return true;
	}

	@Override
	public void doLotNo_sublot_no_NE(MCEventInfo info) {
		super.doLotNo_sublot_no_NE(info);

		int index = info.getEventIndex();

		// リストタイプの制御
		if (_lot_no_mode == LOT_NO_CRT_SLCT) {
			// 「在庫のみサブロット管理する」場合、ロット作成ＦＬＧによらず入力モードはFREE
			if (MAC_SUBLOT_MNG_TYP.isSTK((String)getValueOf(_sublot_mng_typ, index))) {
				columnLotNo_sublot_no.setListType(MCListType.FREE);
			}
			// 「在庫のみサブロット管理する」以外の場合、ロット作成ＦＬＧに応じて入力モードを制御する
			else {
				if ((Boolean) getValueOf(columnLotNo_crt_lot_flg, index)) {
					columnLotNo_sublot_no.setListType(MCListType.FREE);
				}
				else {
					columnLotNo_sublot_no.setListType(MCListType.STRICT);
				}
			}
		}
		else if (_lot_no_mode == LOT_NO_CRT) {
			columnLotNo_sublot_no.setListType(MCListType.FREE);
		}
		else if (_lot_no_mode == LOT_NO_SLCT) {
			columnLotNo_sublot_no.setListType(MCListType.STRICT);
		}
	}

	@Override
	public boolean doLotNo_sublot_no_VC(MCEventInfo info) {
//		ロット作成時、サブロットＮＯにNULL_VALが設定された場合はfalseを返して入力不可とする。
		if (!super.doLotNo_sublot_no_VC(info)) {
			return false;
		}

		if (isCellEditable(columnLotNo_sublot_no, info.getEventIndex())) {
			if (isSame(info.getNewValue(), MAC_STR.NULL_VAL.value())) {
				if (!isSame(_lot_no_mode, LOT_NO_SLCT)) {
					return false;
				}
			}
		}
		return true;
	}

}