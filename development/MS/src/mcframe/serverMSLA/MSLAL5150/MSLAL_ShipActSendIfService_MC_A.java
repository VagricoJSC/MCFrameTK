package mcframe.serverMSLA.MSLAL5150;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "MSLAL_ShipActSendIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSLAL_ShipActSendIfService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MS";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MSLA";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSLAL5150";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSLAL_ShipActSendIfService.ShipActSendIf_Upd01 aShipActSendIf_Upd01;

	protected void initShipActSendIf_Upd01() {
		this.info = PDef.MS_MSLAL5150_ShipActSendIf_Upd01_INFO;
		this.aShipActSendIf_Upd01 = ((MSLAL_ShipActSendIfService)this).new ShipActSendIf_Upd01();
	}

	public static MSLAL_ShipActSendIfService.ShipActSendIf_Upd01 crtShipActSendIf_Upd01() {
		MSLAL_ShipActSendIfService lgc = new MSLAL_ShipActSendIfService();
		lgc.initShipActSendIf_Upd01();
		return lgc.aShipActSendIf_Upd01;
	}

	protected void paramShipActSendIf_Upd01(MCParam p) {
		if (this.aShipActSendIf_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipActSendIf_Upd01.up0());
		p.addUpBlock(aShipActSendIf_Upd01.up1());
		p.addUpBlock(aShipActSendIf_Upd01.up2());
	}

	protected void doShipActSendIf_Upd01() {
		aShipActSendIf_Upd01.call();
	};

	/**
	 * ShipActSendIf_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL5150.ShipActSendIf_Upd01_DtlR createShipActSendIf_Upd01_DtlR(){
		return mcframe.serverMSLA.MSLAL5150.ShipActSendIf_Upd01_DtlR.create();
	}

	/**
	 * ShipActSendIf_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL5150.ShipActSendIf_Upd01_DtlR> createShipActSendIf_Upd01_DtlL(){
		return MCList.create(mcframe.serverMSLA.MSLAL5150.ShipActSendIf_Upd01_DtlR.class);
	}

	/**
	 * ShipActSendIf_Upd01_DlvブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL5150.ShipActSendIf_Upd01_DlvR createShipActSendIf_Upd01_DlvR(){
		return mcframe.serverMSLA.MSLAL5150.ShipActSendIf_Upd01_DlvR.create();
	}

	/**
	 * ShipActSendIf_Upd01_DlvブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL5150.ShipActSendIf_Upd01_DlvR> createShipActSendIf_Upd01_DlvL(){
		return MCList.create(mcframe.serverMSLA.MSLAL5150.ShipActSendIf_Upd01_DlvR.class);
	}

	/**
	 * ShipActSendIf_Upd01_IvDlvブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL5150.ShipActSendIf_Upd01_IvDlvR createShipActSendIf_Upd01_IvDlvR(){
		return mcframe.serverMSLA.MSLAL5150.ShipActSendIf_Upd01_IvDlvR.create();
	}

	/**
	 * ShipActSendIf_Upd01_IvDlvブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL5150.ShipActSendIf_Upd01_IvDlvR> createShipActSendIf_Upd01_IvDlvL(){
		return MCList.create(mcframe.serverMSLA.MSLAL5150.ShipActSendIf_Upd01_IvDlvR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * ShipActSendIf_Upd01オペレーション.<p>
	 *
	 * 送信対象のＥＤＩ出荷実績をＩＦテーブルに書き込む<br>
	 */
	abstract public class ShipActSendIf_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipActSendIf_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL5150.ShipActSendIf_Upd01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL5150.ShipActSendIf_Upd01_DlvR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL5150.ShipActSendIf_Upd01_IvDlvR> up2;
		
		
		// コンストラクタ
		protected ShipActSendIf_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL5150.ShipActSendIf_Upd01_DtlR.class);
			up1 = MCList.create(mcframe.serverMSLA.MSLAL5150.ShipActSendIf_Upd01_DlvR.class);
			up2 = MCList.create(mcframe.serverMSLA.MSLAL5150.ShipActSendIf_Upd01_IvDlvR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			if (i == 2) return up2();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MSLAL_ShipActSendIfService)MSLAL_ShipActSendIfService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ShipActSendIf_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL5150.ShipActSendIf_Upd01_DtlR createShipActSendIf_Upd01_DtlR(){
			return mcframe.serverMSLA.MSLAL5150.ShipActSendIf_Upd01_DtlR.create();
		}

		/**
		 * ShipActSendIf_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL5150.ShipActSendIf_Upd01_DtlR> createShipActSendIf_Upd01_DtlL(){
			return MCList.create(mcframe.serverMSLA.MSLAL5150.ShipActSendIf_Upd01_DtlR.class);
		}

		/**
		 * ShipActSendIf_Upd01_DlvブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL5150.ShipActSendIf_Upd01_DlvR createShipActSendIf_Upd01_DlvR(){
			return mcframe.serverMSLA.MSLAL5150.ShipActSendIf_Upd01_DlvR.create();
		}

		/**
		 * ShipActSendIf_Upd01_DlvブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL5150.ShipActSendIf_Upd01_DlvR> createShipActSendIf_Upd01_DlvL(){
			return MCList.create(mcframe.serverMSLA.MSLAL5150.ShipActSendIf_Upd01_DlvR.class);
		}

		/**
		 * ShipActSendIf_Upd01_IvDlvブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL5150.ShipActSendIf_Upd01_IvDlvR createShipActSendIf_Upd01_IvDlvR(){
			return mcframe.serverMSLA.MSLAL5150.ShipActSendIf_Upd01_IvDlvR.create();
		}

		/**
		 * ShipActSendIf_Upd01_IvDlvブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL5150.ShipActSendIf_Upd01_IvDlvR> createShipActSendIf_Upd01_IvDlvL(){
			return MCList.create(mcframe.serverMSLA.MSLAL5150.ShipActSendIf_Upd01_IvDlvR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL5150.ShipActSendIf_Upd01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>upded_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL5150.ShipActSendIf_Upd01_DlvR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL5150.ShipActSendIf_Upd01_IvDlvR> up2() {
			return up2;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_ShipActSendIfService)MSLAL_ShipActSendIfService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}