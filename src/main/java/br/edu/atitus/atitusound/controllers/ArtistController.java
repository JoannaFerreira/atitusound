package br.edu.atitus.atitusound.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.atitus.atitusound.dtos.ArtistDTO;
import br.edu.atitus.atitusound.entities.ArtistEntity;
import br.edu.atitus.atitusound.services.ArtistService;
import br.edu.atitus.atitusound.services.GenericService;

@RestController
@RequestMapping("/artists")
public class ArtistController extends GenericController<ArtistEntity, ArtistDTO> {

	private final ArtistService artistService;

	public ArtistController(ArtistService artistService) {
		this.artistService = artistService;
	}

	protected ArtistEntity convertDTO2Entity(ArtistDTO dto) {
		ArtistEntity entity = new ArtistEntity();
		entity.setName(dto.getName());
		entity.setImage(dto.getImage());
		return entity;
	}

	@Override
	public GenericService<ArtistEntity> getService() {
		return artistService;
	}

}
