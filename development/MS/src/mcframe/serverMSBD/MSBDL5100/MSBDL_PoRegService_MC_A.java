package mcframe.serverMSBD.MSBDL5100;

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
 * "MSBDL_PoRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBDL_PoRegService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBD";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBDL5100";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBDL_PoRegService.Po_Ins01 aPo_Ins01;

	protected void initPo_Ins01() {
		this.info = PDef.MS_MSBDL5100_Po_Ins01_INFO;
		this.aPo_Ins01 = ((MSBDL_PoRegService)this).new Po_Ins01();
	}

	public static MSBDL_PoRegService.Po_Ins01 crtPo_Ins01() {
		MSBDL_PoRegService lgc = new MSBDL_PoRegService();
		lgc.initPo_Ins01();
		return lgc.aPo_Ins01;
	}

	protected void paramPo_Ins01(MCParam p) {
		if (this.aPo_Ins01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPo_Ins01.up0());
		p.addUpBlock(aPo_Ins01.up1());
		p.addUpBlock(aPo_Ins01.up2());
		p.addDownBlock(aPo_Ins01.down0());
		p.addDownBlock(aPo_Ins01.down1());
		p.addDownBlock(aPo_Ins01.down2());
	}

	protected void doPo_Ins01() {
		aPo_Ins01.call();
	};

	/**
	 * Po_Ins01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR createPo_Ins01_HdrR(){
		return mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR.create();
	}

	/**
	 * Po_Ins01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR> createPo_Ins01_HdrL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR.class);
	}

	/**
	 * Po_Ins01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR createPo_Ins01_DtlR(){
		return mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR.create();
	}

	/**
	 * Po_Ins01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR> createPo_Ins01_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR.class);
	}

	/**
	 * Po_Ins01_Bndl_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR createPo_Ins01_Bndl_DtlR(){
		return mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR.create();
	}

	/**
	 * Po_Ins01_Bndl_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR> createPo_Ins01_Bndl_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR.class);
	}
	protected MSBDL_PoRegService.Po_Upd01 aPo_Upd01;

	protected void initPo_Upd01() {
		this.info = PDef.MS_MSBDL5100_Po_Upd01_INFO;
		this.aPo_Upd01 = ((MSBDL_PoRegService)this).new Po_Upd01();
	}

	public static MSBDL_PoRegService.Po_Upd01 crtPo_Upd01() {
		MSBDL_PoRegService lgc = new MSBDL_PoRegService();
		lgc.initPo_Upd01();
		return lgc.aPo_Upd01;
	}

	protected void paramPo_Upd01(MCParam p) {
		if (this.aPo_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPo_Upd01.up0());
		p.addUpBlock(aPo_Upd01.up1());
		p.addUpBlock(aPo_Upd01.up2());
		p.addDownBlock(aPo_Upd01.down0());
		p.addDownBlock(aPo_Upd01.down1());
	}

	protected void doPo_Upd01() {
		aPo_Upd01.call();
	};

	/**
	 * Po_Upd01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR createPo_Upd01_HdrR(){
		return mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR.create();
	}

	/**
	 * Po_Upd01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR> createPo_Upd01_HdrL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR.class);
	}

	/**
	 * Po_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR createPo_Upd01_DtlR(){
		return mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR.create();
	}

	/**
	 * Po_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR> createPo_Upd01_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR.class);
	}

	/**
	 * Po_Upd01_Bndl_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR createPo_Upd01_Bndl_DtlR(){
		return mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR.create();
	}

	/**
	 * Po_Upd01_Bndl_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR> createPo_Upd01_Bndl_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR.class);
	}
	protected MSBDL_PoRegService.Po_Del01 aPo_Del01;

	protected void initPo_Del01() {
		this.info = PDef.MS_MSBDL5100_Po_Del01_INFO;
		this.aPo_Del01 = ((MSBDL_PoRegService)this).new Po_Del01();
	}

	public static MSBDL_PoRegService.Po_Del01 crtPo_Del01() {
		MSBDL_PoRegService lgc = new MSBDL_PoRegService();
		lgc.initPo_Del01();
		return lgc.aPo_Del01;
	}

	protected void paramPo_Del01(MCParam p) {
		if (this.aPo_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPo_Del01.up0());
		p.addUpBlock(aPo_Del01.up1());
		p.addUpBlock(aPo_Del01.up2());
		p.addDownBlock(aPo_Del01.down0());
		p.addDownBlock(aPo_Del01.down1());
	}

	protected void doPo_Del01() {
		aPo_Del01.call();
	};

	/**
	 * Po_Del01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR createPo_Del01_HdrR(){
		return mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR.create();
	}

	/**
	 * Po_Del01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR> createPo_Del01_HdrL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR.class);
	}

	/**
	 * Po_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR createPo_Del01_DtlR(){
		return mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR.create();
	}

	/**
	 * Po_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR> createPo_Del01_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR.class);
	}

	/**
	 * Po_Del01_Bndl_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR createPo_Del01_Bndl_DtlR(){
		return mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR.create();
	}

	/**
	 * Po_Del01_Bndl_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR> createPo_Del01_Bndl_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR.class);
	}
	protected MSBDL_PoRegService.Po_Chk01 aPo_Chk01;

	protected void initPo_Chk01() {
		this.info = PDef.MS_MSBDL5100_Po_Chk01_INFO;
		this.aPo_Chk01 = ((MSBDL_PoRegService)this).new Po_Chk01();
	}

	public static MSBDL_PoRegService.Po_Chk01 crtPo_Chk01() {
		MSBDL_PoRegService lgc = new MSBDL_PoRegService();
		lgc.initPo_Chk01();
		return lgc.aPo_Chk01;
	}

	protected void paramPo_Chk01(MCParam p) {
		if (this.aPo_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPo_Chk01.up0());
		p.addUpBlock(aPo_Chk01.up1());
		p.addUpBlock(aPo_Chk01.up2());
		p.addDownBlock(aPo_Chk01.down0());
		p.addDownBlock(aPo_Chk01.down1());
		p.addDownBlock(aPo_Chk01.down2());
	}

	protected void doPo_Chk01() {
		aPo_Chk01.call();
	};

	/**
	 * Po_Chk01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR createPo_Chk01_HdrR(){
		return mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR.create();
	}

	/**
	 * Po_Chk01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR> createPo_Chk01_HdrL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR.class);
	}

	/**
	 * Po_Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR createPo_Chk01_DtlR(){
		return mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR.create();
	}

	/**
	 * Po_Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR> createPo_Chk01_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR.class);
	}

	/**
	 * Po_Chk01_Dtl2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR createPo_Chk01_Dtl2R(){
		return mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR.create();
	}

	/**
	 * Po_Chk01_Dtl2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR> createPo_Chk01_Dtl2L(){
		return MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR.class);
	}
	protected MSBDL_PoRegService.Po_RevUpd01 aPo_RevUpd01;

	protected void initPo_RevUpd01() {
		this.info = PDef.MS_MSBDL5100_Po_RevUpd01_INFO;
		this.aPo_RevUpd01 = ((MSBDL_PoRegService)this).new Po_RevUpd01();
	}

	public static MSBDL_PoRegService.Po_RevUpd01 crtPo_RevUpd01() {
		MSBDL_PoRegService lgc = new MSBDL_PoRegService();
		lgc.initPo_RevUpd01();
		return lgc.aPo_RevUpd01;
	}

	protected void paramPo_RevUpd01(MCParam p) {
		if (this.aPo_RevUpd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPo_RevUpd01.up0());
	}

	protected void doPo_RevUpd01() {
		aPo_RevUpd01.call();
	};

	/**
	 * Po_RevUpd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR createPo_RevUpd01_DtlR(){
		return mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR.create();
	}

	/**
	 * Po_RevUpd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR> createPo_RevUpd01_DtlL(){
		return MCList.create(mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Po_Ins01オペレーション.<p>
	 *
	 * 発注情報を登録する。<br>
	 */
	abstract public class Po_Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Po_Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR> down2;
		
		
		// コンストラクタ
		protected Po_Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR.class);

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
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBDL_PoRegService)MSBDL_PoRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Po_Ins01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR createPo_Ins01_HdrR(){
			return mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR.create();
		}

		/**
		 * Po_Ins01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR> createPo_Ins01_HdrL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR.class);
		}

		/**
		 * Po_Ins01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR createPo_Ins01_DtlR(){
			return mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR.create();
		}

		/**
		 * Po_Ins01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR> createPo_Ins01_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR.class);
		}

		/**
		 * Po_Ins01_Bndl_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR createPo_Ins01_Bndl_DtlR(){
			return mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR.create();
		}

		/**
		 * Po_Ins01_Bndl_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR> createPo_Ins01_Bndl_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_ttl_amt</td></tr>
		 * 	<tr><td><br></td><td>bef_po_rev</td></tr>
		 * 	<tr><td><br></td><td>prnt_po_flg</td></tr>
		 * 	<tr><td><br></td><td>prnt_dlv_flg</td></tr>
		 * 	<tr><td><br></td><td>prnt_purc_ddlv_dlv_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_ship_form_cd</td></tr>
		 * 	<tr><td><br></td><td>po.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>po.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>po.purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>po.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>po.purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>po.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>po.sppl_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>po.sppl_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>po.sppl_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>po.sppl_addr1</td></tr>
		 * 	<tr><td><br></td><td>po.sppl_addr2</td></tr>
		 * 	<tr><td><br></td><td>po.sppl_addr3</td></tr>
		 * 	<tr><td><br></td><td>po.sppl_addr4</td></tr>
		 * 	<tr><td><br></td><td>po.sppl_tel</td></tr>
		 * 	<tr><td><br></td><td>po.sppl_fax</td></tr>
		 * 	<tr><td><br></td><td>po.po_dt</td></tr>
		 * 	<tr><td><br></td><td>po.upd_po_print_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>po.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>po.xrate</td></tr>
		 * 	<tr><td><br></td><td>po.xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>po.ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>po.ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>po.crct_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>po.po_print_cd</td></tr>
		 * 	<tr><td><br></td><td>po.wrk_no</td></tr>
		 * 	<tr><td><br></td><td>po.tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>po.tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>po.tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>po.tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>po.tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>po.tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>po.can_flg</td></tr>
		 * 	<tr><td><br></td><td>po.edi_flg</td></tr>
		 * 	<tr><td><br></td><td>po.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>po.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>po.po_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>po.dlv_slip_rmrks</td></tr>
		 * 	<tr><td><br></td><td>po.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>po.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>po.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>po.edi_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>po.edi_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>po.edi_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>po.edi_sub_char4</td></tr>
		 * 	<tr><td><br></td><td>po.edi_sub_char5</td></tr>
		 * 	<tr><td><br></td><td>po.edi_sub_num1</td></tr>
		 * 	<tr><td><br></td><td>po.edi_sub_dt1</td></tr>
		 * 	<tr><td><br></td><td>po.purc_if_flg</td></tr>
		 * 	<tr><td><br></td><td>po.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>po.ext_po_no</td></tr>
		 * 	<tr><td><br></td><td>po.dlv_slip_form_cd</td></tr>
		 * 	<tr><td><br></td><td>po.sgl_form_flg</td></tr>
		 * 	<tr><td><br></td><td>indiv_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>pod.po_schd_no</td></tr>
		 * 	<tr><td><br></td><td>pod.disp_seq</td></tr>
		 * 	<tr><td><br></td><td>pod.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>pod.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>pod.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>pod.ver_no</td></tr>
		 * 	<tr><td><br></td><td>pod.itm_nm</td></tr>
		 * 	<tr><td><br></td><td>pod.iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>pod.sno1</td></tr>
		 * 	<tr><td><br></td><td>pod.sno2</td></tr>
		 * 	<tr><td><br></td><td>pod.sno3</td></tr>
		 * 	<tr><td><br></td><td>pod.sno4</td></tr>
		 * 	<tr><td><br></td><td>pod.purc_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>pod.sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>pod.sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>pod.ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.maker_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>pod.in_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>pod.dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>pod.dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>pod.dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>pod.dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>pod.dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>pod.dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>pod.dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>pod.dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>pod.dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>pod.tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.tdlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>pod.tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>pod.tdlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>pod.tdlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>pod.tdlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.tdlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>pod.tdlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>pod.tdlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>pod.tdlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>pod.tdlv_tel</td></tr>
		 * 	<tr><td><br></td><td>pod.tdlv_fax</td></tr>
		 * 	<tr><td><br></td><td>pod.dlv_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>pod.purc_lt</td></tr>
		 * 	<tr><td><br></td><td>pod.rqst_dlv_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>pod.purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>pod.rqst_avl_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>pod.sync_flg</td></tr>
		 * 	<tr><td><br></td><td>pod.purc_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>pod.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pod.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pod.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.interim_flg</td></tr>
		 * 	<tr><td><br></td><td>pod.upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>pod.trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>pod.trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>pod.trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>pod.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>pod.trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>pod.trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>pod.trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pod.trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>pod.dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>pod.tax_cd</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>pod.wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>pod.wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>pod.drct_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>pod.mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>pod.bndl_flg</td></tr>
		 * 	<tr><td><br></td><td>pod.outsrc_itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>pod.outsrc_flg</td></tr>
		 * 	<tr><td><br></td><td>pod.uplnd_flg</td></tr>
		 * 	<tr><td><br></td><td>pod.schd_chg_flg</td></tr>
		 * 	<tr><td><br></td><td>pod.po_conf_rcpt_flg</td></tr>
		 * 	<tr><td><br></td><td>pod.po_conf_rcpt_dt</td></tr>
		 * 	<tr><td><br></td><td>pod.pri_print_flg</td></tr>
		 * 	<tr><td><br></td><td>pod.dlv_slip_invalid_flg</td></tr>
		 * 	<tr><td><br></td><td>pod.pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>pod.slo_no</td></tr>
		 * 	<tr><td><br></td><td>pod.slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>pod.io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>pod.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pod.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pod.po_print_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pod.dlv_slip_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pod.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>pod.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>pod.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>pod.edi_sub_d_char1</td></tr>
		 * 	<tr><td><br></td><td>pod.edi_sub_d_char2</td></tr>
		 * 	<tr><td><br></td><td>pod.edi_sub_d_char3</td></tr>
		 * 	<tr><td><br></td><td>pod.edi_sub_d_char4</td></tr>
		 * 	<tr><td><br></td><td>pod.edi_sub_d_char5</td></tr>
		 * 	<tr><td><br></td><td>pod.edi_sub_d_num1</td></tr>
		 * 	<tr><td><br></td><td>pod.edi_sub_d_dt1</td></tr>
		 * 	<tr><td><br></td><td>pod.rqst_can_flg</td></tr>
		 * 	<tr><td><br></td><td>pod.ext_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>pod.purc_basis_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd_no</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>po.po_no</td></tr>
		 * 	<tr><td><br></td><td>po.po_rev</td></tr>
		 * 	<tr><td><br></td><td>po.aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>po.aprv_no</td></tr>
		 * 	<tr><td><br></td><td>po.aprv_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>pod.po_d_no</td></tr>
		 * 	<tr><td><br></td><td>pod.po_no</td></tr>
		 * 	<tr><td><br></td><td>pod.po_rev</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_seq</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_rev</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_mng_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_mng_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_rev</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PoRegService)MSBDL_PoRegService_MC_A.this).info;
		}


	}
	/**
	 * Po_Upd01オペレーション.<p>
	 *
	 * 発注情報を訂正する。<br>
	 */
	abstract public class Po_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Po_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR> down1;
		
		
		// コンストラクタ
		protected Po_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR.class);

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
			invoke((MSBDL_PoRegService)MSBDL_PoRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Po_Upd01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR createPo_Upd01_HdrR(){
			return mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR.create();
		}

		/**
		 * Po_Upd01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR> createPo_Upd01_HdrL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR.class);
		}

		/**
		 * Po_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR createPo_Upd01_DtlR(){
			return mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR.create();
		}

		/**
		 * Po_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR> createPo_Upd01_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR.class);
		}

		/**
		 * Po_Upd01_Bndl_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR createPo_Upd01_Bndl_DtlR(){
			return mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR.create();
		}

		/**
		 * Po_Upd01_Bndl_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR> createPo_Upd01_Bndl_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_ttl_amt</td></tr>
		 * 	<tr><td><br></td><td>bef_po_rev</td></tr>
		 * 	<tr><td><br></td><td>prnt_po_flg</td></tr>
		 * 	<tr><td><br></td><td>prnt_dlv_flg</td></tr>
		 * 	<tr><td><br></td><td>prnt_purc_ddlv_dlv_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_ship_form_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_rvrs_flg</td></tr>
		 * 	<tr><td><br></td><td>po.po_no</td></tr>
		 * 	<tr><td><br></td><td>po.po_rev</td></tr>
		 * 	<tr><td><br></td><td>po.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>po.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>po.purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>po.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>po.purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>po.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>po.sppl_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>po.sppl_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>po.sppl_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>po.sppl_addr1</td></tr>
		 * 	<tr><td><br></td><td>po.sppl_addr2</td></tr>
		 * 	<tr><td><br></td><td>po.sppl_addr3</td></tr>
		 * 	<tr><td><br></td><td>po.sppl_addr4</td></tr>
		 * 	<tr><td><br></td><td>po.sppl_tel</td></tr>
		 * 	<tr><td><br></td><td>po.sppl_fax</td></tr>
		 * 	<tr><td><br></td><td>po.po_dt</td></tr>
		 * 	<tr><td><br></td><td>po.upd_po_print_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>po.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>po.xrate</td></tr>
		 * 	<tr><td><br></td><td>po.xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>po.ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>po.ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>po.crct_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>po.po_print_cd</td></tr>
		 * 	<tr><td><br></td><td>po.wrk_no</td></tr>
		 * 	<tr><td><br></td><td>po.tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>po.tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>po.tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>po.tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>po.tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>po.tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>po.can_flg</td></tr>
		 * 	<tr><td><br></td><td>po.edi_flg</td></tr>
		 * 	<tr><td><br></td><td>po.aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>po.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>po.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>po.po_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>po.dlv_slip_rmrks</td></tr>
		 * 	<tr><td><br></td><td>po.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>po.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>po.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>po.edi_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>po.edi_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>po.edi_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>po.edi_sub_char4</td></tr>
		 * 	<tr><td><br></td><td>po.edi_sub_char5</td></tr>
		 * 	<tr><td><br></td><td>po.edi_sub_num1</td></tr>
		 * 	<tr><td><br></td><td>po.edi_sub_dt1</td></tr>
		 * 	<tr><td><br></td><td>po.dlv_slip_form_cd</td></tr>
		 * 	<tr><td><br></td><td>po.sgl_form_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>only_upd_pod_flg</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>bef_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>pod.po_d_no</td></tr>
		 * 	<tr><td><br></td><td>pod.po_no</td></tr>
		 * 	<tr><td><br></td><td>pod.po_rev</td></tr>
		 * 	<tr><td><br></td><td>pod.po_schd_no</td></tr>
		 * 	<tr><td><br></td><td>pod.disp_seq</td></tr>
		 * 	<tr><td><br></td><td>pod.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>pod.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>pod.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>pod.ver_no</td></tr>
		 * 	<tr><td><br></td><td>pod.itm_nm</td></tr>
		 * 	<tr><td><br></td><td>pod.iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>pod.sno1</td></tr>
		 * 	<tr><td><br></td><td>pod.sno2</td></tr>
		 * 	<tr><td><br></td><td>pod.sno3</td></tr>
		 * 	<tr><td><br></td><td>pod.sno4</td></tr>
		 * 	<tr><td><br></td><td>pod.purc_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>pod.sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>pod.sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>pod.ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.maker_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>pod.in_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>pod.dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>pod.dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>pod.dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>pod.dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>pod.dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>pod.dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>pod.dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>pod.dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>pod.dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>pod.tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.tdlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>pod.tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>pod.tdlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.tdlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>pod.tdlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>pod.tdlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>pod.tdlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>pod.tdlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>pod.tdlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>pod.tdlv_tel</td></tr>
		 * 	<tr><td><br></td><td>pod.tdlv_fax</td></tr>
		 * 	<tr><td><br></td><td>pod.dlv_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>pod.purc_lt</td></tr>
		 * 	<tr><td><br></td><td>pod.rqst_dlv_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>pod.rqst_avl_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>pod.purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>pod.sync_flg</td></tr>
		 * 	<tr><td><br></td><td>pod.purc_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>pod.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pod.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pod.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.interim_flg</td></tr>
		 * 	<tr><td><br></td><td>pod.upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>pod.trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>pod.trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>pod.trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>pod.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>pod.trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>pod.trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>pod.trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pod.trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>pod.dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>pod.tax_cd</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>pod.wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>pod.wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>pod.drct_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>pod.mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>pod.bndl_flg</td></tr>
		 * 	<tr><td><br></td><td>pod.outsrc_itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>pod.outsrc_flg</td></tr>
		 * 	<tr><td><br></td><td>pod.uplnd_flg</td></tr>
		 * 	<tr><td><br></td><td>pod.schd_chg_flg</td></tr>
		 * 	<tr><td><br></td><td>pod.po_conf_rcpt_flg</td></tr>
		 * 	<tr><td><br></td><td>pod.po_conf_rcpt_dt</td></tr>
		 * 	<tr><td><br></td><td>pod.pri_print_flg</td></tr>
		 * 	<tr><td><br></td><td>pod.dlv_slip_invalid_flg</td></tr>
		 * 	<tr><td><br></td><td>pod.pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>pod.slo_no</td></tr>
		 * 	<tr><td><br></td><td>pod.slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>pod.io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>pod.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pod.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pod.po_print_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pod.dlv_slip_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pod.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>pod.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>pod.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>pod.edi_sub_d_char1</td></tr>
		 * 	<tr><td><br></td><td>pod.edi_sub_d_char2</td></tr>
		 * 	<tr><td><br></td><td>pod.edi_sub_d_char3</td></tr>
		 * 	<tr><td><br></td><td>pod.edi_sub_d_char4</td></tr>
		 * 	<tr><td><br></td><td>pod.edi_sub_d_char5</td></tr>
		 * 	<tr><td><br></td><td>pod.edi_sub_d_num1</td></tr>
		 * 	<tr><td><br></td><td>pod.edi_sub_d_dt1</td></tr>
		 * 	<tr><td><br></td><td>pod.rqst_can_flg</td></tr>
		 * 	<tr><td><br></td><td>pod.purc_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_rem_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_rem_abort_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd_no</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>po.po_rev</td></tr>
		 * 	<tr><td><br></td><td>po.aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>po.aprv_no</td></tr>
		 * 	<tr><td><br></td><td>po.aprv_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>pod.po_d_no</td></tr>
		 * 	<tr><td><br></td><td>pod.po_no</td></tr>
		 * 	<tr><td><br></td><td>pod.po_rev</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_seq</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_rev</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_mng_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_mng_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_rev</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PoRegService)MSBDL_PoRegService_MC_A.this).info;
		}


	}
	/**
	 * Po_Del01オペレーション.<p>
	 *
	 * 発注情報を取り消す<br>
	 */
	abstract public class Po_Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Po_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR> down1;
		
		
		// コンストラクタ
		protected Po_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR.class);

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
			invoke((MSBDL_PoRegService)MSBDL_PoRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Po_Del01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR createPo_Del01_HdrR(){
			return mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR.create();
		}

		/**
		 * Po_Del01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR> createPo_Del01_HdrL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR.class);
		}

		/**
		 * Po_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR createPo_Del01_DtlR(){
			return mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR.create();
		}

		/**
		 * Po_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR> createPo_Del01_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR.class);
		}

		/**
		 * Po_Del01_Bndl_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR createPo_Del01_Bndl_DtlR(){
			return mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR.create();
		}

		/**
		 * Po_Del01_Bndl_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR> createPo_Del01_Bndl_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>prnt_purc_ddlv_dlv_flg</td></tr>
		 * 	<tr><td><br></td><td>po.po_no</td></tr>
		 * 	<tr><td><br></td><td>po.po_rev</td></tr>
		 * 	<tr><td><br></td><td>po.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>po.po_print_cd</td></tr>
		 * 	<tr><td><br></td><td>po.crct_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>po.edi_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>pod.po_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PoRegService)MSBDL_PoRegService_MC_A.this).info;
		}


	}
	/**
	 * Po_Chk01オペレーション.<p>
	 *
	 * 更新前チェック<br>
	 */
	abstract public class Po_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Po_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR> down2;
		
		
		// コンストラクタ
		protected Po_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR.class);

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
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBDL_PoRegService)MSBDL_PoRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Po_Chk01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR createPo_Chk01_HdrR(){
			return mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR.create();
		}

		/**
		 * Po_Chk01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR> createPo_Chk01_HdrL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR.class);
		}

		/**
		 * Po_Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR createPo_Chk01_DtlR(){
			return mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR.create();
		}

		/**
		 * Po_Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR> createPo_Chk01_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR.class);
		}

		/**
		 * Po_Chk01_Dtl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR createPo_Chk01_Dtl2R(){
			return mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR.create();
		}

		/**
		 * Po_Chk01_Dtl2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR> createPo_Chk01_Dtl2L(){
			return MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>po.po_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>pod.po_no</td></tr>
		 * 	<tr><td><br></td><td>pod.po_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>outsrc_itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR> up2() {
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
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>po.po_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR> down0() {
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
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>pod.po_no</td></tr>
		 * 	<tr><td><br></td><td>pod.po_d_no</td></tr>
		 * 	<tr><td><br></td><td>uplnd_outsrc_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>outsrc_itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PoRegService)MSBDL_PoRegService_MC_A.this).info;
		}


	}
	/**
	 * Po_RevUpd01オペレーション.<p>
	 *
	 * 発注改訂履歴テーブルを更新する。改訂履歴データ更新用の共通処理（MAUCL5020）から呼び出される。<br>
	 */
	abstract public class Po_RevUpd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation implements mcframe.serverMAUC.MAUCL5020.IfMAUCL_RevDataService_RevData_Upd01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Po_RevUpd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR> up0;
		
		
		// コンストラクタ
		protected Po_RevUpd01() {
			
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
			invoke((MSBDL_PoRegService)MSBDL_PoRegService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Po_RevUpd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR createPo_RevUpd01_DtlR(){
			return mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR.create();
		}

		/**
		 * Po_RevUpd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR> createPo_RevUpd01_DtlL(){
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
			return ((MSBDL_PoRegService)MSBDL_PoRegService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}