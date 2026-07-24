package mcframe.clientMSBC.MSBCP0290;

import java.util.List;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Window;

import mcframe.clientCore.fxgantt.design.MCXAGDesignMainControl;
import mcframe.clientCore.fxgantt.dialog.MCXAGDesignSettings;
import mcframe.clientCore.fxgantt.locale.MCXAGUserMessage;

public class MSBCP_ItmOrdGanttChart_Settings_MC extends MCXAGDesignSettings {

	// 親画面
	protected MSBCP_ItmOrdGanttChart panel;
	
	// ラベル
	protected String windowTitle = null;
	protected String backgroundColor = null;

	protected String acceptButtonTitle = null;
	protected String loadButtonTitle = null;
	protected String saveButtonTitle = null;
	protected String defaultButtonTitle = null;

	// ボタン
	protected Button acceptButton;
	protected Button loadButton;
	protected Button saveButton;
	protected Button defaultButton;

	/**
	 * コンストラクタ
	 */
	public MSBCP_ItmOrdGanttChart_Settings_MC(MSBCP_ItmOrdGanttChart aPanel) {
		super();
		panel = aPanel;
		windowTitle = panel.getDispString("gantt.Settings_windowTitle");
		backgroundColor = "fffff0";

		acceptButtonTitle = panel.getDispString("gantt.Settings_acceptButtonTitle");
		loadButtonTitle = panel.getDispString("gantt.Settings_loadButtonTitle");
		saveButtonTitle = panel.getDispString("gantt.Settings_saveButtonTitle");
		defaultButtonTitle = panel.getDispString("gantt.Settings_defaultButtonTitle");
	}

	/**
	 *  初期化
	 */
	public void init(Window aParentWindow,MCXAGDesignMainControl aMainControl) {
		mainControl = aMainControl;
		title = windowTitle;

		super.init(aParentWindow);
		initPane();

		rootPane.setStyle("-fx-background-color: #"+backgroundColor);
	}

	/**
	 *  ボタン初期化
	 */
	public void initButton(VBox buttonBox) {
		HBox hbox = new HBox(4);

		acceptButton = new Button(acceptButtonTitle);
		acceptButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				doApply();
			}
		});
		hbox.getChildren().add(acceptButton);

		loadButton = new Button(loadButtonTitle);
		loadButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				doApply();
			}
		});
		hbox.getChildren().add(loadButton);

		saveButton = new Button(saveButtonTitle);
		saveButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				doApply();
				close();
			}
		});
		hbox.getChildren().add(saveButton);

		defaultButton = new Button(defaultButtonTitle);
		defaultButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				doApply();
			}
		});
		hbox.getChildren().add(defaultButton);

		buttonBox.getChildren().add(hbox);
	}

	/**
	 *  初期表示の画面サイズ
	 */
	@Override
	public void setWindowSize() {
		super.setWindowSize2();
	}

	/**
	 *  設定項目一覧
	 */
	@Override
	public List<PropertyItem> getPropertyItemList() {
		return super.getPropertyItemList2();
	}

}
