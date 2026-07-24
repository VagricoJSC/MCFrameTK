package mcframe.serverMSBE.MSBEL5540;

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
 * "MSBEL_ShipActService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEL_ShipActService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBE";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBEL5540";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBEL_ShipActService.ShipAct_Upd01 aShipAct_Upd01;

	protected void initShipAct_Upd01() {
		this.info = PDef.MS_MSBEL5540_ShipAct_Upd01_INFO;
		this.aShipAct_Upd01 = ((MSBEL_ShipActService)this).new ShipAct_Upd01();
	}

	public static MSBEL_ShipActService.ShipAct_Upd01 crtShipAct_Upd01() {
		MSBEL_ShipActService lgc = new MSBEL_ShipActService();
		lgc.initShipAct_Upd01();
		return lgc.aShipAct_Upd01;
	}

	protected void paramShipAct_Upd01(MCParam p) {
		if (this.aShipAct_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipAct_Upd01.up0());
		p.addUpBlock(aShipAct_Upd01.up1());
		p.addUpBlock(aShipAct_Upd01.up2());
		p.addDownBlock(aShipAct_Upd01.down0());
		p.addDownBlock(aShipAct_Upd01.down1());
	}

	protected void doShipAct_Upd01() {
		aShipAct_Upd01.call();
	};

	/**
	 * ShipAct_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR createShipAct_HdrR(){
		return mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR.create();
	}

	/**
	 * ShipAct_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR> createShipAct_HdrL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR.class);
	}

	/**
	 * ShipAct_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR createShipAct_DtlR(){
		return mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR.create();
	}

	/**
	 * ShipAct_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR> createShipAct_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR.class);
	}

	/**
	 * ShipAct_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5540.ShipAct_CndR createShipAct_CndR(){
		return mcframe.serverMSBE.MSBEL5540.ShipAct_CndR.create();
	}
	protected MSBEL_ShipActService.ShipAct_Upd02 aShipAct_Upd02;

	protected void initShipAct_Upd02() {
		this.info = PDef.MS_MSBEL5540_ShipAct_Upd02_INFO;
		this.aShipAct_Upd02 = ((MSBEL_ShipActService)this).new ShipAct_Upd02();
	}

	public static MSBEL_ShipActService.ShipAct_Upd02 crtShipAct_Upd02() {
		MSBEL_ShipActService lgc = new MSBEL_ShipActService();
		lgc.initShipAct_Upd02();
		return lgc.aShipAct_Upd02;
	}

	protected void paramShipAct_Upd02(MCParam p) {
		if (this.aShipAct_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipAct_Upd02.up0());
	}

	protected void doShipAct_Upd02() {
		aShipAct_Upd02.call();
	};
	protected MSBEL_ShipActService.ShipAct_Upd03 aShipAct_Upd03;

	protected void initShipAct_Upd03() {
		this.info = PDef.MS_MSBEL5540_ShipAct_Upd03_INFO;
		this.aShipAct_Upd03 = ((MSBEL_ShipActService)this).new ShipAct_Upd03();
	}

	public static MSBEL_ShipActService.ShipAct_Upd03 crtShipAct_Upd03() {
		MSBEL_ShipActService lgc = new MSBEL_ShipActService();
		lgc.initShipAct_Upd03();
		return lgc.aShipAct_Upd03;
	}

	protected void paramShipAct_Upd03(MCParam p) {
		if (this.aShipAct_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipAct_Upd03.up0());
	}

	protected void doShipAct_Upd03() {
		aShipAct_Upd03.call();
	};
	protected MSBEL_ShipActService.ShipAct_Chk01 aShipAct_Chk01;

	protected void initShipAct_Chk01() {
		this.info = PDef.MS_MSBEL5540_ShipAct_Chk01_INFO;
		this.aShipAct_Chk01 = ((MSBEL_ShipActService)this).new ShipAct_Chk01();
	}

	public static MSBEL_ShipActService.ShipAct_Chk01 crtShipAct_Chk01() {
		MSBEL_ShipActService lgc = new MSBEL_ShipActService();
		lgc.initShipAct_Chk01();
		return lgc.aShipAct_Chk01;
	}

	protected void paramShipAct_Chk01(MCParam p) {
		if (this.aShipAct_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipAct_Chk01.up0());
		p.addUpBlock(aShipAct_Chk01.up1());
		p.addUpBlock(aShipAct_Chk01.up2());
		p.addDownBlock(aShipAct_Chk01.down0());
		p.addDownBlock(aShipAct_Chk01.down1());
	}

	protected void doShipAct_Chk01() {
		aShipAct_Chk01.call();
	};

	/**
	 * SihpAct_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR createSihpAct_DtlR(){
		return mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR.create();
	}

	/**
	 * SihpAct_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR> createSihpAct_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR.class);
	}

	/**
	 * ShipAct_Del_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5540.ShipAct_Del_DtlR createShipAct_Del_DtlR(){
		return mcframe.serverMSBE.MSBEL5540.ShipAct_Del_DtlR.create();
	}

	/**
	 * ShipAct_Del_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_Del_DtlR> createShipAct_Del_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5540.ShipAct_Del_DtlR.class);
	}
	protected MSBEL_ShipActService.ShipAct_InptChk01 aShipAct_InptChk01;

	protected void initShipAct_InptChk01() {
		this.info = PDef.MS_MSBEL5540_ShipAct_InptChk01_INFO;
		this.aShipAct_InptChk01 = ((MSBEL_ShipActService)this).new ShipAct_InptChk01();
	}

	public static MSBEL_ShipActService.ShipAct_InptChk01 crtShipAct_InptChk01() {
		MSBEL_ShipActService lgc = new MSBEL_ShipActService();
		lgc.initShipAct_InptChk01();
		return lgc.aShipAct_InptChk01;
	}

	protected void paramShipAct_InptChk01(MCParam p) {
		if (this.aShipAct_InptChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipAct_InptChk01.up0());
		p.addUpBlock(aShipAct_InptChk01.up1());
		p.addUpBlock(aShipAct_InptChk01.up2());
		p.addUpBlock(aShipAct_InptChk01.up3());
		p.addDownBlock(aShipAct_InptChk01.down0());
		p.addDownBlock(aShipAct_InptChk01.down1());
	}

	protected void doShipAct_InptChk01() {
		aShipAct_InptChk01.call();
	};

	/**
	 * ShipAct_InptChk01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_HdrR createShipAct_InptChk01_HdrR(){
		return mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_HdrR.create();
	}

	/**
	 * ShipAct_InptChk01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_HdrR> createShipAct_InptChk01_HdrL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_HdrR.class);
	}

	/**
	 * ShipAct_InptChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_DtlR createShipAct_InptChk01_DtlR(){
		return mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_DtlR.create();
	}

	/**
	 * ShipAct_InptChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_DtlR> createShipAct_InptChk01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_DtlR.class);
	}

	/**
	 * ShipAct_InptChk01_CntrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_CntrR createShipAct_InptChk01_CntrR(){
		return mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_CntrR.create();
	}

	/**
	 * ShipAct_InptChk01_CntrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_CntrR> createShipAct_InptChk01_CntrL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_CntrR.class);
	}

	/**
	 * ShipAct_InptChk01_Del_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_Del_DtlR createShipAct_InptChk01_Del_DtlR(){
		return mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_Del_DtlR.create();
	}

	/**
	 * ShipAct_InptChk01_Del_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_Del_DtlR> createShipAct_InptChk01_Del_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_Del_DtlR.class);
	}
	protected MSBEL_ShipActService.ShipAct_InptChk02 aShipAct_InptChk02;

	protected void initShipAct_InptChk02() {
		this.info = PDef.MS_MSBEL5540_ShipAct_InptChk02_INFO;
		this.aShipAct_InptChk02 = ((MSBEL_ShipActService)this).new ShipAct_InptChk02();
	}

	public static MSBEL_ShipActService.ShipAct_InptChk02 crtShipAct_InptChk02() {
		MSBEL_ShipActService lgc = new MSBEL_ShipActService();
		lgc.initShipAct_InptChk02();
		return lgc.aShipAct_InptChk02;
	}

	protected void paramShipAct_InptChk02(MCParam p) {
		if (this.aShipAct_InptChk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipAct_InptChk02.up0());
		p.addUpBlock(aShipAct_InptChk02.up1());
		p.addDownBlock(aShipAct_InptChk02.down0());
	}

	protected void doShipAct_InptChk02() {
		aShipAct_InptChk02.call();
	};

	/**
	 * ShipAct_InptChk02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk02_HdrR createShipAct_InptChk02_HdrR(){
		return mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk02_HdrR.create();
	}

	/**
	 * ShipAct_InptChk02_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk02_HdrR> createShipAct_InptChk02_HdrL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk02_HdrR.class);
	}

	/**
	 * ShipAct_InptChk02_CntrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_CntrR createShipAct_InptChk02_CntrR(){
		return mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_CntrR.create();
	}

	/**
	 * ShipAct_InptChk02_CntrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_CntrR> createShipAct_InptChk02_CntrL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_CntrR.class);
	}
	protected MSBEL_ShipActService.ShipAct_RevUpd01 aShipAct_RevUpd01;

	protected void initShipAct_RevUpd01() {
		this.info = PDef.MS_MSBEL5540_ShipAct_RevUpd01_INFO;
		this.aShipAct_RevUpd01 = ((MSBEL_ShipActService)this).new ShipAct_RevUpd01();
	}

	public static MSBEL_ShipActService.ShipAct_RevUpd01 crtShipAct_RevUpd01() {
		MSBEL_ShipActService lgc = new MSBEL_ShipActService();
		lgc.initShipAct_RevUpd01();
		return lgc.aShipAct_RevUpd01;
	}

	protected void paramShipAct_RevUpd01(MCParam p) {
		if (this.aShipAct_RevUpd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipAct_RevUpd01.up0());
	}

	protected void doShipAct_RevUpd01() {
		aShipAct_RevUpd01.call();
	};

	/**
	 * ShipAct_RevUpd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR createShipAct_RevUpd01_DtlR(){
		return mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR.create();
	}

	/**
	 * ShipAct_RevUpd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR> createShipAct_RevUpd01_DtlL(){
		return MCList.create(mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * ShipAct_Upd01オペレーション.<p>
	 *
	 * 出荷実績を登録・更新・削除する。<br>
	 */
	abstract public class ShipAct_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipAct_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5540.ShipAct_CndR up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR> down1;
		
		
		// コンストラクタ
		protected ShipAct_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR.class);
			up2 = mcframe.serverMSBE.MSBEL5540.ShipAct_CndR.create();
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR.class);

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
			if (i == 0) return down0();
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_ShipActService)MSBEL_ShipActService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * ShipAct_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR createShipAct_HdrR(){
			return mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR.create();
		}

		/**
		 * ShipAct_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR> createShipAct_HdrL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR.class);
		}

		/**
		 * ShipAct_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR createShipAct_DtlR(){
			return mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR.create();
		}

		/**
		 * ShipAct_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR> createShipAct_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR.class);
		}

		/**
		 * ShipAct_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5540.ShipAct_CndR createShipAct_CndR(){
			return mcframe.serverMSBE.MSBEL5540.ShipAct_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_inst_no</td></tr>
		 * 	<tr><td><br></td><td>sa.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_tm</td></tr>
		 * 	<tr><td><br></td><td>sa.dlv_tm</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>sa.rqst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.rqst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_to_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.cst_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_to_id_typ</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_to_id_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_to_id_nm</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_to_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_to_addr1</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_to_addr2</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_to_addr3</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_to_addr4</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_to_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_to_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_to_tel</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_to_fax</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_to_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>sa.via_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>sa.iv_no</td></tr>
		 * 	<tr><td><br></td><td>sa.uplnd_flg</td></tr>
		 * 	<tr><td><br></td><td>sa.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sa.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sa.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sa.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_adv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_chk_off_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_flg</td></tr>
		 * 	<tr><td><br></td><td>io_act_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_act_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>uplnd_iv_sls_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_dtl_mod_flg</td></tr>
		 * 	<tr><td><br></td><td>ref_ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>sad.ship_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>sad.disp_seq</td></tr>
		 * 	<tr><td><br></td><td>sad.ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>sad.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>sad.ship_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.ship_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_id_typ</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_id_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_id_nm</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>sad.pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>sad.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>sad.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>sad.itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sad.iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sad.sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>sad.stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sad.sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sad.sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sad.sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sad.sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sad.sno1</td></tr>
		 * 	<tr><td><br></td><td>sad.sno2</td></tr>
		 * 	<tr><td><br></td><td>sad.sno3</td></tr>
		 * 	<tr><td><br></td><td>sad.sno4</td></tr>
		 * 	<tr><td><br></td><td>sad.lot_no</td></tr>
		 * 	<tr><td><br></td><td>sad.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sad.ver_no</td></tr>
		 * 	<tr><td><br></td><td>sad.stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>sad.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>sad.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>sad.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>sad.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.skip_chk_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>sad.rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>sad.cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>sad.cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>sad.cst_dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>sad.cst_dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>sad.cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sad.base_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>sad.base_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>sad.base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>sad.arr_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sad.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sad.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sad.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sad.io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>sad.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sad.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sad.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_slip_seq</td></tr>
		 * 	<tr><td><br></td><td>sad.wms_flg</td></tr>
		 * 	<tr><td><br></td><td>sad.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.ext_ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>non_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>ref_ship_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_sync_flg</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>org_peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bndl_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5540.ShipAct_CndR
		 */
		public mcframe.serverMSBE.MSBEL5540.ShipAct_CndR up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sa.ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_act_rev</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_prnted_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_adv_prnted_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sad.ship_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>sad.ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>sad.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_slip_seq</td></tr>
		 * 	<tr><td><br></td><td>pr_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>pr_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipActService)MSBEL_ShipActService_MC_A.this).info;
		}


	}
	/**
	 * ShipAct_Upd02オペレーション.<p>
	 *
	 * 出荷返品および納品数量を更新する。<br>
	 */
	abstract public class ShipAct_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipAct_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR> up0;
		
		
		// コンストラクタ
		protected ShipAct_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR.class);

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
			invoke((MSBEL_ShipActService)MSBEL_ShipActService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ShipAct_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR createShipAct_DtlR(){
			return mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR.create();
		}

		/**
		 * ShipAct_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR> createShipAct_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sad.ship_ret_flg</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_slip_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipActService)MSBEL_ShipActService_MC_A.this).info;
		}


	}
	/**
	 * ShipAct_Upd03オペレーション.<p>
	 *
	 * 現品票発行済フラグをオン(発行済)に更新する。<br>
	 */
	abstract public class ShipAct_Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipAct_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR> up0;
		
		
		// コンストラクタ
		protected ShipAct_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR.class);

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
			invoke((MSBEL_ShipActService)MSBEL_ShipActService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ShipAct_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR createShipAct_DtlR(){
			return mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR.create();
		}

		/**
		 * ShipAct_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR> createShipAct_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sad.ship_act_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipActService)MSBEL_ShipActService_MC_A.this).info;
		}


	}
	/**
	 * ShipAct_Chk01オペレーション.<p>
	 *
	 * 出荷実績の登録・更新・削除の前に後続のチェックサービスを呼び出し登録・更新・削除が可能かチェックをする。<br>
	 */
	abstract public class ShipAct_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipAct_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_Del_DtlR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR> down1;
		
		
		// コンストラクタ
		protected ShipAct_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBE.MSBEL5540.ShipAct_Del_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR.class);

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
			if (i == 0) return down0();
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_ShipActService)MSBEL_ShipActService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * ShipAct_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR createShipAct_HdrR(){
			return mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR.create();
		}

		/**
		 * ShipAct_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR> createShipAct_HdrL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR.class);
		}

		/**
		 * SihpAct_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR createSihpAct_DtlR(){
			return mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR.create();
		}

		/**
		 * SihpAct_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR> createSihpAct_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR.class);
		}

		/**
		 * ShipAct_Del_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5540.ShipAct_Del_DtlR createShipAct_Del_DtlR(){
			return mcframe.serverMSBE.MSBEL5540.ShipAct_Del_DtlR.create();
		}

		/**
		 * ShipAct_Del_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_Del_DtlR> createShipAct_Del_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5540.ShipAct_Del_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_inst_no</td></tr>
		 * 	<tr><td><br></td><td>sa.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_tm</td></tr>
		 * 	<tr><td><br></td><td>sa.dlv_tm</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.cst_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_to_id_typ</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_to_id_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.via_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>sa.iv_no</td></tr>
		 * 	<tr><td><br></td><td>sa.uplnd_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_chk_off_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>ship_cmpl_no_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>uplnd_iv_sls_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_dtl_mod_flg</td></tr>
		 * 	<tr><td><br></td><td>ref_ship_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>sad.ship_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>sad.ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>sad.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>sad.ship_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.ship_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_id_typ</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_id_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>sad.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>sad.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>sad.itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sad.sno1</td></tr>
		 * 	<tr><td><br></td><td>sad.sno2</td></tr>
		 * 	<tr><td><br></td><td>sad.sno3</td></tr>
		 * 	<tr><td><br></td><td>sad.sno4</td></tr>
		 * 	<tr><td><br></td><td>sad.lot_no</td></tr>
		 * 	<tr><td><br></td><td>sad.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sad.stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>sad.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>sad.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>sad.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>sad.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.skip_chk_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>sad.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.base_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>sad.base_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>sad.base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>non_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>ref_ship_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_sync_flg</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_act_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_Del_DtlR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>uplnd_iv_sls_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipActService)MSBEL_ShipActService_MC_A.this).info;
		}


	}
	/**
	 * ShipAct_InptChk01オペレーション.<p>
	 *
	 * 出荷実績の登録・更新が可能かチェックをする。<br>
	 */
	abstract public class ShipAct_InptChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipAct_InptChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_CntrR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_Del_DtlR> up3;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_DtlR> down1;
		
		/**
		 * 連携情報 SA<p>
		 *
		 * 連携先 mcframe.serverMSBE.MSBEL5540.MSBEL_ShipActService.ShipAct_Chk01 （{@link #v0}）<br>
		 */
		public final String SA = "SA";

		/**
		 * 連携オペレーション v0<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBE.MSBEL5540.MSBEL_ShipActService.ShipAct_Chk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR&gt; （{@link #v0_up0}）<br>
		 * 第2 上りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR&gt; （{@link #v0_up1}）<br>
		 * 第3 上りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL5540.ShipAct_Del_DtlR&gt; （{@link #v0_up2}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR&gt; （{@link #v0_down0}）<br>
		 * 第2 下りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR&gt; （{@link #v0_down1}）<br>
		 */
		public final mcframe.serverMSBE.MSBEL5540.MSBEL_ShipActService.ShipAct_Chk01 v0;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR> v0_up0;
		public final MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR> v0_up1;
		public final MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_Del_DtlR> v0_up2;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR> v0_down0;
		public final MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR> v0_down1;
		
		// コンストラクタ
		protected ShipAct_InptChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_CntrR.class);
			up3 = MCList.create(mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_Del_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_DtlR.class);

			// 連携オペレーションの初期化
			v0 = mcframe.serverMSBE.MSBEL5540.MSBEL_ShipActService.crtShipAct_Chk01();
			
			// 連携オペレーションのコンテナ取得
			v0_up0 = (MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR>)v0.up(0);
			v0_up1 = (MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR>)v0.up(1);
			v0_up2 = (MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_Del_DtlR>)v0.up(2);
			v0_down0 = (MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR>)v0.down(0);
			v0_down1 = (MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR>)v0.down(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(SA, v0);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * SA<br>
		 * up0() => MCList&lt;mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR&gt; （{@link #v0_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR&gt; （{@link #v0_up1}）<br>
		 * up3() => MCList&lt;mcframe.serverMSBE.MSBEL5540.ShipAct_Del_DtlR&gt; （{@link #v0_up2}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(SA)) {
				up_SA(v0_up0, v0_up1, v0_up2, up0(), up1(), up3());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * SA<br>
		 * MCList&lt;mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR&gt;（{@link #v0_down0}）=> down0()<br>
		 * MCList&lt;mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR&gt;（{@link #v0_down1}）=> down1()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(SA)) {
				down_SA(down0(), down1(), v0_down0, v0_down1);
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			if (i == 2) return up2();
			if (i == 3) return up3();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_ShipActService)MSBEL_ShipActService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * ShipAct_InptChk01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_HdrR createShipAct_InptChk01_HdrR(){
			return mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_HdrR.create();
		}

		/**
		 * ShipAct_InptChk01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_HdrR> createShipAct_InptChk01_HdrL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_HdrR.class);
		}

		/**
		 * ShipAct_InptChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_DtlR createShipAct_InptChk01_DtlR(){
			return mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_DtlR.create();
		}

		/**
		 * ShipAct_InptChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_DtlR> createShipAct_InptChk01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_DtlR.class);
		}

		/**
		 * ShipAct_InptChk01_CntrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_CntrR createShipAct_InptChk01_CntrR(){
			return mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_CntrR.create();
		}

		/**
		 * ShipAct_InptChk01_CntrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_CntrR> createShipAct_InptChk01_CntrL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_CntrR.class);
		}

		/**
		 * ShipAct_InptChk01_Del_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_Del_DtlR createShipAct_InptChk01_Del_DtlR(){
			return mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_Del_DtlR.create();
		}

		/**
		 * ShipAct_InptChk01_Del_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_Del_DtlR> createShipAct_InptChk01_Del_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_Del_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_no</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_tm</td></tr>
		 * 	<tr><td><br></td><td>rqst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_to_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr1</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr2</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr3</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr4</td></tr>
		 * 	<tr><td><br></td><td>ship_to_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>ship_to_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>ship_to_tel</td></tr>
		 * 	<tr><td><br></td><td>ship_to_fax</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>uplnd_flg</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_adv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_chk_off_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>dlv_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>cst_dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>base_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>base_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_seq</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>skip_chk_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>wms_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_CntrR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_act_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_Del_DtlR> up3() {
			return up3;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_no</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_tm</td></tr>
		 * 	<tr><td><br></td><td>rqst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_to_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr1</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr2</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr3</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr4</td></tr>
		 * 	<tr><td><br></td><td>ship_to_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>ship_to_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>ship_to_tel</td></tr>
		 * 	<tr><td><br></td><td>ship_to_fax</td></tr>
		 * 	<tr><td><br></td><td>ship_to_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>via_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_to_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>uplnd_flg</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_adv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_chk_off_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>cst_dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>base_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>base_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_seq</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>skip_chk_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>non_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>wms_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipActService)MSBEL_ShipActService_MC_A.this).info;
		}

		//-----------------------SA専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSAの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SA(MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR> dest0_0, MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR> dest0_1, MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_Del_DtlR> dest0_2, MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_HdrR> src_ShipAct_InptChk01_Hdr, MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_DtlR> src_ShipAct_InptChk01_Dtl, MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_Del_DtlR> src_ShipAct_InptChk01_Del_Dtl){
			up_SA_v0_0(dest0_0, src_ShipAct_InptChk01_Hdr);
			up_SA_v0_1(dest0_1, src_ShipAct_InptChk01_Dtl);
			up_SA_v0_2(dest0_2, src_ShipAct_InptChk01_Del_Dtl);
		}
		
		/**
		 * 連携処理SA_v0の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_SA_v0_0() {
			MCRowMapper map = new Map_up_SA_v0_0();
			return map;
		}

		/**
		 * 連携処理SA_v0の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_SA_v0_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("ship_act_no", "ship_act_no");
				addColumnPathMap("ship_inst_no", "ship_inst_no");
				addColumnPathMap("ac_dt", "ac_dt");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
				addColumnPathMap("ship_tm", "ship_tm");
				addColumnPathMap("dlv_tm", "dlv_tm");
				addColumnPathMap("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd");
				addColumnPathMap("cst_cd", "cst_cd");
				addColumnPathMap("ship_to_id_typ", "ship_to_id_typ");
				addColumnPathMap("ship_to_id_cd", "ship_to_id_cd");
				addColumnPathMap("via_dlv_typ", "via_dlv_typ");
				addColumnPathMap("iv_no", "iv_no");
				addColumnPathMap("uplnd_flg", "uplnd_flg");
				addColumnPathMap("lot_chk_off_flg", "lot_chk_off_flg");
				addColumnPathMap("peg_no", "peg_no");
			}
		}

		/**
		 * 連携処理SA_v0の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_SA_v0_0(mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR r_dest, mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_HdrR r_src) {
		}

		/**
		 * 連携処理SA_v0の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_SA_v0_0(MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR> dest, MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_HdrR> src) {
			MCRowMapper _rm = createMap_up_SA_v0_0();
			for(mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_HdrR r_src : src){
				mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_SA_v0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理SA_v0の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_SA_v0_1() {
			MCRowMapper map = new Map_up_SA_v0_1();
			return map;
		}

		/**
		 * 連携処理SA_v0の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_SA_v0_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("ship_act_d_no", "ship_act_d_no");
				addColumnPathMap("ship_alloc_sts_no", "ship_alloc_sts_no");
				addColumnPathMap("trd_cd", "trd_cd");
				addColumnPathMap("trd_ptn_typ", "trd_ptn_typ");
				addColumnPathMap("ship_loc_cd", "ship_loc_cd");
				addColumnPathMap("ship_str_ln_cd", "ship_str_ln_cd");
				addColumnPathMap("dlv_id_typ", "dlv_id_typ");
				addColumnPathMap("dlv_id_cd", "dlv_id_cd");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("not_lot_mix_flg", "not_lot_mix_flg");
				addColumnPathMap("not_sublot_mix_flg", "not_sublot_mix_flg");
				addColumnPathMap("stk_arrv_bp_cd", "stk_arrv_bp_cd");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("quality_typ", "quality_typ");
				addColumnPathMap("stk_id_typ", "stk_id_typ");
				addColumnPathMap("stk_bp_cd", "stk_bp_cd");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("base_unit_qty", "base_unit_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("bd_dpt_cd", "bd_dpt_cd");
				addColumnPathMap("base_dlv_slip_no", "base_dlv_slip_no");
				addColumnPathMap("base_prov_act_no", "base_prov_act_no");
				addColumnPathMap("base_ac_dt", "base_ac_dt");
				addColumnPathMap("abort_flg", "abort_flg");
				addColumnPathMap("skip_chk_ship_flg", "skip_chk_ship_flg");
				addColumnPathMap("non_upd_flg", "non_upd_flg");
				addColumnPathMap("iv_no", "iv_no");
				addColumnPathMap("iv_d_no", "iv_d_no");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("peg_no", "peg_no");
			}
		}

		/**
		 * 連携処理SA_v0の上りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_SA_v0_1(mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR r_dest, mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_DtlR r_src) {
		}

		/**
		 * 連携処理SA_v0の上りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_SA_v0_1(MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR> dest, MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_SA_v0_1();
			for(mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_DtlR r_src : src){
				mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_SA_v0_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理SA_v0の上りブロック2のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_SA_v0_2() {
			MCRowMapper map = new Map_up_SA_v0_2();
			return map;
		}

		/**
		 * 連携処理SA_v0の上りブロック2のためのRowMapperクラス。<p>
		 */
		public class Map_up_SA_v0_2 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("ship_act_d_no", "ship_act_d_no");
			}
		}

		/**
		 * 連携処理SA_v0の上りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_SA_v0_2(mcframe.serverMSBE.MSBEL5540.ShipAct_Del_DtlR r_dest, mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_Del_DtlR r_src) {
		}

		/**
		 * 連携処理SA_v0の上りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_SA_v0_2(MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_Del_DtlR> dest, MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_Del_DtlR> src) {
			MCRowMapper _rm = createMap_up_SA_v0_2();
			for(mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_Del_DtlR r_src : src){
				mcframe.serverMSBE.MSBEL5540.ShipAct_Del_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_SA_v0_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------SA専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSAの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SA(MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_HdrR> dest_ShipAct_InptChk01_Hdr, MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_DtlR> dest_ShipAct_InptChk01_Dtl, MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR> src0_0, MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR> src0_1){
			down_SA_v0_0(dest_ShipAct_InptChk01_Hdr, src0_0);
			down_SA_v0_1(dest_ShipAct_InptChk01_Dtl, src0_1);
		}

		/**
		 * 連携処理SA_v0の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SA_v0_0() {
			MCRowMapper map = new Map_down_SA_v0_0();
			return map;
		}

		/**
		 * 連携処理SA_v0の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SA_v0_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("err_flg", "err_flg");
			}
		}

		/**
		 * 連携処理SA_v0の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SA_v0_0(mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_HdrR r_dest, mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR r_src) {
		}

		/**
		 * 連携処理SA_v0の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SA_v0_0(MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_HdrR> dest, MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR> src) {
			MCRowMapper _rm = createMap_down_SA_v0_0();
			for(mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR r_src : src){
				mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_HdrR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SA_v0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理SA_v0の下りブロック1のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SA_v0_1() {
			MCRowMapper map = new Map_down_SA_v0_1();
			return map;
		}

		/**
		 * 連携処理SA_v0の下りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_down_SA_v0_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("err_flg", "err_flg");
			}
		}

		/**
		 * 連携処理SA_v0の下りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SA_v0_1(mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_DtlR r_dest, mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR r_src) {
		}

		/**
		 * 連携処理SA_v0の下りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SA_v0_1(MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_DtlR> dest, MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR> src) {
			MCRowMapper _rm = createMap_down_SA_v0_1();
			for(mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR r_src : src){
				mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SA_v0_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * ShipAct_InptChk02オペレーション.<p>
	 *
	 * 出荷実績の削除が可能かチェックをする。<br>
	 */
	abstract public class ShipAct_InptChk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipAct_InptChk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk02_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_CntrR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk02_HdrR> down0;
		
		/**
		 * 連携情報 SA<p>
		 *
		 * 連携先 mcframe.serverMSBE.MSBEL5540.MSBEL_ShipActService.ShipAct_Chk01 （{@link #v0}）<br>
		 */
		public final String SA = "SA";

		/**
		 * 連携オペレーション v0<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBE.MSBEL5540.MSBEL_ShipActService.ShipAct_Chk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR&gt; （{@link #v0_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR&gt; （{@link #v0_down0}）<br>
		 */
		public final mcframe.serverMSBE.MSBEL5540.MSBEL_ShipActService.ShipAct_Chk01 v0;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR> v0_up0;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR> v0_down0;
		
		// コンストラクタ
		protected ShipAct_InptChk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk02_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_CntrR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk02_HdrR.class);

			// 連携オペレーションの初期化
			v0 = mcframe.serverMSBE.MSBEL5540.MSBEL_ShipActService.crtShipAct_Chk01();
			
			// 連携オペレーションのコンテナ取得
			v0_up0 = (MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR>)v0.up(0);
			v0_down0 = (MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR>)v0.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(SA, v0);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * SA<br>
		 * up0() => MCList&lt;mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR&gt; （{@link #v0_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(SA)) {
				up_SA(v0_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * SA<br>
		 * MCList&lt;mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR&gt;（{@link #v0_down0}）=> down0()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(SA)) {
				down_SA(down0(), v0_down0);
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_ShipActService)MSBEL_ShipActService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ShipAct_InptChk02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk02_HdrR createShipAct_InptChk02_HdrR(){
			return mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk02_HdrR.create();
		}

		/**
		 * ShipAct_InptChk02_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk02_HdrR> createShipAct_InptChk02_HdrL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk02_HdrR.class);
		}

		/**
		 * ShipAct_InptChk02_CntrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_CntrR createShipAct_InptChk02_CntrR(){
			return mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_CntrR.create();
		}

		/**
		 * ShipAct_InptChk02_CntrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_CntrR> createShipAct_InptChk02_CntrL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_CntrR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk02_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_CntrR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk02_HdrR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipActService)MSBEL_ShipActService_MC_A.this).info;
		}

		//-----------------------SA専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSAの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SA(MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR> dest0_0, MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk02_HdrR> src_ShipAct_InptChk02_Hdr){
			up_SA_v0_0(dest0_0, src_ShipAct_InptChk02_Hdr);
		}
		
		/**
		 * 連携処理SA_v0の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_SA_v0_0() {
			MCRowMapper map = new Map_up_SA_v0_0();
			return map;
		}

		/**
		 * 連携処理SA_v0の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_SA_v0_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("ship_act_no", "ship_act_no");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
				addColumnPathMap("peg_no", "peg_no");
			}
		}

		/**
		 * 連携処理SA_v0の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_SA_v0_0(mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR r_dest, mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk02_HdrR r_src) {
		}

		/**
		 * 連携処理SA_v0の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_SA_v0_0(MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR> dest, MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk02_HdrR> src) {
			MCRowMapper _rm = createMap_up_SA_v0_0();
			for(mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk02_HdrR r_src : src){
				mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_SA_v0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------SA専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSAの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SA(MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk02_HdrR> dest_ShipAct_InptChk02_Hdr, MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR> src0_0){
			down_SA_v0_0(dest_ShipAct_InptChk02_Hdr, src0_0);
		}

		/**
		 * 連携処理SA_v0の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SA_v0_0() {
			MCRowMapper map = new Map_down_SA_v0_0();
			return map;
		}

		/**
		 * 連携処理SA_v0の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SA_v0_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("err_flg", "err_flg");
			}
		}

		/**
		 * 連携処理SA_v0の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SA_v0_0(mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk02_HdrR r_dest, mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR r_src) {
		}

		/**
		 * 連携処理SA_v0の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SA_v0_0(MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk02_HdrR> dest, MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR> src) {
			MCRowMapper _rm = createMap_down_SA_v0_0();
			for(mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR r_src : src){
				mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk02_HdrR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SA_v0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * ShipAct_RevUpd01オペレーション.<p>
	 *
	 * 出荷実績改訂履歴テーブルを更新する。改訂履歴データ更新用の共通処理（MAUCL5020）から呼び出される。<br>
	 */
	abstract public class ShipAct_RevUpd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation implements mcframe.serverMAUC.MAUCL5020.IfMAUCL_RevDataService_RevData_Upd01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipAct_RevUpd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR> up0;
		
		
		// コンストラクタ
		protected ShipAct_RevUpd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR.class);

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
			invoke((MSBEL_ShipActService)MSBEL_ShipActService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ShipAct_RevUpd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR createShipAct_RevUpd01_DtlR(){
			return mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR.create();
		}

		/**
		 * ShipAct_RevUpd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR> createShipAct_RevUpd01_DtlL(){
			return MCList.create(mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rev_data_src_no</td></tr>
		 * 	<tr><td><br></td><td>rev_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipActService)MSBEL_ShipActService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}