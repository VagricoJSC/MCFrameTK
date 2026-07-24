package mcframe.serverMSLA.MSLAL6050;

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
 * "MSLAL_XfrInstSendIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSLAL_XfrInstSendIfService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSLAL6050";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSLAL_XfrInstSendIfService.XfrInstSendIf_Upd01 aXfrInstSendIf_Upd01;

	protected void initXfrInstSendIf_Upd01() {
		this.info = PDef.MS_MSLAL6050_XfrInstSendIf_Upd01_INFO;
		this.aXfrInstSendIf_Upd01 = ((MSLAL_XfrInstSendIfService)this).new XfrInstSendIf_Upd01();
	}

	public static MSLAL_XfrInstSendIfService.XfrInstSendIf_Upd01 crtXfrInstSendIf_Upd01() {
		MSLAL_XfrInstSendIfService lgc = new MSLAL_XfrInstSendIfService();
		lgc.initXfrInstSendIf_Upd01();
		return lgc.aXfrInstSendIf_Upd01;
	}

	protected void paramXfrInstSendIf_Upd01(MCParam p) {
		if (this.aXfrInstSendIf_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aXfrInstSendIf_Upd01.up0());
	}

	protected void doXfrInstSendIf_Upd01() {
		aXfrInstSendIf_Upd01.call();
	};

	/**
	 * XfrInstSendIf_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL6050.XfrInstSendIf_Upd01_DtlR createXfrInstSendIf_Upd01_DtlR(){
		return mcframe.serverMSLA.MSLAL6050.XfrInstSendIf_Upd01_DtlR.create();
	}

	/**
	 * XfrInstSendIf_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL6050.XfrInstSendIf_Upd01_DtlR> createXfrInstSendIf_Upd01_DtlL(){
		return MCList.create(mcframe.serverMSLA.MSLAL6050.XfrInstSendIf_Upd01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * XfrInstSendIf_Upd01オペレーション.<p>
	 *
	 * 送信対象の移動指図をＩＦテーブルに書き込む<br>
	 */
	abstract public class XfrInstSendIf_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "XfrInstSendIf_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL6050.XfrInstSendIf_Upd01_DtlR> up0;
		
		
		// コンストラクタ
		protected XfrInstSendIf_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL6050.XfrInstSendIf_Upd01_DtlR.class);

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
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MSLAL_XfrInstSendIfService)MSLAL_XfrInstSendIfService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * XfrInstSendIf_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL6050.XfrInstSendIf_Upd01_DtlR createXfrInstSendIf_Upd01_DtlR(){
			return mcframe.serverMSLA.MSLAL6050.XfrInstSendIf_Upd01_DtlR.create();
		}

		/**
		 * XfrInstSendIf_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL6050.XfrInstSendIf_Upd01_DtlR> createXfrInstSendIf_Upd01_DtlL(){
			return MCList.create(mcframe.serverMSLA.MSLAL6050.XfrInstSendIf_Upd01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>xfr_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL6050.XfrInstSendIf_Upd01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_XfrInstSendIfService)MSLAL_XfrInstSendIfService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}